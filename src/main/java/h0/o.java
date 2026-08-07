package h0;

/* JADX INFO: loaded from: classes.dex */
public class o {
    public static s0.c a(s0.c cVar, s0.c cVar2) {
        if (cVar2 == null) {
            return cVar;
        }
        if (cVar == null) {
            return cVar2;
        }
        s0.c.a aVarB = s0.c.a.b(cVar);
        if (cVar2.b() != null) {
            aVarB.d(cVar2.b());
        }
        if (cVar2.d() != null) {
            aVarB.f(cVar2.d());
        }
        if (cVar2.c() != null) {
            aVarB.e(cVar2.c());
        }
        if (cVar2.a() != 0) {
            aVarB.c(cVar2.a());
        }
        return aVarB.a();
    }
}
