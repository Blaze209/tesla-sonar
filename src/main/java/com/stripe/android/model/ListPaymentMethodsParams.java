package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.stripe.android.model.p0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001 B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010!¨\u0006+"}, d2 = {"Lcom/stripe/android/model/p0;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "customerId", "Lcom/stripe/android/model/v0$p;", Action.PAYMENT_METHOD_TYPE, "", "limit", "endingBefore", "startingAfter", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/v0$p;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "Lcom/stripe/android/model/v0$p;", "getPaymentMethodType$payments_core_release", "()Lcom/stripe/android/model/v0$p;", "c", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "e", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ListPaymentMethodsParams implements o1, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethod.p paymentMethodType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer limit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endingBefore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startingAfter;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f51425f = new a(null);
    public static final Parcelable.Creator<ListPaymentMethodsParams> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.p0$a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/p0$a;", "", "<init>", "()V", "", "PARAM_CUSTOMER", "Ljava/lang/String;", "PARAM_ENDING_BEFORE", "PARAM_LIMIT", "PARAM_STARTING_AFTER", "PARAM_TYPE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.model.p0$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ListPaymentMethodsParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ListPaymentMethodsParams createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new ListPaymentMethodsParams(parcel.readString(), PaymentMethod.p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ListPaymentMethodsParams[] newArray(int i11) {
            return new ListPaymentMethodsParams[i11];
        }
    }

    public ListPaymentMethodsParams(String customerId, PaymentMethod.p paymentMethodType, Integer num, String str, String str2) {
        p013kotlin.jvm.internal.s.k(customerId, "customerId");
        p013kotlin.jvm.internal.s.k(paymentMethodType, "paymentMethodType");
        this.customerId = customerId;
        this.paymentMethodType = paymentMethodType;
        this.limit = num;
        this.endingBefore = str;
        this.startingAfter = str2;
    }

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        List<Pair> listP = p013kotlin.collections.v.p(jn0.x.a("customer", this.customerId), jn0.x.a("type", this.paymentMethodType.code), jn0.x.a("limit", this.limit), jn0.x.a("ending_before", this.endingBefore), jn0.x.a("starting_after", this.startingAfter));
        Map<String, Object> mapI = p013kotlin.collections.v0.i();
        for (Pair pair : listP) {
            String str = (String) pair.a();
            Object objB = pair.b();
            Map mapF = objB != null ? p013kotlin.collections.v0.f(jn0.x.a(str, objB)) : null;
            if (mapF == null) {
                mapF = p013kotlin.collections.v0.i();
            }
            mapI = p013kotlin.collections.v0.r(mapI, mapF);
        }
        return mapI;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListPaymentMethodsParams)) {
            return false;
        }
        ListPaymentMethodsParams listPaymentMethodsParams = (ListPaymentMethodsParams) other;
        return p013kotlin.jvm.internal.s.f(this.customerId, listPaymentMethodsParams.customerId) && this.paymentMethodType == listPaymentMethodsParams.paymentMethodType && p013kotlin.jvm.internal.s.f(this.limit, listPaymentMethodsParams.limit) && p013kotlin.jvm.internal.s.f(this.endingBefore, listPaymentMethodsParams.endingBefore) && p013kotlin.jvm.internal.s.f(this.startingAfter, listPaymentMethodsParams.startingAfter);
    }

    public int hashCode() {
        int iHashCode = ((this.customerId.hashCode() * 31) + this.paymentMethodType.hashCode()) * 31;
        Integer num = this.limit;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.endingBefore;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startingAfter;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ListPaymentMethodsParams(customerId=" + this.customerId + ", paymentMethodType=" + this.paymentMethodType + ", limit=" + this.limit + ", endingBefore=" + this.endingBefore + ", startingAfter=" + this.startingAfter + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int iIntValue;
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.customerId);
        this.paymentMethodType.writeToParcel(parcel, flags);
        Integer num = this.limit;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.endingBefore);
        parcel.writeString(this.startingAfter);
    }

    public /* synthetic */ ListPaymentMethodsParams(String str, PaymentMethod.p pVar, Integer num, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, pVar, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
    }
}
