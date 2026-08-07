package z7;

import android.util.Pair;
import p7.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends r0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f127042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n8.t f127043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f127044g;

    public a(boolean z11, n8.t tVar) {
        this.f127044g = z11;
        this.f127043f = tVar;
        this.f127042e = tVar.getLength();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int G(int i11, boolean z11) {
        if (z11) {
            return this.f127043f.b(i11);
        }
        if (i11 < this.f127042e - 1) {
            return i11 + 1;
        }
        return -1;
    }

    private int H(int i11, boolean z11) {
        if (z11) {
            return this.f127043f.a(i11);
        }
        if (i11 > 0) {
            return i11 - 1;
        }
        return -1;
    }

    protected abstract Object C(int i11);

    protected abstract int E(int i11);

    protected abstract int F(int i11);

    protected abstract r0 I(int i11);

    @Override // p7.r0
    public int e(boolean z11) {
        if (this.f127042e == 0) {
            return -1;
        }
        if (this.f127044g) {
            z11 = false;
        }
        int iE = z11 ? this.f127043f.e() : 0;
        while (I(iE).u()) {
            iE = G(iE, z11);
            if (iE == -1) {
                return -1;
            }
        }
        return F(iE) + I(iE).e(z11);
    }

    @Override // p7.r0
    public final int f(Object obj) {
        int iF;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objB = B(obj);
        Object objA = A(obj);
        int iX = x(objB);
        if (iX == -1 || (iF = I(iX).f(objA)) == -1) {
            return -1;
        }
        return E(iX) + iF;
    }

    @Override // p7.r0
    public int g(boolean z11) {
        int i11 = this.f127042e;
        if (i11 == 0) {
            return -1;
        }
        if (this.f127044g) {
            z11 = false;
        }
        int iC = z11 ? this.f127043f.c() : i11 - 1;
        while (I(iC).u()) {
            iC = H(iC, z11);
            if (iC == -1) {
                return -1;
            }
        }
        return F(iC) + I(iC).g(z11);
    }

    @Override // p7.r0
    public int i(int i11, int i12, boolean z11) {
        if (this.f127044g) {
            if (i12 == 1) {
                i12 = 2;
            }
            z11 = false;
        }
        int iZ = z(i11);
        int iF = F(iZ);
        int i13 = I(iZ).i(i11 - iF, i12 != 2 ? i12 : 0, z11);
        if (i13 != -1) {
            return iF + i13;
        }
        int iG = G(iZ, z11);
        while (iG != -1 && I(iG).u()) {
            iG = G(iG, z11);
        }
        if (iG != -1) {
            return F(iG) + I(iG).e(z11);
        }
        if (i12 == 2) {
            return e(z11);
        }
        return -1;
    }

    @Override // p7.r0
    public final r0.b k(int i11, r0.b bVar, boolean z11) {
        int iY = y(i11);
        int iF = F(iY);
        I(iY).k(i11 - E(iY), bVar, z11);
        bVar.f101462c += iF;
        if (z11) {
            bVar.f101461b = D(C(iY), s7.a.f(bVar.f101461b));
        }
        return bVar;
    }

    @Override // p7.r0
    public final r0.b l(Object obj, r0.b bVar) {
        Object objB = B(obj);
        Object objA = A(obj);
        int iX = x(objB);
        int iF = F(iX);
        I(iX).l(objA, bVar);
        bVar.f101462c += iF;
        bVar.f101461b = obj;
        return bVar;
    }

    @Override // p7.r0
    public int p(int i11, int i12, boolean z11) {
        if (this.f127044g) {
            if (i12 == 1) {
                i12 = 2;
            }
            z11 = false;
        }
        int iZ = z(i11);
        int iF = F(iZ);
        int iP = I(iZ).p(i11 - iF, i12 != 2 ? i12 : 0, z11);
        if (iP != -1) {
            return iF + iP;
        }
        int iH = H(iZ, z11);
        while (iH != -1 && I(iH).u()) {
            iH = H(iH, z11);
        }
        if (iH != -1) {
            return F(iH) + I(iH).g(z11);
        }
        if (i12 == 2) {
            return g(z11);
        }
        return -1;
    }

    @Override // p7.r0
    public final Object q(int i11) {
        int iY = y(i11);
        return D(C(iY), I(iY).q(i11 - E(iY)));
    }

    @Override // p7.r0
    public final r0.d s(int i11, r0.d dVar, long j11) {
        int iZ = z(i11);
        int iF = F(iZ);
        int iE = E(iZ);
        I(iZ).s(i11 - iF, dVar, j11);
        Object objC = C(iZ);
        if (!r0.d.f101471q.equals(dVar.f101481a)) {
            objC = D(objC, dVar.f101481a);
        }
        dVar.f101481a = objC;
        dVar.f101494n += iE;
        dVar.f101495o += iE;
        return dVar;
    }

    protected abstract int x(Object obj);

    protected abstract int y(int i11);

    protected abstract int z(int i11);
}
