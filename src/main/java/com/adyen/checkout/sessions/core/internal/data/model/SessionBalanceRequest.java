package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001(B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006)"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceRequest;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionBalanceRequest.SESSION_DATA, "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", SessionBalanceRequest.PAYMENT_METHOD, "Lcom/adyen/checkout/components/core/Amount;", SessionBalanceRequest.AMOUNT, "<init>", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;Lcom/adyen/checkout/components/core/Amount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "component3", "()Lcom/adyen/checkout/components/core/Amount;", "copy", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;Lcom/adyen/checkout/components/core/Amount;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceRequest;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionData", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "getPaymentMethod", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionBalanceRequest extends b {
    private static final String AMOUNT = "amount";
    private static final String PAYMENT_METHOD = "paymentMethod";
    private static final String SESSION_DATA = "sessionData";
    private final Amount amount;
    private final PaymentMethodDetails paymentMethod;
    private final String sessionData;
    public static final Parcelable.Creator<SessionBalanceRequest> CREATOR = new c();
    public static final b.a<SessionBalanceRequest> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/internal/data/model/SessionBalanceRequest$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceRequest;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceRequest;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceRequest;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionBalanceRequest> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionBalanceRequest b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String strOptString = jsonObject.optString(SessionBalanceRequest.SESSION_DATA);
                s.j(strOptString, "optString(...)");
                return new SessionBalanceRequest(strOptString, (PaymentMethodDetails) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionBalanceRequest.PAYMENT_METHOD), PaymentMethodDetails.SERIALIZER), (Amount) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionBalanceRequest.AMOUNT), Amount.SERIALIZER));
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionBalanceRequest.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionBalanceRequest modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SessionBalanceRequest.SESSION_DATA, modelObject.getSessionData());
                jSONObject.putOpt(SessionBalanceRequest.PAYMENT_METHOD, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getPaymentMethod(), PaymentMethodDetails.SERIALIZER));
                jSONObject.putOpt(SessionBalanceRequest.AMOUNT, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getAmount(), Amount.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionBalanceRequest.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionBalanceRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionBalanceRequest createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionBalanceRequest(parcel.readString(), (PaymentMethodDetails) parcel.readParcelable(SessionBalanceRequest.class.getClassLoader()), (Amount) parcel.readParcelable(SessionBalanceRequest.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionBalanceRequest[] newArray(int i11) {
            return new SessionBalanceRequest[i11];
        }
    }

    public SessionBalanceRequest(String sessionData, PaymentMethodDetails paymentMethodDetails, Amount amount) {
        s.k(sessionData, "sessionData");
        this.sessionData = sessionData;
        this.paymentMethod = paymentMethodDetails;
        this.amount = amount;
    }

    public static /* synthetic */ SessionBalanceRequest copy$default(SessionBalanceRequest sessionBalanceRequest, String str, PaymentMethodDetails paymentMethodDetails, Amount amount, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionBalanceRequest.sessionData;
        }
        if ((i11 & 2) != 0) {
            paymentMethodDetails = sessionBalanceRequest.paymentMethod;
        }
        if ((i11 & 4) != 0) {
            amount = sessionBalanceRequest.amount;
        }
        return sessionBalanceRequest.copy(str, paymentMethodDetails, amount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PaymentMethodDetails getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    public final SessionBalanceRequest copy(String sessionData, PaymentMethodDetails paymentMethod, Amount amount) {
        s.k(sessionData, "sessionData");
        return new SessionBalanceRequest(sessionData, paymentMethod, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionBalanceRequest)) {
            return false;
        }
        SessionBalanceRequest sessionBalanceRequest = (SessionBalanceRequest) other;
        return s.f(this.sessionData, sessionBalanceRequest.sessionData) && s.f(this.paymentMethod, sessionBalanceRequest.paymentMethod) && s.f(this.amount, sessionBalanceRequest.amount);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final PaymentMethodDetails getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getSessionData() {
        return this.sessionData;
    }

    public int hashCode() {
        int iHashCode = this.sessionData.hashCode() * 31;
        PaymentMethodDetails paymentMethodDetails = this.paymentMethod;
        int iHashCode2 = (iHashCode + (paymentMethodDetails == null ? 0 : paymentMethodDetails.hashCode())) * 31;
        Amount amount = this.amount;
        return iHashCode2 + (amount != null ? amount.hashCode() : 0);
    }

    public String toString() {
        return "SessionBalanceRequest(sessionData=" + this.sessionData + ", paymentMethod=" + this.paymentMethod + ", amount=" + this.amount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.paymentMethod, flags);
        parcel.writeParcelable(this.amount, flags);
    }
}
