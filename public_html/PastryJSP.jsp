<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <link href='styles/index.css' rel='stylesheet' type='text/css' />
        <title>Pastry Test</title>
    </head>
    <body>
        <header>
            <h1>Hello and Welcome!</h1>
            <h2>We're here to tell you something about yourself.</h2>
            <h3>Somthing you probably didn't know you needed to know.</h3>
            <h4>But you totally do.</h4>
            <h1>What kind of pastry you are!</h1>
            <h5>Just answer these easy questions! We promise we wont sell your data.</h5>
            <h6>probably.</h6>
            <h6>We'd like to see you try and stop us.</h6>
        </header>
        <br>
        <hr>
        <form action='./Pastry' method='post' name='pastryForm'>
            <fieldset>
                <legend>How many times have you overdosed on pastries in the past week?</legend>
                <label for='OD0'>0 times</label>
                <input
                    type='radio'
                    id='OD0'
                    name='od'
                    value='0'
                    required
                />
                <br>
                <label for='OD1-2'>1-2 times</label>
                <input
                    type='radio'
                    id='OD12'
                    name='od'
                    value='12'
                />
                <br>
                <label for='OD35'>3-5 times</label>
                <input
                    type='radio'
                    id='OD35'
                    name='od'
                    value='35'
                />
                <br>
                <label for='OD6+'>6+ times</label>
                <input
                    type='radio'
                    id='OD0'
                    name='od'
                    value='6'
                />
            </fieldset>
            <br>
            <label for='nuts'>Are you Allergic to Nuts? </label>
            <select id='nuts'>
                <option name='nutAllergy' value='true'>Yes</option>
                <option name='nutAllergy' value='false'>No</option>
            </select>
            <br>
            <br>
            <label for='flavor'>Pick a flavor:  </label>
            <select id='flavor'>
                <option name='flavor' value='cherry'>Cherry</option>
                <option name='flavor' value='lemon'>Lemon</option>
                <option name='flavor' value='chocolate'>Chocolate</option>
                <option name='flavor' value='vanilla'>Vanilla</option>
            </select>
            <br>
            <br>
            <input type='submit' value='submit'>
            <input type='reset' value='reset'>
        </form>
    </body>
</html>
