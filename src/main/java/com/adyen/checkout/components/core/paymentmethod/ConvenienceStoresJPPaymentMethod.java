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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018¨\u0006%"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/ConvenienceStoresJPPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/EContextPaymentMethod;", "", "type", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, EContextPaymentMethod.FIRST_NAME, EContextPaymentMethod.LAST_NAME, EContextPaymentMethod.TELEPHONE_NUMBER, EContextPaymentMethod.SHOPPER_EMAIL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getFirstName", "setFirstName", "getLastName", "setLastName", "getTelephoneNumber", "setTelephoneNumber", "getShopperEmail", "setShopperEmail", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConvenienceStoresJPPaymentMethod extends EContextPaymentMethod {
    public static final String PAYMENT_METHOD_TYPE = "econtext_stores";
    private String checkoutAttemptId;
    private String firstName;
    private String lastName;
    private String shopperEmail;
    private String telephoneNumber;
    private String type;
    public static final Parcelable.Creator<ConvenienceStoresJPPaymentMethod> CREATOR = new c();
    public static final b.a<ConvenienceStoresJPPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/paymentmethod/ConvenienceStoresJPPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/ConvenienceStoresJPPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/paymentmethod/ConvenienceStoresJPPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/paymentmethod/ConvenienceStoresJPPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<ConvenienceStoresJPPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ConvenienceStoresJPPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new ConvenienceStoresJPPaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, EContextPaymentMethod.FIRST_NAME), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, EContextPaymentMethod.LAST_NAME), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, EContextPaymentMethod.TELEPHONE_NUMBER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, EContextPaymentMethod.SHOPPER_EMAIL));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(ConvenienceStoresJPPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(EContextPaymentMethod.FIRST_NAME, modelObject.getFirstName());
                jSONObject.putOpt(EContextPaymentMethod.LAST_NAME, modelObject.getLastName());
                jSONObject.putOpt(EContextPaymentMethod.TELEPHONE_NUMBER, modelObject.getTelephoneNumber());
                jSONObject.putOpt(EContextPaymentMethod.SHOPPER_EMAIL, modelObject.getShopperEmail());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(ConvenienceStoresJPPaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ConvenienceStoresJPPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConvenienceStoresJPPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ConvenienceStoresJPPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConvenienceStoresJPPaymentMethod[] newArray(int i11) {
            return new ConvenienceStoresJPPaymentMethod[i11];
        }
    }

    public ConvenienceStoresJPPaymentMethod() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public String getFirstName() {
        return this.firstName;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public String getLastName() {
        return this.lastName;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public String getShopperEmail() {
        return this.shopperEmail;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getType() {
        return this.type;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(String str) {
        this.checkoutAttemptId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public void setFirstName(String str) {
        this.firstName = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public void setLastName(String str) {
        this.lastName = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public void setShopperEmail(String str) {
        this.shopperEmail = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.EContextPaymentMethod
    public void setTelephoneNumber(String str) {
        this.telephoneNumber = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.telephoneNumber);
        parcel.writeString(this.shopperEmail);
    }

    public /* synthetic */ ConvenienceStoresJPPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public ConvenienceStoresJPPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.telephoneNumber = str5;
        this.shopperEmail = str6;
    }
}
