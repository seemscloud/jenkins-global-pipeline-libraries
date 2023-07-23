package com.seemscloud.mypublicipaddress

import com.seemscloud.requests.HttpRequest

class MyPublicIPAddress {
    static String getAddress() {
        def result = HttpRequest.sendGetRequest("https://api.ipify.org?format=json")

        println("Status Code ${result.responseCode}")
        if (result.responseCode == 200) {
            return result.response
        } else {
            return result.response
        }
    }
}