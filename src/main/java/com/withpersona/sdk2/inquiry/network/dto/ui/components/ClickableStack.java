package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.i;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003\"#!B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentContainerConfig;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "getChildren", "()Ljava/util/List;", "children", "Companion", "ClickableStackComponentStyle", "Attributes", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ClickableStack implements UiComponentContainerConfig {
    public static final String TYPE = "clickable_stack";
    private final Attributes attributes;
    private final String name;
    private final ClickableStackComponentStyle styles;
    public static final Parcelable.Creator<ClickableStack> CREATOR = new Creator();

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u0013\u0010F\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010H\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0013\u0010J\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bI\u0010ER\u0013\u0010N\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0013\u0010P\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bO\u0010ER\u0013\u0010R\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bQ\u0010ER\u0013\u0010T\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0013\u0010X\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010Z\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bY\u0010MR\u0013\u0010\\\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\b[\u0010MR\u0013\u0010`\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010d\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0013\u0010h\u001a\u0004\u0018\u00010e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0013\u0010j\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bi\u0010WR\u0013\u0010n\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", Snapshot.BORDER_RADIUS, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAxisStyle;", "axis", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackChildSizesStyle;", "childSizes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAlignmentStyle;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackGapStyle;", "gap", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackWidthStyle;", Snapshot.WIDTH, "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAxisStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackChildSizesStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAlignmentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackGapStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackWidthStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBackgroundColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderColorStyle;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackBorderRadiusStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackPaddingStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackPaddingStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAxisStyle;", "getAxis", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAxisStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackChildSizesStyle;", "getChildSizes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackChildSizesStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAlignmentStyle;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackAlignmentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackGapStyle;", "getGap", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackGapStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ClickableStackWidthStyle;", "getBaseBackgroundColorValue", "()Ljava/lang/Integer;", "baseBackgroundColorValue", "getActiveBackgroundColorValue", "activeBackgroundColorValue", "getDisabledBackgroundColorValue", "disabledBackgroundColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getBorderWidthValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "borderWidthValue", "getBaseBorderColorValue", "baseBorderColorValue", "getActiveBorderColorValue", "activeBorderColorValue", "getDisabledBorderColorValue", "disabledBorderColorValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "borderRadiusValue", "getPaddingValue", "paddingValue", "getMarginValue", "marginValue", "", "getChildSizesValue", "()[I", "childSizesValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "getAxisValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "axisValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getAlignmentValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "alignmentValue", "getGapValue", "gapValue", "", "getWidthValue", "()Ljava/lang/Double;", "widthValue", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClickableStackComponentStyle implements Parcelable {
        public static final Parcelable.Creator<ClickableStackComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.ClickableStackAlignmentStyle alignment;
        private final AttributeStyles.ClickableStackAxisStyle axis;
        private final AttributeStyles.ClickableStackBackgroundColorStyle backgroundColor;
        private final AttributeStyles.ClickableStackBorderColorStyle borderColor;
        private final AttributeStyles.ClickableStackBorderRadiusStyle borderRadius;
        private final AttributeStyles.ClickableStackBorderWidthStyle borderWidth;
        private final AttributeStyles.ClickableStackChildSizesStyle childSizes;
        private final AttributeStyles.ClickableStackGapStyle gap;
        private final AttributeStyles.ClickableStackMarginStyle margin;
        private final AttributeStyles.ClickableStackPaddingStyle padding;
        private final AttributeStyles.ClickableStackWidthStyle width;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClickableStackComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackComponentStyle createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ClickableStackComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackAxisStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackChildSizesStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackAlignmentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ClickableStackGapStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.ClickableStackWidthStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClickableStackComponentStyle[] newArray(int i11) {
                return new ClickableStackComponentStyle[i11];
            }
        }

        public ClickableStackComponentStyle(AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle, AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle, AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle, AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle, AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle, AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle, AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle, AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle, AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle, AttributeStyles.ClickableStackGapStyle clickableStackGapStyle, AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle) {
            this.backgroundColor = clickableStackBackgroundColorStyle;
            this.borderWidth = clickableStackBorderWidthStyle;
            this.borderColor = clickableStackBorderColorStyle;
            this.borderRadius = clickableStackBorderRadiusStyle;
            this.padding = clickableStackPaddingStyle;
            this.margin = clickableStackMarginStyle;
            this.axis = clickableStackAxisStyle;
            this.childSizes = clickableStackChildSizesStyle;
            this.alignment = clickableStackAlignmentStyle;
            this.gap = clickableStackGapStyle;
            this.width = clickableStackWidthStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Integer getActiveBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        public final Integer getActiveBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getActive();
        }

        public final AttributeStyles.ClickableStackAlignmentStyle getAlignment() {
            return this.alignment;
        }

        public final StyleElements.PositionType getAlignmentValue() {
            StyleElements.Position base;
            AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle = this.alignment;
            if (clickableStackAlignmentStyle == null || (base = clickableStackAlignmentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackAxisStyle getAxis() {
            return this.axis;
        }

        public final StyleElements.Axis getAxisValue() {
            StyleElements.AxisContainer base;
            StyleElements.Axis base2;
            AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle = this.axis;
            return (clickableStackAxisStyle == null || (base = clickableStackAxisStyle.getBase()) == null || (base2 = base.getBase()) == null) ? StyleElements.Axis.HORIZONTAL : base2;
        }

        public final AttributeStyles.ClickableStackBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Integer getBaseBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getBaseBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        public final AttributeStyles.ClickableStackBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        public final StyleElements.Size getBorderRadiusValue() {
            StyleElements.Measurement base;
            AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle = this.borderRadius;
            if (clickableStackBorderRadiusStyle == null || (base = clickableStackBorderRadiusStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        public final StyleElements.SizeSet getBorderWidthValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle = this.borderWidth;
            if (clickableStackBorderWidthStyle == null || (base = clickableStackBorderWidthStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackChildSizesStyle getChildSizes() {
            return this.childSizes;
        }

        public final int[] getChildSizesValue() {
            StyleElements.ChildSizes base;
            AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle = this.childSizes;
            if (clickableStackChildSizesStyle == null || (base = clickableStackChildSizesStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final Integer getDisabledBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null || (base = clickableStackBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getDisabled();
        }

        public final Integer getDisabledBorderColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null || (base = clickableStackBorderColorStyle.getBase()) == null) {
                return null;
            }
            return base.getDisabled();
        }

        public final AttributeStyles.ClickableStackGapStyle getGap() {
            return this.gap;
        }

        public final StyleElements.Size getGapValue() {
            StyleElements.Measurement base;
            AttributeStyles.ClickableStackGapStyle clickableStackGapStyle = this.gap;
            if (clickableStackGapStyle == null || (base = clickableStackGapStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackMarginStyle getMargin() {
            return this.margin;
        }

        public final StyleElements.SizeSet getMarginValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle = this.margin;
            if (clickableStackMarginStyle == null || (base = clickableStackMarginStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackPaddingStyle getPadding() {
            return this.padding;
        }

        public final StyleElements.SizeSet getPaddingValue() {
            StyleElements.MeasurementSet base;
            AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle = this.padding;
            if (clickableStackPaddingStyle == null || (base = clickableStackPaddingStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public final AttributeStyles.ClickableStackWidthStyle getWidth() {
            return this.width;
        }

        public final Double getWidthValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle = this.width;
            if (clickableStackWidthStyle == null || (base = clickableStackWidthStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            AttributeStyles.ClickableStackBackgroundColorStyle clickableStackBackgroundColorStyle = this.backgroundColor;
            if (clickableStackBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackBorderWidthStyle clickableStackBorderWidthStyle = this.borderWidth;
            if (clickableStackBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackBorderWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackBorderColorStyle clickableStackBorderColorStyle = this.borderColor;
            if (clickableStackBorderColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackBorderColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackBorderRadiusStyle clickableStackBorderRadiusStyle = this.borderRadius;
            if (clickableStackBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackBorderRadiusStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackPaddingStyle clickableStackPaddingStyle = this.padding;
            if (clickableStackPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackPaddingStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackMarginStyle clickableStackMarginStyle = this.margin;
            if (clickableStackMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackAxisStyle clickableStackAxisStyle = this.axis;
            if (clickableStackAxisStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackAxisStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackChildSizesStyle clickableStackChildSizesStyle = this.childSizes;
            if (clickableStackChildSizesStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackChildSizesStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackAlignmentStyle clickableStackAlignmentStyle = this.alignment;
            if (clickableStackAlignmentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackAlignmentStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackGapStyle clickableStackGapStyle = this.gap;
            if (clickableStackGapStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackGapStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ClickableStackWidthStyle clickableStackWidthStyle = this.width;
            if (clickableStackWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clickableStackWidthStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ClickableStack> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClickableStack createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ClickableStack(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ClickableStackComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClickableStack[] newArray(int i11) {
            return new ClickableStack[i11];
        }
    }

    public ClickableStack(String name, Attributes attributes, ClickableStackComponentStyle clickableStackComponentStyle) {
        s.k(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = clickableStackComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentContainerConfig
    public List<UiComponentConfig> getChildren() {
        Attributes attributes = getAttributes();
        if (attributes != null) {
            return attributes.getChildren();
        }
        return null;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final ClickableStackComponentStyle getStyles() {
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
        ClickableStackComponentStyle clickableStackComponentStyle = this.styles;
        if (clickableStackComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            clickableStackComponentStyle.writeToParcel(dest, flags);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "children", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final List<UiComponentConfig> children;
        private final JsonLogicBoolean disabled;
        private final JsonLogicBoolean hidden;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                s.k(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i11 = parcel.readInt();
                    arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList.add(parcel.readParcelable(Attributes.class.getClassLoader()));
                    }
                }
                return new Attributes(arrayList, parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i11) {
                return new Attributes[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(List<? extends UiComponentConfig> list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2) {
            this.children = list;
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final List<UiComponentConfig> getChildren() {
            return this.children;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            List<UiComponentConfig> list = this.children;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UiComponentConfig> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
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

        public /* synthetic */ Attributes(List list, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? null : jsonLogicBoolean, (i11 & 4) != 0 ? null : jsonLogicBoolean2);
        }
    }

    public /* synthetic */ ClickableStack(String str, Attributes attributes, ClickableStackComponentStyle clickableStackComponentStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i11 & 4) != 0 ? null : clickableStackComponentStyle);
    }
}
