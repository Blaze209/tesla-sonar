package jr;

import com.google.common.collect.d1;
import com.google.common.collect.x;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x<a> f84279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f84280b;

    private f(int i11, x<a> xVar) {
        this.f84280b = i11;
        this.f84279a = xVar;
    }

    private static a a(int i11, int i12, d0 d0Var) {
        switch (i11) {
            case 1718776947:
                return g.d(i12, d0Var);
            case 1751742049:
                return c.b(d0Var);
            case 1752331379:
                return d.c(d0Var);
            case 1852994675:
                return h.a(d0Var);
            default:
                return null;
        }
    }

    public static f c(int i11, d0 d0Var) {
        x.a aVar = new x.a();
        int iG = d0Var.g();
        int iB = -2;
        while (d0Var.a() > 8) {
            int iU = d0Var.u();
            int iF = d0Var.f() + d0Var.u();
            d0Var.T(iF);
            a aVarC = iU == 1414744396 ? c(d0Var.u(), d0Var) : a(iU, iB, d0Var);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                aVar.a(aVarC);
            }
            d0Var.U(iF);
            d0Var.T(iG);
        }
        return new f(i11, aVar.k());
    }

    public <T extends a> T b(Class<T> cls) {
        d1<a> it = this.f84279a.iterator();
        while (it.hasNext()) {
            T t11 = (T) it.next();
            if (t11.getClass() == cls) {
                return t11;
            }
        }
        return null;
    }

    @Override // jr.a
    public int getType() {
        return this.f84280b;
    }
}
