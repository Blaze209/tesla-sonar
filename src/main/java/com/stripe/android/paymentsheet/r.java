package com.stripe.android.paymentsheet;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/r;", "", "a", "b", "c", "Lcom/stripe/android/paymentsheet/r$a;", "Lcom/stripe/android/paymentsheet/r$b;", "Lcom/stripe/android/paymentsheet/r$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface r {

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.r$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/r$a;", "Lcom/stripe/android/paymentsheet/r;", "Ln70/n;", "action", "<init>", "(Ln70/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln70/n;", "()Ln70/n;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Canceled implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n70.n action;

        public Canceled(n70.n action) {
            p013kotlin.jvm.internal.s.k(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n70.n getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Canceled) && this.action == ((Canceled) other).action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "Canceled(action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.r$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/r$b;", "Lcom/stripe/android/paymentsheet/r;", "", "cause", "Lx30/c;", "message", "Lcom/stripe/android/paymentsheet/o;", "type", "<init>", "(Ljava/lang/Throwable;Lx30/c;Lcom/stripe/android/paymentsheet/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "b", "Lx30/c;", "()Lx30/c;", "c", "Lcom/stripe/android/paymentsheet/o;", "()Lcom/stripe/android/paymentsheet/o;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final x30.c message;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final o type;

        public Failed(Throwable cause, x30.c message, o type) {
            p013kotlin.jvm.internal.s.k(cause, "cause");
            p013kotlin.jvm.internal.s.k(message, "message");
            p013kotlin.jvm.internal.s.k(type, "type");
            this.cause = cause;
            this.message = message;
            this.type = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final x30.c getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return p013kotlin.jvm.internal.s.f(this.cause, failed.cause) && p013kotlin.jvm.internal.s.f(this.message, failed.message) && p013kotlin.jvm.internal.s.f(this.type, failed.type);
        }

        public int hashCode() {
            return (((this.cause.hashCode() * 31) + this.message.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Failed(cause=" + this.cause + ", message=" + this.message + ", type=" + this.type + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.r$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/r$c;", "Lcom/stripe/android/paymentsheet/r;", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "Ln70/f;", "deferredIntentConfirmationType", "<init>", "(Lcom/stripe/android/model/StripeIntent;Ln70/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/StripeIntent;", "b", "()Lcom/stripe/android/model/StripeIntent;", "Ln70/f;", "()Ln70/f;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Succeeded implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final StripeIntent intent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final n70.f deferredIntentConfirmationType;

        public Succeeded(StripeIntent intent, n70.f fVar) {
            p013kotlin.jvm.internal.s.k(intent, "intent");
            this.intent = intent;
            this.deferredIntentConfirmationType = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final n70.f getDeferredIntentConfirmationType() {
            return this.deferredIntentConfirmationType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final StripeIntent getIntent() {
            return this.intent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Succeeded)) {
                return false;
            }
            Succeeded succeeded = (Succeeded) other;
            return p013kotlin.jvm.internal.s.f(this.intent, succeeded.intent) && this.deferredIntentConfirmationType == succeeded.deferredIntentConfirmationType;
        }

        public int hashCode() {
            int iHashCode = this.intent.hashCode() * 31;
            n70.f fVar = this.deferredIntentConfirmationType;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "Succeeded(intent=" + this.intent + ", deferredIntentConfirmationType=" + this.deferredIntentConfirmationType + ")";
        }
    }
}
