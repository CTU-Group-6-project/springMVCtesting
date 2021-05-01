<!doctype html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <link rel="icon" href="images/jbravo_icon.ico" type="image/x-icon">
    <meta name="robots" content="index, follow">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta content="" name="description" />
    <meta content="" name="keywords" />
    <title>My Account | jBravo pizza</title>
    <!-- Fonts Here-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet" >
    <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:100,300,400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,500,500i,600,600i,700,700i,800" rel="stylesheet" >
   
    <!-- Fonts here-->
    <!-- Style Here -->
   
    <link rel="stylesheet" href="css/slick.css" >
    <link rel="stylesheet" href="css/style.css" >
    <link rel="stylesheet" href="css/my-account.css" >
    <link rel="stylesheet" href="css/font-awesome.min.css">

    <!-- bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css" >

    <!-- JS -->
    <script src="js/popper.min.js" defer></script>
    <script src="js/jquery.min.js" defer></script>
    <script src="js/bootstrap.min.js" defer></script>
</head>

<body class="my-account">
    <div class="wrapper">
        <!-- Header Start Here -->
        <header id="Header">
            <div class="main_header inner_page">
                <div class="top_nav" id="navbar">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="logo">
                                    <a href="index" title="jBravo Pizza"><img src="images/jBravo_logo_2.png" alt="jBravo Pizza"></a>
                                </div>
                                <div class="nav_manu">
                                    <div class="Menu_list">
                                        <ul class="menu">
                                            <li><a href="index" class="trans hvr-underline-from-left">Home</a></li>
                                            <li><a href="about" class="trans">About</a></li>
                                            <li><a href="menu" class="trans">Order</a></li>
                                            <li><a href="login" class="trans">Sign-In</a></li>
                                            <li><a href="login" class="trans">Sign-up</a></li>
                                        </ul>
                                    </div>
                                    <div class="Cart">
                                        <a href="cart" title="Cart">
                                            <span class="Cart_count">Cart : (0) $00.00</span>
                                            <!-- <i class="fa fa-shopping-cart" aria-hidden="true"></i> -->
                                            <img class="cart_img" src="/images/cart_1.png" alt="">
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <button id="burger" class="open-main-nav">
                    <span class="burger"></span>
                </button>
                <div class="H_banner">
                    <div class="main_pitch">
                        <h1 class="page_title">Pizza</h1>
                    </div>
                </div>
            </div>
            <div class="device">
                <nav class="main-nav" id="main-nav">
                    <div class="logo">
                        <a href="index" title="jBravo Pizza"><img src="images/jBravo_logo_2.png" alt="jBravo Pizza"></a>
                    </div>
                    <ul>
                        <li><a href="index">Home</a></li>
                        <li><a href="about">About</a></li>
                        <li><a href="menu">Order</a></li>
                        <li><a href="login">Sign-In</a></li>
                        <li><a href="login">Sign-up</a></li>
                    </ul>
                </nav>
            </div>
        </header>
        <!-- Header end Here -->
        <!-- breadcum section -->

        <div class="breadcum">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="main_breadcum">
                            <ul>
                                <li><a href="index" class="trans" title="Home">Home</a>
                                </li>
                                <li>Dash Board</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- breadcum section -->
        <!-- Our Menu section -->
        <!-- Our Menu section -->
        <section>
            <div class="Our_menu">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="main_Ourmenu">
                                <h2 class="title">Dashboard</h2>
                                <div class="content_menu myaccount_bottom_pitch">
                                    <div class="main_bpitch">
                                        <ul class="nav nav-tabs" role="tablist">
                                            <li class="nav-item pizza">
                                                <a class="nav-link active trans" data-toggle="tab" href="#Dashboard" title="Dashboard"> <span class="icon">Dashboard</span>
                                                </a>
                                            </li>
                                            <li class="nav-item burger1">
                                                <a class="nav-link trans" data-toggle="tab" href="#Myorders" title="Myorders"> <span class="icon">My orders</span>
                                                </a>
                                            </li>
                                            <li class="nav-item Salads">
                                                <a class="nav-link trans" data-toggle="tab" href="#Profiles" title="Profiles"> <span class="icon">Profiles</span>
                                                </a>
                                            </li>
                                            <li class="nav-item Desserts">
                                                <a class="nav-link trans" data-toggle="tab" href="#BillingAddress" title="BillingAddress"> <span class="icon">Billing Address</span>
                                                </a>
                                            </li>
                                            <li class="nav-item Beverages">
                                                <a class="nav-link trans" data-toggle="tab" href="#Savedcards" title="Savedcards"> <span class="icon">Saved cards</span>
                                                </a>
                                            </li>
                                            <li class="nav-item drink">
                                                <a class="nav-link trans" data-toggle="tab" href="#ServiceRequests" title="ServiceRequests"> <span class="icon">Service Requests</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-content">
                        <div id="Dashboard" class="tab-pane active">
                            <div class="row">
                                <div class="col-lg-7 col-md-6 col-sm-12 col-xs-12">
                                    <div class="profile-overview P_itmesbox">
                                        <div class="profile-content">
                                            <img class="mr-3" src="/images/jBravo.jpg" alt="steam">
                                            <div class="media-body">
                                                <h4>jBravo</h4>
                                                <p>francis.grove@student.ctuonline.edu</p>
                                                <p>855 230 0555</p>
                                                <p>20, floor, Restaurant Food & Beverages, Nr, Queenslad Victoria Building, USA</p>
                                            </div>
                                        </div>
                                        <div class="profile-content-footer Myorder-card"><a href="#" class="squre-btn hvr-ripple-out">EDIT</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-5 col-md-6 col-sm-12 col-xs-12">
                                    <div class="offer P_itmesbox">
                                        <div class="user-profile">
                                            <h5>Offers For You</h5>
                                            <div class="offer-body">
                                                <div class="offer-entry">
                                                    <div class="offer-rate">
                                                        <p>25% OFF</p>
                                                        <div class="button-border"></div>
                                                    </div>
                                                    <div class="offer-detail Myorder-card">
                                                        <p>Get 25% OFF on Lunch when you pay with your Bank of America Credit Card.
                                                            <br> <a href="#" class="squre-btn hvr-ripple-out">Order Now</a>
                                                        </p>
                                                    </div>
                                                </div>
                                                <div class="offer-entry">
                                                    <div class="offer-rate">
                                                        <p>35% OFF</p>
                                                        <div class="button-border"></div>
                                                    </div>
                                                    <div class="offer-detail Myorder-card">
                                                        <p>Get 35% OFF on Dinner when you pay with your SBI Credit Card.
                                                            <br> <a href="#" class="squre-btn hvr-ripple-out">Order Now</a>
                                                        </p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-7 col-md-6 col-sm-12 col-xs-12">
                                    <table class="recentOrders table P_itmesbox">
                                        <thead>
                                            <tr>
                                                <th colspan="4">
                                                    <strong>Recent Orders</strong>
                                                </th>
                                            </tr>
                                        </thead>
                                        <tr>
                                            <td>#123</td>
                                            <td class="con">Confirmed</td>
                                            <td>7-5-19</td>
                                            <td><a href="#">details</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>#1245</td>
                                            <td class="fai">Failed</td>
                                            <td>8-5-19</td>
                                            <td><a href="#">details</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>#1</td>
                                            <td class="con">Confirmed</td>
                                            <td>9-5-19</td>
                                            <td><a href="#">details</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>#12</td>
                                            <td class="fai">Failed</td>
                                            <td>10-5-19</td>
                                            <td><a href="#">details</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>#12345</td>
                                            <td class="con">Confirmed</td>
                                            <td>11-5-19</td>
                                            <td><a href="#">details</a>
                                            </td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <div id="Myorders" class="tab-pane fade">
                            <div class="content_row">
                                <div class="pizza_items">
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="P_itmesbox Myorder-card">
                                                <div class="row">
                                                    <div class="col-lg-2 col-md-2 col-sm-12 col-xs-12">
                                                        <div class="PT_image"><img src="images/Pizza.png" class="" alt=""></div>
                                                    </div>
                                                    <div class="col-lg-7 col-md-7 col-sm-12 col-xs-12">
                                                        <div class="Myorder-card-content">
                                                            <div class="Myorder-card-text">
                                                                <h5>order number</h5>
                                                                <p>007</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>order type</h5>
                                                                <p>Woah Mama Pizza</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>size</h5>
                                                                <p>medium</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>ordered on</h5>
                                                                <p>8/5/2019 at 4:00pm</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>total Amount</h5>
                                                                <p>$10.00</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                                        <a href="#" class="hvr-float-shadow">Edit</a>
                                                        <a href="#" class="hvr-float-shadow">Delete</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="P_itmesbox Myorder-card">
                                                <div class="row">
                                                    <div class="col-lg-2 col-md-2 col-sm-12 col-xs-12">
                                                        <div class="PT_image"><img src="images/Pizza.png" class="" alt=""></div>
                                                    </div>
                                                    <div class="col-lg-7 col-md-7 col-sm-12 col-xs-12">
                                                        <div class="Myorder-card-content">
                                                            <div class="Myorder-card-text">
                                                                <h5>order number</h5>
                                                                <p>007</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>order type</h5>
                                                                <p>Woah Mama Pizza</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>size</h5>
                                                                <p>medium</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>ordered on</h5>
                                                                <p>8/5/2019 at 4:00pm</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>total Amount</h5>
                                                                <p>$10.00</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                                        <a href="#" class="hvr-float-shadow">Edit</a>
                                                        <a href="#" class="hvr-float-shadow">Delete</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="P_itmesbox Myorder-card">
                                                <div class="row">
                                                    <div class="col-lg-2 col-md-2 col-sm-12 col-xs-12">
                                                        <div class="PT_image"><img src="images/Pizza.png" class="" alt=""></div>
                                                    </div>
                                                    <div class="col-lg-7 col-md-7 col-sm-12 col-xs-12">
                                                        <div class="Myorder-card-content">
                                                            <div class="Myorder-card-text">
                                                                <h5>order number</h5>
                                                                <p>007</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>order type</h5>
                                                                <p>Woah Mama Pizza</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>size</h5>
                                                                <p>medium</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>ordered on</h5>
                                                                <p>8/5/2019 at 4:00pm</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>total Amount</h5>
                                                                <p>$10.00</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                                        <a href="#" class="hvr-float-shadow">Edit</a>
                                                        <a href="#" class="hvr-float-shadow">Delete</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="P_itmesbox Myorder-card">
                                                <div class="row">
                                                    <div class="col-lg-2 col-md-2 col-sm-12 col-xs-12">
                                                        <div class="PT_image"><img src="images/Pizza.png" class="" alt=""></div>
                                                    </div>
                                                    <div class="col-lg-7 col-md-7 col-sm-12 col-xs-12">
                                                        <div class="Myorder-card-content">
                                                            <div class="Myorder-card-text">
                                                                <h5>order number</h5>
                                                                <p>007</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>order type</h5>
                                                                <p>Woah Mama Pizza</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>size</h5>
                                                                <p>medium</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>ordered on</h5>
                                                                <p>8/5/2019 at 4:00pm</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>total Amount</h5>
                                                                <p>$10.00</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                                        <a href="#" class="hvr-float-shadow">Edit</a>
                                                        <a href="#" class="hvr-float-shadow">Delete</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="P_itmesbox Myorder-card">
                                                <div class="row">
                                                    <div class="col-lg-2 col-md-2 col-sm-12 col-xs-12">
                                                        <div class="PT_image"><img src="images/Pizza.png" class="" alt=""></div>
                                                    </div>
                                                    <div class="col-lg-7 col-md-7 col-sm-12 col-xs-12">
                                                        <div class="Myorder-card-content">
                                                            <div class="Myorder-card-text">
                                                                <h5>order number</h5>
                                                                <p>007</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>order type</h5>
                                                                <p>Woah Mama Pizza</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>size</h5>
                                                                <p>medium</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>ordered on</h5>
                                                                <p>8/5/2019 at 4:00pm</p>
                                                            </div>
                                                            <div class="Myorder-card-text">
                                                                <h5>total Amount</h5>
                                                                <p>$10.00</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
                                                        <a href="#" class="hvr-float-shadow">Edit</a>
                                                        <a href="#" class="hvr-float-shadow">Delete</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="Profiles" class="tab-pane fade">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="user-personal-info">
                                        <h5>Personal Information</h5>
                                        <div class="user-info-body">
                                            <form method="post" id="userpersonalinfo" action="thank-you">
                                                <div class="form-row">
                                                    <div class="form-group col-md-6">
                                                        <input name="fname" required="" placeholder="First Name" class="form-control" type="text">
                                                    </div>
                                                    <div class="form-group col-md-6">
                                                        <input name="lname" required="" placeholder="Last Name" class="form-control" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-12">
                                                        <input name="email" required="" placeholder="francis.grove@student.ctuonline.edu" class="form-control" type="email">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-12">
                                                        <input name="contact" required="" placeholder="Contact Number" class="form-control" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <h5 class="col-12">Date Of Birth</h5>
                                                    <div class="col-4 form-group">
                                                        <select class="form-control" name="day">
                                                            <option>Day</option>
                                                            <option>01</option>
                                                            <option>02</option>
                                                            <option>03</option>
                                                            <option>04</option>
                                                            <option>05</option>
                                                        </select>
                                                    </div>
                                                    <div class="col-4 form-group">
                                                        <select class="form-control" name="month">
                                                            <option>Month</option>
                                                            <option>01</option>
                                                            <option>02</option>
                                                            <option>03</option>
                                                            <option>04</option>
                                                            <option>05</option>
                                                        </select>
                                                    </div>
                                                    <div class="col-4 form-group">
                                                        <select class="form-control" name="year">
                                                            <option>Year</option>
                                                            <option>1990</option>
                                                            <option>1991</option>
                                                            <option>1992</option>
                                                            <option>1993</option>
                                                            <option>1994</option>
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-12">
                                                        <textarea placeholder="Your Current Address" id="current-address" name="currentaddress" class="form-control" rows="3"></textarea>
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-6">
                                                        <input name="zipcode" class="form-control" placeholder="Zip Code" type="text">
                                                    </div>
                                                    <div class="form-group col-6">
                                                        <input name="City" class="form-control" placeholder="City" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-6">
                                                        <input name="country" class="form-control" placeholder="Country" type="text">
                                                    </div>
                                                    <div class="form-group col-6">
                                                        <input name="state" class="form-control" placeholder="State" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-12">
                                                        <h5>Upload Photo</h5>
                                                        <input name="profile-pic" class="upload-pic form-control-file" type="file">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-12 text-center Myorder-card">
                                                        <button class="btn btn-theme btn-md PersonalInfoBtn hvr-float-shadow" type="submit">SAVE CHANGES</button>
                                                        <a class="btn btn-theme btn-md btn-wide hvr-float-shadow" href="#">CANCEL</a>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="user-change-password">
                                        <h5>Change Password</h5>
                                        <div class="change-password-body">
                                            <form method="post" id="changepasswordbody" action="thank-you">
                                                <div class="form-group">
                                                    <input placeholder="Old Password" class="form-control" name="oldpassword" type="password">
                                                </div>
                                                <div class="form-group">
                                                    <input placeholder="New Password" class="form-control" name="newpassword" type="password" id="newpassword">
                                                </div>
                                                <div class="form-group">
                                                    <input placeholder="Confirm Password" class="form-control" name="confirmpassword" type="password">
                                                </div>
                                                <div class="form-group text-center Myorder-card">
                                                    <button class="btn btn-theme btn-md changepasswordbtn hvr-float-shadow" type="submit">SAVE CHANGES</button>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="BillingAddress" class="tab-pane fade">
                            <div class="login_section">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <div class="main_login">
                                                <div class="login_left col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                                    <div class="login_box">
                                                        <h2 class="title">Billing Address</h2>
                                                        <a class="editBAbtn hvr-float-shadow" data-toggle="pill" href="#editBA">
  ADD
