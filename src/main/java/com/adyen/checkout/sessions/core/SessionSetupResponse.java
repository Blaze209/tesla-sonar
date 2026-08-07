package com.adyen.checkout.sessions.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.components.core.PaymentMethodsApiResponse;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0001:BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jj\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b8\u0010\u0011¨\u0006;"}, d2 = {"Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionSetupResponse.ID, SessionSetupResponse.SESSION_DATA, "Lcom/adyen/checkout/components/core/Amount;", SessionSetupResponse.AMOUNT, SessionSetupResponse.EXPIRES_AT, "Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "paymentMethodsApiResponse", SessionSetupResponse.RETURN_URL, "Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "configuration", SessionSetupResponse.SHOPPER_LOCALE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;Ljava/lang/String;Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/adyen/checkout/components/core/Amount;", "component4", "component5", "()Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "component6", "component7", "()Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;Ljava/lang/String;Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;Ljava/lang/String;)Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getSessionData", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "getExpiresAt", "Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "getPaymentMethodsApiResponse", "getReturnUrl", "Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "getConfiguration", "getShopperLocale", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionSetupResponse extends b {
    private static final String AMOUNT = "amount";
    private static final String CONFIGURATION = "configuration";
    private static final String EXPIRES_AT = "expiresAt";
    private static final String ID = "id";
    private static final String PAYMENT_METHODS = "paymentMethods";
    private static final String RETURN_URL = "returnUrl";
    private static final String SESSION_DATA = "sessionData";
    private static final String SHOPPER_LOCALE = "shopperLocale";
    private final Amount amount;
    private final SessionSetupConfiguration configuration;
    private final String expiresAt;
    private final String id;
    private final PaymentMethodsApiResponse paymentMethodsApiResponse;
    private final String returnUrl;
    private final String sessionData;
    private final String shopperLocale;
    public static final Parcelable.Creator<SessionSetupResponse> CREATOR = new c();
    public static final b.a<SessionSetupResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/SessionSetupResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/SessionSetupResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/SessionSetupResponse;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionSetupResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionSetupResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String strOptString = jsonObject.optString(SessionSetupResponse.ID);
                s.j(strOptString, "optString(...)");
                String strOptString2 = jsonObject.optString(SessionSetupResponse.SESSION_DATA);
                s.j(strOptString2, "optString(...)");
                Amount amount = (Amount) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionSetupResponse.AMOUNT), Amount.SERIALIZER);
                String strOptString3 = jsonObject.optString(SessionSetupResponse.EXPIRES_AT);
                s.j(strOptString3, "optString(...)");
                return new SessionSetupResponse(strOptString, strOptString2, amount, strOptString3, (PaymentMethodsApiResponse) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SessionSetupResponse.PAYMENT_METHODS), PaymentMethodsApiResponse.SERIALIZER), jsonObject.optString(SessionSetupResponse.RETURN_URL), (SessionSetupConfiguration) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject("configuration"), SessionSetupConfiguration.SERIALIZER), jsonObject.optString(SessionSetupResponse.SHOPPER_LOCALE));
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionSetupResponse.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionSetupResponse modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(SessionSetupResponse.ID, modelObject.getId());
                jSONObject.putOpt(SessionSetupResponse.SESSION_DATA, modelObject.getSessionData());
                jSONObject.putOpt(SessionSetupResponse.AMOUNT, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getAmount(), Amount.SERIALIZER));
                jSONObject.putOpt(SessionSetupResponse.EXPIRES_AT, modelObject.getExpiresAt());
                jSONObject.putOpt(SessionSetupResponse.PAYMENT_METHODS, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getPaymentMethodsApiResponse(), PaymentMethodsApiResponse.SERIALIZER));
                jSONObject.putOpt(SessionSetupResponse.RETURN_URL, modelObject.getReturnUrl());
                jSONObject.putOpt("configuration", com.adyen.checkout.core.internal.data.model.c.c(modelObject.getConfiguration(), SessionSetupConfiguration.SERIALIZER));
                jSONObject.putOpt(SessionSetupResponse.SHOPPER_LOCALE, modelObject.getShopperLocale());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionSetupResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionSetupResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionSetupResponse createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SessionSetupResponse(parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(SessionSetupResponse.class.getClassLoader()), parcel.readString(), (PaymentMethodsApiResponse) parcel.readParcelable(SessionSetupResponse.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : SessionSetupConfiguration.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionSetupResponse[] newArray(int i11) {
            return new SessionSetupResponse[i11];
        }
    }

    public SessionSetupResponse(String id2, String sessionData, Amount amount, String expiresAt, PaymentMethodsApiResponse paymentMethodsApiResponse, String str, SessionSetupConfiguration sessionSetupConfiguration, String str2) {
        s.k(id2, "id");
        s.k(sessionData, "sessionData");
        s.k(expiresAt, "expiresAt");
        this.id = id2;
        this.sessionData = sessionData;
        this.amount = amount;
        this.expiresAt = expiresAt;
        this.paymentMethodsApiResponse = paymentMethodsApiResponse;
        this.returnUrl = str;
        this.configuration = sessionSetupConfiguration;
        this.shopperLocale = str2;
    }

    public static /* synthetic */ SessionSetupResponse copy$default(SessionSetupResponse sessionSetupResponse, String str, String str2, Amount amount, String str3, PaymentMethodsApiResponse paymentMethodsApiResponse, String str4, SessionSetupConfiguration sessionSetupConfiguration, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sessionSetupResponse.id;
        }
        if ((i11 & 2) != 0) {
            str2 = sessionSetupResponse.sessionData;
        }
        if ((i11 & 4) != 0) {
            amount = sessionSetupResponse.amount;
        }
        if ((i11 & 8) != 0) {
            str3 = sessionSetupResponse.expiresAt;
        }
        if ((i11 & 16) != 0) {
            paymentMethodsApiResponse = sessionSetupResponse.paymentMethodsApiResponse;
        }
        if ((i11 & 32) != 0) {
            str4 = sessionSetupResponse.returnUrl;
        }
        if ((i11 & 64) != 0) {
            sessionSetupConfiguration = sessionSetupResponse.configuration;
        }
        if ((i11 & 128) != 0) {
            str5 = sessionSetupResponse.shopperLocale;
        }
        SessionSetupConfiguration sessionSetupConfiguration2 = sessionSetupConfiguration;
        String str6 = str5;
        PaymentMethodsApiResponse paymentMethodsApiResponse2 = paymentMethodsApiResponse;
        String str7 = str4;
        return sessionSetupResponse.copy(str, str2, amount, str3, paymentMethodsApiResponse2, str7, sessionSetupConfiguration2, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionData() {
        return this.sessionData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaymentMethodsApiResponse getPaymentMethodsApiResponse() {
        return this.paymentMethodsApiResponse;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SessionSetupConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getShopperLocale() {
        return this.shopperLocale;
    }

    public final SessionSetupResponse copy(String id2, String sessionData, Amount amount, String expiresAt, PaymentMethodsApiResponse paymentMethodsApiResponse, String returnUrl, SessionSetupConfiguration configuration, String shopperLocale) {
        s.k(id2, "id");
        s.k(sessionData, "sessionData");
        s.k(expiresAt, "expiresAt");
        return new SessionSetupResponse(id2, sessionData, amount, expiresAt, paymentMethodsApiResponse, returnUrl, configuration, shopperLocale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionSetupResponse)) {
            return false;
        }
        SessionSetupResponse sessionSetupResponse = (SessionSetupResponse) other;
        return s.f(this.id, sessionSetupResponse.id) && s.f(this.sessionData, sessionSetupResponse.sessionData) && s.f(this.amount, sessionSetupResponse.amount) && s.f(this.expiresAt, sessionSetupResponse.expiresAt) && s.f(this.paymentMethodsApiResponse, sessionSetupResponse.paymentMethodsApiResponse) && s.f(this.returnUrl, sessionSetupResponse.returnUrl) && s.f(this.configuration, sessionSetupResponse.configuration) && s.f(this.shopperLocale, sessionSetupResponse.shopperLocale);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final SessionSetupConfiguration getConfiguration() {
        return this.configuration;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final String getId() {
        return this.id;
    }

    public final PaymentMethodsApiResponse getPaymentMethodsApiResponse() {
        return this.paymentMethodsApiResponse;
    }

    public final String getReturnUrl() {
        return this.returnUrl;
    }

    public final String getSessionData() {
        return this.sessionData;
    }

    public final String getShopperLocale() {
        return this.shopperLocale;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.sessionData.hashCode()) * 31;
        Amount amount = this.amount;
        int iHashCode2 = (((iHashCode + (amount == null ? 0 : amount.hashCode())) * 31) + this.expiresAt.hashCode()) * 31;
        PaymentMethodsApiResponse paymentMethodsApiResponse = this.paymentMethodsApiResponse;
        int iHashCode3 = (iHashCode2 + (paymentMethodsApiResponse == null ? 0 : paymentMethodsApiResponse.hashCode())) * 31;
        String str = this.returnUrl;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        SessionSetupConfiguration sessionSetupConfiguration = this.configuration;
        int iHashCode5 = (iHashCode4 + (sessionSetupConfiguration == null ? 0 : sessionSetupConfiguration.hashCode())) * 31;
        String str2 = this.shopperLocale;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SessionSetupResponse(id=" + this.id + ", sessionData=" + this.sessionData + ", amount=" + this.amount + ", expiresAt=" + this.expiresAt + ", paymentMethodsApiResponse=" + this.paymentMethodsApiResponse + ", returnUrl=" + this.returnUrl + ", configuration=" + this.configuration + ", shopperLocale=" + this.shopperLocale + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.sessionData);
        parcel.writeParcelable(this.amount, flags);
        parcel.writeString(this.expiresAt);
        parcel.writeParcelable(this.paymentMethodsApiResponse, flags);
        parcel.writeString(this.returnUrl);
        SessionSetupConfiguration sessionSetupConfiguration = this.configuration;
        if (sessionSetupConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sessionSetupConfiguration.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.shopperLocale);
    }
}
