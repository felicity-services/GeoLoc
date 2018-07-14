var data = null;

var xhr = new XMLHttpRequest();
xhr.withCredentials = true;

xhr.addEventListener("readystatechange", function () {
  if (this.readyState === 4) {
    console.log(this.responseText);
  }
});

xhr.open("GET", "https://api.geoloc.felicity-services.com/json/52.210.46.250");
xhr.setRequestHeader("ACCESS-KEY", "YOUR_ACCESS_KEY");

xhr.send(data);
