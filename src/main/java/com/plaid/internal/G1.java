package com.plaid.internal;

import com.plaid.internal.link.LinkActivity;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.link.LinkActivity$openOutOfProcessWebview$1", f = "LinkActivity.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
public final class G1 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f46320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkActivity f46321b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(LinkActivity linkActivity, Continuation<? super G1> continuation) {
        super(2, continuation);
        this.f46321b = linkActivity;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new G1(this.f46321b, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new G1(this.f46321b, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f46320a;
        if (i11 == 0) {
            jn0.t.b(obj);
            C4594z4 c4594z4A = LinkActivity.a(this.f46321b);
            this.f46320a = 1;
            obj = c4594z4A.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        String str = (String) obj;
        if (str == null) {
            T6.a.a("No uri available in pane storage for Out Of Process WebView");
            LinkActivity.a(this.f46321b).a();
            return jn0.h0.f84049a;
        }
        X5.a.a(X5.f46812a, "Opening Custom Tab for " + str);
        this.f46321b.a(str);
        LinkActivity.a(this.f46321b).c();
        LinkActivity.c(this.f46321b);
        return jn0.h0.f84049a;
    }
}
