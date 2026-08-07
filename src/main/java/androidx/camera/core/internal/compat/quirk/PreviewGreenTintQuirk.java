package androidx.camera.core.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.o3;
import androidx.camera.core.impl.p3;
import c0.a2;
import c0.h1;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Iterator;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;", "Landroidx/camera/core/impl/m2;", "<init>", "()V", "", "h", "()Z", "", "cameraId", "", "Lc0/a2;", "appUseCases", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/util/Collection;)Z", "j", "g", "isMotoE20", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class PreviewGreenTintQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PreviewGreenTintQuirk f3409a = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    private final boolean g() {
        return t.M("motorola", Build.BRAND, true) && t.M("moto e20", Build.MODEL, true);
    }

    public static final boolean h() {
        return f3409a.g();
    }

    public static final boolean i(String cameraId, Collection<? extends a2> appUseCases) {
        s.k(cameraId, "cameraId");
        s.k(appUseCases, "appUseCases");
        PreviewGreenTintQuirk previewGreenTintQuirk = f3409a;
        if (previewGreenTintQuirk.g()) {
            return previewGreenTintQuirk.j(cameraId, appUseCases);
        }
        return false;
    }

    private final boolean j(String cameraId, Collection<? extends a2> appUseCases) {
        boolean z11;
        boolean z12;
        if (s.f(cameraId, WebrtcBuildVersion.maint_version) && appUseCases.size() == 2) {
            Collection<? extends a2> collection = appUseCases;
            boolean z13 = collection instanceof Collection;
            if (!z13 || !collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        break;
                    }
                    if (((a2) it.next()) instanceof h1) {
                        z11 = true;
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
            if (!z13 || !collection.isEmpty()) {
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z12 = false;
                        break;
                    }
                    a2 a2Var = (a2) it2.next();
                    if (a2Var.k().e(o3.C) && a2Var.k().U() == p3.b.VIDEO_CAPTURE) {
                        z12 = true;
                        break;
                    }
                }
            } else {
                z12 = false;
                break;
            }
            if (z11 && z12) {
                return true;
            }
        }
        return false;
    }
}
