package g80;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.y;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import u60.PaymentMethodMetadata;

/* JADX INFO: renamed from: g80.l, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0011\u00108\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010<\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lg80/l;", "", "Lcom/stripe/android/paymentsheet/y$h;", "config", "Lg80/a;", "customer", "Lg80/g;", "linkState", "Lw70/j;", "paymentSelection", "Lg80/j;", "validationError", "Lu60/e;", "paymentMethodMetadata", "<init>", "(Lcom/stripe/android/paymentsheet/y$h;Lg80/a;Lg80/g;Lw70/j;Lg80/j;Lu60/e;)V", "a", "(Lcom/stripe/android/paymentsheet/y$h;Lg80/a;Lg80/g;Lw70/j;Lg80/j;Lu60/e;)Lg80/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/paymentsheet/y$h;", "c", "()Lcom/stripe/android/paymentsheet/y$h;", "b", "Lg80/a;", DateTokenConverter.CONVERTER_KEY, "()Lg80/a;", "Lg80/g;", "e", "()Lg80/g;", "Lw70/j;", "g", "()Lw70/j;", "Lg80/j;", "j", "()Lg80/j;", "f", "Lu60/e;", "()Lu60/e;", "h", "()Z", "showSavedPaymentMethods", "Lcom/stripe/android/model/StripeIntent;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Full implements Parcelable {
    public static final Parcelable.Creator<Full> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.Configuration config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CustomerState customer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LinkState linkState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final w70.j paymentSelection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final j validationError;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentMethodMetadata paymentMethodMetadata;

    /* JADX INFO: renamed from: g80.l$a */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Full> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Full createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new Full(y.Configuration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CustomerState.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LinkState.CREATOR.createFromParcel(parcel) : null, (w70.j) parcel.readParcelable(Full.class.getClassLoader()), (j) parcel.readSerializable(), PaymentMethodMetadata.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Full[] newArray(int i11) {
            return new Full[i11];
        }
    }

    public Full(y.Configuration config, CustomerState customerState, LinkState linkState, w70.j jVar, j jVar2, PaymentMethodMetadata paymentMethodMetadata) {
        s.k(config, "config");
        s.k(paymentMethodMetadata, "paymentMethodMetadata");
        this.config = config;
        this.customer = customerState;
        this.linkState = linkState;
        this.paymentSelection = jVar;
        this.validationError = jVar2;
        this.paymentMethodMetadata = paymentMethodMetadata;
    }

    public static /* synthetic */ Full b(Full full, y.Configuration configuration, CustomerState customerState, LinkState linkState, w70.j jVar, j jVar2, PaymentMethodMetadata eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            configuration = full.config;
        }
        if ((i11 & 2) != 0) {
            customerState = full.customer;
        }
        if ((i11 & 4) != 0) {
            linkState = full.linkState;
        }
        if ((i11 & 8) != 0) {
            jVar = full.paymentSelection;
        }
        if ((i11 & 16) != 0) {
            jVar2 = full.validationError;
        }
        if ((i11 & 32) != 0) {
            eVar = full.paymentMethodMetadata;
        }
        j jVar3 = jVar2;
        PaymentMethodMetadata eVar2 = eVar;
        return full.a(configuration, customerState, linkState, jVar, jVar3, eVar2);
    }

    public final Full a(y.Configuration config, CustomerState customer, LinkState linkState, w70.j paymentSelection, j validationError, PaymentMethodMetadata paymentMethodMetadata) {
        s.k(config, "config");
        s.k(paymentMethodMetadata, "paymentMethodMetadata");
        return new Full(config, customer, linkState, paymentSelection, validationError, paymentMethodMetadata);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final y.Configuration getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CustomerState getCustomer() {
        return this.customer;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LinkState getLinkState() {
        return this.linkState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Full)) {
            return false;
        }
        Full full = (Full) other;
        return s.f(this.config, full.config) && s.f(this.customer, full.customer) && s.f(this.linkState, full.linkState) && s.f(this.paymentSelection, full.paymentSelection) && s.f(this.validationError, full.validationError) && s.f(this.paymentMethodMetadata, full.paymentMethodMetadata);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final PaymentMethodMetadata getPaymentMethodMetadata() {
        return this.paymentMethodMetadata;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final w70.j getPaymentSelection() {
        return this.paymentSelection;
    }

    public final boolean h() {
        CustomerState customerState = this.customer;
        return !(customerState == null || customerState.d().isEmpty()) || this.paymentMethodMetadata.getIsGooglePayReady();
    }

    public int hashCode() {
        int iHashCode = this.config.hashCode() * 31;
        CustomerState customerState = this.customer;
        int iHashCode2 = (iHashCode + (customerState == null ? 0 : customerState.hashCode())) * 31;
        LinkState linkState = this.linkState;
        int iHashCode3 = (iHashCode2 + (linkState == null ? 0 : linkState.hashCode())) * 31;
        w70.j jVar = this.paymentSelection;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j jVar2 = this.validationError;
        return ((iHashCode4 + (jVar2 != null ? jVar2.hashCode() : 0)) * 31) + this.paymentMethodMetadata.hashCode();
    }

    public final StripeIntent i() {
        return this.paymentMethodMetadata.getStripeIntent();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final j getValidationError() {
        return this.validationError;
    }

    public String toString() {
        return "Full(config=" + this.config + ", customer=" + this.customer + ", linkState=" + this.linkState + ", paymentSelection=" + this.paymentSelection + ", validationError=" + this.validationError + ", paymentMethodMetadata=" + this.paymentMethodMetadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        this.config.writeToParcel(parcel, flags);
        CustomerState customerState = this.customer;
        if (customerState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customerState.writeToParcel(parcel, flags);
        }
        LinkState linkState = this.linkState;
        if (linkState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkState.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.paymentSelection, flags);
        parcel.writeSerializable(this.validationError);
        this.paymentMethodMetadata.writeToParcel(parcel, flags);
    }
}
