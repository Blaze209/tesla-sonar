package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$Bk\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJq\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b-\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010*R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b1\u00104R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b+\u0010\u001c¨\u00065"}, d2 = {"Lvc0/u0;", "Lcom/squareup/wire/f;", "", "", "sessionId", "Lvc0/p0;", "rangingType", "Lokio/k;", "addresses", "slotDuration", "rangingInterval", "Lvc0/s0;", "stsMode", "sts", "Lvc0/p2;", "rangingUpdateRate", "intervalSkipCount", "unknownFields", "<init>", "(ILvc0/p0;Lokio/k;IILvc0/s0;Lokio/k;Lvc0/p2;ILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILvc0/p0;Lokio/k;IILvc0/s0;Lokio/k;Lvc0/p2;ILokio/k;)Lvc0/u0;", "I", "h", "b", "Lvc0/p0;", "f", "()Lvc0/p0;", "c", "Lokio/k;", "()Lokio/k;", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "e", "Lvc0/s0;", "k", "()Lvc0/s0;", "g", "j", "Lvc0/p2;", "()Lvc0/p2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ProtoAdapter<u0> f118926k = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(u0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FiraRangingType#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final p0 rangingType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final okio.k addresses;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int slotDuration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int rangingInterval;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FiraSTSMode#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final s0 stsMode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final okio.k sts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.RangingUpdateRate#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final p2 rangingUpdateRate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final int intervalSkipCount;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/u0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/u0;", "value", "", "c", "(Lvc0/u0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/u0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/u0;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/u0;)Lvc0/u0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<u0> {
        a(com.squareup.wire.b bVar, co0.d<u0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.FiraSessionRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0 decode(com.squareup.wire.k reader) {
            okio.k kVar;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p0 p0Var = p0.RANGING_TYPE_UNKNOWN;
            okio.k kVar2 = okio.k.f97943e;
            s0 s0Var = s0.STS_UNKNOWN;
            p2 p2Var = p2.RANGING_UPDATE_RATE_UNKNOWN;
            long jD = reader.d();
            p2 p2VarDecode = p2Var;
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            okio.k kVarDecode = kVar2;
            s0 s0VarDecode = s0Var;
            p0 p0VarDecode = p0Var;
            okio.k kVarDecode2 = kVarDecode;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new u0(iIntValue, p0VarDecode, kVarDecode2, iIntValue2, iIntValue3, s0VarDecode, kVarDecode, p2VarDecode, iIntValue4, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 2:
                        p0VarDecode = p0VarDecode;
                        kVarDecode2 = kVarDecode2;
                        kVar = kVarDecode;
                        try {
                            p0VarDecode = p0.ADAPTER.decode(reader);
                            kVarDecode = kVar;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            kVarDecode = kVar;
                            p0VarDecode = p0VarDecode;
                        }
                        kVarDecode2 = kVarDecode2;
                        break;
                    case 3:
                        kVarDecode2 = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 4:
                    default:
                        reader.m(iG);
                        kVar = kVarDecode;
                        kVarDecode = kVar;
                        p0VarDecode = p0VarDecode;
                        kVarDecode2 = kVarDecode2;
                        break;
                    case 5:
                        iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 6:
                        iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 7:
                        p0VarDecode = p0VarDecode;
                        kVarDecode2 = kVarDecode2;
                        try {
                            s0VarDecode = s0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            kVar = kVarDecode;
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            kVarDecode = kVar;
                        }
                        p0VarDecode = p0VarDecode;
                        kVarDecode2 = kVarDecode2;
                        break;
                    case 8:
                        kVarDecode = ProtoAdapter.BYTES.decode(reader);
                        break;
                    case 9:
                        try {
                            p2VarDecode = p2.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                            kVar = kVarDecode;
                            kVarDecode = kVar;
                            p0VarDecode = p0VarDecode;
                            kVarDecode2 = kVarDecode2;
                        }
                        break;
                    case 10:
                        iIntValue4 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, u0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getSessionId() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getSessionId()));
            }
            if (value.getRangingType() != p0.RANGING_TYPE_UNKNOWN) {
                p0.ADAPTER.encodeWithTag(writer, 2, value.getRangingType());
            }
            okio.k addresses = value.getAddresses();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(addresses, kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.getAddresses());
            }
            if (value.getSlotDuration() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getSlotDuration()));
            }
            if (value.getRangingInterval() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getRangingInterval()));
            }
            if (value.getStsMode() != s0.STS_UNKNOWN) {
                s0.ADAPTER.encodeWithTag(writer, 7, value.getStsMode());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getSts(), kVar)) {
                ProtoAdapter.BYTES.encodeWithTag(writer, 8, value.getSts());
            }
            if (value.getRangingUpdateRate() != p2.RANGING_UPDATE_RATE_UNKNOWN) {
                p2.ADAPTER.encodeWithTag(writer, 9, value.getRangingUpdateRate());
            }
            if (value.getIntervalSkipCount() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 10, Integer.valueOf(value.getIntervalSkipCount()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(u0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getSessionId() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getSessionId()));
            }
            if (value.getRangingType() != p0.RANGING_TYPE_UNKNOWN) {
                iD += p0.ADAPTER.encodedSizeWithTag(2, value.getRangingType());
            }
            okio.k addresses = value.getAddresses();
            okio.k kVar = okio.k.f97943e;
            if (!p013kotlin.jvm.internal.s.f(addresses, kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(3, value.getAddresses());
            }
            if (value.getSlotDuration() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.getSlotDuration()));
            }
            if (value.getRangingInterval() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getRangingInterval()));
            }
            if (value.getStsMode() != s0.STS_UNKNOWN) {
                iD += s0.ADAPTER.encodedSizeWithTag(7, value.getStsMode());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getSts(), kVar)) {
                iD += ProtoAdapter.BYTES.encodedSizeWithTag(8, value.getSts());
            }
            if (value.getRangingUpdateRate() != p2.RANGING_UPDATE_RATE_UNKNOWN) {
                iD += p2.ADAPTER.encodedSizeWithTag(9, value.getRangingUpdateRate());
            }
            return value.getIntervalSkipCount() != 0 ? iD + ProtoAdapter.UINT32.encodedSizeWithTag(10, Integer.valueOf(value.getIntervalSkipCount())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u0 redact(u0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return u0.b(value, 0, null, null, 0, 0, null, null, null, 0, okio.k.f97943e, 511, null);
        }
    }

    public u0() {
        this(0, null, null, 0, 0, null, null, null, 0, null, 1023, null);
    }

    public static /* synthetic */ u0 b(u0 u0Var, int i11, p0 p0Var, okio.k kVar, int i12, int i13, s0 s0Var, okio.k kVar2, p2 p2Var, int i14, okio.k kVar3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = u0Var.sessionId;
        }
        if ((i15 & 2) != 0) {
            p0Var = u0Var.rangingType;
        }
        if ((i15 & 4) != 0) {
            kVar = u0Var.addresses;
        }
        if ((i15 & 8) != 0) {
            i12 = u0Var.slotDuration;
        }
        if ((i15 & 16) != 0) {
            i13 = u0Var.rangingInterval;
        }
        if ((i15 & 32) != 0) {
            s0Var = u0Var.stsMode;
        }
        if ((i15 & 64) != 0) {
            kVar2 = u0Var.sts;
        }
        if ((i15 & 128) != 0) {
            p2Var = u0Var.rangingUpdateRate;
        }
        if ((i15 & 256) != 0) {
            i14 = u0Var.intervalSkipCount;
        }
        if ((i15 & 512) != 0) {
            kVar3 = u0Var.unknownFields();
        }
        int i16 = i14;
        okio.k kVar4 = kVar3;
        okio.k kVar5 = kVar2;
        p2 p2Var2 = p2Var;
        int i17 = i13;
        s0 s0Var2 = s0Var;
        return u0Var.a(i11, p0Var, kVar, i12, i17, s0Var2, kVar5, p2Var2, i16, kVar4);
    }

    public final u0 a(int sessionId, p0 rangingType, okio.k addresses, int slotDuration, int rangingInterval, s0 stsMode, okio.k sts, p2 rangingUpdateRate, int intervalSkipCount, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(rangingType, "rangingType");
        p013kotlin.jvm.internal.s.k(addresses, "addresses");
        p013kotlin.jvm.internal.s.k(stsMode, "stsMode");
        p013kotlin.jvm.internal.s.k(sts, "sts");
        p013kotlin.jvm.internal.s.k(rangingUpdateRate, "rangingUpdateRate");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new u0(sessionId, rangingType, addresses, slotDuration, rangingInterval, stsMode, sts, rangingUpdateRate, intervalSkipCount, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final okio.k getAddresses() {
        return this.addresses;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getIntervalSkipCount() {
        return this.intervalSkipCount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRangingInterval() {
        return this.rangingInterval;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), u0Var.unknownFields()) && this.sessionId == u0Var.sessionId && this.rangingType == u0Var.rangingType && p013kotlin.jvm.internal.s.f(this.addresses, u0Var.addresses) && this.slotDuration == u0Var.slotDuration && this.rangingInterval == u0Var.rangingInterval && this.stsMode == u0Var.stsMode && p013kotlin.jvm.internal.s.f(this.sts, u0Var.sts) && this.rangingUpdateRate == u0Var.rangingUpdateRate && this.intervalSkipCount == u0Var.intervalSkipCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p0 getRangingType() {
        return this.rangingType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final p2 getRangingUpdateRate() {
        return this.rangingUpdateRate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.sessionId)) * 37) + this.rangingType.hashCode()) * 37) + this.addresses.hashCode()) * 37) + Integer.hashCode(this.slotDuration)) * 37) + Integer.hashCode(this.rangingInterval)) * 37) + this.stsMode.hashCode()) * 37) + this.sts.hashCode()) * 37) + this.rangingUpdateRate.hashCode()) * 37) + Integer.hashCode(this.intervalSkipCount);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSlotDuration() {
        return this.slotDuration;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final okio.k getSts() {
        return this.sts;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final s0 getStsMode() {
        return this.stsMode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m841newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("sessionId=" + this.sessionId);
        arrayList.add("rangingType=" + this.rangingType);
        arrayList.add("addresses=" + this.addresses);
        arrayList.add("slotDuration=" + this.slotDuration);
        arrayList.add("rangingInterval=" + this.rangingInterval);
        arrayList.add("stsMode=" + this.stsMode);
        arrayList.add("sts=" + this.sts);
        arrayList.add("rangingUpdateRate=" + this.rangingUpdateRate);
        arrayList.add("intervalSkipCount=" + this.intervalSkipCount);
        return p013kotlin.collections.v.y0(arrayList, ", ", "FiraSessionRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ u0(int i11, p0 p0Var, okio.k kVar, int i12, int i13, s0 s0Var, okio.k kVar2, p2 p2Var, int i14, okio.k kVar3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? p0.RANGING_TYPE_UNKNOWN : p0Var, (i15 & 4) != 0 ? okio.k.f97943e : kVar, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? s0.STS_UNKNOWN : s0Var, (i15 & 64) != 0 ? okio.k.f97943e : kVar2, (i15 & 128) != 0 ? p2.RANGING_UPDATE_RATE_UNKNOWN : p2Var, (i15 & 256) != 0 ? 0 : i14, (i15 & 512) != 0 ? okio.k.f97943e : kVar3);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m841newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(int i11, p0 rangingType, okio.k addresses, int i12, int i13, s0 stsMode, okio.k sts, p2 rangingUpdateRate, int i14, okio.k unknownFields) {
        super(f118926k, unknownFields);
        p013kotlin.jvm.internal.s.k(rangingType, "rangingType");
        p013kotlin.jvm.internal.s.k(addresses, "addresses");
        p013kotlin.jvm.internal.s.k(stsMode, "stsMode");
        p013kotlin.jvm.internal.s.k(sts, "sts");
        p013kotlin.jvm.internal.s.k(rangingUpdateRate, "rangingUpdateRate");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.sessionId = i11;
        this.rangingType = rangingType;
        this.addresses = addresses;
        this.slotDuration = i12;
        this.rangingInterval = i13;
        this.stsMode = stsMode;
        this.sts = sts;
        this.rangingUpdateRate = rangingUpdateRate;
        this.intervalSkipCount = i14;
    }
}
