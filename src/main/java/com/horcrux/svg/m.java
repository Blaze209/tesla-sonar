package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.plaid.internal.EnumC4419g;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
class m extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f45457e = Pattern.compile("[0-9.-]+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ReadableArray f45458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f45459d;

    public m(ReactContext reactContext) {
        super(reactContext);
        this.f45459d = 1.0f;
    }

    private void setupPaint(Paint paint, float f11, ReadableArray readableArray) {
        if (readableArray.getInt(0) != 0) {
            return;
        }
        if (readableArray.size() != 2) {
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f11) * 255.0d : f11 * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
        } else {
            int iIntValue = readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1);
            paint.setColor((Math.round((iIntValue >>> 24) * f11) << 24) | (iIntValue & 16777215));
        }
    }

    @Override // com.horcrux.svg.q
    public Bitmap h(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFlags(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, this.f45459d, this.f45458c);
        canvas.drawPaint(paint);
        return bitmapCreateBitmap;
    }

    public void setFloodColor(Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.f45458c = null;
            invalidate();
            return;
        }
        if (dynamic.getType().equals(ReadableType.Map)) {
            setFloodColor(dynamic.asMap());
            return;
        }
        ReadableType type = dynamic.getType();
        int i11 = 0;
        if (type.equals(ReadableType.Number)) {
            this.f45458c = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.f45458c = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = f45457e.matcher(dynamic.asString());
            while (matcher.find()) {
                double d11 = Double.parseDouble(matcher.group());
                int i12 = i11 + 1;
                if (i11 < 3) {
                    d11 /= 255.0d;
                }
                javaOnlyArray.pushDouble(d11);
                i11 = i12;
            }
            this.f45458c = javaOnlyArray;
        }
        invalidate();
    }

    public void setFloodOpacity(float f11) {
        this.f45459d = f11;
        invalidate();
    }

    public void setFloodColor(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f45458c = null;
            invalidate();
            return;
        }
        int i11 = readableMap.getInt("type");
        if (i11 == 0) {
            ReadableType type = readableMap.getType(StatusResponse.PAYLOAD);
            if (type.equals(ReadableType.Number)) {
                this.f45458c = JavaOnlyArray.of(0, Integer.valueOf(readableMap.getInt(StatusResponse.PAYLOAD)));
            } else if (type.equals(ReadableType.Map)) {
                this.f45458c = JavaOnlyArray.of(0, readableMap.getMap(StatusResponse.PAYLOAD));
            }
        } else if (i11 == 1) {
            this.f45458c = JavaOnlyArray.of(1, readableMap.getString("brushRef"));
        } else {
            this.f45458c = JavaOnlyArray.of(Integer.valueOf(i11));
        }
        invalidate();
    }
}
