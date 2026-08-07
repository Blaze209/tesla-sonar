package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.OrcaKt;
import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.core.ProductConfig;
import com.fourthline.orca.core.ProductCustomization;
import com.fourthline.orca.core.internal.activity.OrcaActivity;
import com.fourthline.orca.workflow.DocumentComponentConfig;
import com.fourthline.orca.workflow.WorkflowConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class D6 implements Ss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Qs f25316a;

    static final class a implements OnProductCompleted {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ OnProductCompleted f25317a;

        a(OnProductCompleted onProductCompleted) {
            this.f25317a = onProductCompleted;
        }

        @Override // com.fourthline.orca.core.OnProductCompleted
        public final void onResult(Object obj) {
            this.f25317a.onResult(obj);
        }
    }

    public D6(Qs componentBuilder) {
        p013kotlin.jvm.internal.s.k(componentBuilder, "componentBuilder");
        this.f25316a = componentBuilder;
    }

    @Override // com.fourthline.orca.internal.Ss
    public void a(Context context, XE networkConfig, ProductConfig productConfig, ProductCustomization productCustomization, Map customFields, OnProductCompleted onProductCompleted) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(networkConfig, "networkConfig");
        p013kotlin.jvm.internal.s.k(productConfig, "productConfig");
        p013kotlin.jvm.internal.s.k(productCustomization, "productCustomization");
        p013kotlin.jvm.internal.s.k(customFields, "customFields");
        p013kotlin.jvm.internal.s.k(onProductCompleted, "onProductCompleted");
        InterfaceC3910uo interfaceC3910uoA = this.f25316a.a(networkConfig, productConfig, productCustomization, customFields, new a(onProductCompleted));
        if (interfaceC3910uoA != null) {
            OrcaActivity.Companion companion = OrcaActivity.INSTANCE;
            companion.a(interfaceC3910uoA);
            companion.a(a(productConfig));
            OrcaKt.launchOrca(context, a(productConfig));
        }
    }

    private final String a(ProductConfig productConfig) {
        if (productConfig instanceof WorkflowConfig) {
            return "workflowSession";
        }
        if (productConfig instanceof DocumentComponentConfig) {
            return "documentComponent";
        }
        if (productConfig instanceof C3619nx) {
            return "selfieComponent";
        }
        String simpleName = productConfig.getClass().getSimpleName();
        p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
