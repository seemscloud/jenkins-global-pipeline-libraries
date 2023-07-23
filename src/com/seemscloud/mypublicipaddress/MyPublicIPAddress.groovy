package com.seemscloud.mypublicipaddress

import com.seemscloud.requests.HttpRequest

class MyPublicIPAddress {
    static String getAddress() {
        String myIp = HttpRequest.sendGetRequest("https://api.ipify.org?format=json")

        return myIp;
    }
}