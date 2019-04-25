#!/bin/sh
docker build . -t micronaut-graal-app
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run --network host complete"
