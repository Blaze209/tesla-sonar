package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.x;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 *2\u00020\u0001:\u0004+,-*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010!\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0013\u0010%\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", Snapshot.WIDTH, "getHeight", Snapshot.HEIGHT, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustification", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "justification", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "margin", "Companion", "RemoteImageComponentStyle", "Attributes", "ContentType", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteImage implements UiComponentConfig {
    public static final String type = "image_remote";
    private final Attributes attributes;
    private final String name;
    private final RemoteImageComponentStyle styles;
    public static final Parcelable.Creator<RemoteImage> CREATOR = new Creator();

    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "", "<init>", "(Ljava/lang/String;I)V", "JSON", "SVG", "Image", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum ContentType {
        JSON,
        SVG,
        Image;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType$Companion;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "<init>", "()V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "Lcom/squareup/moshi/r;", "writer", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;)V", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion extends h<ContentType> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.squareup.moshi.h
            @x
            public void toJson(r writer, ContentType value) {
                s.k(writer, "writer");
            }

            private Companion() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.moshi.h
            @f
            public ContentType fromJson(k reader) {
                s.k(reader, "reader");
                Object objJ = reader.J();
                if (s.f(objJ, "application/json")) {
                    return ContentType.JSON;
                }
                return s.f(objJ, "image/svg+xml") ? ContentType.SVG : ContentType.Image;
            }
        }

        public static EnumEntries<ContentType> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RemoteImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoteImage createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new RemoteImage(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RemoteImageComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoteImage[] newArray(int i11) {
            return new RemoteImage[i11];
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0013\u0010-\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0013\u00101\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b0\u0010,R\u0013\u00103\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0013\u00105\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b4\u0010,R\u0013\u00107\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b6\u0010,R\u0013\u00109\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b8\u0010,R\u0013\u0010;\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b:\u0010,¨\u0006<"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$RemoteImageComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageHeightStyle;", Snapshot.HEIGHT, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageWidthStyle;", Snapshot.WIDTH, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageFillColorStyle;", "fillColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageFillColorStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageHeightStyle;", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageHeightStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageWidthStyle;", "getWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageWidthStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageJustifyStyle;", "getJustify", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageJustifyStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageMarginStyle;", "getMargin", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageMarginStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageStrokeColorStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageFillColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$RemoteImageFillColorStyle;", "getNewStrokeColorValue", "()Ljava/lang/Integer;", "newStrokeColorValue", "getNewFillColorValue", "newFillColorValue", "getNewHighlightColorValue", "newHighlightColorValue", "getNewBackgroundColorValue", "newBackgroundColorValue", "getOriginalStrokeColorValue", "originalStrokeColorValue", "getOriginalFillColorValue", "originalFillColorValue", "getOriginalHighlightColorValue", "originalHighlightColorValue", "getOriginalBackgroundColorValue", "originalBackgroundColorValue", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteImageComponentStyle implements Parcelable {
        public static final Parcelable.Creator<RemoteImageComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.RemoteImageFillColorStyle fillColor;
        private final AttributeStyles.RemoteImageHeightStyle height;
        private final AttributeStyles.RemoteImageJustifyStyle justify;
        private final AttributeStyles.RemoteImageMarginStyle margin;
        private final AttributeStyles.RemoteImageStrokeColorStyle strokeColor;
        private final AttributeStyles.RemoteImageWidthStyle width;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RemoteImageComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageComponentStyle createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new RemoteImageComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.RemoteImageStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.RemoteImageFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RemoteImageComponentStyle[] newArray(int i11) {
                return new RemoteImageComponentStyle[i11];
            }
        }

        public RemoteImageComponentStyle(AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle, AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle, AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle, AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle, AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle, AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle) {
            this.height = remoteImageHeightStyle;
            this.width = remoteImageWidthStyle;
            this.justify = remoteImageJustifyStyle;
            this.margin = remoteImageMarginStyle;
            this.strokeColor = remoteImageStrokeColorStyle;
            this.fillColor = remoteImageFillColorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final AttributeStyles.RemoteImageFillColorStyle getFillColor() {
            return this.fillColor;
        }

        public final AttributeStyles.RemoteImageHeightStyle getHeight() {
            return this.height;
        }

        public final AttributeStyles.RemoteImageJustifyStyle getJustify() {
            return this.justify;
        }

        public final AttributeStyles.RemoteImageMarginStyle getMargin() {
            return this.margin;
        }

        public final Integer getNewBackgroundColorValue() {
            StyleElements.SimpleElementColor background;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (background = remoteImageFillColorStyle.getBackground()) == null || (base = background.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewFillColorValue() {
            StyleElements.SimpleElementColor fill;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (fill = remoteImageFillColorStyle.getFill()) == null || (base = fill.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewHighlightColorValue() {
            StyleElements.SimpleElementColor highlight;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (highlight = remoteImageFillColorStyle.getHighlight()) == null || (base = highlight.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getNewStrokeColorValue() {
            StyleElements.SimpleElementColor stroke;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null || (stroke = remoteImageStrokeColorStyle.getStroke()) == null || (base = stroke.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalBackgroundColorValue() {
            StyleElements.SimpleElementColor originalBackground;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalBackground = remoteImageFillColorStyle.getOriginalBackground()) == null || (base = originalBackground.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalFillColorValue() {
            StyleElements.SimpleElementColor originalFill;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalFill = remoteImageFillColorStyle.getOriginalFill()) == null || (base = originalFill.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalHighlightColorValue() {
            StyleElements.SimpleElementColor originalHighlight;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null || (originalHighlight = remoteImageFillColorStyle.getOriginalHighlight()) == null || (base = originalHighlight.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final Integer getOriginalStrokeColorValue() {
            StyleElements.SimpleElementColor originalStroke;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null || (originalStroke = remoteImageStrokeColorStyle.getOriginalStroke()) == null || (base = originalStroke.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        public final AttributeStyles.RemoteImageStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        public final AttributeStyles.RemoteImageWidthStyle getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            AttributeStyles.RemoteImageHeightStyle remoteImageHeightStyle = this.height;
            if (remoteImageHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageWidthStyle remoteImageWidthStyle = this.width;
            if (remoteImageWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageJustifyStyle remoteImageJustifyStyle = this.justify;
            if (remoteImageJustifyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageJustifyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageMarginStyle remoteImageMarginStyle = this.margin;
            if (remoteImageMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageStrokeColorStyle remoteImageStrokeColorStyle = this.strokeColor;
            if (remoteImageStrokeColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageStrokeColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.RemoteImageFillColorStyle remoteImageFillColorStyle = this.fillColor;
            if (remoteImageFillColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImageFillColorStyle.writeToParcel(dest, flags);
            }
        }
    }

    public RemoteImage(String name, Attributes attributes, RemoteImageComponentStyle remoteImageComponentStyle) {
        s.k(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = remoteImageComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final StyleElements.Size getHeight() {
        String height;
        String strV;
        AttributeStyles.RemoteImageHeightStyle height2;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle != null && (height2 = remoteImageComponentStyle.getHeight()) != null && (base = height2.getBase()) != null && (base2 = base.getBase()) != null) {
            return base2;
        }
        Attributes attributes = getAttributes();
        if (attributes == null || (height = attributes.getHeight()) == null || (strV = t.V(height, "px", "", false, 4, null)) == null) {
            return null;
        }
        return new StyleElements.DPSize(Double.valueOf(Double.parseDouble(strV)));
    }

    public final StyleElements.PositionType getJustification() {
        AttributeStyles.RemoteImageJustifyStyle justify;
        StyleElements.Position base;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle == null || (justify = remoteImageComponentStyle.getJustify()) == null || (base = justify.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    public final StyleElements.SizeSet getMargin() {
        AttributeStyles.RemoteImageMarginStyle margin;
        StyleElements.MeasurementSet base;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle == null || (margin = remoteImageComponentStyle.getMargin()) == null || (base = margin.getBase()) == null) {
            return null;
        }
        return base.getBase();
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final RemoteImageComponentStyle getStyles() {
        return this.styles;
    }

    public final StyleElements.Size getWidth() {
        String width;
        String strV;
        AttributeStyles.RemoteImageWidthStyle width2;
        StyleElements.Measurement base;
        StyleElements.Size base2;
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle != null && (width2 = remoteImageComponentStyle.getWidth()) != null && (base = width2.getBase()) != null && (base2 = base.getBase()) != null) {
            return base2;
        }
        Attributes attributes = getAttributes();
        if (attributes == null || (width = attributes.getWidth()) == null || (strV = t.V(width, "px", "", false, 4, null)) == null) {
            return null;
        }
        return new StyleElements.DPSize(Double.valueOf(Double.parseDouble(strV)));
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
        RemoteImageComponentStyle remoteImageComponentStyle = this.styles;
        if (remoteImageComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            remoteImageComponentStyle.writeToParcel(dest, flags);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "", "localAssetName", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "localAssetContentType", ImagesContract.URL, Snapshot.WIDTH, Snapshot.HEIGHT, CMSAttributeTableGenerator.CONTENT_TYPE, "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getLocalAssetName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "getLocalAssetContentType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage$ContentType;", "getUrl", "getWidth", "getHeight", "getContentType", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final ContentType contentType;
        private final String height;
        private final JsonLogicBoolean hidden;
        private final ContentType localAssetContentType;
        private final String localAssetName;
        private final String url;
        private final String width;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Attributes(parcel.readString(), parcel.readInt() == 0 ? null : ContentType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), ContentType.valueOf(parcel.readString()), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i11) {
                return new Attributes[i11];
            }
        }

        public Attributes(String str, ContentType contentType, String url, String str2, String str3, ContentType contentType2, JsonLogicBoolean jsonLogicBoolean) {
            s.k(url, "url");
            s.k(contentType2, "contentType");
            this.localAssetName = str;
            this.localAssetContentType = contentType;
            this.url = url;
            this.width = str2;
            this.height = str3;
            this.contentType = contentType2;
            this.hidden = jsonLogicBoolean;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final ContentType getContentType() {
            return this.contentType;
        }

        public final String getHeight() {
            return this.height;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final ContentType getLocalAssetContentType() {
            return this.localAssetContentType;
        }

        public final String getLocalAssetName() {
            return this.localAssetName;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String getWidth() {
            return this.width;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.localAssetName);
            ContentType contentType = this.localAssetContentType;
            if (contentType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(contentType.name());
            }
            dest.writeString(this.url);
            dest.writeString(this.width);
            dest.writeString(this.height);
            dest.writeString(this.contentType.name());
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ Attributes(String str, ContentType contentType, String str2, String str3, String str4, ContentType contentType2, JsonLogicBoolean jsonLogicBoolean, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : contentType, str2, str3, str4, (i11 & 32) != 0 ? ContentType.Image : contentType2, (i11 & 64) != 0 ? null : jsonLogicBoolean);
        }
    }
}
