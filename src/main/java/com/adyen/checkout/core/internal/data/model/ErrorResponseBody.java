package com.adyen.checkout.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001*B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b(\u0010\u000e¨\u0006+"}, d2 = {"Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", "status", "", "errorCode", ErrorResponseBody.MESSAGE, ErrorResponseBody.ERROR_TYPE, ErrorResponseBody.PSP_REFERENCE, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getStatus", "Ljava/lang/String;", "getErrorCode", "getMessage", "getErrorType", "getPspReference", "Companion", "b", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ErrorResponseBody extends b {
    private static final String ERROR_CODE = "errorCode";
    private static final String ERROR_TYPE = "errorType";
    private static final String MESSAGE = "message";
    private static final String PSP_REFERENCE = "pspReference";
    private static final String STATUS = "status";
    private final String errorCode;
    private final String errorType;
    private final String message;
    private final String pspReference;
    private final Integer status;
    public static final Parcelable.Creator<ErrorResponseBody> CREATOR = new c();
    public static final b.a<ErrorResponseBody> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/core/internal/data/model/ErrorResponseBody$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/core/internal/data/model/ErrorResponseBody;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<ErrorResponseBody> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ErrorResponseBody b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                return new ErrorResponseBody(Integer.valueOf(jsonObject.optInt("status")), jsonObject.optString("errorCode"), jsonObject.optString(ErrorResponseBody.MESSAGE), jsonObject.optString(ErrorResponseBody.ERROR_TYPE), jsonObject.optString(ErrorResponseBody.PSP_REFERENCE));
            } catch (JSONException e11) {
                throw new ModelSerializationException(ErrorResponseBody.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(ErrorResponseBody modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("status", modelObject.getStatus());
                jSONObject.putOpt("errorCode", modelObject.getErrorCode());
                jSONObject.putOpt(ErrorResponseBody.MESSAGE, modelObject.getMessage());
                jSONObject.putOpt(ErrorResponseBody.ERROR_TYPE, modelObject.getErrorType());
                jSONObject.putOpt(ErrorResponseBody.PSP_REFERENCE, modelObject.getPspReference());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(ErrorResponseBody.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ErrorResponseBody> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ErrorResponseBody createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ErrorResponseBody(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ErrorResponseBody[] newArray(int i11) {
            return new ErrorResponseBody[i11];
        }
    }

    public ErrorResponseBody(Integer num, String str, String str2, String str3, String str4) {
        this.status = num;
        this.errorCode = str;
        this.message = str2;
        this.errorType = str3;
        this.pspReference = str4;
    }

    public static /* synthetic */ ErrorResponseBody copy$default(ErrorResponseBody errorResponseBody, Integer num, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = errorResponseBody.status;
        }
        if ((i11 & 2) != 0) {
            str = errorResponseBody.errorCode;
        }
        if ((i11 & 4) != 0) {
            str2 = errorResponseBody.message;
        }
        if ((i11 & 8) != 0) {
            str3 = errorResponseBody.errorType;
        }
        if ((i11 & 16) != 0) {
            str4 = errorResponseBody.pspReference;
        }
        String str5 = str4;
        String str6 = str2;
        return errorResponseBody.copy(num, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPspReference() {
        return this.pspReference;
    }

    public final ErrorResponseBody copy(Integer status, String errorCode, String message, String errorType, String pspReference) {
        return new ErrorResponseBody(status, errorCode, message, errorType, pspReference);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponseBody)) {
            return false;
        }
        ErrorResponseBody errorResponseBody = (ErrorResponseBody) other;
        return s.f(this.status, errorResponseBody.status) && s.f(this.errorCode, errorResponseBody.errorCode) && s.f(this.message, errorResponseBody.message) && s.f(this.errorType, errorResponseBody.errorType) && s.f(this.pspReference, errorResponseBody.pspReference);
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPspReference() {
        return this.pspReference;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pspReference;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ErrorResponseBody(status=" + this.status + ", errorCode=" + this.errorCode + ", message=" + this.message + ", errorType=" + this.errorType + ", pspReference=" + this.pspReference + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int iIntValue;
        s.k(parcel, "out");
        Integer num = this.status;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.message);
        parcel.writeString(this.errorType);
        parcel.writeString(this.pspReference);
    }
}
