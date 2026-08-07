package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class Hr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3058ar f26144a;

    public Hr(C3058ar flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f26144a = flowConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d() {
        return 18;
    }

    public final C3255fb a() {
        return new C3255fb(new DocumentScannerConfig(DocumentType.PROOF_OF_ADDRESS, true, false, false, null, null, null, null, 0L, false, 1016, null), null, false, false, true, false, false, 0.8d, this.f26144a.getCameraX().getEnabled(), null, null, 1122, null);
    }

    public final Nq b() {
        return new Nq();
    }

    public final Oq c() {
        return new Oq();
    }

    public final Ni b(Mq scannerCoordinator) {
        p013kotlin.jvm.internal.s.k(scannerCoordinator, "scannerCoordinator");
        return new Ni(scannerCoordinator);
    }

    public final Oi c(Mq flowCoordinator) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        return new Oi(flowCoordinator);
    }

    public final C3014Ya b(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3014Ya(false, imageServiceLocator);
    }

    public final C3341hb a(C4104z8 documentFlowDataBundle) {
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        return new C3341hb(documentFlowDataBundle.n(), DocumentType.PROOF_OF_ADDRESS);
    }

    public final ED a(C3485ks flowActionProvider, C3228er uploadDataRequestsBuilder, Vf dataWorkManager, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final Pi a(Mq scannerCoordinator) {
        p013kotlin.jvm.internal.s.k(scannerCoordinator, "scannerCoordinator");
        return new Pi(scannerCoordinator);
    }

    public final C3297ga a(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3297ga(true, new wn0.a() { // from class: com.fourthline.orca.internal.xd0
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(Hr.d());
            }
        }, imageServiceLocator);
    }

    public final Mq a(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        return new Mq(navigationChannel);
    }
}
