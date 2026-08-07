package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B}\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0083\u0001\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b)\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b%\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b*\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b'\u0010\"¨\u0006+"}, d2 = {"Lec0/s;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "None", "LargeRear", "SmallRear", "PM216MOSFET", "PM216IGBT", "CorianderSingle", "CorianderDual", "PermanentMagnet", "InductionDual", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lec0/s;", "Lec0/h0;", "f", "()Lec0/h0;", "b", "e", "c", "j", DateTokenConverter.CONVERTER_KEY, "h", "g", IntegerTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s extends com.squareup.wire.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ProtoAdapter<s> f62743k = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(s.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final h0 None;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final h0 LargeRear;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final h0 SmallRear;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final h0 PM216MOSFET;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
    private final h0 PM216IGBT;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
    private final h0 CorianderSingle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)
    private final h0 CorianderDual;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)
    private final h0 PermanentMagnet;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)
    private final h0 InductionDual;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/s$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/s;", "value", "", "c", "(Lec0/s;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/s;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/s;", DateTokenConverter.CONVERTER_KEY, "(Lec0/s;)Lec0/s;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<s> {
        a(com.squareup.wire.b bVar, co0.d<s> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.RearDriveUnit", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            h0 h0VarDecode = null;
            h0 h0VarDecode2 = null;
            h0 h0VarDecode3 = null;
            h0 h0VarDecode4 = null;
            h0 h0VarDecode5 = null;
            h0 h0VarDecode6 = null;
            h0 h0VarDecode7 = null;
            h0 h0VarDecode8 = null;
            h0 h0VarDecode9 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new s(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, h0VarDecode7, h0VarDecode8, h0VarDecode9, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        h0VarDecode = h0.f62622b.decode(reader);
                        break;
                    case 2:
                        h0VarDecode2 = h0.f62622b.decode(reader);
                        break;
                    case 3:
                        h0VarDecode3 = h0.f62622b.decode(reader);
                        break;
                    case 4:
                        h0VarDecode4 = h0.f62622b.decode(reader);
                        break;
                    case 5:
                        h0VarDecode5 = h0.f62622b.decode(reader);
                        break;
                    case 6:
                        h0VarDecode6 = h0.f62622b.decode(reader);
                        break;
                    case 7:
                        h0VarDecode7 = h0.f62622b.decode(reader);
                        break;
                    case 8:
                        h0VarDecode8 = h0.f62622b.decode(reader);
                        break;
                    case 9:
                        h0VarDecode9 = h0.f62622b.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, s value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getNone());
            protoAdapter.encodeWithTag(writer, 2, value.getLargeRear());
            protoAdapter.encodeWithTag(writer, 3, value.getSmallRear());
            protoAdapter.encodeWithTag(writer, 4, value.getPM216MOSFET());
            protoAdapter.encodeWithTag(writer, 5, value.getPM216IGBT());
            protoAdapter.encodeWithTag(writer, 6, value.getCorianderSingle());
            protoAdapter.encodeWithTag(writer, 7, value.getCorianderDual());
            protoAdapter.encodeWithTag(writer, 8, value.getPermanentMagnet());
            protoAdapter.encodeWithTag(writer, 9, value.getInductionDual());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(s value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getNone()) + protoAdapter.encodedSizeWithTag(2, value.getLargeRear()) + protoAdapter.encodedSizeWithTag(3, value.getSmallRear()) + protoAdapter.encodedSizeWithTag(4, value.getPM216MOSFET()) + protoAdapter.encodedSizeWithTag(5, value.getPM216IGBT()) + protoAdapter.encodedSizeWithTag(6, value.getCorianderSingle()) + protoAdapter.encodedSizeWithTag(7, value.getCorianderDual()) + protoAdapter.encodedSizeWithTag(8, value.getPermanentMagnet()) + protoAdapter.encodedSizeWithTag(9, value.getInductionDual());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public s redact(s value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 none = value.getNone();
            h0 h0VarRedact = none != null ? h0.f62622b.redact(none) : null;
            h0 largeRear = value.getLargeRear();
            h0 h0VarRedact2 = largeRear != null ? h0.f62622b.redact(largeRear) : null;
            h0 smallRear = value.getSmallRear();
            h0 h0VarRedact3 = smallRear != null ? h0.f62622b.redact(smallRear) : null;
            h0 pm216mosfet = value.getPM216MOSFET();
            h0 h0VarRedact4 = pm216mosfet != null ? h0.f62622b.redact(pm216mosfet) : null;
            h0 pm216igbt = value.getPM216IGBT();
            h0 h0VarRedact5 = pm216igbt != null ? h0.f62622b.redact(pm216igbt) : null;
            h0 corianderSingle = value.getCorianderSingle();
            h0 h0VarRedact6 = corianderSingle != null ? h0.f62622b.redact(corianderSingle) : null;
            h0 corianderDual = value.getCorianderDual();
            h0 h0VarRedact7 = corianderDual != null ? h0.f62622b.redact(corianderDual) : null;
            h0 permanentMagnet = value.getPermanentMagnet();
            h0 h0VarRedact8 = permanentMagnet != null ? h0.f62622b.redact(permanentMagnet) : null;
            h0 inductionDual = value.getInductionDual();
            return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, h0VarRedact5, h0VarRedact6, h0VarRedact7, h0VarRedact8, inductionDual != null ? h0.f62622b.redact(inductionDual) : null, okio.k.f97943e);
        }
    }

    public s() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public final s a(h0 None, h0 LargeRear, h0 SmallRear, h0 PM216MOSFET, h0 PM216IGBT, h0 CorianderSingle, h0 CorianderDual, h0 PermanentMagnet, h0 InductionDual, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new s(None, LargeRear, SmallRear, PM216MOSFET, PM216IGBT, CorianderSingle, CorianderDual, PermanentMagnet, InductionDual, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getCorianderDual() {
        return this.CorianderDual;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getCorianderSingle() {
        return this.CorianderSingle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getInductionDual() {
        return this.InductionDual;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getLargeRear() {
        return this.LargeRear;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), sVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.None, sVar.None) && p013kotlin.jvm.internal.s.f(this.LargeRear, sVar.LargeRear) && p013kotlin.jvm.internal.s.f(this.SmallRear, sVar.SmallRear) && p013kotlin.jvm.internal.s.f(this.PM216MOSFET, sVar.PM216MOSFET) && p013kotlin.jvm.internal.s.f(this.PM216IGBT, sVar.PM216IGBT) && p013kotlin.jvm.internal.s.f(this.CorianderSingle, sVar.CorianderSingle) && p013kotlin.jvm.internal.s.f(this.CorianderDual, sVar.CorianderDual) && p013kotlin.jvm.internal.s.f(this.PermanentMagnet, sVar.PermanentMagnet) && p013kotlin.jvm.internal.s.f(this.InductionDual, sVar.InductionDual);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h0 getNone() {
        return this.None;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h0 getPM216IGBT() {
        return this.PM216IGBT;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h0 getPM216MOSFET() {
        return this.PM216MOSFET;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.None;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.LargeRear;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.SmallRear;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        h0 h0Var4 = this.PM216MOSFET;
        int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        h0 h0Var5 = this.PM216IGBT;
        int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
        h0 h0Var6 = this.CorianderSingle;
        int iHashCode7 = (iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0)) * 37;
        h0 h0Var7 = this.CorianderDual;
        int iHashCode8 = (iHashCode7 + (h0Var7 != null ? h0Var7.hashCode() : 0)) * 37;
        h0 h0Var8 = this.PermanentMagnet;
        int iHashCode9 = (iHashCode8 + (h0Var8 != null ? h0Var8.hashCode() : 0)) * 37;
        h0 h0Var9 = this.InductionDual;
        int iHashCode10 = iHashCode9 + (h0Var9 != null ? h0Var9.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h0 getPermanentMagnet() {
        return this.PermanentMagnet;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h0 getSmallRear() {
        return this.SmallRear;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m154newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.None;
        if (h0Var != null) {
            arrayList.add("None=" + h0Var);
        }
        h0 h0Var2 = this.LargeRear;
        if (h0Var2 != null) {
            arrayList.add("LargeRear=" + h0Var2);
        }
        h0 h0Var3 = this.SmallRear;
        if (h0Var3 != null) {
            arrayList.add("SmallRear=" + h0Var3);
        }
        h0 h0Var4 = this.PM216MOSFET;
        if (h0Var4 != null) {
            arrayList.add("PM216MOSFET=" + h0Var4);
        }
        h0 h0Var5 = this.PM216IGBT;
        if (h0Var5 != null) {
            arrayList.add("PM216IGBT=" + h0Var5);
        }
        h0 h0Var6 = this.CorianderSingle;
        if (h0Var6 != null) {
            arrayList.add("CorianderSingle=" + h0Var6);
        }
        h0 h0Var7 = this.CorianderDual;
        if (h0Var7 != null) {
            arrayList.add("CorianderDual=" + h0Var7);
        }
        h0 h0Var8 = this.PermanentMagnet;
        if (h0Var8 != null) {
            arrayList.add("PermanentMagnet=" + h0Var8);
        }
        h0 h0Var9 = this.InductionDual;
        if (h0Var9 != null) {
            arrayList.add("InductionDual=" + h0Var9);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "RearDriveUnit{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ s(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? null : h0Var7, (i11 & 128) != 0 ? null : h0Var8, (i11 & 256) != 0 ? null : h0Var9, (i11 & 512) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m154newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, okio.k unknownFields) {
        super(f62743k, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.None = h0Var;
        this.LargeRear = h0Var2;
        this.SmallRear = h0Var3;
        this.PM216MOSFET = h0Var4;
        this.PM216IGBT = h0Var5;
        this.CorianderSingle = h0Var6;
        this.CorianderDual = h0Var7;
        this.PermanentMagnet = h0Var8;
        this.InductionDual = h0Var9;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9) > 1) {
            throw new IllegalArgumentException("At most one of None, LargeRear, SmallRear, PM216MOSFET, PM216IGBT, CorianderSingle, CorianderDual, PermanentMagnet, InductionDual may be non-null");
        }
    }
}
