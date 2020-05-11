package com.rgerdes.hashing

import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import junit.framework.TestCase
import org.junit.Test

/**
 * @author Robin Gerdes
 */
class Shake128KtTest {

    @Test
    fun testSHAKE128() {
         "00" + calculateShakeOutput("FRANZ48.18611.5611".toByteArray()) shouldBe "0094bceaa06b955a4c0d"
    }

}
