package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.f0;
import b4.b1;
import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u007f\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001e\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\bH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J2\u0010(\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J:\u0010/\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\t0\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J(\u00102\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\f\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u0010\u001bJ\u0017\u00107\u001a\u00020\t2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u00020-H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00042\u0006\u00109\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\u00042\u0006\u00109\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bB\u0010CR*\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010HR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010HR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010HR\"\u0010N\u001a\u00020-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010;R\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR\u001a\u0010U\u001a\u00020R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010S\u001a\u0004\bF\u0010TR\u001a\u0010Y\u001a\u00020V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010W\u001a\u0004\bI\u0010XR\u0018\u0010\\\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010[R\u0014\u0010`\u001a\u00020]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Li3/i;", "Lkotlin/Function1;", "Lkotlin/Function0;", "Ljn0/h0;", "onRequestApplyChangesListener", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/d;", "Lj3/i;", "", "onRequestFocusForOwner", "onMoveFocusInterop", "onClearFocusForOwner", "onFocusRectInterop", "Lw4/t;", "onLayoutDirection", "<init>", "(Lwn0/l;Lwn0/p;Lwn0/l;Lwn0/a;Lwn0/a;Lwn0/a;)V", "u", "()V", "Lb4/j;", "Landroidx/compose/ui/d$c;", "v", "(Lb4/j;)Landroidx/compose/ui/d$c;", "Lt3/b;", "keyEvent", "x", "(Landroid/view/KeyEvent;)Z", "focusDirection", "previouslyFocusedRect", "g", "(Landroidx/compose/ui/focus/d;Lj3/i;)Z", "w", "(ILj3/i;)Z", "q", "force", "r", "(Z)V", "refreshFocusEvents", "clearOwnerFocus", "f", "(ZZZI)Z", "h", "(I)Z", "focusedRect", "Landroidx/compose/ui/focus/FocusTargetNode;", "onFound", "c", "(ILj3/i;Lwn0/l;)Ljava/lang/Boolean;", "onFocusedItem", "n", "(Landroid/view/KeyEvent;Lwn0/a;)Z", DateTokenConverter.CONVERTER_KEY, "Lx3/b;", "event", "k", "(Lx3/b;)Z", "node", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Li3/c;", "l", "(Li3/c;)V", "Li3/j;", IntegerTokenConverter.CONVERTER_KEY, "(Li3/j;)V", "o", "()Lj3/i;", "a", "Lwn0/p;", "b", "Lwn0/l;", "Lwn0/a;", "e", "Landroidx/compose/ui/focus/FocusTargetNode;", "t", "()Landroidx/compose/ui/focus/FocusTargetNode;", "setRootFocusNode$ui_release", "rootFocusNode", "Li3/e;", "Li3/e;", "focusInvalidationManager", "Li3/t;", "Li3/t;", "()Li3/t;", "focusTransactionManager", "Landroidx/compose/ui/d;", "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "modifier", "Landroidx/collection/f0;", "Landroidx/collection/f0;", "keysCurrentlyDown", "Li3/o;", "m", "()Li3/o;", "rootState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusOwnerImpl implements i3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<androidx.compose.ui.focus.d, j3.i, Boolean> onRequestFocusForOwner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<androidx.compose.ui.focus.d, Boolean> onMoveFocusInterop;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onClearFocusForOwner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<j3.i> onFocusRectInterop;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<w4.t> onLayoutDirection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i3.e focusInvalidationManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private f0 keysCurrentlyDown;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private FocusTargetNode rootFocusNode = new FocusTargetNode();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i3.t focusTransactionManager = new i3.t();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.d modifier = m.a(androidx.compose.ui.d.INSTANCE, e.f5335c).g(new s0<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return this.f5339b.getRootFocusNode().hashCode();
        }

        @Override // b4.s0
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public FocusTargetNode getNode() {
            return this.f5339b.getRootFocusNode();
        }

        @Override // b4.s0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void m(FocusTargetNode node) {
        }
    });

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5330a;

        static {
            int[] iArr = new int[i3.a.values().length];
            try {
                iArr[i3.a.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i3.a.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i3.a.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i3.a.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5330a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5331c = new b();

        b() {
            super(0);
        }

        public final void b() {
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class c extends p013kotlin.jvm.internal.p implements wn0.a<h0> {
        c(Object obj) {
            super(0, obj, FocusOwnerImpl.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            o();
            return h0.f84049a;
        }

        public final void o() {
            ((FocusOwnerImpl) this.receiver).u();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f5332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FocusOwnerImpl f5333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<FocusTargetNode, Boolean> f5334e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, wn0.l<? super FocusTargetNode, Boolean> lVar) {
            super(1);
            this.f5332c = focusTargetNode;
            this.f5333d = focusOwnerImpl;
            this.f5334e = lVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            boolean zBooleanValue;
            if (p013kotlin.jvm.internal.s.f(focusTargetNode, this.f5332c)) {
                zBooleanValue = false;
            } else {
                if (p013kotlin.jvm.internal.s.f(focusTargetNode, this.f5333d.getRootFocusNode())) {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                zBooleanValue = this.f5334e.invoke(focusTargetNode).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/k;", "Ljn0/h0;", "a", "(Landroidx/compose/ui/focus/k;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.l<k, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f5335c = new e();

        e() {
            super(1);
        }

        public final void a(k kVar) {
            kVar.r(false);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(k kVar) {
            a(kVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.l<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n0<Boolean> f5336c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5337d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(n0<Boolean> n0Var, int i11) {
            super(1);
            this.f5336c = n0Var;
            this.f5337d = i11;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.f5336c.f86529a = s.k(focusTargetNode, this.f5337d);
            Boolean bool = this.f5336c.f86529a;
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "it", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f5338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11) {
            super(1);
            this.f5338c = i11;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean boolK = s.k(focusTargetNode, this.f5338c);
            return Boolean.valueOf(boolK != null ? boolK.booleanValue() : false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(wn0.l<? super wn0.a<h0>, h0> lVar, wn0.p<? super androidx.compose.ui.focus.d, ? super j3.i, Boolean> pVar, wn0.l<? super androidx.compose.ui.focus.d, Boolean> lVar2, wn0.a<h0> aVar, wn0.a<j3.i> aVar2, wn0.a<? extends w4.t> aVar3) {
        this.onRequestFocusForOwner = pVar;
        this.onMoveFocusInterop = lVar2;
        this.onClearFocusForOwner = aVar;
        this.onFocusRectInterop = aVar2;
        this.onLayoutDirection = aVar3;
        this.focusInvalidationManager = new i3.e(lVar, new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        if (this.rootFocusNode.E2() == i3.p.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    private final androidx.compose.ui.d.c v(b4.j jVar) {
        int iA = b1.a(1024) | b1.a(PKIFailureInfo.certRevoked);
        if (!jVar.getNode().getIsAttached()) {
            y3.a.b("visitLocalDescendants called on an unattached node");
        }
        androidx.compose.ui.d.c node = jVar.getNode();
        androidx.compose.ui.d.c cVar = null;
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            for (androidx.compose.ui.d.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    if ((b1.a(1024) & child.getKindSet()) != 0) {
                        return cVar;
                    }
                    cVar = child;
                }
            }
        }
        return cVar;
    }

    private final boolean x(KeyEvent keyEvent) {
        long jA = t3.d.a(keyEvent);
        int iB = t3.d.b(keyEvent);
        t3.c.Companion companion = t3.c.INSTANCE;
        if (t3.c.e(iB, companion.a())) {
            f0 f0Var = this.keysCurrentlyDown;
            if (f0Var == null) {
                f0Var = new f0(3);
                this.keysCurrentlyDown = f0Var;
            }
            f0Var.l(jA);
        } else if (t3.c.e(iB, companion.b())) {
            f0 f0Var2 = this.keysCurrentlyDown;
            if (f0Var2 == null || !f0Var2.a(jA)) {
                return false;
            }
            f0 f0Var3 = this.keysCurrentlyDown;
            if (f0Var3 != null) {
                f0Var3.m(jA);
            }
        }
        return true;
    }

    @Override // i3.i
    /* JADX INFO: renamed from: b, reason: from getter */
    public i3.t getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // i3.i
    public Boolean c(int focusDirection, j3.i focusedRect, wn0.l<? super FocusTargetNode, Boolean> onFound) {
        FocusTargetNode focusTargetNodeB = t.b(this.rootFocusNode);
        if (focusTargetNodeB != null) {
            o oVarA = t.a(focusTargetNodeB, focusDirection, this.onLayoutDirection.invoke());
            o.Companion companion = o.INSTANCE;
            if (p013kotlin.jvm.internal.s.f(oVarA, companion.a())) {
                return null;
            }
            if (!p013kotlin.jvm.internal.s.f(oVarA, companion.b())) {
                return Boolean.valueOf(oVarA.c(onFound));
            }
        } else {
            focusTargetNodeB = null;
        }
        return t.e(this.rootFocusNode, focusDirection, this.onLayoutDirection.invoke(), focusedRect, new d(focusTargetNodeB, this, onFound));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // i3.i
    public boolean d(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.d(android.view.KeyEvent):boolean");
    }

    @Override // i3.i
    /* JADX INFO: renamed from: e, reason: from getter */
    public androidx.compose.ui.d getModifier() {
        return this.modifier;
    }

    @Override // i3.i
    public boolean f(boolean force, boolean refreshFocusEvents, boolean clearOwnerFocus, int focusDirection) {
        boolean zC;
        i3.t focusTransactionManager = getFocusTransactionManager();
        b bVar = b.f5331c;
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.g();
            }
            focusTransactionManager.f();
            if (bVar != null) {
                focusTransactionManager.cancellationListener.b(bVar);
            }
            if (!force) {
                int i11 = a.f5330a[s.e(this.rootFocusNode, focusDirection).ordinal()];
                zC = (i11 == 1 || i11 == 2 || i11 == 3) ? false : s.c(this.rootFocusNode, force, refreshFocusEvents);
            }
            focusTransactionManager.h();
            if (zC && clearOwnerFocus) {
                this.onClearFocusForOwner.invoke();
            }
            return zC;
        } catch (Throwable th2) {
            focusTransactionManager.h();
            throw th2;
        }
    }

    @Override // i3.i
    public boolean g(androidx.compose.ui.focus.d focusDirection, j3.i previouslyFocusedRect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, previouslyFocusedRect).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
    @Override // i3.f
    public boolean h(int focusDirection) {
        n0 n0Var = new n0();
        n0Var.f86529a = Boolean.FALSE;
        Boolean boolC = c(focusDirection, this.onFocusRectInterop.invoke(), new f(n0Var, focusDirection));
        if (boolC == null || n0Var.f86529a == 0) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (p013kotlin.jvm.internal.s.f(boolC, bool) && p013kotlin.jvm.internal.s.f(n0Var.f86529a, bool)) {
            return true;
        }
        if (j.a(focusDirection)) {
            return f(false, true, false, focusDirection) && w(focusDirection, null);
        }
        return this.onMoveFocusInterop.invoke(androidx.compose.ui.focus.d.i(focusDirection)).booleanValue();
    }

    @Override // i3.i
    public void i(i3.j node) {
        this.focusInvalidationManager.g(node);
    }

    @Override // i3.i
    public void j(FocusTargetNode node) {
        this.focusInvalidationManager.e(node);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // i3.i
    public boolean k(x3.RotaryScrollEvent r15) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.k(x3.b):boolean");
    }

    @Override // i3.i
    public void l(i3.c node) {
        this.focusInvalidationManager.f(node);
    }

    @Override // i3.i
    public i3.o m() {
        return this.rootFocusNode.E2();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0174  */
    /* JADX WARN: Code duplicated, block: B:106:0x0179  */
    /* JADX WARN: Code duplicated, block: B:230:0x031b  */
    /* JADX WARN: Code duplicated, block: B:304:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0170 A[EDGE_INSN: B:305:0x0170->B:103:0x0170 BREAK  A[LOOP:14: B:64:0x00f3->B:309:0x00f3, LOOP_LABEL: LOOP:14: B:64:0x00f3->B:309:0x00f3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x0104 A[ADDED_TO_REGION, LOOP:15: B:67:0x0104->B:95:0x0157, LOOP_START, PHI: r10
      0x0104: PHI (r10v9 androidx.compose.ui.d$c) = (r10v4 androidx.compose.ui.d$c), (r10v10 androidx.compose.ui.d$c) binds: [B:66:0x0102, B:95:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v30, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // i3.i
    public boolean n(android.view.KeyEvent r17, wn0.a<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.n(android.view.KeyEvent, wn0.a):boolean");
    }

    @Override // i3.i
    public j3.i o() {
        FocusTargetNode focusTargetNodeB = t.b(this.rootFocusNode);
        if (focusTargetNodeB != null) {
            return t.d(focusTargetNodeB);
        }
        return null;
    }

    @Override // i3.i
    public void q() {
        i3.t focusTransactionManager = getFocusTransactionManager();
        if (focusTransactionManager.ongoingTransaction) {
            s.c(this.rootFocusNode, true, true);
            return;
        }
        try {
            focusTransactionManager.f();
            s.c(this.rootFocusNode, true, true);
        } finally {
            focusTransactionManager.h();
        }
    }

    @Override // i3.f
    public void r(boolean force) {
        f(force, true, true, androidx.compose.ui.focus.d.INSTANCE.c());
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public boolean w(int focusDirection, j3.i previouslyFocusedRect) {
        Boolean boolC = c(focusDirection, previouslyFocusedRect, new g(focusDirection));
        if (boolC != null) {
            return boolC.booleanValue();
        }
        return false;
    }
}
