import com.seemscloud.publicipaddress.PublicIP

static def call() {
    return PublicIP.getAddress("json")
}