package p009i2;

import k3.t3;
import k3.v0;
import k3.w0;
import k3.w3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Li2/n;", "", "Lk3/t3;", "checkPath", "Lk3/w3;", "pathMeasure", "pathToDraw", "<init>", "(Lk3/t3;Lk3/w3;Lk3/t3;)V", "a", "Lk3/t3;", "()Lk3/t3;", "b", "Lk3/w3;", "()Lk3/w3;", "c", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t3 checkPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w3 pathMeasure;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t3 pathToDraw;

    public n() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final t3 getCheckPath() {
        return this.checkPath;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final w3 getPathMeasure() {
        return this.pathMeasure;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t3 getPathToDraw() {
        return this.pathToDraw;
    }

    public n(t3 t3Var, w3 w3Var, t3 t3Var2) {
        this.checkPath = t3Var;
        this.pathMeasure = w3Var;
        this.pathToDraw = t3Var2;
    }

    public /* synthetic */ n(t3 t3Var, w3 w3Var, t3 t3Var2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? w0.a() : t3Var, (i11 & 2) != 0 ? v0.a() : w3Var, (i11 & 4) != 0 ? w0.a() : t3Var2);
    }
}
