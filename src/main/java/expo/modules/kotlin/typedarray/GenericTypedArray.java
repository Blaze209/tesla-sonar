package expo.modules.kotlin.typedarray;

import java.util.Iterator;
import p013kotlin.Metadata;
import xn0.a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u0018\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lexpo/modules/kotlin/typedarray/GenericTypedArray;", "T", "Lexpo/modules/kotlin/typedarray/TypedArray;", "", "", "index", "get", "(I)Ljava/lang/Object;", "value", "Ljn0/h0;", "set", "(ILjava/lang/Object;)V", "", "iterator", "()Ljava/util/Iterator;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface GenericTypedArray<T> extends TypedArray, Iterable<T>, a {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T> Iterator<T> iterator(GenericTypedArray<T> genericTypedArray) {
            return new TypedArrayIterator(genericTypedArray);
        }
    }

    T get(int index);

    @Override // java.lang.Iterable
    Iterator<T> iterator();

    void set(int index, T value);
}
