package com.stripe.android.paymentsheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.y0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\rJ>\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/i;", "", "Lcom/stripe/android/paymentsheet/y$m;", "initializationMode", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/y0;", "paymentMethodOptionsParams", "Lcom/stripe/android/model/l$d;", "shippingValues", "", "customerRequestedSave", "Lcom/stripe/android/paymentsheet/i$b;", "b", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/model/w0;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/l$d;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/v0;", "paymentMethod", "a", "(Lcom/stripe/android/paymentsheet/y$m;Lcom/stripe/android/model/v0;Lcom/stripe/android/model/y0;Lcom/stripe/android/model/l$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f53140a;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/i$a;", "", "<init>", "()V", "Ln70/a;", "b", "Ln70/a;", "a", "()Ln70/a;", "(Ln70/a;)V", "createIntentCallback", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f53140a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static n70.a createIntentCallback;

        private Companion() {
        }

        public final n70.a a() {
            return createIntentCallback;
        }

        public final void b(n70.a aVar) {
            createIntentCallback = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/i$b;", "", "Ln70/f;", "a", "()Ln70/f;", "deferredIntentConfirmationType", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/paymentsheet/i$b$a;", "Lcom/stripe/android/paymentsheet/i$b$b;", "Lcom/stripe/android/paymentsheet/i$b$c;", "Lcom/stripe/android/paymentsheet/i$b$d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.i$b$a, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/i$b$a;", "Lcom/stripe/android/paymentsheet/i$b;", "", "isForceSuccess", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "Ln70/f;", "()Ln70/f;", "deferredIntentConfirmationType", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Complete implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isForceSuccess;

            public Complete(boolean z11) {
                this.isForceSuccess = z11;
            }

            @Override // com.stripe.android.paymentsheet.i.b
            public n70.f a() {
                return this.isForceSuccess ? n70.f.None : n70.f.Server;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Complete) && this.isForceSuccess == ((Complete) other).isForceSuccess;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isForceSuccess);
            }

            public String toString() {
                return "Complete(isForceSuccess=" + this.isForceSuccess + ")";
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.i$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/i$b$b;", "Lcom/stripe/android/paymentsheet/i$b;", "Lcom/stripe/android/model/n;", "confirmParams", "", "isDeferred", "<init>", "(Lcom/stripe/android/model/n;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/n;", "b", "()Lcom/stripe/android/model/n;", "Z", "()Z", "Ln70/f;", "()Ln70/f;", "deferredIntentConfirmationType", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Confirm implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final com.stripe.android.model.n confirmParams;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isDeferred;

            public Confirm(com.stripe.android.model.n confirmParams, boolean z11) {
                p013kotlin.jvm.internal.s.k(confirmParams, "confirmParams");
                this.confirmParams = confirmParams;
                this.isDeferred = z11;
            }

            @Override // com.stripe.android.paymentsheet.i.b
            public n70.f a() {
                n70.f fVar = n70.f.Client;
                if (this.isDeferred) {
                    return fVar;
                }
                return null;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final com.stripe.android.model.n getConfirmParams() {
                return this.confirmParams;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Confirm)) {
                    return false;
                }
                Confirm confirm = (Confirm) other;
                return p013kotlin.jvm.internal.s.f(this.confirmParams, confirm.confirmParams) && this.isDeferred == confirm.isDeferred;
            }

            public int hashCode() {
                return (this.confirmParams.hashCode() * 31) + Boolean.hashCode(this.isDeferred);
            }

            public String toString() {
                return "Confirm(confirmParams=" + this.confirmParams + ", isDeferred=" + this.isDeferred + ")";
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.i$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/i$b$c;", "Lcom/stripe/android/paymentsheet/i$b;", "", "cause", "Lx30/c;", "message", "<init>", "(Ljava/lang/Throwable;Lx30/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "Lx30/c;", "c", "()Lx30/c;", "Ln70/f;", "()Ln70/f;", "deferredIntentConfirmationType", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Fail implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Throwable cause;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final x30.c message;

            public Fail(Throwable cause, x30.c message) {
                p013kotlin.jvm.internal.s.k(cause, "cause");
                p013kotlin.jvm.internal.s.k(message, "message");
                this.cause = cause;
                this.message = message;
            }

            @Override // com.stripe.android.paymentsheet.i.b
            public n70.f a() {
                return null;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
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
                return p013kotlin.jvm.internal.s.f(this.cause, fail.cause) && p013kotlin.jvm.internal.s.f(this.message, fail.message);
            }

            public int hashCode() {
                return (this.cause.hashCode() * 31) + this.message.hashCode();
            }

            public String toString() {
                return "Fail(cause=" + this.cause + ", message=" + this.message + ")";
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.i$b$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/i$b$d;", "Lcom/stripe/android/paymentsheet/i$b;", "", "clientSecret", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ln70/f;", "()Ln70/f;", "deferredIntentConfirmationType", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class HandleNextAction implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String clientSecret;

            public HandleNextAction(String clientSecret) {
                p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            @Override // com.stripe.android.paymentsheet.i.b
            public n70.f a() {
                return n70.f.Server;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleNextAction) && p013kotlin.jvm.internal.s.f(this.clientSecret, ((HandleNextAction) other).clientSecret);
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                return "HandleNextAction(clientSecret=" + this.clientSecret + ")";
            }
        }

        n70.f a();
    }

    Object a(y.m mVar, PaymentMethod paymentMethod, y0 y0Var, ConfirmPaymentIntentParams.Shipping shipping, Continuation<? super b> continuation);

    Object b(y.m mVar, PaymentMethodCreateParams paymentMethodCreateParams, y0 y0Var, ConfirmPaymentIntentParams.Shipping shipping, boolean z11, Continuation<? super b> continuation);
}
