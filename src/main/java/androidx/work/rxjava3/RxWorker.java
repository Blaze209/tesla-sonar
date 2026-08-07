package androidx.work.rxjava3;

import am0.b;
import android.content.Context;
import androidx.concurrent.futures.c;
import androidx.work.WorkerParameters;
import androidx.work.m;
import androidx.work.rxjava3.RxWorker;
import androidx.work.y;
import com.google.common.util.concurrent.s;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import java.util.Objects;
import java.util.concurrent.Executor;
import tb.g0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RxWorker extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Executor f14748c = new g0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements w<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f14749a;

        a(c.a aVar) {
            this.f14749a = aVar;
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onError(Throwable th2) {
            this.f14749a.f(th2);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSubscribe(final b bVar) {
            c.a aVar = this.f14749a;
            Objects.requireNonNull(bVar);
            aVar.a(new Runnable() { // from class: yb.b
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.dispose();
                }
            }, RxWorker.f14748c);
        }

        @Override // io.reactivex.rxjava3.core.w
        public void onSuccess(T t11) {
            this.f14749a.c(t11);
        }
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static /* synthetic */ Object b(RxWorker rxWorker, u uVar, c.a aVar) {
        uVar.v(rxWorker.e()).o(vm0.a.b(rxWorker.getTaskExecutor().d(), true, true)).a(rxWorker.new a(aVar));
        return "converted single to future";
    }

    private <T> s<T> c(final u<T> uVar) {
        return c.a(new c.InterfaceC0146c() { // from class: yb.a
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(c.a aVar) {
                return RxWorker.b(this.f125327a, uVar, aVar);
            }
        });
    }

    public abstract u<y.a> d();

    protected t e() {
        return vm0.a.b(getBackgroundExecutor(), true, true);
    }

    public u<m> f() {
        return u.i(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`"));
    }

    @Override // androidx.work.y
    public s<m> getForegroundInfoAsync() {
        return c(f());
    }

    @Override // androidx.work.y
    public final s<y.a> startWork() {
        return c(d());
    }
}
