package qr;

import hr.l;
import hr.q;
import hr.r;
import hr.s;
import hr.t;
import hr.z;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private t f105869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f105870o;

    private static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private t f105871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private t.a f105872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f105873c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f105874d = -1;

        public a(t tVar, t.a aVar) {
            this.f105871a = tVar;
            this.f105872b = aVar;
        }

        @Override // qr.g
        public long a(l lVar) {
            long j11 = this.f105874d;
            if (j11 < 0) {
                return -1L;
            }
            long j12 = -(j11 + 2);
            this.f105874d = -1L;
            return j12;
        }

        @Override // qr.g
        public z b() {
            ts.a.g(this.f105873c != -1);
            return new s(this.f105871a, this.f105873c);
        }

        @Override // qr.g
        public void c(long j11) {
            long[] jArr = this.f105872b.f73392a;
            this.f105874d = jArr[p0.i(jArr, j11, true, true)];
        }

        public void d(long j11) {
            this.f105873c = j11;
        }
    }

    b() {
    }

    private int n(d0 d0Var) {
        int i11 = (d0Var.e()[2] & 255) >> 4;
        if (i11 == 6 || i11 == 7) {
            d0Var.V(4);
            d0Var.O();
        }
        int iJ = q.j(d0Var, i11);
        d0Var.U(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(d0 d0Var) {
        return d0Var.a() >= 5 && d0Var.H() == 127 && d0Var.J() == 1179402563;
    }

    @Override // qr.i
    protected long f(d0 d0Var) {
        if (o(d0Var.e())) {
            return n(d0Var);
        }
        return -1L;
    }

    @Override // qr.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean i(d0 d0Var, long j11, i.b bVar) {
        byte[] bArrE = d0Var.e();
        t tVar = this.f105869n;
        if (tVar == null) {
            t tVar2 = new t(bArrE, 17);
            this.f105869n = tVar2;
            bVar.f105911a = tVar2.g(Arrays.copyOfRange(bArrE, 9, d0Var.g()), null);
            return true;
        }
        if ((bArrE[0] & 127) == 3) {
            t.a aVarG = r.g(d0Var);
            t tVarB = tVar.b(aVarG);
            this.f105869n = tVarB;
            this.f105870o = new a(tVarB, aVarG);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f105870o;
        if (aVar != null) {
            aVar.d(j11);
            bVar.f105912b = this.f105870o;
        }
        ts.a.e(bVar.f105911a);
        return false;
    }

    @Override // qr.i
    protected void l(boolean z11) {
        super.l(z11);
        if (z11) {
            this.f105869n = null;
            this.f105870o = null;
        }
    }
}
