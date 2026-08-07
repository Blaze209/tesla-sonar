package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00012BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010&R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010&R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010&R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010#\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010&¨\u00063"}, d2 = {"Lcom/adyen/checkout/components/core/Configuration;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", Configuration.MERCHANT_ID, Configuration.GATEWAY_MERCHANT_ID, "intent", Configuration.KOREAN_AUTHENTICATION_REQUIRED, Configuration.CLIENT_ID, Configuration.SCOPE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/Configuration;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMerchantId", "setMerchantId", "(Ljava/lang/String;)V", "getGatewayMerchantId", "setGatewayMerchantId", "getIntent", "setIntent", "getKoreanAuthenticationRequired", "setKoreanAuthenticationRequired", "getClientId", "setClientId", "getScopeId", "setScopeId", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Configuration extends b {
    private static final String CLIENT_ID = "clientId";
    private static final String GATEWAY_MERCHANT_ID = "gatewayMerchantId";
    private static final String INTENT = "intent";
    private static final String KOREAN_AUTHENTICATION_REQUIRED = "koreanAuthenticationRequired";
    private static final String MERCHANT_ID = "merchantId";
    private static final String SCOPE_ID = "scopeId";
    private String clientId;
    private String gatewayMerchantId;
    private String intent;
    private String koreanAuthenticationRequired;
    private String merchantId;
    private String scopeId;
    public static final Parcelable.Creator<Configuration> CREATOR = new c();
    public static final b.a<Configuration> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/Configuration$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/Configuration;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/Configuration;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/Configuration;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<Configuration> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Configuration b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new Configuration(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Configuration.MERCHANT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Configuration.GATEWAY_MERCHANT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "intent"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Configuration.KOREAN_AUTHENTICATION_REQUIRED), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Configuration.CLIENT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Configuration.SCOPE_ID));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(Configuration modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(Configuration.MERCHANT_ID, modelObject.getMerchantId());
                jSONObject.putOpt(Configuration.GATEWAY_MERCHANT_ID, modelObject.getGatewayMerchantId());
                jSONObject.putOpt("intent", modelObject.getIntent());
                jSONObject.putOpt(Configuration.KOREAN_AUTHENTICATION_REQUIRED, modelObject.getKoreanAuthenticationRequired());
                jSONObject.putOpt(Configuration.CLIENT_ID, modelObject.getClientId());
                jSONObject.putOpt(Configuration.SCOPE_ID, modelObject.getScopeId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(PaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<Configuration> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new Configuration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Configuration[] newArray(int i11) {
            return new Configuration[i11];
        }
    }

    public Configuration() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = configuration.merchantId;
        }
        if ((i11 & 2) != 0) {
            str2 = configuration.gatewayMerchantId;
        }
        if ((i11 & 4) != 0) {
            str3 = configuration.intent;
        }
        if ((i11 & 8) != 0) {
            str4 = configuration.koreanAuthenticationRequired;
        }
        if ((i11 & 16) != 0) {
            str5 = configuration.clientId;
        }
        if ((i11 & 32) != 0) {
            str6 = configuration.scopeId;
        }
        String str7 = str5;
        String str8 = str6;
        return configuration.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIntent() {
        return this.intent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKoreanAuthenticationRequired() {
        return this.koreanAuthenticationRequired;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getScopeId() {
        return this.scopeId;
    }

    public final Configuration copy(String merchantId, String gatewayMerchantId, String intent, String koreanAuthenticationRequired, String clientId, String scopeId) {
        return new Configuration(merchantId, gatewayMerchantId, intent, koreanAuthenticationRequired, clientId, scopeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return s.f(this.merchantId, configuration.merchantId) && s.f(this.gatewayMerchantId, configuration.gatewayMerchantId) && s.f(this.intent, configuration.intent) && s.f(this.koreanAuthenticationRequired, configuration.koreanAuthenticationRequired) && s.f(this.clientId, configuration.clientId) && s.f(this.scopeId, configuration.scopeId);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getGatewayMerchantId() {
        return this.gatewayMerchantId;
    }

    public final String getIntent() {
        return this.intent;
    }

    public final String getKoreanAuthenticationRequired() {
        return this.koreanAuthenticationRequired;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getScopeId() {
        return this.scopeId;
    }

    public int hashCode() {
        String str = this.merchantId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gatewayMerchantId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.intent;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.koreanAuthenticationRequired;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.clientId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.scopeId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setGatewayMerchantId(String str) {
        this.gatewayMerchantId = str;
    }

    public final void setIntent(String str) {
        this.intent = str;
    }

    public final void setKoreanAuthenticationRequired(String str) {
        this.koreanAuthenticationRequired = str;
    }

    public final void setMerchantId(String str) {
        this.merchantId = str;
    }

    public final void setScopeId(String str) {
        this.scopeId = str;
    }

    public String toString() {
        return "Configuration(merchantId=" + this.merchantId + ", gatewayMerchantId=" + this.gatewayMerchantId + ", intent=" + this.intent + ", koreanAuthenticationRequired=" + this.koreanAuthenticationRequired + ", clientId=" + this.clientId + ", scopeId=" + this.scopeId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.merchantId);
        parcel.writeString(this.gatewayMerchantId);
        parcel.writeString(this.intent);
        parcel.writeString(this.koreanAuthenticationRequired);
        parcel.writeString(this.clientId);
        parcel.writeString(this.scopeId);
    }

    public /* synthetic */ Configuration(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public Configuration(String str, String str2, String str3, String str4, String str5, String str6) {
        this.merchantId = str;
        this.gatewayMerchantId = str2;
        this.intent = str3;
        this.koreanAuthenticationRequired = str4;
        this.clientId = str5;
        this.scopeId = str6;
    }
}
