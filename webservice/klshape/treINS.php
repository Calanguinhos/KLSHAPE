<!DOCTYPE html>
<html>
<head>
	<title>Add Treinamentos</title>
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
$current_id = addTreinamento();


if($current_id) {
$server_response["success"] = 1;
echo json_encode($server_response);
}

function addTreinamento() {
$sql = "INSERT INTO `treinamentos` (`EXERCICIOS_ID_EXERCICIO`, `NOTIFICACOES_ID_NOTIFICACAO`, `NOTIFICACOES_ALUNOS_ID_ALUNOS`, `NOTIFICACOES_INSTRUTORES_ID_INSTRUTORES`) 
VALUES ('" . $_POST["exe_id"] . "','" . $_POST["not_id"] . "','" . $_POST["not_alu_id"] . "','" . $_POST["not_ins_id"] . "')";

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