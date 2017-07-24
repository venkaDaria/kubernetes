package com.globallogic.kybernetes;

import io.fabric8.kubernetes.api.Controller;

import java.io.File;

public class Connector {

    public void apply(final String fileName, final String namespace) throws Exception {
        Controller controller = new Controller();
        controller.setNamespace(namespace);
        controller.apply(new File(fileName));
    }
}
