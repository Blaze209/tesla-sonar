package kotlin;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import o4.TransformedText;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p021s1.p;
import w4.b;
import wn0.l;
import z3.b0;
import z3.j0;
import z3.k0;
import z3.w0;

/* JADX INFO: renamed from: b2.s1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lb2/s1;", "Lz3/b0;", "Lb2/y0;", "scrollerPosition", "", "cursorOffset", "Lo4/x0;", "transformedText", "Lkotlin/Function0;", "Lb2/c1;", "textLayoutResultProvider", "<init>", "(Lb2/y0;ILo4/x0;Lwn0/a;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lb2/y0;", "m", "()Lb2/y0;", "I", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "Lo4/x0;", "p", "()Lo4/x0;", "e", "Lwn0/a;", "o", "()Lwn0/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class VerticalScrollLayoutModifier implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final y0 scrollerPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cursorOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransformedText transformedText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<c1> textLayoutResultProvider;

    /* JADX INFO: renamed from: b2.s1$a */
    @p013kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz3/w0$a;", "Ljn0/h0;", "a", "(Lz3/w0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements l<w0.a, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0 f15865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ VerticalScrollLayoutModifier f15866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ w0 f15867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f15868f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k0 k0Var, VerticalScrollLayoutModifier verticalScrollLayoutModifier, w0 w0Var, int i11) {
            super(1);
            this.f15865c = k0Var;
            this.f15866d = verticalScrollLayoutModifier;
            this.f15867e = w0Var;
            this.f15868f = i11;
        }

        public final void a(w0.a aVar) {
            k0 k0Var = this.f15865c;
            int cursorOffset = this.f15866d.getCursorOffset();
            TransformedText transformedText = this.f15866d.getTransformedText();
            c1 c1VarInvoke = this.f15866d.o().invoke();
            this.f15866d.getScrollerPosition().j(p.Vertical, x0.b(k0Var, cursorOffset, transformedText, c1VarInvoke != null ? c1VarInvoke.getValue() : null, false, this.f15867e.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String()), this.f15868f, this.f15867e.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
            w0.a.l(aVar, this.f15867e, 0, Math.round(-this.f15866d.getScrollerPosition().d()), BitmapDescriptorFactory.HUE_RED, 4, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(w0.a aVar) {
            a(aVar);
            return h0.f84049a;
        }
    }

    public VerticalScrollLayoutModifier(y0 y0Var, int i11, TransformedText transformedText, wn0.a<c1> aVar) {
        this.scrollerPosition = y0Var;
        this.cursorOffset = i11;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = aVar;
    }

    @Override // z3.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        w0 w0VarX0 = h0Var.x0(b.d(j11, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int iMin = Math.min(w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String(), b.k(j11));
        return k0.N1(k0Var, w0VarX0.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), iMin, null, new a(k0Var, this, w0VarX0, iMin), 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) other;
        return s.f(this.scrollerPosition, verticalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && s.f(this.transformedText, verticalScrollLayoutModifier.transformedText) && s.f(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider);
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + Integer.hashCode(this.cursorOffset)) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final y0 getScrollerPosition() {
        return this.scrollerPosition;
    }

    public final wn0.a<c1> o() {
        return this.textLayoutResultProvider;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
