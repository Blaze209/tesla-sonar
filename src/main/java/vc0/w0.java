package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bN\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001IB±\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0002H\u0017¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ·\u0002\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00104\u001a\u000203¢\u0006\u0004\bD\u0010ER\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010F\u001a\u0004\bG\u0010HR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010Y\u001a\u0004\bZ\u0010[R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010`\u001a\u0004\b\\\u0010aR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bM\u0010hR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010m\u001a\u0004\bf\u0010nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bi\u0010qR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010r\u001a\u0004\bs\u0010tR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010u\u001a\u0004\bb\u0010vR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010w\u001a\u0004\bU\u0010xR\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010y\u001a\u0004\bQ\u0010zR\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\bo\u0010}R\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0086\u0001\u001a\u0006\b\u0082\u0001\u0010\u0087\u0001R\u001f\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0088\u0001\u001a\u0005\b~\u0010\u0089\u0001R\u001f\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b{\u0010\u008c\u0001R\u001f\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bG\u0010\u008d\u0001\u001a\u0006\b\u008a\u0001\u0010\u008e\u0001¨\u0006\u008f\u0001"}, d2 = {"Lvc0/w0;", "Lcom/squareup/wire/f;", "", "Lvc0/i3;", "vehicleStatus", "Lvc0/u2;", "sessionInfo", "Lvc0/p;", "authenticationRequest", "Lvc0/i0;", "commandStatus", "Lvc0/f2;", "personalizationInformation", "Lvc0/l3;", "whitelistInfo", "Lvc0/k3;", "whitelistEntryInfo", "Lvc0/c0;", "capabilities", "Lvc0/n1;", "keyStatusInfo", "Lvc0/a;", "activeKey", "Lvc0/c3;", "unknownKeyInfo", "Lvc0/z0;", "genealogyRequest", "Lvc0/e1;", "imuRequest", "Lvc0/d3;", "unsecureNotification", "Lrc0/k;", "epochSessionInfo", "Lvc0/g;", "appDeviceInfoRequest", "Lvc0/c;", "alert", "Ljc0/c;", "nominalError", "Lvc0/u1;", "VCSEC_NISessionRequest", "Lvc0/y1;", "VCSEC_NISessionStop", "Lvc0/q1;", "VCSEC_NIBatchRequest", "Lvc0/q0;", "VCSEC_FiraRequest", "Lvc0/y;", "VCSEC_CPDMessage", "Lvc0/a2;", "VCSEC_NIStatusUpdate", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/i3;Lvc0/u2;Lvc0/p;Lvc0/i0;Lvc0/f2;Lvc0/l3;Lvc0/k3;Lvc0/c0;Lvc0/n1;Lvc0/a;Lvc0/c3;Lvc0/z0;Lvc0/e1;Lvc0/d3;Lrc0/k;Lvc0/g;Lvc0/c;Ljc0/c;Lvc0/u1;Lvc0/y1;Lvc0/q1;Lvc0/q0;Lvc0/y;Lvc0/a2;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/i3;Lvc0/u2;Lvc0/p;Lvc0/i0;Lvc0/f2;Lvc0/l3;Lvc0/k3;Lvc0/c0;Lvc0/n1;Lvc0/a;Lvc0/c3;Lvc0/z0;Lvc0/e1;Lvc0/d3;Lrc0/k;Lvc0/g;Lvc0/c;Ljc0/c;Lvc0/u1;Lvc0/y1;Lvc0/q1;Lvc0/q0;Lvc0/y;Lvc0/a2;Lokio/k;)Lvc0/w0;", "Lvc0/i3;", "x", "()Lvc0/i3;", "b", "Lvc0/u2;", "o", "()Lvc0/u2;", "c", "Lvc0/p;", "f", "()Lvc0/p;", DateTokenConverter.CONVERTER_KEY, "Lvc0/i0;", "h", "()Lvc0/i0;", "e", "Lvc0/f2;", "n", "()Lvc0/f2;", "Lvc0/l3;", "z", "()Lvc0/l3;", "g", "Lvc0/k3;", "y", "()Lvc0/k3;", "Lvc0/c0;", "()Lvc0/c0;", IntegerTokenConverter.CONVERTER_KEY, "Lvc0/n1;", "l", "()Lvc0/n1;", "j", "Lvc0/a;", "()Lvc0/a;", "k", "Lvc0/c3;", "p", "()Lvc0/c3;", "Lvc0/z0;", "()Lvc0/z0;", "m", "Lvc0/e1;", "()Lvc0/e1;", "Lvc0/d3;", "q", "()Lvc0/d3;", "Lrc0/k;", "()Lrc0/k;", "Lvc0/g;", "()Lvc0/g;", "Lvc0/c;", "()Lvc0/c;", "r", "Ljc0/c;", "()Ljc0/c;", "s", "Lvc0/u1;", "u", "()Lvc0/u1;", "t", "Lvc0/y1;", "v", "()Lvc0/y1;", "Lvc0/q1;", "()Lvc0/q1;", "Lvc0/q0;", "()Lvc0/q0;", "w", "Lvc0/y;", "()Lvc0/y;", "Lvc0/a2;", "()Lvc0/a2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final ProtoAdapter<w0> f118956z = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(w0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.VehicleStatus#ADAPTER", tag = 1)
    private final i3 vehicleStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SessionInfo#ADAPTER", tag = 2)
    private final u2 sessionInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationRequest#ADAPTER", tag = 3)
    private final p authenticationRequest;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CommandStatus#ADAPTER", tag = 4)
    private final i0 commandStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PersonalizationInformation#ADAPTER", tag = 5)
    private final f2 personalizationInformation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistInfo#ADAPTER", tag = 16)
    private final l3 whitelistInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistEntryInfo#ADAPTER", tag = 17)
    private final k3 whitelistEntryInfo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Capabilities#ADAPTER", tag = 19)
    private final c0 capabilities;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyStatusInfo#ADAPTER", tag = 21)
    private final n1 keyStatusInfo;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ActiveKey#ADAPTER", tag = 22)
    private final vc0.a activeKey;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UnknownKeyInfo#ADAPTER", tag = 23)
    private final c3 unknownKeyInfo;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.GenealogyRequest_E#ADAPTER", tag = 31)
    private final z0 genealogyRequest;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.IMURequest_E#ADAPTER", tag = 33)
    private final e1 imuRequest;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.UnsecureNotification#ADAPTER", tag = 39)
    private final d3 unsecureNotification;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.signatures.SessionInfo#ADAPTER", tag = 40)
    private final rc0.k epochSessionInfo;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppDeviceInfoRequest_E#ADAPTER", tag = 44)
    private final g appDeviceInfoRequest;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Alert#ADAPTER", tag = 45)
    private final c alert;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.errors.NominalError#ADAPTER", tag = 46)
    private final jc0.c nominalError;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NISessionRequest#ADAPTER", declaredName = "NISessionRequest", tag = 47)
    private final u1 VCSEC_NISessionRequest;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NISessionStop#ADAPTER", declaredName = "NISessionStop", tag = 48)
    private final y1 VCSEC_NISessionStop;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NIBatchRequest#ADAPTER", declaredName = "NIBatchRequest", tag = 53)
    private final q1 VCSEC_NIBatchRequest;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FiraRequest#ADAPTER", declaredName = "FiraRequest", tag = 54)
    private final q0 VCSEC_FiraRequest;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CPDMessage#ADAPTER", declaredName = "CPDMessage", tag = 55)
    private final y VCSEC_CPDMessage;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NIStatusUpdate#ADAPTER", declaredName = "NIStatusUpdate", tag = 56)
    private final a2 VCSEC_NIStatusUpdate;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/w0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/w0;", "value", "", "c", "(Lvc0/w0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/w0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/w0;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/w0;)Lvc0/w0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<w0> {
        a(com.squareup.wire.b bVar, co0.d<w0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.FromVCSECMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w0 decode(com.squareup.wire.k reader) {
            u2 u2Var;
            p pVar;
            i0 i0Var;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            u2 u2VarDecode = null;
            p pVarDecode = null;
            i0 i0VarDecode = null;
            f2 f2VarDecode = null;
            l3 l3VarDecode = null;
            k3 k3VarDecode = null;
            c0 c0VarDecode = null;
            n1 n1VarDecode = null;
            vc0.a aVarDecode = null;
            c3 c3VarDecode = null;
            z0 z0VarDecode = null;
            e1 e1VarDecode = null;
            d3 d3VarDecode = null;
            rc0.k kVarDecode = null;
            g gVarDecode = null;
            c cVarDecode = null;
            jc0.c cVarDecode2 = null;
            u1 u1VarDecode = null;
            y1 y1VarDecode = null;
            q1 q1VarDecode = null;
            q0 q0VarDecode = null;
            y yVarDecode = null;
            a2 a2VarDecode = null;
            i3 i3VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new w0(i3VarDecode, u2VarDecode, pVarDecode, i0VarDecode, f2VarDecode, l3VarDecode, k3VarDecode, c0VarDecode, n1VarDecode, aVarDecode, c3VarDecode, z0VarDecode, e1VarDecode, d3VarDecode, kVarDecode, gVarDecode, cVarDecode, cVarDecode2, u1VarDecode, y1VarDecode, q1VarDecode, q0VarDecode, yVarDecode, a2VarDecode, reader.e(jD));
                }
                if (iG == 1) {
                    i3VarDecode = i3.f118766j.decode(reader);
                } else if (iG == 2) {
                    u2VarDecode = u2.f118941e.decode(reader);
                } else if (iG == 3) {
                    pVarDecode = p.f118867e.decode(reader);
                } else if (iG == 4) {
                    i0VarDecode = i0.f118742e.decode(reader);
                } else if (iG == 5) {
                    f2VarDecode = f2.f118696c.decode(reader);
                } else if (iG == 16) {
                    l3VarDecode = l3.f118821e.decode(reader);
                } else if (iG == 17) {
                    k3VarDecode = k3.f118803i.decode(reader);
                } else if (iG != 19) {
                    if (iG == 31) {
                        u2Var = u2VarDecode;
                        pVar = pVarDecode;
                        i0Var = i0VarDecode;
                        try {
                            z0VarDecode = z0.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                    } else if (iG == 33) {
                        u2Var = u2VarDecode;
                        pVar = pVarDecode;
                        i0Var = i0VarDecode;
                        try {
                            e1VarDecode = e1.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                        }
                    } else if (iG == 39) {
                        d3VarDecode = d3.f118625d.decode(reader);
                    } else if (iG != 40) {
                        switch (iG) {
                            case 21:
                                n1VarDecode = n1.f118847e.decode(reader);
                                continue;
                            case 22:
                                aVarDecode = vc0.a.f118571c.decode(reader);
                                continue;
                            case 23:
                                c3VarDecode = c3.f118617e.decode(reader);
                                continue;
                            default:
                                switch (iG) {
                                    case 44:
                                        try {
                                            gVarDecode = g.ADAPTER.decode(reader);
                                            continue;
                                        } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                            u2Var = u2VarDecode;
                                            pVar = pVarDecode;
                                            i0Var = i0VarDecode;
                                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                                            u2VarDecode = u2Var;
                                            pVarDecode = pVar;
                                            i0VarDecode = i0Var;
                                        }
                                        break;
                                    case 45:
                                        cVarDecode = c.f118583d.decode(reader);
                                        continue;
                                    case 46:
                                        cVarDecode2 = jc0.c.f83593d.decode(reader);
                                        continue;
                                    case 47:
                                        u1VarDecode = u1.f118937d.decode(reader);
                                        continue;
                                    case 48:
                                        y1VarDecode = y1.f118997c.decode(reader);
                                        continue;
                                    default:
                                        switch (iG) {
                                            case 53:
                                                q1VarDecode = q1.f118883c.decode(reader);
                                                continue;
                                            case 54:
                                                q0VarDecode = q0.f118880c.decode(reader);
                                                continue;
                                            case 55:
                                                yVarDecode = y.f118994c.decode(reader);
                                                continue;
                                            case 56:
                                                a2VarDecode = a2.f118577c.decode(reader);
                                                continue;
                                            default:
                                                reader.m(iG);
                                                u2Var = u2VarDecode;
                                                pVar = pVarDecode;
                                                i0Var = i0VarDecode;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        kVarDecode = rc0.k.f107686i.decode(reader);
                    }
                    u2VarDecode = u2Var;
                    pVarDecode = pVar;
                    i0VarDecode = i0Var;
                } else {
                    c0VarDecode = c0.f118587d.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, w0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            i3.f118766j.encodeWithTag(writer, 1, value.getVehicleStatus());
            u2.f118941e.encodeWithTag(writer, 2, value.getSessionInfo());
            p.f118867e.encodeWithTag(writer, 3, value.getAuthenticationRequest());
            i0.f118742e.encodeWithTag(writer, 4, value.getCommandStatus());
            f2.f118696c.encodeWithTag(writer, 5, value.getPersonalizationInformation());
            l3.f118821e.encodeWithTag(writer, 16, value.getWhitelistInfo());
            k3.f118803i.encodeWithTag(writer, 17, value.getWhitelistEntryInfo());
            c0.f118587d.encodeWithTag(writer, 19, value.getCapabilities());
            n1.f118847e.encodeWithTag(writer, 21, value.getKeyStatusInfo());
            vc0.a.f118571c.encodeWithTag(writer, 22, value.getActiveKey());
            c3.f118617e.encodeWithTag(writer, 23, value.getUnknownKeyInfo());
            z0.ADAPTER.encodeWithTag(writer, 31, value.getGenealogyRequest());
            e1.ADAPTER.encodeWithTag(writer, 33, value.getImuRequest());
            d3.f118625d.encodeWithTag(writer, 39, value.getUnsecureNotification());
            rc0.k.f107686i.encodeWithTag(writer, 40, value.getEpochSessionInfo());
            g.ADAPTER.encodeWithTag(writer, 44, value.getAppDeviceInfoRequest());
            c.f118583d.encodeWithTag(writer, 45, value.getAlert());
            jc0.c.f83593d.encodeWithTag(writer, 46, value.getNominalError());
            u1.f118937d.encodeWithTag(writer, 47, value.getVCSEC_NISessionRequest());
            y1.f118997c.encodeWithTag(writer, 48, value.getVCSEC_NISessionStop());
            q1.f118883c.encodeWithTag(writer, 53, value.getVCSEC_NIBatchRequest());
            q0.f118880c.encodeWithTag(writer, 54, value.getVCSEC_FiraRequest());
            y.f118994c.encodeWithTag(writer, 55, value.getVCSEC_CPDMessage());
            a2.f118577c.encodeWithTag(writer, 56, value.getVCSEC_NIStatusUpdate());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(w0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return value.unknownFields().D() + i3.f118766j.encodedSizeWithTag(1, value.getVehicleStatus()) + u2.f118941e.encodedSizeWithTag(2, value.getSessionInfo()) + p.f118867e.encodedSizeWithTag(3, value.getAuthenticationRequest()) + i0.f118742e.encodedSizeWithTag(4, value.getCommandStatus()) + f2.f118696c.encodedSizeWithTag(5, value.getPersonalizationInformation()) + l3.f118821e.encodedSizeWithTag(16, value.getWhitelistInfo()) + k3.f118803i.encodedSizeWithTag(17, value.getWhitelistEntryInfo()) + c0.f118587d.encodedSizeWithTag(19, value.getCapabilities()) + n1.f118847e.encodedSizeWithTag(21, value.getKeyStatusInfo()) + vc0.a.f118571c.encodedSizeWithTag(22, value.getActiveKey()) + c3.f118617e.encodedSizeWithTag(23, value.getUnknownKeyInfo()) + z0.ADAPTER.encodedSizeWithTag(31, value.getGenealogyRequest()) + e1.ADAPTER.encodedSizeWithTag(33, value.getImuRequest()) + d3.f118625d.encodedSizeWithTag(39, value.getUnsecureNotification()) + rc0.k.f107686i.encodedSizeWithTag(40, value.getEpochSessionInfo()) + g.ADAPTER.encodedSizeWithTag(44, value.getAppDeviceInfoRequest()) + c.f118583d.encodedSizeWithTag(45, value.getAlert()) + jc0.c.f83593d.encodedSizeWithTag(46, value.getNominalError()) + u1.f118937d.encodedSizeWithTag(47, value.getVCSEC_NISessionRequest()) + y1.f118997c.encodedSizeWithTag(48, value.getVCSEC_NISessionStop()) + q1.f118883c.encodedSizeWithTag(53, value.getVCSEC_NIBatchRequest()) + q0.f118880c.encodedSizeWithTag(54, value.getVCSEC_FiraRequest()) + y.f118994c.encodedSizeWithTag(55, value.getVCSEC_CPDMessage()) + a2.f118577c.encodedSizeWithTag(56, value.getVCSEC_NIStatusUpdate());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public w0 redact(w0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            i3 vehicleStatus = value.getVehicleStatus();
            i3 i3VarRedact = vehicleStatus != null ? i3.f118766j.redact(vehicleStatus) : null;
            u2 sessionInfo = value.getSessionInfo();
            u2 u2VarRedact = sessionInfo != null ? u2.f118941e.redact(sessionInfo) : null;
            p authenticationRequest = value.getAuthenticationRequest();
            p pVarRedact = authenticationRequest != null ? p.f118867e.redact(authenticationRequest) : null;
            i0 commandStatus = value.getCommandStatus();
            i0 i0VarRedact = commandStatus != null ? i0.f118742e.redact(commandStatus) : null;
            f2 personalizationInformation = value.getPersonalizationInformation();
            f2 f2VarRedact = personalizationInformation != null ? f2.f118696c.redact(personalizationInformation) : null;
            l3 whitelistInfo = value.getWhitelistInfo();
            l3 l3VarRedact = whitelistInfo != null ? l3.f118821e.redact(whitelistInfo) : null;
            k3 whitelistEntryInfo = value.getWhitelistEntryInfo();
            k3 k3VarRedact = whitelistEntryInfo != null ? k3.f118803i.redact(whitelistEntryInfo) : null;
            c0 capabilities = value.getCapabilities();
            c0 c0VarRedact = capabilities != null ? c0.f118587d.redact(capabilities) : null;
            n1 keyStatusInfo = value.getKeyStatusInfo();
            n1 n1VarRedact = keyStatusInfo != null ? n1.f118847e.redact(keyStatusInfo) : null;
            vc0.a activeKey = value.getActiveKey();
            vc0.a aVarRedact = activeKey != null ? vc0.a.f118571c.redact(activeKey) : null;
            c3 unknownKeyInfo = value.getUnknownKeyInfo();
            c3 c3VarRedact = unknownKeyInfo != null ? c3.f118617e.redact(unknownKeyInfo) : null;
            d3 unsecureNotification = value.getUnsecureNotification();
            d3 d3VarRedact = unsecureNotification != null ? d3.f118625d.redact(unsecureNotification) : null;
            rc0.k epochSessionInfo = value.getEpochSessionInfo();
            rc0.k kVarRedact = epochSessionInfo != null ? rc0.k.f107686i.redact(epochSessionInfo) : null;
            c alert = value.getAlert();
            c cVarRedact = alert != null ? c.f118583d.redact(alert) : null;
            jc0.c nominalError = value.getNominalError();
            jc0.c cVarRedact2 = nominalError != null ? jc0.c.f83593d.redact(nominalError) : null;
            u1 vCSEC_NISessionRequest = value.getVCSEC_NISessionRequest();
            u1 u1VarRedact = vCSEC_NISessionRequest != null ? u1.f118937d.redact(vCSEC_NISessionRequest) : null;
            y1 vCSEC_NISessionStop = value.getVCSEC_NISessionStop();
            y1 y1VarRedact = vCSEC_NISessionStop != null ? y1.f118997c.redact(vCSEC_NISessionStop) : null;
            q1 vCSEC_NIBatchRequest = value.getVCSEC_NIBatchRequest();
            q1 q1VarRedact = vCSEC_NIBatchRequest != null ? q1.f118883c.redact(vCSEC_NIBatchRequest) : null;
            q0 vCSEC_FiraRequest = value.getVCSEC_FiraRequest();
            q0 q0VarRedact = vCSEC_FiraRequest != null ? q0.f118880c.redact(vCSEC_FiraRequest) : null;
            y vCSEC_CPDMessage = value.getVCSEC_CPDMessage();
            y yVarRedact = vCSEC_CPDMessage != null ? y.f118994c.redact(vCSEC_CPDMessage) : null;
            a2 vCSEC_NIStatusUpdate = value.getVCSEC_NIStatusUpdate();
            return w0.b(value, i3VarRedact, u2VarRedact, pVarRedact, i0VarRedact, f2VarRedact, l3VarRedact, k3VarRedact, c0VarRedact, n1VarRedact, aVarRedact, c3VarRedact, null, null, d3VarRedact, kVarRedact, null, cVarRedact, cVarRedact2, u1VarRedact, y1VarRedact, q1VarRedact, q0VarRedact, yVarRedact, vCSEC_NIStatusUpdate != null ? a2.f118577c.redact(vCSEC_NIStatusUpdate) : null, okio.k.f97943e, 38912, null);
        }
    }

    public w0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public static /* synthetic */ w0 b(w0 w0Var, i3 i3Var, u2 u2Var, p pVar, i0 i0Var, f2 f2Var, l3 l3Var, k3 k3Var, c0 c0Var, n1 n1Var, vc0.a aVar, c3 c3Var, z0 z0Var, e1 e1Var, d3 d3Var, rc0.k kVar, g gVar, c cVar, jc0.c cVar2, u1 u1Var, y1 y1Var, q1 q1Var, q0 q0Var, y yVar, a2 a2Var, okio.k kVar2, int i11, Object obj) {
        return w0Var.a((i11 & 1) != 0 ? w0Var.vehicleStatus : i3Var, (i11 & 2) != 0 ? w0Var.sessionInfo : u2Var, (i11 & 4) != 0 ? w0Var.authenticationRequest : pVar, (i11 & 8) != 0 ? w0Var.commandStatus : i0Var, (i11 & 16) != 0 ? w0Var.personalizationInformation : f2Var, (i11 & 32) != 0 ? w0Var.whitelistInfo : l3Var, (i11 & 64) != 0 ? w0Var.whitelistEntryInfo : k3Var, (i11 & 128) != 0 ? w0Var.capabilities : c0Var, (i11 & 256) != 0 ? w0Var.keyStatusInfo : n1Var, (i11 & 512) != 0 ? w0Var.activeKey : aVar, (i11 & 1024) != 0 ? w0Var.unknownKeyInfo : c3Var, (i11 & 2048) != 0 ? w0Var.genealogyRequest : z0Var, (i11 & 4096) != 0 ? w0Var.imuRequest : e1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? w0Var.unsecureNotification : d3Var, (i11 & 16384) != 0 ? w0Var.epochSessionInfo : kVar, (i11 & 32768) != 0 ? w0Var.appDeviceInfoRequest : gVar, (i11 & 65536) != 0 ? w0Var.alert : cVar, (i11 & 131072) != 0 ? w0Var.nominalError : cVar2, (i11 & 262144) != 0 ? w0Var.VCSEC_NISessionRequest : u1Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? w0Var.VCSEC_NISessionStop : y1Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? w0Var.VCSEC_NIBatchRequest : q1Var, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? w0Var.VCSEC_FiraRequest : q0Var, (i11 & 4194304) != 0 ? w0Var.VCSEC_CPDMessage : yVar, (i11 & 8388608) != 0 ? w0Var.VCSEC_NIStatusUpdate : a2Var, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? w0Var.unknownFields() : kVar2);
    }

    public final w0 a(i3 vehicleStatus, u2 sessionInfo, p authenticationRequest, i0 commandStatus, f2 personalizationInformation, l3 whitelistInfo, k3 whitelistEntryInfo, c0 capabilities, n1 keyStatusInfo, vc0.a activeKey, c3 unknownKeyInfo, z0 genealogyRequest, e1 imuRequest, d3 unsecureNotification, rc0.k epochSessionInfo, g appDeviceInfoRequest, c alert, jc0.c nominalError, u1 VCSEC_NISessionRequest, y1 VCSEC_NISessionStop, q1 VCSEC_NIBatchRequest, q0 VCSEC_FiraRequest, y VCSEC_CPDMessage, a2 VCSEC_NIStatusUpdate, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new w0(vehicleStatus, sessionInfo, authenticationRequest, commandStatus, personalizationInformation, whitelistInfo, whitelistEntryInfo, capabilities, keyStatusInfo, activeKey, unknownKeyInfo, genealogyRequest, imuRequest, unsecureNotification, epochSessionInfo, appDeviceInfoRequest, alert, nominalError, VCSEC_NISessionRequest, VCSEC_NISessionStop, VCSEC_NIBatchRequest, VCSEC_FiraRequest, VCSEC_CPDMessage, VCSEC_NIStatusUpdate, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final vc0.a getActiveKey() {
        return this.activeKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getAlert() {
        return this.alert;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g getAppDeviceInfoRequest() {
        return this.appDeviceInfoRequest;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), w0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.vehicleStatus, w0Var.vehicleStatus) && p013kotlin.jvm.internal.s.f(this.sessionInfo, w0Var.sessionInfo) && p013kotlin.jvm.internal.s.f(this.authenticationRequest, w0Var.authenticationRequest) && p013kotlin.jvm.internal.s.f(this.commandStatus, w0Var.commandStatus) && p013kotlin.jvm.internal.s.f(this.personalizationInformation, w0Var.personalizationInformation) && p013kotlin.jvm.internal.s.f(this.whitelistInfo, w0Var.whitelistInfo) && p013kotlin.jvm.internal.s.f(this.whitelistEntryInfo, w0Var.whitelistEntryInfo) && p013kotlin.jvm.internal.s.f(this.capabilities, w0Var.capabilities) && p013kotlin.jvm.internal.s.f(this.keyStatusInfo, w0Var.keyStatusInfo) && p013kotlin.jvm.internal.s.f(this.activeKey, w0Var.activeKey) && p013kotlin.jvm.internal.s.f(this.unknownKeyInfo, w0Var.unknownKeyInfo) && this.genealogyRequest == w0Var.genealogyRequest && this.imuRequest == w0Var.imuRequest && p013kotlin.jvm.internal.s.f(this.unsecureNotification, w0Var.unsecureNotification) && p013kotlin.jvm.internal.s.f(this.epochSessionInfo, w0Var.epochSessionInfo) && this.appDeviceInfoRequest == w0Var.appDeviceInfoRequest && p013kotlin.jvm.internal.s.f(this.alert, w0Var.alert) && p013kotlin.jvm.internal.s.f(this.nominalError, w0Var.nominalError) && p013kotlin.jvm.internal.s.f(this.VCSEC_NISessionRequest, w0Var.VCSEC_NISessionRequest) && p013kotlin.jvm.internal.s.f(this.VCSEC_NISessionStop, w0Var.VCSEC_NISessionStop) && p013kotlin.jvm.internal.s.f(this.VCSEC_NIBatchRequest, w0Var.VCSEC_NIBatchRequest) && p013kotlin.jvm.internal.s.f(this.VCSEC_FiraRequest, w0Var.VCSEC_FiraRequest) && p013kotlin.jvm.internal.s.f(this.VCSEC_CPDMessage, w0Var.VCSEC_CPDMessage) && p013kotlin.jvm.internal.s.f(this.VCSEC_NIStatusUpdate, w0Var.VCSEC_NIStatusUpdate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final p getAuthenticationRequest() {
        return this.authenticationRequest;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c0 getCapabilities() {
        return this.capabilities;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final i0 getCommandStatus() {
        return this.commandStatus;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        i3 i3Var = this.vehicleStatus;
        int iHashCode2 = (iHashCode + (i3Var != null ? i3Var.hashCode() : 0)) * 37;
        u2 u2Var = this.sessionInfo;
        int iHashCode3 = (iHashCode2 + (u2Var != null ? u2Var.hashCode() : 0)) * 37;
        p pVar = this.authenticationRequest;
        int iHashCode4 = (iHashCode3 + (pVar != null ? pVar.hashCode() : 0)) * 37;
        i0 i0Var = this.commandStatus;
        int iHashCode5 = (iHashCode4 + (i0Var != null ? i0Var.hashCode() : 0)) * 37;
        f2 f2Var = this.personalizationInformation;
        int iHashCode6 = (iHashCode5 + (f2Var != null ? f2Var.hashCode() : 0)) * 37;
        l3 l3Var = this.whitelistInfo;
        int iHashCode7 = (iHashCode6 + (l3Var != null ? l3Var.hashCode() : 0)) * 37;
        k3 k3Var = this.whitelistEntryInfo;
        int iHashCode8 = (iHashCode7 + (k3Var != null ? k3Var.hashCode() : 0)) * 37;
        c0 c0Var = this.capabilities;
        int iHashCode9 = (iHashCode8 + (c0Var != null ? c0Var.hashCode() : 0)) * 37;
        n1 n1Var = this.keyStatusInfo;
        int iHashCode10 = (iHashCode9 + (n1Var != null ? n1Var.hashCode() : 0)) * 37;
        vc0.a aVar = this.activeKey;
        int iHashCode11 = (iHashCode10 + (aVar != null ? aVar.hashCode() : 0)) * 37;
        c3 c3Var = this.unknownKeyInfo;
        int iHashCode12 = (iHashCode11 + (c3Var != null ? c3Var.hashCode() : 0)) * 37;
        z0 z0Var = this.genealogyRequest;
        int iHashCode13 = (iHashCode12 + (z0Var != null ? z0Var.hashCode() : 0)) * 37;
        e1 e1Var = this.imuRequest;
        int iHashCode14 = (iHashCode13 + (e1Var != null ? e1Var.hashCode() : 0)) * 37;
        d3 d3Var = this.unsecureNotification;
        int iHashCode15 = (iHashCode14 + (d3Var != null ? d3Var.hashCode() : 0)) * 37;
        rc0.k kVar = this.epochSessionInfo;
        int iHashCode16 = (iHashCode15 + (kVar != null ? kVar.hashCode() : 0)) * 37;
        g gVar = this.appDeviceInfoRequest;
        int iHashCode17 = (iHashCode16 + (gVar != null ? gVar.hashCode() : 0)) * 37;
        c cVar = this.alert;
        int iHashCode18 = (iHashCode17 + (cVar != null ? cVar.hashCode() : 0)) * 37;
        jc0.c cVar2 = this.nominalError;
        int iHashCode19 = (iHashCode18 + (cVar2 != null ? cVar2.hashCode() : 0)) * 37;
        u1 u1Var = this.VCSEC_NISessionRequest;
        int iHashCode20 = (iHashCode19 + (u1Var != null ? u1Var.hashCode() : 0)) * 37;
        y1 y1Var = this.VCSEC_NISessionStop;
        int iHashCode21 = (iHashCode20 + (y1Var != null ? y1Var.hashCode() : 0)) * 37;
        q1 q1Var = this.VCSEC_NIBatchRequest;
        int iHashCode22 = (iHashCode21 + (q1Var != null ? q1Var.hashCode() : 0)) * 37;
        q0 q0Var = this.VCSEC_FiraRequest;
        int iHashCode23 = (iHashCode22 + (q0Var != null ? q0Var.hashCode() : 0)) * 37;
        y yVar = this.VCSEC_CPDMessage;
        int iHashCode24 = (iHashCode23 + (yVar != null ? yVar.hashCode() : 0)) * 37;
        a2 a2Var = this.VCSEC_NIStatusUpdate;
        int iHashCode25 = iHashCode24 + (a2Var != null ? a2Var.hashCode() : 0);
        this.hashCode = iHashCode25;
        return iHashCode25;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final rc0.k getEpochSessionInfo() {
        return this.epochSessionInfo;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final z0 getGenealogyRequest() {
        return this.genealogyRequest;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final e1 getImuRequest() {
        return this.imuRequest;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final n1 getKeyStatusInfo() {
        return this.keyStatusInfo;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final jc0.c getNominalError() {
        return this.nominalError;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final f2 getPersonalizationInformation() {
        return this.personalizationInformation;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m846newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final u2 getSessionInfo() {
        return this.sessionInfo;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final c3 getUnknownKeyInfo() {
        return this.unknownKeyInfo;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final d3 getUnsecureNotification() {
        return this.unsecureNotification;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final y getVCSEC_CPDMessage() {
        return this.VCSEC_CPDMessage;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final q0 getVCSEC_FiraRequest() {
        return this.VCSEC_FiraRequest;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final q1 getVCSEC_NIBatchRequest() {
        return this.VCSEC_NIBatchRequest;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        i3 i3Var = this.vehicleStatus;
        if (i3Var != null) {
            arrayList.add("vehicleStatus=" + i3Var);
        }
        u2 u2Var = this.sessionInfo;
        if (u2Var != null) {
            arrayList.add("sessionInfo=" + u2Var);
        }
        p pVar = this.authenticationRequest;
        if (pVar != null) {
            arrayList.add("authenticationRequest=" + pVar);
        }
        i0 i0Var = this.commandStatus;
        if (i0Var != null) {
            arrayList.add("commandStatus=" + i0Var);
        }
        f2 f2Var = this.personalizationInformation;
        if (f2Var != null) {
            arrayList.add("personalizationInformation=" + f2Var);
        }
        l3 l3Var = this.whitelistInfo;
        if (l3Var != null) {
            arrayList.add("whitelistInfo=" + l3Var);
        }
        k3 k3Var = this.whitelistEntryInfo;
        if (k3Var != null) {
            arrayList.add("whitelistEntryInfo=" + k3Var);
        }
        c0 c0Var = this.capabilities;
        if (c0Var != null) {
            arrayList.add("capabilities=" + c0Var);
        }
        n1 n1Var = this.keyStatusInfo;
        if (n1Var != null) {
            arrayList.add("keyStatusInfo=" + n1Var);
        }
        vc0.a aVar = this.activeKey;
        if (aVar != null) {
            arrayList.add("activeKey=" + aVar);
        }
        c3 c3Var = this.unknownKeyInfo;
        if (c3Var != null) {
            arrayList.add("unknownKeyInfo=" + c3Var);
        }
        z0 z0Var = this.genealogyRequest;
        if (z0Var != null) {
            arrayList.add("genealogyRequest=" + z0Var);
        }
        e1 e1Var = this.imuRequest;
        if (e1Var != null) {
            arrayList.add("imuRequest=" + e1Var);
        }
        d3 d3Var = this.unsecureNotification;
        if (d3Var != null) {
            arrayList.add("unsecureNotification=" + d3Var);
        }
        rc0.k kVar = this.epochSessionInfo;
        if (kVar != null) {
            arrayList.add("epochSessionInfo=" + kVar);
        }
        g gVar = this.appDeviceInfoRequest;
        if (gVar != null) {
            arrayList.add("appDeviceInfoRequest=" + gVar);
        }
        c cVar = this.alert;
        if (cVar != null) {
            arrayList.add("alert=" + cVar);
        }
        jc0.c cVar2 = this.nominalError;
        if (cVar2 != null) {
            arrayList.add("nominalError=" + cVar2);
        }
        u1 u1Var = this.VCSEC_NISessionRequest;
        if (u1Var != null) {
            arrayList.add("VCSEC_NISessionRequest=" + u1Var);
        }
        y1 y1Var = this.VCSEC_NISessionStop;
        if (y1Var != null) {
            arrayList.add("VCSEC_NISessionStop=" + y1Var);
        }
        q1 q1Var = this.VCSEC_NIBatchRequest;
        if (q1Var != null) {
            arrayList.add("VCSEC_NIBatchRequest=" + q1Var);
        }
        q0 q0Var = this.VCSEC_FiraRequest;
        if (q0Var != null) {
            arrayList.add("VCSEC_FiraRequest=" + q0Var);
        }
        y yVar = this.VCSEC_CPDMessage;
        if (yVar != null) {
            arrayList.add("VCSEC_CPDMessage=" + yVar);
        }
        a2 a2Var = this.VCSEC_NIStatusUpdate;
        if (a2Var != null) {
            arrayList.add("VCSEC_NIStatusUpdate=" + a2Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "FromVCSECMessage{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final u1 getVCSEC_NISessionRequest() {
        return this.VCSEC_NISessionRequest;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final y1 getVCSEC_NISessionStop() {
        return this.VCSEC_NISessionStop;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final a2 getVCSEC_NIStatusUpdate() {
        return this.VCSEC_NIStatusUpdate;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final i3 getVehicleStatus() {
        return this.vehicleStatus;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final k3 getWhitelistEntryInfo() {
        return this.whitelistEntryInfo;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final l3 getWhitelistInfo() {
        return this.whitelistInfo;
    }

    public /* synthetic */ w0(i3 i3Var, u2 u2Var, p pVar, i0 i0Var, f2 f2Var, l3 l3Var, k3 k3Var, c0 c0Var, n1 n1Var, vc0.a aVar, c3 c3Var, z0 z0Var, e1 e1Var, d3 d3Var, rc0.k kVar, g gVar, c cVar, jc0.c cVar2, u1 u1Var, y1 y1Var, q1 q1Var, q0 q0Var, y yVar, a2 a2Var, okio.k kVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : i3Var, (i11 & 2) != 0 ? null : u2Var, (i11 & 4) != 0 ? null : pVar, (i11 & 8) != 0 ? null : i0Var, (i11 & 16) != 0 ? null : f2Var, (i11 & 32) != 0 ? null : l3Var, (i11 & 64) != 0 ? null : k3Var, (i11 & 128) != 0 ? null : c0Var, (i11 & 256) != 0 ? null : n1Var, (i11 & 512) != 0 ? null : aVar, (i11 & 1024) != 0 ? null : c3Var, (i11 & 2048) != 0 ? null : z0Var, (i11 & 4096) != 0 ? null : e1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : d3Var, (i11 & 16384) != 0 ? null : kVar, (i11 & 32768) != 0 ? null : gVar, (i11 & 65536) != 0 ? null : cVar, (i11 & 131072) != 0 ? null : cVar2, (i11 & 262144) != 0 ? null : u1Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : y1Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : q1Var, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : q0Var, (i11 & 4194304) != 0 ? null : yVar, (i11 & 8388608) != 0 ? null : a2Var, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? okio.k.f97943e : kVar2);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m846newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(i3 i3Var, u2 u2Var, p pVar, i0 i0Var, f2 f2Var, l3 l3Var, k3 k3Var, c0 c0Var, n1 n1Var, vc0.a aVar, c3 c3Var, z0 z0Var, e1 e1Var, d3 d3Var, rc0.k kVar, g gVar, c cVar, jc0.c cVar2, u1 u1Var, y1 y1Var, q1 q1Var, q0 q0Var, y yVar, a2 a2Var, okio.k unknownFields) {
        super(f118956z, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.vehicleStatus = i3Var;
        this.sessionInfo = u2Var;
        this.authenticationRequest = pVar;
        this.commandStatus = i0Var;
        this.personalizationInformation = f2Var;
        this.whitelistInfo = l3Var;
        this.whitelistEntryInfo = k3Var;
        this.capabilities = c0Var;
        this.keyStatusInfo = n1Var;
        this.activeKey = aVar;
        this.unknownKeyInfo = c3Var;
        this.genealogyRequest = z0Var;
        this.imuRequest = e1Var;
        this.unsecureNotification = d3Var;
        this.epochSessionInfo = kVar;
        this.appDeviceInfoRequest = gVar;
        this.alert = cVar;
        this.nominalError = cVar2;
        this.VCSEC_NISessionRequest = u1Var;
        this.VCSEC_NISessionStop = y1Var;
        this.VCSEC_NIBatchRequest = q1Var;
        this.VCSEC_FiraRequest = q0Var;
        this.VCSEC_CPDMessage = yVar;
        this.VCSEC_NIStatusUpdate = a2Var;
        if (x20.d.e(i3Var, u2Var, pVar, i0Var, f2Var, l3Var, k3Var, c0Var, n1Var, aVar, c3Var, z0Var, e1Var, d3Var, kVar, gVar, cVar, cVar2, u1Var, y1Var, q1Var, q0Var, yVar, a2Var) > 1) {
            throw new IllegalArgumentException("At most one of vehicleStatus, sessionInfo, authenticationRequest, commandStatus, personalizationInformation, whitelistInfo, whitelistEntryInfo, capabilities, keyStatusInfo, activeKey, unknownKeyInfo, genealogyRequest, imuRequest, unsecureNotification, epochSessionInfo, appDeviceInfoRequest, alert, nominalError, VCSEC_NISessionRequest, VCSEC_NISessionStop, VCSEC_NIBatchRequest, VCSEC_FiraRequest, VCSEC_CPDMessage, VCSEC_NIStatusUpdate may be non-null");
        }
    }
}
