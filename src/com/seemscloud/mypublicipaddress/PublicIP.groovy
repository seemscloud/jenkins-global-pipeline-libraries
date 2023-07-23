package com.seemscloud.mypublicipaddress

import com.seemscloud.requests.HttpRequest

class PublicIP {
    static String getAddress(String format = null) {
        def result = null

        if (format != null) {
            result = HttpRequest.sendGetRequest("https://api.ipify.org?format=x${format}")
        } else {
            result = HttpRequest.sendGetRequest("https://api.ipify.org")
        }

        if (result.responseCode == 200) {
            return result.response
        } else {
            throw new Exception("Received a non 200 response code: ${result.responseCode}")
        }
    }
}