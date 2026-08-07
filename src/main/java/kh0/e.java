package kh0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkh0/e;", "", "Lkh0/b;", "logger", "", "subsystem", "<init>", "(Lkh0/b;Ljava/lang/String;)V", "message", "Ljn0/h0;", "a", "(Ljava/lang/String;)V", "Lkh0/b;", "b", "Ljava/lang/String;", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b logger;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String subsystem;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkh0/e$a;", "", "", "subsystem", "Lkh0/e;", "a", "(Ljava/lang/String;)Lkh0/e;", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        e a(String subsystem);
    }

    public e(b logger, String subsystem) {
        s.k(logger, "logger");
        s.k(subsystem, "subsystem");
        this.logger = logger;
        this.subsystem = subsystem;
    }

    public final void a(String message) {
        s.k(message, "message");
        this.logger.f(this.subsystem, kh0.a.Error, message);
    }
}
