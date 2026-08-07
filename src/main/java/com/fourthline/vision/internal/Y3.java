package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
final class Y3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f38101d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f38102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f38104c;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Y3(wn0.a<? extends List<Integer>> stepAngles) {
        p013kotlin.jvm.internal.s.k(stepAngles, "stepAngles");
        this.f38102a = stepAngles;
        this.f38104c = p013kotlin.collections.v.m();
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

    private final boolean isInBounds(Integer num, int i11) {
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        int i12 = i11 % 360;
        return iIntValue <= i12 + 10 && i12 + (-10) <= iIntValue;
    }

    public final List<Integer> getSteps() {
        return this.f38104c;
    }

    public final void process(zx.a input, wn0.l<? super HeadMetadata, jn0.h0> onHeadMoved, wn0.l<? super Integer, jn0.h0> onStepUpdate, wn0.l<? super Integer, jn0.h0> onStepSuccess, wn0.a<jn0.h0> onAllStepsSuccess) {
        Integer num;
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(onHeadMoved, "onHeadMoved");
        p013kotlin.jvm.internal.s.k(onStepUpdate, "onStepUpdate");
        p013kotlin.jvm.internal.s.k(onStepSuccess, "onStepSuccess");
        p013kotlin.jvm.internal.s.k(onAllStepsSuccess, "onAllStepsSuccess");
        HeadMetadata headMetadata = new HeadMetadata(Float.valueOf(input.d()), Float.valueOf(input.c()), calculateDirection(input.d(), input.c()));
        onHeadMoved.invoke(headMetadata);
        Integer num2 = (Integer) p013kotlin.collections.v.r0(this.f38104c, this.f38103b);
        if (num2 != null) {
            if (isInBounds(headMetadata.getDirection(), num2.intValue())) {
                onStepSuccess.invoke(Integer.valueOf(this.f38103b));
                List list = (List) this.f38102a.invoke();
                if (list != null) {
                    int i11 = this.f38103b + 1;
                    this.f38103b = i11;
                    num = (Integer) p013kotlin.collections.v.r0(list, i11);
                } else {
                    num = null;
                }
                if (num == null) {
                    onAllStepsSuccess.invoke();
                } else {
                    onStepUpdate.invoke(num);
                }
            }
        }
    }

    public final void reset() {
        this.f38104c = p013kotlin.collections.v.m();
        this.f38103b = 0;
    }

    public final void setSteps(List<Integer> list) {
        p013kotlin.jvm.internal.s.k(list, "<set-?>");
        this.f38104c = list;
    }

    public final void start() {
        List list = (List) this.f38102a.invoke();
        if (list == null) {
            throw new IllegalStateException("Can't start without angles provided!");
        }
        this.f38104c = list;
    }
}
