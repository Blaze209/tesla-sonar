package p2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.p1;
import p020r2.s3;
import v1.m0;
import v1.o0;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\rR+\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lp2/e;", "Lv1/m0;", "initialInsets", "<init>", "(Lv1/m0;)V", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "", "c", "(Lw4/d;Lw4/t;)I", DateTokenConverter.CONVERTER_KEY, "(Lw4/d;)I", "a", "b", "<set-?>", "Lr2/p1;", "e", "()Lv1/m0;", "f", "insets", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p1 insets;

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // v1.m0
    public int a(w4.d density, t layoutDirection) {
        return e().a(density, layoutDirection);
    }

    @Override // v1.m0
    public int b(w4.d density) {
        return e().b(density);
    }

    @Override // v1.m0
    public int c(w4.d density, t layoutDirection) {
        return e().c(density, layoutDirection);
    }

    @Override // v1.m0
    public int d(w4.d density) {
        return e().d(density);
    }

    public final m0 e() {
        return (m0) this.insets.getValue();
    }

    public final void f(m0 m0Var) {
        this.insets.setValue(m0Var);
    }

    public e(m0 m0Var) {
        this.insets = s3.d(m0Var, null, 2, null);
    }

    public /* synthetic */ e(m0 m0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? o0.a(0, 0, 0, 0) : m0Var);
    }
}
