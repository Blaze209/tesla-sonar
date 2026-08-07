package mc;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0018\u0010 \u001a\u00060\u001cj\u0002`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0015\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lmc/f;", "Lmc/d;", "Lmc/i;", "strongMemoryCache", "Lmc/j;", "weakMemoryCache", "<init>", "(Lmc/i;Lmc/j;)V", "Lmc/d$b;", Action.KEY_ATTRIBUTE, "Lmc/d$c;", "a", "(Lmc/d$b;)Lmc/d$c;", "value", "Ljn0/h0;", "e", "(Lmc/d$b;Lmc/d$c;)V", "", "b", "(Lmc/d$b;)Z", "", "size", DateTokenConverter.CONVERTER_KEY, "(J)V", "clear", "()V", "Lmc/i;", "Lmc/j;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "c", "Ljava/lang/Object;", "lock", "getSize", "()J", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i strongMemoryCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j weakMemoryCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    public f(i iVar, j jVar) {
        this.strongMemoryCache = iVar;
        this.weakMemoryCache = jVar;
    }

    @Override // mc.d
    public d.Value a(d.Key key) {
        d.Value valueA;
        synchronized (this.lock) {
            try {
                valueA = this.strongMemoryCache.a(key);
                if (valueA == null) {
                    valueA = this.weakMemoryCache.a(key);
                }
                if (valueA != null && !valueA.getImage().getShareable()) {
                    b(key);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return valueA;
    }

    public boolean b(d.Key key) {
        boolean z11;
        synchronized (this.lock) {
            z11 = this.strongMemoryCache.b(key) || this.weakMemoryCache.b(key);
        }
        return z11;
    }

    @Override // mc.d
    public void clear() {
        synchronized (this.lock) {
            this.strongMemoryCache.clear();
            this.weakMemoryCache.clear();
            h0 h0Var = h0.f84049a;
        }
    }

    @Override // mc.d
    public void d(long size) {
        synchronized (this.lock) {
            this.strongMemoryCache.d(size);
            h0 h0Var = h0.f84049a;
        }
    }

    @Override // mc.d
    public void e(d.Key key, d.Value value) {
        synchronized (this.lock) {
            long size = value.getImage().getSize();
            if (size < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + size).toString());
            }
            this.strongMemoryCache.c(key, value.getImage(), value.a(), size);
            h0 h0Var = h0.f84049a;
        }
    }

    @Override // mc.d
    public long getSize() {
        long size;
        synchronized (this.lock) {
            size = this.strongMemoryCache.getSize();
        }
        return size;
    }
}
