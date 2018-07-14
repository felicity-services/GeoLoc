# Quick start

cURL request example :
  
    curl -X GET \https://api.geoloc.felicity-services.com/json/52.210.46.250 \-H 'ACCESS-KEY: YOUR_ACCESS_KEY'
    
    =>  This request is an example and it's limited by ip address
    =>  You can use an Api REST client like Postman to test it.

Php example code:

   - simple php curl code           GeoLoc/PHP/simple_curl.php
   
   - simple php pecl code           GeoLoc/PHP/simple_pecl_http.php
   
JavaScript example code:
   
   - simple JavaScript ajax code    https://github.com/felicity-services/GeoLoc/PHP/simple_ajax.js
   
   - simple JavaScript xhr code     https://github.com/felicity-services/GeoLoc/PHP/simple_xhr.js
   
   

Get free access key @ https://geoloc.felicity-services.com/signup

You can use our api without access key

    Try : https://api.geoloc.felicity-services.com 
    
You can specify ip v4 address 

    Try : https://api.geoloc.felicity-services.com/52.210.46.250
    
You can also specify response format json or xml

    Try : https://api.geoloc.felicity-services.com/json
    
    Or  : https://api.geoloc.felicity-services.com/xml
          

     Without using access key the number of request is limited by ip address.
     => Max request per month = 10'000
     You can get a free access key @ https://geoloc.felicity-services.com/signup to get 30'000 request per month
