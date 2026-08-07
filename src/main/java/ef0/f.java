package ef0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.logging.TeslaLog;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.j2;
import vc0.v;
import wn0.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u0000 C2\u00020\u0001:\u0001$B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JC\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2$\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\u001c¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R>\u0010*\u001a,\u0012\u0004\u0012\u00020\u001a\u0012\"\u0012 \u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060\u001c0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00103\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010?\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lef0/f;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "s", "(Landroid/content/Context;)V", "t", "u", "w", "x", "y", "r", "", PermissionsResponse.STATUS_KEY, "Lvc0/v;", "p", "(I)Lvc0/v;", "Lvc0/j2;", "q", "(I)Lvc0/j2;", "Lef0/b;", "o", "(Landroid/content/Context;)Lef0/b;", "", "vin", "Lkotlin/Function4;", "", "callback", "n", "(Landroid/content/Context;Ljava/lang/String;Lwn0/r;)V", "m", "(Landroid/content/Context;Ljava/lang/String;)V", "", "a", "Ljava/util/Set;", "monitoredVins", "", "b", "Ljava/util/Map;", "vinCallbacks", "Landroid/content/BroadcastReceiver;", "c", "Landroid/content/BroadcastReceiver;", "batteryReceiver", DateTokenConverter.CONVERTER_KEY, "powerStateReceiver", "e", "Z", "isReceiverRegistered", "f", "I", "lastLevel", "g", "Lvc0/v;", "lastState", "h", "Lvc0/j2;", "lastThermalState", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "lastLowPowerMode", "j", "Ljava/lang/Object;", "thermalStatusListener", "k", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile f f62886l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<String> monitoredVins;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, r<Integer, v, j2, Boolean, h0>> vinCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private BroadcastReceiver batteryReceiver;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private BroadcastReceiver powerStateReceiver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isReceiverRegistered;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int lastLevel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private v lastState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private j2 lastThermalState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Boolean lastLowPowerMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Object thermalStatusListener;

    /* JADX INFO: renamed from: ef0.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lef0/f$a;", "", "<init>", "()V", "Lef0/f;", "a", "()Lef0/f;", "instance", "Lef0/f;", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            f fVar;
            f fVar2 = f.f62886l;
            if (fVar2 != null) {
                return fVar2;
            }
            synchronized (this) {
                fVar = f.f62886l;
                if (fVar == null) {
                    fVar = new f(null);
                    f.f62886l = fVar;
                }
            }
            return fVar;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ef0/f$b", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (s.f(intent != null ? intent.getAction() : null, "android.intent.action.BATTERY_CHANGED")) {
                int intExtra = intent.getIntExtra("level", -1);
                int intExtra2 = intent.getIntExtra("scale", 100);
                int i11 = intExtra2 > 0 ? (intExtra * 100) / intExtra2 : 0;
                v vVarP = f.this.p(intent.getIntExtra(PermissionsResponse.STATUS_KEY, -1));
                Set set = f.this.monitoredVins;
                f fVar = f.this;
                synchronized (set) {
                    if (i11 == fVar.lastLevel && vVarP == fVar.lastState) {
                        return;
                    }
                    fVar.lastLevel = i11;
                    fVar.lastState = vVarP;
                    h0 h0Var = h0.f84049a;
                    TeslaLog.INSTANCE.i("BatteryMonitor", "Battery updated: " + i11 + "%, state: " + vVarP);
                    f.this.r();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ef0/f$c", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (s.f(intent != null ? intent.getAction() : null, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
                Object systemService = context != null ? context.getSystemService("power") : null;
                PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
                if (powerManager == null) {
                    return;
                }
                boolean zIsPowerSaveMode = powerManager.isPowerSaveMode();
                Set set = f.this.monitoredVins;
                f fVar = f.this;
                synchronized (set) {
                    if (s.f(Boolean.valueOf(zIsPowerSaveMode), fVar.lastLowPowerMode)) {
                        return;
                    }
                    fVar.lastLowPowerMode = Boolean.valueOf(zIsPowerSaveMode);
                    h0 h0Var = h0.f84049a;
                    TeslaLog.INSTANCE.i("BatteryMonitor", "Low power mode changed: " + zIsPowerSaveMode);
                    f.this.r();
                }
            }
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final BatteryInfo o(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", 100) : 100;
        int i11 = intExtra2 > 0 ? (intExtra * 100) / intExtra2 : 0;
        int intExtra3 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra(PermissionsResponse.STATUS_KEY, -1) : -1;
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        return new BatteryInfo(i11, p(intExtra3), (Build.VERSION.SDK_INT < 29 || powerManager == null) ? j2.PHONE_THERMAL_STATE_UNKNOWN : q(powerManager.getCurrentThermalStatus()), powerManager != null ? powerManager.isPowerSaveMode() : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v p(int status) {
        if (status == 2) {
            return v.BATTERY_STATE_CHARGING;
        }
        if (status == 3 || status == 4) {
            return v.BATTERY_STATE_UNPLUGGED;
        }
        return status != 5 ? v.BATTERY_STATE_UNKNOWN : v.BATTERY_STATE_FULL;
    }

    private final j2 q(int status) {
        if (Build.VERSION.SDK_INT < 29) {
            return j2.PHONE_THERMAL_STATE_UNKNOWN;
        }
        switch (status) {
            case 0:
                return j2.PHONE_THERMAL_STATE_NOMINAL;
            case 1:
                return j2.PHONE_THERMAL_STATE_LIGHT;
            case 2:
                return j2.PHONE_THERMAL_STATE_MODERATE;
            case 3:
                return j2.PHONE_THERMAL_STATE_SEVERE;
            case 4:
                return j2.PHONE_THERMAL_STATE_CRITICAL;
            case 5:
                return j2.PHONE_THERMAL_STATE_EMERGENCY;
            case 6:
                return j2.PHONE_THERMAL_STATE_SHUTDOWN;
            default:
                return j2.PHONE_THERMAL_STATE_UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        List listM1;
        int iF;
        v vVar;
        j2 j2Var;
        boolean zBooleanValue;
        synchronized (this.monitoredVins) {
            try {
                listM1 = p013kotlin.collections.v.m1(this.vinCallbacks.values());
                iF = bo0.n.f(this.lastLevel, 0);
                vVar = this.lastState;
                if (vVar == null) {
                    vVar = v.BATTERY_STATE_UNKNOWN;
                }
                j2Var = this.lastThermalState;
                if (j2Var == null) {
                    j2Var = j2.PHONE_THERMAL_STATE_UNKNOWN;
                }
                Boolean bool = this.lastLowPowerMode;
                zBooleanValue = bool != null ? bool.booleanValue() : false;
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = listM1.iterator();
        while (it.hasNext()) {
            ((r) it.next()).invoke(Integer.valueOf(iF), vVar, j2Var, Boolean.valueOf(zBooleanValue));
        }
    }

    private final void s(Context context) {
        if (this.isReceiverRegistered) {
            return;
        }
        this.batteryReceiver = new b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(this.batteryReceiver, intentFilter, 4);
        } else {
            applicationContext.registerReceiver(this.batteryReceiver, intentFilter);
        }
        this.isReceiverRegistered = true;
        TeslaLog.INSTANCE.i("BatteryMonitor", "Battery receiver registered");
    }

    private final void t(Context context) {
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        this.lastLowPowerMode = powerManager != null ? Boolean.valueOf(powerManager.isPowerSaveMode()) : Boolean.FALSE;
        this.powerStateReceiver = new c();
        IntentFilter intentFilter = new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED");
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(this.powerStateReceiver, intentFilter, 4);
        } else {
            applicationContext.registerReceiver(this.powerStateReceiver, intentFilter);
        }
        TeslaLog.INSTANCE.i("BatteryMonitor", "Power state receiver registered");
    }

    private final void u(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager == null) {
                return;
            }
            this.lastThermalState = q(powerManager.getCurrentThermalStatus());
            PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = new PowerManager.OnThermalStatusChangedListener() { // from class: ef0.e
                @Override // android.os.PowerManager.OnThermalStatusChangedListener
                public final void onThermalStatusChanged(int i11) {
                    f.v(this.f62884a, i11);
                }
            };
            powerManager.addThermalStatusListener(onThermalStatusChangedListener);
            this.thermalStatusListener = onThermalStatusChangedListener;
            TeslaLog.INSTANCE.i("BatteryMonitor", "Thermal status listener registered");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(f fVar, int i11) {
        j2 j2VarQ = fVar.q(i11);
        synchronized (fVar.monitoredVins) {
            if (j2VarQ == fVar.lastThermalState) {
                return;
            }
            fVar.lastThermalState = j2VarQ;
            h0 h0Var = h0.f84049a;
            TeslaLog.INSTANCE.i("BatteryMonitor", "Thermal state changed: " + j2VarQ);
            fVar.r();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void w(Context context) {
        if (this.isReceiverRegistered) {
            try {
                try {
                    BroadcastReceiver broadcastReceiver = this.batteryReceiver;
                    if (broadcastReceiver != null) {
                        context.getApplicationContext().unregisterReceiver(broadcastReceiver);
                        TeslaLog.INSTANCE.i("BatteryMonitor", "Battery receiver unregistered");
                    }
                } catch (Exception e11) {
                    TeslaLog.INSTANCE.e("BatteryMonitor", "Error unregistering battery receiver", e11);
                }
            } finally {
                this.batteryReceiver = null;
                this.isReceiverRegistered = false;
                this.lastLevel = -1;
                this.lastState = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void x(Context context) {
        try {
            try {
                BroadcastReceiver broadcastReceiver = this.powerStateReceiver;
                if (broadcastReceiver != null) {
                    context.getApplicationContext().unregisterReceiver(broadcastReceiver);
                    TeslaLog.INSTANCE.i("BatteryMonitor", "Power state receiver unregistered");
                }
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("BatteryMonitor", "Error unregistering power state receiver", e11);
            }
        } finally {
            this.powerStateReceiver = null;
            this.lastLowPowerMode = null;
        }
    }

    private final void y(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager == null) {
                return;
            }
            Object obj = this.thermalStatusListener;
            PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListenerA = ef0.c.a(obj) ? d.a(obj) : null;
            if (onThermalStatusChangedListenerA != null) {
                powerManager.removeThermalStatusListener(onThermalStatusChangedListenerA);
                TeslaLog.INSTANCE.i("BatteryMonitor", "Thermal status listener unregistered");
            }
            this.thermalStatusListener = null;
            this.lastThermalState = null;
        }
    }

    public final void m(Context context, String vin) {
        s.k(context, "context");
        s.k(vin, "vin");
        synchronized (this.monitoredVins) {
            try {
                if (this.monitoredVins.remove(vin)) {
                    TeslaLog.INSTANCE.i("BatteryMonitor", "Disabled monitoring for VIN, remaining: " + this.monitoredVins.size());
                    this.vinCallbacks.remove(vin);
                    if (this.monitoredVins.isEmpty()) {
                        w(context);
                        x(context);
                        y(context);
                    }
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(Context context, String vin, r<? super Integer, ? super v, ? super j2, ? super Boolean, h0> callback) {
        s.k(context, "context");
        s.k(vin, "vin");
        s.k(callback, "callback");
        synchronized (this.monitoredVins) {
            try {
                boolean zAdd = this.monitoredVins.add(vin);
                this.vinCallbacks.put(vin, callback);
                if (zAdd) {
                    TeslaLog.INSTANCE.i("BatteryMonitor", "Enabled monitoring for VIN, total: " + this.monitoredVins.size());
                    if (this.monitoredVins.size() == 1) {
                        u(context);
                        t(context);
                        s(context);
                    } else {
                        BatteryInfo batteryInfoO = o(context);
                        callback.invoke(Integer.valueOf(batteryInfoO.getLevel()), batteryInfoO.getState(), batteryInfoO.getThermalState(), Boolean.valueOf(batteryInfoO.getLowPowerModeEnabled()));
                    }
                } else {
                    BatteryInfo batteryInfoO2 = o(context);
                    callback.invoke(Integer.valueOf(batteryInfoO2.getLevel()), batteryInfoO2.getState(), batteryInfoO2.getThermalState(), Boolean.valueOf(batteryInfoO2.getLowPowerModeEnabled()));
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private f() {
        this.monitoredVins = new LinkedHashSet();
        this.vinCallbacks = new LinkedHashMap();
        this.lastLevel = -1;
    }
}
