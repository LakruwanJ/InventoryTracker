<%-- 
    Document   : newjsp
    Created on : Aug 5, 2023, 5:48:53 AM
    Author     : lakru
--%>
<%@page import="java.util.List"%>
<%@page import="app.classes.SKCls"%>
<%@page import="app.classes.RequestItemsDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Marketing Team DashBoard</title>

        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet"/>        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous"/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
        <script type="module"src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
        <link rel="stylesheet" href="skcss.css" />
    </head>
    <body>
        <div class="container">

            <br><br>            
            <div class="row">
                <h2>Manage Suppliers</h2><hr class="pt-0 pb-0">                
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3 pt-1">
                    <div class="card cardsFirstTW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="offcanvas" data-bs-target="#Requests">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-magnifying-glass"></i></h1></div>
                            <h2>Pending Request</h2>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3 pt-1">
                    <div class="card cardsFirstTW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="modal" data-bs-target="#sends">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-paper-plane"></i></h1></div>
                            <h2>Send Request</h2>                            
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3 pt-1">
                    <div class="card cardsFirstTW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="offcanvas" data-bs-target="#Transfers">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-plane-arrival"></i></h1></div>
                            <h2>Transfer History</h2>
                        </div>
                    </div>
                </div>
            </div>

            <br><br>            
            <div class="row">
                <h2>Manage Store</h2><hr class="pt-0 pb-0">                
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3">
                    <div class="card cardsFirstAW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="modal" data-bs-target="#add">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-plus"></i></h1></div>
                            <h2>Add item to Store</h2>
                        </div>
                    </div>
                </div>
            </div>

            <br><br>            
            <div class="row">               
                <h2>Manage Marketing team</h2><hr class="pt-0 pb-0">
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3 pt-1">
                    <div class="card cardsFirstTW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="offcanvas" data-bs-target="#Requestm">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-magnifying-glass"></i></h1></div>
                            <h2>Pending Request</h2>
                        </div>
                    </div>
                </div>                
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3 pt-1">
                    <div class="card cardsFirstTW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="modal" data-bs-target="#sendm">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-dolly"></i></h1></div>
                            <h2>Send item</h2>                            
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3 pt-1">
                    <div class="card cardsFirstTW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="offcanvas" data-bs-target="#Transferm">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-plane-departure"></i></h1></div>
                            <h2>Transfer History</h2>
                        </div>
                    </div>
                </div>
            </div>

            <br><br>

            <!--Table Start-->
            <div class="row">
                <!--Recently Added Products Table Start-->
                <div class="col-md-6">
                    <div class="text-center mt-2">
                        <h4>Recently Added products</h4>
                    </div>
                    <table class="table text-center">
                        <th scope="col">Added Date</th>
                        <th scope="col">Product Id</th>
                        <th scope="col">Product name</th>
                        <th scope="col">Product Image</th>
                        <th scope="col">Quantity(Pieces)</th>
                        <tr class="table-light">
                            <td>12.06.2023</td>
                            <td>P001</td>
                            <td>Blue Bird Shirt</td>
                            <td><img src="https://www.beverlystreet.lk/media/catalog/product/cache/1/small_image/320x/040ec09b1e35df139433887a97daa66f/5/5/5541.jpg"style="height: 30px; width: 30px" /></td>
                            <td>1000</td>
                        </tr>
                        <tr class="table-secondary">
                            <td>12.06.2023</td>
                            <td>P002</td>
                            <td>Blue Bird Jeans</td>
                            <td><img src="https://www.styledbysally.com.au/wp-content/uploads/2018/01/Classic-Blue-Men-Jeans-Pant-Cotton-Slim-Fit-Men-s-Denim-Pants-Stretch-Fashion-Mens-Clothes.jpg" style="height: 30px; width: 30px"/></td>
                            <td>800</td>
                        </tr>
                        <tr class="table-light">
                            <td>12.06.2023</td>
                            <td>P003</td>
                            <td>Yello Crispy T-Shirt</td>
                            <td><img src="https://5.imimg.com/data5/FW/GT/MY-23375112/men-s-yellow-color-t-shirt.jpg" style="height: 30px; width: 30px" /></td>
                            <td>650</td>
                        </tr>
                        <tr class="table-secondary">
                            <td>12.06.2023</td>
                            <td>P004</td>
                            <td>Black Skirts</td>
                            <td><img src="https://www.ubuy.com.lk/productimg/?image=aHR0cHM6Ly9tLm1lZGlhLWFtYXpvbi5jb20vaW1hZ2VzL0kvNjFmSXpDUW9kMEwuX0FDX1VMMTIzMF8uanBn.jpg" style="height: 30px; width: 30px"/></td>
                            <td>500</td>
                        </tr>
                        <tr class="table-light">
                            <td>12.06.2023</td>
                            <td>P005</td>
                            <td>Red Salvar</td>
                            <td><img src="https://singlekart.com/wp-content/uploads/2019/11/04-1.jpg" style="height: 30px; width: 30px" /></td>
                            <td>250</td>
                        </tr>
                    </table>
                </div>
                <!--Recently Added Products Table end-->

                <!--Recently Supplied Products Table Start-->
                <div class="col-md-6">
                    <div class="text-center mt-2">
                        <h4>Recently Added products</h4>
                    </div>
                    <table class="table text-center">
                        <th scope="col">Added Date</th>
                        <th scope="col">Product Id</th>
                        <th scope="col">Product name</th>
                        <th scope="col">Product Image</th>
                        <th scope="col">Quantity(Pieces)</th>
                        <tr class="table-light">
                            <td>12.06.2023</td>
                            <td>P001</td>
                            <td>Blue Bird Shirt</td>
                            <td><img src="https://www.beverlystreet.lk/media/catalog/product/cache/1/small_image/320x/040ec09b1e35df139433887a97daa66f/5/5/5541.jpg"style="height: 30px; width: 30px" /></td>
                            <td>1000</td>
                        </tr>
                        <tr class="table-secondary">
                            <td>12.06.2023</td>
                            <td>P002</td>
                            <td>Blue Bird Jeans</td>
                            <td><img src="https://www.styledbysally.com.au/wp-content/uploads/2018/01/Classic-Blue-Men-Jeans-Pant-Cotton-Slim-Fit-Men-s-Denim-Pants-Stretch-Fashion-Mens-Clothes.jpg" style="height: 30px; width: 30px"/></td>
                            <td>800</td>
                        </tr>
                        <tr class="table-light">
                            <td>12.06.2023</td>
                            <td>P003</td>
                            <td>Yello Crispy T-Shirt</td>
                            <td><img src="https://5.imimg.com/data5/FW/GT/MY-23375112/men-s-yellow-color-t-shirt.jpg" style="height: 30px; width: 30px" /></td>
                            <td>650</td>
                        </tr>
                        <tr class="table-secondary">
                            <td>12.06.2023</td>
                            <td>P004</td>
                            <td>Black Skirts</td>
                            <td><img src="https://www.ubuy.com.lk/productimg/?image=aHR0cHM6Ly9tLm1lZGlhLWFtYXpvbi5jb20vaW1hZ2VzL0kvNjFmSXpDUW9kMEwuX0FDX1VMMTIzMF8uanBn.jpg" style="height: 30px; width: 30px"/></td>
                            <td>500</td>
                        </tr>
                        <tr class="table-light">
                            <td>12.06.2023</td>
                            <td>P005</td>
                            <td>Red Salvar</td>
                            <td><img src="https://singlekart.com/wp-content/uploads/2019/11/04-1.jpg" style="height: 30px; width: 30px" /></td>
                            <td>250</td>
                        </tr>
                        <tr class="table-secondary"></tr>
                        <tr class="table-light"></tr>
                        <tr class="table-secondary"></tr>
                    </table>
                </div>
                <!--Recently Supplied Products Table Start-->
            </div>



            <!--model start-->    
            <!--Send req start-->
            <div class="modal fade" id="sends" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable" >
                    <div class="modal-content w-150">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5">Send Request to Supplier</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                        </div>
                        <div class="modal-body">
                            <form class="will-validated" action="InsertRequest" method="post">
                                <div class="row">
                                    <label class="form-label">Select Product ID</label>
                                    <select class="form-select  mb-3 required" id="itemId" onchange="displaySelectedItemId()" name="itemID">
                                        <%
                                            SKCls SK1 = new SKCls();
                                            List<String> itemIds = SK1.getAllItemIds();
                                            for (String ItemId : itemIds) {
                                        %>
                                        <option value="<%= ItemId%>"><%= ItemId%></option>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>                
                                <div class="row">
                                    <label class="form-label">Select Supplier</label>
                                    <select class="form-select  mb-3 required" id="supId" onchange="displaySelectedsupId()" name="supID">            
                                        <%
                                            SKCls SK2 = new SKCls();
                                            List<String> supIds = SK2.getAllSupplierIds();
                                            for (String sid : supIds) {
                                        %>
                                        <option value="<%=sid%>"><%=sid%></option>
                                        <%
                                            }
                                        %>                                     
                                    </select>
                                </div>
                                <div class="row">                                    
                                    <div class=""col>
                                        <div class="row mt-4"><h5>Your Request Details: </h5></div>
                                        <div class="row">
                                            <div class="col-4 mt-2">
                                                <script>
                                                    function displaySelectedItemId() {
                                                        var selectedItem = document.getElementById("itemId").value;
                                                        var resultLabel = document.getElementById("resultLabel");
                                                        resultLabel.textContent = "Item ID: " + selectedItem;
                                                    }
                                                </script>
                                                <p id="resultLabel"></p>
                                            </div>
                                            <div class="col-4 mt-2">
                                                <script>
                                                    function displaySelectedsupId() {
                                                        var selectedItem = document.getElementById("supId").value;
                                                        var resultLabe2 = document.getElementById("resultLabe2");
                                                        resultLabe2.textContent = "Supplier ID: " + selectedItem;
                                                    }
                                                </script>
                                                <p id="resultLabe2"></p>
                                            </div>
                                            <div class="col-4 text-center" style="margin-top: -35px;">
                                                <label class="form-label">Quantity</label>
                                                <div class="input-group" id="quantity" name="quantity">
                                                    <input type="text" class="form-control" id="quantity" name="quantity" >
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <hr>
                                <div>
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Discard</button>
                                    <button class="btn btn-primary" type="submit" value="Submit">Request</button>
                                </div>
                            </form>
                            <div id="result"></div>                            
                        </div>

                    </div>
                </div>
            </div>
            <!--Send req end-->   

            <!--Add items to store start-->
            <div class="modal fade" id="add" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable" >
                    <div class="modal-content w-150">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5">Add Item to Store</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                        </div>
                        <div class="modal-body">
                            <form class="validated">
                                <div class="row">
                                    <label class="form-label">Choose Available Product</label>
                                    <select class="form-select  mb-3" required a>            
                                        <%
                                            SKCls SK3 = new SKCls();
                                            for (String ItemId : itemIds) {
                                        %>
                                        <option value="<%= ItemId%>"><%= ItemId%></option>
                                        <%
                                            }
                                        %>                     
                                    </select>
                                </div>
                                <br>
                                <div class="row">
                                    <label class="form-label">Select Ware Houses</label>
                                    <select class="form-select  mb-3" required a>

                                        <%
                                            SKCls SK4 = new SKCls();
                                            List<String> WHIds = SK4.getAllWHID();
                                            List<Integer> ACS = SK4.getAC();
                                            for (int i = 0; i < WHIds.size(); i++) {
                                                String WHId = WHIds.get(i);
                                                int Ac = ACS.get(i);
                                        %>
                                        <option value="<%= WHId%>">
                                        <table>
                                            <tbody>
                                                <tr>
                                                    <td><%= WHId%></td>
                                                    <td>Available Space:</td>
                                                    <td><%= Ac%></td>
                                                </tr>
                                            </tbody>
                                        </table>
                                        </option>
                                        <%
                                            }
                                        %>

                                    </select>
                                </div>
                                <div class="row">
                                    <label class="form-label">Quantity</label>
                                    <div class="input-group" id="quantity" name="quantity">
                                        <input type="text" class="form-control" id="quantity" name="quantity" >
                                    </div>
                                </div>
                                <!--Select ware House Start-->
                                <!--New Ware House-->
                                <!--                                <div class="row">
                                                                    <div class="col-8">
                                                                        <div class="row">
                                                                            <div class="col-4 mt-1">
                                                                                <input type="checkbox" class="btn-check" id="btn-check1" autocomplete="off">
                                                                                <label class="btn btn-outline-primary" for="btn-check1" id="WH001">WH001</label>
                                                                            </div>
                                                                            <div class="col-8">
                                                                                <label class="">Available Space</label>
                                                                                <div class="progress" role="progressbar" aria-label="Basic example" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">
                                                                                    <div class="progress-bar" style="width: 75%"></div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    <div class="col-4" id="WHOO1D" style="display: none; margin-top: -20px; ">
                                                                        <label class="form-label">Quantity</label>
                                                                        <div class="input-group" id="quantity" name="quantity">
                                                                            <input type="number" class="form-control" id="quantity" name="quantity" >
                                                                        </div>
                                                                        <script>
                                                                            const generateButtonWH001 = document.getElementById('WH001');
                                                                            const generatedDivWH001 = document.getElementById('WHOO1D');
                                                                            let isDivWH001Visible = false;
                                
                                                                            generateButtonWH001.addEventListener('click', () => {
                                                                                if (isDivWH001Visible) {
                                                                                    generatedDivWH001.style.display = 'none';
                                                                                    isDivWH001Visible = false;
                                                                                } else {
                                                                                    generatedDivWH001.style.display = 'block';
                                                                                    isDivWH001Visible = true;
                                                                                }
                                                                            });
                                                                        </script>
                                                                    </div>
                                                                </div> 
                                                                New Ware House
                                                                <div class="row">
                                                                    <div class="col-8">
                                                                        <div class="row">
                                                                            <div class="col-4 mt-1">
                                                                                <input type="checkbox" class="btn-check" id="btn-check2" autocomplete="off">
                                                                                <label class="btn btn-outline-primary" for="btn-check2" id="WH002">WH002</label>
                                                                            </div>
                                                                            <div class="col-8">
                                                                                <label class="">Available Space</label>
                                                                                <div class="progress" role="progressbar" aria-label="Basic example" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100">
                                                                                    <div class="progress-bar" style="width: 75%"></div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    <div class="col-4" id="WHOO2D" style="display: none; margin-top: -20px; ">
                                                                        <label class="form-label">Quantity</label>
                                                                        <div class="input-group" id="quantity" name="quantity">
                                                                            <input type="number" class="form-control" id="quantity" name="quantity" >
                                                                        </div>
                                                                        <script>
                                                                            const generateButtonWH002 = document.getElementById('WH002');
                                                                            const generatedDivWH002 = document.getElementById('WHOO2D');
                                                                            let isDivWH002Visible = false;
                                
                                                                            generateButtonWH002.addEventListener('click', () => {
                                                                                if (isDivWH002Visible) {
                                                                                    generatedDivWH002.style.display = 'none';
                                                                                    isDivWH002Visible = false;
                                                                                } else {
                                                                                    generatedDivWH002.style.display = 'block';
                                                                                    isDivWH002Visible = true;
                                                                                }
                                                                            });
                                                                        </script>
                                                                    </div>
                                                                </div>    -->
                                <!--Select ware House End-->

                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Discard</button>
                            <button type="button" class="btn btn-primary">Add To Store</button>
                        </div>
                    </div>
                </div>
            </div>
            <!--Add items to store end-->

            <!--Send item-->
            <div class="modal fade" id="sendm" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable" >
                    <div class="modal-content w-150">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5">Send Item to Marketing Team</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                        </div>
                        <div class="modal-body">
                            <form class="was-validated">
                                <div class="row">
                                    <label class="form-label">Select Product Name</label>
                                    <select class="form-select  mb-3" required a>            
                                        <option value="1">Name 1</option>
                                        <option value="2">Name 2</option>
                                    </select>
                                </div>                                
                                <br><div class="row">
                                    <div class="col-12">
                                        <label class="form-label">Unit price</label>
                                        <div class="input-group mb-3">
                                            <input type="text" class="form-control" disabled>
                                            <span class="input-group-text">.00</span>
                                        </div>
                                    </div>
                                </div>                                 
                                <div class="row">
                                    <label class="form-label">Select Marketing Team Member</label>
                                    <select class="form-select  mb-3" required a>            
                                        <option value="1">Store Keeper 1</option>
                                        <option value="2">Store Keeper 2</option>
                                    </select>
                                </div>                                
                                <br><div class="row">
                                    <div class="mb-2">
                                        <label class="form-label">Quantity</label>
                                        <div class="input-group">
                                            <input type="text" class="form-control" id="basic-url">
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Discard</button>
                            <button type="button" class="btn btn-primary">Send</button>
                        </div>
                    </div>
                </div>
            </div>
            <!--Send Item--> 
            <!--model end-->

            <!--off canvas start-->   
            <!--Pending Request supplier start-->
            <div class="offcanvas offcanvas-start" data-bs-backdrop="static" tabindex="-1" id="Requests" style="width: 100%;">
                <div class="offcanvas-header">
                    <h3 class="offcanvas-title">Pending Request With Supplier </h3>
                    <button type="button" class="btn-close" data-bs-dismiss="offcanvas"></button>
                </div>
                <div class="offcanvas-body">
                    <div>
                        <div class="col tableBody">
                            <table class="table text-center">
                                <th scope="col">Added Date</th>
                                <th scope="col">Product Id</th>
                                <th scope="col">Product name</th>
                                <th scope="col">Product Image</th>
                                <th scope="col">Quantity(Pieces)</th>
                                <tr class="table-light">
                                    <td>12.06.2023</td>
                                    <td>P001</td>
                                    <td>Blue Bird Shirt</td>
                                    <td><img src="https://www.beverlystreet.lk/media/catalog/product/cache/1/small_image/320x/040ec09b1e35df139433887a97daa66f/5/5/5541.jpg"style="height: 30px; width: 30px" /></td>
                                    <td>1000</td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!--View Request supplier End-->

            <!--Pending Request Marketing team start-->
            <div class="offcanvas offcanvas-start" data-bs-backdrop="static" tabindex="-1" id="Requestm" style="width: 100%;">
                <div class="offcanvas-header">
                    <h3 class="offcanvas-title">Pending Request From Marketing team  </h3>
                    <button type="button" class="btn-close" data-bs-dismiss="offcanvas"></button>
                </div>
                <div class="offcanvas-body">
                    <div>
                        <div class="col tableBody">
                            <table class="table text-center">
                                <th scope="col">Added Date</th>
                                <th scope="col">Product Id</th>
                                <th scope="col">Product name</th>
                                <th scope="col">Product Image</th>
                                <th scope="col">Quantity(Pieces)</th>
                                <tr class="table-light">
                                    <td>12.06.2023</td>
                                    <td>P001</td>
                                    <td>Blue Bird Shirt</td>
                                    <td><img src="https://www.beverlystreet.lk/media/catalog/product/cache/1/small_image/320x/040ec09b1e35df139433887a97daa66f/5/5/5541.jpg"style="height: 30px; width: 30px" /></td>
                                    <td>1000</td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!--View Request Marketing team End-->

            <!--Transfer History supplier start-->
            <div class="offcanvas offcanvas-start" data-bs-backdrop="static" tabindex="-1" id="Transfers" style="width: 100%;">
                <div class="offcanvas-header">
                    <h3 class="offcanvas-title">Transfer History With Suppliers</h3>
                    <button type="button" class="btn-close" data-bs-dismiss="offcanvas"></button>
                </div>
                <div class="offcanvas-body">
                    <div>
                        <div class="col tableBody">
                            <table class="table text-center">
                                <th scope="col">Added Date</th>
                                <th scope="col">Product Id</th>
                                <th scope="col">Product name</th>
                                <th scope="col">Product Image</th>
                                <th scope="col">Quantity(Pieces)</th>
                                <tr class="table-light">
                                    <td>12.06.2023</td>
                                    <td>P001</td>
                                    <td>Blue Bird Shirt</td>
                                    <td><img src="https://www.beverlystreet.lk/media/catalog/product/cache/1/small_image/320x/040ec09b1e35df139433887a97daa66f/5/5/5541.jpg"style="height: 30px; width: 30px" /></td>
                                    <td>1000</td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!--Transfer History supplier End-->

            <!--Transfer History Marketing team start-->
            <div class="offcanvas offcanvas-start" data-bs-backdrop="static" tabindex="-1" id="Transferm" style="width: 100%;">
                <div class="offcanvas-header">
                    <h3 class="offcanvas-title">Transfer History With Marketing Team</h3>
                    <button type="button" class="btn-close" data-bs-dismiss="offcanvas"></button>
                </div>
                <div class="offcanvas-body">
                    <div>
                        <div class="col tableBody">
                            <table class="table text-center">
                                <th scope="col">Added Date</th>
                                <th scope="col">Product Id</th>
                                <th scope="col">Product name</th>
                                <th scope="col">Product Image</th>
                                <th scope="col">Quantity(Pieces)</th>
                                <tr class="table-light">
                                    <td>12.06.2023</td>
                                    <td>P001</td>
                                    <td>Blue Bird Shirt</td>
                                    <td><img src="https://www.beverlystreet.lk/media/catalog/product/cache/1/small_image/320x/040ec09b1e35df139433887a97daa66f/5/5/5541.jpg"style="height: 30px; width: 30px" /></td>
                                    <td>1000</td>
                                </tr>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <!--Transfer History Marketing team End-->
            <!--off canvas end-->  

        </div>
    </body>
</html>