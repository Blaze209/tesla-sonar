package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.internal.devicedata.MotionFrame;
import com.fourthline.vision.MotionData;
import java.util.List;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4176e implements E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f38247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MotionDataCollector f38248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimestampProvider f38249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F3 f38250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f38251e;

    public C4176e(boolean z11, MotionDataCollector motionDataCollector, TimestampProvider timestampProvider, F3 motionDataTrimmer) {
        p013kotlin.jvm.internal.s.k(motionDataCollector, "motionDataCollector");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(motionDataTrimmer, "motionDataTrimmer");
        this.f38247a = z11;
        this.f38248b = motionDataCollector;
        this.f38249c = timestampProvider;
        this.f38250d = motionDataTrimmer;
        this.f38251e = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionData stop$lambda$0(C4176e c4176e, List it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        Pair<Long, List<MotionFrame>> pairTrimMotionData = c4176e.f38250d.trimMotionData(it);
        return new MotionData(pairTrimMotionData.e().longValue(), pairTrimMotionData.f());
    }

    @Override // com.fourthline.vision.internal.E3
    public Object cancel(Continuation<? super jn0.h0> continuation) {
        if (this.f38247a) {
            this.f38248b.stop();
        }
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.vision.internal.E3
    public void start() {
        if (this.f38247a) {
            this.f38251e = this.f38249c.getCurrentTimestamp();
            this.f38248b.startDataCollection();
        }
    }

    @Override // com.fourthline.vision.internal.E3
    public Object stop(Continuation<? super Try<MotionData>> continuation) {
        return this.f38247a ? TryKt.map(TryKt.success(this.f38248b.stop()), new wn0.l() { // from class: com.fourthline.vision.internal.q9
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C4176e.stop$lambda$0(this.f38792a, (List) obj);
            }
        }) : TryKt.failure(new AbstractC4255o4.a(EnumC4241m4.RECORDING_FAILED, null, 2, null));
    }
}
