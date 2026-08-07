package qb;

import android.content.Context;
import androidx.work.z;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR0\u0010 \u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001dj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR$\u0010&\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lqb/h;", "T", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lub/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lub/b;)V", "Lob/a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljn0/h0;", "c", "(Lob/a;)V", "f", "e", "()Ljava/lang/Object;", "h", "()V", IntegerTokenConverter.CONVERTER_KEY, "a", "Lub/b;", "b", "Landroid/content/Context;", DateTokenConverter.CONVERTER_KEY, "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "currentState", "newState", "getState", "g", "(Ljava/lang/Object;)V", "state", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ub.b taskExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashSet<ob.a<T>> listeners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private T currentState;

    protected h(Context context, ub.b taskExecutor) {
        s.k(context, "context");
        s.k(taskExecutor, "taskExecutor");
        this.taskExecutor = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.appContext = applicationContext;
        this.lock = new Object();
        this.listeners = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List list, h hVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((ob.a) it.next()).a(hVar.currentState);
        }
    }

    public final void c(ob.a<T> listener) {
        s.k(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.add(listener)) {
                    if (this.listeners.size() == 1) {
                        this.currentState = e();
                        z.e().a(i.f105302a, getClass().getSimpleName() + ": initial state = " + this.currentState);
                        h();
                    }
                    listener.a(this.currentState);
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final Context getAppContext() {
        return this.appContext;
    }

    public abstract T e();

    public final void f(ob.a<T> listener) {
        s.k(listener, "listener");
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                    i();
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(T t11) {
        synchronized (this.lock) {
            T t12 = this.currentState;
            if (t12 == null || !s.f(t12, t11)) {
                this.currentState = t11;
                final List listM1 = v.m1(this.listeners);
                this.taskExecutor.c().execute(new Runnable() { // from class: qb.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(listM1, this);
                    }
                });
                h0 h0Var = h0.f84049a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
