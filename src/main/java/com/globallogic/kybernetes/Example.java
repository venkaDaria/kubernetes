package com.globallogic.kybernetes;

public class Example {

    public static void main(String[] args) {
        Connector connector = new Connector("default");

        try {
            connector.apply("example.yaml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
