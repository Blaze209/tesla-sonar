package n8;

import androidx.media3.exoplayer.source.g0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements e {
    @Override // n8.e
    public g0 a(List<? extends g0> list, List<List<Integer>> list2) {
        return new d(list, list2);
    }

    @Override // n8.e
    public g0 empty() {
        return new d(com.google.common.collect.x.r(), com.google.common.collect.x.r());
    }
}
