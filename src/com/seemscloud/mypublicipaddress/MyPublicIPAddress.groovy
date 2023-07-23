package com.seemscloud.mypublicipaddress

import com.seemscloud.requests.HttpRequest

class MyPublicIPAddress {
    static String getAddress() {
        def result = HttpRequest.sendGetRequest("https://api.ipify.org?format=json")

        if (result.responseCode == 200) {
            return result.response
        } else {
            throw new Exception("Received a non 200 response code: ${result.responseCode}")
        }
    }
}