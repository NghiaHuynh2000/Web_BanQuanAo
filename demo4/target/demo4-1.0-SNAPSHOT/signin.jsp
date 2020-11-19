<%--
  Created by IntelliJ IDEA.
  User: Windows 10
  Date: 11/11/2020
  Time: 10:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

	<link href="css/notice.css" rel = stylesheet type='text/css'>
	<title>Pakhi an E-Commerce online Shopping Category Flat Bootstarp responsive Website Template| Signin :: w3layouts</title>
	<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="js/jquery.min.js"></script>
	<!-- Custom Theme files -->
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<!-- Custom Theme files -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Pakhi Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!--webfont-->
	<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css'>
	<!-- dropdown -->
	<script src="js/jquery.easydropdown.js"></script>
	<link href="css/nav.css" rel="stylesheet" type="text/css" media="all"/>
	<script type="text/javascript" src="js/hover_pack.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
			});
		});
	</script>
</head>
<body>
<!-- header-section-starts -->
<div class="c-header" id="home">
	<div class="top-header">
		<div class="container">
			<div class="logo">
				<a href="index.html"><img src="images/logo.png" alt="" /></a>
			</div>
			<div class="header-top-right">
				<!-- start search-->
				<div class="search-box">
					<div id="sb-search" class="sb-search">
						<form>
							<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
							<input class="sb-search-submit" type="submit" value="">
							<span class="sb-icon-search"> </span>
						</form>
					</div>
				</div>
				<!-- search-scripts -->
				<script src="js/classie.js"></script>
				<script src="js/uisearch.js"></script>
				<script>
					new UISearch( document.getElementById( 'sb-search' ) );
				</script>
				<!-- //search-scripts -->

				<a href="cart.html"><i class="cart"></i></a>
			</div>
			<div class="navigation">
				<div>
					<label class="mobile_menu" for="mobile_menu">
						<span>Menu</span>
					</label>
					<input id="mobile_menu" type="checkbox">
					<ul class="nav">
						<li class="active"><a href="index.html">Home</a></li>
						<li class="dropdown1"><a href="#">Dresses</a>
							<ul class="dropdown2">
								<li><a href="products.html">Dress Materials</a></li>
								<li><a href="products.html">Kurta & Kurti</a></li>
								<li><a href="products.html">Sarees</a></li>
								<li><a href="products.html">Chudidars</a></li>
							</ul>
						</li>
						<li class="dropdown1"><a href="#">Bags</a>
							<ul class="dropdown2">
								<li><a href="products.html">Latest</a></li>
								<li><a href="products.html">Leather Bags</a></li>
								<li><a href="products.html">Hand Bags</a></li>
							</ul>
						</li>
						</li>
						<li class="dropdown1"><a href="#">Shoes</a>
							<ul class="dropdown2">
								<li><a href="products.html">Sports Shoes</a></li>
								<li><a href="products.html">Casual Shoes</a></li>
								<li><a href="products.html">Formal Shoes</a></li>
							</ul>
						</li>
						<li><a href="contact.html">Contact US</a></li>
						<div class="clearfix"></div>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- start login -->
<%
	String emailError = (String)request.getAttribute("emailError");
	if(emailError == null){
		emailError = "";
	}
	String passError = (String)request.getAttribute("passError");
	if(passError == null){
		passError = "";
	}
	String emaildkError = (String)request.getAttribute("emaildkError");
	if(emaildkError == null){
		emaildkError = "";
	}
	String passdkError = (String)request.getAttribute("passdkError");
	if(passdkError == null){
		passdkError = "";
	}
	String cfpassdkError = (String)request.getAttribute("cfpassdkError");
	if(cfpassdkError == null){
		cfpassdkError = "";
	}
	String email = request.getParameter("email");
	if(email == null){
		email = "";
	}
	String emaildk = request.getParameter("emaildk");
	if(emaildk == null){
		emaildk = "";
	}

%>
<div class="container">
	<div class="dreamcrub">
		<ul class="breadcrumbs">

			<li class="home">
				<a href="index.html" title="Go to Home Page"><img src="images/home.png" alt=""/></a>&nbsp;
				<span>&gt;</span>
			</li>
			<li>
				Signup
			</li>&nbsp;

		</ul>
		<ul class="previous">
			<li><a href="index.html">Back to Previous Page</a></li>
		</ul>
		<div class="clearfix"></div>
	</div>
</div>

