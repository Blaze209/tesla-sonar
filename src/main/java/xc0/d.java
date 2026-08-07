package xc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import ezvcard.property.Gender;
import gc0.e0;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import jn0.e;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b'\u0018\u0000 K2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B÷\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+Jý\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\"\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\b6\u0010IR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010G\u001a\u0004\b:\u0010IR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010ER\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010G\u001a\u0004\bM\u0010IR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010G\u001a\u0004\bN\u0010IR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010G\u001a\u0004\bL\u0010IR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010G\u001a\u0004\bJ\u0010IR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010G\u001a\u0004\bF\u0010IR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\b>\u0010ER\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010G\u001a\u0004\bB\u0010I¨\u0006P"}, d2 = {"Lxc0/d;", "Lcom/squareup/wire/f;", "", "", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "Lgc0/e0$c;", "coordinate_type", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "", "heading", "", "gps_as_of", "", "native_location_supported", "native_latitude", "native_longitude", "corrected_latitude", "corrected_longitude", "homelink_nearby", "geo_latitude", "geo_longitude", "geo_heading", "geo_elevation", "geo_accuracy", "estimated_gps_valid", "estimated_to_raw_distance", "Lokio/k;", "unknownFields", "<init>", "(FFLgc0/e0$c;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Float;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(FFLgc0/e0$c;Lj$/time/Instant;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Float;Lokio/k;)Lxc0/d;", Gender.FEMALE, "p", "()F", "b", "q", "c", "Lgc0/e0$c;", "()Lgc0/e0$c;", DateTokenConverter.CONVERTER_KEY, "Lj$/time/Instant;", "u", "()Lj$/time/Instant;", "e", "Ljava/lang/Integer;", "n", "()Ljava/lang/Integer;", "f", "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", "g", "Ljava/lang/Boolean;", "s", "()Ljava/lang/Boolean;", "h", "Ljava/lang/Float;", "r", "()Ljava/lang/Float;", IntegerTokenConverter.CONVERTER_KEY, "t", "j", "k", "l", "o", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ProtoAdapter<d> f123249u = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(d.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = q.a.OMIT_IDENTITY, tag = 1)
    private final float latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = q.a.OMIT_IDENTITY, tag = 2)
    private final float longitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.carserver.vehicle.LocationState$GPSCoordinateType#ADAPTER", jsonName = "coordinateType", label = q.a.OMIT_IDENTITY, tag = 8)
    private final e0.c coordinate_type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = q.a.OMIT_IDENTITY, tag = 11)
    private final Instant timestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    private final Integer heading;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "gpsAsOf", tag = 4)
    private final Long gps_as_of;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "nativeLocationSupported", tag = 5)
    private final Boolean native_location_supported;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLatitude", tag = 6)
    private final Float native_latitude;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "nativeLongitude", tag = 7)
    private final Float native_longitude;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLatitude", tag = 9)
    private final Float corrected_latitude;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "correctedLongitude", tag = 10)
    private final Float corrected_longitude;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "homelinkNearby", tag = 12)
    private final Boolean homelink_nearby;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoLatitude", tag = 14)
    private final Float geo_latitude;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoLongitude", tag = 15)
    private final Float geo_longitude;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoHeading", tag = 16)
    private final Float geo_heading;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoElevation", tag = 17)
    private final Float geo_elevation;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "geoAccuracy", tag = 18)
    private final Float geo_accuracy;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "estimatedGpsValid", tag = 19)
    private final Boolean estimated_gps_valid;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "estimatedToRawDistance", tag = 20)
    private final Float estimated_to_raw_distance;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"xc0/d$a", "Lcom/squareup/wire/ProtoAdapter;", "Lxc0/d;", "value", "", "c", "(Lxc0/d;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lxc0/d;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lxc0/d;", DateTokenConverter.CONVERTER_KEY, "(Lxc0/d;)Lxc0/d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, co0.d<d> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.PreciseLocation", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d decode(k reader) throws IOException {
            s.k(reader, "reader");
            long jD = reader.d();
            e0.c cVarDecode = null;
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            Integer numDecode = null;
            Long lDecode = null;
            Boolean boolDecode = null;
            Float fDecode = null;
            Float fDecode2 = null;
            Float fDecode3 = null;
            Float fDecode4 = null;
            Boolean boolDecode2 = null;
            Float fDecode5 = null;
            Float fDecode6 = null;
            Float fDecode7 = null;
            Float fDecode8 = null;
            Float fDecode9 = null;
            Boolean boolDecode3 = null;
            Float fDecode10 = null;
            Instant instantDecode = null;
            while (true) {
                int iG = reader.g();
                e0.c cVar = cVarDecode;
                if (iG == -1) {
                    return new d(fFloatValue, fFloatValue2, cVar, instantDecode, numDecode, lDecode, boolDecode, fDecode, fDecode2, fDecode3, fDecode4, boolDecode2, fDecode5, fDecode6, fDecode7, fDecode8, fDecode9, boolDecode3, fDecode10, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 2:
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 3:
                        numDecode = ProtoAdapter.UINT32.decode(reader);
                        break;
                    case 4:
                        lDecode = ProtoAdapter.UINT64.decode(reader);
                        break;
                    case 5:
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 6:
                        fDecode = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 7:
                        fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 8:
                        cVarDecode = e0.c.f68038d.decode(reader);
                        continue;
                    case 9:
                        fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 10:
                        fDecode4 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 11:
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        break;
                    case 12:
                        boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 13:
                    default:
                        reader.m(iG);
                        break;
                    case 14:
                        fDecode5 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 15:
                        fDecode6 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 16:
                        fDecode7 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 17:
                        fDecode8 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 18:
                        fDecode9 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                    case 19:
                        boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                        break;
                    case 20:
                        fDecode10 = ProtoAdapter.FLOAT.decode(reader);
                        break;
                }
                cVarDecode = cVar;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, d value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getLatitude() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.getLatitude()));
            }
            if (value.getLongitude() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, Float.valueOf(value.getLongitude()));
            }
            if (value.getCoordinate_type() != null) {
                e0.c.f68038d.encodeWithTag(writer, 8, value.getCoordinate_type());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 11, value.getTimestamp());
            }
            ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.getHeading());
            ProtoAdapter.UINT64.encodeWithTag(writer, 4, value.getGps_as_of());
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 5, value.getNative_location_supported());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            protoAdapter2.encodeWithTag(writer, 6, value.getNative_latitude());
            protoAdapter2.encodeWithTag(writer, 7, value.getNative_longitude());
            protoAdapter2.encodeWithTag(writer, 9, value.getCorrected_latitude());
            protoAdapter2.encodeWithTag(writer, 10, value.getCorrected_longitude());
            protoAdapter.encodeWithTag(writer, 12, value.getHomelink_nearby());
            protoAdapter2.encodeWithTag(writer, 14, value.getGeo_latitude());
            protoAdapter2.encodeWithTag(writer, 15, value.getGeo_longitude());
            protoAdapter2.encodeWithTag(writer, 16, value.getGeo_heading());
            protoAdapter2.encodeWithTag(writer, 17, value.getGeo_elevation());
            protoAdapter2.encodeWithTag(writer, 18, value.getGeo_accuracy());
            protoAdapter.encodeWithTag(writer, 19, value.getEstimated_gps_valid());
            protoAdapter2.encodeWithTag(writer, 20, value.getEstimated_to_raw_distance());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(d value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getLatitude() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getLatitude()));
            }
            if (value.getLongitude() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getLongitude()));
            }
            if (value.getCoordinate_type() != null) {
                iD += e0.c.f68038d.encodedSizeWithTag(8, value.getCoordinate_type());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(11, value.getTimestamp());
            }
            int iEncodedSizeWithTag = iD + ProtoAdapter.UINT32.encodedSizeWithTag(3, value.getHeading()) + ProtoAdapter.UINT64.encodedSizeWithTag(4, value.getGps_as_of());
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getNative_location_supported());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(6, value.getNative_latitude()) + protoAdapter2.encodedSizeWithTag(7, value.getNative_longitude()) + protoAdapter2.encodedSizeWithTag(9, value.getCorrected_latitude()) + protoAdapter2.encodedSizeWithTag(10, value.getCorrected_longitude()) + protoAdapter.encodedSizeWithTag(12, value.getHomelink_nearby()) + protoAdapter2.encodedSizeWithTag(14, value.getGeo_latitude()) + protoAdapter2.encodedSizeWithTag(15, value.getGeo_longitude()) + protoAdapter2.encodedSizeWithTag(16, value.getGeo_heading()) + protoAdapter2.encodedSizeWithTag(17, value.getGeo_elevation()) + protoAdapter2.encodedSizeWithTag(18, value.getGeo_accuracy()) + protoAdapter.encodedSizeWithTag(19, value.getEstimated_gps_valid()) + protoAdapter2.encodedSizeWithTag(20, value.getEstimated_to_raw_distance());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d redact(d value) {
            s.k(value, "value");
            e0.c coordinate_type = value.getCoordinate_type();
            e0.c cVarRedact = coordinate_type != null ? e0.c.f68038d.redact(coordinate_type) : null;
            Instant timestamp = value.getTimestamp();
            return d.b(value, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, cVarRedact, timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, 524275, null);
        }
    }

    public d() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public static /* synthetic */ d b(d dVar, float f11, float f12, e0.c cVar, Instant instant, Integer num, Long l11, Boolean bool, Float f13, Float f14, Float f15, Float f16, Boolean bool2, Float f17, Float f18, Float f19, Float f21, Float f22, Boolean bool3, Float f23, okio.k kVar, int i11, Object obj) {
        return dVar.a((i11 & 1) != 0 ? dVar.latitude : f11, (i11 & 2) != 0 ? dVar.longitude : f12, (i11 & 4) != 0 ? dVar.coordinate_type : cVar, (i11 & 8) != 0 ? dVar.timestamp : instant, (i11 & 16) != 0 ? dVar.heading : num, (i11 & 32) != 0 ? dVar.gps_as_of : l11, (i11 & 64) != 0 ? dVar.native_location_supported : bool, (i11 & 128) != 0 ? dVar.native_latitude : f13, (i11 & 256) != 0 ? dVar.native_longitude : f14, (i11 & 512) != 0 ? dVar.corrected_latitude : f15, (i11 & 1024) != 0 ? dVar.corrected_longitude : f16, (i11 & 2048) != 0 ? dVar.homelink_nearby : bool2, (i11 & 4096) != 0 ? dVar.geo_latitude : f17, (i11 & PKIFailureInfo.certRevoked) != 0 ? dVar.geo_longitude : f18, (i11 & 16384) != 0 ? dVar.geo_heading : f19, (i11 & 32768) != 0 ? dVar.geo_elevation : f21, (i11 & 65536) != 0 ? dVar.geo_accuracy : f22, (i11 & 131072) != 0 ? dVar.estimated_gps_valid : bool3, (i11 & 262144) != 0 ? dVar.estimated_to_raw_distance : f23, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? dVar.unknownFields() : kVar);
    }

    public final d a(float latitude, float longitude, e0.c coordinate_type, Instant timestamp, Integer heading, Long gps_as_of, Boolean native_location_supported, Float native_latitude, Float native_longitude, Float corrected_latitude, Float corrected_longitude, Boolean homelink_nearby, Float geo_latitude, Float geo_longitude, Float geo_heading, Float geo_elevation, Float geo_accuracy, Boolean estimated_gps_valid, Float estimated_to_raw_distance, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new d(latitude, longitude, coordinate_type, timestamp, heading, gps_as_of, native_location_supported, native_latitude, native_longitude, corrected_latitude, corrected_longitude, homelink_nearby, geo_latitude, geo_longitude, geo_heading, geo_elevation, geo_accuracy, estimated_gps_valid, estimated_to_raw_distance, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0.c getCoordinate_type() {
        return this.coordinate_type;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getCorrected_latitude() {
        return this.corrected_latitude;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getCorrected_longitude() {
        return this.corrected_longitude;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return s.f(unknownFields(), dVar.unknownFields()) && this.latitude == dVar.latitude && this.longitude == dVar.longitude && s.f(this.coordinate_type, dVar.coordinate_type) && s.f(this.timestamp, dVar.timestamp) && s.f(this.heading, dVar.heading) && s.f(this.gps_as_of, dVar.gps_as_of) && s.f(this.native_location_supported, dVar.native_location_supported) && s.e(this.native_latitude, dVar.native_latitude) && s.e(this.native_longitude, dVar.native_longitude) && s.e(this.corrected_latitude, dVar.corrected_latitude) && s.e(this.corrected_longitude, dVar.corrected_longitude) && s.f(this.homelink_nearby, dVar.homelink_nearby) && s.e(this.geo_latitude, dVar.geo_latitude) && s.e(this.geo_longitude, dVar.geo_longitude) && s.e(this.geo_heading, dVar.geo_heading) && s.e(this.geo_elevation, dVar.geo_elevation) && s.e(this.geo_accuracy, dVar.geo_accuracy) && s.f(this.estimated_gps_valid, dVar.estimated_gps_valid) && s.e(this.estimated_to_raw_distance, dVar.estimated_to_raw_distance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getEstimated_gps_valid() {
        return this.estimated_gps_valid;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Float getEstimated_to_raw_distance() {
        return this.estimated_to_raw_distance;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Float getGeo_accuracy() {
        return this.geo_accuracy;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Float.hashCode(this.latitude)) * 37) + Float.hashCode(this.longitude)) * 37;
        e0.c cVar = this.coordinate_type;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        Integer num = this.heading;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 37;
        Long l11 = this.gps_as_of;
        int iHashCode5 = (iHashCode4 + (l11 != null ? l11.hashCode() : 0)) * 37;
        Boolean bool = this.native_location_supported;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        Float f11 = this.native_latitude;
        int iHashCode7 = (iHashCode6 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.native_longitude;
        int iHashCode8 = (iHashCode7 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.corrected_latitude;
        int iHashCode9 = (iHashCode8 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.corrected_longitude;
        int iHashCode10 = (iHashCode9 + (f14 != null ? f14.hashCode() : 0)) * 37;
        Boolean bool2 = this.homelink_nearby;
        int iHashCode11 = (iHashCode10 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Float f15 = this.geo_latitude;
        int iHashCode12 = (iHashCode11 + (f15 != null ? f15.hashCode() : 0)) * 37;
        Float f16 = this.geo_longitude;
        int iHashCode13 = (iHashCode12 + (f16 != null ? f16.hashCode() : 0)) * 37;
        Float f17 = this.geo_heading;
        int iHashCode14 = (iHashCode13 + (f17 != null ? f17.hashCode() : 0)) * 37;
        Float f18 = this.geo_elevation;
        int iHashCode15 = (iHashCode14 + (f18 != null ? f18.hashCode() : 0)) * 37;
        Float f19 = this.geo_accuracy;
        int iHashCode16 = (iHashCode15 + (f19 != null ? f19.hashCode() : 0)) * 37;
        Boolean bool3 = this.estimated_gps_valid;
        int iHashCode17 = (iHashCode16 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Float f21 = this.estimated_to_raw_distance;
        int iHashCode18 = iHashCode17 + (f21 != null ? f21.hashCode() : 0);
        this.hashCode = iHashCode18;
        return iHashCode18;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Float getGeo_elevation() {
        return this.geo_elevation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Float getGeo_heading() {
        return this.geo_heading;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Float getGeo_latitude() {
        return this.geo_latitude;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Float getGeo_longitude() {
        return this.geo_longitude;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getGps_as_of() {
        return this.gps_as_of;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getHeading() {
        return this.heading;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m859newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getHomelink_nearby() {
        return this.homelink_nearby;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Float getNative_latitude() {
        return this.native_latitude;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getNative_location_supported() {
        return this.native_location_supported;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Float getNative_longitude() {
        return this.native_longitude;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("latitude=" + this.latitude);
        arrayList.add("longitude=" + this.longitude);
        e0.c cVar = this.coordinate_type;
        if (cVar != null) {
            arrayList.add("coordinate_type=" + cVar);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
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
        Float f11 = this.native_latitude;
        if (f11 != null) {
            arrayList.add("native_latitude=" + f11);
        }
        Float f12 = this.native_longitude;
        if (f12 != null) {
            arrayList.add("native_longitude=" + f12);
        }
        Float f13 = this.corrected_latitude;
        if (f13 != null) {
            arrayList.add("corrected_latitude=" + f13);
        }
        Float f14 = this.corrected_longitude;
        if (f14 != null) {
            arrayList.add("corrected_longitude=" + f14);
        }
        Boolean bool2 = this.homelink_nearby;
        if (bool2 != null) {
            arrayList.add("homelink_nearby=" + bool2);
        }
        Float f15 = this.geo_latitude;
        if (f15 != null) {
            arrayList.add("geo_latitude=" + f15);
        }
        Float f16 = this.geo_longitude;
        if (f16 != null) {
            arrayList.add("geo_longitude=" + f16);
        }
        Float f17 = this.geo_heading;
        if (f17 != null) {
            arrayList.add("geo_heading=" + f17);
        }
        Float f18 = this.geo_elevation;
        if (f18 != null) {
            arrayList.add("geo_elevation=" + f18);
        }
        Float f19 = this.geo_accuracy;
        if (f19 != null) {
            arrayList.add("geo_accuracy=" + f19);
        }
        Boolean bool3 = this.estimated_gps_valid;
        if (bool3 != null) {
            arrayList.add("estimated_gps_valid=" + bool3);
        }
        Float f21 = this.estimated_to_raw_distance;
        if (f21 != null) {
            arrayList.add("estimated_to_raw_distance=" + f21);
        }
        return v.y0(arrayList, ", ", "PreciseLocation{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public /* synthetic */ d(float f11, float f12, e0.c cVar, Instant instant, Integer num, Long l11, Boolean bool, Float f13, Float f14, Float f15, Float f16, Boolean bool2, Float f17, Float f18, Float f19, Float f21, Float f22, Boolean bool3, Float f23, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) == 0 ? f12 : BitmapDescriptorFactory.HUE_RED, (i11 & 4) != 0 ? null : cVar, (i11 & 8) != 0 ? null : instant, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : l11, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : f13, (i11 & 256) != 0 ? null : f14, (i11 & 512) != 0 ? null : f15, (i11 & 1024) != 0 ? null : f16, (i11 & 2048) != 0 ? null : bool2, (i11 & 4096) != 0 ? null : f17, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : f18, (i11 & 16384) != 0 ? null : f19, (i11 & 32768) != 0 ? null : f21, (i11 & 65536) != 0 ? null : f22, (i11 & 131072) != 0 ? null : bool3, (i11 & 262144) != 0 ? null : f23, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? okio.k.f97943e : kVar);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m859newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(float f11, float f12, e0.c cVar, Instant instant, Integer num, Long l11, Boolean bool, Float f13, Float f14, Float f15, Float f16, Boolean bool2, Float f17, Float f18, Float f19, Float f21, Float f22, Boolean bool3, Float f23, okio.k unknownFields) {
        super(f123249u, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.latitude = f11;
        this.longitude = f12;
        this.coordinate_type = cVar;
        this.timestamp = instant;
        this.heading = num;
        this.gps_as_of = l11;
        this.native_location_supported = bool;
        this.native_latitude = f13;
        this.native_longitude = f14;
        this.corrected_latitude = f15;
        this.corrected_longitude = f16;
        this.homelink_nearby = bool2;
        this.geo_latitude = f17;
        this.geo_longitude = f18;
        this.geo_heading = f19;
        this.geo_elevation = f21;
        this.geo_accuracy = f22;
        this.estimated_gps_valid = bool3;
        this.estimated_to_raw_distance = f23;
    }
}
