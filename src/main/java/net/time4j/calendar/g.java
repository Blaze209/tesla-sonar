package net.time4j.calendar;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Map;
import net.time4j.c0;
import net.time4j.format.t;
import net.time4j.format.v;

/* JADX INFO: loaded from: classes9.dex */
class g implements t<h>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final g f94061a = new g();
    private static final long serialVersionUID = -5874268477318061153L;

    g() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(net.time4j.engine.o oVar, net.time4j.engine.o oVar2) {
        return ((h) oVar.s(this)).compareTo((h) oVar2.s(this));
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public h s() {
        return h.d(12);
    }

    @Override // net.time4j.engine.p
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h t() {
        return h.d(1);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0146 A[PHI: r8
      0x0146: PHI (r8v5 net.time4j.c0) = (r8v4 net.time4j.c0), (r8v9 net.time4j.c0) binds: [B:47:0x0129, B:49:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // net.time4j.format.t
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public h parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
        boolean z11;
        h hVarD;
        boolean z12;
        int i11;
        boolean z13;
        net.time4j.format.j jVar;
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT);
        int length = charSequence.length();
        int index = parsePosition.getIndex();
        h hVar = null;
        if (index >= length) {
            parsePosition.setErrorIndex(length);
            return null;
        }
        int i12 = 0;
        if (dVar.c(dp0.a.B1)) {
            Map<String, String> mapM = net.time4j.format.b.c("generic", locale).m();
            net.time4j.format.j jVar2 = (net.time4j.format.j) dVar.b(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC);
            char cCharValue = ((Character) dVar.b(net.time4j.format.a.f94182m, Character.valueOf(jVar2.getDigits().charAt(0)))).charValue();
            boolean zBooleanValue = ((Boolean) dVar.b(h.f94063b, Boolean.valueOf("R".equals(mapM.get("leap-alignment"))))).booleanValue();
            char cCharValue2 = ((Character) dVar.b(h.f94062a, Character.valueOf(mapM.get("leap-indicator").charAt(0)))).charValue();
            if (zBooleanValue || charSequence.charAt(index) != cCharValue2) {
                i11 = index;
                z13 = false;
            } else {
                i11 = index + 1;
                z13 = true;
            }
            if (jVar2.isDecimal()) {
                while (i11 < length && charSequence.charAt(i11) == cCharValue) {
                    i11++;
                }
            }
            int i13 = 12;
            int i14 = 0;
            for (int i15 = 1; i13 >= i15 && i14 == 0; i15 = 1) {
                String strA = dp0.b.a(jVar2, cCharValue, i13);
                h hVar2 = hVar;
                int length2 = strA.length();
                while (true) {
                    int i16 = i11 + i12;
                    if (length > i16) {
                        jVar = jVar2;
                        if (charSequence.charAt(i16) == strA.charAt(i12)) {
                            break;
                        }
                        break;
                    }
                    jVar = jVar2;
                    i12++;
                    if (i12 == length2) {
                        i11 += length2;
                        i14 = i13;
                        break;
                    }
                    jVar2 = jVar;
                }
                i13--;
                hVar = hVar2;
                jVar2 = jVar;
                i12 = 0;
            }
            h hVar3 = hVar;
            if (i14 == 0) {
                parsePosition.setErrorIndex(index);
                return hVar3;
            }
            if (zBooleanValue && length > i11 && charSequence.charAt(i11) == cCharValue2) {
                i11++;
                z12 = true;
            } else {
                z12 = z13;
            }
            hVarD = h.d(i14);
            parsePosition.setIndex(i11);
        } else {
            v vVar = (v) dVar.b(net.time4j.format.a.f94176g, v.WIDE);
            net.time4j.format.m mVar = (net.time4j.format.m) dVar.b(net.time4j.format.a.f94177h, net.time4j.format.m.FORMAT);
            c0 c0Var = (c0) net.time4j.format.b.c("chinese", locale).l(vVar, mVar).d(charSequence, parsePosition, c0.class, dVar);
            if (c0Var == null) {
                parsePosition.setErrorIndex(-1);
                parsePosition.setIndex(index);
                c0Var = (c0) net.time4j.format.b.c("chinese", locale).g(vVar, mVar).d(charSequence, parsePosition, c0.class, dVar);
                if (c0Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            if (c0Var == null) {
                parsePosition.setErrorIndex(index);
                return null;
            }
            hVarD = h.d(c0Var.getValue());
            z12 = z11;
        }
        return z12 ? hVarD.e() : hVarD;
    }

    @Override // net.time4j.engine.p
    public char getSymbol() {
        return 'M';
    }

    @Override // net.time4j.engine.p
    public Class<h> getType() {
        return h.class;
    }

    @Override // net.time4j.engine.p
    public boolean isDateElement() {
        return true;
    }

    @Override // net.time4j.engine.p
    public boolean isLenient() {
        return false;
    }

    @Override // net.time4j.engine.p
    public boolean isTimeElement() {
        return false;
    }

    @Override // net.time4j.engine.p
    public String name() {
        return "MONTH_OF_YEAR";
    }

    @Override // net.time4j.format.t
    public void print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException {
        Locale locale = (Locale) dVar.b(net.time4j.format.a.f94172c, Locale.ROOT);
        h hVar = (h) oVar.s(this);
        if (dVar.c(dp0.a.B1)) {
            appendable.append(hVar.b(locale, (net.time4j.format.j) dVar.b(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC), dVar));
            return;
        }
        v vVar = (v) dVar.b(net.time4j.format.a.f94176g, v.WIDE);
        net.time4j.format.m mVar = (net.time4j.format.m) dVar.b(net.time4j.format.a.f94177h, net.time4j.format.m.FORMAT);
        appendable.append((hVar.c() ? net.time4j.format.b.c("chinese", locale).g(vVar, mVar) : net.time4j.format.b.c("chinese", locale).l(vVar, mVar)).g(c0.valueOf(hVar.getNumber())));
    }

    protected Object readResolve() {
        return f94061a;
    }
}