<section id="main">
	<div class="login-content">
		<div class="container">

			<div class="login-signup-form">
				<form action="Login" method="post">
				<div class="col-md-5 login text-center">
					<h4>login</h4>
					<div class="how_to">
						<a href="#"><div class="reg_fb"><img src="images/facebook.png" alt=""><i>Facebook</i><div class="clearfix"></div></div></a>
						<a href="#"><div class="reg_gp"><img src="images/gp.png" alt=""><i>GOOGLE</i><div class="clearfix"></div></div></a>
						<p style="text-align: left"><img src="images/locked.png" alt="" />Be assured, we do not store your password</p>
					</div>
					<h5>OR</h5>
					<div class="cus_info_wrap">
						<label class="labelTop">
							Email:
							<span class="require">*</span>
						</label>

						<input type="text" name="email" value="<%= email%>">
						<div class = "diverror">
						<errorrrr><%= emailError%></errorrrr>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="cus_info_wrap">
						<label class="labelTop">
							Password:
							<span class="require">*</span>
						</label>
						<input type="password" name="password" value="">
						<div class = "diverror">
						<errorrrr><%= passError%></errorrrr>
						</div>

					</div>
					<br>
					<div class="clearfix"></div>
					<div class="sky-form span_99">
						<label class="checkbox"><input type="checkbox" name="checkbox" >Remember me on this computer </label>
					</div>
					<div class="botton1">
						<input type="submit" value="SIGNIN" class="botton">
					</div>
					<div class="forgetit">
						<a href="">forgot your password?</a>
						<input type="text" class="text" value="Enter email to reset it" onfocus="this.value = '';" onblur="if (this.value == 'Enter email to reset it') {this.value = 'Enter email to reset it';}">
						<input type="submit" value="SUBMIT" class="botton">
					</div>
				</div>
				</form>
				<form action="Signup" method="post">
				<div class="col-md-5 sign-up text-center">
					<h4>signup</h4>
					<div class="cus_info_wrap">
						<label class="labelTop">
							Email Id:
							<span class="require">*</span>
						</label>
						<input type="text" name = "emaildk" value="<%= emaildk%>">
						<div class = "diverror">
							<errorrrr><%= emaildkError%></errorrrr>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="cus_info_wrap">
						<label class="labelTop">
							Password:
							<span class="require">*</span>
						</label>
						<input type="password" name = "passdk" value="">
						<div class = "diverror">
							<errorrrr><%= passdkError%></errorrrr>
						</div>
					</div>
					<div class="clearfix"></div><div class="cus_info_wrap">
					<label class="labelTop confirmpass">
						Confirm Password:
						<span class="require">*</span>
					</label>
					<input type="password" name = "cfpassdk" value="">
					<div class = "diverror">
						<errorrrr><%= cfpassdkError%></errorrrr>
					</div>
					<div class="botton1">
						<input type="submit" value="SIGNUP" class="botton">
					</div>
				</div>

				</div>
				</form>
				<div class="col-md-2 benefits">
					<h4>Benefits of signup</h4>
					<p>Manage your purchases anytime: Track your order status and print your vouchers</p>
					<p>Quick shopping: no need to fill in your contact and shipping details while buying</p>
					<p>Easy access to member only benefits</p>
				</div>
				<div class="clearfix"></div>
			</div>

		</div>
	</div>
	</div>
</section>
<div class="contact-section">
	<div class="contact-section-head text-center">
		<h3><span>C</span>ontact Us</h3>
		<p>“let us know your feedbacks and questions”</p>
	</div>
	<div class="contact-form-main">
		<form>
			<label class="span1"></label>
			<input type="text" class="text" value="Name..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Name...';}">
			<label class="span2"></label>
			<label class="span3"></label>
			<input type="text" class="text" value="Email..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email...';}">
			<label class="span4"></label>
			<label class="span5"></label>
			<input type="text" class="text" value="Phone..." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Phone...';}">
			<label class="span6"></label>
			<label class="span7"></label>
			<textarea onfocus="if(this.value == 'Message...') this.value='';" onblur="if(this.value == '') this.value='Your Message';" >Message...</textarea>
			<label class="span8"></label>
			<input type="submit" value="">
		</form>
	</div>

</div>
<div class="footer">
	<div class="up-arrow">
		<a class="scroll" href="#home"><img src="images/up.png" alt="" /></a>
	</div>
	<div class="container">
		<div class="copyrights">
			<p>Copyright &copy; 2015 All rights reserved | Template by  <a href="http://w3layouts.com">  W3layouts</a></p>
		</div>
		<div class="footer-social-icons">
			<a href="#"><i class="fb"></i></a>
			<a href="#"><i class="tw"></i></a>
			<a href="#"><i class="in"></i></a>
			<a href="#"><i class="pt"></i></a>
		</div>
		<div class="clearfix"></div>
	</div>
</div>
</body>
</html>