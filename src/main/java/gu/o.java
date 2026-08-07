package gu;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import hu.k0;
import hu.l0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends k0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static o f69571j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Handler f69572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f69573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Set f69574i;

    public o(Context context, f fVar) {
        super(new l0("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f69572g = new Handler(Looper.getMainLooper());
        this.f69574i = new LinkedHashSet();
        this.f69573h = fVar;
    }

    public static synchronized o f(Context context) {
        try {
            if (f69571j == null) {
                f69571j = new o(context, i.INSTANCE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f69571j;
    }

    @Override // hu.k0
    protected final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        a aVarJ = a.j(bundleExtra);
        this.f73651a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", aVarJ);
        g gVarZza = this.f69573h.zza();
        if (aVarJ.e() != 3 || gVarZza == null) {
            h(aVarJ);
        } else {
            gVarZza.a(aVarJ.i(), new m(this, aVarJ, intent, context));
        }
    }

    public final synchronized void h(a aVar) {
        try {
            Iterator it = new LinkedHashSet(this.f69574i).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(aVar);
            }
            super.c(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
