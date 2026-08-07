package u80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import t80.q;

/* JADX INFO: renamed from: u80.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002\u0012)Bo\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lu80/a;", "Landroid/os/Parcelable;", "", "serverTransId", "acsTransId", "dsTransId", "errorCode", "Lu80/a$c;", "errorComponent", "errorDescription", "errorDetail", "errorMessageType", "messageVersion", "Lt80/q;", "sdkTransId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu80/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt80/q;)V", "Lorg/json/JSONObject;", "a", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getServerTransId", "b", "getAcsTransId", "c", "getDsTransId", DateTokenConverter.CONVERTER_KEY, "getErrorCode", "e", "Lu80/a$c;", "getErrorComponent", "()Lu80/a$c;", "f", "getErrorDescription", "g", "getErrorDetail", "h", "getErrorMessageType", IntegerTokenConverter.CONVERTER_KEY, "getMessageVersion", "j", "Lt80/q;", "getSdkTransId", "()Lt80/q;", "k", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ErrorData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serverTransId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String acsTransId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dsTransId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final c errorComponent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorDetail;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessageType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageVersion;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final q sdkTransId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ErrorData> CREATOR = new b();

    /* JADX INFO: renamed from: u80.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e¨\u0006\u001a"}, d2 = {"Lu80/a$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", StatusResponse.PAYLOAD, "Lu80/a;", "a", "(Lorg/json/JSONObject;)Lu80/a;", "", "b", "(Lorg/json/JSONObject;)Z", "", "FIELD_3DS_SERVER_TRANS_ID", "Ljava/lang/String;", "FIELD_ACS_TRANS_ID", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "MESSAGE_TYPE", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorData a(JSONObject payload) {
            s.k(payload, "payload");
            String strOptString = payload.optString("threeDSServerTransID");
            String strOptString2 = payload.optString("acsTransID");
            String strOptString3 = payload.optString("dsTransID");
            String strOptString4 = payload.optString("errorCode");
            s.j(strOptString4, "optString(...)");
            c cVarA = c.INSTANCE.a(payload.optString("errorComponent"));
            String strOptString5 = payload.optString("errorDescription");
            s.j(strOptString5, "optString(...)");
            String strOptString6 = payload.optString("errorDetail");
            s.j(strOptString6, "optString(...)");
            String strOptString7 = payload.optString("errorMessageType");
            String strOptString8 = payload.optString("messageVersion");
            s.j(strOptString8, "optString(...)");
            String strOptString9 = payload.optString("sdkTransID");
            return new ErrorData(strOptString, strOptString2, strOptString3, strOptString4, cVarA, strOptString5, strOptString6, strOptString7, strOptString8, strOptString9 != null ? new q(strOptString9) : null);
        }

        public final boolean b(JSONObject payload) {
            s.k(payload, "payload");
            return s.f("Erro", payload.optString("messageType"));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: u80.a$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ErrorData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ErrorData createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ErrorData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? q.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ErrorData[] newArray(int i11) {
            return new ErrorData[i11];
        }
    }

    /* JADX INFO: renamed from: u80.a$c */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lu80/a$c;", "", "", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "a", "ThreeDsSdk", "ThreeDsServer", "DirectoryServer", "Acs", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum c {
        ThreeDsSdk("C"),
        ThreeDsServer("S"),
        DirectoryServer("D"),
        Acs("A");

        private final String code;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: u80.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu80/a$c$a;", "", "<init>", "()V", "", "code", "Lu80/a$c;", "a", "(Ljava/lang/String;)Lu80/a$c;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String code) {
                c next;
                Iterator<c> it = c.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (s.f(next.getCode(), code)) {
                        return next;
                    }
                }
                next = null;
                return next;
            }

            private Companion() {
            }
        }

        c(String str) {
            this.code = str;
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }
    }

    public ErrorData(String str, String str2, String str3, String errorCode, c cVar, String errorDescription, String errorDetail, String str4, String messageVersion, q qVar) {
        s.k(errorCode, "errorCode");
        s.k(errorDescription, "errorDescription");
        s.k(errorDetail, "errorDetail");
        s.k(messageVersion, "messageVersion");
        this.serverTransId = str;
        this.acsTransId = str2;
        this.dsTransId = str3;
        this.errorCode = errorCode;
        this.errorComponent = cVar;
        this.errorDescription = errorDescription;
        this.errorDetail = errorDetail;
        this.errorMessageType = str4;
        this.messageVersion = messageVersion;
        this.sdkTransId = qVar;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("messageType", "Erro").put("messageVersion", this.messageVersion).put("sdkTransID", this.sdkTransId).put("errorCode", this.errorCode).put("errorDescription", this.errorDescription).put("errorDetail", this.errorDetail);
        String str = this.serverTransId;
        if (str != null) {
            jSONObjectPut.put("threeDSServerTransID", str);
        }
        String str2 = this.acsTransId;
        if (str2 != null) {
            jSONObjectPut.put("acsTransID", str2);
        }
        String str3 = this.dsTransId;
        if (str3 != null) {
            jSONObjectPut.put("dsTransID", str3);
        }
        c cVar = this.errorComponent;
        if (cVar != null) {
            jSONObjectPut.put("errorComponent", cVar.getCode());
        }
        String str4 = this.errorMessageType;
        if (str4 != null) {
            jSONObjectPut.put("errorMessageType", str4);
        }
        s.h(jSONObjectPut);
        return jSONObjectPut;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorData)) {
            return false;
        }
        ErrorData errorData = (ErrorData) other;
        return s.f(this.serverTransId, errorData.serverTransId) && s.f(this.acsTransId, errorData.acsTransId) && s.f(this.dsTransId, errorData.dsTransId) && s.f(this.errorCode, errorData.errorCode) && this.errorComponent == errorData.errorComponent && s.f(this.errorDescription, errorData.errorDescription) && s.f(this.errorDetail, errorData.errorDetail) && s.f(this.errorMessageType, errorData.errorMessageType) && s.f(this.messageVersion, errorData.messageVersion) && s.f(this.sdkTransId, errorData.sdkTransId);
    }

    public int hashCode() {
        String str = this.serverTransId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dsTransId;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.errorCode.hashCode()) * 31;
        c cVar = this.errorComponent;
        int iHashCode4 = (((((iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.errorDescription.hashCode()) * 31) + this.errorDetail.hashCode()) * 31;
        String str4 = this.errorMessageType;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        q qVar = this.sdkTransId;
        return iHashCode5 + (qVar != null ? qVar.hashCode() : 0);
    }

    public String toString() {
        return "ErrorData(serverTransId=" + this.serverTransId + ", acsTransId=" + this.acsTransId + ", dsTransId=" + this.dsTransId + ", errorCode=" + this.errorCode + ", errorComponent=" + this.errorComponent + ", errorDescription=" + this.errorDescription + ", errorDetail=" + this.errorDetail + ", errorMessageType=" + this.errorMessageType + ", messageVersion=" + this.messageVersion + ", sdkTransId=" + this.sdkTransId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.serverTransId);
        parcel.writeString(this.acsTransId);
        parcel.writeString(this.dsTransId);
        parcel.writeString(this.errorCode);
        c cVar = this.errorComponent;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
        parcel.writeString(this.errorDescription);
        parcel.writeString(this.errorDetail);
        parcel.writeString(this.errorMessageType);
        parcel.writeString(this.messageVersion);
        q qVar = this.sdkTransId;
        if (qVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qVar.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ ErrorData(String str, String str2, String str3, String str4, c cVar, String str5, String str6, String str7, String str8, q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, str4, (i11 & 16) != 0 ? null : cVar, str5, str6, (i11 & 128) != 0 ? null : str7, str8, qVar);
    }
}
