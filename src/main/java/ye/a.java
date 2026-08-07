package ye;

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
import com.adyen.checkout.core.internal.util.LocaleProvider;
import ezvcard.property.Kind;
import jn0.h0;
import ke.GenericComponentParams;
import ke.g;
import le.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import ve.c;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 JI\u0010\"\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lye/a;", "Lie/a;", "Lve/a;", "Lve/b;", "Lze/b;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lxa/d;", "savedStateRegistryOwner", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", Kind.APPLICATION, "Lbe/d;", "checkoutConfiguration", "Lbe/a;", "callback", "", Action.KEY_ATTRIBUTE, "e", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lbe/d;Lbe/a;Ljava/lang/String;)Lve/a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "g", "(Lbe/d;Landroidx/lifecycle/s0;Landroid/app/Application;)Lze/b;", "configuration", "f", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lve/b;Lbe/a;Ljava/lang/String;)Lve/a;", "a", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "b", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "qr-code_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements ie.a<ve.a, ve.b, ze.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocaleProvider localeProvider;

    /* JADX INFO: renamed from: ye.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lce/b;", "it", "Ljn0/h0;", "a", "(Lce/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class C2726a extends u implements l<ce.b, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ve.a f125389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ be.a f125390d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2726a(ve.a aVar, be.a aVar2) {
            super(1);
            this.f125389c = aVar;
            this.f125390d = aVar2;
        }

        public final void a(ce.b it) {
            s.k(it, "it");
            this.f125389c.f().a(it, this.f125390d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(ce.b bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "savedStateHandle", "Lve/a;", "a", "(Landroidx/lifecycle/s0;)Lve/a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<s0, ve.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f125392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Application f125393e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, Application application) {
            super(1);
            this.f125392d = dVar;
            this.f125393e = application;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ve.a invoke(s0 savedStateHandle) {
            s.k(savedStateHandle, "savedStateHandle");
            return new ve.a(a.this.b(this.f125392d, savedStateHandle, this.f125393e), new ce.l());
        }
    }

    public a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider) {
        s.k(localeProvider, "localeProvider");
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    @Override // ie.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ve.a c(ComponentActivity componentActivity, ve.b bVar, be.a aVar, String str) {
        return (ve.a) ie.a.C1635a.a(this, componentActivity, bVar, aVar, str);
    }

    public ve.a e(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, Application application, d checkoutConfiguration, be.a callback, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(application, "application");
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(callback, "callback");
        ve.a aVar = (ve.a) j.a(new ViewModelProvider(viewModelStoreOwner, j.b(savedStateRegistryOwner, null, new b(checkoutConfiguration, application))), key, ve.a.class);
        aVar.h(lifecycleOwner, new C2726a(aVar, callback));
        return aVar;
    }

    @Override // ie.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ve.a a(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, Application application, ve.b configuration, be.a callback, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(application, "application");
        s.k(configuration, "configuration");
        s.k(callback, "callback");
        return e(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, application, c.a(configuration), callback, key);
    }

    @Override // ie.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ze.b b(d checkoutConfiguration, s0 savedStateHandle, Application application) {
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(savedStateHandle, "savedStateHandle");
        s.k(application, "application");
        GenericComponentParams genericComponentParamsA = new ke.l(new g()).a(checkoutConfiguration, this.localeProvider.a(application), null, null);
        return new ze.a(new e(null, 1, null), savedStateHandle, genericComponentParamsA, new he.b(new he.d(ne.c.f93890a.b(genericComponentParamsA.getEnvironment())), genericComponentParamsA.getClientKey(), null, null, 12, null), new xe.a(), new jf.a(), new q(savedStateHandle), new nf.c(null, 1, null), this.analyticsManager);
    }

    public /* synthetic */ a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : analyticsManager, (i11 & 2) != 0 ? null : dropInOverrideParams, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }
}
