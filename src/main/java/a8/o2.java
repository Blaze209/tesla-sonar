package a8;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o2 f726d = new o2("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f729c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f730a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            s7.a.h(this.f730a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f730a = logSessionId;
        }
    }

    public o2(String str) {
        this.f727a = str;
        this.f728b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.f729c = new Object();
    }

    public synchronized LogSessionId a() {
        return ((a) s7.a.f(this.f728b)).f730a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) s7.a.f(this.f728b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return Objects.equals(this.f727a, o2Var.f727a) && Objects.equals(this.f728b, o2Var.f728b) && Objects.equals(this.f729c, o2Var.f729c);
    }

    public int hashCode() {
        return Objects.hash(this.f727a, this.f728b, this.f729c);
    }
}
