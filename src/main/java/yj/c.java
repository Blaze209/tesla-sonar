package yj;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    private static class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f125623a;

        b() {
            super();
        }

        @Override // yj.c
        public void b(boolean z11) {
            this.f125623a = z11;
        }

        @Override // yj.c
        public void c() {
            if (this.f125623a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    @NonNull
    public static c a() {
        return new b();
    }

    abstract void b(boolean z11);

    public abstract void c();

    private c() {
    }
}
