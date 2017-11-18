<?php
$page_title = 'Home';

require ('includes/header.php');
?>
    <div class="container">
        <div class="section">
            <form class="text-center">
                <div class="form-row">
                    <div class="col">
                        <div class="input-group"><input class="form-control" name="age" type="number" min="1" placeholder="Age"></div>
                    </div>
                    <div class="col">
                        <div class="input-group"><input class="form-control" name="tc" placeholder="Type of Cancer"></div>
                    </div>
                    <div class="col">
                        <div class="input-group">
                            <span class="input-group-addon">Stage</span>
                                <select name="stage" class="form-control">
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                </select>
                        </div>
                    </div>
                    <div class="col">
                        <div class="input-group">
                            <input class="btn btn-secondary form-control" type="submit">
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <div class="text-center section">
            <a class="btn btn-outline-secondary btn-lg form-control" href="new-story.php">Post My Own Story.</a>
        </div>
        <div class="section">
            <?php
            if (isset($_GET['age']) && $_GET['age'] !== "" && isset($_GET['stage']) && $_GET['stage'] !== "") {
                $objs = json_decode(file_get_contents('http://localhost:8080/cfg/filter-stories?age=' . $_GET['age'] . '&stage=' . $_GET['stage']), true)['list'];
            } else {
                $objs = json_decode(file_get_contents('http://localhost:8080/cfg/get-stories'), true)['list'];
            }
            foreach ($objs as $obj) {
                ?>
                <div>
                    <h2><a href="/story.php?id=<?= $obj['ID']?>"><?= $obj['title'] ?></a></h2>
                </div>
                <?php
            }
            ?>
        </div>
    </div>
<?php
require ('includes/footer.php');
