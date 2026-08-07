package expo.modules.sensors;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J \u0010\u0019\u001a\u00020\u00102\u000e\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001c\u001a\u00020\u00102\u000e\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\u001b\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lexpo/modules/sensors/SensorSubscription;", "Landroid/hardware/SensorEventListener2;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "sensorType", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "updateInterval", "<init>", "(Landroid/content/Context;ILandroid/hardware/SensorEventListener2;J)V", "", "hasHighSamplingRateSensorsPermission", "()Z", "Landroid/hardware/SensorEvent;", "sensorEvent", "Ljn0/h0;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "startObserving", "()V", "stopObserving", "Landroid/hardware/Sensor;", "kotlin.jvm.PlatformType", "p0", "onFlushCompleted", "(Landroid/hardware/Sensor;)V", "p1", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/content/Context;", "I", "Landroid/hardware/SensorEventListener2;", "J", "getUpdateInterval", "()J", "setUpdateInterval", "(J)V", "mSensor", "Landroid/hardware/Sensor;", "Landroid/hardware/SensorManager;", "mSensorManager", "Landroid/hardware/SensorManager;", "lastUpdate", "getSamplingPeriodUs", "()I", "samplingPeriodUs", "expo-sensors_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SensorSubscription implements SensorEventListener2 {
    private final Context context;
    private long lastUpdate;
    private final SensorEventListener2 listener;
    private Sensor mSensor;
    private final SensorManager mSensorManager;
    private final int sensorType;
    private long updateInterval;

    public SensorSubscription(Context context, int i11, SensorEventListener2 listener, long j11) {
        s.k(context, "context");
        s.k(listener, "listener");
        this.context = context;
        this.sensorType = i11;
        this.listener = listener;
        this.updateInterval = j11;
        Object systemService = context.getSystemService("sensor");
        s.i(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.mSensorManager = (SensorManager) systemService;
    }

    private final int getSamplingPeriodUs() {
        return hasHighSamplingRateSensorsPermission() ? 0 : 3;
    }

    private final boolean hasHighSamplingRateSensorsPermission() {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 4096);
            if (packageInfo == null) {
                return false;
            }
            String[] strArr = packageInfo.requestedPermissions;
            Boolean boolValueOf = strArr != null ? Boolean.valueOf(n.e0(strArr, "android.permission.HIGH_SAMPLING_RATE_SENSORS")) : null;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final long getUpdateInterval() {
        return this.updateInterval;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor p11, int p12) {
        this.listener.onAccuracyChanged(p11, p12);
    }

    @Override // android.hardware.SensorEventListener2
    public void onFlushCompleted(Sensor p11) {
        this.listener.onFlushCompleted(p11);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        s.k(sensorEvent, "sensorEvent");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastUpdate > this.updateInterval) {
            this.listener.onSensorChanged(sensorEvent);
            this.lastUpdate = jCurrentTimeMillis;
        }
    }

    public final void setUpdateInterval(long j11) {
        this.updateInterval = j11;
    }

    public final void startObserving() {
        Sensor defaultSensor = this.mSensorManager.getDefaultSensor(this.sensorType);
        this.mSensor = defaultSensor;
        if (defaultSensor != null) {
            this.mSensorManager.registerListener(this, defaultSensor, getSamplingPeriodUs());
        }
    }

    public final void stopObserving() {
        this.mSensorManager.unregisterListener(this);
    }

    public /* synthetic */ SensorSubscription(Context context, int i11, SensorEventListener2 sensorEventListener2, long j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i11, sensorEventListener2, (i12 & 8) != 0 ? 100L : j11);
    }
}
