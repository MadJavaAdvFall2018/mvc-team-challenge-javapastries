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
            <tr><td colspan="2">${yourPastry.pastryImage}</td></tr>
            <tr><td colspan="2">${yourPastry.pastryMessage}</td></tr>
            <%-- TODO: should we remove the below properties for display purposes? --%>
            <tr><td class="right">od</td><td class="left">${yourPastry.od}</td><tr>
            <tr><td class="right">nuts</td><td class="left">${yourPastry.nuts}</td><tr>
            <tr><td class="right">flavor</td><td class="left">${yourPastry.flavor}</td><tr>
        </table>
        <p><a href="PastryJSP.jsp">Check multiple personalities...</a></p>
    </body>
</html>
