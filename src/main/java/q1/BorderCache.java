package q1;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.i3;
import k3.j1;
import k3.t3;
import k3.w0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: q1.d, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lq1/d;", "", "Lk3/i3;", "imageBitmap", "Lk3/j1;", "canvas", "Lm3/a;", "canvasDrawScope", "Lk3/t3;", "borderPath", "<init>", "(Lk3/i3;Lk3/j1;Lm3/a;Lk3/t3;)V", "g", "()Lk3/t3;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk3/i3;", "b", "Lk3/j1;", "c", "Lm3/a;", DateTokenConverter.CONVERTER_KEY, "Lk3/t3;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final /* data */ class BorderCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private i3 imageBitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private j1 canvas;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private m3.a canvasDrawScope;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private t3 borderPath;

    public BorderCache(i3 i3Var, j1 j1Var, m3.a aVar, t3 t3Var) {
        this.imageBitmap = i3Var;
        this.canvas = j1Var;
        this.canvasDrawScope = aVar;
        this.borderPath = t3Var;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderCache)) {
            return false;
        }
        BorderCache borderCache = (BorderCache) other;
        return p013kotlin.jvm.internal.s.f(this.imageBitmap, borderCache.imageBitmap) && p013kotlin.jvm.internal.s.f(this.canvas, borderCache.canvas) && p013kotlin.jvm.internal.s.f(this.canvasDrawScope, borderCache.canvasDrawScope) && p013kotlin.jvm.internal.s.f(this.borderPath, borderCache.borderPath);
    }

    public final t3 g() {
        t3 t3Var = this.borderPath;
        if (t3Var != null) {
            return t3Var;
        }
        t3 t3VarA = w0.a();
        this.borderPath = t3VarA;
        return t3VarA;
    }

    public int hashCode() {
        i3 i3Var = this.imageBitmap;
        int iHashCode = (i3Var == null ? 0 : i3Var.hashCode()) * 31;
        j1 j1Var = this.canvas;
        int iHashCode2 = (iHashCode + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        m3.a aVar = this.canvasDrawScope;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        t3 t3Var = this.borderPath;
        return iHashCode3 + (t3Var != null ? t3Var.hashCode() : 0);
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.imageBitmap + ", canvas=" + this.canvas + ", canvasDrawScope=" + this.canvasDrawScope + ", borderPath=" + this.borderPath + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ BorderCache(i3 i3Var, j1 j1Var, m3.a aVar, t3 t3Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : i3Var, (i11 & 2) != 0 ? null : j1Var, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? null : t3Var);
    }
}
