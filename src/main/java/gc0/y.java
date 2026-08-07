package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u00ad\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J³\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010.\u001a\u0004\b1\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\b9\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00107\u001a\u0004\b<\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b6\u0010,R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00107\u001a\u0004\b-\u0010#¨\u0006="}, d2 = {"Lgc0/y;", "Lcom/squareup/wire/f;", "", "Lec0/o;", "media_playback_status", "", "audio_volume", "", "now_playing_duration", "now_playing_elapsed", "Lgc0/h0;", "now_playing_source", "", "now_playing_source_string", "now_playing_artist", "now_playing_title", "now_playing_album", "now_playing_station", "audio_volume_increment", "audio_volume_max", "a2dp_source_name", "Lokio/k;", "unknownFields", "<init>", "(Lec0/o;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Lgc0/h0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lec0/o;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Lgc0/h0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Lokio/k;)Lgc0/y;", "Lec0/o;", "g", "()Lec0/o;", "b", "Ljava/lang/Float;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Float;", "c", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "k", "e", "Lgc0/h0;", "l", "()Lgc0/h0;", "f", "Ljava/lang/String;", "m", IntegerTokenConverter.CONVERTER_KEY, "h", "o", "n", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y extends com.squareup.wire.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ProtoAdapter<y> f68710o = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(y.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.MediaPlaybackStatus#ADAPTER", jsonName = "mediaPlaybackStatus", tag = 1)
    private final ec0.o media_playback_status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioVolume", tag = 2)
    private final Float audio_volume;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "nowPlayingDuration", tag = 3)
    private final Integer now_playing_duration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "nowPlayingElapsed", tag = 4)
    private final Integer now_playing_elapsed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.MediaSourceType#ADAPTER", jsonName = "nowPlayingSource", tag = 5)
    private final h0 now_playing_source;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingSourceString", tag = 6)
    private final String now_playing_source_string;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingArtist", tag = 7)
    private final String now_playing_artist;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingTitle", tag = 8)
    private final String now_playing_title;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingAlbum", tag = 9)
    private final String now_playing_album;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "nowPlayingStation", tag = 10)
    private final String now_playing_station;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioVolumeIncrement", tag = 11)
    private final Float audio_volume_increment;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "audioVolumeMax", tag = 12)
    private final Float audio_volume_max;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "a2dpSourceName", tag = 15)
    private final String a2dp_source_name;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/y$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/y;", "value", "", "c", "(Lgc0/y;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/y;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/y;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/y;)Lgc0/y;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<y> {
        a(com.squareup.wire.b bVar, co0.d<y> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.LegacyMediaInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y decode(com.squareup.wire.k reader) {
            Float f11;
            Integer num;
            Integer num2;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Float fDecode = null;
            Integer numDecode = null;
            Integer numDecode2 = null;
            h0 h0VarDecode = null;
            String strDecode = null;
            String strDecode2 = null;
            String strDecode3 = null;
            String strDecode4 = null;
            String strDecode5 = null;
            Float fDecode2 = null;
            Float fDecode3 = null;
            String strDecode6 = null;
            ec0.o oVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new y(oVarDecode, fDecode, numDecode, numDecode2, h0VarDecode, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, fDecode2, fDecode3, strDecode6, reader.e(jD));
                }
                if (iG != 15) {
                    switch (iG) {
                        case 1:
                            f11 = fDecode;
                            num = numDecode;
                            num2 = numDecode2;
                            try {
                                oVarDecode = ec0.o.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        case 2:
                            fDecode = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        case 3:
                            numDecode = ProtoAdapter.INT32.decode(reader);
                            continue;
                        case 4:
                            numDecode2 = ProtoAdapter.INT32.decode(reader);
                            continue;
                        case 5:
                            try {
                                h0VarDecode = h0.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                f11 = fDecode;
                                num = numDecode;
                                num2 = numDecode2;
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                                fDecode = f11;
                                numDecode = num;
                                numDecode2 = num2;
                            }
                            break;
                        case 6:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 7:
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 8:
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 9:
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 10:
                            strDecode5 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 11:
                            fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        case 12:
                            fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                            continue;
                        default:
                            reader.m(iG);
                            f11 = fDecode;
                            num = numDecode;
                            num2 = numDecode2;
                            break;
                    }
                    fDecode = f11;
                    numDecode = num;
                    numDecode2 = num2;
                } else {
                    strDecode6 = ProtoAdapter.STRING.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, y value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.o.ADAPTER.encodeWithTag(writer, 1, value.getMedia_playback_status());
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(writer, 2, value.getAudio_volume());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(writer, 3, value.getNow_playing_duration());
            protoAdapter2.encodeWithTag(writer, 4, value.getNow_playing_elapsed());
            h0.ADAPTER.encodeWithTag(writer, 5, value.getNow_playing_source());
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(writer, 6, value.getNow_playing_source_string());
            protoAdapter3.encodeWithTag(writer, 7, value.getNow_playing_artist());
            protoAdapter3.encodeWithTag(writer, 8, value.getNow_playing_title());
            protoAdapter3.encodeWithTag(writer, 9, value.getNow_playing_album());
            protoAdapter3.encodeWithTag(writer, 10, value.getNow_playing_station());
            protoAdapter.encodeWithTag(writer, 11, value.getAudio_volume_increment());
            protoAdapter.encodeWithTag(writer, 12, value.getAudio_volume_max());
            protoAdapter3.encodeWithTag(writer, 15, value.getA2dp_source_name());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(y value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D() + ec0.o.ADAPTER.encodedSizeWithTag(1, value.getMedia_playback_status());
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(2, value.getAudio_volume());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, value.getNow_playing_duration()) + protoAdapter2.encodedSizeWithTag(4, value.getNow_playing_elapsed()) + h0.ADAPTER.encodedSizeWithTag(5, value.getNow_playing_source());
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, value.getNow_playing_source_string()) + protoAdapter3.encodedSizeWithTag(7, value.getNow_playing_artist()) + protoAdapter3.encodedSizeWithTag(8, value.getNow_playing_title()) + protoAdapter3.encodedSizeWithTag(9, value.getNow_playing_album()) + protoAdapter3.encodedSizeWithTag(10, value.getNow_playing_station()) + protoAdapter.encodedSizeWithTag(11, value.getAudio_volume_increment()) + protoAdapter.encodedSizeWithTag(12, value.getAudio_volume_max()) + protoAdapter3.encodedSizeWithTag(15, value.getA2dp_source_name());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public y redact(y value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return y.b(value, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, 8191, null);
        }
    }

    public y() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public static /* synthetic */ y b(y yVar, ec0.o oVar, Float f11, Integer num, Integer num2, h0 h0Var, String str, String str2, String str3, String str4, String str5, Float f12, Float f13, String str6, okio.k kVar, int i11, Object obj) {
        return yVar.a((i11 & 1) != 0 ? yVar.media_playback_status : oVar, (i11 & 2) != 0 ? yVar.audio_volume : f11, (i11 & 4) != 0 ? yVar.now_playing_duration : num, (i11 & 8) != 0 ? yVar.now_playing_elapsed : num2, (i11 & 16) != 0 ? yVar.now_playing_source : h0Var, (i11 & 32) != 0 ? yVar.now_playing_source_string : str, (i11 & 64) != 0 ? yVar.now_playing_artist : str2, (i11 & 128) != 0 ? yVar.now_playing_title : str3, (i11 & 256) != 0 ? yVar.now_playing_album : str4, (i11 & 512) != 0 ? yVar.now_playing_station : str5, (i11 & 1024) != 0 ? yVar.audio_volume_increment : f12, (i11 & 2048) != 0 ? yVar.audio_volume_max : f13, (i11 & 4096) != 0 ? yVar.a2dp_source_name : str6, (i11 & PKIFailureInfo.certRevoked) != 0 ? yVar.unknownFields() : kVar);
    }

    public final y a(ec0.o media_playback_status, Float audio_volume, Integer now_playing_duration, Integer now_playing_elapsed, h0 now_playing_source, String now_playing_source_string, String now_playing_artist, String now_playing_title, String now_playing_album, String now_playing_station, Float audio_volume_increment, Float audio_volume_max, String a2dp_source_name, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new y(media_playback_status, audio_volume, now_playing_duration, now_playing_elapsed, now_playing_source, now_playing_source_string, now_playing_artist, now_playing_title, now_playing_album, now_playing_station, audio_volume_increment, audio_volume_max, a2dp_source_name, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getA2dp_source_name() {
        return this.a2dp_source_name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getAudio_volume() {
        return this.audio_volume;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getAudio_volume_increment() {
        return this.audio_volume_increment;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), yVar.unknownFields()) && this.media_playback_status == yVar.media_playback_status && p013kotlin.jvm.internal.s.e(this.audio_volume, yVar.audio_volume) && p013kotlin.jvm.internal.s.f(this.now_playing_duration, yVar.now_playing_duration) && p013kotlin.jvm.internal.s.f(this.now_playing_elapsed, yVar.now_playing_elapsed) && this.now_playing_source == yVar.now_playing_source && p013kotlin.jvm.internal.s.f(this.now_playing_source_string, yVar.now_playing_source_string) && p013kotlin.jvm.internal.s.f(this.now_playing_artist, yVar.now_playing_artist) && p013kotlin.jvm.internal.s.f(this.now_playing_title, yVar.now_playing_title) && p013kotlin.jvm.internal.s.f(this.now_playing_album, yVar.now_playing_album) && p013kotlin.jvm.internal.s.f(this.now_playing_station, yVar.now_playing_station) && p013kotlin.jvm.internal.s.e(this.audio_volume_increment, yVar.audio_volume_increment) && p013kotlin.jvm.internal.s.e(this.audio_volume_max, yVar.audio_volume_max) && p013kotlin.jvm.internal.s.f(this.a2dp_source_name, yVar.a2dp_source_name);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Float getAudio_volume_max() {
        return this.audio_volume_max;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ec0.o getMedia_playback_status() {
        return this.media_playback_status;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getNow_playing_album() {
        return this.now_playing_album;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ec0.o oVar = this.media_playback_status;
        int iHashCode2 = (iHashCode + (oVar != null ? oVar.hashCode() : 0)) * 37;
        Float f11 = this.audio_volume;
        int iHashCode3 = (iHashCode2 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Integer num = this.now_playing_duration;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.now_playing_elapsed;
        int iHashCode5 = (iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 37;
        h0 h0Var = this.now_playing_source;
        int iHashCode6 = (iHashCode5 + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        String str = this.now_playing_source_string;
        int iHashCode7 = (iHashCode6 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.now_playing_artist;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.now_playing_title;
        int iHashCode9 = (iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.now_playing_album;
        int iHashCode10 = (iHashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.now_playing_station;
        int iHashCode11 = (iHashCode10 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Float f12 = this.audio_volume_increment;
        int iHashCode12 = (iHashCode11 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.audio_volume_max;
        int iHashCode13 = (iHashCode12 + (f13 != null ? f13.hashCode() : 0)) * 37;
        String str6 = this.a2dp_source_name;
        int iHashCode14 = iHashCode13 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getNow_playing_artist() {
        return this.now_playing_artist;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getNow_playing_duration() {
        return this.now_playing_duration;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getNow_playing_elapsed() {
        return this.now_playing_elapsed;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final h0 getNow_playing_source() {
        return this.now_playing_source;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getNow_playing_source_string() {
        return this.now_playing_source_string;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getNow_playing_station() {
        return this.now_playing_station;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m457newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getNow_playing_title() {
        return this.now_playing_title;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ec0.o oVar = this.media_playback_status;
        if (oVar != null) {
            arrayList.add("media_playback_status=" + oVar);
        }
        Float f11 = this.audio_volume;
        if (f11 != null) {
            arrayList.add("audio_volume=" + f11);
        }
        Integer num = this.now_playing_duration;
        if (num != null) {
            arrayList.add("now_playing_duration=" + num);
        }
        Integer num2 = this.now_playing_elapsed;
        if (num2 != null) {
            arrayList.add("now_playing_elapsed=" + num2);
        }
        h0 h0Var = this.now_playing_source;
        if (h0Var != null) {
            arrayList.add("now_playing_source=" + h0Var);
        }
        String str = this.now_playing_source_string;
        if (str != null) {
            arrayList.add("now_playing_source_string=" + x20.d.i(str));
        }
        String str2 = this.now_playing_artist;
        if (str2 != null) {
            arrayList.add("now_playing_artist=" + x20.d.i(str2));
        }
        String str3 = this.now_playing_title;
        if (str3 != null) {
            arrayList.add("now_playing_title=" + x20.d.i(str3));
        }
        String str4 = this.now_playing_album;
        if (str4 != null) {
            arrayList.add("now_playing_album=" + x20.d.i(str4));
        }
        String str5 = this.now_playing_station;
        if (str5 != null) {
            arrayList.add("now_playing_station=" + x20.d.i(str5));
        }
        Float f12 = this.audio_volume_increment;
        if (f12 != null) {
            arrayList.add("audio_volume_increment=" + f12);
        }
        Float f13 = this.audio_volume_max;
        if (f13 != null) {
            arrayList.add("audio_volume_max=" + f13);
        }
        String str6 = this.a2dp_source_name;
        if (str6 != null) {
            arrayList.add("a2dp_source_name=" + x20.d.i(str6));
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "LegacyMediaInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ y(ec0.o oVar, Float f11, Integer num, Integer num2, h0 h0Var, String str, String str2, String str3, String str4, String str5, Float f12, Float f13, String str6, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : oVar, (i11 & 2) != 0 ? null : f11, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : h0Var, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : str4, (i11 & 512) != 0 ? null : str5, (i11 & 1024) != 0 ? null : f12, (i11 & 2048) != 0 ? null : f13, (i11 & 4096) == 0 ? str6 : null, (i11 & PKIFailureInfo.certRevoked) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m457newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ec0.o oVar, Float f11, Integer num, Integer num2, h0 h0Var, String str, String str2, String str3, String str4, String str5, Float f12, Float f13, String str6, okio.k unknownFields) {
        super(f68710o, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.media_playback_status = oVar;
        this.audio_volume = f11;
        this.now_playing_duration = num;
        this.now_playing_elapsed = num2;
        this.now_playing_source = h0Var;
        this.now_playing_source_string = str;
        this.now_playing_artist = str2;
        this.now_playing_title = str3;
        this.now_playing_album = str4;
        this.now_playing_station = str5;
        this.audio_volume_increment = f12;
        this.audio_volume_max = f13;
        this.a2dp_source_name = str6;
    }
}
