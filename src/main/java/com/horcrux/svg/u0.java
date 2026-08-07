package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class u0 extends h1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Path f45510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    String f45511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private v0 f45512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList<String> f45513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ArrayList<Matrix> f45514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AssetManager f45515v;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f45517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f45518c;

        static {
            int[] iArr = new int[w0.values().length];
            f45518c = iArr;
            try {
                iArr[w0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45518c[w0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45518c[w0.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45518c[w0.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45518c[w0.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45518c[w0.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45518c[w0.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45518c[w0.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45518c[w0.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45518c[w0.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45518c[w0.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45518c[w0.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45518c[w0.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45518c[w0.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45518c[w0.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45518c[w0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[c1.values().length];
            f45517b = iArr2;
            try {
                iArr2[c1.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f45517b[c1.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[a1.values().length];
            f45516a = iArr3;
            try {
                iArr3[a1.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f45516a[a1.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f45516a[a1.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public u0(ReactContext reactContext) {
        super(reactContext);
        this.f45513t = new ArrayList<>();
        this.f45514u = new ArrayList<>();
        this.f45515v = this.mContext.getResources().getAssets();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0295 A[PHI: r0
      0x0295: PHI (r0v9 double) = 
      (r0v8 double)
      (r0v8 double)
      (r0v8 double)
      (r0v8 double)
      (r0v8 double)
      (r0v36 double)
      (r0v37 double)
      (r0v8 double)
      (r0v8 double)
      (r0v8 double)
      (r0v42 double)
      (r0v43 double)
     binds: [B:78:0x0238, B:80:0x023e, B:82:0x024a, B:84:0x024e, B:101:0x0281, B:126:0x0301, B:115:0x02d4, B:104:0x0299, B:106:0x029f, B:108:0x02a5, B:113:0x02c1, B:102:0x0284] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:115:0x02d4 A[PHI: r31
      0x02d4: PHI (r31v4 double) = (r31v3 double), (r31v3 double), (r31v5 double) binds: [B:123:0x02f3, B:125:0x02ff, B:114:0x02d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:129:0x0328  */
    /* JADX WARN: Code duplicated, block: B:131:0x0332  */
    /* JADX WARN: Code duplicated, block: B:132:0x0339  */
    /* JADX WARN: Code duplicated, block: B:135:0x0345  */
    /* JADX WARN: Code duplicated, block: B:141:0x0375  */
    /* JADX WARN: Code duplicated, block: B:144:0x0382  */
    /* JADX WARN: Code duplicated, block: B:145:0x0384  */
    /* JADX WARN: Code duplicated, block: B:147:0x0387  */
    /* JADX WARN: Code duplicated, block: B:148:0x038a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0392  */
    /* JADX WARN: Code duplicated, block: B:152:0x0397  */
    /* JADX WARN: Code duplicated, block: B:155:0x03b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:196:0x0368 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /* JADX WARN: Code duplicated, block: B:41:0x0119  */
    /* JADX WARN: Code duplicated, block: B:44:0x0143  */
    /* JADX WARN: Code duplicated, block: B:46:0x0149  */
    /* JADX WARN: Code duplicated, block: B:47:0x014b  */
    /* JADX WARN: Code duplicated, block: B:49:0x015c  */
    /* JADX WARN: Code duplicated, block: B:4:0x001b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:54:0x0188  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01af  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0204  */
    /* JADX WARN: Code duplicated, block: B:67:0x0206 A[PHI: r0
      0x0206: PHI (r0v55 double) = (r0v6 double), (r0v50 double), (r0v51 double), (r0v52 double), (r0v53 double), (r0v54 double), (r0v56 double) binds: [B:65:0x0201, B:74:0x021a, B:72:0x0215, B:70:0x020d, B:69:0x020a, B:68:0x0208, B:66:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0208  */
    /* JADX WARN: Code duplicated, block: B:69:0x020a  */
    /* JADX WARN: Code duplicated, block: B:70:0x020d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0210  */
    /* JADX WARN: Code duplicated, block: B:73:0x0217  */
    /* JADX WARN: Code duplicated, block: B:74:0x021a  */
    /* JADX WARN: Code duplicated, block: B:75:0x021e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0232  */
    /* JADX WARN: Code duplicated, block: B:77:0x0235  */
    /* JADX WARN: Code duplicated, block: B:79:0x023a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0088, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00bd, please report this as an issue */
    private Path A(String str, Paint paint, Canvas canvas) {
        PathMeasure pathMeasure;
        boolean z11;
        double length;
        a0 a0Var;
        boolean z12;
        int i11;
        float[] fArr;
        a1 a1Var;
        double dT;
        double dC;
        double dC2;
        u0 u0Var;
        double d11;
        boolean z13;
        a0 a0Var2;
        double d12;
        boolean z14;
        b0 b0Var;
        float[] fArr2;
        boolean[] zArr;
        double d13;
        double d14;
        int i12;
        boolean z15;
        double d15;
        SVGLength sVGLength;
        double d16;
        double d17;
        double d18;
        double dB;
        double d19;
        double d21;
        String strR;
        w0 w0VarQ;
        byte b11;
        double d22;
        Matrix matrix;
        float[] fArr3;
        float[] fArr4;
        int i13;
        char c11;
        String strValueOf;
        boolean z16;
        int i14;
        boolean z17;
        float f11;
        int i15;
        int i16;
        double dMeasureText;
        boolean z18;
        double d23;
        double d24;
        double d25;
        Canvas canvas2;
        int i17;
        b0 b0Var2;
        Matrix matrix2;
        Paint paint2;
        Path path;
        float f12;
        char c12;
        double d26;
        String str2;
        Path pathB;
        int i18;
        int i19;
        double d27;
        double dA;
        boolean z19;
        int i21;
        double dZ;
        double d28;
        double d29;
        double d31;
        Paint paint3 = paint;
        Canvas canvas3 = canvas;
        int length2 = str.length();
        Path path2 = new Path();
        this.f45513t.clear();
        this.f45514u.clear();
        if (length2 != 0) {
            boolean z21 = this.f45512s != null;
            if (z21) {
                pathMeasure = new PathMeasure(this.f45512s.z(canvas3, paint3), false);
                length = pathMeasure.getLength();
                boolean zIsClosed = pathMeasure.isClosed();
                if (length != 0.0d) {
                    z11 = zIsClosed;
                }
            } else {
                pathMeasure = null;
                z11 = false;
                length = 0.0d;
            }
            PathMeasure pathMeasure2 = pathMeasure;
            a0 a0VarL = l();
            y yVarB = a0VarL.b();
            x(paint3, yVarB);
            b0 b0Var3 = new b0(paint3);
            double d32 = 0.0d;
            boolean[] zArr2 = new boolean[length2];
            char[] charArray = str.toCharArray();
            double d33 = yVarB.f45541l;
            double d34 = yVarB.f45542m;
            double d35 = yVarB.f45543n;
            boolean z22 = yVarB.f45544o;
            if (d35 == 0.0d) {
                a0Var = a0VarL;
                z12 = yVarB.f45538i == y0.normal;
                i11 = Build.VERSION.SDK_INT;
                if (z12) {
                    paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + yVarB.f45536g);
                } else {
                    paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + yVarB.f45536g);
                }
                if (i11 >= 26) {
                    paint3.setFontVariationSettings("'wght' " + yVarB.f45535f + yVarB.f45537h);
                }
                ReadableMap readableMap = yVarB.f45533d;
                fArr = new float[length2];
                paint3.getTextWidths(str, fArr);
                a1Var = yVarB.f45539j;
                dT = u().t(paint3);
                dC = C(a1Var, dT);
                dC2 = a0Var.c();
                byte b12 = -1;
                if (z21) {
                    if (this.f45512s.w() == e1.sharp) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (this.f45512s.x() == f1.right) {
                        i21 = -1;
                    } else {
                        i21 = 1;
                    }
                    d11 = dT;
                    z13 = z22;
                    a0Var2 = a0Var;
                    double d36 = length;
                    fArr2 = fArr;
                    z14 = z21;
                    zArr = zArr2;
                    b0Var = b0Var3;
                    dZ = z(this.f45512s.y(), d36, dC2);
                    u0Var = this;
                    d13 = d36;
                    d28 = dC + dZ;
                    d12 = dC2;
                    if (z11) {
                        d29 = d13 / 2.0d;
                        if (a1Var == a1.middle) {
                            d31 = -d29;
                        } else {
                            d31 = 0.0d;
                        }
                        double d37 = dZ + d31;
                        d14 = d28;
                        d32 = d37;
                        z15 = z19;
                        d15 = d37 + d13;
                        i12 = i21;
                    } else {
                        d14 = d28;
                        z15 = z19;
                        i12 = i21;
                    }
                    sVGLength = u0Var.f45396g;
                    d16 = 1.0d;
                    if (sVGLength != null) {
                        dA = n0.a(sVGLength, canvas3.getWidth(), 0.0d, u0Var.mScale, d12);
                        if (dA >= 0.0d) {
                            throw new IllegalArgumentException("Negative textLength value");
                        }
                        if (a.f45517b[u0Var.f45398i.ordinal()] != 2) {
                            d35 += (dA - d11) / ((double) (length2 - 1));
                        } else {
                            d16 = dA / d11;
                        }
                    }
                    double d38 = i12;
                    boolean z23 = z15;
                    Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
                    int i22 = i12;
                    double d39 = d16 * d38;
                    d17 = fontMetrics.descent;
                    float f13 = fontMetrics.leading;
                    double d41 = d13;
                    d18 = ((double) f13) + d17;
                    dB = (-fontMetrics.ascent) + f13;
                    d19 = -fontMetrics.top;
                    d21 = d19 + d18;
                    strR = u0Var.r();
                    w0VarQ = u0Var.q();
                    if (w0VarQ != null) {
                        switch (a.f45518c[w0VarQ.ordinal()]) {
                            case 2:
                            case 3:
                            case 4:
                            case 6:
                                b11 = 0;
                                dB = -d17;
                                break;
                            case 5:
                                b11 = 0;
                                dB = 0.0d;
                                break;
                            case 7:
                                Rect rect = new Rect();
                                b11 = 0;
                                paint3.getTextBounds("x", 0, 1, rect);
                                dB = ((double) rect.height()) / 2.0d;
                                break;
                            case 8:
                                dB = (dB - d17) / 2.0d;
                                b11 = 0;
                                break;
                            case 9:
                                d27 = 0.5d;
                                dB *= d27;
                                b11 = 0;
                                break;
                            case 10:
                                d27 = 0.8d;
                                dB *= d27;
                                b11 = 0;
                                break;
                            case 11:
                            case 12:
                            case 13:
                                b11 = 0;
                                break;
                            case 14:
                                dB = d18;
                                b11 = 0;
                                break;
                            case 15:
                                dB = d21 / 2.0d;
                                b11 = 0;
                                break;
                            case 16:
                                dB = d19;
                                b11 = 0;
                                break;
                            default:
                                dB = 0.0d;
                                b11 = 0;
                                break;
                        }
                    } else {
                        b11 = 0;
                        dB = 0.0d;
                    }
                    if (strR == null && !strR.isEmpty() && (i19 = a.f45518c[w0VarQ.ordinal()]) != 14 && i19 != 16) {
                        switch (strR.hashCode()) {
                            case -1720785339:
                                if (strR.equals("baseline")) {
                                    b12 = b11;
                                }
                                break;
                            case 114240:
                                if (strR.equals("sub")) {
                                    b12 = 1;
                                }
                                break;
                            case 109801339:
                                if (strR.equals("super")) {
                                    b12 = 2;
                                }
                                break;
                        }
                        switch (b12) {
                            case 0:
                                d22 = dB;
                                break;
                            case 1:
                                d22 = dB;
                                if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                    int i23 = readableMap.getInt("unitsPerEm");
                                    ReadableMap map = readableMap.getMap("tables");
                                    if (map.hasKey("os2")) {
                                        ReadableMap map2 = map.getMap("os2");
                                        if (map2.hasKey("ySubscriptYOffset")) {
                                            dB = d22 + (((((double) u0Var.mScale) * d12) * map2.getDouble("ySubscriptYOffset")) / ((double) i23));
                                        } else {
                                            dB = d22;
                                        }
                                    } else {
                                        dB = d22;
                                    }
                                    d22 = dB;
                                }
                                break;
                            case 2:
                                if (readableMap != null && readableMap.hasKey("tables") && readableMap.hasKey("unitsPerEm")) {
                                    int i24 = readableMap.getInt("unitsPerEm");
                                    ReadableMap map3 = readableMap.getMap("tables");
                                    if (map3.hasKey("os2")) {
                                        ReadableMap map4 = map3.getMap("os2");
                                        if (map4.hasKey("ySuperscriptYOffset")) {
                                            dB -= ((((double) u0Var.mScale) * d12) * map4.getDouble("ySuperscriptYOffset")) / ((double) i24);
                                        }
                                    }
                                    d22 = dB;
                                    dB = d22;
                                }
                                d22 = dB;
                                break;
                            default:
                                float f14 = u0Var.mScale;
                                dB -= n0.b(strR, ((double) f14) * d12, f14, d12);
                                d22 = dB;
                                break;
                        }
                    } else {
                        d22 = dB;
                    }
                    Matrix matrix3 = new Matrix();
                    matrix = new Matrix();
                    Matrix matrix4 = new Matrix();
                    fArr3 = new float[9];
                    fArr4 = new float[9];
                    i13 = 0;
                    while (i13 < length2) {
                        c11 = charArray[i13];
                        strValueOf = String.valueOf(c11);
                        z16 = zArr[i13];
                        if (z16) {
                            strValueOf = "";
                            z17 = false;
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        } else {
                            i14 = i13;
                            z17 = false;
                            f11 = BitmapDescriptorFactory.HUE_RED;
                            while (true) {
                                i15 = i14 + 1;
                                if (i15 >= length2 && fArr2[i15] <= BitmapDescriptorFactory.HUE_RED) {
                                    strValueOf = strValueOf + charArray[i15];
                                    zArr[i15] = true;
                                    i14 = i15;
                                    z17 = true;
                                }
                            }
                        }
                        i16 = i13;
                        dMeasureText = ((double) paint3.measureText(strValueOf)) * d16;
                        if (!z13) {
                            d33 = (((double) fArr2[i16]) * d16) - dMeasureText;
                        }
                        if (c11 == ' ') {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            d23 = d34;
                        } else {
                            d23 = 0.0d;
                        }
                        d24 = dMeasureText + d23 + d35;
                        if (z16) {
                            d25 = 0.0d;
                        } else {
                            d25 = d33 + d24;
                        }
                        double dL = a0Var2.l(d25);
                        double dM = a0Var2.m();
                        double dI = a0Var2.i();
                        double dJ = a0Var2.j();
                        String str3 = strValueOf;
                        double dK = a0Var2.k();
                        if (!z16 || z18) {
                            fArr4 = fArr4;
                            canvas2 = canvas3;
                            i17 = length2;
                            a0Var2 = a0Var2;
                            b0Var2 = b0Var;
                            matrix2 = matrix;
                            this = this;
                            paint2 = paint;
                            fArr3 = fArr3;
                            path = path2;
                        } else {
                            double d42 = dMeasureText * d38;
                            i17 = length2;
                            Path path3 = path2;
                            double d43 = (d14 + ((dL + dI) * d38)) - (d24 * d38);
                            if (z14) {
                                double d44 = d43 + d42;
                                double d45 = d42 / 2.0d;
                                double d46 = d43 + d45;
                                if (d46 <= d15 && d46 >= d32) {
                                    if (z23) {
                                        pathMeasure2.getMatrix((float) d46, matrix, 3);
                                        b0Var = b0Var;
                                        matrix2 = matrix;
                                        d26 = d41;
                                        c12 = 2;
                                    } else {
                                        if (d43 < 0.0d) {
                                            float f15 = f11;
                                            pathMeasure2.getMatrix(f15, matrix3, 3);
                                            matrix3.preTranslate((float) d43, f15);
                                            i18 = 1;
                                        } else {
                                            i18 = 1;
                                            pathMeasure2.getMatrix((float) d43, matrix3, 1);
                                        }
                                        pathMeasure2.getMatrix((float) d46, matrix, i18);
                                        if (d44 > d41) {
                                            d26 = d41;
                                            pathMeasure2.getMatrix((float) d26, matrix4, 3);
                                            matrix4.preTranslate((float) (d44 - d26), BitmapDescriptorFactory.HUE_RED);
                                        } else {
                                            d26 = d41;
                                            pathMeasure2.getMatrix((float) d44, matrix4, i18);
                                        }
                                        matrix3.getValues(fArr3);
                                        matrix4.getValues(fArr4);
                                        c12 = 2;
                                        matrix2 = matrix;
                                        matrix2.preRotate((float) (Math.atan2(((double) fArr4[5]) - ((double) fArr3[5]), ((double) fArr4[2]) - ((double) fArr3[2])) * 57.29577951308232d * d38));
                                    }
                                    matrix2.preTranslate((float) (-d45), (float) (dJ + d22));
                                    d39 = d39;
                                    i22 = i22;
                                    matrix2.preScale((float) d39, i22);
                                    f12 = BitmapDescriptorFactory.HUE_RED;
                                    matrix2.postTranslate(BitmapDescriptorFactory.HUE_RED, (float) dM);
                                } else {
                                    this = this;
                                    canvas2 = canvas;
                                    fArr4 = fArr4;
                                    fArr3 = fArr3;
                                    a0Var2 = a0Var2;
                                    b0Var2 = b0Var;
                                    matrix2 = matrix;
                                    path = path3;
                                    paint2 = paint;
                                }
                            } else {
                                fArr4 = fArr4;
                                b0Var = b0Var;
                                matrix2 = matrix;
                                f12 = f11;
                                d39 = d39;
                                c12 = 2;
                                d26 = d41;
                                fArr3 = fArr3;
                                i22 = i22;
                                matrix2.setTranslate((float) d43, (float) (dM + dJ + d22));
                            }
                            matrix2.preRotate((float) dK);
                            if (z17) {
                                pathB = new Path();
                                d41 = d26;
                                paint2 = paint;
                                str2 = str3;
                                paint2.getTextPath(str2, 0, str3.length(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, pathB);
                                b0Var2 = b0Var;
                            } else {
                                paint2 = paint;
                                str2 = str3;
                                d41 = d26;
                                b0Var2 = b0Var;
                                pathB = b0Var2.b(c11, str2);
                            }
                            RectF rectF = new RectF();
                            pathB.computeBounds(rectF, true);
                            if (rectF.width() == f12) {
                                canvas.save();
                                canvas2 = canvas;
                                canvas2.concat(matrix2);
                                this.f45513t.add(str2);
                                this.f45514u.add(new Matrix(matrix2));
                                canvas2.drawText(str2, f12, f12, paint2);
                                canvas2.restore();
                                path = path3;
                            } else {
                                canvas2 = canvas;
                                pathB.transform(matrix2);
                                path = path3;
                                path.addPath(pathB);
                            }
                        }
                        paint3 = paint2;
                        path2 = path;
                        b0Var = b0Var2;
                        u0Var = this;
                        fArr3 = fArr3;
                        matrix = matrix2;
                        length2 = i17;
                        a0Var2 = a0Var2;
                        fArr4 = fArr4;
                        canvas3 = canvas2;
                        i13 = i16 + 1;
                    }
                } else {
                    u0Var = this;
                    d11 = dT;
                    z13 = z22;
                    a0Var2 = a0Var;
                    d12 = dC2;
                    z14 = z21;
                    b0Var = b0Var3;
                    fArr2 = fArr;
                    zArr = zArr2;
                    d13 = length;
                    d14 = dC;
                    i12 = 1;
                    z15 = false;
                }
                d15 = d13;
                sVGLength = u0Var.f45396g;
                d16 = 1.0d;
                if (sVGLength != null) {
                    dA = n0.a(sVGLength, canvas3.getWidth(), 0.0d, u0Var.mScale, d12);
                    if (dA >= 0.0d) {
                        throw new IllegalArgumentException("Negative textLength value");
                    }
                    if (a.f45517b[u0Var.f45398i.ordinal()] != 2) {
                        d35 += (dA - d11) / ((double) (length2 - 1));
                    } else {
                        d16 = dA / d11;
                    }
                }
                double d310 = i12;
                boolean z24 = z15;
                Paint.FontMetrics fontMetrics2 = paint3.getFontMetrics();
                int i25 = i12;
                double d311 = d16 * d310;
                d17 = fontMetrics2.descent;
                float f16 = fontMetrics2.leading;
                double d47 = d13;
                d18 = ((double) f16) + d17;
                dB = (-fontMetrics2.ascent) + f16;
                d19 = -fontMetrics2.top;
                d21 = d19 + d18;
                strR = u0Var.r();
                w0VarQ = u0Var.q();
                if (w0VarQ != null) {
                    switch (a.f45518c[w0VarQ.ordinal()]) {
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                            b11 = 0;
                            dB = -d17;
                            break;
                        case 5:
                            b11 = 0;
                            dB = 0.0d;
                            break;
                        case 7:
                            Rect rect2 = new Rect();
                            b11 = 0;
                            paint3.getTextBounds("x", 0, 1, rect2);
                            dB = ((double) rect2.height()) / 2.0d;
                            break;
                        case 8:
                            dB = (dB - d17) / 2.0d;
                            b11 = 0;
                            break;
                        case 9:
                            d27 = 0.5d;
                            dB *= d27;
                            b11 = 0;
                            break;
                        case 10:
                            d27 = 0.8d;
                            dB *= d27;
                            b11 = 0;
                            break;
                        case 11:
                        case 12:
                        case 13:
                            b11 = 0;
                            break;
                        case 14:
                            dB = d18;
                            b11 = 0;
                            break;
                        case 15:
                            dB = d21 / 2.0d;
                            b11 = 0;
                            break;
                        case 16:
                            dB = d19;
                            b11 = 0;
                            break;
                        default:
                            dB = 0.0d;
                            b11 = 0;
                            break;
                    }
                } else {
                    b11 = 0;
                    dB = 0.0d;
                }
                if (strR == null) {
                    d22 = dB;
                } else {
                    d22 = dB;
                }
                Matrix matrix5 = new Matrix();
                matrix = new Matrix();
                Matrix matrix6 = new Matrix();
                fArr3 = new float[9];
                fArr4 = new float[9];
                i13 = 0;
                while (i13 < length2) {
                    c11 = charArray[i13];
                    strValueOf = String.valueOf(c11);
                    z16 = zArr[i13];
                    if (z16) {
                        strValueOf = "";
                        z17 = false;
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        i14 = i13;
                        z17 = false;
                        f11 = BitmapDescriptorFactory.HUE_RED;
                        while (true) {
                            i15 = i14 + 1;
                            if (i15 >= length2) {
                            }
                            strValueOf = strValueOf + charArray[i15];
                            zArr[i15] = true;
                            i14 = i15;
                            z17 = true;
                        }
                    }
                    i16 = i13;
                    dMeasureText = ((double) paint3.measureText(strValueOf)) * d16;
                    if (!z13) {
                        d33 = (((double) fArr2[i16]) * d16) - dMeasureText;
                    }
                    if (c11 == ' ') {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        d23 = d34;
                    } else {
                        d23 = 0.0d;
                    }
                    d24 = dMeasureText + d23 + d35;
                    if (z16) {
                        d25 = 0.0d;
                    } else {
                        d25 = d33 + d24;
                    }
                    double dL2 = a0Var2.l(d25);
                    double dM2 = a0Var2.m();
                    double dI2 = a0Var2.i();
                    double dJ2 = a0Var2.j();
                    String str4 = strValueOf;
                    double dK2 = a0Var2.k();
                    if (z16) {
                        fArr4 = fArr4;
                        canvas2 = canvas3;
                        i17 = length2;
                        a0Var2 = a0Var2;
                        b0Var2 = b0Var;
                        matrix2 = matrix;
                        this = this;
                        paint2 = paint;
                        fArr3 = fArr3;
                        path = path2;
                    } else {
                        fArr4 = fArr4;
                        canvas2 = canvas3;
                        i17 = length2;
                        a0Var2 = a0Var2;
                        b0Var2 = b0Var;
                        matrix2 = matrix;
                        this = this;
                        paint2 = paint;
                        fArr3 = fArr3;
                        path = path2;
                    }
                    paint3 = paint2;
                    path2 = path;
                    b0Var = b0Var2;
                    u0Var = this;
                    fArr3 = fArr3;
                    matrix = matrix2;
                    length2 = i17;
                    a0Var2 = a0Var2;
                    fArr4 = fArr4;
                    canvas3 = canvas2;
                    i13 = i16 + 1;
                }
            } else {
                a0Var = a0VarL;
            }
            i11 = Build.VERSION.SDK_INT;
            if (z12) {
                paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + yVarB.f45536g);
            } else {
                paint3.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + yVarB.f45536g);
            }
            if (i11 >= 26) {
                paint3.setFontVariationSettings("'wght' " + yVarB.f45535f + yVarB.f45537h);
            }
            ReadableMap readableMap2 = yVarB.f45533d;
            fArr = new float[length2];
            paint3.getTextWidths(str, fArr);
            a1Var = yVarB.f45539j;
            dT = u().t(paint3);
            dC = C(a1Var, dT);
            dC2 = a0Var.c();
            byte b13 = -1;
            if (z21) {
                if (this.f45512s.w() == e1.sharp) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (this.f45512s.x() == f1.right) {
                    i21 = -1;
                } else {
                    i21 = 1;
                }
                d11 = dT;
                z13 = z22;
                a0Var2 = a0Var;
                double d312 = length;
                fArr2 = fArr;
                z14 = z21;
                zArr = zArr2;
                b0Var = b0Var3;
                dZ = z(this.f45512s.y(), d312, dC2);
                u0Var = this;
                d13 = d312;
                d28 = dC + dZ;
                d12 = dC2;
                if (z11) {
                    d29 = d13 / 2.0d;
                    if (a1Var == a1.middle) {
                        d31 = -d29;
                    } else {
                        d31 = 0.0d;
                    }
                    double d313 = dZ + d31;
                    d14 = d28;
                    d32 = d313;
                    z15 = z19;
                    d15 = d313 + d13;
                    i12 = i21;
                } else {
                    d14 = d28;
                    z15 = z19;
                    i12 = i21;
                }
                sVGLength = u0Var.f45396g;
                d16 = 1.0d;
                if (sVGLength != null) {
                    dA = n0.a(sVGLength, canvas3.getWidth(), 0.0d, u0Var.mScale, d12);
                    if (dA >= 0.0d) {
                        throw new IllegalArgumentException("Negative textLength value");
                    }
                    if (a.f45517b[u0Var.f45398i.ordinal()] != 2) {
                        d35 += (dA - d11) / ((double) (length2 - 1));
                    } else {
                        d16 = dA / d11;
                    }
                }
                double d314 = i12;
                boolean z25 = z15;
                Paint.FontMetrics fontMetrics3 = paint3.getFontMetrics();
                int i26 = i12;
                double d315 = d16 * d314;
                d17 = fontMetrics3.descent;
                float f17 = fontMetrics3.leading;
                double d48 = d13;
                d18 = ((double) f17) + d17;
                dB = (-fontMetrics3.ascent) + f17;
                d19 = -fontMetrics3.top;
                d21 = d19 + d18;
                strR = u0Var.r();
                w0VarQ = u0Var.q();
                if (w0VarQ != null) {
                    switch (a.f45518c[w0VarQ.ordinal()]) {
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                            b11 = 0;
                            dB = -d17;
                            break;
                        case 5:
                            b11 = 0;
                            dB = 0.0d;
                            break;
                        case 7:
                            Rect rect3 = new Rect();
                            b11 = 0;
                            paint3.getTextBounds("x", 0, 1, rect3);
                            dB = ((double) rect3.height()) / 2.0d;
                            break;
                        case 8:
                            dB = (dB - d17) / 2.0d;
                            b11 = 0;
                            break;
                        case 9:
                            d27 = 0.5d;
                            dB *= d27;
                            b11 = 0;
                            break;
                        case 10:
                            d27 = 0.8d;
                            dB *= d27;
                            b11 = 0;
                            break;
                        case 11:
                        case 12:
                        case 13:
                            b11 = 0;
                            break;
                        case 14:
                            dB = d18;
                            b11 = 0;
                            break;
                        case 15:
                            dB = d21 / 2.0d;
                            b11 = 0;
                            break;
                        case 16:
                            dB = d19;
                            b11 = 0;
                            break;
                        default:
                            dB = 0.0d;
                            b11 = 0;
                            break;
                    }
                } else {
                    b11 = 0;
                    dB = 0.0d;
                }
                if (strR == null) {
                    d22 = dB;
                } else {
                    d22 = dB;
                }
                Matrix matrix7 = new Matrix();
                matrix = new Matrix();
                Matrix matrix8 = new Matrix();
                fArr3 = new float[9];
                fArr4 = new float[9];
                i13 = 0;
                while (i13 < length2) {
                    c11 = charArray[i13];
                    strValueOf = String.valueOf(c11);
                    z16 = zArr[i13];
                    if (z16) {
                        strValueOf = "";
                        z17 = false;
                        f11 = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        i14 = i13;
                        z17 = false;
                        f11 = BitmapDescriptorFactory.HUE_RED;
                        while (true) {
                            i15 = i14 + 1;
                            if (i15 >= length2) {
                            }
                            strValueOf = strValueOf + charArray[i15];
                            zArr[i15] = true;
                            i14 = i15;
                            z17 = true;
                        }
                    }
                    i16 = i13;
                    dMeasureText = ((double) paint3.measureText(strValueOf)) * d16;
                    if (!z13) {
                        d33 = (((double) fArr2[i16]) * d16) - dMeasureText;
                    }
                    if (c11 == ' ') {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        d23 = d34;
                    } else {
                        d23 = 0.0d;
                    }
                    d24 = dMeasureText + d23 + d35;
                    if (z16) {
                        d25 = 0.0d;
                    } else {
                        d25 = d33 + d24;
                    }
                    double dL3 = a0Var2.l(d25);
                    double dM3 = a0Var2.m();
                    double dI3 = a0Var2.i();
                    double dJ3 = a0Var2.j();
                    String str5 = strValueOf;
                    double dK3 = a0Var2.k();
                    if (z16) {
                        fArr4 = fArr4;
                        canvas2 = canvas3;
                        i17 = length2;
                        a0Var2 = a0Var2;
                        b0Var2 = b0Var;
                        matrix2 = matrix;
                        this = this;
                        paint2 = paint;
                        fArr3 = fArr3;
                        path = path2;
                    } else {
                        fArr4 = fArr4;
                        canvas2 = canvas3;
                        i17 = length2;
                        a0Var2 = a0Var2;
                        b0Var2 = b0Var;
                        matrix2 = matrix;
                        this = this;
                        paint2 = paint;
                        fArr3 = fArr3;
                        path = path2;
                    }
                    paint3 = paint2;
                    path2 = path;
                    b0Var = b0Var2;
                    u0Var = this;
                    fArr3 = fArr3;
                    matrix = matrix2;
                    length2 = i17;
                    a0Var2 = a0Var2;
                    fArr4 = fArr4;
                    canvas3 = canvas2;
                    i13 = i16 + 1;
                }
            } else {
                u0Var = this;
                d11 = dT;
                z13 = z22;
                a0Var2 = a0Var;
                d12 = dC2;
                z14 = z21;
                b0Var = b0Var3;
                fArr2 = fArr;
                zArr = zArr2;
                d13 = length;
                d14 = dC;
                i12 = 1;
                z15 = false;
            }
            d15 = d13;
            sVGLength = u0Var.f45396g;
            d16 = 1.0d;
            if (sVGLength != null) {
                dA = n0.a(sVGLength, canvas3.getWidth(), 0.0d, u0Var.mScale, d12);
                if (dA >= 0.0d) {
                    throw new IllegalArgumentException("Negative textLength value");
                }
                if (a.f45517b[u0Var.f45398i.ordinal()] != 2) {
                    d35 += (dA - d11) / ((double) (length2 - 1));
                } else {
                    d16 = dA / d11;
                }
            }
            double d316 = i12;
            boolean z26 = z15;
            Paint.FontMetrics fontMetrics4 = paint3.getFontMetrics();
            int i27 = i12;
            double d317 = d16 * d316;
            d17 = fontMetrics4.descent;
            float f18 = fontMetrics4.leading;
            double d49 = d13;
            d18 = ((double) f18) + d17;
            dB = (-fontMetrics4.ascent) + f18;
            d19 = -fontMetrics4.top;
            d21 = d19 + d18;
            strR = u0Var.r();
            w0VarQ = u0Var.q();
            if (w0VarQ != null) {
                switch (a.f45518c[w0VarQ.ordinal()]) {
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                        b11 = 0;
                        dB = -d17;
                        break;
                    case 5:
                        b11 = 0;
                        dB = 0.0d;
                        break;
                    case 7:
                        Rect rect4 = new Rect();
                        b11 = 0;
                        paint3.getTextBounds("x", 0, 1, rect4);
                        dB = ((double) rect4.height()) / 2.0d;
                        break;
                    case 8:
                        dB = (dB - d17) / 2.0d;
                        b11 = 0;
                        break;
                    case 9:
                        d27 = 0.5d;
                        dB *= d27;
                        b11 = 0;
                        break;
                    case 10:
                        d27 = 0.8d;
                        dB *= d27;
                        b11 = 0;
                        break;
                    case 11:
                    case 12:
                    case 13:
                        b11 = 0;
                        break;
                    case 14:
                        dB = d18;
                        b11 = 0;
                        break;
                    case 15:
                        dB = d21 / 2.0d;
                        b11 = 0;
                        break;
                    case 16:
                        dB = d19;
                        b11 = 0;
                        break;
                    default:
                        dB = 0.0d;
                        b11 = 0;
                        break;
                }
            } else {
                b11 = 0;
                dB = 0.0d;
            }
            if (strR == null) {
                d22 = dB;
            } else {
                d22 = dB;
            }
            Matrix matrix9 = new Matrix();
            matrix = new Matrix();
            Matrix matrix10 = new Matrix();
            fArr3 = new float[9];
            fArr4 = new float[9];
            i13 = 0;
            while (i13 < length2) {
                c11 = charArray[i13];
                strValueOf = String.valueOf(c11);
                z16 = zArr[i13];
                if (z16) {
                    strValueOf = "";
                    z17 = false;
                    f11 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    i14 = i13;
                    z17 = false;
                    f11 = BitmapDescriptorFactory.HUE_RED;
                    while (true) {
                        i15 = i14 + 1;
                        if (i15 >= length2) {
                        }
                        strValueOf = strValueOf + charArray[i15];
                        zArr[i15] = true;
                        i14 = i15;
                        z17 = true;
                    }
                }
                i16 = i13;
                dMeasureText = ((double) paint3.measureText(strValueOf)) * d16;
                if (!z13) {
                    d33 = (((double) fArr2[i16]) * d16) - dMeasureText;
                }
                if (c11 == ' ') {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    d23 = d34;
                } else {
                    d23 = 0.0d;
                }
                d24 = dMeasureText + d23 + d35;
                if (z16) {
                    d25 = 0.0d;
                } else {
                    d25 = d33 + d24;
                }
                double dL4 = a0Var2.l(d25);
                double dM4 = a0Var2.m();
                double dI4 = a0Var2.i();
                double dJ4 = a0Var2.j();
                String str6 = strValueOf;
                double dK4 = a0Var2.k();
                if (z16) {
                    fArr4 = fArr4;
                    canvas2 = canvas3;
                    i17 = length2;
                    a0Var2 = a0Var2;
                    b0Var2 = b0Var;
                    matrix2 = matrix;
                    this = this;
                    paint2 = paint;
                    fArr3 = fArr3;
                    path = path2;
                } else {
                    fArr4 = fArr4;
                    canvas2 = canvas3;
                    i17 = length2;
                    a0Var2 = a0Var2;
                    b0Var2 = b0Var;
                    matrix2 = matrix;
                    this = this;
                    paint2 = paint;
                    fArr3 = fArr3;
                    path = path2;
                }
                paint3 = paint2;
                path2 = path;
                b0Var = b0Var2;
                u0Var = this;
                fArr3 = fArr3;
                matrix = matrix2;
                length2 = i17;
                a0Var2 = a0Var2;
                fArr4 = fArr4;
                canvas3 = canvas2;
                i13 = i16 + 1;
            }
        }
        return path2;
    }

    private StaticLayout B(TextPaint textPaint, Layout.Alignment alignment, boolean z11, SpannableString spannableString, int i11) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i11).setAlignment(alignment).setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.0f).setIncludePad(z11).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    private double C(a1 a1Var, double d11) {
        int i11 = a.f45516a[a1Var.ordinal()];
        if (i11 == 2) {
            return (-d11) / 2.0d;
        }
        if (i11 != 3) {
            return 0.0d;
        }
        return -d11;
    }

    private void D() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == v0.class) {
                this.f45512s = (v0) parent;
                return;
            } else {
                if (!(parent instanceof h1)) {
                    return;
                }
            }
        }
    }

    public static String E(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i11 = 0; i11 < runCount; i11++) {
            bArr[i11] = (byte) bidi.getRunLevel(i11);
            numArr[i11] = Integer.valueOf(i11);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < runCount; i12++) {
            int iIntValue = numArr[i12].intValue();
            int runStart = bidi.getRunStart(iIntValue);
            int runLimit = bidi.getRunLimit(iIntValue);
            if ((bArr[iIntValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit >= runStart) {
                        sb2.append(str.charAt(runLimit));
                    }
                }
            } else {
                sb2.append((CharSequence) str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    private void w(Paint paint, y yVar) {
        int i11 = Build.VERSION.SDK_INT;
        double d11 = yVar.f45543n;
        paint.setLetterSpacing((float) (d11 / (yVar.f45530a * ((double) this.mScale))));
        if (d11 == 0.0d && yVar.f45538i == y0.normal) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + yVar.f45536g);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + yVar.f45536g);
        }
        if (i11 >= 26) {
            paint.setFontVariationSettings("'wght' " + yVar.f45535f + yVar.f45537h);
        }
    }

    private void x(Paint paint, y yVar) {
        int i11 = 0;
        boolean z11 = yVar.f45534e == z0.Bold || yVar.f45535f >= 550;
        boolean z12 = yVar.f45532c == x0.italic;
        if (z11 && z12) {
            i11 = 3;
        } else if (z11) {
            i11 = 1;
        } else if (z12) {
            i11 = 2;
        }
        int i12 = yVar.f45535f;
        String str = yVar.f45531b;
        Typeface typefaceE = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                p014n4.a1.a();
                Typeface.Builder builderA = p014n4.w0.a(this.f45515v, str2);
                builderA.setFontVariationSettings("'wght' " + i12 + yVar.f45537h);
                builderA.setWeight(i12);
                builderA.setItalic(z12);
                typefaceE = builderA.build();
                if (typefaceE == null) {
                    p014n4.a1.a();
                    Typeface.Builder builderA2 = p014n4.w0.a(this.f45515v, str3);
                    builderA2.setFontVariationSettings("'wght' " + i12 + yVar.f45537h);
                    builderA2.setWeight(i12);
                    builderA2.setItalic(z12);
                    typefaceE = builderA2.build();
                }
            } else {
                try {
                    try {
                        typefaceE = Typeface.create(Typeface.createFromAsset(this.f45515v, str2), i11);
                    } catch (Exception unused) {
                        typefaceE = Typeface.create(Typeface.createFromAsset(this.f45515v, str3), i11);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typefaceE == null) {
            try {
                typefaceE = com.facebook.react.views.text.d.c().e(str, i11, this.f45515v);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typefaceE = Typeface.create(typefaceE, i12, z12);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typefaceE);
        paint.setTextSize((float) (yVar.f45530a * ((double) this.mScale)));
        paint.setLetterSpacing(BitmapDescriptorFactory.HUE_RED);
    }

    private void y(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        a0 a0VarL = l();
        n();
        y yVarB = a0VarL.b();
        TextPaint textPaint = new TextPaint(paint);
        x(textPaint, yVarB);
        w(textPaint, yVarB);
        double dC = a0VarL.c();
        int i11 = a.f45516a[yVarB.f45539j.ordinal()];
        if (i11 != 2) {
            alignment = i11 != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        StaticLayout staticLayoutB = B(textPaint, alignment, true, new SpannableString(this.f45511r), (int) n0.a(this.f45395f, canvas.getWidth(), 0.0d, this.mScale, dC));
        int lineAscent = staticLayoutB.getLineAscent(0);
        float fL = (float) a0VarL.l(0.0d);
        float fM = (float) (a0VarL.m() + ((double) lineAscent));
        m();
        canvas.save();
        canvas.translate(fL, fM);
        staticLayoutB.draw(canvas);
        canvas.restore();
    }

    private double z(SVGLength sVGLength, double d11, double d12) {
        return n0.a(sVGLength, d11, 0.0d, this.mScale, d12);
    }

    @Override // com.horcrux.svg.h1, com.horcrux.svg.VirtualView
    void clearCache() {
        this.f45510q = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.h1, com.horcrux.svg.c0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f11) {
        if (this.f45511r == null) {
            clip(canvas, paint);
            h(canvas, paint, f11);
            return;
        }
        SVGLength sVGLength = this.f45395f;
        if (sVGLength != null && sVGLength.f45257a != 0.0d) {
            if (setupFillPaint(paint, this.fillOpacity * f11)) {
                y(canvas, paint);
            }
            if (setupStrokePaint(paint, f11 * this.strokeOpacity)) {
                y(canvas, paint);
                return;
            }
            return;
        }
        int size = this.f45513t.size();
        if (size > 0) {
            x(paint, l().b());
            for (int i11 = 0; i11 < size; i11++) {
                String str = this.f45513t.get(i11);
                Matrix matrix = this.f45514u.get(i11);
                canvas.save();
                canvas.concat(matrix);
                canvas.drawText(str, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                canvas.restore();
            }
        }
        i(canvas, paint, f11);
    }

    @Override // com.horcrux.svg.h1, com.horcrux.svg.c0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f45510q;
        if (path != null) {
            return path;
        }
        if (this.f45511r == null) {
            Path pathS = s(canvas, paint);
            this.f45510q = pathS;
            return pathS;
        }
        D();
        n();
        this.f45510q = A(E(this.f45511r), paint, canvas);
        m();
        return this.f45510q;
    }

    @Override // com.horcrux.svg.c0, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        Region region;
        if (this.f45511r == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(iRound, iRound2)) || ((region = this.mStrokeRegion) != null && region.contains(iRound, iRound2))) {
                if (getClipPath() == null || this.mClipRegion.contains(iRound, iRound2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.h1, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f45510q = null;
        super.invalidate();
    }

    public void setContent(String str) {
        this.f45511r = str;
        invalidate();
    }

    @Override // com.horcrux.svg.h1
    double t(Paint paint) {
        if (!Double.isNaN(this.f45405p)) {
            return this.f45405p;
        }
        String str = this.f45511r;
        double dT = 0.0d;
        if (str == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof h1) {
                    dT += ((h1) childAt).t(paint);
                }
            }
            this.f45405p = dT;
            return dT;
        }
        if (str.length() == 0) {
            this.f45405p = 0.0d;
            return 0.0d;
        }
        y yVarB = l().b();
        x(paint, yVarB);
        w(paint, yVarB);
        double dMeasureText = paint.measureText(str);
        this.f45405p = dMeasureText;
        return dMeasureText;
    }
}
