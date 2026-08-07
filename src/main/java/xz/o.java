package xz;

import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes6.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    r f124201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f124202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f124203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f124204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f124205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private short f124206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private short f124207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f124208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f124209i;

    o(r rVar) {
        this.f124201a = rVar;
    }

    private void b(int i11) {
        if (this.f124209i == null) {
            this.f124209i = new int[2];
        }
        int length = this.f124209i.length;
        int i12 = this.f124208h;
        if (i12 >= length) {
            int[] iArr = new int[Math.max(i12 + 1, length * 2)];
            System.arraycopy(this.f124209i, 0, iArr, 0, length);
            this.f124209i = iArr;
        }
        int[] iArr2 = this.f124209i;
        int i13 = this.f124208h;
        this.f124208h = i13 + 1;
        iArr2[i13] = i11;
    }

    static int e(a0 a0Var, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        return obj instanceof String ? f(a0Var, b0.j((String) obj).d(), 0) : a0Var.K("", ((r) obj).f124225d) | 12582912;
    }

    private static int f(a0 a0Var, String str, int i11) {
        char cCharAt = str.charAt(i11);
        int I = 4194306;
        if (cCharAt == 'F') {
            return 4194306;
        }
        if (cCharAt == 'L') {
            return a0Var.I(str.substring(i11 + 1, str.length() - 1)) | 8388608;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 4194308;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i12 = i11 + 1;
                        while (str.charAt(i12) == '[') {
                            i12++;
                        }
                        char cCharAt2 = str.charAt(i12);
                        if (cCharAt2 != 'F') {
                            if (cCharAt2 == 'L') {
                                I = a0Var.I(str.substring(i12 + 1, str.length() - 1)) | 8388608;
                            } else if (cCharAt2 == 'S') {
                                I = 4194316;
                            } else if (cCharAt2 == 'Z') {
                                I = 4194313;
                            } else if (cCharAt2 == 'I') {
                                I = 4194305;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        I = 4194314;
                                        break;
                                    case 'C':
                                        I = 4194315;
                                        break;
                                    case 'D':
                                        I = 4194307;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                I = 4194308;
                            }
                        }
                        return ((i12 - i11) << 26) | I;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return 4194305;
    }

    static int g(a0 a0Var, String str) {
        return a0Var.I(str) | 8388608;
    }

    private int h(int i11, int i12) {
        int i13 = (-67108864) & i11;
        int i14 = 62914560 & i11;
        if (i14 == 16777216) {
            int i15 = i13 + this.f124202b[i11 & 1048575];
            if ((i11 & PKIFailureInfo.badCertTemplate) == 0 || !(i15 == 4194308 || i15 == 4194307)) {
                return i15;
            }
            return 4194304;
        }
        if (i14 != 20971520) {
            return i11;
        }
        int i16 = i13 + this.f124203c[i12 - (i11 & 1048575)];
        if ((i11 & PKIFailureInfo.badCertTemplate) == 0 || !(i16 == 4194308 || i16 == 4194307)) {
            return i16;
        }
        return 4194304;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[LOOP:0: B:7:0x000d->B:23:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0037 A[SYNTHETIC] */
    private int i(a0 a0Var, int i11) {
        int i12;
        int I;
        if (i11 == 4194310 || ((-4194304) & i11) == 12582912) {
            for (int i13 = 0; i13 < this.f124208h; i13++) {
                int i14 = this.f124209i[i13];
                int i15 = (-67108864) & i14;
                int i16 = 62914560 & i14;
                int i17 = i14 & 1048575;
                if (i16 == 16777216) {
                    i12 = this.f124202b[i17];
                } else {
                    if (i16 == 20971520) {
                        int[] iArr = this.f124203c;
                        i12 = iArr[iArr.length - i17];
                    }
                    if (i11 == i14) {
                        if (i11 == 4194310) {
                            I = a0Var.I(a0Var.O());
                        } else {
                            I = a0Var.I(a0Var.T(i11 & 1048575).f124305e);
                        }
                        return I | 8388608;
                    }
                }
                i14 = i12 + i15;
                if (i11 == i14) {
                    if (i11 == 4194310) {
                        I = a0Var.I(a0Var.O());
                    } else {
                        I = a0Var.I(a0Var.T(i11 & 1048575).f124305e);
                    }
                    return I | 8388608;
                }
            }
        }
        return i11;
    }

    private int k(int i11) {
        int[] iArr = this.f124204d;
        if (iArr == null || i11 >= iArr.length) {
            return i11 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        int i12 = iArr[i11];
        if (i12 != 0) {
            return i12;
        }
        int i13 = 16777216 | i11;
        iArr[i11] = i13;
        return i13;
    }

    private static boolean l(a0 a0Var, int i11, int[] iArr, int i12) {
        int iMin;
        int I;
        int i13 = iArr[i12];
        if (i13 == i11) {
            return false;
        }
        if ((67108863 & i11) == 4194309) {
            if (i13 == 4194309) {
                return false;
            }
            i11 = 4194309;
        }
        if (i13 == 0) {
            iArr[i12] = i11;
            return true;
        }
        int i14 = i13 & (-67108864);
        int iH = 4194304;
        if (i14 != 0 || (i13 & 62914560) == 8388608) {
            if (i11 == 4194309) {
                return false;
            }
            if ((i11 & (-4194304)) != ((-4194304) & i13)) {
                int i15 = i11 & (-67108864);
                if (i15 != 0 || (i11 & 62914560) == 8388608) {
                    if (i15 != 0 && (i11 & 62914560) != 8388608) {
                        i15 -= 67108864;
                    }
                    if (i14 != 0 && (i13 & 62914560) != 8388608) {
                        i14 -= 67108864;
                    }
                    iMin = Math.min(i15, i14) | 8388608;
                    I = a0Var.I("java/lang/Object");
                    iH = iMin | I;
                }
            } else if ((i13 & 62914560) == 8388608) {
                iH = (i11 & (-67108864)) | 8388608 | a0Var.H(i11 & 1048575, 1048575 & i13);
            } else {
                iMin = ((i11 & (-67108864)) - 67108864) | 8388608;
                I = a0Var.I("java/lang/Object");
                iH = iMin | I;
            }
        } else if (i13 == 4194309) {
            if ((i11 & (-67108864)) == 0 && (i11 & 62914560) != 8388608) {
                i11 = 4194304;
            }
            iH = i11;
        }
        if (iH == i13) {
            return false;
        }
        iArr[i12] = iH;
        return true;
    }

    private int n() {
        short s11 = this.f124207g;
        if (s11 <= 0) {
            short s12 = (short) (this.f124206f - 1);
            this.f124206f = s12;
            return (-s12) | 20971520;
        }
        int[] iArr = this.f124205e;
        short s13 = (short) (s11 - 1);
        this.f124207g = s13;
        return iArr[s13];
    }

    private void o(int i11) {
        short s11 = this.f124207g;
        if (s11 >= i11) {
            this.f124207g = (short) (s11 - i11);
        } else {
            this.f124206f = (short) (this.f124206f - (i11 - s11));
            this.f124207g = (short) 0;
        }
    }

    private void p(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            o((b0.c(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            o(2);
        } else {
            o(1);
        }
    }

    private void q(int i11) {
        if (this.f124205e == null) {
            this.f124205e = new int[10];
        }
        int length = this.f124205e.length;
        short s11 = this.f124207g;
        if (s11 >= length) {
            int[] iArr = new int[Math.max(s11 + 1, length * 2)];
            System.arraycopy(this.f124205e, 0, iArr, 0, length);
            this.f124205e = iArr;
        }
        int[] iArr2 = this.f124205e;
        short s12 = this.f124207g;
        short s13 = (short) (s12 + 1);
        this.f124207g = s13;
        iArr2[s12] = i11;
        short s14 = (short) (this.f124206f + s13);
        r rVar = this.f124201a;
        if (s14 > rVar.f124229h) {
            rVar.f124229h = s14;
        }
    }

    private void r(a0 a0Var, String str) {
        int iF = f(a0Var, str, str.charAt(0) == '(' ? b0.k(str) : 0);
        if (iF != 0) {
            q(iF);
            if (iF == 4194308 || iF == 4194307) {
                q(4194304);
            }
        }
    }

    static void s(a0 a0Var, int i11, d dVar) {
        int i12 = ((-67108864) & i11) >> 26;
        if (i12 == 0) {
            int i13 = i11 & 1048575;
            int i14 = i11 & 62914560;
            if (i14 == 4194304) {
                dVar.g(i13);
                return;
            } else if (i14 == 8388608) {
                dVar.g(7).k(a0Var.e(a0Var.T(i13).f124305e).f124301a);
                return;
            } else {
                if (i14 != 12582912) {
                    throw new AssertionError();
                }
                dVar.g(8).k((int) a0Var.T(i13).f124306f);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i15 = i12 - 1;
            if (i12 <= 0) {
                break;
            }
            sb2.append('[');
            i12 = i15;
        }
        if ((i11 & 62914560) == 8388608) {
            sb2.append('L');
            sb2.append(a0Var.T(i11 & 1048575).f124305e);
            sb2.append(';');
        } else {
            int i16 = i11 & 1048575;
            if (i16 == 1) {
                sb2.append('I');
            } else if (i16 == 2) {
                sb2.append('F');
            } else if (i16 == 3) {
                sb2.append('D');
            } else if (i16 != 4) {
                switch (i16) {
                    case 9:
                        sb2.append('Z');
                        break;
                    case 10:
                        sb2.append('B');
                        break;
                    case 11:
                        sb2.append('C');
                        break;
                    case 12:
                        sb2.append('S');
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb2.append('J');
            }
        }
        dVar.g(7).k(a0Var.e(sb2.toString()).f124301a);
    }

    private void v(int i11, int i12) {
        if (this.f124204d == null) {
            this.f124204d = new int[10];
        }
        int length = this.f124204d.length;
        if (i11 >= length) {
            int[] iArr = new int[Math.max(i11 + 1, length * 2)];
            System.arraycopy(this.f124204d, 0, iArr, 0, length);
            this.f124204d = iArr;
        }
        this.f124204d[i11] = i12;
    }

    final void a(t tVar) {
        int[] iArr = this.f124202b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = 2;
            if (i12 >= iArr.length) {
                break;
            }
            int i16 = iArr[i12];
            if (i16 != 4194308 && i16 != 4194307) {
                i15 = 1;
            }
            i12 += i15;
            if (i16 == 4194304) {
                i14++;
            } else {
                i13 += i14 + 1;
                i14 = 0;
            }
        }
        int[] iArr2 = this.f124203c;
        int i17 = 0;
        int i18 = 0;
        while (i17 < iArr2.length) {
            int i19 = iArr2[i17];
            i17 += (i19 == 4194308 || i19 == 4194307) ? 2 : 1;
            i18++;
        }
        int iV = tVar.V(this.f124201a.f124225d, i13, i18);
        int i21 = 0;
        while (true) {
            int i22 = i13 - 1;
            if (i13 <= 0) {
                break;
            }
            int i23 = iArr[i21];
            i21 += (i23 == 4194308 || i23 == 4194307) ? 2 : 1;
            tVar.T(iV, i23);
            i13 = i22;
            iV++;
        }
        while (true) {
            int i24 = i18 - 1;
            if (i18 <= 0) {
                tVar.U();
                return;
            }
            int i25 = iArr2[i11];
            i11 += (i25 == 4194308 || i25 == 4194307) ? 2 : 1;
            tVar.T(iV, i25);
            iV++;
            i18 = i24;
        }
    }

    final void c(o oVar) {
        this.f124202b = oVar.f124202b;
        this.f124203c = oVar.f124203c;
        this.f124206f = (short) 0;
        this.f124204d = oVar.f124204d;
        this.f124205e = oVar.f124205e;
        this.f124207g = oVar.f124207g;
        this.f124208h = oVar.f124208h;
        this.f124209i = oVar.f124209i;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0287  */
    /* JADX WARN: Code duplicated, block: B:143:0x0291  */
    /* JADX WARN: Code duplicated, block: B:145:0x0298  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:174:0x030d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0314  */
    /* JADX WARN: Code duplicated, block: B:178:0x0318  */
    /* JADX WARN: Code duplicated, block: B:180:0x031f  */
    void d(int i11, int i12, z zVar, a0 a0Var) {
        switch (i11) {
            case 0:
                return;
            case 1:
                q(4194309);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                q(4194305);
                return;
            case 9:
            case 10:
                q(4194308);
                q(4194304);
                return;
            case 11:
            case 12:
            case 13:
                q(4194306);
                return;
            case 14:
            case 15:
                q(4194307);
                q(4194304);
                return;
            case 18:
                int i13 = zVar.f124302b;
                switch (i13) {
                    case 3:
                        q(4194305);
                        return;
                    case 4:
                        q(4194306);
                        return;
                    case 5:
                        q(4194308);
                        q(4194304);
                        return;
                    case 6:
                        q(4194307);
                        q(4194304);
                        return;
                    case 7:
                        q(a0Var.I("java/lang/Class") | 8388608);
                        return;
                    case 8:
                        q(a0Var.I("java/lang/String") | 8388608);
                        return;
                    default:
                        switch (i13) {
                            case 15:
                                q(a0Var.I("java/lang/invoke/MethodHandle") | 8388608);
                                return;
                            case 16:
                                q(a0Var.I("java/lang/invoke/MethodType") | 8388608);
                                return;
                            case 17:
                                r(a0Var, zVar.f124305e);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i11) {
                    case 21:
                        q(4194305);
                        return;
                    case 22:
                        q(4194308);
                        q(4194304);
                        return;
                    case 23:
                        q(4194306);
                        return;
                    case 24:
                        q(4194307);
                        q(4194304);
                        return;
                    case 25:
                        q(k(i12));
                        return;
                    default:
                        switch (i11) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                o(2);
                                q(4194305);
                                return;
                            case 47:
                                o(2);
                                q(4194308);
                                q(4194304);
                                return;
                            case 48:
                                o(2);
                                q(4194306);
                                return;
                            case 49:
                                o(2);
                                q(4194307);
                                q(4194304);
                                return;
                            case 50:
                                o(1);
                                int iN = n();
                                if (iN != 4194309) {
                                    iN -= 67108864;
                                }
                                q(iN);
                                return;
                            case 54:
                            case 56:
                            case 58:
                                v(i12, n());
                                if (i12 > 0) {
                                    int i14 = i12 - 1;
                                    int iK = k(i14);
                                    if (iK == 4194308 || iK == 4194307) {
                                        v(i14, 4194304);
                                        return;
                                    }
                                    int i15 = iK & 62914560;
                                    if (i15 == 16777216 || i15 == 20971520) {
                                        v(i14, iK | PKIFailureInfo.badCertTemplate);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 55:
                            case 57:
                                o(1);
                                v(i12, n());
                                v(i12 + 1, 4194304);
                                if (i12 > 0) {
                                    int i16 = i12 - 1;
                                    int iK2 = k(i16);
                                    if (iK2 == 4194308 || iK2 == 4194307) {
                                        v(i16, 4194304);
                                        return;
                                    }
                                    int i17 = iK2 & 62914560;
                                    if (i17 == 16777216 || i17 == 20971520) {
                                        v(i16, iK2 | PKIFailureInfo.badCertTemplate);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i11) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        o(3);
                                        return;
                                    case 80:
                                    case 82:
                                        o(4);
                                        return;
                                    case 87:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case 174:
                                    case 176:
                                    case 191:
                                    case 194:
                                    case 195:
                                        break;
                                    case 88:
                                    case 159:
                                    case 160:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 173:
                                    case 175:
                                        o(2);
                                        return;
                                    case 89:
                                        int iN2 = n();
                                        q(iN2);
                                        q(iN2);
                                        return;
                                    case 90:
                                        int iN3 = n();
                                        int iN4 = n();
                                        q(iN3);
                                        q(iN4);
                                        q(iN3);
                                        return;
                                    case 91:
                                        int iN5 = n();
                                        int iN6 = n();
                                        int iN7 = n();
                                        q(iN5);
                                        q(iN7);
                                        q(iN6);
                                        q(iN5);
                                        return;
                                    case 92:
                                        int iN8 = n();
                                        int iN9 = n();
                                        q(iN9);
                                        q(iN8);
                                        q(iN9);
                                        q(iN8);
                                        return;
                                    case 93:
                                        int iN10 = n();
                                        int iN11 = n();
                                        int iN12 = n();
                                        q(iN11);
                                        q(iN10);
                                        q(iN12);
                                        q(iN11);
                                        q(iN10);
                                        return;
                                    case 94:
                                        int iN13 = n();
                                        int iN14 = n();
                                        int iN15 = n();
                                        int iN16 = n();
                                        q(iN14);
                                        q(iN13);
                                        q(iN16);
                                        q(iN15);
                                        q(iN14);
                                        q(iN13);
                                        return;
                                    case 95:
                                        int iN17 = n();
                                        int iN18 = n();
                                        q(iN17);
                                        q(iN18);
                                        return;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                                    case 136:
                                    case 142:
                                    case 149:
                                    case 150:
                                        o(2);
                                        q(4194305);
                                        return;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                    case 131:
                                        o(4);
                                        q(4194308);
                                        q(4194304);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case 137:
                                    case 144:
                                        o(2);
                                        q(4194306);
                                        return;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        o(4);
                                        q(4194307);
                                        q(4194304);
                                        return;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 167:
                                    case 177:
                                        return;
                                    case 121:
                                    case 123:
                                    case 125:
                                        o(3);
                                        q(4194308);
                                        q(4194304);
                                        return;
                                    case 132:
                                        v(i12, 4194305);
                                        return;
                                    case 133:
                                    case 140:
                                        o(1);
                                        q(4194308);
                                        q(4194304);
                                        return;
                                    case 134:
                                        o(1);
                                        q(4194306);
                                        return;
                                    case 135:
                                    case 141:
                                        o(1);
                                        q(4194307);
                                        q(4194304);
                                        return;
                                    case 138:
                                        o(2);
                                        q(4194307);
                                        q(4194304);
                                        return;
                                    case 139:
                                    case 190:
                                    case 193:
                                        o(1);
                                        q(4194305);
                                        return;
                                    case 143:
                                        o(2);
                                        q(4194308);
                                        q(4194304);
                                        return;
                                    case 148:
                                    case 151:
                                    case 152:
                                        o(4);
                                        q(4194305);
                                        return;
                                    case 168:
                                    case 169:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case 178:
                                        r(a0Var, zVar.f124305e);
                                        return;
                                    case 179:
                                        p(zVar.f124305e);
                                        return;
                                    case 180:
                                        o(1);
                                        r(a0Var, zVar.f124305e);
                                        return;
                                    case 181:
                                        p(zVar.f124305e);
                                        n();
                                        return;
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        p(zVar.f124305e);
                                        if (i11 != 184) {
                                            int iN19 = n();
                                            if (i11 == 183 && zVar.f124304d.charAt(0) == '<') {
                                                b(iN19);
                                            }
                                        }
                                        r(a0Var, zVar.f124305e);
                                        return;
                                    case 186:
                                        p(zVar.f124305e);
                                        r(a0Var, zVar.f124305e);
                                        return;
                                    case 187:
                                        q(a0Var.K(zVar.f124305e, i12) | 12582912);
                                        return;
                                    case 188:
                                        n();
                                        switch (i12) {
                                            case 4:
                                                q(71303177);
                                                return;
                                            case 5:
                                                q(71303179);
                                                return;
                                            case 6:
                                                q(71303170);
                                                return;
                                            case 7:
                                                q(71303171);
                                                return;
                                            case 8:
                                                q(71303178);
                                                return;
                                            case 9:
                                                q(71303180);
                                                return;
                                            case 10:
                                                q(71303169);
                                                return;
                                            case 11:
                                                q(71303172);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case 189:
                                        String str = zVar.f124305e;
                                        n();
                                        if (str.charAt(0) != '[') {
                                            q(a0Var.I(str) | 75497472);
                                            return;
                                        }
                                        r(a0Var, '[' + str);
                                        return;
                                    case 192:
                                        String str2 = zVar.f124305e;
                                        n();
                                        if (str2.charAt(0) == '[') {
                                            r(a0Var, str2);
                                            return;
                                        } else {
                                            q(a0Var.I(str2) | 8388608);
                                            return;
                                        }
                                    default:
                                        switch (i11) {
                                            case 197:
                                                o(i12);
                                                r(a0Var, zVar.f124305e);
                                                return;
                                            case SDK_ASSET_ICON_ARROW_UP_VALUE:
                                            case SDK_ASSET_ICON_CANCEL_VALUE:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                        break;
                                }
                                o(1);
                                return;
                        }
                }
        }
    }

    final int j() {
        return this.f124203c.length;
    }

    final boolean m(a0 a0Var, o oVar, int i11) {
        boolean zL;
        int i12;
        int length = this.f124202b.length;
        int length2 = this.f124203c.length;
        boolean zL2 = true;
        if (oVar.f124202b == null) {
            oVar.f124202b = new int[length];
            zL = true;
        } else {
            zL = false;
        }
        int i13 = 0;
        while (i13 < length) {
            int[] iArr = this.f124204d;
            int i14 = (iArr == null || i13 >= iArr.length || (i12 = iArr[i13]) == 0) ? this.f124202b[i13] : h(i12, length2);
            if (this.f124209i != null) {
                i14 = i(a0Var, i14);
            }
            zL |= l(a0Var, i14, oVar.f124202b, i13);
            i13++;
        }
        if (i11 > 0) {
            for (int i15 = 0; i15 < length; i15++) {
                zL |= l(a0Var, this.f124202b[i15], oVar.f124202b, i15);
            }
            if (oVar.f124203c == null) {
                oVar.f124203c = new int[1];
            } else {
                zL2 = zL;
            }
            return l(a0Var, i11, oVar.f124203c, 0) | zL2;
        }
        int length3 = this.f124203c.length + this.f124206f;
        if (oVar.f124203c == null) {
            oVar.f124203c = new int[this.f124207g + length3];
        } else {
            zL2 = zL;
        }
        for (int i16 = 0; i16 < length3; i16++) {
            int i17 = this.f124203c[i16];
            if (this.f124209i != null) {
                i17 = i(a0Var, i17);
            }
            zL2 |= l(a0Var, i17, oVar.f124203c, i16);
        }
        for (int i18 = 0; i18 < this.f124207g; i18++) {
            int iH = h(this.f124205e[i18], length2);
            if (this.f124209i != null) {
                iH = i(a0Var, iH);
            }
            zL2 |= l(a0Var, iH, oVar.f124203c, length3 + i18);
        }
        return zL2;
    }

    final void t(a0 a0Var, int i11, Object[] objArr, int i12, Object[] objArr2) {
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i13 + 1;
            this.f124202b[i13] = e(a0Var, objArr[i14]);
            Object obj = objArr[i14];
            if (obj == w.f124287e || obj == w.f124286d) {
                i13 += 2;
                this.f124202b[i15] = 4194304;
            } else {
                i13 = i15;
            }
        }
        while (true) {
            int[] iArr = this.f124202b;
            if (i13 >= iArr.length) {
                break;
            }
            iArr[i13] = 4194304;
            i13++;
        }
        int i16 = 0;
        for (int i17 = 0; i17 < i12; i17++) {
            Object obj2 = objArr2[i17];
            if (obj2 == w.f124287e || obj2 == w.f124286d) {
                i16++;
            }
        }
        this.f124203c = new int[i16 + i12];
        int i18 = 0;
        for (int i19 = 0; i19 < i12; i19++) {
            int i21 = i18 + 1;
            this.f124203c[i18] = e(a0Var, objArr2[i19]);
            Object obj3 = objArr2[i19];
            if (obj3 == w.f124287e || obj3 == w.f124286d) {
                i18 += 2;
                this.f124203c[i21] = 4194304;
            } else {
                i18 = i21;
            }
        }
        this.f124207g = (short) 0;
        this.f124208h = 0;
    }

    final void u(a0 a0Var, int i11, String str, int i12) {
        int i13;
        int[] iArr = new int[i12];
        this.f124202b = iArr;
        this.f124203c = new int[0];
        if ((i11 & 8) == 0) {
            i13 = 1;
            if ((i11 & 262144) == 0) {
                iArr[0] = a0Var.I(a0Var.O()) | 8388608;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i13 = 0;
        }
        for (b0 b0Var : b0.b(str)) {
            int iF = f(a0Var, b0Var.d(), 0);
            int[] iArr2 = this.f124202b;
            int i14 = i13 + 1;
            iArr2[i13] = iF;
            if (iF == 4194308 || iF == 4194307) {
                i13 += 2;
                iArr2[i14] = 4194304;
            } else {
                i13 = i14;
            }
        }
        while (i13 < i12) {
            this.f124202b[i13] = 4194304;
            i13++;
        }
    }
}
