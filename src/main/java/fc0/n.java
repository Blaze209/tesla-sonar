package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lfc0/n;", "Lcom/squareup/wire/f;", "", "", "enabled", "", "lower_charge_limit", "upper_charge_limit", "Lokio/k;", "unknownFields", "<init>", "(ZFFLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZFFLokio/k;)Lfc0/n;", "Z", "c", "()Z", "b", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<n> f65250e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(n.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "lowerChargeLimit", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final float lower_charge_limit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "upperChargeLimit", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final float upper_charge_limit;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/n$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/n;", "value", "", "c", "(Lfc0/n;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/n;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/n;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/n;)Lfc0/n;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<n> {
        a(com.squareup.wire.b bVar, co0.d<n> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargeOnSolarFeature", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            boolean zBooleanValue = false;
            float fFloatValue = BitmapDescriptorFactory.HUE_RED;
            float fFloatValue2 = 0.0f;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new n(zBooleanValue, fFloatValue, fFloatValue2, reader.e(jD));
                }
                if (iG == 1) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 2) {
                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, n value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getEnabled()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getEnabled()));
            }
            if (value.getLower_charge_limit() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, Float.valueOf(value.getLower_charge_limit()));
            }
            if (value.getUpper_charge_limit() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.getUpper_charge_limit()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(n value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getEnabled()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getEnabled()));
            }
            if (value.getLower_charge_limit() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getLower_charge_limit()));
            }
            return value.getUpper_charge_limit() == BitmapDescriptorFactory.HUE_RED ? iD : iD + ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getUpper_charge_limit()));
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n redact(n value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return n.b(value, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, okio.k.f97943e, 7, null);
        }
    }

    public n() {
        this(false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 15, null);
    }

    public static /* synthetic */ n b(n nVar, boolean z11, float f11, float f12, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = nVar.enabled;
        }
        if ((i11 & 2) != 0) {
            f11 = nVar.lower_charge_limit;
        }
        if ((i11 & 4) != 0) {
            f12 = nVar.upper_charge_limit;
        }
        if ((i11 & 8) != 0) {
            kVar = nVar.unknownFields();
        }
        return nVar.a(z11, f11, f12, kVar);
    }

    public final n a(boolean enabled, float lower_charge_limit, float upper_charge_limit, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new n(enabled, lower_charge_limit, upper_charge_limit, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getLower_charge_limit() {
        return this.lower_charge_limit;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getUpper_charge_limit() {
        return this.upper_charge_limit;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), nVar.unknownFields()) && this.enabled == nVar.enabled && this.lower_charge_limit == nVar.lower_charge_limit && this.upper_charge_limit == nVar.upper_charge_limit;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.enabled)) * 37) + Float.hashCode(this.lower_charge_limit)) * 37) + Float.hashCode(this.upper_charge_limit);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m290newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("enabled=" + this.enabled);
        arrayList.add("lower_charge_limit=" + this.lower_charge_limit);
        arrayList.add("upper_charge_limit=" + this.upper_charge_limit);
        return p013kotlin.collections.v.y0(arrayList, ", ", "ChargeOnSolarFeature{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ n(boolean z11, float f11, float f12, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m290newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z11, float f11, float f12, okio.k unknownFields) {
        super(f65250e, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.enabled = z11;
        this.lower_charge_limit = f11;
        this.upper_charge_limit = f12;
    }
}
