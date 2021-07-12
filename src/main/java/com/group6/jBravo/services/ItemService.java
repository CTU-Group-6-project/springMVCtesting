package com.group6.jBravo.services;

import com.group6.jBravo.WebSecurityConfig;
import com.group6.jBravo.models.OrderItem;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ItemService {

    public static final String ADD_MENUITEM_TO_MENUITEMS_PREFIX_SQL = "INSERT INTO menuitems (imageName,name,description,priceSingleOrMedium,priceLarge,priceExtraLarge,category,sizes,cartImageName) VALUES ('";
    public static final String QUOTE_COMMAND_QUOTE_SEPARATOR = "', '";
    public static final String END_QUOTE = "');";

    private DriverManagerDataSource dataSource;

    Connection c = null;
    Statement stmt = null;


    List<OrderItem> menuItems;

    public ItemService() throws SQLException {
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(WebSecurityConfig.JBDC_DRIVER);
        dataSource.setUrl(WebSecurityConfig.JBDC_URL);
        dataSource.setUsername(WebSecurityConfig.JBDC_USERNAME);
        dataSource.setPassword(WebSecurityConfig.JBDC_PASSWORD);
        createInitialMenuInDbIfNeeded();
        if (menuItems == null) {
            readMenuItemsFromDb();
        }
    }

    private void initDbConnection() throws SQLException {
        c = dataSource.getConnection();
        stmt = null;

    }

    private void closeDbConnection() throws SQLException {
        stmt.close();
        c.close();
    }

    private boolean executeSQL(String sql)  {
        try {
            stmt = c.createStatement();
            stmt.executeUpdate(sql);
        } catch ( Exception e ) {
            System.err.println ( e.getClass().getName()+": "+ e.getMessage() );
            return false;
        }
        return true;
    }

    private ResultSet executeSQLWithResult(String sql)  {
        ResultSet rs = null;
        try {
            stmt = c.createStatement();
            rs = stmt.executeQuery(sql);
        } catch ( Exception e ) {
            System.err.println ( e.getClass().getName()+": "+ e.getMessage() );
        }
        return rs;
    }

    private boolean tableEmpty(String tableName) throws SQLException {
        ResultSet resultSet = executeSQLWithResult("select count(*) C from "+ tableName + ";");
        if (resultSet.next()) {
            long v = resultSet.getLong("c");
            return v == 0l;
        }
        return false;
    }

    private void createInitialMenuInDbIfNeeded() throws SQLException {
        initDbConnection();
        if (tableEmpty("menuItems")) {
            System.out.println("Populating menuitems table with initial values");
            for (OrderItem orderItem : getInitialMenuItems()) {
                String sql = ADD_MENUITEM_TO_MENUITEMS_PREFIX_SQL +
                        orderItem.getImageName() + QUOTE_COMMAND_QUOTE_SEPARATOR +
                        orderItem.getName() + QUOTE_COMMAND_QUOTE_SEPARATOR +
                        orderItem.getDescription() + QUOTE_COMMAND_QUOTE_SEPARATOR +
                        orderItem.getPriceSingleOrMedium() + QUOTE_COMMAND_QUOTE_SEPARATOR +
                        orderItem.getPriceLarge() + QUOTE_COMMAND_QUOTE_SEPARATOR +
                        orderItem.getPriceExtraLarge() + QUOTE_COMMAND_QUOTE_SEPARATOR +
                        orderItem.getCategory() + QUOTE_COMMAND_QUOTE_SEPARATOR +
                        orderItem.getSizes() + QUOTE_COMMAND_QUOTE_SEPARATOR +
                        orderItem.getCartImageName() + END_QUOTE;
                System.out.println(sql);
                executeSQL(sql);
            }
        } else {
            System.out.println("MenuItems table already populated");
        }
        closeDbConnection();
    }

    private List<OrderItem> getInitialMenuItems() {

        List<OrderItem> listOfItems = new ArrayList<>();
        listOfItems.add(new OrderItem("1", "images/woahmama.png", "Woah Mama Pizza",
                "Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00", "12.00", "14.00",OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("2","images/Bacon-Cheeseburger.png", "BACON CHEESEBURGER",
                "Fresh-cooked juicy hamburger, bacon, cheddar cheese, onion, & mozzarella cheese.",
                "9.89", "12.00", "14.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("3", "images/BBQ-Blast.png","BBQ BLAST",
                "Juicy chicken with our BBQ sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon & mozzarella cheese.",
                "4.10", "12.00", "14.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("4", "images/Buffalo-Chicken.png","Buffalo Chicken",
                "Grilled chicken with our Buffalo sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00", "12.00", "14.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("5", "images/Chicken-Ranchero.png","Chicken Ranchero",
                "Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00", "12.00", "14.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("6", "images/Hog-Heaven.png","Hog Heaven",
                "Revved up with smoked ham, bacon, sausage, spicy smoked andouille, jalapeños, & mozzarella cheese.",
                "10.00", "12.00", "14.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("7", "images/Maui-Wowie.png","Maui Wowie",
                "A taste of the island life with sweet pineapple, smoked ham, bacon, & mozzarella cheese.",
                "10.00", "12.00", "14.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("8", "images/Mighty-Meaty.png","Mighty Meaty",
                "Loaded up with pepperoni, ham, bacon, hamburger, sausage, & mozzarella cheese.",
                "10.00", "12.00", "14.00", OrderItem.PIZZA_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("1001", "images/BBQ-Chicken-Flip-02.png", "BBQ-Chicken flip",
                "Juicy chicken with our BBQ sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon & mozzarella cheese.",
                "10.00", "12.00", "14.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"));
        listOfItems.add(new OrderItem("1002","images/Buffalo-Chicken-Flip-02.png", "Buffalo-Chicken Flip",
                "Grilled chicken with our Buffalo sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "10.00", "12.00", "14.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"));
        listOfItems.add(new OrderItem("1003", "images/Chicken-Ranchero-Flip-02.png","Chicken-Ranchero Flip",
                "Tender chicken with our Ranch sauce, cheddar cheese, onions, bell peppers, jalapeños, bacon, & mozzarella cheese.",
                "12.00", "14.00", "16.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"));
        listOfItems.add(new OrderItem("1004", "images/Ham-and-Cheese-Flip-02.png","Ham and Cheese Flip",
                "Filled with delicious ham and nacho cheese!",
                "15.00", "17.00", "19.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"));
        listOfItems.add(new OrderItem("1005", "images/Mighty-Meaty-Flip-02.png","Mighty Meaty Flip",
                "Tender ham, pepperoni, real bacon, 100% mozzarella cheese.",
                "10.00", "12.00", "14.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"));
        listOfItems.add(new OrderItem("1006", "images/Muffuletta-Flip-02.png","Muffuletta Flip",
                "Spicy salami, tender ham, mustard, olive mix and 100% mozzarella cheese!",
                "15.00", "17.00", "19.00", OrderItem.SANDWICH_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"));
        listOfItems.add(new OrderItem("4001", "images/margarita5.png", "WHO’S TO BLAME",
                "jBravo Gold Tequila, triple sec and our house margarita blend.",
                "10.00", "12.00", "14.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("4002","images/Margarita.png", "TOP SHELF MARGARITA",
                "jBravo Gold Tequila, Cointreau® Orange Liqueur, our house margarita blend topped with a Gran Gala® float. Excellent on the rocks.",
                "10.00", "12.00", "14.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("4003", "images/Margarita1.png","FINS TO THE LEFT",
                "jBravo Silver Tequila, blue curaçao and our house margarita blend.",
                "10.00", "12.00", "14.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("4004", "images/Drink6.png","LAST MANGO IN PARIS",
                "jBravo Last Mango Tequila, Cointreau® Orange Liqueur, our house margarita blend and cranberry juice. Served on the rocks.",
                "10.00", "12.00", "14.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("4005", "images/Drink8.png","GINGER CITRUS MARGARITA",
                "jBravo Gold Tequila, triple sec and our house ginger-infused margarita blend.",
                "10.00", "12.00", "14.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("4006", "images/drink9.png","WATERMELON MARGARITA",
                "jBravo Silver Tequila, triple sec, watermelon purée and our house margarita blend.",
                "10.00", "12.00", "14.00", OrderItem.BEVERAGE_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("2001", "images/Chicken-Bacon-Salad.png", "Chicken Bacon Salad",
                "Crisp fresh lettuce, chicken, bacon, cheddar, red onion, bell pepper, & tomato.",
                "10.00", "12.00", "14.00", OrderItem.SALAD_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"));
        listOfItems.add(new OrderItem("2002","images/Chef-Salad.png", "Chef Salad",
                "Crisp fresh lettuce, ham, turkey, cheddar, eggs, tomato, red onion, & cucumber.",
                "10.00", "12.00", "14.00", OrderItem.SALAD_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"));
        listOfItems.add(new OrderItem("2003", "images/Garden-Salad.png","Garden Salad",
                "Crisp fresh lettuce, tomato, cheddar, cucumber, & red onion.",
                "10.00", "12.00", "14.00", OrderItem.SALAD_CATEGORY, OrderItem.SINGLE_SIZE,"images/cartItem.png"));
        listOfItems.add(new OrderItem("3001", "images/Cinnamon-Sticks-600px.png", "CINNAMON STICKS",
                "Deep-pan crust topped with cinnamon, sugar & sweet frosting!",
                "10.00", "12.00", "14.00", OrderItem.DESSERT_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("3002", "images/Cookie-600px.png", "8″ CHOCOLATE CHIP COOKIE",
                "Soft 8-inch chocolate chip cookie dotted with softly melted chocolate chips in every bite.",
                "10.00", "12.00", "14.00", OrderItem.DESSERT_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("3003", "images/Peach-Puddin-Pie-600px.png", "PEACH PUDDIN’ PIE",
                "Yummy peaches baked into sweet pudding in a house-made crust. Baked fresh in house!",
                "10.00", "12.00", "14.00", OrderItem.DESSERT_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("3004", "images/ChocolateCake.png", "Molten Chocolate Cake",
                "Crinkle cut Desserts just look like a good time. They're thick and heavy",
                "10.00", "12.00", "14.00", OrderItem.DESSERT_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("3005", "images/ChocloateCookie.png", "Skillet Chocolate Chip Cookie",
                "Topped with vanilla ice cream, hot fudge.",
                "10.00", "12.00", "14.00", OrderItem.DESSERT_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("3005", "images/StawberryCheeseCake.png", "FRESH STRAWBERRY CHEESECAKE",
                "The Original Topped with Glazed Fresh Strawberries. Our Most Popular Flavor for Over 35 Years!",
                "10.00", "12.00", "14.00", OrderItem.DESSERT_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("3006", "images/CARAMELICIOUS.png", "CHOCOLATE CARAMELICIOUS",
                "Original Cheesecake Swirled with Snickers® on a Brownie Crust with Chocolate, Caramel and Peanuts.",
                "10.00", "12.00", "14.00", OrderItem.DESSERT_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        listOfItems.add(new OrderItem("3007", "images/CaramelAppleCheesecake.png", "CARAMEL APPLE CHEESECAKE",
                "Our Creamy Original Cheesecake Loaded with Caramel Apples, Topped with More Caramel on a Graham Crust.",
                "10.00", "12.00", "14.00", OrderItem.DESSERT_CATEGORY, OrderItem.THREE_SIZES,"images/cartItem.png"));
        return listOfItems;
    }

    private void readMenuItemsFromDb() throws SQLException {
        initDbConnection();
        ResultSet resultSet = executeSQLWithResult("select * from menuitems;");
        List<OrderItem> listOfItems = new ArrayList<>();
        //    (imageName,name,description,priceSingleOrMedium,priceLarge,priceExtraLarge,category,sizes,cartImageName) VALUES ('";
        //
        while (resultSet.next()) {
            listOfItems.add(new OrderItem(String.valueOf(resultSet.getLong("id")),
                    resultSet.getString("imageName"),
                    resultSet.getString("name"),
                    resultSet.getString("description"),
                    resultSet.getString("priceSingleOrMedium"),
                    resultSet.getString("priceLarge"),
                    resultSet.getString("priceExtraLarge"),
                    resultSet.getString("category"),
                    resultSet.getString("sizes"),
                    resultSet.getString("cartImageName")));
        }
        menuItems = listOfItems;
        closeDbConnection();
    }

    public List<OrderItem> getMenuItems() {
        return menuItems;
    }

        public OrderItem getItemById(String id) {

        Predicate<OrderItem> byId = p -> p.getId().equals(id);
        return filterItems(byId);
    }

    public OrderItem filterItems(Predicate<OrderItem> strategy) {
        return getMenuItems().stream().filter(strategy).findFirst().orElse(null);
    }
}
