package com.seemscloud.publicipaddress

import com.seemscloud.requests.HttpRequest

class PublicIP {
    static final Set<String> apis = ["api", "api64"]
    static final Set<String> formats = ["text", "json", "jsonp"]

    static String getAddress(String format, String api, Map<String, String> headers = [:]) {
        String url = "https://${getApiType(api)}.ipify.org?format=${getFormatType(format)}"

        Map<String, Object> result = HttpRequest.getRequest(url, headers)

        if (result.responseCode == 200) {
            return result.response
        } else {
            throw new Exception("Received a non-200 response code: ${result.responseCode}")
        }
    }

    static String getFormatType(String format) {
        if (formats.contains(format)) {
            return format
        } else {
            return "json"
        }
    }

    static String getApiType(String type) {
        if (apis.contains(type)) {
            return type
        } else {
            return "api"
        }
    }
}