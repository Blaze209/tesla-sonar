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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lic0/o;", "Lcom/squareup/wire/f;", "", "Lsc0/b;", "domain", "", "skipValidationVerification", "Lokio/k;", "unknownFields", "<init>", "(Lsc0/b;ZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lsc0/b;ZLokio/k;)Lic0/o;", "Lsc0/b;", "c", "()Lsc0/b;", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<o> f77560d = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(o.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.universalmessage.Domain#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final sc0.b domain;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final boolean skipValidationVerification;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ic0/o$a", "Lcom/squareup/wire/ProtoAdapter;", "Lic0/o;", "value", "", "c", "(Lic0/o;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lic0/o;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lic0/o;", DateTokenConverter.CONVERTER_KEY, "(Lic0/o;)Lic0/o;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<o> {
        a(com.squareup.wire.b bVar, co0.d<o> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.SessionInfoRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            sc0.b bVarDecode = sc0.b.DOMAIN_BROADCAST;
            long jD = reader.d();
            boolean zBooleanValue = false;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new o(bVarDecode, zBooleanValue, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        bVarDecode = sc0.b.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, o value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getDomain() != sc0.b.DOMAIN_BROADCAST) {
                sc0.b.ADAPTER.encodeWithTag(writer, 1, value.getDomain());
            }
            if (value.getSkipValidationVerification()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 2, Boolean.valueOf(value.getSkipValidationVerification()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(o value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getDomain() != sc0.b.DOMAIN_BROADCAST) {
                iD += sc0.b.ADAPTER.encodedSizeWithTag(1, value.getDomain());
            }
            return value.getSkipValidationVerification() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getSkipValidationVerification())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public o redact(o value) {
            s.k(value, "value");
            return o.b(value, null, false, okio.k.f97943e, 3, null);
        }
    }

    public o() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ o b(o oVar, sc0.b bVar, boolean z11, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = oVar.domain;
        }
        if ((i11 & 2) != 0) {
            z11 = oVar.skipValidationVerification;
        }
        if ((i11 & 4) != 0) {
            kVar = oVar.unknownFields();
        }
        return oVar.a(bVar, z11, kVar);
    }

    public final o a(sc0.b domain, boolean skipValidationVerification, okio.k unknownFields) {
        s.k(domain, "domain");
        s.k(unknownFields, "unknownFields");
        return new o(domain, skipValidationVerification, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final sc0.b getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSkipValidationVerification() {
        return this.skipValidationVerification;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof o)) {
            return false;
        }
        o oVar = (o) other;
        return s.f(unknownFields(), oVar.unknownFields()) && this.domain == oVar.domain && this.skipValidationVerification == oVar.skipValidationVerification;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.domain.hashCode()) * 37) + Boolean.hashCode(this.skipValidationVerification);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m473newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("domain=" + this.domain);
        arrayList.add("skipValidationVerification=" + this.skipValidationVerification);
        return v.y0(arrayList, ", ", "SessionInfoRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ o(sc0.b bVar, boolean z11, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? sc0.b.DOMAIN_BROADCAST : bVar, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m473newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(sc0.b domain, boolean z11, okio.k unknownFields) {
        super(f77560d, unknownFields);
        s.k(domain, "domain");
        s.k(unknownFields, "unknownFields");
        this.domain = domain;
        this.skipValidationVerification = z11;
    }
}
