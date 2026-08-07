package ec0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\u0018\u0000 T2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001<B©\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0002H\u0017¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J¯\u0003\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b7\u00108R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b<\u0010;R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b=\u0010;R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00109\u001a\u0004\bB\u0010;R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u0010;R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u0010;R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\bG\u0010;R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u00109\u001a\u0004\bH\u0010;R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00109\u001a\u0004\bJ\u0010;R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u00109\u001a\u0004\bL\u0010;R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bM\u0010;R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u00109\u001a\u0004\bN\u0010;R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u00109\u001a\u0004\bP\u0010;R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00109\u001a\u0004\bR\u0010;R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bS\u0010;R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bT\u0010;R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00109\u001a\u0004\bU\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bV\u0010;R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u00109\u001a\u0004\b>\u0010;R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u00109\u001a\u0004\bW\u0010;R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u00109\u001a\u0004\b@\u0010;R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u00109\u001a\u0004\bZ\u0010;R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\bC\u0010;R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u00109\u001a\u0004\bE\u0010;R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u00109\u001a\u0004\bI\u0010;R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\\\u00109\u001a\u0004\bK\u0010;R\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u00109\u001a\u0004\bO\u0010;R\u001c\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u00109\u001a\u0004\bQ\u0010;R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u00109\u001a\u0004\b\\\u0010;R\u001c\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u00109\u001a\u0004\bY\u0010;R\u001c\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u00109\u001a\u0004\bX\u0010;R\u001c\u0010%\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u00109\u001a\u0004\b[\u0010;¨\u0006]"}, d2 = {"Lec0/b;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Trim40", "OBSOLETE_Trim50", "OBSOLETE_Trim50D", "Trim60", "Trim60D", "Trim70", "Trim70D", "Trim75", "Trim75D", "TrimP75D", "Trim85", "TrimP85", "TrimP85plus", "Trim85D", "TrimP85D", "Trim90", "TrimP90", "TrimP90plus", "Trim90D", "TrimP90D", "Trim100", "TrimP100", "Trim100D", "TrimP100D", "Trim50", "Trim50D", "Trim62", "Trim62D", "Trim74", "Trim74D", "TrimP74D", "TrimDefault", "TrimCyberBeast", "TrimInvalid", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lec0/b;", "Lec0/h0;", "f", "()Lec0/h0;", "b", "c", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "e", "j", "m", "g", "n", "h", "q", "r", "C", "k", "s", "l", "D", Gender.FEMALE, "t", "o", "E", "p", "u", "G", "I", "v", "H", "z", "w", "x", "A", "y", "B", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.squareup.wire.f {
    public static final ProtoAdapter<b> J = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(b.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 27)
    private final h0 Trim62;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 28)
    private final h0 Trim62D;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 29)
    private final h0 Trim74;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 30)
    private final h0 Trim74D;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 31)
    private final h0 TrimP74D;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 32)
    private final h0 TrimDefault;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 34)
    private final h0 TrimCyberBeast;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 255)
    private final h0 TrimInvalid;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final h0 Trim40;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "OBSOLETETrim50", tag = 2)
    private final h0 OBSOLETE_Trim50;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", jsonName = "OBSOLETETrim50D", tag = 3)
    private final h0 OBSOLETE_Trim50D;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final h0 Trim60;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
    private final h0 Trim60D;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
    private final h0 Trim70;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)
    private final h0 Trim70D;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)
    private final h0 Trim75;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)
    private final h0 Trim75D;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)
    private final h0 TrimP75D;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 11)
    private final h0 Trim85;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 12)
    private final h0 TrimP85;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 13)
    private final h0 TrimP85plus;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 14)
    private final h0 Trim85D;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 15)
    private final h0 TrimP85D;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 16)
    private final h0 Trim90;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 17)
    private final h0 TrimP90;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 18)
    private final h0 TrimP90plus;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 19)
    private final h0 Trim90D;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 20)
    private final h0 TrimP90D;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 21)
    private final h0 Trim100;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 22)
    private final h0 TrimP100;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 23)
    private final h0 Trim100D;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 24)
    private final h0 TrimP100D;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 25)
    private final h0 Trim50;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 26)
    private final h0 Trim50D;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/b;", "value", "", "c", "(Lec0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/b;", DateTokenConverter.CONVERTER_KEY, "(Lec0/b;)Lec0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.CarTrim", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) {
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
            h0 h0VarDecode11 = null;
            h0 h0VarDecode12 = null;
            h0 h0VarDecode13 = null;
            h0 h0VarDecode14 = null;
            h0 h0VarDecode15 = null;
            h0 h0VarDecode16 = null;
            h0 h0VarDecode17 = null;
            h0 h0VarDecode18 = null;
            h0 h0VarDecode19 = null;
            h0 h0VarDecode20 = null;
            h0 h0VarDecode21 = null;
            h0 h0VarDecode22 = null;
            h0 h0VarDecode23 = null;
            h0 h0VarDecode24 = null;
            h0 h0VarDecode25 = null;
            h0 h0VarDecode26 = null;
            h0 h0VarDecode27 = null;
            h0 h0VarDecode28 = null;
            h0 h0VarDecode29 = null;
            h0 h0VarDecode30 = null;
            h0 h0VarDecode31 = null;
            h0 h0VarDecode32 = null;
            h0 h0VarDecode33 = null;
            h0 h0VarDecode34 = null;
            while (true) {
                int iG = reader.g();
                h0 h0Var = h0VarDecode;
                if (iG == -1) {
                    return new b(h0VarDecode34, h0Var, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, h0VarDecode7, h0VarDecode8, h0VarDecode9, h0VarDecode10, h0VarDecode11, h0VarDecode12, h0VarDecode13, h0VarDecode14, h0VarDecode15, h0VarDecode16, h0VarDecode17, h0VarDecode18, h0VarDecode19, h0VarDecode20, h0VarDecode21, h0VarDecode22, h0VarDecode23, h0VarDecode24, h0VarDecode25, h0VarDecode26, h0VarDecode27, h0VarDecode28, h0VarDecode29, h0VarDecode30, h0VarDecode31, h0VarDecode32, h0VarDecode33, reader.e(jD));
                }
                if (iG == 34) {
                    h0VarDecode32 = h0.f62622b.decode(reader);
                } else if (iG != 255) {
                    switch (iG) {
                        case 1:
                            h0VarDecode34 = h0.f62622b.decode(reader);
                            break;
                        case 2:
                            h0VarDecode = h0.f62622b.decode(reader);
                            continue;
                        case 3:
                            h0VarDecode2 = h0.f62622b.decode(reader);
                            break;
                        case 4:
                            h0VarDecode3 = h0.f62622b.decode(reader);
                            break;
                        case 5:
                            h0VarDecode4 = h0.f62622b.decode(reader);
                            break;
                        case 6:
                            h0VarDecode5 = h0.f62622b.decode(reader);
                            break;
                        case 7:
                            h0VarDecode6 = h0.f62622b.decode(reader);
                            break;
                        case 8:
                            h0VarDecode7 = h0.f62622b.decode(reader);
                            break;
                        case 9:
                            h0VarDecode8 = h0.f62622b.decode(reader);
                            break;
                        case 10:
                            h0VarDecode9 = h0.f62622b.decode(reader);
                            break;
                        case 11:
                            h0VarDecode10 = h0.f62622b.decode(reader);
                            break;
                        case 12:
                            h0VarDecode11 = h0.f62622b.decode(reader);
                            break;
                        case 13:
                            h0VarDecode12 = h0.f62622b.decode(reader);
                            break;
                        case 14:
                            h0VarDecode13 = h0.f62622b.decode(reader);
                            break;
                        case 15:
                            h0VarDecode14 = h0.f62622b.decode(reader);
                            break;
                        case 16:
                            h0VarDecode15 = h0.f62622b.decode(reader);
                            break;
                        case 17:
                            h0VarDecode16 = h0.f62622b.decode(reader);
                            break;
                        case 18:
                            h0VarDecode17 = h0.f62622b.decode(reader);
                            break;
                        case 19:
                            h0VarDecode18 = h0.f62622b.decode(reader);
                            break;
                        case 20:
                            h0VarDecode19 = h0.f62622b.decode(reader);
                            break;
                        case 21:
                            h0VarDecode20 = h0.f62622b.decode(reader);
                            break;
                        case 22:
                            h0VarDecode21 = h0.f62622b.decode(reader);
                            break;
                        case 23:
                            h0VarDecode22 = h0.f62622b.decode(reader);
                            break;
                        case 24:
                            h0VarDecode23 = h0.f62622b.decode(reader);
                            break;
                        case 25:
                            h0VarDecode24 = h0.f62622b.decode(reader);
                            break;
                        case 26:
                            h0VarDecode25 = h0.f62622b.decode(reader);
                            break;
                        case 27:
                            h0VarDecode26 = h0.f62622b.decode(reader);
                            break;
                        case 28:
                            h0VarDecode27 = h0.f62622b.decode(reader);
                            break;
                        case 29:
                            h0VarDecode28 = h0.f62622b.decode(reader);
                            break;
                        case 30:
                            h0VarDecode29 = h0.f62622b.decode(reader);
                            break;
                        case 31:
                            h0VarDecode30 = h0.f62622b.decode(reader);
                            break;
                        case 32:
                            h0VarDecode31 = h0.f62622b.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                } else {
                    h0VarDecode33 = h0.f62622b.decode(reader);
                }
                h0VarDecode = h0Var;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, b value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getTrim40());
            protoAdapter.encodeWithTag(writer, 2, value.getOBSOLETE_Trim50());
            protoAdapter.encodeWithTag(writer, 3, value.getOBSOLETE_Trim50D());
            protoAdapter.encodeWithTag(writer, 4, value.getTrim60());
            protoAdapter.encodeWithTag(writer, 5, value.getTrim60D());
            protoAdapter.encodeWithTag(writer, 6, value.getTrim70());
            protoAdapter.encodeWithTag(writer, 7, value.getTrim70D());
            protoAdapter.encodeWithTag(writer, 8, value.getTrim75());
            protoAdapter.encodeWithTag(writer, 9, value.getTrim75D());
            protoAdapter.encodeWithTag(writer, 10, value.getTrimP75D());
            protoAdapter.encodeWithTag(writer, 11, value.getTrim85());
            protoAdapter.encodeWithTag(writer, 12, value.getTrimP85());
            protoAdapter.encodeWithTag(writer, 13, value.getTrimP85plus());
            protoAdapter.encodeWithTag(writer, 14, value.getTrim85D());
            protoAdapter.encodeWithTag(writer, 15, value.getTrimP85D());
            protoAdapter.encodeWithTag(writer, 16, value.getTrim90());
            protoAdapter.encodeWithTag(writer, 17, value.getTrimP90());
            protoAdapter.encodeWithTag(writer, 18, value.getTrimP90plus());
            protoAdapter.encodeWithTag(writer, 19, value.getTrim90D());
            protoAdapter.encodeWithTag(writer, 20, value.getTrimP90D());
            protoAdapter.encodeWithTag(writer, 21, value.getTrim100());
            protoAdapter.encodeWithTag(writer, 22, value.getTrimP100());
            protoAdapter.encodeWithTag(writer, 23, value.getTrim100D());
            protoAdapter.encodeWithTag(writer, 24, value.getTrimP100D());
            protoAdapter.encodeWithTag(writer, 25, value.getTrim50());
            protoAdapter.encodeWithTag(writer, 26, value.getTrim50D());
            protoAdapter.encodeWithTag(writer, 27, value.getTrim62());
            protoAdapter.encodeWithTag(writer, 28, value.getTrim62D());
            protoAdapter.encodeWithTag(writer, 29, value.getTrim74());
            protoAdapter.encodeWithTag(writer, 30, value.getTrim74D());
            protoAdapter.encodeWithTag(writer, 31, value.getTrimP74D());
            protoAdapter.encodeWithTag(writer, 32, value.getTrimDefault());
            protoAdapter.encodeWithTag(writer, 34, value.getTrimCyberBeast());
            protoAdapter.encodeWithTag(writer, 255, value.getTrimInvalid());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getTrim40()) + protoAdapter.encodedSizeWithTag(2, value.getOBSOLETE_Trim50()) + protoAdapter.encodedSizeWithTag(3, value.getOBSOLETE_Trim50D()) + protoAdapter.encodedSizeWithTag(4, value.getTrim60()) + protoAdapter.encodedSizeWithTag(5, value.getTrim60D()) + protoAdapter.encodedSizeWithTag(6, value.getTrim70()) + protoAdapter.encodedSizeWithTag(7, value.getTrim70D()) + protoAdapter.encodedSizeWithTag(8, value.getTrim75()) + protoAdapter.encodedSizeWithTag(9, value.getTrim75D()) + protoAdapter.encodedSizeWithTag(10, value.getTrimP75D()) + protoAdapter.encodedSizeWithTag(11, value.getTrim85()) + protoAdapter.encodedSizeWithTag(12, value.getTrimP85()) + protoAdapter.encodedSizeWithTag(13, value.getTrimP85plus()) + protoAdapter.encodedSizeWithTag(14, value.getTrim85D()) + protoAdapter.encodedSizeWithTag(15, value.getTrimP85D()) + protoAdapter.encodedSizeWithTag(16, value.getTrim90()) + protoAdapter.encodedSizeWithTag(17, value.getTrimP90()) + protoAdapter.encodedSizeWithTag(18, value.getTrimP90plus()) + protoAdapter.encodedSizeWithTag(19, value.getTrim90D()) + protoAdapter.encodedSizeWithTag(20, value.getTrimP90D()) + protoAdapter.encodedSizeWithTag(21, value.getTrim100()) + protoAdapter.encodedSizeWithTag(22, value.getTrimP100()) + protoAdapter.encodedSizeWithTag(23, value.getTrim100D()) + protoAdapter.encodedSizeWithTag(24, value.getTrimP100D()) + protoAdapter.encodedSizeWithTag(25, value.getTrim50()) + protoAdapter.encodedSizeWithTag(26, value.getTrim50D()) + protoAdapter.encodedSizeWithTag(27, value.getTrim62()) + protoAdapter.encodedSizeWithTag(28, value.getTrim62D()) + protoAdapter.encodedSizeWithTag(29, value.getTrim74()) + protoAdapter.encodedSizeWithTag(30, value.getTrim74D()) + protoAdapter.encodedSizeWithTag(31, value.getTrimP74D()) + protoAdapter.encodedSizeWithTag(32, value.getTrimDefault()) + protoAdapter.encodedSizeWithTag(34, value.getTrimCyberBeast()) + protoAdapter.encodedSizeWithTag(255, value.getTrimInvalid());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            h0 h0VarRedact;
            h0 h0Var;
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 trim40 = value.getTrim40();
            h0 h0VarRedact2 = trim40 != null ? h0.f62622b.redact(trim40) : null;
            h0 oBSOLETE_Trim50 = value.getOBSOLETE_Trim50();
            h0 h0VarRedact3 = oBSOLETE_Trim50 != null ? h0.f62622b.redact(oBSOLETE_Trim50) : null;
            h0 oBSOLETE_Trim50D = value.getOBSOLETE_Trim50D();
            h0 h0VarRedact4 = oBSOLETE_Trim50D != null ? h0.f62622b.redact(oBSOLETE_Trim50D) : null;
            h0 trim60 = value.getTrim60();
            h0 h0VarRedact5 = trim60 != null ? h0.f62622b.redact(trim60) : null;
            h0 trim60D = value.getTrim60D();
            h0 h0VarRedact6 = trim60D != null ? h0.f62622b.redact(trim60D) : null;
            h0 trim70 = value.getTrim70();
            h0 h0VarRedact7 = trim70 != null ? h0.f62622b.redact(trim70) : null;
            h0 trim70D = value.getTrim70D();
            h0 h0VarRedact8 = trim70D != null ? h0.f62622b.redact(trim70D) : null;
            h0 trim75 = value.getTrim75();
            h0 h0VarRedact9 = trim75 != null ? h0.f62622b.redact(trim75) : null;
            h0 trim75D = value.getTrim75D();
            h0 h0VarRedact10 = trim75D != null ? h0.f62622b.redact(trim75D) : null;
            h0 trimP75D = value.getTrimP75D();
            h0 h0VarRedact11 = trimP75D != null ? h0.f62622b.redact(trimP75D) : null;
            h0 trim85 = value.getTrim85();
            h0 h0VarRedact12 = trim85 != null ? h0.f62622b.redact(trim85) : null;
            h0 trimP85 = value.getTrimP85();
            h0 h0VarRedact13 = trimP85 != null ? h0.f62622b.redact(trimP85) : null;
            h0 trimP85plus = value.getTrimP85plus();
            h0 h0VarRedact14 = trimP85plus != null ? h0.f62622b.redact(trimP85plus) : null;
            h0 trim85D = value.getTrim85D();
            h0 h0VarRedact15 = trim85D != null ? h0.f62622b.redact(trim85D) : null;
            h0 trimP85D = value.getTrimP85D();
            h0 h0Var2 = h0VarRedact2;
            h0 h0VarRedact16 = trimP85D != null ? h0.f62622b.redact(trimP85D) : null;
            h0 trim90 = value.getTrim90();
            h0 h0Var3 = h0VarRedact16;
            h0 h0VarRedact17 = trim90 != null ? h0.f62622b.redact(trim90) : null;
            h0 trimP90 = value.getTrimP90();
            h0 h0Var4 = h0VarRedact17;
            h0 h0VarRedact18 = trimP90 != null ? h0.f62622b.redact(trimP90) : null;
            h0 trimP90plus = value.getTrimP90plus();
            h0 h0Var5 = h0VarRedact18;
            h0 h0VarRedact19 = trimP90plus != null ? h0.f62622b.redact(trimP90plus) : null;
            h0 trim90D = value.getTrim90D();
            h0 h0Var6 = h0VarRedact19;
            h0 h0VarRedact20 = trim90D != null ? h0.f62622b.redact(trim90D) : null;
            h0 trimP90D = value.getTrimP90D();
            h0 h0Var7 = h0VarRedact20;
            h0 h0VarRedact21 = trimP90D != null ? h0.f62622b.redact(trimP90D) : null;
            h0 trim100 = value.getTrim100();
            h0 h0Var8 = h0VarRedact21;
            h0 h0VarRedact22 = trim100 != null ? h0.f62622b.redact(trim100) : null;
            h0 trimP100 = value.getTrimP100();
            h0 h0Var9 = h0VarRedact22;
            h0 h0VarRedact23 = trimP100 != null ? h0.f62622b.redact(trimP100) : null;
            h0 trim100D = value.getTrim100D();
            h0 h0Var10 = h0VarRedact23;
            h0 h0VarRedact24 = trim100D != null ? h0.f62622b.redact(trim100D) : null;
            h0 trimP100D = value.getTrimP100D();
            h0 h0Var11 = h0VarRedact24;
            h0 h0VarRedact25 = trimP100D != null ? h0.f62622b.redact(trimP100D) : null;
            h0 trim50 = value.getTrim50();
            h0 h0Var12 = h0VarRedact25;
            h0 h0VarRedact26 = trim50 != null ? h0.f62622b.redact(trim50) : null;
            h0 trim50D = value.getTrim50D();
            h0 h0Var13 = h0VarRedact26;
            h0 h0VarRedact27 = trim50D != null ? h0.f62622b.redact(trim50D) : null;
            h0 trim62 = value.getTrim62();
            h0 h0Var14 = h0VarRedact27;
            h0 h0VarRedact28 = trim62 != null ? h0.f62622b.redact(trim62) : null;
            h0 trim62D = value.getTrim62D();
            h0 h0Var15 = h0VarRedact28;
            h0 h0VarRedact29 = trim62D != null ? h0.f62622b.redact(trim62D) : null;
            h0 trim74 = value.getTrim74();
            h0 h0Var16 = h0VarRedact29;
            h0 h0VarRedact30 = trim74 != null ? h0.f62622b.redact(trim74) : null;
            h0 trim74D = value.getTrim74D();
            h0 h0Var17 = h0VarRedact30;
            h0 h0VarRedact31 = trim74D != null ? h0.f62622b.redact(trim74D) : null;
            h0 trimP74D = value.getTrimP74D();
            h0 h0Var18 = h0VarRedact31;
            h0 h0VarRedact32 = trimP74D != null ? h0.f62622b.redact(trimP74D) : null;
            h0 trimDefault = value.getTrimDefault();
            h0 h0Var19 = h0VarRedact32;
            h0 h0VarRedact33 = trimDefault != null ? h0.f62622b.redact(trimDefault) : null;
            h0 trimCyberBeast = value.getTrimCyberBeast();
            h0 h0Var20 = h0VarRedact33;
            h0 h0VarRedact34 = trimCyberBeast != null ? h0.f62622b.redact(trimCyberBeast) : null;
            h0 trimInvalid = value.getTrimInvalid();
            if (trimInvalid != null) {
                h0VarRedact = h0.f62622b.redact(trimInvalid);
                h0Var = h0VarRedact34;
            } else {
                h0VarRedact = null;
                h0Var = h0VarRedact34;
            }
            return value.a(h0Var2, h0VarRedact3, h0VarRedact4, h0VarRedact5, h0VarRedact6, h0VarRedact7, h0VarRedact8, h0VarRedact9, h0VarRedact10, h0VarRedact11, h0VarRedact12, h0VarRedact13, h0VarRedact14, h0VarRedact15, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12, h0Var13, h0Var14, h0Var15, h0Var16, h0Var17, h0Var18, h0Var19, h0Var20, h0Var, h0VarRedact, okio.k.f97943e);
        }
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 7, null);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final h0 getTrimP100D() {
        return this.TrimP100D;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final h0 getTrimP74D() {
        return this.TrimP74D;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final h0 getTrimP75D() {
        return this.TrimP75D;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final h0 getTrimP85() {
        return this.TrimP85;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final h0 getTrimP85D() {
        return this.TrimP85D;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final h0 getTrimP85plus() {
        return this.TrimP85plus;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final h0 getTrimP90() {
        return this.TrimP90;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final h0 getTrimP90D() {
        return this.TrimP90D;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final h0 getTrimP90plus() {
        return this.TrimP90plus;
    }

    public final b a(h0 Trim40, h0 OBSOLETE_Trim50, h0 OBSOLETE_Trim50D, h0 Trim60, h0 Trim60D, h0 Trim70, h0 Trim70D, h0 Trim75, h0 Trim75D, h0 TrimP75D, h0 Trim85, h0 TrimP85, h0 TrimP85plus, h0 Trim85D, h0 TrimP85D, h0 Trim90, h0 TrimP90, h0 TrimP90plus, h0 Trim90D, h0 TrimP90D, h0 Trim100, h0 TrimP100, h0 Trim100D, h0 TrimP100D, h0 Trim50, h0 Trim50D, h0 Trim62, h0 Trim62D, h0 Trim74, h0 Trim74D, h0 TrimP74D, h0 TrimDefault, h0 TrimCyberBeast, h0 TrimInvalid, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new b(Trim40, OBSOLETE_Trim50, OBSOLETE_Trim50D, Trim60, Trim60D, Trim70, Trim70D, Trim75, Trim75D, TrimP75D, Trim85, TrimP85, TrimP85plus, Trim85D, TrimP85D, Trim90, TrimP90, TrimP90plus, Trim90D, TrimP90D, Trim100, TrimP100, Trim100D, TrimP100D, Trim50, Trim50D, Trim62, Trim62D, Trim74, Trim74D, TrimP74D, TrimDefault, TrimCyberBeast, TrimInvalid, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getOBSOLETE_Trim50() {
        return this.OBSOLETE_Trim50;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getOBSOLETE_Trim50D() {
        return this.OBSOLETE_Trim50D;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getTrim100() {
        return this.Trim100;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getTrim100D() {
        return this.Trim100D;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), bVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Trim40, bVar.Trim40) && p013kotlin.jvm.internal.s.f(this.OBSOLETE_Trim50, bVar.OBSOLETE_Trim50) && p013kotlin.jvm.internal.s.f(this.OBSOLETE_Trim50D, bVar.OBSOLETE_Trim50D) && p013kotlin.jvm.internal.s.f(this.Trim60, bVar.Trim60) && p013kotlin.jvm.internal.s.f(this.Trim60D, bVar.Trim60D) && p013kotlin.jvm.internal.s.f(this.Trim70, bVar.Trim70) && p013kotlin.jvm.internal.s.f(this.Trim70D, bVar.Trim70D) && p013kotlin.jvm.internal.s.f(this.Trim75, bVar.Trim75) && p013kotlin.jvm.internal.s.f(this.Trim75D, bVar.Trim75D) && p013kotlin.jvm.internal.s.f(this.TrimP75D, bVar.TrimP75D) && p013kotlin.jvm.internal.s.f(this.Trim85, bVar.Trim85) && p013kotlin.jvm.internal.s.f(this.TrimP85, bVar.TrimP85) && p013kotlin.jvm.internal.s.f(this.TrimP85plus, bVar.TrimP85plus) && p013kotlin.jvm.internal.s.f(this.Trim85D, bVar.Trim85D) && p013kotlin.jvm.internal.s.f(this.TrimP85D, bVar.TrimP85D) && p013kotlin.jvm.internal.s.f(this.Trim90, bVar.Trim90) && p013kotlin.jvm.internal.s.f(this.TrimP90, bVar.TrimP90) && p013kotlin.jvm.internal.s.f(this.TrimP90plus, bVar.TrimP90plus) && p013kotlin.jvm.internal.s.f(this.Trim90D, bVar.Trim90D) && p013kotlin.jvm.internal.s.f(this.TrimP90D, bVar.TrimP90D) && p013kotlin.jvm.internal.s.f(this.Trim100, bVar.Trim100) && p013kotlin.jvm.internal.s.f(this.TrimP100, bVar.TrimP100) && p013kotlin.jvm.internal.s.f(this.Trim100D, bVar.Trim100D) && p013kotlin.jvm.internal.s.f(this.TrimP100D, bVar.TrimP100D) && p013kotlin.jvm.internal.s.f(this.Trim50, bVar.Trim50) && p013kotlin.jvm.internal.s.f(this.Trim50D, bVar.Trim50D) && p013kotlin.jvm.internal.s.f(this.Trim62, bVar.Trim62) && p013kotlin.jvm.internal.s.f(this.Trim62D, bVar.Trim62D) && p013kotlin.jvm.internal.s.f(this.Trim74, bVar.Trim74) && p013kotlin.jvm.internal.s.f(this.Trim74D, bVar.Trim74D) && p013kotlin.jvm.internal.s.f(this.TrimP74D, bVar.TrimP74D) && p013kotlin.jvm.internal.s.f(this.TrimDefault, bVar.TrimDefault) && p013kotlin.jvm.internal.s.f(this.TrimCyberBeast, bVar.TrimCyberBeast) && p013kotlin.jvm.internal.s.f(this.TrimInvalid, bVar.TrimInvalid);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h0 getTrim40() {
        return this.Trim40;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h0 getTrim50() {
        return this.Trim50;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h0 getTrim50D() {
        return this.Trim50D;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.Trim40;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.OBSOLETE_Trim50;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.OBSOLETE_Trim50D;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        h0 h0Var4 = this.Trim60;
        int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        h0 h0Var5 = this.Trim60D;
        int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
        h0 h0Var6 = this.Trim70;
        int iHashCode7 = (iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0)) * 37;
        h0 h0Var7 = this.Trim70D;
        int iHashCode8 = (iHashCode7 + (h0Var7 != null ? h0Var7.hashCode() : 0)) * 37;
        h0 h0Var8 = this.Trim75;
        int iHashCode9 = (iHashCode8 + (h0Var8 != null ? h0Var8.hashCode() : 0)) * 37;
        h0 h0Var9 = this.Trim75D;
        int iHashCode10 = (iHashCode9 + (h0Var9 != null ? h0Var9.hashCode() : 0)) * 37;
        h0 h0Var10 = this.TrimP75D;
        int iHashCode11 = (iHashCode10 + (h0Var10 != null ? h0Var10.hashCode() : 0)) * 37;
        h0 h0Var11 = this.Trim85;
        int iHashCode12 = (iHashCode11 + (h0Var11 != null ? h0Var11.hashCode() : 0)) * 37;
        h0 h0Var12 = this.TrimP85;
        int iHashCode13 = (iHashCode12 + (h0Var12 != null ? h0Var12.hashCode() : 0)) * 37;
        h0 h0Var13 = this.TrimP85plus;
        int iHashCode14 = (iHashCode13 + (h0Var13 != null ? h0Var13.hashCode() : 0)) * 37;
        h0 h0Var14 = this.Trim85D;
        int iHashCode15 = (iHashCode14 + (h0Var14 != null ? h0Var14.hashCode() : 0)) * 37;
        h0 h0Var15 = this.TrimP85D;
        int iHashCode16 = (iHashCode15 + (h0Var15 != null ? h0Var15.hashCode() : 0)) * 37;
        h0 h0Var16 = this.Trim90;
        int iHashCode17 = (iHashCode16 + (h0Var16 != null ? h0Var16.hashCode() : 0)) * 37;
        h0 h0Var17 = this.TrimP90;
        int iHashCode18 = (iHashCode17 + (h0Var17 != null ? h0Var17.hashCode() : 0)) * 37;
        h0 h0Var18 = this.TrimP90plus;
        int iHashCode19 = (iHashCode18 + (h0Var18 != null ? h0Var18.hashCode() : 0)) * 37;
        h0 h0Var19 = this.Trim90D;
        int iHashCode20 = (iHashCode19 + (h0Var19 != null ? h0Var19.hashCode() : 0)) * 37;
        h0 h0Var20 = this.TrimP90D;
        int iHashCode21 = (iHashCode20 + (h0Var20 != null ? h0Var20.hashCode() : 0)) * 37;
        h0 h0Var21 = this.Trim100;
        int iHashCode22 = (iHashCode21 + (h0Var21 != null ? h0Var21.hashCode() : 0)) * 37;
        h0 h0Var22 = this.TrimP100;
        int iHashCode23 = (iHashCode22 + (h0Var22 != null ? h0Var22.hashCode() : 0)) * 37;
        h0 h0Var23 = this.Trim100D;
        int iHashCode24 = (iHashCode23 + (h0Var23 != null ? h0Var23.hashCode() : 0)) * 37;
        h0 h0Var24 = this.TrimP100D;
        int iHashCode25 = (iHashCode24 + (h0Var24 != null ? h0Var24.hashCode() : 0)) * 37;
        h0 h0Var25 = this.Trim50;
        int iHashCode26 = (iHashCode25 + (h0Var25 != null ? h0Var25.hashCode() : 0)) * 37;
        h0 h0Var26 = this.Trim50D;
        int iHashCode27 = (iHashCode26 + (h0Var26 != null ? h0Var26.hashCode() : 0)) * 37;
        h0 h0Var27 = this.Trim62;
        int iHashCode28 = (iHashCode27 + (h0Var27 != null ? h0Var27.hashCode() : 0)) * 37;
        h0 h0Var28 = this.Trim62D;
        int iHashCode29 = (iHashCode28 + (h0Var28 != null ? h0Var28.hashCode() : 0)) * 37;
        h0 h0Var29 = this.Trim74;
        int iHashCode30 = (iHashCode29 + (h0Var29 != null ? h0Var29.hashCode() : 0)) * 37;
        h0 h0Var30 = this.Trim74D;
        int iHashCode31 = (iHashCode30 + (h0Var30 != null ? h0Var30.hashCode() : 0)) * 37;
        h0 h0Var31 = this.TrimP74D;
        int iHashCode32 = (iHashCode31 + (h0Var31 != null ? h0Var31.hashCode() : 0)) * 37;
        h0 h0Var32 = this.TrimDefault;
        int iHashCode33 = (iHashCode32 + (h0Var32 != null ? h0Var32.hashCode() : 0)) * 37;
        h0 h0Var33 = this.TrimCyberBeast;
        int iHashCode34 = (iHashCode33 + (h0Var33 != null ? h0Var33.hashCode() : 0)) * 37;
        h0 h0Var34 = this.TrimInvalid;
        int iHashCode35 = iHashCode34 + (h0Var34 != null ? h0Var34.hashCode() : 0);
        this.hashCode = iHashCode35;
        return iHashCode35;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h0 getTrim60() {
        return this.Trim60;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h0 getTrim60D() {
        return this.Trim60D;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final h0 getTrim62() {
        return this.Trim62;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final h0 getTrim62D() {
        return this.Trim62D;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final h0 getTrim70() {
        return this.Trim70;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final h0 getTrim70D() {
        return this.Trim70D;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m137newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final h0 getTrim74() {
        return this.Trim74;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final h0 getTrim74D() {
        return this.Trim74D;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final h0 getTrim75() {
        return this.Trim75;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final h0 getTrim75D() {
        return this.Trim75D;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final h0 getTrim85() {
        return this.Trim85;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final h0 getTrim85D() {
        return this.Trim85D;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.Trim40;
        if (h0Var != null) {
            arrayList.add("Trim40=" + h0Var);
        }
        h0 h0Var2 = this.OBSOLETE_Trim50;
        if (h0Var2 != null) {
            arrayList.add("OBSOLETE_Trim50=" + h0Var2);
        }
        h0 h0Var3 = this.OBSOLETE_Trim50D;
        if (h0Var3 != null) {
            arrayList.add("OBSOLETE_Trim50D=" + h0Var3);
        }
        h0 h0Var4 = this.Trim60;
        if (h0Var4 != null) {
            arrayList.add("Trim60=" + h0Var4);
        }
        h0 h0Var5 = this.Trim60D;
        if (h0Var5 != null) {
            arrayList.add("Trim60D=" + h0Var5);
        }
        h0 h0Var6 = this.Trim70;
        if (h0Var6 != null) {
            arrayList.add("Trim70=" + h0Var6);
        }
        h0 h0Var7 = this.Trim70D;
        if (h0Var7 != null) {
            arrayList.add("Trim70D=" + h0Var7);
        }
        h0 h0Var8 = this.Trim75;
        if (h0Var8 != null) {
            arrayList.add("Trim75=" + h0Var8);
        }
        h0 h0Var9 = this.Trim75D;
        if (h0Var9 != null) {
            arrayList.add("Trim75D=" + h0Var9);
        }
        h0 h0Var10 = this.TrimP75D;
        if (h0Var10 != null) {
            arrayList.add("TrimP75D=" + h0Var10);
        }
        h0 h0Var11 = this.Trim85;
        if (h0Var11 != null) {
            arrayList.add("Trim85=" + h0Var11);
        }
        h0 h0Var12 = this.TrimP85;
        if (h0Var12 != null) {
            arrayList.add("TrimP85=" + h0Var12);
        }
        h0 h0Var13 = this.TrimP85plus;
        if (h0Var13 != null) {
            arrayList.add("TrimP85plus=" + h0Var13);
        }
        h0 h0Var14 = this.Trim85D;
        if (h0Var14 != null) {
            arrayList.add("Trim85D=" + h0Var14);
        }
        h0 h0Var15 = this.TrimP85D;
        if (h0Var15 != null) {
            arrayList.add("TrimP85D=" + h0Var15);
        }
        h0 h0Var16 = this.Trim90;
        if (h0Var16 != null) {
            arrayList.add("Trim90=" + h0Var16);
        }
        h0 h0Var17 = this.TrimP90;
        if (h0Var17 != null) {
            arrayList.add("TrimP90=" + h0Var17);
        }
        h0 h0Var18 = this.TrimP90plus;
        if (h0Var18 != null) {
            arrayList.add("TrimP90plus=" + h0Var18);
        }
        h0 h0Var19 = this.Trim90D;
        if (h0Var19 != null) {
            arrayList.add("Trim90D=" + h0Var19);
        }
        h0 h0Var20 = this.TrimP90D;
        if (h0Var20 != null) {
            arrayList.add("TrimP90D=" + h0Var20);
        }
        h0 h0Var21 = this.Trim100;
        if (h0Var21 != null) {
            arrayList.add("Trim100=" + h0Var21);
        }
        h0 h0Var22 = this.TrimP100;
        if (h0Var22 != null) {
            arrayList.add("TrimP100=" + h0Var22);
        }
        h0 h0Var23 = this.Trim100D;
        if (h0Var23 != null) {
            arrayList.add("Trim100D=" + h0Var23);
        }
        h0 h0Var24 = this.TrimP100D;
        if (h0Var24 != null) {
            arrayList.add("TrimP100D=" + h0Var24);
        }
        h0 h0Var25 = this.Trim50;
        if (h0Var25 != null) {
            arrayList.add("Trim50=" + h0Var25);
        }
        h0 h0Var26 = this.Trim50D;
        if (h0Var26 != null) {
            arrayList.add("Trim50D=" + h0Var26);
        }
        h0 h0Var27 = this.Trim62;
        if (h0Var27 != null) {
            arrayList.add("Trim62=" + h0Var27);
        }
        h0 h0Var28 = this.Trim62D;
        if (h0Var28 != null) {
            arrayList.add("Trim62D=" + h0Var28);
        }
        h0 h0Var29 = this.Trim74;
        if (h0Var29 != null) {
            arrayList.add("Trim74=" + h0Var29);
        }
        h0 h0Var30 = this.Trim74D;
        if (h0Var30 != null) {
            arrayList.add("Trim74D=" + h0Var30);
        }
        h0 h0Var31 = this.TrimP74D;
        if (h0Var31 != null) {
            arrayList.add("TrimP74D=" + h0Var31);
        }
        h0 h0Var32 = this.TrimDefault;
        if (h0Var32 != null) {
            arrayList.add("TrimDefault=" + h0Var32);
        }
        h0 h0Var33 = this.TrimCyberBeast;
        if (h0Var33 != null) {
            arrayList.add("TrimCyberBeast=" + h0Var33);
        }
        h0 h0Var34 = this.TrimInvalid;
        if (h0Var34 != null) {
            arrayList.add("TrimInvalid=" + h0Var34);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "CarTrim{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final h0 getTrim90() {
        return this.Trim90;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final h0 getTrim90D() {
        return this.Trim90D;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final h0 getTrimCyberBeast() {
        return this.TrimCyberBeast;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final h0 getTrimDefault() {
        return this.TrimDefault;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final h0 getTrimInvalid() {
        return this.TrimInvalid;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final h0 getTrimP100() {
        return this.TrimP100;
    }

    public /* synthetic */ b(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, h0 h0Var10, h0 h0Var11, h0 h0Var12, h0 h0Var13, h0 h0Var14, h0 h0Var15, h0 h0Var16, h0 h0Var17, h0 h0Var18, h0 h0Var19, h0 h0Var20, h0 h0Var21, h0 h0Var22, h0 h0Var23, h0 h0Var24, h0 h0Var25, h0 h0Var26, h0 h0Var27, h0 h0Var28, h0 h0Var29, h0 h0Var30, h0 h0Var31, h0 h0Var32, h0 h0Var33, h0 h0Var34, okio.k kVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? null : h0Var7, (i11 & 128) != 0 ? null : h0Var8, (i11 & 256) != 0 ? null : h0Var9, (i11 & 512) != 0 ? null : h0Var10, (i11 & 1024) != 0 ? null : h0Var11, (i11 & 2048) != 0 ? null : h0Var12, (i11 & 4096) != 0 ? null : h0Var13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : h0Var14, (i11 & 16384) != 0 ? null : h0Var15, (i11 & 32768) != 0 ? null : h0Var16, (i11 & 65536) != 0 ? null : h0Var17, (i11 & 131072) != 0 ? null : h0Var18, (i11 & 262144) != 0 ? null : h0Var19, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : h0Var20, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : h0Var21, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : h0Var22, (i11 & 4194304) != 0 ? null : h0Var23, (i11 & 8388608) != 0 ? null : h0Var24, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : h0Var25, (i11 & 33554432) != 0 ? null : h0Var26, (i11 & 67108864) != 0 ? null : h0Var27, (i11 & 134217728) != 0 ? null : h0Var28, (i11 & 268435456) != 0 ? null : h0Var29, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? null : h0Var30, (i11 & 1073741824) != 0 ? null : h0Var31, (i11 & Integer.MIN_VALUE) != 0 ? null : h0Var32, (i12 & 1) != 0 ? null : h0Var33, (i12 & 2) != 0 ? null : h0Var34, (i12 & 4) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m137newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, h0 h0Var10, h0 h0Var11, h0 h0Var12, h0 h0Var13, h0 h0Var14, h0 h0Var15, h0 h0Var16, h0 h0Var17, h0 h0Var18, h0 h0Var19, h0 h0Var20, h0 h0Var21, h0 h0Var22, h0 h0Var23, h0 h0Var24, h0 h0Var25, h0 h0Var26, h0 h0Var27, h0 h0Var28, h0 h0Var29, h0 h0Var30, h0 h0Var31, h0 h0Var32, h0 h0Var33, h0 h0Var34, okio.k unknownFields) {
        super(J, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.Trim40 = h0Var;
        this.OBSOLETE_Trim50 = h0Var2;
        this.OBSOLETE_Trim50D = h0Var3;
        this.Trim60 = h0Var4;
        this.Trim60D = h0Var5;
        this.Trim70 = h0Var6;
        this.Trim70D = h0Var7;
        this.Trim75 = h0Var8;
        this.Trim75D = h0Var9;
        this.TrimP75D = h0Var10;
        this.Trim85 = h0Var11;
        this.TrimP85 = h0Var12;
        this.TrimP85plus = h0Var13;
        this.Trim85D = h0Var14;
        this.TrimP85D = h0Var15;
        this.Trim90 = h0Var16;
        this.TrimP90 = h0Var17;
        this.TrimP90plus = h0Var18;
        this.Trim90D = h0Var19;
        this.TrimP90D = h0Var20;
        this.Trim100 = h0Var21;
        this.TrimP100 = h0Var22;
        this.Trim100D = h0Var23;
        this.TrimP100D = h0Var24;
        this.Trim50 = h0Var25;
        this.Trim50D = h0Var26;
        this.Trim62 = h0Var27;
        this.Trim62D = h0Var28;
        this.Trim74 = h0Var29;
        this.Trim74D = h0Var30;
        this.TrimP74D = h0Var31;
        this.TrimDefault = h0Var32;
        this.TrimCyberBeast = h0Var33;
        this.TrimInvalid = h0Var34;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12, h0Var13, h0Var14, h0Var15, h0Var16, h0Var17, h0Var18, h0Var19, h0Var20, h0Var21, h0Var22, h0Var23, h0Var24, h0Var25, h0Var26, h0Var27, h0Var28, h0Var29, h0Var30, h0Var31, h0Var32, h0Var33, h0Var34) > 1) {
            throw new IllegalArgumentException("At most one of Trim40, OBSOLETE_Trim50, OBSOLETE_Trim50D, Trim60, Trim60D, Trim70, Trim70D, Trim75, Trim75D, TrimP75D, Trim85, TrimP85, TrimP85plus, Trim85D, TrimP85D, Trim90, TrimP90, TrimP90plus, Trim90D, TrimP90D, Trim100, TrimP100, Trim100D, TrimP100D, Trim50, Trim50D, Trim62, Trim62D, Trim74, Trim74D, TrimP74D, TrimDefault, TrimCyberBeast, TrimInvalid may be non-null");
        }
    }
}
