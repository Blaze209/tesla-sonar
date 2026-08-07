package com.adyen.threeds2.customization;

/* JADX INFO: loaded from: classes3.dex */
public final class TextBoxCustomization extends Customization {
    private String mBorderColorCode;
    private int mBorderWidth = -1;
    private int mCornerRadius = -1;

    public final String getBorderColor() {
        return this.mBorderColorCode;
    }

    public final int getBorderWidth() {
        return this.mBorderWidth;
    }

    public final int getCornerRadius() {
        return this.mCornerRadius;
    }

    public final void setBorderColor(String str) {
        this.mBorderColorCode = requireHexColorCode(str);
    }

    public final void setBorderWidth(int i11) {
        this.mBorderWidth = requireNonNegative("borderWidth", i11).intValue();
    }

    public final void setCornerRadius(int i11) {
        this.mCornerRadius = requireNonNegative("cornerRadius", i11).intValue();
    }
}
