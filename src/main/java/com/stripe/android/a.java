package com.stripe.android;

import a70.Unvalidated;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.PaymentRelayActivity;
import com.stripe.android.view.m;
import com.stripe.android.view.n;
import java.io.Serializable;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/a;", "Lcom/stripe/android/view/m;", "Lcom/stripe/android/a$a;", "a", "b", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a extends m<AbstractC0787a> {

    /* JADX INFO: renamed from: com.stripe.android.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\b\u0005\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/a$a;", "Landroid/os/Parcelable;", "<init>", "()V", "La70/c;", "b", "()La70/c;", "", "a", "()I", "requestCode", "c", DateTokenConverter.CONVERTER_KEY, "e", "Lcom/stripe/android/a$a$b;", "Lcom/stripe/android/a$a$c;", "Lcom/stripe/android/a$a$d;", "Lcom/stripe/android/a$a$e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AbstractC0787a implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.stripe.android.a$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/a$a$a;", "", "<init>", "()V", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "", "stripeAccountId", "Lcom/stripe/android/a$a;", "a", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)Lcom/stripe/android/a$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AbstractC0787a a(StripeIntent stripeIntent, String stripeAccountId) {
                s.k(stripeIntent, "stripeIntent");
                if (stripeIntent instanceof PaymentIntent) {
                    return new PaymentIntentArgs((PaymentIntent) stripeIntent, stripeAccountId);
                }
                if (stripeIntent instanceof SetupIntent) {
                    return new SetupIntentArgs((SetupIntent) stripeIntent, stripeAccountId);
                }
                throw new NoWhenBranchMatchedException();
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.a$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006\""}, d2 = {"Lcom/stripe/android/a$a$b;", "Lcom/stripe/android/a$a;", "Lcom/stripe/android/core/exception/StripeException;", "exception", "", "requestCode", "<init>", "(Lcom/stripe/android/core/exception/StripeException;I)V", "La70/c;", "b", "()La70/c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/core/exception/StripeException;", "c", "()Lcom/stripe/android/core/exception/StripeException;", "I", "a", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ErrorArgs extends AbstractC0787a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final StripeException exception;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int requestCode;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f49591e = 8;
            public static final Parcelable.Creator<ErrorArgs> CREATOR = new C0790b();

            /* JADX INFO: renamed from: com.stripe.android.a$a$b$a, reason: collision with other inner class name and from kotlin metadata */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/a$a$b$a;", "", "Lcom/stripe/android/a$a$b;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/stripe/android/a$a$b;", "", "flags", "Ljn0/h0;", "b", "(Lcom/stripe/android/a$a$b;Landroid/os/Parcel;I)V", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public ErrorArgs a(Parcel parcel) {
                    s.k(parcel, "parcel");
                    Serializable serializable = parcel.readSerializable();
                    s.i(serializable, "null cannot be cast to non-null type com.stripe.android.core.exception.StripeException");
                    return new ErrorArgs((StripeException) serializable, parcel.readInt());
                }

                public void b(ErrorArgs errorArgs, Parcel parcel, int i11) {
                    s.k(errorArgs, "<this>");
                    s.k(parcel, "parcel");
                    parcel.writeSerializable(errorArgs.getException());
                    parcel.writeInt(errorArgs.getRequestCode());
                }

                private Companion() {
                }
            }

            /* JADX INFO: renamed from: com.stripe.android.a$a$b$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0790b implements Parcelable.Creator<ErrorArgs> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ErrorArgs createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return ErrorArgs.INSTANCE.a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ErrorArgs[] newArray(int i11) {
                    return new ErrorArgs[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorArgs(StripeException exception, int i11) {
                super(null);
                s.k(exception, "exception");
                this.exception = exception;
                this.requestCode = i11;
            }

            @Override // com.stripe.android.a.AbstractC0787a
            /* JADX INFO: renamed from: a, reason: from getter */
            public int getRequestCode() {
                return this.requestCode;
            }

            @Override // com.stripe.android.a.AbstractC0787a
            public Unvalidated b() {
                return new Unvalidated(null, 0, this.exception, false, null, null, null, 123, null);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final StripeException getException() {
                return this.exception;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorArgs)) {
                    return false;
                }
                ErrorArgs errorArgs = (ErrorArgs) other;
                return s.f(this.exception, errorArgs.exception) && this.requestCode == errorArgs.requestCode;
            }

            public int hashCode() {
                return (this.exception.hashCode() * 31) + Integer.hashCode(this.requestCode);
            }

            public String toString() {
                return "ErrorArgs(exception=" + this.exception + ", requestCode=" + this.requestCode + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                INSTANCE.b(this, parcel, flags);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.a$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\fR\u0014\u0010#\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000f¨\u0006$"}, d2 = {"Lcom/stripe/android/a$a$c;", "Lcom/stripe/android/a$a;", "Lcom/stripe/android/model/u0;", "paymentIntent", "", "stripeAccountId", "<init>", "(Lcom/stripe/android/model/u0;Ljava/lang/String;)V", "La70/c;", "b", "()La70/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/u0;", "getPaymentIntent$payments_core_release", "()Lcom/stripe/android/model/u0;", "c", "Ljava/lang/String;", "getStripeAccountId$payments_core_release", "a", "requestCode", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PaymentIntentArgs extends AbstractC0787a {
            public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new C0791a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final PaymentIntent paymentIntent;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: com.stripe.android.a$a$c$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0791a implements Parcelable.Creator<PaymentIntentArgs> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PaymentIntentArgs createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new PaymentIntentArgs(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final PaymentIntentArgs[] newArray(int i11) {
                    return new PaymentIntentArgs[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntentArgs(PaymentIntent paymentIntent, String str) {
                super(null);
                s.k(paymentIntent, "paymentIntent");
                this.paymentIntent = paymentIntent;
                this.stripeAccountId = str;
            }

            @Override // com.stripe.android.a.AbstractC0787a
            /* JADX INFO: renamed from: a */
            public int getRequestCode() {
                return 50000;
            }

            @Override // com.stripe.android.a.AbstractC0787a
            public Unvalidated b() {
                return new Unvalidated(this.paymentIntent.getClientSecret(), 0, null, false, null, null, this.stripeAccountId, 62, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PaymentIntentArgs)) {
                    return false;
                }
                PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) other;
                return s.f(this.paymentIntent, paymentIntentArgs.paymentIntent) && s.f(this.stripeAccountId, paymentIntentArgs.stripeAccountId);
            }

            public int hashCode() {
                int iHashCode = this.paymentIntent.hashCode() * 31;
                String str = this.stripeAccountId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "PaymentIntentArgs(paymentIntent=" + this.paymentIntent + ", stripeAccountId=" + this.stripeAccountId + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                this.paymentIntent.writeToParcel(parcel, flags);
                parcel.writeString(this.stripeAccountId);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.a$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\fR\u0014\u0010#\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000f¨\u0006$"}, d2 = {"Lcom/stripe/android/a$a$d;", "Lcom/stripe/android/a$a;", "Lcom/stripe/android/model/d1;", "setupIntent", "", "stripeAccountId", "<init>", "(Lcom/stripe/android/model/d1;Ljava/lang/String;)V", "La70/c;", "b", "()La70/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/d1;", "getSetupIntent$payments_core_release", "()Lcom/stripe/android/model/d1;", "c", "Ljava/lang/String;", "getStripeAccountId$payments_core_release", "a", "requestCode", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SetupIntentArgs extends AbstractC0787a {
            public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new C0792a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final SetupIntent setupIntent;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: com.stripe.android.a$a$d$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0792a implements Parcelable.Creator<SetupIntentArgs> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SetupIntentArgs createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new SetupIntentArgs(SetupIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SetupIntentArgs[] newArray(int i11) {
                    return new SetupIntentArgs[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntentArgs(SetupIntent setupIntent, String str) {
                super(null);
                s.k(setupIntent, "setupIntent");
                this.setupIntent = setupIntent;
                this.stripeAccountId = str;
            }

            @Override // com.stripe.android.a.AbstractC0787a
            /* JADX INFO: renamed from: a */
            public int getRequestCode() {
                return 50001;
            }

            @Override // com.stripe.android.a.AbstractC0787a
            public Unvalidated b() {
                return new Unvalidated(this.setupIntent.getClientSecret(), 0, null, false, null, null, this.stripeAccountId, 62, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetupIntentArgs)) {
                    return false;
                }
                SetupIntentArgs setupIntentArgs = (SetupIntentArgs) other;
                return s.f(this.setupIntent, setupIntentArgs.setupIntent) && s.f(this.stripeAccountId, setupIntentArgs.stripeAccountId);
            }

            public int hashCode() {
                int iHashCode = this.setupIntent.hashCode() * 31;
                String str = this.stripeAccountId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SetupIntentArgs(setupIntent=" + this.setupIntent + ", stripeAccountId=" + this.stripeAccountId + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                this.setupIntent.writeToParcel(parcel, flags);
                parcel.writeString(this.stripeAccountId);
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.a$a$e, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\fR\u0014\u0010#\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u000f¨\u0006$"}, d2 = {"Lcom/stripe/android/a$a$e;", "Lcom/stripe/android/a$a;", "Lcom/stripe/android/model/Source;", "source", "", "stripeAccountId", "<init>", "(Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "La70/c;", "b", "()La70/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Source;", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "c", "Ljava/lang/String;", "getStripeAccountId$payments_core_release", "a", "requestCode", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SourceArgs extends AbstractC0787a {
            public static final Parcelable.Creator<SourceArgs> CREATOR = new C0793a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Source source;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String stripeAccountId;

            /* JADX INFO: renamed from: com.stripe.android.a$a$e$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C0793a implements Parcelable.Creator<SourceArgs> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SourceArgs createFromParcel(Parcel parcel) {
                    s.k(parcel, "parcel");
                    return new SourceArgs(Source.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SourceArgs[] newArray(int i11) {
                    return new SourceArgs[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SourceArgs(Source source, String str) {
                super(null);
                s.k(source, "source");
                this.source = source;
                this.stripeAccountId = str;
            }

            @Override // com.stripe.android.a.AbstractC0787a
            /* JADX INFO: renamed from: a */
            public int getRequestCode() {
                return 50002;
            }

            @Override // com.stripe.android.a.AbstractC0787a
            public Unvalidated b() {
                return new Unvalidated(null, 0, null, false, null, this.source, this.stripeAccountId, 31, null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SourceArgs)) {
                    return false;
                }
                SourceArgs sourceArgs = (SourceArgs) other;
                return s.f(this.source, sourceArgs.source) && s.f(this.stripeAccountId, sourceArgs.stripeAccountId);
            }

            public int hashCode() {
                int iHashCode = this.source.hashCode() * 31;
                String str = this.stripeAccountId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SourceArgs(source=" + this.source + ", stripeAccountId=" + this.stripeAccountId + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                s.k(parcel, "out");
                this.source.writeToParcel(parcel, flags);
                parcel.writeString(this.stripeAccountId);
            }
        }

        public /* synthetic */ AbstractC0787a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public abstract int getRequestCode();

        public abstract Unvalidated b();

        private AbstractC0787a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/a$b;", "Lcom/stripe/android/a;", "Lcom/stripe/android/view/n;", "host", "<init>", "(Lcom/stripe/android/view/n;)V", "Lcom/stripe/android/a$a;", "args", "Ljn0/h0;", "b", "(Lcom/stripe/android/a$a;)V", "a", "Lcom/stripe/android/view/n;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n host;

        public b(n host) {
            s.k(host, "host");
            this.host = host;
        }

        @Override // com.stripe.android.view.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0787a args) {
            s.k(args, "args");
            this.host.b(PaymentRelayActivity.class, args.b().i(), args.getRequestCode());
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/a$c;", "Lcom/stripe/android/a;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/a$a;", "launcher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "args", "Ljn0/h0;", "b", "(Lcom/stripe/android/a$a;)V", "a", "Landroidx/activity/result/ActivityResultLauncher;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ActivityResultLauncher<AbstractC0787a> launcher;

        public c(ActivityResultLauncher<AbstractC0787a> launcher) {
            s.k(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0787a args) {
            s.k(args, "args");
            this.launcher.b(args);
        }
    }
}
