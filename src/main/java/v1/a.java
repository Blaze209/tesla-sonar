package v1;

import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p020r2.p1;
import p020r2.s3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R+\u0010+\u001a\u00020$2\u0006\u0010%\u001a\u00020$8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010,\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lv1/a;", "Lv1/m0;", "", "type", "", "name", "<init>", "(ILjava/lang/String;)V", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "c", "(Lw4/d;Lw4/t;)I", DateTokenConverter.CONVERTER_KEY, "(Lw4/d;)I", "a", "b", "Landroidx/core/view/WindowInsetsCompat;", "windowInsetsCompat", "typeMask", "Ljn0/h0;", "h", "(Landroidx/core/view/WindowInsetsCompat;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "I", "getType$foundation_layout_release", "Ljava/lang/String;", "Lk5/e;", "<set-?>", "Lr2/p1;", "e", "()Lk5/e;", "f", "(Lk5/e;)V", "insets", "isVisible", "()Z", "g", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1 insets = s3.d(k5.e.f84923e, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p1 isVisible = s3.d(Boolean.TRUE, null, 2, null);

    public a(int i11, String str) {
        this.type = i11;
        this.name = str;
    }

    private final void g(boolean z11) {
        this.isVisible.setValue(Boolean.valueOf(z11));
    }

    @Override // v1.m0
    public int a(w4.d density, w4.t layoutDirection) {
        return e().f84926c;
    }

    @Override // v1.m0
    public int b(w4.d density) {
        return e().f84927d;
    }

    @Override // v1.m0
    public int c(w4.d density, w4.t layoutDirection) {
        return e().f84924a;
    }

    @Override // v1.m0
    public int d(w4.d density) {
        return e().f84925b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k5.e e() {
        return (k5.e) this.insets.getValue();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof a) && this.type == ((a) other).type;
    }

    public final void f(k5.e eVar) {
        this.insets.setValue(eVar);
    }

    public final void h(WindowInsetsCompat windowInsetsCompat, int typeMask) {
        if (typeMask == 0 || (typeMask & this.type) != 0) {
            f(windowInsetsCompat.f(this.type));
            g(windowInsetsCompat.q(this.type));
        }
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getType() {
        return this.type;
    }

    public String toString() {
        return this.name + CoreConstants.LEFT_PARENTHESIS_CHAR + e().f84924a + ", " + e().f84925b + ", " + e().f84926c + ", " + e().f84927d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
