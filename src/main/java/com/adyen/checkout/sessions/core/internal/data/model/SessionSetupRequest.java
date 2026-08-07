package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006#"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionSetupRequest;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionSetupRequest.SESSION_DATA, "Lcom/adyen/checkout/components/core/OrderRequest;", SessionSetupRequest.ORDER, "<init>", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/OrderRequest;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/adyen/checkout/components/core/OrderRequest;", "copy", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/OrderRequest;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionSetupRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionData", "Lcom/adyen/checkout/components/core/OrderRequest;", "getOrder", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionSetupRequest extends b {
    private static final String ORDER = "order";
    private static final String SESSION_DATA = "sessionData";
    private final OrderRequest order;
    private final String sessionData;
    public static final Parcelable.Creator<SessionSetupRequest> CREATOR = new c();
    public static final b.a<SessionSetupRequest> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/internal/data/model/SessionSetupRequest$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionSetupRequest;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionSetupRequest;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionSetupRequest;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionSetupRequest> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionSetupRequest b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String strOptString = jsonObject.optString(SessionSetupRequest.SESSION_DATA);
                s.j(strOptString, "optString(...)");
                return new SessionSetupRequest(strOptString, (OrderRequest) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionSetupRequest.ORDER), OrderRequest.SERIALIZER));
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionSetupRequest.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionSetupRequest modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SessionSetupRequest.SESSION_DATA, modelObject.getSessionData());
                jSONObject.putOpt(SessionSetupRequest.ORDER, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getOrder(), OrderRequest.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionSetupRequest.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionSetupRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionSetupRequest createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionSetupRequest(parcel.readString(), (OrderRequest) parcel.readParcelable(SessionSetupRequest.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionSetupRequest[] newArray(int i11) {
            return new SessionSetupRequest[i11];
        }
    }

    public SessionSetupRequest(String sessionData, OrderRequest orderRequest) {
        s.k(sessionData, "sessionData");
        this.sessionData = sessionData;
        this.order = orderRequest;
    }

    public static /* synthetic */ SessionSetupRequest copy$default(SessionSetupRequest sessionSetupRequest, String str, OrderRequest orderRequest, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionSetupRequest.sessionData;
        }
        if ((i11 & 2) != 0) {
            orderRequest = sessionSetupRequest.order;
        }
        return sessionSetupRequest.copy(str, orderRequest);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrderRequest getOrder() {
        return this.order;
    }

    public final SessionSetupRequest copy(String sessionData, OrderRequest order) {
        s.k(sessionData, "sessionData");
        return new SessionSetupRequest(sessionData, order);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionSetupRequest)) {
            return false;
        }
        SessionSetupRequest sessionSetupRequest = (SessionSetupRequest) other;
        return s.f(this.sessionData, sessionSetupRequest.sessionData) && s.f(this.order, sessionSetupRequest.order);
    }

    public final OrderRequest getOrder() {
        return this.order;
    }

    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        int iHashCode = this.sessionData.hashCode() * 31;
        OrderRequest orderRequest = this.order;
        return iHashCode + (orderRequest == null ? 0 : orderRequest.hashCode());
    }

    public String toString() {
        return "SessionSetupRequest(sessionData=" + this.sessionData + ", order=" + this.order + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.order, flags);
    }
}
