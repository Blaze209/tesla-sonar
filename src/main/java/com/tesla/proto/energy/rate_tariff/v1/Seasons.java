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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "Lcom/squareup/wire/f;", "", "Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "summer", "winter", "season3", "season4", "season5", "Lokio/k;", "unknownFields", "<init>", "(Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lcom/tesla/proto/energy/rate_tariff/v1/Season;Lokio/k;)Lcom/tesla/proto/energy/rate_tariff/v1/Seasons;", "Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "getSummer", "()Lcom/tesla/proto/energy/rate_tariff/v1/Season;", "getWinter", "getSeason3", "getSeason4", "getSeason5", "Companion", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Seasons extends f {
    public static final ProtoAdapter<Seasons> ADAPTER;
    private static final long serialVersionUID = 0;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Season3", label = q.a.OMIT_IDENTITY, tag = 3)
    private final Season season3;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Season4", label = q.a.OMIT_IDENTITY, tag = 4)
    private final Season season4;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Season5", label = q.a.OMIT_IDENTITY, tag = 5)
    private final Season season5;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Summer", label = q.a.OMIT_IDENTITY, tag = 1)
    private final Season summer;

    @q(adapter = "com.tesla.proto.energy.rate_tariff.v1.Season#ADAPTER", jsonName = "Winter", label = q.a.OMIT_IDENTITY, tag = 2)
    private final Season winter;

    static {
        final b bVar = b.LENGTH_DELIMITED;
        final d dVarB = o0.b(Seasons.class);
        final o oVar = o.PROTO_3;
        ADAPTER = new ProtoAdapter<Seasons>(bVar, dVarB, oVar) { // from class: com.tesla.proto.energy.rate_tariff.v1.Seasons$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Seasons decode(k reader) {
                s.k(reader, "reader");
                long jD = reader.d();
                Season seasonDecode = null;
                Season seasonDecode2 = null;
                Season seasonDecode3 = null;
                Season seasonDecode4 = null;
                Season seasonDecode5 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new Seasons(seasonDecode, seasonDecode2, seasonDecode3, seasonDecode4, seasonDecode5, reader.e(jD));
                    }
                    if (iG == 1) {
                        seasonDecode = Season.ADAPTER.decode(reader);
                    } else if (iG == 2) {
                        seasonDecode2 = Season.ADAPTER.decode(reader);
                    } else if (iG == 3) {
                        seasonDecode3 = Season.ADAPTER.decode(reader);
                    } else if (iG == 4) {
                        seasonDecode4 = Season.ADAPTER.decode(reader);
                    } else if (iG != 5) {
                        reader.m(iG);
                    } else {
                        seasonDecode5 = Season.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(l writer, Seasons value) {
                s.k(writer, "writer");
                s.k(value, "value");
                if (value.getSummer() != null) {
                    Season.ADAPTER.encodeWithTag(writer, 1, value.getSummer());
                }
                if (value.getWinter() != null) {
                    Season.ADAPTER.encodeWithTag(writer, 2, value.getWinter());
                }
                if (value.getSeason3() != null) {
                    Season.ADAPTER.encodeWithTag(writer, 3, value.getSeason3());
                }
                if (value.getSeason4() != null) {
                    Season.ADAPTER.encodeWithTag(writer, 4, value.getSeason4());
                }
                if (value.getSeason5() != null) {
                    Season.ADAPTER.encodeWithTag(writer, 5, value.getSeason5());
                }
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Seasons value) {
                s.k(value, "value");
                int iD = value.unknownFields().D();
                if (value.getSummer() != null) {
                    iD += Season.ADAPTER.encodedSizeWithTag(1, value.getSummer());
                }
                if (value.getWinter() != null) {
                    iD += Season.ADAPTER.encodedSizeWithTag(2, value.getWinter());
                }
                if (value.getSeason3() != null) {
                    iD += Season.ADAPTER.encodedSizeWithTag(3, value.getSeason3());
                }
                if (value.getSeason4() != null) {
                    iD += Season.ADAPTER.encodedSizeWithTag(4, value.getSeason4());
                }
                return value.getSeason5() != null ? iD + Season.ADAPTER.encodedSizeWithTag(5, value.getSeason5()) : iD;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Seasons redact(Seasons value) {
                s.k(value, "value");
                Season summer = value.getSummer();
                Season seasonRedact = summer != null ? Season.ADAPTER.redact(summer) : null;
                Season winter = value.getWinter();
                Season seasonRedact2 = winter != null ? Season.ADAPTER.redact(winter) : null;
                Season season3 = value.getSeason3();
                Season seasonRedact3 = season3 != null ? Season.ADAPTER.redact(season3) : null;
                Season season4 = value.getSeason4();
                Season seasonRedact4 = season4 != null ? Season.ADAPTER.redact(season4) : null;
                Season season5 = value.getSeason5();
                return value.copy(seasonRedact, seasonRedact2, seasonRedact3, seasonRedact4, season5 != null ? Season.ADAPTER.redact(season5) : null, okio.k.f97943e);
            }
        };
    }

    public Seasons() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Seasons copy$default(Seasons seasons, Season season, Season season2, Season season3, Season season4, Season season5, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            season = seasons.summer;
        }
        if ((i11 & 2) != 0) {
            season2 = seasons.winter;
        }
        if ((i11 & 4) != 0) {
            season3 = seasons.season3;
        }
        if ((i11 & 8) != 0) {
            season4 = seasons.season4;
        }
        if ((i11 & 16) != 0) {
            season5 = seasons.season5;
        }
        if ((i11 & 32) != 0) {
            kVar = seasons.unknownFields();
        }
        Season season6 = season5;
        okio.k kVar2 = kVar;
        return seasons.copy(season, season2, season3, season4, season6, kVar2);
    }

    public final Seasons copy(Season summer, Season winter, Season season3, Season season4, Season season5, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new Seasons(summer, winter, season3, season4, season5, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Seasons)) {
            return false;
        }
        Seasons seasons = (Seasons) other;
        return s.f(unknownFields(), seasons.unknownFields()) && s.f(this.summer, seasons.summer) && s.f(this.winter, seasons.winter) && s.f(this.season3, seasons.season3) && s.f(this.season4, seasons.season4) && s.f(this.season5, seasons.season5);
    }

    public final Season getSeason3() {
        return this.season3;
    }

    public final Season getSeason4() {
        return this.season4;
    }

    public final Season getSeason5() {
        return this.season5;
    }

    public final Season getSummer() {
        return this.summer;
    }

    public final Season getWinter() {
        return this.winter;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Season season = this.summer;
        int iHashCode2 = (iHashCode + (season != null ? season.hashCode() : 0)) * 37;
        Season season2 = this.winter;
        int iHashCode3 = (iHashCode2 + (season2 != null ? season2.hashCode() : 0)) * 37;
        Season season3 = this.season3;
        int iHashCode4 = (iHashCode3 + (season3 != null ? season3.hashCode() : 0)) * 37;
        Season season4 = this.season4;
        int iHashCode5 = (iHashCode4 + (season4 != null ? season4.hashCode() : 0)) * 37;
        Season season5 = this.season5;
        int iHashCode6 = iHashCode5 + (season5 != null ? season5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m130newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Season season = this.summer;
        if (season != null) {
            arrayList.add("summer=" + season);
        }
        Season season2 = this.winter;
        if (season2 != null) {
            arrayList.add("winter=" + season2);
        }
        Season season3 = this.season3;
        if (season3 != null) {
            arrayList.add("season3=" + season3);
        }
        Season season4 = this.season4;
        if (season4 != null) {
            arrayList.add("season4=" + season4);
        }
        Season season5 = this.season5;
        if (season5 != null) {
            arrayList.add("season5=" + season5);
        }
        return v.y0(arrayList, ", ", "Seasons{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ Seasons(Season season, Season season2, Season season3, Season season4, Season season5, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : season, (i11 & 2) != 0 ? null : season2, (i11 & 4) != 0 ? null : season3, (i11 & 8) != 0 ? null : season4, (i11 & 16) != 0 ? null : season5, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m130newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Seasons(Season season, Season season2, Season season3, Season season4, Season season5, okio.k unknownFields) {
        super(ADAPTER, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.summer = season;
        this.winter = season2;
        this.season3 = season3;
        this.season4 = season4;
        this.season5 = season5;
    }
}
