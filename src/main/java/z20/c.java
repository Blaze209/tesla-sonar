package z20;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import y20.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Ly20/t;", "a", "(Ljava/util/List;)Ly20/t;", "wf1-workflow-runtime"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class c {
    public static final t a(List<? extends t> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            return y20.e.f124678a;
        }
        return list.size() == 1 ? (t) v.U0(list) : new b(list);
    }
}
