package r9;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import s7.c0;
import s7.q0;
import w8.j0;
import w8.q;
import w8.v;
import w8.w;
import w8.x;
import w8.y;

/* JADX INFO: loaded from: classes3.dex */
final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private y f107322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f107323o;

    private static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y f107324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private y.a f107325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f107326c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f107327d = -1;

        public a(y yVar, y.a aVar) {
            this.f107324a = yVar;
            this.f107325b = aVar;
        }

        @Override // r9.g
        public long a(q qVar) {
            long j11 = this.f107327d;
            if (j11 < 0) {
                return -1L;
            }
            long j12 = -(j11 + 2);
            this.f107327d = -1L;
            return j12;
        }

        @Override // r9.g
        public j0 b() {
            s7.a.h(this.f107326c != -1);
            return new x(this.f107324a, this.f107326c);
        }

        @Override // r9.g
        public void c(long j11) {
            long[] jArr = this.f107325b.f121435a;
            this.f107327d = jArr[q0.k(jArr, j11, true, true)];
        }

        public void d(long j11) {
            this.f107326c = j11;
        }
    }

    b() {
    }

    private int n(c0 c0Var) {
        int i11 = (c0Var.f()[2] & 255) >> 4;
        if (i11 == 6 || i11 == 7) {
            c0Var.c0(4);
            c0Var.V();
        }
        int iJ = v.j(c0Var, i11);
        c0Var.b0(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(c0 c0Var) {
        return c0Var.a() >= 5 && c0Var.M() == 127 && c0Var.O() == 1179402563;
    }

    @Override // r9.i
    protected long f(c0 c0Var) {
        if (o(c0Var.f())) {
            return n(c0Var);
        }
        return -1L;
    }

    @Override // r9.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean h(c0 c0Var, long j11, i.b bVar) {
        byte[] bArrF = c0Var.f();
        y yVar = this.f107322n;
        if (yVar == null) {
            y yVar2 = new y(bArrF, 17);
            this.f107322n = yVar2;
            bVar.f107364a = yVar2.g(Arrays.copyOfRange(bArrF, 9, c0Var.j()), null).b().W("audio/ogg").P();
            return true;
        }
        if ((bArrF[0] & 127) == 3) {
            y.a aVarF = w.f(c0Var);
            y yVarB = yVar.b(aVarF);
            this.f107322n = yVarB;
            this.f107323o = new a(yVarB, aVarF);
            return true;
        }
        if (!o(bArrF)) {
            return true;
        }
        a aVar = this.f107323o;
        if (aVar != null) {
            aVar.d(j11);
            bVar.f107365b = this.f107323o;
        }
        s7.a.f(bVar.f107364a);
        return false;
    }

    @Override // r9.i
    protected void l(boolean z11) {
        super.l(z11);
        if (z11) {
            this.f107322n = null;
            this.f107323o = null;
        }
    }
}
