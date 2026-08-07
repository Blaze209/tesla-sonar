package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/a;", "Landroid/os/Parcelable;", "a", "b", "c", "Lcom/stripe/android/payments/bankaccount/navigation/a$a;", "Lcom/stripe/android/payments/bankaccount/navigation/a$b;", "Lcom/stripe/android/payments/bankaccount/navigation/a$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a extends Parcelable {

    /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/a$a;", "Lcom/stripe/android/payments/bankaccount/navigation/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class C0932a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0932a f51996a = new C0932a();
        public static final Parcelable.Creator<C0932a> CREATOR = new C0933a();

        /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0933a implements Parcelable.Creator<C0932a> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0932a createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                parcel.readInt();
                return C0932a.f51996a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0932a[] newArray(int i11) {
                return new C0932a[i11];
            }
        }

        private C0932a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C0932a);
        }

        public int hashCode() {
            return 1430639253;
        }

        public String toString() {
            return "Cancelled";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001b\u0010\u000b¨\u0006#"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/a$b;", "Lcom/stripe/android/payments/bankaccount/navigation/a;", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "", "paymentMethodId", "last4", "bankName", "<init>", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/stripe/android/model/StripeIntent;", "b", "()Lcom/stripe/android/model/StripeIntent;", "Ljava/lang/String;", "z0", "c", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Completed implements a {
        public static final Parcelable.Creator<Completed> CREATOR = new C0934a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StripeIntent intent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String paymentMethodId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String last4;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String bankName;

        /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0934a implements Parcelable.Creator<Completed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Completed createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Completed((StripeIntent) parcel.readParcelable(Completed.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Completed[] newArray(int i11) {
                return new Completed[i11];
            }
        }

        public Completed(StripeIntent intent, String paymentMethodId, String str, String str2) {
            s.k(intent, "intent");
            s.k(paymentMethodId, "paymentMethodId");
            this.intent = intent;
            this.paymentMethodId = paymentMethodId;
            this.last4 = str;
            this.bankName = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBankName() {
            return this.bankName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final StripeIntent getIntent() {
            return this.intent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLast4() {
            return this.last4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) other;
            return s.f(this.intent, completed.intent) && s.f(this.paymentMethodId, completed.paymentMethodId) && s.f(this.last4, completed.last4) && s.f(this.bankName, completed.bankName);
        }

        public int hashCode() {
            int iHashCode = ((this.intent.hashCode() * 31) + this.paymentMethodId.hashCode()) * 31;
            String str = this.last4;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bankName;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Completed(intent=" + this.intent + ", paymentMethodId=" + this.paymentMethodId + ", last4=" + this.last4 + ", bankName=" + this.bankName + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeParcelable(this.intent, flags);
            parcel.writeString(this.paymentMethodId);
            parcel.writeString(this.last4);
            parcel.writeString(this.bankName);
        }

        /* JADX INFO: renamed from: z0, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/a$c;", "Lcom/stripe/android/payments/bankaccount/navigation/a;", "", AnalyticsAttribute.Error, "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed implements a {
        public static final Parcelable.Creator<Failed> CREATOR = new C0935a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* JADX INFO: renamed from: com.stripe.android.payments.bankaccount.navigation.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C0935a implements Parcelable.Creator<Failed> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Failed createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Failed((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Failed[] newArray(int i11) {
                return new Failed[i11];
            }
        }

        public Failed(Throwable error) {
            s.k(error, "error");
            this.error = error;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && s.f(this.error, ((Failed) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failed(error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "out");
            parcel.writeSerializable(this.error);
        }
    }
}
