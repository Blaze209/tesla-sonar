package z0;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<Integer> f126071a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    b() {
    }

    @NonNull
    static b d(int i11, Throwable th2, double d11) {
        return new d(i11, d11, th2);
    }

    abstract double a();

    public abstract int b();

    public abstract Throwable c();
}
