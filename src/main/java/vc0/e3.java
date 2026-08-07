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
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bQ\u0018\u0000 x2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KB½\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0002H\u0017¢\u0006\u0004\b9\u0010:J\u001a\u0010>\u001a\u00020=2\b\u0010<\u001a\u0004\u0018\u00010;H\u0096\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJÃ\u0002\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u00106\u001a\u000205¢\u0006\u0004\bF\u0010GR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010[\u001a\u0004\b\\\u0010]R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010f\u001a\u0004\bg\u0010hR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010m\u001a\u0004\bO\u0010nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010o\u001a\u0004\bp\u0010qR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010z\u001a\u0004\bS\u0010{R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010|\u001a\u0004\b}\u0010~R\u001e\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0004\bI\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0082\u0001\u0010\u0084\u0001R\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bQ\u0010\u0085\u0001\u001a\u0005\br\u0010\u0086\u0001R\u001f\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0005\bv\u0010\u0089\u0001R\u001e\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b}\u0010\u008a\u0001\u001a\u0005\bW\u0010\u008b\u0001R\u001e\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b`\u0010\u008c\u0001\u001a\u0005\bb\u0010\u008d\u0001R\u001e\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bM\u0010\u008e\u0001\u001a\u0005\bi\u0010\u008f\u0001R\u001f\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0090\u0001\u001a\u0005\b^\u0010\u0091\u0001R\u001f\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bt\u0010\u0092\u0001\u001a\u0006\b\u0087\u0001\u0010\u0093\u0001¨\u0006\u0094\u0001"}, d2 = {"Lvc0/e3;", "Lcom/squareup/wire/f;", "", "Lvc0/f2;", "personalizationInformation", "Lvc0/f1;", "VCSEC_InformationRequest", "Lvc0/o2;", "RKEAction", "Lvc0/r;", "authenticationResponse", "Lvc0/e0;", "closureMoveRequest", "Lvc0/n3;", "VCSEC_WhitelistOperation", "Lvc0/l1;", "setMetaDataForKey", "Lvc0/b;", "deviceActivity", "Lrc0/d;", "getEpochSessionInfo", "Lvc0/k0;", "deviceMotion", "Lvc0/f;", "appDeviceInfo", "Lvc0/a1;", "getReaderKey", "Lvc0/v1;", "VCSEC_NISessionResponse", "Lvc0/z1;", "VCSEC_NISessionStopped", "Lvc0/i;", "appEventLog", "Lvc0/t2;", "serviceDiagnosticRequest", "Lvc0/r1;", "VCSEC_NIBatchResponse", "Lvc0/l2;", "provisionIdentity", "Lvc0/n0;", "firaCapabilities", "Lvc0/r0;", "firaResponse", "Lvc0/l;", "appStateEvent", "Lvc0/d0;", "changeOperationMode", "Lvc0/b0;", "cpdResponse", "Lvc0/s;", "autonomyCommand", "Lvc0/s2;", "securityControl", "Lokio/k;", "unknownFields", "<init>", "(Lvc0/f2;Lvc0/f1;Lvc0/o2;Lvc0/r;Lvc0/e0;Lvc0/n3;Lvc0/l1;Lvc0/b;Lrc0/d;Lvc0/k0;Lvc0/f;Lvc0/a1;Lvc0/v1;Lvc0/z1;Lvc0/i;Lvc0/t2;Lvc0/r1;Lvc0/l2;Lvc0/n0;Lvc0/r0;Lvc0/l;Lvc0/d0;Lvc0/b0;Lvc0/s;Lvc0/s2;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lvc0/f2;Lvc0/f1;Lvc0/o2;Lvc0/r;Lvc0/e0;Lvc0/n3;Lvc0/l1;Lvc0/b;Lrc0/d;Lvc0/k0;Lvc0/f;Lvc0/a1;Lvc0/v1;Lvc0/z1;Lvc0/i;Lvc0/t2;Lvc0/r1;Lvc0/l2;Lvc0/n0;Lvc0/r0;Lvc0/l;Lvc0/d0;Lvc0/b0;Lvc0/s;Lvc0/s2;Lokio/k;)Lvc0/e3;", "Lvc0/f2;", "q", "()Lvc0/f2;", "b", "Lvc0/f1;", "w", "()Lvc0/f1;", "c", "Lvc0/o2;", "s", "()Lvc0/o2;", DateTokenConverter.CONVERTER_KEY, "Lvc0/r;", "f", "()Lvc0/r;", "e", "Lvc0/e0;", IntegerTokenConverter.CONVERTER_KEY, "()Lvc0/e0;", "Lvc0/n3;", "A", "()Lvc0/n3;", "g", "Lvc0/l1;", "v", "()Lvc0/l1;", "h", "Lvc0/b;", "k", "()Lvc0/b;", "Lrc0/d;", "o", "()Lrc0/d;", "j", "Lvc0/k0;", "l", "()Lvc0/k0;", "Lvc0/f;", "()Lvc0/f;", "Lvc0/a1;", "p", "()Lvc0/a1;", "m", "Lvc0/v1;", "y", "()Lvc0/v1;", "n", "Lvc0/z1;", "z", "()Lvc0/z1;", "Lvc0/i;", "()Lvc0/i;", "Lvc0/t2;", "u", "()Lvc0/t2;", "Lvc0/r1;", "x", "()Lvc0/r1;", "r", "Lvc0/l2;", "()Lvc0/l2;", "Lvc0/n0;", "()Lvc0/n0;", "t", "Lvc0/r0;", "()Lvc0/r0;", "Lvc0/l;", "()Lvc0/l;", "Lvc0/d0;", "()Lvc0/d0;", "Lvc0/b0;", "()Lvc0/b0;", "Lvc0/s;", "()Lvc0/s;", "Lvc0/s2;", "()Lvc0/s2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e3 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.PersonalizationInformation#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 25)
    private final f2 personalizationInformation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.InformationRequest#ADAPTER", declaredName = "InformationRequest", tag = 1)
    private final f1 VCSEC_InformationRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.RKEAction_E#ADAPTER", tag = 2)
    private final o2 RKEAction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationResponse#ADAPTER", tag = 3)
    private final r authenticationResponse;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ClosureMoveRequest#ADAPTER", tag = 4)
    private final e0 closureMoveRequest;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.WhitelistOperation#ADAPTER", declaredName = "WhitelistOperation", tag = 16)
    private final n3 VCSEC_WhitelistOperation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.KeyMetadata#ADAPTER", tag = 22)
    private final l1 setMetaDataForKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.Activity_E#ADAPTER", tag = 35)
    private final b deviceActivity;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.signatures.GetSessionInfoRequest#ADAPTER", tag = 36)
    private final rc0.d getEpochSessionInfo;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.DeviceMotion#ADAPTER", tag = 39)
    private final k0 deviceMotion;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppDeviceInfo#ADAPTER", tag = 40)
    private final f appDeviceInfo;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.GetReaderKey#ADAPTER", tag = 41)
    private final a1 getReaderKey;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NISessionResponse#ADAPTER", declaredName = "NISessionResponse", tag = 42)
    private final v1 VCSEC_NISessionResponse;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NISessionStopped#ADAPTER", declaredName = "NISessionStopped", tag = 43)
    private final z1 VCSEC_NISessionStopped;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppEventLog#ADAPTER", tag = 54)
    private final i appEventLog;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ServiceDiagnosticRequest#ADAPTER", tag = 55)
    private final t2 serviceDiagnosticRequest;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.NIBatchResponse#ADAPTER", declaredName = "NIBatchResponse", tag = 56)
    private final r1 VCSEC_NIBatchResponse;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ProvisionIdentity#ADAPTER", tag = 57)
    private final l2 provisionIdentity;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FiraCapabilities#ADAPTER", tag = 58)
    private final n0 firaCapabilities;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.FiraResponse#ADAPTER", tag = 59)
    private final r0 firaResponse;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AppStateEvent#ADAPTER", tag = 60)
    private final l appStateEvent;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.ChangeOperationMode#ADAPTER", tag = 61)
    private final d0 changeOperationMode;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.CPDResponse#ADAPTER", tag = 62)
    private final b0 cpdResponse;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AutonomyCommand#ADAPTER", tag = 66)
    private final s autonomyCommand;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.SecurityControl#ADAPTER", tag = 71)
    private final s2 securityControl;
    public static final ProtoAdapter<e3> A = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(e3.class), com.squareup.wire.o.PROTO_3);

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/e3$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/e3;", "value", "", "c", "(Lvc0/e3;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/e3;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/e3;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/e3;)Lvc0/e3;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e3> {
        a(com.squareup.wire.b bVar, co0.d<e3> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.UnsignedMessage", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e3 decode(com.squareup.wire.k reader) {
            f1 f1Var;
            r rVar;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            f1 f1VarDecode = null;
            o2 o2VarDecode = null;
            r rVarDecode = null;
            e0 e0VarDecode = null;
            n3 n3VarDecode = null;
            l1 l1VarDecode = null;
            b bVarDecode = null;
            rc0.d dVarDecode = null;
            k0 k0VarDecode = null;
            f fVarDecode = null;
            a1 a1VarDecode = null;
            v1 v1VarDecode = null;
            z1 z1VarDecode = null;
            i iVarDecode = null;
            t2 t2VarDecode = null;
            r1 r1VarDecode = null;
            l2 l2VarDecode = null;
            n0 n0VarDecode = null;
            r0 r0VarDecode = null;
            l lVarDecode = null;
            d0 d0VarDecode = null;
            b0 b0VarDecode = null;
            s sVarDecode = null;
            s2 s2VarDecode = null;
            f2 f2VarDecode = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e3(f2VarDecode, f1VarDecode, o2VarDecode, rVarDecode, e0VarDecode, n3VarDecode, l1VarDecode, bVarDecode, dVarDecode, k0VarDecode, fVarDecode, a1VarDecode, v1VarDecode, z1VarDecode, iVarDecode, t2VarDecode, r1VarDecode, l2VarDecode, n0VarDecode, r0VarDecode, lVarDecode, d0VarDecode, b0VarDecode, sVarDecode, s2VarDecode, reader.e(jD));
                }
                if (iG != 1) {
                    if (iG == 2) {
                        f1Var = f1VarDecode;
                        rVar = rVarDecode;
                        try {
                            o2VarDecode = o2.ADAPTER.decode(reader);
                            f1VarDecode = f1Var;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            f1VarDecode = f1Var;
                            o2VarDecode = o2VarDecode;
                        }
                        rVarDecode = rVar;
                    } else if (iG == 3) {
                        rVarDecode = r.f118893e.decode(reader);
                    } else if (iG == 4) {
                        e0VarDecode = e0.f118637j.decode(reader);
                    } else if (iG == 16) {
                        n3VarDecode = n3.f118852o.decode(reader);
                    } else if (iG == 22) {
                        l1VarDecode = l1.f118815c.decode(reader);
                    } else if (iG == 25) {
                        f2VarDecode = f2.f118696c.decode(reader);
                    } else if (iG == 66) {
                        sVarDecode = s.f118905c.decode(reader);
                    } else if (iG == 71) {
                        s2VarDecode = s2.f118913c.decode(reader);
                    } else if (iG == 35) {
                        try {
                            bVarDecode = b.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            f1Var = f1VarDecode;
                            rVar = rVarDecode;
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            f1VarDecode = f1Var;
                            o2VarDecode = o2VarDecode;
                            rVarDecode = rVar;
                        }
                    } else if (iG != 36) {
                        switch (iG) {
                            case 39:
                                k0VarDecode = k0.f118791d.decode(reader);
                                continue;
                            case 40:
                                fVarDecode = f.f118679k.decode(reader);
                                continue;
                            case 41:
                                a1VarDecode = a1.f118574c.decode(reader);
                                continue;
                            case 42:
                                v1VarDecode = v1.f118951e.decode(reader);
                                continue;
                            case 43:
                                z1VarDecode = z1.f119004c.decode(reader);
                                continue;
                            default:
                                switch (iG) {
                                    case 54:
                                        iVarDecode = i.f118736f.decode(reader);
                                        continue;
                                    case 55:
                                        t2VarDecode = t2.f118923c.decode(reader);
                                        continue;
                                    case 56:
                                        r1VarDecode = r1.f118901d.decode(reader);
                                        continue;
                                    case 57:
                                        l2VarDecode = l2.f118818c.decode(reader);
                                        continue;
                                    case 58:
                                        n0VarDecode = n0.f118838i.decode(reader);
                                        continue;
                                    case 59:
                                        r0VarDecode = r0.f118898c.decode(reader);
                                        continue;
                                    case 60:
                                        lVarDecode = l.f118812c.decode(reader);
                                        continue;
                                    case 61:
                                        d0VarDecode = d0.f118622c.decode(reader);
                                        continue;
                                    case 62:
                                        b0VarDecode = b0.f118580c.decode(reader);
                                        continue;
                                    default:
                                        reader.m(iG);
                                        f1Var = f1VarDecode;
                                        rVar = rVarDecode;
                                        break;
                                }
                                break;
                        }
                    } else {
                        dVarDecode = rc0.d.f107661c.decode(reader);
                    }
                    f1VarDecode = f1Var;
                    o2VarDecode = o2VarDecode;
                    rVarDecode = rVar;
                } else {
                    f1VarDecode = f1.f118690f.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, e3 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getPersonalizationInformation() != null) {
                f2.f118696c.encodeWithTag(writer, 25, value.getPersonalizationInformation());
            }
            f1.f118690f.encodeWithTag(writer, 1, value.getVCSEC_InformationRequest());
            o2.ADAPTER.encodeWithTag(writer, 2, value.getRKEAction());
            r.f118893e.encodeWithTag(writer, 3, value.getAuthenticationResponse());
            e0.f118637j.encodeWithTag(writer, 4, value.getClosureMoveRequest());
            n3.f118852o.encodeWithTag(writer, 16, value.getVCSEC_WhitelistOperation());
            l1.f118815c.encodeWithTag(writer, 22, value.getSetMetaDataForKey());
            b.ADAPTER.encodeWithTag(writer, 35, value.getDeviceActivity());
            rc0.d.f107661c.encodeWithTag(writer, 36, value.getGetEpochSessionInfo());
            k0.f118791d.encodeWithTag(writer, 39, value.getDeviceMotion());
            f.f118679k.encodeWithTag(writer, 40, value.getAppDeviceInfo());
            a1.f118574c.encodeWithTag(writer, 41, value.getGetReaderKey());
            v1.f118951e.encodeWithTag(writer, 42, value.getVCSEC_NISessionResponse());
            z1.f119004c.encodeWithTag(writer, 43, value.getVCSEC_NISessionStopped());
            i.f118736f.encodeWithTag(writer, 54, value.getAppEventLog());
            t2.f118923c.encodeWithTag(writer, 55, value.getServiceDiagnosticRequest());
            r1.f118901d.encodeWithTag(writer, 56, value.getVCSEC_NIBatchResponse());
            l2.f118818c.encodeWithTag(writer, 57, value.getProvisionIdentity());
            n0.f118838i.encodeWithTag(writer, 58, value.getFiraCapabilities());
            r0.f118898c.encodeWithTag(writer, 59, value.getFiraResponse());
            l.f118812c.encodeWithTag(writer, 60, value.getAppStateEvent());
            d0.f118622c.encodeWithTag(writer, 61, value.getChangeOperationMode());
            b0.f118580c.encodeWithTag(writer, 62, value.getCpdResponse());
            s.f118905c.encodeWithTag(writer, 66, value.getAutonomyCommand());
            s2.f118913c.encodeWithTag(writer, 71, value.getSecurityControl());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getPersonalizationInformation() != null) {
                iD += f2.f118696c.encodedSizeWithTag(25, value.getPersonalizationInformation());
            }
            return iD + f1.f118690f.encodedSizeWithTag(1, value.getVCSEC_InformationRequest()) + o2.ADAPTER.encodedSizeWithTag(2, value.getRKEAction()) + r.f118893e.encodedSizeWithTag(3, value.getAuthenticationResponse()) + e0.f118637j.encodedSizeWithTag(4, value.getClosureMoveRequest()) + n3.f118852o.encodedSizeWithTag(16, value.getVCSEC_WhitelistOperation()) + l1.f118815c.encodedSizeWithTag(22, value.getSetMetaDataForKey()) + b.ADAPTER.encodedSizeWithTag(35, value.getDeviceActivity()) + rc0.d.f107661c.encodedSizeWithTag(36, value.getGetEpochSessionInfo()) + k0.f118791d.encodedSizeWithTag(39, value.getDeviceMotion()) + f.f118679k.encodedSizeWithTag(40, value.getAppDeviceInfo()) + a1.f118574c.encodedSizeWithTag(41, value.getGetReaderKey()) + v1.f118951e.encodedSizeWithTag(42, value.getVCSEC_NISessionResponse()) + z1.f119004c.encodedSizeWithTag(43, value.getVCSEC_NISessionStopped()) + i.f118736f.encodedSizeWithTag(54, value.getAppEventLog()) + t2.f118923c.encodedSizeWithTag(55, value.getServiceDiagnosticRequest()) + r1.f118901d.encodedSizeWithTag(56, value.getVCSEC_NIBatchResponse()) + l2.f118818c.encodedSizeWithTag(57, value.getProvisionIdentity()) + n0.f118838i.encodedSizeWithTag(58, value.getFiraCapabilities()) + r0.f118898c.encodedSizeWithTag(59, value.getFiraResponse()) + l.f118812c.encodedSizeWithTag(60, value.getAppStateEvent()) + d0.f118622c.encodedSizeWithTag(61, value.getChangeOperationMode()) + b0.f118580c.encodedSizeWithTag(62, value.getCpdResponse()) + s.f118905c.encodedSizeWithTag(66, value.getAutonomyCommand()) + s2.f118913c.encodedSizeWithTag(71, value.getSecurityControl());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public e3 redact(e3 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            f2 personalizationInformation = value.getPersonalizationInformation();
            f2 f2VarRedact = personalizationInformation != null ? f2.f118696c.redact(personalizationInformation) : null;
            f1 vCSEC_InformationRequest = value.getVCSEC_InformationRequest();
            f1 f1VarRedact = vCSEC_InformationRequest != null ? f1.f118690f.redact(vCSEC_InformationRequest) : null;
            r authenticationResponse = value.getAuthenticationResponse();
            r rVarRedact = authenticationResponse != null ? r.f118893e.redact(authenticationResponse) : null;
            e0 closureMoveRequest = value.getClosureMoveRequest();
            e0 e0VarRedact = closureMoveRequest != null ? e0.f118637j.redact(closureMoveRequest) : null;
            n3 vCSEC_WhitelistOperation = value.getVCSEC_WhitelistOperation();
            n3 n3VarRedact = vCSEC_WhitelistOperation != null ? n3.f118852o.redact(vCSEC_WhitelistOperation) : null;
            l1 setMetaDataForKey = value.getSetMetaDataForKey();
            l1 l1VarRedact = setMetaDataForKey != null ? l1.f118815c.redact(setMetaDataForKey) : null;
            rc0.d getEpochSessionInfo = value.getGetEpochSessionInfo();
            rc0.d dVarRedact = getEpochSessionInfo != null ? rc0.d.f107661c.redact(getEpochSessionInfo) : null;
            k0 deviceMotion = value.getDeviceMotion();
            k0 k0VarRedact = deviceMotion != null ? k0.f118791d.redact(deviceMotion) : null;
            f appDeviceInfo = value.getAppDeviceInfo();
            f fVarRedact = appDeviceInfo != null ? f.f118679k.redact(appDeviceInfo) : null;
            a1 getReaderKey = value.getGetReaderKey();
            a1 a1VarRedact = getReaderKey != null ? a1.f118574c.redact(getReaderKey) : null;
            v1 vCSEC_NISessionResponse = value.getVCSEC_NISessionResponse();
            v1 v1VarRedact = vCSEC_NISessionResponse != null ? v1.f118951e.redact(vCSEC_NISessionResponse) : null;
            z1 vCSEC_NISessionStopped = value.getVCSEC_NISessionStopped();
            z1 z1VarRedact = vCSEC_NISessionStopped != null ? z1.f119004c.redact(vCSEC_NISessionStopped) : null;
            i appEventLog = value.getAppEventLog();
            i iVarRedact = appEventLog != null ? i.f118736f.redact(appEventLog) : null;
            t2 serviceDiagnosticRequest = value.getServiceDiagnosticRequest();
            t2 t2VarRedact = serviceDiagnosticRequest != null ? t2.f118923c.redact(serviceDiagnosticRequest) : null;
            r1 vCSEC_NIBatchResponse = value.getVCSEC_NIBatchResponse();
            r1 r1VarRedact = vCSEC_NIBatchResponse != null ? r1.f118901d.redact(vCSEC_NIBatchResponse) : null;
            l2 provisionIdentity = value.getProvisionIdentity();
            l2 l2VarRedact = provisionIdentity != null ? l2.f118818c.redact(provisionIdentity) : null;
            n0 firaCapabilities = value.getFiraCapabilities();
            n0 n0VarRedact = firaCapabilities != null ? n0.f118838i.redact(firaCapabilities) : null;
            r0 firaResponse = value.getFiraResponse();
            r0 r0VarRedact = firaResponse != null ? r0.f118898c.redact(firaResponse) : null;
            l appStateEvent = value.getAppStateEvent();
            l lVarRedact = appStateEvent != null ? l.f118812c.redact(appStateEvent) : null;
            d0 changeOperationMode = value.getChangeOperationMode();
            d0 d0VarRedact = changeOperationMode != null ? d0.f118622c.redact(changeOperationMode) : null;
            b0 cpdResponse = value.getCpdResponse();
            b0 b0VarRedact = cpdResponse != null ? b0.f118580c.redact(cpdResponse) : null;
            s autonomyCommand = value.getAutonomyCommand();
            s sVarRedact = autonomyCommand != null ? s.f118905c.redact(autonomyCommand) : null;
            s2 securityControl = value.getSecurityControl();
            return e3.b(value, f2VarRedact, f1VarRedact, null, rVarRedact, e0VarRedact, n3VarRedact, l1VarRedact, null, dVarRedact, k0VarRedact, fVarRedact, a1VarRedact, v1VarRedact, z1VarRedact, iVarRedact, t2VarRedact, r1VarRedact, l2VarRedact, n0VarRedact, r0VarRedact, lVarRedact, d0VarRedact, b0VarRedact, sVarRedact, securityControl != null ? s2.f118913c.redact(securityControl) : null, okio.k.f97943e, 132, null);
        }
    }

    public e3() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108863, null);
    }

    public static /* synthetic */ e3 b(e3 e3Var, f2 f2Var, f1 f1Var, o2 o2Var, r rVar, e0 e0Var, n3 n3Var, l1 l1Var, b bVar, rc0.d dVar, k0 k0Var, f fVar, a1 a1Var, v1 v1Var, z1 z1Var, i iVar, t2 t2Var, r1 r1Var, l2 l2Var, n0 n0Var, r0 r0Var, l lVar, d0 d0Var, b0 b0Var, s sVar, s2 s2Var, okio.k kVar, int i11, Object obj) {
        return e3Var.a((i11 & 1) != 0 ? e3Var.personalizationInformation : f2Var, (i11 & 2) != 0 ? e3Var.VCSEC_InformationRequest : f1Var, (i11 & 4) != 0 ? e3Var.RKEAction : o2Var, (i11 & 8) != 0 ? e3Var.authenticationResponse : rVar, (i11 & 16) != 0 ? e3Var.closureMoveRequest : e0Var, (i11 & 32) != 0 ? e3Var.VCSEC_WhitelistOperation : n3Var, (i11 & 64) != 0 ? e3Var.setMetaDataForKey : l1Var, (i11 & 128) != 0 ? e3Var.deviceActivity : bVar, (i11 & 256) != 0 ? e3Var.getEpochSessionInfo : dVar, (i11 & 512) != 0 ? e3Var.deviceMotion : k0Var, (i11 & 1024) != 0 ? e3Var.appDeviceInfo : fVar, (i11 & 2048) != 0 ? e3Var.getReaderKey : a1Var, (i11 & 4096) != 0 ? e3Var.VCSEC_NISessionResponse : v1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? e3Var.VCSEC_NISessionStopped : z1Var, (i11 & 16384) != 0 ? e3Var.appEventLog : iVar, (i11 & 32768) != 0 ? e3Var.serviceDiagnosticRequest : t2Var, (i11 & 65536) != 0 ? e3Var.VCSEC_NIBatchResponse : r1Var, (i11 & 131072) != 0 ? e3Var.provisionIdentity : l2Var, (i11 & 262144) != 0 ? e3Var.firaCapabilities : n0Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? e3Var.firaResponse : r0Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? e3Var.appStateEvent : lVar, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? e3Var.changeOperationMode : d0Var, (i11 & 4194304) != 0 ? e3Var.cpdResponse : b0Var, (i11 & 8388608) != 0 ? e3Var.autonomyCommand : sVar, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? e3Var.securityControl : s2Var, (i11 & 33554432) != 0 ? e3Var.unknownFields() : kVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final n3 getVCSEC_WhitelistOperation() {
        return this.VCSEC_WhitelistOperation;
    }

    public final e3 a(f2 personalizationInformation, f1 VCSEC_InformationRequest, o2 RKEAction, r authenticationResponse, e0 closureMoveRequest, n3 VCSEC_WhitelistOperation, l1 setMetaDataForKey, b deviceActivity, rc0.d getEpochSessionInfo, k0 deviceMotion, f appDeviceInfo, a1 getReaderKey, v1 VCSEC_NISessionResponse, z1 VCSEC_NISessionStopped, i appEventLog, t2 serviceDiagnosticRequest, r1 VCSEC_NIBatchResponse, l2 provisionIdentity, n0 firaCapabilities, r0 firaResponse, l appStateEvent, d0 changeOperationMode, b0 cpdResponse, s autonomyCommand, s2 securityControl, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new e3(personalizationInformation, VCSEC_InformationRequest, RKEAction, authenticationResponse, closureMoveRequest, VCSEC_WhitelistOperation, setMetaDataForKey, deviceActivity, getEpochSessionInfo, deviceMotion, appDeviceInfo, getReaderKey, VCSEC_NISessionResponse, VCSEC_NISessionStopped, appEventLog, serviceDiagnosticRequest, VCSEC_NIBatchResponse, provisionIdentity, firaCapabilities, firaResponse, appStateEvent, changeOperationMode, cpdResponse, autonomyCommand, securityControl, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getAppDeviceInfo() {
        return this.appDeviceInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getAppEventLog() {
        return this.appEventLog;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l getAppStateEvent() {
        return this.appStateEvent;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), e3Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.personalizationInformation, e3Var.personalizationInformation) && p013kotlin.jvm.internal.s.f(this.VCSEC_InformationRequest, e3Var.VCSEC_InformationRequest) && this.RKEAction == e3Var.RKEAction && p013kotlin.jvm.internal.s.f(this.authenticationResponse, e3Var.authenticationResponse) && p013kotlin.jvm.internal.s.f(this.closureMoveRequest, e3Var.closureMoveRequest) && p013kotlin.jvm.internal.s.f(this.VCSEC_WhitelistOperation, e3Var.VCSEC_WhitelistOperation) && p013kotlin.jvm.internal.s.f(this.setMetaDataForKey, e3Var.setMetaDataForKey) && this.deviceActivity == e3Var.deviceActivity && p013kotlin.jvm.internal.s.f(this.getEpochSessionInfo, e3Var.getEpochSessionInfo) && p013kotlin.jvm.internal.s.f(this.deviceMotion, e3Var.deviceMotion) && p013kotlin.jvm.internal.s.f(this.appDeviceInfo, e3Var.appDeviceInfo) && p013kotlin.jvm.internal.s.f(this.getReaderKey, e3Var.getReaderKey) && p013kotlin.jvm.internal.s.f(this.VCSEC_NISessionResponse, e3Var.VCSEC_NISessionResponse) && p013kotlin.jvm.internal.s.f(this.VCSEC_NISessionStopped, e3Var.VCSEC_NISessionStopped) && p013kotlin.jvm.internal.s.f(this.appEventLog, e3Var.appEventLog) && p013kotlin.jvm.internal.s.f(this.serviceDiagnosticRequest, e3Var.serviceDiagnosticRequest) && p013kotlin.jvm.internal.s.f(this.VCSEC_NIBatchResponse, e3Var.VCSEC_NIBatchResponse) && p013kotlin.jvm.internal.s.f(this.provisionIdentity, e3Var.provisionIdentity) && p013kotlin.jvm.internal.s.f(this.firaCapabilities, e3Var.firaCapabilities) && p013kotlin.jvm.internal.s.f(this.firaResponse, e3Var.firaResponse) && p013kotlin.jvm.internal.s.f(this.appStateEvent, e3Var.appStateEvent) && p013kotlin.jvm.internal.s.f(this.changeOperationMode, e3Var.changeOperationMode) && p013kotlin.jvm.internal.s.f(this.cpdResponse, e3Var.cpdResponse) && p013kotlin.jvm.internal.s.f(this.autonomyCommand, e3Var.autonomyCommand) && p013kotlin.jvm.internal.s.f(this.securityControl, e3Var.securityControl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final r getAuthenticationResponse() {
        return this.authenticationResponse;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final s getAutonomyCommand() {
        return this.autonomyCommand;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final d0 getChangeOperationMode() {
        return this.changeOperationMode;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        f2 f2Var = this.personalizationInformation;
        int iHashCode2 = (iHashCode + (f2Var != null ? f2Var.hashCode() : 0)) * 37;
        f1 f1Var = this.VCSEC_InformationRequest;
        int iHashCode3 = (iHashCode2 + (f1Var != null ? f1Var.hashCode() : 0)) * 37;
        o2 o2Var = this.RKEAction;
        int iHashCode4 = (iHashCode3 + (o2Var != null ? o2Var.hashCode() : 0)) * 37;
        r rVar = this.authenticationResponse;
        int iHashCode5 = (iHashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 37;
        e0 e0Var = this.closureMoveRequest;
        int iHashCode6 = (iHashCode5 + (e0Var != null ? e0Var.hashCode() : 0)) * 37;
        n3 n3Var = this.VCSEC_WhitelistOperation;
        int iHashCode7 = (iHashCode6 + (n3Var != null ? n3Var.hashCode() : 0)) * 37;
        l1 l1Var = this.setMetaDataForKey;
        int iHashCode8 = (iHashCode7 + (l1Var != null ? l1Var.hashCode() : 0)) * 37;
        b bVar = this.deviceActivity;
        int iHashCode9 = (iHashCode8 + (bVar != null ? bVar.hashCode() : 0)) * 37;
        rc0.d dVar = this.getEpochSessionInfo;
        int iHashCode10 = (iHashCode9 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        k0 k0Var = this.deviceMotion;
        int iHashCode11 = (iHashCode10 + (k0Var != null ? k0Var.hashCode() : 0)) * 37;
        f fVar = this.appDeviceInfo;
        int iHashCode12 = (iHashCode11 + (fVar != null ? fVar.hashCode() : 0)) * 37;
        a1 a1Var = this.getReaderKey;
        int iHashCode13 = (iHashCode12 + (a1Var != null ? a1Var.hashCode() : 0)) * 37;
        v1 v1Var = this.VCSEC_NISessionResponse;
        int iHashCode14 = (iHashCode13 + (v1Var != null ? v1Var.hashCode() : 0)) * 37;
        z1 z1Var = this.VCSEC_NISessionStopped;
        int iHashCode15 = (iHashCode14 + (z1Var != null ? z1Var.hashCode() : 0)) * 37;
        i iVar = this.appEventLog;
        int iHashCode16 = (iHashCode15 + (iVar != null ? iVar.hashCode() : 0)) * 37;
        t2 t2Var = this.serviceDiagnosticRequest;
        int iHashCode17 = (iHashCode16 + (t2Var != null ? t2Var.hashCode() : 0)) * 37;
        r1 r1Var = this.VCSEC_NIBatchResponse;
        int iHashCode18 = (iHashCode17 + (r1Var != null ? r1Var.hashCode() : 0)) * 37;
        l2 l2Var = this.provisionIdentity;
        int iHashCode19 = (iHashCode18 + (l2Var != null ? l2Var.hashCode() : 0)) * 37;
        n0 n0Var = this.firaCapabilities;
        int iHashCode20 = (iHashCode19 + (n0Var != null ? n0Var.hashCode() : 0)) * 37;
        r0 r0Var = this.firaResponse;
        int iHashCode21 = (iHashCode20 + (r0Var != null ? r0Var.hashCode() : 0)) * 37;
        l lVar = this.appStateEvent;
        int iHashCode22 = (iHashCode21 + (lVar != null ? lVar.hashCode() : 0)) * 37;
        d0 d0Var = this.changeOperationMode;
        int iHashCode23 = (iHashCode22 + (d0Var != null ? d0Var.hashCode() : 0)) * 37;
        b0 b0Var = this.cpdResponse;
        int iHashCode24 = (iHashCode23 + (b0Var != null ? b0Var.hashCode() : 0)) * 37;
        s sVar = this.autonomyCommand;
        int iHashCode25 = (iHashCode24 + (sVar != null ? sVar.hashCode() : 0)) * 37;
        s2 s2Var = this.securityControl;
        int iHashCode26 = iHashCode25 + (s2Var != null ? s2Var.hashCode() : 0);
        this.hashCode = iHashCode26;
        return iHashCode26;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final e0 getClosureMoveRequest() {
        return this.closureMoveRequest;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b0 getCpdResponse() {
        return this.cpdResponse;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b getDeviceActivity() {
        return this.deviceActivity;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final k0 getDeviceMotion() {
        return this.deviceMotion;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final n0 getFiraCapabilities() {
        return this.firaCapabilities;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final r0 getFiraResponse() {
        return this.firaResponse;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m797newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final rc0.d getGetEpochSessionInfo() {
        return this.getEpochSessionInfo;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final a1 getGetReaderKey() {
        return this.getReaderKey;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final f2 getPersonalizationInformation() {
        return this.personalizationInformation;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final l2 getProvisionIdentity() {
        return this.provisionIdentity;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final o2 getRKEAction() {
        return this.RKEAction;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final s2 getSecurityControl() {
        return this.securityControl;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        f2 f2Var = this.personalizationInformation;
        if (f2Var != null) {
            arrayList.add("personalizationInformation=" + f2Var);
        }
        f1 f1Var = this.VCSEC_InformationRequest;
        if (f1Var != null) {
            arrayList.add("VCSEC_InformationRequest=" + f1Var);
        }
        o2 o2Var = this.RKEAction;
        if (o2Var != null) {
            arrayList.add("RKEAction=" + o2Var);
        }
        r rVar = this.authenticationResponse;
        if (rVar != null) {
            arrayList.add("authenticationResponse=" + rVar);
        }
        e0 e0Var = this.closureMoveRequest;
        if (e0Var != null) {
            arrayList.add("closureMoveRequest=" + e0Var);
        }
        n3 n3Var = this.VCSEC_WhitelistOperation;
        if (n3Var != null) {
            arrayList.add("VCSEC_WhitelistOperation=" + n3Var);
        }
        l1 l1Var = this.setMetaDataForKey;
        if (l1Var != null) {
            arrayList.add("setMetaDataForKey=" + l1Var);
        }
        b bVar = this.deviceActivity;
        if (bVar != null) {
            arrayList.add("deviceActivity=" + bVar);
        }
        rc0.d dVar = this.getEpochSessionInfo;
        if (dVar != null) {
            arrayList.add("getEpochSessionInfo=" + dVar);
        }
        k0 k0Var = this.deviceMotion;
        if (k0Var != null) {
            arrayList.add("deviceMotion=" + k0Var);
        }
        f fVar = this.appDeviceInfo;
        if (fVar != null) {
            arrayList.add("appDeviceInfo=" + fVar);
        }
        a1 a1Var = this.getReaderKey;
        if (a1Var != null) {
            arrayList.add("getReaderKey=" + a1Var);
        }
        v1 v1Var = this.VCSEC_NISessionResponse;
        if (v1Var != null) {
            arrayList.add("VCSEC_NISessionResponse=" + v1Var);
        }
        z1 z1Var = this.VCSEC_NISessionStopped;
        if (z1Var != null) {
            arrayList.add("VCSEC_NISessionStopped=" + z1Var);
        }
        i iVar = this.appEventLog;
        if (iVar != null) {
            arrayList.add("appEventLog=" + iVar);
        }
        t2 t2Var = this.serviceDiagnosticRequest;
        if (t2Var != null) {
            arrayList.add("serviceDiagnosticRequest=" + t2Var);
        }
        r1 r1Var = this.VCSEC_NIBatchResponse;
        if (r1Var != null) {
            arrayList.add("VCSEC_NIBatchResponse=" + r1Var);
        }
        l2 l2Var = this.provisionIdentity;
        if (l2Var != null) {
            arrayList.add("provisionIdentity=" + l2Var);
        }
        n0 n0Var = this.firaCapabilities;
        if (n0Var != null) {
            arrayList.add("firaCapabilities=" + n0Var);
        }
        r0 r0Var = this.firaResponse;
        if (r0Var != null) {
            arrayList.add("firaResponse=" + r0Var);
        }
        l lVar = this.appStateEvent;
        if (lVar != null) {
            arrayList.add("appStateEvent=" + lVar);
        }
        d0 d0Var = this.changeOperationMode;
        if (d0Var != null) {
            arrayList.add("changeOperationMode=" + d0Var);
        }
        b0 b0Var = this.cpdResponse;
        if (b0Var != null) {
            arrayList.add("cpdResponse=" + b0Var);
        }
        s sVar = this.autonomyCommand;
        if (sVar != null) {
            arrayList.add("autonomyCommand=" + sVar);
        }
        s2 s2Var = this.securityControl;
        if (s2Var != null) {
            arrayList.add("securityControl=" + s2Var);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "UnsignedMessage{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final t2 getServiceDiagnosticRequest() {
        return this.serviceDiagnosticRequest;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final l1 getSetMetaDataForKey() {
        return this.setMetaDataForKey;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final f1 getVCSEC_InformationRequest() {
        return this.VCSEC_InformationRequest;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final r1 getVCSEC_NIBatchResponse() {
        return this.VCSEC_NIBatchResponse;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final v1 getVCSEC_NISessionResponse() {
        return this.VCSEC_NISessionResponse;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final z1 getVCSEC_NISessionStopped() {
        return this.VCSEC_NISessionStopped;
    }

    public /* synthetic */ e3(f2 f2Var, f1 f1Var, o2 o2Var, r rVar, e0 e0Var, n3 n3Var, l1 l1Var, b bVar, rc0.d dVar, k0 k0Var, f fVar, a1 a1Var, v1 v1Var, z1 z1Var, i iVar, t2 t2Var, r1 r1Var, l2 l2Var, n0 n0Var, r0 r0Var, l lVar, d0 d0Var, b0 b0Var, s sVar, s2 s2Var, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : f2Var, (i11 & 2) != 0 ? null : f1Var, (i11 & 4) != 0 ? null : o2Var, (i11 & 8) != 0 ? null : rVar, (i11 & 16) != 0 ? null : e0Var, (i11 & 32) != 0 ? null : n3Var, (i11 & 64) != 0 ? null : l1Var, (i11 & 128) != 0 ? null : bVar, (i11 & 256) != 0 ? null : dVar, (i11 & 512) != 0 ? null : k0Var, (i11 & 1024) != 0 ? null : fVar, (i11 & 2048) != 0 ? null : a1Var, (i11 & 4096) != 0 ? null : v1Var, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : z1Var, (i11 & 16384) != 0 ? null : iVar, (i11 & 32768) != 0 ? null : t2Var, (i11 & 65536) != 0 ? null : r1Var, (i11 & 131072) != 0 ? null : l2Var, (i11 & 262144) != 0 ? null : n0Var, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : r0Var, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : lVar, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : d0Var, (i11 & 4194304) != 0 ? null : b0Var, (i11 & 8388608) != 0 ? null : sVar, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : s2Var, (i11 & 33554432) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m797newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(f2 f2Var, f1 f1Var, o2 o2Var, r rVar, e0 e0Var, n3 n3Var, l1 l1Var, b bVar, rc0.d dVar, k0 k0Var, f fVar, a1 a1Var, v1 v1Var, z1 z1Var, i iVar, t2 t2Var, r1 r1Var, l2 l2Var, n0 n0Var, r0 r0Var, l lVar, d0 d0Var, b0 b0Var, s sVar, s2 s2Var, okio.k unknownFields) {
        super(A, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.personalizationInformation = f2Var;
        this.VCSEC_InformationRequest = f1Var;
        this.RKEAction = o2Var;
        this.authenticationResponse = rVar;
        this.closureMoveRequest = e0Var;
        this.VCSEC_WhitelistOperation = n3Var;
        this.setMetaDataForKey = l1Var;
        this.deviceActivity = bVar;
        this.getEpochSessionInfo = dVar;
        this.deviceMotion = k0Var;
        this.appDeviceInfo = fVar;
        this.getReaderKey = a1Var;
        this.VCSEC_NISessionResponse = v1Var;
        this.VCSEC_NISessionStopped = z1Var;
        this.appEventLog = iVar;
        this.serviceDiagnosticRequest = t2Var;
        this.VCSEC_NIBatchResponse = r1Var;
        this.provisionIdentity = l2Var;
        this.firaCapabilities = n0Var;
        this.firaResponse = r0Var;
        this.appStateEvent = lVar;
        this.changeOperationMode = d0Var;
        this.cpdResponse = b0Var;
        this.autonomyCommand = sVar;
        this.securityControl = s2Var;
        if (x20.d.e(f1Var, o2Var, rVar, e0Var, n3Var, l1Var, bVar, dVar, k0Var, fVar, a1Var, v1Var, z1Var, iVar, t2Var, r1Var, l2Var, n0Var, r0Var, lVar, d0Var, b0Var, sVar, s2Var) > 1) {
            throw new IllegalArgumentException("At most one of VCSEC_InformationRequest, RKEAction, authenticationResponse, closureMoveRequest, VCSEC_WhitelistOperation, setMetaDataForKey, deviceActivity, getEpochSessionInfo, deviceMotion, appDeviceInfo, getReaderKey, VCSEC_NISessionResponse, VCSEC_NISessionStopped, appEventLog, serviceDiagnosticRequest, VCSEC_NIBatchResponse, provisionIdentity, firaCapabilities, firaResponse, appStateEvent, changeOperationMode, cpdResponse, autonomyCommand, securityControl may be non-null");
        }
    }
}
