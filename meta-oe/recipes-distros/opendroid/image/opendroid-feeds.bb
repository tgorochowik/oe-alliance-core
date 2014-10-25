SUMMARY = "Merge machine and distro options to create a enigma2 feeds machine task/package"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"
PACKAGE_ARCH = "${MACHINE_ARCH}"

PV = "1.0"
PR = "r4"

inherit packagegroup

RRECOMMENDS_${PN} = "\
    oe-alliance-skins \
    enigma2-display-skins \
    enigma2-skins \
    enigma2-pliplugins \
    enigma2-plugin-extensions-project-valerie \
    enigma2-plugin-extensions-xmltvimport \
    enigma2-plugin-systemplugins-crossepg \
    curlftpfs \
    cdfs \
    openssl-old \
    enigma2-plugin-extensions-enhancedmoviecenter \
    enigma2-plugin-skins-mega32 \
    enigma2-plugin-settings-defaultsat \
    ${@base_contains("MACHINE_BRAND", "AZBOX", "enigma2-plugin-extensions-azplay enigma2-plugin-extensions-aziptv", "", d)} \
    "