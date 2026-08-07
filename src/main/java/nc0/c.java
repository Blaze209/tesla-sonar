package nc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001f\u0010$¨\u0006%"}, d2 = {"Lnc0/c;", "Lcom/squareup/wire/f;", "", "Lnc0/d;", "noAttributes", "Lnc0/j;", "timeToInteractiveAttributes", "Lnc0/b;", "monitoring_AttributeList", "Lokio/k;", "unknownFields", "<init>", "(Lnc0/d;Lnc0/j;Lnc0/b;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lnc0/d;Lnc0/j;Lnc0/b;Lokio/k;)Lnc0/c;", "Lnc0/d;", "c", "()Lnc0/d;", "b", "Lnc0/j;", DateTokenConverter.CONVERTER_KEY, "()Lnc0/j;", "Lnc0/b;", "()Lnc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<c> f93788e = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(c.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.monitoring.EmptyAttributes#ADAPTER", tag = 1)
    private final d noAttributes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.monitoring.TimeToInteractiveAttributes#ADAPTER", tag = 2)
    private final j timeToInteractiveAttributes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.monitoring.AttributeList#ADAPTER", declaredName = "AttributeList", tag = 3)
    private final b monitoring_AttributeList;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"nc0/c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lnc0/c;", "value", "", "c", "(Lnc0/c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lnc0/c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lnc0/c;", DateTokenConverter.CONVERTER_KEY, "(Lnc0/c;)Lnc0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, co0.d<c> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/monitoring.AttributesPayload", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            d dVarDecode = null;
            j jVarDecode = null;
            b bVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c(dVarDecode, jVarDecode, bVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    dVarDecode = d.f93793c.decode(reader);
                } else if (iG == 2) {
                    jVarDecode = j.f93811e.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    bVarDecode = b.f93783e.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, c value) {
            s.k(writer, "writer");
            s.k(value, "value");
            d.f93793c.encodeWithTag(writer, 1, value.getNoAttributes());
            j.f93811e.encodeWithTag(writer, 2, value.getTimeToInteractiveAttributes());
            b.f93783e.encodeWithTag(writer, 3, value.getMonitoring_AttributeList());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c value) {
            s.k(value, "value");
            return value.unknownFields().D() + d.f93793c.encodedSizeWithTag(1, value.getNoAttributes()) + j.f93811e.encodedSizeWithTag(2, value.getTimeToInteractiveAttributes()) + b.f93783e.encodedSizeWithTag(3, value.getMonitoring_AttributeList());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c redact(c value) {
            s.k(value, "value");
            d noAttributes = value.getNoAttributes();
            d dVarRedact = noAttributes != null ? d.f93793c.redact(noAttributes) : null;
            j timeToInteractiveAttributes = value.getTimeToInteractiveAttributes();
            j jVarRedact = timeToInteractiveAttributes != null ? j.f93811e.redact(timeToInteractiveAttributes) : null;
            b monitoring_AttributeList = value.getMonitoring_AttributeList();
            return value.a(dVarRedact, jVarRedact, monitoring_AttributeList != null ? b.f93783e.redact(monitoring_AttributeList) : null, okio.k.f97943e);
        }
    }

    public c() {
        this(null, null, null, null, 15, null);
    }

    public final c a(d noAttributes, j timeToInteractiveAttributes, b monitoring_AttributeList, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new c(noAttributes, timeToInteractiveAttributes, monitoring_AttributeList, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getMonitoring_AttributeList() {
        return this.monitoring_AttributeList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getNoAttributes() {
        return this.noAttributes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getTimeToInteractiveAttributes() {
        return this.timeToInteractiveAttributes;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return s.f(unknownFields(), cVar.unknownFields()) && s.f(this.noAttributes, cVar.noAttributes) && s.f(this.timeToInteractiveAttributes, cVar.timeToInteractiveAttributes) && s.f(this.monitoring_AttributeList, cVar.monitoring_AttributeList);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        d dVar = this.noAttributes;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 37;
        j jVar = this.timeToInteractiveAttributes;
        int iHashCode3 = (iHashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 37;
        b bVar = this.monitoring_AttributeList;
        int iHashCode4 = iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m602newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.noAttributes;
        if (dVar != null) {
            arrayList.add("noAttributes=" + dVar);
        }
        j jVar = this.timeToInteractiveAttributes;
        if (jVar != null) {
            arrayList.add("timeToInteractiveAttributes=" + jVar);
        }
        b bVar = this.monitoring_AttributeList;
        if (bVar != null) {
            arrayList.add("monitoring_AttributeList=" + bVar);
        }
        return v.y0(arrayList, ", ", "AttributesPayload{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ c(d dVar, j jVar, b bVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : dVar, (i11 & 2) != 0 ? null : jVar, (i11 & 4) != 0 ? null : bVar, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m602newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, j jVar, b bVar, okio.k unknownFields) {
        super(f93788e, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.noAttributes = dVar;
        this.timeToInteractiveAttributes = jVar;
        this.monitoring_AttributeList = bVar;
        if (x20.d.d(dVar, jVar, bVar) > 1) {
            throw new IllegalArgumentException("At most one of noAttributes, timeToInteractiveAttributes, monitoring_AttributeList may be non-null");
        }
    }
}
