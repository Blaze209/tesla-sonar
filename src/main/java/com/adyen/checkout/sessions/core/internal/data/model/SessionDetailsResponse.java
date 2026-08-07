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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00011BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015¨\u00062"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionDetailsResponse.SESSION_DATA, "status", "resultCode", "Lcom/adyen/checkout/components/core/action/Action;", SessionDetailsResponse.ACTION, SessionDetailsResponse.SESSION_RESULT, "Lcom/adyen/checkout/components/core/OrderResponse;", SessionDetailsResponse.ORDER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/Action;Ljava/lang/String;Lcom/adyen/checkout/components/core/OrderResponse;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/adyen/checkout/components/core/action/Action;", "component5", "component6", "()Lcom/adyen/checkout/components/core/OrderResponse;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/Action;Ljava/lang/String;Lcom/adyen/checkout/components/core/OrderResponse;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionData", "getStatus", "getResultCode", "Lcom/adyen/checkout/components/core/action/Action;", "getAction", "getSessionResult", "Lcom/adyen/checkout/components/core/OrderResponse;", "getOrder", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionDetailsResponse extends b {
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
    public static final Parcelable.Creator<SessionDetailsResponse> CREATOR = new c();
    public static final b.a<SessionDetailsResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionDetailsResponse;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionDetailsResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionDetailsResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString(SessionDetailsResponse.SESSION_DATA);
            s.j(strOptString, "optString(...)");
            return new SessionDetailsResponse(strOptString, jsonObject.optString("status"), jsonObject.optString("resultCode"), (Action) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionDetailsResponse.ACTION), Action.SERIALIZER), jsonObject.optString(SessionDetailsResponse.SESSION_RESULT), (OrderResponse) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionDetailsResponse.ORDER), OrderResponse.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionDetailsResponse modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SessionDetailsResponse.SESSION_DATA, modelObject.getSessionData());
                jSONObject.putOpt("status", modelObject.getStatus());
                jSONObject.putOpt("resultCode", modelObject.getResultCode());
                jSONObject.putOpt(SessionDetailsResponse.ACTION, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getAction(), Action.SERIALIZER));
                jSONObject.putOpt(SessionDetailsResponse.SESSION_RESULT, modelObject.getSessionResult());
                jSONObject.putOpt(SessionDetailsResponse.ORDER, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getOrder(), OrderResponse.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionDetailsResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionDetailsResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionDetailsResponse createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionDetailsResponse(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(SessionDetailsResponse.class.getClassLoader()), parcel.readString(), (OrderResponse) parcel.readParcelable(SessionDetailsResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionDetailsResponse[] newArray(int i11) {
            return new SessionDetailsResponse[i11];
        }
    }

    public SessionDetailsResponse(String sessionData, String str, String str2, Action action, String str3, OrderResponse orderResponse) {
        s.k(sessionData, "sessionData");
        this.sessionData = sessionData;
        this.status = str;
        this.resultCode = str2;
        this.action = action;
        this.sessionResult = str3;
        this.order = orderResponse;
    }

    public static /* synthetic */ SessionDetailsResponse copy$default(SessionDetailsResponse sessionDetailsResponse, String str, String str2, String str3, Action action, String str4, OrderResponse orderResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionDetailsResponse.sessionData;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionDetailsResponse.status;
        }
        if ((i11 & 4) != 0) {
            str3 = sessionDetailsResponse.resultCode;
        }
        if ((i11 & 8) != 0) {
            action = sessionDetailsResponse.action;
        }
        if ((i11 & 16) != 0) {
            str4 = sessionDetailsResponse.sessionResult;
        }
        if ((i11 & 32) != 0) {
            orderResponse = sessionDetailsResponse.order;
        }
        String str5 = str4;
        OrderResponse orderResponse2 = orderResponse;
        return sessionDetailsResponse.copy(str, str2, str3, action, str5, orderResponse2);
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
    public final String getSessionResult() {
        return this.sessionResult;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OrderResponse getOrder() {
        return this.order;
    }

    public final SessionDetailsResponse copy(String sessionData, String status, String resultCode, Action action, String sessionResult, OrderResponse order) {
        s.k(sessionData, "sessionData");
        return new SessionDetailsResponse(sessionData, status, resultCode, action, sessionResult, order);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionDetailsResponse)) {
            return false;
        }
        SessionDetailsResponse sessionDetailsResponse = (SessionDetailsResponse) other;
        return s.f(this.sessionData, sessionDetailsResponse.sessionData) && s.f(this.status, sessionDetailsResponse.status) && s.f(this.resultCode, sessionDetailsResponse.resultCode) && s.f(this.action, sessionDetailsResponse.action) && s.f(this.sessionResult, sessionDetailsResponse.sessionResult) && s.f(this.order, sessionDetailsResponse.order);
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
        String str3 = this.sessionResult;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OrderResponse orderResponse = this.order;
        return iHashCode5 + (orderResponse != null ? orderResponse.hashCode() : 0);
    }

    public String toString() {
        return "SessionDetailsResponse(sessionData=" + this.sessionData + ", status=" + this.status + ", resultCode=" + this.resultCode + ", action=" + this.action + ", sessionResult=" + this.sessionResult + ", order=" + this.order + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.sessionData);
        parcel.writeString(this.status);
        parcel.writeString(this.resultCode);
        parcel.writeParcelable(this.action, flags);
        parcel.writeString(this.sessionResult);
        parcel.writeParcelable(this.order, flags);
    }
}
