package com.fourthline.vision.internal;

import com.fourthline.core.VideoDuration;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.ScannerMetadata;
import com.fourthline.vision.selfie.SelfieScannerCallback;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerMetadata;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.net.URI;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.vision.internal.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4214i5 extends AbstractC4168d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SelfieScannerCallback f38409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4248n4 f38410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LocationProvider f38411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f38412g;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.i5$a */
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l {
        a(Object obj) {
            super(1, obj, C4214i5.class, "onScannerException", "onScannerException(Ljava/lang/Throwable;)V", 0);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return jn0.h0.f84049a;
        }

        public final void invoke(Throwable p11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            ((C4214i5) this.receiver).onScannerException(p11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4214i5(SelfieScannerCallback callback, InterfaceC4248n4 errorMapper, LocationProvider locationProvider, InterfaceC4159b6 analytics) {
        super(analytics);
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(errorMapper, "errorMapper");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f38409d = callback;
        this.f38410e = errorMapper;
        this.f38411f = locationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScannerException(Throwable th2) {
        if (th2 instanceof AbstractC4255o4.a) {
            onFail(((AbstractC4255o4.a) th2).getError());
        } else if (th2 instanceof AbstractC4255o4.g) {
            List<Enum<?>> warnings = ((AbstractC4255o4.g) th2).getWarnings();
            p013kotlin.jvm.internal.s.i(warnings, "null cannot be cast to non-null type kotlin.collections.List<com.fourthline.vision.selfie.SelfieScannerWarning>");
            onWarnings(warnings);
        }
    }

    public final void onFail(EnumC4241m4 error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        if (getScannerLevelCallbacksAllowed()) {
            setScannerLevelCallbacksAllowed(false);
            this.f38409d.onFail((SelfieScannerError) this.f38410e.convertError(error));
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onScannerResult(Try<? extends C4275r4> result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            super.onScannerResult(result);
            if (result instanceof Try.Failure) {
                onScannerException(((Try.Failure) result).getException());
            } else {
                if (!(result instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                onSuccess((C4275r4) ((Try.Success) result).getValue());
            }
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onStepResult(Try<? extends K5> result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            super.onStepResult(result);
            TryKt.handleError(result, new a(this));
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onStepsSizeUpdate(int i11) {
    }

    public final void onSuccess(C4275r4 result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            setScannerLevelCallbacksAllowed(false);
            K5 k11 = (K5) p013kotlin.collections.v.q0(result.getStepResults());
            if (k11 == null) {
                this.f38409d.onFail(SelfieScannerError.UNKNOWN);
                return;
            }
            SelfieScannerCallback selfieScannerCallback = this.f38409d;
            ScannerImage image = k11.getImage();
            ScannerMetadata metadata = result.getMetadata();
            SelfieScannerMetadata selfieScannerMetadata = new SelfieScannerMetadata(metadata.getTimestamp(), metadata.getLocation(), metadata.getMotionData());
            URI videoUrl = result.getVideoUrl();
            selfieScannerCallback.onSuccess(new SelfieScannerResult(image, selfieScannerMetadata, videoUrl != null ? new VideoRecording(videoUrl, VideoDuration.DEFAULT.INSTANCE, this.f38411f.getLocation()) : null));
        }
    }

    public final void onWarnings(List<? extends SelfieScannerWarning> warnings) {
        p013kotlin.jvm.internal.s.k(warnings, "warnings");
        if (this.f38412g && getScannerLevelCallbacksAllowed()) {
            this.f38409d.onWarnings(warnings);
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void reset() {
        super.reset();
        this.f38412g = true;
    }

    @Override // com.fourthline.vision.internal.AbstractC4168d, com.fourthline.vision.internal.InterfaceC4205h4
    public void onStepUpdate(SelfieScannerStep step) {
        p013kotlin.jvm.internal.s.k(step, "step");
        this.f38412g = step == SelfieScannerStep.SELFIE;
        if (getScannerLevelCallbacksAllowed()) {
            super.onStepUpdate((Object) step);
            this.f38409d.onStepUpdate(step);
        }
    }
}
