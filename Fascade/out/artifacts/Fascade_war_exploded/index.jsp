<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Facade</title>
    </head>
    <body>
    <div align="center" style="margin-top:25%">
        <form action="servlet" method="post" >
            <label style="padding: 100px">
                Choose Database
                <select name="dbType">
                    <option value="sql">SQL</option>
                    <option value="postgres">postgres</option>
                </select>
            </label>
            <br/>
            <label>
                Choose File type
                <select name="fileType">
                    <option value="pdf">pdf</option>
                    <option value="doc">doc</option>
                </select>
            </label>
            <br/>
            <input type="submit" value="Print Report">
        </form>
    </div>
    </body>
</html>
