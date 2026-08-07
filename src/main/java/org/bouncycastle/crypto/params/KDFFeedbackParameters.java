package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class KDFFeedbackParameters implements DerivationParameters {
    private static final int UNUSED_R = -1;
    private final byte[] fixedInputData;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final byte[] f98813iv;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final byte[] f98814ki;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f98815r;
    private final boolean useCounter;

    private KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, boolean z11) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.f98814ki = Arrays.clone(bArr);
        if (bArr3 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr3);
        }
        this.f98815r = i11;
        if (bArr2 == null) {
            this.f98813iv = new byte[0];
        } else {
            this.f98813iv = Arrays.clone(bArr2);
        }
        this.useCounter = z11;
    }

    public static KDFFeedbackParameters createWithCounter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        if (i11 == 8 || i11 == 16 || i11 == 24 || i11 == 32) {
            return new KDFFeedbackParameters(bArr, bArr2, bArr3, i11, true);
        }
        throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
    }

    public static KDFFeedbackParameters createWithoutCounter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new KDFFeedbackParameters(bArr, bArr2, bArr3, -1, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getIV() {
        return this.f98813iv;
    }

    public byte[] getKI() {
        return this.f98814ki;
    }

    public int getR() {
        return this.f98815r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
