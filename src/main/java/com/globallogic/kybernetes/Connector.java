package com.globallogic.kybernetes;

import io.fabric8.kubernetes.api.Controller;
import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.openshift.client.DefaultOpenShiftClient;
import io.fabric8.openshift.client.OpenShiftClient;

import java.io.File;

public class Connector {

    private Controller controller;

    public Connector(final String namespace) {
        Config config = new ConfigBuilder().withNamespace(namespace).build();

        controller = new Controller(new DefaultOpenShiftClient(config));
        controller.setAllowCreate(true);
        controller.setRecreateMode(true);
        controller.setNamespace(namespace);
    }

    public void apply(final String fileName) throws Exception {
        controller.apply(new File(fileName));
    }

    public Controller getController() {
        return controller;
    }

    public OpenShiftClient getClient() {
        return controller.getOpenShiftClientOrNull();
    }
}
