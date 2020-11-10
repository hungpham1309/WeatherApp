<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <title>Weather App</title>
    <meta charset="UTF-8" />
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <link
            rel="stylesheet"
            href="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>"
    />
</head>

<body>
<div class="container">
    <div class="form_wrapper">
        <form action="search" method="post" class="search_form">
            <input
                    type="search"
                    id="search"
                    name="search"
                    placeholder="Search..."
                    class="search_input"
            />
            <input type="submit" value="Search" />
        </form>
    </div>
    <div class="items_wrapper">
        <div class="weather_item">
            <div class="section_1">
                <i class="fa fa-cloud" style="font-size: 36px;"></i>
            </div>
            <div class="section_2">
                <p class="country_name">Singapore</p>
                <p class="date_info">April 20, 2015</p>
            </div>
            <div class="section_3">
                <p class="temperature_info">
                    <span class="temperature_degree">11.2°C</span> Clouds
                </p>
                <p class="mixed_info">4.21 m/s. 76%, 1027.2 hpa</p>
            </div>
            <div class="section_4">
                <button class="delete_button" type="button">Delete</button>
            </div>
        </div>

        <div class="weather_item">
            <div class="section_1">
                <i class="fa fa-cloud" style="font-size: 36px;"></i>
            </div>
            <div class="section_2">
                <p class="country_name">Singapore</p>
                <p class="date_info">April 20, 2015</p>
            </div>
            <div class="section_3">
                <p class="temperature_info">
                    <span class="temperature_degree">11.2°C</span> Clouds
                </p>
                <p class="mixed_info">4.21 m/s. 76%, 1027.2 hpa</p>
            </div>
            <div class="section_4">
                <button class="delete_button" type="button">Delete</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>

