package m3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.j1;
import p013kotlin.Metadata;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\"\u0010\u0007\u001a\u00020\u00028&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010\t\u001a\u0004\u0018\u00010\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lm3/d;", "", "Lj3/m;", "b", "()J", "f", "(J)V", "size", "Lk3/j1;", "<anonymous parameter 0>", "a", "()Lk3/j1;", "h", "(Lk3/j1;)V", "canvas", "Lm3/h;", IntegerTokenConverter.CONVERTER_KEY, "()Lm3/h;", "transform", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "c", "(Lw4/t;)V", "layoutDirection", "Lw4/d;", "getDensity", "()Lw4/d;", DateTokenConverter.CONVERTER_KEY, "(Lw4/d;)V", "density", "Ln3/c;", "g", "()Ln3/c;", "e", "(Ln3/c;)V", "graphicsLayer", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface d {
    default j1 a() {
        return new i();
    }

    long b();

    void f(long j11);

    /* JADX INFO: renamed from: g */
    default n3.c getGraphicsLayer() {
        return null;
    }

    default w4.d getDensity() {
        return e.a();
    }

    default t getLayoutDirection() {
        return t.Ltr;
    }

    /* JADX INFO: renamed from: i */
    h getTransform();

    default void c(t tVar) {
    }

    default void d(w4.d dVar) {
    }

    default void e(n3.c cVar) {
    }

    default void h(j1 j1Var) {
    }
}
