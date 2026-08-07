package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.c3;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Range<Integer> f2982a;

    public AeFpsRangeLegacyQuirk(@NonNull z zVar) {
        this.f2982a = i((Range[]) zVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    @NonNull
    private Range<Integer> g(@NonNull Range<Integer> range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    static boolean h(@NonNull z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range<Integer> i(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> rangeG = g(range2);
                if (((Integer) rangeG.getUpper()).intValue() == 30 && (range == null || ((Integer) rangeG.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangeG;
                }
            }
        }
        return range;
    }

    @Override // androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk
    @NonNull
    public Range<Integer> d() {
        Range<Integer> range = this.f2982a;
        return range != null ? range : c3.f3148a;
    }
}
