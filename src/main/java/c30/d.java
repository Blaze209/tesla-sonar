package c30;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "", "Lc30/c;", "a", "(Ljava/util/List;)Lc30/c;", "wf1-container-common"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class d {
    public static final <T> c<T> a(List<? extends T> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return new c<>(v.o0(list), list.subList(1, list.size()));
    }
}
