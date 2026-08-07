package com.adyen.threeds2.customization;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import com.adyen.threeds2.util.Preconditions;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Customization implements Serializable {
    static final int INITIAL_VALUE = -1;
    private String mTextColorCode;
    private String mTextFontName;
    private int mTextFontSize = -1;

    Customization() {
    }

    public static Integer parseHexColorCode(String str) {
        if (str == null || str.isEmpty() || str.charAt(0) != '#') {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Typeface parseTypeface(Context context, String str) {
        Typeface typefaceCreate;
        if (str == null) {
            return null;
        }
        try {
            typefaceCreate = Typeface.createFromAsset(context.getAssets(), str);
        } catch (Exception unused) {
            typefaceCreate = null;
        }
        if (typefaceCreate != null) {
            return typefaceCreate;
        }
        try {
            typefaceCreate = Typeface.createFromFile(str);
        } catch (Exception unused2) {
        }
        if (typefaceCreate != null) {
            return typefaceCreate;
        }
        try {
            typefaceCreate = Typeface.create(str, 0);
        } catch (Exception unused3) {
        }
        if (typefaceCreate != null) {
            return typefaceCreate;
        }
        return null;
    }

    public String getTextColor() {
        return this.mTextColorCode;
    }

    public String getTextFontName() {
        return this.mTextFontName;
    }

    public int getTextFontSize() {
        return this.mTextFontSize;
    }

    String requireHexColorCode(String str) {
        Preconditions.requireNonNull("hexColorCode", parseHexColorCode(str));
        return str;
    }

    String requireNonEmpty(String str, String str2) {
        Preconditions.requireNonEmpty(str, str2);
        return str2;
    }

    Integer requireNonNegative(String str, int i11) {
        Preconditions.requireNonNegative(str, i11);
        return Integer.valueOf(i11);
    }

    public void setTextColor(String str) {
        this.mTextColorCode = requireHexColorCode(str);
    }

    public void setTextFontName(String str) {
        this.mTextFontName = requireNonEmpty("fontName", str);
    }

    public void setTextFontSize(int i11) {
        this.mTextFontSize = requireNonNegative(OrcaFlavourKeys.FONT_SIZE, i11).intValue();
    }
}
