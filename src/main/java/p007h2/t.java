package p007h2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextLayoutResult;
import i4.p0;
import jn0.m;
import jn0.p;
import kotlin.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a#\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\t*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0011\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001e\u001a\u00020\u0016*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a#\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!¨\u0006$²\u0006\f\u0010\"\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lh2/y;", "Lh2/l;", "info", "Lh2/m$a;", "previousSelectionAnchor", "l", "(Lh2/y;Lh2/l;Lh2/m$a;)Lh2/m$a;", "", "currentRawOffset", "", "isStart", "j", "(Lh2/l;IZ)Z", "currentLine", "currentOffset", "otherOffset", "crossed", "k", "(Lh2/l;IIIZZ)Lh2/m$a;", "layout", "Lh2/c;", "boundaryFunction", "Lh2/m;", "e", "(Lh2/y;Lh2/c;)Lh2/m;", "slot", "f", "(Lh2/l;ZZILh2/c;)Lh2/m$a;", "h", "(Lh2/m;Lh2/y;)Lh2/m;", IntegerTokenConverter.CONVERTER_KEY, "newOffset", "g", "(Lh2/m$a;Lh2/l;I)Lh2/m$a;", "currentRawLine", "anchorSnappedToWordBoundary", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh2/m$a;", "b", "()Lh2/m$a;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Selection.AnchorInfo> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f70360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f70361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f70362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ y f70363f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Lazy<Integer> f70364g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l lVar, int i11, int i12, y yVar, Lazy<Integer> lazy) {
            super(0);
            this.f70360c = lVar;
            this.f70361d = i11;
            this.f70362e = i12;
            this.f70363f = yVar;
            this.f70364g = lazy;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Selection.AnchorInfo invoke() {
            return t.k(this.f70360c, t.m(this.f70364g), this.f70361d, this.f70362e, this.f70363f.getIsStartHandle(), this.f70363f.d() == e.CROSSED);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f70365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f70366d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l lVar, int i11) {
            super(0);
            this.f70365c = lVar;
            this.f70366d = i11;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f70365c.getTextLayoutResult().q(this.f70366d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection e(y yVar, c cVar) {
        boolean z11 = yVar.d() == e.CROSSED;
        return new Selection(f(yVar.g(), z11, true, yVar.getStartSlot(), cVar), f(yVar.f(), z11, false, yVar.getEndSlot(), cVar), z11);
    }

    private static final Selection.AnchorInfo f(l lVar, boolean z11, boolean z12, int i11, c cVar) {
        int rawStartHandleOffset = z12 ? lVar.getRawStartHandleOffset() : lVar.getRawEndHandleOffset();
        if (i11 != lVar.getSlot()) {
            return lVar.a(rawStartHandleOffset);
        }
        long jA = cVar.a(lVar, rawStartHandleOffset);
        return lVar.a(z11 ^ z12 ? p0.n(jA) : p0.i(jA));
    }

    private static final Selection.AnchorInfo g(Selection.AnchorInfo anchorInfo, l lVar, int i11) {
        return Selection.AnchorInfo.b(anchorInfo, lVar.getTextLayoutResult().c(i11), i11, 0L, 4, null);
    }

    public static final Selection h(Selection selection, y yVar) {
        if (z.d(selection, yVar)) {
            return (yVar.getSize() > 1 || yVar.getPreviousSelection() == null || yVar.getInfo().c().length() == 0) ? selection : i(selection, yVar);
        }
        return selection;
    }

    private static final Selection i(Selection selection, y yVar) {
        l lVarB = yVar.getInfo();
        String strC = lVarB.c();
        int rawStartHandleOffset = lVarB.getRawStartHandleOffset();
        int length = strC.length();
        if (rawStartHandleOffset == 0) {
            int iA = h0.a(strC, 0);
            return yVar.getIsStartHandle() ? Selection.b(selection, g(selection.getStart(), lVarB, iA), null, true, 2, null) : Selection.b(selection, null, g(selection.getEnd(), lVarB, iA), false, 1, null);
        }
        if (rawStartHandleOffset == length) {
            int iB = h0.b(strC, length);
            return yVar.getIsStartHandle() ? Selection.b(selection, g(selection.getStart(), lVarB, iB), null, false, 2, null) : Selection.b(selection, null, g(selection.getEnd(), lVarB, iB), true, 1, null);
        }
        Selection selectionE = yVar.getPreviousSelection();
        boolean z11 = selectionE != null && selectionE.getHandlesCrossed();
        int iB2 = yVar.getIsStartHandle() ^ z11 ? h0.b(strC, rawStartHandleOffset) : h0.a(strC, rawStartHandleOffset);
        return yVar.getIsStartHandle() ? Selection.b(selection, g(selection.getStart(), lVarB, iB2), null, z11, 2, null) : Selection.b(selection, null, g(selection.getEnd(), lVarB, iB2), z11, 1, null);
    }

    private static final boolean j(l lVar, int i11, boolean z11) {
        if (lVar.getRawPreviousHandleOffset() == -1) {
            return true;
        }
        if (i11 == lVar.getRawPreviousHandleOffset()) {
            return false;
        }
        if (z11 ^ (lVar.d() == e.CROSSED)) {
            return i11 < lVar.getRawPreviousHandleOffset();
        }
        return i11 > lVar.getRawPreviousHandleOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo k(l lVar, int i11, int i12, int i13, boolean z11, boolean z12) {
        int iU;
        int iP;
        long jC = lVar.getTextLayoutResult().C(i12);
        if (lVar.getTextLayoutResult().q(p0.n(jC)) == i11) {
            iU = p0.n(jC);
        } else {
            iU = i11 >= lVar.getTextLayoutResult().n() ? lVar.getTextLayoutResult().u(lVar.getTextLayoutResult().n() - 1) : lVar.getTextLayoutResult().u(i11);
        }
        if (lVar.getTextLayoutResult().q(p0.i(jC)) == i11) {
            iP = p0.i(jC);
        } else {
            iP = i11 >= lVar.getTextLayoutResult().n() ? TextLayoutResult.p(lVar.getTextLayoutResult(), lVar.getTextLayoutResult().n() - 1, false, 2, null) : TextLayoutResult.p(lVar.getTextLayoutResult(), i11, false, 2, null);
        }
        if (iU == i13) {
            return lVar.a(iP);
        }
        if (iP == i13) {
            return lVar.a(iU);
        }
        if (!(z11 ^ z12) ? i12 >= iU : i12 > iP) {
            iU = iP;
        }
        return lVar.a(iU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Selection.AnchorInfo l(y yVar, l lVar, Selection.AnchorInfo anchorInfo) {
        int rawStartHandleOffset = yVar.getIsStartHandle() ? lVar.getRawStartHandleOffset() : lVar.getRawEndHandleOffset();
        if ((yVar.getIsStartHandle() ? yVar.getStartSlot() : yVar.getEndSlot()) != lVar.getSlot()) {
            return lVar.a(rawStartHandleOffset);
        }
        p pVar = p.NONE;
        Lazy lazyA = m.a(pVar, new b(lVar, rawStartHandleOffset));
        Lazy lazyA2 = m.a(pVar, new a(lVar, rawStartHandleOffset, yVar.getIsStartHandle() ? lVar.getRawEndHandleOffset() : lVar.getRawStartHandleOffset(), yVar, lazyA));
        if (lVar.getSelectableId() != anchorInfo.getSelectableId()) {
            return n(lazyA2);
        }
        int rawPreviousHandleOffset = lVar.getRawPreviousHandleOffset();
        if (rawStartHandleOffset == rawPreviousHandleOffset) {
            return anchorInfo;
        }
        if (m(lazyA) != lVar.getTextLayoutResult().q(rawPreviousHandleOffset)) {
            return n(lazyA2);
        }
        int offset = anchorInfo.getOffset();
        long jC = lVar.getTextLayoutResult().C(offset);
        if (j(lVar, rawStartHandleOffset, yVar.getIsStartHandle())) {
            return (offset == p0.n(jC) || offset == p0.i(jC)) ? n(lazyA2) : lVar.a(rawStartHandleOffset);
        }
        return lVar.a(rawStartHandleOffset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    private static final Selection.AnchorInfo n(Lazy<Selection.AnchorInfo> lazy) {
        return lazy.getValue();
    }
}
