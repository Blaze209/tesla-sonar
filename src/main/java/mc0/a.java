package mc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lmc0/a;", "Lcom/squareup/wire/f;", "", "", "max_excess_solar_power_w", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/Float;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/Float;Lokio/k;)Lmc0/a;", "Ljava/lang/Float;", "c", "()Ljava/lang/Float;", "b", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends com.squareup.wire.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProtoAdapter<a> f91765c = new C1959a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(a.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxExcessSolarPowerW", tag = 1)
    private final Float max_excess_solar_power_w;

    /* JADX INFO: renamed from: mc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"mc0/a$a", "Lcom/squareup/wire/ProtoAdapter;", "Lmc0/a;", "value", "", "c", "(Lmc0/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lmc0/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lmc0/a;", DateTokenConverter.CONVERTER_KEY, "(Lmc0/a;)Lmc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1959a extends ProtoAdapter<a> {
        C1959a(com.squareup.wire.b bVar, co0.d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/ManagedCharging.ChargeOnSolarLimits", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            Float fDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a(fDecode, reader.e(jD));
                }
                if (iG == 1) {
                    fDecode = ProtoAdapter.FLOAT.decode(reader);
                } else {
                    reader.m(iG);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, a value) {
            s.k(writer, "writer");
            s.k(value, "value");
            ProtoAdapter.FLOAT.encodeWithTag(writer, 1, value.getMax_excess_solar_power_w());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a value) {
            s.k(value, "value");
            return value.unknownFields().D() + ProtoAdapter.FLOAT.encodedSizeWithTag(1, value.getMax_excess_solar_power_w());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            s.k(value, "value");
            return a.b(value, null, okio.k.f97943e, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ a b(a aVar, Float f11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = aVar.max_excess_solar_power_w;
        }
        if ((i11 & 2) != 0) {
            kVar = aVar.unknownFields();
        }
        return aVar.a(f11, kVar);
    }

    public final a a(Float max_excess_solar_power_w, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new a(max_excess_solar_power_w, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getMax_excess_solar_power_w() {
        return this.max_excess_solar_power_w;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(unknownFields(), aVar.unknownFields()) && s.e(this.max_excess_solar_power_w, aVar.max_excess_solar_power_w);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Float f11 = this.max_excess_solar_power_w;
        int iHashCode2 = iHashCode + (f11 != null ? f11.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m592newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Float f11 = this.max_excess_solar_power_w;
        if (f11 != null) {
            arrayList.add("max_excess_solar_power_w=" + f11);
        }
        return v.y0(arrayList, ", ", "ChargeOnSolarLimits{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(Float f11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : f11, (i11 & 2) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m592newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Float f11, okio.k unknownFields) {
        super(f91765c, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.max_excess_solar_power_w = f11;
    }
}
