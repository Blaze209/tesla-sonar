package com.stripe.android.stripe3ds2.transaction;

import android.app.Application;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.stripe3ds2.security.DefaultMessageTransformer;
import ezvcard.property.Kind;
import java.security.cert.X509Certificate;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import r80.Stripe3ds2ErrorReporterConfig;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/l;", "", "Landroid/app/Application;", Kind.APPLICATION, "", "isLiveMode", "Lt80/q;", "sdkTransactionId", "Lq80/m;", "uiCustomization", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Landroid/app/Application;ZLt80/q;Lq80/m;Ljava/util/List;ZLkotlin/coroutines/CoroutineContext;)V", "Lt80/n;", "a", "()Lt80/n;", "Landroid/app/Application;", "b", "Z", "c", "Lt80/q;", DateTokenConverter.CONVERTER_KEY, "Lq80/m;", "e", "Ljava/util/List;", "f", "g", "Lkotlin/coroutines/CoroutineContext;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Application application;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t80.q sdkTransactionId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q80.m uiCustomization;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<X509Certificate> rootCerts;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean enableLogging;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX WARN: Multi-variable type inference failed */
    public l(Application application, boolean z11, t80.q sdkTransactionId, q80.m uiCustomization, List<? extends X509Certificate> rootCerts, boolean z12, CoroutineContext workContext) {
        s.k(application, "application");
        s.k(sdkTransactionId, "sdkTransactionId");
        s.k(uiCustomization, "uiCustomization");
        s.k(rootCerts, "rootCerts");
        s.k(workContext, "workContext");
        this.application = application;
        this.isLiveMode = z11;
        this.sdkTransactionId = sdkTransactionId;
        this.uiCustomization = uiCustomization;
        this.rootCerts = rootCerts;
        this.enableLogging = z12;
        this.workContext = workContext;
    }

    public final t80.n a() {
        o oVarA = o.INSTANCE.a(this.enableLogging);
        r80.a aVar = new r80.a(this.application, new Stripe3ds2ErrorReporterConfig(this.sdkTransactionId), this.workContext, oVarA, null, null, null, 0, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        return new j(this.sdkTransactionId, new t80.p(), new t80.h(this.isLiveMode, this.rootCerts, aVar), new DefaultMessageTransformer(this.isLiveMode), new t80.f(aVar), new i(aVar, this.workContext), new q.b(this.workContext), this.uiCustomization, aVar, oVarA);
    }
}
