package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC0711a f45301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SVGLength[] f45302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReadableArray f45303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f45304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f45305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Matrix f45306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f45307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l0 f45308h;

    /* JADX INFO: renamed from: com.horcrux.svg.a$a, reason: collision with other inner class name */
    enum EnumC0711a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    a(EnumC0711a enumC0711a, SVGLength[] sVGLengthArr, b bVar) {
        this.f45301a = enumC0711a;
        this.f45302b = sVGLengthArr;
        this.f45304d = bVar == b.OBJECT_BOUNDING_BOX;
    }

    private RectF a(RectF rectF) {
        float f11;
        float f12;
        if (!this.f45304d) {
            rectF = new RectF(this.f45307g);
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (this.f45304d) {
            f11 = rectF.left;
            f12 = rectF.top;
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
            f12 = 0.0f;
        }
        return new RectF(f11, f12, fWidth + f11, fHeight + f12);
    }

    private double b(SVGLength sVGLength, double d11, float f11, float f12) {
        return n0.a(sVGLength, d11, 0.0d, (this.f45304d && sVGLength.f45258b == SVGLength.UnitType.NUMBER) ? d11 : f11, f12);
    }

    private static void c(ReadableArray readableArray, int i11, float[] fArr, int[] iArr, float f11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 2;
            fArr[i12] = (float) readableArray.getDouble(i13);
            int i14 = readableArray.getInt(i13 + 1);
            iArr[i12] = (i14 & 16777215) | (Math.round((i14 >>> 24) * f11) << 24);
        }
    }

    void d(b bVar) {
        this.f45305e = bVar == b.OBJECT_BOUNDING_BOX;
    }

    void e(ReadableArray readableArray) {
        this.f45303c = readableArray;
    }

    void f(Matrix matrix) {
        this.f45306f = matrix;
    }

    void g(l0 l0Var) {
        this.f45308h = l0Var;
    }

    void h(Rect rect) {
        this.f45307g = rect;
    }

    void i(Paint paint, RectF rectF, float f11, float f12) {
        int[] iArr;
        float[] fArr;
        int[] iArr2;
        float[] fArr2;
        double d11;
        RectF rectFA = a(rectF);
        float fWidth = rectFA.width();
        float fHeight = rectFA.height();
        float f13 = rectFA.left;
        float f14 = rectFA.top;
        float textSize = paint.getTextSize();
        if (this.f45301a == EnumC0711a.PATTERN) {
            double d12 = fWidth;
            double dB = b(this.f45302b[0], d12, f11, textSize);
            double d13 = fHeight;
            double dB2 = b(this.f45302b[1], d13, f11, textSize);
            double dB3 = b(this.f45302b[2], d12, f11, textSize);
            double dB4 = b(this.f45302b[3], d13, f11, textSize);
            if (dB3 <= 1.0d || dB4 <= 1.0d) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dB3, (int) dB4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF viewBox = this.f45308h.getViewBox();
            if (viewBox != null && viewBox.width() > BitmapDescriptorFactory.HUE_RED && viewBox.height() > BitmapDescriptorFactory.HUE_RED) {
                RectF rectF2 = new RectF((float) dB, (float) dB2, (float) dB3, (float) dB4);
                l0 l0Var = this.f45308h;
                canvas.concat(j1.a(viewBox, rectF2, l0Var.f45454p, l0Var.f45455q));
            }
            if (this.f45305e) {
                canvas.scale(fWidth / f11, fHeight / f11);
            }
            this.f45308h.draw(canvas, new Paint(), f12);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.f45306f;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.f45303c.size();
        if (size == 0) {
            qk.a.I("ReactNative", "Gradient contains no stops");
            return;
        }
        int i11 = size / 2;
        int[] iArr3 = new int[i11];
        float[] fArr3 = new float[i11];
        c(this.f45303c, i11, fArr3, iArr3, f12);
        if (i11 == 1) {
            int[] iArr4 = {iArr3[0], iArr3[0]};
            float[] fArr4 = {fArr3[0], fArr3[0]};
            qk.a.I("ReactNative", "Gradient contains only one stop");
            fArr = fArr4;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            fArr = fArr3;
        }
        EnumC0711a enumC0711a = this.f45301a;
        if (enumC0711a == EnumC0711a.LINEAR_GRADIENT) {
            double d14 = fWidth;
            double d15 = f13;
            double dB5 = b(this.f45302b[0], d14, f11, textSize) + d15;
            double d16 = fHeight;
            double d17 = f14;
            LinearGradient linearGradient = new LinearGradient((float) dB5, (float) (b(this.f45302b[1], d16, f11, textSize) + d17), (float) (d15 + b(this.f45302b[2], d14, f11, textSize)), (float) (b(this.f45302b[3], d16, f11, textSize) + d17), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f45306f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f45306f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr5 = iArr;
        float[] fArr5 = fArr;
        if (enumC0711a == EnumC0711a.RADIAL_GRADIENT) {
            double d18 = fWidth;
            double dB6 = b(this.f45302b[2], d18, f11, textSize);
            double d19 = fHeight;
            double dB7 = b(this.f45302b[3], d19, f11, textSize);
            if (dB6 <= 0.0d || dB7 <= 0.0d) {
                float[] fArr6 = {fArr5[0], fArr5[fArr5.length - 1]};
                iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                fArr2 = fArr6;
                dB6 = d18;
                d11 = d19;
            } else {
                iArr2 = iArr5;
                fArr2 = fArr5;
                d11 = dB7;
            }
            double d21 = d11 / dB6;
            RadialGradient radialGradient = new RadialGradient((float) (b(this.f45302b[4], d18, f11, textSize) + ((double) f13)), (float) (b(this.f45302b[5], d19 / d21, f11, textSize) + (((double) f14) / d21)), (float) dB6, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d21);
            Matrix matrix5 = this.f45306f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
