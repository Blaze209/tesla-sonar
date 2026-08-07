package qd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.x;
import nd0.b;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lqd0/a;", "Lnd0/b;", "<init>", "()V", "Loc0/a;", "action", "Lnd0/a;", "notificationAction", "Ljn0/h0;", "a", "(Loc0/a;Lnd0/a;)V", "b", "(Loc0/a;)Lnd0/a;", "Lcom/tesla/logging/g;", "c", "Lcom/tesla/logging/g;", "logger", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "actions", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f105350b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("TeslaNotificationActionFactory");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Map<oc0.a, nd0.a> actions = new LinkedHashMap();

    private a() {
    }

    @Override // nd0.b
    public void a(oc0.a action, nd0.a notificationAction) {
        s.k(action, "action");
        s.k(notificationAction, "notificationAction");
        if (actions.containsKey(action)) {
            g gVar = logger;
            String str = action.name() + " already set in factory";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
        actions.put(action, notificationAction);
    }

    @Override // nd0.b
    public nd0.a b(oc0.a action) {
        s.k(action, "action");
        return actions.get(action);
    }
}
