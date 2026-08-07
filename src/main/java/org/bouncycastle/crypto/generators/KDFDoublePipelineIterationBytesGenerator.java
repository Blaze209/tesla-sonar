package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes9.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f98713a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f98714h;
    private byte[] ios;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f98715k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f98714h = macSize;
        this.f98713a = new byte[macSize];
        this.f98715k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.prf;
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f98713a, 0);
        } else {
            Mac mac2 = this.prf;
            byte[] bArr2 = this.f98713a;
            mac2.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f98713a, 0);
        }
        Mac mac3 = this.prf;
        byte[] bArr3 = this.f98713a;
        mac3.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i11 = (this.generatedBytes / this.f98714h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr4[0] = (byte) (i11 >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i11 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i11 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i11;
            this.prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac4 = this.prf;
        byte[] bArr5 = this.fixedInputData;
        mac4.update(bArr5, 0, bArr5.length);
        this.prf.doFinal(this.f98715k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) {
        int i13 = this.generatedBytes;
        int i14 = i13 + i12;
        if (i14 < 0 || i14 >= this.maxSizeExcl) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.maxSizeExcl + " bytes");
        }
        if (i13 % this.f98714h == 0) {
            generateNext();
        }
        int i15 = this.generatedBytes;
        int i16 = this.f98714h;
        int i17 = i15 % i16;
        int iMin = Math.min(i16 - (i15 % i16), i12);
        System.arraycopy(this.f98715k, i17, bArr, i11, iMin);
        this.generatedBytes += iMin;
        int i18 = i12 - iMin;
        while (true) {
            i11 += iMin;
            if (i18 <= 0) {
                return i12;
            }
            generateNext();
            iMin = Math.min(this.f98714h, i18);
            System.arraycopy(this.f98715k, 0, bArr, i11, iMin);
            this.generatedBytes += iMin;
            i18 -= iMin;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFDoublePipelineIterationParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r11 = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r11 / 8];
        int iIntValue = Integer.MAX_VALUE;
        if (kDFDoublePipelineIterationParameters.useCounter()) {
            BigInteger bigIntegerMultiply = TWO.pow(r11).multiply(BigInteger.valueOf(this.f98714h));
            if (bigIntegerMultiply.compareTo(INTEGER_MAX) != 1) {
                iIntValue = bigIntegerMultiply.intValue();
            }
        }
        this.maxSizeExcl = iIntValue;
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}
