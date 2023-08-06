<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.ResultSetMetaData"%>
<!DOCTYPE html>
<html lang="en" title="Coding design">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">

        <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>

        <link rel="stylesheet" href="css/marketingTeamDash.css">
        <title>Marketing Team Dashboard</title>
    </head>

    <body>
        <%
            ResultSet data = (ResultSet) request.getSession().getAttribute("Data");
            String title = (String) request.getSession().getAttribute("title");

            ResultSetMetaData metaData = data.getMetaData();
            int columnCount = metaData.getColumnCount();
        %>
        <main>
            <ul class="box-info">
                <li>
                    <i class='bx bxs-calendar-check' ></i>
                    <span class="text">
                        <h3>1020</h3>
                        <p>New Order</p>
                    </span>
                </li>
                <li>
                    <i class='bx bxs-group' ></i>
                    <span class="text">
                        <h3>2834</h3>
                        <p>Customers</p>
                    </span>
                </li>
                <li>
                    <i class='bx bxs-cart' ></i>
                    <span class="text">
                        <h3>95</h3>
                        <p>Sales</p>
                    </span>
                </li>
                <li>
                    <i class='bx bxs-dollar-circle' ></i>
                    <span class="text">
                        <h3>$7,864</h3>
                        <p>Earning</p>
                    </span>
                </li>
            </ul>
            <div class="table">
                <div class="table__header">
                    <h1><%=title%></h1>
                    <div class="input-group">
                        <input type="search" placeholder="Search Data...">
                        <img src="img/search.png" alt="">
                    </div>

                </div>
                <div class="table__body">
                    <table>
                        <thead>
                            <tr>
                                <%
                                    for (int i = 1; i <= columnCount; i++) {
                                        String columnName = metaData.getColumnName(i);
                                %>
                                <th> <%= columnName%><span class="icon-arrow">&UpArrow;</span></th>
                                    <%
                                        } // End of for loop
                                    %>
                            </tr>
                        </thead>
                        <tbody>
                                <%
                                    while (data.next()) {%><tr> <%
                                    for (int i = 1; i <= columnCount; i++) {
                                        String columnName = metaData.getColumnName(i);
                                %>
                                <td> <%= data.getString(columnName)%></td>
                                <%}%></tr><%}%>
                        </tbody>
                    </table>
                </div>
            </div>

        </main>
        <script src="script.js"></script>
    </body>

</html>