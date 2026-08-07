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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/DailyCharge;", "Lcom/squareup/wire/f;", "", "", "amount", "", "name", "Lokio/k;", "unknownFields", "<init>", "(DLjava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(DLjava/lang/String;Lokio/k;)Lcom/tesla/proto/energy/rate_tariff/v1/DailyCharge;", "D", "getAmount", "()D", "Ljava/lang/String;", "getName", "Companion", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailyCharge extends f {
    public static final ProtoAdapter<DailyCharge> ADAPTER;
    private static final long serialVersionUID = 0;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 1)
    private final double amount;

    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)
    private final String name;

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d dVarB = o0.b(DailyCharge.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<DailyCharge>(bVar, dVarB, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.DailyCharge$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DailyCharge decode(k reader) {
                s.k(reader, "reader");
                long jD = reader.d();
                double dDoubleValue = 0.0d;
                String strDecode = "";
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new DailyCharge(dDoubleValue, strDecode, reader.e(jD));
                    }
                    if (iG == 1) {
                        dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                    } else if (iG != 2) {
                        reader.m(iG);
                    } else {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, DailyCharge value) {
                s.k(writer, "writer");
                s.k(value, "value");
                if (value.getAmount() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, Double.valueOf(value.getAmount()));
                }
                if (!s.f(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DailyCharge value) {
                s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getAmount() != 0.0d) {
                    iD += ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(value.getAmount()));
                }
                return !s.f(value.getName(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName()) : iD;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DailyCharge redact(DailyCharge value) {
                s.k(value, "value");
                return DailyCharge.copy$default(value, 0.0d, null, okio.k.f97943e, 3, null);
            }
        };
    }

    public DailyCharge() {
        this(0.0d, null, null, 7, null);
    }

    public static /* synthetic */ DailyCharge copy$default(DailyCharge dailyCharge, double d11, String str, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = dailyCharge.amount;
        }
        if ((i11 & 2) != 0) {
            str = dailyCharge.name;
        }
        if ((i11 & 4) != 0) {
            kVar = dailyCharge.unknownFields();
        }
        return dailyCharge.copy(d11, str, kVar);
    }

    public final DailyCharge copy(double amount, String name, okio.k unknownFields) {
        s.k(name, "name");
        s.k(unknownFields, "unknownFields");
        return new DailyCharge(amount, name, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DailyCharge)) {
            return false;
        }
        DailyCharge dailyCharge = (DailyCharge) other;
        return s.f(unknownFields(), dailyCharge.unknownFields()) && this.amount == dailyCharge.amount && s.f(this.name, dailyCharge.name);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Double.hashCode(this.amount)) * 37) + this.name.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m125newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("amount=" + this.amount);
        arrayList.add("name=" + x20.d.i(this.name));
        return v.y0(arrayList, ", ", "DailyCharge{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ DailyCharge(double d11, String str, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m125newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyCharge(double d11, String name, okio.k unknownFields) {
        super(ADAPTER, unknownFields);
        s.k(name, "name");
        s.k(unknownFields, "unknownFields");
        this.amount = d11;
        this.name = name;
    }
}
