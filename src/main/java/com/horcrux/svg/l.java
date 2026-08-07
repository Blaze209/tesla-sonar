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
class l extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f45435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f45436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f45437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f45438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f45439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f45440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    v f45441i;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45442a;

        static {
            int[] iArr = new int[v.values().length];
            f45442a = iArr;
            try {
                iArr[v.OVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45442a[v.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45442a[v.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45442a[v.ATOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45442a[v.XOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45442a[v.ARITHMETIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public l(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.q
    public Bitmap h(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapJ = q.j(map, bitmap, this.f45435c);
        Bitmap bitmapJ2 = q.j(map, bitmap, this.f45436d);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapJ.getWidth(), bitmapJ.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapJ, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        switch (a.f45442a[this.f45441i.ordinal()]) {
            case 1:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                break;
            case 2:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case 3:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case 4:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case 5:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
            case 6:
                int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
                int[] iArr = new int[width];
                bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                int width2 = bitmapCreateBitmap.getWidth();
                int width3 = bitmapCreateBitmap.getWidth();
                int height = bitmapCreateBitmap.getHeight();
                int[] iArr2 = new int[width];
                bitmapJ2.getPixels(iArr2, 0, width2, 0, 0, width3, height);
                int i11 = 0;
                while (i11 < width) {
                    int i12 = iArr[i11];
                    int i13 = iArr2[i11];
                    int i14 = width;
                    int[] iArr3 = iArr2;
                    float f11 = this.f45437e;
                    float f12 = (i12 >> 16) & 255;
                    float f13 = (i13 >> 16) & 255;
                    float f14 = f11 * f12 * f13;
                    float f15 = this.f45438f;
                    float f16 = f14 + (f12 * f15);
                    float f17 = this.f45439g;
                    float f18 = f16 + (f13 * f17);
                    float f19 = this.f45440h;
                    int i15 = (int) (f18 + f19);
                    float f21 = (i12 >> 8) & 255;
                    float f22 = (i13 >> 8) & 255;
                    int i16 = (int) ((f11 * f21 * f22) + (f21 * f15) + (f22 * f17) + f19);
                    float f23 = i12 & 255;
                    float f24 = i13 & 255;
                    int i17 = (int) ((f11 * f23 * f24) + (f23 * f15) + (f24 * f17) + f19);
                    float f25 = i12 >>> 24;
                    float f26 = i13 >>> 24;
                    int i18 = (int) ((f11 * f25 * f26) + (f25 * f15) + (f17 * f26) + f19);
                    int iMin = Math.min(255, Math.max(0, i15));
                    iArr[i11] = (Math.min(255, Math.max(0, i16)) << 8) | (iMin << 16) | (Math.min(255, Math.max(0, i18)) << 24) | Math.min(255, Math.max(0, i17));
                    i11++;
                    width = i14;
                    iArr2 = iArr3;
                }
                int width4 = bitmapCreateBitmap.getWidth();
                int width5 = bitmapCreateBitmap.getWidth();
                bitmapCreateBitmap = bitmapCreateBitmap;
                bitmapCreateBitmap.setPixels(iArr, 0, width4, 0, 0, width5, bitmapCreateBitmap.getHeight());
                break;
        }
        if (this.f45441i != v.ARITHMETIC) {
            canvas.drawBitmap(bitmapJ2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        }
        return bitmapCreateBitmap;
    }

    public void setIn1(String str) {
        this.f45435c = str;
        invalidate();
    }

    public void setIn2(String str) {
        this.f45436d = str;
        invalidate();
    }

    public void setK1(Float f11) {
        this.f45437e = f11.floatValue();
        invalidate();
    }

    public void setK2(Float f11) {
        this.f45438f = f11.floatValue();
        invalidate();
    }

    public void setK3(Float f11) {
        this.f45439g = f11.floatValue();
        invalidate();
    }

    public void setK4(Float f11) {
        this.f45440h = f11.floatValue();
        invalidate();
    }

    public void setOperator(String str) {
        this.f45441i = v.getEnum(str);
        invalidate();
    }
}
