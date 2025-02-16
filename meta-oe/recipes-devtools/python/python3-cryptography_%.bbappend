FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

DEPENDS:append = " ${PYTHON_PN}-semantic-version-native"

SRC_URI:append:mips32el = " \
    crate://crates.io/portable-atomic/1.6.0 \
    file://0001-Use-portable-atomic-for-targets-which-lack-64-bit-at.patch;patchdir=../cargo_home/bitbake/pyo3-0.20.3/ \
"

SRC_URI[portable-atomic-1.6.0.sha256sum] = "7170ef9988bc169ba16dd36a7fa041e5c4cbeb6a35b76d4c03daded371eae7c0"

include ${PYTHON_PN}-package-split.inc
