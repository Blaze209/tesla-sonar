package pq0;

/* JADX INFO: loaded from: classes10.dex */
public class i extends uq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sq0.g f103683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f103684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f103685c;

    public static class a extends uq0.b {
        @Override // uq0.e
        public uq0.f a(uq0.h hVar, uq0.g gVar) {
            int iO = hVar.O();
            if (iO >= rq0.d.f108704a) {
                return uq0.f.c();
            }
            int iC = hVar.c();
            i iVarK = i.k(hVar.a(), iC, iO);
            return iVarK != null ? uq0.f.d(iVarK).b(iC + iVarK.f103683a.p()) : uq0.f.c();
        }
    }

    public i(char c11, int i11, int i12) {
        sq0.g gVar = new sq0.g();
        this.f103683a = gVar;
        this.f103685c = new StringBuilder();
        gVar.s(c11);
        gVar.u(i11);
        gVar.t(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i k(CharSequence charSequence, int i11, int i12) {
        int length = charSequence.length();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = i11; i15 < length; i15++) {
            char cCharAt = charSequence.charAt(i15);
            if (cCharAt == '`') {
                i13++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i14++;
            }
        }
        if (i13 >= 3 && i14 == 0) {
            if (rq0.d.b('`', charSequence, i11 + i13) != -1) {
                return null;
            }
            return new i('`', i13, i12);
        }
        if (i14 < 3 || i13 != 0) {
            return null;
        }
        return new i('~', i14, i12);
    }

    private boolean l(CharSequence charSequence, int i11) {
        char cN = this.f103683a.n();
        int iP = this.f103683a.p();
        int iK = rq0.d.k(cN, charSequence, i11, charSequence.length()) - i11;
        return iK >= iP && rq0.d.m(charSequence, i11 + iK, charSequence.length()) == charSequence.length();
    }

    @Override // uq0.d
    public sq0.a c() {
        return this.f103683a;
    }

    @Override // uq0.a, uq0.d
    public void d(CharSequence charSequence) {
        if (this.f103684b == null) {
            this.f103684b = charSequence.toString();
        } else {
            this.f103685c.append(charSequence);
            this.f103685c.append('\n');
        }
    }

    @Override // uq0.d
    public uq0.c e(uq0.h hVar) {
        int iC = hVar.c();
        int index = hVar.getIndex();
        CharSequence charSequenceA = hVar.a();
        if (hVar.O() < rq0.d.f108704a && l(charSequenceA, iC)) {
            return uq0.c.c();
        }
        int length = charSequenceA.length();
        for (int iO = this.f103683a.o(); iO > 0 && index < length && charSequenceA.charAt(index) == ' '; iO--) {
            index++;
        }
        return uq0.c.b(index);
    }

    @Override // uq0.a, uq0.d
    public void g() {
        this.f103683a.v(rq0.a.e(this.f103684b.trim()));
        this.f103683a.w(this.f103685c.toString());
    }
}
