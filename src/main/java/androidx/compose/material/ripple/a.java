package androidx.compose.material.ripple;

import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import j3.m;
import jn0.h0;
import k3.f0;
import k3.j1;
import k3.p1;
import kotlinx.coroutines.CoroutineScope;
import n2.RippleAlpha;
import n2.f;
import n2.g;
import n2.h;
import n2.k;
import n2.o;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.r2;
import p020r2.s3;
import p020r2.y3;
import u1.n;

/* JADX INFO: loaded from: classes.dex */
@jn0.e
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0011*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0013J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010(R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010.R/\u00108\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010<\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u00103\u001a\u0004\b2\u00109\"\u0004\b:\u0010;R\u001c\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010AR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00110C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010D\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/material/ripple/a;", "Landroidx/compose/material/ripple/d;", "Lr2/r2;", "Ln2/h;", "", "bounded", "Lw4/h;", "radius", "Lr2/y3;", "Lk3/p1;", "color", "Ln2/d;", "rippleAlpha", "Landroid/view/ViewGroup;", "view", "<init>", "(ZFLr2/y3;Lr2/y3;Landroid/view/ViewGroup;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/h0;", "h", "()V", "Ln2/g;", "j", "()Ln2/g;", "Lm3/c;", "a", "(Lm3/c;)V", "Lu1/n$b;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "b", "(Lu1/n$b;Lkotlinx/coroutines/CoroutineScope;)V", DateTokenConverter.CONVERTER_KEY, "(Lu1/n$b;)V", "onRemembered", "onForgotten", "onAbandoned", "F1", "c", "Z", Gender.FEMALE, "e", "Lr2/y3;", "f", "g", "Landroid/view/ViewGroup;", "Ln2/g;", "rippleContainer", "Ln2/k;", "<set-?>", IntegerTokenConverter.CONVERTER_KEY, "Lr2/p1;", "k", "()Ln2/k;", "m", "(Ln2/k;)V", "rippleHostView", "()Z", "l", "(Z)V", "invalidateTick", "Lj3/m;", "J", "rippleSize", "", "I", "rippleRadius", "Lkotlin/Function0;", "Lwn0/a;", "onInvalidateRipple", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends d implements r2, h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y3<p1> color;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y3<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup view;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private g rippleContainer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p1 rippleHostView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p020r2.p1 invalidateTick;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long rippleSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int rippleRadius;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<h0> onInvalidateRipple;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class C0114a extends u implements wn0.a<h0> {
        C0114a() {
            super(0);
        }

        public final void b() {
            a aVar = a.this;
            aVar.l(!aVar.i());
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public /* synthetic */ a(boolean z11, float f11, y3 y3Var, y3 y3Var2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, f11, y3Var, y3Var2, viewGroup);
    }

    private final void h() {
        g gVar = this.rippleContainer;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        return ((Boolean) this.invalidateTick.getValue()).booleanValue();
    }

    private final g j() {
        g gVar = this.rippleContainer;
        if (gVar != null) {
            s.h(gVar);
            return gVar;
        }
        g gVarC = o.c(this.view);
        this.rippleContainer = gVarC;
        s.h(gVarC);
        return gVarC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final k k() {
        return (k) this.rippleHostView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z11) {
        this.invalidateTick.setValue(Boolean.valueOf(z11));
    }

    private final void m(k kVar) {
        this.rippleHostView.setValue(kVar);
    }

    @Override // n2.h
    public void F1() {
        m(null);
    }

    @Override // q1.d0
    public void a(m3.c cVar) {
        this.rippleSize = cVar.b();
        this.rippleRadius = Float.isNaN(this.radius) ? yn0.a.d(f.a(cVar, this.bounded, cVar.b())) : cVar.i1(this.radius);
        long value = this.color.getValue().getValue();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        cVar.M0();
        c(cVar, this.radius, value);
        j1 j1VarA = cVar.getDrawContext().a();
        i();
        k kVarK = k();
        if (kVarK != null) {
            kVarK.m599setRippleProperties07v42R4(cVar.b(), value, pressedAlpha);
            kVarK.draw(f0.d(j1VarA));
        }
    }

    @Override // androidx.compose.material.ripple.d
    public void b(n.b interaction, CoroutineScope scope) {
        k kVarB = j().b(this);
        kVarB.b(interaction, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().getValue(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        m(kVarB);
    }

    @Override // androidx.compose.material.ripple.d
    public void d(n.b interaction) {
        k kVarK = k();
        if (kVarK != null) {
            kVarK.e();
        }
    }

    @Override // p020r2.r2
    public void onAbandoned() {
        h();
    }

    @Override // p020r2.r2
    public void onForgotten() {
        h();
    }

    @Override // p020r2.r2
    public void onRemembered() {
    }

    private a(boolean z11, float f11, y3<p1> y3Var, y3<RippleAlpha> y3Var2, ViewGroup viewGroup) {
        super(z11, y3Var2);
        this.bounded = z11;
        this.radius = f11;
        this.color = y3Var;
        this.rippleAlpha = y3Var2;
        this.view = viewGroup;
        this.rippleHostView = s3.d(null, null, 2, null);
        this.invalidateTick = s3.d(Boolean.TRUE, null, 2, null);
        this.rippleSize = m.INSTANCE.b();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new C0114a();
    }
}
