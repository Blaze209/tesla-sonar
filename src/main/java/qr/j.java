package qr;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.u0;
import com.google.common.collect.x;
import hr.e0;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f105913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f105914o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f105915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e0.c f105916q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private e0.a f105917r;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0.c f105918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e0.a f105919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f105920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e0.b[] f105921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f105922e;

        public a(e0.c cVar, e0.a aVar, byte[] bArr, e0.b[] bVarArr, int i11) {
            this.f105918a = cVar;
            this.f105919b = aVar;
            this.f105920c = bArr;
            this.f105921d = bVarArr;
            this.f105922e = i11;
        }
    }

    j() {
    }

    static void n(d0 d0Var, long j11) {
        if (d0Var.b() < d0Var.g() + 4) {
            d0Var.R(Arrays.copyOf(d0Var.e(), d0Var.g() + 4));
        } else {
            d0Var.T(d0Var.g() + 4);
        }
        byte[] bArrE = d0Var.e();
        bArrE[d0Var.g() - 4] = (byte) (j11 & 255);
        bArrE[d0Var.g() - 3] = (byte) ((j11 >>> 8) & 255);
        bArrE[d0Var.g() - 2] = (byte) ((j11 >>> 16) & 255);
        bArrE[d0Var.g() - 1] = (byte) ((j11 >>> 24) & 255);
    }

    private static int o(byte b11, a aVar) {
        return !aVar.f105921d[p(b11, aVar.f105922e, 1)].f73341a ? aVar.f105918a.f73351g : aVar.f105918a.f73352h;
    }

    static int p(byte b11, int i11, int i12) {
        return (b11 >> i12) & (255 >>> (8 - i11));
    }

    public static boolean r(d0 d0Var) {
        try {
            return e0.m(1, d0Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // qr.i
    protected void e(long j11) {
        super.e(j11);
        this.f105915p = j11 != 0;
        e0.c cVar = this.f105916q;
        this.f105914o = cVar != null ? cVar.f73351g : 0;
    }

    @Override // qr.i
    protected long f(d0 d0Var) {
        if ((d0Var.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(d0Var.e()[0], (a) ts.a.i(this.f105913n));
        long j11 = this.f105915p ? (this.f105914o + iO) / 4 : 0;
        n(d0Var, j11);
        this.f105915p = true;
        this.f105914o = iO;
        return j11;
    }

    @Override // qr.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean i(d0 d0Var, long j11, i.b bVar) throws ParserException {
        if (this.f105913n != null) {
            ts.a.e(bVar.f105911a);
            return false;
        }
        a aVarQ = q(d0Var);
        this.f105913n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        e0.c cVar = aVarQ.f105918a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f73354j);
        arrayList.add(aVarQ.f105920c);
        bVar.f105911a = new u0.b().g0("audio/vorbis").I(cVar.f73349e).b0(cVar.f73348d).J(cVar.f73346b).h0(cVar.f73347c).V(arrayList).Z(e0.c(x.o(aVarQ.f105919b.f73339b))).G();
        return true;
    }

    @Override // qr.i
    protected void l(boolean z11) {
        super.l(z11);
        if (z11) {
            this.f105913n = null;
            this.f105916q = null;
            this.f105917r = null;
        }
        this.f105914o = 0;
        this.f105915p = false;
    }

    a q(d0 d0Var) throws ParserException {
        e0.c cVar = this.f105916q;
        if (cVar == null) {
            this.f105916q = e0.j(d0Var);
            return null;
        }
        e0.a aVar = this.f105917r;
        if (aVar == null) {
            this.f105917r = e0.h(d0Var);
            return null;
        }
        byte[] bArr = new byte[d0Var.g()];
        System.arraycopy(d0Var.e(), 0, bArr, 0, d0Var.g());
        e0.b[] bVarArrK = e0.k(d0Var, cVar.f73346b);
        return new a(cVar, aVar, bArr, bVarArrK, e0.a(bVarArrK.length - 1));
    }
}
