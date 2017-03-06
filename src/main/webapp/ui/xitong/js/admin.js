/*
* @Author: Administrator
* @Date:   2017-02-28 14:17:00
* @Last Modified by:   Administrator
* @Last Modified time: 2017-02-28 17:35:50
*/

$(function(){	
	var $admin_tabs=$("#admin_tabs");
	var $nav_tree=$("#nav_tree");
	$admin_tabs.tabs({	
		fit:true,
		border:false,
	});
	$nav_tree.tree({	
		line:true,
		url:"json/02.json",
		onClick:function(node){	
			if(node.children==undefined){	
				if($admin_tabs.tabs("exists",node.text)){	//是否存在
					$admin_tabs.tabs("select",node.text)
				}else{	
					$admin_tabs.tabs("add",{	
						title:node.text,
						iconCls:node.iconCls,
						closable:true,
						href:"pages/"+node.text+".html"
					})
				}
			}else{	
				$.messager.alert({msg:"不要点击父文件"});
			}
		}
	})
});