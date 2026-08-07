package z50;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.n3;
import p020r2.y3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lz50/j;", "", "Lkotlin/Function0;", "Ljn0/h0;", "dismissKeyboard", "Lr2/y3;", "", "isKeyboardVisible", "<init>", "(Lwn0/a;Lr2/y3;)V", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "a", "Lwn0/a;", "Lr2/y3;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> dismissKeyboard;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y3<Boolean> isKeyboardVisible;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<Boolean> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return (Boolean) j.this.isKeyboardVisible.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.utils.KeyboardController$awaitKeyboardDismissed$3", f = "KeyboardController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<Boolean, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f127001n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ boolean f127002o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z11, Continuation<? super Boolean> continuation) {
            return ((b) create(Boolean.valueOf(z11), continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.f127002o = ((Boolean) obj).booleanValue();
            return bVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f127001n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(!this.f127002o);
        }
    }

    public j(wn0.a<h0> dismissKeyboard, y3<Boolean> isKeyboardVisible) {
        s.k(dismissKeyboard, "dismissKeyboard");
        s.k(isKeyboardVisible, "isKeyboardVisible");
        this.dismissKeyboard = dismissKeyboard;
        this.isKeyboardVisible = isKeyboardVisible;
    }

    private final Object b(Continuation<? super h0> continuation) {
        Object objFirst = FlowKt.first(n3.p(new a()), new b(null), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : h0.f84049a;
    }

    public final Object c(Continuation<? super h0> continuation) {
        if (!this.isKeyboardVisible.getValue().booleanValue()) {
            return h0.f84049a;
        }
        this.dismissKeyboard.invoke();
        Object objB = b(continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }
}
