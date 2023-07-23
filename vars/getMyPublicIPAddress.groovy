import com.seemscloud.mypublicipaddress.PublicIP

static def call() {
    return PublicIP.getAddress("json")
}