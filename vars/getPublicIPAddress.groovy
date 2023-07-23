import com.seemscloud.publicipaddress.PublicIP

static def call(String format = "text", String type = "api", Map<String, String> headers = [:]) {
    return PublicIP.getAddress(format, type)
}

println(call())