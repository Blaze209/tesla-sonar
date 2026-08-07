package wq0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes10.dex */
public class e extends Handler implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f122296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f122297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f122298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f122299d;

    protected e(c cVar, Looper looper, int i11) {
        super(looper);
        this.f122298c = cVar;
        this.f122297b = i11;
        this.f122296a = new j();
    }

    @Override // wq0.k
    public void a(p pVar, Object obj) {
        i iVarA = i.a(pVar, obj);
        synchronized (this) {
            try {
                this.f122296a.a(iVarA);
                if (!this.f122299d) {
                    this.f122299d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                i iVarB = this.f122296a.b();
                if (iVarB == null) {
                    synchronized (this) {
                        iVarB = this.f122296a.b();
                        if (iVarB == null) {
                            this.f122299d = false;
                            return;
                        }
                    }
                }
                this.f122298c.g(iVarB);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f122297b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f122299d = true;
        } catch (Throwable th2) {
            this.f122299d = false;
            throw th2;
        }
    }
}
