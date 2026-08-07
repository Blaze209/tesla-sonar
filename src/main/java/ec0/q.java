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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u001b\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJg\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b)\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b(\u0010,R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b-\u00100R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b.\u00100¨\u00061"}, d2 = {"Lec0/q;", "Lcom/squareup/wire/f;", "", "", "id", "", "name", "", "days_of_week", "precondition_time", "", "one_time", "enabled", "", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "Lokio/k;", "unknownFields", "<init>", "(JLjava/lang/String;IIZZFFLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(JLjava/lang/String;IIZZFFLokio/k;)Lec0/q;", "J", "e", "()J", "b", "Ljava/lang/String;", "getName", "c", "I", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "Z", "h", "()Z", "f", "g", Gender.FEMALE, "()F", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends com.squareup.wire.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<q> f62729j = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(q.class), com.squareup.wire.o.PROTO_3);

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
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "preconditionTime", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int precondition_time;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "oneTime", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final boolean one_time;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final boolean enabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final float latitude;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final float longitude;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/q$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/q;", "value", "", "c", "(Lec0/q;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/q;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/q;", DateTokenConverter.CONVERTER_KEY, "(Lec0/q;)Lec0/q;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<q> {
        a(com.squareup.wire.b bVar, co0.d<q> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PreconditionSchedule", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            long jLongValue = 0;
            int iIntValue = 0;
            int iIntValue2 = 0;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new q(jLongValue, strDecode, iIntValue, iIntValue2, zBooleanValue, zBooleanValue2, fFloatValue, fFloatValue2, reader.e(jD));
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
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 5:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 6:
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 7:
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        break;
                    case 8:
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
        public void encode(com.squareup.wire.l writer, q value) {
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
            if (value.getPrecondition_time() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 4, Integer.valueOf(value.getPrecondition_time()));
            }
            if (value.getOne_time()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, Boolean.valueOf(value.getOne_time()));
            }
            if (value.getEnabled()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getEnabled()));
            }
            if (value.getLatitude() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 7, Float.valueOf(value.getLatitude()));
            }
            if (value.getLongitude() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 8, Float.valueOf(value.getLongitude()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(q value) {
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
            if (value.getPrecondition_time() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(value.getPrecondition_time()));
            }
            if (value.getOne_time()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getOne_time()));
            }
            if (value.getEnabled()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getEnabled()));
            }
            if (value.getLatitude() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(7, Float.valueOf(value.getLatitude()));
            }
            return value.getLongitude() == BitmapDescriptorFactory.HUE_RED ? iD : iD + ProtoAdapter.FLOAT.encodedSizeWithTag(8, Float.valueOf(value.getLongitude()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public q redact(q value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return q.b(value, 0L, null, 0, 0, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, okio.k.f97943e, 255, null);
        }
    }

    public q() {
        this(0L, null, 0, 0, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 511, null);
    }

    public static /* synthetic */ q b(q qVar, long j11, String str, int i11, int i12, boolean z11, boolean z12, float f11, float f12, okio.k kVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = qVar.id;
        }
        long j12 = j11;
        if ((i13 & 2) != 0) {
            str = qVar.name;
        }
        String str2 = str;
        if ((i13 & 4) != 0) {
            i11 = qVar.days_of_week;
        }
        return qVar.a(j12, str2, i11, (i13 & 8) != 0 ? qVar.precondition_time : i12, (i13 & 16) != 0 ? qVar.one_time : z11, (i13 & 32) != 0 ? qVar.enabled : z12, (i13 & 64) != 0 ? qVar.latitude : f11, (i13 & 128) != 0 ? qVar.longitude : f12, (i13 & 256) != 0 ? qVar.unknownFields() : kVar);
    }

    public final q a(long id2, String name, int days_of_week, int precondition_time, boolean one_time, boolean enabled, float latitude, float longitude, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new q(id2, name, days_of_week, precondition_time, one_time, enabled, latitude, longitude, unknownFields);
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
    public final long getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof q)) {
            return false;
        }
        q qVar = (q) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), qVar.unknownFields()) && this.id == qVar.id && p013kotlin.jvm.internal.s.f(this.name, qVar.name) && this.days_of_week == qVar.days_of_week && this.precondition_time == qVar.precondition_time && this.one_time == qVar.one_time && this.enabled == qVar.enabled && this.latitude == qVar.latitude && this.longitude == qVar.longitude;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getOne_time() {
        return this.one_time;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + Long.hashCode(this.id)) * 37) + this.name.hashCode()) * 37) + Integer.hashCode(this.days_of_week)) * 37) + Integer.hashCode(this.precondition_time)) * 37) + Boolean.hashCode(this.one_time)) * 37) + Boolean.hashCode(this.enabled)) * 37) + Float.hashCode(this.latitude)) * 37) + Float.hashCode(this.longitude);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPrecondition_time() {
        return this.precondition_time;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m152newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("name=" + x20.d.i(this.name));
        arrayList.add("days_of_week=" + this.days_of_week);
        arrayList.add("precondition_time=" + this.precondition_time);
        arrayList.add("one_time=" + this.one_time);
        arrayList.add("enabled=" + this.enabled);
        arrayList.add("latitude=" + this.latitude);
        arrayList.add("longitude=" + this.longitude);
        return p013kotlin.collections.v.y0(arrayList, ", ", "PreconditionSchedule{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ q(long j11, String str, int i11, int i12, boolean z11, boolean z12, float f11, float f12, okio.k kVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j11, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? false : z11, (i13 & 32) != 0 ? false : z12, (i13 & 64) != 0 ? 0.0f : f11, (i13 & 128) != 0 ? 0.0f : f12, (i13 & 256) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m152newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(long j11, String name, int i11, int i12, boolean z11, boolean z12, float f11, float f12, okio.k unknownFields) {
        super(f62729j, unknownFields);
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.id = j11;
        this.name = name;
        this.days_of_week = i11;
        this.precondition_time = i12;
        this.one_time = z11;
        this.enabled = z12;
        this.latitude = f11;
        this.longitude = f12;
    }
}
