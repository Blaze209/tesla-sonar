package e9;

import w8.a0;
import w8.j0;
import w8.k0;
import w8.o0;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f62278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f62279b;

    class a extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f62280b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0 j0Var, j0 j0Var2) {
            super(j0Var);
            this.f62280b = j0Var2;
        }

        @Override // w8.a0, w8.j0
        public j0.a c(long j11) {
            j0.a aVarC = this.f62280b.c(j11);
            k0 k0Var = aVarC.f121331a;
            k0 k0Var2 = new k0(k0Var.f121336a, k0Var.f121337b + e.this.f62278a);
            k0 k0Var3 = aVarC.f121332b;
            return new j0.a(k0Var2, new k0(k0Var3.f121336a, k0Var3.f121337b + e.this.f62278a));
        }
    }

    public e(long j11, r rVar) {
        this.f62278a = j11;
        this.f62279b = rVar;
    }

    @Override // w8.r
    public o0 b(int i11, int i12) {
        return this.f62279b.b(i11, i12);
    }

    @Override // w8.r
    public void j() {
        this.f62279b.j();
    }

    @Override // w8.r
    public void t(j0 j0Var) {
        this.f62279b.t(new a(j0Var, j0Var));
    }
}
