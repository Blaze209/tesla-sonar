package w2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lw2/r;", "K", "V", "Lu2/b;", "Lkotlin/collections/b;", "Lw2/d;", "map", "<init>", "(Lw2/d;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "a", "Lw2/d;", "", DateTokenConverter.CONVERTER_KEY, "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r<K, V> extends p013kotlin.collections.b<V> implements u2.b<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d<K, V> map;

    public r(d<K, V> dVar) {
        this.map = dVar;
    }

    @Override // p013kotlin.collections.b, java.util.Collection
    public boolean contains(Object element) {
        return this.map.containsValue(element);
    }

    @Override // p013kotlin.collections.b
    /* JADX INFO: renamed from: d */
    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new s(this.map.r());
    }
}
