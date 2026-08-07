package com.adyen.threeds2.customization;

/* JADX INFO: loaded from: classes3.dex */
public final class ToolbarCustomization extends Customization {
    private String mBackgroundColorCode;
    private String mButtonText;
    private String mHeaderText;

    public final String getBackgroundColor() {
        return this.mBackgroundColorCode;
    }

    public final String getButtonText() {
        return this.mButtonText;
    }

    public final String getHeaderText() {
        return this.mHeaderText;
    }

    public final void setBackgroundColor(String str) {
        this.mBackgroundColorCode = requireHexColorCode(str);
    }

    public final void setButtonText(String str) {
        this.mButtonText = requireNonEmpty("buttonText", str);
    }

    public final void setHeaderText(String str) {
        this.mHeaderText = requireNonEmpty("headerText", str);
    }
}
