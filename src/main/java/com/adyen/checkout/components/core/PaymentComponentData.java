package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\b\u0018\u0000 m*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001nB©\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010$J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010$J\u0012\u0010.\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u0010\"J¾\u0001\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b3\u0010$J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000204HÖ\u0001¢\u0006\u0004\b?\u0010@R$\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010A\u001a\u0004\bB\u0010\u001c\"\u0004\bC\u0010DR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010E\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010HR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010 \"\u0004\bK\u0010LR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010PR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010Q\u001a\u0004\bR\u0010$\"\u0004\bS\u0010TR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010U\u001a\u0004\bV\u0010&\"\u0004\bW\u0010XR$\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010U\u001a\u0004\bY\u0010&\"\u0004\bZ\u0010XR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010[\u001a\u0004\b\\\u0010)\"\u0004\b]\u0010^R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010Q\u001a\u0004\b_\u0010$\"\u0004\b`\u0010TR$\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010Q\u001a\u0004\ba\u0010$\"\u0004\bb\u0010TR$\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010Q\u001a\u0004\bc\u0010$\"\u0004\bd\u0010TR$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010Q\u001a\u0004\be\u0010$\"\u0004\bf\u0010TR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010g\u001a\u0004\bh\u0010/\"\u0004\bi\u0010jR$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010M\u001a\u0004\bk\u0010\"\"\u0004\bl\u0010P¨\u0006o"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentComponentData;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "PaymentMethodDetailsT", "Lcom/adyen/checkout/core/internal/data/model/b;", PaymentComponentData.PAYMENT_METHOD, "Lcom/adyen/checkout/components/core/OrderRequest;", PaymentComponentData.ORDER, "Lcom/adyen/checkout/components/core/Amount;", PaymentComponentData.AMOUNT, "", PaymentComponentData.STORE_PAYMENT_METHOD, "", PaymentComponentData.SHOPPER_REFERENCE, "Lcom/adyen/checkout/components/core/Address;", PaymentComponentData.BILLING_ADDRESS, PaymentComponentData.DELIVERY_ADDRESS, "Lcom/adyen/checkout/components/core/ShopperName;", PaymentComponentData.SHOPPER_NAME, "telephoneNumber", "shopperEmail", PaymentComponentData.DATE_OF_BIRTH, PaymentComponentData.SOCIAL_SECURITY_NUMBER, "Lcom/adyen/checkout/components/core/Installments;", PaymentComponentData.INSTALLMENTS, PaymentComponentData.SUPPORT_NATIVE_REDIRECT, "<init>", "(Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/Boolean;Ljava/lang/String;Lcom/adyen/checkout/components/core/Address;Lcom/adyen/checkout/components/core/Address;Lcom/adyen/checkout/components/core/ShopperName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Installments;Ljava/lang/Boolean;)V", "component1", "()Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "component2", "()Lcom/adyen/checkout/components/core/OrderRequest;", "component3", "()Lcom/adyen/checkout/components/core/Amount;", "component4", "()Ljava/lang/Boolean;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/adyen/checkout/components/core/Address;", "component7", "component8", "()Lcom/adyen/checkout/components/core/ShopperName;", "component9", "component10", "component11", "component12", "component13", "()Lcom/adyen/checkout/components/core/Installments;", "component14", "copy", "(Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;Lcom/adyen/checkout/components/core/OrderRequest;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/Boolean;Ljava/lang/String;Lcom/adyen/checkout/components/core/Address;Lcom/adyen/checkout/components/core/Address;Lcom/adyen/checkout/components/core/ShopperName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Installments;Ljava/lang/Boolean;)Lcom/adyen/checkout/components/core/PaymentComponentData;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "getPaymentMethod", "setPaymentMethod", "(Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;)V", "Lcom/adyen/checkout/components/core/OrderRequest;", "getOrder", "setOrder", "(Lcom/adyen/checkout/components/core/OrderRequest;)V", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "setAmount", "(Lcom/adyen/checkout/components/core/Amount;)V", "Ljava/lang/Boolean;", "getStorePaymentMethod", "setStorePaymentMethod", "(Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getShopperReference", "setShopperReference", "(Ljava/lang/String;)V", "Lcom/adyen/checkout/components/core/Address;", "getBillingAddress", "setBillingAddress", "(Lcom/adyen/checkout/components/core/Address;)V", "getDeliveryAddress", "setDeliveryAddress", "Lcom/adyen/checkout/components/core/ShopperName;", "getShopperName", "setShopperName", "(Lcom/adyen/checkout/components/core/ShopperName;)V", "getTelephoneNumber", "setTelephoneNumber", "getShopperEmail", "setShopperEmail", "getDateOfBirth", "setDateOfBirth", "getSocialSecurityNumber", "setSocialSecurityNumber", "Lcom/adyen/checkout/components/core/Installments;", "getInstallments", "setInstallments", "(Lcom/adyen/checkout/components/core/Installments;)V", "getSupportNativeRedirect", "setSupportNativeRedirect", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentComponentData<PaymentMethodDetailsT extends PaymentMethodDetails> extends b {
    private static final String AMOUNT = "amount";
    private static final String BILLING_ADDRESS = "billingAddress";
    private static final String DATE_OF_BIRTH = "dateOfBirth";
    private static final String DELIVERY_ADDRESS = "deliveryAddress";
    private static final String INSTALLMENTS = "installments";
    private static final String ORDER = "order";
    private static final String PAYMENT_METHOD = "paymentMethod";
    private static final String SHOPPER_EMAIL = "shopperEmail";
    private static final String SHOPPER_NAME = "shopperName";
    private static final String SHOPPER_REFERENCE = "shopperReference";
    private static final String SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
    private static final String STORE_PAYMENT_METHOD = "storePaymentMethod";
    private static final String SUPPORT_NATIVE_REDIRECT = "supportNativeRedirect";
    private static final String TELEPHONE_NUMBER = "telephoneNumber";
    private Amount amount;
    private Address billingAddress;
    private String dateOfBirth;
    private Address deliveryAddress;
    private Installments installments;
    private OrderRequest order;
    private PaymentMethodDetailsT paymentMethod;
    private String shopperEmail;
    private ShopperName shopperName;
    private String shopperReference;
    private String socialSecurityNumber;
    private Boolean storePaymentMethod;
    private Boolean supportNativeRedirect;
    private String telephoneNumber;
    public static final Parcelable.Creator<PaymentComponentData<?>> CREATOR = new c();
    public static final b.a<PaymentComponentData<?>> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/adyen/checkout/components/core/PaymentComponentData$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/PaymentComponentData;)Lorg/json/JSONObject;", "jsonObject", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/PaymentComponentData;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<PaymentComponentData<?>> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PaymentComponentData<PaymentMethodDetails> b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(PaymentComponentData.PAYMENT_METHOD), PaymentMethodDetails.SERIALIZER);
            OrderRequest orderRequest = (OrderRequest) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(PaymentComponentData.ORDER), OrderRequest.SERIALIZER);
            Amount amount = (Amount) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(PaymentComponentData.AMOUNT), Amount.SERIALIZER);
            Boolean boolValueOf = Boolean.valueOf(jsonObject.optBoolean(PaymentComponentData.STORE_PAYMENT_METHOD));
            String strOptString = jsonObject.optString(PaymentComponentData.SHOPPER_REFERENCE);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(PaymentComponentData.BILLING_ADDRESS);
            b.a<Address> aVar = Address.SERIALIZER;
            return new PaymentComponentData<>(paymentMethodDetails, orderRequest, amount, boolValueOf, strOptString, (Address) com.adyen.checkout.core.internal.data.model.c.a(jSONObjectOptJSONObject, aVar), (Address) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(PaymentComponentData.DELIVERY_ADDRESS), aVar), (ShopperName) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(PaymentComponentData.SHOPPER_NAME), ShopperName.SERIALIZER), jsonObject.optString("telephoneNumber"), jsonObject.optString("shopperEmail"), jsonObject.optString(PaymentComponentData.DATE_OF_BIRTH), jsonObject.optString(PaymentComponentData.SOCIAL_SECURITY_NUMBER), (Installments) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(PaymentComponentData.INSTALLMENTS), Installments.SERIALIZER), Boolean.valueOf(jsonObject.optBoolean(PaymentComponentData.SUPPORT_NATIVE_REDIRECT)));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(PaymentComponentData<?> modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(PaymentComponentData.PAYMENT_METHOD, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getPaymentMethod(), PaymentMethodDetails.SERIALIZER));
                jSONObject.putOpt(PaymentComponentData.ORDER, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getOrder(), OrderRequest.SERIALIZER));
                jSONObject.putOpt(PaymentComponentData.AMOUNT, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getAmount(), Amount.SERIALIZER));
                jSONObject.putOpt(PaymentComponentData.STORE_PAYMENT_METHOD, modelObject.getStorePaymentMethod());
                jSONObject.putOpt(PaymentComponentData.SHOPPER_REFERENCE, modelObject.getShopperReference());
                Address billingAddress = modelObject.getBillingAddress();
                b.a<Address> aVar = Address.SERIALIZER;
                jSONObject.putOpt(PaymentComponentData.BILLING_ADDRESS, com.adyen.checkout.core.internal.data.model.c.c(billingAddress, aVar));
                jSONObject.putOpt(PaymentComponentData.DELIVERY_ADDRESS, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getDeliveryAddress(), aVar));
                jSONObject.putOpt(PaymentComponentData.SHOPPER_NAME, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getShopperName(), ShopperName.SERIALIZER));
                jSONObject.putOpt("telephoneNumber", modelObject.getTelephoneNumber());
                jSONObject.putOpt("shopperEmail", modelObject.getShopperEmail());
                jSONObject.putOpt(PaymentComponentData.DATE_OF_BIRTH, modelObject.getDateOfBirth());
                jSONObject.putOpt(PaymentComponentData.SOCIAL_SECURITY_NUMBER, modelObject.getSocialSecurityNumber());
                jSONObject.putOpt(PaymentComponentData.INSTALLMENTS, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getInstallments(), Installments.SERIALIZER));
                jSONObject.putOpt(PaymentComponentData.SUPPORT_NATIVE_REDIRECT, modelObject.getSupportNativeRedirect());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(PaymentComponentData.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<PaymentComponentData<?>> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentComponentData<?> createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            s.k(parcel, "parcel");
            PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) parcel.readParcelable(PaymentComponentData.class.getClassLoader());
            OrderRequest orderRequestCreateFromParcel = parcel.readInt() == 0 ? null : OrderRequest.CREATOR.createFromParcel(parcel);
            Amount amountCreateFromParcel = parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string = parcel.readString();
            Address addressCreateFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            Address addressCreateFromParcel2 = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            ShopperName shopperNameCreateFromParcel = parcel.readInt() == 0 ? null : ShopperName.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z11 = false;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Installments installmentsCreateFromParcel = parcel.readInt() == 0 ? null : Installments.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                boolValueOf2 = Boolean.valueOf(z11);
            }
            return new PaymentComponentData<>(paymentMethodDetails, orderRequestCreateFromParcel, amountCreateFromParcel, boolValueOf, string, addressCreateFromParcel, addressCreateFromParcel2, shopperNameCreateFromParcel, string2, string3, string4, string5, installmentsCreateFromParcel, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentComponentData<?>[] newArray(int i11) {
            return new PaymentComponentData[i11];
        }
    }

    public /* synthetic */ PaymentComponentData(PaymentMethodDetails paymentMethodDetails, OrderRequest orderRequest, Amount amount, Boolean bool, String str, Address address, Address address2, ShopperName shopperName, String str2, String str3, String str4, String str5, Installments installments, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentMethodDetails, orderRequest, amount, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : address, (i11 & 64) != 0 ? null : address2, (i11 & 128) != 0 ? null : shopperName, (i11 & 256) != 0 ? null : str2, (i11 & 512) != 0 ? null : str3, (i11 & 1024) != 0 ? null : str4, (i11 & 2048) != 0 ? null : str5, (i11 & 4096) != 0 ? null : installments, (i11 & PKIFailureInfo.certRevoked) != 0 ? Boolean.TRUE : bool2);
    }

    public final PaymentMethodDetailsT component1() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getShopperEmail() {
        return this.shopperEmail;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Installments getInstallments() {
        return this.installments;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getSupportNativeRedirect() {
        return this.supportNativeRedirect;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrderRequest getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getStorePaymentMethod() {
        return this.storePaymentMethod;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShopperReference() {
        return this.shopperReference;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Address getBillingAddress() {
        return this.billingAddress;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Address getDeliveryAddress() {
        return this.deliveryAddress;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ShopperName getShopperName() {
        return this.shopperName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public final PaymentComponentData<PaymentMethodDetailsT> copy(PaymentMethodDetailsT paymentMethod, OrderRequest order, Amount amount, Boolean storePaymentMethod, String shopperReference, Address billingAddress, Address deliveryAddress, ShopperName shopperName, String telephoneNumber, String shopperEmail, String dateOfBirth, String socialSecurityNumber, Installments installments, Boolean supportNativeRedirect) {
        return new PaymentComponentData<>(paymentMethod, order, amount, storePaymentMethod, shopperReference, billingAddress, deliveryAddress, shopperName, telephoneNumber, shopperEmail, dateOfBirth, socialSecurityNumber, installments, supportNativeRedirect);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentComponentData)) {
            return false;
        }
        PaymentComponentData paymentComponentData = (PaymentComponentData) other;
        return s.f(this.paymentMethod, paymentComponentData.paymentMethod) && s.f(this.order, paymentComponentData.order) && s.f(this.amount, paymentComponentData.amount) && s.f(this.storePaymentMethod, paymentComponentData.storePaymentMethod) && s.f(this.shopperReference, paymentComponentData.shopperReference) && s.f(this.billingAddress, paymentComponentData.billingAddress) && s.f(this.deliveryAddress, paymentComponentData.deliveryAddress) && s.f(this.shopperName, paymentComponentData.shopperName) && s.f(this.telephoneNumber, paymentComponentData.telephoneNumber) && s.f(this.shopperEmail, paymentComponentData.shopperEmail) && s.f(this.dateOfBirth, paymentComponentData.dateOfBirth) && s.f(this.socialSecurityNumber, paymentComponentData.socialSecurityNumber) && s.f(this.installments, paymentComponentData.installments) && s.f(this.supportNativeRedirect, paymentComponentData.supportNativeRedirect);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final Address getBillingAddress() {
        return this.billingAddress;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final Address getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public final Installments getInstallments() {
        return this.installments;
    }

    public final OrderRequest getOrder() {
        return this.order;
    }

    public final PaymentMethodDetailsT getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getShopperEmail() {
        return this.shopperEmail;
    }

    public final ShopperName getShopperName() {
        return this.shopperName;
    }

    public final String getShopperReference() {
        return this.shopperReference;
    }

    public final String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public final Boolean getStorePaymentMethod() {
        return this.storePaymentMethod;
    }

    public final Boolean getSupportNativeRedirect() {
        return this.supportNativeRedirect;
    }

    public final String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    public int hashCode() {
        PaymentMethodDetailsT paymentmethoddetailst = this.paymentMethod;
        int iHashCode = (paymentmethoddetailst == null ? 0 : paymentmethoddetailst.hashCode()) * 31;
        OrderRequest orderRequest = this.order;
        int iHashCode2 = (iHashCode + (orderRequest == null ? 0 : orderRequest.hashCode())) * 31;
        Amount amount = this.amount;
        int iHashCode3 = (iHashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        Boolean bool = this.storePaymentMethod;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.shopperReference;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Address address = this.billingAddress;
        int iHashCode6 = (iHashCode5 + (address == null ? 0 : address.hashCode())) * 31;
        Address address2 = this.deliveryAddress;
        int iHashCode7 = (iHashCode6 + (address2 == null ? 0 : address2.hashCode())) * 31;
        ShopperName shopperName = this.shopperName;
        int iHashCode8 = (iHashCode7 + (shopperName == null ? 0 : shopperName.hashCode())) * 31;
        String str2 = this.telephoneNumber;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shopperEmail;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateOfBirth;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.socialSecurityNumber;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Installments installments = this.installments;
        int iHashCode13 = (iHashCode12 + (installments == null ? 0 : installments.hashCode())) * 31;
        Boolean bool2 = this.supportNativeRedirect;
        return iHashCode13 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setAmount(Amount amount) {
        this.amount = amount;
    }

    public final void setBillingAddress(Address address) {
        this.billingAddress = address;
    }

    public final void setDateOfBirth(String str) {
        this.dateOfBirth = str;
    }

    public final void setDeliveryAddress(Address address) {
        this.deliveryAddress = address;
    }

    public final void setInstallments(Installments installments) {
        this.installments = installments;
    }

    public final void setOrder(OrderRequest orderRequest) {
        this.order = orderRequest;
    }

    public final void setPaymentMethod(PaymentMethodDetailsT paymentmethoddetailst) {
        this.paymentMethod = paymentmethoddetailst;
    }

    public final void setShopperEmail(String str) {
        this.shopperEmail = str;
    }

    public final void setShopperName(ShopperName shopperName) {
        this.shopperName = shopperName;
    }

    public final void setShopperReference(String str) {
        this.shopperReference = str;
    }

    public final void setSocialSecurityNumber(String str) {
        this.socialSecurityNumber = str;
    }

    public final void setStorePaymentMethod(Boolean bool) {
        this.storePaymentMethod = bool;
    }

    public final void setSupportNativeRedirect(Boolean bool) {
        this.supportNativeRedirect = bool;
    }

    public final void setTelephoneNumber(String str) {
        this.telephoneNumber = str;
    }

    public String toString() {
        return "PaymentComponentData(paymentMethod=" + this.paymentMethod + ", order=" + this.order + ", amount=" + this.amount + ", storePaymentMethod=" + this.storePaymentMethod + ", shopperReference=" + this.shopperReference + ", billingAddress=" + this.billingAddress + ", deliveryAddress=" + this.deliveryAddress + ", shopperName=" + this.shopperName + ", telephoneNumber=" + this.telephoneNumber + ", shopperEmail=" + this.shopperEmail + ", dateOfBirth=" + this.dateOfBirth + ", socialSecurityNumber=" + this.socialSecurityNumber + ", installments=" + this.installments + ", supportNativeRedirect=" + this.supportNativeRedirect + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeParcelable(this.paymentMethod, flags);
        OrderRequest orderRequest = this.order;
        if (orderRequest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            orderRequest.writeToParcel(parcel, flags);
        }
        Amount amount = this.amount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
        Boolean bool = this.storePaymentMethod;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.shopperReference);
        Address address = this.billingAddress;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, flags);
        }
        Address address2 = this.deliveryAddress;
        if (address2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address2.writeToParcel(parcel, flags);
        }
        ShopperName shopperName = this.shopperName;
        if (shopperName == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shopperName.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.telephoneNumber);
        parcel.writeString(this.shopperEmail);
        parcel.writeString(this.dateOfBirth);
        parcel.writeString(this.socialSecurityNumber);
        Installments installments = this.installments;
        if (installments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            installments.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.supportNativeRedirect;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public PaymentComponentData(PaymentMethodDetailsT paymentmethoddetailst, OrderRequest orderRequest, Amount amount, Boolean bool, String str, Address address, Address address2, ShopperName shopperName, String str2, String str3, String str4, String str5, Installments installments, Boolean bool2) {
        this.paymentMethod = paymentmethoddetailst;
        this.order = orderRequest;
        this.amount = amount;
        this.storePaymentMethod = bool;
        this.shopperReference = str;
        this.billingAddress = address;
        this.deliveryAddress = address2;
        this.shopperName = shopperName;
        this.telephoneNumber = str2;
        this.shopperEmail = str3;
        this.dateOfBirth = str4;
        this.socialSecurityNumber = str5;
        this.installments = installments;
        this.supportNativeRedirect = bool2;
    }
}
