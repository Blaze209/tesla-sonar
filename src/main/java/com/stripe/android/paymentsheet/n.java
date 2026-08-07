package com.stripe.android.paymentsheet;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0004\u0010\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/n;", "TLauncherArgs", "", "a", "b", "c", "Lcom/stripe/android/paymentsheet/n$a;", "Lcom/stripe/android/paymentsheet/n$b;", "Lcom/stripe/android/paymentsheet/n$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface n<TLauncherArgs> {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000*\u0004\b\u0005\u0010\u00012\b\u0012\u0004\u0012\u00028\u00050\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/n$a;", "TLauncherArgs", "Lcom/stripe/android/paymentsheet/n;", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/paymentsheet/p;", "confirmationOption", "Ln70/f;", "deferredIntentConfirmationType", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/p;Ln70/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/StripeIntent;", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "b", "Lcom/stripe/android/paymentsheet/p;", "getConfirmationOption", "()Lcom/stripe/android/paymentsheet/p;", "c", "Ln70/f;", "()Ln70/f;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Complete<TLauncherArgs> implements n<TLauncherArgs> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StripeIntent intent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p confirmationOption;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final n70.f deferredIntentConfirmationType;

        public Complete(StripeIntent intent, p confirmationOption, n70.f fVar) {
            p013kotlin.jvm.internal.s.k(intent, "intent");
            p013kotlin.jvm.internal.s.k(confirmationOption, "confirmationOption");
            this.intent = intent;
            this.confirmationOption = confirmationOption;
            this.deferredIntentConfirmationType = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n70.f getDeferredIntentConfirmationType() {
            return this.deferredIntentConfirmationType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return p013kotlin.jvm.internal.s.f(this.intent, complete.intent) && p013kotlin.jvm.internal.s.f(this.confirmationOption, complete.confirmationOption) && this.deferredIntentConfirmationType == complete.deferredIntentConfirmationType;
        }

        public int hashCode() {
            int iHashCode = ((this.intent.hashCode() * 31) + this.confirmationOption.hashCode()) * 31;
            n70.f fVar = this.deferredIntentConfirmationType;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "Complete(intent=" + this.intent + ", confirmationOption=" + this.confirmationOption + ", deferredIntentConfirmationType=" + this.deferredIntentConfirmationType + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000*\u0004\b\u0005\u0010\u00012\b\u0012\u0004\u0012\u00028\u00050\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/stripe/android/paymentsheet/n$b;", "TLauncherArgs", "Lcom/stripe/android/paymentsheet/n;", "", "cause", "Lx30/c;", "message", "Lcom/stripe/android/paymentsheet/o;", "errorType", "<init>", "(Ljava/lang/Throwable;Lx30/c;Lcom/stripe/android/paymentsheet/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "b", "Lx30/c;", "()Lx30/c;", "c", "Lcom/stripe/android/paymentsheet/o;", "getErrorType", "()Lcom/stripe/android/paymentsheet/o;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Fail<TLauncherArgs> implements n<TLauncherArgs> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final o errorType;

        public Fail(Throwable cause, x30.c message, o errorType) {
            p013kotlin.jvm.internal.s.k(cause, "cause");
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(errorType, "errorType");
            this.cause = cause;
            this.message = message;
            this.errorType = errorType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final x30.c getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Fail)) {
                return false;
            }
            Fail fail = (Fail) other;
            return p013kotlin.jvm.internal.s.f(this.cause, fail.cause) && p013kotlin.jvm.internal.s.f(this.message, fail.message) && p013kotlin.jvm.internal.s.f(this.errorType, fail.errorType);
        }

        public int hashCode() {
            return (((this.cause.hashCode() * 31) + this.message.hashCode()) * 31) + this.errorType.hashCode();
        }

        public String toString() {
            return "Fail(cause=" + this.cause + ", message=" + this.message + ", errorType=" + this.errorType + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.n$c, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0005\u0010\u00012\b\u0012\u0004\u0012\u00028\u00050\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0005\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00028\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/n$c;", "TLauncherArgs", "Lcom/stripe/android/paymentsheet/n;", "launcherArguments", "Ln70/f;", "deferredIntentConfirmationType", "<init>", "(Ljava/lang/Object;Ln70/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Ln70/f;", "()Ln70/f;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Launch<TLauncherArgs> implements n<TLauncherArgs> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TLauncherArgs launcherArguments;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final n70.f deferredIntentConfirmationType;

        public Launch(TLauncherArgs tlauncherargs, n70.f fVar) {
            this.launcherArguments = tlauncherargs;
            this.deferredIntentConfirmationType = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n70.f getDeferredIntentConfirmationType() {
            return this.deferredIntentConfirmationType;
        }

        public final TLauncherArgs b() {
            return this.launcherArguments;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Launch)) {
                return false;
            }
            Launch launch = (Launch) other;
            return p013kotlin.jvm.internal.s.f(this.launcherArguments, launch.launcherArguments) && this.deferredIntentConfirmationType == launch.deferredIntentConfirmationType;
        }

        public int hashCode() {
            TLauncherArgs tlauncherargs = this.launcherArguments;
            int iHashCode = (tlauncherargs == null ? 0 : tlauncherargs.hashCode()) * 31;
            n70.f fVar = this.deferredIntentConfirmationType;
            return iHashCode + (fVar != null ? fVar.hashCode() : 0);
        }

        public String toString() {
            return "Launch(launcherArguments=" + this.launcherArguments + ", deferredIntentConfirmationType=" + this.deferredIntentConfirmationType + ")";
        }
    }
}
