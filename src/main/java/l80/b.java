package l80;

import io0.d;
import io0.e;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "attempts", "Lio0/b;", "a", "(I)J", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final long a(int i11) {
        double dPow = Math.pow(((double) i11) + 1.0d, 2);
        io0.b.Companion companion = io0.b.INSTANCE;
        return d.r(dPow, e.SECONDS);
    }
}
