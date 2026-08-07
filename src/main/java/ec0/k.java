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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b(\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001;B\u009d\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H\u0017¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J£\u0003\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b6\u00107R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b>\u0010:R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b@\u0010:R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\bB\u0010:R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\bA\u0010:R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u00108\u001a\u0004\bE\u0010:R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u00108\u001a\u0004\bC\u0010:R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\b;\u0010:R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u00108\u001a\u0004\bI\u0010:R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00108\u001a\u0004\bK\u0010:R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u00108\u001a\u0004\bL\u0010:R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u00108\u001a\u0004\b=\u0010:R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u00108\u001a\u0004\bJ\u0010:R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u00108\u001a\u0004\b?\u0010:R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bP\u00108\u001a\u0004\bQ\u0010:R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bR\u0010:R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00108\u001a\u0004\bS\u0010:R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u00108\u001a\u0004\bT\u0010:R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u00108\u001a\u0004\bO\u0010:R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u00108\u001a\u0004\bV\u0010:R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\bW\u0010:R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u00108\u001a\u0004\bP\u0010:R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u00108\u001a\u0004\bU\u0010:R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bX\u00108\u001a\u0004\bY\u0010:R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u00108\u001a\u0004\bZ\u0010:R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bM\u0010:R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00108\u001a\u0004\bH\u0010:R\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bZ\u00108\u001a\u0004\bD\u0010:R\u001c\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bT\u00108\u001a\u0004\bF\u0010:R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u00108\u001a\u0004\bX\u0010:R\u001c\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u00108\u001a\u0004\bN\u0010:R\u001c\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00108\u001a\u0004\bG\u0010:¨\u0006["}, d2 = {"Lec0/k;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Unknown", "RedMulticoat", "SolidBlack", "SilverMetallic", "MidnightSilver", "DeepBlue", "PearlWhite", "DefaultColor", "Black", "White", "Silver", "Grey", "Blue", "Green", "Brown", "Pearl", "SigRed", "Red", "SteelGrey", "MetallicBlack", "TitaniumCopper", "SignatureBlue", "MidnightCherryRed", "Quicksilver", "UltraRed", "StealthGrey", "LunarSilver", "GlacierBlue", "DiamondBlack", "FrostBlue", "SilkroadSilver", "MarineBlue", "GarnetRed", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lec0/k;", "Lec0/h0;", "G", "()Lec0/h0;", "b", "v", "c", "B", DateTokenConverter.CONVERTER_KEY, "A", "e", "q", "f", "g", "s", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "H", "k", "z", "l", "m", "n", "o", "p", "r", "w", "u", "D", "t", "E", "x", "y", Gender.FEMALE, "C", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends com.squareup.wire.f {
    public static final ProtoAdapter<k> I = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(k.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 29)
    private final h0 LunarSilver;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 30)
    private final h0 GlacierBlue;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 31)
    private final h0 DiamondBlack;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 32)
    private final h0 FrostBlue;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 33)
    private final h0 SilkroadSilver;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 34)
    private final h0 MarineBlue;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 35)
    private final h0 GarnetRed;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final h0 Unknown;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final h0 RedMulticoat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
    private final h0 SolidBlack;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
    private final h0 SilverMetallic;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)
    private final h0 MidnightSilver;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)
    private final h0 DeepBlue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)
    private final h0 PearlWhite;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)
    private final h0 DefaultColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 11)
    private final h0 Black;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 12)
    private final h0 White;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 13)
    private final h0 Silver;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 14)
    private final h0 Grey;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 15)
    private final h0 Blue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 16)
    private final h0 Green;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 17)
    private final h0 Brown;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 18)
    private final h0 Pearl;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 19)
    private final h0 SigRed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 20)
    private final h0 Red;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 21)
    private final h0 SteelGrey;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 22)
    private final h0 MetallicBlack;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 23)
    private final h0 TitaniumCopper;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 24)
    private final h0 SignatureBlue;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 25)
    private final h0 MidnightCherryRed;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 26)
    private final h0 Quicksilver;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 27)
    private final h0 UltraRed;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 28)
    private final h0 StealthGrey;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ec0/k$a", "Lcom/squareup/wire/ProtoAdapter;", "Lec0/k;", "value", "", "c", "(Lec0/k;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lec0/k;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lec0/k;", DateTokenConverter.CONVERTER_KEY, "(Lec0/k;)Lec0/k;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k> {
        a(com.squareup.wire.b bVar, co0.d<k> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ExteriorColor", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k decode(com.squareup.wire.k reader) {
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
            while (true) {
                int iG = reader.g();
                h0 h0Var = h0VarDecode;
                if (iG == -1) {
                    return new k(h0VarDecode33, h0Var, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, h0VarDecode7, h0VarDecode8, h0VarDecode9, h0VarDecode10, h0VarDecode11, h0VarDecode12, h0VarDecode13, h0VarDecode14, h0VarDecode15, h0VarDecode16, h0VarDecode17, h0VarDecode18, h0VarDecode19, h0VarDecode20, h0VarDecode21, h0VarDecode22, h0VarDecode23, h0VarDecode24, h0VarDecode25, h0VarDecode26, h0VarDecode27, h0VarDecode28, h0VarDecode29, h0VarDecode30, h0VarDecode31, h0VarDecode32, reader.e(jD));
                }
                switch (iG) {
                    case 3:
                        h0VarDecode33 = h0.f62622b.decode(reader);
                        break;
                    case 4:
                        h0VarDecode = h0.f62622b.decode(reader);
                        continue;
                    case 5:
                        h0VarDecode2 = h0.f62622b.decode(reader);
                        break;
                    case 6:
                        h0VarDecode3 = h0.f62622b.decode(reader);
                        break;
                    case 7:
                        h0VarDecode4 = h0.f62622b.decode(reader);
                        break;
                    case 8:
                        h0VarDecode5 = h0.f62622b.decode(reader);
                        break;
                    case 9:
                        h0VarDecode6 = h0.f62622b.decode(reader);
                        break;
                    case 10:
                        h0VarDecode7 = h0.f62622b.decode(reader);
                        break;
                    case 11:
                        h0VarDecode8 = h0.f62622b.decode(reader);
                        break;
                    case 12:
                        h0VarDecode9 = h0.f62622b.decode(reader);
                        break;
                    case 13:
                        h0VarDecode10 = h0.f62622b.decode(reader);
                        break;
                    case 14:
                        h0VarDecode11 = h0.f62622b.decode(reader);
                        break;
                    case 15:
                        h0VarDecode12 = h0.f62622b.decode(reader);
                        break;
                    case 16:
                        h0VarDecode13 = h0.f62622b.decode(reader);
                        break;
                    case 17:
                        h0VarDecode14 = h0.f62622b.decode(reader);
                        break;
                    case 18:
                        h0VarDecode15 = h0.f62622b.decode(reader);
                        break;
                    case 19:
                        h0VarDecode16 = h0.f62622b.decode(reader);
                        break;
                    case 20:
                        h0VarDecode17 = h0.f62622b.decode(reader);
                        break;
                    case 21:
                        h0VarDecode18 = h0.f62622b.decode(reader);
                        break;
                    case 22:
                        h0VarDecode19 = h0.f62622b.decode(reader);
                        break;
                    case 23:
                        h0VarDecode20 = h0.f62622b.decode(reader);
                        break;
                    case 24:
                        h0VarDecode21 = h0.f62622b.decode(reader);
                        break;
                    case 25:
                        h0VarDecode22 = h0.f62622b.decode(reader);
                        break;
                    case 26:
                        h0VarDecode23 = h0.f62622b.decode(reader);
                        break;
                    case 27:
                        h0VarDecode24 = h0.f62622b.decode(reader);
                        break;
                    case 28:
                        h0VarDecode25 = h0.f62622b.decode(reader);
                        break;
                    case 29:
                        h0VarDecode26 = h0.f62622b.decode(reader);
                        break;
                    case 30:
                        h0VarDecode27 = h0.f62622b.decode(reader);
                        break;
                    case 31:
                        h0VarDecode28 = h0.f62622b.decode(reader);
                        break;
                    case 32:
                        h0VarDecode29 = h0.f62622b.decode(reader);
                        break;
                    case 33:
                        h0VarDecode30 = h0.f62622b.decode(reader);
                        break;
                    case 34:
                        h0VarDecode31 = h0.f62622b.decode(reader);
                        break;
                    case 35:
                        h0VarDecode32 = h0.f62622b.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
                h0VarDecode = h0Var;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            protoAdapter.encodeWithTag(writer, 3, value.getUnknown());
            protoAdapter.encodeWithTag(writer, 4, value.getRedMulticoat());
            protoAdapter.encodeWithTag(writer, 5, value.getSolidBlack());
            protoAdapter.encodeWithTag(writer, 6, value.getSilverMetallic());
            protoAdapter.encodeWithTag(writer, 7, value.getMidnightSilver());
            protoAdapter.encodeWithTag(writer, 8, value.getDeepBlue());
            protoAdapter.encodeWithTag(writer, 9, value.getPearlWhite());
            protoAdapter.encodeWithTag(writer, 10, value.getDefaultColor());
            protoAdapter.encodeWithTag(writer, 11, value.getBlack());
            protoAdapter.encodeWithTag(writer, 12, value.getWhite());
            protoAdapter.encodeWithTag(writer, 13, value.getSilver());
            protoAdapter.encodeWithTag(writer, 14, value.getGrey());
            protoAdapter.encodeWithTag(writer, 15, value.getBlue());
            protoAdapter.encodeWithTag(writer, 16, value.getGreen());
            protoAdapter.encodeWithTag(writer, 17, value.getBrown());
            protoAdapter.encodeWithTag(writer, 18, value.getPearl());
            protoAdapter.encodeWithTag(writer, 19, value.getSigRed());
            protoAdapter.encodeWithTag(writer, 20, value.getRed());
            protoAdapter.encodeWithTag(writer, 21, value.getSteelGrey());
            protoAdapter.encodeWithTag(writer, 22, value.getMetallicBlack());
            protoAdapter.encodeWithTag(writer, 23, value.getTitaniumCopper());
            protoAdapter.encodeWithTag(writer, 24, value.getSignatureBlue());
            protoAdapter.encodeWithTag(writer, 25, value.getMidnightCherryRed());
            protoAdapter.encodeWithTag(writer, 26, value.getQuicksilver());
            protoAdapter.encodeWithTag(writer, 27, value.getUltraRed());
            protoAdapter.encodeWithTag(writer, 28, value.getStealthGrey());
            protoAdapter.encodeWithTag(writer, 29, value.getLunarSilver());
            protoAdapter.encodeWithTag(writer, 30, value.getGlacierBlue());
            protoAdapter.encodeWithTag(writer, 31, value.getDiamondBlack());
            protoAdapter.encodeWithTag(writer, 32, value.getFrostBlue());
            protoAdapter.encodeWithTag(writer, 33, value.getSilkroadSilver());
            protoAdapter.encodeWithTag(writer, 34, value.getMarineBlue());
            protoAdapter.encodeWithTag(writer, 35, value.getGarnetRed());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<h0> protoAdapter = h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(3, value.getUnknown()) + protoAdapter.encodedSizeWithTag(4, value.getRedMulticoat()) + protoAdapter.encodedSizeWithTag(5, value.getSolidBlack()) + protoAdapter.encodedSizeWithTag(6, value.getSilverMetallic()) + protoAdapter.encodedSizeWithTag(7, value.getMidnightSilver()) + protoAdapter.encodedSizeWithTag(8, value.getDeepBlue()) + protoAdapter.encodedSizeWithTag(9, value.getPearlWhite()) + protoAdapter.encodedSizeWithTag(10, value.getDefaultColor()) + protoAdapter.encodedSizeWithTag(11, value.getBlack()) + protoAdapter.encodedSizeWithTag(12, value.getWhite()) + protoAdapter.encodedSizeWithTag(13, value.getSilver()) + protoAdapter.encodedSizeWithTag(14, value.getGrey()) + protoAdapter.encodedSizeWithTag(15, value.getBlue()) + protoAdapter.encodedSizeWithTag(16, value.getGreen()) + protoAdapter.encodedSizeWithTag(17, value.getBrown()) + protoAdapter.encodedSizeWithTag(18, value.getPearl()) + protoAdapter.encodedSizeWithTag(19, value.getSigRed()) + protoAdapter.encodedSizeWithTag(20, value.getRed()) + protoAdapter.encodedSizeWithTag(21, value.getSteelGrey()) + protoAdapter.encodedSizeWithTag(22, value.getMetallicBlack()) + protoAdapter.encodedSizeWithTag(23, value.getTitaniumCopper()) + protoAdapter.encodedSizeWithTag(24, value.getSignatureBlue()) + protoAdapter.encodedSizeWithTag(25, value.getMidnightCherryRed()) + protoAdapter.encodedSizeWithTag(26, value.getQuicksilver()) + protoAdapter.encodedSizeWithTag(27, value.getUltraRed()) + protoAdapter.encodedSizeWithTag(28, value.getStealthGrey()) + protoAdapter.encodedSizeWithTag(29, value.getLunarSilver()) + protoAdapter.encodedSizeWithTag(30, value.getGlacierBlue()) + protoAdapter.encodedSizeWithTag(31, value.getDiamondBlack()) + protoAdapter.encodedSizeWithTag(32, value.getFrostBlue()) + protoAdapter.encodedSizeWithTag(33, value.getSilkroadSilver()) + protoAdapter.encodedSizeWithTag(34, value.getMarineBlue()) + protoAdapter.encodedSizeWithTag(35, value.getGarnetRed());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k redact(k value) {
            h0 h0Var;
            h0 h0Var2;
            h0 h0VarRedact;
            p013kotlin.jvm.internal.s.k(value, "value");
            h0 unknown = value.getUnknown();
            h0 h0VarRedact2 = unknown != null ? h0.f62622b.redact(unknown) : null;
            h0 redMulticoat = value.getRedMulticoat();
            h0 h0VarRedact3 = redMulticoat != null ? h0.f62622b.redact(redMulticoat) : null;
            h0 solidBlack = value.getSolidBlack();
            h0 h0VarRedact4 = solidBlack != null ? h0.f62622b.redact(solidBlack) : null;
            h0 silverMetallic = value.getSilverMetallic();
            h0 h0VarRedact5 = silverMetallic != null ? h0.f62622b.redact(silverMetallic) : null;
            h0 midnightSilver = value.getMidnightSilver();
            h0 h0VarRedact6 = midnightSilver != null ? h0.f62622b.redact(midnightSilver) : null;
            h0 deepBlue = value.getDeepBlue();
            h0 h0VarRedact7 = deepBlue != null ? h0.f62622b.redact(deepBlue) : null;
            h0 pearlWhite = value.getPearlWhite();
            h0 h0VarRedact8 = pearlWhite != null ? h0.f62622b.redact(pearlWhite) : null;
            h0 defaultColor = value.getDefaultColor();
            h0 h0VarRedact9 = defaultColor != null ? h0.f62622b.redact(defaultColor) : null;
            h0 black = value.getBlack();
            h0 h0VarRedact10 = black != null ? h0.f62622b.redact(black) : null;
            h0 white = value.getWhite();
            h0 h0VarRedact11 = white != null ? h0.f62622b.redact(white) : null;
            h0 silver = value.getSilver();
            h0 h0VarRedact12 = silver != null ? h0.f62622b.redact(silver) : null;
            h0 grey = value.getGrey();
            h0 h0VarRedact13 = grey != null ? h0.f62622b.redact(grey) : null;
            h0 blue = value.getBlue();
            h0 h0VarRedact14 = blue != null ? h0.f62622b.redact(blue) : null;
            h0 green = value.getGreen();
            h0 h0VarRedact15 = green != null ? h0.f62622b.redact(green) : null;
            h0 brown = value.getBrown();
            h0 h0Var3 = h0VarRedact2;
            h0 h0VarRedact16 = brown != null ? h0.f62622b.redact(brown) : null;
            h0 pearl = value.getPearl();
            h0 h0Var4 = h0VarRedact16;
            h0 h0VarRedact17 = pearl != null ? h0.f62622b.redact(pearl) : null;
            h0 sigRed = value.getSigRed();
            h0 h0Var5 = h0VarRedact17;
            h0 h0VarRedact18 = sigRed != null ? h0.f62622b.redact(sigRed) : null;
            h0 red = value.getRed();
            h0 h0Var6 = h0VarRedact18;
            h0 h0VarRedact19 = red != null ? h0.f62622b.redact(red) : null;
            h0 steelGrey = value.getSteelGrey();
            h0 h0Var7 = h0VarRedact19;
            h0 h0VarRedact20 = steelGrey != null ? h0.f62622b.redact(steelGrey) : null;
            h0 metallicBlack = value.getMetallicBlack();
            h0 h0Var8 = h0VarRedact20;
            h0 h0VarRedact21 = metallicBlack != null ? h0.f62622b.redact(metallicBlack) : null;
            h0 titaniumCopper = value.getTitaniumCopper();
            h0 h0Var9 = h0VarRedact21;
            h0 h0VarRedact22 = titaniumCopper != null ? h0.f62622b.redact(titaniumCopper) : null;
            h0 signatureBlue = value.getSignatureBlue();
            h0 h0Var10 = h0VarRedact22;
            h0 h0VarRedact23 = signatureBlue != null ? h0.f62622b.redact(signatureBlue) : null;
            h0 midnightCherryRed = value.getMidnightCherryRed();
            h0 h0Var11 = h0VarRedact23;
            h0 h0VarRedact24 = midnightCherryRed != null ? h0.f62622b.redact(midnightCherryRed) : null;
            h0 quicksilver = value.getQuicksilver();
            h0 h0Var12 = h0VarRedact24;
            h0 h0VarRedact25 = quicksilver != null ? h0.f62622b.redact(quicksilver) : null;
            h0 ultraRed = value.getUltraRed();
            h0 h0Var13 = h0VarRedact25;
            h0 h0VarRedact26 = ultraRed != null ? h0.f62622b.redact(ultraRed) : null;
            h0 stealthGrey = value.getStealthGrey();
            h0 h0Var14 = h0VarRedact26;
            h0 h0VarRedact27 = stealthGrey != null ? h0.f62622b.redact(stealthGrey) : null;
            h0 lunarSilver = value.getLunarSilver();
            h0 h0Var15 = h0VarRedact27;
            h0 h0VarRedact28 = lunarSilver != null ? h0.f62622b.redact(lunarSilver) : null;
            h0 glacierBlue = value.getGlacierBlue();
            h0 h0Var16 = h0VarRedact28;
            h0 h0VarRedact29 = glacierBlue != null ? h0.f62622b.redact(glacierBlue) : null;
            h0 diamondBlack = value.getDiamondBlack();
            h0 h0Var17 = h0VarRedact29;
            h0 h0VarRedact30 = diamondBlack != null ? h0.f62622b.redact(diamondBlack) : null;
            h0 frostBlue = value.getFrostBlue();
            h0 h0Var18 = h0VarRedact30;
            h0 h0VarRedact31 = frostBlue != null ? h0.f62622b.redact(frostBlue) : null;
            h0 silkroadSilver = value.getSilkroadSilver();
            h0 h0Var19 = h0VarRedact31;
            h0 h0VarRedact32 = silkroadSilver != null ? h0.f62622b.redact(silkroadSilver) : null;
            h0 marineBlue = value.getMarineBlue();
            h0 h0Var20 = h0VarRedact32;
            h0 h0VarRedact33 = marineBlue != null ? h0.f62622b.redact(marineBlue) : null;
            h0 garnetRed = value.getGarnetRed();
            if (garnetRed != null) {
                h0VarRedact = h0.f62622b.redact(garnetRed);
                h0Var2 = h0Var19;
                h0Var = h0VarRedact33;
            } else {
                h0Var = h0VarRedact33;
                h0Var2 = h0Var19;
                h0VarRedact = null;
            }
            return value.a(h0Var3, h0VarRedact3, h0VarRedact4, h0VarRedact5, h0VarRedact6, h0VarRedact7, h0VarRedact8, h0VarRedact9, h0VarRedact10, h0VarRedact11, h0VarRedact12, h0VarRedact13, h0VarRedact14, h0VarRedact15, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12, h0Var13, h0Var14, h0Var15, h0Var16, h0Var17, h0Var18, h0Var2, h0Var20, h0Var, h0VarRedact, okio.k.f97943e);
        }
    }

    public k() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final h0 getSilverMetallic() {
        return this.SilverMetallic;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final h0 getSolidBlack() {
        return this.SolidBlack;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final h0 getStealthGrey() {
        return this.StealthGrey;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final h0 getSteelGrey() {
        return this.SteelGrey;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final h0 getTitaniumCopper() {
        return this.TitaniumCopper;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final h0 getUltraRed() {
        return this.UltraRed;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final h0 getUnknown() {
        return this.Unknown;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final h0 getWhite() {
        return this.White;
    }

    public final k a(h0 Unknown, h0 RedMulticoat, h0 SolidBlack, h0 SilverMetallic, h0 MidnightSilver, h0 DeepBlue, h0 PearlWhite, h0 DefaultColor, h0 Black, h0 White, h0 Silver, h0 Grey, h0 Blue, h0 Green, h0 Brown, h0 Pearl, h0 SigRed, h0 Red, h0 SteelGrey, h0 MetallicBlack, h0 TitaniumCopper, h0 SignatureBlue, h0 MidnightCherryRed, h0 Quicksilver, h0 UltraRed, h0 StealthGrey, h0 LunarSilver, h0 GlacierBlue, h0 DiamondBlack, h0 FrostBlue, h0 SilkroadSilver, h0 MarineBlue, h0 GarnetRed, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new k(Unknown, RedMulticoat, SolidBlack, SilverMetallic, MidnightSilver, DeepBlue, PearlWhite, DefaultColor, Black, White, Silver, Grey, Blue, Green, Brown, Pearl, SigRed, Red, SteelGrey, MetallicBlack, TitaniumCopper, SignatureBlue, MidnightCherryRed, Quicksilver, UltraRed, StealthGrey, LunarSilver, GlacierBlue, DiamondBlack, FrostBlue, SilkroadSilver, MarineBlue, GarnetRed, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h0 getBlack() {
        return this.Black;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getBlue() {
        return this.Blue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getBrown() {
        return this.Brown;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getDeepBlue() {
        return this.DeepBlue;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), kVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Unknown, kVar.Unknown) && p013kotlin.jvm.internal.s.f(this.RedMulticoat, kVar.RedMulticoat) && p013kotlin.jvm.internal.s.f(this.SolidBlack, kVar.SolidBlack) && p013kotlin.jvm.internal.s.f(this.SilverMetallic, kVar.SilverMetallic) && p013kotlin.jvm.internal.s.f(this.MidnightSilver, kVar.MidnightSilver) && p013kotlin.jvm.internal.s.f(this.DeepBlue, kVar.DeepBlue) && p013kotlin.jvm.internal.s.f(this.PearlWhite, kVar.PearlWhite) && p013kotlin.jvm.internal.s.f(this.DefaultColor, kVar.DefaultColor) && p013kotlin.jvm.internal.s.f(this.Black, kVar.Black) && p013kotlin.jvm.internal.s.f(this.White, kVar.White) && p013kotlin.jvm.internal.s.f(this.Silver, kVar.Silver) && p013kotlin.jvm.internal.s.f(this.Grey, kVar.Grey) && p013kotlin.jvm.internal.s.f(this.Blue, kVar.Blue) && p013kotlin.jvm.internal.s.f(this.Green, kVar.Green) && p013kotlin.jvm.internal.s.f(this.Brown, kVar.Brown) && p013kotlin.jvm.internal.s.f(this.Pearl, kVar.Pearl) && p013kotlin.jvm.internal.s.f(this.SigRed, kVar.SigRed) && p013kotlin.jvm.internal.s.f(this.Red, kVar.Red) && p013kotlin.jvm.internal.s.f(this.SteelGrey, kVar.SteelGrey) && p013kotlin.jvm.internal.s.f(this.MetallicBlack, kVar.MetallicBlack) && p013kotlin.jvm.internal.s.f(this.TitaniumCopper, kVar.TitaniumCopper) && p013kotlin.jvm.internal.s.f(this.SignatureBlue, kVar.SignatureBlue) && p013kotlin.jvm.internal.s.f(this.MidnightCherryRed, kVar.MidnightCherryRed) && p013kotlin.jvm.internal.s.f(this.Quicksilver, kVar.Quicksilver) && p013kotlin.jvm.internal.s.f(this.UltraRed, kVar.UltraRed) && p013kotlin.jvm.internal.s.f(this.StealthGrey, kVar.StealthGrey) && p013kotlin.jvm.internal.s.f(this.LunarSilver, kVar.LunarSilver) && p013kotlin.jvm.internal.s.f(this.GlacierBlue, kVar.GlacierBlue) && p013kotlin.jvm.internal.s.f(this.DiamondBlack, kVar.DiamondBlack) && p013kotlin.jvm.internal.s.f(this.FrostBlue, kVar.FrostBlue) && p013kotlin.jvm.internal.s.f(this.SilkroadSilver, kVar.SilkroadSilver) && p013kotlin.jvm.internal.s.f(this.MarineBlue, kVar.MarineBlue) && p013kotlin.jvm.internal.s.f(this.GarnetRed, kVar.GarnetRed);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h0 getDefaultColor() {
        return this.DefaultColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final h0 getDiamondBlack() {
        return this.DiamondBlack;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h0 getFrostBlue() {
        return this.FrostBlue;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        h0 h0Var = this.Unknown;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        h0 h0Var2 = this.RedMulticoat;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        h0 h0Var3 = this.SolidBlack;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        h0 h0Var4 = this.SilverMetallic;
        int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        h0 h0Var5 = this.MidnightSilver;
        int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
        h0 h0Var6 = this.DeepBlue;
        int iHashCode7 = (iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0)) * 37;
        h0 h0Var7 = this.PearlWhite;
        int iHashCode8 = (iHashCode7 + (h0Var7 != null ? h0Var7.hashCode() : 0)) * 37;
        h0 h0Var8 = this.DefaultColor;
        int iHashCode9 = (iHashCode8 + (h0Var8 != null ? h0Var8.hashCode() : 0)) * 37;
        h0 h0Var9 = this.Black;
        int iHashCode10 = (iHashCode9 + (h0Var9 != null ? h0Var9.hashCode() : 0)) * 37;
        h0 h0Var10 = this.White;
        int iHashCode11 = (iHashCode10 + (h0Var10 != null ? h0Var10.hashCode() : 0)) * 37;
        h0 h0Var11 = this.Silver;
        int iHashCode12 = (iHashCode11 + (h0Var11 != null ? h0Var11.hashCode() : 0)) * 37;
        h0 h0Var12 = this.Grey;
        int iHashCode13 = (iHashCode12 + (h0Var12 != null ? h0Var12.hashCode() : 0)) * 37;
        h0 h0Var13 = this.Blue;
        int iHashCode14 = (iHashCode13 + (h0Var13 != null ? h0Var13.hashCode() : 0)) * 37;
        h0 h0Var14 = this.Green;
        int iHashCode15 = (iHashCode14 + (h0Var14 != null ? h0Var14.hashCode() : 0)) * 37;
        h0 h0Var15 = this.Brown;
        int iHashCode16 = (iHashCode15 + (h0Var15 != null ? h0Var15.hashCode() : 0)) * 37;
        h0 h0Var16 = this.Pearl;
        int iHashCode17 = (iHashCode16 + (h0Var16 != null ? h0Var16.hashCode() : 0)) * 37;
        h0 h0Var17 = this.SigRed;
        int iHashCode18 = (iHashCode17 + (h0Var17 != null ? h0Var17.hashCode() : 0)) * 37;
        h0 h0Var18 = this.Red;
        int iHashCode19 = (iHashCode18 + (h0Var18 != null ? h0Var18.hashCode() : 0)) * 37;
        h0 h0Var19 = this.SteelGrey;
        int iHashCode20 = (iHashCode19 + (h0Var19 != null ? h0Var19.hashCode() : 0)) * 37;
        h0 h0Var20 = this.MetallicBlack;
        int iHashCode21 = (iHashCode20 + (h0Var20 != null ? h0Var20.hashCode() : 0)) * 37;
        h0 h0Var21 = this.TitaniumCopper;
        int iHashCode22 = (iHashCode21 + (h0Var21 != null ? h0Var21.hashCode() : 0)) * 37;
        h0 h0Var22 = this.SignatureBlue;
        int iHashCode23 = (iHashCode22 + (h0Var22 != null ? h0Var22.hashCode() : 0)) * 37;
        h0 h0Var23 = this.MidnightCherryRed;
        int iHashCode24 = (iHashCode23 + (h0Var23 != null ? h0Var23.hashCode() : 0)) * 37;
        h0 h0Var24 = this.Quicksilver;
        int iHashCode25 = (iHashCode24 + (h0Var24 != null ? h0Var24.hashCode() : 0)) * 37;
        h0 h0Var25 = this.UltraRed;
        int iHashCode26 = (iHashCode25 + (h0Var25 != null ? h0Var25.hashCode() : 0)) * 37;
        h0 h0Var26 = this.StealthGrey;
        int iHashCode27 = (iHashCode26 + (h0Var26 != null ? h0Var26.hashCode() : 0)) * 37;
        h0 h0Var27 = this.LunarSilver;
        int iHashCode28 = (iHashCode27 + (h0Var27 != null ? h0Var27.hashCode() : 0)) * 37;
        h0 h0Var28 = this.GlacierBlue;
        int iHashCode29 = (iHashCode28 + (h0Var28 != null ? h0Var28.hashCode() : 0)) * 37;
        h0 h0Var29 = this.DiamondBlack;
        int iHashCode30 = (iHashCode29 + (h0Var29 != null ? h0Var29.hashCode() : 0)) * 37;
        h0 h0Var30 = this.FrostBlue;
        int iHashCode31 = (iHashCode30 + (h0Var30 != null ? h0Var30.hashCode() : 0)) * 37;
        h0 h0Var31 = this.SilkroadSilver;
        int iHashCode32 = (iHashCode31 + (h0Var31 != null ? h0Var31.hashCode() : 0)) * 37;
        h0 h0Var32 = this.MarineBlue;
        int iHashCode33 = (iHashCode32 + (h0Var32 != null ? h0Var32.hashCode() : 0)) * 37;
        h0 h0Var33 = this.GarnetRed;
        int iHashCode34 = iHashCode33 + (h0Var33 != null ? h0Var33.hashCode() : 0);
        this.hashCode = iHashCode34;
        return iHashCode34;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h0 getGarnetRed() {
        return this.GarnetRed;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h0 getGlacierBlue() {
        return this.GlacierBlue;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final h0 getGreen() {
        return this.Green;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final h0 getGrey() {
        return this.Grey;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final h0 getLunarSilver() {
        return this.LunarSilver;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final h0 getMarineBlue() {
        return this.MarineBlue;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m149newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final h0 getMetallicBlack() {
        return this.MetallicBlack;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final h0 getMidnightCherryRed() {
        return this.MidnightCherryRed;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final h0 getMidnightSilver() {
        return this.MidnightSilver;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final h0 getPearl() {
        return this.Pearl;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final h0 getPearlWhite() {
        return this.PearlWhite;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final h0 getQuicksilver() {
        return this.Quicksilver;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        h0 h0Var = this.Unknown;
        if (h0Var != null) {
            arrayList.add("Unknown=" + h0Var);
        }
        h0 h0Var2 = this.RedMulticoat;
        if (h0Var2 != null) {
            arrayList.add("RedMulticoat=" + h0Var2);
        }
        h0 h0Var3 = this.SolidBlack;
        if (h0Var3 != null) {
            arrayList.add("SolidBlack=" + h0Var3);
        }
        h0 h0Var4 = this.SilverMetallic;
        if (h0Var4 != null) {
            arrayList.add("SilverMetallic=" + h0Var4);
        }
        h0 h0Var5 = this.MidnightSilver;
        if (h0Var5 != null) {
            arrayList.add("MidnightSilver=" + h0Var5);
        }
        h0 h0Var6 = this.DeepBlue;
        if (h0Var6 != null) {
            arrayList.add("DeepBlue=" + h0Var6);
        }
        h0 h0Var7 = this.PearlWhite;
        if (h0Var7 != null) {
            arrayList.add("PearlWhite=" + h0Var7);
        }
        h0 h0Var8 = this.DefaultColor;
        if (h0Var8 != null) {
            arrayList.add("DefaultColor=" + h0Var8);
        }
        h0 h0Var9 = this.Black;
        if (h0Var9 != null) {
            arrayList.add("Black=" + h0Var9);
        }
        h0 h0Var10 = this.White;
        if (h0Var10 != null) {
            arrayList.add("White=" + h0Var10);
        }
        h0 h0Var11 = this.Silver;
        if (h0Var11 != null) {
            arrayList.add("Silver=" + h0Var11);
        }
        h0 h0Var12 = this.Grey;
        if (h0Var12 != null) {
            arrayList.add("Grey=" + h0Var12);
        }
        h0 h0Var13 = this.Blue;
        if (h0Var13 != null) {
            arrayList.add("Blue=" + h0Var13);
        }
        h0 h0Var14 = this.Green;
        if (h0Var14 != null) {
            arrayList.add("Green=" + h0Var14);
        }
        h0 h0Var15 = this.Brown;
        if (h0Var15 != null) {
            arrayList.add("Brown=" + h0Var15);
        }
        h0 h0Var16 = this.Pearl;
        if (h0Var16 != null) {
            arrayList.add("Pearl=" + h0Var16);
        }
        h0 h0Var17 = this.SigRed;
        if (h0Var17 != null) {
            arrayList.add("SigRed=" + h0Var17);
        }
        h0 h0Var18 = this.Red;
        if (h0Var18 != null) {
            arrayList.add("Red=" + h0Var18);
        }
        h0 h0Var19 = this.SteelGrey;
        if (h0Var19 != null) {
            arrayList.add("SteelGrey=" + h0Var19);
        }
        h0 h0Var20 = this.MetallicBlack;
        if (h0Var20 != null) {
            arrayList.add("MetallicBlack=" + h0Var20);
        }
        h0 h0Var21 = this.TitaniumCopper;
        if (h0Var21 != null) {
            arrayList.add("TitaniumCopper=" + h0Var21);
        }
        h0 h0Var22 = this.SignatureBlue;
        if (h0Var22 != null) {
            arrayList.add("SignatureBlue=" + h0Var22);
        }
        h0 h0Var23 = this.MidnightCherryRed;
        if (h0Var23 != null) {
            arrayList.add("MidnightCherryRed=" + h0Var23);
        }
        h0 h0Var24 = this.Quicksilver;
        if (h0Var24 != null) {
            arrayList.add("Quicksilver=" + h0Var24);
        }
        h0 h0Var25 = this.UltraRed;
        if (h0Var25 != null) {
            arrayList.add("UltraRed=" + h0Var25);
        }
        h0 h0Var26 = this.StealthGrey;
        if (h0Var26 != null) {
            arrayList.add("StealthGrey=" + h0Var26);
        }
        h0 h0Var27 = this.LunarSilver;
        if (h0Var27 != null) {
            arrayList.add("LunarSilver=" + h0Var27);
        }
        h0 h0Var28 = this.GlacierBlue;
        if (h0Var28 != null) {
            arrayList.add("GlacierBlue=" + h0Var28);
        }
        h0 h0Var29 = this.DiamondBlack;
        if (h0Var29 != null) {
            arrayList.add("DiamondBlack=" + h0Var29);
        }
        h0 h0Var30 = this.FrostBlue;
        if (h0Var30 != null) {
            arrayList.add("FrostBlue=" + h0Var30);
        }
        h0 h0Var31 = this.SilkroadSilver;
        if (h0Var31 != null) {
            arrayList.add("SilkroadSilver=" + h0Var31);
        }
        h0 h0Var32 = this.MarineBlue;
        if (h0Var32 != null) {
            arrayList.add("MarineBlue=" + h0Var32);
        }
        h0 h0Var33 = this.GarnetRed;
        if (h0Var33 != null) {
            arrayList.add("GarnetRed=" + h0Var33);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ExteriorColor{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final h0 getRed() {
        return this.Red;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final h0 getRedMulticoat() {
        return this.RedMulticoat;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final h0 getSigRed() {
        return this.SigRed;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final h0 getSignatureBlue() {
        return this.SignatureBlue;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final h0 getSilkroadSilver() {
        return this.SilkroadSilver;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final h0 getSilver() {
        return this.Silver;
    }

    public /* synthetic */ k(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, h0 h0Var10, h0 h0Var11, h0 h0Var12, h0 h0Var13, h0 h0Var14, h0 h0Var15, h0 h0Var16, h0 h0Var17, h0 h0Var18, h0 h0Var19, h0 h0Var20, h0 h0Var21, h0 h0Var22, h0 h0Var23, h0 h0Var24, h0 h0Var25, h0 h0Var26, h0 h0Var27, h0 h0Var28, h0 h0Var29, h0 h0Var30, h0 h0Var31, h0 h0Var32, h0 h0Var33, okio.k kVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? null : h0Var7, (i11 & 128) != 0 ? null : h0Var8, (i11 & 256) != 0 ? null : h0Var9, (i11 & 512) != 0 ? null : h0Var10, (i11 & 1024) != 0 ? null : h0Var11, (i11 & 2048) != 0 ? null : h0Var12, (i11 & 4096) != 0 ? null : h0Var13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : h0Var14, (i11 & 16384) != 0 ? null : h0Var15, (i11 & 32768) != 0 ? null : h0Var16, (i11 & 65536) != 0 ? null : h0Var17, (i11 & 131072) != 0 ? null : h0Var18, (i11 & 262144) != 0 ? null : h0Var19, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : h0Var20, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : h0Var21, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : h0Var22, (i11 & 4194304) != 0 ? null : h0Var23, (i11 & 8388608) != 0 ? null : h0Var24, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : h0Var25, (i11 & 33554432) != 0 ? null : h0Var26, (i11 & 67108864) != 0 ? null : h0Var27, (i11 & 134217728) != 0 ? null : h0Var28, (i11 & 268435456) != 0 ? null : h0Var29, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? null : h0Var30, (i11 & 1073741824) != 0 ? null : h0Var31, (i11 & Integer.MIN_VALUE) != 0 ? null : h0Var32, (i12 & 1) != 0 ? null : h0Var33, (i12 & 2) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m149newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h0 h0Var, h0 h0Var2, h0 h0Var3, h0 h0Var4, h0 h0Var5, h0 h0Var6, h0 h0Var7, h0 h0Var8, h0 h0Var9, h0 h0Var10, h0 h0Var11, h0 h0Var12, h0 h0Var13, h0 h0Var14, h0 h0Var15, h0 h0Var16, h0 h0Var17, h0 h0Var18, h0 h0Var19, h0 h0Var20, h0 h0Var21, h0 h0Var22, h0 h0Var23, h0 h0Var24, h0 h0Var25, h0 h0Var26, h0 h0Var27, h0 h0Var28, h0 h0Var29, h0 h0Var30, h0 h0Var31, h0 h0Var32, h0 h0Var33, okio.k unknownFields) {
        super(I, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.Unknown = h0Var;
        this.RedMulticoat = h0Var2;
        this.SolidBlack = h0Var3;
        this.SilverMetallic = h0Var4;
        this.MidnightSilver = h0Var5;
        this.DeepBlue = h0Var6;
        this.PearlWhite = h0Var7;
        this.DefaultColor = h0Var8;
        this.Black = h0Var9;
        this.White = h0Var10;
        this.Silver = h0Var11;
        this.Grey = h0Var12;
        this.Blue = h0Var13;
        this.Green = h0Var14;
        this.Brown = h0Var15;
        this.Pearl = h0Var16;
        this.SigRed = h0Var17;
        this.Red = h0Var18;
        this.SteelGrey = h0Var19;
        this.MetallicBlack = h0Var20;
        this.TitaniumCopper = h0Var21;
        this.SignatureBlue = h0Var22;
        this.MidnightCherryRed = h0Var23;
        this.Quicksilver = h0Var24;
        this.UltraRed = h0Var25;
        this.StealthGrey = h0Var26;
        this.LunarSilver = h0Var27;
        this.GlacierBlue = h0Var28;
        this.DiamondBlack = h0Var29;
        this.FrostBlue = h0Var30;
        this.SilkroadSilver = h0Var31;
        this.MarineBlue = h0Var32;
        this.GarnetRed = h0Var33;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12, h0Var13, h0Var14, h0Var15, h0Var16, h0Var17, h0Var18, h0Var19, h0Var20, h0Var21, h0Var22, h0Var23, h0Var24, h0Var25, h0Var26, h0Var27, h0Var28, h0Var29, h0Var30, h0Var31, h0Var32, h0Var33) > 1) {
            throw new IllegalArgumentException("At most one of Unknown, RedMulticoat, SolidBlack, SilverMetallic, MidnightSilver, DeepBlue, PearlWhite, DefaultColor, Black, White, Silver, Grey, Blue, Green, Brown, Pearl, SigRed, Red, SteelGrey, MetallicBlack, TitaniumCopper, SignatureBlue, MidnightCherryRed, Quicksilver, UltraRed, StealthGrey, LunarSilver, GlacierBlue, DiamondBlack, FrostBlue, SilkroadSilver, MarineBlue, GarnetRed may be non-null");
        }
    }
}
