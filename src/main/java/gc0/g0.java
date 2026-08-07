package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001e\u0018\u0000 52\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u008f\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0095\u0001\u0010!\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"R\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b,\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b/\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b*\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b3\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lgc0/g0;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "now_playing_duration", "now_playing_elapsed", "", "now_playing_source_string", "now_playing_album", "now_playing_station", "a2dp_source_name", "Lgc0/s0;", "recent_theater_source", "recent_theater_source_string", "", "theater_source_is_playing", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc0/s0;Ljava/lang/String;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc0/s0;Ljava/lang/String;Ljava/lang/Boolean;Lokio/k;)Lgc0/g0;", "Lj$/time/Instant;", "l", "()Lj$/time/Instant;", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "c", "f", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "g", "h", "Lgc0/s0;", IntegerTokenConverter.CONVERTER_KEY, "()Lgc0/s0;", "j", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ProtoAdapter<g0> f68052l = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(g0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "nowPlayingDuration", tag = 2)
    private final Integer now_playing_duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "nowPlayingElapsed", tag = 3)
    private final Integer now_playing_elapsed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingSourceString", tag = 4)
    private final String now_playing_source_string;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingAlbum", tag = 5)
    private final String now_playing_album;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingStation", tag = 6)
    private final String now_playing_station;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "a2dpSourceName", tag = 7)
    private final String a2dp_source_name;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.TheaterSource#ADAPTER", jsonName = "recentTheaterSource", tag = 8)
    private final s0 recent_theater_source;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "recentTheaterSourceString", tag = 9)
    private final String recent_theater_source_string;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "theaterSourceIsPlaying", tag = 10)
    private final Boolean theater_source_is_playing;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/g0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/g0;", "value", "", "c", "(Lgc0/g0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/g0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/g0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/g0;)Lgc0/g0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<g0> {
        a(com.squareup.wire.b bVar, co0.d<g0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.MediaDetailState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Instant instantDecode = null;
            Integer numDecode = null;
            Integer numDecode2 = null;
            String strDecode = null;
            String strDecode2 = null;
            String strDecode3 = null;
            String strDecode4 = null;
            s0 s0VarDecode = null;
            String strDecode5 = null;
            Boolean boolDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new g0(instantDecode, numDecode, numDecode2, strDecode, strDecode2, strDecode3, strDecode4, s0VarDecode, strDecode5, boolDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        continue;
                    case 2:
                        numDecode = ProtoAdapter.INT32.decode(reader);
                        continue;
                    case 3:
                        numDecode2 = ProtoAdapter.INT32.decode(reader);
                        continue;
                    case 4:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        continue;
                    case 5:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        continue;
                    case 6:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        continue;
                    case 7:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        continue;
                    case 8:
                        try {
                            s0VarDecode = s0.ADAPTER.decode(reader);
                            continue;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            instantDecode = instantDecode;
                            numDecode = numDecode;
                        }
                        break;
                    case 9:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        continue;
                    case 10:
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                        continue;
                    default:
                        reader.m(iG);
                        break;
                }
                instantDecode = instantDecode;
                numDecode = numDecode;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, g0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 1, value.getTimestamp());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(writer, 2, value.getNow_playing_duration());
            protoAdapter.encodeWithTag(writer, 3, value.getNow_playing_elapsed());
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(writer, 4, value.getNow_playing_source_string());
            protoAdapter2.encodeWithTag(writer, 5, value.getNow_playing_album());
            protoAdapter2.encodeWithTag(writer, 6, value.getNow_playing_station());
            protoAdapter2.encodeWithTag(writer, 7, value.getA2dp_source_name());
            s0.ADAPTER.encodeWithTag(writer, 8, value.getRecent_theater_source());
            protoAdapter2.encodeWithTag(writer, 9, value.getRecent_theater_source_string());
            ProtoAdapter.BOOL.encodeWithTag(writer, 10, value.getTheater_source_is_playing());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(g0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getTimestamp());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(2, value.getNow_playing_duration()) + protoAdapter.encodedSizeWithTag(3, value.getNow_playing_elapsed());
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, value.getNow_playing_source_string()) + protoAdapter2.encodedSizeWithTag(5, value.getNow_playing_album()) + protoAdapter2.encodedSizeWithTag(6, value.getNow_playing_station()) + protoAdapter2.encodedSizeWithTag(7, value.getA2dp_source_name()) + s0.ADAPTER.encodedSizeWithTag(8, value.getRecent_theater_source()) + protoAdapter2.encodedSizeWithTag(9, value.getRecent_theater_source_string()) + ProtoAdapter.BOOL.encodedSizeWithTag(10, value.getTheater_source_is_playing());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g0 redact(g0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            return g0.b(value, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, 1022, null);
        }
    }

    public g0() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ g0 b(g0 g0Var, Instant instant, Integer num, Integer num2, String str, String str2, String str3, String str4, s0 s0Var, String str5, Boolean bool, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            instant = g0Var.timestamp;
        }
        if ((i11 & 2) != 0) {
            num = g0Var.now_playing_duration;
        }
        if ((i11 & 4) != 0) {
            num2 = g0Var.now_playing_elapsed;
        }
        if ((i11 & 8) != 0) {
            str = g0Var.now_playing_source_string;
        }
        if ((i11 & 16) != 0) {
            str2 = g0Var.now_playing_album;
        }
        if ((i11 & 32) != 0) {
            str3 = g0Var.now_playing_station;
        }
        if ((i11 & 64) != 0) {
            str4 = g0Var.a2dp_source_name;
        }
        if ((i11 & 128) != 0) {
            s0Var = g0Var.recent_theater_source;
        }
        if ((i11 & 256) != 0) {
            str5 = g0Var.recent_theater_source_string;
        }
        if ((i11 & 512) != 0) {
            bool = g0Var.theater_source_is_playing;
        }
        if ((i11 & 1024) != 0) {
            kVar = g0Var.unknownFields();
        }
        Boolean bool2 = bool;
        okio.k kVar2 = kVar;
        s0 s0Var2 = s0Var;
        String str6 = str5;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        Integer num3 = num2;
        return g0Var.a(instant, num, num3, str, str9, str7, str8, s0Var2, str6, bool2, kVar2);
    }

    public final g0 a(Instant timestamp, Integer now_playing_duration, Integer now_playing_elapsed, String now_playing_source_string, String now_playing_album, String now_playing_station, String a2dp_source_name, s0 recent_theater_source, String recent_theater_source_string, Boolean theater_source_is_playing, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new g0(timestamp, now_playing_duration, now_playing_elapsed, now_playing_source_string, now_playing_album, now_playing_station, a2dp_source_name, recent_theater_source, recent_theater_source_string, theater_source_is_playing, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getA2dp_source_name() {
        return this.a2dp_source_name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNow_playing_album() {
        return this.now_playing_album;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getNow_playing_duration() {
        return this.now_playing_duration;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), g0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, g0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.now_playing_duration, g0Var.now_playing_duration) && p013kotlin.jvm.internal.s.f(this.now_playing_elapsed, g0Var.now_playing_elapsed) && p013kotlin.jvm.internal.s.f(this.now_playing_source_string, g0Var.now_playing_source_string) && p013kotlin.jvm.internal.s.f(this.now_playing_album, g0Var.now_playing_album) && p013kotlin.jvm.internal.s.f(this.now_playing_station, g0Var.now_playing_station) && p013kotlin.jvm.internal.s.f(this.a2dp_source_name, g0Var.a2dp_source_name) && this.recent_theater_source == g0Var.recent_theater_source && p013kotlin.jvm.internal.s.f(this.recent_theater_source_string, g0Var.recent_theater_source_string) && p013kotlin.jvm.internal.s.f(this.theater_source_is_playing, g0Var.theater_source_is_playing);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getNow_playing_elapsed() {
        return this.now_playing_elapsed;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNow_playing_source_string() {
        return this.now_playing_source_string;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getNow_playing_station() {
        return this.now_playing_station;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Integer num = this.now_playing_duration;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.now_playing_elapsed;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str = this.now_playing_source_string;
        int iHashCode5 = (iHashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.now_playing_album;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.now_playing_station;
        int iHashCode7 = (iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.a2dp_source_name;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        s0 s0Var = this.recent_theater_source;
        int iHashCode9 = (iHashCode8 + (s0Var != null ? s0Var.hashCode() : 0)) * 37;
        String str5 = this.recent_theater_source_string;
        int iHashCode10 = (iHashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.theater_source_is_playing;
        int iHashCode11 = iHashCode10 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final s0 getRecent_theater_source() {
        return this.recent_theater_source;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getRecent_theater_source_string() {
        return this.recent_theater_source_string;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getTheater_source_is_playing() {
        return this.theater_source_is_playing;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m401newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Integer num = this.now_playing_duration;
        if (num != null) {
            arrayList.add("now_playing_duration=" + num);
        }
        Integer num2 = this.now_playing_elapsed;
        if (num2 != null) {
            arrayList.add("now_playing_elapsed=" + num2);
        }
        String str = this.now_playing_source_string;
        if (str != null) {
            arrayList.add("now_playing_source_string=" + x20.d.i(str));
        }
        String str2 = this.now_playing_album;
        if (str2 != null) {
            arrayList.add("now_playing_album=" + x20.d.i(str2));
        }
        String str3 = this.now_playing_station;
        if (str3 != null) {
            arrayList.add("now_playing_station=" + x20.d.i(str3));
        }
        String str4 = this.a2dp_source_name;
        if (str4 != null) {
            arrayList.add("a2dp_source_name=" + x20.d.i(str4));
        }
        s0 s0Var = this.recent_theater_source;
        if (s0Var != null) {
            arrayList.add("recent_theater_source=" + s0Var);
        }
        String str5 = this.recent_theater_source_string;
        if (str5 != null) {
            arrayList.add("recent_theater_source_string=" + x20.d.i(str5));
        }
        Boolean bool = this.theater_source_is_playing;
        if (bool != null) {
            arrayList.add("theater_source_is_playing=" + bool);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "MediaDetailState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ g0(Instant instant, Integer num, Integer num2, String str, String str2, String str3, String str4, s0 s0Var, String str5, Boolean bool, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? null : s0Var, (i11 & 256) != 0 ? null : str5, (i11 & 512) != 0 ? null : bool, (i11 & 1024) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m401newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Instant instant, Integer num, Integer num2, String str, String str2, String str3, String str4, s0 s0Var, String str5, Boolean bool, okio.k unknownFields) {
        super(f68052l, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.now_playing_duration = num;
        this.now_playing_elapsed = num2;
        this.now_playing_source_string = str;
        this.now_playing_album = str2;
        this.now_playing_station = str3;
        this.a2dp_source_name = str4;
        this.recent_theater_source = s0Var;
        this.recent_theater_source_string = str5;
        this.theater_source_is_playing = bool;
    }
}
