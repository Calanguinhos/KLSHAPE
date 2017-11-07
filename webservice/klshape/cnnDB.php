<!DOCTYPE html>
<html>
<head>
	<title>Conexão com o Banco de Dados</title>
</head>
<body>
<?php
$link = mysqli_connect("192.168.1.70:3306", "klshapeuser", "pass@kl", "klshape");
 
if (!$link) {
    echo "Error: Falha ao conectar-se com o banco de dados MySQL." . PHP_EOL;
    echo "Debugging errno: " . mysqli_connect_errno() . PHP_EOL;
    echo "Debugging error: " . mysqli_connect_error() . PHP_EOL;
    exit;
}
 
echo "Sucesso: Sucesso ao conectar-se com a base de dados MySQL." . PHP_EOL;
 
mysqli_close($link);
?>

</body>
</html>


