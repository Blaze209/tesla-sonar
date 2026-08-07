package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b7\u00106R\u0016\u0010;\u001a\u0004\u0018\u0001088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010?\u001a\u0004\u0018\u00010<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010C\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0016\u0010F\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010H\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0016\u0010J\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010BR\u0016\u0010N\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010R\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010T\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010B¨\u0006U"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontSizeStyle;", OrcaFlavourKeys.FONT_SIZE, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "textColor", "textColorHighlight", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "getTextColorHighlight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getMarginValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "marginValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustificationValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "justificationValue", "", "getFontSizeValue", "()Ljava/lang/Double;", "fontSizeValue", "getTextColorValue", "()Ljava/lang/Integer;", "textColorValue", "getTextColorHighlightValue", "textColorHighlightValue", "getLetterSpacingValue", "letterSpacingValue", "", "getFontNameValue", "()Ljava/lang/String;", "fontNameValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontWeightValue", "getLineHeightValue", "lineHeightValue", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextBasedComponentStyle implements TextViewStyle, Parcelable {
    public static final Parcelable.Creator<TextBasedComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.TextBasedFontFamilyStyle fontFamily;
    private final AttributeStyles.TextBasedFontSizeStyle fontSize;
    private final AttributeStyles.TextBasedFontWeightStyle fontWeight;
    private final AttributeStyles.TextBasedJustifyStyle justify;
    private final AttributeStyles.TextBasedLetterSpacingStyle letterSpacing;
    private final AttributeStyles.TextBasedLineHeightStyle lineHeight;
    private final AttributeStyles.TextBasedMarginStyle margin;
    private final AttributeStyles.TextBasedTextColorStyle textColor;
    private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TextBasedComponentStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextBasedComponentStyle createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new TextBasedComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.TextBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextBasedComponentStyle[] newArray(int i11) {
            return new TextBasedComponentStyle[i11];
        }
    }

    public TextBasedComponentStyle(AttributeStyles.TextBasedMarginStyle textBasedMarginStyle, AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle, AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle, AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle, AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle, AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle2) {
        this.margin = textBasedMarginStyle;
        this.justify = textBasedJustifyStyle;
        this.fontFamily = textBasedFontFamilyStyle;
        this.fontSize = textBasedFontSizeStyle;
        this.fontWeight = textBasedFontWeightStyle;
        this.letterSpacing = textBasedLetterSpacingStyle;
        this.lineHeight = textBasedLineHeightStyle;
        this.textColor = textBasedTextColorStyle;
        this.textColorHighlight = textBasedTextColorStyle2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AttributeStyles.TextBasedFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle
    public String getFontNameValue() {
        StyleElements.FontName base;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = this.fontFamily;
        if (textBasedFontFamilyStyle == null || (base = textBasedFontFamilyStyle.getBase()) == null) {
            return null;
        }
        return base.getFontName();
    }

    public final AttributeStyles.TextBasedFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle
    public Double getFontSizeValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = this.fontSize;
        if (textBasedFontSizeStyle == null || (base = textBasedFontSizeStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.TextBasedFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle
    public StyleElements.FontWeight getFontWeightValue() {
        StyleElements.FontWeightContainer base;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = this.fontWeight;
        if (textBasedFontWeightStyle == null || (base = textBasedFontWeightStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle
    public StyleElements.PositionType getJustificationValue() {
        StyleElements.Position base;
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        if (textBasedJustifyStyle == null || (base = textBasedJustifyStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.TextBasedJustifyStyle getJustify() {
        return this.justify;
    }

    public final AttributeStyles.TextBasedLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle
    public Double getLetterSpacingValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = this.letterSpacing;
        if (textBasedLetterSpacingStyle == null || (base = textBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.TextBasedLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle
    public Double getLineHeightValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = this.lineHeight;
        if (textBasedLineHeightStyle == null || (base = textBasedLineHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.TextBasedMarginStyle getMargin() {
        return this.margin;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle
    public StyleElements.SizeSet getMarginValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
        if (textBasedMarginStyle == null || (base = textBasedMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.TextBasedTextColorStyle getTextColor() {
        return this.textColor;
    }

    public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
        return this.textColorHighlight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle
    public Integer getTextColorHighlightValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
        if (textBasedTextColorStyle == null || (base = textBasedTextColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextViewStyle
    public Integer getTextColorValue() {
        StyleElements.SimpleElementColor base;
        StyleElements.SimpleElementColorValue base2;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColor;
        if (textBasedTextColorStyle == null || (base = textBasedTextColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
        if (textBasedMarginStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedMarginStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        if (textBasedJustifyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedJustifyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = this.fontFamily;
        if (textBasedFontFamilyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedFontFamilyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = this.fontSize;
        if (textBasedFontSizeStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedFontSizeStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = this.fontWeight;
        if (textBasedFontWeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedFontWeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = this.letterSpacing;
        if (textBasedLetterSpacingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedLetterSpacingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = this.lineHeight;
        if (textBasedLineHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedLineHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColor;
        if (textBasedTextColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedTextColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle2 = this.textColorHighlight;
        if (textBasedTextColorStyle2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedTextColorStyle2.writeToParcel(dest, flags);
        }
    }
}
