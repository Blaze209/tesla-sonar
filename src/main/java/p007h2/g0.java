package p007h2;

import i4.p0;
import j3.h;
import j3.i;
import j3.m;
import java.util.List;
import kotlin.c1;
import o4.CommitTextCommand;
import o4.SetSelectionCommand;
import o4.TextFieldValue;
import o4.f0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00132\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u001c¨\u0006#"}, d2 = {"Lh2/g0;", "Lh2/b;", "Lo4/o0;", "currentValue", "Lo4/f0;", "offsetMapping", "Lb2/c1;", "layoutResultProxy", "Lh2/k0;", "state", "<init>", "(Lo4/o0;Lo4/f0;Lb2/c1;Lh2/k0;)V", "", "pagesAmount", "a0", "(Lb2/c1;I)I", "Lkotlin/Function1;", "Lo4/i;", "or", "", "Y", "(Lwn0/l;)Ljava/util/List;", "c0", "()Lh2/g0;", "b0", "j", "Lo4/o0;", "getCurrentValue", "()Lo4/o0;", "k", "Lb2/c1;", "getLayoutResultProxy", "()Lb2/c1;", "Z", "value", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g0 extends b<g0> {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final TextFieldValue currentValue;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final c1 layoutResultProxy;

    public g0(TextFieldValue textFieldValue, f0 f0Var, c1 c1Var, k0 k0Var) {
        super(textFieldValue.getText(), textFieldValue.getSelection(), c1Var != null ? c1Var.getValue() : null, f0Var, k0Var, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = c1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final int a0(c1 c1Var, int i11) {
        i iVarA;
        v innerTextFieldCoordinates = c1Var.getInnerTextFieldCoordinates();
        if (innerTextFieldCoordinates != null) {
            v decorationBoxCoordinates = c1Var.getDecorationBoxCoordinates();
            iVarA = decorationBoxCoordinates != null ? v.A0(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null) : null;
            if (iVarA == null) {
                iVarA = i.INSTANCE.a();
            }
        } else {
            iVarA = i.INSTANCE.a();
        }
        i iVarE = c1Var.getValue().e(getOffsetMapping().originalToTransformed(p0.i(this.currentValue.getSelection())));
        return getOffsetMapping().transformedToOriginal(c1Var.getValue().x(h.a(iVarE.getLeft(), iVarE.getTop() + (m.i(iVarA.k()) * i11))));
    }

    public final List<o4.i> Y(l<? super g0, ? extends o4.i> or2) {
        if (!p0.h(getSelection())) {
            return p013kotlin.collections.v.p(new CommitTextCommand("", 0), new SetSelectionCommand(p0.l(getSelection()), p0.l(getSelection())));
        }
        o4.i iVarInvoke = or2.invoke(this);
        if (iVarInvoke != null) {
            return p013kotlin.collections.v.e(iVarInvoke);
        }
        return null;
    }

    public final TextFieldValue Z() {
        return TextFieldValue.c(this.currentValue, getAnnotatedString(), getSelection(), null, 4, null);
    }

    public final g0 b0() {
        c1 c1Var;
        if (w().length() > 0 && (c1Var = this.layoutResultProxy) != null) {
            T(a0(c1Var, 1));
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final g0 c0() {
        c1 c1Var;
        if (w().length() > 0 && (c1Var = this.layoutResultProxy) != null) {
            T(a0(c1Var, -1));
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}
