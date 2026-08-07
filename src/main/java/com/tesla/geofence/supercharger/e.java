package com.tesla.geofence.supercharger;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.f;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010)\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010!\"\u0004\b(\u0010#¨\u0006*"}, d2 = {"Lcom/tesla/geofence/supercharger/e;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "trtId", "", "b", "(I)Ljava/lang/Long;", "time", "Ljn0/h0;", "g", "(IJ)V", "", "c", "(I)Ljava/lang/String;", "", "Lcom/tesla/geofence/supercharger/c;", "superchargers", "j", "(Ljava/util/List;)V", "Landroid/content/SharedPreferences;", "a", "Landroid/content/SharedPreferences;", "prefs", "Lcom/google/gson/f;", "Lcom/google/gson/f;", "gson", "", "value", "e", "()Z", IntegerTokenConverter.CONVERTER_KEY, "(Z)V", "userInitiatedGeofencing", DateTokenConverter.CONVERTER_KEY, "h", "useLocalSuperchargerDB", "f", "enableDebugUserMovementNotification", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences prefs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f gson;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/tesla/geofence/supercharger/e$b", "Lcom/google/gson/reflect/a;", "", "", "", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<Map<String, ? extends Long>> {
        b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/tesla/geofence/supercharger/e$c", "Lcom/google/gson/reflect/a;", "", "", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.google.gson.reflect.a<Map<String, ? extends String>> {
        c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"com/tesla/geofence/supercharger/e$d", "Lcom/google/gson/reflect/a;", "", "", "", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends com.google.gson.reflect.a<Map<String, Long>> {
        d() {
        }
    }

    /* JADX INFO: renamed from: com.tesla.geofence.supercharger.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/tesla/geofence/supercharger/e$e", "Lcom/google/gson/reflect/a;", "", "", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1130e extends com.google.gson.reflect.a<Map<String, String>> {
        C1130e() {
        }
    }

    public e(Context context) {
        s.k(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("supercharger_geofence", 0);
        s.j(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
        this.gson = new f();
    }

    public final boolean a() {
        return this.prefs.getBoolean("debug_movement_notifications", false);
    }

    public final Long b(int trtId) {
        String string = this.prefs.getString("last_notification_times", null);
        if (string == null) {
            return null;
        }
        Object objK = this.gson.k(string, new b().getType());
        s.j(objK, "fromJson(...)");
        return (Long) ((Map) objK).get(String.valueOf(trtId));
    }

    public final String c(int trtId) {
        String string = this.prefs.getString("supercharger_names", null);
        if (string == null) {
            return null;
        }
        Object objK = this.gson.k(string, new c().getType());
        s.j(objK, "fromJson(...)");
        return (String) ((Map) objK).get(String.valueOf(trtId));
    }

    public final boolean d() {
        return this.prefs.getBoolean("use_local_db", true);
    }

    public final boolean e() {
        return this.prefs.getBoolean("user_initiated", false);
    }

    public final void f(boolean z11) {
        this.prefs.edit().putBoolean("debug_movement_notifications", z11).apply();
    }

    public final void g(int trtId, long time) {
        Map linkedHashMap;
        String string = this.prefs.getString("last_notification_times", null);
        Type type = new d().getType();
        if (string != null) {
            Object objK = this.gson.k(string, type);
            s.h(objK);
            linkedHashMap = (Map) objK;
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(String.valueOf(trtId), Long.valueOf(time));
        this.prefs.edit().putString("last_notification_times", this.gson.s(linkedHashMap)).apply();
    }

    public final void h(boolean z11) {
        this.prefs.edit().putBoolean("use_local_db", z11).apply();
    }

    public final void i(boolean z11) {
        this.prefs.edit().putBoolean("user_initiated", z11).apply();
    }

    public final void j(List<NearbySupercharger> superchargers) {
        Map linkedHashMap;
        s.k(superchargers, "superchargers");
        String string = this.prefs.getString("supercharger_names", null);
        Type type = new C1130e().getType();
        if (string != null) {
            Object objK = this.gson.k(string, type);
            s.h(objK);
            linkedHashMap = (Map) objK;
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        for (NearbySupercharger nearbySupercharger : superchargers) {
            linkedHashMap.put(String.valueOf(nearbySupercharger.getTrtId()), nearbySupercharger.getName());
        }
        this.prefs.edit().putString("supercharger_names", this.gson.s(linkedHashMap)).apply();
    }
}
