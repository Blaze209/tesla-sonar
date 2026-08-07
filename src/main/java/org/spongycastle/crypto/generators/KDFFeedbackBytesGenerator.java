package org.spongycastle.crypto.generators;

import java.math.BigInteger;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.MacDerivationFunction;
import org.spongycastle.crypto.params.KDFFeedbackParameters;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes10.dex */
public class KDFFeedbackBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] fixedInputData;
    private int generatedBytes;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f99510h;
    private byte[] ios;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f99511iv;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f99512k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFFeedbackBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f99510h = macSize;
        this.f99512k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.prf;
            byte[] bArr = this.f99511iv;
            mac.update(bArr, 0, bArr.length);
        } else {
            Mac mac2 = this.prf;
            byte[] bArr2 = this.f99512k;
            mac2.update(bArr2, 0, bArr2.length);
        }
        if (this.useCounter) {
            int i11 = (this.generatedBytes / this.f99510h) + 1;
            byte[] bArr3 = this.ios;
            int length = bArr3.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                        bArr3[0] = (byte) (i11 >>> 24);
                    }
                    bArr3[bArr3.length - 3] = (byte) (i11 >>> 16);
                }
                bArr3[bArr3.length - 2] = (byte) (i11 >>> 8);
            }
            bArr3[bArr3.length - 1] = (byte) i11;
            this.prf.update(bArr3, 0, bArr3.length);
        }
        Mac mac3 = this.prf;
        byte[] bArr4 = this.fixedInputData;
        mac3.update(bArr4, 0, bArr4.length);
        this.prf.doFinal(this.f99512k, 0);
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i11, int i12) {
        int i13 = this.generatedBytes;
        int i14 = i13 + i12;
        if (i14 < 0 || i14 >= this.maxSizeExcl) {
            throw new DataLengthException("Current KDFCTR may only be used for " + this.maxSizeExcl + " bytes");
        }
        if (i13 % this.f99510h == 0) {
            generateNext();
        }
        int i15 = this.generatedBytes;
        int i16 = this.f99510h;
        int i17 = i15 % i16;
        int iMin = Math.min(i16 - (i15 % i16), i12);
        System.arraycopy(this.f99512k, i17, bArr, i11, iMin);
        this.generatedBytes += iMin;
        int i18 = i12 - iMin;
        while (true) {
            i11 += iMin;
            if (i18 <= 0) {
                return i12;
            }
            generateNext();
            iMin = Math.min(this.f99510h, i18);
            System.arraycopy(this.f99512k, 0, bArr, i11, iMin);
            this.generatedBytes += iMin;
            i18 -= iMin;
        }
    }

    @Override // org.spongycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.spongycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFFeedbackParameters)) {
            throw new IllegalArgumentException("Wrong type of arguments given");
        }
        KDFFeedbackParameters kDFFeedbackParameters = (KDFFeedbackParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFFeedbackParameters.getKI()));
        this.fixedInputData = kDFFeedbackParameters.getFixedInputData();
        int r11 = kDFFeedbackParameters.getR();
        this.ios = new byte[r11 / 8];
        if (kDFFeedbackParameters.useCounter()) {
            BigInteger bigIntegerMultiply = TWO.pow(r11).multiply(BigInteger.valueOf(this.f99510h));
            this.maxSizeExcl = bigIntegerMultiply.compareTo(INTEGER_MAX) != 1 ? bigIntegerMultiply.intValue() : Integer.MAX_VALUE;
        } else {
            this.maxSizeExcl = Integer.MAX_VALUE;
        }
        this.f99511iv = kDFFeedbackParameters.getIV();
        this.useCounter = kDFFeedbackParameters.useCounter();
        this.generatedBytes = 0;
    }
}
