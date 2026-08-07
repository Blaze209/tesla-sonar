package rd0;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0002\u001e\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R(\u0010*\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010,\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010$8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b+\u0010)R\u0017\u00100\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b&\u0010/R\"\u00106\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00108R\u0011\u0010;\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b4\u0010:¨\u0006<"}, d2 = {"Lrd0/g;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)Z", "Lrd0/g$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "instanceId", "Ljn0/h0;", "h", "(Landroid/content/Context;Lrd0/g$b;Ljava/lang/String;)V", "j", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "a", "Lrd0/g$b;", "b", "Ljava/lang/Integer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "registered", "", "value", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "registeredTimestamp", "f", "unregisteredTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "()Ljava/util/concurrent/atomic/AtomicLong;", "lastImuEventTimestamp", "Lwm0/b;", "", "kotlin.jvm.PlatformType", "g", "Lwm0/b;", "imuEventsLogger", "Lam0/a;", "Lam0/a;", "disposables", "()Z", "isRegistered", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g implements SensorEventListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final com.tesla.logging.g f107769j = com.tesla.logging.g.INSTANCE.a("DeviceMotionManager");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private b listener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer accuracy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Long registeredTimestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Long unregisteredTimestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wm0.b<float[]> imuEventsLogger;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final am0.a disposables;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean registered = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicLong lastImuEventTimestamp = new AtomicLong(0);

    /* JADX INFO: renamed from: rd0.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lrd0/g$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/hardware/SensorManager;", "e", "(Landroid/content/Context;)Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/Sensor;", DateTokenConverter.CONVERTER_KEY, "(Landroid/hardware/SensorManager;)Landroid/hardware/Sensor;", "", "", "c", "(Landroid/content/Context;)Ljava/util/Map;", "f", "TAG", "Ljava/lang/String;", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "", "MAX_SENSOR_REPORTING_MICROSECONDS", "I", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Sensor d(SensorManager sensorManager) {
            return sensorManager.getDefaultSensor(10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SensorManager e(Context context) {
            Object systemService = context.getSystemService("sensor");
            if (systemService instanceof SensorManager) {
                return (SensorManager) systemService;
            }
            return null;
        }

        public final Map<String, Object> c(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            SensorManager sensorManagerE = e(context);
            if (sensorManagerE == null) {
                return v0.i();
            }
            Sensor sensorD = d(sensorManagerE);
            if (sensorD == null) {
                return v0.i();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String name = sensorD.getName();
            p013kotlin.jvm.internal.s.j(name, "getName(...)");
            linkedHashMap.put("s_name", name);
            String vendor = sensorD.getVendor();
            p013kotlin.jvm.internal.s.j(vendor, "getVendor(...)");
            linkedHashMap.put("s_vendor", vendor);
            linkedHashMap.put("s_version", Integer.valueOf(sensorD.getVersion()));
            return linkedHashMap;
        }

        public final Map<String, Object> f(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            SensorManager sensorManagerE = e(context);
            if (sensorManagerE == null) {
                return v0.i();
            }
            Sensor sensorD = d(sensorManagerE);
            if (sensorD == null) {
                return v0.i();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("s_isWakeUpSensor", Boolean.valueOf(sensorD.isWakeUpSensor()));
            linkedHashMap.put("s_fifoMaxEventCount", Integer.valueOf(sensorD.getFifoMaxEventCount()));
            linkedHashMap.put("s_isDynamicSensor", Boolean.valueOf(sensorD.isDynamicSensor()));
            linkedHashMap.put("s_power", Float.valueOf(sensorD.getPower()));
            linkedHashMap.put("s_reportingMode", Integer.valueOf(sensorD.getReportingMode()));
            linkedHashMap.put("s_fifoReservedEventCount", Integer.valueOf(sensorD.getFifoReservedEventCount()));
            if (Build.VERSION.SDK_INT >= 26) {
                linkedHashMap.put("s_highestDirectReportRateLevel", Integer.valueOf(sensorD.getHighestDirectReportRateLevel()));
            }
            linkedHashMap.put("s_maxDelay", Integer.valueOf(sensorD.getMaxDelay()));
            linkedHashMap.put("s_minDelay", Integer.valueOf(sensorD.getMinDelay()));
            linkedHashMap.put("s_maximumRange", Float.valueOf(sensorD.getMaximumRange()));
            linkedHashMap.put("s_resolution", Float.valueOf(sensorD.getResolution()));
            linkedHashMap.put("s_type", Integer.valueOf(sensorD.getType()));
            return v0.r(linkedHashMap, c(context));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrd0/g$b;", "", "", "values", "Ljn0/h0;", "c", "([F)V", "h", "()V", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void c(float[] values);

        void h();
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T, R> f107778a = new c<>();

        c() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final float[] apply(Throwable it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return new float[0];
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d<T> implements cm0.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tesla.logging.g f107780b;

        d(com.tesla.logging.g gVar) {
            this.f107780b = gVar;
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(float[] fArr) {
            g.this.getLastImuEventTimestamp().set(System.currentTimeMillis());
            com.tesla.logging.g gVar = this.f107780b;
            p013kotlin.jvm.internal.s.h(fArr);
            gVar.j("IMU event! " + p013kotlin.collections.n.R0(fArr, null, null, null, 0, null, null, 63, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"rd0/g$e", "Landroid/hardware/TriggerEventListener;", "Landroid/hardware/TriggerEvent;", "event", "Ljn0/h0;", "onTrigger", "(Landroid/hardware/TriggerEvent;)V", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends TriggerEventListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f107782b;

        e(Context context) {
            this.f107782b = context;
        }

        @Override // android.hardware.TriggerEventListener
        public void onTrigger(TriggerEvent event) {
            g.f107769j.j("Significant motion detected.");
            b bVar = g.this.listener;
            if (bVar != null) {
                bVar.h();
            }
            g.this.i(this.f107782b);
        }
    }

    public g() {
        wm0.b<float[]> bVarD0 = wm0.b.d0();
        p013kotlin.jvm.internal.s.j(bVarD0, "create(...)");
        this.imuEventsLogger = bVarD0;
        this.disposables = new am0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(Context context) {
        Sensor defaultSensor;
        SensorManager sensorManagerE = INSTANCE.e(context);
        if (sensorManagerE == null || (defaultSensor = sensorManagerE.getDefaultSensor(17)) == null) {
            return false;
        }
        sensorManagerE.requestTriggerSensor(new e(context), defaultSensor);
        return true;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AtomicLong getLastImuEventTimestamp() {
        return this.lastImuEventTimestamp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getRegisteredTimestamp() {
        return this.registeredTimestamp;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getUnregisteredTimestamp() {
        return this.unregisteredTimestamp;
    }

    public final boolean g() {
        return this.registered.get();
    }

    public final void h(Context context, b listener, String instanceId) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(listener, "listener");
        p013kotlin.jvm.internal.s.k(instanceId, "instanceId");
        com.tesla.logging.g gVarP = f107769j.p(instanceId);
        this.listener = listener;
        if (!this.registered.compareAndSet(false, true)) {
            gVarP.j("Already registered, doing nothing more.");
            return;
        }
        if (!i(context)) {
            gVarP.j("Failed to register significant motion sensor!");
        }
        Companion companion = INSTANCE;
        SensorManager sensorManagerE = companion.e(context);
        if (sensorManagerE == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVarP.getTag();
            String strG = gVarP.g("SensorManager not supported on device.");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        Sensor sensorD = companion.d(sensorManagerE);
        if (sensorD == null) {
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVarP.getTag();
            String strG2 = gVarP.g("LinearAcceleration sensor not supported on device.");
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = v0.f(x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
            return;
        }
        this.disposables.f();
        this.lastImuEventTimestamp.set(0L);
        sensorManagerE.unregisterListener(this);
        if (sensorManagerE.registerListener(this, sensorD, 3, 3000000)) {
            this.disposables.b(this.imuEventsLogger.U(5L, TimeUnit.MINUTES).G(c.f107778a).N(new d(gVarP)));
            this.registeredTimestamp = Long.valueOf(System.currentTimeMillis());
            this.unregisteredTimestamp = null;
            gVarP.j("registered device motion sensor listener!");
            return;
        }
        TeslaLog teslaLog3 = TeslaLog.INSTANCE;
        String tag3 = gVarP.getTag();
        String strG3 = gVarP.g("failed to register sensor (not supported or enabled)!");
        zb0.a aVar3 = zb0.a.f128044a;
        Map mapF3 = v0.f(x.a(tag3, strG3));
        FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry3 : mapF3.entrySet()) {
            zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
        }
        firebaseCrashlytics3.recordException(new Exception(strG3));
        TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
        vr0.a.INSTANCE.a(strG3, new Object[0]);
        this.registered.set(false);
    }

    public final void j(Context context, String instanceId) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(instanceId, "instanceId");
        com.tesla.logging.g gVarP = f107769j.p(instanceId);
        Object systemService = context.getSystemService("sensor");
        p013kotlin.jvm.internal.s.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        Sensor sensorD = INSTANCE.d(sensorManager);
        this.registered.set(false);
        if (sensorD == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVarP.getTag();
            String strG = gVarP.g("LinearAcceleration sensor not supported on device.");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
        sensorManager.unregisterListener(this);
        gVarP.j("unregistered device motion sensor listener!");
        this.unregisteredTimestamp = Long.valueOf(System.currentTimeMillis());
        this.lastImuEventTimestamp.set(0L);
        this.disposables.f();
        this.listener = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        Integer num = this.accuracy;
        this.accuracy = Integer.valueOf(accuracy);
        if (num != null && num.intValue() == accuracy) {
            return;
        }
        f107769j.j("onAccuracyChanged: " + num + " -> " + accuracy);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        if (event != null && event.sensor.getType() == 10) {
            float[] fArr = event.values;
            this.imuEventsLogger.onNext(fArr);
            if (this.listener == null) {
                com.tesla.logging.g gVar = f107769j;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("No listener registered but receiving IMU events?");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
            }
            b bVar = this.listener;
            if (bVar != null) {
                p013kotlin.jvm.internal.s.h(fArr);
                bVar.c(fArr);
            }
        }
    }
}
