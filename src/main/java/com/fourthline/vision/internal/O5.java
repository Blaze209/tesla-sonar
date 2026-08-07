package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.concurrent.TimeUnit;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public class O5 extends AbstractC4222k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC4241m4 f37869e;

    public /* synthetic */ O5(TimestampProvider timestampProvider, long j11, TimeUnit timeUnit, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(timestampProvider, j11, (i11 & 4) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }

    @Override // com.fourthline.vision.internal.AbstractC4222k
    public EnumC4241m4 getError() {
        return this.f37869e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O5(TimestampProvider timestampProvider, long j11, TimeUnit timeUnit) {
        super(timestampProvider, j11, timeUnit);
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(timeUnit, "timeUnit");
        this.f37869e = EnumC4241m4.TIMEOUT;
    }
}
