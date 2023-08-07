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

<body>.
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
            <h1>Order Status</h1>
            <div class="input-group">
                <input type="search" placeholder="Search Data...">
                <img src="img/search.png" alt="">
            </div>
            
           </div>
        <div class="table__body">
            <table>
                <thead>
                    <tr>
                        <th> Product Name<span class="icon-arrow">&UpArrow;</span></th>
                        <th> Quantity <span class="icon-arrow">&UpArrow;</span></th>
                        <th> Order Date <span class="icon-arrow">&UpArrow;</span></th>
                        <th> Status <span class="icon-arrow">&UpArrow;</span></th>
                        <th> Price <span class="icon-arrow">&UpArrow;</span></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        
                        <td> <img src="img/frock.png" alt="">Frock</td>
                        <td> 4 </td>
                        <td> 17 Dec, 2023 </td>
                        <td>
                            <p class="status delivered">Delivered</p>
                        </td>
                        <td> <strong>$128.90 </strong></td>
                    </tr>
                    <tr>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 7 </td>
                        <td> 27 Aug, 2023 </td>
                        <td>
                            <p class="status cancelled">Cancelled</p>
                        </td>
                        <td> <strong>$5350.50</strong> </td>
                    </tr>
                    <tr>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 10 </td>
                        <td> 14 Mar, 2023 </td>
                        <td>
                            <p class="status delivered">Delivered</p>
                        </td>
                        <td> <strong>$210.40</strong> </td>
                    </tr>
                    <tr>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 8 </td>
                        <td> 25 May, 2023 </td>
                        <td>
                            <p class="status delivered">Delivered</p>
                        </td>
                        <td> <strong>$149.70</strong> </td>
                    </tr>
                    <tr>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 2 </td>
                        <td> 23 Apr, 2023 </td>
                        <td>
                            <p class="status pending">Pending</p>
                        </td>
                        <td> <strong>$399.99</strong> </td>
                    </tr>
                    <tr>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 9 </td>
                        <td> 23 Apr, 2023 </td>
                        <td>
                            <a href="a.jsp"><p class="status cancelled">Cancelled</p></a>
                        </td>
                        <td> <strong>$399.99</strong> </td>
                    </tr>
                    <tr>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 16 </td>
                        <td> 20 May, 2023 </td>
                        <td>
                            <p class="status delivered">Delivered</p>
                        </td>
                        <td> <strong>$399.99</strong> </td>
                    </tr>
                    <tr>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 23 </td>
                        <td> 30 Feb, 2023 </td>
                        <td>
                            <p class="status pending">Pending</p>
                        </td>
                        <td> <strong>$149.70</strong> </td>
                    </tr>
                    <tr>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 55 </td>
                        <td> 22 Dec, 2023 </td>
                        <td>
                            <p class="status cancelled">Cancelled</p>
                        </td>
                        <td> <strong>$249.99</strong> </td>
                    </tr>
                </tbody>
            </table>
           </div>
       </div>
   
    </main>
       <script src="script.js"></script>
</body>

</html>