package m9;

import s7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f91590c;

    private a(long j11, byte[] bArr, long j12) {
        this.f91588a = j12;
        this.f91589b = j11;
        this.f91590c = bArr;
    }

    static a a(c0 c0Var, int i11, long j11) {
        long jO = c0Var.O();
        int i12 = i11 - 4;
        byte[] bArr = new byte[i12];
        c0Var.q(bArr, 0, i12);
        return new a(jO, bArr, j11);
    }

    @Override // m9.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f91588a + ", identifier= " + this.f91589b + " }";
    }
}
