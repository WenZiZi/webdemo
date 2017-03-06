/*
* @Author: Administrator
* @Date:   2017-02-28 09:16:45
* @Last Modified by:   Administrator
* @Last Modified time: 2017-02-28 14:02:56
*/

$(function(){	
	var $login_box=$("#login_box");
	var $zhanghao=$("#login_zhanghao");
	var $password=$("#login_password");
	var $btnSub=$("#btnSub");
	$login_box.dialog({	
		title:"登录后台",
		modal:true,
		buttons:"#btn",
		iconCls:"icon-edit"		
	});
	$zhanghao.validatebox({	
		required:true,
		validType:"length[2,30]",
		missingMessage:"请输入您的账号",
		invalidate:"账号不得为空"
	});
	$password.validatebox({	
		required:true,
		validType:"length[6,30]",
		missingMessage:"请输入您的密码",
		invalidate:"密码不能少于6位"
	});
	
	if(!$zhanghao.validatebox("isValid")){	
		$zhanghao.focus();
	}else if(!$password.validatebox('isValid')){	
		$password.focus();
	}	

	$btnSub.on("click",function(){	
		if(!$zhanghao.validatebox("isValid")){	
			$zhanghao.focus();
		}else if(!$password.validatebox('isValid')){	
			$password.focus();
		}else{	
			alert("登录成功")
		}
	});
})
