package zf0;

import android.view.View;
import androidx.camera.view.PreviewView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.camera.NoSuitableCameraError;
import java.io.File;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001eB7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0096@¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020+0.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010/R\u0014\u00103\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u00102R\u0014\u00106\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lzf0/y;", "Lzf0/i;", "Leg0/a;", "cameraStatsManager", "Lfi0/c;", "sdkFilesManager", "Lzf0/s;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Lzf0/x;", "cameraXBinder", "<init>", "(Leg0/a;Lfi0/c;Lzf0/s;Landroidx/camera/view/PreviewView;Lzf0/x;)V", "Ljn0/h0;", "b", "()V", "", "enable", "c", "(Z)V", "f", "Ljn0/s;", "Ljava/io/File;", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "k", "enableAnalyzer", "j", "a", "Leg0/a;", "Lfi0/c;", "Lzf0/s;", DateTokenConverter.CONVERTER_KEY, "Landroidx/camera/view/PreviewView;", "n", "()Landroidx/camera/view/PreviewView;", "e", "Lzf0/x;", "Z", "isBound", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lzf0/w;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_previewState", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "cameraState", "Lzf0/u;", "()Lzf0/u;", "cameraProperties", "h", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final eg0.a cameraStatsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fi0.c sdkFilesManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s cameraPreview;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PreviewView previewView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x cameraXBinder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isBound;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private MutableStateFlow<w> _previewState;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzf0/y$a;", "", "Lzf0/s;", "cameraPreview", "Landroidx/camera/view/PreviewView;", "previewView", "Lzf0/x;", "cameraXBinder", "Lzf0/y;", "a", "(Lzf0/s;Landroidx/camera/view/PreviewView;Lzf0/x;)Lzf0/y;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        y a(s cameraPreview, PreviewView previewView, x cameraXBinder);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"zf0/y$b", "Landroidx/lifecycle/j0;", "Landroidx/camera/view/PreviewView$f;", "value", "Ljn0/h0;", "a", "(Landroidx/camera/view/PreviewView$f;)V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements androidx.p003lifecycle.j0<PreviewView.f> {
        b() {
        }

        @Override // androidx.p003lifecycle.j0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(PreviewView.f value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value == PreviewView.f.STREAMING) {
                y.this._previewState.setValue(w.e.f128333a);
                y.this.getPreviewView().getPreviewStreamState().removeObserver(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"zf0/y$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            p013kotlin.jvm.internal.s.k(v11, "v");
            y.this.cameraStatsManager.b();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            p013kotlin.jvm.internal.s.k(v11, "v");
            y.this.cameraStatsManager.a();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.CameraXController", f = "CameraXController.kt", i = {}, l = {83}, m = "takePicture-IoAF18A", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f128344n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f128346p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f128344n = obj;
            this.f128346p |= Integer.MIN_VALUE;
            Object objI = y.this.i(this);
            return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : jn0.s.a(objI);
        }
    }

    public y(eg0.a cameraStatsManager, fi0.c sdkFilesManager, s cameraPreview, PreviewView previewView, x cameraXBinder) {
        p013kotlin.jvm.internal.s.k(cameraStatsManager, "cameraStatsManager");
        p013kotlin.jvm.internal.s.k(sdkFilesManager, "sdkFilesManager");
        p013kotlin.jvm.internal.s.k(cameraPreview, "cameraPreview");
        p013kotlin.jvm.internal.s.k(previewView, "previewView");
        p013kotlin.jvm.internal.s.k(cameraXBinder, "cameraXBinder");
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraPreview = cameraPreview;
        this.previewView = previewView;
        this.cameraXBinder = cameraXBinder;
        this._previewState = StateFlowKt.MutableStateFlow(w.c.f128331a);
    }

    @Override // zf0.i
    public StateFlow<w> a() {
        return this._previewState;
    }

    @Override // zf0.i
    public void b() {
        if (this.isBound) {
            return;
        }
        this._previewState.setValue(w.d.f128332a);
        this.isBound = true;
        this.cameraXBinder.a();
        getPreviewView().getPreviewStreamState().observeForever(new b());
        getPreviewView().addOnAttachStateChangeListener(new c());
    }

    @Override // zf0.i
    public void c(boolean enable) {
        this.cameraPreview.c(enable);
    }

    @Override // zf0.i
    public u d() {
        return this.cameraPreview.e();
    }

    @Override // zf0.i
    public void f() {
        this.cameraPreview.d(getPreviewView());
    }

    @Override // zf0.i
    public Object g(Continuation<? super jn0.s<Boolean>> continuation) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(Boxing.boxBoolean(false));
    }

    @Override // zf0.i
    /* JADX INFO: renamed from: h */
    public boolean getRecordingOngoing() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zf0.i
    public Object i(Continuation<? super jn0.s<? extends File>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f128346p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f128346p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f128344n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f128346p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        s sVar = this.cameraPreview;
        fi0.c cVar = this.sdkFilesManager;
        dVar.f128346p = 1;
        Object objJ = sVar.j(cVar, dVar);
        return objJ == coroutine_suspended ? coroutine_suspended : objJ;
    }

    @Override // zf0.i
    public Object k(Continuation<? super jn0.s<? extends File>> continuation) {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return jn0.s.b(jn0.t.a(new NoSuitableCameraError()));
    }

    @Override // zf0.i
    /* JADX INFO: renamed from: n, reason: from getter */
    public PreviewView getPreviewView() {
        return this.previewView;
    }

    @Override // zf0.i
    public void j(boolean enableAnalyzer) {
    }
}
