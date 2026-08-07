package p028zk0;

import cl0.b;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lzk0/c;", "Lcl0/b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "b", "J", "a", "()Ljava/lang/Long;", "contentLength", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends b.AbstractC0400b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f128424a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long contentLength = 0;

    private c() {
    }

    @Override // cl0.b
    public Long a() {
        return Long.valueOf(contentLength);
    }

    public String toString() {
        return "EmptyContent";
    }
}
