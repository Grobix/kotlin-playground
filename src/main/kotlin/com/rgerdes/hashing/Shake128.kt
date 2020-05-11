package com.rgerdes.hashing

import org.bouncycastle.crypto.OutputXOFCalculator
import org.bouncycastle.crypto.fips.FipsSHS
import org.bouncycastle.crypto.fips.FipsXOFOperatorFactory
import org.bouncycastle.util.encoders.Hex
import java.io.IOException
import java.io.OutputStream


@Throws(IOException::class)
fun calculateShakeOutput(data: ByteArray?): String? {
    val factory: FipsXOFOperatorFactory<FipsSHS.Parameters> = FipsSHS.XOFOperatorFactory()
    val calculator: OutputXOFCalculator<FipsSHS.Parameters> = factory.createOutputXOFCalculator(FipsSHS.SHAKE128)
    val digestStream: OutputStream = calculator.functionStream
    digestStream.write(data)
    digestStream.close()
    return Hex.toHexString(calculator.getFunctionOutput(9))
}
