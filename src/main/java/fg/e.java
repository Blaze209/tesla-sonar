package fg;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final gg.c.a f65889a = gg.c.a.a("ef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65890b = gg.c.a.a("ty", "v");

    private static cg.a a(gg.c cVar, tf.i iVar) {
        cVar.h();
        cg.a aVar = null;
        while (true) {
            boolean z11 = false;
            while (true) {
                if (!cVar.hasNext()) {
                    cVar.j();
                    return aVar;
                }
                int iT = cVar.t(f65890b);
                if (iT != 0) {
                    if (iT != 1) {
                        cVar.B();
                        cVar.F();
                    } else if (z11) {
                        aVar = new cg.a(d.e(cVar, iVar));
                    } else {
                        cVar.F();
                    }
                } else if (cVar.nextInt() == 0) {
                    z11 = true;
                }
            }
        }
    }

    static cg.a b(gg.c cVar, tf.i iVar) {
        cg.a aVar = null;
        while (cVar.hasNext()) {
            if (cVar.t(f65889a) != 0) {
                cVar.B();
                cVar.F();
            } else {
                cVar.f();
                while (cVar.hasNext()) {
                    cg.a aVarA = a(cVar, iVar);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                cVar.e();
            }
        }
        return aVar;
    }
}
