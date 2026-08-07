package rc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.q;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BW\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ]\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b$\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b)\u0010\u0018¨\u0006+"}, d2 = {"Lrc0/k;", "Lcom/squareup/wire/f;", "", "", "counter", "Lokio/k;", "publicKey", "epoch", "clock_time", "Lrc0/l;", PermissionsResponse.STATUS_KEY, "handle", "flags", "unknownFields", "<init>", "(ILokio/k;Lokio/k;ILrc0/l;IILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILokio/k;Lokio/k;ILrc0/l;IILokio/k;)Lrc0/k;", "I", DateTokenConverter.CONVERTER_KEY, "b", "Lokio/k;", "h", "()Lokio/k;", "c", "e", "Lrc0/l;", IntegerTokenConverter.CONVERTER_KEY, "()Lrc0/l;", "f", "g", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends com.squareup.wire.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<k> f107686i = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(k.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 1)
    private final int counter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 2)
    private final okio.k publicKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = q.a.OMIT_IDENTITY, tag = 3)
    private final okio.k epoch;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", jsonName = "clockTime", label = q.a.OMIT_IDENTITY, tag = 4)
    private final int clock_time;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.tesla.generated.signatures.Session_Info_Status#ADAPTER", label = q.a.OMIT_IDENTITY, tag = 5)
    private final l status;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 6)
    private final int handle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = q.a.OMIT_IDENTITY, tag = 7)
    private final int flags;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"rc0/k$a", "Lcom/squareup/wire/ProtoAdapter;", "Lrc0/k;", "value", "", "c", "(Lrc0/k;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lrc0/k;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lrc0/k;", DateTokenConverter.CONVERTER_KEY, "(Lrc0/k;)Lrc0/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k> {
        a(com.squareup.wire.b bVar, co0.d<k> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/Signatures.SessionInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            okio.k kVar = okio.k.f97943e;
            l lVar = l.SESSION_INFO_STATUS_OK;
            long jD = reader.d();
            l lVarDecode = lVar;
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            okio.k kVarDecode = kVar;
            okio.k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new k(iIntValue, kVarDecode, kVarDecode2, iIntValue2, lVarDecode, iIntValue3, iIntValue4, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        continue;
                    case 2:
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                        continue;
                    case 3:
                        kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                        continue;
                    case 4:
                        iIntValue2 = ProtoAdapter.FIXED32.decode(reader).intValue();
                        continue;
                    case 5:
                        try {
                            lVarDecode = l.ADAPTER.decode(reader);
                            continue;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            kVarDecode2 = kVarDecode2;
                            lVarDecode = lVarDecode;
                        }
                        break;
                    case 6:
                        iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                        continue;
                    case 7:
                        iIntValue4 = ProtoAdapter.UINT32.decode(reader).intValue();
                        continue;
                    default:
                        reader.m(iG);
                        break;
                }
                kVarDecode2 = kVarDecode2;
                lVarDecode = lVarDecode;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (value.getCounter() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getCounter()));
            }
            okio.k publicKey = value.getPublicKey();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(publicKey, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getPublicKey());
            }
            if (!s.f(value.getEpoch(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getEpoch());
            }
            if (value.getClock_time() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 4, Integer.valueOf(value.getClock_time()));
            }
            if (value.getStatus() != l.SESSION_INFO_STATUS_OK) {
                l.ADAPTER.encodeWithTag(writer, 5, value.getStatus());
            }
            if (value.getHandle() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getHandle()));
            }
            if (value.getFlags() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 7, Integer.valueOf(value.getFlags()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getCounter() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getCounter()));
            }
            okio.k publicKey = value.getPublicKey();
            okio.k kVar = okio.k.f97943e;
            if (!s.f(publicKey, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getPublicKey());
            }
            if (!s.f(value.getEpoch(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getEpoch());
            }
            if (value.getClock_time() != 0) {
                iD += ProtoAdapter.FIXED32.encodedSizeWithTag(4, Integer.valueOf(value.getClock_time()));
            }
            if (value.getStatus() != l.SESSION_INFO_STATUS_OK) {
                iD += l.ADAPTER.encodedSizeWithTag(5, value.getStatus());
            }
            if (value.getHandle() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getHandle()));
            }
            return value.getFlags() != 0 ? iD + ProtoAdapter.UINT32.encodedSizeWithTag(7, Integer.valueOf(value.getFlags())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k redact(k value) {
            s.k(value, "value");
            return k.b(value, 0, null, null, 0, null, 0, 0, okio.k.f97943e, 127, null);
        }
    }

    public k() {
        this(0, null, null, 0, null, 0, 0, null, 255, null);
    }

    public static /* synthetic */ k b(k kVar, int i11, okio.k kVar2, okio.k kVar3, int i12, l lVar, int i13, int i14, okio.k kVar4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = kVar.counter;
        }
        if ((i15 & 2) != 0) {
            kVar2 = kVar.publicKey;
        }
        if ((i15 & 4) != 0) {
            kVar3 = kVar.epoch;
        }
        if ((i15 & 8) != 0) {
            i12 = kVar.clock_time;
        }
        if ((i15 & 16) != 0) {
            lVar = kVar.status;
        }
        if ((i15 & 32) != 0) {
            i13 = kVar.handle;
        }
        if ((i15 & 64) != 0) {
            i14 = kVar.flags;
        }
        if ((i15 & 128) != 0) {
            kVar4 = kVar.unknownFields();
        }
        int i16 = i14;
        okio.k kVar5 = kVar4;
        l lVar2 = lVar;
        int i17 = i13;
        return kVar.a(i11, kVar2, kVar3, i12, lVar2, i17, i16, kVar5);
    }

    public final k a(int counter, okio.k publicKey, okio.k epoch, int clock_time, l status, int handle, int flags, okio.k unknownFields) {
        s.k(publicKey, "publicKey");
        s.k(epoch, "epoch");
        s.k(status, "status");
        s.k(unknownFields, "unknownFields");
        return new k(counter, publicKey, epoch, clock_time, status, handle, flags, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getClock_time() {
        return this.clock_time;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final okio.k getEpoch() {
        return this.epoch;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return s.f(unknownFields(), kVar.unknownFields()) && this.counter == kVar.counter && s.f(this.publicKey, kVar.publicKey) && s.f(this.epoch, kVar.epoch) && this.clock_time == kVar.clock_time && this.status == kVar.status && this.handle == kVar.handle && this.flags == kVar.flags;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final okio.k getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.counter)) * 37) + this.publicKey.hashCode()) * 37) + this.epoch.hashCode()) * 37) + Integer.hashCode(this.clock_time)) * 37) + this.status.hashCode()) * 37) + Integer.hashCode(this.handle)) * 37) + Integer.hashCode(this.flags);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final l getStatus() {
        return this.status;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m762newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("counter=" + this.counter);
        arrayList.add("publicKey=" + this.publicKey);
        arrayList.add("epoch=" + this.epoch);
        arrayList.add("clock_time=" + this.clock_time);
        arrayList.add("status=" + this.status);
        arrayList.add("handle=" + this.handle);
        arrayList.add("flags=" + this.flags);
        return v.y0(arrayList, ", ", "SessionInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ k(int i11, okio.k kVar, okio.k kVar2, int i12, l lVar, int i13, int i14, okio.k kVar3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? okio.k.f97943e : kVar, (i15 & 4) != 0 ? okio.k.f97943e : kVar2, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? l.SESSION_INFO_STATUS_OK : lVar, (i15 & 32) != 0 ? 0 : i13, (i15 & 64) != 0 ? 0 : i14, (i15 & 128) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m762newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i11, okio.k publicKey, okio.k epoch, int i12, l status, int i13, int i14, okio.k unknownFields) {
        super(f107686i, unknownFields);
        s.k(publicKey, "publicKey");
        s.k(epoch, "epoch");
        s.k(status, "status");
        s.k(unknownFields, "unknownFields");
        this.counter = i11;
        this.publicKey = publicKey;
        this.epoch = epoch;
        this.clock_time = i12;
        this.status = status;
        this.handle = i13;
        this.flags = i14;
    }
}
