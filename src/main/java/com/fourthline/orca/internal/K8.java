package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.NfcScannerComposableKt;
import com.fourthline.vision.document.DocumentScannerResult;
import java.util.Date;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class K8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26553b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f26554c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3085bb f26555a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MA.values().length];
            try {
                iArr[MA.NLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MA.ITA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MA.ESP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DocumentType.values().length];
            try {
                iArr2[DocumentType.FRENCH_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public K8(C3085bb flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f26555a = flowConfig;
    }

    public final C3085bb a(C4104z8 dataBundle) {
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        C3085bb c3085bb = this.f26555a;
        dataBundle.a(c3085bb.e().a());
        return c3085bb;
    }

    public final InterfaceC3289g8 b(InterfaceC3546m9 documentFlowRepository) {
        p013kotlin.jvm.internal.s.k(documentFlowRepository, "documentFlowRepository");
        return documentFlowRepository;
    }

    public final Ms c() {
        return new Ms();
    }

    public final List d() {
        return this.f26555a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(C4104z8 c4104z8) {
        List<MrtdMrzInfoValidationError> validationErrors;
        if (c4104z8.j() != null) {
            return true;
        }
        DocumentScannerResult documentScannerResultB = c4104z8.b();
        MrzInfo mrzInfo = documentScannerResultB != null ? documentScannerResultB.getMrzInfo() : null;
        MrtdMrzInfo mrtdMrzInfo = mrzInfo instanceof MrtdMrzInfo ? (MrtdMrzInfo) mrzInfo : null;
        return (mrtdMrzInfo == null || (validationErrors = mrtdMrzInfo.getValidationErrors()) == null) ? false : validationErrors.isEmpty();
    }

    public final DocumentAnalysisConfig a() {
        return this.f26555a.b();
    }

    public final ED b(C3931v8 flowActionProvider, C3803s9 uploadDataRequestsBuilder, Vf dataWorkManager, C3846t9 whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(K8 k11, InterfaceC4124zm interfaceC4124zm, C4104z8 c4104z8, wn0.a aVar) {
        return !k11.f26555a.g().getEnabled() || interfaceC4124zm.a(c4104z8.h()) || ((Boolean) aVar.invoke()).booleanValue();
    }

    public final InterfaceC3546m9 a(C4104z8 bundle, Kp personBundle, E6 deviceDataBundle, Cm nfcResultToBundleMapper, InterfaceC4124zm nfcCanFlowUseCase, boolean z11) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(nfcResultToBundleMapper, "nfcResultToBundleMapper");
        p013kotlin.jvm.internal.s.k(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        return new C3589n9(this.f26555a, bundle, personBundle, deviceDataBundle, nfcResultToBundleMapper, nfcCanFlowUseCase.a(bundle.h()), this.f26555a.j(), this.f26555a.k().getBitrate(), z11);
    }

    public final C3553ma b(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3553ma(tracker);
    }

    public final wn0.a b(final C4104z8 bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new wn0.a() { // from class: com.fourthline.orca.internal.ch0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(K8.c(bundle));
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    public final C4093yy a(C4104z8 documentFlowDataBundle, InterfaceC3429jf extractTinResultRepository) {
        List listM;
        InterfaceC3463kC ik2;
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        p013kotlin.jvm.internal.s.k(extractTinResultRepository, "extractTinResultRepository");
        G5 g5H = documentFlowDataBundle.h();
        MA ma2 = null;
        String strC = g5H != null ? g5H.c() : null;
        if (strC != null) {
            int iHashCode = strC.hashCode();
            if (iHashCode != 68962) {
                if (iHashCode != 72822) {
                    if (iHashCode == 77382 && strC.equals("NLD")) {
                        ma2 = MA.NLD;
                    }
                } else if (strC.equals("ITA")) {
                    ma2 = MA.ITA;
                }
            } else if (strC.equals("ESP")) {
                ma2 = MA.ESP;
            }
        }
        if (ma2 != null) {
            wn0.l lVar = new wn0.l() { // from class: com.fourthline.orca.internal.ah0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(K8.a((Gz) obj));
                }
            };
            int i11 = b.$EnumSwitchMapping$0[ma2.ordinal()];
            if (i11 == 1) {
                ik2 = new Ik();
            } else if (i11 == 2) {
                ik2 = new Di();
            } else if (i11 == 3) {
                ik2 = new Ky();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            listM = p013kotlin.collections.v.e(new Cif(ma2, extractTinResultRepository, lVar, ik2));
            if (listM == null) {
                listM = p013kotlin.collections.v.m();
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        return new C4093yy(listM);
    }

    public final InterfaceC4124zm b() {
        return new InterfaceC4124zm() { // from class: com.fourthline.orca.internal.eh0
            @Override // com.fourthline.orca.internal.InterfaceC4124zm
            public final boolean a(G5 g11) {
                return K8.a(this.f31438a, g11);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Gz stepResultConfirmation) {
        p013kotlin.jvm.internal.s.k(stepResultConfirmation, "stepResultConfirmation");
        String strB = stepResultConfirmation.b();
        if (p013kotlin.jvm.internal.s.f(strB, "NLD")) {
            return stepResultConfirmation.a() == DocumentType.ID_CARD && stepResultConfirmation.c().getFileSide() == DocumentFileSide.BACK;
        }
        return p013kotlin.jvm.internal.s.f(strB, "ITA") && stepResultConfirmation.a() == DocumentType.ID_CARD && stepResultConfirmation.c().getFileSide() == DocumentFileSide.BACK;
    }

    public final InterfaceC4066yD a(wn0.a workflowIdProvider, C4104z8 dataBundle, Vf dataWorkManager) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        return new C3598nc(workflowIdProvider, dataBundle, dataWorkManager);
    }

    public final C3846t9 a(On nfcScannerVideosWorker, final C4104z8 dataBundle, InterfaceC3645og delegate, final InterfaceC4124zm nfcCanFlowUseCase, final wn0.a skipNfcScannerUseCase) {
        p013kotlin.jvm.internal.s.k(nfcScannerVideosWorker, "nfcScannerVideosWorker");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        p013kotlin.jvm.internal.s.k(skipNfcScannerUseCase, "skipNfcScannerUseCase");
        return new C3846t9(nfcScannerVideosWorker, this.f26555a, delegate, new wn0.a() { // from class: com.fourthline.orca.internal.fh0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(K8.a(this.f31759a, nfcCanFlowUseCase, dataBundle, skipNfcScannerUseCase));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(K8 k11, InterfaceC4124zm interfaceC4124zm, C4104z8 c4104z8, wn0.a aVar) {
        return !k11.f26555a.g().getEnabled() || interfaceC4124zm.a(c4104z8.h()) || ((Boolean) aVar.invoke()).booleanValue();
    }

    public final On a(Context context, X3 cdnUrlDownloadWorker, InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new C3650ol(cdnUrlDownloadWorker, ContextExtensionsKt.getAssetsFourthlineDirectory(context), mainRepository.e());
    }

    public final C3803s9 a(wn0.a workflowIdProvider, C4104z8 dataBundle, Kp personBundle, XA tinBundle, C3208eD skipNationalityUseCase, C3208eD skipPersonDetailsUseCase, C3208eD tinBundleIsValidUseCase) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        p013kotlin.jvm.internal.s.k(skipNationalityUseCase, "skipNationalityUseCase");
        p013kotlin.jvm.internal.s.k(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        p013kotlin.jvm.internal.s.k(tinBundleIsValidUseCase, "tinBundleIsValidUseCase");
        return new C3803s9(workflowIdProvider, dataBundle, personBundle, tinBundle, skipNationalityUseCase, skipPersonDetailsUseCase, tinBundleIsValidUseCase);
    }

    public final InterfaceC3429jf a(XA tinBundle) {
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        return new C3472kf(tinBundle);
    }

    public final wn0.a a(final C4104z8 bundle, final Kp personBundle, final Context context) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(context, "context");
        return new wn0.a() { // from class: com.fourthline.orca.internal.dh0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(K8.a(this.f31185a, bundle, personBundle, context));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(K8 k11, C4104z8 c4104z8, Kp kp2, Context context) {
        Gw gw2 = new Gw();
        boolean enabled = k11.f26555a.g().getEnabled();
        X7 x7O = c4104z8.o();
        Date dateB = x7O != null ? x7O.b() : null;
        Date dateB2 = c4104z8.g().b();
        X7 x7O2 = c4104z8.o();
        DocumentType documentTypeC = x7O2 != null ? x7O2.c() : null;
        return (enabled && NfcScannerComposableKt.isNfcSupported(context) && ((documentTypeC == null ? -1 : b.$EnumSwitchMapping$1[documentTypeC.ordinal()]) != 1 && dateB2 != null && dateB != null && dateB2.compareTo(dateB) >= 0) && (gw2.a(c4104z8, kp2) != null)) ? false : true;
    }

    public final C3931v8 a(InterfaceC3051ak mainRepository, final C4104z8 dataBundle, wn0.a skipDocumentDetailsUseCase, final InterfaceC4124zm nfcCanFlowUseCase, final wn0.a skipNfcScannerUseCase, InterfaceC3546m9 flowRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(skipDocumentDetailsUseCase, "skipDocumentDetailsUseCase");
        p013kotlin.jvm.internal.s.k(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        p013kotlin.jvm.internal.s.k(skipNfcScannerUseCase, "skipNfcScannerUseCase");
        p013kotlin.jvm.internal.s.k(flowRepository, "flowRepository");
        return new C3931v8(AbstractC3094bk.a(mainRepository), this.f26555a, dataBundle, skipDocumentDetailsUseCase, new wn0.a() { // from class: com.fourthline.orca.internal.zg0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(K8.b(this.f37273a, nfcCanFlowUseCase, dataBundle, skipNfcScannerUseCase));
            }
        }, flowRepository);
    }

    public final C3896ua a(C4061y8 flowCoordinator, C3853ta stateProvider, C3553ma analytics) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        return new C3896ua(new C3520lk(stateProvider), flowCoordinator, analytics);
    }

    public final C3853ta a(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3853ta(lottieServiceLocator.a(Tj.DocumentReady), imageServiceLocator);
    }

    public final C3459k8 a(C4061y8 flowCoordinator, InterfaceC3546m9 repository, InterfaceC3375i8 stateProvider, Y7 analytics, TimestampProvider timestampProvider, ED viewCompletionHandler, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C3459k8(new C3520lk(stateProvider), flowCoordinator, repository, stateProvider, analytics, timestampProvider, viewCompletionHandler, popupHandler, coroutineScope);
    }

    public final ED a(C3931v8 flowActionProvider, C3803s9 uploadDataRequestsBuilder, Vf dataWorkManager, C3846t9 whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(uploadDataRequestsBuilder, "uploadDataRequestsBuilder");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadDataRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final Z7 a(InterfaceC3546m9 repository) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        return new C2868Fc(repository);
    }

    public final Y7 a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Y7(tracker);
    }

    public final InterfaceC3375i8 a(InterfaceC3732qh imageServiceLocator, InterfaceC3289g8 repository, Z7 contentProvider, Nf dateFormatter, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(contentProvider, "contentProvider");
        p013kotlin.jvm.internal.s.k(dateFormatter, "dateFormatter");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C4059y6(new Kh(tracker), repository, imageServiceLocator, contentProvider, dateFormatter, new wn0.a() { // from class: com.fourthline.orca.internal.bh0
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(K8.a(this.f30654a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(K8 k11) {
        return k11.f26555a.f();
    }

    public final C4061y8 a(InterfaceC3863tk navigationChannel, final wn0.a nfcSupportedUseCase, wn0.a skipDocumentDetailsUseCase, final InterfaceC4124zm nfcCanFlowUseCase, final Fp permissionChecker, InterfaceC4044xs popupHandler, C3392ik analyticsContext, final C4104z8 documentFlowDataBundle) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(nfcSupportedUseCase, "nfcSupportedUseCase");
        p013kotlin.jvm.internal.s.k(skipDocumentDetailsUseCase, "skipDocumentDetailsUseCase");
        p013kotlin.jvm.internal.s.k(nfcCanFlowUseCase, "nfcCanFlowUseCase");
        p013kotlin.jvm.internal.s.k(permissionChecker, "permissionChecker");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        return new C4061y8(navigationChannel, new wn0.a() { // from class: com.fourthline.orca.internal.xg0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(K8.a(nfcCanFlowUseCase, documentFlowDataBundle, nfcSupportedUseCase));
            }
        }, skipDocumentDetailsUseCase, new wn0.a() { // from class: com.fourthline.orca.internal.yg0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(K8.a(permissionChecker));
            }
        }, popupHandler, analyticsContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(InterfaceC4124zm interfaceC4124zm, C4104z8 c4104z8, wn0.a aVar) {
        return interfaceC4124zm.a(c4104z8.h()) && ((Boolean) aVar.invoke()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Fp fp2) {
        return !fp2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(K8 k11, G5 g11) {
        String strC;
        if (k11.f26555a.g().getEnabled()) {
            if ((g11 == null || (strC = g11.c()) == null) ? false : strC.equals("ESP")) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceC3019Za a(InterfaceC3546m9 repository, C4104z8 dataBundle) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        if (repository.c()) {
            return new Ey(repository.t(), dataBundle);
        }
        return new C4102z6();
    }
}
