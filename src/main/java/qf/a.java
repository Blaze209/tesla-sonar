package qf;

import android.app.Application;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.s0;
import be.d;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.paymentmethod.BacsDirectDebitPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.ConvenienceStoresJPPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.OnlineBankingJPPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.PayEasyPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.SevenElevenPaymentMethod;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import ezvcard.property.Kind;
import java.util.List;
import jn0.h0;
import le.j;
import of.e;
import of.f;
import of.g;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B+\b\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 JI\u0010\"\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lqf/a;", "Lie/a;", "Lof/e;", "Lof/f;", "Lrf/c;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lxa/d;", "savedStateRegistryOwner", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", Kind.APPLICATION, "Lbe/d;", "checkoutConfiguration", "Lbe/a;", "callback", "", Action.KEY_ATTRIBUTE, "e", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lbe/d;Lbe/a;Ljava/lang/String;)Lof/e;", "Landroidx/lifecycle/s0;", "savedStateHandle", "g", "(Lbe/d;Landroidx/lifecycle/s0;Landroid/app/Application;)Lrf/c;", "configuration", "f", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lof/f;Lbe/a;Ljava/lang/String;)Lof/e;", "a", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "b", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "c", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements ie.a<e, f, rf.c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f105361d = v.p(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE, "boletobancario", "boletobancario_bancodobrasil", "boletobancario_bradesco", "boletobancario_hsbc", "boletobancario_itau", "boletobancario_santander", "primeiropay_boleto", PayEasyPaymentMethod.PAYMENT_METHOD_TYPE, OnlineBankingJPPaymentMethod.PAYMENT_METHOD_TYPE, SevenElevenPaymentMethod.PAYMENT_METHOD_TYPE, ConvenienceStoresJPPaymentMethod.PAYMENT_METHOD_TYPE, "multibanco");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocaleProvider localeProvider;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lce/b;", "it", "Ljn0/h0;", "a", "(Lce/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<ce.b, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f105364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ be.a f105365d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar, be.a aVar) {
            super(1);
            this.f105364c = eVar;
            this.f105365d = aVar;
        }

        public final void a(ce.b it) {
            s.k(it, "it");
            this.f105364c.getActionComponentEventHandler().a(it, this.f105365d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(ce.b bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "savedStateHandle", "Lof/e;", "a", "(Landroidx/lifecycle/s0;)Lof/e;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<s0, e> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f105367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Application f105368e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, Application application) {
            super(1);
            this.f105367d = dVar;
            this.f105368e = application;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e invoke(s0 savedStateHandle) {
            s.k(savedStateHandle, "savedStateHandle");
            return new e(a.this.b(this.f105367d, savedStateHandle, this.f105368e), new ce.l());
        }
    }

    public a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider) {
        s.k(localeProvider, "localeProvider");
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    @Override // ie.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e c(ComponentActivity componentActivity, f fVar, be.a aVar, String str) {
        return (e) ie.a.C1635a.a(this, componentActivity, fVar, aVar, str);
    }

    public e e(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, Application application, d checkoutConfiguration, be.a callback, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(application, "application");
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(callback, "callback");
        e eVar = (e) j.a(new ViewModelProvider(viewModelStoreOwner, j.b(savedStateRegistryOwner, null, new c(checkoutConfiguration, application))), key, e.class);
        eVar.i(lifecycleOwner, new b(eVar, callback));
        return eVar;
    }

    @Override // ie.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public e a(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, Application application, f configuration, be.a callback, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(application, "application");
        s.k(configuration, "configuration");
        s.k(callback, "callback");
        return e(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, application, g.a(configuration), callback, key);
    }

    @Override // ie.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public rf.c b(d checkoutConfiguration, s0 savedStateHandle, Application application) {
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(savedStateHandle, "savedStateHandle");
        s.k(application, "application");
        return new rf.a(new ce.e(null, 1, null), savedStateHandle, new ke.l(new ke.g()).a(checkoutConfiguration, this.localeProvider.a(application), null, null), new nf.f(), new nf.c(null, 1, null), this.analyticsManager);
    }

    public /* synthetic */ a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : analyticsManager, (i11 & 2) != 0 ? null : dropInOverrideParams, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }
}
