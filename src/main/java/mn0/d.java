package mn0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\u00028\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\n\u0010\u0007\u001a\u00020\u000b\"\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\n\u0010\u0007\u001a\u00020\u000b\"\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"", "T", "a", "b", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "other", "j", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "h", "(I[I)I", "k", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
public class d extends c {
    public static int h(int i11, int... other) {
        s.k(other, "other");
        for (int i12 : other) {
            i11 = Math.max(i11, i12);
        }
        return i11;
    }

    public static <T extends Comparable<? super T>> T i(T a11, T b11) {
        s.k(a11, "a");
        s.k(b11, "b");
        return a11.compareTo(b11) >= 0 ? a11 : b11;
    }

    public static <T extends Comparable<? super T>> T j(T a11, T... other) {
        s.k(a11, "a");
        s.k(other, "other");
        for (T t11 : other) {
            a11 = (T) i(a11, t11);
        }
        return a11;
    }

    public static int k(int i11, int... other) {
        s.k(other, "other");
        for (int i12 : other) {
            i11 = Math.min(i11, i12);
        }
        return i11;
    }
}
