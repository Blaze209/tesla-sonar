package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.selfie.SelfieCustomizationConfig;
import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Y2 implements Qs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29800b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z2 f29801a = new Z2();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements OnProductCompleted {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OnProductCompleted f29802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y2 f29803b;

        b(OnProductCompleted onProductCompleted, Y2 y11) {
            this.f29802a = onProductCompleted;
            this.f29803b = y11;
        }

        @Override // com.fourthline.orca.core.OnProductCompleted
        public final void onResult(Object obj) {
            this.f29802a.onResult(this.f29803b.f29801a.a(obj));
        }
    }

    @Override // com.fourthline.orca.internal.Qs
    public InterfaceC3910uo a(XE networkConfig, C3619nx productConfig, SelfieCustomizationConfig productCustomization, Map customFields, OnProductCompleted onProductCompleted) {
        p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
        p013kotlin.jvm.internal.s.k(productConfig, "productConfig");
        p013kotlin.jvm.internal.s.k(productCustomization, "productCustomization");
        p013kotlin.jvm.internal.s.k(customFields, "customFields");
        p013kotlin.jvm.internal.s.k(onProductCompleted, "onProductCompleted");
        W5.c cVarA = W5.a();
        Object obj = customFields.get("tenantConfig");
        WorkflowConfigurationResponse workflowConfigurationResponse = obj instanceof WorkflowConfigurationResponse ? (WorkflowConfigurationResponse) obj : null;
        if (workflowConfigurationResponse != null) {
            InterfaceC3355hp interfaceC3355hpA = cVarA.a(new C3662ox(productConfig, productCustomization, new b(onProductCompleted, this), workflowConfigurationResponse, networkConfig)).a();
            p013kotlin.jvm.internal.s.j(interfaceC3355hpA, "build(...)");
            return interfaceC3355hpA;
        }
        throw new IllegalStateException("FL developer error. Config should always be provided");
    }
}
