package no0;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "Lno0/v;", "predicates", "a", "(Ljava/util/List;)Lno0/v;", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class w {
    public static final <T> v<T> a(List<? extends v<? super T>> predicates) {
        p013kotlin.jvm.internal.s.k(predicates, "predicates");
        if (predicates.isEmpty()) {
            return a0.f95231a;
        }
        return predicates.size() == 1 ? (v) p013kotlin.collections.v.U0(predicates) : new i(predicates);
    }
}
