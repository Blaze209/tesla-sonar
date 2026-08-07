package oj0;

import android.os.Looper;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Thread f97862a = Thread.currentThread();

        public void a() {
            if (this.f97862a == null) {
                this.f97862a = Thread.currentThread();
            }
            if (Thread.currentThread() != this.f97862a) {
                throw new IllegalStateException("Wrong thread");
            }
        }
    }

    public static void a() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("Not on main thread!");
        }
    }
}
