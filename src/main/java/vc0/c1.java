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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b$\u0018\u0000 K2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u008b\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0017¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0091\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u0010*R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b7\u00108R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010*R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u0010*R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u0010*R\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b@\u0010*R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\bB\u0010*R\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00100\u001a\u0004\bD\u0010*R\u001a\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u00100\u001a\u0004\bF\u0010*R\u001a\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u0010*R\u001a\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00100\u001a\u0004\bJ\u0010*R\u001a\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b=\u00108R\u001a\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\bG\u00108R\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00106\u001a\u0004\b9\u00108R\u001a\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\b;\u00108R\u001a\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\bC\u00108R\u001a\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bA\u00108R\u001a\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00106\u001a\u0004\bE\u00108R\u001a\u0010\u0019\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u00106\u001a\u0004\bI\u00108R\u001a\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00106\u001a\u0004\b?\u00108R\u001a\u0010\u001b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\bK\u00108R\u001a\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u00106\u001a\u0004\bL\u00108R\u001a\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bM\u00108R\u001a\u0010\u001e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u00106\u001a\u0004\bN\u00108¨\u0006O"}, d2 = {"Lvc0/c1;", "Lcom/squareup/wire/f;", "", "", "keyChannel", "Lvc0/m;", "authenticationLevel", "", "present", "RSSILeft", "RSSIRight", "RSSIRear", "RSSICenter", "RSSIFront", "RSSISecondary", "RSSINFCCradle", "RSSIRearLeft", "RSSIRearRight", "highThreshLeftPresent", "highThreshRightPresent", "highThreshCenterPresent", "highThreshFrontPresent", "highThreshRearPresent", "highThreshRearLeftPresent", "highThreshRearRightPresent", "highThreshSecondaryPresent", "highThreshNFCPresent", "sortedDeltaBayesLeftPresent", "sortedDeltaBayesRightPresent", "rawDeltaBayesLeftPresent", "rawDeltaBayesRightPresent", "Lokio/k;", "unknownFields", "<init>", "(ILvc0/m;ZIIIIIIIIIZZZZZZZZZZZZZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ILvc0/m;ZIIIIIIIIIZZZZZZZZZZZZZLokio/k;)Lvc0/c1;", "I", "m", "b", "Lvc0/m;", "c", "()Lvc0/m;", "Z", "n", "()Z", DateTokenConverter.CONVERTER_KEY, "q", "e", "v", "f", "s", "g", "o", "h", "p", IntegerTokenConverter.CONVERTER_KEY, "w", "j", "r", "k", "t", "l", "u", "z", "A", "x", "y", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int keyChannel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.vcsec.AuthenticationLevel_E#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final m authenticationLevel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final boolean present;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int RSSILeft;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int RSSIRight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int RSSIRear;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final int RSSICenter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final int RSSIFront;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final int RSSISecondary;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final int RSSINFCCradle;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final int RSSIRearLeft;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final int RSSIRearRight;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final boolean highThreshLeftPresent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final boolean highThreshRightPresent;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final boolean highThreshCenterPresent;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 16)
    private final boolean highThreshFrontPresent;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 17)
    private final boolean highThreshRearPresent;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 18)
    private final boolean highThreshRearLeftPresent;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final boolean highThreshRearRightPresent;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 20)
    private final boolean highThreshSecondaryPresent;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 21)
    private final boolean highThreshNFCPresent;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 22)
    private final boolean sortedDeltaBayesLeftPresent;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 23)
    private final boolean sortedDeltaBayesRightPresent;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 24)
    private final boolean rawDeltaBayesLeftPresent;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 25)
    private final boolean rawDeltaBayesRightPresent;
    public static final ProtoAdapter<c1> A = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c1.class), com.squareup.wire.o.PROTO_3);

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/c1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/c1;", "value", "", "c", "(Lvc0/c1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/c1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/c1;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/c1;)Lvc0/c1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<c1> {
        a(com.squareup.wire.b bVar, co0.d<c1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.HandlePulledWithoutAuthDeviceSpecificPayload", oVar, (Object) null);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:43:0x0049 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:44:0x0058 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:0x0067 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:46:0x0076 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:0x0085 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x0094 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:0x00a3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x00c2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:52:0x00d2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x00e2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:54:0x00f2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:55:0x0102 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:56:0x0112 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0122 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x0132 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x0141 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x0150 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x015f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x016e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x017d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x018c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x019b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x01c9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x0040 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:6:0x003d  */
        /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003d. Please report as an issue. */
        /* JADX WARN: Switch 'out' block B:4:0x0036 for B:6:0x003d already processed. Defaulting to fallback option. */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:60:0x0150
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public vc0.c1 decode(com.squareup.wire.k r34) {
            /*
                Method dump skipped, instruction units count: 550
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vc0.c1.a.decode(com.squareup.wire.k):vc0.c1");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, c1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getKeyChannel() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getKeyChannel()));
            }
            if (value.getAuthenticationLevel() != m.AUTHENTICATION_LEVEL_NONE) {
                m.ADAPTER.encodeWithTag(writer, 2, value.getAuthenticationLevel());
            }
            if (value.getPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getPresent()));
            }
            if (value.getRSSILeft() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getRSSILeft()));
            }
            if (value.getRSSIRight() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getRSSIRight()));
            }
            if (value.getRSSIRear() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getRSSIRear()));
            }
            if (value.getRSSICenter() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 7, Integer.valueOf(value.getRSSICenter()));
            }
            if (value.getRSSIFront() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 8, Integer.valueOf(value.getRSSIFront()));
            }
            if (value.getRSSISecondary() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 9, Integer.valueOf(value.getRSSISecondary()));
            }
            if (value.getRSSINFCCradle() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 10, Integer.valueOf(value.getRSSINFCCradle()));
            }
            if (value.getRSSIRearLeft() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 11, Integer.valueOf(value.getRSSIRearLeft()));
            }
            if (value.getRSSIRearRight() != 0) {
                ProtoAdapter.SINT32.encodeWithTag(writer, 12, Integer.valueOf(value.getRSSIRearRight()));
            }
            if (value.getHighThreshLeftPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 13, Boolean.valueOf(value.getHighThreshLeftPresent()));
            }
            if (value.getHighThreshRightPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 14, Boolean.valueOf(value.getHighThreshRightPresent()));
            }
            if (value.getHighThreshCenterPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 15, Boolean.valueOf(value.getHighThreshCenterPresent()));
            }
            if (value.getHighThreshFrontPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 16, Boolean.valueOf(value.getHighThreshFrontPresent()));
            }
            if (value.getHighThreshRearPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 17, Boolean.valueOf(value.getHighThreshRearPresent()));
            }
            if (value.getHighThreshRearLeftPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 18, Boolean.valueOf(value.getHighThreshRearLeftPresent()));
            }
            if (value.getHighThreshRearRightPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 19, Boolean.valueOf(value.getHighThreshRearRightPresent()));
            }
            if (value.getHighThreshSecondaryPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 20, Boolean.valueOf(value.getHighThreshSecondaryPresent()));
            }
            if (value.getHighThreshNFCPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 21, Boolean.valueOf(value.getHighThreshNFCPresent()));
            }
            if (value.getSortedDeltaBayesLeftPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 22, Boolean.valueOf(value.getSortedDeltaBayesLeftPresent()));
            }
            if (value.getSortedDeltaBayesRightPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 23, Boolean.valueOf(value.getSortedDeltaBayesRightPresent()));
            }
            if (value.getRawDeltaBayesLeftPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 24, Boolean.valueOf(value.getRawDeltaBayesLeftPresent()));
            }
            if (value.getRawDeltaBayesRightPresent()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 25, Boolean.valueOf(value.getRawDeltaBayesRightPresent()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(c1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getKeyChannel() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getKeyChannel()));
            }
            if (value.getAuthenticationLevel() != m.AUTHENTICATION_LEVEL_NONE) {
                iD += m.ADAPTER.encodedSizeWithTag(2, value.getAuthenticationLevel());
            }
            if (value.getPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getPresent()));
            }
            if (value.getRSSILeft() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(4, Integer.valueOf(value.getRSSILeft()));
            }
            if (value.getRSSIRight() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(5, Integer.valueOf(value.getRSSIRight()));
            }
            if (value.getRSSIRear() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(6, Integer.valueOf(value.getRSSIRear()));
            }
            if (value.getRSSICenter() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(7, Integer.valueOf(value.getRSSICenter()));
            }
            if (value.getRSSIFront() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(8, Integer.valueOf(value.getRSSIFront()));
            }
            if (value.getRSSISecondary() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(9, Integer.valueOf(value.getRSSISecondary()));
            }
            if (value.getRSSINFCCradle() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(10, Integer.valueOf(value.getRSSINFCCradle()));
            }
            if (value.getRSSIRearLeft() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(11, Integer.valueOf(value.getRSSIRearLeft()));
            }
            if (value.getRSSIRearRight() != 0) {
                iD += ProtoAdapter.SINT32.encodedSizeWithTag(12, Integer.valueOf(value.getRSSIRearRight()));
            }
            if (value.getHighThreshLeftPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.getHighThreshLeftPresent()));
            }
            if (value.getHighThreshRightPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(14, Boolean.valueOf(value.getHighThreshRightPresent()));
            }
            if (value.getHighThreshCenterPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(15, Boolean.valueOf(value.getHighThreshCenterPresent()));
            }
            if (value.getHighThreshFrontPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(16, Boolean.valueOf(value.getHighThreshFrontPresent()));
            }
            if (value.getHighThreshRearPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(17, Boolean.valueOf(value.getHighThreshRearPresent()));
            }
            if (value.getHighThreshRearLeftPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(18, Boolean.valueOf(value.getHighThreshRearLeftPresent()));
            }
            if (value.getHighThreshRearRightPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(19, Boolean.valueOf(value.getHighThreshRearRightPresent()));
            }
            if (value.getHighThreshSecondaryPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(20, Boolean.valueOf(value.getHighThreshSecondaryPresent()));
            }
            if (value.getHighThreshNFCPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(21, Boolean.valueOf(value.getHighThreshNFCPresent()));
            }
            if (value.getSortedDeltaBayesLeftPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(22, Boolean.valueOf(value.getSortedDeltaBayesLeftPresent()));
            }
            if (value.getSortedDeltaBayesRightPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(23, Boolean.valueOf(value.getSortedDeltaBayesRightPresent()));
            }
            if (value.getRawDeltaBayesLeftPresent()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(24, Boolean.valueOf(value.getRawDeltaBayesLeftPresent()));
            }
            return value.getRawDeltaBayesRightPresent() ? iD + ProtoAdapter.BOOL.encodedSizeWithTag(25, Boolean.valueOf(value.getRawDeltaBayesRightPresent())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c1 redact(c1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return c1.b(value, 0, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, okio.k.f97943e, 33554431, null);
        }
    }

    public c1() {
        this(0, null, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false, false, null, 67108863, null);
    }

    public static /* synthetic */ c1 b(c1 c1Var, int i11, m mVar, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, okio.k kVar, int i22, Object obj) {
        return c1Var.a((i22 & 1) != 0 ? c1Var.keyChannel : i11, (i22 & 2) != 0 ? c1Var.authenticationLevel : mVar, (i22 & 4) != 0 ? c1Var.present : z11, (i22 & 8) != 0 ? c1Var.RSSILeft : i12, (i22 & 16) != 0 ? c1Var.RSSIRight : i13, (i22 & 32) != 0 ? c1Var.RSSIRear : i14, (i22 & 64) != 0 ? c1Var.RSSICenter : i15, (i22 & 128) != 0 ? c1Var.RSSIFront : i16, (i22 & 256) != 0 ? c1Var.RSSISecondary : i17, (i22 & 512) != 0 ? c1Var.RSSINFCCradle : i18, (i22 & 1024) != 0 ? c1Var.RSSIRearLeft : i19, (i22 & 2048) != 0 ? c1Var.RSSIRearRight : i21, (i22 & 4096) != 0 ? c1Var.highThreshLeftPresent : z12, (i22 & PKIFailureInfo.certRevoked) != 0 ? c1Var.highThreshRightPresent : z13, (i22 & 16384) != 0 ? c1Var.highThreshCenterPresent : z14, (i22 & 32768) != 0 ? c1Var.highThreshFrontPresent : z15, (i22 & 65536) != 0 ? c1Var.highThreshRearPresent : z16, (i22 & 131072) != 0 ? c1Var.highThreshRearLeftPresent : z17, (i22 & 262144) != 0 ? c1Var.highThreshRearRightPresent : z18, (i22 & PKIFailureInfo.signerNotTrusted) != 0 ? c1Var.highThreshSecondaryPresent : z19, (i22 & PKIFailureInfo.badCertTemplate) != 0 ? c1Var.highThreshNFCPresent : z21, (i22 & PKIFailureInfo.badSenderNonce) != 0 ? c1Var.sortedDeltaBayesLeftPresent : z22, (i22 & 4194304) != 0 ? c1Var.sortedDeltaBayesRightPresent : z23, (i22 & 8388608) != 0 ? c1Var.rawDeltaBayesLeftPresent : z24, (i22 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? c1Var.rawDeltaBayesRightPresent : z25, (i22 & 33554432) != 0 ? c1Var.unknownFields() : kVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getSortedDeltaBayesRightPresent() {
        return this.sortedDeltaBayesRightPresent;
    }

    public final c1 a(int keyChannel, m authenticationLevel, boolean present, int RSSILeft, int RSSIRight, int RSSIRear, int RSSICenter, int RSSIFront, int RSSISecondary, int RSSINFCCradle, int RSSIRearLeft, int RSSIRearRight, boolean highThreshLeftPresent, boolean highThreshRightPresent, boolean highThreshCenterPresent, boolean highThreshFrontPresent, boolean highThreshRearPresent, boolean highThreshRearLeftPresent, boolean highThreshRearRightPresent, boolean highThreshSecondaryPresent, boolean highThreshNFCPresent, boolean sortedDeltaBayesLeftPresent, boolean sortedDeltaBayesRightPresent, boolean rawDeltaBayesLeftPresent, boolean rawDeltaBayesRightPresent, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(authenticationLevel, "authenticationLevel");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new c1(keyChannel, authenticationLevel, present, RSSILeft, RSSIRight, RSSIRear, RSSICenter, RSSIFront, RSSISecondary, RSSINFCCradle, RSSIRearLeft, RSSIRearRight, highThreshLeftPresent, highThreshRightPresent, highThreshCenterPresent, highThreshFrontPresent, highThreshRearPresent, highThreshRearLeftPresent, highThreshRearRightPresent, highThreshSecondaryPresent, highThreshNFCPresent, sortedDeltaBayesLeftPresent, sortedDeltaBayesRightPresent, rawDeltaBayesLeftPresent, rawDeltaBayesRightPresent, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getAuthenticationLevel() {
        return this.authenticationLevel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHighThreshCenterPresent() {
        return this.highThreshCenterPresent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getHighThreshFrontPresent() {
        return this.highThreshFrontPresent;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), c1Var.unknownFields()) && this.keyChannel == c1Var.keyChannel && this.authenticationLevel == c1Var.authenticationLevel && this.present == c1Var.present && this.RSSILeft == c1Var.RSSILeft && this.RSSIRight == c1Var.RSSIRight && this.RSSIRear == c1Var.RSSIRear && this.RSSICenter == c1Var.RSSICenter && this.RSSIFront == c1Var.RSSIFront && this.RSSISecondary == c1Var.RSSISecondary && this.RSSINFCCradle == c1Var.RSSINFCCradle && this.RSSIRearLeft == c1Var.RSSIRearLeft && this.RSSIRearRight == c1Var.RSSIRearRight && this.highThreshLeftPresent == c1Var.highThreshLeftPresent && this.highThreshRightPresent == c1Var.highThreshRightPresent && this.highThreshCenterPresent == c1Var.highThreshCenterPresent && this.highThreshFrontPresent == c1Var.highThreshFrontPresent && this.highThreshRearPresent == c1Var.highThreshRearPresent && this.highThreshRearLeftPresent == c1Var.highThreshRearLeftPresent && this.highThreshRearRightPresent == c1Var.highThreshRearRightPresent && this.highThreshSecondaryPresent == c1Var.highThreshSecondaryPresent && this.highThreshNFCPresent == c1Var.highThreshNFCPresent && this.sortedDeltaBayesLeftPresent == c1Var.sortedDeltaBayesLeftPresent && this.sortedDeltaBayesRightPresent == c1Var.sortedDeltaBayesRightPresent && this.rawDeltaBayesLeftPresent == c1Var.rawDeltaBayesLeftPresent && this.rawDeltaBayesRightPresent == c1Var.rawDeltaBayesRightPresent;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHighThreshLeftPresent() {
        return this.highThreshLeftPresent;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getHighThreshNFCPresent() {
        return this.highThreshNFCPresent;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getHighThreshRearLeftPresent() {
        return this.highThreshRearLeftPresent;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.keyChannel)) * 37) + this.authenticationLevel.hashCode()) * 37) + Boolean.hashCode(this.present)) * 37) + Integer.hashCode(this.RSSILeft)) * 37) + Integer.hashCode(this.RSSIRight)) * 37) + Integer.hashCode(this.RSSIRear)) * 37) + Integer.hashCode(this.RSSICenter)) * 37) + Integer.hashCode(this.RSSIFront)) * 37) + Integer.hashCode(this.RSSISecondary)) * 37) + Integer.hashCode(this.RSSINFCCradle)) * 37) + Integer.hashCode(this.RSSIRearLeft)) * 37) + Integer.hashCode(this.RSSIRearRight)) * 37) + Boolean.hashCode(this.highThreshLeftPresent)) * 37) + Boolean.hashCode(this.highThreshRightPresent)) * 37) + Boolean.hashCode(this.highThreshCenterPresent)) * 37) + Boolean.hashCode(this.highThreshFrontPresent)) * 37) + Boolean.hashCode(this.highThreshRearPresent)) * 37) + Boolean.hashCode(this.highThreshRearLeftPresent)) * 37) + Boolean.hashCode(this.highThreshRearRightPresent)) * 37) + Boolean.hashCode(this.highThreshSecondaryPresent)) * 37) + Boolean.hashCode(this.highThreshNFCPresent)) * 37) + Boolean.hashCode(this.sortedDeltaBayesLeftPresent)) * 37) + Boolean.hashCode(this.sortedDeltaBayesRightPresent)) * 37) + Boolean.hashCode(this.rawDeltaBayesLeftPresent)) * 37) + Boolean.hashCode(this.rawDeltaBayesRightPresent);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getHighThreshRearPresent() {
        return this.highThreshRearPresent;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getHighThreshRearRightPresent() {
        return this.highThreshRearRightPresent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getHighThreshRightPresent() {
        return this.highThreshRightPresent;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getHighThreshSecondaryPresent() {
        return this.highThreshSecondaryPresent;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getKeyChannel() {
        return this.keyChannel;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getPresent() {
        return this.present;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m790newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getRSSICenter() {
        return this.RSSICenter;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getRSSIFront() {
        return this.RSSIFront;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getRSSILeft() {
        return this.RSSILeft;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getRSSINFCCradle() {
        return this.RSSINFCCradle;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getRSSIRear() {
        return this.RSSIRear;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getRSSIRearLeft() {
        return this.RSSIRearLeft;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("keyChannel=" + this.keyChannel);
        arrayList.add("authenticationLevel=" + this.authenticationLevel);
        arrayList.add("present=" + this.present);
        arrayList.add("RSSILeft=" + this.RSSILeft);
        arrayList.add("RSSIRight=" + this.RSSIRight);
        arrayList.add("RSSIRear=" + this.RSSIRear);
        arrayList.add("RSSICenter=" + this.RSSICenter);
        arrayList.add("RSSIFront=" + this.RSSIFront);
        arrayList.add("RSSISecondary=" + this.RSSISecondary);
        arrayList.add("RSSINFCCradle=" + this.RSSINFCCradle);
        arrayList.add("RSSIRearLeft=" + this.RSSIRearLeft);
        arrayList.add("RSSIRearRight=" + this.RSSIRearRight);
        arrayList.add("highThreshLeftPresent=" + this.highThreshLeftPresent);
        arrayList.add("highThreshRightPresent=" + this.highThreshRightPresent);
        arrayList.add("highThreshCenterPresent=" + this.highThreshCenterPresent);
        arrayList.add("highThreshFrontPresent=" + this.highThreshFrontPresent);
        arrayList.add("highThreshRearPresent=" + this.highThreshRearPresent);
        arrayList.add("highThreshRearLeftPresent=" + this.highThreshRearLeftPresent);
        arrayList.add("highThreshRearRightPresent=" + this.highThreshRearRightPresent);
        arrayList.add("highThreshSecondaryPresent=" + this.highThreshSecondaryPresent);
        arrayList.add("highThreshNFCPresent=" + this.highThreshNFCPresent);
        arrayList.add("sortedDeltaBayesLeftPresent=" + this.sortedDeltaBayesLeftPresent);
        arrayList.add("sortedDeltaBayesRightPresent=" + this.sortedDeltaBayesRightPresent);
        arrayList.add("rawDeltaBayesLeftPresent=" + this.rawDeltaBayesLeftPresent);
        arrayList.add("rawDeltaBayesRightPresent=" + this.rawDeltaBayesRightPresent);
        return p013kotlin.collections.v.y0(arrayList, ", ", "HandlePulledWithoutAuthDeviceSpecificPayload{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getRSSIRearRight() {
        return this.RSSIRearRight;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final int getRSSIRight() {
        return this.RSSIRight;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final int getRSSISecondary() {
        return this.RSSISecondary;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getRawDeltaBayesLeftPresent() {
        return this.rawDeltaBayesLeftPresent;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getRawDeltaBayesRightPresent() {
        return this.rawDeltaBayesRightPresent;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getSortedDeltaBayesLeftPresent() {
        return this.sortedDeltaBayesLeftPresent;
    }

    public /* synthetic */ c1(int i11, m mVar, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, okio.k kVar, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this((i22 & 1) != 0 ? 0 : i11, (i22 & 2) != 0 ? m.AUTHENTICATION_LEVEL_NONE : mVar, (i22 & 4) != 0 ? false : z11, (i22 & 8) != 0 ? 0 : i12, (i22 & 16) != 0 ? 0 : i13, (i22 & 32) != 0 ? 0 : i14, (i22 & 64) != 0 ? 0 : i15, (i22 & 128) != 0 ? 0 : i16, (i22 & 256) != 0 ? 0 : i17, (i22 & 512) != 0 ? 0 : i18, (i22 & 1024) != 0 ? 0 : i19, (i22 & 2048) != 0 ? 0 : i21, (i22 & 4096) != 0 ? false : z12, (i22 & PKIFailureInfo.certRevoked) != 0 ? false : z13, (i22 & 16384) != 0 ? false : z14, (i22 & 32768) != 0 ? false : z15, (i22 & 65536) != 0 ? false : z16, (i22 & 131072) != 0 ? false : z17, (i22 & 262144) != 0 ? false : z18, (i22 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z19, (i22 & PKIFailureInfo.badCertTemplate) != 0 ? false : z21, (i22 & PKIFailureInfo.badSenderNonce) != 0 ? false : z22, (i22 & 4194304) != 0 ? false : z23, (i22 & 8388608) != 0 ? false : z24, (i22 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z25, (i22 & 33554432) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m790newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(int i11, m authenticationLevel, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, okio.k unknownFields) {
        super(A, unknownFields);
        p013kotlin.jvm.internal.s.k(authenticationLevel, "authenticationLevel");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.keyChannel = i11;
        this.authenticationLevel = authenticationLevel;
        this.present = z11;
        this.RSSILeft = i12;
        this.RSSIRight = i13;
        this.RSSIRear = i14;
        this.RSSICenter = i15;
        this.RSSIFront = i16;
        this.RSSISecondary = i17;
        this.RSSINFCCradle = i18;
        this.RSSIRearLeft = i19;
        this.RSSIRearRight = i21;
        this.highThreshLeftPresent = z12;
        this.highThreshRightPresent = z13;
        this.highThreshCenterPresent = z14;
        this.highThreshFrontPresent = z15;
        this.highThreshRearPresent = z16;
        this.highThreshRearLeftPresent = z17;
        this.highThreshRearRightPresent = z18;
        this.highThreshSecondaryPresent = z19;
        this.highThreshNFCPresent = z21;
        this.sortedDeltaBayesLeftPresent = z22;
        this.sortedDeltaBayesRightPresent = z23;
        this.rawDeltaBayesLeftPresent = z24;
        this.rawDeltaBayesRightPresent = z25;
    }
}
