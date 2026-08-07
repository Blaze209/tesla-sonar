package androidx.compose.material.ripple;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b4.i;
import b4.s;
import jn0.h0;
import k3.f0;
import k3.j1;
import k3.s1;
import m3.f;
import n2.RippleAlpha;
import n2.g;
import n2.h;
import n2.k;
import n2.o;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import u1.j;
import u1.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/material/ripple/b;", "Landroidx/compose/material/ripple/RippleNode;", "Ln2/h;", "Lu1/j;", "interactionSource", "", "bounded", "Lw4/h;", "radius", "Lk3/s1;", "color", "Lkotlin/Function0;", "Ln2/d;", "rippleAlpha", "<init>", "(Lu1/j;ZFLk3/s1;Lwn0/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ln2/g;", "L2", "()Ln2/g;", "Lm3/f;", "Ljn0/h0;", "D2", "(Lm3/f;)V", "Lu1/n$b;", "interaction", "Lj3/m;", "size", "", "targetRadius", "C2", "(Lu1/n$b;JF)V", "J2", "(Lu1/n$b;)V", "i2", "()V", "F1", "x", "Ln2/g;", "rippleContainer", "Ln2/k;", "value", "y", "Ln2/k;", "M2", "(Ln2/k;)V", "rippleHostView", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends RippleNode implements h {

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private g rippleContainer;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private k rippleHostView;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<h0> {
        a() {
            super(0);
        }

        public final void b() {
            s.a(b.this);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public /* synthetic */ b(j jVar, boolean z11, float f11, s1 s1Var, wn0.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z11, f11, s1Var, aVar);
    }

    private final g L2() {
        g gVar = this.rippleContainer;
        if (gVar != null) {
            p013kotlin.jvm.internal.s.h(gVar);
            return gVar;
        }
        g gVarC = o.c(o.e((View) i.a(this, AndroidCompositionLocals_androidKt.k())));
        this.rippleContainer = gVarC;
        p013kotlin.jvm.internal.s.h(gVarC);
        return gVarC;
    }

    private final void M2(k kVar) {
        this.rippleHostView = kVar;
        s.a(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void C2(n.b interaction, long size, float targetRadius) {
        k kVarB = L2().b(this);
        kVarB.b(interaction, getBounded(), size, yn0.a.d(targetRadius), G2(), F2().invoke().getPressedAlpha(), new a());
        M2(kVarB);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void D2(f fVar) {
        j1 j1VarA = fVar.getDrawContext().a();
        k kVar = this.rippleHostView;
        if (kVar != null) {
            kVar.m599setRippleProperties07v42R4(getRippleSize(), G2(), F2().invoke().getPressedAlpha());
            kVar.draw(f0.d(j1VarA));
        }
    }

    @Override // n2.h
    public void F1() {
        M2(null);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void J2(n.b interaction) {
        k kVar = this.rippleHostView;
        if (kVar != null) {
            kVar.e();
        }
    }

    @Override // androidx.compose.ui.d.c
    public void i2() {
        g gVar = this.rippleContainer;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    private b(j jVar, boolean z11, float f11, s1 s1Var, wn0.a<RippleAlpha> aVar) {
        super(jVar, z11, f11, s1Var, aVar, null);
    }
}
