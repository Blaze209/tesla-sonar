package com.adyen.checkout.sessions.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\f¨\u0006&"}, d2 = {"Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionBalanceResponse.SESSION_DATA, "Lcom/adyen/checkout/components/core/Amount;", SessionBalanceResponse.BALANCE, SessionBalanceResponse.TRANSACTION_LIMIT, "<init>", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/adyen/checkout/components/core/Amount;", "component3", "copy", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionData", "Lcom/adyen/checkout/components/core/Amount;", "getBalance", "getTransactionLimit", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionBalanceResponse extends b {
    private static final String BALANCE = "balance";
    private static final String SESSION_DATA = "sessionData";
    private static final String TRANSACTION_LIMIT = "transactionLimit";
    private final Amount balance;
    private final String sessionData;
    private final Amount transactionLimit;
    public static final Parcelable.Creator<SessionBalanceResponse> CREATOR = new c();
    public static final b.a<SessionBalanceResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/internal/data/model/SessionBalanceResponse;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionBalanceResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionBalanceResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString(SessionBalanceResponse.SESSION_DATA);
            s.j(strOptString, "optString(...)");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(SessionBalanceResponse.BALANCE);
            b.a<Amount> aVar = Amount.SERIALIZER;
            Amount amount = (Amount) com.adyen.checkout.core.internal.data.model.c.a(jSONObjectOptJSONObject, aVar);
            if (amount != null) {
                return new SessionBalanceResponse(strOptString, amount, (Amount) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionBalanceResponse.TRANSACTION_LIMIT), aVar));
            }
            throw new CheckoutException("Balance not found", null, 2, null);
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionBalanceResponse modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SessionBalanceResponse.SESSION_DATA, modelObject.getSessionData());
                Amount balance = modelObject.getBalance();
                b.a<Amount> aVar = Amount.SERIALIZER;
                jSONObject.putOpt(SessionBalanceResponse.BALANCE, com.adyen.checkout.core.internal.data.model.c.c(balance, aVar));
                jSONObject.putOpt(SessionBalanceResponse.TRANSACTION_LIMIT, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getTransactionLimit(), aVar));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionBalanceResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionBalanceResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionBalanceResponse createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionBalanceResponse(parcel.readString(), (Amount) parcel.readParcelable(SessionBalanceResponse.class.getClassLoader()), (Amount) parcel.readParcelable(SessionBalanceResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionBalanceResponse[] newArray(int i11) {
            return new SessionBalanceResponse[i11];
        }
    }

    public SessionBalanceResponse(String sessionData, Amount balance, Amount amount) {
        s.k(sessionData, "sessionData");
        s.k(balance, "balance");
        this.sessionData = sessionData;
        this.balance = balance;
        this.transactionLimit = amount;
    }

    public static /* synthetic */ SessionBalanceResponse copy$default(SessionBalanceResponse sessionBalanceResponse, String str, Amount amount, Amount amount2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionBalanceResponse.sessionData;
        }
        if ((i11 & 2) != 0) {
            amount = sessionBalanceResponse.balance;
        }
        if ((i11 & 4) != 0) {
            amount2 = sessionBalanceResponse.transactionLimit;
        }
        return sessionBalanceResponse.copy(str, amount, amount2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Amount getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    public final SessionBalanceResponse copy(String sessionData, Amount balance, Amount transactionLimit) {
        s.k(sessionData, "sessionData");
        s.k(balance, "balance");
        return new SessionBalanceResponse(sessionData, balance, transactionLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionBalanceResponse)) {
            return false;
        }
        SessionBalanceResponse sessionBalanceResponse = (SessionBalanceResponse) other;
        return s.f(this.sessionData, sessionBalanceResponse.sessionData) && s.f(this.balance, sessionBalanceResponse.balance) && s.f(this.transactionLimit, sessionBalanceResponse.transactionLimit);
    }

    public final Amount getBalance() {
        return this.balance;
    }

    public final String getSessionData() {
        return this.sessionData;
    }

    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    public int hashCode() {
        int iHashCode = ((this.sessionData.hashCode() * 31) + this.balance.hashCode()) * 31;
        Amount amount = this.transactionLimit;
        return iHashCode + (amount == null ? 0 : amount.hashCode());
    }

    public String toString() {
        return "SessionBalanceResponse(sessionData=" + this.sessionData + ", balance=" + this.balance + ", transactionLimit=" + this.transactionLimit + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.balance, flags);
        parcel.writeParcelable(this.transactionLimit, flags);
    }
}
