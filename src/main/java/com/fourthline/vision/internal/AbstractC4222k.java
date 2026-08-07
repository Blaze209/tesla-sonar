package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import java.util.concurrent.TimeUnit;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4222k implements G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimestampProvider f38493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeUnit f38495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f38496d;

    public AbstractC4222k(TimestampProvider timestampProvider, long j11, TimeUnit timeUnit) {
        p013kotlin.jvm.internal.s.k(timestampProvider, "timestampProvider");
        p013kotlin.jvm.internal.s.k(timeUnit, "timeUnit");
        this.f38493a = timestampProvider;
        this.f38494b = j11;
        this.f38495c = timeUnit;
        this.f38496d = Long.MAX_VALUE;
    }

    static /* synthetic */ Object consume$suspendImpl(AbstractC4222k abstractC4222k, jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) throws AbstractC4255o4.a {
        if (abstractC4222k.f38493a.getCurrentTimestamp() - abstractC4222k.f38496d < abstractC4222k.f38495c.toMillis(abstractC4222k.f38494b)) {
            return jn0.h0.f84049a;
        }
        throw new AbstractC4255o4.a(abstractC4222k.getError(), null, 2, null);
    }

    public Object consume(jn0.h0 h0Var, Continuation<? super jn0.h0> continuation) {
        return consume$suspendImpl(this, h0Var, continuation);
    }

    public abstract EnumC4241m4 getError();

    protected final long getStartTimestamp() {
        return this.f38496d;
    }

    protected final void setStartTimestamp(long j11) {
        this.f38496d = j11;
    }

    @Override // com.fourthline.vision.internal.G5, com.fourthline.vision.internal.F5
    public void start() {
        this.f38496d = this.f38493a.getCurrentTimestamp();
    }

    @Override // com.fourthline.vision.internal.G5, com.fourthline.vision.internal.F5
    public void stop() {
        this.f38496d = Long.MAX_VALUE;
    }

    @Override // com.fourthline.vision.internal.G5, com.fourthline.vision.internal.InterfaceC4265q0
    public /* bridge */ /* synthetic */ Object consume(Object obj, Continuation continuation) {
        return consume((jn0.h0) obj, (Continuation<? super jn0.h0>) continuation);
    }

    public /* synthetic */ AbstractC4222k(TimestampProvider timestampProvider, long j11, TimeUnit timeUnit, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(timestampProvider, j11, (i11 & 4) != 0 ? TimeUnit.MILLISECONDS : timeUnit);
    }
}
