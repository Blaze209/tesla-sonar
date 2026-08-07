package s7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class g0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<b> f110417b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f110418a;

    private static final class b implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f110419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g0 f110420b;

        private b() {
        }

        private void b() {
            this.f110419a = null;
            this.f110420b = null;
            g0.o(this);
        }

        @Override // s7.p.a
        public void a() {
            ((Message) s7.a.f(this.f110419a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) s7.a.f(this.f110419a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, g0 g0Var) {
            this.f110419a = message;
            this.f110420b = g0Var;
            return this;
        }
    }

    public g0(Handler handler) {
        this.f110418a = handler;
    }

    private static b n() {
        b bVar;
        List<b> list = f110417b;
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
    public static void o(b bVar) {
        List<b> list = f110417b;
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

    @Override // s7.p
    public p.a a(int i11) {
        return n().d(this.f110418a.obtainMessage(i11), this);
    }

    @Override // s7.p
    public boolean b(int i11) {
        s7.a.a(i11 != 0);
        return this.f110418a.hasMessages(i11);
    }

    @Override // s7.p
    public p.a c(int i11, Object obj) {
        return n().d(this.f110418a.obtainMessage(i11, obj), this);
    }

    @Override // s7.p
    public void d(Object obj) {
        this.f110418a.removeCallbacksAndMessages(obj);
    }

    @Override // s7.p
    public p.a e(int i11, int i12, int i13) {
        return n().d(this.f110418a.obtainMessage(i11, i12, i13), this);
    }

    @Override // s7.p
    public Looper f() {
        return this.f110418a.getLooper();
    }

    @Override // s7.p
    public boolean g(Runnable runnable) {
        return this.f110418a.post(runnable);
    }

    @Override // s7.p
    public boolean h(int i11) {
        return this.f110418a.sendEmptyMessage(i11);
    }

    @Override // s7.p
    public boolean i(int i11, long j11) {
        return this.f110418a.sendEmptyMessageAtTime(i11, j11);
    }

    @Override // s7.p
    public void j(int i11) {
        s7.a.a(i11 != 0);
        this.f110418a.removeMessages(i11);
    }

    @Override // s7.p
    public p.a k(int i11, int i12, int i13, Object obj) {
        return n().d(this.f110418a.obtainMessage(i11, i12, i13, obj), this);
    }

    @Override // s7.p
    public boolean l(p.a aVar) {
        return ((b) aVar).c(this.f110418a);
    }
}
