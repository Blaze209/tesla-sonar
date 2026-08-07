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
import java.util.List;
import jn0.e;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 >2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B¡\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J§\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010%R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b*\u0010%R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b+\u0010%R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010%R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b0\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b4\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b5\u00103R\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b6\u0010/R\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b7\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Tariff;", "Lcom/squareup/wire/f;", "", "", "code", "name", "utility", "currency", "", "Lcom/tesla/proto/energy/rate_tariff/v1/DailyCharge;", "daily_charges", "", "monthly_charges", "monthly_minimum_bill", "Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "demand_charges", "daily_demand_charges", "energy_charges", "max_applicable_demand", "min_applicable_demand", "Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "seasons", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DDLcom/tesla/proto/energy/rate_tariff/v1/Charges;Lcom/tesla/proto/energy/rate_tariff/v1/Charges;Lcom/tesla/proto/energy/rate_tariff/v1/Charges;DDLcom/tesla/proto/energy/rate_tariff/v1/Seasons;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;DDLcom/tesla/proto/energy/rate_tariff/v1/Charges;Lcom/tesla/proto/energy/rate_tariff/v1/Charges;Lcom/tesla/proto/energy/rate_tariff/v1/Charges;DDLcom/tesla/proto/energy/rate_tariff/v1/Seasons;Lokio/k;)Lcom/tesla/proto/energy/rate_tariff/v1/Tariff;", "Ljava/lang/String;", "getCode", "getName", "getUtility", "getCurrency", "D", "getMonthly_charges", "()D", "getMonthly_minimum_bill", "Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "getDemand_charges", "()Lcom/tesla/proto/energy/rate_tariff/v1/Charges;", "getDaily_demand_charges", "getEnergy_charges", "getMax_applicable_demand", "getMin_applicable_demand", "Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "getSeasons", "()Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "Ljava/util/List;", "getDaily_charges", "()Ljava/util/List;", "Companion", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Tariff extends f {
    public static final ProtoAdapter<Tariff> ADAPTER;
    private static final long serialVersionUID = 0;

    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 1)
    private final String code;

    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 4)
    private final String currency;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.DailyCharge#ADAPTER", label = q.a.REPEATED, tag = 5)
    private final List<DailyCharge> daily_charges;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Charges#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 9)
    private final Charges daily_demand_charges;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Charges#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 8)
    private final Charges demand_charges;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Charges#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 10)
    private final Charges energy_charges;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 11)
    private final double max_applicable_demand;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 12)
    private final double min_applicable_demand;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 6)
    private final double monthly_charges;

    @q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = q.a.OMIT_IDENTITY, tag = 7)
    private final double monthly_minimum_bill;

    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 2)
    private final String name;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Seasons#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 13)
    private final Seasons seasons;

    @q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = q.a.OMIT_IDENTITY, tag = 3)
    private final String utility;

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d dVarB = o0.b(Tariff.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<Tariff>(bVar, dVarB, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.Tariff$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Tariff decode(k reader) {
                s.k(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jD = reader.d();
                String strDecode = "";
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                double dDoubleValue4 = 0.0d;
                Charges chargesDecode = null;
                Charges chargesDecode2 = null;
                Charges chargesDecode3 = null;
                Seasons seasonsDecode = null;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iG = reader.g();
                    String str = strDecode2;
                    if (iG == -1) {
                        return new Tariff(strDecode, str, strDecode3, strDecode4, arrayList, dDoubleValue, dDoubleValue2, chargesDecode, chargesDecode2, chargesDecode3, dDoubleValue3, dDoubleValue4, seasonsDecode, reader.e(jD));
                    }
                    switch (iG) {
                        case 1:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 3:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            arrayList.add(DailyCharge.ADAPTER.decode(reader));
                            break;
                        case 6:
                            dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            break;
                        case 7:
                            dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            break;
                        case 8:
                            chargesDecode = Charges.ADAPTER.decode(reader);
                            break;
                        case 9:
                            chargesDecode2 = Charges.ADAPTER.decode(reader);
                            break;
                        case 10:
                            chargesDecode3 = Charges.ADAPTER.decode(reader);
                            break;
                        case 11:
                            dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            break;
                        case 12:
                            dDoubleValue4 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            break;
                        case 13:
                            seasonsDecode = Seasons.ADAPTER.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                    strDecode2 = str;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, Tariff value) {
                s.k(writer, "writer");
                s.k(value, "value");
                if (!s.f(value.getCode(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getCode());
                }
                if (!s.f(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
                }
                if (!s.f(value.getUtility(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getUtility());
                }
                if (!s.f(value.getCurrency(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getCurrency());
                }
                DailyCharge.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.getDaily_charges());
                if (value.getMonthly_charges() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, Double.valueOf(value.getMonthly_charges()));
                }
                if (value.getMonthly_minimum_bill() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, Double.valueOf(value.getMonthly_minimum_bill()));
                }
                if (value.getDemand_charges() != null) {
                    Charges.ADAPTER.encodeWithTag(writer, 8, value.getDemand_charges());
                }
                if (value.getDaily_demand_charges() != null) {
                    Charges.ADAPTER.encodeWithTag(writer, 9, value.getDaily_demand_charges());
                }
                if (value.getEnergy_charges() != null) {
                    Charges.ADAPTER.encodeWithTag(writer, 10, value.getEnergy_charges());
                }
                if (value.getMax_applicable_demand() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 11, Double.valueOf(value.getMax_applicable_demand()));
                }
                if (value.getMin_applicable_demand() != 0.0d) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 12, Double.valueOf(value.getMin_applicable_demand()));
                }
                if (value.getSeasons() != null) {
                    Seasons.ADAPTER.encodeWithTag(writer, 13, value.getSeasons());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Tariff value) {
                s.k(value, "value");
                int iD = value.unknownFields().D();
                if (!s.f(value.getCode(), "")) {
                    iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCode());
                }
                if (!s.f(value.getName(), "")) {
                    iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                }
                if (!s.f(value.getUtility(), "")) {
                    iD += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUtility());
                }
                if (!s.f(value.getCurrency(), "")) {
                    iD += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCurrency());
                }
                int iEncodedSizeWithTag = iD + DailyCharge.ADAPTER.asRepeated().encodedSizeWithTag(5, value.getDaily_charges());
                if (value.getMonthly_charges() != 0.0d) {
                    iEncodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getMonthly_charges()));
                }
                if (value.getMonthly_minimum_bill() != 0.0d) {
                    iEncodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getMonthly_minimum_bill()));
                }
                if (value.getDemand_charges() != null) {
                    iEncodedSizeWithTag += Charges.ADAPTER.encodedSizeWithTag(8, value.getDemand_charges());
                }
                if (value.getDaily_demand_charges() != null) {
                    iEncodedSizeWithTag += Charges.ADAPTER.encodedSizeWithTag(9, value.getDaily_demand_charges());
                }
                if (value.getEnergy_charges() != null) {
                    iEncodedSizeWithTag += Charges.ADAPTER.encodedSizeWithTag(10, value.getEnergy_charges());
                }
                if (value.getMax_applicable_demand() != 0.0d) {
                    iEncodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(11, Double.valueOf(value.getMax_applicable_demand()));
                }
                if (value.getMin_applicable_demand() != 0.0d) {
                    iEncodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(12, Double.valueOf(value.getMin_applicable_demand()));
                }
                return value.getSeasons() != null ? iEncodedSizeWithTag + Seasons.ADAPTER.encodedSizeWithTag(13, value.getSeasons()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Tariff redact(Tariff value) {
                s.k(value, "value");
                List listA = x20.d.a(value.getDaily_charges(), DailyCharge.ADAPTER);
                Charges demand_charges = value.getDemand_charges();
                Charges chargesRedact = demand_charges != null ? Charges.ADAPTER.redact(demand_charges) : null;
                Charges daily_demand_charges = value.getDaily_demand_charges();
                Charges chargesRedact2 = daily_demand_charges != null ? Charges.ADAPTER.redact(daily_demand_charges) : null;
                Charges energy_charges = value.getEnergy_charges();
                Charges chargesRedact3 = energy_charges != null ? Charges.ADAPTER.redact(energy_charges) : null;
                Seasons seasons = value.getSeasons();
                return value.copy((3183 & 1) != 0 ? value.code : null, (3183 & 2) != 0 ? value.name : null, (3183 & 4) != 0 ? value.utility : null, (3183 & 8) != 0 ? value.currency : null, (3183 & 16) != 0 ? value.daily_charges : listA, (3183 & 32) != 0 ? value.monthly_charges : 0.0d, (3183 & 64) != 0 ? value.monthly_minimum_bill : 0.0d, (3183 & 128) != 0 ? value.demand_charges : chargesRedact, (3183 & 256) != 0 ? value.daily_demand_charges : chargesRedact2, (3183 & 512) != 0 ? value.energy_charges : chargesRedact3, (3183 & 1024) != 0 ? value.max_applicable_demand : 0.0d, (3183 & 2048) != 0 ? value.min_applicable_demand : 0.0d, (3183 & 4096) != 0 ? value.seasons : seasons != null ? Seasons.ADAPTER.redact(seasons) : null, (3183 & PKIFailureInfo.certRevoked) != 0 ? value.unknownFields() : okio.k.f97943e);
            }
        };
    }

    public Tariff() {
        this(null, null, null, null, null, 0.0d, 0.0d, null, null, null, 0.0d, 0.0d, null, null, 16383, null);
    }

    public final Tariff copy(String code, String name, String utility, String currency, List<DailyCharge> daily_charges, double monthly_charges, double monthly_minimum_bill, Charges demand_charges, Charges daily_demand_charges, Charges energy_charges, double max_applicable_demand, double min_applicable_demand, Seasons seasons, okio.k unknownFields) {
        s.k(code, "code");
        s.k(name, "name");
        s.k(utility, "utility");
        s.k(currency, "currency");
        s.k(daily_charges, "daily_charges");
        s.k(unknownFields, "unknownFields");
        return new Tariff(code, name, utility, currency, daily_charges, monthly_charges, monthly_minimum_bill, demand_charges, daily_demand_charges, energy_charges, max_applicable_demand, min_applicable_demand, seasons, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Tariff)) {
            return false;
        }
        Tariff tariff = (Tariff) other;
        return s.f(unknownFields(), tariff.unknownFields()) && s.f(this.code, tariff.code) && s.f(this.name, tariff.name) && s.f(this.utility, tariff.utility) && s.f(this.currency, tariff.currency) && s.f(this.daily_charges, tariff.daily_charges) && this.monthly_charges == tariff.monthly_charges && this.monthly_minimum_bill == tariff.monthly_minimum_bill && s.f(this.demand_charges, tariff.demand_charges) && s.f(this.daily_demand_charges, tariff.daily_demand_charges) && s.f(this.energy_charges, tariff.energy_charges) && this.max_applicable_demand == tariff.max_applicable_demand && this.min_applicable_demand == tariff.min_applicable_demand && s.f(this.seasons, tariff.seasons);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final List<DailyCharge> getDaily_charges() {
        return this.daily_charges;
    }

    public final Charges getDaily_demand_charges() {
        return this.daily_demand_charges;
    }

    public final Charges getDemand_charges() {
        return this.demand_charges;
    }

    public final Charges getEnergy_charges() {
        return this.energy_charges;
    }

    public final double getMax_applicable_demand() {
        return this.max_applicable_demand;
    }

    public final double getMin_applicable_demand() {
        return this.min_applicable_demand;
    }

    public final double getMonthly_charges() {
        return this.monthly_charges;
    }

    public final double getMonthly_minimum_bill() {
        return this.monthly_minimum_bill;
    }

    public final String getName() {
        return this.name;
    }

    public final Seasons getSeasons() {
        return this.seasons;
    }

    public final String getUtility() {
        return this.utility;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.code.hashCode()) * 37) + this.name.hashCode()) * 37) + this.utility.hashCode()) * 37) + this.currency.hashCode()) * 37) + this.daily_charges.hashCode()) * 37) + Double.hashCode(this.monthly_charges)) * 37) + Double.hashCode(this.monthly_minimum_bill)) * 37;
        Charges charges = this.demand_charges;
        int iHashCode2 = (iHashCode + (charges != null ? charges.hashCode() : 0)) * 37;
        Charges charges2 = this.daily_demand_charges;
        int iHashCode3 = (iHashCode2 + (charges2 != null ? charges2.hashCode() : 0)) * 37;
        Charges charges3 = this.energy_charges;
        int iHashCode4 = (((((iHashCode3 + (charges3 != null ? charges3.hashCode() : 0)) * 37) + Double.hashCode(this.max_applicable_demand)) * 37) + Double.hashCode(this.min_applicable_demand)) * 37;
        Seasons seasons = this.seasons;
        int iHashCode5 = iHashCode4 + (seasons != null ? seasons.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m133newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("code=" + x20.d.i(this.code));
        arrayList.add("name=" + x20.d.i(this.name));
        arrayList.add("utility=" + x20.d.i(this.utility));
        arrayList.add("currency=" + x20.d.i(this.currency));
        if (!this.daily_charges.isEmpty()) {
            arrayList.add("daily_charges=" + this.daily_charges);
        }
        arrayList.add("monthly_charges=" + this.monthly_charges);
        arrayList.add("monthly_minimum_bill=" + this.monthly_minimum_bill);
        Charges charges = this.demand_charges;
        if (charges != null) {
            arrayList.add("demand_charges=" + charges);
        }
        Charges charges2 = this.daily_demand_charges;
        if (charges2 != null) {
            arrayList.add("daily_demand_charges=" + charges2);
        }
        Charges charges3 = this.energy_charges;
        if (charges3 != null) {
            arrayList.add("energy_charges=" + charges3);
        }
        arrayList.add("max_applicable_demand=" + this.max_applicable_demand);
        arrayList.add("min_applicable_demand=" + this.min_applicable_demand);
        Seasons seasons = this.seasons;
        if (seasons != null) {
            arrayList.add("seasons=" + seasons);
        }
        return v.y0(arrayList, ", ", "Tariff{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ Tariff(String str, String str2, String str3, String str4, List list, double d11, double d12, Charges charges, Charges charges2, Charges charges3, double d13, double d14, Seasons seasons, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) == 0 ? str4 : "", (i11 & 16) != 0 ? v.m() : list, (i11 & 32) != 0 ? 0.0d : d11, (i11 & 64) != 0 ? 0.0d : d12, (i11 & 128) != 0 ? null : charges, (i11 & 256) != 0 ? null : charges2, (i11 & 512) != 0 ? null : charges3, (i11 & 1024) != 0 ? 0.0d : d13, (i11 & 2048) != 0 ? 0.0d : d14, (i11 & 4096) != 0 ? null : seasons, (i11 & PKIFailureInfo.certRevoked) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m133newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tariff(String code, String name, String utility, String currency, List<DailyCharge> daily_charges, double d11, double d12, Charges charges, Charges charges2, Charges charges3, double d13, double d14, Seasons seasons, okio.k unknownFields) {
        super(ADAPTER, unknownFields);
        s.k(code, "code");
        s.k(name, "name");
        s.k(utility, "utility");
        s.k(currency, "currency");
        s.k(daily_charges, "daily_charges");
        s.k(unknownFields, "unknownFields");
        this.code = code;
        this.name = name;
        this.utility = utility;
        this.currency = currency;
        this.monthly_charges = d11;
        this.monthly_minimum_bill = d12;
        this.demand_charges = charges;
        this.daily_demand_charges = charges2;
        this.energy_charges = charges3;
        this.max_applicable_demand = d13;
        this.min_applicable_demand = d14;
        this.seasons = seasons;
        this.daily_charges = x20.d.g("daily_charges", daily_charges);
    }
}
