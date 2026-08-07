package cb0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.calendar.SyncCalendarWorker;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.oapi.AdapterMoshi;
import com.tesla.oapi.GeneratedJsonAdapter;
import com.tesla.oapi.JsCalendarSyncParameters;
import fc0.e5;
import fc0.g5;
import ic0.e;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcb0/a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lic0/e;", "request", "a", "(Landroid/content/Context;Lic0/e;)Lic0/e;", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19019a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("CommandDecorator");

    private a() {
    }

    public final e a(Context context, e request) {
        g5 carServerAction;
        s.k(context, "context");
        s.k(request, "request");
        try {
            ic0.c action = request.getAction();
            e5 uiSetUpcomingCalendarEntries = (action == null || (carServerAction = action.getCarServerAction()) == null) ? null : carServerAction.getUiSetUpcomingCalendarEntries();
            if (uiSetUpcomingCalendarEntries == null) {
                logger.j("Use original request: " + request);
                return request;
            }
            JsCalendarSyncParameters jsCalendarSyncParametersFromJson = new GeneratedJsonAdapter(AdapterMoshi.INSTANCE.getMoshi()).fromJson(uiSetUpcomingCalendarEntries.getCalendar_data());
            if (jsCalendarSyncParametersFromJson == null) {
                logger.p("CalendarSync").j("params is null, use request " + request);
                return request;
            }
            SyncCalendarWorker.INSTANCE.c(context, jsCalendarSyncParametersFromJson.getEnabled());
            e eVarH = ob0.e.f97095a.h(request.getVin(), jsCalendarSyncParametersFromJson.getReason(), jsCalendarSyncParametersFromJson.getEnabled(), request.getSource(), context, "calendar_sync");
            if (eVarH != null) {
                logger.p("CalendarSync").j("updatedRequest: " + eVarH);
                return eVarH;
            }
            g gVarP = logger.p("CalendarSync");
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVarP.getTag();
            String strG = gVarP.g("Could not decorate with params " + jsCalendarSyncParametersFromJson);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return request;
        } catch (Exception e11) {
            logger.f("Exception thrown decorating request", e11);
            return request;
        }
    }
}
