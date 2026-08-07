package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\be\u0018\u0000 \u008f\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001cB\u0083\u0006\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0002H\u0017¢\u0006\u0004\bT\u0010UJ\u001a\u0010X\u001a\u00020\u00162\b\u0010W\u001a\u0004\u0018\u00010VH\u0096\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u000fH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\\\u0010]J\u0089\u0006\u0010^\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010Q\u001a\u00020P¢\u0006\u0004\b^\u0010_R\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010`\u001a\u0004\ba\u0010bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010k\u001a\u0004\bl\u0010mR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bp\u0010v\u001a\u0004\bw\u0010xR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\be\u0010y\u001a\u0004\br\u0010zR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010{\u001a\u0004\b|\u0010}R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010{\u001a\u0004\b\u007f\u0010}R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010{\u001a\u0005\b\u0081\u0001\u0010}R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bw\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010]R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010y\u001a\u0005\b\u0085\u0001\u0010zR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010{\u001a\u0005\b\u0087\u0001\u0010}R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010{\u001a\u0005\b\u0089\u0001\u0010}R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010{\u001a\u0005\b\u008b\u0001\u0010}R\u001e\u0010 \u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010{\u001a\u0005\b\u008d\u0001\u0010}R\u001e\u0010!\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010{\u001a\u0005\b\u008f\u0001\u0010}R\u001e\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010y\u001a\u0005\b\u0091\u0001\u0010zR\u001d\u0010#\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0092\u0001\u0010{\u001a\u0004\b~\u0010}R\u001e\u0010$\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010{\u001a\u0005\b\u0084\u0001\u0010}R \u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0088\u0001\u0010\u0096\u0001R\u001e\u0010'\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010{\u001a\u0005\b\u0098\u0001\u0010}R\u001d\u0010(\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\r\n\u0004\bt\u0010{\u001a\u0005\b\u0099\u0001\u0010}R\u001f\u0010)\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u0082\u0001\u001a\u0005\b\u009b\u0001\u0010]R\u001e\u0010*\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010{\u001a\u0005\b\u009d\u0001\u0010}R\u001d\u0010+\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u009e\u0001\u0010{\u001a\u0004\bn\u0010}R\u001e\u0010,\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010{\u001a\u0005\b\u008e\u0001\u0010}R\u001e\u0010-\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010{\u001a\u0005\b \u0001\u0010}R\u001e\u0010.\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¡\u0001\u0010{\u001a\u0005\b¢\u0001\u0010}R\u001e\u0010/\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010{\u001a\u0005\b\u0093\u0001\u0010}R\u001e\u00100\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b£\u0001\u0010{\u001a\u0005\b¤\u0001\u0010}R\u001d\u00101\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\r\n\u0004\b|\u0010{\u001a\u0005\b\u009c\u0001\u0010}R\u001e\u00102\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010{\u001a\u0005\b\u009e\u0001\u0010}R\u001e\u00103\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¥\u0001\u0010{\u001a\u0005\b\u009a\u0001\u0010}R\u001e\u00104\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¦\u0001\u0010{\u001a\u0005\b§\u0001\u0010}R\u001e\u00105\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0001\u0010{\u001a\u0005\b¨\u0001\u0010}R\u001e\u00106\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¢\u0001\u0010{\u001a\u0005\b©\u0001\u0010}R\u001e\u00107\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¤\u0001\u0010{\u001a\u0005\b\u0090\u0001\u0010}R\u001e\u00108\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bª\u0001\u0010{\u001a\u0005\b«\u0001\u0010}R \u0010:\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0006\b\u0097\u0001\u0010®\u0001R\u001e\u0010;\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010{\u001a\u0005\b¯\u0001\u0010}R\u001d\u0010<\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010{\u001a\u0005\b°\u0001\u0010}R\u001e\u0010=\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010y\u001a\u0005\b±\u0001\u0010zR\u001e\u0010>\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0098\u0001\u0010y\u001a\u0005\b²\u0001\u0010zR\u001e\u0010?\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010{\u001a\u0005\b³\u0001\u0010}R\u001e\u0010@\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010{\u001a\u0005\b´\u0001\u0010}R\u001d\u0010A\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\r\n\u0005\b¨\u0001\u0010{\u001a\u0004\bg\u0010}R\u001e\u0010B\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010{\u001a\u0005\b\u008a\u0001\u0010}R\u001e\u0010C\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010{\u001a\u0005\b\u009f\u0001\u0010}R\u001d\u0010D\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\r\n\u0004\ba\u0010{\u001a\u0005\b¡\u0001\u0010}R\u001e\u0010E\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b¯\u0001\u0010{\u001a\u0005\b£\u0001\u0010}R\u001e\u0010F\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b°\u0001\u0010{\u001a\u0005\b\u0080\u0001\u0010}R\u001e\u0010G\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010{\u001a\u0005\bª\u0001\u0010}R \u0010I\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b\u0086\u0001\u0010·\u0001R\u001e\u0010J\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b«\u0001\u0010{\u001a\u0005\b¸\u0001\u0010}R\u001f\u0010K\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b©\u0001\u0010\u0082\u0001\u001a\u0005\b\u008c\u0001\u0010]R \u0010L\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010¶\u0001\u001a\u0006\b¥\u0001\u0010·\u0001R \u0010M\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b³\u0001\u0010¶\u0001\u001a\u0006\b¦\u0001\u0010·\u0001R\u001e\u0010N\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b±\u0001\u0010{\u001a\u0005\b\u0094\u0001\u0010}R\u001e\u0010O\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b´\u0001\u0010{\u001a\u0005\b¬\u0001\u0010}R$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010¹\u0001\u001a\u0006\b\u0092\u0001\u0010º\u0001¨\u0006»\u0001"}, d2 = {"Lgc0/a1;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lgc0/c;", "autopark_style", "Lgc0/q0;", "active_spoiler_state", "Lgc0/d;", "autopark_version", "Lgc0/b;", "autopark_state", "", "", "feature_bitmask", "Lgc0/w;", "guestMode", "Lgc0/t;", "dashcamUtils", "api_version", "", "notifications_supported", "remote_start_supported", "remote_start_enabled", "", "last_autopark_error", "homelink_device_count", "smart_summon_available", "summon_standby_mode_enabled", "patsy_mode", "webcam_available", "vehicle_self_test_requested", "vehicle_self_test_progress", "calendar_supported", "dashcam_clip_save_available", "Lgc0/s;", "dashcam_state", "service_mode", "service_mode_plus", "service_mode_auth", "service_gtw_diag_session_active", "allow_authorized_mobile_devices_only", "drive_rail_on", "pin_to_drive_enabled", "pin_to_drive_pin_set", "frontfoglights_on", "rearfoglights_on", "headlights_on", "highbeamlights_on", "hazards_on", "trailer_mode_on", "signed_cmd_service_mode", "transport_mode", "factory_mode", "training_wheels_mode", "Lec0/m;", "gtw_diag_level", "trailer_light_test_available", "trailer_light_test_requested", "truck_bed_lights_brightness", "truck_bed_lights_auto_brightness", "truck_bed_lights_auto_state", "truck_bed_lights_controls_disabled", "accessory_lightbar_middle_on", "deck_lights_on", "inlet_heater_on", "inlet_heater_supported", "mobile_dashcam_viewer_enabled", "car_wrap_enabled", "remote_photobooth_available", "", "dashcam_last_save_epoch", "wiper_service_request", "dog_mode_live_activity_key", "photobooth_last_save_epoch", "photobooth_last_update_epoch", "fsd_stats_supported", "remote_sketchpad_available", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Lgc0/c;Lgc0/q0;Lgc0/d;Lgc0/b;Ljava/util/List;Lgc0/w;Lgc0/t;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lgc0/s;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lec0/m;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Lgc0/c;Lgc0/q0;Lgc0/d;Lgc0/b;Ljava/util/List;Lgc0/w;Lgc0/t;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lgc0/s;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lec0/m;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)Lgc0/a1;", "Lj$/time/Instant;", "Y", "()Lj$/time/Instant;", "b", "Lgc0/c;", "h", "()Lgc0/c;", "c", "Lgc0/q0;", DateTokenConverter.CONVERTER_KEY, "()Lgc0/q0;", "Lgc0/d;", IntegerTokenConverter.CONVERTER_KEY, "()Lgc0/d;", "e", "Lgc0/b;", "g", "()Lgc0/b;", "f", "Lgc0/w;", "x", "()Lgc0/w;", "Lgc0/t;", "l", "()Lgc0/t;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "G", "()Ljava/lang/Boolean;", "j", "Q", "k", "P", "Ljava/lang/String;", "E", "m", "B", "n", "W", "o", "X", "p", "H", "q", "l0", "r", "k0", "s", "j0", "t", "u", "v", "Lgc0/s;", "()Lgc0/s;", "w", "S", Gender.UNKNOWN, "y", "T", "z", "R", "A", "C", "K", "D", "L", Gender.FEMALE, Gender.MALE, "I", "J", "b0", "V", "e0", Gender.NONE, "d0", Gender.OTHER, "Lec0/m;", "()Lec0/m;", "Z", "a0", "h0", "f0", "g0", "i0", "c0", "Ljava/lang/Long;", "()Ljava/lang/Long;", "m0", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a1 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final ProtoAdapter<a1> f67923l0 = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(a1.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowAuthorizedMobileDevicesOnly", tag = 29)
    private final Boolean allow_authorized_mobile_devices_only;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "driveRailOn", tag = 31)
    private final Boolean drive_rail_on;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinToDriveEnabled", tag = 32)
    private final Boolean pin_to_drive_enabled;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinToDrivePinSet", tag = 33)
    private final Boolean pin_to_drive_pin_set;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "frontfoglightsOn", tag = 34)
    private final Boolean frontfoglights_on;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "rearfoglightsOn", tag = 35)
    private final Boolean rearfoglights_on;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "headlightsOn", tag = 36)
    private final Boolean headlights_on;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "highbeamlightsOn", tag = 37)
    private final Boolean highbeamlights_on;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hazardsOn", tag = 68)
    private final Boolean hazards_on;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "trailerModeOn", tag = 38)
    private final Boolean trailer_mode_on;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "signedCmdServiceMode", tag = 39)
    private final Boolean signed_cmd_service_mode;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "transportMode", tag = 40)
    private final Boolean transport_mode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "factoryMode", tag = 41)
    private final Boolean factory_mode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "trainingWheelsMode", tag = 42)
    private final Boolean training_wheels_mode;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.GtwDiagLevel#ADAPTER", jsonName = "gtwDiagLevel", tag = 43)
    private final ec0.m gtw_diag_level;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "trailerLightTestAvailable", tag = 44)
    private final Boolean trailer_light_test_available;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "trailerLightTestRequested", tag = 45)
    private final Boolean trailer_light_test_requested;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "truckBedLightsBrightness", tag = 46)
    private final Integer truck_bed_lights_brightness;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "truckBedLightsAutoBrightness", tag = 47)
    private final Integer truck_bed_lights_auto_brightness;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "truckBedLightsAutoState", tag = 48)
    private final Boolean truck_bed_lights_auto_state;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "truckBedLightsControlsDisabled", tag = 49)
    private final Boolean truck_bed_lights_controls_disabled;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "accessoryLightbarMiddleOn", tag = 50)
    private final Boolean accessory_lightbar_middle_on;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "deckLightsOn", tag = 67)
    private final Boolean deck_lights_on;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "inletHeaterOn", tag = 51)
    private final Boolean inlet_heater_on;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "inletHeaterSupported", tag = 52)
    private final Boolean inlet_heater_supported;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "mobileDashcamViewerEnabled", tag = 54)
    private final Boolean mobile_dashcam_viewer_enabled;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final Instant timestamp;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "carWrapEnabled", tag = 55)
    private final Boolean car_wrap_enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.AutoparkStyle#ADAPTER", jsonName = "autoparkStyle", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final c autopark_style;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remotePhotoboothAvailable", tag = 59)
    private final Boolean remote_photobooth_available;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SpoilerState#ADAPTER", jsonName = "activeSpoilerState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final q0 active_spoiler_state;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "dashcamLastSaveEpoch", tag = 56)
    private final Long dashcam_last_save_epoch;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.AutoparkVersion#ADAPTER", jsonName = "autoparkVersion", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final d autopark_version;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "wiperServiceRequest", tag = 58)
    private final Boolean wiper_service_request;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.AutoparkState#ADAPTER", jsonName = "autoparkState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 20)
    private final b autopark_state;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dogModeLiveActivityKey", tag = 60)
    private final String dog_mode_live_activity_key;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuestMode#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 30)
    private final w guestMode;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "photoboothLastSaveEpoch", tag = 61)
    private final Long photobooth_last_save_epoch;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.DashcamUtils#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 65)
    private final t dashcamUtils;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "photoboothLastUpdateEpoch", tag = 62)
    private final Long photobooth_last_update_epoch;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "apiVersion", tag = 2)
    private final Integer api_version;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "fsdStatsSupported", tag = 63)
    private final Boolean fsd_stats_supported;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "notificationsSupported", tag = 3)
    private final Boolean notifications_supported;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteSketchpadAvailable", tag = 66)
    private final Boolean remote_sketchpad_available;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartSupported", tag = 4)
    private final Boolean remote_start_supported;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "featureBitmask", label = com.squareup.wire.q.a.PACKED, tag = 24)
    private final List<Integer> feature_bitmask;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartEnabled", tag = 5)
    private final Boolean remote_start_enabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastAutoparkError", tag = 6)
    private final String last_autopark_error;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "homelinkDeviceCount", tag = 7)
    private final Integer homelink_device_count;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "smartSummonAvailable", tag = 9)
    private final Boolean smart_summon_available;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "summonStandbyModeEnabled", tag = 10)
    private final Boolean summon_standby_mode_enabled;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "patsyMode", tag = 15)
    private final Boolean patsy_mode;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "webcamAvailable", tag = 16)
    private final Boolean webcam_available;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "vehicleSelfTestRequested", tag = 17)
    private final Boolean vehicle_self_test_requested;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "vehicleSelfTestProgress", tag = 18)
    private final Integer vehicle_self_test_progress;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "calendarSupported", tag = 21)
    private final Boolean calendar_supported;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "dashcamClipSaveAvailable", tag = 22)
    private final Boolean dashcam_clip_save_available;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.DashCamState#ADAPTER", jsonName = "dashcamState", tag = 23)
    private final s dashcam_state;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceMode", tag = 25)
    private final Boolean service_mode;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceModePlus", tag = 26)
    private final Boolean service_mode_plus;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "serviceModeAuth", tag = 27)
    private final String service_mode_auth;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceGtwDiagSessionActive", tag = 28)
    private final Boolean service_gtw_diag_session_active;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/a1$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/a1;", "value", "", "c", "(Lgc0/a1;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/a1;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/a1;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/a1;)Lgc0/a1;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<a1> {
        a(com.squareup.wire.b bVar, co0.d<a1> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.VehicleState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a1 decode(com.squareup.wire.k reader) throws IOException {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            c cVar = null;
            q0 q0Var = null;
            d dVar = null;
            b bVar = null;
            w wVar = null;
            t tVar = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            Integer num2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Integer num3 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            s sVarDecode = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            String str2 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            Boolean bool23 = null;
            Boolean bool24 = null;
            Boolean bool25 = null;
            Boolean bool26 = null;
            Boolean bool27 = null;
            ec0.m mVarDecode = null;
            Boolean bool28 = null;
            Boolean bool29 = null;
            Integer num4 = null;
            Integer num5 = null;
            Boolean bool30 = null;
            Boolean bool31 = null;
            Boolean bool32 = null;
            Boolean bool33 = null;
            Boolean bool34 = null;
            Boolean bool35 = null;
            Boolean bool36 = null;
            Boolean bool37 = null;
            Boolean bool38 = null;
            Long l11 = null;
            Boolean bool39 = null;
            String str3 = null;
            Long l12 = null;
            Long l13 = null;
            Boolean bool40 = null;
            Boolean bool41 = null;
            Instant instant = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a1(instant, cVar, q0Var, dVar, bVar, arrayList, wVar, tVar, num, bool, bool2, bool3, str, num2, bool4, bool5, bool6, bool7, bool8, num3, bool9, bool10, sVarDecode, bool11, bool12, str2, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, bool25, bool26, bool27, mVarDecode, bool28, bool29, num4, num5, bool30, bool31, bool32, bool33, bool34, bool35, bool36, bool37, bool38, l11, bool39, str3, l12, l13, bool40, bool41, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        Instant instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var = jn0.h0.f84049a;
                        instant = instantDecode;
                        continue;
                    case 2:
                        Integer numDecode = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var2 = jn0.h0.f84049a;
                        num = numDecode;
                        continue;
                    case 3:
                        Boolean boolDecode = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var3 = jn0.h0.f84049a;
                        bool = boolDecode;
                        continue;
                    case 4:
                        Boolean boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var4 = jn0.h0.f84049a;
                        bool2 = boolDecode2;
                        continue;
                    case 5:
                        Boolean boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var5 = jn0.h0.f84049a;
                        bool3 = boolDecode3;
                        continue;
                    case 6:
                        String strDecode = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var6 = jn0.h0.f84049a;
                        str = strDecode;
                        continue;
                    case 7:
                        Integer numDecode2 = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var7 = jn0.h0.f84049a;
                        num2 = numDecode2;
                        continue;
                    case 8:
                        c cVarDecode = c.f67979d.decode(reader);
                        jn0.h0 h0Var8 = jn0.h0.f84049a;
                        cVar = cVarDecode;
                        continue;
                    case 9:
                        Boolean boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var9 = jn0.h0.f84049a;
                        bool4 = boolDecode4;
                        continue;
                    case 10:
                        Boolean boolDecode5 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var10 = jn0.h0.f84049a;
                        bool5 = boolDecode5;
                        continue;
                    case 11:
                    case 13:
                    case 14:
                    case 53:
                    case 57:
                    case 64:
                    default:
                        reader.m(iG);
                        jn0.h0 h0Var11 = jn0.h0.f84049a;
                        cVar = cVar;
                        dVar = dVar;
                        bVar = bVar;
                        break;
                    case 12:
                        q0 q0VarDecode = q0.f68379f.decode(reader);
                        jn0.h0 h0Var12 = jn0.h0.f84049a;
                        q0Var = q0VarDecode;
                        continue;
                    case 15:
                        Boolean boolDecode6 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var13 = jn0.h0.f84049a;
                        bool6 = boolDecode6;
                        continue;
                    case 16:
                        Boolean boolDecode7 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var14 = jn0.h0.f84049a;
                        bool7 = boolDecode7;
                        continue;
                    case 17:
                        Boolean boolDecode8 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var15 = jn0.h0.f84049a;
                        bool8 = boolDecode8;
                        continue;
                    case 18:
                        Integer numDecode3 = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var16 = jn0.h0.f84049a;
                        num3 = numDecode3;
                        continue;
                    case 19:
                        d dVarDecode = d.f67990e.decode(reader);
                        jn0.h0 h0Var17 = jn0.h0.f84049a;
                        dVar = dVarDecode;
                        continue;
                    case 20:
                        b bVarDecode = b.f67961n.decode(reader);
                        jn0.h0 h0Var18 = jn0.h0.f84049a;
                        bVar = bVarDecode;
                        continue;
                    case 21:
                        Boolean boolDecode9 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var19 = jn0.h0.f84049a;
                        bool9 = boolDecode9;
                        continue;
                    case 22:
                        Boolean boolDecode10 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var20 = jn0.h0.f84049a;
                        bool10 = boolDecode10;
                        continue;
                    case 23:
                        cVar = cVar;
                        dVar = dVar;
                        bVar = bVar;
                        try {
                            sVarDecode = s.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                        jn0.h0 h0Var21 = jn0.h0.f84049a;
                        break;
                    case 24:
                        cVar = cVar;
                        dVar = dVar;
                        bVar = bVar;
                        arrayList.add(ProtoAdapter.UINT32.decode(reader));
                        break;
                    case 25:
                        Boolean boolDecode11 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var22 = jn0.h0.f84049a;
                        bool11 = boolDecode11;
                        continue;
                    case 26:
                        Boolean boolDecode12 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var23 = jn0.h0.f84049a;
                        bool12 = boolDecode12;
                        continue;
                    case 27:
                        String strDecode2 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var24 = jn0.h0.f84049a;
                        str2 = strDecode2;
                        continue;
                    case 28:
                        Boolean boolDecode13 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var25 = jn0.h0.f84049a;
                        bool13 = boolDecode13;
                        continue;
                    case 29:
                        Boolean boolDecode14 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var26 = jn0.h0.f84049a;
                        bool14 = boolDecode14;
                        continue;
                    case 30:
                        w wVarDecode = w.f68663c.decode(reader);
                        jn0.h0 h0Var27 = jn0.h0.f84049a;
                        wVar = wVarDecode;
                        continue;
                    case 31:
                        Boolean boolDecode15 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var28 = jn0.h0.f84049a;
                        bool15 = boolDecode15;
                        continue;
                    case 32:
                        Boolean boolDecode16 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var29 = jn0.h0.f84049a;
                        bool16 = boolDecode16;
                        continue;
                    case 33:
                        Boolean boolDecode17 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var30 = jn0.h0.f84049a;
                        bool17 = boolDecode17;
                        continue;
                    case 34:
                        Boolean boolDecode18 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var31 = jn0.h0.f84049a;
                        bool18 = boolDecode18;
                        continue;
                    case 35:
                        Boolean boolDecode19 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var32 = jn0.h0.f84049a;
                        bool19 = boolDecode19;
                        continue;
                    case 36:
                        Boolean boolDecode20 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var33 = jn0.h0.f84049a;
                        bool20 = boolDecode20;
                        continue;
                    case 37:
                        Boolean boolDecode21 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var34 = jn0.h0.f84049a;
                        bool21 = boolDecode21;
                        continue;
                    case 38:
                        Boolean boolDecode22 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var35 = jn0.h0.f84049a;
                        bool23 = boolDecode22;
                        continue;
                    case 39:
                        Boolean boolDecode23 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var36 = jn0.h0.f84049a;
                        bool24 = boolDecode23;
                        continue;
                    case 40:
                        Boolean boolDecode24 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var37 = jn0.h0.f84049a;
                        bool25 = boolDecode24;
                        continue;
                    case 41:
                        Boolean boolDecode25 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var38 = jn0.h0.f84049a;
                        bool26 = boolDecode25;
                        continue;
                    case 42:
                        Boolean boolDecode26 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var39 = jn0.h0.f84049a;
                        bool27 = boolDecode26;
                        continue;
                    case 43:
                        try {
                            mVarDecode = ec0.m.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                        }
                        jn0.h0 h0Var40 = jn0.h0.f84049a;
                        break;
                    case 44:
                        Boolean boolDecode27 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var41 = jn0.h0.f84049a;
                        bool28 = boolDecode27;
                        continue;
                    case 45:
                        Boolean boolDecode28 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var42 = jn0.h0.f84049a;
                        bool29 = boolDecode28;
                        continue;
                    case 46:
                        Integer numDecode4 = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var43 = jn0.h0.f84049a;
                        num4 = numDecode4;
                        continue;
                    case 47:
                        Integer numDecode5 = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var44 = jn0.h0.f84049a;
                        num5 = numDecode5;
                        continue;
                    case 48:
                        Boolean boolDecode29 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var45 = jn0.h0.f84049a;
                        bool30 = boolDecode29;
                        continue;
                    case 49:
                        Boolean boolDecode30 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var46 = jn0.h0.f84049a;
                        bool31 = boolDecode30;
                        continue;
                    case 50:
                        Boolean boolDecode31 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var47 = jn0.h0.f84049a;
                        bool32 = boolDecode31;
                        continue;
                    case 51:
                        Boolean boolDecode32 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var48 = jn0.h0.f84049a;
                        bool34 = boolDecode32;
                        continue;
                    case 52:
                        Boolean boolDecode33 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var49 = jn0.h0.f84049a;
                        bool35 = boolDecode33;
                        continue;
                    case 54:
                        Boolean boolDecode34 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var50 = jn0.h0.f84049a;
                        bool36 = boolDecode34;
                        continue;
                    case 55:
                        Boolean boolDecode35 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var51 = jn0.h0.f84049a;
                        bool37 = boolDecode35;
                        continue;
                    case 56:
                        Long lDecode = ProtoAdapter.UINT64.decode(reader);
                        jn0.h0 h0Var52 = jn0.h0.f84049a;
                        l11 = lDecode;
                        continue;
                    case 58:
                        Boolean boolDecode36 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var53 = jn0.h0.f84049a;
                        bool39 = boolDecode36;
                        continue;
                    case 59:
                        Boolean boolDecode37 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var54 = jn0.h0.f84049a;
                        bool38 = boolDecode37;
                        continue;
                    case 60:
                        String strDecode3 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var55 = jn0.h0.f84049a;
                        str3 = strDecode3;
                        continue;
                    case 61:
                        Long lDecode2 = ProtoAdapter.UINT64.decode(reader);
                        jn0.h0 h0Var56 = jn0.h0.f84049a;
                        l12 = lDecode2;
                        continue;
                    case 62:
                        Long lDecode3 = ProtoAdapter.UINT64.decode(reader);
                        jn0.h0 h0Var57 = jn0.h0.f84049a;
                        l13 = lDecode3;
                        continue;
                    case 63:
                        Boolean boolDecode38 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var58 = jn0.h0.f84049a;
                        bool40 = boolDecode38;
                        continue;
                    case 65:
                        t tVarDecode = t.f68449d.decode(reader);
                        jn0.h0 h0Var59 = jn0.h0.f84049a;
                        tVar = tVarDecode;
                        continue;
                    case 66:
                        Boolean boolDecode39 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var60 = jn0.h0.f84049a;
                        bool41 = boolDecode39;
                        continue;
                    case 67:
                        Boolean boolDecode40 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var61 = jn0.h0.f84049a;
                        bool33 = boolDecode40;
                        continue;
                    case 68:
                        Boolean boolDecode41 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var62 = jn0.h0.f84049a;
                        bool22 = boolDecode41;
                        continue;
                }
                cVar = cVar;
                dVar = dVar;
                bVar = bVar;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, a1 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 1, value.getTimestamp());
            }
            if (value.getAutopark_style() != null) {
                c.f67979d.encodeWithTag(writer, 8, value.getAutopark_style());
            }
            if (value.getActive_spoiler_state() != null) {
                q0.f68379f.encodeWithTag(writer, 12, value.getActive_spoiler_state());
            }
            if (value.getAutopark_version() != null) {
                d.f67990e.encodeWithTag(writer, 19, value.getAutopark_version());
            }
            if (value.getAutopark_state() != null) {
                b.f67961n.encodeWithTag(writer, 20, value.getAutopark_state());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.asPacked().encodeWithTag(writer, 24, value.t());
            if (value.getGuestMode() != null) {
                w.f68663c.encodeWithTag(writer, 30, value.getGuestMode());
            }
            if (value.getDashcamUtils() != null) {
                t.f68449d.encodeWithTag(writer, 65, value.getDashcamUtils());
            }
            protoAdapter.encodeWithTag(writer, 2, value.getApi_version());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(writer, 3, value.getNotifications_supported());
            protoAdapter2.encodeWithTag(writer, 4, value.getRemote_start_supported());
            protoAdapter2.encodeWithTag(writer, 5, value.getRemote_start_enabled());
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(writer, 6, value.getLast_autopark_error());
            protoAdapter.encodeWithTag(writer, 7, value.getHomelink_device_count());
            protoAdapter2.encodeWithTag(writer, 9, value.getSmart_summon_available());
            protoAdapter2.encodeWithTag(writer, 10, value.getSummon_standby_mode_enabled());
            protoAdapter2.encodeWithTag(writer, 15, value.getPatsy_mode());
            protoAdapter2.encodeWithTag(writer, 16, value.getWebcam_available());
            protoAdapter2.encodeWithTag(writer, 17, value.getVehicle_self_test_requested());
            protoAdapter.encodeWithTag(writer, 18, value.getVehicle_self_test_progress());
            protoAdapter2.encodeWithTag(writer, 21, value.getCalendar_supported());
            protoAdapter2.encodeWithTag(writer, 22, value.getDashcam_clip_save_available());
            s.ADAPTER.encodeWithTag(writer, 23, value.getDashcam_state());
            protoAdapter2.encodeWithTag(writer, 25, value.getService_mode());
            protoAdapter2.encodeWithTag(writer, 26, value.getService_mode_plus());
            protoAdapter3.encodeWithTag(writer, 27, value.getService_mode_auth());
            protoAdapter2.encodeWithTag(writer, 28, value.getService_gtw_diag_session_active());
            protoAdapter2.encodeWithTag(writer, 29, value.getAllow_authorized_mobile_devices_only());
            protoAdapter2.encodeWithTag(writer, 31, value.getDrive_rail_on());
            protoAdapter2.encodeWithTag(writer, 32, value.getPin_to_drive_enabled());
            protoAdapter2.encodeWithTag(writer, 33, value.getPin_to_drive_pin_set());
            protoAdapter2.encodeWithTag(writer, 34, value.getFrontfoglights_on());
            protoAdapter2.encodeWithTag(writer, 35, value.getRearfoglights_on());
            protoAdapter2.encodeWithTag(writer, 36, value.getHeadlights_on());
            protoAdapter2.encodeWithTag(writer, 37, value.getHighbeamlights_on());
            protoAdapter2.encodeWithTag(writer, 68, value.getHazards_on());
            protoAdapter2.encodeWithTag(writer, 38, value.getTrailer_mode_on());
            protoAdapter2.encodeWithTag(writer, 39, value.getSigned_cmd_service_mode());
            protoAdapter2.encodeWithTag(writer, 40, value.getTransport_mode());
            protoAdapter2.encodeWithTag(writer, 41, value.getFactory_mode());
            protoAdapter2.encodeWithTag(writer, 42, value.getTraining_wheels_mode());
            ec0.m.ADAPTER.encodeWithTag(writer, 43, value.getGtw_diag_level());
            protoAdapter2.encodeWithTag(writer, 44, value.getTrailer_light_test_available());
            protoAdapter2.encodeWithTag(writer, 45, value.getTrailer_light_test_requested());
            protoAdapter.encodeWithTag(writer, 46, value.getTruck_bed_lights_brightness());
            protoAdapter.encodeWithTag(writer, 47, value.getTruck_bed_lights_auto_brightness());
            protoAdapter2.encodeWithTag(writer, 48, value.getTruck_bed_lights_auto_state());
            protoAdapter2.encodeWithTag(writer, 49, value.getTruck_bed_lights_controls_disabled());
            protoAdapter2.encodeWithTag(writer, 50, value.getAccessory_lightbar_middle_on());
            protoAdapter2.encodeWithTag(writer, 67, value.getDeck_lights_on());
            protoAdapter2.encodeWithTag(writer, 51, value.getInlet_heater_on());
            protoAdapter2.encodeWithTag(writer, 52, value.getInlet_heater_supported());
            protoAdapter2.encodeWithTag(writer, 54, value.getMobile_dashcam_viewer_enabled());
            protoAdapter2.encodeWithTag(writer, 55, value.getCar_wrap_enabled());
            protoAdapter2.encodeWithTag(writer, 59, value.getRemote_photobooth_available());
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.UINT64;
            protoAdapter4.encodeWithTag(writer, 56, value.getDashcam_last_save_epoch());
            protoAdapter2.encodeWithTag(writer, 58, value.getWiper_service_request());
            protoAdapter3.encodeWithTag(writer, 60, value.getDog_mode_live_activity_key());
            protoAdapter4.encodeWithTag(writer, 61, value.getPhotobooth_last_save_epoch());
            protoAdapter4.encodeWithTag(writer, 62, value.getPhotobooth_last_update_epoch());
            protoAdapter2.encodeWithTag(writer, 63, value.getFsd_stats_supported());
            protoAdapter2.encodeWithTag(writer, 66, value.getRemote_sketchpad_available());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getTimestamp());
            }
            if (value.getAutopark_style() != null) {
                iD += c.f67979d.encodedSizeWithTag(8, value.getAutopark_style());
            }
            if (value.getActive_spoiler_state() != null) {
                iD += q0.f68379f.encodedSizeWithTag(12, value.getActive_spoiler_state());
            }
            if (value.getAutopark_version() != null) {
                iD += d.f67990e.encodedSizeWithTag(19, value.getAutopark_version());
            }
            if (value.getAutopark_state() != null) {
                iD += b.f67961n.encodedSizeWithTag(20, value.getAutopark_state());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int iEncodedSizeWithTag = iD + protoAdapter.asPacked().encodedSizeWithTag(24, value.t());
            if (value.getGuestMode() != null) {
                iEncodedSizeWithTag += w.f68663c.encodedSizeWithTag(30, value.getGuestMode());
            }
            if (value.getDashcamUtils() != null) {
                iEncodedSizeWithTag += t.f68449d.encodedSizeWithTag(65, value.getDashcamUtils());
            }
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, value.getApi_version());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, value.getNotifications_supported()) + protoAdapter2.encodedSizeWithTag(4, value.getRemote_start_supported()) + protoAdapter2.encodedSizeWithTag(5, value.getRemote_start_enabled());
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(6, value.getLast_autopark_error()) + protoAdapter.encodedSizeWithTag(7, value.getHomelink_device_count()) + protoAdapter2.encodedSizeWithTag(9, value.getSmart_summon_available()) + protoAdapter2.encodedSizeWithTag(10, value.getSummon_standby_mode_enabled()) + protoAdapter2.encodedSizeWithTag(15, value.getPatsy_mode()) + protoAdapter2.encodedSizeWithTag(16, value.getWebcam_available()) + protoAdapter2.encodedSizeWithTag(17, value.getVehicle_self_test_requested()) + protoAdapter.encodedSizeWithTag(18, value.getVehicle_self_test_progress()) + protoAdapter2.encodedSizeWithTag(21, value.getCalendar_supported()) + protoAdapter2.encodedSizeWithTag(22, value.getDashcam_clip_save_available()) + s.ADAPTER.encodedSizeWithTag(23, value.getDashcam_state()) + protoAdapter2.encodedSizeWithTag(25, value.getService_mode()) + protoAdapter2.encodedSizeWithTag(26, value.getService_mode_plus()) + protoAdapter3.encodedSizeWithTag(27, value.getService_mode_auth()) + protoAdapter2.encodedSizeWithTag(28, value.getService_gtw_diag_session_active()) + protoAdapter2.encodedSizeWithTag(29, value.getAllow_authorized_mobile_devices_only()) + protoAdapter2.encodedSizeWithTag(31, value.getDrive_rail_on()) + protoAdapter2.encodedSizeWithTag(32, value.getPin_to_drive_enabled()) + protoAdapter2.encodedSizeWithTag(33, value.getPin_to_drive_pin_set()) + protoAdapter2.encodedSizeWithTag(34, value.getFrontfoglights_on()) + protoAdapter2.encodedSizeWithTag(35, value.getRearfoglights_on()) + protoAdapter2.encodedSizeWithTag(36, value.getHeadlights_on()) + protoAdapter2.encodedSizeWithTag(37, value.getHighbeamlights_on()) + protoAdapter2.encodedSizeWithTag(68, value.getHazards_on()) + protoAdapter2.encodedSizeWithTag(38, value.getTrailer_mode_on()) + protoAdapter2.encodedSizeWithTag(39, value.getSigned_cmd_service_mode()) + protoAdapter2.encodedSizeWithTag(40, value.getTransport_mode()) + protoAdapter2.encodedSizeWithTag(41, value.getFactory_mode()) + protoAdapter2.encodedSizeWithTag(42, value.getTraining_wheels_mode()) + ec0.m.ADAPTER.encodedSizeWithTag(43, value.getGtw_diag_level()) + protoAdapter2.encodedSizeWithTag(44, value.getTrailer_light_test_available()) + protoAdapter2.encodedSizeWithTag(45, value.getTrailer_light_test_requested()) + protoAdapter.encodedSizeWithTag(46, value.getTruck_bed_lights_brightness()) + protoAdapter.encodedSizeWithTag(47, value.getTruck_bed_lights_auto_brightness()) + protoAdapter2.encodedSizeWithTag(48, value.getTruck_bed_lights_auto_state()) + protoAdapter2.encodedSizeWithTag(49, value.getTruck_bed_lights_controls_disabled()) + protoAdapter2.encodedSizeWithTag(50, value.getAccessory_lightbar_middle_on()) + protoAdapter2.encodedSizeWithTag(67, value.getDeck_lights_on()) + protoAdapter2.encodedSizeWithTag(51, value.getInlet_heater_on()) + protoAdapter2.encodedSizeWithTag(52, value.getInlet_heater_supported()) + protoAdapter2.encodedSizeWithTag(54, value.getMobile_dashcam_viewer_enabled()) + protoAdapter2.encodedSizeWithTag(55, value.getCar_wrap_enabled()) + protoAdapter2.encodedSizeWithTag(59, value.getRemote_photobooth_available());
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.UINT64;
            return iEncodedSizeWithTag4 + protoAdapter4.encodedSizeWithTag(56, value.getDashcam_last_save_epoch()) + protoAdapter2.encodedSizeWithTag(58, value.getWiper_service_request()) + protoAdapter3.encodedSizeWithTag(60, value.getDog_mode_live_activity_key()) + protoAdapter4.encodedSizeWithTag(61, value.getPhotobooth_last_save_epoch()) + protoAdapter4.encodedSizeWithTag(62, value.getPhotobooth_last_update_epoch()) + protoAdapter2.encodedSizeWithTag(63, value.getFsd_stats_supported()) + protoAdapter2.encodedSizeWithTag(66, value.getRemote_sketchpad_available());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a1 redact(a1 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            c autopark_style = value.getAutopark_style();
            c cVarRedact = autopark_style != null ? c.f67979d.redact(autopark_style) : null;
            q0 active_spoiler_state = value.getActive_spoiler_state();
            q0 q0VarRedact = active_spoiler_state != null ? q0.f68379f.redact(active_spoiler_state) : null;
            d autopark_version = value.getAutopark_version();
            d dVarRedact = autopark_version != null ? d.f67990e.redact(autopark_version) : null;
            b autopark_state = value.getAutopark_state();
            b bVarRedact = autopark_state != null ? b.f67961n.redact(autopark_state) : null;
            w guestMode = value.getGuestMode();
            w wVarRedact = guestMode != null ? w.f68663c.redact(guestMode) : null;
            t dashcamUtils = value.getDashcamUtils();
            return a1.b(value, instantRedact, cVarRedact, q0VarRedact, dVarRedact, bVarRedact, null, wVarRedact, dashcamUtils != null ? t.f68449d.redact(dashcamUtils) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, -224, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null);
        }
    }

    public a1() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, Integer.MAX_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a1 b(a1 a1Var, Instant instant, c cVar, q0 q0Var, d dVar, b bVar, List list, w wVar, t tVar, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num3, Boolean bool9, Boolean bool10, s sVar, Boolean bool11, Boolean bool12, String str2, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, ec0.m mVar, Boolean bool28, Boolean bool29, Integer num4, Integer num5, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Long l11, Boolean bool39, String str3, Long l12, Long l13, Boolean bool40, Boolean bool41, okio.k kVar, int i11, int i12, Object obj) {
        return a1Var.a((i11 & 1) != 0 ? a1Var.timestamp : instant, (i11 & 2) != 0 ? a1Var.autopark_style : cVar, (i11 & 4) != 0 ? a1Var.active_spoiler_state : q0Var, (i11 & 8) != 0 ? a1Var.autopark_version : dVar, (i11 & 16) != 0 ? a1Var.autopark_state : bVar, (i11 & 32) != 0 ? a1Var.feature_bitmask : list, (i11 & 64) != 0 ? a1Var.guestMode : wVar, (i11 & 128) != 0 ? a1Var.dashcamUtils : tVar, (i11 & 256) != 0 ? a1Var.api_version : num, (i11 & 512) != 0 ? a1Var.notifications_supported : bool, (i11 & 1024) != 0 ? a1Var.remote_start_supported : bool2, (i11 & 2048) != 0 ? a1Var.remote_start_enabled : bool3, (i11 & 4096) != 0 ? a1Var.last_autopark_error : str, (i11 & PKIFailureInfo.certRevoked) != 0 ? a1Var.homelink_device_count : num2, (i11 & 16384) != 0 ? a1Var.smart_summon_available : bool4, (i11 & 32768) != 0 ? a1Var.summon_standby_mode_enabled : bool5, (i11 & 65536) != 0 ? a1Var.patsy_mode : bool6, (i11 & 131072) != 0 ? a1Var.webcam_available : bool7, (i11 & 262144) != 0 ? a1Var.vehicle_self_test_requested : bool8, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? a1Var.vehicle_self_test_progress : num3, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? a1Var.calendar_supported : bool9, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? a1Var.dashcam_clip_save_available : bool10, (i11 & 4194304) != 0 ? a1Var.dashcam_state : sVar, (i11 & 8388608) != 0 ? a1Var.service_mode : bool11, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? a1Var.service_mode_plus : bool12, (i11 & 33554432) != 0 ? a1Var.service_mode_auth : str2, (i11 & 67108864) != 0 ? a1Var.service_gtw_diag_session_active : bool13, (i11 & 134217728) != 0 ? a1Var.allow_authorized_mobile_devices_only : bool14, (i11 & 268435456) != 0 ? a1Var.drive_rail_on : bool15, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? a1Var.pin_to_drive_enabled : bool16, (i11 & 1073741824) != 0 ? a1Var.pin_to_drive_pin_set : bool17, (i11 & Integer.MIN_VALUE) != 0 ? a1Var.frontfoglights_on : bool18, (i12 & 1) != 0 ? a1Var.rearfoglights_on : bool19, (i12 & 2) != 0 ? a1Var.headlights_on : bool20, (i12 & 4) != 0 ? a1Var.highbeamlights_on : bool21, (i12 & 8) != 0 ? a1Var.hazards_on : bool22, (i12 & 16) != 0 ? a1Var.trailer_mode_on : bool23, (i12 & 32) != 0 ? a1Var.signed_cmd_service_mode : bool24, (i12 & 64) != 0 ? a1Var.transport_mode : bool25, (i12 & 128) != 0 ? a1Var.factory_mode : bool26, (i12 & 256) != 0 ? a1Var.training_wheels_mode : bool27, (i12 & 512) != 0 ? a1Var.gtw_diag_level : mVar, (i12 & 1024) != 0 ? a1Var.trailer_light_test_available : bool28, (i12 & 2048) != 0 ? a1Var.trailer_light_test_requested : bool29, (i12 & 4096) != 0 ? a1Var.truck_bed_lights_brightness : num4, (i12 & PKIFailureInfo.certRevoked) != 0 ? a1Var.truck_bed_lights_auto_brightness : num5, (i12 & 16384) != 0 ? a1Var.truck_bed_lights_auto_state : bool30, (i12 & 32768) != 0 ? a1Var.truck_bed_lights_controls_disabled : bool31, (i12 & 65536) != 0 ? a1Var.accessory_lightbar_middle_on : bool32, (i12 & 131072) != 0 ? a1Var.deck_lights_on : bool33, (i12 & 262144) != 0 ? a1Var.inlet_heater_on : bool34, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? a1Var.inlet_heater_supported : bool35, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? a1Var.mobile_dashcam_viewer_enabled : bool36, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? a1Var.car_wrap_enabled : bool37, (i12 & 4194304) != 0 ? a1Var.remote_photobooth_available : bool38, (i12 & 8388608) != 0 ? a1Var.dashcam_last_save_epoch : l11, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? a1Var.wiper_service_request : bool39, (i12 & 33554432) != 0 ? a1Var.dog_mode_live_activity_key : str3, (i12 & 67108864) != 0 ? a1Var.photobooth_last_save_epoch : l12, (i12 & 134217728) != 0 ? a1Var.photobooth_last_update_epoch : l13, (i12 & 268435456) != 0 ? a1Var.fsd_stats_supported : bool40, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? a1Var.remote_sketchpad_available : bool41, (i12 & 1073741824) != 0 ? a1Var.unknownFields() : kVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Boolean getHighbeamlights_on() {
        return this.highbeamlights_on;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Integer getHomelink_device_count() {
        return this.homelink_device_count;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Boolean getInlet_heater_on() {
        return this.inlet_heater_on;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Boolean getInlet_heater_supported() {
        return this.inlet_heater_supported;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final String getLast_autopark_error() {
        return this.last_autopark_error;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Boolean getMobile_dashcam_viewer_enabled() {
        return this.mobile_dashcam_viewer_enabled;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Boolean getNotifications_supported() {
        return this.notifications_supported;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Boolean getPatsy_mode() {
        return this.patsy_mode;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Long getPhotobooth_last_save_epoch() {
        return this.photobooth_last_save_epoch;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final Long getPhotobooth_last_update_epoch() {
        return this.photobooth_last_update_epoch;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final Boolean getPin_to_drive_enabled() {
        return this.pin_to_drive_enabled;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final Boolean getPin_to_drive_pin_set() {
        return this.pin_to_drive_pin_set;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final Boolean getRearfoglights_on() {
        return this.rearfoglights_on;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final Boolean getRemote_photobooth_available() {
        return this.remote_photobooth_available;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Boolean getRemote_sketchpad_available() {
        return this.remote_sketchpad_available;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final Boolean getRemote_start_enabled() {
        return this.remote_start_enabled;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Boolean getRemote_start_supported() {
        return this.remote_start_supported;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final Boolean getService_gtw_diag_session_active() {
        return this.service_gtw_diag_session_active;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final Boolean getService_mode() {
        return this.service_mode;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final String getService_mode_auth() {
        return this.service_mode_auth;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final Boolean getService_mode_plus() {
        return this.service_mode_plus;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final Boolean getSigned_cmd_service_mode() {
        return this.signed_cmd_service_mode;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final Boolean getSmart_summon_available() {
        return this.smart_summon_available;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final Boolean getSummon_standby_mode_enabled() {
        return this.summon_standby_mode_enabled;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final Boolean getTrailer_light_test_available() {
        return this.trailer_light_test_available;
    }

    public final a1 a(Instant timestamp, c autopark_style, q0 active_spoiler_state, d autopark_version, b autopark_state, List<Integer> feature_bitmask, w guestMode, t dashcamUtils, Integer api_version, Boolean notifications_supported, Boolean remote_start_supported, Boolean remote_start_enabled, String last_autopark_error, Integer homelink_device_count, Boolean smart_summon_available, Boolean summon_standby_mode_enabled, Boolean patsy_mode, Boolean webcam_available, Boolean vehicle_self_test_requested, Integer vehicle_self_test_progress, Boolean calendar_supported, Boolean dashcam_clip_save_available, s dashcam_state, Boolean service_mode, Boolean service_mode_plus, String service_mode_auth, Boolean service_gtw_diag_session_active, Boolean allow_authorized_mobile_devices_only, Boolean drive_rail_on, Boolean pin_to_drive_enabled, Boolean pin_to_drive_pin_set, Boolean frontfoglights_on, Boolean rearfoglights_on, Boolean headlights_on, Boolean highbeamlights_on, Boolean hazards_on, Boolean trailer_mode_on, Boolean signed_cmd_service_mode, Boolean transport_mode, Boolean factory_mode, Boolean training_wheels_mode, ec0.m gtw_diag_level, Boolean trailer_light_test_available, Boolean trailer_light_test_requested, Integer truck_bed_lights_brightness, Integer truck_bed_lights_auto_brightness, Boolean truck_bed_lights_auto_state, Boolean truck_bed_lights_controls_disabled, Boolean accessory_lightbar_middle_on, Boolean deck_lights_on, Boolean inlet_heater_on, Boolean inlet_heater_supported, Boolean mobile_dashcam_viewer_enabled, Boolean car_wrap_enabled, Boolean remote_photobooth_available, Long dashcam_last_save_epoch, Boolean wiper_service_request, String dog_mode_live_activity_key, Long photobooth_last_save_epoch, Long photobooth_last_update_epoch, Boolean fsd_stats_supported, Boolean remote_sketchpad_available, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(feature_bitmask, "feature_bitmask");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new a1(timestamp, autopark_style, active_spoiler_state, autopark_version, autopark_state, feature_bitmask, guestMode, dashcamUtils, api_version, notifications_supported, remote_start_supported, remote_start_enabled, last_autopark_error, homelink_device_count, smart_summon_available, summon_standby_mode_enabled, patsy_mode, webcam_available, vehicle_self_test_requested, vehicle_self_test_progress, calendar_supported, dashcam_clip_save_available, dashcam_state, service_mode, service_mode_plus, service_mode_auth, service_gtw_diag_session_active, allow_authorized_mobile_devices_only, drive_rail_on, pin_to_drive_enabled, pin_to_drive_pin_set, frontfoglights_on, rearfoglights_on, headlights_on, highbeamlights_on, hazards_on, trailer_mode_on, signed_cmd_service_mode, transport_mode, factory_mode, training_wheels_mode, gtw_diag_level, trailer_light_test_available, trailer_light_test_requested, truck_bed_lights_brightness, truck_bed_lights_auto_brightness, truck_bed_lights_auto_state, truck_bed_lights_controls_disabled, accessory_lightbar_middle_on, deck_lights_on, inlet_heater_on, inlet_heater_supported, mobile_dashcam_viewer_enabled, car_wrap_enabled, remote_photobooth_available, dashcam_last_save_epoch, wiper_service_request, dog_mode_live_activity_key, photobooth_last_save_epoch, photobooth_last_update_epoch, fsd_stats_supported, remote_sketchpad_available, unknownFields);
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Boolean getTrailer_light_test_requested() {
        return this.trailer_light_test_requested;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final Boolean getTrailer_mode_on() {
        return this.trailer_mode_on;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getAccessory_lightbar_middle_on() {
        return this.accessory_lightbar_middle_on;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q0 getActive_spoiler_state() {
        return this.active_spoiler_state;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final Boolean getTraining_wheels_mode() {
        return this.training_wheels_mode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getAllow_authorized_mobile_devices_only() {
        return this.allow_authorized_mobile_devices_only;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Boolean getTransport_mode() {
        return this.transport_mode;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), a1Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, a1Var.timestamp) && p013kotlin.jvm.internal.s.f(this.autopark_style, a1Var.autopark_style) && p013kotlin.jvm.internal.s.f(this.active_spoiler_state, a1Var.active_spoiler_state) && p013kotlin.jvm.internal.s.f(this.autopark_version, a1Var.autopark_version) && p013kotlin.jvm.internal.s.f(this.autopark_state, a1Var.autopark_state) && p013kotlin.jvm.internal.s.f(this.feature_bitmask, a1Var.feature_bitmask) && p013kotlin.jvm.internal.s.f(this.guestMode, a1Var.guestMode) && p013kotlin.jvm.internal.s.f(this.dashcamUtils, a1Var.dashcamUtils) && p013kotlin.jvm.internal.s.f(this.api_version, a1Var.api_version) && p013kotlin.jvm.internal.s.f(this.notifications_supported, a1Var.notifications_supported) && p013kotlin.jvm.internal.s.f(this.remote_start_supported, a1Var.remote_start_supported) && p013kotlin.jvm.internal.s.f(this.remote_start_enabled, a1Var.remote_start_enabled) && p013kotlin.jvm.internal.s.f(this.last_autopark_error, a1Var.last_autopark_error) && p013kotlin.jvm.internal.s.f(this.homelink_device_count, a1Var.homelink_device_count) && p013kotlin.jvm.internal.s.f(this.smart_summon_available, a1Var.smart_summon_available) && p013kotlin.jvm.internal.s.f(this.summon_standby_mode_enabled, a1Var.summon_standby_mode_enabled) && p013kotlin.jvm.internal.s.f(this.patsy_mode, a1Var.patsy_mode) && p013kotlin.jvm.internal.s.f(this.webcam_available, a1Var.webcam_available) && p013kotlin.jvm.internal.s.f(this.vehicle_self_test_requested, a1Var.vehicle_self_test_requested) && p013kotlin.jvm.internal.s.f(this.vehicle_self_test_progress, a1Var.vehicle_self_test_progress) && p013kotlin.jvm.internal.s.f(this.calendar_supported, a1Var.calendar_supported) && p013kotlin.jvm.internal.s.f(this.dashcam_clip_save_available, a1Var.dashcam_clip_save_available) && this.dashcam_state == a1Var.dashcam_state && p013kotlin.jvm.internal.s.f(this.service_mode, a1Var.service_mode) && p013kotlin.jvm.internal.s.f(this.service_mode_plus, a1Var.service_mode_plus) && p013kotlin.jvm.internal.s.f(this.service_mode_auth, a1Var.service_mode_auth) && p013kotlin.jvm.internal.s.f(this.service_gtw_diag_session_active, a1Var.service_gtw_diag_session_active) && p013kotlin.jvm.internal.s.f(this.allow_authorized_mobile_devices_only, a1Var.allow_authorized_mobile_devices_only) && p013kotlin.jvm.internal.s.f(this.drive_rail_on, a1Var.drive_rail_on) && p013kotlin.jvm.internal.s.f(this.pin_to_drive_enabled, a1Var.pin_to_drive_enabled) && p013kotlin.jvm.internal.s.f(this.pin_to_drive_pin_set, a1Var.pin_to_drive_pin_set) && p013kotlin.jvm.internal.s.f(this.frontfoglights_on, a1Var.frontfoglights_on) && p013kotlin.jvm.internal.s.f(this.rearfoglights_on, a1Var.rearfoglights_on) && p013kotlin.jvm.internal.s.f(this.headlights_on, a1Var.headlights_on) && p013kotlin.jvm.internal.s.f(this.highbeamlights_on, a1Var.highbeamlights_on) && p013kotlin.jvm.internal.s.f(this.hazards_on, a1Var.hazards_on) && p013kotlin.jvm.internal.s.f(this.trailer_mode_on, a1Var.trailer_mode_on) && p013kotlin.jvm.internal.s.f(this.signed_cmd_service_mode, a1Var.signed_cmd_service_mode) && p013kotlin.jvm.internal.s.f(this.transport_mode, a1Var.transport_mode) && p013kotlin.jvm.internal.s.f(this.factory_mode, a1Var.factory_mode) && p013kotlin.jvm.internal.s.f(this.training_wheels_mode, a1Var.training_wheels_mode) && this.gtw_diag_level == a1Var.gtw_diag_level && p013kotlin.jvm.internal.s.f(this.trailer_light_test_available, a1Var.trailer_light_test_available) && p013kotlin.jvm.internal.s.f(this.trailer_light_test_requested, a1Var.trailer_light_test_requested) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_brightness, a1Var.truck_bed_lights_brightness) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_auto_brightness, a1Var.truck_bed_lights_auto_brightness) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_auto_state, a1Var.truck_bed_lights_auto_state) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_controls_disabled, a1Var.truck_bed_lights_controls_disabled) && p013kotlin.jvm.internal.s.f(this.accessory_lightbar_middle_on, a1Var.accessory_lightbar_middle_on) && p013kotlin.jvm.internal.s.f(this.deck_lights_on, a1Var.deck_lights_on) && p013kotlin.jvm.internal.s.f(this.inlet_heater_on, a1Var.inlet_heater_on) && p013kotlin.jvm.internal.s.f(this.inlet_heater_supported, a1Var.inlet_heater_supported) && p013kotlin.jvm.internal.s.f(this.mobile_dashcam_viewer_enabled, a1Var.mobile_dashcam_viewer_enabled) && p013kotlin.jvm.internal.s.f(this.car_wrap_enabled, a1Var.car_wrap_enabled) && p013kotlin.jvm.internal.s.f(this.remote_photobooth_available, a1Var.remote_photobooth_available) && p013kotlin.jvm.internal.s.f(this.dashcam_last_save_epoch, a1Var.dashcam_last_save_epoch) && p013kotlin.jvm.internal.s.f(this.wiper_service_request, a1Var.wiper_service_request) && p013kotlin.jvm.internal.s.f(this.dog_mode_live_activity_key, a1Var.dog_mode_live_activity_key) && p013kotlin.jvm.internal.s.f(this.photobooth_last_save_epoch, a1Var.photobooth_last_save_epoch) && p013kotlin.jvm.internal.s.f(this.photobooth_last_update_epoch, a1Var.photobooth_last_update_epoch) && p013kotlin.jvm.internal.s.f(this.fsd_stats_supported, a1Var.fsd_stats_supported) && p013kotlin.jvm.internal.s.f(this.remote_sketchpad_available, a1Var.remote_sketchpad_available);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getApi_version() {
        return this.api_version;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final Integer getTruck_bed_lights_auto_brightness() {
        return this.truck_bed_lights_auto_brightness;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getAutopark_state() {
        return this.autopark_state;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final Boolean getTruck_bed_lights_auto_state() {
        return this.truck_bed_lights_auto_state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getAutopark_style() {
        return this.autopark_style;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Integer getTruck_bed_lights_brightness() {
        return this.truck_bed_lights_brightness;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        c cVar = this.autopark_style;
        int iHashCode3 = (iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 37;
        q0 q0Var = this.active_spoiler_state;
        int iHashCode4 = (iHashCode3 + (q0Var != null ? q0Var.hashCode() : 0)) * 37;
        d dVar = this.autopark_version;
        int iHashCode5 = (iHashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        b bVar = this.autopark_state;
        int iHashCode6 = (((iHashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 37) + this.feature_bitmask.hashCode()) * 37;
        w wVar = this.guestMode;
        int iHashCode7 = (iHashCode6 + (wVar != null ? wVar.hashCode() : 0)) * 37;
        t tVar = this.dashcamUtils;
        int iHashCode8 = (iHashCode7 + (tVar != null ? tVar.hashCode() : 0)) * 37;
        Integer num = this.api_version;
        int iHashCode9 = (iHashCode8 + (num != null ? num.hashCode() : 0)) * 37;
        Boolean bool = this.notifications_supported;
        int iHashCode10 = (iHashCode9 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.remote_start_supported;
        int iHashCode11 = (iHashCode10 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.remote_start_enabled;
        int iHashCode12 = (iHashCode11 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        String str = this.last_autopark_error;
        int iHashCode13 = (iHashCode12 + (str != null ? str.hashCode() : 0)) * 37;
        Integer num2 = this.homelink_device_count;
        int iHashCode14 = (iHashCode13 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool4 = this.smart_summon_available;
        int iHashCode15 = (iHashCode14 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.summon_standby_mode_enabled;
        int iHashCode16 = (iHashCode15 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.patsy_mode;
        int iHashCode17 = (iHashCode16 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.webcam_available;
        int iHashCode18 = (iHashCode17 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        Boolean bool8 = this.vehicle_self_test_requested;
        int iHashCode19 = (iHashCode18 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        Integer num3 = this.vehicle_self_test_progress;
        int iHashCode20 = (iHashCode19 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Boolean bool9 = this.calendar_supported;
        int iHashCode21 = (iHashCode20 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        Boolean bool10 = this.dashcam_clip_save_available;
        int iHashCode22 = (iHashCode21 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
        s sVar = this.dashcam_state;
        int iHashCode23 = (iHashCode22 + (sVar != null ? sVar.hashCode() : 0)) * 37;
        Boolean bool11 = this.service_mode;
        int iHashCode24 = (iHashCode23 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
        Boolean bool12 = this.service_mode_plus;
        int iHashCode25 = (iHashCode24 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
        String str2 = this.service_mode_auth;
        int iHashCode26 = (iHashCode25 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool13 = this.service_gtw_diag_session_active;
        int iHashCode27 = (iHashCode26 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
        Boolean bool14 = this.allow_authorized_mobile_devices_only;
        int iHashCode28 = (iHashCode27 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
        Boolean bool15 = this.drive_rail_on;
        int iHashCode29 = (iHashCode28 + (bool15 != null ? bool15.hashCode() : 0)) * 37;
        Boolean bool16 = this.pin_to_drive_enabled;
        int iHashCode30 = (iHashCode29 + (bool16 != null ? bool16.hashCode() : 0)) * 37;
        Boolean bool17 = this.pin_to_drive_pin_set;
        int iHashCode31 = (iHashCode30 + (bool17 != null ? bool17.hashCode() : 0)) * 37;
        Boolean bool18 = this.frontfoglights_on;
        int iHashCode32 = (iHashCode31 + (bool18 != null ? bool18.hashCode() : 0)) * 37;
        Boolean bool19 = this.rearfoglights_on;
        int iHashCode33 = (iHashCode32 + (bool19 != null ? bool19.hashCode() : 0)) * 37;
        Boolean bool20 = this.headlights_on;
        int iHashCode34 = (iHashCode33 + (bool20 != null ? bool20.hashCode() : 0)) * 37;
        Boolean bool21 = this.highbeamlights_on;
        int iHashCode35 = (iHashCode34 + (bool21 != null ? bool21.hashCode() : 0)) * 37;
        Boolean bool22 = this.hazards_on;
        int iHashCode36 = (iHashCode35 + (bool22 != null ? bool22.hashCode() : 0)) * 37;
        Boolean bool23 = this.trailer_mode_on;
        int iHashCode37 = (iHashCode36 + (bool23 != null ? bool23.hashCode() : 0)) * 37;
        Boolean bool24 = this.signed_cmd_service_mode;
        int iHashCode38 = (iHashCode37 + (bool24 != null ? bool24.hashCode() : 0)) * 37;
        Boolean bool25 = this.transport_mode;
        int iHashCode39 = (iHashCode38 + (bool25 != null ? bool25.hashCode() : 0)) * 37;
        Boolean bool26 = this.factory_mode;
        int iHashCode40 = (iHashCode39 + (bool26 != null ? bool26.hashCode() : 0)) * 37;
        Boolean bool27 = this.training_wheels_mode;
        int iHashCode41 = (iHashCode40 + (bool27 != null ? bool27.hashCode() : 0)) * 37;
        ec0.m mVar = this.gtw_diag_level;
        int iHashCode42 = (iHashCode41 + (mVar != null ? mVar.hashCode() : 0)) * 37;
        Boolean bool28 = this.trailer_light_test_available;
        int iHashCode43 = (iHashCode42 + (bool28 != null ? bool28.hashCode() : 0)) * 37;
        Boolean bool29 = this.trailer_light_test_requested;
        int iHashCode44 = (iHashCode43 + (bool29 != null ? bool29.hashCode() : 0)) * 37;
        Integer num4 = this.truck_bed_lights_brightness;
        int iHashCode45 = (iHashCode44 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.truck_bed_lights_auto_brightness;
        int iHashCode46 = (iHashCode45 + (num5 != null ? num5.hashCode() : 0)) * 37;
        Boolean bool30 = this.truck_bed_lights_auto_state;
        int iHashCode47 = (iHashCode46 + (bool30 != null ? bool30.hashCode() : 0)) * 37;
        Boolean bool31 = this.truck_bed_lights_controls_disabled;
        int iHashCode48 = (iHashCode47 + (bool31 != null ? bool31.hashCode() : 0)) * 37;
        Boolean bool32 = this.accessory_lightbar_middle_on;
        int iHashCode49 = (iHashCode48 + (bool32 != null ? bool32.hashCode() : 0)) * 37;
        Boolean bool33 = this.deck_lights_on;
        int iHashCode50 = (iHashCode49 + (bool33 != null ? bool33.hashCode() : 0)) * 37;
        Boolean bool34 = this.inlet_heater_on;
        int iHashCode51 = (iHashCode50 + (bool34 != null ? bool34.hashCode() : 0)) * 37;
        Boolean bool35 = this.inlet_heater_supported;
        int iHashCode52 = (iHashCode51 + (bool35 != null ? bool35.hashCode() : 0)) * 37;
        Boolean bool36 = this.mobile_dashcam_viewer_enabled;
        int iHashCode53 = (iHashCode52 + (bool36 != null ? bool36.hashCode() : 0)) * 37;
        Boolean bool37 = this.car_wrap_enabled;
        int iHashCode54 = (iHashCode53 + (bool37 != null ? bool37.hashCode() : 0)) * 37;
        Boolean bool38 = this.remote_photobooth_available;
        int iHashCode55 = (iHashCode54 + (bool38 != null ? bool38.hashCode() : 0)) * 37;
        Long l11 = this.dashcam_last_save_epoch;
        int iHashCode56 = (iHashCode55 + (l11 != null ? l11.hashCode() : 0)) * 37;
        Boolean bool39 = this.wiper_service_request;
        int iHashCode57 = (iHashCode56 + (bool39 != null ? bool39.hashCode() : 0)) * 37;
        String str3 = this.dog_mode_live_activity_key;
        int iHashCode58 = (iHashCode57 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l12 = this.photobooth_last_save_epoch;
        int iHashCode59 = (iHashCode58 + (l12 != null ? l12.hashCode() : 0)) * 37;
        Long l13 = this.photobooth_last_update_epoch;
        int iHashCode60 = (iHashCode59 + (l13 != null ? l13.hashCode() : 0)) * 37;
        Boolean bool40 = this.fsd_stats_supported;
        int iHashCode61 = (iHashCode60 + (bool40 != null ? bool40.hashCode() : 0)) * 37;
        Boolean bool41 = this.remote_sketchpad_available;
        int iHashCode62 = iHashCode61 + (bool41 != null ? bool41.hashCode() : 0);
        this.hashCode = iHashCode62;
        return iHashCode62;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getAutopark_version() {
        return this.autopark_version;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final Boolean getTruck_bed_lights_controls_disabled() {
        return this.truck_bed_lights_controls_disabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getCalendar_supported() {
        return this.calendar_supported;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final Integer getVehicle_self_test_progress() {
        return this.vehicle_self_test_progress;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getCar_wrap_enabled() {
        return this.car_wrap_enabled;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Boolean getVehicle_self_test_requested() {
        return this.vehicle_self_test_requested;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final t getDashcamUtils() {
        return this.dashcamUtils;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final Boolean getWebcam_available() {
        return this.webcam_available;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getDashcam_clip_save_available() {
        return this.dashcam_clip_save_available;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final Boolean getWiper_service_request() {
        return this.wiper_service_request;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Long getDashcam_last_save_epoch() {
        return this.dashcam_last_save_epoch;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m388newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final s getDashcam_state() {
        return this.dashcam_state;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getDeck_lights_on() {
        return this.deck_lights_on;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getDog_mode_live_activity_key() {
        return this.dog_mode_live_activity_key;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getDrive_rail_on() {
        return this.drive_rail_on;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getFactory_mode() {
        return this.factory_mode;
    }

    public final List<Integer> t() {
        return this.feature_bitmask;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        c cVar = this.autopark_style;
        if (cVar != null) {
            arrayList.add("autopark_style=" + cVar);
        }
        q0 q0Var = this.active_spoiler_state;
        if (q0Var != null) {
            arrayList.add("active_spoiler_state=" + q0Var);
        }
        d dVar = this.autopark_version;
        if (dVar != null) {
            arrayList.add("autopark_version=" + dVar);
        }
        b bVar = this.autopark_state;
        if (bVar != null) {
            arrayList.add("autopark_state=" + bVar);
        }
        if (!this.feature_bitmask.isEmpty()) {
            arrayList.add("feature_bitmask=" + this.feature_bitmask);
        }
        w wVar = this.guestMode;
        if (wVar != null) {
            arrayList.add("guestMode=" + wVar);
        }
        t tVar = this.dashcamUtils;
        if (tVar != null) {
            arrayList.add("dashcamUtils=" + tVar);
        }
        Integer num = this.api_version;
        if (num != null) {
            arrayList.add("api_version=" + num);
        }
        Boolean bool = this.notifications_supported;
        if (bool != null) {
            arrayList.add("notifications_supported=" + bool);
        }
        Boolean bool2 = this.remote_start_supported;
        if (bool2 != null) {
            arrayList.add("remote_start_supported=" + bool2);
        }
        Boolean bool3 = this.remote_start_enabled;
        if (bool3 != null) {
            arrayList.add("remote_start_enabled=" + bool3);
        }
        String str = this.last_autopark_error;
        if (str != null) {
            arrayList.add("last_autopark_error=" + x20.d.i(str));
        }
        Integer num2 = this.homelink_device_count;
        if (num2 != null) {
            arrayList.add("homelink_device_count=" + num2);
        }
        Boolean bool4 = this.smart_summon_available;
        if (bool4 != null) {
            arrayList.add("smart_summon_available=" + bool4);
        }
        Boolean bool5 = this.summon_standby_mode_enabled;
        if (bool5 != null) {
            arrayList.add("summon_standby_mode_enabled=" + bool5);
        }
        Boolean bool6 = this.patsy_mode;
        if (bool6 != null) {
            arrayList.add("patsy_mode=" + bool6);
        }
        Boolean bool7 = this.webcam_available;
        if (bool7 != null) {
            arrayList.add("webcam_available=" + bool7);
        }
        Boolean bool8 = this.vehicle_self_test_requested;
        if (bool8 != null) {
            arrayList.add("vehicle_self_test_requested=" + bool8);
        }
        Integer num3 = this.vehicle_self_test_progress;
        if (num3 != null) {
            arrayList.add("vehicle_self_test_progress=" + num3);
        }
        Boolean bool9 = this.calendar_supported;
        if (bool9 != null) {
            arrayList.add("calendar_supported=" + bool9);
        }
        Boolean bool10 = this.dashcam_clip_save_available;
        if (bool10 != null) {
            arrayList.add("dashcam_clip_save_available=" + bool10);
        }
        s sVar = this.dashcam_state;
        if (sVar != null) {
            arrayList.add("dashcam_state=" + sVar);
        }
        Boolean bool11 = this.service_mode;
        if (bool11 != null) {
            arrayList.add("service_mode=" + bool11);
        }
        Boolean bool12 = this.service_mode_plus;
        if (bool12 != null) {
            arrayList.add("service_mode_plus=" + bool12);
        }
        String str2 = this.service_mode_auth;
        if (str2 != null) {
            arrayList.add("service_mode_auth=" + x20.d.i(str2));
        }
        Boolean bool13 = this.service_gtw_diag_session_active;
        if (bool13 != null) {
            arrayList.add("service_gtw_diag_session_active=" + bool13);
        }
        Boolean bool14 = this.allow_authorized_mobile_devices_only;
        if (bool14 != null) {
            arrayList.add("allow_authorized_mobile_devices_only=" + bool14);
        }
        Boolean bool15 = this.drive_rail_on;
        if (bool15 != null) {
            arrayList.add("drive_rail_on=" + bool15);
        }
        Boolean bool16 = this.pin_to_drive_enabled;
        if (bool16 != null) {
            arrayList.add("pin_to_drive_enabled=" + bool16);
        }
        Boolean bool17 = this.pin_to_drive_pin_set;
        if (bool17 != null) {
            arrayList.add("pin_to_drive_pin_set=" + bool17);
        }
        Boolean bool18 = this.frontfoglights_on;
        if (bool18 != null) {
            arrayList.add("frontfoglights_on=" + bool18);
        }
        Boolean bool19 = this.rearfoglights_on;
        if (bool19 != null) {
            arrayList.add("rearfoglights_on=" + bool19);
        }
        Boolean bool20 = this.headlights_on;
        if (bool20 != null) {
            arrayList.add("headlights_on=" + bool20);
        }
        Boolean bool21 = this.highbeamlights_on;
        if (bool21 != null) {
            arrayList.add("highbeamlights_on=" + bool21);
        }
        Boolean bool22 = this.hazards_on;
        if (bool22 != null) {
            arrayList.add("hazards_on=" + bool22);
        }
        Boolean bool23 = this.trailer_mode_on;
        if (bool23 != null) {
            arrayList.add("trailer_mode_on=" + bool23);
        }
        Boolean bool24 = this.signed_cmd_service_mode;
        if (bool24 != null) {
            arrayList.add("signed_cmd_service_mode=" + bool24);
        }
        Boolean bool25 = this.transport_mode;
        if (bool25 != null) {
            arrayList.add("transport_mode=" + bool25);
        }
        Boolean bool26 = this.factory_mode;
        if (bool26 != null) {
            arrayList.add("factory_mode=" + bool26);
        }
        Boolean bool27 = this.training_wheels_mode;
        if (bool27 != null) {
            arrayList.add("training_wheels_mode=" + bool27);
        }
        ec0.m mVar = this.gtw_diag_level;
        if (mVar != null) {
            arrayList.add("gtw_diag_level=" + mVar);
        }
        Boolean bool28 = this.trailer_light_test_available;
        if (bool28 != null) {
            arrayList.add("trailer_light_test_available=" + bool28);
        }
        Boolean bool29 = this.trailer_light_test_requested;
        if (bool29 != null) {
            arrayList.add("trailer_light_test_requested=" + bool29);
        }
        Integer num4 = this.truck_bed_lights_brightness;
        if (num4 != null) {
            arrayList.add("truck_bed_lights_brightness=" + num4);
        }
        Integer num5 = this.truck_bed_lights_auto_brightness;
        if (num5 != null) {
            arrayList.add("truck_bed_lights_auto_brightness=" + num5);
        }
        Boolean bool30 = this.truck_bed_lights_auto_state;
        if (bool30 != null) {
            arrayList.add("truck_bed_lights_auto_state=" + bool30);
        }
        Boolean bool31 = this.truck_bed_lights_controls_disabled;
        if (bool31 != null) {
            arrayList.add("truck_bed_lights_controls_disabled=" + bool31);
        }
        Boolean bool32 = this.accessory_lightbar_middle_on;
        if (bool32 != null) {
            arrayList.add("accessory_lightbar_middle_on=" + bool32);
        }
        Boolean bool33 = this.deck_lights_on;
        if (bool33 != null) {
            arrayList.add("deck_lights_on=" + bool33);
        }
        Boolean bool34 = this.inlet_heater_on;
        if (bool34 != null) {
            arrayList.add("inlet_heater_on=" + bool34);
        }
        Boolean bool35 = this.inlet_heater_supported;
        if (bool35 != null) {
            arrayList.add("inlet_heater_supported=" + bool35);
        }
        Boolean bool36 = this.mobile_dashcam_viewer_enabled;
        if (bool36 != null) {
            arrayList.add("mobile_dashcam_viewer_enabled=" + bool36);
        }
        Boolean bool37 = this.car_wrap_enabled;
        if (bool37 != null) {
            arrayList.add("car_wrap_enabled=" + bool37);
        }
        Boolean bool38 = this.remote_photobooth_available;
        if (bool38 != null) {
            arrayList.add("remote_photobooth_available=" + bool38);
        }
        Long l11 = this.dashcam_last_save_epoch;
        if (l11 != null) {
            arrayList.add("dashcam_last_save_epoch=" + l11);
        }
        Boolean bool39 = this.wiper_service_request;
        if (bool39 != null) {
            arrayList.add("wiper_service_request=" + bool39);
        }
        String str3 = this.dog_mode_live_activity_key;
        if (str3 != null) {
            arrayList.add("dog_mode_live_activity_key=" + x20.d.i(str3));
        }
        Long l12 = this.photobooth_last_save_epoch;
        if (l12 != null) {
            arrayList.add("photobooth_last_save_epoch=" + l12);
        }
        Long l13 = this.photobooth_last_update_epoch;
        if (l13 != null) {
            arrayList.add("photobooth_last_update_epoch=" + l13);
        }
        Boolean bool40 = this.fsd_stats_supported;
        if (bool40 != null) {
            arrayList.add("fsd_stats_supported=" + bool40);
        }
        Boolean bool41 = this.remote_sketchpad_available;
        if (bool41 != null) {
            arrayList.add("remote_sketchpad_available=" + bool41);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "VehicleState{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Boolean getFrontfoglights_on() {
        return this.frontfoglights_on;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Boolean getFsd_stats_supported() {
        return this.fsd_stats_supported;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final ec0.m getGtw_diag_level() {
        return this.gtw_diag_level;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final w getGuestMode() {
        return this.guestMode;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getHazards_on() {
        return this.hazards_on;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Boolean getHeadlights_on() {
        return this.headlights_on;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a1(Instant instant, c cVar, q0 q0Var, d dVar, b bVar, List list, w wVar, t tVar, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num3, Boolean bool9, Boolean bool10, s sVar, Boolean bool11, Boolean bool12, String str2, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, ec0.m mVar, Boolean bool28, Boolean bool29, Integer num4, Integer num5, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Long l11, Boolean bool39, String str3, Long l12, Long l13, Boolean bool40, Boolean bool41, okio.k kVar, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        Instant instant2 = (i11 & 1) != 0 ? null : instant;
        this(instant2, (i11 & 2) != 0 ? null : cVar, (i11 & 4) != 0 ? null : q0Var, (i11 & 8) != 0 ? null : dVar, (i11 & 16) != 0 ? null : bVar, (i11 & 32) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 64) != 0 ? null : wVar, (i11 & 128) != 0 ? null : tVar, (i11 & 256) != 0 ? null : num, (i11 & 512) != 0 ? null : bool, (i11 & 1024) != 0 ? null : bool2, (i11 & 2048) != 0 ? null : bool3, (i11 & 4096) != 0 ? null : str, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : num2, (i11 & 16384) != 0 ? null : bool4, (i11 & 32768) != 0 ? null : bool5, (i11 & 65536) != 0 ? null : bool6, (i11 & 131072) != 0 ? null : bool7, (i11 & 262144) != 0 ? null : bool8, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : num3, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : bool9, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : bool10, (i11 & 4194304) != 0 ? null : sVar, (i11 & 8388608) != 0 ? null : bool11, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool12, (i11 & 33554432) != 0 ? null : str2, (i11 & 67108864) != 0 ? null : bool13, (i11 & 134217728) != 0 ? null : bool14, (i11 & 268435456) != 0 ? null : bool15, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? null : bool16, (i11 & 1073741824) != 0 ? null : bool17, (i11 & Integer.MIN_VALUE) != 0 ? null : bool18, (i12 & 1) != 0 ? null : bool19, (i12 & 2) != 0 ? null : bool20, (i12 & 4) != 0 ? null : bool21, (i12 & 8) != 0 ? null : bool22, (i12 & 16) != 0 ? null : bool23, (i12 & 32) != 0 ? null : bool24, (i12 & 64) != 0 ? null : bool25, (i12 & 128) != 0 ? null : bool26, (i12 & 256) != 0 ? null : bool27, (i12 & 512) != 0 ? null : mVar, (i12 & 1024) != 0 ? null : bool28, (i12 & 2048) != 0 ? null : bool29, (i12 & 4096) != 0 ? null : num4, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : num5, (i12 & 16384) != 0 ? null : bool30, (i12 & 32768) != 0 ? null : bool31, (i12 & 65536) != 0 ? null : bool32, (i12 & 131072) != 0 ? null : bool33, (i12 & 262144) != 0 ? null : bool34, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? null : bool35, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? null : bool36, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? null : bool37, (i12 & 4194304) != 0 ? null : bool38, (i12 & 8388608) != 0 ? null : l11, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool39, (i12 & 33554432) != 0 ? null : str3, (i12 & 67108864) != 0 ? null : l12, (i12 & 134217728) != 0 ? null : l13, (i12 & 268435456) != 0 ? null : bool40, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? null : bool41, (i12 & 1073741824) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m388newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(Instant instant, c cVar, q0 q0Var, d dVar, b bVar, List<Integer> feature_bitmask, w wVar, t tVar, Integer num, Boolean bool, Boolean bool2, Boolean bool3, String str, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num3, Boolean bool9, Boolean bool10, s sVar, Boolean bool11, Boolean bool12, String str2, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, ec0.m mVar, Boolean bool28, Boolean bool29, Integer num4, Integer num5, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Long l11, Boolean bool39, String str3, Long l12, Long l13, Boolean bool40, Boolean bool41, okio.k unknownFields) {
        super(f67923l0, unknownFields);
        p013kotlin.jvm.internal.s.k(feature_bitmask, "feature_bitmask");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.autopark_style = cVar;
        this.active_spoiler_state = q0Var;
        this.autopark_version = dVar;
        this.autopark_state = bVar;
        this.guestMode = wVar;
        this.dashcamUtils = tVar;
        this.api_version = num;
        this.notifications_supported = bool;
        this.remote_start_supported = bool2;
        this.remote_start_enabled = bool3;
        this.last_autopark_error = str;
        this.homelink_device_count = num2;
        this.smart_summon_available = bool4;
        this.summon_standby_mode_enabled = bool5;
        this.patsy_mode = bool6;
        this.webcam_available = bool7;
        this.vehicle_self_test_requested = bool8;
        this.vehicle_self_test_progress = num3;
        this.calendar_supported = bool9;
        this.dashcam_clip_save_available = bool10;
        this.dashcam_state = sVar;
        this.service_mode = bool11;
        this.service_mode_plus = bool12;
        this.service_mode_auth = str2;
        this.service_gtw_diag_session_active = bool13;
        this.allow_authorized_mobile_devices_only = bool14;
        this.drive_rail_on = bool15;
        this.pin_to_drive_enabled = bool16;
        this.pin_to_drive_pin_set = bool17;
        this.frontfoglights_on = bool18;
        this.rearfoglights_on = bool19;
        this.headlights_on = bool20;
        this.highbeamlights_on = bool21;
        this.hazards_on = bool22;
        this.trailer_mode_on = bool23;
        this.signed_cmd_service_mode = bool24;
        this.transport_mode = bool25;
        this.factory_mode = bool26;
        this.training_wheels_mode = bool27;
        this.gtw_diag_level = mVar;
        this.trailer_light_test_available = bool28;
        this.trailer_light_test_requested = bool29;
        this.truck_bed_lights_brightness = num4;
        this.truck_bed_lights_auto_brightness = num5;
        this.truck_bed_lights_auto_state = bool30;
        this.truck_bed_lights_controls_disabled = bool31;
        this.accessory_lightbar_middle_on = bool32;
        this.deck_lights_on = bool33;
        this.inlet_heater_on = bool34;
        this.inlet_heater_supported = bool35;
        this.mobile_dashcam_viewer_enabled = bool36;
        this.car_wrap_enabled = bool37;
        this.remote_photobooth_available = bool38;
        this.dashcam_last_save_epoch = l11;
        this.wiper_service_request = bool39;
        this.dog_mode_live_activity_key = str3;
        this.photobooth_last_save_epoch = l12;
        this.photobooth_last_update_epoch = l13;
        this.fsd_stats_supported = bool40;
        this.remote_sketchpad_available = bool41;
        this.feature_bitmask = x20.d.g("feature_bitmask", feature_bitmask);
    }
}
