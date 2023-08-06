<!DOCTYPE html>
<html lang="en" title="Coding design">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <link rel="stylesheet" href="css/dispatchGoods.css">
    <title>Dispatch goods</title>
</head>

<body>
 <main>
    <div class="table">
        <div class="table__header">
            <h2>Dispatch good details</h2>
            <div class="input-group">
                <input type="search" placeholder="Search Data...">
                <img src="img/search.png" alt="">
            </div>
           
           </div>
        <div class="table__body">
            <table>
                <thead>
                    <tr>
                       <th> Product<br> Id</th>
                        <th> Product<br>Name</th>
                        <th> Quantity </th>
                        <th> Dispatch<br>No. </th>                         
                        <th> <br> Date </th>
                        <th> Time </th>
                        <th> Status </th>
                        <th> Price </th>
                        <th> Storage<br> Location</th>
                       </tr>
                </thead>
                <tbody>
                    <tr>
                       <td> P001 </td>
                        <td> <img src="img/frock.png" alt="">Frock</td>
                        <td> 3 </td>
                        <td> 3 </td>

                        <td> 17 Dec, 2023 </td>
                        <td> 11:30 pm </td>
                        <td>
                            <p class="status delivered">Completed</p>
                        </td>
                        <td> <strong>$128.90 </strong></td>
                        <td> Store 1 </td>

                    </tr>
                    <tr>
                       <td> P002 </td>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 1 </td>
                        <td> 3 </td>

                        <td> 27 Aug, 2023 </td>
                        <td> 11:30 pm </td>

                        <td>
                            <p class="status cancelled">Processing</p>
                        </td>
                        <td> <strong>$5350.50</strong> </td>
                        <td> Store 4 </td>
                    </tr>
                    <tr>
                       <td> P003 </td>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 2 </td>
                        <td> 3 </td>

                        <td> 14 Mar, 2023 </td>
                        <td> 11:30 pm </td>

                        <td>
                            <p class="status pending">Pending</p>
                        </td>
                        <td> <strong>$210.40</strong> </td>
                        <td> Store 2 </td>
                    </tr>
                    <tr>
                       <td> P004 </td>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 3 </td>
                        <td> 3 </td>

                        <td> 25 May, 2023 </td>
                        <td> 11:30 pm </td>

                        <td>
                            <p class="status delivered">Completed</p>
                        </td>
                        <td> <strong>$149.70</strong> </td>
                        <td> Store 2 </td>
                    </tr>
                    <tr>
                       <td> P005 </td>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 2 </td>
                        <td> 3 </td>

                        <td> 23 Apr, 2023 </td>
                        <td> 11:30 pm </td>

                        <td>
                            <p class="status pending">Pending</p>
                        </td>
                        <td> <strong>$399.99</strong> </td>
                        <td> Store 3 </td>
                    </tr>
                    <tr>
                       <td> P006 </td>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 1 </td>
                        <td> 3 </td>

                        <td> 23 Apr, 2023 </td>
                        <td> 11:30 pm </td>

                        <td>
                            <p class="status cancelled">Processing</p>
                        </td>
                        <td> <strong>$399.99</strong> </td>
                        <td> Store 4 </td>
                    </tr>
                    <tr>
                       <td> P007 </td>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 5 </td>
                        <td> 3 </td>

                        <td> 20 May, 2023 </td>
                        <td> 11:30 pm </td>

                        <td>
                            <p class="status delivered">Completed</p>
                        </td>
                        <td> <strong>$399.99</strong> </td>
                        <td> Store 2 </td>
                    </tr>
                    <tr>
                       <td> P008 </td>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 2 </td>
                        <td> 3 </td>

                        <td> 30 Feb, 2023 </td>
                        <td> 11:30 pm </td>

                        <td>
                            <p class="status pending">Pending</p>
                        </td>
                        <td> <strong>$149.70</strong> </td>
                        <td> Store 3 </td>
                    </tr>
                    <tr>
                       <td> P009 </td>
                        <td><img src="img/frock.png" alt="">Frock</td>
                        <td> 3 </td>
                        <td> 3 </td>

                        <td> 22 Dec, 2023 </td>
                        <td> 11:30 pm </td>

                        <td>
                            <p class="status cancelled">Processing</p>
                        </td>
                        <td> <strong>$249.99</strong> </td>
                        <td> Store 2 </td>
                    </tr>
                </tbody>
            </table>
         </div>
         </div>
         <div class="table">
           <div class="table__header">
               <h2>Dispatch details</h2>
               <div class="input-group">
                   <input type="search" placeholder="Search Data...">
                   <img src="img/search.png" alt="">
               </div>
              
              </div>
           <div class="table__body">
               <table>
                   <thead>
                       <tr>
                           <th> Dispatch No </th>
                           <th> Receipient Name </th>                         
                           <th> Address</th>
                           <th> Contact No. </th>
                           <th> Confirm</th>
                          </tr>
                   </thead>
                   <tbody>
                       <tr>
                         
                           <td> D001 </td>
                           <td> John David </td>   
                           <td> No:12,Flower Street,Kandy. </td>
                           <td> 0123456789 </td>
                           <td><input type="checkbox" checked> </td>

                       </tr>
                       <tr>
                           <td> D002 </td>
                           <td> John David </td>   
                           <td> No:12,Flower Street,Kandy. </td>
                           <td> 0123456789 </td>
                           <td><input type="checkbox" checked> </td>
                       </tr>
                       <tr>
                           <td> D003 </td>
                           <td> John David </td>   
                           <td> No:12,Flower Street,Kandy. </td>
                           <td> 0123456789 </td>
                           <td><input type="checkbox" checked> </td>
                          
                       </tr>
                       <tr>
                           <td> D004 </td>
                           <td> John David </td>   
                           <td> No:12,Flower Street,Kandy. </td>
                           <td> 0123456789 </td>
                           <td><input type="checkbox" checked> </td>
                           
                       </tr>
                       <tr>
                           <td> D005 </td>
                           <td> John David </td>   
                           <td> No:12,Flower Street,Kandy. </td>
                           <td> 0123456789 </td>
                           <td><input type="checkbox" checked> </td>
                       </tr>
                       <tr>
                           <td> D006 </td>
                           <td> John David </td>   
                           <td> No:12,Flower Street,Kandy. </td>
                           <td> 0123456789 </td>
                           <td><input type="checkbox" checked> </td>
                           
                       </tr>
                       <tr>
                           <td> D007 </td>
                           <td> John David </td>   
                           <td> No:12,Flower Street,Kandy. </td>
                           <td> 0123456789 </td>
                           <td><input type="checkbox" checked> </td>
                           
                       </tr>
                       <tr>
                           <td> D008 </td>
                           <td> John David </td>   
                           <td> No:12,Flower Street,Kandy. </td>
                           <td> 0123456789 </td>
                           <td><input type="checkbox" checked> </td>
                           
                       </tr>
                       <tr>
                           <td> D009 </td>
                           <td> John David </td>   
                           <td> No:12,Flower Street,Kandy. </td>
                           <td> 0123456789 </td>   
                          <td><input type="checkbox" checked> </td>
                       </tr>
                   </tbody>
               </table>
        
       </div>
   </div>
     </main>
       
      

    <script src="script.js"></script>
</body>

</html>