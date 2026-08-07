package m9;

import s7.c0;
import s7.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91625b;

    private g(long j11, long j12) {
        this.f91624a = j11;
        this.f91625b = j12;
    }

    static g a(c0 c0Var, long j11, i0 i0Var) {
        long jB = b(c0Var, j11);
        return new g(jB, i0Var.b(jB));
    }

    static long b(c0 c0Var, long j11) {
        long jM = c0Var.M();
        if ((128 & jM) != 0) {
            return 8589934591L & ((((jM & 1) << 32) | c0Var.O()) + j11);
        }
        return -9223372036854775807L;
    }

    @Override // m9.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f91624a + ", playbackPositionUs= " + this.f91625b + " }";
    }
}
