package qd;

import android.app.Application;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.s0;
import be.d;
import ce.e;
import ce.q;
import ch.qos.logback.core.joran.action.Action;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import com.adyen.checkout.components.core.internal.ui.model.DropInOverrideParams;
import com.adyen.checkout.components.core.paymentmethod.BlikPaymentMethod;
import com.adyen.checkout.components.core.paymentmethod.MBWayPaymentMethod;
import com.adyen.checkout.core.internal.util.LocaleProvider;
import ezvcard.property.Kind;
import java.util.List;
import jn0.h0;
import ke.GenericComponentParams;
import ke.g;
import le.j;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001$B+\b\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 JI\u0010\"\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lqd/a;", "Lie/a;", "Lod/a;", "Lod/b;", "Lrd/b;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lxa/d;", "savedStateRegistryOwner", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", Kind.APPLICATION, "Lbe/d;", "checkoutConfiguration", "Lbe/a;", "callback", "", Action.KEY_ATTRIBUTE, "e", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lbe/d;Lbe/a;Ljava/lang/String;)Lod/a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "g", "(Lbe/d;Landroidx/lifecycle/s0;Landroid/app/Application;)Lrd/b;", "configuration", "f", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lod/b;Lbe/a;Ljava/lang/String;)Lod/a;", "a", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "b", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "c", "await_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements ie.a<od.a, od.b, rd.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f105342d = v.p(BlikPaymentMethod.PAYMENT_METHOD_TYPE, MBWayPaymentMethod.PAYMENT_METHOD_TYPE, "upi_collect", "upi_intent");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocaleProvider localeProvider;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lce/b;", "it", "Ljn0/h0;", "a", "(Lce/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<ce.b, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ od.a f105345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ be.a f105346d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(od.a aVar, be.a aVar2) {
            super(1);
            this.f105345c = aVar;
            this.f105346d = aVar2;
        }

        public final void a(ce.b it) {
            s.k(it, "it");
            this.f105345c.f().a(it, this.f105346d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(ce.b bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "savedStateHandle", "Lod/a;", "a", "(Landroidx/lifecycle/s0;)Lod/a;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements l<s0, od.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f105348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Application f105349e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, Application application) {
            super(1);
            this.f105348d = dVar;
            this.f105349e = application;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final od.a invoke(s0 savedStateHandle) {
            s.k(savedStateHandle, "savedStateHandle");
            return new od.a(a.this.b(this.f105348d, savedStateHandle, this.f105349e), new ce.l());
        }
    }

    public a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider) {
        s.k(localeProvider, "localeProvider");
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    @Override // ie.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public od.a c(ComponentActivity componentActivity, od.b bVar, be.a aVar, String str) {
        return (od.a) ie.a.C1635a.a(this, componentActivity, bVar, aVar, str);
    }

    public od.a e(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, Application application, d checkoutConfiguration, be.a callback, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(application, "application");
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(callback, "callback");
        od.a aVar = (od.a) j.a(new ViewModelProvider(viewModelStoreOwner, j.b(savedStateRegistryOwner, null, new c(checkoutConfiguration, application))), key, od.a.class);
        aVar.h(lifecycleOwner, new b(aVar, callback));
        return aVar;
    }

    @Override // ie.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public od.a a(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, Application application, od.b configuration, be.a callback, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(application, "application");
        s.k(configuration, "configuration");
        s.k(callback, "callback");
        return e(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, application, od.c.a(configuration), callback, key);
    }

    @Override // ie.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public rd.b b(d checkoutConfiguration, s0 savedStateHandle, Application application) {
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(savedStateHandle, "savedStateHandle");
        s.k(application, "application");
        GenericComponentParams genericComponentParamsA = new ke.l(new g()).a(checkoutConfiguration, this.localeProvider.a(application), null, null);
        he.b bVar = new he.b(new he.d(ne.c.f93890a.b(genericComponentParamsA.getEnvironment())), genericComponentParamsA.getClientKey(), null, null, 12, null);
        return new rd.d(new e(null, 1, null), savedStateHandle, genericComponentParamsA, new jf.a(), bVar, new q(savedStateHandle), this.analyticsManager);
    }

    public /* synthetic */ a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : analyticsManager, (i11 & 2) != 0 ? null : dropInOverrideParams, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }
}
