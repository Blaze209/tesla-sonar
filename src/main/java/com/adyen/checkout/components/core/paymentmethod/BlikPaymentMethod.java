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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001+B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010#R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b$\u0010\n\"\u0004\b%\u0010#R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b&\u0010\n\"\u0004\b'\u0010#R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b(\u0010\n\"\u0004\b)\u0010#¨\u0006,"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/BlikPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "", "type", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, BlikPaymentMethod.BLIK_CODE, BlikPaymentMethod.STORED_PAYMENT_METHOD_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/paymentmethod/BlikPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getBlikCode", "setBlikCode", "getStoredPaymentMethodId", "setStoredPaymentMethodId", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BlikPaymentMethod extends PaymentMethodDetails {
    private static final String BLIK_CODE = "blikCode";
    public static final String PAYMENT_METHOD_TYPE = "blik";
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
    private String blikCode;
    private String checkoutAttemptId;
    private String storedPaymentMethodId;
    private String type;
    public static final Parcelable.Creator<BlikPaymentMethod> CREATOR = new c();
    public static final b.a<BlikPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/paymentmethod/BlikPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/BlikPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/paymentmethod/BlikPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/paymentmethod/BlikPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<BlikPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BlikPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new BlikPaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, BlikPaymentMethod.BLIK_CODE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, BlikPaymentMethod.STORED_PAYMENT_METHOD_ID));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(BlikPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(BlikPaymentMethod.BLIK_CODE, modelObject.getBlikCode());
                jSONObject.putOpt(BlikPaymentMethod.STORED_PAYMENT_METHOD_ID, modelObject.getStoredPaymentMethodId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(BlikPaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<BlikPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BlikPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new BlikPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BlikPaymentMethod[] newArray(int i11) {
            return new BlikPaymentMethod[i11];
        }
    }

    public /* synthetic */ BlikPaymentMethod(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ BlikPaymentMethod copy$default(BlikPaymentMethod blikPaymentMethod, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = blikPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = blikPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = blikPaymentMethod.blikCode;
        }
        if ((i11 & 8) != 0) {
            str4 = blikPaymentMethod.storedPaymentMethodId;
        }
        return blikPaymentMethod.copy(str, str2, str3, str4);
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
    public final String getBlikCode() {
        return this.blikCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    public final BlikPaymentMethod copy(String type, String checkoutAttemptId, String blikCode, String storedPaymentMethodId) {
        return new BlikPaymentMethod(type, checkoutAttemptId, blikCode, storedPaymentMethodId);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlikPaymentMethod)) {
            return false;
        }
        BlikPaymentMethod blikPaymentMethod = (BlikPaymentMethod) other;
        return s.f(this.type, blikPaymentMethod.type) && s.f(this.checkoutAttemptId, blikPaymentMethod.checkoutAttemptId) && s.f(this.blikCode, blikPaymentMethod.blikCode) && s.f(this.storedPaymentMethodId, blikPaymentMethod.storedPaymentMethodId);
    }

    public final String getBlikCode() {
        return this.blikCode;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
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
        String str3 = this.blikCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storedPaymentMethodId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBlikCode(String str) {
        this.blikCode = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(String str) {
        this.checkoutAttemptId = str;
    }

    public final void setStoredPaymentMethodId(String str) {
        this.storedPaymentMethodId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "BlikPaymentMethod(type=" + this.type + ", checkoutAttemptId=" + this.checkoutAttemptId + ", blikCode=" + this.blikCode + ", storedPaymentMethodId=" + this.storedPaymentMethodId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.blikCode);
        parcel.writeString(this.storedPaymentMethodId);
    }

    public BlikPaymentMethod(String str, String str2, String str3, String str4) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.blikCode = str3;
        this.storedPaymentMethodId = str4;
    }
}
