package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJg\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b&\u0010!R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b'\u0010!R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b(\u0010!R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010!R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b)\u0010!¨\u0006*"}, d2 = {"Lvc0/e0;", "Lcom/squareup/wire/f;", "", "Lvc0/f0;", "frontDriverDoor", "frontPassengerDoor", "rearDriverDoor", "rearPassengerDoor", "rearTrunk", "frontTrunk", "chargePort", "tonneau", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lvc0/f0;Lokio/k;)Lvc0/e0;", "Lvc0/f0;", DateTokenConverter.CONVERTER_KEY, "()Lvc0/f0;", "b", "e", "c", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "f", "j", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<e0> f118637j = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final f0 frontDriverDoor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final f0 frontPassengerDoor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final f0 rearDriverDoor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final f0 rearPassengerDoor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final f0 rearTrunk;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final f0 frontTrunk;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final f0 chargePort;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveType_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final f0 tonneau;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/e0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/e0;", "value", "", "c", "(Lvc0/e0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/e0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/e0;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/e0;)Lvc0/e0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e0> {
        a(com.squareup.wire.b bVar, co0.d<e0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.ClosureMoveRequest", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            f0 f0Var = f0.CLOSURE_MOVE_TYPE_NONE;
            long jD = reader.d();
            f0 f0VarDecode = f0Var;
            f0 f0VarDecode2 = f0VarDecode;
            f0 f0VarDecode3 = f0VarDecode2;
            f0 f0VarDecode4 = f0VarDecode3;
            f0 f0VarDecode5 = f0VarDecode4;
            f0 f0VarDecode6 = f0VarDecode5;
            f0 f0VarDecode7 = f0VarDecode6;
            f0 f0VarDecode8 = f0VarDecode7;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e0(f0VarDecode, f0VarDecode2, f0VarDecode3, f0VarDecode4, f0VarDecode5, f0VarDecode6, f0VarDecode7, f0VarDecode8, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        try {
                            f0VarDecode = f0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                        break;
                    case 2:
                        try {
                            f0VarDecode2 = f0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                        }
                        break;
                    case 3:
                        try {
                            f0VarDecode3 = f0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                        }
                        break;
                    case 4:
                        try {
                            f0VarDecode4 = f0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e14.value));
                        }
                        break;
                    case 5:
                        try {
                            f0VarDecode5 = f0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e15.value));
                        }
                        break;
                    case 6:
                        try {
                            f0VarDecode6 = f0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e16.value));
                        }
                        break;
                    case 7:
                        try {
                            f0VarDecode7 = f0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e17) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e17.value));
                        }
                        break;
                    case 8:
                        try {
                            f0VarDecode8 = f0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e18) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e18.value));
                        }
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, e0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            f0 frontDriverDoor = value.getFrontDriverDoor();
            f0 f0Var = f0.CLOSURE_MOVE_TYPE_NONE;
            if (frontDriverDoor != f0Var) {
                f0.ADAPTER.encodeWithTag(writer, 1, value.getFrontDriverDoor());
            }
            if (value.getFrontPassengerDoor() != f0Var) {
                f0.ADAPTER.encodeWithTag(writer, 2, value.getFrontPassengerDoor());
            }
            if (value.getRearDriverDoor() != f0Var) {
                f0.ADAPTER.encodeWithTag(writer, 3, value.getRearDriverDoor());
            }
            if (value.getRearPassengerDoor() != f0Var) {
                f0.ADAPTER.encodeWithTag(writer, 4, value.getRearPassengerDoor());
            }
            if (value.getRearTrunk() != f0Var) {
                f0.ADAPTER.encodeWithTag(writer, 5, value.getRearTrunk());
            }
            if (value.getFrontTrunk() != f0Var) {
                f0.ADAPTER.encodeWithTag(writer, 6, value.getFrontTrunk());
            }
            if (value.getChargePort() != f0Var) {
                f0.ADAPTER.encodeWithTag(writer, 7, value.getChargePort());
            }
            if (value.getTonneau() != f0Var) {
                f0.ADAPTER.encodeWithTag(writer, 8, value.getTonneau());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            f0 frontDriverDoor = value.getFrontDriverDoor();
            f0 f0Var = f0.CLOSURE_MOVE_TYPE_NONE;
            if (frontDriverDoor != f0Var) {
                iD += f0.ADAPTER.encodedSizeWithTag(1, value.getFrontDriverDoor());
            }
            if (value.getFrontPassengerDoor() != f0Var) {
                iD += f0.ADAPTER.encodedSizeWithTag(2, value.getFrontPassengerDoor());
            }
            if (value.getRearDriverDoor() != f0Var) {
                iD += f0.ADAPTER.encodedSizeWithTag(3, value.getRearDriverDoor());
            }
            if (value.getRearPassengerDoor() != f0Var) {
                iD += f0.ADAPTER.encodedSizeWithTag(4, value.getRearPassengerDoor());
            }
            if (value.getRearTrunk() != f0Var) {
                iD += f0.ADAPTER.encodedSizeWithTag(5, value.getRearTrunk());
            }
            if (value.getFrontTrunk() != f0Var) {
                iD += f0.ADAPTER.encodedSizeWithTag(6, value.getFrontTrunk());
            }
            if (value.getChargePort() != f0Var) {
                iD += f0.ADAPTER.encodedSizeWithTag(7, value.getChargePort());
            }
            return value.getTonneau() != f0Var ? iD + f0.ADAPTER.encodedSizeWithTag(8, value.getTonneau()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e0 redact(e0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return e0.b(value, null, null, null, null, null, null, null, null, okio.k.f97943e, 255, null);
        }
    }

    public e0() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ e0 b(e0 e0Var, f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, f0 f0Var5, f0 f0Var6, f0 f0Var7, f0 f0Var8, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f0Var = e0Var.frontDriverDoor;
        }
        if ((i11 & 2) != 0) {
            f0Var2 = e0Var.frontPassengerDoor;
        }
        if ((i11 & 4) != 0) {
            f0Var3 = e0Var.rearDriverDoor;
        }
        if ((i11 & 8) != 0) {
            f0Var4 = e0Var.rearPassengerDoor;
        }
        if ((i11 & 16) != 0) {
            f0Var5 = e0Var.rearTrunk;
        }
        if ((i11 & 32) != 0) {
            f0Var6 = e0Var.frontTrunk;
        }
        if ((i11 & 64) != 0) {
            f0Var7 = e0Var.chargePort;
        }
        if ((i11 & 128) != 0) {
            f0Var8 = e0Var.tonneau;
        }
        if ((i11 & 256) != 0) {
            kVar = e0Var.unknownFields();
        }
        f0 f0Var9 = f0Var8;
        okio.k kVar2 = kVar;
        f0 f0Var10 = f0Var6;
        f0 f0Var11 = f0Var7;
        f0 f0Var12 = f0Var5;
        f0 f0Var13 = f0Var3;
        return e0Var.a(f0Var, f0Var2, f0Var13, f0Var4, f0Var12, f0Var10, f0Var11, f0Var9, kVar2);
    }

    public final e0 a(f0 frontDriverDoor, f0 frontPassengerDoor, f0 rearDriverDoor, f0 rearPassengerDoor, f0 rearTrunk, f0 frontTrunk, f0 chargePort, f0 tonneau, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(frontDriverDoor, "frontDriverDoor");
        p013kotlin.jvm.internal.s.k(frontPassengerDoor, "frontPassengerDoor");
        p013kotlin.jvm.internal.s.k(rearDriverDoor, "rearDriverDoor");
        p013kotlin.jvm.internal.s.k(rearPassengerDoor, "rearPassengerDoor");
        p013kotlin.jvm.internal.s.k(rearTrunk, "rearTrunk");
        p013kotlin.jvm.internal.s.k(frontTrunk, "frontTrunk");
        p013kotlin.jvm.internal.s.k(chargePort, "chargePort");
        p013kotlin.jvm.internal.s.k(tonneau, "tonneau");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new e0(frontDriverDoor, frontPassengerDoor, rearDriverDoor, rearPassengerDoor, rearTrunk, frontTrunk, chargePort, tonneau, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f0 getChargePort() {
        return this.chargePort;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f0 getFrontDriverDoor() {
        return this.frontDriverDoor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final f0 getFrontPassengerDoor() {
        return this.frontPassengerDoor;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), e0Var.unknownFields()) && this.frontDriverDoor == e0Var.frontDriverDoor && this.frontPassengerDoor == e0Var.frontPassengerDoor && this.rearDriverDoor == e0Var.rearDriverDoor && this.rearPassengerDoor == e0Var.rearPassengerDoor && this.rearTrunk == e0Var.rearTrunk && this.frontTrunk == e0Var.frontTrunk && this.chargePort == e0Var.chargePort && this.tonneau == e0Var.tonneau;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f0 getFrontTrunk() {
        return this.frontTrunk;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f0 getRearDriverDoor() {
        return this.rearDriverDoor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f0 getRearPassengerDoor() {
        return this.rearPassengerDoor;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((((unknownFields().hashCode() * 37) + this.frontDriverDoor.hashCode()) * 37) + this.frontPassengerDoor.hashCode()) * 37) + this.rearDriverDoor.hashCode()) * 37) + this.rearPassengerDoor.hashCode()) * 37) + this.rearTrunk.hashCode()) * 37) + this.frontTrunk.hashCode()) * 37) + this.chargePort.hashCode()) * 37) + this.tonneau.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final f0 getRearTrunk() {
        return this.rearTrunk;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final f0 getTonneau() {
        return this.tonneau;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m795newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("frontDriverDoor=" + this.frontDriverDoor);
        arrayList.add("frontPassengerDoor=" + this.frontPassengerDoor);
        arrayList.add("rearDriverDoor=" + this.rearDriverDoor);
        arrayList.add("rearPassengerDoor=" + this.rearPassengerDoor);
        arrayList.add("rearTrunk=" + this.rearTrunk);
        arrayList.add("frontTrunk=" + this.frontTrunk);
        arrayList.add("chargePort=" + this.chargePort);
        arrayList.add("tonneau=" + this.tonneau);
        return p013kotlin.collections.v.y0(arrayList, ", ", "ClosureMoveRequest{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e0(f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, f0 f0Var5, f0 f0Var6, f0 f0Var7, f0 f0Var8, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f0.CLOSURE_MOVE_TYPE_NONE : f0Var, (i11 & 2) != 0 ? f0.CLOSURE_MOVE_TYPE_NONE : f0Var2, (i11 & 4) != 0 ? f0.CLOSURE_MOVE_TYPE_NONE : f0Var3, (i11 & 8) != 0 ? f0.CLOSURE_MOVE_TYPE_NONE : f0Var4, (i11 & 16) != 0 ? f0.CLOSURE_MOVE_TYPE_NONE : f0Var5, (i11 & 32) != 0 ? f0.CLOSURE_MOVE_TYPE_NONE : f0Var6, (i11 & 64) != 0 ? f0.CLOSURE_MOVE_TYPE_NONE : f0Var7, (i11 & 128) != 0 ? f0.CLOSURE_MOVE_TYPE_NONE : f0Var8, (i11 & 256) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m795newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 frontDriverDoor, f0 frontPassengerDoor, f0 rearDriverDoor, f0 rearPassengerDoor, f0 rearTrunk, f0 frontTrunk, f0 chargePort, f0 tonneau, okio.k unknownFields) {
        super(f118637j, unknownFields);
        p013kotlin.jvm.internal.s.k(frontDriverDoor, "frontDriverDoor");
        p013kotlin.jvm.internal.s.k(frontPassengerDoor, "frontPassengerDoor");
        p013kotlin.jvm.internal.s.k(rearDriverDoor, "rearDriverDoor");
        p013kotlin.jvm.internal.s.k(rearPassengerDoor, "rearPassengerDoor");
        p013kotlin.jvm.internal.s.k(rearTrunk, "rearTrunk");
        p013kotlin.jvm.internal.s.k(frontTrunk, "frontTrunk");
        p013kotlin.jvm.internal.s.k(chargePort, "chargePort");
        p013kotlin.jvm.internal.s.k(tonneau, "tonneau");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.frontDriverDoor = frontDriverDoor;
        this.frontPassengerDoor = frontPassengerDoor;
        this.rearDriverDoor = rearDriverDoor;
        this.rearPassengerDoor = rearPassengerDoor;
        this.rearTrunk = rearTrunk;
        this.frontTrunk = frontTrunk;
        this.chargePort = chargePort;
        this.tonneau = tonneau;
    }
}
