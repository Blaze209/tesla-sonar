package com.fourthline.vision.internal;

import com.fourthline.core.VideoDuration;
import com.fourthline.vision.selfie.LivenessCheckType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4317x4 extends AbstractC4212i3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f39091d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LivenessCheckType f39092c;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.x4$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.fourthline.vision.internal.x4$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LivenessCheckType.values().length];
            try {
                iArr[LivenessCheckType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LivenessCheckType.HEAD_TURN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4317x4(LivenessCheckType livenessCheckType, InterfaceC4306w0 metadataSource) {
        super(metadataSource, new wn0.a() { // from class: com.fourthline.vision.internal.wb
            @Override // wn0.a
            public final Object invoke() {
                return Long.valueOf(C4317x4._init_$lambda$0());
            }
        });
        p013kotlin.jvm.internal.s.k(livenessCheckType, "livenessCheckType");
        p013kotlin.jvm.internal.s.k(metadataSource, "metadataSource");
        this.f39092c = livenessCheckType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _init_$lambda$0() {
        return VideoDuration.DEFAULT.INSTANCE.getDuration();
    }

    private final long getFirstLivenessImageTakenTimestamp(List<? extends AbstractC4316x3> list) throws AbstractC4277s.e {
        Long l11;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C4288t3) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((C4288t3) obj2).getTimestamp() > getFirstImageTakenTimestamp(list)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((C4288t3) it.next()).getTimestamp());
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((C4288t3) it.next()).getTimestamp());
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
            l11 = lValueOf;
        } else {
            l11 = null;
        }
        if (l11 != null) {
            return l11.longValue();
        }
        throw AbstractC4277s.e.f38823a;
    }

    @Override // com.fourthline.vision.internal.AbstractC4212i3
    protected long getTrimmedVideoStartMs(List<? extends AbstractC4316x3> list) throws AbstractC4277s.e {
        long firstImageTakenTimestamp;
        p013kotlin.jvm.internal.s.k(list, "<this>");
        int i11 = b.$EnumSwitchMapping$0[this.f39092c.ordinal()];
        if (i11 == 1) {
            firstImageTakenTimestamp = getFirstImageTakenTimestamp(list);
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            firstImageTakenTimestamp = getFirstLivenessImageTakenTimestamp(list);
        }
        return (firstImageTakenTimestamp - getRecordingStartTimestamp()) - 1000;
    }
}
