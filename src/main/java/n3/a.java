package n3;

import androidx.collection.l0;
import androidx.collection.w0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.l3;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ln3/a;", "", "<init>", "()V", "Ln3/c;", "graphicsLayer", "", IntegerTokenConverter.CONVERTER_KEY, "(Ln3/c;)Z", "a", "Ln3/c;", "dependency", "b", "oldDependency", "Landroidx/collection/l0;", "c", "Landroidx/collection/l0;", "dependenciesSet", DateTokenConverter.CONVERTER_KEY, "oldDependenciesSet", "e", "Z", "trackingInProgress", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private c dependency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private c oldDependency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private l0<c> dependenciesSet;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private l0<c> oldDependenciesSet;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean trackingInProgress;

    public final boolean i(c graphicsLayer) {
        if (!this.trackingInProgress) {
            l3.a("Only add dependencies during a tracking");
        }
        l0<c> l0Var = this.dependenciesSet;
        if (l0Var != null) {
            p013kotlin.jvm.internal.s.h(l0Var);
            l0Var.h(graphicsLayer);
        } else if (this.dependency != null) {
            l0<c> l0VarA = w0.a();
            c cVar = this.dependency;
            p013kotlin.jvm.internal.s.h(cVar);
            l0VarA.h(cVar);
            l0VarA.h(graphicsLayer);
            this.dependenciesSet = l0VarA;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        l0<c> l0Var2 = this.oldDependenciesSet;
        if (l0Var2 != null) {
            p013kotlin.jvm.internal.s.h(l0Var2);
            return !l0Var2.x(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }
}
