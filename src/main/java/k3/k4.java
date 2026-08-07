package k3;

import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lk3/k4;", "Lk3/c4;", "Lj3/g;", "center", "", "Lk3/p1;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lj3/m;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "J", "f", "Ljava/util/List;", "g", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k4 extends c4 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long center;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<p1> colors;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Float> stops;

    public /* synthetic */ k4(long j11, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, list2);
    }

    @Override // k3.c4
    public Shader b(long size) {
        long jA;
        if (j3.h.d(this.center)) {
            jA = j3.n.b(size);
        } else {
            jA = j3.h.a(j3.g.m(this.center) == Float.POSITIVE_INFINITY ? j3.m.k(size) : j3.g.m(this.center), j3.g.n(this.center) == Float.POSITIVE_INFINITY ? j3.m.i(size) : j3.g.n(this.center));
        }
        return d4.b(jA, this.colors, this.stops);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) other;
        return j3.g.j(this.center, k4Var.center) && p013kotlin.jvm.internal.s.f(this.colors, k4Var.colors) && p013kotlin.jvm.internal.s.f(this.stops, k4Var.stops);
    }

    public int hashCode() {
        int iO = ((j3.g.o(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        return iO + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        if (j3.h.c(this.center)) {
            str = "center=" + ((Object) j3.g.t(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private k4(long j11, List<p1> list, List<Float> list2) {
        this.center = j11;
        this.colors = list;
        this.stops = list2;
    }
}
