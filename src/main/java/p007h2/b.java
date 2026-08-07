package p007h2;

import bo0.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import i4.TextLayoutResult;
import i4.d;
import i4.p0;
import i4.q0;
import j3.h;
import jn0.h0;
import kotlin.g0;
import o4.f0;
import p007h2.b;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import t4.i;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0002\b\u0005\b \u0018\u0000 d*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002:\u0001%B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082\u0010¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u0017*\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u001b\u0010\u001f\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010%\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0001\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0001\u0010(J\u001f\u0010+\u001a\u00020'2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0004¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010\u0010J\r\u0010.\u001a\u00028\u0000¢\u0006\u0004\b.\u0010\u0010J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\u0010J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\u0010J!\u00103\u001a\u00028\u00002\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'01¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00028\u00002\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'01¢\u0006\u0004\b5\u00104J\r\u00106\u001a\u00020\u0017¢\u0006\u0004\b6\u0010!J\r\u00107\u001a\u00020\u0017¢\u0006\u0004\b7\u0010!J\r\u00108\u001a\u00028\u0000¢\u0006\u0004\b8\u0010\u0010J\r\u00109\u001a\u00028\u0000¢\u0006\u0004\b9\u0010\u0010J\r\u0010:\u001a\u00028\u0000¢\u0006\u0004\b:\u0010\u0010J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010\u0010J\u000f\u0010<\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b>\u0010=J\r\u0010?\u001a\u00028\u0000¢\u0006\u0004\b?\u0010\u0010J\r\u0010@\u001a\u00028\u0000¢\u0006\u0004\b@\u0010\u0010J\r\u0010A\u001a\u00028\u0000¢\u0006\u0004\bA\u0010\u0010J\r\u0010B\u001a\u00028\u0000¢\u0006\u0004\bB\u0010\u0010J\u000f\u0010C\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bC\u0010=J\r\u0010D\u001a\u00028\u0000¢\u0006\u0004\bD\u0010\u0010J\u000f\u0010E\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\bE\u0010=J\r\u0010F\u001a\u00028\u0000¢\u0006\u0004\bF\u0010\u0010J\r\u0010G\u001a\u00028\u0000¢\u0006\u0004\bG\u0010\u0010J\r\u0010H\u001a\u00028\u0000¢\u0006\u0004\bH\u0010\u0010J\r\u0010I\u001a\u00028\u0000¢\u0006\u0004\bI\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\bM\u0010NR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b5\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010R\u001a\u0004\bS\u0010TR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR(\u0010\\\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bE\u0010;\u001a\u0004\bY\u0010N\"\u0004\bZ\u0010[R\"\u0010_\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010J\u001a\u0004\bU\u0010L\"\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006e"}, d2 = {"Lh2/b;", "T", "", "Li4/d;", "originalText", "Li4/p0;", "originalSelection", "Li4/m0;", "layoutResult", "Lo4/f0;", "offsetMapping", "Lh2/k0;", "state", "<init>", "(Li4/d;JLi4/m0;Lo4/f0;Lh2/k0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", Gender.FEMALE, "()Lh2/b;", "C", "E", "H", "", "x", "()Z", "", "currentOffset", "n", "(Li4/m0;I)I", "r", "j", "g", "linesAmount", "y", "V", "()I", "X", "W", "offset", "a", "(I)I", "Ljn0/h0;", "(I)V", "start", "end", Gender.UNKNOWN, "(II)V", "R", DateTokenConverter.CONVERTER_KEY, "A", "I", "Lkotlin/Function1;", "or", "b", "(Lwn0/l;)Lh2/b;", "c", "q", "l", "L", "K", "B", "J", "m", "()Ljava/lang/Integer;", "t", "G", "D", "Q", "z", IntegerTokenConverter.CONVERTER_KEY, "P", "f", Gender.MALE, Gender.NONE, Gender.OTHER, "S", "Li4/d;", "getOriginalText", "()Li4/d;", "getOriginalSelection-d9O1mEE", "()J", "Li4/m0;", "getLayoutResult", "()Li4/m0;", "Lo4/f0;", "p", "()Lo4/f0;", "e", "Lh2/k0;", "v", "()Lh2/k0;", "u", "setSelection-5zc-tL8", "(J)V", "selection", "setAnnotatedString", "(Li4/d;)V", "annotatedString", "", "w", "()Ljava/lang/String;", "text", "h", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class b<T extends b<T>> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f70231i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d originalText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long originalSelection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult layoutResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f0 offsetMapping;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k0 state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long selection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d annotatedString;

    public /* synthetic */ b(d dVar, long j11, TextLayoutResult textLayoutResult, f0 f0Var, k0 k0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11, textLayoutResult, f0Var, k0Var);
    }

    private final T C() {
        int iL;
        getState().b();
        if (w().length() > 0 && (iL = l()) != -1) {
            T(iL);
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T E() {
        Integer numM;
        getState().b();
        if (w().length() > 0 && (numM = m()) != null) {
            T(numM.intValue());
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T F() {
        int iQ;
        getState().b();
        if (w().length() > 0 && (iQ = q()) != -1) {
            T(iQ);
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T H() {
        Integer numT;
        getState().b();
        if (w().length() > 0 && (numT = t()) != null) {
            T(numT.intValue());
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int V() {
        return this.offsetMapping.originalToTransformed(p0.i(this.selection));
    }

    private final int W() {
        return this.offsetMapping.originalToTransformed(p0.k(this.selection));
    }

    private final int X() {
        return this.offsetMapping.originalToTransformed(p0.l(this.selection));
    }

    private final int a(int offset) {
        return n.j(offset, w().length() - 1);
    }

    private final int g(TextLayoutResult textLayoutResult, int i11) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.o(textLayoutResult.q(i11), true));
    }

    static /* synthetic */ int h(b bVar, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i12 & 1) != 0) {
            i11 = bVar.W();
        }
        return bVar.g(textLayoutResult, i11);
    }

    private final int j(TextLayoutResult textLayoutResult, int i11) {
        return this.offsetMapping.transformedToOriginal(textLayoutResult.u(textLayoutResult.q(i11)));
    }

    static /* synthetic */ int k(b bVar, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i12 & 1) != 0) {
            i11 = bVar.X();
        }
        return bVar.j(textLayoutResult, i11);
    }

    private final int n(TextLayoutResult textLayoutResult, int i11) {
        while (i11 < this.originalText.length()) {
            long jC = textLayoutResult.C(a(i11));
            if (p0.i(jC) > i11) {
                return this.offsetMapping.transformedToOriginal(p0.i(jC));
            }
            i11++;
        }
        return this.originalText.length();
    }

    static /* synthetic */ int o(b bVar, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i12 & 1) != 0) {
            i11 = bVar.V();
        }
        return bVar.n(textLayoutResult, i11);
    }

    private final int r(TextLayoutResult textLayoutResult, int i11) {
        while (i11 > 0) {
            long jC = textLayoutResult.C(a(i11));
            if (p0.n(jC) < i11) {
                return this.offsetMapping.transformedToOriginal(p0.n(jC));
            }
            i11--;
        }
        return 0;
    }

    static /* synthetic */ int s(b bVar, TextLayoutResult textLayoutResult, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i12 & 1) != 0) {
            i11 = bVar.V();
        }
        return bVar.r(textLayoutResult, i11);
    }

    private final boolean x() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        return (textLayoutResult != null ? textLayoutResult.y(V()) : null) != i.Rtl;
    }

    private final int y(TextLayoutResult textLayoutResult, int i11) {
        int iV = V();
        if (this.state.getCachedX() == null) {
            this.state.c(Float.valueOf(textLayoutResult.e(iV).getLeft()));
        }
        int iQ = textLayoutResult.q(iV) + i11;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= textLayoutResult.n()) {
            return w().length();
        }
        float fM = textLayoutResult.m(iQ) - 1;
        Float cachedX = this.state.getCachedX();
        s.h(cachedX);
        float fFloatValue = cachedX.floatValue();
        if ((x() && fFloatValue >= textLayoutResult.t(iQ)) || (!x() && fFloatValue <= textLayoutResult.s(iQ))) {
            return textLayoutResult.o(iQ, true);
        }
        return this.offsetMapping.transformedToOriginal(textLayoutResult.x(h.a(cachedX.floatValue(), fM)));
    }

    public final T A() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T B() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T D() {
        getState().b();
        if (w().length() > 0) {
            int iA = g0.a(w(), p0.k(this.selection));
            if (iA == p0.k(this.selection) && iA != w().length()) {
                iA = g0.a(w(), iA + 1);
            }
            T(iA);
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T G() {
        getState().b();
        if (w().length() > 0) {
            int iB = g0.b(w(), p0.l(this.selection));
            if (iB == p0.l(this.selection) && iB != 0) {
                iB = g0.b(w(), iB - 1);
            }
            T(iB);
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T I() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T J() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T K() {
        getState().b();
        if (w().length() > 0) {
            T(w().length());
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T L() {
        getState().b();
        if (w().length() > 0) {
            T(0);
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T M() {
        Integer numF;
        getState().b();
        if (w().length() > 0 && (numF = f()) != null) {
            T(numF.intValue());
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T N() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T O() {
        getState().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T P() {
        Integer numI;
        getState().b();
        if (w().length() > 0 && (numI = i()) != null) {
            T(numI.intValue());
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T Q() {
        TextLayoutResult textLayoutResult;
        if (w().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            T(y(textLayoutResult, -1));
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T R() {
        getState().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T S() {
        if (w().length() > 0) {
            this.selection = q0.b(p0.n(this.originalSelection), p0.i(this.selection));
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void T(int offset) {
        U(offset, offset);
    }

    protected final void U(int start, int end) {
        this.selection = q0.b(start, end);
    }

    public final T b(l<? super T, h0> or2) {
        getState().b();
        if (w().length() > 0) {
            if (p0.h(this.selection)) {
                s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                or2.invoke(this);
            } else if (x()) {
                T(p0.l(this.selection));
            } else {
                T(p0.k(this.selection));
            }
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T c(l<? super T, h0> or2) {
        getState().b();
        if (w().length() > 0) {
            if (p0.h(this.selection)) {
                s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                or2.invoke(this);
            } else if (x()) {
                T(p0.k(this.selection));
            } else {
                T(p0.l(this.selection));
            }
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final T d() {
        getState().b();
        if (w().length() > 0) {
            T(p0.i(this.selection));
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final d getAnnotatedString() {
        return this.annotatedString;
    }

    public final Integer f() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(h(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final Integer i() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(k(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    public final int l() {
        return kotlin.h0.a(this.annotatedString.getText(), p0.i(this.selection));
    }

    public final Integer m() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(o(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final f0 getOffsetMapping() {
        return this.offsetMapping;
    }

    public final int q() {
        return kotlin.h0.b(this.annotatedString.getText(), p0.i(this.selection));
    }

    public final Integer t() {
        TextLayoutResult textLayoutResult = this.layoutResult;
        if (textLayoutResult != null) {
            return Integer.valueOf(s(this, textLayoutResult, 0, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final k0 getState() {
        return this.state;
    }

    public final String w() {
        return this.annotatedString.getText();
    }

    public final T z() {
        TextLayoutResult textLayoutResult;
        if (w().length() > 0 && (textLayoutResult = this.layoutResult) != null) {
            T(y(textLayoutResult, 1));
        }
        s.i(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private b(d dVar, long j11, TextLayoutResult textLayoutResult, f0 f0Var, k0 k0Var) {
        this.originalText = dVar;
        this.originalSelection = j11;
        this.layoutResult = textLayoutResult;
        this.offsetMapping = f0Var;
        this.state = k0Var;
        this.selection = j11;
        this.annotatedString = dVar;
    }
}
