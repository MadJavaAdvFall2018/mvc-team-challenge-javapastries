<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <link href='styles/index.css' rel='stylesheet' type='text/css' />
        <link href='styles/yourPastry.css' rel='stylesheet' type='text/css' />
        <title>Pastry Test</title>
    </head>
    <body>
        <header>
            <h1>Your Personal Pastry</h1>
        </header>
        <table>
            <tr><th colspan="2">${yourPastry.pastryName}</th></tr>
            <%-- <tr><td colspan="2"><img src='${yourPastry.pastryImage}'></td</tr> --%>
            <tr><td colspan="2">${yourPastry.pastryMessage}</td</tr>
            <tr><td>od</td><td>${yourPastry.od}</td><tr>
            <tr><td>nuts</td><td>${yourPastry.nuts}</td><tr>
            <tr><td>flavor</td><td>${yourPastry.flavor}</td><tr>
        </table>
    </body>
</html>
