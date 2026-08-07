package rk0;

import dl0.n;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jn0.m;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lrk0/b;", "Lrk0/a;", "", "engineName", "<init>", "(Ljava/lang/String;)V", "Ljn0/h0;", "close", "()V", "a", "Ljava/lang/String;", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "n", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "c", "Lkotlin/Lazy;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b implements rk0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f108525d = AtomicIntegerFieldUpdater.newUpdater(b.class, "closed");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String engineName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy coroutineContext;
    private volatile /* synthetic */ int closed;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "b", "()Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<CoroutineContext> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke() {
            return n.b(null, 1, null).plus(b.this.getDispatcher()).plus(new CoroutineName(b.this.engineName + "-context"));
        }
    }

    public b(String engineName) {
        s.k(engineName, "engineName");
        this.engineName = engineName;
        this.closed = 0;
        this.dispatcher = c.a();
        this.coroutineContext = m.b(new a());
    }

    @Override // rk0.a
    public Set<d<?>> Z0() {
        return rk0.a.C2307a.g(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (f108525d.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element element = getCoroutineContext().get(Job.INSTANCE);
            CompletableJob completableJob = element instanceof CompletableJob ? (CompletableJob) element : null;
            if (completableJob == null) {
                return;
            }
            completableJob.complete();
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.coroutineContext.getValue();
    }

    @Override // rk0.a
    public void j3(ok0.a aVar) {
        rk0.a.C2307a.h(this, aVar);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }
}
