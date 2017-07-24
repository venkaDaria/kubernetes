package com.globallogic.kybernetes;

public class Example {

    public static void main(String[] args) {
        Connector connector = new Connector();

        try {
            connector.apply("example.yaml", "default");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
