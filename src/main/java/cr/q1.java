package cr;

import android.media.metrics.LogSessionId;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1 f59081b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f59082a;

    private static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f59083b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LogSessionId f59084a;

        public a(LogSessionId logSessionId) {
            this.f59084a = logSessionId;
        }
    }

    static {
        f59081b = ts.p0.f115040a < 31 ? new q1() : new q1(a.f59083b);
    }

    public q1() {
        this((a) null);
        ts.a.g(ts.p0.f115040a < 31);
    }

    public LogSessionId a() {
        return ((a) ts.a.e(this.f59082a)).f59084a;
    }

    public q1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    private q1(a aVar) {
        this.f59082a = aVar;
    }
}
