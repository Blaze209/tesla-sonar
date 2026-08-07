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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(BY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ_\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b&\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b'\u0010#¨\u0006)"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "Lcom/squareup/wire/f;", "", "Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "all", "Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "summer", "winter", "season3", "season4", "season5", "Lokio/k;", "unknownFields", "<init>", "(Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;Lokio/k;)Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "getAll", "()Lcom/tesla/proto/energy/rate_tariff/v1/FixedCharge;", "Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "getSummer", "()Lcom/tesla/proto/energy/rate_tariff/v1/RateBand;", "getWinter", "getSeason3", "getSeason4", "getSeason5", "Companion", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Charges extends f {
    public static final ProtoAdapter<Charges> ADAPTER;
    private static final long serialVersionUID = 0;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.FixedCharge#ADAPTER", jsonName = "ALL", label = q.a.OMIT_IDENTITY, tag = 1)
    private final FixedCharge all;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Season3", label = q.a.OMIT_IDENTITY, tag = 4)
    private final RateBand season3;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Season4", label = q.a.OMIT_IDENTITY, tag = 5)
    private final RateBand season4;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Season5", label = q.a.OMIT_IDENTITY, tag = 6)
    private final RateBand season5;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Summer", label = q.a.OMIT_IDENTITY, tag = 2)
    private final RateBand summer;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.RateBand#ADAPTER", jsonName = "Winter", label = q.a.OMIT_IDENTITY, tag = 3)
    private final RateBand winter;

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d dVarB = o0.b(Charges.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<Charges>(bVar, dVarB, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.Charges$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Charges decode(k reader) {
                s.k(reader, "reader");
                long jD = reader.d();
                FixedCharge fixedChargeDecode = null;
                RateBand rateBandDecode = null;
                RateBand rateBandDecode2 = null;
                RateBand rateBandDecode3 = null;
                RateBand rateBandDecode4 = null;
                RateBand rateBandDecode5 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new Charges(fixedChargeDecode, rateBandDecode, rateBandDecode2, rateBandDecode3, rateBandDecode4, rateBandDecode5, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            fixedChargeDecode = FixedCharge.ADAPTER.decode(reader);
                            break;
                        case 2:
                            rateBandDecode = RateBand.ADAPTER.decode(reader);
                            break;
                        case 3:
                            rateBandDecode2 = RateBand.ADAPTER.decode(reader);
                            break;
                        case 4:
                            rateBandDecode3 = RateBand.ADAPTER.decode(reader);
                            break;
                        case 5:
                            rateBandDecode4 = RateBand.ADAPTER.decode(reader);
                            break;
                        case 6:
                            rateBandDecode5 = RateBand.ADAPTER.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, Charges value) {
                s.k(writer, "writer");
                s.k(value, "value");
                if (value.getAll() != null) {
                    FixedCharge.ADAPTER.encodeWithTag(writer, 1, value.getAll());
                }
                if (value.getSummer() != null) {
                    RateBand.ADAPTER.encodeWithTag(writer, 2, value.getSummer());
                }
                if (value.getWinter() != null) {
                    RateBand.ADAPTER.encodeWithTag(writer, 3, value.getWinter());
                }
                if (value.getSeason3() != null) {
                    RateBand.ADAPTER.encodeWithTag(writer, 4, value.getSeason3());
                }
                if (value.getSeason4() != null) {
                    RateBand.ADAPTER.encodeWithTag(writer, 5, value.getSeason4());
                }
                if (value.getSeason5() != null) {
                    RateBand.ADAPTER.encodeWithTag(writer, 6, value.getSeason5());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Charges value) {
                s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getAll() != null) {
                    iD += FixedCharge.ADAPTER.encodedSizeWithTag(1, value.getAll());
                }
                if (value.getSummer() != null) {
                    iD += RateBand.ADAPTER.encodedSizeWithTag(2, value.getSummer());
                }
                if (value.getWinter() != null) {
                    iD += RateBand.ADAPTER.encodedSizeWithTag(3, value.getWinter());
                }
                if (value.getSeason3() != null) {
                    iD += RateBand.ADAPTER.encodedSizeWithTag(4, value.getSeason3());
                }
                if (value.getSeason4() != null) {
                    iD += RateBand.ADAPTER.encodedSizeWithTag(5, value.getSeason4());
                }
                return value.getSeason5() != null ? iD + RateBand.ADAPTER.encodedSizeWithTag(6, value.getSeason5()) : iD;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Charges redact(Charges value) {
                s.k(value, "value");
                FixedCharge all = value.getAll();
                FixedCharge fixedChargeRedact = all != null ? FixedCharge.ADAPTER.redact(all) : null;
                RateBand summer = value.getSummer();
                RateBand rateBandRedact = summer != null ? RateBand.ADAPTER.redact(summer) : null;
                RateBand winter = value.getWinter();
                RateBand rateBandRedact2 = winter != null ? RateBand.ADAPTER.redact(winter) : null;
                RateBand season3 = value.getSeason3();
                RateBand rateBandRedact3 = season3 != null ? RateBand.ADAPTER.redact(season3) : null;
                RateBand season4 = value.getSeason4();
                RateBand rateBandRedact4 = season4 != null ? RateBand.ADAPTER.redact(season4) : null;
                RateBand season5 = value.getSeason5();
                return value.copy(fixedChargeRedact, rateBandRedact, rateBandRedact2, rateBandRedact3, rateBandRedact4, season5 != null ? RateBand.ADAPTER.redact(season5) : null, okio.k.f97943e);
            }
        };
    }

    public Charges() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Charges copy$default(Charges charges, FixedCharge fixedCharge, RateBand rateBand, RateBand rateBand2, RateBand rateBand3, RateBand rateBand4, RateBand rateBand5, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fixedCharge = charges.all;
        }
        if ((i11 & 2) != 0) {
            rateBand = charges.summer;
        }
        if ((i11 & 4) != 0) {
            rateBand2 = charges.winter;
        }
        if ((i11 & 8) != 0) {
            rateBand3 = charges.season3;
        }
        if ((i11 & 16) != 0) {
            rateBand4 = charges.season4;
        }
        if ((i11 & 32) != 0) {
            rateBand5 = charges.season5;
        }
        if ((i11 & 64) != 0) {
            kVar = charges.unknownFields();
        }
        RateBand rateBand6 = rateBand5;
        okio.k kVar2 = kVar;
        RateBand rateBand7 = rateBand4;
        RateBand rateBand8 = rateBand2;
        return charges.copy(fixedCharge, rateBand, rateBand8, rateBand3, rateBand7, rateBand6, kVar2);
    }

    public final Charges copy(FixedCharge all, RateBand summer, RateBand winter, RateBand season3, RateBand season4, RateBand season5, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new Charges(all, summer, winter, season3, season4, season5, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Charges)) {
            return false;
        }
        Charges charges = (Charges) other;
        return s.f(unknownFields(), charges.unknownFields()) && s.f(this.all, charges.all) && s.f(this.summer, charges.summer) && s.f(this.winter, charges.winter) && s.f(this.season3, charges.season3) && s.f(this.season4, charges.season4) && s.f(this.season5, charges.season5);
    }

    public final FixedCharge getAll() {
        return this.all;
    }

    public final RateBand getSeason3() {
        return this.season3;
    }

    public final RateBand getSeason4() {
        return this.season4;
    }

    public final RateBand getSeason5() {
        return this.season5;
    }

    public final RateBand getSummer() {
        return this.summer;
    }

    public final RateBand getWinter() {
        return this.winter;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FixedCharge fixedCharge = this.all;
        int iHashCode2 = (iHashCode + (fixedCharge != null ? fixedCharge.hashCode() : 0)) * 37;
        RateBand rateBand = this.summer;
        int iHashCode3 = (iHashCode2 + (rateBand != null ? rateBand.hashCode() : 0)) * 37;
        RateBand rateBand2 = this.winter;
        int iHashCode4 = (iHashCode3 + (rateBand2 != null ? rateBand2.hashCode() : 0)) * 37;
        RateBand rateBand3 = this.season3;
        int iHashCode5 = (iHashCode4 + (rateBand3 != null ? rateBand3.hashCode() : 0)) * 37;
        RateBand rateBand4 = this.season4;
        int iHashCode6 = (iHashCode5 + (rateBand4 != null ? rateBand4.hashCode() : 0)) * 37;
        RateBand rateBand5 = this.season5;
        int iHashCode7 = iHashCode6 + (rateBand5 != null ? rateBand5.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m124newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        FixedCharge fixedCharge = this.all;
        if (fixedCharge != null) {
            arrayList.add("all=" + fixedCharge);
        }
        RateBand rateBand = this.summer;
        if (rateBand != null) {
            arrayList.add("summer=" + rateBand);
        }
        RateBand rateBand2 = this.winter;
        if (rateBand2 != null) {
            arrayList.add("winter=" + rateBand2);
        }
        RateBand rateBand3 = this.season3;
        if (rateBand3 != null) {
            arrayList.add("season3=" + rateBand3);
        }
        RateBand rateBand4 = this.season4;
        if (rateBand4 != null) {
            arrayList.add("season4=" + rateBand4);
        }
        RateBand rateBand5 = this.season5;
        if (rateBand5 != null) {
            arrayList.add("season5=" + rateBand5);
        }
        return v.y0(arrayList, ", ", "Charges{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ Charges(FixedCharge fixedCharge, RateBand rateBand, RateBand rateBand2, RateBand rateBand3, RateBand rateBand4, RateBand rateBand5, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : fixedCharge, (i11 & 2) != 0 ? null : rateBand, (i11 & 4) != 0 ? null : rateBand2, (i11 & 8) != 0 ? null : rateBand3, (i11 & 16) != 0 ? null : rateBand4, (i11 & 32) != 0 ? null : rateBand5, (i11 & 64) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m124newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Charges(FixedCharge fixedCharge, RateBand rateBand, RateBand rateBand2, RateBand rateBand3, RateBand rateBand4, RateBand rateBand5, okio.k unknownFields) {
        super(ADAPTER, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.all = fixedCharge;
        this.summer = rateBand;
        this.winter = rateBand2;
        this.season3 = rateBand3;
        this.season4 = rateBand4;
        this.season5 = rateBand5;
    }
}
