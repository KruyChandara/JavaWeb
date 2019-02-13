<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Facade</title>
</head>
<body>
    <form action="MyFascade" method="post">
        <label>
            Which Database
            <select name="db">
                <option value="postgres">Postgres</option>
                <option value="Mysql">MySql</option>
            </select>
            Choose File type
            <select name="fileType">
                <option value="pdf">pdf</option>
                <option value="text">txt</option>
                <option value="doc">doc</option>
            </select>
        </label>
        <input type="submit" value="Get All Host Info">
    </form>
</body>
</html>
