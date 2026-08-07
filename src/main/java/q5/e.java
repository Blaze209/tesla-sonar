package q5;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f104822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f104823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f104824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f104825d;

    public interface a {
        void onCancel();
    }

    private void d() {
        while (this.f104825d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f104822a) {
                    return;
                }
                this.f104822a = true;
                this.f104825d = true;
                a aVar = this.f104823b;
                Object obj = this.f104824c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f104825d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f104825d = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public Object b() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f104824c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f104824c = cancellationSignal;
                    if (this.f104822a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f104824c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public void c(a aVar) {
        synchronized (this) {
            try {
                d();
                if (this.f104823b == aVar) {
                    return;
                }
                this.f104823b = aVar;
                if (this.f104822a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
