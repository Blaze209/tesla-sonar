package ic0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lic0/n;", "Lcom/squareup/wire/f;", "", "", "enterServiceModePlus", "Lokio/k;", "unknownFields", "<init>", "(ZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZLokio/k;)Lic0/n;", "Z", "c", "()Z", "b", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends com.squareup.wire.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProtoAdapter<n> f77557c = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(n.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final boolean enterServiceModePlus;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ic0/n$a", "Lcom/squareup/wire/ProtoAdapter;", "Lic0/n;", "value", "", "c", "(Lic0/n;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lic0/n;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lic0/n;", DateTokenConverter.CONVERTER_KEY, "(Lic0/n;)Lic0/n;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<n> {
        a(com.squareup.wire.b bVar, co0.d<n> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.ServiceDiagnosticRequestPayload", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            boolean zBooleanValue = false;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new n(zBooleanValue, reader.e(jD));
                }
                if (iG == 1) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else {
                    reader.m(iG);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, n value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getEnterServiceModePlus()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, Boolean.valueOf(value.getEnterServiceModePlus()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(n value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            return value.getEnterServiceModePlus() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getEnterServiceModePlus())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n redact(n value) {
            s.k(value, "value");
            return n.b(value, false, okio.k.f97943e, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ n b(n nVar, boolean z11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = nVar.enterServiceModePlus;
        }
        if ((i11 & 2) != 0) {
            kVar = nVar.unknownFields();
        }
        return nVar.a(z11, kVar);
    }

    public final n a(boolean enterServiceModePlus, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new n(enterServiceModePlus, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnterServiceModePlus() {
        return this.enterServiceModePlus;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof n)) {
            return false;
        }
        n nVar = (n) other;
        return s.f(unknownFields(), nVar.unknownFields()) && this.enterServiceModePlus == nVar.enterServiceModePlus;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + Boolean.hashCode(this.enterServiceModePlus);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m472newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("enterServiceModePlus=" + this.enterServiceModePlus);
        return v.y0(arrayList, ", ", "ServiceDiagnosticRequestPayload{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ n(boolean z11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m472newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z11, okio.k unknownFields) {
        super(f77557c, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.enterServiceModePlus = z11;
    }
}
