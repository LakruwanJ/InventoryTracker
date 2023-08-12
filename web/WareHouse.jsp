<%-- 
    Document   : WhareHouses
    Created on : 09-Aug-2023, 18:41:31
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="app.classes.whClasses"%>
<%@page import="java.sql.ResultSet"%>
<%whClasses wh1 = new whClasses();%>
<%whClasses wh2 = new whClasses();%>

<%ResultSet whData = wh1.getWH();
    int i = 1;%>
<%ResultSet itData = wh2.getItemsAR();
    int j = 1;%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Ware houses</title>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
            crossorigin="anonymous"
            />
        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
            crossorigin="anonymous"
        ></script>
        <script
            type="module"
            src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"
        ></script>
        <script
            nomodule
            src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"
        ></script>
        <link rel="stylesheet" href="./whcss.css" />
    </head>
    <body>
        <!--Ware Houses Start-->

        <div class="container px-4 py-5" id="custom-cards">
            <h2 class="pb-2 border-bottom">Ware Houses</h2>
            <div class="accordion" id="accordionExample">
                <!--Single Accordion div start-->

                <%
                    while (whData.next()) {

                %>

                <div class="accordion-item">
                    <div class="storHeader">
                        <!--Heaer items Start-->
                        <div class="row">
                            <div class="storeHousesHeader text-center">
                                <div class="col-2">
                                    <button
                                        class="IconButton"
                                        type="button"
                                        data-bs-toggle="collapse"
                                        data-bs-target="#collapse<%=i%>"
                                        aria-expanded="true"
                                        aria-controls="collapse<%=i%>"
                                        >
                                        <span>
                                            <ion-icon name="home-outline"></ion-icon>
                                        </span>
                                        <span>
                                            <small>Click Here</small>
                                        </span>
                                    </button>
                                </div>
                                <div class="col-4">
                                    <h5>Ware House 0<%=i%></h5>
                                </div>
                                <div class="col-5">
                                    <div
                                        class="progress"
                                        role="progressbar"
                                        aria-label="Basic example"
                                        aria-valuenow="25"
                                        aria-valuemin="0"
                                        aria-valuemax="100"
                                        >
                                        <%
                                            float fill = Float.parseFloat(whData.getString("StoredCapacity"));
                                            float full = Float.parseFloat(whData.getString("FullCapacity"));

                                            float perFill = (fill / full) * 100;
                                            float perFree = 100 - ((fill / full) * 100);
                                            String clr = null;
                                            String clr1 = null;
                                            if (perFill > 75) {
                                                clr = "bg-danger";
                                            } else if (perFill > 50) {
                                                clr = "bg-warning";
                                            } else {
                                                clr = "bg-success";
                                            }

                                            if (perFree > 75) {
                                                clr1 = "bg-danger";
                                            } else if (perFree > 50) {
                                                clr1 = "bg-warning";
                                            } else {
                                                clr1 = "bg-success";
                                            }


                                        %>
                                        <div class="progress-bar <%=clr%>" style="width: <%=perFill%>%">
                                            Filled Space : <%=perFill%>%
                                        </div>
                                    </div>
                                </div>
                                <div class="col-1"></div>
                            </div>
                            <!--Header Items End-->
                        </div>
                    </div>
                    <div
                        id="collapse<%=i%>"
                        class="accordion-collapse collapse show"
                        data-bs-parent="#accordionExample"
                        >
                        <div class="accordion-body">
                            <!--Body Items Start-->
                            <!--Ware house Deatails Start-->
                            <div class="row">
                                <div class="col-6">
                                    <div class="row">
                                        <div class="col">
                                            <div class="text-center wareHouseImg">
                                                <img
                                                    src="https://www.lifewire.com/thmb/YBQuRMKxxhx3Zb3uJ1x-QOT6VsM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/Maplocation_-5a492a4e482c52003601ea25.jpg"
                                                    alt=""
                                                    style="height: 200px; width: 200px"
                                                    />
                                            </div>
                                        </div>
                                        <div class="col">
                                            <div class="row mt-4">
                                                <div class="col-2 text-center">
                                                    <ion-icon name="home-outline"></ion-icon>
                                                </div>
                                                <div class="col-8">
                                                    <small><strong>Store ID : </strong><%=whData.getString("StockID")%></small>
                                                </div>
                                            </div>                                           
                                            <div class="row">
                                                <div class="col-2 text-center">
                                                    <ion-icon name="cube-outline"></ion-icon>
                                                </div>
                                                <div class="col-8">
                                                    <small
                                                        ><strong>Capacity : </strong> <%=whData.getString("FullCapacity")%> Units</small
                                                    >
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-2 text-center">
                                                    <ion-icon name="time-outline"></ion-icon>
                                                </div>
                                                <div class="col-8">
                                                    <small><strong>Work Hours : </strong> 8 Hours</small>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-2 text-center">
                                                    <ion-icon name="location-outline"></ion-icon>
                                                </div>
                                                <div class="col-8">
                                                    <small
                                                        ><strong>Address : </strong><%=whData.getString("Location")%></small
                                                    >
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-6">
                                    <div class="row">
                                        <div class="col"></div>
                                        <div class="col"></div>
                                        <div class="col">
                                            <div class="editbuttondiv">
                                                <button
                                                    type="button"
                                                    class="btn btn-secondary editbutton"
                                                    data-bs-toggle="modal"
                                                    data-bs-target="#staticBackdrop"
                                                    >
                                                    <span>
                                                        <ion-icon name="create-outline"></ion-icon>
                                                        <small>Edit</small>
                                                    </span>
                                                </button>
                                            </div>
                                        </div>
                                        <!--Pop up Start-->
                                        <div
                                            class="modal fade"
                                            id="staticBackdrop"
                                            data-bs-backdrop="static"
                                            data-bs-keyboard="false"
                                            tabindex="-1"
                                            aria-labelledby="staticBackdropLabel"
                                            aria-hidden="true"
                                            >
                                            <div class="modal-dialog">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <h1
                                                            class="modal-title fs-5"
                                                            id="staticBackdropLabel"
                                                            >
                                                            Edit Ware House
                                                        </h1>
                                                        <button
                                                            type="button"
                                                            class="btn-close"
                                                            data-bs-dismiss="modal"
                                                            aria-label="Close"
                                                            ></button>
                                                    </div>
                                                    <div class="modal-body">
                                                        <div class="row">
                                                            <div class="col">
                                                                <div class="form-floating mb-3">
                                                                    <input
                                                                        type="email"
                                                                        class="form-control"
                                                                        id="floatingInput"
                                                                        placeholder="name@example.com"
                                                                        />
                                                                    <label for="floatingInput">Store ID</label>
                                                                </div>
                                                            </div>
                                                            <div class="col">
                                                                <div class="form-floating mb-3">
                                                                    <input
                                                                        type="email"
                                                                        class="form-control"
                                                                        id="floatingInput"
                                                                        placeholder="name@example.com"
                                                                        />
                                                                    <label for="floatingInput">Contact No</label>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col">
                                                                <div class="form-floating mb-3">
                                                                    <input
                                                                        type="email"
                                                                        class="form-control"
                                                                        id="floatingInput"
                                                                        placeholder="name@example.com"
                                                                        />
                                                                    <label for="floatingInput">Capacity</label>
                                                                </div>
                                                            </div>
                                                            <div class="col">
                                                                <div class="form-floating mb-3">
                                                                    <input
                                                                        type="email"
                                                                        class="form-control"
                                                                        id="floatingInput"
                                                                        placeholder="name@example.com"
                                                                        />
                                                                    <label for="floatingInput">Work Hours</label>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="form-floating mb-3">
                                                                <input
                                                                    type="email"
                                                                    class="form-control"
                                                                    id="floatingInput"
                                                                    placeholder="name@example.com"
                                                                    />
                                                                <label for="floatingInput">Address</label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button
                                                            type="button"
                                                            class="btn btn-outline-warning"
                                                            >
                                                            Save Changes
                                                        </button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!--Pop up End-->
                                    </div>                                    
                                </div>
                            </div>
                        </div>
                        <br />
                        <!--Ware house Deatails End-->
                        <div class="row">
                            <div class="headline text-center">
                                <h5>Inventory Deatails</h5>
                            </div>
                        </div>
                        <div class="row">                            
                            <div class="Table">
                                <table class="table text-center">
                                    <thead>
                                    <th scope="col">Recived Date</th>
                                    <th scope="col">Product Id</th>
                                    <th scope="col">Product name</th>        
                                    <th scope="col">Quantitiy(Pieces)</th>
                                    </thead>                                     
                                    <tbody>
                                        <%
                                            while (itData.next()) {

                                        %>
                                        <tr class="table-light">                                            
                                            <td>12.06.2023</td>
                                            <td><%=itData.getString("itemID")%></td>
                                            <td><%=itData.getString("Name")%></td>                                           
                                            <td><%=itData.getString("Quantity")%></td>
                                        </tr>                                        

                                    </tbody>
                                </table>
                                <%
                                        j++;
                                    }
                                %>  
                                <div class="freecapasity">
                                    <div class="row">
                                        <div class="text-center">
                                            <h5>Available Free Space :</h5>
                                        </div>
                                        <div>
                                            <label><%=perFree%>%</label>
                                        </div>
                                    </div>
                                    <div
                                        class="progress"
                                        role="progressbar"
                                        aria-label="Basic example"
                                        aria-valuenow="50"
                                        aria-valuemin="0"
                                        aria-valuemax="100"
                                        >
                                        <div class="progress-bar <%=clr%>" style="width: <%=perFree%>%">
                                            <%=perFree%>%
                                        </div>
                                    </div>
                                    <br />
                                    <hr />
                                </div>
                            </div>
                        </div>
                        <!--Body items End-->
                    </div>
                </div>

                <%
                        i++;
                    }
                %>
                <!--Single Whare House  Div end-->

            </div>
        </div>
        <!--Ware Houses End-->
        <div class="row text-center">
            <!-- Button trigger modal -->
            <div class="col mb-3">
                <button type="button" class="btn btn-outline-success" style="width: 300px;" data-bs-toggle="modal" data-bs-target="#staticBackdrop2">
                    + ADD Ware House
                </button>
            </div>

            <!-- Modal -->
            <div class="modal fade" id="staticBackdrop2" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel2" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5" id="staticBackdropLabel">Add New Warehouse</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col">
                                    <div class="form-floating mb-3">
                                        <input
                                            type="email"
                                            class="form-control"
                                            id="floatingInput"
                                            placeholder="name@example.com"
                                            />
                                        <label for="floatingInput">Store ID</label>
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-floating mb-3">
                                        <input
                                            type="email"
                                            class="form-control"
                                            id="floatingInput"
                                            placeholder="name@example.com"
                                            />
                                        <label for="floatingInput">Contact No</label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <div class="form-floating mb-3">
                                        <input
                                            type="email"
                                            class="form-control"
                                            id="floatingInput"
                                            placeholder="name@example.com"
                                            />
                                        <label for="floatingInput">Capacity</label>
                                    </div>
                                </div>
                                <div class="col">
                                    <div class="form-floating mb-3">
                                        <input
                                            type="email"
                                            class="form-control"
                                            id="floatingInput"
                                            placeholder="name@example.com"
                                            />
                                        <label for="floatingInput">Work Hours</label>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="form-floating mb-3">
                                    <input
                                        type="email"
                                        class="form-control"
                                        id="floatingInput"
                                        placeholder="name@example.com"
                                        />
                                    <label for="floatingInput">Address</label>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">

                            <button type="button" class="btn btn-success">Add WareHouse</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>

