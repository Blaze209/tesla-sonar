package com.stripe.android.paymentsheet;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.DeferredIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/y$n;", "Lcom/stripe/android/model/g0;", "b", "(Lcom/stripe/android/paymentsheet/y$n;)Lcom/stripe/android/model/g0;", "Lcom/stripe/android/paymentsheet/y$n$d;", "Lcom/stripe/android/model/g0$b;", "a", "(Lcom/stripe/android/paymentsheet/y$n$d;)Lcom/stripe/android/model/g0$b;", "Lcom/stripe/android/paymentsheet/y$n$e;", "Lcom/stripe/android/model/StripeIntent$Usage;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/paymentsheet/y$n$e;)Lcom/stripe/android/model/StripeIntent$Usage;", "Lcom/stripe/android/paymentsheet/y$n$a;", "Lcom/stripe/android/model/u0$b;", "c", "(Lcom/stripe/android/paymentsheet/y$n$a;)Lcom/stripe/android/model/u0$b;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52807b;

        static {
            int[] iArr = new int[y.n.e.values().length];
            try {
                iArr[y.n.e.OnSession.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.n.e.OffSession.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52806a = iArr;
            int[] iArr2 = new int[y.n.a.values().length];
            try {
                iArr2[y.n.a.Automatic.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[y.n.a.AutomaticAsync.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[y.n.a.Manual.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f52807b = iArr2;
        }
    }

    private static final DeferredIntentParams.b a(y.n.d dVar) {
        if (!(dVar instanceof y.n.d.a)) {
            if (!(dVar instanceof y.n.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            y.n.d.b bVar = (y.n.d.b) dVar;
            return new DeferredIntentParams.b.Setup(bVar.getCurrency(), d(bVar.getSetupFutureUse()));
        }
        y.n.d.a aVar = (y.n.d.a) dVar;
        long amount = aVar.getAmount();
        String currency = aVar.getCurrency();
        y.n.e setupFutureUse = dVar.getSetupFutureUse();
        return new DeferredIntentParams.b.Payment(amount, currency, setupFutureUse != null ? d(setupFutureUse) : null, c(aVar.getCaptureMethod()));
    }

    public static final DeferredIntentParams b(y.n nVar) {
        p013kotlin.jvm.internal.s.k(nVar, "<this>");
        return new DeferredIntentParams(a(nVar.getMode()), nVar.t(), nVar.getPaymentMethodConfigurationId(), nVar.getOnBehalfOf());
    }

    private static final PaymentIntent.b c(y.n.a aVar) {
        int i11 = a.f52807b[aVar.ordinal()];
        if (i11 == 1) {
            return PaymentIntent.b.Automatic;
        }
        if (i11 == 2) {
            return PaymentIntent.b.AutomaticAsync;
        }
        if (i11 == 3) {
            return PaymentIntent.b.Manual;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final StripeIntent.Usage d(y.n.e eVar) {
        int i11 = a.f52806a[eVar.ordinal()];
        if (i11 == 1) {
            return StripeIntent.Usage.OnSession;
        }
        if (i11 == 2) {
            return StripeIntent.Usage.OffSession;
        }
        throw new NoWhenBranchMatchedException();
    }
}
