package wq0;

import android.os.Looper;

/* JADX INFO: loaded from: classes10.dex */
public interface g {

    public static class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Looper f122302a;

        public a(Looper looper) {
            this.f122302a = looper;
        }

        @Override // wq0.g
        public boolean a() {
            return this.f122302a == Looper.myLooper();
        }

        @Override // wq0.g
        public k b(c cVar) {
            return new e(cVar, this.f122302a, 10);
        }
    }

    boolean a();

    k b(c cVar);
}
