package com.plaid.internal;

import com.plaid.link.SubmissionData;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2", f = "PreloadLinkController.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class C4365c6 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4417f6 f46907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f46908d;

    /* JADX INFO: renamed from: com.plaid.internal.c6$a */
    @DebugMetadata(c = "com.plaid.internal.workflow.preload.PreloadLinkController$preloadWebview$2$1", f = "PreloadLinkController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C4417f6 f46909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ U5 f46910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4417f6 c4417f6, U5 u11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f46909a = c4417f6;
            this.f46910b = u11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f46909a, this.f46910b, continuation);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return new a(this.f46909a, this.f46910b, continuation).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            jn0.t.b(obj);
            SubmissionData submissionData = this.f46909a.f47668g;
            if (submissionData == null) {
                return null;
            }
            this.f46910b.a(submissionData.getPhoneNumber(), submissionData.getDateOfBirth());
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4365c6(C4417f6 c4417f6, String str, Continuation<? super C4365c6> continuation) {
        super(2, continuation);
        this.f46907c = c4417f6;
        this.f46908d = str;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        C4365c6 c4365c6 = new C4365c6(this.f46907c, this.f46908d, continuation);
        c4365c6.f46906b = obj;
        return c4365c6;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return ((C4365c6) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46905a;
        if (i11 == 0) {
            jn0.t.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f46906b;
            if (!JobKt.isActive(coroutineScope.getCoroutineContext())) {
                return jn0.h0.f84049a;
            }
            U5 u5B = this.f46907c.f47664c.b();
            if (!JobKt.isActive(coroutineScope.getCoroutineContext())) {
                return jn0.h0.f84049a;
            }
            C4417f6 c4417f6 = this.f46907c;
            C4435h6 listener = c4417f6.f47666e;
            G7 g11 = c4417f6.f47667f;
            String url = this.f46908d;
            g11.getClass();
            p013kotlin.jvm.internal.s.k(url, "uri");
            p013kotlin.jvm.internal.s.k(listener, "interceptor");
            p013kotlin.jvm.internal.s.k(url, "url");
            C4397d4 c4397d4 = u5B.f46742a;
            c4397d4.getClass();
            p013kotlin.jvm.internal.s.k(listener, "listener");
            c4397d4.f47615a = listener;
            u5B.loadUrl(url);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f46907c, u5B, null);
            this.f46905a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        return jn0.h0.f84049a;
    }
}
