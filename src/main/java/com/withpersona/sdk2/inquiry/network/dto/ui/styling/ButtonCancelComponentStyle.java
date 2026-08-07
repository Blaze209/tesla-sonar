package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.squareup.moshi.i;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020%¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u00104R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u00107R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010V\u001a\u0004\bW\u0010XR\u0016\u0010\\\u001a\u0004\u0018\u00010Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0016\u0010^\u001a\u0004\u0018\u00010Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010[R\u0016\u0010b\u001a\u0004\u0018\u00010_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0016\u0010f\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0016\u0010i\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0016\u0010k\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010hR\u0016\u0010m\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010hR\u0016\u0010o\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010eR\u0016\u0010s\u001a\u0004\u0018\u00010p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0016\u0010w\u001a\u0004\u0018\u00010t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010y\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010eR\u0016\u0010{\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010hR\u0014\u0010}\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010hR\u0016\u0010\u007f\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010hR\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010eR\u0018\u0010\u0083\u0001\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010eR\u0018\u0010\u0085\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010hR\u0018\u0010\u0087\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010hR\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010hR\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010eR\u0018\u0010\u008d\u0001\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010e¨\u0006\u008e\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontSizeStyle;", OrcaFlavourKeys.FONT_SIZE, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", Snapshot.HEIGHT, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", Snapshot.WIDTH, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", Snapshot.BORDER_RADIUS, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "borderWidth", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "paddingValue", "getMarginValue", "marginValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustificationValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "justificationValue", "", "getFontSizeValue", "()Ljava/lang/Double;", "fontSizeValue", "getBaseTextColorValue", "()Ljava/lang/Integer;", "baseTextColorValue", "getActiveTextColorValue", "activeTextColorValue", "getDisabledTextColorValue", "disabledTextColorValue", "getLetterSpacingValue", "letterSpacingValue", "", "getFontNameValue", "()Ljava/lang/String;", "fontNameValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontWeightValue", "getLineHeightValue", "lineHeightValue", "getBaseBackgroundColorValue", "baseBackgroundColorValue", "getActiveBackgroundColorValue", "activeBackgroundColorValue", "getDisabledBackgroundColorValue", "disabledBackgroundColorValue", "getHeightValue", "heightValue", "getWidthValue", "widthValue", "getBaseBorderColorValue", "baseBorderColorValue", "getActiveBorderColorValue", "activeBorderColorValue", "getDisabledBorderColorValue", "disabledBorderColorValue", "getBorderRadiusValue", "borderRadiusValue", "getBorderWidthValue", "borderWidthValue", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ButtonCancelComponentStyle implements Parcelable, BaseButtonComponentStyle {
    public static final Parcelable.Creator<ButtonCancelComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.ButtonBasedBackgroundColorStyle backgroundColor;
    private final AttributeStyles.ButtonBasedBorderColorStyle borderColor;
    private final AttributeStyles.ButtonBasedBorderRadiusStyle borderRadius;
    private final AttributeStyles.ButtonBasedBorderWidthStyle borderWidth;
    private final AttributeStyles.ButtonBasedFontFamilyStyle fontFamily;
    private final AttributeStyles.ButtonBasedFontSizeStyle fontSize;
    private final AttributeStyles.ButtonBasedFontWeightStyle fontWeight;
    private final AttributeStyles.ButtonBasedHeightStyle height;
    private final AttributeStyles.ButtonBasedJustifyStyle justify;
    private final AttributeStyles.ButtonBasedLetterSpacingStyle letterSpacing;
    private final AttributeStyles.ButtonBasedLineHeightStyle lineHeight;
    private final AttributeStyles.ButtonBasedMarginStyle margin;
    private final AttributeStyles.ButtonBasedPaddingStyle padding;
    private final AttributeStyles.ButtonBasedTextColorStyle textColor;
    private final AttributeStyles.ButtonBasedWidthStyle width;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ButtonCancelComponentStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonCancelComponentStyle createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ButtonCancelComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderWidthStyle.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonCancelComponentStyle[] newArray(int i11) {
            return new ButtonCancelComponentStyle[i11];
        }
    }

    public ButtonCancelComponentStyle(AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle, AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle, AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle, AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle, AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle, AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle, AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle, AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle, AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle, AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle, AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle, AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle, AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle, AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle, AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle) {
        this.padding = buttonBasedPaddingStyle;
        this.margin = buttonBasedMarginStyle;
        this.justify = buttonBasedJustifyStyle;
        this.fontFamily = buttonBasedFontFamilyStyle;
        this.fontSize = buttonBasedFontSizeStyle;
        this.fontWeight = buttonBasedFontWeightStyle;
        this.letterSpacing = buttonBasedLetterSpacingStyle;
        this.lineHeight = buttonBasedLineHeightStyle;
        this.textColor = buttonBasedTextColorStyle;
        this.height = buttonBasedHeightStyle;
        this.width = buttonBasedWidthStyle;
        this.backgroundColor = buttonBasedBackgroundColorStyle;
        this.borderColor = buttonBasedBorderColorStyle;
        this.borderRadius = buttonBasedBorderRadiusStyle;
        this.borderWidth = buttonBasedBorderWidthStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Integer getActiveBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer active;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        return Integer.valueOf((buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (active = base.getActive()) == null) ? ButtonComponentStylingKt.getDefaultLoadingColor() : active.intValue());
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Integer getActiveBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getActive();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Integer getActiveTextColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        if (buttonBasedTextColorStyle == null || (base = buttonBasedTextColorStyle.getBase()) == null) {
            return null;
        }
        return base.getActive();
    }

    public final AttributeStyles.ButtonBasedBackgroundColorStyle getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Integer getBaseBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        if (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Integer getBaseBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        if (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Integer getBaseTextColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        if (buttonBasedTextColorStyle == null || (base = buttonBasedTextColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedBorderColorStyle getBorderColor() {
        return this.borderColor;
    }

    public final AttributeStyles.ButtonBasedBorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Double getBorderRadiusValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
        if (buttonBasedBorderRadiusStyle == null || (base = buttonBasedBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.ButtonBasedBorderWidthStyle getBorderWidth() {
        return this.borderWidth;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Double getBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size top;
        AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
        if (buttonBasedBorderWidthStyle == null || (base = buttonBasedBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
            return null;
        }
        return top.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Integer getDisabledBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        return (buttonBasedBackgroundColorStyle == null || (base = buttonBasedBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Integer getDisabledBorderColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        return (buttonBasedBorderColorStyle == null || (base = buttonBasedBorderColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBorderColorValue() : disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Integer getDisabledTextColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        return (buttonBasedTextColorStyle == null || (base = buttonBasedTextColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseTextColorValue() : disabled;
    }

    public final AttributeStyles.ButtonBasedFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public String getFontNameValue() {
        StyleElements.FontName base;
        AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle = this.fontFamily;
        if (buttonBasedFontFamilyStyle == null || (base = buttonBasedFontFamilyStyle.getBase()) == null) {
            return null;
        }
        return base.getFontName();
    }

    public final AttributeStyles.ButtonBasedFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Double getFontSizeValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle = this.fontSize;
        if (buttonBasedFontSizeStyle == null || (base = buttonBasedFontSizeStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.ButtonBasedFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public StyleElements.FontWeight getFontWeightValue() {
        StyleElements.FontWeightContainer base;
        AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle = this.fontWeight;
        if (buttonBasedFontWeightStyle == null || (base = buttonBasedFontWeightStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedHeightStyle getHeight() {
        return this.height;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Double getHeightValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
        if (buttonBasedHeightStyle == null || (base = buttonBasedHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public StyleElements.PositionType getJustificationValue() {
        StyleElements.Position base;
        AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
        if (buttonBasedJustifyStyle == null || (base = buttonBasedJustifyStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedJustifyStyle getJustify() {
        return this.justify;
    }

    public final AttributeStyles.ButtonBasedLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Double getLetterSpacingValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle = this.letterSpacing;
        if (buttonBasedLetterSpacingStyle == null || (base = buttonBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.ButtonBasedLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Double getLineHeightValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle = this.lineHeight;
        if (buttonBasedLineHeightStyle == null || (base = buttonBasedLineHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.ButtonBasedMarginStyle getMargin() {
        return this.margin;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public StyleElements.SizeSet getMarginValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
        if (buttonBasedMarginStyle == null || (base = buttonBasedMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedPaddingStyle getPadding() {
        return this.padding;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public StyleElements.SizeSet getPaddingValue() {
        StyleElements.MeasurementSet base;
        AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
        if (buttonBasedPaddingStyle == null || (base = buttonBasedPaddingStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.ButtonBasedTextColorStyle getTextColor() {
        return this.textColor;
    }

    public final AttributeStyles.ButtonBasedWidthStyle getWidth() {
        return this.width;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
    public Double getWidthValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
        if (buttonBasedWidthStyle == null || (base = buttonBasedWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
        if (buttonBasedPaddingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedPaddingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
        if (buttonBasedMarginStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedMarginStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
        if (buttonBasedJustifyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedJustifyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedFontFamilyStyle buttonBasedFontFamilyStyle = this.fontFamily;
        if (buttonBasedFontFamilyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedFontFamilyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedFontSizeStyle buttonBasedFontSizeStyle = this.fontSize;
        if (buttonBasedFontSizeStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedFontSizeStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedFontWeightStyle buttonBasedFontWeightStyle = this.fontWeight;
        if (buttonBasedFontWeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedFontWeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedLetterSpacingStyle buttonBasedLetterSpacingStyle = this.letterSpacing;
        if (buttonBasedLetterSpacingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedLetterSpacingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedLineHeightStyle buttonBasedLineHeightStyle = this.lineHeight;
        if (buttonBasedLineHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedLineHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedTextColorStyle buttonBasedTextColorStyle = this.textColor;
        if (buttonBasedTextColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedTextColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
        if (buttonBasedHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
        if (buttonBasedWidthStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedWidthStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
        if (buttonBasedBackgroundColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedBackgroundColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
        if (buttonBasedBorderColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedBorderColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
        if (buttonBasedBorderRadiusStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedBorderRadiusStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
        if (buttonBasedBorderWidthStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            buttonBasedBorderWidthStyle.writeToParcel(dest, flags);
        }
    }
}
