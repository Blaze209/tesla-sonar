package androidx.collection;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ConcurrentModificationException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"E", "Landroidx/collection/b;", "", "hash", "b", "(Landroidx/collection/b;I)I", "", Action.KEY_ATTRIBUTE, "c", "(Landroidx/collection/b;Ljava/lang/Object;I)I", DateTokenConverter.CONVERTER_KEY, "(Landroidx/collection/b;)I", "size", "Ljn0/h0;", "a", "(Landroidx/collection/b;I)V", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final <E> void a(b<E> bVar, int i11) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        bVar.l(new int[i11]);
        bVar.k(new Object[i11]);
    }

    public static final <E> int b(b<E> bVar, int i11) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        try {
            return n1.a.a(bVar.getHashes(), bVar.i(), i11);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int c(b<E> bVar, Object obj, int i11) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        int i12 = bVar.i();
        if (i12 == 0) {
            return -1;
        }
        int iB = b(bVar, i11);
        if (iB < 0 || p013kotlin.jvm.internal.s.f(obj, bVar.getArray()[iB])) {
            return iB;
        }
        int i13 = iB + 1;
        while (i13 < i12 && bVar.getHashes()[i13] == i11) {
            if (p013kotlin.jvm.internal.s.f(obj, bVar.getArray()[i13])) {
                return i13;
            }
            i13++;
        }
        for (int i14 = iB - 1; i14 >= 0 && bVar.getHashes()[i14] == i11; i14--) {
            if (p013kotlin.jvm.internal.s.f(obj, bVar.getArray()[i14])) {
                return i14;
            }
        }
        return ~i13;
    }

    public static final <E> int d(b<E> bVar) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        return c(bVar, null, 0);
    }
}
