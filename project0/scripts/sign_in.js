function signIn() {
	let adminLogin = "admin";
	let adminPassword = "password123";
	
	let enteredLogin = document.getElementById("login").value;
	let enteredPassword = document.getElementById("password").value;
	
	if (enteredLogin === adminLogin && enteredPassword === adminPassword) {
		window.location.href = "game.html";
	}
}

