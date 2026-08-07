package com.fourthline.vision.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.core.mrz.IdlMrzInfo;
import com.fourthline.core.mrz.IdlMrzInfoValidationError;
import com.fourthline.core.mrz.MrtdMrzInfo;
import com.fourthline.core.mrz.MrtdMrzInfoValidationError;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentValidationError;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class K0 implements InterfaceC4159b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f37796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4248n4 f37797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4248n4 f37798c;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t6.values().length];
            try {
                iArr[t6.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t6.RECORD_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends p013kotlin.jvm.internal.u implements wn0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f37799a = new b();

        public b() {
            super(1);
        }

        @Override // wn0.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof InterfaceC4163c2.b);
        }
    }

    public K0(DocumentScannerConfig config, InterfaceC4248n4 scannerErrorMapper, InterfaceC4248n4 stepErrorMapper) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(scannerErrorMapper, "scannerErrorMapper");
        p013kotlin.jvm.internal.s.k(stepErrorMapper, "stepErrorMapper");
        this.f37796a = config;
        this.f37797b = scannerErrorMapper;
        this.f37798c = stepErrorMapper;
    }

    private final void clearScannerContext() {
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.clearContext(AnalyticsContext.Scanner);
        }
    }

    private final Pair<String, String> country(String str) {
        return jn0.x.a(PlaceTypes.COUNTRY, str);
    }

    private final String getNameLowerCased(Enum<?> r11) {
        String strName = r11.name();
        Locale ROOT = Locale.ROOT;
        p013kotlin.jvm.internal.s.j(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final void onStepFail(DocumentScannerStep documentScannerStep, DocumentScannerStepError documentScannerStepError, Throwable th2) {
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        fourthlineAnalytics.e("document_step_fail", th2, p013kotlin.collections.v0.s(p013kotlin.collections.v0.r(p013kotlin.collections.v0.f(toFatalErrorAttr(documentScannerStepError)), toStepAttrs(documentScannerStep, this.f37796a)), toDocumentFlowAttr("document_step_fail")));
        k6 k6Var = new k6(getNameLowerCased(documentScannerStep.getFileSide()), documentScannerStep.getIndex(), documentScannerStep.isAngled(), documentScannerStep.isAutoDetectAvailable(), documentScannerStepError, th2);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(k6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MrzInfo onSuccess$lambda$2(InterfaceC4163c2.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return it.getMrz();
    }

    private final Pair<String, String> toDocumentFlowAttr(String str) {
        return jn0.x.a("document_flow", str);
    }

    private final Pair<String, String> toDocumentTypeAttr(DocumentScannerConfig documentScannerConfig) {
        return jn0.x.a(AnalyticsAttribute.DocumentType, getNameLowerCased(documentScannerConfig.getType()));
    }

    private final Pair<String, String> toFatalErrorAttr(DocumentScannerError documentScannerError) {
        return jn0.x.a("fatal_error", getNameLowerCased(documentScannerError));
    }

    private final Pair<String, String> toFileSideAttr(DocumentScannerStep documentScannerStep) {
        return jn0.x.a("fileside", getNameLowerCased(documentScannerStep.getFileSide()));
    }

    private final Pair<String, Boolean> toIsAngledAttr(DocumentScannerStep documentScannerStep) {
        return jn0.x.a("is_angled", Boolean.valueOf(documentScannerStep.isAngled()));
    }

    private final Pair<String, Boolean> toIsAutodetectAvailableAttr(DocumentScannerStep documentScannerStep) {
        return jn0.x.a("is_autodetect_available", Boolean.valueOf(documentScannerStep.isAutoDetectAvailable()));
    }

    private final Pair<String, Boolean> toIsMrzExtractedAttr(MrzInfo mrzInfo) {
        return jn0.x.a("is_mrz_extracted", Boolean.valueOf(mrzInfo != null));
    }

    private final Pair<String, Boolean> toIsVideoAvailableAttr(C4275r4 c4275r4) {
        return jn0.x.a("is_video_url_available", Boolean.valueOf(c4275r4.getVideoUrl() != null));
    }

    private final Pair<String, String> toMrzPolicyAttr(DocumentScannerConfig documentScannerConfig) {
        return jn0.x.a("mrz_policy", getNameLowerCased(documentScannerConfig.getMrzValidationPolicy()));
    }

    private final Pair<String, String> toShouldRecordVideoAttr(DocumentScannerConfig documentScannerConfig) {
        return jn0.x.a("record_video", getNameLowerCased(documentScannerConfig.getRecordingType()));
    }

    private final Map<String, Object> toStepAttrs(DocumentScannerStep documentScannerStep, DocumentScannerConfig documentScannerConfig) {
        return p013kotlin.collections.v0.m(toDocumentTypeAttr(documentScannerConfig), toFileSideAttr(documentScannerStep), toIsAngledAttr(documentScannerStep), toIsAutodetectAvailableAttr(documentScannerStep), toStepIndexAttr(documentScannerStep));
    }

    private final Pair<String, Integer> toStepIndexAttr(DocumentScannerStep documentScannerStep) {
        return jn0.x.a("index", Integer.valueOf(documentScannerStep.getIndex()));
    }

    private final Pair<String, List<String>> toValidationErrorsAttr(List<String> list) {
        return jn0.x.a("validation_errors", list);
    }

    private final Pair<String, String> toVideoDurationAttr(DocumentScannerConfig documentScannerConfig) {
        return jn0.x.a("video_duration", documentScannerConfig.getVideoDuration().getAlias());
    }

    private final Pair<String, String> toVideoGravityAttr(DocumentScannerConfig documentScannerConfig) {
        return jn0.x.a("preview_gravity", "resize_aspect_fill");
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onMoveToNextStep() {
        FourthlineAnalytics.i$default(FourthlineAnalytics.INSTANCE, "document_step_next", null, p013kotlin.collections.v0.f(toDocumentFlowAttr("document_step_next")), 2, null);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onPermissionNotGranted(t6 permission) {
        DocumentScannerError documentScannerError;
        p013kotlin.jvm.internal.s.k(permission, "permission");
        int i11 = a.$EnumSwitchMapping$0[permission.ordinal()];
        if (i11 == 1) {
            documentScannerError = DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            documentScannerError = DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.e$default(fourthlineAnalytics, "document_fail", null, p013kotlin.collections.v0.m(toFatalErrorAttr(documentScannerError), toDocumentFlowAttr("document_fail")), 2, null);
        C4191f6 c4191f6 = new C4191f6(documentScannerError);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(c4191f6);
        }
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onReset() {
        FourthlineAnalytics.i$default(FourthlineAnalytics.INSTANCE, "document_reset", null, null, 6, null);
        clearScannerContext();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onStart() {
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        DocumentScannerConfig documentScannerConfig = this.f37796a;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "document_start", null, p013kotlin.collections.v0.m(toMrzPolicyAttr(documentScannerConfig), toVideoGravityAttr(documentScannerConfig), toDocumentTypeAttr(documentScannerConfig), toShouldRecordVideoAttr(documentScannerConfig), toVideoDurationAttr(documentScannerConfig), toDocumentFlowAttr("document_start")), 2, null);
        DocumentScannerConfig documentScannerConfig2 = this.f37796a;
        C4175d6 c4175d6 = new C4175d6("vision", documentScannerConfig2.getType(), documentScannerConfig2.getIncludeAngledSteps(), documentScannerConfig2.getMrzValidationPolicy(), documentScannerConfig2.getRecordingType(), documentScannerConfig2.getVideoDuration());
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.registerContext(c4175d6);
        }
        i6 i6Var = i6.f38413a;
        AnalyticsInterface analytics2 = fourthlineAnalytics.getAnalytics();
        if (analytics2 != null) {
            analytics2.trackNew(i6Var);
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onSuccess(C4275r4 result) {
        List<String> listM;
        p013kotlin.jvm.internal.s.k(result, "result");
        ho0.i iVarH = ho0.l.H(p013kotlin.collections.v.e0(result.getStepResults()), b.f37799a);
        p013kotlin.jvm.internal.s.i(iVarH, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        MrzInfo mrzInfo = (MrzInfo) ho0.l.M(ho0.l.U(iVarH, new wn0.l() { // from class: com.fourthline.vision.internal.d8
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return K0.onSuccess$lambda$2((InterfaceC4163c2.b) obj);
            }
        }));
        boolean z11 = mrzInfo instanceof MrtdMrzInfo;
        String issuingCountry = z11 ? ((MrtdMrzInfo) mrzInfo).getIssuingCountry() : null;
        if (z11) {
            List<MrtdMrzInfoValidationError> validationErrors = ((MrtdMrzInfo) mrzInfo).getValidationErrors();
            listM = new ArrayList<>(p013kotlin.collections.v.y(validationErrors, 10));
            Iterator<T> it = validationErrors.iterator();
            while (it.hasNext()) {
                listM.add(getNameLowerCased((MrtdMrzInfoValidationError) it.next()));
            }
        } else if (mrzInfo instanceof IdlMrzInfo) {
            List<IdlMrzInfoValidationError> validationErrors2 = ((IdlMrzInfo) mrzInfo).getValidationErrors();
            listM = new ArrayList<>(p013kotlin.collections.v.y(validationErrors2, 10));
            Iterator<T> it2 = validationErrors2.iterator();
            while (it2.hasNext()) {
                listM.add(getNameLowerCased((IdlMrzInfoValidationError) it2.next()));
            }
        } else {
            if (mrzInfo != null) {
                throw new NoWhenBranchMatchedException();
            }
            listM = p013kotlin.collections.v.m();
        }
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "document_success", null, p013kotlin.collections.v0.y(p013kotlin.collections.v.r(toDocumentTypeAttr(this.f37796a), issuingCountry != null ? country(issuingCountry) : null, toIsVideoAvailableAttr(result), toValidationErrorsAttr(listM), toIsMrzExtractedAttr(mrzInfo), toDocumentFlowAttr("document_success"))), 2, null);
        C4199g6 c4199g6 = new C4199g6(mrzInfo != null, listM);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(c4199g6);
        }
        clearScannerContext();
    }

    private final Pair<String, String> toFatalErrorAttr(DocumentScannerStepError documentScannerStepError) {
        return jn0.x.a("fatal_error", getNameLowerCased(documentScannerStepError));
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onFail(DocumentScannerStep scannerStep, EnumC4241m4 scannerError, Throwable th2) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        p013kotlin.jvm.internal.s.k(scannerError, "scannerError");
        try {
            onStepFail(scannerStep, (DocumentScannerStepError) this.f37798c.convertError(scannerError), th2);
        } catch (IllegalArgumentException unused) {
            DocumentScannerError documentScannerError = (DocumentScannerError) this.f37797b.convertError(scannerError);
            FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
            fourthlineAnalytics.e("document_fail", th2, p013kotlin.collections.v0.s(p013kotlin.collections.v0.r(p013kotlin.collections.v0.f(toFatalErrorAttr(documentScannerError)), toStepAttrs(scannerStep, this.f37796a)), toDocumentFlowAttr("document_fail")));
            C4207h6 c4207h6 = new C4207h6(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable(), documentScannerError, th2);
            AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
            if (analytics != null) {
                analytics.trackNew(c4207h6);
            }
            clearScannerContext();
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onResetCurrentStep(DocumentScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "document_step_reset", null, p013kotlin.collections.v0.s(toStepAttrs(scannerStep, this.f37796a), toDocumentFlowAttr("document_step_reset")), 2, null);
        l6 l6Var = new l6(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable());
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(l6Var);
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onStepSuccess(DocumentScannerStep scannerStep, K5 stepResult) {
        List<String> listM;
        Set<DocumentValidationError> validationErrors;
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        p013kotlin.jvm.internal.s.k(stepResult, "stepResult");
        InterfaceC4163c2 interfaceC4163c2 = stepResult instanceof InterfaceC4163c2 ? (InterfaceC4163c2) stepResult : null;
        if (interfaceC4163c2 == null || (validationErrors = interfaceC4163c2.getValidationErrors()) == null) {
            listM = p013kotlin.collections.v.m();
        } else {
            listM = new ArrayList<>(p013kotlin.collections.v.y(validationErrors, 10));
            Iterator<T> it = validationErrors.iterator();
            while (it.hasNext()) {
                listM.add(getNameLowerCased((DocumentValidationError) it.next()));
            }
        }
        List<String> list = listM;
        InterfaceC4163c2.b bVar = stepResult instanceof InterfaceC4163c2.b ? (InterfaceC4163c2.b) stepResult : null;
        MrzInfo mrz = bVar != null ? bVar.getMrz() : null;
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "document_step_success", null, p013kotlin.collections.v0.s(p013kotlin.collections.v0.s(p013kotlin.collections.v0.s(toStepAttrs(scannerStep, this.f37796a), toValidationErrorsAttr(list)), toIsMrzExtractedAttr(mrz)), toDocumentFlowAttr("document_step_success")), 2, null);
        j6 j6Var = new j6(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable(), mrz != null, list);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(j6Var);
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onStepUpdate(DocumentScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "document_step_update", null, p013kotlin.collections.v0.s(toStepAttrs(scannerStep, this.f37796a), toDocumentFlowAttr("document_step_update")), 2, null);
        m6 m6Var = new m6(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable());
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(m6Var);
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4159b6
    public void onTakeSnapshot(DocumentScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "document_take_snapshot", null, p013kotlin.collections.v0.s(toStepAttrs(scannerStep, this.f37796a), toDocumentFlowAttr("document_take_snapshot")), 2, null);
        n6 n6Var = n6.f38666a;
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(n6Var);
        }
    }
}
