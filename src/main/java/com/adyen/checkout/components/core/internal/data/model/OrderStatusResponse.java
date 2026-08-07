package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006&"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusResponse;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", "Lcom/adyen/checkout/components/core/internal/data/model/OrderPaymentMethod;", OrderStatusResponse.PAYMENT_METHODS, "Lcom/adyen/checkout/components/core/Amount;", OrderStatusResponse.REMAINING_AMOUNT, "<init>", "(Ljava/util/List;Lcom/adyen/checkout/components/core/Amount;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/adyen/checkout/components/core/Amount;", "copy", "(Ljava/util/List;Lcom/adyen/checkout/components/core/Amount;)Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPaymentMethods", "Lcom/adyen/checkout/components/core/Amount;", "getRemainingAmount", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OrderStatusResponse extends b {
    private static final String PAYMENT_METHODS = "paymentMethods";
    private static final String REMAINING_AMOUNT = "remainingAmount";
    private final List<OrderPaymentMethod> paymentMethods;
    private final Amount remainingAmount;
    public static final Parcelable.Creator<OrderStatusResponse> CREATOR = new c();
    public static final b.a<OrderStatusResponse> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/internal/data/model/OrderStatusResponse$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusResponse;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusResponse;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/internal/data/model/OrderStatusResponse;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<OrderStatusResponse> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public OrderStatusResponse b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                List listB = com.adyen.checkout.core.internal.data.model.c.b(jsonObject.optJSONArray(OrderStatusResponse.PAYMENT_METHODS), OrderPaymentMethod.SERIALIZER);
                if (listB == null) {
                    listB = v.m();
                }
                return new OrderStatusResponse(listB, (Amount) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(OrderStatusResponse.REMAINING_AMOUNT), Amount.SERIALIZER));
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderStatusResponse.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(OrderStatusResponse modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(OrderStatusResponse.PAYMENT_METHODS, com.adyen.checkout.core.internal.data.model.c.d(modelObject.getPaymentMethods(), OrderPaymentMethod.SERIALIZER));
                jSONObject.putOpt(OrderStatusResponse.REMAINING_AMOUNT, modelObject.getRemainingAmount());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderStatusResponse.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<OrderStatusResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderStatusResponse createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(OrderPaymentMethod.CREATOR.createFromParcel(parcel));
            }
            return new OrderStatusResponse(arrayList, parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderStatusResponse[] newArray(int i11) {
            return new OrderStatusResponse[i11];
        }
    }

    public OrderStatusResponse(List<OrderPaymentMethod> paymentMethods, Amount amount) {
        s.k(paymentMethods, "paymentMethods");
        this.paymentMethods = paymentMethods;
        this.remainingAmount = amount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderStatusResponse copy$default(OrderStatusResponse orderStatusResponse, List list, Amount amount, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = orderStatusResponse.paymentMethods;
        }
        if ((i11 & 2) != 0) {
            amount = orderStatusResponse.remainingAmount;
        }
        return orderStatusResponse.copy(list, amount);
    }

    public final List<OrderPaymentMethod> component1() {
        return this.paymentMethods;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Amount getRemainingAmount() {
        return this.remainingAmount;
    }

    public final OrderStatusResponse copy(List<OrderPaymentMethod> paymentMethods, Amount remainingAmount) {
        s.k(paymentMethods, "paymentMethods");
        return new OrderStatusResponse(paymentMethods, remainingAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderStatusResponse)) {
            return false;
        }
        OrderStatusResponse orderStatusResponse = (OrderStatusResponse) other;
        return s.f(this.paymentMethods, orderStatusResponse.paymentMethods) && s.f(this.remainingAmount, orderStatusResponse.remainingAmount);
    }

    public final List<OrderPaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final Amount getRemainingAmount() {
        return this.remainingAmount;
    }

    public int hashCode() {
        int iHashCode = this.paymentMethods.hashCode() * 31;
        Amount amount = this.remainingAmount;
        return iHashCode + (amount == null ? 0 : amount.hashCode());
    }

    public String toString() {
        return "OrderStatusResponse(paymentMethods=" + this.paymentMethods + ", remainingAmount=" + this.remainingAmount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        List<OrderPaymentMethod> list = this.paymentMethods;
        parcel.writeInt(list.size());
        Iterator<OrderPaymentMethod> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
        Amount amount = this.remainingAmount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
    }
}
