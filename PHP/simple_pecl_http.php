<?php

$client = new http\Client;
$request = new http\Client\Request;

$request->setRequestUrl('https://api.geoloc.felicity-services.com/json/52.210.46.250');
$request->setRequestMethod('GET');
$request->setHeaders(array(
  'ACCESS-KEY' => 'YOUR_ACCESS_KEY'
));

$client->enqueue($request)->send();
$response = $client->getResponse();

echo $response->getBody();
?>
