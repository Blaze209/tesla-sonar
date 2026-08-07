package z0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class h1 {
    h1() {
    }

    @NonNull
    static h1 d(long j11, long j12, @NonNull b bVar) {
        u5.h.b(j11 >= 0, "duration must be positive value.");
        u5.h.b(j12 >= 0, "bytes must be positive value.");
        return new l(j11, j12, bVar);
    }

    @NonNull
    public abstract b a();

    public abstract long b();

    public abstract long c();
}
