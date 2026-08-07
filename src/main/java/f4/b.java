package f4;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import b4.z0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import g4.ScrollAxisRange;
import g4.p;
import g4.s;
import java.util.function.Consumer;
import jn0.h0;
import jn0.t;
import k3.f0;
import k3.j1;
import k3.z3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import p020r2.h1;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001!B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001d\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lf4/b;", "Landroid/view/ScrollCaptureCallback;", "Lg4/p;", "node", "Lw4/p;", "viewportBoundsInWindow", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lf4/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lg4/p;Lw4/p;Lkotlinx/coroutines/CoroutineScope;Lf4/b$a;)V", "Landroid/view/ScrollCaptureSession;", "session", "captureArea", "e", "(Landroid/view/ScrollCaptureSession;Lw4/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "Ljn0/h0;", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "onComplete", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "a", "Lg4/p;", "b", "Lw4/p;", "c", "Lf4/b$a;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/CoroutineScope;", "Lf4/f;", "Lf4/f;", "scrollTracker", "", "f", "I", "requestCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p node;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w4.p viewportBoundsInWindow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a listener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f4.f scrollTracker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lf4/b$a;", "", "Ljn0/h0;", "b", "()V", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: f4.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    static final class C1315b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64303n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Runnable f64305p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1315b(Runnable runnable, Continuation<? super C1315b> continuation) {
            super(2, continuation);
            this.f64305p = runnable;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new C1315b(this.f64305p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64303n;
            if (i11 == 0) {
                t.b(obj);
                f4.f fVar = b.this.scrollTracker;
                this.f64303n = 1;
                if (fVar.g(BitmapDescriptorFactory.HUE_RED, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            b.this.listener.a();
            this.f64305p.run();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1315b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64306n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ScrollCaptureSession f64308p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Rect f64309q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Consumer<Rect> f64310r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f64308p = scrollCaptureSession;
            this.f64309q = rect;
            this.f64310r = consumer;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(this.f64308p, this.f64309q, this.f64310r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64306n;
            if (i11 == 0) {
                t.b(obj);
                b bVar = b.this;
                ScrollCaptureSession scrollCaptureSession = this.f64308p;
                w4.p pVarD = z3.d(this.f64309q);
                this.f64306n = 1;
                obj = bVar.e(scrollCaptureSession, pVarD, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            this.f64310r.accept(z3.b((w4.p) obj));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback", f = "ComposeScrollCaptureCallback.android.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 132}, m = "onScrollCaptureImageRequest", n = {"this", "session", "captureArea", "targetMin", "targetMax", "this", "session", "captureArea", "targetMin", "targetMax"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f64311n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f64312o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f64313p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f64314q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f64315r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f64316s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f64318u;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64316s = obj;
            this.f64318u |= Integer.MIN_VALUE;
            return b.this.e(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {85}, m = "invokeSuspend", n = {"reverseScrolling"}, s = {"Z$0"})
    static final class f extends SuspendLambda implements wn0.p<Float, Continuation<? super Float>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f64320n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f64321o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ float f64322p;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        public final Object a(float f11, Continuation<? super Float> continuation) {
            return ((f) create(Float.valueOf(f11), continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = b.this.new f(continuation);
            fVar.f64322p = ((Number) obj).floatValue();
            return fVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Float f11, Continuation<? super Float> continuation) {
            return a(f11.floatValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64321o;
            if (i11 == 0) {
                t.b(obj);
                float f11 = this.f64322p;
                wn0.p<j3.g, Continuation<? super j3.g>, Object> pVarC = j.c(b.this.node);
                if (pVarC == null) {
                    y3.a.c("Required value was null.");
                    throw new KotlinNothingValueException();
                }
                boolean reverseScrolling = ((ScrollAxisRange) b.this.node.getUnmergedConfig().j(s.f67271a.I())).getReverseScrolling();
                if (reverseScrolling) {
                    f11 = -f11;
                }
                j3.g gVarD = j3.g.d(j3.h.a(BitmapDescriptorFactory.HUE_RED, f11));
                this.f64320n = reverseScrolling;
                this.f64321o = 1;
                obj = pVarC.invoke(gVarD, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z11 = reverseScrolling;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z11 = this.f64320n;
                t.b(obj);
            }
            float fN = j3.g.n(((j3.g) obj).getPackedValue());
            if (z11) {
                fN = -fN;
            }
            return Boxing.boxFloat(fN);
        }
    }

    public b(p pVar, w4.p pVar2, CoroutineScope coroutineScope, a aVar) {
        this.node = pVar;
        this.viewportBoundsInWindow = pVar2;
        this.listener = aVar;
        this.coroutineScope = CoroutineScopeKt.plus(coroutineScope, f4.e.f64326a);
        this.scrollTracker = new f4.f(pVar2.e(), new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:37:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ScrollCaptureSession scrollCaptureSession, w4.p pVar, Continuation<? super w4.p> continuation) {
        d dVar;
        int top;
        int bottom;
        b bVar;
        w4.p pVar2;
        int i11;
        b bVar2;
        ScrollCaptureSession scrollCaptureSession2;
        int i12;
        int iC;
        int iC2;
        w4.p pVarC;
        z0 z0VarE;
        Canvas canvasLockHardwareCanvas;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i13 = dVar.f64318u;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f64318u = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f64316s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = dVar.f64318u;
        if (i14 == 0) {
            t.b(obj);
            top = pVar.getTop();
            bottom = pVar.getBottom();
            f4.f fVar = this.scrollTracker;
            dVar.f64311n = this;
            dVar.f64312o = scrollCaptureSession;
            dVar.f64313p = pVar;
            dVar.f64314q = top;
            dVar.f64315r = bottom;
            dVar.f64318u = 1;
            if (fVar.f(top, bottom, dVar) != coroutine_suspended) {
                bVar = this;
            }
            return coroutine_suspended;
        }
        if (i14 == 1) {
            int i15 = dVar.f64315r;
            int i16 = dVar.f64314q;
            w4.p pVar3 = (w4.p) dVar.f64313p;
            ScrollCaptureSession scrollCaptureSessionA = f4.a.a(dVar.f64312o);
            bVar = (b) dVar.f64311n;
            t.b(obj);
            top = i16;
            pVar = pVar3;
            bottom = i15;
            scrollCaptureSession = scrollCaptureSessionA;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i12 = dVar.f64315r;
            i11 = dVar.f64314q;
            pVar2 = (w4.p) dVar.f64313p;
            ScrollCaptureSession scrollCaptureSessionA2 = f4.a.a(dVar.f64312o);
            bVar2 = (b) dVar.f64311n;
            t.b(obj);
            scrollCaptureSession2 = scrollCaptureSessionA2;
        }
        iC = bVar2.scrollTracker.c(i11);
        iC2 = bVar2.scrollTracker.c(i12);
        pVarC = w4.p.c(pVar2, 0, iC, 0, iC2, 5, null);
        if (iC == iC2) {
            return w4.p.INSTANCE.a();
        }
        z0VarE = bVar2.node.e();
        if (z0VarE != null) {
            throw new IllegalStateException("Could not find coordinator for semantics node.");
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            j1 j1VarB = f0.b(canvasLockHardwareCanvas);
            j1VarB.c(-pVarC.getLeft(), -pVarC.getTop());
            z0VarE.q2(j1VarB, null);
            return pVarC.m(0, yn0.a.d(bVar2.scrollTracker.getScrollAmount()));
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        e eVar = e.f64319c;
        dVar.f64311n = bVar;
        dVar.f64312o = scrollCaptureSession;
        dVar.f64313p = pVar;
        dVar.f64314q = top;
        dVar.f64315r = bottom;
        dVar.f64318u = 2;
        if (h1.c(eVar, dVar) != coroutine_suspended) {
            pVar2 = pVar;
            i11 = top;
            bVar2 = bVar;
            scrollCaptureSession2 = scrollCaptureSession;
            i12 = bottom;
            iC = bVar2.scrollTracker.c(i11);
            iC2 = bVar2.scrollTracker.c(i12);
            pVarC = w4.p.c(pVar2, 0, iC, 0, iC2, 5, null);
            if (iC == iC2) {
                return w4.p.INSTANCE.a();
            }
            z0VarE = bVar2.node.e();
            if (z0VarE != null) {
                throw new IllegalStateException("Could not find coordinator for semantics node.");
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.drawColor(0, BlendMode.CLEAR);
            j1 j1VarB2 = f0.b(canvasLockHardwareCanvas);
            j1VarB2.c(-pVarC.getLeft(), -pVarC.getTop());
            z0VarE.q2(j1VarB2, null);
            return pVarC.m(0, yn0.a.d(bVar2.scrollTracker.getScrollAmount()));
        }
        return coroutine_suspended;
    }

    public void onScrollCaptureEnd(Runnable onReady) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, NonCancellable.INSTANCE, null, new C1315b(onReady, null), 2, null);
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession session, CancellationSignal signal, Rect captureArea, Consumer<Rect> onComplete) {
        f4.d.c(this.coroutineScope, signal, new c(session, captureArea, onComplete, null));
    }

    public void onScrollCaptureSearch(CancellationSignal signal, Consumer<Rect> onReady) {
        onReady.accept(z3.b(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.d();
        this.requestCount = 0;
        this.listener.b();
        onReady.run();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements l<Long, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f64319c = new e();

        e() {
            super(1);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Long l11) {
            a(l11.longValue());
            return h0.f84049a;
        }

        public final void a(long j11) {
        }
    }
}
