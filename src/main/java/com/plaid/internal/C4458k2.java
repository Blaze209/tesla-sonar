package com.plaid.internal;

import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1", f = "LinkActivityViewModel.kt", i = {0}, l = {90}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class C4458k2 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f47793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4449j2 f47794c;

    /* JADX INFO: renamed from: com.plaid.internal.k2$a */
    @DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$startLinkEventQueue$1$1", f = "LinkActivityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkEvent f47795a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkEvent linkEvent, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f47795a = linkEvent;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f47795a, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return new a(this.f47795a, continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            jn0.t.b(obj);
            X5.a.a(X5.f46812a, "delivering " + this.f47795a);
            Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(this.f47795a);
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4458k2(C4449j2 c4449j2, Continuation<? super C4458k2> continuation) {
        super(2, continuation);
        this.f47794c = c4449j2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        C4458k2 c4458k2 = new C4458k2(this.f47794c, continuation);
        c4458k2.f47793b = obj;
        return c4458k2;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        C4458k2 c4458k2 = new C4458k2(this.f47794c, continuation);
        c4458k2.f47793b = coroutineScope;
        return c4458k2.invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f47792a;
        if (i11 == 0) {
            jn0.t.b(obj);
            coroutineScope = (CoroutineScope) this.f47793b;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f47793b;
            try {
                jn0.t.b(obj);
            } catch (CancellationException unused) {
                X5.a.e(X5.f46812a, "Link event consumer has ended. This is normal at the end of the activity lifecycle.If it occurs at any other time, it may result in loss of link events delivered.");
                return jn0.h0.f84049a;
            }
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            A2 a11 = this.f47794c.f47768e;
            if (a11 == null) {
                p013kotlin.jvm.internal.s.B("linkEventQueue");
                a11 = null;
            }
            DelayedC4581y0 delayedC4581y0 = (DelayedC4581y0) a11.f46200a.poll(200L, TimeUnit.MILLISECONDS);
            LinkEvent linkEvent = delayedC4581y0 != null ? delayedC4581y0.f48222a : null;
            if (linkEvent != null) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(linkEvent, null);
                this.f47793b = coroutineScope;
                this.f47792a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return jn0.h0.f84049a;
    }
}
