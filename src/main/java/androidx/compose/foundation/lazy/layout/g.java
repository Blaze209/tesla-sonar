package androidx.compose.foundation.lazy.layout;

import b4.s1;
import b4.t1;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;
import g4.ScrollAxisRange;
import g4.v;
import g4.y;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p021s1.p;
import p024x1.f0;
import p024x1.t;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/layout/g;", "Landroidx/compose/ui/d$c;", "Lb4/s1;", "Lkotlin/Function0;", "Lx1/t;", "itemProviderLambda", "Lx1/f0;", "state", "Ls1/p;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(Lwn0/a;Lx1/f0;Ls1/p;ZZ)V", "Ljn0/h0;", "C2", "()V", "B2", "Lg4/y;", "G0", "(Lg4/y;)V", "n", "Lwn0/a;", "o", "Lx1/f0;", "p", "Ls1/p;", "q", "Z", "r", "Lg4/j;", "s", "Lg4/j;", "scrollAxisRange", "Lkotlin/Function1;", "", "", "t", "Lwn0/l;", "indexForKeyMapping", "u", "scrollToIndexAction", "A2", "()Z", "isVertical", "Lg4/b;", "z2", "()Lg4/b;", "collectionInfo", "c2", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g extends androidx.compose.ui.d.c implements s1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private wn0.a<? extends t> itemProviderLambda;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private f0 state;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private p orientation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean userScrollEnabled;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange scrollAxisRange;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final l<Object, Integer> indexForKeyMapping = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private l<? super Integer, Boolean> scrollToIndexAction;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Float> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.state.f() - g.this.state.a());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "needle", "", "b", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements l<Object, Integer> {
        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            t tVar = (t) g.this.itemProviderLambda.invoke();
            int iA = tVar.a();
            int i11 = 0;
            while (i11 < iA) {
                if (s.f(tVar.c(i11), obj)) {
                    return Integer.valueOf(i11);
                }
                i11++;
            }
            i11 = -1;
            return Integer.valueOf(i11);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<Float> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.state.c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<Float> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.state.d());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements l<Integer, Boolean> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f4800n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ g f4801o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ int f4802p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, int i11, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f4801o = gVar;
                this.f4802p = i11;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f4801o, this.f4802p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f4800n;
                if (i11 == 0) {
                    jn0.t.b(obj);
                    f0 f0Var = this.f4801o.state;
                    int i12 = this.f4802p;
                    this.f4800n = 1;
                    if (f0Var.b(i12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        e() {
            super(1);
        }

        public final Boolean a(int i11) {
            t tVar = (t) g.this.itemProviderLambda.invoke();
            if (i11 >= 0 && i11 < tVar.a()) {
                BuildersKt__Builders_commonKt.launch$default(g.this.X1(), null, null, new a(g.this, i11, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i11 + ", it is out of bounds [0, " + tVar.a() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public g(wn0.a<? extends t> aVar, f0 f0Var, p pVar, boolean z11, boolean z12) {
        this.itemProviderLambda = aVar;
        this.state = f0Var;
        this.orientation = pVar;
        this.userScrollEnabled = z11;
        this.reverseScrolling = z12;
        C2();
    }

    private final boolean A2() {
        return this.orientation == p.Vertical;
    }

    private final void C2() {
        this.scrollAxisRange = new ScrollAxisRange(new c(), new d(), this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new e() : null;
    }

    private final g4.b z2() {
        return this.state.e();
    }

    public final void B2(wn0.a<? extends t> itemProviderLambda, f0 state, p orientation, boolean userScrollEnabled, boolean reverseScrolling) {
        this.itemProviderLambda = itemProviderLambda;
        this.state = state;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            t1.b(this);
        }
        if (this.userScrollEnabled == userScrollEnabled && this.reverseScrolling == reverseScrolling) {
            return;
        }
        this.userScrollEnabled = userScrollEnabled;
        this.reverseScrolling = reverseScrolling;
        C2();
        t1.b(this);
    }

    @Override // b4.s1
    public void G0(y yVar) {
        v.z0(yVar, true);
        v.w(yVar, this.indexForKeyMapping);
        if (A2()) {
            ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
            if (scrollAxisRange == null) {
                s.B("scrollAxisRange");
                scrollAxisRange = null;
            }
            v.B0(yVar, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.scrollAxisRange;
            if (scrollAxisRange2 == null) {
                s.B("scrollAxisRange");
                scrollAxisRange2 = null;
            }
            v.g0(yVar, scrollAxisRange2);
        }
        l<? super Integer, Boolean> lVar = this.scrollToIndexAction;
        if (lVar != null) {
            v.Y(yVar, null, lVar, 1, null);
        }
        v.s(yVar, null, new a(), 1, null);
        v.Z(yVar, z2());
    }

    @Override // androidx.compose.ui.d.c
    /* JADX INFO: renamed from: c2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }
}
