OkHttpClient client = new OkHttpClient();

Request request = new Request.Builder()
  .url("https://api.geoloc.felicity-services.com/json/52.210.46.250")
  .get()
  .addHeader("ACCESS-KEY", "YOUR_ACCESS_KEY")
  .addHeader("Cache-Control", "no-cache")
  .addHeader("Postman-Token", "46029e6b-6588-47b7-b70b-ce05829337d6")
  .build();

Response response = client.newCall(request).execute();
