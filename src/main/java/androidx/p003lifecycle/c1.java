package androidx.p003lifecycle;

import ch.qos.logback.core.joran.action.Action;
import java.io.Closeable;
import java.util.Arrays;
import jn0.e;
import kotlinx.coroutines.CoroutineScope;
import o7.f;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u001d\b\u0016\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\nB%\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\u0002\u0010\u000bB\u001d\b\u0017\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0007\"\u00020\f¢\u0006\u0004\b\u0002\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0003J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0015\u0010\u0018J!\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0019*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/lifecycle/c1;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "viewModelScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "", "Ljava/lang/AutoCloseable;", "closeables", "([Ljava/lang/AutoCloseable;)V", "(Lkotlinx/coroutines/CoroutineScope;[Ljava/lang/AutoCloseable;)V", "Ljava/io/Closeable;", "([Ljava/io/Closeable;)V", "Ljn0/h0;", "onCleared", "clear$lifecycle_viewmodel_release", "clear", "", Action.KEY_ATTRIBUTE, "closeable", "addCloseable", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "(Ljava/lang/AutoCloseable;)V", "(Ljava/io/Closeable;)V", "T", "getCloseable", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Lo7/f;", "impl", "Lo7/f;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class c1 {
    private final f impl;

    public c1() {
        this.impl = new f();
    }

    public final void addCloseable(String key, AutoCloseable closeable) {
        s.k(key, "key");
        s.k(closeable, "closeable");
        f fVar = this.impl;
        if (fVar != null) {
            fVar.e(key, closeable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        f fVar = this.impl;
        if (fVar != null) {
            fVar.f();
        }
        onCleared();
    }

    public final <T extends AutoCloseable> T getCloseable(String key) {
        s.k(key, "key");
        f fVar = this.impl;
        if (fVar != null) {
            return (T) fVar.h(key);
        }
        return null;
    }

    protected void onCleared() {
    }

    public void addCloseable(AutoCloseable closeable) {
        s.k(closeable, "closeable");
        f fVar = this.impl;
        if (fVar != null) {
            fVar.d(closeable);
        }
    }

    public c1(CoroutineScope viewModelScope) {
        s.k(viewModelScope, "viewModelScope");
        this.impl = new f(viewModelScope);
    }

    @e
    public /* synthetic */ void addCloseable(Closeable closeable) {
        s.k(closeable, "closeable");
        f fVar = this.impl;
        if (fVar != null) {
            fVar.d(closeable);
        }
    }

    public c1(AutoCloseable... closeables) {
        s.k(closeables, "closeables");
        this.impl = new f((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    public c1(CoroutineScope viewModelScope, AutoCloseable... closeables) {
        s.k(viewModelScope, "viewModelScope");
        s.k(closeables, "closeables");
        this.impl = new f(viewModelScope, (AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }

    @e
    public /* synthetic */ c1(Closeable... closeables) {
        s.k(closeables, "closeables");
        this.impl = new f((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }
}
