package com.fourthline.vision;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.content.f;
import androidx.fragment.app.Fragment;
import androidx.p003lifecycle.w;
import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.analytics.internal.AnalyticsInterface;
import com.fourthline.core.DeviceMetadataKt;
import com.fourthline.vision.internal.C6;
import com.fourthline.vision.internal.D6;
import com.fourthline.vision.internal.InterfaceC4227k4;
import com.fourthline.vision.internal.O3;
import com.fourthline.vision.internal.t6;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0006*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH ¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0006H ¢\u0006\u0004\b\u0013\u0010\u0005J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0005J-\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0005R\u001b\u0010&\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000028 X \u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068 X \u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\t8 X \u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020'8 X \u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0016\u0010B\u001a\u0004\u0018\u00010\u001e8 X \u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010C8 X \u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\t8 X \u0004¢\u0006\u0006\u001a\u0004\bG\u0010;R\u0016\u0010L\u001a\u0004\u0018\u00010I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/fourthline/vision/VisionFragment;", "SCANNER_STEP", "SCANNER_CONFIG", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Ljn0/h0;", "setupVisionView", "", "", "isPermissionDenied", "(Ljava/lang/String;)Z", "Lcom/fourthline/vision/internal/t6;", "trackPermissionNotGranted", "(Lcom/fourthline/vision/internal/t6;)V", "finishFragment", "permission", "onPermissionNotGranted$fourthline_vision_release", "onPermissionNotGranted", "onNotSupportedDevice$fourthline_vision_release", "onNotSupportedDevice", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "a", "Lkotlin/Lazy;", "getRoot", "()Landroid/view/ViewGroup;", "root", "Landroid/graphics/Rect;", "b", "Landroid/graphics/Rect;", "zeroRect", "Lcom/fourthline/vision/internal/D6;", "visionView", "Lcom/fourthline/vision/internal/D6;", "getVisionView$fourthline_vision_release", "()Lcom/fourthline/vision/internal/D6;", "setVisionView$fourthline_vision_release", "(Lcom/fourthline/vision/internal/D6;)V", "Lcom/fourthline/vision/internal/C6;", "getSubcomponent$fourthline_vision_release", "()Lcom/fourthline/vision/internal/C6;", "subcomponent", "Lcom/fourthline/vision/RecordingType;", "getRecordingType$fourthline_vision_release", "()Lcom/fourthline/vision/RecordingType;", "recordingType", "getDebugModeEnabled$fourthline_vision_release", "()Z", "debugModeEnabled", "getDetectionArea$fourthline_vision_release", "()Landroid/graphics/Rect;", "detectionArea", "getOverlayView$fourthline_vision_release", "()Landroid/view/View;", "overlayView", "Lcom/fourthline/vision/internal/k4;", "getScannerDataSource$fourthline_vision_release", "()Lcom/fourthline/vision/internal/k4;", "scannerDataSource", "isCameraInputMirrored$fourthline_vision_release", "isCameraInputMirrored", "Landroid/graphics/Matrix;", "getImageToScreenCoordsMatrixAndTranslation$fourthline_vision_release", "()Landroid/graphics/Matrix;", "imageToScreenCoordsMatrixAndTranslation", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class VisionFragment<SCANNER_STEP, SCANNER_CONFIG> extends Fragment {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy root = m.b(new wn0.a() { // from class: com.fourthline.vision.d
        @Override // wn0.a
        public final Object invoke() {
            return VisionFragment.root_delegate$lambda$0(this.f37556a);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Rect zeroRect = new Rect(0, 0, 0, 0);
    public D6 visionView;

    private final void finishFragment() {
        getParentFragmentManager().r().n(this).g();
    }

    private final ViewGroup getRoot() {
        return (ViewGroup) this.root.getValue();
    }

    private final boolean isPermissionDenied(String str) {
        return f.b(requireContext(), str) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout root_delegate$lambda$0(VisionFragment visionFragment) {
        return new FrameLayout(visionFragment.requireContext());
    }

    private final void setupVisionView() {
        getVisionView$fourthline_vision_release().setOverlayView$fourthline_vision_release(getOverlayView$fourthline_vision_release());
        getVisionView$fourthline_vision_release().setContentDetectionAreaProvider$fourthline_vision_release(new wn0.a() { // from class: com.fourthline.vision.c
            @Override // wn0.a
            public final Object invoke() {
                return VisionFragment.setupVisionView$lambda$6(this.f37555a);
            }
        });
        if (getDebugModeEnabled$fourthline_vision_release()) {
            getVisionView$fourthline_vision_release().enableDebugView$fourthline_vision_release(getSubcomponent$fourthline_vision_release().getDebugConsumer(), isCameraInputMirrored$fourthline_vision_release());
        }
        getRoot().addView(getVisionView$fourthline_vision_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect setupVisionView$lambda$6(VisionFragment visionFragment) {
        return visionFragment.isResumed() ? visionFragment.getDetectionArea$fourthline_vision_release() : visionFragment.zeroRect;
    }

    private final void trackPermissionNotGranted(t6 t6Var) {
        getSubcomponent$fourthline_vision_release().getVisionAnalytics().onPermissionNotGranted(t6Var);
    }

    public abstract boolean getDebugModeEnabled$fourthline_vision_release();

    public abstract Rect getDetectionArea$fourthline_vision_release();

    public final Matrix getImageToScreenCoordsMatrixAndTranslation$fourthline_vision_release() {
        if (this.visionView != null) {
            return getVisionView$fourthline_vision_release().getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
        }
        return null;
    }

    public abstract View getOverlayView$fourthline_vision_release();

    public abstract RecordingType getRecordingType$fourthline_vision_release();

    public abstract InterfaceC4227k4 getScannerDataSource$fourthline_vision_release();

    public abstract C6 getSubcomponent$fourthline_vision_release();

    public final D6 getVisionView$fourthline_vision_release() {
        D6 d11 = this.visionView;
        if (d11 != null) {
            return d11;
        }
        s.B("visionView");
        return null;
    }

    public abstract boolean isCameraInputMirrored$fourthline_vision_release();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (DeviceMetadataKt.isDeviceRooted()) {
            AnalyticsInterface analytics = FourthlineAnalytics.INSTANCE.getAnalytics();
            if (analytics != null) {
                analytics.trackNew(O3.f37864a);
            }
            onNotSupportedDevice$fourthline_vision_release();
            finishFragment();
            return;
        }
        C6 subcomponent$fourthline_vision_release = getSubcomponent$fourthline_vision_release();
        Context contextRequireContext = requireContext();
        s.j(contextRequireContext, "requireContext(...)");
        setVisionView$fourthline_vision_release(new D6(contextRequireContext, null, 0, subcomponent$fourthline_vision_release.getVisionViewModel(), subcomponent$fourthline_vision_release.getMediaCodecDataSource(), subcomponent$fourthline_vision_release.getLegacyPreviewCalculator(), subcomponent$fourthline_vision_release.getCameraFocusManager(), 6, null));
        if (isPermissionDenied("android.permission.CAMERA")) {
            t6 t6Var = t6.CAMERA;
            trackPermissionNotGranted(t6Var);
            onPermissionNotGranted$fourthline_vision_release(t6Var);
        } else if (getRecordingType$fourthline_vision_release() == RecordingType.VIDEO_WITH_AUDIO && isPermissionDenied("android.permission.RECORD_AUDIO")) {
            t6 t6Var2 = t6.RECORD_AUDIO;
            trackPermissionNotGranted(t6Var2);
            onPermissionNotGranted$fourthline_vision_release(t6Var2);
        } else {
            D6 visionView$fourthline_vision_release = getVisionView$fourthline_vision_release();
            if (visionView$fourthline_vision_release == null) {
                visionView$fourthline_vision_release = null;
            }
            if (visionView$fourthline_vision_release != null) {
                getLifecycle().a(visionView$fourthline_vision_release);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        s.k(inflater, "inflater");
        if (DeviceMetadataKt.isDeviceRooted()) {
            return null;
        }
        setupVisionView();
        return getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() throws Exception {
        super.onDestroy();
        if (DeviceMetadataKt.isDeviceRooted()) {
            return;
        }
        ViewParent root = getRoot();
        w wVar = root instanceof w ? (w) root : null;
        if (wVar != null) {
            getLifecycle().d(wVar);
        }
        getVisionView$fourthline_vision_release().stop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (DeviceMetadataKt.isDeviceRooted()) {
            return;
        }
        getRoot().removeView(getVisionView$fourthline_vision_release());
    }

    public abstract void onNotSupportedDevice$fourthline_vision_release();

    public abstract void onPermissionNotGranted$fourthline_vision_release(t6 permission);

    public final void setVisionView$fourthline_vision_release(D6 d11) {
        s.k(d11, "<set-?>");
        this.visionView = d11;
    }
}
