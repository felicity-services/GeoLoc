import http.client

conn = http.client.HTTPConnection("api,geoloc,felicity-services,com")

headers = {
    'ACCESS-KEY': "YOUR_ACCESS_KEY"
    }

conn.request("GET", "json,52.210.46.250", headers=headers)

res = conn.getresponse()
data = res.read()

print(data.decode("utf-8"))
