package c0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    public static abstract class a {
        @NonNull
        public static a a(int i11) {
            return b(i11, null);
        }

        @NonNull
        public static a b(int i11, Throwable th2) {
            return new c(i11, th2);
        }

        public abstract Throwable c();

        public abstract int d();
    }

    public enum b {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    @NonNull
    public static q a(@NonNull b bVar) {
        return b(bVar, null);
    }

    @NonNull
    public static q b(@NonNull b bVar, a aVar) {
        return new c0.b(bVar, aVar);
    }

    public abstract a c();

    @NonNull
    public abstract b d();
}
