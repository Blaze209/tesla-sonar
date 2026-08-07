package gz;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import bo0.j;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgz/b;", "", "a", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: gz.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgz/b$a;", "", "<init>", "()V", "", "camcorderProfile", DateTokenConverter.CONVERTER_KEY, "(I)I", "", "cameraId", "Landroid/util/Size;", "resolution", "", "allowLargerSize", "a", "(Ljava/lang/String;Landroid/util/Size;Z)I", "size", "b", "(Ljava/lang/String;Landroid/util/Size;)Ljava/lang/Integer;", "videoSize", "c", "TAG", "Ljava/lang/String;", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String cameraId, Size resolution, boolean allowLargerSize) {
            int width = resolution.getWidth() * resolution.getHeight();
            Integer numX = t.x(cameraId);
            j jVar = new j(2, 13);
            ArrayList arrayList = new ArrayList();
            for (Integer num : jVar) {
                int iIntValue = num.intValue();
                if (numX != null ? CamcorderProfile.hasProfile(numX.intValue(), iIntValue) : CamcorderProfile.hasProfile(iIntValue)) {
                    arrayList.add(num);
                }
            }
            if (!allowLargerSize) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (b.INSTANCE.d(((Number) obj).intValue()) <= width) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                int iAbs = Math.abs(b.INSTANCE.d(((Number) next).intValue()) - width);
                do {
                    Object next2 = it.next();
                    int iAbs2 = Math.abs(b.INSTANCE.d(((Number) next2).intValue()) - width);
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
            return ((Number) next).intValue();
        }

        private final int d(int camcorderProfile) {
            switch (camcorderProfile) {
                case 2:
                    return 25344;
                case 3:
                    return 101376;
                case 4:
                    return 345600;
                case 5:
                    return 921600;
                case 6:
                    return 2073600;
                case 7:
                    return 76800;
                case 8:
                    return 8294400;
                case 9:
                    return 307200;
                case 10:
                    return 8847360;
                case 11:
                    return 3686400;
                case 12:
                    return 2211840;
                case 13:
                    return 33177600;
                default:
                    throw new Error("Invalid CamcorderProfile \"" + camcorderProfile + "\"!");
            }
        }

        public final Integer b(String cameraId, Size size) {
            EncoderProfiles all;
            s.k(cameraId, "cameraId");
            s.k(size, "size");
            try {
                int iA = a(cameraId, size, false);
                if (Build.VERSION.SDK_INT < 31 || (all = CamcorderProfile.getAll(cameraId, iA)) == null) {
                    Integer numX = t.x(cameraId);
                    if (numX != null) {
                        return Integer.valueOf(CamcorderProfile.get(numX.intValue(), iA).videoFrameRate);
                    }
                    return null;
                }
                List<EncoderProfiles.VideoProfile> videoProfiles = all.getVideoProfiles();
                s.j(videoProfiles, "getVideoProfiles(...)");
                Iterator<T> it = videoProfiles.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer numValueOf = Integer.valueOf(a.a(it.next()).getFrameRate());
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(a.a(it.next()).getFrameRate());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                return numValueOf;
            } catch (Throwable th2) {
                Log.e("CamcorderProfileUtils", "Failed to get maximum FPS for Camera ID " + cameraId + "! " + th2.getMessage(), th2);
                return null;
            }
        }

        public final Integer c(String cameraId, Size videoSize) {
            EncoderProfiles all;
            s.k(cameraId, "cameraId");
            s.k(videoSize, "videoSize");
            try {
                int iA = a(cameraId, videoSize, true);
                if (Build.VERSION.SDK_INT < 31 || (all = CamcorderProfile.getAll(cameraId, iA)) == null) {
                    Integer numX = t.x(cameraId);
                    if (numX != null) {
                        return Integer.valueOf(CamcorderProfile.get(numX.intValue(), iA).videoBitRate);
                    }
                    return null;
                }
                List<EncoderProfiles.VideoProfile> videoProfiles = all.getVideoProfiles();
                s.j(videoProfiles, "getVideoProfiles(...)");
                Iterator<T> it = videoProfiles.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                Integer numValueOf = Integer.valueOf(a.a(it.next()).getBitrate());
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(a.a(it.next()).getBitrate());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                return numValueOf;
            } catch (Throwable th2) {
                Log.e("CamcorderProfileUtils", "Failed to get recommended video bit-rate for Camera ID " + cameraId + "! " + th2.getMessage(), th2);
                return null;
            }
        }

        private Companion() {
        }
    }
}
