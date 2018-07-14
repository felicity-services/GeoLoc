OkHttpClient client = new OkHttpClient();

Request request = new Request.Builder()
  .url("https://api.geoloc.felicity-services.com/json/52.210.46.250")
  .get()
  .addHeader("ACCESS-KEY", "YOUR_ACCESS_KEY")
  .build();

Response response = client.newCall(request).execute();
