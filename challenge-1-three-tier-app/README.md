**Kubernetes Deployment and Service for each of the tier is created in its own tier namespace.**

The front-end deployment is exposed using a "NodePort" service, which allows the traffic to flow from outside the cluster, to the front-end deployment.
