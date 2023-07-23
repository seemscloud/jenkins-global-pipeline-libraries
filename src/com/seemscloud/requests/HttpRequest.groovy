package com.seemscloud.requests

import groovy.json.JsonSlurper

class HttpRequest {
    static LinkedHashMap<String, Object> sendGetRequest(String url) {
        def connection = new URL(url).openConnection() as HttpURLConnection
        connection.requestMethod = 'GET'

        def responseCode = connection.responseCode
        def response = connection.inputStream.text

        def jsonResponse = null
        if (connection.contentType?.contains("application/json")) {
            jsonResponse = new JsonSlurper().parseText(response)
        }

        return [responseCode: responseCode, response: response, jsonResponse: jsonResponse]
    }
}