package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class BB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3848tB f25079a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MA.values().length];
            try {
                iArr[MA.ESP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MA.ITA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MA.NLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BB(C3848tB flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f25079a = flowConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Gz it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final G5 c(C4104z8 c4104z8) {
        return c4104z8.h();
    }

    public final Dy d(C4104z8 documentFlowDataBundle) {
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        Boolean isTinCaptureRequired = this.f25079a.getIsTinCaptureRequired();
        if (isTinCaptureRequired != null) {
            return new Ow(isTinCaptureRequired.booleanValue());
        }
        int i11 = a.$EnumSwitchMapping$0[this.f25079a.getTaxationCountry().ordinal()];
        if (i11 == 1) {
            return new Hy();
        }
        if (i11 == 2) {
            return new Ci();
        }
        if (i11 == 3) {
            return new Hk(documentFlowDataBundle.g());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b() {
        return 18;
    }

    public final Cy a(final C4104z8 documentFlowDataBundle, Dy skipDocumentScannerUseCaseEvaluator) {
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        p013kotlin.jvm.internal.s.k(skipDocumentScannerUseCaseEvaluator, "skipDocumentScannerUseCaseEvaluator");
        return new Cy(this.f25079a, documentFlowDataBundle.g(), new wn0.a() { // from class: com.fourthline.orca.internal.x00
            @Override // wn0.a
            public final Object invoke() {
                return BB.c(documentFlowDataBundle);
            }
        }, skipDocumentScannerUseCaseEvaluator);
    }

    public final InterfaceC3462kB c(XA tinBundle) {
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        return new C3505lB(tinBundle);
    }

    public final InterfaceC3463kC e() {
        int i11 = a.$EnumSwitchMapping$0[this.f25079a.getTaxationCountry().ordinal()];
        if (i11 == 1) {
            return new Ky();
        }
        if (i11 == 2) {
            return new Di();
        }
        if (i11 == 3) {
            return new Ik();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C3092bi b(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3092bi("tin", tracker);
    }

    public final AbstractC3292gB c() {
        int i11 = a.$EnumSwitchMapping$0[this.f25079a.getTaxationCountry().ordinal()];
        if (i11 == 1) {
            return AbstractC3292gB.a.f31973g;
        }
        if (i11 == 2) {
            return AbstractC3292gB.b.f31974g;
        }
        if (i11 == 3) {
            return AbstractC3292gB.c.f31975g;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC3335hB b(XA tinBundle) {
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        return new C3378iB(this.f25079a.getTaxationCountry(), tinBundle.c());
    }

    public final Gy a(C3208eD tinBundleIsValidUseCase) {
        p013kotlin.jvm.internal.s.k(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        return new Gy(tinBundleIsValidUseCase);
    }

    public final C3891uB a(InterfaceC3863tk navigationChannel, BC updateTinFromDocumentBundleUseCase, final Cy skipDocumentScannerUseCase, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(updateTinFromDocumentBundleUseCase, "updateTinFromDocumentBundleUseCase");
        p013kotlin.jvm.internal.s.k(skipDocumentScannerUseCase, "skipDocumentScannerUseCase");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        updateTinFromDocumentBundleUseCase.b(this.f25079a.getTaxationCountry());
        return new C3891uB(navigationChannel, new wn0.a() { // from class: com.fourthline.orca.internal.y00
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(BB.a(skipDocumentScannerUseCase));
            }
        }, popupHandlerBuilder.a(new T3(null, imageServiceLocator, 1, null)));
    }

    public final C3341hb b(C4104z8 documentFlowDataBundle) {
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        return new C3341hb(documentFlowDataBundle.n(), DocumentType.TIN_REFERENCE_DOCUMENT);
    }

    public final Oi c(C3934vB flowCoordinator) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        return new Oi(flowCoordinator);
    }

    public final C3720qB d() {
        return new C3720qB(this.f25079a.getTaxationCountry());
    }

    public final Ni b(C3934vB flowCoordinator) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        return new Ni(flowCoordinator);
    }

    public final C3014Ya b(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3014Ya(false, imageServiceLocator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Cy cy2) {
        return cy2.a();
    }

    public final C3934vB a(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        return new C3934vB(navigationChannel);
    }

    public final C3991wi a(C3092bi analytics, C3891uB flowCoordinator, Uj lottieServiceLocator) {
        InterfaceC3947vi jy2;
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        Yj yjA = lottieServiceLocator.a(Tj.TinIntro);
        int i11 = a.$EnumSwitchMapping$0[this.f25079a.getTaxationCountry().ordinal()];
        if (i11 == 1) {
            jy2 = new Jy(yjA);
        } else if (i11 == 2) {
            jy2 = new Bi(yjA);
        } else if (i11 == 3) {
            jy2 = new Gk(yjA);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC3947vi interfaceC3947vi = jy2;
        return new C3991wi(analytics, new C3520lk(interfaceC3947vi), interfaceC3947vi, flowCoordinator, C4107zB.f37236a, null, null, 96, null);
    }

    public final C3677pB a() {
        return new C3677pB(this.f25079a.getTaxationCountry());
    }

    public final InterfaceC3429jf a(XA tinBundle) {
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        return new C3472kf(tinBundle);
    }

    public final C4093yy a(InterfaceC3429jf extractTinResultRepository) {
        InterfaceC3463kC ky2;
        Cif cif;
        p013kotlin.jvm.internal.s.k(extractTinResultRepository, "extractTinResultRepository");
        MA taxationCountry = this.f25079a.getTaxationCountry();
        int[] iArr = a.$EnumSwitchMapping$0;
        int i11 = iArr[taxationCountry.ordinal()];
        if (i11 == 2 || i11 == 3) {
            wn0.l lVar = new wn0.l() { // from class: com.fourthline.orca.internal.v00
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BB.a((Gz) obj));
                }
            };
            int i12 = iArr[taxationCountry.ordinal()];
            if (i12 == 1) {
                ky2 = new Ky();
            } else if (i12 == 2) {
                ky2 = new Di();
            } else if (i12 == 3) {
                ky2 = new Ik();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            cif = new Cif(taxationCountry, extractTinResultRepository, lVar, ky2);
        } else {
            cif = null;
        }
        return new C4093yy(p013kotlin.collections.v.q(cif));
    }

    public final ED a(C3336hC flowActionProvider, C4064yB uploadDataRequestsBuilder, Vf dataWorkManager, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final C3336hC a(InterfaceC3051ak mainRepository, Gy skipTinDetailsUseCase) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(skipTinDetailsUseCase, "skipTinDetailsUseCase");
        return new C3336hC(AbstractC3094bk.a(mainRepository), skipTinDetailsUseCase);
    }

    public final YA a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new YA(AbstractC3094bk.a(mainRepository));
    }

    public final BC a(XA tinBundle, C4104z8 documentFlowDataBundle) {
        Set setI;
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        int i11 = a.$EnumSwitchMapping$0[this.f25079a.getTaxationCountry().ordinal()];
        if (i11 == 1) {
            setI = p013kotlin.collections.d1.i(DocumentType.ID_CARD, DocumentType.RESIDENCE_PERMIT);
        } else if (i11 != 3) {
            setI = p013kotlin.collections.d1.d();
        } else {
            setI = p013kotlin.collections.d1.i(DocumentType.ID_CARD, DocumentType.PASSPORT);
        }
        return new BC(tinBundle, documentFlowDataBundle, setI);
    }

    public final C3591nB a(Cy skipDocumentScannerUseCase, InterfaceC3335hB repository, InterfaceC3463kC tinValidator, AbstractC3292gB tinSpecifics, InterfaceC3732qh imageServiceLocator, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(skipDocumentScannerUseCase, "skipDocumentScannerUseCase");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(tinValidator, "tinValidator");
        p013kotlin.jvm.internal.s.k(tinSpecifics, "tinSpecifics");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3591nB(new Kh(tracker), tinSpecifics, imageServiceLocator, skipDocumentScannerUseCase.a(), repository.b(), tinValidator);
    }

    public final C3634oB a(C3591nB stateProvider, ZA analytics, InterfaceC3335hB repository, InterfaceC3462kB resultRepository, C3891uB flowCoordinator, InterfaceC3463kC tinValidator, ED viewCompletionHandler, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(tinValidator, "tinValidator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C3634oB(repository, stateProvider, resultRepository, analytics, flowCoordinator, viewCompletionHandler, tinValidator, new C2874Gc(coroutineScope), new C3520lk(stateProvider), popupHandler, coroutineScope);
    }

    public final ED a(YA flowActionProvider, C4064yB uploadDataRequestsBuilder, Vf dataWorkManager, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final C4064yB a(wn0.a workflowIdProvider, XA tinBundle, C4104z8 documentBundle) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        p013kotlin.jvm.internal.s.k(documentBundle, "documentBundle");
        return new C4064yB(workflowIdProvider, tinBundle, documentBundle);
    }

    public final ZA a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new ZA(tracker);
    }

    public final C3255fb a(C4104z8 documentFlowDataBundle) {
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        return new C3255fb(new DocumentScannerConfig(DocumentType.TIN_REFERENCE_DOCUMENT, false, false, false, null, null, null, null, 0L, false, 1018, null), documentFlowDataBundle.h(), false, false, false, false, false, 0.8d, this.f25079a.getCameraX().getEnabled(), null, null, 1120, null);
    }

    public final Pi a(C3934vB scannerCoordinator) {
        p013kotlin.jvm.internal.s.k(scannerCoordinator, "scannerCoordinator");
        return new Pi(scannerCoordinator);
    }

    public final C3297ga a(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3297ga(true, new wn0.a() { // from class: com.fourthline.orca.internal.w00
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(BB.b());
            }
        }, imageServiceLocator);
    }
}
