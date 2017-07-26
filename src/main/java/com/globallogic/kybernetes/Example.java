package com.globallogic.kybernetes;

public class Example {

    public static void main(String[] args) {
        Connector connector = new Connector("default");

        try {
            connector.apply("example.yaml");

            System.out.println(connector.getClient().pods()
                    .inNamespace(connector.getController().getNamespace()).withName("hello-world").get());
            System.out.println(connector.getClient().pods().withName("hello-world").get());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
