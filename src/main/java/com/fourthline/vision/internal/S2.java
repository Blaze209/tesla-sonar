package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.concurrent.TimeUnit;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class S2 extends AbstractC4222k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4234l4 f37946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final EnumC4241m4 f37948g;

    public /* synthetic */ S2(InterfaceC4234l4 interfaceC4234l4, TimestampProvider timestampProvider, long j11, TimeUnit timeUnit, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4234l4, timestampProvider, j11, (i11 & 8) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }

    @Override // com.fourthline.vision.internal.AbstractC4222k, com.fourthline.vision.internal.G5, com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((jn0.h0) obj, (Continuation<? super jn0.h0>) continuation);
    }

    @Override // com.fourthline.vision.internal.AbstractC4222k
    public EnumC4241m4 getError() {
        return this.f37948g;
    }

    @Override // com.fourthline.vision.internal.AbstractC4222k
    public Object consume(jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) {
        if (!this.f37947f) {
            if (!AbstractC4173d4.isValid(this.f37946e.contentDetectionArea())) {
                Object objConsume = super.consume(h0Var, continuation);
                return objConsume == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objConsume : jn0.h0.f84049a;
            }
            this.f37947f = true;
        }
        return jn0.h0.f84049a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(InterfaceC4234l4 detectionAreaProvider, TimestampProvider timestampProvider, long j11, TimeUnit timeUnit) {
        super(timestampProvider, j11, timeUnit);
        p013kotlin.jvm.internal.s.k(detectionAreaProvider, "detectionAreaProvider");
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(timeUnit, "timeUnit");
        this.f37946e = detectionAreaProvider;
        this.f37948g = EnumC4241m4.INVALID_CONTENT_DETECTION_AREA;
    }
}
