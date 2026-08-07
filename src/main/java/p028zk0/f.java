package p028zk0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import yk0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lzk0/f;", "", "Lyk0/c;", "response", "", "cause", "<init>", "(Lyk0/c;Ljava/lang/Throwable;)V", "a", "Lyk0/c;", "getResponse", "()Lyk0/c;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c response;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable cause;

    public f(c response, Throwable cause) {
        s.k(response, "response");
        s.k(cause, "cause");
        this.response = response;
        this.cause = cause;
    }
}
