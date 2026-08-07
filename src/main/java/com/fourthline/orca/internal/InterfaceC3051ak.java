package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import com.fourthline.networking.NetworkEnvironmentKt;
import com.fourthline.orca.core.flavor.OrcaFlavor;
import com.fourthline.orca.workflow.WorkflowDataDelegate;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3051ak extends InterfaceC3552mF {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ak$a */
    public static final class a {
        public static void a(InterfaceC3051ak interfaceC3051ak, PE session) {
            p013kotlin.jvm.internal.s.k(session, "session");
        }

        public static boolean b(InterfaceC3051ak interfaceC3051ak) {
            NetworkEnvironment networkEnvironmentA;
            XE xeF = interfaceC3051ak.f();
            return (xeF == null || (networkEnvironmentA = xeF.a()) == null || !NetworkEnvironmentKt.orcaShouldUseStubs(networkEnvironmentA)) ? false : true;
        }

        public static WorkflowDataDelegate c(InterfaceC3051ak interfaceC3051ak) {
            return null;
        }

        public static DeviceDataCollection a(InterfaceC3051ak interfaceC3051ak) {
            return interfaceC3051ak.e().getTenant().getDeviceDataCollection();
        }
    }

    boolean a();

    WorkflowDataDelegate b();

    DeviceDataCollection c();

    Rf d();

    WorkflowConfigurationResponse e();

    XE f();

    OrcaFlavor getFlavor();
}
