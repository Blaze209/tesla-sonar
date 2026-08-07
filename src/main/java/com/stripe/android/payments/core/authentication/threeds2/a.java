package com.stripe.android.payments.core.authentication.threeds2;

import a70.Unvalidated;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import t80.InitChallengeArgs;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/a;", "", "<init>", "()V", "a", "b", "c", "Lcom/stripe/android/payments/core/authentication/threeds2/a$a;", "Lcom/stripe/android/payments/core/authentication/threeds2/a$b;", "Lcom/stripe/android/payments/core/authentication/threeds2/a$c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: com.stripe.android.payments.core.authentication.threeds2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/a$a;", "Lcom/stripe/android/payments/core/authentication/threeds2/a;", "La70/c;", "result", "<init>", "(La70/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "La70/c;", "()La70/c;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Complete extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Unvalidated result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Complete(Unvalidated result) {
            super(null);
            s.k(result, "result");
            this.result = result;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Unvalidated getResult() {
            return this.result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Complete) && s.f(this.result, ((Complete) other).result);
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        public String toString() {
            return "Complete(result=" + this.result + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.core.authentication.threeds2.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/a$b;", "Lcom/stripe/android/payments/core/authentication/threeds2/a;", "Lt80/m;", "args", "<init>", "(Lt80/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lt80/m;", "()Lt80/m;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartChallenge extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InitChallengeArgs args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartChallenge(InitChallengeArgs args) {
            super(null);
            s.k(args, "args");
            this.args = args;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InitChallengeArgs getArgs() {
            return this.args;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartChallenge) && s.f(this.args, ((StartChallenge) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "StartChallenge(args=" + this.args + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.payments.core.authentication.threeds2.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/a$c;", "Lcom/stripe/android/payments/core/authentication/threeds2/a;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "args", "<init>", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartFallback extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PaymentBrowserAuthContract.Args args;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartFallback(PaymentBrowserAuthContract.Args args) {
            super(null);
            s.k(args, "args");
            this.args = args;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentBrowserAuthContract.Args getArgs() {
            return this.args;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StartFallback) && s.f(this.args, ((StartFallback) other).args);
        }

        public int hashCode() {
            return this.args.hashCode();
        }

        public String toString() {
            return "StartFallback(args=" + this.args + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
