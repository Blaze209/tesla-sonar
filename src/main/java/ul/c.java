package ul;

import bo0.j;
import bo0.n;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u00020\f*\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lul/c;", "", "", "maxFpsLimit", "<init>", "(I)V", "durationMs", "frameCount", "targetFps", "", "a", "(III)Ljava/util/Map;", "", "b", "(I)F", "I", "animated-drawable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxFpsLimit;

    public c(int i11) {
        this.maxFpsLimit = i11;
    }

    public final Map<Integer, Integer> a(int durationMs, int frameCount, int targetFps) {
        float fE = n.e(n.j(n.f(targetFps, 1), this.maxFpsLimit) * b(durationMs), BitmapDescriptorFactory.HUE_RED);
        float f11 = frameCount;
        float fI = f11 / n.i(fE, f11);
        int i11 = 0;
        j jVarW = n.w(0, frameCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(jVarW, 10)), 16));
        for (Integer num : jVarW) {
            int iIntValue = num.intValue();
            if (((int) (iIntValue % fI)) == 0) {
                i11 = iIntValue;
            }
            linkedHashMap.put(num, Integer.valueOf(i11));
        }
        return linkedHashMap;
    }

    public final float b(int i11) {
        return i11 / 1000.0f;
    }
}
