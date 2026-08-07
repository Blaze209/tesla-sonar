package y6;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ly6/d;", "Lu6/h;", "Ly6/f;", "delegate", "<init>", "(Lu6/h;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lu6/h;", "Lkotlinx/coroutines/flow/Flow;", "getData", "()Lkotlinx/coroutines/flow/Flow;", "data", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements u6.h<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u6.h<f> delegate;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly6/f;", "it", "<anonymous>", "(Ly6/f;)Ly6/f;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<f, Continuation<? super f>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f125152n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f125153o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<f, Continuation<? super f>, Object> f125154p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super f, ? super Continuation<? super f>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f125154p = pVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Continuation<? super f> continuation) {
            return ((a) create(fVar, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f125154p, continuation);
            aVar.f125153o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f125152n;
            if (i11 == 0) {
                t.b(obj);
                f fVar = (f) this.f125153o;
                p<f, Continuation<? super f>, Object> pVar = this.f125154p;
                this.f125152n = 1;
                obj = pVar.invoke(fVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            f fVar2 = (f) obj;
            s.i(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }
    }

    public d(u6.h<f> delegate) {
        s.k(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // u6.h
    public Object a(p<? super f, ? super Continuation<? super f>, ? extends Object> pVar, Continuation<? super f> continuation) {
        return this.delegate.a(new a(pVar, null), continuation);
    }

    @Override // u6.h
    public Flow<f> getData() {
        return this.delegate.getData();
    }
}
