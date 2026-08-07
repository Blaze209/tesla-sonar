package androidx.compose.ui.draw;

import androidx.collection.i0;
import androidx.collection.q0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.g3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR.\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/draw/e;", "Lk3/g3;", "<init>", "()V", "Ln3/c;", "a", "()Ln3/c;", "layer", "Ljn0/h0;", "b", "(Ln3/c;)V", DateTokenConverter.CONVERTER_KEY, "Landroidx/collection/i0;", "Landroidx/collection/i0;", "allocatedGraphicsLayers", "value", "Lk3/g3;", "c", "()Lk3/g3;", "e", "(Lk3/g3;)V", "graphicsContext", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class e implements g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private i0<n3.c> allocatedGraphicsLayers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private g3 graphicsContext;

    @Override // k3.g3
    public n3.c a() {
        g3 g3Var = this.graphicsContext;
        if (!(g3Var != null)) {
            y3.a.b("GraphicsContext not provided");
        }
        n3.c cVarA = g3Var.a();
        i0<n3.c> i0Var = this.allocatedGraphicsLayers;
        if (i0Var == null) {
            this.allocatedGraphicsLayers = q0.b(cVarA);
            return cVarA;
        }
        i0Var.g(cVarA);
        return cVarA;
    }

    @Override // k3.g3
    public void b(n3.c layer) {
        g3 g3Var = this.graphicsContext;
        if (g3Var != null) {
            g3Var.b(layer);
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g3 getGraphicsContext() {
        return this.graphicsContext;
    }

    public final void d() {
        i0<n3.c> i0Var = this.allocatedGraphicsLayers;
        if (i0Var != null) {
            Object[] objArr = i0Var.content;
            int i11 = i0Var._size;
            for (int i12 = 0; i12 < i11; i12++) {
                b((n3.c) objArr[i12]);
            }
            i0Var.h();
        }
    }

    public final void e(g3 g3Var) {
        d();
        this.graphicsContext = g3Var;
    }
}
