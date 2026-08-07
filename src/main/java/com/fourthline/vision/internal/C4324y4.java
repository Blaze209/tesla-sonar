package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.OnVisionScannerEffect;
import com.fourthline.vision.VisionScannerEffect;
import com.fourthline.vision.selfie.SelfieScannerCallback;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4324y4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f39116h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f39117i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final SelfieScannerStep f39118j = SelfieScannerStep.TURN_HEAD_LEFT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f39119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f39120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f39121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4227k4 f39122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final OnVisionScannerEffect f39123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wn0.a f39124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private wn0.a f39125g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.fourthline.vision.internal.y4$a */
    public static final class a implements wn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39126a = new a();

        a() {
        }

        @Override // wn0.a
        public final Void invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.y4$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SelfieScannerStep getLivenessStepType() {
            return C4324y4.f39118j;
        }

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.fourthline.vision.internal.y4$c */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SelfieScannerStep f39127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Q2 f39128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Q2 f39129c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f39130d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f39131e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f39132f;

        public c(SelfieScannerStep scannerStep) {
            p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
            this.f39127a = scannerStep;
            this.f39130d = p013kotlin.collections.v.m();
            this.f39131e = p013kotlin.collections.v.m();
            this.f39132f = p013kotlin.collections.v.m();
        }

        public final J5 build() {
            SelfieScannerStep selfieScannerStep = this.f39127a;
            return new C4200h(new I5(selfieScannerStep, selfieScannerStep == SelfieScannerStep.SELFIE), this.f39130d, this.f39131e, this.f39132f, getProcessor(), getImageToDetections(), null, 64, null);
        }

        public final List<InterfaceC4265q0> getErrors() {
            return this.f39131e;
        }

        public final Q2 getImageToDetections() {
            Q2 q11 = this.f39128b;
            if (q11 != null) {
                return q11;
            }
            p013kotlin.jvm.internal.s.B("imageToDetections");
            return null;
        }

        public final List<G5> getPreconditions() {
            return this.f39130d;
        }

        public final Q2 getProcessor() {
            Q2 q11 = this.f39129c;
            if (q11 != null) {
                return q11;
            }
            p013kotlin.jvm.internal.s.B("processor");
            return null;
        }

        public final List<Q2> getWarnings() {
            return this.f39132f;
        }

        public final void setErrors(List<? extends InterfaceC4265q0> list) {
            p013kotlin.jvm.internal.s.k(list, "<set-?>");
            this.f39131e = list;
        }

        public final void setImageToDetections(Q2 q11) {
            p013kotlin.jvm.internal.s.k(q11, "<set-?>");
            this.f39128b = q11;
        }

        public final void setPreconditions(List<? extends G5> list) {
            p013kotlin.jvm.internal.s.k(list, "<set-?>");
            this.f39130d = list;
        }

        public final void setProcessor(Q2 q11) {
            p013kotlin.jvm.internal.s.k(q11, "<set-?>");
            this.f39129c = q11;
        }

        public final void setWarnings(List<? extends Q2> list) {
            p013kotlin.jvm.internal.s.k(list, "<set-?>");
            this.f39132f = list;
        }
    }

    public C4324y4(wn0.a<SelfieScannerConfig> selfieScannerConfigFactory, wn0.a<? extends SelfieScannerCallback> selfieScannerCallbackFactory, wn0.a<? extends InterfaceC4234l4> scannerDetectionAreaProviderFactory, InterfaceC4227k4 scannerDataSource, OnVisionScannerEffect onVisionScannerEffect, wn0.a<? extends List<Integer>> randomnessLivenessSteps) {
        p013kotlin.jvm.internal.s.k(selfieScannerConfigFactory, "selfieScannerConfigFactory");
        p013kotlin.jvm.internal.s.k(selfieScannerCallbackFactory, "selfieScannerCallbackFactory");
        p013kotlin.jvm.internal.s.k(scannerDetectionAreaProviderFactory, "scannerDetectionAreaProviderFactory");
        p013kotlin.jvm.internal.s.k(scannerDataSource, "scannerDataSource");
        p013kotlin.jvm.internal.s.k(onVisionScannerEffect, "onVisionScannerEffect");
        p013kotlin.jvm.internal.s.k(randomnessLivenessSteps, "randomnessLivenessSteps");
        this.f39119a = selfieScannerConfigFactory;
        this.f39120b = selfieScannerCallbackFactory;
        this.f39121c = scannerDetectionAreaProviderFactory;
        this.f39122d = scannerDataSource;
        this.f39123e = onVisionScannerEffect;
        this.f39124f = randomnessLivenessSteps;
        this.f39125g = new wn0.a() { // from class: com.fourthline.vision.internal.nc
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(C4324y4.currentRandomnessLivenessStepIndexFactory$lambda$1());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int currentRandomnessLivenessStepIndexFactory$lambda$1() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 provideCompositeStepInteractor$lambda$5(C4324y4 c4324y4, int i11) {
        c4324y4.f39123e.onVisionScannerEffect(new VisionScannerEffect.OnLivenessStepSuccess(i11));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 provideCompositeStepInteractor$lambda$7(C4324y4 c4324y4, int i11) {
        List list = (List) c4324y4.f39124f.invoke();
        if (list != null) {
            c4324y4.f39123e.onVisionScannerEffect(new VisionScannerEffect.OnLivenessStepUpdate(((Number) list.get(i11)).intValue()));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 provideCompositeStepInteractor$lambda$8(C4324y4 c4324y4, int i11) {
        c4324y4.f39123e.onVisionScannerEffect(new VisionScannerEffect.OnLivenessStepCountUpdate(i11));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int provideLivenessStepWarningsChecker$lambda$11(C4324y4 c4324y4) {
        List list = (List) c4324y4.f39124f.invoke();
        if (list != null) {
            return ((Number) list.get(((Number) c4324y4.f39125g.invoke()).intValue())).intValue();
        }
        throw new IllegalStateException("FL Developer error. Randomness has to be enabled by now.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 provideLivenessStepWarningsChecker$lambda$12(C4324y4 c4324y4, HeadMetadata headMetadata) {
        p013kotlin.jvm.internal.s.k(headMetadata, "headMetadata");
        c4324y4.f39123e.onVisionScannerEffect(new VisionScannerEffect.OnHeadMoved(headMetadata));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 provideRandomnessLivenessStep$lambda$16(M2 m11, C4280s2 c4280s2, O5 o11, C4294u2 c4294u2, L3 l11, C4156b3 c4156b3, c step) {
        p013kotlin.jvm.internal.s.k(step, "$this$step");
        step.setImageToDetections(m11);
        step.setProcessor(c4280s2);
        step.setPreconditions(p013kotlin.collections.v.e(o11));
        step.setErrors(p013kotlin.collections.v.p(c4294u2, l11));
        step.setWarnings(p013kotlin.collections.v.e(c4156b3));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 provideSelfieAutomaticStepInteractor$lambda$13(M2 m11, C4280s2 c4280s2, O5 o11, L3 l11, V2 v11, C4263p5 c4263p5, C4308w2 c4308w2, C4315x2 c4315x2, C4329z2 c4329z2, C4322y2 c4322y2, c step) {
        p013kotlin.jvm.internal.s.k(step, "$this$step");
        step.setImageToDetections(m11);
        step.setProcessor(c4280s2);
        step.setPreconditions(p013kotlin.collections.v.e(o11));
        step.setErrors(p013kotlin.collections.v.e(l11));
        step.setWarnings(p013kotlin.collections.v.p(v11, c4263p5, c4308w2, c4315x2, c4329z2, c4322y2));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean provideStepsDataSource$lambda$2(C4324y4 c4324y4) {
        return c4324y4.f39124f.invoke() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 provideTurnHeadLeftStep$lambda$15(M2 m11, C4280s2 c4280s2, O5 o11, C4294u2 c4294u2, L3 l11, R5 r11, c step) {
        p013kotlin.jvm.internal.s.k(step, "$this$step");
        step.setImageToDetections(m11);
        step.setProcessor(c4280s2);
        step.setPreconditions(p013kotlin.collections.v.e(o11));
        step.setErrors(p013kotlin.collections.v.p(c4294u2, l11));
        step.setWarnings(p013kotlin.collections.v.e(r11));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 provideTurnHeadRightStep$lambda$14(M2 m11, C4280s2 c4280s2, O5 o11, C4294u2 c4294u2, L3 l11, S5 s11, c step) {
        p013kotlin.jvm.internal.s.k(step, "$this$step");
        step.setImageToDetections(m11);
        step.setProcessor(c4280s2);
        step.setPreconditions(p013kotlin.collections.v.e(o11));
        step.setErrors(p013kotlin.collections.v.p(c4294u2, l11));
        step.setWarnings(p013kotlin.collections.v.e(s11));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4240m3.a provideVideoRecorderManager$lambda$3(C4324y4 c4324y4) {
        return AbstractC4220j4.toInternalType(((SelfieScannerConfig) c4324y4.f39119a.invoke()).getRecordingType());
    }

    private final J5 step(SelfieScannerStep selfieScannerStep, wn0.l<? super c, jn0.h0> lVar) {
        c cVar = new c(selfieScannerStep);
        lVar.invoke(cVar);
        return cVar.build();
    }

    public final C4303v4 provideCompositeStepInteractor(final C4270q5 stepsDataSource) {
        p013kotlin.jvm.internal.s.k(stepsDataSource, "stepsDataSource");
        final C4303v4 c4303v4 = new C4303v4(new wn0.a() { // from class: com.fourthline.vision.internal.qc
            @Override // wn0.a
            public final Object invoke() {
                return stepsDataSource.get();
            }
        }, this.f39124f, new wn0.l() { // from class: com.fourthline.vision.internal.rc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4324y4.provideCompositeStepInteractor$lambda$5(this.f38818a, ((Integer) obj).intValue());
            }
        }, new wn0.l() { // from class: com.fourthline.vision.internal.ec
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4324y4.provideCompositeStepInteractor$lambda$7(this.f38306a, ((Integer) obj).intValue());
            }
        }, new wn0.l() { // from class: com.fourthline.vision.internal.fc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4324y4.provideCompositeStepInteractor$lambda$8(this.f38322a, ((Integer) obj).intValue());
            }
        });
        this.f39125g = new wn0.a() { // from class: com.fourthline.vision.internal.gc
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(c4303v4.getCurrentRandomnessLivenessStepIndex());
            }
        };
        return c4303v4;
    }

    public final C4280s2 provideDetectionProcessor(P2 intelligentCropping, InterfaceC4234l4 scannerDetectionAreaProvider, Q2 scannerImageCreator) {
        p013kotlin.jvm.internal.s.k(intelligentCropping, "intelligentCropping");
        p013kotlin.jvm.internal.s.k(scannerDetectionAreaProvider, "scannerDetectionAreaProvider");
        p013kotlin.jvm.internal.s.k(scannerImageCreator, "scannerImageCreator");
        return new C4280s2(intelligentCropping, scannerDetectionAreaProvider, scannerImageCreator);
    }

    public final C4294u2 provideFaceDisappearInteractor() {
        return new C4294u2();
    }

    public final C4308w2 provideFaceNotDetectedWarningsInteractor() {
        return new C4308w2();
    }

    public final C4315x2 provideFaceNotInFrameWarningInteractor(InterfaceC4227k4 scannerDataSource) {
        p013kotlin.jvm.internal.s.k(scannerDataSource, "scannerDataSource");
        return new C4315x2(scannerDataSource);
    }

    public final C4322y2 provideFaceTooCloseWarningInteractor(InterfaceC4227k4 scannerDataSource) {
        p013kotlin.jvm.internal.s.k(scannerDataSource, "scannerDataSource");
        return new C4322y2(scannerDataSource);
    }

    public final C4329z2 provideFaceTooFarWarningInteractor(InterfaceC4227k4 scannerDataSource) {
        p013kotlin.jvm.internal.s.k(scannerDataSource, "scannerDataSource");
        return new C4329z2(scannerDataSource);
    }

    public final M2 provideImageToFaceDetectionInteractor(SelfieScannerConfig selfieScannerConfig, C4313x0 debugConsumer, InterfaceC4287t2 fastFaceDetector, InterfaceC4164c3 imageConverter) {
        p013kotlin.jvm.internal.s.k(selfieScannerConfig, "selfieScannerConfig");
        p013kotlin.jvm.internal.s.k(debugConsumer, "debugConsumer");
        p013kotlin.jvm.internal.s.k(fastFaceDetector, "fastFaceDetector");
        p013kotlin.jvm.internal.s.k(imageConverter, "imageConverter");
        InterfaceC4265q0 interfaceC4265q0Consumer$default = debugConsumer;
        if (!selfieScannerConfig.getDebugModeEnabled()) {
            interfaceC4265q0Consumer$default = AbstractC4271r0.consumer$default(null, 1, null);
        }
        return new M2(fastFaceDetector, interfaceC4265q0Consumer$default, imageConverter);
    }

    public final P2 provideIntelligentCropping() {
        return new C4301v2(false, 1, null);
    }

    public final V2 provideIsSteadyWarningInteractor(T2 isSteadyDataSource) {
        p013kotlin.jvm.internal.s.k(isSteadyDataSource, "isSteadyDataSource");
        return new V2(isSteadyDataSource);
    }

    public final C4156b3 provideLivenessStepWarningsChecker() {
        return new C4156b3(new wn0.a() { // from class: com.fourthline.vision.internal.lc
            @Override // wn0.a
            public final Object invoke() {
                return Integer.valueOf(C4324y4.provideLivenessStepWarningsChecker$lambda$11(this.f38545a));
            }
        }, new wn0.l() { // from class: com.fourthline.vision.internal.mc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4324y4.provideLivenessStepWarningsChecker$lambda$12(this.f38637a, (HeadMetadata) obj);
            }
        });
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

    public final L3 provideMultipleFacesInteractor() {
        return new L3();
    }

    public final OnVisionScannerEffect provideOnVisionScannerEffect() {
        return this.f39123e;
    }

    public final J5 provideRandomnessLivenessStep(final O5 timeoutConsumer, final C4156b3 livenessStepWarningsChecker, final C4280s2 faceDetectionProcessor, final C4294u2 faceDisappearInteractor, final L3 multipleFacesInteractor, final M2 imageToFaceDetectionInteractor) {
        p013kotlin.jvm.internal.s.k(timeoutConsumer, "timeoutConsumer");
        p013kotlin.jvm.internal.s.k(livenessStepWarningsChecker, "livenessStepWarningsChecker");
        p013kotlin.jvm.internal.s.k(faceDetectionProcessor, "faceDetectionProcessor");
        p013kotlin.jvm.internal.s.k(faceDisappearInteractor, "faceDisappearInteractor");
        p013kotlin.jvm.internal.s.k(multipleFacesInteractor, "multipleFacesInteractor");
        p013kotlin.jvm.internal.s.k(imageToFaceDetectionInteractor, "imageToFaceDetectionInteractor");
        return step(f39118j, new wn0.l() { // from class: com.fourthline.vision.internal.jc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4324y4.provideRandomnessLivenessStep$lambda$16(imageToFaceDetectionInteractor, faceDetectionProcessor, timeoutConsumer, faceDisappearInteractor, multipleFacesInteractor, livenessStepWarningsChecker, (C4324y4.c) obj);
            }
        });
    }

    public final InterfaceC4197g4 provideScanner(InterfaceC4240m3 mediaRecorderManager, E3 motionDataManager, C4214i5 scannerCallbackProxy, M5 stepsAdapter, TimestampProvider timestampProvider, LocationProvider locationProvider, C4323y3 metadataRepository, Q5 triggerRepository, CoroutineContext coroutineContext) {
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

    public final InterfaceC4227k4 provideScannerDataSource() {
        return this.f39122d;
    }

    public final InterfaceC4234l4 provideScannerDetectionAreaProvider() {
        return (InterfaceC4234l4) this.f39121c.invoke();
    }

    public final InterfaceC4159b6 provideSelfieAnalytics(SelfieScannerConfig selfieScannerConfig, InterfaceC4248n4 errorMapper) {
        p013kotlin.jvm.internal.s.k(selfieScannerConfig, "selfieScannerConfig");
        p013kotlin.jvm.internal.s.k(errorMapper, "errorMapper");
        return new C4289t4(selfieScannerConfig, errorMapper, this.f39124f);
    }

    public final J5 provideSelfieAutomaticStepInteractor(final V2 isSteadyWarningInteractor, final C4263p5 selfieStepWarningsChecker, final C4308w2 faceNotDetectedWarningsInteractor, final L3 multipleFacesInteractor, final C4315x2 faceNotInFrameWarningInteractor, final C4329z2 faceTooFarWarningInteractor, final C4322y2 faceTooCloseWarningInteractor, final O5 timeoutConsumer, final C4280s2 faceDetectionProcessor, final M2 imageToFaceDetectionInteractor) {
        p013kotlin.jvm.internal.s.k(isSteadyWarningInteractor, "isSteadyWarningInteractor");
        p013kotlin.jvm.internal.s.k(selfieStepWarningsChecker, "selfieStepWarningsChecker");
        p013kotlin.jvm.internal.s.k(faceNotDetectedWarningsInteractor, "faceNotDetectedWarningsInteractor");
        p013kotlin.jvm.internal.s.k(multipleFacesInteractor, "multipleFacesInteractor");
        p013kotlin.jvm.internal.s.k(faceNotInFrameWarningInteractor, "faceNotInFrameWarningInteractor");
        p013kotlin.jvm.internal.s.k(faceTooFarWarningInteractor, "faceTooFarWarningInteractor");
        p013kotlin.jvm.internal.s.k(faceTooCloseWarningInteractor, "faceTooCloseWarningInteractor");
        p013kotlin.jvm.internal.s.k(timeoutConsumer, "timeoutConsumer");
        p013kotlin.jvm.internal.s.k(faceDetectionProcessor, "faceDetectionProcessor");
        p013kotlin.jvm.internal.s.k(imageToFaceDetectionInteractor, "imageToFaceDetectionInteractor");
        return step(SelfieScannerStep.SELFIE, new wn0.l() { // from class: com.fourthline.vision.internal.oc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4324y4.provideSelfieAutomaticStepInteractor$lambda$13(imageToFaceDetectionInteractor, faceDetectionProcessor, timeoutConsumer, multipleFacesInteractor, isSteadyWarningInteractor, selfieStepWarningsChecker, faceNotDetectedWarningsInteractor, faceNotInFrameWarningInteractor, faceTooFarWarningInteractor, faceTooCloseWarningInteractor, (C4324y4.c) obj);
            }
        });
    }

    public final SelfieScannerCallback provideSelfieScannerCallback() {
        return (SelfieScannerCallback) this.f39120b.invoke();
    }

    public final C4214i5 provideSelfieScannerCallbackProxy(SelfieScannerCallback scannerCallback, InterfaceC4248n4 errorMapper, InterfaceC4159b6 analytics, LocationProvider locationProvider) {
        p013kotlin.jvm.internal.s.k(scannerCallback, "scannerCallback");
        p013kotlin.jvm.internal.s.k(errorMapper, "errorMapper");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        return new C4214i5(scannerCallback, errorMapper, locationProvider, analytics);
    }

    public final SelfieScannerConfig provideSelfieScannerConfig() {
        return (SelfieScannerConfig) this.f39119a.invoke();
    }

    public final InterfaceC4248n4 provideSelfieScannerErrorMapper() {
        return new C4235l5();
    }

    public final C4263p5 provideSelfieStepWarningsChecker() {
        return new C4263p5();
    }

    public final M5 provideStepsAdapter(K2 imageDataSource, T2 isSteadyDataSource, C4303v4 selfieCompositeStep) {
        p013kotlin.jvm.internal.s.k(imageDataSource, "imageDataSource");
        p013kotlin.jvm.internal.s.k(isSteadyDataSource, "isSteadyDataSource");
        p013kotlin.jvm.internal.s.k(selfieCompositeStep, "selfieCompositeStep");
        return new C4249n5(imageDataSource, isSteadyDataSource, selfieCompositeStep, p013kotlin.collections.v.m());
    }

    public final C4270q5 provideStepsDataSource(SelfieScannerConfig selfieScannerConfig, J5 selfieStep, J5 turnHeadLeftStep, J5 turnHeadRightStep, J5 randomnessLivenessStep) {
        p013kotlin.jvm.internal.s.k(selfieScannerConfig, "selfieScannerConfig");
        p013kotlin.jvm.internal.s.k(selfieStep, "selfieStep");
        p013kotlin.jvm.internal.s.k(turnHeadLeftStep, "turnHeadLeftStep");
        p013kotlin.jvm.internal.s.k(turnHeadRightStep, "turnHeadRightStep");
        p013kotlin.jvm.internal.s.k(randomnessLivenessStep, "randomnessLivenessStep");
        return new C4270q5(selfieStep, p013kotlin.collections.v.f(p013kotlin.collections.v.p(turnHeadLeftStep, turnHeadRightStep)), randomnessLivenessStep, selfieScannerConfig.getLivenessCheckType(), new wn0.a() { // from class: com.fourthline.vision.internal.dc
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(C4324y4.provideStepsDataSource$lambda$2(this.f38246a));
            }
        });
    }

    public final O5 provideTimeoutConsumer$fourthline_vision_release(TimestampProvider timestampProvider) {
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        return new O5(timestampProvider, 30L, TimeUnit.SECONDS);
    }

    public final J5 provideTurnHeadLeftStep(final O5 timeoutConsumer, final R5 turnHeadLeftStepWarningsChecker, final C4280s2 faceDetectionProcessor, final C4294u2 faceDisappearInteractor, final L3 multipleFacesInteractor, final M2 imageToFaceDetectionInteractor) {
        p013kotlin.jvm.internal.s.k(timeoutConsumer, "timeoutConsumer");
        p013kotlin.jvm.internal.s.k(turnHeadLeftStepWarningsChecker, "turnHeadLeftStepWarningsChecker");
        p013kotlin.jvm.internal.s.k(faceDetectionProcessor, "faceDetectionProcessor");
        p013kotlin.jvm.internal.s.k(faceDisappearInteractor, "faceDisappearInteractor");
        p013kotlin.jvm.internal.s.k(multipleFacesInteractor, "multipleFacesInteractor");
        p013kotlin.jvm.internal.s.k(imageToFaceDetectionInteractor, "imageToFaceDetectionInteractor");
        return step(SelfieScannerStep.TURN_HEAD_LEFT, new wn0.l() { // from class: com.fourthline.vision.internal.pc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4324y4.provideTurnHeadLeftStep$lambda$15(imageToFaceDetectionInteractor, faceDetectionProcessor, timeoutConsumer, faceDisappearInteractor, multipleFacesInteractor, turnHeadLeftStepWarningsChecker, (C4324y4.c) obj);
            }
        });
    }

    public final R5 provideTurnHeadLeftStepWarningsChecker() {
        return new R5();
    }

    public final J5 provideTurnHeadRightStep(final O5 timeoutConsumer, final S5 turnHeadRightStepWarningsChecker, final C4280s2 faceDetectionProcessor, final C4294u2 faceDisappearInteractor, final L3 multipleFacesInteractor, final M2 imageToFaceDetectionInteractor) {
        p013kotlin.jvm.internal.s.k(timeoutConsumer, "timeoutConsumer");
        p013kotlin.jvm.internal.s.k(turnHeadRightStepWarningsChecker, "turnHeadRightStepWarningsChecker");
        p013kotlin.jvm.internal.s.k(faceDetectionProcessor, "faceDetectionProcessor");
        p013kotlin.jvm.internal.s.k(faceDisappearInteractor, "faceDisappearInteractor");
        p013kotlin.jvm.internal.s.k(multipleFacesInteractor, "multipleFacesInteractor");
        p013kotlin.jvm.internal.s.k(imageToFaceDetectionInteractor, "imageToFaceDetectionInteractor");
        return step(SelfieScannerStep.TURN_HEAD_RIGHT, new wn0.l() { // from class: com.fourthline.vision.internal.kc
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4324y4.provideTurnHeadRightStep$lambda$14(imageToFaceDetectionInteractor, faceDetectionProcessor, timeoutConsumer, faceDisappearInteractor, multipleFacesInteractor, turnHeadRightStepWarningsChecker, (C4324y4.c) obj);
            }
        });
    }

    public final S5 provideTurnHeadRightStepWarningsChecker() {
        return new S5();
    }

    public final AbstractC4212i3 provideVideoIntervalDataSource(C4323y3 metadataRepository, SelfieScannerConfig selfieScannerConfig) {
        p013kotlin.jvm.internal.s.k(metadataRepository, "metadataRepository");
        p013kotlin.jvm.internal.s.k(selfieScannerConfig, "selfieScannerConfig");
        return new C4317x4(selfieScannerConfig.getLivenessCheckType(), metadataRepository);
    }

    public final InterfaceC4240m3 provideVideoRecorderManager(InterfaceC4184f audioRecorder, InterfaceC4226k3 mediaFilesManager, InterfaceC4254o3 mediaTrimmer, AbstractC4212i3 videoIntervalDataSource) {
        p013kotlin.jvm.internal.s.k(audioRecorder, "audioRecorder");
        p013kotlin.jvm.internal.s.k(mediaFilesManager, "mediaFilesManager");
        p013kotlin.jvm.internal.s.k(mediaTrimmer, "mediaTrimmer");
        p013kotlin.jvm.internal.s.k(videoIntervalDataSource, "videoIntervalDataSource");
        return new C4247n3(new wn0.a() { // from class: com.fourthline.vision.internal.ic
            @Override // wn0.a
            public final Object invoke() {
                return C4324y4.provideVideoRecorderManager$lambda$3(this.f38429a);
            }
        }, audioRecorder, mediaFilesManager, mediaTrimmer, videoIntervalDataSource);
    }

    public final F6 provideVisionViewModel(H6 imageProducer, K2 imageDataSource, r6 visionInfoProvider, InterfaceC4197g4 scanner, C4284t cameraFocusManager, C4213i4 scannerConfig, M2 detectorInteractor) {
        p013kotlin.jvm.internal.s.k(imageProducer, "imageProducer");
        p013kotlin.jvm.internal.s.k(imageDataSource, "imageDataSource");
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        p013kotlin.jvm.internal.s.k(scanner, "scanner");
        p013kotlin.jvm.internal.s.k(cameraFocusManager, "cameraFocusManager");
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        p013kotlin.jvm.internal.s.k(detectorInteractor, "detectorInteractor");
        return new F6(imageProducer, imageDataSource, visionInfoProvider, scanner, cameraFocusManager, scannerConfig, detectorInteractor.getFaceDetectorFast());
    }

    public /* synthetic */ C4324y4(wn0.a aVar, wn0.a aVar2, wn0.a aVar3, InterfaceC4227k4 interfaceC4227k4, OnVisionScannerEffect onVisionScannerEffect, wn0.a aVar4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, aVar3, interfaceC4227k4, (i11 & 16) != 0 ? new OnVisionScannerEffect() { // from class: com.fourthline.vision.internal.hc
            @Override // com.fourthline.vision.OnVisionScannerEffect
            public final void onVisionScannerEffect(VisionScannerEffect visionScannerEffect) {
                p013kotlin.jvm.internal.s.k(visionScannerEffect, "it");
            }
        } : onVisionScannerEffect, (i11 & 32) != 0 ? a.f39126a : aVar4);
    }
}
