package xz;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public final byte[] f124128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f124129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f124130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f124131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f124132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h[] f124133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f124134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f124135h;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0063 A[PHI: r8
      0x0063: PHI (r8v3 int) = (r8v0 int), (r8v1 int), (r8v4 int) binds: [B:12:0x0052, B:22:0x006f, B:18:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    e(byte[] bArr, int i11, boolean z11) {
        this.f124130c = bArr;
        this.f124128a = bArr;
        if (z11) {
            int i12 = i11 + 6;
            if (C(i12) > 61) {
                throw new IllegalArgumentException("Unsupported class file major version " + ((int) C(i12)));
            }
        }
        int I = I(i11 + 8);
        this.f124131d = new int[I];
        this.f124132e = new String[I];
        int i13 = i11 + 10;
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i15 = 1;
        while (i15 < I) {
            int i16 = i15 + 1;
            int i17 = i13 + 1;
            this.f124131d[i15] = i17;
            int I2 = 3;
            switch (bArr[i13]) {
                case 1:
                    I2 = 3 + I(i17);
                    if (I2 > i14) {
                        i15 = i16;
                        i14 = I2;
                    } else {
                        i15 = i16;
                    }
                    i13 += I2;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i15 = i16;
                    I2 = 5;
                    i13 += I2;
                    break;
                case 5:
                case 6:
                    i15 += 2;
                    I2 = 9;
                    i13 += I2;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i15 = i16;
                    i13 += I2;
                    break;
                case 15:
                    I2 = 4;
                    i15 = i16;
                    i13 += I2;
                    break;
                case 17:
                    z12 = true;
                    z13 = true;
                    i15 = i16;
                    I2 = 5;
                    i13 += I2;
                    break;
                case 18:
                    z13 = true;
                    i15 = i16;
                    I2 = 5;
                    i13 += I2;
                    break;
            }
        }
        this.f124135h = i14;
        this.f124129b = i13;
        this.f124133f = z12 ? new h[I] : null;
        this.f124134g = z13 ? k(i14) : null;
    }

    private void A(s sVar, j jVar, int i11, boolean z11) {
        int iR = i11 + 1;
        int i12 = this.f124130c[i11] & 255;
        sVar.a(i12, z11);
        char[] cArr = jVar.f124168c;
        for (int i13 = 0; i13 < i12; i13++) {
            int I = I(iR);
            iR += 2;
            while (true) {
                int i14 = I - 1;
                if (I > 0) {
                    iR = r(sVar.y(i13, H(iR, cArr), z11), iR + 2, true, cArr);
                    I = i14;
                }
            }
        }
    }

    private int B(f fVar, j jVar, int i11) {
        int i12;
        c cVar;
        char[] cArr = jVar.f124168c;
        String strH = H(i11, cArr);
        String strH2 = H(i11 + 2, cArr);
        int I = I(i11 + 4);
        int i13 = i11 + 6;
        int i14 = 0;
        c cVar2 = null;
        int i15 = 0;
        String strH3 = null;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = I - 1;
            if (I <= 0) {
                break;
            }
            String strH4 = H(i13, cArr);
            int iT = t(i13 + 2);
            int i19 = i13 + 6;
            if ("Signature".equals(strH4)) {
                strH3 = H(i19, cArr);
                i19 = i14;
            } else {
                if ("RuntimeVisibleAnnotations".equals(strH4)) {
                    i16 = i19;
                    cVar = cVar2;
                    i12 = iT;
                    i19 = i14;
                    i19 = i16;
                } else if (!"RuntimeVisibleTypeAnnotations".equals(strH4)) {
                    if ("RuntimeInvisibleAnnotations".equals(strH4)) {
                        i17 = i19;
                        cVar = cVar2;
                        i12 = iT;
                        i19 = i14;
                        i19 = i17;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(strH4)) {
                        i15 = i19;
                        cVar = cVar2;
                        i12 = iT;
                        i19 = i14;
                        i19 = i15;
                    } else {
                        int i21 = i14;
                        i19 = i19;
                        c cVar3 = cVar2;
                        i12 = iT;
                        c cVarJ = j(jVar.f124166a, strH4, i19, i12, cArr, -1, null);
                        cVarJ.f124121c = cVar3;
                        cVar = cVarJ;
                        i19 = i21;
                        i15 = i15;
                    }
                }
                int i22 = i19 + i12;
                i14 = i19;
                i13 = i22;
                cVar2 = cVar;
                I = i18;
            }
            cVar = cVar2;
            i12 = iT;
            int i23 = i19 + i12;
            i14 = i19;
            i13 = i23;
            cVar2 = cVar;
            I = i18;
        }
        int i24 = i14;
        c cVar4 = cVar2;
        int i25 = i15;
        x xVarM = fVar.m(strH, strH2, strH3);
        if (xVarM == null) {
            return i13;
        }
        if (i16 != 0) {
            int I2 = I(i16);
            int iR = i16 + 2;
            while (true) {
                int i26 = I2 - 1;
                if (I2 <= 0) {
                    break;
                }
                iR = r(xVarM.a(H(iR, cArr), true), iR + 2, true, cArr);
                I2 = i26;
            }
        }
        if (i17 != 0) {
            int I3 = I(i17);
            int iR2 = i17 + 2;
            while (true) {
                int i27 = I3 - 1;
                if (I3 <= 0) {
                    break;
                }
                iR2 = r(xVarM.a(H(iR2, cArr), false), iR2 + 2, true, cArr);
                I3 = i27;
            }
        }
        if (i24 != 0) {
            int I4 = I(i24);
            int iR3 = i24 + 2;
            while (true) {
                int i28 = I4 - 1;
                if (I4 <= 0) {
                    break;
                }
                int iF = F(jVar, iR3);
                iR3 = r(xVarM.d(jVar.f124173h, jVar.f124174i, H(iF, cArr), true), iF + 2, true, cArr);
                I4 = i28;
            }
        }
        if (i25 != 0) {
            int I5 = I(i25);
            int iR4 = i25 + 2;
            while (true) {
                int i29 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                int iF2 = F(jVar, iR4);
                iR4 = r(xVarM.d(jVar.f124173h, jVar.f124174i, H(iF2, cArr), false), iF2 + 2, true, cArr);
                I5 = i29;
            }
        }
        c cVar5 = cVar4;
        while (cVar5 != null) {
            c cVar6 = cVar5.f124121c;
            cVar5.f124121c = null;
            xVarM.b(cVar5);
            cVar5 = cVar6;
        }
        xVarM.c();
        return i13;
    }

    private int D(int i11, boolean z11, boolean z12, j jVar) {
        int iL;
        int i12;
        char[] cArr = jVar.f124168c;
        r[] rVarArr = jVar.f124172g;
        if (z11) {
            iL = i11 + 1;
            i12 = this.f124130c[i11] & 255;
        } else {
            jVar.f124178m = -1;
            iL = i11;
            i12 = 255;
        }
        jVar.f124181p = 0;
        if (i12 < 64) {
            jVar.f124179n = 3;
            jVar.f124183r = 0;
        } else if (i12 < 128) {
            i12 -= 64;
            iL = L(iL, jVar.f124184s, 0, cArr, rVarArr);
            jVar.f124179n = 4;
            jVar.f124183r = 1;
        } else {
            if (i12 < 247) {
                throw new IllegalArgumentException();
            }
            int I = I(iL);
            int i13 = iL;
            iL = i13 + 2;
            if (i12 == 247) {
                iL = L(iL, jVar.f124184s, 0, cArr, rVarArr);
                jVar.f124179n = 4;
                jVar.f124183r = 1;
            } else if (i12 >= 248 && i12 < 251) {
                jVar.f124179n = 2;
                int i14 = 251 - i12;
                jVar.f124181p = i14;
                jVar.f124180o -= i14;
                jVar.f124183r = 0;
            } else if (i12 == 251) {
                jVar.f124179n = 3;
                jVar.f124183r = 0;
            } else if (i12 < 255) {
                int i15 = i12 - 251;
                int i16 = z12 ? jVar.f124180o : 0;
                int i17 = i15;
                while (i17 > 0) {
                    iL = L(iL, jVar.f124182q, i16, cArr, rVarArr);
                    i17--;
                    i16++;
                }
                jVar.f124179n = 1;
                jVar.f124181p = i15;
                jVar.f124180o += i15;
                jVar.f124183r = 0;
            } else {
                int I2 = I(iL);
                int iL2 = i13 + 4;
                jVar.f124179n = 0;
                jVar.f124181p = I2;
                jVar.f124180o = I2;
                for (int i18 = 0; i18 < I2; i18++) {
                    iL2 = L(iL2, jVar.f124182q, i18, cArr, rVarArr);
                }
                int I3 = I(iL2);
                iL = iL2 + 2;
                jVar.f124183r = I3;
                for (int i19 = 0; i19 < I3; i19++) {
                    iL = L(iL, jVar.f124184s, i19, cArr, rVarArr);
                }
            }
            i12 = I;
        }
        int i21 = jVar.f124178m + i12 + 1;
        jVar.f124178m = i21;
        d(i21, rVarArr);
        return iL;
    }

    private String E(int i11, char[] cArr) {
        return H(this.f124131d[I(i11)], cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    private int F(j jVar, int i11) {
        int i12;
        int i13;
        int iT = t(i11);
        int i14 = iT >>> 24;
        if (i14 != 0 && i14 != 1) {
            switch (i14) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i12 = iT & (-256);
                    i13 = i11 + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i12 = iT & (-16777216);
                    i13 = i11 + 1;
                    break;
                case 22:
                    i12 = iT & (-65536);
                    i13 = i11 + 2;
                    break;
                default:
                    switch (i14) {
                        case 64:
                        case 65:
                            i12 = iT & (-16777216);
                            int I = I(i11 + 1);
                            i13 = i11 + 3;
                            jVar.f124175j = new r[I];
                            jVar.f124176k = new r[I];
                            jVar.f124177l = new int[I];
                            for (int i15 = 0; i15 < I; i15++) {
                                int I2 = I(i13);
                                int I3 = I(i13 + 2);
                                int I4 = I(i13 + 4);
                                i13 += 6;
                                jVar.f124175j[i15] = d(I2, jVar.f124172g);
                                jVar.f124176k[i15] = d(I2 + I3, jVar.f124172g);
                                jVar.f124177l[i15] = I4;
                            }
                            break;
                        case 66:
                            i12 = iT & (-256);
                            i13 = i11 + 3;
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i12 = iT & (-16777216);
                            i13 = i11 + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i12 = iT & (-16776961);
                            i13 = i11 + 4;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                    break;
            }
        } else {
            i12 = iT & (-65536);
            i13 = i11 + 2;
        }
        jVar.f124173h = i12;
        int iL = l(i13);
        jVar.f124174i = iL == 0 ? null : new c0(this.f124130c, i13);
        return i13 + 1 + (iL * 2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004d A[FALL_THROUGH] */
    private int[] G(s sVar, j jVar, int i11, boolean z11) {
        int i12;
        char[] cArr = jVar.f124168c;
        int I = I(i11);
        int[] iArr = new int[I];
        int iR = i11 + 2;
        for (int i13 = 0; i13 < I; i13++) {
            iArr[i13] = iR;
            int iT = t(iR);
            int i14 = iT >>> 24;
            if (i14 != 23) {
                switch (i14) {
                    default:
                        switch (i14) {
                            case 64:
                            case 65:
                                int I2 = I(iR + 1);
                                i12 = iR + 3;
                                while (true) {
                                    int i15 = I2 - 1;
                                    if (I2 > 0) {
                                        int I3 = I(i12);
                                        int I4 = I(i12 + 2);
                                        i12 += 6;
                                        d(I3, jVar.f124172g);
                                        d(I3 + I4, jVar.f124172g);
                                        I2 = i15;
                                    }
                                    break;
                                }
                                break;
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i12 = iR + 4;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    case 16:
                    case 17:
                    case 18:
                        i12 = iR + 3;
                        break;
                }
            } else {
                i12 = iR + 3;
            }
            int iL = l(i12);
            if (i14 == 66) {
                c0 c0Var = iL != 0 ? new c0(this.f124130c, i12) : null;
                int i16 = i12 + (iL * 2) + 1;
                iR = r(sVar.A(iT & (-256), c0Var, H(i16, cArr), z11), i16 + 2, true, cArr);
            } else {
                iR = r(null, i12 + (iL * 2) + 3, true, cArr);
            }
        }
        return iArr;
    }

    private String J(int i11, int i12, char[] cArr) {
        int i13;
        int i14 = i12 + i11;
        byte[] bArr = this.f124130c;
        int i15 = 0;
        while (i11 < i14) {
            int i16 = i11 + 1;
            byte b11 = bArr[i11];
            if ((b11 & 128) == 0) {
                cArr[i15] = (char) (b11 & 127);
                i15++;
                i11 = i16;
            } else {
                if ((b11 & 224) == 192) {
                    i13 = i15 + 1;
                    i11 += 2;
                    cArr[i15] = (char) (((b11 & 31) << 6) + (bArr[i16] & 63));
                } else {
                    i13 = i15 + 1;
                    int i17 = i11 + 2;
                    i11 += 3;
                    cArr[i15] = (char) (((b11 & 15) << 12) + ((bArr[i16] & 63) << 6) + (bArr[i17] & 63));
                }
                i15 = i13;
            }
        }
        return new String(cArr, 0, i15);
    }

    private int L(int i11, Object[] objArr, int i12, char[] cArr, r[] rVarArr) {
        int i13 = i11 + 1;
        switch (this.f124130c[i11] & 255) {
            case 0:
                objArr[i12] = w.f124283a;
                return i13;
            case 1:
                objArr[i12] = w.f124284b;
                return i13;
            case 2:
                objArr[i12] = w.f124285c;
                return i13;
            case 3:
                objArr[i12] = w.f124286d;
                return i13;
            case 4:
                objArr[i12] = w.f124287e;
                return i13;
            case 5:
                objArr[i12] = w.f124288f;
                return i13;
            case 6:
                objArr[i12] = w.f124289g;
                return i13;
            case 7:
                objArr[i12] = m(i13, cArr);
                break;
            case 8:
                objArr[i12] = d(I(i13), rVarArr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i11 + 3;
    }

    private void b(j jVar) {
        int i11;
        String str = jVar.f124171f;
        Object[] objArr = jVar.f124182q;
        int i12 = 0;
        if ((jVar.f124169d & 8) == 0) {
            if ("<init>".equals(jVar.f124170e)) {
                objArr[0] = w.f124289g;
            } else {
                objArr[0] = m(this.f124129b + 2, jVar.f124168c);
            }
            i12 = 1;
        }
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt = str.charAt(i13);
            if (cCharAt == 'F') {
                i11 = i12 + 1;
                objArr[i12] = w.f124285c;
            } else if (cCharAt != 'L') {
                if (cCharAt != 'S' && cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        i11 = i12 + 1;
                        objArr[i12] = w.f124287e;
                    } else if (cCharAt != 'Z') {
                        if (cCharAt != '[') {
                            switch (cCharAt) {
                                case 'B':
                                case 'C':
                                    break;
                                case 'D':
                                    i11 = i12 + 1;
                                    objArr[i12] = w.f124286d;
                                    break;
                                default:
                                    jVar.f124180o = i12;
                                    return;
                            }
                        } else {
                            while (str.charAt(i14) == '[') {
                                i14++;
                            }
                            if (str.charAt(i14) == 'L') {
                                do {
                                    i14++;
                                } while (str.charAt(i14) != ';');
                            }
                            int i15 = i14 + 1;
                            objArr[i12] = str.substring(i13, i15);
                            i13 = i15;
                            i12++;
                        }
                    }
                }
                i11 = i12 + 1;
                objArr[i12] = w.f124284b;
            } else {
                int i16 = i14;
                while (str.charAt(i16) != ';') {
                    i16++;
                }
                objArr[i12] = str.substring(i14, i16);
                i12++;
                i13 = i16 + 1;
            }
            i12 = i11;
            i13 = i14;
        }
    }

    private void c(int i11, r[] rVarArr) {
        if (rVarArr[i11] == null) {
            r rVarU = u(i11, rVarArr);
            rVarU.f124222a = (short) (rVarU.f124222a | 1);
        }
    }

    private r d(int i11, r[] rVarArr) {
        r rVarU = u(i11, rVarArr);
        rVarU.f124222a = (short) (rVarU.f124222a & (-2));
        return rVarU;
    }

    private int i(int[] iArr, int i11) {
        if (iArr == null || i11 >= iArr.length || l(iArr[i11]) < 67) {
            return -1;
        }
        return I(iArr[i11] + 1);
    }

    private c j(c[] cVarArr, String str, int i11, int i12, char[] cArr, int i13, r[] rVarArr) {
        for (c cVar : cVarArr) {
            if (cVar.f124119a.equals(str)) {
                return cVar.i(this, i11, i12, cArr, i13, rVarArr);
            }
        }
        return new c(str).i(this, i11, i12, null, -1, null);
    }

    private int[] k(int i11) {
        char[] cArr = new char[i11];
        int iE = e();
        for (int I = I(iE - 2); I > 0; I--) {
            String strH = H(iE, cArr);
            int iT = t(iE + 2);
            int i12 = iE + 6;
            if ("BootstrapMethods".equals(strH)) {
                int I2 = I(i12);
                int[] iArr = new int[I2];
                int I3 = iE + 8;
                for (int i13 = 0; i13 < I2; i13++) {
                    iArr[i13] = I3;
                    I3 += (I(I3 + 2) * 2) + 4;
                }
                return iArr;
            }
            iE = i12 + iT;
        }
        throw new IllegalArgumentException();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 31241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private void n(xz.s r40, xz.j r41, int r42) {
        /*
            Method dump skipped, instruction units count: 3124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xz.e.n(xz.s, xz.j, int):void");
    }

    private h p(int i11, char[] cArr) {
        h hVar = this.f124133f[i11];
        if (hVar != null) {
            return hVar;
        }
        int[] iArr = this.f124131d;
        int i12 = iArr[i11];
        int i13 = iArr[I(i12 + 2)];
        String strH = H(i13, cArr);
        String strH2 = H(i13 + 2, cArr);
        int i14 = this.f124134g[I(i12)];
        p pVar = (p) o(I(i14), cArr);
        int I = I(i14 + 2);
        Object[] objArr = new Object[I];
        int i15 = i14 + 4;
        for (int i16 = 0; i16 < I; i16++) {
            objArr[i16] = o(I(i15), cArr);
            i15 += 2;
        }
        h[] hVarArr = this.f124133f;
        h hVar2 = new h(strH, strH2, pVar, objArr);
        hVarArr[i11] = hVar2;
        return hVar2;
    }

    private int q(a aVar, int i11, String str, char[] cArr) {
        int i12 = 0;
        if (aVar == null) {
            int i13 = this.f124130c[i11] & 255;
            if (i13 == 64) {
                return r(null, i11 + 3, true, cArr);
            }
            if (i13 != 91) {
                return i13 != 101 ? i11 + 3 : i11 + 5;
            }
            return r(null, i11 + 1, false, cArr);
        }
        int i14 = i11 + 1;
        int i15 = this.f124130c[i11] & 255;
        if (i15 == 64) {
            return r(aVar.b(str, H(i14, cArr)), i11 + 3, true, cArr);
        }
        if (i15 != 70) {
            if (i15 == 83) {
                aVar.a(str, Short.valueOf((short) t(this.f124131d[I(i14)])));
                return i11 + 3;
            }
            if (i15 == 99) {
                aVar.a(str, b0.n(H(i14, cArr)));
                return i11 + 3;
            }
            if (i15 == 101) {
                aVar.e(str, H(i14, cArr), H(i11 + 3, cArr));
                return i11 + 5;
            }
            if (i15 == 115) {
                aVar.a(str, H(i14, cArr));
                return i11 + 3;
            }
            if (i15 != 73 && i15 != 74) {
                if (i15 == 90) {
                    aVar.a(str, t(this.f124131d[I(i14)]) == 0 ? Boolean.FALSE : Boolean.TRUE);
                    return i11 + 3;
                }
                if (i15 == 91) {
                    int I = I(i14);
                    int i16 = i11 + 3;
                    if (I == 0) {
                        return r(aVar.c(str), i11 + 1, false, cArr);
                    }
                    int i17 = this.f124130c[i16] & 255;
                    if (i17 == 70) {
                        float[] fArr = new float[I];
                        while (i12 < I) {
                            fArr[i12] = Float.intBitsToFloat(t(this.f124131d[I(i16 + 1)]));
                            i16 += 3;
                            i12++;
                        }
                        aVar.a(str, fArr);
                        return i16;
                    }
                    if (i17 == 83) {
                        short[] sArr = new short[I];
                        while (i12 < I) {
                            sArr[i12] = (short) t(this.f124131d[I(i16 + 1)]);
                            i16 += 3;
                            i12++;
                        }
                        aVar.a(str, sArr);
                        return i16;
                    }
                    if (i17 == 90) {
                        boolean[] zArr = new boolean[I];
                        for (int i18 = 0; i18 < I; i18++) {
                            zArr[i18] = t(this.f124131d[I(i16 + 1)]) != 0;
                            i16 += 3;
                        }
                        aVar.a(str, zArr);
                        return i16;
                    }
                    if (i17 == 73) {
                        int[] iArr = new int[I];
                        while (i12 < I) {
                            iArr[i12] = t(this.f124131d[I(i16 + 1)]);
                            i16 += 3;
                            i12++;
                        }
                        aVar.a(str, iArr);
                        return i16;
                    }
                    if (i17 == 74) {
                        long[] jArr = new long[I];
                        while (i12 < I) {
                            jArr[i12] = v(this.f124131d[I(i16 + 1)]);
                            i16 += 3;
                            i12++;
                        }
                        aVar.a(str, jArr);
                        return i16;
                    }
                    switch (i17) {
                        case 66:
                            byte[] bArr = new byte[I];
                            while (i12 < I) {
                                bArr[i12] = (byte) t(this.f124131d[I(i16 + 1)]);
                                i16 += 3;
                                i12++;
                            }
                            aVar.a(str, bArr);
                            return i16;
                        case 67:
                            char[] cArr2 = new char[I];
                            while (i12 < I) {
                                cArr2[i12] = (char) t(this.f124131d[I(i16 + 1)]);
                                i16 += 3;
                                i12++;
                            }
                            aVar.a(str, cArr2);
                            return i16;
                        case 68:
                            double[] dArr = new double[I];
                            while (i12 < I) {
                                dArr[i12] = Double.longBitsToDouble(v(this.f124131d[I(i16 + 1)]));
                                i16 += 3;
                                i12++;
                            }
                            aVar.a(str, dArr);
                            return i16;
                        default:
                            return r(aVar.c(str), i11 + 1, false, cArr);
                    }
                }
                switch (i15) {
                    case 66:
                        aVar.a(str, Byte.valueOf((byte) t(this.f124131d[I(i14)])));
                        return i11 + 3;
                    case 67:
                        aVar.a(str, Character.valueOf((char) t(this.f124131d[I(i14)])));
                        return i11 + 3;
                    case 68:
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }
        aVar.a(str, o(I(i14), cArr));
        return i11 + 3;
    }

    private int r(a aVar, int i11, boolean z11, char[] cArr) {
        int I = I(i11);
        int iQ = i11 + 2;
        if (!z11) {
            while (true) {
                int i12 = I - 1;
                if (I <= 0) {
                    break;
                }
                iQ = q(aVar, iQ, null, cArr);
                I = i12;
            }
        } else {
            while (true) {
                int i13 = I - 1;
                if (I <= 0) {
                    break;
                }
                iQ = q(aVar, iQ + 2, H(iQ, cArr), cArr);
                I = i13;
            }
        }
        if (aVar != null) {
            aVar.d();
        }
        return iQ;
    }

    private int s(f fVar, j jVar, int i11) {
        int i12;
        int i13;
        int i14;
        j jVar2 = jVar;
        char[] cArr = jVar2.f124168c;
        int I = I(i11);
        String strH = H(i11 + 2, cArr);
        String strH2 = H(i11 + 4, cArr);
        int I2 = I(i11 + 6);
        int i15 = i11 + 8;
        int i16 = I;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        String strH3 = null;
        Object objO = null;
        c cVar = null;
        while (true) {
            int i22 = I2 - 1;
            if (I2 <= 0) {
                break;
            }
            int i23 = i17;
            String strH4 = H(i15, cArr);
            int iT = t(i15 + 2);
            int i24 = i15 + 6;
            if ("ConstantValue".equals(strH4)) {
                int I3 = I(i24);
                objO = I3 == 0 ? null : o(I3, cArr);
            } else {
                if ("Signature".equals(strH4)) {
                    strH3 = H(i24, cArr);
                } else {
                    if ("Deprecated".equals(strH4)) {
                        i14 = 131072 | i16;
                    } else if ("Synthetic".equals(strH4)) {
                        i14 = i16 | 4096;
                    } else if ("RuntimeVisibleAnnotations".equals(strH4)) {
                        i17 = i24;
                        i12 = i17;
                        i24 = i18;
                        i13 = iT;
                    } else {
                        if ("RuntimeVisibleTypeAnnotations".equals(strH4)) {
                            i12 = i24;
                            i19 = i12;
                        } else if ("RuntimeInvisibleAnnotations".equals(strH4)) {
                            i12 = i24;
                            i13 = iT;
                            i17 = i23;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(strH4)) {
                            i12 = i24;
                            i21 = i12;
                        } else {
                            i12 = i24;
                            int i25 = i18;
                            i13 = iT;
                            c cVarJ = j(jVar2.f124166a, strH4, i12, i13, cArr, -1, null);
                            cVarJ.f124121c = cVar;
                            cVar = cVarJ;
                            i19 = i19;
                            i24 = i25;
                            i17 = i23;
                            i21 = i21;
                        }
                        i24 = i18;
                        i13 = iT;
                        i17 = i23;
                    }
                    i12 = i24;
                    i16 = i14;
                    i24 = i18;
                    i13 = iT;
                    i17 = i23;
                }
                int i26 = i12 + i13;
                jVar2 = jVar;
                i18 = i24;
                i15 = i26;
                I2 = i22;
            }
            i12 = i24;
            i24 = i18;
            i13 = iT;
            i17 = i23;
            int i27 = i12 + i13;
            jVar2 = jVar;
            i18 = i24;
            i15 = i27;
            I2 = i22;
        }
        int i28 = i17;
        int i29 = i18;
        int i31 = i19;
        int i32 = i21;
        m mVarE = fVar.e(i16, strH, strH2, strH3, objO);
        if (mVarE == null) {
            return i15;
        }
        if (i28 != 0) {
            int I4 = I(i28);
            int iR = i28 + 2;
            while (true) {
                int i33 = I4 - 1;
                if (I4 <= 0) {
                    break;
                }
                iR = r(mVarE.a(H(iR, cArr), true), iR + 2, true, cArr);
                I4 = i33;
            }
        }
        if (i29 != 0) {
            int I5 = I(i29);
            int iR2 = i29 + 2;
            while (true) {
                int i34 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                iR2 = r(mVarE.a(H(iR2, cArr), false), iR2 + 2, true, cArr);
                I5 = i34;
            }
        }
        if (i31 != 0) {
            int I6 = I(i31);
            int iR3 = i31 + 2;
            while (true) {
                int i35 = I6 - 1;
                if (I6 <= 0) {
                    break;
                }
                int iF = F(jVar, iR3);
                iR3 = r(mVarE.d(jVar.f124173h, jVar.f124174i, H(iF, cArr), true), iF + 2, true, cArr);
                I6 = i35;
            }
        }
        if (i32 != 0) {
            int I7 = I(i32);
            int iR4 = i32 + 2;
            while (true) {
                int i36 = I7 - 1;
                if (I7 <= 0) {
                    break;
                }
                int iF2 = F(jVar, iR4);
                iR4 = r(mVarE.d(jVar.f124173h, jVar.f124174i, H(iF2, cArr), false), iF2 + 2, true, cArr);
                I7 = i36;
            }
        }
        while (cVar != null) {
            c cVar2 = cVar.f124121c;
            cVar.f124121c = null;
            mVarE.b(cVar);
            cVar = cVar2;
        }
        mVarE.c();
        return i15;
    }

    private int w(f fVar, j jVar, int i11) {
        int i12;
        int i13;
        int i14;
        e eVar = this;
        char[] cArr = jVar.f124168c;
        jVar.f124169d = eVar.I(i11);
        jVar.f124170e = eVar.H(i11 + 2, cArr);
        int i15 = i11 + 4;
        jVar.f124171f = eVar.H(i15, cArr);
        int I = eVar.I(i11 + 6);
        int i16 = i11 + 8;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        c cVar = null;
        int I2 = 0;
        int i22 = 0;
        int i23 = 0;
        String[] strArr = null;
        boolean z11 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (true) {
            int i28 = I - 1;
            if (I <= 0) {
                break;
            }
            int i29 = i17;
            String strH = eVar.H(i16, cArr);
            int iT = eVar.t(i16 + 2);
            int i31 = i18;
            int i32 = i16 + 6;
            int i33 = i29;
            if ("Code".equals(strH)) {
                if ((jVar.f124167b & 1) == 0) {
                    i27 = i32;
                }
            } else if ("Exceptions".equals(strH)) {
                int I3 = eVar.I(i32);
                int i34 = i16 + 8;
                strArr = new String[I3];
                for (int i35 = 0; i35 < I3; i35++) {
                    strArr[i35] = eVar.m(i34, cArr);
                    i34 += 2;
                }
                i24 = i32;
            } else if ("Signature".equals(strH)) {
                I2 = eVar.I(i32);
            } else if ("Deprecated".equals(strH)) {
                jVar.f124169d |= 131072;
            } else if ("RuntimeVisibleAnnotations".equals(strH)) {
                i33 = i32;
            } else {
                if ("RuntimeVisibleTypeAnnotations".equals(strH)) {
                    i13 = i32;
                    i14 = iT;
                } else if ("AnnotationDefault".equals(strH)) {
                    i23 = i32;
                } else if ("Synthetic".equals(strH)) {
                    jVar.f124169d |= 4096;
                    i13 = i19;
                    i14 = iT;
                    z11 = true;
                } else if ("RuntimeInvisibleAnnotations".equals(strH)) {
                    i31 = i32;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(strH)) {
                    i21 = i32;
                } else if ("RuntimeVisibleParameterAnnotations".equals(strH)) {
                    i25 = i32;
                } else if ("RuntimeInvisibleParameterAnnotations".equals(strH)) {
                    i26 = i32;
                } else if ("MethodParameters".equals(strH)) {
                    i22 = i32;
                } else {
                    i13 = i19;
                    i14 = iT;
                    c cVarJ = eVar.j(jVar.f124166a, strH, i32, i14, cArr, -1, null);
                    cVarJ.f124121c = cVar;
                    cVar = cVarJ;
                    i21 = i21;
                }
                i16 = i32 + i14;
                cArr = cArr;
                I = i28;
                i18 = i31;
                i17 = i33;
                i19 = i13;
            }
            i13 = i19;
            i14 = iT;
            i16 = i32 + i14;
            cArr = cArr;
            I = i28;
            i18 = i31;
            i17 = i33;
            i19 = i13;
        }
        int i36 = i17;
        int i37 = i18;
        int i38 = i19;
        char[] cArr2 = cArr;
        int i39 = i21;
        int i41 = i23;
        int i42 = i22;
        s sVarG = fVar.g(jVar.f124169d, jVar.f124170e, jVar.f124171f, I2 == 0 ? null : eVar.K(I2, cArr2), strArr);
        if (sVarG == null) {
            return i16;
        }
        if (sVarG instanceof t) {
            t tVar = (t) sVarG;
            int i43 = I2;
            i12 = i42;
            boolean zG = tVar.G(eVar, z11, (jVar.f124169d & 131072) != 0, eVar.I(i15), i43, i24);
            eVar = eVar;
            if (zG) {
                tVar.S(i11, i16 - i11);
                return i16;
            }
        } else {
            i12 = i42;
        }
        if (i12 != 0 && (jVar.f124167b & 2) == 0) {
            int iL = eVar.l(i12);
            int i44 = i12 + 1;
            while (true) {
                int i45 = iL - 1;
                if (iL <= 0) {
                    break;
                }
                sVarG.x(eVar.H(i44, cArr2), eVar.I(i44 + 2));
                i44 += 4;
                iL = i45;
            }
        }
        if (r3 != 0) {
            a aVarC = sVarG.c();
            eVar.q(aVarC, i41, null, cArr2);
            if (aVarC != null) {
                aVarC.d();
            }
        }
        if (i36 != 0) {
            int I4 = eVar.I(i36);
            int iR = i36 + 2;
            while (true) {
                int i46 = I4 - 1;
                if (I4 <= 0) {
                    break;
                }
                iR = eVar.r(sVarG.b(eVar.H(iR, cArr2), true), iR + 2, true, cArr2);
                I4 = i46;
            }
        }
        if (i37 != 0) {
            int I5 = eVar.I(i37);
            int iR2 = i37 + 2;
            while (true) {
                int i47 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                iR2 = eVar.r(sVarG.b(eVar.H(iR2, cArr2), false), iR2 + 2, true, cArr2);
                I5 = i47;
            }
        }
        if (i38 != 0) {
            int I6 = eVar.I(i38);
            int iR3 = i38 + 2;
            while (true) {
                int i48 = I6 - 1;
                if (I6 <= 0) {
                    break;
                }
                int iF = eVar.F(jVar, iR3);
                iR3 = eVar.r(sVarG.C(jVar.f124173h, jVar.f124174i, eVar.H(iF, cArr2), true), iF + 2, true, cArr2);
                I6 = i48;
            }
        }
        if (i39 != 0) {
            int I7 = eVar.I(i39);
            int iR4 = i39 + 2;
            while (true) {
                int i49 = I7 - 1;
                if (I7 <= 0) {
                    break;
                }
                int iF2 = eVar.F(jVar, iR4);
                iR4 = eVar.r(sVarG.C(jVar.f124173h, jVar.f124174i, eVar.H(iF2, cArr2), false), iF2 + 2, true, cArr2);
                I7 = i49;
            }
        }
        int i51 = i25;
        if (i51 != 0) {
            eVar.A(sVarG, jVar, i51, true);
        }
        int i52 = i26;
        if (i52 != 0) {
            eVar.A(sVarG, jVar, i52, false);
        }
        while (cVar != null) {
            c cVar2 = cVar.f124121c;
            cVar.f124121c = null;
            sVarG.d(cVar);
            cVar = cVar2;
        }
        int i53 = i27;
        if (i53 != 0) {
            sVarG.e();
            eVar.n(sVarG, jVar, i53);
        }
        sVarG.f();
        return i16;
    }

    private void y(f fVar, j jVar, int i11, int i12, String str) {
        String[] strArr;
        char[] cArr = jVar.f124168c;
        int i13 = i11 + 6;
        u uVarH = fVar.h(x(i11, cArr), I(i11 + 2), H(i11 + 4, cArr));
        if (uVarH == null) {
            return;
        }
        if (str != null) {
            uVarH.c(str);
        }
        if (i12 != 0) {
            int I = I(i12);
            int i14 = i12 + 2;
            while (true) {
                int i15 = I - 1;
                if (I <= 0) {
                    break;
                }
                uVarH.e(z(i14, cArr));
                i14 += 2;
                I = i15;
            }
        }
        int I2 = I(i13);
        int i16 = i11 + 8;
        while (true) {
            int i17 = I2 - 1;
            if (I2 <= 0) {
                break;
            }
            String strX = x(i16, cArr);
            int I3 = I(i16 + 2);
            String strH = H(i16 + 4, cArr);
            i16 += 6;
            uVarH.g(strX, I3, strH);
            I2 = i17;
        }
        int I4 = I(i16);
        int i18 = i16 + 2;
        while (true) {
            int i19 = I4 - 1;
            String[] strArr2 = null;
            if (I4 <= 0) {
                break;
            }
            String strZ = z(i18, cArr);
            int I5 = I(i18 + 2);
            int I6 = I(i18 + 4);
            i18 += 6;
            if (I6 != 0) {
                strArr2 = new String[I6];
                for (int i21 = 0; i21 < I6; i21++) {
                    strArr2[i21] = x(i18, cArr);
                    i18 += 2;
                }
            }
            uVarH.b(strZ, I5, strArr2);
            I4 = i19;
        }
        int I7 = I(i18);
        int i22 = i18 + 2;
        while (true) {
            int i23 = I7 - 1;
            if (I7 <= 0) {
                break;
            }
            String strZ2 = z(i22, cArr);
            int I8 = I(i22 + 2);
            int I9 = I(i22 + 4);
            i22 += 6;
            if (I9 != 0) {
                strArr = new String[I9];
                for (int i24 = 0; i24 < I9; i24++) {
                    strArr[i24] = x(i22, cArr);
                    i22 += 2;
                }
            } else {
                strArr = null;
            }
            uVarH.d(strZ2, I8, strArr);
            I7 = i23;
        }
        int I10 = I(i22);
        int i25 = i22 + 2;
        while (true) {
            int i26 = I10 - 1;
            if (I10 <= 0) {
                break;
            }
            uVarH.h(m(i25, cArr));
            i25 += 2;
            I10 = i26;
        }
        int I11 = I(i25);
        int i27 = i25 + 2;
        while (true) {
            int i28 = I11 - 1;
            if (I11 <= 0) {
                uVarH.a();
                return;
            }
            String strM = m(i27, cArr);
            int I12 = I(i27 + 2);
            i27 += 4;
            String[] strArr3 = new String[I12];
            for (int i29 = 0; i29 < I12; i29++) {
                strArr3[i29] = m(i27, cArr);
                i27 += 2;
            }
            uVarH.f(strM, strArr3);
            I11 = i28;
        }
    }

    public short C(int i11) {
        byte[] bArr = this.f124130c;
        return (short) ((bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8));
    }

    public String H(int i11, char[] cArr) {
        int I = I(i11);
        if (i11 == 0 || I == 0) {
            return null;
        }
        return K(I, cArr);
    }

    public int I(int i11) {
        byte[] bArr = this.f124130c;
        return (bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8);
    }

    final String K(int i11, char[] cArr) {
        String[] strArr = this.f124132e;
        String str = strArr[i11];
        if (str != null) {
            return str;
        }
        int i12 = this.f124131d[i11];
        String strJ = J(i12 + 2, I(i12), cArr);
        strArr[i11] = strJ;
        return strJ;
    }

    public void a(f fVar, c[] cVarArr, int i11) {
        j jVar;
        e eVar;
        String str;
        int i12;
        String str2;
        int i13;
        j jVar2 = new j();
        jVar2.f124166a = cVarArr;
        jVar2.f124167b = i11;
        char[] cArr = new char[this.f124135h];
        jVar2.f124168c = cArr;
        int i14 = this.f124129b;
        int I = I(i14);
        String strM = m(i14 + 2, cArr);
        String strM2 = m(i14 + 4, cArr);
        int I2 = I(i14 + 6);
        String[] strArr = new String[I2];
        int i15 = i14 + 8;
        for (int i16 = 0; i16 < I2; i16++) {
            strArr[i16] = m(i15, cArr);
            i15 += 2;
        }
        int iE = e();
        int I3 = I(iE - 2);
        String str3 = null;
        String strJ = null;
        String strM3 = null;
        int i17 = 0;
        int i18 = 0;
        String strH = null;
        int i19 = 0;
        int i21 = 0;
        String strM4 = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        c cVar = null;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (I3 > 0) {
            int i29 = iE;
            String strH2 = H(i29, cArr);
            int iT = t(i29 + 2);
            String strH3 = str3;
            int i31 = i29 + 6;
            String str4 = strJ;
            if ("SourceFile".equals(strH2)) {
                strH3 = H(i31, cArr);
                i13 = I;
                i12 = i31;
                strM = strM;
                strJ = str4;
                iT = iT;
                jVar2 = jVar2;
            } else {
                if ("InnerClasses".equals(strH2)) {
                    i13 = I;
                    i12 = i31;
                    i27 = i12;
                } else if ("EnclosingMethod".equals(strH2)) {
                    i13 = I;
                    i12 = i31;
                    i18 = i12;
                } else {
                    if ("NestHost".equals(strH2)) {
                        strM3 = m(i31, cArr);
                    } else if ("NestMembers".equals(strH2)) {
                        i13 = I;
                        i12 = i31;
                        i25 = i12;
                    } else if ("PermittedSubclasses".equals(strH2)) {
                        i13 = I;
                        i12 = i31;
                        i26 = i12;
                    } else if ("Signature".equals(strH2)) {
                        strH = H(i31, cArr);
                    } else if ("RuntimeVisibleAnnotations".equals(strH2)) {
                        i13 = I;
                        i12 = i31;
                        i17 = i12;
                    } else if ("RuntimeVisibleTypeAnnotations".equals(strH2)) {
                        i13 = I;
                        i12 = i31;
                        i23 = i12;
                    } else {
                        if ("Deprecated".equals(strH2)) {
                            i13 = 131072 | I;
                        } else if ("Synthetic".equals(strH2)) {
                            i13 = I | 4096;
                        } else if ("SourceDebugExtension".equals(strH2)) {
                            if (iT > this.f124130c.length - i31) {
                                throw new IllegalArgumentException();
                            }
                            strJ = J(i31, iT, new char[iT]);
                            i13 = I;
                            i12 = i31;
                            strM = strM;
                        } else if ("RuntimeInvisibleAnnotations".equals(strH2)) {
                            i13 = I;
                            i12 = i31;
                            i22 = i12;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(strH2)) {
                            i13 = I;
                            i12 = i31;
                            i24 = i12;
                        } else if ("Record".equals(strH2)) {
                            i13 = 65536 | I;
                            i12 = i31;
                            i28 = i12;
                        } else if ("Module".equals(strH2)) {
                            i13 = I;
                            i12 = i31;
                            i19 = i12;
                        } else if ("ModuleMainClass".equals(strH2)) {
                            strM4 = m(i31, cArr);
                        } else if ("ModulePackages".equals(strH2)) {
                            i13 = I;
                            i12 = i31;
                            i21 = i12;
                        } else {
                            if ("BootstrapMethods".equals(strH2)) {
                                str = str4;
                                i12 = i31;
                                iT = iT;
                                str2 = strM3;
                            } else {
                                str = str4;
                                str2 = strM3;
                                i12 = i31;
                                iT = iT;
                                c cVarJ = j(cVarArr, strH2, i12, iT, cArr, -1, null);
                                cVarJ.f124121c = cVar;
                                cVar = cVarJ;
                            }
                            strJ = str;
                            strM3 = str2;
                            i13 = I;
                        }
                        i12 = i31;
                    }
                    i13 = I;
                    i12 = i31;
                }
                strJ = str4;
                strM = strM;
            }
            int i32 = i12 + iT;
            I3--;
            I = i13;
            str3 = strH3;
            jVar2 = jVar2;
            strM = strM;
            iE = i32;
        }
        String str5 = str3;
        j jVar3 = jVar2;
        String str6 = strM;
        String str7 = strJ;
        String str8 = strM3;
        c cVar2 = cVar;
        fVar.a(t(this.f124131d[1] - 7), I, str6, strH, strM2, strArr);
        if ((i11 & 2) == 0 && (str5 != null || str7 != null)) {
            fVar.n(str5, str7);
        }
        if (i19 != 0) {
            jVar = jVar3;
            eVar = this;
            eVar.y(fVar, jVar, i19, i21, strM4);
        } else {
            jVar = jVar3;
            eVar = this;
        }
        if (str8 != null) {
            fVar.i(str8);
        }
        if (i18 != 0) {
            String strM5 = eVar.m(i18, cArr);
            int I4 = eVar.I(i18 + 2);
            fVar.k(strM5, I4 == 0 ? null : eVar.H(eVar.f124131d[I4], cArr), I4 == 0 ? null : eVar.H(eVar.f124131d[I4] + 2, cArr));
        }
        if (i17 != 0) {
            int I5 = eVar.I(i17);
            int iR = i17 + 2;
            while (true) {
                int i33 = I5 - 1;
                if (I5 <= 0) {
                    break;
                }
                iR = eVar.r(fVar.b(eVar.H(iR, cArr), true), iR + 2, true, cArr);
                I5 = i33;
            }
        }
        int i34 = i22;
        if (i34 != 0) {
            int I6 = eVar.I(i34);
            int iR2 = i34 + 2;
            while (true) {
                int i35 = I6 - 1;
                if (I6 <= 0) {
                    break;
                }
                iR2 = eVar.r(fVar.b(eVar.H(iR2, cArr), false), iR2 + 2, true, cArr);
                I6 = i35;
            }
        }
        int i36 = i23;
        if (i36 != 0) {
            int I7 = eVar.I(i36);
            int iR3 = i36 + 2;
            while (true) {
                int i37 = I7 - 1;
                if (I7 <= 0) {
                    break;
                }
                int iF = eVar.F(jVar, iR3);
                iR3 = eVar.r(fVar.o(jVar.f124173h, jVar.f124174i, eVar.H(iF, cArr), true), iF + 2, true, cArr);
                I7 = i37;
            }
        }
        int i38 = i24;
        if (i38 != 0) {
            int I8 = eVar.I(i38);
            int iR4 = i38 + 2;
            while (true) {
                int i39 = I8 - 1;
                if (I8 <= 0) {
                    break;
                }
                int iF2 = eVar.F(jVar, iR4);
                iR4 = eVar.r(fVar.o(jVar.f124173h, jVar.f124174i, eVar.H(iF2, cArr), false), iF2 + 2, true, cArr);
                I8 = i39;
            }
        }
        while (cVar2 != null) {
            c cVar3 = cVar2.f124121c;
            cVar2.f124121c = null;
            fVar.c(cVar2);
            cVar2 = cVar3;
        }
        int i41 = i25;
        if (i41 != 0) {
            int I9 = eVar.I(i41);
            int i42 = i41 + 2;
            while (true) {
                int i43 = I9 - 1;
                if (I9 <= 0) {
                    break;
                }
                fVar.j(eVar.m(i42, cArr));
                i42 += 2;
                I9 = i43;
            }
        }
        int i44 = i26;
        if (i44 != 0) {
            int I10 = eVar.I(i44);
            int i45 = i44 + 2;
            while (true) {
                int i46 = I10 - 1;
                if (I10 <= 0) {
                    break;
                }
                fVar.l(eVar.m(i45, cArr));
                i45 += 2;
                I10 = i46;
            }
        }
        int i47 = i27;
        if (i47 != 0) {
            int I11 = eVar.I(i47);
            int i48 = i47 + 2;
            while (true) {
                int i49 = I11 - 1;
                if (I11 <= 0) {
                    break;
                }
                fVar.f(eVar.m(i48, cArr), eVar.m(i48 + 2, cArr), eVar.H(i48 + 4, cArr), eVar.I(i48 + 6));
                i48 += 8;
                I11 = i49;
            }
        }
        int i51 = i28;
        if (i51 != 0) {
            int I12 = eVar.I(i51);
            int iB = i51 + 2;
            while (true) {
                int i52 = I12 - 1;
                if (I12 <= 0) {
                    break;
                }
                iB = eVar.B(fVar, jVar, iB);
                I12 = i52;
            }
        }
        int I13 = eVar.I(i15);
        int iS = i15 + 2;
        while (true) {
            int i53 = I13 - 1;
            if (I13 <= 0) {
                break;
            }
            iS = eVar.s(fVar, jVar, iS);
            I13 = i53;
        }
        int I14 = eVar.I(iS);
        int iW = iS + 2;
        while (true) {
            int i54 = I14 - 1;
            if (I14 <= 0) {
                fVar.d();
                return;
            } else {
                iW = eVar.w(fVar, jVar, iW);
                I14 = i54;
            }
        }
    }

    final int e() {
        int i11 = this.f124129b;
        int I = i11 + 8 + (I(i11 + 6) * 2);
        int I2 = I(I);
        int iT = I + 2;
        while (true) {
            int i12 = I2 - 1;
            if (I2 <= 0) {
                break;
            }
            int I3 = I(iT + 6);
            iT += 8;
            while (true) {
                int i13 = I3 - 1;
                if (I3 > 0) {
                    iT += t(iT + 2) + 6;
                    I3 = i13;
                }
            }
            I2 = i12;
        }
        int I4 = I(iT);
        int iT2 = iT + 2;
        while (true) {
            int i14 = I4 - 1;
            if (I4 <= 0) {
                return iT2 + 2;
            }
            int I5 = I(iT2 + 6);
            iT2 += 8;
            while (true) {
                int i15 = I5 - 1;
                if (I5 > 0) {
                    iT2 += t(iT2 + 2) + 6;
                    I5 = i15;
                }
            }
            I4 = i14;
        }
    }

    public int f(int i11) {
        return this.f124131d[i11];
    }

    public int g() {
        return this.f124131d.length;
    }

    public int h() {
        return this.f124135h;
    }

    public int l(int i11) {
        return this.f124130c[i11] & 255;
    }

    public String m(int i11, char[] cArr) {
        return E(i11, cArr);
    }

    public Object o(int i11, char[] cArr) {
        int i12 = this.f124131d[i11];
        byte b11 = this.f124130c[i12 - 1];
        switch (b11) {
            case 3:
                return Integer.valueOf(t(i12));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(t(i12)));
            case 5:
                return Long.valueOf(v(i12));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(v(i12)));
            case 7:
                return b0.j(H(i12, cArr));
            case 8:
                return H(i12, cArr);
            default:
                switch (b11) {
                    case 15:
                        int iL = l(i12);
                        int i13 = this.f124131d[I(i12 + 1)];
                        int i14 = this.f124131d[I(i13 + 2)];
                        return new p(iL, m(i13, cArr), H(i14, cArr), H(i14 + 2, cArr), this.f124130c[i13 - 1] == 11);
                    case 16:
                        return b0.i(H(i12, cArr));
                    case 17:
                        return p(i11, cArr);
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public int t(int i11) {
        byte[] bArr = this.f124130c;
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    protected r u(int i11, r[] rVarArr) {
        if (rVarArr[i11] == null) {
            rVarArr[i11] = new r();
        }
        return rVarArr[i11];
    }

    public long v(int i11) {
        return (((long) t(i11)) << 32) | (((long) t(i11 + 4)) & 4294967295L);
    }

    public String x(int i11, char[] cArr) {
        return E(i11, cArr);
    }

    public String z(int i11, char[] cArr) {
        return E(i11, cArr);
    }
}
