package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0089\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u008f\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b%\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b&\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b)\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b*\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b,\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#¨\u0006-"}, d2 = {"Lec0/v;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Base", "Recaro", "Executive", "TwoSeat", "FoldFlat", "FoldFlatMotorized", "TwoSeatConsole", "FoldFlatTwoMotor", "FoldFlatTwoMotorHall", "FoldFlatHallBuckles", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lec0/v;", "Lec0/h0;", "b", "()Lec0/h0;", IntegerTokenConverter.CONVERTER_KEY, "c", DateTokenConverter.CONVERTER_KEY, "j", "e", "f", "g", "k", "h", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v extends com.squareup.wire.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ProtoAdapter<v> f62761l = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(v.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final h0 Base;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final h0 Recaro;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final h0 Executive;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final h0 TwoSeat;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
    private final h0 FoldFlat;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
    private final h0 FoldFlatMotorized;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)
    private final h0 TwoSeatConsole;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)
    private final h0 FoldFlatTwoMotor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)
    private final h0 FoldFlatTwoMotorHall;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)
    private final h0 FoldFlatHallBuckles;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/v$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/v;", "value", "", "c", "(Lec0/v;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/v;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/v;", DateTokenConverter.CONVERTER_KEY, "(Lec0/v;)Lec0/v;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<v> {
        a(com.squareup.wire.b bVar, co0.d<v> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.RearSeatType", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v decode(com.squareup.wire.k reader) {
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
            h0 h0VarDecode10 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new v(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, h0VarDecode7, h0VarDecode8, h0VarDecode9, h0VarDecode10, reader.e(jD));
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
                    case 10:
                        h0VarDecode10 = h0.f62622b.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, v value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getBase());
            protoAdapter.encodeWithTag(writer, 2, value.getRecaro());
            protoAdapter.encodeWithTag(writer, 3, value.getExecutive());
            protoAdapter.encodeWithTag(writer, 4, value.getTwoSeat());
            protoAdapter.encodeWithTag(writer, 5, value.getFoldFlat());
            protoAdapter.encodeWithTag(writer, 6, value.getFoldFlatMotorized());
            protoAdapter.encodeWithTag(writer, 7, value.getTwoSeatConsole());
            protoAdapter.encodeWithTag(writer, 8, value.getFoldFlatTwoMotor());
            protoAdapter.encodeWithTag(writer, 9, value.getFoldFlatTwoMotorHall());
            protoAdapter.encodeWithTag(writer, 10, value.getFoldFlatHallBuckles());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(v value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getBase()) + protoAdapter.encodedSizeWithTag(2, value.getRecaro()) + protoAdapter.encodedSizeWithTag(3, value.getExecutive()) + protoAdapter.encodedSizeWithTag(4, value.getTwoSeat()) + protoAdapter.encodedSizeWithTag(5, value.getFoldFlat()) + protoAdapter.encodedSizeWithTag(6, value.getFoldFlatMotorized()) + protoAdapter.encodedSizeWithTag(7, value.getTwoSeatConsole()) + protoAdapter.encodedSizeWithTag(8, value.getFoldFlatTwoMotor()) + protoAdapter.encodedSizeWithTag(9, value.getFoldFlatTwoMotorHall()) + protoAdapter.encodedSizeWithTag(10, value.getFoldFlatHallBuckles());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public v redact(v value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 base = value.getBase();
            h0 h0VarRedact = base != null ? h0.f62622b.redact(base) : null;
            h0 recaro = value.getRecaro();
            h0 h0VarRedact2 = recaro != null ? h0.f62622b.redact(recaro) : null;
            h0 executive = value.getExecutive();
            h0 h0VarRedact3 = executive != null ? h0.f62622b.redact(executive) : null;
            h0 twoSeat = value.getTwoSeat();
            h0 h0VarRedact4 = twoSeat != null ? h0.f62622b.redact(twoSeat) : null;
            h0 foldFlat = value.getFoldFlat();
            h0 h0VarRedact5 = foldFlat != null ? h0.f62622b.redact(foldFlat) : null;
            h0 foldFlatMotorized = value.getFoldFlatMotorized();
            h0 h0VarRedact6 = foldFlatMotorized != null ? h0.f62622b.redact(foldFlatMotorized) : null;
            h0 twoSeatConsole = value.getTwoSeatConsole();
            h0 h0VarRedact7 = twoSeatConsole != null ? h0.f62622b.redact(twoSeatConsole) : null;
            h0 foldFlatTwoMotor = value.getFoldFlatTwoMotor();
            h0 h0VarRedact8 = foldFlatTwoMotor != null ? h0.f62622b.redact(foldFlatTwoMotor) : null;
            h0 foldFlatTwoMotorHall = value.getFoldFlatTwoMotorHall();
            h0 h0VarRedact9 = foldFlatTwoMotorHall != null ? h0.f62622b.redact(foldFlatTwoMotorHall) : null;
            h0 foldFlatHallBuckles = value.getFoldFlatHallBuckles();
            return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, h0VarRedact5, h0VarRedact6, h0VarRedact7, h0VarRedact8, h0VarRedact9, foldFlatHallBuckles != null ? h0.f62622b.redact(foldFlatHallBuckles) : null, okio.k.f97943e);
        }
    }

    public v() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final v a(h0 Base, h0 Recaro, h0 Executive, h0 TwoSeat, h0 FoldFlat, h0 FoldFlatMotorized, h0 TwoSeatConsole, h0 FoldFlatTwoMotor, h0 FoldFlatTwoMotorHall, h0 FoldFlatHallBuckles, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new v(Base, Recaro, Executive, TwoSeat, FoldFlat, FoldFlatMotorized, TwoSeatConsole, FoldFlatTwoMotor, FoldFlatTwoMotorHall, FoldFlatHallBuckles, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getBase() {
        return this.Base;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getExecutive() {
        return this.Executive;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getFoldFlat() {
        return this.FoldFlat;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getFoldFlatHallBuckles() {
        return this.FoldFlatHallBuckles;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof v)) {
            return false;
        }
        v vVar = (v) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), vVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Base, vVar.Base) && p013kotlin.jvm.internal.s.f(this.Recaro, vVar.Recaro) && p013kotlin.jvm.internal.s.f(this.Executive, vVar.Executive) && p013kotlin.jvm.internal.s.f(this.TwoSeat, vVar.TwoSeat) && p013kotlin.jvm.internal.s.f(this.FoldFlat, vVar.FoldFlat) && p013kotlin.jvm.internal.s.f(this.FoldFlatMotorized, vVar.FoldFlatMotorized) && p013kotlin.jvm.internal.s.f(this.TwoSeatConsole, vVar.TwoSeatConsole) && p013kotlin.jvm.internal.s.f(this.FoldFlatTwoMotor, vVar.FoldFlatTwoMotor) && p013kotlin.jvm.internal.s.f(this.FoldFlatTwoMotorHall, vVar.FoldFlatTwoMotorHall) && p013kotlin.jvm.internal.s.f(this.FoldFlatHallBuckles, vVar.FoldFlatHallBuckles);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h0 getFoldFlatMotorized() {
        return this.FoldFlatMotorized;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h0 getFoldFlatTwoMotor() {
        return this.FoldFlatTwoMotor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h0 getFoldFlatTwoMotorHall() {
        return this.FoldFlatTwoMotorHall;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.Base;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.Recaro;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.Executive;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        h0 h0Var4 = this.TwoSeat;
        int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        h0 h0Var5 = this.FoldFlat;
        int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
        h0 h0Var6 = this.FoldFlatMotorized;
        int iHashCode7 = (iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0)) * 37;
        h0 h0Var7 = this.TwoSeatConsole;
        int iHashCode8 = (iHashCode7 + (h0Var7 != null ? h0Var7.hashCode() : 0)) * 37;
        h0 h0Var8 = this.FoldFlatTwoMotor;
        int iHashCode9 = (iHashCode8 + (h0Var8 != null ? h0Var8.hashCode() : 0)) * 37;
        h0 h0Var9 = this.FoldFlatTwoMotorHall;
        int iHashCode10 = (iHashCode9 + (h0Var9 != null ? h0Var9.hashCode() : 0)) * 37;
        h0 h0Var10 = this.FoldFlatHallBuckles;
        int iHashCode11 = iHashCode10 + (h0Var10 != null ? h0Var10.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h0 getRecaro() {
        return this.Recaro;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h0 getTwoSeat() {
        return this.TwoSeat;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final h0 getTwoSeatConsole() {
        return this.TwoSeatConsole;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m156newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.Base;
        if (h0Var != null) {
            arrayList.add("Base=" + h0Var);
        }
        h0 h0Var2 = this.Recaro;
        if (h0Var2 != null) {
            arrayList.add("Recaro=" + h0Var2);
        }
        h0 h0Var3 = this.Executive;
        if (h0Var3 != null) {
            arrayList.add("Executive=" + h0Var3);
        }
        h0 h0Var4 = this.TwoSeat;
        if (h0Var4 != null) {
            arrayList.add("TwoSeat=" + h0Var4);
        }
        h0 h0Var5 = this.FoldFlat;
        if (h0Var5 != null) {
            arrayList.add("FoldFlat=" + h0Var5);
        }
        h0 h0Var6 = this.FoldFlatMotorized;
        if (h0Var6 != null) {
            arrayList.add("FoldFlatMotorized=" + h0Var6);
        }
        h0 h0Var7 = this.TwoSeatConsole;
        if (h0Var7 != null) {
            arrayList.add("TwoSeatConsole=" + h0Var7);
        }
        h0 h0Var8 = this.FoldFlatTwoMotor;
        if (h0Var8 != null) {
            arrayList.add("FoldFlatTwoMotor=" + h0Var8);
        }
        h0 h0Var9 = this.FoldFlatTwoMotorHall;
        if (h0Var9 != null) {
            arrayList.add("FoldFlatTwoMotorHall=" + h0Var9);
        }
        h0 h0Var10 = this.FoldFlatHallBuckles;
        if (h0Var10 != null) {
            arrayList.add("FoldFlatHallBuckles=" + h0Var10);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "RearSeatType{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ v(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, h0 h0Var10, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? null : h0Var7, (i11 & 128) != 0 ? null : h0Var8, (i11 & 256) != 0 ? null : h0Var9, (i11 & 512) != 0 ? null : h0Var10, (i11 & 1024) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m156newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, h0 h0Var10, okio.k unknownFields) {
        super(f62761l, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.Base = h0Var;
        this.Recaro = h0Var2;
        this.Executive = h0Var3;
        this.TwoSeat = h0Var4;
        this.FoldFlat = h0Var5;
        this.FoldFlatMotorized = h0Var6;
        this.TwoSeatConsole = h0Var7;
        this.FoldFlatTwoMotor = h0Var8;
        this.FoldFlatTwoMotorHall = h0Var9;
        this.FoldFlatHallBuckles = h0Var10;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10) > 1) {
            throw new IllegalArgumentException("At most one of Base, Recaro, Executive, TwoSeat, FoldFlat, FoldFlatMotorized, TwoSeatConsole, FoldFlatTwoMotor, FoldFlatTwoMotorHall, FoldFlatHallBuckles may be non-null");
        }
    }
}
