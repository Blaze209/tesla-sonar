package jr;

import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f84265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f84266f;

    private d(int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f84261a = i11;
        this.f84262b = i12;
        this.f84263c = i13;
        this.f84264d = i14;
        this.f84265e = i15;
        this.f84266f = i16;
    }

    public static d c(d0 d0Var) {
        int iU = d0Var.u();
        d0Var.V(12);
        int iU2 = d0Var.u();
        int iU3 = d0Var.u();
        int iU4 = d0Var.u();
        d0Var.V(4);
        int iU5 = d0Var.u();
        int iU6 = d0Var.u();
        d0Var.V(8);
        return new d(iU, iU2, iU3, iU4, iU5, iU6);
    }

    public long a() {
        return p0.M0(this.f84265e, ((long) this.f84263c) * 1000000, this.f84264d);
    }

    public int b() {
        int i11 = this.f84261a;
        if (i11 == 1935960438) {
            return 2;
        }
        if (i11 == 1935963489) {
            return 1;
        }
        if (i11 == 1937012852) {
            return 3;
        }
        u.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f84261a));
        return -1;
    }

    @Override // jr.a
    public int getType() {
        return 1752331379;
    }
}
