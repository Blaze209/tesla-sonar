package com.tesla.dashcam_viewer;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import fc0.u5;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010#R\u0011\u0010&\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010#R\u0011\u0010'\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010#¨\u0006("}, d2 = {"Lcom/tesla/dashcam_viewer/x;", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "Lgc0/u0;", "g", "()Lgc0/u0;", "Lgc0/x;", "a", "()Lgc0/x;", AnalyticsAttribute.Reason, "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "c", "Lgc0/u0;", "f", "setVehicleConfig", "(Lgc0/u0;)V", "vehicleConfig", DateTokenConverter.CONVERTER_KEY, "Lgc0/x;", "guiSettings", "Lbe0/e;", "e", "Lbe0/e;", "getVehicleData", "", "h", "()Z", "isCybertruck", "useKph", "supportBPillarCamera", "supportFlexibleBitrate", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static volatile gc0.u0 vehicleConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static volatile gc0.x guiSettings;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f56132a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("DashcamViewer_LastSelectedVehicle");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final be0.e getVehicleData = be0.e.INSTANCE.a();

    private x() {
    }

    public final gc0.x a() {
        u5 u5VarD;
        gc0.x gui_settings;
        String strB = b();
        if (strB != null && (u5VarD = getVehicleData.d(strB)) != null && (gui_settings = u5VarD.getGui_settings()) != null) {
            return gui_settings;
        }
        com.tesla.logging.g gVar = logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("no vehicle data from realm to get gui settings");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return null;
    }

    public final String b() {
        return (String) p013kotlin.collections.v.q0(qb0.a.INSTANCE.b().w());
    }

    public final boolean c() {
        gc0.u0 u0Var = vehicleConfig;
        if (u0Var != null) {
            return p013kotlin.jvm.internal.s.f(u0Var.getSupports_pillar_camera_metadata(), Boolean.TRUE);
        }
        com.tesla.logging.g gVar = logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("no vehicleConfig to check supportBPillarCamera");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return false;
    }

    public final boolean d() {
        gc0.u0 u0Var = vehicleConfig;
        if (u0Var != null) {
            return p013kotlin.jvm.internal.s.f(u0Var.getSupports_flexible_dashcam_bitrate(), Boolean.TRUE);
        }
        com.tesla.logging.g gVar = logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("no vehicleConfig to check supportFlexibleBitrate");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return false;
    }

    public final boolean e() {
        gc0.x xVar = guiSettings;
        if (xVar != null) {
            gc0.x.e gui_distance_units = xVar.getGui_distance_units();
            return (gui_distance_units != null ? gui_distance_units.getKilometersPerHour() : null) != null;
        }
        com.tesla.logging.g gVar = logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("no guiSettings to check useKph");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return false;
    }

    public final gc0.u0 f() {
        return vehicleConfig;
    }

    public final gc0.u0 g() {
        u5 u5VarD;
        gc0.u0 vehicle_config;
        String strB = b();
        if (strB != null && (u5VarD = getVehicleData.d(strB)) != null && (vehicle_config = u5VarD.getVehicle_config()) != null) {
            return vehicle_config;
        }
        com.tesla.logging.g gVar = logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("no vehicle data from realm to get vehicle config");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return null;
    }

    public final boolean h() {
        gc0.u0 u0Var = vehicleConfig;
        if (u0Var != null) {
            return wb0.e.K(u0Var);
        }
        com.tesla.logging.g gVar = logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("no vehicleConfig to check isCybertruck");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return false;
    }

    public final void i(String reason) {
        p013kotlin.jvm.internal.s.k(reason, "reason");
        logger.j("loadSelectedVehicleDataFromRealm, reason: " + reason);
        vehicleConfig = g();
        guiSettings = a();
    }
}
