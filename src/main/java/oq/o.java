package oq;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    public static abstract class a {
        @NonNull
        public abstract o a();

        @NonNull
        public abstract a b(oq.a aVar);

        @NonNull
        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        private final int value;

        b(int i11) {
            this.value = i11;
        }
    }

    @NonNull
    public static a a() {
        return new e.b();
    }

    public abstract oq.a b();

    public abstract b c();
}
