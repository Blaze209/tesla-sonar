package com.fourthline.core.internal.devicedata;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001ABC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u0014\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010,R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u0014\u00105\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010,R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010&R\u0016\u00109\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010&R\u0016\u0010;\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010&R\u0016\u0010=\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010<R\u001c\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001fR\u0016\u0010@\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010?¨\u0006B"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionDataCollector;", "Lcom/fourthline/core/internal/devicedata/DeviceDataCollector;", "Lcom/fourthline/core/internal/devicedata/AndroidDataCollectorHelper;", "helper", "", "Lcom/fourthline/core/internal/devicedata/MotionFrame;", "destination", "", "", "", "motionMetadata", "", "enabled", "", "collectionInterval", "<init>", "(Lcom/fourthline/core/internal/devicedata/AndroidDataCollectorHelper;Ljava/util/List;Ljava/util/Map;ZJ)V", "Landroid/hardware/SensorEvent;", "event", "Ljn0/h0;", "a", "(Landroid/hardware/SensorEvent;)V", "b", "c", "", "", "", "([F)Ljava/util/List;", "startDataCollection", "()V", "stop", "()Ljava/util/List;", "Lcom/fourthline/core/internal/devicedata/AndroidDataCollectorHelper;", "Ljava/util/List;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "Z", "e", "J", "Lkotlinx/coroutines/Job;", "f", "Lkotlinx/coroutines/Job;", "collectionJob", "g", "[F", "gravity", "h", "geomagnetic", IntegerTokenConverter.CONVERTER_KEY, "orientationAngles", "j", "rotationRate", "k", "linearAcceleration", "l", "accelerometerTimestamp", "m", "geoMagneticTimestamp", "n", "gyroscopeTimestamp", "()Lcom/fourthline/core/internal/devicedata/MotionFrame;", "motionFrame", "orientation", "()Ljava/lang/Double;", "heading", "Companion", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MotionDataCollector implements DeviceDataCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidDataCollectorHelper helper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map motionMetadata;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long collectionInterval;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Job collectionJob;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float[] gravity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float[] geomagnetic;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float[] orientationAngles;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float[] rotationRate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float[] linearAcceleration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long accelerometerTimestamp;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long geoMagneticTimestamp;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long gyroscopeTimestamp;

    static final class a extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24117a;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MotionDataCollector.this.new a(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0028 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0031  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:12:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f24117a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r6)
                goto L29
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jn0.t.b(r6)
            L1a:
                com.fourthline.core.internal.devicedata.MotionDataCollector r6 = com.fourthline.core.internal.devicedata.MotionDataCollector.this
                long r3 = com.fourthline.core.internal.devicedata.MotionDataCollector.access$getCollectionInterval$p(r6)
                r5.f24117a = r2
                java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
                if (r6 != r0) goto L29
                return r0
            L29:
                com.fourthline.core.internal.devicedata.MotionDataCollector r6 = com.fourthline.core.internal.devicedata.MotionDataCollector.this
                com.fourthline.core.internal.devicedata.MotionFrame r6 = com.fourthline.core.internal.devicedata.MotionDataCollector.access$getMotionFrame(r6)
                if (r6 == 0) goto L1a
                com.fourthline.core.internal.devicedata.MotionDataCollector r1 = com.fourthline.core.internal.devicedata.MotionDataCollector.this
                java.util.List r3 = com.fourthline.core.internal.devicedata.MotionDataCollector.access$getDestination$p(r1)
                r3.add(r6)
                java.util.Map r6 = com.fourthline.core.internal.devicedata.MotionDataCollector.access$getMotionMetadata$p(r1)
                java.lang.Boolean r1 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                java.lang.String r3 = "attitudeIsAbsolute"
                r6.put(r3, r1)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.core.internal.devicedata.MotionDataCollector.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MotionDataCollector(AndroidDataCollectorHelper helper, List<MotionFrame> destination, Map<String, Object> motionMetadata, boolean z11, long j11) {
        s.k(helper, "helper");
        s.k(destination, "destination");
        s.k(motionMetadata, "motionMetadata");
        this.helper = helper;
        this.destination = destination;
        this.motionMetadata = motionMetadata;
        this.enabled = z11;
        this.collectionInterval = j11;
        this.gravity = new float[3];
        this.geomagnetic = new float[3];
        this.orientationAngles = new float[3];
        this.rotationRate = new float[3];
        this.linearAcceleration = new float[3];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 a(MotionDataCollector motionDataCollector, SensorEvent sensorEvent) {
        Sensor sensor;
        Integer numValueOf = (sensorEvent == null || (sensor = sensorEvent.sensor) == null) ? null : Integer.valueOf(sensor.getType());
        if (numValueOf != null && numValueOf.intValue() == 1) {
            motionDataCollector.a(sensorEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            motionDataCollector.c(sensorEvent);
        } else if (numValueOf != null && numValueOf.intValue() == 4) {
            motionDataCollector.b(sensorEvent);
        }
        return h0.f84049a;
    }

    private final void c(SensorEvent event) {
        this.geoMagneticTimestamp = event.timestamp;
        float[] fArr = event.values;
        System.arraycopy(fArr, 0, this.geomagnetic, 0, fArr.length);
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.enabled) {
            AndroidDataCollectorHelper androidDataCollectorHelper = this.helper;
            this.collectionJob = BuildersKt__Builders_commonKt.launch$default(androidDataCollectorHelper, Dispatchers.getDefault(), null, new a(null), 2, null);
            androidDataCollectorHelper.onSensorChanged(new l() { // from class: com.fourthline.core.internal.devicedata.a
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return MotionDataCollector.a(this.f24127a, (SensorEvent) obj);
                }
            });
        }
    }

    public final List<MotionFrame> stop() {
        Job job = this.collectionJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        return this.destination;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MotionFrame b() {
        Double dA;
        List listC = c();
        if (listC == null || (dA = a()) == null) {
            return null;
        }
        double dDoubleValue = dA.doubleValue();
        long jConvert = TimeUnit.MILLISECONDS.convert(SystemClock.elapsedRealtimeNanos() - this.gyroscopeTimestamp, TimeUnit.NANOSECONDS);
        float[] fArr = this.rotationRate;
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f11 : fArr) {
            arrayList.add(Double.valueOf(Math.toDegrees(f11)));
        }
        return new MotionFrame(listC, arrayList, a(this.gravity), a(this.linearAcceleration), dDoubleValue, System.currentTimeMillis() - jConvert);
    }

    private final List c() {
        float[] fArr = new float[9];
        if (!SensorManager.getRotationMatrix(fArr, null, this.gravity, this.geomagnetic)) {
            return null;
        }
        SensorManager.getOrientation(fArr, this.orientationAngles);
        return v.p(Double.valueOf(Math.toDegrees(this.orientationAngles[1])), Double.valueOf(Math.toDegrees(this.orientationAngles[2])), Double.valueOf(Math.toDegrees(this.orientationAngles[0])));
    }

    private final void a(SensorEvent event) {
        this.accelerometerTimestamp = event.timestamp;
        float[] fArr = this.gravity;
        float f11 = fArr[0] * 0.8f;
        float f12 = 1 - 0.8f;
        float[] fArr2 = event.values;
        float f13 = f11 + (fArr2[0] * f12);
        fArr[0] = f13;
        float f14 = (fArr[1] * 0.8f) + (fArr2[1] * f12);
        fArr[1] = f14;
        float f15 = (fArr[2] * 0.8f) + (f12 * fArr2[2]);
        fArr[2] = f15;
        float[] fArr3 = this.linearAcceleration;
        fArr3[0] = fArr2[0] - f13;
        fArr3[1] = fArr2[1] - f14;
        fArr3[2] = fArr2[2] - f15;
    }

    public /* synthetic */ MotionDataCollector(AndroidDataCollectorHelper androidDataCollectorHelper, List list, Map map, boolean z11, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidDataCollectorHelper, list, map, z11, (i11 & 16) != 0 ? 1000L : j11);
    }

    private final Double a() {
        float[] fArr = new float[9];
        if (!SensorManager.getRotationMatrix(fArr, null, this.gravity, this.geomagnetic)) {
            return null;
        }
        SensorManager.getOrientation(fArr, this.orientationAngles);
        double d11 = 360;
        return Double.valueOf((Math.toDegrees(this.orientationAngles[0]) + d11) % d11);
    }

    private final void b(SensorEvent event) {
        this.gyroscopeTimestamp = event.timestamp;
        float[] fArr = event.values;
        System.arraycopy(fArr, 0, this.rotationRate, 0, fArr.length);
    }

    private final List a(float[] fArr) {
        List<Float> listT1 = n.t1(fArr);
        ArrayList arrayList = new ArrayList(v.y(listT1, 10));
        Iterator<T> it = listT1.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).floatValue()));
        }
        return arrayList;
    }
}
