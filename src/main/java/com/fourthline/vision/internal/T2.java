package com.fourthline.vision.internal;

import com.fourthline.analytics.FourthlineAnalytics;
import com.fourthline.core.internal.AndroidDevicesKt;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public class T2 implements InterfaceC4306w0, CoroutineScope, F5, U2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Flow f37968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Flow f37969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f37970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f37971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f37972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CoroutineContext f37973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f37974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f37975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Job f37976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Job f37977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f37978k;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37979a;

        /* JADX INFO: renamed from: com.fourthline.vision.internal.T2$a$a, reason: collision with other inner class name */
        static final class C0636a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ T2 f37981a;

            C0636a(T2 t11) {
                this.f37981a = t11;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((float[]) obj, (Continuation<? super jn0.h0>) continuation);
            }

            public final Object emit(float[] fArr, Continuation<? super jn0.h0> continuation) {
                T2 t11 = this.f37981a;
                if (t11.getVector(t11.normalise(fArr)) > this.f37981a.f37972e) {
                    this.f37981a.f37978k = System.currentTimeMillis();
                }
                return jn0.h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return T2.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f37979a;
            if (i11 == 0) {
                jn0.t.b(obj);
                String unused = T2.this.f37974g;
                Flow flow = T2.this.f37969b;
                C0636a c0636a = new C0636a(T2.this);
                this.f37979a = 1;
                if (flow.collect(c0636a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37982a;

        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ T2 f37984a;

            a(T2 t11) {
                this.f37984a = t11;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((float[]) obj, (Continuation<? super jn0.h0>) continuation);
            }

            public final Object emit(float[] fArr, Continuation<? super jn0.h0> continuation) {
                if (this.f37984a.getVector(fArr) > this.f37984a.f37971d) {
                    this.f37984a.f37978k = System.currentTimeMillis();
                }
                return jn0.h0.f84049a;
            }
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return T2.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f37982a;
            if (i11 == 0) {
                jn0.t.b(obj);
                String unused = T2.this.f37974g;
                Flow flow = T2.this.f37968a;
                a aVar = new a(T2.this);
                this.f37982a = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public T2(Flow<float[]> gyroscopeFlow, Flow<float[]> accelerometerFlow, long j11, float f11, float f12, CoroutineContext coroutineContext) {
        String simpleName;
        p013kotlin.jvm.internal.s.k(gyroscopeFlow, "gyroscopeFlow");
        p013kotlin.jvm.internal.s.k(accelerometerFlow, "accelerometerFlow");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        this.f37968a = gyroscopeFlow;
        this.f37969b = accelerometerFlow;
        this.f37970c = j11;
        this.f37971d = f11;
        this.f37972e = f12;
        this.f37973f = coroutineContext;
        if (getClass().isAnonymousClass()) {
            simpleName = getClass().getName();
            int length = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length > 23) {
                simpleName = simpleName.substring(simpleName.length() - 23, simpleName.length());
                p013kotlin.jvm.internal.s.j(simpleName, "substring(...)");
            }
        } else {
            simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                simpleName = simpleName.substring(0, 23);
                p013kotlin.jvm.internal.s.j(simpleName, "substring(...)");
            }
        }
        this.f37974g = simpleName;
        this.f37975h = 3;
        this.f37978k = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getVector(float[] fArr) {
        return Math.hypot(Math.hypot(getX(fArr), getY(fArr)), getZ(fArr));
    }

    private final float getX(float[] fArr) {
        return fArr[0];
    }

    private final float getY(float[] fArr) {
        return fArr[1];
    }

    private final float getZ(float[] fArr) {
        return fArr[2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float[] normalise(float[] fArr) {
        if (Math.abs(getY(fArr)) > this.f37975h && Math.abs(getZ(fArr)) > this.f37975h) {
            FourthlineAnalytics.singleI$default(FourthlineAnalytics.INSTANCE, "vision_unusual_accelerometer", null, p013kotlin.collections.v0.f(jn0.x.a("value", stringify(fArr))), 2, null);
        }
        if (!AndroidDevicesKt.isRealme8Device()) {
            return fArr;
        }
        float f11 = 10;
        return new float[]{getX(fArr) / f11, getY(fArr) / f11, getZ(fArr) / f11};
    }

    private final String stringify(float[] fArr) {
        return "[x = " + getX(fArr) + ", y = " + getY(fArr) + ", z = " + getZ(fArr) + "]";
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f37973f;
    }

    @Override // com.fourthline.vision.internal.U2
    public boolean isSteady() {
        return get().booleanValue();
    }

    @Override // com.fourthline.vision.internal.F5
    public void start() {
        T2 t11;
        Job job = this.f37976i;
        if (job == null || !job.isActive()) {
            t11 = this;
            t11.f37976i = BuildersKt__Builders_commonKt.launch$default(t11, null, null, new a(null), 3, null);
        } else {
            t11 = this;
        }
        Job job2 = t11.f37977j;
        if (job2 == null || !job2.isActive()) {
            t11.f37977j = BuildersKt__Builders_commonKt.launch$default(t11, null, null, new b(null), 3, null);
        }
    }

    @Override // com.fourthline.vision.internal.F5
    public void stop() {
        Job job = this.f37976i;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job job2 = this.f37977j;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public void subscribe(wn0.p<? super Boolean, ? super Continuation<? super jn0.h0>, ? extends Object> pVar) {
        InterfaceC4306w0.a.subscribe(this, pVar);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4306w0
    public Boolean get() {
        return Boolean.valueOf(System.currentTimeMillis() - this.f37978k > this.f37970c);
    }

    public /* synthetic */ T2(Flow flow, Flow flow2, long j11, float f11, float f12, CoroutineContext coroutineContext, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, flow2, (i11 & 4) != 0 ? 200L : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? 1.0f : f12, coroutineContext);
    }
}
