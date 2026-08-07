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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "Lcom/squareup/wire/f;", "", "", "all", "Lokio/k;", "unknownFields", "<init>", "(DLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(DLokio/k;)Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "D", "getAll", "()D", "Companion", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedCharge extends f {
    public static final ProtoAdapter<FixedCharge> ADAPTER;
    private static final long serialVersionUID = 0;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "ALL", label = q.a.OMIT_IDENTITY, tag = 1)
    private final double all;

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d dVarB = o0.b(FixedCharge.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<FixedCharge>(bVar, dVarB, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.FixedCharge$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FixedCharge decode(k reader) {
                s.k(reader, "reader");
                long jD = reader.d();
                double dDoubleValue = 0.0d;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new FixedCharge(dDoubleValue, reader.e(jD));
                    }
                    if (iG == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else {
                        reader.m(iG);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, FixedCharge value) {
                s.k(writer, "writer");
                s.k(value, "value");
                if (value.getAll() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.getAll()));
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FixedCharge value) {
                s.k(value, "value");
                int iD = value.unknownFields().D();
                return value.getAll() == 0.0d ? iD : iD + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getAll()));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FixedCharge redact(FixedCharge value) {
                s.k(value, "value");
                return FixedCharge.copy$default(value, 0.0d, okio.k.f97943e, 1, null);
            }
        };
    }

    public FixedCharge() {
        this(0.0d, null, 3, null);
    }

    public static /* synthetic */ FixedCharge copy$default(FixedCharge fixedCharge, double d11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = fixedCharge.all;
        }
        if ((i11 & 2) != 0) {
            kVar = fixedCharge.unknownFields();
        }
        return fixedCharge.copy(d11, kVar);
    }

    public final FixedCharge copy(double all, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new FixedCharge(all, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FixedCharge)) {
            return false;
        }
        FixedCharge fixedCharge = (FixedCharge) other;
        return s.f(unknownFields(), fixedCharge.unknownFields()) && this.all == fixedCharge.all;
    }

    public final double getAll() {
        return this.all;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + Double.hashCode(this.all);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m126newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("all=" + this.all);
        return v.y0(arrayList, ", ", "FixedCharge{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ FixedCharge(double d11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m126newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedCharge(double d11, okio.k unknownFields) {
        super(ADAPTER, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.all = d11;
    }
}
