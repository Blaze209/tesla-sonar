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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00017BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010)R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010&\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010)R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010&\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010)R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010&\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010)R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010&\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010)R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010)¨\u00068"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "", "type", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, CashAppPayPaymentMethod.GRANT_ID, CashAppPayPaymentMethod.ON_FILE_GRANT_ID, CashAppPayPaymentMethod.CUSTOMER_ID, CashAppPayPaymentMethod.CASH_TAG, CashAppPayPaymentMethod.STORED_PAYMENT_METHOD_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getGrantId", "setGrantId", "getOnFileGrantId", "setOnFileGrantId", "getCustomerId", "setCustomerId", "getCashtag", "setCashtag", "getStoredPaymentMethodId", "setStoredPaymentMethodId", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CashAppPayPaymentMethod extends PaymentMethodDetails {
    private static final String CASH_TAG = "cashtag";
    private static final String CUSTOMER_ID = "customerId";
    private static final String GRANT_ID = "grantId";
    private static final String ON_FILE_GRANT_ID = "onFileGrantId";
    public static final String PAYMENT_METHOD_TYPE = "cashapp";
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
    private String cashtag;
    private String checkoutAttemptId;
    private String customerId;
    private String grantId;
    private String onFileGrantId;
    private String storedPaymentMethodId;
    private String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CashAppPayPaymentMethod> CREATOR = new c();
    private static final b.a<CashAppPayPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<CashAppPayPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CashAppPayPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new CashAppPayPaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CashAppPayPaymentMethod.GRANT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CashAppPayPaymentMethod.ON_FILE_GRANT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CashAppPayPaymentMethod.CUSTOMER_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CashAppPayPaymentMethod.CASH_TAG), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CashAppPayPaymentMethod.STORED_PAYMENT_METHOD_ID));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(CashAppPayPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(CashAppPayPaymentMethod.GRANT_ID, modelObject.getGrantId());
                jSONObject.putOpt(CashAppPayPaymentMethod.ON_FILE_GRANT_ID, modelObject.getOnFileGrantId());
                jSONObject.putOpt(CashAppPayPaymentMethod.CUSTOMER_ID, modelObject.getCustomerId());
                jSONObject.putOpt(CashAppPayPaymentMethod.CASH_TAG, modelObject.getCashtag());
                jSONObject.putOpt(CashAppPayPaymentMethod.STORED_PAYMENT_METHOD_ID, modelObject.getStoredPaymentMethodId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(CashAppPayPaymentMethod.class, e11);
            }
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.paymentmethod.CashAppPayPaymentMethod$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod$b;", "", "<init>", "()V", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod;", "SERIALIZER", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "a", "()Lcom/adyen/checkout/core/internal/data/model/b$a;", "", "CASH_TAG", "Ljava/lang/String;", "CUSTOMER_ID", "GRANT_ID", "ON_FILE_GRANT_ID", "PAYMENT_METHOD_TYPE", "STORED_PAYMENT_METHOD_ID", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b.a<CashAppPayPaymentMethod> a() {
            return CashAppPayPaymentMethod.SERIALIZER;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<CashAppPayPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CashAppPayPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new CashAppPayPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CashAppPayPaymentMethod[] newArray(int i11) {
            return new CashAppPayPaymentMethod[i11];
        }
    }

    public /* synthetic */ CashAppPayPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }

    public static /* synthetic */ CashAppPayPaymentMethod copy$default(CashAppPayPaymentMethod cashAppPayPaymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cashAppPayPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = cashAppPayPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = cashAppPayPaymentMethod.grantId;
        }
        if ((i11 & 8) != 0) {
            str4 = cashAppPayPaymentMethod.onFileGrantId;
        }
        if ((i11 & 16) != 0) {
            str5 = cashAppPayPaymentMethod.customerId;
        }
        if ((i11 & 32) != 0) {
            str6 = cashAppPayPaymentMethod.cashtag;
        }
        if ((i11 & 64) != 0) {
            str7 = cashAppPayPaymentMethod.storedPaymentMethodId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return cashAppPayPaymentMethod.copy(str, str2, str11, str4, str10, str8, str9);
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
    public final String getGrantId() {
        return this.grantId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOnFileGrantId() {
        return this.onFileGrantId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCashtag() {
        return this.cashtag;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    public final CashAppPayPaymentMethod copy(String type, String checkoutAttemptId, String grantId, String onFileGrantId, String customerId, String cashtag, String storedPaymentMethodId) {
        return new CashAppPayPaymentMethod(type, checkoutAttemptId, grantId, onFileGrantId, customerId, cashtag, storedPaymentMethodId);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayPaymentMethod)) {
            return false;
        }
        CashAppPayPaymentMethod cashAppPayPaymentMethod = (CashAppPayPaymentMethod) other;
        return s.f(this.type, cashAppPayPaymentMethod.type) && s.f(this.checkoutAttemptId, cashAppPayPaymentMethod.checkoutAttemptId) && s.f(this.grantId, cashAppPayPaymentMethod.grantId) && s.f(this.onFileGrantId, cashAppPayPaymentMethod.onFileGrantId) && s.f(this.customerId, cashAppPayPaymentMethod.customerId) && s.f(this.cashtag, cashAppPayPaymentMethod.cashtag) && s.f(this.storedPaymentMethodId, cashAppPayPaymentMethod.storedPaymentMethodId);
    }

    public final String getCashtag() {
        return this.cashtag;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getGrantId() {
        return this.grantId;
    }

    public final String getOnFileGrantId() {
        return this.onFileGrantId;
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
        String str3 = this.grantId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.onFileGrantId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.customerId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cashtag;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.storedPaymentMethodId;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setCashtag(String str) {
        this.cashtag = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(String str) {
        this.checkoutAttemptId = str;
    }

    public final void setCustomerId(String str) {
        this.customerId = str;
    }

    public final void setGrantId(String str) {
        this.grantId = str;
    }

    public final void setOnFileGrantId(String str) {
        this.onFileGrantId = str;
    }

    public final void setStoredPaymentMethodId(String str) {
        this.storedPaymentMethodId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "CashAppPayPaymentMethod(type=" + this.type + ", checkoutAttemptId=" + this.checkoutAttemptId + ", grantId=" + this.grantId + ", onFileGrantId=" + this.onFileGrantId + ", customerId=" + this.customerId + ", cashtag=" + this.cashtag + ", storedPaymentMethodId=" + this.storedPaymentMethodId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.grantId);
        parcel.writeString(this.onFileGrantId);
        parcel.writeString(this.customerId);
        parcel.writeString(this.cashtag);
        parcel.writeString(this.storedPaymentMethodId);
    }

    public CashAppPayPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.grantId = str3;
        this.onFileGrantId = str4;
        this.customerId = str5;
        this.cashtag = str6;
        this.storedPaymentMethodId = str7;
    }
}
