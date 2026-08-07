package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonComponentStylingKt;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0005*+,-)B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "styles", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "component3", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "copy", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "getAttributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "getStyles", "Companion", "Attributes", "Provider", "ClientMetadata", "MdocComponentStyle", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Mdoc implements Parcelable, UiComponentConfig {
    public static final String type = "mdoc";
    private final Attributes attributes;
    private final String name;
    private final MdocComponentStyle styles;
    public static final Parcelable.Creator<Mdoc> CREATOR = new Creator();

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "Landroid/os/Parcelable;", "", "requestJsonString", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRequestJsonString", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClientMetadata implements Parcelable {
        public static final Parcelable.Creator<ClientMetadata> CREATOR = new Creator();
        private final String requestJsonString;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ClientMetadata> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientMetadata createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ClientMetadata(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ClientMetadata[] newArray(int i11) {
                return new ClientMetadata[i11];
            }
        }

        public ClientMetadata(@g(name = "requestJSONString") String str) {
            this.requestJsonString = str;
        }

        public static /* synthetic */ ClientMetadata copy$default(ClientMetadata clientMetadata, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = clientMetadata.requestJsonString;
            }
            return clientMetadata.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRequestJsonString() {
            return this.requestJsonString;
        }

        public final ClientMetadata copy(@g(name = "requestJSONString") String requestJsonString) {
            return new ClientMetadata(requestJsonString);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ClientMetadata) && s.f(this.requestJsonString, ((ClientMetadata) other).requestJsonString);
        }

        public final String getRequestJsonString() {
            return this.requestJsonString;
        }

        public int hashCode() {
            String str = this.requestJsonString;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ClientMetadata(requestJsonString=" + this.requestJsonString + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.requestJsonString);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Mdoc> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Mdoc createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new Mdoc(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MdocComponentStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Mdoc[] newArray(int i11) {
            return new Mdoc[i11];
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020%¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bH\u0010IJÄ\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fHÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010M\u001a\u00020LHÖ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020%HÖ\u0001¢\u0006\u0004\bO\u0010+J\u001a\u0010S\u001a\u00020R2\b\u0010Q\u001a\u0004\u0018\u00010PHÖ\u0003¢\u0006\u0004\bS\u0010TR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010U\u001a\u0004\bV\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010W\u001a\u0004\bX\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010Y\u001a\u0004\bZ\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010[\u001a\u0004\b\\\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010]\u001a\u0004\b^\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010_\u001a\u0004\b`\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010a\u001a\u0004\bb\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010c\u001a\u0004\bd\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010e\u001a\u0004\bf\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010g\u001a\u0004\bh\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010i\u001a\u0004\bj\u0010AR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010k\u001a\u0004\bl\u0010CR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010m\u001a\u0004\bn\u0010ER\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010o\u001a\u0004\bp\u0010GR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010q\u001a\u0004\br\u0010IR\u0016\u0010v\u001a\u0004\u0018\u00010s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0016\u0010x\u001a\u0004\u0018\u00010s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010uR\u0016\u0010|\u001a\u0004\u0018\u00010y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0017\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0019\u0010\u0083\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0085\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0082\u0001R\u0019\u0010\u0087\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0082\u0001R\u0018\u0010\u0089\u0001\u001a\u0004\u0018\u00010}8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u007fR\u0018\u0010\u008b\u0001\u001a\u0004\u0018\u00010L8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010NR\u001a\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008c\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0091\u0001\u001a\u0004\u0018\u00010}8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010\u007fR\u0019\u0010\u0093\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0082\u0001R\u0017\u0010\u0095\u0001\u001a\u00020%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0082\u0001R\u0019\u0010\u0097\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0082\u0001R\u0018\u0010\u0099\u0001\u001a\u0004\u0018\u00010}8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u007fR\u0018\u0010\u009b\u0001\u001a\u0004\u0018\u00010}8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010\u007fR\u0019\u0010\u009d\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u0082\u0001R\u0019\u0010\u009f\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u0082\u0001R\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010%8VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010\u0082\u0001R\u0018\u0010£\u0001\u001a\u0004\u0018\u00010}8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010\u007fR\u0018\u0010¥\u0001\u001a\u0004\u0018\u00010}8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u007fR\u0015\u0010©\u0001\u001a\u00030¦\u00018F¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001¨\u0006ª\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/BaseButtonComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", Snapshot.WIDTH, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", Snapshot.HEIGHT, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "justify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "margin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", Snapshot.BORDER_RADIUS, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "fontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", OrcaFlavourKeys.FONT_SIZE, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "letterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "lineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "textColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "borderWidth", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "component2", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "component3", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "component4", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "component5", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "component6", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "component7", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "component8", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "component9", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "component10", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "component11", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "component12", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "component13", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "component14", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "component15", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$MdocComponentStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedPaddingStyle;", "getPadding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedWidthStyle;", "getWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedHeightStyle;", "getHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedJustifyStyle;", "getJustify", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedMarginStyle;", "getMargin", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderRadiusStyle;", "getBorderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "getFontFamily", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "getFontSize", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "getFontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "getLetterSpacing", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "getLineHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ComplexTextBasedTextColorStyle;", "getTextColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBackgroundColorStyle;", "getBackgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderColorStyle;", "getBorderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$ButtonBasedBorderWidthStyle;", "getBorderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "paddingValue", "getMarginValue", "marginValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getJustificationValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "justificationValue", "", "getFontSizeValue", "()Ljava/lang/Double;", "fontSizeValue", "getBaseTextColorValue", "()Ljava/lang/Integer;", "baseTextColorValue", "getActiveTextColorValue", "activeTextColorValue", "getDisabledTextColorValue", "disabledTextColorValue", "getLetterSpacingValue", "letterSpacingValue", "getFontNameValue", "fontNameValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "getFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "fontWeightValue", "getLineHeightValue", "lineHeightValue", "getBaseBackgroundColorValue", "baseBackgroundColorValue", "getActiveBackgroundColorValue", "activeBackgroundColorValue", "getDisabledBackgroundColorValue", "disabledBackgroundColorValue", "getHeightValue", "heightValue", "getWidthValue", "widthValue", "getBaseBorderColorValue", "baseBorderColorValue", "getActiveBorderColorValue", "activeBorderColorValue", "getDisabledBorderColorValue", "disabledBorderColorValue", "getBorderRadiusValue", "borderRadiusValue", "getBorderWidthValue", "borderWidthValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getErrorLabelStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorLabelStyle", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MdocComponentStyle implements Parcelable, BaseButtonComponentStyle {
        public static final Parcelable.Creator<MdocComponentStyle> CREATOR = new Creator();
        private final AttributeStyles.ButtonBasedBackgroundColorStyle backgroundColor;
        private final AttributeStyles.ButtonBasedBorderColorStyle borderColor;
        private final AttributeStyles.ButtonBasedBorderRadiusStyle borderRadius;
        private final AttributeStyles.ButtonBasedBorderWidthStyle borderWidth;
        private final AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily;
        private final AttributeStyles.ComplexTextBasedFontSizeStyle fontSize;
        private final AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight;
        private final AttributeStyles.ButtonBasedHeightStyle height;
        private final AttributeStyles.ButtonBasedJustifyStyle justify;
        private final AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing;
        private final AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight;
        private final AttributeStyles.ButtonBasedMarginStyle margin;
        private final AttributeStyles.ButtonBasedPaddingStyle padding;
        private final AttributeStyles.ComplexTextBasedTextColorStyle textColor;
        private final AttributeStyles.ButtonBasedWidthStyle width;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MdocComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MdocComponentStyle createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new MdocComponentStyle(parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedWidthStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedJustifyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedMarginStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontFamilyStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontSizeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedFontWeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLetterSpacingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedLineHeightStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ComplexTextBasedTextColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.ButtonBasedBorderWidthStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MdocComponentStyle[] newArray(int i11) {
                return new MdocComponentStyle[i11];
            }
        }

        public MdocComponentStyle(AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle, AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle, AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle, AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle, AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle, AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle, AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle, AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle, AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle, AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle, AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle, AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle, AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle, AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle, AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle) {
            this.padding = buttonBasedPaddingStyle;
            this.width = buttonBasedWidthStyle;
            this.height = buttonBasedHeightStyle;
            this.justify = buttonBasedJustifyStyle;
            this.margin = buttonBasedMarginStyle;
            this.borderRadius = buttonBasedBorderRadiusStyle;
            this.fontFamily = complexTextBasedFontFamilyStyle;
            this.fontSize = complexTextBasedFontSizeStyle;
            this.fontWeight = complexTextBasedFontWeightStyle;
            this.letterSpacing = complexTextBasedLetterSpacingStyle;
            this.lineHeight = complexTextBasedLineHeightStyle;
            this.textColor = complexTextBasedTextColorStyle;
            this.backgroundColor = buttonBasedBackgroundColorStyle;
            this.borderColor = buttonBasedBorderColorStyle;
            this.borderWidth = buttonBasedBorderWidthStyle;
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AttributeStyles.ButtonBasedPaddingStyle getPadding() {
            return this.padding;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
            return this.textColor;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final AttributeStyles.ButtonBasedBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final AttributeStyles.ButtonBasedBorderColorStyle getBorderColor() {
            return this.borderColor;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final AttributeStyles.ButtonBasedBorderWidthStyle getBorderWidth() {
            return this.borderWidth;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AttributeStyles.ButtonBasedWidthStyle getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final AttributeStyles.ButtonBasedHeightStyle getHeight() {
            return this.height;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final AttributeStyles.ButtonBasedJustifyStyle getJustify() {
            return this.justify;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final AttributeStyles.ButtonBasedMarginStyle getMargin() {
            return this.margin;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final AttributeStyles.ButtonBasedBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        public final MdocComponentStyle copy(AttributeStyles.ButtonBasedPaddingStyle padding, AttributeStyles.ButtonBasedWidthStyle width, AttributeStyles.ButtonBasedHeightStyle height, AttributeStyles.ButtonBasedJustifyStyle justify, AttributeStyles.ButtonBasedMarginStyle margin, AttributeStyles.ButtonBasedBorderRadiusStyle borderRadius, AttributeStyles.ComplexTextBasedFontFamilyStyle fontFamily, AttributeStyles.ComplexTextBasedFontSizeStyle fontSize, AttributeStyles.ComplexTextBasedFontWeightStyle fontWeight, AttributeStyles.ComplexTextBasedLetterSpacingStyle letterSpacing, AttributeStyles.ComplexTextBasedLineHeightStyle lineHeight, AttributeStyles.ComplexTextBasedTextColorStyle textColor, AttributeStyles.ButtonBasedBackgroundColorStyle backgroundColor, AttributeStyles.ButtonBasedBorderColorStyle borderColor, AttributeStyles.ButtonBasedBorderWidthStyle borderWidth) {
            return new MdocComponentStyle(padding, width, height, justify, margin, borderRadius, fontFamily, fontSize, fontWeight, letterSpacing, lineHeight, textColor, backgroundColor, borderColor, borderWidth);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MdocComponentStyle)) {
                return false;
            }
            MdocComponentStyle mdocComponentStyle = (MdocComponentStyle) other;
            return s.f(this.padding, mdocComponentStyle.padding) && s.f(this.width, mdocComponentStyle.width) && s.f(this.height, mdocComponentStyle.height) && s.f(this.justify, mdocComponentStyle.justify) && s.f(this.margin, mdocComponentStyle.margin) && s.f(this.borderRadius, mdocComponentStyle.borderRadius) && s.f(this.fontFamily, mdocComponentStyle.fontFamily) && s.f(this.fontSize, mdocComponentStyle.fontSize) && s.f(this.fontWeight, mdocComponentStyle.fontWeight) && s.f(this.letterSpacing, mdocComponentStyle.letterSpacing) && s.f(this.lineHeight, mdocComponentStyle.lineHeight) && s.f(this.textColor, mdocComponentStyle.textColor) && s.f(this.backgroundColor, mdocComponentStyle.backgroundColor) && s.f(this.borderColor, mdocComponentStyle.borderColor) && s.f(this.borderWidth, mdocComponentStyle.borderWidth);
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
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getActive();
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
            StyleElements.ComplexElementColor label;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            if (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null) {
                return null;
            }
            return label.getBase();
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
            StyleElements.ComplexElementColor label;
            Integer disabled;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            return (complexTextBasedTextColorStyle == null || (label = complexTextBasedTextColorStyle.getLabel()) == null || (disabled = label.getDisabled()) == null) ? getBaseTextColorValue() : disabled;
        }

        public final TextBasedComponentStyle getErrorLabelStyle() {
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

        public final AttributeStyles.ComplexTextBasedFontFamilyStyle getFontFamily() {
            return this.fontFamily;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public String getFontNameValue() {
            StyleElements.FontName base;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            if (complexTextBasedFontFamilyStyle == null || (base = complexTextBasedFontFamilyStyle.getBase()) == null) {
                return null;
            }
            return base.getFontName();
        }

        public final AttributeStyles.ComplexTextBasedFontSizeStyle getFontSize() {
            return this.fontSize;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getFontSizeValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            if (complexTextBasedFontSizeStyle == null || (base = complexTextBasedFontSizeStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public final AttributeStyles.ComplexTextBasedFontWeightStyle getFontWeight() {
            return this.fontWeight;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public StyleElements.FontWeight getFontWeightValue() {
            StyleElements.FontWeightContainer base;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            if (complexTextBasedFontWeightStyle == null || (base = complexTextBasedFontWeightStyle.getBase()) == null) {
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

        public final AttributeStyles.ComplexTextBasedLetterSpacingStyle getLetterSpacing() {
            return this.letterSpacing;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getLetterSpacingValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            if (complexTextBasedLetterSpacingStyle == null || (base = complexTextBasedLetterSpacingStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getDp();
        }

        public final AttributeStyles.ComplexTextBasedLineHeightStyle getLineHeight() {
            return this.lineHeight;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.BaseButtonComponentStyle
        public Double getLineHeightValue() {
            StyleElements.Measurement base;
            StyleElements.Size base2;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            if (complexTextBasedLineHeightStyle == null || (base = complexTextBasedLineHeightStyle.getBase()) == null || (base2 = base.getBase()) == null) {
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

        public final AttributeStyles.ComplexTextBasedTextColorStyle getTextColor() {
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

        public int hashCode() {
            AttributeStyles.ButtonBasedPaddingStyle buttonBasedPaddingStyle = this.padding;
            int iHashCode = (buttonBasedPaddingStyle == null ? 0 : buttonBasedPaddingStyle.hashCode()) * 31;
            AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
            int iHashCode2 = (iHashCode + (buttonBasedWidthStyle == null ? 0 : buttonBasedWidthStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
            int iHashCode3 = (iHashCode2 + (buttonBasedHeightStyle == null ? 0 : buttonBasedHeightStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
            int iHashCode4 = (iHashCode3 + (buttonBasedJustifyStyle == null ? 0 : buttonBasedJustifyStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
            int iHashCode5 = (iHashCode4 + (buttonBasedMarginStyle == null ? 0 : buttonBasedMarginStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
            int iHashCode6 = (iHashCode5 + (buttonBasedBorderRadiusStyle == null ? 0 : buttonBasedBorderRadiusStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = this.fontFamily;
            int iHashCode7 = (iHashCode6 + (complexTextBasedFontFamilyStyle == null ? 0 : complexTextBasedFontFamilyStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = this.fontSize;
            int iHashCode8 = (iHashCode7 + (complexTextBasedFontSizeStyle == null ? 0 : complexTextBasedFontSizeStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = this.fontWeight;
            int iHashCode9 = (iHashCode8 + (complexTextBasedFontWeightStyle == null ? 0 : complexTextBasedFontWeightStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = this.letterSpacing;
            int iHashCode10 = (iHashCode9 + (complexTextBasedLetterSpacingStyle == null ? 0 : complexTextBasedLetterSpacingStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = this.lineHeight;
            int iHashCode11 = (iHashCode10 + (complexTextBasedLineHeightStyle == null ? 0 : complexTextBasedLineHeightStyle.hashCode())) * 31;
            AttributeStyles.ComplexTextBasedTextColorStyle complexTextBasedTextColorStyle = this.textColor;
            int iHashCode12 = (iHashCode11 + (complexTextBasedTextColorStyle == null ? 0 : complexTextBasedTextColorStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBackgroundColorStyle buttonBasedBackgroundColorStyle = this.backgroundColor;
            int iHashCode13 = (iHashCode12 + (buttonBasedBackgroundColorStyle == null ? 0 : buttonBasedBackgroundColorStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBorderColorStyle buttonBasedBorderColorStyle = this.borderColor;
            int iHashCode14 = (iHashCode13 + (buttonBasedBorderColorStyle == null ? 0 : buttonBasedBorderColorStyle.hashCode())) * 31;
            AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
            return iHashCode14 + (buttonBasedBorderWidthStyle != null ? buttonBasedBorderWidthStyle.hashCode() : 0);
        }

        public String toString() {
            return "MdocComponentStyle(padding=" + this.padding + ", width=" + this.width + ", height=" + this.height + ", justify=" + this.justify + ", margin=" + this.margin + ", borderRadius=" + this.borderRadius + ", fontFamily=" + this.fontFamily + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", letterSpacing=" + this.letterSpacing + ", lineHeight=" + this.lineHeight + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", borderColor=" + this.borderColor + ", borderWidth=" + this.borderWidth + ")";
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
            AttributeStyles.ButtonBasedWidthStyle buttonBasedWidthStyle = this.width;
            if (buttonBasedWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedWidthStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedHeightStyle buttonBasedHeightStyle = this.height;
            if (buttonBasedHeightStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedHeightStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedJustifyStyle buttonBasedJustifyStyle = this.justify;
            if (buttonBasedJustifyStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedJustifyStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedMarginStyle buttonBasedMarginStyle = this.margin;
            if (buttonBasedMarginStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedMarginStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.ButtonBasedBorderRadiusStyle buttonBasedBorderRadiusStyle = this.borderRadius;
            if (buttonBasedBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBorderRadiusStyle.writeToParcel(dest, flags);
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
            AttributeStyles.ButtonBasedBorderWidthStyle buttonBasedBorderWidthStyle = this.borderWidth;
            if (buttonBasedBorderWidthStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonBasedBorderWidthStyle.writeToParcel(dest, flags);
            }
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jd\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0016R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010 ¨\u00065"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "Landroid/os/Parcelable;", "", "providerType", "idType", "merchantId", "nonce", "", "minAge", "", "elementToStoreLength", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "clientMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/Map;", "component7", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProviderType", "getIdType", "getMerchantId", "getNonce", "I", "getMinAge", "Ljava/util/Map;", "getElementToStoreLength", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$ClientMetadata;", "getClientMetadata", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Provider implements Parcelable {
        public static final Parcelable.Creator<Provider> CREATOR = new Creator();
        private final ClientMetadata clientMetadata;
        private final Map<String, Integer> elementToStoreLength;
        private final String idType;
        private final String merchantId;
        private final int minAge;
        private final String nonce;
        private final String providerType;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Provider> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Provider createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
                return new Provider(string, string2, string3, string4, i11, linkedHashMap, parcel.readInt() == 0 ? null : ClientMetadata.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Provider[] newArray(int i11) {
                return new Provider[i11];
            }
        }

        public Provider(String providerType, String idType, String merchantId, String nonce, int i11, Map<String, Integer> elementToStoreLength, ClientMetadata clientMetadata) {
            s.k(providerType, "providerType");
            s.k(idType, "idType");
            s.k(merchantId, "merchantId");
            s.k(nonce, "nonce");
            s.k(elementToStoreLength, "elementToStoreLength");
            this.providerType = providerType;
            this.idType = idType;
            this.merchantId = merchantId;
            this.nonce = nonce;
            this.minAge = i11;
            this.elementToStoreLength = elementToStoreLength;
            this.clientMetadata = clientMetadata;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Provider copy$default(Provider provider, String str, String str2, String str3, String str4, int i11, Map map, ClientMetadata clientMetadata, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = provider.providerType;
            }
            if ((i12 & 2) != 0) {
                str2 = provider.idType;
            }
            if ((i12 & 4) != 0) {
                str3 = provider.merchantId;
            }
            if ((i12 & 8) != 0) {
                str4 = provider.nonce;
            }
            if ((i12 & 16) != 0) {
                i11 = provider.minAge;
            }
            if ((i12 & 32) != 0) {
                map = provider.elementToStoreLength;
            }
            if ((i12 & 64) != 0) {
                clientMetadata = provider.clientMetadata;
            }
            Map map2 = map;
            ClientMetadata clientMetadata2 = clientMetadata;
            int i13 = i11;
            String str5 = str3;
            return provider.copy(str, str2, str5, str4, i13, map2, clientMetadata2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProviderType() {
            return this.providerType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getIdType() {
            return this.idType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMerchantId() {
            return this.merchantId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getMinAge() {
            return this.minAge;
        }

        public final Map<String, Integer> component6() {
            return this.elementToStoreLength;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final ClientMetadata getClientMetadata() {
            return this.clientMetadata;
        }

        public final Provider copy(String providerType, String idType, String merchantId, String nonce, int minAge, Map<String, Integer> elementToStoreLength, ClientMetadata clientMetadata) {
            s.k(providerType, "providerType");
            s.k(idType, "idType");
            s.k(merchantId, "merchantId");
            s.k(nonce, "nonce");
            s.k(elementToStoreLength, "elementToStoreLength");
            return new Provider(providerType, idType, merchantId, nonce, minAge, elementToStoreLength, clientMetadata);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Provider)) {
                return false;
            }
            Provider provider = (Provider) other;
            return s.f(this.providerType, provider.providerType) && s.f(this.idType, provider.idType) && s.f(this.merchantId, provider.merchantId) && s.f(this.nonce, provider.nonce) && this.minAge == provider.minAge && s.f(this.elementToStoreLength, provider.elementToStoreLength) && s.f(this.clientMetadata, provider.clientMetadata);
        }

        public final ClientMetadata getClientMetadata() {
            return this.clientMetadata;
        }

        public final Map<String, Integer> getElementToStoreLength() {
            return this.elementToStoreLength;
        }

        public final String getIdType() {
            return this.idType;
        }

        public final String getMerchantId() {
            return this.merchantId;
        }

        public final int getMinAge() {
            return this.minAge;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getProviderType() {
            return this.providerType;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.providerType.hashCode() * 31) + this.idType.hashCode()) * 31) + this.merchantId.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Integer.hashCode(this.minAge)) * 31) + this.elementToStoreLength.hashCode()) * 31;
            ClientMetadata clientMetadata = this.clientMetadata;
            return iHashCode + (clientMetadata == null ? 0 : clientMetadata.hashCode());
        }

        public String toString() {
            return "Provider(providerType=" + this.providerType + ", idType=" + this.idType + ", merchantId=" + this.merchantId + ", nonce=" + this.nonce + ", minAge=" + this.minAge + ", elementToStoreLength=" + this.elementToStoreLength + ", clientMetadata=" + this.clientMetadata + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.providerType);
            dest.writeString(this.idType);
            dest.writeString(this.merchantId);
            dest.writeString(this.nonce);
            dest.writeInt(this.minAge);
            Map<String, Integer> map = this.elementToStoreLength;
            dest.writeInt(map.size());
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeInt(entry.getValue().intValue());
            }
            ClientMetadata clientMetadata = this.clientMetadata;
            if (clientMetadata == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                clientMetadata.writeToParcel(dest, flags);
            }
        }
    }

    public Mdoc(String name, Attributes attributes, MdocComponentStyle mdocComponentStyle) {
        s.k(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = mdocComponentStyle;
    }

    public static /* synthetic */ Mdoc copy$default(Mdoc mdoc, String str, Attributes attributes, MdocComponentStyle mdocComponentStyle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mdoc.name;
        }
        if ((i11 & 2) != 0) {
            attributes = mdoc.attributes;
        }
        if ((i11 & 4) != 0) {
            mdocComponentStyle = mdoc.styles;
        }
        return mdoc.copy(str, attributes, mdocComponentStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Attributes getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MdocComponentStyle getStyles() {
        return this.styles;
    }

    public final Mdoc copy(String name, Attributes attributes, MdocComponentStyle styles) {
        s.k(name, "name");
        return new Mdoc(name, attributes, styles);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mdoc)) {
            return false;
        }
        Mdoc mdoc = (Mdoc) other;
        return s.f(this.name, mdoc.name) && s.f(this.attributes, mdoc.attributes) && s.f(this.styles, mdoc.styles);
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public String getName() {
        return this.name;
    }

    public final MdocComponentStyle getStyles() {
        return this.styles;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Attributes attributes = this.attributes;
        int iHashCode2 = (iHashCode + (attributes == null ? 0 : attributes.hashCode())) * 31;
        MdocComponentStyle mdocComponentStyle = this.styles;
        return iHashCode2 + (mdocComponentStyle != null ? mdocComponentStyle.hashCode() : 0);
    }

    public String toString() {
        return "Mdoc(name=" + this.name + ", attributes=" + this.attributes + ", styles=" + this.styles + ")";
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
        MdocComponentStyle mdocComponentStyle = this.styles;
        if (mdocComponentStyle == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mdocComponentStyle.writeToParcel(dest, flags);
        }
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig
    public Attributes getAttributes() {
        return this.attributes;
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(Jx\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u001a\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b;\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b<\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010(¨\u0006?"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "provider", "", "noMdocAvailableText", "errorRetrievingMdocText", "", "showWhenMdocNotAvailable", "successfulMdocRetrievalTransitionComponentName", "autoSubmitCountdownText", "", "autoSubmitIntervalSeconds", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "component2", "component3", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Z", "component7", "component8", "component9", "()Ljava/lang/Integer;", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Attributes;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getHidden", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "getProvider", "Ljava/lang/String;", "getNoMdocAvailableText", "getErrorRetrievingMdocText", "Z", "getShowWhenMdocNotAvailable", "getSuccessfulMdocRetrievalTransitionComponentName", "getAutoSubmitCountdownText", "Ljava/lang/Integer;", "getAutoSubmitIntervalSeconds", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Attributes implements Parcelable, UiComponentAttributes {
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();
        private final String autoSubmitCountdownText;
        private final Integer autoSubmitIntervalSeconds;
        private final JsonLogicBoolean disabled;
        private final String errorRetrievingMdocText;
        private final JsonLogicBoolean hidden;
        private final String noMdocAvailableText;
        private final Provider provider;
        private final boolean showWhenMdocNotAvailable;
        private final String successfulMdocRetrievalTransitionComponentName;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Attributes(parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel), Provider.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i11) {
                return new Attributes[i11];
            }
        }

        public Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Provider provider, String str, String str2, boolean z11, String str3, String str4, Integer num) {
            s.k(provider, "provider");
            this.disabled = jsonLogicBoolean;
            this.hidden = jsonLogicBoolean2;
            this.provider = provider;
            this.noMdocAvailableText = str;
            this.errorRetrievingMdocText = str2;
            this.showWhenMdocNotAvailable = z11;
            this.successfulMdocRetrievalTransitionComponentName = str3;
            this.autoSubmitCountdownText = str4;
            this.autoSubmitIntervalSeconds = num;
        }

        public static /* synthetic */ Attributes copy$default(Attributes attributes, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Provider provider, String str, String str2, boolean z11, String str3, String str4, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                jsonLogicBoolean = attributes.disabled;
            }
            if ((i11 & 2) != 0) {
                jsonLogicBoolean2 = attributes.hidden;
            }
            if ((i11 & 4) != 0) {
                provider = attributes.provider;
            }
            if ((i11 & 8) != 0) {
                str = attributes.noMdocAvailableText;
            }
            if ((i11 & 16) != 0) {
                str2 = attributes.errorRetrievingMdocText;
            }
            if ((i11 & 32) != 0) {
                z11 = attributes.showWhenMdocNotAvailable;
            }
            if ((i11 & 64) != 0) {
                str3 = attributes.successfulMdocRetrievalTransitionComponentName;
            }
            if ((i11 & 128) != 0) {
                str4 = attributes.autoSubmitCountdownText;
            }
            if ((i11 & 256) != 0) {
                num = attributes.autoSubmitIntervalSeconds;
            }
            String str5 = str4;
            Integer num2 = num;
            boolean z12 = z11;
            String str6 = str3;
            String str7 = str2;
            Provider provider2 = provider;
            return attributes.copy(jsonLogicBoolean, jsonLogicBoolean2, provider2, str, str7, z12, str6, str5, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Provider getProvider() {
            return this.provider;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getNoMdocAvailableText() {
            return this.noMdocAvailableText;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getErrorRetrievingMdocText() {
            return this.errorRetrievingMdocText;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getShowWhenMdocNotAvailable() {
            return this.showWhenMdocNotAvailable;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getSuccessfulMdocRetrievalTransitionComponentName() {
            return this.successfulMdocRetrievalTransitionComponentName;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getAutoSubmitCountdownText() {
            return this.autoSubmitCountdownText;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getAutoSubmitIntervalSeconds() {
            return this.autoSubmitIntervalSeconds;
        }

        public final Attributes copy(JsonLogicBoolean disabled, JsonLogicBoolean hidden, Provider provider, String noMdocAvailableText, String errorRetrievingMdocText, boolean showWhenMdocNotAvailable, String successfulMdocRetrievalTransitionComponentName, String autoSubmitCountdownText, Integer autoSubmitIntervalSeconds) {
            s.k(provider, "provider");
            return new Attributes(disabled, hidden, provider, noMdocAvailableText, errorRetrievingMdocText, showWhenMdocNotAvailable, successfulMdocRetrievalTransitionComponentName, autoSubmitCountdownText, autoSubmitIntervalSeconds);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attributes)) {
                return false;
            }
            Attributes attributes = (Attributes) other;
            return s.f(this.disabled, attributes.disabled) && s.f(this.hidden, attributes.hidden) && s.f(this.provider, attributes.provider) && s.f(this.noMdocAvailableText, attributes.noMdocAvailableText) && s.f(this.errorRetrievingMdocText, attributes.errorRetrievingMdocText) && this.showWhenMdocNotAvailable == attributes.showWhenMdocNotAvailable && s.f(this.successfulMdocRetrievalTransitionComponentName, attributes.successfulMdocRetrievalTransitionComponentName) && s.f(this.autoSubmitCountdownText, attributes.autoSubmitCountdownText) && s.f(this.autoSubmitIntervalSeconds, attributes.autoSubmitIntervalSeconds);
        }

        public final String getAutoSubmitCountdownText() {
            return this.autoSubmitCountdownText;
        }

        public final Integer getAutoSubmitIntervalSeconds() {
            return this.autoSubmitIntervalSeconds;
        }

        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        public final String getErrorRetrievingMdocText() {
            return this.errorRetrievingMdocText;
        }

        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        public final String getNoMdocAvailableText() {
            return this.noMdocAvailableText;
        }

        public final Provider getProvider() {
            return this.provider;
        }

        public final boolean getShowWhenMdocNotAvailable() {
            return this.showWhenMdocNotAvailable;
        }

        public final String getSuccessfulMdocRetrievalTransitionComponentName() {
            return this.successfulMdocRetrievalTransitionComponentName;
        }

        public int hashCode() {
            JsonLogicBoolean jsonLogicBoolean = this.disabled;
            int iHashCode = (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode()) * 31;
            JsonLogicBoolean jsonLogicBoolean2 = this.hidden;
            int iHashCode2 = (((iHashCode + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31) + this.provider.hashCode()) * 31;
            String str = this.noMdocAvailableText;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.errorRetrievingMdocText;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.showWhenMdocNotAvailable)) * 31;
            String str3 = this.successfulMdocRetrievalTransitionComponentName;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.autoSubmitCountdownText;
            int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.autoSubmitIntervalSeconds;
            return iHashCode6 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Attributes(disabled=" + this.disabled + ", hidden=" + this.hidden + ", provider=" + this.provider + ", noMdocAvailableText=" + this.noMdocAvailableText + ", errorRetrievingMdocText=" + this.errorRetrievingMdocText + ", showWhenMdocNotAvailable=" + this.showWhenMdocNotAvailable + ", successfulMdocRetrievalTransitionComponentName=" + this.successfulMdocRetrievalTransitionComponentName + ", autoSubmitCountdownText=" + this.autoSubmitCountdownText + ", autoSubmitIntervalSeconds=" + this.autoSubmitIntervalSeconds + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            JsonLogicBoolean jsonLogicBoolean = this.disabled;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.hidden;
            if (jsonLogicBoolean2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean2.writeToParcel(dest, flags);
            }
            this.provider.writeToParcel(dest, flags);
            dest.writeString(this.noMdocAvailableText);
            dest.writeString(this.errorRetrievingMdocText);
            dest.writeInt(this.showWhenMdocNotAvailable ? 1 : 0);
            dest.writeString(this.successfulMdocRetrievalTransitionComponentName);
            dest.writeString(this.autoSubmitCountdownText);
            Integer num = this.autoSubmitIntervalSeconds;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
        }

        public /* synthetic */ Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, Provider provider, String str, String str2, boolean z11, String str3, String str4, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(jsonLogicBoolean, jsonLogicBoolean2, provider, str, str2, z11, str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : num);
        }
    }
}
