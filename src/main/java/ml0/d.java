package ml0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "value", "", "name", "", "a", "(JLjava/lang/String;)Ljava/lang/Void;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final Void a(long j11, String name) {
        s.k(name, "name");
        throw new IllegalArgumentException("Long value " + j11 + " of " + name + " doesn't fit into 32-bit integer");
    }
}
