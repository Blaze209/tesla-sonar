package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lfc0/a3;", "Lcom/squareup/wire/f;", "", "Lokio/k;", "encrypted_pii_key", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "pii_key_expiration", "subscriber_public_key_expiration", "unknownFields", "<init>", "(Lokio/k;Lj$/time/Instant;Lj$/time/Instant;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lokio/k;Lj$/time/Instant;Lj$/time/Instant;Lokio/k;)Lfc0/a3;", "Lokio/k;", "c", "()Lokio/k;", "b", "Lj$/time/Instant;", DateTokenConverter.CONVERTER_KEY, "()Lj$/time/Instant;", "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<a3> f64864e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(a3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "encryptedPiiKey", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k encrypted_pii_key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "piiKeyExpiration", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final Instant pii_key_expiration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "subscriberPublicKeyExpiration", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final Instant subscriber_public_key_expiration;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/a3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/a3;", "value", "", "c", "(Lfc0/a3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/a3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/a3;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/a3;)Lfc0/a3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<a3> {
        a(com.squareup.wire.b bVar, co0.d<a3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PiiKeyResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            Instant instantDecode = null;
            Instant instantDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a3(kVarDecode, instantDecode, instantDecode2, reader.e(jD));
                }
                if (iG == 2) {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                } else if (iG == 3) {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, a3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getEncrypted_pii_key(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getEncrypted_pii_key());
            }
            if (value.getPii_key_expiration() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, value.getPii_key_expiration());
            }
            if (value.getSubscriber_public_key_expiration() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.getSubscriber_public_key_expiration());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getEncrypted_pii_key(), okio.k.f97943e)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getEncrypted_pii_key());
            }
            if (value.getPii_key_expiration() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getPii_key_expiration());
            }
            return value.getSubscriber_public_key_expiration() != null ? iD + ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getSubscriber_public_key_expiration()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a3 redact(a3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant pii_key_expiration = value.getPii_key_expiration();
            Instant instantRedact = pii_key_expiration != null ? ProtoAdapter.INSTANT.redact(pii_key_expiration) : null;
            Instant subscriber_public_key_expiration = value.getSubscriber_public_key_expiration();
            return a3.b(value, null, instantRedact, subscriber_public_key_expiration != null ? ProtoAdapter.INSTANT.redact(subscriber_public_key_expiration) : null, okio.k.f97943e, 1, null);
        }
    }

    public a3() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ a3 b(a3 a3Var, okio.k kVar, Instant instant, Instant instant2, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = a3Var.encrypted_pii_key;
        }
        if ((i11 & 2) != 0) {
            instant = a3Var.pii_key_expiration;
        }
        if ((i11 & 4) != 0) {
            instant2 = a3Var.subscriber_public_key_expiration;
        }
        if ((i11 & 8) != 0) {
            kVar2 = a3Var.unknownFields();
        }
        return a3Var.a(kVar, instant, instant2, kVar2);
    }

    public final a3 a(okio.k encrypted_pii_key, Instant pii_key_expiration, Instant subscriber_public_key_expiration, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(encrypted_pii_key, "encrypted_pii_key");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new a3(encrypted_pii_key, pii_key_expiration, subscriber_public_key_expiration, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getEncrypted_pii_key() {
        return this.encrypted_pii_key;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getPii_key_expiration() {
        return this.pii_key_expiration;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Instant getSubscriber_public_key_expiration() {
        return this.subscriber_public_key_expiration;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), a3Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.encrypted_pii_key, a3Var.encrypted_pii_key) && p013kotlin.jvm.internal.s.f(this.pii_key_expiration, a3Var.pii_key_expiration) && p013kotlin.jvm.internal.s.f(this.subscriber_public_key_expiration, a3Var.subscriber_public_key_expiration);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.encrypted_pii_key.hashCode()) * 37;
        Instant instant = this.pii_key_expiration;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.subscriber_public_key_expiration;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m198newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("encrypted_pii_key=" + this.encrypted_pii_key);
        Instant instant = this.pii_key_expiration;
        if (instant != null) {
            arrayList.add("pii_key_expiration=" + instant);
        }
        Instant instant2 = this.subscriber_public_key_expiration;
        if (instant2 != null) {
            arrayList.add("subscriber_public_key_expiration=" + instant2);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "PiiKeyResponse{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a3(okio.k kVar, Instant instant, Instant instant2, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? okio.k.f97943e : kVar, (i11 & 2) != 0 ? null : instant, (i11 & 4) != 0 ? null : instant2, (i11 & 8) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m198newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(okio.k encrypted_pii_key, Instant instant, Instant instant2, okio.k unknownFields) {
        super(f64864e, unknownFields);
        p013kotlin.jvm.internal.s.k(encrypted_pii_key, "encrypted_pii_key");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.encrypted_pii_key = encrypted_pii_key;
        this.pii_key_expiration = instant;
        this.subscriber_public_key_expiration = instant2;
    }
}
