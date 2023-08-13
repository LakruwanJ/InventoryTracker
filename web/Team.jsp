<%@page import="java.net.URLDecoder"%>
<%@page import="app.classes.ShowUsers"%>
<%@page import="app.classes.MKTCls"%>
<%@page import="java.sql.ResultSetMetaData"%>
<%@page import="java.sql.ResultSet"%>
<%-- 
    Document   : Team
    Created on : Aug 5, 2023, 9:17:52 AM
    Author     : lakru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    javax.servlet.http.Cookie[] cookies = request.getCookies();
    String U_ID = null;

    if (cookies != null) {
        for (javax.servlet.http.Cookie cookie : cookies) {
            if ("U_ID".equals(cookie.getName())) {
                U_ID = URLDecoder.decode(cookie.getValue(), "UTF-8");
                break;
            }
        }
    }else{
        response.sendRedirect("logn.jsp");
    }

    ShowUsers mkt = new ShowUsers();
    
    ResultSet AllSup = mkt.AllSup();
    ResultSetMetaData metaData1 = AllSup.getMetaData();
    int columnCount1 = metaData1.getColumnCount();
    
    ResultSet AllSk = mkt.AllSk();
    ResultSetMetaData metaData2 = AllSk.getMetaData();
    int columnCount2 = metaData2.getColumnCount();
    
    ResultSet AllMkt = mkt.AllMkt();
    ResultSetMetaData metaData3 = AllMkt.getMetaData();
    int columnCount3 = metaData3.getColumnCount();
    
    ResultSet AllAdmin = mkt.AllAdmin();
    ResultSetMetaData metaData4 = AllAdmin.getMetaData();
    int columnCount4 = metaData4.getColumnCount();
    
%> 

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Team</title>

        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet"/>        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous"/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <script type="module"src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
        <link rel="stylesheet" href="skcss.css" />

    </head>
    <body>
        
        <nav class="navbar navbar-expand-md bg-body py-3">
            <div class="container"><a class="navbar-brand d-flex align-items-center" href="#"></a><button
                    data-bs-toggle="collapse" class="navbar-toggler" data-bs-target="#navcol-3"><span
                        class="visually-hidden">Toggle navigation</span><span
                        class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navcol-3"><img src="img/logo-no-background.png"
                        style="width: 150px;">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
                        <li class="nav-item"><a class="nav-link active" href="Team.jsp">Team Members</a></li>
                        <li class="nav-item"><a class="nav-link" href="#">Details</a></li>
                        <li class="nav-item"></li>
                        <li class="nav-item"><a class="nav-link" href="ChangePassword.jsp">Change Password</a></li>
                    </ul><a class="btn btn-primary ms-md-2" role="button" href="#">Log out</a>
                </div>
            </div>
        </nav>
        
        <div class="container">

            <br><br>
            <h2>Suppliers</h2><hr class="pt-0 pb-0">   

            <div class="col-12">
                <table class="table table-center">

                    <thead>
                        <tr>
                            <th>Supplier ID</th>
                            <th>User Name</th>
                            <th>Phone Number</th>
                            <th>e-mail</th>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                        <%
                                while (AllSup.next()) {%><tr class="table-light"> <%
                                for (int i = 1; i <= columnCount1; i++) {
                                    String columnName = metaData1.getColumnName(i);
                            %>
                            <td> <%= AllSup.getString(columnName)%></td>
                            <%}%></tr><%}%>
                        </tr>

                    </tbody>
                </table>
            </div>

            <br><br>
            <h2>Stock Keepers</h2><hr class="pt-0 pb-0">   

            <div class="col-12">
                <table class="table table-center">

                    <thead>
                        <tr>
                            <th>Supplier ID</th>
                            <th>Stock Keeper Name</th>
                            <th>Phone Number</th>
                            <th>e-mail</th>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                        <%
                                while (AllSk.next()) {%><tr class="table-light"> <%
                                for (int i = 1; i <= columnCount2; i++) {
                                    String columnName = metaData2.getColumnName(i);
                            %>
                            <td> <%= AllSk.getString(columnName)%></td>
                            <%}%></tr><%}%>
                        </tr>

                    </tbody>
                </table>
            </div>

            <br><br>
            <h2>Marketing Team</h2><hr class="pt-0 pb-0">   

            <div class="col-12">
                <table class="table table-center">

                    <thead>
                        <tr>
                            <th>Member ID</th>
                            <th>User Name</th>
                            <th>Phone Number</th>
                            <th>e-mail</th>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                        <%
                                while (AllMkt.next()) {%><tr class="table-light"> <%
                                for (int i = 1; i <= columnCount3; i++) {
                                    String columnName = metaData3.getColumnName(i);
                            %>
                            <td> <%= AllMkt.getString(columnName)%></td>
                            <%}%></tr><%}%>
                        </tr>

                    </tbody>
                </table>
            </div>

            <br><br>
            <h2>System Administrators</h2><hr class="pt-0 pb-0">   

            <div class="col-12">
                <table class="table table-center">

                    <thead>
                        <tr>
                            <th>Admin ID</th>
                            <th>User Name</th>
                            <th>Phone Number</th>
                            <th>e-mail</th>
                        </tr>
                    </thead>

                    <tbody>
                        <tr>
                        <%
                                while (AllAdmin.next()) {%><tr class="table-light"> <%
                                for (int i = 1; i <= columnCount4; i++) {
                                    String columnName = metaData4.getColumnName(i);
                            %>
                            <td> <%= AllAdmin.getString(columnName)%></td>
                            <%}%></tr><%}%>
                        </tr>

                    </tbody>
                </table>
            </div>
        </div>
                        
                        <footer class="text-center bg-dark" style="background: var(--bs-emphasis-color);">
                <div class="container text-white py-4 py-lg-5">
                    <div style="height: 80px;">
                        <div class="row">
                            <div class="col"><img src="img/png%20white.png"
                                                  style="max-width: 170px;width: 150px;height: 37.8px;"></div>
                            <div class="col" style="color: rgb(108, 117, 125);font-size: 10px;">
                                <h1 style="font-size: 15px;color: rgb(108, 117, 125);">You can use this system overseeing
                                    and controlling all aspects of inventory, from ordering to distribution</h1>
                            </div>
                            <div class="col">
                                <div class="row">
                                    <div class="col">
                                        <h1 style="font-size: 18px;color: rgb(108, 117, 125);">Contact Us</h1><a
                                            class="link-light" href="#">inventorytracker@gmail.com</a>
                                    </div>
                                </div><a class="link-light" href="#" style="padding-left: 10px;padding-top: 0px;">+94 11 356
                                    8356</a>
                            </div>
                        </div>
                    </div>
                    <p class="text-muted mb-0">Copyright Â© 2023 Inventory Tracker</p>
                </div>
            </footer>
    </body>
</html>
