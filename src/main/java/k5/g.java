package k5;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f84929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f84930b;

        a() {
        }
    }

    private static void a(ArrayList<b> arrayList, char c11, float[] fArr) {
        arrayList.add(new b(c11, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            if (bVarArr[i11].f84931a != bVarArr2[i11].f84931a || bVarArr[i11].f84932b.length != bVarArr2[i11].f84932b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i11 < 0 || i11 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i13 = i12 - i11;
        int iMin = Math.min(i13, length - i11);
        float[] fArr2 = new float[i13];
        System.arraycopy(fArr, i11, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 1;
        while (i12 < str.length()) {
            int i13 = i(str, i12);
            String strTrim = str.substring(i11, i13).trim();
            if (!strTrim.isEmpty()) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i11 = i13;
            i12 = i13 + 1;
        }
        if (i12 - i11 == 1 && i11 < str.length()) {
            a(arrayList, str.charAt(i11), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path e(String str) {
        Path path = new Path();
        try {
            b.h(d(str), path);
            return path;
        } catch (RuntimeException e11) {
            throw new RuntimeException("Error in parsing " + str, e11);
        }
    }

    public static b[] f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            bVarArr2[i11] = new b(bVarArr[i11]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    private static void g(String str, int i11, a aVar) {
        aVar.f84930b = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (int i12 = i11; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == ' ') {
                z11 = false;
                z13 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z11 = false;
                        z13 = true;
                        break;
                    case '-':
                        if (i12 == i11 || z11) {
                            z11 = false;
                        } else {
                            aVar.f84930b = true;
                            z11 = false;
                            z13 = true;
                        }
                        break;
                    case '.':
                        if (z12) {
                            aVar.f84930b = true;
                            z11 = false;
                            z13 = true;
                        } else {
                            z11 = false;
                            z12 = true;
                        }
                        break;
                    default:
                        z11 = false;
                        break;
                }
            } else {
                z11 = true;
            }
            if (z13) {
                aVar.f84929a = i12;
            }
        }
        aVar.f84929a = i12;
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i11 = 1;
            int i12 = 0;
            while (i11 < length) {
                g(str, i11, aVar);
                int i13 = aVar.f84929a;
                if (i11 < i13) {
                    fArr[i12] = Float.parseFloat(str.substring(i11, i13));
                    i12++;
                }
                i11 = aVar.f84930b ? i13 : i13 + 1;
            }
            return c(fArr, 0, i12);
        } catch (NumberFormatException e11) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e11);
        }
    }

    private static int i(String str, int i11) {
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i11++;
        }
        return i11;
    }

    public static void j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c11 = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c11, bVar.f84931a, bVar.f84932b);
            c11 = bVar.f84931a;
        }
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i11 = 0; i11 < bVarArr2.length; i11++) {
            bVarArr[i11].f84931a = bVarArr2[i11].f84931a;
            for (int i12 = 0; i12 < bVarArr2[i11].f84932b.length; i12++) {
                bVarArr[i11].f84932b[i12] = bVarArr2[i11].f84932b[i12];
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private char f84931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f84932b;

        b(char c11, float[] fArr) {
            this.f84931a = c11;
            this.f84932b = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(Path path, float[] fArr, char c11, char c12, float[] fArr2) {
            int i11;
            int i12;
            boolean z11;
            boolean z12;
            char c13;
            char c14;
            int i13;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f21;
            float f22;
            float f23;
            float f24;
            Path path2 = path;
            boolean z13 = false;
            float f25 = fArr[0];
            boolean z14 = true;
            float f26 = fArr[1];
            char c15 = 2;
            float f27 = fArr[2];
            char c16 = 3;
            float f28 = fArr[3];
            float f29 = fArr[4];
            float f31 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i11 = 7;
                    i12 = i11;
                    break;
                case 'C':
                case 'c':
                    i11 = 6;
                    i12 = i11;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i12 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i12 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i12 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f29, f31);
                    f25 = f29;
                    f27 = f25;
                    f26 = f31;
                    f28 = f26;
                    i12 = 2;
                    break;
            }
            float f32 = f25;
            float f33 = f26;
            float f34 = f29;
            float f35 = f31;
            int i14 = 0;
            char c17 = c11;
            while (i14 < fArr2.length) {
                if (c12 == 'A') {
                    z11 = z13;
                    z12 = z14;
                    c13 = c15;
                    c14 = c16;
                    i13 = i14;
                    int i15 = i13 + 5;
                    int i16 = i13 + 6;
                    g(path, f32, f33, fArr2[i15], fArr2[i16], fArr2[i13], fArr2[i13 + 1], fArr2[i13 + 2], fArr2[i13 + 3] != BitmapDescriptorFactory.HUE_RED ? z12 : z11, fArr2[i13 + 4] != 0 ? z12 : z11);
                    f27 = fArr2[i15];
                    f32 = f27;
                    f28 = fArr2[i16];
                    f33 = f28;
                } else if (c12 == 'C') {
                    z11 = z13;
                    z12 = z14;
                    c13 = c15;
                    c14 = c16;
                    i13 = i14;
                    int i17 = i13 + 2;
                    int i18 = i13 + 3;
                    int i19 = i13 + 4;
                    int i21 = i13 + 5;
                    path2.cubicTo(fArr2[i13], fArr2[i13 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i21]);
                    float f36 = fArr2[i19];
                    float f37 = fArr2[i21];
                    float f38 = fArr2[i17];
                    float f39 = fArr2[i18];
                    f32 = f36;
                    f33 = f37;
                    f28 = f39;
                    f27 = f38;
                } else if (c12 != 'H') {
                    if (c12 != 'Q') {
                        z11 = z13;
                        if (c12 == 'V') {
                            z12 = z14;
                            c13 = c15;
                            c14 = c16;
                            i13 = i14;
                            path2.lineTo(f32, fArr2[i13]);
                            f13 = fArr2[i13];
                        } else if (c12 != 'a') {
                            if (c12 != 'c') {
                                z12 = z14;
                                if (c12 != 'h') {
                                    if (c12 != 'q') {
                                        c13 = c15;
                                        if (c12 != 'v') {
                                            if (c12 != 'L') {
                                                if (c12 != 'M') {
                                                    c14 = c16;
                                                    if (c12 == 'S') {
                                                        if (c17 == 'c' || c17 == 's' || c17 == 'C' || c17 == 'S') {
                                                            f32 = (f32 * 2.0f) - f27;
                                                            f33 = (f33 * 2.0f) - f28;
                                                        }
                                                        float f41 = f32;
                                                        float f42 = f33;
                                                        int i22 = i14 + 1;
                                                        int i23 = i14 + 2;
                                                        int i24 = i14 + 3;
                                                        path2.cubicTo(f41, f42, fArr2[i14], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                        f11 = fArr2[i14];
                                                        f12 = fArr2[i22];
                                                        f32 = fArr2[i23];
                                                        f33 = fArr2[i24];
                                                        i13 = i14;
                                                    } else if (c12 == 'T') {
                                                        if (c17 == 'q' || c17 == 't' || c17 == 'Q' || c17 == 'T') {
                                                            f32 = (f32 * 2.0f) - f27;
                                                            f33 = (f33 * 2.0f) - f28;
                                                        }
                                                        int i25 = i14 + 1;
                                                        path2.quadTo(f32, f33, fArr2[i14], fArr2[i25]);
                                                        float f43 = fArr2[i14];
                                                        f13 = fArr2[i25];
                                                        f27 = f32;
                                                        f28 = f33;
                                                        i13 = i14;
                                                        f32 = f43;
                                                    } else if (c12 == 'l') {
                                                        int i26 = i14 + 1;
                                                        path2.rLineTo(fArr2[i14], fArr2[i26]);
                                                        f32 += fArr2[i14];
                                                        f17 = fArr2[i26];
                                                    } else if (c12 == 'm') {
                                                        float f44 = fArr2[i14];
                                                        f32 += f44;
                                                        float f45 = fArr2[i14 + 1];
                                                        f33 += f45;
                                                        if (i14 > 0) {
                                                            path2.rLineTo(f44, f45);
                                                        } else {
                                                            path2.rMoveTo(f44, f45);
                                                            f34 = f32;
                                                        }
                                                    } else if (c12 == 's') {
                                                        if (c17 == 'c' || c17 == 's' || c17 == 'C' || c17 == 'S') {
                                                            f21 = f33 - f28;
                                                            f22 = f32 - f27;
                                                        } else {
                                                            f22 = BitmapDescriptorFactory.HUE_RED;
                                                            f21 = BitmapDescriptorFactory.HUE_RED;
                                                        }
                                                        int i27 = i14 + 1;
                                                        int i28 = i14 + 2;
                                                        int i29 = i14 + 3;
                                                        path2.rCubicTo(f22, f21, fArr2[i14], fArr2[i27], fArr2[i28], fArr2[i29]);
                                                        f14 = fArr2[i14] + f32;
                                                        f15 = fArr2[i27] + f33;
                                                        f32 += fArr2[i28];
                                                        f16 = fArr2[i29];
                                                    } else if (c12 == 't') {
                                                        if (c17 == 'q' || c17 == 't' || c17 == 'Q' || c17 == 'T') {
                                                            f23 = f32 - f27;
                                                            f24 = f33 - f28;
                                                        } else {
                                                            f24 = BitmapDescriptorFactory.HUE_RED;
                                                            f23 = BitmapDescriptorFactory.HUE_RED;
                                                        }
                                                        int i31 = i14 + 1;
                                                        path2.rQuadTo(f23, f24, fArr2[i14], fArr2[i31]);
                                                        float f46 = f23 + f32;
                                                        float f47 = f24 + f33;
                                                        f32 += fArr2[i14];
                                                        f33 += fArr2[i31];
                                                        f28 = f47;
                                                        f27 = f46;
                                                    }
                                                } else {
                                                    c14 = c16;
                                                    f18 = fArr2[i14];
                                                    f19 = fArr2[i14 + 1];
                                                    if (i14 > 0) {
                                                        path2.lineTo(f18, f19);
                                                    } else {
                                                        path2.moveTo(f18, f19);
                                                        f32 = f18;
                                                        f34 = f32;
                                                        f33 = f19;
                                                    }
                                                }
                                                f35 = f33;
                                            } else {
                                                c14 = c16;
                                                int i32 = i14 + 1;
                                                path2.lineTo(fArr2[i14], fArr2[i32]);
                                                f18 = fArr2[i14];
                                                f19 = fArr2[i32];
                                            }
                                            f32 = f18;
                                            f33 = f19;
                                        } else {
                                            c14 = c16;
                                            path2.rLineTo(BitmapDescriptorFactory.HUE_RED, fArr2[i14]);
                                            f17 = fArr2[i14];
                                        }
                                        f33 += f17;
                                    } else {
                                        c13 = c15;
                                        c14 = c16;
                                        int i33 = i14 + 1;
                                        int i34 = i14 + 2;
                                        int i35 = i14 + 3;
                                        path2.rQuadTo(fArr2[i14], fArr2[i33], fArr2[i34], fArr2[i35]);
                                        f14 = fArr2[i14] + f32;
                                        f15 = fArr2[i33] + f33;
                                        f32 += fArr2[i34];
                                        f16 = fArr2[i35];
                                    }
                                    f33 += f16;
                                    f27 = f14;
                                    f28 = f15;
                                } else {
                                    c13 = c15;
                                    c14 = c16;
                                    path2.rLineTo(fArr2[i14], BitmapDescriptorFactory.HUE_RED);
                                    f32 += fArr2[i14];
                                }
                            } else {
                                z12 = z14;
                                c13 = c15;
                                c14 = c16;
                                int i36 = i14 + 2;
                                int i37 = i14 + 3;
                                int i38 = i14 + 4;
                                int i39 = i14 + 5;
                                path2.rCubicTo(fArr2[i14], fArr2[i14 + 1], fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                                float f48 = fArr2[i36] + f32;
                                float f49 = fArr2[i37] + f33;
                                f32 += fArr2[i38];
                                f33 += fArr2[i39];
                                f27 = f48;
                                f28 = f49;
                            }
                            i13 = i14;
                        } else {
                            z12 = z14;
                            c13 = c15;
                            c14 = c16;
                            int i41 = i14 + 5;
                            int i42 = i14 + 6;
                            i13 = i14;
                            float f51 = f32;
                            g(path, f51, f33, fArr2[i41] + f32, fArr2[i42] + f33, fArr2[i14], fArr2[i14 + 1], fArr2[i14 + 2], fArr2[i14 + 3] != BitmapDescriptorFactory.HUE_RED ? z12 : z11, fArr2[i14 + 4] != 0 ? z12 : z11);
                            f32 = f51 + fArr2[i41];
                            f33 += fArr2[i42];
                            f27 = f32;
                            f28 = f33;
                        }
                        f33 = f13;
                    } else {
                        z11 = z13;
                        z12 = z14;
                        c13 = c15;
                        c14 = c16;
                        i13 = i14;
                        int i43 = i13 + 1;
                        int i44 = i13 + 2;
                        int i45 = i13 + 3;
                        path2.quadTo(fArr2[i13], fArr2[i43], fArr2[i44], fArr2[i45]);
                        f11 = fArr2[i13];
                        f12 = fArr2[i43];
                        f32 = fArr2[i44];
                        f33 = fArr2[i45];
                    }
                    f27 = f11;
                    f28 = f12;
                } else {
                    z11 = z13;
                    z12 = z14;
                    c13 = c15;
                    c14 = c16;
                    i13 = i14;
                    path2.lineTo(fArr2[i13], f33);
                    f32 = fArr2[i13];
                }
                i14 = i13 + i12;
                path2 = path;
                c17 = c12;
                z13 = z11;
                z14 = z12;
                c15 = c13;
                c16 = c14;
            }
            fArr[z13 ? 1 : 0] = f32;
            fArr[z14 ? 1 : 0] = f33;
            fArr[c15] = f27;
            fArr[c16] = f28;
            fArr[4] = f34;
            fArr[5] = f35;
        }

        private static void f(Path path, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
            double d21 = d13;
            int iCeil = (int) Math.ceil(Math.abs((d19 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d17);
            double dSin = Math.sin(d17);
            double dCos2 = Math.cos(d18);
            double dSin2 = Math.sin(d18);
            double d22 = -d21;
            double d23 = d22 * dCos;
            double d24 = d14 * dSin;
            double d25 = (d23 * dSin2) - (d24 * dCos2);
            double d26 = d22 * dSin;
            double d27 = d14 * dCos;
            double d28 = (dSin2 * d26) + (dCos2 * d27);
            double d29 = d19 / ((double) iCeil);
            double d31 = d28;
            double d32 = d25;
            int i11 = 0;
            double d33 = d15;
            double d34 = d16;
            double d35 = d18;
            while (i11 < iCeil) {
                double d36 = d35 + d29;
                double dSin3 = Math.sin(d36);
                double dCos3 = Math.cos(d36);
                double d37 = (d11 + ((d21 * dCos) * dCos3)) - (d24 * dSin3);
                int i12 = i11;
                double d38 = d12 + (d13 * dSin * dCos3) + (d27 * dSin3);
                double d39 = (d23 * dSin3) - (d24 * dCos3);
                double d41 = (dSin3 * d26) + (dCos3 * d27);
                double d42 = d36 - d35;
                double dTan = Math.tan(d42 / 2.0d);
                double dSin4 = (Math.sin(d42) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d43 = d33 + (d32 * dSin4);
                path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                path.cubicTo((float) d43, (float) (d34 + (d31 * dSin4)), (float) (d37 - (dSin4 * d39)), (float) (d38 - (dSin4 * d41)), (float) d37, (float) d38);
                dSin = dSin;
                d29 = d29;
                d33 = d37;
                d26 = d26;
                d35 = d36;
                d31 = d41;
                dCos = dCos;
                d21 = d13;
                d34 = d38;
                i11 = i12 + 1;
                iCeil = iCeil;
                d32 = d39;
            }
        }

        private static void g(Path path, float f11, float f12, float f13, float f14, float f15, float f16, float f17, boolean z11, boolean z12) {
            double d11;
            double d12;
            double radians = Math.toRadians(f17);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d13 = f11;
            double d14 = f12;
            double d15 = f15;
            double d16 = ((d13 * dCos) + (d14 * dSin)) / d15;
            double d17 = f16;
            double d18 = ((((double) (-f11)) * dSin) + (d14 * dCos)) / d17;
            double d19 = f14;
            double d21 = ((((double) f13) * dCos) + (d19 * dSin)) / d15;
            double d22 = ((((double) (-f13)) * dSin) + (d19 * dCos)) / d17;
            double d23 = d16 - d21;
            double d24 = d18 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d18 + d22) / 2.0d;
            double d27 = (d23 * d23) + (d24 * d24);
            if (d27 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d27);
                float fSqrt = (float) (Math.sqrt(d27) / 1.99999d);
                g(path, f11, f12, f13, f14, f15 * fSqrt, fSqrt * f16, f17, z11, z12);
                return;
            }
            double dSqrt = Math.sqrt(d28);
            double d29 = d23 * dSqrt;
            double d31 = dSqrt * d24;
            if (z11 == z12) {
                d11 = d25 - d31;
                d12 = d26 + d29;
            } else {
                d11 = d25 + d31;
                d12 = d26 - d29;
            }
            double dAtan2 = Math.atan2(d18 - d12, d16 - d11);
            double dAtan3 = Math.atan2(d22 - d12, d21 - d11) - dAtan2;
            if (z12 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d32 = d11 * d15;
            double d33 = d12 * d17;
            f(path, (d32 * dCos) - (d33 * dSin), (d32 * dSin) + (d33 * dCos), d15, d17, d13, d14, radians, dAtan2, dAtan3);
        }

        @Deprecated
        public static void h(b[] bVarArr, Path path) {
            g.j(bVarArr, path);
        }

        b(b bVar) {
            this.f84931a = bVar.f84931a;
            float[] fArr = bVar.f84932b;
            this.f84932b = g.c(fArr, 0, fArr.length);
        }
    }
}
