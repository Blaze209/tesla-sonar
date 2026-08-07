package xa0;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.oapi.CalendarData;
import com.tesla.oapi.CalendarSyncParameters;
import ie0.c0;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxa0/b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/oapi/CalendarSyncParameters;", "params", "Lxa0/b$a;", "a", "(Landroid/content/Context;Lcom/tesla/oapi/CalendarSyncParameters;)Lxa0/b$a;", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f123158a = new b();

    /* JADX INFO: renamed from: xa0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lxa0/b$a;", "", "", "errorMessage", "Lcom/tesla/oapi/CalendarData;", "data", "<init>", "(Ljava/lang/String;Lcom/tesla/oapi/CalendarData;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/tesla/oapi/CalendarData;", "()Lcom/tesla/oapi/CalendarData;", "c", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BuildResult {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorMessage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CalendarData data;

        /* JADX INFO: renamed from: xa0.b$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxa0/b$a$a;", "", "<init>", "()V", "", "errorMessage", "Lxa0/b$a;", "a", "(Ljava/lang/String;)Lxa0/b$a;", "Lcom/tesla/oapi/CalendarData;", "calendar", "b", "(Lcom/tesla/oapi/CalendarData;)Lxa0/b$a;", "calendar_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BuildResult a(String errorMessage) {
                s.k(errorMessage, "errorMessage");
                return new BuildResult(errorMessage, null);
            }

            public final BuildResult b(CalendarData calendar) {
                s.k(calendar, "calendar");
                return new BuildResult(null, calendar);
            }

            private Companion() {
            }
        }

        public BuildResult(String str, CalendarData calendarData) {
            this.errorMessage = str;
            this.data = calendarData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CalendarData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BuildResult)) {
                return false;
            }
            BuildResult buildResult = (BuildResult) other;
            return s.f(this.errorMessage, buildResult.errorMessage) && s.f(this.data, buildResult.data);
        }

        public int hashCode() {
            String str = this.errorMessage;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            CalendarData calendarData = this.data;
            return iHashCode + (calendarData != null ? calendarData.hashCode() : 0);
        }

        public String toString() {
            return "BuildResult(errorMessage=" + this.errorMessage + ", data=" + this.data + ")";
        }
    }

    private b() {
    }

    @SuppressLint({"MissingPermission"})
    public final BuildResult a(Context context, CalendarSyncParameters params) {
        ya0.a aVar;
        s.k(context, "context");
        s.k(params, "params");
        String reason = params.getReason();
        boolean enabled = params.getEnabled();
        if (enabled) {
            aVar = a.f123142a.a(context);
            if (aVar != null) {
                TeslaLog.INSTANCE.i("CalendarSyncBuilder", "create Calendar newInstance to sync exist data to vehicle.");
            } else {
                aVar = null;
            }
        } else {
            aVar = new ya0.a();
            TeslaLog.INSTANCE.i("CalendarSyncBuilder", "create empty calendar data to clear out data on vehicle.");
        }
        if (aVar == null) {
            return BuildResult.INSTANCE.a("CALENDAR_SYNC_DISABLED");
        }
        za0.b.f128027a.a("Calendar data successfully queried");
        if (!c0.a(context)) {
            return BuildResult.INSTANCE.a("MISSING_BLUETOOTH_CONNECT_PERMISSION");
        }
        Object systemService = context.getSystemService("bluetooth");
        s.i(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
        String name = adapter != null ? adapter.getName() : null;
        if (name != null) {
            he0.b bVarM = he0.b.m(context);
            try {
                BuildResult.Companion companion = BuildResult.INSTANCE;
                String strJ = bVarM.j();
                s.j(strJ, "getAppUUID(...)");
                return companion.b(new CalendarData(!enabled, name, false, false, strJ, reason, aVar.c()));
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("CalendarSyncBuilder", "Failed to serialize calendar data", e11);
                return BuildResult.INSTANCE.a("THROWN_EXCEPTION");
            }
        }
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        zb0.a aVar2 = zb0.a.f128044a;
        Map mapF = v0.f(x.a("CalendarSyncBuilder", "MISSING_BLE_ADAPTER_NAME"));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception("MISSING_BLE_ADAPTER_NAME"));
        TeslaLog.setTag$default(teslaLog, "CalendarSyncBuilder", false, 2, null);
        vr0.a.INSTANCE.a("MISSING_BLE_ADAPTER_NAME", new Object[0]);
        return BuildResult.INSTANCE.a("MISSING_BLE_ADAPTER_NAME");
    }
}
