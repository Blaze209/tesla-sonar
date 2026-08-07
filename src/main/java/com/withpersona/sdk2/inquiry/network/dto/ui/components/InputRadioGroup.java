package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.squareup.moshi.i;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001e\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;", "Companion", "Attributes", "InputRadioGroupComponentStyle", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputRadioGroup implements UiComponentConfig {
    public static final String type = "input_radio_group";
    private final Attributes attributes;
    private final String name;
    private final InputRadioGroupComponentStyle styles;
    public static final Parcelable.Creator<InputRadioGroup> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputRadioGroup> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputRadioGroup createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new InputRadioGroup(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputRadioGroupComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputRadioGroup[] newArray(int i11) {
            return new InputRadioGroup[i11];
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b9\u00107R\u0011\u0010<\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b;\u00107R\u0013\u0010@\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$InputRadioGroupComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", OrcaFlavourKeys.FONT_SIZE, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "textColorHighlight", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "getFontFamily", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontFamilyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "getFontSize", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontSizeStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupFontWeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "getLetterSpacing", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLetterSpacingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "getLineHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupLineHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "getTextColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$InputRadioGroupTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "getTextColorHighlight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$TextBasedTextColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "textBasedStyle", "getDescriptionTextStyle", "descriptionTextStyle", "getErrorTextStyle", "errorTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getMargins", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "margins", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InputRadioGroupComponentStyle implements Parcelable {
        public static final Parcelable.Creator<InputRadioGroupComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.InputRadioGroupFontFamilyStyle fontFamily;
        private final AttributeStyles.InputRadioGroupFontSizeStyle fontSize;
        private final AttributeStyles.InputRadioGroupFontWeightStyle fontWeight;
        private final AttributeStyles.InputRadioGroupLetterSpacingStyle letterSpacing;
        private final AttributeStyles.InputRadioGroupLineHeightStyle lineHeight;
        private final AttributeStyles.TextBasedMarginStyle margin;
        private final AttributeStyles.InputRadioGroupTextColorStyle textColor;
        private final AttributeStyles.TextBasedTextColorStyle textColorHighlight;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputRadioGroupComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupComponentStyle createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new InputRadioGroupComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.TextBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.InputRadioGroupTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.TextBasedTextColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputRadioGroupComponentStyle[] newArray(int i11) {
                return new InputRadioGroupComponentStyle[i11];
            }
        }

        public InputRadioGroupComponentStyle(AttributeStyles.TextBasedMarginStyle textBasedMarginStyle, AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle, AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle, AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle, AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle, AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle, AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle, AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle) {
            this.margin = textBasedMarginStyle;
            this.fontFamily = inputRadioGroupFontFamilyStyle;
            this.fontSize = inputRadioGroupFontSizeStyle;
            this.fontWeight = inputRadioGroupFontWeightStyle;
            this.letterSpacing = inputRadioGroupLetterSpacingStyle;
            this.lineHeight = inputRadioGroupLineHeightStyle;
            this.textColor = inputRadioGroupTextColorStyle;
            this.textColorHighlight = textBasedTextColorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TextBasedComponentStyle getDescriptionTextStyle() {
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getDescription() : null);
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getDescription() : null), null);
        }

        public final TextBasedComponentStyle getErrorTextStyle() {
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getError() : null);
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getError() : null);
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getError() : null);
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getError() : null);
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getError() : null);
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getError() : null), null);
        }

        public final AttributeStyles.InputRadioGroupFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        public final AttributeStyles.InputRadioGroupFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        public final AttributeStyles.InputRadioGroupFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final AttributeStyles.InputRadioGroupLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        public final AttributeStyles.InputRadioGroupLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        public final AttributeStyles.TextBasedMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.SizeSet getMargins() {
            StyleElements.MeasurementSet base;
            AttributeStyles.TextBasedMarginStyle textBasedMarginStyle = this.margin;
            if (textBasedMarginStyle == null || (base = textBasedMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final TextBasedComponentStyle getTextBasedStyle() {
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            AttributeStyles.TextBasedFontFamilyStyle textBasedFontFamilyStyle = new AttributeStyles.TextBasedFontFamilyStyle(inputRadioGroupFontFamilyStyle != null ? inputRadioGroupFontFamilyStyle.getBase() : null);
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            AttributeStyles.TextBasedFontSizeStyle textBasedFontSizeStyle = new AttributeStyles.TextBasedFontSizeStyle(inputRadioGroupFontSizeStyle != null ? inputRadioGroupFontSizeStyle.getBase() : null);
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            AttributeStyles.TextBasedFontWeightStyle textBasedFontWeightStyle = new AttributeStyles.TextBasedFontWeightStyle(inputRadioGroupFontWeightStyle != null ? inputRadioGroupFontWeightStyle.getBase() : null);
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            AttributeStyles.TextBasedLetterSpacingStyle textBasedLetterSpacingStyle = new AttributeStyles.TextBasedLetterSpacingStyle(inputRadioGroupLetterSpacingStyle != null ? inputRadioGroupLetterSpacingStyle.getBase() : null);
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            AttributeStyles.TextBasedLineHeightStyle textBasedLineHeightStyle = new AttributeStyles.TextBasedLineHeightStyle(inputRadioGroupLineHeightStyle != null ? inputRadioGroupLineHeightStyle.getBase() : null);
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            return new TextBasedComponentStyle(null, null, textBasedFontFamilyStyle, textBasedFontSizeStyle, textBasedFontWeightStyle, textBasedLetterSpacingStyle, textBasedLineHeightStyle, new AttributeStyles.TextBasedTextColorStyle(inputRadioGroupTextColorStyle != null ? inputRadioGroupTextColorStyle.getBase() : null), this.textColorHighlight);
        }

        public final AttributeStyles.InputRadioGroupTextColorStyle getTextColor() {
            return this.textColor;
        }

        public final AttributeStyles.TextBasedTextColorStyle getTextColorHighlight() {
            return this.textColorHighlight;
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
            AttributeStyles.InputRadioGroupFontFamilyStyle inputRadioGroupFontFamilyStyle = this.fontFamily;
            if (inputRadioGroupFontFamilyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupFontFamilyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupFontSizeStyle inputRadioGroupFontSizeStyle = this.fontSize;
            if (inputRadioGroupFontSizeStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupFontSizeStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupFontWeightStyle inputRadioGroupFontWeightStyle = this.fontWeight;
            if (inputRadioGroupFontWeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupFontWeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupLetterSpacingStyle inputRadioGroupLetterSpacingStyle = this.letterSpacing;
            if (inputRadioGroupLetterSpacingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupLetterSpacingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupLineHeightStyle inputRadioGroupLineHeightStyle = this.lineHeight;
            if (inputRadioGroupLineHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupLineHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.InputRadioGroupTextColorStyle inputRadioGroupTextColorStyle = this.textColor;
            if (inputRadioGroupTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputRadioGroupTextColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = this.textColorHighlight;
            if (textBasedTextColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedTextColorStyle.writeToParcel(dest, flags);
            }
        }
    }

    public InputRadioGroup(String name, Attributes attributes, InputRadioGroupComponentStyle inputRadioGroupComponentStyle) {
        s.k(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = inputRadioGroupComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final InputRadioGroupComponentStyle getStyles() {
        return this.styles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
        InputRadioGroupComponentStyle inputRadioGroupComponentStyle = this.styles;
        if (inputRadioGroupComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputRadioGroupComponentStyle.writeToParcel(dest, flags);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    public /* synthetic */ InputRadioGroup(String str, Attributes attributes, InputRadioGroupComponentStyle inputRadioGroupComponentStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i11 & 4) != 0 ? null : inputRadioGroupComponentStyle);
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputRadioGroup$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "prefill", AnnotatedPrivateKey.LABEL, "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/OptionWithDescription;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getPrefill", "()Ljava/lang/String;", "getLabel", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;
        private final String label;
        private final List<OptionWithDescription> options;
        private final String prefill;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(OptionWithDescription.CREATOR.createFromParcel(parcel));
                }
                return new Attributes(string, string2, arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i11) {
                return new Attributes[i11];
            }
        }

        public Attributes(String str, String str2, List<OptionWithDescription> options, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            s.k(options, "options");
            this.prefill = str;
            this.label = str2;
            this.options = options;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getLabel() {
            return this.label;
        }

        public final List<OptionWithDescription> getOptions() {
            return this.options;
        }

        public final String getPrefill() {
            return this.prefill;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.prefill);
            dest.writeString(this.label);
            List<OptionWithDescription> list = this.options;
            dest.writeInt(list.size());
            Iterator<OptionWithDescription> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
            if (jsonLogicBoolean2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean2.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ Attributes(String str, String str2, List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, (i11 & 8) != 0 ? null : jsonLogicBoolean, (i11 & 16) != 0 ? null : jsonLogicBoolean2);
        }
    }
}
