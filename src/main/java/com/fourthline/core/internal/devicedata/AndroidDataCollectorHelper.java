package com.fourthline.core.internal.devicedata;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001c\u001a\u00020\u001f*\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010 J\u0011\u0010#\u001a\u00020\"*\u00020!¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u00020\"*\u00020!¢\u0006\u0004\b%\u0010$J#\u0010)\u001a\u00020\"2\u0014\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u001f0&¢\u0006\u0004\b)\u0010*J)\u0010-\u001a\u00020\"2\u001a\u0010(\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001f0+¢\u0006\u0004\b-\u0010.J\u0019\u0010)\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u00100J!\u0010-\u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b-\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR(\u0010Z\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u001f0&0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR.\u0010\\\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001f0+0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010YR\u0014\u0010`\u001a\u00020]8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006a"}, d2 = {"Lcom/fourthline/core/internal/devicedata/AndroidDataCollectorHelper;", "Landroid/hardware/SensorEventListener;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/telephony/TelephonyManager;", "telephonyManager", "Landroid/location/LocationManager;", "locationManager", "Landroid/net/ConnectivityManager;", "connectivityManager", "Landroid/os/BatteryManager;", "batteryManager", "Landroid/os/PowerManager;", "powerManager", "Landroid/app/ActivityManager;", "activityManager", "Landroid/view/WindowManager;", "windowManager", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/hardware/SensorManager;", "sensorManager", "coroutineScope", "<init>", "(Landroid/content/Context;Landroid/telephony/TelephonyManager;Landroid/location/LocationManager;Landroid/net/ConnectivityManager;Landroid/os/BatteryManager;Landroid/os/PowerManager;Landroid/app/ActivityManager;Landroid/view/WindowManager;Landroid/content/ContentResolver;Landroid/hardware/SensorManager;Lkotlinx/coroutines/CoroutineScope;)V", "Landroid/hardware/Sensor;", "Lkotlinx/coroutines/Job;", "a", "(Landroid/hardware/Sensor;)Lkotlinx/coroutines/Job;", "sensor", "Ljn0/h0;", "(Landroid/hardware/SensorManager;Landroid/hardware/Sensor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "isFeatureAvailable", "(Ljava/lang/String;)Z", "isPermissionAvailable", "Lkotlin/Function1;", "Landroid/hardware/SensorEvent;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onSensorChanged", "(Lwn0/l;)Z", "Lkotlin/Function2;", "", "onAccuracyChanged", "(Lwn0/p;)Z", "event", "(Landroid/hardware/SensorEvent;)V", "accuracy", "(Landroid/hardware/Sensor;I)V", "b", "Landroid/content/Context;", "c", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "()Landroid/telephony/TelephonyManager;", DateTokenConverter.CONVERTER_KEY, "Landroid/location/LocationManager;", "getLocationManager", "()Landroid/location/LocationManager;", "e", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "f", "Landroid/os/BatteryManager;", "getBatteryManager", "()Landroid/os/BatteryManager;", "g", "Landroid/os/PowerManager;", "getPowerManager", "()Landroid/os/PowerManager;", "h", "Landroid/app/ActivityManager;", "getActivityManager", "()Landroid/app/ActivityManager;", IntegerTokenConverter.CONVERTER_KEY, "Landroid/view/WindowManager;", "getWindowManager", "()Landroid/view/WindowManager;", "j", "Landroid/content/ContentResolver;", "getContentResolver", "()Landroid/content/ContentResolver;", "k", "Landroid/hardware/SensorManager;", "", "l", "Ljava/util/List;", "sensorChangedListeners", "m", "accuracyChangedListeners", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidDataCollectorHelper implements SensorEventListener, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f24085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TelephonyManager telephonyManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LocationManager locationManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final BatteryManager batteryManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final PowerManager powerManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ActivityManager activityManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final WindowManager windowManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ContentResolver contentResolver;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SensorManager sensorManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List sensorChangedListeners;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List accuracyChangedListeners;

    static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SensorManager f24098a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AndroidDataCollectorHelper f24099b;

        a(SensorManager sensorManager, AndroidDataCollectorHelper androidDataCollectorHelper) {
            this.f24098a = sensorManager;
            this.f24099b = androidDataCollectorHelper;
        }

        public final void a(Throwable th2) {
            this.f24098a.unregisterListener(this.f24099b);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return h0.f84049a;
        }
    }

    static final class b extends SuspendLambda implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24100a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Sensor f24102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Sensor sensor, Continuation continuation) {
            super(2, continuation);
            this.f24102c = sensor;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AndroidDataCollectorHelper.this.new b(this.f24102c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f24100a;
            if (i11 == 0) {
                t.b(obj);
                SensorManager sensorManager = AndroidDataCollectorHelper.this.sensorManager;
                if (sensorManager != null) {
                    AndroidDataCollectorHelper androidDataCollectorHelper = AndroidDataCollectorHelper.this;
                    Sensor sensor = this.f24102c;
                    this.f24100a = 1;
                    if (androidDataCollectorHelper.a(sensorManager, sensor, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    public AndroidDataCollectorHelper(Context context, TelephonyManager telephonyManager, LocationManager locationManager, ConnectivityManager connectivityManager, BatteryManager batteryManager, PowerManager powerManager, ActivityManager activityManager, WindowManager windowManager, ContentResolver contentResolver, SensorManager sensorManager, CoroutineScope coroutineScope) {
        s.k(context, "context");
        s.k(contentResolver, "contentResolver");
        s.k(coroutineScope, "coroutineScope");
        this.f24085a = coroutineScope;
        this.context = context;
        this.telephonyManager = telephonyManager;
        this.locationManager = locationManager;
        this.connectivityManager = connectivityManager;
        this.batteryManager = batteryManager;
        this.powerManager = powerManager;
        this.activityManager = activityManager;
        this.windowManager = windowManager;
        this.contentResolver = contentResolver;
        this.sensorManager = sensorManager;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(6);
            if (defaultSensor != null) {
                a(defaultSensor);
            }
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(12);
            if (defaultSensor2 != null) {
                a(defaultSensor2);
            }
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
            if (defaultSensor3 != null) {
                a(defaultSensor3);
            }
            Sensor defaultSensor4 = sensorManager.getDefaultSensor(1);
            if (defaultSensor4 != null) {
                a(defaultSensor4);
            }
            Sensor defaultSensor5 = sensorManager.getDefaultSensor(4);
            if (defaultSensor5 != null) {
                a(defaultSensor5);
            }
        }
        this.sensorChangedListeners = new ArrayList();
        this.accuracyChangedListeners = new ArrayList();
    }

    private final Job a(Sensor sensor) {
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(sensor, null), 3, null);
    }

    public final ActivityManager getActivityManager() {
        return this.activityManager;
    }

    public final BatteryManager getBatteryManager() {
        return this.batteryManager;
    }

    public final ConnectivityManager getConnectivityManager() {
        return this.connectivityManager;
    }

    public final ContentResolver getContentResolver() {
        return this.contentResolver;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f24085a.getCoroutineContext();
    }

    public final LocationManager getLocationManager() {
        return this.locationManager;
    }

    public final PowerManager getPowerManager() {
        return this.powerManager;
    }

    public final TelephonyManager getTelephonyManager() {
        return this.telephonyManager;
    }

    public final WindowManager getWindowManager() {
        return this.windowManager;
    }

    public final boolean isFeatureAvailable(String str) {
        s.k(str, "<this>");
        FeatureInfo[] systemAvailableFeatures = this.context.getPackageManager().getSystemAvailableFeatures();
        s.j(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
        ArrayList arrayList = new ArrayList(systemAvailableFeatures.length);
        for (FeatureInfo featureInfo : systemAvailableFeatures) {
            arrayList.add(featureInfo.name);
        }
        return arrayList.contains(str);
    }

    public final boolean isPermissionAvailable(String str) {
        s.k(str, "<this>");
        return this.context.checkSelfPermission(str) == 0;
    }

    public final boolean onAccuracyChanged(p<? super Sensor, ? super Integer, h0> listener) {
        s.k(listener, "listener");
        return this.accuracyChangedListeners.add(listener);
    }

    public final boolean onSensorChanged(l<? super SensorEvent, h0> listener) {
        s.k(listener, "listener");
        return this.sensorChangedListeners.add(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(SensorManager sensorManager, Sensor sensor, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        sensorManager.registerListener(this, sensor, 0);
        cancellableContinuationImpl.invokeOnCancellation(new a(sensorManager, this));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : h0.f84049a;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        Iterator it = this.accuracyChangedListeners.iterator();
        while (it.hasNext()) {
            ((p) it.next()).invoke(sensor, Integer.valueOf(accuracy));
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        Iterator it = this.sensorChangedListeners.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(event);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AndroidDataCollectorHelper(Context context, TelephonyManager telephonyManager, LocationManager locationManager, ConnectivityManager connectivityManager, BatteryManager batteryManager, PowerManager powerManager, ActivityManager activityManager, WindowManager windowManager, ContentResolver contentResolver, SensorManager sensorManager, CoroutineScope coroutineScope, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        TelephonyManager telephonyManager2;
        LocationManager locationManager2;
        ConnectivityManager connectivityManager2;
        BatteryManager batteryManager2;
        PowerManager powerManager2;
        ActivityManager activityManager2;
        WindowManager windowManager2;
        ContentResolver contentResolver2;
        SensorManager sensorManager2;
        if ((i11 & 2) != 0) {
            Object systemService = context.getSystemService("phone");
            telephonyManager2 = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        } else {
            telephonyManager2 = telephonyManager;
        }
        if ((i11 & 4) != 0) {
            Object systemService2 = context.getSystemService("location");
            locationManager2 = systemService2 instanceof LocationManager ? (LocationManager) systemService2 : null;
        } else {
            locationManager2 = locationManager;
        }
        if ((i11 & 8) != 0) {
            Object systemService3 = context.getSystemService("connectivity");
            connectivityManager2 = systemService3 instanceof ConnectivityManager ? (ConnectivityManager) systemService3 : null;
        } else {
            connectivityManager2 = connectivityManager;
        }
        if ((i11 & 16) != 0) {
            Object systemService4 = context.getSystemService("batterymanager");
            batteryManager2 = systemService4 instanceof BatteryManager ? (BatteryManager) systemService4 : null;
        } else {
            batteryManager2 = batteryManager;
        }
        if ((i11 & 32) != 0) {
            Object systemService5 = context.getSystemService("power");
            powerManager2 = systemService5 instanceof PowerManager ? (PowerManager) systemService5 : null;
        } else {
            powerManager2 = powerManager;
        }
        if ((i11 & 64) != 0) {
            Object systemService6 = context.getSystemService("activity");
            activityManager2 = systemService6 instanceof ActivityManager ? (ActivityManager) systemService6 : null;
        } else {
            activityManager2 = activityManager;
        }
        if ((i11 & 128) != 0) {
            Object systemService7 = context.getSystemService("window");
            windowManager2 = systemService7 instanceof WindowManager ? (WindowManager) systemService7 : null;
        } else {
            windowManager2 = windowManager;
        }
        ContentResolver contentResolver3 = (i11 & 256) != 0 ? context.getContentResolver() : contentResolver;
        if ((i11 & 512) != 0) {
            Object systemService8 = context.getSystemService("sensor");
            if (systemService8 instanceof SensorManager) {
                contentResolver2 = contentResolver3;
                sensorManager2 = (SensorManager) systemService8;
            } else {
                ContentResolver contentResolver4 = contentResolver3;
                sensorManager2 = null;
                contentResolver2 = contentResolver4;
            }
        } else {
            contentResolver2 = contentResolver3;
            sensorManager2 = sensorManager;
        }
        this(context, telephonyManager2, locationManager2, connectivityManager2, batteryManager2, powerManager2, activityManager2, windowManager2, contentResolver2, sensorManager2, coroutineScope);
    }
}
