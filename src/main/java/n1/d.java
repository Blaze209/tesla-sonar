package n1;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"", "message", "Ljn0/h0;", "b", "(Ljava/lang/String;)V", "a", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final void a(String message) {
        s.k(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        s.k(message, "message");
        throw new IllegalStateException(message);
    }
}
