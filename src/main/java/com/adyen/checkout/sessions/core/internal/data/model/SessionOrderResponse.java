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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\t¨\u0006#"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionOrderResponse.SESSION_DATA, SessionOrderResponse.ORDER_DATA, SessionOrderResponse.PSP_REFERENCE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionData", "getOrderData", "getPspReference", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionOrderResponse extends b {
    private static final String ORDER_DATA = "orderData";
    private static final String PSP_REFERENCE = "pspReference";
    private static final String SESSION_DATA = "sessionData";
    private final String orderData;
    private final String pspReference;
    private final String sessionData;
    public static final Parcelable.Creator<SessionOrderResponse> CREATOR = new c();
    public static final b.a<SessionOrderResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionOrderResponse;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionOrderResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionOrderResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString(SessionOrderResponse.SESSION_DATA);
            s.j(strOptString, "optString(...)");
            String strOptString2 = jsonObject.optString(SessionOrderResponse.ORDER_DATA);
            s.j(strOptString2, "optString(...)");
            String strOptString3 = jsonObject.optString(SessionOrderResponse.PSP_REFERENCE);
            s.j(strOptString3, "optString(...)");
            return new SessionOrderResponse(strOptString, strOptString2, strOptString3);
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionOrderResponse modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SessionOrderResponse.SESSION_DATA, modelObject.getSessionData());
                jSONObject.putOpt(SessionOrderResponse.ORDER_DATA, modelObject.getOrderData());
                jSONObject.putOpt(SessionOrderResponse.PSP_REFERENCE, modelObject.getPspReference());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionOrderResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionOrderResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionOrderResponse createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionOrderResponse(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionOrderResponse[] newArray(int i11) {
            return new SessionOrderResponse[i11];
        }
    }

    public SessionOrderResponse(String sessionData, String orderData, String pspReference) {
        s.k(sessionData, "sessionData");
        s.k(orderData, "orderData");
        s.k(pspReference, "pspReference");
        this.sessionData = sessionData;
        this.orderData = orderData;
        this.pspReference = pspReference;
    }

    public static /* synthetic */ SessionOrderResponse copy$default(SessionOrderResponse sessionOrderResponse, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionOrderResponse.sessionData;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionOrderResponse.orderData;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionOrderResponse.pspReference;
        }
        return sessionOrderResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrderData() {
        return this.orderData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPspReference() {
        return this.pspReference;
    }

    public final SessionOrderResponse copy(String sessionData, String orderData, String pspReference) {
        s.k(sessionData, "sessionData");
        s.k(orderData, "orderData");
        s.k(pspReference, "pspReference");
        return new SessionOrderResponse(sessionData, orderData, pspReference);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionOrderResponse)) {
            return false;
        }
        SessionOrderResponse sessionOrderResponse = (SessionOrderResponse) other;
        return s.f(this.sessionData, sessionOrderResponse.sessionData) && s.f(this.orderData, sessionOrderResponse.orderData) && s.f(this.pspReference, sessionOrderResponse.pspReference);
    }

    public final String getOrderData() {
        return this.orderData;
    }

    public final String getPspReference() {
        return this.pspReference;
    }

    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return (((this.sessionData.hashCode() * 31) + this.orderData.hashCode()) * 31) + this.pspReference.hashCode();
    }

    public String toString() {
        return "SessionOrderResponse(sessionData=" + this.sessionData + ", orderData=" + this.orderData + ", pspReference=" + this.pspReference + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.sessionData);
        parcel.writeString(this.orderData);
        parcel.writeString(this.pspReference);
    }
}
