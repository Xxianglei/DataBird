/**
 * Created by coolfy on 2016/10/25.
 */


/*校验登录*/
$.validator.setDefaults({
    submitHander:function () {
        alert("点击提交");
    }
});

$().ready(function () {
    $("#loginForm").validate({
        rules:{
            username:{

            },
            password:{

            }
        },
        messages:{
            username:{

            },
            password:{

            }
        }
    });
});