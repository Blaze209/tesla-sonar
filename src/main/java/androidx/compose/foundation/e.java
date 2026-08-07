package androidx.compose.foundation;

import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p021s1.a0;
import q1.e0;
import v3.f0;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/e;", "Landroidx/compose/foundation/a;", "Lu1/l;", "interactionSource", "Lq1/e0;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Lg4/i;", "role", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "<init>", "(Lu1/l;Lq1/e0;ZLjava/lang/String;Lg4/i;Lwn0/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lv3/f0;", "K2", "(Lv3/f0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "X2", "(Lu1/l;Lq1/e0;ZLjava/lang/String;Lg4/i;Lwn0/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class e extends androidx.compose.foundation.a {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/q;", "Lj3/g;", "offset", "Ljn0/h0;", "<anonymous>", "(Ls1/q;Lj3/g;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", i = {}, l = {636}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements q<p021s1.q, j3.g, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4278n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4279o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ long f4280p;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object a(p021s1.q qVar, long j11, Continuation<? super h0> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f4279o = qVar;
            aVar.f4280p = j11;
            return aVar.invokeSuspend(h0.f84049a);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(p021s1.q qVar, j3.g gVar, Continuation<? super h0> continuation) {
            return a(qVar, gVar.getPackedValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4278n;
            if (i11 == 0) {
                t.b(obj);
                p021s1.q qVar = (p021s1.q) this.f4279o;
                long j11 = this.f4280p;
                if (e.this.getEnabled()) {
                    e eVar = e.this;
                    this.f4278n = 1;
                    if (eVar.R2(qVar, j11, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<j3.g, h0> {
        b() {
            super(1);
        }

        public final void a(long j11) {
            if (e.this.getEnabled()) {
                e.this.Q2().invoke();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(j3.g gVar) {
            a(gVar.getPackedValue());
            return h0.f84049a;
        }
    }

    public /* synthetic */ e(u1.l lVar, e0 e0Var, boolean z11, String str, g4.i iVar, wn0.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, e0Var, z11, str, iVar, aVar);
    }

    static /* synthetic */ Object W2(e eVar, f0 f0Var, Continuation<? super h0> continuation) {
        Object objH = a0.h(f0Var, eVar.new a(null), eVar.new b(), continuation);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : h0.f84049a;
    }

    @Override // androidx.compose.foundation.a
    public Object K2(f0 f0Var, Continuation<? super h0> continuation) {
        return W2(this, f0Var, continuation);
    }

    public final void X2(u1.l interactionSource, e0 indicationNodeFactory, boolean enabled, String onClickLabel, g4.i role, wn0.a<h0> onClick) {
        V2(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
    }

    private e(u1.l lVar, e0 e0Var, boolean z11, String str, g4.i iVar, wn0.a<h0> aVar) {
        super(lVar, e0Var, z11, str, iVar, aVar, null);
    }
}
