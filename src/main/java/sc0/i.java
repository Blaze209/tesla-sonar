package sc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.l;
import com.squareup.wire.o;
import com.squareup.wire.q;
import java.util.ArrayList;
import okio.k;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lsc0/i;", "Lcom/squareup/wire/f;", "", "Lokio/k;", ClientData.KEY_CHALLENGE, "public_key", "", "handle", "Lrc0/g;", "identified_key", "unknownFields", "<init>", "(Lokio/k;Lokio/k;Ljava/lang/Integer;Lrc0/g;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lokio/k;Ljava/lang/Integer;Lrc0/g;Lokio/k;)Lsc0/i;", "Lokio/k;", "c", "()Lokio/k;", "b", "f", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "Lrc0/g;", "e", "()Lrc0/g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<i> f111102f = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(i.class), o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)
    private final k challenge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "publicKey", tag = 1)
    private final k public_key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    private final Integer handle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.IdentifiedKey#ADAPTER", jsonName = "identifiedKey", tag = 4)
    private final rc0.g identified_key;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"sc0/i$a", "Lcom/squareup/wire/ProtoAdapter;", "Lsc0/i;", "value", "", "c", "(Lsc0/i;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lsc0/i;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lsc0/i;", DateTokenConverter.CONVERTER_KEY, "(Lsc0/i;)Lsc0/i;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<i> {
        a(com.squareup.wire.b bVar, co0.d<i> dVar, o oVar) {
            super(bVar, dVar, "type.googleapis.com/UniversalMessage.SessionInfoRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            k kVarDecode = k.f97943e;
            long jD = reader.d();
            k kVarDecode2 = null;
            Integer numDecode = null;
            rc0.g gVarDecode = null;
            while (true) {
                k kVar = kVarDecode;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new i(kVar, kVarDecode2, numDecode, gVarDecode, reader.e(jD));
                    }
                    if (iG == 1) {
                        kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                    } else if (iG != 2) {
                        if (iG == 3) {
                            numDecode = ProtoAdapter.UINT32.decode(reader);
                        } else if (iG != 4) {
                            reader.m(iG);
                        } else {
                            try {
                                gVarDecode = rc0.g.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            }
                        }
                    }
                }
                kVarDecode = ProtoAdapter.BYTES.decode(reader);
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(l writer, i value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getChallenge(), k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getChallenge());
            }
            ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.getPublic_key());
            ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.getHandle());
            rc0.g.ADAPTER.encodeWithTag(writer, 4, value.getIdentified_key());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(i value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getChallenge(), k.f97943e)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getChallenge());
            }
            return iD + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.getPublic_key()) + ProtoAdapter.UINT32.encodedSizeWithTag(3, value.getHandle()) + rc0.g.ADAPTER.encodedSizeWithTag(4, value.getIdentified_key());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i redact(i value) {
            s.k(value, "value");
            return i.b(value, null, null, null, null, k.f97943e, 15, null);
        }
    }

    public i() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ i b(i iVar, k kVar, k kVar2, Integer num, rc0.g gVar, k kVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = iVar.challenge;
        }
        if ((i11 & 2) != 0) {
            kVar2 = iVar.public_key;
        }
        if ((i11 & 4) != 0) {
            num = iVar.handle;
        }
        if ((i11 & 8) != 0) {
            gVar = iVar.identified_key;
        }
        if ((i11 & 16) != 0) {
            kVar3 = iVar.unknownFields();
        }
        k kVar4 = kVar3;
        Integer num2 = num;
        return iVar.a(kVar, kVar2, num2, gVar, kVar4);
    }

    public final i a(k challenge, k public_key, Integer handle, rc0.g identified_key, k unknownFields) {
        s.k(challenge, "challenge");
        s.k(unknownFields, "unknownFields");
        return new i(challenge, public_key, handle, identified_key, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k getChallenge() {
        return this.challenge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final rc0.g getIdentified_key() {
        return this.identified_key;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return s.f(unknownFields(), iVar.unknownFields()) && s.f(this.challenge, iVar.challenge) && s.f(this.public_key, iVar.public_key) && s.f(this.handle, iVar.handle) && this.identified_key == iVar.identified_key;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getPublic_key() {
        return this.public_key;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.challenge.hashCode()) * 37;
        k kVar = this.public_key;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 37;
        Integer num = this.handle;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        rc0.g gVar = this.identified_key;
        int iHashCode4 = iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m771newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("challenge=" + this.challenge);
        k kVar = this.public_key;
        if (kVar != null) {
            arrayList.add("public_key=" + kVar);
        }
        Integer num = this.handle;
        if (num != null) {
            arrayList.add("handle=" + num);
        }
        rc0.g gVar = this.identified_key;
        if (gVar != null) {
            arrayList.add("identified_key=" + gVar);
        }
        return v.y0(arrayList, ", ", "SessionInfoRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ i(k kVar, k kVar2, Integer num, rc0.g gVar, k kVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? k.f97943e : kVar, (i11 & 2) != 0 ? null : kVar2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : gVar, (i11 & 16) != 0 ? k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m771newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k challenge, k kVar, Integer num, rc0.g gVar, k unknownFields) {
        super(f111102f, unknownFields);
        s.k(challenge, "challenge");
        s.k(unknownFields, "unknownFields");
        this.challenge = challenge;
        this.public_key = kVar;
        this.handle = num;
        this.identified_key = gVar;
        if (x20.d.d(kVar, num, gVar) > 1) {
            throw new IllegalArgumentException("At most one of public_key, handle, identified_key may be non-null");
        }
    }
}
