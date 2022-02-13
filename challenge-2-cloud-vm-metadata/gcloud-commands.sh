#!/bin/sh

# Get VM Instance Metadata Keys in JSON format
gcloud compute instances describe <VM-NAME> --zone <ZONE> --project <PROJECT-ID> --format 'json(metadata.items[].key)'

# Get VM Instance Metadata Keys in CSV
gcloud compute instances describe <VM-NAME> --zone <ZONE> --project <PROJECT-ID> --format 'get(metadata.items.key)'
