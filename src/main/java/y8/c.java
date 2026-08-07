package y8;

import s7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f125247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f125248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f125249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f125250d;

    private c(int i11, int i12, int i13, int i14) {
        this.f125247a = i11;
        this.f125248b = i12;
        this.f125249c = i13;
        this.f125250d = i14;
    }

    public static c b(c0 c0Var) {
        int iZ = c0Var.z();
        c0Var.c0(8);
        int iZ2 = c0Var.z();
        int iZ3 = c0Var.z();
        c0Var.c0(4);
        int iZ4 = c0Var.z();
        c0Var.c0(12);
        return new c(iZ, iZ2, iZ3, iZ4);
    }

    public boolean a() {
        return (this.f125248b & 16) == 16;
    }

    @Override // y8.a
    public int getType() {
        return 1751742049;
    }
}
