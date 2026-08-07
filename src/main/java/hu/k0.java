package hu;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final l0 f73651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IntentFilter f73652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f73653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Set f73654d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j0 f73655e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f73656f = false;

    protected k0(l0 l0Var, IntentFilter intentFilter, Context context) {
        this.f73651a = l0Var;
        this.f73652b = intentFilter;
        this.f73653c = a0.a(context);
    }

    private final void d() {
        j0 j0Var;
        if ((this.f73656f || !this.f73654d.isEmpty()) && this.f73655e == null) {
            j0 j0Var2 = new j0(this, null);
            this.f73655e = j0Var2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f73653c.registerReceiver(j0Var2, this.f73652b, 2);
            } else {
                this.f73653c.registerReceiver(j0Var2, this.f73652b);
            }
        }
        if (this.f73656f || !this.f73654d.isEmpty() || (j0Var = this.f73655e) == null) {
            return;
        }
        this.f73653c.unregisterReceiver(j0Var);
        this.f73655e = null;
    }

    protected abstract void a(Context context, Intent intent);

    public final synchronized void b(boolean z11) {
        this.f73656f = true;
        d();
    }

    public final synchronized void c(Object obj) {
        Iterator it = new HashSet(this.f73654d).iterator();
        while (it.hasNext()) {
            ((bu.a) it.next()).a(obj);
        }
    }
}
