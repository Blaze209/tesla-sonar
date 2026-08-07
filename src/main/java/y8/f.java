package y8;

import com.google.common.collect.d1;
import com.google.common.collect.x;
import s7.c0;

/* JADX INFO: loaded from: classes3.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x<a> f125272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f125273b;

    private f(int i11, x<a> xVar) {
        this.f125273b = i11;
        this.f125272a = xVar;
    }

    private static a a(int i11, int i12, c0 c0Var) {
        switch (i11) {
            case 1718776947:
                return g.d(i12, c0Var);
            case 1751742049:
                return c.b(c0Var);
            case 1752331379:
                return d.c(c0Var);
            case 1852994675:
                return h.a(c0Var);
            default:
                return null;
        }
    }

    public static f c(int i11, c0 c0Var) {
        x.a aVar = new x.a();
        int iJ = c0Var.j();
        int iB = -2;
        while (c0Var.a() > 8) {
            int iZ = c0Var.z();
            int iG = c0Var.g() + c0Var.z();
            c0Var.a0(iG);
            a aVarC = iZ == 1414744396 ? c(c0Var.z(), c0Var) : a(iZ, iB, c0Var);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                aVar.a(aVarC);
            }
            c0Var.b0(iG);
            c0Var.a0(iJ);
        }
        return new f(i11, aVar.k());
    }

    public <T extends a> T b(Class<T> cls) {
        d1<a> it = this.f125272a.iterator();
        while (it.hasNext()) {
            T t11 = (T) it.next();
            if (t11.getClass() == cls) {
                return t11;
            }
        }
        return null;
    }

    @Override // y8.a
    public int getType() {
        return this.f125273b;
    }
}
