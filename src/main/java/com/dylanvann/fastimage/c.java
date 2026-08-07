package com.dylanvann.fastimage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import com.bumptech.glide.request.e;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import jj.h;

/* JADX INFO: loaded from: classes3.dex */
class c extends AppCompatImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ReadableMap f21524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f21525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f21526f;

    public c(Context context) {
        super(context);
        this.f21523c = false;
        this.f21524d = null;
        this.f21525e = null;
    }

    private boolean d(String str) {
        return str == null || str.trim().isEmpty();
    }

    public void c(l lVar) {
        if (lVar == null || getTag() == null || !(getTag() instanceof e)) {
            return;
        }
        lVar.clear(this);
    }

    @SuppressLint({"CheckResult"})
    public void e(FastImageViewManager fastImageViewManager, l lVar, Map<String, List<c>> map) {
        if (this.f21523c) {
            ReadableMap readableMap = this.f21524d;
            if ((readableMap == null || !readableMap.hasKey("uri") || d(this.f21524d.getString("uri"))) && this.f21525e == null) {
                c(lVar);
                h hVar = this.f21526f;
                if (hVar != null) {
                    FastImageOkHttpProgressGlideModule.forget(hVar.h());
                }
                setImageDrawable(null);
                return;
            }
            FastImageSource fastImageSourceC = b.c(getContext(), this.f21524d);
            if (fastImageSourceC != null && fastImageSourceC.getUri().toString().length() == 0) {
                RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((v0) getContext()).getJSModule(RCTEventEmitter.class);
                int id2 = getId();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("message", "Invalid source prop:" + this.f21524d);
                rCTEventEmitter.receiveEvent(id2, "onFastImageError", writableNativeMap);
                c(lVar);
                h hVar2 = this.f21526f;
                if (hVar2 != null) {
                    FastImageOkHttpProgressGlideModule.forget(hVar2.h());
                }
                setImageDrawable(null);
                return;
            }
            h glideUrl = fastImageSourceC == null ? null : fastImageSourceC.getGlideUrl();
            this.f21526f = glideUrl;
            c(lVar);
            String strH = glideUrl == null ? null : glideUrl.h();
            if (glideUrl != null) {
                FastImageOkHttpProgressGlideModule.expect(strH, fastImageViewManager);
                List<c> list = map.get(strH);
                if (list != null && !list.contains(this)) {
                    list.add(this);
                } else if (list == null) {
                    map.put(strH, new ArrayList(Collections.singletonList(this)));
                }
            }
            v0 v0Var = (v0) getContext();
            if (fastImageSourceC != null) {
                ((RCTEventEmitter) v0Var.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onFastImageLoadStart", new WritableNativeMap());
            }
            if (lVar != null) {
                k<Drawable> kVarApply = lVar.mo78load(fastImageSourceC != null ? fastImageSourceC.getSourceForLoad() : null).apply((com.bumptech.glide.request.a<?>) b.d(v0Var, fastImageSourceC, this.f21524d).placeholder(this.f21525e).fallback(this.f21525e));
                if (strH != null) {
                    kVarApply.listener(new FastImageRequestListener(strH));
                }
                kVarApply.into(this);
            }
        }
    }

    public void setDefaultSource(Drawable drawable) {
        this.f21523c = true;
        this.f21525e = drawable;
    }

    public void setSource(ReadableMap readableMap) {
        this.f21523c = true;
        this.f21524d = readableMap;
    }
}
