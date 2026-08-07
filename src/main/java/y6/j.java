package y6;

import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a>\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu6/h;", "Ly6/f;", "Lkotlin/Function2;", "Ly6/c;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "transform", "a", "(Lu6/h;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6/f;", "it", "<anonymous>", "(Ly6/f;)Ly6/f;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<f, Continuation<? super f>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f125162n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f125163o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<c, Continuation<? super h0>, Object> f125164p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super c, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f125164p = pVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Continuation<? super f> continuation) {
            return ((a) create(fVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f125164p, continuation);
            aVar.f125163o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f125162n;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f125163o;
                t.b(obj);
                return cVar;
            }
            t.b(obj);
            c cVarC = ((f) this.f125163o).c();
            p<c, Continuation<? super h0>, Object> pVar = this.f125164p;
            this.f125163o = cVarC;
            this.f125162n = 1;
            return pVar.invoke(cVarC, this) == coroutine_suspended ? coroutine_suspended : cVarC;
        }
    }

    public static final Object a(u6.h<f> hVar, p<? super c, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super f> continuation) {
        return hVar.a(new a(pVar, null), continuation);
    }
}
