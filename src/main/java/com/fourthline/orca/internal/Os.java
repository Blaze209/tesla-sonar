package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.core.DeviceMetadataKt;
import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.core.ProductCustomizationStep;
import com.fourthline.orca.core.ProductPresentationStep;
import com.fourthline.orca.workflow.WorkflowConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public class Os implements ProductCustomizationStep, ProductPresentationStep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProductConfig f27216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ss f27217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final XE f27218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3626o3 f27219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f27220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ProductCustomization f27221g;

    public static final class a implements InterfaceC3626o3 {
        a() {
        }

        @Override // com.fourthline.orca.internal.InterfaceC3626o3
        public void onProductFailed(Throwable th2) {
            InterfaceC3626o3.a.a((InterfaceC3626o3) this, th2);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3626o3
        public void onProductStart(ProductConfig productConfig, ProductCustomization productCustomization) {
            InterfaceC3626o3.a.a(this, productConfig, productCustomization);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3626o3
        public void onProductSuccess(Object obj) {
            InterfaceC3626o3.a.a(this, obj);
        }

        @Override // com.fourthline.orca.internal.InterfaceC3354ho
        public void track(InterfaceC3626o3.b bVar) {
            InterfaceC3626o3.a.a((InterfaceC3626o3) this, bVar);
        }
    }

    static final class b implements OnProductCompleted {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OnProductCompleted f27222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Os f27223b;

        b(OnProductCompleted onProductCompleted, Os os2) {
            this.f27222a = onProductCompleted;
            this.f27223b = os2;
        }

        @Override // com.fourthline.orca.core.OnProductCompleted
        public final void onResult(Object obj) {
            Os os2 = this.f27223b;
            Throwable thE = jn0.s.e(obj);
            if (thE == null) {
                os2.f27219e.track((InterfaceC3626o3.b) new InterfaceC3626o3.b.e(obj, os2.f27216b, os2.f27218d));
            } else {
                os2.f27219e.track((InterfaceC3626o3.b) new InterfaceC3626o3.b.c(thE, os2.f27216b, os2.f27218d));
            }
            this.f27222a.onResult(obj);
        }
    }

    public Os(Context context, ProductConfig productConfig, Ss productLauncher, ProductCustomization defaultCustomization, XE networkConfig, InterfaceC3626o3 analytics) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(productConfig, "productConfig");
        p013kotlin.jvm.internal.s.k(productLauncher, "productLauncher");
        p013kotlin.jvm.internal.s.k(defaultCustomization, "defaultCustomization");
        p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f27215a = context;
        this.f27216b = productConfig;
        this.f27217c = productLauncher;
        this.f27218d = networkConfig;
        this.f27219e = analytics;
        this.f27220f = new LinkedHashMap();
        this.f27221g = defaultCustomization;
        a(networkConfig.a());
    }

    @Override // com.fourthline.orca.core.ProductPresentationStep
    public void present(OnProductCompleted onProductCompleted) {
        p013kotlin.jvm.internal.s.k(onProductCompleted, "onProductCompleted");
        this.f27219e.track((InterfaceC3626o3.b) new InterfaceC3626o3.b.d(this.f27216b, this.f27218d, this.f27221g));
        if (DeviceMetadataKt.isDeviceRooted()) {
            this.f27219e.track((InterfaceC3626o3.b) InterfaceC3626o3.b.C0593b.f34053a);
            jn0.s.Companion companion = jn0.s.INSTANCE;
            onProductCompleted.onResult(jn0.s.b(jn0.t.a(Ps.a(this, this.f27216b, "ProductBuilder.notSupportedOnCompromisedDevice"))));
            return;
        }
        try {
            AbstractC3794s0.a();
            this.f27217c.a(this.f27215a, this.f27218d, this.f27216b, this.f27221g, this.f27220f, new b(onProductCompleted, this));
        } catch (Exception e11) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            onProductCompleted.onResult(jn0.s.b(jn0.t.a(e11)));
        }
    }

    public final void a(String key, Object value) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.f27220f.put(key, value);
    }

    @Override // com.fourthline.orca.core.ProductCustomizationStep
    public ProductPresentationStep customize(ProductCustomization config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        this.f27221g = config;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a(NetworkEnvironment networkEnvironment) {
        if (networkEnvironment instanceof NetworkEnvironment.Mock) {
            int i11 = 1;
            if (((NetworkEnvironment.Mock) networkEnvironment).getActualEnvironment$fourthline_sdk_release() == 1) {
                if (this.f27216b instanceof WorkflowConfig) {
                    FourthlineAnalytics.INSTANCE.setInitialized(false);
                }
                FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
                if (fourthlineAnalytics.getAnalytics() instanceof C3264fk) {
                    return;
                }
                fourthlineAnalytics.setAnalytics(new C3264fk(null, i11, 0 == true ? 1 : 0));
                fourthlineAnalytics.setInitialized(true);
            }
        }
    }

    public /* synthetic */ Os(Context context, ProductConfig productConfig, Ss ss2, ProductCustomization productCustomization, XE xe2, InterfaceC3626o3 interfaceC3626o3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, productConfig, ss2, productCustomization, xe2, (i11 & 32) != 0 ? new a() : interfaceC3626o3);
    }
}
