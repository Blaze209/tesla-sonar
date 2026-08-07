package nc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B;\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lnc0/b;", "Lcom/squareup/wire/f;", "", "Lnc0/l;", "trace", "", "Lnc0/a;", "attributes", "Lnc0/i;", "metrics", "Lokio/k;", "unknownFields", "<init>", "(Lnc0/l;Ljava/util/List;Ljava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lnc0/l;Ljava/util/List;Ljava/util/List;Lokio/k;)Lnc0/b;", "Lnc0/l;", "e", "()Lnc0/l;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<b> f93783e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.tesla.generated.monitoring.Trace#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)
    private final l trace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.monitoring.Attribute#ADAPTER", label = q.a.REPEATED, tag = 2)
    private final List<nc0.a> attributes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.monitoring.MetricRecording#ADAPTER", label = q.a.REPEATED, tag = 3)
    private final List<i> metrics;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"nc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lnc0/b;", "value", "", "c", "(Lnc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lnc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lnc0/b;", DateTokenConverter.CONVERTER_KEY, "(Lnc0/b;)Lnc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.AttributeList", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            l lVarDecode = l.IOS_DID_FINISH_LAUNCHING;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(lVarDecode, arrayList, arrayList2, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        lVarDecode = l.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG == 2) {
                    arrayList.add(nc0.a.f93779d.decode(reader));
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    arrayList2.add(i.f93807d.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getTrace() != l.IOS_DID_FINISH_LAUNCHING) {
                l.ADAPTER.encodeWithTag(writer, 1, value.getTrace());
            }
            nc0.a.f93779d.asRepeated().encodeWithTag(writer, 2, value.c());
            i.f93807d.asRepeated().encodeWithTag(writer, 3, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTrace() != l.IOS_DID_FINISH_LAUNCHING) {
                iD += l.ADAPTER.encodedSizeWithTag(1, value.getTrace());
            }
            return iD + nc0.a.f93779d.asRepeated().encodedSizeWithTag(2, value.c()) + i.f93807d.asRepeated().encodedSizeWithTag(3, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            return b.b(value, null, x20.d.a(value.c(), nc0.a.f93779d), x20.d.a(value.d(), i.f93807d), okio.k.f97943e, 1, null);
        }
    }

    public b() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b b(b bVar, l lVar, List list, List list2, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = bVar.trace;
        }
        if ((i11 & 2) != 0) {
            list = bVar.attributes;
        }
        if ((i11 & 4) != 0) {
            list2 = bVar.metrics;
        }
        if ((i11 & 8) != 0) {
            kVar = bVar.unknownFields();
        }
        return bVar.a(lVar, list, list2, kVar);
    }

    public final b a(l trace, List<nc0.a> attributes, List<i> metrics, okio.k unknownFields) {
        s.k(trace, "trace");
        s.k(attributes, "attributes");
        s.k(metrics, "metrics");
        s.k(unknownFields, "unknownFields");
        return new b(trace, attributes, metrics, unknownFields);
    }

    public final List<nc0.a> c() {
        return this.attributes;
    }

    public final List<i> d() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l getTrace() {
        return this.trace;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && this.trace == bVar.trace && s.f(this.attributes, bVar.attributes) && s.f(this.metrics, bVar.metrics);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.trace.hashCode()) * 37) + this.attributes.hashCode()) * 37) + this.metrics.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m601newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("trace=" + this.trace);
        if (!this.attributes.isEmpty()) {
            arrayList.add("attributes=" + this.attributes);
        }
        if (!this.metrics.isEmpty()) {
            arrayList.add("metrics=" + this.metrics);
        }
        return v.y0(arrayList, ", ", "AttributeList{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(l lVar, List list, List list2, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? l.IOS_DID_FINISH_LAUNCHING : lVar, (i11 & 2) != 0 ? v.m() : list, (i11 & 4) != 0 ? v.m() : list2, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m601newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l trace, List<nc0.a> attributes, List<i> metrics, okio.k unknownFields) {
        super(f93783e, unknownFields);
        s.k(trace, "trace");
        s.k(attributes, "attributes");
        s.k(metrics, "metrics");
        s.k(unknownFields, "unknownFields");
        this.trace = trace;
        this.attributes = x20.d.g("attributes", attributes);
        this.metrics = x20.d.g("metrics", metrics);
    }
}
