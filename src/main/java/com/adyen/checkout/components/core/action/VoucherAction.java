package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u0000 f2\u00020\u0001:\u0001gBß\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0019J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u0019J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0019Jè\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020/HÖ\u0001¢\u0006\u0004\b7\u00101J \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020/HÖ\u0001¢\u0006\u0004\b<\u0010=R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u0019\"\u0004\b@\u0010AR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010>\u001a\u0004\bB\u0010\u0019\"\u0004\bC\u0010AR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010>\u001a\u0004\bD\u0010\u0019\"\u0004\bE\u0010AR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010>\u001a\u0004\bF\u0010\u0019\"\u0004\bG\u0010AR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010H\u001a\u0004\bI\u0010\u001e\"\u0004\bJ\u0010KR$\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010H\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010KR$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010H\u001a\u0004\bN\u0010\u001e\"\u0004\bO\u0010KR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010>\u001a\u0004\bP\u0010\u0019\"\u0004\bQ\u0010AR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010>\u001a\u0004\bR\u0010\u0019\"\u0004\bS\u0010AR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\bT\u0010\u0019\"\u0004\bU\u0010AR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010>\u001a\u0004\bV\u0010\u0019\"\u0004\bW\u0010AR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010>\u001a\u0004\bX\u0010\u0019\"\u0004\bY\u0010AR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010>\u001a\u0004\bZ\u0010\u0019\"\u0004\b[\u0010AR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010>\u001a\u0004\b\\\u0010\u0019\"\u0004\b]\u0010AR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010>\u001a\u0004\b^\u0010\u0019\"\u0004\b_\u0010AR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010>\u001a\u0004\b`\u0010\u0019\"\u0004\ba\u0010AR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010>\u001a\u0004\bb\u0010\u0019\"\u0004\bc\u0010AR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010>\u001a\u0004\bd\u0010\u0019\"\u0004\be\u0010A¨\u0006h"}, d2 = {"Lcom/adyen/checkout/components/core/action/VoucherAction;", "Lcom/adyen/checkout/components/core/action/Action;", "", "type", "paymentData", Action.PAYMENT_METHOD_TYPE, VoucherAction.ENTITY, "Lcom/adyen/checkout/components/core/Amount;", VoucherAction.SURCHARGE, VoucherAction.INITIAL_AMOUNT, VoucherAction.TOTAL_AMOUNT, "issuer", VoucherAction.EXPIRES_AT, VoucherAction.REFERENCE, VoucherAction.COLLECTION_INSTITUTION_NUMBER, VoucherAction.MASKED_TELEPHONE_NUMBER, VoucherAction.ALTERNATIVE_REFERENCE, VoucherAction.MERCHANT_NAME, VoucherAction.MERCHANT_REFERENCE, "url", VoucherAction.DOWNLOAD_URL, VoucherAction.INSTRUCTIONS_URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/adyen/checkout/components/core/Amount;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/action/VoucherAction;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getPaymentData", "setPaymentData", "getPaymentMethodType", "setPaymentMethodType", "getEntity", "setEntity", "Lcom/adyen/checkout/components/core/Amount;", "getSurcharge", "setSurcharge", "(Lcom/adyen/checkout/components/core/Amount;)V", "getInitialAmount", "setInitialAmount", "getTotalAmount", "setTotalAmount", "getIssuer", "setIssuer", "getExpiresAt", "setExpiresAt", "getReference", "setReference", "getCollectionInstitutionNumber", "setCollectionInstitutionNumber", "getMaskedTelephoneNumber", "setMaskedTelephoneNumber", "getAlternativeReference", "setAlternativeReference", "getMerchantName", "setMerchantName", "getMerchantReference", "setMerchantReference", "getUrl", "setUrl", "getDownloadUrl", "setDownloadUrl", "getInstructionsUrl", "setInstructionsUrl", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VoucherAction extends Action {
    public static final String ACTION_TYPE = "voucher";
    private static final String ALTERNATIVE_REFERENCE = "alternativeReference";
    private static final String COLLECTION_INSTITUTION_NUMBER = "collectionInstitutionNumber";
    private static final String DOWNLOAD_URL = "downloadUrl";
    private static final String ENTITY = "entity";
    private static final String EXPIRES_AT = "expiresAt";
    private static final String INITIAL_AMOUNT = "initialAmount";
    private static final String INSTRUCTIONS_URL = "instructionsUrl";
    private static final String ISSUER = "issuer";
    private static final String MASKED_TELEPHONE_NUMBER = "maskedTelephoneNumber";
    private static final String MERCHANT_NAME = "merchantName";
    private static final String MERCHANT_REFERENCE = "merchantReference";
    private static final String REFERENCE = "reference";
    private static final String SURCHARGE = "surcharge";
    private static final String TOTAL_AMOUNT = "totalAmount";
    private static final String URL = "url";
    private String alternativeReference;
    private String collectionInstitutionNumber;
    private String downloadUrl;
    private String entity;
    private String expiresAt;
    private Amount initialAmount;
    private String instructionsUrl;
    private String issuer;
    private String maskedTelephoneNumber;
    private String merchantName;
    private String merchantReference;
    private String paymentData;
    private String paymentMethodType;
    private String reference;
    private Amount surcharge;
    private Amount totalAmount;
    private String type;
    private String url;
    public static final Parcelable.Creator<VoucherAction> CREATOR = new c();
    public static final b.a<VoucherAction> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/action/VoucherAction$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/action/VoucherAction;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/action/VoucherAction;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/action/VoucherAction;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<VoucherAction> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public VoucherAction b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            String strE = com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type");
            String strE2 = com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "paymentData");
            String strE3 = com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Action.PAYMENT_METHOD_TYPE);
            String strE4 = com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.ENTITY);
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(VoucherAction.SURCHARGE);
            b.a<Amount> aVar = Amount.SERIALIZER;
            return new VoucherAction(strE, strE2, strE3, strE4, (Amount) com.adyen.checkout.core.internal.data.model.c.a(jSONObjectOptJSONObject, aVar), (Amount) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(VoucherAction.INITIAL_AMOUNT), aVar), (Amount) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(VoucherAction.TOTAL_AMOUNT), aVar), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "issuer"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.EXPIRES_AT), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.REFERENCE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.COLLECTION_INSTITUTION_NUMBER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.MASKED_TELEPHONE_NUMBER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.ALTERNATIVE_REFERENCE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.MERCHANT_NAME), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.MERCHANT_REFERENCE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "url"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.DOWNLOAD_URL), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, VoucherAction.INSTRUCTIONS_URL));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(VoucherAction modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt(VoucherAction.ENTITY, modelObject.getEntity());
                Amount surcharge = modelObject.getSurcharge();
                b.a<Amount> aVar = Amount.SERIALIZER;
                jSONObject.putOpt(VoucherAction.SURCHARGE, com.adyen.checkout.core.internal.data.model.c.c(surcharge, aVar));
                jSONObject.putOpt(VoucherAction.INITIAL_AMOUNT, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getInitialAmount(), aVar));
                jSONObject.putOpt(VoucherAction.TOTAL_AMOUNT, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getTotalAmount(), aVar));
                jSONObject.putOpt("issuer", modelObject.getIssuer());
                jSONObject.putOpt(VoucherAction.EXPIRES_AT, modelObject.getExpiresAt());
                jSONObject.putOpt(VoucherAction.REFERENCE, modelObject.getReference());
                jSONObject.putOpt(VoucherAction.COLLECTION_INSTITUTION_NUMBER, modelObject.getCollectionInstitutionNumber());
                jSONObject.putOpt(VoucherAction.MASKED_TELEPHONE_NUMBER, modelObject.getMaskedTelephoneNumber());
                jSONObject.putOpt(VoucherAction.ALTERNATIVE_REFERENCE, modelObject.getAlternativeReference());
                jSONObject.putOpt(VoucherAction.MERCHANT_NAME, modelObject.getMerchantName());
                jSONObject.putOpt(VoucherAction.MERCHANT_REFERENCE, modelObject.getMerchantReference());
                jSONObject.putOpt("url", modelObject.getUrl());
                jSONObject.putOpt(VoucherAction.DOWNLOAD_URL, modelObject.getDownloadUrl());
                jSONObject.putOpt(VoucherAction.INSTRUCTIONS_URL, modelObject.getInstructionsUrl());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(VoucherAction.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<VoucherAction> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VoucherAction createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new VoucherAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Amount.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VoucherAction[] newArray(int i11) {
            return new VoucherAction[i11];
        }
    }

    public VoucherAction() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static /* synthetic */ VoucherAction copy$default(VoucherAction voucherAction, String str, String str2, String str3, String str4, Amount amount, Amount amount2, Amount amount3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, Object obj) {
        String str16;
        String str17;
        String str18 = (i11 & 1) != 0 ? voucherAction.type : str;
        String str19 = (i11 & 2) != 0 ? voucherAction.paymentData : str2;
        String str20 = (i11 & 4) != 0 ? voucherAction.paymentMethodType : str3;
        String str21 = (i11 & 8) != 0 ? voucherAction.entity : str4;
        Amount amount4 = (i11 & 16) != 0 ? voucherAction.surcharge : amount;
        Amount amount5 = (i11 & 32) != 0 ? voucherAction.initialAmount : amount2;
        Amount amount6 = (i11 & 64) != 0 ? voucherAction.totalAmount : amount3;
        String str22 = (i11 & 128) != 0 ? voucherAction.issuer : str5;
        String str23 = (i11 & 256) != 0 ? voucherAction.expiresAt : str6;
        String str24 = (i11 & 512) != 0 ? voucherAction.reference : str7;
        String str25 = (i11 & 1024) != 0 ? voucherAction.collectionInstitutionNumber : str8;
        String str26 = (i11 & 2048) != 0 ? voucherAction.maskedTelephoneNumber : str9;
        String str27 = (i11 & 4096) != 0 ? voucherAction.alternativeReference : str10;
        String str28 = (i11 & PKIFailureInfo.certRevoked) != 0 ? voucherAction.merchantName : str11;
        String str29 = str18;
        String str30 = (i11 & 16384) != 0 ? voucherAction.merchantReference : str12;
        String str31 = (i11 & 32768) != 0 ? voucherAction.url : str13;
        String str32 = (i11 & 65536) != 0 ? voucherAction.downloadUrl : str14;
        if ((i11 & 131072) != 0) {
            str17 = str32;
            str16 = voucherAction.instructionsUrl;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return voucherAction.copy(str29, str19, str20, str21, amount4, amount5, amount6, str22, str23, str24, str25, str26, str27, str28, str30, str31, str17, str16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCollectionInstitutionNumber() {
        return this.collectionInstitutionNumber;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMaskedTelephoneNumber() {
        return this.maskedTelephoneNumber;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAlternativeReference() {
        return this.alternativeReference;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getMerchantReference() {
        return this.merchantReference;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getInstructionsUrl() {
        return this.instructionsUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntity() {
        return this.entity;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Amount getSurcharge() {
        return this.surcharge;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Amount getInitialAmount() {
        return this.initialAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final VoucherAction copy(String type, String paymentData, String paymentMethodType, String entity, Amount surcharge, Amount initialAmount, Amount totalAmount, String issuer, String expiresAt, String reference, String collectionInstitutionNumber, String maskedTelephoneNumber, String alternativeReference, String merchantName, String merchantReference, String url, String downloadUrl, String instructionsUrl) {
        return new VoucherAction(type, paymentData, paymentMethodType, entity, surcharge, initialAmount, totalAmount, issuer, expiresAt, reference, collectionInstitutionNumber, maskedTelephoneNumber, alternativeReference, merchantName, merchantReference, url, downloadUrl, instructionsUrl);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherAction)) {
            return false;
        }
        VoucherAction voucherAction = (VoucherAction) other;
        return s.f(this.type, voucherAction.type) && s.f(this.paymentData, voucherAction.paymentData) && s.f(this.paymentMethodType, voucherAction.paymentMethodType) && s.f(this.entity, voucherAction.entity) && s.f(this.surcharge, voucherAction.surcharge) && s.f(this.initialAmount, voucherAction.initialAmount) && s.f(this.totalAmount, voucherAction.totalAmount) && s.f(this.issuer, voucherAction.issuer) && s.f(this.expiresAt, voucherAction.expiresAt) && s.f(this.reference, voucherAction.reference) && s.f(this.collectionInstitutionNumber, voucherAction.collectionInstitutionNumber) && s.f(this.maskedTelephoneNumber, voucherAction.maskedTelephoneNumber) && s.f(this.alternativeReference, voucherAction.alternativeReference) && s.f(this.merchantName, voucherAction.merchantName) && s.f(this.merchantReference, voucherAction.merchantReference) && s.f(this.url, voucherAction.url) && s.f(this.downloadUrl, voucherAction.downloadUrl) && s.f(this.instructionsUrl, voucherAction.instructionsUrl);
    }

    public final String getAlternativeReference() {
        return this.alternativeReference;
    }

    public final String getCollectionInstitutionNumber() {
        return this.collectionInstitutionNumber;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getEntity() {
        return this.entity;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final Amount getInitialAmount() {
        return this.initialAmount;
    }

    public final String getInstructionsUrl() {
        return this.instructionsUrl;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getMaskedTelephoneNumber() {
        return this.maskedTelephoneNumber;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getMerchantReference() {
        return this.merchantReference;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public String getPaymentData() {
        return this.paymentData;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final String getReference() {
        return this.reference;
    }

    public final Amount getSurcharge() {
        return this.surcharge;
    }

    public final Amount getTotalAmount() {
        return this.totalAmount;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entity;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Amount amount = this.surcharge;
        int iHashCode5 = (iHashCode4 + (amount == null ? 0 : amount.hashCode())) * 31;
        Amount amount2 = this.initialAmount;
        int iHashCode6 = (iHashCode5 + (amount2 == null ? 0 : amount2.hashCode())) * 31;
        Amount amount3 = this.totalAmount;
        int iHashCode7 = (iHashCode6 + (amount3 == null ? 0 : amount3.hashCode())) * 31;
        String str5 = this.issuer;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.expiresAt;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.reference;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.collectionInstitutionNumber;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.maskedTelephoneNumber;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.alternativeReference;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.merchantName;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.merchantReference;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.url;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.downloadUrl;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.instructionsUrl;
        return iHashCode17 + (str15 != null ? str15.hashCode() : 0);
    }

    public final void setAlternativeReference(String str) {
        this.alternativeReference = str;
    }

    public final void setCollectionInstitutionNumber(String str) {
        this.collectionInstitutionNumber = str;
    }

    public final void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public final void setEntity(String str) {
        this.entity = str;
    }

    public final void setExpiresAt(String str) {
        this.expiresAt = str;
    }

    public final void setInitialAmount(Amount amount) {
        this.initialAmount = amount;
    }

    public final void setInstructionsUrl(String str) {
        this.instructionsUrl = str;
    }

    public final void setIssuer(String str) {
        this.issuer = str;
    }

    public final void setMaskedTelephoneNumber(String str) {
        this.maskedTelephoneNumber = str;
    }

    public final void setMerchantName(String str) {
        this.merchantName = str;
    }

    public final void setMerchantReference(String str) {
        this.merchantReference = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentData(String str) {
        this.paymentData = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentMethodType(String str) {
        this.paymentMethodType = str;
    }

    public final void setReference(String str) {
        this.reference = str;
    }

    public final void setSurcharge(Amount amount) {
        this.surcharge = amount;
    }

    public final void setTotalAmount(Amount amount) {
        this.totalAmount = amount;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setType(String str) {
        this.type = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "VoucherAction(type=" + this.type + ", paymentData=" + this.paymentData + ", paymentMethodType=" + this.paymentMethodType + ", entity=" + this.entity + ", surcharge=" + this.surcharge + ", initialAmount=" + this.initialAmount + ", totalAmount=" + this.totalAmount + ", issuer=" + this.issuer + ", expiresAt=" + this.expiresAt + ", reference=" + this.reference + ", collectionInstitutionNumber=" + this.collectionInstitutionNumber + ", maskedTelephoneNumber=" + this.maskedTelephoneNumber + ", alternativeReference=" + this.alternativeReference + ", merchantName=" + this.merchantName + ", merchantReference=" + this.merchantReference + ", url=" + this.url + ", downloadUrl=" + this.downloadUrl + ", instructionsUrl=" + this.instructionsUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.paymentData);
        parcel.writeString(this.paymentMethodType);
        parcel.writeString(this.entity);
        Amount amount = this.surcharge;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
        Amount amount2 = this.initialAmount;
        if (amount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount2.writeToParcel(parcel, flags);
        }
        Amount amount3 = this.totalAmount;
        if (amount3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount3.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.issuer);
        parcel.writeString(this.expiresAt);
        parcel.writeString(this.reference);
        parcel.writeString(this.collectionInstitutionNumber);
        parcel.writeString(this.maskedTelephoneNumber);
        parcel.writeString(this.alternativeReference);
        parcel.writeString(this.merchantName);
        parcel.writeString(this.merchantReference);
        parcel.writeString(this.url);
        parcel.writeString(this.downloadUrl);
        parcel.writeString(this.instructionsUrl);
    }

    public /* synthetic */ VoucherAction(String str, String str2, String str3, String str4, Amount amount, Amount amount2, Amount amount3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : amount, (i11 & 32) != 0 ? null : amount2, (i11 & 64) != 0 ? null : amount3, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : str7, (i11 & 1024) != 0 ? null : str8, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : str10, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str11, (i11 & 16384) != 0 ? null : str12, (i11 & 32768) != 0 ? null : str13, (i11 & 65536) != 0 ? null : str14, (i11 & 131072) != 0 ? null : str15);
    }

    public VoucherAction(String str, String str2, String str3, String str4, Amount amount, Amount amount2, Amount amount3, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.type = str;
        this.paymentData = str2;
        this.paymentMethodType = str3;
        this.entity = str4;
        this.surcharge = amount;
        this.initialAmount = amount2;
        this.totalAmount = amount3;
        this.issuer = str5;
        this.expiresAt = str6;
        this.reference = str7;
        this.collectionInstitutionNumber = str8;
        this.maskedTelephoneNumber = str9;
        this.alternativeReference = str10;
        this.merchantName = str11;
        this.merchantReference = str12;
        this.url = str13;
        this.downloadUrl = str14;
        this.instructionsUrl = str15;
    }
}
