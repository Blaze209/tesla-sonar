package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001(B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010\r¨\u0006)"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/OrderPaymentMethod;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", "type", "Lcom/adyen/checkout/components/core/Amount;", OrderPaymentMethod.AMOUNT, OrderPaymentMethod.LAST_FOUR, OrderPaymentMethod.TRANSACTION_LIMIT, "<init>", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/adyen/checkout/components/core/Amount;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;Lcom/adyen/checkout/components/core/Amount;)Lcom/adyen/checkout/components/core/internal/data/model/OrderPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "getLastFour", "getTransactionLimit", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OrderPaymentMethod extends b {
    private static final String AMOUNT = "amount";
    private static final String LAST_FOUR = "lastFour";
    private static final String TRANSACTION_LIMIT = "transactionLimit";
    private static final String TYPE = "type";
    private final Amount amount;
    private final String lastFour;
    private final Amount transactionLimit;
    private final String type;
    public static final Parcelable.Creator<OrderPaymentMethod> CREATOR = new c();
    public static final b.a<OrderPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/internal/data/model/OrderPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/internal/data/model/OrderPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/internal/data/model/OrderPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/internal/data/model/OrderPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<OrderPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public OrderPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String string = jsonObject.getString("type");
                String string2 = jsonObject.getString(OrderPaymentMethod.LAST_FOUR);
                JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(OrderPaymentMethod.AMOUNT);
                b.a<Amount> aVar = Amount.SERIALIZER;
                Amount amount = (Amount) com.adyen.checkout.core.internal.data.model.c.a(jSONObjectOptJSONObject, aVar);
                Amount amount2 = (Amount) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(OrderPaymentMethod.TRANSACTION_LIMIT), aVar);
                s.h(string);
                s.h(string2);
                return new OrderPaymentMethod(string, amount, string2, amount2);
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderPaymentMethod.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(OrderPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(OrderPaymentMethod.LAST_FOUR, modelObject.getLastFour());
                Amount amount = modelObject.getAmount();
                b.a<Amount> aVar = Amount.SERIALIZER;
                jSONObject.putOpt(OrderPaymentMethod.AMOUNT, com.adyen.checkout.core.internal.data.model.c.c(amount, aVar));
                jSONObject.putOpt(OrderPaymentMethod.TRANSACTION_LIMIT, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getTransactionLimit(), aVar));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(OrderPaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<OrderPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new OrderPaymentMethod(parcel.readString(), parcel.readInt() == 0 ? null : Amount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Amount.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderPaymentMethod[] newArray(int i11) {
            return new OrderPaymentMethod[i11];
        }
    }

    public OrderPaymentMethod(String type, Amount amount, String lastFour, Amount amount2) {
        s.k(type, "type");
        s.k(lastFour, "lastFour");
        this.type = type;
        this.amount = amount;
        this.lastFour = lastFour;
        this.transactionLimit = amount2;
    }

    public static /* synthetic */ OrderPaymentMethod copy$default(OrderPaymentMethod orderPaymentMethod, String str, Amount amount, String str2, Amount amount2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orderPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            amount = orderPaymentMethod.amount;
        }
        if ((i11 & 4) != 0) {
            str2 = orderPaymentMethod.lastFour;
        }
        if ((i11 & 8) != 0) {
            amount2 = orderPaymentMethod.transactionLimit;
        }
        return orderPaymentMethod.copy(str, amount, str2, amount2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    public final OrderPaymentMethod copy(String type, Amount amount, String lastFour, Amount transactionLimit) {
        s.k(type, "type");
        s.k(lastFour, "lastFour");
        return new OrderPaymentMethod(type, amount, lastFour, transactionLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderPaymentMethod)) {
            return false;
        }
        OrderPaymentMethod orderPaymentMethod = (OrderPaymentMethod) other;
        return s.f(this.type, orderPaymentMethod.type) && s.f(this.amount, orderPaymentMethod.amount) && s.f(this.lastFour, orderPaymentMethod.lastFour) && s.f(this.transactionLimit, orderPaymentMethod.transactionLimit);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final Amount getTransactionLimit() {
        return this.transactionLimit;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Amount amount = this.amount;
        int iHashCode2 = (((iHashCode + (amount == null ? 0 : amount.hashCode())) * 31) + this.lastFour.hashCode()) * 31;
        Amount amount2 = this.transactionLimit;
        return iHashCode2 + (amount2 != null ? amount2.hashCode() : 0);
    }

    public String toString() {
        return "OrderPaymentMethod(type=" + this.type + ", amount=" + this.amount + ", lastFour=" + this.lastFour + ", transactionLimit=" + this.transactionLimit + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        Amount amount = this.amount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.lastFour);
        Amount amount2 = this.transactionLimit;
        if (amount2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount2.writeToParcel(parcel, flags);
        }
    }
}
