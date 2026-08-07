package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import j$.time.Instant;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\be\u0018\u0000 Î\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001sBó\b\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010_\u001a\u00020^¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0002H\u0017¢\u0006\u0004\bb\u0010cJ\u001a\u0010f\u001a\u00020\u00172\b\u0010e\u001a\u0004\u0018\u00010dH\u0096\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010l\u001a\u00020kH\u0016¢\u0006\u0004\bl\u0010mJù\b\u0010n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010_\u001a\u00020^¢\u0006\u0004\bn\u0010oR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010p\u001a\u0004\bq\u0010rR\"\u0010\u0006\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010p\u001a\u0004\bt\u0010rR\"\u0010\u0007\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010p\u001a\u0004\bu\u0010rR\"\u0010\b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bv\u0010p\u001a\u0004\bw\u0010rR\"\u0010\t\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010p\u001a\u0004\by\u0010rR\"\u0010\n\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bz\u0010p\u001a\u0004\b{\u0010rR\"\u0010\u000b\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b|\u0010p\u001a\u0004\b}\u0010rR\"\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b~\u0010p\u001a\u0004\b\u007f\u0010rR$\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010p\u001a\u0005\b\u0081\u0001\u0010rR$\u0010\u000e\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010p\u001a\u0005\b\u0083\u0001\u0010rR$\u0010\u000f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010p\u001a\u0005\b\u0085\u0001\u0010rR$\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010p\u001a\u0005\b\u0087\u0001\u0010rR$\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010p\u001a\u0005\b\u0089\u0001\u0010rR \u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R \u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0006\b\u008f\u0001\u0010\u008d\u0001R\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bt\u0010\u008b\u0001\u001a\u0006\b\u0090\u0001\u0010\u008d\u0001R\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bu\u0010\u008b\u0001\u001a\u0006\b\u0091\u0001\u0010\u008d\u0001R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b{\u0010\u0092\u0001\u001a\u0005\bv\u0010\u0093\u0001R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b}\u0010\u0092\u0001\u001a\u0005\bx\u0010\u0093\u0001R\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0092\u0001\u001a\u0006\b\u008a\u0001\u0010\u0093\u0001R \u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0092\u0001\u001a\u0006\b\u008e\u0001\u0010\u0093\u0001R \u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0092\u0001\u001a\u0006\b\u0094\u0001\u0010\u0093\u0001R \u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0092\u0001\u001a\u0006\b\u0095\u0001\u0010\u0093\u0001R \u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0092\u0001\u001a\u0006\b\u0096\u0001\u0010\u0093\u0001R \u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0092\u0001\u001a\u0006\b\u0097\u0001\u0010\u0093\u0001R\u001f\u0010 \u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bw\u0010\u008b\u0001\u001a\u0006\b\u0098\u0001\u0010\u008d\u0001R\u001f\u0010!\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\by\u0010\u008b\u0001\u001a\u0006\b\u0099\u0001\u0010\u008d\u0001R \u0010\"\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008b\u0001\u001a\u0006\b\u009a\u0001\u0010\u008d\u0001R \u0010#\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u008b\u0001\u001a\u0006\b\u009b\u0001\u0010\u008d\u0001R \u0010$\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010\u008b\u0001\u001a\u0006\b\u009c\u0001\u0010\u008d\u0001R \u0010%\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u008b\u0001\u001a\u0006\b\u009d\u0001\u0010\u008d\u0001R \u0010&\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u008b\u0001\u001a\u0006\b\u009e\u0001\u0010\u008d\u0001R \u0010'\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u008b\u0001\u001a\u0006\b\u009f\u0001\u0010\u008d\u0001R \u0010(\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u008b\u0001\u001a\u0006\b \u0001\u0010\u008d\u0001R \u0010)\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010\u008b\u0001\u001a\u0006\b¡\u0001\u0010\u008d\u0001R\u001f\u0010*\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b \u0001\u0010\u0092\u0001\u001a\u0005\bz\u0010\u0093\u0001R\u001f\u0010+\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b¡\u0001\u0010\u0092\u0001\u001a\u0005\b|\u0010\u0093\u0001R\u001f\u0010,\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0092\u0001\u001a\u0005\b~\u0010\u0093\u0001R \u0010-\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0080\u0001\u0010\u0093\u0001R \u0010.\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0092\u0001\u001a\u0006\b\u0082\u0001\u0010\u0093\u0001R \u0010/\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u0092\u0001\u001a\u0006\b\u0084\u0001\u0010\u0093\u0001R \u00100\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0092\u0001\u001a\u0006\b\u0086\u0001\u0010\u0093\u0001R \u00101\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0092\u0001\u001a\u0006\b\u0088\u0001\u0010\u0093\u0001R \u00102\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u0092\u0001\u001a\u0006\b¢\u0001\u0010\u0093\u0001R \u00103\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0092\u0001\u001a\u0006\b£\u0001\u0010\u0093\u0001R \u00104\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010\u0092\u0001\u001a\u0006\b¤\u0001\u0010\u0093\u0001R \u00105\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u0092\u0001\u001a\u0006\b¥\u0001\u0010\u0093\u0001R \u00106\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u0092\u0001\u001a\u0006\b¦\u0001\u0010\u0093\u0001R \u00107\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010\u0092\u0001\u001a\u0006\b§\u0001\u0010\u0093\u0001R \u00108\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u0092\u0001\u001a\u0006\b¨\u0001\u0010\u0093\u0001R \u00109\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010\u0092\u0001\u001a\u0006\b©\u0001\u0010\u0093\u0001R \u0010:\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u008b\u0001\u001a\u0006\bª\u0001\u0010\u008d\u0001R \u0010;\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010\u008b\u0001\u001a\u0006\b«\u0001\u0010\u008d\u0001R \u0010<\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010\u008b\u0001\u001a\u0006\b¬\u0001\u0010\u008d\u0001R \u0010=\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u008b\u0001\u001a\u0006\b®\u0001\u0010\u008d\u0001R \u0010>\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010\u008b\u0001\u001a\u0006\b¯\u0001\u0010\u008d\u0001R \u0010?\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010\u008b\u0001\u001a\u0006\b±\u0001\u0010\u008d\u0001R \u0010@\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010\u008b\u0001\u001a\u0006\b³\u0001\u0010\u008d\u0001R \u0010A\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010\u008b\u0001\u001a\u0006\bµ\u0001\u0010\u008d\u0001R \u0010B\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¶\u0001\u0010\u008b\u0001\u001a\u0006\b·\u0001\u0010\u008d\u0001R \u0010C\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¸\u0001\u0010\u008b\u0001\u001a\u0006\b¹\u0001\u0010\u008d\u0001R \u0010D\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010\u008b\u0001\u001a\u0006\b»\u0001\u0010\u008d\u0001R \u0010E\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u008b\u0001\u001a\u0006\b½\u0001\u0010\u008d\u0001R \u0010F\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¾\u0001\u0010\u0092\u0001\u001a\u0006\b°\u0001\u0010\u0093\u0001R \u0010G\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¿\u0001\u0010\u0092\u0001\u001a\u0006\b²\u0001\u0010\u0093\u0001R \u0010H\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010\u0092\u0001\u001a\u0006\bÁ\u0001\u0010\u0093\u0001R \u0010I\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u0092\u0001\u001a\u0006\bÂ\u0001\u0010\u0093\u0001R \u0010J\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÂ\u0001\u0010\u0092\u0001\u001a\u0006\b´\u0001\u0010\u0093\u0001R \u0010K\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u0092\u0001\u001a\u0006\b¶\u0001\u0010\u0093\u0001R \u0010L\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010\u0092\u0001\u001a\u0006\b¸\u0001\u0010\u0093\u0001R \u0010M\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÃ\u0001\u0010\u0092\u0001\u001a\u0006\bº\u0001\u0010\u0093\u0001R \u0010N\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b³\u0001\u0010\u0092\u0001\u001a\u0006\b¼\u0001\u0010\u0093\u0001R \u0010O\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010\u0092\u0001\u001a\u0006\b¾\u0001\u0010\u0093\u0001R \u0010P\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b·\u0001\u0010\u0092\u0001\u001a\u0006\b¿\u0001\u0010\u0093\u0001R \u0010Q\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¹\u0001\u0010\u0092\u0001\u001a\u0006\bÀ\u0001\u0010\u0093\u0001R \u0010R\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b»\u0001\u0010\u0092\u0001\u001a\u0006\bÄ\u0001\u0010\u0093\u0001R \u0010S\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010\u0092\u0001\u001a\u0006\bÅ\u0001\u0010\u0093\u0001R \u0010T\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010\u0092\u0001\u001a\u0006\bÆ\u0001\u0010\u0093\u0001R \u0010U\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010\u0092\u0001\u001a\u0006\bÇ\u0001\u0010\u0093\u0001R \u0010V\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÄ\u0001\u0010\u0092\u0001\u001a\u0006\bÈ\u0001\u0010\u0093\u0001R \u0010W\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÅ\u0001\u0010\u0092\u0001\u001a\u0006\bÉ\u0001\u0010\u0093\u0001R \u0010X\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010\u0092\u0001\u001a\u0006\bÊ\u0001\u0010\u0093\u0001R \u0010Y\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÉ\u0001\u0010\u0092\u0001\u001a\u0006\bË\u0001\u0010\u0093\u0001R \u0010Z\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÊ\u0001\u0010\u0092\u0001\u001a\u0006\bÌ\u0001\u0010\u0093\u0001R \u0010[\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010\u0092\u0001\u001a\u0006\bÍ\u0001\u0010\u0093\u0001R \u0010\\\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010\u0092\u0001\u001a\u0006\bÎ\u0001\u0010\u0093\u0001R \u0010]\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÍ\u0001\u0010\u0092\u0001\u001a\u0006\bÏ\u0001\u0010\u0093\u0001¨\u0006Ð\u0001"}, d2 = {"Lgc0/t0;", "Lcom/squareup/wire/f;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "tpms_last_seen_pressure_time_fl", "tpms_last_seen_pressure_time_fr", "tpms_last_seen_pressure_time_rl", "tpms_last_seen_pressure_time_rr", "tpms_last_seen_pressure_time_re1_l0", "tpms_last_seen_pressure_time_re1_l1", "tpms_last_seen_pressure_time_re1_r0", "tpms_last_seen_pressure_time_re1_r1", "tpms_last_seen_pressure_time_re2_l0", "tpms_last_seen_pressure_time_re2_l1", "tpms_last_seen_pressure_time_re2_r0", "tpms_last_seen_pressure_time_re2_r1", "", "tpms_pressure_fl", "tpms_pressure_fr", "tpms_pressure_rl", "tpms_pressure_rr", "", "tpms_hard_warning_fl", "tpms_hard_warning_fr", "tpms_hard_warning_rl", "tpms_hard_warning_rr", "tpms_soft_warning_fl", "tpms_soft_warning_fr", "tpms_soft_warning_rl", "tpms_soft_warning_rr", "tpms_rcp_front_value", "tpms_rcp_rear_value", "tpms_pressure_re1_l0", "tpms_pressure_re1_l1", "tpms_pressure_re1_r0", "tpms_pressure_re1_r1", "tpms_pressure_re2_l0", "tpms_pressure_re2_l1", "tpms_pressure_re2_r0", "tpms_pressure_re2_r1", "tpms_hard_warning_re1_l0", "tpms_hard_warning_re1_l1", "tpms_hard_warning_re1_r0", "tpms_hard_warning_re1_r1", "tpms_hard_warning_re2_l0", "tpms_hard_warning_re2_l1", "tpms_hard_warning_re2_r0", "tpms_hard_warning_re2_r1", "tpms_soft_warning_re1_l0", "tpms_soft_warning_re1_l1", "tpms_soft_warning_re1_r0", "tpms_soft_warning_re1_r1", "tpms_soft_warning_re2_l0", "tpms_soft_warning_re2_l1", "tpms_soft_warning_re2_r0", "tpms_soft_warning_re2_r1", "tpms_temperature_fl", "tpms_temperature_fr", "tpms_temperature_rl", "tpms_temperature_rr", "tpms_temperature_re1_l0", "tpms_temperature_re1_l1", "tpms_temperature_re1_r0", "tpms_temperature_re1_r1", "tpms_temperature_re2_l0", "tpms_temperature_re2_l1", "tpms_temperature_re2_r0", "tpms_temperature_re2_r1", "tpms_temperature_hard_warning_fl", "tpms_temperature_hard_warning_fr", "tpms_temperature_hard_warning_rl", "tpms_temperature_hard_warning_rr", "tpms_temperature_hard_warning_re1_l0", "tpms_temperature_hard_warning_re1_l1", "tpms_temperature_hard_warning_re1_r0", "tpms_temperature_hard_warning_re1_r1", "tpms_temperature_hard_warning_re2_l0", "tpms_temperature_hard_warning_re2_l1", "tpms_temperature_hard_warning_re2_r0", "tpms_temperature_hard_warning_re2_r1", "tpms_temperature_soft_warning_fl", "tpms_temperature_soft_warning_fr", "tpms_temperature_soft_warning_rl", "tpms_temperature_soft_warning_rr", "tpms_temperature_soft_warning_re1_l0", "tpms_temperature_soft_warning_re1_l1", "tpms_temperature_soft_warning_re1_r0", "tpms_temperature_soft_warning_re1_r1", "tpms_temperature_soft_warning_re2_l0", "tpms_temperature_soft_warning_re2_l1", "tpms_temperature_soft_warning_re2_r0", "tpms_temperature_soft_warning_re2_r1", "Lokio/k;", "unknownFields", "<init>", "(Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/k;)Lgc0/t0;", "Lj$/time/Instant;", "c", "()Lj$/time/Instant;", "b", "p", "q", DateTokenConverter.CONVERTER_KEY, "z", "e", "A", "f", "r", "g", "s", "h", "t", IntegerTokenConverter.CONVERTER_KEY, "u", "j", "v", "k", "w", "l", "x", "m", "y", "n", "Ljava/lang/Float;", "B", "()Ljava/lang/Float;", "o", "C", "L", Gender.MALE, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "P", "Q", "Z", "a0", Gender.NONE, Gender.OTHER, "D", "E", Gender.FEMALE, "G", "H", "I", "J", "K", "R", "S", "T", Gender.UNKNOWN, "V", "W", "X", "Y", "b0", "d0", "z0", "c0", "A0", "q0", "e0", "r0", "f0", "t0", "g0", "u0", "h0", "v0", "i0", "w0", "j0", "x0", "k0", "y0", "l0", "m0", "n0", "o0", "p0", "s0", "B0", "C0", "M0", "N0", "D0", "E0", "F0", "G0", "H0", "I0", "J0", "L0", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t0 extends com.squareup.wire.f {
    public static final ProtoAdapter<t0> K0 = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(t0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpRearValue", tag = 19)
    private final Float tpms_rcp_rear_value;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRr", tag = 79)
    private final Boolean tpms_temperature_soft_warning_rr;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRe1L0", tag = 20)
    private final Float tpms_pressure_re1_l0;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRe1L0", tag = 80)
    private final Boolean tpms_temperature_soft_warning_re1_l0;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRe1L1", tag = 21)
    private final Float tpms_pressure_re1_l1;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRe1L1", tag = 81)
    private final Boolean tpms_temperature_soft_warning_re1_l1;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRe1R0", tag = 22)
    private final Float tpms_pressure_re1_r0;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRe1R0", tag = 82)
    private final Boolean tpms_temperature_soft_warning_re1_r0;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRe1R1", tag = 23)
    private final Float tpms_pressure_re1_r1;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRe1R1", tag = 83)
    private final Boolean tpms_temperature_soft_warning_re1_r1;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRe2L0", tag = 24)
    private final Float tpms_pressure_re2_l0;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRe2L0", tag = 84)
    private final Boolean tpms_temperature_soft_warning_re2_l0;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRe2L1", tag = 25)
    private final Float tpms_pressure_re2_l1;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRe2L1", tag = 85)
    private final Boolean tpms_temperature_soft_warning_re2_l1;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRe2R0", tag = 26)
    private final Float tpms_pressure_re2_r0;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRe2R0", tag = 86)
    private final Boolean tpms_temperature_soft_warning_re2_r0;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRe2R1", tag = 27)
    private final Float tpms_pressure_re2_r1;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRe2R1", tag = 87)
    private final Boolean tpms_temperature_soft_warning_re2_r1;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRe1L0", tag = 36)
    private final Boolean tpms_hard_warning_re1_l0;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRe1L1", tag = 37)
    private final Boolean tpms_hard_warning_re1_l1;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRe1R0", tag = 38)
    private final Boolean tpms_hard_warning_re1_r0;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRe1R1", tag = 39)
    private final Boolean tpms_hard_warning_re1_r1;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRe2L0", tag = 40)
    private final Boolean tpms_hard_warning_re2_l0;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRe2L1", tag = 41)
    private final Boolean tpms_hard_warning_re2_l1;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRe2R0", tag = 42)
    private final Boolean tpms_hard_warning_re2_r0;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRe2R1", tag = 43)
    private final Boolean tpms_hard_warning_re2_r1;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRe1L0", tag = 44)
    private final Boolean tpms_soft_warning_re1_l0;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRe1L1", tag = 45)
    private final Boolean tpms_soft_warning_re1_l1;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRe1R0", tag = 46)
    private final Boolean tpms_soft_warning_re1_r0;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRe1R1", tag = 47)
    private final Boolean tpms_soft_warning_re1_r1;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRe2L0", tag = 48)
    private final Boolean tpms_soft_warning_re2_l0;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRe2L1", tag = 49)
    private final Boolean tpms_soft_warning_re2_l1;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRe2R0", tag = 50)
    private final Boolean tpms_soft_warning_re2_r0;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRe2R1", tag = 51)
    private final Boolean tpms_soft_warning_re2_r1;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureFl", tag = 52)
    private final Float tpms_temperature_fl;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final Instant timestamp;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureFr", tag = 53)
    private final Float tpms_temperature_fr;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeFl", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final Instant tpms_last_seen_pressure_time_fl;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRl", tag = 54)
    private final Float tpms_temperature_rl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeFr", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final Instant tpms_last_seen_pressure_time_fr;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRr", tag = 55)
    private final Float tpms_temperature_rr;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRl", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final Instant tpms_last_seen_pressure_time_rl;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRe1L0", tag = 56)
    private final Float tpms_temperature_re1_l0;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRr", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final Instant tpms_last_seen_pressure_time_rr;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRe1L1", tag = 57)
    private final Float tpms_temperature_re1_l1;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRe1L0", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 28)
    private final Instant tpms_last_seen_pressure_time_re1_l0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRe1R0", tag = 58)
    private final Float tpms_temperature_re1_r0;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRe1L1", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 29)
    private final Instant tpms_last_seen_pressure_time_re1_l1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRe1R1", tag = 59)
    private final Float tpms_temperature_re1_r1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRe1R0", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 30)
    private final Instant tpms_last_seen_pressure_time_re1_r0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRe2L0", tag = 60)
    private final Float tpms_temperature_re2_l0;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRe1R1", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 31)
    private final Instant tpms_last_seen_pressure_time_re1_r1;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRe2L1", tag = 61)
    private final Float tpms_temperature_re2_l1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRe2L0", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 32)
    private final Instant tpms_last_seen_pressure_time_re2_l0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRe2R0", tag = 62)
    private final Float tpms_temperature_re2_r0;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRe2L1", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 33)
    private final Instant tpms_last_seen_pressure_time_re2_l1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsTemperatureRe2R1", tag = 63)
    private final Float tpms_temperature_re2_r1;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRe2R0", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 34)
    private final Instant tpms_last_seen_pressure_time_re2_r0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningFl", tag = 64)
    private final Boolean tpms_temperature_hard_warning_fl;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRe2R1", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 35)
    private final Instant tpms_last_seen_pressure_time_re2_r1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningFr", tag = 65)
    private final Boolean tpms_temperature_hard_warning_fr;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFl", tag = 2)
    private final Float tpms_pressure_fl;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRl", tag = 66)
    private final Boolean tpms_temperature_hard_warning_rl;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFr", tag = 3)
    private final Float tpms_pressure_fr;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRr", tag = 67)
    private final Boolean tpms_temperature_hard_warning_rr;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRl", tag = 4)
    private final Float tpms_pressure_rl;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRe1L0", tag = 68)
    private final Boolean tpms_temperature_hard_warning_re1_l0;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRr", tag = 5)
    private final Float tpms_pressure_rr;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRe1L1", tag = 69)
    private final Boolean tpms_temperature_hard_warning_re1_l1;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFl", tag = 10)
    private final Boolean tpms_hard_warning_fl;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRe1R0", tag = 70)
    private final Boolean tpms_temperature_hard_warning_re1_r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFr", tag = 11)
    private final Boolean tpms_hard_warning_fr;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRe1R1", tag = 71)
    private final Boolean tpms_temperature_hard_warning_re1_r1;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRl", tag = 12)
    private final Boolean tpms_hard_warning_rl;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRe2L0", tag = 72)
    private final Boolean tpms_temperature_hard_warning_re2_l0;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRr", tag = 13)
    private final Boolean tpms_hard_warning_rr;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRe2L1", tag = 73)
    private final Boolean tpms_temperature_hard_warning_re2_l1;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFl", tag = 14)
    private final Boolean tpms_soft_warning_fl;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRe2R0", tag = 74)
    private final Boolean tpms_temperature_hard_warning_re2_r0;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFr", tag = 15)
    private final Boolean tpms_soft_warning_fr;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureHardWarningRe2R1", tag = 75)
    private final Boolean tpms_temperature_hard_warning_re2_r1;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRl", tag = 16)
    private final Boolean tpms_soft_warning_rl;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningFl", tag = 76)
    private final Boolean tpms_temperature_soft_warning_fl;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRr", tag = 17)
    private final Boolean tpms_soft_warning_rr;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningFr", tag = 77)
    private final Boolean tpms_temperature_soft_warning_fr;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpFrontValue", tag = 18)
    private final Float tpms_rcp_front_value;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsTemperatureSoftWarningRl", tag = 78)
    private final Boolean tpms_temperature_soft_warning_rl;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/t0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/t0;", "value", "", "c", "(Lgc0/t0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/t0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/t0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/t0;)Lgc0/t0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<t0> {
        a(com.squareup.wire.b bVar, co0.d<t0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.TirePressureState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Instant instant = null;
            Instant instant2 = null;
            Instant instant3 = null;
            Instant instant4 = null;
            Instant instant5 = null;
            Instant instant6 = null;
            Instant instant7 = null;
            Instant instant8 = null;
            Instant instant9 = null;
            Instant instant10 = null;
            Instant instant11 = null;
            Instant instant12 = null;
            Float f11 = null;
            Float f12 = null;
            Float f13 = null;
            Float f14 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Float f15 = null;
            Float f16 = null;
            Float f17 = null;
            Float f18 = null;
            Float f19 = null;
            Float f21 = null;
            Float f22 = null;
            Float f23 = null;
            Float f24 = null;
            Float f25 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
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
            Float f26 = null;
            Float f27 = null;
            Float f28 = null;
            Float f29 = null;
            Float f31 = null;
            Float f32 = null;
            Float f33 = null;
            Float f34 = null;
            Float f35 = null;
            Float f36 = null;
            Float f37 = null;
            Float f38 = null;
            Boolean bool25 = null;
            Boolean bool26 = null;
            Boolean bool27 = null;
            Boolean bool28 = null;
            Boolean bool29 = null;
            Boolean bool30 = null;
            Boolean bool31 = null;
            Boolean bool32 = null;
            Boolean bool33 = null;
            Boolean bool34 = null;
            Boolean bool35 = null;
            Boolean bool36 = null;
            Boolean bool37 = null;
            Boolean bool38 = null;
            Boolean bool39 = null;
            Boolean bool40 = null;
            Boolean bool41 = null;
            Boolean bool42 = null;
            Boolean bool43 = null;
            Boolean bool44 = null;
            Boolean bool45 = null;
            Boolean bool46 = null;
            Boolean bool47 = null;
            Boolean bool48 = null;
            Instant instant13 = null;
            while (true) {
                int iG = reader.g();
                Instant instant14 = instant;
                if (iG == -1) {
                    return new t0(instant13, instant14, instant2, instant3, instant4, instant5, instant6, instant7, instant8, instant9, instant10, instant11, instant12, f11, f12, f13, f14, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, bool21, bool22, bool23, bool24, f26, f27, f28, f29, f31, f32, f33, f34, f35, f36, f37, f38, bool25, bool26, bool27, bool28, bool29, bool30, bool31, bool32, bool33, bool34, bool35, bool36, bool37, bool38, bool39, bool40, bool41, bool42, bool43, bool44, bool45, bool46, bool47, bool48, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        Instant instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var = jn0.h0.f84049a;
                        instant13 = instantDecode;
                        break;
                    case 2:
                        Float fDecode = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var2 = jn0.h0.f84049a;
                        f11 = fDecode;
                        break;
                    case 3:
                        Float fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var3 = jn0.h0.f84049a;
                        f12 = fDecode2;
                        break;
                    case 4:
                        Float fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var4 = jn0.h0.f84049a;
                        f13 = fDecode3;
                        break;
                    case 5:
                        Float fDecode4 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var5 = jn0.h0.f84049a;
                        f14 = fDecode4;
                        break;
                    case 6:
                        Instant instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var6 = jn0.h0.f84049a;
                        instant = instantDecode2;
                        continue;
                    case 7:
                        Instant instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var7 = jn0.h0.f84049a;
                        instant2 = instantDecode3;
                        break;
                    case 8:
                        Instant instantDecode4 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var8 = jn0.h0.f84049a;
                        instant3 = instantDecode4;
                        break;
                    case 9:
                        Instant instantDecode5 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var9 = jn0.h0.f84049a;
                        instant4 = instantDecode5;
                        break;
                    case 10:
                        Boolean boolDecode = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var10 = jn0.h0.f84049a;
                        bool = boolDecode;
                        break;
                    case 11:
                        Boolean boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var11 = jn0.h0.f84049a;
                        bool2 = boolDecode2;
                        break;
                    case 12:
                        Boolean boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var12 = jn0.h0.f84049a;
                        bool3 = boolDecode3;
                        break;
                    case 13:
                        Boolean boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var13 = jn0.h0.f84049a;
                        bool4 = boolDecode4;
                        break;
                    case 14:
                        Boolean boolDecode5 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var14 = jn0.h0.f84049a;
                        bool5 = boolDecode5;
                        break;
                    case 15:
                        Boolean boolDecode6 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var15 = jn0.h0.f84049a;
                        bool6 = boolDecode6;
                        break;
                    case 16:
                        Boolean boolDecode7 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var16 = jn0.h0.f84049a;
                        bool7 = boolDecode7;
                        break;
                    case 17:
                        Boolean boolDecode8 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var17 = jn0.h0.f84049a;
                        bool8 = boolDecode8;
                        break;
                    case 18:
                        Float fDecode5 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var18 = jn0.h0.f84049a;
                        f15 = fDecode5;
                        break;
                    case 19:
                        Float fDecode6 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var19 = jn0.h0.f84049a;
                        f16 = fDecode6;
                        break;
                    case 20:
                        Float fDecode7 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var20 = jn0.h0.f84049a;
                        f17 = fDecode7;
                        break;
                    case 21:
                        Float fDecode8 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var21 = jn0.h0.f84049a;
                        f18 = fDecode8;
                        break;
                    case 22:
                        Float fDecode9 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var22 = jn0.h0.f84049a;
                        f19 = fDecode9;
                        break;
                    case 23:
                        Float fDecode10 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var23 = jn0.h0.f84049a;
                        f21 = fDecode10;
                        break;
                    case 24:
                        Float fDecode11 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var24 = jn0.h0.f84049a;
                        f22 = fDecode11;
                        break;
                    case 25:
                        Float fDecode12 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var25 = jn0.h0.f84049a;
                        f23 = fDecode12;
                        break;
                    case 26:
                        Float fDecode13 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var26 = jn0.h0.f84049a;
                        f24 = fDecode13;
                        break;
                    case 27:
                        Float fDecode14 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var27 = jn0.h0.f84049a;
                        f25 = fDecode14;
                        break;
                    case 28:
                        Instant instantDecode6 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var28 = jn0.h0.f84049a;
                        instant5 = instantDecode6;
                        break;
                    case 29:
                        Instant instantDecode7 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var29 = jn0.h0.f84049a;
                        instant6 = instantDecode7;
                        break;
                    case 30:
                        Instant instantDecode8 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var30 = jn0.h0.f84049a;
                        instant7 = instantDecode8;
                        break;
                    case 31:
                        Instant instantDecode9 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var31 = jn0.h0.f84049a;
                        instant8 = instantDecode9;
                        break;
                    case 32:
                        Instant instantDecode10 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var32 = jn0.h0.f84049a;
                        instant9 = instantDecode10;
                        break;
                    case 33:
                        Instant instantDecode11 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var33 = jn0.h0.f84049a;
                        instant10 = instantDecode11;
                        break;
                    case 34:
                        Instant instantDecode12 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var34 = jn0.h0.f84049a;
                        instant11 = instantDecode12;
                        break;
                    case 35:
                        Instant instantDecode13 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var35 = jn0.h0.f84049a;
                        instant12 = instantDecode13;
                        break;
                    case 36:
                        Boolean boolDecode9 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var36 = jn0.h0.f84049a;
                        bool9 = boolDecode9;
                        break;
                    case 37:
                        Boolean boolDecode10 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var37 = jn0.h0.f84049a;
                        bool10 = boolDecode10;
                        break;
                    case 38:
                        Boolean boolDecode11 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var38 = jn0.h0.f84049a;
                        bool11 = boolDecode11;
                        break;
                    case 39:
                        Boolean boolDecode12 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var39 = jn0.h0.f84049a;
                        bool12 = boolDecode12;
                        break;
                    case 40:
                        Boolean boolDecode13 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var40 = jn0.h0.f84049a;
                        bool13 = boolDecode13;
                        break;
                    case 41:
                        Boolean boolDecode14 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var41 = jn0.h0.f84049a;
                        bool14 = boolDecode14;
                        break;
                    case 42:
                        Boolean boolDecode15 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var42 = jn0.h0.f84049a;
                        bool15 = boolDecode15;
                        break;
                    case 43:
                        Boolean boolDecode16 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var43 = jn0.h0.f84049a;
                        bool16 = boolDecode16;
                        break;
                    case 44:
                        Boolean boolDecode17 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var44 = jn0.h0.f84049a;
                        bool17 = boolDecode17;
                        break;
                    case 45:
                        Boolean boolDecode18 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var45 = jn0.h0.f84049a;
                        bool18 = boolDecode18;
                        break;
                    case 46:
                        Boolean boolDecode19 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var46 = jn0.h0.f84049a;
                        bool19 = boolDecode19;
                        break;
                    case 47:
                        Boolean boolDecode20 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var47 = jn0.h0.f84049a;
                        bool20 = boolDecode20;
                        break;
                    case 48:
                        Boolean boolDecode21 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var48 = jn0.h0.f84049a;
                        bool21 = boolDecode21;
                        break;
                    case 49:
                        Boolean boolDecode22 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var49 = jn0.h0.f84049a;
                        bool22 = boolDecode22;
                        break;
                    case 50:
                        Boolean boolDecode23 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var50 = jn0.h0.f84049a;
                        bool23 = boolDecode23;
                        break;
                    case 51:
                        Boolean boolDecode24 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var51 = jn0.h0.f84049a;
                        bool24 = boolDecode24;
                        break;
                    case 52:
                        Float fDecode15 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var52 = jn0.h0.f84049a;
                        f26 = fDecode15;
                        break;
                    case 53:
                        Float fDecode16 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var53 = jn0.h0.f84049a;
                        f27 = fDecode16;
                        break;
                    case 54:
                        Float fDecode17 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var54 = jn0.h0.f84049a;
                        f28 = fDecode17;
                        break;
                    case 55:
                        Float fDecode18 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var55 = jn0.h0.f84049a;
                        f29 = fDecode18;
                        break;
                    case 56:
                        Float fDecode19 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var56 = jn0.h0.f84049a;
                        f31 = fDecode19;
                        break;
                    case 57:
                        Float fDecode20 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var57 = jn0.h0.f84049a;
                        f32 = fDecode20;
                        break;
                    case 58:
                        Float fDecode21 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var58 = jn0.h0.f84049a;
                        f33 = fDecode21;
                        break;
                    case 59:
                        Float fDecode22 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var59 = jn0.h0.f84049a;
                        f34 = fDecode22;
                        break;
                    case 60:
                        Float fDecode23 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var60 = jn0.h0.f84049a;
                        f35 = fDecode23;
                        break;
                    case 61:
                        Float fDecode24 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var61 = jn0.h0.f84049a;
                        f36 = fDecode24;
                        break;
                    case 62:
                        Float fDecode25 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var62 = jn0.h0.f84049a;
                        f37 = fDecode25;
                        break;
                    case 63:
                        Float fDecode26 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var63 = jn0.h0.f84049a;
                        f38 = fDecode26;
                        break;
                    case 64:
                        Boolean boolDecode25 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var64 = jn0.h0.f84049a;
                        bool25 = boolDecode25;
                        break;
                    case 65:
                        Boolean boolDecode26 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var65 = jn0.h0.f84049a;
                        bool26 = boolDecode26;
                        break;
                    case 66:
                        Boolean boolDecode27 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var66 = jn0.h0.f84049a;
                        bool27 = boolDecode27;
                        break;
                    case 67:
                        Boolean boolDecode28 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var67 = jn0.h0.f84049a;
                        bool28 = boolDecode28;
                        break;
                    case 68:
                        Boolean boolDecode29 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var68 = jn0.h0.f84049a;
                        bool29 = boolDecode29;
                        break;
                    case 69:
                        Boolean boolDecode30 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var69 = jn0.h0.f84049a;
                        bool30 = boolDecode30;
                        break;
                    case 70:
                        Boolean boolDecode31 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var70 = jn0.h0.f84049a;
                        bool31 = boolDecode31;
                        break;
                    case 71:
                        Boolean boolDecode32 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var71 = jn0.h0.f84049a;
                        bool32 = boolDecode32;
                        break;
                    case 72:
                        Boolean boolDecode33 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var72 = jn0.h0.f84049a;
                        bool33 = boolDecode33;
                        break;
                    case 73:
                        Boolean boolDecode34 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var73 = jn0.h0.f84049a;
                        bool34 = boolDecode34;
                        break;
                    case 74:
                        Boolean boolDecode35 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var74 = jn0.h0.f84049a;
                        bool35 = boolDecode35;
                        break;
                    case 75:
                        Boolean boolDecode36 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var75 = jn0.h0.f84049a;
                        bool36 = boolDecode36;
                        break;
                    case 76:
                        Boolean boolDecode37 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var76 = jn0.h0.f84049a;
                        bool37 = boolDecode37;
                        break;
                    case 77:
                        Boolean boolDecode38 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var77 = jn0.h0.f84049a;
                        bool38 = boolDecode38;
                        break;
                    case 78:
                        Boolean boolDecode39 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var78 = jn0.h0.f84049a;
                        bool39 = boolDecode39;
                        break;
                    case 79:
                        Boolean boolDecode40 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var79 = jn0.h0.f84049a;
                        bool40 = boolDecode40;
                        break;
                    case 80:
                        Boolean boolDecode41 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var80 = jn0.h0.f84049a;
                        bool41 = boolDecode41;
                        break;
                    case 81:
                        Boolean boolDecode42 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var81 = jn0.h0.f84049a;
                        bool42 = boolDecode42;
                        break;
                    case 82:
                        Boolean boolDecode43 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var82 = jn0.h0.f84049a;
                        bool43 = boolDecode43;
                        break;
                    case 83:
                        Boolean boolDecode44 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var83 = jn0.h0.f84049a;
                        bool44 = boolDecode44;
                        break;
                    case 84:
                        Boolean boolDecode45 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var84 = jn0.h0.f84049a;
                        bool45 = boolDecode45;
                        break;
                    case 85:
                        Boolean boolDecode46 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var85 = jn0.h0.f84049a;
                        bool46 = boolDecode46;
                        break;
                    case 86:
                        Boolean boolDecode47 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var86 = jn0.h0.f84049a;
                        bool47 = boolDecode47;
                        break;
                    case 87:
                        Boolean boolDecode48 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var87 = jn0.h0.f84049a;
                        bool48 = boolDecode48;
                        break;
                    default:
                        reader.m(iG);
                        jn0.h0 h0Var88 = jn0.h0.f84049a;
                        break;
                }
                instant = instant14;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, t0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 1, value.getTimestamp());
            }
            if (value.getTpms_last_seen_pressure_time_fl() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 6, value.getTpms_last_seen_pressure_time_fl());
            }
            if (value.getTpms_last_seen_pressure_time_fr() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 7, value.getTpms_last_seen_pressure_time_fr());
            }
            if (value.getTpms_last_seen_pressure_time_rl() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 8, value.getTpms_last_seen_pressure_time_rl());
            }
            if (value.getTpms_last_seen_pressure_time_rr() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 9, value.getTpms_last_seen_pressure_time_rr());
            }
            if (value.getTpms_last_seen_pressure_time_re1_l0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 28, value.getTpms_last_seen_pressure_time_re1_l0());
            }
            if (value.getTpms_last_seen_pressure_time_re1_l1() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 29, value.getTpms_last_seen_pressure_time_re1_l1());
            }
            if (value.getTpms_last_seen_pressure_time_re1_r0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 30, value.getTpms_last_seen_pressure_time_re1_r0());
            }
            if (value.getTpms_last_seen_pressure_time_re1_r1() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 31, value.getTpms_last_seen_pressure_time_re1_r1());
            }
            if (value.getTpms_last_seen_pressure_time_re2_l0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 32, value.getTpms_last_seen_pressure_time_re2_l0());
            }
            if (value.getTpms_last_seen_pressure_time_re2_l1() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 33, value.getTpms_last_seen_pressure_time_re2_l1());
            }
            if (value.getTpms_last_seen_pressure_time_re2_r0() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 34, value.getTpms_last_seen_pressure_time_re2_r0());
            }
            if (value.getTpms_last_seen_pressure_time_re2_r1() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 35, value.getTpms_last_seen_pressure_time_re2_r1());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(writer, 2, value.getTpms_pressure_fl());
            protoAdapter.encodeWithTag(writer, 3, value.getTpms_pressure_fr());
            protoAdapter.encodeWithTag(writer, 4, value.getTpms_pressure_rl());
            protoAdapter.encodeWithTag(writer, 5, value.getTpms_pressure_rr());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(writer, 10, value.getTpms_hard_warning_fl());
            protoAdapter2.encodeWithTag(writer, 11, value.getTpms_hard_warning_fr());
            protoAdapter2.encodeWithTag(writer, 12, value.getTpms_hard_warning_rl());
            protoAdapter2.encodeWithTag(writer, 13, value.getTpms_hard_warning_rr());
            protoAdapter2.encodeWithTag(writer, 14, value.getTpms_soft_warning_fl());
            protoAdapter2.encodeWithTag(writer, 15, value.getTpms_soft_warning_fr());
            protoAdapter2.encodeWithTag(writer, 16, value.getTpms_soft_warning_rl());
            protoAdapter2.encodeWithTag(writer, 17, value.getTpms_soft_warning_rr());
            protoAdapter.encodeWithTag(writer, 18, value.getTpms_rcp_front_value());
            protoAdapter.encodeWithTag(writer, 19, value.getTpms_rcp_rear_value());
            protoAdapter.encodeWithTag(writer, 20, value.getTpms_pressure_re1_l0());
            protoAdapter.encodeWithTag(writer, 21, value.getTpms_pressure_re1_l1());
            protoAdapter.encodeWithTag(writer, 22, value.getTpms_pressure_re1_r0());
            protoAdapter.encodeWithTag(writer, 23, value.getTpms_pressure_re1_r1());
            protoAdapter.encodeWithTag(writer, 24, value.getTpms_pressure_re2_l0());
            protoAdapter.encodeWithTag(writer, 25, value.getTpms_pressure_re2_l1());
            protoAdapter.encodeWithTag(writer, 26, value.getTpms_pressure_re2_r0());
            protoAdapter.encodeWithTag(writer, 27, value.getTpms_pressure_re2_r1());
            protoAdapter2.encodeWithTag(writer, 36, value.getTpms_hard_warning_re1_l0());
            protoAdapter2.encodeWithTag(writer, 37, value.getTpms_hard_warning_re1_l1());
            protoAdapter2.encodeWithTag(writer, 38, value.getTpms_hard_warning_re1_r0());
            protoAdapter2.encodeWithTag(writer, 39, value.getTpms_hard_warning_re1_r1());
            protoAdapter2.encodeWithTag(writer, 40, value.getTpms_hard_warning_re2_l0());
            protoAdapter2.encodeWithTag(writer, 41, value.getTpms_hard_warning_re2_l1());
            protoAdapter2.encodeWithTag(writer, 42, value.getTpms_hard_warning_re2_r0());
            protoAdapter2.encodeWithTag(writer, 43, value.getTpms_hard_warning_re2_r1());
            protoAdapter2.encodeWithTag(writer, 44, value.getTpms_soft_warning_re1_l0());
            protoAdapter2.encodeWithTag(writer, 45, value.getTpms_soft_warning_re1_l1());
            protoAdapter2.encodeWithTag(writer, 46, value.getTpms_soft_warning_re1_r0());
            protoAdapter2.encodeWithTag(writer, 47, value.getTpms_soft_warning_re1_r1());
            protoAdapter2.encodeWithTag(writer, 48, value.getTpms_soft_warning_re2_l0());
            protoAdapter2.encodeWithTag(writer, 49, value.getTpms_soft_warning_re2_l1());
            protoAdapter2.encodeWithTag(writer, 50, value.getTpms_soft_warning_re2_r0());
            protoAdapter2.encodeWithTag(writer, 51, value.getTpms_soft_warning_re2_r1());
            protoAdapter.encodeWithTag(writer, 52, value.getTpms_temperature_fl());
            protoAdapter.encodeWithTag(writer, 53, value.getTpms_temperature_fr());
            protoAdapter.encodeWithTag(writer, 54, value.getTpms_temperature_rl());
            protoAdapter.encodeWithTag(writer, 55, value.getTpms_temperature_rr());
            protoAdapter.encodeWithTag(writer, 56, value.getTpms_temperature_re1_l0());
            protoAdapter.encodeWithTag(writer, 57, value.getTpms_temperature_re1_l1());
            protoAdapter.encodeWithTag(writer, 58, value.getTpms_temperature_re1_r0());
            protoAdapter.encodeWithTag(writer, 59, value.getTpms_temperature_re1_r1());
            protoAdapter.encodeWithTag(writer, 60, value.getTpms_temperature_re2_l0());
            protoAdapter.encodeWithTag(writer, 61, value.getTpms_temperature_re2_l1());
            protoAdapter.encodeWithTag(writer, 62, value.getTpms_temperature_re2_r0());
            protoAdapter.encodeWithTag(writer, 63, value.getTpms_temperature_re2_r1());
            protoAdapter2.encodeWithTag(writer, 64, value.getTpms_temperature_hard_warning_fl());
            protoAdapter2.encodeWithTag(writer, 65, value.getTpms_temperature_hard_warning_fr());
            protoAdapter2.encodeWithTag(writer, 66, value.getTpms_temperature_hard_warning_rl());
            protoAdapter2.encodeWithTag(writer, 67, value.getTpms_temperature_hard_warning_rr());
            protoAdapter2.encodeWithTag(writer, 68, value.getTpms_temperature_hard_warning_re1_l0());
            protoAdapter2.encodeWithTag(writer, 69, value.getTpms_temperature_hard_warning_re1_l1());
            protoAdapter2.encodeWithTag(writer, 70, value.getTpms_temperature_hard_warning_re1_r0());
            protoAdapter2.encodeWithTag(writer, 71, value.getTpms_temperature_hard_warning_re1_r1());
            protoAdapter2.encodeWithTag(writer, 72, value.getTpms_temperature_hard_warning_re2_l0());
            protoAdapter2.encodeWithTag(writer, 73, value.getTpms_temperature_hard_warning_re2_l1());
            protoAdapter2.encodeWithTag(writer, 74, value.getTpms_temperature_hard_warning_re2_r0());
            protoAdapter2.encodeWithTag(writer, 75, value.getTpms_temperature_hard_warning_re2_r1());
            protoAdapter2.encodeWithTag(writer, 76, value.getTpms_temperature_soft_warning_fl());
            protoAdapter2.encodeWithTag(writer, 77, value.getTpms_temperature_soft_warning_fr());
            protoAdapter2.encodeWithTag(writer, 78, value.getTpms_temperature_soft_warning_rl());
            protoAdapter2.encodeWithTag(writer, 79, value.getTpms_temperature_soft_warning_rr());
            protoAdapter2.encodeWithTag(writer, 80, value.getTpms_temperature_soft_warning_re1_l0());
            protoAdapter2.encodeWithTag(writer, 81, value.getTpms_temperature_soft_warning_re1_l1());
            protoAdapter2.encodeWithTag(writer, 82, value.getTpms_temperature_soft_warning_re1_r0());
            protoAdapter2.encodeWithTag(writer, 83, value.getTpms_temperature_soft_warning_re1_r1());
            protoAdapter2.encodeWithTag(writer, 84, value.getTpms_temperature_soft_warning_re2_l0());
            protoAdapter2.encodeWithTag(writer, 85, value.getTpms_temperature_soft_warning_re2_l1());
            protoAdapter2.encodeWithTag(writer, 86, value.getTpms_temperature_soft_warning_re2_r0());
            protoAdapter2.encodeWithTag(writer, 87, value.getTpms_temperature_soft_warning_re2_r1());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(t0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getTimestamp());
            }
            if (value.getTpms_last_seen_pressure_time_fl() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(6, value.getTpms_last_seen_pressure_time_fl());
            }
            if (value.getTpms_last_seen_pressure_time_fr() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(7, value.getTpms_last_seen_pressure_time_fr());
            }
            if (value.getTpms_last_seen_pressure_time_rl() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(8, value.getTpms_last_seen_pressure_time_rl());
            }
            if (value.getTpms_last_seen_pressure_time_rr() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(9, value.getTpms_last_seen_pressure_time_rr());
            }
            if (value.getTpms_last_seen_pressure_time_re1_l0() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(28, value.getTpms_last_seen_pressure_time_re1_l0());
            }
            if (value.getTpms_last_seen_pressure_time_re1_l1() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(29, value.getTpms_last_seen_pressure_time_re1_l1());
            }
            if (value.getTpms_last_seen_pressure_time_re1_r0() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(30, value.getTpms_last_seen_pressure_time_re1_r0());
            }
            if (value.getTpms_last_seen_pressure_time_re1_r1() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(31, value.getTpms_last_seen_pressure_time_re1_r1());
            }
            if (value.getTpms_last_seen_pressure_time_re2_l0() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(32, value.getTpms_last_seen_pressure_time_re2_l0());
            }
            if (value.getTpms_last_seen_pressure_time_re2_l1() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(33, value.getTpms_last_seen_pressure_time_re2_l1());
            }
            if (value.getTpms_last_seen_pressure_time_re2_r0() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(34, value.getTpms_last_seen_pressure_time_re2_r0());
            }
            if (value.getTpms_last_seen_pressure_time_re2_r1() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(35, value.getTpms_last_seen_pressure_time_re2_r1());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(2, value.getTpms_pressure_fl()) + protoAdapter.encodedSizeWithTag(3, value.getTpms_pressure_fr()) + protoAdapter.encodedSizeWithTag(4, value.getTpms_pressure_rl()) + protoAdapter.encodedSizeWithTag(5, value.getTpms_pressure_rr());
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(10, value.getTpms_hard_warning_fl()) + protoAdapter2.encodedSizeWithTag(11, value.getTpms_hard_warning_fr()) + protoAdapter2.encodedSizeWithTag(12, value.getTpms_hard_warning_rl()) + protoAdapter2.encodedSizeWithTag(13, value.getTpms_hard_warning_rr()) + protoAdapter2.encodedSizeWithTag(14, value.getTpms_soft_warning_fl()) + protoAdapter2.encodedSizeWithTag(15, value.getTpms_soft_warning_fr()) + protoAdapter2.encodedSizeWithTag(16, value.getTpms_soft_warning_rl()) + protoAdapter2.encodedSizeWithTag(17, value.getTpms_soft_warning_rr()) + protoAdapter.encodedSizeWithTag(18, value.getTpms_rcp_front_value()) + protoAdapter.encodedSizeWithTag(19, value.getTpms_rcp_rear_value()) + protoAdapter.encodedSizeWithTag(20, value.getTpms_pressure_re1_l0()) + protoAdapter.encodedSizeWithTag(21, value.getTpms_pressure_re1_l1()) + protoAdapter.encodedSizeWithTag(22, value.getTpms_pressure_re1_r0()) + protoAdapter.encodedSizeWithTag(23, value.getTpms_pressure_re1_r1()) + protoAdapter.encodedSizeWithTag(24, value.getTpms_pressure_re2_l0()) + protoAdapter.encodedSizeWithTag(25, value.getTpms_pressure_re2_l1()) + protoAdapter.encodedSizeWithTag(26, value.getTpms_pressure_re2_r0()) + protoAdapter.encodedSizeWithTag(27, value.getTpms_pressure_re2_r1()) + protoAdapter2.encodedSizeWithTag(36, value.getTpms_hard_warning_re1_l0()) + protoAdapter2.encodedSizeWithTag(37, value.getTpms_hard_warning_re1_l1()) + protoAdapter2.encodedSizeWithTag(38, value.getTpms_hard_warning_re1_r0()) + protoAdapter2.encodedSizeWithTag(39, value.getTpms_hard_warning_re1_r1()) + protoAdapter2.encodedSizeWithTag(40, value.getTpms_hard_warning_re2_l0()) + protoAdapter2.encodedSizeWithTag(41, value.getTpms_hard_warning_re2_l1()) + protoAdapter2.encodedSizeWithTag(42, value.getTpms_hard_warning_re2_r0()) + protoAdapter2.encodedSizeWithTag(43, value.getTpms_hard_warning_re2_r1()) + protoAdapter2.encodedSizeWithTag(44, value.getTpms_soft_warning_re1_l0()) + protoAdapter2.encodedSizeWithTag(45, value.getTpms_soft_warning_re1_l1()) + protoAdapter2.encodedSizeWithTag(46, value.getTpms_soft_warning_re1_r0()) + protoAdapter2.encodedSizeWithTag(47, value.getTpms_soft_warning_re1_r1()) + protoAdapter2.encodedSizeWithTag(48, value.getTpms_soft_warning_re2_l0()) + protoAdapter2.encodedSizeWithTag(49, value.getTpms_soft_warning_re2_l1()) + protoAdapter2.encodedSizeWithTag(50, value.getTpms_soft_warning_re2_r0()) + protoAdapter2.encodedSizeWithTag(51, value.getTpms_soft_warning_re2_r1()) + protoAdapter.encodedSizeWithTag(52, value.getTpms_temperature_fl()) + protoAdapter.encodedSizeWithTag(53, value.getTpms_temperature_fr()) + protoAdapter.encodedSizeWithTag(54, value.getTpms_temperature_rl()) + protoAdapter.encodedSizeWithTag(55, value.getTpms_temperature_rr()) + protoAdapter.encodedSizeWithTag(56, value.getTpms_temperature_re1_l0()) + protoAdapter.encodedSizeWithTag(57, value.getTpms_temperature_re1_l1()) + protoAdapter.encodedSizeWithTag(58, value.getTpms_temperature_re1_r0()) + protoAdapter.encodedSizeWithTag(59, value.getTpms_temperature_re1_r1()) + protoAdapter.encodedSizeWithTag(60, value.getTpms_temperature_re2_l0()) + protoAdapter.encodedSizeWithTag(61, value.getTpms_temperature_re2_l1()) + protoAdapter.encodedSizeWithTag(62, value.getTpms_temperature_re2_r0()) + protoAdapter.encodedSizeWithTag(63, value.getTpms_temperature_re2_r1()) + protoAdapter2.encodedSizeWithTag(64, value.getTpms_temperature_hard_warning_fl()) + protoAdapter2.encodedSizeWithTag(65, value.getTpms_temperature_hard_warning_fr()) + protoAdapter2.encodedSizeWithTag(66, value.getTpms_temperature_hard_warning_rl()) + protoAdapter2.encodedSizeWithTag(67, value.getTpms_temperature_hard_warning_rr()) + protoAdapter2.encodedSizeWithTag(68, value.getTpms_temperature_hard_warning_re1_l0()) + protoAdapter2.encodedSizeWithTag(69, value.getTpms_temperature_hard_warning_re1_l1()) + protoAdapter2.encodedSizeWithTag(70, value.getTpms_temperature_hard_warning_re1_r0()) + protoAdapter2.encodedSizeWithTag(71, value.getTpms_temperature_hard_warning_re1_r1()) + protoAdapter2.encodedSizeWithTag(72, value.getTpms_temperature_hard_warning_re2_l0()) + protoAdapter2.encodedSizeWithTag(73, value.getTpms_temperature_hard_warning_re2_l1()) + protoAdapter2.encodedSizeWithTag(74, value.getTpms_temperature_hard_warning_re2_r0()) + protoAdapter2.encodedSizeWithTag(75, value.getTpms_temperature_hard_warning_re2_r1()) + protoAdapter2.encodedSizeWithTag(76, value.getTpms_temperature_soft_warning_fl()) + protoAdapter2.encodedSizeWithTag(77, value.getTpms_temperature_soft_warning_fr()) + protoAdapter2.encodedSizeWithTag(78, value.getTpms_temperature_soft_warning_rl()) + protoAdapter2.encodedSizeWithTag(79, value.getTpms_temperature_soft_warning_rr()) + protoAdapter2.encodedSizeWithTag(80, value.getTpms_temperature_soft_warning_re1_l0()) + protoAdapter2.encodedSizeWithTag(81, value.getTpms_temperature_soft_warning_re1_l1()) + protoAdapter2.encodedSizeWithTag(82, value.getTpms_temperature_soft_warning_re1_r0()) + protoAdapter2.encodedSizeWithTag(83, value.getTpms_temperature_soft_warning_re1_r1()) + protoAdapter2.encodedSizeWithTag(84, value.getTpms_temperature_soft_warning_re2_l0()) + protoAdapter2.encodedSizeWithTag(85, value.getTpms_temperature_soft_warning_re2_l1()) + protoAdapter2.encodedSizeWithTag(86, value.getTpms_temperature_soft_warning_re2_r0()) + protoAdapter2.encodedSizeWithTag(87, value.getTpms_temperature_soft_warning_re2_r1());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public t0 redact(t0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            Instant tpms_last_seen_pressure_time_fl = value.getTpms_last_seen_pressure_time_fl();
            Instant instantRedact2 = tpms_last_seen_pressure_time_fl != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_fl) : null;
            Instant tpms_last_seen_pressure_time_fr = value.getTpms_last_seen_pressure_time_fr();
            Instant instantRedact3 = tpms_last_seen_pressure_time_fr != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_fr) : null;
            Instant tpms_last_seen_pressure_time_rl = value.getTpms_last_seen_pressure_time_rl();
            Instant instantRedact4 = tpms_last_seen_pressure_time_rl != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_rl) : null;
            Instant tpms_last_seen_pressure_time_rr = value.getTpms_last_seen_pressure_time_rr();
            Instant instantRedact5 = tpms_last_seen_pressure_time_rr != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_rr) : null;
            Instant tpms_last_seen_pressure_time_re1_l0 = value.getTpms_last_seen_pressure_time_re1_l0();
            Instant instantRedact6 = tpms_last_seen_pressure_time_re1_l0 != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_re1_l0) : null;
            Instant tpms_last_seen_pressure_time_re1_l1 = value.getTpms_last_seen_pressure_time_re1_l1();
            Instant instantRedact7 = tpms_last_seen_pressure_time_re1_l1 != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_re1_l1) : null;
            Instant tpms_last_seen_pressure_time_re1_r0 = value.getTpms_last_seen_pressure_time_re1_r0();
            Instant instantRedact8 = tpms_last_seen_pressure_time_re1_r0 != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_re1_r0) : null;
            Instant tpms_last_seen_pressure_time_re1_r1 = value.getTpms_last_seen_pressure_time_re1_r1();
            Instant instantRedact9 = tpms_last_seen_pressure_time_re1_r1 != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_re1_r1) : null;
            Instant tpms_last_seen_pressure_time_re2_l0 = value.getTpms_last_seen_pressure_time_re2_l0();
            Instant instantRedact10 = tpms_last_seen_pressure_time_re2_l0 != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_re2_l0) : null;
            Instant tpms_last_seen_pressure_time_re2_l1 = value.getTpms_last_seen_pressure_time_re2_l1();
            Instant instantRedact11 = tpms_last_seen_pressure_time_re2_l1 != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_re2_l1) : null;
            Instant tpms_last_seen_pressure_time_re2_r0 = value.getTpms_last_seen_pressure_time_re2_r0();
            Instant instantRedact12 = tpms_last_seen_pressure_time_re2_r0 != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_re2_r0) : null;
            Instant tpms_last_seen_pressure_time_re2_r1 = value.getTpms_last_seen_pressure_time_re2_r1();
            return t0.b(value, instantRedact, instantRedact2, instantRedact3, instantRedact4, instantRedact5, instantRedact6, instantRedact7, instantRedact8, instantRedact9, instantRedact10, instantRedact11, instantRedact12, tpms_last_seen_pressure_time_re2_r1 != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_re2_r1) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, -8192, -1, 8388607, null);
        }
    }

    public t0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16777215, null);
    }

    public static /* synthetic */ t0 b(t0 t0Var, Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Float f11, Float f12, Float f13, Float f14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Float f15, Float f16, Float f17, Float f18, Float f19, Float f21, Float f22, Float f23, Float f24, Float f25, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Float f26, Float f27, Float f28, Float f29, Float f31, Float f32, Float f33, Float f34, Float f35, Float f36, Float f37, Float f38, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42, Boolean bool43, Boolean bool44, Boolean bool45, Boolean bool46, Boolean bool47, Boolean bool48, okio.k kVar, int i11, int i12, int i13, Object obj) {
        Instant instant14 = (i11 & 1) != 0 ? t0Var.timestamp : instant;
        return t0Var.a(instant14, (i11 & 2) != 0 ? t0Var.tpms_last_seen_pressure_time_fl : instant2, (i11 & 4) != 0 ? t0Var.tpms_last_seen_pressure_time_fr : instant3, (i11 & 8) != 0 ? t0Var.tpms_last_seen_pressure_time_rl : instant4, (i11 & 16) != 0 ? t0Var.tpms_last_seen_pressure_time_rr : instant5, (i11 & 32) != 0 ? t0Var.tpms_last_seen_pressure_time_re1_l0 : instant6, (i11 & 64) != 0 ? t0Var.tpms_last_seen_pressure_time_re1_l1 : instant7, (i11 & 128) != 0 ? t0Var.tpms_last_seen_pressure_time_re1_r0 : instant8, (i11 & 256) != 0 ? t0Var.tpms_last_seen_pressure_time_re1_r1 : instant9, (i11 & 512) != 0 ? t0Var.tpms_last_seen_pressure_time_re2_l0 : instant10, (i11 & 1024) != 0 ? t0Var.tpms_last_seen_pressure_time_re2_l1 : instant11, (i11 & 2048) != 0 ? t0Var.tpms_last_seen_pressure_time_re2_r0 : instant12, (i11 & 4096) != 0 ? t0Var.tpms_last_seen_pressure_time_re2_r1 : instant13, (i11 & PKIFailureInfo.certRevoked) != 0 ? t0Var.tpms_pressure_fl : f11, (i11 & 16384) != 0 ? t0Var.tpms_pressure_fr : f12, (i11 & 32768) != 0 ? t0Var.tpms_pressure_rl : f13, (i11 & 65536) != 0 ? t0Var.tpms_pressure_rr : f14, (i11 & 131072) != 0 ? t0Var.tpms_hard_warning_fl : bool, (i11 & 262144) != 0 ? t0Var.tpms_hard_warning_fr : bool2, (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? t0Var.tpms_hard_warning_rl : bool3, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? t0Var.tpms_hard_warning_rr : bool4, (i11 & PKIFailureInfo.badSenderNonce) != 0 ? t0Var.tpms_soft_warning_fl : bool5, (i11 & 4194304) != 0 ? t0Var.tpms_soft_warning_fr : bool6, (i11 & 8388608) != 0 ? t0Var.tpms_soft_warning_rl : bool7, (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? t0Var.tpms_soft_warning_rr : bool8, (i11 & 33554432) != 0 ? t0Var.tpms_rcp_front_value : f15, (i11 & 67108864) != 0 ? t0Var.tpms_rcp_rear_value : f16, (i11 & 134217728) != 0 ? t0Var.tpms_pressure_re1_l0 : f17, (i11 & 268435456) != 0 ? t0Var.tpms_pressure_re1_l1 : f18, (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? t0Var.tpms_pressure_re1_r0 : f19, (i11 & 1073741824) != 0 ? t0Var.tpms_pressure_re1_r1 : f21, (i11 & Integer.MIN_VALUE) != 0 ? t0Var.tpms_pressure_re2_l0 : f22, (i12 & 1) != 0 ? t0Var.tpms_pressure_re2_l1 : f23, (i12 & 2) != 0 ? t0Var.tpms_pressure_re2_r0 : f24, (i12 & 4) != 0 ? t0Var.tpms_pressure_re2_r1 : f25, (i12 & 8) != 0 ? t0Var.tpms_hard_warning_re1_l0 : bool9, (i12 & 16) != 0 ? t0Var.tpms_hard_warning_re1_l1 : bool10, (i12 & 32) != 0 ? t0Var.tpms_hard_warning_re1_r0 : bool11, (i12 & 64) != 0 ? t0Var.tpms_hard_warning_re1_r1 : bool12, (i12 & 128) != 0 ? t0Var.tpms_hard_warning_re2_l0 : bool13, (i12 & 256) != 0 ? t0Var.tpms_hard_warning_re2_l1 : bool14, (i12 & 512) != 0 ? t0Var.tpms_hard_warning_re2_r0 : bool15, (i12 & 1024) != 0 ? t0Var.tpms_hard_warning_re2_r1 : bool16, (i12 & 2048) != 0 ? t0Var.tpms_soft_warning_re1_l0 : bool17, (i12 & 4096) != 0 ? t0Var.tpms_soft_warning_re1_l1 : bool18, (i12 & PKIFailureInfo.certRevoked) != 0 ? t0Var.tpms_soft_warning_re1_r0 : bool19, (i12 & 16384) != 0 ? t0Var.tpms_soft_warning_re1_r1 : bool20, (i12 & 32768) != 0 ? t0Var.tpms_soft_warning_re2_l0 : bool21, (i12 & 65536) != 0 ? t0Var.tpms_soft_warning_re2_l1 : bool22, (i12 & 131072) != 0 ? t0Var.tpms_soft_warning_re2_r0 : bool23, (i12 & 262144) != 0 ? t0Var.tpms_soft_warning_re2_r1 : bool24, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? t0Var.tpms_temperature_fl : f26, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? t0Var.tpms_temperature_fr : f27, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? t0Var.tpms_temperature_rl : f28, (i12 & 4194304) != 0 ? t0Var.tpms_temperature_rr : f29, (i12 & 8388608) != 0 ? t0Var.tpms_temperature_re1_l0 : f31, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? t0Var.tpms_temperature_re1_l1 : f32, (i12 & 33554432) != 0 ? t0Var.tpms_temperature_re1_r0 : f33, (i12 & 67108864) != 0 ? t0Var.tpms_temperature_re1_r1 : f34, (i12 & 134217728) != 0 ? t0Var.tpms_temperature_re2_l0 : f35, (i12 & 268435456) != 0 ? t0Var.tpms_temperature_re2_l1 : f36, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? t0Var.tpms_temperature_re2_r0 : f37, (i12 & 1073741824) != 0 ? t0Var.tpms_temperature_re2_r1 : f38, (i12 & Integer.MIN_VALUE) != 0 ? t0Var.tpms_temperature_hard_warning_fl : bool25, (i13 & 1) != 0 ? t0Var.tpms_temperature_hard_warning_fr : bool26, (i13 & 2) != 0 ? t0Var.tpms_temperature_hard_warning_rl : bool27, (i13 & 4) != 0 ? t0Var.tpms_temperature_hard_warning_rr : bool28, (i13 & 8) != 0 ? t0Var.tpms_temperature_hard_warning_re1_l0 : bool29, (i13 & 16) != 0 ? t0Var.tpms_temperature_hard_warning_re1_l1 : bool30, (i13 & 32) != 0 ? t0Var.tpms_temperature_hard_warning_re1_r0 : bool31, (i13 & 64) != 0 ? t0Var.tpms_temperature_hard_warning_re1_r1 : bool32, (i13 & 128) != 0 ? t0Var.tpms_temperature_hard_warning_re2_l0 : bool33, (i13 & 256) != 0 ? t0Var.tpms_temperature_hard_warning_re2_l1 : bool34, (i13 & 512) != 0 ? t0Var.tpms_temperature_hard_warning_re2_r0 : bool35, (i13 & 1024) != 0 ? t0Var.tpms_temperature_hard_warning_re2_r1 : bool36, (i13 & 2048) != 0 ? t0Var.tpms_temperature_soft_warning_fl : bool37, (i13 & 4096) != 0 ? t0Var.tpms_temperature_soft_warning_fr : bool38, (i13 & PKIFailureInfo.certRevoked) != 0 ? t0Var.tpms_temperature_soft_warning_rl : bool39, (i13 & 16384) != 0 ? t0Var.tpms_temperature_soft_warning_rr : bool40, (i13 & 32768) != 0 ? t0Var.tpms_temperature_soft_warning_re1_l0 : bool41, (i13 & 65536) != 0 ? t0Var.tpms_temperature_soft_warning_re1_l1 : bool42, (i13 & 131072) != 0 ? t0Var.tpms_temperature_soft_warning_re1_r0 : bool43, (i13 & 262144) != 0 ? t0Var.tpms_temperature_soft_warning_re1_r1 : bool44, (i13 & PKIFailureInfo.signerNotTrusted) != 0 ? t0Var.tpms_temperature_soft_warning_re2_l0 : bool45, (i13 & PKIFailureInfo.badCertTemplate) != 0 ? t0Var.tpms_temperature_soft_warning_re2_l1 : bool46, (i13 & PKIFailureInfo.badSenderNonce) != 0 ? t0Var.tpms_temperature_soft_warning_re2_r0 : bool47, (i13 & 4194304) != 0 ? t0Var.tpms_temperature_soft_warning_re2_r1 : bool48, (i13 & 8388608) != 0 ? t0Var.unknownFields() : kVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_rr() {
        return this.tpms_last_seen_pressure_time_rr;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Float getTpms_temperature_rr() {
        return this.tpms_temperature_rr;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Float getTpms_pressure_fl() {
        return this.tpms_pressure_fl;
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_fl() {
        return this.tpms_temperature_soft_warning_fl;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Float getTpms_pressure_fr() {
        return this.tpms_pressure_fr;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_fr() {
        return this.tpms_temperature_soft_warning_fr;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Float getTpms_pressure_re1_l0() {
        return this.tpms_pressure_re1_l0;
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_re1_l0() {
        return this.tpms_temperature_soft_warning_re1_l0;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Float getTpms_pressure_re1_l1() {
        return this.tpms_pressure_re1_l1;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_re1_l1() {
        return this.tpms_temperature_soft_warning_re1_l1;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Float getTpms_pressure_re1_r0() {
        return this.tpms_pressure_re1_r0;
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_re1_r0() {
        return this.tpms_temperature_soft_warning_re1_r0;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Float getTpms_pressure_re1_r1() {
        return this.tpms_pressure_re1_r1;
    }

    /* JADX INFO: renamed from: G0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_re1_r1() {
        return this.tpms_temperature_soft_warning_re1_r1;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Float getTpms_pressure_re2_l0() {
        return this.tpms_pressure_re2_l0;
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_re2_l0() {
        return this.tpms_temperature_soft_warning_re2_l0;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final Float getTpms_pressure_re2_l1() {
        return this.tpms_pressure_re2_l1;
    }

    /* JADX INFO: renamed from: I0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_re2_l1() {
        return this.tpms_temperature_soft_warning_re2_l1;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final Float getTpms_pressure_re2_r0() {
        return this.tpms_pressure_re2_r0;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_re2_r0() {
        return this.tpms_temperature_soft_warning_re2_r0;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final Float getTpms_pressure_re2_r1() {
        return this.tpms_pressure_re2_r1;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final Float getTpms_pressure_rl() {
        return this.tpms_pressure_rl;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_re2_r1() {
        return this.tpms_temperature_soft_warning_re2_r1;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final Float getTpms_pressure_rr() {
        return this.tpms_pressure_rr;
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_rl() {
        return this.tpms_temperature_soft_warning_rl;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final Float getTpms_rcp_front_value() {
        return this.tpms_rcp_front_value;
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    public final Boolean getTpms_temperature_soft_warning_rr() {
        return this.tpms_temperature_soft_warning_rr;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Float getTpms_rcp_rear_value() {
        return this.tpms_rcp_rear_value;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final Boolean getTpms_soft_warning_fl() {
        return this.tpms_soft_warning_fl;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Boolean getTpms_soft_warning_fr() {
        return this.tpms_soft_warning_fr;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final Boolean getTpms_soft_warning_re1_l0() {
        return this.tpms_soft_warning_re1_l0;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final Boolean getTpms_soft_warning_re1_l1() {
        return this.tpms_soft_warning_re1_l1;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final Boolean getTpms_soft_warning_re1_r0() {
        return this.tpms_soft_warning_re1_r0;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final Boolean getTpms_soft_warning_re1_r1() {
        return this.tpms_soft_warning_re1_r1;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final Boolean getTpms_soft_warning_re2_l0() {
        return this.tpms_soft_warning_re2_l0;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final Boolean getTpms_soft_warning_re2_l1() {
        return this.tpms_soft_warning_re2_l1;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final Boolean getTpms_soft_warning_re2_r0() {
        return this.tpms_soft_warning_re2_r0;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final Boolean getTpms_soft_warning_re2_r1() {
        return this.tpms_soft_warning_re2_r1;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final Boolean getTpms_soft_warning_rl() {
        return this.tpms_soft_warning_rl;
    }

    public final t0 a(Instant timestamp, Instant tpms_last_seen_pressure_time_fl, Instant tpms_last_seen_pressure_time_fr, Instant tpms_last_seen_pressure_time_rl, Instant tpms_last_seen_pressure_time_rr, Instant tpms_last_seen_pressure_time_re1_l0, Instant tpms_last_seen_pressure_time_re1_l1, Instant tpms_last_seen_pressure_time_re1_r0, Instant tpms_last_seen_pressure_time_re1_r1, Instant tpms_last_seen_pressure_time_re2_l0, Instant tpms_last_seen_pressure_time_re2_l1, Instant tpms_last_seen_pressure_time_re2_r0, Instant tpms_last_seen_pressure_time_re2_r1, Float tpms_pressure_fl, Float tpms_pressure_fr, Float tpms_pressure_rl, Float tpms_pressure_rr, Boolean tpms_hard_warning_fl, Boolean tpms_hard_warning_fr, Boolean tpms_hard_warning_rl, Boolean tpms_hard_warning_rr, Boolean tpms_soft_warning_fl, Boolean tpms_soft_warning_fr, Boolean tpms_soft_warning_rl, Boolean tpms_soft_warning_rr, Float tpms_rcp_front_value, Float tpms_rcp_rear_value, Float tpms_pressure_re1_l0, Float tpms_pressure_re1_l1, Float tpms_pressure_re1_r0, Float tpms_pressure_re1_r1, Float tpms_pressure_re2_l0, Float tpms_pressure_re2_l1, Float tpms_pressure_re2_r0, Float tpms_pressure_re2_r1, Boolean tpms_hard_warning_re1_l0, Boolean tpms_hard_warning_re1_l1, Boolean tpms_hard_warning_re1_r0, Boolean tpms_hard_warning_re1_r1, Boolean tpms_hard_warning_re2_l0, Boolean tpms_hard_warning_re2_l1, Boolean tpms_hard_warning_re2_r0, Boolean tpms_hard_warning_re2_r1, Boolean tpms_soft_warning_re1_l0, Boolean tpms_soft_warning_re1_l1, Boolean tpms_soft_warning_re1_r0, Boolean tpms_soft_warning_re1_r1, Boolean tpms_soft_warning_re2_l0, Boolean tpms_soft_warning_re2_l1, Boolean tpms_soft_warning_re2_r0, Boolean tpms_soft_warning_re2_r1, Float tpms_temperature_fl, Float tpms_temperature_fr, Float tpms_temperature_rl, Float tpms_temperature_rr, Float tpms_temperature_re1_l0, Float tpms_temperature_re1_l1, Float tpms_temperature_re1_r0, Float tpms_temperature_re1_r1, Float tpms_temperature_re2_l0, Float tpms_temperature_re2_l1, Float tpms_temperature_re2_r0, Float tpms_temperature_re2_r1, Boolean tpms_temperature_hard_warning_fl, Boolean tpms_temperature_hard_warning_fr, Boolean tpms_temperature_hard_warning_rl, Boolean tpms_temperature_hard_warning_rr, Boolean tpms_temperature_hard_warning_re1_l0, Boolean tpms_temperature_hard_warning_re1_l1, Boolean tpms_temperature_hard_warning_re1_r0, Boolean tpms_temperature_hard_warning_re1_r1, Boolean tpms_temperature_hard_warning_re2_l0, Boolean tpms_temperature_hard_warning_re2_l1, Boolean tpms_temperature_hard_warning_re2_r0, Boolean tpms_temperature_hard_warning_re2_r1, Boolean tpms_temperature_soft_warning_fl, Boolean tpms_temperature_soft_warning_fr, Boolean tpms_temperature_soft_warning_rl, Boolean tpms_temperature_soft_warning_rr, Boolean tpms_temperature_soft_warning_re1_l0, Boolean tpms_temperature_soft_warning_re1_l1, Boolean tpms_temperature_soft_warning_re1_r0, Boolean tpms_temperature_soft_warning_re1_r1, Boolean tpms_temperature_soft_warning_re2_l0, Boolean tpms_temperature_soft_warning_re2_l1, Boolean tpms_temperature_soft_warning_re2_r0, Boolean tpms_temperature_soft_warning_re2_r1, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new t0(timestamp, tpms_last_seen_pressure_time_fl, tpms_last_seen_pressure_time_fr, tpms_last_seen_pressure_time_rl, tpms_last_seen_pressure_time_rr, tpms_last_seen_pressure_time_re1_l0, tpms_last_seen_pressure_time_re1_l1, tpms_last_seen_pressure_time_re1_r0, tpms_last_seen_pressure_time_re1_r1, tpms_last_seen_pressure_time_re2_l0, tpms_last_seen_pressure_time_re2_l1, tpms_last_seen_pressure_time_re2_r0, tpms_last_seen_pressure_time_re2_r1, tpms_pressure_fl, tpms_pressure_fr, tpms_pressure_rl, tpms_pressure_rr, tpms_hard_warning_fl, tpms_hard_warning_fr, tpms_hard_warning_rl, tpms_hard_warning_rr, tpms_soft_warning_fl, tpms_soft_warning_fr, tpms_soft_warning_rl, tpms_soft_warning_rr, tpms_rcp_front_value, tpms_rcp_rear_value, tpms_pressure_re1_l0, tpms_pressure_re1_l1, tpms_pressure_re1_r0, tpms_pressure_re1_r1, tpms_pressure_re2_l0, tpms_pressure_re2_l1, tpms_pressure_re2_r0, tpms_pressure_re2_r1, tpms_hard_warning_re1_l0, tpms_hard_warning_re1_l1, tpms_hard_warning_re1_r0, tpms_hard_warning_re1_r1, tpms_hard_warning_re2_l0, tpms_hard_warning_re2_l1, tpms_hard_warning_re2_r0, tpms_hard_warning_re2_r1, tpms_soft_warning_re1_l0, tpms_soft_warning_re1_l1, tpms_soft_warning_re1_r0, tpms_soft_warning_re1_r1, tpms_soft_warning_re2_l0, tpms_soft_warning_re2_l1, tpms_soft_warning_re2_r0, tpms_soft_warning_re2_r1, tpms_temperature_fl, tpms_temperature_fr, tpms_temperature_rl, tpms_temperature_rr, tpms_temperature_re1_l0, tpms_temperature_re1_l1, tpms_temperature_re1_r0, tpms_temperature_re1_r1, tpms_temperature_re2_l0, tpms_temperature_re2_l1, tpms_temperature_re2_r0, tpms_temperature_re2_r1, tpms_temperature_hard_warning_fl, tpms_temperature_hard_warning_fr, tpms_temperature_hard_warning_rl, tpms_temperature_hard_warning_rr, tpms_temperature_hard_warning_re1_l0, tpms_temperature_hard_warning_re1_l1, tpms_temperature_hard_warning_re1_r0, tpms_temperature_hard_warning_re1_r1, tpms_temperature_hard_warning_re2_l0, tpms_temperature_hard_warning_re2_l1, tpms_temperature_hard_warning_re2_r0, tpms_temperature_hard_warning_re2_r1, tpms_temperature_soft_warning_fl, tpms_temperature_soft_warning_fr, tpms_temperature_soft_warning_rl, tpms_temperature_soft_warning_rr, tpms_temperature_soft_warning_re1_l0, tpms_temperature_soft_warning_re1_l1, tpms_temperature_soft_warning_re1_r0, tpms_temperature_soft_warning_re1_r1, tpms_temperature_soft_warning_re2_l0, tpms_temperature_soft_warning_re2_l1, tpms_temperature_soft_warning_re2_r0, tpms_temperature_soft_warning_re2_r1, unknownFields);
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Boolean getTpms_soft_warning_rr() {
        return this.tpms_soft_warning_rr;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final Float getTpms_temperature_fl() {
        return this.tpms_temperature_fl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getTpms_hard_warning_fl() {
        return this.tpms_hard_warning_fl;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final Float getTpms_temperature_fr() {
        return this.tpms_temperature_fr;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getTpms_hard_warning_fr() {
        return this.tpms_hard_warning_fr;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_fl() {
        return this.tpms_temperature_hard_warning_fl;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), t0Var.unknownFields()) && p013kotlin.jvm.internal.s.f(this.timestamp, t0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_fl, t0Var.tpms_last_seen_pressure_time_fl) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_fr, t0Var.tpms_last_seen_pressure_time_fr) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_rl, t0Var.tpms_last_seen_pressure_time_rl) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_rr, t0Var.tpms_last_seen_pressure_time_rr) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_re1_l0, t0Var.tpms_last_seen_pressure_time_re1_l0) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_re1_l1, t0Var.tpms_last_seen_pressure_time_re1_l1) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_re1_r0, t0Var.tpms_last_seen_pressure_time_re1_r0) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_re1_r1, t0Var.tpms_last_seen_pressure_time_re1_r1) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_re2_l0, t0Var.tpms_last_seen_pressure_time_re2_l0) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_re2_l1, t0Var.tpms_last_seen_pressure_time_re2_l1) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_re2_r0, t0Var.tpms_last_seen_pressure_time_re2_r0) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_re2_r1, t0Var.tpms_last_seen_pressure_time_re2_r1) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_fl, t0Var.tpms_pressure_fl) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_fr, t0Var.tpms_pressure_fr) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_rl, t0Var.tpms_pressure_rl) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_rr, t0Var.tpms_pressure_rr) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_fl, t0Var.tpms_hard_warning_fl) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_fr, t0Var.tpms_hard_warning_fr) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_rl, t0Var.tpms_hard_warning_rl) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_rr, t0Var.tpms_hard_warning_rr) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_fl, t0Var.tpms_soft_warning_fl) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_fr, t0Var.tpms_soft_warning_fr) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_rl, t0Var.tpms_soft_warning_rl) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_rr, t0Var.tpms_soft_warning_rr) && p013kotlin.jvm.internal.s.e(this.tpms_rcp_front_value, t0Var.tpms_rcp_front_value) && p013kotlin.jvm.internal.s.e(this.tpms_rcp_rear_value, t0Var.tpms_rcp_rear_value) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_re1_l0, t0Var.tpms_pressure_re1_l0) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_re1_l1, t0Var.tpms_pressure_re1_l1) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_re1_r0, t0Var.tpms_pressure_re1_r0) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_re1_r1, t0Var.tpms_pressure_re1_r1) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_re2_l0, t0Var.tpms_pressure_re2_l0) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_re2_l1, t0Var.tpms_pressure_re2_l1) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_re2_r0, t0Var.tpms_pressure_re2_r0) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_re2_r1, t0Var.tpms_pressure_re2_r1) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_re1_l0, t0Var.tpms_hard_warning_re1_l0) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_re1_l1, t0Var.tpms_hard_warning_re1_l1) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_re1_r0, t0Var.tpms_hard_warning_re1_r0) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_re1_r1, t0Var.tpms_hard_warning_re1_r1) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_re2_l0, t0Var.tpms_hard_warning_re2_l0) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_re2_l1, t0Var.tpms_hard_warning_re2_l1) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_re2_r0, t0Var.tpms_hard_warning_re2_r0) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_re2_r1, t0Var.tpms_hard_warning_re2_r1) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_re1_l0, t0Var.tpms_soft_warning_re1_l0) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_re1_l1, t0Var.tpms_soft_warning_re1_l1) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_re1_r0, t0Var.tpms_soft_warning_re1_r0) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_re1_r1, t0Var.tpms_soft_warning_re1_r1) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_re2_l0, t0Var.tpms_soft_warning_re2_l0) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_re2_l1, t0Var.tpms_soft_warning_re2_l1) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_re2_r0, t0Var.tpms_soft_warning_re2_r0) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_re2_r1, t0Var.tpms_soft_warning_re2_r1) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_fl, t0Var.tpms_temperature_fl) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_fr, t0Var.tpms_temperature_fr) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_rl, t0Var.tpms_temperature_rl) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_rr, t0Var.tpms_temperature_rr) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_re1_l0, t0Var.tpms_temperature_re1_l0) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_re1_l1, t0Var.tpms_temperature_re1_l1) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_re1_r0, t0Var.tpms_temperature_re1_r0) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_re1_r1, t0Var.tpms_temperature_re1_r1) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_re2_l0, t0Var.tpms_temperature_re2_l0) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_re2_l1, t0Var.tpms_temperature_re2_l1) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_re2_r0, t0Var.tpms_temperature_re2_r0) && p013kotlin.jvm.internal.s.e(this.tpms_temperature_re2_r1, t0Var.tpms_temperature_re2_r1) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_fl, t0Var.tpms_temperature_hard_warning_fl) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_fr, t0Var.tpms_temperature_hard_warning_fr) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_rl, t0Var.tpms_temperature_hard_warning_rl) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_rr, t0Var.tpms_temperature_hard_warning_rr) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_re1_l0, t0Var.tpms_temperature_hard_warning_re1_l0) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_re1_l1, t0Var.tpms_temperature_hard_warning_re1_l1) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_re1_r0, t0Var.tpms_temperature_hard_warning_re1_r0) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_re1_r1, t0Var.tpms_temperature_hard_warning_re1_r1) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_re2_l0, t0Var.tpms_temperature_hard_warning_re2_l0) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_re2_l1, t0Var.tpms_temperature_hard_warning_re2_l1) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_re2_r0, t0Var.tpms_temperature_hard_warning_re2_r0) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_hard_warning_re2_r1, t0Var.tpms_temperature_hard_warning_re2_r1) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_fl, t0Var.tpms_temperature_soft_warning_fl) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_fr, t0Var.tpms_temperature_soft_warning_fr) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_rl, t0Var.tpms_temperature_soft_warning_rl) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_rr, t0Var.tpms_temperature_soft_warning_rr) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_re1_l0, t0Var.tpms_temperature_soft_warning_re1_l0) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_re1_l1, t0Var.tpms_temperature_soft_warning_re1_l1) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_re1_r0, t0Var.tpms_temperature_soft_warning_re1_r0) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_re1_r1, t0Var.tpms_temperature_soft_warning_re1_r1) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_re2_l0, t0Var.tpms_temperature_soft_warning_re2_l0) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_re2_l1, t0Var.tpms_temperature_soft_warning_re2_l1) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_re2_r0, t0Var.tpms_temperature_soft_warning_re2_r0) && p013kotlin.jvm.internal.s.f(this.tpms_temperature_soft_warning_re2_r1, t0Var.tpms_temperature_soft_warning_re2_r1);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getTpms_hard_warning_re1_l0() {
        return this.tpms_hard_warning_re1_l0;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_fr() {
        return this.tpms_temperature_hard_warning_fr;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getTpms_hard_warning_re1_l1() {
        return this.tpms_hard_warning_re1_l1;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_re1_l0() {
        return this.tpms_temperature_hard_warning_re1_l0;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getTpms_hard_warning_re1_r0() {
        return this.tpms_hard_warning_re1_r0;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_re1_l1() {
        return this.tpms_temperature_hard_warning_re1_l1;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.timestamp;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.tpms_last_seen_pressure_time_fl;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.tpms_last_seen_pressure_time_fr;
        int iHashCode4 = (iHashCode3 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        Instant instant4 = this.tpms_last_seen_pressure_time_rl;
        int iHashCode5 = (iHashCode4 + (instant4 != null ? instant4.hashCode() : 0)) * 37;
        Instant instant5 = this.tpms_last_seen_pressure_time_rr;
        int iHashCode6 = (iHashCode5 + (instant5 != null ? instant5.hashCode() : 0)) * 37;
        Instant instant6 = this.tpms_last_seen_pressure_time_re1_l0;
        int iHashCode7 = (iHashCode6 + (instant6 != null ? instant6.hashCode() : 0)) * 37;
        Instant instant7 = this.tpms_last_seen_pressure_time_re1_l1;
        int iHashCode8 = (iHashCode7 + (instant7 != null ? instant7.hashCode() : 0)) * 37;
        Instant instant8 = this.tpms_last_seen_pressure_time_re1_r0;
        int iHashCode9 = (iHashCode8 + (instant8 != null ? instant8.hashCode() : 0)) * 37;
        Instant instant9 = this.tpms_last_seen_pressure_time_re1_r1;
        int iHashCode10 = (iHashCode9 + (instant9 != null ? instant9.hashCode() : 0)) * 37;
        Instant instant10 = this.tpms_last_seen_pressure_time_re2_l0;
        int iHashCode11 = (iHashCode10 + (instant10 != null ? instant10.hashCode() : 0)) * 37;
        Instant instant11 = this.tpms_last_seen_pressure_time_re2_l1;
        int iHashCode12 = (iHashCode11 + (instant11 != null ? instant11.hashCode() : 0)) * 37;
        Instant instant12 = this.tpms_last_seen_pressure_time_re2_r0;
        int iHashCode13 = (iHashCode12 + (instant12 != null ? instant12.hashCode() : 0)) * 37;
        Instant instant13 = this.tpms_last_seen_pressure_time_re2_r1;
        int iHashCode14 = (iHashCode13 + (instant13 != null ? instant13.hashCode() : 0)) * 37;
        Float f11 = this.tpms_pressure_fl;
        int iHashCode15 = (iHashCode14 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.tpms_pressure_fr;
        int iHashCode16 = (iHashCode15 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.tpms_pressure_rl;
        int iHashCode17 = (iHashCode16 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.tpms_pressure_rr;
        int iHashCode18 = (iHashCode17 + (f14 != null ? f14.hashCode() : 0)) * 37;
        Boolean bool = this.tpms_hard_warning_fl;
        int iHashCode19 = (iHashCode18 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.tpms_hard_warning_fr;
        int iHashCode20 = (iHashCode19 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.tpms_hard_warning_rl;
        int iHashCode21 = (iHashCode20 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Boolean bool4 = this.tpms_hard_warning_rr;
        int iHashCode22 = (iHashCode21 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.tpms_soft_warning_fl;
        int iHashCode23 = (iHashCode22 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.tpms_soft_warning_fr;
        int iHashCode24 = (iHashCode23 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.tpms_soft_warning_rl;
        int iHashCode25 = (iHashCode24 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        Boolean bool8 = this.tpms_soft_warning_rr;
        int iHashCode26 = (iHashCode25 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        Float f15 = this.tpms_rcp_front_value;
        int iHashCode27 = (iHashCode26 + (f15 != null ? f15.hashCode() : 0)) * 37;
        Float f16 = this.tpms_rcp_rear_value;
        int iHashCode28 = (iHashCode27 + (f16 != null ? f16.hashCode() : 0)) * 37;
        Float f17 = this.tpms_pressure_re1_l0;
        int iHashCode29 = (iHashCode28 + (f17 != null ? f17.hashCode() : 0)) * 37;
        Float f18 = this.tpms_pressure_re1_l1;
        int iHashCode30 = (iHashCode29 + (f18 != null ? f18.hashCode() : 0)) * 37;
        Float f19 = this.tpms_pressure_re1_r0;
        int iHashCode31 = (iHashCode30 + (f19 != null ? f19.hashCode() : 0)) * 37;
        Float f21 = this.tpms_pressure_re1_r1;
        int iHashCode32 = (iHashCode31 + (f21 != null ? f21.hashCode() : 0)) * 37;
        Float f22 = this.tpms_pressure_re2_l0;
        int iHashCode33 = (iHashCode32 + (f22 != null ? f22.hashCode() : 0)) * 37;
        Float f23 = this.tpms_pressure_re2_l1;
        int iHashCode34 = (iHashCode33 + (f23 != null ? f23.hashCode() : 0)) * 37;
        Float f24 = this.tpms_pressure_re2_r0;
        int iHashCode35 = (iHashCode34 + (f24 != null ? f24.hashCode() : 0)) * 37;
        Float f25 = this.tpms_pressure_re2_r1;
        int iHashCode36 = (iHashCode35 + (f25 != null ? f25.hashCode() : 0)) * 37;
        Boolean bool9 = this.tpms_hard_warning_re1_l0;
        int iHashCode37 = (iHashCode36 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        Boolean bool10 = this.tpms_hard_warning_re1_l1;
        int iHashCode38 = (iHashCode37 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
        Boolean bool11 = this.tpms_hard_warning_re1_r0;
        int iHashCode39 = (iHashCode38 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
        Boolean bool12 = this.tpms_hard_warning_re1_r1;
        int iHashCode40 = (iHashCode39 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
        Boolean bool13 = this.tpms_hard_warning_re2_l0;
        int iHashCode41 = (iHashCode40 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
        Boolean bool14 = this.tpms_hard_warning_re2_l1;
        int iHashCode42 = (iHashCode41 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
        Boolean bool15 = this.tpms_hard_warning_re2_r0;
        int iHashCode43 = (iHashCode42 + (bool15 != null ? bool15.hashCode() : 0)) * 37;
        Boolean bool16 = this.tpms_hard_warning_re2_r1;
        int iHashCode44 = (iHashCode43 + (bool16 != null ? bool16.hashCode() : 0)) * 37;
        Boolean bool17 = this.tpms_soft_warning_re1_l0;
        int iHashCode45 = (iHashCode44 + (bool17 != null ? bool17.hashCode() : 0)) * 37;
        Boolean bool18 = this.tpms_soft_warning_re1_l1;
        int iHashCode46 = (iHashCode45 + (bool18 != null ? bool18.hashCode() : 0)) * 37;
        Boolean bool19 = this.tpms_soft_warning_re1_r0;
        int iHashCode47 = (iHashCode46 + (bool19 != null ? bool19.hashCode() : 0)) * 37;
        Boolean bool20 = this.tpms_soft_warning_re1_r1;
        int iHashCode48 = (iHashCode47 + (bool20 != null ? bool20.hashCode() : 0)) * 37;
        Boolean bool21 = this.tpms_soft_warning_re2_l0;
        int iHashCode49 = (iHashCode48 + (bool21 != null ? bool21.hashCode() : 0)) * 37;
        Boolean bool22 = this.tpms_soft_warning_re2_l1;
        int iHashCode50 = (iHashCode49 + (bool22 != null ? bool22.hashCode() : 0)) * 37;
        Boolean bool23 = this.tpms_soft_warning_re2_r0;
        int iHashCode51 = (iHashCode50 + (bool23 != null ? bool23.hashCode() : 0)) * 37;
        Boolean bool24 = this.tpms_soft_warning_re2_r1;
        int iHashCode52 = (iHashCode51 + (bool24 != null ? bool24.hashCode() : 0)) * 37;
        Float f26 = this.tpms_temperature_fl;
        int iHashCode53 = (iHashCode52 + (f26 != null ? f26.hashCode() : 0)) * 37;
        Float f27 = this.tpms_temperature_fr;
        int iHashCode54 = (iHashCode53 + (f27 != null ? f27.hashCode() : 0)) * 37;
        Float f28 = this.tpms_temperature_rl;
        int iHashCode55 = (iHashCode54 + (f28 != null ? f28.hashCode() : 0)) * 37;
        Float f29 = this.tpms_temperature_rr;
        int iHashCode56 = (iHashCode55 + (f29 != null ? f29.hashCode() : 0)) * 37;
        Float f31 = this.tpms_temperature_re1_l0;
        int iHashCode57 = (iHashCode56 + (f31 != null ? f31.hashCode() : 0)) * 37;
        Float f32 = this.tpms_temperature_re1_l1;
        int iHashCode58 = (iHashCode57 + (f32 != null ? f32.hashCode() : 0)) * 37;
        Float f33 = this.tpms_temperature_re1_r0;
        int iHashCode59 = (iHashCode58 + (f33 != null ? f33.hashCode() : 0)) * 37;
        Float f34 = this.tpms_temperature_re1_r1;
        int iHashCode60 = (iHashCode59 + (f34 != null ? f34.hashCode() : 0)) * 37;
        Float f35 = this.tpms_temperature_re2_l0;
        int iHashCode61 = (iHashCode60 + (f35 != null ? f35.hashCode() : 0)) * 37;
        Float f36 = this.tpms_temperature_re2_l1;
        int iHashCode62 = (iHashCode61 + (f36 != null ? f36.hashCode() : 0)) * 37;
        Float f37 = this.tpms_temperature_re2_r0;
        int iHashCode63 = (iHashCode62 + (f37 != null ? f37.hashCode() : 0)) * 37;
        Float f38 = this.tpms_temperature_re2_r1;
        int iHashCode64 = (iHashCode63 + (f38 != null ? f38.hashCode() : 0)) * 37;
        Boolean bool25 = this.tpms_temperature_hard_warning_fl;
        int iHashCode65 = (iHashCode64 + (bool25 != null ? bool25.hashCode() : 0)) * 37;
        Boolean bool26 = this.tpms_temperature_hard_warning_fr;
        int iHashCode66 = (iHashCode65 + (bool26 != null ? bool26.hashCode() : 0)) * 37;
        Boolean bool27 = this.tpms_temperature_hard_warning_rl;
        int iHashCode67 = (iHashCode66 + (bool27 != null ? bool27.hashCode() : 0)) * 37;
        Boolean bool28 = this.tpms_temperature_hard_warning_rr;
        int iHashCode68 = (iHashCode67 + (bool28 != null ? bool28.hashCode() : 0)) * 37;
        Boolean bool29 = this.tpms_temperature_hard_warning_re1_l0;
        int iHashCode69 = (iHashCode68 + (bool29 != null ? bool29.hashCode() : 0)) * 37;
        Boolean bool30 = this.tpms_temperature_hard_warning_re1_l1;
        int iHashCode70 = (iHashCode69 + (bool30 != null ? bool30.hashCode() : 0)) * 37;
        Boolean bool31 = this.tpms_temperature_hard_warning_re1_r0;
        int iHashCode71 = (iHashCode70 + (bool31 != null ? bool31.hashCode() : 0)) * 37;
        Boolean bool32 = this.tpms_temperature_hard_warning_re1_r1;
        int iHashCode72 = (iHashCode71 + (bool32 != null ? bool32.hashCode() : 0)) * 37;
        Boolean bool33 = this.tpms_temperature_hard_warning_re2_l0;
        int iHashCode73 = (iHashCode72 + (bool33 != null ? bool33.hashCode() : 0)) * 37;
        Boolean bool34 = this.tpms_temperature_hard_warning_re2_l1;
        int iHashCode74 = (iHashCode73 + (bool34 != null ? bool34.hashCode() : 0)) * 37;
        Boolean bool35 = this.tpms_temperature_hard_warning_re2_r0;
        int iHashCode75 = (iHashCode74 + (bool35 != null ? bool35.hashCode() : 0)) * 37;
        Boolean bool36 = this.tpms_temperature_hard_warning_re2_r1;
        int iHashCode76 = (iHashCode75 + (bool36 != null ? bool36.hashCode() : 0)) * 37;
        Boolean bool37 = this.tpms_temperature_soft_warning_fl;
        int iHashCode77 = (iHashCode76 + (bool37 != null ? bool37.hashCode() : 0)) * 37;
        Boolean bool38 = this.tpms_temperature_soft_warning_fr;
        int iHashCode78 = (iHashCode77 + (bool38 != null ? bool38.hashCode() : 0)) * 37;
        Boolean bool39 = this.tpms_temperature_soft_warning_rl;
        int iHashCode79 = (iHashCode78 + (bool39 != null ? bool39.hashCode() : 0)) * 37;
        Boolean bool40 = this.tpms_temperature_soft_warning_rr;
        int iHashCode80 = (iHashCode79 + (bool40 != null ? bool40.hashCode() : 0)) * 37;
        Boolean bool41 = this.tpms_temperature_soft_warning_re1_l0;
        int iHashCode81 = (iHashCode80 + (bool41 != null ? bool41.hashCode() : 0)) * 37;
        Boolean bool42 = this.tpms_temperature_soft_warning_re1_l1;
        int iHashCode82 = (iHashCode81 + (bool42 != null ? bool42.hashCode() : 0)) * 37;
        Boolean bool43 = this.tpms_temperature_soft_warning_re1_r0;
        int iHashCode83 = (iHashCode82 + (bool43 != null ? bool43.hashCode() : 0)) * 37;
        Boolean bool44 = this.tpms_temperature_soft_warning_re1_r1;
        int iHashCode84 = (iHashCode83 + (bool44 != null ? bool44.hashCode() : 0)) * 37;
        Boolean bool45 = this.tpms_temperature_soft_warning_re2_l0;
        int iHashCode85 = (iHashCode84 + (bool45 != null ? bool45.hashCode() : 0)) * 37;
        Boolean bool46 = this.tpms_temperature_soft_warning_re2_l1;
        int iHashCode86 = (iHashCode85 + (bool46 != null ? bool46.hashCode() : 0)) * 37;
        Boolean bool47 = this.tpms_temperature_soft_warning_re2_r0;
        int iHashCode87 = (iHashCode86 + (bool47 != null ? bool47.hashCode() : 0)) * 37;
        Boolean bool48 = this.tpms_temperature_soft_warning_re2_r1;
        int iHashCode88 = iHashCode87 + (bool48 != null ? bool48.hashCode() : 0);
        this.hashCode = iHashCode88;
        return iHashCode88;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getTpms_hard_warning_re1_r1() {
        return this.tpms_hard_warning_re1_r1;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_re1_r0() {
        return this.tpms_temperature_hard_warning_re1_r0;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getTpms_hard_warning_re2_l0() {
        return this.tpms_hard_warning_re2_l0;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_re1_r1() {
        return this.tpms_temperature_hard_warning_re1_r1;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getTpms_hard_warning_re2_l1() {
        return this.tpms_hard_warning_re2_l1;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_re2_l0() {
        return this.tpms_temperature_hard_warning_re2_l0;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Boolean getTpms_hard_warning_re2_r0() {
        return this.tpms_hard_warning_re2_r0;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_re2_l1() {
        return this.tpms_temperature_hard_warning_re2_l1;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getTpms_hard_warning_re2_r1() {
        return this.tpms_hard_warning_re2_r1;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_re2_r0() {
        return this.tpms_temperature_hard_warning_re2_r0;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getTpms_hard_warning_rl() {
        return this.tpms_hard_warning_rl;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_re2_r1() {
        return this.tpms_temperature_hard_warning_re2_r1;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m438newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getTpms_hard_warning_rr() {
        return this.tpms_hard_warning_rr;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_rl() {
        return this.tpms_temperature_hard_warning_rl;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_fl() {
        return this.tpms_last_seen_pressure_time_fl;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final Boolean getTpms_temperature_hard_warning_rr() {
        return this.tpms_temperature_hard_warning_rr;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_fr() {
        return this.tpms_last_seen_pressure_time_fr;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final Float getTpms_temperature_re1_l0() {
        return this.tpms_temperature_re1_l0;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_re1_l0() {
        return this.tpms_last_seen_pressure_time_re1_l0;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final Float getTpms_temperature_re1_l1() {
        return this.tpms_temperature_re1_l1;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_re1_l1() {
        return this.tpms_last_seen_pressure_time_re1_l1;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_re1_r0() {
        return this.tpms_last_seen_pressure_time_re1_r0;
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final Float getTpms_temperature_re1_r0() {
        return this.tpms_temperature_re1_r0;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        Instant instant2 = this.tpms_last_seen_pressure_time_fl;
        if (instant2 != null) {
            arrayList.add("tpms_last_seen_pressure_time_fl=" + instant2);
        }
        Instant instant3 = this.tpms_last_seen_pressure_time_fr;
        if (instant3 != null) {
            arrayList.add("tpms_last_seen_pressure_time_fr=" + instant3);
        }
        Instant instant4 = this.tpms_last_seen_pressure_time_rl;
        if (instant4 != null) {
            arrayList.add("tpms_last_seen_pressure_time_rl=" + instant4);
        }
        Instant instant5 = this.tpms_last_seen_pressure_time_rr;
        if (instant5 != null) {
            arrayList.add("tpms_last_seen_pressure_time_rr=" + instant5);
        }
        Instant instant6 = this.tpms_last_seen_pressure_time_re1_l0;
        if (instant6 != null) {
            arrayList.add("tpms_last_seen_pressure_time_re1_l0=" + instant6);
        }
        Instant instant7 = this.tpms_last_seen_pressure_time_re1_l1;
        if (instant7 != null) {
            arrayList.add("tpms_last_seen_pressure_time_re1_l1=" + instant7);
        }
        Instant instant8 = this.tpms_last_seen_pressure_time_re1_r0;
        if (instant8 != null) {
            arrayList.add("tpms_last_seen_pressure_time_re1_r0=" + instant8);
        }
        Instant instant9 = this.tpms_last_seen_pressure_time_re1_r1;
        if (instant9 != null) {
            arrayList.add("tpms_last_seen_pressure_time_re1_r1=" + instant9);
        }
        Instant instant10 = this.tpms_last_seen_pressure_time_re2_l0;
        if (instant10 != null) {
            arrayList.add("tpms_last_seen_pressure_time_re2_l0=" + instant10);
        }
        Instant instant11 = this.tpms_last_seen_pressure_time_re2_l1;
        if (instant11 != null) {
            arrayList.add("tpms_last_seen_pressure_time_re2_l1=" + instant11);
        }
        Instant instant12 = this.tpms_last_seen_pressure_time_re2_r0;
        if (instant12 != null) {
            arrayList.add("tpms_last_seen_pressure_time_re2_r0=" + instant12);
        }
        Instant instant13 = this.tpms_last_seen_pressure_time_re2_r1;
        if (instant13 != null) {
            arrayList.add("tpms_last_seen_pressure_time_re2_r1=" + instant13);
        }
        Float f11 = this.tpms_pressure_fl;
        if (f11 != null) {
            arrayList.add("tpms_pressure_fl=" + f11);
        }
        Float f12 = this.tpms_pressure_fr;
        if (f12 != null) {
            arrayList.add("tpms_pressure_fr=" + f12);
        }
        Float f13 = this.tpms_pressure_rl;
        if (f13 != null) {
            arrayList.add("tpms_pressure_rl=" + f13);
        }
        Float f14 = this.tpms_pressure_rr;
        if (f14 != null) {
            arrayList.add("tpms_pressure_rr=" + f14);
        }
        Boolean bool = this.tpms_hard_warning_fl;
        if (bool != null) {
            arrayList.add("tpms_hard_warning_fl=" + bool);
        }
        Boolean bool2 = this.tpms_hard_warning_fr;
        if (bool2 != null) {
            arrayList.add("tpms_hard_warning_fr=" + bool2);
        }
        Boolean bool3 = this.tpms_hard_warning_rl;
        if (bool3 != null) {
            arrayList.add("tpms_hard_warning_rl=" + bool3);
        }
        Boolean bool4 = this.tpms_hard_warning_rr;
        if (bool4 != null) {
            arrayList.add("tpms_hard_warning_rr=" + bool4);
        }
        Boolean bool5 = this.tpms_soft_warning_fl;
        if (bool5 != null) {
            arrayList.add("tpms_soft_warning_fl=" + bool5);
        }
        Boolean bool6 = this.tpms_soft_warning_fr;
        if (bool6 != null) {
            arrayList.add("tpms_soft_warning_fr=" + bool6);
        }
        Boolean bool7 = this.tpms_soft_warning_rl;
        if (bool7 != null) {
            arrayList.add("tpms_soft_warning_rl=" + bool7);
        }
        Boolean bool8 = this.tpms_soft_warning_rr;
        if (bool8 != null) {
            arrayList.add("tpms_soft_warning_rr=" + bool8);
        }
        Float f15 = this.tpms_rcp_front_value;
        if (f15 != null) {
            arrayList.add("tpms_rcp_front_value=" + f15);
        }
        Float f16 = this.tpms_rcp_rear_value;
        if (f16 != null) {
            arrayList.add("tpms_rcp_rear_value=" + f16);
        }
        Float f17 = this.tpms_pressure_re1_l0;
        if (f17 != null) {
            arrayList.add("tpms_pressure_re1_l0=" + f17);
        }
        Float f18 = this.tpms_pressure_re1_l1;
        if (f18 != null) {
            arrayList.add("tpms_pressure_re1_l1=" + f18);
        }
        Float f19 = this.tpms_pressure_re1_r0;
        if (f19 != null) {
            arrayList.add("tpms_pressure_re1_r0=" + f19);
        }
        Float f21 = this.tpms_pressure_re1_r1;
        if (f21 != null) {
            arrayList.add("tpms_pressure_re1_r1=" + f21);
        }
        Float f22 = this.tpms_pressure_re2_l0;
        if (f22 != null) {
            arrayList.add("tpms_pressure_re2_l0=" + f22);
        }
        Float f23 = this.tpms_pressure_re2_l1;
        if (f23 != null) {
            arrayList.add("tpms_pressure_re2_l1=" + f23);
        }
        Float f24 = this.tpms_pressure_re2_r0;
        if (f24 != null) {
            arrayList.add("tpms_pressure_re2_r0=" + f24);
        }
        Float f25 = this.tpms_pressure_re2_r1;
        if (f25 != null) {
            arrayList.add("tpms_pressure_re2_r1=" + f25);
        }
        Boolean bool9 = this.tpms_hard_warning_re1_l0;
        if (bool9 != null) {
            arrayList.add("tpms_hard_warning_re1_l0=" + bool9);
        }
        Boolean bool10 = this.tpms_hard_warning_re1_l1;
        if (bool10 != null) {
            arrayList.add("tpms_hard_warning_re1_l1=" + bool10);
        }
        Boolean bool11 = this.tpms_hard_warning_re1_r0;
        if (bool11 != null) {
            arrayList.add("tpms_hard_warning_re1_r0=" + bool11);
        }
        Boolean bool12 = this.tpms_hard_warning_re1_r1;
        if (bool12 != null) {
            arrayList.add("tpms_hard_warning_re1_r1=" + bool12);
        }
        Boolean bool13 = this.tpms_hard_warning_re2_l0;
        if (bool13 != null) {
            arrayList.add("tpms_hard_warning_re2_l0=" + bool13);
        }
        Boolean bool14 = this.tpms_hard_warning_re2_l1;
        if (bool14 != null) {
            arrayList.add("tpms_hard_warning_re2_l1=" + bool14);
        }
        Boolean bool15 = this.tpms_hard_warning_re2_r0;
        if (bool15 != null) {
            arrayList.add("tpms_hard_warning_re2_r0=" + bool15);
        }
        Boolean bool16 = this.tpms_hard_warning_re2_r1;
        if (bool16 != null) {
            arrayList.add("tpms_hard_warning_re2_r1=" + bool16);
        }
        Boolean bool17 = this.tpms_soft_warning_re1_l0;
        if (bool17 != null) {
            arrayList.add("tpms_soft_warning_re1_l0=" + bool17);
        }
        Boolean bool18 = this.tpms_soft_warning_re1_l1;
        if (bool18 != null) {
            arrayList.add("tpms_soft_warning_re1_l1=" + bool18);
        }
        Boolean bool19 = this.tpms_soft_warning_re1_r0;
        if (bool19 != null) {
            arrayList.add("tpms_soft_warning_re1_r0=" + bool19);
        }
        Boolean bool20 = this.tpms_soft_warning_re1_r1;
        if (bool20 != null) {
            arrayList.add("tpms_soft_warning_re1_r1=" + bool20);
        }
        Boolean bool21 = this.tpms_soft_warning_re2_l0;
        if (bool21 != null) {
            arrayList.add("tpms_soft_warning_re2_l0=" + bool21);
        }
        Boolean bool22 = this.tpms_soft_warning_re2_l1;
        if (bool22 != null) {
            arrayList.add("tpms_soft_warning_re2_l1=" + bool22);
        }
        Boolean bool23 = this.tpms_soft_warning_re2_r0;
        if (bool23 != null) {
            arrayList.add("tpms_soft_warning_re2_r0=" + bool23);
        }
        Boolean bool24 = this.tpms_soft_warning_re2_r1;
        if (bool24 != null) {
            arrayList.add("tpms_soft_warning_re2_r1=" + bool24);
        }
        Float f26 = this.tpms_temperature_fl;
        if (f26 != null) {
            arrayList.add("tpms_temperature_fl=" + f26);
        }
        Float f27 = this.tpms_temperature_fr;
        if (f27 != null) {
            arrayList.add("tpms_temperature_fr=" + f27);
        }
        Float f28 = this.tpms_temperature_rl;
        if (f28 != null) {
            arrayList.add("tpms_temperature_rl=" + f28);
        }
        Float f29 = this.tpms_temperature_rr;
        if (f29 != null) {
            arrayList.add("tpms_temperature_rr=" + f29);
        }
        Float f31 = this.tpms_temperature_re1_l0;
        if (f31 != null) {
            arrayList.add("tpms_temperature_re1_l0=" + f31);
        }
        Float f32 = this.tpms_temperature_re1_l1;
        if (f32 != null) {
            arrayList.add("tpms_temperature_re1_l1=" + f32);
        }
        Float f33 = this.tpms_temperature_re1_r0;
        if (f33 != null) {
            arrayList.add("tpms_temperature_re1_r0=" + f33);
        }
        Float f34 = this.tpms_temperature_re1_r1;
        if (f34 != null) {
            arrayList.add("tpms_temperature_re1_r1=" + f34);
        }
        Float f35 = this.tpms_temperature_re2_l0;
        if (f35 != null) {
            arrayList.add("tpms_temperature_re2_l0=" + f35);
        }
        Float f36 = this.tpms_temperature_re2_l1;
        if (f36 != null) {
            arrayList.add("tpms_temperature_re2_l1=" + f36);
        }
        Float f37 = this.tpms_temperature_re2_r0;
        if (f37 != null) {
            arrayList.add("tpms_temperature_re2_r0=" + f37);
        }
        Float f38 = this.tpms_temperature_re2_r1;
        if (f38 != null) {
            arrayList.add("tpms_temperature_re2_r1=" + f38);
        }
        Boolean bool25 = this.tpms_temperature_hard_warning_fl;
        if (bool25 != null) {
            arrayList.add("tpms_temperature_hard_warning_fl=" + bool25);
        }
        Boolean bool26 = this.tpms_temperature_hard_warning_fr;
        if (bool26 != null) {
            arrayList.add("tpms_temperature_hard_warning_fr=" + bool26);
        }
        Boolean bool27 = this.tpms_temperature_hard_warning_rl;
        if (bool27 != null) {
            arrayList.add("tpms_temperature_hard_warning_rl=" + bool27);
        }
        Boolean bool28 = this.tpms_temperature_hard_warning_rr;
        if (bool28 != null) {
            arrayList.add("tpms_temperature_hard_warning_rr=" + bool28);
        }
        Boolean bool29 = this.tpms_temperature_hard_warning_re1_l0;
        if (bool29 != null) {
            arrayList.add("tpms_temperature_hard_warning_re1_l0=" + bool29);
        }
        Boolean bool30 = this.tpms_temperature_hard_warning_re1_l1;
        if (bool30 != null) {
            arrayList.add("tpms_temperature_hard_warning_re1_l1=" + bool30);
        }
        Boolean bool31 = this.tpms_temperature_hard_warning_re1_r0;
        if (bool31 != null) {
            arrayList.add("tpms_temperature_hard_warning_re1_r0=" + bool31);
        }
        Boolean bool32 = this.tpms_temperature_hard_warning_re1_r1;
        if (bool32 != null) {
            arrayList.add("tpms_temperature_hard_warning_re1_r1=" + bool32);
        }
        Boolean bool33 = this.tpms_temperature_hard_warning_re2_l0;
        if (bool33 != null) {
            arrayList.add("tpms_temperature_hard_warning_re2_l0=" + bool33);
        }
        Boolean bool34 = this.tpms_temperature_hard_warning_re2_l1;
        if (bool34 != null) {
            arrayList.add("tpms_temperature_hard_warning_re2_l1=" + bool34);
        }
        Boolean bool35 = this.tpms_temperature_hard_warning_re2_r0;
        if (bool35 != null) {
            arrayList.add("tpms_temperature_hard_warning_re2_r0=" + bool35);
        }
        Boolean bool36 = this.tpms_temperature_hard_warning_re2_r1;
        if (bool36 != null) {
            arrayList.add("tpms_temperature_hard_warning_re2_r1=" + bool36);
        }
        Boolean bool37 = this.tpms_temperature_soft_warning_fl;
        if (bool37 != null) {
            arrayList.add("tpms_temperature_soft_warning_fl=" + bool37);
        }
        Boolean bool38 = this.tpms_temperature_soft_warning_fr;
        if (bool38 != null) {
            arrayList.add("tpms_temperature_soft_warning_fr=" + bool38);
        }
        Boolean bool39 = this.tpms_temperature_soft_warning_rl;
        if (bool39 != null) {
            arrayList.add("tpms_temperature_soft_warning_rl=" + bool39);
        }
        Boolean bool40 = this.tpms_temperature_soft_warning_rr;
        if (bool40 != null) {
            arrayList.add("tpms_temperature_soft_warning_rr=" + bool40);
        }
        Boolean bool41 = this.tpms_temperature_soft_warning_re1_l0;
        if (bool41 != null) {
            arrayList.add("tpms_temperature_soft_warning_re1_l0=" + bool41);
        }
        Boolean bool42 = this.tpms_temperature_soft_warning_re1_l1;
        if (bool42 != null) {
            arrayList.add("tpms_temperature_soft_warning_re1_l1=" + bool42);
        }
        Boolean bool43 = this.tpms_temperature_soft_warning_re1_r0;
        if (bool43 != null) {
            arrayList.add("tpms_temperature_soft_warning_re1_r0=" + bool43);
        }
        Boolean bool44 = this.tpms_temperature_soft_warning_re1_r1;
        if (bool44 != null) {
            arrayList.add("tpms_temperature_soft_warning_re1_r1=" + bool44);
        }
        Boolean bool45 = this.tpms_temperature_soft_warning_re2_l0;
        if (bool45 != null) {
            arrayList.add("tpms_temperature_soft_warning_re2_l0=" + bool45);
        }
        Boolean bool46 = this.tpms_temperature_soft_warning_re2_l1;
        if (bool46 != null) {
            arrayList.add("tpms_temperature_soft_warning_re2_l1=" + bool46);
        }
        Boolean bool47 = this.tpms_temperature_soft_warning_re2_r0;
        if (bool47 != null) {
            arrayList.add("tpms_temperature_soft_warning_re2_r0=" + bool47);
        }
        Boolean bool48 = this.tpms_temperature_soft_warning_re2_r1;
        if (bool48 != null) {
            arrayList.add("tpms_temperature_soft_warning_re2_r1=" + bool48);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "TirePressureState{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_re1_r1() {
        return this.tpms_last_seen_pressure_time_re1_r1;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final Float getTpms_temperature_re1_r1() {
        return this.tpms_temperature_re1_r1;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_re2_l0() {
        return this.tpms_last_seen_pressure_time_re2_l0;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final Float getTpms_temperature_re2_l0() {
        return this.tpms_temperature_re2_l0;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_re2_l1() {
        return this.tpms_last_seen_pressure_time_re2_l1;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final Float getTpms_temperature_re2_l1() {
        return this.tpms_temperature_re2_l1;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_re2_r0() {
        return this.tpms_last_seen_pressure_time_re2_r0;
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final Float getTpms_temperature_re2_r0() {
        return this.tpms_temperature_re2_r0;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_re2_r1() {
        return this.tpms_last_seen_pressure_time_re2_r1;
    }

    /* JADX INFO: renamed from: y0, reason: from getter */
    public final Float getTpms_temperature_re2_r1() {
        return this.tpms_temperature_re2_r1;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_rl() {
        return this.tpms_last_seen_pressure_time_rl;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final Float getTpms_temperature_rl() {
        return this.tpms_temperature_rl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ t0(Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Float f11, Float f12, Float f13, Float f14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Float f15, Float f16, Float f17, Float f18, Float f19, Float f21, Float f22, Float f23, Float f24, Float f25, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Float f26, Float f27, Float f28, Float f29, Float f31, Float f32, Float f33, Float f34, Float f35, Float f36, Float f37, Float f38, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42, Boolean bool43, Boolean bool44, Boolean bool45, Boolean bool46, Boolean bool47, Boolean bool48, okio.k kVar, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Instant instant14 = (i11 & 1) != 0 ? null : instant;
        Instant instant15 = (i11 & 2) != 0 ? null : instant2;
        Instant instant16 = (i11 & 4) != 0 ? null : instant3;
        Instant instant17 = (i11 & 8) != 0 ? null : instant4;
        Instant instant18 = (i11 & 16) != 0 ? null : instant5;
        Instant instant19 = (i11 & 32) != 0 ? null : instant6;
        Instant instant20 = (i11 & 64) != 0 ? null : instant7;
        Instant instant21 = (i11 & 128) != 0 ? null : instant8;
        Instant instant22 = (i11 & 256) != 0 ? null : instant9;
        Instant instant23 = (i11 & 512) != 0 ? null : instant10;
        Instant instant24 = (i11 & 1024) != 0 ? null : instant11;
        Instant instant25 = (i11 & 2048) != 0 ? null : instant12;
        Instant instant26 = (i11 & 4096) != 0 ? null : instant13;
        Instant instant27 = instant14;
        Float f39 = (i11 & PKIFailureInfo.certRevoked) != 0 ? null : f11;
        Float f41 = (i11 & 16384) != 0 ? null : f12;
        Float f42 = (i11 & 32768) != 0 ? null : f13;
        Float f43 = (i11 & 65536) != 0 ? null : f14;
        Boolean bool49 = (i11 & 131072) != 0 ? null : bool;
        Boolean bool50 = (i11 & 262144) != 0 ? null : bool2;
        Boolean bool51 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : bool3;
        Boolean bool52 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : bool4;
        Boolean bool53 = (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : bool5;
        Boolean bool54 = (i11 & 4194304) != 0 ? null : bool6;
        Boolean bool55 = (i11 & 8388608) != 0 ? null : bool7;
        Boolean bool56 = (i11 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool8;
        Float f44 = (i11 & 33554432) != 0 ? null : f15;
        Float f45 = (i11 & 67108864) != 0 ? null : f16;
        Float f46 = (i11 & 134217728) != 0 ? null : f17;
        Float f47 = (i11 & 268435456) != 0 ? null : f18;
        Float f48 = (i11 & PKIFailureInfo.duplicateCertReq) != 0 ? null : f19;
        Float f49 = (i11 & 1073741824) != 0 ? null : f21;
        Float f51 = (i11 & Integer.MIN_VALUE) != 0 ? null : f22;
        this(instant27, instant15, instant16, instant17, instant18, instant19, instant20, instant21, instant22, instant23, instant24, instant25, instant26, f39, f41, f42, f43, bool49, bool50, bool51, bool52, bool53, bool54, bool55, bool56, f44, f45, f46, f47, f48, f49, f51, (i12 & 1) != 0 ? null : f23, (i12 & 2) != 0 ? null : f24, (i12 & 4) != 0 ? null : f25, (i12 & 8) != 0 ? null : bool9, (i12 & 16) != 0 ? null : bool10, (i12 & 32) != 0 ? null : bool11, (i12 & 64) != 0 ? null : bool12, (i12 & 128) != 0 ? null : bool13, (i12 & 256) != 0 ? null : bool14, (i12 & 512) != 0 ? null : bool15, (i12 & 1024) != 0 ? null : bool16, (i12 & 2048) != 0 ? null : bool17, (i12 & 4096) != 0 ? null : bool18, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : bool19, (i12 & 16384) != 0 ? null : bool20, (i12 & 32768) != 0 ? null : bool21, (i12 & 65536) != 0 ? null : bool22, (i12 & 131072) != 0 ? null : bool23, (i12 & 262144) != 0 ? null : bool24, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? null : f26, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? null : f27, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? null : f28, (i12 & 4194304) != 0 ? null : f29, (i12 & 8388608) != 0 ? null : f31, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : f32, (i12 & 33554432) != 0 ? null : f33, (i12 & 67108864) != 0 ? null : f34, (i12 & 134217728) != 0 ? null : f35, (i12 & 268435456) != 0 ? null : f36, (i12 & PKIFailureInfo.duplicateCertReq) != 0 ? null : f37, (i12 & 1073741824) != 0 ? null : f38, (i12 & Integer.MIN_VALUE) != 0 ? null : bool25, (i13 & 1) != 0 ? null : bool26, (i13 & 2) != 0 ? null : bool27, (i13 & 4) != 0 ? null : bool28, (i13 & 8) != 0 ? null : bool29, (i13 & 16) != 0 ? null : bool30, (i13 & 32) != 0 ? null : bool31, (i13 & 64) != 0 ? null : bool32, (i13 & 128) != 0 ? null : bool33, (i13 & 256) != 0 ? null : bool34, (i13 & 512) != 0 ? null : bool35, (i13 & 1024) != 0 ? null : bool36, (i13 & 2048) != 0 ? null : bool37, (i13 & 4096) != 0 ? null : bool38, (i13 & PKIFailureInfo.certRevoked) != 0 ? null : bool39, (i13 & 16384) != 0 ? null : bool40, (i13 & 32768) != 0 ? null : bool41, (i13 & 65536) != 0 ? null : bool42, (i13 & 131072) != 0 ? null : bool43, (i13 & 262144) != 0 ? null : bool44, (i13 & PKIFailureInfo.signerNotTrusted) != 0 ? null : bool45, (i13 & PKIFailureInfo.badCertTemplate) != 0 ? null : bool46, (i13 & PKIFailureInfo.badSenderNonce) != 0 ? null : bool47, (i13 & 4194304) != 0 ? null : bool48, (i13 & 8388608) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m438newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Instant instant, Instant instant2, Instant instant3, Instant instant4, Instant instant5, Instant instant6, Instant instant7, Instant instant8, Instant instant9, Instant instant10, Instant instant11, Instant instant12, Instant instant13, Float f11, Float f12, Float f13, Float f14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Float f15, Float f16, Float f17, Float f18, Float f19, Float f21, Float f22, Float f23, Float f24, Float f25, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Float f26, Float f27, Float f28, Float f29, Float f31, Float f32, Float f33, Float f34, Float f35, Float f36, Float f37, Float f38, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, Boolean bool37, Boolean bool38, Boolean bool39, Boolean bool40, Boolean bool41, Boolean bool42, Boolean bool43, Boolean bool44, Boolean bool45, Boolean bool46, Boolean bool47, Boolean bool48, okio.k unknownFields) {
        super(K0, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.timestamp = instant;
        this.tpms_last_seen_pressure_time_fl = instant2;
        this.tpms_last_seen_pressure_time_fr = instant3;
        this.tpms_last_seen_pressure_time_rl = instant4;
        this.tpms_last_seen_pressure_time_rr = instant5;
        this.tpms_last_seen_pressure_time_re1_l0 = instant6;
        this.tpms_last_seen_pressure_time_re1_l1 = instant7;
        this.tpms_last_seen_pressure_time_re1_r0 = instant8;
        this.tpms_last_seen_pressure_time_re1_r1 = instant9;
        this.tpms_last_seen_pressure_time_re2_l0 = instant10;
        this.tpms_last_seen_pressure_time_re2_l1 = instant11;
        this.tpms_last_seen_pressure_time_re2_r0 = instant12;
        this.tpms_last_seen_pressure_time_re2_r1 = instant13;
        this.tpms_pressure_fl = f11;
        this.tpms_pressure_fr = f12;
        this.tpms_pressure_rl = f13;
        this.tpms_pressure_rr = f14;
        this.tpms_hard_warning_fl = bool;
        this.tpms_hard_warning_fr = bool2;
        this.tpms_hard_warning_rl = bool3;
        this.tpms_hard_warning_rr = bool4;
        this.tpms_soft_warning_fl = bool5;
        this.tpms_soft_warning_fr = bool6;
        this.tpms_soft_warning_rl = bool7;
        this.tpms_soft_warning_rr = bool8;
        this.tpms_rcp_front_value = f15;
        this.tpms_rcp_rear_value = f16;
        this.tpms_pressure_re1_l0 = f17;
        this.tpms_pressure_re1_l1 = f18;
        this.tpms_pressure_re1_r0 = f19;
        this.tpms_pressure_re1_r1 = f21;
        this.tpms_pressure_re2_l0 = f22;
        this.tpms_pressure_re2_l1 = f23;
        this.tpms_pressure_re2_r0 = f24;
        this.tpms_pressure_re2_r1 = f25;
        this.tpms_hard_warning_re1_l0 = bool9;
        this.tpms_hard_warning_re1_l1 = bool10;
        this.tpms_hard_warning_re1_r0 = bool11;
        this.tpms_hard_warning_re1_r1 = bool12;
        this.tpms_hard_warning_re2_l0 = bool13;
        this.tpms_hard_warning_re2_l1 = bool14;
        this.tpms_hard_warning_re2_r0 = bool15;
        this.tpms_hard_warning_re2_r1 = bool16;
        this.tpms_soft_warning_re1_l0 = bool17;
        this.tpms_soft_warning_re1_l1 = bool18;
        this.tpms_soft_warning_re1_r0 = bool19;
        this.tpms_soft_warning_re1_r1 = bool20;
        this.tpms_soft_warning_re2_l0 = bool21;
        this.tpms_soft_warning_re2_l1 = bool22;
        this.tpms_soft_warning_re2_r0 = bool23;
        this.tpms_soft_warning_re2_r1 = bool24;
        this.tpms_temperature_fl = f26;
        this.tpms_temperature_fr = f27;
        this.tpms_temperature_rl = f28;
        this.tpms_temperature_rr = f29;
        this.tpms_temperature_re1_l0 = f31;
        this.tpms_temperature_re1_l1 = f32;
        this.tpms_temperature_re1_r0 = f33;
        this.tpms_temperature_re1_r1 = f34;
        this.tpms_temperature_re2_l0 = f35;
        this.tpms_temperature_re2_l1 = f36;
        this.tpms_temperature_re2_r0 = f37;
        this.tpms_temperature_re2_r1 = f38;
        this.tpms_temperature_hard_warning_fl = bool25;
        this.tpms_temperature_hard_warning_fr = bool26;
        this.tpms_temperature_hard_warning_rl = bool27;
        this.tpms_temperature_hard_warning_rr = bool28;
        this.tpms_temperature_hard_warning_re1_l0 = bool29;
        this.tpms_temperature_hard_warning_re1_l1 = bool30;
        this.tpms_temperature_hard_warning_re1_r0 = bool31;
        this.tpms_temperature_hard_warning_re1_r1 = bool32;
        this.tpms_temperature_hard_warning_re2_l0 = bool33;
        this.tpms_temperature_hard_warning_re2_l1 = bool34;
        this.tpms_temperature_hard_warning_re2_r0 = bool35;
        this.tpms_temperature_hard_warning_re2_r1 = bool36;
        this.tpms_temperature_soft_warning_fl = bool37;
        this.tpms_temperature_soft_warning_fr = bool38;
        this.tpms_temperature_soft_warning_rl = bool39;
        this.tpms_temperature_soft_warning_rr = bool40;
        this.tpms_temperature_soft_warning_re1_l0 = bool41;
        this.tpms_temperature_soft_warning_re1_l1 = bool42;
        this.tpms_temperature_soft_warning_re1_r0 = bool43;
        this.tpms_temperature_soft_warning_re1_r1 = bool44;
        this.tpms_temperature_soft_warning_re2_l0 = bool45;
        this.tpms_temperature_soft_warning_re2_l1 = bool46;
        this.tpms_temperature_soft_warning_re2_r0 = bool47;
        this.tpms_temperature_soft_warning_re2_r1 = bool48;
    }
}
