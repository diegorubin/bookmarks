from fabric.api import run

CONTAINER_NAME='bookmarks'
COMMAND='/usr/bin/start-bookmarks-server'

def start_container():
    run("docker run --net=host -d --name %s diegorubin/bookmarks:v0 %s"%(CONTAINER_NAME, COMMAND))

def remove_container():
    run("docker rm %s || echo 'not exists'"%(CONTAINER_NAME))

def stop_container():
    run("docker stop %s || echo 'not running'"%(CONTAINER_NAME))

def update_docker_image():
    run("docker pull diegorubin/bookmarks:v0")

def update_bookmarks():
    stop_container()
    remove_container()
    update_docker_image()
    start_container()

