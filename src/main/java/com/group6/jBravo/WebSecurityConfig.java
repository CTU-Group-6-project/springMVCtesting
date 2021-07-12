package com.group6.jBravo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;
import java.sql.*;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	public static final String CREATE_USERS_TABLE_SQL = "CREATE TABLE users " +
			"(ID SERIAL PRIMARY KEY," +
			" username           TEXT    NOT NULL, " +
			" password        TEXT     NOT NULL, " +
			" enabled         boolean);";
	public static final String CREATE_AUTHORITIES_TABLE_SQL = "CREATE TABLE authorities " +
			"(ID SERIAL PRIMARY KEY," +
			" username           TEXT    NOT NULL, " +
			" authority          TEXT     NOT NULL );";
	public static final String CREATE_MENUITEMS_TABLE_SQL = "CREATE TABLE menuitems " +
			"(ID SERIAL PRIMARY KEY," +
			" imageName            TEXT    NOT NULL, " +
			" name                 TEXT    NOT NULL, " +
			" description          TEXT    NOT NULL, " +
			" priceSingleOrMedium  TEXT    NOT NULL, " +
			" priceLarge           TEXT    NOT NULL, " +
			" priceExtraLarge      TEXT    NOT NULL, " +
			" category             TEXT    NOT NULL, " +
			" sizes                TEXT    NOT NULL, " +
			" cartImageName        TEXT     NOT NULL);";
	public static final String ADD_USER_TO_USERS_PREFIX_SQL = "INSERT INTO users (username,password,enabled) VALUES ('";
	public static final String QUOTE_COMMAN_QUOTE_SEPARATOR = "', '";
	public static final String USER_ENABLED_AND_END = "', true);";

	public static final String ADD_AUTHORITY_TO_AUTHORITIES_SQL = "INSERT INTO authorities (username,authority) VALUES ('";
	public static final String AUTHORITY_END = "');";

	public static final String DEFAULT_USER = "user@home.com";
	public static final String DEFAULT_USER_PASSWORD = "$2y$12$SB1i7AWgwujOKLfQ2m6.Xuaqhu5qvfVd1Wi35QJuPKHzmGKKQUUvG"; //longpassword
	public static final String DEFAULT_USER_ROLE = "ROLE_USER";

	public static final String MANAGER_USER = "manager@jbravo.com";
	public static final String MANAGER_USER_PASSWORD = "$2y$12$Hg.8DBrj1jj.sOF7lKAIw.R3nJgxNccQcHLhaLS5zxWYuyApsU/uq"; //Jbravo^manager1
	public static final String MANAGER_USER_ROLE = "ROLE_ADMIN";

	public static final String ADD_DEFAULT_USER_TO_USERS_SQL = ADD_USER_TO_USERS_PREFIX_SQL + DEFAULT_USER +
			QUOTE_COMMAN_QUOTE_SEPARATOR + DEFAULT_USER_PASSWORD + USER_ENABLED_AND_END;

	public static final String ADD_DEFAULT_AUTHORITY_TO_AUTHORITIES_SQL = ADD_AUTHORITY_TO_AUTHORITIES_SQL + DEFAULT_USER +
			QUOTE_COMMAN_QUOTE_SEPARATOR + DEFAULT_USER_ROLE + AUTHORITY_END;

	public static final String ADD_MANAGER_USER_TO_USERS_SQL = ADD_USER_TO_USERS_PREFIX_SQL + MANAGER_USER +
			QUOTE_COMMAN_QUOTE_SEPARATOR + MANAGER_USER_PASSWORD + USER_ENABLED_AND_END;
	public static final String ADD_MANAGER_AUTHORITY_TO_AUTHORITIES_SQL = ADD_AUTHORITY_TO_AUTHORITIES_SQL + MANAGER_USER +
			QUOTE_COMMAN_QUOTE_SEPARATOR + MANAGER_USER_ROLE + AUTHORITY_END;


	public static final String DROP_USERS_TABLE = "DROP TABLE users;";
	public static final String DROP_AUTHORITIES_TABLE = "DROP TABLE authorities;";
	public static final String DROP_MENUITEMS_TABLE = "DROP TABLE menuitems;";
	public static final String JBDC_DRIVER = "org.postgresql.Driver";
	public static final String JBDC_URL = "jdbc:postgresql://localhost:5432/jbravo";
	public static final String JBDC_USERNAME = "postgres";
	public static final String JBDC_PASSWORD = "plSTmg11pg";

	private final ObjectMapper objectMapper = new ObjectMapper();

	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/", "/home","/images/**", "/css/**", "/js/**", "/fonts/**",
						"/about.html", "/contactus.html","/questions.html","/submenu.html",
						"/terms_conditions.html", "/thank-you.html", "/index.html").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.and()
			.logout()
				.permitAll();
	}

	@Bean
	@Override
		public JdbcDaoImpl userDetailsService() {

		JdbcDaoImpl jdbcDaoImpl = new JdbcDaoImpl();
		jdbcDaoImpl.setDataSource(dataSource);
		jdbcDaoImpl.setUsersByUsernameQuery("select username,password,enabled from users where username = ?");
		jdbcDaoImpl.setAuthoritiesByUsernameQuery("select username,authority from authorities where username = ?");
		try {
//			executeSQL(dataSource, DROP_USERS_TABLE);
//			executeSQL(dataSource, DROP_AUTHORITIES_TABLE);
//			executeSQL(dataSource, DROP_MENUITEMS_TABLE);
			if (!tableExists(dataSource,"users")) {
				System.out.println("creating users table");
				if (createTable(dataSource, CREATE_USERS_TABLE_SQL)) {
					System.out.println("Users table created successfully");
					if (executeSQL(dataSource, ADD_DEFAULT_USER_TO_USERS_SQL)) {
						System.out.println("default user added successfully");
					} else {
						System.out.println("Error: default user add failed");
					}
					if (executeSQL(dataSource, ADD_MANAGER_USER_TO_USERS_SQL)) {
						System.out.println("manager user added successfully");
					} else {
						System.out.println("Error: manager user add failed");
					}
				} else {
					System.out.println("Users table not created");
				}

			} else {
				System.out.println("Users table already exits");
			}
			if (!tableExists(dataSource,"authorities")) {
				System.out.println("creating authoritites table");
				if (createTable(dataSource, CREATE_AUTHORITIES_TABLE_SQL)) {
					System.out.println("Authorities table created successfully");
					if (executeSQL(dataSource, ADD_DEFAULT_AUTHORITY_TO_AUTHORITIES_SQL)) {
						System.out.println("default authority added successfully");
					} else {
						System.out.println("Error: default authority add failed");
					}
					if (executeSQL(dataSource, ADD_MANAGER_AUTHORITY_TO_AUTHORITIES_SQL)) {
						System.out.println("manager authority added successfully");
					} else {
						System.out.println("Error: manager authority add failed");
					}
				} else {
					System.out.println("Authorities table not created");
				}
			} else {
				System.out.println("Authorities table already exits");
			}
			if (!tableExists(dataSource,"menuitems")) {
				System.out.println("creating menuitems table");

				if (createTable(dataSource, CREATE_MENUITEMS_TABLE_SQL)) {
					System.out.println("menuitems table created successfully");
				} else {
					System.out.println("menuitems table not created");
				}

			} else {
				System.out.println("menuitems table already exits");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName()+": "+e.getMessage());
			System.exit(0);
		}
		return jdbcDaoImpl;
	}

	private boolean tableExists(DataSource dataSource, String tableName) throws SQLException, SQLException {
		DatabaseMetaData meta = dataSource.getConnection().getMetaData();
		ResultSet resultSet = meta.getTables(null, null, tableName, new String[] {"TABLE"});

		return resultSet.next();
	}

	private boolean executeSQL(DataSource dataSource, String sql) throws SQLException {
		Connection c = dataSource.getConnection();
		Statement stmt = null;
		try {
			stmt = c.createStatement();
			stmt.executeUpdate(sql);
			stmt.close();
			c.close();
		} catch ( Exception e ) {
			System.err.println ( e.getClass().getName()+": "+ e.getMessage() );
			return false;
		}
		return true;
	}

	private boolean createTable(DataSource dataSource, String sql) throws SQLException {
		return executeSQL(dataSource,sql);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder;
	}

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(JBDC_DRIVER);
		dataSource.setUrl(JBDC_URL);
		dataSource.setUsername(JBDC_USERNAME);
		dataSource.setPassword(JBDC_PASSWORD);
		System.out.println("Opened database successfully");
		return dataSource;
	}
}
