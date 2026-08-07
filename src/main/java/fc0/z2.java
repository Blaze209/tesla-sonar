package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB-\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lfc0/z2;", "Lcom/squareup/wire/f;", "", "", "subscriber_public_key", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "pii_key_expiration", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Lj$/time/Instant;Lokio/k;)Lfc0/z2;", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "Lj$/time/Instant;", "c", "()Lj$/time/Instant;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<z2> f65648d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(z2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "subscriberPublicKey", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String subscriber_public_key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "piiKeyExpiration", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final Instant pii_key_expiration;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/z2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/z2;", "value", "", "c", "(Lfc0/z2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/z2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/z2;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/z2;)Lfc0/z2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<z2> {
        a(com.squareup.wire.b bVar, co0.d<z2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.PiiKeyRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            String strDecode = "";
            Instant instantDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new z2(strDecode, instantDecode, reader.e(jD));
                }
                if (iG == 2) {
                    strDecode = ProtoAdapter.STRING.decode(reader);
                } else if (iG != 4) {
                    reader.m(iG);
                } else {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, z2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (!p013kotlin.jvm.internal.s.f(value.getSubscriber_public_key(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getSubscriber_public_key());
            }
            if (value.getPii_key_expiration() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, value.getPii_key_expiration());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(z2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!p013kotlin.jvm.internal.s.f(value.getSubscriber_public_key(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubscriber_public_key());
            }
            return value.getPii_key_expiration() != null ? iD + ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getPii_key_expiration()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public z2 redact(z2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant pii_key_expiration = value.getPii_key_expiration();
            return z2.b(value, null, pii_key_expiration != null ? ProtoAdapter.INSTANT.redact(pii_key_expiration) : null, okio.k.f97943e, 1, null);
        }
    }

    public z2() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ z2 b(z2 z2Var, String str, Instant instant, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = z2Var.subscriber_public_key;
        }
        if ((i11 & 2) != 0) {
            instant = z2Var.pii_key_expiration;
        }
        if ((i11 & 4) != 0) {
            kVar = z2Var.unknownFields();
        }
        return z2Var.a(str, instant, kVar);
    }

    public final z2 a(String subscriber_public_key, Instant pii_key_expiration, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(subscriber_public_key, "subscriber_public_key");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new z2(subscriber_public_key, pii_key_expiration, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getPii_key_expiration() {
        return this.pii_key_expiration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubscriber_public_key() {
        return this.subscriber_public_key;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), z2Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.subscriber_public_key, z2Var.subscriber_public_key) && p013kotlin.jvm.internal.s.f(this.pii_key_expiration, z2Var.pii_key_expiration);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.subscriber_public_key.hashCode()) * 37;
        Instant instant = this.pii_key_expiration;
        int iHashCode2 = iHashCode + (instant != null ? instant.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m381newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("subscriber_public_key=" + x20.d.i(this.subscriber_public_key));
        Instant instant = this.pii_key_expiration;
        if (instant != null) {
            arrayList.add("pii_key_expiration=" + instant);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "PiiKeyRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ z2(String str, Instant instant, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : instant, (i11 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m381newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(String subscriber_public_key, Instant instant, okio.k unknownFields) {
        super(f65648d, unknownFields);
        p013kotlin.jvm.internal.s.k(subscriber_public_key, "subscriber_public_key");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.subscriber_public_key = subscriber_public_key;
        this.pii_key_expiration = instant;
    }
}
