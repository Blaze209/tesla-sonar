package i70;

import android.content.Context;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.StripeIntent;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0094@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Li70/p;", "Li70/f;", "Lcom/stripe/android/model/StripeIntent;", "Li70/s;", "webIntentAuthenticator", "Li70/d;", "noOpIntentAuthenticator", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Li70/s;Li70/d;Landroid/content/Context;)V", "Lcom/stripe/android/view/n;", "host", "actionable", "Lw30/l$c;", "requestOptions", "Ljn0/h0;", "f", "(Lcom/stripe/android/view/n;Lcom/stripe/android/model/StripeIntent;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Li70/s;", "b", "Li70/d;", "c", "Landroid/content/Context;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p extends f<StripeIntent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s webIntentAuthenticator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d noOpIntentAuthenticator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public p(s webIntentAuthenticator, d noOpIntentAuthenticator, Context context) {
        p013kotlin.jvm.internal.s.k(webIntentAuthenticator, "webIntentAuthenticator");
        p013kotlin.jvm.internal.s.k(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.webIntentAuthenticator = webIntentAuthenticator;
        this.noOpIntentAuthenticator = noOpIntentAuthenticator;
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i70.f
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object e(com.stripe.android.view.n nVar, StripeIntent stripeIntent, w30.l.Options options, Continuation<? super h0> continuation) {
        String code;
        Parcelable nextActionData = stripeIntent.getNextActionData();
        p013kotlin.jvm.internal.s.i(nextActionData, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.DisplayVoucherDetails");
        if (((StripeIntent.a.h) nextActionData).getHostedVoucherUrl() != null) {
            Object objD = this.webIntentAuthenticator.d(nVar, stripeIntent, options, continuation);
            return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : h0.f84049a;
        }
        h70.h hVarB = h70.h.Companion.b(h70.h.INSTANCE, this.context, null, 2, null);
        h70.h.f fVar = h70.h.f.MISSING_HOSTED_VOUCHER_URL;
        StripeIntent.NextActionType nextActionTypeP0 = stripeIntent.P0();
        if (nextActionTypeP0 == null || (code = nextActionTypeP0.getCode()) == null) {
            code = "";
        }
        h70.h.b.a(hVarB, fVar, null, v0.f(x.a("next_action_type", code)), 2, null);
        Object objD2 = this.noOpIntentAuthenticator.d(nVar, stripeIntent, options, continuation);
        return objD2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD2 : h0.f84049a;
    }
}
