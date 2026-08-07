package com.adyen.threeds2.customization;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpandableInfoCustomization extends Customization {
    private String mBorderColorCode;
    private String mExpandedStateIndicatorColorCode;
    private String mHeadingTextColorCode;
    private String mHeadingTextFontName;
    private String mHighlightedBackgroundColorCode;
    private int mHeadingTextFontSize = -1;
    private int mBorderWidth = -1;

    public final String getBorderColor() {
        return this.mBorderColorCode;
    }

    public final int getBorderWidth() {
        return this.mBorderWidth;
    }

    public final String getExpandedStateIndicatorColor() {
        return this.mExpandedStateIndicatorColorCode;
    }

    public final String getHeadingTextColor() {
        return this.mHeadingTextColorCode;
    }

    public final String getHeadingTextFontName() {
        return this.mHeadingTextFontName;
    }

    public final int getHeadingTextFontSize() {
        return this.mHeadingTextFontSize;
    }

    public final String getHighlightedBackgroundColor() {
        return this.mHighlightedBackgroundColorCode;
    }

    public final void setBorderColor(String str) {
        this.mBorderColorCode = requireHexColorCode(str);
    }

    public final void setBorderWidth(int i11) {
        this.mBorderWidth = requireNonNegative("borderWidth", i11).intValue();
    }

    public final void setExpandStateIndicatorColor(String str) {
        this.mExpandedStateIndicatorColorCode = requireHexColorCode(str);
    }

    public final void setHeadingTextColor(String str) {
        this.mHeadingTextColorCode = requireHexColorCode(str);
    }

    public final void setHeadingTextFontName(String str) {
        this.mHeadingTextFontName = requireNonEmpty("fontName", str);
    }

    public final void setHeadingTextFontSize(int i11) {
        this.mHeadingTextFontSize = requireNonNegative(OrcaFlavourKeys.FONT_SIZE, i11).intValue();
    }

    public final void setHighlightedBackgroundColor(String str) {
        this.mHighlightedBackgroundColorCode = requireHexColorCode(str);
    }
}
