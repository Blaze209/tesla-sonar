package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lfc0/j;", "Lcom/squareup/wire/f;", "", "", "home", "work", "other", "Lokio/k;", "unknownFields", "<init>", "(ZZZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other_", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZZZLokio/k;)Lfc0/j;", "Z", "c", "()Z", "b", "e", DateTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<j> f65124e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(j.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final boolean home;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final boolean work;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final boolean other;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/j$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/j;", "value", "", "c", "(Lfc0/j;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/j;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/j;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/j;)Lfc0/j;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<j> {
        a(com.squareup.wire.b bVar, co0.d<j> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.BatchRemovePreconditionSchedulesAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            boolean zBooleanValue3 = false;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new j(zBooleanValue, zBooleanValue2, zBooleanValue3, reader.e(jD));
                }
                if (iG == 1) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 2) {
                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, j value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getHome()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getHome()));
            }
            if (value.getWork()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getWork()));
            }
            if (value.getOther()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getOther()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(j value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getHome()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getHome()));
            }
            if (value.getWork()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getWork()));
            }
            return value.getOther() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getOther())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public j redact(j value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return j.b(value, false, false, false, okio.k.f97943e, 7, null);
        }
    }

    public j() {
        this(false, false, false, null, 15, null);
    }

    public static /* synthetic */ j b(j jVar, boolean z11, boolean z12, boolean z13, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = jVar.home;
        }
        if ((i11 & 2) != 0) {
            z12 = jVar.work;
        }
        if ((i11 & 4) != 0) {
            z13 = jVar.other;
        }
        if ((i11 & 8) != 0) {
            kVar = jVar.unknownFields();
        }
        return jVar.a(z11, z12, z13, kVar);
    }

    public final j a(boolean home, boolean work, boolean other, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new j(home, work, other, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHome() {
        return this.home;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getOther() {
        return this.other;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getWork() {
        return this.work;
    }

    public boolean equals(Object other_) {
        if (other_ == this) {
            return true;
        }
        if (!(other_ instanceof j)) {
            return false;
        }
        j jVar = (j) other_;
        return p013kotlin.jvm.internal.s.f(unknownFields(), jVar.unknownFields()) && this.home == jVar.home && this.work == jVar.work && this.other == jVar.other;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.home)) * 37) + Boolean.hashCode(this.work)) * 37) + Boolean.hashCode(this.other);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m262newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("home=" + this.home);
        arrayList.add("work=" + this.work);
        arrayList.add("other=" + this.other);
        return p013kotlin.collections.v.y0(arrayList, ", ", "BatchRemovePreconditionSchedulesAction{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ j(boolean z11, boolean z12, boolean z13, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m262newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z11, boolean z12, boolean z13, okio.k unknownFields) {
        super(f65124e, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.home = z11;
        this.work = z12;
        this.other = z13;
    }
}
