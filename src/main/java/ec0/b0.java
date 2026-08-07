package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lec0/b0;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "None", "Gen1", "Gen2", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lec0/b0;", "Lec0/h0;", DateTokenConverter.CONVERTER_KEY, "()Lec0/h0;", "b", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<b0> f62571e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final h0 None;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final h0 Gen1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final h0 Gen2;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/b0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/b0;", "value", "", "c", "(Lec0/b0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/b0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/b0;", DateTokenConverter.CONVERTER_KEY, "(Lec0/b0;)Lec0/b0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b0> {
        a(com.squareup.wire.b bVar, co0.d<b0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SunRoofType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            h0 h0VarDecode = null;
            h0 h0VarDecode2 = null;
            h0 h0VarDecode3 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b0(h0VarDecode, h0VarDecode2, h0VarDecode3, reader.e(jD));
                }
                if (iG == 1) {
                    h0VarDecode = h0.f62622b.decode(reader);
                } else if (iG == 2) {
                    h0VarDecode2 = h0.f62622b.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    h0VarDecode3 = h0.f62622b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, b0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getNone());
            protoAdapter.encodeWithTag(writer, 2, value.getGen1());
            protoAdapter.encodeWithTag(writer, 3, value.getGen2());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getNone()) + protoAdapter.encodedSizeWithTag(2, value.getGen1()) + protoAdapter.encodedSizeWithTag(3, value.getGen2());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b0 redact(b0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 none = value.getNone();
            h0 h0VarRedact = none != null ? h0.f62622b.redact(none) : null;
            h0 gen1 = value.getGen1();
            h0 h0VarRedact2 = gen1 != null ? h0.f62622b.redact(gen1) : null;
            h0 gen2 = value.getGen2();
            return value.a(h0VarRedact, h0VarRedact2, gen2 != null ? h0.f62622b.redact(gen2) : null, okio.k.f97943e);
        }
    }

    public b0() {
        this(null, null, null, null, 15, null);
    }

    public final b0 a(h0 None, h0 Gen1, h0 Gen2, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new b0(None, Gen1, Gen2, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getGen1() {
        return this.Gen1;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getGen2() {
        return this.Gen2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getNone() {
        return this.None;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), b0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.None, b0Var.None) && p013kotlin.jvm.internal.s.f(this.Gen1, b0Var.Gen1) && p013kotlin.jvm.internal.s.f(this.Gen2, b0Var.Gen2);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.None;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.Gen1;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.Gen2;
        int iHashCode4 = iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m138newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.None;
        if (h0Var != null) {
            arrayList.add("None=" + h0Var);
        }
        h0 h0Var2 = this.Gen1;
        if (h0Var2 != null) {
            arrayList.add("Gen1=" + h0Var2);
        }
        h0 h0Var3 = this.Gen2;
        if (h0Var3 != null) {
            arrayList.add("Gen2=" + h0Var3);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "SunRoofType{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b0(h0 h0Var, h0 h0Var2, h0 h0Var3, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m138newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h0 h0Var, h0 h0Var2, h0 h0Var3, okio.k unknownFields) {
        super(f62571e, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.None = h0Var;
        this.Gen1 = h0Var2;
        this.Gen2 = h0Var3;
        if (x20.d.d(h0Var, h0Var2, h0Var3) > 1) {
            throw new IllegalArgumentException("At most one of None, Gen1, Gen2 may be non-null");
        }
    }
}
