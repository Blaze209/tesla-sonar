package com.google.android.exoplayer2;

import android.util.Pair;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class a extends f2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f39402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final es.r f39403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f39404h;

    public a(boolean z11, es.r rVar) {
        this.f39404h = z11;
        this.f39403g = rVar;
        this.f39402f = rVar.getLength();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object C(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int F(int i11, boolean z11) {
        if (z11) {
            return this.f39403g.b(i11);
        }
        if (i11 < this.f39402f - 1) {
            return i11 + 1;
        }
        return -1;
    }

    private int G(int i11, boolean z11) {
        if (z11) {
            return this.f39403g.a(i11);
        }
        if (i11 > 0) {
            return i11 - 1;
        }
        return -1;
    }

    public static Object z(Object obj) {
        return ((Pair) obj).second;
    }

    protected abstract Object B(int i11);

    protected abstract int D(int i11);

    protected abstract int E(int i11);

    protected abstract f2 H(int i11);

    @Override // com.google.android.exoplayer2.f2
    public int e(boolean z11) {
        if (this.f39402f == 0) {
            return -1;
        }
        if (this.f39404h) {
            z11 = false;
        }
        int iE = z11 ? this.f39403g.e() : 0;
        while (H(iE).u()) {
            iE = F(iE, z11);
            if (iE == -1) {
                return -1;
            }
        }
        return E(iE) + H(iE).e(z11);
    }

    @Override // com.google.android.exoplayer2.f2
    public final int f(Object obj) {
        int iF;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objA = A(obj);
        Object objZ = z(obj);
        int iW = w(objA);
        if (iW == -1 || (iF = H(iW).f(objZ)) == -1) {
            return -1;
        }
        return D(iW) + iF;
    }

    @Override // com.google.android.exoplayer2.f2
    public int g(boolean z11) {
        int i11 = this.f39402f;
        if (i11 == 0) {
            return -1;
        }
        if (this.f39404h) {
            z11 = false;
        }
        int iC = z11 ? this.f39403g.c() : i11 - 1;
        while (H(iC).u()) {
            iC = G(iC, z11);
            if (iC == -1) {
                return -1;
            }
        }
        return E(iC) + H(iC).g(z11);
    }

    @Override // com.google.android.exoplayer2.f2
    public int i(int i11, int i12, boolean z11) {
        if (this.f39404h) {
            if (i12 == 1) {
                i12 = 2;
            }
            z11 = false;
        }
        int iY = y(i11);
        int iE = E(iY);
        int i13 = H(iY).i(i11 - iE, i12 != 2 ? i12 : 0, z11);
        if (i13 != -1) {
            return iE + i13;
        }
        int iF = F(iY, z11);
        while (iF != -1 && H(iF).u()) {
            iF = F(iF, z11);
        }
        if (iF != -1) {
            return E(iF) + H(iF).e(z11);
        }
        if (i12 == 2) {
            return e(z11);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.f2
    public final f2.b k(int i11, f2.b bVar, boolean z11) {
        int iX = x(i11);
        int iE = E(iX);
        H(iX).k(i11 - D(iX), bVar, z11);
        bVar.f39924c += iE;
        if (z11) {
            bVar.f39923b = C(B(iX), ts.a.e(bVar.f39923b));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.f2
    public final f2.b l(Object obj, f2.b bVar) {
        Object objA = A(obj);
        Object objZ = z(obj);
        int iW = w(objA);
        int iE = E(iW);
        H(iW).l(objZ, bVar);
        bVar.f39924c += iE;
        bVar.f39923b = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.f2
    public int p(int i11, int i12, boolean z11) {
        if (this.f39404h) {
            if (i12 == 1) {
                i12 = 2;
            }
            z11 = false;
        }
        int iY = y(i11);
        int iE = E(iY);
        int iP = H(iY).p(i11 - iE, i12 != 2 ? i12 : 0, z11);
        if (iP != -1) {
            return iE + iP;
        }
        int iG = G(iY, z11);
        while (iG != -1 && H(iG).u()) {
            iG = G(iG, z11);
        }
        if (iG != -1) {
            return E(iG) + H(iG).g(z11);
        }
        if (i12 == 2) {
            return g(z11);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.f2
    public final Object q(int i11) {
        int iX = x(i11);
        return C(B(iX), H(iX).q(i11 - D(iX)));
    }

    @Override // com.google.android.exoplayer2.f2
    public final f2.d s(int i11, f2.d dVar, long j11) {
        int iY = y(i11);
        int iE = E(iY);
        int iD = D(iY);
        H(iY).s(i11 - iE, dVar, j11);
        Object objB = B(iY);
        if (!f2.d.f39933r.equals(dVar.f39942a)) {
            objB = C(objB, dVar.f39942a);
        }
        dVar.f39942a = objB;
        dVar.f39956o += iD;
        dVar.f39957p += iD;
        return dVar;
    }

    protected abstract int w(Object obj);

    protected abstract int x(int i11);

    protected abstract int y(int i11);
}
