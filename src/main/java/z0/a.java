package z0;

import android.util.Range;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f126064a = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public static final Range<Integer> f126065b = new Range<>(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f126066c = a().c(0).a();

    /* JADX INFO: renamed from: z0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC2741a {
        AbstractC2741a() {
        }

        @NonNull
        public abstract a a();

        @NonNull
        public abstract AbstractC2741a b(@NonNull Range<Integer> range);

        @NonNull
        public abstract AbstractC2741a c(int i11);

        @NonNull
        public abstract AbstractC2741a d(@NonNull Range<Integer> range);

        @NonNull
        public abstract AbstractC2741a e(int i11);
    }

    a() {
    }

    @NonNull
    public static AbstractC2741a a() {
        return new c.b().f(-1).e(-1).c(-1).b(f126064a).d(f126065b);
    }

    @NonNull
    public abstract Range<Integer> b();

    public abstract int c();

    @NonNull
    public abstract Range<Integer> d();

    public abstract int e();

    public abstract int f();
}
