package j90;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.FlowKt;
import o4.q0;
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
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lj90/b;", "", "Lo4/q0;", "textInputService", "Lr2/y3;", "", "isKeyboardVisible", "<init>", "(Lo4/q0;Lr2/y3;)V", "Ljn0/h0;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "a", "Lo4/q0;", "Lr2/y3;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83131c = q0.f96457c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q0 textInputService;

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
            return (Boolean) b.this.isKeyboardVisible.getValue();
        }
    }

    /* JADX INFO: renamed from: j90.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetKeyboardHandler$awaitKeyboardDismissed$3", f = "StripeBottomSheetKeyboardHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1750b extends SuspendLambda implements p<Boolean, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83135n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ boolean f83136o;

        C1750b(Continuation<? super C1750b> continuation) {
            super(2, continuation);
        }

        public final Object a(boolean z11, Continuation<? super Boolean> continuation) {
            return ((C1750b) create(Boolean.valueOf(z11), continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C1750b c1750b = new C1750b(continuation);
            c1750b.f83136o = ((Boolean) obj).booleanValue();
            return c1750b;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f83135n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return Boxing.boxBoolean(!this.f83136o);
        }
    }

    public b(q0 q0Var, y3<Boolean> isKeyboardVisible) {
        s.k(isKeyboardVisible, "isKeyboardVisible");
        this.textInputService = q0Var;
        this.isKeyboardVisible = isKeyboardVisible;
    }

    private final Object b(Continuation<? super h0> continuation) {
        Object objFirst = FlowKt.first(n3.p(new a()), new C1750b(null), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : h0.f84049a;
    }

    public final Object c(Continuation<? super h0> continuation) {
        if (!this.isKeyboardVisible.getValue().booleanValue()) {
            return h0.f84049a;
        }
        q0 q0Var = this.textInputService;
        if (q0Var != null) {
            q0Var.b();
        }
        Object objB = b(continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
    }
}
