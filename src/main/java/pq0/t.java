package pq0;

import sq0.x;

/* JADX INFO: loaded from: classes10.dex */
public class t extends uq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f103745a = new x();

    public static class a extends uq0.b {
        @Override // uq0.e
        public uq0.f a(uq0.h hVar, uq0.g gVar) {
            if (hVar.O() >= 4) {
                return uq0.f.c();
            }
            int iC = hVar.c();
            CharSequence charSequenceA = hVar.a();
            return t.j(charSequenceA, iC) ? uq0.f.d(new t()).b(charSequenceA.length()) : uq0.f.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i14++;
                } else if (cCharAt == '-') {
                    i12++;
                } else {
                    if (cCharAt != '_') {
                        return false;
                    }
                    i13++;
                }
            }
            i11++;
        }
        if (i12 >= 3 && i13 == 0 && i14 == 0) {
            return true;
        }
        if (i13 >= 3 && i12 == 0 && i14 == 0) {
            return true;
        }
        return i14 >= 3 && i12 == 0 && i13 == 0;
    }

    @Override // uq0.d
    public sq0.a c() {
        return this.f103745a;
    }

    @Override // uq0.d
    public uq0.c e(uq0.h hVar) {
        return uq0.c.d();
    }
}
