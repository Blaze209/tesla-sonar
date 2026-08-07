package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import a70.Unvalidated;
import android.content.Context;
import androidx.core.app.d;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.view.n;
import h70.h;
import i70.f;
import jn0.h0;
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import w30.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0094@¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0004R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/a;", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "<init>", "()V", "Lcom/stripe/android/view/n;", "host", "actionable", "Lw30/l$c;", "requestOptions", "Ljn0/h0;", "f", "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/StripeIntent;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lh/b;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCallback;", "La70/c;", "activityResultCallback", "b", "(Lh/b;Landroidx/activity/result/ActivityResultCallback;)V", "c", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$a;", "a", "Landroidx/activity/result/ActivityResultLauncher;", "pollingLauncher", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a extends f<StripeIntent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<PollingContract.Args> pollingLauncher;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.polling.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C1041a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53443a;

        static {
            int[] iArr = new int[PaymentMethod.p.values().length];
            try {
                iArr[PaymentMethod.p.Upi.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.p.Blik.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53443a = iArr;
        }
    }

    @Override // i70.f, g70.a
    public void b(h.b activityResultCaller, ActivityResultCallback<Unvalidated> activityResultCallback) {
        s.k(activityResultCaller, "activityResultCaller");
        s.k(activityResultCallback, "activityResultCallback");
        this.pollingLauncher = activityResultCaller.registerForActivityResult(new PollingContract(), activityResultCallback);
    }

    @Override // i70.f, g70.a
    public void c() {
        ActivityResultLauncher<PollingContract.Args> activityResultLauncher = this.pollingLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.d();
        }
        this.pollingLauncher = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i70.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(n nVar, StripeIntent stripeIntent, l.Options options, Continuation<? super h0> continuation) {
        PollingContract.Args args;
        PaymentMethod.p pVar;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        String str = null;
        PaymentMethod.p pVar2 = paymentMethod != null ? paymentMethod.type : null;
        int i11 = pVar2 == null ? -1 : C1041a.f53443a[pVar2.ordinal()];
        if (i11 == 1) {
            String clientSecret = stripeIntent.getClientSecret();
            if (clientSecret == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            args = new PollingContract.Args(clientSecret, nVar.getStatusBarColor(), 300, 5, 12, x.f93529n0);
        } else {
            if (i11 != 2) {
                PaymentMethod paymentMethod2 = stripeIntent.getPaymentMethod();
                if (paymentMethod2 != null && (pVar = paymentMethod2.type) != null) {
                    str = pVar.code;
                }
                throw new IllegalStateException(("Received invalid payment method type " + str + " in PollingAuthenticator").toString());
            }
            String clientSecret2 = stripeIntent.getClientSecret();
            if (clientSecret2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            args = new PollingContract.Args(clientSecret2, nVar.getStatusBarColor(), 60, 5, 12, x.f93510e);
        }
        Context applicationContext = nVar.c().getApplicationContext();
        r90.b bVar = r90.b.f107376a;
        d dVarA = d.a(applicationContext, bVar.a(), bVar.b());
        s.j(dVarA, "makeCustomAnimation(...)");
        ActivityResultLauncher<PollingContract.Args> activityResultLauncher = this.pollingLauncher;
        if (activityResultLauncher == null) {
            h.b.a(h.Companion.b(h.INSTANCE, nVar.c(), null, 2, null), h.f.MISSING_POLLING_AUTHENTICATOR, null, null, 6, null);
        } else {
            activityResultLauncher.c(args, dVarA);
        }
        return h0.f84049a;
    }
}
