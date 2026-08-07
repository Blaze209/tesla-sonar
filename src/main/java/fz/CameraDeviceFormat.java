package fz;

import android.util.Size;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import dz.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z0.a0;

/* JADX INFO: renamed from: fz.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b'\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 O2\u00020\u0001:\u0001%B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b,\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b(\u0010/R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b%\u0010/R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u0010/R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u0010/R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u0010/R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b3\u00109R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b-\u0010@R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bA\u0010?\u001a\u0004\bB\u0010@R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bC\u0010?\u001a\u0004\bD\u0010@R \u0010I\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0011\u0010K\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b*\u0010JR\u0011\u0010L\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b1\u0010JR\u0011\u0010N\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b0\u0010M¨\u0006P"}, d2 = {"Lfz/b;", "", "", "videoWidth", "videoHeight", "photoWidth", "photoHeight", "", "minFps", "maxFps", "minISO", "maxISO", "fieldOfView", "", "Lfz/y;", "videoStabilizationModes", "Lfz/a;", "autoFocusSystem", "", "supportsVideoHdr", "supportsPhotoHdr", "supportsDepthCapture", "<init>", "(IIIIDDDDDLjava/util/List;Lfz/a;ZZZ)V", "Landroid/util/Size;", "size", "Lz0/a0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/util/Size;)Lz0/a0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getVideoWidth", "b", "getVideoHeight", "c", "getPhotoWidth", "getPhotoHeight", "e", "D", "()D", "f", "g", "getMinISO", "h", "getMaxISO", IntegerTokenConverter.CONVERTER_KEY, "getFieldOfView", "j", "Ljava/util/List;", "()Ljava/util/List;", "k", "Lfz/a;", "getAutoFocusSystem", "()Lfz/a;", "l", "Z", "()Z", "m", "getSupportsPhotoHdr", "n", "getSupportsDepthCapture", "", "Lz0/x;", "o", "Ljava/util/Map;", "qualitySizes", "()Landroid/util/Size;", "photoSize", "videoSize", "()Lz0/a0;", "videoQualitySelector", "p", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CameraDeviceFormat {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int videoWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int videoHeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int photoWidth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int photoHeight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double minFps;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double maxFps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double minISO;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double maxISO;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final double fieldOfView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<y> videoStabilizationModes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final a autoFocusSystem;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean supportsVideoHdr;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean supportsPhotoHdr;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean supportsDepthCapture;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<z0.x, Integer> qualitySizes;

    /* JADX INFO: renamed from: fz.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfz/b$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "value", "Lfz/b;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lfz/b;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CameraDeviceFormat a(ReadableMap value) throws x0 {
            p013kotlin.jvm.internal.s.k(value, "value");
            ReadableArray array = value.getArray("videoStabilizationModes");
            if (array == null) {
                throw new x0("format", value.toString());
            }
            ArrayList<Object> arrayList = array.toArrayList();
            ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
            for (Object obj : arrayList) {
                y.Companion companion = y.INSTANCE;
                p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
                arrayList2.add(companion.a((String) obj));
            }
            return new CameraDeviceFormat(value.getInt("videoWidth"), value.getInt("videoHeight"), value.getInt("photoWidth"), value.getInt("photoHeight"), value.getDouble("minFps"), value.getDouble("maxFps"), value.getDouble("minISO"), value.getDouble("maxISO"), value.getDouble("fieldOfView"), arrayList2, a.INSTANCE.a(value.getString("autoFocusSystem")), value.getBoolean("supportsVideoHdr"), value.getBoolean("supportsPhotoHdr"), value.getBoolean("supportsDepthCapture"));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CameraDeviceFormat(int i11, int i12, int i13, int i14, double d11, double d12, double d13, double d14, double d15, List<? extends y> videoStabilizationModes, a autoFocusSystem, boolean z11, boolean z12, boolean z13) {
        p013kotlin.jvm.internal.s.k(videoStabilizationModes, "videoStabilizationModes");
        p013kotlin.jvm.internal.s.k(autoFocusSystem, "autoFocusSystem");
        this.videoWidth = i11;
        this.videoHeight = i12;
        this.photoWidth = i13;
        this.photoHeight = i14;
        this.minFps = d11;
        this.maxFps = d12;
        this.minISO = d13;
        this.maxISO = d14;
        this.fieldOfView = d15;
        this.videoStabilizationModes = videoStabilizationModes;
        this.autoFocusSystem = autoFocusSystem;
        this.supportsVideoHdr = z11;
        this.supportsPhotoHdr = z12;
        this.supportsDepthCapture = z13;
        this.qualitySizes = v0.m(jn0.x.a(z0.x.f126357a, 345600), jn0.x.a(z0.x.f126358b, 921600), jn0.x.a(z0.x.f126359c, 2073600), jn0.x.a(z0.x.f126360d, 8294400));
    }

    private final a0 d(Size size) {
        int width = size.getWidth() * size.getHeight();
        Iterator<T> it = this.qualitySizes.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iAbs = Math.abs(width - ((Number) ((Map.Entry) next).getValue()).intValue());
            do {
                Object next2 = it.next();
                int iAbs2 = Math.abs(width - ((Number) ((Map.Entry) next2).getValue()).intValue());
                if (iAbs > iAbs2) {
                    next = next2;
                    iAbs = iAbs2;
                }
            } while (it.hasNext());
        }
        z0.x xVar = (z0.x) ((Map.Entry) next).getKey();
        a0 a0VarD = a0.d(xVar, z0.p.a(xVar));
        p013kotlin.jvm.internal.s.j(a0VarD, "from(...)");
        return a0VarD;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getMaxFps() {
        return this.maxFps;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getMinFps() {
        return this.minFps;
    }

    public final Size c() {
        return new Size(this.photoWidth, this.photoHeight);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSupportsVideoHdr() {
        return this.supportsVideoHdr;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraDeviceFormat)) {
            return false;
        }
        CameraDeviceFormat cameraDeviceFormat = (CameraDeviceFormat) other;
        return this.videoWidth == cameraDeviceFormat.videoWidth && this.videoHeight == cameraDeviceFormat.videoHeight && this.photoWidth == cameraDeviceFormat.photoWidth && this.photoHeight == cameraDeviceFormat.photoHeight && Double.compare(this.minFps, cameraDeviceFormat.minFps) == 0 && Double.compare(this.maxFps, cameraDeviceFormat.maxFps) == 0 && Double.compare(this.minISO, cameraDeviceFormat.minISO) == 0 && Double.compare(this.maxISO, cameraDeviceFormat.maxISO) == 0 && Double.compare(this.fieldOfView, cameraDeviceFormat.fieldOfView) == 0 && p013kotlin.jvm.internal.s.f(this.videoStabilizationModes, cameraDeviceFormat.videoStabilizationModes) && this.autoFocusSystem == cameraDeviceFormat.autoFocusSystem && this.supportsVideoHdr == cameraDeviceFormat.supportsVideoHdr && this.supportsPhotoHdr == cameraDeviceFormat.supportsPhotoHdr && this.supportsDepthCapture == cameraDeviceFormat.supportsDepthCapture;
    }

    public final a0 f() {
        return d(g());
    }

    public final Size g() {
        return new Size(this.videoWidth, this.videoHeight);
    }

    public final List<y> h() {
        return this.videoStabilizationModes;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Integer.hashCode(this.videoWidth) * 31) + Integer.hashCode(this.videoHeight)) * 31) + Integer.hashCode(this.photoWidth)) * 31) + Integer.hashCode(this.photoHeight)) * 31) + Double.hashCode(this.minFps)) * 31) + Double.hashCode(this.maxFps)) * 31) + Double.hashCode(this.minISO)) * 31) + Double.hashCode(this.maxISO)) * 31) + Double.hashCode(this.fieldOfView)) * 31) + this.videoStabilizationModes.hashCode()) * 31) + this.autoFocusSystem.hashCode()) * 31) + Boolean.hashCode(this.supportsVideoHdr)) * 31) + Boolean.hashCode(this.supportsPhotoHdr)) * 31) + Boolean.hashCode(this.supportsDepthCapture);
    }

    public String toString() {
        return "CameraDeviceFormat(videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", photoWidth=" + this.photoWidth + ", photoHeight=" + this.photoHeight + ", minFps=" + this.minFps + ", maxFps=" + this.maxFps + ", minISO=" + this.minISO + ", maxISO=" + this.maxISO + ", fieldOfView=" + this.fieldOfView + ", videoStabilizationModes=" + this.videoStabilizationModes + ", autoFocusSystem=" + this.autoFocusSystem + ", supportsVideoHdr=" + this.supportsVideoHdr + ", supportsPhotoHdr=" + this.supportsPhotoHdr + ", supportsDepthCapture=" + this.supportsDepthCapture + ")";
    }
}
