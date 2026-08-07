package t4;

import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import k3.c4;
import k3.h1;
import k3.p1;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: t4.c, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001a8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lt4/c;", "Lt4/n;", "Lk3/c4;", "value", "", "alpha", "<init>", "(Lk3/c4;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lk3/c4;", "f", "()Lk3/c4;", "c", Gender.FEMALE, "()F", "Lk3/p1;", "()J", "color", "Lk3/h1;", "e", "()Lk3/h1;", "brush", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class BrushStyle implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c4 value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    public BrushStyle(c4 c4Var, float f11) {
        this.value = c4Var;
        this.alpha = f11;
    }

    @Override // t4.n
    /* JADX INFO: renamed from: b, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // t4.n
    /* JADX INFO: renamed from: c */
    public long getValue() {
        return p1.INSTANCE.j();
    }

    @Override // t4.n
    public h1 e() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) other;
        return p013kotlin.jvm.internal.s.f(this.value, brushStyle.value) && Float.compare(this.alpha, brushStyle.alpha) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c4 getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.hashCode(this.alpha);
    }

    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + this.alpha + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
