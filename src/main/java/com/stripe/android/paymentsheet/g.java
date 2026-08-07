package com.stripe.android.paymentsheet;

import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\bH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010%J1\u0010*\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R&\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00030\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-¨\u0006."}, d2 = {"Lcom/stripe/android/paymentsheet/g;", "", "Lcom/stripe/android/paymentsheet/p$d;", "Lcom/stripe/android/payments/paymentlauncher/b;", "Lcom/stripe/android/paymentsheet/g$a;", "Lcom/stripe/android/payments/paymentlauncher/a;", "Lcom/stripe/android/paymentsheet/i;", "intentConfirmationInterceptor", "Lkotlin/Function1;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$a;", "paymentLauncherFactory", "<init>", "(Lcom/stripe/android/paymentsheet/i;Lwn0/l;)V", "launcher", "", "clientSecret", "Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "e", "(Lcom/stripe/android/payments/paymentlauncher/b;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;)V", "Lcom/stripe/android/model/n;", "confirmStripeIntentParams", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/payments/paymentlauncher/b;Lcom/stripe/android/model/n;)V", "confirmationOption", "Lcom/stripe/android/paymentsheet/n;", "a", "(Lcom/stripe/android/paymentsheet/p$d;Lcom/stripe/android/model/StripeIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh/b;", "activityResultCaller", "onResult", "b", "(Lh/b;Lwn0/l;)Lcom/stripe/android/payments/paymentlauncher/b;", "arguments", "c", "(Lcom/stripe/android/payments/paymentlauncher/b;Lcom/stripe/android/paymentsheet/g$a;Lcom/stripe/android/paymentsheet/p$d;Lcom/stripe/android/model/StripeIntent;)V", "Ln70/f;", "deferredIntentConfirmationType", "result", "Lcom/stripe/android/paymentsheet/r;", "f", "(Lcom/stripe/android/paymentsheet/p$d;Ln70/f;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/paymentlauncher/a;)Lcom/stripe/android/paymentsheet/r;", "Lcom/stripe/android/paymentsheet/i;", "Lwn0/l;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i intentConfirmationInterceptor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<ActivityResultLauncher<PaymentLauncherContract.a>, com.stripe.android.payments.paymentlauncher.b> paymentLauncherFactory;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/g$a;", "", "a", "b", "Lcom/stripe/android/paymentsheet/g$a$a;", "Lcom/stripe/android/paymentsheet/g$a$b;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/g$a$a;", "Lcom/stripe/android/paymentsheet/g$a;", "Lcom/stripe/android/model/n;", "confirmNextParams", "<init>", "(Lcom/stripe/android/model/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/n;", "()Lcom/stripe/android/model/n;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Confirm implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final com.stripe.android.model.n confirmNextParams;

            public Confirm(com.stripe.android.model.n confirmNextParams) {
                p013kotlin.jvm.internal.s.k(confirmNextParams, "confirmNextParams");
                this.confirmNextParams = confirmNextParams;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final com.stripe.android.model.n getConfirmNextParams() {
                return this.confirmNextParams;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Confirm) && p013kotlin.jvm.internal.s.f(this.confirmNextParams, ((Confirm) other).confirmNextParams);
            }

            public int hashCode() {
                return this.confirmNextParams.hashCode();
            }

            public String toString() {
                return "Confirm(confirmNextParams=" + this.confirmNextParams + ")";
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/g$a$b;", "Lcom/stripe/android/paymentsheet/g$a;", "", "clientSecret", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NextAction implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String clientSecret;

            public NextAction(String clientSecret) {
                p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
                this.clientSecret = clientSecret;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getClientSecret() {
                return this.clientSecret;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NextAction) && p013kotlin.jvm.internal.s.f(this.clientSecret, ((NextAction) other).clientSecret);
            }

            public int hashCode() {
                return this.clientSecret.hashCode();
            }

            public String toString() {
                return "NextAction(clientSecret=" + this.clientSecret + ")";
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.IntentConfirmationDefinition", f = "IntentConfirmationDefinition.kt", i = {0, 0}, l = {29}, m = "action", n = {"confirmationOption", AnalyticsAttribute.Intent}, s = {"L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f53050n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f53051o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f53052p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f53054r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f53052p = obj;
            this.f53054r |= Integer.MIN_VALUE;
            return g.this.a(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c implements ActivityResultCallback, p013kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f53055a;

        c(wn0.l function) {
            p013kotlin.jvm.internal.s.k(function, "function");
            this.f53055a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return this.f53055a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        public final /* synthetic */ void onActivityResult(Object obj) {
            this.f53055a.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(i intentConfirmationInterceptor, wn0.l<? super ActivityResultLauncher<PaymentLauncherContract.a>, ? extends com.stripe.android.payments.paymentlauncher.b> paymentLauncherFactory) {
        p013kotlin.jvm.internal.s.k(intentConfirmationInterceptor, "intentConfirmationInterceptor");
        p013kotlin.jvm.internal.s.k(paymentLauncherFactory, "paymentLauncherFactory");
        this.intentConfirmationInterceptor = intentConfirmationInterceptor;
        this.paymentLauncherFactory = paymentLauncherFactory;
    }

    private final void d(com.stripe.android.payments.paymentlauncher.b launcher, com.stripe.android.model.n confirmStripeIntentParams) {
        if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
            launcher.a((ConfirmPaymentIntentParams) confirmStripeIntentParams);
        } else if (confirmStripeIntentParams instanceof ConfirmSetupIntentParams) {
            launcher.c((ConfirmSetupIntentParams) confirmStripeIntentParams);
        }
    }

    private final void e(com.stripe.android.payments.paymentlauncher.b launcher, String clientSecret, StripeIntent intent) {
        if (intent instanceof PaymentIntent) {
            launcher.b(clientSecret);
        } else if (intent instanceof SetupIntent) {
            launcher.d(clientSecret);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(p.d dVar, StripeIntent stripeIntent, Continuation<? super n<a>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f53054r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f53054r = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objA = bVar.f53052p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f53054r;
        if (i12 == 0) {
            jn0.t.b(objA);
            i iVar = this.intentConfirmationInterceptor;
            bVar.f53050n = dVar;
            bVar.f53051o = stripeIntent;
            bVar.f53054r = 1;
            objA = j.a(iVar, dVar, bVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stripeIntent = (StripeIntent) bVar.f53051o;
            dVar = (p.d) bVar.f53050n;
            jn0.t.b(objA);
        }
        i.b bVar2 = (i.b) objA;
        n70.f fVarA = bVar2.a();
        if (bVar2 instanceof i.b.HandleNextAction) {
            return new n.Launch(new a.NextAction(((i.b.HandleNextAction) bVar2).getClientSecret()), fVarA);
        }
        if (bVar2 instanceof i.b.Confirm) {
            return new n.Launch(new a.Confirm(((i.b.Confirm) bVar2).getConfirmParams()), fVarA);
        }
        if (bVar2 instanceof i.b.Fail) {
            i.b.Fail fail = (i.b.Fail) bVar2;
            return new n.Fail(fail.getCause(), fail.getMessage(), o.d.f53214a);
        }
        if (bVar2 instanceof i.b.Complete) {
            return new n.Complete(stripeIntent, dVar, fVarA);
        }
        throw new NoWhenBranchMatchedException();
    }

    public com.stripe.android.payments.paymentlauncher.b b(h.b activityResultCaller, wn0.l<? super com.stripe.android.payments.paymentlauncher.a, h0> onResult) {
        p013kotlin.jvm.internal.s.k(activityResultCaller, "activityResultCaller");
        p013kotlin.jvm.internal.s.k(onResult, "onResult");
        wn0.l<ActivityResultLauncher<PaymentLauncherContract.a>, com.stripe.android.payments.paymentlauncher.b> lVar = this.paymentLauncherFactory;
        ActivityResultLauncher<PaymentLauncherContract.a> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(new PaymentLauncherContract(), new c(onResult));
        p013kotlin.jvm.internal.s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        return lVar.invoke(activityResultLauncherRegisterForActivityResult);
    }

    public void c(com.stripe.android.payments.paymentlauncher.b launcher, a arguments, p.d confirmationOption, StripeIntent intent) {
        p013kotlin.jvm.internal.s.k(launcher, "launcher");
        p013kotlin.jvm.internal.s.k(arguments, "arguments");
        p013kotlin.jvm.internal.s.k(confirmationOption, "confirmationOption");
        p013kotlin.jvm.internal.s.k(intent, "intent");
        if (arguments instanceof a.Confirm) {
            d(launcher, ((a.Confirm) arguments).getConfirmNextParams());
        } else if (arguments instanceof a.NextAction) {
            e(launcher, ((a.NextAction) arguments).getClientSecret(), intent);
        }
    }

    public r f(p.d confirmationOption, n70.f deferredIntentConfirmationType, StripeIntent intent, com.stripe.android.payments.paymentlauncher.a result) {
        p013kotlin.jvm.internal.s.k(confirmationOption, "confirmationOption");
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(result, "result");
        if (result instanceof com.stripe.android.payments.paymentlauncher.a.Completed) {
            return new r.Succeeded(((com.stripe.android.payments.paymentlauncher.a.Completed) result).getIntent(), deferredIntentConfirmationType);
        }
        if (result instanceof com.stripe.android.payments.paymentlauncher.a.d) {
            com.stripe.android.payments.paymentlauncher.a.d dVar = (com.stripe.android.payments.paymentlauncher.a.d) result;
            return new r.Failed(dVar.getThrowable(), l30.a.b(dVar.getThrowable()), o.f.f53216a);
        }
        if (result instanceof com.stripe.android.payments.paymentlauncher.a.C0948a) {
            return new r.Canceled(n70.n.InformCancellation);
        }
        throw new NoWhenBranchMatchedException();
    }
}
