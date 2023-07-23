import com.seemscloud.requests.HttpRequest

static def call() {
    return HttpRequest.sendGetRequest("https://api.ipify.org?format=json")
}