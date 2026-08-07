package kn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import java.util.Map.Entry;
import p013kotlin.Metadata;
import p013kotlin.collections.j;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lkn0/a;", "", "E", "K", "V", "Lkotlin/collections/j;", "<init>", "()V", "element", "", "b", "(Ljava/util/Map$Entry;)Z", DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends j<E> {
    public final boolean b(E element) {
        s.k(element, "element");
        return d(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean d(Map.Entry<? extends K, ? extends V> element);

    public abstract /* bridge */ boolean e(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return e((Map.Entry) obj);
        }
        return false;
    }
}
