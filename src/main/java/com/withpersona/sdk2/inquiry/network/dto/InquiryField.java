package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u000b\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "Landroid/os/Parcelable;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "Companion", "StringField", "IntegerField", "BooleanField", "FloatField", "DateField", "DatetimeField", "ChoicesField", "MultiChoicesField", "Unknown", "UnknownAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Unknown;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InquiryField implements Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String type;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Companion;", "", "<init>", "()V", "Lcom/squareup/moshi/h$e;", "createAdapter", "()Lcom/squareup/moshi/h$e;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h.e createAdapter() {
            u20.b bVarB = u20.b.b(InquiryField.class, "type");
            UnknownAdapter unknownAdapter = UnknownAdapter.INSTANCE;
            s.i(unknownAdapter, "null cannot be cast to non-null type com.squareup.moshi.JsonAdapter<kotlin.Any>");
            u20.b bVarE = bVarB.d(unknownAdapter).e(StringField.class, StringField.TYPE).e(IntegerField.class, IntegerField.TYPE).e(BooleanField.class, BooleanField.TYPE).e(FloatField.class, FloatField.TYPE).e(FloatField.class, FloatField.TYPE2).e(DateField.class, DateField.TYPE).e(DatetimeField.class, DatetimeField.TYPE).e(ChoicesField.class, ChoicesField.TYPE).e(MultiChoicesField.class, MultiChoicesField.TYPE);
            s.j(bVarE, "withSubtype(...)");
            return bVarE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$Unknown;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "", "type", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends InquiryField {
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();
        private final String type;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Unknown> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Unknown(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unknown[] newArray(int i11) {
                return new Unknown[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String type) {
            super(type, null);
            s.k(type, "type");
            this.type = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.type);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$UnknownAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "<init>", "()V", "Lcom/squareup/moshi/r;", "writer", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;)V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class UnknownAdapter extends h<InquiryField> {
        public static final UnknownAdapter INSTANCE = new UnknownAdapter();

        private UnknownAdapter() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.h
        public InquiryField fromJson(k reader) {
            s.k(reader, "reader");
            reader.h();
            String strO = "";
            while (reader.hasNext()) {
                if (s.f(reader.L(), "type")) {
                    strO = reader.O();
                } else {
                    reader.F();
                }
            }
            reader.j();
            return new Unknown(strO);
        }

        @Override // com.squareup.moshi.h
        public void toJson(r writer, InquiryField value) {
            s.k(writer, "writer");
            writer.o();
            writer.b0("type");
            writer.G0(value != null ? value.getType() : null);
            writer.C();
        }
    }

    public /* synthetic */ InquiryField(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getType() {
        return this.type;
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "", "value", "", "type", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$BooleanField;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getValue", "Ljava/lang/String;", "getType", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BooleanField extends InquiryField {
        public static final String TYPE = "boolean";
        private final String type;
        private final Boolean value;
        public static final Parcelable.Creator<BooleanField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BooleanField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BooleanField createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                s.k(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new BooleanField(boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BooleanField[] newArray(int i11) {
                return new BooleanField[i11];
            }
        }

        public /* synthetic */ BooleanField(Boolean bool, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(bool, (i11 & 2) != 0 ? TYPE : str);
        }

        public static /* synthetic */ BooleanField copy$default(BooleanField booleanField, Boolean bool, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = booleanField.value;
            }
            if ((i11 & 2) != 0) {
                str = booleanField.type;
            }
            return booleanField.copy(bool, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final BooleanField copy(Boolean value, String type) {
            s.k(type, "type");
            return new BooleanField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BooleanField)) {
                return false;
            }
            BooleanField booleanField = (BooleanField) other;
            return s.f(this.value, booleanField.value) && s.f(this.type, booleanField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final Boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            Boolean bool = this.value;
            return ((bool == null ? 0 : bool.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "BooleanField(value=" + this.value + ", type=" + this.type + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v4, types: [int] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            ?? BooleanValue;
            s.k(dest, "dest");
            Boolean bool = this.value;
            if (bool == null) {
                BooleanValue = 0;
            } else {
                dest.writeInt(1);
                BooleanValue = bool.booleanValue();
            }
            dest.writeInt(BooleanValue);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BooleanField(Boolean bool, String type) {
            super(type, null);
            s.k(type, "type");
            this.value = bool;
            this.type = type;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "", "value", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$ChoicesField;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getType", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChoicesField extends InquiryField {
        public static final String TYPE = "choices";
        private final String type;
        private final String value;
        public static final Parcelable.Creator<ChoicesField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChoicesField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChoicesField createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new ChoicesField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChoicesField[] newArray(int i11) {
                return new ChoicesField[i11];
            }
        }

        public /* synthetic */ ChoicesField(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? TYPE : str2);
        }

        public static /* synthetic */ ChoicesField copy$default(ChoicesField choicesField, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = choicesField.value;
            }
            if ((i11 & 2) != 0) {
                str2 = choicesField.type;
            }
            return choicesField.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final ChoicesField copy(String value, String type) {
            s.k(type, "type");
            return new ChoicesField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChoicesField)) {
                return false;
            }
            ChoicesField choicesField = (ChoicesField) other;
            return s.f(this.value, choicesField.value) && s.f(this.type, choicesField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "ChoicesField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChoicesField(String str, String type) {
            super(type, null);
            s.k(type, "type");
            this.value = str;
            this.type = type;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "", "value", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DateField;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getType", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateField extends InquiryField {
        public static final String TYPE = "date";
        private final String type;
        private final String value;
        public static final Parcelable.Creator<DateField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateField createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new DateField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DateField[] newArray(int i11) {
                return new DateField[i11];
            }
        }

        public /* synthetic */ DateField(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? TYPE : str2);
        }

        public static /* synthetic */ DateField copy$default(DateField dateField, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dateField.value;
            }
            if ((i11 & 2) != 0) {
                str2 = dateField.type;
            }
            return dateField.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final DateField copy(String value, String type) {
            s.k(type, "type");
            return new DateField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateField)) {
                return false;
            }
            DateField dateField = (DateField) other;
            return s.f(this.value, dateField.value) && s.f(this.type, dateField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "DateField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateField(String str, String type) {
            super(type, null);
            s.k(type, "type");
            this.value = str;
            this.type = type;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "", "value", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$DatetimeField;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getType", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DatetimeField extends InquiryField {
        public static final String TYPE = "datetime";
        private final String type;
        private final String value;
        public static final Parcelable.Creator<DatetimeField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DatetimeField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatetimeField createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new DatetimeField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DatetimeField[] newArray(int i11) {
                return new DatetimeField[i11];
            }
        }

        public /* synthetic */ DatetimeField(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? TYPE : str2);
        }

        public static /* synthetic */ DatetimeField copy$default(DatetimeField datetimeField, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = datetimeField.value;
            }
            if ((i11 & 2) != 0) {
                str2 = datetimeField.type;
            }
            return datetimeField.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final DatetimeField copy(String value, String type) {
            s.k(type, "type");
            return new DatetimeField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DatetimeField)) {
                return false;
            }
            DatetimeField datetimeField = (DatetimeField) other;
            return s.f(this.value, datetimeField.value) && s.f(this.type, datetimeField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "DatetimeField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DatetimeField(String str, String type) {
            super(type, null);
            s.k(type, "type");
            this.value = str;
            this.type = type;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "", "value", "", "type", "<init>", "(Ljava/lang/Float;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Float;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Float;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$FloatField;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Float;", "getValue", "Ljava/lang/String;", "getType", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FloatField extends InquiryField {
        public static final String TYPE = "float";
        public static final String TYPE2 = "number";
        private final String type;
        private final Float value;
        public static final Parcelable.Creator<FloatField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FloatField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FloatField createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new FloatField(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FloatField[] newArray(int i11) {
                return new FloatField[i11];
            }
        }

        public /* synthetic */ FloatField(Float f11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(f11, (i11 & 2) != 0 ? TYPE : str);
        }

        public static /* synthetic */ FloatField copy$default(FloatField floatField, Float f11, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = floatField.value;
            }
            if ((i11 & 2) != 0) {
                str = floatField.type;
            }
            return floatField.copy(f11, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Float getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final FloatField copy(Float value, String type) {
            s.k(type, "type");
            return new FloatField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FloatField)) {
                return false;
            }
            FloatField floatField = (FloatField) other;
            return s.f(this.value, floatField.value) && s.f(this.type, floatField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final Float getValue() {
            return this.value;
        }

        public int hashCode() {
            Float f11 = this.value;
            return ((f11 == null ? 0 : f11.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "FloatField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            Float f11 = this.value;
            if (f11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f11.floatValue());
            }
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FloatField(Float f11, String type) {
            super(type, null);
            s.k(type, "type");
            this.value = f11;
            this.type = type;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0013¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "", "value", "", "type", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$IntegerField;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getValue", "Ljava/lang/String;", "getType", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IntegerField extends InquiryField {
        public static final String TYPE = "integer";
        private final String type;
        private final Integer value;
        public static final Parcelable.Creator<IntegerField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IntegerField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerField createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new IntegerField(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegerField[] newArray(int i11) {
                return new IntegerField[i11];
            }
        }

        public /* synthetic */ IntegerField(Integer num, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, (i11 & 2) != 0 ? TYPE : str);
        }

        public static /* synthetic */ IntegerField copy$default(IntegerField integerField, Integer num, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = integerField.value;
            }
            if ((i11 & 2) != 0) {
                str = integerField.type;
            }
            return integerField.copy(num, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final IntegerField copy(Integer value, String type) {
            s.k(type, "type");
            return new IntegerField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegerField)) {
                return false;
            }
            IntegerField integerField = (IntegerField) other;
            return s.f(this.value, integerField.value) && s.f(this.type, integerField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final Integer getValue() {
            return this.value;
        }

        public int hashCode() {
            Integer num = this.value;
            return ((num == null ? 0 : num.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "IntegerField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            s.k(dest, "dest");
            Integer num = this.value;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegerField(Integer num, String type) {
            super(type, null);
            s.k(type, "type");
            this.value = num;
            this.type = type;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u000fJ\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u001a¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "", "", "value", "type", "<init>", "([Ljava/lang/String;Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "component1", "()[Ljava/lang/String;", "component2", "()Ljava/lang/String;", "copy", "([Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$MultiChoicesField;", "toString", "[Ljava/lang/String;", "getValue", "Ljava/lang/String;", "getType", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiChoicesField extends InquiryField {
        public static final String TYPE = "multi_choices";
        private final String type;
        private final String[] value;
        public static final Parcelable.Creator<MultiChoicesField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiChoicesField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiChoicesField createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new MultiChoicesField(parcel.createStringArray(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MultiChoicesField[] newArray(int i11) {
                return new MultiChoicesField[i11];
            }
        }

        public /* synthetic */ MultiChoicesField(String[] strArr, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(strArr, (i11 & 2) != 0 ? TYPE : str);
        }

        public static /* synthetic */ MultiChoicesField copy$default(MultiChoicesField multiChoicesField, String[] strArr, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                strArr = multiChoicesField.value;
            }
            if ((i11 & 2) != 0) {
                str = multiChoicesField.type;
            }
            return multiChoicesField.copy(strArr, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String[] getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final MultiChoicesField copy(String[] value, String type) {
            s.k(type, "type");
            return new MultiChoicesField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!s.f(MultiChoicesField.class, other != null ? other.getClass() : null)) {
                return false;
            }
            s.i(other, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.InquiryField.MultiChoicesField");
            MultiChoicesField multiChoicesField = (MultiChoicesField) other;
            String[] strArr = this.value;
            if (strArr != null) {
                String[] strArr2 = multiChoicesField.value;
                if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                    return false;
                }
            } else if (multiChoicesField.value != null) {
                return false;
            }
            return true;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String[] getValue() {
            return this.value;
        }

        public int hashCode() {
            String[] strArr = this.value;
            if (strArr != null) {
                return Arrays.hashCode(strArr);
            }
            return 0;
        }

        public String toString() {
            return "MultiChoicesField(value=" + Arrays.toString(this.value) + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeStringArray(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultiChoicesField(String[] strArr, String type) {
            super(type, null);
            s.k(type, "type");
            this.value = strArr;
            this.type = type;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "", "value", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField$StringField;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getType", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StringField extends InquiryField {
        public static final String TYPE = "string";
        private final String type;
        private final String value;
        public static final Parcelable.Creator<StringField> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StringField> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringField createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new StringField(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringField[] newArray(int i11) {
                return new StringField[i11];
            }
        }

        public /* synthetic */ StringField(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? TYPE : str2);
        }

        public static /* synthetic */ StringField copy$default(StringField stringField, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = stringField.value;
            }
            if ((i11 & 2) != 0) {
                str2 = stringField.type;
            }
            return stringField.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final StringField copy(String value, String type) {
            s.k(type, "type");
            return new StringField(value, type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StringField)) {
                return false;
            }
            StringField stringField = (StringField) other;
            return s.f(this.value, stringField.value) && s.f(this.type, stringField.type);
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.InquiryField
        public String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "StringField(value=" + this.value + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            s.k(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringField(String str, String type) {
            super(type, null);
            s.k(type, "type");
            this.value = str;
            this.type = type;
        }
    }

    private InquiryField(String str) {
        this.type = str;
    }
}
