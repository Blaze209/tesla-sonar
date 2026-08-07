package p007h2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.TextLayoutResult;
import i4.p0;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.u;
import t4.i;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aJ\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0012\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0016\u001a\u00020\b*\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Li4/m0;", "layoutResult", "", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Li4/p0;", "previousSelectionRange", "", "isStartOfSelection", "isStartHandle", "Lh2/y;", "c", "(Li4/m0;IIIJZZ)Lh2/y;", "offset", "Lt4/i;", "b", "(Li4/m0;I)Lt4/i;", "e", "(Li4/m0;I)Z", "Lh2/m;", "layout", DateTokenConverter.CONVERTER_KEY, "(Lh2/m;Lh2/y;)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class z {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh2/l;", "it", "Ljn0/h0;", "a", "(Lh2/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<l, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f70405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0 j0Var) {
            super(1);
            this.f70405c = j0Var;
        }

        public final void a(l lVar) {
            if (lVar.c().length() > 0) {
                this.f70405c.f86523a = false;
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(l lVar) {
            a(lVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i b(TextLayoutResult m0Var, int i11) {
        return e(m0Var, i11) ? m0Var.y(i11) : m0Var.c(i11);
    }

    public static final y c(TextLayoutResult m0Var, int i11, int i12, int i13, long j11, boolean z11, boolean z12) {
        return new SingleSelectionLayout(z12, 1, 1, z11 ? null : new Selection(new Selection.AnchorInfo(b(m0Var, p0.n(j11)), p0.n(j11), 1L), new Selection.AnchorInfo(b(m0Var, p0.i(j11)), p0.i(j11), 1L), p0.m(j11)), new l(1L, 1, i11, i12, i13, m0Var));
    }

    public static final boolean d(Selection selection, y yVar) {
        if (selection == null || yVar == null) {
            return true;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return selection.getStart().getOffset() == selection.getEnd().getOffset();
        }
        if ((selection.getHandlesCrossed() ? selection.getStart() : selection.getEnd()).getOffset() != 0) {
            return false;
        }
        if (yVar.i().l() != (selection.getHandlesCrossed() ? selection.getEnd() : selection.getStart()).getOffset()) {
            return false;
        }
        j0 j0Var = new j0();
        j0Var.f86523a = true;
        yVar.k(new a(j0Var));
        return j0Var.f86523a;
    }

    private static final boolean e(TextLayoutResult m0Var, int i11) {
        if (m0Var.getLayoutInput().getText().length() != 0) {
            int iQ = m0Var.q(i11);
            if (i11 != 0 && iQ == m0Var.q(i11 - 1)) {
                return false;
            }
            if (i11 != m0Var.getLayoutInput().getText().length() && iQ == m0Var.q(i11 + 1)) {
                return false;
            }
        }
        return true;
    }
}
