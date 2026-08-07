package ud0;

import io.reactivex.rxjava3.core.o;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wm0.b;
import wm0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u000e0\u000e0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lud0/a;", "", "<init>", "()V", "", "", "data", "", "batchLog", "vin", "Ljn0/h0;", "a", "(Ljava/util/Map;ZLjava/lang/String;)V", "Lio/reactivex/rxjava3/core/o;", "Lud0/a$a;", "c", "()Lio/reactivex/rxjava3/core/o;", "Lwm0/e;", "kotlin.jvm.PlatformType", "b", "Lwm0/e;", "logs", "remotelog_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f116153a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final e<LogPayload> logs;

    /* JADX INFO: renamed from: ud0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lud0/a$a;", "", "", "", "data", "", "batchLog", "vin", "<init>", "(Ljava/util/Map;ZLjava/lang/String;)V", "a", "()Ljava/util/Map;", "b", "()Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getData", "Z", "getBatchLog", "c", "Ljava/lang/String;", "getVin", "remotelog_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LogPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Object> data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean batchLog;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        public LogPayload(Map<String, ? extends Object> data, boolean z11, String str) {
            s.k(data, "data");
            this.data = data;
            this.batchLog = z11;
            this.vin = str;
        }

        public final Map<String, Object> a() {
            return this.data;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getBatchLog() {
            return this.batchLog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogPayload)) {
                return false;
            }
            LogPayload logPayload = (LogPayload) other;
            return s.f(this.data, logPayload.data) && this.batchLog == logPayload.batchLog && s.f(this.vin, logPayload.vin);
        }

        public int hashCode() {
            int iHashCode = ((this.data.hashCode() * 31) + Boolean.hashCode(this.batchLog)) * 31;
            String str = this.vin;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LogPayload(data=" + this.data + ", batchLog=" + this.batchLog + ", vin=" + this.vin + ")";
        }
    }

    static {
        e eVarB0 = b.d0().b0();
        s.j(eVarB0, "toSerialized(...)");
        logs = eVarB0;
    }

    private a() {
    }

    public static final void a(Map<String, ? extends Object> data, boolean batchLog, String vin) {
        s.k(data, "data");
        logs.onNext(new LogPayload(data, batchLog, vin));
    }

    public static /* synthetic */ void b(Map map, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        a(map, z11, str);
    }

    public final o<LogPayload> c() {
        return logs;
    }
}
