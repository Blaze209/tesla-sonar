package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u008b\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u0091\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b+\u0010\"R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b0\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b4\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b5\u0010\"R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\"R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u0010\"R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lfc0/v;", "Lcom/squareup/wire/f;", "", "", "id", "", "amenities", "city", PlaceTypes.COUNTRY, "", "distance_miles", "district", "Lec0/n;", "location", "name", PlaceTypes.POSTAL_CODE, "state", PlaceTypes.STREET_ADDRESS, "", "within_range", "Lokio/k;", "unknownFields", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Lec0/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Lec0/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLokio/k;)Lfc0/v;", "J", "h", "()J", "b", "Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "e", Gender.FEMALE, "f", "()F", "g", "Lec0/n;", IntegerTokenConverter.CONVERTER_KEY, "()Lec0/n;", "getName", "j", "k", "l", "Z", "m", "()Z", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v extends com.squareup.wire.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ProtoAdapter<v> f65492n = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(v.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String amenities;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final String city;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final String country;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "distanceMiles", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final float distance_miles;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final String district;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final ec0.n location;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final String name;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "postalCode", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final String postal_code;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final String state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "streetAddress", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final String street_address;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "withinRange", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final boolean within_range;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/v$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/v;", "value", "", "c", "(Lfc0/v;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/v;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/v;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/v;)Lfc0/v;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<v> {
        a(com.squareup.wire.b bVar, co0.d<v> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.DestinationCharging", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            long jLongValue = 0;
            String strDecode2 = "";
            String strDecode3 = strDecode2;
            String strDecode4 = strDecode3;
            String strDecode5 = strDecode4;
            float fFloatValue = 0.0f;
            ec0.n nVarDecode = null;
            boolean zBooleanValue = false;
            String strDecode6 = strDecode5;
            String strDecode7 = strDecode6;
            String strDecode8 = strDecode7;
            while (true) {
                int iG = reader.g();
                String str = strDecode2;
                if (iG == -1) {
                    return new v(jLongValue, strDecode, str, strDecode3, fFloatValue, strDecode6, nVarDecode, strDecode7, strDecode8, strDecode4, strDecode5, zBooleanValue, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        break;
                    case 2:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        continue;
                    case 4:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 6:
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 7:
                        nVarDecode = ec0.n.f62721d.decode(reader);
                        break;
                    case 8:
                        strDecode7 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 9:
                        strDecode8 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 10:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 11:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 12:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
                strDecode2 = str;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, v value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getId() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.getId()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getAmenities(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getAmenities());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCity(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getCity());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCountry(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getCountry());
            }
            if (value.getDistance_miles() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 5, Float.valueOf(value.getDistance_miles()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getDistrict(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getDistrict());
            }
            if (value.getLocation() != null) {
                ec0.n.f62721d.encodeWithTag(writer, 7, value.getLocation());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getName());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getPostal_code(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 9, value.getPostal_code());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getState(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 10, value.getState());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getStreet_address(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 11, value.getStreet_address());
            }
            if (value.getWithin_range()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 12, Boolean.valueOf(value.getWithin_range()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(v value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getId() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getId()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getAmenities(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAmenities());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCity(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getCity());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCountry(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCountry());
            }
            if (value.getDistance_miles() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(5, Float.valueOf(value.getDistance_miles()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getDistrict(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDistrict());
            }
            if (value.getLocation() != null) {
                iD += ec0.n.f62721d.encodedSizeWithTag(7, value.getLocation());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getName(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getName());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getPostal_code(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getPostal_code());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getState(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getState());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getStreet_address(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getStreet_address());
            }
            return value.getWithin_range() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.getWithin_range())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public v redact(v value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.n location = value.getLocation();
            return v.b(value, 0L, null, null, null, BitmapDescriptorFactory.HUE_RED, null, location != null ? ec0.n.f62721d.redact(location) : null, null, null, null, null, false, okio.k.f97943e, 4031, null);
        }
    }

    public v() {
        this(0L, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, false, null, 8191, null);
    }

    public static /* synthetic */ v b(v vVar, long j11, String str, String str2, String str3, float f11, String str4, ec0.n nVar, String str5, String str6, String str7, String str8, boolean z11, okio.k kVar, int i11, Object obj) {
        return vVar.a((i11 & 1) != 0 ? vVar.id : j11, (i11 & 2) != 0 ? vVar.amenities : str, (i11 & 4) != 0 ? vVar.city : str2, (i11 & 8) != 0 ? vVar.country : str3, (i11 & 16) != 0 ? vVar.distance_miles : f11, (i11 & 32) != 0 ? vVar.district : str4, (i11 & 64) != 0 ? vVar.location : nVar, (i11 & 128) != 0 ? vVar.name : str5, (i11 & 256) != 0 ? vVar.postal_code : str6, (i11 & 512) != 0 ? vVar.state : str7, (i11 & 1024) != 0 ? vVar.street_address : str8, (i11 & 2048) != 0 ? vVar.within_range : z11, (i11 & 4096) != 0 ? vVar.unknownFields() : kVar);
    }

    public final v a(long id2, String amenities, String city, String country, float distance_miles, String district, ec0.n location, String name, String postal_code, String state, String street_address, boolean within_range, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(amenities, "amenities");
        p013kotlin.jvm.internal.s.k(city, "city");
        p013kotlin.jvm.internal.s.k(country, "country");
        p013kotlin.jvm.internal.s.k(district, "district");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(postal_code, "postal_code");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(street_address, "street_address");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new v(id2, amenities, city, country, distance_miles, district, location, name, postal_code, state, street_address, within_range, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAmenities() {
        return this.amenities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof v)) {
            return false;
        }
        v vVar = (v) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), vVar.unknownFields()) && this.id == vVar.id && p013kotlin.jvm.internal.s.f(this.amenities, vVar.amenities) && p013kotlin.jvm.internal.s.f(this.city, vVar.city) && p013kotlin.jvm.internal.s.f(this.country, vVar.country) && this.distance_miles == vVar.distance_miles && p013kotlin.jvm.internal.s.f(this.district, vVar.district) && p013kotlin.jvm.internal.s.f(this.location, vVar.location) && p013kotlin.jvm.internal.s.f(this.name, vVar.name) && p013kotlin.jvm.internal.s.f(this.postal_code, vVar.postal_code) && p013kotlin.jvm.internal.s.f(this.state, vVar.state) && p013kotlin.jvm.internal.s.f(this.street_address, vVar.street_address) && this.within_range == vVar.within_range;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDistance_miles() {
        return this.distance_miles;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.id)) * 37) + this.amenities.hashCode()) * 37) + this.city.hashCode()) * 37) + this.country.hashCode()) * 37) + Float.hashCode(this.distance_miles)) * 37) + this.district.hashCode()) * 37;
        ec0.n nVar = this.location;
        int iHashCode2 = ((((((((((iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 37) + this.name.hashCode()) * 37) + this.postal_code.hashCode()) * 37) + this.state.hashCode()) * 37) + this.street_address.hashCode()) * 37) + Boolean.hashCode(this.within_range);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ec0.n getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPostal_code() {
        return this.postal_code;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getStreet_address() {
        return this.street_address;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getWithin_range() {
        return this.within_range;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m349newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("amenities=" + x20.d.i(this.amenities));
        arrayList.add("city=" + x20.d.i(this.city));
        arrayList.add("country=" + x20.d.i(this.country));
        arrayList.add("distance_miles=" + this.distance_miles);
        arrayList.add("district=" + x20.d.i(this.district));
        ec0.n nVar = this.location;
        if (nVar != null) {
            arrayList.add("location=" + nVar);
        }
        arrayList.add("name=" + x20.d.i(this.name));
        arrayList.add("postal_code=" + x20.d.i(this.postal_code));
        arrayList.add("state=" + x20.d.i(this.state));
        arrayList.add("street_address=" + x20.d.i(this.street_address));
        arrayList.add("within_range=" + this.within_range);
        return p013kotlin.collections.v.y0(arrayList, ", ", "DestinationCharging{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ v(long j11, String str, String str2, String str3, float f11, String str4, ec0.n nVar, String str5, String str6, String str7, String str8, boolean z11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? null : nVar, (i11 & 128) != 0 ? "" : str5, (i11 & 256) != 0 ? "" : str6, (i11 & 512) != 0 ? "" : str7, (i11 & 1024) == 0 ? str8 : "", (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m349newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j11, String amenities, String city, String country, float f11, String district, ec0.n nVar, String name, String postal_code, String state, String street_address, boolean z11, okio.k unknownFields) {
        super(f65492n, unknownFields);
        p013kotlin.jvm.internal.s.k(amenities, "amenities");
        p013kotlin.jvm.internal.s.k(city, "city");
        p013kotlin.jvm.internal.s.k(country, "country");
        p013kotlin.jvm.internal.s.k(district, "district");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(postal_code, "postal_code");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(street_address, "street_address");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.id = j11;
        this.amenities = amenities;
        this.city = city;
        this.country = country;
        this.distance_miles = f11;
        this.district = district;
        this.location = nVar;
        this.name = name;
        this.postal_code = postal_code;
        this.state = state;
        this.street_address = street_address;
        this.within_range = z11;
    }
}
