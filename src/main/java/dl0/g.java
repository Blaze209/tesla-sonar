package dl0;

import java.util.Collections;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u001aW\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"K", "V", "Lkotlin/Function1;", "supplier", "Ljn0/h0;", "close", "", "maxSize", "", "a", "(Lwn0/l;Lwn0/l;I)Ljava/util/Map;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    public static final <K, V> Map<K, V> a(wn0.l<? super K, ? extends V> supplier, wn0.l<? super V, h0> close, int i11) {
        p013kotlin.jvm.internal.s.k(supplier, "supplier");
        p013kotlin.jvm.internal.s.k(close, "close");
        Map<K, V> mapSynchronizedMap = Collections.synchronizedMap(new r(supplier, close, i11));
        p013kotlin.jvm.internal.s.j(mapSynchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        return mapSynchronizedMap;
    }
}
