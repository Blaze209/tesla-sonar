package q1;

import b4.s1;
import b4.t1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\n*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lq1/v;", "Lb4/m;", "Li3/c;", "Lb4/s1;", "Lb4/t;", "Li3/n;", "Lu1/l;", "interactionSource", "<init>", "(Lu1/l;)V", "Ljn0/h0;", "D2", "Li3/o;", "focusState", "y", "(Li3/o;)V", "Lg4/y;", "G0", "(Lg4/y;)V", "Lz3/v;", "coordinates", "P", "(Lz3/v;)V", "", "p", "Z", "c2", "()Z", "shouldAutoInvalidate", "q", "Li3/o;", "Lq1/u;", "r", "Lq1/u;", "focusableInteractionNode", "Lq1/w;", "s", "Lq1/w;", "focusablePinnableContainer", "Lq1/y;", "t", "Lq1/y;", "focusedBoundsNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v extends b4.m implements i3.c, s1, b4.t, i3.n {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private i3.o focusState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final u focusableInteractionNode;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final w focusablePinnableContainer = (w) x2(new w());

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final y focusedBoundsNode = (y) x2(new y());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.q.a(v.this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f104347n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return v.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f104347n;
            if (i11 == 0) {
                jn0.t.b(obj);
                v vVar = v.this;
                this.f104347n = 1;
                if (z1.f.b(vVar, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public v(u1.l lVar) {
        this.focusableInteractionNode = (u) x2(new u(lVar));
        x2(i3.r.a());
    }

    public final void D2(u1.l interactionSource) {
        this.focusableInteractionNode.A2(interactionSource);
    }

    @Override // b4.s1
    public void G0(g4.y yVar) {
        i3.o oVar = this.focusState;
        boolean z11 = false;
        if (oVar != null && oVar.isFocused()) {
            z11 = true;
        }
        g4.v.f0(yVar, z11);
        g4.v.T(yVar, null, new a(), 1, null);
    }

    @Override // b4.t
    public void P(z3.v coordinates) {
        this.focusedBoundsNode.P(coordinates);
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // i3.c
    public void y(i3.o focusState) {
        if (p013kotlin.jvm.internal.s.f(this.focusState, focusState)) {
            return;
        }
        boolean zIsFocused = focusState.isFocused();
        if (zIsFocused) {
            BuildersKt__Builders_commonKt.launch$default(X1(), null, null, new b(null), 3, null);
        }
        if (getIsAttached()) {
            t1.b(this);
        }
        this.focusableInteractionNode.z2(zIsFocused);
        this.focusedBoundsNode.z2(zIsFocused);
        this.focusablePinnableContainer.y2(zIsFocused);
        this.focusState = focusState;
    }
}
