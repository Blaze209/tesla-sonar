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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$BE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "Lcom/squareup/wire/f;", "", "", "from_day", "to_day", "from_month", "to_month", "Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "tou_periods", "Lokio/k;", "unknownFields", "<init>", "(IIIILcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(IIIILcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;Lokio/k;)Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "I", "getFrom_day", "getTo_day", "getFrom_month", "getTo_month", "Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "getTou_periods", "()Lcom/tesla/proto/energy/rate_tariff/v1/TOUPeriods;", "Companion", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Season extends f {
    public static final ProtoAdapter<Season> ADAPTER;
    private static final long serialVersionUID = 0;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromDay", label = q.a.OMIT_IDENTITY, tag = 1)
    private final int from_day;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fromMonth", label = q.a.OMIT_IDENTITY, tag = 3)
    private final int from_month;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toDay", label = q.a.OMIT_IDENTITY, tag = 2)
    private final int to_day;

    @q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "toMonth", label = q.a.OMIT_IDENTITY, tag = 4)
    private final int to_month;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.TOUPeriods#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)
    private final TOUPeriods tou_periods;

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d dVarB = o0.b(Season.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<Season>(bVar, dVarB, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.Season$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Season decode(k reader) {
                s.k(reader, "reader");
                long jD = reader.d();
                TOUPeriods tOUPeriodsDecode = null;
                int iIntValue = 0;
                int iIntValue2 = 0;
                int iIntValue3 = 0;
                int iIntValue4 = 0;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new Season(iIntValue, iIntValue2, iIntValue3, iIntValue4, tOUPeriodsDecode, reader.e(jD));
                    }
                    if (iG == 1) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iG == 2) {
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iG == 3) {
                        iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iG == 4) {
                        iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iG != 5) {
                        reader.m(iG);
                    } else {
                        tOUPeriodsDecode = TOUPeriods.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, Season value) {
                s.k(writer, "writer");
                s.k(value, "value");
                if (value.getFrom_day() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getFrom_day()));
                }
                if (value.getTo_day() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 2, Integer.valueOf(value.getTo_day()));
                }
                if (value.getFrom_month() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getFrom_month()));
                }
                if (value.getTo_month() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getTo_month()));
                }
                if (value.getTou_periods() != null) {
                    TOUPeriods.ADAPTER.encodeWithTag(writer, 5, value.getTou_periods());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Season value) {
                s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getFrom_day() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getFrom_day()));
                }
                if (value.getTo_day() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(value.getTo_day()));
                }
                if (value.getFrom_month() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getFrom_month()));
                }
                if (value.getTo_month() != 0) {
                    iD += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getTo_month()));
                }
                return value.getTou_periods() != null ? iD + TOUPeriods.ADAPTER.encodedSizeWithTag(5, value.getTou_periods()) : iD;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Season redact(Season value) {
                s.k(value, "value");
                TOUPeriods tou_periods = value.getTou_periods();
                return Season.copy$default(value, 0, 0, 0, 0, tou_periods != null ? TOUPeriods.ADAPTER.redact(tou_periods) : null, okio.k.f97943e, 15, null);
            }
        };
    }

    public Season() {
        this(0, 0, 0, 0, null, null, 63, null);
    }

    public static /* synthetic */ Season copy$default(Season season, int i11, int i12, int i13, int i14, TOUPeriods tOUPeriods, okio.k kVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = season.from_day;
        }
        if ((i15 & 2) != 0) {
            i12 = season.to_day;
        }
        if ((i15 & 4) != 0) {
            i13 = season.from_month;
        }
        if ((i15 & 8) != 0) {
            i14 = season.to_month;
        }
        if ((i15 & 16) != 0) {
            tOUPeriods = season.tou_periods;
        }
        if ((i15 & 32) != 0) {
            kVar = season.unknownFields();
        }
        TOUPeriods tOUPeriods2 = tOUPeriods;
        okio.k kVar2 = kVar;
        return season.copy(i11, i12, i13, i14, tOUPeriods2, kVar2);
    }

    public final Season copy(int from_day, int to_day, int from_month, int to_month, TOUPeriods tou_periods, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new Season(from_day, to_day, from_month, to_month, tou_periods, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Season)) {
            return false;
        }
        Season season = (Season) other;
        return s.f(unknownFields(), season.unknownFields()) && this.from_day == season.from_day && this.to_day == season.to_day && this.from_month == season.from_month && this.to_month == season.to_month && s.f(this.tou_periods, season.tou_periods);
    }

    public final int getFrom_day() {
        return this.from_day;
    }

    public final int getFrom_month() {
        return this.from_month;
    }

    public final int getTo_day() {
        return this.to_day;
    }

    public final int getTo_month() {
        return this.to_month;
    }

    public final TOUPeriods getTou_periods() {
        return this.tou_periods;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.from_day)) * 37) + Integer.hashCode(this.to_day)) * 37) + Integer.hashCode(this.from_month)) * 37) + Integer.hashCode(this.to_month)) * 37;
        TOUPeriods tOUPeriods = this.tou_periods;
        int iHashCode2 = iHashCode + (tOUPeriods != null ? tOUPeriods.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m129newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("from_day=" + this.from_day);
        arrayList.add("to_day=" + this.to_day);
        arrayList.add("from_month=" + this.from_month);
        arrayList.add("to_month=" + this.to_month);
        TOUPeriods tOUPeriods = this.tou_periods;
        if (tOUPeriods != null) {
            arrayList.add("tou_periods=" + tOUPeriods);
        }
        return v.y0(arrayList, ", ", "Season{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ Season(int i11, int i12, int i13, int i14, TOUPeriods tOUPeriods, okio.k kVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14, (i15 & 16) != 0 ? null : tOUPeriods, (i15 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m129newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Season(int i11, int i12, int i13, int i14, TOUPeriods tOUPeriods, okio.k unknownFields) {
        super(ADAPTER, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.from_day = i11;
        this.to_day = i12;
        this.from_month = i13;
        this.to_month = i14;
        this.tou_periods = tOUPeriods;
    }
}
