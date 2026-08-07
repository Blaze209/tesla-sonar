package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lec0/r;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "all_week", "weekdays", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lokio/k;)Lec0/r;", "Lec0/h0;", "b", "()Lec0/h0;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<r> f62739d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(r.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "allWeek", tag = 1)
    private final h0 all_week;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final h0 weekdays;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/r$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/r;", "value", "", "c", "(Lec0/r;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/r;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/r;", DateTokenConverter.CONVERTER_KEY, "(Lec0/r;)Lec0/r;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<r> {
        a(com.squareup.wire.b bVar, co0.d<r> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PreconditioningTimes", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            h0 h0VarDecode = null;
            h0 h0VarDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new r(h0VarDecode, h0VarDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    h0VarDecode = h0.f62622b.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    h0VarDecode2 = h0.f62622b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, r value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getAll_week());
            protoAdapter.encodeWithTag(writer, 2, value.getWeekdays());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(r value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getAll_week()) + protoAdapter.encodedSizeWithTag(2, value.getWeekdays());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r redact(r value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 all_week = value.getAll_week();
            h0 h0VarRedact = all_week != null ? h0.f62622b.redact(all_week) : null;
            h0 weekdays = value.getWeekdays();
            return value.a(h0VarRedact, weekdays != null ? h0.f62622b.redact(weekdays) : null, okio.k.f97943e);
        }
    }

    public r() {
        this(null, null, null, 7, null);
    }

    public final r a(h0 all_week, h0 weekdays, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new r(all_week, weekdays, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getAll_week() {
        return this.all_week;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getWeekdays() {
        return this.weekdays;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r)) {
            return false;
        }
        r rVar = (r) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), rVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.all_week, rVar.all_week) && p013kotlin.jvm.internal.s.f(this.weekdays, rVar.weekdays);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.all_week;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.weekdays;
        int iHashCode3 = iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m153newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.all_week;
        if (h0Var != null) {
            arrayList.add("all_week=" + h0Var);
        }
        h0 h0Var2 = this.weekdays;
        if (h0Var2 != null) {
            arrayList.add("weekdays=" + h0Var2);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "PreconditioningTimes{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ r(h0 h0Var, h0 h0Var2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m153newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h0 h0Var, h0 h0Var2, okio.k unknownFields) {
        super(f62739d, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.all_week = h0Var;
        this.weekdays = h0Var2;
        if (x20.d.c(h0Var, h0Var2) > 1) {
            throw new IllegalArgumentException("At most one of all_week, weekdays may be non-null");
        }
    }
}
