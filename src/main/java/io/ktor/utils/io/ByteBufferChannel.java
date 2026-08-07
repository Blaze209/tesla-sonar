package io.ktor.utils.io;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io.ktor.utils.io.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0010\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00042\u00020\u0005:\u0002Û\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u000b*\u00020\u000f2\u0006\u0010%\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010'J+\u0010,\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010-J'\u00101\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u00102J+\u00103\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001b\u00106\u001a\u00020\u000b2\u0006\u0010)\u001a\u000205H\u0082@ø\u0001\u0000¢\u0006\u0004\b6\u00107J#\u0010;\u001a\u00020\u0013*\u00020\u000f2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u000bH\u0002¢\u0006\u0004\b;\u0010<J#\u0010=\u001a\u00020\u0013*\u00020\u000f2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u000bH\u0002¢\u0006\u0004\b=\u0010<J!\u0010@\u001a\u0004\u0018\u00010\u00002\u0006\u0010>\u001a\u00020\u00002\u0006\u0010?\u001a\u00020\u001eH\u0002¢\u0006\u0004\b@\u0010AJ\u001b\u0010C\u001a\u00020\u00132\u0006\u0010B\u001a\u00020(H\u0082@ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020(H\u0002¢\u0006\u0004\bG\u0010HJ'\u0010I\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0002¢\u0006\u0004\bI\u00102J+\u0010J\u001a\u00020\u00132\u0006\u0010B\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bJ\u00104J+\u0010K\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bK\u00104J/\u0010O\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u000b2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130MH\u0082@ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ#\u0010S\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q2\u0006\u0010+\u001a\u00020QH\u0082@ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ\u001b\u0010W\u001a\u00020\u00132\u0006\u0010V\u001a\u00020UH\u0082@ø\u0001\u0000¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020U2\u0006\u0010[\u001a\u00020QH\u0002¢\u0006\u0004\b\\\u0010]J\u001b\u0010^\u001a\u00020U2\u0006\u0010[\u001a\u00020QH\u0082@ø\u0001\u0000¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0013H\u0002¢\u0006\u0004\b`\u0010\u001dJ\u000f\u0010a\u001a\u00020\u0013H\u0002¢\u0006\u0004\ba\u0010\u001dJ\u0019\u0010d\u001a\u00020\u00132\b\u0010c\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0004\bd\u0010eJ\u001b\u0010g\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u001b\u0010i\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bi\u0010hJ%\u0010l\u001a\u00020\u00042\u0006\u0010f\u001a\u00020\u000b2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00060jH\u0002¢\u0006\u0004\bl\u0010hJ\u001b\u0010m\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\bm\u0010hJ\u000f\u0010n\u001a\u00020\u0006H\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010p\u001a\u00020\u00062\u0006\u0010f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020\u00132\u0006\u0010f\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\br\u0010hJ%\u0010u\u001a\u00020\u00132\u0006\u0010f\u001a\u00020\u000b2\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00130sH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\tH\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010z\u001a\u00020\u00132\u0006\u0010y\u001a\u00020\tH\u0002¢\u0006\u0004\bz\u0010{J\u000f\u0010}\u001a\u00020|H\u0000¢\u0006\u0004\b}\u0010~J\u0012\u0010\u007f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001c\u0010\u0083\u0001\u001a\u00020\u00132\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0017¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u001c\u0010\u0085\u0001\u001a\u00020\u00062\b\u0010c\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0087\u0001\u001a\u00020\u00062\b\u0010c\u001a\u0004\u0018\u00010bH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0088\u0001\u0010\u001dJ#\u0010\u008a\u0001\u001a\u00020\u00132\u0006\u0010y\u001a\u00020\u000f2\u0007\u0010\u0089\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0013\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0005\b\u008c\u0001\u0010\u001bJ\u0011\u0010\u008d\u0001\u001a\u00020\u0013H\u0000¢\u0006\u0005\b\u008d\u0001\u0010\u001dJ\u0011\u0010\u008e\u0001\u001a\u00020\u0006H\u0000¢\u0006\u0005\b\u008e\u0001\u0010oJ-\u0010\u008f\u0001\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u008f\u0001\u00104J\u001d\u0010\u0090\u0001\u001a\u00020\u000b2\u0006\u0010)\u001a\u000205H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0090\u0001\u00107J)\u0010\u0091\u0001\u001a\u00020\u00132\u0006\u0010y\u001a\u00020\u000f2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u000bH\u0000¢\u0006\u0005\b\u0091\u0001\u0010<J\u0012\u0010\u0092\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001d\u0010\u0094\u0001\u001a\u00020\u00132\u0006\u0010B\u001a\u00020(H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0094\u0001\u0010DJ0\u0010\u0095\u0001\u001a\u00020Q2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010[\u001a\u00020Q2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0080@ø\u0001\u0000¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J-\u0010\u0097\u0001\u001a\u00020\u00132\u0006\u0010B\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0097\u0001\u00104J-\u0010\u0098\u0001\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u0098\u0001\u00104J.\u0010\u0099\u0001\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u000b2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130MH\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J1\u0010\u009b\u0001\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u000b2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00130MH\u0096@ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010PJ\u0015\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009c\u0001H\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001a\u0010 \u0001\u001a\u00020\u00132\u0007\u0010\u009f\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b \u0001\u0010\u0015J\u001b\u0010t\u001a\u00020Q2\u0006\u0010+\u001a\u00020QH\u0096@ø\u0001\u0000¢\u0006\u0004\bt\u0010_J\u001d\u0010¡\u0001\u001a\u00020\u00132\u0006\u0010V\u001a\u00020UH\u0096@ø\u0001\u0000¢\u0006\u0005\b¡\u0001\u0010XJ\u001d\u0010¢\u0001\u001a\u00020U2\u0006\u0010[\u001a\u00020QH\u0096@ø\u0001\u0000¢\u0006\u0005\b¢\u0001\u0010_J\u001d\u0010£\u0001\u001a\u00020\u00132\u0006\u0010f\u001a\u00020\u000bH\u0080@ø\u0001\u0000¢\u0006\u0005\b£\u0001\u0010hJ\u0013\u0010¥\u0001\u001a\u00030¤\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001R\u001d\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010§\u0001\u001a\u0005\b¨\u0001\u0010oR\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bt\u0010©\u0001R\u001e\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010?\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010\u00ad\u0001R\u0019\u0010®\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010ª\u0001R\u0019\u0010¯\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010ª\u0001R\u001c\u0010°\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R2\u0010³\u0001\u001a\u00020Q2\u0007\u0010²\u0001\u001a\u00020Q8\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\b§\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R2\u0010¸\u0001\u001a\u00020Q2\u0007\u0010²\u0001\u001a\u00020Q8\u0016@PX\u0096\u000e¢\u0006\u0018\n\u0006\b¸\u0001\u0010´\u0001\u001a\u0006\b¹\u0001\u0010µ\u0001\"\u0006\bº\u0001\u0010·\u0001R\u001f\u0010¾\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¢\u0001\u0010¼\u0001\u0012\u0005\b½\u0001\u0010\u001dR\u0018\u0010Â\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010Ä\u0001R\u001e\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130Ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010Ä\u0001R\u0019\u0010Ç\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010ª\u0001R)\u0010É\u0001\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130j\u0012\u0004\u0012\u00020\u00040M8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010È\u0001R\u0016\u0010Ë\u0001\u001a\u00020|8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010~R0\u0010Ò\u0001\u001a\u0005\u0018\u00010Ì\u00012\n\u0010Í\u0001\u001a\u0005\u0018\u00010Ì\u00018B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R:\u0010×\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010j2\u000f\u0010Í\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010j8B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R:\u0010Ú\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010j2\u000f\u0010Í\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010j8B@BX\u0082\u000e¢\u0006\u0010\u001a\u0006\bØ\u0001\u0010Ô\u0001\"\u0006\bÙ\u0001\u0010Ö\u0001R\u0017\u0010Ü\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010¬\u0001R\u0016\u0010Þ\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010oR\u0016\u0010à\u0001\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bß\u0001\u0010oR\u0019\u0010â\u0001\u001a\u0004\u0018\u00010b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010á\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006ã\u0001"}, d2 = {"Lio/ktor/utils/io/a;", "Lio/ktor/utils/io/c;", "Lio/ktor/utils/io/g;", "Lio/ktor/utils/io/j;", "", "Lio/ktor/utils/io/s;", "", "autoFlush", "Lnl0/f;", "Lio/ktor/utils/io/internal/g$c;", "pool", "", "reservedSize", "<init>", "(ZLnl0/f;I)V", "Ljava/nio/ByteBuffer;", "content", "(Ljava/nio/ByteBuffer;)V", "minWriteSize", "Ljn0/h0;", Gender.UNKNOWN, "(I)V", "position", "available", "e0", "(Ljava/nio/ByteBuffer;II)V", "E0", "()Ljava/nio/ByteBuffer;", "w0", "()V", "Lio/ktor/utils/io/internal/d;", "joined", "I0", "(Lio/ktor/utils/io/internal/d;)Z", "forceTermination", "J0", "(Z)Z", "idx", Gender.OTHER, "(Ljava/nio/ByteBuffer;I)I", "Lll0/a;", "dst", "consumed", "max", "g0", "(Lll0/a;II)I", "", "offset", "length", "h0", "([BII)I", "m0", "([BIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lml0/a;", "l0", "(Lml0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/internal/i;", "capacity", "count", Gender.MALE, "(Ljava/nio/ByteBuffer;Lio/ktor/utils/io/internal/i;I)V", "L", "current", "joining", "v0", "(Lio/ktor/utils/io/a;Lio/ktor/utils/io/internal/d;)Lio/ktor/utils/io/a;", "src", "V0", "(Lll0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "(Lio/ktor/utils/io/internal/d;)V", "O0", "(Lll0/a;)I", "P0", "W0", "a1", "min", "Lkotlin/Function1;", "block", "K", "(ILwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "discarded0", "S", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lll0/k;", "packet", "Y0", "(Lll0/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "L0", "(Lll0/k;)I", "limit", "t0", "(J)Lll0/k;", "o0", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "z0", "A0", "", "cause", "y0", "(Ljava/lang/Throwable;)V", "size", "p0", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r0", "Lkotlin/coroutines/Continuation;", "continuation", "H0", "q0", "G0", "()Z", "c1", "(I)Z", "Z0", "Lkotlinx/coroutines/CancellableContinuation;", "c", "b1", "(ILkotlinx/coroutines/CancellableContinuation;)V", "d0", "()Lio/ktor/utils/io/internal/g$c;", "buffer", "s0", "(Lio/ktor/utils/io/internal/g$c;)V", "Lio/ktor/utils/io/internal/g;", "Q", "()Lio/ktor/utils/io/internal/g;", "W", "()Lio/ktor/utils/io/internal/d;", "Lkotlinx/coroutines/Job;", "job", "m", "(Lkotlinx/coroutines/Job;)V", "close", "(Ljava/lang/Throwable;)Z", "cancel", "flush", "lockedSpace", "f0", "(Ljava/nio/ByteBuffer;I)V", "F0", "x0", "K0", IntegerTokenConverter.CONVERTER_KEY, "b", Gender.NONE, "u0", "()Lio/ktor/utils/io/a;", "k", "P", "(Lio/ktor/utils/io/a;JLio/ktor/utils/io/internal/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "R0", "Q0", "(ILwn0/l;)I", "f", "Lio/ktor/utils/io/x;", "n", "()Lio/ktor/utils/io/x;", "written", DateTokenConverter.CONVERTER_KEY, "j", "g", "M0", "", "toString", "()Ljava/lang/String;", "Z", "e", "Lnl0/f;", "I", "getReservedSize$ktor_io", "()I", "Lio/ktor/utils/io/internal/d;", "readPosition", "writePosition", "attachedJob", "Lkotlinx/coroutines/Job;", "<set-?>", "totalBytesRead", "J", "()J", "C0", "(J)V", "totalBytesWritten", "a0", "D0", "Lio/ktor/utils/io/internal/f;", "Lio/ktor/utils/io/internal/f;", "getReadSession$annotations", "readSession", "Lio/ktor/utils/io/internal/l;", "h", "Lio/ktor/utils/io/internal/l;", "writeSession", "Lio/ktor/utils/io/internal/b;", "Lio/ktor/utils/io/internal/b;", "readSuspendContinuationCache", "writeSuspendContinuationCache", "writeSuspensionSize", "Lwn0/l;", "writeSuspension", "Y", "state", "Lio/ktor/utils/io/internal/c;", "value", "V", "()Lio/ktor/utils/io/internal/c;", "setClosed", "(Lio/ktor/utils/io/internal/c;)V", "closed", "X", "()Lkotlin/coroutines/Continuation;", "B0", "(Lkotlin/coroutines/Continuation;)V", "readOp", "b0", "setWriteOp", "writeOp", "a", "availableForRead", "o", "isClosedForRead", "c0", "isClosedForWrite", "()Ljava/lang/Throwable;", "closedCause", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ByteBufferChannel implements io.ktor.utils.io.c, io.ktor.utils.io.g, io.ktor.utils.io.j, s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f78532m = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_state");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f78533n = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f78534o = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_readOp");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f78535p = AtomicReferenceFieldUpdater.newUpdater(ByteBufferChannel.class, Object.class, "_writeOp");
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile Job attachedJob;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean autoFlush;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nl0.f<io.ktor.utils.io.internal.g.c> pool;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int reservedSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int readPosition;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int writePosition;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final io.ktor.utils.io.internal.f readSession;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final io.ktor.utils.io.internal.l writeSession;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final io.ktor.utils.io.internal.b<Boolean> readSuspendContinuationCache;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final io.ktor.utils.io.internal.b<h0> writeSuspendContinuationCache;
    private volatile io.ktor.utils.io.internal.d joining;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Continuation<? super h0>, Object> writeSuspension;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    /* JADX INFO: renamed from: io.ktor.utils.io.a$b */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Throwable, h0> {
        b() {
            super(1);
        }

        public final void a(Throwable th2) {
            ByteBufferChannel.this.attachedJob = null;
            if (th2 == null) {
                return;
            }
            ByteBufferChannel.this.cancel(r.a(th2));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$c */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {1512, 1513}, m = "awaitFreeSpaceOrDelegate", n = {"this", "block", "min"}, s = {"L$0", "L$1", "I$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78547n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78548o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78549p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f78550q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f78552s;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78550q = obj;
            this.f78552s |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.K(0, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$d */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {1200, 1271, 1279}, m = "copyDirect$ktor_io", n = {"this", "src", "joined", "copied", "this_$iv", "current$iv", "capacity$iv", "state", "dstBuffer", "$this$copyDirect_u24lambda_u2475", "limit", "autoFlush", "before$iv", "this", "src", "joined", "copied", "limit", "autoFlush", "this", "src", "joined", "copied", "limit", "autoFlush"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "Z$0", "J$1", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0"})
    static final class d extends ContinuationImpl {
        /* synthetic */ Object A;
        int C;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78553n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78554o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f78555p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f78556q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f78557r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f78558s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f78559t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f78560u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f78561v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f78562w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        long f78563x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        long f78564y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f78565z;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.P(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$e */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {1702}, m = "discardSuspend", n = {"this", "discarded", "max"}, s = {"L$0", "L$1", "J$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78566n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78567o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        long f78568p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f78569q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f78571s;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78569q = obj;
            this.f78571s |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.S(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$f */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {729, 733}, m = "readAvailableSuspend", n = {"this", "dst", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78572n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78573o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78574p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f78575q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f78576r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f78578t;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78576r = obj;
            this.f78578t |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.m0(null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$g */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {745, 749}, m = "readAvailableSuspend", n = {"this", "dst"}, s = {"L$0", "L$1"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78579n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78580o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78581p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78583r;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78581p = obj;
            this.f78583r |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.l0(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$h */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0, 0}, l = {2093}, m = "readRemainingSuspend", n = {"this", "builder$iv", "remaining", "$this$writeWhile$iv", "tail$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78584n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78585o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f78586p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f78587q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f78588r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f78589s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f78591u;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78589s = obj;
            this.f78591u |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.o0(0L, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$i */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2236}, m = "readSuspendImpl", n = {"this", "size"}, s = {"L$0", "I$0"})
    static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78592n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f78593o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78594p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78596r;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78594p = obj;
            this.f78596r |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.q0(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$j */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2189}, m = "readSuspendLoop", n = {"this", "size"}, s = {"L$0", "I$0"})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78597n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f78598o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78599p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78601r;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78599p = obj;
            this.f78601r |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.r0(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$k */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0}, l = {1507}, m = "write$suspendImpl", n = {"$this", "block", "min"}, s = {"L$0", "L$1", "I$0"})
    static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78602n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78603o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78604p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f78605q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f78607s;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78605q = obj;
            this.f78607s |= Integer.MIN_VALUE;
            return ByteBufferChannel.N0(ByteBufferChannel.this, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$l */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {1123, 1125}, m = "writeFullySuspend", n = {"this", "src"}, s = {"L$0", "L$1"})
    static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78608n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78609o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78610p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78612r;

        l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78610p = obj;
            this.f78612r |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.V0(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$m */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {1422}, m = "writeFullySuspend", n = {"this", "src", "currentOffset", "currentLength"}, s = {"L$0", "L$1", "I$0", "I$1"})
    static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78613n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78614o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78615p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f78616q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f78617r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f78619t;

        m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78617r = obj;
            this.f78619t |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.W0(null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$n */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 1}, l = {1742, 1744}, m = "writePacketSuspend", n = {"this", "packet", "packet"}, s = {"L$0", "L$1", "L$0"})
    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78620n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78621o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78622p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78624r;

        n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78622p = obj;
            this.f78624r |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.Y0(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$o */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0, 0, 0}, l = {1439, 1441}, m = "writeSuspend", n = {"this", "src", "offset", "length"}, s = {"L$0", "L$1", "I$0", "I$1"})
    static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78625n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f78626o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f78627p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f78628q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f78629r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f78631t;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78629r = obj;
            this.f78631t |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.a1(null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$p */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", i = {0, 0}, l = {2412}, m = "writeSuspend", n = {"this", "size"}, s = {"L$0", "I$0"})
    static final class p extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f78632n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f78633o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f78634p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f78636r;

        p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f78634p = obj;
            this.f78636r |= Integer.MIN_VALUE;
            return ByteBufferChannel.this.Z0(0, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.utils.io.a$q */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "ucont", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class q extends p013kotlin.jvm.internal.u implements wn0.l<Continuation<? super h0>, Object> {
        q() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super h0> ucont) throws Throwable {
            Throwable thC;
            p013kotlin.jvm.internal.s.k(ucont, "ucont");
            int i11 = ByteBufferChannel.this.writeSuspensionSize;
            while (true) {
                io.ktor.utils.io.internal.c cVarV = ByteBufferChannel.this.V();
                if (cVarV != null && (thC = cVarV.c()) != null) {
                    io.ktor.utils.io.b.b(thC);
                    throw new KotlinNothingValueException();
                }
                if (!ByteBufferChannel.this.c1(i11)) {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    ucont.resumeWith(jn0.s.b(h0.f84049a));
                    break;
                }
                ByteBufferChannel byteBufferChannel = ByteBufferChannel.this;
                Continuation continuationIntercepted = IntrinsicsKt.intercepted(ucont);
                ByteBufferChannel byteBufferChannel2 = ByteBufferChannel.this;
                while (true) {
                    if (byteBufferChannel.b0() != null) {
                        throw new IllegalStateException("Operation is already in progress");
                    }
                    if (!byteBufferChannel2.c1(i11)) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ByteBufferChannel.f78535p;
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, byteBufferChannel, null, continuationIntercepted)) {
                        if (!byteBufferChannel2.c1(i11) && androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, byteBufferChannel, continuationIntercepted, null)) {
                            break;
                        }
                        break;
                    }
                }
            }
            ByteBufferChannel.this.U(i11);
            if (ByteBufferChannel.this.G0()) {
                ByteBufferChannel.this.z0();
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
    }

    public ByteBufferChannel(boolean z11, nl0.f<io.ktor.utils.io.internal.g.c> pool, int i11) {
        p013kotlin.jvm.internal.s.k(pool, "pool");
        this.autoFlush = z11;
        this.pool = pool;
        this.reservedSize = i11;
        this._state = io.ktor.utils.io.internal.g.a.f78754c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        this.readSession = new io.ktor.utils.io.internal.f(this);
        this.writeSession = new io.ktor.utils.io.internal.l(this);
        this.readSuspendContinuationCache = new io.ktor.utils.io.internal.b<>();
        this.writeSuspendContinuationCache = new io.ktor.utils.io.internal.b<>();
        this.writeSuspension = new q();
    }

    private final void A0() {
        Continuation<h0> continuationB0;
        io.ktor.utils.io.internal.c cVarV;
        Object objA;
        do {
            continuationB0 = b0();
            if (continuationB0 == null) {
                return;
            }
            cVarV = V();
            if (cVarV == null && this.joining != null) {
                io.ktor.utils.io.internal.g gVarY = Y();
                if (!(gVarY instanceof io.ktor.utils.io.internal.g.C1678g) && !(gVarY instanceof io.ktor.utils.io.internal.g.e) && gVarY != io.ktor.utils.io.internal.g.f.f78764c) {
                    return;
                }
            }
        } while (!androidx.concurrent.futures.b.a(f78535p, this, continuationB0, null));
        if (cVarV == null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objA = h0.f84049a;
        } else {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objA = jn0.t.a(cVarV.c());
        }
        continuationB0.resumeWith(jn0.s.b(objA));
    }

    private final void B0(Continuation<? super Boolean> continuation) {
        this._readOp = continuation;
    }

    private final ByteBuffer E0() throws Throwable {
        Object obj;
        Throwable cause;
        io.ktor.utils.io.internal.g gVarC;
        Throwable cause2;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.g gVar = (io.ktor.utils.io.internal.g) obj;
            if (p013kotlin.jvm.internal.s.f(gVar, io.ktor.utils.io.internal.g.f.f78764c) ? true : p013kotlin.jvm.internal.s.f(gVar, io.ktor.utils.io.internal.g.a.f78754c)) {
                io.ktor.utils.io.internal.c cVarV = V();
                if (cVarV == null || (cause = cVarV.getCause()) == null) {
                    return null;
                }
                io.ktor.utils.io.b.b(cause);
                throw new KotlinNothingValueException();
            }
            io.ktor.utils.io.internal.c cVarV2 = V();
            if (cVarV2 != null && (cause2 = cVarV2.getCause()) != null) {
                io.ktor.utils.io.b.b(cause2);
                throw new KotlinNothingValueException();
            }
            if (gVar.capacity._availableForRead$internal == 0) {
                return null;
            }
            gVarC = gVar.c();
        } while (!androidx.concurrent.futures.b.a(f78532m, this, obj, gVarC));
        ByteBuffer readBuffer = gVarC.getReadBuffer();
        e0(readBuffer, this.readPosition, gVarC.capacity._availableForRead$internal);
        return readBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G0() {
        if (this.joining != null) {
            return Y() == io.ktor.utils.io.internal.g.a.f78754c || (Y() instanceof io.ktor.utils.io.internal.g.b);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0000 A[EDGE_INSN: B:80:0x0000->B:75:0x0000 BREAK  A[LOOP:1: B:28:0x006e->B:81:?], SYNTHETIC] */
    private final Object H0(int size, Continuation<? super Boolean> continuation) {
        while (true) {
            io.ktor.utils.io.internal.g gVarY = Y();
            if (gVarY.capacity._availableForRead$internal >= size || !(this.joining == null || b0() == null || (gVarY != io.ktor.utils.io.internal.g.a.f78754c && !(gVarY instanceof io.ktor.utils.io.internal.g.b)))) {
                break;
            }
            io.ktor.utils.io.internal.c cVarV = V();
            if (cVarV != null) {
                if (cVarV.getCause() != null) {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    continuation.resumeWith(jn0.s.b(jn0.t.a(cVarV.getCause())));
                    return IntrinsicsKt.getCOROUTINE_SUSPENDED();
                }
                boolean zE = Y().capacity.e();
                boolean z11 = false;
                boolean z12 = Y().capacity._availableForRead$internal >= size;
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                if (zE && z12) {
                    z11 = true;
                }
                continuation.resumeWith(jn0.s.b(Boolean.valueOf(z11)));
                return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            while (true) {
                if (X() != null) {
                    throw new IllegalStateException("Operation is already in progress");
                }
                if (V() != null) {
                    break;
                }
                io.ktor.utils.io.internal.g gVarY2 = Y();
                if (gVarY2.capacity._availableForRead$internal >= size || !(this.joining == null || b0() == null || (gVarY2 != io.ktor.utils.io.internal.g.a.f78754c && !(gVarY2 instanceof io.ktor.utils.io.internal.g.b)))) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f78534o;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, continuation)) {
                    if (V() != null) {
                        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, continuation, null)) {
                            break;
                            break;
                        }
                    } else {
                        io.ktor.utils.io.internal.g gVarY3 = Y();
                        if (gVarY3.capacity._availableForRead$internal >= size || (this.joining != null && b0() != null && (gVarY3 == io.ktor.utils.io.internal.g.a.f78754c || (gVarY3 instanceof io.ktor.utils.io.internal.g.b)))) {
                            if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, continuation, null)) {
                                break;
                            }
                        }
                    }
                }
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        jn0.s.Companion companion3 = jn0.s.INSTANCE;
        continuation.resumeWith(jn0.s.b(Boolean.TRUE));
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    private final boolean I0(io.ktor.utils.io.internal.d joined) {
        if (!J0(true)) {
            return false;
        }
        T(joined);
        Continuation continuation = (Continuation) f78534o.getAndSet(this, null);
        if (continuation != null) {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            continuation.resumeWith(jn0.s.b(jn0.t.a(new IllegalStateException("Joining is in progress"))));
        }
        A0();
        return true;
    }

    private final boolean J0(boolean forceTermination) {
        Object obj;
        io.ktor.utils.io.internal.g.f fVar;
        io.ktor.utils.io.internal.g.c initial = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.g gVar = (io.ktor.utils.io.internal.g) obj;
            io.ktor.utils.io.internal.c cVarV = V();
            if (initial != null) {
                if ((cVarV != null ? cVarV.getCause() : null) == null) {
                    initial.capacity.j();
                }
                A0();
                initial = null;
            }
            fVar = io.ktor.utils.io.internal.g.f.f78764c;
            if (gVar == fVar) {
                return true;
            }
            if (gVar != io.ktor.utils.io.internal.g.a.f78754c) {
                if (cVarV != null && (gVar instanceof io.ktor.utils.io.internal.g.b) && (gVar.capacity.k() || cVarV.getCause() != null)) {
                    if (cVarV.getCause() != null) {
                        gVar.capacity.f();
                    }
                    initial = ((io.ktor.utils.io.internal.g.b) gVar).getInitial();
                } else {
                    if (!forceTermination || !(gVar instanceof io.ktor.utils.io.internal.g.b) || !gVar.capacity.k()) {
                        return false;
                    }
                    initial = ((io.ktor.utils.io.internal.g.b) gVar).getInitial();
                }
            }
        } while (!androidx.concurrent.futures.b.a(f78532m, this, obj, fVar));
        if (initial != null && Y() == fVar) {
            s0(initial);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r8.f(r6, r7, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(int r6, wn0.l<? super java.nio.ByteBuffer, jn0.h0> r7, p013kotlin.coroutines.Continuation<? super jn0.h0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteBufferChannel.c
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.a$c r0 = (io.ktor.utils.io.ByteBufferChannel.c) r0
            int r1 = r0.f78552s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78552s = r1
            goto L18
        L13:
            io.ktor.utils.io.a$c r0 = new io.ktor.utils.io.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f78550q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78552s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r8)
            goto L6d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.f78549p
            java.lang.Object r7 = r0.f78548o
            wn0.l r7 = (wn0.l) r7
            java.lang.Object r2 = r0.f78547n
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            jn0.t.b(r8)
            goto L55
        L42:
            jn0.t.b(r8)
            r0.f78547n = r5
            r0.f78548o = r7
            r0.f78549p = r6
            r0.f78552s = r4
            java.lang.Object r8 = r5.Z0(r6, r0)
            if (r8 != r1) goto L54
            goto L6c
        L54:
            r2 = r5
        L55:
            io.ktor.utils.io.internal.d r8 = r2.joining
            if (r8 == 0) goto L70
            io.ktor.utils.io.a r8 = r2.v0(r2, r8)
            if (r8 == 0) goto L70
            r2 = 0
            r0.f78547n = r2
            r0.f78548o = r2
            r0.f78552s = r3
            java.lang.Object r6 = r8.f(r6, r7, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        L70:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.K(int, wn0.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void L(ByteBuffer byteBuffer, io.ktor.utils.io.internal.i iVar, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.readPosition = O(byteBuffer, this.readPosition + i11);
        iVar.a(i11);
        C0(getTotalBytesRead() + ((long) i11));
        A0();
    }

    private final int L0(ll0.k packet) throws Throwable {
        ByteBufferChannel byteBufferChannelV0;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (byteBufferChannelV0 = v0(this, dVar)) == null) {
            byteBufferChannelV0 = this;
        }
        ByteBuffer byteBufferF0 = byteBufferChannelV0.F0();
        if (byteBufferF0 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = byteBufferChannelV0.Y().capacity;
        long totalBytesWritten = byteBufferChannelV0.getTotalBytesWritten();
        try {
            io.ktor.utils.io.internal.c cVarV = byteBufferChannelV0.V();
            if (cVarV != null) {
                io.ktor.utils.io.b.b(cVarV.c());
                throw new KotlinNothingValueException();
            }
            int iO = iVar.o((int) Math.min(packet.J0(), byteBufferF0.remaining()));
            if (iO > 0) {
                byteBufferF0.limit(byteBufferF0.position() + iO);
                ll0.i.b(packet, byteBufferF0);
                byteBufferChannelV0.M(byteBufferF0, iVar, iO);
            }
            if (iVar.h() || byteBufferChannelV0.getAutoFlush()) {
                byteBufferChannelV0.flush();
            }
            if (byteBufferChannelV0 != this) {
                D0(getTotalBytesWritten() + (byteBufferChannelV0.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelV0.x0();
            byteBufferChannelV0.K0();
            return iO;
        } catch (Throwable th2) {
            if (iVar.h() || byteBufferChannelV0.getAutoFlush()) {
                byteBufferChannelV0.flush();
            }
            if (byteBufferChannelV0 != this) {
                D0(getTotalBytesWritten() + (byteBufferChannelV0.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelV0.x0();
            byteBufferChannelV0.K0();
            throw th2;
        }
    }

    private final void M(ByteBuffer byteBuffer, io.ktor.utils.io.internal.i iVar, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.writePosition = O(byteBuffer, this.writePosition + i11);
        iVar.c(i11);
        D0(getTotalBytesWritten() + ((long) i11));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object N0(ByteBufferChannel byteBufferChannel, int i11, wn0.l<? super ByteBuffer, h0> lVar, Continuation<? super h0> continuation) {
        k kVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i12 = kVar.f78607s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                kVar.f78607s = i12 - Integer.MIN_VALUE;
            } else {
                kVar = byteBufferChannel.new k(continuation);
            }
        } else {
            kVar = byteBufferChannel.new k(continuation);
        }
        Object obj = kVar.f78605q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = kVar.f78607s;
        if (i13 == 0) {
            jn0.t.b(obj);
            if (i11 <= 0) {
                throw new IllegalArgumentException("min should be positive");
            }
            if (i11 > 4088) {
                throw new IllegalArgumentException(("Min(" + i11 + ") should'nt be greater than (4088)").toString());
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = kVar.f78604p;
            wn0.l<? super ByteBuffer, h0> lVar2 = (wn0.l) kVar.f78603o;
            ByteBufferChannel byteBufferChannel2 = (ByteBufferChannel) kVar.f78602n;
            jn0.t.b(obj);
            i11 = i14;
            byteBufferChannel = byteBufferChannel2;
            lVar = lVar2;
        }
        while (byteBufferChannel.Q0(i11, lVar) < 0) {
            kVar.f78602n = byteBufferChannel;
            kVar.f78603o = lVar;
            kVar.f78604p = i11;
            kVar.f78607s = 1;
            if (byteBufferChannel.K(i11, lVar, kVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return h0.f84049a;
    }

    private final int O(ByteBuffer byteBuffer, int i11) {
        return i11 >= byteBuffer.capacity() - this.reservedSize ? i11 - (byteBuffer.capacity() - this.reservedSize) : i11;
    }

    private final int O0(ll0.a src) throws Throwable {
        ByteBufferChannel byteBufferChannelV0;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (byteBufferChannelV0 = v0(this, dVar)) == null) {
            byteBufferChannelV0 = this;
        }
        ByteBuffer byteBufferF0 = byteBufferChannelV0.F0();
        int i11 = 0;
        if (byteBufferF0 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = byteBufferChannelV0.Y().capacity;
        long totalBytesWritten = byteBufferChannelV0.getTotalBytesWritten();
        try {
            io.ktor.utils.io.internal.c cVarV = byteBufferChannelV0.V();
            if (cVarV != null) {
                io.ktor.utils.io.b.b(cVarV.c());
                throw new KotlinNothingValueException();
            }
            while (true) {
                int iO = iVar.o(Math.min(src.getWritePosition() - src.getReadPosition(), byteBufferF0.remaining()));
                if (iO == 0) {
                    break;
                }
                ll0.g.c(src, byteBufferF0, iO);
                i11 += iO;
                byteBufferChannelV0.e0(byteBufferF0, byteBufferChannelV0.O(byteBufferF0, byteBufferChannelV0.writePosition + i11), iVar._availableForWrite$internal);
            }
            byteBufferChannelV0.M(byteBufferF0, iVar, i11);
            if (iVar.h() || byteBufferChannelV0.getAutoFlush()) {
                byteBufferChannelV0.flush();
            }
            if (byteBufferChannelV0 != this) {
                D0(getTotalBytesWritten() + (byteBufferChannelV0.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelV0.x0();
            byteBufferChannelV0.K0();
            return i11;
        } catch (Throwable th2) {
            if (iVar.h() || byteBufferChannelV0.getAutoFlush()) {
                byteBufferChannelV0.flush();
            }
            if (byteBufferChannelV0 != this) {
                D0(getTotalBytesWritten() + (byteBufferChannelV0.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelV0.x0();
            byteBufferChannelV0.K0();
            throw th2;
        }
    }

    private final int P0(byte[] src, int offset, int length) throws Throwable {
        ByteBufferChannel byteBufferChannelV0;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (byteBufferChannelV0 = v0(this, dVar)) == null) {
            byteBufferChannelV0 = this;
        }
        ByteBuffer byteBufferF0 = byteBufferChannelV0.F0();
        int i11 = 0;
        if (byteBufferF0 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = byteBufferChannelV0.Y().capacity;
        long totalBytesWritten = byteBufferChannelV0.getTotalBytesWritten();
        try {
            io.ktor.utils.io.internal.c cVarV = byteBufferChannelV0.V();
            if (cVarV != null) {
                io.ktor.utils.io.b.b(cVarV.c());
                throw new KotlinNothingValueException();
            }
            while (true) {
                int iO = iVar.o(Math.min(length - i11, byteBufferF0.remaining()));
                if (iO == 0) {
                    byteBufferChannelV0.M(byteBufferF0, iVar, i11);
                    if (iVar.h() || byteBufferChannelV0.getAutoFlush()) {
                        byteBufferChannelV0.flush();
                    }
                    if (byteBufferChannelV0 != this) {
                        D0(getTotalBytesWritten() + (byteBufferChannelV0.getTotalBytesWritten() - totalBytesWritten));
                    }
                    byteBufferChannelV0.x0();
                    byteBufferChannelV0.K0();
                    return i11;
                }
                if (iO <= 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                byteBufferF0.put(src, offset + i11, iO);
                i11 += iO;
                byteBufferChannelV0.e0(byteBufferF0, byteBufferChannelV0.O(byteBufferF0, byteBufferChannelV0.writePosition + i11), iVar._availableForWrite$internal);
            }
        } catch (Throwable th2) {
            if (iVar.h() || byteBufferChannelV0.getAutoFlush()) {
                byteBufferChannelV0.flush();
            }
            if (byteBufferChannelV0 != this) {
                D0(getTotalBytesWritten() + (byteBufferChannelV0.getTotalBytesWritten() - totalBytesWritten));
            }
            byteBufferChannelV0.x0();
            byteBufferChannelV0.K0();
            throw th2;
        }
    }

    static /* synthetic */ Object R(ByteBufferChannel byteBufferChannel, long j11, Continuation<? super Long> continuation) throws Throwable {
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("max shouldn't be negative: " + j11).toString());
        }
        ByteBuffer byteBufferE0 = byteBufferChannel.E0();
        if (byteBufferE0 != null) {
            io.ktor.utils.io.internal.i iVar = byteBufferChannel.Y().capacity;
            try {
                if (iVar._availableForRead$internal != 0) {
                    int iL = iVar.l((int) Math.min(2147483647L, j11));
                    byteBufferChannel.L(byteBufferE0, iVar, iL);
                    j12 = iL;
                }
            } finally {
                byteBufferChannel.w0();
                byteBufferChannel.K0();
            }
        }
        long j13 = j12;
        return (j13 == j11 || byteBufferChannel.o()) ? Boxing.boxLong(j13) : byteBufferChannel.S(j13, j11, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[Catch: all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:21:0x005b, B:32:0x0083), top: B:39:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0065 A[EDGE_INSN: B:42:0x0065->B:24:0x0065 BREAK  A[LOOP:0: B:15:0x0048->B:33:0x009c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0077 -> B:29:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object S(long r10, long r12, p013kotlin.coroutines.Continuation<? super java.lang.Long> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof io.ktor.utils.io.ByteBufferChannel.e
            if (r0 == 0) goto L13
            r0 = r14
            io.ktor.utils.io.a$e r0 = (io.ktor.utils.io.ByteBufferChannel.e) r0
            int r1 = r0.f78571s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78571s = r1
            goto L18
        L13:
            io.ktor.utils.io.a$e r0 = new io.ktor.utils.io.a$e
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f78569q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78571s
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            long r10 = r0.f78568p
            java.lang.Object r12 = r0.f78567o
            kotlin.jvm.internal.m0 r12 = (p013kotlin.jvm.internal.m0) r12
            java.lang.Object r13 = r0.f78566n
            io.ktor.utils.io.a r13 = (io.ktor.utils.io.ByteBufferChannel) r13
            jn0.t.b(r14)
            goto L7a
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            jn0.t.b(r14)
            kotlin.jvm.internal.m0 r14 = new kotlin.jvm.internal.m0
            r14.<init>()
            r14.f86528a = r10
            r10 = r12
            r12 = r14
            r13 = r9
        L48:
            long r4 = r12.f86528a
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 >= 0) goto Lab
            java.nio.ByteBuffer r14 = r13.E0()
            if (r14 != 0) goto L55
            goto L65
        L55:
            io.ktor.utils.io.internal.g r2 = r13.Y()
            io.ktor.utils.io.internal.i r2 = r2.capacity
            int r4 = r2._availableForRead$internal     // Catch: java.lang.Throwable -> La3
            if (r4 != 0) goto L83
            r13.w0()
            r13.K0()
        L65:
            boolean r14 = r13.o()
            if (r14 != 0) goto Lab
            r0.f78566n = r13
            r0.f78567o = r12
            r0.f78568p = r10
            r0.f78571s = r3
            java.lang.Object r14 = r13.p0(r3, r0)
            if (r14 != r1) goto L7a
            return r1
        L7a:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L48
            goto Lab
        L83:
            long r4 = r12.f86528a     // Catch: java.lang.Throwable -> La3
            long r4 = r10 - r4
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = java.lang.Math.min(r6, r4)     // Catch: java.lang.Throwable -> La3
            int r4 = (int) r4     // Catch: java.lang.Throwable -> La3
            int r4 = r2.l(r4)     // Catch: java.lang.Throwable -> La3
            r13.L(r14, r2, r4)     // Catch: java.lang.Throwable -> La3
            long r5 = r12.f86528a     // Catch: java.lang.Throwable -> La3
            long r7 = (long) r4     // Catch: java.lang.Throwable -> La3
            long r5 = r5 + r7
            r12.f86528a = r5     // Catch: java.lang.Throwable -> La3
            r13.w0()
            r13.K0()
            goto L48
        La3:
            r10 = move-exception
            r13.w0()
            r13.K0()
            throw r10
        Lab:
            long r10 = r12.f86528a
            java.lang.Long r10 = p013kotlin.coroutines.jvm.internal.Boxing.boxLong(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.S(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object S0(ByteBufferChannel byteBufferChannel, byte[] bArr, int i11, int i12, Continuation<? super Integer> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelV0;
        io.ktor.utils.io.internal.d dVar = byteBufferChannel.joining;
        if (dVar != null && (byteBufferChannelV0 = byteBufferChannel.v0(byteBufferChannel, dVar)) != null) {
            return byteBufferChannelV0.R0(bArr, i11, i12, continuation);
        }
        int iP0 = byteBufferChannel.P0(bArr, i11, i12);
        return iP0 > 0 ? Boxing.boxInt(iP0) : byteBufferChannel.a1(bArr, i11, i12, continuation);
    }

    private final void T(io.ktor.utils.io.internal.d joined) {
        io.ktor.utils.io.internal.c cVarV = V();
        if (cVarV == null) {
            return;
        }
        this.joining = null;
        if (!joined.getDelegateClose()) {
            joined.getDelegatedTo().flush();
            joined.a();
            return;
        }
        io.ktor.utils.io.internal.g gVarY = joined.getDelegatedTo().Y();
        boolean z11 = (gVarY instanceof io.ktor.utils.io.internal.g.C1678g) || (gVarY instanceof io.ktor.utils.io.internal.g.e);
        if (cVarV.getCause() == null && z11) {
            joined.getDelegatedTo().flush();
        } else {
            joined.getDelegatedTo().close(cVarV.getCause());
        }
        joined.a();
    }

    static /* synthetic */ Object T0(ByteBufferChannel byteBufferChannel, ll0.a aVar, Continuation<? super h0> continuation) throws Throwable {
        byteBufferChannel.O0(aVar);
        if (aVar.getWritePosition() <= aVar.getReadPosition()) {
            return h0.f84049a;
        }
        Object objV0 = byteBufferChannel.V0(aVar, continuation);
        return objV0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objV0 : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(int minWriteSize) {
        io.ktor.utils.io.internal.g gVarY;
        io.ktor.utils.io.internal.g.f fVar;
        ByteBufferChannel byteBufferChannelC;
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar != null && (byteBufferChannelC = dVar.getDelegatedTo()) != null) {
            byteBufferChannelC.flush();
        }
        do {
            gVarY = Y();
            fVar = io.ktor.utils.io.internal.g.f.f78764c;
            if (gVarY == fVar) {
                return;
            } else {
                gVarY.capacity.e();
            }
        } while (gVarY != Y());
        int i11 = gVarY.capacity._availableForWrite$internal;
        if (gVarY.capacity._availableForRead$internal >= 1) {
            z0();
        }
        io.ktor.utils.io.internal.d dVar2 = this.joining;
        if (i11 >= minWriteSize) {
            if (dVar2 == null || Y() == fVar) {
                A0();
            }
        }
    }

    static /* synthetic */ Object U0(ByteBufferChannel byteBufferChannel, byte[] bArr, int i11, int i12, Continuation<? super h0> continuation) throws Throwable {
        ByteBufferChannel byteBufferChannelV0;
        io.ktor.utils.io.internal.d dVar = byteBufferChannel.joining;
        if (dVar != null && (byteBufferChannelV0 = byteBufferChannel.v0(byteBufferChannel, dVar)) != null) {
            Object objL = byteBufferChannelV0.l(bArr, i11, i12, continuation);
            return objL == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : h0.f84049a;
        }
        while (i12 > 0) {
            int iP0 = byteBufferChannel.P0(bArr, i11, i12);
            if (iP0 == 0) {
                break;
            }
            i11 += iP0;
            i12 -= iP0;
        }
        if (i12 == 0) {
            return h0.f84049a;
        }
        Object objW0 = byteBufferChannel.W0(bArr, i11, i12, continuation);
        return objW0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objW0 : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ktor.utils.io.internal.c V() {
        return (io.ktor.utils.io.internal.c) this._closed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[PHI: r2 r7
      0x005b: PHI (r2v3 io.ktor.utils.io.a) = (r2v2 io.ktor.utils.io.a), (r2v6 io.ktor.utils.io.a) binds: [B:20:0x0058, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r7v3 ll0.a) = (r7v1 ll0.a), (r7v7 ll0.a) binds: [B:20:0x0058, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:22:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object V0(ll0.a r7, p013kotlin.coroutines.Continuation<? super jn0.h0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.utils.io.ByteBufferChannel.l
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.utils.io.a$l r0 = (io.ktor.utils.io.ByteBufferChannel.l) r0
            int r1 = r0.f78612r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78612r = r1
            goto L18
        L13:
            io.ktor.utils.io.a$l r0 = new io.ktor.utils.io.a$l
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f78610p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78612r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r8)
            goto L73
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f78609o
            ll0.a r7 = (ll0.a) r7
            java.lang.Object r2 = r0.f78608n
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            jn0.t.b(r8)
            goto L5b
        L40:
            jn0.t.b(r8)
            r2 = r6
        L44:
            int r8 = r7.getWritePosition()
            int r5 = r7.getReadPosition()
            if (r8 <= r5) goto L7a
            r0.f78608n = r2
            r0.f78609o = r7
            r0.f78612r = r4
            java.lang.Object r8 = r2.M0(r4, r0)
            if (r8 != r1) goto L5b
            goto L72
        L5b:
            io.ktor.utils.io.internal.d r8 = r2.joining
            if (r8 == 0) goto L76
            io.ktor.utils.io.a r8 = r2.v0(r2, r8)
            if (r8 == 0) goto L76
            r2 = 0
            r0.f78608n = r2
            r0.f78609o = r2
            r0.f78612r = r3
            java.lang.Object r7 = r8.k(r7, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        L76:
            r2.O0(r7)
            goto L44
        L7a:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.V0(ll0.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0054 -> B:20:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object W0(byte[] r6, int r7, int r8, p013kotlin.coroutines.Continuation<? super jn0.h0> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.ByteBufferChannel.m
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.a$m r0 = (io.ktor.utils.io.ByteBufferChannel.m) r0
            int r1 = r0.f78619t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78619t = r1
            goto L18
        L13:
            io.ktor.utils.io.a$m r0 = new io.ktor.utils.io.a$m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f78617r
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78619t
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.f78616q
            int r7 = r0.f78615p
            java.lang.Object r8 = r0.f78614o
            byte[] r8 = (byte[]) r8
            java.lang.Object r2 = r0.f78613n
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            jn0.t.b(r9)
            goto L57
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            jn0.t.b(r9)
            r2 = r5
        L41:
            if (r8 <= 0) goto L63
            r0.f78613n = r2
            r0.f78614o = r6
            r0.f78615p = r7
            r0.f78616q = r8
            r0.f78619t = r3
            java.lang.Object r9 = r2.R0(r6, r7, r8, r0)
            if (r9 != r1) goto L54
            return r1
        L54:
            r4 = r8
            r8 = r6
            r6 = r4
        L57:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r7 = r7 + r9
            int r6 = r6 - r9
            r4 = r8
            r8 = r6
            r6 = r4
            goto L41
        L63:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.W0(byte[], int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Continuation<Boolean> X() {
        return (Continuation) this._readOp;
    }

    static /* synthetic */ Object X0(ByteBufferChannel byteBufferChannel, ll0.k kVar, Continuation<? super h0> continuation) {
        ByteBufferChannel byteBufferChannelV0;
        ByteBufferChannel byteBufferChannelV1;
        io.ktor.utils.io.internal.d dVar = byteBufferChannel.joining;
        if (dVar != null && (byteBufferChannelV1 = byteBufferChannel.v0(byteBufferChannel, dVar)) != null) {
            Object objJ = byteBufferChannelV1.j(kVar, continuation);
            return objJ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ : h0.f84049a;
        }
        while (!kVar.w0() && byteBufferChannel.L0(kVar) != 0) {
            try {
            } catch (Throwable th2) {
                kVar.release();
                throw th2;
            }
        }
        if (kVar.J0() <= 0) {
            return h0.f84049a;
        }
        io.ktor.utils.io.internal.d dVar2 = byteBufferChannel.joining;
        if (dVar2 == null || (byteBufferChannelV0 = byteBufferChannel.v0(byteBufferChannel, dVar2)) == null) {
            Object objY0 = byteBufferChannel.Y0(kVar, continuation);
            return objY0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objY0 : h0.f84049a;
        }
        Object objJ2 = byteBufferChannelV0.j(kVar, continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : h0.f84049a;
    }

    private final io.ktor.utils.io.internal.g Y() {
        return (io.ktor.utils.io.internal.g) this._state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0050 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0075, B:20:0x0042, B:28:0x005d, B:30:0x0061, B:32:0x0067, B:38:0x007b, B:23:0x004a, B:25:0x0050), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[Catch: all -> 0x0030, PHI: r2 r6
      0x005d: PHI (r2v3 io.ktor.utils.io.a) = (r2v2 io.ktor.utils.io.a), (r2v6 io.ktor.utils.io.a) binds: [B:26:0x005a, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r6v4 ll0.k) = (r6v2 ll0.k), (r6v7 ll0.k) binds: [B:26:0x005a, B:20:0x0042] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0075, B:20:0x0042, B:28:0x005d, B:30:0x0061, B:32:0x0067, B:38:0x007b, B:23:0x004a, B:25:0x0050), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0075, B:20:0x0042, B:28:0x005d, B:30:0x0061, B:32:0x0067, B:38:0x007b, B:23:0x004a, B:25:0x0050), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:28:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object Y0(ll0.k r6, p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteBufferChannel.n
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$n r0 = (io.ktor.utils.io.ByteBufferChannel.n) r0
            int r1 = r0.f78624r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78624r = r1
            goto L18
        L13:
            io.ktor.utils.io.a$n r0 = new io.ktor.utils.io.a$n
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f78622p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78624r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f78620n
            ll0.k r6 = (ll0.k) r6
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L30
            goto L75
        L30:
            r7 = move-exception
            goto L85
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f78621o
            ll0.k r6 = (ll0.k) r6
            java.lang.Object r2 = r0.f78620n
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L30
            goto L5d
        L46:
            jn0.t.b(r7)
            r2 = r5
        L4a:
            boolean r7 = r6.w0()     // Catch: java.lang.Throwable -> L30
            if (r7 != 0) goto L7f
            r0.f78620n = r2     // Catch: java.lang.Throwable -> L30
            r0.f78621o = r6     // Catch: java.lang.Throwable -> L30
            r0.f78624r = r4     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r2.Z0(r4, r0)     // Catch: java.lang.Throwable -> L30
            if (r7 != r1) goto L5d
            goto L74
        L5d:
            io.ktor.utils.io.internal.d r7 = r2.joining     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L7b
            io.ktor.utils.io.a r7 = r2.v0(r2, r7)     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L7b
            r0.f78620n = r6     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r0.f78621o = r2     // Catch: java.lang.Throwable -> L30
            r0.f78624r = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r7 = r7.j(r6, r0)     // Catch: java.lang.Throwable -> L30
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            jn0.h0 r7 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L30
            r6.release()
            return r7
        L7b:
            r2.L0(r6)     // Catch: java.lang.Throwable -> L30
            goto L4a
        L7f:
            r6.release()
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        L85:
            r6.release()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.Y0(ll0.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(int i11, Continuation<? super h0> continuation) throws Throwable {
        p pVar;
        ByteBufferChannel byteBufferChannel;
        Throwable thC;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i12 = pVar.f78636r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                pVar.f78636r = i12 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object obj = pVar.f78634p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = pVar.f78636r;
        if (i13 == 0) {
            jn0.t.b(obj);
            byteBufferChannel = this;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = pVar.f78633o;
            byteBufferChannel = (ByteBufferChannel) pVar.f78632n;
            jn0.t.b(obj);
        }
        while (byteBufferChannel.c1(i11)) {
            pVar.f78632n = byteBufferChannel;
            pVar.f78633o = i11;
            pVar.f78636r = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(pVar), 1);
            cancellableContinuationImpl.initCancellability();
            byteBufferChannel.b1(i11, cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(pVar);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        io.ktor.utils.io.internal.c cVarV = byteBufferChannel.V();
        if (cVarV == null || (thC = cVarV.c()) == null) {
            return h0.f84049a;
        }
        io.ktor.utils.io.b.b(thC);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[PHI: r2 r7 r8 r9
      0x005c: PHI (r2v3 io.ktor.utils.io.a) = (r2v2 io.ktor.utils.io.a), (r2v6 io.ktor.utils.io.a) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r7v2 byte[]) = (r7v1 byte[]), (r7v6 byte[]) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r9v2 int) = (r9v1 int), (r9v5 int) binds: [B:19:0x0059, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:21:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a1(byte[] r7, int r8, int r9, p013kotlin.coroutines.Continuation<? super java.lang.Integer> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.ByteBufferChannel.o
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.a$o r0 = (io.ktor.utils.io.ByteBufferChannel.o) r0
            int r1 = r0.f78631t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78631t = r1
            goto L18
        L13:
            io.ktor.utils.io.a$o r0 = new io.ktor.utils.io.a$o
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f78629r
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78631t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            jn0.t.b(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            int r7 = r0.f78628q
            int r8 = r0.f78627p
            java.lang.Object r9 = r0.f78626o
            byte[] r9 = (byte[]) r9
            java.lang.Object r2 = r0.f78625n
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            jn0.t.b(r10)
            r5 = r9
            r9 = r7
            r7 = r5
            goto L5c
        L47:
            jn0.t.b(r10)
            r2 = r6
        L4b:
            r0.f78625n = r2
            r0.f78626o = r7
            r0.f78627p = r8
            r0.f78628q = r9
            r0.f78631t = r4
            java.lang.Object r10 = r2.M0(r4, r0)
            if (r10 != r1) goto L5c
            goto L73
        L5c:
            io.ktor.utils.io.internal.d r10 = r2.joining
            if (r10 == 0) goto L75
            io.ktor.utils.io.a r10 = r2.v0(r2, r10)
            if (r10 == 0) goto L75
            r2 = 0
            r0.f78625n = r2
            r0.f78626o = r2
            r0.f78631t = r3
            java.lang.Object r7 = r10.a1(r7, r8, r9, r0)
            if (r7 != r1) goto L74
        L73:
            return r1
        L74:
            return r7
        L75:
            int r10 = r2.P0(r7, r8, r9)
            if (r10 <= 0) goto L4b
            java.lang.Integer r7 = p013kotlin.coroutines.jvm.internal.Boxing.boxInt(r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.a1(byte[], int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Continuation<h0> b0() {
        return (Continuation) this._writeOp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(int size, CancellableContinuation<? super h0> c11) throws Throwable {
        Throwable thC;
        while (true) {
            io.ktor.utils.io.internal.c cVarV = V();
            if (cVarV != null && (thC = cVarV.c()) != null) {
                io.ktor.utils.io.b.b(thC);
                throw new KotlinNothingValueException();
            }
            if (!c1(size)) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                c11.resumeWith(jn0.s.b(h0.f84049a));
                break;
            }
            while (true) {
                if (b0() != null) {
                    throw new IllegalStateException("Operation is already in progress");
                }
                if (!c1(size)) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f78535p;
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, null, c11)) {
                    if (!c1(size) && androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c11, null)) {
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        U(size);
        if (G0()) {
            z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c1(int size) {
        io.ktor.utils.io.internal.d dVar = this.joining;
        io.ktor.utils.io.internal.g gVarY = Y();
        if (V() != null) {
            return false;
        }
        if (dVar == null) {
            return gVarY.capacity._availableForWrite$internal < size && gVarY != io.ktor.utils.io.internal.g.a.f78754c;
        }
        return (gVarY == io.ktor.utils.io.internal.g.f.f78764c || (gVarY instanceof io.ktor.utils.io.internal.g.C1678g) || (gVarY instanceof io.ktor.utils.io.internal.g.e)) ? false : true;
    }

    private final io.ktor.utils.io.internal.g.c d0() {
        io.ktor.utils.io.internal.g.c cVarS2 = this.pool.S2();
        cVarS2.capacity.j();
        return cVarS2;
    }

    private final void e0(ByteBuffer byteBuffer, int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byteBuffer.limit(bo0.n.j(i12 + i11, byteBuffer.capacity() - this.reservedSize));
        byteBuffer.position(i11);
    }

    private final int g0(ll0.a dst, int consumed, int max) throws Throwable {
        int iL;
        do {
            ByteBuffer byteBufferE0 = E0();
            boolean z11 = false;
            if (byteBufferE0 == null) {
                iL = 0;
            } else {
                io.ktor.utils.io.internal.i iVar = Y().capacity;
                try {
                    if (iVar._availableForRead$internal == 0) {
                        w0();
                        K0();
                        iL = 0;
                    } else {
                        int limit = dst.getLimit() - dst.getWritePosition();
                        iL = iVar.l(Math.min(byteBufferE0.remaining(), Math.min(limit, max)));
                        if (iL > 0) {
                            if (limit < byteBufferE0.remaining()) {
                                byteBufferE0.limit(byteBufferE0.position() + limit);
                            }
                            ll0.e.a(dst, byteBufferE0);
                            L(byteBufferE0, iVar, iL);
                            z11 = true;
                        }
                        w0();
                        K0();
                    }
                } catch (Throwable th2) {
                    w0();
                    K0();
                    throw th2;
                }
            }
            consumed += iL;
            max -= iL;
            if (!z11 || dst.getLimit() <= dst.getWritePosition()) {
                break;
            }
        } while (Y().capacity._availableForRead$internal > 0);
        return consumed;
    }

    private final int h0(byte[] dst, int offset, int length) throws Throwable {
        ByteBuffer byteBufferE0 = E0();
        int i11 = 0;
        if (byteBufferE0 == null) {
            return 0;
        }
        io.ktor.utils.io.internal.i iVar = Y().capacity;
        try {
            if (iVar._availableForRead$internal != 0) {
                int iCapacity = byteBufferE0.capacity() - this.reservedSize;
                while (true) {
                    int i12 = length - i11;
                    if (i12 == 0) {
                        break;
                    }
                    int i13 = this.readPosition;
                    int iL = iVar.l(Math.min(iCapacity - i13, i12));
                    if (iL == 0) {
                        break;
                    }
                    byteBufferE0.limit(i13 + iL);
                    byteBufferE0.position(i13);
                    byteBufferE0.get(dst, offset + i11, iL);
                    L(byteBufferE0, iVar, iL);
                    i11 += iL;
                }
            }
            return i11;
        } finally {
            w0();
            K0();
        }
    }

    static /* synthetic */ int i0(ByteBufferChannel byteBufferChannel, ll0.a aVar, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAsMuchAsPossible");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = aVar.getLimit() - aVar.getWritePosition();
        }
        return byteBufferChannel.g0(aVar, i11, i12);
    }

    static /* synthetic */ Object j0(ByteBufferChannel byteBufferChannel, ml0.a aVar, Continuation<? super Integer> continuation) {
        int iI0 = i0(byteBufferChannel, aVar, 0, 0, 6, null);
        if (iI0 == 0 && byteBufferChannel.V() != null) {
            iI0 = byteBufferChannel.Y().capacity.e() ? i0(byteBufferChannel, aVar, 0, 0, 6, null) : -1;
        } else if (iI0 <= 0 && aVar.getLimit() > aVar.getWritePosition()) {
            return byteBufferChannel.l0(aVar, continuation);
        }
        return Boxing.boxInt(iI0);
    }

    static /* synthetic */ Object k0(ByteBufferChannel byteBufferChannel, byte[] bArr, int i11, int i12, Continuation<? super Integer> continuation) throws Throwable {
        int iH0 = byteBufferChannel.h0(bArr, i11, i12);
        if (iH0 == 0 && byteBufferChannel.V() != null) {
            iH0 = byteBufferChannel.Y().capacity.e() ? byteBufferChannel.h0(bArr, i11, i12) : -1;
        } else if (iH0 <= 0 && i12 != 0) {
            return byteBufferChannel.m0(bArr, i11, i12, continuation);
        }
        return Boxing.boxInt(iH0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l0(ml0.a aVar, Continuation<? super Integer> continuation) throws Throwable {
        g gVar;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f78583r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f78583r = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objP0 = gVar.f78581p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar.f78583r;
        if (i12 == 0) {
            jn0.t.b(objP0);
            gVar.f78579n = this;
            gVar.f78580o = aVar;
            gVar.f78583r = 1;
            objP0 = p0(1, gVar);
            if (objP0 != coroutine_suspended) {
                byteBufferChannel = this;
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objP0);
            return objP0;
        }
        aVar = (ml0.a) gVar.f78580o;
        byteBufferChannel = (ByteBufferChannel) gVar.f78579n;
        jn0.t.b(objP0);
        if (!((Boolean) objP0).booleanValue()) {
            return Boxing.boxInt(-1);
        }
        gVar.f78579n = null;
        gVar.f78580o = null;
        gVar.f78583r = 2;
        Object objB = byteBufferChannel.b(aVar, gVar);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m0(byte[] bArr, int i11, int i12, Continuation<? super Integer> continuation) throws Throwable {
        f fVar;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i13 = fVar.f78578t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f78578t = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objP0 = fVar.f78576r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = fVar.f78578t;
        if (i14 == 0) {
            jn0.t.b(objP0);
            fVar.f78572n = this;
            fVar.f78573o = bArr;
            fVar.f78574p = i11;
            fVar.f78575q = i12;
            fVar.f78578t = 1;
            objP0 = p0(1, fVar);
            if (objP0 != coroutine_suspended) {
                byteBufferChannel = this;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(objP0);
            return objP0;
        }
        i12 = fVar.f78575q;
        i11 = fVar.f78574p;
        bArr = (byte[]) fVar.f78573o;
        byteBufferChannel = (ByteBufferChannel) fVar.f78572n;
        jn0.t.b(objP0);
        if (!((Boolean) objP0).booleanValue()) {
            return Boxing.boxInt(-1);
        }
        fVar.f78572n = null;
        fVar.f78573o = null;
        fVar.f78578t = 2;
        Object objI = byteBufferChannel.i(bArr, i11, i12, fVar);
        return objI == coroutine_suspended ? coroutine_suspended : objI;
    }

    static /* synthetic */ Object n0(ByteBufferChannel byteBufferChannel, long j11, Continuation<? super ll0.k> continuation) throws Throwable {
        if (!byteBufferChannel.c0()) {
            return byteBufferChannel.o0(j11, continuation);
        }
        Throwable thH = byteBufferChannel.h();
        if (thH == null) {
            return byteBufferChannel.t0(j11);
        }
        io.ktor.utils.io.b.b(thH);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0072 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x008a A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af A[PHI: r2 r4 r5 r6 r13
      0x00af: PHI (r2v3 kotlin.jvm.internal.m0) = (r2v4 kotlin.jvm.internal.m0), (r2v4 kotlin.jvm.internal.m0), (r2v6 kotlin.jvm.internal.m0) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r4v3 ll0.j) = (r4v14 ll0.j), (r4v15 ll0.j), (r4v16 ll0.j) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r5v1 io.ktor.utils.io.a) = (r5v2 io.ktor.utils.io.a), (r5v2 io.ktor.utils.io.a), (r5v4 io.ktor.utils.io.a) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r6v1 ml0.a) = (r6v2 ml0.a), (r6v2 ml0.a), (r6v5 ml0.a) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x00af: PHI (r13v2 ll0.r) = (r13v15 ll0.r), (r13v16 ll0.r), (r13v17 ll0.r) binds: [B:25:0x0088, B:27:0x008e, B:33:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:12:0x0039, B:32:0x00a4, B:37:0x00b2, B:21:0x0062, B:23:0x0072, B:24:0x0076, B:26:0x008a, B:28:0x0090), top: B:53:0x0039, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:32:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00af -> B:36:0x00b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object o0(long r12, p013kotlin.coroutines.Continuation<? super ll0.k> r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.o0(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object p0(int i11, Continuation<? super Boolean> continuation) throws Throwable {
        if (Y().capacity._availableForRead$internal >= i11) {
            return Boxing.boxBoolean(true);
        }
        io.ktor.utils.io.internal.c cVarV = V();
        if (cVarV == null) {
            return i11 == 1 ? q0(1, continuation) : r0(i11, continuation);
        }
        Throwable cause = cVarV.getCause();
        if (cause != null) {
            io.ktor.utils.io.b.b(cause);
            throw new KotlinNothingValueException();
        }
        io.ktor.utils.io.internal.i iVar = Y().capacity;
        boolean z11 = iVar.e() && iVar._availableForRead$internal >= i11;
        if (X() == null) {
            return Boxing.boxBoolean(z11);
        }
        throw new IllegalStateException("Read operation is already in progress");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q0(int i11, Continuation<? super Boolean> continuation) throws Throwable {
        i iVar;
        ByteBufferChannel byteBufferChannel;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i12 = iVar.f78596r;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                iVar.f78596r = i12 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.f78594p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = iVar.f78596r;
        if (i13 == 0) {
            jn0.t.b(obj);
            io.ktor.utils.io.internal.g gVarY = Y();
            if (gVarY.capacity._availableForRead$internal >= i11 || !(this.joining == null || b0() == null || (gVarY != io.ktor.utils.io.internal.g.a.f78754c && !(gVarY instanceof io.ktor.utils.io.internal.g.b)))) {
                return Boxing.boxBoolean(true);
            }
            try {
                iVar.f78592n = this;
                iVar.f78593o = i11;
                iVar.f78596r = 1;
                io.ktor.utils.io.internal.b<Boolean> bVar = this.readSuspendContinuationCache;
                H0(i11, bVar);
                Object objE = bVar.e(IntrinsicsKt.intercepted(iVar));
                if (objE == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(iVar);
                }
                return objE == coroutine_suspended ? coroutine_suspended : objE;
            } catch (Throwable th2) {
                th = th2;
                byteBufferChannel = this;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteBufferChannel = (ByteBufferChannel) iVar.f78592n;
            try {
                jn0.t.b(obj);
                return obj;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        byteBufferChannel.B0(null);
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0092 -> B:39:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object r0(int r6, p013kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.ByteBufferChannel.j
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.utils.io.a$j r0 = (io.ktor.utils.io.ByteBufferChannel.j) r0
            int r1 = r0.f78601r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78601r = r1
            goto L18
        L13:
            io.ktor.utils.io.a$j r0 = new io.ktor.utils.io.a$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f78599p
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78601r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            int r6 = r0.f78598o
            java.lang.Object r2 = r0.f78597n
            io.ktor.utils.io.a r2 = (io.ktor.utils.io.ByteBufferChannel) r2
            jn0.t.b(r7)
            goto L95
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            jn0.t.b(r7)
            r2 = r5
        L3c:
            io.ktor.utils.io.internal.g r7 = r2.Y()
            io.ktor.utils.io.internal.i r7 = r7.capacity
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L4b
            java.lang.Boolean r6 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r6
        L4b:
            io.ktor.utils.io.internal.c r7 = r2.V()
            if (r7 == 0) goto L88
            java.lang.Throwable r0 = r7.getCause()
            if (r0 != 0) goto L7b
            io.ktor.utils.io.internal.g r7 = r2.Y()
            io.ktor.utils.io.internal.i r7 = r7.capacity
            boolean r0 = r7.e()
            if (r0 == 0) goto L68
            int r7 = r7._availableForRead$internal
            if (r7 < r6) goto L68
            r3 = r4
        L68:
            kotlin.coroutines.Continuation r6 = r2.X()
            if (r6 != 0) goto L73
            java.lang.Boolean r6 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r6
        L73:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Read operation is already in progress"
            r6.<init>(r7)
            throw r6
        L7b:
            java.lang.Throwable r6 = r7.getCause()
            io.ktor.utils.io.b.a(r6)
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        L88:
            r0.f78597n = r2
            r0.f78598o = r6
            r0.f78601r = r4
            java.lang.Object r7 = r2.q0(r6, r0)
            if (r7 != r1) goto L95
            return r1
        L95:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L3c
            java.lang.Boolean r6 = p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.r0(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void s0(io.ktor.utils.io.internal.g.c buffer) {
        this.pool.F1(buffer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ll0.k t0(long limit) {
        ll0.j jVar = new ll0.j(null, 1, 0 == true ? 1 : 0);
        try {
            ml0.a aVarD = ml0.f.d(jVar, 1, null);
            while (true) {
                try {
                    if (aVarD.getLimit() - aVarD.getWritePosition() > limit) {
                        aVarD.u((int) limit);
                    }
                    limit -= (long) i0(this, aVarD, 0, 0, 6, null);
                    if (limit <= 0 || o()) {
                        break;
                    }
                    aVarD = ml0.f.d(jVar, 1, aVarD);
                } catch (Throwable th2) {
                    jVar.n();
                    throw th2;
                }
            }
            jVar.n();
            return jVar.T0();
        } catch (Throwable th3) {
            jVar.release();
            throw th3;
        }
    }

    private final ByteBufferChannel v0(ByteBufferChannel current, io.ktor.utils.io.internal.d joining) {
        while (current.Y() == io.ktor.utils.io.internal.g.f.f78764c) {
            current = joining.getDelegatedTo();
            joining = current.joining;
            if (joining == null) {
                return current;
            }
        }
        return null;
    }

    private final void w0() {
        Object obj;
        io.ktor.utils.io.internal.g gVarE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        io.ktor.utils.io.internal.g gVar = null;
        do {
            obj = this._state;
            io.ktor.utils.io.internal.g gVar2 = (io.ktor.utils.io.internal.g) obj;
            io.ktor.utils.io.internal.g.b bVar = (io.ktor.utils.io.internal.g.b) gVar;
            if (bVar != null) {
                bVar.capacity.j();
                A0();
                gVar = null;
            }
            gVarE = gVar2.e();
            if ((gVarE instanceof io.ktor.utils.io.internal.g.b) && Y() == gVar2 && gVarE.capacity.k()) {
                gVarE = io.ktor.utils.io.internal.g.a.f78754c;
                gVar = gVarE;
            }
            atomicReferenceFieldUpdater = f78532m;
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, gVarE));
        io.ktor.utils.io.internal.g.a aVar = io.ktor.utils.io.internal.g.a.f78754c;
        if (gVarE == aVar) {
            io.ktor.utils.io.internal.g.b bVar2 = (io.ktor.utils.io.internal.g.b) gVar;
            if (bVar2 != null) {
                s0(bVar2.getInitial());
            }
            A0();
            return;
        }
        if ((gVarE instanceof io.ktor.utils.io.internal.g.b) && gVarE.capacity.g() && gVarE.capacity.k() && androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, gVarE, aVar)) {
            gVarE.capacity.j();
            s0(((io.ktor.utils.io.internal.g.b) gVarE).getInitial());
            A0();
        }
    }

    private final void y0(Throwable cause) {
        Continuation continuation = (Continuation) f78534o.getAndSet(this, null);
        if (continuation != null) {
            if (cause != null) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                continuation.resumeWith(jn0.s.b(jn0.t.a(cause)));
            } else {
                continuation.resumeWith(jn0.s.b(Boolean.valueOf(Y().capacity._availableForRead$internal > 0)));
            }
        }
        Continuation continuation2 = (Continuation) f78535p.getAndSet(this, null);
        if (continuation2 != null) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            if (cause == null) {
                cause = new ClosedWriteChannelException("Byte channel was closed");
            }
            continuation2.resumeWith(jn0.s.b(jn0.t.a(cause)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0() {
        Continuation continuation = (Continuation) f78534o.getAndSet(this, null);
        if (continuation != null) {
            io.ktor.utils.io.internal.c cVarV = V();
            Throwable cause = cVarV != null ? cVarV.getCause() : null;
            if (cause != null) {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                continuation.resumeWith(jn0.s.b(jn0.t.a(cause)));
            } else {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                continuation.resumeWith(jn0.s.b(Boolean.TRUE));
            }
        }
    }

    public void C0(long j11) {
        this.totalBytesRead = j11;
    }

    public void D0(long j11) {
        this.totalBytesWritten = j11;
    }

    public final ByteBuffer F0() throws Throwable {
        Object obj;
        io.ktor.utils.io.internal.g gVar;
        io.ktor.utils.io.internal.g.a aVar;
        io.ktor.utils.io.internal.g gVarD;
        Continuation<h0> continuationB0 = b0();
        if (continuationB0 != null) {
            throw new IllegalStateException("Write operation is already in progress: " + continuationB0);
        }
        io.ktor.utils.io.internal.g gVar2 = null;
        io.ktor.utils.io.internal.g.c cVarD0 = null;
        do {
            obj = this._state;
            gVar = (io.ktor.utils.io.internal.g) obj;
            if (this.joining != null) {
                if (cVarD0 != null) {
                    s0(cVarD0);
                }
                return null;
            }
            if (V() != null) {
                if (cVarD0 != null) {
                    s0(cVarD0);
                }
                io.ktor.utils.io.internal.c cVarV = V();
                p013kotlin.jvm.internal.s.h(cVarV);
                io.ktor.utils.io.b.b(cVarV.c());
                throw new KotlinNothingValueException();
            }
            aVar = io.ktor.utils.io.internal.g.a.f78754c;
            if (gVar == aVar) {
                if (cVarD0 == null) {
                    cVarD0 = d0();
                }
                gVarD = cVarD0.d();
            } else {
                if (gVar == io.ktor.utils.io.internal.g.f.f78764c) {
                    if (cVarD0 != null) {
                        s0(cVarD0);
                    }
                    if (this.joining != null) {
                        return null;
                    }
                    io.ktor.utils.io.internal.c cVarV2 = V();
                    p013kotlin.jvm.internal.s.h(cVarV2);
                    io.ktor.utils.io.b.b(cVarV2.c());
                    throw new KotlinNothingValueException();
                }
                gVarD = gVar.d();
            }
        } while (!androidx.concurrent.futures.b.a(f78532m, this, obj, gVarD));
        if (V() != null) {
            x0();
            K0();
            io.ktor.utils.io.internal.c cVarV3 = V();
            p013kotlin.jvm.internal.s.h(cVarV3);
            io.ktor.utils.io.b.b(cVarV3.c());
            throw new KotlinNothingValueException();
        }
        ByteBuffer writeBuffer = gVarD.getWriteBuffer();
        if (cVarD0 != null) {
            if (gVar == null) {
                p013kotlin.jvm.internal.s.B("old");
            } else {
                gVar2 = gVar;
            }
            if (gVar2 != aVar) {
                s0(cVarD0);
            }
        }
        e0(writeBuffer, this.writePosition, gVarD.capacity._availableForWrite$internal);
        return writeBuffer;
    }

    public final boolean K0() {
        if (V() == null || !J0(false)) {
            return false;
        }
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar != null) {
            T(dVar);
        }
        z0();
        A0();
        return true;
    }

    public final Object M0(int i11, Continuation<? super h0> continuation) throws Throwable {
        Throwable thC;
        if (!c1(i11)) {
            io.ktor.utils.io.internal.c cVarV = V();
            if (cVarV == null || (thC = cVarV.c()) == null) {
                return h0.f84049a;
            }
            io.ktor.utils.io.b.b(thC);
            throw new KotlinNothingValueException();
        }
        this.writeSuspensionSize = i11;
        if (this.attachedJob != null) {
            Object objInvoke = this.writeSuspension.invoke(continuation);
            if (objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : h0.f84049a;
        }
        io.ktor.utils.io.internal.b<h0> bVar = this.writeSuspendContinuationCache;
        this.writeSuspension.invoke(bVar);
        Object objE = bVar.e(IntrinsicsKt.intercepted(continuation));
        if (objE == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : h0.f84049a;
    }

    public final void N(ByteBuffer buffer, io.ktor.utils.io.internal.i capacity, int count) {
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        p013kotlin.jvm.internal.s.k(capacity, "capacity");
        M(buffer, capacity, count);
    }

    /* JADX WARN: Code duplicated, block: B:153:0x033a A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0340 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0349 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:159:0x036c  */
    /* JADX WARN: Code duplicated, block: B:160:0x036d  */
    /* JADX WARN: Code duplicated, block: B:163:0x037a  */
    /* JADX WARN: Code duplicated, block: B:164:0x037c A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0383  */
    /* JADX WARN: Code duplicated, block: B:168:0x0385 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:171:0x038c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0394  */
    /* JADX WARN: Code duplicated, block: B:177:0x039c A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:195:0x03ff A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x011e A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0122 A[Catch: all -> 0x0056, TryCatch #11 {all -> 0x0056, blocks: (B:14:0x0047, B:49:0x0118, B:51:0x011e, B:53:0x0122, B:56:0x0129, B:147:0x031b, B:150:0x0323, B:152:0x032f, B:153:0x033a, B:155:0x0340, B:157:0x0349, B:161:0x0372, B:164:0x037c, B:175:0x0398, B:177:0x039c, B:168:0x0385, B:59:0x0135, B:185:0x03d8, B:187:0x03de, B:191:0x03e9, B:192:0x03f6, B:193:0x03fc, B:189:0x03e4, B:195:0x03ff, B:196:0x0402, B:21:0x0075), top: B:224:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x032f -> B:49:0x0118). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x039a -> B:180:0x03c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x03bd -> B:180:0x03c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object P(io.ktor.utils.io.ByteBufferChannel r27, long r28, io.ktor.utils.io.internal.d r30, p013kotlin.coroutines.Continuation<? super java.lang.Long> r31) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.ByteBufferChannel.P(io.ktor.utils.io.a, long, io.ktor.utils.io.internal.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final io.ktor.utils.io.internal.g Q() {
        return Y();
    }

    public int Q0(int min, wn0.l<? super ByteBuffer, h0> block) throws Throwable {
        ByteBufferChannel byteBufferChannelV0;
        int i11;
        p013kotlin.jvm.internal.s.k(block, "block");
        if (min <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (min > 4088) {
            throw new IllegalArgumentException(("Min(" + min + ") shouldn't be greater than 4088").toString());
        }
        io.ktor.utils.io.internal.d dVar = this.joining;
        if (dVar == null || (byteBufferChannelV0 = v0(this, dVar)) == null) {
            byteBufferChannelV0 = this;
        }
        ByteBuffer byteBufferF0 = byteBufferChannelV0.F0();
        boolean z11 = false;
        if (byteBufferF0 == null) {
            i11 = 0;
        } else {
            io.ktor.utils.io.internal.i iVar = byteBufferChannelV0.Y().capacity;
            long totalBytesWritten = byteBufferChannelV0.getTotalBytesWritten();
            try {
                io.ktor.utils.io.internal.c cVarV = byteBufferChannelV0.V();
                if (cVarV != null) {
                    io.ktor.utils.io.b.b(cVarV.c());
                    throw new KotlinNothingValueException();
                }
                int iN = iVar.n(min);
                if (iN <= 0) {
                    i11 = 0;
                } else {
                    byteBufferChannelV0.e0(byteBufferF0, byteBufferChannelV0.writePosition, iN);
                    int iPosition = byteBufferF0.position();
                    int iLimit = byteBufferF0.limit();
                    block.invoke(byteBufferF0);
                    if (iLimit != byteBufferF0.limit()) {
                        throw new IllegalStateException("Buffer limit modified");
                    }
                    int iPosition2 = byteBufferF0.position() - iPosition;
                    if (iPosition2 < 0) {
                        throw new IllegalStateException("Position has been moved backward: pushback is not supported");
                    }
                    if (iPosition2 < 0) {
                        throw new IllegalStateException();
                    }
                    byteBufferChannelV0.M(byteBufferF0, iVar, iPosition2);
                    if (iPosition2 < iN) {
                        iVar.a(iN - iPosition2);
                    }
                    z11 = true;
                    i11 = iPosition2;
                }
                if (iVar.h() || byteBufferChannelV0.getAutoFlush()) {
                    byteBufferChannelV0.flush();
                }
                if (byteBufferChannelV0 != this) {
                    D0(getTotalBytesWritten() + (byteBufferChannelV0.getTotalBytesWritten() - totalBytesWritten));
                }
                byteBufferChannelV0.x0();
                byteBufferChannelV0.K0();
            } catch (Throwable th2) {
                if (iVar.h() || byteBufferChannelV0.getAutoFlush()) {
                    byteBufferChannelV0.flush();
                }
                if (byteBufferChannelV0 != this) {
                    D0(getTotalBytesWritten() + (byteBufferChannelV0.getTotalBytesWritten() - totalBytesWritten));
                }
                byteBufferChannelV0.x0();
                byteBufferChannelV0.K0();
                throw th2;
            }
        }
        if (z11) {
            return i11;
        }
        return -1;
    }

    public Object R0(byte[] bArr, int i11, int i12, Continuation<? super Integer> continuation) {
        return S0(this, bArr, i11, i12, continuation);
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final io.ktor.utils.io.internal.d getJoining() {
        return this.joining;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public long getTotalBytesRead() {
        return this.totalBytesRead;
    }

    @Override // io.ktor.utils.io.g
    /* JADX INFO: renamed from: a */
    public int get_availableForRead() {
        return Y().capacity._availableForRead$internal;
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    @Override // io.ktor.utils.io.g
    public Object b(ml0.a aVar, Continuation<? super Integer> continuation) {
        return j0(this, aVar, continuation);
    }

    @Override // io.ktor.utils.io.g
    public Object c(long j11, Continuation<? super Long> continuation) {
        return R(this, j11, continuation);
    }

    public boolean c0() {
        return V() != null;
    }

    @Override // io.ktor.utils.io.g
    public boolean cancel(Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel has been cancelled");
        }
        return close(cause);
    }

    @Override // io.ktor.utils.io.j
    public boolean close(Throwable cause) {
        io.ktor.utils.io.internal.d dVar;
        if (V() != null) {
            return false;
        }
        io.ktor.utils.io.internal.c cVarA = cause == null ? io.ktor.utils.io.internal.c.INSTANCE.a() : new io.ktor.utils.io.internal.c(cause);
        Y().capacity.e();
        if (!androidx.concurrent.futures.b.a(f78533n, this, null, cVarA)) {
            return false;
        }
        Y().capacity.e();
        if (Y().capacity.g() || cause != null) {
            K0();
        }
        y0(cause);
        if (Y() == io.ktor.utils.io.internal.g.f.f78764c && (dVar = this.joining) != null) {
            T(dVar);
        }
        if (cause == null) {
            this.writeSuspendContinuationCache.d(new ClosedWriteChannelException("Byte channel was closed"));
            this.readSuspendContinuationCache.c(Boolean.valueOf(Y().capacity.e()));
            return true;
        }
        Job job = this.attachedJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.readSuspendContinuationCache.d(cause);
        this.writeSuspendContinuationCache.d(cause);
        return true;
    }

    @Override // io.ktor.utils.io.s
    public void d(int written) {
        this.writeSession.h(written);
        this.writeSession.e();
    }

    @Override // io.ktor.utils.io.j
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getAutoFlush() {
        return this.autoFlush;
    }

    @Override // io.ktor.utils.io.j
    public Object f(int i11, wn0.l<? super ByteBuffer, h0> lVar, Continuation<? super h0> continuation) {
        return N0(this, i11, lVar, continuation);
    }

    public final void f0(ByteBuffer buffer, int lockedSpace) {
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        e0(buffer, this.writePosition, lockedSpace);
    }

    @Override // io.ktor.utils.io.j
    public void flush() {
        U(1);
    }

    @Override // io.ktor.utils.io.g
    public Object g(long j11, Continuation<? super ll0.k> continuation) {
        return n0(this, j11, continuation);
    }

    @Override // io.ktor.utils.io.g
    public Throwable h() {
        io.ktor.utils.io.internal.c cVarV = V();
        if (cVarV != null) {
            return cVarV.getCause();
        }
        return null;
    }

    @Override // io.ktor.utils.io.g
    public Object i(byte[] bArr, int i11, int i12, Continuation<? super Integer> continuation) {
        return k0(this, bArr, i11, i12, continuation);
    }

    @Override // io.ktor.utils.io.j
    public Object j(ll0.k kVar, Continuation<? super h0> continuation) {
        return X0(this, kVar, continuation);
    }

    @Override // io.ktor.utils.io.j
    public Object k(ll0.a aVar, Continuation<? super h0> continuation) {
        return T0(this, aVar, continuation);
    }

    @Override // io.ktor.utils.io.j
    public Object l(byte[] bArr, int i11, int i12, Continuation<? super h0> continuation) {
        return U0(this, bArr, i11, i12, continuation);
    }

    @Override // io.ktor.utils.io.c
    @jn0.e
    public void m(Job job) {
        p013kotlin.jvm.internal.s.k(job, "job");
        Job job2 = this.attachedJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.attachedJob = job;
        Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new b(), 2, null);
    }

    @Override // io.ktor.utils.io.s
    public x n() {
        io.ktor.utils.io.internal.l lVar = this.writeSession;
        lVar.d();
        return lVar;
    }

    @Override // io.ktor.utils.io.g
    public boolean o() {
        return Y() == io.ktor.utils.io.internal.g.f.f78764c && V() != null;
    }

    public String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + Y() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final ByteBufferChannel u0() {
        ByteBufferChannel byteBufferChannelV0;
        io.ktor.utils.io.internal.d dVar = this.joining;
        return (dVar == null || (byteBufferChannelV0 = v0(this, dVar)) == null) ? this : byteBufferChannelV0;
    }

    public final void x0() {
        Object obj;
        io.ktor.utils.io.internal.g gVarF;
        io.ktor.utils.io.internal.g.b bVar;
        io.ktor.utils.io.internal.g gVar = null;
        do {
            obj = this._state;
            gVarF = ((io.ktor.utils.io.internal.g) obj).f();
            if ((gVarF instanceof io.ktor.utils.io.internal.g.b) && gVarF.capacity.g()) {
                gVarF = io.ktor.utils.io.internal.g.a.f78754c;
                gVar = gVarF;
            }
        } while (!androidx.concurrent.futures.b.a(f78532m, this, obj, gVarF));
        if (gVarF != io.ktor.utils.io.internal.g.a.f78754c || (bVar = (io.ktor.utils.io.internal.g.b) gVar) == null) {
            return;
        }
        s0(bVar.getInitial());
    }

    public /* synthetic */ ByteBufferChannel(boolean z11, nl0.f fVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i12 & 2) != 0 ? io.ktor.utils.io.internal.e.c() : fVar, (i12 & 4) != 0 ? 8 : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ByteBufferChannel(ByteBuffer content) {
        this(false, io.ktor.utils.io.internal.e.b(), 0);
        p013kotlin.jvm.internal.s.k(content, "content");
        ByteBuffer byteBufferSlice = content.slice();
        p013kotlin.jvm.internal.s.j(byteBufferSlice, "content.slice()");
        io.ktor.utils.io.internal.g.c cVar = new io.ktor.utils.io.internal.g.c(byteBufferSlice, 0);
        cVar.capacity.i();
        this._state = cVar.d();
        x0();
        io.ktor.utils.io.k.a(this);
        K0();
    }
}
