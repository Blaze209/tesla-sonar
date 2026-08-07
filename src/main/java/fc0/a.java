package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Be\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!Jk\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b+\u00103R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u00104\u001a\u0004\b'\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lfc0/a;", "Lcom/squareup/wire/f;", "", "Lfc0/g5;", "vehicleAction", "Lrc0/d;", "getSessioninfoRequest", "Ltc0/e;", "vaultCommand", "Lmc0/h;", "managedChargingAction", "Lhc0/b;", "centerDisplayRequest", "Ldc0/c;", "authenticationDameonRequest", "Lwc0/a;", "webrtcRequest", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/g5;Lrc0/d;Ltc0/e;Lmc0/h;Lhc0/b;Ldc0/c;Lwc0/a;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/g5;Lrc0/d;Ltc0/e;Lmc0/h;Lhc0/b;Ldc0/c;Lwc0/a;Lokio/k;)Lfc0/a;", "Lfc0/g5;", "g", "()Lfc0/g5;", "b", "Lrc0/d;", DateTokenConverter.CONVERTER_KEY, "()Lrc0/d;", "c", "Ltc0/e;", "f", "()Ltc0/e;", "Lmc0/h;", "e", "()Lmc0/h;", "Lhc0/b;", "()Lhc0/b;", "Ldc0/c;", "()Ldc0/c;", "Lwc0/a;", "h", "()Lwc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends com.squareup.wire.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProtoAdapter<a> f64840i = new C1334a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(a.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VehicleAction#ADAPTER", tag = 2)
    private final g5 vehicleAction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.signatures.GetSessionInfoRequest#ADAPTER", tag = 3)
    private final rc0.d getSessioninfoRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vault.RemoteCommand#ADAPTER", tag = 4)
    private final tc0.e vaultCommand;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.managedcharging.ManagedChargingAction#ADAPTER", tag = 5)
    private final mc0.h managedChargingAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.centerdisplay.server.Request#ADAPTER", tag = 6)
    private final hc0.b centerDisplayRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.authd.ToAuthdMessage#ADAPTER", tag = 7)
    private final dc0.c authenticationDameonRequest;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.webrtc_comms.Request#ADAPTER", tag = 8)
    private final wc0.a webrtcRequest;

    /* JADX INFO: renamed from: fc0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/a$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/a;", "value", "", "c", "(Lfc0/a;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/a;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/a;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/a;)Lfc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1334a extends ProtoAdapter<a> {
        C1334a(com.squareup.wire.b bVar, co0.d<a> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.Action", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            g5 g5VarDecode = null;
            rc0.d dVarDecode = null;
            tc0.e eVarDecode = null;
            mc0.h hVarDecode = null;
            hc0.b bVarDecode = null;
            dc0.c cVarDecode = null;
            wc0.a aVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a(g5VarDecode, dVarDecode, eVarDecode, hVarDecode, bVarDecode, cVarDecode, aVarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 2:
                        g5VarDecode = g5.V1.decode(reader);
                        break;
                    case 3:
                        dVarDecode = rc0.d.f107661c.decode(reader);
                        break;
                    case 4:
                        eVarDecode = tc0.e.f113151d.decode(reader);
                        break;
                    case 5:
                        hVarDecode = mc0.h.f91782d.decode(reader);
                        break;
                    case 6:
                        bVarDecode = hc0.b.f72537d.decode(reader);
                        break;
                    case 7:
                        cVarDecode = dc0.c.f60447b.decode(reader);
                        break;
                    case 8:
                        aVarDecode = wc0.a.f121662c.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, a value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            g5.V1.encodeWithTag(writer, 2, value.getVehicleAction());
            rc0.d.f107661c.encodeWithTag(writer, 3, value.getGetSessioninfoRequest());
            tc0.e.f113151d.encodeWithTag(writer, 4, value.getVaultCommand());
            mc0.h.f91782d.encodeWithTag(writer, 5, value.getManagedChargingAction());
            hc0.b.f72537d.encodeWithTag(writer, 6, value.getCenterDisplayRequest());
            dc0.c.f60447b.encodeWithTag(writer, 7, value.getAuthenticationDameonRequest());
            wc0.a.f121662c.encodeWithTag(writer, 8, value.getWebrtcRequest());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.unknownFields().D() + g5.V1.encodedSizeWithTag(2, value.getVehicleAction()) + rc0.d.f107661c.encodedSizeWithTag(3, value.getGetSessioninfoRequest()) + tc0.e.f113151d.encodedSizeWithTag(4, value.getVaultCommand()) + mc0.h.f91782d.encodedSizeWithTag(5, value.getManagedChargingAction()) + hc0.b.f72537d.encodedSizeWithTag(6, value.getCenterDisplayRequest()) + dc0.c.f60447b.encodedSizeWithTag(7, value.getAuthenticationDameonRequest()) + wc0.a.f121662c.encodedSizeWithTag(8, value.getWebrtcRequest());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a redact(a value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            g5 vehicleAction = value.getVehicleAction();
            g5 g5VarRedact = vehicleAction != null ? g5.V1.redact(vehicleAction) : null;
            rc0.d getSessioninfoRequest = value.getGetSessioninfoRequest();
            rc0.d dVarRedact = getSessioninfoRequest != null ? rc0.d.f107661c.redact(getSessioninfoRequest) : null;
            tc0.e vaultCommand = value.getVaultCommand();
            tc0.e eVarRedact = vaultCommand != null ? tc0.e.f113151d.redact(vaultCommand) : null;
            mc0.h managedChargingAction = value.getManagedChargingAction();
            mc0.h hVarRedact = managedChargingAction != null ? mc0.h.f91782d.redact(managedChargingAction) : null;
            hc0.b centerDisplayRequest = value.getCenterDisplayRequest();
            hc0.b bVarRedact = centerDisplayRequest != null ? hc0.b.f72537d.redact(centerDisplayRequest) : null;
            dc0.c authenticationDameonRequest = value.getAuthenticationDameonRequest();
            dc0.c cVarRedact = authenticationDameonRequest != null ? dc0.c.f60447b.redact(authenticationDameonRequest) : null;
            wc0.a webrtcRequest = value.getWebrtcRequest();
            return value.a(g5VarRedact, dVarRedact, eVarRedact, hVarRedact, bVarRedact, cVarRedact, webrtcRequest != null ? wc0.a.f121662c.redact(webrtcRequest) : null, okio.k.f97943e);
        }
    }

    public a() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final a a(g5 vehicleAction, rc0.d getSessioninfoRequest, tc0.e vaultCommand, mc0.h managedChargingAction, hc0.b centerDisplayRequest, dc0.c authenticationDameonRequest, wc0.a webrtcRequest, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new a(vehicleAction, getSessioninfoRequest, vaultCommand, managedChargingAction, centerDisplayRequest, authenticationDameonRequest, webrtcRequest, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final dc0.c getAuthenticationDameonRequest() {
        return this.authenticationDameonRequest;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hc0.b getCenterDisplayRequest() {
        return this.centerDisplayRequest;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final rc0.d getGetSessioninfoRequest() {
        return this.getSessioninfoRequest;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final mc0.h getManagedChargingAction() {
        return this.managedChargingAction;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), aVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.vehicleAction, aVar.vehicleAction) && p013kotlin.jvm.internal.s.f(this.getSessioninfoRequest, aVar.getSessioninfoRequest) && p013kotlin.jvm.internal.s.f(this.vaultCommand, aVar.vaultCommand) && p013kotlin.jvm.internal.s.f(this.managedChargingAction, aVar.managedChargingAction) && p013kotlin.jvm.internal.s.f(this.centerDisplayRequest, aVar.centerDisplayRequest) && p013kotlin.jvm.internal.s.f(this.authenticationDameonRequest, aVar.authenticationDameonRequest) && p013kotlin.jvm.internal.s.f(this.webrtcRequest, aVar.webrtcRequest);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final tc0.e getVaultCommand() {
        return this.vaultCommand;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g5 getVehicleAction() {
        return this.vehicleAction;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final wc0.a getWebrtcRequest() {
        return this.webrtcRequest;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        g5 g5Var = this.vehicleAction;
        int iHashCode2 = (iHashCode + (g5Var != null ? g5Var.hashCode() : 0)) * 37;
        rc0.d dVar = this.getSessioninfoRequest;
        int iHashCode3 = (iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        tc0.e eVar = this.vaultCommand;
        int iHashCode4 = (iHashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 37;
        mc0.h hVar = this.managedChargingAction;
        int iHashCode5 = (iHashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 37;
        hc0.b bVar = this.centerDisplayRequest;
        int iHashCode6 = (iHashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 37;
        dc0.c cVar = this.authenticationDameonRequest;
        int iHashCode7 = (iHashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 37;
        wc0.a aVar = this.webrtcRequest;
        int iHashCode8 = iHashCode7 + (aVar != null ? aVar.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m194newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        g5 g5Var = this.vehicleAction;
        if (g5Var != null) {
            arrayList.add("vehicleAction=" + g5Var);
        }
        rc0.d dVar = this.getSessioninfoRequest;
        if (dVar != null) {
            arrayList.add("getSessioninfoRequest=" + dVar);
        }
        tc0.e eVar = this.vaultCommand;
        if (eVar != null) {
            arrayList.add("vaultCommand=" + eVar);
        }
        mc0.h hVar = this.managedChargingAction;
        if (hVar != null) {
            arrayList.add("managedChargingAction=" + hVar);
        }
        hc0.b bVar = this.centerDisplayRequest;
        if (bVar != null) {
            arrayList.add("centerDisplayRequest=" + bVar);
        }
        dc0.c cVar = this.authenticationDameonRequest;
        if (cVar != null) {
            arrayList.add("authenticationDameonRequest=" + cVar);
        }
        wc0.a aVar = this.webrtcRequest;
        if (aVar != null) {
            arrayList.add("webrtcRequest=" + aVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ a(g5 g5Var, rc0.d dVar, tc0.e eVar, mc0.h hVar, hc0.b bVar, dc0.c cVar, wc0.a aVar, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : g5Var, (i11 & 2) != 0 ? null : dVar, (i11 & 4) != 0 ? null : eVar, (i11 & 8) != 0 ? null : hVar, (i11 & 16) != 0 ? null : bVar, (i11 & 32) != 0 ? null : cVar, (i11 & 64) != 0 ? null : aVar, (i11 & 128) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m194newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g5 g5Var, rc0.d dVar, tc0.e eVar, mc0.h hVar, hc0.b bVar, dc0.c cVar, wc0.a aVar, okio.k unknownFields) {
        super(f64840i, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.vehicleAction = g5Var;
        this.getSessioninfoRequest = dVar;
        this.vaultCommand = eVar;
        this.managedChargingAction = hVar;
        this.centerDisplayRequest = bVar;
        this.authenticationDameonRequest = cVar;
        this.webrtcRequest = aVar;
        if (x20.d.e(g5Var, dVar, eVar, hVar, bVar, cVar, aVar) > 1) {
            throw new IllegalArgumentException("At most one of vehicleAction, getSessioninfoRequest, vaultCommand, managedChargingAction, centerDisplayRequest, authenticationDameonRequest, webrtcRequest may be non-null");
        }
    }
}
