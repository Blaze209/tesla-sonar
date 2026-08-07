package yk0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import tk0.i;
import tk0.j;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\rH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b*\u00020\rH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001b\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lyk0/g;", "", "Lwk0/c;", "builder", "Lok0/a;", "client", "<init>", "(Lwk0/c;Lok0/a;)V", "Ljn0/h0;", "a", "()V", "T", "Lkotlin/Function2;", "Lyk0/c;", "Lkotlin/coroutines/Continuation;", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "b", "(Lyk0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lwk0/c;", "Lok0/a;", "getClient", "()Lok0/a;", "getClient$annotations", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wk0.c builder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ok0.a client;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {126}, m = "cleanup", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f125675n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f125676o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f125678q;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125676o = obj;
            this.f125678q |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 0, 1, 1}, l = {47, 50, 52, 52}, m = "execute", n = {"this", "block", "this", "response"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class b<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f125679n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f125680o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f125681p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f125683r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125681p = obj;
            this.f125683r |= Integer.MIN_VALUE;
            return g.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lyk0/c;", "it", "<anonymous>", "(Lyk0/c;)Lyk0/c;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.client.statement.HttpStatement$execute$4", f = "HttpStatement.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<yk0.c, Continuation<? super yk0.c>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f125684n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f125685o;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(yk0.c cVar, Continuation<? super yk0.c> continuation) {
            return ((c) create(cVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.f125685o = obj;
            return cVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f125684n;
            if (i11 == 0) {
                t.b(obj);
                pk0.a call = ((yk0.c) this.f125685o).getCall();
                this.f125684n = 1;
                obj = pk0.b.a(call, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return ((pk0.a) obj).e();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {108}, m = "executeUnsafe", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f125686n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f125688p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125686n = obj;
            this.f125688p |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    public g(wk0.c builder, ok0.a client) {
        s.k(builder, "builder");
        s.k(client, "client");
        this.builder = builder;
        this.client = client;
        a();
    }

    private final void a() {
        Set setKeySet;
        Map map = (Map) this.builder.getAttributes().a(rk0.e.a());
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<i> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof i) {
                arrayList.add(obj);
            }
        }
        for (i iVar : arrayList) {
            if (j.c(this.client, iVar) == null) {
                throw new IllegalArgumentException(("Consider installing " + iVar + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(yk0.c cVar, Continuation<? super h0> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f125678q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f125678q = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f125676o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f125678q;
        if (i12 == 0) {
            t.b(obj);
            CoroutineContext.Element element = cVar.getCoroutineContext().get(Job.INSTANCE);
            s.h(element);
            CompletableJob completableJob = (CompletableJob) element;
            completableJob.complete();
            try {
                io.ktor.utils.io.i.a(cVar.getContent());
            } catch (Throwable unused) {
            }
            aVar.f125675n = completableJob;
            aVar.f125678q = 1;
            if (completableJob.join(aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return h0.f84049a;
    }

    public final Object c(Continuation<? super yk0.c> continuation) {
        return d(new c(null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r2.b(r11, r0) == r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object d(wn0.p<? super yk0.c, ? super p013kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r10, p013kotlin.coroutines.Continuation<? super T> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof yk0.g.b
            if (r0 == 0) goto L13
            r0 = r11
            yk0.g$b r0 = (yk0.g.b) r0
            int r1 = r0.f125683r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125683r = r1
            goto L18
        L13:
            yk0.g$b r0 = new yk0.g$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f125681p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f125683r
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L66
            if (r2 == r7) goto L5a
            if (r2 == r6) goto L49
            if (r2 == r5) goto L43
            if (r2 == r4) goto L37
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r0.f125679n
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            jn0.t.b(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto La5
        L40:
            r10 = move-exception
            goto La6
        L43:
            java.lang.Object r10 = r0.f125679n
            jn0.t.b(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            return r10
        L49:
            java.lang.Object r10 = r0.f125680o
            yk0.c r10 = (yk0.c) r10
            java.lang.Object r2 = r0.f125679n
            yk0.g r2 = (yk0.g) r2
            jn0.t.b(r11)     // Catch: java.lang.Throwable -> L55
            goto L89
        L55:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L98
        L5a:
            java.lang.Object r10 = r0.f125680o
            wn0.p r10 = (wn0.p) r10
            java.lang.Object r2 = r0.f125679n
            yk0.g r2 = (yk0.g) r2
            jn0.t.b(r11)     // Catch: java.util.concurrent.CancellationException -> L40
            goto L77
        L66:
            jn0.t.b(r11)
            r0.f125679n = r9     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f125680o = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f125683r = r7     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r9.e(r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto L76
            goto La4
        L76:
            r2 = r9
        L77:
            yk0.c r11 = (yk0.c) r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f125679n = r2     // Catch: java.lang.Throwable -> L97
            r0.f125680o = r11     // Catch: java.lang.Throwable -> L97
            r0.f125683r = r6     // Catch: java.lang.Throwable -> L97
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch: java.lang.Throwable -> L97
            if (r10 != r1) goto L86
            goto La4
        L86:
            r8 = r11
            r11 = r10
            r10 = r8
        L89:
            r0.f125679n = r11     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f125680o = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f125683r = r5     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r10 = r2.b(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r10 != r1) goto L96
            goto La4
        L96:
            return r11
        L97:
            r10 = move-exception
        L98:
            r0.f125679n = r10     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f125680o = r3     // Catch: java.util.concurrent.CancellationException -> L40
            r0.f125683r = r4     // Catch: java.util.concurrent.CancellationException -> L40
            java.lang.Object r11 = r2.b(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L40
            if (r11 != r1) goto La5
        La4:
            return r1
        La5:
            throw r10     // Catch: java.util.concurrent.CancellationException -> L40
        La6:
            java.lang.Throwable r10 = p028zk0.d.a(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yk0.g.d(wn0.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Continuation<? super yk0.c> continuation) throws Throwable {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f125688p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f125688p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objC = dVar.f125686n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f125688p;
        try {
            if (i12 == 0) {
                t.b(objC);
                wk0.c cVarP = new wk0.c().p(this.builder);
                ok0.a aVar = this.client;
                dVar.f125688p = 1;
                objC = aVar.c(cVarP, dVar);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(objC);
            }
            return ((pk0.a) objC).e();
        } catch (CancellationException e11) {
            throw p028zk0.d.a(e11);
        }
    }

    public String toString() {
        return "HttpStatement[" + this.builder.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String() + ']';
    }
}
