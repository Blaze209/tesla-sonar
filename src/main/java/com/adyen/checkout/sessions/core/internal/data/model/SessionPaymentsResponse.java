package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.OrderResponse;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00011BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b/\u0010\u000e¨\u00062"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionPaymentsResponse.SESSION_DATA, "status", "resultCode", "Lcom/adyen/checkout/components/core/action/Action;", SessionPaymentsResponse.ACTION, "Lcom/adyen/checkout/components/core/OrderResponse;", SessionPaymentsResponse.ORDER, SessionPaymentsResponse.SESSION_RESULT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/Action;Lcom/adyen/checkout/components/core/OrderResponse;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/adyen/checkout/components/core/action/Action;", "component5", "()Lcom/adyen/checkout/components/core/OrderResponse;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/Action;Lcom/adyen/checkout/components/core/OrderResponse;Ljava/lang/String;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionData", "getStatus", "getResultCode", "Lcom/adyen/checkout/components/core/action/Action;", "getAction", "Lcom/adyen/checkout/components/core/OrderResponse;", "getOrder", "getSessionResult", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionPaymentsResponse extends b {
    private static final String ACTION = "action";
    private static final String ORDER = "order";
    private static final String RESULT_CODE = "resultCode";
    private static final String SESSION_DATA = "sessionData";
    private static final String SESSION_RESULT = "sessionResult";
    private static final String STATUS = "status";
    private final Action action;
    private final OrderResponse order;
    private final String resultCode;
    private final String sessionData;
    private final String sessionResult;
    private final String status;
    public static final Parcelable.Creator<SessionPaymentsResponse> CREATOR = new c();
    public static final b.a<SessionPaymentsResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsResponse;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionPaymentsResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionPaymentsResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString(SessionPaymentsResponse.SESSION_DATA);
            s.j(strOptString, "optString(...)");
            return new SessionPaymentsResponse(strOptString, jsonObject.optString("status"), jsonObject.optString("resultCode"), (Action) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionPaymentsResponse.ACTION), Action.SERIALIZER), (OrderResponse) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionPaymentsResponse.ORDER), OrderResponse.SERIALIZER), jsonObject.optString(SessionPaymentsResponse.SESSION_RESULT));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionPaymentsResponse modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SessionPaymentsResponse.SESSION_DATA, modelObject.getSessionData());
                jSONObject.putOpt("status", modelObject.getStatus());
                jSONObject.putOpt("resultCode", modelObject.getResultCode());
                jSONObject.putOpt(SessionPaymentsResponse.ACTION, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getAction(), Action.SERIALIZER));
                jSONObject.putOpt(SessionPaymentsResponse.ORDER, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getOrder(), OrderResponse.SERIALIZER));
                jSONObject.putOpt(SessionPaymentsResponse.SESSION_RESULT, modelObject.getSessionResult());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionPaymentsResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionPaymentsResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionPaymentsResponse createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionPaymentsResponse(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(SessionPaymentsResponse.class.getClassLoader()), (OrderResponse) parcel.readParcelable(SessionPaymentsResponse.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionPaymentsResponse[] newArray(int i11) {
            return new SessionPaymentsResponse[i11];
        }
    }

    public SessionPaymentsResponse(String sessionData, String str, String str2, Action action, OrderResponse orderResponse, String str3) {
        s.k(sessionData, "sessionData");
        this.sessionData = sessionData;
        this.status = str;
        this.resultCode = str2;
        this.action = action;
        this.order = orderResponse;
        this.sessionResult = str3;
    }

    public static /* synthetic */ SessionPaymentsResponse copy$default(SessionPaymentsResponse sessionPaymentsResponse, String str, String str2, String str3, Action action, OrderResponse orderResponse, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionPaymentsResponse.sessionData;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionPaymentsResponse.status;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionPaymentsResponse.resultCode;
        }
        if ((i11 & 8) != 0) {
            action = sessionPaymentsResponse.action;
        }
        if ((i11 & 16) != 0) {
            orderResponse = sessionPaymentsResponse.order;
        }
        if ((i11 & 32) != 0) {
            str4 = sessionPaymentsResponse.sessionResult;
        }
        OrderResponse orderResponse2 = orderResponse;
        String str5 = str4;
        return sessionPaymentsResponse.copy(str, str2, str3, action, orderResponse2, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OrderResponse getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSessionResult() {
        return this.sessionResult;
    }

    public final SessionPaymentsResponse copy(String sessionData, String status, String resultCode, Action action, OrderResponse order, String sessionResult) {
        s.k(sessionData, "sessionData");
        return new SessionPaymentsResponse(sessionData, status, resultCode, action, order, sessionResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionPaymentsResponse)) {
            return false;
        }
        SessionPaymentsResponse sessionPaymentsResponse = (SessionPaymentsResponse) other;
        return s.f(this.sessionData, sessionPaymentsResponse.sessionData) && s.f(this.status, sessionPaymentsResponse.status) && s.f(this.resultCode, sessionPaymentsResponse.resultCode) && s.f(this.action, sessionPaymentsResponse.action) && s.f(this.order, sessionPaymentsResponse.order) && s.f(this.sessionResult, sessionPaymentsResponse.sessionResult);
    }

    public final Action getAction() {
        return this.action;
    }

    public final OrderResponse getOrder() {
        return this.order;
    }

    public final String getResultCode() {
        return this.resultCode;
    }

    public final String getSessionData() {
        return this.sessionData;
    }

    public final String getSessionResult() {
        return this.sessionResult;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.sessionData.hashCode() * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resultCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.action;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        OrderResponse orderResponse = this.order;
        int iHashCode5 = (iHashCode4 + (orderResponse == null ? 0 : orderResponse.hashCode())) * 31;
        String str3 = this.sessionResult;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SessionPaymentsResponse(sessionData=" + this.sessionData + ", status=" + this.status + ", resultCode=" + this.resultCode + ", action=" + this.action + ", order=" + this.order + ", sessionResult=" + this.sessionResult + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.sessionData);
        parcel.writeString(this.status);
        parcel.writeString(this.resultCode);
        parcel.writeParcelable(this.action, flags);
        parcel.writeParcelable(this.order, flags);
        parcel.writeString(this.sessionResult);
    }
}
