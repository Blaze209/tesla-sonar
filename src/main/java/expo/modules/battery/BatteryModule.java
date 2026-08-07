package expo.modules.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PowerManager;
import ch.qos.logback.core.CoreConstants;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
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
import expo.modules.kotlin.types.Enumerable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.q;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\t\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lexpo/modules/battery/BatteryModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "Lkotlin/Function1;", "", "Landroid/content/BroadcastReceiver;", "Ljn0/h0;", "block", "accessBroadcastReceivers", "(Lwn0/l;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "unregisterBroadcastReceivers", "(Landroid/content/Context;)V", "registerBroadcastReceivers", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "definition", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "broadcastReceivers", "Ljava/util/List;", "getContext", "()Landroid/content/Context;", "", "isLowPowerModeEnabled", "()Z", "BatteryState", "expo-battery_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BatteryModule extends Module {
    private final List<BroadcastReceiver> broadcastReceivers = new ArrayList();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lexpo/modules/battery/BatteryModule$BatteryState;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", "UNPLUGGED", "CHARGING", "FULL", "expo-battery_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum BatteryState implements Enumerable {
        UNKNOWN(0),
        UNPLUGGED(1),
        CHARGING(2),
        FULL(3);

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final int value;

        BatteryState(int i11) {
            this.value = i11;
        }

        public static EnumEntries<BatteryState> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    private final void accessBroadcastReceivers(l<? super List<BroadcastReceiver>, h0> block) {
        synchronized (this.broadcastReceivers) {
            try {
                block.invoke(this.broadcastReceivers);
                h0 h0Var = h0.f84049a;
                q.b(1);
            } finally {
                q.b(1);
                q.a(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLowPowerModeEnabled() {
        Object systemService = getContext().getApplicationContext().getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        return powerManager.isPowerSaveMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerBroadcastReceivers(Context context) {
        synchronized (this.broadcastReceivers) {
            if (this.broadcastReceivers.isEmpty()) {
                h0 h0Var = h0.f84049a;
                final WeakReference weakReference = new WeakReference(this);
                p pVar = new p() { // from class: expo.modules.battery.a
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return BatteryModule.registerBroadcastReceivers$lambda$13(weakReference, (String) obj, (Bundle) obj2);
                    }
                };
                BatteryStateReceiver batteryStateReceiver = new BatteryStateReceiver(pVar);
                PowerSaverReceiver powerSaverReceiver = new PowerSaverReceiver(pVar);
                BatteryLevelReceiver batteryLevelReceiver = new BatteryLevelReceiver(pVar);
                context.registerReceiver(batteryStateReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                context.registerReceiver(powerSaverReceiver, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                context.registerReceiver(batteryLevelReceiver, intentFilter);
                synchronized (this.broadcastReceivers) {
                    List<BroadcastReceiver> list = this.broadcastReceivers;
                    list.add(batteryStateReceiver);
                    list.add(batteryLevelReceiver);
                    list.add(powerSaverReceiver);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 registerBroadcastReceivers$lambda$13(WeakReference weakReference, String name, Bundle body) {
        s.k(name, "name");
        s.k(body, "body");
        try {
            BatteryModule batteryModule = (BatteryModule) weakReference.get();
            if (batteryModule != null) {
                batteryModule.sendEvent(name, body);
            }
        } catch (Throwable unused) {
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterBroadcastReceivers(Context context) {
        synchronized (this.broadcastReceivers) {
            try {
                List<BroadcastReceiver> list = this.broadcastReceivers;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    context.unregisterReceiver((BroadcastReceiver) it.next());
                }
                list.clear();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent stringAsyncFunctionComponent2;
        AsyncFunctionComponent stringAsyncFunctionComponent3;
        AsyncFunctionComponent stringAsyncFunctionComponent4;
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoBattery");
            moduleDefinitionBuilder.Constants(x.a("isSupported", Boolean.TRUE));
            moduleDefinitionBuilder.Events(BatteryModuleKt.BATTERY_LEVEL_EVENT_NAME, BatteryModuleKt.BATTERY_CHARGED_EVENT_NAME, BatteryModuleKt.POWER_MODE_EVENT_NAME);
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.MODULE_CREATE;
            eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.battery.BatteryModule$definition$lambda$8$$inlined$OnCreate$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BatteryModule batteryModule = this.this$0;
                    batteryModule.registerBroadcastReceivers(batteryModule.getContext());
                }
            }));
            Map<EventName, EventListener> eventListeners2 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName2 = EventName.MODULE_DESTROY;
            eventListeners2.put(eventName2, new BasicEventListener(eventName2, new wn0.a<h0>() { // from class: expo.modules.battery.BatteryModule$definition$lambda$8$$inlined$OnDestroy$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BatteryModule batteryModule = this.this$0;
                    batteryModule.unregisterBroadcastReceivers(batteryModule.getContext());
                }
            }));
            Map<EventName, EventListener> eventListeners3 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName3 = EventName.ACTIVITY_ENTERS_FOREGROUND;
            eventListeners3.put(eventName3, new BasicEventListener(eventName3, new wn0.a<h0>() { // from class: expo.modules.battery.BatteryModule$definition$lambda$8$$inlined$OnActivityEntersForeground$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BatteryModule batteryModule = this.this$0;
                    batteryModule.registerBroadcastReceivers(batteryModule.getContext());
                }
            }));
            Map<EventName, EventListener> eventListeners4 = moduleDefinitionBuilder.getEventListeners();
            EventName eventName4 = EventName.ACTIVITY_ENTERS_BACKGROUND;
            eventListeners4.put(eventName4, new BasicEventListener(eventName4, new wn0.a<h0>() { // from class: expo.modules.battery.BatteryModule$definition$lambda$8$$inlined$OnActivityEntersBackground$1
                @Override // wn0.a
                public /* bridge */ /* synthetic */ h0 invoke() {
                    invoke2();
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BatteryModule batteryModule = this.this$0;
                    batteryModule.unregisterBroadcastReceivers(batteryModule.getContext());
                }
            }));
            AnyType[] anyTypeArr = new AnyType[0];
            l<Object[], Float> lVar = new l<Object[], Float>() { // from class: expo.modules.battery.BatteryModule$definition$lambda$8$$inlined$AsyncFunction$1
                @Override // wn0.l
                public final Float invoke(Object[] it) {
                    s.k(it, "it");
                    Intent intentRegisterReceiver = this.this$0.getContext().getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    float f11 = -1.0f;
                    if (intentRegisterReceiver != null) {
                        int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                        int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                        if (intExtra != -1 && intExtra2 != -1) {
                            f11 = intExtra / intExtra2;
                        }
                    }
                    return Float.valueOf(f11);
                }
            };
            Class cls = Integer.TYPE;
            boolean zF = s.f(Float.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            if (zF) {
                stringAsyncFunctionComponent = new IntAsyncFunctionComponent("getBatteryLevelAsync", anyTypeArr, lVar);
            } else if (s.f(Float.class, cls4)) {
                stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("getBatteryLevelAsync", anyTypeArr, lVar);
            } else if (s.f(Float.class, cls3)) {
                stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("getBatteryLevelAsync", anyTypeArr, lVar);
            } else if (s.f(Float.class, cls2)) {
                stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("getBatteryLevelAsync", anyTypeArr, lVar);
            } else {
                stringAsyncFunctionComponent = s.f(Float.class, String.class) ? new StringAsyncFunctionComponent("getBatteryLevelAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("getBatteryLevelAsync", anyTypeArr, lVar);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getBatteryLevelAsync", stringAsyncFunctionComponent);
            AnyType[] anyTypeArr2 = new AnyType[0];
            l<Object[], Integer> lVar2 = new l<Object[], Integer>() { // from class: expo.modules.battery.BatteryModule$definition$lambda$8$$inlined$AsyncFunction$2
                @Override // wn0.l
                public final Integer invoke(Object[] it) {
                    s.k(it, "it");
                    Intent intentRegisterReceiver = this.this$0.getContext().getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    return Integer.valueOf(intentRegisterReceiver == null ? BatteryModule.BatteryState.UNKNOWN.getValue() : BatteryStatusNativeToJSKt.batteryStatusNativeToJS(intentRegisterReceiver.getIntExtra(PermissionsResponse.STATUS_KEY, -1)).getValue());
                }
            };
            if (s.f(Integer.class, cls)) {
                stringAsyncFunctionComponent2 = new IntAsyncFunctionComponent("getBatteryStateAsync", anyTypeArr2, lVar2);
            } else if (s.f(Integer.class, cls4)) {
                stringAsyncFunctionComponent2 = new BoolAsyncFunctionComponent("getBatteryStateAsync", anyTypeArr2, lVar2);
            } else if (s.f(Integer.class, cls3)) {
                stringAsyncFunctionComponent2 = new DoubleAsyncFunctionComponent("getBatteryStateAsync", anyTypeArr2, lVar2);
            } else if (s.f(Integer.class, cls2)) {
                stringAsyncFunctionComponent2 = new FloatAsyncFunctionComponent("getBatteryStateAsync", anyTypeArr2, lVar2);
            } else {
                stringAsyncFunctionComponent2 = s.f(Integer.class, String.class) ? new StringAsyncFunctionComponent("getBatteryStateAsync", anyTypeArr2, lVar2) : new UntypedAsyncFunctionComponent("getBatteryStateAsync", anyTypeArr2, lVar2);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("getBatteryStateAsync", stringAsyncFunctionComponent2);
            AnyType[] anyTypeArr3 = new AnyType[0];
            l<Object[], Boolean> lVar3 = new l<Object[], Boolean>() { // from class: expo.modules.battery.BatteryModule$definition$lambda$8$$inlined$AsyncFunction$3
                @Override // wn0.l
                public final Boolean invoke(Object[] it) {
                    s.k(it, "it");
                    return Boolean.valueOf(this.this$0.isLowPowerModeEnabled());
                }
            };
            if (s.f(Boolean.class, cls)) {
                stringAsyncFunctionComponent3 = new IntAsyncFunctionComponent("isLowPowerModeEnabledAsync", anyTypeArr3, lVar3);
            } else if (s.f(Boolean.class, cls4)) {
                stringAsyncFunctionComponent3 = new BoolAsyncFunctionComponent("isLowPowerModeEnabledAsync", anyTypeArr3, lVar3);
            } else if (s.f(Boolean.class, cls3)) {
                stringAsyncFunctionComponent3 = new DoubleAsyncFunctionComponent("isLowPowerModeEnabledAsync", anyTypeArr3, lVar3);
            } else if (s.f(Boolean.class, cls2)) {
                stringAsyncFunctionComponent3 = new FloatAsyncFunctionComponent("isLowPowerModeEnabledAsync", anyTypeArr3, lVar3);
            } else {
                stringAsyncFunctionComponent3 = s.f(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isLowPowerModeEnabledAsync", anyTypeArr3, lVar3) : new UntypedAsyncFunctionComponent("isLowPowerModeEnabledAsync", anyTypeArr3, lVar3);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("isLowPowerModeEnabledAsync", stringAsyncFunctionComponent3);
            AnyType[] anyTypeArr4 = new AnyType[0];
            l<Object[], Boolean> lVar4 = new l<Object[], Boolean>() { // from class: expo.modules.battery.BatteryModule$definition$lambda$8$$inlined$AsyncFunction$4
                @Override // wn0.l
                public final Boolean invoke(Object[] it) {
                    s.k(it, "it");
                    String packageName = this.this$0.getContext().getApplicationContext().getPackageName();
                    Object systemService = this.this$0.getContext().getApplicationContext().getSystemService("power");
                    PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
                    boolean z11 = false;
                    if (powerManager != null && !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        z11 = true;
                    }
                    return Boolean.valueOf(z11);
                }
            };
            if (s.f(Boolean.class, cls)) {
                stringAsyncFunctionComponent4 = new IntAsyncFunctionComponent("isBatteryOptimizationEnabledAsync", anyTypeArr4, lVar4);
            } else if (s.f(Boolean.class, cls4)) {
                stringAsyncFunctionComponent4 = new BoolAsyncFunctionComponent("isBatteryOptimizationEnabledAsync", anyTypeArr4, lVar4);
            } else if (s.f(Boolean.class, cls3)) {
                stringAsyncFunctionComponent4 = new DoubleAsyncFunctionComponent("isBatteryOptimizationEnabledAsync", anyTypeArr4, lVar4);
            } else if (s.f(Boolean.class, cls2)) {
                stringAsyncFunctionComponent4 = new FloatAsyncFunctionComponent("isBatteryOptimizationEnabledAsync", anyTypeArr4, lVar4);
            } else {
                stringAsyncFunctionComponent4 = s.f(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isBatteryOptimizationEnabledAsync", anyTypeArr4, lVar4) : new UntypedAsyncFunctionComponent("isBatteryOptimizationEnabledAsync", anyTypeArr4, lVar4);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("isBatteryOptimizationEnabledAsync", stringAsyncFunctionComponent4);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
