package fa0;

import android.content.Context;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.dashcam_viewer.f1;
import ie0.a0;
import ie0.z;
import io.reactivex.rxjava3.core.o;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me0.x;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0014\u0010\u001e\"\u0004\b\u001c\u0010\u001fR\"\u0010%\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u001b0\u001b0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001b0+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lfa0/a;", "Lie0/f;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onCreate", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "a", "Landroid/content/Context;", "", "b", "Ljava/lang/String;", "TAG", "Lcom/tesla/logging/g;", "c", "Lcom/tesla/logging/g;", "logger", "", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "(Z)V", "isBackgrounded", "Luy/b;", "kotlin.jvm.PlatformType", "e", "Luy/b;", "backgroundedRelay", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/lifecycle/Lifecycle$a;", "f", "Lkotlinx/coroutines/flow/MutableStateFlow;", "appStateFlow", "Lio/reactivex/rxjava3/core/o;", "h", "()Lio/reactivex/rxjava3/core/o;", "backgroundedEvents", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements ie0.f, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isBackgrounded;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final uy.b<Boolean> backgroundedRelay;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Lifecycle.a> appStateFlow;

    /* JADX INFO: renamed from: fa0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.AppStateLifecycleObserver$onCreate$1", f = "AppStateLifecycleObserver.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    static final class C1331a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64715n;

        C1331a(Continuation<? super C1331a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new C1331a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64715n;
            if (i11 == 0) {
                t.b(obj);
                MutableStateFlow mutableStateFlow = a.this.appStateFlow;
                Lifecycle.a aVar = Lifecycle.a.ON_CREATE;
                this.f64715n = 1;
                if (mutableStateFlow.emit(aVar, this) == coroutine_suspended) {
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
            return ((C1331a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.AppStateLifecycleObserver$onDestroy$1", f = "AppStateLifecycleObserver.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64717n;

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
            int i11 = this.f64717n;
            if (i11 == 0) {
                t.b(obj);
                MutableStateFlow mutableStateFlow = a.this.appStateFlow;
                Lifecycle.a aVar = Lifecycle.a.ON_DESTROY;
                this.f64717n = 1;
                if (mutableStateFlow.emit(aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.tesla.TeslaV4.AppStateLifecycleObserver$onPause$1", f = "AppStateLifecycleObserver.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64719n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64719n;
            if (i11 == 0) {
                t.b(obj);
                MutableStateFlow mutableStateFlow = a.this.appStateFlow;
                Lifecycle.a aVar = Lifecycle.a.ON_PAUSE;
                this.f64719n = 1;
                if (mutableStateFlow.emit(aVar, this) == coroutine_suspended) {
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
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.AppStateLifecycleObserver$onResume$1", f = "AppStateLifecycleObserver.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64721n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64721n;
            if (i11 == 0) {
                t.b(obj);
                MutableStateFlow mutableStateFlow = a.this.appStateFlow;
                Lifecycle.a aVar = Lifecycle.a.ON_RESUME;
                this.f64721n = 1;
                if (mutableStateFlow.emit(aVar, this) == coroutine_suspended) {
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
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.AppStateLifecycleObserver$onStart$1", f = "AppStateLifecycleObserver.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64723n;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64723n;
            if (i11 == 0) {
                t.b(obj);
                MutableStateFlow mutableStateFlow = a.this.appStateFlow;
                Lifecycle.a aVar = Lifecycle.a.ON_START;
                this.f64723n = 1;
                if (mutableStateFlow.emit(aVar, this) == coroutine_suspended) {
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
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.TeslaV4.AppStateLifecycleObserver$onStop$1", f = "AppStateLifecycleObserver.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64725n;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new f(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64725n;
            if (i11 == 0) {
                t.b(obj);
                MutableStateFlow mutableStateFlow = a.this.appStateFlow;
                Lifecycle.a aVar = Lifecycle.a.ON_STOP;
                this.f64725n = 1;
                if (mutableStateFlow.emit(aVar, this) == coroutine_suspended) {
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
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(Context context) {
        s.k(context, "context");
        this.context = context;
        this.TAG = "AppStateLifecycleObserver";
        this.logger = com.tesla.logging.g.INSTANCE.a("AppStateLifecycleObserver");
        uy.b<Boolean> bVarZ = uy.b.Z();
        s.j(bVarZ, "create(...)");
        this.backgroundedRelay = bVarZ;
        this.appStateFlow = StateFlowKt.MutableStateFlow(null);
    }

    @Override // ie0.f
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsBackgrounded() {
        return this.isBackgrounded;
    }

    @Override // ie0.f
    public String c() {
        return ie0.f.b.a(this);
    }

    public void d(boolean z11) {
        this.isBackgrounded = z11;
    }

    @Override // ie0.f
    public o<Boolean> h() {
        o<Boolean> oVarJ = this.backgroundedRelay.j();
        s.j(oVarJ, "distinctUntilChanged(...)");
        return oVarJ;
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onCreate(owner);
        this.logger.j("onCreate");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new C1331a(null), 3, null);
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onDestroy(owner);
        this.logger.j("onDestroy");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new b(null), 3, null);
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onPause(owner);
        this.logger.j("onPause");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new c(null), 3, null);
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onResume(owner);
        this.logger.j("onResume");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new d(null), 3, null);
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onStart(owner);
        this.logger.j("onStart");
        d(false);
        f1.f55840a.s0(false);
        this.backgroundedRelay.accept(Boolean.FALSE);
        z.f77633a.c(a0.f77574a.b(this.context));
        x.a(this.context);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new e(null), 3, null);
    }

    @Override // androidx.p003lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        s.k(owner, "owner");
        super.onStop(owner);
        this.logger.j("onStop");
        d(true);
        f1.f55840a.s0(true);
        this.backgroundedRelay.accept(Boolean.TRUE);
        x.q(this.context);
        x.n(this.context);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate()), null, null, new f(null), 3, null);
    }
}
