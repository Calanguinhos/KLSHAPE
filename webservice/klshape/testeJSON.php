<!DOCTYPE html>
<html>
<head>
	<title>Teste JSON</title>
</head>
<body>

<?php 

	$data = array();

	$data['nome'] = "AndroidFodac";
	$data['mensagem'] = "Bem se fudeu";
	$data['data'] = date("d/m/Y");

	echo "[". json_encode($data)."]";

 ?>

</body>
</html>