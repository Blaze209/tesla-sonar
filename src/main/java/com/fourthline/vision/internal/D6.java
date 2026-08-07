package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p003lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class D6 extends FrameLayout implements androidx.p003lifecycle.w, InterfaceC4197g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F6 f37656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4306w0 f37657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y2 f37658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4284t f37659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f37660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final V3 f37661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout.LayoutParams f37662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f37663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4298v f37664i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D6(Context context, AttributeSet attributeSet, F6 viewModel, InterfaceC4306w0 mediaCodecDataSource, Y2 previewCalculator, C4284t cameraFocusManager) {
        this(context, attributeSet, 0, viewModel, mediaCodecDataSource, previewCalculator, cameraFocusManager, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
        p013kotlin.jvm.internal.s.k(mediaCodecDataSource, "mediaCodecDataSource");
        p013kotlin.jvm.internal.s.k(previewCalculator, "previewCalculator");
        p013kotlin.jvm.internal.s.k(cameraFocusManager, "cameraFocusManager");
    }

    private final FrameLayout getOverlayContainer() {
        return (FrameLayout) this.f37663h.getValue();
    }

    @androidx.p003lifecycle.k0(Lifecycle.a.ON_PAUSE)
    private final void onPause() throws Exception {
        WeakReference<C4298v.a> listener;
        this.f37656a.stop();
        this.f37661f.removeView(this.f37664i);
        InterfaceC4240m3 mediaRecorderManager = this.f37656a.getMediaRecorderManager();
        if (mediaRecorderManager != null) {
            mediaRecorderManager.setVideoRecorder(null);
        }
        C4298v c4298v = this.f37664i;
        if (c4298v != null && (listener = c4298v.getListener()) != null) {
            listener.clear();
        }
        this.f37664i = null;
    }

    @androidx.p003lifecycle.k0(Lifecycle.a.ON_RESUME)
    private final void onResume() {
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        C4298v c4298v = new C4298v(context, null, 0, this.f37657b, 6, null);
        this.f37661f.addView(c4298v);
        c4298v.setListener(new WeakReference<>(this.f37656a));
        InterfaceC4240m3 mediaRecorderManager = this.f37656a.getMediaRecorderManager();
        if (mediaRecorderManager != null) {
            mediaRecorderManager.setVideoRecorder(c4298v);
        }
        this.f37664i = c4298v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout overlayContainer_delegate$lambda$2(Context context, D6 d11) {
        FrameLayout frameLayout = new FrameLayout(context);
        d11.addView(frameLayout, d11.f37662g);
        return frameLayout;
    }

    public final void enableDebugView$fourthline_vision_release(C4313x0 consumer, boolean z11) {
        p013kotlin.jvm.internal.s.k(consumer, "consumer");
        wn0.a<Rect> contentDetectionAreaProvider$fourthline_vision_release = getContentDetectionAreaProvider$fourthline_vision_release();
        Context context = getContext();
        p013kotlin.jvm.internal.s.j(context, "getContext(...)");
        C4320y0 c4320y0 = new C4320y0(contentDetectionAreaProvider$fourthline_vision_release, new wn0.a() { // from class: com.fourthline.vision.internal.d7
            @Override // wn0.a
            public final Object invoke() {
                return this.f38243a.getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
            }
        }, z11, null, context, null, 0, 96, null);
        c4320y0.setDebugConsumer(consumer);
        addView(c4320y0);
    }

    public final wn0.a<Rect> getContentDetectionAreaProvider$fourthline_vision_release() {
        return this.f37659d.getContentDetectionAreaProvider();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public InterfaceC4240m3 getMediaRecorderManager() {
        return this.f37656a.getMediaRecorderManager();
    }

    public final View getOverlayView$fourthline_vision_release() {
        return this.f37660e;
    }

    public final Matrix getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release() {
        return this.f37658c.getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public InterfaceC4205h4 getScannerCallback() {
        return this.f37656a.getScannerCallback();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public I5 getStepConfig() {
        return this.f37656a.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public int getStepsCount() {
        return this.f37656a.getStepsCount();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public boolean isRunning() {
        return this.f37656a.isRunning();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void moveToNextStep() {
        this.f37656a.moveToNextStep();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            Y2 y11 = this.f37658c;
            y11.setupTransformations(i13 - i11, i14 - i12);
            this.f37659d.setup(y11.getScreenRect$fourthline_vision_release(), y11.getCameraPreviewRect$fourthline_vision_release());
            this.f37661f.setScreenRect(y11.getPreviewHolderScreenRect$fourthline_vision_release());
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void resetCurrentStep() {
        this.f37656a.resetCurrentStep();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void resetScanner() {
        this.f37656a.resetScanner();
    }

    public final void setContentDetectionAreaProvider$fourthline_vision_release(wn0.a<Rect> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.f37659d.setContentDetectionAreaProvider(aVar);
    }

    public final void setOverlayView$fourthline_vision_release(View view) {
        if (!p013kotlin.jvm.internal.s.f(view, this.f37660e)) {
            if (view == null) {
                getOverlayContainer().removeAllViews();
            } else {
                getOverlayContainer().removeAllViews();
                getOverlayContainer().addView(view, this.f37662g);
            }
        }
        this.f37660e = view;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4, com.fourthline.vision.internal.F5
    public void start() {
        this.f37656a.start();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4, com.fourthline.vision.internal.F5
    public void stop() throws Exception {
        this.f37656a.stop();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void takeSnapshot() {
        this.f37656a.takeSnapshot();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public D6(Context context, F6 viewModel, InterfaceC4306w0 mediaCodecDataSource, Y2 previewCalculator, C4284t cameraFocusManager) {
        this(context, null, 0, viewModel, mediaCodecDataSource, previewCalculator, cameraFocusManager, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
        p013kotlin.jvm.internal.s.k(mediaCodecDataSource, "mediaCodecDataSource");
        p013kotlin.jvm.internal.s.k(previewCalculator, "previewCalculator");
        p013kotlin.jvm.internal.s.k(cameraFocusManager, "cameraFocusManager");
    }

    public /* synthetic */ D6(Context context, AttributeSet attributeSet, int i11, F6 f11, InterfaceC4306w0 interfaceC4306w0, Y2 y11, C4284t c4284t, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, f11, interfaceC4306w0, y11, c4284t);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D6(final Context context, AttributeSet attributeSet, int i11, F6 viewModel, InterfaceC4306w0 mediaCodecDataSource, Y2 previewCalculator, C4284t cameraFocusManager) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
        p013kotlin.jvm.internal.s.k(mediaCodecDataSource, "mediaCodecDataSource");
        p013kotlin.jvm.internal.s.k(previewCalculator, "previewCalculator");
        p013kotlin.jvm.internal.s.k(cameraFocusManager, "cameraFocusManager");
        this.f37656a = viewModel;
        this.f37657b = mediaCodecDataSource;
        this.f37658c = previewCalculator;
        this.f37659d = cameraFocusManager;
        V3 v11 = new V3(context);
        addView(v11);
        this.f37661f = v11;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 8388727;
        this.f37662g = layoutParams;
        this.f37663h = jn0.m.b(new wn0.a() { // from class: com.fourthline.vision.internal.c7
            @Override // wn0.a
            public final Object invoke() {
                return D6.overlayContainer_delegate$lambda$2(context, this);
            }
        });
        setBackgroundColor(-16777216);
    }
}
