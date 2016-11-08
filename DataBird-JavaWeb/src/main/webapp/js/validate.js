/**
 * Created by coolfy on 2016/10/25.
 */


/*校验登录*/

/*$.validator.setDefaults({
    submitHandler:function () {
        alert("点击提交");
    }
});*/

$().ready(function () {

    $.validator.addMethod("isEnglish", function(value, element) {                                         /*校验用户名*/
        return this.optional(element) || /^[A-Za-z]+$/.test(value);
    }, "匹配english");

    $.validator.addMethod("stringCheck", function(value, element) {                                       /*校验密码*/
        return this.optional(element) || /^.*[A-Za-z0-9\\w_-]+.*$/.test(value);
    }, "只能包含中文、英文、数字、下划线等字符");

    $("#loginForm").validate({
        rules:{
            username:{
                required:true,
                minlength:4,
                maxlength:16,
                isEnglish:true
            },
            password:{
                required:true,
                minlength:6,
                maxlength:16,
                stringCheck:true
            }
        },
        messages:{
            username:{
                required:"请输入您的用户名",
                minlength:"至少由4个字母组成",
                maxlength:"最多由16个字母组成",
                isEnglish:"只能包含英文字母"
            },
            password:{
                required:"请输入您的密码　",
                minlength:"至少由6位组成　　",
                maxlength:"最多由16位组成",
                stringCheck:"只能包含字符,数字,下划线"
            }
        }
    });
});





/*校验注册*/

$().ready(function () {

    $.validator.addMethod("isEnglish", function(value, element) {                                         /*校验用户名*/
        return this.optional(element) || /^[A-Za-z]+$/.test(value);
    }, "匹配english");

    $.validator.addMethod("isEmail", function(value, element) {                                             /*校验邮箱*/
        return this.optional(element) || /^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/.test(value);
    }, "验证合法邮箱。");

    $.validator.addMethod("stringCheck", function(value, element) {                                         /*校验密码*/
        return this.optional(element) || /^.*[A-Za-z0-9\\w_-]+.*$/.test(value);
    }, "只能包含中文、英文、数字、下划线等字符");


    $("#registerForm").validate({
        rules:{
            username:{
                required:true,
                minlength:4,
                maxlength:16,
                isEnglish:true
            },
            email:{
                required:true,
                email:true,
                isEmail:true
            },
            password:{
                required:true,
                minlength:6,
                maxlength:16,
                stringCheck:true
            },
            confirmPassword:{
                required:true,
                minlength:6,
                maxlength:16,
                equalTo:"#password"
            }
        },
        messages:{
            username:{
                required:"请输入您的用户名",
                minlength:"至少由4个字母组成",
                maxlength:"最多由16个字母组成",
                isEnglish:"只能包含英文字母"
            },
            email:{
                required:"请输入有效的电子邮件地址",
                isEmail:"请输入有效的电子邮件地址"
            },
            password:{
                required:"请输入您的密码",
                minlength:"至少由6位组成",
                maxlength:"最多由16位组成",
                stringCheck:"只能包含字符,数字,下划线"
            },
            confirmPassword:{
                required:"请输入您的密码",
                minlength:"至少由6位组成",
                maxlength:"最多由16位组成",
                equalTo:"二次密码输入不一致"
            }
        }
    });
});





/*校验完善个人信息*/

$().ready(function () {

    $.validator.addMethod("isChinese", function(value, element) {                                           /*校验汉字*/
        return this.optional(element) || /^[\u0391-\uFFE5]+$/.test(value);
    }, "只能包含中文字符。");

    $.validator.addMethod("isMobile", function(value, element) {                                          /*校验手机号*/
        var length = value.length;
        return this.optional(element) || (length == 11 && /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/.test(value));
    }, "请正确填写您的手机号码。");


    $("#infoForm").validate({
        rules:{
            realName:{
                required:true,
                isChinese:true,
                minlength:2,
                maxlength:4
            },
            phoneNum:{
                required:true,
                isMobile:true
            },
            workCompany:{
                minlength:0,
                maxlength:20
            }
        },
        messages:{
            realName:{
                required:"请输入您的用户名",
                isChinese:"必须是汉字",
                minlength:"至少由2个汉字组成",
                maxlength:"最多由4个汉字组成"
            },
            phoneNum:{
                required:"请输入您的手机号",
                isMobile:"固定由11位数字组成"
            },
            workCompany:{
                minlength:"选填",
                maxlength:"最多由20个字符组成"
            }
        }
    });
});




/*校验忘记密码*/
$().ready(function () {

    $.validator.addMethod("isEmail", function(value, element) {                                             /*校验邮箱*/
        return this.optional(element) || /^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$/.test(value);
    }, "验证合法邮箱。");


    $("#forgetPwdForm").validate({
        rules:{
            email:{
                required:true,
                email:true,
                isEmail:true
            }
        },
        messages:{
            email:{
                required:"请输入有效的电子邮件地址",
                isEmail:"请输入有效的电子邮件地址"
            }
        }
    });
});





/*校验重置密码*/

$().ready(function () {

    $.validator.addMethod("stringCheck", function(value, element) {                                         /*校验密码*/
        return this.optional(element) || /^.*[A-Za-z0-9\\w_-]+.*$/.test(value);
    }, "只能包含中文、英文、数字、下划线等字符");


    $("#resetPwdForm").validate({
        rules:{
            password:{
                required:true,
                minlength:6,
                maxlength:16,
                stringCheck:true
            },
            confirmPassword:{
                required:true,
                minlength:6,
                maxlength:16,
                equalTo:"#password"
            }
        },
        messages:{
            password:{
                required:"请输入您的密码",
                minlength:"至少由6位组成",
                maxlength:"最多由16位组成",
                stringCheck:"只能包含字符,数字,下划线"
            },
            confirmPassword:{
                required:"请输入您的密码",
                minlength:"至少由6位组成",
                maxlength:"最多由16位组成",
                equalTo:"二次密码输入不一致"
            }
        }
    });
});
