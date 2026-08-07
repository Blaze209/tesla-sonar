package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lvc0/u1;", "Lcom/squareup/wire/f;", "", "Lvc0/t;", "sessionId", "Lokio/k;", "accessoryConfigurationData", "unknownFields", "<init>", "(Lvc0/t;Lokio/k;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/t;Lokio/k;Lokio/k;)Lvc0/u1;", "Lvc0/t;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/t;", "b", "Lokio/k;", "c", "()Lokio/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ProtoAdapter<u1> f118937d = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(u1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.BLEEndpoint_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final t sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k accessoryConfigurationData;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/u1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/u1;", "value", "", "c", "(Lvc0/u1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/u1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/u1;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/u1;)Lvc0/u1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<u1> {
        a(com.squareup.wire.b bVar, co0.d<u1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.NISessionRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            t tVarDecode = t.BLE_ENDPOINT_NONE;
            okio.k kVarDecode = okio.k.f97943e;
            long jD = reader.d();
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new u1(tVarDecode, kVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    try {
                        tVarDecode = t.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                    }
                } else if (iG != 2) {
                    reader.m(iG);
                } else {
                    kVarDecode = ProtoAdapter.BYTES.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, u1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSessionId() != t.BLE_ENDPOINT_NONE) {
                t.ADAPTER.encodeWithTag(writer, 1, value.getSessionId());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getAccessoryConfigurationData(), okio.k.f97943e)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getAccessoryConfigurationData());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(u1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSessionId() != t.BLE_ENDPOINT_NONE) {
                iD += t.ADAPTER.encodedSizeWithTag(1, value.getSessionId());
            }
            return !p013kotlin.jvm.internal.s.f(value.getAccessoryConfigurationData(), okio.k.f97943e) ? iD + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getAccessoryConfigurationData()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u1 redact(u1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return u1.b(value, null, null, okio.k.f97943e, 3, null);
        }
    }

    public u1() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ u1 b(u1 u1Var, t tVar, okio.k kVar, okio.k kVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tVar = u1Var.sessionId;
        }
        if ((i11 & 2) != 0) {
            kVar = u1Var.accessoryConfigurationData;
        }
        if ((i11 & 4) != 0) {
            kVar2 = u1Var.unknownFields();
        }
        return u1Var.a(tVar, kVar, kVar2);
    }

    public final u1 a(t sessionId, okio.k accessoryConfigurationData, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(sessionId, "sessionId");
        p013kotlin.jvm.internal.s.k(accessoryConfigurationData, "accessoryConfigurationData");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new u1(sessionId, accessoryConfigurationData, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getAccessoryConfigurationData() {
        return this.accessoryConfigurationData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final t getSessionId() {
        return this.sessionId;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), u1Var.unknownFields()) && this.sessionId == u1Var.sessionId && p013kotlin.jvm.internal.s.f(this.accessoryConfigurationData, u1Var.accessoryConfigurationData);
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.sessionId.hashCode()) * 37) + this.accessoryConfigurationData.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m842newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sessionId=" + this.sessionId);
        arrayList.add("accessoryConfigurationData=" + this.accessoryConfigurationData);
        return p013kotlin.collections.v.y0(arrayList, ", ", "NISessionRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ u1(t tVar, okio.k kVar, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? t.BLE_ENDPOINT_NONE : tVar, (i11 & 2) != 0 ? okio.k.f97943e : kVar, (i11 & 4) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m842newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(t sessionId, okio.k accessoryConfigurationData, okio.k unknownFields) {
        super(f118937d, unknownFields);
        p013kotlin.jvm.internal.s.k(sessionId, "sessionId");
        p013kotlin.jvm.internal.s.k(accessoryConfigurationData, "accessoryConfigurationData");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.sessionId = sessionId;
        this.accessoryConfigurationData = accessoryConfigurationData;
    }
}
