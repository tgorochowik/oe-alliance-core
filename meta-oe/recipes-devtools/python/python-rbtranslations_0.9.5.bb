SUMMARY = "Java ResourceBundle like approach to localization"
HOMEPAGE = "http://packages.python.org/rbtranslations"
AUTHOR = "Michael N. Lipp <mnl@mnl.de>"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=7f91a5b62e69f1b686e02545d5072215"

SRC_URI = "https://files.pythonhosted.org/packages/dc/bc/cf94114b9a01ab78d911a8e75b896ef9a243682c29f60f8416d8455d0c94/rbtranslations-0.9.5.tar.gz"
SRC_URI[md5sum] = "bb9b32785abb7ce4852892ae0e49637e"
SRC_URI[sha256sum] = "05270ead06b80f3c1f879b9fe62cc39ab8da32d7e6eac28ed1c55fdae8969728"

S = "${WORKDIR}/rbtranslations-0.9.5"

inherit setuptools

include python-package-split.inc
