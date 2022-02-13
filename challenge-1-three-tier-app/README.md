**This is solved by using docker containers for each tier, and creating multiple replicas for each deployment. These deployments are then exposed using Kubernetes services.**

_Note: Kubernetes Deployment and Service for each of the tier is created in its own tier namespace._

The front-end deployment is exposed using a "NodePort" service, which allows the traffic to flow from outside the cluster, to the front-end deployment.
