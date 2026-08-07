package p019p1;

import androidx.compose.ui.platform.k1;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.h1;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "a", "(Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "R"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    static final class a<R> extends SuspendLambda implements l<Continuation<? super R>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f100437n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ l<Long, R> f100438o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super Long, ? extends R> lVar, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f100438o = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return new a(this.f100438o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f100437n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            l<Long, R> lVar = this.f100438o;
            this.f100437n = 1;
            Object objC = h1.c(lVar, this);
            return objC == coroutine_suspended ? coroutine_suspended : objC;
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super R> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <R> Object a(l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        k1 k1Var = (k1) continuation.get$context().get(k1.INSTANCE);
        return k1Var == null ? h1.c(lVar, continuation) : k1Var.p(new a(lVar, null), continuation);
    }
}
