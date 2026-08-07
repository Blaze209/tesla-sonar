package kp0;

import p013kotlin.Metadata;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkp0/a;", "", "wrappedValue", "", "b", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: kp0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C1877a {
        public static Boolean a(a aVar, Object obj) {
            Double dU;
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Number) {
                return Boolean.valueOf(((Number) obj).longValue() > 0);
            }
            if (!(obj instanceof String) || (dU = t.u((String) obj)) == null) {
                return null;
            }
            return Boolean.valueOf(((long) dU.doubleValue()) > 0);
        }
    }

    Boolean b(Object wrappedValue);
}
