package net.time4j.format.expert;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class j implements h<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h<Void> f94334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final net.time4j.engine.p<Integer> f94335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f94337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f94338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final char f94339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final net.time4j.format.g f94340g;

    j(net.time4j.engine.p<Integer> pVar, int i11, int i12, boolean z11) {
        this.f94335b = pVar;
        this.f94336c = i11;
        this.f94337d = i12;
        this.f94338e = !z11 && i11 == i12;
        this.f94334a = z11 ? new m(net.time4j.format.a.f94184o) : null;
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative min digits: " + i11);
        }
        if (i11 > i12) {
            throw new IllegalArgumentException("Max smaller than min: " + i12 + " < " + i11);
        }
        if (i11 > 9) {
            throw new IllegalArgumentException("Min digits out of range: " + i11);
        }
        if (i12 <= 9) {
            this.f94339f = '0';
            this.f94340g = net.time4j.format.g.SMART;
        } else {
            throw new IllegalArgumentException("Max digits out of range: " + i12);
        }
    }

    private int a(BigDecimal bigDecimal, int i11, int i12) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i11);
        return bigDecimal.multiply(BigDecimal.valueOf(i12).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).intValueExact();
    }

    private boolean b() {
        return this.f94334a != null;
    }

    private static BigDecimal c(Number number) {
        return BigDecimal.valueOf(number.longValue());
    }

    net.time4j.engine.q<?> d(net.time4j.engine.q<?> qVar, net.time4j.engine.q<?> qVar2) {
        k kVar = k.FRACTION;
        if (!qVar2.n(kVar)) {
            return qVar;
        }
        int iA = a((BigDecimal) qVar2.s(kVar), ((Integer) qVar.k(this.f94335b)).intValue(), ((Integer) qVar.o(this.f94335b)).intValue());
        qVar2.B(kVar, null);
        qVar2.z(this.f94335b, iA);
        return qVar.z(this.f94335b, iA);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f94335b.equals(jVar.f94335b) && this.f94336c == jVar.f94336c && this.f94337d == jVar.f94337d && b() == jVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<Integer> getElement() {
        return this.f94335b;
    }

    public int hashCode() {
        return (this.f94335b.hashCode() * 7) + ((this.f94336c + (this.f94337d * 10)) * 31);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return true;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        int i11;
        int i12;
        net.time4j.format.g gVar = z11 ? this.f94340g : (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
        int i13 = 9;
        if (!gVar.isLax() || this.f94338e) {
            i11 = this.f94336c;
            i12 = this.f94337d;
        } else {
            i12 = 9;
            i11 = 0;
        }
        int length = charSequence.length();
        if (sVar.f() >= length) {
            if (i11 > 0) {
                sVar.k(sVar.f(), "Expected fraction digits not found for: " + this.f94335b.name());
                return;
            }
            return;
        }
        if (b()) {
            this.f94334a.parse(charSequence, sVar, dVar, null, z11);
            if (sVar.i()) {
                if (i11 == 0) {
                    sVar.a();
                    return;
                }
                return;
            }
        }
        int iF = sVar.f();
        int i14 = iF + i11;
        int iMin = Math.min(i12 + iF, length);
        if (i14 > length && gVar.isStrict()) {
            sVar.k(sVar.f(), "Expected at least " + i11 + " digits.");
            return;
        }
        char cCharValue = z11 ? this.f94339f : ((Character) dVar.b(net.time4j.format.a.f94182m, '0')).charValue();
        long j11 = 0;
        while (iF < iMin) {
            int iCharAt = charSequence.charAt(iF) - cCharValue;
            if (iCharAt < 0 || iCharAt > i13) {
                if (iF >= i14 || !gVar.isStrict()) {
                    break;
                    break;
                }
                sVar.k(sVar.f(), "Expected at least " + i11 + " digits.");
                return;
            }
            j11 = (j11 * 10) + ((long) iCharAt);
            iF++;
            i13 = 9;
        }
        BigDecimal bigDecimalMovePointLeft = new BigDecimal(j11).movePointLeft(iF - sVar.f());
        if (this.f94335b.name().equals("NANO_OF_SECOND")) {
            tVar.E(this.f94335b, a(bigDecimalMovePointLeft, 0, 999999999));
        } else {
            tVar.F(k.FRACTION, bigDecimalMovePointLeft);
            net.time4j.engine.p<Integer> pVar = this.f94335b;
            tVar.F(pVar, pVar.t());
        }
        sVar.l(iF);
    }

    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        net.time4j.engine.d dVar2;
        char cCharValue;
        Set<g> set2;
        int i11;
        int i12;
        BigDecimal bigDecimalC = c((Number) oVar.s(this.f94335b));
        BigDecimal bigDecimalC2 = c((Number) oVar.k(this.f94335b));
        BigDecimal bigDecimalC3 = c((Number) oVar.o(this.f94335b));
        if (bigDecimalC.compareTo(bigDecimalC3) > 0) {
            bigDecimalC = bigDecimalC3;
        }
        BigDecimal bigDecimalSubtract = bigDecimalC.subtract(bigDecimalC2);
        BigDecimal bigDecimalAdd = bigDecimalC3.subtract(bigDecimalC2).add(BigDecimal.ONE);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimalA = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimalA) != 0) {
            bigDecimalA = com.google.android.gms.internal.measurement.a.a(bigDecimalDivide);
        }
        BigDecimal bigDecimal = bigDecimalA;
        if (z11) {
            cCharValue = this.f94339f;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            cCharValue = ((Character) dVar2.b(net.time4j.format.a.f94182m, '0')).charValue();
        }
        char c11 = cCharValue;
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        int i13 = 0;
        if (bigDecimal.scale() == 0) {
            if (this.f94336c > 0) {
                if (b()) {
                    this.f94334a.print(oVar, appendable, dVar2, set, z11);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                while (true) {
                    i12 = this.f94336c;
                    if (i13 >= i12) {
                        break;
                    }
                    appendable.append(c11);
                    i13++;
                }
                i13 = i11 + i12;
            }
            set2 = set;
        } else {
            if (b()) {
                set2 = set;
                this.f94334a.print(oVar, appendable, dVar, set2, z11);
                i13 = 1;
            } else {
                set2 = set;
            }
            String plainString = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), this.f94336c), this.f94337d), roundingMode).toPlainString();
            int i14 = c11 - '0';
            int length2 = plainString.length();
            for (int i15 = 2; i15 < length2; i15++) {
                appendable.append((char) (plainString.charAt(i15) + i14));
                i13++;
            }
        }
        if (length != -1 && i13 > 1 && set2 != null) {
            set2.add(new g(this.f94335b, length + 1, length + i13));
        }
        return i13;
    }

    @Override // net.time4j.format.expert.h
    public h<Integer> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new j(this.f94334a, this.f94335b, this.f94336c, this.f94337d, this.f94338e, ((Character) dVar.b(net.time4j.format.a.f94182m, '0')).charValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(j.class.getName());
        sb2.append("[element=");
        sb2.append(this.f94335b.name());
        sb2.append(", min-digits=");
        sb2.append(this.f94336c);
        sb2.append(", max-digits=");
        sb2.append(this.f94337d);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<Integer> withElement(net.time4j.engine.p<Integer> pVar) {
        return this.f94335b == pVar ? this : new j(pVar, this.f94336c, this.f94337d, b());
    }

    private j(h<Void> hVar, net.time4j.engine.p<Integer> pVar, int i11, int i12, boolean z11, char c11, net.time4j.format.g gVar) {
        this.f94334a = hVar;
        this.f94335b = pVar;
        this.f94336c = i11;
        this.f94337d = i12;
        this.f94338e = z11;
        this.f94339f = c11;
        this.f94340g = gVar;
    }
}
