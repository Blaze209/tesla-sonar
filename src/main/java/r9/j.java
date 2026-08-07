package r9;

import androidx.media3.common.ParserException;
import com.google.common.collect.x;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p7.u;
import s7.c0;
import w8.r0;

/* JADX INFO: loaded from: classes3.dex */
final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f107366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f107367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f107368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private r0.c f107369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private r0.a f107370r;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0.c f107371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0.a f107372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f107373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r0.b[] f107374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f107375e;

        public a(r0.c cVar, r0.a aVar, byte[] bArr, r0.b[] bVarArr, int i11) {
            this.f107371a = cVar;
            this.f107372b = aVar;
            this.f107373c = bArr;
            this.f107374d = bVarArr;
            this.f107375e = i11;
        }
    }

    j() {
    }

    static void n(c0 c0Var, long j11) {
        if (c0Var.b() < c0Var.j() + 4) {
            c0Var.Y(Arrays.copyOf(c0Var.f(), c0Var.j() + 4));
        } else {
            c0Var.a0(c0Var.j() + 4);
        }
        byte[] bArrF = c0Var.f();
        bArrF[c0Var.j() - 4] = (byte) (j11 & 255);
        bArrF[c0Var.j() - 3] = (byte) ((j11 >>> 8) & 255);
        bArrF[c0Var.j() - 2] = (byte) ((j11 >>> 16) & 255);
        bArrF[c0Var.j() - 1] = (byte) ((j11 >>> 24) & 255);
    }

    private static int o(byte b11, a aVar) {
        return !aVar.f107374d[p(b11, aVar.f107375e, 1)].f121404a ? aVar.f107371a.f121414g : aVar.f107371a.f121415h;
    }

    static int p(byte b11, int i11, int i12) {
        return (b11 >> i12) & (255 >>> (8 - i11));
    }

    public static boolean r(c0 c0Var) {
        try {
            return r0.o(1, c0Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // r9.i
    protected void e(long j11) {
        super.e(j11);
        this.f107368p = j11 != 0;
        r0.c cVar = this.f107369q;
        this.f107367o = cVar != null ? cVar.f121414g : 0;
    }

    @Override // r9.i
    protected long f(c0 c0Var) {
        if ((c0Var.f()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(c0Var.f()[0], (a) s7.a.j(this.f107366n));
        long j11 = this.f107368p ? (this.f107367o + iO) / 4 : 0;
        n(c0Var, j11);
        this.f107368p = true;
        this.f107367o = iO;
        return j11;
    }

    @Override // r9.i
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected boolean h(c0 c0Var, long j11, i.b bVar) throws ParserException {
        if (this.f107366n != null) {
            s7.a.f(bVar.f107364a);
            return false;
        }
        a aVarQ = q(c0Var);
        this.f107366n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        r0.c cVar = aVarQ.f107371a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f121417j);
        arrayList.add(aVarQ.f107373c);
        bVar.f107364a = new u.b().W("audio/ogg").y0("audio/vorbis").S(cVar.f121412e).t0(cVar.f121411d).T(cVar.f121409b).z0(cVar.f121410c).k0(arrayList).r0(r0.d(x.o(aVarQ.f107372b.f121402b))).P();
        return true;
    }

    @Override // r9.i
    protected void l(boolean z11) {
        super.l(z11);
        if (z11) {
            this.f107366n = null;
            this.f107369q = null;
            this.f107370r = null;
        }
        this.f107367o = 0;
        this.f107368p = false;
    }

    a q(c0 c0Var) throws ParserException {
        r0.c cVar = this.f107369q;
        if (cVar == null) {
            this.f107369q = r0.l(c0Var);
            return null;
        }
        r0.a aVar = this.f107370r;
        if (aVar == null) {
            this.f107370r = r0.j(c0Var);
            return null;
        }
        byte[] bArr = new byte[c0Var.j()];
        System.arraycopy(c0Var.f(), 0, bArr, 0, c0Var.j());
        r0.b[] bVarArrM = r0.m(c0Var, cVar.f121409b);
        return new a(cVar, aVar, bArr, bVarArrM, r0.b(bVarArrM.length - 1));
    }
}
