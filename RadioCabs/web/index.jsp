<%-- 
    Document   : index
    Created on : Dec 18, 2015, 2:52:00 AM
    Author     : hungnguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="index" scope="session" class="Controller.Controller"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <meta name="description" content="SityCab is a taxi company responsive html template."/>
        <meta name="keywords" content="boostrap, responsive, html5, css3, jquery, theme, uikit, multicolor, parallax, retina, taxi business" />
        <meta name="author" content="daw" />
        <meta name="robots" content="index, follow" />
        <meta name="revisit-after" content="3 days" />	
        <title>Home</title>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet"/>
        <link href="assets/css/jquery-ui.css" rel="stylesheet"/>	
        <link href="assets/css/uikit.almost-flat.css" rel="stylesheet"/>	
        <link href="assets/css/owl.carousel.css" rel="stylesheet"/>
        <link href="assets/css/owl.theme.css" rel="stylesheet"/>	
        <link href="assets/css/quotes.css" rel="stylesheet"/>
        <link href="assets/css/product.css" rel="stylesheet"/>
        <link href="citycab.css" rel="stylesheet"/>
        <link href='assets/a.css' rel='stylesheet' type='text/css'/>
    </head>
    <body>
        <div class="page-wrapper" id="page-top">
            <header class="header-wrapper" id="header-wrapper" >
                <!-- Main Navigation  -->
                <div class="container main-navigation">
                    <div id="header" class="row">
                        <div class="col-md-12 col-pad-0">
                            <!-- Fixed navbar -->
                            <div class="navbar navbar-default navbar-fixed-top" role="navigation"> 
                                <!-- Brand and toggle get grouped -->
                                <div class="navbar-header">
                                    <a id="offcanvas-toggler" class="navbar-toggle" data-toggle="collapse"></a>
                                    <div class="navbar-brand">
                                        <a href="index.html"><img src="images/logo.png" alt="Logo"/></a>
                                    </div>
                                </div>
                                <h2 class="navbar-text navbar-right"><i class="glyphicon glyphicon-earphone glyphicon-align-left" aria-hidden="true"></i> +84.165.555.555</h2>
                                <div class="collapse navbar-collapse">
                                    <ul class="nav navbar-nav navbar-nav-center">
                                        <li class="active"><a href="index.html">home</a></li>
                                        <li><a href="about.html">about</a></li>
                                        <li data-uk-dropdown="" class="uk-parent">
                                            <a href="">more <i class="uk-icon-caret-down"></i></a>
                                            <div class="uk-dropdown uk-dropdown-navbar" style="">
                                                <ul class="uk-nav uk-nav-navbar">
                                                    <li><a href="">ABC</a></li>
                                                    <li><a href="">XYZ</a></li>
                                                    <li class="uk-nav-divider"></li>
                                                    <li><a href="">ABB</a></li>
                                                    <li><a href="">XYY</a></li>
                                                    <li class="uk-nav-divider"></li>
                                                    <li><a href="">ACC</a></li>
                                                    <li><a href="">ZXX</a></li>						  
                                                </ul>
                                            </div>
                                        </li>
                                        <li><a href="Login.html">Login</a></li>
                                    </ul>
                                </div><!--/.nav-collapse -->
                            </div>
                        </div>  
                    </div>
                </div>
                <!-- /Main Navigation -->
            </header>


            <!--<input type="text" class="form-signin" id="usename" placeholder="UserName" name="userName">
                                  <input type="password" class="form-signin" id="pass" placeholder="PassWord" name="passWord">
                                  <input type="submit" class="btn btn-primary" value="LogIn">
                                  <input type="submit" class="btn btn-primary" value="SignIn"> -->
            <!-- Gap -->
            <div id="taxiStripe" class="container-fluid gap-fullsize">
            </div>
            <!-- /Gap -->	  


            <!-- Choose Car -->
            <section class="choose-car" id="choose-car">
                <div class="container">
                    <div class="row">                        
                        <div class="col-md-12">
                           
                            <div>
                                <ul class="nav nav-tabs nav-tabs-center cc-nav-tabs">
                                    <li class="active"><a data-toggle="tab" href="#town-taxi">Driver</a></li>
                                    <li><a data-toggle="tab" href="#hybrid-taxi">Hybrid Taxi</a></li>
                                    <li><a data-toggle="tab" href="#limousine-taxi">Limousine Taxi</a></li>
                                </ul>
                                <div class="tab-content">
                                    <div id="town-taxi" class="tab-pane fade in active">
                                        <section class="taxis-sale" id="taxisSale">
                                            <div class="container">
                                                <div class="row">                        
                                                    <div class="col-md-12">
                                                        <div class="sprocket-tables">
                                                            <ul class="sprocket-tables-container cols-5">
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab1.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: New York
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 15 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 250 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab2.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: Chicago
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 9 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 380 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab3.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: London
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 18 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 130 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab4.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: Los Angeles
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 12 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 520 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab5.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: London
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 12 000		
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 275 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                            </ul>
                                                        </div>						  
                                                    </div>
                                                </div>		
                                            </div>
                                        </section>
                                    </div>
                                    <div id="hybrid-taxi" class="tab-pane fade">
                                        <section class="taxis-sale" id="taxisSale">
                                            <div class="container">
                                                <div class="row">                        
                                                    <div class="col-md-12">
                                                        <div class="sprocket-tables">
                                                            <ul class="sprocket-tables-container cols-5">
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab1.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: New York
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 15 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 250 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab2.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: Chicago
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 9 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 380 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab3.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: London
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 18 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 130 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab4.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: Los Angeles
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 12 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 520 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab5.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: London
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 12 000		
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 275 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                            </ul>
                                                        </div>						  
                                                    </div>
                                                </div>		
                                            </div>
                                        </section>					
                                    </div>
                                    <div id="limousine-taxi" class="tab-pane fade">
                                        <section class="taxis-sale" id="taxisSale">
                                            <div class="container">
                                                <div class="row">                        
                                                    <div class="col-md-12">
                                                        <div class="sprocket-tables">
                                                            <ul class="sprocket-tables-container cols-5">
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab1.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: New York
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 15 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 250 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab2.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: Chicago
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 9 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 380 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab3.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: London
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 18 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 130 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab4.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: Los Angeles
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 12 000
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 520 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                                <li class="sprocket-tables-block">
                                                                    <div class="sprocket-tables-item">
                                                                        <img src="images/cab5.jpg" class="sprocket-tables-image" alt="image"/>
                                                                        <div class="sprocket-tables-desc sprocket-tables-cell sprocket-tables-bg1">
                                                                            <span class="sprocket-tables-text">
                                                                                Location: London
                                                                            </span>
                                                                        </div>
                                                                        <span class="sprocket-tables-price sprocket-tables-cell sprocket-tables-bg2">
                                                                            $ 12 000		
                                                                        </span>
                                                                        <span class="sprocket-tables-feature sprocket-tables-cell sprocket-tables-bg1">
                                                                            Mileage: 275 000
                                                                        </span>
                                                                        <div class="sprocket-tables-link sprocket-tables-cell sprocket-tables-bg1">
                                                                            <a href="#" class="readon">Read More</a>
                                                                        </div>
                                                                    </div>
                                                                </li>
                                                            </ul>
                                                        </div>						  
                                                    </div>
                                                </div>		
                                            </div>
                                        </section>                
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- /Choose Car -->










            <!-- Taxis For Sale -->

            <!-- /Taxis For Sale -->

            <!-- Taxi Advertising -->

            <section class="advertising" id="advertising">	  
                <div class="container">
                    <div class="row a-row">                        
                        <div class="col-md-12">
                            <h3 class="header header-advertising">taxi advertising</h3>
                        </div>
                    </div>		
                    <div class="row a-row">                        
                        <div class="col-md-4">
                            <h3 class="uk-text-black">advertise on our taxis now!</h3>
                            <br/>
                            <p class="a-p">Grab people's attention with awesome advertising campaigns on our taxi cars. Reach thousands of people with your creative ad.</p>
                            <h3 class="uk-text-black">3 easy steps:</h3>
                            <ul class="spot a-spot">
                                <li>Choose a taxi model</li>
                                <li>Choose advertising position</li>
                                <li>Select time period</li>
                            </ul>
                            <br/>
                            <h3>contact us and get started!</h3>
                            <br/>
                            <h3><a href="#" class="btn btn-inverse btn-lg a-a">contact us for pricing</a></h3>	  
                        </div>
                        <div class="col-md-4">
                            <img class="uk-text-center uk-scrollspy-init-inview uk-scrollspy-inview uk-animation-scale-up" data-uk-scrollspy="{cls:'uk-animation-scale-up', delay:300, repeat: true}" alt="ad1" src="http://i.imgur.com/NB20jbg.png"/>	  
                        </div>
                        <div class="col-md-4">
                            <img class="uk-text-center uk-scrollspy-init-inview uk-scrollspy-inview uk-animation-scale-up" data-uk-scrollspy="{cls:'uk-animation-scale-up', delay:600, repeat: true}" alt="ad2" src="http://i.imgur.com/Aln5IF9.png"/>	  
                        </div>		  
                    </div>
                </div>
            </section>  
            <!-- /Taxi Advertising -->

            <!-- Bottom -->
            <section class="bottom" id="bottom">	  
                <div class="container">
                    <div class="row bottom-row">
                        <div class="col-md-3">
                        </div>
                        <div class="col-md-3">
                            <h3 class="header header-bottom">about city cab</h3>
                            <p> 
                                Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.
                            </p>
                        </div>

                        <div class="col-md-3">
                            <h3 class="header header-bottom">contacts</h3>
                            <p>
                                <i class="uk-icon-envelope "></i>&nbsp; citycab (@) yoursite.com<br/>
                                <i class="uk-icon-phone "></i>&nbsp; +555.777.343<br/>
                                <i class="uk-icon-print "></i>&nbsp; +555.777.344<br/>
                                <i class="uk-icon-building "></i>&nbsp; 2nd Ave and Jamison			
                            </p>
                        </div>		  		  
                    </div>
                </div> 
            </section>
            <!-- /Bottom -->

            <!-- Footer -->
            <footer class="footer-wrapper" id="footer-wrapper">
                <div class="container">
                    <div id="footer" class="row">
                        <div class="col-md-4">
                            <span class="copyright">copyright &copy;  2015 city cab</span>
                        </div>
                        <div class="col-md-4 uk-text-center">
                            <div>
                                <a href="#" class="btn btn-inverse social"><i class="uk-icon-facebook"></i></a>				
                                <a href="#" class="btn btn-inverse social"><i class="uk-icon-twitter"></i></a>				
                                <a href="#" class="btn btn-inverse social"><i class="uk-icon-pinterest"></i></a>				
                                <a href="#" class="btn btn-inverse social"><i class="uk-icon-google-plus"></i></a>				
                                <a href="#" class="btn btn-inverse social"><i class="uk-icon-youtube-play"></i></a>				
                            </div>
                            <a class="totop" rel="nofollow" href="#page-top" title="Goto Top" data-uk-smooth-scroll=""><i class="uk-icon-caret-up"></i></a>
                        </div>
                        <div class="col-md-4 uk-text-right">
                        </div>  
                    </div>
                </div>

            </footer>
            <!-- /Footer -->

            <!-- Off Canvas Menu -->
            <div class="offcanvas-menu">
                <a class="close-offcanvas" href="#"><i class="uk-icon-remove"></i></a>
                <div class="offcanvas-inner">
                    <ul class="nav menu">
                        <li class="active"><a href="index.html">home</a></li>
                        <li><a href="about.html">about</a></li>
                        <li><a href="faq.html">f.a.q.</a></li>
                        <li><a href="blog.html">blog</a></li>
                        <li class="deeper parent active">
                            <a href="">more</a>
                            <ul class="nav-child unstyled small">
                                <li><a href="buttons.html">buttons</a></li>
                                <li><a href="icons.html">icons</a></li>
                                <li><a href="typography.html">typography</a></li>
                                <li><a href="error-404.html">error 404</a></li>
                                <li><a href="blog-left-sidebar.html">left sidebar</a></li>
                                <li><a href="blog-right-sidebar.html">right sidebar</a></li>						  
                            </ul>
                        </li>	
                    </ul>
                </div>  
            </div>
            <!-- /Off Canvas Menu -->

        </div>



        <!-- Scripts placed at the end of the document so the pages load faster -->

        <!-- Jquery scripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery-ui.min.js"></script>	

        <!-- Uikit scripts -->
        <script src="assets/js/uikit.min.js"></script> 	

        <!-- OWL Carousel scripts -->
        <script src="assets/js/owl.carousel.min.js"></script>

        <!-- Template scripts -->
        <script src="assets/js/template.js"></script>  

        <!-- Bootstrap core JavaScript -->
        <script src="bootstrap/js/bootstrap.min.js"></script>

        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="assets/js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>