package androidx.compose.foundation;

import b4.p1;
import b4.t1;
import g4.v;
import g4.y;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p021s1.a0;
import q1.e0;
import v3.f0;
import wn0.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002Bo\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0016\u001a\u00020\u0004*\u00020\u0015H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017Jz\u0010\u0018\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0004*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/f;", "", "Landroidx/compose/foundation/a;", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "", "onLongClickLabel", "onLongClick", "onDoubleClick", "Lu1/l;", "interactionSource", "Lq1/e0;", "indicationNodeFactory", "", "enabled", "onClickLabel", "Lg4/i;", "role", "<init>", "(Lwn0/a;Ljava/lang/String;Lwn0/a;Lwn0/a;Lu1/l;Lq1/e0;ZLjava/lang/String;Lg4/i;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lv3/f0;", "K2", "(Lv3/f0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Y2", "(Lwn0/a;Ljava/lang/String;Lwn0/a;Lwn0/a;Lu1/l;Lq1/e0;ZLjava/lang/String;Lg4/i;)V", "Lg4/y;", "J2", "(Lg4/y;)V", "J", "Ljava/lang/String;", "K", "Lwn0/a;", "L", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class f extends androidx.compose.foundation.a implements p1 {

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private String onLongClickLabel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private wn0.a<h0> onLongClick;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private wn0.a<h0> onDoubleClick;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Boolean> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            wn0.a aVar = f.this.onLongClick;
            if (aVar != null) {
                aVar.invoke();
            }
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.l<j3.g, h0> {
        b() {
            super(1);
        }

        public final void a(long j11) {
            wn0.a aVar = f.this.onDoubleClick;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(j3.g gVar) {
            a(gVar.getPackedValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj3/g;", "it", "Ljn0/h0;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.l<j3.g, h0> {
        c() {
            super(1);
        }

        public final void a(long j11) {
            wn0.a aVar = f.this.onLongClick;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(j3.g gVar) {
            a(gVar.getPackedValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/q;", "Lj3/g;", "offset", "Ljn0/h0;", "<anonymous>", "(Ls1/q;Lj3/g;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.CombinedClickableNodeImpl$clickPointerInput$4", f = "Clickable.kt", i = {}, l = {787}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements q<p021s1.q, j3.g, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4286n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f4287o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ long f4288p;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        public final Object a(p021s1.q qVar, long j11, Continuation<? super h0> continuation) {
            d dVar = f.this.new d(continuation);
            dVar.f4287o = qVar;
            dVar.f4288p = j11;
            return dVar.invokeSuspend(h0.f84049a);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(p021s1.q qVar, j3.g gVar, Continuation<? super h0> continuation) {
            return a(qVar, gVar.getPackedValue(), continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f4286n;
            if (i11 == 0) {
                t.b(obj);
                p021s1.q qVar = (p021s1.q) this.f4287o;
                long j11 = this.f4288p;
                if (f.this.getEnabled()) {
                    f fVar = f.this;
                    this.f4286n = 1;
                    if (fVar.R2(qVar, j11, this) == coroutine_suspended) {
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
    static final class e extends u implements wn0.l<j3.g, h0> {
        e() {
            super(1);
        }

        public final void a(long j11) {
            if (f.this.getEnabled()) {
                f.this.Q2().invoke();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(j3.g gVar) {
            a(gVar.getPackedValue());
            return h0.f84049a;
        }
    }

    public /* synthetic */ f(wn0.a aVar, String str, wn0.a aVar2, wn0.a aVar3, u1.l lVar, e0 e0Var, boolean z11, String str2, g4.i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, aVar2, aVar3, lVar, e0Var, z11, str2, iVar);
    }

    @Override // androidx.compose.foundation.a
    public void J2(y yVar) {
        if (this.onLongClick != null) {
            v.E(yVar, this.onLongClickLabel, new a());
        }
    }

    @Override // androidx.compose.foundation.a
    public Object K2(f0 f0Var, Continuation<? super h0> continuation) {
        Object objI = a0.i(f0Var, (!getEnabled() || this.onDoubleClick == null) ? null : new b(), (!getEnabled() || this.onLongClick == null) ? null : new c(), new d(null), new e(), continuation);
        return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : h0.f84049a;
    }

    public void Y2(wn0.a<h0> onClick, String onLongClickLabel, wn0.a<h0> onLongClick, wn0.a<h0> onDoubleClick, u1.l interactionSource, e0 indicationNodeFactory, boolean enabled, String onClickLabel, g4.i role) {
        boolean z11;
        if (!s.f(this.onLongClickLabel, onLongClickLabel)) {
            this.onLongClickLabel = onLongClickLabel;
            t1.b(this);
        }
        if ((this.onLongClick == null) != (onLongClick == null)) {
            M2();
            t1.b(this);
            z11 = true;
        } else {
            z11 = false;
        }
        this.onLongClick = onLongClick;
        if ((this.onDoubleClick == null) != (onDoubleClick == null)) {
            z11 = true;
        }
        this.onDoubleClick = onDoubleClick;
        boolean z12 = getEnabled() == enabled ? z11 : true;
        V2(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
        if (z12) {
            T2();
        }
    }

    private f(wn0.a<h0> aVar, String str, wn0.a<h0> aVar2, wn0.a<h0> aVar3, u1.l lVar, e0 e0Var, boolean z11, String str2, g4.i iVar) {
        super(lVar, e0Var, z11, str2, iVar, aVar, null);
        this.onLongClickLabel = str;
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
    }
}
