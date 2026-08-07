package ts;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class k0 implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<b> f115016b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f115017a;

    private static final class b implements q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f115018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private k0 f115019b;

        private b() {
        }

        private void b() {
            this.f115018a = null;
            this.f115019b = null;
            k0.n(this);
        }

        @Override // ts.q.a
        public void a() {
            ((Message) ts.a.e(this.f115018a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) ts.a.e(this.f115018a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, k0 k0Var) {
            this.f115018a = message;
            this.f115019b = k0Var;
            return this;
        }
    }

    public k0(Handler handler) {
        this.f115017a = handler;
    }

    private static b m() {
        b bVar;
        List<b> list = f115016b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(b bVar) {
        List<b> list = f115016b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ts.q
    public q.a a(int i11) {
        return m().d(this.f115017a.obtainMessage(i11), this);
    }

    @Override // ts.q
    public boolean b(int i11) {
        return this.f115017a.hasMessages(i11);
    }

    @Override // ts.q
    public q.a c(int i11, Object obj) {
        return m().d(this.f115017a.obtainMessage(i11, obj), this);
    }

    @Override // ts.q
    public void d(Object obj) {
        this.f115017a.removeCallbacksAndMessages(obj);
    }

    @Override // ts.q
    public q.a e(int i11, int i12, int i13) {
        return m().d(this.f115017a.obtainMessage(i11, i12, i13), this);
    }

    @Override // ts.q
    public Looper f() {
        return this.f115017a.getLooper();
    }

    @Override // ts.q
    public boolean g(Runnable runnable) {
        return this.f115017a.post(runnable);
    }

    @Override // ts.q
    public boolean h(int i11) {
        return this.f115017a.sendEmptyMessage(i11);
    }

    @Override // ts.q
    public boolean i(int i11, long j11) {
        return this.f115017a.sendEmptyMessageAtTime(i11, j11);
    }

    @Override // ts.q
    public void j(int i11) {
        this.f115017a.removeMessages(i11);
    }

    @Override // ts.q
    public boolean k(q.a aVar) {
        return ((b) aVar).c(this.f115017a);
    }
}
