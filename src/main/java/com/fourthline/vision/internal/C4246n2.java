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
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentValidationError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.vision.internal.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4246n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f38647a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.n2$a */
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

    public C4246n2(DocumentScannerConfig config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        this.f38647a = config;
        C4175d6 c4175d6 = new C4175d6("vision_x", config.getType(), config.getIncludeAngledSteps(), config.getMrzValidationPolicy(), config.getRecordingType(), config.getVideoDuration());
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.registerContext(c4175d6);
        }
    }

    private final void clearScannerContext() {
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.clearContext(AnalyticsContext.Scanner);
        }
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
        k6 k6Var = new k6(getNameLowerCased(documentScannerStep.getFileSide()), documentScannerStep.getIndex(), documentScannerStep.isAngled(), documentScannerStep.isAutoDetectAvailable(), documentScannerStepError, th2);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(k6Var);
        }
    }

    private final Pair<String, String> toDocumentFlowAttr(String str) {
        return jn0.x.a("document_flow", str);
    }

    private final Pair<String, String> toDocumentTypeAttr(DocumentScannerConfig documentScannerConfig) {
        return jn0.x.a(AnalyticsAttribute.DocumentType, getNameLowerCased(documentScannerConfig.getType()));
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

    private final Map<String, Object> toStepAttrs(DocumentScannerStep documentScannerStep, DocumentScannerConfig documentScannerConfig) {
        return p013kotlin.collections.v0.m(toDocumentTypeAttr(documentScannerConfig), toFileSideAttr(documentScannerStep), toIsAngledAttr(documentScannerStep), toIsAutodetectAvailableAttr(documentScannerStep), toStepIndexAttr(documentScannerStep));
    }

    private final Pair<String, Integer> toStepIndexAttr(DocumentScannerStep documentScannerStep) {
        return jn0.x.a("index", Integer.valueOf(documentScannerStep.getIndex()));
    }

    private final Pair<String, List<String>> toValidationErrorsAttr(List<String> list) {
        return jn0.x.a("validation_errors", list);
    }

    public final void onFail(DocumentScannerStep scannerStep, DocumentScannerError scannerError, Throwable th2) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        p013kotlin.jvm.internal.s.k(scannerError, "scannerError");
        C4207h6 c4207h6 = new C4207h6(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable(), scannerError, th2);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(c4207h6);
        }
        clearScannerContext();
    }

    public final void onMoveToNextStep() {
    }

    public final void onPermissionNotGranted(t6 permission) {
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
        C4191f6 c4191f6 = new C4191f6(documentScannerError);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(c4191f6);
        }
        clearScannerContext();
    }

    public final void onReset() {
        clearScannerContext();
    }

    public final void onResetCurrentStep(DocumentScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        l6 l6Var = new l6(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable());
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(l6Var);
        }
    }

    public final void onStart() {
        i6 i6Var = i6.f38413a;
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(i6Var);
        }
    }

    public final void onStepSuccess(DocumentScannerStep scannerStep, DocumentScannerStepResult stepResult) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        p013kotlin.jvm.internal.s.k(stepResult, "stepResult");
        Set<DocumentValidationError> validationErrors = stepResult.getValidationErrors();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(validationErrors, 10));
        Iterator<T> it = validationErrors.iterator();
        while (it.hasNext()) {
            arrayList.add(getNameLowerCased((DocumentValidationError) it.next()));
        }
        FourthlineAnalytics fourthlineAnalytics = FourthlineAnalytics.INSTANCE;
        FourthlineAnalytics.i$default(fourthlineAnalytics, "document_step_success", null, p013kotlin.collections.v0.s(p013kotlin.collections.v0.s(p013kotlin.collections.v0.s(toStepAttrs(scannerStep, this.f38647a), toValidationErrorsAttr(arrayList)), toIsMrzExtractedAttr(null)), toDocumentFlowAttr("document_step_success")), 2, null);
        j6 j6Var = new j6(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable(), false, arrayList);
        AnalyticsInterface analytics = fourthlineAnalytics.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(j6Var);
        }
    }

    public final void onStepUpdate(DocumentScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        m6 m6Var = new m6(getNameLowerCased(scannerStep.getFileSide()), scannerStep.getIndex(), scannerStep.isAngled(), scannerStep.isAutoDetectAvailable());
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(m6Var);
        }
    }

    public final void onSuccess(DocumentScannerResult result) {
        List listM;
        p013kotlin.jvm.internal.s.k(result, "result");
        MrzInfo mrzInfo = result.getMrzInfo();
        if (mrzInfo instanceof MrtdMrzInfo) {
            List<MrtdMrzInfoValidationError> validationErrors = ((MrtdMrzInfo) mrzInfo).getValidationErrors();
            listM = new ArrayList(p013kotlin.collections.v.y(validationErrors, 10));
            Iterator<T> it = validationErrors.iterator();
            while (it.hasNext()) {
                listM.add(getNameLowerCased((MrtdMrzInfoValidationError) it.next()));
            }
        } else if (mrzInfo instanceof IdlMrzInfo) {
            List<IdlMrzInfoValidationError> validationErrors2 = ((IdlMrzInfo) mrzInfo).getValidationErrors();
            listM = new ArrayList(p013kotlin.collections.v.y(validationErrors2, 10));
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
        C4199g6 c4199g6 = new C4199g6(mrzInfo != null, listM);
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(c4199g6);
        }
        clearScannerContext();
    }

    public final void onTakeSnapshot(DocumentScannerStep scannerStep) {
        p013kotlin.jvm.internal.s.k(scannerStep, "scannerStep");
        n6 n6Var = n6.f38666a;
        AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
        if (analytics != null) {
            analytics.trackNew(n6Var);
        }
    }
}
