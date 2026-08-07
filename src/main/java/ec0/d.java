package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Lec0/d;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "US", "EU", "GB", "CCS", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lec0/d;", "Lec0/h0;", "e", "()Lec0/h0;", "b", "c", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<d> f62582f = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(d.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final h0 US;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final h0 EU;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final h0 GB;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final h0 CCS;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/d$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/d;", "value", "", "c", "(Lec0/d;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/d;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/d;", DateTokenConverter.CONVERTER_KEY, "(Lec0/d;)Lec0/d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, co0.d<d> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargePortType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            h0 h0VarDecode = null;
            h0 h0VarDecode2 = null;
            h0 h0VarDecode3 = null;
            h0 h0VarDecode4 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new d(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, reader.e(jD));
                }
                if (iG == 1) {
                    h0VarDecode = h0.f62622b.decode(reader);
                } else if (iG == 2) {
                    h0VarDecode2 = h0.f62622b.decode(reader);
                } else if (iG == 3) {
                    h0VarDecode3 = h0.f62622b.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    h0VarDecode4 = h0.f62622b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, d value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getUS());
            protoAdapter.encodeWithTag(writer, 2, value.getEU());
            protoAdapter.encodeWithTag(writer, 3, value.getGB());
            protoAdapter.encodeWithTag(writer, 4, value.getCCS());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(d value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getUS()) + protoAdapter.encodedSizeWithTag(2, value.getEU()) + protoAdapter.encodedSizeWithTag(3, value.getGB()) + protoAdapter.encodedSizeWithTag(4, value.getCCS());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d redact(d value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 us2 = value.getUS();
            h0 h0VarRedact = us2 != null ? h0.f62622b.redact(us2) : null;
            h0 eu2 = value.getEU();
            h0 h0VarRedact2 = eu2 != null ? h0.f62622b.redact(eu2) : null;
            h0 gb2 = value.getGB();
            h0 h0VarRedact3 = gb2 != null ? h0.f62622b.redact(gb2) : null;
            h0 ccs = value.getCCS();
            return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, ccs != null ? h0.f62622b.redact(ccs) : null, okio.k.f97943e);
        }
    }

    public d() {
        this(null, null, null, null, null, 31, null);
    }

    public final d a(h0 US, h0 EU, h0 GB, h0 CCS, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new d(US, EU, GB, CCS, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getCCS() {
        return this.CCS;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getEU() {
        return this.EU;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getGB() {
        return this.GB;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getUS() {
        return this.US;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), dVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.US, dVar.US) && p013kotlin.jvm.internal.s.f(this.EU, dVar.EU) && p013kotlin.jvm.internal.s.f(this.GB, dVar.GB) && p013kotlin.jvm.internal.s.f(this.CCS, dVar.CCS);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.US;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.EU;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.GB;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        h0 h0Var4 = this.CCS;
        int iHashCode5 = iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m140newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.US;
        if (h0Var != null) {
            arrayList.add("US=" + h0Var);
        }
        h0 h0Var2 = this.EU;
        if (h0Var2 != null) {
            arrayList.add("EU=" + h0Var2);
        }
        h0 h0Var3 = this.GB;
        if (h0Var3 != null) {
            arrayList.add("GB=" + h0Var3);
        }
        h0 h0Var4 = this.CCS;
        if (h0Var4 != null) {
            arrayList.add("CCS=" + h0Var4);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ChargePortType{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ d(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m140newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, okio.k unknownFields) {
        super(f62582f, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.US = h0Var;
        this.EU = h0Var2;
        this.GB = h0Var3;
        this.CCS = h0Var4;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of US, EU, GB, CCS may be non-null");
        }
    }
}
