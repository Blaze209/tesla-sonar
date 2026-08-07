package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JG\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Lgc0/q0;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Unknown", "Retracted", "Extended", "Fault", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/q0;", "Lec0/h0;", "e", "()Lec0/h0;", "b", DateTokenConverter.CONVERTER_KEY, "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<q0> f68379f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(q0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final ec0.h0 Unknown;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final ec0.h0 Retracted;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final ec0.h0 Extended;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final ec0.h0 Fault;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/q0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/q0;", "value", "", "c", "(Lgc0/q0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/q0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/q0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/q0;)Lgc0/q0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<q0> {
        a(com.squareup.wire.b bVar, co0.d<q0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SpoilerState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            ec0.h0 h0VarDecode = null;
            ec0.h0 h0VarDecode2 = null;
            ec0.h0 h0VarDecode3 = null;
            ec0.h0 h0VarDecode4 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new q0(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, reader.e(jD));
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
        public void encode(com.squareup.wire.l writer, q0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getUnknown());
            protoAdapter.encodeWithTag(writer, 2, value.getRetracted());
            protoAdapter.encodeWithTag(writer, 3, value.getExtended());
            protoAdapter.encodeWithTag(writer, 4, value.getFault());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(q0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getUnknown()) + protoAdapter.encodedSizeWithTag(2, value.getRetracted()) + protoAdapter.encodedSizeWithTag(3, value.getExtended()) + protoAdapter.encodedSizeWithTag(4, value.getFault());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public q0 redact(q0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.h0 unknown = value.getUnknown();
            ec0.h0 h0VarRedact = unknown != null ? ec0.h0.f62622b.redact(unknown) : null;
            ec0.h0 retracted = value.getRetracted();
            ec0.h0 h0VarRedact2 = retracted != null ? ec0.h0.f62622b.redact(retracted) : null;
            ec0.h0 extended = value.getExtended();
            ec0.h0 h0VarRedact3 = extended != null ? ec0.h0.f62622b.redact(extended) : null;
            ec0.h0 fault = value.getFault();
            return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, fault != null ? ec0.h0.f62622b.redact(fault) : null, okio.k.f97943e);
        }
    }

    public q0() {
        this(null, null, null, null, null, 31, null);
    }

    public final q0 a(ec0.h0 Unknown, ec0.h0 Retracted, ec0.h0 Extended, ec0.h0 Fault, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new q0(Unknown, Retracted, Extended, Fault, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ec0.h0 getExtended() {
        return this.Extended;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ec0.h0 getFault() {
        return this.Fault;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ec0.h0 getRetracted() {
        return this.Retracted;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ec0.h0 getUnknown() {
        return this.Unknown;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), q0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Unknown, q0Var.Unknown) && p013kotlin.jvm.internal.s.f(this.Retracted, q0Var.Retracted) && p013kotlin.jvm.internal.s.f(this.Extended, q0Var.Extended) && p013kotlin.jvm.internal.s.f(this.Fault, q0Var.Fault);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ec0.h0 h0Var = this.Unknown;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        ec0.h0 h0Var2 = this.Retracted;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        ec0.h0 h0Var3 = this.Extended;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        ec0.h0 h0Var4 = this.Fault;
        int iHashCode5 = iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m431newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ec0.h0 h0Var = this.Unknown;
        if (h0Var != null) {
            arrayList.add("Unknown=" + h0Var);
        }
        ec0.h0 h0Var2 = this.Retracted;
        if (h0Var2 != null) {
            arrayList.add("Retracted=" + h0Var2);
        }
        ec0.h0 h0Var3 = this.Extended;
        if (h0Var3 != null) {
            arrayList.add("Extended=" + h0Var3);
        }
        ec0.h0 h0Var4 = this.Fault;
        if (h0Var4 != null) {
            arrayList.add("Fault=" + h0Var4);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "SpoilerState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ q0(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m431newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, okio.k unknownFields) {
        super(f68379f, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.Unknown = h0Var;
        this.Retracted = h0Var2;
        this.Extended = h0Var3;
        this.Fault = h0Var4;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of Unknown, Retracted, Extended, Fault may be non-null");
        }
    }
}
