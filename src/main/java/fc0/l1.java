package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bM\u0018\u0000 ~2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IB±\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0002H\u0017¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ·\u0002\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\bD\u0010ER\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010X\u001a\u0004\bY\u0010ZR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010_\u001a\u0004\b[\u0010`R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010a\u001a\u0004\bb\u0010cR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010d\u001a\u0004\bM\u0010eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bq\u0010wR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010x\u001a\u0004\bm\u0010yR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bh\u0010z\u001a\u0004\b{\u0010|R\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010}\u001a\u0004\b~\u0010\u007fR\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bk\u0010\u0080\u0001\u001a\u0005\bu\u0010\u0081\u0001R\u001f\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\bI\u0010\u0084\u0001R\u001e\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bs\u0010\u0085\u0001\u001a\u0005\bf\u0010\u0086\u0001R\u001f\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bY\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bo\u0010\u008a\u0001\u001a\u0006\b\u0082\u0001\u0010\u008b\u0001R\u001f\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0088\u0001\u0010\u008c\u0001\u001a\u0005\bT\u0010\u008d\u0001¨\u0006\u008e\u0001"}, d2 = {"Lfc0/l1;", "Lcom/squareup/wire/f;", "", "Lfc0/o0;", "getGuiSettings", "Lfc0/j0;", "getChargeState", "Lfc0/l0;", "getClimateState", "Lfc0/n0;", "getDriveState", "Lfc0/p0;", "getLegacyVehicleState", "Lfc0/k1;", "getVehicleConfig", "Lfc0/t0;", "getLocationState", "Lfc0/m0;", "getClosuresState", "Lfc0/c1;", "getParkedAccessoryState", "Lfc0/i0;", "getChargeScheduleState", "Lfc0/d1;", "getPreconditioningScheduleState", "Lfc0/h1;", "getSohState", "Lfc0/m1;", "getVehicleDetailState", "Lfc0/j1;", "getTirePressureState", "Lfc0/x0;", "getMediaState", "Lfc0/w0;", "getMediaDetailState", "Lfc0/g1;", "getSoftwareUpdateState", "Lfc0/o1;", "getVehicleState", "Lfc0/b1;", "getParentalControlsState", "Lfc0/f0;", "getAlertState", "Lfc0/q0;", "getLightShowState", "Lfc0/n1;", "getVehicleImageState", "Lfc0/i1;", "getSuspensionState", "Lfc0/k0;", "getChildPresenceDetectionState", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/o0;Lfc0/j0;Lfc0/l0;Lfc0/n0;Lfc0/p0;Lfc0/k1;Lfc0/t0;Lfc0/m0;Lfc0/c1;Lfc0/i0;Lfc0/d1;Lfc0/h1;Lfc0/m1;Lfc0/j1;Lfc0/x0;Lfc0/w0;Lfc0/g1;Lfc0/o1;Lfc0/b1;Lfc0/f0;Lfc0/q0;Lfc0/n1;Lfc0/i1;Lfc0/k0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/o0;Lfc0/j0;Lfc0/l0;Lfc0/n0;Lfc0/p0;Lfc0/k1;Lfc0/t0;Lfc0/m0;Lfc0/c1;Lfc0/i0;Lfc0/d1;Lfc0/h1;Lfc0/m1;Lfc0/j1;Lfc0/x0;Lfc0/w0;Lfc0/g1;Lfc0/o1;Lfc0/b1;Lfc0/f0;Lfc0/q0;Lfc0/n1;Lfc0/i1;Lfc0/k0;Lokio/k;)Lfc0/l1;", "Lfc0/o0;", IntegerTokenConverter.CONVERTER_KEY, "()Lfc0/o0;", "b", "Lfc0/j0;", DateTokenConverter.CONVERTER_KEY, "()Lfc0/j0;", "c", "Lfc0/l0;", "f", "()Lfc0/l0;", "Lfc0/n0;", "h", "()Lfc0/n0;", "e", "Lfc0/p0;", "j", "()Lfc0/p0;", "Lfc0/k1;", "v", "()Lfc0/k1;", "g", "Lfc0/t0;", "l", "()Lfc0/t0;", "Lfc0/m0;", "()Lfc0/m0;", "Lfc0/c1;", "p", "()Lfc0/c1;", "Lfc0/i0;", "()Lfc0/i0;", "k", "Lfc0/d1;", "q", "()Lfc0/d1;", "Lfc0/h1;", "s", "()Lfc0/h1;", "m", "Lfc0/m1;", "w", "()Lfc0/m1;", "n", "Lfc0/j1;", "u", "()Lfc0/j1;", "o", "Lfc0/x0;", "()Lfc0/x0;", "Lfc0/w0;", "()Lfc0/w0;", "Lfc0/g1;", "r", "()Lfc0/g1;", "Lfc0/o1;", "y", "()Lfc0/o1;", "Lfc0/b1;", "()Lfc0/b1;", "t", "Lfc0/f0;", "()Lfc0/f0;", "Lfc0/q0;", "()Lfc0/q0;", "Lfc0/n1;", "x", "()Lfc0/n1;", "Lfc0/i1;", "()Lfc0/i1;", "Lfc0/k0;", "()Lfc0/k0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ProtoAdapter<l1> f65173z = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(l1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetGuiSettings#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final o0 getGuiSettings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetChargeState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final j0 getChargeState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetClimateState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final l0 getClimateState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetDriveState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final n0 getDriveState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetLegacyVehicleState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final p0 getLegacyVehicleState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetVehicleConfig#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final k1 getVehicleConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetLocationState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final t0 getLocationState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetClosuresState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final m0 getClosuresState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetParkedAccessoryState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final c1 getParkedAccessoryState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetChargeScheduleState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final i0 getChargeScheduleState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetPreconditioningScheduleState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final d1 getPreconditioningScheduleState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetSohState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final h1 getSohState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetVehicleDetailState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final m1 getVehicleDetailState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetTirePressureState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final j1 getTirePressureState;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetMediaState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final x0 getMediaState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetMediaDetailState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 16)
    private final w0 getMediaDetailState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetSoftwareUpdateState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 17)
    private final g1 getSoftwareUpdateState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetVehicleState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 18)
    private final o1 getVehicleState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetParentalControlsState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final b1 getParentalControlsState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetAlertState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 20)
    private final f0 getAlertState;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetLightShowState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 21)
    private final q0 getLightShowState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetVehicleImageState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 22)
    private final n1 getVehicleImageState;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetSuspensionState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 23)
    private final i1 getSuspensionState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.GetChildPresenceDetectionState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 25)
    private final k0 getChildPresenceDetectionState;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/l1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/l1;", "value", "", "c", "(Lfc0/l1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/l1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/l1;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/l1;)Lfc0/l1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<l1> {
        a(com.squareup.wire.b bVar, co0.d<l1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.GetVehicleData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l1 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            j0 j0VarDecode = null;
            l0 l0VarDecode = null;
            n0 n0VarDecode = null;
            p0 p0VarDecode = null;
            k1 k1VarDecode = null;
            t0 t0VarDecode = null;
            m0 m0VarDecode = null;
            c1 c1VarDecode = null;
            i0 i0VarDecode = null;
            d1 d1VarDecode = null;
            h1 h1VarDecode = null;
            m1 m1VarDecode = null;
            j1 j1VarDecode = null;
            x0 x0VarDecode = null;
            w0 w0VarDecode = null;
            g1 g1VarDecode = null;
            o1 o1VarDecode = null;
            b1 b1VarDecode = null;
            f0 f0VarDecode = null;
            q0 q0VarDecode = null;
            n1 n1VarDecode = null;
            i1 i1VarDecode = null;
            k0 k0VarDecode = null;
            o0 o0VarDecode = null;
            while (true) {
                int iG = reader.g();
                j0 j0Var = j0VarDecode;
                if (iG == -1) {
                    return new l1(o0VarDecode, j0Var, l0VarDecode, n0VarDecode, p0VarDecode, k1VarDecode, t0VarDecode, m0VarDecode, c1VarDecode, i0VarDecode, d1VarDecode, h1VarDecode, m1VarDecode, j1VarDecode, x0VarDecode, w0VarDecode, g1VarDecode, o1VarDecode, b1VarDecode, f0VarDecode, q0VarDecode, n1VarDecode, i1VarDecode, k0VarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        o0VarDecode = o0.f65274b.decode(reader);
                        break;
                    case 2:
                        j0VarDecode = j0.f65129b.decode(reader);
                        continue;
                    case 3:
                        l0VarDecode = l0.f65171b.decode(reader);
                        break;
                    case 4:
                        n0VarDecode = n0.f65255b.decode(reader);
                        break;
                    case 5:
                        p0VarDecode = p0.f65302b.decode(reader);
                        break;
                    case 6:
                        k1VarDecode = k1.f65150b.decode(reader);
                        break;
                    case 7:
                        t0VarDecode = t0.f65405b.decode(reader);
                        break;
                    case 8:
                        m0VarDecode = m0.f65234b.decode(reader);
                        break;
                    case 9:
                        c1VarDecode = c1.f64917b.decode(reader);
                        break;
                    case 10:
                        i0VarDecode = i0.f65108b.decode(reader);
                        break;
                    case 11:
                        d1VarDecode = d1.f64940b.decode(reader);
                        break;
                    case 12:
                        h1VarDecode = h1.f65091b.decode(reader);
                        break;
                    case 13:
                        m1VarDecode = m1.f65236b.decode(reader);
                        break;
                    case 14:
                        j1VarDecode = j1.f65131b.decode(reader);
                        break;
                    case 15:
                        x0VarDecode = x0.f65560b.decode(reader);
                        break;
                    case 16:
                        w0VarDecode = w0.f65544b.decode(reader);
                        break;
                    case 17:
                        g1VarDecode = g1.f65007b.decode(reader);
                        break;
                    case 18:
                        o1VarDecode = o1.f65276b.decode(reader);
                        break;
                    case 19:
                        b1VarDecode = b1.f64888b.decode(reader);
                        break;
                    case 20:
                        f0VarDecode = f0.f64988b.decode(reader);
                        break;
                    case 21:
                        q0VarDecode = q0.f65326b.decode(reader);
                        break;
                    case 22:
                        n1VarDecode = n1.f65257c.decode(reader);
                        break;
                    case 23:
                        i1VarDecode = i1.f65110b.decode(reader);
                        break;
                    case 24:
                    default:
                        reader.m(iG);
                        break;
                    case 25:
                        k0VarDecode = k0.f65148b.decode(reader);
                        break;
                }
                j0VarDecode = j0Var;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, l1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getGetGuiSettings() != null) {
                o0.f65274b.encodeWithTag(writer, 1, value.getGetGuiSettings());
            }
            if (value.getGetChargeState() != null) {
                j0.f65129b.encodeWithTag(writer, 2, value.getGetChargeState());
            }
            if (value.getGetClimateState() != null) {
                l0.f65171b.encodeWithTag(writer, 3, value.getGetClimateState());
            }
            if (value.getGetDriveState() != null) {
                n0.f65255b.encodeWithTag(writer, 4, value.getGetDriveState());
            }
            if (value.getGetLegacyVehicleState() != null) {
                p0.f65302b.encodeWithTag(writer, 5, value.getGetLegacyVehicleState());
            }
            if (value.getGetVehicleConfig() != null) {
                k1.f65150b.encodeWithTag(writer, 6, value.getGetVehicleConfig());
            }
            if (value.getGetLocationState() != null) {
                t0.f65405b.encodeWithTag(writer, 7, value.getGetLocationState());
            }
            if (value.getGetClosuresState() != null) {
                m0.f65234b.encodeWithTag(writer, 8, value.getGetClosuresState());
            }
            if (value.getGetParkedAccessoryState() != null) {
                c1.f64917b.encodeWithTag(writer, 9, value.getGetParkedAccessoryState());
            }
            if (value.getGetChargeScheduleState() != null) {
                i0.f65108b.encodeWithTag(writer, 10, value.getGetChargeScheduleState());
            }
            if (value.getGetPreconditioningScheduleState() != null) {
                d1.f64940b.encodeWithTag(writer, 11, value.getGetPreconditioningScheduleState());
            }
            if (value.getGetSohState() != null) {
                h1.f65091b.encodeWithTag(writer, 12, value.getGetSohState());
            }
            if (value.getGetVehicleDetailState() != null) {
                m1.f65236b.encodeWithTag(writer, 13, value.getGetVehicleDetailState());
            }
            if (value.getGetTirePressureState() != null) {
                j1.f65131b.encodeWithTag(writer, 14, value.getGetTirePressureState());
            }
            if (value.getGetMediaState() != null) {
                x0.f65560b.encodeWithTag(writer, 15, value.getGetMediaState());
            }
            if (value.getGetMediaDetailState() != null) {
                w0.f65544b.encodeWithTag(writer, 16, value.getGetMediaDetailState());
            }
            if (value.getGetSoftwareUpdateState() != null) {
                g1.f65007b.encodeWithTag(writer, 17, value.getGetSoftwareUpdateState());
            }
            if (value.getGetVehicleState() != null) {
                o1.f65276b.encodeWithTag(writer, 18, value.getGetVehicleState());
            }
            if (value.getGetParentalControlsState() != null) {
                b1.f64888b.encodeWithTag(writer, 19, value.getGetParentalControlsState());
            }
            if (value.getGetAlertState() != null) {
                f0.f64988b.encodeWithTag(writer, 20, value.getGetAlertState());
            }
            if (value.getGetLightShowState() != null) {
                q0.f65326b.encodeWithTag(writer, 21, value.getGetLightShowState());
            }
            if (value.getGetVehicleImageState() != null) {
                n1.f65257c.encodeWithTag(writer, 22, value.getGetVehicleImageState());
            }
            if (value.getGetSuspensionState() != null) {
                i1.f65110b.encodeWithTag(writer, 23, value.getGetSuspensionState());
            }
            if (value.getGetChildPresenceDetectionState() != null) {
                k0.f65148b.encodeWithTag(writer, 25, value.getGetChildPresenceDetectionState());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(l1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getGetGuiSettings() != null) {
                iD += o0.f65274b.encodedSizeWithTag(1, value.getGetGuiSettings());
            }
            if (value.getGetChargeState() != null) {
                iD += j0.f65129b.encodedSizeWithTag(2, value.getGetChargeState());
            }
            if (value.getGetClimateState() != null) {
                iD += l0.f65171b.encodedSizeWithTag(3, value.getGetClimateState());
            }
            if (value.getGetDriveState() != null) {
                iD += n0.f65255b.encodedSizeWithTag(4, value.getGetDriveState());
            }
            if (value.getGetLegacyVehicleState() != null) {
                iD += p0.f65302b.encodedSizeWithTag(5, value.getGetLegacyVehicleState());
            }
            if (value.getGetVehicleConfig() != null) {
                iD += k1.f65150b.encodedSizeWithTag(6, value.getGetVehicleConfig());
            }
            if (value.getGetLocationState() != null) {
                iD += t0.f65405b.encodedSizeWithTag(7, value.getGetLocationState());
            }
            if (value.getGetClosuresState() != null) {
                iD += m0.f65234b.encodedSizeWithTag(8, value.getGetClosuresState());
            }
            if (value.getGetParkedAccessoryState() != null) {
                iD += c1.f64917b.encodedSizeWithTag(9, value.getGetParkedAccessoryState());
            }
            if (value.getGetChargeScheduleState() != null) {
                iD += i0.f65108b.encodedSizeWithTag(10, value.getGetChargeScheduleState());
            }
            if (value.getGetPreconditioningScheduleState() != null) {
                iD += d1.f64940b.encodedSizeWithTag(11, value.getGetPreconditioningScheduleState());
            }
            if (value.getGetSohState() != null) {
                iD += h1.f65091b.encodedSizeWithTag(12, value.getGetSohState());
            }
            if (value.getGetVehicleDetailState() != null) {
                iD += m1.f65236b.encodedSizeWithTag(13, value.getGetVehicleDetailState());
            }
            if (value.getGetTirePressureState() != null) {
                iD += j1.f65131b.encodedSizeWithTag(14, value.getGetTirePressureState());
            }
            if (value.getGetMediaState() != null) {
                iD += x0.f65560b.encodedSizeWithTag(15, value.getGetMediaState());
            }
            if (value.getGetMediaDetailState() != null) {
                iD += w0.f65544b.encodedSizeWithTag(16, value.getGetMediaDetailState());
            }
            if (value.getGetSoftwareUpdateState() != null) {
                iD += g1.f65007b.encodedSizeWithTag(17, value.getGetSoftwareUpdateState());
            }
            if (value.getGetVehicleState() != null) {
                iD += o1.f65276b.encodedSizeWithTag(18, value.getGetVehicleState());
            }
            if (value.getGetParentalControlsState() != null) {
                iD += b1.f64888b.encodedSizeWithTag(19, value.getGetParentalControlsState());
            }
            if (value.getGetAlertState() != null) {
                iD += f0.f64988b.encodedSizeWithTag(20, value.getGetAlertState());
            }
            if (value.getGetLightShowState() != null) {
                iD += q0.f65326b.encodedSizeWithTag(21, value.getGetLightShowState());
            }
            if (value.getGetVehicleImageState() != null) {
                iD += n1.f65257c.encodedSizeWithTag(22, value.getGetVehicleImageState());
            }
            if (value.getGetSuspensionState() != null) {
                iD += i1.f65110b.encodedSizeWithTag(23, value.getGetSuspensionState());
            }
            return value.getGetChildPresenceDetectionState() != null ? iD + k0.f65148b.encodedSizeWithTag(25, value.getGetChildPresenceDetectionState()) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public l1 redact(l1 value) {
            k0 k0VarRedact;
            i1 i1Var;
            p013kotlin.jvm.internal.s.k(value, "value");
            o0 getGuiSettings = value.getGetGuiSettings();
            o0 o0VarRedact = getGuiSettings != null ? o0.f65274b.redact(getGuiSettings) : null;
            j0 getChargeState = value.getGetChargeState();
            j0 j0VarRedact = getChargeState != null ? j0.f65129b.redact(getChargeState) : null;
            l0 getClimateState = value.getGetClimateState();
            l0 l0VarRedact = getClimateState != null ? l0.f65171b.redact(getClimateState) : null;
            n0 getDriveState = value.getGetDriveState();
            n0 n0VarRedact = getDriveState != null ? n0.f65255b.redact(getDriveState) : null;
            p0 getLegacyVehicleState = value.getGetLegacyVehicleState();
            p0 p0VarRedact = getLegacyVehicleState != null ? p0.f65302b.redact(getLegacyVehicleState) : null;
            k1 getVehicleConfig = value.getGetVehicleConfig();
            k1 k1VarRedact = getVehicleConfig != null ? k1.f65150b.redact(getVehicleConfig) : null;
            t0 getLocationState = value.getGetLocationState();
            t0 t0VarRedact = getLocationState != null ? t0.f65405b.redact(getLocationState) : null;
            m0 getClosuresState = value.getGetClosuresState();
            m0 m0VarRedact = getClosuresState != null ? m0.f65234b.redact(getClosuresState) : null;
            c1 getParkedAccessoryState = value.getGetParkedAccessoryState();
            c1 c1VarRedact = getParkedAccessoryState != null ? c1.f64917b.redact(getParkedAccessoryState) : null;
            i0 getChargeScheduleState = value.getGetChargeScheduleState();
            i0 i0VarRedact = getChargeScheduleState != null ? i0.f65108b.redact(getChargeScheduleState) : null;
            d1 getPreconditioningScheduleState = value.getGetPreconditioningScheduleState();
            d1 d1VarRedact = getPreconditioningScheduleState != null ? d1.f64940b.redact(getPreconditioningScheduleState) : null;
            h1 getSohState = value.getGetSohState();
            h1 h1VarRedact = getSohState != null ? h1.f65091b.redact(getSohState) : null;
            m1 getVehicleDetailState = value.getGetVehicleDetailState();
            m1 m1VarRedact = getVehicleDetailState != null ? m1.f65236b.redact(getVehicleDetailState) : null;
            j1 getTirePressureState = value.getGetTirePressureState();
            j1 j1VarRedact = getTirePressureState != null ? j1.f65131b.redact(getTirePressureState) : null;
            x0 getMediaState = value.getGetMediaState();
            o0 o0Var = o0VarRedact;
            x0 x0VarRedact = getMediaState != null ? x0.f65560b.redact(getMediaState) : null;
            w0 getMediaDetailState = value.getGetMediaDetailState();
            x0 x0Var = x0VarRedact;
            w0 w0VarRedact = getMediaDetailState != null ? w0.f65544b.redact(getMediaDetailState) : null;
            g1 getSoftwareUpdateState = value.getGetSoftwareUpdateState();
            w0 w0Var = w0VarRedact;
            g1 g1VarRedact = getSoftwareUpdateState != null ? g1.f65007b.redact(getSoftwareUpdateState) : null;
            o1 getVehicleState = value.getGetVehicleState();
            g1 g1Var = g1VarRedact;
            o1 o1VarRedact = getVehicleState != null ? o1.f65276b.redact(getVehicleState) : null;
            b1 getParentalControlsState = value.getGetParentalControlsState();
            o1 o1Var = o1VarRedact;
            b1 b1VarRedact = getParentalControlsState != null ? b1.f64888b.redact(getParentalControlsState) : null;
            f0 getAlertState = value.getGetAlertState();
            b1 b1Var = b1VarRedact;
            f0 f0VarRedact = getAlertState != null ? f0.f64988b.redact(getAlertState) : null;
            q0 getLightShowState = value.getGetLightShowState();
            f0 f0Var = f0VarRedact;
            q0 q0VarRedact = getLightShowState != null ? q0.f65326b.redact(getLightShowState) : null;
            n1 getVehicleImageState = value.getGetVehicleImageState();
            q0 q0Var = q0VarRedact;
            n1 n1VarRedact = getVehicleImageState != null ? n1.f65257c.redact(getVehicleImageState) : null;
            i1 getSuspensionState = value.getGetSuspensionState();
            n1 n1Var = n1VarRedact;
            i1 i1VarRedact = getSuspensionState != null ? i1.f65110b.redact(getSuspensionState) : null;
            k0 getChildPresenceDetectionState = value.getGetChildPresenceDetectionState();
            if (getChildPresenceDetectionState != null) {
                k0VarRedact = k0.f65148b.redact(getChildPresenceDetectionState);
                i1Var = i1VarRedact;
            } else {
                k0VarRedact = null;
                i1Var = i1VarRedact;
            }
            return value.a(o0Var, j0VarRedact, l0VarRedact, n0VarRedact, p0VarRedact, k1VarRedact, t0VarRedact, m0VarRedact, c1VarRedact, i0VarRedact, d1VarRedact, h1VarRedact, m1VarRedact, j1VarRedact, x0Var, w0Var, g1Var, o1Var, b1Var, f0Var, q0Var, n1Var, i1Var, k0VarRedact, okio.k.f97943e);
        }
    }

    public l1() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public final l1 a(o0 getGuiSettings, j0 getChargeState, l0 getClimateState, n0 getDriveState, p0 getLegacyVehicleState, k1 getVehicleConfig, t0 getLocationState, m0 getClosuresState, c1 getParkedAccessoryState, i0 getChargeScheduleState, d1 getPreconditioningScheduleState, h1 getSohState, m1 getVehicleDetailState, j1 getTirePressureState, x0 getMediaState, w0 getMediaDetailState, g1 getSoftwareUpdateState, o1 getVehicleState, b1 getParentalControlsState, f0 getAlertState, q0 getLightShowState, n1 getVehicleImageState, i1 getSuspensionState, k0 getChildPresenceDetectionState, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new l1(getGuiSettings, getChargeState, getClimateState, getDriveState, getLegacyVehicleState, getVehicleConfig, getLocationState, getClosuresState, getParkedAccessoryState, getChargeScheduleState, getPreconditioningScheduleState, getSohState, getVehicleDetailState, getTirePressureState, getMediaState, getMediaDetailState, getSoftwareUpdateState, getVehicleState, getParentalControlsState, getAlertState, getLightShowState, getVehicleImageState, getSuspensionState, getChildPresenceDetectionState, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f0 getGetAlertState() {
        return this.getAlertState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i0 getGetChargeScheduleState() {
        return this.getChargeScheduleState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j0 getGetChargeState() {
        return this.getChargeState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k0 getGetChildPresenceDetectionState() {
        return this.getChildPresenceDetectionState;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), l1Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.getGuiSettings, l1Var.getGuiSettings) && p013kotlin.jvm.internal.s.f(this.getChargeState, l1Var.getChargeState) && p013kotlin.jvm.internal.s.f(this.getClimateState, l1Var.getClimateState) && p013kotlin.jvm.internal.s.f(this.getDriveState, l1Var.getDriveState) && p013kotlin.jvm.internal.s.f(this.getLegacyVehicleState, l1Var.getLegacyVehicleState) && p013kotlin.jvm.internal.s.f(this.getVehicleConfig, l1Var.getVehicleConfig) && p013kotlin.jvm.internal.s.f(this.getLocationState, l1Var.getLocationState) && p013kotlin.jvm.internal.s.f(this.getClosuresState, l1Var.getClosuresState) && p013kotlin.jvm.internal.s.f(this.getParkedAccessoryState, l1Var.getParkedAccessoryState) && p013kotlin.jvm.internal.s.f(this.getChargeScheduleState, l1Var.getChargeScheduleState) && p013kotlin.jvm.internal.s.f(this.getPreconditioningScheduleState, l1Var.getPreconditioningScheduleState) && p013kotlin.jvm.internal.s.f(this.getSohState, l1Var.getSohState) && p013kotlin.jvm.internal.s.f(this.getVehicleDetailState, l1Var.getVehicleDetailState) && p013kotlin.jvm.internal.s.f(this.getTirePressureState, l1Var.getTirePressureState) && p013kotlin.jvm.internal.s.f(this.getMediaState, l1Var.getMediaState) && p013kotlin.jvm.internal.s.f(this.getMediaDetailState, l1Var.getMediaDetailState) && p013kotlin.jvm.internal.s.f(this.getSoftwareUpdateState, l1Var.getSoftwareUpdateState) && p013kotlin.jvm.internal.s.f(this.getVehicleState, l1Var.getVehicleState) && p013kotlin.jvm.internal.s.f(this.getParentalControlsState, l1Var.getParentalControlsState) && p013kotlin.jvm.internal.s.f(this.getAlertState, l1Var.getAlertState) && p013kotlin.jvm.internal.s.f(this.getLightShowState, l1Var.getLightShowState) && p013kotlin.jvm.internal.s.f(this.getVehicleImageState, l1Var.getVehicleImageState) && p013kotlin.jvm.internal.s.f(this.getSuspensionState, l1Var.getSuspensionState) && p013kotlin.jvm.internal.s.f(this.getChildPresenceDetectionState, l1Var.getChildPresenceDetectionState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l0 getGetClimateState() {
        return this.getClimateState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final m0 getGetClosuresState() {
        return this.getClosuresState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final n0 getGetDriveState() {
        return this.getDriveState;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        o0 o0Var = this.getGuiSettings;
        int iHashCode2 = (iHashCode + (o0Var != null ? o0Var.hashCode() : 0)) * 37;
        j0 j0Var = this.getChargeState;
        int iHashCode3 = (iHashCode2 + (j0Var != null ? j0Var.hashCode() : 0)) * 37;
        l0 l0Var = this.getClimateState;
        int iHashCode4 = (iHashCode3 + (l0Var != null ? l0Var.hashCode() : 0)) * 37;
        n0 n0Var = this.getDriveState;
        int iHashCode5 = (iHashCode4 + (n0Var != null ? n0Var.hashCode() : 0)) * 37;
        p0 p0Var = this.getLegacyVehicleState;
        int iHashCode6 = (iHashCode5 + (p0Var != null ? p0Var.hashCode() : 0)) * 37;
        k1 k1Var = this.getVehicleConfig;
        int iHashCode7 = (iHashCode6 + (k1Var != null ? k1Var.hashCode() : 0)) * 37;
        t0 t0Var = this.getLocationState;
        int iHashCode8 = (iHashCode7 + (t0Var != null ? t0Var.hashCode() : 0)) * 37;
        m0 m0Var = this.getClosuresState;
        int iHashCode9 = (iHashCode8 + (m0Var != null ? m0Var.hashCode() : 0)) * 37;
        c1 c1Var = this.getParkedAccessoryState;
        int iHashCode10 = (iHashCode9 + (c1Var != null ? c1Var.hashCode() : 0)) * 37;
        i0 i0Var = this.getChargeScheduleState;
        int iHashCode11 = (iHashCode10 + (i0Var != null ? i0Var.hashCode() : 0)) * 37;
        d1 d1Var = this.getPreconditioningScheduleState;
        int iHashCode12 = (iHashCode11 + (d1Var != null ? d1Var.hashCode() : 0)) * 37;
        h1 h1Var = this.getSohState;
        int iHashCode13 = (iHashCode12 + (h1Var != null ? h1Var.hashCode() : 0)) * 37;
        m1 m1Var = this.getVehicleDetailState;
        int iHashCode14 = (iHashCode13 + (m1Var != null ? m1Var.hashCode() : 0)) * 37;
        j1 j1Var = this.getTirePressureState;
        int iHashCode15 = (iHashCode14 + (j1Var != null ? j1Var.hashCode() : 0)) * 37;
        x0 x0Var = this.getMediaState;
        int iHashCode16 = (iHashCode15 + (x0Var != null ? x0Var.hashCode() : 0)) * 37;
        w0 w0Var = this.getMediaDetailState;
        int iHashCode17 = (iHashCode16 + (w0Var != null ? w0Var.hashCode() : 0)) * 37;
        g1 g1Var = this.getSoftwareUpdateState;
        int iHashCode18 = (iHashCode17 + (g1Var != null ? g1Var.hashCode() : 0)) * 37;
        o1 o1Var = this.getVehicleState;
        int iHashCode19 = (iHashCode18 + (o1Var != null ? o1Var.hashCode() : 0)) * 37;
        b1 b1Var = this.getParentalControlsState;
        int iHashCode20 = (iHashCode19 + (b1Var != null ? b1Var.hashCode() : 0)) * 37;
        f0 f0Var = this.getAlertState;
        int iHashCode21 = (iHashCode20 + (f0Var != null ? f0Var.hashCode() : 0)) * 37;
        q0 q0Var = this.getLightShowState;
        int iHashCode22 = (iHashCode21 + (q0Var != null ? q0Var.hashCode() : 0)) * 37;
        n1 n1Var = this.getVehicleImageState;
        int iHashCode23 = (iHashCode22 + (n1Var != null ? n1Var.hashCode() : 0)) * 37;
        i1 i1Var = this.getSuspensionState;
        int iHashCode24 = (iHashCode23 + (i1Var != null ? i1Var.hashCode() : 0)) * 37;
        k0 k0Var = this.getChildPresenceDetectionState;
        int iHashCode25 = iHashCode24 + (k0Var != null ? k0Var.hashCode() : 0);
        this.hashCode = iHashCode25;
        return iHashCode25;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final o0 getGetGuiSettings() {
        return this.getGuiSettings;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final p0 getGetLegacyVehicleState() {
        return this.getLegacyVehicleState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final q0 getGetLightShowState() {
        return this.getLightShowState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final t0 getGetLocationState() {
        return this.getLocationState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final w0 getGetMediaDetailState() {
        return this.getMediaDetailState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final x0 getGetMediaState() {
        return this.getMediaState;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m278newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final b1 getGetParentalControlsState() {
        return this.getParentalControlsState;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final c1 getGetParkedAccessoryState() {
        return this.getParkedAccessoryState;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final d1 getGetPreconditioningScheduleState() {
        return this.getPreconditioningScheduleState;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final g1 getGetSoftwareUpdateState() {
        return this.getSoftwareUpdateState;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final h1 getGetSohState() {
        return this.getSohState;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final i1 getGetSuspensionState() {
        return this.getSuspensionState;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        o0 o0Var = this.getGuiSettings;
        if (o0Var != null) {
            arrayList.add("getGuiSettings=" + o0Var);
        }
        j0 j0Var = this.getChargeState;
        if (j0Var != null) {
            arrayList.add("getChargeState=" + j0Var);
        }
        l0 l0Var = this.getClimateState;
        if (l0Var != null) {
            arrayList.add("getClimateState=" + l0Var);
        }
        n0 n0Var = this.getDriveState;
        if (n0Var != null) {
            arrayList.add("getDriveState=" + n0Var);
        }
        p0 p0Var = this.getLegacyVehicleState;
        if (p0Var != null) {
            arrayList.add("getLegacyVehicleState=" + p0Var);
        }
        k1 k1Var = this.getVehicleConfig;
        if (k1Var != null) {
            arrayList.add("getVehicleConfig=" + k1Var);
        }
        t0 t0Var = this.getLocationState;
        if (t0Var != null) {
            arrayList.add("getLocationState=" + t0Var);
        }
        m0 m0Var = this.getClosuresState;
        if (m0Var != null) {
            arrayList.add("getClosuresState=" + m0Var);
        }
        c1 c1Var = this.getParkedAccessoryState;
        if (c1Var != null) {
            arrayList.add("getParkedAccessoryState=" + c1Var);
        }
        i0 i0Var = this.getChargeScheduleState;
        if (i0Var != null) {
            arrayList.add("getChargeScheduleState=" + i0Var);
        }
        d1 d1Var = this.getPreconditioningScheduleState;
        if (d1Var != null) {
            arrayList.add("getPreconditioningScheduleState=" + d1Var);
        }
        h1 h1Var = this.getSohState;
        if (h1Var != null) {
            arrayList.add("getSohState=" + h1Var);
        }
        m1 m1Var = this.getVehicleDetailState;
        if (m1Var != null) {
            arrayList.add("getVehicleDetailState=" + m1Var);
        }
        j1 j1Var = this.getTirePressureState;
        if (j1Var != null) {
            arrayList.add("getTirePressureState=" + j1Var);
        }
        x0 x0Var = this.getMediaState;
        if (x0Var != null) {
            arrayList.add("getMediaState=" + x0Var);
        }
        w0 w0Var = this.getMediaDetailState;
        if (w0Var != null) {
            arrayList.add("getMediaDetailState=" + w0Var);
        }
        g1 g1Var = this.getSoftwareUpdateState;
        if (g1Var != null) {
            arrayList.add("getSoftwareUpdateState=" + g1Var);
        }
        o1 o1Var = this.getVehicleState;
        if (o1Var != null) {
            arrayList.add("getVehicleState=" + o1Var);
        }
        b1 b1Var = this.getParentalControlsState;
        if (b1Var != null) {
            arrayList.add("getParentalControlsState=" + b1Var);
        }
        f0 f0Var = this.getAlertState;
        if (f0Var != null) {
            arrayList.add("getAlertState=" + f0Var);
        }
        q0 q0Var = this.getLightShowState;
        if (q0Var != null) {
            arrayList.add("getLightShowState=" + q0Var);
        }
        n1 n1Var = this.getVehicleImageState;
        if (n1Var != null) {
            arrayList.add("getVehicleImageState=" + n1Var);
        }
        i1 i1Var = this.getSuspensionState;
        if (i1Var != null) {
            arrayList.add("getSuspensionState=" + i1Var);
        }
        k0 k0Var = this.getChildPresenceDetectionState;
        if (k0Var != null) {
            arrayList.add("getChildPresenceDetectionState=" + k0Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "GetVehicleData{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final j1 getGetTirePressureState() {
        return this.getTirePressureState;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final k1 getGetVehicleConfig() {
        return this.getVehicleConfig;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final m1 getGetVehicleDetailState() {
        return this.getVehicleDetailState;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final n1 getGetVehicleImageState() {
        return this.getVehicleImageState;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final o1 getGetVehicleState() {
        return this.getVehicleState;
    }

    public /* synthetic */ l1(o0 o0Var, j0 j0Var, l0 l0Var, n0 n0Var, p0 p0Var, k1 k1Var, t0 t0Var, m0 m0Var, c1 c1Var, i0 i0Var, d1 d1Var, h1 h1Var, m1 m1Var, j1 j1Var, x0 x0Var, w0 w0Var, g1 g1Var, o1 o1Var, b1 b1Var, f0 f0Var, q0 q0Var, n1 n1Var, i1 i1Var, k0 k0Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : o0Var, (i11 & 2) != 0 ? null : j0Var, (i11 & 4) != 0 ? null : l0Var, (i11 & 8) != 0 ? null : n0Var, (i11 & 16) != 0 ? null : p0Var, (i11 & 32) != 0 ? null : k1Var, (i11 & 64) != 0 ? null : t0Var, (i11 & 128) != 0 ? null : m0Var, (i11 & 256) != 0 ? null : c1Var, (i11 & 512) != 0 ? null : i0Var, (i11 & 1024) != 0 ? null : d1Var, (i11 & 2048) != 0 ? null : h1Var, (i11 & 4096) != 0 ? null : m1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : j1Var, (i11 & 16384) != 0 ? null : x0Var, (i11 & 32768) != 0 ? null : w0Var, (i11 & 65536) != 0 ? null : g1Var, (i11 & 131072) != 0 ? null : o1Var, (i11 & 262144) != 0 ? null : b1Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : f0Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : q0Var, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : n1Var, (i11 & 4194304) != 0 ? null : i1Var, (i11 & 8388608) != 0 ? null : k0Var, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m278newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(o0 o0Var, j0 j0Var, l0 l0Var, n0 n0Var, p0 p0Var, k1 k1Var, t0 t0Var, m0 m0Var, c1 c1Var, i0 i0Var, d1 d1Var, h1 h1Var, m1 m1Var, j1 j1Var, x0 x0Var, w0 w0Var, g1 g1Var, o1 o1Var, b1 b1Var, f0 f0Var, q0 q0Var, n1 n1Var, i1 i1Var, k0 k0Var, okio.k unknownFields) {
        super(f65173z, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.getGuiSettings = o0Var;
        this.getChargeState = j0Var;
        this.getClimateState = l0Var;
        this.getDriveState = n0Var;
        this.getLegacyVehicleState = p0Var;
        this.getVehicleConfig = k1Var;
        this.getLocationState = t0Var;
        this.getClosuresState = m0Var;
        this.getParkedAccessoryState = c1Var;
        this.getChargeScheduleState = i0Var;
        this.getPreconditioningScheduleState = d1Var;
        this.getSohState = h1Var;
        this.getVehicleDetailState = m1Var;
        this.getTirePressureState = j1Var;
        this.getMediaState = x0Var;
        this.getMediaDetailState = w0Var;
        this.getSoftwareUpdateState = g1Var;
        this.getVehicleState = o1Var;
        this.getParentalControlsState = b1Var;
        this.getAlertState = f0Var;
        this.getLightShowState = q0Var;
        this.getVehicleImageState = n1Var;
        this.getSuspensionState = i1Var;
        this.getChildPresenceDetectionState = k0Var;
    }
}
