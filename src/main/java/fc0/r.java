package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\"\u0010\u001e¨\u0006#"}, d2 = {"Lfc0/r;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "unknown", "start", "start_standard", "start_max_range", "stop", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lfc0/r;", "Lec0/h0;", "f", "()Lec0/h0;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r extends com.squareup.wire.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProtoAdapter<r> f65350g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(r.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final ec0.h0 unknown;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final ec0.h0 start;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "startStandard", tag = 3)
    private final ec0.h0 start_standard;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "startMaxRange", tag = 4)
    private final ec0.h0 start_max_range;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
    private final ec0.h0 stop;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/r$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/r;", "value", "", "c", "(Lfc0/r;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/r;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/r;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/r;)Lfc0/r;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<r> {
        a(com.squareup.wire.b bVar, co0.d<r> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargingStartStopAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            ec0.h0 h0VarDecode = null;
            ec0.h0 h0VarDecode2 = null;
            ec0.h0 h0VarDecode3 = null;
            ec0.h0 h0VarDecode4 = null;
            ec0.h0 h0VarDecode5 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new r(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, reader.e(jD));
                }
                if (iG == 1) {
                    h0VarDecode = ec0.h0.f62622b.decode(reader);
                } else if (iG == 2) {
                    h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                } else if (iG == 3) {
                    h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                } else if (iG == 4) {
                    h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    h0VarDecode5 = ec0.h0.f62622b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, r value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getUnknown());
            protoAdapter.encodeWithTag(writer, 2, value.getStart());
            protoAdapter.encodeWithTag(writer, 3, value.getStart_standard());
            protoAdapter.encodeWithTag(writer, 4, value.getStart_max_range());
            protoAdapter.encodeWithTag(writer, 5, value.getStop());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(r value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getUnknown()) + protoAdapter.encodedSizeWithTag(2, value.getStart()) + protoAdapter.encodedSizeWithTag(3, value.getStart_standard()) + protoAdapter.encodedSizeWithTag(4, value.getStart_max_range()) + protoAdapter.encodedSizeWithTag(5, value.getStop());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public r redact(r value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.h0 unknown = value.getUnknown();
            ec0.h0 h0VarRedact = unknown != null ? ec0.h0.f62622b.redact(unknown) : null;
            ec0.h0 start = value.getStart();
            ec0.h0 h0VarRedact2 = start != null ? ec0.h0.f62622b.redact(start) : null;
            ec0.h0 start_standard = value.getStart_standard();
            ec0.h0 h0VarRedact3 = start_standard != null ? ec0.h0.f62622b.redact(start_standard) : null;
            ec0.h0 start_max_range = value.getStart_max_range();
            ec0.h0 h0VarRedact4 = start_max_range != null ? ec0.h0.f62622b.redact(start_max_range) : null;
            ec0.h0 stop = value.getStop();
            return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, stop != null ? ec0.h0.f62622b.redact(stop) : null, okio.k.f97943e);
        }
    }

    public r() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final r a(ec0.h0 unknown, ec0.h0 start, ec0.h0 start_standard, ec0.h0 start_max_range, ec0.h0 stop, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new r(unknown, start, start_standard, start_max_range, stop, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ec0.h0 getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ec0.h0 getStart_max_range() {
        return this.start_max_range;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ec0.h0 getStart_standard() {
        return this.start_standard;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ec0.h0 getStop() {
        return this.stop;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r)) {
            return false;
        }
        r rVar = (r) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), rVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.unknown, rVar.unknown) && p013kotlin.jvm.internal.s.f(this.start, rVar.start) && p013kotlin.jvm.internal.s.f(this.start_standard, rVar.start_standard) && p013kotlin.jvm.internal.s.f(this.start_max_range, rVar.start_max_range) && p013kotlin.jvm.internal.s.f(this.stop, rVar.stop);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ec0.h0 getUnknown() {
        return this.unknown;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ec0.h0 h0Var = this.unknown;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        ec0.h0 h0Var2 = this.start;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        ec0.h0 h0Var3 = this.start_standard;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        ec0.h0 h0Var4 = this.start_max_range;
        int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        ec0.h0 h0Var5 = this.stop;
        int iHashCode6 = iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m320newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ec0.h0 h0Var = this.unknown;
        if (h0Var != null) {
            arrayList.add("unknown=" + h0Var);
        }
        ec0.h0 h0Var2 = this.start;
        if (h0Var2 != null) {
            arrayList.add("start=" + h0Var2);
        }
        ec0.h0 h0Var3 = this.start_standard;
        if (h0Var3 != null) {
            arrayList.add("start_standard=" + h0Var3);
        }
        ec0.h0 h0Var4 = this.start_max_range;
        if (h0Var4 != null) {
            arrayList.add("start_max_range=" + h0Var4);
        }
        ec0.h0 h0Var5 = this.stop;
        if (h0Var5 != null) {
            arrayList.add("stop=" + h0Var5);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ChargingStartStopAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ r(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m320newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, okio.k unknownFields) {
        super(f65350g, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.unknown = h0Var;
        this.start = h0Var2;
        this.start_standard = h0Var3;
        this.start_max_range = h0Var4;
        this.stop = h0Var5;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5) > 1) {
            throw new IllegalArgumentException("At most one of unknown, start, start_standard, start_max_range, stop may be non-null");
        }
    }
}
