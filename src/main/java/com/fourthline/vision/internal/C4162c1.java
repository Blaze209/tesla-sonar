package com.fourthline.vision.internal;

import com.fourthline.core.VideoDuration;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.vision.internal.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4162c1 extends AbstractC4212i3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4162c1(InterfaceC4306w0 metadataSource, final wn0.a<? extends VideoDuration> videoDurationFactory, int i11) {
        super(metadataSource, new wn0.a() { // from class: com.fourthline.vision.internal.e9
            @Override // wn0.a
            public final Object invoke() {
                return Long.valueOf(C4162c1._init_$lambda$0(videoDurationFactory));
            }
        });
        p013kotlin.jvm.internal.s.k(metadataSource, "metadataSource");
        p013kotlin.jvm.internal.s.k(videoDurationFactory, "videoDurationFactory");
        this.f38189c = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0(wn0.a aVar) {
        return ((VideoDuration) aVar.invoke()).getDuration();
    }

    @Override // com.fourthline.vision.internal.AbstractC4212i3
    protected long getTrimmedVideoStartMs(List<? extends AbstractC4316x3> list) {
        p013kotlin.jvm.internal.s.k(list, "<this>");
        if (this.f38189c == 1) {
            return 0L;
        }
        return getFirstImageTakenTimestamp(list) - getRecordingStartTimestamp();
    }
}
