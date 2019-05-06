<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Spring Boot OAuth2 SSO Example</title>
<head>
	<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
	    $.get("/user", function(data) {
	        $("#user").html(data.userAuthentication.details.name);
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
		Login With Github <a href="/login">click here</a>
	</div>
	<div class="container authenticated" style="display: none">
		Logged in as: <span id="user"></span>
		<div>
			<button onClick="logout()" class="btn btn-primary">Logout</button>
		</div>
	</div>
</body>
</html>