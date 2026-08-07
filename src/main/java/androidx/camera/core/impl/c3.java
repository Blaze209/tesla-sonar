package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Range<Integer> f3148a = new Range<>(0, 0);

    public static abstract class a {
        a() {
        }

        @NonNull
        public abstract c3 a();

        @NonNull
        public abstract a b(@NonNull c0.b0 b0Var);

        @NonNull
        public abstract a c(@NonNull Range<Integer> range);

        @NonNull
        public abstract a d(@NonNull x0 x0Var);

        @NonNull
        public abstract a e(@NonNull Size size);

        @NonNull
        public abstract a f(boolean z11);
    }

    @NonNull
    public static a a(@NonNull Size size) {
        return new m.b().e(size).c(f3148a).b(c0.b0.f18255d).f(false);
    }

    @NonNull
    public abstract c0.b0 b();

    @NonNull
    public abstract Range<Integer> c();

    public abstract x0 d();

    @NonNull
    public abstract Size e();

    public abstract boolean f();

    @NonNull
    public abstract a g();
}
