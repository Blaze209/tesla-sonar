package com.fourthline.core.internal.devicedata;

import java.util.Arrays;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import ro0.d;
import to0.e;
import to0.f;
import to0.m;
import wo0.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionTimestampSerializer;", "Lro0/d;", "", "<init>", "()V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Long;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;J)V", "Lto0/f;", "a", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MotionTimestampSerializer implements d<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f descriptor = m.c("timestamp", e.d.f114878a);

    @Override // ro0.d, ro0.q, ro0.c
    public f getDescriptor() {
        return this.descriptor;
    }

    @Override // ro0.q
    public /* bridge */ /* synthetic */ void serialize(uo0.f fVar, Object obj) {
        serialize(fVar, ((Number) obj).longValue());
    }

    @Override // ro0.c
    public Long deserialize(uo0.e decoder) {
        s.k(decoder, "decoder");
        return Long.valueOf((long) (decoder.l() * ((double) 1000)));
    }

    public void serialize(uo0.f encoder, long value) {
        s.k(encoder, "encoder");
        long j11 = 1000;
        long j12 = value / j11;
        long j13 = value % j11;
        t0 t0Var = t0.f86535a;
        String str = String.format(Locale.ROOT, "%d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(j12), Long.valueOf(j13)}, 2));
        s.j(str, "format(...)");
        wo0.s sVar = encoder instanceof wo0.s ? (wo0.s) encoder : null;
        if (sVar != null) {
            sVar.n(j.d(str));
        }
    }
}
