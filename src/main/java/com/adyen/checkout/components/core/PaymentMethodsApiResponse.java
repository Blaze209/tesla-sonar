package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\n\"\u0004\b!\u0010\"R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\n\"\u0004\b$\u0010\"¨\u0006'"}, d2 = {"Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", PaymentMethodsApiResponse.STORED_PAYMENT_METHODS, "Lcom/adyen/checkout/components/core/PaymentMethod;", PaymentMethodsApiResponse.PAYMENT_METHODS, "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getStoredPaymentMethods", "setStoredPaymentMethods", "(Ljava/util/List;)V", "getPaymentMethods", "setPaymentMethods", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentMethodsApiResponse extends b {
    private static final String PAYMENT_METHODS = "paymentMethods";
    private static final String STORED_PAYMENT_METHODS = "storedPaymentMethods";
    private List<PaymentMethod> paymentMethods;
    private List<StoredPaymentMethod> storedPaymentMethods;
    public static final Parcelable.Creator<PaymentMethodsApiResponse> CREATOR = new c();
    public static final b.a<PaymentMethodsApiResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/PaymentMethodsApiResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/PaymentMethodsApiResponse;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<PaymentMethodsApiResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PaymentMethodsApiResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new PaymentMethodsApiResponse(com.adyen.checkout.core.internal.data.model.c.b(jsonObject.optJSONArray(PaymentMethodsApiResponse.STORED_PAYMENT_METHODS), StoredPaymentMethod.SERIALIZER), com.adyen.checkout.core.internal.data.model.c.b(jsonObject.optJSONArray(PaymentMethodsApiResponse.PAYMENT_METHODS), PaymentMethod.SERIALIZER));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(PaymentMethodsApiResponse modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(PaymentMethodsApiResponse.STORED_PAYMENT_METHODS, com.adyen.checkout.core.internal.data.model.c.d(modelObject.getStoredPaymentMethods(), StoredPaymentMethod.SERIALIZER));
                jSONObject.putOpt(PaymentMethodsApiResponse.PAYMENT_METHODS, com.adyen.checkout.core.internal.data.model.c.d(modelObject.getPaymentMethods(), PaymentMethod.SERIALIZER));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(PaymentMethodsApiResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<PaymentMethodsApiResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodsApiResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.k(parcel, "parcel");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(StoredPaymentMethod.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                }
            }
            return new PaymentMethodsApiResponse(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodsApiResponse[] newArray(int i11) {
            return new PaymentMethodsApiResponse[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsApiResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodsApiResponse copy$default(PaymentMethodsApiResponse paymentMethodsApiResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = paymentMethodsApiResponse.storedPaymentMethods;
        }
        if ((i11 & 2) != 0) {
            list2 = paymentMethodsApiResponse.paymentMethods;
        }
        return paymentMethodsApiResponse.copy(list, list2);
    }

    public final List<StoredPaymentMethod> component1() {
        return this.storedPaymentMethods;
    }

    public final List<PaymentMethod> component2() {
        return this.paymentMethods;
    }

    public final PaymentMethodsApiResponse copy(List<StoredPaymentMethod> storedPaymentMethods, List<PaymentMethod> paymentMethods) {
        return new PaymentMethodsApiResponse(storedPaymentMethods, paymentMethods);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodsApiResponse)) {
            return false;
        }
        PaymentMethodsApiResponse paymentMethodsApiResponse = (PaymentMethodsApiResponse) other;
        return s.f(this.storedPaymentMethods, paymentMethodsApiResponse.storedPaymentMethods) && s.f(this.paymentMethods, paymentMethodsApiResponse.paymentMethods);
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final List<StoredPaymentMethod> getStoredPaymentMethods() {
        return this.storedPaymentMethods;
    }

    public int hashCode() {
        List<StoredPaymentMethod> list = this.storedPaymentMethods;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PaymentMethod> list2 = this.paymentMethods;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setPaymentMethods(List<PaymentMethod> list) {
        this.paymentMethods = list;
    }

    public final void setStoredPaymentMethods(List<StoredPaymentMethod> list) {
        this.storedPaymentMethods = list;
    }

    public String toString() {
        return "PaymentMethodsApiResponse(storedPaymentMethods=" + this.storedPaymentMethods + ", paymentMethods=" + this.paymentMethods + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        List<StoredPaymentMethod> list = this.storedPaymentMethods;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<StoredPaymentMethod> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        List<PaymentMethod> list2 = this.paymentMethods;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<PaymentMethod> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ PaymentMethodsApiResponse(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2);
    }

    public PaymentMethodsApiResponse(List<StoredPaymentMethod> list, List<PaymentMethod> list2) {
        this.storedPaymentMethods = list;
        this.paymentMethods = list2;
    }
}
