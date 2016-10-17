/**
 * Created by cool on 2016-10-03.
 */


/*改变用户名输入框颜色*/
function usernameShadow() {
    var username = document.getElementById("username");
    var password = document.getElementById("password");
    username.style.borderColor = "#2DA7E0";
    username.style.boxShadow = "0 0 5px #2DA7E0";
    password.style.borderColor = "gray";
    password.style.boxShadow = null;
}

/*改变密码框输入颜色*/
function passwordShadow(){
    var username = document.getElementById("username");
    var password = document.getElementById("password");
    username.style.borderColor = "gray";
    username.style.boxShadow = null;
    password.style.borderColor = "#2DA7E0";
    password.style.boxShadow = "0 0 5px #2DA7E0";
}
