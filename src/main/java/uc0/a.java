package uc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co0.d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import jn0.e;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Luc0/a;", "Lcom/squareup/wire/f;", "", "", "modified_at", "Lokio/k;", "data_", "unknownFields", "<init>", "(JLokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(JLokio/k;Lokio/k;)Luc0/a;", "J", DateTokenConverter.CONVERTER_KEY, "()J", "b", "Lokio/k;", "c", "()Lokio/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<a> f116096d = new C2501a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(a.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "modifiedAt", label = q.a.OMIT_IDENTITY, tag = 1)
    private final long modified_at;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", declaredName = "data", label = q.a.OMIT_IDENTITY, tag = 2)
    private final k data_;

    /* JADX INFO: renamed from: uc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"uc0/a$a", "Lcom/squareup/wire/ProtoAdapter;", "Luc0/a;", "value", "", "c", "(Luc0/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Luc0/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Luc0/a;", DateTokenConverter.CONVERTER_KEY, "(Luc0/a;)Luc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2501a extends ProtoAdapter<a> {
        C2501a(com.squareup.wire.b bVar, d<a> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.UnencryptedItem", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.f97943e;
            long jD = reader.d();
            long jLongValue = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a(jLongValue, kVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, a value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getModified_at() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.getModified_at()));
            }
            if (!s.f(value.getData_(), k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getData_());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getModified_at() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getModified_at()));
            }
            return !s.f(value.getData_(), k.f97943e) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getData_()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            s.k(value, "value");
            return a.b(value, 0L, null, k.f97943e, 3, null);
        }
    }

    public a() {
        this(0L, null, null, 7, null);
    }

    public static /* synthetic */ a b(a aVar, long j11, k kVar, k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = aVar.modified_at;
        }
        if ((i11 & 2) != 0) {
            kVar = aVar.data_;
        }
        if ((i11 & 4) != 0) {
            kVar2 = aVar.unknownFields();
        }
        return aVar.a(j11, kVar, kVar2);
    }

    public final a a(long modified_at, k data_, k unknownFields) {
        s.k(data_, "data_");
        s.k(unknownFields, "unknownFields");
        return new a(modified_at, data_, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getData_() {
        return this.data_;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getModified_at() {
        return this.modified_at;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return s.f(unknownFields(), aVar.unknownFields()) && this.modified_at == aVar.modified_at && s.f(this.data_, aVar.data_);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Long.hashCode(this.modified_at)) * 37) + this.data_.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ f.a newBuilder() {
        return (f.a) m782newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("modified_at=" + this.modified_at);
        arrayList.add("data_=" + this.data_);
        return v.y0(arrayList, ", ", "UnencryptedItem{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(long j11, k kVar, k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? k.f97943e : kVar, (i11 & 4) != 0 ? k.f97943e : kVar2);
    }

    @e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m782newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j11, k data_, k unknownFields) {
        super(f116096d, unknownFields);
        s.k(data_, "data_");
        s.k(unknownFields, "unknownFields");
        this.modified_at = j11;
        this.data_ = data_;
    }
}
