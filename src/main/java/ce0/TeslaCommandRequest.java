package ce0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.oapi.CommandActionExtensionsKt;
import ezvcard.property.Gender;
import fc0.g5;
import ic0.q;
import ie0.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import rc0.m;
import vc0.v2;
import wn0.p;

/* JADX INFO: renamed from: ce0.j, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 å\u00012\u00020\u0001:\u0001BB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0015\u001a\u00020\u0014*\u0004\u0018\u00010\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0014¢\u0006\u0004\b*\u0010\u001cJ\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010\u000fJ\u0019\u0010.\u001a\u00020\u00142\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0010¢\u0006\u0004\b1\u0010)J\u001f\u00104\u001a\u00020\u00142\u0006\u00102\u001a\u00020\r2\b\b\u0002\u00103\u001a\u00020\u001d¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0014¢\u0006\u0004\b6\u0010\u001cJ+\u00109\u001a\u00020\u00142\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001407j\u0002`8¢\u0006\u0004\b9\u0010:J%\u0010=\u001a\u00020\u00142\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140;j\u0002`<¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0014¢\u0006\u0004\b?\u0010\u001cJ\u0015\u0010A\u001a\u00020\u00142\u0006\u0010@\u001a\u00020,¢\u0006\u0004\bA\u0010/J\u0017\u0010B\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bB\u0010\u001aJ\u000f\u0010C\u001a\u00020\rH\u0016¢\u0006\u0004\bC\u0010\u000fJ\u001a\u0010F\u001a\u00020\u001d2\b\u0010E\u001a\u0004\u0018\u00010DH\u0096\u0002¢\u0006\u0004\bF\u0010GJG\u0010L\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t2\u0006\u0010@\u001a\u00020,2\b\b\u0002\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00102\u0006\u0010I\u001a\u00020\u00102\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bL\u0010MJB\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\bN\u0010OJ\u0010\u0010P\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010WR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b9\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b=\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010b\u001a\u00020^8\u0006¢\u0006\f\n\u0004\b!\u0010_\u001a\u0004\b`\u0010aR$\u0010h\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010o\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010s\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010p\u001a\u0004\bq\u0010Q\"\u0004\br\u0010)R\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00050t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010z\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010yR(\u0010~\u001a\u0004\u0018\u00010x2\b\u0010\u0011\u001a\u0004\u0018\u00010x8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b{\u0010y\u001a\u0004\b|\u0010}R\u0019\u0010\u0082\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R)\u0010\u0087\u0001\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R+\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010p\u001a\u0005\b\u0089\u0001\u0010QR\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R(\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010p\u001a\u0005\b\u008f\u0001\u0010Q\"\u0005\b\u0090\u0001\u0010)R\u001c\u0010\u0096\u0001\u001a\u00030\u0092\u00018\u0006¢\u0006\u000f\n\u0005\bd\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001d\u0010\u0099\u0001\u001a\u00030\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u0093\u0001\u001a\u0006\b\u0098\u0001\u0010\u0095\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0093\u0001R\u001b\u0010\u009e\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R(\u0010¡\u0001\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u009f\u0001\u0010\\\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001d\u0010£\u0001\u001a\u00030\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0093\u0001\u001a\u0006\b¢\u0001\u0010\u0095\u0001R'\u0010§\u0001\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0089\u0001\u0010_\u001a\u0005\b¤\u0001\u0010a\"\u0006\b¥\u0001\u0010¦\u0001R(\u0010ª\u0001\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¨\u0001\u0010\\\u001a\u0006\b©\u0001\u0010 \u0001R,\u00102\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u008c\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0018\u0010\u00ad\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\\R+\u0010±\u0001\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b®\u0001\u0010\u008c\u0001\u001a\u0006\b®\u0001\u0010¬\u0001\"\u0006\b¯\u0001\u0010°\u0001R.\u0010µ\u0001\u001a\u0019\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140;j\u0002`<0²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R4\u0010·\u0001\u001a\u001f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001407j\u0002`80²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010´\u0001R*\u0010¸\u0001\u001a\u0004\u0018\u00010x2\b\u0010\u0011\u001a\u0004\u0018\u00010x8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b|\u0010y\u001a\u0005\b³\u0001\u0010}R(\u0010»\u0001\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b¤\u0001\u0010\\\u001a\u0006\b\u0083\u0001\u0010 \u0001\"\u0006\b¹\u0001\u0010º\u0001R'\u0010¾\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bS\u0010p\u001a\u0005\b¼\u0001\u0010Q\"\u0005\b½\u0001\u0010)R-\u0010Á\u0001\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u008c\u0001\u001a\u0006\bÀ\u0001\u0010¬\u0001R)\u0010Æ\u0001\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÂ\u0001\u0010X\u001a\u0005\bÃ\u0001\u0010Z\"\u0006\bÄ\u0001\u0010Å\u0001R(\u0010Ê\u0001\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bÇ\u0001\u0010p\u001a\u0005\bÈ\u0001\u0010Q\"\u0005\bÉ\u0001\u0010)R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R\u001e\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010´\u0001R\u001c\u0010Õ\u0001\u001a\b\u0012\u0004\u0012\u00020,0t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bÔ\u0001\u0010vR\"\u0010Ù\u0001\u001a\t\u0012\u0005\u0012\u00030Ö\u00010t8\u0006¢\u0006\u000f\n\u0005\b×\u0001\u0010v\u001a\u0006\b\u008b\u0001\u0010Ø\u0001R+\u0010Ü\u0001\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÚ\u0001\u0010\u008c\u0001\u001a\u0006\bÌ\u0001\u0010¬\u0001\"\u0006\bÛ\u0001\u0010°\u0001R)\u0010á\u0001\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÝ\u0001\u0010y\u001a\u0005\bÞ\u0001\u0010}\"\u0006\bß\u0001\u0010à\u0001R)\u0010ä\u0001\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bÀ\u0001\u0010y\u001a\u0005\bâ\u0001\u0010}\"\u0006\bã\u0001\u0010à\u0001R\u0014\u0010æ\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\bå\u0001\u0010 \u0001R\u0013\u0010è\u0001\u001a\u00020\r8F¢\u0006\u0007\u001a\u0005\bç\u0001\u0010\u000fR\u0013\u0010é\u0001\u001a\u00020\r8F¢\u0006\u0007\u001a\u0005\b×\u0001\u0010\u000fR\u0015\u0010ì\u0001\u001a\u00030ê\u00018F¢\u0006\b\u001a\u0006\b¿\u0001\u0010ë\u0001R\u0013\u0010í\u0001\u001a\u00020\u00108F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010QR\u0013\u0010î\u0001\u001a\u00020\u00108F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010QR\u0013\u0010ï\u0001\u001a\u00020\r8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010\u000fR\u0013\u0010ð\u0001\u001a\u00020\u00108F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010QR\u0014\u0010ò\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\bñ\u0001\u0010 \u0001R\u0013\u0010ô\u0001\u001a\u00020\u00108F¢\u0006\u0007\u001a\u0005\bó\u0001\u0010QR\u0014\u0010÷\u0001\u001a\u00030õ\u00018F¢\u0006\u0007\u001a\u0005\b{\u0010ö\u0001R\u0015\u0010ø\u0001\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010QR\u0014\u0010ù\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\bÔ\u0001\u0010 \u0001R\u0015\u0010ý\u0001\u001a\u00030ú\u00018F¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001R\u0014\u0010ÿ\u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\bþ\u0001\u0010 \u0001R\u0014\u0010\u0081\u0002\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010 \u0001R\u0014\u0010\u0083\u0002\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010 \u0001R\u0014\u0010\u0085\u0002\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010 \u0001R\u0014\u0010\u0087\u0002\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010 \u0001R\u0014\u0010\u0089\u0002\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0088\u0002\u0010 \u0001R\u0016\u0010\u008a\u0002\u001a\u0004\u0018\u00010\r8F¢\u0006\b\u001a\u0006\b¨\u0001\u0010¬\u0001R\u0016\u0010\u008b\u0002\u001a\u0004\u0018\u00010\r8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010¬\u0001R\u0015\u0010\u008c\u0002\u001a\u0004\u0018\u00010x8F¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010}R\u0015\u0010\u008d\u0002\u001a\u0004\u0018\u00010x8F¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010}R\u0015\u0010\u008f\u0002\u001a\u0004\u0018\u00010x8F¢\u0006\u0007\u001a\u0005\b\u008e\u0002\u0010}R\u0014\u0010\u0091\u0002\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0090\u0002\u0010 \u0001R\u0015\u0010\u0094\u0002\u001a\u00030\u0092\u00028F¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0093\u0002R\u0014\u0010\u0096\u0002\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010 \u0001R\u001b\u0010\u0099\u0002\u001a\t\u0012\u0004\u0012\u00020,0\u0097\u00028F¢\u0006\b\u001a\u0006\bÚ\u0001\u0010\u0098\u0002R\u0015\u0010\u009a\u0002\u001a\u0004\u0018\u00010x8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010}¨\u0006\u009b\u0002"}, d2 = {"Lce0/j;", "Lce0/d;", "Lic0/e;", "request", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lce0/g;", "requestId", "", "sourcePublicKey", "Lic0/q;", "transport", "<init>", "(Lic0/e;Lce0/d;Lce0/g;[BLic0/q;)V", "", "v0", "()I", "", "value", "Lcom/tesla/logging/d;", "logLevel", "Ljn0/h0;", "r0", "(Lce0/j;Ljava/lang/String;Lcom/tesla/logging/d;)V", "Lic0/g;", "response", "O0", "(Lic0/g;)V", "t0", "()V", "", "supportsBluetoothRoutableCommands", "", "featuresBitmask", "f", "(ZLjava/util/List;)Z", "Lic0/j;", "state", "w0", "(Lic0/j;)V", "breadcrumb", "c", "(Ljava/lang/String;)V", "x0", "h0", "Lic0/h;", "commandResult", "i0", "(Lic0/h;)V", "vehicleState", "u0", "timeoutSeconds", "resetTimeout", "K0", "(IZ)V", "N0", "Lkotlin/Function2;", "Lcom/tesla/requestmanager/FinishListener;", DateTokenConverter.CONVERTER_KEY, "(Lwn0/p;)V", "Lkotlin/Function1;", "Lcom/tesla/requestmanager/TimeoutListener;", "e", "(Lwn0/l;)V", "s0", "result", "k", "a", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "resultReason", "currentConnectivityState", "Ljc0/a;", "nominalError", "g", "(Lic0/q;Lic0/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljc0/a;)Lic0/g;", IntegerTokenConverter.CONVERTER_KEY, "(Lic0/e;Lce0/d;Lce0/g;[BLic0/q;)Lce0/j;", "toString", "()Ljava/lang/String;", "Lic0/e;", "G", "()Lic0/e;", "b", "Lce0/d;", "Lce0/g;", "[B", "V", "()[B", "Lic0/q;", "Z", "()Lic0/q;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d0", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "vehicleHasResponseCacheFeature", "Lce0/j;", "r", "()Lce0/j;", "z0", "(Lce0/j;)V", "dependentCommand", "h", "Ljava/lang/Boolean;", "k0", "()Ljava/lang/Boolean;", "A0", "(Ljava/lang/Boolean;)V", "isLegacyBle", "Ljava/lang/String;", "f0", "setVin", "vin", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "j", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "_previousRequestIds", "", "Ljava/lang/Long;", "sentTimeMillis", "l", "E", "()Ljava/lang/Long;", "receivedResponseTimeMillis", "Lam0/b;", "m", "Lam0/b;", "timeout", "n", "Lic0/j;", "w", "()Lic0/j;", "hermesState", "o", "x", "initialVehicleState", "p", "Ljava/lang/Integer;", "timeoutStartedAtSeconds", "q", "getSessionInfoRequestId", "G0", "sessionInfoRequestId", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "A", "()Ljava/util/concurrent/atomic/AtomicInteger;", "nominalRetryCount", "s", "Y", "totalRetryCount", "t", "_resentCount", "u", "Lic0/h;", "finishedResult", "v", "()Z", "finished", "z", "loggedCount", Gender.FEMALE, "setRefetchedSessionInfoForNewSignature", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "refetchedSessionInfoForNewSignature", "y", "X", "timeoutStarted", "W", "()Ljava/lang/Integer;", "timeoutOccurred", "B", "B0", "(Ljava/lang/Integer;)V", "oapiStatusCode", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "C", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "timeoutListeners", "D", "finishListeners", "receivedByTransportMillis", "y0", "(Z)V", "blockedOnSessionInfo", "S", "H0", "sessionInfoResult", "H", "Q", "secondsRemainingWhenSent", "I", "L", "E0", "([B)V", "requestTag", "J", "e0", "J0", "vehicleKeyHex", "Lrc0/m;", "K", "Lrc0/m;", "getSignatureData", "()Lrc0/m;", "I0", "(Lrc0/m;)V", SignResponseData.JSON_RESPONSE_DATA_SIGNATURE_DATA, "_breadcrumbs", Gender.MALE, "_retryResults", "", Gender.NONE, "()Ljava/util/concurrent/ConcurrentLinkedDeque;", "commandBeforeSendingSeconds", Gender.OTHER, "D0", "requestSizeBytes", "P", "getSentBytesTimestamp", "F0", "(Ljava/lang/Long;)V", "sentBytesTimestamp", "getReceivedBytesTimestamp", "C0", "receivedBytesTimestamp", "R", "sent", "a0", "tries", "resentCount", "Lokio/k;", "()Lokio/k;", "requestIdBytes", "requestIdHex", "commandId", "expiresInSeconds", "commandAnalyticsName", "c0", "userInitiatedCommand", Gender.UNKNOWN, "sourceContext", "Lic0/c;", "()Lic0/c;", "action", "routableSignatureDataBase64", "requiresSigning", "Lvc0/v2;", "T", "()Lvc0/v2;", "signatureType", "m0", "isRemoteBuilt", "l0", "isPiiKeyRequest", "q0", "isVehicleDataKind", "p0", "isStreamMessageKind", "j0", "isAuthResponse", "n0", "isRemoteVehicle", "keyVersion", "apiVersion", "duration", "requestProcessingDuration", "g0", "wireDuration", "o0", "isSessionInfoRequest", "Lsc0/b;", "()Lsc0/b;", "domain", "b0", "useEncryptedResponse", "", "()Ljava/util/Collection;", "retryResults", "receivedRequestBytesTimestamp", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TeslaCommandRequest implements d {
    private static final com.tesla.logging.g S = com.tesla.logging.g.INSTANCE.a("TeslaCommandRequest");

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean timeoutOccurred;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private volatile Integer oapiStatusCode;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final ConcurrentLinkedQueue<wn0.l<TeslaCommandRequest, h0>> timeoutListeners;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final ConcurrentLinkedQueue<p<TeslaCommandRequest, ic0.h, h0>> finishListeners;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private Long receivedByTransportMillis;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean blockedOnSessionInfo;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String sessionInfoResult;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private Integer secondsRemainingWhenSent;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private byte[] requestTag;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private String vehicleKeyHex;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private m signatureData;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final ConcurrentLinkedQueue<String> _breadcrumbs;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final ConcurrentLinkedDeque<ic0.h> _retryResults;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final ConcurrentLinkedDeque<Double> commandBeforeSendingSeconds;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private Integer requestSizeBytes;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private Long sentBytesTimestamp;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private Long receivedBytesTimestamp;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ic0.e request;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final d listener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private g requestId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] sourcePublicKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final q transport;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean vehicleHasResponseCacheFeature;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private TeslaCommandRequest dependentCommand;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Boolean isLegacyBle;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String vin;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedDeque<g> _previousRequestIds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Long sentTimeMillis;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Long receivedResponseTimeMillis;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private am0.b timeout;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private ic0.j hermesState;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String initialVehicleState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Integer timeoutStartedAtSeconds;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private String sessionInfoRequestId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger nominalRetryCount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger totalRetryCount;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger _resentCount;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private ic0.h finishedResult;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private volatile boolean finished;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger loggedCount;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private AtomicBoolean refetchedSessionInfoForNewSignature;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean timeoutStarted;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Integer timeoutSeconds;

    public TeslaCommandRequest(ic0.e request, d listener, g requestId, byte[] sourcePublicKey, q transport) {
        s.k(request, "request");
        s.k(listener, "listener");
        s.k(requestId, "requestId");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(transport, "transport");
        this.request = request;
        this.listener = listener;
        this.requestId = requestId;
        this.sourcePublicKey = sourcePublicKey;
        this.transport = transport;
        this.vehicleHasResponseCacheFeature = new AtomicBoolean(false);
        this.vin = request.getVin();
        this._previousRequestIds = new ConcurrentLinkedDeque<>();
        am0.b bVarEmpty = am0.b.empty();
        s.j(bVarEmpty, "empty(...)");
        this.timeout = bVarEmpty;
        this.hermesState = ic0.j.INITIAL_STATE;
        this.nominalRetryCount = new AtomicInteger(0);
        this.totalRetryCount = new AtomicInteger(0);
        this._resentCount = new AtomicInteger(0);
        this.loggedCount = new AtomicInteger(0);
        this.refetchedSessionInfoForNewSignature = new AtomicBoolean(false);
        this.timeoutListeners = new ConcurrentLinkedQueue<>();
        this.finishListeners = new ConcurrentLinkedQueue<>();
        this._breadcrumbs = new ConcurrentLinkedQueue<>();
        this._retryResults = new ConcurrentLinkedDeque<>();
        this.commandBeforeSendingSeconds = new ConcurrentLinkedDeque<>();
    }

    public static /* synthetic */ void L0(TeslaCommandRequest teslaCommandRequest, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        teslaCommandRequest.K0(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(TeslaCommandRequest teslaCommandRequest) {
        if (teslaCommandRequest.finished) {
            return;
        }
        teslaCommandRequest.timeoutOccurred = true;
        teslaCommandRequest.timeoutStartedAtSeconds = null;
        teslaCommandRequest.timeoutSeconds = null;
        teslaCommandRequest.N0();
    }

    private final void O0(ic0.g response) {
        if (this.finished) {
            return;
        }
        if (response.getResult() != ic0.h.RESULT_TIMEOUT) {
            com.tesla.logging.g gVar = S;
            String str = "timeout request with non-timeout result " + response.getResult();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
        this.timeoutOccurred = true;
        ConcurrentLinkedQueue<wn0.l<TeslaCommandRequest, h0>> concurrentLinkedQueue = this.timeoutListeners;
        Iterator<T> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            ((wn0.l) it.next()).invoke(this);
        }
        concurrentLinkedQueue.clear();
        a(response);
    }

    public static /* synthetic */ ic0.g h(TeslaCommandRequest teslaCommandRequest, q qVar, ic0.h hVar, String str, String str2, String str3, jc0.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "";
        }
        return teslaCommandRequest.g(qVar, hVar, str, (i11 & 8) != 0 ? null : str2, str3, (i11 & 32) != 0 ? null : aVar);
    }

    public static /* synthetic */ TeslaCommandRequest j(TeslaCommandRequest teslaCommandRequest, ic0.e eVar, d dVar, g gVar, byte[] bArr, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = teslaCommandRequest.request;
        }
        if ((i11 & 2) != 0) {
            dVar = teslaCommandRequest.listener;
        }
        if ((i11 & 4) != 0) {
            gVar = teslaCommandRequest.requestId;
        }
        if ((i11 & 8) != 0) {
            bArr = teslaCommandRequest.sourcePublicKey;
        }
        if ((i11 & 16) != 0) {
            qVar = teslaCommandRequest.transport;
        }
        q qVar2 = qVar;
        g gVar2 = gVar;
        return teslaCommandRequest.i(eVar, dVar, gVar2, bArr, qVar2);
    }

    private final void r0(TeslaCommandRequest teslaCommandRequest, String str, com.tesla.logging.d dVar) {
        if (teslaCommandRequest != null) {
            de0.a.d(teslaCommandRequest, str, S, dVar, false);
        }
    }

    private final int v0() {
        return (int) (System.currentTimeMillis() / ((long) 1000));
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final AtomicInteger getNominalRetryCount() {
        return this.nominalRetryCount;
    }

    public final void A0(Boolean bool) {
        this.isLegacyBle = bool;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Integer getOapiStatusCode() {
        return this.oapiStatusCode;
    }

    public final void B0(Integer num) {
        this.oapiStatusCode = num;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Long getReceivedByTransportMillis() {
        return this.receivedByTransportMillis;
    }

    public final void C0(Long l11) {
        this.receivedBytesTimestamp = l11;
    }

    public final Long D() {
        Long lValueOf = Long.valueOf(this.request.getReceivedRequestBytesTimestamp());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    public final void D0(Integer num) {
        this.requestSizeBytes = num;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Long getReceivedResponseTimeMillis() {
        return this.receivedResponseTimeMillis;
    }

    public final void E0(byte[] bArr) {
        this.requestTag = bArr;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final AtomicBoolean getRefetchedSessionInfoForNewSignature() {
        return this.refetchedSessionInfoForNewSignature;
    }

    public final void F0(Long l11) {
        this.sentBytesTimestamp = l11;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final ic0.e getRequest() {
        return this.request;
    }

    public final void G0(String str) {
        this.sessionInfoRequestId = str;
    }

    public final okio.k H() {
        return this.requestId.getByteString();
    }

    public final void H0(String str) {
        this.sessionInfoResult = str;
    }

    public final String I() {
        return this.requestId.f();
    }

    public final void I0(m mVar) {
        this.signatureData = mVar;
    }

    public final Long J() {
        Long l11 = this.sentBytesTimestamp;
        if (l11 != null) {
            long jLongValue = l11.longValue();
            Long lD = D();
            if (lD != null) {
                return Long.valueOf(jLongValue - lD.longValue());
            }
        }
        return null;
    }

    public final void J0(String str) {
        this.vehicleKeyHex = str;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final Integer getRequestSizeBytes() {
        return this.requestSizeBytes;
    }

    public final void K0(int timeoutSeconds, boolean resetTimeout) {
        if (resetTimeout) {
            this.timeoutStarted = false;
            this.timeout.dispose();
        } else if (this.timeoutStarted) {
            return;
        }
        this.timeoutSeconds = Integer.valueOf(timeoutSeconds);
        this.timeoutStartedAtSeconds = Integer.valueOf(v0());
        this.timeoutStarted = true;
        r0(this, "setting timeout timer to fire in " + timeoutSeconds + " seconds", com.tesla.logging.d.DEBUG);
        this.timeout = io.reactivex.rxjava3.core.b.l((long) timeoutSeconds, TimeUnit.SECONDS).h(new cm0.a() { // from class: ce0.i
            @Override // cm0.a
            public final void run() {
                TeslaCommandRequest.M0(this.f19113a);
            }
        });
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final byte[] getRequestTag() {
        return this.requestTag;
    }

    public final boolean M() {
        ic0.c cVarC = this.request.getAction();
        if (cVarC != null) {
            return CommandActionExtensionsKt.getRequiresSigning(cVarC);
        }
        return false;
    }

    public final int N() {
        return this._resentCount.get();
    }

    public final void N0() {
        O0(new ic0.g(q(), I(), null, ic0.h.RESULT_TIMEOUT, this.transport, 0, null, 0L, 0L, 0, 0, 0, 0, 0, 0, false, null, null, U(), null, null, null, null, 8126436, null));
    }

    public final Collection<ic0.h> O() {
        return this._retryResults;
    }

    public final String P() {
        m mVar = this.signatureData;
        if (mVar == null) {
            return null;
        }
        try {
            return n.c(m.f107695j.encode(mVar), 0, 1, null);
        } catch (Exception e11) {
            S.d("Failed to serialize signature data", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Integer getSecondsRemainingWhenSent() {
        return this.secondsRemainingWhenSent;
    }

    public final boolean R() {
        return this.sentTimeMillis != null;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final String getSessionInfoResult() {
        return this.sessionInfoResult;
    }

    public final v2 T() {
        v2 signatureType;
        ic0.c cVarC = this.request.getAction();
        return (cVarC == null || (signatureType = CommandActionExtensionsKt.getSignatureType(cVarC)) == null) ? v2.SIGNATURE_TYPE_UNSIGNED : signatureType;
    }

    public final String U() {
        return this.request.getSourceContext();
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final byte[] getSourcePublicKey() {
        return this.sourcePublicKey;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final boolean getTimeoutStarted() {
        return this.timeoutStarted;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final AtomicInteger getTotalRetryCount() {
        return this.totalRetryCount;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final q getTransport() {
        return this.transport;
    }

    @Override // ce0.d
    public void a(ic0.g response) {
        ic0.g gVarB;
        s.k(response, "response");
        if (this.finished) {
            return;
        }
        ic0.h result = response.getResult();
        if (response.getWireDurationMilliseconds() == 0) {
            Long lG0 = g0();
            gVarB = ic0.g.b(response, null, null, null, null, null, 0, null, 0L, 0L, 0, 0, 0, lG0 != null ? (int) lG0.longValue() : 0, 0, 0, false, null, null, null, null, null, null, null, 8384511, null);
        } else {
            gVarB = response;
        }
        if (result != ic0.h.RESULT_TIMEOUT || this.timeoutListeners.isEmpty()) {
            k(result);
            d dVar = this.listener;
            if (t.y0(gVarB.getCommandId())) {
                gVarB = ic0.g.b(gVarB, q(), null, null, null, null, 0, null, 0L, 0L, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, null, null, 8388606, null);
            }
            dVar.a(gVarB);
            return;
        }
        S.j("request " + gVarB.getRequestId() + " finishing with timeout with waiting timeout listeners");
        O0(gVarB);
    }

    public final int a0() {
        if (R()) {
            return this.totalRetryCount.get() + 1;
        }
        return 0;
    }

    public final boolean b0() {
        return CommandActionExtensionsKt.getUseEncryptedResponse(l());
    }

    public final void c(String breadcrumb) {
        s.k(breadcrumb, "breadcrumb");
        this._breadcrumbs.add(breadcrumb);
    }

    public final boolean c0() {
        return c.f(this.request);
    }

    public final void d(p<? super TeslaCommandRequest, ? super ic0.h, h0> listener) {
        s.k(listener, "listener");
        if (!this.finished) {
            this.finishListeners.add(listener);
            return;
        }
        ic0.h hVar = this.finishedResult;
        if (hVar == null) {
            hVar = ic0.h.RESULT_INTERNAL_ERROR;
        }
        listener.invoke(this, hVar);
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final AtomicBoolean getVehicleHasResponseCacheFeature() {
        return this.vehicleHasResponseCacheFeature;
    }

    public final void e(wn0.l<? super TeslaCommandRequest, h0> listener) {
        s.k(listener, "listener");
        if (this.timeoutOccurred) {
            listener.invoke(this);
        } else {
            this.timeoutListeners.add(listener);
        }
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final String getVehicleKeyHex() {
        return this.vehicleKeyHex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.f(TeslaCommandRequest.class, other != null ? other.getClass() : null)) {
            return false;
        }
        s.i(other, "null cannot be cast to non-null type com.tesla.requestmanager.TeslaCommandRequest");
        return s.f(I(), ((TeslaCommandRequest) other).I());
    }

    public final boolean f(boolean supportsBluetoothRoutableCommands, List<Integer> featuresBitmask) {
        s.k(featuresBitmask, "featuresBitmask");
        ic0.c cVarC = this.request.getAction();
        if (cVarC != null) {
            return CommandActionExtensionsKt.bluetoothSupported(cVarC, supportsBluetoothRoutableCommands, featuresBitmask);
        }
        return false;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    public final ic0.g g(q transport, ic0.h result, String response, String resultReason, String currentConnectivityState, jc0.a nominalError) {
        s.k(transport, "transport");
        s.k(result, "result");
        s.k(response, "response");
        s.k(currentConnectivityState, "currentConnectivityState");
        String strQ = q();
        String strI = I();
        String strP = P();
        boolean zC0 = c0();
        String strU = U();
        String str = this.initialVehicleState;
        if (str == null) {
            str = "unknown";
        }
        return new ic0.g(strQ, strI, response, result, transport, 0, null, 0L, 0L, 0, 0, 0, 0, 0, 0, zC0, str, currentConnectivityState, strU, nominalError, resultReason, strP, null, 4227040, null);
    }

    public final Long g0() {
        Long l11 = this.sentBytesTimestamp;
        if (l11 != null) {
            long jLongValue = l11.longValue();
            Long l12 = this.receivedBytesTimestamp;
            if (l12 != null) {
                return Long.valueOf(l12.longValue() - jLongValue);
            }
        }
        return null;
    }

    public final int h0() {
        return this._resentCount.incrementAndGet();
    }

    public int hashCode() {
        return I().hashCode();
    }

    public final TeslaCommandRequest i(ic0.e request, d listener, g requestId, byte[] sourcePublicKey, q transport) {
        s.k(request, "request");
        s.k(listener, "listener");
        s.k(requestId, "requestId");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(transport, "transport");
        return new TeslaCommandRequest(request, listener, requestId, sourcePublicKey, transport);
    }

    public final void i0(ic0.h commandResult) {
        if (commandResult != null) {
            this._retryResults.addLast(commandResult);
        }
        this._previousRequestIds.add(this.requestId);
        this.totalRetryCount.incrementAndGet();
        if (commandResult != ic0.h.RESULT_VEHICLE_NOT_CONNECTED) {
            this.nominalRetryCount.incrementAndGet();
        }
        this.requestId = new g();
    }

    public final boolean j0() {
        ic0.c cVarC = this.request.getAction();
        return (cVarC != null ? cVarC.getAuthenticationResponse() : null) != null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
    public final void k(ic0.h result) {
        ic0.k kVarQ;
        ic0.l lVarC;
        s.k(result, "result");
        ec0.h0 h0VarD = null;
        if (this.finished) {
            com.tesla.logging.g gVar = S;
            String str = "finish called on finished request " + o();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        this.finishedResult = result;
        if (result != ic0.h.RESULT_SUCCESS) {
            this.finished = true;
        } else {
            ic0.c cVarC = this.request.getAction();
            if (cVarC != null && (kVarQ = cVarC.getProxyCommand()) != null && (lVarC = kVarQ.getAction()) != null) {
                h0VarD = lVarC.getGetReaderKey();
            }
            if (h0VarD != null) {
                S.j("request " + this.request.getId() + " sees an empty response, not finish yet and expect another NFC card swipe response");
            } else {
                this.finished = true;
            }
        }
        this.timeout.dispose();
        this.timeoutListeners.clear();
        ConcurrentLinkedQueue<p<TeslaCommandRequest, ic0.h, h0>> concurrentLinkedQueue = this.finishListeners;
        Iterator<T> it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            ((p) it.next()).invoke(this, result);
        }
        concurrentLinkedQueue.clear();
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Boolean getIsLegacyBle() {
        return this.isLegacyBle;
    }

    public final ic0.c l() {
        ic0.c cVarC = this.request.getAction();
        s.h(cVarC);
        return cVarC;
    }

    public final boolean l0() {
        g5 g5VarF;
        ic0.c cVarC = this.request.getAction();
        return ((cVarC == null || (g5VarF = cVarC.getCarServerAction()) == null) ? null : g5VarF.getPiiKeyRequest()) != null;
    }

    public final Integer m() {
        ic0.c cVarC = this.request.getAction();
        if (cVarC != null) {
            return CommandActionExtensionsKt.getApiVersion(cVarC);
        }
        return null;
    }

    public final boolean m0() {
        ic0.c cVarC = this.request.getAction();
        if (cVarC != null) {
            return CommandActionExtensionsKt.getRequiresRemoteBuilding(cVarC);
        }
        return false;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getBlockedOnSessionInfo() {
        return this.blockedOnSessionInfo;
    }

    public final boolean n0() {
        ic0.c cVarC = this.request.getAction();
        if (cVarC != null) {
            return CommandActionExtensionsKt.isProxyCommand(cVarC);
        }
        return false;
    }

    public final String o() {
        return c.b(this.request);
    }

    public final boolean o0() {
        return l().getTesla_proto_SessionInfoRequest() != null;
    }

    public final ConcurrentLinkedDeque<Double> p() {
        return this.commandBeforeSendingSeconds;
    }

    public final boolean p0() {
        g5 g5VarF;
        ic0.c cVarC = this.request.getAction();
        if (cVarC == null || (g5VarF = cVarC.getCarServerAction()) == null) {
            return false;
        }
        return (g5VarF.getStreamMessage() == null && g5VarF.getCreateStreamSession() == null) ? false : true;
    }

    public final String q() {
        return this.request.getId();
    }

    public final boolean q0() {
        g5 g5VarF;
        ic0.c cVarC = this.request.getAction();
        if (cVarC == null || (g5VarF = cVarC.getCarServerAction()) == null) {
            return false;
        }
        return (g5VarF.getVehicleDataSubscription() == null && g5VarF.getGetVehicleData() == null) ? false : true;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final TeslaCommandRequest getDependentCommand() {
        return this.dependentCommand;
    }

    public final sc0.b s() {
        return c.c(this.request);
    }

    public final void s0() {
        this.receivedResponseTimeMillis = Long.valueOf(System.currentTimeMillis());
    }

    public final Long t() {
        Long l11 = this.sentTimeMillis;
        if (l11 == null && (l11 = this.receivedByTransportMillis) == null) {
            return null;
        }
        long jLongValue = l11.longValue();
        Long l12 = this.receivedResponseTimeMillis;
        return Long.valueOf((l12 != null ? l12.longValue() : System.currentTimeMillis()) - jLongValue);
    }

    public final void t0() {
        if (this.receivedByTransportMillis == null) {
            this.receivedByTransportMillis = Long.valueOf(System.currentTimeMillis());
        }
    }

    public String toString() {
        return "TeslaCommandRequest(request=" + this.request + ", listener=" + this.listener + ", requestId=" + this.requestId + ", sourcePublicKey=" + Arrays.toString(this.sourcePublicKey) + ", transport=" + this.transport + ")";
    }

    public final int u() {
        Integer num = this.timeoutStartedAtSeconds;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = this.timeoutSeconds;
            Integer numValueOf = num2 != null ? Integer.valueOf(bo0.n.f((iIntValue + num2.intValue()) - v0(), 0)) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    public final void u0(String vehicleState) {
        s.k(vehicleState, "vehicleState");
        if (this.sentTimeMillis == null) {
            this.sentTimeMillis = Long.valueOf(System.currentTimeMillis());
            this.secondsRemainingWhenSent = Integer.valueOf(u());
        }
        if (this.initialVehicleState == null) {
            this.initialVehicleState = vehicleState;
        }
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getFinished() {
        return this.finished;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final ic0.j getHermesState() {
        return this.hermesState;
    }

    public final void w0(ic0.j state) {
        s.k(state, "state");
        synchronized (this.hermesState) {
            S.j(o() + " hermes state change: " + this.hermesState + " -> " + state);
            this.hermesState = state;
            h0 h0Var = h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getInitialVehicleState() {
        return this.initialVehicleState;
    }

    public final void x0() {
        Long l11 = this.receivedByTransportMillis;
        if (l11 != null) {
            this.commandBeforeSendingSeconds.add(Double.valueOf((System.currentTimeMillis() - l11.longValue()) / 1000.0d));
        }
    }

    public final Integer y() {
        ic0.c cVarC = this.request.getAction();
        if (cVarC != null) {
            return CommandActionExtensionsKt.getKeyVersion(cVarC);
        }
        return null;
    }

    public final void y0(boolean z11) {
        this.blockedOnSessionInfo = z11;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final AtomicInteger getLoggedCount() {
        return this.loggedCount;
    }

    public final void z0(TeslaCommandRequest teslaCommandRequest) {
        this.dependentCommand = teslaCommandRequest;
    }

    public /* synthetic */ TeslaCommandRequest(ic0.e eVar, d dVar, g gVar, byte[] bArr, q qVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, dVar, (i11 & 4) != 0 ? new g() : gVar, bArr, qVar);
    }
}
