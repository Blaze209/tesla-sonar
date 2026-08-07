package com.adyen.checkout.components.core.action;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.SdkData;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u00010B7\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010#\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010&R$\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/adyen/checkout/components/core/action/SdkAction;", "Lcom/adyen/checkout/components/core/action/SdkData;", "SdkDataT", "Lcom/adyen/checkout/components/core/action/Action;", "", "type", "paymentData", Action.PAYMENT_METHOD_TYPE, SdkAction.SDK_DATA, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/SdkData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/adyen/checkout/components/core/action/SdkData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/components/core/action/SdkData;)Lcom/adyen/checkout/components/core/action/SdkAction;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getPaymentData", "setPaymentData", "getPaymentMethodType", "setPaymentMethodType", "Lcom/adyen/checkout/components/core/action/SdkData;", "getSdkData", "setSdkData", "(Lcom/adyen/checkout/components/core/action/SdkData;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SdkAction<SdkDataT extends SdkData> extends Action {
    public static final String ACTION_TYPE = "sdk";
    private static final String SDK_DATA = "sdkData";
    private String paymentData;
    private String paymentMethodType;
    private SdkDataT sdkData;
    private String type;
    public static final Parcelable.Creator<SdkAction<?>> CREATOR = new c();
    public static final b.a<SdkAction<?>> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/adyen/checkout/components/core/action/SdkAction$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/action/SdkAction;", "", Action.PAYMENT_METHOD_TYPE, "Lcom/adyen/checkout/components/core/action/SdkData;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lcom/adyen/checkout/core/internal/data/model/b$a;", "modelObject", "Lorg/json/JSONObject;", "e", "(Lcom/adyen/checkout/components/core/action/SdkAction;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/action/SdkAction;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SdkAction<?>> {
        a() {
        }

        private final b.a<SdkData> d(String paymentMethodType) {
            if (paymentMethodType == null || paymentMethodType.length() == 0) {
                throw new CheckoutException("SdkAction cannot be parsed with null paymentMethodType.", null, 2, null);
            }
            if (s.f(paymentMethodType, "twint")) {
                b.a<TwintSdkData> aVar = TwintSdkData.SERIALIZER;
                s.i(aVar, "null cannot be cast to non-null type com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<com.adyen.checkout.components.core.action.SdkData>");
                return aVar;
            }
            if (s.f(paymentMethodType, "wechatpaySDK")) {
                b.a<WeChatPaySdkData> aVar2 = WeChatPaySdkData.SERIALIZER;
                s.i(aVar2, "null cannot be cast to non-null type com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<com.adyen.checkout.components.core.action.SdkData>");
                return aVar2;
            }
            throw new CheckoutException("sdkData not found for type paymentMethodType - " + paymentMethodType, null, 2, null);
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SdkAction<SdkData> b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            String strE = com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Action.PAYMENT_METHOD_TYPE);
            return new SdkAction<>(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "paymentData"), strE, (SdkData) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(SdkAction.SDK_DATA), d(strE)));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SdkAction<?> modelObject) {
            s.k(modelObject, "modelObject");
            b.a<SdkData> aVarD = d(modelObject.getPaymentMethodType());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt(Action.PAYMENT_METHOD_TYPE, modelObject.getPaymentMethodType());
                jSONObject.putOpt(SdkAction.SDK_DATA, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getSdkData(), aVarD));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SdkAction.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SdkAction<?>> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SdkAction<?> createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new SdkAction<>(parcel.readString(), parcel.readString(), parcel.readString(), (SdkData) parcel.readParcelable(SdkAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SdkAction<?>[] newArray(int i11) {
            return new SdkAction[i11];
        }
    }

    public SdkAction() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SdkAction copy$default(SdkAction sdkAction, String str, String str2, String str3, SdkData sdkData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sdkAction.type;
        }
        if ((i11 & 2) != 0) {
            str2 = sdkAction.paymentData;
        }
        if ((i11 & 4) != 0) {
            str3 = sdkAction.paymentMethodType;
        }
        if ((i11 & 8) != 0) {
            sdkData = sdkAction.sdkData;
        }
        return sdkAction.copy(str, str2, str3, sdkData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final SdkDataT component4() {
        return this.sdkData;
    }

    public final SdkAction<SdkDataT> copy(String type, String paymentData, String paymentMethodType, SdkDataT sdkData) {
        return new SdkAction<>(type, paymentData, paymentMethodType, sdkData);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkAction)) {
            return false;
        }
        SdkAction sdkAction = (SdkAction) other;
        return s.f(this.type, sdkAction.type) && s.f(this.paymentData, sdkAction.paymentData) && s.f(this.paymentMethodType, sdkAction.paymentMethodType) && s.f(this.sdkData, sdkAction.sdkData);
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public String getPaymentData() {
        return this.paymentData;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final SdkDataT getSdkData() {
        return this.sdkData;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentData;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SdkDataT sdkdatat = this.sdkData;
        return iHashCode3 + (sdkdatat != null ? sdkdatat.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentData(String str) {
        this.paymentData = str;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setPaymentMethodType(String str) {
        this.paymentMethodType = str;
    }

    public final void setSdkData(SdkDataT sdkdatat) {
        this.sdkData = sdkdatat;
    }

    @Override // com.adyen.checkout.components.core.action.Action
    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "SdkAction(type=" + this.type + ", paymentData=" + this.paymentData + ", paymentMethodType=" + this.paymentMethodType + ", sdkData=" + this.sdkData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.paymentData);
        parcel.writeString(this.paymentMethodType);
        parcel.writeParcelable(this.sdkData, flags);
    }

    public /* synthetic */ SdkAction(String str, String str2, String str3, SdkData sdkData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : sdkData);
    }

    public SdkAction(String str, String str2, String str3, SdkDataT sdkdatat) {
        this.type = str;
        this.paymentData = str2;
        this.paymentMethodType = str3;
        this.sdkData = sdkdatat;
    }
}
