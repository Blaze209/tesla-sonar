package com.tesla.TeslaV4.reactnative.module;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/VehicleDataNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "vin", "vehicleDataBase64", "migrateVehicleData", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VehicleDataNativeModule extends ReactContextBaseJavaModule {
    private static final String TAG = "VehicleDataModule";
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a(TAG);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleDataNativeModule(ReactApplicationContext context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final String migrateVehicleData(String vin, String vehicleDataBase64) {
        p013kotlin.jvm.internal.s.k(vin, "vin");
        p013kotlin.jvm.internal.s.k(vehicleDataBase64, "vehicleDataBase64");
        try {
            com.tesla.logging.g gVar = logger;
            gVar.j("Running vehicle data migration for " + vin + "...");
            String strE = ke0.h.e(ke0.h.b(ie0.n.a(vehicleDataBase64), vin, ke0.i.JS));
            gVar.j("Migrated vehicle data for " + vin + ".");
            return strE;
        } catch (Exception e11) {
            logger.d("Error migrating vehicle data", e11);
            return null;
        }
    }
}
