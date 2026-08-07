package androidx.compose.foundation;

import b4.s0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import k3.g4;
import k3.h1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "Lb4/s0;", "Lq1/f;", "Lw4/h;", Snapshot.WIDTH, "Lk3/h1;", "brush", "Lk3/g4;", "shape", "<init>", "(FLk3/h1;Lk3/g4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "o", "()Lq1/f;", "node", "Ljn0/h0;", "p", "(Lq1/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", Gender.FEMALE, "getWidth-D9Ej5fM", "()F", "c", "Lk3/h1;", "getBrush", "()Lk3/h1;", DateTokenConverter.CONVERTER_KEY, "Lk3/g4;", "getShape", "()Lk3/g4;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BorderModifierNodeElement extends s0<q1.f> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final h1 brush;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final g4 shape;

    public /* synthetic */ BorderModifierNodeElement(float f11, h1 h1Var, g4 g4Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, h1Var, g4Var);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) other;
        return w4.h.i(this.width, borderModifierNodeElement.width) && s.f(this.brush, borderModifierNodeElement.brush) && s.f(this.shape, borderModifierNodeElement.shape);
    }

    public int hashCode() {
        return (((w4.h.j(this.width) * 31) + this.brush.hashCode()) * 31) + this.shape.hashCode();
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public q1.f i() {
        return new q1.f(this.width, this.brush, this.shape, null);
    }

    @Override // b4.s0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m(q1.f node) {
        node.L2(this.width);
        node.K2(this.brush);
        node.T(this.shape);
    }

    public String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) w4.h.k(this.width)) + ", brush=" + this.brush + ", shape=" + this.shape + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private BorderModifierNodeElement(float f11, h1 h1Var, g4 g4Var) {
        this.width = f11;
        this.brush = h1Var;
        this.shape = g4Var;
    }
}
