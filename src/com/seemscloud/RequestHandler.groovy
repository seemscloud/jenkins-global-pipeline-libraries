package src.com.seemscloud

class ExampleClass {
    static String dupa = "statyczne gowno"

    static String getString() {
        String formattedString = "This is an example: ${dupa}"
        println(formattedString)

        return dupa
    }
}
