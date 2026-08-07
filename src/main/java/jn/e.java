package jn;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010%R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010(\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0016\u0010-\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010$R\u0016\u00100\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010,¨\u00061"}, d2 = {"Ljn/e;", "Landroid/hardware/SensorEventListener;", "Ljn/e$a;", "shakeListener", "", "minNumShakes", "<init>", "(Ljn/e$a;I)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "", "a", "", "(F)Z", "", "timestamp", "c", "(J)V", "currentTimestamp", "b", "Landroid/hardware/SensorManager;", "manager", "e", "(Landroid/hardware/SensorManager;)V", "f", "Landroid/hardware/SensorEvent;", "sensorEvent", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", IntegerTokenConverter.CONVERTER_KEY, "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Ljn/e$a;", "I", Gender.FEMALE, "accelerationX", "accelerationY", "accelerationZ", "Landroid/hardware/SensorManager;", "sensorManager", "g", "J", "lastTimestamp", "h", "numShakes", "lastShakeTimestamp", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a shakeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minNumShakes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float accelerationX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float accelerationY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float accelerationZ;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private SensorManager sensorManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long lastTimestamp;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int numShakes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long lastShakeTimestamp;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Ljn/e$a;", "", "Ljn0/h0;", "a", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void a();
    }

    public e(a shakeListener, int i11) {
        s.k(shakeListener, "shakeListener");
        this.shakeListener = shakeListener;
        this.minNumShakes = i11;
    }

    private final boolean a(float a11) {
        return Math.abs(a11) > 13.042845f;
    }

    private final void b(long currentTimestamp) {
        if (this.numShakes >= this.minNumShakes * 8) {
            d();
            this.shakeListener.a();
        }
        if (currentTimestamp - this.lastShakeTimestamp > f.f84024b) {
            d();
        }
    }

    private final void c(long timestamp) {
        this.lastShakeTimestamp = timestamp;
        this.numShakes++;
    }

    private final void d() {
        this.numShakes = 0;
        this.accelerationX = BitmapDescriptorFactory.HUE_RED;
        this.accelerationY = BitmapDescriptorFactory.HUE_RED;
        this.accelerationZ = BitmapDescriptorFactory.HUE_RED;
    }

    public final void e(SensorManager manager) {
        s.k(manager, "manager");
        Sensor defaultSensor = manager.getDefaultSensor(1);
        if (defaultSensor == null) {
            return;
        }
        this.sensorManager = manager;
        this.lastTimestamp = -1L;
        manager.registerListener(this, defaultSensor, 2);
        this.lastShakeTimestamp = 0L;
        d();
    }

    public final void f() {
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.sensorManager = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
        s.k(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        s.k(sensorEvent, "sensorEvent");
        if (sensorEvent.timestamp - this.lastTimestamp < f.f84023a) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2] - 9.80665f;
        this.lastTimestamp = sensorEvent.timestamp;
        if (a(f11) && this.accelerationX * f11 <= BitmapDescriptorFactory.HUE_RED) {
            c(sensorEvent.timestamp);
            this.accelerationX = f11;
        } else if (a(f12) && this.accelerationY * f12 <= BitmapDescriptorFactory.HUE_RED) {
            c(sensorEvent.timestamp);
            this.accelerationY = f12;
        } else if (a(f13) && this.accelerationZ * f13 <= BitmapDescriptorFactory.HUE_RED) {
            c(sensorEvent.timestamp);
            this.accelerationZ = f13;
        }
        b(sensorEvent.timestamp);
    }

    public /* synthetic */ e(a aVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i12 & 2) != 0 ? 1 : i11);
    }
}
