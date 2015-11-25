FROM fedora:23
MAINTAINER rubin.diego@gmail.com

# System dependences 
# install cyclone system dependences
RUN dnf install -y java-1.8.0-openjdk

# Copy application
RUN mkdir /packages
ADD target/bookmarks-0.0.1.jar /packages/
ADD start-bookmarks-server /usr/bin/start-bookmarks-server

EXPOSE 8080

