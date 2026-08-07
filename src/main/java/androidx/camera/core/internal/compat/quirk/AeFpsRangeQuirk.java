package androidx.camera.core.internal.compat.quirk;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.m2;

/* JADX INFO: loaded from: classes.dex */
public interface AeFpsRangeQuirk extends m2 {
    @NonNull
    default Range<Integer> d() {
        return c3.f3148a;
    }
}
