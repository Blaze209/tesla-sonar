package ld;

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
import com.adyen.threeds2.ThreeDS2Service;
import ezvcard.property.Kind;
import hd.c;
import jn0.h0;
import ke.g;
import kotlinx.coroutines.Dispatchers;
import le.j;
import nd.Adyen3DS2ComponentParams;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 JI\u0010\"\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lld/a;", "Lie/a;", "Lhd/a;", "Lhd/b;", "Lmd/b;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "analyticsManager", "Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "dropInOverrideParams", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "localeProvider", "<init>", "(Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;Lcom/adyen/checkout/core/internal/util/LocaleProvider;)V", "Lxa/d;", "savedStateRegistryOwner", "Landroidx/lifecycle/f1;", "viewModelStoreOwner", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", Kind.APPLICATION, "Lbe/d;", "checkoutConfiguration", "Lbe/a;", "callback", "", Action.KEY_ATTRIBUTE, "e", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lbe/d;Lbe/a;Ljava/lang/String;)Lhd/a;", "Landroidx/lifecycle/s0;", "savedStateHandle", "g", "(Lbe/d;Landroidx/lifecycle/s0;Landroid/app/Application;)Lmd/b;", "configuration", "f", "(Lxa/d;Landroidx/lifecycle/f1;Landroidx/lifecycle/LifecycleOwner;Landroid/app/Application;Lhd/b;Lbe/a;Ljava/lang/String;)Lhd/a;", "a", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "b", "Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements ie.a<hd.a, hd.b, md.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsManager analyticsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final LocaleProvider localeProvider;

    /* JADX INFO: renamed from: ld.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lce/b;", "it", "Ljn0/h0;", "a", "(Lce/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class C1896a extends u implements l<ce.b, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ hd.a f89941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ be.a f89942d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1896a(hd.a aVar, be.a aVar2) {
            super(1);
            this.f89941c = aVar;
            this.f89942d = aVar2;
        }

        public final void a(ce.b it) {
            s.k(it, "it");
            this.f89941c.f().a(it, this.f89942d);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(ce.b bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/s0;", "savedStateHandle", "Lhd/a;", "a", "(Landroidx/lifecycle/s0;)Lhd/a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<s0, hd.a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f89944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Application f89945e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, Application application) {
            super(1);
            this.f89944d = dVar;
            this.f89945e = application;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hd.a invoke(s0 savedStateHandle) {
            s.k(savedStateHandle, "savedStateHandle");
            return new hd.a(a.this.b(this.f89944d, savedStateHandle, this.f89945e), new ce.l());
        }
    }

    public a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider) {
        s.k(localeProvider, "localeProvider");
        this.analyticsManager = analyticsManager;
        this.localeProvider = localeProvider;
    }

    @Override // ie.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public hd.a c(ComponentActivity componentActivity, hd.b bVar, be.a aVar, String str) {
        return (hd.a) ie.a.C1635a.a(this, componentActivity, bVar, aVar, str);
    }

    public hd.a e(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, Application application, d checkoutConfiguration, be.a callback, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(application, "application");
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(callback, "callback");
        hd.a aVar = (hd.a) j.a(new ViewModelProvider(viewModelStoreOwner, j.b(savedStateRegistryOwner, null, new b(checkoutConfiguration, application))), key, hd.a.class);
        aVar.h(lifecycleOwner, new C1896a(aVar, callback));
        return aVar;
    }

    @Override // ie.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public hd.a a(xa.d savedStateRegistryOwner, f1 viewModelStoreOwner, LifecycleOwner lifecycleOwner, Application application, hd.b configuration, be.a callback, String key) {
        s.k(savedStateRegistryOwner, "savedStateRegistryOwner");
        s.k(viewModelStoreOwner, "viewModelStoreOwner");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(application, "application");
        s.k(configuration, "configuration");
        s.k(callback, "callback");
        return e(savedStateRegistryOwner, viewModelStoreOwner, lifecycleOwner, application, c.b(configuration), callback, key);
    }

    @Override // ie.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public md.b b(d checkoutConfiguration, s0 savedStateHandle, Application application) {
        s.k(checkoutConfiguration, "checkoutConfiguration");
        s.k(savedStateHandle, "savedStateHandle");
        s.k(application, "application");
        Adyen3DS2ComponentParams adyen3DS2ComponentParamsA = new nd.b(new g()).a(checkoutConfiguration, this.localeProvider.a(application), null, null);
        jd.a aVar = new jd.a(new jd.b(ne.c.f93890a.b(adyen3DS2ComponentParamsA.getEnvironment()), null, 2, null));
        q qVar = new q(savedStateHandle);
        kd.a aVar2 = new kd.a();
        jf.a aVar3 = new jf.a();
        e eVar = new e(null, 1, null);
        ThreeDS2Service INSTANCE = ThreeDS2Service.INSTANCE;
        s.j(INSTANCE, "INSTANCE");
        return new md.d(eVar, savedStateHandle, adyen3DS2ComponentParamsA, aVar, qVar, aVar2, aVar3, INSTANCE, Dispatchers.getDefault(), application, this.analyticsManager);
    }

    public /* synthetic */ a(AnalyticsManager analyticsManager, DropInOverrideParams dropInOverrideParams, LocaleProvider localeProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : analyticsManager, (i11 & 2) != 0 ? null : dropInOverrideParams, (i11 & 4) != 0 ? new LocaleProvider() : localeProvider);
    }
}
