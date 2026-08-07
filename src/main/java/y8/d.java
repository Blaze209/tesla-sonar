package y8;

import s7.c0;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f125251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f125252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f125253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f125254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f125255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f125256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f125257g;

    private d(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f125251a = i11;
        this.f125252b = i12;
        this.f125253c = i13;
        this.f125254d = i14;
        this.f125255e = i15;
        this.f125256f = i16;
        this.f125257g = i17;
    }

    public static d c(c0 c0Var) {
        int iZ = c0Var.z();
        c0Var.c0(12);
        int iZ2 = c0Var.z();
        int iZ3 = c0Var.z();
        int iZ4 = c0Var.z();
        c0Var.c0(4);
        int iZ5 = c0Var.z();
        int iZ6 = c0Var.z();
        c0Var.c0(4);
        return new d(iZ, iZ2, iZ3, iZ4, iZ5, iZ6, c0Var.z());
    }

    public long a() {
        return q0.s1(this.f125255e, ((long) this.f125253c) * 1000000, this.f125254d);
    }

    public int b() {
        int i11 = this.f125251a;
        if (i11 == 1935960438) {
            return 2;
        }
        if (i11 == 1935963489) {
            return 1;
        }
        if (i11 == 1937012852) {
            return 3;
        }
        t.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f125251a));
        return -1;
    }

    @Override // y8.a
    public int getType() {
        return 1752331379;
    }
}
