<%-- 
    Document   : newjsp
    Created on : Aug 5, 2023, 5:48:53 AM
    Author     : lakru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Admin DashBoard</title>

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

                <h2>Manage System Users</h2><hr class="pt-0 pb-0">  
                <div class="col-lg-4 col-md-6 col-sm-6 text-center p-3">
                    <div class="card cardsFirstAW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="modal" data-bs-target="#add">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-plus"></i></h1></div>
                            <h2>Add Member</h2>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-6 text-center p-3">
                    <div class="card cardsFirstFW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="modal" data-bs-target="#remove">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-trash"></i></h1></div>
                            <h2>Remove Member</h2>
                        </div>
                    </div>
                </div> 

            </div>

            <!--model start-->
            <!--add member-->
            <div class="modal fade" id="add" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable" >
                    <div class="modal-content w-150">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5">Add New Member</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                        </div>
                        <div class="modal-body">
                            <form class="was-validated">
                                <div class="row">
                                    <div class="mb-3">
                                        <label class="form-label">Create UserName</label>
                                        <div class="input-group">
                                            <span class="input-group-text" id="basic-addon3">UserName</span>
                                            <input type="text" class="form-control">
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="mb-3">
                                        <label class="form-label">Create Password</label>

                                        <span class="input-group-text" id="basic-addon3">Password</span>
                                        <input type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="row">
                                    <label class="form-label">Select Supplier</label>
                                    <div class="input-group">
                                        <select class="form-select  mb-3" required a>            
                                            <option value="1">Supplier</option>
                                            <option value="2">Store Keeper</option>
                                            <option value="2">Marketing Team Member</option>
                                            <option value="2">System Admin</option>
                                        </select>
                                    </div>
                                </div>
                            </form>
                        </div>

                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Discard</button>
                            <button type="button" class="btn btn-primary">Add User</button>
                        </div>
                    </div>
                </div>
            </div>
            <!--add member-->

            <!--remove member-->
            <div class="modal fade" id="remove" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable" >
                    <div class="modal-content w-150">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5">Remove Member</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                        </div>
                        <div class="modal-body">
                            <form class="was-validated">
                                <div class="row">
                                    <div class="mb-3">
                                        <label class="form-label">Select UserName</label>
                                        <div class="input-group">
                                            <span class="input-group-text" id="basic-addon3">UserName</span>
                                            <input type="text" class="form-control">
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Discard</button>
                            <button type="button" class="btn btn-primary">Remove User</button>
                        </div>
                    </div>
                </div>
            </div>
            <!--remove member-->   
            <!--model end-->

            <br><br>
            <div class="row">

                <h2>Manage Suppliers</h2><hr class="pt-0 pb-0">
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3">
                    <div class="card cardsFirstTS mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="offcanvas" data-bs-target="#staticBackdropAP">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-eye"></i></h1></div>
                            <h2>View all item</h2>
                        </div>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3">
                    <div class="card cardsFirstTW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="offcanvas" data-bs-target="#Transfer">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-plane-arrival"></i></h1></div>
                            <h2>Transfer History</h2></div>
                    </div>
                </div>
            </div>

            <!--off canvas start--> 
            <!--Product list start-->
            <div class="offcanvas offcanvas-start" data-bs-backdrop="static" tabindex="-1" id="staticBackdropAP" style="width: 100%;">
                <div class="offcanvas-header">
                    <h3 class="offcanvas-title">Product list</h3>
                    <button type="button" class="btn-close" data-bs-dismiss="offcanvas" "></button>
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
            <!--Product list End-->

            <!--View Transfer History suppliers start-->
            <div class="offcanvas offcanvas-start" data-bs-backdrop="static" tabindex="-1" id="Transfer" style="width: 100%;">
                <div class="offcanvas-header">
                    <h3 class="offcanvas-title" >All Transfer History of Suppliers</h3>
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
            <!--View Transfer History for suppliers End-->
            <!--off canvas end-->  

            <br><br>
            <div class="row">
                <h2>Manage Stores</h2><hr class="pt-0 pb-0">
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3">
                    <a href="wareHouses.html" style="text-decoration: none">
                        <div class="card cardsFirstTS mt-2 pt-2" style="width: 100%" type="button">
                            <div class="card-body">
                                <div class="iconInCard"><h1><i class="fa-solid fa-store"></i></h1></div>
                                <h2>Check store</h2>
                            </div>
                        </div>
                    </a>
                </div>
            </div>

            <br><br>
            <div class="row">
                <h2>Manage Marketing Team</h2><hr class="pt-0 pb-0">
                <div class="col-lg-4 col-md-6 col-sm-12 text-center p-3">
                    <div class="card cardsFirstTW mt-2 pt-2" style="width: 100%" type="button" data-bs-toggle="offcanvas" data-bs-target="#Transferm">
                        <div class="card-body">
                            <div class="iconInCard"><h1><i class="fa-solid fa-plane-departure"></i></h1></div>
                            <h2>Transfer History</h2>
                        </div>
                    </div>
                </div>
            </div>

            <!--off canvas start-->  
            <!--Transfer History start-->
            <div class="offcanvas offcanvas-start" data-bs-backdrop="static" tabindex="-1" id="Transferm" style="width: 100%;">
                <div class="offcanvas-header">
                    <h3 class="offcanvas-title" id="staticBackdropLabel">All Transfer History of Marketing Teams</h3>
                    <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
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
            <!--Transfer History End-->
            <!--off canvas end-->  



        </div>
    </body>
</html>

