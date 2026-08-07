package em0;

import cm0.d;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final d<Object, Object> f63104a = new a();

    static final class a implements d<Object, Object> {
        a() {
        }

        @Override // cm0.d
        public boolean test(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    public static <T> d<T, T> a() {
        return (d<T, T>) f63104a;
    }

    public static int b(int i11, String str) {
        if (i11 > 0) {
            return i11;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i11);
    }
}
