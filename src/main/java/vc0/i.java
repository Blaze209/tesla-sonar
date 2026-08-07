package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b#\u0010(¨\u0006)"}, d2 = {"Lvc0/i;", "Lcom/squareup/wire/f;", "", "", "timestamp", "Lvc0/j;", "peerRemovedPairingInformation", "Lvc0/i2;", "phoneLogForHandlePulledWithoutAuthentication", "Lvc0/h;", "bondingStarted", "Lokio/k;", "unknownFields", "<init>", "(ILvc0/j;Lvc0/i2;Lvc0/h;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILvc0/j;Lvc0/i2;Lvc0/h;Lokio/k;)Lvc0/i;", "I", "f", "b", "Lvc0/j;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/j;", "c", "Lvc0/i2;", "e", "()Lvc0/i2;", "Lvc0/h;", "()Lvc0/h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends com.squareup.wire.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ProtoAdapter<i> f118736f = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(i.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int timestamp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppEventPeerRemovedPairingInformation#ADAPTER", tag = 2)
    private final j peerRemovedPairingInformation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PhoneLogForHandlePulledWithoutAuthentication#ADAPTER", tag = 3)
    private final i2 phoneLogForHandlePulledWithoutAuthentication;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppEventBondingStarted#ADAPTER", tag = 5)
    private final h bondingStarted;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/i$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/i;", "value", "", "c", "(Lvc0/i;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/i;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/i;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/i;)Lvc0/i;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<i> {
        a(com.squareup.wire.b bVar, co0.d<i> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.AppEventLog", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            j jVarDecode = null;
            int iIntValue = 0;
            i2 i2VarDecode = null;
            h hVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new i(iIntValue, jVarDecode, i2VarDecode, hVarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    iIntValue = ProtoAdapter.FIXED32.decode(reader).intValue();
                } else if (iG == 2) {
                    jVarDecode = j.f118776c.decode(reader);
                } else if (iG == 3) {
                    i2VarDecode = i2.f118750p.decode(reader);
                } else if (iG != 5) {
                    reader.m(iG);
                } else {
                    hVarDecode = h.f118709b.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, i value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != 0) {
                ProtoAdapter.FIXED32.encodeWithTag(writer, 1, Integer.valueOf(value.getTimestamp()));
            }
            j.f118776c.encodeWithTag(writer, 2, value.getPeerRemovedPairingInformation());
            i2.f118750p.encodeWithTag(writer, 3, value.getPhoneLogForHandlePulledWithoutAuthentication());
            h.f118709b.encodeWithTag(writer, 5, value.getBondingStarted());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(i value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != 0) {
                iD += ProtoAdapter.FIXED32.encodedSizeWithTag(1, Integer.valueOf(value.getTimestamp()));
            }
            return iD + j.f118776c.encodedSizeWithTag(2, value.getPeerRemovedPairingInformation()) + i2.f118750p.encodedSizeWithTag(3, value.getPhoneLogForHandlePulledWithoutAuthentication()) + h.f118709b.encodedSizeWithTag(5, value.getBondingStarted());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i redact(i value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            j peerRemovedPairingInformation = value.getPeerRemovedPairingInformation();
            j jVarRedact = peerRemovedPairingInformation != null ? j.f118776c.redact(peerRemovedPairingInformation) : null;
            i2 phoneLogForHandlePulledWithoutAuthentication = value.getPhoneLogForHandlePulledWithoutAuthentication();
            i2 i2VarRedact = phoneLogForHandlePulledWithoutAuthentication != null ? i2.f118750p.redact(phoneLogForHandlePulledWithoutAuthentication) : null;
            h bondingStarted = value.getBondingStarted();
            return i.b(value, 0, jVarRedact, i2VarRedact, bondingStarted != null ? h.f118709b.redact(bondingStarted) : null, okio.k.f97943e, 1, null);
        }
    }

    public i() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ i b(i iVar, int i11, j jVar, i2 i2Var, h hVar, okio.k kVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iVar.timestamp;
        }
        if ((i12 & 2) != 0) {
            jVar = iVar.peerRemovedPairingInformation;
        }
        if ((i12 & 4) != 0) {
            i2Var = iVar.phoneLogForHandlePulledWithoutAuthentication;
        }
        if ((i12 & 8) != 0) {
            hVar = iVar.bondingStarted;
        }
        if ((i12 & 16) != 0) {
            kVar = iVar.unknownFields();
        }
        okio.k kVar2 = kVar;
        i2 i2Var2 = i2Var;
        return iVar.a(i11, jVar, i2Var2, hVar, kVar2);
    }

    public final i a(int timestamp, j peerRemovedPairingInformation, i2 phoneLogForHandlePulledWithoutAuthentication, h bondingStarted, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new i(timestamp, peerRemovedPairingInformation, phoneLogForHandlePulledWithoutAuthentication, bondingStarted, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h getBondingStarted() {
        return this.bondingStarted;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getPeerRemovedPairingInformation() {
        return this.peerRemovedPairingInformation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i2 getPhoneLogForHandlePulledWithoutAuthentication() {
        return this.phoneLogForHandlePulledWithoutAuthentication;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), iVar.unknownFields()) && this.timestamp == iVar.timestamp && p013kotlin.jvm.internal.s.f(this.peerRemovedPairingInformation, iVar.peerRemovedPairingInformation) && p013kotlin.jvm.internal.s.f(this.phoneLogForHandlePulledWithoutAuthentication, iVar.phoneLogForHandlePulledWithoutAuthentication) && p013kotlin.jvm.internal.s.f(this.bondingStarted, iVar.bondingStarted);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + Integer.hashCode(this.timestamp)) * 37;
        j jVar = this.peerRemovedPairingInformation;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 37;
        i2 i2Var = this.phoneLogForHandlePulledWithoutAuthentication;
        int iHashCode3 = (iHashCode2 + (i2Var != null ? i2Var.hashCode() : 0)) * 37;
        h hVar = this.bondingStarted;
        int iHashCode4 = iHashCode3 + (hVar != null ? hVar.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m805newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("timestamp=" + this.timestamp);
        j jVar = this.peerRemovedPairingInformation;
        if (jVar != null) {
            arrayList.add("peerRemovedPairingInformation=" + jVar);
        }
        i2 i2Var = this.phoneLogForHandlePulledWithoutAuthentication;
        if (i2Var != null) {
            arrayList.add("phoneLogForHandlePulledWithoutAuthentication=" + i2Var);
        }
        h hVar = this.bondingStarted;
        if (hVar != null) {
            arrayList.add("bondingStarted=" + hVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "AppEventLog{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ i(int i11, j jVar, i2 i2Var, h hVar, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : jVar, (i12 & 4) != 0 ? null : i2Var, (i12 & 8) != 0 ? null : hVar, (i12 & 16) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m805newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i11, j jVar, i2 i2Var, h hVar, okio.k unknownFields) {
        super(f118736f, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = i11;
        this.peerRemovedPairingInformation = jVar;
        this.phoneLogForHandlePulledWithoutAuthentication = i2Var;
        this.bondingStarted = hVar;
        if (x20.d.d(jVar, i2Var, hVar) > 1) {
            throw new IllegalArgumentException("At most one of peerRemovedPairingInformation, phoneLogForHandlePulledWithoutAuthentication, bondingStarted may be non-null");
        }
    }
}
