package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class j extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f45413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f45414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    t f45415e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45416a;

        static {
            int[] iArr = new int[t.values().length];
            f45416a = iArr;
            try {
                iArr[t.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45416a[t.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45416a[t.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45416a[t.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45416a[t.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45416a[t.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public j(ReactContext reactContext) {
        super(reactContext);
        this.f45484b.mX = new SVGLength(0.0d);
        this.f45484b.mY = new SVGLength(0.0d);
        this.f45484b.mW = new SVGLength("100%");
        this.f45484b.mH = new SVGLength("100%");
    }

    public static /* synthetic */ float[] k(float[] fArr, float[] fArr2) {
        float f11 = fArr[0];
        float f12 = 1.0f - f11;
        float f13 = fArr2[0];
        float f14 = 1.0f - f13;
        float f15 = fArr[1] * f11;
        float f16 = fArr2[1];
        float f17 = (f15 * f14) + (f16 * f13 * f12) + (f15 * f16 * f13);
        float f18 = fArr[2] * f11;
        float f19 = fArr2[2];
        float f21 = fArr[3] * f11;
        float f22 = fArr2[3];
        return new float[]{1.0f - (f12 * f14), f17, (f18 * f14) + (f19 * f13 * f12) + (f18 * f19 * f13), (f14 * f21) + (f22 * f13 * f12) + (f21 * f22 * f13)};
    }

    @Override // com.horcrux.svg.q
    public Bitmap h(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapJ = q.j(map, bitmap, this.f45413c);
        Bitmap bitmapJ2 = q.j(map, bitmap, this.f45414d);
        if (this.f45415e == t.MULTIPLY) {
            return CustomFilter.apply(bitmapJ, bitmapJ2, new d() { // from class: com.horcrux.svg.i
                @Override // com.horcrux.svg.d
                public final float[] a(float[] fArr, float[] fArr2) {
                    return j.k(fArr, fArr2);
                }
            });
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapJ.getWidth(), bitmapJ.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapJ, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        int i11 = a.f45416a[this.f45415e.ordinal()];
        if (i11 == 1 || i11 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i11 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i11 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i11 == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(bitmapJ2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        return bitmapCreateBitmap;
    }

    public void setIn1(String str) {
        this.f45413c = str;
        invalidate();
    }

    public void setIn2(String str) {
        this.f45414d = str;
        invalidate();
    }

    public void setMode(String str) {
        this.f45415e = t.getEnum(str);
        invalidate();
    }
}
