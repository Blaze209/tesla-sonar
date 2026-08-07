package cg0;

import android.graphics.Rect;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: cg0.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcg0/c;", "", "Landroid/graphics/Rect;", "region", "viewport", "<init>", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "b", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ViewfinderInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rect region;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Rect viewport;

    public ViewfinderInfo(Rect region, Rect viewport) {
        s.k(region, "region");
        s.k(viewport, "viewport");
        this.region = region;
        this.viewport = viewport;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Rect getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Rect getViewport() {
        return this.viewport;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewfinderInfo)) {
            return false;
        }
        ViewfinderInfo viewfinderInfo = (ViewfinderInfo) other;
        return s.f(this.region, viewfinderInfo.region) && s.f(this.viewport, viewfinderInfo.viewport);
    }

    public int hashCode() {
        return (this.region.hashCode() * 31) + this.viewport.hashCode();
    }

    public String toString() {
        return "ViewfinderInfo(region=" + this.region + ", viewport=" + this.viewport + ")";
    }
}
