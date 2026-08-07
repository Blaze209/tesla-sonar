package com.content.pushprovisioning;

import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.l;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.v0;
import java.util.Map;
import no.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001b\u0010\u0019J!\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/reactnativestripesdk/pushprovisioning/b;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "getName", "()Ljava/lang/String;", "view", "Ljn0/h0;", "onDropViewInstance", "(Lcom/reactnativestripesdk/pushprovisioning/b;)V", "onAfterUpdateTransaction", "Lcom/facebook/react/uimanager/v0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/reactnativestripesdk/pushprovisioning/b;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/bridge/ReadableMap;", "source", "(Lcom/reactnativestripesdk/pushprovisioning/b;Lcom/facebook/react/bridge/ReadableMap;)V", "cardDetails", "ephemeralKey", "token", "Lcom/bumptech/glide/l;", "requestManager", "Lcom/bumptech/glide/l;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddToWalletButtonManager extends SimpleViewManager<b> {
    private final l requestManager;

    public AddToWalletButtonManager(Context applicationContext) {
        s.k(applicationContext, "applicationContext");
        l lVarC = c.C(applicationContext);
        s.j(lVarC, "with(...)");
        this.requestManager = lVarC;
    }

    @a(name = "cardDetails")
    public final void cardDetails(b view, ReadableMap cardDetails) {
        s.k(view, "view");
        s.k(cardDetails, "cardDetails");
        view.setCardDetails(cardDetails);
    }

    @a(name = "ephemeralKey")
    public final void ephemeralKey(b view, ReadableMap ephemeralKey) {
        s.k(view, "view");
        s.k(ephemeralKey, "ephemeralKey");
        view.setEphemeralKey(ephemeralKey);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapD = jn.c.d("onCompleteAction", jn.c.d("registrationName", "onCompleteAction"));
        s.j(mapD, "of(...)");
        return mapD;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AddToWalletButton";
    }

    @a(name = "androidAssetSource")
    public final void source(b view, ReadableMap source) {
        s.k(view, "view");
        s.k(source, "source");
        view.setSourceMap(source);
    }

    @a(name = "token")
    public final void token(b view, ReadableMap token) {
        s.k(view, "view");
        view.setToken(token);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(v0 reactContext) {
        s.k(reactContext, "reactContext");
        return new b(reactContext, this.requestManager);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(b view) {
        s.k(view, "view");
        super.onAfterUpdateTransaction(view);
        view.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(b view) {
        s.k(view, "view");
        view.h();
        super.onDropViewInstance(view);
    }
}
