package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class m implements h<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f94365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f94366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f94367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final net.time4j.engine.c<Character> f94368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f94369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f94370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f94371g;

    m(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Missing literal.");
        }
        char cCharAt = str.charAt(0);
        this.f94365a = cCharAt;
        this.f94366b = cCharAt;
        this.f94368d = null;
        this.f94367c = str;
        if (cCharAt < ' ') {
            throw new IllegalArgumentException("Literal must not start with non-printable char.");
        }
        this.f94369e = true;
        this.f94370f = str.length() == 1 && d(cCharAt);
        this.f94371g = false;
    }

    private static boolean a(char c11, char c12) {
        return c11 == c12 || Character.toUpperCase(c11) == Character.toUpperCase(c12) || Character.toLowerCase(c11) == Character.toLowerCase(c12);
    }

    private static boolean c(char c11) {
        return c11 == 8206 || c11 == 8207 || c11 == 1564;
    }

    private static boolean d(char c11) {
        return (Character.isLetter(c11) || Character.isDigit(c11) || c(c11)) ? false : true;
    }

    private void e(CharSequence charSequence, s sVar) {
        int iF = sVar.f();
        sVar.k(iF, "Cannot parse: \"" + charSequence + "\" (expected: [" + this.f94367c + "], found: [" + charSequence.subSequence(iF, Math.min(this.f94367c.length() + iF, charSequence.length())) + "])");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    private void f(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, boolean z11) {
        char cCharAt;
        int iF = sVar.f();
        char cCharValue = this.f94365a;
        net.time4j.engine.c<Character> cVar = this.f94368d;
        boolean z12 = false;
        if (cVar != null) {
            cCharValue = ((Character) dVar.b(cVar, (char) 0)).charValue();
        }
        if (iF >= charSequence.length() || cCharValue == 0 || Character.isDigit(cCharValue)) {
            cCharAt = 0;
            z12 = true;
        } else {
            cCharAt = charSequence.charAt(iF);
            char c11 = this.f94366b;
            if (this.f94368d != null && net.time4j.format.a.f94184o.name().equals(this.f94368d.name())) {
                Locale locale = Locale.ROOT;
                if (locale.equals(dVar.b(net.time4j.format.a.f94172c, locale))) {
                    c11 = CoreConstants.DOT;
                    if (cCharValue != ',') {
                        c11 = cCharValue == '.' ? ',' : cCharValue;
                    }
                }
            }
            boolean z13 = (cCharAt == cCharValue || cCharAt == c11) ? false : true;
            if (z13) {
                if (!(z11 ? this.f94369e : ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue()) || (!a(cCharAt, cCharValue) && !a(cCharAt, c11))) {
                    z12 = z13;
                }
            } else {
                z12 = z13;
            }
        }
        if (!z12) {
            sVar.l(iF + 1);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Cannot parse: \"");
        sb2.append(charSequence);
        sb2.append("\" (expected: [");
        sb2.append(cCharValue);
        sb2.append("], found: [");
        if (cCharAt != 0) {
            sb2.append(cCharAt);
        }
        sb2.append("])");
        sVar.k(iF, sb2.toString());
    }

    private void g(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, boolean z11) {
        int iF = sVar.f();
        int iH = h(charSequence, iF, this.f94367c, z11 ? this.f94369e : ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue(), z11 ? this.f94371g : net.time4j.format.b.q((Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT)));
        if (iH == -1) {
            e(charSequence, sVar);
        } else {
            sVar.l(iF + iH);
        }
    }

    static int h(CharSequence charSequence, int i11, CharSequence charSequence2, boolean z11, boolean z12) {
        char cCharAt;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length2; i13++) {
            char cCharAt2 = charSequence2.charAt(i13);
            if (!c(cCharAt2)) {
                if (z12) {
                    cCharAt = 0;
                    while (true) {
                        int i14 = i12 + i11;
                        if (i14 >= length) {
                            break;
                        }
                        cCharAt = charSequence.charAt(i14);
                        if (!c(cCharAt)) {
                            break;
                        }
                        i12++;
                    }
                } else {
                    int i15 = i12 + i11;
                    cCharAt = i15 < length ? charSequence.charAt(i15) : (char) 0;
                }
                if (i12 + i11 >= length) {
                    return -1;
                }
                i12++;
                if (z11) {
                    if (!a(cCharAt, cCharAt2)) {
                        return -1;
                    }
                } else if (cCharAt != cCharAt2) {
                    return -1;
                }
            }
        }
        if (z12) {
            while (true) {
                int i16 = i12 + i11;
                if (i16 >= length || !c(charSequence.charAt(i16))) {
                    break;
                }
                i12++;
            }
        }
        return i12;
    }

    int b() {
        String str = this.f94367c;
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length && Character.isDigit(this.f94367c.charAt(i12)); i12++) {
            i11++;
        }
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            net.time4j.engine.c<Character> cVar = this.f94368d;
            if (cVar != null) {
                return cVar.equals(mVar.f94368d);
            }
            String str = this.f94367c;
            if (str == null) {
                return mVar.f94367c == null && this.f94365a == mVar.f94365a && this.f94366b == mVar.f94366b;
            }
            if (str.equals(mVar.f94367c) && this.f94370f == mVar.f94370f) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<Void> getElement() {
        return null;
    }

    public int hashCode() {
        String strName;
        net.time4j.engine.c<Character> cVar = this.f94368d;
        if (cVar == null) {
            strName = this.f94367c;
            if (strName == null) {
                strName = "";
            }
        } else {
            strName = cVar.name();
        }
        return strName.hashCode() ^ this.f94365a;
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return this.f94367c != null && b() == this.f94367c.length();
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        if (!z11 || !this.f94370f) {
            if (this.f94367c == null) {
                f(charSequence, sVar, dVar, z11);
                return;
            } else {
                g(charSequence, sVar, dVar, z11);
                return;
            }
        }
        int iF = sVar.f();
        if (iF < charSequence.length() && charSequence.charAt(iF) == this.f94365a) {
            sVar.l(iF + 1);
        } else {
            if (this.f94365a == '.' && ((Boolean) dVar.b(net.time4j.format.a.f94180k, Boolean.TRUE)).booleanValue()) {
                return;
            }
            e(charSequence, sVar);
        }
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        net.time4j.engine.c<Character> cVar = this.f94368d;
        if (cVar != null) {
            appendable.append(((Character) dVar.b(cVar, null)).charValue());
            return 1;
        }
        String str = this.f94367c;
        if (str == null) {
            appendable.append(this.f94365a);
            return 1;
        }
        appendable.append(str);
        return this.f94367c.length();
    }

    @Override // net.time4j.format.expert.h
    public h<Void> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        boolean zQ = net.time4j.format.b.q((Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT));
        return new m(this.f94365a, this.f94366b, this.f94367c, this.f94368d, ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue(), this.f94370f && !zQ, zQ);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m.class.getName());
        sb2.append("[literal=");
        if (this.f94368d != null) {
            sb2.append(CoreConstants.CURLY_LEFT);
            sb2.append(this.f94368d);
            sb2.append(CoreConstants.CURLY_RIGHT);
        } else {
            String str = this.f94367c;
            if (str == null) {
                sb2.append(this.f94365a);
                if (this.f94366b != this.f94365a) {
                    sb2.append(", alternative=");
                    sb2.append(this.f94366b);
                }
            } else {
                sb2.append(str);
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<Void> withElement(net.time4j.engine.p<Void> pVar) {
        return this;
    }

    m(char c11, char c12) {
        this.f94365a = c11;
        this.f94366b = c12;
        this.f94368d = null;
        this.f94367c = null;
        if (c11 >= ' ' && c12 >= ' ') {
            if (!Character.isDigit(c11) && !Character.isDigit(c12)) {
                this.f94369e = true;
                this.f94370f = false;
                this.f94371g = false;
                return;
            }
            throw new IllegalArgumentException("Literal must not be a decimal digit.");
        }
        throw new IllegalArgumentException("Literal must not start with non-printable char.");
    }

    m(net.time4j.engine.c<Character> cVar) {
        if (cVar != null) {
            this.f94365a = (char) 0;
            this.f94366b = (char) 0;
            this.f94368d = cVar;
            this.f94367c = null;
            this.f94369e = true;
            this.f94370f = false;
            this.f94371g = false;
            return;
        }
        throw new NullPointerException("Missing format attribute.");
    }

    private m(char c11, char c12, String str, net.time4j.engine.c<Character> cVar, boolean z11, boolean z12, boolean z13) {
        this.f94365a = c11;
        this.f94366b = c12;
        this.f94367c = str;
        this.f94368d = cVar;
        this.f94369e = z11;
        this.f94370f = z12;
        this.f94371g = z13;
    }
}
