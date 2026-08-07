package a40;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.TimeoutKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"T", "Lkotlinx/coroutines/Deferred;", "Lio0/b;", "timeout", "Lkotlin/Function0;", "", AnalyticsAttribute.Error, "Ljn0/s;", "b", "(Lkotlinx/coroutines/Deferred;JLwn0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetLoaderKt", f = "CustomerSheetLoader.kt", i = {0}, l = {185}, m = "awaitAsResult-dWUq8MI", n = {AnalyticsAttribute.Error}, s = {"L$0"})
    static final class a<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f260n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f261o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f262p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f261o = obj;
            this.f262p |= Integer.MIN_VALUE;
            Object objB = c.b(null, 0L, null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.customersheet.CustomerSheetLoaderKt$awaitAsResult$result$1", f = "CustomerSheetLoader.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends SuspendLambda implements p<CoroutineScope, Continuation<? super T>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f263n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Deferred<T> f264o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Deferred<? extends T> deferred, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f264o = deferred;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f264o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f263n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            Deferred<T> deferred = this.f264o;
            this.f263n = 1;
            Object objAwait = deferred.await(this);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object b(Deferred<? extends T> deferred, long j11, wn0.a<String> aVar, Continuation<? super s<? extends T>> continuation) {
        a aVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f262p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f262p = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object objM516withTimeoutOrNullKLykuaI = aVar2.f261o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f262p;
        if (i12 == 0) {
            t.b(objM516withTimeoutOrNullKLykuaI);
            b bVar = new b(deferred, null);
            aVar2.f260n = aVar;
            aVar2.f262p = 1;
            objM516withTimeoutOrNullKLykuaI = TimeoutKt.m516withTimeoutOrNullKLykuaI(j11, bVar, aVar2);
            if (objM516withTimeoutOrNullKLykuaI == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (wn0.a) aVar2.f260n;
            t.b(objM516withTimeoutOrNullKLykuaI);
        }
        if (objM516withTimeoutOrNullKLykuaI != null) {
            return s.b(objM516withTimeoutOrNullKLykuaI);
        }
        s.Companion companion = s.INSTANCE;
        return s.b(t.a(new IllegalStateException(aVar.invoke())));
    }
}
