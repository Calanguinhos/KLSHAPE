<!DOCTYPE html>
<html>
<head>
	<title>Add Notificação</title>
</head>
<body>
<?php
require_once("cnnDB.php");
$conn = mysql_connect(HOST,USERNAME,PASSWORD,DATABASE_NAME);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$server_response = array();
$current_id = addNotificacao();


if($current_id) {
$server_response["success"] = 1;
echo json_encode($server_response);
}

function addNotificacao() {
$sql = "INSERT INTO `notificacoes` (`NOT_NOME`, `NOT_DESCRICAO`, `NOT_TIPO`, `ALUNOS_ID_ALUNOS`, `INSTRUTORES_ID_INSTRUTORES`) 
VALUES ('" . $_POST["not_nome"] . "','" . $_POST["not_descricao"] . "','" . $_POST["not_tipo"] . "','" . $_POST["alunos_id_alunos"] . "','" . $_POST["instrutores_id_instrutores"] . "')";

$result = mysql_query($sql);
if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
?>
</body>
</html>