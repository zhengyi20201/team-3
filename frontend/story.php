<?php
$id = $_GET['id'];
$obj = json_decode(file_get_contents('http://localhost:8080/cfg/get-story?id=' . $id), true);
$page_title = $obj['title'];

require ('includes/header.php');
?>
<style>
    .story-card {
        margin-top: 20px;
    }
    .story {
        padding-bottom: 10px;
    }
    .info {
        color: gray;
    }
</style>
<section class="container card section story-card">
    <h1><?= $page_title ?></h1>
    <div class="info">Age: <?= $obj['age'] ?> Stage: <?= $obj['stage'] ?></div>
    <hr>
    <div class="story"><?= $obj['story'] ?></div>
</section>
<?php
require ('includes/footer.php');
