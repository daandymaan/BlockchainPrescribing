import Server from "./Server.js";

Server.verifySession(function(value){
    if(value.msg == "success"){
        var user = value.identifier;
        var sideNavButton = document.getElementById("navSideButton");
        sideNavButton.innerHTML = user;
        sideNavButton.href="http://localhost:8080/app/v_details/v_details.html";
        sideNavButton.setAttribute("data-toggle", "dropdown");

        var navClass = document.getElementById("navClass");

        var createPrescriptionNav = document.getElementById("c_prescription_link");
        if(value.status != "M"){
            createPrescriptionNav.className = "nav-link disabled";
        }

        var dropdownMenu = document.createElement("div");
        dropdownMenu.className = "dropdown-menu";
        navClass.appendChild(dropdownMenu);

        var myAccount = document.createElement("a");
        myAccount.className = "dropdown-item";
        myAccount.href = "http://localhost:8080/app/v_details/v_details.html";
        myAccount.innerHTML = "My details";

        var logout = document.createElement("a");
        logout.className = "dropdown-item";
        logout.id = "logoutbtn";
        logout.innerHTML = "Logout";

        logout.onclick = function(){
            Server.endSession(function(value){
                if(value.msg == "success"){
                    logout.href="http://localhost:8080/app/login/login.html";
                }
            });
        }

        dropdownMenu.appendChild(myAccount);
        dropdownMenu.appendChild(logout);
    } else {
        window.location.replace("http://localhost:8080/app/login/login.html");
    }

    if(window.location.href == "http://localhost:8080/app/c_prescriptions/c_prescriptions.html" && value.status != "M"){
        window.location.replace("http://localhost:8080/app/index.html");
    }
})
// if(localStorage.getItem("ID") == null || localStorage.getItem("cert") == null){
//     console.log("Not logged in");
//     window.location.replace("http://localhost:8080/app/login/login.html")
// } else {
//     console.log("Logged in as " + localStorage.getItem("ID"));
//     var user = localStorage.getItem("ID");

//     var sideNavButton = document.getElementById("navSideButton");
//     sideNavButton.innerHTML = user;
//     sideNavButton.href="http://localhost:8080/app/v_details/v_details.html";
//     sideNavButton.setAttribute("data-toggle", "dropdown");

//     var navClass = document.getElementById("navClass");

//     var dropdownMenu = document.createElement("div");
//     dropdownMenu.className = "dropdown-menu";
//     navClass.appendChild(dropdownMenu);

//     var myAccount = document.createElement("a");
//     myAccount.className = "dropdown-item";
//     myAccount.href = "http://localhost:8080/app/v_details/v_details.html";
//     myAccount.innerHTML = "My details";

//     var logout = document.createElement("a");
//     logout.className = "dropdown-item";
//     logout.id = "logoutbtn";
//     logout.innerHTML = "Logout";
//     logout.onclick = function(){
//         localStorage.removeItem("ID");
//         logout.href="http://localhost:8080/app/login/login.html"
//     }

//     dropdownMenu.appendChild(myAccount);
//     dropdownMenu.appendChild(logout);
    
// }
