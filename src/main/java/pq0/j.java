package pq0;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes10.dex */
public class j extends uq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sq0.i f103686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103687b;

    public static class a extends uq0.b {
        @Override // uq0.e
        public uq0.f a(uq0.h hVar, uq0.g gVar) {
            CharSequence charSequenceB;
            if (hVar.O() >= rq0.d.f108704a) {
                return uq0.f.c();
            }
            CharSequence charSequenceA = hVar.a();
            int iC = hVar.c();
            j jVarK = j.k(charSequenceA, iC);
            if (jVarK != null) {
                return uq0.f.d(jVarK).b(charSequenceA.length());
            }
            int iL = j.l(charSequenceA, iC);
            return (iL <= 0 || (charSequenceB = gVar.b()) == null) ? uq0.f.c() : uq0.f.d(new j(iL, charSequenceB.toString())).b(charSequenceA.length()).e();
        }
    }

    public j(int i11, String str) {
        sq0.i iVar = new sq0.i();
        this.f103686a = iVar;
        iVar.o(i11);
        this.f103687b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j k(CharSequence charSequence, int i11) {
        int iK = rq0.d.k('#', charSequence, i11, charSequence.length()) - i11;
        if (iK == 0 || iK > 6) {
            return null;
        }
        int i12 = i11 + iK;
        if (i12 >= charSequence.length()) {
            return new j(iK, "");
        }
        char cCharAt = charSequence.charAt(i12);
        if (cCharAt != ' ' && cCharAt != '\t') {
            return null;
        }
        int iN = rq0.d.n(charSequence, charSequence.length() - 1, i12);
        int iL = rq0.d.l('#', charSequence, iN, i12);
        int iN2 = rq0.d.n(charSequence, iL, i12);
        return iN2 != iL ? new j(iK, charSequence.subSequence(i12, iN2 + 1).toString()) : new j(iK, charSequence.subSequence(i12, iN + 1).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(CharSequence charSequence, int i11) {
        char cCharAt = charSequence.charAt(i11);
        if (cCharAt != '-') {
            if (cCharAt != '=') {
                return 0;
            }
            if (m(charSequence, i11 + 1, '=')) {
                return 1;
            }
        }
        return m(charSequence, i11 + 1, CoreConstants.DASH_CHAR) ? 2 : 0;
    }

    private static boolean m(CharSequence charSequence, int i11, char c11) {
        return rq0.d.m(charSequence, rq0.d.k(c11, charSequence, i11, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // uq0.d
    public sq0.a c() {
        return this.f103686a;
    }

    @Override // uq0.d
    public uq0.c e(uq0.h hVar) {
        return uq0.c.d();
    }

    @Override // uq0.a, uq0.d
    public void h(tq0.a aVar) {
        aVar.a(this.f103687b, this.f103686a);
    }
}
