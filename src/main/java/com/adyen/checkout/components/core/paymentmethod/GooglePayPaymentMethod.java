package com.adyen.checkout.components.core.paymentmethod;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001/B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010%R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010\u000b\"\u0004\b'\u0010%R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010%R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010%¨\u00060"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "", "type", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, GooglePayPaymentMethod.GOOGLE_PAY_TOKEN, GooglePayPaymentMethod.GOOGLE_PAY_CARD_NETWORK, GooglePayPaymentMethod.THREEDS2_SDK_VERSION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getGooglePayToken", "setGooglePayToken", "getGooglePayCardNetwork", "setGooglePayCardNetwork", "getThreeDS2SdkVersion", "setThreeDS2SdkVersion", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GooglePayPaymentMethod extends PaymentMethodDetails {
    private static final String GOOGLE_PAY_CARD_NETWORK = "googlePayCardNetwork";
    private static final String GOOGLE_PAY_TOKEN = "googlePayToken";
    private static final String THREEDS2_SDK_VERSION = "threeDS2SdkVersion";
    private String checkoutAttemptId;
    private String googlePayCardNetwork;
    private String googlePayToken;
    private String threeDS2SdkVersion;
    private String type;
    public static final Parcelable.Creator<GooglePayPaymentMethod> CREATOR = new c();
    public static final b.a<GooglePayPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<GooglePayPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GooglePayPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new GooglePayPaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, GooglePayPaymentMethod.GOOGLE_PAY_TOKEN), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, GooglePayPaymentMethod.GOOGLE_PAY_CARD_NETWORK), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, GooglePayPaymentMethod.THREEDS2_SDK_VERSION));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(GooglePayPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(GooglePayPaymentMethod.GOOGLE_PAY_TOKEN, modelObject.getGooglePayToken());
                jSONObject.putOpt(GooglePayPaymentMethod.GOOGLE_PAY_CARD_NETWORK, modelObject.getGooglePayCardNetwork());
                jSONObject.putOpt(GooglePayPaymentMethod.THREEDS2_SDK_VERSION, modelObject.getThreeDS2SdkVersion());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(GooglePayPaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<GooglePayPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GooglePayPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new GooglePayPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GooglePayPaymentMethod[] newArray(int i11) {
            return new GooglePayPaymentMethod[i11];
        }
    }

    public /* synthetic */ GooglePayPaymentMethod(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ GooglePayPaymentMethod copy$default(GooglePayPaymentMethod googlePayPaymentMethod, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = googlePayPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = googlePayPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = googlePayPaymentMethod.googlePayToken;
        }
        if ((i11 & 8) != 0) {
            str4 = googlePayPaymentMethod.googlePayCardNetwork;
        }
        if ((i11 & 16) != 0) {
            str5 = googlePayPaymentMethod.threeDS2SdkVersion;
        }
        String str6 = str5;
        String str7 = str3;
        return googlePayPaymentMethod.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGooglePayToken() {
        return this.googlePayToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGooglePayCardNetwork() {
        return this.googlePayCardNetwork;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getThreeDS2SdkVersion() {
        return this.threeDS2SdkVersion;
    }

    public final GooglePayPaymentMethod copy(String type, String checkoutAttemptId, String googlePayToken, String googlePayCardNetwork, String threeDS2SdkVersion) {
        return new GooglePayPaymentMethod(type, checkoutAttemptId, googlePayToken, googlePayCardNetwork, threeDS2SdkVersion);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayPaymentMethod)) {
            return false;
        }
        GooglePayPaymentMethod googlePayPaymentMethod = (GooglePayPaymentMethod) other;
        return s.f(this.type, googlePayPaymentMethod.type) && s.f(this.checkoutAttemptId, googlePayPaymentMethod.checkoutAttemptId) && s.f(this.googlePayToken, googlePayPaymentMethod.googlePayToken) && s.f(this.googlePayCardNetwork, googlePayPaymentMethod.googlePayCardNetwork) && s.f(this.threeDS2SdkVersion, googlePayPaymentMethod.threeDS2SdkVersion);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    public final String getGooglePayCardNetwork() {
        return this.googlePayCardNetwork;
    }

    public final String getGooglePayToken() {
        return this.googlePayToken;
    }

    public final String getThreeDS2SdkVersion() {
        return this.threeDS2SdkVersion;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.checkoutAttemptId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.googlePayToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.googlePayCardNetwork;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.threeDS2SdkVersion;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(String str) {
        this.checkoutAttemptId = str;
    }

    public final void setGooglePayCardNetwork(String str) {
        this.googlePayCardNetwork = str;
    }

    public final void setGooglePayToken(String str) {
        this.googlePayToken = str;
    }

    public final void setThreeDS2SdkVersion(String str) {
        this.threeDS2SdkVersion = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "GooglePayPaymentMethod(type=" + this.type + ", checkoutAttemptId=" + this.checkoutAttemptId + ", googlePayToken=" + this.googlePayToken + ", googlePayCardNetwork=" + this.googlePayCardNetwork + ", threeDS2SdkVersion=" + this.threeDS2SdkVersion + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.googlePayToken);
        parcel.writeString(this.googlePayCardNetwork);
        parcel.writeString(this.threeDS2SdkVersion);
    }

    public GooglePayPaymentMethod(String str, String str2, String str3, String str4, String str5) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.googlePayToken = str3;
        this.googlePayCardNetwork = str4;
        this.threeDS2SdkVersion = str5;
    }
}
