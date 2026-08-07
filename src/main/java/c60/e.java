package c60;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethodCreateParams;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lc60/e;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/p$e;", "paymentDetails", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "<init>", "(Lcom/stripe/android/model/p$e;Lcom/stripe/android/model/w0;)V", "a", "Lcom/stripe/android/model/p$e;", "()Lcom/stripe/android/model/p$e;", "b", "Lcom/stripe/android/model/w0;", "()Lcom/stripe/android/model/w0;", "Lc60/e$a;", "Lc60/e$b;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class e implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConsumerPaymentDetails.e paymentDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethodCreateParams paymentMethodCreateParams;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lc60/e$a;", "Lc60/e;", "Lcom/stripe/android/model/p$e;", "paymentDetails", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "originalParams", "<init>", "(Lcom/stripe/android/model/p$e;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/w0;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lcom/stripe/android/model/p$e;", "a", "()Lcom/stripe/android/model/p$e;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/w0;", "b", "()Lcom/stripe/android/model/w0;", "e", "getOriginalParams", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends e {
        public static final Parcelable.Creator<a> CREATOR = new C0380a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ConsumerPaymentDetails.e paymentDetails;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethodCreateParams paymentMethodCreateParams;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethodCreateParams originalParams;

        /* JADX INFO: renamed from: c60.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0380a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new a((ConsumerPaymentDetails.e) parcel.readParcelable(a.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(a.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ConsumerPaymentDetails.e paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams, PaymentMethodCreateParams originalParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            s.k(paymentDetails, "paymentDetails");
            s.k(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.k(originalParams, "originalParams");
            this.paymentDetails = paymentDetails;
            this.paymentMethodCreateParams = paymentMethodCreateParams;
            this.originalParams = originalParams;
        }

        @Override // c60.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public ConsumerPaymentDetails.e getPaymentDetails() {
            return this.paymentDetails;
        }

        @Override // c60.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public PaymentMethodCreateParams getPaymentMethodCreateParams() {
            return this.paymentMethodCreateParams;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.paymentDetails, flags);
            parcel.writeParcelable(this.paymentMethodCreateParams, flags);
            parcel.writeParcelable(this.originalParams, flags);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lc60/e$b;", "Lc60/e;", "Lcom/stripe/android/model/p$e;", "paymentDetails", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "<init>", "(Lcom/stripe/android/model/p$e;Lcom/stripe/android/model/w0;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "c", "Lcom/stripe/android/model/p$e;", "a", "()Lcom/stripe/android/model/p$e;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/model/w0;", "b", "()Lcom/stripe/android/model/w0;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends e {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ConsumerPaymentDetails.e paymentDetails;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final PaymentMethodCreateParams paymentMethodCreateParams;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new b((ConsumerPaymentDetails.e) parcel.readParcelable(b.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ConsumerPaymentDetails.e paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            s.k(paymentDetails, "paymentDetails");
            s.k(paymentMethodCreateParams, "paymentMethodCreateParams");
            this.paymentDetails = paymentDetails;
            this.paymentMethodCreateParams = paymentMethodCreateParams;
        }

        @Override // c60.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public ConsumerPaymentDetails.e getPaymentDetails() {
            return this.paymentDetails;
        }

        @Override // c60.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public PaymentMethodCreateParams getPaymentMethodCreateParams() {
            return this.paymentMethodCreateParams;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.paymentDetails, flags);
            parcel.writeParcelable(this.paymentMethodCreateParams, flags);
        }
    }

    public /* synthetic */ e(ConsumerPaymentDetails.e eVar, PaymentMethodCreateParams paymentMethodCreateParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, paymentMethodCreateParams);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public ConsumerPaymentDetails.e getPaymentDetails() {
        return this.paymentDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    private e(ConsumerPaymentDetails.e eVar, PaymentMethodCreateParams paymentMethodCreateParams) {
        this.paymentDetails = eVar;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
    }
}
