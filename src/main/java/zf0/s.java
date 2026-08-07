package zf0;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.view.PreviewView;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import c0.b2;
import c0.h1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.camera.CameraError;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0015\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0086@¢\u0006\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010(\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lzf0/s;", "", "<init>", "()V", "Lc0/i;", "camera", "Lzf0/u;", IntegerTokenConverter.CONVERTER_KEY, "(Lc0/i;)Lzf0/u;", "Landroidx/camera/view/PreviewView;", "previewView", "Lzf0/s$a;", "cameraDirection", "Landroidx/camera/core/f$a;", "imageAnalyzer", "", "useCameraCapture", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraError;", "Ljn0/h0;", "onCameraError", "f", "(Landroidx/camera/view/PreviewView;Lzf0/s$a;Landroidx/camera/core/f$a;ZLwn0/l;)V", "enable", "c", "(Z)V", DateTokenConverter.CONVERTER_KEY, "(Landroidx/camera/view/PreviewView;)V", "Lfi0/c;", "sdkFilesManager", "Ljn0/s;", "Ljava/io/File;", "j", "(Lfi0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzf0/v;", "a", "Lzf0/v;", "currentCameraSession", "e", "()Lzf0/u;", "cameraProperties", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private v currentCameraSession;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzf0/s$a;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "EXTERNAL", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        FRONT,
        BACK,
        EXTERNAL;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"zf0/s$b", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ExecutorService f128302a;

        b(ExecutorService executorService) {
            this.f128302a = executorService;
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            p013kotlin.jvm.internal.s.k(owner, "owner");
            this.f128302a.shutdown();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.CameraPreview", f = "CameraPreview.kt", i = {0, 0}, l = {164}, m = "takePicture-gIAlu-s", n = {"this", "sdkFilesManager"}, s = {"L$0", "L$1"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f128303n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f128304o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f128305p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f128307r;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128305p = obj;
            this.f128307r |= Integer.MIN_VALUE;
            Object objJ = s.this.j(null, this);
            return objJ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ : jn0.s.a(objJ);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"zf0/s$d", "Lc0/r0$f;", "Lc0/r0$h;", "outputFileResults", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lc0/r0$h;)V", "Landroidx/camera/core/ImageCaptureException;", "exception", "c", "(Landroidx/camera/core/ImageCaptureException;)V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements c0.r0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<jn0.s<? extends File>> f128308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f128309b;

        /* JADX WARN: Multi-variable type inference failed */
        d(Continuation<? super jn0.s<? extends File>> continuation, File file) {
            this.f128308a = continuation;
            this.f128309b = file;
        }

        @Override // c0.r0.f
        public void c(ImageCaptureException exception) {
            p013kotlin.jvm.internal.s.k(exception, "exception");
            Continuation<jn0.s<? extends File>> continuation = this.f128308a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(jn0.s.a(jn0.s.b(jn0.t.a(exception)))));
        }

        @Override // c0.r0.f
        public void d(c0.r0.h outputFileResults) {
            p013kotlin.jvm.internal.s.k(outputFileResults, "outputFileResults");
            Continuation<jn0.s<? extends File>> continuation = this.f128308a;
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(jn0.s.a(jn0.s.b(this.f128309b))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final PreviewView previewView, final boolean z11, final androidx.camera.core.f.a aVar, final c0.p pVar, final s sVar, final wn0.l lVar) {
        if (previewView.isAttachedToWindow()) {
            Context context = previewView.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            ActionBar supportActionBar = b0.b(context).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.k();
            }
            final int rotation = previewView.getDisplay().getRotation();
            final ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            x0.h.Companion companion = x0.h.INSTANCE;
            Context context2 = previewView.getContext();
            p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
            final com.google.common.util.concurrent.s<x0.h> sVarB = companion.b(context2);
            sVarB.b(new Runnable() { // from class: zf0.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.h(sVarB, rotation, z11, aVar, executorServiceNewSingleThreadExecutor, previewView, pVar, sVar, lVar);
                }
            }, androidx.core.content.b.getMainExecutor(previewView.getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(com.google.common.util.concurrent.s sVar, int i11, boolean z11, androidx.camera.core.f.a aVar, ExecutorService executorService, PreviewView previewView, c0.p pVar, s sVar2, wn0.l lVar) {
        c0.r0 r0VarE;
        x0.h hVar = (x0.h) sVar.get();
        h1 h1VarE = new h1.a().a(i11).e();
        p013kotlin.jvm.internal.s.j(h1VarE, "build(...)");
        b2.a aVar2 = new b2.a();
        aVar2.a(h1VarE);
        if (z11) {
            r0VarE = new c0.r0.b().h(1).a(i11).e();
            aVar2.a(r0VarE);
        } else {
            r0VarE = null;
        }
        if (aVar != null) {
            androidx.camera.core.f fVarE = new androidx.camera.core.f.c().l(0).c(new Size(2000, 2000)).a(i11).e();
            p013kotlin.jvm.internal.s.j(fVarE, "build(...)");
            fVarE.n0(executorService, aVar);
            aVar2.a(fVarE);
        }
        hVar.h();
        try {
            Context context = previewView.getContext();
            p013kotlin.jvm.internal.s.j(context, "getContext(...)");
            androidx.appcompat.app.c cVarB = b0.b(context);
            b2 b2VarB = aVar2.b();
            p013kotlin.jvm.internal.s.j(b2VarB, "build(...)");
            c0.i iVarD = hVar.d(cVarB, pVar, b2VarB);
            sVar2.currentCameraSession = new v(iVarD, r0VarE, sVar2.i(iVarD));
            Context context2 = previewView.getContext();
            p013kotlin.jvm.internal.s.j(context2, "getContext(...)");
            yh0.f.h(context2).getLifecycle().a(new b(executorService));
            h1VarE.l0(previewView.getSurfaceProvider());
        } catch (IllegalArgumentException unused) {
            lVar.invoke(new NoSuitableCameraError());
        }
    }

    private final u i(c0.i camera) {
        u.b bVar;
        try {
            c0.n nVarC = camera.c();
            p013kotlin.jvm.internal.s.j(nVarC, "getCameraInfo(...)");
            b0.h hVarA = b0.h.a(nVarC);
            p013kotlin.jvm.internal.s.j(hVarA, "from(...)");
            String strC = hVarA.c();
            p013kotlin.jvm.internal.s.j(strC, "getCameraId(...)");
            Rect rect = (Rect) hVarA.b(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect == null) {
                rect = new Rect();
            }
            Size size = new Size(rect.width(), rect.height());
            Integer num = (Integer) hVarA.b(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1) {
                bVar = u.b.Environment;
            } else {
                bVar = (num != null && num.intValue() == 0) ? u.b.User : u.b.Unknown;
            }
            Range[] rangeArr = (Range[]) hVarA.b(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int iIntValue = 0;
            if (rangeArr != null && rangeArr.length != 0) {
                Iterator itA = p013kotlin.jvm.internal.c.a(rangeArr);
                while (itA.hasNext()) {
                    Integer num2 = (Integer) ((Range) itA.next()).getUpper();
                    if (num2.intValue() > iIntValue) {
                        iIntValue = num2.intValue();
                    }
                }
            }
            return new u(strC, bVar, size, iIntValue);
        } catch (IllegalArgumentException unused) {
            return new u(null, null, null, 0, 15, null);
        }
    }

    public final void c(boolean enable) {
        c0.i camera;
        v vVar = this.currentCameraSession;
        if (vVar == null || (camera = vVar.getCamera()) == null) {
            return;
        }
        camera.b().c(enable);
    }

    public final void d(PreviewView previewView) {
        c0.i camera;
        p013kotlin.jvm.internal.s.k(previewView, "previewView");
        v vVar = this.currentCameraSession;
        if (vVar == null || (camera = vVar.getCamera()) == null) {
            return;
        }
        camera.b().g(new c0.e0.a(new c0.a0(previewView.getDisplay(), camera.c(), previewView.getWidth(), previewView.getHeight()).b(previewView.getWidth() / 2.0f, previewView.getHeight() / 2.0f), 1).b());
    }

    public final u e() {
        u cameraProperties;
        v vVar = this.currentCameraSession;
        return (vVar == null || (cameraProperties = vVar.getCameraProperties()) == null) ? new u(null, null, null, 0, 15, null) : cameraProperties;
    }

    public final void f(final PreviewView previewView, a cameraDirection, final androidx.camera.core.f.a imageAnalyzer, final boolean useCameraCapture, final wn0.l<? super CameraError, jn0.h0> onCameraError) {
        p013kotlin.jvm.internal.s.k(previewView, "previewView");
        p013kotlin.jvm.internal.s.k(cameraDirection, "cameraDirection");
        p013kotlin.jvm.internal.s.k(onCameraError, "onCameraError");
        final c0.p pVarB = new c0.p.a().d(cameraDirection == a.FRONT ? 0 : 1).b();
        p013kotlin.jvm.internal.s.j(pVarB, "build(...)");
        previewView.post(new Runnable() { // from class: zf0.q
            @Override // java.lang.Runnable
            public final void run() {
                s.g(previewView, useCameraCapture, imageAnalyzer, pVarB, this, onCameraError);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(fi0.c cVar, Continuation<? super jn0.s<? extends File>> continuation) {
        c cVar2;
        c0.r0 imageCapture;
        if (continuation instanceof c) {
            cVar2 = (c) continuation;
            int i11 = cVar2.f128307r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.f128307r = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(continuation);
            }
        } else {
            cVar2 = new c(continuation);
        }
        Object orThrow = cVar2.f128305p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar2.f128307r;
        if (i12 == 0) {
            jn0.t.b(orThrow);
            cVar2.f128303n = this;
            cVar2.f128304o = cVar;
            cVar2.f128307r = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(cVar2));
            File fileD = cVar.d("jpg");
            c0.r0.g gVarA = new c0.r0.g.a(fileD).a();
            p013kotlin.jvm.internal.s.j(gVarA, "build(...)");
            v vVar = this.currentCameraSession;
            if (vVar != null && (imageCapture = vVar.getImageCapture()) != null) {
                imageCapture.I0(gVarA, ExecutorsKt.asExecutor(Dispatchers.getMain().getImmediate()), new d(safeContinuation, fileD));
            }
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(cVar2);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(orThrow);
        }
        return ((jn0.s) orThrow).getValue();
    }
}
