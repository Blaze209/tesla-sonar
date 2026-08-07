package com.tesla.widget.rn;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tesla.logging.g;
import com.tesla.widget.rn.AppWidgetReactNativeModule;
import jn0.m;
import me0.a0;
import me0.c;
import me0.x;
import ne0.b;
import ne0.d;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/tesla/widget/rn/AppWidgetReactNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "getName", "()Ljava/lang/String;", "vehicleId", "vin", "", "appWidgetId", "command", "", "result", "Ljn0/h0;", "updateAppWidget", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "Lne0/b;", "vehicleCommandService$delegate", "Lkotlin/Lazy;", "getVehicleCommandService", "()Lne0/b;", "vehicleCommandService", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppWidgetReactNativeModule extends ReactContextBaseJavaModule {
    private final g logger;

    /* JADX INFO: renamed from: vehicleCommandService$delegate, reason: from kotlin metadata */
    private final Lazy vehicleCommandService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetReactNativeModule(ReactApplicationContext context) {
        super(context);
        s.k(context, "context");
        this.logger = c.a().p("AppWidgetModule");
        this.vehicleCommandService = m.b(new a() { // from class: se0.a
            @Override // wn0.a
            public final Object invoke() {
                return AppWidgetReactNativeModule.vehicleCommandService_delegate$lambda$0();
            }
        });
    }

    private final b getVehicleCommandService() {
        return (b) this.vehicleCommandService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b vehicleCommandService_delegate$lambda$0() {
        return qe0.c.f105355a.b();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AppWidgetModule";
    }

    @ReactMethod
    public final void updateAppWidget(String vehicleId, String vin, int appWidgetId, String command, boolean result) {
        s.k(vehicleId, "vehicleId");
        s.k(vin, "vin");
        s.k(command, "command");
        this.logger.a("updating widget from react-native appWidgetId: " + appWidgetId + " vehicleId: " + vin + " command: " + command);
        ne0.c cVarE = d.e(command);
        if (cVarE != null) {
            getVehicleCommandService().c(vin, cVarE);
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (appWidgetId == 0) {
            s.h(reactApplicationContext);
            x.q(reactApplicationContext);
            return;
        }
        me0.b bVar = result ? me0.b.SUCCESS : me0.b.FAIL;
        te0.b bVar2 = te0.b.f113254a;
        s.h(reactApplicationContext);
        a0 a0Var = a0.NORMAL;
        te0.b.k(bVar2, appWidgetId, reactApplicationContext, a0Var, bVar, null, false, 48, null);
        te0.b.k(bVar2, appWidgetId, reactApplicationContext, a0Var, null, 3000L, false, 40, null);
    }
}
