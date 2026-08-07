package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import j$.time.Instant;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\"\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\b\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lfc0/b3;", "Lcom/squareup/wire/f;", "", "", "ping_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "local_timestamp", "last_remote_timestamp", "Lokio/k;", "unknownFields", "<init>", "(ILj$/time/Instant;Lj$/time/Instant;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILj$/time/Instant;Lj$/time/Instant;Lokio/k;)Lfc0/b3;", "I", "e", "b", "Lj$/time/Instant;", DateTokenConverter.CONVERTER_KEY, "()Lj$/time/Instant;", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ProtoAdapter<b3> f64892e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(b3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "pingId", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int ping_id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "localTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final Instant local_timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "lastRemoteTimestamp", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final Instant last_remote_timestamp;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/b3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/b3;", "value", "", "c", "(Lfc0/b3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/b3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/b3;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/b3;)Lfc0/b3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b3> {
        a(com.squareup.wire.b bVar, co0.d<b3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.Ping", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            int iIntValue = 0;
            Instant instantDecode = null;
            Instant instantDecode2 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new b3(iIntValue, instantDecode, instantDecode2, reader.e(jD));
                }
                if (iG == 1) {
                    iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                } else if (iG == 2) {
                    instantDecode = ProtoAdapter.INSTANT.decode(reader);
                } else if (iG != 3) {
                    reader.m(iG);
                } else {
                    instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, b3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getPing_id() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 1, Integer.valueOf(value.getPing_id()));
            }
            if (value.getLocal_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 2, value.getLocal_timestamp());
            }
            if (value.getLast_remote_timestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 3, value.getLast_remote_timestamp());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getPing_id() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(1, Integer.valueOf(value.getPing_id()));
            }
            if (value.getLocal_timestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(2, value.getLocal_timestamp());
            }
            return value.getLast_remote_timestamp() != null ? iD + ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getLast_remote_timestamp()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b3 redact(b3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant local_timestamp = value.getLocal_timestamp();
            Instant instantRedact = local_timestamp != null ? ProtoAdapter.INSTANT.redact(local_timestamp) : null;
            Instant last_remote_timestamp = value.getLast_remote_timestamp();
            return b3.b(value, 0, instantRedact, last_remote_timestamp != null ? ProtoAdapter.INSTANT.redact(last_remote_timestamp) : null, okio.k.f97943e, 1, null);
        }
    }

    public b3() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ b3 b(b3 b3Var, int i11, Instant instant, Instant instant2, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = b3Var.ping_id;
        }
        if ((i12 & 2) != 0) {
            instant = b3Var.local_timestamp;
        }
        if ((i12 & 4) != 0) {
            instant2 = b3Var.last_remote_timestamp;
        }
        if ((i12 & 8) != 0) {
            kVar = b3Var.unknownFields();
        }
        return b3Var.a(i11, instant, instant2, kVar);
    }

    public final b3 a(int ping_id, Instant local_timestamp, Instant last_remote_timestamp, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new b3(ping_id, local_timestamp, last_remote_timestamp, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getLast_remote_timestamp() {
        return this.last_remote_timestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Instant getLocal_timestamp() {
        return this.local_timestamp;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPing_id() {
        return this.ping_id;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), b3Var.unknownFields()) && this.ping_id == b3Var.ping_id && p013kotlin.jvm.internal.s.f(this.local_timestamp, b3Var.local_timestamp) && p013kotlin.jvm.internal.s.f(this.last_remote_timestamp, b3Var.last_remote_timestamp);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.ping_id)) * 37;
        Instant instant = this.local_timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.last_remote_timestamp;
        int iHashCode3 = iHashCode2 + (instant2 != null ? instant2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m206newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ping_id=" + this.ping_id);
        Instant instant = this.local_timestamp;
        if (instant != null) {
            arrayList.add("local_timestamp=" + instant);
        }
        Instant instant2 = this.last_remote_timestamp;
        if (instant2 != null) {
            arrayList.add("last_remote_timestamp=" + instant2);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "Ping{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b3(int i11, Instant instant, Instant instant2, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : instant, (i12 & 4) != 0 ? null : instant2, (i12 & 8) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m206newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(int i11, Instant instant, Instant instant2, okio.k unknownFields) {
        super(f64892e, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.ping_id = i11;
        this.local_timestamp = instant;
        this.last_remote_timestamp = instant2;
    }
}
