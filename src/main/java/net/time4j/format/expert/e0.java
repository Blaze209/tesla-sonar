package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
final class e0 implements h<net.time4j.tz.k> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final e0 f94295f = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.format.e f94296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f94297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<String> f94298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f94299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final net.time4j.format.g f94300e;

    e0(net.time4j.format.e eVar, boolean z11, List<String> list) {
        if (eVar == null) {
            throw new NullPointerException("Missing display mode.");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing zero offsets.");
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).trim().isEmpty()) {
                throw new IllegalArgumentException("Zero offset must not be white-space-only.");
            }
        }
        this.f94296a = eVar;
        this.f94297b = z11;
        this.f94298c = Collections.unmodifiableList(arrayList);
        this.f94299d = true;
        this.f94300e = net.time4j.format.g.SMART;
    }

    private static net.time4j.tz.p a(net.time4j.engine.o oVar, net.time4j.engine.d dVar) {
        net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f94173d;
        if (dVar.c(cVar)) {
            net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(cVar);
            if (kVar instanceof net.time4j.tz.p) {
                return (net.time4j.tz.p) kVar;
            }
            if (kVar != null) {
                throw new IllegalArgumentException("Use a timezone offset instead of [" + kVar.a() + "] when formatting [" + oVar + "].");
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + oVar);
    }

    private static int b(CharSequence charSequence, int i11, net.time4j.format.g gVar) {
        int i12 = 0;
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = i11 + i13;
            char cCharAt = i14 >= charSequence.length() ? (char) 0 : charSequence.charAt(i14);
            if (cCharAt < '0' || cCharAt > '9') {
                if (i13 == 0 || gVar.isStrict()) {
                    return -1000;
                }
                return ~i12;
            }
            i12 = (i12 * 10) + (cCharAt - '0');
        }
        return i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f94296a == e0Var.f94296a && this.f94297b == e0Var.f94297b && this.f94298c.equals(e0Var.f94298c)) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<net.time4j.tz.k> getElement() {
        return b0.TIMEZONE_OFFSET;
    }

    public int hashCode() {
        return (this.f94296a.hashCode() * 7) + (this.f94298c.hashCode() * 31) + (this.f94297b ? 1 : 0);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0191  */
    /* JADX WARN: Code duplicated, block: B:115:0x019d  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:69:0x0104  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x014b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0151  */
    /* JADX WARN: Code duplicated, block: B:96:0x0157  */
    /* JADX WARN: Code duplicated, block: B:97:0x015a  */
    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        net.time4j.tz.f fVar;
        int iB;
        int i11;
        int i12;
        int i13;
        int iB2;
        int i14;
        int i15;
        int i16;
        int i17;
        net.time4j.tz.p pVarQ;
        net.time4j.format.e eVar;
        int iB3;
        int i18;
        int i19;
        int i21;
        int length = charSequence.length();
        int iF = sVar.f();
        if (iF >= length) {
            sVar.k(iF, "Missing timezone offset.");
            return;
        }
        for (String str : this.f94298c) {
            int length2 = str.length();
            if (length - iF >= length2) {
                int i22 = length2 + iF;
                String string = charSequence.subSequence(iF, i22).toString();
                boolean zBooleanValue = z11 ? this.f94299d : ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue();
                if ((zBooleanValue && string.equalsIgnoreCase(str)) || (!zBooleanValue && string.equals(str))) {
                    tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.f94822k);
                    sVar.l(i22);
                    return;
                }
            }
        }
        net.time4j.format.g gVar = z11 ? this.f94300e : (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
        char cCharAt = charSequence.charAt(iF);
        if (cCharAt != '+') {
            if (cCharAt == '-') {
                fVar = net.time4j.tz.f.BEHIND_UTC;
            } else {
                if (!Character.isDigit(cCharAt) || !gVar.isLax()) {
                    sVar.k(iF, "Missing sign of timezone offset.");
                    return;
                }
                fVar = net.time4j.tz.f.AHEAD_OF_UTC;
            }
            iB = b(charSequence, iF, gVar);
            if (iB == -1000) {
                sVar.k(iF, "Hour part in timezone offset does not match expected pattern HH.");
                return;
            }
            if (iB < 0) {
                iB = ~iB;
                i11 = iF + 1;
            } else {
                i11 = iF + 2;
            }
            if (i11 >= length) {
                if (this.f94296a == net.time4j.format.e.SHORT) {
                    sVar.k(i11, "Missing minute part in timezone offset.");
                    return;
                } else {
                    tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar, iB));
                    sVar.l(i11);
                    return;
                }
            }
            if (this.f94297b) {
                i12 = 0;
            } else {
                if (charSequence.charAt(i11) == ':') {
                    if (this.f94296a == net.time4j.format.e.SHORT) {
                        sVar.k(i11, "Colon expected in timezone offset.");
                        return;
                    } else {
                        tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar, iB));
                        sVar.l(i11);
                        return;
                    }
                }
                i12 = 1;
            }
            i13 = i12 + i11;
            net.time4j.format.g gVar2 = net.time4j.format.g.STRICT;
            iB2 = b(charSequence, i13, gVar2);
            if (iB2 == -1000) {
                if (this.f94296a == net.time4j.format.e.SHORT) {
                    sVar.k(i13, "Minute part in timezone offset does not match expected pattern mm.");
                    return;
                } else {
                    tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar, iB));
                    sVar.l(i11);
                    return;
                }
            }
            i14 = i13 + 2;
            if (i14 < length || !((eVar = this.f94296a) == net.time4j.format.e.LONG || eVar == net.time4j.format.e.FULL)) {
                i15 = 0;
                i16 = 0;
            } else {
                if (this.f94297b) {
                    if (charSequence.charAt(i14) == ':') {
                        iB3 = b(charSequence, i13 + 3, gVar2);
                        i18 = 1;
                    } else {
                        if (this.f94296a == net.time4j.format.e.FULL) {
                            sVar.k(i14, "Colon expected in timezone offset.");
                            return;
                        }
                        iB3 = -1000;
                    }
                    if (iB3 == -1000) {
                        if (this.f94296a == net.time4j.format.e.FULL) {
                            sVar.k(i14, "Second part in timezone offset does not match expected pattern ss.");
                            return;
                        }
                        i15 = 0;
                        i16 = 0;
                    } else {
                        i19 = i14 + i18;
                        i21 = i19 + 2;
                        if (i19 + 12 <= length || charSequence.charAt(i21) != '.') {
                            i14 = i21;
                            i16 = iB3;
                            i15 = 0;
                        } else {
                            int i23 = i19 + 3;
                            int i24 = i19 + 12;
                            int i25 = i23;
                            int i26 = 0;
                            while (i23 < i24) {
                                char cCharAt2 = charSequence.charAt(i23);
                                if (cCharAt2 < '0' || cCharAt2 > '9') {
                                    sVar.k(i25, "9 digits in fractional part of timezone offset expected.");
                                    return;
                                } else {
                                    i26 = (i26 * 10) + (cCharAt2 - '0');
                                    i25++;
                                    i23++;
                                }
                            }
                            i14 = i25;
                            i15 = i26;
                            i16 = iB3;
                        }
                    }
                } else {
                    iB3 = b(charSequence, i14, gVar2);
                }
                i18 = 0;
                if (iB3 == -1000) {
                    if (this.f94296a == net.time4j.format.e.FULL) {
                        sVar.k(i14, "Second part in timezone offset does not match expected pattern ss.");
                        return;
                    }
                    i15 = 0;
                    i16 = 0;
                } else {
                    i19 = i14 + i18;
                    i21 = i19 + 2;
                    if (i19 + 12 <= length) {
                        i14 = i21;
                        i16 = iB3;
                        i15 = 0;
                    } else {
                        i14 = i21;
                        i16 = iB3;
                        i15 = 0;
                    }
                }
            }
            if (i16 == 0 || i15 != 0) {
                i17 = (iB * 3600) + (iB2 * 60) + i16;
                if (fVar == net.time4j.tz.f.BEHIND_UTC) {
                    i17 = -i17;
                    i15 = -i15;
                }
                pVarQ = net.time4j.tz.p.q(i17, i15);
            } else {
                pVarQ = net.time4j.tz.p.o(fVar, iB, iB2);
            }
            tVar.F(b0.TIMEZONE_OFFSET, pVarQ);
            sVar.l(i14);
        }
        fVar = net.time4j.tz.f.AHEAD_OF_UTC;
        iF++;
        iB = b(charSequence, iF, gVar);
        if (iB == -1000) {
            sVar.k(iF, "Hour part in timezone offset does not match expected pattern HH.");
            return;
        }
        if (iB < 0) {
            iB = ~iB;
            i11 = iF + 1;
        } else {
            i11 = iF + 2;
        }
        if (i11 >= length) {
            if (this.f94296a == net.time4j.format.e.SHORT) {
                sVar.k(i11, "Missing minute part in timezone offset.");
                return;
            } else {
                tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar, iB));
                sVar.l(i11);
                return;
            }
        }
        if (this.f94297b) {
            i12 = 0;
        } else {
            if (charSequence.charAt(i11) == ':') {
                if (this.f94296a == net.time4j.format.e.SHORT) {
                    sVar.k(i11, "Colon expected in timezone offset.");
                    return;
                } else {
                    tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar, iB));
                    sVar.l(i11);
                    return;
                }
            }
            i12 = 1;
        }
        i13 = i12 + i11;
        net.time4j.format.g gVar3 = net.time4j.format.g.STRICT;
        iB2 = b(charSequence, i13, gVar3);
        if (iB2 == -1000) {
            if (this.f94296a == net.time4j.format.e.SHORT) {
                sVar.k(i13, "Minute part in timezone offset does not match expected pattern mm.");
                return;
            } else {
                tVar.F(b0.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar, iB));
                sVar.l(i11);
                return;
            }
        }
        i14 = i13 + 2;
        if (i14 < length) {
            i15 = 0;
            i16 = 0;
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (i16 == 0) {
            i17 = (iB * 3600) + (iB2 * 60) + i16;
            if (fVar == net.time4j.tz.f.BEHIND_UTC) {
                i17 = -i17;
                i15 = -i15;
            }
            pVarQ = net.time4j.tz.p.q(i17, i15);
        } else {
            i17 = (iB * 3600) + (iB2 * 60) + i16;
            if (fVar == net.time4j.tz.f.BEHIND_UTC) {
                i17 = -i17;
                i15 = -i15;
            }
            pVarQ = net.time4j.tz.p.q(i17, i15);
        }
        tVar.F(b0.TIMEZONE_OFFSET, pVarQ);
        sVar.l(i14);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f A[PHI: r1
      0x008f: PHI (r1v22 int) = (r1v12 int), (r1v12 int), (r1v12 int), (r1v9 int) binds: [B:41:0x00b2, B:43:0x00b6, B:47:0x00be, B:32:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        net.time4j.tz.p pVarB;
        int i11;
        int length;
        int length2 = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        net.time4j.tz.k kVarG = oVar.j() ? oVar.g() : null;
        if (kVarG == null) {
            pVarB = a(oVar, dVar);
        } else if (kVarG instanceof net.time4j.tz.p) {
            pVarB = (net.time4j.tz.p) kVarG;
        } else {
            if (!(oVar instanceof net.time4j.base.f)) {
                throw new IllegalArgumentException("Cannot extract timezone offset from: " + oVar);
            }
            pVarB = net.time4j.tz.l.N(kVarG).B((net.time4j.base.f) oVar);
        }
        int iJ = pVarB.j();
        int i12 = pVarB.i();
        if ((iJ | i12) == 0) {
            String str = this.f94298c.get(0);
            appendable.append(str);
            length = str.length();
        } else {
            appendable.append((iJ < 0 || i12 < 0) ? CoreConstants.DASH_CHAR : '+');
            int iAbs = Math.abs(iJ);
            int i13 = iAbs / 3600;
            int i14 = (iAbs / 60) % 60;
            int i15 = iAbs % 60;
            if (i13 < 10) {
                appendable.append('0');
                i11 = 2;
            } else {
                i11 = 1;
            }
            String strValueOf = String.valueOf(i13);
            appendable.append(strValueOf);
            int length3 = strValueOf.length() + i11;
            net.time4j.format.e eVar = this.f94296a;
            net.time4j.format.e eVar2 = net.time4j.format.e.SHORT;
            if (eVar == eVar2 && i14 == 0) {
                length = length3;
            } else {
                if (this.f94297b) {
                    appendable.append(CoreConstants.COLON_CHAR);
                    length3++;
                }
                if (i14 < 10) {
                    appendable.append('0');
                    length3++;
                }
                String strValueOf2 = String.valueOf(i14);
                appendable.append(strValueOf2);
                length3 += strValueOf2.length();
                net.time4j.format.e eVar3 = this.f94296a;
                if (eVar3 == eVar2 || eVar3 == net.time4j.format.e.MEDIUM || (eVar3 != net.time4j.format.e.FULL && (i15 | i12) == 0)) {
                    length = length3;
                } else {
                    if (this.f94297b) {
                        appendable.append(CoreConstants.COLON_CHAR);
                        length3++;
                    }
                    if (i15 < 10) {
                        appendable.append('0');
                        length3++;
                    }
                    String strValueOf3 = String.valueOf(i15);
                    appendable.append(strValueOf3);
                    int length4 = strValueOf3.length() + length3;
                    if (i12 != 0) {
                        appendable.append(CoreConstants.DOT);
                        int i16 = length4 + 1;
                        String strValueOf4 = String.valueOf(Math.abs(i12));
                        int length5 = 9 - strValueOf4.length();
                        for (int i17 = 0; i17 < length5; i17++) {
                            appendable.append('0');
                            i16++;
                        }
                        appendable.append(strValueOf4);
                        length = strValueOf4.length() + i16;
                    } else {
                        length = length4;
                    }
                }
            }
        }
        if (length2 != -1 && length > 0 && set != null) {
            set.add(new g(b0.TIMEZONE_ID, length2, length2 + length));
        }
        return length;
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        return new e0(this.f94296a, this.f94297b, this.f94298c, ((Boolean) dVar.b(net.time4j.format.a.f94178i, Boolean.TRUE)).booleanValue(), (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(e0.class.getName());
        sb2.append("[precision=");
        sb2.append(this.f94296a);
        sb2.append(", extended=");
        sb2.append(this.f94297b);
        sb2.append(", zero-offsets=");
        sb2.append(this.f94298c);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<net.time4j.tz.k> withElement(net.time4j.engine.p<net.time4j.tz.k> pVar) {
        return this;
    }

    private e0() {
        this.f94296a = net.time4j.format.e.LONG;
        this.f94297b = true;
        this.f94298c = Collections.EMPTY_LIST;
        this.f94299d = true;
        this.f94300e = net.time4j.format.g.SMART;
    }

    private e0(net.time4j.format.e eVar, boolean z11, List<String> list, boolean z12, net.time4j.format.g gVar) {
        this.f94296a = eVar;
        this.f94297b = z11;
        this.f94298c = list;
        this.f94299d = z12;
        this.f94300e = gVar;
    }
}
