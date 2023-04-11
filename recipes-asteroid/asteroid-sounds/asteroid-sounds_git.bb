SUMMARY = "Default set of sounds for AsteroidOS"
HOMEPAGE = "https://github.com/AsteroidOS/asteroid-sounds"
LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=65d3616852dbf7b1a6d4b53b00626032"

SRC_URI = "git://github.com/AsteroidOS/asteroid-sounds.git;protocol=https;branch=main"
SRCREV = "${AUTOREV}"
PR = "r1"
PV = "+git${SRCPV}"
S = "${WORKDIR}/git"

do_install() {
    install -d ${D}/usr/share/sounds/
    cp ${S}/src/* ${D}/usr/share/sounds/
}

FILES:${PN} = "/usr/share/sounds/"
