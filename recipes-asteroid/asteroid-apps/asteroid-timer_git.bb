SUMMARY = "Asteroid's timer app"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-timer.git"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI = "git://github.com/AsteroidOS/asteroid-timer.git;protocol=https;branch=master"
SRCREV = "${AUTOREV}"

REMOVE_TRANSLATIONS = "1"

require asteroid-app.inc

DEPENDS += "nemo-qml-plugin-dbus nemo-keepalive"
RDEPENDS:${PN} += "nemo-keepalive"
