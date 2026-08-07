package pk0;

import io.ktor.utils.io.g;
import jn0.t;
import ll0.k;
import ll0.w;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, d2 = {"Lpk0/a;", "a", "(Lpk0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", i = {0}, l = {73}, m = "save", n = {"$this$save"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f103151n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f103152o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f103153p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f103152o = obj;
            this.f103153p |= Integer.MIN_VALUE;
            return b.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object a(pk0.a aVar, Continuation<? super pk0.a> continuation) {
        a aVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f103153p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f103153p = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        a aVar3 = aVar2;
        Object objA = aVar3.f103152o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar3.f103153p;
        if (i12 == 0) {
            t.b(objA);
            g content = aVar.e().getContent();
            aVar3.f103151n = aVar;
            aVar3.f103153p = 1;
            objA = g.b.a(content, 0L, aVar3, 1, null);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (pk0.a) aVar3.f103151n;
            t.b(objA);
        }
        return new c(aVar.getClient(), aVar.d(), aVar.e(), w.c((k) objA, 0, 1, null));
    }
}
