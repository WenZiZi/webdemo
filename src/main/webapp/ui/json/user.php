<?php 
	require 'config.php';
	$query= mysql_query("Select user FROM think_user LIMIT $first, $pageSize");
	while(!! $row= mysql_fetch_array($query, MYSQL_ASSOC)){	


	}
	mysql_close();

 ?>