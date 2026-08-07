package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.Try;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.document.DocumentScannerCallback;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerMetadata;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepMetadata;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class S1 extends AbstractC4168d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wn0.a f37936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DocumentScannerCallback f37937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimestampProvider f37938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LocationProvider f37939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC4248n4 f37940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC4248n4 f37941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MrzInfo f37942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private DocumentScannerStepResult f37943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f37944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37945m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(wn0.a<DocumentScannerConfig> configFactory, DocumentScannerCallback callback, TimestampProvider timestampProvider, LocationProvider locationProvider, InterfaceC4248n4 scannerErrorMapper, InterfaceC4248n4 stepErrorMapper, InterfaceC4159b6 analytics) {
        super(analytics);
        p013kotlin.jvm.internal.s.k(configFactory, "configFactory");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(scannerErrorMapper, "scannerErrorMapper");
        p013kotlin.jvm.internal.s.k(stepErrorMapper, "stepErrorMapper");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f37936d = configFactory;
        this.f37937e = callback;
        this.f37938f = timestampProvider;
        this.f37939g = locationProvider;
        this.f37940h = scannerErrorMapper;
        this.f37941i = stepErrorMapper;
        this.f37944l = new ArrayList();
        this.f37945m = true;
    }

    private final DocumentScannerConfig getConfig() {
        return (DocumentScannerConfig) this.f37936d.invoke();
    }

    private final void onFail(EnumC4241m4 enumC4241m4) {
        if (getScannerLevelCallbacksAllowed()) {
            setScannerLevelCallbacksAllowed(false);
            this.f37937e.onFail((DocumentScannerError) this.f37940h.convertError(enumC4241m4));
        }
    }

    private final void onStepFail(EnumC4241m4 enumC4241m4) {
        DocumentScannerError documentScannerError;
        if (getScannerLevelCallbacksAllowed()) {
            try {
                documentScannerError = (DocumentScannerError) this.f37940h.convertError(enumC4241m4);
            } catch (IllegalArgumentException unused) {
                documentScannerError = null;
            }
            if (documentScannerError == DocumentScannerError.TIMEOUT) {
                this.f37937e.onFail(documentScannerError);
                setScannerLevelCallbacksAllowed(false);
            } else {
                this.f37937e.onStepFail((DocumentScannerStepError) this.f37941i.convertError(enumC4241m4));
            }
            this.f37945m = false;
        }
    }

    private final void onStepSuccess(K5 k11) {
        DocumentScannerStep documentScannerStep;
        if (k11 instanceof InterfaceC4163c2) {
            if (k11 instanceof InterfaceC4163c2.b) {
                this.f37942j = ((InterfaceC4163c2.b) k11).getMrz();
            }
            if (!getScannerLevelCallbacksAllowed() || (documentScannerStep = (DocumentScannerStep) getCurrentStep()) == null) {
                return;
            }
            DocumentScannerStepResult documentScannerStepResult = new DocumentScannerStepResult(k11.getImage(), new DocumentScannerStepMetadata(this.f37938f.getCurrentTime(), this.f37939g.getLocation(), documentScannerStep.getFileSide(), documentScannerStep.isAngled()), ((InterfaceC4163c2) k11).getValidationErrors());
            this.f37943k = documentScannerStepResult;
            this.f37937e.onStepSuccess(documentScannerStepResult);
        }
    }

    private final void onSuccess(C4275r4 c4275r4) {
        if (getScannerLevelCallbacksAllowed()) {
            setScannerLevelCallbacksAllowed(false);
            MrzInfo mrzInfo = this.f37942j;
            URI videoUrl = c4275r4.getVideoUrl();
            Coordinate coordinate = null;
            VideoRecording videoRecording = videoUrl != null ? new VideoRecording(videoUrl, getConfig().getVideoDuration(), this.f37939g.getLocation()) : null;
            List list = this.f37944l;
            DocumentType type = getConfig().getType();
            Date currentTime = this.f37938f.getCurrentTime();
            for (DocumentScannerStepResult documentScannerStepResult : this.f37944l) {
                Coordinate location = c4275r4.getMetadata().getLocation();
                if (location != null) {
                    coordinate = location;
                    break;
                }
            }
            this.f37937e.onSuccess(new DocumentScannerResult(videoRecording, mrzInfo, type, list, new DocumentScannerMetadata(currentTime, coordinate, c4275r4.getMetadata().getMotionData())));
        }
    }

    private final void onWarnings(List<? extends DocumentScannerStepWarning> list) {
        if (getScannerLevelCallbacksAllowed() && this.f37945m) {
            this.f37937e.onWarnings(list);
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onMoveToNextStep() {
        super.onMoveToNextStep();
        DocumentScannerStepResult documentScannerStepResult = this.f37943k;
        if (documentScannerStepResult != null) {
            this.f37944l.add(documentScannerStepResult);
        }
        this.f37943k = null;
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onScannerResult(Try<? extends C4275r4> result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            super.onScannerResult(result);
            if (!(result instanceof Try.Failure)) {
                if (!(result instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                onSuccess((C4275r4) ((Try.Success) result).getValue());
                return;
            }
            Throwable exception = ((Try.Failure) result).getException();
            if (exception instanceof AbstractC4255o4.a) {
                onFail(((AbstractC4255o4.a) exception).getError());
            } else if (exception instanceof AbstractC4255o4.g) {
                List<Enum<?>> warnings = ((AbstractC4255o4.g) exception).getWarnings();
                p013kotlin.jvm.internal.s.i(warnings, "null cannot be cast to non-null type kotlin.collections.List<com.fourthline.vision.document.DocumentScannerStepWarning>");
                onWarnings(warnings);
            }
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onStart() {
        super.onStart();
        this.f37944l.clear();
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onStepResult(Try<? extends K5> result) throws Throwable {
        p013kotlin.jvm.internal.s.k(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            super.onStepResult(result);
            if (!(result instanceof Try.Failure)) {
                if (!(result instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                onStepSuccess((K5) ((Try.Success) result).getValue());
                return;
            }
            Throwable exception = ((Try.Failure) result).getException();
            if (exception instanceof AbstractC4255o4.a) {
                onStepFail(((AbstractC4255o4.a) exception).getError());
            } else {
                if (!(exception instanceof AbstractC4255o4.g)) {
                    throw exception;
                }
                List<Enum<?>> warnings = ((AbstractC4255o4.g) exception).getWarnings();
                p013kotlin.jvm.internal.s.i(warnings, "null cannot be cast to non-null type kotlin.collections.List<com.fourthline.vision.document.DocumentScannerStepWarning>");
                onWarnings(warnings);
            }
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onStepsSizeUpdate(int i11) {
        if (getScannerLevelCallbacksAllowed()) {
            this.f37937e.onStepsCountUpdate(i11);
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void reset() {
        super.reset();
        this.f37945m = true;
        setScannerLevelCallbacksAllowed(true);
        this.f37942j = null;
        this.f37943k = null;
        this.f37944l.clear();
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onResetCurrentStep(DocumentScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        super.onResetCurrentStep((Object) step);
        this.f37943k = null;
        if (step.isAutoDetectAvailable()) {
            this.f37942j = null;
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onStepUpdate(DocumentScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        this.f37943k = null;
        if (getScannerLevelCallbacksAllowed()) {
            super.onStepUpdate((Object) step);
            this.f37945m = true;
            this.f37937e.onStepUpdate(step);
        }
    }
}
