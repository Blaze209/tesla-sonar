package t8;

import java.util.concurrent.Executor;
import s7.n;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends Executor {

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f112874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f112875b;

        a(Executor executor, n nVar) {
            this.f112874a = executor;
            this.f112875b = nVar;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f112874a.execute(runnable);
        }

        @Override // t8.b
        public void release() {
            this.f112875b.accept(this.f112874a);
        }
    }

    static <T extends Executor> b c(T t11, n<T> nVar) {
        return new a(t11, nVar);
    }

    void release();
}
