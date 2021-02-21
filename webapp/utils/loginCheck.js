if(sessionStorage.getItem("ID") == null){
    console.log("Not logged in");
    window.location.href = "/login/login.html";
} else {
    console.log("Logged in as " + sessionStorage.getItem("ID"));
    var user = sessionStorage.getItem("ID");

    var sideNavButton = document.getElementById("navSideButton");
    sideNavButton.innerHTML = user;
    sideNavButton.href="../v_details/v_details.html";
    sideNavButton.setAttribute("data-toggle", "dropdown");

    var navClass = document.getElementById("navClass");

    var dropdownMenu = document.createElement("div");
    dropdownMenu.className = "dropdown-menu";
    navClass.appendChild(dropdownMenu);

    var myAccount = document.createElement("a");
    myAccount.className = "dropdown-item";
    myAccount.href = "../v_details/v_details.html";
    myAccount.innerHTML = "My details";

    var logout = document.createElement("a");
    logout.className = "dropdown-item";
    logout.innerHTML = "Logout";
    logout.onclick = function(){
        sessionStorage.removeItem("ID");
        logout.href="/login/login.html"
    }

    dropdownMenu.appendChild(myAccount);
    dropdownMenu.appendChild(logout);
    
}