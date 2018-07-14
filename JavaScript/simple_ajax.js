var settings = {
  "async": true,
  "crossDomain": true,
  "url": "https://api.geoloc.felicity-services.com/json/52.210.46.250",
  "method": "GET",
  "headers": {
    "ACCESS-KEY": "YOUR_ACCESS_KEY"
  }
}

$.ajax(settings).done(function (response) {
  console.log(response);
});
