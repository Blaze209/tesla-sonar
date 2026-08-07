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
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001f¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\bH\u0010IR\u0013\u0010M\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0013\u0010Q\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010S\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0016\u0010V\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0013\u0010X\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bW\u0010UR\u0013\u0010Z\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bY\u0010UR\u0013\u0010\\\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b[\u0010UR\u0016\u0010^\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010UR\u0016\u0010`\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010UR\u0013\u0010b\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\ba\u0010UR\u0013\u0010d\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\bc\u0010UR\u0013\u0010h\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010j\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0013\u0010l\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bk\u0010gR\u0013\u0010n\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bm\u0010gR\u0013\u0010p\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bo\u0010gR\u0013\u0010r\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bq\u0010PR\u0013\u0010t\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bs\u0010PR\u0013\u0010v\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bu\u0010PR\u0013\u0010x\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bw\u0010PR\u0013\u0010|\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0013\u0010~\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\b}\u0010{R\u0014\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010{R\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010y8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010{R\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010PR\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010PR\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010PR\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010PR\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010PR\u0015\u0010\u008e\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010PR\u0015\u0010\u0090\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010PR\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010PR\u0015\u0010\u0094\u0001\u001a\u0004\u0018\u00010N8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010PR\u0018\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010UR\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010UR\u0015\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010UR\u0015\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010UR\u0015\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010UR\u0015\u0010 \u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010UR\u0015\u0010¢\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010UR\u0015\u0010¤\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010UR\u0015\u0010¦\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010UR\u0015\u0010¨\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010UR\u0015\u0010ª\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010UR\u0015\u0010¬\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010UR\u0015\u0010®\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010UR\u0015\u0010°\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010UR\u0015\u0010²\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b±\u0001\u0010UR\u0015\u0010´\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b³\u0001\u0010UR\u0015\u0010¶\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010UR\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010UR\u0015\u0010º\u0001\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010UR\u0018\u0010¾\u0001\u001a\u00030»\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010À\u0001\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010UR\u0015\u0010Â\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\bÁ\u0001\u0010½\u0001R\u0015\u0010Ä\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010½\u0001R\u0018\u0010Æ\u0001\u001a\u00030»\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010½\u0001R\u0015\u0010È\u0001\u001a\u00030»\u00018F¢\u0006\b\u001a\u0006\bÇ\u0001\u0010½\u0001¨\u0006É\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", OrcaFlavourKeys.FONT_SIZE, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;", Snapshot.BORDER_RADIUS, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextStrokeColorStyle;", "strokeColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextStrokeColorStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextStrokeColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputTextStrokeColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getInputTextBoxMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "inputTextBoxMargins", "", "getBorderWidthValue", "()Ljava/lang/Double;", "borderWidthValue", "getBorderRadiusValue", "borderRadiusValue", "getBaseBorderColorValue", "()Ljava/lang/Integer;", "baseBorderColorValue", "getFocusedBorderColorValue", "focusedBorderColorValue", "getDisabledBorderColorValue", "disabledBorderColorValue", "getErrorBorderColorValue", "errorBorderColorValue", "getBaseBackgroundColorValue", "baseBackgroundColorValue", "getFocusedBackgroundColorValue", "focusedBackgroundColorValue", "getDisabledBackgroundColorValue", "disabledBackgroundColorValue", "getErrorBackgroundColorValue", "errorBackgroundColorValue", "", "getBaseFontFamilyValue", "()Ljava/lang/String;", "baseFontFamilyValue", "getValueFontFamilyValue", "valueFontFamilyValue", "getPlaceholderFontFamilyValue", "placeholderFontFamilyValue", "getLabelFontFamilyValue", "labelFontFamilyValue", "getErrorFontFamilyValue", "errorFontFamilyValue", "getValueFontSizeValue", "valueFontSizeValue", "getPlaceholderFontSizeValue", "placeholderFontSizeValue", "getLabelFontSizeValue", "labelFontSizeValue", "getErrorFontSizeValue", "errorFontSizeValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getValueFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "valueFontWeightValue", "getPlaceholderFontWeightValue", "placeholderFontWeightValue", "getLabelFontWeightValue", "labelFontWeightValue", "getErrorFontWeightValue", "errorFontWeightValue", "getBaseLetterSpacingValue", "baseLetterSpacingValue", "getValueLetterSpacingValue", "valueLetterSpacingValue", "getPlaceholderLetterSpacingValue", "placeholderLetterSpacingValue", "getLabelLetterSpacingValue", "labelLetterSpacingValue", "getErrorLetterSpacingValue", "errorLetterSpacingValue", "getValueLineHeightValue", "valueLineHeightValue", "getPlaceholderLineHeightValue", "placeholderLineHeightValue", "getLabelLineHeightValue", "labelLineHeightValue", "getErrorLineHeightValue", "errorLineHeightValue", "getBaseTextColor", "baseTextColor", "getValueFocusedTextColor", "valueFocusedTextColor", "getValueDisabledTextColor", "valueDisabledTextColor", "getValueErrorTextColor", "valueErrorTextColor", "getPlaceholderBaseTextColor", "placeholderBaseTextColor", "getPlaceholderFocusedTextColor", "placeholderFocusedTextColor", "getPlaceholderDisabledTextColor", "placeholderDisabledTextColor", "getPlaceholderErrorTextColor", "placeholderErrorTextColor", "getLabelBaseTextColor", "labelBaseTextColor", "getLabelFocusedTextColor", "labelFocusedTextColor", "getLabelDisabledTextColor", "labelDisabledTextColor", "getLabelErrorTextColor", "labelErrorTextColor", "getErrorBaseTextColor", "errorBaseTextColor", "getErrorFocusedTextColor", "errorFocusedTextColor", "getErrorDisabledTextColor", "errorDisabledTextColor", "getErrorErrorTextColor", "errorErrorTextColor", "getBaseMaskToggleColor", "baseMaskToggleColor", "getFocusedMaskToggleColor", "focusedMaskToggleColor", "getDisabledMaskToggleColor", "disabledMaskToggleColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "textBasedStyle", "getHeaderCancelButtonColor", "headerCancelButtonColor", "getLabelTextBasedStyle", "labelTextBasedStyle", "getPlaceholderTextBasedStyle", "placeholderTextBasedStyle", "getErrorTextStyle", "errorTextStyle", "getFocusedTextBasedStyle", "focusedTextBasedStyle", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputTextBasedComponentStyle implements Parcelable, InputSelectBoxComponentStyle {
    public static final Parcelable.Creator<InputTextBasedComponentStyle> CREATOR = new Creator();
    private final AttributeStyles.InputTextBackgroundColorStyle backgroundColor;
    private final AttributeStyles.InputTextBorderColorStyle borderColor;
    private final AttributeStyles.InputTextBorderRadiusStyle borderRadius;
    private final AttributeStyles.InputTextBorderWidthStyle borderWidth;
    private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
    private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
    private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
    private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
    private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
    private final AttributeStyles.InputMarginStyle margin;
    private final AttributeStyles.InputTextStrokeColorStyle strokeColor;
    private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputTextBasedComponentStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputTextBasedComponentStyle createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new InputTextBasedComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.InputMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputTextBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.InputTextStrokeColorStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputTextBasedComponentStyle[] newArray(int i11) {
            return new InputTextBasedComponentStyle[i11];
        }
    }

    public InputTextBasedComponentStyle(AttributeStyles.InputMarginStyle inputMarginStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle, AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle, AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle, AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle, AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle) {
        this.margin = inputMarginStyle;
        this.fontFamily = complexTextBasedFontFamilyStyle;
        this.fontSize = complexTextBasedFontSizeStyle;
        this.fontWeight = complexTextBasedFontWeightStyle;
        this.letterSpacing = complexTextBasedLetterSpacingStyle;
        this.lineHeight = complexTextBasedLineHeightStyle;
        this.textColor = complexTextBasedTextColorStyle;
        this.borderRadius = inputTextBorderRadiusStyle;
        this.borderWidth = inputTextBorderWidthStyle;
        this.backgroundColor = inputTextBackgroundColorStyle;
        this.borderColor = inputTextBorderColorStyle;
        this.strokeColor = inputTextStrokeColorStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AttributeStyles.InputTextBackgroundColorStyle getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getBaseBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        if (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getBaseBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final String getBaseFontFamilyValue() {
        StyleElements.FontName base;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (base = complexTextBasedFontFamilyStyle.getBase()) == null) {
            return null;
        }
        return base.getFontName();
    }

    public final Double getBaseLetterSpacingValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        if (complexTextBasedLetterSpacingStyle == null || (base = complexTextBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final Integer getBaseMaskToggleColor() {
        StyleElements.ComplexElementColor maskToggle;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
            return null;
        }
        return maskToggle.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getBaseTextColor() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null) {
            return null;
        }
        return value.getBase();
    }

    public final AttributeStyles.InputTextBorderColorStyle getBorderColor() {
        return this.borderColor;
    }

    public final AttributeStyles.InputTextBorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    public final Double getBorderRadiusValue() {
        StyleElements.Measurement base;
        StyleElements.Size base2;
        AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
        if (inputTextBorderRadiusStyle == null || (base = inputTextBorderRadiusStyle.getBase()) == null || (base2 = base.getBase()) == null) {
            return null;
        }
        return base2.getDp();
    }

    public final AttributeStyles.InputTextBorderWidthStyle getBorderWidth() {
        return this.borderWidth;
    }

    public final Double getBorderWidthValue() {
        StyleElements.MeasurementSet base;
        StyleElements.SizeSet base2;
        StyleElements.Size top;
        AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
        if (inputTextBorderWidthStyle == null || (base = inputTextBorderWidthStyle.getBase()) == null || (base2 = base.getBase()) == null || (top = base2.getTop()) == null) {
            return null;
        }
        return top.getDp();
    }

    public final Integer getDisabledBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer disabled;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (disabled = base.getDisabled()) == null) ? getBaseBackgroundColorValue() : disabled;
    }

    public final Integer getDisabledBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getDisabled();
    }

    public final Integer getDisabledMaskToggleColor() {
        StyleElements.ComplexElementColor maskToggle;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
            return null;
        }
        return maskToggle.getDisabled();
    }

    public final Integer getErrorBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer errored;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (errored = base.getErrored()) == null) ? getBaseBackgroundColorValue() : errored;
    }

    public final Integer getErrorBaseTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getBase();
    }

    public final Integer getErrorBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getErrored();
    }

    public final Integer getErrorDisabledTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getDisabled();
    }

    public final Integer getErrorErrorTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getErrored();
    }

    public final Integer getErrorFocusedTextColor() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (error = complexTextBasedTextColorStyle.getError()) == null) {
            return null;
        }
        return error.getFocused();
    }

    public final String getErrorFontFamilyValue() {
        StyleElements.FontName error;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (error = complexTextBasedFontFamilyStyle.getError()) == null) {
            return null;
        }
        return error.getFontName();
    }

    public final Double getErrorFontSizeValue() {
        StyleElements.Measurement error;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (error = complexTextBasedFontSizeStyle.getError()) == null || (base = error.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final StyleElements.FontWeight getErrorFontWeightValue() {
        StyleElements.FontWeightContainer error;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (error = complexTextBasedFontWeightStyle.getError()) == null) {
            return null;
        }
        return error.getBase();
    }

    public final Double getErrorLetterSpacingValue() {
        StyleElements.Measurement error;
        StyleElements.Size base;
        Double dp2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (error = complexTextBasedLetterSpacingStyle.getError()) == null || (base = error.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
    }

    public final Double getErrorLineHeightValue() {
        StyleElements.Measurement error;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (error = complexTextBasedLineHeightStyle.getError()) == null || (base = error.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public TextBasedComponentStyle getErrorTextStyle() {
        StyleElements.ComplexElementColor error;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getError() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getError() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getError() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getError() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getError() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (error = complexTextBasedTextColorStyle.getError()) != null) {
            base = error.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getFocusedBackgroundColorValue() {
        StyleElements.ComplexElementColor base;
        Integer focused;
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        return (inputTextBackgroundColorStyle == null || (base = inputTextBackgroundColorStyle.getBase()) == null || (focused = base.getFocused()) == null) ? getBaseBackgroundColorValue() : focused;
    }

    public final Integer getFocusedBorderColorValue() {
        StyleElements.ComplexElementColor base;
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null || (base = inputTextBorderColorStyle.getBase()) == null) {
            return null;
        }
        return base.getFocused();
    }

    public final Integer getFocusedMaskToggleColor() {
        StyleElements.ComplexElementColor maskToggle;
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null || (maskToggle = inputTextStrokeColorStyle.getMaskToggle()) == null) {
            return null;
        }
        return maskToggle.getFocused();
    }

    public final TextBasedComponentStyle getFocusedTextBasedStyle() {
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null), new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(getValueFocusedTextColor()))), null);
    }

    public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
        return this.fontFamily;
    }

    public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
        return this.fontSize;
    }

    public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
        return this.fontWeight;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public Integer getHeaderCancelButtonColor() {
        return getBaseTextColor();
    }

    public final StyleElements.SizeSet getInputTextBoxMargins() {
        StyleElements.MeasurementSet base;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        if (inputMarginStyle == null || (base = inputMarginStyle.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final Integer getLabelBaseTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getBase();
    }

    public final Integer getLabelDisabledTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getDisabled();
    }

    public final Integer getLabelErrorTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getErrored();
    }

    public final Integer getLabelFocusedTextColor() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
            return null;
        }
        return label.getFocused();
    }

    public final String getLabelFontFamilyValue() {
        StyleElements.FontName label;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (label = complexTextBasedFontFamilyStyle.getLabel()) == null) {
            return null;
        }
        return label.getFontName();
    }

    public final Double getLabelFontSizeValue() {
        StyleElements.Measurement label;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (label = complexTextBasedFontSizeStyle.getLabel()) == null || (base = label.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final StyleElements.FontWeight getLabelFontWeightValue() {
        StyleElements.FontWeightContainer label;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (label = complexTextBasedFontWeightStyle.getLabel()) == null) {
            return null;
        }
        return label.getBase();
    }

    public final Double getLabelLetterSpacingValue() {
        StyleElements.Measurement label;
        StyleElements.Size base;
        Double dp2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (label = complexTextBasedLetterSpacingStyle.getLabel()) == null || (base = label.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
    }

    public final Double getLabelLineHeightValue() {
        StyleElements.Measurement label;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (label = complexTextBasedLineHeightStyle.getLabel()) == null || (base = label.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final TextBasedComponentStyle getLabelTextBasedStyle() {
        StyleElements.ComplexElementColor label;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getLabel() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (label = complexTextBasedTextColorStyle.getLabel()) != null) {
            base = label.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
        return this.letterSpacing;
    }

    public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
        return this.lineHeight;
    }

    public final AttributeStyles.InputMarginStyle getMargin() {
        return this.margin;
    }

    public final Integer getPlaceholderBaseTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getBase();
    }

    public final Integer getPlaceholderDisabledTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getDisabled();
    }

    public final Integer getPlaceholderErrorTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getErrored();
    }

    public final Integer getPlaceholderFocusedTextColor() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null || (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getFocused();
    }

    public final String getPlaceholderFontFamilyValue() {
        StyleElements.FontName placeholder;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (placeholder = complexTextBasedFontFamilyStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getFontName();
    }

    public final Double getPlaceholderFontSizeValue() {
        StyleElements.Measurement placeholder;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (placeholder = complexTextBasedFontSizeStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final StyleElements.FontWeight getPlaceholderFontWeightValue() {
        StyleElements.FontWeightContainer placeholder;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (placeholder = complexTextBasedFontWeightStyle.getPlaceholder()) == null) {
            return null;
        }
        return placeholder.getBase();
    }

    public final Double getPlaceholderLetterSpacingValue() {
        StyleElements.Measurement placeholder;
        StyleElements.Size base;
        Double dp2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (placeholder = complexTextBasedLetterSpacingStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
    }

    public final Double getPlaceholderLineHeightValue() {
        StyleElements.Measurement placeholder;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (placeholder = complexTextBasedLineHeightStyle.getPlaceholder()) == null || (base = placeholder.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final TextBasedComponentStyle getPlaceholderTextBasedStyle() {
        StyleElements.ComplexElementColor placeholder;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        Integer base = null;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getPlaceholder() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (placeholder = complexTextBasedTextColorStyle.getPlaceholder()) != null) {
            base = placeholder.getBase();
        }
        return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    public final AttributeStyles.InputTextStrokeColorStyle getStrokeColor() {
        return this.strokeColor;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle
    public TextBasedComponentStyle getTextBasedStyle() {
        StyleElements.ComplexElementColor value;
        AttributeStyles.InputMarginStyle inputMarginStyle = this.margin;
        AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = new AttributeStyles.TextBasedMarginStyle(inputMarginStyle != null ? inputMarginStyle.getOption() : null);
        Integer base = null;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(complexTextBasedFontFamilyStyle != null ? complexTextBasedFontFamilyStyle.getBase() : null);
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(complexTextBasedFontSizeStyle != null ? complexTextBasedFontSizeStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(complexTextBasedFontWeightStyle != null ? complexTextBasedFontWeightStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(complexTextBasedLetterSpacingStyle != null ? complexTextBasedLetterSpacingStyle.getBase() : null);
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(complexTextBasedLineHeightStyle != null ? complexTextBasedLineHeightStyle.getValue() : null);
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle != null && (value = complexTextBasedTextColorStyle.getValue()) != null) {
            base = value.getBase();
        }
        return new TextBasedComponentStyle(textBasedMarginStyle, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(new StyleElements.SimpleElementColor(new StyleElements.SimpleElementColorValue(base))), null);
    }

    public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
        return this.textColor;
    }

    public final Integer getValueDisabledTextColor() {
        StyleElements.ComplexElementColor value;
        Integer disabled;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (disabled = value.getDisabled()) == null) ? getBaseTextColor() : disabled;
    }

    public final Integer getValueErrorTextColor() {
        StyleElements.ComplexElementColor value;
        Integer errored;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (errored = value.getErrored()) == null) ? getBaseTextColor() : errored;
    }

    public final Integer getValueFocusedTextColor() {
        StyleElements.ComplexElementColor value;
        Integer focused;
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        return (complexTextBasedTextColorStyle == null || (value = complexTextBasedTextColorStyle.getValue()) == null || (focused = value.getFocused()) == null) ? getBaseTextColor() : focused;
    }

    public final String getValueFontFamilyValue() {
        StyleElements.FontName value;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null || (value = complexTextBasedFontFamilyStyle.getValue()) == null) {
            return null;
        }
        return value.getFontName();
    }

    public final Double getValueFontSizeValue() {
        StyleElements.Measurement value;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null || (value = complexTextBasedFontSizeStyle.getValue()) == null || (base = value.getBase()) == null) {
            return null;
        }
        return base.getDp();
    }

    public final StyleElements.FontWeight getValueFontWeightValue() {
        StyleElements.FontWeightContainer value;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null || (value = complexTextBasedFontWeightStyle.getValue()) == null) {
            return null;
        }
        return value.getBase();
    }

    public final Double getValueLetterSpacingValue() {
        StyleElements.Measurement value;
        StyleElements.Size base;
        Double dp2;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        return (complexTextBasedLetterSpacingStyle == null || (value = complexTextBasedLetterSpacingStyle.getValue()) == null || (base = value.getBase()) == null || (dp2 = base.getDp()) == null) ? getBaseLetterSpacingValue() : dp2;
    }

    public final Double getValueLineHeightValue() {
        StyleElements.Measurement value;
        StyleElements.Size base;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null || (value = complexTextBasedLineHeightStyle.getValue()) == null || (base = value.getBase()) == null) {
            return null;
        }
        return base.getDp();
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
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
        if (complexTextBasedFontFamilyStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedFontFamilyStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
        if (complexTextBasedFontSizeStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedFontSizeStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
        if (complexTextBasedFontWeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedFontWeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
        if (complexTextBasedLetterSpacingStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedLetterSpacingStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
        if (complexTextBasedLineHeightStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedLineHeightStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
        if (complexTextBasedTextColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            complexTextBasedTextColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextBorderRadiusStyle inputTextBorderRadiusStyle = this.borderRadius;
        if (inputTextBorderRadiusStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextBorderRadiusStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextBorderWidthStyle inputTextBorderWidthStyle = this.borderWidth;
        if (inputTextBorderWidthStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextBorderWidthStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextBackgroundColorStyle inputTextBackgroundColorStyle = this.backgroundColor;
        if (inputTextBackgroundColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextBackgroundColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextBorderColorStyle inputTextBorderColorStyle = this.borderColor;
        if (inputTextBorderColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextBorderColorStyle.writeToParcel(dest, flags);
        }
        AttributeStyles.InputTextStrokeColorStyle inputTextStrokeColorStyle = this.strokeColor;
        if (inputTextStrokeColorStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputTextStrokeColorStyle.writeToParcel(dest, flags);
        }
    }
}
