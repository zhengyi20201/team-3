<?php
$page_title = 'Home';

require ('includes/header.php');
?>
    <div class="container">
        <div>
            <form class="text-center">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="input-group"><input name="age" type="number" min="1" placeholder="Age"></div>
                    </div>
                    <div class="col-lg-3">
                        <div class="input-group"><input name="tc" placeholder="Type of Cancer"></div>
                    </div>
                    <div class="col-lg-3">
                        <div class="input-group">
                            <span class="input-group-addon">Stage</span><div class="input-group-btn">
                                <button type="button" class="btn btn-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Action
                                </button>
                                <div class="dropdown-menu">
                                    <a class="dropdown-item" href="#">Action</a>
                                    <a class="dropdown-item" href="#">Another action</a>
                                    <a class="dropdown-item" href="#">Something else here</a>
                                    <div role="separator" class="dropdown-divider"></div>
                                    <a class="dropdown-item" href="#">Separated link</a>
                                </div>
                            </div>
                            <noscript>
                                <select name="stage" >
                                    <option>1</option>
                                    <option>2</option>
                                    <option>3</option>
                                    <option>4</option>
                                </select>
                            </noscript>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="input-group">
                            <input class="btn btn-secondary" type="submit">
                        </div>
                    </div>
                </div>
            </form>
        </div>
        <div class="text-center">
            <a class="btn btn-outline-secondary btn-lg">Post My Own Story.</a>
        </div>
    </div>
<?php
require ('includes/footer.php');
