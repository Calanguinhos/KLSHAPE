<? php

$servername = "localhost";
$username = "kladminshape";
$password = "klpassshape0752";

// Criar conexão
$conn = new mysqli($servername, $username, $password);

// Verificar conexão
if (conn->connect_error) {
	die("Conexão Falhada: ".$conn->connect_error);
}

echo "Conectado com Suceso!!!";
?>