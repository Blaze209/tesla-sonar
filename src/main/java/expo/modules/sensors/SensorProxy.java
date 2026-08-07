package expo.modules.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.Exceptions;
import java.lang.ref.WeakReference;
import jn0.h0;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R'\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\"\u0010&\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00040\u00040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lexpo/modules/sensors/SensorProxy;", "Landroid/hardware/SensorEventListener2;", "", "sensorType", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lkotlin/Function1;", "Landroid/hardware/SensorEvent;", "Ljn0/h0;", "Lexpo/modules/sensors/OnNewEvent;", "onNewEvent", "<init>", "(ILexpo/modules/kotlin/AppContext;Lwn0/l;)V", "event", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "onFlushCompleted", "(Landroid/hardware/Sensor;)V", "updateInterval", "setUpdateInterval", "(I)V", "startObserving", "()V", "stopObserving", "onHostResume", "onHostPause", "onHostDestroy", "I", "Lwn0/l;", "getOnNewEvent", "()Lwn0/l;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "appContextHolder", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/sensors/SensorSubscription;", "sensorKernelServiceSubscription$delegate", "Lkotlin/Lazy;", "getSensorKernelServiceSubscription", "()Lexpo/modules/sensors/SensorSubscription;", "sensorKernelServiceSubscription", "", "isObserving", "Z", "expo-sensors_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SensorProxy implements SensorEventListener2 {
    private final WeakReference<AppContext> appContextHolder;
    private boolean isObserving;
    private final l<SensorEvent, h0> onNewEvent;

    /* JADX INFO: renamed from: sensorKernelServiceSubscription$delegate, reason: from kotlin metadata */
    private final Lazy sensorKernelServiceSubscription;
    private final int sensorType;

    /* JADX WARN: Multi-variable type inference failed */
    public SensorProxy(int i11, AppContext appContext, l<? super SensorEvent, h0> onNewEvent) {
        s.k(appContext, "appContext");
        s.k(onNewEvent, "onNewEvent");
        this.sensorType = i11;
        this.onNewEvent = onNewEvent;
        this.appContextHolder = new WeakReference<>(appContext);
        this.sensorKernelServiceSubscription = m.b(new wn0.a() { // from class: expo.modules.sensors.a
            @Override // wn0.a
            public final Object invoke() {
                return SensorProxy.sensorKernelServiceSubscription_delegate$lambda$0(this.f63418a);
            }
        });
    }

    private final SensorSubscription getSensorKernelServiceSubscription() {
        return (SensorSubscription) this.sensorKernelServiceSubscription.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SensorSubscription sensorKernelServiceSubscription_delegate$lambda$0(SensorProxy sensorProxy) throws Exceptions.ReactContextLost {
        Context reactContext;
        AppContext appContext = sensorProxy.appContextHolder.get();
        if (appContext == null || (reactContext = appContext.getReactContext()) == null) {
            throw new Exceptions.ReactContextLost();
        }
        return new SensorSubscription(reactContext, sensorProxy.sensorType, sensorProxy, 0L, 8, null);
    }

    public final l<SensorEvent, h0> getOnNewEvent() {
        return this.onNewEvent;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override // android.hardware.SensorEventListener2
    public void onFlushCompleted(Sensor sensor) {
    }

    public final void onHostDestroy() {
        if (this.isObserving) {
            getSensorKernelServiceSubscription().stopObserving();
            this.isObserving = false;
        }
    }

    public final void onHostPause() {
        if (this.isObserving) {
            getSensorKernelServiceSubscription().stopObserving();
        }
    }

    public final void onHostResume() {
        if (this.isObserving) {
            getSensorKernelServiceSubscription().startObserving();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        s.k(event, "event");
        this.onNewEvent.invoke(event);
    }

    public final void setUpdateInterval(int updateInterval) {
        getSensorKernelServiceSubscription().setUpdateInterval(updateInterval);
    }

    public final void startObserving() {
        this.isObserving = true;
        getSensorKernelServiceSubscription().startObserving();
    }

    public final void stopObserving() {
        if (this.isObserving) {
            this.isObserving = false;
            getSensorKernelServiceSubscription().stopObserving();
        }
    }
}
