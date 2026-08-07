package com.reactlibrary;

import androidx.annotation.NonNull;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* JADX INFO: loaded from: classes6.dex */
public class GooglePayButtonViewManager extends SimpleViewManager<k> {
    public static final String REACT_CLASS = "GooglePayButtonViewManager";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @no.a(defaultInt = 1, name = "theme")
    public void setTheme(k kVar, int i11) {
        kVar.setTheme(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public k createViewInstance(@NonNull v0 v0Var) {
        return new k(v0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = Snapshot.BORDER_RADIUS)
    public void setBorderRadius(k kVar, float f11) {
        kVar.setCornerRadius(f11);
    }
}
