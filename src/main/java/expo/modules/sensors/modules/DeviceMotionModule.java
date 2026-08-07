package expo.modules.sensors.modules;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import co0.q;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.sensors.SensorSubscription;
import ezvcard.property.Gender;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.m;
import jn0.x;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0003>?=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u00060-R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u000600R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R!\u0010<\u001a\b\u0012\u0004\u0012\u000207068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006@"}, d2 = {"Lexpo/modules/sensors/modules/DeviceMotionModule;", "Lexpo/modules/kotlin/modules/Module;", "Landroid/hardware/SensorEventListener2;", "<init>", "()V", "Landroid/os/Bundle;", "eventsToMap", "()Landroid/os/Bundle;", "", "getOrientation", "()I", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "Landroid/hardware/SensorEvent;", "sensorEvent", "Ljn0/h0;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "Landroid/hardware/Sensor;", "sensor", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "onFlushCompleted", "(Landroid/hardware/Sensor;)V", "", "lastUpdate", "J", "", "updateInterval", Gender.FEMALE, "", "rotationMatrix", "[F", "rotationResult", "accelerationEvent", "Landroid/hardware/SensorEvent;", "accelerationIncludingGravityEvent", "rotationEvent", "rotationRateEvent", "gravityEvent", "Lexpo/modules/core/interfaces/services/UIManager;", "uiManager", "Lexpo/modules/core/interfaces/services/UIManager;", "Lexpo/modules/sensors/modules/DeviceMotionModule$ScheduleDispatchFrameCallback;", "currentFrameCallback", "Lexpo/modules/sensors/modules/DeviceMotionModule$ScheduleDispatchFrameCallback;", "Lexpo/modules/sensors/modules/DeviceMotionModule$DispatchEventRunnable;", "dispatchEventRunnable", "Lexpo/modules/sensors/modules/DeviceMotionModule$DispatchEventRunnable;", "", "isObserving", "Z", "", "Lexpo/modules/sensors/SensorSubscription;", "subscriptions$delegate", "Lkotlin/Lazy;", "getSubscriptions", "()Ljava/util/List;", "subscriptions", "Companion", "ScheduleDispatchFrameCallback", "DispatchEventRunnable", "expo-sensors_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceMotionModule extends Module implements SensorEventListener2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = o0.b(DeviceMotionModule.class).l();
    private SensorEvent accelerationEvent;
    private SensorEvent accelerationIncludingGravityEvent;
    private SensorEvent gravityEvent;
    private boolean isObserving;
    private long lastUpdate;
    private SensorEvent rotationEvent;
    private SensorEvent rotationRateEvent;
    private UIManager uiManager;
    private float updateInterval = 0.016666668f;
    private final float[] rotationMatrix = new float[9];
    private final float[] rotationResult = new float[3];
    private final ScheduleDispatchFrameCallback currentFrameCallback = new ScheduleDispatchFrameCallback();
    private final DispatchEventRunnable dispatchEventRunnable = new DispatchEventRunnable(this, new WeakReference(this));

    /* JADX INFO: renamed from: subscriptions$delegate, reason: from kotlin metadata */
    private final Lazy subscriptions = m.b(new wn0.a() { // from class: expo.modules.sensors.modules.c
        @Override // wn0.a
        public final Object invoke() {
            return DeviceMotionModule.subscriptions_delegate$lambda$1(this.f63425a);
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/sensors/modules/DeviceMotionModule$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "expo-sensors_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return DeviceMotionModule.TAG;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/sensors/modules/DeviceMotionModule$DispatchEventRunnable;", "Ljava/lang/Runnable;", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/sensors/modules/DeviceMotionModule;", "weakReference", "<init>", "(Lexpo/modules/sensors/modules/DeviceMotionModule;Ljava/lang/ref/WeakReference;)V", "Ljn0/h0;", "run", "()V", "Ljava/lang/ref/WeakReference;", "expo-sensors_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class DispatchEventRunnable implements Runnable {
        final /* synthetic */ DeviceMotionModule this$0;
        private final WeakReference<DeviceMotionModule> weakReference;

        public DispatchEventRunnable(DeviceMotionModule deviceMotionModule, WeakReference<DeviceMotionModule> weakReference) {
            s.k(weakReference, "weakReference");
            this.this$0 = deviceMotionModule;
            this.weakReference = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceMotionModule deviceMotionModule = this.weakReference.get();
            if (deviceMotionModule != null) {
                deviceMotionModule.sendEvent("deviceMotionDidUpdate", this.this$0.eventsToMap());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/sensors/modules/DeviceMotionModule$ScheduleDispatchFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lexpo/modules/sensors/modules/DeviceMotionModule;)V", "Ljn0/h0;", "post", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "stop", "maybePost", "maybePostFromNonUI", "", "mIsPosted", "Z", "mShouldStop", "expo-sensors_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class ScheduleDispatchFrameCallback implements Choreographer.FrameCallback {
        private volatile boolean mIsPosted;
        private volatile boolean mShouldStop;

        public ScheduleDispatchFrameCallback() {
        }

        private final void post() {
            Choreographer.getInstance().postFrameCallback(DeviceMotionModule.this.currentFrameCallback);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            synchronized (this) {
                try {
                    if (this.mShouldStop) {
                        this.mIsPosted = false;
                    } else {
                        post();
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - DeviceMotionModule.this.lastUpdate > DeviceMotionModule.this.updateInterval) {
                UIManager uIManager = DeviceMotionModule.this.uiManager;
                if (uIManager == null) {
                    s.B("uiManager");
                    uIManager = null;
                }
                uIManager.runOnClientCodeQueueThread(DeviceMotionModule.this.dispatchEventRunnable);
                DeviceMotionModule.this.lastUpdate = jCurrentTimeMillis;
            }
        }

        public final void maybePost() {
            synchronized (this) {
                try {
                    this.mShouldStop = false;
                    if (!this.mIsPosted) {
                        this.mIsPosted = true;
                        post();
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void maybePostFromNonUI() {
            if (this.mIsPosted) {
                return;
            }
            UIManager uIManager = DeviceMotionModule.this.uiManager;
            if (uIManager == null) {
                s.B("uiManager");
                uIManager = null;
            }
            uIManager.runOnUiQueueThread(new Runnable() { // from class: expo.modules.sensors.modules.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63426a.maybePost();
                }
            });
        }

        public final void stop() {
            synchronized (this) {
                this.mShouldStop = true;
                h0 h0Var = h0.f84049a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle eventsToMap() {
        Bundle bundle = new Bundle();
        if (this.accelerationEvent != null) {
            Bundle bundle2 = new Bundle();
            SensorEvent sensorEvent = this.accelerationEvent;
            s.h(sensorEvent);
            bundle2.putDouble("x", sensorEvent.values[0]);
            SensorEvent sensorEvent2 = this.accelerationEvent;
            s.h(sensorEvent2);
            bundle2.putDouble("y", sensorEvent2.values[1]);
            SensorEvent sensorEvent3 = this.accelerationEvent;
            s.h(sensorEvent3);
            bundle2.putDouble("z", sensorEvent3.values[2]);
            SensorEvent sensorEvent4 = this.accelerationEvent;
            s.h(sensorEvent4);
            bundle2.putDouble("timestamp", sensorEvent4.timestamp / 1.0E9d);
            h0 h0Var = h0.f84049a;
            bundle.putBundle("acceleration", bundle2);
        }
        if (this.accelerationIncludingGravityEvent != null && this.gravityEvent != null) {
            Bundle bundle3 = new Bundle();
            SensorEvent sensorEvent5 = this.accelerationIncludingGravityEvent;
            s.h(sensorEvent5);
            float f11 = sensorEvent5.values[0];
            float f12 = 2;
            SensorEvent sensorEvent6 = this.gravityEvent;
            s.h(sensorEvent6);
            bundle3.putDouble("x", f11 - (sensorEvent6.values[0] * f12));
            SensorEvent sensorEvent7 = this.accelerationIncludingGravityEvent;
            s.h(sensorEvent7);
            float f13 = sensorEvent7.values[1];
            SensorEvent sensorEvent8 = this.gravityEvent;
            s.h(sensorEvent8);
            bundle3.putDouble("y", f13 - (sensorEvent8.values[1] * f12));
            SensorEvent sensorEvent9 = this.accelerationIncludingGravityEvent;
            s.h(sensorEvent9);
            float f14 = sensorEvent9.values[2];
            SensorEvent sensorEvent10 = this.gravityEvent;
            s.h(sensorEvent10);
            bundle3.putDouble("z", f14 - (f12 * sensorEvent10.values[2]));
            SensorEvent sensorEvent11 = this.accelerationIncludingGravityEvent;
            s.h(sensorEvent11);
            bundle3.putDouble("timestamp", sensorEvent11.timestamp / 1.0E9d);
            h0 h0Var2 = h0.f84049a;
            bundle.putBundle("accelerationIncludingGravity", bundle3);
        }
        if (this.rotationRateEvent != null) {
            Bundle bundle4 = new Bundle();
            SensorEvent sensorEvent12 = this.rotationRateEvent;
            s.h(sensorEvent12);
            bundle4.putDouble("alpha", Math.toDegrees(sensorEvent12.values[0]));
            SensorEvent sensorEvent13 = this.rotationRateEvent;
            s.h(sensorEvent13);
            bundle4.putDouble("beta", Math.toDegrees(sensorEvent13.values[1]));
            SensorEvent sensorEvent14 = this.rotationRateEvent;
            s.h(sensorEvent14);
            bundle4.putDouble("gamma", Math.toDegrees(sensorEvent14.values[2]));
            SensorEvent sensorEvent15 = this.rotationRateEvent;
            s.h(sensorEvent15);
            bundle4.putDouble("timestamp", sensorEvent15.timestamp / 1.0E9d);
            h0 h0Var3 = h0.f84049a;
            bundle.putBundle("rotationRate", bundle4);
        }
        SensorEvent sensorEvent16 = this.rotationEvent;
        if (sensorEvent16 != null) {
            float[] fArr = this.rotationMatrix;
            s.h(sensorEvent16);
            SensorManager.getRotationMatrixFromVector(fArr, sensorEvent16.values);
            SensorManager.getOrientation(this.rotationMatrix, this.rotationResult);
            Bundle bundle5 = new Bundle();
            bundle5.putDouble("alpha", -this.rotationResult[0]);
            bundle5.putDouble("beta", -this.rotationResult[1]);
            bundle5.putDouble("gamma", this.rotationResult[2]);
            SensorEvent sensorEvent17 = this.rotationEvent;
            s.h(sensorEvent17);
            bundle5.putDouble("timestamp", sensorEvent17.timestamp / 1.0E9d);
            h0 h0Var4 = h0.f84049a;
            bundle.putBundle("rotation", bundle5);
        }
        bundle.putDouble("interval", this.updateInterval);
        bundle.putInt("orientation", getOrientation());
        return bundle;
    }

    private final int getOrientation() {
        Display defaultDisplay;
        Context reactContext = getAppContext().getReactContext();
        Integer numValueOf = null;
        Object systemService = reactContext != null ? reactContext.getSystemService("window") : null;
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (Build.VERSION.SDK_INT >= 30) {
            Activity currentActivity = getAppContext().getCurrentActivity();
            if (currentActivity == null) {
                Log.e(TAG, "[expo-sensors]: The currentActivity is no longer available");
                numValueOf = 0;
            } else {
                Display display = currentActivity.getDisplay();
                if (display != null) {
                    numValueOf = Integer.valueOf(display.getRotation());
                }
            }
        } else if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            numValueOf = Integer.valueOf(defaultDisplay.getRotation());
        }
        if (numValueOf == null || numValueOf.intValue() == 0) {
            return 0;
        }
        if (numValueOf.intValue() == 1) {
            return 90;
        }
        if (numValueOf.intValue() == 2) {
            return 180;
        }
        return numValueOf.intValue() == 3 ? -90 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SensorSubscription> getSubscriptions() {
        return (List) this.subscriptions.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List subscriptions_delegate$lambda$1(DeviceMotionModule deviceMotionModule) throws Exceptions.ReactContextLost {
        Context reactContext = deviceMotionModule.getAppContext().getReactContext();
        if (reactContext == null) {
            throw new Exceptions.ReactContextLost();
        }
        ArrayList arrayList = DeviceMotionModuleKt.sensorTypes;
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new SensorSubscription(reactContext, ((Number) it.next()).intValue(), deviceMotionModule, 0L));
        }
        return arrayList2;
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent2;
        AsyncFunctionComponent stringAsyncFunctionComponent3;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent3;
        AsyncFunctionComponent stringAsyncFunctionComponent4;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExponentDeviceMotion");
            moduleDefinitionBuilder.Events("deviceMotionDidUpdate");
            moduleDefinitionBuilder.Constants(x.a("Gravity", Float.valueOf(9.80665f)));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$OnCreate$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Object module;
                    DeviceMotionModule deviceMotionModule = this.this$0;
                    try {
                        module = deviceMotionModule.getAppContext().getLegacyModuleRegistry().getModule(UIManager.class);
                    } catch (Exception unused) {
                        module = null;
                    }
                    s.h(module);
                    deviceMotionModule.uiManager = (UIManager) module;
                }
            }));
            boolean zF = s.f(Float.class, Promise.class);
            Class cls = Float.TYPE;
            Class cls2 = Double.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            if (zF) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("setUpdateInterval", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        this.this$0.updateInterval = ((Float) promise).floatValue();
                    }

                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }
                });
            } else {
                TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
                AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Float.class), Boolean.FALSE));
                if (anyType == null) {
                    anyType = new AnyType(new LazyKType(o0.b(Float.class), false, new wn0.a<q>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Float.TYPE);
                        }
                    }), converters);
                }
                AnyType[] anyTypeArr = {anyType};
                l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$3
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        this.this$0.updateInterval = ((Number) objArr[0]).floatValue();
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent = new IntAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
                } else if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
                } else {
                    stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("setUpdateInterval", anyTypeArr, lVar);
                }
                asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("setUpdateInterval", asyncFunctionWithPromiseComponent);
            if (s.f(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent2 = new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$4
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        if (Build.VERSION.SDK_INT >= 29) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.ACTIVITY_RECOGNITION");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, new String[0]);
                        }
                    }
                });
            } else {
                TypeConverterProvider converters2 = moduleDefinitionBuilder.getConverters();
                AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Promise.class), Boolean.FALSE));
                if (anyType2 == null) {
                    anyType2 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$5
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters2);
                }
                AnyType[] anyTypeArr2 = {anyType2};
                l<Object[], h0> lVar2 = new l<Object[], h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$6
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (Build.VERSION.SDK_INT >= 29) {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.ACTIVITY_RECOGNITION");
                        } else {
                            Permissions.getPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, new String[0]);
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                } else if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                } else {
                    stringAsyncFunctionComponent2 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("getPermissionsAsync", anyTypeArr2, lVar2);
                }
                asyncFunctionWithPromiseComponent2 = stringAsyncFunctionComponent2;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getPermissionsAsync", asyncFunctionWithPromiseComponent2);
            if (s.f(Promise.class, Promise.class)) {
                asyncFunctionWithPromiseComponent3 = new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$7
                    @Override // wn0.p
                    public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return h0.f84049a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        s.k(objArr, "<unused var>");
                        s.k(promise, "promise");
                        if (Build.VERSION.SDK_INT >= 29) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.ACTIVITY_RECOGNITION");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, new String[0]);
                        }
                    }
                });
            } else {
                TypeConverterProvider converters3 = moduleDefinitionBuilder.getConverters();
                AnyType anyType3 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(Promise.class), Boolean.FALSE));
                if (anyType3 == null) {
                    anyType3 = new AnyType(new LazyKType(o0.b(Promise.class), false, new wn0.a<q>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$8
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // wn0.a
                        public final q invoke() {
                            return o0.o(Promise.class);
                        }
                    }), converters3);
                }
                AnyType[] anyTypeArr3 = {anyType3};
                l<Object[], h0> lVar3 = new l<Object[], h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$9
                    @Override // wn0.l
                    public final h0 invoke(Object[] objArr) {
                        s.k(objArr, "<destruct>");
                        Promise promise = (Promise) objArr[0];
                        if (Build.VERSION.SDK_INT >= 29) {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, "android.permission.ACTIVITY_RECOGNITION");
                        } else {
                            Permissions.askForPermissionsWithPermissionsManager(this.this$0.getAppContext().getPermissions(), promise, new String[0]);
                        }
                        return h0.f84049a;
                    }
                };
                if (s.f(h0.class, cls4)) {
                    stringAsyncFunctionComponent3 = new IntAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, lVar3);
                } else if (s.f(h0.class, cls3)) {
                    stringAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, lVar3);
                } else if (s.f(h0.class, cls2)) {
                    stringAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, lVar3);
                } else if (s.f(h0.class, cls)) {
                    stringAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, lVar3);
                } else {
                    stringAsyncFunctionComponent3 = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, lVar3) : new UntypedAsyncFunctionComponent("requestPermissionsAsync", anyTypeArr3, lVar3);
                }
                asyncFunctionWithPromiseComponent3 = stringAsyncFunctionComponent3;
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("requestPermissionsAsync", asyncFunctionWithPromiseComponent3);
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new wn0.a<h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$OnDestroy$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.this$0.isObserving) {
                        Iterator it = this.this$0.getSubscriptions().iterator();
                        while (it.hasNext()) {
                            ((SensorSubscription) it.next()).stopObserving();
                        }
                    }
                }
            }));
            moduleDefinitionBuilder.OnStartObserving(new wn0.a<h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$1$6
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Iterator it = this.this$0.getSubscriptions().iterator();
                    while (it.hasNext()) {
                        ((SensorSubscription) it.next()).startObserving();
                    }
                    this.this$0.isObserving = true;
                    this.this$0.currentFrameCallback.maybePostFromNonUI();
                }
            });
            Map<EventName, EventListener> eventListeners3 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName3 = EventName.ACTIVITY_ENTERS_FOREGROUND;
            eventListeners3.put(eventName3, new BasicEventListener(eventName3, new wn0.a<h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$OnActivityEntersForeground$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.this$0.isObserving) {
                        Iterator it = this.this$0.getSubscriptions().iterator();
                        while (it.hasNext()) {
                            ((SensorSubscription) it.next()).startObserving();
                        }
                    }
                }
            }));
            Map<EventName, EventListener> eventListeners4 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName4 = EventName.ACTIVITY_ENTERS_BACKGROUND;
            eventListeners4.put(eventName4, new BasicEventListener(eventName4, new wn0.a<h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$OnActivityEntersBackground$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.this$0.isObserving) {
                        Iterator it = this.this$0.getSubscriptions().iterator();
                        while (it.hasNext()) {
                            ((SensorSubscription) it.next()).stopObserving();
                        }
                    }
                }
            }));
            moduleDefinitionBuilder.OnStopObserving(new wn0.a<h0>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$1$9
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (this.this$0.isObserving) {
                        Iterator it = this.this$0.getSubscriptions().iterator();
                        while (it.hasNext()) {
                            ((SensorSubscription) it.next()).stopObserving();
                        }
                    }
                    this.this$0.currentFrameCallback.stop();
                }
            });
            AnyType[] anyTypeArr4 = new AnyType[0];
            l<Object[], Boolean> lVar4 = new l<Object[], Boolean>() { // from class: expo.modules.sensors.modules.DeviceMotionModule$definition$lambda$13$$inlined$AsyncFunction$10
                @Override // wn0.l
                public final Boolean invoke(Object[] it) {
                    s.k(it, "it");
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    Object systemService = reactContext != null ? reactContext.getSystemService("sensor") : null;
                    SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                    boolean z11 = false;
                    if (sensorManager != null) {
                        Iterator it2 = DeviceMotionModuleKt.sensorTypes.iterator();
                        s.j(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            s.j(next, "next(...)");
                            if (sensorManager.getDefaultSensor(((Number) next).intValue()) == null) {
                            }
                        }
                        z11 = true;
                    }
                    return Boolean.valueOf(z11);
                }
            };
            if (s.f(Boolean.class, cls4)) {
                stringAsyncFunctionComponent4 = new IntAsyncFunctionComponent("isAvailableAsync", anyTypeArr4, lVar4);
            } else if (s.f(Boolean.class, cls3)) {
                stringAsyncFunctionComponent4 = new BoolAsyncFunctionComponent("isAvailableAsync", anyTypeArr4, lVar4);
            } else if (s.f(Boolean.class, cls2)) {
                stringAsyncFunctionComponent4 = new DoubleAsyncFunctionComponent("isAvailableAsync", anyTypeArr4, lVar4);
            } else if (s.f(Boolean.class, cls)) {
                stringAsyncFunctionComponent4 = new FloatAsyncFunctionComponent("isAvailableAsync", anyTypeArr4, lVar4);
            } else {
                stringAsyncFunctionComponent4 = s.f(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isAvailableAsync", anyTypeArr4, lVar4) : new UntypedAsyncFunctionComponent("isAvailableAsync", anyTypeArr4, lVar4);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("isAvailableAsync", stringAsyncFunctionComponent4);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        s.k(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener2
    public void onFlushCompleted(Sensor sensor) {
        s.k(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        s.k(sensorEvent, "sensorEvent");
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.accelerationIncludingGravityEvent = sensorEvent;
        } else if (type != 4) {
            switch (type) {
                case 9:
                    this.gravityEvent = sensorEvent;
                    break;
                case 10:
                    this.accelerationEvent = sensorEvent;
                    break;
                case 11:
                    this.rotationEvent = sensorEvent;
                    break;
            }
        } else {
            this.rotationRateEvent = sensorEvent;
        }
        this.currentFrameCallback.maybePostFromNonUI();
    }
}
