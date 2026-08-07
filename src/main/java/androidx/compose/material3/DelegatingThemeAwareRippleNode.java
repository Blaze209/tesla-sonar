package androidx.compose.material3;

import b4.e1;
import b4.f1;
import b4.h;
import b4.i;
import b4.m;
import ezvcard.property.Gender;
import jn0.h0;
import k3.p1;
import k3.s1;
import n2.RippleAlpha;
import n2.l;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p016o2.RippleConfiguration;
import p016o2.z;
import u1.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "Lb4/m;", "Lb4/h;", "Lb4/e1;", "Lu1/j;", "interactionSource", "", "bounded", "Lw4/h;", "radius", "Lk3/s1;", "color", "<init>", "(Lu1/j;ZFLk3/s1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/h0;", "J2", "()V", "H2", "I2", "h2", "g1", "p", "Lu1/j;", "q", "Z", "r", Gender.FEMALE, "Lk3/s1;", "Lb4/j;", "s", "Lb4/j;", "rippleNode", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DelegatingThemeAwareRippleNode extends m implements h, e1 {
    private final s1 color;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final j interactionSource;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private b4.j rippleNode;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lk3/p1;", "a", "()J"}, k = 3, mv = {1, 8, 0})
    static final class a implements s1 {
        a() {
        }

        @Override // k3.s1
        public final long a() {
            long jA = DelegatingThemeAwareRippleNode.this.color.a();
            if (jA != 16) {
                return jA;
            }
            RippleConfiguration rippleConfiguration = (RippleConfiguration) i.a(DelegatingThemeAwareRippleNode.this, androidx.compose.material3.a.a());
            return (rippleConfiguration == null || rippleConfiguration.getColor() == 16) ? ((p1) i.a(DelegatingThemeAwareRippleNode.this, p016o2.m.a())).getValue() : rippleConfiguration.getColor();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln2/d;", "b", "()Ln2/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements wn0.a<RippleAlpha> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RippleAlpha invoke() {
            RippleAlpha rippleAlpha;
            RippleConfiguration rippleConfiguration = (RippleConfiguration) i.a(DelegatingThemeAwareRippleNode.this, androidx.compose.material3.a.a());
            return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? z.f96318a.a() : rippleAlpha;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements wn0.a<h0> {
        c() {
            super(0);
        }

        public final void b() {
            if (((RippleConfiguration) i.a(DelegatingThemeAwareRippleNode.this, androidx.compose.material3.a.a())) == null) {
                DelegatingThemeAwareRippleNode.this.I2();
            } else if (DelegatingThemeAwareRippleNode.this.rippleNode == null) {
                DelegatingThemeAwareRippleNode.this.H2();
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    public /* synthetic */ DelegatingThemeAwareRippleNode(j jVar, boolean z11, float f11, s1 s1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z11, f11, s1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2() {
        this.rippleNode = x2(l.c(this.interactionSource, this.bounded, this.radius, new a(), new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2() {
        b4.j jVar = this.rippleNode;
        if (jVar != null) {
            A2(jVar);
        }
    }

    private final void J2() {
        f1.a(this, new c());
    }

    @Override // b4.e1
    public void g1() {
        J2();
    }

    @Override // androidx.compose.ui.d.c
    public void h2() {
        J2();
    }

    private DelegatingThemeAwareRippleNode(j jVar, boolean z11, float f11, s1 s1Var) {
        this.interactionSource = jVar;
        this.bounded = z11;
        this.radius = f11;
        this.color = s1Var;
    }
}
