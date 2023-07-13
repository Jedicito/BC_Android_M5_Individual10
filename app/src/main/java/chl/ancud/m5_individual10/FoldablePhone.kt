package chl.ancud.m5_individual10

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {
    var isFolded: Boolean = false

    override fun switchOn() {
        if (!isFolded) isScreenLightOn = true
    }

    fun setIsFolded() {
        isFolded = true
    }

    fun setNotFolded() {
        isFolded = false
    }
}