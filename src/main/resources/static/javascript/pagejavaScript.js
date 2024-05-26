
      function showSignupForm() {
        document.getElementById("login-form").style.display = "none";
        document.getElementById("signup-form").style.display = "block";
      }

      function showLoginForm() {
        document.getElementById("login-form").style.display = "block";
        document.getElementById("signup-form").style.display = "none";
      }
    
 function passCrossCheck(){
	 var fpass=document.getElementById("signup-confirm-password").value;
	var secpass= document.getElementById("signup-password").value;
	if(fpass!=secpass){
		alert("password is not matching");
		
		event.preventDefault();
		
	}
 }