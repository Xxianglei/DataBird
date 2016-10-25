/**
 * Created by coolfy on 2016/10/25.
 */


/*校验登录*/
$.validator.setDefaults({
    submitHandler:function () {
        alert("点击提交");
    }
});

$().ready(function () {
    $("#loginForm").validate({
        rules:{
            username:{
                required:true,
                minlength:4,
                maxlength:10
            },
            password:{
                required:true,
                minlength:6,
                maxlength:16
            }
        },
        messages:{
            username:{
                required:"请输入您的用户名",
                minlength:"用户名至少由4个字母组成",
                maxlength:"用户名最多由10个字母组成"
            },
            password:{
                required:"请输入您的密码",
                minlength:"密码至少由6位组成",
                maxlength:"密码最多由16位组成"
            }
        }
    });
});