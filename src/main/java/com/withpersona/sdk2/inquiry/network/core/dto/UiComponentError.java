package com.withpersona.sdk2.inquiry.network.core.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.x;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public abstract class UiComponentError implements Parcelable {
    public static final Companion Companion = new Companion(null);

    public static final class Companion extends h<UiComponentError> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getJsonType(k kVar) {
            k kVarC = kVar.C();
            kVarC.h();
            while (kVarC.hasNext()) {
                if (s.f(kVarC.L(), "type")) {
                    return kVarC.O();
                }
                kVarC.F();
            }
            return null;
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.h
        @f
        public UiComponentError fromJson(k kVar) {
            u uVarD = new u.b().d();
            String jsonType = getJsonType(kVar);
            if (jsonType == null) {
                return null;
            }
            int iHashCode = jsonType.hashCode();
            if (iHashCode != -816959144) {
                if (iHashCode != -212588636) {
                    if (iHashCode == 1658531967 && jsonType.equals(InputAddress.type)) {
                        return (UiComponentError) uVarD.c(UiInputAddressComponentError.class).fromJson(kVar);
                    }
                } else if (jsonType.equals(InputInternationalDb.type)) {
                    return (UiComponentError) uVarD.c(UiInputInternationalDbComponentError.class).fromJson(kVar);
                }
            } else if (jsonType.equals("gov_id_nfc")) {
                return (UiComponentError) uVarD.c(UiGovernmentIdNfcScanComponentError.class).fromJson(kVar);
            }
            return (UiComponentError) uVarD.c(UiInputComponentError.class).fromJson(kVar);
        }

        @Override // com.squareup.moshi.h
        @x
        public void toJson(r rVar, UiComponentError uiComponentError) {
            u uVarD = new u.b().d();
            if (uiComponentError instanceof UiGovernmentIdNfcScanComponentError) {
                uVarD.c(UiGovernmentIdNfcScanComponentError.class).toJson(rVar, uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputAddressComponentError) {
                uVarD.c(UiInputAddressComponentError.class).toJson(rVar, uiComponentError);
                return;
            }
            if (uiComponentError instanceof UiInputComponentError) {
                uVarD.c(UiInputComponentError.class).toJson(rVar, uiComponentError);
            } else if (uiComponentError instanceof UiInputInternationalDbComponentError) {
                uVarD.c(UiInputInternationalDbComponentError.class).toJson(rVar, uiComponentError);
            } else {
                if (uiComponentError != null) {
                    throw new NoWhenBranchMatchedException();
                }
                rVar.c0();
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiInputAddressComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputAddressComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiInputAddressComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputAddressComponentError(string, string2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputAddressComponentError[] newArray(int i11) {
                return new UiInputAddressComponentError[i11];
            }
        }

        public UiInputAddressComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputAddressComponentError copy$default(UiInputAddressComponentError uiInputAddressComponentError, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uiInputAddressComponentError.name;
            }
            if ((i11 & 2) != 0) {
                str2 = uiInputAddressComponentError.type;
            }
            if ((i11 & 4) != 0) {
                map = uiInputAddressComponentError.message;
            }
            return uiInputAddressComponentError.copy(str, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiInputAddressComponentError copy(String str, String str2, Map<String, String> map) {
            return new UiInputAddressComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputAddressComponentError)) {
                return false;
            }
            UiInputAddressComponentError uiInputAddressComponentError = (UiInputAddressComponentError) obj;
            return s.f(this.name, uiInputAddressComponentError.name) && s.f(this.type, uiInputAddressComponentError.type) && s.f(this.message, uiInputAddressComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            return "UiInputAddressComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    @i(generateAdapter = true)
    public static final class UiInputComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputComponentError> CREATOR = new Creator();
        private final String message;
        private final String name;
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiInputComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError createFromParcel(Parcel parcel) {
                return new UiInputComponentError(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputComponentError[] newArray(int i11) {
                return new UiInputComponentError[i11];
            }
        }

        public UiInputComponentError(String str, String str2, String str3) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = str3;
        }

        public static /* synthetic */ UiInputComponentError copy$default(UiInputComponentError uiInputComponentError, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uiInputComponentError.name;
            }
            if ((i11 & 2) != 0) {
                str2 = uiInputComponentError.type;
            }
            if ((i11 & 4) != 0) {
                str3 = uiInputComponentError.message;
            }
            return uiInputComponentError.copy(str, str2, str3);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.type;
        }

        public final String component3() {
            return this.message;
        }

        public final UiInputComponentError copy(String str, String str2, String str3) {
            return new UiInputComponentError(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputComponentError)) {
                return false;
            }
            UiInputComponentError uiInputComponentError = (UiInputComponentError) obj;
            return s.f(this.name, uiInputComponentError.name) && s.f(this.type, uiInputComponentError.type) && s.f(this.message, uiInputComponentError.message);
        }

        public final String getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "UiInputComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class UiInputInternationalDbComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiInputInternationalDbComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiInputInternationalDbComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiInputInternationalDbComponentError(string, string2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiInputInternationalDbComponentError[] newArray(int i11) {
                return new UiInputInternationalDbComponentError[i11];
            }
        }

        public UiInputInternationalDbComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiInputInternationalDbComponentError copy$default(UiInputInternationalDbComponentError uiInputInternationalDbComponentError, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uiInputInternationalDbComponentError.name;
            }
            if ((i11 & 2) != 0) {
                str2 = uiInputInternationalDbComponentError.type;
            }
            if ((i11 & 4) != 0) {
                map = uiInputInternationalDbComponentError.message;
            }
            return uiInputInternationalDbComponentError.copy(str, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiInputInternationalDbComponentError copy(String str, String str2, Map<String, String> map) {
            return new UiInputInternationalDbComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiInputInternationalDbComponentError)) {
                return false;
            }
            UiInputInternationalDbComponentError uiInputInternationalDbComponentError = (UiInputInternationalDbComponentError) obj;
            return s.f(this.name, uiInputInternationalDbComponentError.name) && s.f(this.type, uiInputInternationalDbComponentError.type) && s.f(this.message, uiInputInternationalDbComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            return "UiInputInternationalDbComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
    }

    public /* synthetic */ UiComponentError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getName();

    public abstract String getType();

    @i(generateAdapter = true)
    public static final class UiGovernmentIdNfcScanComponentError extends UiComponentError implements Parcelable {
        public static final Parcelable.Creator<UiGovernmentIdNfcScanComponentError> CREATOR = new Creator();
        private Map<String, String> message;
        private final String name;
        private final String type;

        public static final class Creator implements Parcelable.Creator<UiGovernmentIdNfcScanComponentError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new UiGovernmentIdNfcScanComponentError(string, string2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiGovernmentIdNfcScanComponentError[] newArray(int i11) {
                return new UiGovernmentIdNfcScanComponentError[i11];
            }
        }

        public /* synthetic */ UiGovernmentIdNfcScanComponentError(String str, String str2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? "gov_id_nfc" : str2, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiGovernmentIdNfcScanComponentError copy$default(UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError, String str, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uiGovernmentIdNfcScanComponentError.name;
            }
            if ((i11 & 2) != 0) {
                str2 = uiGovernmentIdNfcScanComponentError.type;
            }
            if ((i11 & 4) != 0) {
                map = uiGovernmentIdNfcScanComponentError.message;
            }
            return uiGovernmentIdNfcScanComponentError.copy(str, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.type;
        }

        public final Map<String, String> component3() {
            return this.message;
        }

        public final UiGovernmentIdNfcScanComponentError copy(String str, String str2, Map<String, String> map) {
            return new UiGovernmentIdNfcScanComponentError(str, str2, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UiGovernmentIdNfcScanComponentError)) {
                return false;
            }
            UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiGovernmentIdNfcScanComponentError) obj;
            return s.f(this.name, uiGovernmentIdNfcScanComponentError.name) && s.f(this.type, uiGovernmentIdNfcScanComponentError.type) && s.f(this.message, uiGovernmentIdNfcScanComponentError.message);
        }

        public final Map<String, String> getMessage() {
            return this.message;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getName() {
            return this.name;
        }

        @Override // com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + this.message.hashCode();
        }

        public final void setMessage(Map<String, String> map) {
            this.message = map;
        }

        public String toString() {
            return "UiGovernmentIdNfcScanComponentError(name=" + this.name + ", type=" + this.type + ", message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.name);
            parcel.writeString(this.type);
            Map<String, String> map = this.message;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public UiGovernmentIdNfcScanComponentError(String str, String str2, Map<String, String> map) {
            super(null);
            this.name = str;
            this.type = str2;
            this.message = map;
        }
    }

    private UiComponentError() {
    }
}
