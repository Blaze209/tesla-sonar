package com.dylanvann.fastimage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.h;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.v0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import uj.f;
import uj.j;

/* JADX INFO: loaded from: classes3.dex */
public class FastImageRequestListener implements h<Drawable> {
    static final String REACT_ON_ERROR_EVENT = "onFastImageError";
    static final String REACT_ON_LOAD_END_EVENT = "onFastImageLoadEnd";
    static final String REACT_ON_LOAD_EVENT = "onFastImageLoad";
    private final String key;

    FastImageRequestListener(String str) {
        this.key = str;
    }

    private static WritableMap mapFromResource(Drawable drawable) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(Snapshot.WIDTH, drawable.getIntrinsicWidth());
        writableNativeMap.putInt(Snapshot.HEIGHT, drawable.getIntrinsicHeight());
        return writableNativeMap;
    }

    @Override // com.bumptech.glide.request.h
    public boolean onLoadFailed(GlideException glideException, Object obj, j<Drawable> jVar, boolean z11) {
        FastImageOkHttpProgressGlideModule.forget(this.key);
        if (!(jVar instanceof f)) {
            return false;
        }
        c cVar = (c) ((f) jVar).b();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((v0) cVar.getContext()).getJSModule(RCTEventEmitter.class);
        int id2 = cVar.getId();
        rCTEventEmitter.receiveEvent(id2, REACT_ON_ERROR_EVENT, new WritableNativeMap());
        rCTEventEmitter.receiveEvent(id2, REACT_ON_LOAD_END_EVENT, new WritableNativeMap());
        return false;
    }

    @Override // com.bumptech.glide.request.h
    public boolean onResourceReady(Drawable drawable, Object obj, j<Drawable> jVar, dj.a aVar, boolean z11) {
        if (!(jVar instanceof f)) {
            return false;
        }
        c cVar = (c) ((f) jVar).b();
        RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((v0) cVar.getContext()).getJSModule(RCTEventEmitter.class);
        int id2 = cVar.getId();
        rCTEventEmitter.receiveEvent(id2, REACT_ON_LOAD_EVENT, mapFromResource(drawable));
        rCTEventEmitter.receiveEvent(id2, REACT_ON_LOAD_END_EVENT, new WritableNativeMap());
        return false;
    }
}
