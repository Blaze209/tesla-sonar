package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.ContinuationInterceptor;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0011\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\",\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0003\"\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001e\u0010!\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroid/view/View;", "Lr2/q;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)Lr2/q;", "Landroid/content/Context;", "applicationContext", "Lkotlinx/coroutines/flow/StateFlow;", "", "e", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lr2/m2;", "b", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/Lifecycle;)Lr2/m2;", "", "a", "Ljava/util/Map;", "animationScale", "value", "f", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/view/View;Lr2/q;)V", "compositionContext", "g", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "h", "(Landroid/view/View;)Lr2/m2;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Context, StateFlow<Float>> f5920a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/r3$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Ljn0/h0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f5921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p020r2.m2 f5922b;

        a(View view, p020r2.m2 m2Var) {
            this.f5921a = view;
            this.f5922b = m2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            this.f5921a.removeOnAttachStateChangeListener(this);
            this.f5922b.a0();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/r3$b", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.p003lifecycle.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CoroutineScope f5923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p020r2.x1 f5924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p020r2.m2 f5925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.n0<v1> f5926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f5927e;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5928a;

            static {
                int[] iArr = new int[Lifecycle.a.values().length];
                try {
                    iArr[Lifecycle.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Lifecycle.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Lifecycle.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Lifecycle.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f5928a = iArr;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.r3$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {396}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"})
        static final class C0125b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f5929n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f5930o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ p013kotlin.jvm.internal.n0<v1> f5931p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ p020r2.m2 f5932q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ LifecycleOwner f5933r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f5934s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ View f5935t;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.r3$b$b$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
            @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", i = {}, l = {391}, m = "invokeSuspend", n = {}, s = {})
            static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f5936n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ StateFlow<Float> f5937o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ v1 f5938p;

                /* JADX INFO: renamed from: androidx.compose.ui.platform.r3$b$b$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "Ljn0/h0;", "a", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
                static final class C0126a<T> implements FlowCollector {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ v1 f5939a;

                    C0126a(v1 v1Var) {
                        this.f5939a = v1Var;
                    }

                    public final Object a(float f11, Continuation<? super jn0.h0> continuation) {
                        this.f5939a.a(f11);
                        return jn0.h0.f84049a;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                        return a(((Number) obj).floatValue(), continuation);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(StateFlow<Float> stateFlow, v1 v1Var, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f5937o = stateFlow;
                    this.f5938p = v1Var;
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f5937o, this.f5938p, continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i11 = this.f5936n;
                    if (i11 == 0) {
                        jn0.t.b(obj);
                        StateFlow<Float> stateFlow = this.f5937o;
                        C0126a c0126a = new C0126a(this.f5938p);
                        this.f5936n = 1;
                        if (stateFlow.collect(c0126a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jn0.t.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }

                @Override // wn0.p
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0125b(p013kotlin.jvm.internal.n0<v1> n0Var, p020r2.m2 m2Var, LifecycleOwner lifecycleOwner, b bVar, View view, Continuation<? super C0125b> continuation) {
                super(2, continuation);
                this.f5931p = n0Var;
                this.f5932q = m2Var;
                this.f5933r = lifecycleOwner;
                this.f5934s = bVar;
                this.f5935t = view;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                C0125b c0125b = new C0125b(this.f5931p, this.f5932q, this.f5933r, this.f5934s, this.f5935t, continuation);
                c0125b.f5930o = obj;
                return c0125b;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.Job] */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.Job] */
            /* JADX WARN: Type inference failed for: r1v4 */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th2;
                ?? r11;
                Job jobLaunch$default;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ?? r12 = this.f5929n;
                try {
                    if (r12 == 0) {
                        jn0.t.b(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.f5930o;
                        try {
                            v1 v1Var = this.f5931p.f86529a;
                            if (v1Var != null) {
                                StateFlow stateFlowE = r3.e(this.f5935t.getContext().getApplicationContext());
                                v1Var.a(((Number) stateFlowE.getValue()).floatValue());
                                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(stateFlowE, v1Var, null), 3, null);
                            } else {
                                jobLaunch$default = null;
                            }
                            p020r2.m2 m2Var = this.f5932q;
                            this.f5930o = jobLaunch$default;
                            this.f5929n = 1;
                            r12 = jobLaunch$default;
                            if (m2Var.B0(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            r11 = 0;
                            if (r11 != 0) {
                                Job.DefaultImpls.cancel$default((Job) r11, (CancellationException) null, 1, (Object) null);
                            }
                            this.f5933r.getLifecycle().d(this.f5934s);
                            throw th2;
                        }
                    } else {
                        if (r12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Job job = (Job) this.f5930o;
                        jn0.t.b(obj);
                        r12 = job;
                    }
                    if (r12 != 0) {
                        Job.DefaultImpls.cancel$default((Job) r12, (CancellationException) null, 1, (Object) null);
                    }
                    this.f5933r.getLifecycle().d(this.f5934s);
                    return jn0.h0.f84049a;
                } catch (Throwable th4) {
                    th2 = th4;
                    r11 = r12;
                }
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((C0125b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        b(CoroutineScope coroutineScope, p020r2.x1 x1Var, p020r2.m2 m2Var, p013kotlin.jvm.internal.n0<v1> n0Var, View view) {
            this.f5923a = coroutineScope;
            this.f5924b = x1Var;
            this.f5925c = m2Var;
            this.f5926d = n0Var;
            this.f5927e = view;
        }

        @Override // androidx.p003lifecycle.u
        public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
            int i11 = a.f5928a[event.ordinal()];
            if (i11 == 1) {
                BuildersKt__Builders_commonKt.launch$default(this.f5923a, null, CoroutineStart.UNDISPATCHED, new C0125b(this.f5926d, this.f5925c, source, this, this.f5927e, null), 1, null);
                return;
            }
            if (i11 == 2) {
                p020r2.x1 x1Var = this.f5924b;
                if (x1Var != null) {
                    x1Var.b();
                }
                this.f5925c.A0();
                return;
            }
            if (i11 == 3) {
                this.f5925c.n0();
            } else {
                if (i11 != 4) {
                    return;
                }
                this.f5925c.a0();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", i = {0, 1}, l = {117, 123}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    static final class c extends SuspendLambda implements wn0.p<FlowCollector<? super Float>, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5940n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f5941o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f5942p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ContentResolver f5943q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Uri f5944r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ d f5945s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Channel<jn0.h0> f5946t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Context f5947u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, Channel<jn0.h0> channel, Context context, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f5943q = contentResolver;
            this.f5944r = uri;
            this.f5945s = dVar;
            this.f5946t = channel;
            this.f5947u = context;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f5943q, this.f5944r, this.f5945s, this.f5946t, this.f5947u, continuation);
            cVar.f5942p = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0082  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
            if (r4.emit(r9, r8) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f5941o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f5940n
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r8.f5942p
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                jn0.t.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f5940n
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r8.f5942p
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                jn0.t.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                jn0.t.b(r9)
                java.lang.Object r9 = r8.f5942p
                kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                android.content.ContentResolver r1 = r8.f5943q
                android.net.Uri r4 = r8.f5944r
                r5 = 0
                androidx.compose.ui.platform.r3$d r6 = r8.f5945s
                r1.registerContentObserver(r4, r5, r6)
                kotlinx.coroutines.channels.Channel<jn0.h0> r1 = r8.f5946t     // Catch: java.lang.Throwable -> L1b
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f5942p = r9     // Catch: java.lang.Throwable -> L1b
                r8.f5940n = r1     // Catch: java.lang.Throwable -> L1b
                r8.f5941o = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.hasNext(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                goto L81
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f5947u     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = p013kotlin.coroutines.jvm.internal.Boxing.boxFloat(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f5942p = r4     // Catch: java.lang.Throwable -> L1b
                r8.f5940n = r1     // Catch: java.lang.Throwable -> L1b
                r8.f5941o = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.emit(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
            L81:
                return r0
            L82:
                android.content.ContentResolver r9 = r8.f5943q
                androidx.compose.ui.platform.r3$d r0 = r8.f5945s
                r9.unregisterContentObserver(r0)
                jn0.h0 r9 = jn0.h0.f84049a
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.f5943q
                androidx.compose.ui.platform.r3$d r1 = r8.f5945s
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r3.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super Float> flowCollector, Continuation<? super jn0.h0> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/r3$d", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "Ljn0/h0;", "onChange", "(ZLandroid/net/Uri;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Channel<jn0.h0> f5948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Channel<jn0.h0> channel, Handler handler) {
            super(handler);
            this.f5948a = channel;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            this.f5948a.mo85trySendJP2dKIU(jn0.h0.f84049a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.compose.ui.platform.v1] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.coroutines.CoroutineContext] */
    public static final p020r2.m2 b(View view, CoroutineContext coroutineContext, Lifecycle lifecycle) {
        p020r2.x1 x1Var;
        CoroutineContext coroutineContext2;
        ?? v1Var;
        if (coroutineContext.get(ContinuationInterceptor.INSTANCE) == null || coroutineContext.get(p020r2.f1.INSTANCE) == null) {
            coroutineContext = l0.INSTANCE.a().plus(coroutineContext);
        }
        p020r2.f1 f1Var = (p020r2.f1) coroutineContext.get(p020r2.f1.INSTANCE);
        if (f1Var != null) {
            p020r2.x1 x1Var2 = new p020r2.x1(f1Var);
            x1Var2.a();
            x1Var = x1Var2;
        } else {
            x1Var = null;
        }
        p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        d3.g gVar = (d3.g) coroutineContext.get(d3.g.INSTANCE);
        ?? r11 = gVar;
        if (gVar == null) {
            v1Var = new v1();
            n0Var.f86529a = v1Var;
        }
        if (x1Var != null) {
            r11 = v1Var;
            coroutineContext2 = x1Var;
        } else {
            r11 = v1Var;
            coroutineContext2 = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2).plus(r11);
        p020r2.m2 m2Var = new p020r2.m2(coroutineContextPlus);
        m2Var.n0();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineContextPlus);
        if (lifecycle == null) {
            LifecycleOwner lifecycleOwnerA = androidx.p003lifecycle.View.a(view);
            lifecycle = lifecycleOwnerA != null ? lifecycleOwnerA.getLifecycle() : null;
        }
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new a(view, m2Var));
            lifecycle.a(new b(CoroutineScope, x1Var, m2Var, n0Var, view));
            return m2Var;
        }
        y3.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ p020r2.m2 c(View view, CoroutineContext coroutineContext, Lifecycle lifecycle, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            lifecycle = null;
        }
        return b(view, coroutineContext, lifecycle);
    }

    public static final p020r2.q d(View view) {
        p020r2.q qVarF = f(view);
        if (qVarF != null) {
            return qVarF;
        }
        for (ViewParent parent = view.getParent(); qVarF == null && (parent instanceof View); parent = parent.getParent()) {
            qVarF = f((View) parent);
        }
        return qVarF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateFlow<Float> e(Context context) {
        StateFlow<Float> stateFlow;
        Map<Context, StateFlow<Float>> map = f5920a;
        synchronized (map) {
            try {
                StateFlow<Float> stateFlowStateIn = map.get(context);
                if (stateFlowStateIn == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                    stateFlowStateIn = FlowKt.stateIn(FlowKt.flow(new c(contentResolver, uriFor, new d(channelChannel$default, q5.i.a(Looper.getMainLooper())), channelChannel$default, context, null)), CoroutineScopeKt.MainScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, stateFlowStateIn);
                }
                stateFlow = stateFlowStateIn;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return stateFlow;
    }

    public static final p020r2.q f(View view) {
        Object tag = view.getTag(d3.h.G);
        if (tag instanceof p020r2.q) {
            return (p020r2.q) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final p020r2.m2 h(View view) {
        if (!view.isAttachedToWindow()) {
            y3.a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewG = g(view);
        p020r2.q qVarF = f(viewG);
        if (qVarF == null) {
            return q3.f5909a.a(viewG);
        }
        if (qVarF instanceof p020r2.m2) {
            return (p020r2.m2) qVarF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, p020r2.q qVar) {
        view.setTag(d3.h.G, qVar);
    }
}
