package mb;

import androidx.work.m0;
import androidx.work.z;
import java.util.HashMap;
import java.util.Map;
import lb.u;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f91703e = z.i("DelayedWorkTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u f91704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f91705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.work.b f91706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, Runnable> f91707d = new HashMap();

    /* JADX INFO: renamed from: mb.a$a, reason: collision with other inner class name */
    class RunnableC1957a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ sb.m0 f91708a;

        RunnableC1957a(sb.m0 m0Var) {
            this.f91708a = m0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.e().a(a.f91703e, "Scheduling work " + this.f91708a.id);
            a.this.f91704a.c(this.f91708a);
        }
    }

    public a(u uVar, m0 m0Var, androidx.work.b bVar) {
        this.f91704a = uVar;
        this.f91705b = m0Var;
        this.f91706c = bVar;
    }

    public void a(sb.m0 m0Var, long j11) {
        Runnable runnableRemove = this.f91707d.remove(m0Var.id);
        if (runnableRemove != null) {
            this.f91705b.a(runnableRemove);
        }
        RunnableC1957a runnableC1957a = new RunnableC1957a(m0Var);
        this.f91707d.put(m0Var.id, runnableC1957a);
        this.f91705b.b(j11 - this.f91706c.currentTimeMillis(), runnableC1957a);
    }

    public void b(String str) {
        Runnable runnableRemove = this.f91707d.remove(str);
        if (runnableRemove != null) {
            this.f91705b.a(runnableRemove);
        }
    }
}
