package fg;

/* JADX INFO: loaded from: classes3.dex */
public class g0 implements n0<ig.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f65895a = new g0();

    private g0() {
    }

    @Override // fg.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ig.d a(gg.c cVar, float f11) {
        boolean z11 = cVar.o() == gg.c.b.BEGIN_ARRAY;
        if (z11) {
            cVar.f();
        }
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.F();
        }
        if (z11) {
            cVar.e();
        }
        return new ig.d((fNextDouble / 100.0f) * f11, (fNextDouble2 / 100.0f) * f11);
    }
}
