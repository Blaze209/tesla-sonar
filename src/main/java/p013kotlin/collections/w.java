package p013kotlin.collections;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kn0.b;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0014\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"T", "element", "", "e", "(Ljava/lang/Object;)Ljava/util/List;", "E", "", "c", "()Ljava/util/List;", "", "capacity", DateTokenConverter.CONVERTER_KEY, "(I)Ljava/util/List;", "builder", "a", "(Ljava/util/List;)Ljava/util/List;", "", "f", "(Ljava/lang/Iterable;)Ljava/util/List;", "collectionSize", "", "array", "g", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "", "b", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class w {
    public static <E> List<E> a(List<E> builder) {
        s.k(builder, "builder");
        return ((b) builder).r();
    }

    public static final <T> Object[] b(T[] tArr, boolean z11) {
        s.k(tArr, "<this>");
        if (z11 && s.f(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        s.j(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static <E> List<E> c() {
        return new b(0, 1, null);
    }

    public static <E> List<E> d(int i11) {
        return new b(i11);
    }

    public static <T> List<T> e(T t11) {
        List<T> listSingletonList = Collections.singletonList(t11);
        s.j(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static <T> List<T> f(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        List<T> listO1 = g0.o1(iterable);
        Collections.shuffle(listO1);
        return listO1;
    }

    public static <T> T[] g(int i11, T[] array) {
        s.k(array, "array");
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }
}
