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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\b¨\u0006 "}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenRequest;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionDisableTokenRequest.SESSION_DATA, SessionDisableTokenRequest.STORED_PAYMENT_METHOD_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionData", "getStoredPaymentMethodId", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionDisableTokenRequest extends b {
    private static final String SESSION_DATA = "sessionData";
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
    private final String sessionData;
    private final String storedPaymentMethodId;
    public static final Parcelable.Creator<SessionDisableTokenRequest> CREATOR = new c();
    public static final b.a<SessionDisableTokenRequest> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenRequest$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenRequest;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenRequest;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDisableTokenRequest;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionDisableTokenRequest> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionDisableTokenRequest b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String strOptString = jsonObject.optString(SessionDisableTokenRequest.SESSION_DATA);
                s.j(strOptString, "optString(...)");
                String strOptString2 = jsonObject.optString(SessionDisableTokenRequest.STORED_PAYMENT_METHOD_ID);
                s.j(strOptString2, "optString(...)");
                return new SessionDisableTokenRequest(strOptString, strOptString2);
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionDisableTokenRequest.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionDisableTokenRequest modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SessionDisableTokenRequest.SESSION_DATA, modelObject.getSessionData());
                jSONObject.putOpt(SessionDisableTokenRequest.STORED_PAYMENT_METHOD_ID, modelObject.getStoredPaymentMethodId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionDisableTokenRequest.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionDisableTokenRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionDisableTokenRequest createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionDisableTokenRequest(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionDisableTokenRequest[] newArray(int i11) {
            return new SessionDisableTokenRequest[i11];
        }
    }

    public SessionDisableTokenRequest(String sessionData, String storedPaymentMethodId) {
        s.k(sessionData, "sessionData");
        s.k(storedPaymentMethodId, "storedPaymentMethodId");
        this.sessionData = sessionData;
        this.storedPaymentMethodId = storedPaymentMethodId;
    }

    public static /* synthetic */ SessionDisableTokenRequest copy$default(SessionDisableTokenRequest sessionDisableTokenRequest, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDisableTokenRequest.sessionData;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDisableTokenRequest.storedPaymentMethodId;
        }
        return sessionDisableTokenRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    public final SessionDisableTokenRequest copy(String sessionData, String storedPaymentMethodId) {
        s.k(sessionData, "sessionData");
        s.k(storedPaymentMethodId, "storedPaymentMethodId");
        return new SessionDisableTokenRequest(sessionData, storedPaymentMethodId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDisableTokenRequest)) {
            return false;
        }
        SessionDisableTokenRequest sessionDisableTokenRequest = (SessionDisableTokenRequest) other;
        return s.f(this.sessionData, sessionDisableTokenRequest.sessionData) && s.f(this.storedPaymentMethodId, sessionDisableTokenRequest.storedPaymentMethodId);
    }

    public final String getSessionData() {
        return this.sessionData;
    }

    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    public int hashCode() {
        return (this.sessionData.hashCode() * 31) + this.storedPaymentMethodId.hashCode();
    }

    public String toString() {
        return "SessionDisableTokenRequest(sessionData=" + this.sessionData + ", storedPaymentMethodId=" + this.storedPaymentMethodId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.sessionData);
        parcel.writeString(this.storedPaymentMethodId);
    }
}
