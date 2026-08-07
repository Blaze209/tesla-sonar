package pq0;

/* JADX INFO: loaded from: classes10.dex */
public class p extends uq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sq0.p f103730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f103731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f103732c;

    public static class a extends uq0.b {
        @Override // uq0.e
        public uq0.f a(uq0.h hVar, uq0.g gVar) {
            uq0.d dVarA = gVar.a();
            if (hVar.O() >= rq0.d.f108704a) {
                return uq0.f.c();
            }
            b bVarN = p.n(hVar.a(), hVar.c(), hVar.getColumn() + hVar.O(), gVar.b() != null);
            if (bVarN == null) {
                return uq0.f.c();
            }
            int i11 = bVarN.f103734b;
            q qVar = new q(i11 - hVar.getColumn());
            if ((dVarA instanceof p) && p.m((sq0.p) dVarA.c(), bVarN.f103733a)) {
                return uq0.f.d(qVar).a(i11);
            }
            p pVar = new p(bVarN.f103733a);
            bVarN.f103733a.o(true);
            return uq0.f.d(pVar, qVar).a(i11);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final sq0.p f103733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f103734b;

        b(sq0.p pVar, int i11) {
            this.f103733a = pVar;
            this.f103734b = i11;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final sq0.p f103735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f103736b;

        c(sq0.p pVar, int i11) {
            this.f103735a = pVar;
            this.f103736b = i11;
        }
    }

    public p(sq0.p pVar) {
        this.f103730a = pVar;
    }

    private static boolean k(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static boolean l(CharSequence charSequence, int i11) {
        char cCharAt;
        return i11 >= charSequence.length() || (cCharAt = charSequence.charAt(i11)) == '\t' || cCharAt == ' ';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean m(sq0.p pVar, sq0.p pVar2) {
        if ((pVar instanceof sq0.c) && (pVar2 instanceof sq0.c)) {
            return k(Character.valueOf(((sq0.c) pVar).p()), Character.valueOf(((sq0.c) pVar2).p()));
        }
        if ((pVar instanceof sq0.s) && (pVar2 instanceof sq0.s)) {
            return k(Character.valueOf(((sq0.s) pVar).p()), Character.valueOf(((sq0.s) pVar2).p()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b n(CharSequence charSequence, int i11, int i12, boolean z11) {
        boolean z12;
        c cVarO = o(charSequence, i11);
        if (cVarO == null) {
            return null;
        }
        sq0.p pVar = cVarO.f103735a;
        int i13 = cVarO.f103736b;
        int i14 = i12 + (i13 - i11);
        int length = charSequence.length();
        int iA = i14;
        while (true) {
            if (i13 >= length) {
                z12 = false;
                break;
            }
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    z12 = true;
                    break;
                }
                iA++;
            } else {
                iA += rq0.d.a(iA);
            }
            i13++;
        }
        if (z11 && (((pVar instanceof sq0.s) && ((sq0.s) pVar).q() != 1) || !z12)) {
            return null;
        }
        if (!z12 || iA - i14 > rq0.d.f108704a) {
            iA = i14 + 1;
        }
        return new b(pVar, iA);
    }

    private static c o(CharSequence charSequence, int i11) {
        char cCharAt = charSequence.charAt(i11);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return p(charSequence, i11);
        }
        int i12 = i11 + 1;
        if (!l(charSequence, i12)) {
            return null;
        }
        sq0.c cVar = new sq0.c();
        cVar.q(cCharAt);
        return new c(cVar, i12);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:5:0x0009  */
    private static c p(CharSequence charSequence, int i11) {
        int i12;
        int length = charSequence.length();
        int i13 = 0;
        for (int i14 = i11; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt != ')' || cCharAt == '.') {
                if (i13 >= 1) {
                    i12 = i14 + 1;
                    if (l(charSequence, i12)) {
                        String string = charSequence.subSequence(i11, i14).toString();
                        sq0.s sVar = new sq0.s();
                        sVar.s(Integer.parseInt(string));
                        sVar.r(cCharAt);
                        return new c(sVar, i12);
                    }
                }
                return null;
            }
            switch (cCharAt) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i13++;
                    if (i13 > 9) {
                        return null;
                    }
                    break;
                    break;
                default:
                    return null;
            }
            while (i14 < length) {
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 != ')') {
                }
                if (i13 >= 1) {
                    i12 = i14 + 1;
                    if (l(charSequence, i12)) {
                        String string2 = charSequence.subSequence(i11, i14).toString();
                        sq0.s sVar2 = new sq0.s();
                        sVar2.s(Integer.parseInt(string2));
                        sVar2.r(cCharAt2);
                        return new c(sVar2, i12);
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // uq0.a, uq0.d
    public boolean a() {
        return true;
    }

    @Override // uq0.d
    public sq0.a c() {
        return this.f103730a;
    }

    @Override // uq0.d
    public uq0.c e(uq0.h hVar) {
        if (hVar.b()) {
            this.f103731b = true;
            this.f103732c = 0;
        } else if (this.f103731b) {
            this.f103732c++;
        }
        return uq0.c.b(hVar.getIndex());
    }

    @Override // uq0.a, uq0.d
    public boolean f(sq0.a aVar) {
        if (!(aVar instanceof sq0.q)) {
            return false;
        }
        if (this.f103731b && this.f103732c == 1) {
            this.f103730a.o(false);
            this.f103731b = false;
        }
        return true;
    }
}
