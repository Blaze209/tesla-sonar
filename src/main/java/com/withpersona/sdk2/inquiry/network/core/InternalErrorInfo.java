package com.withpersona.sdk2.inquiry.network.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public abstract class InternalErrorInfo implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final h<Object> fallbackAdapter = new h<Object>() { // from class: com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$Companion$fallbackAdapter$1
        @Override // com.squareup.moshi.h
        public Object fromJson(k kVar) {
            kVar.h();
            kVar.j();
            return null;
        }

        @Override // com.squareup.moshi.h
        public void toJson(r rVar, Object obj) {
            rVar.o().b0("message").G0("Error with class '" + (obj != null ? obj.getClass().getCanonicalName() : null) + "' does not have a json adapter registered.").C();
        }
    }.nullSafe();

    @i(generateAdapter = true)
    public static final class CameraErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<CameraErrorInfo> CREATOR = new Creator();
        private final String message;

        public static final class Creator implements Parcelable.Creator<CameraErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CameraErrorInfo createFromParcel(Parcel parcel) {
                return new CameraErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CameraErrorInfo[] newArray(int i11) {
                return new CameraErrorInfo[i11];
            }
        }

        public CameraErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ CameraErrorInfo copy$default(CameraErrorInfo cameraErrorInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cameraErrorInfo.message;
            }
            return cameraErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final CameraErrorInfo copy(String str) {
            return new CameraErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CameraErrorInfo) && s.f(this.message, ((CameraErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "CameraErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.message);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h.e createAdapter() {
            return u20.b.b(InternalErrorInfo.class, "type").e(NetworkErrorInfo.class, "network").e(IntegrationErrorInfo.class, "integration").e(PermissionErrorInfo.class, "permission").e(CameraErrorInfo.class, "camera").e(ConfigurationErrorInfo.class, "configuration").e(InvalidOneTimeLinkCode.class, "one_time_link_code").e(UnknownErrorInfo.class, "unknown").d(InternalErrorInfo.fallbackAdapter);
        }

        private Companion() {
        }
    }

    @i(generateAdapter = true)
    public static final class ConfigurationErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<ConfigurationErrorInfo> CREATOR = new Creator();
        private final String message;

        public static final class Creator implements Parcelable.Creator<ConfigurationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationErrorInfo createFromParcel(Parcel parcel) {
                return new ConfigurationErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConfigurationErrorInfo[] newArray(int i11) {
                return new ConfigurationErrorInfo[i11];
            }
        }

        public ConfigurationErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ ConfigurationErrorInfo copy$default(ConfigurationErrorInfo configurationErrorInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = configurationErrorInfo.message;
            }
            return configurationErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final ConfigurationErrorInfo copy(String str) {
            return new ConfigurationErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigurationErrorInfo) && s.f(this.message, ((ConfigurationErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "ConfigurationErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class IntegrationErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<IntegrationErrorInfo> CREATOR = new Creator();
        private final String message;

        public static final class Creator implements Parcelable.Creator<IntegrationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new IntegrationErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationErrorInfo[] newArray(int i11) {
                return new IntegrationErrorInfo[i11];
            }
        }

        public IntegrationErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ IntegrationErrorInfo copy$default(IntegrationErrorInfo integrationErrorInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = integrationErrorInfo.message;
            }
            return integrationErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final IntegrationErrorInfo copy(String str) {
            return new IntegrationErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntegrationErrorInfo) && s.f(this.message, ((IntegrationErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "IntegrationErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class InvalidOneTimeLinkCode extends InternalErrorInfo {
        public static final Parcelable.Creator<InvalidOneTimeLinkCode> CREATOR = new Creator();
        private final String oneTimeLinkCode;

        public static final class Creator implements Parcelable.Creator<InvalidOneTimeLinkCode> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvalidOneTimeLinkCode createFromParcel(Parcel parcel) {
                return new InvalidOneTimeLinkCode(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvalidOneTimeLinkCode[] newArray(int i11) {
                return new InvalidOneTimeLinkCode[i11];
            }
        }

        public InvalidOneTimeLinkCode(String str) {
            super(null);
            this.oneTimeLinkCode = str;
        }

        public static /* synthetic */ InvalidOneTimeLinkCode copy$default(InvalidOneTimeLinkCode invalidOneTimeLinkCode, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = invalidOneTimeLinkCode.oneTimeLinkCode;
            }
            return invalidOneTimeLinkCode.copy(str);
        }

        public final String component1() {
            return this.oneTimeLinkCode;
        }

        public final InvalidOneTimeLinkCode copy(String str) {
            return new InvalidOneTimeLinkCode(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidOneTimeLinkCode) && s.f(this.oneTimeLinkCode, ((InvalidOneTimeLinkCode) obj).oneTimeLinkCode);
        }

        public final String getOneTimeLinkCode() {
            return this.oneTimeLinkCode;
        }

        public int hashCode() {
            return this.oneTimeLinkCode.hashCode();
        }

        public String toString() {
            return "InvalidOneTimeLinkCode(oneTimeLinkCode=" + this.oneTimeLinkCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.oneTimeLinkCode);
        }
    }

    @i(generateAdapter = true)
    public static final class NetworkErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<NetworkErrorInfo> CREATOR = new Creator();
        private final int code;
        private final boolean isRecoverable;
        private final String message;
        private final ErrorResponse.Error responseError;

        public static final class Creator implements Parcelable.Creator<NetworkErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo createFromParcel(Parcel parcel) {
                return new NetworkErrorInfo(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (ErrorResponse.Error) parcel.readParcelable(NetworkErrorInfo.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NetworkErrorInfo[] newArray(int i11) {
                return new NetworkErrorInfo[i11];
            }
        }

        public /* synthetic */ NetworkErrorInfo(int i11, String str, boolean z11, ErrorResponse.Error error, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, str, z11, (i12 & 8) != 0 ? null : error);
        }

        public static /* synthetic */ NetworkErrorInfo copy$default(NetworkErrorInfo networkErrorInfo, int i11, String str, boolean z11, ErrorResponse.Error error, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = networkErrorInfo.code;
            }
            if ((i12 & 2) != 0) {
                str = networkErrorInfo.message;
            }
            if ((i12 & 4) != 0) {
                z11 = networkErrorInfo.isRecoverable;
            }
            if ((i12 & 8) != 0) {
                error = networkErrorInfo.responseError;
            }
            return networkErrorInfo.copy(i11, str, z11, error);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final boolean component3() {
            return this.isRecoverable;
        }

        public final ErrorResponse.Error component4() {
            return this.responseError;
        }

        public final NetworkErrorInfo copy(int i11, String str, boolean z11, ErrorResponse.Error error) {
            return new NetworkErrorInfo(i11, str, z11, error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkErrorInfo)) {
                return false;
            }
            NetworkErrorInfo networkErrorInfo = (NetworkErrorInfo) obj;
            return this.code == networkErrorInfo.code && s.f(this.message, networkErrorInfo.message) && this.isRecoverable == networkErrorInfo.isRecoverable && s.f(this.responseError, networkErrorInfo.responseError);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final ErrorResponse.Error getResponseError() {
            return this.responseError;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            String str = this.message;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isRecoverable)) * 31;
            ErrorResponse.Error error = this.responseError;
            return iHashCode2 + (error != null ? error.hashCode() : 0);
        }

        public final boolean isRecoverable() {
            return this.isRecoverable;
        }

        public String toString() {
            return "NetworkErrorInfo(code=" + this.code + ", message=" + this.message + ", isRecoverable=" + this.isRecoverable + ", responseError=" + this.responseError + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.code);
            parcel.writeString(this.message);
            parcel.writeInt(this.isRecoverable ? 1 : 0);
            parcel.writeParcelable(this.responseError, i11);
        }

        public NetworkErrorInfo(int i11, String str, boolean z11, ErrorResponse.Error error) {
            super(null);
            this.code = i11;
            this.message = str;
            this.isRecoverable = z11;
            this.responseError = error;
        }
    }

    @i(generateAdapter = true)
    public static final class NoDiskSpaceErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<NoDiskSpaceErrorInfo> CREATOR = new Creator();
        private final String message;

        public static final class Creator implements Parcelable.Creator<NoDiskSpaceErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo createFromParcel(Parcel parcel) {
                return new NoDiskSpaceErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NoDiskSpaceErrorInfo[] newArray(int i11) {
                return new NoDiskSpaceErrorInfo[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NoDiskSpaceErrorInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NoDiskSpaceErrorInfo copy$default(NoDiskSpaceErrorInfo noDiskSpaceErrorInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = noDiskSpaceErrorInfo.message;
            }
            return noDiskSpaceErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final NoDiskSpaceErrorInfo copy(String str) {
            return new NoDiskSpaceErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoDiskSpaceErrorInfo) && s.f(this.message, ((NoDiskSpaceErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "NoDiskSpaceErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.message);
        }

        public /* synthetic */ NoDiskSpaceErrorInfo(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "No disk space available." : str);
        }

        public NoDiskSpaceErrorInfo(String str) {
            super(null);
            this.message = str;
        }
    }

    @i(generateAdapter = true)
    public static final class PermissionErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<PermissionErrorInfo> CREATOR = new Creator();
        private final String message;

        public static final class Creator implements Parcelable.Creator<PermissionErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionErrorInfo createFromParcel(Parcel parcel) {
                return new PermissionErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionErrorInfo[] newArray(int i11) {
                return new PermissionErrorInfo[i11];
            }
        }

        public PermissionErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ PermissionErrorInfo copy$default(PermissionErrorInfo permissionErrorInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = permissionErrorInfo.message;
            }
            return permissionErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final PermissionErrorInfo copy(String str) {
            return new PermissionErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionErrorInfo) && s.f(this.message, ((PermissionErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "PermissionErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class UnknownErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<UnknownErrorInfo> CREATOR = new Creator();
        private final String message;

        public static final class Creator implements Parcelable.Creator<UnknownErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownErrorInfo createFromParcel(Parcel parcel) {
                return new UnknownErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownErrorInfo[] newArray(int i11) {
                return new UnknownErrorInfo[i11];
            }
        }

        public UnknownErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ UnknownErrorInfo copy$default(UnknownErrorInfo unknownErrorInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = unknownErrorInfo.message;
            }
            return unknownErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final UnknownErrorInfo copy(String str) {
            return new UnknownErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownErrorInfo) && s.f(this.message, ((UnknownErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "UnknownErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class WebRtcIntegrationErrorInfo extends InternalErrorInfo {
        public static final Parcelable.Creator<WebRtcIntegrationErrorInfo> CREATOR = new Creator();
        private final String message;

        public static final class Creator implements Parcelable.Creator<WebRtcIntegrationErrorInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcIntegrationErrorInfo createFromParcel(Parcel parcel) {
                return new WebRtcIntegrationErrorInfo(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WebRtcIntegrationErrorInfo[] newArray(int i11) {
                return new WebRtcIntegrationErrorInfo[i11];
            }
        }

        public WebRtcIntegrationErrorInfo(String str) {
            super(null);
            this.message = str;
        }

        public static /* synthetic */ WebRtcIntegrationErrorInfo copy$default(WebRtcIntegrationErrorInfo webRtcIntegrationErrorInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = webRtcIntegrationErrorInfo.message;
            }
            return webRtcIntegrationErrorInfo.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final WebRtcIntegrationErrorInfo copy(String str) {
            return new WebRtcIntegrationErrorInfo(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebRtcIntegrationErrorInfo) && s.f(this.message, ((WebRtcIntegrationErrorInfo) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "WebRtcIntegrationErrorInfo(message=" + this.message + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.message);
        }
    }

    public /* synthetic */ InternalErrorInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InternalErrorInfo() {
    }
}
