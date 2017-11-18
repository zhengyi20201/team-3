<?php
$id = $_GET['id'];
$obj = json_decode(file_get_contents('http://localhost:8080/cfg/get-story?id=' . $id), true);
$page_title = $obj['title'];

require ('includes/header.php');
?>
<section class="container card section">
    <h1><?= $page_title ?></h1>
    <div>Age: <?= $obj['age'] ?> Stage: <?= $obj['stage'] ?></div>
    <div><?= $obj['story'] ?></div>
</section>
<?php
require ('includes/footer.php');
