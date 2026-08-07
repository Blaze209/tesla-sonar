package androidx.work.multiprocess;

import android.os.RemoteException;
import androidx.work.z;
import com.google.common.util.concurrent.s;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d<I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f14694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final c f14695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final s<I> f14696c;

    public static class a<I> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f14697b = z.i("ListenableCallbackRbl");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d<I> f14698a;

        public a(d<I> dVar) {
            this.f14698a = dVar;
        }

        public static void a(c cVar, Throwable th2) {
            try {
                cVar.u2(th2.getMessage());
            } catch (RemoteException e11) {
                z.e().d(f14697b, "Unable to notify failures in operation", e11);
            }
        }

        public static void b(c cVar, byte[] bArr) {
            try {
                cVar.d1(bArr);
            } catch (RemoteException e11) {
                z.e().d(f14697b, "Unable to notify successful operation", e11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                I i11 = this.f14698a.f14696c.get();
                d<I> dVar = this.f14698a;
                b(dVar.f14695b, dVar.b(i11));
            } catch (Throwable th2) {
                a(this.f14698a.f14695b, th2);
            }
        }
    }

    public d(Executor executor, c cVar, s<I> sVar) {
        this.f14694a = executor;
        this.f14695b = cVar;
        this.f14696c = sVar;
    }

    public void a() {
        this.f14696c.b(new a(this), this.f14694a);
    }

    public abstract byte[] b(I i11);
}
