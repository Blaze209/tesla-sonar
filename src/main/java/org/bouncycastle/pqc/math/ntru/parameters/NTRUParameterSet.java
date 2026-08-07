package org.bouncycastle.pqc.math.ntru.parameters;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* JADX INFO: loaded from: classes10.dex */
public abstract class NTRUParameterSet {
    private final int logQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f99273n;
    private final int prfKeyBytes;
    private final int seedBytes;
    private final int sharedKeyBytes;

    public NTRUParameterSet(int i11, int i12, int i13, int i14, int i15) {
        this.f99273n = i11;
        this.logQ = i12;
        this.seedBytes = i13;
        this.prfKeyBytes = i14;
        this.sharedKeyBytes = i15;
    }

    public abstract Polynomial createPolynomial();

    public int logQ() {
        return this.logQ;
    }

    public int n() {
        return this.f99273n;
    }

    public int ntruCiphertextBytes() {
        return owcpaBytes();
    }

    public int ntruPublicKeyBytes() {
        return owcpaPublicKeyBytes();
    }

    public int ntruSecretKeyBytes() {
        return owcpaSecretKeyBytes() + this.prfKeyBytes;
    }

    public int owcpaBytes() {
        return ((this.logQ * packDegree()) + 7) / 8;
    }

    public int owcpaMsgBytes() {
        return packTrinaryBytes() * 2;
    }

    public int owcpaPublicKeyBytes() {
        return ((this.logQ * packDegree()) + 7) / 8;
    }

    public int owcpaSecretKeyBytes() {
        return (packTrinaryBytes() * 2) + owcpaPublicKeyBytes();
    }

    public int packDegree() {
        return this.f99273n - 1;
    }

    public int packTrinaryBytes() {
        return (packDegree() + 4) / 5;
    }

    public int prfKeyBytes() {
        return this.prfKeyBytes;
    }

    public int q() {
        return 1 << this.logQ;
    }

    public abstract int sampleFgBytes();

    public int sampleFixedTypeBytes() {
        return (((this.f99273n - 1) * 30) + 7) / 8;
    }

    public int sampleIidBytes() {
        return this.f99273n - 1;
    }

    public abstract int sampleRmBytes();

    public int seedBytes() {
        return this.seedBytes;
    }

    public int sharedKeyBytes() {
        return this.sharedKeyBytes;
    }
}
