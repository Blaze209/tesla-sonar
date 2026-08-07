package dz;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import androidx.camera.extensions.ExtensionsManager;
import c0.d2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 m2\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\nJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010\u001aJ\r\u0010-\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010/R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00104R\u0014\u00106\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00101R\u0014\u00108\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010:\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00109R\u0014\u0010;\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00109R\u001c\u0010>\u001a\n <*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010=R\u001c\u0010?\u001a\n <*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010=R\u0014\u0010@\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107R\u0014\u0010A\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u00107R\u0014\u0010B\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u00107R\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u00107R\u0014\u0010S\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u0004\u0018\u00010\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\"\u0010c\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u000100000`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u00107R\u0016\u0010g\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010=R\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010n\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010mR\u0014\u0010u\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u00107R\u0014\u0010w\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u00107¨\u0006x"}, d2 = {"Ldz/b;", "", "Lc0/n;", "cameraInfo", "Landroidx/camera/extensions/ExtensionsManager;", "extensionsManager", "<init>", "(Lc0/n;Landroidx/camera/extensions/ExtensionsManager;)V", "Lcom/facebook/react/bridge/ReadableArray;", "e", "()Lcom/facebook/react/bridge/ReadableArray;", "Landroid/util/Size;", "photoSize", "videoSize", "Landroid/util/Range;", "", "fpsRange", "Lcom/facebook/react/bridge/ReadableMap;", "a", "(Landroid/util/Size;Landroid/util/Size;Landroid/util/Range;)Lcom/facebook/react/bridge/ReadableMap;", "", "j", "()Z", "k", "", IntegerTokenConverter.CONVERTER_KEY, "()D", "f", "()Landroid/util/Range;", "b", "", "Lfz/e;", "c", "()Ljava/util/List;", "", "focalLength", "Landroid/util/SizeF;", "sensorSize", DateTokenConverter.CONVERTER_KEY, "(FLandroid/util/SizeF;)D", "", "focalLengths", "h", "([FLandroid/util/SizeF;)D", "g", "l", "()Lcom/facebook/react/bridge/ReadableMap;", "Lc0/n;", "", "Ljava/lang/String;", "cameraId", "Lfz/m;", "Lfz/m;", "position", "name", "Z", "hasFlash", Gender.FEMALE, "minZoom", "maxZoom", "kotlin.jvm.PlatformType", "Ljava/lang/Integer;", "minExposure", "maxExposure", "supportsFocus", "supportsRawCapture", "supportsDepthCapture", "Lfz/a;", "m", "Lfz/a;", "autoFocusSystem", "Lc0/i1;", "n", "Lc0/i1;", "previewCapabilities", "Lz0/j1;", "o", "Lz0/j1;", "videoCapabilities", "p", "supports10BitHdr", "q", "I", "sensorRotationDegrees", "Lfz/i;", "r", "Lfz/i;", "sensorOrientation", "Landroidx/camera/core/impl/i0;", "s", "Landroidx/camera/core/impl/i0;", "cameraInfoInternal", "Lv/x0;", "t", "Lv/x0;", "camera2Details", "", "u", "Ljava/util/Set;", "physicalDeviceIds", "v", "isMultiCam", "w", "cameraHardwareLevel", "Lfz/g;", "x", "Lfz/g;", "hardwareLevel", "y", "D", "minFocusDistance", "z", "Landroid/util/Range;", "isoRange", "A", "maxFieldOfView", "B", "supportsHdrExtension", "C", "supportsLowLightBoostExtension", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
public final class b {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final double maxFieldOfView;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final boolean supportsHdrExtension;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final boolean supportsLowLightBoostExtension;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0.n cameraInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String cameraId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final fz.m position;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean hasFlash;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float minZoom;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float maxZoom;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Integer minExposure;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Integer maxExposure;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsFocus;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsRawCapture;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsDepthCapture;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final fz.a autoFocusSystem;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final c0.i1 previewCapabilities;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final z0.j1 videoCapabilities;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean supports10BitHdr;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int sensorRotationDegrees;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final fz.i sensorOrientation;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final androidx.camera.core.impl.i0 cameraInfoInternal;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final v.x0 camera2Details;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Set<String> physicalDeviceIds;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final boolean isMultiCam;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Integer cameraHardwareLevel;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final fz.g hardwareLevel;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final double minFocusDistance;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Range<Integer> isoRange;

    public b(c0.n cameraInfo, ExtensionsManager extensionsManager) throws f1 {
        w.z zVarB;
        Map<String, CameraCharacteristics> mapC;
        p013kotlin.jvm.internal.s.k(cameraInfo, "cameraInfo");
        p013kotlin.jvm.internal.s.k(extensionsManager, "extensionsManager");
        this.cameraInfo = cameraInfo;
        String strA = ez.a.a(cameraInfo);
        if (strA == null) {
            throw new f1();
        }
        this.cameraId = strA;
        fz.m mVarA = fz.m.INSTANCE.a(cameraInfo.f());
        this.position = mVarA;
        this.name = strA + " (" + mVarA + ") " + cameraInfo.x();
        this.hasFlash = cameraInfo.q();
        d2 value = cameraInfo.l().getValue();
        this.minZoom = value != null ? value.c() : BitmapDescriptorFactory.HUE_RED;
        d2 value2 = cameraInfo.l().getValue();
        this.maxZoom = value2 != null ? value2.a() : 1.0f;
        this.minExposure = (Integer) cameraInfo.v().b().getLower();
        this.maxExposure = (Integer) cameraInfo.v().b().getUpper();
        boolean zK = k();
        this.supportsFocus = zK;
        this.autoFocusSystem = zK ? fz.a.CONTRAST_DETECTION : fz.a.NONE;
        c0.i1 i1VarB = f0.a.b(cameraInfo);
        p013kotlin.jvm.internal.s.j(i1VarB, "from(...)");
        this.previewCapabilities = i1VarB;
        z0.j1 j1VarL = z0.t0.L(cameraInfo, 0);
        p013kotlin.jvm.internal.s.j(j1VarL, "getVideoCapabilities(...)");
        this.videoCapabilities = j1VarL;
        this.supports10BitHdr = j();
        int iM = cameraInfo.m();
        this.sensorRotationDegrees = iM;
        this.sensorOrientation = fz.i.INSTANCE.a(iM);
        p013kotlin.jvm.internal.s.i(cameraInfo, "null cannot be cast to non-null type androidx.camera.core.impl.CameraInfoInternal");
        this.cameraInfoInternal = (androidx.camera.core.impl.i0) cameraInfo;
        Integer num = null;
        v.x0 x0Var = cameraInfo instanceof v.x0 ? (v.x0) cameraInfo : null;
        this.camera2Details = x0Var;
        Set<String> setD = (x0Var == null || (mapC = x0Var.C()) == null || (setD = mapC.keySet()) == null) ? p013kotlin.collections.d1.d() : setD;
        this.physicalDeviceIds = setD;
        this.isMultiCam = setD.size() > 1;
        if (x0Var != null && (zVarB = x0Var.B()) != null) {
            num = (Integer) zVarB.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        }
        this.cameraHardwareLevel = num;
        this.hardwareLevel = fz.g.INSTANCE.a(num != null ? num.intValue() : 2);
        this.minFocusDistance = i();
        this.isoRange = f();
        this.maxFieldOfView = g();
        this.supportsHdrExtension = extensionsManager.f(cameraInfo.c(), 2);
        this.supportsLowLightBoostExtension = extensionsManager.f(cameraInfo.c(), 3);
    }

    private final ReadableMap a(Size photoSize, Size videoSize, Range<Integer> fpsRange) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("photoHeight", photoSize.getHeight());
        writableMapCreateMap.putInt("photoWidth", photoSize.getWidth());
        writableMapCreateMap.putInt("videoHeight", videoSize.getHeight());
        writableMapCreateMap.putInt("videoWidth", videoSize.getWidth());
        Object lower = fpsRange.getLower();
        p013kotlin.jvm.internal.s.j(lower, "getLower(...)");
        writableMapCreateMap.putInt("minFps", ((Number) lower).intValue());
        Object upper = fpsRange.getUpper();
        p013kotlin.jvm.internal.s.j(upper, "getUpper(...)");
        writableMapCreateMap.putInt("maxFps", ((Number) upper).intValue());
        Object lower2 = this.isoRange.getLower();
        p013kotlin.jvm.internal.s.j(lower2, "getLower(...)");
        writableMapCreateMap.putInt("minISO", ((Number) lower2).intValue());
        Object upper2 = this.isoRange.getUpper();
        p013kotlin.jvm.internal.s.j(upper2, "getUpper(...)");
        writableMapCreateMap.putInt("maxISO", ((Number) upper2).intValue());
        writableMapCreateMap.putDouble("fieldOfView", this.maxFieldOfView);
        writableMapCreateMap.putBoolean("supportsVideoHdr", this.supports10BitHdr);
        writableMapCreateMap.putBoolean("supportsPhotoHdr", this.supportsHdrExtension);
        writableMapCreateMap.putBoolean("supportsDepthCapture", this.supportsDepthCapture);
        writableMapCreateMap.putString("autoFocusSystem", this.autoFocusSystem.getUnionValue());
        writableMapCreateMap.putArray("videoStabilizationModes", b());
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    private final ReadableArray b() {
        Set setG = p013kotlin.collections.d1.g(fz.y.OFF);
        if (this.videoCapabilities.a()) {
            setG.add(fz.y.CINEMATIC);
        }
        if (this.previewCapabilities.a()) {
            setG.add(fz.y.CINEMATIC_EXTENDED);
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = setG.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(((fz.y) it.next()).getUnionValue());
        }
        p013kotlin.jvm.internal.s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    private final List<fz.e> c() {
        fz.e eVar;
        List<fz.e> listE = p013kotlin.collections.v.e(fz.e.WIDE_ANGLE);
        v.x0 x0Var = this.camera2Details;
        if (x0Var == null) {
            return listE;
        }
        Map<String, CameraCharacteristics> mapC = x0Var.C();
        p013kotlin.jvm.internal.s.j(mapC, "getCameraCharacteristicsMap(...)");
        ArrayList arrayList = new ArrayList(mapC.size());
        Iterator<Map.Entry<String, CameraCharacteristics>> it = mapC.entrySet().iterator();
        while (it.hasNext()) {
            CameraCharacteristics value = it.next().getValue();
            SizeF sizeF = (SizeF) value.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (sizeF == null) {
                eVar = fz.e.WIDE_ANGLE;
            } else {
                float[] fArr = (float[]) value.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                if (fArr == null) {
                    eVar = fz.e.WIDE_ANGLE;
                } else {
                    double dH = h(fArr, sizeF);
                    if (dH > 94.0d) {
                        eVar = fz.e.ULTRA_WIDE_ANGLE;
                    } else if (60.0d <= dH && dH <= 94.0d) {
                        eVar = fz.e.WIDE_ANGLE;
                    } else {
                        if (dH >= 60.0d) {
                            throw new Error("Invalid Field Of View! (" + dH + ")");
                        }
                        eVar = fz.e.TELEPHOTO;
                    }
                }
            }
            arrayList.add(eVar);
        }
        return arrayList;
    }

    private final double d(float focalLength, SizeF sensorSize) {
        if (sensorSize.getWidth() == BitmapDescriptorFactory.HUE_RED || sensorSize.getHeight() == BitmapDescriptorFactory.HUE_RED) {
            return 0.0d;
        }
        return Math.toDegrees(Math.atan2(Math.sqrt((sensorSize.getWidth() * sensorSize.getWidth()) + (sensorSize.getHeight() * sensorSize.getHeight())), ((double) focalLength) * 2.0d) * 2.0d);
    }

    private final ReadableArray e() {
        WritableArray writableArray;
        Iterator it;
        b bVar = this;
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Set<c0.b0> setB = bVar.videoCapabilities.b();
        p013kotlin.jvm.internal.s.j(setB, "getSupportedDynamicRanges(...)");
        Iterator it2 = setB.iterator();
        while (it2.hasNext()) {
            c0.b0 b0Var = (c0.b0) it2.next();
            try {
                List<z0.x> listF = bVar.videoCapabilities.f(b0Var);
                p013kotlin.jvm.internal.s.j(listF, "getSupportedQualities(...)");
                List<z0.x> list = listF;
                ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
                for (z0.x xVar : list) {
                    p013kotlin.jvm.internal.s.i(xVar, "null cannot be cast to non-null type androidx.camera.video.Quality.ConstantQuality");
                    arrayList.add((z0.x.b) xVar);
                }
                ArrayList<Size> arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    List<Size> listD = ((z0.x.b) it3.next()).d();
                    p013kotlin.jvm.internal.s.j(listD, "getTypicalSizes(...)");
                    p013kotlin.collections.v.E(arrayList2, listD);
                }
                List<Size> listO = bVar.cameraInfoInternal.o(256);
                p013kotlin.jvm.internal.s.j(listO, "getSupportedHighResolutions(...)");
                List<Size> listS = bVar.cameraInfoInternal.s(256);
                p013kotlin.jvm.internal.s.j(listS, "getSupportedResolutions(...)");
                List<Size> listM1 = p013kotlin.collections.v.m1(p013kotlin.collections.v.s1(listO, listS));
                Set<Range<Integer>> setG = bVar.cameraInfo.g();
                p013kotlin.jvm.internal.s.j(setG, "getSupportedFrameRateRanges(...)");
                Iterator<T> it4 = setG.iterator();
                if (!it4.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer num = (Integer) ((Range) it4.next()).getLower();
                while (it4.hasNext()) {
                    Integer num2 = (Integer) ((Range) it4.next()).getLower();
                    if (num.compareTo(num2) > 0) {
                        num = num2;
                    }
                }
                Iterator<T> it5 = setG.iterator();
                if (!it5.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer num3 = (Integer) ((Range) it5.next()).getUpper();
                while (it5.hasNext()) {
                    Integer num4 = (Integer) ((Range) it5.next()).getUpper();
                    if (num3.compareTo(num4) < 0) {
                        num3 = num4;
                    }
                }
                for (Size size : arrayList2) {
                    try {
                        gz.b.Companion companion = gz.b.INSTANCE;
                        String str = bVar.cameraId;
                        p013kotlin.jvm.internal.s.h(size);
                        Integer numB = companion.b(str, size);
                        if (numB == null) {
                            numB = num3;
                        }
                        p013kotlin.jvm.internal.s.h(num);
                        int iIntValue = num.intValue();
                        p013kotlin.jvm.internal.s.h(numB);
                        Range<Integer> range = new Range<>(Integer.valueOf(Math.min(iIntValue, numB.intValue())), numB);
                        for (Size size2 : listM1) {
                            try {
                                p013kotlin.jvm.internal.s.h(size2);
                                writableArrayCreateArray.pushMap(bVar.a(size2, size, range));
                                writableArray = writableArrayCreateArray;
                                it = it2;
                            } catch (Throwable th2) {
                                int width = size2.getWidth();
                                int height = size2.getHeight();
                                writableArray = writableArrayCreateArray;
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    it = it2;
                                    try {
                                        sb2.append("Photo size ");
                                        sb2.append(width);
                                        sb2.append("x");
                                        sb2.append(height);
                                        sb2.append(" cannot be used as a format!");
                                        Log.w("CameraDeviceDetails", sb2.toString(), th2);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            Log.w("CameraDeviceDetails", "Video size " + size.getWidth() + "x" + size.getHeight() + " cannot be used as a format!", th);
                                            bVar = this;
                                            writableArrayCreateArray = writableArray;
                                            it2 = it;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            Log.w("CameraDeviceDetails", "Dynamic Range Profile " + b0Var + " cannot be used as a format!", th);
                                            bVar = this;
                                            writableArrayCreateArray = writableArray;
                                            it2 = it;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    it = it2;
                                    Log.w("CameraDeviceDetails", "Video size " + size.getWidth() + "x" + size.getHeight() + " cannot be used as a format!", th);
                                    bVar = this;
                                    writableArrayCreateArray = writableArray;
                                    it2 = it;
                                }
                            }
                            bVar = this;
                            writableArrayCreateArray = writableArray;
                            it2 = it;
                        }
                        writableArray = writableArrayCreateArray;
                        it = it2;
                    } catch (Throwable th6) {
                        th = th6;
                        writableArray = writableArrayCreateArray;
                    }
                    bVar = this;
                    writableArrayCreateArray = writableArray;
                    it2 = it;
                }
                writableArray = writableArrayCreateArray;
                it = it2;
                bVar = this;
                writableArrayCreateArray = writableArray;
                it2 = it;
            } catch (Throwable th7) {
                th = th7;
                writableArray = writableArrayCreateArray;
                it = it2;
            }
        }
        WritableArray writableArray2 = writableArrayCreateArray;
        p013kotlin.jvm.internal.s.h(writableArray2);
        return writableArray2;
    }

    private final Range<Integer> f() {
        c0.n nVar = this.cameraInfo;
        v.x0 x0Var = nVar instanceof v.x0 ? (v.x0) nVar : null;
        if (x0Var == null) {
            return new Range<>(0, 0);
        }
        Range<Integer> range = (Range) x0Var.B().a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE);
        return range == null ? new Range<>(0, 0) : range;
    }

    private final double g() {
        w.z zVarB;
        SizeF sizeF;
        float[] fArr;
        v.x0 x0Var = this.camera2Details;
        if (x0Var == null || (zVarB = x0Var.B()) == null || (sizeF = (SizeF) zVarB.a(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)) == null || (fArr = (float[]) zVarB.a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)) == null) {
            return 0.0d;
        }
        return h(fArr, sizeF);
    }

    private final double h(float[] focalLengths, SizeF sensorSize) {
        Float fA1 = p013kotlin.collections.n.a1(focalLengths);
        if (fA1 != null) {
            return d(fA1.floatValue(), sensorSize);
        }
        return 0.0d;
    }

    private final double i() {
        Float f11;
        c0.n nVar = this.cameraInfo;
        v.x0 x0Var = nVar instanceof v.x0 ? (v.x0) nVar : null;
        if (x0Var == null || (f11 = (Float) x0Var.B().a(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE)) == null || p013kotlin.jvm.internal.s.d(f11, BitmapDescriptorFactory.HUE_RED) || Float.isNaN(f11.floatValue()) || Float.isInfinite(f11.floatValue())) {
            return 0.0d;
        }
        return (1.0d / ((double) f11.floatValue())) * 100.0d;
    }

    private final boolean j() {
        Set<c0.b0> setB = this.videoCapabilities.b();
        p013kotlin.jvm.internal.s.j(setB, "getSupportedDynamicRanges(...)");
        Set<c0.b0> set = setB;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (c0.b0 b0Var : set) {
            if (b0Var.d() || p013kotlin.jvm.internal.s.f(b0Var, c0.b0.f18256e)) {
                return true;
            }
        }
        return false;
    }

    private final boolean k() {
        c0.b1 b1VarB = new c0.n1(1.0f, 1.0f).b(0.5f, 0.5f);
        p013kotlin.jvm.internal.s.j(b1VarB, "createPoint(...)");
        return this.cameraInfo.j(new c0.e0.a(b1VarB).b());
    }

    public final ReadableMap l() {
        List<fz.e> listC = c();
        ReadableArray readableArrayE = e();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", this.cameraId);
        writableMapCreateMap.putArray("physicalDevices", hz.a.a(listC));
        writableMapCreateMap.putString("position", this.position.getUnionValue());
        writableMapCreateMap.putString("name", this.name);
        writableMapCreateMap.putBoolean("hasFlash", this.hasFlash);
        writableMapCreateMap.putBoolean("hasTorch", this.hasFlash);
        writableMapCreateMap.putDouble("minFocusDistance", this.minFocusDistance);
        writableMapCreateMap.putBoolean("isMultiCam", this.isMultiCam);
        writableMapCreateMap.putBoolean("supportsRawCapture", this.supportsRawCapture);
        writableMapCreateMap.putBoolean("supportsLowLightBoost", this.supportsLowLightBoostExtension);
        writableMapCreateMap.putBoolean("supportsFocus", this.supportsFocus);
        writableMapCreateMap.putDouble("minZoom", this.minZoom);
        writableMapCreateMap.putDouble("maxZoom", this.maxZoom);
        writableMapCreateMap.putDouble("neutralZoom", 1.0d);
        Integer minExposure = this.minExposure;
        p013kotlin.jvm.internal.s.j(minExposure, "minExposure");
        writableMapCreateMap.putInt("minExposure", minExposure.intValue());
        Integer maxExposure = this.maxExposure;
        p013kotlin.jvm.internal.s.j(maxExposure, "maxExposure");
        writableMapCreateMap.putInt("maxExposure", maxExposure.intValue());
        writableMapCreateMap.putString("hardwareLevel", this.hardwareLevel.getUnionValue());
        writableMapCreateMap.putString("sensorOrientation", this.sensorOrientation.getUnionValue());
        writableMapCreateMap.putArray("formats", readableArrayE);
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }
}
