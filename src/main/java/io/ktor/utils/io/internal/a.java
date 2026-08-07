package io.ktor.utils.io.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lio/ktor/utils/io/internal/a;", "", "<init>", "()V", "Lkotlin/Function0;", "", "sleepCondition", "e", "(Lwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "c", "", "cause", "b", "(Ljava/lang/Throwable;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f78724a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "suspension");
    private volatile /* synthetic */ Object suspension = null;

    /* JADX INFO: renamed from: io.ktor.utils.io.internal.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", i = {0}, l = {24}, m = "sleep", n = {"this"}, s = {"L$0"})
    static final class C1677a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78725n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f78726o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f78728q;

        C1677a(Continuation<? super C1677a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78726o = obj;
            this.f78728q |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.internal.AwaitingSlot", f = "AwaitingSlot.kt", i = {0}, l = {57}, m = "trySuspend", n = {"suspended"}, s = {"I$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f78729n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f78730o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f78732q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78730o = obj;
            this.f78732q |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(wn0.a<Boolean> aVar, Continuation<? super Boolean> continuation) {
        b bVar;
        int i11;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f78732q;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f78732q = i12 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f78730o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = bVar.f78732q;
        if (i13 == 0) {
            t.b(obj);
            CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            if (androidx.concurrent.futures.b.a(f78724a, this, null, completableJobJob$default) && aVar.invoke().booleanValue()) {
                bVar.f78729n = 1;
                bVar.f78732q = 1;
                if (completableJobJob$default.join(bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i11 = 1;
            } else {
                i11 = 0;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = bVar.f78729n;
            t.b(obj);
        }
        return Boxing.boxBoolean(i11 != 0);
    }

    public final void b(Throwable cause) {
        CompletableJob completableJob = (CompletableJob) f78724a.getAndSet(this, null);
        if (completableJob == null) {
            return;
        }
        if (cause != null) {
            completableJob.completeExceptionally(cause);
        } else {
            completableJob.complete();
        }
    }

    public final void c() {
        CompletableJob completableJob = (CompletableJob) f78724a.getAndSet(this, null);
        if (completableJob != null) {
            completableJob.complete();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(wn0.a<Boolean> aVar, Continuation<? super h0> continuation) {
        C1677a c1677a;
        a aVar2;
        if (continuation instanceof C1677a) {
            c1677a = (C1677a) continuation;
            int i11 = c1677a.f78728q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1677a.f78728q = i11 - Integer.MIN_VALUE;
            } else {
                c1677a = new C1677a(continuation);
            }
        } else {
            c1677a = new C1677a(continuation);
        }
        Object objE = c1677a.f78726o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1677a.f78728q;
        if (i12 == 0) {
            t.b(objE);
            c1677a.f78725n = this;
            c1677a.f78728q = 1;
            objE = e(aVar, c1677a);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) c1677a.f78725n;
            t.b(objE);
        }
        if (((Boolean) objE).booleanValue()) {
            return h0.f84049a;
        }
        aVar2.c();
        return h0.f84049a;
    }
}
