package com.fourthline.vision.internal;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class F6 extends androidx.p003lifecycle.c1 implements C4298v.a, InterfaceC4197g4, F5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H6 f37691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private K2 f37692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r6 f37693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4197g4 f37694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4284t f37695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C4213i4 f37696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A3 f37697g;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37698a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SurfaceTexture f37700c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SurfaceTexture surfaceTexture, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37700c = surfaceTexture;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return F6.this.new a(this.f37700c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f37698a;
            if (i11 == 0) {
                jn0.t.b(obj);
                F6.this.f37692b.start();
                H6 h11 = F6.this.f37691a;
                List<? extends Surface> listP = p013kotlin.collections.v.p(new Surface(this.f37700c), F6.this.f37692b.getSurface());
                this.f37698a = 1;
                obj = h11.start(listP, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            Try r11 = (Try) obj;
            F6 f11 = F6.this;
            if (r11 instanceof Try.Failure) {
                f11.f37694d.getScannerCallback().onScannerResult(TryKt.failure(((Try.Failure) r11).getException()));
            } else {
                if (!(r11 instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (f11.f37696f.getShouldStartAutomatically()) {
                    f11.f37694d.start();
                }
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public F6(H6 imageProducer, K2 imageDataSource, r6 visionInfoProvider, InterfaceC4197g4 scanner, C4284t cameraFocusManager, C4213i4 scannerConfig, A3 detector) {
        p013kotlin.jvm.internal.s.k(imageProducer, "imageProducer");
        p013kotlin.jvm.internal.s.k(imageDataSource, "imageDataSource");
        p013kotlin.jvm.internal.s.k(visionInfoProvider, "visionInfoProvider");
        p013kotlin.jvm.internal.s.k(scanner, "scanner");
        p013kotlin.jvm.internal.s.k(cameraFocusManager, "cameraFocusManager");
        p013kotlin.jvm.internal.s.k(scannerConfig, "scannerConfig");
        p013kotlin.jvm.internal.s.k(detector, "detector");
        this.f37691a = imageProducer;
        this.f37692b = imageDataSource;
        this.f37693c = visionInfoProvider;
        this.f37694d = scanner;
        this.f37695e = cameraFocusManager;
        this.f37696f = scannerConfig;
        this.f37697g = detector;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public InterfaceC4240m3 getMediaRecorderManager() {
        return this.f37694d.getMediaRecorderManager();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public InterfaceC4205h4 getScannerCallback() {
        return this.f37694d.getScannerCallback();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public I5 getStepConfig() {
        return this.f37694d.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public int getStepsCount() {
        return this.f37694d.getStepsCount();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public boolean isRunning() {
        return this.f37694d.isRunning();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void moveToNextStep() {
        this.f37694d.moveToNextStep();
    }

    @Override // com.fourthline.vision.internal.C4298v.a
    public void onSurfaceCreated(SurfaceTexture surface) {
        p013kotlin.jvm.internal.s.k(surface, "surface");
        if (F6.class.isAnonymousClass()) {
            String name = F6.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = F6.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(surface);
        Size previewSize = this.f37693c.getPreviewSize();
        surface.setDefaultBufferSize(previewSize.getWidth(), previewSize.getHeight());
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new a(surface, null), 3, null);
    }

    @Override // com.fourthline.vision.internal.C4298v.a
    public void onSurfaceDestroyed() {
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void resetCurrentStep() {
        this.f37694d.resetCurrentStep();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void resetScanner() {
        this.f37694d.resetScanner();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4, com.fourthline.vision.internal.F5
    public void start() {
        this.f37694d.start();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4, com.fourthline.vision.internal.F5
    public void stop() throws Exception {
        if (F6.class.isAnonymousClass()) {
            String name = F6.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = F6.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        this.f37694d.stop();
        this.f37691a.stop();
        this.f37692b.stop();
        this.f37695e.stop();
        z6.b.a(this.f37697g);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4197g4
    public void takeSnapshot() {
        this.f37694d.takeSnapshot();
    }
}
