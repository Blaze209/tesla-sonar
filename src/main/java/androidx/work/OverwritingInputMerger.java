package androidx.work;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Landroidx/work/o;", "<init>", "()V", "", "Landroidx/work/g;", "inputs", "a", "(Ljava/util/List;)Landroidx/work/g;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OverwritingInputMerger extends o {
    @Override // androidx.work.o
    public g a(List<g> inputs) {
        p013kotlin.jvm.internal.s.k(inputs, "inputs");
        g.a aVar = new g.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<g> it = inputs.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().g());
        }
        aVar.d(linkedHashMap);
        return aVar.a();
    }
}
