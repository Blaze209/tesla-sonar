package com.withpersona.sdk2.camera.camera2;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.io.File;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;
import zf0.i;
import zf0.u;
import zf0.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\b*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020%0\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010/R\u0014\u00103\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u00102R\u0014\u00106\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u00105R\u0014\u00109\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/withpersona/sdk2/camera/camera2/a;", "Lzf0/i;", "Lbg0/e;", "camera2ManagerFactory", "<init>", "(Lbg0/e;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c;", "Lkotlinx/coroutines/flow/Flow;", "u", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "Ljn0/h0;", "v", "()V", "b", "", "enable", "c", "(Z)V", "f", "Ljn0/s;", "Ljava/io/File;", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "k", "enableAnalyzer", "j", "a", "Lbg0/e;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager;", "currentManager", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lzf0/w;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_previewState", "e", "Z", "recordingOngoing", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "currentStateCollectJob", "()Lkotlinx/coroutines/flow/StateFlow;", "cameraState", "Landroid/view/View;", "()Landroid/view/View;", "previewView", "Lzf0/u;", "()Lzf0/u;", "cameraProperties", "h", "()Z", "isRecordingLocally", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bg0.e camera2ManagerFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Camera2Manager currentManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private MutableStateFlow<w> _previewState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean recordingOngoing;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Job currentStateCollectJob;

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.camera2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c;", "state", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$c;)Z"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1", f = "Camera2Controller.kt", i = {0}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
    static final class C1158a extends SuspendLambda implements q<FlowCollector<? super Camera2Manager.c>, Camera2Manager.c, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57265n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f57266o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f57267p;

        C1158a(Continuation<? super C1158a> continuation) {
            super(3, continuation);
        }

        @Override // wn0.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super Camera2Manager.c> flowCollector, Camera2Manager.c cVar, Continuation<? super Boolean> continuation) {
            C1158a c1158a = new C1158a(continuation);
            c1158a.f57266o = flowCollector;
            c1158a.f57267p = cVar;
            return c1158a.invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Camera2Manager.c cVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57265n;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f57266o;
                Camera2Manager.c cVar2 = (Camera2Manager.c) this.f57267p;
                this.f57266o = cVar2;
                this.f57265n = 1;
                if (flowCollector.emit(cVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cVar = cVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (Camera2Manager.c) this.f57266o;
                t.b(obj);
            }
            return Boxing.boxBoolean(!s.f(cVar, Camera2Manager.c.b.f57219a));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$prepare$1", f = "Camera2Controller.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57268n;

        /* JADX INFO: renamed from: com.withpersona.sdk2.camera.camera2.a$b$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class C1159a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f57270a;

            C1159a(a aVar) {
                this.f57270a = aVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(Camera2Manager.c cVar, Continuation<? super h0> continuation) {
                if (!s.f(cVar, Camera2Manager.c.a.f57218a)) {
                    if (s.f(cVar, Camera2Manager.c.d.f57221a)) {
                        this.f57270a._previewState.setValue(w.e.f128333a);
                    } else if (s.f(cVar, Camera2Manager.c.b.f57219a)) {
                        this.f57270a._previewState.setValue(new w.Closed(this.f57270a.recordingOngoing));
                        a aVar = this.f57270a;
                        aVar.currentManager = aVar.camera2ManagerFactory.a();
                        this.f57270a.recordingOngoing = false;
                    } else {
                        if (!(cVar instanceof Camera2Manager.c.Error)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Camera2Manager.Error error = ((Camera2Manager.c.Error) cVar).getError();
                        if (error instanceof Camera2Manager.Error.InitializationError) {
                            if (this.f57270a.camera2ManagerFactory.b()) {
                                Job job = this.f57270a.currentStateCollectJob;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                this.f57270a.v();
                            } else {
                                this.f57270a._previewState.setValue(w.b.f128330a);
                            }
                        } else {
                            if (!(error instanceof Camera2Manager.Error.MissingPermissionsCameraError)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f57270a._previewState.setValue(w.c.f128331a);
                        }
                    }
                }
                return h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57268n;
            if (i11 == 0) {
                t.b(obj);
                a aVar = a.this;
                Flow flowCancellable = FlowKt.cancellable(aVar.u(aVar.currentManager.K()));
                C1159a c1159a = new C1159a(a.this);
                this.f57268n = 1;
                if (flowCancellable.collect(c1159a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$retryPrepareWithNewCameraManager$1", f = "Camera2Controller.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57271n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57271n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            a.this._previewState.setValue(w.c.f128331a);
            a.this.b();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", i = {0}, l = {105}, m = "startVideo-IoAF18A", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f57273n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f57274o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f57276q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57274o = obj;
            this.f57276q |= Integer.MIN_VALUE;
            Object objG = a.this.g(this);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : jn0.s.a(objG);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", i = {}, l = {116}, m = "stopVideo-IoAF18A", n = {}, s = {})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f57277n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f57279p;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57277n = obj;
            this.f57279p |= Integer.MIN_VALUE;
            Object objK = a.this.k(this);
            return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : jn0.s.a(objK);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.camera.camera2.Camera2Controller", f = "Camera2Controller.kt", i = {}, l = {98}, m = "takePicture-IoAF18A", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f57280n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f57282p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f57280n = obj;
            this.f57282p |= Integer.MIN_VALUE;
            Object objI = a.this.i(this);
            return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : jn0.s.a(objI);
        }
    }

    public a(bg0.e camera2ManagerFactory) {
        s.k(camera2ManagerFactory, "camera2ManagerFactory");
        this.camera2ManagerFactory = camera2ManagerFactory;
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.currentManager = camera2ManagerFactory.a();
        this._previewState = StateFlowKt.MutableStateFlow(w.c.f128331a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Camera2Manager.c> u(StateFlow<? extends Camera2Manager.c> stateFlow) {
        return FlowKt.transformWhile(stateFlow, new C1158a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        this.currentManager = this.camera2ManagerFactory.a();
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getMain(), null, new c(null), 2, null);
    }

    @Override // zf0.i
    public StateFlow<w> a() {
        return this._previewState;
    }

    @Override // zf0.i
    public void b() {
        if (s.f(this._previewState.getValue(), w.c.f128331a) || (this._previewState.getValue() instanceof w.Closed)) {
            Job job = this.currentStateCollectJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this._previewState.setValue(w.d.f128332a);
            this.currentStateCollectJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new b(null), 3, null);
            this.currentManager.T();
        }
    }

    @Override // zf0.i
    public void c(boolean enable) {
        this.currentManager.G(enable);
    }

    @Override // zf0.i
    public u d() {
        return this.currentManager.getCameraProperties();
    }

    @Override // zf0.i
    /* JADX INFO: renamed from: e */
    public View getPreviewView() {
        return this.currentManager.getPreviewView();
    }

    @Override // zf0.i
    public void f() {
        this.currentManager.H();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zf0.i
    public Object g(Continuation<? super jn0.s<Boolean>> continuation) {
        d dVar;
        Object objW;
        a aVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f57276q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f57276q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f57274o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f57276q;
        if (i12 == 0) {
            t.b(obj);
            if (!s.f(this._previewState.getValue(), w.e.f128333a)) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(Boxing.boxBoolean(false));
            }
            Camera2Manager camera2Manager = this.currentManager;
            dVar.f57273n = this;
            dVar.f57276q = 1;
            objW = camera2Manager.W(dVar);
            if (objW == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) dVar.f57273n;
            t.b(obj);
            objW = ((jn0.s) obj).getValue();
        }
        if (s.f(jn0.s.g(objW) ? null : objW, Boxing.boxBoolean(true))) {
            aVar.recordingOngoing = true;
        }
        return objW;
    }

    @Override // zf0.i
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getRecordingOngoing() {
        return this.recordingOngoing;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zf0.i
    public Object i(Continuation<? super jn0.s<? extends File>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f57282p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f57282p = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f57280n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f57282p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        t.b(obj);
        Camera2Manager camera2Manager = this.currentManager;
        fVar.f57282p = 1;
        Object objQ = camera2Manager.Q(fVar);
        return objQ == coroutine_suspended ? coroutine_suspended : objQ;
    }

    @Override // zf0.i
    public void j(boolean enableAnalyzer) {
        this.currentManager.S(enableAnalyzer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zf0.i
    public Object k(Continuation<? super jn0.s<? extends File>> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f57279p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f57279p = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f57277n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f57279p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        t.b(obj);
        this.recordingOngoing = false;
        Camera2Manager camera2Manager = this.currentManager;
        eVar.f57279p = 1;
        Object objX = camera2Manager.X(eVar);
        return objX == coroutine_suspended ? coroutine_suspended : objX;
    }
}
