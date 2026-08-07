package bg0;

import android.util.Range;
import android.util.Size;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import zf0.u;

/* JADX INFO: renamed from: bg0.i, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b!\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b\u001a\u0010-R\u0017\u00102\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001d\u00101¨\u00063"}, d2 = {"Lbg0/i;", "", "", "id", "Landroid/util/Size;", "size", "", "maxFps", "Landroid/util/Range;", "", "targetFpsRange", "rotation", "Lzf0/u$b;", "facingMode", "Lbg0/l;", "additionalOptions", "<init>", "(Ljava/lang/String;Landroid/util/Size;DLandroid/util/Range;ILzf0/u$b;Lbg0/l;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Landroid/util/Size;", "f", "()Landroid/util/Size;", "c", "D", "getMaxFps", "()D", "Landroid/util/Range;", "g", "()Landroid/util/Range;", "e", "I", "Lzf0/u$b;", "()Lzf0/u$b;", "Lbg0/l;", "()Lbg0/l;", "Lzf0/u;", "h", "Lzf0/u;", "()Lzf0/u;", "cameraProperties", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CameraChoice {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Size size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double maxFps;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Range<Integer> targetFpsRange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rotation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final u.b facingMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ExtraCameraOptions additionalOptions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final u cameraProperties;

    public CameraChoice(String id2, Size size, double d11, Range<Integer> targetFpsRange, int i11, u.b facingMode, ExtraCameraOptions additionalOptions) {
        s.k(id2, "id");
        s.k(size, "size");
        s.k(targetFpsRange, "targetFpsRange");
        s.k(facingMode, "facingMode");
        s.k(additionalOptions, "additionalOptions");
        this.id = id2;
        this.size = size;
        this.maxFps = d11;
        this.targetFpsRange = targetFpsRange;
        this.rotation = i11;
        this.facingMode = facingMode;
        this.additionalOptions = additionalOptions;
        this.cameraProperties = new u(id2, facingMode, size, (int) d11);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ExtraCameraOptions getAdditionalOptions() {
        return this.additionalOptions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u getCameraProperties() {
        return this.cameraProperties;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u.b getFacingMode() {
        return this.facingMode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRotation() {
        return this.rotation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraChoice)) {
            return false;
        }
        CameraChoice cameraChoice = (CameraChoice) other;
        return s.f(this.id, cameraChoice.id) && s.f(this.size, cameraChoice.size) && Double.compare(this.maxFps, cameraChoice.maxFps) == 0 && s.f(this.targetFpsRange, cameraChoice.targetFpsRange) && this.rotation == cameraChoice.rotation && this.facingMode == cameraChoice.facingMode && s.f(this.additionalOptions, cameraChoice.additionalOptions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    public final Range<Integer> g() {
        return this.targetFpsRange;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.size.hashCode()) * 31) + Double.hashCode(this.maxFps)) * 31) + this.targetFpsRange.hashCode()) * 31) + Integer.hashCode(this.rotation)) * 31) + this.facingMode.hashCode()) * 31) + this.additionalOptions.hashCode();
    }

    public String toString() {
        return "CameraChoice(id=" + this.id + ", size=" + this.size + ", maxFps=" + this.maxFps + ", targetFpsRange=" + this.targetFpsRange + ", rotation=" + this.rotation + ", facingMode=" + this.facingMode + ", additionalOptions=" + this.additionalOptions + ")";
    }
}
