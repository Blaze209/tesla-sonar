package com.squareup.moshi;

import ch.qos.logback.core.joran.action.ActionConst;
import com.adyen.checkout.components.core.Address;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import okio.c0;

/* JADX INFO: loaded from: classes6.dex */
final class m extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final okio.k f49419n = okio.k.f("'\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final okio.k f49420o = okio.k.f("\"\\");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final okio.k f49421p = okio.k.f("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final okio.k f49422q = okio.k.f("\n\r");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final okio.k f49423r = okio.k.f("*/");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final okio.j f49424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final okio.h f49425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f49426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f49427j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f49428k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f49429l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private p f49430m;

    m(okio.j jVar) {
        this.f49426i = 0;
        if (jVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f49424g = jVar;
        this.f49425h = jVar.getBufferField();
        I(6);
    }

    private String D0() {
        long jD0 = this.f49424g.d0(f49421p);
        return jD0 != -1 ? this.f49425h.M0(jD0) : this.f49425h.t1();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int G0() throws EOFException {
        String str;
        String str2;
        int i11;
        byte bH = this.f49425h.H(0L);
        if (bH == 116 || bH == 84) {
            str = "true";
            str2 = "TRUE";
            i11 = 5;
        } else if (bH == 102 || bH == 70) {
            str = "false";
            str2 = "FALSE";
            i11 = 6;
        } else {
            if (bH != 110 && bH != 78) {
                return 0;
            }
            str = Address.ADDRESS_NULL_PLACEHOLDER;
            str2 = ActionConst.NULL;
            i11 = 7;
        }
        int length = str.length();
        int i12 = 1;
        while (i12 < length) {
            int i13 = i12 + 1;
            if (!this.f49424g.request(i13)) {
                return 0;
            }
            byte bH2 = this.f49425h.H(i12);
            if (bH2 != str.charAt(i12) && bH2 != str2.charAt(i12)) {
                return 0;
            }
            i12 = i13;
        }
        if (this.f49424g.request(length + 1) && w0(this.f49425h.H(length))) {
            return 0;
        }
        this.f49425h.skip(length);
        this.f49426i = i11;
        return i11;
    }

    private int H0() throws EOFException {
        long j11;
        int i11;
        boolean z11 = true;
        int i12 = 0;
        char c11 = 0;
        long j12 = 0;
        boolean z12 = false;
        while (true) {
            int i13 = i12 + 1;
            if (!this.f49424g.request(i13)) {
                j11 = 0;
                i11 = 0;
                break;
            }
            j11 = 0;
            byte bH = this.f49425h.H(i12);
            i11 = 0;
            if (bH != 43) {
                if (bH == 69 || bH == 101) {
                    if (c11 != 2 && c11 != 4) {
                        return 0;
                    }
                    c11 = 5;
                } else if (bH != 45) {
                    if (bH != 46) {
                        if (bH < 48 || bH > 57) {
                            if (!w0(bH)) {
                                break;
                            }
                            return 0;
                        }
                        if (c11 == 1 || c11 == 0) {
                            j12 = -(bH - 48);
                            c11 = 2;
                        } else if (c11 == 2) {
                            if (j12 == 0) {
                                return 0;
                            }
                            long j13 = (10 * j12) - ((long) (bH - 48));
                            z11 &= j12 > -922337203685477580L || (j12 == -922337203685477580L && j13 < j12);
                            j12 = j13;
                        } else if (c11 == 3) {
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            c11 = 7;
                        }
                    } else {
                        if (c11 != 2) {
                            return 0;
                        }
                        c11 = 3;
                    }
                } else if (c11 == 0) {
                    c11 = 1;
                    z12 = true;
                } else if (c11 != 5) {
                    return 0;
                }
                i12 = i13;
            } else if (c11 != 5) {
                return 0;
            }
            c11 = 6;
            i12 = i13;
        }
        if (c11 == 2 && z11 && ((j12 != Long.MIN_VALUE || z12) && (j12 != j11 || !z12))) {
            if (!z12) {
                j12 = -j12;
            }
            this.f49427j = j12;
            this.f49425h.skip(i12);
            this.f49426i = 16;
            return 16;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i11;
        }
        this.f49428k = i12;
        this.f49426i = 17;
        return 17;
    }

    private char J0() throws EOFException, JsonEncodingException {
        int i11;
        if (!this.f49424g.request(1L)) {
            throw k0("Unterminated escape sequence");
        }
        byte b11 = this.f49425h.readByte();
        if (b11 == 10 || b11 == 34 || b11 == 39 || b11 == 47 || b11 == 92) {
            return (char) b11;
        }
        if (b11 == 98) {
            return '\b';
        }
        if (b11 == 102) {
            return '\f';
        }
        if (b11 == 110) {
            return '\n';
        }
        if (b11 == 114) {
            return '\r';
        }
        if (b11 == 116) {
            return '\t';
        }
        if (b11 != 117) {
            if (this.f49414e) {
                return (char) b11;
            }
            throw k0("Invalid escape sequence: \\" + ((char) b11));
        }
        if (!this.f49424g.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte bH = this.f49425h.H(i12);
            char c12 = (char) (c11 << 4);
            if (bH >= 48 && bH <= 57) {
                i11 = bH - 48;
            } else if (bH >= 97 && bH <= 102) {
                i11 = bH - 87;
            } else {
                if (bH < 65 || bH > 70) {
                    throw k0("\\u" + this.f49425h.M0(4L));
                }
                i11 = bH - 55;
            }
            c11 = (char) (c12 + i11);
        }
        this.f49425h.skip(4L);
        return c11;
    }

    private void K0(okio.k kVar) throws EOFException, JsonEncodingException {
        while (true) {
            long jD0 = this.f49424g.d0(kVar);
            if (jD0 == -1) {
                throw k0("Unterminated string");
            }
            if (this.f49425h.H(jD0) != 92) {
                this.f49425h.skip(jD0 + 1);
                return;
            } else {
                this.f49425h.skip(jD0 + 1);
                J0();
            }
        }
    }

    private boolean O0() throws EOFException {
        okio.j jVar = this.f49424g;
        okio.k kVar = f49423r;
        long jZ = jVar.Z(kVar);
        boolean z11 = jZ != -1;
        okio.h hVar = this.f49425h;
        hVar.skip(z11 ? jZ + ((long) kVar.D()) : hVar.getSize());
        return z11;
    }

    private void P0() throws EOFException {
        long jD0 = this.f49424g.d0(f49422q);
        okio.h hVar = this.f49425h;
        hVar.skip(jD0 != -1 ? jD0 + 1 : hVar.getSize());
    }

    private void T0() throws EOFException {
        long jD0 = this.f49424g.d0(f49421p);
        okio.h hVar = this.f49425h;
        if (jD0 == -1) {
            jD0 = hVar.getSize();
        }
        hVar.skip(jD0);
    }

    private void r0() throws JsonEncodingException {
        if (!this.f49414e) {
            throw k0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int s0() throws EOFException, JsonEncodingException {
        int[] iArr = this.f49411b;
        int i11 = this.f49410a;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int iY0 = y0(true);
            this.f49425h.readByte();
            if (iY0 != 44) {
                if (iY0 != 59) {
                    if (iY0 != 93) {
                        throw k0("Unterminated array");
                    }
                    this.f49426i = 4;
                    return 4;
                }
                r0();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5) {
                    int iY1 = y0(true);
                    this.f49425h.readByte();
                    if (iY1 != 44) {
                        if (iY1 != 59) {
                            if (iY1 != 125) {
                                throw k0("Unterminated object");
                            }
                            this.f49426i = 2;
                            return 2;
                        }
                        r0();
                    }
                }
                int iY2 = y0(true);
                if (iY2 == 34) {
                    this.f49425h.readByte();
                    this.f49426i = 13;
                    return 13;
                }
                if (iY2 == 39) {
                    this.f49425h.readByte();
                    r0();
                    this.f49426i = 12;
                    return 12;
                }
                if (iY2 != 125) {
                    r0();
                    if (!w0((char) iY2)) {
                        throw k0("Expected name");
                    }
                    this.f49426i = 14;
                    return 14;
                }
                if (i12 == 5) {
                    throw k0("Expected name");
                }
                this.f49425h.readByte();
                this.f49426i = 2;
                return 2;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int iY3 = y0(true);
                this.f49425h.readByte();
                if (iY3 != 58) {
                    if (iY3 != 61) {
                        throw k0("Expected ':'");
                    }
                    r0();
                    if (this.f49424g.request(1L) && this.f49425h.H(0L) == 62) {
                        this.f49425h.readByte();
                    }
                }
            } else if (i12 == 6) {
                iArr[i11 - 1] = 7;
            } else if (i12 == 7) {
                if (y0(false) == -1) {
                    this.f49426i = 18;
                    return 18;
                }
                r0();
            } else {
                if (i12 == 9) {
                    this.f49430m.n();
                    this.f49430m = null;
                    this.f49410a--;
                    return s0();
                }
                if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iY4 = y0(true);
        if (iY4 == 34) {
            this.f49425h.readByte();
            this.f49426i = 9;
            return 9;
        }
        if (iY4 == 39) {
            r0();
            this.f49425h.readByte();
            this.f49426i = 8;
            return 8;
        }
        if (iY4 != 44 && iY4 != 59) {
            if (iY4 == 91) {
                this.f49425h.readByte();
                this.f49426i = 3;
                return 3;
            }
            if (iY4 != 93) {
                if (iY4 == 123) {
                    this.f49425h.readByte();
                    this.f49426i = 1;
                    return 1;
                }
                int iG0 = G0();
                if (iG0 != 0) {
                    return iG0;
                }
                int iH0 = H0();
                if (iH0 != 0) {
                    return iH0;
                }
                if (!w0(this.f49425h.H(0L))) {
                    throw k0("Expected value");
                }
                r0();
                this.f49426i = 10;
                return 10;
            }
            if (i12 == 1) {
                this.f49425h.readByte();
                this.f49426i = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw k0("Unexpected value");
        }
        r0();
        this.f49426i = 7;
        return 7;
    }

    private int t0(String str, k.b bVar) {
        int length = bVar.f49417a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(bVar.f49417a[i11])) {
                this.f49426i = 0;
                this.f49412c[this.f49410a - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    private int u0(String str, k.b bVar) {
        int length = bVar.f49417a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(bVar.f49417a[i11])) {
                this.f49426i = 0;
                int[] iArr = this.f49413d;
                int i12 = this.f49410a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
        }
        return -1;
    }

    private boolean w0(int i11) throws JsonEncodingException {
        if (i11 == 9 || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 32) {
            return false;
        }
        if (i11 != 35) {
            if (i11 == 44) {
                return false;
            }
            if (i11 != 47 && i11 != 61) {
                if (i11 == 123 || i11 == 125 || i11 == 58) {
                    return false;
                }
                if (i11 != 59) {
                    switch (i11) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        r0();
        return false;
    }

    private int y0(boolean z11) throws EOFException, JsonEncodingException {
        byte bH;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (!this.f49424g.request(i12)) {
                    if (z11) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bH = this.f49425h.H(i11);
                if (bH == 10 || bH == 32 || bH == 13 || bH == 9) {
                    i11 = i12;
                }
            }
            this.f49425h.skip(i11);
            if (bH == 47) {
                if (this.f49424g.request(2L)) {
                    r0();
                    byte bH2 = this.f49425h.H(1L);
                    if (bH2 == 42) {
                        this.f49425h.readByte();
                        this.f49425h.readByte();
                        if (!O0()) {
                            throw k0("Unterminated comment");
                        }
                    } else if (bH2 == 47) {
                        this.f49425h.readByte();
                        this.f49425h.readByte();
                        P0();
                    }
                }
                return bH;
            }
            if (bH != 35) {
                return bH;
            }
            r0();
            P0();
        }
    }

    private String z0(okio.k kVar) throws EOFException, JsonEncodingException {
        StringBuilder sb2 = null;
        while (true) {
            long jD0 = this.f49424g.d0(kVar);
            if (jD0 == -1) {
                throw k0("Unterminated string");
            }
            if (this.f49425h.H(jD0) != 92) {
                if (sb2 == null) {
                    String strM0 = this.f49425h.M0(jD0);
                    this.f49425h.readByte();
                    return strM0;
                }
                sb2.append(this.f49425h.M0(jD0));
                this.f49425h.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f49425h.M0(jD0));
            this.f49425h.readByte();
            sb2.append(J0());
        }
    }

    @Override // com.squareup.moshi.k
    public k.c B() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        switch (iS0) {
            case 1:
                return k.c.BEGIN_OBJECT;
            case 2:
                return k.c.END_OBJECT;
            case 3:
                return k.c.BEGIN_ARRAY;
            case 4:
                return k.c.END_ARRAY;
            case 5:
            case 6:
                return k.c.BOOLEAN;
            case 7:
                return k.c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return k.c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return k.c.NAME;
            case 16:
            case 17:
                return k.c.NUMBER;
            case 18:
                return k.c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.squareup.moshi.k
    public k C() {
        return new m(this);
    }

    @Override // com.squareup.moshi.k
    public void F() throws EOFException, JsonEncodingException {
        if (this.f49415f) {
            throw new JsonDataException("Cannot skip unexpected " + B() + " at " + getPath());
        }
        int i11 = 0;
        do {
            int iS0 = this.f49426i;
            if (iS0 == 0) {
                iS0 = s0();
            }
            if (iS0 == 3) {
                I(1);
            } else {
                if (iS0 == 1) {
                    I(3);
                } else if (iS0 == 4) {
                    i11--;
                    if (i11 < 0) {
                        throw new JsonDataException("Expected a value but was " + B() + " at path " + getPath());
                    }
                    this.f49410a--;
                } else if (iS0 == 2) {
                    i11--;
                    if (i11 < 0) {
                        throw new JsonDataException("Expected a value but was " + B() + " at path " + getPath());
                    }
                    this.f49410a--;
                } else if (iS0 == 14 || iS0 == 10) {
                    T0();
                } else if (iS0 == 9 || iS0 == 13) {
                    K0(f49420o);
                } else if (iS0 == 8 || iS0 == 12) {
                    K0(f49419n);
                } else if (iS0 == 17) {
                    this.f49425h.skip(this.f49428k);
                } else if (iS0 == 18) {
                    throw new JsonDataException("Expected a value but was " + B() + " at path " + getPath());
                }
                this.f49426i = 0;
            }
            i11++;
            this.f49426i = 0;
        } while (i11 != 0);
        int[] iArr = this.f49413d;
        int i12 = this.f49410a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f49412c[i12 - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    @Override // com.squareup.moshi.k
    public void H() {
        if (hasNext()) {
            this.f49429l = L();
            this.f49426i = 11;
        }
    }

    @Override // com.squareup.moshi.k
    public String L() throws EOFException, JsonEncodingException {
        String strZ0;
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 14) {
            strZ0 = D0();
        } else if (iS0 == 13) {
            strZ0 = z0(f49420o);
        } else if (iS0 == 12) {
            strZ0 = z0(f49419n);
        } else {
            if (iS0 != 15) {
                throw new JsonDataException("Expected a name but was " + B() + " at path " + getPath());
            }
            strZ0 = this.f49429l;
            this.f49429l = null;
        }
        this.f49426i = 0;
        this.f49412c[this.f49410a - 1] = strZ0;
        return strZ0;
    }

    @Override // com.squareup.moshi.k
    public String O() throws EOFException, JsonEncodingException {
        String strM0;
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 10) {
            strM0 = D0();
        } else if (iS0 == 9) {
            strM0 = z0(f49420o);
        } else if (iS0 == 8) {
            strM0 = z0(f49419n);
        } else if (iS0 == 11) {
            strM0 = this.f49429l;
            this.f49429l = null;
        } else if (iS0 == 16) {
            strM0 = Long.toString(this.f49427j);
        } else {
            if (iS0 != 17) {
                throw new JsonDataException("Expected a string but was " + B() + " at path " + getPath());
            }
            strM0 = this.f49425h.M0(this.f49428k);
        }
        this.f49426i = 0;
        int[] iArr = this.f49413d;
        int i11 = this.f49410a - 1;
        iArr[i11] = iArr[i11] + 1;
        return strM0;
    }

    @Override // com.squareup.moshi.k
    public int T(k.b bVar) throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 < 12 || iS0 > 15) {
            return -1;
        }
        if (iS0 == 15) {
            return t0(this.f49429l, bVar);
        }
        int iM3 = this.f49424g.M3(bVar.f49418b);
        if (iM3 != -1) {
            this.f49426i = 0;
            this.f49412c[this.f49410a - 1] = bVar.f49417a[iM3];
            return iM3;
        }
        String str = this.f49412c[this.f49410a - 1];
        String strL = L();
        int iT0 = t0(strL, bVar);
        if (iT0 == -1) {
            this.f49426i = 15;
            this.f49429l = strL;
            this.f49412c[this.f49410a - 1] = str;
        }
        return iT0;
    }

    @Override // com.squareup.moshi.k
    public int b0(k.b bVar) throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 < 8 || iS0 > 11) {
            return -1;
        }
        if (iS0 == 11) {
            return u0(this.f49429l, bVar);
        }
        int iM3 = this.f49424g.M3(bVar.f49418b);
        if (iM3 != -1) {
            this.f49426i = 0;
            int[] iArr = this.f49413d;
            int i11 = this.f49410a - 1;
            iArr[i11] = iArr[i11] + 1;
            return iM3;
        }
        String strO = O();
        int iU0 = u0(strO, bVar);
        if (iU0 == -1) {
            this.f49426i = 11;
            this.f49429l = strO;
            int[] iArr2 = this.f49413d;
            int i12 = this.f49410a - 1;
            iArr2[i12] = iArr2[i12] - 1;
        }
        return iU0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f49426i = 0;
        this.f49411b[0] = 8;
        this.f49410a = 1;
        this.f49425h.c();
        this.f49424g.close();
    }

    @Override // com.squareup.moshi.k
    public void e() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + B() + " at path " + getPath());
        }
        int i11 = this.f49410a;
        this.f49410a = i11 - 1;
        int[] iArr = this.f49413d;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f49426i = 0;
    }

    @Override // com.squareup.moshi.k
    public void e0() throws EOFException, JsonEncodingException {
        if (this.f49415f) {
            k.c cVarB = B();
            L();
            throw new JsonDataException("Cannot skip unexpected " + cVarB + " at " + getPath());
        }
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 14) {
            T0();
        } else if (iS0 == 13) {
            K0(f49420o);
        } else if (iS0 == 12) {
            K0(f49419n);
        } else if (iS0 != 15) {
            throw new JsonDataException("Expected a name but was " + B() + " at path " + getPath());
        }
        this.f49426i = 0;
        this.f49412c[this.f49410a - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    @Override // com.squareup.moshi.k
    public void f() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 3) {
            I(1);
            this.f49413d[this.f49410a - 1] = 0;
            this.f49426i = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + B() + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public void h() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 1) {
            I(3);
            this.f49426i = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + B() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.k
    public boolean hasNext() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        return (iS0 == 2 || iS0 == 4 || iS0 == 18) ? false : true;
    }

    @Override // com.squareup.moshi.k
    public void j() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + B() + " at path " + getPath());
        }
        int i11 = this.f49410a;
        int i12 = i11 - 1;
        this.f49410a = i12;
        this.f49412c[i12] = null;
        int[] iArr = this.f49413d;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f49426i = 0;
    }

    @Override // com.squareup.moshi.k
    public boolean nextBoolean() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 5) {
            this.f49426i = 0;
            int[] iArr = this.f49413d;
            int i11 = this.f49410a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iS0 == 6) {
            this.f49426i = 0;
            int[] iArr2 = this.f49413d;
            int i12 = this.f49410a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + B() + " at path " + getPath());
    }

    @Override // com.squareup.moshi.k
    public double nextDouble() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 16) {
            this.f49426i = 0;
            int[] iArr = this.f49413d;
            int i11 = this.f49410a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f49427j;
        }
        if (iS0 == 17) {
            this.f49429l = this.f49425h.M0(this.f49428k);
        } else if (iS0 == 9) {
            this.f49429l = z0(f49420o);
        } else if (iS0 == 8) {
            this.f49429l = z0(f49419n);
        } else if (iS0 == 10) {
            this.f49429l = D0();
        } else if (iS0 != 11) {
            throw new JsonDataException("Expected a double but was " + B() + " at path " + getPath());
        }
        this.f49426i = 11;
        try {
            double d11 = Double.parseDouble(this.f49429l);
            if (this.f49414e || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
                this.f49429l = null;
                this.f49426i = 0;
                int[] iArr2 = this.f49413d;
                int i12 = this.f49410a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return d11;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + d11 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f49429l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public int nextInt() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 16) {
            long j11 = this.f49427j;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.f49426i = 0;
                int[] iArr = this.f49413d;
                int i12 = this.f49410a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new JsonDataException("Expected an int but was " + this.f49427j + " at path " + getPath());
        }
        if (iS0 == 17) {
            this.f49429l = this.f49425h.M0(this.f49428k);
        } else if (iS0 == 9 || iS0 == 8) {
            String strZ0 = iS0 == 9 ? z0(f49420o) : z0(f49419n);
            this.f49429l = strZ0;
            try {
                int i13 = Integer.parseInt(strZ0);
                this.f49426i = 0;
                int[] iArr2 = this.f49413d;
                int i14 = this.f49410a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        } else if (iS0 != 11) {
            throw new JsonDataException("Expected an int but was " + B() + " at path " + getPath());
        }
        this.f49426i = 11;
        try {
            double d11 = Double.parseDouble(this.f49429l);
            int i15 = (int) d11;
            if (i15 == d11) {
                this.f49429l = null;
                this.f49426i = 0;
                int[] iArr3 = this.f49413d;
                int i16 = this.f49410a - 1;
                iArr3[i16] = iArr3[i16] + 1;
                return i15;
            }
            throw new JsonDataException("Expected an int but was " + this.f49429l + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f49429l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public long nextLong() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 16) {
            this.f49426i = 0;
            int[] iArr = this.f49413d;
            int i11 = this.f49410a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f49427j;
        }
        if (iS0 == 17) {
            this.f49429l = this.f49425h.M0(this.f49428k);
        } else if (iS0 == 9 || iS0 == 8) {
            String strZ0 = iS0 == 9 ? z0(f49420o) : z0(f49419n);
            this.f49429l = strZ0;
            try {
                long j11 = Long.parseLong(strZ0);
                this.f49426i = 0;
                int[] iArr2 = this.f49413d;
                int i12 = this.f49410a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        } else if (iS0 != 11) {
            throw new JsonDataException("Expected a long but was " + B() + " at path " + getPath());
        }
        this.f49426i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f49429l).longValueExact();
            this.f49429l = null;
            this.f49426i = 0;
            int[] iArr3 = this.f49413d;
            int i13 = this.f49410a - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f49429l + " at path " + getPath());
        }
    }

    @Override // com.squareup.moshi.k
    public <T> T o() throws EOFException, JsonEncodingException {
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        if (iS0 == 7) {
            this.f49426i = 0;
            int[] iArr = this.f49413d;
            int i11 = this.f49410a - 1;
            iArr[i11] = iArr[i11] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + B() + " at path " + getPath());
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    @Override // com.squareup.moshi.k
    public okio.j p() throws IOException {
        int i11;
        int iS0 = this.f49426i;
        if (iS0 == 0) {
            iS0 = s0();
        }
        okio.h hVar = new okio.h();
        okio.k kVar = p.f49446m;
        if (iS0 != 3) {
            if (iS0 == 1) {
                hVar.l2("{");
                kVar = p.f49441h;
            } else {
                if (iS0 == 9) {
                    hVar.l2("\"");
                    kVar = p.f49443j;
                } else if (iS0 == 8) {
                    hVar.l2("'");
                    kVar = p.f49442i;
                } else if (iS0 == 17 || iS0 == 16 || iS0 == 10) {
                    hVar.l2(O());
                } else if (iS0 == 5) {
                    hVar.l2("true");
                } else if (iS0 == 6) {
                    hVar.l2("false");
                } else if (iS0 == 7) {
                    hVar.l2(Address.ADDRESS_NULL_PLACEHOLDER);
                } else {
                    if (iS0 != 11) {
                        throw new JsonDataException("Expected a value but was " + B() + " at path " + getPath());
                    }
                    String strO = O();
                    r rVarE0 = r.e0(hVar);
                    try {
                        rVarE0.G0(strO);
                        rVarE0.close();
                    } catch (Throwable th2) {
                        if (rVarE0 != null) {
                            try {
                                rVarE0.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                i11 = 0;
            }
            if (this.f49426i != 0) {
                int[] iArr = this.f49413d;
                int i12 = this.f49410a - 1;
                iArr[i12] = iArr[i12] + 1;
                this.f49426i = 0;
            }
            this.f49430m = new p(this.f49424g, hVar, kVar, i11);
            I(9);
            return c0.d(this.f49430m);
        }
        hVar.l2("[");
        kVar = p.f49441h;
        i11 = 1;
        if (this.f49426i != 0) {
            int[] iArr2 = this.f49413d;
            int i13 = this.f49410a - 1;
            iArr2[i13] = iArr2[i13] + 1;
            this.f49426i = 0;
        }
        this.f49430m = new p(this.f49424g, hVar, kVar, i11);
        I(9);
        return c0.d(this.f49430m);
    }

    public String toString() {
        return "JsonReader(" + this.f49424g + ")";
    }

    m(m mVar) {
        super(mVar);
        this.f49426i = 0;
        okio.j jVarPeek = mVar.f49424g.peek();
        this.f49424g = jVarPeek;
        this.f49425h = jVarPeek.getBufferField();
        this.f49426i = mVar.f49426i;
        this.f49427j = mVar.f49427j;
        this.f49428k = mVar.f49428k;
        this.f49429l = mVar.f49429l;
        try {
            jVarPeek.D2(mVar.f49425h.getSize());
        } catch (IOException unused) {
            throw new AssertionError();
        }
    }
}
