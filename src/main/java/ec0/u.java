package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lec0/u;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "None", "Base", "Gentherm", "Executive", "BaseModelX", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lec0/u;", "Lec0/h0;", "f", "()Lec0/h0;", "b", "c", "e", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<u> f62754g = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(u.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final h0 None;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final h0 Base;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final h0 Gentherm;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final h0 Executive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
    private final h0 BaseModelX;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/u$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/u;", "value", "", "c", "(Lec0/u;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/u;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/u;", DateTokenConverter.CONVERTER_KEY, "(Lec0/u;)Lec0/u;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<u> {
        a(com.squareup.wire.b bVar, co0.d<u> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.RearSeatHeaters", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            h0 h0VarDecode = null;
            h0 h0VarDecode2 = null;
            h0 h0VarDecode3 = null;
            h0 h0VarDecode4 = null;
            h0 h0VarDecode5 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new u(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, reader.e(jD));
                }
                if (iG == 1) {
                    h0VarDecode = h0.f62622b.decode(reader);
                } else if (iG == 2) {
                    h0VarDecode2 = h0.f62622b.decode(reader);
                } else if (iG == 3) {
                    h0VarDecode4 = h0.f62622b.decode(reader);
                } else if (iG == 4) {
                    h0VarDecode3 = h0.f62622b.decode(reader);
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    h0VarDecode5 = h0.f62622b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, u value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getNone());
            protoAdapter.encodeWithTag(writer, 2, value.getBase());
            protoAdapter.encodeWithTag(writer, 4, value.getGentherm());
            protoAdapter.encodeWithTag(writer, 3, value.getExecutive());
            protoAdapter.encodeWithTag(writer, 5, value.getBaseModelX());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(u value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getNone()) + protoAdapter.encodedSizeWithTag(2, value.getBase()) + protoAdapter.encodedSizeWithTag(4, value.getGentherm()) + protoAdapter.encodedSizeWithTag(3, value.getExecutive()) + protoAdapter.encodedSizeWithTag(5, value.getBaseModelX());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u redact(u value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 none = value.getNone();
            h0 h0VarRedact = none != null ? h0.f62622b.redact(none) : null;
            h0 base = value.getBase();
            h0 h0VarRedact2 = base != null ? h0.f62622b.redact(base) : null;
            h0 gentherm = value.getGentherm();
            h0 h0VarRedact3 = gentherm != null ? h0.f62622b.redact(gentherm) : null;
            h0 executive = value.getExecutive();
            h0 h0VarRedact4 = executive != null ? h0.f62622b.redact(executive) : null;
            h0 baseModelX = value.getBaseModelX();
            return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, baseModelX != null ? h0.f62622b.redact(baseModelX) : null, okio.k.f97943e);
        }
    }

    public u() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final u a(h0 None, h0 Base, h0 Gentherm, h0 Executive, h0 BaseModelX, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new u(None, Base, Gentherm, Executive, BaseModelX, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getBase() {
        return this.Base;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getBaseModelX() {
        return this.BaseModelX;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getExecutive() {
        return this.Executive;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getGentherm() {
        return this.Gentherm;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), uVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.None, uVar.None) && p013kotlin.jvm.internal.s.f(this.Base, uVar.Base) && p013kotlin.jvm.internal.s.f(this.Gentherm, uVar.Gentherm) && p013kotlin.jvm.internal.s.f(this.Executive, uVar.Executive) && p013kotlin.jvm.internal.s.f(this.BaseModelX, uVar.BaseModelX);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h0 getNone() {
        return this.None;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.None;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.Base;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.Gentherm;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        h0 h0Var4 = this.Executive;
        int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        h0 h0Var5 = this.BaseModelX;
        int iHashCode6 = iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m155newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.None;
        if (h0Var != null) {
            arrayList.add("None=" + h0Var);
        }
        h0 h0Var2 = this.Base;
        if (h0Var2 != null) {
            arrayList.add("Base=" + h0Var2);
        }
        h0 h0Var3 = this.Gentherm;
        if (h0Var3 != null) {
            arrayList.add("Gentherm=" + h0Var3);
        }
        h0 h0Var4 = this.Executive;
        if (h0Var4 != null) {
            arrayList.add("Executive=" + h0Var4);
        }
        h0 h0Var5 = this.BaseModelX;
        if (h0Var5 != null) {
            arrayList.add("BaseModelX=" + h0Var5);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "RearSeatHeaters{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ u(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m155newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, okio.k unknownFields) {
        super(f62754g, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.None = h0Var;
        this.Base = h0Var2;
        this.Gentherm = h0Var3;
        this.Executive = h0Var4;
        this.BaseModelX = h0Var5;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5) > 1) {
            throw new IllegalArgumentException("At most one of None, Base, Gentherm, Executive, BaseModelX may be non-null");
        }
    }
}
