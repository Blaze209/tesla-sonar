package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003$\"'B_\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJe\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b+\u0010#R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/¨\u00060"}, d2 = {"Lfc0/x1;", "Lcom/squareup/wire/f;", "", "", "delta_celsius", "", "delta_percent", "absolute_celsius", "Lfc0/x1$d;", "level", "", "Lfc0/x1$c;", "hvac_temperature_zone", "driver_temp_celsius", "passenger_temp_celsius", "Lokio/k;", "unknownFields", "<init>", "(FIFLfc0/x1$d;Ljava/util/List;FFLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(FIFLfc0/x1$d;Ljava/util/List;FFLokio/k;)Lfc0/x1;", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "b", "I", "e", "c", "Lfc0/x1$d;", "h", "()Lfc0/x1$d;", "f", IntegerTokenConverter.CONVERTER_KEY, "g", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<x1> f65562i = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(x1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "deltaCelsius", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final float delta_celsius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", jsonName = "deltaPercent", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int delta_percent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "absoluteCelsius", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final float absolute_celsius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacTemperatureAdjustmentAction$Temperature#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final d level;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "driverTempCelsius", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final float driver_temp_celsius;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "passengerTempCelsius", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final float passenger_temp_celsius;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.HvacTemperatureAdjustmentAction$HvacTemperatureZone#ADAPTER", jsonName = "hvacTemperatureZone", label = com.squareup.wire.q.a.REPEATED, tag = 4)
    private final List<c> hvac_temperature_zone;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/x1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/x1;", "value", "", "c", "(Lfc0/x1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/x1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/x1;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/x1;)Lfc0/x1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<x1> {
        a(com.squareup.wire.b bVar, co0.d<x1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.HvacTemperatureAdjustmentAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            float fFloatValue = BitmapDescriptorFactory.HUE_RED;
            int iIntValue = 0;
            float fFloatValue2 = 0.0f;
            float fFloatValue3 = 0.0f;
            d dVarDecode = null;
            float fFloatValue4 = 0.0f;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new x1(fFloatValue, iIntValue, fFloatValue4, dVarDecode, arrayList, fFloatValue2, fFloatValue3, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 2:
                        iIntValue = ProtoAdapter.SINT32.decode(reader).intValue();
                        break;
                    case 3:
                        fFloatValue4 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 4:
                        arrayList.add(c.f65571f.decode(reader));
                        break;
                    case 5:
                        dVarDecode = d.f65577e.decode(reader);
                        break;
                    case 6:
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 7:
                        fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, x1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getDelta_celsius() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.getDelta_celsius()));
            }
            if (value.getDelta_percent() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getDelta_percent()));
            }
            if (value.getAbsolute_celsius() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.getAbsolute_celsius()));
            }
            if (value.getLevel() != null) {
                d.f65577e.encodeWithTag(writer, 5, value.getLevel());
            }
            c.f65571f.asRepeated().encodeWithTag(writer, 4, value.g());
            if (value.getDriver_temp_celsius() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 6, Float.valueOf(value.getDriver_temp_celsius()));
            }
            if (value.getPassenger_temp_celsius() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 7, Float.valueOf(value.getPassenger_temp_celsius()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(x1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getDelta_celsius() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getDelta_celsius()));
            }
            if (value.getDelta_percent() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(2, Integer.valueOf(value.getDelta_percent()));
            }
            if (value.getAbsolute_celsius() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getAbsolute_celsius()));
            }
            if (value.getLevel() != null) {
                iD += d.f65577e.encodedSizeWithTag(5, value.getLevel());
            }
            int iEncodedSizeWithTag = iD + c.f65571f.asRepeated().encodedSizeWithTag(4, value.g());
            if (value.getDriver_temp_celsius() != BitmapDescriptorFactory.HUE_RED) {
                iEncodedSizeWithTag += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getDriver_temp_celsius()));
            }
            return value.getPassenger_temp_celsius() == BitmapDescriptorFactory.HUE_RED ? iEncodedSizeWithTag : iEncodedSizeWithTag + ProtoAdapter.FLOAT.encodedSizeWithTag(7, Float.valueOf(value.getPassenger_temp_celsius()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public x1 redact(x1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            d level = value.getLevel();
            return x1.b(value, BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, level != null ? d.f65577e.redact(level) : null, x20.d.a(value.g(), c.f65571f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, okio.k.f97943e, 103, null);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Lfc0/x1$c;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "TEMP_ZONE_UNKNOWN", "TEMP_ZONE_FRONT_LEFT", "TEMP_ZONE_FRONT_RIGHT", "TEMP_ZONE_REAR", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lfc0/x1$c;", "Lec0/h0;", "e", "()Lec0/h0;", "b", "c", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final ProtoAdapter<c> f65571f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPZONEUNKNOWN", tag = 1)
        private final ec0.h0 TEMP_ZONE_UNKNOWN;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPZONEFRONTLEFT", tag = 2)
        private final ec0.h0 TEMP_ZONE_FRONT_LEFT;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPZONEFRONTRIGHT", tag = 3)
        private final ec0.h0 TEMP_ZONE_FRONT_RIGHT;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPZONEREAR", tag = 4)
        private final ec0.h0 TEMP_ZONE_REAR;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/x1$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/x1$c;", "value", "", "c", "(Lfc0/x1$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/x1$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/x1$c;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/x1$c;)Lfc0/x1$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.HvacTemperatureAdjustmentAction.HvacTemperatureZone", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                ec0.h0 h0VarDecode4 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new c(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, reader.e(jD));
                    }
                    if (iG == 1) {
                        h0VarDecode = ec0.h0.f62622b.decode(reader);
                    } else if (iG == 2) {
                        h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                    } else if (iG == 3) {
                        h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                    } else if (iG != 4) {
                        reader.m(iG);
                    } else {
                        h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getTEMP_ZONE_UNKNOWN());
                protoAdapter.encodeWithTag(writer, 2, value.getTEMP_ZONE_FRONT_LEFT());
                protoAdapter.encodeWithTag(writer, 3, value.getTEMP_ZONE_FRONT_RIGHT());
                protoAdapter.encodeWithTag(writer, 4, value.getTEMP_ZONE_REAR());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getTEMP_ZONE_UNKNOWN()) + protoAdapter.encodedSizeWithTag(2, value.getTEMP_ZONE_FRONT_LEFT()) + protoAdapter.encodedSizeWithTag(3, value.getTEMP_ZONE_FRONT_RIGHT()) + protoAdapter.encodedSizeWithTag(4, value.getTEMP_ZONE_REAR());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 temp_zone_unknown = value.getTEMP_ZONE_UNKNOWN();
                ec0.h0 h0VarRedact = temp_zone_unknown != null ? ec0.h0.f62622b.redact(temp_zone_unknown) : null;
                ec0.h0 temp_zone_front_left = value.getTEMP_ZONE_FRONT_LEFT();
                ec0.h0 h0VarRedact2 = temp_zone_front_left != null ? ec0.h0.f62622b.redact(temp_zone_front_left) : null;
                ec0.h0 temp_zone_front_right = value.getTEMP_ZONE_FRONT_RIGHT();
                ec0.h0 h0VarRedact3 = temp_zone_front_right != null ? ec0.h0.f62622b.redact(temp_zone_front_right) : null;
                ec0.h0 temp_zone_rear = value.getTEMP_ZONE_REAR();
                return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, temp_zone_rear != null ? ec0.h0.f62622b.redact(temp_zone_rear) : null, okio.k.f97943e);
            }
        }

        public c() {
            this(null, null, null, null, null, 31, null);
        }

        public final c a(ec0.h0 TEMP_ZONE_UNKNOWN, ec0.h0 TEMP_ZONE_FRONT_LEFT, ec0.h0 TEMP_ZONE_FRONT_RIGHT, ec0.h0 TEMP_ZONE_REAR, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(TEMP_ZONE_UNKNOWN, TEMP_ZONE_FRONT_LEFT, TEMP_ZONE_FRONT_RIGHT, TEMP_ZONE_REAR, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getTEMP_ZONE_FRONT_LEFT() {
            return this.TEMP_ZONE_FRONT_LEFT;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getTEMP_ZONE_FRONT_RIGHT() {
            return this.TEMP_ZONE_FRONT_RIGHT;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getTEMP_ZONE_REAR() {
            return this.TEMP_ZONE_REAR;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ec0.h0 getTEMP_ZONE_UNKNOWN() {
            return this.TEMP_ZONE_UNKNOWN;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.TEMP_ZONE_UNKNOWN, cVar.TEMP_ZONE_UNKNOWN) && p013kotlin.jvm.internal.s.f(this.TEMP_ZONE_FRONT_LEFT, cVar.TEMP_ZONE_FRONT_LEFT) && p013kotlin.jvm.internal.s.f(this.TEMP_ZONE_FRONT_RIGHT, cVar.TEMP_ZONE_FRONT_RIGHT) && p013kotlin.jvm.internal.s.f(this.TEMP_ZONE_REAR, cVar.TEMP_ZONE_REAR);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.TEMP_ZONE_UNKNOWN;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.TEMP_ZONE_FRONT_LEFT;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.TEMP_ZONE_FRONT_RIGHT;
            int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
            ec0.h0 h0Var4 = this.TEMP_ZONE_REAR;
            int iHashCode5 = iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0);
            this.hashCode = iHashCode5;
            return iHashCode5;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m365newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.TEMP_ZONE_UNKNOWN;
            if (h0Var != null) {
                arrayList.add("TEMP_ZONE_UNKNOWN=" + h0Var);
            }
            ec0.h0 h0Var2 = this.TEMP_ZONE_FRONT_LEFT;
            if (h0Var2 != null) {
                arrayList.add("TEMP_ZONE_FRONT_LEFT=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.TEMP_ZONE_FRONT_RIGHT;
            if (h0Var3 != null) {
                arrayList.add("TEMP_ZONE_FRONT_RIGHT=" + h0Var3);
            }
            ec0.h0 h0Var4 = this.TEMP_ZONE_REAR;
            if (h0Var4 != null) {
                arrayList.add("TEMP_ZONE_REAR=" + h0Var4);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "HvacTemperatureZone{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m365newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, okio.k unknownFields) {
            super(f65571f, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.TEMP_ZONE_UNKNOWN = h0Var;
            this.TEMP_ZONE_FRONT_LEFT = h0Var2;
            this.TEMP_ZONE_FRONT_RIGHT = h0Var3;
            this.TEMP_ZONE_REAR = h0Var4;
            if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, new Object[0]) > 1) {
                throw new IllegalArgumentException("At most one of TEMP_ZONE_UNKNOWN, TEMP_ZONE_FRONT_LEFT, TEMP_ZONE_FRONT_RIGHT, TEMP_ZONE_REAR may be non-null");
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lfc0/x1$d;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "TEMP_UNKNOWN", "TEMP_MIN", "TEMP_MAX", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lfc0/x1$d;", "Lec0/h0;", DateTokenConverter.CONVERTER_KEY, "()Lec0/h0;", "b", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends com.squareup.wire.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ProtoAdapter<d> f65577e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(d.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPUNKNOWN", tag = 1)
        private final ec0.h0 TEMP_UNKNOWN;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPMIN", tag = 2)
        private final ec0.h0 TEMP_MIN;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "TEMPMAX", tag = 3)
        private final ec0.h0 TEMP_MAX;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/x1$d$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/x1$d;", "value", "", "c", "(Lfc0/x1$d;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/x1$d;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/x1$d;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/x1$d;)Lfc0/x1$d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<d> {
            a(com.squareup.wire.b bVar, co0.d<d> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.HvacTemperatureAdjustmentAction.Temperature", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new d(h0VarDecode, h0VarDecode2, h0VarDecode3, reader.e(jD));
                    }
                    if (iG == 1) {
                        h0VarDecode = ec0.h0.f62622b.decode(reader);
                    } else if (iG == 2) {
                        h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                    } else if (iG != 3) {
                        reader.m(iG);
                    } else {
                        h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, d value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getTEMP_UNKNOWN());
                protoAdapter.encodeWithTag(writer, 2, value.getTEMP_MIN());
                protoAdapter.encodeWithTag(writer, 3, value.getTEMP_MAX());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(d value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getTEMP_UNKNOWN()) + protoAdapter.encodedSizeWithTag(2, value.getTEMP_MIN()) + protoAdapter.encodedSizeWithTag(3, value.getTEMP_MAX());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public d redact(d value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 temp_unknown = value.getTEMP_UNKNOWN();
                ec0.h0 h0VarRedact = temp_unknown != null ? ec0.h0.f62622b.redact(temp_unknown) : null;
                ec0.h0 temp_min = value.getTEMP_MIN();
                ec0.h0 h0VarRedact2 = temp_min != null ? ec0.h0.f62622b.redact(temp_min) : null;
                ec0.h0 temp_max = value.getTEMP_MAX();
                return value.a(h0VarRedact, h0VarRedact2, temp_max != null ? ec0.h0.f62622b.redact(temp_max) : null, okio.k.f97943e);
            }
        }

        public d() {
            this(null, null, null, null, 15, null);
        }

        public final d a(ec0.h0 TEMP_UNKNOWN, ec0.h0 TEMP_MIN, ec0.h0 TEMP_MAX, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new d(TEMP_UNKNOWN, TEMP_MIN, TEMP_MAX, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getTEMP_MAX() {
            return this.TEMP_MAX;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getTEMP_MIN() {
            return this.TEMP_MIN;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getTEMP_UNKNOWN() {
            return this.TEMP_UNKNOWN;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), dVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.TEMP_UNKNOWN, dVar.TEMP_UNKNOWN) && p013kotlin.jvm.internal.s.f(this.TEMP_MIN, dVar.TEMP_MIN) && p013kotlin.jvm.internal.s.f(this.TEMP_MAX, dVar.TEMP_MAX);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.TEMP_UNKNOWN;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.TEMP_MIN;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.TEMP_MAX;
            int iHashCode4 = iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m366newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.TEMP_UNKNOWN;
            if (h0Var != null) {
                arrayList.add("TEMP_UNKNOWN=" + h0Var);
            }
            ec0.h0 h0Var2 = this.TEMP_MIN;
            if (h0Var2 != null) {
                arrayList.add("TEMP_MIN=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.TEMP_MAX;
            if (h0Var3 != null) {
                arrayList.add("TEMP_MAX=" + h0Var3);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "Temperature{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ d(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m366newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, okio.k unknownFields) {
            super(f65577e, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.TEMP_UNKNOWN = h0Var;
            this.TEMP_MIN = h0Var2;
            this.TEMP_MAX = h0Var3;
            if (x20.d.d(h0Var, h0Var2, h0Var3) > 1) {
                throw new IllegalArgumentException("At most one of TEMP_UNKNOWN, TEMP_MIN, TEMP_MAX may be non-null");
            }
        }
    }

    public x1() {
        this(BitmapDescriptorFactory.HUE_RED, 0, BitmapDescriptorFactory.HUE_RED, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x1 b(x1 x1Var, float f11, int i11, float f12, d dVar, List list, float f13, float f14, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            f11 = x1Var.delta_celsius;
        }
        if ((i12 & 2) != 0) {
            i11 = x1Var.delta_percent;
        }
        if ((i12 & 4) != 0) {
            f12 = x1Var.absolute_celsius;
        }
        if ((i12 & 8) != 0) {
            dVar = x1Var.level;
        }
        if ((i12 & 16) != 0) {
            list = x1Var.hvac_temperature_zone;
        }
        if ((i12 & 32) != 0) {
            f13 = x1Var.driver_temp_celsius;
        }
        if ((i12 & 64) != 0) {
            f14 = x1Var.passenger_temp_celsius;
        }
        if ((i12 & 128) != 0) {
            kVar = x1Var.unknownFields();
        }
        float f15 = f14;
        okio.k kVar2 = kVar;
        List list2 = list;
        float f16 = f13;
        return x1Var.a(f11, i11, f12, dVar, list2, f16, f15, kVar2);
    }

    public final x1 a(float delta_celsius, int delta_percent, float absolute_celsius, d level, List<c> hvac_temperature_zone, float driver_temp_celsius, float passenger_temp_celsius, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(hvac_temperature_zone, "hvac_temperature_zone");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new x1(delta_celsius, delta_percent, absolute_celsius, level, hvac_temperature_zone, driver_temp_celsius, passenger_temp_celsius, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getAbsolute_celsius() {
        return this.absolute_celsius;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getDelta_celsius() {
        return this.delta_celsius;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDelta_percent() {
        return this.delta_percent;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), x1Var.unknownFields()) && this.delta_celsius == x1Var.delta_celsius && this.delta_percent == x1Var.delta_percent && this.absolute_celsius == x1Var.absolute_celsius && p013kotlin.jvm.internal.s.f(this.level, x1Var.level) && p013kotlin.jvm.internal.s.f(this.hvac_temperature_zone, x1Var.hvac_temperature_zone) && this.driver_temp_celsius == x1Var.driver_temp_celsius && this.passenger_temp_celsius == x1Var.passenger_temp_celsius;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDriver_temp_celsius() {
        return this.driver_temp_celsius;
    }

    public final List<c> g() {
        return this.hvac_temperature_zone;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final d getLevel() {
        return this.level;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + Float.hashCode(this.delta_celsius)) * 37) + Integer.hashCode(this.delta_percent)) * 37) + Float.hashCode(this.absolute_celsius)) * 37;
        d dVar = this.level;
        int iHashCode2 = ((((((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 37) + this.hvac_temperature_zone.hashCode()) * 37) + Float.hashCode(this.driver_temp_celsius)) * 37) + Float.hashCode(this.passenger_temp_celsius);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getPassenger_temp_celsius() {
        return this.passenger_temp_celsius;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m364newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("delta_celsius=" + this.delta_celsius);
        arrayList.add("delta_percent=" + this.delta_percent);
        arrayList.add("absolute_celsius=" + this.absolute_celsius);
        d dVar = this.level;
        if (dVar != null) {
            arrayList.add("level=" + dVar);
        }
        if (!this.hvac_temperature_zone.isEmpty()) {
            arrayList.add("hvac_temperature_zone=" + this.hvac_temperature_zone);
        }
        arrayList.add("driver_temp_celsius=" + this.driver_temp_celsius);
        arrayList.add("passenger_temp_celsius=" + this.passenger_temp_celsius);
        return p013kotlin.collections.v.y0(arrayList, ", ", "HvacTemperatureAdjustmentAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ x1(float f11, int i11, float f12, d dVar, List list, float f13, float f14, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0f : f11, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? 0.0f : f12, (i12 & 8) != 0 ? null : dVar, (i12 & 16) != 0 ? p013kotlin.collections.v.m() : list, (i12 & 32) != 0 ? 0.0f : f13, (i12 & 64) != 0 ? 0.0f : f14, (i12 & 128) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m364newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(float f11, int i11, float f12, d dVar, List<c> hvac_temperature_zone, float f13, float f14, okio.k unknownFields) {
        super(f65562i, unknownFields);
        p013kotlin.jvm.internal.s.k(hvac_temperature_zone, "hvac_temperature_zone");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.delta_celsius = f11;
        this.delta_percent = i11;
        this.absolute_celsius = f12;
        this.level = dVar;
        this.driver_temp_celsius = f13;
        this.passenger_temp_celsius = f14;
        this.hvac_temperature_zone = x20.d.g("hvac_temperature_zone", hvac_temperature_zone);
    }
}
