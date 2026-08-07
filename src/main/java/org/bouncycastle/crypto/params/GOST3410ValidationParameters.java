package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes9.dex */
public class GOST3410ValidationParameters {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98807c;
    private long cL;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f98808x0;
    private long x0L;

    public GOST3410ValidationParameters(int i11, int i12) {
        this.f98808x0 = i11;
        this.f98807c = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f98807c == this.f98807c && gOST3410ValidationParameters.f98808x0 == this.f98808x0 && gOST3410ValidationParameters.cL == this.cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f98807c;
    }

    public long getCL() {
        return this.cL;
    }

    public int getX0() {
        return this.f98808x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i11 = this.f98808x0 ^ this.f98807c;
        long j11 = this.x0L;
        int i12 = (i11 ^ ((int) j11)) ^ ((int) (j11 >> 32));
        long j12 = this.cL;
        return (i12 ^ ((int) j12)) ^ ((int) (j12 >> 32));
    }

    public GOST3410ValidationParameters(long j11, long j12) {
        this.x0L = j11;
        this.cL = j12;
    }
}
