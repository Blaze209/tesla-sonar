package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r¨\u0006&"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsRequest;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionDetailsRequest.SESSION_DATA, "paymentData", "Lorg/json/JSONObject;", "details", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lorg/json/JSONObject;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionData", "getPaymentData", "Lorg/json/JSONObject;", "getDetails", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionDetailsRequest extends b {
    private static final String DETAILS = "details";
    private static final String PAYMENT_DATA = "paymentData";
    private static final String SESSION_DATA = "sessionData";
    private final JSONObject details;
    private final String paymentData;
    private final String sessionData;
    public static final Parcelable.Creator<SessionDetailsRequest> CREATOR = new c();
    public static final b.a<SessionDetailsRequest> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/internal/data/model/SessionDetailsRequest$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsRequest;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsRequest;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsRequest;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionDetailsRequest> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionDetailsRequest b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String strOptString = jsonObject.optString(SessionDetailsRequest.SESSION_DATA);
                s.j(strOptString, "optString(...)");
                return new SessionDetailsRequest(strOptString, jsonObject.optString("paymentData"), jsonObject.optJSONObject("details"));
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionDetailsRequest.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionDetailsRequest modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SessionDetailsRequest.SESSION_DATA, modelObject.getSessionData());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt("details", modelObject.getDetails());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionDetailsRequest.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionDetailsRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionDetailsRequest createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionDetailsRequest(parcel.readString(), parcel.readString(), re.a.f107852a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionDetailsRequest[] newArray(int i11) {
            return new SessionDetailsRequest[i11];
        }
    }

    public SessionDetailsRequest(String sessionData, String str, JSONObject jSONObject) {
        s.k(sessionData, "sessionData");
        this.sessionData = sessionData;
        this.paymentData = str;
        this.details = jSONObject;
    }

    public static /* synthetic */ SessionDetailsRequest copy$default(SessionDetailsRequest sessionDetailsRequest, String str, String str2, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDetailsRequest.sessionData;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDetailsRequest.paymentData;
        }
        if ((i11 & 4) != 0) {
            jSONObject = sessionDetailsRequest.details;
        }
        return sessionDetailsRequest.copy(str, str2, jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JSONObject getDetails() {
        return this.details;
    }

    public final SessionDetailsRequest copy(String sessionData, String paymentData, JSONObject details) {
        s.k(sessionData, "sessionData");
        return new SessionDetailsRequest(sessionData, paymentData, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetailsRequest)) {
            return false;
        }
        SessionDetailsRequest sessionDetailsRequest = (SessionDetailsRequest) other;
        return s.f(this.sessionData, sessionDetailsRequest.sessionData) && s.f(this.paymentData, sessionDetailsRequest.paymentData) && s.f(this.details, sessionDetailsRequest.details);
    }

    public final JSONObject getDetails() {
        return this.details;
    }

    public final String getPaymentData() {
        return this.paymentData;
    }

    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        int iHashCode = this.sessionData.hashCode() * 31;
        String str = this.paymentData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JSONObject jSONObject = this.details;
        return iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public String toString() {
        return "SessionDetailsRequest(sessionData=" + this.sessionData + ", paymentData=" + this.paymentData + ", details=" + this.details + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.sessionData);
        parcel.writeString(this.paymentData);
        re.a.f107852a.b(this.details, parcel, flags);
    }
}
