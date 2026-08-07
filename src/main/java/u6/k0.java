package u6;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lu6/j0;", "a", "(Lu6/j0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lu6/b0;", "", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends SuspendLambda implements wn0.q<b0<T>, Boolean, Continuation<? super T>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115645n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f115646o;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object a(b0<T> b0Var, boolean z11, Continuation<? super T> continuation) {
            a aVar = new a(continuation);
            aVar.f115646o = b0Var;
            return aVar.invokeSuspend(jn0.h0.f84049a);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return a((b0) obj, bool.booleanValue(), (Continuation) obj2);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115645n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                return obj;
            }
            jn0.t.b(obj);
            b0 b0Var = (b0) this.f115646o;
            this.f115645n = 1;
            Object objE = b0Var.e(this);
            return objE == coroutine_suspended ? coroutine_suspended : objE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object a(j0<T> j0Var, Continuation<? super T> continuation) {
        return j0Var.d(new a(null), continuation);
    }
}
