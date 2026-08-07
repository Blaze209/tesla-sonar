package e2;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.e3;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextLayoutInput;
import i4.TextLayoutResult;
import k3.z3;
import kotlin.c1;
import o4.CommitTextCommand;
import o4.DeleteSurroundingTextCommand;
import o4.SetSelectionCommand;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\f*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010!\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0004\b!\u0010\"J-\u0010$\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020#2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0004\b$\u0010%J-\u0010'\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0004\b'\u0010(J&\u0010-\u001a\u00020\f*\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0003ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020/H\u0003¢\u0006\u0004\b0\u00101J&\u00105\u001a\u00020\f*\u00020\u00042\u0006\u00102\u001a\u00020)2\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106J9\u0010=\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u00052\b\u00109\u001a\u0004\u0018\u0001082\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\b=\u0010>J%\u0010@\u001a\u00020\f*\u0002072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010?\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\b@\u0010AJ7\u0010D\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020B2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bD\u0010EJ%\u0010F\u001a\u00020\f*\u0002072\u0006\u0010\u0006\u001a\u00020\u000f2\b\u0010?\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\bF\u0010GJ9\u0010H\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u00142\b\u00109\u001a\u0004\u0018\u0001082\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bH\u0010IJ%\u0010J\u001a\u00020\f*\u0002072\u0006\u0010\u0006\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\bJ\u0010KJ7\u0010L\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010C\u001a\u00020B2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bL\u0010MJ%\u0010N\u001a\u00020\f*\u0002072\u0006\u0010\u0006\u001a\u00020\u00192\b\u0010?\u001a\u0004\u0018\u000108H\u0003¢\u0006\u0004\bN\u0010OJA\u0010P\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020B2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bP\u0010QJ9\u0010R\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bR\u0010SJA\u0010T\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020&2\u0006\u0010C\u001a\u00020B2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bT\u0010UJ3\u0010X\u001a\u00020\f2\u0006\u0010V\u001a\u00020\t2\u0006\u0010C\u001a\u00020W2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\bX\u0010YJ8\u0010Z\u001a\u00020\f2\u0006\u00102\u001a\u00020)2\b\u00109\u001a\u0004\u0018\u0001082\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J>\u0010\\\u001a\u00020\f2\u0006\u00102\u001a\u00020)2\u0006\u0010C\u001a\u00020B2\u0006\u0010,\u001a\u00020+2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J+\u0010^\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020/2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0003¢\u0006\u0004\b^\u0010_J\u0019\u0010a\u001a\u00020`*\u00020\tH\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ-\u0010d\u001a\u00020\t*\u00020\u00042\u0006\u0010c\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\bd\u0010eJ-\u0010i\u001a\u00020+*\u00020\u00042\u0006\u0010c\u001a\u00020f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010h\u001a\u0004\u0018\u00010gH\u0001¢\u0006\u0004\bi\u0010jJC\u0010k\u001a\u00020\t*\u0002072\u0006\u0010\u0006\u001a\u00020/2\b\u0010?\u001a\u0004\u0018\u0001082\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f0:H\u0001¢\u0006\u0004\bk\u0010lJ/\u0010m\u001a\u00020+*\u0002072\u0006\u0010\u0006\u001a\u00020f2\b\u0010?\u001a\u0004\u0018\u0001082\b\u0010h\u001a\u0004\u0018\u00010gH\u0001¢\u0006\u0004\bm\u0010n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006o"}, d2 = {"Le2/i0;", "", "<init>", "()V", "Le2/x0;", "Landroid/view/inputmethod/SelectGesture;", "gesture", "Le2/w0;", "layoutState", "", "v", "(Le2/x0;Landroid/view/inputmethod/SelectGesture;Le2/w0;)I", "Ljn0/h0;", "I", "(Le2/x0;Landroid/view/inputmethod/SelectGesture;Le2/w0;)V", "Landroid/view/inputmethod/DeleteGesture;", "g", "(Le2/x0;Landroid/view/inputmethod/DeleteGesture;Le2/w0;)I", "A", "(Le2/x0;Landroid/view/inputmethod/DeleteGesture;Le2/w0;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "x", "(Le2/x0;Landroid/view/inputmethod/SelectRangeGesture;Le2/w0;)I", "K", "(Le2/x0;Landroid/view/inputmethod/SelectRangeGesture;Le2/w0;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", IntegerTokenConverter.CONVERTER_KEY, "(Le2/x0;Landroid/view/inputmethod/DeleteRangeGesture;Le2/w0;)I", "C", "(Le2/x0;Landroid/view/inputmethod/DeleteRangeGesture;Le2/w0;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "Landroidx/compose/ui/platform/e3;", "viewConfiguration", "r", "(Le2/x0;Landroid/view/inputmethod/JoinOrSplitGesture;Le2/w0;Landroidx/compose/ui/platform/e3;)I", "Landroid/view/inputmethod/InsertGesture;", "o", "(Le2/x0;Landroid/view/inputmethod/InsertGesture;Le2/w0;Landroidx/compose/ui/platform/e3;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "t", "(Le2/x0;Landroid/view/inputmethod/RemoveSpaceGesture;Le2/w0;Landroidx/compose/ui/platform/e3;)I", "Li4/p0;", "rangeInTransformedText", "", "adjustRange", "j", "(Le2/x0;JZ)V", "Landroid/view/inputmethod/HandwritingGesture;", "c", "(Le2/x0;Landroid/view/inputmethod/HandwritingGesture;)I", "range", "Ld2/d;", "type", "e", "(Le2/x0;JI)V", "Lb2/b0;", "Lh2/h0;", "textSelectionManager", "Lkotlin/Function1;", "Lo4/i;", "editCommandConsumer", "u", "(Lb2/b0;Landroid/view/inputmethod/SelectGesture;Lh2/h0;Lwn0/l;)I", "textFieldSelectionManager", "H", "(Lb2/b0;Landroid/view/inputmethod/SelectGesture;Lh2/h0;)V", "Li4/d;", "text", "f", "(Lb2/b0;Landroid/view/inputmethod/DeleteGesture;Li4/d;Lwn0/l;)I", "z", "(Lb2/b0;Landroid/view/inputmethod/DeleteGesture;Lh2/h0;)V", "w", "(Lb2/b0;Landroid/view/inputmethod/SelectRangeGesture;Lh2/h0;Lwn0/l;)I", "J", "(Lb2/b0;Landroid/view/inputmethod/SelectRangeGesture;Lh2/h0;)V", "h", "(Lb2/b0;Landroid/view/inputmethod/DeleteRangeGesture;Li4/d;Lwn0/l;)I", "B", "(Lb2/b0;Landroid/view/inputmethod/DeleteRangeGesture;Lh2/h0;)V", "q", "(Lb2/b0;Landroid/view/inputmethod/JoinOrSplitGesture;Li4/d;Landroidx/compose/ui/platform/e3;Lwn0/l;)I", "n", "(Lb2/b0;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/e3;Lwn0/l;)I", "s", "(Lb2/b0;Landroid/view/inputmethod/RemoveSpaceGesture;Li4/d;Landroidx/compose/ui/platform/e3;Lwn0/l;)I", "offset", "", "p", "(ILjava/lang/String;Lwn0/l;)V", "y", "(JLh2/h0;Lwn0/l;)V", "k", "(JLi4/d;ZLwn0/l;)V", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/inputmethod/HandwritingGesture;Lwn0/l;)I", "Li4/g0;", "L", "(I)I", "handwritingGesture", "m", "(Le2/x0;Landroid/view/inputmethod/HandwritingGesture;Le2/w0;Landroidx/compose/ui/platform/e3;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "E", "(Le2/x0;Landroid/view/inputmethod/PreviewableHandwritingGesture;Le2/w0;Landroid/os/CancellationSignal;)Z", "l", "(Lb2/b0;Landroid/view/inputmethod/HandwritingGesture;Lh2/h0;Landroidx/compose/ui/platform/e3;Lwn0/l;)I", "D", "(Lb2/b0;Landroid/view/inputmethod/PreviewableHandwritingGesture;Lh2/h0;Landroid/os/CancellationSignal;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f61492a = new i0();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/text/m;", "it", "", "a", "(Lkotlin/text/m;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<p013kotlin.text.m, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.l0 f61493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.l0 f61494d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p013kotlin.jvm.internal.l0 l0Var, p013kotlin.jvm.internal.l0 l0Var2) {
            super(1);
            this.f61493c = l0Var;
            this.f61494d = l0Var2;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(p013kotlin.text.m mVar) {
            p013kotlin.jvm.internal.l0 l0Var = this.f61493c;
            if (l0Var.f86527a == -1) {
                l0Var.f86527a = mVar.d().getFirst();
            }
            this.f61494d.f86527a = mVar.d().getLast() + 1;
            return "";
        }
    }

    private i0() {
    }

    private final void A(x0 x0Var, DeleteGesture deleteGesture, w0 w0Var) {
        e(x0Var, j0.w(w0Var, z3.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), i4.k0.INSTANCE.h()), d2.d.INSTANCE.a());
    }

    private final void B(kotlin.b0 b0Var, DeleteRangeGesture deleteRangeGesture, p007h2.h0 h0Var) {
        if (h0Var != null) {
            h0Var.X(j0.x(b0Var, z3.f(deleteRangeGesture.getDeletionStartArea()), z3.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), i4.k0.INSTANCE.h()));
        }
    }

    private final void C(x0 x0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        e(x0Var, j0.y(w0Var, z3.f(deleteRangeGesture.getDeletionStartArea()), z3.f(deleteRangeGesture.getDeletionEndArea()), L(deleteRangeGesture.getGranularity()), i4.k0.INSTANCE.h()), d2.d.INSTANCE.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(x0 x0Var) {
        x0.b(x0Var);
        x0.a(x0Var);
        f2.a aVar = f2.a.MergeIfPossible;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(p007h2.h0 h0Var) {
        if (h0Var != null) {
            h0Var.n();
        }
    }

    private final void H(kotlin.b0 b0Var, SelectGesture selectGesture, p007h2.h0 h0Var) {
        if (h0Var != null) {
            h0Var.g0(j0.v(b0Var, z3.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), i4.k0.INSTANCE.h()));
        }
    }

    private final void I(x0 x0Var, SelectGesture selectGesture, w0 w0Var) {
        e(x0Var, j0.w(w0Var, z3.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), i4.k0.INSTANCE.h()), d2.d.INSTANCE.b());
    }

    private final void J(kotlin.b0 b0Var, SelectRangeGesture selectRangeGesture, p007h2.h0 h0Var) {
        if (h0Var != null) {
            h0Var.g0(j0.x(b0Var, z3.f(selectRangeGesture.getSelectionStartArea()), z3.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), i4.k0.INSTANCE.h()));
        }
    }

    private final void K(x0 x0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        e(x0Var, j0.y(w0Var, z3.f(selectRangeGesture.getSelectionStartArea()), z3.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), i4.k0.INSTANCE.h()), d2.d.INSTANCE.b());
    }

    private final int L(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? i4.g0.INSTANCE.a() : i4.g0.INSTANCE.a();
        }
        return i4.g0.INSTANCE.b();
    }

    private final int c(x0 x0Var, HandwritingGesture handwritingGesture) {
        x0.b(x0Var);
        x0.a(x0Var);
        f2.a aVar = f2.a.MergeIfPossible;
        throw null;
    }

    private final int d(HandwritingGesture gesture, wn0.l<? super o4.i, jn0.h0> editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    private final void e(x0 x0Var, long j11, int i11) {
        if (!i4.p0.h(j11)) {
            throw null;
        }
        x0.b(x0Var);
        x0.a(x0Var);
        f2.a aVar = f2.a.MergeIfPossible;
        throw null;
    }

    private final int f(kotlin.b0 b0Var, DeleteGesture deleteGesture, i4.d dVar, wn0.l<? super o4.i, jn0.h0> lVar) {
        int iL = L(deleteGesture.getGranularity());
        long jV = j0.v(b0Var, z3.f(deleteGesture.getDeletionArea()), iL, i4.k0.INSTANCE.h());
        if (i4.p0.h(jV)) {
            return f61492a.d(deleteGesture, lVar);
        }
        k(jV, dVar, i4.g0.d(iL, i4.g0.INSTANCE.b()), lVar);
        return 1;
    }

    private final int g(x0 x0Var, DeleteGesture deleteGesture, w0 w0Var) {
        int iL = L(deleteGesture.getGranularity());
        long jW = j0.w(w0Var, z3.f(deleteGesture.getDeletionArea()), iL, i4.k0.INSTANCE.h());
        if (i4.p0.h(jW)) {
            return f61492a.c(x0Var, deleteGesture);
        }
        j(x0Var, jW, i4.g0.d(iL, i4.g0.INSTANCE.b()));
        return 1;
    }

    private final int h(kotlin.b0 b0Var, DeleteRangeGesture deleteRangeGesture, i4.d dVar, wn0.l<? super o4.i, jn0.h0> lVar) {
        int iL = L(deleteRangeGesture.getGranularity());
        long jX = j0.x(b0Var, z3.f(deleteRangeGesture.getDeletionStartArea()), z3.f(deleteRangeGesture.getDeletionEndArea()), iL, i4.k0.INSTANCE.h());
        if (i4.p0.h(jX)) {
            return f61492a.d(deleteRangeGesture, lVar);
        }
        k(jX, dVar, i4.g0.d(iL, i4.g0.INSTANCE.b()), lVar);
        return 1;
    }

    private final int i(x0 x0Var, DeleteRangeGesture deleteRangeGesture, w0 w0Var) {
        int iL = L(deleteRangeGesture.getGranularity());
        long jY = j0.y(w0Var, z3.f(deleteRangeGesture.getDeletionStartArea()), z3.f(deleteRangeGesture.getDeletionEndArea()), iL, i4.k0.INSTANCE.h());
        if (i4.p0.h(jY)) {
            return f61492a.c(x0Var, deleteRangeGesture);
        }
        j(x0Var, jY, i4.g0.d(iL, i4.g0.INSTANCE.b()));
        return 1;
    }

    private final void j(x0 x0Var, long j11, boolean z11) {
        if (z11) {
            throw null;
        }
        x0.c(x0Var, "", j11, null, false, 12, null);
    }

    private final void k(long range, i4.d text, boolean adjustRange, wn0.l<? super o4.i, jn0.h0> editCommandConsumer) {
        if (adjustRange) {
            range = j0.m(range, text);
        }
        editCommandConsumer.invoke(j0.n(new SetSelectionCommand(i4.p0.i(range), i4.p0.i(range)), new DeleteSurroundingTextCommand(i4.p0.j(range), 0)));
    }

    private final int n(kotlin.b0 b0Var, InsertGesture insertGesture, e3 e3Var, wn0.l<? super o4.i, jn0.h0> lVar) {
        c1 c1VarJ;
        TextLayoutResult value;
        if (e3Var == null) {
            return d(insertGesture, lVar);
        }
        int iQ = j0.q(b0Var, j0.F(insertGesture.getInsertionPoint()), e3Var);
        if (iQ == -1 || !((c1VarJ = b0Var.j()) == null || (value = c1VarJ.getValue()) == null || !j0.z(value, iQ))) {
            return d(insertGesture, lVar);
        }
        p(iQ, insertGesture.getTextToInsert(), lVar);
        return 1;
    }

    private final int o(x0 x0Var, InsertGesture insertGesture, w0 w0Var, e3 e3Var) {
        int iR = j0.r(w0Var, j0.F(insertGesture.getInsertionPoint()), e3Var);
        if (iR == -1) {
            return c(x0Var, insertGesture);
        }
        x0.c(x0Var, insertGesture.getTextToInsert(), i4.q0.a(iR), null, false, 12, null);
        return 1;
    }

    private final void p(int offset, String text, wn0.l<? super o4.i, jn0.h0> editCommandConsumer) {
        editCommandConsumer.invoke(j0.n(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)));
    }

    private final int q(kotlin.b0 b0Var, JoinOrSplitGesture joinOrSplitGesture, i4.d dVar, e3 e3Var, wn0.l<? super o4.i, jn0.h0> lVar) {
        c1 c1VarJ;
        TextLayoutResult value;
        if (e3Var == null) {
            return d(joinOrSplitGesture, lVar);
        }
        int iQ = j0.q(b0Var, j0.F(joinOrSplitGesture.getJoinOrSplitPoint()), e3Var);
        if (iQ == -1 || !((c1VarJ = b0Var.j()) == null || (value = c1VarJ.getValue()) == null || !j0.z(value, iQ))) {
            return d(joinOrSplitGesture, lVar);
        }
        long jE = j0.E(dVar, iQ);
        if (i4.p0.h(jE)) {
            p(i4.p0.n(jE), " ", lVar);
        } else {
            k(jE, dVar, false, lVar);
        }
        return 1;
    }

    private final int r(x0 x0Var, JoinOrSplitGesture joinOrSplitGesture, w0 w0Var, e3 e3Var) {
        throw null;
    }

    private final int s(kotlin.b0 b0Var, RemoveSpaceGesture removeSpaceGesture, i4.d dVar, e3 e3Var, wn0.l<? super o4.i, jn0.h0> lVar) {
        c1 c1VarJ = b0Var.j();
        long jT = j0.t(c1VarJ != null ? c1VarJ.getValue() : null, j0.F(removeSpaceGesture.getStartPoint()), j0.F(removeSpaceGesture.getEndPoint()), b0Var.i(), e3Var);
        if (i4.p0.h(jT)) {
            return f61492a.d(removeSpaceGesture, lVar);
        }
        p013kotlin.jvm.internal.l0 l0Var = new p013kotlin.jvm.internal.l0();
        l0Var.f86527a = -1;
        p013kotlin.jvm.internal.l0 l0Var2 = new p013kotlin.jvm.internal.l0();
        l0Var2.f86527a = -1;
        String strK = new p013kotlin.text.q("\\s+").k(i4.q0.e(dVar, jT), new a(l0Var, l0Var2));
        if (l0Var.f86527a == -1 || l0Var2.f86527a == -1) {
            return d(removeSpaceGesture, lVar);
        }
        int iN = i4.p0.n(jT) + l0Var.f86527a;
        int iN2 = i4.p0.n(jT) + l0Var2.f86527a;
        String strSubstring = strK.substring(l0Var.f86527a, strK.length() - (i4.p0.j(jT) - l0Var2.f86527a));
        p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        lVar.invoke(j0.n(new SetSelectionCommand(iN, iN2), new CommitTextCommand(strSubstring, 1)));
        return 1;
    }

    private final int t(x0 x0Var, RemoveSpaceGesture removeSpaceGesture, w0 w0Var, e3 e3Var) {
        throw null;
    }

    private final int u(kotlin.b0 b0Var, SelectGesture selectGesture, p007h2.h0 h0Var, wn0.l<? super o4.i, jn0.h0> lVar) {
        long jV = j0.v(b0Var, z3.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), i4.k0.INSTANCE.h());
        if (i4.p0.h(jV)) {
            return f61492a.d(selectGesture, lVar);
        }
        y(jV, h0Var, lVar);
        return 1;
    }

    private final int v(x0 x0Var, SelectGesture selectGesture, w0 w0Var) {
        if (i4.p0.h(j0.w(w0Var, z3.f(selectGesture.getSelectionArea()), L(selectGesture.getGranularity()), i4.k0.INSTANCE.h()))) {
            return f61492a.c(x0Var, selectGesture);
        }
        throw null;
    }

    private final int w(kotlin.b0 b0Var, SelectRangeGesture selectRangeGesture, p007h2.h0 h0Var, wn0.l<? super o4.i, jn0.h0> lVar) {
        long jX = j0.x(b0Var, z3.f(selectRangeGesture.getSelectionStartArea()), z3.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), i4.k0.INSTANCE.h());
        if (i4.p0.h(jX)) {
            return f61492a.d(selectRangeGesture, lVar);
        }
        y(jX, h0Var, lVar);
        return 1;
    }

    private final int x(x0 x0Var, SelectRangeGesture selectRangeGesture, w0 w0Var) {
        if (i4.p0.h(j0.y(w0Var, z3.f(selectRangeGesture.getSelectionStartArea()), z3.f(selectRangeGesture.getSelectionEndArea()), L(selectRangeGesture.getGranularity()), i4.k0.INSTANCE.h()))) {
            return f61492a.c(x0Var, selectRangeGesture);
        }
        throw null;
    }

    private final void y(long range, p007h2.h0 textSelectionManager, wn0.l<? super o4.i, jn0.h0> editCommandConsumer) {
        editCommandConsumer.invoke(new SetSelectionCommand(i4.p0.n(range), i4.p0.i(range)));
        if (textSelectionManager != null) {
            textSelectionManager.v(true);
        }
    }

    private final void z(kotlin.b0 b0Var, DeleteGesture deleteGesture, p007h2.h0 h0Var) {
        if (h0Var != null) {
            h0Var.X(j0.v(b0Var, z3.f(deleteGesture.getDeletionArea()), L(deleteGesture.getGranularity()), i4.k0.INSTANCE.h()));
        }
    }

    public final boolean D(kotlin.b0 b0Var, PreviewableHandwritingGesture previewableHandwritingGesture, final p007h2.h0 h0Var, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        i4.d untransformedText = b0Var.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        c1 c1VarJ = b0Var.j();
        if (!p013kotlin.jvm.internal.s.f(untransformedText, (c1VarJ == null || (value = c1VarJ.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (s.a(previewableHandwritingGesture)) {
            H(b0Var, x.a(previewableHandwritingGesture), h0Var);
        } else if (y.a(previewableHandwritingGesture)) {
            z(b0Var, z.a(previewableHandwritingGesture), h0Var);
        } else if (a0.a(previewableHandwritingGesture)) {
            J(b0Var, b0.a(previewableHandwritingGesture), h0Var);
        } else {
            if (!c0.a(previewableHandwritingGesture)) {
                return false;
            }
            B(b0Var, d0.a(previewableHandwritingGesture), h0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: e2.g0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                i0.G(h0Var);
            }
        });
        return true;
    }

    public final boolean E(final x0 x0Var, PreviewableHandwritingGesture previewableHandwritingGesture, w0 w0Var, CancellationSignal cancellationSignal) {
        if (s.a(previewableHandwritingGesture)) {
            I(x0Var, x.a(previewableHandwritingGesture), w0Var);
        } else if (y.a(previewableHandwritingGesture)) {
            A(x0Var, z.a(previewableHandwritingGesture), w0Var);
        } else if (a0.a(previewableHandwritingGesture)) {
            K(x0Var, b0.a(previewableHandwritingGesture), w0Var);
        } else {
            if (!c0.a(previewableHandwritingGesture)) {
                return false;
            }
            C(x0Var, d0.a(previewableHandwritingGesture), w0Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener(x0Var) { // from class: e2.h0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                i0.F(null);
            }
        });
        return true;
    }

    public final int l(kotlin.b0 b0Var, HandwritingGesture handwritingGesture, p007h2.h0 h0Var, e3 e3Var, wn0.l<? super o4.i, jn0.h0> lVar) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        i4.d untransformedText = b0Var.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        c1 c1VarJ = b0Var.j();
        if (!p013kotlin.jvm.internal.s.f(untransformedText, (c1VarJ == null || (value = c1VarJ.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (s.a(handwritingGesture)) {
            return u(b0Var, x.a(handwritingGesture), h0Var, lVar);
        }
        if (y.a(handwritingGesture)) {
            return f(b0Var, z.a(handwritingGesture), untransformedText, lVar);
        }
        if (a0.a(handwritingGesture)) {
            return w(b0Var, b0.a(handwritingGesture), h0Var, lVar);
        }
        if (c0.a(handwritingGesture)) {
            return h(b0Var, d0.a(handwritingGesture), untransformedText, lVar);
        }
        if (v.a(handwritingGesture)) {
            return q(b0Var, w.a(handwritingGesture), untransformedText, e3Var, lVar);
        }
        if (e0.a(handwritingGesture)) {
            return n(b0Var, f0.a(handwritingGesture), e3Var, lVar);
        }
        if (t.a(handwritingGesture)) {
            return s(b0Var, u.a(handwritingGesture), untransformedText, e3Var, lVar);
        }
        return 2;
    }

    public final int m(x0 x0Var, HandwritingGesture handwritingGesture, w0 w0Var, e3 e3Var) {
        if (s.a(handwritingGesture)) {
            return v(x0Var, x.a(handwritingGesture), w0Var);
        }
        if (y.a(handwritingGesture)) {
            return g(x0Var, z.a(handwritingGesture), w0Var);
        }
        if (a0.a(handwritingGesture)) {
            return x(x0Var, b0.a(handwritingGesture), w0Var);
        }
        if (c0.a(handwritingGesture)) {
            return i(x0Var, d0.a(handwritingGesture), w0Var);
        }
        if (v.a(handwritingGesture)) {
            return r(x0Var, w.a(handwritingGesture), w0Var, e3Var);
        }
        if (e0.a(handwritingGesture)) {
            return o(x0Var, f0.a(handwritingGesture), w0Var, e3Var);
        }
        if (t.a(handwritingGesture)) {
            return t(x0Var, u.a(handwritingGesture), w0Var, e3Var);
        }
        return 2;
    }
}
