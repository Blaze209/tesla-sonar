package o7;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\nB%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u000fJ!\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010%¨\u0006'"}, d2 = {"Lo7/f;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "Ljava/lang/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "closeable", "Ljn0/h0;", "g", "(Ljava/lang/AutoCloseable;)V", "f", "", Action.KEY_ATTRIBUTE, "e", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", DateTokenConverter.CONVERTER_KEY, "T", "h", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Lo7/e;", "a", "Lo7/e;", "lock", "", "b", "Ljava/util/Map;", "keyToCloseables", "", "c", "Ljava/util/Set;", "", "Z", "isCleared", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e lock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, AutoCloseable> keyToCloseables;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<AutoCloseable> closeables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isCleared;

    public f() {
        this.lock = new e();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                z6.b.a(closeable);
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public final void d(AutoCloseable closeable) {
        s.k(closeable, "closeable");
        if (this.isCleared) {
            g(closeable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(closeable);
            h0 h0Var = h0.f84049a;
        }
    }

    public final void e(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        s.k(key, "key");
        s.k(closeable, "closeable");
        if (this.isCleared) {
            g(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        g(autoCloseable);
    }

    public final void f() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    g((AutoCloseable) it.next());
                }
                Iterator it2 = this.closeables.iterator();
                while (it2.hasNext()) {
                    g((AutoCloseable) it2.next());
                }
                this.closeables.clear();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final <T extends AutoCloseable> T h(String key) {
        T t11;
        s.k(key, "key");
        synchronized (this.lock) {
            t11 = (T) this.keyToCloseables.get(key);
        }
        return t11;
    }

    public f(CoroutineScope viewModelScope) {
        s.k(viewModelScope, "viewModelScope");
        this.lock = new e();
        this.keyToCloseables = new LinkedHashMap();
        this.closeables = new LinkedHashSet();
        e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", b.a(viewModelScope));
    }

    public f(AutoCloseable... closeables) {
        s.k(closeables, "closeables");
        this.lock = new e();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        v.F(linkedHashSet, closeables);
    }

    public f(CoroutineScope viewModelScope, AutoCloseable... closeables) {
        s.k(viewModelScope, "viewModelScope");
        s.k(closeables, "closeables");
        this.lock = new e();
        this.keyToCloseables = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.closeables = linkedHashSet;
        e("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", b.a(viewModelScope));
        v.F(linkedHashSet, closeables);
    }
}
