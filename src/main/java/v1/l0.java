package v1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR+\u0010$\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lv1/l0;", "Lv1/m0;", "Lv1/u;", "insets", "", "name", "<init>", "(Lv1/u;Ljava/lang/String;)V", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "", "c", "(Lw4/d;Lw4/t;)I", DateTokenConverter.CONVERTER_KEY, "(Lw4/d;)I", "a", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName", "<set-?>", "Lr2/p1;", "e", "()Lv1/u;", "f", "(Lv1/u;)V", "value", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l0 implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p1 value;

    public l0(InsetsValues insetsValues, String str) {
        this.name = str;
        this.value = s3.d(insetsValues, null, 2, null);
    }

    @Override // v1.m0
    public int a(w4.d density, w4.t layoutDirection) {
        return e().getRight();
    }

    @Override // v1.m0
    public int b(w4.d density) {
        return e().getBottom();
    }

    @Override // v1.m0
    public int c(w4.d density, w4.t layoutDirection) {
        return e().getLeft();
    }

    @Override // v1.m0
    public int d(w4.d density) {
        return e().getTop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InsetsValues e() {
        return (InsetsValues) this.value.getValue();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof l0) {
            return p013kotlin.jvm.internal.s.f(e(), ((l0) other).e());
        }
        return false;
    }

    public final void f(InsetsValues insetsValues) {
        this.value.setValue(insetsValues);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name + "(left=" + e().getLeft() + ", top=" + e().getTop() + ", right=" + e().getRight() + ", bottom=" + e().getBottom() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
