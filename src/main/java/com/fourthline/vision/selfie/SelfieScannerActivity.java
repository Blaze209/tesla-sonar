package com.fourthline.vision.selfie;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import co0.n;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.VisionActivity;
import com.fourthline.vision.internal.AbstractC4299v0;
import com.fourthline.vision.internal.C4213i4;
import com.fourthline.vision.internal.C4228k5;
import com.fourthline.vision.internal.C4319y;
import com.fourthline.vision.internal.C4324y4;
import com.fourthline.vision.internal.C6;
import com.fourthline.vision.internal.I5;
import com.fourthline.vision.internal.InterfaceC4227k4;
import com.fourthline.vision.internal.InterfaceC4276r5;
import com.fourthline.vision.internal.L;
import com.fourthline.vision.internal.t6;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.d0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000f\u0010\bR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118PX\u0090\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0010X\u0090D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00178PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001bR\u0014\u0010)\u001a\u00020&8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030.8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerActivity;", "Lcom/fourthline/vision/VisionActivity;", "Lcom/fourthline/vision/selfie/SelfieScannerStep;", "Lcom/fourthline/vision/selfie/SelfieScannerConfig;", "Lcom/fourthline/vision/selfie/SelfieScannerDataSource;", "Lcom/fourthline/vision/selfie/SelfieScannerCallback;", "Lcom/fourthline/vision/selfie/SelfieScanner;", "<init>", "()V", "Lcom/fourthline/vision/internal/t6;", "permission", "Ljn0/h0;", "onPermissionNotGranted$fourthline_vision_release", "(Lcom/fourthline/vision/internal/t6;)V", "onPermissionNotGranted", "onNotSupportedDevice$fourthline_vision_release", "onNotSupportedDevice", "Lcom/fourthline/vision/internal/C6;", "b", "Lkotlin/Lazy;", "getSubcomponent$fourthline_vision_release", "()Lcom/fourthline/vision/internal/C6;", "subcomponent", "", "c", "Z", "isCameraInputMirrored$fourthline_vision_release", "()Z", "isCameraInputMirrored", "getStep", "()Lcom/fourthline/vision/selfie/SelfieScannerStep;", "step", "Lcom/fourthline/vision/RecordingType;", "getRecordingType$fourthline_vision_release", "()Lcom/fourthline/vision/RecordingType;", "recordingType", "getDebugModeEnabled$fourthline_vision_release", "debugModeEnabled", "Landroid/graphics/Rect;", "getDetectionArea$fourthline_vision_release", "()Landroid/graphics/Rect;", "detectionArea", "Landroid/view/View;", "getOverlayView$fourthline_vision_release", "()Landroid/view/View;", "overlayView", "Lcom/fourthline/vision/internal/k4;", "getScannerDataSource$fourthline_vision_release", "()Lcom/fourthline/vision/internal/k4;", "scannerDataSource", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SelfieScannerActivity extends VisionActivity<SelfieScannerStep, SelfieScannerConfig> implements SelfieScannerDataSource, SelfieScannerCallback, SelfieScanner {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy subcomponent = m.b(new wn0.a() { // from class: com.fourthline.vision.selfie.a
        @Override // wn0.a
        public final Object invoke() {
            return SelfieScannerActivity.subcomponent_delegate$lambda$1(this.f39187a);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isCameraInputMirrored = true;

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
            super(0, obj, SelfieScannerActivity.class, "getConfig", "getConfig()Lcom/fourthline/vision/selfie/SelfieScannerConfig;", 0);
        }

        @Override // wn0.a
        public final SelfieScannerConfig invoke() {
            return ((SelfieScannerActivity) this.receiver).getConfig();
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
    public static final Matrix _get_scannerDataSource_$lambda$2(SelfieScannerActivity selfieScannerActivity) {
        Matrix imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release = selfieScannerActivity.getImageToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
        return imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release == null ? new Matrix() : imageToScreenCoordsMatrixAndTranslation$fourthline_vision_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4276r5 subcomponent_delegate$lambda$1(final SelfieScannerActivity selfieScannerActivity) {
        return AbstractC4299v0.a().a(new L(selfieScannerActivity, C4213i4.f38402g.initFrom(selfieScannerActivity.getConfig()), null, null, null, 28, null)).a(C4319y.f39104b.selfieCamera$fourthline_vision_release()).a().selfieBuilder().selfieModule(new C4324y4(new a(selfieScannerActivity), new wn0.a() { // from class: com.fourthline.vision.selfie.c
            @Override // wn0.a
            public final Object invoke() {
                return SelfieScannerActivity.subcomponent_delegate$lambda$1$lambda$0(this.f39189a);
            }
        }, new b(new d0(selfieScannerActivity) { // from class: com.fourthline.vision.selfie.SelfieScannerActivity.c
            @Override // p013kotlin.jvm.internal.d0, co0.n
            public Object get() {
                return ((SelfieScannerActivity) this.receiver).getScannerDataSource$fourthline_vision_release();
            }
        }), selfieScannerActivity.getScannerDataSource$fourthline_vision_release(), null, null, 48, null)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelfieScannerCallback subcomponent_delegate$lambda$1$lambda$0(SelfieScannerActivity selfieScannerActivity) {
        return selfieScannerActivity;
    }

    @Override // com.fourthline.vision.VisionActivity
    public boolean getDebugModeEnabled$fourthline_vision_release() {
        return getConfig().getDebugModeEnabled();
    }

    @Override // com.fourthline.vision.VisionActivity
    public Rect getDetectionArea$fourthline_vision_release() {
        return getFaceDetectionArea();
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
        return new C4228k5(this, null, new wn0.a() { // from class: com.fourthline.vision.selfie.b
            @Override // wn0.a
            public final Object invoke() {
                return SelfieScannerActivity._get_scannerDataSource_$lambda$2(this.f39188a);
            }
        }, 2, null);
    }

    @Override // com.fourthline.vision.selfie.SelfieScanner
    public SelfieScannerStep getStep() {
        I5 stepConfig = getVisionView$fourthline_vision_release().getStepConfig();
        if (stepConfig != null) {
            return (SelfieScannerStep) stepConfig.getStepType();
        }
        return null;
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

    @Override // com.fourthline.vision.VisionActivity
    public void onNotSupportedDevice$fourthline_vision_release() {
        onFail(SelfieScannerError.UNKNOWN);
    }

    @Override // com.fourthline.vision.VisionActivity
    public void onPermissionNotGranted$fourthline_vision_release(t6 permission) {
        SelfieScannerError selfieScannerError;
        s.k(permission, "permission");
        int i11 = WhenMappings.$EnumSwitchMapping$0[permission.ordinal()];
        if (i11 == 1) {
            selfieScannerError = SelfieScannerError.CAMERA_PERMISSION_NOT_GRANTED;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            selfieScannerError = SelfieScannerError.RECORD_AUDIO_PERMISSION_NOT_GRANTED;
        }
        onFail(selfieScannerError);
    }
}
