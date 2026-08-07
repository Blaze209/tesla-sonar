package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class k extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f45430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    u f45431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ReadableArray f45432e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45433a;

        static {
            int[] iArr = new int[u.values().length];
            f45433a = iArr;
            try {
                iArr[u.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45433a[u.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45433a[u.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45433a[u.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public k(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.q
    public Bitmap h(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapJ = q.j(map, bitmap, this.f45430c);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i11 = a.f45433a[this.f45431d.ordinal()];
        if (i11 == 1) {
            if (this.f45432e.size() >= 20) {
                float[] fArr = new float[this.f45432e.size()];
                for (int i12 = 0; i12 < this.f45432e.size(); i12++) {
                    fArr[i12] = ((float) this.f45432e.getDouble(i12)) * (i12 % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapJ);
            }
            return bitmapJ;
        }
        if (i11 == 2) {
            if (this.f45432e.size() == 1) {
                colorMatrix.setSaturation((float) this.f45432e.getDouble(0));
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapJ);
            }
            return bitmapJ;
        }
        if (i11 == 3) {
            if (this.f45432e.size() == 1) {
                double d11 = (((double) ((float) this.f45432e.getDouble(0))) * 3.141592653589793d) / 180.0d;
                float fCos = (float) Math.cos(d11);
                float fSin = (float) Math.sin(d11);
                float f11 = 0.715f - (fCos * 0.715f);
                float f12 = fSin * 0.715f;
                float f13 = 0.072f - (fCos * 0.072f);
                float f14 = 0.213f - (fCos * 0.213f);
                colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f11 - f12, f13 + (fSin * 0.928f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f14 + (0.143f * fSin), (0.285f * fCos) + 0.715f + (0.14f * fSin), f13 - (0.283f * fSin), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f14 - (0.787f * fSin), f11 + f12, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED});
            }
            return bitmapJ;
        }
        if (i11 == 4) {
            colorMatrix.set(new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.2125f, 0.7154f, 0.0721f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapJ);
    }

    public void setIn1(String str) {
        this.f45430c = str;
        invalidate();
    }

    public void setType(String str) {
        this.f45431d = u.getEnum(str);
        invalidate();
    }

    public void setValues(ReadableArray readableArray) {
        this.f45432e = readableArray;
        invalidate();
    }
}
