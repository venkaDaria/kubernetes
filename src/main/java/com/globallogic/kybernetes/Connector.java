package com.globallogic.kybernetes;

import io.fabric8.kubernetes.api.Controller;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

import java.io.File;

public class Connector {

    private KubernetesClient kubernetesClient;

    public Connector(final String namespace) {
        kubernetesClient = new DefaultKubernetesClient().inNamespace(namespace);
    }

    public void apply(final String fileName) throws Exception {
        Controller controller = new Controller(kubernetesClient);
        controller.setNamespace(kubernetesClient.getNamespace());
        controller.apply(new File(fileName));
    }
}
