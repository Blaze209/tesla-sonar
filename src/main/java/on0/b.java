package on0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.Serializable;
import java.lang.Enum;
import p013kotlin.Metadata;
import p013kotlin.collections.d;
import p013kotlin.collections.n;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lon0/b;", "", "T", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "", "index", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Enum;", "element", "", "h", "(Ljava/lang/Enum;)Z", "j", "(Ljava/lang/Enum;)I", "k", "b", "[Ljava/lang/Enum;", DateTokenConverter.CONVERTER_KEY, "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class b<T extends Enum<T>> extends d<T> implements EnumEntries<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T[] entries;

    public b(T[] entries) {
        s.k(entries, "entries");
        this.entries = entries;
    }

    @Override // p013kotlin.collections.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return false;
    }

    @Override // p013kotlin.collections.b
    /* JADX INFO: renamed from: d */
    public int get_size() {
        return this.entries.length;
    }

    public boolean h(T element) {
        s.k(element, "element");
        return ((Enum) n.x0(this.entries, element.ordinal())) == element;
    }

    @Override // p013kotlin.collections.d, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public T get(int index) {
        d.INSTANCE.b(index, this.entries.length);
        return this.entries[index];
    }

    @Override // p013kotlin.collections.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return j((Enum) obj);
        }
        return -1;
    }

    public int j(T element) {
        s.k(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) n.x0(this.entries, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int k(T element) {
        s.k(element, "element");
        return indexOf(element);
    }

    @Override // p013kotlin.collections.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }
}
