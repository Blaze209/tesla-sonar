package expo.modules.sensors.modules;

import android.hardware.SensorEvent;
import android.os.Bundle;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.sensors.SensorProxy;
import expo.modules.sensors.SensorProxyKt;
import java.lang.ref.WeakReference;
import jn0.h0;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lexpo/modules/sensors/modules/LightSensorModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "sensorProxy", "Lexpo/modules/sensors/SensorProxy;", "getSensorProxy", "()Lexpo/modules/sensors/SensorProxy;", "sensorProxy$delegate", "Lkotlin/Lazy;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-sensors_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LightSensorModule extends Module {

    /* JADX INFO: renamed from: sensorProxy$delegate, reason: from kotlin metadata */
    private final Lazy sensorProxy = m.b(new wn0.a() { // from class: expo.modules.sensors.modules.f
        @Override // wn0.a
        public final Object invoke() {
            return LightSensorModule.sensorProxy_delegate$lambda$2(this.f63428a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public final SensorProxy getSensorProxy() {
        return (SensorProxy) this.sensorProxy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SensorProxy sensorProxy_delegate$lambda$2(LightSensorModule lightSensorModule) {
        AppContext appContext = lightSensorModule.getAppContext();
        final WeakReference weakReference = new WeakReference(lightSensorModule);
        final String str = "lightSensorDidUpdate";
        return new SensorProxy(5, appContext, new l<SensorEvent, h0>() { // from class: expo.modules.sensors.modules.LightSensorModule$sensorProxy_delegate$lambda$2$$inlined$createSensorProxy$1
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(SensorEvent sensorEvent) {
                invoke2(sensorEvent);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SensorEvent sensorEvent) {
                s.k(sensorEvent, "sensorEvent");
                Module module = (Module) weakReference.get();
                if (module != null) {
                    String str2 = str;
                    Bundle bundle = new Bundle();
                    bundle.putDouble("illuminance", sensorEvent.values[0]);
                    bundle.putDouble("timestamp", sensorEvent.timestamp / 1.0E9d);
                    module.sendEvent(str2, bundle);
                }
            }
        });
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        eb.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoLightSensor");
            SensorProxyKt.UseSensorProxy$default(moduleDefinitionBuilder, this, 5, "lightSensorDidUpdate", null, new wn0.a<SensorProxy>() { // from class: expo.modules.sensors.modules.LightSensorModule$definition$1$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final SensorProxy invoke() {
                    return this.this$0.getSensorProxy();
                }
            }, 8, null);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            eb.a.f();
        }
    }
}
