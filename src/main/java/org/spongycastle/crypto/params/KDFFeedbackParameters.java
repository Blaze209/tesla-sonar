package org.spongycastle.crypto.params;

import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class KDFFeedbackParameters implements DerivationParameters {
    private static final int UNUSED_R = -1;
    private final byte[] fixedInputData;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final byte[] f99596iv;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final byte[] f99597ki;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f99598r;
    private final boolean useCounter;

    private KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11, boolean z11) {
        if (bArr == null) {
            throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
        }
        this.f99597ki = Arrays.clone(bArr);
        if (bArr3 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr3);
        }
        this.f99598r = i11;
        if (bArr2 == null) {
            this.f99596iv = new byte[0];
        } else {
            this.f99596iv = Arrays.clone(bArr2);
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
        return this.f99596iv;
    }

    public byte[] getKI() {
        return this.f99597ki;
    }

    public int getR() {
        return this.f99598r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
