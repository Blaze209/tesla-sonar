package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bD\u0018\u0000 w2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001AB\u008d\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0002H\u0017¢\u0006\u0004\b1\u00102J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0093\u0002\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\b>\u0010?R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\be\u0010gR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010h\u001a\u0004\bi\u0010jR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bZ\u0010mR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010n\u001a\u0004\bR\u0010oR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010p\u001a\u0004\bF\u0010qR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010r\u001a\u0004\bN\u0010sR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010t\u001a\u0004\b^\u0010uR\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010v\u001a\u0004\bw\u0010xR\u001c\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010y\u001a\u0004\bV\u0010zR\u001c\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010{\u001a\u0004\bk\u0010|R\u001c\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010}\u001a\u0004\bJ\u0010~¨\u0006\u007f"}, d2 = {"Lfc0/l3;", "Lcom/squareup/wire/f;", "", "Lfc0/b;", "actionStatus", "Lfc0/u5;", "vehicleData", "Lrc0/k;", "getSessionInfoResponse", "Lfc0/x4;", "streamMessage", "Lfc0/r2;", "getNearbyChargingSites", "Lfc0/y5;", "vehicleDataSubscriptionResponse", "Lfc0/e6;", "vitalsSubscriptionResponse", "Lfc0/b3;", "ping", "Lfc0/a3;", "piiKeyResponse", "Lfc0/e3;", "pseudonymSyncResponse", "Lfc0/f1;", "getRateTariffResponse", "Lfc0/o2;", "navigationRouteResponse", "Lfc0/v0;", "getManagedChargingSitesResponse", "Lfc0/h0;", "getChargeOnSolarFeatureResponse", "Lfc0/d;", "addManagedChargingSiteResponse", "Lhc0/c;", "centerDisplayResponse", "Lfc0/z0;", "getMessagesResponse", "Lwc0/b;", "webrtcResponse", "Lfc0/s0;", "getLocalProfilesResponse", "Lfc0/z1;", "keysInfoResponse", "Lfc0/h;", "bandwidthTestResponse", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/b;Lfc0/u5;Lrc0/k;Lfc0/x4;Lfc0/r2;Lfc0/y5;Lfc0/e6;Lfc0/b3;Lfc0/a3;Lfc0/e3;Lfc0/f1;Lfc0/o2;Lfc0/v0;Lfc0/h0;Lfc0/d;Lhc0/c;Lfc0/z0;Lwc0/b;Lfc0/s0;Lfc0/z1;Lfc0/h;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/b;Lfc0/u5;Lrc0/k;Lfc0/x4;Lfc0/r2;Lfc0/y5;Lfc0/e6;Lfc0/b3;Lfc0/a3;Lfc0/e3;Lfc0/f1;Lfc0/o2;Lfc0/v0;Lfc0/h0;Lfc0/d;Lhc0/c;Lfc0/z0;Lwc0/b;Lfc0/s0;Lfc0/z1;Lfc0/h;Lokio/k;)Lfc0/l3;", "Lfc0/b;", "b", "()Lfc0/b;", "Lfc0/u5;", "s", "()Lfc0/u5;", "c", "Lrc0/k;", "l", "()Lrc0/k;", DateTokenConverter.CONVERTER_KEY, "Lfc0/x4;", "r", "()Lfc0/x4;", "e", "Lfc0/r2;", "j", "()Lfc0/r2;", "f", "Lfc0/y5;", "t", "()Lfc0/y5;", "g", "Lfc0/e6;", "u", "()Lfc0/e6;", "h", "Lfc0/b3;", "p", "()Lfc0/b3;", IntegerTokenConverter.CONVERTER_KEY, "Lfc0/a3;", "o", "()Lfc0/a3;", "Lfc0/e3;", "q", "()Lfc0/e3;", "k", "Lfc0/f1;", "()Lfc0/f1;", "Lfc0/o2;", "n", "()Lfc0/o2;", "m", "Lfc0/v0;", "()Lfc0/v0;", "Lfc0/h0;", "()Lfc0/h0;", "Lfc0/d;", "()Lfc0/d;", "Lhc0/c;", "()Lhc0/c;", "Lfc0/z0;", "()Lfc0/z0;", "Lwc0/b;", "v", "()Lwc0/b;", "Lfc0/s0;", "()Lfc0/s0;", "Lfc0/z1;", "()Lfc0/z1;", "Lfc0/h;", "()Lfc0/h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ProtoAdapter<l3> f65204w = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(l3.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.ActionStatus#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final b actionStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VehicleData#ADAPTER", tag = 2)
    private final u5 vehicleData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.signatures.SessionInfo#ADAPTER", tag = 3)
    private final rc0.k getSessionInfoResponse;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.StreamMessage#ADAPTER", tag = 4)
    private final x4 streamMessage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.NearbyChargingSites#ADAPTER", tag = 5)
    private final r2 getNearbyChargingSites;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VehicleDataSubscriptionResponse#ADAPTER", tag = 6)
    private final y5 vehicleDataSubscriptionResponse;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VitalsSubscriptionResponse#ADAPTER", tag = 8)
    private final e6 vitalsSubscriptionResponse;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.Ping#ADAPTER", tag = 9)
    private final b3 ping;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PiiKeyResponse#ADAPTER", tag = 10)
    private final a3 piiKeyResponse;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PseudonymSyncResponse#ADAPTER", tag = 11)
    private final e3 pseudonymSyncResponse;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetRateTariffResponse#ADAPTER", tag = 12)
    private final f1 getRateTariffResponse;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.NavigationRouteResponse#ADAPTER", tag = 13)
    private final o2 navigationRouteResponse;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetManagedChargingSitesResponse#ADAPTER", tag = 14)
    private final v0 getManagedChargingSitesResponse;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetChargeOnSolarFeatureResponse#ADAPTER", tag = 15)
    private final h0 getChargeOnSolarFeatureResponse;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.AddManagedChargingSiteResponse#ADAPTER", tag = 16)
    private final d addManagedChargingSiteResponse;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.centerdisplay.server.Response#ADAPTER", tag = 17)
    private final hc0.c centerDisplayResponse;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetMessagesResponse#ADAPTER", tag = 18)
    private final z0 getMessagesResponse;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.webrtc_comms.Response#ADAPTER", tag = 19)
    private final wc0.b webrtcResponse;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetLocalProfilesResponse#ADAPTER", tag = 20)
    private final s0 getLocalProfilesResponse;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.KeysInfoResponse#ADAPTER", tag = 24)
    private final z1 keysInfoResponse;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.BandwidthTestResponse#ADAPTER", tag = 25)
    private final h bandwidthTestResponse;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/l3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/l3;", "value", "", "c", "(Lfc0/l3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/l3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/l3;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/l3;)Lfc0/l3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<l3> {
        a(com.squareup.wire.b bVar, co0.d<l3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.Response", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l3 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            u5 u5VarDecode = null;
            rc0.k kVarDecode = null;
            x4 x4VarDecode = null;
            r2 r2VarDecode = null;
            y5 y5VarDecode = null;
            e6 e6VarDecode = null;
            b3 b3VarDecode = null;
            a3 a3VarDecode = null;
            e3 e3VarDecode = null;
            f1 f1VarDecode = null;
            o2 o2VarDecode = null;
            v0 v0VarDecode = null;
            h0 h0VarDecode = null;
            d dVarDecode = null;
            hc0.c cVarDecode = null;
            z0 z0VarDecode = null;
            wc0.b bVarDecode = null;
            s0 s0VarDecode = null;
            z1 z1VarDecode = null;
            h hVarDecode = null;
            b bVarDecode2 = null;
            while (true) {
                int iG = reader.g();
                u5 u5Var = u5VarDecode;
                if (iG == -1) {
                    return new l3(bVarDecode2, u5Var, kVarDecode, x4VarDecode, r2VarDecode, y5VarDecode, e6VarDecode, b3VarDecode, a3VarDecode, e3VarDecode, f1VarDecode, o2VarDecode, v0VarDecode, h0VarDecode, dVarDecode, cVarDecode, z0VarDecode, bVarDecode, s0VarDecode, z1VarDecode, hVarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        bVarDecode2 = b.f64880d.decode(reader);
                        break;
                    case 2:
                        u5VarDecode = u5.F.decode(reader);
                        continue;
                    case 3:
                        kVarDecode = rc0.k.f107686i.decode(reader);
                        break;
                    case 4:
                        x4VarDecode = x4.f65588d.decode(reader);
                        break;
                    case 5:
                        r2VarDecode = r2.f65365f.decode(reader);
                        break;
                    case 6:
                        y5VarDecode = y5.f65634d.decode(reader);
                        break;
                    case 7:
                    case 21:
                    case 22:
                    case 23:
                    default:
                        reader.m(iG);
                        break;
                    case 8:
                        e6VarDecode = e6.f64981d.decode(reader);
                        break;
                    case 9:
                        b3VarDecode = b3.f64892e.decode(reader);
                        break;
                    case 10:
                        a3VarDecode = a3.f64864e.decode(reader);
                        break;
                    case 11:
                        e3VarDecode = e3.f64972c.decode(reader);
                        break;
                    case 12:
                        f1VarDecode = f1.f64990c.decode(reader);
                        break;
                    case 13:
                        o2VarDecode = o2.f65278d.decode(reader);
                        break;
                    case 14:
                        v0VarDecode = v0.f65506c.decode(reader);
                        break;
                    case 15:
                        h0VarDecode = h0.f65088c.decode(reader);
                        break;
                    case 16:
                        dVarDecode = d.f64934d.decode(reader);
                        break;
                    case 17:
                        cVarDecode = hc0.c.f72541c.decode(reader);
                        break;
                    case 18:
                        z0VarDecode = z0.f65642c.decode(reader);
                        break;
                    case 19:
                        bVarDecode = wc0.b.f121665c.decode(reader);
                        break;
                    case 20:
                        s0VarDecode = s0.f65387c.decode(reader);
                        break;
                    case 24:
                        z1VarDecode = z1.f65645c.decode(reader);
                        break;
                    case 25:
                        hVarDecode = h.f65084d.decode(reader);
                        break;
                }
                u5VarDecode = u5Var;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, l3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getActionStatus() != null) {
                b.f64880d.encodeWithTag(writer, 1, value.getActionStatus());
            }
            u5.F.encodeWithTag(writer, 2, value.getVehicleData());
            rc0.k.f107686i.encodeWithTag(writer, 3, value.getGetSessionInfoResponse());
            x4.f65588d.encodeWithTag(writer, 4, value.getStreamMessage());
            r2.f65365f.encodeWithTag(writer, 5, value.getGetNearbyChargingSites());
            y5.f65634d.encodeWithTag(writer, 6, value.getVehicleDataSubscriptionResponse());
            e6.f64981d.encodeWithTag(writer, 8, value.getVitalsSubscriptionResponse());
            b3.f64892e.encodeWithTag(writer, 9, value.getPing());
            a3.f64864e.encodeWithTag(writer, 10, value.getPiiKeyResponse());
            e3.f64972c.encodeWithTag(writer, 11, value.getPseudonymSyncResponse());
            f1.f64990c.encodeWithTag(writer, 12, value.getGetRateTariffResponse());
            o2.f65278d.encodeWithTag(writer, 13, value.getNavigationRouteResponse());
            v0.f65506c.encodeWithTag(writer, 14, value.getGetManagedChargingSitesResponse());
            h0.f65088c.encodeWithTag(writer, 15, value.getGetChargeOnSolarFeatureResponse());
            d.f64934d.encodeWithTag(writer, 16, value.getAddManagedChargingSiteResponse());
            hc0.c.f72541c.encodeWithTag(writer, 17, value.getCenterDisplayResponse());
            z0.f65642c.encodeWithTag(writer, 18, value.getGetMessagesResponse());
            wc0.b.f121665c.encodeWithTag(writer, 19, value.getWebrtcResponse());
            s0.f65387c.encodeWithTag(writer, 20, value.getGetLocalProfilesResponse());
            z1.f65645c.encodeWithTag(writer, 24, value.getKeysInfoResponse());
            h.f65084d.encodeWithTag(writer, 25, value.getBandwidthTestResponse());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(l3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getActionStatus() != null) {
                iD += b.f64880d.encodedSizeWithTag(1, value.getActionStatus());
            }
            return iD + u5.F.encodedSizeWithTag(2, value.getVehicleData()) + rc0.k.f107686i.encodedSizeWithTag(3, value.getGetSessionInfoResponse()) + x4.f65588d.encodedSizeWithTag(4, value.getStreamMessage()) + r2.f65365f.encodedSizeWithTag(5, value.getGetNearbyChargingSites()) + y5.f65634d.encodedSizeWithTag(6, value.getVehicleDataSubscriptionResponse()) + e6.f64981d.encodedSizeWithTag(8, value.getVitalsSubscriptionResponse()) + b3.f64892e.encodedSizeWithTag(9, value.getPing()) + a3.f64864e.encodedSizeWithTag(10, value.getPiiKeyResponse()) + e3.f64972c.encodedSizeWithTag(11, value.getPseudonymSyncResponse()) + f1.f64990c.encodedSizeWithTag(12, value.getGetRateTariffResponse()) + o2.f65278d.encodedSizeWithTag(13, value.getNavigationRouteResponse()) + v0.f65506c.encodedSizeWithTag(14, value.getGetManagedChargingSitesResponse()) + h0.f65088c.encodedSizeWithTag(15, value.getGetChargeOnSolarFeatureResponse()) + d.f64934d.encodedSizeWithTag(16, value.getAddManagedChargingSiteResponse()) + hc0.c.f72541c.encodedSizeWithTag(17, value.getCenterDisplayResponse()) + z0.f65642c.encodedSizeWithTag(18, value.getGetMessagesResponse()) + wc0.b.f121665c.encodedSizeWithTag(19, value.getWebrtcResponse()) + s0.f65387c.encodedSizeWithTag(20, value.getGetLocalProfilesResponse()) + z1.f65645c.encodedSizeWithTag(24, value.getKeysInfoResponse()) + h.f65084d.encodedSizeWithTag(25, value.getBandwidthTestResponse());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public l3 redact(l3 value) {
            z1 z1Var;
            wc0.b bVar;
            h hVarRedact;
            p013kotlin.jvm.internal.s.k(value, "value");
            b actionStatus = value.getActionStatus();
            b bVarRedact = actionStatus != null ? b.f64880d.redact(actionStatus) : null;
            u5 vehicleData = value.getVehicleData();
            u5 u5VarRedact = vehicleData != null ? u5.F.redact(vehicleData) : null;
            rc0.k getSessionInfoResponse = value.getGetSessionInfoResponse();
            rc0.k kVarRedact = getSessionInfoResponse != null ? rc0.k.f107686i.redact(getSessionInfoResponse) : null;
            x4 streamMessage = value.getStreamMessage();
            x4 x4VarRedact = streamMessage != null ? x4.f65588d.redact(streamMessage) : null;
            r2 getNearbyChargingSites = value.getGetNearbyChargingSites();
            r2 r2VarRedact = getNearbyChargingSites != null ? r2.f65365f.redact(getNearbyChargingSites) : null;
            y5 vehicleDataSubscriptionResponse = value.getVehicleDataSubscriptionResponse();
            y5 y5VarRedact = vehicleDataSubscriptionResponse != null ? y5.f65634d.redact(vehicleDataSubscriptionResponse) : null;
            e6 vitalsSubscriptionResponse = value.getVitalsSubscriptionResponse();
            e6 e6VarRedact = vitalsSubscriptionResponse != null ? e6.f64981d.redact(vitalsSubscriptionResponse) : null;
            b3 ping = value.getPing();
            b3 b3VarRedact = ping != null ? b3.f64892e.redact(ping) : null;
            a3 piiKeyResponse = value.getPiiKeyResponse();
            a3 a3VarRedact = piiKeyResponse != null ? a3.f64864e.redact(piiKeyResponse) : null;
            e3 pseudonymSyncResponse = value.getPseudonymSyncResponse();
            e3 e3VarRedact = pseudonymSyncResponse != null ? e3.f64972c.redact(pseudonymSyncResponse) : null;
            f1 getRateTariffResponse = value.getGetRateTariffResponse();
            f1 f1VarRedact = getRateTariffResponse != null ? f1.f64990c.redact(getRateTariffResponse) : null;
            o2 navigationRouteResponse = value.getNavigationRouteResponse();
            o2 o2VarRedact = navigationRouteResponse != null ? o2.f65278d.redact(navigationRouteResponse) : null;
            v0 getManagedChargingSitesResponse = value.getGetManagedChargingSitesResponse();
            v0 v0VarRedact = getManagedChargingSitesResponse != null ? v0.f65506c.redact(getManagedChargingSitesResponse) : null;
            h0 getChargeOnSolarFeatureResponse = value.getGetChargeOnSolarFeatureResponse();
            h0 h0VarRedact = getChargeOnSolarFeatureResponse != null ? h0.f65088c.redact(getChargeOnSolarFeatureResponse) : null;
            d addManagedChargingSiteResponse = value.getAddManagedChargingSiteResponse();
            b bVar2 = bVarRedact;
            d dVarRedact = addManagedChargingSiteResponse != null ? d.f64934d.redact(addManagedChargingSiteResponse) : null;
            hc0.c centerDisplayResponse = value.getCenterDisplayResponse();
            d dVar = dVarRedact;
            hc0.c cVarRedact = centerDisplayResponse != null ? hc0.c.f72541c.redact(centerDisplayResponse) : null;
            z0 getMessagesResponse = value.getGetMessagesResponse();
            hc0.c cVar = cVarRedact;
            z0 z0VarRedact = getMessagesResponse != null ? z0.f65642c.redact(getMessagesResponse) : null;
            wc0.b webrtcResponse = value.getWebrtcResponse();
            z0 z0Var = z0VarRedact;
            wc0.b bVarRedact2 = webrtcResponse != null ? wc0.b.f121665c.redact(webrtcResponse) : null;
            s0 getLocalProfilesResponse = value.getGetLocalProfilesResponse();
            wc0.b bVar3 = bVarRedact2;
            s0 s0VarRedact = getLocalProfilesResponse != null ? s0.f65387c.redact(getLocalProfilesResponse) : null;
            z1 keysInfoResponse = value.getKeysInfoResponse();
            s0 s0Var = s0VarRedact;
            z1 z1VarRedact = keysInfoResponse != null ? z1.f65645c.redact(keysInfoResponse) : null;
            h bandwidthTestResponse = value.getBandwidthTestResponse();
            if (bandwidthTestResponse != null) {
                hVarRedact = h.f65084d.redact(bandwidthTestResponse);
                bVar = bVar3;
                z1Var = z1VarRedact;
            } else {
                z1Var = z1VarRedact;
                bVar = bVar3;
                hVarRedact = null;
            }
            return value.a(bVar2, u5VarRedact, kVarRedact, x4VarRedact, r2VarRedact, y5VarRedact, e6VarRedact, b3VarRedact, a3VarRedact, e3VarRedact, f1VarRedact, o2VarRedact, v0VarRedact, h0VarRedact, dVar, cVar, z0Var, bVar, s0Var, z1Var, hVarRedact, okio.k.f97943e);
        }
    }

    public l3() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public final l3 a(b actionStatus, u5 vehicleData, rc0.k getSessionInfoResponse, x4 streamMessage, r2 getNearbyChargingSites, y5 vehicleDataSubscriptionResponse, e6 vitalsSubscriptionResponse, b3 ping, a3 piiKeyResponse, e3 pseudonymSyncResponse, f1 getRateTariffResponse, o2 navigationRouteResponse, v0 getManagedChargingSitesResponse, h0 getChargeOnSolarFeatureResponse, d addManagedChargingSiteResponse, hc0.c centerDisplayResponse, z0 getMessagesResponse, wc0.b webrtcResponse, s0 getLocalProfilesResponse, z1 keysInfoResponse, h bandwidthTestResponse, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new l3(actionStatus, vehicleData, getSessionInfoResponse, streamMessage, getNearbyChargingSites, vehicleDataSubscriptionResponse, vitalsSubscriptionResponse, ping, piiKeyResponse, pseudonymSyncResponse, getRateTariffResponse, navigationRouteResponse, getManagedChargingSitesResponse, getChargeOnSolarFeatureResponse, addManagedChargingSiteResponse, centerDisplayResponse, getMessagesResponse, webrtcResponse, getLocalProfilesResponse, keysInfoResponse, bandwidthTestResponse, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getActionStatus() {
        return this.actionStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getAddManagedChargingSiteResponse() {
        return this.addManagedChargingSiteResponse;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h getBandwidthTestResponse() {
        return this.bandwidthTestResponse;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hc0.c getCenterDisplayResponse() {
        return this.centerDisplayResponse;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), l3Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.actionStatus, l3Var.actionStatus) && p013kotlin.jvm.internal.s.f(this.vehicleData, l3Var.vehicleData) && p013kotlin.jvm.internal.s.f(this.getSessionInfoResponse, l3Var.getSessionInfoResponse) && p013kotlin.jvm.internal.s.f(this.streamMessage, l3Var.streamMessage) && p013kotlin.jvm.internal.s.f(this.getNearbyChargingSites, l3Var.getNearbyChargingSites) && p013kotlin.jvm.internal.s.f(this.vehicleDataSubscriptionResponse, l3Var.vehicleDataSubscriptionResponse) && p013kotlin.jvm.internal.s.f(this.vitalsSubscriptionResponse, l3Var.vitalsSubscriptionResponse) && p013kotlin.jvm.internal.s.f(this.ping, l3Var.ping) && p013kotlin.jvm.internal.s.f(this.piiKeyResponse, l3Var.piiKeyResponse) && p013kotlin.jvm.internal.s.f(this.pseudonymSyncResponse, l3Var.pseudonymSyncResponse) && p013kotlin.jvm.internal.s.f(this.getRateTariffResponse, l3Var.getRateTariffResponse) && p013kotlin.jvm.internal.s.f(this.navigationRouteResponse, l3Var.navigationRouteResponse) && p013kotlin.jvm.internal.s.f(this.getManagedChargingSitesResponse, l3Var.getManagedChargingSitesResponse) && p013kotlin.jvm.internal.s.f(this.getChargeOnSolarFeatureResponse, l3Var.getChargeOnSolarFeatureResponse) && p013kotlin.jvm.internal.s.f(this.addManagedChargingSiteResponse, l3Var.addManagedChargingSiteResponse) && p013kotlin.jvm.internal.s.f(this.centerDisplayResponse, l3Var.centerDisplayResponse) && p013kotlin.jvm.internal.s.f(this.getMessagesResponse, l3Var.getMessagesResponse) && p013kotlin.jvm.internal.s.f(this.webrtcResponse, l3Var.webrtcResponse) && p013kotlin.jvm.internal.s.f(this.getLocalProfilesResponse, l3Var.getLocalProfilesResponse) && p013kotlin.jvm.internal.s.f(this.keysInfoResponse, l3Var.keysInfoResponse) && p013kotlin.jvm.internal.s.f(this.bandwidthTestResponse, l3Var.bandwidthTestResponse);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h0 getGetChargeOnSolarFeatureResponse() {
        return this.getChargeOnSolarFeatureResponse;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final s0 getGetLocalProfilesResponse() {
        return this.getLocalProfilesResponse;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final v0 getGetManagedChargingSitesResponse() {
        return this.getManagedChargingSitesResponse;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        b bVar = this.actionStatus;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 37;
        u5 u5Var = this.vehicleData;
        int iHashCode3 = (iHashCode2 + (u5Var != null ? u5Var.hashCode() : 0)) * 37;
        rc0.k kVar = this.getSessionInfoResponse;
        int iHashCode4 = (iHashCode3 + (kVar != null ? kVar.hashCode() : 0)) * 37;
        x4 x4Var = this.streamMessage;
        int iHashCode5 = (iHashCode4 + (x4Var != null ? x4Var.hashCode() : 0)) * 37;
        r2 r2Var = this.getNearbyChargingSites;
        int iHashCode6 = (iHashCode5 + (r2Var != null ? r2Var.hashCode() : 0)) * 37;
        y5 y5Var = this.vehicleDataSubscriptionResponse;
        int iHashCode7 = (iHashCode6 + (y5Var != null ? y5Var.hashCode() : 0)) * 37;
        e6 e6Var = this.vitalsSubscriptionResponse;
        int iHashCode8 = (iHashCode7 + (e6Var != null ? e6Var.hashCode() : 0)) * 37;
        b3 b3Var = this.ping;
        int iHashCode9 = (iHashCode8 + (b3Var != null ? b3Var.hashCode() : 0)) * 37;
        a3 a3Var = this.piiKeyResponse;
        int iHashCode10 = (iHashCode9 + (a3Var != null ? a3Var.hashCode() : 0)) * 37;
        e3 e3Var = this.pseudonymSyncResponse;
        int iHashCode11 = (iHashCode10 + (e3Var != null ? e3Var.hashCode() : 0)) * 37;
        f1 f1Var = this.getRateTariffResponse;
        int iHashCode12 = (iHashCode11 + (f1Var != null ? f1Var.hashCode() : 0)) * 37;
        o2 o2Var = this.navigationRouteResponse;
        int iHashCode13 = (iHashCode12 + (o2Var != null ? o2Var.hashCode() : 0)) * 37;
        v0 v0Var = this.getManagedChargingSitesResponse;
        int iHashCode14 = (iHashCode13 + (v0Var != null ? v0Var.hashCode() : 0)) * 37;
        h0 h0Var = this.getChargeOnSolarFeatureResponse;
        int iHashCode15 = (iHashCode14 + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        d dVar = this.addManagedChargingSiteResponse;
        int iHashCode16 = (iHashCode15 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        hc0.c cVar = this.centerDisplayResponse;
        int iHashCode17 = (iHashCode16 + (cVar != null ? cVar.hashCode() : 0)) * 37;
        z0 z0Var = this.getMessagesResponse;
        int iHashCode18 = (iHashCode17 + (z0Var != null ? z0Var.hashCode() : 0)) * 37;
        wc0.b bVar2 = this.webrtcResponse;
        int iHashCode19 = (iHashCode18 + (bVar2 != null ? bVar2.hashCode() : 0)) * 37;
        s0 s0Var = this.getLocalProfilesResponse;
        int iHashCode20 = (iHashCode19 + (s0Var != null ? s0Var.hashCode() : 0)) * 37;
        z1 z1Var = this.keysInfoResponse;
        int iHashCode21 = (iHashCode20 + (z1Var != null ? z1Var.hashCode() : 0)) * 37;
        h hVar = this.bandwidthTestResponse;
        int iHashCode22 = iHashCode21 + (hVar != null ? hVar.hashCode() : 0);
        this.hashCode = iHashCode22;
        return iHashCode22;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final z0 getGetMessagesResponse() {
        return this.getMessagesResponse;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final r2 getGetNearbyChargingSites() {
        return this.getNearbyChargingSites;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final f1 getGetRateTariffResponse() {
        return this.getRateTariffResponse;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final rc0.k getGetSessionInfoResponse() {
        return this.getSessionInfoResponse;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final z1 getKeysInfoResponse() {
        return this.keysInfoResponse;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final o2 getNavigationRouteResponse() {
        return this.navigationRouteResponse;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m280newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final a3 getPiiKeyResponse() {
        return this.piiKeyResponse;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final b3 getPing() {
        return this.ping;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final e3 getPseudonymSyncResponse() {
        return this.pseudonymSyncResponse;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final x4 getStreamMessage() {
        return this.streamMessage;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final u5 getVehicleData() {
        return this.vehicleData;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final y5 getVehicleDataSubscriptionResponse() {
        return this.vehicleDataSubscriptionResponse;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.actionStatus;
        if (bVar != null) {
            arrayList.add("actionStatus=" + bVar);
        }
        u5 u5Var = this.vehicleData;
        if (u5Var != null) {
            arrayList.add("vehicleData=" + u5Var);
        }
        rc0.k kVar = this.getSessionInfoResponse;
        if (kVar != null) {
            arrayList.add("getSessionInfoResponse=" + kVar);
        }
        x4 x4Var = this.streamMessage;
        if (x4Var != null) {
            arrayList.add("streamMessage=" + x4Var);
        }
        r2 r2Var = this.getNearbyChargingSites;
        if (r2Var != null) {
            arrayList.add("getNearbyChargingSites=" + r2Var);
        }
        y5 y5Var = this.vehicleDataSubscriptionResponse;
        if (y5Var != null) {
            arrayList.add("vehicleDataSubscriptionResponse=" + y5Var);
        }
        e6 e6Var = this.vitalsSubscriptionResponse;
        if (e6Var != null) {
            arrayList.add("vitalsSubscriptionResponse=" + e6Var);
        }
        b3 b3Var = this.ping;
        if (b3Var != null) {
            arrayList.add("ping=" + b3Var);
        }
        a3 a3Var = this.piiKeyResponse;
        if (a3Var != null) {
            arrayList.add("piiKeyResponse=" + a3Var);
        }
        e3 e3Var = this.pseudonymSyncResponse;
        if (e3Var != null) {
            arrayList.add("pseudonymSyncResponse=" + e3Var);
        }
        f1 f1Var = this.getRateTariffResponse;
        if (f1Var != null) {
            arrayList.add("getRateTariffResponse=" + f1Var);
        }
        o2 o2Var = this.navigationRouteResponse;
        if (o2Var != null) {
            arrayList.add("navigationRouteResponse=" + o2Var);
        }
        v0 v0Var = this.getManagedChargingSitesResponse;
        if (v0Var != null) {
            arrayList.add("getManagedChargingSitesResponse=" + v0Var);
        }
        h0 h0Var = this.getChargeOnSolarFeatureResponse;
        if (h0Var != null) {
            arrayList.add("getChargeOnSolarFeatureResponse=" + h0Var);
        }
        d dVar = this.addManagedChargingSiteResponse;
        if (dVar != null) {
            arrayList.add("addManagedChargingSiteResponse=" + dVar);
        }
        hc0.c cVar = this.centerDisplayResponse;
        if (cVar != null) {
            arrayList.add("centerDisplayResponse=" + cVar);
        }
        z0 z0Var = this.getMessagesResponse;
        if (z0Var != null) {
            arrayList.add("getMessagesResponse=" + z0Var);
        }
        wc0.b bVar2 = this.webrtcResponse;
        if (bVar2 != null) {
            arrayList.add("webrtcResponse=" + bVar2);
        }
        s0 s0Var = this.getLocalProfilesResponse;
        if (s0Var != null) {
            arrayList.add("getLocalProfilesResponse=" + s0Var);
        }
        z1 z1Var = this.keysInfoResponse;
        if (z1Var != null) {
            arrayList.add("keysInfoResponse=" + z1Var);
        }
        h hVar = this.bandwidthTestResponse;
        if (hVar != null) {
            arrayList.add("bandwidthTestResponse=" + hVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "Response{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final e6 getVitalsSubscriptionResponse() {
        return this.vitalsSubscriptionResponse;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final wc0.b getWebrtcResponse() {
        return this.webrtcResponse;
    }

    public /* synthetic */ l3(b bVar, u5 u5Var, rc0.k kVar, x4 x4Var, r2 r2Var, y5 y5Var, e6 e6Var, b3 b3Var, a3 a3Var, e3 e3Var, f1 f1Var, o2 o2Var, v0 v0Var, h0 h0Var, d dVar, hc0.c cVar, z0 z0Var, wc0.b bVar2, s0 s0Var, z1 z1Var, h hVar, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? null : u5Var, (i11 & 4) != 0 ? null : kVar, (i11 & 8) != 0 ? null : x4Var, (i11 & 16) != 0 ? null : r2Var, (i11 & 32) != 0 ? null : y5Var, (i11 & 64) != 0 ? null : e6Var, (i11 & 128) != 0 ? null : b3Var, (i11 & 256) != 0 ? null : a3Var, (i11 & 512) != 0 ? null : e3Var, (i11 & 1024) != 0 ? null : f1Var, (i11 & 2048) != 0 ? null : o2Var, (i11 & 4096) != 0 ? null : v0Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : h0Var, (i11 & 16384) != 0 ? null : dVar, (i11 & 32768) != 0 ? null : cVar, (i11 & 65536) != 0 ? null : z0Var, (i11 & 131072) != 0 ? null : bVar2, (i11 & 262144) != 0 ? null : s0Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : z1Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : hVar, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m280newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(b bVar, u5 u5Var, rc0.k kVar, x4 x4Var, r2 r2Var, y5 y5Var, e6 e6Var, b3 b3Var, a3 a3Var, e3 e3Var, f1 f1Var, o2 o2Var, v0 v0Var, h0 h0Var, d dVar, hc0.c cVar, z0 z0Var, wc0.b bVar2, s0 s0Var, z1 z1Var, h hVar, okio.k unknownFields) {
        super(f65204w, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.actionStatus = bVar;
        this.vehicleData = u5Var;
        this.getSessionInfoResponse = kVar;
        this.streamMessage = x4Var;
        this.getNearbyChargingSites = r2Var;
        this.vehicleDataSubscriptionResponse = y5Var;
        this.vitalsSubscriptionResponse = e6Var;
        this.ping = b3Var;
        this.piiKeyResponse = a3Var;
        this.pseudonymSyncResponse = e3Var;
        this.getRateTariffResponse = f1Var;
        this.navigationRouteResponse = o2Var;
        this.getManagedChargingSitesResponse = v0Var;
        this.getChargeOnSolarFeatureResponse = h0Var;
        this.addManagedChargingSiteResponse = dVar;
        this.centerDisplayResponse = cVar;
        this.getMessagesResponse = z0Var;
        this.webrtcResponse = bVar2;
        this.getLocalProfilesResponse = s0Var;
        this.keysInfoResponse = z1Var;
        this.bandwidthTestResponse = hVar;
        if (x20.d.e(u5Var, kVar, x4Var, r2Var, y5Var, e6Var, b3Var, a3Var, e3Var, f1Var, o2Var, v0Var, h0Var, dVar, cVar, z0Var, bVar2, s0Var, z1Var, hVar) > 1) {
            throw new IllegalArgumentException("At most one of vehicleData, getSessionInfoResponse, streamMessage, getNearbyChargingSites, vehicleDataSubscriptionResponse, vitalsSubscriptionResponse, ping, piiKeyResponse, pseudonymSyncResponse, getRateTariffResponse, navigationRouteResponse, getManagedChargingSitesResponse, getChargeOnSolarFeatureResponse, addManagedChargingSiteResponse, centerDisplayResponse, getMessagesResponse, webrtcResponse, getLocalProfilesResponse, keysInfoResponse, bandwidthTestResponse may be non-null");
        }
    }
}
