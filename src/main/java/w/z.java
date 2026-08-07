package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final a f120232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final String f120233c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Map<CameraCharacteristics.Key<?>, Object> f120231a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r0 f120234d = null;

    public interface a {
        @NonNull
        CameraCharacteristics a();

        <T> T b(@NonNull CameraCharacteristics.Key<T> key);

        @NonNull
        Set<String> c();
    }

    private z(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f120232b = new w(cameraCharacteristics);
        } else {
            this.f120232b = new x(cameraCharacteristics);
        }
        this.f120233c = str;
    }

    private boolean e(@NonNull CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    @NonNull
    public static z h(@NonNull CameraCharacteristics cameraCharacteristics, @NonNull String str) {
        return new z(cameraCharacteristics, str);
    }

    public <T> T a(@NonNull CameraCharacteristics.Key<T> key) {
        if (e(key)) {
            return (T) this.f120232b.b(key);
        }
        synchronized (this) {
            try {
                T t11 = (T) this.f120231a.get(key);
                if (t11 != null) {
                    return t11;
                }
                T t12 = (T) this.f120232b.b(key);
                if (t12 != null) {
                    this.f120231a.put((CameraCharacteristics.Key<?>) key, t12);
                }
                return t12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public String b() {
        return this.f120233c;
    }

    @NonNull
    public Set<String> c() {
        return this.f120232b.c();
    }

    @NonNull
    public r0 d() {
        if (this.f120234d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f120234d = r0.e(streamConfigurationMap, new z.n(this.f120233c));
            } catch (AssertionError | NullPointerException e11) {
                throw new IllegalArgumentException(e11.getMessage());
            }
        }
        return this.f120234d;
    }

    public boolean f() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f120232b.b(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i11 : iArr) {
                if (i11 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    public CameraCharacteristics g() {
        return this.f120232b.a();
    }
}
