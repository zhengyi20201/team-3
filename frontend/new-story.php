<?php
$page_title = 'New Story';

require ('includes/header.php');
?>
    <link href='https://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
    <script src="static/js/new-story.js"></script>
    <style>
        /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
        .clear {height:0px; clear:both;}
        body {
            margin:30px;
        }
        .form-wrapper {
            float:left;
            width:100%;
            max-width:75.000em;
            background:#FFFFFF;
            overflow:hidden;
        }
        .form-wrapper label, .form-wrapper .radio-check-label {
            width:100%;
            float:left;
            margin-bottom:1em;
        }
        .form-wrapper label span, .form-wrapper .notes, .form-wrapper .radio-check-label span.label {
            float:left;
            width: 25%;
            text-align:right;
        }
        div.input-wrapper {
            width:70%;
            float:right;
            padding:0 0.625em;
        }
        .form-wrapper input, .form-wrapper select, .form-wrapper textarea, form-wrapper .radio {
            width:100%;
            padding:0.625em 0;
        }
        .form-wrapper .text input, .form-wrapper textarea {
            width:98%;
            padding-left: 1%; /* % will not work in FF*/
            padding-right: 1%; /* % will not work in FF*/
        }

        .form-wrapper .radio, .form-wrapper .checkbox {
            position:relative;
        }
        .form-wrapper .radio span, .form-wrapper .checkbox span {
            width :90%;
            text-align:left;
            padding-left:1.5em;
        }
        .form-wrapper .radio input, .form-wrapper .checkbox input {
            position:absolute;
            left:0;
            top:0;
            width:1em;
            height:1em;
        }

        input[type=reset], input[type=submit] {
            width:auto;
            max-width:34%;
            float:right;
        }
        input[type=submit] {
            margin-left:2%
        }
        .form-wrapper .notes {
            margin-top:1em;
            width:100%;
            text-align:left;
        }

        /* DOWN HERE: Only theming */

        /* Light Theme -----------------    */
        html.light{
            background:#EEE;
        }

        .form-wrapper.light {
            background:#EEE;
            font-family:'PT Sans', Arial, sans-serif;
            font-weight:normal;
            font-size:1em;
            line-height:1em;
            color:#424242;
            padding:1em 0;
        }
        /* TEXT & TEXTAREA */
        .light label.text input, .light label.text textarea {
            border: 1px solid #cccccc;
            border-bottom-color: #fff;
            border-right-color: #fff;
            border-radius: 3px;
            background: #e5e5e5;
            color: #555;
            transition:background .2s;
        }

        /* DROPDOWN & MULTIPLE*/
        .light label.dropdown select, .light label.multiple select {
            background: #e5e5e5;
            border: 1px solid #cccccc;
            border-bottom-color: #fff;
            border-right-color: #fff;
            border-radius:3px;
            transition:background .2s;
        }
        .light label.multiple select {
            padding-bottom:1.875em;
        }
        .light label.dropdown select option, .light label.multiple select option  {
            background:#e5e5e5;
            margin-bottom:0.625em 1%;
            cursor:pointer;
            transition:background .2s;
        }
        .light label.dropdown select:focus, .light label.multiple select:focus, .light label.dropdown select:focus option, .light label.multiple select:focus option {
            background:#FFF;
        }
        /* RADIO & CHECKBOX */
        .light .radio-check-label label {
            display:block;
            border: 1px solid #cccccc;
            border-top-color: #fff;
            border-right-color: #fff;
            border-radius: 3px;
            line-height:1em;
            background: #e5e5e5;
            cursor:pointer;
            overflow:hidden;
            margin-bottom:0.5em;
        }
        .light .radio-check-label label input {
            opacity:0.01
        }
        .light .radio-check-label label span {
            display:block;
            padding: 0.563em 15% 0.563em 1.875em;
            transition:background .2s;
            border-radius:3px;
        }
        .light .radio-check-label label span:before {
            content: "";
            display:block;
            width:12px;
            height:12px;
            background:#ffffff;
            position:absolute;
            left:8px;
            top:11px;
            border:1px solid #b9b9b9;
        }
        .light .radio-check-label label.radio span:before {
            border-radius:8px;
        }
        .light .radio-check-label label.checkbox span:before {
            border-radius:2px;
        }
        .light .radio-check-label input:checked ~ span:before {
            background-color:#424242;
            border-color:transparent;
        }
        .light .radio-check-label input:checked ~ span {
            background:#FFF;
        }
        /* SUBMIT & RESET */
        .light input[name=submit], .light input[name=reset] {
            margin-top:2.50em;
            border: 1px solid #cccccc;
            border-radius: 3px;
            padding: 0.563em 4em;
            background: #e5e5e5;
            color:#424242;
            font-size:1em;
            cursor:pointer;
            transition:background 0.2s;
        }
        .light input[name=submit] {
            padding:0.563em 6em;
        }
        .light input[name="reset"]:hover, .light input[name="submit"]:hover {
            color:#FFF;
        }
        .light input[name="reset"]:hover {
            background:#8C1D04;
        }
        .light input[name="submit"]:hover {
            background:#70995C;
        }

        /* FOCUS */
        .light label.text input:focus, .light label.text textarea:focus {
            background:#fff;
        }

        /* Dark Theme -----------------    */
        html.dark {
            background:#373431;
        }
        .form-wrapper.dark {
            background:#373431;
            font-family:'PT Sans', Arial, sans-serif;
            font-weight:normal;
            font-size:1em;
            line-height:1em;
            color:#A8A7A8;
            padding:1em 0;
        }
        /* TEXT & TEXTAREA */
        .dark label.text input, .dark label.text textarea {
            background:#000;
            background:rgba(0,0,0,0.16);
            box-shadow:0 1px 4px rgba(0, 0, 0, 0.3) inset, 0 1px rgba(255, 255, 255, 0.06);
            border: 0 none;
            border-radius: 3px;
            color: #BBBBBB;
            transition:background .2s;
        }
        /* DROPDOWN & MULTIPLE*/
        .dark label.dropdown select, .dark label.multiple select {
            background:#000;
            background:rgba(0,0,0,0.16);
            box-shadow:0 1px 4px rgba(0, 0, 0, 0.3) inset, 0 1px rgba(255, 255, 255, 0.06);
            color: #BBBBBB;
            border: 0 none;
            border-radius:3px;
            transition:background .2s;
        }
        .dark label.multiple select {
            padding-bottom:1.875em;
        }
        .dark label.dropdown select option, .dark label.multiple select option  {
            margin-bottom:0.625em 1%;
            cursor:pointer;
            transition:all .2s;
        }
        .dark label.dropdown select:focus, .dark label.multiple select:focus, .dark label.dropdown select:focus option, .dark label.multiple select:focus option {

        }
        /* RADIO & CHECKBOX */
        .dark .radio-check-label label {
            background:#000;
            background:rgba(0,0,0,0.16);
            box-shadow:0 1px rgba(255, 255, 255, 0.06);
            display:block;
            border: 0 none;
            border-radius: 3px;
            line-height:1em;
            cursor:pointer;
            overflow:hidden;
            margin-bottom:0.5em;

        }
        .dark .radio-check-label label input {
            opacity:0.01
        }
        .dark .radio-check-label label span {
            display:block;
            padding: 0.563em 15% 0.563em 1.875em;
            transition:all .2s;
            border-radius:3px;
        }
        .dark .radio-check-label label span:before {
            content: "";
            display:block;
            width:12px;
            height:12px;
            background:#000;
            background:rgba(0,0,0,0.2);
            position:absolute;
            left:8px;
            top:11px;
            border:1px solid #373431;
        }
        .dark .radio-check-label label.radio span:before {
            border-radius:8px;
        }
        .dark .radio-check-label label.checkbox span:before {
            border-radius:2px;
        }
        .dark .radio-check-label input:checked ~ span:before {
            background:#FFF;
            border-width:0px;

        }
        .dark .radio-check-label input:checked ~ span {
            box-shadow:0 1px 4px rgba(0, 0, 0, 0.3) inset, 0 1px rgba(255, 255, 255, 0.06);
            background:#000;
            background:rgba(0,0,0,0.1);
            color:#FFF;

        }
        /* SUBMIT & RESET */
        .dark input[name=submit], .dark input[name=reset] {
            margin-right:0.563em;
            margin-top:2.50em;
            font-size:1em;
            border: 0 none;
            background:#000;
            background:rgba(0,0,0,0.2);
            color: #BBBBBB;
            border-radius: 3px;
            padding: 0.563em 4em;
            cursor:pointer;
            box-shadow: 0 1px rgba(255, 255, 255, 0.06);
            transition:background 0.2s
        }
        .dark input[name=submit] {
            padding:0.563em 6em;
        }
        .dark input[name=submit]:hover, .dark input[name=reset]:hover {
            box-shadow:0 1px 4px rgba(0, 0, 0, 0.3) inset, 0 1px rgba(255, 255, 255, 0.06);
            color:#FFF;
        }
        .dark input[name="reset"]:hover {
            background:rgba(140,29,4,0.3);
        }
        .dark input[name="submit"]:hover {
            background:rgba(51,102,77,0.3);
        }

        /* FOCUS */
        .dark label.text input:focus, .dark label.text textarea:focus {
            background:#000;
            background:rgba(0,0,0,0.25);
            color:#FFF;
        }
        /* Dark Theme END ----------------- */

        /* Options */
        #options {
            margin:0 0 2em 0;
        }

        /* Media Queries */
        @media screen and (max-width: 480px)  {
            .form-wrapper .text span, .form-wrapper .dropdown span, .form-wrapper .multiple span, .form-wrapper .radio-check-label span.label {
                float:none;
                width:100%;
            }
            .form-wrapper .input-wrapper {
                float:none;
                margin-top:0.625em;
                width:90%
            }

            .form-wrapper .input-wrapper label.radio span, .form-wrapper .input-wrapper label.checkbox span {
                width:80%;
                padding-right:20%;
            }
            .form-wrapper input[name="reset"] {
                margin-top:0.563em;
                padding:0.563em 6em;
            }
        }

    </style>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>

    </head>

    <body>
    <div id="form" class="form-wrapper">
        <label class="text">
            <span>Your Name (leave empty if you want to remain anonymus)</span>
            <div class="input-wrapper">
                <input type="text" />
            </div>
        </label>

        <label class="text">
            <span>Age</span>
            <div class="input-wrapper">
                <input type="number" />
            </div>
        </label>

        <label class="text">
            <span>Email</span>
            <div class="input-wrapper">
                <input type="email" />
            </div>
        </label>

        <label class="dropdown">
            <span>Type of Cancer</span>
            <div class="input-wrapper">
                <select size="1">
                    <option selected disabled hidden value=''>Choose the Type</option>
                    <option value="1">Bladder cancer</option>
                    <option value="2">Lung cancer</option>
                    <option value="3">Brain cancer</option>
                    <option value="4">Non-Hodgkin lymphoma</option>
                    <option value="5">Bone cancer</option>
                </select>
            </div>
        </label>

        <label class="dropdown">
            <span>Stage</span>
            <div class="input-wrapper">
                <select size="1">
                    <option selected disabled hidden value=''>Choose the Stage</option>
                    <option value="1">Stage 1</option>
                    <option value="2">Stage 2</option>
                    <option value="3">Stage 3</option>
                </select>
            </div>
        </label>

        <label class="text">
            <span>Your Story</span>
            <div class="input-wrapper">
                <textarea placeholder="Tell the world your story" rows="10"></textarea>
            </div>
        </label>

        <fieldset class="radio-check-label">
            <span class="label">Category</span>
            <div class="input-wrapper">
                <label class="checkbox" for="accept">
                    <input type="checkbox" name="accept" id="accept"/>
                    <span>Okay, I accept all u want</span>
                </label>
            </div>

            <div class="input-wrapper">
                <label class="checkbox" for="spam" >
                    <input type="checkbox" name="spam" id="spam"/>
                    <span>Yes, send me all your spam.</span>
                </label>
            </div>

            <div class="input-wrapper">
                <label class="checkbox" for="toolbars" >
                    <input type="checkbox" name="toolbars" id="toolbars"/>
                    <span>Install 1000 toolbars and add all available plugins to my browser</span>
                </label>

            </div>
        </fieldset>


        <input id="submit" type="submit" name="submit" value="Submit"/>
        <input type="reset" name="reset" value="Reset"/>

        <div class="clear"></div>
        <span class="notes">* Is mandetory.</span>
    </div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <script  src="static/js/new-story.js"></script>
<?php
require ('includes/footer.php');
