package bo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.Comparable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lbo0/f;", "", "T", "", "value", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Comparable;)Z", "isEmpty", "()Z", "getStart", "()Ljava/lang/Comparable;", "start", "e", "endInclusive", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f<T extends Comparable<? super T>> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(f<T> fVar, T value) {
            s.k(value, "value");
            return value.compareTo(fVar.getStart()) >= 0 && value.compareTo(fVar.e()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(f<T> fVar) {
            return fVar.getStart().compareTo(fVar.e()) > 0;
        }
    }

    boolean d(T value);

    T e();

    T getStart();

    boolean isEmpty();
}
