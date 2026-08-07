package com.fourthline.vision.document;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import co0.n;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.VisionActivity;
import com.fourthline.vision.internal.AbstractC4299v0;
import com.fourthline.vision.internal.C4170d1;
import com.fourthline.vision.internal.C4213i4;
import com.fourthline.vision.internal.C4319y;
import com.fourthline.vision.internal.C6;
import com.fourthline.vision.internal.I5;
import com.fourthline.vision.internal.InterfaceC4195g2;
import com.fourthline.vision.internal.InterfaceC4227k4;
import com.fourthline.vision.internal.L;
import com.fourthline.vision.internal.V1;
import com.fourthline.vision.internal.t6;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.d0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\bR!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0010X\u0090D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u001b8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u0014\u00101\u001a\u00020.8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/fourthline/vision/document/DocumentScannerActivity;", "Lcom/fourthline/vision/VisionActivity;", "Lcom/fourthline/vision/document/DocumentScannerStep;", "Lcom/fourthline/vision/document/DocumentScannerConfig;", "Lcom/fourthline/vision/document/DocumentScannerDataSource;", "Lcom/fourthline/vision/document/DocumentScannerCallback;", "Lcom/fourthline/vision/document/DocumentScanner;", "<init>", "()V", "Lcom/fourthline/vision/internal/t6;", "permission", "Ljn0/h0;", "onPermissionNotGranted$fourthline_vision_release", "(Lcom/fourthline/vision/internal/t6;)V", "onPermissionNotGranted", "onNotSupportedDevice$fourthline_vision_release", "onNotSupportedDevice", "takeSnapshot", "resetCurrentStep", "moveToNextStep", "startScanner", "Lcom/fourthline/vision/internal/C6;", "b", "Lkotlin/Lazy;", "getSubcomponent$fourthline_vision_release", "()Lcom/fourthline/vision/internal/C6;", "subcomponent", "", "c", "Z", "isCameraInputMirrored$fourthline_vision_release", "()Z", "isCameraInputMirrored", "getStep", "()Lcom/fourthline/vision/document/DocumentScannerStep;", "step", "", "getStepsCount", "()Ljava/lang/Integer;", "stepsCount", "Lcom/fourthline/vision/RecordingType;", "getRecordingType$fourthline_vision_release", "()Lcom/fourthline/vision/RecordingType;", "recordingType", "getDebugModeEnabled$fourthline_vision_release", "debugModeEnabled", "Landroid/graphics/Rect;", "getDetectionArea$fourthline_vision_release", "()Landroid/graphics/Rect;", "detectionArea", "Landroid/view/View;", "getOverlayView$fourthline_vision_release", "()Landroid/view/View;", "overlayView", "Lcom/fourthline/vision/internal/k4;", "getScannerDataSource$fourthline_vision_release", "()Lcom/fourthline/vision/internal/k4;", "scannerDataSource", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DocumentScannerActivity extends VisionActivity<DocumentScannerStep, DocumentScannerConfig> implements DocumentScannerDataSource, DocumentScannerCallback, DocumentScanner {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy subcomponent = m.b(new wn0.a() { // from class: com.fourthline.vision.document.a
        @Override // wn0.a
        public final Object invoke() {
            return DocumentScannerActivity.subcomponent_delegate$lambda$1(this.f37603a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isCameraInputMirrored;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
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

    /* synthetic */ class a extends p implements wn0.a {
        a(Object obj) {
            super(0, obj, DocumentScannerActivity.class, "getConfig", "getConfig()Lcom/fourthline/vision/document/DocumentScannerConfig;", 0);
        }

        @Override // wn0.a
        public final DocumentScannerConfig invoke() {
            return ((DocumentScannerActivity) this.receiver).getConfig();
        }
    }

    /* synthetic */ class b extends p implements wn0.a {
        b(Object obj) {
            super(0, obj, n.class, "get", "get()Ljava/lang/Object;", 0);
        }

        @Override // wn0.a
        public final InterfaceC4227k4 invoke() {
            return (InterfaceC4227k4) ((n) this.receiver).get();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Matrix _get_scannerDataSource_$lambda$2(DocumentScannerActivity documentScannerActivity) {
        Matrix imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release = documentScannerActivity.getImageToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
        return imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release == null ? new Matrix() : imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4195g2 subcomponent_delegate$lambda$1(final DocumentScannerActivity documentScannerActivity) {
        return AbstractC4299v0.a().a(new L(documentScannerActivity, C4213i4.f38402g.initFrom(documentScannerActivity.getConfig(), documentScannerActivity.getShouldStartAutomatically()), null, null, null, 28, null)).a(C4319y.f39104b.documentCamera$fourthline_vision_release()).a().documentBuilder().documentModule(new C4170d1(new a(documentScannerActivity), new wn0.a() { // from class: com.fourthline.vision.document.b
            @Override // wn0.a
            public final Object invoke() {
                return DocumentScannerActivity.subcomponent_delegate$lambda$1$lambda$0(this.f37604a);
            }
        }, new b(new d0(documentScannerActivity) { // from class: com.fourthline.vision.document.DocumentScannerActivity.c
            @Override // p013kotlin.jvm.internal.d0, co0.n
            public Object get() {
                return ((DocumentScannerActivity) this.receiver).getScannerDataSource$fourthline_vision_release();
            }
        }), documentScannerActivity.getScannerDataSource$fourthline_vision_release())).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentScannerCallback subcomponent_delegate$lambda$1$lambda$0(DocumentScannerActivity documentScannerActivity) {
        return documentScannerActivity;
    }

    @Override // com.fourthline.vision.VisionActivity
    public boolean getDebugModeEnabled$fourthline_vision_release() {
        return getConfig().getDebugModeEnabled();
    }

    @Override // com.fourthline.vision.VisionActivity
    public Rect getDetectionArea$fourthline_vision_release() {
        return getDocumentDetectionArea();
    }

    @Override // com.fourthline.vision.VisionActivity
    public View getOverlayView$fourthline_vision_release() {
        return getOverlayView();
    }

    @Override // com.fourthline.vision.VisionActivity
    public RecordingType getRecordingType$fourthline_vision_release() {
        return getConfig().getRecordingType();
    }

    @Override // com.fourthline.vision.VisionActivity
    public InterfaceC4227k4 getScannerDataSource$fourthline_vision_release() {
        return new V1(this, new wn0.a() { // from class: com.fourthline.vision.document.c
            @Override // wn0.a
            public final Object invoke() {
                return DocumentScannerActivity._get_scannerDataSource_$lambda$2(this.f37605a);
            }
        });
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public DocumentScannerStep getStep() {
        I5 stepConfig = getVisionView$fourthline_vision_release().getStepConfig();
        if (stepConfig != null) {
            return (DocumentScannerStep) stepConfig.getStepType();
        }
        return null;
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public Integer getStepsCount() {
        return Integer.valueOf(getVisionView$fourthline_vision_release().getStepsCount());
    }

    @Override // com.fourthline.vision.VisionActivity
    public C6 getSubcomponent$fourthline_vision_release() {
        return (C6) this.subcomponent.getValue();
    }

    @Override // com.fourthline.vision.VisionActivity
    /* JADX INFO: renamed from: isCameraInputMirrored$fourthline_vision_release, reason: from getter */
    public boolean getIsCameraInputMirrored() {
        return this.isCameraInputMirrored;
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public void moveToNextStep() {
        getVisionView$fourthline_vision_release().moveToNextStep();
    }

    @Override // com.fourthline.vision.VisionActivity
    public void onNotSupportedDevice$fourthline_vision_release() {
        onFail(DocumentScannerError.UNKNOWN);
    }

    @Override // com.fourthline.vision.VisionActivity
    public void onPermissionNotGranted$fourthline_vision_release(t6 permission) {
        DocumentScannerError documentScannerError;
        s.k(permission, "permission");
        int i11 = WhenMappings.$EnumSwitchMapping$0[permission.ordinal()];
        if (i11 == 1) {
            documentScannerError = DocumentScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            documentScannerError = DocumentScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        onFail(documentScannerError);
    }

    @Override // com.fourthline.vision.document.DocumentScannerCallback
    public void onStepsCountUpdate(int i11) {
        DocumentScannerCallback.DefaultImpls.onStepsCountUpdate(this, i11);
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public void resetCurrentStep() {
        getVisionView$fourthline_vision_release().resetCurrentStep();
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public void startScanner() {
        getVisionView$fourthline_vision_release().start();
    }

    @Override // com.fourthline.vision.document.DocumentScanner
    public void takeSnapshot() {
        getVisionView$fourthline_vision_release().takeSnapshot();
    }
}
