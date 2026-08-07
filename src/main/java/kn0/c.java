package kn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001a\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010\u001e\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"E", "", "size", "", DateTokenConverter.CONVERTER_KEY, "(I)[Ljava/lang/Object;", "T", "offset", "length", "", "thisCollection", "", "j", "([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "([Ljava/lang/Object;II)I", "", "other", "", "h", "([Ljava/lang/Object;IILjava/util/List;)Z", "newSize", "e", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "index", "Ljn0/h0;", "f", "([Ljava/lang/Object;I)V", "fromIndex", "toIndex", "g", "([Ljava/lang/Object;II)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final <E> E[] d(int i11) {
        if (i11 >= 0) {
            return (E[]) new Object[i11];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final <T> T[] e(T[] tArr, int i11) {
        s.k(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i11);
        s.j(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void f(E[] eArr, int i11) {
        s.k(eArr, "<this>");
        eArr[i11] = null;
    }

    public static final <E> void g(E[] eArr, int i11, int i12) {
        s.k(eArr, "<this>");
        while (i11 < i12) {
            f(eArr, i11);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean h(T[] tArr, int i11, int i12, List<?> list) {
        if (i12 != list.size()) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!s.f(tArr[i11 + i13], list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int i(T[] tArr, int i11, int i12) {
        int iHashCode = 1;
        for (int i13 = 0; i13 < i12; i13++) {
            T t11 = tArr[i11 + i13];
            iHashCode = (iHashCode * 31) + (t11 != null ? t11.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String j(T[] tArr, int i11, int i12, Collection<? extends T> collection) {
        StringBuilder sb2 = new StringBuilder((i12 * 3) + 2);
        sb2.append("[");
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 > 0) {
                sb2.append(", ");
            }
            T t11 = tArr[i11 + i13];
            if (t11 == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(t11);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }
}
