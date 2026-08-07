package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import j$.time.Instant;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\bA\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002BDB§\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0002H\u0017¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000105H\u0096\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020 H\u0016¢\u0006\u0004\b;\u0010<J\u00ad\u0003\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010*2\b\b\u0002\u00100\u001a\u00020/¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010:R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010?\u001a\u0004\bP\u0010AR\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010AR\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010?\u001a\u0004\bG\u0010AR\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010?\u001a\u0004\bO\u0010AR\u001a\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010L\u001a\u0004\bV\u0010NR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bE\u0010YR\"\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010_\u001a\u0004\bc\u0010aR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bh\u0010jR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010k\u001a\u0004\bl\u0010mR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010_\u001a\u0004\bn\u0010aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010_\u001a\u0004\b?\u0010aR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010_\u001a\u0004\bD\u0010aR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010_\u001a\u0004\bK\u0010aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010k\u001a\u0004\bo\u0010mR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010p\u001a\u0004\bq\u0010<R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010_\u001a\u0004\bZ\u0010aR\u001c\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010_\u001a\u0004\bb\u0010aR\u001c\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010_\u001a\u0004\bW\u0010aR\u001c\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010_\u001a\u0004\bU\u0010aR\u001c\u0010&\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010_\u001a\u0004\bT\u0010aR\u001c\u0010'\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010k\u001a\u0004\bQ\u0010mR\u001c\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010_\u001a\u0004\bS\u0010aR\u001c\u0010)\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010e\u001a\u0004\bH\u0010gR\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010s\u001a\u0004\br\u0010tR\u001c\u0010,\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010s\u001a\u0004\bu\u0010tR\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010s\u001a\u0004\b^\u0010tR\u001c\u0010.\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010s\u001a\u0004\bd\u0010t¨\u0006v"}, d2 = {"Lgc0/e0;", "Lcom/squareup/wire/f;", "", "", "latitude_OBSOLETE", "longitude_OBSOLETE", "", "heading_OBSOLETE", "", "gps_as_of_OBSOLETE", "", "native_location_supported_OBSOLETE", "native_latitude_OBSOLETE", "native_longitude_OBSOLETE", "corrected_latitude_OBSOLETE", "corrected_longitude_OBSOLETE", "homelink_nearby_OBSOLETE", "Lgc0/e0$c;", "native_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "heading", "gps_as_of", "native_location_supported", "native_latitude", "native_longitude", "corrected_latitude", "corrected_longitude", "homelink_nearby", "", "location_name", "geo_latitude", "geo_longitude", "geo_heading", "geo_elevation", "geo_accuracy", "estimated_gps_valid", "estimated_to_raw_distance", "supercharger_trt_id", "", "native_latitude_d", "native_longitude_d", "geo_latitude_d", "geo_longitude_d", "Lokio/k;", "unknownFields", "<init>", "(FFIJZFFFFZLgc0/e0$c;Lj$/time/Instant;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(FFIJZFFFFZLgc0/e0$c;Lj$/time/Instant;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lokio/k;)Lgc0/e0;", Gender.FEMALE, "w", "()F", "b", "z", "c", "I", "s", DateTokenConverter.CONVERTER_KEY, "J", "q", "()J", "e", "Z", "E", "()Z", "f", "B", "g", "G", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "u", "k", "Lgc0/e0$c;", "()Lgc0/e0$c;", "l", "Lj$/time/Instant;", "K", "()Lj$/time/Instant;", "m", "Ljava/lang/Float;", "v", "()Ljava/lang/Float;", "n", "y", "o", "Ljava/lang/Integer;", "r", "()Ljava/lang/Integer;", "p", "Ljava/lang/Long;", "()Ljava/lang/Long;", "Ljava/lang/Boolean;", "D", "()Ljava/lang/Boolean;", "A", "t", "Ljava/lang/String;", "x", "C", "Ljava/lang/Double;", "()Ljava/lang/Double;", "H", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 extends com.squareup.wire.f {
    public static final ProtoAdapter<e0> K = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoElevation", tag = 117)
    private final Float geo_elevation;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoAccuracy", tag = 118)
    private final Float geo_accuracy;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "estimatedGpsValid", tag = 119)
    private final Boolean estimated_gps_valid;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "estimatedToRawDistance", tag = 120)
    private final Float estimated_to_raw_distance;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "superchargerTrtId", tag = 121)
    private final Integer supercharger_trt_id;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "nativeLatitudeD", tag = 122)
    private final Double native_latitude_d;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "nativeLongitudeD", tag = 123)
    private final Double native_longitude_d;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "geoLatitudeD", tag = 124)
    private final Double geo_latitude_d;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "geoLongitudeD", tag = 125)
    private final Double geo_longitude_d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "latitudeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final float latitude_OBSOLETE;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "longitudeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final float longitude_OBSOLETE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "headingOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int heading_OBSOLETE;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "gpsAsOfOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final long gps_as_of_OBSOLETE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "nativeLocationSupportedOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final boolean native_location_supported_OBSOLETE;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLatitudeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final float native_latitude_OBSOLETE;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLongitudeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final float native_longitude_OBSOLETE;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLatitudeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final float corrected_latitude_OBSOLETE;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLongitudeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final float corrected_longitude_OBSOLETE;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "homelinkNearbyOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final boolean homelink_nearby_OBSOLETE;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LocationState$GPSCoordinateType#ADAPTER", jsonName = "nativeType", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final c native_type;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final Instant timestamp;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 101)
    private final Float latitude;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 102)
    private final Float longitude;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 103)
    private final Integer heading;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "gpsAsOf", tag = 104)
    private final Long gps_as_of;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "nativeLocationSupported", tag = 105)
    private final Boolean native_location_supported;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLatitude", tag = 106)
    private final Float native_latitude;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLongitude", tag = 107)
    private final Float native_longitude;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLatitude", tag = 109)
    private final Float corrected_latitude;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLongitude", tag = 110)
    private final Float corrected_longitude;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "homelinkNearby", tag = 112)
    private final Boolean homelink_nearby;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "locationName", tag = 113)
    private final String location_name;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoLatitude", tag = 114)
    private final Float geo_latitude;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoLongitude", tag = 115)
    private final Float geo_longitude;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoHeading", tag = 116)
    private final Float geo_heading;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/e0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/e0;", "value", "", "c", "(Lgc0/e0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/e0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/e0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/e0;)Lgc0/e0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e0> {
        a(com.squareup.wire.b bVar, co0.d<e0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.LocationState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            c cVarDecode = null;
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            float fFloatValue3 = 0.0f;
            float fFloatValue4 = 0.0f;
            float fFloatValue5 = 0.0f;
            float fFloatValue6 = 0.0f;
            int iIntValue = 0;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            long jLongValue = 0;
            Float fDecode = null;
            Float fDecode2 = null;
            Integer numDecode = null;
            Long lDecode = null;
            Boolean boolDecode = null;
            Float fDecode3 = null;
            Float fDecode4 = null;
            Float fDecode5 = null;
            Float fDecode6 = null;
            Boolean boolDecode2 = null;
            String strDecode = null;
            Float fDecode7 = null;
            Float fDecode8 = null;
            Float fDecode9 = null;
            Float fDecode10 = null;
            Float fDecode11 = null;
            Boolean boolDecode3 = null;
            Float fDecode12 = null;
            Integer numDecode2 = null;
            Double dDecode = null;
            Double dDecode2 = null;
            Double dDecode3 = null;
            Double dDecode4 = null;
            Instant instantDecode = null;
            while (true) {
                int iG = reader.g();
                Float f11 = fDecode;
                if (iG == -1) {
                    return new e0(fFloatValue, fFloatValue2, iIntValue, jLongValue, zBooleanValue, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, zBooleanValue2, cVarDecode, instantDecode, f11, fDecode2, numDecode, lDecode, boolDecode, fDecode3, fDecode4, fDecode5, fDecode6, boolDecode2, strDecode, fDecode7, fDecode8, fDecode9, fDecode10, fDecode11, boolDecode3, fDecode12, numDecode2, dDecode, dDecode2, dDecode3, dDecode4, reader.e(jD));
                }
                if (iG == 109) {
                    fDecode5 = ProtoAdapter.FLOAT.decode(reader);
                } else if (iG != 110) {
                    switch (iG) {
                        case 1:
                            fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 2:
                            fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 3:
                            iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                            break;
                        case 4:
                            jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                            break;
                        case 5:
                            zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        case 6:
                            fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 7:
                            fFloatValue4 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 8:
                            cVarDecode = c.f68038d.decode(reader);
                            break;
                        case 9:
                            fFloatValue5 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 10:
                            fFloatValue6 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            break;
                        case 11:
                            instantDecode = ProtoAdapter.INSTANT.decode(reader);
                            break;
                        case 12:
                            zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            break;
                        default:
                            switch (iG) {
                                case 101:
                                    fDecode = ProtoAdapter.FLOAT.decode(reader);
                                    continue;
                                case 102:
                                    fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 103:
                                    numDecode = ProtoAdapter.UINT32.decode(reader);
                                    break;
                                case 104:
                                    lDecode = ProtoAdapter.UINT64.decode(reader);
                                    break;
                                case 105:
                                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                                    break;
                                case 106:
                                    fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                case 107:
                                    fDecode4 = ProtoAdapter.FLOAT.decode(reader);
                                    break;
                                default:
                                    switch (iG) {
                                        case 112:
                                            boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                            break;
                                        case 113:
                                            strDecode = ProtoAdapter.STRING.decode(reader);
                                            break;
                                        case 114:
                                            fDecode7 = ProtoAdapter.FLOAT.decode(reader);
                                            break;
                                        case 115:
                                            fDecode8 = ProtoAdapter.FLOAT.decode(reader);
                                            break;
                                        case 116:
                                            fDecode9 = ProtoAdapter.FLOAT.decode(reader);
                                            break;
                                        case 117:
                                            fDecode10 = ProtoAdapter.FLOAT.decode(reader);
                                            break;
                                        case 118:
                                            fDecode11 = ProtoAdapter.FLOAT.decode(reader);
                                            break;
                                        case 119:
                                            boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                                            break;
                                        case 120:
                                            fDecode12 = ProtoAdapter.FLOAT.decode(reader);
                                            break;
                                        case 121:
                                            numDecode2 = ProtoAdapter.INT32.decode(reader);
                                            break;
                                        case 122:
                                            dDecode = ProtoAdapter.DOUBLE.decode(reader);
                                            break;
                                        case 123:
                                            dDecode2 = ProtoAdapter.DOUBLE.decode(reader);
                                            break;
                                        case 124:
                                            dDecode3 = ProtoAdapter.DOUBLE.decode(reader);
                                            break;
                                        case 125:
                                            dDecode4 = ProtoAdapter.DOUBLE.decode(reader);
                                            break;
                                        default:
                                            reader.m(iG);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    fDecode6 = ProtoAdapter.FLOAT.decode(reader);
                }
                fDecode = f11;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, e0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getLatitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.getLatitude_OBSOLETE()));
            }
            if (value.getLongitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, Float.valueOf(value.getLongitude_OBSOLETE()));
            }
            if (value.getHeading_OBSOLETE() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getHeading_OBSOLETE()));
            }
            if (value.getGps_as_of_OBSOLETE() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 4, Long.valueOf(value.getGps_as_of_OBSOLETE()));
            }
            if (value.getNative_location_supported_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getNative_location_supported_OBSOLETE()));
            }
            if (value.getNative_latitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 6, Float.valueOf(value.getNative_latitude_OBSOLETE()));
            }
            if (value.getNative_longitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 7, Float.valueOf(value.getNative_longitude_OBSOLETE()));
            }
            if (value.getCorrected_latitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 9, Float.valueOf(value.getCorrected_latitude_OBSOLETE()));
            }
            if (value.getCorrected_longitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 10, Float.valueOf(value.getCorrected_longitude_OBSOLETE()));
            }
            if (value.getHomelink_nearby_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 12, Boolean.valueOf(value.getHomelink_nearby_OBSOLETE()));
            }
            if (value.getNative_type() != null) {
                c.f68038d.encodeWithTag(writer, 8, value.getNative_type());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 11, value.getTimestamp());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(writer, 101, value.getLatitude());
            protoAdapter.encodeWithTag(writer, 102, value.getLongitude());
            ProtoAdapter.UINT32.encodeWithTag(writer, 103, value.getHeading());
            ProtoAdapter.UINT64.encodeWithTag(writer, 104, value.getGps_as_of());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(writer, 105, value.getNative_location_supported());
            protoAdapter.encodeWithTag(writer, 106, value.getNative_latitude());
            protoAdapter.encodeWithTag(writer, 107, value.getNative_longitude());
            protoAdapter.encodeWithTag(writer, 109, value.getCorrected_latitude());
            protoAdapter.encodeWithTag(writer, 110, value.getCorrected_longitude());
            protoAdapter2.encodeWithTag(writer, 112, value.getHomelink_nearby());
            ProtoAdapter.STRING.encodeWithTag(writer, 113, value.getLocation_name());
            protoAdapter.encodeWithTag(writer, 114, value.getGeo_latitude());
            protoAdapter.encodeWithTag(writer, 115, value.getGeo_longitude());
            protoAdapter.encodeWithTag(writer, 116, value.getGeo_heading());
            protoAdapter.encodeWithTag(writer, 117, value.getGeo_elevation());
            protoAdapter.encodeWithTag(writer, 118, value.getGeo_accuracy());
            protoAdapter2.encodeWithTag(writer, 119, value.getEstimated_gps_valid());
            protoAdapter.encodeWithTag(writer, 120, value.getEstimated_to_raw_distance());
            ProtoAdapter.INT32.encodeWithTag(writer, 121, value.getSupercharger_trt_id());
            ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
            protoAdapter3.encodeWithTag(writer, 122, value.getNative_latitude_d());
            protoAdapter3.encodeWithTag(writer, 123, value.getNative_longitude_d());
            protoAdapter3.encodeWithTag(writer, 124, value.getGeo_latitude_d());
            protoAdapter3.encodeWithTag(writer, 125, value.getGeo_longitude_d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getLatitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getLatitude_OBSOLETE()));
            }
            if (value.getLongitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getLongitude_OBSOLETE()));
            }
            if (value.getHeading_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getHeading_OBSOLETE()));
            }
            if (value.getGps_as_of_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT64.encodedSizeWithTag(4, Long.valueOf(value.getGps_as_of_OBSOLETE()));
            }
            if (value.getNative_location_supported_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getNative_location_supported_OBSOLETE()));
            }
            if (value.getNative_latitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getNative_latitude_OBSOLETE()));
            }
            if (value.getNative_longitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(7, Float.valueOf(value.getNative_longitude_OBSOLETE()));
            }
            if (value.getCorrected_latitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(9, Float.valueOf(value.getCorrected_latitude_OBSOLETE()));
            }
            if (value.getCorrected_longitude_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(10, Float.valueOf(value.getCorrected_longitude_OBSOLETE()));
            }
            if (value.getHomelink_nearby_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.getHomelink_nearby_OBSOLETE()));
            }
            if (value.getNative_type() != null) {
                iD += c.f68038d.encodedSizeWithTag(8, value.getNative_type());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getTimestamp());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(101, value.getLatitude()) + protoAdapter.encodedSizeWithTag(102, value.getLongitude()) + ProtoAdapter.UINT32.encodedSizeWithTag(103, value.getHeading()) + ProtoAdapter.UINT64.encodedSizeWithTag(104, value.getGps_as_of());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(105, value.getNative_location_supported()) + protoAdapter.encodedSizeWithTag(106, value.getNative_latitude()) + protoAdapter.encodedSizeWithTag(107, value.getNative_longitude()) + protoAdapter.encodedSizeWithTag(109, value.getCorrected_latitude()) + protoAdapter.encodedSizeWithTag(110, value.getCorrected_longitude()) + protoAdapter2.encodedSizeWithTag(112, value.getHomelink_nearby()) + ProtoAdapter.STRING.encodedSizeWithTag(113, value.getLocation_name()) + protoAdapter.encodedSizeWithTag(114, value.getGeo_latitude()) + protoAdapter.encodedSizeWithTag(115, value.getGeo_longitude()) + protoAdapter.encodedSizeWithTag(116, value.getGeo_heading()) + protoAdapter.encodedSizeWithTag(117, value.getGeo_elevation()) + protoAdapter.encodedSizeWithTag(118, value.getGeo_accuracy()) + protoAdapter2.encodedSizeWithTag(119, value.getEstimated_gps_valid()) + protoAdapter.encodedSizeWithTag(120, value.getEstimated_to_raw_distance()) + ProtoAdapter.INT32.encodedSizeWithTag(121, value.getSupercharger_trt_id());
            ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(122, value.getNative_latitude_d()) + protoAdapter3.encodedSizeWithTag(123, value.getNative_longitude_d()) + protoAdapter3.encodedSizeWithTag(124, value.getGeo_latitude_d()) + protoAdapter3.encodedSizeWithTag(125, value.getGeo_longitude_d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e0 redact(e0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            c native_type = value.getNative_type();
            c cVarRedact = native_type != null ? c.f68038d.redact(native_type) : null;
            Instant timestamp = value.getTimestamp();
            return e0.b(value, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, cVarRedact, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, -3073, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lgc0/e0$c;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "GCJ", "WGS", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/e0$c;", "Lec0/h0;", "b", "()Lec0/h0;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final ProtoAdapter<c> f68038d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 GCJ;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 WGS;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/e0$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/e0$c;", "value", "", "c", "(Lgc0/e0$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/e0$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/e0$c;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/e0$c;)Lgc0/e0$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.LocationState.GPSCoordinateType", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new c(h0VarDecode, h0VarDecode2, reader.e(jD));
                    }
                    if (iG == 1) {
                        h0VarDecode = ec0.h0.f62622b.decode(reader);
                    } else if (iG != 2) {
                        reader.m(iG);
                    } else {
                        h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getGCJ());
                protoAdapter.encodeWithTag(writer, 2, value.getWGS());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getGCJ()) + protoAdapter.encodedSizeWithTag(2, value.getWGS());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 gcj = value.getGCJ();
                ec0.h0 h0VarRedact = gcj != null ? ec0.h0.f62622b.redact(gcj) : null;
                ec0.h0 wgs = value.getWGS();
                return value.a(h0VarRedact, wgs != null ? ec0.h0.f62622b.redact(wgs) : null, okio.k.f97943e);
            }
        }

        public c() {
            this(null, null, null, 7, null);
        }

        public final c a(ec0.h0 GCJ, ec0.h0 WGS, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(GCJ, WGS, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getGCJ() {
            return this.GCJ;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getWGS() {
            return this.WGS;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.GCJ, cVar.GCJ) && p013kotlin.jvm.internal.s.f(this.WGS, cVar.WGS);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.GCJ;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.WGS;
            int iHashCode3 = iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m397newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.GCJ;
            if (h0Var != null) {
                arrayList.add("GCJ=" + h0Var);
            }
            ec0.h0 h0Var2 = this.WGS;
            if (h0Var2 != null) {
                arrayList.add("WGS=" + h0Var2);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "GPSCoordinateType{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m397newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k unknownFields) {
            super(f68038d, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.GCJ = h0Var;
            this.WGS = h0Var2;
            if (x20.d.c(h0Var, h0Var2) > 1) {
                throw new IllegalArgumentException("At most one of GCJ, WGS may be non-null");
            }
        }
    }

    public e0() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0L, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 15, null);
    }

    public static /* synthetic */ e0 b(e0 e0Var, float f11, float f12, int i11, long j11, boolean z11, float f13, float f14, float f15, float f16, boolean z12, c cVar, Instant instant, Float f17, Float f18, Integer num, Long l11, Boolean bool, Float f19, Float f21, Float f22, Float f23, Boolean bool2, String str, Float f24, Float f25, Float f26, Float f27, Float f28, Boolean bool3, Float f29, Integer num2, Double d11, Double d12, Double d13, Double d14, okio.k kVar, int i12, int i13, Object obj) {
        return e0Var.a((i12 & 1) != 0 ? e0Var.latitude_OBSOLETE : f11, (i12 & 2) != 0 ? e0Var.longitude_OBSOLETE : f12, (i12 & 4) != 0 ? e0Var.heading_OBSOLETE : i11, (i12 & 8) != 0 ? e0Var.gps_as_of_OBSOLETE : j11, (i12 & 16) != 0 ? e0Var.native_location_supported_OBSOLETE : z11, (i12 & 32) != 0 ? e0Var.native_latitude_OBSOLETE : f13, (i12 & 64) != 0 ? e0Var.native_longitude_OBSOLETE : f14, (i12 & 128) != 0 ? e0Var.corrected_latitude_OBSOLETE : f15, (i12 & 256) != 0 ? e0Var.corrected_longitude_OBSOLETE : f16, (i12 & 512) != 0 ? e0Var.homelink_nearby_OBSOLETE : z12, (i12 & 1024) != 0 ? e0Var.native_type : cVar, (i12 & 2048) != 0 ? e0Var.timestamp : instant, (i12 & 4096) != 0 ? e0Var.latitude : f17, (i12 & PKIFailureInfo.certRevoked) != 0 ? e0Var.longitude : f18, (i12 & 16384) != 0 ? e0Var.heading : num, (i12 & 32768) != 0 ? e0Var.gps_as_of : l11, (i12 & 65536) != 0 ? e0Var.native_location_supported : bool, (i12 & 131072) != 0 ? e0Var.native_latitude : f19, (i12 & 262144) != 0 ? e0Var.native_longitude : f21, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? e0Var.corrected_latitude : f22, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? e0Var.corrected_longitude : f23, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? e0Var.homelink_nearby : bool2, (i12 & 4194304) != 0 ? e0Var.location_name : str, (i12 & 8388608) != 0 ? e0Var.geo_latitude : f24, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? e0Var.geo_longitude : f25, (i12 & 33554432) != 0 ? e0Var.geo_heading : f26, (i12 & 67108864) != 0 ? e0Var.geo_elevation : f27, (i12 & 134217728) != 0 ? e0Var.geo_accuracy : f28, (i12 & 268435456) != 0 ? e0Var.estimated_gps_valid : bool3, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? e0Var.estimated_to_raw_distance : f29, (i12 & 1073741824) != 0 ? e0Var.supercharger_trt_id : num2, (i12 & Integer.MIN_VALUE) != 0 ? e0Var.native_latitude_d : d11, (i13 & 1) != 0 ? e0Var.native_longitude_d : d12, (i13 & 2) != 0 ? e0Var.geo_latitude_d : d13, (i13 & 4) != 0 ? e0Var.geo_longitude_d : d14, (i13 & 8) != 0 ? e0Var.unknownFields() : kVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Float getNative_latitude() {
        return this.native_latitude;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final float getNative_latitude_OBSOLETE() {
        return this.native_latitude_OBSOLETE;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Double getNative_latitude_d() {
        return this.native_latitude_d;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Boolean getNative_location_supported() {
        return this.native_location_supported;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getNative_location_supported_OBSOLETE() {
        return this.native_location_supported_OBSOLETE;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Float getNative_longitude() {
        return this.native_longitude;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final float getNative_longitude_OBSOLETE() {
        return this.native_longitude_OBSOLETE;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Double getNative_longitude_d() {
        return this.native_longitude_d;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final c getNative_type() {
        return this.native_type;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final Integer getSupercharger_trt_id() {
        return this.supercharger_trt_id;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public final e0 a(float latitude_OBSOLETE, float longitude_OBSOLETE, int heading_OBSOLETE, long gps_as_of_OBSOLETE, boolean native_location_supported_OBSOLETE, float native_latitude_OBSOLETE, float native_longitude_OBSOLETE, float corrected_latitude_OBSOLETE, float corrected_longitude_OBSOLETE, boolean homelink_nearby_OBSOLETE, c native_type, Instant timestamp, Float latitude, Float longitude, Integer heading, Long gps_as_of, Boolean native_location_supported, Float native_latitude, Float native_longitude, Float corrected_latitude, Float corrected_longitude, Boolean homelink_nearby, String location_name, Float geo_latitude, Float geo_longitude, Float geo_heading, Float geo_elevation, Float geo_accuracy, Boolean estimated_gps_valid, Float estimated_to_raw_distance, Integer supercharger_trt_id, Double native_latitude_d, Double native_longitude_d, Double geo_latitude_d, Double geo_longitude_d, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new e0(latitude_OBSOLETE, longitude_OBSOLETE, heading_OBSOLETE, gps_as_of_OBSOLETE, native_location_supported_OBSOLETE, native_latitude_OBSOLETE, native_longitude_OBSOLETE, corrected_latitude_OBSOLETE, corrected_longitude_OBSOLETE, homelink_nearby_OBSOLETE, native_type, timestamp, latitude, longitude, heading, gps_as_of, native_location_supported, native_latitude, native_longitude, corrected_latitude, corrected_longitude, homelink_nearby, location_name, geo_latitude, geo_longitude, geo_heading, geo_elevation, geo_accuracy, estimated_gps_valid, estimated_to_raw_distance, supercharger_trt_id, native_latitude_d, native_longitude_d, geo_latitude_d, geo_longitude_d, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getCorrected_latitude() {
        return this.corrected_latitude;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getCorrected_latitude_OBSOLETE() {
        return this.corrected_latitude_OBSOLETE;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getCorrected_longitude() {
        return this.corrected_longitude;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), e0Var.unknownFields()) && this.latitude_OBSOLETE == e0Var.latitude_OBSOLETE && this.longitude_OBSOLETE == e0Var.longitude_OBSOLETE && this.heading_OBSOLETE == e0Var.heading_OBSOLETE && this.gps_as_of_OBSOLETE == e0Var.gps_as_of_OBSOLETE && this.native_location_supported_OBSOLETE == e0Var.native_location_supported_OBSOLETE && this.native_latitude_OBSOLETE == e0Var.native_latitude_OBSOLETE && this.native_longitude_OBSOLETE == e0Var.native_longitude_OBSOLETE && this.corrected_latitude_OBSOLETE == e0Var.corrected_latitude_OBSOLETE && this.corrected_longitude_OBSOLETE == e0Var.corrected_longitude_OBSOLETE && this.homelink_nearby_OBSOLETE == e0Var.homelink_nearby_OBSOLETE && p013kotlin.jvm.internal.s.f(this.native_type, e0Var.native_type) && p013kotlin.jvm.internal.s.f(this.timestamp, e0Var.timestamp) && p013kotlin.jvm.internal.s.e(this.latitude, e0Var.latitude) && p013kotlin.jvm.internal.s.e(this.longitude, e0Var.longitude) && p013kotlin.jvm.internal.s.f(this.heading, e0Var.heading) && p013kotlin.jvm.internal.s.f(this.gps_as_of, e0Var.gps_as_of) && p013kotlin.jvm.internal.s.f(this.native_location_supported, e0Var.native_location_supported) && p013kotlin.jvm.internal.s.e(this.native_latitude, e0Var.native_latitude) && p013kotlin.jvm.internal.s.e(this.native_longitude, e0Var.native_longitude) && p013kotlin.jvm.internal.s.e(this.corrected_latitude, e0Var.corrected_latitude) && p013kotlin.jvm.internal.s.e(this.corrected_longitude, e0Var.corrected_longitude) && p013kotlin.jvm.internal.s.f(this.homelink_nearby, e0Var.homelink_nearby) && p013kotlin.jvm.internal.s.f(this.location_name, e0Var.location_name) && p013kotlin.jvm.internal.s.e(this.geo_latitude, e0Var.geo_latitude) && p013kotlin.jvm.internal.s.e(this.geo_longitude, e0Var.geo_longitude) && p013kotlin.jvm.internal.s.e(this.geo_heading, e0Var.geo_heading) && p013kotlin.jvm.internal.s.e(this.geo_elevation, e0Var.geo_elevation) && p013kotlin.jvm.internal.s.e(this.geo_accuracy, e0Var.geo_accuracy) && p013kotlin.jvm.internal.s.f(this.estimated_gps_valid, e0Var.estimated_gps_valid) && p013kotlin.jvm.internal.s.e(this.estimated_to_raw_distance, e0Var.estimated_to_raw_distance) && p013kotlin.jvm.internal.s.f(this.supercharger_trt_id, e0Var.supercharger_trt_id) && p013kotlin.jvm.internal.s.c(this.native_latitude_d, e0Var.native_latitude_d) && p013kotlin.jvm.internal.s.c(this.native_longitude_d, e0Var.native_longitude_d) && p013kotlin.jvm.internal.s.c(this.geo_latitude_d, e0Var.geo_latitude_d) && p013kotlin.jvm.internal.s.c(this.geo_longitude_d, e0Var.geo_longitude_d);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getCorrected_longitude_OBSOLETE() {
        return this.corrected_longitude_OBSOLETE;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getEstimated_gps_valid() {
        return this.estimated_gps_valid;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Float getEstimated_to_raw_distance() {
        return this.estimated_to_raw_distance;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((((((((unknownFields().hashCode() * 37) + Float.hashCode(this.latitude_OBSOLETE)) * 37) + Float.hashCode(this.longitude_OBSOLETE)) * 37) + Integer.hashCode(this.heading_OBSOLETE)) * 37) + Long.hashCode(this.gps_as_of_OBSOLETE)) * 37) + Boolean.hashCode(this.native_location_supported_OBSOLETE)) * 37) + Float.hashCode(this.native_latitude_OBSOLETE)) * 37) + Float.hashCode(this.native_longitude_OBSOLETE)) * 37) + Float.hashCode(this.corrected_latitude_OBSOLETE)) * 37) + Float.hashCode(this.corrected_longitude_OBSOLETE)) * 37) + Boolean.hashCode(this.homelink_nearby_OBSOLETE)) * 37;
        c cVar = this.native_type;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Float f11 = this.latitude;
        int iHashCode4 = (iHashCode3 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.longitude;
        int iHashCode5 = (iHashCode4 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Integer num = this.heading;
        int iHashCode6 = (iHashCode5 + (num != null ? num.hashCode() : 0)) * 37;
        Long l11 = this.gps_as_of;
        int iHashCode7 = (iHashCode6 + (l11 != null ? l11.hashCode() : 0)) * 37;
        Boolean bool = this.native_location_supported;
        int iHashCode8 = (iHashCode7 + (bool != null ? bool.hashCode() : 0)) * 37;
        Float f13 = this.native_latitude;
        int iHashCode9 = (iHashCode8 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.native_longitude;
        int iHashCode10 = (iHashCode9 + (f14 != null ? f14.hashCode() : 0)) * 37;
        Float f15 = this.corrected_latitude;
        int iHashCode11 = (iHashCode10 + (f15 != null ? f15.hashCode() : 0)) * 37;
        Float f16 = this.corrected_longitude;
        int iHashCode12 = (iHashCode11 + (f16 != null ? f16.hashCode() : 0)) * 37;
        Boolean bool2 = this.homelink_nearby;
        int iHashCode13 = (iHashCode12 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        String str = this.location_name;
        int iHashCode14 = (iHashCode13 + (str != null ? str.hashCode() : 0)) * 37;
        Float f17 = this.geo_latitude;
        int iHashCode15 = (iHashCode14 + (f17 != null ? f17.hashCode() : 0)) * 37;
        Float f18 = this.geo_longitude;
        int iHashCode16 = (iHashCode15 + (f18 != null ? f18.hashCode() : 0)) * 37;
        Float f19 = this.geo_heading;
        int iHashCode17 = (iHashCode16 + (f19 != null ? f19.hashCode() : 0)) * 37;
        Float f21 = this.geo_elevation;
        int iHashCode18 = (iHashCode17 + (f21 != null ? f21.hashCode() : 0)) * 37;
        Float f22 = this.geo_accuracy;
        int iHashCode19 = (iHashCode18 + (f22 != null ? f22.hashCode() : 0)) * 37;
        Boolean bool3 = this.estimated_gps_valid;
        int iHashCode20 = (iHashCode19 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Float f23 = this.estimated_to_raw_distance;
        int iHashCode21 = (iHashCode20 + (f23 != null ? f23.hashCode() : 0)) * 37;
        Integer num2 = this.supercharger_trt_id;
        int iHashCode22 = (iHashCode21 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Double d11 = this.native_latitude_d;
        int iHashCode23 = (iHashCode22 + (d11 != null ? d11.hashCode() : 0)) * 37;
        Double d12 = this.native_longitude_d;
        int iHashCode24 = (iHashCode23 + (d12 != null ? d12.hashCode() : 0)) * 37;
        Double d13 = this.geo_latitude_d;
        int iHashCode25 = (iHashCode24 + (d13 != null ? d13.hashCode() : 0)) * 37;
        Double d14 = this.geo_longitude_d;
        int iHashCode26 = iHashCode25 + (d14 != null ? d14.hashCode() : 0);
        this.hashCode = iHashCode26;
        return iHashCode26;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Float getGeo_accuracy() {
        return this.geo_accuracy;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Float getGeo_elevation() {
        return this.geo_elevation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Float getGeo_heading() {
        return this.geo_heading;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Float getGeo_latitude() {
        return this.geo_latitude;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getGeo_latitude_d() {
        return this.geo_latitude_d;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Float getGeo_longitude() {
        return this.geo_longitude;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m396newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getGeo_longitude_d() {
        return this.geo_longitude_d;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Long getGps_as_of() {
        return this.gps_as_of;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getGps_as_of_OBSOLETE() {
        return this.gps_as_of_OBSOLETE;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getHeading() {
        return this.heading;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getHeading_OBSOLETE() {
        return this.heading_OBSOLETE;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Boolean getHomelink_nearby() {
        return this.homelink_nearby;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("latitude_OBSOLETE=" + this.latitude_OBSOLETE);
        arrayList.add("longitude_OBSOLETE=" + this.longitude_OBSOLETE);
        arrayList.add("heading_OBSOLETE=" + this.heading_OBSOLETE);
        arrayList.add("gps_as_of_OBSOLETE=" + this.gps_as_of_OBSOLETE);
        arrayList.add("native_location_supported_OBSOLETE=" + this.native_location_supported_OBSOLETE);
        arrayList.add("native_latitude_OBSOLETE=" + this.native_latitude_OBSOLETE);
        arrayList.add("native_longitude_OBSOLETE=" + this.native_longitude_OBSOLETE);
        arrayList.add("corrected_latitude_OBSOLETE=" + this.corrected_latitude_OBSOLETE);
        arrayList.add("corrected_longitude_OBSOLETE=" + this.corrected_longitude_OBSOLETE);
        arrayList.add("homelink_nearby_OBSOLETE=" + this.homelink_nearby_OBSOLETE);
        c cVar = this.native_type;
        if (cVar != null) {
            arrayList.add("native_type=" + cVar);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Float f11 = this.latitude;
        if (f11 != null) {
            arrayList.add("latitude=" + f11);
        }
        Float f12 = this.longitude;
        if (f12 != null) {
            arrayList.add("longitude=" + f12);
        }
        Integer num = this.heading;
        if (num != null) {
            arrayList.add("heading=" + num);
        }
        Long l11 = this.gps_as_of;
        if (l11 != null) {
            arrayList.add("gps_as_of=" + l11);
        }
        Boolean bool = this.native_location_supported;
        if (bool != null) {
            arrayList.add("native_location_supported=" + bool);
        }
        Float f13 = this.native_latitude;
        if (f13 != null) {
            arrayList.add("native_latitude=" + f13);
        }
        Float f14 = this.native_longitude;
        if (f14 != null) {
            arrayList.add("native_longitude=" + f14);
        }
        Float f15 = this.corrected_latitude;
        if (f15 != null) {
            arrayList.add("corrected_latitude=" + f15);
        }
        Float f16 = this.corrected_longitude;
        if (f16 != null) {
            arrayList.add("corrected_longitude=" + f16);
        }
        Boolean bool2 = this.homelink_nearby;
        if (bool2 != null) {
            arrayList.add("homelink_nearby=" + bool2);
        }
        String str = this.location_name;
        if (str != null) {
            arrayList.add("location_name=" + x20.d.i(str));
        }
        Float f17 = this.geo_latitude;
        if (f17 != null) {
            arrayList.add("geo_latitude=" + f17);
        }
        Float f18 = this.geo_longitude;
        if (f18 != null) {
            arrayList.add("geo_longitude=" + f18);
        }
        Float f19 = this.geo_heading;
        if (f19 != null) {
            arrayList.add("geo_heading=" + f19);
        }
        Float f21 = this.geo_elevation;
        if (f21 != null) {
            arrayList.add("geo_elevation=" + f21);
        }
        Float f22 = this.geo_accuracy;
        if (f22 != null) {
            arrayList.add("geo_accuracy=" + f22);
        }
        Boolean bool3 = this.estimated_gps_valid;
        if (bool3 != null) {
            arrayList.add("estimated_gps_valid=" + bool3);
        }
        Float f23 = this.estimated_to_raw_distance;
        if (f23 != null) {
            arrayList.add("estimated_to_raw_distance=" + f23);
        }
        Integer num2 = this.supercharger_trt_id;
        if (num2 != null) {
            arrayList.add("supercharger_trt_id=" + num2);
        }
        Double d11 = this.native_latitude_d;
        if (d11 != null) {
            arrayList.add("native_latitude_d=" + d11);
        }
        Double d12 = this.native_longitude_d;
        if (d12 != null) {
            arrayList.add("native_longitude_d=" + d12);
        }
        Double d13 = this.geo_latitude_d;
        if (d13 != null) {
            arrayList.add("geo_latitude_d=" + d13);
        }
        Double d14 = this.geo_longitude_d;
        if (d14 != null) {
            arrayList.add("geo_longitude_d=" + d14);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "LocationState{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getHomelink_nearby_OBSOLETE() {
        return this.homelink_nearby_OBSOLETE;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Float getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final float getLatitude_OBSOLETE() {
        return this.latitude_OBSOLETE;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getLocation_name() {
        return this.location_name;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Float getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final float getLongitude_OBSOLETE() {
        return this.longitude_OBSOLETE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e0(float f11, float f12, int i11, long j11, boolean z11, float f13, float f14, float f15, float f16, boolean z12, c cVar, Instant instant, Float f17, Float f18, Integer num, Long l11, Boolean bool, Float f19, Float f21, Float f22, Float f23, Boolean bool2, String str, Float f24, Float f25, Float f26, Float f27, Float f28, Boolean bool3, Float f29, Integer num2, Double d11, Double d12, Double d13, Double d14, okio.k kVar, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i12 & 1;
        float f31 = BitmapDescriptorFactory.HUE_RED;
        this(i14 != 0 ? 0.0f : f11, (i12 & 2) != 0 ? 0.0f : f12, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? 0.0f : f13, (i12 & 64) != 0 ? 0.0f : f14, (i12 & 128) != 0 ? 0.0f : f15, (i12 & 256) == 0 ? f16 : f31, (i12 & 512) == 0 ? z12 : false, (i12 & 1024) != 0 ? null : cVar, (i12 & 2048) != 0 ? null : instant, (i12 & 4096) != 0 ? null : f17, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : f18, (i12 & 16384) != 0 ? null : num, (i12 & 32768) != 0 ? null : l11, (i12 & 65536) != 0 ? null : bool, (i12 & 131072) != 0 ? null : f19, (i12 & 262144) != 0 ? null : f21, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? null : f22, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? null : f23, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? null : bool2, (i12 & 4194304) != 0 ? null : str, (i12 & 8388608) != 0 ? null : f24, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : f25, (i12 & 33554432) != 0 ? null : f26, (i12 & 67108864) != 0 ? null : f27, (i12 & 134217728) != 0 ? null : f28, (i12 & 268435456) != 0 ? null : bool3, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? null : f29, (i12 & 1073741824) != 0 ? null : num2, (i12 & Integer.MIN_VALUE) != 0 ? null : d11, (i13 & 1) != 0 ? null : d12, (i13 & 2) != 0 ? null : d13, (i13 & 4) != 0 ? null : d14, (i13 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m396newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(float f11, float f12, int i11, long j11, boolean z11, float f13, float f14, float f15, float f16, boolean z12, c cVar, Instant instant, Float f17, Float f18, Integer num, Long l11, Boolean bool, Float f19, Float f21, Float f22, Float f23, Boolean bool2, String str, Float f24, Float f25, Float f26, Float f27, Float f28, Boolean bool3, Float f29, Integer num2, Double d11, Double d12, Double d13, Double d14, okio.k unknownFields) {
        super(K, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.latitude_OBSOLETE = f11;
        this.longitude_OBSOLETE = f12;
        this.heading_OBSOLETE = i11;
        this.gps_as_of_OBSOLETE = j11;
        this.native_location_supported_OBSOLETE = z11;
        this.native_latitude_OBSOLETE = f13;
        this.native_longitude_OBSOLETE = f14;
        this.corrected_latitude_OBSOLETE = f15;
        this.corrected_longitude_OBSOLETE = f16;
        this.homelink_nearby_OBSOLETE = z12;
        this.native_type = cVar;
        this.timestamp = instant;
        this.latitude = f17;
        this.longitude = f18;
        this.heading = num;
        this.gps_as_of = l11;
        this.native_location_supported = bool;
        this.native_latitude = f19;
        this.native_longitude = f21;
        this.corrected_latitude = f22;
        this.corrected_longitude = f23;
        this.homelink_nearby = bool2;
        this.location_name = str;
        this.geo_latitude = f24;
        this.geo_longitude = f25;
        this.geo_heading = f26;
        this.geo_elevation = f27;
        this.geo_accuracy = f28;
        this.estimated_gps_valid = bool3;
        this.estimated_to_raw_distance = f29;
        this.supercharger_trt_id = num2;
        this.native_latitude_d = d11;
        this.native_longitude_d = d12;
        this.geo_latitude_d = d13;
        this.geo_longitude_d = d14;
    }
}
