<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <link rel="icon" href="images/jbravo_icon.ico" type="image/x-icon">
    <meta name="robots" content="index, follow">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta content="" name="description" />
    <meta content="" name="keywords" />
    <title>My Cart | jBravo pizza</title>
    <!-- Fonts Here-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet" >
    <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:100,300,400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,400i,500,500i,600,600i,700,700i,800" rel="stylesheet">
    <!-- Fonts here-->
    
    <!-- Style Here -->
    <link rel="stylesheet" href="css/slick.css" >
    <link rel="stylesheet" href="css/style.css" >
    <link rel="stylesheet" href="css/font-awesome.min.css">

    <!-- bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css" >

    <!-- JS -->
    <script src="js/popper.min.js" defer></script>
    <script src="js/jquery.min.js" defer></script>
    <script src="js/bootstrap.min.js" defer></script>
</head>

<body>
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
                        <h1 class="page_title">My Cart</h1>
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
        <!-- Header Start Here -->

        <!-- breadcum section -->
        <div class="breadcum">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="main_breadcum">
                            <ul>
                                <li><a href="index" class="trans" title="Home">Home</a></li>
                                <li>Cart</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcum section -->
        <!-- Our cart section -->
        <section>
            <div class="main_cart">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="main_Ourmenu">
                                <h2 class="title">Cart</h2>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="cart_list">
                                <ul class="inner_cartlist">
                                    <li class="header">
                                        <div class="main_head">
                                            <div class="edit">&nbsp;</div>
                                            <div class="pro_name">
                                                <h4>Product</h4></div>
                                            <div class="pro_qty">
                                                <h4>Qty</h4></div>
                                            <div class="pro_price">
                                                <h4>Price</h4></div>
                                            <div class="pro_total">
                                                <h4>Total</h4></div>
                                        </div>
                                    </li>

                                    <li class="rows">
                                        <div class="edit">
                                            <div class="edit_div"><a href="#" class="trans del" title="Delete"><i class="fa fa-times" aria-hidden="true"></i></a><a href="#" class="trans edit_new" title="Edit"><i class="fa fa-pencil" aria-hidden="true"></i></a></div>
                                        </div>
                                        <div class="pro_name">
                                            <div class="products">
                                                <div class="pro_img"><img src="images/cartItem.png" class="absoImg" alt=""></div>
                                                <div class="pro_descr">
                                                    <h3 class="pro_title"><a href="#" title="Woah Mama Pizza" class="trans">Deluxe</a></h3>
                                                    <p class="pro_dtls">original & favorite specialty pizza topped</p>
                                                    <p class="size"><span class="size">Size :</span>Medium</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="pro_qty">
                                            <div class="number-input">

                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
                                                <input class="quantity" min="0" name="quantity" value="1" type="number">
                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>

                                            </div>
                                        </div>
                                        <div class="pro_price">
                                            <h4>$12.00</h4></div>
                                        <div class="pro_total">
                                            <h4>$12.00</h4></div>
                                    </li>
                                    <li class="rows">
                                        <div class="edit">
                                            <div class="edit_div"><a href="#" class="trans del" title="Delete"><i class="fa fa-times" aria-hidden="true"></i></a><a href="#" class="trans edit_new" title="Edit"><i class="fa fa-pencil" aria-hidden="true"></i></a></div>
                                        </div>
                                        <div class="pro_name">
                                            <div class="products">
                                                <div class="pro_img"><img src="images/cartItem.png" class="absoImg" alt=""></div>
                                                <div class="pro_descr">
                                                    <h3 class="pro_title"><a href="#" title="Woah Mama Pizza" class="trans">Veggie</a></h3>
                                                    <p class="pro_dtls">Veggie lovers rejoice! Pizza topped with mushrooms</p>
                                                    <p class="size"><span class="size">Size :</span>Medium</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="pro_qty">
                                            <div class="number-input">

                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
                                                <input class="quantity" min="0" name="quantity" value="1" type="number">
                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>

                                            </div>
                                        </div>
                                        <div class="pro_price">
                                            <h4>$12.00</h4></div>
                                        <div class="pro_total">
                                            <h4>$12.00</h4></div>
                                    </li>
                                    <li class="rows">
                                        <div class="edit">
                                            <div class="edit_div"><a href="#" class="trans del" title="Delete"><i class="fa fa-times" aria-hidden="true"></i></a><a href="#" class="trans edit_new" title="Edit"><i class="fa fa-pencil" aria-hidden="true"></i></a></div>
                                        </div>
                                        <div class="pro_name">
                                            <div class="products">
                                                <div class="pro_img"><img src="images/cartItem.png" class="absoImg" alt=""></div>
                                                <div class="pro_descr">
                                                    <h3 class="pro_title"><a href="#" title="Woah Mama Pizza" class="trans">Barbecue Chicken</a></h3>
                                                    <p class="pro_dtls">Tangy, rich, our homemade BBQ Chicken pizza</p>
                                                    <p class="size"><span class="size">Size :</span>Medium</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="pro_qty">
                                            <div class="number-input">

                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
                                                <input class="quantity" min="0" name="quantity" value="1" type="number">
                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>

                                            </div>
                                        </div>
                                        <div class="pro_price">
                                            <h4>$12.00</h4></div>
                                        <div class="pro_total">
                                            <h4>$12.00</h4></div>
                                    </li>
                                    <li class="rows">
                                        <div class="edit">
                                            <div class="edit_div"><a href="#" class="trans del" title="Delete"><i class="fa fa-times" aria-hidden="true"></i></a><a href="#" class="trans edit_new" title="Edit"><i class="fa fa-pencil" aria-hidden="true"></i></a></div>
                                        </div>
                                        <div class="pro_name">
                                            <div class="products">
                                                <div class="pro_img"><img src="images/cartItem.png" class="absoImg" alt=""></div>
                                                <div class="pro_descr">
                                                    <h3 class="pro_title"><a href="#" title="Woah Mama Pizza" class="trans">Egg-ceptional</a></h3>
                                                    <p class="pro_dtls">Enjoy breakfast anytime of the day! Our breakfast pizza</p>
                                                    <p class="size"><span class="size">Size :</span>Medium</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="pro_qty">
                                            <div class="number-input">

                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
                                                <input class="quantity" min="0" name="quantity" value="1" type="number">
                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>

                                            </div>
                                        </div>
                                        <div class="pro_price">
                                            <h4>$12.00</h4></div>
                                        <div class="pro_total">
                                            <h4>$12.00</h4></div>
                                    </li>
                                    <li class="rows">
                                        <div class="edit">
                                            <div class="edit_div"><a href="#" class="trans del" title="Delete"><i class="fa fa-times" aria-hidden="true"></i></a><a href="#" class="trans edit_new" title="Edit"><i class="fa fa-pencil" aria-hidden="true"></i></a></div>
                                        </div>
                                        <div class="pro_name">
                                            <div class="products">
                                                <div class="pro_img"><img src="images/cartItem.png" class="absoImg" alt=""></div>
                                                <div class="pro_descr">
                                                    <h3 class="pro_title"><a href="#" title="Woah Mama Pizza" class="trans">lunch Special Pizza</a></h3>
                                                    <p class="pro_dtls">one-topping pizza and a16 ounce drink Specialties.</p>
                                                    <p class="size"><span class="size">Size :</span>Medium</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="pro_qty">
                                            <div class="number-input">

                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
                                                <input class="quantity" min="0" name="quantity" value="1" type="number">
                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>

                                            </div>
                                        </div>
                                        <div class="pro_price">
                                            <h4>$12.00</h4></div>
                                        <div class="pro_total">
                                            <h4>$12.00</h4></div>
                                    </li>
                                    <li class="rows">
                                        <div class="edit">
                                            <div class="edit_div"><a href="#" class="trans del" title="Delete"><i class="fa fa-times" aria-hidden="true"></i></a><a href="#" class="trans edit_new" title="Edit"><i class="fa fa-pencil" aria-hidden="true"></i></a></div>
                                        </div>
                                        <div class="pro_name">
                                            <div class="products">
                                                <div class="pro_img"><img src="images/cartItem.png" class="absoImg" alt=""></div>
                                                <div class="pro_descr">
                                                    <h3 class="pro_title"><a href="#" title="Woah Mama Pizza" class="trans">Tuscan Roma</a></h3>
                                                    <p class="pro_dtls">Pizza with Roma Tomatoes, Spinach, Alfredo Sauce</p>
                                                    <p class="size"><span class="size">Size :</span>Medium</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="pro_qty">
                                            <div class="number-input">

                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
                                                <input class="quantity" min="0" name="quantity" value="1" type="number">
                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>

                                            </div>
                                        </div>
                                        <div class="pro_price">
                                            <h4>$12.00</h4></div>
                                        <div class="pro_total">
                                            <h4>$12.00</h4></div>
                                    </li>
                                    <li class="rows">
                                        <div class="edit">
                                            <div class="edit_div"><a href="#" class="trans del" title="Delete"><i class="fa fa-times" aria-hidden="true"></i></a><a href="#" class="trans edit_new" title="Edit"><i class="fa fa-pencil" aria-hidden="true"></i></a></div>
                                        </div>
                                        <div class="pro_name">
                                            <div class="products">
                                                <div class="pro_img"><img src="images/cartItem.png" class="absoImg" alt=""></div>
                                                <div class="pro_descr">
                                                    <h3 class="pro_title"><a href="#" title="Woah Mama Pizza" class="trans">Mac & Cheese</a></h3>
                                                    <p class="pro_dtls">Pizza with Macaroni and Cheese</p>
                                                    <p class="size"><span class="size">Size :</span>Medium</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="pro_qty">
                                            <div class="number-input">

                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepUp()" class="plus"></button>
                                                <input class="quantity" min="0" name="quantity" value="1" type="number">
                                                <button onclick="this.parentNode.querySelector('input[type=number]').stepDown()"></button>

                                            </div>
                                        </div>
                                        <div class="pro_price">
                                            <h4>$12.00</h4></div>
                                        <div class="pro_total">
                                            <h4>$12.00</h4></div>
                                    </li>

                                </ul>
                                <div class="coupan_block">
                                    <form method="post" id="couponform">
                                        <div class="coupan_code">
                                            <input type="text" name="Coupancode" class="form-control" placeholder="Coupon Code">
                                            <button type="submit" class="coupon-btn send trans hvr-ripple-out" name="coupon">Apply Coupon</button>
                                            <!-- <input type="submit" value="Apply Coupon" class="send trans"> -->
                                        </div>
                                    </form>
                                    <div class="Redio_diltype">
                                        <ul>
                                            <li>

                                                <input type="radio" id="Delivery" name="deliver_type" value="male" checked>
                                                <label for="Delivery">Delivery</label>
                                            </li>
                                            <li>
                                                <input type="radio" id="takeaway" name="deliver_type" value="female">
                                                <label for="takeaway">Take Away</label>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="checkout">
                                    <p class="order_dscr">Order with Delivery</p>
                                    <p class="order_total"><span>Total :</span> $156.00</p>
                                    <div class="btn_checkout">
                                        <a href="#" class="trans gray_btn hvr-ripple" title="Update Cart">Update Cart </a>
                                        <a href="checkout" class="trans red_btn squre-btn hvr-ripple-out" title="Proceed to Checkout">Proceed to Checkout</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Our cart section -->
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
                                <div class="col-lg-3 col-md-3 col-sm-6 col-xs-12 quick_links"><div class="title">Quick Links</div>
                                    <div class="main_cnt">
                                        <ul>
                                            <li><a href="about" class="trans" title="About us">About us</a></li>
                                            <li><a href="questions" class="trans" title="Questions">Questions</a></li>
                                            <li><a href="contactus" class="trans" title="Contacts">Contacts</a></li>
                                            <li><a href="login" class="trans" title="Sign-In">Sign-In</a></li>
                                            <li><a href="login" class="trans" title="Sign-up">Sign-up</a></li>
                                            <li><a href="terms_conditions" class="trans" title="Terms and conditions">Terms and conditions</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-lg-5 col-md-5 col-sm-6 col-xs-12 location">
                                    <div class="title">Our Location</div>
                                    <div class="main_cnt"> <span class="address"><a href="#">Colorado Technical University, North Chestnut Street, Colorado Springs, CO</a></span> <span class="time1">Mon - Fri: 08:00 am - 10:00 pm</span> <span class="time2">Sat - Sun: 10:00 am - 11:00 pm<strong></strong></span> <span class="conact"><a href="tel:855 230 0555">(855) 230-0555</a></span> </div>
                                </div>
                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 subscribe">
                                    <div class="title">Subscribe Now!</div>
                                    <div class="main_cnt">
                                        <p class="sbcr_label">Subscribe for our Whoa Mama newsletter to
                                            <br> get Daily offers and deals...</p>
                                        <form method="post" id="subscribeform" action="thank-you">
                                            <div class="sbcrb_input">
                                                <input type="text" name="subscribeemail" class="form-control" placeholder="Enter your email">
                                                <button class="subscribebutton send" name="getbutton" type="submit">
                                                </button>
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
                            <div class="payment"> <span>Payment Options</span> <span class="pay_cards"><img src="images/paymentTypes.png" alt=""></span> </div>
                            <div class="social">
                                <ul>
                                    <li><a href="#" class="trans" title="Facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                                    <li><a href="#" class="trans" title="Twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                                    <li><a href="#" class="trans" title="Google Plus"><i class="fa fa-google-plus" aria-hidden="true"></i></a></li>
                                    <li><a href="#" class="trans" title="Instagram"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                                    <li><a href="#" class="trans" title="Pinterest"><i class="fa fa-pinterest-p" aria-hidden="true"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copyright">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
    <p>?? <a href="index" class="trans" title="jBravo Pizza">jBravo Pizza</a> <script type="text/javascript">document.write(new Date().getFullYear());</script>, All rights reserved By Mama </p>                </div>
            </div>
        </footer>

        <!-- Footer Section here -->

    </div>
    <!-- JS Here -->
    <script src="js/custome.js" defer></script>
    <script src="js/slick.js" defer></script>
    <script src="js/jquery.validate.min.js" defer></script>
</body>

</html>