package com.fourthline.scanners.config.orca.kyc.model.serialization;

import com.fourthline.core.location.Coordinate;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ro0.d;
import to0.e;
import to0.f;
import to0.m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/serialization/CoordinateSerializer;", "Lro0/d;", "Lcom/fourthline/core/location/Coordinate;", "<init>", "()V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Lcom/fourthline/core/location/Coordinate;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Lcom/fourthline/core/location/Coordinate;)V", "Lto0/f;", "descriptor", "Lto0/f;", "getDescriptor", "()Lto0/f;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoordinateSerializer implements d<Coordinate> {
    public static final CoordinateSerializer INSTANCE = new CoordinateSerializer();
    private static final f descriptor = m.c("Coordinate", e.d.f114878a);

    private CoordinateSerializer() {
    }

    @Override // ro0.d, ro0.q, ro0.c
    public f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.c
    public Coordinate deserialize(uo0.e decoder) {
        s.k(decoder, "decoder");
        return new Coordinate(LatitudeSerializer.INSTANCE.deserialize(decoder).doubleValue(), LongitudeSerializer.INSTANCE.deserialize(decoder).doubleValue());
    }

    @Override // ro0.q
    public void serialize(uo0.f encoder, Coordinate value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        LatitudeSerializer.INSTANCE.serialize(encoder, value.getLatitude());
        LongitudeSerializer.INSTANCE.serialize(encoder, value.getLatitude());
    }
}
