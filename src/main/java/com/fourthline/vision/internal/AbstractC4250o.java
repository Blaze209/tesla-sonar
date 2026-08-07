package com.fourthline.vision.internal;

import java.io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.vision.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4250o extends AbstractFlow implements Closeable, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Channel f38677a = ChannelKt.Channel$default(0, null, null, 7, null);

    /* JADX INFO: renamed from: com.fourthline.vision.internal.o$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f38678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38679b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f38681d;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f38679b = obj;
            this.f38681d |= Integer.MIN_VALUE;
            return AbstractC4250o.collectSafely$suspendImpl(AbstractC4250o.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.fourthline.vision.internal.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.fourthline.vision.internal.o] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.fourthline.vision.internal.o] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, jn0.h0] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    static /* synthetic */ <T> Object collectSafely$suspendImpl(AbstractC4250o abstractC4250o, FlowCollector<? super T> flowCollector, Continuation<? super jn0.h0> continuation) {
        a aVar;
        ?? r11;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f38681d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f38681d = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f38679b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f38681d;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                abstractC4250o.onStart();
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(((AbstractC4250o) abstractC4250o).f38677a);
                aVar.f38678a = abstractC4250o;
                aVar.f38681d = 1;
                r11 = abstractC4250o;
                if (FlowKt.emitAll(flowCollector, flowConsumeAsFlow, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4250o abstractC4250o2 = (AbstractC4250o) aVar.f38678a;
                jn0.t.b(obj);
                r11 = abstractC4250o2;
            }
            r11.onStop();
            abstractC4250o = jn0.h0.f84049a;
            return abstractC4250o;
        } catch (Throwable th2) {
            abstractC4250o.onStop();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SendChannel.DefaultImpls.close$default(this.f38677a, null, 1, null);
        CoroutineScopeKt.cancel$default(this, null, 1, null);
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object collectSafely(FlowCollector<Object> flowCollector, Continuation<? super jn0.h0> continuation) {
        return collectSafely$suspendImpl(this, flowCollector, continuation);
    }

    public final Object emit(Object obj, Continuation<? super jn0.h0> continuation) {
        Object objSend = this.f38677a.send(obj, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : jn0.h0.f84049a;
    }

    public abstract void onStart();

    public abstract void onStop();
}
