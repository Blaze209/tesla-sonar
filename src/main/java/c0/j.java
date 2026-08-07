package c0;

import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<Integer> f18335h = Arrays.asList(1, 2, 3, 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Executor f18339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p1 f18340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final v0 f18341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final Consumer<Throwable> f18342g;

    @NonNull
    public p0.r0 a() {
        return new p0.y0(this);
    }

    @NonNull
    public Consumer<Throwable> b() {
        return this.f18342g;
    }

    @NonNull
    public Executor c() {
        return this.f18339d;
    }

    public v0 d() {
        return this.f18341f;
    }

    public int e() {
        return this.f18337b;
    }

    public p1 f() {
        return this.f18340e;
    }

    public int g() {
        return this.f18336a;
    }

    public int h() {
        return this.f18338c;
    }
}
