package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lfc0/d;", "Lcom/squareup/wire/f;", "", "Lfc0/b2;", "added_or_updated", "Lfc0/c0;", "existing_site_nearby", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/b2;Lfc0/c0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/b2;Lfc0/c0;Lokio/k;)Lfc0/d;", "Lfc0/b2;", "b", "()Lfc0/b2;", "Lfc0/c0;", "c", "()Lfc0/c0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<d> f64934d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(d.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ManagedChargingSiteAddedOrUpdated#ADAPTER", jsonName = "addedOrUpdated", tag = 1)
    private final b2 added_or_updated;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ExistingManagedChargingSiteNearby#ADAPTER", jsonName = "existingSiteNearby", tag = 2)
    private final c0 existing_site_nearby;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/d$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/d;", "value", "", "c", "(Lfc0/d;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/d;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/d;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/d;)Lfc0/d;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<d> {
        a(com.squareup.wire.b bVar, co0.d<d> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.AddManagedChargingSiteResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            b2 b2VarDecode = null;
            c0 c0VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new d(b2VarDecode, c0VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    b2VarDecode = b2.f64890b.decode(reader);
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    c0VarDecode = c0.f64915b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, d value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            b2.f64890b.encodeWithTag(writer, 1, value.getAdded_or_updated());
            c0.f64915b.encodeWithTag(writer, 2, value.getExisting_site_nearby());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(d value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.unknownFields().D() + b2.f64890b.encodedSizeWithTag(1, value.getAdded_or_updated()) + c0.f64915b.encodedSizeWithTag(2, value.getExisting_site_nearby());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d redact(d value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            b2 added_or_updated = value.getAdded_or_updated();
            b2 b2VarRedact = added_or_updated != null ? b2.f64890b.redact(added_or_updated) : null;
            c0 existing_site_nearby = value.getExisting_site_nearby();
            return value.a(b2VarRedact, existing_site_nearby != null ? c0.f64915b.redact(existing_site_nearby) : null, okio.k.f97943e);
        }
    }

    public d() {
        this(null, null, null, 7, null);
    }

    public final d a(b2 added_or_updated, c0 existing_site_nearby, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new d(added_or_updated, existing_site_nearby, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b2 getAdded_or_updated() {
        return this.added_or_updated;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c0 getExisting_site_nearby() {
        return this.existing_site_nearby;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), dVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.added_or_updated, dVar.added_or_updated) && p013kotlin.jvm.internal.s.f(this.existing_site_nearby, dVar.existing_site_nearby);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        b2 b2Var = this.added_or_updated;
        int iHashCode2 = (iHashCode + (b2Var != null ? b2Var.hashCode() : 0)) * 37;
        c0 c0Var = this.existing_site_nearby;
        int iHashCode3 = iHashCode2 + (c0Var != null ? c0Var.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m218newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        b2 b2Var = this.added_or_updated;
        if (b2Var != null) {
            arrayList.add("added_or_updated=" + b2Var);
        }
        c0 c0Var = this.existing_site_nearby;
        if (c0Var != null) {
            arrayList.add("existing_site_nearby=" + c0Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "AddManagedChargingSiteResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ d(b2 b2Var, c0 c0Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : b2Var, (i11 & 2) != 0 ? null : c0Var, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m218newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b2 b2Var, c0 c0Var, okio.k unknownFields) {
        super(f64934d, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.added_or_updated = b2Var;
        this.existing_site_nearby = c0Var;
        if (x20.d.c(b2Var, c0Var) > 1) {
            throw new IllegalArgumentException("At most one of added_or_updated, existing_site_nearby may be non-null");
        }
    }
}
