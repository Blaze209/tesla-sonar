package v80;

import java.util.Arrays;
import java.util.Objects;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv80/c;", "", "<init>", "()V", "obj1", "obj2", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "values", "", "b", "([Ljava/lang/Object;)I", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f118421a = new c();

    private c() {
    }

    public static final boolean a(Object obj1, Object obj2) {
        return s.f(obj1, obj2);
    }

    public static final int b(Object... values) {
        s.k(values, "values");
        return Objects.hash(Arrays.copyOf(values, values.length));
    }
}
