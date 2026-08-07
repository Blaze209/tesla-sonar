package cc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.k;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB+\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcc0/c;", "Lcom/squareup/wire/f;", "", "Lcc0/d;", "name", "", "Lcc0/f;", "parameters", "Lokio/k;", "unknownFields", "<init>", "(Lcc0/d;Ljava/util/List;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lcc0/d;Ljava/util/List;Lokio/k;)Lcc0/c;", "Lcc0/d;", "c", "()Lcc0/d;", "b", "Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<c> f19046d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(c.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.tesla.generated.analytics.AnalyticsEventName#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 1)
    private final d name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.analytics.AnalyticsParameter#ADAPTER", label = q.a.REPEATED, tag = 2)
    private final List<f> parameters;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"cc0/c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lcc0/c;", "value", "", "c", "(Lcc0/c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lcc0/c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lcc0/c;", DateTokenConverter.CONVERTER_KEY, "(Lcc0/c;)Lcc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, co0.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/AnalyticsEvent", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c decode(k reader) {
            s.k(reader, "reader");
            d dVarDecode = d.PREPARED_REPORT;
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c(dVarDecode, arrayList, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        dVarDecode = d.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    arrayList.add(f.f19053g.decode(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, c value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getName() != d.PREPARED_REPORT) {
                d.ADAPTER.encodeWithTag(writer, 1, value.getName());
            }
            f.f19053g.asRepeated().encodeWithTag(writer, 2, value.d());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getName() != d.PREPARED_REPORT) {
                iD += d.ADAPTER.encodedSizeWithTag(1, value.getName());
            }
            return iD + f.f19053g.asRepeated().encodedSizeWithTag(2, value.d());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c redact(c value) {
            s.k(value, "value");
            return c.b(value, null, x20.d.a(value.d(), f.f19053g), okio.k.f97943e, 1, null);
        }
    }

    public c() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c b(c cVar, d dVar, List list, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = cVar.name;
        }
        if ((i11 & 2) != 0) {
            list = cVar.parameters;
        }
        if ((i11 & 4) != 0) {
            kVar = cVar.unknownFields();
        }
        return cVar.a(dVar, list, kVar);
    }

    public final c a(d name, List<f> parameters, okio.k unknownFields) {
        s.k(name, "name");
        s.k(parameters, "parameters");
        s.k(unknownFields, "unknownFields");
        return new c(name, parameters, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getName() {
        return this.name;
    }

    public final List<f> d() {
        return this.parameters;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return s.f(unknownFields(), cVar.unknownFields()) && this.name == cVar.name && s.f(this.parameters, cVar.parameters);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.parameters.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m10newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + this.name);
        if (!this.parameters.isEmpty()) {
            arrayList.add("parameters=" + this.parameters);
        }
        return v.y0(arrayList, ", ", "AnalyticsEvent{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c(d dVar, List list, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? d.PREPARED_REPORT : dVar, (i11 & 2) != 0 ? v.m() : list, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m10newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d name, List<f> parameters, okio.k unknownFields) {
        super(f19046d, unknownFields);
        s.k(name, "name");
        s.k(parameters, "parameters");
        s.k(unknownFields, "unknownFields");
        this.name = name;
        this.parameters = x20.d.g("parameters", parameters);
    }
}
