package com.fourthline.scanners.config.orca.kyc.model.serialization;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import to0.e;
import to0.f;
import to0.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/serialization/LatitudeSerializer;", "Lro0/d;", "", "Lcom/fourthline/core/location/Latitude;", "<init>", "()V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Double;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;D)V", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LatitudeSerializer implements d<Double> {
    public static final LatitudeSerializer INSTANCE = new LatitudeSerializer();
    private static final f descriptor = m.c("Latitude", e.d.f114878a);

    private LatitudeSerializer() {
    }

    @Override // ro0.d, ro0.q, ro0.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public /* bridge */ /* synthetic */ void serialize(uo0.f fVar, Object obj) {
        serialize(fVar, ((Number) obj).doubleValue());
    }

    @Override // ro0.c
    public Double deserialize(uo0.e decoder) {
        s.k(decoder, "decoder");
        return Double.valueOf(decoder.l());
    }

    public void serialize(uo0.f encoder, double value) {
        s.k(encoder, "encoder");
        encoder.r(value);
    }
}
