package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import ap.p;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.Locale;
import u5.h;

/* JADX INFO: loaded from: classes4.dex */
class a extends zo.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Uri f23690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ReadableMap f23691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final il.b f23692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f23693d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f23695f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23694e = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f23696g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23697h = 0;

    public a(il.b bVar, Object obj) {
        this.f23692c = bVar;
        this.f23693d = obj;
    }

    private static Uri f(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    @Override // zo.a
    public p b() {
        return new b(getThemedContext().getResources(), (int) Math.ceil(this.f23696g), (int) Math.ceil(this.f23694e), this.f23697h, g(), e(), d(), c(), this.f23695f);
    }

    public Object c() {
        return this.f23693d;
    }

    public il.b d() {
        return this.f23692c;
    }

    public ReadableMap e() {
        return this.f23691b;
    }

    public Uri g() {
        return this.f23690a;
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public boolean isVirtual() {
        return true;
    }

    @no.a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f23691b = readableMap;
    }

    @Override // com.facebook.react.uimanager.m
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f23696g = (float) dynamic.asDouble();
        } else {
            qk.a.I("ReactNative", "Inline images must not have percentage based height");
            this.f23696g = Float.NaN;
        }
    }

    @no.a(name = "resizeMode")
    public void setResizeMode(String str) {
        this.f23695f = str;
    }

    @no.a(name = "src")
    public void setSource(ReadableArray readableArray) {
        Uri uriF = null;
        String string = (readableArray == null || readableArray.size() == 0 || readableArray.getType(0) != ReadableType.Map) ? null : ((ReadableMap) h.g(readableArray.getMap(0))).getString("uri");
        if (string != null) {
            try {
                Uri uri = Uri.parse(string);
                try {
                    if (uri.getScheme() != null) {
                        uriF = uri;
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            if (uriF == null) {
                uriF = f(getThemedContext(), string);
            }
        }
        if (uriF != this.f23690a) {
            markUpdated();
        }
        this.f23690a = uriF;
    }

    @no.a(customType = "Color", name = "tintColor")
    public void setTintColor(int i11) {
        this.f23697h = i11;
    }

    @Override // com.facebook.react.uimanager.m
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f23694e = (float) dynamic.asDouble();
        } else {
            qk.a.I("ReactNative", "Inline images must not have percentage based width");
            this.f23694e = Float.NaN;
        }
    }
}
