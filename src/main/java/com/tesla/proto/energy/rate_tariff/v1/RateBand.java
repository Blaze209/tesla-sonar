package com.tesla.proto.energy.rate_tariff.v1;

import co0.d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.b;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BC\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "Lcom/squareup/wire/f;", "", "", "all", "on_peak", "partial_peak", "off_peak", "super_off_peak", "Lokio/k;", "unknownFields", "<init>", "(DDDDDLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(DDDDDLokio/k;)Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "D", "getAll", "()D", "getOn_peak", "getPartial_peak", "getOff_peak", "getSuper_off_peak", "Companion", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RateBand extends f {
    public static final ProtoAdapter<RateBand> ADAPTER;
    private static final long serialVersionUID = 0;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "ALL", label = q.a.OMIT_IDENTITY, tag = 1)
    private final double all;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "OFF_PEAK", label = q.a.OMIT_IDENTITY, tag = 4)
    private final double off_peak;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "ON_PEAK", label = q.a.OMIT_IDENTITY, tag = 2)
    private final double on_peak;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "PARTIAL_PEAK", label = q.a.OMIT_IDENTITY, tag = 3)
    private final double partial_peak;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "SUPER_OFF_PEAK", label = q.a.OMIT_IDENTITY, tag = 5)
    private final double super_off_peak;

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d dVarB = o0.b(RateBand.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<RateBand>(bVar, dVarB, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.RateBand$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RateBand decode(k reader) {
                s.k(reader, "reader");
                long jD = reader.d();
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                double dDoubleValue5 = 0.0d;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new RateBand(dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, reader.e(jD));
                    }
                    if (iG == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iG == 2) {
                        dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iG == 3) {
                        dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iG == 4) {
                        dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iG != 5) {
                        reader.m(iG);
                    } else {
                        dDoubleValue5 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, RateBand value) {
                s.k(writer, "writer");
                s.k(value, "value");
                if (value.getAll() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.getAll()));
                }
                if (value.getOn_peak() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, Double.valueOf(value.getOn_peak()));
                }
                if (value.getPartial_peak() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, Double.valueOf(value.getPartial_peak()));
                }
                if (value.getOff_peak() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, Double.valueOf(value.getOff_peak()));
                }
                if (value.getSuper_off_peak() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 5, Double.valueOf(value.getSuper_off_peak()));
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RateBand value) {
                s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getAll() != 0.0d) {
                    iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getAll()));
                }
                if (value.getOn_peak() != 0.0d) {
                    iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(value.getOn_peak()));
                }
                if (value.getPartial_peak() != 0.0d) {
                    iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, Double.valueOf(value.getPartial_peak()));
                }
                if (value.getOff_peak() != 0.0d) {
                    iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, Double.valueOf(value.getOff_peak()));
                }
                return value.getSuper_off_peak() == 0.0d ? iD : iD + ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(value.getSuper_off_peak()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RateBand redact(RateBand value) {
                s.k(value, "value");
                return RateBand.copy$default(value, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, okio.k.f97943e, 31, null);
            }
        };
    }

    public RateBand() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, 63, null);
    }

    public static /* synthetic */ RateBand copy$default(RateBand rateBand, double d11, double d12, double d13, double d14, double d15, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = rateBand.all;
        }
        return rateBand.copy(d11, (i11 & 2) != 0 ? rateBand.on_peak : d12, (i11 & 4) != 0 ? rateBand.partial_peak : d13, (i11 & 8) != 0 ? rateBand.off_peak : d14, (i11 & 16) != 0 ? rateBand.super_off_peak : d15, (i11 & 32) != 0 ? rateBand.unknownFields() : kVar);
    }

    public final RateBand copy(double all, double on_peak, double partial_peak, double off_peak, double super_off_peak, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new RateBand(all, on_peak, partial_peak, off_peak, super_off_peak, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RateBand)) {
            return false;
        }
        RateBand rateBand = (RateBand) other;
        return s.f(unknownFields(), rateBand.unknownFields()) && this.all == rateBand.all && this.on_peak == rateBand.on_peak && this.partial_peak == rateBand.partial_peak && this.off_peak == rateBand.off_peak && this.super_off_peak == rateBand.super_off_peak;
    }

    public final double getAll() {
        return this.all;
    }

    public final double getOff_peak() {
        return this.off_peak;
    }

    public final double getOn_peak() {
        return this.on_peak;
    }

    public final double getPartial_peak() {
        return this.partial_peak;
    }

    public final double getSuper_off_peak() {
        return this.super_off_peak;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + Double.hashCode(this.all)) * 37) + Double.hashCode(this.on_peak)) * 37) + Double.hashCode(this.partial_peak)) * 37) + Double.hashCode(this.off_peak)) * 37) + Double.hashCode(this.super_off_peak);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m127newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("all=" + this.all);
        arrayList.add("on_peak=" + this.on_peak);
        arrayList.add("partial_peak=" + this.partial_peak);
        arrayList.add("off_peak=" + this.off_peak);
        arrayList.add("super_off_peak=" + this.super_off_peak);
        return v.y0(arrayList, ", ", "RateBand{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ RateBand(double d11, double d12, double d13, double d14, double d15, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? 0.0d : d12, (i11 & 4) != 0 ? 0.0d : d13, (i11 & 8) != 0 ? 0.0d : d14, (i11 & 16) != 0 ? 0.0d : d15, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m127newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateBand(double d11, double d12, double d13, double d14, double d15, okio.k unknownFields) {
        super(ADAPTER, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.all = d11;
        this.on_peak = d12;
        this.partial_peak = d13;
        this.off_peak = d14;
        this.super_off_peak = d15;
    }
}
