package gg;

import ch.qos.logback.core.joran.action.ActionConst;
import com.adyen.checkout.components.core.Address;
import java.io.EOFException;
import okio.h;
import okio.j;
import okio.k;

/* JADX INFO: loaded from: classes3.dex */
final class e extends c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final k f68890n = k.f("'\\");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final k f68891o = k.f("\"\\");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final k f68892p = k.f("{}[]:, \n\t\r\f/\\;#=");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final k f68893q = k.f("\n\r");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final k f68894r = k.f("*/");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f68895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f68896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f68897j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f68898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f68899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f68900m;

    e(j jVar) {
        if (jVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f68895h = jVar;
        this.f68896i = jVar.getBufferField();
        p(6);
    }

    private void I() throws b {
        if (!this.f68886e) {
            throw H("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int J() throws b, EOFException {
        int[] iArr = this.f68883b;
        int i11 = this.f68882a;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int iC0 = c0(true);
            this.f68896i.readByte();
            if (iC0 != 44) {
                if (iC0 != 59) {
                    if (iC0 != 93) {
                        throw H("Unterminated array");
                    }
                    this.f68897j = 4;
                    return 4;
                }
                I();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11 - 1] = 4;
                if (i12 == 5) {
                    int iC1 = c0(true);
                    this.f68896i.readByte();
                    if (iC1 != 44) {
                        if (iC1 != 59) {
                            if (iC1 != 125) {
                                throw H("Unterminated object");
                            }
                            this.f68897j = 2;
                            return 2;
                        }
                        I();
                    }
                }
                int iC2 = c0(true);
                if (iC2 == 34) {
                    this.f68896i.readByte();
                    this.f68897j = 13;
                    return 13;
                }
                if (iC2 == 39) {
                    this.f68896i.readByte();
                    I();
                    this.f68897j = 12;
                    return 12;
                }
                if (iC2 != 125) {
                    I();
                    if (!b0((char) iC2)) {
                        throw H("Expected name");
                    }
                    this.f68897j = 14;
                    return 14;
                }
                if (i12 == 5) {
                    throw H("Expected name");
                }
                this.f68896i.readByte();
                this.f68897j = 2;
                return 2;
            }
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int iC3 = c0(true);
                this.f68896i.readByte();
                if (iC3 != 58) {
                    if (iC3 != 61) {
                        throw H("Expected ':'");
                    }
                    I();
                    if (this.f68895h.request(1L) && this.f68896i.H(0L) == 62) {
                        this.f68896i.readByte();
                    }
                }
            } else if (i12 == 6) {
                iArr[i11 - 1] = 7;
            } else if (i12 == 7) {
                if (c0(false) == -1) {
                    this.f68897j = 18;
                    return 18;
                }
                I();
            } else if (i12 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iC4 = c0(true);
        if (iC4 == 34) {
            this.f68896i.readByte();
            this.f68897j = 9;
            return 9;
        }
        if (iC4 == 39) {
            I();
            this.f68896i.readByte();
            this.f68897j = 8;
            return 8;
        }
        if (iC4 != 44 && iC4 != 59) {
            if (iC4 == 91) {
                this.f68896i.readByte();
                this.f68897j = 3;
                return 3;
            }
            if (iC4 != 93) {
                if (iC4 == 123) {
                    this.f68896i.readByte();
                    this.f68897j = 1;
                    return 1;
                }
                int iN0 = n0();
                if (iN0 != 0) {
                    return iN0;
                }
                int iR0 = r0();
                if (iR0 != 0) {
                    return iR0;
                }
                if (!b0(this.f68896i.H(0L))) {
                    throw H("Expected value");
                }
                I();
                this.f68897j = 10;
                return 10;
            }
            if (i12 == 1) {
                this.f68896i.readByte();
                this.f68897j = 4;
                return 4;
            }
        }
        if (i12 != 1 && i12 != 2) {
            throw H("Unexpected value");
        }
        I();
        this.f68897j = 7;
        return 7;
    }

    private int T(String str, c.a aVar) {
        int length = aVar.f68888a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(aVar.f68888a[i11])) {
                this.f68897j = 0;
                this.f68884c[this.f68882a - 1] = str;
                return i11;
            }
        }
        return -1;
    }

    private boolean b0(int i11) throws b {
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
        I();
        return false;
    }

    private int c0(boolean z11) throws b, EOFException {
        byte bH;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (!this.f68895h.request(i12)) {
                    if (z11) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                bH = this.f68896i.H(i11);
                if (bH == 10 || bH == 32 || bH == 13 || bH == 9) {
                    i11 = i12;
                }
            }
            this.f68896i.skip(i11);
            if (bH == 47) {
                if (this.f68895h.request(2L)) {
                    I();
                    byte bH2 = this.f68896i.H(1L);
                    if (bH2 == 42) {
                        this.f68896i.readByte();
                        this.f68896i.readByte();
                        if (!u0()) {
                            throw H("Unterminated comment");
                        }
                    } else if (bH2 == 47) {
                        this.f68896i.readByte();
                        this.f68896i.readByte();
                        w0();
                    }
                }
                return bH;
            }
            if (bH != 35) {
                return bH;
            }
            I();
            w0();
        }
    }

    private String e0(k kVar) throws b, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jD0 = this.f68895h.d0(kVar);
            if (jD0 == -1) {
                throw H("Unterminated string");
            }
            if (this.f68896i.H(jD0) != 92) {
                if (sb2 == null) {
                    String strM0 = this.f68896i.M0(jD0);
                    this.f68896i.readByte();
                    return strM0;
                }
                sb2.append(this.f68896i.M0(jD0));
                this.f68896i.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.f68896i.M0(jD0));
            this.f68896i.readByte();
            sb2.append(s0());
        }
    }

    private String k0() {
        long jD0 = this.f68895h.d0(f68892p);
        return jD0 != -1 ? this.f68896i.M0(jD0) : this.f68896i.t1();
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
    private int n0() throws EOFException {
        String str;
        String str2;
        int i11;
        byte bH = this.f68896i.H(0L);
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
            if (!this.f68895h.request(i13)) {
                return 0;
            }
            byte bH2 = this.f68896i.H(i12);
            if (bH2 != str.charAt(i12) && bH2 != str2.charAt(i12)) {
                return 0;
            }
            i12 = i13;
        }
        if (this.f68895h.request(length + 1) && b0(this.f68896i.H(length))) {
            return 0;
        }
        this.f68896i.skip(length);
        this.f68897j = i11;
        return i11;
    }

    private int r0() throws EOFException {
        long j11;
        int i11;
        boolean z11 = true;
        int i12 = 0;
        char c11 = 0;
        long j12 = 0;
        boolean z12 = false;
        while (true) {
            int i13 = i12 + 1;
            if (!this.f68895h.request(i13)) {
                j11 = 0;
                i11 = 0;
                break;
            }
            j11 = 0;
            byte bH = this.f68896i.H(i12);
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
                            if (!b0(bH)) {
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
            this.f68898k = j12;
            this.f68896i.skip(i12);
            this.f68897j = 16;
            return 16;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i11;
        }
        this.f68899l = i12;
        this.f68897j = 17;
        return 17;
    }

    private char s0() throws b, EOFException {
        int i11;
        if (!this.f68895h.request(1L)) {
            throw H("Unterminated escape sequence");
        }
        byte b11 = this.f68896i.readByte();
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
            if (this.f68886e) {
                return (char) b11;
            }
            throw H("Invalid escape sequence: \\" + ((char) b11));
        }
        if (!this.f68895h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            byte bH = this.f68896i.H(i12);
            char c12 = (char) (c11 << 4);
            if (bH >= 48 && bH <= 57) {
                i11 = bH - 48;
            } else if (bH >= 97 && bH <= 102) {
                i11 = bH - 87;
            } else {
                if (bH < 65 || bH > 70) {
                    throw H("\\u" + this.f68896i.M0(4L));
                }
                i11 = bH - 55;
            }
            c11 = (char) (c12 + i11);
        }
        this.f68896i.skip(4L);
        return c11;
    }

    private void t0(k kVar) throws b, EOFException {
        while (true) {
            long jD0 = this.f68895h.d0(kVar);
            if (jD0 == -1) {
                throw H("Unterminated string");
            }
            if (this.f68896i.H(jD0) != 92) {
                this.f68896i.skip(jD0 + 1);
                return;
            } else {
                this.f68896i.skip(jD0 + 1);
                s0();
            }
        }
    }

    private boolean u0() throws EOFException {
        j jVar = this.f68895h;
        k kVar = f68894r;
        long jZ = jVar.Z(kVar);
        boolean z11 = jZ != -1;
        h hVar = this.f68896i;
        hVar.skip(z11 ? jZ + ((long) kVar.D()) : hVar.getSize());
        return z11;
    }

    private void w0() throws EOFException {
        long jD0 = this.f68895h.d0(f68893q);
        h hVar = this.f68896i;
        hVar.skip(jD0 != -1 ? jD0 + 1 : hVar.getSize());
    }

    private void y0() throws EOFException {
        long jD0 = this.f68895h.d0(f68892p);
        h hVar = this.f68896i;
        if (jD0 == -1) {
            jD0 = hVar.getSize();
        }
        hVar.skip(jD0);
    }

    @Override // gg.c
    public void B() throws b, EOFException {
        if (this.f68887f) {
            throw new a("Cannot skip unexpected " + o() + " at " + getPath());
        }
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 14) {
            y0();
        } else if (iJ == 13) {
            t0(f68891o);
        } else if (iJ == 12) {
            t0(f68890n);
        } else if (iJ != 15) {
            throw new a("Expected a name but was " + o() + " at path " + getPath());
        }
        this.f68897j = 0;
        this.f68884c[this.f68882a - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    @Override // gg.c
    public void F() throws b, EOFException {
        if (this.f68887f) {
            throw new a("Cannot skip unexpected " + o() + " at " + getPath());
        }
        int i11 = 0;
        do {
            int iJ = this.f68897j;
            if (iJ == 0) {
                iJ = J();
            }
            if (iJ == 3) {
                p(1);
            } else {
                if (iJ == 1) {
                    p(3);
                } else if (iJ == 4) {
                    i11--;
                    if (i11 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + getPath());
                    }
                    this.f68882a--;
                } else if (iJ == 2) {
                    i11--;
                    if (i11 < 0) {
                        throw new a("Expected a value but was " + o() + " at path " + getPath());
                    }
                    this.f68882a--;
                } else if (iJ == 14 || iJ == 10) {
                    y0();
                } else if (iJ == 9 || iJ == 13) {
                    t0(f68891o);
                } else if (iJ == 8 || iJ == 12) {
                    t0(f68890n);
                } else if (iJ == 17) {
                    this.f68896i.skip(this.f68899l);
                } else if (iJ == 18) {
                    throw new a("Expected a value but was " + o() + " at path " + getPath());
                }
                this.f68897j = 0;
            }
            i11++;
            this.f68897j = 0;
        } while (i11 != 0);
        int[] iArr = this.f68885d;
        int i12 = this.f68882a;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f68884c[i12 - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    @Override // gg.c
    public String L() throws b, EOFException {
        String strE0;
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 14) {
            strE0 = k0();
        } else if (iJ == 13) {
            strE0 = e0(f68891o);
        } else if (iJ == 12) {
            strE0 = e0(f68890n);
        } else {
            if (iJ != 15) {
                throw new a("Expected a name but was " + o() + " at path " + getPath());
            }
            strE0 = this.f68900m;
        }
        this.f68897j = 0;
        this.f68884c[this.f68882a - 1] = strE0;
        return strE0;
    }

    @Override // gg.c
    public String O() throws b, EOFException {
        String strM0;
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 10) {
            strM0 = k0();
        } else if (iJ == 9) {
            strM0 = e0(f68891o);
        } else if (iJ == 8) {
            strM0 = e0(f68890n);
        } else if (iJ == 11) {
            strM0 = this.f68900m;
            this.f68900m = null;
        } else if (iJ == 16) {
            strM0 = Long.toString(this.f68898k);
        } else {
            if (iJ != 17) {
                throw new a("Expected a string but was " + o() + " at path " + getPath());
            }
            strM0 = this.f68896i.M0(this.f68899l);
        }
        this.f68897j = 0;
        int[] iArr = this.f68885d;
        int i11 = this.f68882a - 1;
        iArr[i11] = iArr[i11] + 1;
        return strM0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f68897j = 0;
        this.f68883b[0] = 8;
        this.f68882a = 1;
        this.f68896i.c();
        this.f68895h.close();
    }

    @Override // gg.c
    public void e() throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ != 4) {
            throw new a("Expected END_ARRAY but was " + o() + " at path " + getPath());
        }
        int i11 = this.f68882a;
        this.f68882a = i11 - 1;
        int[] iArr = this.f68885d;
        int i12 = i11 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f68897j = 0;
    }

    @Override // gg.c
    public void f() throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 3) {
            p(1);
            this.f68885d[this.f68882a - 1] = 0;
            this.f68897j = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + o() + " at path " + getPath());
        }
    }

    @Override // gg.c
    public void h() throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 1) {
            p(3);
            this.f68897j = 0;
            return;
        }
        throw new a("Expected BEGIN_OBJECT but was " + o() + " at path " + getPath());
    }

    @Override // gg.c
    public boolean hasNext() throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        return (iJ == 2 || iJ == 4 || iJ == 18) ? false : true;
    }

    @Override // gg.c
    public void j() throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ != 2) {
            throw new a("Expected END_OBJECT but was " + o() + " at path " + getPath());
        }
        int i11 = this.f68882a;
        int i12 = i11 - 1;
        this.f68882a = i12;
        this.f68884c[i12] = null;
        int[] iArr = this.f68885d;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        this.f68897j = 0;
    }

    @Override // gg.c
    public boolean nextBoolean() throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 5) {
            this.f68897j = 0;
            int[] iArr = this.f68885d;
            int i11 = this.f68882a - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (iJ == 6) {
            this.f68897j = 0;
            int[] iArr2 = this.f68885d;
            int i12 = this.f68882a - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + o() + " at path " + getPath());
    }

    @Override // gg.c
    public double nextDouble() throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 16) {
            this.f68897j = 0;
            int[] iArr = this.f68885d;
            int i11 = this.f68882a - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f68898k;
        }
        if (iJ == 17) {
            this.f68900m = this.f68896i.M0(this.f68899l);
        } else if (iJ == 9) {
            this.f68900m = e0(f68891o);
        } else if (iJ == 8) {
            this.f68900m = e0(f68890n);
        } else if (iJ == 10) {
            this.f68900m = k0();
        } else if (iJ != 11) {
            throw new a("Expected a double but was " + o() + " at path " + getPath());
        }
        this.f68897j = 11;
        try {
            double d11 = Double.parseDouble(this.f68900m);
            if (this.f68886e || !(Double.isNaN(d11) || Double.isInfinite(d11))) {
                this.f68900m = null;
                this.f68897j = 0;
                int[] iArr2 = this.f68885d;
                int i12 = this.f68882a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return d11;
            }
            throw new b("JSON forbids NaN and infinities: " + d11 + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f68900m + " at path " + getPath());
        }
    }

    @Override // gg.c
    public int nextInt() throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ == 16) {
            long j11 = this.f68898k;
            int i11 = (int) j11;
            if (j11 == i11) {
                this.f68897j = 0;
                int[] iArr = this.f68885d;
                int i12 = this.f68882a - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new a("Expected an int but was " + this.f68898k + " at path " + getPath());
        }
        if (iJ == 17) {
            this.f68900m = this.f68896i.M0(this.f68899l);
        } else if (iJ == 9 || iJ == 8) {
            String strE0 = iJ == 9 ? e0(f68891o) : e0(f68890n);
            this.f68900m = strE0;
            try {
                int i13 = Integer.parseInt(strE0);
                this.f68897j = 0;
                int[] iArr2 = this.f68885d;
                int i14 = this.f68882a - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return i13;
            } catch (NumberFormatException unused) {
            }
        } else if (iJ != 11) {
            throw new a("Expected an int but was " + o() + " at path " + getPath());
        }
        this.f68897j = 11;
        try {
            double d11 = Double.parseDouble(this.f68900m);
            int i15 = (int) d11;
            if (i15 == d11) {
                this.f68900m = null;
                this.f68897j = 0;
                int[] iArr3 = this.f68885d;
                int i16 = this.f68882a - 1;
                iArr3[i16] = iArr3[i16] + 1;
                return i15;
            }
            throw new a("Expected an int but was " + this.f68900m + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f68900m + " at path " + getPath());
        }
    }

    @Override // gg.c
    public c.b o() throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        switch (iJ) {
            case 1:
                return c.b.BEGIN_OBJECT;
            case 2:
                return c.b.END_OBJECT;
            case 3:
                return c.b.BEGIN_ARRAY;
            case 4:
                return c.b.END_ARRAY;
            case 5:
            case 6:
                return c.b.BOOLEAN;
            case 7:
                return c.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.b.NAME;
            case 16:
            case 17:
                return c.b.NUMBER;
            case 18:
                return c.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // gg.c
    public int t(c.a aVar) throws b, EOFException {
        int iJ = this.f68897j;
        if (iJ == 0) {
            iJ = J();
        }
        if (iJ < 12 || iJ > 15) {
            return -1;
        }
        if (iJ == 15) {
            return T(this.f68900m, aVar);
        }
        int iM3 = this.f68895h.M3(aVar.f68889b);
        if (iM3 != -1) {
            this.f68897j = 0;
            this.f68884c[this.f68882a - 1] = aVar.f68888a[iM3];
            return iM3;
        }
        String str = this.f68884c[this.f68882a - 1];
        String strL = L();
        int iT = T(strL, aVar);
        if (iT == -1) {
            this.f68897j = 15;
            this.f68900m = strL;
            this.f68884c[this.f68882a - 1] = str;
        }
        return iT;
    }

    public String toString() {
        return "JsonReader(" + this.f68895h + ")";
    }
}
