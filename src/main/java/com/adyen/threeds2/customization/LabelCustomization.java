package com.adyen.threeds2.customization;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;

/* JADX INFO: loaded from: classes3.dex */
public final class LabelCustomization extends Customization {
    private String mHeadingTextColorCode;
    private String mHeadingTextFontName;
    private String mInputLabelTextColorCode;
    private String mInputLabelTextFontName;
    private int mHeadingTextFontSize = -1;
    private int mInputLabelTextFontSize = -1;

    public final String getHeadingTextColor() {
        return this.mHeadingTextColorCode;
    }

    public final String getHeadingTextFontName() {
        return this.mHeadingTextFontName;
    }

    public final int getHeadingTextFontSize() {
        return this.mHeadingTextFontSize;
    }

    public final String getInputLabelTextColor() {
        return this.mInputLabelTextColorCode;
    }

    public final String getInputLabelTextFontName() {
        return this.mInputLabelTextFontName;
    }

    public final int getInputLabelTextFontSize() {
        return this.mInputLabelTextFontSize;
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

    public final void setInputLabelTextColor(String str) {
        this.mInputLabelTextColorCode = requireHexColorCode(str);
    }

    public final void setInputLabelTextFontName(String str) {
        this.mInputLabelTextFontName = requireNonEmpty("fontName", str);
    }

    public final void setInputLabelTextFontSize(int i11) {
        this.mInputLabelTextFontSize = requireNonNegative(OrcaFlavourKeys.FONT_SIZE, i11).intValue();
    }
}
