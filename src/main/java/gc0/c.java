package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lgc0/c;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Deadman", "Standard", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/c;", "Lec0/h0;", "b", "()Lec0/h0;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<c> f67979d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final ec0.h0 Deadman;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final ec0.h0 Standard;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/c;", "value", "", "c", "(Lgc0/c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/c;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/c;)Lgc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.AutoparkStyle", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            ec0.h0 h0VarDecode = null;
            ec0.h0 h0VarDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c(h0VarDecode, h0VarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    h0VarDecode = ec0.h0.f62622b.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, c value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getDeadman());
            protoAdapter.encodeWithTag(writer, 2, value.getStandard());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getDeadman()) + protoAdapter.encodedSizeWithTag(2, value.getStandard());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c redact(c value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.h0 deadman = value.getDeadman();
            ec0.h0 h0VarRedact = deadman != null ? ec0.h0.f62622b.redact(deadman) : null;
            ec0.h0 standard = value.getStandard();
            return value.a(h0VarRedact, standard != null ? ec0.h0.f62622b.redact(standard) : null, okio.k.f97943e);
        }
    }

    public c() {
        this(null, null, null, 7, null);
    }

    public final c a(ec0.h0 Deadman, ec0.h0 Standard, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new c(Deadman, Standard, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ec0.h0 getDeadman() {
        return this.Deadman;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ec0.h0 getStandard() {
        return this.Standard;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Deadman, cVar.Deadman) && p013kotlin.jvm.internal.s.f(this.Standard, cVar.Standard);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ec0.h0 h0Var = this.Deadman;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        ec0.h0 h0Var2 = this.Standard;
        int iHashCode3 = iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m391newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ec0.h0 h0Var = this.Deadman;
        if (h0Var != null) {
            arrayList.add("Deadman=" + h0Var);
        }
        ec0.h0 h0Var2 = this.Standard;
        if (h0Var2 != null) {
            arrayList.add("Standard=" + h0Var2);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "AutoparkStyle{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m391newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ec0.h0 h0Var, ec0.h0 h0Var2, okio.k unknownFields) {
        super(f67979d, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.Deadman = h0Var;
        this.Standard = h0Var2;
        if (x20.d.c(h0Var, h0Var2) > 1) {
            throw new IllegalArgumentException("At most one of Deadman, Standard may be non-null");
        }
    }
}
