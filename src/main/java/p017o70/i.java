package p017o70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.y;
import h30.j;
import java.util.Map;
import jn0.h0;
import m60.InlineSignupViewState;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import t60.h;
import u60.k;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2\u0018\b\u0001\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lo70/i;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "merchantName", "", "Li90/g0;", "initialValues", "shippingValues", "Lt60/h;", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lt60/h;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f96841a = new i();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm60/e;", "it", "Ljn0/h0;", "a", "(Lm60/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<InlineSignupViewState, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f96842c = new a();

        a() {
            super(1);
        }

        public final void a(InlineSignupViewState it) {
            s.k(it, "it");
            throw new IllegalStateException("`InlineSignUpViewState` updates should not be received by `FormController`!");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(InlineSignupViewState inlineSignupViewState) {
            a(inlineSignupViewState);
            return h0.f84049a;
        }
    }

    private i() {
    }

    public final h a(Context context, String merchantName, Map<IdentifierSpec, String> initialValues, Map<IdentifierSpec, String> shippingValues) {
        s.k(context, "context");
        s.k(merchantName, "merchantName");
        s.k(initialValues, "initialValues");
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        return new h(new k.a(new j(applicationContext), null, initialValues, shippingValues, false, merchantName, x80.a.c.f123091a, new y.BillingDetailsCollectionConfiguration(null, null, null, null, false, 31, null), false, a.f96842c));
    }
}
