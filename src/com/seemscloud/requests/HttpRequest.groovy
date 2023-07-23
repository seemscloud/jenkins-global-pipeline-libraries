package com.seemscloud.requests

import groovy.json.JsonSlurper

class HttpRequest {
    static LinkedHashMap<String, Object> getRequest(String url, Map<String, String> headers = [:]) {
        def connection = new URL(url).openConnection() as HttpURLConnection
        connection.requestMethod = 'GET'

        headers.each { String key, String value ->
            connection.setRequestProperty(key, value)
        }

        int responseCode = 0
        try {
            responseCode = connection.responseCode
        } catch (Exception e) {
            throw new Exception("Error occurred during the HTTP connection: " + e.getMessage(), e);
        }

        String response = connection.inputStream.text

        def jsonResponse = null
        if (connection.contentType?.contains("application/json")) {
            jsonResponse = new JsonSlurper().parseText(response)
        }

        return [responseCode: responseCode, response: response, jsonResponse: jsonResponse]
    }
}