package com.adyen.threeds2.customization;

import jn0.e;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenCustomization extends Customization {
    private String mBackgroundColorCode;
    private String mStatusBarColorCode;

    public final String getBackgroundColor() {
        return this.mBackgroundColorCode;
    }

    public final String getStatusBarColor() {
        return this.mStatusBarColorCode;
    }

    public final void setBackgroundColor(String str) {
        this.mBackgroundColorCode = requireHexColorCode(str);
    }

    @e
    public final void setStatusBarColor(String str) {
        this.mStatusBarColorCode = requireHexColorCode(str);
    }
}
