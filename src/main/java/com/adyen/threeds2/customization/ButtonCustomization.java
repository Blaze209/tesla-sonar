package com.adyen.threeds2.customization;

/* JADX INFO: loaded from: classes3.dex */
public final class ButtonCustomization extends Customization {
    private String mBackgroundColorCode;
    private int mCornerRadius = -1;

    public final String getBackgroundColor() {
        return this.mBackgroundColorCode;
    }

    public final int getCornerRadius() {
        return this.mCornerRadius;
    }

    public final void setBackgroundColor(String str) {
        this.mBackgroundColorCode = requireHexColorCode(str);
    }

    public final void setCornerRadius(int i11) {
        this.mCornerRadius = requireNonNegative("cornerRadius", i11).intValue();
    }
}
