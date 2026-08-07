package fe;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedList;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lfe/b;", "Lfe/a;", "Lde/a$a;", "<init>", "()V", "event", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lde/a$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "size", "", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "events", "c", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "list", "Lkotlinx/coroutines/sync/Mutex;", "b", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements fe.a<de.a.Info> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LinkedList<de.a.Info> list = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.data.local.InfoAnalyticsLocalDataStore", f = "InfoAnalyticsLocalDataStore.kt", i = {0, 0, 0}, l = {43}, m = "fetchEvents", n = {"this", "$this$withLock_u24default$iv", "size"}, s = {"L$0", "L$1", "I$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f65746n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f65747o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f65748p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f65749q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f65751s;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f65749q = obj;
            this.f65751s |= Integer.MIN_VALUE;
            return b.this.a(0, this);
        }
    }

    /* JADX INFO: renamed from: fe.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.data.local.InfoAnalyticsLocalDataStore", f = "InfoAnalyticsLocalDataStore.kt", i = {0, 0, 0}, l = {43}, m = "removeEvents", n = {"this", "events", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class C1341b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f65752n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f65753o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f65754p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f65755q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f65757s;

        C1341b(Continuation<? super C1341b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f65755q = obj;
            this.f65757s |= Integer.MIN_VALUE;
            return b.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.data.local.InfoAnalyticsLocalDataStore", f = "InfoAnalyticsLocalDataStore.kt", i = {0, 0, 0}, l = {43}, m = "storeEvent", n = {"this", "event", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f65758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f65759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f65760p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f65761q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f65763s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f65761q = obj;
            this.f65763s |= Integer.MIN_VALUE;
            return b.this.b(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fe.a
    public Object a(int i11, Continuation<? super List<? extends de.a.Info>> continuation) {
        a aVar;
        b bVar;
        Mutex mutex;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f65751s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f65751s = i12 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f65749q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = aVar.f65751s;
        if (i13 == 0) {
            t.b(obj);
            Mutex mutex2 = this.mutex;
            aVar.f65746n = this;
            aVar.f65747o = mutex2;
            aVar.f65748p = i11;
            aVar.f65751s = 1;
            if (mutex2.lock(null, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = this;
            mutex = mutex2;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = aVar.f65748p;
            mutex = (Mutex) aVar.f65747o;
            bVar = (b) aVar.f65746n;
            t.b(obj);
        }
        try {
            return v.e1(bVar.list, i11);
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fe.a
    public Object c(List<? extends de.a.Info> list, Continuation<? super h0> continuation) {
        C1341b c1341b;
        Mutex mutex;
        b bVar;
        if (continuation instanceof C1341b) {
            c1341b = (C1341b) continuation;
            int i11 = c1341b.f65757s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1341b.f65757s = i11 - Integer.MIN_VALUE;
            } else {
                c1341b = new C1341b(continuation);
            }
        } else {
            c1341b = new C1341b(continuation);
        }
        Object obj = c1341b.f65755q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1341b.f65757s;
        if (i12 == 0) {
            t.b(obj);
            mutex = this.mutex;
            c1341b.f65752n = this;
            c1341b.f65753o = list;
            c1341b.f65754p = mutex;
            c1341b.f65757s = 1;
            if (mutex.lock(null, c1341b) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) c1341b.f65754p;
            List<? extends de.a.Info> list2 = (List) c1341b.f65753o;
            bVar = (b) c1341b.f65752n;
            t.b(obj);
            mutex = mutex2;
            list = list2;
        }
        try {
            bVar.list.removeAll(v.r1(list));
            return h0.f84049a;
        } finally {
            mutex.unlock(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // fe.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object b(de.a.Info info, Continuation<? super h0> continuation) {
        c cVar;
        Mutex mutex;
        b bVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f65763s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f65763s = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f65761q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f65763s;
        if (i12 == 0) {
            t.b(obj);
            mutex = this.mutex;
            cVar.f65758n = this;
            cVar.f65759o = info;
            cVar.f65760p = mutex;
            cVar.f65763s = 1;
            if (mutex.lock(null, cVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            bVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) cVar.f65760p;
            de.a.Info info2 = (de.a.Info) cVar.f65759o;
            bVar = (b) cVar.f65758n;
            t.b(obj);
            mutex = mutex2;
            info = info2;
        }
        try {
            bVar.list.add(info);
            return h0.f84049a;
        } finally {
            mutex.unlock(null);
        }
    }
}
