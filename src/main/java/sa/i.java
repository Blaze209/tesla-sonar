package sa;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import jn0.h0;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0010H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0004\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096A¢\u0006\u0004\b\u0004\u0010!J\u001a\u0010\"\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\b\"\u0010 J\u001a\u0010#\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\"\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u0002018\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lsa/i;", "Lya/b;", "Lkotlinx/coroutines/sync/Mutex;", "delegate", "lock", "<init>", "(Lya/b;Lkotlinx/coroutines/sync/Mutex;)V", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "n", "(Lkotlin/coroutines/CoroutineContext;)Lsa/i;", "o", "()Lsa/i;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "Ljn0/h0;", "c", "(Ljava/lang/StringBuilder;)V", "", "toString", "()Ljava/lang/String;", "sql", "Lya/d;", "L1", "(Ljava/lang/String;)Lya/d;", "close", "()V", "", "owner", "", "holdsLock", "(Ljava/lang/Object;)Z", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryLock", "unlock", "(Ljava/lang/Object;)V", "a", "Lya/b;", "b", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/coroutines/CoroutineContext;", "acquireCoroutineContext", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Throwable;", "acquireThrowable", "isLocked", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onLock", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class i implements ya.b, Mutex {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ya.b delegate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mutex lock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private CoroutineContext acquireCoroutineContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Throwable acquireThrowable;

    public i(ya.b delegate, Mutex lock) {
        s.k(delegate, "delegate");
        s.k(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
    }

    @Override // ya.b
    public ya.d L1(String sql) {
        s.k(sql, "sql");
        return this.delegate.L1(sql);
    }

    public final void c(StringBuilder builder) {
        s.k(builder, "builder");
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
            return;
        }
        builder.append("\t\tStatus: Acquired connection");
        builder.append('\n');
        CoroutineContext coroutineContext = this.acquireCoroutineContext;
        if (coroutineContext != null) {
            builder.append("\t\tCoroutine: " + coroutineContext);
            builder.append('\n');
        }
        Throwable th2 = this.acquireThrowable;
        if (th2 != null) {
            builder.append("\t\tAcquired:");
            builder.append('\n');
            Iterator it = v.i0(t.F0(jn0.g.b(th2)), 1).iterator();
            while (it.hasNext()) {
                builder.append("\t\t" + ((String) it.next()));
                builder.append('\n');
            }
        }
    }

    @Override // ya.b, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public SelectClause2<Object, Mutex> getOnLock() {
        return this.lock.getOnLock();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object owner) {
        s.k(owner, "owner");
        return this.lock.holdsLock(owner);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return this.lock.isLocked();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, Continuation<? super h0> continuation) {
        return this.lock.lock(obj, continuation);
    }

    public final i n(CoroutineContext context) {
        s.k(context, "context");
        this.acquireCoroutineContext = context;
        this.acquireThrowable = new Throwable();
        return this;
    }

    public final i o() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    public String toString() {
        return this.delegate.toString();
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object owner) {
        return this.lock.tryLock(owner);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object owner) {
        this.lock.unlock(owner);
    }

    public /* synthetic */ i(ya.b bVar, Mutex mutex, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i11 & 2) != 0 ? MutexKt.Mutex$default(false, 1, null) : mutex);
    }
}
