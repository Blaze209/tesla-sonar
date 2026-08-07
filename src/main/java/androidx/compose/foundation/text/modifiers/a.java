package androidx.compose.foundation.text.modifiers;

import b4.b0;
import b4.e0;
import b4.m;
import b4.r;
import b4.t;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import g2.g;
import i4.Placeholder;
import i4.TextLayoutResult;
import i4.TextStyle;
import i4.d;
import j3.i;
import java.util.List;
import jn0.h0;
import k3.s1;
import m3.c;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.q;
import wn0.l;
import z3.j0;
import z3.k0;
import z3.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÇ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020\r*\u00020(H\u0016¢\u0006\u0004\b)\u0010*J&\u00101\u001a\u000200*\u00020+2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J#\u00106\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00105\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u00107J#\u00109\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u00107J#\u0010:\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00105\u001a\u00020\u0013H\u0016¢\u0006\u0004\b:\u00107J#\u0010;\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u00107J¦\u0001\u0010=\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010<\u001a\u0004\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0004\b=\u0010>R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010AR\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Landroidx/compose/foundation/text/modifiers/a;", "Lb4/m;", "Lb4/b0;", "Lb4/r;", "Lb4/t;", "Li4/d;", "text", "Li4/r0;", "style", "Ln4/q$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Li4/m0;", "Ljn0/h0;", "onTextLayout", "Lt4/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Li4/d$c;", "Li4/w;", "placeholders", "Lj3/i;", "onPlaceholderLayout", "Lg2/g;", "selectionController", "Lk3/s1;", "overrideColor", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(Li4/d;Li4/r0;Ln4/q$b;Lwn0/l;IZIILjava/util/List;Lwn0/l;Lg2/g;Lk3/s1;Lwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lz3/v;", "coordinates", "P", "(Lz3/v;)V", "Lm3/c;", Gender.FEMALE, "(Lm3/c;)V", "Lz3/k0;", "Lz3/h0;", "measurable", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "c", "(Lz3/k0;Lz3/h0;J)Lz3/j0;", "Lz3/r;", "Lz3/q;", Snapshot.HEIGHT, "B", "(Lz3/r;Lz3/q;I)I", Snapshot.WIDTH, "q", Gender.MALE, "n", "color", "D2", "(Li4/d;Li4/r0;Ljava/util/List;IIZLn4/q$b;ILwn0/l;Lwn0/l;Lg2/g;Lk3/s1;)V", "p", "Lg2/g;", "Lwn0/l;", "Landroidx/compose/foundation/text/modifiers/b;", "r", "Landroidx/compose/foundation/text/modifiers/b;", "delegate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends m implements b0, r, t {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private g selectionController;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private l<? super b.TextSubstitutionValue, h0> onShowTranslation;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final b delegate;

    public /* synthetic */ a(d dVar, TextStyle textStyle, q.b bVar, l lVar, int i11, boolean z11, int i12, int i13, List list, l lVar2, g gVar, s1 s1Var, l lVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, textStyle, bVar, lVar, i11, z11, i12, i13, list, lVar2, gVar, s1Var, lVar3);
    }

    @Override // b4.b0
    public int B(z3.r rVar, z3.q qVar, int i11) {
        return this.delegate.O2(rVar, qVar, i11);
    }

    public final void D2(d text, TextStyle style, List<d.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, q.b fontFamilyResolver, int overflow, l<? super TextLayoutResult, h0> onTextLayout, l<? super List<i>, h0> onPlaceholderLayout, g selectionController, s1 color) {
        b bVar = this.delegate;
        bVar.E2(bVar.R2(color, style), this.delegate.T2(text), this.delegate.S2(style, placeholders, minLines, maxLines, softWrap, fontFamilyResolver, overflow), this.delegate.Q2(onTextLayout, onPlaceholderLayout, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        e0.b(this);
    }

    @Override // b4.r
    public void F(c cVar) {
        this.delegate.F2(cVar);
    }

    @Override // b4.b0
    public int M(z3.r rVar, z3.q qVar, int i11) {
        return this.delegate.L2(rVar, qVar, i11);
    }

    @Override // b4.t
    public void P(v coordinates) {
        g gVar = this.selectionController;
        if (gVar != null) {
            gVar.d(coordinates);
        }
    }

    @Override // b4.b0
    public j0 c(k0 k0Var, z3.h0 h0Var, long j11) {
        return this.delegate.M2(k0Var, h0Var, j11);
    }

    @Override // b4.b0
    public int n(z3.r rVar, z3.q qVar, int i11) {
        return this.delegate.K2(rVar, qVar, i11);
    }

    @Override // b4.b0
    public int q(z3.r rVar, z3.q qVar, int i11) {
        return this.delegate.N2(rVar, qVar, i11);
    }

    public /* synthetic */ a(d dVar, TextStyle textStyle, q.b bVar, l lVar, int i11, boolean z11, int i12, int i13, List list, l lVar2, g gVar, s1 s1Var, l lVar3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, textStyle, bVar, (i14 & 8) != 0 ? null : lVar, (i14 & 16) != 0 ? t4.t.INSTANCE.a() : i11, (i14 & 32) != 0 ? true : z11, (i14 & 64) != 0 ? Integer.MAX_VALUE : i12, (i14 & 128) != 0 ? 1 : i13, (i14 & 256) != 0 ? null : list, (i14 & 512) != 0 ? null : lVar2, (i14 & 1024) != 0 ? null : gVar, (i14 & 2048) != 0 ? null : s1Var, (i14 & 4096) != 0 ? null : lVar3, null);
    }

    private a(d dVar, TextStyle textStyle, q.b bVar, l<? super TextLayoutResult, h0> lVar, int i11, boolean z11, int i12, int i13, List<d.Range<Placeholder>> list, l<? super List<i>, h0> lVar2, g gVar, s1 s1Var, l<? super b.TextSubstitutionValue, h0> lVar3) {
        this.selectionController = gVar;
        this.onShowTranslation = lVar3;
        this.delegate = (b) x2(new b(dVar, textStyle, bVar, lVar, i11, z11, i12, i13, list, lVar2, this.selectionController, s1Var, this.onShowTranslation, null));
        if (this.selectionController == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }
}
