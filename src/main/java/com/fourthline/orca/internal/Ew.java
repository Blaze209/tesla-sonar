package com.fourthline.orca.internal;

import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Ew implements DeviceDataCollector, CoroutineScope {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f25662g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f25663h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f25664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MotionDataCollector f25665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StateFlow f25666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Job f25667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f25669f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25670a;

        static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ew f25672a;

            a(Ew ew2) {
                this.f25672a = ew2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(DeviceDataCollection f11, Continuation continuation) {
                boolean z11 = f11.getEnabled() && f11.getMotion().getEnabled();
                f11.getEnabled();
                f11.getMotion().getEnabled();
                if (z11 && !this.f25672a.f25669f) {
                    this.f25672a.f25665b.startDataCollection();
                    this.f25672a.f25669f = true;
                } else if (!z11 && this.f25672a.f25669f) {
                    this.f25672a.f25665b.stop();
                    this.f25672a.f25669f = false;
                }
                return jn0.h0.f84049a;
            }
        }

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ew.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f25670a;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow stateFlow = Ew.this.f25666c;
                a aVar = new a(Ew.this);
                this.f25670a = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
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
    }

    public Ew(MotionDataCollector delegate, StateFlow configFlow, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(configFlow, "configFlow");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f25664a = coroutineScope;
        this.f25665b = delegate;
        this.f25666c = configFlow;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f25664a.getCoroutineContext();
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f25668e) {
            return;
        }
        this.f25668e = true;
        this.f25667d = BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(null), 3, null);
    }
}
