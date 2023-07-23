package com.seemscloud.examples

class FooNotify {
    static String dupa = "statyczne gowno";

    static String getString() {
        String formattedString = "This is an example: ${dupa}";
        println("->" + formattedString)
        return dupa;
    }
}
