package com.fourthline.vision.internal;

import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.vision.internal.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4179e2 implements InterfaceC4306w0, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VisionDocumentScannerFeatureConfig f38252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f38253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4234l4 f38254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn0.l f38255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f38256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q2 f38257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Q2 f38258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Q2 f38259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q2 f38260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Q2 f38261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final G5 f38262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final O2 f38263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final W2 f38264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f38265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CoroutineContext f38266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p020r2.p1 f38267p;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.e2$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PASSPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.RESIDENCE_PERMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DocumentType.PAPER_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DocumentType.DRIVERS_LICENSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DocumentType.DUTCH_DRIVERS_LICENSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4179e2(VisionDocumentScannerFeatureConfig featureConfig, wn0.a<DocumentScannerConfig> configFactory, InterfaceC4234l4 scannerDetectionAreaProvider, wn0.l<? super EnumC4211i2, ? extends AbstractC4222k> timeoutFactory, List<? extends Q2> automaticWarnings, Q2 automaticProcessor, Q2 manualProcessor, Q2 dutchIdlManualStepMrzExtractor, Q2 manualStepMrzExtractor, Q2 detector, G5 triggerPrecondition, O2 imageTooDarkConsumer, W2 isSteadyWarningInteractor, List<? extends InterfaceC4265q0> postProcessors, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(featureConfig, "featureConfig");
        p013kotlin.jvm.internal.s.k(configFactory, "configFactory");
        p013kotlin.jvm.internal.s.k(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(timeoutFactory, "timeoutFactory");
        p013kotlin.jvm.internal.s.k(automaticWarnings, "automaticWarnings");
        p013kotlin.jvm.internal.s.k(automaticProcessor, "automaticProcessor");
        p013kotlin.jvm.internal.s.k(manualProcessor, "manualProcessor");
        p013kotlin.jvm.internal.s.k(dutchIdlManualStepMrzExtractor, "dutchIdlManualStepMrzExtractor");
        p013kotlin.jvm.internal.s.k(manualStepMrzExtractor, "manualStepMrzExtractor");
        p013kotlin.jvm.internal.s.k(detector, "detector");
        p013kotlin.jvm.internal.s.k(triggerPrecondition, "triggerPrecondition");
        p013kotlin.jvm.internal.s.k(imageTooDarkConsumer, "imageTooDarkConsumer");
        p013kotlin.jvm.internal.s.k(isSteadyWarningInteractor, "isSteadyWarningInteractor");
        p013kotlin.jvm.internal.s.k(postProcessors, "postProcessors");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        this.f38252a = featureConfig;
        this.f38253b = configFactory;
        this.f38254c = scannerDetectionAreaProvider;
        this.f38255d = timeoutFactory;
        this.f38256e = automaticWarnings;
        this.f38257f = automaticProcessor;
        this.f38258g = manualProcessor;
        this.f38259h = dutchIdlManualStepMrzExtractor;
        this.f38260i = manualStepMrzExtractor;
        this.f38261j = detector;
        this.f38262k = triggerPrecondition;
        this.f38263l = imageTooDarkConsumer;
        this.f38264m = isSteadyWarningInteractor;
        this.f38265n = postProcessors;
        this.f38266o = coroutineContext;
        this.f38267p = p020r2.s3.d(0, null, 2, null);
    }

    private final List<J5> allManualSteps() {
        return p013kotlin.collections.v.r(compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, null, 12, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.v9
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.allManualSteps$lambda$11(this.f39050a);
            }
        }), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, null, 12, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.w9
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.allManualSteps$lambda$12(this.f39063a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 allManualSteps$lambda$11(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 allManualSteps$lambda$12(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.BACK, true, null, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final J5 automaticStep(int i11, DocumentFileSide documentFileSide, boolean z11) {
        wn0.l lVar = this.f38255d;
        EnumC4211i2 enumC4211i2 = EnumC4211i2.INVALID_DETECTION_AREA;
        List listS = p013kotlin.collections.v.s(lVar.invoke(enumC4211i2));
        if (this.f38252a.getSupportedAutoDetectMode(getConfig().getType()) == VisionDocumentScannerFeatureConfig.AutoDetectMode.DirectCapture) {
            listS.add(this.f38255d.invoke(EnumC4211i2.AUTO_DETECTION));
        }
        C4200h c4200h = new C4200h(new I5(new DocumentScannerStep(i11, documentFileSide, z11, true), false, 2, null), listS, p013kotlin.collections.v.m(), this.f38256e, this.f38257f, this.f38261j, this.f38265n);
        Q2 q11 = this.f38260i;
        wn0.l lVar2 = this.f38255d;
        EnumC4211i2 enumC4211i3 = EnumC4211i2.STEP;
        J5 j5StepWithTrigger = stepWithTrigger(c4200h, manualStep(i11, documentFileSide, z11, q11, p013kotlin.collections.v.p(this.f38255d.invoke(enumC4211i2), lVar2.invoke(enumC4211i3))));
        return this.f38252a.getSupportedAutoDetectMode(getConfig().getType()) == VisionDocumentScannerFeatureConfig.AutoDetectMode.UserAssist ? j5StepWithTrigger : new C4290t5((AbstractC4222k) this.f38255d.invoke(enumC4211i3), j5StepWithTrigger, compositeManualStep(i11, documentFileSide, z11, this.f38260i));
    }

    static /* synthetic */ J5 automaticStep$default(C4179e2 c4179e2, int i11, DocumentFileSide documentFileSide, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return c4179e2.automaticStep(i11, documentFileSide, z11);
    }

    private final J5 automaticStepIfEnabled(int i11, DocumentFileSide documentFileSide, boolean z11) {
        return this.f38252a.isAutoDetectAvailable() ? automaticStep(i11, documentFileSide, z11) : compositeManualStep$default(this, i11, documentFileSide, z11, null, 8, null);
    }

    static /* synthetic */ J5 automaticStepIfEnabled$default(C4179e2 c4179e2, int i11, DocumentFileSide documentFileSide, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return c4179e2.automaticStepIfEnabled(i11, documentFileSide, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final J5 compositeManualStep(int i11, DocumentFileSide documentFileSide, boolean z11, Q2 q11) {
        return stepWithTrigger(warningsCheckerStep(i11, documentFileSide, z11), manualStep(i11, documentFileSide, z11, q11, p013kotlin.collections.v.p(this.f38255d.invoke(EnumC4211i2.INVALID_DETECTION_AREA), this.f38255d.invoke(EnumC4211i2.STEP))));
    }

    static /* synthetic */ J5 compositeManualStep$default(C4179e2 c4179e2, int i11, DocumentFileSide documentFileSide, boolean z11, Q2 q11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        if ((i12 & 8) != 0) {
            q11 = c4179e2.f38258g;
        }
        return c4179e2.compositeManualStep(i11, documentFileSide, z11, q11);
    }

    private final J5 createIfAngledEnabled(wn0.a<? extends J5> aVar) {
        if (getConfig().getIncludeAngledSteps()) {
            return aVar.invoke();
        }
        return null;
    }

    private final List<J5> dutchDriversLicenseSteps() {
        return p013kotlin.collections.v.r(automaticStepIfEnabled$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, 4, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.s9
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.dutchDriversLicenseSteps$lambda$7(this.f38868a);
            }
        }), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, this.f38259h, 4, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.t9
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.dutchDriversLicenseSteps$lambda$8(this.f38925a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 dutchDriversLicenseSteps$lambda$7(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 dutchDriversLicenseSteps$lambda$8(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.BACK, true, null, 8, null);
    }

    private final List<J5> frontAutomaticBackManual() {
        return p013kotlin.collections.v.r(automaticStepIfEnabled$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, 4, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.r9
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.frontAutomaticBackManual$lambda$2(this.f38815a);
            }
        }), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, null, 12, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.u9
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.frontAutomaticBackManual$lambda$3(this.f38980a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 frontAutomaticBackManual$lambda$2(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 frontAutomaticBackManual$lambda$3(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.BACK, true, null, 8, null);
    }

    private final List<J5> frontManualBackAutomatic() {
        return p013kotlin.collections.v.r(compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, null, 12, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.z9
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.frontManualBackAutomatic$lambda$4(this.f39161a);
            }
        }), automaticStepIfEnabled$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, 4, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.aa
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.frontManualBackAutomatic$lambda$5(this.f38166a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 frontManualBackAutomatic$lambda$4(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 frontManualBackAutomatic$lambda$5(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.BACK, true, null, 8, null);
    }

    private final int getAndIncrementStepIndex() {
        p020r2.p1 p1Var = this.f38267p;
        int iIntValue = ((Number) p1Var.getValue()).intValue();
        p1Var.setValue(Integer.valueOf(iIntValue + 1));
        return iIntValue;
    }

    private final DocumentScannerConfig getConfig() {
        return (DocumentScannerConfig) this.f38253b.invoke();
    }

    private final List<J5> getSteps() {
        List<J5> listPassportSteps;
        switch (a.$EnumSwitchMapping$0[getConfig().getType().ordinal()]) {
            case 1:
                listPassportSteps = passportSteps();
                break;
            case 2:
                listPassportSteps = frontManualBackAutomatic();
                break;
            case 3:
                listPassportSteps = frontManualBackAutomatic();
                break;
            case 4:
                listPassportSteps = frontAutomaticBackManual();
                break;
            case 5:
                listPassportSteps = paperIdSteps();
                break;
            case 6:
                listPassportSteps = allManualSteps();
                break;
            case 7:
                listPassportSteps = dutchDriversLicenseSteps();
                break;
            case 8:
                listPassportSteps = proofOfAddressSteps();
                break;
            case 9:
                listPassportSteps = tinReferenceDocumentSteps();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f38267p.setValue(0);
        return listPassportSteps;
    }

    private final J5 manualStep(int i11, DocumentFileSide documentFileSide, boolean z11, Q2 q11, List<? extends G5> list) {
        return new C4172d3(this.f38254c, p013kotlin.collections.v.Q0(list, this.f38262k), q11, new I5(new DocumentScannerStep(i11, documentFileSide, z11, false), false, 2, null), getCoroutineContext());
    }

    static /* synthetic */ J5 manualStep$default(C4179e2 c4179e2, int i11, DocumentFileSide documentFileSide, boolean z11, Q2 q11, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return c4179e2.manualStep(i11, documentFileSide, z11, q11, list);
    }

    private final List<J5> paperIdSteps() {
        return p013kotlin.collections.v.r(compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.INSIDE_LEFT, false, null, 12, null), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.INSIDE_RIGHT, false, null, 12, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.x9
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.paperIdSteps$lambda$6(this.f39099a);
            }
        }), compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.BACK, false, null, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 paperIdSteps$lambda$6(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.INSIDE_RIGHT, true, null, 8, null);
    }

    private final List<J5> passportSteps() {
        return p013kotlin.collections.v.r(automaticStepIfEnabled$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, 4, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.ca
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.passportSteps$lambda$1(this.f38202a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 passportSteps$lambda$1(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    private final List<J5> proofOfAddressSteps() {
        return p013kotlin.collections.v.r(compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, null, 12, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.y9
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.proofOfAddressSteps$lambda$9(this.f39142a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 proofOfAddressSteps$lambda$9(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    private final J5 stepWithTrigger(J5 j11, J5 j12) {
        return this.f38252a.getSupportedAutoDetectMode(getConfig().getType()) == VisionDocumentScannerFeatureConfig.AutoDetectMode.UserAssist ? new X3(j11, j12) : new R3(j11, j12);
    }

    private final List<J5> tinReferenceDocumentSteps() {
        return p013kotlin.collections.v.r(compositeManualStep$default(this, getAndIncrementStepIndex(), DocumentFileSide.FRONT, false, null, 12, null), createIfAngledEnabled(new wn0.a() { // from class: com.fourthline.vision.internal.ba
            @Override // wn0.a
            public final Object invoke() {
                return C4179e2.tinReferenceDocumentSteps$lambda$10(this.f38184a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J5 tinReferenceDocumentSteps$lambda$10(C4179e2 c4179e2) {
        return compositeManualStep$default(c4179e2, c4179e2.getAndIncrementStepIndex(), DocumentFileSide.FRONT, true, null, 8, null);
    }

    private final J5 warningsCheckerStep(int i11, DocumentFileSide documentFileSide, boolean z11) {
        return new C4171d2(new I5(new DocumentScannerStep(i11, documentFileSide, z11, false), false, 2, null), this.f38263l, this.f38264m);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f38266o;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public void subscribe(wn0.p<? super List<? extends J5>, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        InterfaceC4306w0.a.subscribe(this, pVar);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public List<J5> get() {
        return getSteps();
    }
}
