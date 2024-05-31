<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login/Signup</title>
    
    
    <link rel="stylesheet" type="text/css" href="../css/style.css" />
   <script  src="../javascript/pagejavaScript.js"></script>
   
   
   
  </head>
  <body>
    <div class="container">
      <h1>Inventory Manegement</h1>
      <div id="login-form">
        <h2>Login</h2>
        <form action="checklogdetails" method="post">
          <div class="form-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="idEmail" required />
          </div>
          <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required />
          </div>
          <div class="form-group">
            <button type="submit">Login</button>
          </div>
          <div class="error" id="error"></div>
        </form>
        <p>
          Don't have an account?
          <a href="#" onclick="showSignupForm()">Sign up here</a>.
        </p>
      </div>
      <div id="signup-form" style="display: none">
        <h2>Signup</h2>
        <form action="save" method="post">
          <div class="form-group">
            <label for="signup-email">Email</label>
            <input
              type="email"
              id="signup-email"
              name="idEmail"
              required
            />
          </div>
          <div class="form-group">
            <label for="signup-email">Platoon name</label>
            <input
              type="text"
              id="nameD"
              name="nameD"
              required
            />
          </div>
          <div class="form-group">
            <label for="signup-password">Password</label>
            <input
              type="password"
              id="signup-password"
              name="password"
              required
            />
          </div>
          <div class="form-group">
            <label for="signup-confirm-password">Confirm Password</label>
            <input
              type="password"
              id="signup-confirm-password"
              name="signup-confirm-password"
              required
            />
          </div>
          <div class="form-group">
            <button type="submit" onclick="passCrossCheck()">Signup</button>
            
          </div>
          <div class="error" id="signup-error"></div>
        </form>
        <p>
          Already have an account?
          <a href="#" onclick="showLoginForm()">Login here</a>.
        </p>
      </div>
    </div>

    
  </body>
  
 
</html>
