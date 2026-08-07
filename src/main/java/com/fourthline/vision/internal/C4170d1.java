package com.fourthline.vision.internal;

import android.util.Size;
import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoDuration;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.document.DocumentScannerCallback;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.MrzValidationPolicy;
import com.fourthline.vision.document.ocr.OcrBirthDateValidator;
import com.fourthline.vision.document.ocr.OcrCountryAndTypeValidator;
import com.fourthline.vision.document.ocr.OcrDocumentExpirationDateValidator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Pair;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.fourthline.vision.internal.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4170d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f38210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f38211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f38212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4227k4 f38213d;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.d1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.PROOF_OF_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.TIN_REFERENCE_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C4170d1(wn0.a<DocumentScannerConfig> documentScannerConfigFactory, wn0.a<? extends DocumentScannerCallback> documentScannerCallbackFactory, wn0.a<? extends InterfaceC4234l4> scannerDetectionAreaProviderFactory, InterfaceC4227k4 scannerDataSource) {
        p013kotlin.jvm.internal.s.k(documentScannerConfigFactory, "documentScannerConfigFactory");
        p013kotlin.jvm.internal.s.k(documentScannerCallbackFactory, "documentScannerCallbackFactory");
        p013kotlin.jvm.internal.s.k(scannerDetectionAreaProviderFactory, "scannerDetectionAreaProviderFactory");
        p013kotlin.jvm.internal.s.k(scannerDataSource, "scannerDataSource");
        this.f38210a = documentScannerConfigFactory;
        this.f38211b = documentScannerCallbackFactory;
        this.f38212c = scannerDetectionAreaProviderFactory;
        this.f38213d = scannerDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int provideDocumentBirthDateValidator$lambda$0(C4170d1 c4170d1) {
        return ((DocumentScannerConfig) c4170d1.f38210a.invoke()).getValidationConfig().getMinPersonAge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List provideDocumentCountriesValidator$lambda$1(C4170d1 c4170d1) {
        return ((DocumentScannerConfig) c4170d1.f38210a.invoke()).getValidationConfig().getSupportedCountries();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentType provideDocumentCountriesValidator$lambda$2(C4170d1 c4170d1) {
        return ((DocumentScannerConfig) c4170d1.f38210a.invoke()).getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentType provideDocumentExpirationDateValidator$lambda$3(C4170d1 c4170d1) {
        return ((DocumentScannerConfig) c4170d1.f38210a.invoke()).getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MrzValidationPolicy provideMrzCandidateInteractor$lambda$8(C4170d1 c4170d1) {
        return ((DocumentScannerConfig) c4170d1.f38210a.invoke()).getMrzValidationPolicy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentScannerConfig provideStepsDataSource$lambda$5(InterfaceC4227k4 interfaceC4227k4) {
        return (DocumentScannerConfig) interfaceC4227k4.config();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long provideTimeoutFactory$lambda$14(C4170d1 c4170d1) {
        return ((DocumentScannerConfig) c4170d1.f38210a.invoke()).getAutoDetectStepDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoDuration provideVideoIntervalDataSource$lambda$12$lambda$11(C4170d1 c4170d1) {
        return ((DocumentScannerConfig) c4170d1.f38210a.invoke()).getVideoDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4240m3.a provideVideoRecorderManager$lambda$13(C4170d1 c4170d1) {
        return AbstractC4220j4.toInternalType(((DocumentScannerConfig) c4170d1.f38210a.invoke()).getRecordingType());
    }

    public final Q0 provideCompositeStepInteractor$fourthline_vision_release(final C4179e2 stepsDataSource, C4225k2 documentValidationPostProcessor, VisionDocumentScannerFeatureConfig featureConfig) {
        p013kotlin.jvm.internal.s.k(stepsDataSource, "stepsDataSource");
        p013kotlin.jvm.internal.s.k(documentValidationPostProcessor, "documentValidationPostProcessor");
        p013kotlin.jvm.internal.s.k(featureConfig, "featureConfig");
        return new Q0(new wn0.a() { // from class: com.fourthline.vision.internal.p9
            @Override // wn0.a
            public final Object invoke() {
                return stepsDataSource.get();
            }
        }, documentValidationPostProcessor, featureConfig.getDynamicStepsEvaluator());
    }

    public final InterfaceC4159b6 provideDocumentAnalytics(InterfaceC4248n4 scannerErrorMapper, InterfaceC4248n4 stepErrorMapper, DocumentScannerConfig documentScannerConfig) {
        p013kotlin.jvm.internal.s.k(scannerErrorMapper, "scannerErrorMapper");
        p013kotlin.jvm.internal.s.k(stepErrorMapper, "stepErrorMapper");
        p013kotlin.jvm.internal.s.k(documentScannerConfig, "documentScannerConfig");
        return new K0(documentScannerConfig, scannerErrorMapper, stepErrorMapper);
    }

    public final N0 provideDocumentBirthDateValidator$fourthline_vision_release(TimestampProvider timestampProvider) {
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        return new N0(new OcrBirthDateValidator(timestampProvider, new wn0.a() { // from class: com.fourthline.vision.internal.o9
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(C4170d1.provideDocumentBirthDateValidator$lambda$0(this.f38701a));
            }
        }));
    }

    public final R0 provideDocumentCountriesValidator$fourthline_vision_release() {
        return new R0(new OcrCountryAndTypeValidator(new wn0.a() { // from class: com.fourthline.vision.internal.l9
            @Override // wn0.a
            public final Object invoke() {
                return C4170d1.provideDocumentCountriesValidator$lambda$1(this.f38542a);
            }
        }), new wn0.a() { // from class: com.fourthline.vision.internal.m9
            @Override // wn0.a
            public final Object invoke() {
                return C4170d1.provideDocumentCountriesValidator$lambda$2(this.f38629a);
            }
        });
    }

    public final Y0 provideDocumentDetectionProcessor(P2 intelligentCropping, H3 mrzDetectionAreaProvider, InterfaceC4234l4 maskDetectionAreaProvider, Q2 scannerImageCreator) {
        p013kotlin.jvm.internal.s.k(intelligentCropping, "intelligentCropping");
        p013kotlin.jvm.internal.s.k(mrzDetectionAreaProvider, "mrzDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(maskDetectionAreaProvider, "maskDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(scannerImageCreator, "scannerImageCreator");
        return new Y0(intelligentCropping, mrzDetectionAreaProvider, maskDetectionAreaProvider, scannerImageCreator);
    }

    public final C4146a1 provideDocumentExpirationDateValidator$fourthline_vision_release(TimestampProvider timestampProvider) {
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        return new C4146a1(new wn0.a() { // from class: com.fourthline.vision.internal.f9
            @Override // wn0.a
            public final Object invoke() {
                return C4170d1.provideDocumentExpirationDateValidator$lambda$3(this.f38320a);
            }
        }, new OcrDocumentExpirationDateValidator(timestampProvider));
    }

    public final Q1 provideDocumentMrzValidator$fourthline_vision_release() {
        return new Q1();
    }

    public final R1 provideDocumentPhotoValidator$fourthline_vision_release(DocumentScannerConfig documentScannerConfig, InterfaceC4287t2 fastFaceDetector, InterfaceC4164c3 imageConverter) {
        p013kotlin.jvm.internal.s.k(documentScannerConfig, "documentScannerConfig");
        p013kotlin.jvm.internal.s.k(fastFaceDetector, "fastFaceDetector");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        return new R1(documentScannerConfig.getType(), fastFaceDetector, imageConverter);
    }

    public final DocumentScannerCallback provideDocumentScannerCallback$fourthline_vision_release() {
        return (DocumentScannerCallback) this.f38211b.invoke();
    }

    public final S1 provideDocumentScannerCallbackProxy(DocumentScannerCallback scannerCallback, TimestampProvider timestampProvider, LocationProvider locationProvider, InterfaceC4248n4 scannerErrorMapper, InterfaceC4248n4 stepErrorMapper, InterfaceC4159b6 analytics) {
        p013kotlin.jvm.internal.s.k(scannerCallback, "scannerCallback");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(scannerErrorMapper, "scannerErrorMapper");
        p013kotlin.jvm.internal.s.k(stepErrorMapper, "stepErrorMapper");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        return new S1(this.f38210a, scannerCallback, timestampProvider, locationProvider, scannerErrorMapper, stepErrorMapper, analytics);
    }

    public final DocumentScannerConfig provideDocumentScannerConfig$fourthline_vision_release() {
        return (DocumentScannerConfig) this.f38210a.invoke();
    }

    public final InterfaceC4248n4 provideDocumentScannerErrorMapper() {
        return new W1();
    }

    public final InterfaceC4248n4 provideDocumentScannerStepErrorMapper() {
        return new Z1();
    }

    public final C4218j2 provideDocumentTypeValidator$fourthline_vision_release(DocumentScannerConfig documentScannerConfig) {
        p013kotlin.jvm.internal.s.k(documentScannerConfig, "documentScannerConfig");
        return new C4218j2(documentScannerConfig.getType());
    }

    public final C4225k2 provideDocumentValidationPostProcessor$fourthline_vision_release(C4239m2 documentValidatorComposite) {
        p013kotlin.jvm.internal.s.k(documentValidatorComposite, "documentValidatorComposite");
        return new C4225k2(documentValidatorComposite);
    }

    public final C4239m2 provideDocumentValidatorComposite$fourthline_vision_release(Q1 mrzValidator, C4218j2 typeValidator, N0 birthDateValidator, C4146a1 expirationDateValidator, R1 photoValidator, R0 countriesAndTypeValidator) {
        p013kotlin.jvm.internal.s.k(mrzValidator, "mrzValidator");
        p013kotlin.jvm.internal.s.k(typeValidator, "typeValidator");
        p013kotlin.jvm.internal.s.k(birthDateValidator, "birthDateValidator");
        p013kotlin.jvm.internal.s.k(expirationDateValidator, "expirationDateValidator");
        p013kotlin.jvm.internal.s.k(photoValidator, "photoValidator");
        p013kotlin.jvm.internal.s.k(countriesAndTypeValidator, "countriesAndTypeValidator");
        return new C4239m2(mrzValidator, typeValidator, birthDateValidator, expirationDateValidator, photoValidator, countriesAndTypeValidator);
    }

    public final C4180e3 provideDutchIdlManualStepMrzExtractor(InterfaceC4234l4 scannerDetectionAreaProvider, InterfaceC4164c3 imageConverter, r6 visionInfoProvider, W3 qrCodeTextDetector, P3 ocrTextDetector, G3 mrzCandidateFilter, Q2 scannerImageCreator) {
        p013kotlin.jvm.internal.s.k(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        p013kotlin.jvm.internal.s.k(qrCodeTextDetector, "qrCodeTextDetector");
        p013kotlin.jvm.internal.s.k(ocrTextDetector, "ocrTextDetector");
        p013kotlin.jvm.internal.s.k(mrzCandidateFilter, "mrzCandidateFilter");
        p013kotlin.jvm.internal.s.k(scannerImageCreator, "scannerImageCreator");
        Size imageReaderSize = visionInfoProvider.getImageReaderSize();
        return new C4180e3(scannerDetectionAreaProvider, imageConverter, jn0.x.a(Integer.valueOf(imageReaderSize.getWidth()), Integer.valueOf(imageReaderSize.getHeight())), qrCodeTextDetector, scannerImageCreator, mrzCandidateFilter);
    }

    public final L2 provideImageToDocumentDetectionInteractor(InterfaceC4227k4 dataSource, O2 imageTooDarkConsumer, P3 ocrTextDetector, G3 mrzCandidateFilter, H3 mrzDetectionAreaProvider, InterfaceC4164c3 imageConverter, r6 visionInfoProvider, C4313x0 c4313x0) {
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        p013kotlin.jvm.internal.s.k(imageTooDarkConsumer, "imageTooDarkConsumer");
        p013kotlin.jvm.internal.s.k(ocrTextDetector, "ocrTextDetector");
        p013kotlin.jvm.internal.s.k(mrzCandidateFilter, "mrzCandidateFilter");
        p013kotlin.jvm.internal.s.k(mrzDetectionAreaProvider, "mrzDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        C4313x0 debugConsumer = c4313x0;
        p013kotlin.jvm.internal.s.k(debugConsumer, "debugConsumer");
        Size imageReaderSize = visionInfoProvider.getImageReaderSize();
        Pair pairA = jn0.x.a(Integer.valueOf(imageReaderSize.getWidth()), Integer.valueOf(imageReaderSize.getHeight()));
        if (!((DocumentScannerConfig) dataSource.config()).getDebugModeEnabled()) {
            debugConsumer = null;
        }
        return new L2(ocrTextDetector, imageTooDarkConsumer, mrzCandidateFilter, imageConverter, mrzDetectionAreaProvider, pairA, debugConsumer);
    }

    public final O2 provideImageTooDarkConsumer(r6 visionInfoProvider, InterfaceC4227k4 dataSource) {
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        return new O2(visionInfoProvider.getImageReaderSize(), dataSource);
    }

    public final P2 provideIntelligentCropping() {
        return new C4154b1();
    }

    public final W2 provideIsSteadyWarningInteractor(T2 isSteadyDataSource) {
        p013kotlin.jvm.internal.s.k(isSteadyDataSource, "isSteadyDataSource");
        return new W2(isSteadyDataSource);
    }

    public final C4180e3 provideManualStepMrzExtractor(H3 mrzDetectionAreaProvider, InterfaceC4164c3 imageConverter, r6 visionInfoProvider, P3 ocrTextDetector, G3 mrzCandidateFilter, Q2 scannerImageCreator) {
        p013kotlin.jvm.internal.s.k(mrzDetectionAreaProvider, "mrzDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        p013kotlin.jvm.internal.s.k(ocrTextDetector, "ocrTextDetector");
        p013kotlin.jvm.internal.s.k(mrzCandidateFilter, "mrzCandidateFilter");
        p013kotlin.jvm.internal.s.k(scannerImageCreator, "scannerImageCreator");
        Size imageReaderSize = visionInfoProvider.getImageReaderSize();
        return new C4180e3(mrzDetectionAreaProvider, imageConverter, jn0.x.a(Integer.valueOf(imageReaderSize.getWidth()), Integer.valueOf(imageReaderSize.getHeight())), ocrTextDetector, scannerImageCreator, mrzCandidateFilter);
    }

    public final E3 provideMotionDataManager(MotionDataCollector motionDataCollector, TimestampProvider timestampProvider, F3 motionDataTrimmer, C4213i4 scannerConfig) {
        p013kotlin.jvm.internal.s.k(motionDataCollector, "motionDataCollector");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(motionDataTrimmer, "motionDataTrimmer");
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        return new C4176e(scannerConfig.getShouldCollectMotionData(), motionDataCollector, timestampProvider, motionDataTrimmer);
    }

    public final F3 provideMotionDataTrimmer(AbstractC4212i3 mediaDurationIntervalDataSource) {
        p013kotlin.jvm.internal.s.k(mediaDurationIntervalDataSource, "mediaDurationIntervalDataSource");
        return new C4160c(mediaDurationIntervalDataSource);
    }

    public final G3 provideMrzCandidateInteractor(TimestampProvider timestampProvider) {
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        return new G3(new wn0.a() { // from class: com.fourthline.vision.internal.n9
            @Override // wn0.a
            public final Object invoke() {
                return C4170d1.provideMrzCandidateInteractor$lambda$8(this.f38675a);
            }
        }, timestampProvider);
    }

    public final H3 provideMrzDetectionAreaProvider(InterfaceC4227k4 dataSource) {
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        return new H3(dataSource);
    }

    public final N3 provideNotMrzDetectionWarningInteractor() {
        return new N3();
    }

    public final InterfaceC4197g4 provideScanner$fourthline_vision_release(InterfaceC4240m3 mediaRecorderManager, E3 motionDataManager, S1 scannerCallbackProxy, M5 stepsAdapter, TimestampProvider timestampProvider, LocationProvider locationProvider, C4323y3 metadataRepository, Q5 triggerRepository, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(mediaRecorderManager, "mediaRecorderManager");
        p013kotlin.jvm.internal.s.k(motionDataManager, "motionDataManager");
        p013kotlin.jvm.internal.s.k(scannerCallbackProxy, "scannerCallbackProxy");
        p013kotlin.jvm.internal.s.k(stepsAdapter, "stepsAdapter");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(metadataRepository, "metadataRepository");
        p013kotlin.jvm.internal.s.k(triggerRepository, "triggerRepository");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        return new u6(scannerCallbackProxy, mediaRecorderManager, motionDataManager, stepsAdapter, metadataRepository, triggerRepository, timestampProvider, locationProvider, coroutineContext);
    }

    public final InterfaceC4227k4 provideScannerDataSource$fourthline_vision_release() {
        return this.f38213d;
    }

    public final InterfaceC4234l4 provideScannerDetectionAreaProvider$fourthline_vision_release() {
        return (InterfaceC4234l4) this.f38212c.invoke();
    }

    public final C4262p4 provideScannerImageToDocumentStepResultInteractor$fourthline_vision_release(Q2 scannerImageCreator) {
        p013kotlin.jvm.internal.s.k(scannerImageCreator, "scannerImageCreator");
        return new C4262p4(scannerImageCreator);
    }

    public final C4155b2 provideScannerTimeoutConsumer$fourthline_vision_release(TimestampProvider timestampProvider, C4179e2 stepsDataSource, C4323y3 metadataRepository) {
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(stepsDataSource, "stepsDataSource");
        p013kotlin.jvm.internal.s.k(metadataRepository, "metadataRepository");
        return new C4155b2(stepsDataSource.get().size(), metadataRepository, timestampProvider, 60L, TimeUnit.SECONDS);
    }

    public final M5 provideStepsAdapter$fourthline_vision_release(DocumentScannerConfig documentScannerConfig, K2 imageDataSource, T2 isSteadyDataSource, Q0 documentCompositeStep, C4155b2 documentScannerTimeout) {
        p013kotlin.jvm.internal.s.k(documentScannerConfig, "documentScannerConfig");
        p013kotlin.jvm.internal.s.k(imageDataSource, "imageDataSource");
        p013kotlin.jvm.internal.s.k(isSteadyDataSource, "isSteadyDataSource");
        p013kotlin.jvm.internal.s.k(documentCompositeStep, "documentCompositeStep");
        p013kotlin.jvm.internal.s.k(documentScannerTimeout, "documentScannerTimeout");
        return new C4147a2(imageDataSource, isSteadyDataSource, documentCompositeStep, p013kotlin.jvm.internal.s.f(documentScannerConfig.getVideoDuration(), VideoDuration.EXTENDED.INSTANCE) ? p013kotlin.collections.v.e(documentScannerTimeout) : p013kotlin.collections.v.m());
    }

    public final C4179e2 provideStepsDataSource$fourthline_vision_release(final InterfaceC4227k4 dataSource, C4203h2 timeoutFactory, O2 imageTooDarkConsumer, W2 isSteadyWarningInteractor, Y0 documentDetectionProcessor, C4262p4 imageToScannerImageInteractor, C4180e3 dutchIdlManualStepMrzExtractor, C4180e3 manualStepMrzExtractor, L2 imageToDocumentDetectionInteractor, P5 triggerPreconditionConsumer, N3 notMrzDetectionWarningInteractor, dy.c textRecognizer, CoroutineContext coroutineContext, VisionDocumentScannerFeatureConfig featureConfig) {
        p013kotlin.jvm.internal.s.k(dataSource, "dataSource");
        p013kotlin.jvm.internal.s.k(timeoutFactory, "timeoutFactory");
        p013kotlin.jvm.internal.s.k(imageTooDarkConsumer, "imageTooDarkConsumer");
        p013kotlin.jvm.internal.s.k(isSteadyWarningInteractor, "isSteadyWarningInteractor");
        p013kotlin.jvm.internal.s.k(documentDetectionProcessor, "documentDetectionProcessor");
        p013kotlin.jvm.internal.s.k(imageToScannerImageInteractor, "imageToScannerImageInteractor");
        p013kotlin.jvm.internal.s.k(dutchIdlManualStepMrzExtractor, "dutchIdlManualStepMrzExtractor");
        p013kotlin.jvm.internal.s.k(manualStepMrzExtractor, "manualStepMrzExtractor");
        p013kotlin.jvm.internal.s.k(imageToDocumentDetectionInteractor, "imageToDocumentDetectionInteractor");
        p013kotlin.jvm.internal.s.k(triggerPreconditionConsumer, "triggerPreconditionConsumer");
        p013kotlin.jvm.internal.s.k(notMrzDetectionWarningInteractor, "notMrzDetectionWarningInteractor");
        p013kotlin.jvm.internal.s.k(textRecognizer, "textRecognizer");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        p013kotlin.jvm.internal.s.k(featureConfig, "featureConfig");
        return new C4179e2(VisionDocumentScannerFeatureConfig.copy$default(featureConfig, !(textRecognizer instanceof J0), false, null, null, 14, null), new wn0.a() { // from class: com.fourthline.vision.internal.h9
            @Override // wn0.a
            public final Object invoke() {
                return C4170d1.provideStepsDataSource$lambda$5(dataSource);
            }
        }, dataSource, timeoutFactory, p013kotlin.collections.v.e(isSteadyWarningInteractor), documentDetectionProcessor, imageToScannerImageInteractor, dutchIdlManualStepMrzExtractor, manualStepMrzExtractor, imageToDocumentDetectionInteractor, triggerPreconditionConsumer, imageTooDarkConsumer, isSteadyWarningInteractor, p013kotlin.collections.v.e(notMrzDetectionWarningInteractor), coroutineContext.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null)));
    }

    public final C4203h2 provideTimeoutFactory(TimestampProvider timestampProvider, InterfaceC4234l4 detectionAreaProvider) {
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(detectionAreaProvider, "detectionAreaProvider");
        return new C4203h2(timestampProvider, detectionAreaProvider, new wn0.a() { // from class: com.fourthline.vision.internal.k9
            @Override // wn0.a
            public final Object invoke() {
                return Long.valueOf(C4170d1.provideTimeoutFactory$lambda$14(this.f38520a));
            }
        });
    }

    public final AbstractC4212i3 provideVideoIntervalDataSource(C4323y3 metadataRepository, C4179e2 stepsDataSource) {
        p013kotlin.jvm.internal.s.k(metadataRepository, "metadataRepository");
        p013kotlin.jvm.internal.s.k(stepsDataSource, "stepsDataSource");
        final DocumentScannerConfig documentScannerConfig = (DocumentScannerConfig) this.f38210a.invoke();
        int i11 = a.$EnumSwitchMapping$0[documentScannerConfig.getType().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return new C4162c1(metadataRepository, new wn0.a() { // from class: com.fourthline.vision.internal.j9
                @Override // wn0.a
                public final Object invoke() {
                    return documentScannerConfig.getVideoDuration();
                }
            }, stepsDataSource.get().size());
        }
        return new Z3(metadataRepository, new wn0.a() { // from class: com.fourthline.vision.internal.i9
            @Override // wn0.a
            public final Object invoke() {
                return C4170d1.provideVideoIntervalDataSource$lambda$12$lambda$11(this.f38421a);
            }
        }, stepsDataSource.get().size(), C4149a4.f38137a.getRecordingPlan(documentScannerConfig.getType(), documentScannerConfig.getIncludeAngledSteps(), Long.valueOf(documentScannerConfig.getVideoDuration().getDuration())));
    }

    public final InterfaceC4240m3 provideVideoRecorderManager(InterfaceC4184f audioRecorder, InterfaceC4226k3 mediaFilesManager, InterfaceC4254o3 mediaTrimmer, AbstractC4212i3 videoIntervalDataSource) {
        p013kotlin.jvm.internal.s.k(audioRecorder, "audioRecorder");
        p013kotlin.jvm.internal.s.k(mediaFilesManager, "mediaFilesManager");
        p013kotlin.jvm.internal.s.k(mediaTrimmer, "mediaTrimmer");
        p013kotlin.jvm.internal.s.k(videoIntervalDataSource, "videoIntervalDataSource");
        return new C4247n3(new wn0.a() { // from class: com.fourthline.vision.internal.g9
            @Override // wn0.a
            public final Object invoke() {
                return C4170d1.provideVideoRecorderManager$lambda$13(this.f38344a);
            }
        }, audioRecorder, mediaFilesManager, mediaTrimmer, videoIntervalDataSource);
    }

    public final F6 provideVisionViewModel(H6 imageProducer, K2 imageDataSource, r6 visionInfoProvider, InterfaceC4197g4 scanner, C4284t cameraFocusManager, C4213i4 scannerConfig, L2 detectorInteractor) {
        p013kotlin.jvm.internal.s.k(imageProducer, "imageProducer");
        p013kotlin.jvm.internal.s.k(imageDataSource, "imageDataSource");
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        p013kotlin.jvm.internal.s.k(scanner, "scanner");
        p013kotlin.jvm.internal.s.k(cameraFocusManager, "cameraFocusManager");
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        p013kotlin.jvm.internal.s.k(detectorInteractor, "detectorInteractor");
        return new F6(imageProducer, imageDataSource, visionInfoProvider, scanner, cameraFocusManager, scannerConfig, detectorInteractor.getMrzDocumentDetector());
    }
}
