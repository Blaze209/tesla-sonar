package com.dylanvann.fastimage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import androidx.annotation.NonNull;
import com.bumptech.glide.l;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.v0;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import jj.h;

/* JADX INFO: loaded from: classes3.dex */
class FastImageViewManager extends SimpleViewManager<c> implements FastImageProgressListener {
    static final String REACT_CLASS = "FastImageView";
    static final String REACT_ON_LOAD_START_EVENT = "onFastImageLoadStart";
    static final String REACT_ON_PROGRESS_EVENT = "onFastImageProgress";
    private static final Map<String, List<c>> VIEWS_FOR_URLS = new WeakHashMap();
    private l requestManager = null;

    FastImageViewManager() {
    }

    private static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof v0)) {
            return null;
        }
        Context baseContext = ((v0) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (!(baseContext instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
        if (baseContext2 instanceof Activity) {
            return (Activity) baseContext2;
        }
        return null;
    }

    private static boolean isActivityDestroyed(Activity activity) {
        return activity.isDestroyed() || activity.isFinishing();
    }

    private static boolean isValidContextForGlide(Context context) {
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            return false;
        }
        return !isActivityDestroyed(activityFromContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return jn.c.a().b(REACT_ON_LOAD_START_EVENT, jn.c.d("registrationName", REACT_ON_LOAD_START_EVENT)).b(REACT_ON_PROGRESS_EVENT, jn.c.d("registrationName", REACT_ON_PROGRESS_EVENT)).b("onFastImageLoad", jn.c.d("registrationName", "onFastImageLoad")).b("onFastImageError", jn.c.d("registrationName", "onFastImageError")).b("onFastImageLoadEnd", jn.c.d("registrationName", "onFastImageLoadEnd")).a();
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public float getGranularityPercentage() {
        return 0.5f;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public void onProgress(String str, long j11, long j12) {
        List<c> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            for (c cVar : list) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("loaded", (int) j11);
                writableNativeMap.putInt("total", (int) j12);
                ((RCTEventEmitter) ((v0) cVar.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(cVar.getId(), REACT_ON_PROGRESS_EVENT, writableNativeMap);
            }
        }
    }

    @no.a(name = "defaultSource")
    public void setDefaultSource(c cVar, String str) {
        cVar.setDefaultSource(yo.c.d().e(cVar.getContext(), str));
    }

    @no.a(name = "resizeMode")
    public void setResizeMode(c cVar, String str) {
        cVar.setScaleType(b.f(str));
    }

    @no.a(name = "source")
    public void setSource(c cVar, ReadableMap readableMap) {
        cVar.setSource(readableMap);
    }

    @no.a(customType = "Color", name = "tintColor")
    public void setTintColor(c cVar, Integer num) {
        if (num == null) {
            cVar.clearColorFilter();
        } else {
            cVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public c createViewInstance(@NonNull v0 v0Var) {
        if (isValidContextForGlide(v0Var)) {
            this.requestManager = com.bumptech.glide.c.C(v0Var);
        }
        return new c(v0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NonNull c cVar) {
        super.onAfterUpdateTransaction(cVar);
        cVar.e(this, this.requestManager, VIEWS_FOR_URLS);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull c cVar) {
        cVar.c(this.requestManager);
        h hVar = cVar.f21526f;
        if (hVar != null) {
            String string = hVar.toString();
            FastImageOkHttpProgressGlideModule.forget(string);
            Map<String, List<c>> map = VIEWS_FOR_URLS;
            List<c> list = map.get(string);
            if (list != null) {
                list.remove(cVar);
                if (list.size() == 0) {
                    map.remove(string);
                }
            }
        }
        super.onDropViewInstance(cVar);
    }
}
