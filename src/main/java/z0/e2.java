package z0;

import android.util.Range;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f126117a = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f126118b = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public static final a0 f126119c;

    public static abstract class a {
        a() {
        }

        @NonNull
        public abstract e2 a();

        @NonNull
        abstract a b(int i11);

        @NonNull
        public abstract a c(@NonNull Range<Integer> range);

        @NonNull
        public abstract a d(@NonNull Range<Integer> range);

        @NonNull
        public abstract a e(@NonNull a0 a0Var);
    }

    static {
        x xVar = x.f126359c;
        f126119c = a0.e(Arrays.asList(xVar, x.f126358b, x.f126357a), p.a(xVar));
    }

    e2() {
    }

    @NonNull
    public static a a() {
        return new n.b().e(f126119c).d(f126117a).c(f126118b).b(-1);
    }

    abstract int b();

    @NonNull
    public abstract Range<Integer> c();

    @NonNull
    public abstract Range<Integer> d();

    @NonNull
    public abstract a0 e();

    @NonNull
    public abstract a f();
}
