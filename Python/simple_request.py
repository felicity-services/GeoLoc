import requests

url = "https://api.geoloc.felicity-services.com/json/52.210.46.250"

headers = {
    'ACCESS-KEY': "YOUR_ACCESS_KEY"
    }

response = requests.request("GET", url, headers=headers)

print(response.text)
