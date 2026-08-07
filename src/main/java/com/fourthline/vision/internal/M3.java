package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.devicedata.MotionFrame;
import java.util.List;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class M3 implements F3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimestampProvider f37848a;

    public M3(TimestampProvider timestampProvider) {
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        this.f37848a = timestampProvider;
    }

    @Override // com.fourthline.vision.internal.F3
    public Pair<Long, List<MotionFrame>> trimMotionData(List<MotionFrame> data) {
        p013kotlin.jvm.internal.s.k(data, "data");
        return jn0.x.a(Long.valueOf(this.f37848a.getCurrentTimestamp()), data);
    }
}
