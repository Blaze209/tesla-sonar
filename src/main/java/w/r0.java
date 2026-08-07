package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.NonNull;
import c0.y0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f120217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z.n f120218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Integer, Size[]> f120219c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Integer, Size[]> f120220d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, Size[]> f120221e = new HashMap();

    interface a {
        @NonNull
        StreamConfigurationMap a();

        Size[] b(int i11);

        int[] c();

        Size[] d(int i11);
    }

    private r0(@NonNull StreamConfigurationMap streamConfigurationMap, @NonNull z.n nVar) {
        this.f120217a = new s0(streamConfigurationMap);
        this.f120218b = nVar;
    }

    @NonNull
    static r0 e(@NonNull StreamConfigurationMap streamConfigurationMap, @NonNull z.n nVar) {
        return new r0(streamConfigurationMap, nVar);
    }

    public Size[] a(int i11) {
        if (this.f120220d.containsKey(Integer.valueOf(i11))) {
            if (this.f120220d.get(Integer.valueOf(i11)) == null) {
                return null;
            }
            return (Size[]) this.f120220d.get(Integer.valueOf(i11)).clone();
        }
        Size[] sizeArrD = this.f120217a.d(i11);
        if (sizeArrD != null && sizeArrD.length > 0) {
            sizeArrD = this.f120218b.b(sizeArrD, i11);
        }
        this.f120220d.put(Integer.valueOf(i11), sizeArrD);
        if (sizeArrD != null) {
            return (Size[]) sizeArrD.clone();
        }
        return null;
    }

    public int[] b() {
        int[] iArrC = this.f120217a.c();
        if (iArrC == null) {
            return null;
        }
        return (int[]) iArrC.clone();
    }

    public Size[] c(int i11) {
        if (this.f120219c.containsKey(Integer.valueOf(i11))) {
            if (this.f120219c.get(Integer.valueOf(i11)) == null) {
                return null;
            }
            return (Size[]) this.f120219c.get(Integer.valueOf(i11)).clone();
        }
        Size[] sizeArrB = this.f120217a.b(i11);
        if (sizeArrB != null && sizeArrB.length != 0) {
            Size[] sizeArrB2 = this.f120218b.b(sizeArrB, i11);
            this.f120219c.put(Integer.valueOf(i11), sizeArrB2);
            return (Size[]) sizeArrB2.clone();
        }
        y0.l("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i11);
        return sizeArrB;
    }

    @NonNull
    public StreamConfigurationMap d() {
        return this.f120217a.a();
    }
}
