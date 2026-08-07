package com.fourthline.vision.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4144a extends AbstractC4250o implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f38125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineContext f38127d;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.a$a, reason: collision with other inner class name */
    static final class C0641a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38128a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float[] f38130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0641a(float[] fArr, Continuation<? super C0641a> continuation) {
            super(2, continuation);
            this.f38130c = fArr;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return C4144a.this.new C0641a(this.f38130c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f38128a;
            if (i11 == 0) {
                jn0.t.b(obj);
                C4144a c4144a = C4144a.this;
                float[] fArr = this.f38130c;
                p013kotlin.jvm.internal.s.h(fArr);
                this.f38128a = 1;
                if (c4144a.emit(fArr, this) == coroutine_suspended) {
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
            return ((C0641a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public /* synthetic */ C4144a(SensorManager sensorManager, int i11, CoroutineContext coroutineContext, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(sensorManager, (i12 & 2) != 0 ? 20 : i11, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f38127d;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new C0641a(sensorEvent.values, null), 3, null);
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4250o
    public void onStart() {
        this.f38125b.registerListener(this, this.f38125b.getDefaultSensor(10), this.f38126c);
    }

    @Override // com.fourthline.vision.internal.AbstractC4250o
    public void onStop() {
        this.f38125b.unregisterListener(this);
    }

    public C4144a(SensorManager sensorManager, int i11, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(sensorManager, "sensorManager");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        this.f38125b = sensorManager;
        this.f38126c = i11;
        this.f38127d = coroutineContext;
    }
}
