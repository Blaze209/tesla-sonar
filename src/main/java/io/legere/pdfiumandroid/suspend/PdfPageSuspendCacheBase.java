package io.legere.pdfiumandroid.suspend;

import com.google.common.cache.d;
import com.google.common.cache.o;
import com.google.common.cache.p;
import java.lang.AutoCloseable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH¤@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/legere/pdfiumandroid/suspend/PdfPageSuspendCacheBase;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "H", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "", "maxSize", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;J)V", "", "pageIndex", "openPageAndText", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Ljn0/h0;", "close", "()V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/google/common/cache/c;", "Lkotlinx/coroutines/Deferred;", "cache", "Lcom/google/common/cache/c;", "pdfiumandroid_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PdfPageSuspendCacheBase<H extends AutoCloseable> implements AutoCloseable {
    private final com.google.common.cache.c<Integer, Deferred<H>> cache;
    private final CoroutineScope scope;

    public PdfPageSuspendCacheBase(CoroutineDispatcher dispatcher, long j11) {
        s.k(dispatcher, "dispatcher");
        this.scope = CoroutineScopeKt.CoroutineScope(dispatcher);
        com.google.common.cache.c<Integer, Deferred<H>> cVarA = d.t().s(j11).u(new o() { // from class: io.legere.pdfiumandroid.suspend.c
            @Override // com.google.common.cache.o
            public final void onRemoval(p pVar) {
                PdfPageSuspendCacheBase._init_$lambda$0(this.f78860a, pVar);
            }
        }).a();
        s.j(cVarA, "build(...)");
        this.cache = cVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(PdfPageSuspendCacheBase pdfPageSuspendCacheBase, p notification) {
        s.k(notification, "notification");
        Deferred deferred = (Deferred) notification.getValue();
        if (deferred != null) {
            if (deferred.isCompleted()) {
                BuildersKt__Builders_commonKt.launch$default(pdfPageSuspendCacheBase.scope, null, null, new PdfPageSuspendCacheBase$removalListener$1$1$1(deferred, null), 3, null);
            } else {
                Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Deferred get$lambda$0(PdfPageSuspendCacheBase pdfPageSuspendCacheBase, Integer num) {
        return BuildersKt__Builders_commonKt.async$default(pdfPageSuspendCacheBase.scope, null, null, new PdfPageSuspendCacheBase$get$deferred$1$1(pdfPageSuspendCacheBase, num, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Deferred get$lambda$1(l lVar, Object obj) {
        return (Deferred) lVar.invoke(obj);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.cache.b();
    }

    public final Object get(int i11, Continuation<? super H> continuation) {
        ConcurrentMap<Integer, Deferred<H>> concurrentMapAsMap = this.cache.asMap();
        Integer numBoxInt = Boxing.boxInt(i11);
        final l lVar = new l() { // from class: io.legere.pdfiumandroid.suspend.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return PdfPageSuspendCacheBase.get$lambda$0(this.f78858a, (Integer) obj);
            }
        };
        return concurrentMapAsMap.computeIfAbsent(numBoxInt, new Function() { // from class: io.legere.pdfiumandroid.suspend.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PdfPageSuspendCacheBase.get$lambda$1(lVar, obj);
            }
        }).await(continuation);
    }

    protected abstract Object openPageAndText(int i11, Continuation<? super H> continuation);

    public /* synthetic */ PdfPageSuspendCacheBase(CoroutineDispatcher coroutineDispatcher, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineDispatcher, (i11 & 2) != 0 ? 64L : j11);
    }
}
