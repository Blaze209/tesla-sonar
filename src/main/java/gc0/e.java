package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bq\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#Jw\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b)\u00102R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b0\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=¨\u0006>"}, d2 = {"Lgc0/e;", "Lcom/squareup/wire/f;", "", "Lgc0/j;", "not_allowed", "Lgc0/i;", "no_charge_recommended", "Lgc0/g;", "charging_on_excess_solar", "Lgc0/f;", "charging_on_anything", "Lgc0/k;", "user_disabled", "Lgc0/m;", "waiting_for_server", "Lgc0/h;", AnalyticsAttribute.Error, "Lgc0/l;", "user_stopped", "Lokio/k;", "unknownFields", "<init>", "(Lgc0/j;Lgc0/i;Lgc0/g;Lgc0/f;Lgc0/k;Lgc0/m;Lgc0/h;Lgc0/l;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lgc0/j;Lgc0/i;Lgc0/g;Lgc0/f;Lgc0/k;Lgc0/m;Lgc0/h;Lgc0/l;Lokio/k;)Lgc0/e;", "Lgc0/j;", "f", "()Lgc0/j;", "b", "Lgc0/i;", "e", "()Lgc0/i;", "c", "Lgc0/g;", "()Lgc0/g;", DateTokenConverter.CONVERTER_KEY, "Lgc0/f;", "()Lgc0/f;", "Lgc0/k;", "g", "()Lgc0/k;", "Lgc0/m;", IntegerTokenConverter.CONVERTER_KEY, "()Lgc0/m;", "Lgc0/h;", "()Lgc0/h;", "h", "Lgc0/l;", "()Lgc0/l;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.squareup.wire.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProtoAdapter<e> f68002j = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateNotAllowed#ADAPTER", jsonName = "notAllowed", tag = 1)
    private final j not_allowed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateNoChargeRecommended#ADAPTER", jsonName = "noChargeRecommended", tag = 2)
    private final i no_charge_recommended;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateChargingOnExcessSolar#ADAPTER", jsonName = "chargingOnExcessSolar", tag = 3)
    private final g charging_on_excess_solar;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateChargingOnAnything#ADAPTER", jsonName = "chargingOnAnything", tag = 4)
    private final f charging_on_anything;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateUserDisabled#ADAPTER", jsonName = "userDisabled", tag = 6)
    private final k user_disabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateWaitingForServer#ADAPTER", jsonName = "waitingForServer", tag = 7)
    private final m waiting_for_server;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateError#ADAPTER", tag = 8)
    private final h error;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeOnSolarStateUserStopped#ADAPTER", jsonName = "userStopped", tag = 9)
    private final l user_stopped;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/e;", "value", "", "c", "(Lgc0/e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/e;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/e;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/e;)Lgc0/e;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e> {
        a(com.squareup.wire.b bVar, co0.d<e> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ChargeOnSolarState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            j jVarDecode = null;
            i iVarDecode = null;
            g gVarDecode = null;
            f fVarDecode = null;
            k kVarDecode = null;
            m mVarDecode = null;
            h hVarDecode = null;
            l lVarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e(jVarDecode, iVarDecode, gVarDecode, fVarDecode, kVarDecode, mVarDecode, hVarDecode, lVarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        jVarDecode = j.f68080b.decode(reader);
                        break;
                    case 2:
                        iVarDecode = i.f68066c.decode(reader);
                        break;
                    case 3:
                        gVarDecode = g.f68050b.decode(reader);
                        break;
                    case 4:
                        fVarDecode = f.f68042b.decode(reader);
                        break;
                    case 5:
                    default:
                        reader.m(iG);
                        break;
                    case 6:
                        kVarDecode = k.f68096b.decode(reader);
                        break;
                    case 7:
                        mVarDecode = m.f68124b.decode(reader);
                        break;
                    case 8:
                        hVarDecode = h.f68064b.decode(reader);
                        break;
                    case 9:
                        lVarDecode = l.f68104b.decode(reader);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, e value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            j.f68080b.encodeWithTag(writer, 1, value.getNot_allowed());
            i.f68066c.encodeWithTag(writer, 2, value.getNo_charge_recommended());
            g.f68050b.encodeWithTag(writer, 3, value.getCharging_on_excess_solar());
            f.f68042b.encodeWithTag(writer, 4, value.getCharging_on_anything());
            k.f68096b.encodeWithTag(writer, 6, value.getUser_disabled());
            m.f68124b.encodeWithTag(writer, 7, value.getWaiting_for_server());
            h.f68064b.encodeWithTag(writer, 8, value.getError());
            l.f68104b.encodeWithTag(writer, 9, value.getUser_stopped());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.unknownFields().D() + j.f68080b.encodedSizeWithTag(1, value.getNot_allowed()) + i.f68066c.encodedSizeWithTag(2, value.getNo_charge_recommended()) + g.f68050b.encodedSizeWithTag(3, value.getCharging_on_excess_solar()) + f.f68042b.encodedSizeWithTag(4, value.getCharging_on_anything()) + k.f68096b.encodedSizeWithTag(6, value.getUser_disabled()) + m.f68124b.encodedSizeWithTag(7, value.getWaiting_for_server()) + h.f68064b.encodedSizeWithTag(8, value.getError()) + l.f68104b.encodedSizeWithTag(9, value.getUser_stopped());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e redact(e value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            j not_allowed = value.getNot_allowed();
            j jVarRedact = not_allowed != null ? j.f68080b.redact(not_allowed) : null;
            i no_charge_recommended = value.getNo_charge_recommended();
            i iVarRedact = no_charge_recommended != null ? i.f68066c.redact(no_charge_recommended) : null;
            g charging_on_excess_solar = value.getCharging_on_excess_solar();
            g gVarRedact = charging_on_excess_solar != null ? g.f68050b.redact(charging_on_excess_solar) : null;
            f charging_on_anything = value.getCharging_on_anything();
            f fVarRedact = charging_on_anything != null ? f.f68042b.redact(charging_on_anything) : null;
            k user_disabled = value.getUser_disabled();
            k kVarRedact = user_disabled != null ? k.f68096b.redact(user_disabled) : null;
            m waiting_for_server = value.getWaiting_for_server();
            m mVarRedact = waiting_for_server != null ? m.f68124b.redact(waiting_for_server) : null;
            h error = value.getError();
            h hVarRedact = error != null ? h.f68064b.redact(error) : null;
            l user_stopped = value.getUser_stopped();
            return value.a(jVarRedact, iVarRedact, gVarRedact, fVarRedact, kVarRedact, mVarRedact, hVarRedact, user_stopped != null ? l.f68104b.redact(user_stopped) : null, okio.k.f97943e);
        }
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final e a(j not_allowed, i no_charge_recommended, g charging_on_excess_solar, f charging_on_anything, k user_disabled, m waiting_for_server, h error, l user_stopped, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new e(not_allowed, no_charge_recommended, charging_on_excess_solar, charging_on_anything, user_disabled, waiting_for_server, error, user_stopped, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getCharging_on_anything() {
        return this.charging_on_anything;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getCharging_on_excess_solar() {
        return this.charging_on_excess_solar;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i getNo_charge_recommended() {
        return this.no_charge_recommended;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), eVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.not_allowed, eVar.not_allowed) && p013kotlin.jvm.internal.s.f(this.no_charge_recommended, eVar.no_charge_recommended) && p013kotlin.jvm.internal.s.f(this.charging_on_excess_solar, eVar.charging_on_excess_solar) && p013kotlin.jvm.internal.s.f(this.charging_on_anything, eVar.charging_on_anything) && p013kotlin.jvm.internal.s.f(this.user_disabled, eVar.user_disabled) && p013kotlin.jvm.internal.s.f(this.waiting_for_server, eVar.waiting_for_server) && p013kotlin.jvm.internal.s.f(this.error, eVar.error) && p013kotlin.jvm.internal.s.f(this.user_stopped, eVar.user_stopped);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final j getNot_allowed() {
        return this.not_allowed;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getUser_disabled() {
        return this.user_disabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l getUser_stopped() {
        return this.user_stopped;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        j jVar = this.not_allowed;
        int iHashCode2 = (iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 37;
        i iVar = this.no_charge_recommended;
        int iHashCode3 = (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 37;
        g gVar = this.charging_on_excess_solar;
        int iHashCode4 = (iHashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 37;
        f fVar = this.charging_on_anything;
        int iHashCode5 = (iHashCode4 + (fVar != null ? fVar.hashCode() : 0)) * 37;
        k kVar = this.user_disabled;
        int iHashCode6 = (iHashCode5 + (kVar != null ? kVar.hashCode() : 0)) * 37;
        m mVar = this.waiting_for_server;
        int iHashCode7 = (iHashCode6 + (mVar != null ? mVar.hashCode() : 0)) * 37;
        h hVar = this.error;
        int iHashCode8 = (iHashCode7 + (hVar != null ? hVar.hashCode() : 0)) * 37;
        l lVar = this.user_stopped;
        int iHashCode9 = iHashCode8 + (lVar != null ? lVar.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final m getWaiting_for_server() {
        return this.waiting_for_server;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m395newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        j jVar = this.not_allowed;
        if (jVar != null) {
            arrayList.add("not_allowed=" + jVar);
        }
        i iVar = this.no_charge_recommended;
        if (iVar != null) {
            arrayList.add("no_charge_recommended=" + iVar);
        }
        g gVar = this.charging_on_excess_solar;
        if (gVar != null) {
            arrayList.add("charging_on_excess_solar=" + gVar);
        }
        f fVar = this.charging_on_anything;
        if (fVar != null) {
            arrayList.add("charging_on_anything=" + fVar);
        }
        k kVar = this.user_disabled;
        if (kVar != null) {
            arrayList.add("user_disabled=" + kVar);
        }
        m mVar = this.waiting_for_server;
        if (mVar != null) {
            arrayList.add("waiting_for_server=" + mVar);
        }
        h hVar = this.error;
        if (hVar != null) {
            arrayList.add("error=" + hVar);
        }
        l lVar = this.user_stopped;
        if (lVar != null) {
            arrayList.add("user_stopped=" + lVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ChargeOnSolarState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ e(j jVar, i iVar, g gVar, f fVar, k kVar, m mVar, h hVar, l lVar, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : jVar, (i11 & 2) != 0 ? null : iVar, (i11 & 4) != 0 ? null : gVar, (i11 & 8) != 0 ? null : fVar, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : mVar, (i11 & 64) != 0 ? null : hVar, (i11 & 128) != 0 ? null : lVar, (i11 & 256) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m395newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, i iVar, g gVar, f fVar, k kVar, m mVar, h hVar, l lVar, okio.k unknownFields) {
        super(f68002j, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.not_allowed = jVar;
        this.no_charge_recommended = iVar;
        this.charging_on_excess_solar = gVar;
        this.charging_on_anything = fVar;
        this.user_disabled = kVar;
        this.waiting_for_server = mVar;
        this.error = hVar;
        this.user_stopped = lVar;
        if (x20.d.e(jVar, iVar, gVar, fVar, kVar, mVar, hVar, lVar) > 1) {
            throw new IllegalArgumentException("At most one of not_allowed, no_charge_recommended, charging_on_excess_solar, charging_on_anything, user_disabled, waiting_for_server, error, user_stopped may be non-null");
        }
    }
}
