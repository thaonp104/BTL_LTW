<%-- 
    Document   : shop
    Created on : Dec 5, 2019, 12:51:36 AM
    Author     : Duck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.7/css/all.css">
        <link rel="stylesheet" href="css/shop.css">
        <title>Products</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <container class="margin-content">
            <div class="list_products">
                <div class="products_filter">
                    <div>Hiển thị từ 1 - trong tổng số  sản phẩm</div>
                    <select>
                        <option value="filter_normal">--Lọc sản phẩm theo--</option>
                        <option value="filter_price">Giá tăng dần</option>
                        <option value="opel">Giá giảm dần</option>
                        <option value="audi">Theo tên</option>
                    </select>
                </div>
                <div class="products_list">
                    
                </div>
            </div>
            <div class="list_catgories">
                
            </div>
        </container>
    
        <script src="js/shop.js"></script>
     
        <jsp:include page="footer.jsp"/>
    
    </body>
</html>
