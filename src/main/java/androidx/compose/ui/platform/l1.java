package androidx.compose.ui.platform;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "a", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    static final class a<R> extends SuspendLambda implements wn0.l<Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5855n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.l<Long, R> f5856o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super Long, ? extends R> lVar, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f5856o = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return new a(this.f5856o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f5855n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            wn0.l<Long, R> lVar = this.f5856o;
            this.f5855n = 1;
            Object objC = p020r2.h1.c(lVar, this);
            return objC == coroutine_suspended ? coroutine_suspended : objC;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super R> continuation) {
            return ((a) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public static final <R> Object a(wn0.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        k1 k1Var = (k1) continuation.get$context().get(k1.INSTANCE);
        return k1Var == null ? p020r2.h1.c(lVar, continuation) : k1Var.p(new a(lVar, null), continuation);
    }
}
