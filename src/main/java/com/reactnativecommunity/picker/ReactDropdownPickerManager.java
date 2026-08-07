package com.reactnativecommunity.picker;

import com.facebook.react.uimanager.v0;

/* JADX INFO: loaded from: classes6.dex */
@xn.a(name = ReactDropdownPickerManager.REACT_CLASS)
public class ReactDropdownPickerManager extends ReactPickerManager {
    public static final String REACT_CLASS = "RNCAndroidDropdownPicker";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(v0 v0Var) {
        return new h(v0Var, 1);
    }
}
