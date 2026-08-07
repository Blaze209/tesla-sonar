package net.time4j.format.expert;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
class r<V> implements h<V> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f94394o = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final net.time4j.engine.p<V> f94395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f94396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f94397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f94398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f94399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f94400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f94401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final net.time4j.format.g f94402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f94403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final char f94404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final net.time4j.format.j f94405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f94406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f94407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f94408n;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f94409a;

        static {
            int[] iArr = new int[x.values().length];
            f94409a = iArr;
            try {
                iArr[x.SHOW_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94409a[x.SHOW_WHEN_BIG_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    r(net.time4j.engine.p<V> pVar, boolean z11, int i11, int i12, x xVar, boolean z12) {
        this(pVar, z11, i11, i12, xVar, z12, 0, '0', net.time4j.format.j.ARABIC, net.time4j.format.g.SMART, 0, false);
    }

    private static void a(int i11, Appendable appendable, char c11) throws IOException {
        int i12 = (i11 * 103) >>> 10;
        appendable.append((char) (i12 + c11));
        appendable.append((char) ((i11 - ((i12 << 3) + (i12 << 1))) + c11));
    }

    private int b(net.time4j.format.j jVar) {
        if (!jVar.isDecimal()) {
            return 100;
        }
        Class<V> type = this.f94395a.getType();
        if (type == Integer.class) {
            return 10;
        }
        return type == Long.class ? 18 : 9;
    }

    private static int c(int i11) {
        int i12 = 0;
        while (i11 > f94394o[i12]) {
            i12++;
        }
        return i12 + 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f94395a.equals(rVar.f94395a) && this.f94396b == rVar.f94396b && this.f94397c == rVar.f94397c && this.f94398d == rVar.f94398d && this.f94399e == rVar.f94399e && this.f94400f == rVar.f94400f) {
                return true;
            }
        }
        return false;
    }

    @Override // net.time4j.format.expert.h
    public net.time4j.engine.p<V> getElement() {
        return this.f94395a;
    }

    public int hashCode() {
        return (this.f94395a.hashCode() * 7) + ((this.f94397c + (this.f94398d * 10)) * 31);
    }

    @Override // net.time4j.format.expert.h
    public boolean isNumerical() {
        return true;
    }

    @Override // net.time4j.format.expert.h
    public void parse(CharSequence charSequence, s sVar, net.time4j.engine.d dVar, t<?> tVar, boolean z11) {
        char cCharValue;
        int i11;
        boolean z12;
        net.time4j.format.j jVar;
        boolean z13;
        int i12;
        int iMin;
        boolean z14;
        boolean z15;
        int i13;
        int i14;
        long integer;
        int i15;
        int length = charSequence.length();
        int iF = sVar.f();
        if (z11 && this.f94408n) {
            if (iF >= length) {
                sVar.k(iF, "Missing digits for: " + this.f94395a.name());
                sVar.n();
                return;
            }
            char cCharAt = charSequence.charAt(iF);
            if (cCharAt == '-' || cCharAt == '+') {
                sVar.k(iF, "Sign not allowed due to sign policy.");
                return;
            }
            int i16 = this.f94397c + iF;
            int iMin2 = Math.min(length, i16);
            int i17 = iF;
            long j11 = 0;
            while (i17 < iMin2) {
                int iCharAt = charSequence.charAt(i17) - '0';
                if (iCharAt < 0 || iCharAt > 9) {
                    break;
                }
                j11 = (j11 * 10) + ((long) iCharAt);
                i17++;
            }
            if (j11 > 2147483647L) {
                sVar.k(iF, "Parsed number does not fit into an integer: " + j11);
                return;
            }
            if (i17 >= i16) {
                tVar.E(this.f94395a, (int) j11);
                sVar.l(i17);
                return;
            } else {
                if (i17 == iF) {
                    sVar.k(iF, "Digit expected.");
                    return;
                }
                sVar.k(iF, "Not enough digits found for: " + this.f94395a.name());
                return;
            }
        }
        int iIntValue = z11 ? this.f94406l : ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue();
        if (iIntValue > 0) {
            length -= iIntValue;
        }
        if (iF >= length) {
            sVar.k(iF, "Missing digits for: " + this.f94395a.name());
            sVar.n();
            return;
        }
        if (this.f94401g) {
            net.time4j.engine.p<V> pVar = this.f94395a;
            if (pVar instanceof dp0.a) {
                Integer numE = ((dp0.a) dp0.a.class.cast(pVar)).e(charSequence, sVar.e(), dVar, tVar);
                if (!sVar.i()) {
                    if (numE == null) {
                        sVar.k(iF, "No interpretable value.");
                        return;
                    } else {
                        tVar.F(this.f94395a, numE);
                        return;
                    }
                }
                sVar.k(sVar.c(), "Unparseable element: " + this.f94395a.name());
                return;
            }
        }
        if (z11) {
            net.time4j.format.j jVar2 = this.f94405k;
            boolean zIsDecimal = jVar2.isDecimal();
            int i18 = this.f94407m;
            cCharValue = this.f94404j;
            i11 = i18;
            z12 = zIsDecimal;
            jVar = jVar2;
        } else {
            net.time4j.format.j jVar3 = (net.time4j.format.j) dVar.b(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC);
            boolean zIsDecimal2 = jVar3.isDecimal();
            int iB = b(jVar3);
            net.time4j.engine.c<Character> cVar = net.time4j.format.a.f94182m;
            cCharValue = dVar.c(cVar) ? ((Character) dVar.a(cVar)).charValue() : zIsDecimal2 ? jVar3.getDigits().charAt(0) : '0';
            i11 = iB;
            z12 = zIsDecimal2;
            jVar = jVar3;
        }
        net.time4j.format.g gVar = z11 ? this.f94402h : (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART);
        if (!z12 || (!this.f94396b && gVar.isLax())) {
            z13 = true;
            i12 = 1;
            iMin = i11;
        } else {
            int i19 = this.f94397c;
            z13 = true;
            iMin = this.f94398d;
            i12 = i19;
        }
        char cCharAt2 = charSequence.charAt(iF);
        boolean z16 = z12;
        if (cCharAt2 != '-' && cCharAt2 != '+') {
            if (this.f94399e == x.SHOW_ALWAYS && gVar.isStrict()) {
                sVar.k(iF, "Missing sign of number.");
                return;
            }
            z14 = false;
        } else if (this.f94399e == x.SHOW_NEVER && (this.f94396b || gVar.isStrict())) {
            sVar.k(iF, "Sign not allowed due to sign policy.");
            return;
        } else if (this.f94399e == x.SHOW_WHEN_NEGATIVE && cCharAt2 == '+' && gVar.isStrict()) {
            sVar.k(iF, "Positive sign not allowed due to sign policy.");
            return;
        } else {
            z14 = cCharAt2 == '-' ? z13 : false;
            iF++;
        }
        int i21 = iF;
        if (iF >= length) {
            sVar.k(i21, "Missing digits for: " + this.f94395a.name());
            return;
        }
        if (this.f94396b || this.f94403i <= 0 || iIntValue > 0) {
            z15 = z14;
            i13 = iF;
        } else {
            if (z16) {
                int i22 = iF;
                i15 = 0;
                while (true) {
                    if (i22 >= length) {
                        z15 = z14;
                        i13 = iF;
                        break;
                    }
                    z15 = z14;
                    int iCharAt2 = charSequence.charAt(i22) - cCharValue;
                    i13 = iF;
                    if (iCharAt2 < 0 || iCharAt2 > 9) {
                        break;
                    }
                    i15++;
                    i22++;
                    iF = i13;
                    z14 = z15;
                }
            } else {
                z15 = z14;
                i13 = iF;
                i15 = 0;
                for (int i23 = i13; i23 < length && jVar.contains(charSequence.charAt(i23)); i23++) {
                    i15++;
                }
            }
            iMin = Math.min(iMin, i15 - this.f94403i);
        }
        int i24 = i13 + i12;
        int iMin3 = Math.min(length, i13 + iMin);
        if (z16) {
            integer = 0;
            i14 = i13;
            while (i14 < iMin3) {
                int iCharAt3 = charSequence.charAt(i14) - cCharValue;
                if (iCharAt3 < 0 || iCharAt3 > 9) {
                    break;
                }
                integer = (integer * 10) + ((long) iCharAt3);
                i14++;
            }
        } else {
            i14 = i13;
            int i25 = 0;
            while (i14 < iMin3 && jVar.contains(charSequence.charAt(i14))) {
                i25++;
                i14++;
            }
            if (i25 > 0) {
                try {
                    integer = jVar.toInteger(charSequence.subSequence(i14 - i25, i14).toString(), gVar);
                } catch (NumberFormatException e11) {
                    sVar.k(i21, e11.getMessage());
                    return;
                }
            } else {
                integer = 0;
            }
        }
        Class<V> type = this.f94395a.getType();
        if (integer > 2147483647L && type == Integer.class) {
            sVar.k(i21, "Parsed number does not fit into an integer: " + integer);
            return;
        }
        if (i14 < i24) {
            if (i14 == i21) {
                sVar.k(i21, "Digit expected.");
                return;
            } else if (this.f94396b || !gVar.isLax()) {
                sVar.k(i21, "Not enough digits found for: " + this.f94395a.name());
                return;
            }
        }
        if (z15) {
            if (integer == 0 && gVar.isStrict()) {
                sVar.k(i21 - 1, "Negative zero is not allowed.");
                return;
            }
            integer = -integer;
        } else if (this.f94399e == x.SHOW_WHEN_BIG_NUMBER && gVar.isStrict() && z16) {
            if (cCharAt2 == '+' && i14 <= i24) {
                sVar.k(i21 - 1, "Positive sign only allowed for big number.");
            } else if (cCharAt2 != '+' && i14 > i24) {
                sVar.k(i21, "Positive sign must be present for big number.");
            }
        }
        if (type == Integer.class) {
            tVar.E(this.f94395a, (int) integer);
        } else if (type == Long.class) {
            tVar.F(this.f94395a, Long.valueOf(integer));
        } else if (this.f94395a == net.time4j.g0.f94492s) {
            tVar.E(net.time4j.g0.f94493t, (int) integer);
        } else {
            if (!Enum.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException("Not parseable: " + this.f94395a);
            }
            net.time4j.engine.p<V> pVar2 = this.f94395a;
            if (!(pVar2 instanceof net.time4j.format.l ? ((net.time4j.format.l) pVar2).k(tVar, (int) integer) : false)) {
                if (cCharAt2 == '-' || cCharAt2 == '+') {
                    i21--;
                }
                sVar.k(i21, "[" + this.f94395a.name() + "] No enum found for value: " + integer);
                return;
            }
        }
        sVar.l(i14);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:107:0x0232  */
    /* JADX WARN: Code duplicated, block: B:109:0x0237  */
    /* JADX WARN: Code duplicated, block: B:111:0x023d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0244  */
    /* JADX WARN: Code duplicated, block: B:115:0x024a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0259  */
    /* JADX WARN: Code duplicated, block: B:125:0x0269  */
    /* JADX WARN: Code duplicated, block: B:127:0x026f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0276 A[LOOP:2: B:128:0x0274->B:129:0x0276, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0283  */
    /* JADX WARN: Code duplicated, block: B:135:0x0286  */
    /* JADX WARN: Code duplicated, block: B:136:0x028a  */
    /* JADX WARN: Code duplicated, block: B:138:0x028d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0293  */
    /* JADX WARN: Code duplicated, block: B:141:0x0297  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:150:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:157:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:159:0x0304  */
    /* JADX WARN: Code duplicated, block: B:56:0x0129  */
    /* JADX WARN: Code duplicated, block: B:58:0x0142  */
    /* JADX WARN: Code duplicated, block: B:60:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x014f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0151  */
    /* JADX WARN: Code duplicated, block: B:65:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x0178  */
    /* JADX WARN: Code duplicated, block: B:73:0x017f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Code duplicated, block: B:77:0x0196  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01be  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3 A[LOOP:1: B:95:0x01e0->B:97:0x01e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x01f5  */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x02eb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:159:0x0304, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.format.expert.h
    public int print(net.time4j.engine.o oVar, Appendable appendable, net.time4j.engine.d dVar, Set<g> set, boolean z11) throws IOException {
        net.time4j.format.j jVar;
        char cCharValue;
        char cCharAt;
        Class<V> type;
        boolean zIsDecimal;
        String numeral;
        net.time4j.engine.p<V> pVar;
        boolean z12;
        int iD;
        int iAbs;
        boolean z13;
        int iC;
        long jLongValue;
        String string;
        String str;
        int i11;
        int i12;
        int length;
        int i13;
        int i14;
        int i15;
        int i16;
        char[] charArray;
        int i17;
        int iP;
        int length2 = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        if (z11) {
            jVar = this.f94405k;
            cCharValue = this.f94404j;
        } else {
            jVar = (net.time4j.format.j) dVar.b(net.time4j.format.a.f94181l, net.time4j.format.j.ARABIC);
            net.time4j.engine.c<Character> cVar = net.time4j.format.a.f94182m;
            cCharValue = dVar.c(cVar) ? ((Character) dVar.a(cVar)).charValue() : jVar.isDecimal() ? jVar.getDigits().charAt(0) : '0';
        }
        if (z11 && this.f94408n) {
            int iP2 = oVar.p(this.f94395a);
            if (iP2 < 0) {
                if (iP2 == Integer.MIN_VALUE) {
                    return -1;
                }
                throw new IllegalArgumentException("Negative value not allowed according to sign policy.");
            }
            int iC2 = c(iP2);
            if (iC2 > this.f94398d) {
                throw new IllegalArgumentException("Element " + this.f94395a.name() + " cannot be printed as the formatted value " + iP2 + " exceeds the maximum width of " + this.f94398d + ".");
            }
            int i18 = this.f94397c - iC2;
            int i19 = 0;
            for (int i21 = 0; i21 < i18; i21++) {
                appendable.append('0');
                i19++;
            }
            if (iC2 == 2) {
                a(iP2, appendable, '0');
            } else if (iC2 == 1) {
                appendable.append((char) (iP2 + 48));
            } else if (iP2 >= 2000 && iP2 < 2100) {
                appendable.append('2');
                appendable.append('0');
                a(iP2 - 2000, appendable, '0');
            } else if (iP2 < 1900 || iP2 >= 2000) {
                appendable.append(Integer.toString(iP2));
            } else {
                appendable.append('1');
                appendable.append('9');
                a(iP2 - 1900, appendable, '0');
            }
            length = i19 + iC2;
        } else if (this.f94401g) {
            net.time4j.engine.p<V> pVar2 = this.f94395a;
            if (pVar2 instanceof dp0.a) {
                dp0.a aVar = (dp0.a) dp0.a.class.cast(pVar2);
                StringBuilder sb2 = new StringBuilder();
                aVar.i(oVar, sb2, dVar, jVar, cCharValue, this.f94397c, this.f94398d);
                appendable.append(sb2.toString());
                length = sb2.length();
            } else {
                cCharAt = jVar.getDigits().charAt(0);
                type = this.f94395a.getType();
                zIsDecimal = jVar.isDecimal();
                numeral = null;
                if (type == Integer.class) {
                    iP = oVar.p(this.f94395a);
                    if (iP == Integer.MIN_VALUE) {
                        return -1;
                    }
                    if (iP < 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    iAbs = Math.abs(iP);
                    iC = c(iAbs);
                } else if (type == Long.class) {
                    jLongValue = ((Long) Long.class.cast(oVar.s(this.f94395a))).longValue();
                    if (jLongValue < 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (jLongValue == Long.MIN_VALUE) {
                        string = "9223372036854775808";
                    } else {
                        string = Long.toString(Math.abs(jLongValue));
                    }
                    numeral = string;
                    iC = numeral.length();
                    cCharAt = '0';
                    iAbs = Integer.MIN_VALUE;
                } else {
                    if (Enum.class.isAssignableFrom(type)) {
                        throw new IllegalArgumentException("Not formattable: " + this.f94395a);
                    }
                    pVar = this.f94395a;
                    if (pVar instanceof net.time4j.format.l) {
                        iD = ((net.time4j.format.l) this.f94395a).d(oVar.s(pVar), oVar, dVar);
                        if (iD < 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                        iD = Integer.MIN_VALUE;
                    }
                    if (iD != Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("Cannot print: " + this.f94395a);
                    }
                    iAbs = Math.abs(iD);
                    z13 = z12;
                    iC = c(iAbs);
                }
                if (zIsDecimal) {
                    if (cCharValue != cCharAt) {
                        i16 = cCharValue - cCharAt;
                        if (numeral == null) {
                            numeral = jVar.toNumeral(iAbs);
                        }
                        charArray = numeral.toCharArray();
                        for (i17 = 0; i17 < charArray.length; i17++) {
                            charArray[i17] = (char) (charArray[i17] + i16);
                        }
                        numeral = new String(charArray);
                    }
                    if (iC > this.f94398d) {
                        if (numeral == null) {
                            numeral = jVar.toNumeral(iAbs);
                        }
                        throw new IllegalArgumentException("Element " + this.f94395a.name() + " cannot be printed as the formatted value " + numeral + " exceeds the maximum width of " + this.f94398d + ".");
                    }
                } else {
                    z13 = z13;
                }
                str = numeral;
                if (z13) {
                    i11 = a.f94409a[this.f94399e.ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2 && zIsDecimal && iC > this.f94397c) {
                            appendable.append('+');
                        } else {
                            i12 = 0;
                        }
                        if (zIsDecimal) {
                            i13 = this.f94397c - iC;
                            i14 = i12;
                            for (i15 = 0; i15 < i13; i15++) {
                                appendable.append(cCharValue);
                                i14++;
                            }
                            i12 = i14;
                        }
                        if (str == null) {
                            appendable.append(str);
                            iC = str.length();
                        } else if (zIsDecimal) {
                            iC = jVar.toNumeral(iAbs, appendable);
                        } else if (iC == 2) {
                            a(iAbs, appendable, cCharValue);
                        } else if (iC == 1) {
                            appendable.append((char) (iAbs + cCharValue));
                        } else if (iAbs < 2000 && iAbs < 2100) {
                            appendable.append((char) (cCharValue + 2));
                            appendable.append(cCharValue);
                            a(iAbs - 2000, appendable, cCharValue);
                        } else if (iAbs >= 1900 || iAbs >= 2000) {
                            appendable.append(jVar.toNumeral(iAbs));
                        } else {
                            appendable.append((char) (cCharValue + 1));
                            appendable.append((char) (cCharValue + '\t'));
                            a(iAbs - 1900, appendable, cCharValue);
                        }
                        length = i12 + iC;
                    } else {
                        appendable.append('+');
                    }
                } else {
                    if (this.f94399e != x.SHOW_NEVER) {
                        throw new IllegalArgumentException("Negative value not allowed according to sign policy.");
                    }
                    appendable.append(CoreConstants.DASH_CHAR);
                }
                i12 = 1;
                if (zIsDecimal) {
                    i13 = this.f94397c - iC;
                    i14 = i12;
                    while (i15 < i13) {
                        appendable.append(cCharValue);
                        i14++;
                    }
                    i12 = i14;
                }
                if (str == null) {
                    appendable.append(str);
                    iC = str.length();
                } else if (zIsDecimal) {
                    iC = jVar.toNumeral(iAbs, appendable);
                } else if (iC == 2) {
                    a(iAbs, appendable, cCharValue);
                } else if (iC == 1) {
                    appendable.append((char) (iAbs + cCharValue));
                } else if (iAbs < 2000) {
                    if (iAbs >= 1900) {
                        appendable.append(jVar.toNumeral(iAbs));
                    } else {
                        appendable.append(jVar.toNumeral(iAbs));
                    }
                } else if (iAbs >= 1900) {
                    appendable.append(jVar.toNumeral(iAbs));
                } else {
                    appendable.append(jVar.toNumeral(iAbs));
                }
                length = i12 + iC;
            }
        } else {
            cCharAt = jVar.getDigits().charAt(0);
            type = this.f94395a.getType();
            zIsDecimal = jVar.isDecimal();
            numeral = null;
            if (type == Integer.class) {
                iP = oVar.p(this.f94395a);
                if (iP == Integer.MIN_VALUE) {
                    return -1;
                }
                if (iP < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                iAbs = Math.abs(iP);
                iC = c(iAbs);
            } else if (type == Long.class) {
                jLongValue = ((Long) Long.class.cast(oVar.s(this.f94395a))).longValue();
                if (jLongValue < 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (jLongValue == Long.MIN_VALUE) {
                    string = "9223372036854775808";
                } else {
                    string = Long.toString(Math.abs(jLongValue));
                }
                numeral = string;
                iC = numeral.length();
                cCharAt = '0';
                iAbs = Integer.MIN_VALUE;
            } else {
                if (Enum.class.isAssignableFrom(type)) {
                    throw new IllegalArgumentException("Not formattable: " + this.f94395a);
                }
                pVar = this.f94395a;
                if (pVar instanceof net.time4j.format.l) {
                    iD = ((net.time4j.format.l) this.f94395a).d(oVar.s(pVar), oVar, dVar);
                    if (iD < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                    iD = Integer.MIN_VALUE;
                }
                if (iD != Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("Cannot print: " + this.f94395a);
                }
                iAbs = Math.abs(iD);
                z13 = z12;
                iC = c(iAbs);
            }
            if (zIsDecimal) {
                if (cCharValue != cCharAt) {
                    i16 = cCharValue - cCharAt;
                    if (numeral == null) {
                        numeral = jVar.toNumeral(iAbs);
                    }
                    charArray = numeral.toCharArray();
                    while (i17 < charArray.length) {
                        charArray[i17] = (char) (charArray[i17] + i16);
                    }
                    numeral = new String(charArray);
                }
                if (iC > this.f94398d) {
                    if (numeral == null) {
                        numeral = jVar.toNumeral(iAbs);
                    }
                    throw new IllegalArgumentException("Element " + this.f94395a.name() + " cannot be printed as the formatted value " + numeral + " exceeds the maximum width of " + this.f94398d + ".");
                }
            } else {
                z13 = z13;
            }
            str = numeral;
            if (z13) {
                i11 = a.f94409a[this.f94399e.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        appendable.append('+');
                    }
                    i12 = 0;
                    if (zIsDecimal) {
                        i13 = this.f94397c - iC;
                        i14 = i12;
                        while (i15 < i13) {
                            appendable.append(cCharValue);
                            i14++;
                        }
                        i12 = i14;
                    }
                    if (str == null) {
                        appendable.append(str);
                        iC = str.length();
                    } else if (zIsDecimal) {
                        iC = jVar.toNumeral(iAbs, appendable);
                    } else if (iC == 2) {
                        a(iAbs, appendable, cCharValue);
                    } else if (iC == 1) {
                        appendable.append((char) (iAbs + cCharValue));
                    } else if (iAbs < 2000) {
                        if (iAbs >= 1900) {
                            appendable.append(jVar.toNumeral(iAbs));
                        } else {
                            appendable.append(jVar.toNumeral(iAbs));
                        }
                    } else if (iAbs >= 1900) {
                        appendable.append(jVar.toNumeral(iAbs));
                    } else {
                        appendable.append(jVar.toNumeral(iAbs));
                    }
                    length = i12 + iC;
                } else {
                    appendable.append('+');
                }
            } else {
                if (this.f94399e != x.SHOW_NEVER) {
                    throw new IllegalArgumentException("Negative value not allowed according to sign policy.");
                }
                appendable.append(CoreConstants.DASH_CHAR);
            }
            i12 = 1;
            if (zIsDecimal) {
                i13 = this.f94397c - iC;
                i14 = i12;
                while (i15 < i13) {
                    appendable.append(cCharValue);
                    i14++;
                }
                i12 = i14;
            }
            if (str == null) {
                appendable.append(str);
                iC = str.length();
            } else if (zIsDecimal) {
                iC = jVar.toNumeral(iAbs, appendable);
            } else if (iC == 2) {
                a(iAbs, appendable, cCharValue);
            } else if (iC == 1) {
                appendable.append((char) (iAbs + cCharValue));
            } else if (iAbs < 2000) {
                if (iAbs >= 1900) {
                    appendable.append(jVar.toNumeral(iAbs));
                } else {
                    appendable.append(jVar.toNumeral(iAbs));
                }
            } else if (iAbs >= 1900) {
                appendable.append(jVar.toNumeral(iAbs));
            } else {
                appendable.append(jVar.toNumeral(iAbs));
            }
            length = i12 + iC;
        }
        if (length2 != -1 && length > 0 && set != null) {
            set.add(new g(this.f94395a, length2, length2 + length));
        }
        return length;
    }

    @Override // net.time4j.format.expert.h
    public h<V> quickPath(c<?> cVar, net.time4j.engine.d dVar, int i11) {
        char c11;
        char cCharAt;
        net.time4j.engine.c<net.time4j.format.j> cVar2 = net.time4j.format.a.f94181l;
        net.time4j.format.j jVar = net.time4j.format.j.ARABIC;
        net.time4j.format.j jVar2 = (net.time4j.format.j) dVar.b(cVar2, jVar);
        net.time4j.engine.c<Character> cVar3 = net.time4j.format.a.f94182m;
        boolean z11 = false;
        if (!dVar.c(cVar3)) {
            if (jVar2.isDecimal()) {
                cCharAt = jVar2.getDigits().charAt(0);
            } else {
                c11 = '0';
            }
            int iIntValue = ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue();
            if (jVar2 == jVar && c11 == '0' && this.f94396b && iIntValue == 0 && this.f94395a.getType() == Integer.class && !this.f94401g) {
                z11 = true;
            }
            return new r(this.f94395a, this.f94396b, this.f94397c, this.f94398d, this.f94399e, this.f94400f, i11, c11, jVar2, (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART), iIntValue, z11);
        }
        cCharAt = ((Character) dVar.a(cVar3)).charValue();
        c11 = cCharAt;
        int iIntValue2 = ((Integer) dVar.b(net.time4j.format.a.f94188s, 0)).intValue();
        if (jVar2 == jVar) {
            z11 = true;
        }
        return new r(this.f94395a, this.f94396b, this.f94397c, this.f94398d, this.f94399e, this.f94400f, i11, c11, jVar2, (net.time4j.format.g) dVar.b(net.time4j.format.a.f94175f, net.time4j.format.g.SMART), iIntValue2, z11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(getClass().getName());
        sb2.append("[element=");
        sb2.append(this.f94395a.name());
        sb2.append(", fixed-width-mode=");
        sb2.append(this.f94396b);
        sb2.append(", min-digits=");
        sb2.append(this.f94397c);
        sb2.append(", max-digits=");
        sb2.append(this.f94398d);
        sb2.append(", sign-policy=");
        sb2.append(this.f94399e);
        sb2.append(", protected-mode=");
        sb2.append(this.f94400f);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public h<V> withElement(net.time4j.engine.p<V> pVar) {
        return (this.f94400f || this.f94395a == pVar) ? this : new r(pVar, this.f94396b, this.f94397c, this.f94398d, this.f94399e, false);
    }

    private r(net.time4j.engine.p<V> pVar, boolean z11, int i11, int i12, x xVar, boolean z12, int i13, char c11, net.time4j.format.j jVar, net.time4j.format.g gVar, int i14, boolean z13) {
        this.f94395a = pVar;
        this.f94396b = z11;
        this.f94397c = i11;
        this.f94398d = i12;
        this.f94399e = xVar;
        this.f94400f = z12;
        this.f94408n = z13;
        if (pVar == null) {
            throw new NullPointerException("Missing element.");
        }
        if (xVar == null) {
            throw new NullPointerException("Missing sign policy.");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException("Not positive: " + i11);
        }
        if (i11 > i12) {
            throw new IllegalArgumentException("Max smaller than min: " + i12 + " < " + i11);
        }
        if (z11 && i11 != i12) {
            throw new IllegalArgumentException("Variable width in fixed-width-mode: " + i12 + " != " + i11);
        }
        if (z11 && xVar != x.SHOW_NEVER) {
            throw new IllegalArgumentException("Sign policy must be SHOW_NEVER in fixed-width-mode.");
        }
        int iB = b(jVar);
        if (jVar.isDecimal()) {
            if (i11 > iB) {
                throw new IllegalArgumentException("Min digits out of range: " + i11);
            }
            if (i12 > iB) {
                throw new IllegalArgumentException("Max digits out of range: " + i12);
            }
        }
        this.f94401g = pVar.name().equals("YEAR_OF_ERA");
        this.f94403i = i13;
        this.f94404j = c11;
        this.f94405k = jVar;
        this.f94402h = gVar;
        this.f94406l = i14;
        this.f94407m = iB;
    }
}
