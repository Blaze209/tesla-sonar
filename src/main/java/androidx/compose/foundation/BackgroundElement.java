package androidx.compose.foundation;

import androidx.compose.ui.platform.q1;
import b4.s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import jn0.h0;
import k3.g4;
import k3.h1;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lb4/s0;", "Landroidx/compose/foundation/c;", "Lk3/p1;", "color", "Lk3/h1;", "brush", "", "alpha", "Lk3/g4;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/q1;", "Ljn0/h0;", "inspectorInfo", "<init>", "(JLk3/h1;FLk3/g4;Lwn0/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "o", "()Landroidx/compose/foundation/c;", "node", "p", "(Landroidx/compose/foundation/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "Lk3/h1;", DateTokenConverter.CONVERTER_KEY, Gender.FEMALE, "e", "Lk3/g4;", "f", "Lwn0/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BackgroundElement extends s0<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h1 brush;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g4 shape;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<q1, h0> inspectorInfo;

    public /* synthetic */ BackgroundElement(long j11, h1 h1Var, float f11, g4 g4Var, wn0.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, h1Var, f11, g4Var, lVar);
    }

    public boolean equals(Object other) {
        BackgroundElement backgroundElement = other instanceof BackgroundElement ? (BackgroundElement) other : null;
        return backgroundElement != null && p1.r(this.color, backgroundElement.color) && s.f(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && s.f(this.shape, backgroundElement.shape);
    }

    public int hashCode() {
        int iX = p1.x(this.color) * 31;
        h1 h1Var = this.brush;
        return ((((iX + (h1Var != null ? h1Var.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public c i() {
        return new c(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(c node) {
        node.C2(this.color);
        node.B2(this.brush);
        node.a(this.alpha);
        node.T(this.shape);
    }

    public /* synthetic */ BackgroundElement(long j11, h1 h1Var, float f11, g4 g4Var, wn0.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? p1.INSTANCE.j() : j11, (i11 & 2) != 0 ? null : h1Var, f11, g4Var, lVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j11, h1 h1Var, float f11, g4 g4Var, wn0.l<? super q1, h0> lVar) {
        this.color = j11;
        this.brush = h1Var;
        this.alpha = f11;
        this.shape = g4Var;
        this.inspectorInfo = lVar;
    }
}
