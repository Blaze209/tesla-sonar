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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BM\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u0016R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b!\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\"\u0010\u0016¨\u0006$"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriod;", "Lcom/squareup/wire/f;", "", "", "from_day_of_week", "to_day_of_week", "from_hour", "from_minute", "to_hour", "to_minute", "Lokio/k;", "unknownFields", "<init>", "(IIIIIILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(IIIIIILokio/k;)Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriod;", "I", "getFrom_day_of_week", "getTo_day_of_week", "getFrom_hour", "getFrom_minute", "getTo_hour", "getTo_minute", "Companion", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TOUPeriod extends f {
    public static final ProtoAdapter<TOUPeriod> ADAPTER;
    private static final long serialVersionUID = 0;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromDayOfWeek", label = q.a.OMIT_IDENTITY, tag = 1)
    private final int from_day_of_week;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromHour", label = q.a.OMIT_IDENTITY, tag = 3)
    private final int from_hour;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromMinute", label = q.a.OMIT_IDENTITY, tag = 4)
    private final int from_minute;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toDayOfWeek", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int to_day_of_week;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toHour", label = q.a.OMIT_IDENTITY, tag = 5)
    private final int to_hour;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toMinute", label = q.a.OMIT_IDENTITY, tag = 6)
    private final int to_minute;

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d dVarB = o0.b(TOUPeriod.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<TOUPeriod>(bVar, dVarB, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.TOUPeriod$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TOUPeriod decode(k reader) {
                s.k(reader, "reader");
                long jD = reader.d();
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                int iIntValue5 = 0;
                int iIntValue6 = 0;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new TOUPeriod(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 2:
                            iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 3:
                            iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 4:
                            iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 5:
                            iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 6:
                            iIntValue6 = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, TOUPeriod value) {
                s.k(writer, "writer");
                s.k(value, "value");
                if (value.getFrom_day_of_week() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getFrom_day_of_week()));
                }
                if (value.getTo_day_of_week() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getTo_day_of_week()));
                }
                if (value.getFrom_hour() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getFrom_hour()));
                }
                if (value.getFrom_minute() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getFrom_minute()));
                }
                if (value.getTo_hour() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getTo_hour()));
                }
                if (value.getTo_minute() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getTo_minute()));
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TOUPeriod value) {
                s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getFrom_day_of_week() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getFrom_day_of_week()));
                }
                if (value.getTo_day_of_week() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTo_day_of_week()));
                }
                if (value.getFrom_hour() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getFrom_hour()));
                }
                if (value.getFrom_minute() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getFrom_minute()));
                }
                if (value.getTo_hour() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getTo_hour()));
                }
                return value.getTo_minute() != 0 ? iD + ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getTo_minute())) : iD;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TOUPeriod redact(TOUPeriod value) {
                s.k(value, "value");
                return TOUPeriod.copy$default(value, 0, 0, 0, 0, 0, 0, okio.k.f97943e, 63, null);
            }
        };
    }

    public TOUPeriod() {
        this(0, 0, 0, 0, 0, 0, null, 127, null);
    }

    public static /* synthetic */ TOUPeriod copy$default(TOUPeriod tOUPeriod, int i11, int i12, int i13, int i14, int i15, int i16, okio.k kVar, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = tOUPeriod.from_day_of_week;
        }
        if ((i17 & 2) != 0) {
            i12 = tOUPeriod.to_day_of_week;
        }
        if ((i17 & 4) != 0) {
            i13 = tOUPeriod.from_hour;
        }
        if ((i17 & 8) != 0) {
            i14 = tOUPeriod.from_minute;
        }
        if ((i17 & 16) != 0) {
            i15 = tOUPeriod.to_hour;
        }
        if ((i17 & 32) != 0) {
            i16 = tOUPeriod.to_minute;
        }
        if ((i17 & 64) != 0) {
            kVar = tOUPeriod.unknownFields();
        }
        int i18 = i16;
        okio.k kVar2 = kVar;
        int i19 = i15;
        int i21 = i13;
        return tOUPeriod.copy(i11, i12, i21, i14, i19, i18, kVar2);
    }

    public final TOUPeriod copy(int from_day_of_week, int to_day_of_week, int from_hour, int from_minute, int to_hour, int to_minute, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new TOUPeriod(from_day_of_week, to_day_of_week, from_hour, from_minute, to_hour, to_minute, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TOUPeriod)) {
            return false;
        }
        TOUPeriod tOUPeriod = (TOUPeriod) other;
        return s.f(unknownFields(), tOUPeriod.unknownFields()) && this.from_day_of_week == tOUPeriod.from_day_of_week && this.to_day_of_week == tOUPeriod.to_day_of_week && this.from_hour == tOUPeriod.from_hour && this.from_minute == tOUPeriod.from_minute && this.to_hour == tOUPeriod.to_hour && this.to_minute == tOUPeriod.to_minute;
    }

    public final int getFrom_day_of_week() {
        return this.from_day_of_week;
    }

    public final int getFrom_hour() {
        return this.from_hour;
    }

    public final int getFrom_minute() {
        return this.from_minute;
    }

    public final int getTo_day_of_week() {
        return this.to_day_of_week;
    }

    public final int getTo_hour() {
        return this.to_hour;
    }

    public final int getTo_minute() {
        return this.to_minute;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.from_day_of_week)) * 37) + Integer.hashCode(this.to_day_of_week)) * 37) + Integer.hashCode(this.from_hour)) * 37) + Integer.hashCode(this.from_minute)) * 37) + Integer.hashCode(this.to_hour)) * 37) + Integer.hashCode(this.to_minute);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m131newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("from_day_of_week=" + this.from_day_of_week);
        arrayList.add("to_day_of_week=" + this.to_day_of_week);
        arrayList.add("from_hour=" + this.from_hour);
        arrayList.add("from_minute=" + this.from_minute);
        arrayList.add("to_hour=" + this.to_hour);
        arrayList.add("to_minute=" + this.to_minute);
        return v.y0(arrayList, ", ", "TOUPeriod{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ TOUPeriod(int i11, int i12, int i13, int i14, int i15, int i16, okio.k kVar, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) != 0 ? 0 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? 0 : i15, (i17 & 32) != 0 ? 0 : i16, (i17 & 64) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m131newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TOUPeriod(int i11, int i12, int i13, int i14, int i15, int i16, okio.k unknownFields) {
        super(ADAPTER, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.from_day_of_week = i11;
        this.to_day_of_week = i12;
        this.from_hour = i13;
        this.from_minute = i14;
        this.to_hour = i15;
        this.to_minute = i16;
    }
}
