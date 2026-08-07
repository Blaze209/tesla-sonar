package io.sentry.react.replay;

import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.v0;

/* JADX INFO: loaded from: classes9.dex */
@xn.a(name = "RNSentryReplayMask")
public class RNSentryReplayMaskManager extends ViewGroupManager<b> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "RNSentryReplayMask";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public b createViewInstance(@NonNull v0 v0Var) {
        return new b(v0Var);
    }
}
