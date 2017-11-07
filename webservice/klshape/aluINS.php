<!DOCTYPE html>
<html>
<head>
	<title>Add Aluno</title>
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
$current_id = addAluno();


if($current_id) {
$server_response["success"] = 1;
echo json_encode($server_response);
}

function addAluno() {
$sql = "INSERT INTO `alunos` (`ALU_NOME`, `ALU_RG`, `ALU_CPF`, `ALU_ENDERECO`, `ALU_ATIVO`, `ALU_EMAIL`, `ALU_SENHA`) 
VALUES ('" . $_POST["alu_nome"] . "','" . $_POST["alu_rg"] . "','" . $_POST["alu_cpf"] . "','" . $_POST["alu_endereco"] . "','" . $_POST["alu_ativo"] . "','" . $_POST["alu_email"] . "','" . $_POST["alu_senha"] . "',)";

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