</a>
                                                        <div class="login_box_content">
                                                            <h5>ADDRESS</h5>
                                                            <p>20, floor, Restaurant Food & Beverages, Nr, Queenslad Victoria Building, USA</p>
                                                            <h5>PHONE NO.</h5>
                                                            <p>+88 123 1234 1234</p>
                                                            <h5>EMAIL</h5>
                                                            <p>contact@yourdomainname.com</p>
                                                            <br>
                                                        </div>
                                                        <div class="editBAform" id="editBA">
                                                            <form method="post" id="BillingAdd" action="thank-you">
                                                                <div class="login_form">
                                                                    <ul>
                                                                        <li>
                                                                            <label for="Address">Address</label>
                                                                            <textarea class="form-control" id="Address" name="address" title="Address" ></textarea>
                                                                        </li>
                                                                        <li>
                                                                            <label for="EmailAddress">Email Address</label>
                                                                            <input class="form-control" id="EmailAddres" name="emailaddress" title="Email Address" type="email">
                                                                        </li>
                                                                        <li>
                                                                            <label for="Password">Phone</label>
                                                                            <input class="form-control" title="Password" id="Password" name="password" type="password">
                                                                        </li>
                                                                        <li>
                                                                            <button type="submit" class="loginbutton red_btn trans BillingAddbtn hvr-float-shadow" name="Sign-In">Submit</button>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="signup_right col-lg-6 col-md-6 col-sm-12 col-xs-12">
                                                    <div class="login_box">
                                                        <h2 class="title">Shipping Address</h2>
                                                        <a class="editSAbtn hvr-float-shadow" data-toggle="pill" href="#editSA">  ADD</a>
                                                        <div class="login_box_content">
                                                            <h5>ADDRESS</h5>
                                                            <p>20, floor, Restaurant Food & Beverages, Nr, Queenslad Victoria Building, USA</p>

                                                            <h5>PHONE NO.</h5>
                                                            <p>+88 123 1234 1234</p>
                                                            <h5>EMAIL</h5>
                                                            <p>contact@yourdomainname.com</p>
                                                            <br>
                                                        </div>
                                                        <div class="" id="editSA">
                                                            <form method="post" id="ShippingAdd" action="thank-you">
                                                                <div class="login_form">
                                                                    <ul>
                                                                        <li>
                                                                            <label for="Address">Address</label>
                                                                            <textarea class="form-control" id="dress" name="address" title="Address"></textarea>
                                                                        </li>
                                                                        <li>
                                                                            <label for="EmailAddress">Email Address</label>
                                                                            <input class="form-control" id="EmailAddress" name="emailaddress" title="Email Address" type="email">
                                                                        </li>
                                                                        <li>
                                                                            <label for="Password">Password</label>
                                                                            <input class="form-control" title="Password" id="Pasword" name="password" type="password">
                                                                        </li>
                                                                        <li>
                                                                            <button type="submit" class="loginbutton red_btn trans ShippingAddbtn hvr-float-shadow" name="Sign-In">Submit</button>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="Savedcards" class="tab-pane fade">
                            <div class="row">
                                <div class="col-lg-6">
                                    <div class="card-entry P_itmesbox">
                                        <div class="right-top">
                                            <p><a href="#"><i class="fa fa-pencil" aria-hidden="true"></i></a><a href="#"><i class="fa fa-times" aria-hidden="true"></i></a></p>
                                        </div>
                                        <h4>XXXX XXXX XXXX 0666</h4>
                                        <p>Valid Thru 06/22</p>
                                        <div class="card-type">
                                            <p>Name On Card</p>
                                            <div class="left">
                                                <h4>jBravo </h4>
                                            </div>
                                            <div class="right">
                                                <img src="images/Visa.png" alt="Steam">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="card-entry P_itmesbox">
                                        <div class="right-top">
                                            <p><a href="#"><i class="fa fa-pencil" aria-hidden="true"></i></a><a href="#"><i class="fa fa-times" aria-hidden="true"></i></a></p>
                                        </div>
                                        <h4>XXXX XXXX XXXX 0667</h4>
                                        <p>Valid Thru 06/22</p>
                                        <div class="card-type">
                                            <p>Name On Card</p>
                                            <div class="left">
                                                <h4>jBravo </h4>
                                            </div>
                                            <div class="right">
                                                <img src="images/Visa.png" alt="Steam">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="card-entry P_itmesbox primary-card">
                                        <div class="right-top">
                                            <p><a href="#"><i class="fa fa-pencil" aria-hidden="true"></i></a><a href="#"><i class="fa fa-times" aria-hidden="true"></i></a></p>
                                        </div>
                                        <div class="clearfix"></div>
                                        <h4>XXXX XXXX XXXX 0666</h4>
                                        <p>Valid Thru 06/17</p>
                                        <div class="card-type">
                                            <p>Name On Card</p>
                                            <div class="left">
                                                <h4>jBravo </h4>
                                            </div>
                                            <div class="right">
                                                <img src="images/Visa.png" alt="Steam">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-6">
                                    <div class="user-add-card P_itmesbox">
                                        <h5>Add New Card</h5>
                                        <div class="user-add-card-body">
                                            <form method="post" id="AddNewCard" action="thank-you">
                                                <div class="form-row">
                                                    <div class="form-group col-12">
                                                        <input class="form-control" name="cardnumber" required="" placeholder="Card Number" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-12">
                                                        <input class="form-control" name="cardholdername" required="" placeholder="Cardholder Name" type="text">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group col-4">
                                                        <input class="form-control" name="validmonth" required="" placeholder="Expiry Month" type="text">
                                                    </div>
                                                    <div class="form-group col-4">
                                                        <input class="form-control" name="validyear" required="" placeholder="Expiry Year" type="text">
                                                    </div>
                                                    <div class="form-group col-4">
                                                        <input class="form-control" name="cvv" required="" placeholder="CVV" type="password">
                                                    </div>
                                                </div>
                                                <div class="form-row">
                                                    <div class="form-group mb-0 col-12 text-center">
                                                        <button type="submit" class="loginbutton red_btn trans AddNewCardbtn hvr-float-shadow" name="Sign-In">ADD CARD</button>
                                                    </div>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div id="ServiceRequests" class="tab-pane fade">
                            <div class="recent-complaint">
                                <h4>Service Requests</h4>
                                <div class="complaint-tabs">
                                    <ul class="nav nav-tabs">
                                        <li class="nav-item"><a data-toggle="tab" href="#active-complaint" class="nav-link text-center active" aria-expanded="false"><i class="icofont icofont-flash"></i> Active (3)</a></li>
                                        <li class="nav-item"><a data-toggle="tab" href="#resolved-complaint" class="nav-link text-center" aria-expanded="false"><i class="icofont icofont-history"></i> Resolved (5)</a></li>
                                    </ul>
                                </div>
                                <div class="tab-content">
                                    <div id="active-complaint" class="tab-pane fade active show">
                                        <p><a href="#"><span>Ticket #FOOD94285:</span> My Order was failed but ammount has been dedicted from my account.</a></p>
                                        <p><a href="#"><span>Ticket #FOOD94287:</span> My Order was failed but ammount has been dedicted from my account.</a></p>
                                        <p><a href="#"><span>Ticket #FOOD94295:</span> My Order was failed but ammount has been dedicted from my account.</a></p>
                                    </div>
                                    <div id="resolved-complaint" class="tab-pane fade">
                                        <p><a href="#"><span>Ticket #FOOD94295:</span> My Order was failed but ammount has been dedicted from my account.</a></p>
                                        <p><a href="#"><span>Ticket #FOOD94295:</span> My Order was failed but ammount has been dedicted from my account.</a></p>
                                        <p><a href="#"><span>Ticket #FOOD94295:</span> My Order was failed but ammount has been dedicted from my account.</a></p>
                                        <p><a href="#"><span>Ticket #FOOD94295:</span> My Order was failed but ammount has been dedicted from my account.</a></p>
                                        <p><a href="#"><span>Ticket #FOOD94295:</span> My Order was failed but ammount has been dedicted from my account.</a></p>
                                    </div>
                                </div>
                                <h4 class="mt-5">New Requests</h4>
                                <div class="submit-complaint">
                                    <form method="post" id="submitcomplaint" action="thank-you">
                                        <div class="form-row">
                                            <div class="form-group col-12">
                                                <input class="form-control" name="bookingid" placeholder="Booking Id E.g FOOD94285" type="text">
                                            </div>
                                        </div>
                                        <div class="form-row">
                                            <div class="form-group col-12">
                                                <input class="form-control" name="subject" placeholder="Subject" type="text">
                                            </div>
                                        </div>
                                        <div class="form-row">
                                            <div class="form-group col-12">
                                                <textarea class="form-control" rows="4" name="problem" placeholder="Your Issue"></textarea>
                                            </div>
                                        </div>
                                        <div class="form-row">
                                            <div class="form-group col-12 text-center Myorder-card">
                                                <button class="btn btn-theme btn-md btn-wide submitcomplaintbtn hvr-float-shadow" type="submit">SUBMIT REQUEST</button>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Our Menu section -->
        <!-- Quick Order Section -->
    <section>
        <div class="quick_order">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="main_quickorder">
                            <h3 class="title">Call Us for Quick Order</h3>
                            <div class="cntct typewriter-effect"><span class="call_desk"><a href="tel:855 230 0555" id="typewriter_num"></a></span></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Quick Order Section -->
    <!-- Footer Section here -->
    <footer>
        <div class="main_footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="M_footer">
                            <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 quick_links">
                              <div class="title">Quick Links</div>
                                <div class="main_cnt">
                                    <ul>
                                        <li><a href="about" class="trans" title="About us">About us</a>
                                        </li>
                                        <li><a href="questions" class="trans" title="Questions">Questions</a>
                                        </li>
                                        <li><a href="contactus" class="trans" title="Contacts">Contacts</a>
                                        </li>
                                        <li><a href="login" class="trans" title="Sign-In">Sign-In</a>
                                        </li>
                                        <li><a href="login" class="trans" title="Sign-up">Sign-up</a>
                                        </li>
                                        <li><a href="terms_conditions" class="trans" title="Terms and conditions">Terms and conditions</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12 location">
                                <div class="title">Our Location</div>
                                <div class="main_cnt"> <span class="address"><a href="#">Colorado Technical University, North Chestnut Street, Colorado Springs, CO</a></span> <span class="time1">Mon - Fri: 08:00 am - 10:00 pm</span> <span class="time2">Sat - Sun: 10:00 am - 11:00 pm<strong></strong></span> <span class="conact"><a href="tel:855 230 0555">(855) 230-0555</a></span>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 subscribe">
                                <div class="title">Subscribe Now!</div>
                                <div class="main_cnt">
                                    <p class="sbcr_label">Subscribe for our Whoa Mama newsletter to
                                        <br>get Daily offers and deals...
                                    </p>
                                    <form method="post" id="subscribeform" action="thank-you">
                                        <div class="sbcrb_input">
                                            <input type="text" name="subscribeemail" class="form-control" placeholder="Enter your email">
                                            <button class="subscribebutton send" name="getbutton" type="submit"></button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="F_footer">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="payment"> <span>Payment Options</span> <span class="pay_cards"><img src="images/paymentTypes.png" alt=""></span>
                        </div>
                        <div class="social">
                            <ul>
                                <li><a href="#" class="trans" title="Facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                                </li>
                                <li><a href="#" class="trans" title="Twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a>
                                </li>
                                <li><a href="#" class="trans" title="Google Plus"><i class="fa fa-google-plus" aria-hidden="true"></i></a>
                                </li>
                                <li><a href="#" class="trans" title="Instagram"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                                </li>
                                <li><a href="#" class="trans" title="Pinterest"><i class="fa fa-pinterest-p" aria-hidden="true"></i></a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="copyright">
    <p>© <a href="index" class="trans" title="jBravo Pizza">jBravo Pizza</a> <script type="text/javascript">document.write(new Date().getFullYear());</script>, All rights reserved By Mama </p>        </div>
    </footer>
    <!-- Footer Section here -->
    </div>
    <!-- JS Here -->
    <script src="js/custome.js" defer></script>
    <script src="js/slick.js" defer></script>
    <!-- JS Here -->
    <script src="js/jquery.validate.min.js" defer></script>
    <script>
        jQuery(document).ready(function() {
            jQuery("a.editBAbtn").click(function() {
                jQuery("#editBA").toggle();
            });
        });
        jQuery(document).ready(function() {
            jQuery("a.editSAbtn").click(function() {
                jQuery("#editSA").toggle();
            });
        });
    </script>
</body>

</html>