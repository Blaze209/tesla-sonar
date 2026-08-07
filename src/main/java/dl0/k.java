package dl0;

import java.util.Collections;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "", "a", "(Ljava/util/Set;)Ljava/util/Set;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    public static final <T> Set<T> a(Set<? extends T> set) {
        p013kotlin.jvm.internal.s.k(set, "<this>");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(set);
        p013kotlin.jvm.internal.s.j(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }
}
