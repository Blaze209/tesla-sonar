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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/adyen/checkout/components/core/ActionComponentData;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", "paymentData", "Lorg/json/JSONObject;", "details", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "component1", "()Ljava/lang/String;", "component2", "()Lorg/json/JSONObject;", "copy", "(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/ActionComponentData;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPaymentData", "setPaymentData", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "getDetails", "setDetails", "(Lorg/json/JSONObject;)V", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ActionComponentData extends b {
    private static final String DETAILS = "details";
    private static final String PAYMENT_DATA = "paymentData";
    private JSONObject details;
    private String paymentData;
    public static final Parcelable.Creator<ActionComponentData> CREATOR = new c();
    public static final b.a<ActionComponentData> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/ActionComponentData$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/ActionComponentData;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/ActionComponentData;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/ActionComponentData;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<ActionComponentData> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ActionComponentData b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new ActionComponentData(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "paymentData"), jsonObject.optJSONObject("details"));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(ActionComponentData modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("paymentData", modelObject.getPaymentData());
                jSONObject.putOpt("details", modelObject.getDetails());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(ActionComponentData.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ActionComponentData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ActionComponentData createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ActionComponentData(parcel.readString(), re.a.f107852a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ActionComponentData[] newArray(int i11) {
            return new ActionComponentData[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionComponentData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ActionComponentData copy$default(ActionComponentData actionComponentData, String str, JSONObject jSONObject, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = actionComponentData.paymentData;
        }
        if ((i11 & 2) != 0) {
            jSONObject = actionComponentData.details;
        }
        return actionComponentData.copy(str, jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentData() {
        return this.paymentData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JSONObject getDetails() {
        return this.details;
    }

    public final ActionComponentData copy(String paymentData, JSONObject details) {
        return new ActionComponentData(paymentData, details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionComponentData)) {
            return false;
        }
        ActionComponentData actionComponentData = (ActionComponentData) other;
        return s.f(this.paymentData, actionComponentData.paymentData) && s.f(this.details, actionComponentData.details);
    }

    public final JSONObject getDetails() {
        return this.details;
    }

    public final String getPaymentData() {
        return this.paymentData;
    }

    public int hashCode() {
        String str = this.paymentData;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JSONObject jSONObject = this.details;
        return iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public final void setDetails(JSONObject jSONObject) {
        this.details = jSONObject;
    }

    public final void setPaymentData(String str) {
        this.paymentData = str;
    }

    public String toString() {
        return "ActionComponentData(paymentData=" + this.paymentData + ", details=" + this.details + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.paymentData);
        re.a.f107852a.b(this.details, parcel, flags);
    }

    public /* synthetic */ ActionComponentData(String str, JSONObject jSONObject, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : jSONObject);
    }

    public ActionComponentData(String str, JSONObject jSONObject) {
        this.paymentData = str;
        this.details = jSONObject;
    }
}
