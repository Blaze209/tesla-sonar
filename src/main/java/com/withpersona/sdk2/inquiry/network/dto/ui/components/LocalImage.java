package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.u;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import java.lang.reflect.Type;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001d\u001e\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Attributes;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "Companion", "Attributes", "Image", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalImage implements UiComponentConfig {
    public static final String type = "image_local";
    private final Attributes attributes;
    private final String name;
    private final LocalImageComponentStyle styles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LocalImage> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Companion;", "", "<init>", "()V", "Lcom/squareup/moshi/h$e;", "createAdapter", "()Lcom/squareup/moshi/h$e;", "", "type", "Ljava/lang/String;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h createAdapter$lambda$0(Type type, Set set, u uVar) {
            if (s.f(type, Image.class)) {
                return u20.a.a(Image.class).d(null).nullSafe();
            }
            return null;
        }

        public final h.e createAdapter() {
            return new h.e() { // from class: com.withpersona.sdk2.inquiry.network.dto.ui.components.a
                @Override // com.squareup.moshi.h.e
                public final h create(Type type, Set set, u uVar) {
                    return LocalImage.Companion.createAdapter$lambda$0(type, set, uVar);
                }
            };
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalImage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalImage createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new LocalImage(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LocalImageComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalImage[] newArray(int i11) {
            return new LocalImage[i11];
        }
    }

    @i(generateAdapter = false)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;", "", "<init>", "(Ljava/lang/String;I)V", "START_HERO", "DOCUMENT_START_HERO", "ANIMATED_CHECK", "FAILED", "ID_FRONT_FAILED", "ID_BACK_FAILED", "SELFIE_FAILED", "DOCUMENT_FAILED", "PASSPORT_NFC_START_HERO", "PASSPORT_NFC_SCAN_HERO", "PASSPORT_NFC_SCAN_READY_HERO", "PASSPORT_NFC_CHECK", "GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED", "GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED", "GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE", "GOVERNMENT_ID_NFC_SCAN_ID_CARD", "GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT", "CREATE_PERSONA_CTA_CARD_ICON", "OPTION_CHECK_ICON", "OPTION_CHEVRON_ICON", "OPTION_FLAG_ICON", "OPTION_GLOBE_ICON", "OPTION_HOME_ICON", "OPTION_ID_DOCUMENT_ICON", "OPTION_ID_ICON", "OPTION_PHONE_ICON", "OPTION_USER_ICON", "REUSABLE_PERSONA_LOGO", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Image {
        START_HERO,
        DOCUMENT_START_HERO,
        ANIMATED_CHECK,
        FAILED,
        ID_FRONT_FAILED,
        ID_BACK_FAILED,
        SELFIE_FAILED,
        DOCUMENT_FAILED,
        PASSPORT_NFC_START_HERO,
        PASSPORT_NFC_SCAN_HERO,
        PASSPORT_NFC_SCAN_READY_HERO,
        PASSPORT_NFC_CHECK,
        GOVERNMENT_ID_NFC_SCAN_FRONT_CLOSED,
        GOVERNMENT_ID_NFC_SCAN_BACK_CLOSED,
        GOVERNMENT_ID_NFC_SCAN_PHOTO_PAGE,
        GOVERNMENT_ID_NFC_SCAN_ID_CARD,
        GOVERNMENT_ID_NFC_SCAN_BACK_THEN_FRONT,
        CREATE_PERSONA_CTA_CARD_ICON,
        OPTION_CHECK_ICON,
        OPTION_CHEVRON_ICON,
        OPTION_FLAG_ICON,
        OPTION_GLOBE_ICON,
        OPTION_HOME_ICON,
        OPTION_ID_DOCUMENT_ICON,
        OPTION_ID_ICON,
        OPTION_PHONE_ICON,
        OPTION_USER_ICON,
        REUSABLE_PERSONA_LOGO;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<Image> getEntries() {
            return $ENTRIES;
        }
    }

    public LocalImage(String name, Attributes attributes, LocalImageComponentStyle localImageComponentStyle) {
        s.k(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = localImageComponentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final LocalImageComponentStyle getStyles() {
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
        LocalImageComponentStyle localImageComponentStyle = this.styles;
        if (localImageComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            localImageComponentStyle.writeToParcel(dest, flags);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;", "imageKey", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;", "getImageKey", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/LocalImage$Image;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Attributes implements UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final JsonLogicBoolean hidden;
        private final Image imageKey;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Attributes(parcel.readInt() == 0 ? null : Image.valueOf(parcel.readString()), parcel.readInt() != 0 ? JsonLogicBoolean.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i11) {
                return new Attributes[i11];
            }
        }

        public Attributes(Image image, JsonLogicBoolean jsonLogicBoolean) {
            this.imageKey = image;
            this.hidden = jsonLogicBoolean;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final Image getImageKey() {
            return this.imageKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            Image image = this.imageKey;
            if (image == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(image.name());
            }
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ Attributes(Image image, JsonLogicBoolean jsonLogicBoolean, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(image, (i11 & 2) != 0 ? null : jsonLogicBoolean);
        }
    }

    public /* synthetic */ LocalImage(String str, Attributes attributes, LocalImageComponentStyle localImageComponentStyle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, attributes, (i11 & 4) != 0 ? null : localImageComponentStyle);
    }
}
