<%-- 
    Document   : map
    Created on : Dec 8, 2019, 11:58:07 PM
    Author     : Duck
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/map.css">
        <title>Địa chỉ</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <div class="container margin-content">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3725.3024241109074!2d105.78573631548312!3d20.9805109947983!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135accdd8a1ad71%3A0xa2f9b16036648187!2zSOG7jWMgdmnhu4duIGLGsHUgY2jDrW5oIHZp4buFbiB0aMO0bmcgUHRpdA!5e0!3m2!1sen!2s!4v1575823843594!5m2!1sen!2s" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
            <div class="address_infor">
                <h1>Come with us</h1>
                <h3>ĐỊA CHỈ :  
                    <span>Km10, đường Nguyễn Trãi, P.Mộ Lao, Q.Hà Đông, Hà Nội (Số 96 Trần Phú, Quận Hà Đông, Thành phố Hà Nội)</span>
                </h3>
            </div>
        </div>
        <jsp:include page="footer.jsp"/>
    </body>
</html>
