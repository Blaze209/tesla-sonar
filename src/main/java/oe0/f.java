package oe0;

import android.util.Pair;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import fc0.u5;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000e"}, d2 = {"Loe0/f;", "", "<init>", "()V", "Ltd0/m;", "realmHelper", "Ljn0/h0;", "b", "(Ltd0/m;)V", "c", "a", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f97233a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("WidgetRealmMigration");

    private f() {
    }

    private final void b(m realmHelper) {
        b.a(realmHelper);
        realmHelper.u("WIDGET_CACHE_VERSION_KEY", "2");
    }

    private final void c(m realmHelper) throws Throwable {
        try {
            List<Pair<String, String>> listI = realmHelper.i(v.m(), v.e("appwidget_"));
            logger.j("found " + listI.size() + " widget vehicles to migrate");
            s.h(listI);
            Iterator<T> it = listI.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.first;
                s.h(str);
                Integer numX = t.x(t.r1(str, "appwidget_", null, 2, null));
                String str2 = (String) pair.second;
                if (numX == null) {
                    g gVar = logger;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("widget ID null, can't migrate this vehicle.");
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                } else if (str2 == null) {
                    g gVar2 = logger;
                    TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                    String tag2 = gVar2.getTag();
                    String strG2 = gVar2.g("vehicle ID null, can't migrate this vehicle.");
                    zb0.a aVar2 = zb0.a.f128044a;
                    Map mapF2 = v0.f(x.a(tag2, strG2));
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry2 : mapF2.entrySet()) {
                        zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    firebaseCrashlytics2.recordException(new Exception(strG2));
                    TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                    vr0.a.INSTANCE.a(strG2, new Object[0]);
                } else {
                    u5 u5VarC = be0.e.INSTANCE.a().c(str2);
                    String strV = u5VarC != null ? wb0.e.v(u5VarC) : null;
                    if (strV == null) {
                        g gVar3 = logger;
                        TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                        String tag3 = gVar3.getTag();
                        String strG3 = gVar3.g("VIN not found based on vehicle ID, not performing migration for this app vehicle.");
                        zb0.a aVar3 = zb0.a.f128044a;
                        Map mapF3 = v0.f(x.a(tag3, strG3));
                        FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                        for (Map.Entry entry3 : mapF3.entrySet()) {
                            zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                        }
                        firebaseCrashlytics3.recordException(new Exception(strG3));
                        TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                        vr0.a.INSTANCE.a(strG3, new Object[0]);
                    } else {
                        g gVar4 = logger;
                        gVar4.j("migrating widget ID " + numX + " from " + str2 + " to " + strV);
                        b.f(realmHelper, numX.intValue(), strV);
                        xc0.a aVarD = d(realmHelper, str2);
                        if (aVarD == null || aVarD.getVin().length() == 0) {
                            gVar4.j("null cached app vehicle or no VIN...");
                        } else {
                            gVar4.j("migrating AppVehicle from " + str2 + " to " + aVarD.getVin());
                            c.f(realmHelper, aVarD);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("WidgetRealmMigration", "Exception running version 3 migration!", e11);
        }
        realmHelper.u("WIDGET_CACHE_VERSION_KEY", "3");
    }

    private static final xc0.a d(m mVar, String str) {
        String strH = mVar.h("REALM_V_DATA_PROTO_CACHE_PREFIX" + str);
        if (strH == null) {
            return null;
        }
        me0.c.a().a("got vehicle " + str + " from widget cache");
        try {
            return a.f97213a.e(strH);
        } catch (Exception e11) {
            me0.c.a().d("error when decode vehicle byte array from cache", e11);
            return null;
        }
    }

    public final void a(m realmHelper) {
        Integer numX;
        s.k(realmHelper, "realmHelper");
        String strH = realmHelper.h("WIDGET_CACHE_VERSION_KEY");
        int iIntValue = (strH == null || (numX = t.x(strH)) == null) ? 1 : numX.intValue();
        if (iIntValue == 1) {
            b(realmHelper);
        } else {
            if (iIntValue != 2) {
                return;
            }
            c(realmHelper);
        }
    }
}
