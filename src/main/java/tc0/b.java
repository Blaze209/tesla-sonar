package tc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.io.IOException;
import java.util.ArrayList;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BQ\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJW\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b,\u0010/¨\u00060"}, d2 = {"Ltc0/b;", "Lcom/squareup/wire/f;", "", "", "modified_at", "Lokio/k;", AnnotatedPrivateKey.LABEL, "Ltc0/a;", "data_", "Ltc0/f;", "remote_data", "reference_id", "", "label_is_plaintext", "unknownFields", "<init>", "(JLokio/k;Ltc0/a;Ltc0/f;Lokio/k;ZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(JLokio/k;Ltc0/a;Ltc0/f;Lokio/k;ZLokio/k;)Ltc0/b;", "J", "f", "()J", "b", "Lokio/k;", DateTokenConverter.CONVERTER_KEY, "()Lokio/k;", "c", "Ltc0/a;", "()Ltc0/a;", "Ltc0/f;", "h", "()Ltc0/f;", "e", "g", "Z", "()Z", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.squareup.wire.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProtoAdapter<b> f113137h = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "modifiedAt", label = q.a.OMIT_IDENTITY, tag = 1)
    private final long modified_at;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.EncryptedData#ADAPTER", declaredName = "data", label = q.a.OMIT_IDENTITY, tag = 3)
    private final tc0.a data_;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.vault.RemoteData#ADAPTER", jsonName = "remoteData", label = q.a.OMIT_IDENTITY, tag = 4)
    private final f remote_data;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "referenceId", label = q.a.OMIT_IDENTITY, tag = 5)
    private final okio.k reference_id;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "labelIsPlaintext", label = q.a.OMIT_IDENTITY, tag = 6)
    private final boolean label_is_plaintext;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"tc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Ltc0/b;", "value", "", "c", "(Ltc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Ltc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Ltc0/b;", DateTokenConverter.CONVERTER_KEY, "(Ltc0/b;)Ltc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/vault.Item", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) throws IOException {
            s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            f fVarDecode = null;
            boolean zBooleanValue = false;
            long jLongValue = 0;
            tc0.a aVarDecode = null;
            okio.k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b(jLongValue, kVarDecode, aVarDecode, fVarDecode, kVarDecode2, zBooleanValue, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        break;
                    case 2:
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 3:
                        aVarDecode = tc0.a.f113132e.decode(reader);
                        break;
                    case 4:
                        fVarDecode = f.f113155e.decode(reader);
                        break;
                    case 5:
                        kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 6:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, b value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getModified_at() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 1, Long.valueOf(value.getModified_at()));
            }
            okio.k label = value.getLabel();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(label, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getLabel());
            }
            if (value.getData_() != null) {
                tc0.a.f113132e.encodeWithTag(writer, 3, value.getData_());
            }
            if (value.getRemote_data() != null) {
                f.f113155e.encodeWithTag(writer, 4, value.getRemote_data());
            }
            if (!s.f(value.getReference_id(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 5, value.getReference_id());
            }
            if (value.getLabel_is_plaintext()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getLabel_is_plaintext()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getModified_at() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(1, Long.valueOf(value.getModified_at()));
            }
            okio.k label = value.getLabel();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(label, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getLabel());
            }
            if (value.getData_() != null) {
                iD += tc0.a.f113132e.encodedSizeWithTag(3, value.getData_());
            }
            if (value.getRemote_data() != null) {
                iD += f.f113155e.encodedSizeWithTag(4, value.getRemote_data());
            }
            if (!s.f(value.getReference_id(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(5, value.getReference_id());
            }
            return value.getLabel_is_plaintext() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getLabel_is_plaintext())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            s.k(value, "value");
            tc0.a data_ = value.getData_();
            tc0.a aVarRedact = data_ != null ? tc0.a.f113132e.redact(data_) : null;
            f remote_data = value.getRemote_data();
            return b.b(value, 0L, null, aVarRedact, remote_data != null ? f.f113155e.redact(remote_data) : null, null, false, okio.k.f97943e, 51, null);
        }
    }

    public b() {
        this(0L, null, null, null, null, false, null, 127, null);
    }

    public static /* synthetic */ b b(b bVar, long j11, okio.k kVar, tc0.a aVar, f fVar, okio.k kVar2, boolean z11, okio.k kVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = bVar.modified_at;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            kVar = bVar.label;
        }
        okio.k kVar4 = kVar;
        if ((i11 & 4) != 0) {
            aVar = bVar.data_;
        }
        tc0.a aVar2 = aVar;
        if ((i11 & 8) != 0) {
            fVar = bVar.remote_data;
        }
        f fVar2 = fVar;
        if ((i11 & 16) != 0) {
            kVar2 = bVar.reference_id;
        }
        return bVar.a(j12, kVar4, aVar2, fVar2, kVar2, (i11 & 32) != 0 ? bVar.label_is_plaintext : z11, (i11 & 64) != 0 ? bVar.unknownFields() : kVar3);
    }

    public final b a(long modified_at, okio.k label, tc0.a data_, f remote_data, okio.k reference_id, boolean label_is_plaintext, okio.k unknownFields) {
        s.k(label, "label");
        s.k(reference_id, "reference_id");
        s.k(unknownFields, "unknownFields");
        return new b(modified_at, label, data_, remote_data, reference_id, label_is_plaintext, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final tc0.a getData_() {
        return this.data_;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final okio.k getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getLabel_is_plaintext() {
        return this.label_is_plaintext;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return s.f(unknownFields(), bVar.unknownFields()) && this.modified_at == bVar.modified_at && s.f(this.label, bVar.label) && s.f(this.data_, bVar.data_) && s.f(this.remote_data, bVar.remote_data) && s.f(this.reference_id, bVar.reference_id) && this.label_is_plaintext == bVar.label_is_plaintext;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getModified_at() {
        return this.modified_at;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final okio.k getReference_id() {
        return this.reference_id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getRemote_data() {
        return this.remote_data;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Long.hashCode(this.modified_at)) * 37) + this.label.hashCode()) * 37;
        tc0.a aVar = this.data_;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
        f fVar = this.remote_data;
        int iHashCode3 = ((((iHashCode2 + (fVar != null ? fVar.hashCode() : 0)) * 37) + this.reference_id.hashCode()) * 37) + Boolean.hashCode(this.label_is_plaintext);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m773newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("modified_at=" + this.modified_at);
        arrayList.add("label=" + this.label);
        tc0.a aVar = this.data_;
        if (aVar != null) {
            arrayList.add("data_=" + aVar);
        }
        f fVar = this.remote_data;
        if (fVar != null) {
            arrayList.add("remote_data=" + fVar);
        }
        arrayList.add("reference_id=" + this.reference_id);
        arrayList.add("label_is_plaintext=" + this.label_is_plaintext);
        return v.y0(arrayList, ", ", "Item{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(long j11, okio.k kVar, tc0.a aVar, f fVar, okio.k kVar2, boolean z11, okio.k kVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? okio.k.f97943e : kVar, (i11 & 4) != 0 ? null : aVar, (i11 & 8) == 0 ? fVar : null, (i11 & 16) != 0 ? okio.k.f97943e : kVar2, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m773newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j11, okio.k label, tc0.a aVar, f fVar, okio.k reference_id, boolean z11, okio.k unknownFields) {
        super(f113137h, unknownFields);
        s.k(label, "label");
        s.k(reference_id, "reference_id");
        s.k(unknownFields, "unknownFields");
        this.modified_at = j11;
        this.label = label;
        this.data_ = aVar;
        this.remote_data = fVar;
        this.reference_id = reference_id;
        this.label_is_plaintext = z11;
    }
}
