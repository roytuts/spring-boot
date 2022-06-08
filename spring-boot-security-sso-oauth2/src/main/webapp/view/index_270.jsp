<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Spring Boot OAuth2 SSO Example</title>
<head>
	<!-- <script src="http://code.jquery.com/jquery-3.3.1.min.js"></script> -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
	<script type="text/javascript">
	    $.get("/user", function(data) {
	        $("#user").html(data.name);
	        $(".unauthenticated").hide()
	        $(".authenticated").show()
	    });
	    function logout() {
	        $.post("/logout", function() {
	            $("#user").html('');
	            $(".unauthenticated").show();
	            $(".authenticated").hide();
	        })
	        return true;
	    }
	</script>
</head>
<body>
	<div class="container unauthenticated">
		Login With Github <a href="/oauth2/authorization/github">click here</a>
	</div>
	<div class="container authenticated" style="display: none">
		Logged in as: <span id="user"></span>
		<div>
			<button onClick="logout()" class="btn btn-primary">Logout</button>
		</div>
	</div>
</body>
</html>
