package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B\u0083\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u0089\u0001\u0010\"\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#R\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b+\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b.\u00102R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b0\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00107\u001a\u0004\b3\u00108¨\u00069"}, d2 = {"Lgc0/i0;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "remote_control_enabled", "", "now_playing_artist", "now_playing_title", "", "audio_volume", "audio_volume_increment", "audio_volume_max", "Lgc0/h0;", "now_playing_source", "Lec0/o;", "media_playback_status", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lgc0/h0;Lec0/o;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lgc0/h0;Lec0/o;Lokio/k;)Lgc0/i0;", "Lj$/time/Instant;", "k", "()Lj$/time/Instant;", "b", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "c", "Ljava/lang/String;", "g", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "e", "Ljava/lang/Float;", "()Ljava/lang/Float;", "f", "h", "Lgc0/h0;", "()Lgc0/h0;", "Lec0/o;", "()Lec0/o;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ProtoAdapter<i0> f68069k = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(i0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final Instant timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteControlEnabled", tag = 2)
    private final Boolean remote_control_enabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingArtist", tag = 3)
    private final String now_playing_artist;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingTitle", tag = 4)
    private final String now_playing_title;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioVolume", tag = 5)
    private final Float audio_volume;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioVolumeIncrement", tag = 6)
    private final Float audio_volume_increment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioVolumeMax", tag = 7)
    private final Float audio_volume_max;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.MediaSourceType#ADAPTER", jsonName = "nowPlayingSource", tag = 8)
    private final h0 now_playing_source;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.MediaPlaybackStatus#ADAPTER", jsonName = "mediaPlaybackStatus", tag = 9)
    private final ec0.o media_playback_status;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/i0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/i0;", "value", "", "c", "(Lgc0/i0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/i0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/i0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/i0;)Lgc0/i0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<i0> {
        a(com.squareup.wire.b bVar, co0.d<i0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.MediaState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Instant instantDecode = null;
            Boolean boolDecode = null;
            String strDecode = null;
            String strDecode2 = null;
            Float fDecode = null;
            Float fDecode2 = null;
            Float fDecode3 = null;
            h0 h0VarDecode = null;
            ec0.o oVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new i0(instantDecode, boolDecode, strDecode, strDecode2, fDecode, fDecode2, fDecode3, h0VarDecode, oVarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 2:
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 3:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 6:
                        fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 7:
                        fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 8:
                        instantDecode = instantDecode;
                        boolDecode = boolDecode;
                        try {
                            h0VarDecode = h0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            strDecode = strDecode;
                        }
                        instantDecode = instantDecode;
                        boolDecode = boolDecode;
                        break;
                    case 9:
                        try {
                            oVarDecode = ec0.o.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            strDecode = strDecode;
                            instantDecode = instantDecode;
                            boolDecode = boolDecode;
                        }
                        break;
                    default:
                        reader.m(iG);
                        strDecode = strDecode;
                        instantDecode = instantDecode;
                        boolDecode = boolDecode;
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, i0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 1, value.getTimestamp());
            }
            ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.getRemote_control_enabled());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(writer, 3, value.getNow_playing_artist());
            protoAdapter.encodeWithTag(writer, 4, value.getNow_playing_title());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            protoAdapter2.encodeWithTag(writer, 5, value.getAudio_volume());
            protoAdapter2.encodeWithTag(writer, 6, value.getAudio_volume_increment());
            protoAdapter2.encodeWithTag(writer, 7, value.getAudio_volume_max());
            h0.ADAPTER.encodeWithTag(writer, 8, value.getNow_playing_source());
            ec0.o.ADAPTER.encodeWithTag(writer, 9, value.getMedia_playback_status());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(i0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getTimestamp());
            }
            int iEncodedSizeWithTag = iD + ProtoAdapter.BOOL.encodedSizeWithTag(2, value.getRemote_control_enabled());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getNow_playing_artist()) + protoAdapter.encodedSizeWithTag(4, value.getNow_playing_title());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, value.getAudio_volume()) + protoAdapter2.encodedSizeWithTag(6, value.getAudio_volume_increment()) + protoAdapter2.encodedSizeWithTag(7, value.getAudio_volume_max()) + h0.ADAPTER.encodedSizeWithTag(8, value.getNow_playing_source()) + ec0.o.ADAPTER.encodedSizeWithTag(9, value.getMedia_playback_status());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i0 redact(i0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            return i0.b(value, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, null, null, null, okio.k.f97943e, 510, null);
        }
    }

    public i0() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ i0 b(i0 i0Var, Instant instant, Boolean bool, String str, String str2, Float f11, Float f12, Float f13, h0 h0Var, ec0.o oVar, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            instant = i0Var.timestamp;
        }
        if ((i11 & 2) != 0) {
            bool = i0Var.remote_control_enabled;
        }
        if ((i11 & 4) != 0) {
            str = i0Var.now_playing_artist;
        }
        if ((i11 & 8) != 0) {
            str2 = i0Var.now_playing_title;
        }
        if ((i11 & 16) != 0) {
            f11 = i0Var.audio_volume;
        }
        if ((i11 & 32) != 0) {
            f12 = i0Var.audio_volume_increment;
        }
        if ((i11 & 64) != 0) {
            f13 = i0Var.audio_volume_max;
        }
        if ((i11 & 128) != 0) {
            h0Var = i0Var.now_playing_source;
        }
        if ((i11 & 256) != 0) {
            oVar = i0Var.media_playback_status;
        }
        if ((i11 & 512) != 0) {
            kVar = i0Var.unknownFields();
        }
        ec0.o oVar2 = oVar;
        okio.k kVar2 = kVar;
        Float f14 = f13;
        h0 h0Var2 = h0Var;
        Float f15 = f11;
        Float f16 = f12;
        return i0Var.a(instant, bool, str, str2, f15, f16, f14, h0Var2, oVar2, kVar2);
    }

    public final i0 a(Instant timestamp, Boolean remote_control_enabled, String now_playing_artist, String now_playing_title, Float audio_volume, Float audio_volume_increment, Float audio_volume_max, h0 now_playing_source, ec0.o media_playback_status, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new i0(timestamp, remote_control_enabled, now_playing_artist, now_playing_title, audio_volume, audio_volume_increment, audio_volume_max, now_playing_source, media_playback_status, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getAudio_volume() {
        return this.audio_volume;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getAudio_volume_increment() {
        return this.audio_volume_increment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getAudio_volume_max() {
        return this.audio_volume_max;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), i0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, i0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.remote_control_enabled, i0Var.remote_control_enabled) && p013kotlin.jvm.internal.s.f(this.now_playing_artist, i0Var.now_playing_artist) && p013kotlin.jvm.internal.s.f(this.now_playing_title, i0Var.now_playing_title) && p013kotlin.jvm.internal.s.e(this.audio_volume, i0Var.audio_volume) && p013kotlin.jvm.internal.s.e(this.audio_volume_increment, i0Var.audio_volume_increment) && p013kotlin.jvm.internal.s.e(this.audio_volume_max, i0Var.audio_volume_max) && this.now_playing_source == i0Var.now_playing_source && this.media_playback_status == i0Var.media_playback_status;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ec0.o getMedia_playback_status() {
        return this.media_playback_status;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNow_playing_artist() {
        return this.now_playing_artist;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h0 getNow_playing_source() {
        return this.now_playing_source;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Boolean bool = this.remote_control_enabled;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.now_playing_artist;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.now_playing_title;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Float f11 = this.audio_volume;
        int iHashCode6 = (iHashCode5 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.audio_volume_increment;
        int iHashCode7 = (iHashCode6 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.audio_volume_max;
        int iHashCode8 = (iHashCode7 + (f13 != null ? f13.hashCode() : 0)) * 37;
        h0 h0Var = this.now_playing_source;
        int iHashCode9 = (iHashCode8 + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        ec0.o oVar = this.media_playback_status;
        int iHashCode10 = iHashCode9 + (oVar != null ? oVar.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getNow_playing_title() {
        return this.now_playing_title;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getRemote_control_enabled() {
        return this.remote_control_enabled;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m404newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Boolean bool = this.remote_control_enabled;
        if (bool != null) {
            arrayList.add("remote_control_enabled=" + bool);
        }
        String str = this.now_playing_artist;
        if (str != null) {
            arrayList.add("now_playing_artist=" + x20.d.i(str));
        }
        String str2 = this.now_playing_title;
        if (str2 != null) {
            arrayList.add("now_playing_title=" + x20.d.i(str2));
        }
        Float f11 = this.audio_volume;
        if (f11 != null) {
            arrayList.add("audio_volume=" + f11);
        }
        Float f12 = this.audio_volume_increment;
        if (f12 != null) {
            arrayList.add("audio_volume_increment=" + f12);
        }
        Float f13 = this.audio_volume_max;
        if (f13 != null) {
            arrayList.add("audio_volume_max=" + f13);
        }
        h0 h0Var = this.now_playing_source;
        if (h0Var != null) {
            arrayList.add("now_playing_source=" + h0Var);
        }
        ec0.o oVar = this.media_playback_status;
        if (oVar != null) {
            arrayList.add("media_playback_status=" + oVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "MediaState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ i0(Instant instant, Boolean bool, String str, String str2, Float f11, Float f12, Float f13, h0 h0Var, ec0.o oVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : instant, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : f11, (i11 & 32) != 0 ? null : f12, (i11 & 64) != 0 ? null : f13, (i11 & 128) != 0 ? null : h0Var, (i11 & 256) != 0 ? null : oVar, (i11 & 512) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m404newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Instant instant, Boolean bool, String str, String str2, Float f11, Float f12, Float f13, h0 h0Var, ec0.o oVar, okio.k unknownFields) {
        super(f68069k, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.remote_control_enabled = bool;
        this.now_playing_artist = str;
        this.now_playing_title = str2;
        this.audio_volume = f11;
        this.audio_volume_increment = f12;
        this.audio_volume_max = f13;
        this.now_playing_source = h0Var;
        this.media_playback_status = oVar;
    }
}
