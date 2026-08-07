package wd;

import android.app.Application;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.s0;
import be.d;
import be.f;
import ce.m;
import ce.p;
import ce.r;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.OrderRequest;
import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.core.exception.ComponentException;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import ezvcard.property.Kind;
import java.util.Locale;
import jn0.h0;
import ke.ButtonComponentParams;
import ke.e;
import ke.g;
import kf.o;
import le.j;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import ud.BacsDirectDebitComponentState;
import ud.c;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u00012 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u0006B+\b\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013Jg\u0010$\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%Jg\u0010'\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u000e\u0010!\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010+R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lwd/a;", "Lie/b;", "Lud/a;", "Lud/c;", "Lud/b;", "Lbe/f;", "", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lcom/adyen/checkout/components/core/PaymentMethod;", "paymentMethod", "Ljn0/h0;", "e", "(Lcom/adyen/checkout/components/core/PaymentMethod;)V", "Lxa/d;", "savedStateRegistryOwner", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lbe/d;", "checkoutConfiguration", "Landroid/app/Application;", Kind.APPLICATION, "componentCallback", "Lcom/adyen/checkout/components/core/OrderRequest;", "Lcom/adyen/checkout/components/core/Order;", "order", "", Action.KEY_ATTRIBUTE, "g", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lbe/d;Landroid/app/Application;Lbe/f;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lud/a;", "configuration", "h", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Lcom/adyen/checkout/components/core/PaymentMethod;Lud/c;Landroid/app/Application;Lbe/f;Lcom/adyen/checkout/components/core/OrderRequest;Ljava/lang/String;)Lud/a;", "", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/PaymentMethod;)Z", "a", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "b", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements ie.b<ud.a, c, BacsDirectDebitComponentState, f<BacsDirectDebitComponentState>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocaleProvider localeProvider;

    /* JADX INFO: renamed from: wd.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lce/p;", "Lud/b;", "it", "Ljn0/h0;", "a", "(Lce/p;)V"}, k = 3, mv = {1, 9, 0})
    static final class C2614a extends u implements l<p<BacsDirectDebitComponentState>, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ud.a f121669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f<BacsDirectDebitComponentState> f121670d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2614a(ud.a aVar, f<BacsDirectDebitComponentState> fVar) {
            super(1);
            this.f121669c = aVar;
            this.f121670d = fVar;
        }

        public final void a(p<BacsDirectDebitComponentState> it) {
            s.k(it, "it");
            this.f121669c.f().h(it, this.f121670d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p<BacsDirectDebitComponentState> pVar) {
            a(pVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "savedStateHandle", "Lud/a;", "a", "(Landroidx/lifecycle/s0;)Lud/a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<s0, ud.a> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f121671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a f121672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Application f121673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ PaymentMethod f121674f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ OrderRequest f121675g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, a aVar, Application application, PaymentMethod paymentMethod, OrderRequest orderRequest) {
            super(1);
            this.f121671c = dVar;
            this.f121672d = aVar;
            this.f121673e = application;
            this.f121674f = paymentMethod;
            this.f121675g = orderRequest;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ud.a invoke(s0 savedStateHandle) {
            s.k(savedStateHandle, "savedStateHandle");
            e eVar = new e(new g());
            d dVar = this.f121671c;
            Locale localeA = this.f121672d.localeProvider.a(this.f121673e);
            a.c(this.f121672d);
            ButtonComponentParams buttonComponentParamsA = eVar.a(dVar, localeA, null, null, ud.d.a(this.f121671c));
            AnalyticsManager analyticsManagerB = this.f121672d.analyticsManager;
            if (analyticsManagerB == null) {
                de.b bVar = new de.b();
                Application application = this.f121673e;
                String type = this.f121674f.getType();
                if (type == null) {
                    type = "";
                }
                analyticsManagerB = bVar.b(buttonComponentParamsA, application, new de.e.PaymentComponent(type), null);
            }
            AnalyticsManager analyticsManager = analyticsManagerB;
            xd.e eVar2 = new xd.e(new r(null, 1, null), buttonComponentParamsA, this.f121674f, this.f121675g, analyticsManager, new o(savedStateHandle));
            a.c(this.f121672d);
            gd.c cVarG = new fd.a(analyticsManager, null, null, 4, null).b(this.f121671c, savedStateHandle, this.f121673e);
            return new ud.a(eVar2, cVarG, new ed.b(cVarG, eVar2), new m());
        }
    }

    public a(DropInOverrideParams dropInOverrideParams, AnalyticsManager analyticsManager, LocaleProvider localeProvider) {
        s.k(localeProvider, "localeProvider");
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    public static final /* synthetic */ DropInOverrideParams c(a aVar) {
        aVar.getClass();
        return null;
    }

    private final void e(PaymentMethod paymentMethod) {
        if (i(paymentMethod)) {
            return;
        }
        throw new ComponentException("Unsupported payment method " + paymentMethod.getType(), null, 2, null);
    }

    public ud.a f(ComponentActivity componentActivity, PaymentMethod paymentMethod, c cVar, f<BacsDirectDebitComponentState> fVar, OrderRequest orderRequest, String str) {
        return (ud.a) ie.b.a.a(this, componentActivity, paymentMethod, cVar, fVar, orderRequest, str);
    }

    public ud.a g(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, d checkoutConfiguration, Application application, f<BacsDirectDebitComponentState> componentCallback, OrderRequest order, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(paymentMethod, "paymentMethod");
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(application, "application");
        s.k(componentCallback, "componentCallback");
        e(paymentMethod);
        ud.a aVar = (ud.a) j.a(new ViewModelProvider(viewModelStoreOwner, j.b(savedStateRegistryOwner, null, new b(checkoutConfiguration, this, application, paymentMethod, order))), key, ud.a.class);
        aVar.g(lifecycleOwner, new C2614a(aVar, componentCallback));
        return aVar;
    }

    @Override // ie.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ud.a a(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, PaymentMethod paymentMethod, c configuration, Application application, f<BacsDirectDebitComponentState> componentCallback, OrderRequest order, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(paymentMethod, "paymentMethod");
        s.k(configuration, "configuration");
        s.k(application, "application");
        s.k(componentCallback, "componentCallback");
        return g(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, paymentMethod, ud.d.b(configuration), application, componentCallback, order, key);
    }

    public boolean i(PaymentMethod paymentMethod) {
        s.k(paymentMethod, "paymentMethod");
        return v.g0(ud.a.f116107z, paymentMethod.getType());
    }

    public /* synthetic */ a(DropInOverrideParams dropInOverrideParams, AnalyticsManager analyticsManager, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : dropInOverrideParams, (i11 & 2) != 0 ? null : analyticsManager, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }
}
