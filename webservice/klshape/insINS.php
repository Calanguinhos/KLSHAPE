<!DOCTYPE html>
<html>
<head>
	<title>Add Instrutor</title>
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
$current_id = addInstrutor();


if($current_id) {
$server_response["success"] = 1;
echo json_encode($server_response);
}

function addInstrutor() {
$sql = "INSERT INTO `instrutores` (`INS_NOME`, `INS_RG`, `INS_CPF`, `INS_ENDERECO`, `INS_ATIVO`, `INS_EMAIL`, `INS_SENHA`) 
VALUES ('" . $_POST["ins_nome"] . "','" . $_POST["ins_rg"] . "','" . $_POST["ins_cpf"] . "','" . $_POST["ins_endereco"] . "','" . $_POST["ins_ativo"] . "','" . $_POST["ins_email"] . "','" . $_POST["ins_senha"] . "',)";

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