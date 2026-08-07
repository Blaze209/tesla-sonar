package jr;

import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84260d;

    private c(int i11, int i12, int i13, int i14) {
        this.f84257a = i11;
        this.f84258b = i12;
        this.f84259c = i13;
        this.f84260d = i14;
    }

    public static c b(d0 d0Var) {
        int iU = d0Var.u();
        d0Var.V(8);
        int iU2 = d0Var.u();
        int iU3 = d0Var.u();
        d0Var.V(4);
        int iU4 = d0Var.u();
        d0Var.V(12);
        return new c(iU, iU2, iU3, iU4);
    }

    public boolean a() {
        return (this.f84258b & 16) == 16;
    }

    @Override // jr.a
    public int getType() {
        return 1751742049;
    }
}
