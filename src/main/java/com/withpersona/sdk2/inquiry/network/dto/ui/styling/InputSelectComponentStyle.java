package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.squareup.moshi.i;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020!¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010T\u001a\u00020O8F¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0014\u0010V\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010QR\u0013\u0010Z\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0013\u0010\\\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0013\u0010^\u001a\u0004\u0018\u00010W8F¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0013\u0010a\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0016\u0010c\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010`R\u0016\u0010e\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010`R\u0013\u0010g\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bf\u0010`R\u0013\u0010i\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bh\u0010`R\u0013\u0010k\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bj\u0010`R\u0016\u0010m\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010`R\u0016\u0010o\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010`R\u0013\u0010q\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bp\u0010`R\u0013\u0010s\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\br\u0010`R\u0013\u0010w\u001a\u0004\u0018\u00010t8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010y\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010`R\u0013\u0010{\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bz\u0010`R\u0013\u0010}\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b|\u0010`R\u0013\u0010\u007f\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b~\u0010`R\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010`R\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010`R\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010`R\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010`R\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010`R\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010`R\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010`R\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010`R\u0015\u0010\u0091\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010`R\u0015\u0010\u0093\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010`R\u0015\u0010\u0095\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010`R\u0015\u0010\u0097\u0001\u001a\u0004\u0018\u00010!8F¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010`¨\u0006\u0098\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;", OrcaFlavourKeys.FONT_SIZE, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderRadiusStyle;", Snapshot.BORDER_RADIUS, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectStrokeColorStyle;", "strokeColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectStrokeColorStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectStrokeColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputSelectStrokeColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "textBasedStyle", "getLabelStyle", "labelStyle", "getErrorTextStyle", "errorTextStyle", "", "getTopBorderWidthValue", "()Ljava/lang/Double;", "topBorderWidthValue", "getBottomBorderWidthValue", "bottomBorderWidthValue", "getBorderRadiusValue", "borderRadiusValue", "getChevronColor", "()Ljava/lang/Integer;", "chevronColor", "getHeaderCancelButtonColor", "headerCancelButtonColor", "getBaseBorderColorValue", "baseBorderColorValue", "getFocusedBorderColorValue", "focusedBorderColorValue", "getDisabledBorderColorValue", "disabledBorderColorValue", "getErrorBorderColorValue", "errorBorderColorValue", "getBaseBackgroundColorValue", "baseBackgroundColorValue", "getFocusedBackgroundColorValue", "focusedBackgroundColorValue", "getDisabledBackgroundColorValue", "disabledBackgroundColorValue", "getErrorBackgroundColorValue", "errorBackgroundColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getInputSelectBoxMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "inputSelectBoxMargins", "getBaseTextColor", "baseTextColor", "getValueFocusedTextColor", "valueFocusedTextColor", "getValueDisabledTextColor", "valueDisabledTextColor", "getValueErrorTextColor", "valueErrorTextColor", "getLabelBaseTextColor", "labelBaseTextColor", "getLabelFocusedTextColor", "labelFocusedTextColor", "getLabelDisabledTextColor", "labelDisabledTextColor", "getLabelErrorTextColor", "labelErrorTextColor", "getPlaceholderBaseTextColor", "placeholderBaseTextColor", "getPlaceholderFocusedTextColor", "placeholderFocusedTextColor", "getPlaceholderDisabledTextColor", "placeholderDisabledTextColor", "getPlaceholderErrorTextColor", "placeholderErrorTextColor", "getErrorBaseTextColor", "errorBaseTextColor", "getErrorFocusedTextColor", "errorFocusedTextColor", "getErrorDisabledTextColor", "errorDisabledTextColor", "getErrorErrorTextColor", "errorErrorTextColor", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputSelectComponentStyle implements Parcelable, InputSelectBoxComponentStyle {
    public static final Parcelable.Creator<InputSelectComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.InputSelectBackgroundColorStyle backgroundColor;
    private final AttributeStyles.InputSelectBorderColorStyle borderColor;
    private final AttributeStyles.InputSelectBorderRadiusStyle borderRadius;
    private final AttributeStyles.InputSelectBorderWidthStyle borderWidth;
    private final AttributeStyles.InputSelectTextFontFamilyStyle fontFamily;
    private final AttributeStyles.InputSelectTextFontSizeStyle fontSize;
    private final AttributeStyles.InputSelectTextFontWeightStyle fontWeight;
    private final AttributeStyles.TextBasedJustifyStyle justify;
    private final AttributeStyles.InputSelectTextLetterSpacingStyle letterSpacing;
    private final AttributeStyles.InputSelectTextLineHeightStyle lineHeight;
    private final AttributeStyles.InputMarginStyle margin;
    private final AttributeStyles.InputSelectStrokeColorStyle strokeColor;
    private final AttributeStyles.InputSelectTextColorStyle textColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputSelectComponentStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelectComponentStyle createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new InputSelectComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.TextBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputSelectBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputSelectStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelectComponentStyle[] newArray(int i11) {
            return new InputSelectComponentStyle[i11];
        }
    }

    public InputSelectComponentStyle(AttributeStyles.InputMarginStyle inputMarginStyle, AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle, AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle, AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle, AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle, AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle, AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle, AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle, AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle, AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle, AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle, AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle, AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle) {
        this.margin = inputMarginStyle;
        this.justify = textBasedJustifyStyle;
        this.fontFamily = inputSelectTextFontFamilyStyle;
        this.fontSize = inputSelectTextFontSizeStyle;
        this.fontWeight = inputSelectTextFontWeightStyle;
        this.letterSpacing = inputSelectTextLetterSpacingStyle;
        this.lineHeight = inputSelectTextLineHeightStyle;
        this.textColor = inputSelectTextColorStyle;
        this.borderRadius = inputSelectBorderRadiusStyle;
        this.borderWidth = inputSelectBorderWidthStyle;
        this.backgroundColor = inputSelectBackgroundColorStyle;
        this.borderColor = inputSelectBorderColorStyle;
        this.strokeColor = inputSelectStrokeColorStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AttributeStyles.InputSelectBackgroundColorStyle getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getBaseBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        if (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getBaseBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getBaseTextColor() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (value = inputSelectTextColorStyle.getValue()) == null) {
            return null;
        }
        return value.getBase();
    }

    public final AttributeStyles.InputSelectBorderColorStyle getBorderColor() {
        return this.borderColor;
    }

    public final AttributeStyles.InputSelectBorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final Double getBorderRadiusValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = this.borderRadius;
        if (inputSelectBorderRadiusStyle == null || (base = inputSelectBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.InputSelectBorderWidthStyle getBorderWidth() {
        return this.borderWidth;
    }

    public final Double getBottomBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size bottom;
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
        if (inputSelectBorderWidthStyle == null || (base = inputSelectBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (bottom = base2.getBottom()) == null) {
            return null;
        }
        return bottom.getDp();
    }

    public final Integer getChevronColor() {
        StyleElements.SimpleElementColor chevron;
        StyleElements.SimpleElementColorValue base;
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
        if (inputSelectStrokeColorStyle == null || (chevron = inputSelectStrokeColorStyle.getChevron()) == null || (base = chevron.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    public final Integer getDisabledBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        return (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
    }

    public final Integer getDisabledBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getDisabled();
    }

    public final Integer getErrorBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer errored;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        return (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null || (errored = base.getErrored()) == null) ? getBaseBackgroundColorValue() : errored;
    }

    public final Integer getErrorBaseTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (error = inputSelectTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getBase();
    }

    public final Integer getErrorBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getErrored();
    }

    public final Integer getErrorDisabledTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (error = inputSelectTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getDisabled();
    }

    public final Integer getErrorErrorTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (error = inputSelectTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getErrored();
    }

    public final Integer getErrorFocusedTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (error = inputSelectTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getFocused();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public TextBasedComponentStyle getErrorTextStyle() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputSelectTextFontFamilyStyle != null ? inputSelectTextFontFamilyStyle.getError() : null);
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getError() : null);
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getError() : null);
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputSelectTextLetterSpacingStyle != null ? inputSelectTextLetterSpacingStyle.getError() : null);
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getError() : null);
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle != null && (error = inputSelectTextColorStyle.getError()) != null) {
            base = error.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getFocusedBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer focused;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        return (inputSelectBackgroundColorStyle == null || (base = inputSelectBackgroundColorStyle.getBase()) == null || (focused = base.getFocused()) == null) ? getBaseBackgroundColorValue() : focused;
    }

    public final Integer getFocusedBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null || (base = inputSelectBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getFocused();
    }

    public final AttributeStyles.InputSelectTextFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    public final AttributeStyles.InputSelectTextFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    public final AttributeStyles.InputSelectTextFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getHeaderCancelButtonColor() {
        StyleElements.SimpleElementColor headerCancelButton;
        StyleElements.SimpleElementColorValue base;
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
        if (inputSelectStrokeColorStyle == null || (headerCancelButton = inputSelectStrokeColorStyle.getHeaderCancelButton()) == null || (base = headerCancelButton.getBase()) == null) {
            return null;
        }
        return base.getValue();
    }

    public final StyleElements.SizeSet getInputSelectBoxMargins() {
        StyleElements.MeasurementSet base;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final AttributeStyles.TextBasedJustifyStyle getJustify() {
        return this.justify;
    }

    public final Integer getLabelBaseTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getBase();
    }

    public final Integer getLabelDisabledTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getDisabled();
    }

    public final Integer getLabelErrorTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getErrored();
    }

    public final Integer getLabelFocusedTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (label = inputSelectTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getFocused();
    }

    public final TextBasedComponentStyle getLabelStyle() {
        StyleElements.FontName base;
        StyleElements.Measurement base2;
        StyleElements.ComplexElementColor label;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        Integer base3 = null;
        if (inputSelectTextFontFamilyStyle == null || (base = inputSelectTextFontFamilyStyle.getLabel()) == null) {
            AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle2 = this.fontFamily;
            base = inputSelectTextFontFamilyStyle2 != null ? inputSelectTextFontFamilyStyle2.getBase() : null;
        }
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(base);
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getLabel() : null);
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getLabel() : null);
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        if (inputSelectTextLetterSpacingStyle == null || (base2 = inputSelectTextLetterSpacingStyle.getLabel()) == null) {
            AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle2 = this.letterSpacing;
            base2 = inputSelectTextLetterSpacingStyle2 != null ? inputSelectTextLetterSpacingStyle2.getBase() : null;
        }
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(base2);
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getLabel() : null);
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle != null && (label = inputSelectTextColorStyle.getLabel()) != null) {
            base3 = label.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base3))), null);
    }

    public final AttributeStyles.InputSelectTextLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    public final AttributeStyles.InputSelectTextLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    public final AttributeStyles.InputMarginStyle getMargin() {
        return this.margin;
    }

    public final Integer getPlaceholderBaseTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (placeholder = inputSelectTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getBase();
    }

    public final Integer getPlaceholderDisabledTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (placeholder = inputSelectTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getDisabled();
    }

    public final Integer getPlaceholderErrorTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (placeholder = inputSelectTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getErrored();
    }

    public final Integer getPlaceholderFocusedTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null || (placeholder = inputSelectTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getFocused();
    }

    public final AttributeStyles.InputSelectStrokeColorStyle getStrokeColor() {
        return this.strokeColor;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public TextBasedComponentStyle getTextBasedStyle() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = new AttributeStyles.TextBasedMarginStyle(inputMarginStyle != null ? inputMarginStyle.getOption() : null);
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputSelectTextFontFamilyStyle != null ? inputSelectTextFontFamilyStyle.getBase() : null);
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputSelectTextFontSizeStyle != null ? inputSelectTextFontSizeStyle.getBase() : null);
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputSelectTextFontWeightStyle != null ? inputSelectTextFontWeightStyle.getBase() : null);
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputSelectTextLetterSpacingStyle != null ? inputSelectTextLetterSpacingStyle.getBase() : null);
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputSelectTextLineHeightStyle != null ? inputSelectTextLineHeightStyle.getBase() : null);
        Integer base = null;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle != null && (value = inputSelectTextColorStyle.getValue()) != null) {
            base = value.getBase();
        }
        return new TextBasedComponentStyle(textBasedMarginStyle, textBasedJustifyStyle, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    public final AttributeStyles.InputSelectTextColorStyle getTextColor() {
        return this.textColor;
    }

    public final Double getTopBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size top;
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
        if (inputSelectBorderWidthStyle == null || (base = inputSelectBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
            return null;
        }
        return top.getDp();
    }

    public final Integer getValueDisabledTextColor() {
        StyleElements.ComplexElementColor value;
        Integer disabled;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        return (inputSelectTextColorStyle == null || (value = inputSelectTextColorStyle.getValue()) == null || (disabled = value.getDisabled()) == null) ? getBaseTextColor() : disabled;
    }

    public final Integer getValueErrorTextColor() {
        StyleElements.ComplexElementColor value;
        Integer errored;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        return (inputSelectTextColorStyle == null || (value = inputSelectTextColorStyle.getValue()) == null || (errored = value.getErrored()) == null) ? getBaseTextColor() : errored;
    }

    public final Integer getValueFocusedTextColor() {
        StyleElements.ComplexElementColor value;
        Integer focused;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        return (inputSelectTextColorStyle == null || (value = inputSelectTextColorStyle.getValue()) == null || (focused = value.getFocused()) == null) ? getBaseTextColor() : focused;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        if (inputMarginStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputMarginStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = this.justify;
        if (textBasedJustifyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            textBasedJustifyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = this.fontFamily;
        if (inputSelectTextFontFamilyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextFontFamilyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = this.fontSize;
        if (inputSelectTextFontSizeStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextFontSizeStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = this.fontWeight;
        if (inputSelectTextFontWeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextFontWeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = this.letterSpacing;
        if (inputSelectTextLetterSpacingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextLetterSpacingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = this.lineHeight;
        if (inputSelectTextLineHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextLineHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = this.textColor;
        if (inputSelectTextColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectTextColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = this.borderRadius;
        if (inputSelectBorderRadiusStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectBorderRadiusStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = this.borderWidth;
        if (inputSelectBorderWidthStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectBorderWidthStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = this.backgroundColor;
        if (inputSelectBackgroundColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectBackgroundColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = this.borderColor;
        if (inputSelectBorderColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectBorderColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = this.strokeColor;
        if (inputSelectStrokeColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputSelectStrokeColorStyle.writeToParcel(dest, flags);
        }
    }
}
