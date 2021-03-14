<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Addresses</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<div style="width: 600px;margin: auto; margin-top: 300px">
    <table class="table table-hover" border="1">
        <tr class="table-warning">
            <th>id</th>
            <th>region</th>
            <th>district</th>
            <th>city</th>
            <th>street</th>
            <th>Delete</th>
        </tr>
        <#list addresses as address>
            <tr>
                <td>${address.id}</td>
                <td>${address.region}</td>
                <td>${address.district}</td>
                <td>${address.city}</td>
                <td>${address.street}</td>
                <td><a href="/ui/addresses/delete/${address.id}"><button class="btn btn-danger">Del</button></a></td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>