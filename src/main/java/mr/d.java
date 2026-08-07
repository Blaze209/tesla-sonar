package mr;

import hr.a0;
import hr.b0;
import hr.m;
import hr.z;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f92495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f92496b;

    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ z f92497a;

        a(z zVar) {
            this.f92497a = zVar;
        }

        @Override // hr.z
        public z.a c(long j11) {
            z.a aVarC = this.f92497a.c(j11);
            a0 a0Var = aVarC.f73404a;
            a0 a0Var2 = new a0(a0Var.f73301a, a0Var.f73302b + d.this.f92495a);
            a0 a0Var3 = aVarC.f73405b;
            return new z.a(a0Var2, new a0(a0Var3.f73301a, a0Var3.f73302b + d.this.f92495a));
        }

        @Override // hr.z
        public boolean d() {
            return this.f92497a.d();
        }

        @Override // hr.z
        public long g() {
            return this.f92497a.g();
        }
    }

    public d(long j11, m mVar) {
        this.f92495a = j11;
        this.f92496b = mVar;
    }

    @Override // hr.m
    public b0 b(int i11, int i12) {
        return this.f92496b.b(i11, i12);
    }

    @Override // hr.m
    public void j() {
        this.f92496b.j();
    }

    @Override // hr.m
    public void p(z zVar) {
        this.f92496b.p(new a(zVar));
    }
}
