package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B]\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJc\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\"\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lvc0/n0;", "Lcom/squareup/wire/f;", "", "", "rangingTypeBitmask", "stsModeBitmask", "channelBitmask", "preambleIdBitmask", "", "slotDuration", "minRangingInterval", "", "rangingIntervalReconfiguration", "Lokio/k;", "unknownFields", "<init>", "(IIIILjava/util/List;IZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(IIIILjava/util/List;IZLokio/k;)Lvc0/n0;", "I", "g", "b", IntegerTokenConverter.CONVERTER_KEY, "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "Z", "()Z", "Ljava/util/List;", "h", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<n0> f118838i = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(n0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int rangingTypeBitmask;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int stsModeBitmask;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int channelBitmask;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int preambleIdBitmask;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int minRangingInterval;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final boolean rangingIntervalReconfiguration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.PACKED, tag = 5)
    private final List<Integer> slotDuration;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/n0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/n0;", "value", "", "c", "(Lvc0/n0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/n0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/n0;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/n0;)Lvc0/n0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<n0> {
        a(com.squareup.wire.b bVar, co0.d<n0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.FiraCapabilities", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            int iIntValue5 = 0;
            boolean zBooleanValue = false;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new n0(iIntValue, iIntValue2, iIntValue3, iIntValue4, arrayList, iIntValue5, zBooleanValue, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 2:
                        iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 3:
                        iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 4:
                        iIntValue4 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 5:
                        arrayList.add(ProtoAdapter.UINT32.decode(reader));
                        break;
                    case 6:
                        iIntValue5 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 7:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, n0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getRangingTypeBitmask() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getRangingTypeBitmask()));
            }
            if (value.getStsModeBitmask() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getStsModeBitmask()));
            }
            if (value.getChannelBitmask() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getChannelBitmask()));
            }
            if (value.getPreambleIdBitmask() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getPreambleIdBitmask()));
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.asPacked().encodeWithTag(writer, 5, value.h());
            if (value.getMinRangingInterval() != 0) {
                protoAdapter.encodeWithTag(writer, 6, Integer.valueOf(value.getMinRangingInterval()));
            }
            if (value.getRangingIntervalReconfiguration()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.getRangingIntervalReconfiguration()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(n0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getRangingTypeBitmask() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getRangingTypeBitmask()));
            }
            if (value.getStsModeBitmask() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getStsModeBitmask()));
            }
            if (value.getChannelBitmask() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getChannelBitmask()));
            }
            if (value.getPreambleIdBitmask() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getPreambleIdBitmask()));
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int iEncodedSizeWithTag = iD + protoAdapter.asPacked().encodedSizeWithTag(5, value.h());
            if (value.getMinRangingInterval() != 0) {
                iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, Integer.valueOf(value.getMinRangingInterval()));
            }
            return value.getRangingIntervalReconfiguration() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getRangingIntervalReconfiguration())) : iEncodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public n0 redact(n0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return n0.b(value, 0, 0, 0, 0, null, 0, false, okio.k.f97943e, 127, null);
        }
    }

    public n0() {
        this(0, 0, 0, 0, null, 0, false, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n0 b(n0 n0Var, int i11, int i12, int i13, int i14, List list, int i15, boolean z11, okio.k kVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = n0Var.rangingTypeBitmask;
        }
        if ((i16 & 2) != 0) {
            i12 = n0Var.stsModeBitmask;
        }
        if ((i16 & 4) != 0) {
            i13 = n0Var.channelBitmask;
        }
        if ((i16 & 8) != 0) {
            i14 = n0Var.preambleIdBitmask;
        }
        if ((i16 & 16) != 0) {
            list = n0Var.slotDuration;
        }
        if ((i16 & 32) != 0) {
            i15 = n0Var.minRangingInterval;
        }
        if ((i16 & 64) != 0) {
            z11 = n0Var.rangingIntervalReconfiguration;
        }
        if ((i16 & 128) != 0) {
            kVar = n0Var.unknownFields();
        }
        boolean z12 = z11;
        okio.k kVar2 = kVar;
        List list2 = list;
        int i17 = i15;
        return n0Var.a(i11, i12, i13, i14, list2, i17, z12, kVar2);
    }

    public final n0 a(int rangingTypeBitmask, int stsModeBitmask, int channelBitmask, int preambleIdBitmask, List<Integer> slotDuration, int minRangingInterval, boolean rangingIntervalReconfiguration, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(slotDuration, "slotDuration");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new n0(rangingTypeBitmask, stsModeBitmask, channelBitmask, preambleIdBitmask, slotDuration, minRangingInterval, rangingIntervalReconfiguration, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getChannelBitmask() {
        return this.channelBitmask;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinRangingInterval() {
        return this.minRangingInterval;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPreambleIdBitmask() {
        return this.preambleIdBitmask;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), n0Var.unknownFields()) && this.rangingTypeBitmask == n0Var.rangingTypeBitmask && this.stsModeBitmask == n0Var.stsModeBitmask && this.channelBitmask == n0Var.channelBitmask && this.preambleIdBitmask == n0Var.preambleIdBitmask && p013kotlin.jvm.internal.s.f(this.slotDuration, n0Var.slotDuration) && this.minRangingInterval == n0Var.minRangingInterval && this.rangingIntervalReconfiguration == n0Var.rangingIntervalReconfiguration;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRangingIntervalReconfiguration() {
        return this.rangingIntervalReconfiguration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRangingTypeBitmask() {
        return this.rangingTypeBitmask;
    }

    public final List<Integer> h() {
        return this.slotDuration;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.rangingTypeBitmask)) * 37) + Integer.hashCode(this.stsModeBitmask)) * 37) + Integer.hashCode(this.channelBitmask)) * 37) + Integer.hashCode(this.preambleIdBitmask)) * 37) + this.slotDuration.hashCode()) * 37) + Integer.hashCode(this.minRangingInterval)) * 37) + Boolean.hashCode(this.rangingIntervalReconfiguration);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getStsModeBitmask() {
        return this.stsModeBitmask;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m823newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rangingTypeBitmask=" + this.rangingTypeBitmask);
        arrayList.add("stsModeBitmask=" + this.stsModeBitmask);
        arrayList.add("channelBitmask=" + this.channelBitmask);
        arrayList.add("preambleIdBitmask=" + this.preambleIdBitmask);
        if (!this.slotDuration.isEmpty()) {
            arrayList.add("slotDuration=" + this.slotDuration);
        }
        arrayList.add("minRangingInterval=" + this.minRangingInterval);
        arrayList.add("rangingIntervalReconfiguration=" + this.rangingIntervalReconfiguration);
        return p013kotlin.collections.v.y0(arrayList, ", ", "FiraCapabilities{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ n0(int i11, int i12, int i13, int i14, List list, int i15, boolean z11, okio.k kVar, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i11, (i16 & 2) != 0 ? 0 : i12, (i16 & 4) != 0 ? 0 : i13, (i16 & 8) != 0 ? 0 : i14, (i16 & 16) != 0 ? p013kotlin.collections.v.m() : list, (i16 & 32) != 0 ? 0 : i15, (i16 & 64) != 0 ? false : z11, (i16 & 128) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m823newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(int i11, int i12, int i13, int i14, List<Integer> slotDuration, int i15, boolean z11, okio.k unknownFields) {
        super(f118838i, unknownFields);
        p013kotlin.jvm.internal.s.k(slotDuration, "slotDuration");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.rangingTypeBitmask = i11;
        this.stsModeBitmask = i12;
        this.channelBitmask = i13;
        this.preambleIdBitmask = i14;
        this.minRangingInterval = i15;
        this.rangingIntervalReconfiguration = z11;
        this.slotDuration = x20.d.g("slotDuration", slotDuration);
    }
}
