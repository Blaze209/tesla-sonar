package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
class Xn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f29751b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float[] f29752c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29753a;

    Xn() {
    }

    int a() {
        return this.f29753a;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0088 A[EDGE_INSN: B:108:0x0088->B:40:0x0088 BREAK  A[LOOP:0: B:13:0x0034->B:39:0x0081], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x00ff A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    float a(String str, int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        int i15;
        boolean z12;
        int i16;
        int i17;
        int i18;
        int i19;
        float f11;
        char cCharAt;
        int i21;
        char cCharAt2;
        boolean z13;
        boolean z14;
        int i22;
        int i23;
        int i24;
        char cCharAt3;
        char cCharAt4;
        this.f29753a = i11;
        if (i11 >= i12) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i11);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z11 = false;
            } else {
                z11 = true;
            }
            int i25 = this.f29753a;
            long j11 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            z12 = false;
            i16 = 0;
            while (true) {
                i17 = this.f29753a;
                if (i17 >= i12) {
                    break;
                }
                cCharAt4 = str.charAt(i17);
                if (cCharAt4 != '0') {
                    if (i13 == 0) {
                        i15++;
                    } else {
                        i14++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i26 = i13 + i14;
                    while (i14 > 0) {
                        if (j11 > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j11 *= 10;
                        i14--;
                    }
                    if (j11 > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j11 = (j11 * 10) + ((long) (cCharAt4 - '0'));
                    i13 = i26 + 1;
                    if (j11 < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z12) {
                        break;
                    }
                    i16 = this.f29753a - i25;
                    z12 = true;
                }
                this.f29753a++;
            }
            if (!z12 && this.f29753a == i16 + 1) {
                return Float.NaN;
            }
            if (i13 == 0) {
                if (i15 == 0) {
                    return Float.NaN;
                }
                i13 = 1;
            }
            if (z12) {
                i14 = (i16 - i15) - i13;
            }
            i18 = this.f29753a;
            if (i18 < i12 && ((cCharAt = str.charAt(i18)) == 'E' || cCharAt == 'e')) {
                i21 = this.f29753a + 1;
                this.f29753a = i21;
                if (i21 == i12) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i21);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z13 = false;
                                z14 = false;
                                break;
                            default:
                                this.f29753a--;
                                z14 = true;
                                z13 = false;
                                break;
                        }
                    } else {
                        z13 = true;
                    }
                    if (!z14) {
                        i22 = this.f29753a;
                        i23 = 0;
                        while (true) {
                            i24 = this.f29753a;
                            if (i24 >= i12 && (cCharAt3 = str.charAt(i24)) >= '0' && cCharAt3 <= '9') {
                                if (i23 > 214748364) {
                                    return Float.NaN;
                                }
                                i23 = (i23 * 10) + (cCharAt3 - '0');
                                this.f29753a++;
                            }
                        }
                        if (this.f29753a == i22) {
                            return Float.NaN;
                        }
                        if (z13) {
                            i14 -= i23;
                        } else {
                            i14 += i23;
                        }
                    }
                } else {
                    z13 = false;
                }
                this.f29753a++;
                z14 = false;
                if (!z14) {
                    i22 = this.f29753a;
                    i23 = 0;
                    while (true) {
                        i24 = this.f29753a;
                        if (i24 >= i12) {
                        }
                        i23 = (i23 * 10) + (cCharAt3 - '0');
                        this.f29753a++;
                    }
                    if (this.f29753a == i22) {
                        return Float.NaN;
                    }
                    if (z13) {
                        i14 -= i23;
                    } else {
                        i14 += i23;
                    }
                }
            }
            i19 = i13 + i14;
            if (i19 <= 39 || i19 < -44) {
                return Float.NaN;
            }
            float f12 = j11;
            if (j11 != 0) {
                if (i14 > 0) {
                    f11 = f29751b[i14];
                } else if (i14 < 0) {
                    if (i14 < -38) {
                        f12 = (float) (((double) f12) * 1.0E-20d);
                        i14 += 20;
                    }
                    f11 = f29752c[-i14];
                }
                f12 *= f11;
            }
            return z11 ? -f12 : f12;
        }
        z11 = false;
        this.f29753a++;
        int i27 = this.f29753a;
        long j12 = 0;
        i13 = 0;
        i14 = 0;
        i15 = 0;
        z12 = false;
        i16 = 0;
        while (true) {
            i17 = this.f29753a;
            if (i17 >= i12) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i17);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i13 == 0) {
                i15++;
            } else {
                i14++;
            }
            this.f29753a++;
        }
        if (!z12) {
        }
        if (i13 == 0) {
            if (i15 == 0) {
                return Float.NaN;
            }
            i13 = 1;
        }
        if (z12) {
            i14 = (i16 - i15) - i13;
        }
        i18 = this.f29753a;
        if (i18 < i12) {
            i21 = this.f29753a + 1;
            this.f29753a = i21;
            if (i21 == i12) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i21);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z13 = false;
                            z14 = false;
                            break;
                        default:
                            this.f29753a--;
                            z14 = true;
                            z13 = false;
                            break;
                    }
                } else {
                    z13 = true;
                }
                if (!z14) {
                    i22 = this.f29753a;
                    i23 = 0;
                    while (true) {
                        i24 = this.f29753a;
                        if (i24 >= i12) {
                        }
                        i23 = (i23 * 10) + (cCharAt3 - '0');
                        this.f29753a++;
                    }
                    if (this.f29753a == i22) {
                        return Float.NaN;
                    }
                    if (z13) {
                        i14 -= i23;
                    } else {
                        i14 += i23;
                    }
                }
            } else {
                z13 = false;
            }
            this.f29753a++;
            z14 = false;
            if (!z14) {
                i22 = this.f29753a;
                i23 = 0;
                while (true) {
                    i24 = this.f29753a;
                    if (i24 >= i12) {
                    }
                    i23 = (i23 * 10) + (cCharAt3 - '0');
                    this.f29753a++;
                }
                if (this.f29753a == i22) {
                    return Float.NaN;
                }
                if (z13) {
                    i14 -= i23;
                } else {
                    i14 += i23;
                }
            }
        }
        i19 = i13 + i14;
        if (i19 <= 39) {
        }
        return Float.NaN;
    }
}
