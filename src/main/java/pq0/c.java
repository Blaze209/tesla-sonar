package pq0;

/* JADX INFO: loaded from: classes10.dex */
public class c extends uq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sq0.b f103644a = new sq0.b();

    public static class a extends uq0.b {
        @Override // uq0.e
        public uq0.f a(uq0.h hVar, uq0.g gVar) {
            int iC = hVar.c();
            if (!c.k(hVar, iC)) {
                return uq0.f.c();
            }
            int column = hVar.getColumn() + hVar.O();
            int i11 = column + 1;
            if (rq0.d.i(hVar.a(), iC + 1)) {
                i11 = column + 2;
            }
            return uq0.f.d(new c()).a(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(uq0.h hVar, int i11) {
        CharSequence charSequenceA = hVar.a();
        return hVar.O() < rq0.d.f108704a && i11 < charSequenceA.length() && charSequenceA.charAt(i11) == '>';
    }

    @Override // uq0.a, uq0.d
    public boolean a() {
        return true;
    }

    @Override // uq0.d
    public uq0.c e(uq0.h hVar) {
        int iC = hVar.c();
        if (!k(hVar, iC)) {
            return uq0.c.d();
        }
        int column = hVar.getColumn() + hVar.O();
        int i11 = column + 1;
        if (rq0.d.i(hVar.a(), iC + 1)) {
            i11 = column + 2;
        }
        return uq0.c.a(i11);
    }

    @Override // uq0.a, uq0.d
    public boolean f(sq0.a aVar) {
        return true;
    }

    @Override // uq0.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public sq0.b c() {
        return this.f103644a;
    }
}
