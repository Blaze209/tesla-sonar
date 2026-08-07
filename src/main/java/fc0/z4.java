package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b)\u0018\u0000 K2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00010BÛ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010*Já\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010*R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010(R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u0010*R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010*R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u0010*R\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010*R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b<\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b@\u0010*R\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\bA\u0010*R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00101\u001a\u0004\bG\u0010*R\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\bI\u0010*R\u001a\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bJ\u0010(R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010C\u001a\u0004\bK\u0010ER\u001a\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00103\u001a\u0004\bB\u0010(R\u001a\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00103\u001a\u0004\bH\u0010(R\u001a\u0010\u001c\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00101\u001a\u0004\bF\u0010*¨\u0006L"}, d2 = {"Lfc0/z4;", "Lcom/squareup/wire/f;", "", "", "id", "", "amenities", "", "available_stalls", "billing_info", "billing_time", "city", PlaceTypes.COUNTRY, "", "distance_miles", "district", "Lec0/n;", "location", "name", PlaceTypes.POSTAL_CODE, "", "site_closed", "state", PlaceTypes.STREET_ADDRESS, "total_stalls", "within_range", "max_power_kw", "out_of_order_stalls_number", "out_of_order_stalls_names", "Lokio/k;", "unknownFields", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Lec0/n;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILjava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;Lec0/n;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILjava/lang/String;Lokio/k;)Lfc0/z4;", "J", "k", "()J", "b", "Ljava/lang/String;", "c", "I", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", Gender.FEMALE, IntegerTokenConverter.CONVERTER_KEY, "()F", "j", "Lec0/n;", "l", "()Lec0/n;", "getName", "p", "m", "Z", "q", "()Z", "n", "r", "o", "s", "t", "u", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z4 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ProtoAdapter<z4> f65655v = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(z4.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String amenities;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "availableStalls", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int available_stalls;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "billingInfo", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final String billing_info;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "billingTime", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final String billing_time;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final String city;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final String country;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "distanceMiles", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final float distance_miles;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final String district;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.LatLong#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final ec0.n location;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final String name;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "postalCode", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final String postal_code;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "siteClosed", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final boolean site_closed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final String state;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "streetAddress", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final String street_address;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "totalStalls", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 16)
    private final int total_stalls;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "withinRange", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 17)
    private final boolean within_range;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "maxPowerKw", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 18)
    private final int max_power_kw;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "outOfOrderStallsNumber", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final int out_of_order_stalls_number;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "outOfOrderStallsNames", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 20)
    private final String out_of_order_stalls_names;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/z4$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/z4;", "value", "", "c", "(Lfc0/z4;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/z4;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/z4;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/z4;)Lfc0/z4;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<z4> {
        a(com.squareup.wire.b bVar, co0.d<z4> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.Superchargers", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z4 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            long jLongValue = 0;
            String strDecode2 = "";
            String strDecode3 = strDecode2;
            String strDecode4 = strDecode3;
            String strDecode5 = strDecode4;
            String strDecode6 = strDecode5;
            String strDecode7 = strDecode6;
            String strDecode8 = strDecode7;
            int iIntValue = 0;
            boolean zBooleanValue = false;
            int iIntValue2 = 0;
            boolean zBooleanValue2 = false;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            float fFloatValue = 0.0f;
            ec0.n nVarDecode = null;
            String strDecode9 = strDecode8;
            String strDecode10 = strDecode9;
            String strDecode11 = strDecode10;
            while (true) {
                int iG = reader.g();
                String str = strDecode2;
                if (iG == -1) {
                    return new z4(jLongValue, strDecode, iIntValue, strDecode8, str, strDecode9, strDecode10, fFloatValue, strDecode11, nVarDecode, strDecode3, strDecode4, zBooleanValue, strDecode5, strDecode6, iIntValue2, zBooleanValue2, iIntValue3, iIntValue4, strDecode7, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        break;
                    case 2:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 4:
                        strDecode8 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 5:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        continue;
                    case 6:
                        strDecode9 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 7:
                        strDecode10 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 8:
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 9:
                        strDecode11 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 10:
                        nVarDecode = ec0.n.f62721d.decode(reader);
                        break;
                    case 11:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 12:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 13:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 14:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 15:
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 16:
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 17:
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 18:
                        iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 19:
                        iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 20:
                        strDecode7 = ProtoAdapter.STRING.decode(reader);
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
        public void encode(com.squareup.wire.l writer, z4 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getId() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.getId()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getAmenities(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getAmenities());
            }
            if (value.getAvailable_stalls() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getAvailable_stalls()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getBilling_info(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getBilling_info());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getBilling_time(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 5, value.getBilling_time());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCity(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 6, value.getCity());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCountry(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 7, value.getCountry());
            }
            if (value.getDistance_miles() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 8, Float.valueOf(value.getDistance_miles()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getDistrict(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 9, value.getDistrict());
            }
            if (value.getLocation() != null) {
                ec0.n.f62721d.encodeWithTag(writer, 10, value.getLocation());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 11, value.getName());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getPostal_code(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 12, value.getPostal_code());
            }
            if (value.getSite_closed()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 13, Boolean.valueOf(value.getSite_closed()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getState(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 14, value.getState());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getStreet_address(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 15, value.getStreet_address());
            }
            if (value.getTotal_stalls() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 16, Integer.valueOf(value.getTotal_stalls()));
            }
            if (value.getWithin_range()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 17, Boolean.valueOf(value.getWithin_range()));
            }
            if (value.getMax_power_kw() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 18, Integer.valueOf(value.getMax_power_kw()));
            }
            if (value.getOut_of_order_stalls_number() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 19, Integer.valueOf(value.getOut_of_order_stalls_number()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getOut_of_order_stalls_names(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 20, value.getOut_of_order_stalls_names());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(z4 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getId() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getId()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getAmenities(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAmenities());
            }
            if (value.getAvailable_stalls() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getAvailable_stalls()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getBilling_info(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getBilling_info());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getBilling_time(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getBilling_time());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCity(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getCity());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCountry(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getCountry());
            }
            if (value.getDistance_miles() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(8, Float.valueOf(value.getDistance_miles()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getDistrict(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getDistrict());
            }
            if (value.getLocation() != null) {
                iD += ec0.n.f62721d.encodedSizeWithTag(10, value.getLocation());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getName(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getName());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getPostal_code(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getPostal_code());
            }
            if (value.getSite_closed()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.getSite_closed()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getState(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getState());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getStreet_address(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getStreet_address());
            }
            if (value.getTotal_stalls() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(16, Integer.valueOf(value.getTotal_stalls()));
            }
            if (value.getWithin_range()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.getWithin_range()));
            }
            if (value.getMax_power_kw() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(18, Integer.valueOf(value.getMax_power_kw()));
            }
            if (value.getOut_of_order_stalls_number() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(19, Integer.valueOf(value.getOut_of_order_stalls_number()));
            }
            return !p013kotlin.jvm.internal.s.f(value.getOut_of_order_stalls_names(), "") ? iD + ProtoAdapter.STRING.encodedSizeWithTag(20, value.getOut_of_order_stalls_names()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public z4 redact(z4 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.n location = value.getLocation();
            return z4.b(value, 0L, null, 0, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, location != null ? ec0.n.f62721d.redact(location) : null, null, null, false, null, null, 0, false, 0, 0, null, okio.k.f97943e, 1048063, null);
        }
    }

    public z4() {
        this(0L, null, 0, null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, null, null, null, false, null, null, 0, false, 0, 0, null, null, 2097151, null);
    }

    public static /* synthetic */ z4 b(z4 z4Var, long j11, String str, int i11, String str2, String str3, String str4, String str5, float f11, String str6, ec0.n nVar, String str7, String str8, boolean z11, String str9, String str10, int i12, boolean z12, int i13, int i14, String str11, okio.k kVar, int i15, Object obj) {
        return z4Var.a((i15 & 1) != 0 ? z4Var.id : j11, (i15 & 2) != 0 ? z4Var.amenities : str, (i15 & 4) != 0 ? z4Var.available_stalls : i11, (i15 & 8) != 0 ? z4Var.billing_info : str2, (i15 & 16) != 0 ? z4Var.billing_time : str3, (i15 & 32) != 0 ? z4Var.city : str4, (i15 & 64) != 0 ? z4Var.country : str5, (i15 & 128) != 0 ? z4Var.distance_miles : f11, (i15 & 256) != 0 ? z4Var.district : str6, (i15 & 512) != 0 ? z4Var.location : nVar, (i15 & 1024) != 0 ? z4Var.name : str7, (i15 & 2048) != 0 ? z4Var.postal_code : str8, (i15 & 4096) != 0 ? z4Var.site_closed : z11, (i15 & PKIFailureInfo.certRevoked) != 0 ? z4Var.state : str9, (i15 & 16384) != 0 ? z4Var.street_address : str10, (i15 & 32768) != 0 ? z4Var.total_stalls : i12, (i15 & 65536) != 0 ? z4Var.within_range : z12, (i15 & 131072) != 0 ? z4Var.max_power_kw : i13, (i15 & 262144) != 0 ? z4Var.out_of_order_stalls_number : i14, (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? z4Var.out_of_order_stalls_names : str11, (i15 & PKIFailureInfo.badCertTemplate) != 0 ? z4Var.unknownFields() : kVar);
    }

    public final z4 a(long id2, String amenities, int available_stalls, String billing_info, String billing_time, String city, String country, float distance_miles, String district, ec0.n location, String name, String postal_code, boolean site_closed, String state, String street_address, int total_stalls, boolean within_range, int max_power_kw, int out_of_order_stalls_number, String out_of_order_stalls_names, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(amenities, "amenities");
        p013kotlin.jvm.internal.s.k(billing_info, "billing_info");
        p013kotlin.jvm.internal.s.k(billing_time, "billing_time");
        p013kotlin.jvm.internal.s.k(city, "city");
        p013kotlin.jvm.internal.s.k(country, "country");
        p013kotlin.jvm.internal.s.k(district, "district");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(postal_code, "postal_code");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(street_address, "street_address");
        p013kotlin.jvm.internal.s.k(out_of_order_stalls_names, "out_of_order_stalls_names");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new z4(id2, amenities, available_stalls, billing_info, billing_time, city, country, distance_miles, district, location, name, postal_code, site_closed, state, street_address, total_stalls, within_range, max_power_kw, out_of_order_stalls_number, out_of_order_stalls_names, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAmenities() {
        return this.amenities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAvailable_stalls() {
        return this.available_stalls;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBilling_info() {
        return this.billing_info;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), z4Var.unknownFields()) && this.id == z4Var.id && p013kotlin.jvm.internal.s.f(this.amenities, z4Var.amenities) && this.available_stalls == z4Var.available_stalls && p013kotlin.jvm.internal.s.f(this.billing_info, z4Var.billing_info) && p013kotlin.jvm.internal.s.f(this.billing_time, z4Var.billing_time) && p013kotlin.jvm.internal.s.f(this.city, z4Var.city) && p013kotlin.jvm.internal.s.f(this.country, z4Var.country) && this.distance_miles == z4Var.distance_miles && p013kotlin.jvm.internal.s.f(this.district, z4Var.district) && p013kotlin.jvm.internal.s.f(this.location, z4Var.location) && p013kotlin.jvm.internal.s.f(this.name, z4Var.name) && p013kotlin.jvm.internal.s.f(this.postal_code, z4Var.postal_code) && this.site_closed == z4Var.site_closed && p013kotlin.jvm.internal.s.f(this.state, z4Var.state) && p013kotlin.jvm.internal.s.f(this.street_address, z4Var.street_address) && this.total_stalls == z4Var.total_stalls && this.within_range == z4Var.within_range && this.max_power_kw == z4Var.max_power_kw && this.out_of_order_stalls_number == z4Var.out_of_order_stalls_number && p013kotlin.jvm.internal.s.f(this.out_of_order_stalls_names, z4Var.out_of_order_stalls_names);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBilling_time() {
        return this.billing_time;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.id)) * 37) + this.amenities.hashCode()) * 37) + Integer.hashCode(this.available_stalls)) * 37) + this.billing_info.hashCode()) * 37) + this.billing_time.hashCode()) * 37) + this.city.hashCode()) * 37) + this.country.hashCode()) * 37) + Float.hashCode(this.distance_miles)) * 37) + this.district.hashCode()) * 37;
        ec0.n nVar = this.location;
        int iHashCode2 = ((((((((((((((((((((iHashCode + (nVar != null ? nVar.hashCode() : 0)) * 37) + this.name.hashCode()) * 37) + this.postal_code.hashCode()) * 37) + Boolean.hashCode(this.site_closed)) * 37) + this.state.hashCode()) * 37) + this.street_address.hashCode()) * 37) + Integer.hashCode(this.total_stalls)) * 37) + Boolean.hashCode(this.within_range)) * 37) + Integer.hashCode(this.max_power_kw)) * 37) + Integer.hashCode(this.out_of_order_stalls_number)) * 37) + this.out_of_order_stalls_names.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getDistance_miles() {
        return this.distance_miles;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final ec0.n getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getMax_power_kw() {
        return this.max_power_kw;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getOut_of_order_stalls_names() {
        return this.out_of_order_stalls_names;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m383newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getOut_of_order_stalls_number() {
        return this.out_of_order_stalls_number;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getPostal_code() {
        return this.postal_code;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getSite_closed() {
        return this.site_closed;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getStreet_address() {
        return this.street_address;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getTotal_stalls() {
        return this.total_stalls;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("amenities=" + x20.d.i(this.amenities));
        arrayList.add("available_stalls=" + this.available_stalls);
        arrayList.add("billing_info=" + x20.d.i(this.billing_info));
        arrayList.add("billing_time=" + x20.d.i(this.billing_time));
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
        arrayList.add("site_closed=" + this.site_closed);
        arrayList.add("state=" + x20.d.i(this.state));
        arrayList.add("street_address=" + x20.d.i(this.street_address));
        arrayList.add("total_stalls=" + this.total_stalls);
        arrayList.add("within_range=" + this.within_range);
        arrayList.add("max_power_kw=" + this.max_power_kw);
        arrayList.add("out_of_order_stalls_number=" + this.out_of_order_stalls_number);
        arrayList.add("out_of_order_stalls_names=" + x20.d.i(this.out_of_order_stalls_names));
        return p013kotlin.collections.v.y0(arrayList, ", ", "Superchargers{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getWithin_range() {
        return this.within_range;
    }

    public /* synthetic */ z4(long j11, String str, int i11, String str2, String str3, String str4, String str5, float f11, String str6, ec0.n nVar, String str7, String str8, boolean z11, String str9, String str10, int i12, boolean z12, int i13, int i14, String str11, okio.k kVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0L : j11, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? "" : str4, (i15 & 64) != 0 ? "" : str5, (i15 & 128) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i15 & 256) != 0 ? "" : str6, (i15 & 512) != 0 ? null : nVar, (i15 & 1024) != 0 ? "" : str7, (i15 & 2048) != 0 ? "" : str8, (i15 & 4096) != 0 ? false : z11, (i15 & PKIFailureInfo.certRevoked) != 0 ? "" : str9, (i15 & 16384) != 0 ? "" : str10, (i15 & 32768) != 0 ? 0 : i12, (i15 & 65536) != 0 ? false : z12, (i15 & 131072) != 0 ? 0 : i13, (i15 & 262144) != 0 ? 0 : i14, (i15 & PKIFailureInfo.signerNotTrusted) == 0 ? str11 : "", (i15 & PKIFailureInfo.badCertTemplate) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m383newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(long j11, String amenities, int i11, String billing_info, String billing_time, String city, String country, float f11, String district, ec0.n nVar, String name, String postal_code, boolean z11, String state, String street_address, int i12, boolean z12, int i13, int i14, String out_of_order_stalls_names, okio.k unknownFields) {
        super(f65655v, unknownFields);
        p013kotlin.jvm.internal.s.k(amenities, "amenities");
        p013kotlin.jvm.internal.s.k(billing_info, "billing_info");
        p013kotlin.jvm.internal.s.k(billing_time, "billing_time");
        p013kotlin.jvm.internal.s.k(city, "city");
        p013kotlin.jvm.internal.s.k(country, "country");
        p013kotlin.jvm.internal.s.k(district, "district");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(postal_code, "postal_code");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(street_address, "street_address");
        p013kotlin.jvm.internal.s.k(out_of_order_stalls_names, "out_of_order_stalls_names");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.id = j11;
        this.amenities = amenities;
        this.available_stalls = i11;
        this.billing_info = billing_info;
        this.billing_time = billing_time;
        this.city = city;
        this.country = country;
        this.distance_miles = f11;
        this.district = district;
        this.location = nVar;
        this.name = name;
        this.postal_code = postal_code;
        this.site_closed = z11;
        this.state = state;
        this.street_address = street_address;
        this.total_stalls = i12;
        this.within_range = z12;
        this.max_power_kw = i13;
        this.out_of_order_stalls_number = i14;
        this.out_of_order_stalls_names = out_of_order_stalls_names;
    }
}
