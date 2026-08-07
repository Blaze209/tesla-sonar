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

/* JADX INFO: loaded from: classes4.dex */
public final class H2 extends AbstractC4250o implements SensorEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f37738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineContext f37740d;

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37741a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float[] f37743c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float[] fArr, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f37743c = fArr;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return H2.this.new a(this.f37743c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f37741a;
            if (i11 == 0) {
                jn0.t.b(obj);
                H2 h11 = H2.this;
                float[] fArr = this.f37743c;
                p013kotlin.jvm.internal.s.h(fArr);
                this.f37741a = 1;
                if (h11.emit(fArr, this) == coroutine_suspended) {
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

    public /* synthetic */ H2(SensorManager sensorManager, int i11, CoroutineContext coroutineContext, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(sensorManager, (i12 & 2) != 0 ? 20 : i11, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f37740d;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(sensorEvent.values, null), 3, null);
        }
    }

    @Override // com.fourthline.vision.internal.AbstractC4250o
    public void onStart() {
        this.f37738b.registerListener(this, this.f37738b.getDefaultSensor(4), this.f37739c);
    }

    @Override // com.fourthline.vision.internal.AbstractC4250o
    public void onStop() {
        this.f37738b.unregisterListener(this);
    }

    public H2(SensorManager sensorManager, int i11, CoroutineContext coroutineContext) {
        p013kotlin.jvm.internal.s.k(sensorManager, "sensorManager");
        p013kotlin.jvm.internal.s.k(coroutineContext, "coroutineContext");
        this.f37738b = sensorManager;
        this.f37739c = i11;
        this.f37740d = coroutineContext;
    }
}
