package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.networking.NetworkEnvironmentKt;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.workflow.WorkflowConfig;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import java.util.List;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class If implements InterfaceC3051ak, InterfaceC3552mF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WorkflowConfig f26297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WorkflowDataDelegate f26298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OrcaFlavor f26299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PE f26300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MutableStateFlow f26301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final StateFlow f26302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f26304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Rf f26305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f26306j;

    public If(WorkflowConfig workflowConfig, WorkflowDataDelegate workflowDataDelegate, OrcaFlavor flavor) {
        p013kotlin.jvm.internal.s.k(workflowConfig, "workflowConfig");
        p013kotlin.jvm.internal.s.k(flavor, "flavor");
        this.f26297a = workflowConfig;
        this.f26298b = workflowDataDelegate;
        this.f26299c = flavor;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new DeviceDataCollection(false, 0L, (DeviceDataCollection.Depth) null, (DeviceDataCollection.Motion) null, (DeviceDataCollection.Environment) null, (DeviceDataCollection.Gps) null, (DeviceDataCollection.Cellular) null, (DeviceDataCollection.Network) null, (DeviceDataCollection.Hardware) null, (DeviceDataCollection.Screen) null, (DeviceDataCollection.Battery) null, (DeviceDataCollection.Locale) null, (DeviceDataCollection.System) null, 8190, (DefaultConstructorMarker) null));
        this.f26301e = MutableStateFlow;
        this.f26302f = FlowKt.asStateFlow(MutableStateFlow);
        this.f26303g = AnalyticsAttribute.NotAvailable;
        this.f26304h = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.fe0
            @Override // wn0.a
            public final Object invoke() {
                return If.a(this.f31737a);
            }
        });
        this.f26305i = new C3680pE();
        this.f26306j = NetworkEnvironmentKt.orcaShouldUseStubs(workflowConfig.getNetworkEnvironment());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowConfigurationResponse a(If r11) {
        PE pe2 = r11.f26300d;
        if (pe2 != null) {
            return pe2.e();
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + pe2 + " must not be null."))).toString());
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public DeviceDataCollection c() {
        WorkflowConfigurationResponse workflowConfigurationResponseE;
        WorkflowConfigurationTenantSettings tenant;
        DeviceDataCollection deviceDataCollection;
        PE pe2 = this.f26300d;
        return (pe2 == null || (workflowConfigurationResponseE = pe2.e()) == null || (tenant = workflowConfigurationResponseE.getTenant()) == null || (deviceDataCollection = tenant.getDeviceDataCollection()) == null) ? new DeviceDataCollection(false, 0L, (DeviceDataCollection.Depth) null, (DeviceDataCollection.Motion) null, (DeviceDataCollection.Environment) null, (DeviceDataCollection.Gps) null, (DeviceDataCollection.Cellular) null, (DeviceDataCollection.Network) null, (DeviceDataCollection.Hardware) null, (DeviceDataCollection.Screen) null, (DeviceDataCollection.Battery) null, (DeviceDataCollection.Locale) null, (DeviceDataCollection.System) null, 8190, (DefaultConstructorMarker) null) : deviceDataCollection;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public Rf d() {
        return this.f26305i;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public WorkflowConfigurationResponse e() {
        return (WorkflowConfigurationResponse) this.f26304h.getValue();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public XE f() {
        PE pe2 = this.f26300d;
        if (pe2 != null) {
            return pe2.c();
        }
        return null;
    }

    public final StateFlow g() {
        return this.f26302f;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public OrcaFlavor getFlavor() {
        return this.f26299c;
    }

    public final C3724qF h() {
        PE pe2 = this.f26300d;
        if (pe2 != null) {
            return pe2.d();
        }
        return null;
    }

    public final String i() {
        List<UE> listB;
        PE pe2 = this.f26300d;
        if (pe2 == null || (listB = pe2.b()) == null) {
            return null;
        }
        for (UE ue2 : listB) {
            if (ue2 instanceof UE.a) {
                return ((UE.a) ue2).a();
            }
        }
        return null;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public WorkflowDataDelegate b() {
        return this.f26298b;
    }

    public void a(Rf rf2) {
        p013kotlin.jvm.internal.s.k(rf2, "<set-?>");
        this.f26305i = rf2;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3552mF
    public void a(PE session) {
        p013kotlin.jvm.internal.s.k(session, "session");
        this.f26300d = session;
        this.f26301e.setValue(session.e().getTenant().getDeviceDataCollection());
        Rf rfA = session.a();
        if (rfA != null) {
            a(rfA);
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3051ak
    public boolean a() {
        return this.f26306j;
    }
}
