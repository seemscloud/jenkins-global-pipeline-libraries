import com.seemscloud.publicipaddress.PublicIP

static def call(String format = "text", String type = "api") {
    return PublicIP.getAddress(format, type)
}

println(call())