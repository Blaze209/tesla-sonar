package g2;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextLayoutResult;
import j3.m;
import k3.o1;
import k3.t3;
import kotlin.i1;
import p007h2.Selection;
import p007h2.c0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.r2;
import v3.t;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b \u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lg2/g;", "Lr2/r2;", "", "selectableId", "Lh2/c0;", "selectionRegistrar", "Lk3/p1;", "backgroundSelectionColor", "Lg2/i;", "params", "<init>", "(JLh2/c0;JLg2/i;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/h0;", "onRemembered", "()V", "onForgotten", "onAbandoned", "Li4/m0;", "textLayoutResult", "e", "(Li4/m0;)V", "Lz3/v;", "coordinates", DateTokenConverter.CONVERTER_KEY, "(Lz3/v;)V", "Lm3/f;", "drawScope", "b", "(Lm3/f;)V", "a", "J", "Lh2/c0;", "c", "Lg2/i;", "Lh2/k;", "Lh2/k;", "selectable", "Landroidx/compose/ui/d;", "f", "Landroidx/compose/ui/d;", "()Landroidx/compose/ui/d;", "modifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g implements r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 selectionRegistrar;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long backgroundSelectionColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private i params;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private p007h2.k selectable;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.d modifier;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz3/v;", "b", "()Lz3/v;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<v> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v invoke() {
            return g.this.params.getLayoutCoordinates();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz3/v;", "b", "()Lz3/v;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<v> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v invoke() {
            return g.this.params.getLayoutCoordinates();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li4/m0;", "b", "()Li4/m0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<TextLayoutResult> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextLayoutResult invoke() {
            return g.this.params.getTextLayoutResult();
        }
    }

    public /* synthetic */ g(long j11, c0 c0Var, long j12, i iVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, c0Var, j12, iVar);
    }

    public final void b(m3.f drawScope) {
        Selection selectionB = this.selectionRegistrar.g().b(this.selectableId);
        if (selectionB == null) {
            return;
        }
        int offset = !selectionB.getHandlesCrossed() ? selectionB.getStart().getOffset() : selectionB.getEnd().getOffset();
        int offset2 = !selectionB.getHandlesCrossed() ? selectionB.getEnd().getOffset() : selectionB.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        p007h2.k kVar = this.selectable;
        int iA = kVar != null ? kVar.a() : 0;
        t3 t3VarE = this.params.e(n.j(offset, iA), n.j(offset2, iA));
        if (t3VarE == null) {
            return;
        }
        if (!this.params.f()) {
            m3.f.W(drawScope, t3VarE, this.backgroundSelectionColor, BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
            return;
        }
        float fK = m.k(drawScope.b());
        float fI = m.i(drawScope.b());
        int iB = o1.INSTANCE.b();
        m3.d drawContext = drawScope.getDrawContext();
        long jB = drawContext.b();
        drawContext.a().u();
        try {
            drawContext.getTransform().a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fK, fI, iB);
            m3.f.W(drawScope, t3VarE, this.backgroundSelectionColor, BitmapDescriptorFactory.HUE_RED, null, null, 0, 60, null);
        } finally {
            drawContext.a().o();
            drawContext.f(jB);
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final androidx.compose.ui.d getModifier() {
        return this.modifier;
    }

    public final void d(v coordinates) {
        this.params = i.c(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.b(this.selectableId);
    }

    public final void e(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !s.f(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.h(this.selectableId);
        }
        this.params = i.c(this.params, null, textLayoutResult, 1, null);
    }

    @Override // p020r2.r2
    public void onAbandoned() {
        p007h2.k kVar = this.selectable;
        if (kVar != null) {
            this.selectionRegistrar.e(kVar);
            this.selectable = null;
        }
    }

    @Override // p020r2.r2
    public void onForgotten() {
        p007h2.k kVar = this.selectable;
        if (kVar != null) {
            this.selectionRegistrar.e(kVar);
            this.selectable = null;
        }
    }

    @Override // p020r2.r2
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.i(new p007h2.i(this.selectableId, new b(), new c()));
    }

    private g(long j11, c0 c0Var, long j12, i iVar) {
        this.selectableId = j11;
        this.selectionRegistrar = c0Var;
        this.backgroundSelectionColor = j12;
        this.params = iVar;
        this.modifier = t.b(h.b(c0Var, j11, new a()), i1.a(), false, 2, null);
    }

    public /* synthetic */ g(long j11, c0 c0Var, long j12, i iVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, c0Var, j12, (i11 & 8) != 0 ? i.INSTANCE.a() : iVar, null);
    }
}
