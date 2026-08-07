package com.fourthline.vision.internal;

import com.fourthline.core.VideoDuration;
import com.fourthline.vision.document.DocumentScannerStep;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Z3 extends AbstractC4212i3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4306w0 f38121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4149a4.a f38123e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(InterfaceC4306w0 metadataSource, final wn0.a<? extends VideoDuration> videoDurationFactory, int i11, C4149a4.a recordingPlan) {
        super(metadataSource, new wn0.a() { // from class: com.fourthline.vision.internal.c9
            @Override // wn0.a
            public final Object invoke() {
                return Long.valueOf(Z3._init_$lambda$0(videoDurationFactory));
            }
        });
        p013kotlin.jvm.internal.s.k(metadataSource, "metadataSource");
        p013kotlin.jvm.internal.s.k(videoDurationFactory, "videoDurationFactory");
        p013kotlin.jvm.internal.s.k(recordingPlan, "recordingPlan");
        this.f38121c = metadataSource;
        this.f38122d = i11;
        this.f38123e = recordingPlan;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0(wn0.a aVar) {
        return ((VideoDuration) aVar.invoke()).getDuration();
    }

    private final List<AbstractC4316x3> getMetadataEvents() {
        return (List) this.f38121c.get();
    }

    private final long startOfManualTriggerTimestamp(int i11) {
        Object next;
        Iterator<T> it = getMetadataEvents().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC4316x3 abstractC4316x3 = (AbstractC4316x3) next;
            if (abstractC4316x3 instanceof C4274r3) {
                Object stepType = ((C4274r3) abstractC4316x3).getStepConfig().getStepType();
                if ((stepType instanceof DocumentScannerStep) && ((DocumentScannerStep) stepType).getIndex() == i11) {
                    break;
                }
            }
        }
        AbstractC4316x3 abstractC4316x4 = (AbstractC4316x3) next;
        return abstractC4316x4 != null ? abstractC4316x4.getTimestamp() : startOfStepTimestamp(i11);
    }

    private final long startOfStepTimestamp(int i11) {
        Object next;
        Iterator<T> it = getMetadataEvents().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC4316x3 abstractC4316x3 = (AbstractC4316x3) next;
            if (abstractC4316x3 instanceof C4295u3) {
                Object stepType = ((C4295u3) abstractC4316x3).getStepConfig().getStepType();
                if ((stepType instanceof DocumentScannerStep) && ((DocumentScannerStep) stepType).getIndex() == i11) {
                    break;
                }
            }
        }
        AbstractC4316x3 abstractC4316x4 = (AbstractC4316x3) next;
        if (abstractC4316x4 != null) {
            return abstractC4316x4.getTimestamp();
        }
        return 0L;
    }

    @Override // com.fourthline.vision.internal.AbstractC4212i3
    protected long getTrimmedVideoStartMs(List<? extends AbstractC4316x3> list) throws AbstractC4277s.e {
        long jStartOfStepTimestamp;
        long recordingStartTimestamp;
        p013kotlin.jvm.internal.s.k(list, "<this>");
        if (this.f38122d == 1) {
            return 0L;
        }
        if (this.f38123e.getStartTrigger() == C4149a4.b.TakePhotoClicked) {
            jStartOfStepTimestamp = startOfManualTriggerTimestamp(this.f38123e.getStartRecordingStepIndex());
            recordingStartTimestamp = getRecordingStartTimestamp();
        } else {
            jStartOfStepTimestamp = startOfStepTimestamp(this.f38123e.getStartRecordingStepIndex());
            recordingStartTimestamp = getRecordingStartTimestamp();
        }
        return jStartOfStepTimestamp - recordingStartTimestamp;
    }
}
