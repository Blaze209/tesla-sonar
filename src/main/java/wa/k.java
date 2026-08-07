package wa;

import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\n\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "K", "V", "Landroidx/collection/a;", "map", "", "isRelationCollection", "Lkotlin/Function1;", "Ljn0/h0;", "fetchBlock", "a", "(Landroidx/collection/a;ZLwn0/l;)V", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/RelationUtil")
final /* synthetic */ class k {
    public static final <K, V> void a(androidx.collection.a<K, V> map, boolean z11, wn0.l<? super androidx.collection.a<K, V>, h0> fetchBlock) {
        p013kotlin.jvm.internal.s.k(map, "map");
        p013kotlin.jvm.internal.s.k(fetchBlock, "fetchBlock");
        androidx.collection.a aVar = new androidx.collection.a(999);
        int size = map.getSize();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            if (z11) {
                aVar.put(map.i(i11), map.m(i11));
            } else {
                aVar.put(map.i(i11), null);
            }
            i11++;
            i12++;
            if (i12 == 999) {
                fetchBlock.invoke(aVar);
                if (!z11) {
                    map.putAll(aVar);
                }
                aVar.clear();
                i12 = 0;
            }
        }
        if (i12 > 0) {
            fetchBlock.invoke(aVar);
            if (z11) {
                return;
            }
            map.putAll(aVar);
        }
    }
}
