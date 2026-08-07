package fc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\ba\u0018\u0000 z2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001SBû\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\b\b\u0002\u00104\u001a\u000203\u0012\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020605\u0012\b\b\u0002\u00109\u001a\u000208\u0012\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020:05\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\b\b\u0002\u0010?\u001a\u00020>\u0012\b\b\u0002\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0002H\u0017¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020>2\b\u0010G\u001a\u0004\u0018\u00010FH\u0096\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u000203H\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u000208H\u0016¢\u0006\u0004\bL\u0010MJ\u0081\u0003\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\b\b\u0002\u00104\u001a\u0002032\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u000206052\b\b\u0002\u00109\u001a\u0002082\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020:052\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020@¢\u0006\u0004\bN\u0010OR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010_\u001a\u0004\b`\u0010aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010f\u001a\u0004\bg\u0010hR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bi\u0010kR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010l\u001a\u0004\bm\u0010nR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\b[\u0010qR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010r\u001a\u0004\bs\u0010tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b`\u0010u\u001a\u0004\bv\u0010wR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010|\u001a\u0004\b}\u0010~R\u001f\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001f\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0081\u0001\u0010\u0083\u0001\u001a\u0005\b\u007f\u0010\u0084\u0001R \u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001f\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bm\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u0085\u0001\u0010\u008e\u0001R\u001e\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bs\u0010\u008f\u0001\u001a\u0005\bW\u0010\u0090\u0001R\u001f\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\bx\u0010\u0093\u0001R \u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001f\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bv\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\bb\u0010\u009c\u0001R\u001d\u00104\u001a\u0002038\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u009d\u0001\u001a\u0005\b\u0091\u0001\u0010KR\u001c\u00109\u001a\u0002088\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b}\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010MR \u0010=\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001d\u0010?\u001a\u00020>8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bd\u0010£\u0001\u001a\u0006\b\u009a\u0001\u0010¤\u0001R#\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0087\u0001\u0010¥\u0001\u001a\u0005\bo\u0010¦\u0001R$\u0010;\u001a\b\u0012\u0004\u0012\u00020:058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010¥\u0001\u001a\u0006\b\u008c\u0001\u0010¦\u0001¨\u0006§\u0001"}, d2 = {"Lfc0/u5;", "Lcom/squareup/wire/f;", "", "Lgc0/x;", "gui_settings", "Lgc0/o;", "charge_state", "Lgc0/q;", "climate_state", "Lgc0/u;", "drive_state", "Lgc0/a0;", "legacy_vehicle_state", "Lgc0/u0;", "vehicle_config", "Lgc0/e0;", "location_state", "Lgc0/r;", "closures_state", "Lgc0/l0;", "parked_accessory_state", "Lgc0/n;", "charge_schedule_state", "Lgc0/m0;", "preconditioning_schedule_state", "Lgc0/o0;", "soh_state", "Lgc0/a1;", "vehicle_state", "Lgc0/t0;", "tire_pressure_state", "Lgc0/i0;", "media_state", "Lgc0/g0;", "media_detail_state", "Lgc0/v0;", "vehicle_detail_state", "Lgc0/n0;", "software_update_state", "Lgc0/k0;", "parental_controls_state", "Lgc0/a;", "alert_state", "Lgc0/d0;", "light_show_state", "Lgc0/y0;", "vehicle_image_state", "Lgc0/r0;", "suspension_state", "Lgc0/p;", "child_presence_detection_state", "", "proto_json_version", "", "Lfc0/a0;", "encrypted_data", "", "upload_reason", "Lfc0/a3;", "piiKeyResponse", "Ldc0/b;", "wrapped_key", "", "supports_optional_fields", "Lokio/k;", "unknownFields", "<init>", "(Lgc0/x;Lgc0/o;Lgc0/q;Lgc0/u;Lgc0/a0;Lgc0/u0;Lgc0/e0;Lgc0/r;Lgc0/l0;Lgc0/n;Lgc0/m0;Lgc0/o0;Lgc0/a1;Lgc0/t0;Lgc0/i0;Lgc0/g0;Lgc0/v0;Lgc0/n0;Lgc0/k0;Lgc0/a;Lgc0/d0;Lgc0/y0;Lgc0/r0;Lgc0/p;ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ldc0/b;ZLokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lgc0/x;Lgc0/o;Lgc0/q;Lgc0/u;Lgc0/a0;Lgc0/u0;Lgc0/e0;Lgc0/r;Lgc0/l0;Lgc0/n;Lgc0/m0;Lgc0/o0;Lgc0/a1;Lgc0/t0;Lgc0/i0;Lgc0/g0;Lgc0/v0;Lgc0/n0;Lgc0/k0;Lgc0/a;Lgc0/d0;Lgc0/y0;Lgc0/r0;Lgc0/p;ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ldc0/b;ZLokio/k;)Lfc0/u5;", "Lgc0/x;", "k", "()Lgc0/x;", "b", "Lgc0/o;", "e", "()Lgc0/o;", "c", "Lgc0/q;", "g", "()Lgc0/q;", DateTokenConverter.CONVERTER_KEY, "Lgc0/u;", IntegerTokenConverter.CONVERTER_KEY, "()Lgc0/u;", "Lgc0/a0;", "l", "()Lgc0/a0;", "f", "Lgc0/u0;", "B", "()Lgc0/u0;", "Lgc0/e0;", "n", "()Lgc0/e0;", "h", "Lgc0/r;", "()Lgc0/r;", "Lgc0/l0;", "r", "()Lgc0/l0;", "j", "Lgc0/n;", "()Lgc0/n;", "Lgc0/m0;", "t", "()Lgc0/m0;", "Lgc0/o0;", "w", "()Lgc0/o0;", "m", "Lgc0/a1;", "E", "()Lgc0/a1;", "Lgc0/t0;", "z", "()Lgc0/t0;", "o", "Lgc0/i0;", "p", "()Lgc0/i0;", "Lgc0/g0;", "()Lgc0/g0;", "q", "Lgc0/v0;", "C", "()Lgc0/v0;", "Lgc0/n0;", "v", "()Lgc0/n0;", "s", "Lgc0/k0;", "()Lgc0/k0;", "Lgc0/a;", "()Lgc0/a;", "u", "Lgc0/d0;", "()Lgc0/d0;", "Lgc0/y0;", "D", "()Lgc0/y0;", "Lgc0/r0;", "y", "()Lgc0/r0;", "x", "Lgc0/p;", "()Lgc0/p;", "I", "Ljava/lang/String;", "A", "Ldc0/b;", Gender.FEMALE, "()Ldc0/b;", "Z", "()Z", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u5 extends com.squareup.wire.f {
    public static final ProtoAdapter<u5> F = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(u5.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.authd.EncryptedMessage#ADAPTER", jsonName = "wrappedKey", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 901)
    private final dc0.b wrapped_key;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsOptionalFields", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 999)
    private final boolean supports_optional_fields;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.EncryptedData#ADAPTER", jsonName = "encryptedData", label = com.squareup.wire.q.a.REPEATED, tag = 11)
    private final List<a0> encrypted_data;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.server.PiiKeyResponse#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 900)
    private final List<a3> piiKeyResponse;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuiSettings#ADAPTER", jsonName = "guiSettings", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final gc0.x gui_settings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeState#ADAPTER", jsonName = "chargeState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final gc0.o charge_state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState#ADAPTER", jsonName = "climateState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final gc0.q climate_state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.DriveState#ADAPTER", jsonName = "driveState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final gc0.u drive_state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LegacyVehicleState#ADAPTER", jsonName = "legacyVehicleState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final gc0.a0 legacy_vehicle_state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleConfig#ADAPTER", jsonName = "vehicleConfig", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final gc0.u0 vehicle_config;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LocationState#ADAPTER", jsonName = "locationState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final gc0.e0 location_state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClosuresState#ADAPTER", jsonName = "closuresState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final gc0.r closures_state;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ParkedAccessoryState#ADAPTER", jsonName = "parkedAccessoryState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final gc0.l0 parked_accessory_state;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChargeScheduleState#ADAPTER", jsonName = "chargeScheduleState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final gc0.n charge_schedule_state;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.PreconditioningScheduleState#ADAPTER", jsonName = "preconditioningScheduleState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 16)
    private final gc0.m0 preconditioning_schedule_state;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SohState#ADAPTER", jsonName = "sohState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 17)
    private final gc0.o0 soh_state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleState#ADAPTER", jsonName = "vehicleState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 18)
    private final gc0.a1 vehicle_state;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.TirePressureState#ADAPTER", jsonName = "tirePressureState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final gc0.t0 tire_pressure_state;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.MediaState#ADAPTER", jsonName = "mediaState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 20)
    private final gc0.i0 media_state;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.MediaDetailState#ADAPTER", jsonName = "mediaDetailState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 21)
    private final gc0.g0 media_detail_state;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleDetailState#ADAPTER", jsonName = "vehicleDetailState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 22)
    private final gc0.v0 vehicle_detail_state;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SoftwareUpdateState#ADAPTER", jsonName = "softwareUpdateState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 23)
    private final gc0.n0 software_update_state;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ParentalControlsState#ADAPTER", jsonName = "parentalControlsState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 24)
    private final gc0.k0 parental_controls_state;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.AlertState#ADAPTER", jsonName = "alertState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 25)
    private final gc0.a alert_state;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LightShowState#ADAPTER", jsonName = "lightShowState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 26)
    private final gc0.d0 light_show_state;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.VehicleImageState#ADAPTER", jsonName = "vehicleImageState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 27)
    private final gc0.y0 vehicle_image_state;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SuspensionState#ADAPTER", jsonName = "suspensionState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 29)
    private final gc0.r0 suspension_state;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ChildPresenceDetectionState#ADAPTER", jsonName = "childPresenceDetectionState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 30)
    private final gc0.p child_presence_detection_state;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "protoJsonVersion", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final int proto_json_version;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "uploadReason", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final String upload_reason;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"fc0/u5$a", "Lcom/squareup/wire/ProtoAdapter;", "Lfc0/u5;", "value", "", "c", "(Lfc0/u5;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lfc0/u5;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lfc0/u5;", DateTokenConverter.CONVERTER_KEY, "(Lfc0/u5;)Lfc0/u5;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<u5> {
        a(com.squareup.wire.b bVar, co0.d<u5> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleData", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public u5 decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long jD = reader.d();
            gc0.u uVarDecode = null;
            gc0.a0 a0VarDecode = null;
            gc0.u0 u0VarDecode = null;
            gc0.e0 e0VarDecode = null;
            gc0.r rVarDecode = null;
            gc0.l0 l0VarDecode = null;
            gc0.n nVarDecode = null;
            gc0.m0 m0VarDecode = null;
            gc0.o0 o0VarDecode = null;
            gc0.a1 a1VarDecode = null;
            gc0.t0 t0VarDecode = null;
            gc0.i0 i0VarDecode = null;
            gc0.g0 g0VarDecode = null;
            gc0.v0 v0VarDecode = null;
            gc0.n0 n0VarDecode = null;
            gc0.k0 k0VarDecode = null;
            gc0.a aVarDecode = null;
            gc0.d0 d0VarDecode = null;
            gc0.y0 y0VarDecode = null;
            gc0.r0 r0VarDecode = null;
            gc0.p pVarDecode = null;
            dc0.b bVarDecode = null;
            gc0.x xVarDecode = null;
            int iIntValue = 0;
            boolean zBooleanValue = false;
            String strDecode = "";
            gc0.o oVarDecode = null;
            gc0.q qVarDecode = null;
            while (true) {
                int iG = reader.g();
                gc0.o oVar = oVarDecode;
                if (iG == -1) {
                    return new u5(xVarDecode, oVar, qVarDecode, uVarDecode, a0VarDecode, u0VarDecode, e0VarDecode, rVarDecode, l0VarDecode, nVarDecode, m0VarDecode, o0VarDecode, a1VarDecode, t0VarDecode, i0VarDecode, g0VarDecode, v0VarDecode, n0VarDecode, k0VarDecode, aVarDecode, d0VarDecode, y0VarDecode, r0VarDecode, pVarDecode, iIntValue, arrayList, strDecode, arrayList2, bVarDecode, zBooleanValue, reader.e(jD));
                }
                if (iG == 29) {
                    r0VarDecode = gc0.r0.f68439j.decode(reader);
                } else if (iG == 30) {
                    pVarDecode = gc0.p.f68297f.decode(reader);
                } else if (iG == 900) {
                    arrayList2.add(a3.f64864e.decode(reader));
                } else if (iG == 901) {
                    bVarDecode = dc0.b.f60442e.decode(reader);
                } else if (iG != 999) {
                    switch (iG) {
                        case 2:
                            xVarDecode = gc0.x.f68673m.decode(reader);
                            break;
                        case 3:
                            oVarDecode = gc0.o.f68166a2.decode(reader);
                            continue;
                        case 4:
                            qVarDecode = gc0.q.M0.decode(reader);
                            break;
                        case 5:
                            uVarDecode = gc0.u.f68505x.decode(reader);
                            break;
                        case 6:
                            a0VarDecode = gc0.a0.f67862n1.decode(reader);
                            break;
                        case 7:
                            u0VarDecode = gc0.u0.U1.decode(reader);
                            break;
                        case 8:
                            e0VarDecode = gc0.e0.K.decode(reader);
                            break;
                        case 9:
                            rVarDecode = gc0.r.V.decode(reader);
                            break;
                        case 10:
                            iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            break;
                        case 11:
                            arrayList.add(a0.f64849e.decode(reader));
                            break;
                        case 12:
                            strDecode = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            switch (iG) {
                                case 14:
                                    l0VarDecode = gc0.l0.f68106r.decode(reader);
                                    break;
                                case 15:
                                    nVarDecode = gc0.n.f68133i.decode(reader);
                                    break;
                                case 16:
                                    m0VarDecode = gc0.m0.f68126g.decode(reader);
                                    break;
                                case 17:
                                    o0VarDecode = gc0.o0.f68268f.decode(reader);
                                    break;
                                case 18:
                                    a1VarDecode = gc0.a1.f67923l0.decode(reader);
                                    break;
                                case 19:
                                    t0VarDecode = gc0.t0.K0.decode(reader);
                                    break;
                                case 20:
                                    i0VarDecode = gc0.i0.f68069k.decode(reader);
                                    break;
                                case 21:
                                    g0VarDecode = gc0.g0.f68052l.decode(reader);
                                    break;
                                case 22:
                                    v0VarDecode = gc0.v0.f68653j.decode(reader);
                                    break;
                                case 23:
                                    n0VarDecode = gc0.n0.f68142q.decode(reader);
                                    break;
                                case 24:
                                    k0VarDecode = gc0.k0.f68098f.decode(reader);
                                    break;
                                case 25:
                                    aVarDecode = gc0.a.f67858d.decode(reader);
                                    break;
                                case 26:
                                    d0VarDecode = gc0.d0.f67995g.decode(reader);
                                    break;
                                case 27:
                                    y0VarDecode = gc0.y0.f68725d.decode(reader);
                                    break;
                                default:
                                    reader.m(iG);
                                    break;
                            }
                            break;
                    }
                } else {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                }
                oVarDecode = oVar;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, u5 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getGui_settings() != null) {
                gc0.x.f68673m.encodeWithTag(writer, 2, value.getGui_settings());
            }
            if (value.getCharge_state() != null) {
                gc0.o.f68166a2.encodeWithTag(writer, 3, value.getCharge_state());
            }
            if (value.getClimate_state() != null) {
                gc0.q.M0.encodeWithTag(writer, 4, value.getClimate_state());
            }
            if (value.getDrive_state() != null) {
                gc0.u.f68505x.encodeWithTag(writer, 5, value.getDrive_state());
            }
            if (value.getLegacy_vehicle_state() != null) {
                gc0.a0.f67862n1.encodeWithTag(writer, 6, value.getLegacy_vehicle_state());
            }
            if (value.getVehicle_config() != null) {
                gc0.u0.U1.encodeWithTag(writer, 7, value.getVehicle_config());
            }
            if (value.getLocation_state() != null) {
                gc0.e0.K.encodeWithTag(writer, 8, value.getLocation_state());
            }
            if (value.getClosures_state() != null) {
                gc0.r.V.encodeWithTag(writer, 9, value.getClosures_state());
            }
            if (value.getParked_accessory_state() != null) {
                gc0.l0.f68106r.encodeWithTag(writer, 14, value.getParked_accessory_state());
            }
            if (value.getCharge_schedule_state() != null) {
                gc0.n.f68133i.encodeWithTag(writer, 15, value.getCharge_schedule_state());
            }
            if (value.getPreconditioning_schedule_state() != null) {
                gc0.m0.f68126g.encodeWithTag(writer, 16, value.getPreconditioning_schedule_state());
            }
            if (value.getSoh_state() != null) {
                gc0.o0.f68268f.encodeWithTag(writer, 17, value.getSoh_state());
            }
            if (value.getVehicle_state() != null) {
                gc0.a1.f67923l0.encodeWithTag(writer, 18, value.getVehicle_state());
            }
            if (value.getTire_pressure_state() != null) {
                gc0.t0.K0.encodeWithTag(writer, 19, value.getTire_pressure_state());
            }
            if (value.getMedia_state() != null) {
                gc0.i0.f68069k.encodeWithTag(writer, 20, value.getMedia_state());
            }
            if (value.getMedia_detail_state() != null) {
                gc0.g0.f68052l.encodeWithTag(writer, 21, value.getMedia_detail_state());
            }
            if (value.getVehicle_detail_state() != null) {
                gc0.v0.f68653j.encodeWithTag(writer, 22, value.getVehicle_detail_state());
            }
            if (value.getSoftware_update_state() != null) {
                gc0.n0.f68142q.encodeWithTag(writer, 23, value.getSoftware_update_state());
            }
            if (value.getParental_controls_state() != null) {
                gc0.k0.f68098f.encodeWithTag(writer, 24, value.getParental_controls_state());
            }
            if (value.getAlert_state() != null) {
                gc0.a.f67858d.encodeWithTag(writer, 25, value.getAlert_state());
            }
            if (value.getLight_show_state() != null) {
                gc0.d0.f67995g.encodeWithTag(writer, 26, value.getLight_show_state());
            }
            if (value.getVehicle_image_state() != null) {
                gc0.y0.f68725d.encodeWithTag(writer, 27, value.getVehicle_image_state());
            }
            if (value.getSuspension_state() != null) {
                gc0.r0.f68439j.encodeWithTag(writer, 29, value.getSuspension_state());
            }
            if (value.getChild_presence_detection_state() != null) {
                gc0.p.f68297f.encodeWithTag(writer, 30, value.getChild_presence_detection_state());
            }
            if (value.getProto_json_version() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 10, Integer.valueOf(value.getProto_json_version()));
            }
            a0.f64849e.asRepeated().encodeWithTag(writer, 11, value.j());
            if (!p013kotlin.jvm.internal.s.f(value.getUpload_reason(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 12, value.getUpload_reason());
            }
            a3.f64864e.asRepeated().encodeWithTag(writer, 900, value.s());
            if (value.getWrapped_key() != null) {
                dc0.b.f60442e.encodeWithTag(writer, 901, value.getWrapped_key());
            }
            if (value.getSupports_optional_fields()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 999, Boolean.valueOf(value.getSupports_optional_fields()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(u5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getGui_settings() != null) {
                iD += gc0.x.f68673m.encodedSizeWithTag(2, value.getGui_settings());
            }
            if (value.getCharge_state() != null) {
                iD += gc0.o.f68166a2.encodedSizeWithTag(3, value.getCharge_state());
            }
            if (value.getClimate_state() != null) {
                iD += gc0.q.M0.encodedSizeWithTag(4, value.getClimate_state());
            }
            if (value.getDrive_state() != null) {
                iD += gc0.u.f68505x.encodedSizeWithTag(5, value.getDrive_state());
            }
            if (value.getLegacy_vehicle_state() != null) {
                iD += gc0.a0.f67862n1.encodedSizeWithTag(6, value.getLegacy_vehicle_state());
            }
            if (value.getVehicle_config() != null) {
                iD += gc0.u0.U1.encodedSizeWithTag(7, value.getVehicle_config());
            }
            if (value.getLocation_state() != null) {
                iD += gc0.e0.K.encodedSizeWithTag(8, value.getLocation_state());
            }
            if (value.getClosures_state() != null) {
                iD += gc0.r.V.encodedSizeWithTag(9, value.getClosures_state());
            }
            if (value.getParked_accessory_state() != null) {
                iD += gc0.l0.f68106r.encodedSizeWithTag(14, value.getParked_accessory_state());
            }
            if (value.getCharge_schedule_state() != null) {
                iD += gc0.n.f68133i.encodedSizeWithTag(15, value.getCharge_schedule_state());
            }
            if (value.getPreconditioning_schedule_state() != null) {
                iD += gc0.m0.f68126g.encodedSizeWithTag(16, value.getPreconditioning_schedule_state());
            }
            if (value.getSoh_state() != null) {
                iD += gc0.o0.f68268f.encodedSizeWithTag(17, value.getSoh_state());
            }
            if (value.getVehicle_state() != null) {
                iD += gc0.a1.f67923l0.encodedSizeWithTag(18, value.getVehicle_state());
            }
            if (value.getTire_pressure_state() != null) {
                iD += gc0.t0.K0.encodedSizeWithTag(19, value.getTire_pressure_state());
            }
            if (value.getMedia_state() != null) {
                iD += gc0.i0.f68069k.encodedSizeWithTag(20, value.getMedia_state());
            }
            if (value.getMedia_detail_state() != null) {
                iD += gc0.g0.f68052l.encodedSizeWithTag(21, value.getMedia_detail_state());
            }
            if (value.getVehicle_detail_state() != null) {
                iD += gc0.v0.f68653j.encodedSizeWithTag(22, value.getVehicle_detail_state());
            }
            if (value.getSoftware_update_state() != null) {
                iD += gc0.n0.f68142q.encodedSizeWithTag(23, value.getSoftware_update_state());
            }
            if (value.getParental_controls_state() != null) {
                iD += gc0.k0.f68098f.encodedSizeWithTag(24, value.getParental_controls_state());
            }
            if (value.getAlert_state() != null) {
                iD += gc0.a.f67858d.encodedSizeWithTag(25, value.getAlert_state());
            }
            if (value.getLight_show_state() != null) {
                iD += gc0.d0.f67995g.encodedSizeWithTag(26, value.getLight_show_state());
            }
            if (value.getVehicle_image_state() != null) {
                iD += gc0.y0.f68725d.encodedSizeWithTag(27, value.getVehicle_image_state());
            }
            if (value.getSuspension_state() != null) {
                iD += gc0.r0.f68439j.encodedSizeWithTag(29, value.getSuspension_state());
            }
            if (value.getChild_presence_detection_state() != null) {
                iD += gc0.p.f68297f.encodedSizeWithTag(30, value.getChild_presence_detection_state());
            }
            if (value.getProto_json_version() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(10, Integer.valueOf(value.getProto_json_version()));
            }
            int iEncodedSizeWithTag = iD + a0.f64849e.asRepeated().encodedSizeWithTag(11, value.j());
            if (!p013kotlin.jvm.internal.s.f(value.getUpload_reason(), "")) {
                iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getUpload_reason());
            }
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + a3.f64864e.asRepeated().encodedSizeWithTag(900, value.s());
            if (value.getWrapped_key() != null) {
                iEncodedSizeWithTag2 += dc0.b.f60442e.encodedSizeWithTag(901, value.getWrapped_key());
            }
            return value.getSupports_optional_fields() ? iEncodedSizeWithTag2 + ProtoAdapter.BOOL.encodedSizeWithTag(999, Boolean.valueOf(value.getSupports_optional_fields())) : iEncodedSizeWithTag2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u5 redact(u5 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            gc0.x gui_settings = value.getGui_settings();
            gc0.x xVarRedact = gui_settings != null ? gc0.x.f68673m.redact(gui_settings) : null;
            gc0.o charge_state = value.getCharge_state();
            gc0.o oVarRedact = charge_state != null ? gc0.o.f68166a2.redact(charge_state) : null;
            gc0.q climate_state = value.getClimate_state();
            gc0.q qVarRedact = climate_state != null ? gc0.q.M0.redact(climate_state) : null;
            gc0.u drive_state = value.getDrive_state();
            gc0.u uVarRedact = drive_state != null ? gc0.u.f68505x.redact(drive_state) : null;
            gc0.a0 legacy_vehicle_state = value.getLegacy_vehicle_state();
            gc0.a0 a0VarRedact = legacy_vehicle_state != null ? gc0.a0.f67862n1.redact(legacy_vehicle_state) : null;
            gc0.u0 vehicle_config = value.getVehicle_config();
            gc0.u0 u0VarRedact = vehicle_config != null ? gc0.u0.U1.redact(vehicle_config) : null;
            gc0.e0 location_state = value.getLocation_state();
            gc0.e0 e0VarRedact = location_state != null ? gc0.e0.K.redact(location_state) : null;
            gc0.r closures_state = value.getClosures_state();
            gc0.r rVarRedact = closures_state != null ? gc0.r.V.redact(closures_state) : null;
            gc0.l0 parked_accessory_state = value.getParked_accessory_state();
            gc0.l0 l0VarRedact = parked_accessory_state != null ? gc0.l0.f68106r.redact(parked_accessory_state) : null;
            gc0.n charge_schedule_state = value.getCharge_schedule_state();
            gc0.n nVarRedact = charge_schedule_state != null ? gc0.n.f68133i.redact(charge_schedule_state) : null;
            gc0.m0 preconditioning_schedule_state = value.getPreconditioning_schedule_state();
            gc0.m0 m0VarRedact = preconditioning_schedule_state != null ? gc0.m0.f68126g.redact(preconditioning_schedule_state) : null;
            gc0.o0 soh_state = value.getSoh_state();
            gc0.o0 o0VarRedact = soh_state != null ? gc0.o0.f68268f.redact(soh_state) : null;
            gc0.a1 vehicle_state = value.getVehicle_state();
            gc0.a1 a1VarRedact = vehicle_state != null ? gc0.a1.f67923l0.redact(vehicle_state) : null;
            gc0.t0 tire_pressure_state = value.getTire_pressure_state();
            gc0.t0 t0VarRedact = tire_pressure_state != null ? gc0.t0.K0.redact(tire_pressure_state) : null;
            gc0.i0 media_state = value.getMedia_state();
            gc0.x xVar = xVarRedact;
            gc0.i0 i0VarRedact = media_state != null ? gc0.i0.f68069k.redact(media_state) : null;
            gc0.g0 media_detail_state = value.getMedia_detail_state();
            gc0.i0 i0Var = i0VarRedact;
            gc0.g0 g0VarRedact = media_detail_state != null ? gc0.g0.f68052l.redact(media_detail_state) : null;
            gc0.v0 vehicle_detail_state = value.getVehicle_detail_state();
            gc0.g0 g0Var = g0VarRedact;
            gc0.v0 v0VarRedact = vehicle_detail_state != null ? gc0.v0.f68653j.redact(vehicle_detail_state) : null;
            gc0.n0 software_update_state = value.getSoftware_update_state();
            gc0.v0 v0Var = v0VarRedact;
            gc0.n0 n0VarRedact = software_update_state != null ? gc0.n0.f68142q.redact(software_update_state) : null;
            gc0.k0 parental_controls_state = value.getParental_controls_state();
            gc0.n0 n0Var = n0VarRedact;
            gc0.k0 k0VarRedact = parental_controls_state != null ? gc0.k0.f68098f.redact(parental_controls_state) : null;
            gc0.a alert_state = value.getAlert_state();
            gc0.k0 k0Var = k0VarRedact;
            gc0.a aVarRedact = alert_state != null ? gc0.a.f67858d.redact(alert_state) : null;
            gc0.d0 light_show_state = value.getLight_show_state();
            gc0.a aVar = aVarRedact;
            gc0.d0 d0VarRedact = light_show_state != null ? gc0.d0.f67995g.redact(light_show_state) : null;
            gc0.y0 vehicle_image_state = value.getVehicle_image_state();
            gc0.d0 d0Var = d0VarRedact;
            gc0.y0 y0VarRedact = vehicle_image_state != null ? gc0.y0.f68725d.redact(vehicle_image_state) : null;
            gc0.r0 suspension_state = value.getSuspension_state();
            gc0.y0 y0Var = y0VarRedact;
            gc0.r0 r0VarRedact = suspension_state != null ? gc0.r0.f68439j.redact(suspension_state) : null;
            gc0.p child_presence_detection_state = value.getChild_presence_detection_state();
            gc0.r0 r0Var = r0VarRedact;
            gc0.p pVarRedact = child_presence_detection_state != null ? gc0.p.f68297f.redact(child_presence_detection_state) : null;
            List listA = x20.d.a(value.j(), a0.f64849e);
            List listA2 = x20.d.a(value.s(), a3.f64864e);
            dc0.b wrapped_key = value.getWrapped_key();
            return u5.b(value, xVar, oVarRedact, qVarRedact, uVarRedact, a0VarRedact, u0VarRedact, e0VarRedact, rVarRedact, l0VarRedact, nVarRedact, m0VarRedact, o0VarRedact, a1VarRedact, t0VarRedact, i0Var, g0Var, v0Var, n0Var, k0Var, aVar, d0Var, y0Var, r0Var, pVarRedact, 0, listA, null, listA2, wrapped_key != null ? dc0.b.f60442e.redact(wrapped_key) : null, false, okio.k.f97943e, 620756992, null);
        }
    }

    public u5() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, null, Integer.MAX_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u5 b(u5 u5Var, gc0.x xVar, gc0.o oVar, gc0.q qVar, gc0.u uVar, gc0.a0 a0Var, gc0.u0 u0Var, gc0.e0 e0Var, gc0.r rVar, gc0.l0 l0Var, gc0.n nVar, gc0.m0 m0Var, gc0.o0 o0Var, gc0.a1 a1Var, gc0.t0 t0Var, gc0.i0 i0Var, gc0.g0 g0Var, gc0.v0 v0Var, gc0.n0 n0Var, gc0.k0 k0Var, gc0.a aVar, gc0.d0 d0Var, gc0.y0 y0Var, gc0.r0 r0Var, gc0.p pVar, int i11, List list, String str, List list2, dc0.b bVar, boolean z11, okio.k kVar, int i12, Object obj) {
        return u5Var.a((i12 & 1) != 0 ? u5Var.gui_settings : xVar, (i12 & 2) != 0 ? u5Var.charge_state : oVar, (i12 & 4) != 0 ? u5Var.climate_state : qVar, (i12 & 8) != 0 ? u5Var.drive_state : uVar, (i12 & 16) != 0 ? u5Var.legacy_vehicle_state : a0Var, (i12 & 32) != 0 ? u5Var.vehicle_config : u0Var, (i12 & 64) != 0 ? u5Var.location_state : e0Var, (i12 & 128) != 0 ? u5Var.closures_state : rVar, (i12 & 256) != 0 ? u5Var.parked_accessory_state : l0Var, (i12 & 512) != 0 ? u5Var.charge_schedule_state : nVar, (i12 & 1024) != 0 ? u5Var.preconditioning_schedule_state : m0Var, (i12 & 2048) != 0 ? u5Var.soh_state : o0Var, (i12 & 4096) != 0 ? u5Var.vehicle_state : a1Var, (i12 & PKIFailureInfo.certRevoked) != 0 ? u5Var.tire_pressure_state : t0Var, (i12 & 16384) != 0 ? u5Var.media_state : i0Var, (i12 & 32768) != 0 ? u5Var.media_detail_state : g0Var, (i12 & 65536) != 0 ? u5Var.vehicle_detail_state : v0Var, (i12 & 131072) != 0 ? u5Var.software_update_state : n0Var, (i12 & 262144) != 0 ? u5Var.parental_controls_state : k0Var, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? u5Var.alert_state : aVar, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? u5Var.light_show_state : d0Var, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? u5Var.vehicle_image_state : y0Var, (i12 & 4194304) != 0 ? u5Var.suspension_state : r0Var, (i12 & 8388608) != 0 ? u5Var.child_presence_detection_state : pVar, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? u5Var.proto_json_version : i11, (i12 & 33554432) != 0 ? u5Var.encrypted_data : list, (i12 & 67108864) != 0 ? u5Var.upload_reason : str, (i12 & 134217728) != 0 ? u5Var.piiKeyResponse : list2, (i12 & 268435456) != 0 ? u5Var.wrapped_key : bVar, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? u5Var.supports_optional_fields : z11, (i12 & 1073741824) != 0 ? u5Var.unknownFields() : kVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getUpload_reason() {
        return this.upload_reason;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final gc0.u0 getVehicle_config() {
        return this.vehicle_config;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final gc0.v0 getVehicle_detail_state() {
        return this.vehicle_detail_state;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final gc0.y0 getVehicle_image_state() {
        return this.vehicle_image_state;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final gc0.a1 getVehicle_state() {
        return this.vehicle_state;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final dc0.b getWrapped_key() {
        return this.wrapped_key;
    }

    public final u5 a(gc0.x gui_settings, gc0.o charge_state, gc0.q climate_state, gc0.u drive_state, gc0.a0 legacy_vehicle_state, gc0.u0 vehicle_config, gc0.e0 location_state, gc0.r closures_state, gc0.l0 parked_accessory_state, gc0.n charge_schedule_state, gc0.m0 preconditioning_schedule_state, gc0.o0 soh_state, gc0.a1 vehicle_state, gc0.t0 tire_pressure_state, gc0.i0 media_state, gc0.g0 media_detail_state, gc0.v0 vehicle_detail_state, gc0.n0 software_update_state, gc0.k0 parental_controls_state, gc0.a alert_state, gc0.d0 light_show_state, gc0.y0 vehicle_image_state, gc0.r0 suspension_state, gc0.p child_presence_detection_state, int proto_json_version, List<a0> encrypted_data, String upload_reason, List<a3> piiKeyResponse, dc0.b wrapped_key, boolean supports_optional_fields, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(encrypted_data, "encrypted_data");
        p013kotlin.jvm.internal.s.k(upload_reason, "upload_reason");
        p013kotlin.jvm.internal.s.k(piiKeyResponse, "piiKeyResponse");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new u5(gui_settings, charge_state, climate_state, drive_state, legacy_vehicle_state, vehicle_config, location_state, closures_state, parked_accessory_state, charge_schedule_state, preconditioning_schedule_state, soh_state, vehicle_state, tire_pressure_state, media_state, media_detail_state, vehicle_detail_state, software_update_state, parental_controls_state, alert_state, light_show_state, vehicle_image_state, suspension_state, child_presence_detection_state, proto_json_version, encrypted_data, upload_reason, piiKeyResponse, wrapped_key, supports_optional_fields, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final gc0.a getAlert_state() {
        return this.alert_state;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final gc0.n getCharge_schedule_state() {
        return this.charge_schedule_state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final gc0.o getCharge_state() {
        return this.charge_state;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), u5Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.gui_settings, u5Var.gui_settings) && p013kotlin.jvm.internal.s.f(this.charge_state, u5Var.charge_state) && p013kotlin.jvm.internal.s.f(this.climate_state, u5Var.climate_state) && p013kotlin.jvm.internal.s.f(this.drive_state, u5Var.drive_state) && p013kotlin.jvm.internal.s.f(this.legacy_vehicle_state, u5Var.legacy_vehicle_state) && p013kotlin.jvm.internal.s.f(this.vehicle_config, u5Var.vehicle_config) && p013kotlin.jvm.internal.s.f(this.location_state, u5Var.location_state) && p013kotlin.jvm.internal.s.f(this.closures_state, u5Var.closures_state) && p013kotlin.jvm.internal.s.f(this.parked_accessory_state, u5Var.parked_accessory_state) && p013kotlin.jvm.internal.s.f(this.charge_schedule_state, u5Var.charge_schedule_state) && p013kotlin.jvm.internal.s.f(this.preconditioning_schedule_state, u5Var.preconditioning_schedule_state) && p013kotlin.jvm.internal.s.f(this.soh_state, u5Var.soh_state) && p013kotlin.jvm.internal.s.f(this.vehicle_state, u5Var.vehicle_state) && p013kotlin.jvm.internal.s.f(this.tire_pressure_state, u5Var.tire_pressure_state) && p013kotlin.jvm.internal.s.f(this.media_state, u5Var.media_state) && p013kotlin.jvm.internal.s.f(this.media_detail_state, u5Var.media_detail_state) && p013kotlin.jvm.internal.s.f(this.vehicle_detail_state, u5Var.vehicle_detail_state) && p013kotlin.jvm.internal.s.f(this.software_update_state, u5Var.software_update_state) && p013kotlin.jvm.internal.s.f(this.parental_controls_state, u5Var.parental_controls_state) && p013kotlin.jvm.internal.s.f(this.alert_state, u5Var.alert_state) && p013kotlin.jvm.internal.s.f(this.light_show_state, u5Var.light_show_state) && p013kotlin.jvm.internal.s.f(this.vehicle_image_state, u5Var.vehicle_image_state) && p013kotlin.jvm.internal.s.f(this.suspension_state, u5Var.suspension_state) && p013kotlin.jvm.internal.s.f(this.child_presence_detection_state, u5Var.child_presence_detection_state) && this.proto_json_version == u5Var.proto_json_version && p013kotlin.jvm.internal.s.f(this.encrypted_data, u5Var.encrypted_data) && p013kotlin.jvm.internal.s.f(this.upload_reason, u5Var.upload_reason) && p013kotlin.jvm.internal.s.f(this.piiKeyResponse, u5Var.piiKeyResponse) && p013kotlin.jvm.internal.s.f(this.wrapped_key, u5Var.wrapped_key) && this.supports_optional_fields == u5Var.supports_optional_fields;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final gc0.p getChild_presence_detection_state() {
        return this.child_presence_detection_state;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final gc0.q getClimate_state() {
        return this.climate_state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final gc0.r getClosures_state() {
        return this.closures_state;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        gc0.x xVar = this.gui_settings;
        int iHashCode2 = (iHashCode + (xVar != null ? xVar.hashCode() : 0)) * 37;
        gc0.o oVar = this.charge_state;
        int iHashCode3 = (iHashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 37;
        gc0.q qVar = this.climate_state;
        int iHashCode4 = (iHashCode3 + (qVar != null ? qVar.hashCode() : 0)) * 37;
        gc0.u uVar = this.drive_state;
        int iHashCode5 = (iHashCode4 + (uVar != null ? uVar.hashCode() : 0)) * 37;
        gc0.a0 a0Var = this.legacy_vehicle_state;
        int iHashCode6 = (iHashCode5 + (a0Var != null ? a0Var.hashCode() : 0)) * 37;
        gc0.u0 u0Var = this.vehicle_config;
        int iHashCode7 = (iHashCode6 + (u0Var != null ? u0Var.hashCode() : 0)) * 37;
        gc0.e0 e0Var = this.location_state;
        int iHashCode8 = (iHashCode7 + (e0Var != null ? e0Var.hashCode() : 0)) * 37;
        gc0.r rVar = this.closures_state;
        int iHashCode9 = (iHashCode8 + (rVar != null ? rVar.hashCode() : 0)) * 37;
        gc0.l0 l0Var = this.parked_accessory_state;
        int iHashCode10 = (iHashCode9 + (l0Var != null ? l0Var.hashCode() : 0)) * 37;
        gc0.n nVar = this.charge_schedule_state;
        int iHashCode11 = (iHashCode10 + (nVar != null ? nVar.hashCode() : 0)) * 37;
        gc0.m0 m0Var = this.preconditioning_schedule_state;
        int iHashCode12 = (iHashCode11 + (m0Var != null ? m0Var.hashCode() : 0)) * 37;
        gc0.o0 o0Var = this.soh_state;
        int iHashCode13 = (iHashCode12 + (o0Var != null ? o0Var.hashCode() : 0)) * 37;
        gc0.a1 a1Var = this.vehicle_state;
        int iHashCode14 = (iHashCode13 + (a1Var != null ? a1Var.hashCode() : 0)) * 37;
        gc0.t0 t0Var = this.tire_pressure_state;
        int iHashCode15 = (iHashCode14 + (t0Var != null ? t0Var.hashCode() : 0)) * 37;
        gc0.i0 i0Var = this.media_state;
        int iHashCode16 = (iHashCode15 + (i0Var != null ? i0Var.hashCode() : 0)) * 37;
        gc0.g0 g0Var = this.media_detail_state;
        int iHashCode17 = (iHashCode16 + (g0Var != null ? g0Var.hashCode() : 0)) * 37;
        gc0.v0 v0Var = this.vehicle_detail_state;
        int iHashCode18 = (iHashCode17 + (v0Var != null ? v0Var.hashCode() : 0)) * 37;
        gc0.n0 n0Var = this.software_update_state;
        int iHashCode19 = (iHashCode18 + (n0Var != null ? n0Var.hashCode() : 0)) * 37;
        gc0.k0 k0Var = this.parental_controls_state;
        int iHashCode20 = (iHashCode19 + (k0Var != null ? k0Var.hashCode() : 0)) * 37;
        gc0.a aVar = this.alert_state;
        int iHashCode21 = (iHashCode20 + (aVar != null ? aVar.hashCode() : 0)) * 37;
        gc0.d0 d0Var = this.light_show_state;
        int iHashCode22 = (iHashCode21 + (d0Var != null ? d0Var.hashCode() : 0)) * 37;
        gc0.y0 y0Var = this.vehicle_image_state;
        int iHashCode23 = (iHashCode22 + (y0Var != null ? y0Var.hashCode() : 0)) * 37;
        gc0.r0 r0Var = this.suspension_state;
        int iHashCode24 = (iHashCode23 + (r0Var != null ? r0Var.hashCode() : 0)) * 37;
        gc0.p pVar = this.child_presence_detection_state;
        int iHashCode25 = (((((((((iHashCode24 + (pVar != null ? pVar.hashCode() : 0)) * 37) + Integer.hashCode(this.proto_json_version)) * 37) + this.encrypted_data.hashCode()) * 37) + this.upload_reason.hashCode()) * 37) + this.piiKeyResponse.hashCode()) * 37;
        dc0.b bVar = this.wrapped_key;
        int iHashCode26 = ((iHashCode25 + (bVar != null ? bVar.hashCode() : 0)) * 37) + Boolean.hashCode(this.supports_optional_fields);
        this.hashCode = iHashCode26;
        return iHashCode26;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final gc0.u getDrive_state() {
        return this.drive_state;
    }

    public final List<a0> j() {
        return this.encrypted_data;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final gc0.x getGui_settings() {
        return this.gui_settings;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final gc0.a0 getLegacy_vehicle_state() {
        return this.legacy_vehicle_state;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final gc0.d0 getLight_show_state() {
        return this.light_show_state;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final gc0.e0 getLocation_state() {
        return this.location_state;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m348newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final gc0.g0 getMedia_detail_state() {
        return this.media_detail_state;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final gc0.i0 getMedia_state() {
        return this.media_state;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final gc0.k0 getParental_controls_state() {
        return this.parental_controls_state;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final gc0.l0 getParked_accessory_state() {
        return this.parked_accessory_state;
    }

    public final List<a3> s() {
        return this.piiKeyResponse;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final gc0.m0 getPreconditioning_schedule_state() {
        return this.preconditioning_schedule_state;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        gc0.x xVar = this.gui_settings;
        if (xVar != null) {
            arrayList.add("gui_settings=" + xVar);
        }
        gc0.o oVar = this.charge_state;
        if (oVar != null) {
            arrayList.add("charge_state=" + oVar);
        }
        gc0.q qVar = this.climate_state;
        if (qVar != null) {
            arrayList.add("climate_state=" + qVar);
        }
        gc0.u uVar = this.drive_state;
        if (uVar != null) {
            arrayList.add("drive_state=" + uVar);
        }
        gc0.a0 a0Var = this.legacy_vehicle_state;
        if (a0Var != null) {
            arrayList.add("legacy_vehicle_state=" + a0Var);
        }
        gc0.u0 u0Var = this.vehicle_config;
        if (u0Var != null) {
            arrayList.add("vehicle_config=" + u0Var);
        }
        gc0.e0 e0Var = this.location_state;
        if (e0Var != null) {
            arrayList.add("location_state=" + e0Var);
        }
        gc0.r rVar = this.closures_state;
        if (rVar != null) {
            arrayList.add("closures_state=" + rVar);
        }
        gc0.l0 l0Var = this.parked_accessory_state;
        if (l0Var != null) {
            arrayList.add("parked_accessory_state=" + l0Var);
        }
        gc0.n nVar = this.charge_schedule_state;
        if (nVar != null) {
            arrayList.add("charge_schedule_state=" + nVar);
        }
        gc0.m0 m0Var = this.preconditioning_schedule_state;
        if (m0Var != null) {
            arrayList.add("preconditioning_schedule_state=" + m0Var);
        }
        gc0.o0 o0Var = this.soh_state;
        if (o0Var != null) {
            arrayList.add("soh_state=" + o0Var);
        }
        gc0.a1 a1Var = this.vehicle_state;
        if (a1Var != null) {
            arrayList.add("vehicle_state=" + a1Var);
        }
        gc0.t0 t0Var = this.tire_pressure_state;
        if (t0Var != null) {
            arrayList.add("tire_pressure_state=" + t0Var);
        }
        gc0.i0 i0Var = this.media_state;
        if (i0Var != null) {
            arrayList.add("media_state=" + i0Var);
        }
        gc0.g0 g0Var = this.media_detail_state;
        if (g0Var != null) {
            arrayList.add("media_detail_state=" + g0Var);
        }
        gc0.v0 v0Var = this.vehicle_detail_state;
        if (v0Var != null) {
            arrayList.add("vehicle_detail_state=" + v0Var);
        }
        gc0.n0 n0Var = this.software_update_state;
        if (n0Var != null) {
            arrayList.add("software_update_state=" + n0Var);
        }
        gc0.k0 k0Var = this.parental_controls_state;
        if (k0Var != null) {
            arrayList.add("parental_controls_state=" + k0Var);
        }
        gc0.a aVar = this.alert_state;
        if (aVar != null) {
            arrayList.add("alert_state=" + aVar);
        }
        gc0.d0 d0Var = this.light_show_state;
        if (d0Var != null) {
            arrayList.add("light_show_state=" + d0Var);
        }
        gc0.y0 y0Var = this.vehicle_image_state;
        if (y0Var != null) {
            arrayList.add("vehicle_image_state=" + y0Var);
        }
        gc0.r0 r0Var = this.suspension_state;
        if (r0Var != null) {
            arrayList.add("suspension_state=" + r0Var);
        }
        gc0.p pVar = this.child_presence_detection_state;
        if (pVar != null) {
            arrayList.add("child_presence_detection_state=" + pVar);
        }
        arrayList.add("proto_json_version=" + this.proto_json_version);
        if (!this.encrypted_data.isEmpty()) {
            arrayList.add("encrypted_data=" + this.encrypted_data);
        }
        arrayList.add("upload_reason=" + x20.d.i(this.upload_reason));
        if (!this.piiKeyResponse.isEmpty()) {
            arrayList.add("piiKeyResponse=" + this.piiKeyResponse);
        }
        dc0.b bVar = this.wrapped_key;
        if (bVar != null) {
            arrayList.add("wrapped_key=" + bVar);
        }
        arrayList.add("supports_optional_fields=" + this.supports_optional_fields);
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleData{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getProto_json_version() {
        return this.proto_json_version;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final gc0.n0 getSoftware_update_state() {
        return this.software_update_state;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final gc0.o0 getSoh_state() {
        return this.soh_state;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getSupports_optional_fields() {
        return this.supports_optional_fields;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final gc0.r0 getSuspension_state() {
        return this.suspension_state;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final gc0.t0 getTire_pressure_state() {
        return this.tire_pressure_state;
    }

    public /* synthetic */ u5(gc0.x xVar, gc0.o oVar, gc0.q qVar, gc0.u uVar, gc0.a0 a0Var, gc0.u0 u0Var, gc0.e0 e0Var, gc0.r rVar, gc0.l0 l0Var, gc0.n nVar, gc0.m0 m0Var, gc0.o0 o0Var, gc0.a1 a1Var, gc0.t0 t0Var, gc0.i0 i0Var, gc0.g0 g0Var, gc0.v0 v0Var, gc0.n0 n0Var, gc0.k0 k0Var, gc0.a aVar, gc0.d0 d0Var, gc0.y0 y0Var, gc0.r0 r0Var, gc0.p pVar, int i11, List list, String str, List list2, dc0.b bVar, boolean z11, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : xVar, (i12 & 2) != 0 ? null : oVar, (i12 & 4) != 0 ? null : qVar, (i12 & 8) != 0 ? null : uVar, (i12 & 16) != 0 ? null : a0Var, (i12 & 32) != 0 ? null : u0Var, (i12 & 64) != 0 ? null : e0Var, (i12 & 128) != 0 ? null : rVar, (i12 & 256) != 0 ? null : l0Var, (i12 & 512) != 0 ? null : nVar, (i12 & 1024) != 0 ? null : m0Var, (i12 & 2048) != 0 ? null : o0Var, (i12 & 4096) != 0 ? null : a1Var, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : t0Var, (i12 & 16384) != 0 ? null : i0Var, (i12 & 32768) != 0 ? null : g0Var, (i12 & 65536) != 0 ? null : v0Var, (i12 & 131072) != 0 ? null : n0Var, (i12 & 262144) != 0 ? null : k0Var, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? null : aVar, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? null : d0Var, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? null : y0Var, (i12 & 4194304) != 0 ? null : r0Var, (i12 & 8388608) != 0 ? null : pVar, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? 0 : i11, (i12 & 33554432) != 0 ? p013kotlin.collections.v.m() : list, (i12 & 67108864) != 0 ? "" : str, (i12 & 134217728) != 0 ? p013kotlin.collections.v.m() : list2, (i12 & 268435456) != 0 ? null : bVar, (i12 & PKIFailureInfo.duplicateCertReq) == 0 ? z11 : false, (i12 & 1073741824) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m348newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(gc0.x xVar, gc0.o oVar, gc0.q qVar, gc0.u uVar, gc0.a0 a0Var, gc0.u0 u0Var, gc0.e0 e0Var, gc0.r rVar, gc0.l0 l0Var, gc0.n nVar, gc0.m0 m0Var, gc0.o0 o0Var, gc0.a1 a1Var, gc0.t0 t0Var, gc0.i0 i0Var, gc0.g0 g0Var, gc0.v0 v0Var, gc0.n0 n0Var, gc0.k0 k0Var, gc0.a aVar, gc0.d0 d0Var, gc0.y0 y0Var, gc0.r0 r0Var, gc0.p pVar, int i11, List<a0> encrypted_data, String upload_reason, List<a3> piiKeyResponse, dc0.b bVar, boolean z11, okio.k unknownFields) {
        super(F, unknownFields);
        p013kotlin.jvm.internal.s.k(encrypted_data, "encrypted_data");
        p013kotlin.jvm.internal.s.k(upload_reason, "upload_reason");
        p013kotlin.jvm.internal.s.k(piiKeyResponse, "piiKeyResponse");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.gui_settings = xVar;
        this.charge_state = oVar;
        this.climate_state = qVar;
        this.drive_state = uVar;
        this.legacy_vehicle_state = a0Var;
        this.vehicle_config = u0Var;
        this.location_state = e0Var;
        this.closures_state = rVar;
        this.parked_accessory_state = l0Var;
        this.charge_schedule_state = nVar;
        this.preconditioning_schedule_state = m0Var;
        this.soh_state = o0Var;
        this.vehicle_state = a1Var;
        this.tire_pressure_state = t0Var;
        this.media_state = i0Var;
        this.media_detail_state = g0Var;
        this.vehicle_detail_state = v0Var;
        this.software_update_state = n0Var;
        this.parental_controls_state = k0Var;
        this.alert_state = aVar;
        this.light_show_state = d0Var;
        this.vehicle_image_state = y0Var;
        this.suspension_state = r0Var;
        this.child_presence_detection_state = pVar;
        this.proto_json_version = i11;
        this.upload_reason = upload_reason;
        this.wrapped_key = bVar;
        this.supports_optional_fields = z11;
        this.encrypted_data = x20.d.g("encrypted_data", encrypted_data);
        this.piiKeyResponse = x20.d.g("piiKeyResponse", piiKeyResponse);
    }
}
