package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\f¨\u0006$"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsRequest;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionPaymentsRequest.SESSION_DATA, "Lcom/adyen/checkout/components/core/PaymentComponentData;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "paymentComponentData", "<init>", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/PaymentComponentData;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/adyen/checkout/components/core/PaymentComponentData;", "copy", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/PaymentComponentData;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionData", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "getPaymentComponentData", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionPaymentsRequest extends b {
    private static final String SESSION_DATA = "sessionData";
    private final PaymentComponentData<? extends PaymentMethodDetails> paymentComponentData;
    private final String sessionData;
    public static final Parcelable.Creator<SessionPaymentsRequest> CREATOR = new c();
    public static final b.a<SessionPaymentsRequest> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsRequest$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsRequest;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsRequest;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionPaymentsRequest;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionPaymentsRequest> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionPaymentsRequest b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String strOptString = jsonObject.optString(SessionPaymentsRequest.SESSION_DATA);
                s.j(strOptString, "optString(...)");
                b bVarA = com.adyen.checkout.core.internal.data.model.c.a(jsonObject, PaymentComponentData.SERIALIZER);
                s.i(bVarA, "null cannot be cast to non-null type com.adyen.checkout.components.core.PaymentComponentData<out com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails>");
                return new SessionPaymentsRequest(strOptString, (PaymentComponentData) bVarA);
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionPaymentsRequest.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionPaymentsRequest modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject(PaymentComponentData.SERIALIZER.a(modelObject.getPaymentComponentData()).toString());
            try {
                jSONObject.putOpt(SessionPaymentsRequest.SESSION_DATA, modelObject.getSessionData());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionPaymentsRequest.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionPaymentsRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionPaymentsRequest createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionPaymentsRequest(parcel.readString(), (PaymentComponentData) parcel.readParcelable(SessionPaymentsRequest.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionPaymentsRequest[] newArray(int i11) {
            return new SessionPaymentsRequest[i11];
        }
    }

    public SessionPaymentsRequest(String sessionData, PaymentComponentData<? extends PaymentMethodDetails> paymentComponentData) {
        s.k(sessionData, "sessionData");
        s.k(paymentComponentData, "paymentComponentData");
        this.sessionData = sessionData;
        this.paymentComponentData = paymentComponentData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionPaymentsRequest copy$default(SessionPaymentsRequest sessionPaymentsRequest, String str, PaymentComponentData paymentComponentData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionPaymentsRequest.sessionData;
        }
        if ((i11 & 2) != 0) {
            paymentComponentData = sessionPaymentsRequest.paymentComponentData;
        }
        return sessionPaymentsRequest.copy(str, paymentComponentData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    public final PaymentComponentData<? extends PaymentMethodDetails> component2() {
        return this.paymentComponentData;
    }

    public final SessionPaymentsRequest copy(String sessionData, PaymentComponentData<? extends PaymentMethodDetails> paymentComponentData) {
        s.k(sessionData, "sessionData");
        s.k(paymentComponentData, "paymentComponentData");
        return new SessionPaymentsRequest(sessionData, paymentComponentData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionPaymentsRequest)) {
            return false;
        }
        SessionPaymentsRequest sessionPaymentsRequest = (SessionPaymentsRequest) other;
        return s.f(this.sessionData, sessionPaymentsRequest.sessionData) && s.f(this.paymentComponentData, sessionPaymentsRequest.paymentComponentData);
    }

    public final PaymentComponentData<? extends PaymentMethodDetails> getPaymentComponentData() {
        return this.paymentComponentData;
    }

    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        return (this.sessionData.hashCode() * 31) + this.paymentComponentData.hashCode();
    }

    public String toString() {
        return "SessionPaymentsRequest(sessionData=" + this.sessionData + ", paymentComponentData=" + this.paymentComponentData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.paymentComponentData, flags);
    }
}
