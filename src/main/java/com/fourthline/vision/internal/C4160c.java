package com.fourthline.vision.internal;

import com.fourthline.core.internal.devicedata.MotionFrame;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.vision.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4160c implements F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC4212i3 f38187a;

    public C4160c(AbstractC4212i3 mediaDurationIntervalDataSource) {
        p013kotlin.jvm.internal.s.k(mediaDurationIntervalDataSource, "mediaDurationIntervalDataSource");
        this.f38187a = mediaDurationIntervalDataSource;
    }

    @Override // com.fourthline.vision.internal.F3
    public Pair<Long, List<MotionFrame>> trimMotionData(List<MotionFrame> data) {
        p013kotlin.jvm.internal.s.k(data, "data");
        Pair<Long, Long> pair = this.f38187a.get();
        Pair pairA = jn0.x.a(Long.valueOf(pair.e().longValue() + this.f38187a.getRecordingStartTimestamp()), Long.valueOf(pair.f().longValue() + this.f38187a.getRecordingStartTimestamp()));
        Object objE = pairA.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            long jLongValue = ((Number) pairA.e()).longValue();
            long jLongValue2 = ((Number) pairA.f()).longValue();
            long timestamp = ((MotionFrame) obj).getTimestamp();
            if (jLongValue <= timestamp && timestamp <= jLongValue2) {
                arrayList.add(obj);
            }
        }
        return jn0.x.a(objE, arrayList);
    }
}
