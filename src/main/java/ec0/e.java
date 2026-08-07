package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001e\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u007f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0085\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010\u001eR\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b/\u0010.R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b1\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.R\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b+\u0010.R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00105\u001a\u0004\b2\u00106R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u00105\u001a\u0004\b4\u00106¨\u00067"}, d2 = {"Lec0/e;", "Lcom/squareup/wire/f;", "", "", "id", "", "name", "", "days_of_week", "", "start_enabled", "start_time", "end_enabled", "end_time", "one_time", "enabled", "", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "Lokio/k;", "unknownFields", "<init>", "(JLjava/lang/String;IZIZIZZFFLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(JLjava/lang/String;IZIZIZZFFLokio/k;)Lec0/e;", "J", "g", "()J", "b", "Ljava/lang/String;", "getName", "c", "I", DateTokenConverter.CONVERTER_KEY, "Z", "k", "()Z", "e", "l", "f", "h", "j", IntegerTokenConverter.CONVERTER_KEY, Gender.FEMALE, "()F", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.squareup.wire.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ProtoAdapter<e> f62588m = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(e.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "daysOfWeek", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int days_of_week;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "startEnabled", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final boolean start_enabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "startTime", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int start_time;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "endEnabled", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final boolean end_enabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "endTime", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final int end_time;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "oneTime", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final boolean one_time;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final boolean enabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final float latitude;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final float longitude;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/e;", "value", "", "c", "(Lec0/e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/e;", DateTokenConverter.CONVERTER_KEY, "(Lec0/e;)Lec0/e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, co0.d<e> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargeSchedule", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            long jLongValue = 0;
            int iIntValue = 0;
            boolean zBooleanValue = false;
            int iIntValue2 = 0;
            boolean zBooleanValue2 = false;
            int iIntValue3 = 0;
            boolean zBooleanValue3 = false;
            boolean zBooleanValue4 = false;
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e(jLongValue, strDecode, iIntValue, zBooleanValue, iIntValue2, zBooleanValue2, iIntValue3, zBooleanValue3, zBooleanValue4, fFloatValue, fFloatValue2, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        jLongValue = ProtoAdapter.UINT64.decode(reader).longValue();
                        break;
                    case 2:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 4:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 5:
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 6:
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 7:
                        iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 8:
                        zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 9:
                        zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 10:
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 11:
                        fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, e value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getId() != 0) {
                ProtoAdapter.UINT64.encodeWithTag(writer, 1, Long.valueOf(value.getId()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getName(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getName());
            }
            if (value.getDays_of_week() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getDays_of_week()));
            }
            if (value.getStart_enabled()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getStart_enabled()));
            }
            if (value.getStart_time() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getStart_time()));
            }
            if (value.getEnd_enabled()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getEnd_enabled()));
            }
            if (value.getEnd_time() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 7, Integer.valueOf(value.getEnd_time()));
            }
            if (value.getOne_time()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getOne_time()));
            }
            if (value.getEnabled()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 9, Boolean.valueOf(value.getEnabled()));
            }
            if (value.getLatitude() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 10, Float.valueOf(value.getLatitude()));
            }
            if (value.getLongitude() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 11, Float.valueOf(value.getLongitude()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getId() != 0) {
                iD += ProtoAdapter.UINT64.encodedSizeWithTag(1, Long.valueOf(value.getId()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getName(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
            }
            if (value.getDays_of_week() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getDays_of_week()));
            }
            if (value.getStart_enabled()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getStart_enabled()));
            }
            if (value.getStart_time() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getStart_time()));
            }
            if (value.getEnd_enabled()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getEnd_enabled()));
            }
            if (value.getEnd_time() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(7, Integer.valueOf(value.getEnd_time()));
            }
            if (value.getOne_time()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getOne_time()));
            }
            if (value.getEnabled()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getEnabled()));
            }
            if (value.getLatitude() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(10, Float.valueOf(value.getLatitude()));
            }
            return value.getLongitude() == BitmapDescriptorFactory.HUE_RED ? iD : iD + ProtoAdapter.FLOAT.encodedSizeWithTag(11, Float.valueOf(value.getLongitude()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e redact(e value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return e.b(value, 0L, null, 0, false, 0, false, 0, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, okio.k.f97943e, 2047, null);
        }
    }

    public e() {
        this(0L, null, 0, false, 0, false, 0, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 4095, null);
    }

    public static /* synthetic */ e b(e eVar, long j11, String str, int i11, boolean z11, int i12, boolean z12, int i13, boolean z13, boolean z14, float f11, float f12, okio.k kVar, int i14, Object obj) {
        return eVar.a((i14 & 1) != 0 ? eVar.id : j11, (i14 & 2) != 0 ? eVar.name : str, (i14 & 4) != 0 ? eVar.days_of_week : i11, (i14 & 8) != 0 ? eVar.start_enabled : z11, (i14 & 16) != 0 ? eVar.start_time : i12, (i14 & 32) != 0 ? eVar.end_enabled : z12, (i14 & 64) != 0 ? eVar.end_time : i13, (i14 & 128) != 0 ? eVar.one_time : z13, (i14 & 256) != 0 ? eVar.enabled : z14, (i14 & 512) != 0 ? eVar.latitude : f11, (i14 & 1024) != 0 ? eVar.longitude : f12, (i14 & 2048) != 0 ? eVar.unknownFields() : kVar);
    }

    public final e a(long id2, String name, int days_of_week, boolean start_enabled, int start_time, boolean end_enabled, int end_time, boolean one_time, boolean enabled, float latitude, float longitude, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new e(id2, name, days_of_week, start_enabled, start_time, end_enabled, end_time, one_time, enabled, latitude, longitude, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDays_of_week() {
        return this.days_of_week;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getEnd_enabled() {
        return this.end_enabled;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), eVar.unknownFields()) && this.id == eVar.id && p013kotlin.jvm.internal.s.f(this.name, eVar.name) && this.days_of_week == eVar.days_of_week && this.start_enabled == eVar.start_enabled && this.start_time == eVar.start_time && this.end_enabled == eVar.end_enabled && this.end_time == eVar.end_time && this.one_time == eVar.one_time && this.enabled == eVar.enabled && this.latitude == eVar.latitude && this.longitude == eVar.longitude;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.id)) * 37) + this.name.hashCode()) * 37) + Integer.hashCode(this.days_of_week)) * 37) + Boolean.hashCode(this.start_enabled)) * 37) + Integer.hashCode(this.start_time)) * 37) + Boolean.hashCode(this.end_enabled)) * 37) + Integer.hashCode(this.end_time)) * 37) + Boolean.hashCode(this.one_time)) * 37) + Boolean.hashCode(this.enabled)) * 37) + Float.hashCode(this.latitude)) * 37) + Float.hashCode(this.longitude);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getOne_time() {
        return this.one_time;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getStart_enabled() {
        return this.start_enabled;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getStart_time() {
        return this.start_time;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m141newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("name=" + x20.d.i(this.name));
        arrayList.add("days_of_week=" + this.days_of_week);
        arrayList.add("start_enabled=" + this.start_enabled);
        arrayList.add("start_time=" + this.start_time);
        arrayList.add("end_enabled=" + this.end_enabled);
        arrayList.add("end_time=" + this.end_time);
        arrayList.add("one_time=" + this.one_time);
        arrayList.add("enabled=" + this.enabled);
        arrayList.add("latitude=" + this.latitude);
        arrayList.add("longitude=" + this.longitude);
        return p013kotlin.collections.v.y0(arrayList, ", ", "ChargeSchedule{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e(long j11, String str, int i11, boolean z11, int i12, boolean z12, int i13, boolean z13, boolean z14, float f11, float f12, okio.k kVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j11, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? false : z11, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? false : z12, (i14 & 64) != 0 ? 0 : i13, (i14 & 128) != 0 ? false : z13, (i14 & 256) == 0 ? z14 : false, (i14 & 512) != 0 ? 0.0f : f11, (i14 & 1024) == 0 ? f12 : BitmapDescriptorFactory.HUE_RED, (i14 & 2048) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m141newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j11, String name, int i11, boolean z11, int i12, boolean z12, int i13, boolean z13, boolean z14, float f11, float f12, okio.k unknownFields) {
        super(f62588m, unknownFields);
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.id = j11;
        this.name = name;
        this.days_of_week = i11;
        this.start_enabled = z11;
        this.start_time = i12;
        this.end_enabled = z12;
        this.end_time = i13;
        this.one_time = z13;
        this.enabled = z14;
        this.latitude = f11;
        this.longitude = f12;
    }
}
