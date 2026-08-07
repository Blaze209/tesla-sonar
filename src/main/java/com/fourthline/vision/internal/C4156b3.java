package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4156b3 implements Q2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f38171c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f38172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.l f38173b;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.b3$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C4156b3(wn0.a<Integer> requiredHeadDirectionFactory, wn0.l<? super HeadMetadata, jn0.h0> onHeadMoved) {
        p013kotlin.jvm.internal.s.k(requiredHeadDirectionFactory, "requiredHeadDirectionFactory");
        p013kotlin.jvm.internal.s.k(onHeadMoved, "onHeadMoved");
        this.f38172a = requiredHeadDirectionFactory;
        this.f38173b = onHeadMoved;
    }

    private final Integer calculateDirection(float f11, float f12) {
        if (Math.abs(f11) <= 10.0f && Math.abs(f12) <= 10.0f) {
            return null;
        }
        float degrees = (float) Math.toDegrees((float) Math.atan2(-f11, f12));
        if (degrees < BitmapDescriptorFactory.HUE_RED) {
            degrees += 360;
        }
        return Integer.valueOf((int) degrees);
    }

    private final boolean isInBounds(Integer num) {
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Number) this.f38172a.invoke()).intValue() % 360;
        return iIntValue <= iIntValue2 + 10 && iIntValue2 + (-10) <= iIntValue;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((List<? extends AbstractC4273r2>) obj, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
    }

    public Object process(List<? extends AbstractC4273r2> list, Continuation<? super List<? extends SelfieScannerWarning>> continuation) {
        ArrayList<AbstractC4273r2.b> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC4273r2.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
        for (AbstractC4273r2.b bVar : arrayList) {
            arrayList2.add(new HeadMetadata(Boxing.boxFloat(bVar.getYaw()), Boxing.boxFloat(bVar.getPitch()), calculateDirection(bVar.getYaw(), bVar.getPitch())));
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f38173b.invoke((HeadMetadata) it.next());
        }
        ArrayList<HeadMetadata> arrayList3 = new ArrayList();
        boolean z11 = false;
        for (Object obj2 : arrayList2) {
            if (z11) {
                arrayList3.add(obj2);
            } else if (!isInBounds(((HeadMetadata) obj2).getDirection())) {
                arrayList3.add(obj2);
                z11 = true;
            }
        }
        ArrayList arrayList4 = new ArrayList(p013kotlin.collections.v.y(arrayList3, 10));
        for (HeadMetadata headMetadata : arrayList3) {
            arrayList4.add(SelfieScannerWarning.FACE_YAW_TOO_BIG);
        }
        return p013kotlin.collections.v.m1(arrayList4);
    }
}
