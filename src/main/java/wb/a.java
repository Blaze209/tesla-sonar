package wb;

import com.google.common.util.concurrent.s;
import ezvcard.property.Gender;
import java.util.concurrent.Executor;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"I", Gender.OTHER, "Lcom/google/common/util/concurrent/s;", "Lr/a;", "transformation", "Ljava/util/concurrent/Executor;", "executor", "a", "(Lcom/google/common/util/concurrent/s;Lr/a;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/s;", "work-multiprocess_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* JADX INFO: renamed from: wb.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", Gender.OTHER, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.multiprocess.RemoteClientUtilsKt$map$1", f = "RemoteClientUtils.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    static final class C2609a<O> extends SuspendLambda implements p<CoroutineScope, Continuation<? super O>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f121641n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f121642o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ r.a<I, O> f121643p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ s<I> f121644q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2609a(r.a<I, O> aVar, s<I> sVar, Continuation<? super C2609a> continuation) {
            super(2, continuation);
            this.f121643p = aVar;
            this.f121644q = sVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C2609a(this.f121643p, this.f121644q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            r.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f121642o;
            if (i11 == 0) {
                t.b(obj);
                r.a aVar2 = this.f121643p;
                s<I> sVar = this.f121644q;
                this.f121641n = aVar2;
                this.f121642o = 1;
                Object objA = androidx.concurrent.futures.e.a(sVar, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = aVar2;
                obj = objA;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (r.a) this.f121641n;
                t.b(obj);
            }
            return aVar.apply(obj);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super O> continuation) {
            return ((C2609a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <I, O> s<O> a(s<I> sVar, r.a<I, O> transformation, Executor executor) {
        p013kotlin.jvm.internal.s.k(sVar, "<this>");
        p013kotlin.jvm.internal.s.k(transformation, "transformation");
        p013kotlin.jvm.internal.s.k(executor, "executor");
        return androidx.concurrent.futures.g.f6458a.b(ExecutorsKt.from(executor), false, new C2609a(transformation, sVar, null));
    }
}
