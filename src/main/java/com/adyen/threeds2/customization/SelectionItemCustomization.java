package com.adyen.threeds2.customization;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectionItemCustomization extends Customization {
    private String mBorderColorCode;
    private int mBorderWidth = -1;
    private String mHighlightedBackgroundColorCode;
    private String mSelectionIndicatorTintColorCode;

    public final String getBorderColor() {
        return this.mBorderColorCode;
    }

    public final int getBorderWidth() {
        return this.mBorderWidth;
    }

    public final String getHighlightedBackgroundColor() {
        return this.mHighlightedBackgroundColorCode;
    }

    public final String getSelectionIndicatorTintColor() {
        return this.mSelectionIndicatorTintColorCode;
    }

    public final void setBorderColor(String str) {
        this.mBorderColorCode = requireHexColorCode(str);
    }

    public final void setBorderWidth(int i11) {
        this.mBorderWidth = requireNonNegative("borderWidth", i11).intValue();
    }

    public final void setHighlightedBackgroundColor(String str) {
        this.mHighlightedBackgroundColorCode = requireHexColorCode(str);
    }

    public final void setSelectionIndicatorTintColor(String str) {
        this.mSelectionIndicatorTintColorCode = requireHexColorCode(str);
    }
}
