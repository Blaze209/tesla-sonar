package net.time4j.format.expert;

import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class f0 implements h<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.p<Integer> f94309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f94310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f94311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final net.time4j.format.g f94312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f94313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f94314f;

    f0(net.time4j.engine.p<Integer> pVar) {
        if (!pVar.name().startsWith("YEAR")) {
            throw new IllegalArgumentException("Year element required: " + pVar);
        }
        this.f94309a = pVar;
        this.f94310b = 0;
        this.f94311c = '0';
        this.f94312d = net.time4j.format.g.SMART;
        this.f94313e = 0;
        this.f94314f = 100;
    }

    private int a(boolean z11, net.time4j.engine.d dVar) {
        int iIntValue = z11 ? this.f94314f : ((Integer) dVar.b(net.time4j.format.a.f94186q, Integer.valueOf(this.f94314f))).intValue();
        if (iIntValue >= 100) {
            return iIntValue;
        }
        throw new IllegalArgumentException("Pivot year must not be smaller than 100: " + iIntValue);
    }

    private static int b(int i11, int i12) {
        return ((i11 >= i12 % 100 ? (i12 / 100) - 1 : i12 / 100) * 100) + i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return this.f94309a.equals(((f0) obj).f94309a);
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<Integer> getElement() {
        return this.f94309a;
    }

    public int hashCode() {
        return this.f94309a.hashCode();
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return true;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        int length = charSequence.length();
        int iF = sVar.f();
        int iIntValue = z11 ? this.f94313e : ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue();
        if (iIntValue > 0) {
            length -= iIntValue;
        }
        if (iF >= length) {
            sVar.k(iF, "Missing digits for: " + this.f94309a.name());
            sVar.n();
            return;
        }
        int iMin = (z11 ? this.f94312d : (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART)).isStrict() ? 2 : 9;
        char cCharValue = z11 ? this.f94311c : ((Character) dVar.b(net.time4j.format.a.f94182m, '0')).charValue();
        if (this.f94310b > 0 && iIntValue <= 0) {
            int i11 = 0;
            for (int i12 = iF; i12 < length; i12++) {
                int iCharAt = charSequence.charAt(i12) - cCharValue;
                if (iCharAt < 0 || iCharAt > 9) {
                    break;
                }
                i11++;
            }
            iMin = Math.min(iMin, i11 - this.f94310b);
        }
        int i13 = iF + 2;
        int iMin2 = Math.min(length, iMin + iF);
        boolean z12 = true;
        int i14 = iF;
        int iB = 0;
        while (i14 < iMin2) {
            int iCharAt2 = charSequence.charAt(i14) - cCharValue;
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                if (!z12) {
                    break;
                }
                sVar.k(iF, "Digit expected.");
                return;
            } else {
                iB = (iB * 10) + iCharAt2;
                i14++;
                z12 = false;
            }
        }
        if (i14 < i13) {
            sVar.k(iF, "Not enough digits found for: " + this.f94309a.name());
            return;
        }
        if (i14 == i13) {
            iB = b(iB, a(z11, dVar));
        }
        tVar.E(this.f94309a, iB);
        sVar.l(i14);
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        int iP = oVar.p(this.f94309a);
        if (iP < 0) {
            if (iP == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Format context has no year: " + oVar);
            }
            throw new IllegalArgumentException("Negative year cannot be printed as two-digit-year: " + iP);
        }
        if (a(z11, dVar) != 100) {
            iP = net.time4j.base.c.c(iP, 100);
        }
        String string = Integer.toString(iP);
        char cCharValue = z11 ? this.f94311c : ((Character) dVar.b(net.time4j.format.a.f94182m, '0')).charValue();
        int i11 = 0;
        if (cCharValue != '0') {
            int i12 = cCharValue - '0';
            char[] charArray = string.toCharArray();
            for (int i13 = 0; i13 < charArray.length; i13++) {
                charArray[i13] = (char) (charArray[i13] + i12);
            }
            string = new String(charArray);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        if (iP < 10) {
            appendable.append(cCharValue);
            i11 = 1;
        }
        appendable.append(string);
        int length2 = i11 + string.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new g(this.f94309a, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.h
    public h<Integer> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new f0(this.f94309a, i11, ((Character) dVar.b(net.time4j.format.a.f94182m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART), ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue(), ((Integer) dVar.b(net.time4j.format.a.f94186q, Integer.valueOf(cVar.q().c()))).intValue());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(f0.class.getName());
        sb2.append("[element=");
        sb2.append(this.f94309a.name());
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<Integer> withElement(net.time4j.engine.p<Integer> pVar) {
        return this.f94309a == pVar ? this : new f0(pVar);
    }

    private f0(net.time4j.engine.p<Integer> pVar, int i11, char c11, net.time4j.format.g gVar, int i12, int i13) {
        this.f94309a = pVar;
        this.f94310b = i11;
        this.f94311c = c11;
        this.f94312d = gVar;
        this.f94313e = i12;
        this.f94314f = i13;
    }
}
