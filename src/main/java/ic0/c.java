package ic0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import fc0.g5;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import vc0.a1;
import vc0.b0;
import vc0.e0;
import vc0.f1;
import vc0.k0;
import vc0.l1;
import vc0.n0;
import vc0.n3;
import vc0.o2;
import vc0.r0;
import vc0.r1;
import vc0.v1;
import vc0.z1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bI\u0018\u0000 \u0083\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB¥\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0002H\u0017¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106H\u0096\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J«\u0002\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\bA\u0010BR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010]\u001a\u0004\b^\u0010_R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bR\u0010bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\b`\u0010iR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bJ\u0010lR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010m\u001a\u0004\bn\u0010oR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010p\u001a\u0004\bq\u0010rR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010Z\u001a\u0004\bt\u0010\\R\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bN\u0010vR\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010w\u001a\u0004\bj\u0010xR\u001c\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010y\u001a\u0004\bY\u0010zR\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010{\u001a\u0004\bs\u0010|R\u001c\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\bg\u0010\u007fR\u001e\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bn\u0010\u0080\u0001\u001a\u0005\bc\u0010\u0081\u0001R\u001f\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bq\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001e\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bW\u0010\u0085\u0001\u001a\u0005\b}\u0010\u0086\u0001¨\u0006\u0087\u0001"}, d2 = {"Lic0/c;", "Lcom/squareup/wire/f;", "", "Lfc0/g5;", "carServerAction", "Lvc0/o2;", "rkeAction", "Lvc0/e0;", "closureAction", "Lic0/p;", "sharedHmacWhitelistOperation", "Lvc0/f1;", "informationRequest", "Lic0/o;", "tesla_proto_SessionInfoRequest", "Lvc0/n3;", "whitelistOperation", "Lic0/k;", "proxyCommand", "Lic0/b;", "authenticationResponse", "Lvc0/l1;", "keyMetadata", "Lvc0/k0;", "deviceMotion", "Lvc0/f;", "appDeviceInfo", "Lvc0/v1;", "tesla_proto_NISessionResponse", "Lvc0/z1;", "tesla_proto_NISessionStopped", "presentKeyWhitelistOperation", "Lvc0/i;", "appEventLog", "Lvc0/a1;", "getReaderKeyRequest", "Lhc0/b;", "centerDisplayRequest", "Lvc0/r1;", "niBatchResponse", "Lvc0/r0;", "firaResponse", "Lvc0/n0;", "firaCapabilities", "Lwc0/a;", "webrtcRequest", "Lvc0/b0;", "tesla_proto_CPDResponse", "Lokio/k;", "unknownFields", "<init>", "(Lfc0/g5;Lvc0/o2;Lvc0/e0;Lic0/p;Lvc0/f1;Lic0/o;Lvc0/n3;Lic0/k;Lic0/b;Lvc0/l1;Lvc0/k0;Lvc0/f;Lvc0/v1;Lvc0/z1;Lvc0/n3;Lvc0/i;Lvc0/a1;Lhc0/b;Lvc0/r1;Lvc0/r0;Lvc0/n0;Lwc0/a;Lvc0/b0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lfc0/g5;Lvc0/o2;Lvc0/e0;Lic0/p;Lvc0/f1;Lic0/o;Lvc0/n3;Lic0/k;Lic0/b;Lvc0/l1;Lvc0/k0;Lvc0/f;Lvc0/v1;Lvc0/z1;Lvc0/n3;Lvc0/i;Lvc0/a1;Lhc0/b;Lvc0/r1;Lvc0/r0;Lvc0/n0;Lwc0/a;Lvc0/b0;Lokio/k;)Lic0/c;", "Lfc0/g5;", "f", "()Lfc0/g5;", "b", "Lvc0/o2;", "r", "()Lvc0/o2;", "c", "Lvc0/e0;", "h", "()Lvc0/e0;", DateTokenConverter.CONVERTER_KEY, "Lic0/p;", "s", "()Lic0/p;", "e", "Lvc0/f1;", "m", "()Lvc0/f1;", "Lic0/o;", "w", "()Lic0/o;", "g", "Lvc0/n3;", "y", "()Lvc0/n3;", "Lic0/k;", "q", "()Lic0/k;", IntegerTokenConverter.CONVERTER_KEY, "Lic0/b;", "()Lic0/b;", "j", "Lvc0/l1;", "n", "()Lvc0/l1;", "k", "Lvc0/k0;", "()Lvc0/k0;", "l", "Lvc0/f;", "()Lvc0/f;", "Lvc0/v1;", "u", "()Lvc0/v1;", "Lvc0/z1;", "v", "()Lvc0/z1;", "o", "p", "Lvc0/i;", "()Lvc0/i;", "Lvc0/a1;", "()Lvc0/a1;", "Lhc0/b;", "()Lhc0/b;", "Lvc0/r1;", "()Lvc0/r1;", "t", "Lvc0/r0;", "()Lvc0/r0;", "Lvc0/n0;", "()Lvc0/n0;", "Lwc0/a;", "x", "()Lwc0/a;", "Lvc0/b0;", "()Lvc0/b0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends com.squareup.wire.f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final ProtoAdapter<c> f77465y = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(c.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.VehicleAction#ADAPTER", tag = 2)
    private final g5 carServerAction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.RKEAction_E#ADAPTER", tag = 3)
    private final o2 rkeAction;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveRequest#ADAPTER", tag = 4)
    private final e0 closureAction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.SharedHMACWhitelistOperation#ADAPTER", tag = 5)
    private final p sharedHmacWhitelistOperation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.InformationRequest#ADAPTER", tag = 6)
    private final f1 informationRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.SessionInfoRequest#ADAPTER", declaredName = "SessionInfoRequest", tag = 7)
    private final o tesla_proto_SessionInfoRequest;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistOperation#ADAPTER", tag = 8)
    private final n3 whitelistOperation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.ProxyCommand#ADAPTER", tag = 9)
    private final k proxyCommand;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.AuthenticationResponse#ADAPTER", tag = 10)
    private final b authenticationResponse;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyMetadata#ADAPTER", tag = 11)
    private final l1 keyMetadata;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.DeviceMotion#ADAPTER", tag = 12)
    private final k0 deviceMotion;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppDeviceInfo#ADAPTER", tag = 13)
    private final vc0.f appDeviceInfo;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NISessionResponse#ADAPTER", declaredName = "NISessionResponse", tag = 14)
    private final v1 tesla_proto_NISessionResponse;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NISessionStopped#ADAPTER", declaredName = "NISessionStopped", tag = 15)
    private final z1 tesla_proto_NISessionStopped;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistOperation#ADAPTER", tag = 16)
    private final n3 presentKeyWhitelistOperation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppEventLog#ADAPTER", tag = 17)
    private final vc0.i appEventLog;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.GetReaderKey#ADAPTER", tag = 18)
    private final a1 getReaderKeyRequest;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.centerdisplay.server.Request#ADAPTER", tag = 19)
    private final hc0.b centerDisplayRequest;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NIBatchResponse#ADAPTER", tag = 20)
    private final r1 niBatchResponse;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FiraResponse#ADAPTER", tag = 21)
    private final r0 firaResponse;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FiraCapabilities#ADAPTER", tag = 22)
    private final n0 firaCapabilities;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.webrtc_comms.Request#ADAPTER", tag = 23)
    private final wc0.a webrtcRequest;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CPDResponse#ADAPTER", declaredName = "CPDResponse", tag = 24)
    private final b0 tesla_proto_CPDResponse;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ic0/c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lic0/c;", "value", "", "c", "(Lic0/c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lic0/c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lic0/c;", DateTokenConverter.CONVERTER_KEY, "(Lic0/c;)Lic0/c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c> {
        a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.CommandAction", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c decode(com.squareup.wire.k reader) {
            s.k(reader, "reader");
            long jD = reader.d();
            o2 o2VarDecode = null;
            e0 e0VarDecode = null;
            p pVarDecode = null;
            f1 f1VarDecode = null;
            o oVarDecode = null;
            n3 n3VarDecode = null;
            k kVarDecode = null;
            b bVarDecode = null;
            l1 l1VarDecode = null;
            k0 k0VarDecode = null;
            vc0.f fVarDecode = null;
            v1 v1VarDecode = null;
            z1 z1VarDecode = null;
            n3 n3VarDecode2 = null;
            vc0.i iVarDecode = null;
            a1 a1VarDecode = null;
            hc0.b bVarDecode2 = null;
            r1 r1VarDecode = null;
            r0 r0VarDecode = null;
            n0 n0VarDecode = null;
            wc0.a aVarDecode = null;
            b0 b0VarDecode = null;
            g5 g5VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new c(g5VarDecode, o2VarDecode, e0VarDecode, pVarDecode, f1VarDecode, oVarDecode, n3VarDecode, kVarDecode, bVarDecode, l1VarDecode, k0VarDecode, fVarDecode, v1VarDecode, z1VarDecode, n3VarDecode2, iVarDecode, a1VarDecode, bVarDecode2, r1VarDecode, r0VarDecode, n0VarDecode, aVarDecode, b0VarDecode, reader.e(jD));
                }
                switch (iG) {
                    case 2:
                        g5VarDecode = g5.V1.decode(reader);
                        continue;
                    case 3:
                        try {
                            o2VarDecode = o2.ADAPTER.decode(reader);
                            continue;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            o2VarDecode = o2VarDecode;
                            pVarDecode = pVarDecode;
                            e0VarDecode = e0VarDecode;
                        }
                        break;
                    case 4:
                        e0VarDecode = e0.f118637j.decode(reader);
                        continue;
                    case 5:
                        pVarDecode = p.f77564d.decode(reader);
                        continue;
                    case 6:
                        f1VarDecode = f1.f118690f.decode(reader);
                        continue;
                    case 7:
                        oVarDecode = o.f77560d.decode(reader);
                        continue;
                    case 8:
                        n3VarDecode = n3.f118852o.decode(reader);
                        continue;
                    case 9:
                        kVarDecode = k.f77538e.decode(reader);
                        continue;
                    case 10:
                        bVarDecode = b.f77461d.decode(reader);
                        continue;
                    case 11:
                        l1VarDecode = l1.f118815c.decode(reader);
                        continue;
                    case 12:
                        k0VarDecode = k0.f118791d.decode(reader);
                        continue;
                    case 13:
                        fVarDecode = vc0.f.f118679k.decode(reader);
                        continue;
                    case 14:
                        v1VarDecode = v1.f118951e.decode(reader);
                        continue;
                    case 15:
                        z1VarDecode = z1.f119004c.decode(reader);
                        continue;
                    case 16:
                        n3VarDecode2 = n3.f118852o.decode(reader);
                        continue;
                    case 17:
                        iVarDecode = vc0.i.f118736f.decode(reader);
                        continue;
                    case 18:
                        a1VarDecode = a1.f118574c.decode(reader);
                        continue;
                    case 19:
                        bVarDecode2 = hc0.b.f72537d.decode(reader);
                        continue;
                    case 20:
                        r1VarDecode = r1.f118901d.decode(reader);
                        continue;
                    case 21:
                        r0VarDecode = r0.f118898c.decode(reader);
                        continue;
                    case 22:
                        n0VarDecode = n0.f118838i.decode(reader);
                        continue;
                    case 23:
                        aVarDecode = wc0.a.f121662c.decode(reader);
                        continue;
                    case 24:
                        b0VarDecode = b0.f118580c.decode(reader);
                        continue;
                    default:
                        reader.m(iG);
                        break;
                }
                o2VarDecode = o2VarDecode;
                pVarDecode = pVarDecode;
                e0VarDecode = e0VarDecode;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, c value) {
            s.k(writer, "writer");
            s.k(value, "value");
            g5.V1.encodeWithTag(writer, 2, value.getCarServerAction());
            o2.ADAPTER.encodeWithTag(writer, 3, value.getRkeAction());
            e0.f118637j.encodeWithTag(writer, 4, value.getClosureAction());
            p.f77564d.encodeWithTag(writer, 5, value.getSharedHmacWhitelistOperation());
            f1.f118690f.encodeWithTag(writer, 6, value.getInformationRequest());
            o.f77560d.encodeWithTag(writer, 7, value.getTesla_proto_SessionInfoRequest());
            ProtoAdapter<n3> protoAdapter = n3.f118852o;
            protoAdapter.encodeWithTag(writer, 8, value.getWhitelistOperation());
            k.f77538e.encodeWithTag(writer, 9, value.getProxyCommand());
            b.f77461d.encodeWithTag(writer, 10, value.getAuthenticationResponse());
            l1.f118815c.encodeWithTag(writer, 11, value.getKeyMetadata());
            k0.f118791d.encodeWithTag(writer, 12, value.getDeviceMotion());
            vc0.f.f118679k.encodeWithTag(writer, 13, value.getAppDeviceInfo());
            v1.f118951e.encodeWithTag(writer, 14, value.getTesla_proto_NISessionResponse());
            z1.f119004c.encodeWithTag(writer, 15, value.getTesla_proto_NISessionStopped());
            protoAdapter.encodeWithTag(writer, 16, value.getPresentKeyWhitelistOperation());
            vc0.i.f118736f.encodeWithTag(writer, 17, value.getAppEventLog());
            a1.f118574c.encodeWithTag(writer, 18, value.getGetReaderKeyRequest());
            hc0.b.f72537d.encodeWithTag(writer, 19, value.getCenterDisplayRequest());
            r1.f118901d.encodeWithTag(writer, 20, value.getNiBatchResponse());
            r0.f118898c.encodeWithTag(writer, 21, value.getFiraResponse());
            n0.f118838i.encodeWithTag(writer, 22, value.getFiraCapabilities());
            wc0.a.f121662c.encodeWithTag(writer, 23, value.getWebrtcRequest());
            b0.f118580c.encodeWithTag(writer, 24, value.getTesla_proto_CPDResponse());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c value) {
            s.k(value, "value");
            int iD = value.unknownFields().D() + g5.V1.encodedSizeWithTag(2, value.getCarServerAction()) + o2.ADAPTER.encodedSizeWithTag(3, value.getRkeAction()) + e0.f118637j.encodedSizeWithTag(4, value.getClosureAction()) + p.f77564d.encodedSizeWithTag(5, value.getSharedHmacWhitelistOperation()) + f1.f118690f.encodedSizeWithTag(6, value.getInformationRequest()) + o.f77560d.encodedSizeWithTag(7, value.getTesla_proto_SessionInfoRequest());
            ProtoAdapter<n3> protoAdapter = n3.f118852o;
            return iD + protoAdapter.encodedSizeWithTag(8, value.getWhitelistOperation()) + k.f77538e.encodedSizeWithTag(9, value.getProxyCommand()) + b.f77461d.encodedSizeWithTag(10, value.getAuthenticationResponse()) + l1.f118815c.encodedSizeWithTag(11, value.getKeyMetadata()) + k0.f118791d.encodedSizeWithTag(12, value.getDeviceMotion()) + vc0.f.f118679k.encodedSizeWithTag(13, value.getAppDeviceInfo()) + v1.f118951e.encodedSizeWithTag(14, value.getTesla_proto_NISessionResponse()) + z1.f119004c.encodedSizeWithTag(15, value.getTesla_proto_NISessionStopped()) + protoAdapter.encodedSizeWithTag(16, value.getPresentKeyWhitelistOperation()) + vc0.i.f118736f.encodedSizeWithTag(17, value.getAppEventLog()) + a1.f118574c.encodedSizeWithTag(18, value.getGetReaderKeyRequest()) + hc0.b.f72537d.encodedSizeWithTag(19, value.getCenterDisplayRequest()) + r1.f118901d.encodedSizeWithTag(20, value.getNiBatchResponse()) + r0.f118898c.encodedSizeWithTag(21, value.getFiraResponse()) + n0.f118838i.encodedSizeWithTag(22, value.getFiraCapabilities()) + wc0.a.f121662c.encodedSizeWithTag(23, value.getWebrtcRequest()) + b0.f118580c.encodedSizeWithTag(24, value.getTesla_proto_CPDResponse());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c redact(c value) {
            s.k(value, "value");
            g5 carServerAction = value.getCarServerAction();
            g5 g5VarRedact = carServerAction != null ? g5.V1.redact(carServerAction) : null;
            e0 closureAction = value.getClosureAction();
            e0 e0VarRedact = closureAction != null ? e0.f118637j.redact(closureAction) : null;
            p sharedHmacWhitelistOperation = value.getSharedHmacWhitelistOperation();
            p pVarRedact = sharedHmacWhitelistOperation != null ? p.f77564d.redact(sharedHmacWhitelistOperation) : null;
            f1 informationRequest = value.getInformationRequest();
            f1 f1VarRedact = informationRequest != null ? f1.f118690f.redact(informationRequest) : null;
            o tesla_proto_SessionInfoRequest = value.getTesla_proto_SessionInfoRequest();
            o oVarRedact = tesla_proto_SessionInfoRequest != null ? o.f77560d.redact(tesla_proto_SessionInfoRequest) : null;
            n3 whitelistOperation = value.getWhitelistOperation();
            n3 n3VarRedact = whitelistOperation != null ? n3.f118852o.redact(whitelistOperation) : null;
            k proxyCommand = value.getProxyCommand();
            k kVarRedact = proxyCommand != null ? k.f77538e.redact(proxyCommand) : null;
            b authenticationResponse = value.getAuthenticationResponse();
            b bVarRedact = authenticationResponse != null ? b.f77461d.redact(authenticationResponse) : null;
            l1 keyMetadata = value.getKeyMetadata();
            l1 l1VarRedact = keyMetadata != null ? l1.f118815c.redact(keyMetadata) : null;
            k0 deviceMotion = value.getDeviceMotion();
            k0 k0VarRedact = deviceMotion != null ? k0.f118791d.redact(deviceMotion) : null;
            vc0.f appDeviceInfo = value.getAppDeviceInfo();
            vc0.f fVarRedact = appDeviceInfo != null ? vc0.f.f118679k.redact(appDeviceInfo) : null;
            v1 tesla_proto_NISessionResponse = value.getTesla_proto_NISessionResponse();
            v1 v1VarRedact = tesla_proto_NISessionResponse != null ? v1.f118951e.redact(tesla_proto_NISessionResponse) : null;
            z1 tesla_proto_NISessionStopped = value.getTesla_proto_NISessionStopped();
            z1 z1VarRedact = tesla_proto_NISessionStopped != null ? z1.f119004c.redact(tesla_proto_NISessionStopped) : null;
            n3 presentKeyWhitelistOperation = value.getPresentKeyWhitelistOperation();
            n3 n3VarRedact2 = presentKeyWhitelistOperation != null ? n3.f118852o.redact(presentKeyWhitelistOperation) : null;
            vc0.i appEventLog = value.getAppEventLog();
            g5 g5Var = g5VarRedact;
            vc0.i iVarRedact = appEventLog != null ? vc0.i.f118736f.redact(appEventLog) : null;
            a1 getReaderKeyRequest = value.getGetReaderKeyRequest();
            vc0.i iVar = iVarRedact;
            a1 a1VarRedact = getReaderKeyRequest != null ? a1.f118574c.redact(getReaderKeyRequest) : null;
            hc0.b centerDisplayRequest = value.getCenterDisplayRequest();
            a1 a1Var = a1VarRedact;
            hc0.b bVarRedact2 = centerDisplayRequest != null ? hc0.b.f72537d.redact(centerDisplayRequest) : null;
            r1 niBatchResponse = value.getNiBatchResponse();
            hc0.b bVar = bVarRedact2;
            r1 r1VarRedact = niBatchResponse != null ? r1.f118901d.redact(niBatchResponse) : null;
            r0 firaResponse = value.getFiraResponse();
            r1 r1Var = r1VarRedact;
            r0 r0VarRedact = firaResponse != null ? r0.f118898c.redact(firaResponse) : null;
            n0 firaCapabilities = value.getFiraCapabilities();
            r0 r0Var = r0VarRedact;
            n0 n0VarRedact = firaCapabilities != null ? n0.f118838i.redact(firaCapabilities) : null;
            wc0.a webrtcRequest = value.getWebrtcRequest();
            n0 n0Var = n0VarRedact;
            wc0.a aVarRedact = webrtcRequest != null ? wc0.a.f121662c.redact(webrtcRequest) : null;
            b0 tesla_proto_CPDResponse = value.getTesla_proto_CPDResponse();
            return c.b(value, g5Var, null, e0VarRedact, pVarRedact, f1VarRedact, oVarRedact, n3VarRedact, kVarRedact, bVarRedact, l1VarRedact, k0VarRedact, fVarRedact, v1VarRedact, z1VarRedact, n3VarRedact2, iVar, a1Var, bVar, r1Var, r0Var, n0Var, aVarRedact, tesla_proto_CPDResponse != null ? b0.f118580c.redact(tesla_proto_CPDResponse) : null, okio.k.f97943e, 2, null);
        }
    }

    public c() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    public static /* synthetic */ c b(c cVar, g5 g5Var, o2 o2Var, e0 e0Var, p pVar, f1 f1Var, o oVar, n3 n3Var, k kVar, b bVar, l1 l1Var, k0 k0Var, vc0.f fVar, v1 v1Var, z1 z1Var, n3 n3Var2, vc0.i iVar, a1 a1Var, hc0.b bVar2, r1 r1Var, r0 r0Var, n0 n0Var, wc0.a aVar, b0 b0Var, okio.k kVar2, int i11, Object obj) {
        return cVar.a((i11 & 1) != 0 ? cVar.carServerAction : g5Var, (i11 & 2) != 0 ? cVar.rkeAction : o2Var, (i11 & 4) != 0 ? cVar.closureAction : e0Var, (i11 & 8) != 0 ? cVar.sharedHmacWhitelistOperation : pVar, (i11 & 16) != 0 ? cVar.informationRequest : f1Var, (i11 & 32) != 0 ? cVar.tesla_proto_SessionInfoRequest : oVar, (i11 & 64) != 0 ? cVar.whitelistOperation : n3Var, (i11 & 128) != 0 ? cVar.proxyCommand : kVar, (i11 & 256) != 0 ? cVar.authenticationResponse : bVar, (i11 & 512) != 0 ? cVar.keyMetadata : l1Var, (i11 & 1024) != 0 ? cVar.deviceMotion : k0Var, (i11 & 2048) != 0 ? cVar.appDeviceInfo : fVar, (i11 & 4096) != 0 ? cVar.tesla_proto_NISessionResponse : v1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? cVar.tesla_proto_NISessionStopped : z1Var, (i11 & 16384) != 0 ? cVar.presentKeyWhitelistOperation : n3Var2, (i11 & 32768) != 0 ? cVar.appEventLog : iVar, (i11 & 65536) != 0 ? cVar.getReaderKeyRequest : a1Var, (i11 & 131072) != 0 ? cVar.centerDisplayRequest : bVar2, (i11 & 262144) != 0 ? cVar.niBatchResponse : r1Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? cVar.firaResponse : r0Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? cVar.firaCapabilities : n0Var, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? cVar.webrtcRequest : aVar, (i11 & 4194304) != 0 ? cVar.tesla_proto_CPDResponse : b0Var, (i11 & 8388608) != 0 ? cVar.unknownFields() : kVar2);
    }

    public final c a(g5 carServerAction, o2 rkeAction, e0 closureAction, p sharedHmacWhitelistOperation, f1 informationRequest, o tesla_proto_SessionInfoRequest, n3 whitelistOperation, k proxyCommand, b authenticationResponse, l1 keyMetadata, k0 deviceMotion, vc0.f appDeviceInfo, v1 tesla_proto_NISessionResponse, z1 tesla_proto_NISessionStopped, n3 presentKeyWhitelistOperation, vc0.i appEventLog, a1 getReaderKeyRequest, hc0.b centerDisplayRequest, r1 niBatchResponse, r0 firaResponse, n0 firaCapabilities, wc0.a webrtcRequest, b0 tesla_proto_CPDResponse, okio.k unknownFields) {
        s.k(unknownFields, "unknownFields");
        return new c(carServerAction, rkeAction, closureAction, sharedHmacWhitelistOperation, informationRequest, tesla_proto_SessionInfoRequest, whitelistOperation, proxyCommand, authenticationResponse, keyMetadata, deviceMotion, appDeviceInfo, tesla_proto_NISessionResponse, tesla_proto_NISessionStopped, presentKeyWhitelistOperation, appEventLog, getReaderKeyRequest, centerDisplayRequest, niBatchResponse, firaResponse, firaCapabilities, webrtcRequest, tesla_proto_CPDResponse, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final vc0.f getAppDeviceInfo() {
        return this.appDeviceInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final vc0.i getAppEventLog() {
        return this.appEventLog;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getAuthenticationResponse() {
        return this.authenticationResponse;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return s.f(unknownFields(), cVar.unknownFields()) && s.f(this.carServerAction, cVar.carServerAction) && this.rkeAction == cVar.rkeAction && s.f(this.closureAction, cVar.closureAction) && s.f(this.sharedHmacWhitelistOperation, cVar.sharedHmacWhitelistOperation) && s.f(this.informationRequest, cVar.informationRequest) && s.f(this.tesla_proto_SessionInfoRequest, cVar.tesla_proto_SessionInfoRequest) && s.f(this.whitelistOperation, cVar.whitelistOperation) && s.f(this.proxyCommand, cVar.proxyCommand) && s.f(this.authenticationResponse, cVar.authenticationResponse) && s.f(this.keyMetadata, cVar.keyMetadata) && s.f(this.deviceMotion, cVar.deviceMotion) && s.f(this.appDeviceInfo, cVar.appDeviceInfo) && s.f(this.tesla_proto_NISessionResponse, cVar.tesla_proto_NISessionResponse) && s.f(this.tesla_proto_NISessionStopped, cVar.tesla_proto_NISessionStopped) && s.f(this.presentKeyWhitelistOperation, cVar.presentKeyWhitelistOperation) && s.f(this.appEventLog, cVar.appEventLog) && s.f(this.getReaderKeyRequest, cVar.getReaderKeyRequest) && s.f(this.centerDisplayRequest, cVar.centerDisplayRequest) && s.f(this.niBatchResponse, cVar.niBatchResponse) && s.f(this.firaResponse, cVar.firaResponse) && s.f(this.firaCapabilities, cVar.firaCapabilities) && s.f(this.webrtcRequest, cVar.webrtcRequest) && s.f(this.tesla_proto_CPDResponse, cVar.tesla_proto_CPDResponse);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g5 getCarServerAction() {
        return this.carServerAction;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final hc0.b getCenterDisplayRequest() {
        return this.centerDisplayRequest;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e0 getClosureAction() {
        return this.closureAction;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        g5 g5Var = this.carServerAction;
        int iHashCode2 = (iHashCode + (g5Var != null ? g5Var.hashCode() : 0)) * 37;
        o2 o2Var = this.rkeAction;
        int iHashCode3 = (iHashCode2 + (o2Var != null ? o2Var.hashCode() : 0)) * 37;
        e0 e0Var = this.closureAction;
        int iHashCode4 = (iHashCode3 + (e0Var != null ? e0Var.hashCode() : 0)) * 37;
        p pVar = this.sharedHmacWhitelistOperation;
        int iHashCode5 = (iHashCode4 + (pVar != null ? pVar.hashCode() : 0)) * 37;
        f1 f1Var = this.informationRequest;
        int iHashCode6 = (iHashCode5 + (f1Var != null ? f1Var.hashCode() : 0)) * 37;
        o oVar = this.tesla_proto_SessionInfoRequest;
        int iHashCode7 = (iHashCode6 + (oVar != null ? oVar.hashCode() : 0)) * 37;
        n3 n3Var = this.whitelistOperation;
        int iHashCode8 = (iHashCode7 + (n3Var != null ? n3Var.hashCode() : 0)) * 37;
        k kVar = this.proxyCommand;
        int iHashCode9 = (iHashCode8 + (kVar != null ? kVar.hashCode() : 0)) * 37;
        b bVar = this.authenticationResponse;
        int iHashCode10 = (iHashCode9 + (bVar != null ? bVar.hashCode() : 0)) * 37;
        l1 l1Var = this.keyMetadata;
        int iHashCode11 = (iHashCode10 + (l1Var != null ? l1Var.hashCode() : 0)) * 37;
        k0 k0Var = this.deviceMotion;
        int iHashCode12 = (iHashCode11 + (k0Var != null ? k0Var.hashCode() : 0)) * 37;
        vc0.f fVar = this.appDeviceInfo;
        int iHashCode13 = (iHashCode12 + (fVar != null ? fVar.hashCode() : 0)) * 37;
        v1 v1Var = this.tesla_proto_NISessionResponse;
        int iHashCode14 = (iHashCode13 + (v1Var != null ? v1Var.hashCode() : 0)) * 37;
        z1 z1Var = this.tesla_proto_NISessionStopped;
        int iHashCode15 = (iHashCode14 + (z1Var != null ? z1Var.hashCode() : 0)) * 37;
        n3 n3Var2 = this.presentKeyWhitelistOperation;
        int iHashCode16 = (iHashCode15 + (n3Var2 != null ? n3Var2.hashCode() : 0)) * 37;
        vc0.i iVar = this.appEventLog;
        int iHashCode17 = (iHashCode16 + (iVar != null ? iVar.hashCode() : 0)) * 37;
        a1 a1Var = this.getReaderKeyRequest;
        int iHashCode18 = (iHashCode17 + (a1Var != null ? a1Var.hashCode() : 0)) * 37;
        hc0.b bVar2 = this.centerDisplayRequest;
        int iHashCode19 = (iHashCode18 + (bVar2 != null ? bVar2.hashCode() : 0)) * 37;
        r1 r1Var = this.niBatchResponse;
        int iHashCode20 = (iHashCode19 + (r1Var != null ? r1Var.hashCode() : 0)) * 37;
        r0 r0Var = this.firaResponse;
        int iHashCode21 = (iHashCode20 + (r0Var != null ? r0Var.hashCode() : 0)) * 37;
        n0 n0Var = this.firaCapabilities;
        int iHashCode22 = (iHashCode21 + (n0Var != null ? n0Var.hashCode() : 0)) * 37;
        wc0.a aVar = this.webrtcRequest;
        int iHashCode23 = (iHashCode22 + (aVar != null ? aVar.hashCode() : 0)) * 37;
        b0 b0Var = this.tesla_proto_CPDResponse;
        int iHashCode24 = iHashCode23 + (b0Var != null ? b0Var.hashCode() : 0);
        this.hashCode = iHashCode24;
        return iHashCode24;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k0 getDeviceMotion() {
        return this.deviceMotion;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final n0 getFiraCapabilities() {
        return this.firaCapabilities;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final r0 getFiraResponse() {
        return this.firaResponse;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final a1 getGetReaderKeyRequest() {
        return this.getReaderKeyRequest;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final f1 getInformationRequest() {
        return this.informationRequest;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final l1 getKeyMetadata() {
        return this.keyMetadata;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m466newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final r1 getNiBatchResponse() {
        return this.niBatchResponse;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final n3 getPresentKeyWhitelistOperation() {
        return this.presentKeyWhitelistOperation;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final k getProxyCommand() {
        return this.proxyCommand;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final o2 getRkeAction() {
        return this.rkeAction;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final p getSharedHmacWhitelistOperation() {
        return this.sharedHmacWhitelistOperation;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final b0 getTesla_proto_CPDResponse() {
        return this.tesla_proto_CPDResponse;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        g5 g5Var = this.carServerAction;
        if (g5Var != null) {
            arrayList.add("carServerAction=" + g5Var);
        }
        o2 o2Var = this.rkeAction;
        if (o2Var != null) {
            arrayList.add("rkeAction=" + o2Var);
        }
        e0 e0Var = this.closureAction;
        if (e0Var != null) {
            arrayList.add("closureAction=" + e0Var);
        }
        p pVar = this.sharedHmacWhitelistOperation;
        if (pVar != null) {
            arrayList.add("sharedHmacWhitelistOperation=" + pVar);
        }
        f1 f1Var = this.informationRequest;
        if (f1Var != null) {
            arrayList.add("informationRequest=" + f1Var);
        }
        o oVar = this.tesla_proto_SessionInfoRequest;
        if (oVar != null) {
            arrayList.add("tesla_proto_SessionInfoRequest=" + oVar);
        }
        n3 n3Var = this.whitelistOperation;
        if (n3Var != null) {
            arrayList.add("whitelistOperation=" + n3Var);
        }
        k kVar = this.proxyCommand;
        if (kVar != null) {
            arrayList.add("proxyCommand=" + kVar);
        }
        b bVar = this.authenticationResponse;
        if (bVar != null) {
            arrayList.add("authenticationResponse=" + bVar);
        }
        l1 l1Var = this.keyMetadata;
        if (l1Var != null) {
            arrayList.add("keyMetadata=" + l1Var);
        }
        k0 k0Var = this.deviceMotion;
        if (k0Var != null) {
            arrayList.add("deviceMotion=" + k0Var);
        }
        vc0.f fVar = this.appDeviceInfo;
        if (fVar != null) {
            arrayList.add("appDeviceInfo=" + fVar);
        }
        v1 v1Var = this.tesla_proto_NISessionResponse;
        if (v1Var != null) {
            arrayList.add("tesla_proto_NISessionResponse=" + v1Var);
        }
        z1 z1Var = this.tesla_proto_NISessionStopped;
        if (z1Var != null) {
            arrayList.add("tesla_proto_NISessionStopped=" + z1Var);
        }
        n3 n3Var2 = this.presentKeyWhitelistOperation;
        if (n3Var2 != null) {
            arrayList.add("presentKeyWhitelistOperation=" + n3Var2);
        }
        vc0.i iVar = this.appEventLog;
        if (iVar != null) {
            arrayList.add("appEventLog=" + iVar);
        }
        a1 a1Var = this.getReaderKeyRequest;
        if (a1Var != null) {
            arrayList.add("getReaderKeyRequest=" + a1Var);
        }
        hc0.b bVar2 = this.centerDisplayRequest;
        if (bVar2 != null) {
            arrayList.add("centerDisplayRequest=" + bVar2);
        }
        r1 r1Var = this.niBatchResponse;
        if (r1Var != null) {
            arrayList.add("niBatchResponse=" + r1Var);
        }
        r0 r0Var = this.firaResponse;
        if (r0Var != null) {
            arrayList.add("firaResponse=" + r0Var);
        }
        n0 n0Var = this.firaCapabilities;
        if (n0Var != null) {
            arrayList.add("firaCapabilities=" + n0Var);
        }
        wc0.a aVar = this.webrtcRequest;
        if (aVar != null) {
            arrayList.add("webrtcRequest=" + aVar);
        }
        b0 b0Var = this.tesla_proto_CPDResponse;
        if (b0Var != null) {
            arrayList.add("tesla_proto_CPDResponse=" + b0Var);
        }
        return v.y0(arrayList, ", ", "CommandAction{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final v1 getTesla_proto_NISessionResponse() {
        return this.tesla_proto_NISessionResponse;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final z1 getTesla_proto_NISessionStopped() {
        return this.tesla_proto_NISessionStopped;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final o getTesla_proto_SessionInfoRequest() {
        return this.tesla_proto_SessionInfoRequest;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final wc0.a getWebrtcRequest() {
        return this.webrtcRequest;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final n3 getWhitelistOperation() {
        return this.whitelistOperation;
    }

    public /* synthetic */ c(g5 g5Var, o2 o2Var, e0 e0Var, p pVar, f1 f1Var, o oVar, n3 n3Var, k kVar, b bVar, l1 l1Var, k0 k0Var, vc0.f fVar, v1 v1Var, z1 z1Var, n3 n3Var2, vc0.i iVar, a1 a1Var, hc0.b bVar2, r1 r1Var, r0 r0Var, n0 n0Var, wc0.a aVar, b0 b0Var, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : g5Var, (i11 & 2) != 0 ? null : o2Var, (i11 & 4) != 0 ? null : e0Var, (i11 & 8) != 0 ? null : pVar, (i11 & 16) != 0 ? null : f1Var, (i11 & 32) != 0 ? null : oVar, (i11 & 64) != 0 ? null : n3Var, (i11 & 128) != 0 ? null : kVar, (i11 & 256) != 0 ? null : bVar, (i11 & 512) != 0 ? null : l1Var, (i11 & 1024) != 0 ? null : k0Var, (i11 & 2048) != 0 ? null : fVar, (i11 & 4096) != 0 ? null : v1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : z1Var, (i11 & 16384) != 0 ? null : n3Var2, (i11 & 32768) != 0 ? null : iVar, (i11 & 65536) != 0 ? null : a1Var, (i11 & 131072) != 0 ? null : bVar2, (i11 & 262144) != 0 ? null : r1Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : r0Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : n0Var, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : aVar, (i11 & 4194304) != 0 ? null : b0Var, (i11 & 8388608) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m466newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g5 g5Var, o2 o2Var, e0 e0Var, p pVar, f1 f1Var, o oVar, n3 n3Var, k kVar, b bVar, l1 l1Var, k0 k0Var, vc0.f fVar, v1 v1Var, z1 z1Var, n3 n3Var2, vc0.i iVar, a1 a1Var, hc0.b bVar2, r1 r1Var, r0 r0Var, n0 n0Var, wc0.a aVar, b0 b0Var, okio.k unknownFields) {
        super(f77465y, unknownFields);
        s.k(unknownFields, "unknownFields");
        this.carServerAction = g5Var;
        this.rkeAction = o2Var;
        this.closureAction = e0Var;
        this.sharedHmacWhitelistOperation = pVar;
        this.informationRequest = f1Var;
        this.tesla_proto_SessionInfoRequest = oVar;
        this.whitelistOperation = n3Var;
        this.proxyCommand = kVar;
        this.authenticationResponse = bVar;
        this.keyMetadata = l1Var;
        this.deviceMotion = k0Var;
        this.appDeviceInfo = fVar;
        this.tesla_proto_NISessionResponse = v1Var;
        this.tesla_proto_NISessionStopped = z1Var;
        this.presentKeyWhitelistOperation = n3Var2;
        this.appEventLog = iVar;
        this.getReaderKeyRequest = a1Var;
        this.centerDisplayRequest = bVar2;
        this.niBatchResponse = r1Var;
        this.firaResponse = r0Var;
        this.firaCapabilities = n0Var;
        this.webrtcRequest = aVar;
        this.tesla_proto_CPDResponse = b0Var;
        if (x20.d.e(g5Var, o2Var, e0Var, pVar, f1Var, oVar, n3Var, kVar, bVar, l1Var, k0Var, fVar, v1Var, z1Var, n3Var2, iVar, a1Var, bVar2, r1Var, r0Var, n0Var, aVar, b0Var) > 1) {
            throw new IllegalArgumentException("At most one of carServerAction, rkeAction, closureAction, sharedHmacWhitelistOperation, informationRequest, tesla_proto_SessionInfoRequest, whitelistOperation, proxyCommand, authenticationResponse, keyMetadata, deviceMotion, appDeviceInfo, tesla_proto_NISessionResponse, tesla_proto_NISessionStopped, presentKeyWhitelistOperation, appEventLog, getReaderKeyRequest, centerDisplayRequest, niBatchResponse, firaResponse, firaCapabilities, webrtcRequest, tesla_proto_CPDResponse may be non-null");
        }
    }
}
