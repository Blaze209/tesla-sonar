package f30;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: f30.s, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jf\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b&\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lf30/s;", "Landroid/os/Parcelable;", "", "isShippingInfoRequired", "isShippingMethodRequired", "", "cartTotal", "shippingTotal", "Lcom/stripe/android/model/f1;", "shippingInformation", "Lcom/stripe/android/model/g1;", "shippingMethod", "Lcom/stripe/android/model/v0;", "paymentMethod", "useGooglePay", "<init>", "(ZZJJLcom/stripe/android/model/f1;Lcom/stripe/android/model/g1;Lcom/stripe/android/model/v0;Z)V", "a", "(ZZJJLcom/stripe/android/model/f1;Lcom/stripe/android/model/g1;Lcom/stripe/android/model/v0;Z)Lf30/s;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "b", "c", "J", "getCartTotal", "()J", DateTokenConverter.CONVERTER_KEY, "getShippingTotal", "e", "Lcom/stripe/android/model/f1;", "()Lcom/stripe/android/model/f1;", "f", "Lcom/stripe/android/model/g1;", "getShippingMethod", "()Lcom/stripe/android/model/g1;", "g", "Lcom/stripe/android/model/v0;", "getPaymentMethod", "()Lcom/stripe/android/model/v0;", "h", "getUseGooglePay", "()Z", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentSessionData implements Parcelable {
    public static final Parcelable.Creator<PaymentSessionData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShippingInfoRequired;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShippingMethodRequired;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long cartTotal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long shippingTotal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShippingInformation shippingInformation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShippingMethod shippingMethod;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethod paymentMethod;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useGooglePay;

    /* JADX INFO: renamed from: f30.s$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentSessionData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentSessionData createFromParcel(Parcel parcel) {
            ShippingMethod shippingMethod;
            boolean z11;
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            boolean z12 = false;
            boolean z13 = true;
            if (parcel.readInt() != 0) {
                z12 = true;
            }
            if (parcel.readInt() == 0) {
                z13 = z12;
            }
            long j11 = parcel.readLong();
            long j12 = parcel.readLong();
            ShippingInformation shippingInformationCreateFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            ShippingMethod shippingMethodCreateFromParcel = parcel.readInt() == 0 ? null : ShippingMethod.CREATOR.createFromParcel(parcel);
            PaymentMethod paymentMethodCreateFromParcel = parcel.readInt() != 0 ? PaymentMethod.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                z11 = true;
                shippingMethod = shippingMethodCreateFromParcel;
            } else {
                shippingMethod = shippingMethodCreateFromParcel;
                z11 = false;
            }
            return new PaymentSessionData(z12, z13, j11, j12, shippingInformationCreateFromParcel, shippingMethod, paymentMethodCreateFromParcel, z11);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentSessionData[] newArray(int i11) {
            return new PaymentSessionData[i11];
        }
    }

    public PaymentSessionData(boolean z11, boolean z12, long j11, long j12, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z13) {
        this.isShippingInfoRequired = z11;
        this.isShippingMethodRequired = z12;
        this.cartTotal = j11;
        this.shippingTotal = j12;
        this.shippingInformation = shippingInformation;
        this.shippingMethod = shippingMethod;
        this.paymentMethod = paymentMethod;
        this.useGooglePay = z13;
    }

    public static /* synthetic */ PaymentSessionData b(PaymentSessionData paymentSessionData, boolean z11, boolean z12, long j11, long j12, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = paymentSessionData.isShippingInfoRequired;
        }
        if ((i11 & 2) != 0) {
            z12 = paymentSessionData.isShippingMethodRequired;
        }
        if ((i11 & 4) != 0) {
            j11 = paymentSessionData.cartTotal;
        }
        if ((i11 & 8) != 0) {
            j12 = paymentSessionData.shippingTotal;
        }
        if ((i11 & 16) != 0) {
            shippingInformation = paymentSessionData.shippingInformation;
        }
        if ((i11 & 32) != 0) {
            shippingMethod = paymentSessionData.shippingMethod;
        }
        if ((i11 & 64) != 0) {
            paymentMethod = paymentSessionData.paymentMethod;
        }
        if ((i11 & 128) != 0) {
            z13 = paymentSessionData.useGooglePay;
        }
        long j13 = j12;
        long j14 = j11;
        return paymentSessionData.a(z11, z12, j14, j13, shippingInformation, shippingMethod, paymentMethod, z13);
    }

    public final PaymentSessionData a(boolean isShippingInfoRequired, boolean isShippingMethodRequired, long cartTotal, long shippingTotal, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean useGooglePay) {
        return new PaymentSessionData(isShippingInfoRequired, isShippingMethodRequired, cartTotal, shippingTotal, shippingInformation, shippingMethod, paymentMethod, useGooglePay);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSessionData)) {
            return false;
        }
        PaymentSessionData paymentSessionData = (PaymentSessionData) other;
        return this.isShippingInfoRequired == paymentSessionData.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionData.isShippingMethodRequired && this.cartTotal == paymentSessionData.cartTotal && this.shippingTotal == paymentSessionData.shippingTotal && p013kotlin.jvm.internal.s.f(this.shippingInformation, paymentSessionData.shippingInformation) && p013kotlin.jvm.internal.s.f(this.shippingMethod, paymentSessionData.shippingMethod) && p013kotlin.jvm.internal.s.f(this.paymentMethod, paymentSessionData.paymentMethod) && this.useGooglePay == paymentSessionData.useGooglePay;
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.isShippingInfoRequired) * 31) + Boolean.hashCode(this.isShippingMethodRequired)) * 31) + Long.hashCode(this.cartTotal)) * 31) + Long.hashCode(this.shippingTotal)) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        int iHashCode2 = (iHashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31;
        ShippingMethod shippingMethod = this.shippingMethod;
        int iHashCode3 = (iHashCode2 + (shippingMethod == null ? 0 : shippingMethod.hashCode())) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        return ((iHashCode3 + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 31) + Boolean.hashCode(this.useGooglePay);
    }

    public String toString() {
        return "PaymentSessionData(isShippingInfoRequired=" + this.isShippingInfoRequired + ", isShippingMethodRequired=" + this.isShippingMethodRequired + ", cartTotal=" + this.cartTotal + ", shippingTotal=" + this.shippingTotal + ", shippingInformation=" + this.shippingInformation + ", shippingMethod=" + this.shippingMethod + ", paymentMethod=" + this.paymentMethod + ", useGooglePay=" + this.useGooglePay + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeInt(this.isShippingInfoRequired ? 1 : 0);
        parcel.writeInt(this.isShippingMethodRequired ? 1 : 0);
        parcel.writeLong(this.cartTotal);
        parcel.writeLong(this.shippingTotal);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingInformation.writeToParcel(parcel, flags);
        }
        ShippingMethod shippingMethod = this.shippingMethod;
        if (shippingMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingMethod.writeToParcel(parcel, flags);
        }
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethod.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.useGooglePay ? 1 : 0);
    }
}
