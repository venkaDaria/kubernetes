package com.globallogic.kybernetes;

public class Example {

    public static void main(String[] args) {
        Connector connector = new Connector();

        try {
            connector.apply("mysql.yaml", "default");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
