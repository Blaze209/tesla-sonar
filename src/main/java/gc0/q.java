package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import j$.time.Instant;
import java.util.ArrayList;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b|\u0018\u0000 \u0089\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\r\u0083\u0001\u007f\u0087\u0001\u008d\u0001}\u0085\u0001x\u008b\u0001Bó\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\u000b\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010'\u001a\u00020\b\u0012\b\b\u0002\u0010(\u001a\u00020\u000b\u0012\b\b\u0002\u0010)\u001a\u00020\u000b\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010,\u001a\u00020\u000b\u0012\b\b\u0002\u0010-\u001a\u00020\u0003\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\u0010\b\u0002\u00104\u001a\n\u0018\u000102j\u0004\u0018\u0001`3\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010_\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010b\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010e\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010g\u0012\b\b\u0002\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0002H\u0017¢\u0006\u0004\bm\u0010nJ\u001a\u0010q\u001a\u00020\u000b2\b\u0010p\u001a\u0004\u0018\u00010oH\u0096\u0002¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\bH\u0016¢\u0006\u0004\bs\u0010tJ\u000f\u0010v\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJù\u0007\u0010x\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u000b2\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\u0010\b\u0002\u00104\u001a\n\u0018\u000102j\u0004\u0018\u0001`32\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010_2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010b2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010e2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010g2\b\b\u0002\u0010j\u001a\u00020i¢\u0006\u0004\bx\u0010yR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bx\u0010z\u001a\u0004\b{\u0010|R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010z\u001a\u0004\b~\u0010|R\u001b\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010z\u001a\u0005\b\u0080\u0001\u0010|R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010z\u001a\u0005\b\u0082\u0001\u0010|R\u001d\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0005\b\u0084\u0001\u0010tR\u001d\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0085\u0001\u0010\u0084\u0001\u001a\u0005\b\u0086\u0001\u0010tR\u001e\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0088\u0001\u001a\u0006\b\u008c\u0001\u0010\u008a\u0001R\u001d\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u008d\u0001\u0010\u0084\u0001\u001a\u0005\b\u008e\u0001\u0010tR\u001e\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0088\u0001\u001a\u0006\b\u0090\u0001\u0010\u008a\u0001R\u001c\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010z\u001a\u0005\b\u0092\u0001\u0010|R\u001c\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010z\u001a\u0005\b\u0094\u0001\u0010|R\u001d\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0095\u0001\u0010\u0084\u0001\u001a\u0005\b\u0096\u0001\u0010tR\u001d\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u0084\u0001\u001a\u0005\b\u0098\u0001\u0010tR\u001d\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010\u0084\u0001\u001a\u0005\b\u009a\u0001\u0010tR\u001d\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u0084\u0001\u001a\u0005\b\u009c\u0001\u0010tR\u001d\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009d\u0001\u0010\u0084\u0001\u001a\u0005\b\u009e\u0001\u0010tR\u001d\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009f\u0001\u0010\u0084\u0001\u001a\u0005\b \u0001\u0010tR\u001d\u0010\u0018\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b¡\u0001\u0010\u0084\u0001\u001a\u0005\b¢\u0001\u0010tR\u001d\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b£\u0001\u0010\u0084\u0001\u001a\u0005\b¤\u0001\u0010tR\u001d\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b¥\u0001\u0010\u0084\u0001\u001a\u0005\b¦\u0001\u0010tR\u001e\u0010\u001b\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010\u0088\u0001\u001a\u0006\b\u0091\u0001\u0010\u008a\u0001R\u001e\u0010\u001c\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010\u0088\u0001\u001a\u0006\b\u0095\u0001\u0010\u008a\u0001R\u001e\u0010\u001d\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010\u0088\u0001\u001a\u0006\bª\u0001\u0010\u008a\u0001R\u001e\u0010\u001e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0088\u0001\u001a\u0006\b¬\u0001\u0010\u008a\u0001R\u001e\u0010\u001f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u0088\u0001\u001a\u0006\b®\u0001\u0010\u008a\u0001R\u001e\u0010 \u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0088\u0001\u001a\u0006\b¯\u0001\u0010\u008a\u0001R\u001e\u0010!\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010\u0088\u0001\u001a\u0006\b±\u0001\u0010\u008a\u0001R\u001e\u0010\"\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010\u0088\u0001\u001a\u0006\b\u0099\u0001\u0010\u008a\u0001R\u001e\u0010#\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010\u0088\u0001\u001a\u0006\b³\u0001\u0010\u008a\u0001R\u001e\u0010$\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010\u0088\u0001\u001a\u0006\b\u0085\u0001\u0010\u008a\u0001R\u001d\u0010%\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bz\u0010\u0088\u0001\u001a\u0006\b\u008b\u0001\u0010\u008a\u0001R\u001c\u0010&\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b{\u0010\u0084\u0001\u001a\u0005\bµ\u0001\u0010tR\u001d\u0010'\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b¶\u0001\u0010\u0084\u0001\u001a\u0005\b·\u0001\u0010tR\u001e\u0010(\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0088\u0001\u001a\u0006\b\u0081\u0001\u0010\u008a\u0001R\u001e\u0010)\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¸\u0001\u0010\u0088\u0001\u001a\u0006\b¹\u0001\u0010\u008a\u0001R\u001e\u0010+\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010º\u0001\u001a\u0006\b\u009d\u0001\u0010»\u0001R\u001e\u0010,\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010\u0088\u0001\u001a\u0006\b¡\u0001\u0010\u008a\u0001R\u001c\u0010-\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010z\u001a\u0005\b¥\u0001\u0010|R\u001e\u0010/\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b´\u0001\u0010¿\u0001R\u001f\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b~\u0010À\u0001\u001a\u0006\b£\u0001\u0010Á\u0001R&\u00104\u001a\n\u0018\u000102j\u0004\u0018\u0001`38\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R \u00106\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010Æ\u0001\u001a\u0006\b©\u0001\u0010Ç\u0001R\u001f\u00107\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\bÈ\u0001\u0010É\u0001\u001a\u0005\bz\u0010Ê\u0001R \u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010É\u0001\u001a\u0006\b½\u0001\u0010Ê\u0001R \u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010É\u0001\u001a\u0006\b\u00ad\u0001\u0010Ê\u0001R \u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010É\u0001\u001a\u0006\bÂ\u0001\u0010Ê\u0001R \u0010;\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\b¶\u0001\u0010Î\u0001R \u0010<\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010Í\u0001\u001a\u0006\bË\u0001\u0010Î\u0001R \u0010=\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R \u0010>\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b·\u0001\u0010Ð\u0001\u001a\u0006\bÓ\u0001\u0010Ò\u0001R \u0010?\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010Í\u0001\u001a\u0006\b°\u0001\u0010Î\u0001R \u0010@\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Ð\u0001\u001a\u0006\bÕ\u0001\u0010Ò\u0001R \u0010A\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÖ\u0001\u0010É\u0001\u001a\u0006\b¼\u0001\u0010Ê\u0001R \u0010B\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b×\u0001\u0010É\u0001\u001a\u0006\b¸\u0001\u0010Ê\u0001R \u0010C\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010Í\u0001\u001a\u0006\bÖ\u0001\u0010Î\u0001R \u0010D\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bØ\u0001\u0010Í\u0001\u001a\u0006\bÙ\u0001\u0010Î\u0001R \u0010E\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010Í\u0001\u001a\u0006\bÚ\u0001\u0010Î\u0001R \u0010F\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÚ\u0001\u0010Í\u0001\u001a\u0006\bÛ\u0001\u0010Î\u0001R \u0010G\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010Í\u0001\u001a\u0006\bØ\u0001\u0010Î\u0001R \u0010H\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Í\u0001\u001a\u0006\bÝ\u0001\u0010Î\u0001R \u0010I\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010Í\u0001\u001a\u0006\bÜ\u0001\u0010Î\u0001R \u0010J\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Í\u0001\u001a\u0006\bÞ\u0001\u0010Î\u0001R \u0010K\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010Í\u0001\u001a\u0006\bß\u0001\u0010Î\u0001R \u0010L\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Ð\u0001\u001a\u0006\b\u008f\u0001\u0010Ò\u0001R \u0010M\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010Ð\u0001\u001a\u0006\b\u0093\u0001\u0010Ò\u0001R \u0010N\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ð\u0001\u001a\u0006\bà\u0001\u0010Ò\u0001R \u0010O\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010Ð\u0001\u001a\u0006\bá\u0001\u0010Ò\u0001R \u0010P\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bß\u0001\u0010Ð\u0001\u001a\u0006\bâ\u0001\u0010Ò\u0001R \u0010Q\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¦\u0001\u0010Ð\u0001\u001a\u0006\bã\u0001\u0010Ò\u0001R \u0010R\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bä\u0001\u0010Ð\u0001\u001a\u0006\bÈ\u0001\u0010Ò\u0001R \u0010S\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÞ\u0001\u0010Ð\u0001\u001a\u0006\b\u0097\u0001\u0010Ò\u0001R \u0010T\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010Ð\u0001\u001a\u0006\bå\u0001\u0010Ò\u0001R \u0010U\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bâ\u0001\u0010Ð\u0001\u001a\u0006\b\u0083\u0001\u0010Ò\u0001R \u0010V\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010Ð\u0001\u001a\u0006\b\u0087\u0001\u0010Ò\u0001R \u0010W\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bæ\u0001\u0010Í\u0001\u001a\u0006\bÌ\u0001\u0010Î\u0001R \u0010X\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010Í\u0001\u001a\u0006\bÏ\u0001\u0010Î\u0001R \u0010Y\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010Í\u0001\u001a\u0006\b\u0088\u0001\u0010Î\u0001R \u0010Z\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bç\u0001\u0010Í\u0001\u001a\u0006\bÔ\u0001\u0010Î\u0001R\u001f\u0010[\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000f\n\u0006\b¹\u0001\u0010Ð\u0001\u001a\u0005\b\u007f\u0010Ò\u0001R \u0010\\\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Ð\u0001\u001a\u0006\bç\u0001\u0010Ò\u0001R \u0010]\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bá\u0001\u0010º\u0001\u001a\u0006\b\u009b\u0001\u0010»\u0001R \u0010^\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010Ð\u0001\u001a\u0006\b\u009f\u0001\u0010Ò\u0001R \u0010`\u001a\u0004\u0018\u00010_8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bå\u0001\u0010è\u0001\u001a\u0006\b§\u0001\u0010é\u0001R \u0010a\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b³\u0001\u0010Ð\u0001\u001a\u0006\b\u008d\u0001\u0010Ò\u0001R \u0010c\u001a\u0004\u0018\u00010b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010ê\u0001\u001a\u0006\bæ\u0001\u0010ë\u0001R \u0010d\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010¾\u0001\u001a\u0006\b²\u0001\u0010¿\u0001R \u0010f\u001a\u0004\u0018\u00010e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÑ\u0001\u0010ì\u0001\u001a\u0006\b¨\u0001\u0010í\u0001R \u0010h\u001a\u0004\u0018\u00010g8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\b«\u0001\u0010ð\u0001¨\u0006ñ\u0001"}, d2 = {"Lgc0/q;", "Lcom/squareup/wire/f;", "", "", "inside_temp_celsius_OBSOLETE", "outside_temp_celsius_OBSOLETE", "driver_temp_setting_OBSOLETE", "passenger_temp_setting_OBSOLETE", "", "left_temp_direction_OBSOLETE", "right_temp_direction_OBSOLETE", "", "is_front_defroster_on_OBSOLETE", "is_rear_defroster_on_OBSOLETE", "fan_status_OBSOLETE", "is_climate_on_OBSOLETE", "min_avail_temp_celsius_OBSOLETE", "max_avail_temp_celsius_OBSOLETE", "seat_heater_left_OBSOLETE", "seat_heater_right_OBSOLETE", "seat_heater_rear_left_OBSOLETE", "seat_heater_rear_right_OBSOLETE", "seat_heater_rear_center_OBSOLETE", "seat_heater_rear_right_back_OBSOLETE", "seat_heater_rear_left_back_OBSOLETE", "seat_heater_third_row_right_OBSOLETE", "seat_heater_third_row_left_OBSOLETE", "battery_heater_OBSOLETE", "battery_heater_no_power_OBSOLETE", "steering_wheel_heater_OBSOLETE", "wiper_blade_heater_OBSOLETE", "side_mirror_heaters_OBSOLETE", "is_preconditioning_OBSOLETE", "remote_heater_control_enabled_OBSOLETE", "bioweapon_mode_on_OBSOLETE", "is_auto_conditioning_on_OBSOLETE", "auto_seat_climate_left_OBSOLETE", "auto_seat_climate_right_OBSOLETE", "seat_fan_front_left_OBSOLETE", "seat_fan_front_right_OBSOLETE", "allow_cabin_overheat_protection_OBSOLETE", "supports_fan_only_cabin_overheat_protection_OBSOLETE", "Lgc0/q$b;", "cabin_overheat_protection_OBSOLETE", "cabin_overheat_protection_actively_cooling_OBSOLETE", "cop_activation_temp_OBSOLETE", "Lgc0/q$i;", "hvac_auto_request_OBSOLETE", "Lgc0/q$c;", "climate_keeper_mode", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lgc0/q$g;", "defrost_mode", "inside_temp_celsius", "outside_temp_celsius", "driver_temp_setting", "passenger_temp_setting", "left_temp_direction", "right_temp_direction", "is_front_defroster_on", "is_rear_defroster_on", "fan_status", "is_climate_on", "min_avail_temp_celsius", "max_avail_temp_celsius", "seat_heater_left", "seat_heater_right", "seat_heater_rear_left", "seat_heater_rear_right", "seat_heater_rear_center", "seat_heater_rear_right_back", "seat_heater_rear_left_back", "seat_heater_third_row_right", "seat_heater_third_row_left", "battery_heater", "battery_heater_no_power", "steering_wheel_heater", "wiper_blade_heater", "side_mirror_heaters", "is_preconditioning", "remote_heater_control_enabled", "bioweapon_mode_on", "is_auto_conditioning_on", "auto_seat_climate_left", "auto_seat_climate_right", "seat_fan_front_left", "seat_fan_front_right", "seat_fan_second_row_left", "seat_fan_second_row_right", "allow_cabin_overheat_protection", "supports_fan_only_cabin_overheat_protection", "cabin_overheat_protection", "cabin_overheat_protection_actively_cooling", "Lgc0/q$f;", "cop_activation_temperature", "auto_steering_wheel_heat", "Lec0/a0;", "steering_wheel_heat_level", "hvac_auto_request", "Lgc0/q$a;", "cop_not_running_reason", "Lgc0/q$h;", "dog_mode_state", "Lokio/k;", "unknownFields", "<init>", "(FFFFIIZZIZFFIIIIIIIIIZZZZZZZZZZZIIZZLgc0/q$b;ZFLgc0/q$i;Lgc0/q$c;Lj$/time/Instant;Lgc0/q$g;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lgc0/q$b;Ljava/lang/Boolean;Lgc0/q$f;Ljava/lang/Boolean;Lec0/a0;Lgc0/q$i;Lgc0/q$a;Lgc0/q$h;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(FFFFIIZZIZFFIIIIIIIIIZZZZZZZZZZZIIZZLgc0/q$b;ZFLgc0/q$i;Lgc0/q$c;Lj$/time/Instant;Lgc0/q$g;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lgc0/q$b;Ljava/lang/Boolean;Lgc0/q$f;Ljava/lang/Boolean;Lec0/a0;Lgc0/q$i;Lgc0/q$a;Lgc0/q$h;Lokio/k;)Lgc0/q;", Gender.FEMALE, "G", "()F", "b", Gender.OTHER, "c", "A", DateTokenConverter.CONVERTER_KEY, "Q", "e", "I", "f", Gender.UNKNOWN, "g", "Z", "L0", "()Z", "h", "P0", IntegerTokenConverter.CONVERTER_KEY, "C", "j", "I0", "k", Gender.MALE, "l", "K", "m", "d0", "n", "p0", "o", "h0", "p", "l0", "q", "f0", "r", "n0", "s", "j0", "t", "u0", "u", "r0", "v", "w", "x", "z0", "y", "E0", "z", "w0", "N0", "B", "S", "D", "G0", "E", "W", "H", "Y", "J", "B0", "Lgc0/q$b;", "()Lgc0/q$b;", "L", Gender.NONE, "Lgc0/q$i;", "()Lgc0/q$i;", "Lgc0/q$c;", "()Lgc0/q$c;", "P", "Lj$/time/Instant;", "C0", "()Lj$/time/Instant;", "Lgc0/q$g;", "()Lgc0/q$g;", "R", "Ljava/lang/Float;", "()Ljava/lang/Float;", "T", "V", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "X", "Ljava/lang/Boolean;", "J0", "()Ljava/lang/Boolean;", "O0", "a0", "H0", "b0", "c0", "e0", "o0", "g0", "k0", "i0", "m0", "t0", "q0", "y0", "D0", "v0", "M0", "s0", "F0", "x0", "A0", "Lgc0/q$f;", "()Lgc0/q$f;", "Lec0/a0;", "()Lec0/a0;", "Lgc0/q$a;", "()Lgc0/q$a;", "K0", "Lgc0/q$h;", "()Lgc0/q$h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends com.squareup.wire.f {
    public static final ProtoAdapter<q> M0 = new d(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(q.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPreconditioningOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 28)
    private final boolean is_preconditioning_OBSOLETE;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanSecondRowRight", tag = 153)
    private final Integer seat_fan_second_row_right;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteHeaterControlEnabledOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 29)
    private final boolean remote_heater_control_enabled_OBSOLETE;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowCabinOverheatProtection", tag = 141)
    private final Boolean allow_cabin_overheat_protection;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "bioweaponModeOnOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 34)
    private final boolean bioweapon_mode_on_OBSOLETE;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsFanOnlyCabinOverheatProtection", tag = 142)
    private final Boolean supports_fan_only_cabin_overheat_protection;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAutoConditioningOnOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 36)
    private final boolean is_auto_conditioning_on_OBSOLETE;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$CabinOverheatProtection_E#ADAPTER", jsonName = "cabinOverheatProtection", tag = 143)
    private final b cabin_overheat_protection;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSeatClimateLeftOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 37)
    private final boolean auto_seat_climate_left_OBSOLETE;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cabinOverheatProtectionActivelyCooling", tag = 144)
    private final Boolean cabin_overheat_protection_actively_cooling;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSeatClimateRightOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 38)
    private final boolean auto_seat_climate_right_OBSOLETE;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$CopActivationTemp#ADAPTER", jsonName = "copActivationTemperature", tag = 146)
    private final f cop_activation_temperature;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanFrontLeftOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 39)
    private final int seat_fan_front_left_OBSOLETE;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSteeringWheelHeat", tag = 147)
    private final Boolean auto_steering_wheel_heat;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanFrontRightOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 40)
    private final int seat_fan_front_right_OBSOLETE;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.StwHeatLevel#ADAPTER", jsonName = "steeringWheelHeatLevel", tag = 148)
    private final ec0.a0 steering_wheel_heat_level;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowCabinOverheatProtectionOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 41)
    private final boolean allow_cabin_overheat_protection_OBSOLETE;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$HvacAutoRequest#ADAPTER", jsonName = "hvacAutoRequest", tag = 150)
    private final i hvac_auto_request;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "supportsFanOnlyCabinOverheatProtectionOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 42)
    private final boolean supports_fan_only_cabin_overheat_protection_OBSOLETE;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$COPNotRunningReason#ADAPTER", jsonName = "copNotRunningReason", tag = 151)
    private final a cop_not_running_reason;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$CabinOverheatProtection_E#ADAPTER", jsonName = "cabinOverheatProtectionOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 43)
    private final b cabin_overheat_protection_OBSOLETE;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$DogModeState#ADAPTER", jsonName = "dogModeState", tag = 154)
    private final h dog_mode_state;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "cabinOverheatProtectionActivelyCoolingOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 44)
    private final boolean cabin_overheat_protection_actively_cooling_OBSOLETE;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "copActivationTempOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 45)
    private final float cop_activation_temp_OBSOLETE;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$HvacAutoRequest#ADAPTER", jsonName = "hvacAutoRequestOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 50)
    private final i hvac_auto_request_OBSOLETE;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$ClimateKeeperMode#ADAPTER", jsonName = "climateKeeperMode", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 30)
    private final c climate_keeper_mode;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 33)
    private final Instant timestamp;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ClimateState$DefrostMode#ADAPTER", jsonName = "defrostMode", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 35)
    private final g defrost_mode;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "insideTempCelsius", tag = 101)
    private final Float inside_temp_celsius;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "outsideTempCelsius", tag = 102)
    private final Float outside_temp_celsius;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "driverTempSetting", tag = 103)
    private final Float driver_temp_setting;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "passengerTempSetting", tag = 104)
    private final Float passenger_temp_setting;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "leftTempDirection", tag = 105)
    private final Integer left_temp_direction;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "rightTempDirection", tag = 106)
    private final Integer right_temp_direction;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFrontDefrosterOn", tag = 107)
    private final Boolean is_front_defroster_on;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRearDefrosterOn", tag = 108)
    private final Boolean is_rear_defroster_on;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fanStatus", tag = 109)
    private final Integer fan_status;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "insideTempCelsiusOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final float inside_temp_celsius_OBSOLETE;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isClimateOn", tag = 110)
    private final Boolean is_climate_on;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "outsideTempCelsiusOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final float outside_temp_celsius_OBSOLETE;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minAvailTempCelsius", tag = 111)
    private final Float min_avail_temp_celsius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "driverTempSettingOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final float driver_temp_setting_OBSOLETE;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxAvailTempCelsius", tag = 112)
    private final Float max_avail_temp_celsius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "passengerTempSettingOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final float passenger_temp_setting_OBSOLETE;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterLeft", tag = 113)
    private final Integer seat_heater_left;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "leftTempDirectionOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int left_temp_direction_OBSOLETE;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRight", tag = 114)
    private final Integer seat_heater_right;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "rightTempDirectionOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int right_temp_direction_OBSOLETE;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearLeft", tag = 115)
    private final Integer seat_heater_rear_left;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isFrontDefrosterOnOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final boolean is_front_defroster_on_OBSOLETE;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearRight", tag = 116)
    private final Integer seat_heater_rear_right;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isRearDefrosterOnOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final boolean is_rear_defroster_on_OBSOLETE;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearCenter", tag = 117)
    private final Integer seat_heater_rear_center;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "fanStatusOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final int fan_status_OBSOLETE;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearRightBack", tag = 118)
    private final Integer seat_heater_rear_right_back;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isClimateOnOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final boolean is_climate_on_OBSOLETE;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearLeftBack", tag = 119)
    private final Integer seat_heater_rear_left_back;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minAvailTempCelsiusOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final float min_avail_temp_celsius_OBSOLETE;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterThirdRowRight", tag = 120)
    private final Integer seat_heater_third_row_right;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxAvailTempCelsiusOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final float max_avail_temp_celsius_OBSOLETE;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterThirdRowLeft", tag = 121)
    private final Integer seat_heater_third_row_left;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterLeftOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final int seat_heater_left_OBSOLETE;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "batteryHeater", tag = 122)
    private final Boolean battery_heater;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRightOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final int seat_heater_right_OBSOLETE;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "batteryHeaterNoPower", tag = 123)
    private final Boolean battery_heater_no_power;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearLeftOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final int seat_heater_rear_left_OBSOLETE;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "steeringWheelHeater", tag = 125)
    private final Boolean steering_wheel_heater;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearRightOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 16)
    private final int seat_heater_rear_right_OBSOLETE;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "wiperBladeHeater", tag = 126)
    private final Boolean wiper_blade_heater;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearCenterOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 17)
    private final int seat_heater_rear_center_OBSOLETE;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sideMirrorHeaters", tag = 127)
    private final Boolean side_mirror_heaters;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearRightBackOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 18)
    private final int seat_heater_rear_right_back_OBSOLETE;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isPreconditioning", tag = 128)
    private final Boolean is_preconditioning;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterRearLeftBackOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final int seat_heater_rear_left_back_OBSOLETE;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteHeaterControlEnabled", tag = EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE)
    private final Boolean remote_heater_control_enabled;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterThirdRowRightOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 20)
    private final int seat_heater_third_row_right_OBSOLETE;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "bioweaponModeOn", tag = 134)
    private final Boolean bioweapon_mode_on;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatHeaterThirdRowLeftOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 21)
    private final int seat_heater_third_row_left_OBSOLETE;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isAutoConditioningOn", tag = 136)
    private final Boolean is_auto_conditioning_on;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "batteryHeaterOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 22)
    private final boolean battery_heater_OBSOLETE;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSeatClimateLeft", tag = 137)
    private final Boolean auto_seat_climate_left;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "batteryHeaterNoPowerOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 23)
    private final boolean battery_heater_no_power_OBSOLETE;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "autoSeatClimateRight", tag = 138)
    private final Boolean auto_seat_climate_right;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "steeringWheelHeaterOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 25)
    private final boolean steering_wheel_heater_OBSOLETE;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanFrontLeft", tag = 139)
    private final Integer seat_fan_front_left;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "wiperBladeHeaterOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 26)
    private final boolean wiper_blade_heater_OBSOLETE;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanFrontRight", tag = 140)
    private final Integer seat_fan_front_right;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "sideMirrorHeatersOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 27)
    private final boolean side_mirror_heaters_OBSOLETE;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "seatFanSecondRowLeft", tag = 152)
    private final Integer seat_fan_second_row_left;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.q$a, still in use, count: 1, list:
      (r0v0 gc0.q$a) from 0x0064: CONSTRUCTOR 
      (wrap co0.d:0x005c: INVOKE (wrap java.lang.Class:0x005a: CONST_CLASS  A[WRAPPED] (LINE:91) gc0.q$a.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:93))
      (wrap com.squareup.wire.o:0x0060: SGET  A[WRAPPED] (LINE:97) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 gc0.q$a)
     A[MD:(co0.d<gc0.q$a>, com.squareup.wire.o, gc0.q$a):void (m), WRAPPED] (LINE:101) call: gc0.q.a.a.<init>(co0.d, com.squareup.wire.o, gc0.q$a):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lgc0/q$a;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "COPNotRunningReasonNoReason", "COPNotRunningReasonUserInteraction", "COPNotRunningReasonEnergyConsumptionReached", "COPNotRunningReasonTimeout", "COPNotRunningReasonLowSolarLoad", "COPNotRunningReasonFault", "COPNotRunningReasonCabinBelowThreshold", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements com.squareup.wire.p {
        COPNotRunningReasonNoReason(0),
        COPNotRunningReasonUserInteraction(1),
        COPNotRunningReasonEnergyConsumptionReached(2),
        COPNotRunningReasonTimeout(3),
        COPNotRunningReasonLowSolarLoad(4),
        COPNotRunningReasonFault(5),
        COPNotRunningReasonCabinBelowThreshold(6);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<a> ADAPTER = new C1399a(p013kotlin.jvm.internal.o0.b(a.class), com.squareup.wire.o.PROTO_3, new a(0));

        /* JADX INFO: renamed from: gc0.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"gc0/q$a$a", "Lcom/squareup/wire/a;", "Lgc0/q$a;", "", "value", "f", "(I)Lgc0/q$a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1399a extends com.squareup.wire.a<a> {
            C1399a(co0.d<a> dVar, com.squareup.wire.o oVar, a aVar) {
                super(dVar, oVar, aVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public a d(int value) {
                return a.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: gc0.q$a$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/q$a$b;", "", "<init>", "()V", "", "value", "Lgc0/q$a;", "a", "(I)Lgc0/q$a;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(int value) {
                switch (value) {
                    case 0:
                        return a.COPNotRunningReasonNoReason;
                    case 1:
                        return a.COPNotRunningReasonUserInteraction;
                    case 2:
                        return a.COPNotRunningReasonEnergyConsumptionReached;
                    case 3:
                        return a.COPNotRunningReasonTimeout;
                    case 4:
                        return a.COPNotRunningReasonLowSolarLoad;
                    case 5:
                        return a.COPNotRunningReasonFault;
                    case 6:
                        return a.COPNotRunningReasonCabinBelowThreshold;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }

        static {
        }

        private a(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final a fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.q$b, still in use, count: 1, list:
      (r0v0 gc0.q$b) from 0x003c: CONSTRUCTOR 
      (wrap co0.d:0x0034: INVOKE (wrap java.lang.Class:0x0032: CONST_CLASS  A[WRAPPED] (LINE:51) gc0.q$b.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:53))
      (wrap com.squareup.wire.o:0x0038: SGET  A[WRAPPED] (LINE:57) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 gc0.q$b)
     A[MD:(co0.d<gc0.q$b>, com.squareup.wire.o, gc0.q$b):void (m), WRAPPED] (LINE:61) call: gc0.q.b.a.<init>(co0.d, com.squareup.wire.o, gc0.q$b):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lgc0/q$b;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "CabinOverheatProtectionOff", "CabinOverheatProtectionOn", "CabinOverheatProtectionFanOnly", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements com.squareup.wire.p {
        CabinOverheatProtectionOff(0),
        CabinOverheatProtectionOn(1),
        CabinOverheatProtectionFanOnly(2);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<b> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(b.class), com.squareup.wire.o.PROTO_3, new b(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"gc0/q$b$a", "Lcom/squareup/wire/a;", "Lgc0/q$b;", "", "value", "f", "(I)Lgc0/q$b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<b> {
            a(co0.d<b> dVar, com.squareup.wire.o oVar, b bVar) {
                super(dVar, oVar, bVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public b d(int value) {
                return b.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: gc0.q$b$b, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/q$b$b;", "", "<init>", "()V", "", "value", "Lgc0/q$b;", "a", "(I)Lgc0/q$b;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(int value) {
                if (value == 0) {
                    return b.CabinOverheatProtectionOff;
                }
                if (value == 1) {
                    return b.CabinOverheatProtectionOn;
                }
                if (value != 2) {
                    return null;
                }
                return b.CabinOverheatProtectionFanOnly;
            }

            private Companion() {
            }
        }

        static {
        }

        private b(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final b fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b\"\u0010\u001e¨\u0006#"}, d2 = {"Lgc0/q$c;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Unknown", "Off", "On", "Dog", "Party", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/q$c;", "Lec0/h0;", "f", "()Lec0/h0;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends com.squareup.wire.f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final ProtoAdapter<c> f68367g = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(c.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Unknown;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 Off;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
        private final ec0.h0 On;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
        private final ec0.h0 Dog;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
        private final ec0.h0 Party;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/q$c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/q$c;", "value", "", "c", "(Lgc0/q$c;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/q$c;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/q$c;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/q$c;)Lgc0/q$c;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<c> {
            a(com.squareup.wire.b bVar, co0.d<c> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClimateState.ClimateKeeperMode", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                ec0.h0 h0VarDecode4 = null;
                ec0.h0 h0VarDecode5 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new c(h0VarDecode, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, reader.e(jD));
                    }
                    if (iG == 1) {
                        h0VarDecode = ec0.h0.f62622b.decode(reader);
                    } else if (iG == 2) {
                        h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                    } else if (iG == 3) {
                        h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                    } else if (iG == 4) {
                        h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                    } else if (iG != 5) {
                        reader.m(iG);
                    } else {
                        h0VarDecode5 = ec0.h0.f62622b.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, c value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getUnknown());
                protoAdapter.encodeWithTag(writer, 2, value.getOff());
                protoAdapter.encodeWithTag(writer, 3, value.getOn());
                protoAdapter.encodeWithTag(writer, 4, value.getDog());
                protoAdapter.encodeWithTag(writer, 5, value.getParty());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getUnknown()) + protoAdapter.encodedSizeWithTag(2, value.getOff()) + protoAdapter.encodedSizeWithTag(3, value.getOn()) + protoAdapter.encodedSizeWithTag(4, value.getDog()) + protoAdapter.encodedSizeWithTag(5, value.getParty());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public c redact(c value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 unknown = value.getUnknown();
                ec0.h0 h0VarRedact = unknown != null ? ec0.h0.f62622b.redact(unknown) : null;
                ec0.h0 off = value.getOff();
                ec0.h0 h0VarRedact2 = off != null ? ec0.h0.f62622b.redact(off) : null;
                ec0.h0 on2 = value.getOn();
                ec0.h0 h0VarRedact3 = on2 != null ? ec0.h0.f62622b.redact(on2) : null;
                ec0.h0 dog = value.getDog();
                ec0.h0 h0VarRedact4 = dog != null ? ec0.h0.f62622b.redact(dog) : null;
                ec0.h0 party = value.getParty();
                return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, party != null ? ec0.h0.f62622b.redact(party) : null, okio.k.f97943e);
            }
        }

        public c() {
            this(null, null, null, null, null, null, 63, null);
        }

        public final c a(ec0.h0 Unknown, ec0.h0 Off, ec0.h0 On, ec0.h0 Dog, ec0.h0 Party, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new c(Unknown, Off, On, Dog, Party, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getDog() {
            return this.Dog;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getOff() {
            return this.Off;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getOn() {
            return this.On;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ec0.h0 getParty() {
            return this.Party;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), cVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Unknown, cVar.Unknown) && p013kotlin.jvm.internal.s.f(this.Off, cVar.Off) && p013kotlin.jvm.internal.s.f(this.On, cVar.On) && p013kotlin.jvm.internal.s.f(this.Dog, cVar.Dog) && p013kotlin.jvm.internal.s.f(this.Party, cVar.Party);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ec0.h0 getUnknown() {
            return this.Unknown;
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Unknown;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.Off;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.On;
            int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
            ec0.h0 h0Var4 = this.Dog;
            int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
            ec0.h0 h0Var5 = this.Party;
            int iHashCode6 = iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0);
            this.hashCode = iHashCode6;
            return iHashCode6;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m429newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Unknown;
            if (h0Var != null) {
                arrayList.add("Unknown=" + h0Var);
            }
            ec0.h0 h0Var2 = this.Off;
            if (h0Var2 != null) {
                arrayList.add("Off=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.On;
            if (h0Var3 != null) {
                arrayList.add("On=" + h0Var3);
            }
            ec0.h0 h0Var4 = this.Dog;
            if (h0Var4 != null) {
                arrayList.add("Dog=" + h0Var4);
            }
            ec0.h0 h0Var5 = this.Party;
            if (h0Var5 != null) {
                arrayList.add("Party=" + h0Var5);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "ClimateKeeperMode{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m429newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, okio.k unknownFields) {
            super(f68367g, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Unknown = h0Var;
            this.Off = h0Var2;
            this.On = h0Var3;
            this.Dog = h0Var4;
            this.Party = h0Var5;
            if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5) > 1) {
                throw new IllegalArgumentException("At most one of Unknown, Off, On, Dog, Party may be non-null");
            }
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/q$d", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/q;", "value", "", "c", "(Lgc0/q;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/q;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/q;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/q;)Lgc0/q;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends ProtoAdapter<q> {
        d(com.squareup.wire.b bVar, co0.d<q> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.ClimateState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public q decode(com.squareup.wire.k reader) {
            b bVarDecode;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            b bVar = b.CabinOverheatProtectionOff;
            i iVar = i.HvacAutoRequestOn;
            long jD = reader.d();
            b bVar2 = bVar;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            boolean z12 = false;
            int i13 = 0;
            boolean z13 = false;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            int i24 = 0;
            int i25 = 0;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            c cVar = null;
            Instant instant = null;
            g gVar = null;
            Float f17 = null;
            Float f18 = null;
            Float f19 = null;
            Float f21 = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num3 = null;
            Boolean bool3 = null;
            Float f22 = null;
            Float f23 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            Integer num10 = null;
            Integer num11 = null;
            Integer num12 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Integer num13 = null;
            Integer num14 = null;
            Integer num15 = null;
            Integer num16 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            b bVarDecode2 = null;
            Boolean bool17 = null;
            f fVarDecode = null;
            Boolean bool18 = null;
            ec0.a0 a0VarDecode = null;
            i iVarDecode = null;
            a aVarDecode = null;
            h hVarDecode = null;
            i iVarDecode2 = iVar;
            float f24 = 0.0f;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new q(f24, f11, f12, f13, i11, i12, z11, z12, i13, z13, f14, f15, i14, i15, i16, i17, i18, i19, i21, i22, i23, z14, z15, z16, z17, z18, z19, z21, z22, z23, z24, z25, i24, i25, z26, z27, bVar2, z28, f16, iVarDecode2, cVar, instant, gVar, f17, f18, f19, f21, num, num2, bool, bool2, num3, bool3, f22, f23, num4, num5, num6, num7, num8, num9, num10, num11, num12, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, num13, num14, num15, num16, bool15, bool16, bVarDecode2, bool17, fVarDecode, bool18, a0VarDecode, iVarDecode, aVarDecode, hVarDecode, reader.e(jD));
                }
                if (iG == 50) {
                    i iVar2 = iVarDecode2;
                    cVar = cVar;
                    f24 = f24;
                    try {
                        iVarDecode2 = i.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        iVarDecode2 = iVar2;
                    }
                    jn0.h0 h0Var = jn0.h0.f84049a;
                } else if (iG != 134) {
                    switch (iG) {
                        case 1:
                            float fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            jn0.h0 h0Var2 = jn0.h0.f84049a;
                            f24 = fFloatValue;
                            continue;
                        case 2:
                            float fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            jn0.h0 h0Var3 = jn0.h0.f84049a;
                            f11 = fFloatValue2;
                            continue;
                        case 3:
                            float fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            jn0.h0 h0Var4 = jn0.h0.f84049a;
                            f12 = fFloatValue3;
                            continue;
                        case 4:
                            float fFloatValue4 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            jn0.h0 h0Var5 = jn0.h0.f84049a;
                            f13 = fFloatValue4;
                            continue;
                        case 5:
                            int iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var6 = jn0.h0.f84049a;
                            i11 = iIntValue;
                            continue;
                        case 6:
                            int iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var7 = jn0.h0.f84049a;
                            i12 = iIntValue2;
                            continue;
                        case 7:
                            boolean zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            jn0.h0 h0Var8 = jn0.h0.f84049a;
                            z11 = zBooleanValue;
                            continue;
                        case 8:
                            boolean zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            jn0.h0 h0Var9 = jn0.h0.f84049a;
                            z12 = zBooleanValue2;
                            continue;
                        case 9:
                            int iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var10 = jn0.h0.f84049a;
                            i13 = iIntValue3;
                            continue;
                        case 10:
                            boolean zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            jn0.h0 h0Var11 = jn0.h0.f84049a;
                            z13 = zBooleanValue3;
                            continue;
                        case 11:
                            float fFloatValue5 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            jn0.h0 h0Var12 = jn0.h0.f84049a;
                            f14 = fFloatValue5;
                            continue;
                        case 12:
                            float fFloatValue6 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                            jn0.h0 h0Var13 = jn0.h0.f84049a;
                            f15 = fFloatValue6;
                            continue;
                        case 13:
                            int iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var14 = jn0.h0.f84049a;
                            i14 = iIntValue4;
                            continue;
                        case 14:
                            int iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var15 = jn0.h0.f84049a;
                            i15 = iIntValue5;
                            continue;
                        case 15:
                            int iIntValue6 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var16 = jn0.h0.f84049a;
                            i16 = iIntValue6;
                            continue;
                        case 16:
                            int iIntValue7 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var17 = jn0.h0.f84049a;
                            i17 = iIntValue7;
                            continue;
                        case 17:
                            int iIntValue8 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var18 = jn0.h0.f84049a;
                            i18 = iIntValue8;
                            continue;
                        case 18:
                            int iIntValue9 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var19 = jn0.h0.f84049a;
                            i19 = iIntValue9;
                            continue;
                        case 19:
                            int iIntValue10 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var20 = jn0.h0.f84049a;
                            i21 = iIntValue10;
                            continue;
                        case 20:
                            int iIntValue11 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var21 = jn0.h0.f84049a;
                            i22 = iIntValue11;
                            continue;
                        case 21:
                            int iIntValue12 = ProtoAdapter.INT32.decode(reader).intValue();
                            jn0.h0 h0Var22 = jn0.h0.f84049a;
                            i23 = iIntValue12;
                            continue;
                        case 22:
                            boolean zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            jn0.h0 h0Var23 = jn0.h0.f84049a;
                            z14 = zBooleanValue4;
                            continue;
                        case 23:
                            boolean zBooleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            jn0.h0 h0Var24 = jn0.h0.f84049a;
                            z15 = zBooleanValue5;
                            continue;
                        default:
                            switch (iG) {
                                case 25:
                                    boolean zBooleanValue6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    jn0.h0 h0Var25 = jn0.h0.f84049a;
                                    z16 = zBooleanValue6;
                                    continue;
                                case 26:
                                    boolean zBooleanValue7 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    jn0.h0 h0Var26 = jn0.h0.f84049a;
                                    z17 = zBooleanValue7;
                                    continue;
                                case 27:
                                    boolean zBooleanValue8 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    jn0.h0 h0Var27 = jn0.h0.f84049a;
                                    z18 = zBooleanValue8;
                                    continue;
                                case 28:
                                    boolean zBooleanValue9 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    jn0.h0 h0Var28 = jn0.h0.f84049a;
                                    z19 = zBooleanValue9;
                                    continue;
                                case 29:
                                    boolean zBooleanValue10 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    jn0.h0 h0Var29 = jn0.h0.f84049a;
                                    z21 = zBooleanValue10;
                                    continue;
                                case 30:
                                    c cVarDecode = c.f68367g.decode(reader);
                                    jn0.h0 h0Var30 = jn0.h0.f84049a;
                                    cVar = cVarDecode;
                                    continue;
                                default:
                                    switch (iG) {
                                        case 33:
                                            Instant instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                            jn0.h0 h0Var31 = jn0.h0.f84049a;
                                            instant = instantDecode;
                                            continue;
                                        case 34:
                                            boolean zBooleanValue11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            jn0.h0 h0Var32 = jn0.h0.f84049a;
                                            z22 = zBooleanValue11;
                                            continue;
                                        case 35:
                                            g gVarDecode = g.f68374e.decode(reader);
                                            jn0.h0 h0Var33 = jn0.h0.f84049a;
                                            gVar = gVarDecode;
                                            continue;
                                        case 36:
                                            boolean zBooleanValue12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            jn0.h0 h0Var34 = jn0.h0.f84049a;
                                            z23 = zBooleanValue12;
                                            continue;
                                        case 37:
                                            boolean zBooleanValue13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            jn0.h0 h0Var35 = jn0.h0.f84049a;
                                            z24 = zBooleanValue13;
                                            continue;
                                        case 38:
                                            boolean zBooleanValue14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            jn0.h0 h0Var36 = jn0.h0.f84049a;
                                            z25 = zBooleanValue14;
                                            continue;
                                        case 39:
                                            int iIntValue13 = ProtoAdapter.INT32.decode(reader).intValue();
                                            jn0.h0 h0Var37 = jn0.h0.f84049a;
                                            i24 = iIntValue13;
                                            continue;
                                        case 40:
                                            int iIntValue14 = ProtoAdapter.INT32.decode(reader).intValue();
                                            jn0.h0 h0Var38 = jn0.h0.f84049a;
                                            i25 = iIntValue14;
                                            continue;
                                        case 41:
                                            boolean zBooleanValue15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            jn0.h0 h0Var39 = jn0.h0.f84049a;
                                            z26 = zBooleanValue15;
                                            continue;
                                        case 42:
                                            boolean zBooleanValue16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            jn0.h0 h0Var40 = jn0.h0.f84049a;
                                            z27 = zBooleanValue16;
                                            continue;
                                        case 43:
                                            iVarDecode2 = iVarDecode2;
                                            cVar = cVar;
                                            f24 = f24;
                                            try {
                                                bVarDecode = b.ADAPTER.decode(reader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                                                bVarDecode = bVar2;
                                            }
                                            jn0.h0 h0Var41 = jn0.h0.f84049a;
                                            bVar2 = bVarDecode;
                                            break;
                                        case 44:
                                            boolean zBooleanValue17 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                            jn0.h0 h0Var42 = jn0.h0.f84049a;
                                            z28 = zBooleanValue17;
                                            continue;
                                        case 45:
                                            float fFloatValue7 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                                            jn0.h0 h0Var43 = jn0.h0.f84049a;
                                            f16 = fFloatValue7;
                                            continue;
                                        default:
                                            switch (iG) {
                                                case 101:
                                                    Float fDecode = ProtoAdapter.FLOAT.decode(reader);
                                                    jn0.h0 h0Var44 = jn0.h0.f84049a;
                                                    f17 = fDecode;
                                                    continue;
                                                case 102:
                                                    Float fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                                                    jn0.h0 h0Var45 = jn0.h0.f84049a;
                                                    f18 = fDecode2;
                                                    continue;
                                                case 103:
                                                    Float fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                                                    jn0.h0 h0Var46 = jn0.h0.f84049a;
                                                    f19 = fDecode3;
                                                    continue;
                                                case 104:
                                                    Float fDecode4 = ProtoAdapter.FLOAT.decode(reader);
                                                    jn0.h0 h0Var47 = jn0.h0.f84049a;
                                                    f21 = fDecode4;
                                                    continue;
                                                case 105:
                                                    Integer numDecode = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var48 = jn0.h0.f84049a;
                                                    num = numDecode;
                                                    continue;
                                                case 106:
                                                    Integer numDecode2 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var49 = jn0.h0.f84049a;
                                                    num2 = numDecode2;
                                                    continue;
                                                case 107:
                                                    Boolean boolDecode = ProtoAdapter.BOOL.decode(reader);
                                                    jn0.h0 h0Var50 = jn0.h0.f84049a;
                                                    bool = boolDecode;
                                                    continue;
                                                case 108:
                                                    Boolean boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                                                    jn0.h0 h0Var51 = jn0.h0.f84049a;
                                                    bool2 = boolDecode2;
                                                    continue;
                                                case 109:
                                                    Integer numDecode3 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var52 = jn0.h0.f84049a;
                                                    num3 = numDecode3;
                                                    continue;
                                                case 110:
                                                    Boolean boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                                                    jn0.h0 h0Var53 = jn0.h0.f84049a;
                                                    bool3 = boolDecode3;
                                                    continue;
                                                case 111:
                                                    Float fDecode5 = ProtoAdapter.FLOAT.decode(reader);
                                                    jn0.h0 h0Var54 = jn0.h0.f84049a;
                                                    f22 = fDecode5;
                                                    continue;
                                                case 112:
                                                    Float fDecode6 = ProtoAdapter.FLOAT.decode(reader);
                                                    jn0.h0 h0Var55 = jn0.h0.f84049a;
                                                    f23 = fDecode6;
                                                    continue;
                                                case 113:
                                                    Integer numDecode4 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var56 = jn0.h0.f84049a;
                                                    num4 = numDecode4;
                                                    continue;
                                                case 114:
                                                    Integer numDecode5 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var57 = jn0.h0.f84049a;
                                                    num5 = numDecode5;
                                                    continue;
                                                case 115:
                                                    Integer numDecode6 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var58 = jn0.h0.f84049a;
                                                    num6 = numDecode6;
                                                    continue;
                                                case 116:
                                                    Integer numDecode7 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var59 = jn0.h0.f84049a;
                                                    num7 = numDecode7;
                                                    continue;
                                                case 117:
                                                    Integer numDecode8 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var60 = jn0.h0.f84049a;
                                                    num8 = numDecode8;
                                                    continue;
                                                case 118:
                                                    Integer numDecode9 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var61 = jn0.h0.f84049a;
                                                    num9 = numDecode9;
                                                    continue;
                                                case 119:
                                                    Integer numDecode10 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var62 = jn0.h0.f84049a;
                                                    num10 = numDecode10;
                                                    continue;
                                                case 120:
                                                    Integer numDecode11 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var63 = jn0.h0.f84049a;
                                                    num11 = numDecode11;
                                                    continue;
                                                case 121:
                                                    Integer numDecode12 = ProtoAdapter.INT32.decode(reader);
                                                    jn0.h0 h0Var64 = jn0.h0.f84049a;
                                                    num12 = numDecode12;
                                                    continue;
                                                case 122:
                                                    Boolean boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                                                    jn0.h0 h0Var65 = jn0.h0.f84049a;
                                                    bool4 = boolDecode4;
                                                    continue;
                                                case 123:
                                                    Boolean boolDecode5 = ProtoAdapter.BOOL.decode(reader);
                                                    jn0.h0 h0Var66 = jn0.h0.f84049a;
                                                    bool5 = boolDecode5;
                                                    continue;
                                                default:
                                                    switch (iG) {
                                                        case 125:
                                                            Boolean boolDecode6 = ProtoAdapter.BOOL.decode(reader);
                                                            jn0.h0 h0Var67 = jn0.h0.f84049a;
                                                            bool6 = boolDecode6;
                                                            continue;
                                                        case 126:
                                                            Boolean boolDecode7 = ProtoAdapter.BOOL.decode(reader);
                                                            jn0.h0 h0Var68 = jn0.h0.f84049a;
                                                            bool7 = boolDecode7;
                                                            continue;
                                                        case 127:
                                                            Boolean boolDecode8 = ProtoAdapter.BOOL.decode(reader);
                                                            jn0.h0 h0Var69 = jn0.h0.f84049a;
                                                            bool8 = boolDecode8;
                                                            continue;
                                                        case 128:
                                                            Boolean boolDecode9 = ProtoAdapter.BOOL.decode(reader);
                                                            jn0.h0 h0Var70 = jn0.h0.f84049a;
                                                            bool9 = boolDecode9;
                                                            continue;
                                                        case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                                                            Boolean boolDecode10 = ProtoAdapter.BOOL.decode(reader);
                                                            jn0.h0 h0Var71 = jn0.h0.f84049a;
                                                            bool10 = boolDecode10;
                                                            continue;
                                                        default:
                                                            switch (iG) {
                                                                case 136:
                                                                    Boolean boolDecode11 = ProtoAdapter.BOOL.decode(reader);
                                                                    jn0.h0 h0Var72 = jn0.h0.f84049a;
                                                                    bool12 = boolDecode11;
                                                                    continue;
                                                                case 137:
                                                                    Boolean boolDecode12 = ProtoAdapter.BOOL.decode(reader);
                                                                    jn0.h0 h0Var73 = jn0.h0.f84049a;
                                                                    bool13 = boolDecode12;
                                                                    continue;
                                                                case 138:
                                                                    Boolean boolDecode13 = ProtoAdapter.BOOL.decode(reader);
                                                                    jn0.h0 h0Var74 = jn0.h0.f84049a;
                                                                    bool14 = boolDecode13;
                                                                    continue;
                                                                case 139:
                                                                    Integer numDecode13 = ProtoAdapter.INT32.decode(reader);
                                                                    jn0.h0 h0Var75 = jn0.h0.f84049a;
                                                                    num13 = numDecode13;
                                                                    continue;
                                                                case 140:
                                                                    Integer numDecode14 = ProtoAdapter.INT32.decode(reader);
                                                                    jn0.h0 h0Var76 = jn0.h0.f84049a;
                                                                    num14 = numDecode14;
                                                                    continue;
                                                                case 141:
                                                                    Boolean boolDecode14 = ProtoAdapter.BOOL.decode(reader);
                                                                    jn0.h0 h0Var77 = jn0.h0.f84049a;
                                                                    bool15 = boolDecode14;
                                                                    continue;
                                                                case 142:
                                                                    Boolean boolDecode15 = ProtoAdapter.BOOL.decode(reader);
                                                                    jn0.h0 h0Var78 = jn0.h0.f84049a;
                                                                    bool16 = boolDecode15;
                                                                    continue;
                                                                case 143:
                                                                    iVarDecode2 = iVarDecode2;
                                                                    cVar = cVar;
                                                                    f24 = f24;
                                                                    try {
                                                                        bVarDecode2 = b.ADAPTER.decode(reader);
                                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                                                                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                                                                    }
                                                                    jn0.h0 h0Var79 = jn0.h0.f84049a;
                                                                    break;
                                                                case 144:
                                                                    Boolean boolDecode16 = ProtoAdapter.BOOL.decode(reader);
                                                                    jn0.h0 h0Var80 = jn0.h0.f84049a;
                                                                    bool17 = boolDecode16;
                                                                    continue;
                                                                default:
                                                                    switch (iG) {
                                                                        case 146:
                                                                            iVarDecode2 = iVarDecode2;
                                                                            cVar = cVar;
                                                                            f24 = f24;
                                                                            try {
                                                                                fVarDecode = f.ADAPTER.decode(reader);
                                                                            } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                                                                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e14.value));
                                                                            }
                                                                            jn0.h0 h0Var81 = jn0.h0.f84049a;
                                                                            break;
                                                                        case 147:
                                                                            Boolean boolDecode17 = ProtoAdapter.BOOL.decode(reader);
                                                                            jn0.h0 h0Var82 = jn0.h0.f84049a;
                                                                            bool18 = boolDecode17;
                                                                            continue;
                                                                        case 148:
                                                                            iVarDecode2 = iVarDecode2;
                                                                            cVar = cVar;
                                                                            f24 = f24;
                                                                            try {
                                                                                a0VarDecode = ec0.a0.ADAPTER.decode(reader);
                                                                            } catch (ProtoAdapter.EnumConstantNotFoundException e15) {
                                                                                reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e15.value));
                                                                            }
                                                                            jn0.h0 h0Var83 = jn0.h0.f84049a;
                                                                            break;
                                                                        default:
                                                                            switch (iG) {
                                                                                case 150:
                                                                                    iVarDecode2 = iVarDecode2;
                                                                                    cVar = cVar;
                                                                                    f24 = f24;
                                                                                    try {
                                                                                        iVarDecode = i.ADAPTER.decode(reader);
                                                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e16) {
                                                                                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e16.value));
                                                                                    }
                                                                                    jn0.h0 h0Var84 = jn0.h0.f84049a;
                                                                                    break;
                                                                                case 151:
                                                                                    iVarDecode2 = iVarDecode2;
                                                                                    cVar = cVar;
                                                                                    f24 = f24;
                                                                                    try {
                                                                                        aVarDecode = a.ADAPTER.decode(reader);
                                                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e17) {
                                                                                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e17.value));
                                                                                    }
                                                                                    jn0.h0 h0Var85 = jn0.h0.f84049a;
                                                                                    break;
                                                                                case 152:
                                                                                    Integer numDecode15 = ProtoAdapter.INT32.decode(reader);
                                                                                    jn0.h0 h0Var86 = jn0.h0.f84049a;
                                                                                    num15 = numDecode15;
                                                                                    continue;
                                                                                case 153:
                                                                                    Integer numDecode16 = ProtoAdapter.INT32.decode(reader);
                                                                                    jn0.h0 h0Var87 = jn0.h0.f84049a;
                                                                                    num16 = numDecode16;
                                                                                    continue;
                                                                                case 154:
                                                                                    try {
                                                                                        hVarDecode = h.ADAPTER.decode(reader);
                                                                                    } catch (ProtoAdapter.EnumConstantNotFoundException e18) {
                                                                                        reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e18.value));
                                                                                    }
                                                                                    jn0.h0 h0Var88 = jn0.h0.f84049a;
                                                                                    break;
                                                                                default:
                                                                                    reader.m(iG);
                                                                                    jn0.h0 h0Var89 = jn0.h0.f84049a;
                                                                                    continue;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    iVarDecode2 = iVarDecode2;
                                    break;
                            }
                            break;
                    }
                } else {
                    Boolean boolDecode18 = ProtoAdapter.BOOL.decode(reader);
                    jn0.h0 h0Var90 = jn0.h0.f84049a;
                    bool11 = boolDecode18;
                }
                f24 = f24;
                cVar = cVar;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, q value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getInside_temp_celsius_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 1, Float.valueOf(value.getInside_temp_celsius_OBSOLETE()));
            }
            if (value.getOutside_temp_celsius_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 2, Float.valueOf(value.getOutside_temp_celsius_OBSOLETE()));
            }
            if (value.getDriver_temp_setting_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 3, Float.valueOf(value.getDriver_temp_setting_OBSOLETE()));
            }
            if (value.getPassenger_temp_setting_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 4, Float.valueOf(value.getPassenger_temp_setting_OBSOLETE()));
            }
            if (value.getLeft_temp_direction_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 5, Integer.valueOf(value.getLeft_temp_direction_OBSOLETE()));
            }
            if (value.getRight_temp_direction_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getRight_temp_direction_OBSOLETE()));
            }
            if (value.getIs_front_defroster_on_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.getIs_front_defroster_on_OBSOLETE()));
            }
            if (value.getIs_rear_defroster_on_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, Boolean.valueOf(value.getIs_rear_defroster_on_OBSOLETE()));
            }
            if (value.getFan_status_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 9, Integer.valueOf(value.getFan_status_OBSOLETE()));
            }
            if (value.getIs_climate_on_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 10, Boolean.valueOf(value.getIs_climate_on_OBSOLETE()));
            }
            if (value.getMin_avail_temp_celsius_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 11, Float.valueOf(value.getMin_avail_temp_celsius_OBSOLETE()));
            }
            if (value.getMax_avail_temp_celsius_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 12, Float.valueOf(value.getMax_avail_temp_celsius_OBSOLETE()));
            }
            if (value.getSeat_heater_left_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 13, Integer.valueOf(value.getSeat_heater_left_OBSOLETE()));
            }
            if (value.getSeat_heater_right_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 14, Integer.valueOf(value.getSeat_heater_right_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_left_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 15, Integer.valueOf(value.getSeat_heater_rear_left_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_right_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 16, Integer.valueOf(value.getSeat_heater_rear_right_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_center_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 17, Integer.valueOf(value.getSeat_heater_rear_center_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_right_back_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 18, Integer.valueOf(value.getSeat_heater_rear_right_back_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_left_back_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 19, Integer.valueOf(value.getSeat_heater_rear_left_back_OBSOLETE()));
            }
            if (value.getSeat_heater_third_row_right_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 20, Integer.valueOf(value.getSeat_heater_third_row_right_OBSOLETE()));
            }
            if (value.getSeat_heater_third_row_left_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 21, Integer.valueOf(value.getSeat_heater_third_row_left_OBSOLETE()));
            }
            if (value.getBattery_heater_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 22, Boolean.valueOf(value.getBattery_heater_OBSOLETE()));
            }
            if (value.getBattery_heater_no_power_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 23, Boolean.valueOf(value.getBattery_heater_no_power_OBSOLETE()));
            }
            if (value.getSteering_wheel_heater_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 25, Boolean.valueOf(value.getSteering_wheel_heater_OBSOLETE()));
            }
            if (value.getWiper_blade_heater_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 26, Boolean.valueOf(value.getWiper_blade_heater_OBSOLETE()));
            }
            if (value.getSide_mirror_heaters_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 27, Boolean.valueOf(value.getSide_mirror_heaters_OBSOLETE()));
            }
            if (value.getIs_preconditioning_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 28, Boolean.valueOf(value.getIs_preconditioning_OBSOLETE()));
            }
            if (value.getRemote_heater_control_enabled_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 29, Boolean.valueOf(value.getRemote_heater_control_enabled_OBSOLETE()));
            }
            if (value.getBioweapon_mode_on_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 34, Boolean.valueOf(value.getBioweapon_mode_on_OBSOLETE()));
            }
            if (value.getIs_auto_conditioning_on_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 36, Boolean.valueOf(value.getIs_auto_conditioning_on_OBSOLETE()));
            }
            if (value.getAuto_seat_climate_left_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 37, Boolean.valueOf(value.getAuto_seat_climate_left_OBSOLETE()));
            }
            if (value.getAuto_seat_climate_right_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 38, Boolean.valueOf(value.getAuto_seat_climate_right_OBSOLETE()));
            }
            if (value.getSeat_fan_front_left_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 39, Integer.valueOf(value.getSeat_fan_front_left_OBSOLETE()));
            }
            if (value.getSeat_fan_front_right_OBSOLETE() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 40, Integer.valueOf(value.getSeat_fan_front_right_OBSOLETE()));
            }
            if (value.getAllow_cabin_overheat_protection_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 41, Boolean.valueOf(value.getAllow_cabin_overheat_protection_OBSOLETE()));
            }
            if (value.getSupports_fan_only_cabin_overheat_protection_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 42, Boolean.valueOf(value.getSupports_fan_only_cabin_overheat_protection_OBSOLETE()));
            }
            if (value.getCabin_overheat_protection_OBSOLETE() != b.CabinOverheatProtectionOff) {
                b.ADAPTER.encodeWithTag(writer, 43, value.getCabin_overheat_protection_OBSOLETE());
            }
            if (value.getCabin_overheat_protection_actively_cooling_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 44, Boolean.valueOf(value.getCabin_overheat_protection_actively_cooling_OBSOLETE()));
            }
            if (value.getCop_activation_temp_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 45, Float.valueOf(value.getCop_activation_temp_OBSOLETE()));
            }
            if (value.getHvac_auto_request_OBSOLETE() != i.HvacAutoRequestOn) {
                i.ADAPTER.encodeWithTag(writer, 50, value.getHvac_auto_request_OBSOLETE());
            }
            if (value.getClimate_keeper_mode() != null) {
                c.f68367g.encodeWithTag(writer, 30, value.getClimate_keeper_mode());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 33, value.getTimestamp());
            }
            if (value.getDefrost_mode() != null) {
                g.f68374e.encodeWithTag(writer, 35, value.getDefrost_mode());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(writer, 101, value.getInside_temp_celsius());
            protoAdapter.encodeWithTag(writer, 102, value.getOutside_temp_celsius());
            protoAdapter.encodeWithTag(writer, 103, value.getDriver_temp_setting());
            protoAdapter.encodeWithTag(writer, 104, value.getPassenger_temp_setting());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(writer, 105, value.getLeft_temp_direction());
            protoAdapter2.encodeWithTag(writer, 106, value.getRight_temp_direction());
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(writer, 107, value.getIs_front_defroster_on());
            protoAdapter3.encodeWithTag(writer, 108, value.getIs_rear_defroster_on());
            protoAdapter2.encodeWithTag(writer, 109, value.getFan_status());
            protoAdapter3.encodeWithTag(writer, 110, value.getIs_climate_on());
            protoAdapter.encodeWithTag(writer, 111, value.getMin_avail_temp_celsius());
            protoAdapter.encodeWithTag(writer, 112, value.getMax_avail_temp_celsius());
            protoAdapter2.encodeWithTag(writer, 113, value.getSeat_heater_left());
            protoAdapter2.encodeWithTag(writer, 114, value.getSeat_heater_right());
            protoAdapter2.encodeWithTag(writer, 115, value.getSeat_heater_rear_left());
            protoAdapter2.encodeWithTag(writer, 116, value.getSeat_heater_rear_right());
            protoAdapter2.encodeWithTag(writer, 117, value.getSeat_heater_rear_center());
            protoAdapter2.encodeWithTag(writer, 118, value.getSeat_heater_rear_right_back());
            protoAdapter2.encodeWithTag(writer, 119, value.getSeat_heater_rear_left_back());
            protoAdapter2.encodeWithTag(writer, 120, value.getSeat_heater_third_row_right());
            protoAdapter2.encodeWithTag(writer, 121, value.getSeat_heater_third_row_left());
            protoAdapter3.encodeWithTag(writer, 122, value.getBattery_heater());
            protoAdapter3.encodeWithTag(writer, 123, value.getBattery_heater_no_power());
            protoAdapter3.encodeWithTag(writer, 125, value.getSteering_wheel_heater());
            protoAdapter3.encodeWithTag(writer, 126, value.getWiper_blade_heater());
            protoAdapter3.encodeWithTag(writer, 127, value.getSide_mirror_heaters());
            protoAdapter3.encodeWithTag(writer, 128, value.getIs_preconditioning());
            protoAdapter3.encodeWithTag(writer, EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, value.getRemote_heater_control_enabled());
            protoAdapter3.encodeWithTag(writer, 134, value.getBioweapon_mode_on());
            protoAdapter3.encodeWithTag(writer, 136, value.getIs_auto_conditioning_on());
            protoAdapter3.encodeWithTag(writer, 137, value.getAuto_seat_climate_left());
            protoAdapter3.encodeWithTag(writer, 138, value.getAuto_seat_climate_right());
            protoAdapter2.encodeWithTag(writer, 139, value.getSeat_fan_front_left());
            protoAdapter2.encodeWithTag(writer, 140, value.getSeat_fan_front_right());
            protoAdapter2.encodeWithTag(writer, 152, value.getSeat_fan_second_row_left());
            protoAdapter2.encodeWithTag(writer, 153, value.getSeat_fan_second_row_right());
            protoAdapter3.encodeWithTag(writer, 141, value.getAllow_cabin_overheat_protection());
            protoAdapter3.encodeWithTag(writer, 142, value.getSupports_fan_only_cabin_overheat_protection());
            b.ADAPTER.encodeWithTag(writer, 143, value.getCabin_overheat_protection());
            protoAdapter3.encodeWithTag(writer, 144, value.getCabin_overheat_protection_actively_cooling());
            f.ADAPTER.encodeWithTag(writer, 146, value.getCop_activation_temperature());
            protoAdapter3.encodeWithTag(writer, 147, value.getAuto_steering_wheel_heat());
            ec0.a0.ADAPTER.encodeWithTag(writer, 148, value.getSteering_wheel_heat_level());
            i.ADAPTER.encodeWithTag(writer, 150, value.getHvac_auto_request());
            a.ADAPTER.encodeWithTag(writer, 151, value.getCop_not_running_reason());
            h.ADAPTER.encodeWithTag(writer, 154, value.getDog_mode_state());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(q value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getInside_temp_celsius_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(1, Float.valueOf(value.getInside_temp_celsius_OBSOLETE()));
            }
            if (value.getOutside_temp_celsius_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(2, Float.valueOf(value.getOutside_temp_celsius_OBSOLETE()));
            }
            if (value.getDriver_temp_setting_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getDriver_temp_setting_OBSOLETE()));
            }
            if (value.getPassenger_temp_setting_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(value.getPassenger_temp_setting_OBSOLETE()));
            }
            if (value.getLeft_temp_direction_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getLeft_temp_direction_OBSOLETE()));
            }
            if (value.getRight_temp_direction_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getRight_temp_direction_OBSOLETE()));
            }
            if (value.getIs_front_defroster_on_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getIs_front_defroster_on_OBSOLETE()));
            }
            if (value.getIs_rear_defroster_on_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getIs_rear_defroster_on_OBSOLETE()));
            }
            if (value.getFan_status_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(9, Integer.valueOf(value.getFan_status_OBSOLETE()));
            }
            if (value.getIs_climate_on_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getIs_climate_on_OBSOLETE()));
            }
            if (value.getMin_avail_temp_celsius_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(11, Float.valueOf(value.getMin_avail_temp_celsius_OBSOLETE()));
            }
            if (value.getMax_avail_temp_celsius_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(12, Float.valueOf(value.getMax_avail_temp_celsius_OBSOLETE()));
            }
            if (value.getSeat_heater_left_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(13, Integer.valueOf(value.getSeat_heater_left_OBSOLETE()));
            }
            if (value.getSeat_heater_right_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(14, Integer.valueOf(value.getSeat_heater_right_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_left_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(15, Integer.valueOf(value.getSeat_heater_rear_left_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_right_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(16, Integer.valueOf(value.getSeat_heater_rear_right_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_center_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(17, Integer.valueOf(value.getSeat_heater_rear_center_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_right_back_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(18, Integer.valueOf(value.getSeat_heater_rear_right_back_OBSOLETE()));
            }
            if (value.getSeat_heater_rear_left_back_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(19, Integer.valueOf(value.getSeat_heater_rear_left_back_OBSOLETE()));
            }
            if (value.getSeat_heater_third_row_right_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(20, Integer.valueOf(value.getSeat_heater_third_row_right_OBSOLETE()));
            }
            if (value.getSeat_heater_third_row_left_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(21, Integer.valueOf(value.getSeat_heater_third_row_left_OBSOLETE()));
            }
            if (value.getBattery_heater_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(22, Boolean.valueOf(value.getBattery_heater_OBSOLETE()));
            }
            if (value.getBattery_heater_no_power_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(23, Boolean.valueOf(value.getBattery_heater_no_power_OBSOLETE()));
            }
            if (value.getSteering_wheel_heater_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(25, Boolean.valueOf(value.getSteering_wheel_heater_OBSOLETE()));
            }
            if (value.getWiper_blade_heater_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(26, Boolean.valueOf(value.getWiper_blade_heater_OBSOLETE()));
            }
            if (value.getSide_mirror_heaters_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(27, Boolean.valueOf(value.getSide_mirror_heaters_OBSOLETE()));
            }
            if (value.getIs_preconditioning_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(28, Boolean.valueOf(value.getIs_preconditioning_OBSOLETE()));
            }
            if (value.getRemote_heater_control_enabled_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(29, Boolean.valueOf(value.getRemote_heater_control_enabled_OBSOLETE()));
            }
            if (value.getBioweapon_mode_on_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(34, Boolean.valueOf(value.getBioweapon_mode_on_OBSOLETE()));
            }
            if (value.getIs_auto_conditioning_on_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(36, Boolean.valueOf(value.getIs_auto_conditioning_on_OBSOLETE()));
            }
            if (value.getAuto_seat_climate_left_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(37, Boolean.valueOf(value.getAuto_seat_climate_left_OBSOLETE()));
            }
            if (value.getAuto_seat_climate_right_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(38, Boolean.valueOf(value.getAuto_seat_climate_right_OBSOLETE()));
            }
            if (value.getSeat_fan_front_left_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(39, Integer.valueOf(value.getSeat_fan_front_left_OBSOLETE()));
            }
            if (value.getSeat_fan_front_right_OBSOLETE() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(40, Integer.valueOf(value.getSeat_fan_front_right_OBSOLETE()));
            }
            if (value.getAllow_cabin_overheat_protection_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(41, Boolean.valueOf(value.getAllow_cabin_overheat_protection_OBSOLETE()));
            }
            if (value.getSupports_fan_only_cabin_overheat_protection_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(42, Boolean.valueOf(value.getSupports_fan_only_cabin_overheat_protection_OBSOLETE()));
            }
            if (value.getCabin_overheat_protection_OBSOLETE() != b.CabinOverheatProtectionOff) {
                iD += b.ADAPTER.encodedSizeWithTag(43, value.getCabin_overheat_protection_OBSOLETE());
            }
            if (value.getCabin_overheat_protection_actively_cooling_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(44, Boolean.valueOf(value.getCabin_overheat_protection_actively_cooling_OBSOLETE()));
            }
            if (value.getCop_activation_temp_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(45, Float.valueOf(value.getCop_activation_temp_OBSOLETE()));
            }
            if (value.getHvac_auto_request_OBSOLETE() != i.HvacAutoRequestOn) {
                iD += i.ADAPTER.encodedSizeWithTag(50, value.getHvac_auto_request_OBSOLETE());
            }
            if (value.getClimate_keeper_mode() != null) {
                iD += c.f68367g.encodedSizeWithTag(30, value.getClimate_keeper_mode());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(33, value.getTimestamp());
            }
            if (value.getDefrost_mode() != null) {
                iD += g.f68374e.encodedSizeWithTag(35, value.getDefrost_mode());
            }
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(101, value.getInside_temp_celsius()) + protoAdapter.encodedSizeWithTag(102, value.getOutside_temp_celsius()) + protoAdapter.encodedSizeWithTag(103, value.getDriver_temp_setting()) + protoAdapter.encodedSizeWithTag(104, value.getPassenger_temp_setting());
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(105, value.getLeft_temp_direction()) + protoAdapter2.encodedSizeWithTag(106, value.getRight_temp_direction());
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(107, value.getIs_front_defroster_on()) + protoAdapter3.encodedSizeWithTag(108, value.getIs_rear_defroster_on()) + protoAdapter2.encodedSizeWithTag(109, value.getFan_status()) + protoAdapter3.encodedSizeWithTag(110, value.getIs_climate_on()) + protoAdapter.encodedSizeWithTag(111, value.getMin_avail_temp_celsius()) + protoAdapter.encodedSizeWithTag(112, value.getMax_avail_temp_celsius()) + protoAdapter2.encodedSizeWithTag(113, value.getSeat_heater_left()) + protoAdapter2.encodedSizeWithTag(114, value.getSeat_heater_right()) + protoAdapter2.encodedSizeWithTag(115, value.getSeat_heater_rear_left()) + protoAdapter2.encodedSizeWithTag(116, value.getSeat_heater_rear_right()) + protoAdapter2.encodedSizeWithTag(117, value.getSeat_heater_rear_center()) + protoAdapter2.encodedSizeWithTag(118, value.getSeat_heater_rear_right_back()) + protoAdapter2.encodedSizeWithTag(119, value.getSeat_heater_rear_left_back()) + protoAdapter2.encodedSizeWithTag(120, value.getSeat_heater_third_row_right()) + protoAdapter2.encodedSizeWithTag(121, value.getSeat_heater_third_row_left()) + protoAdapter3.encodedSizeWithTag(122, value.getBattery_heater()) + protoAdapter3.encodedSizeWithTag(123, value.getBattery_heater_no_power()) + protoAdapter3.encodedSizeWithTag(125, value.getSteering_wheel_heater()) + protoAdapter3.encodedSizeWithTag(126, value.getWiper_blade_heater()) + protoAdapter3.encodedSizeWithTag(127, value.getSide_mirror_heaters()) + protoAdapter3.encodedSizeWithTag(128, value.getIs_preconditioning()) + protoAdapter3.encodedSizeWithTag(EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, value.getRemote_heater_control_enabled()) + protoAdapter3.encodedSizeWithTag(134, value.getBioweapon_mode_on()) + protoAdapter3.encodedSizeWithTag(136, value.getIs_auto_conditioning_on()) + protoAdapter3.encodedSizeWithTag(137, value.getAuto_seat_climate_left()) + protoAdapter3.encodedSizeWithTag(138, value.getAuto_seat_climate_right()) + protoAdapter2.encodedSizeWithTag(139, value.getSeat_fan_front_left()) + protoAdapter2.encodedSizeWithTag(140, value.getSeat_fan_front_right()) + protoAdapter2.encodedSizeWithTag(152, value.getSeat_fan_second_row_left()) + protoAdapter2.encodedSizeWithTag(153, value.getSeat_fan_second_row_right()) + protoAdapter3.encodedSizeWithTag(141, value.getAllow_cabin_overheat_protection()) + protoAdapter3.encodedSizeWithTag(142, value.getSupports_fan_only_cabin_overheat_protection()) + b.ADAPTER.encodedSizeWithTag(143, value.getCabin_overheat_protection()) + protoAdapter3.encodedSizeWithTag(144, value.getCabin_overheat_protection_actively_cooling()) + f.ADAPTER.encodedSizeWithTag(146, value.getCop_activation_temperature()) + protoAdapter3.encodedSizeWithTag(147, value.getAuto_steering_wheel_heat()) + ec0.a0.ADAPTER.encodedSizeWithTag(148, value.getSteering_wheel_heat_level()) + i.ADAPTER.encodedSizeWithTag(150, value.getHvac_auto_request()) + a.ADAPTER.encodedSizeWithTag(151, value.getCop_not_running_reason()) + h.ADAPTER.encodedSizeWithTag(154, value.getDog_mode_state());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public q redact(q value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            c climate_keeper_mode = value.getClimate_keeper_mode();
            c cVarRedact = climate_keeper_mode != null ? c.f68367g.redact(climate_keeper_mode) : null;
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            g defrost_mode = value.getDefrost_mode();
            return q.b(value, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, false, false, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, null, false, BitmapDescriptorFactory.HUE_RED, null, cVarRedact, instantRedact, defrost_mode != null ? g.f68374e.redact(defrost_mode) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, -1, -1793, 33554431, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.q$f, still in use, count: 1, list:
      (r0v0 gc0.q$f) from 0x0046: CONSTRUCTOR 
      (wrap co0.d:0x003e: INVOKE (wrap java.lang.Class:0x003c: CONST_CLASS  A[WRAPPED] (LINE:61) gc0.q$f.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:63))
      (wrap com.squareup.wire.o:0x0042: SGET  A[WRAPPED] (LINE:67) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 gc0.q$f)
     A[MD:(co0.d<gc0.q$f>, com.squareup.wire.o, gc0.q$f):void (m), WRAPPED] (LINE:71) call: gc0.q.f.a.<init>(co0.d, com.squareup.wire.o, gc0.q$f):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lgc0/q$f;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "CopActivationTempUnspecified", "CopActivationTempLow", "CopActivationTempMedium", "CopActivationTempHigh", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements com.squareup.wire.p {
        CopActivationTempUnspecified(0),
        CopActivationTempLow(1),
        CopActivationTempMedium(2),
        CopActivationTempHigh(3);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<f> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(f.class), com.squareup.wire.o.PROTO_3, new f(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"gc0/q$f$a", "Lcom/squareup/wire/a;", "Lgc0/q$f;", "", "value", "f", "(I)Lgc0/q$f;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<f> {
            a(co0.d<f> dVar, com.squareup.wire.o oVar, f fVar) {
                super(dVar, oVar, fVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public f d(int value) {
                return f.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: gc0.q$f$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/q$f$b;", "", "<init>", "()V", "", "value", "Lgc0/q$f;", "a", "(I)Lgc0/q$f;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(int value) {
                if (value == 0) {
                    return f.CopActivationTempUnspecified;
                }
                if (value == 1) {
                    return f.CopActivationTempLow;
                }
                if (value == 2) {
                    return f.CopActivationTempMedium;
                }
                if (value != 3) {
                    return null;
                }
                return f.CopActivationTempHigh;
            }

            private Companion() {
            }
        }

        static {
        }

        private f(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final f fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<f> getEntries() {
            return $ENTRIES;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lgc0/q$g;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Off", ReactProgressBarViewManager.DEFAULT_STYLE, "Max", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/q$g;", "Lec0/h0;", DateTokenConverter.CONVERTER_KEY, "()Lec0/h0;", "b", "c", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends com.squareup.wire.f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ProtoAdapter<g> f68374e = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(g.class), com.squareup.wire.o.PROTO_3);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
        private final ec0.h0 Off;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
        private final ec0.h0 Normal;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
        private final ec0.h0 Max;

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/q$g$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/q$g;", "value", "", "c", "(Lgc0/q$g;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/q$g;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/q$g;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/q$g;)Lgc0/q$g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ProtoAdapter<g> {
            a(com.squareup.wire.b bVar, co0.d<g> dVar, com.squareup.wire.o oVar) {
                super(bVar, dVar, "type.googleapis.com/CarServer.ClimateState.DefrostMode", oVar, (Object) null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g decode(com.squareup.wire.k reader) {
                p013kotlin.jvm.internal.s.k(reader, "reader");
                long jD = reader.d();
                ec0.h0 h0VarDecode = null;
                ec0.h0 h0VarDecode2 = null;
                ec0.h0 h0VarDecode3 = null;
                while (true) {
                    int iG = reader.g();
                    if (iG == -1) {
                        return new g(h0VarDecode, h0VarDecode2, h0VarDecode3, reader.e(jD));
                    }
                    if (iG == 1) {
                        h0VarDecode = ec0.h0.f62622b.decode(reader);
                    } else if (iG == 2) {
                        h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                    } else if (iG != 3) {
                        reader.m(iG);
                    } else {
                        h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void encode(com.squareup.wire.l writer, g value) {
                p013kotlin.jvm.internal.s.k(writer, "writer");
                p013kotlin.jvm.internal.s.k(value, "value");
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                protoAdapter.encodeWithTag(writer, 1, value.getOff());
                protoAdapter.encodeWithTag(writer, 2, value.getNormal());
                protoAdapter.encodeWithTag(writer, 3, value.getMax());
                writer.a(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int encodedSize(g value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                int iD = value.unknownFields().D();
                ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
                return iD + protoAdapter.encodedSizeWithTag(1, value.getOff()) + protoAdapter.encodedSizeWithTag(2, value.getNormal()) + protoAdapter.encodedSizeWithTag(3, value.getMax());
            }

            @Override // com.squareup.wire.ProtoAdapter
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public g redact(g value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                ec0.h0 off = value.getOff();
                ec0.h0 h0VarRedact = off != null ? ec0.h0.f62622b.redact(off) : null;
                ec0.h0 normal = value.getNormal();
                ec0.h0 h0VarRedact2 = normal != null ? ec0.h0.f62622b.redact(normal) : null;
                ec0.h0 max = value.getMax();
                return value.a(h0VarRedact, h0VarRedact2, max != null ? ec0.h0.f62622b.redact(max) : null, okio.k.f97943e);
            }
        }

        public g() {
            this(null, null, null, null, 15, null);
        }

        public final g a(ec0.h0 Off, ec0.h0 Normal, ec0.h0 Max, okio.k unknownFields) {
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            return new g(Off, Normal, Max, unknownFields);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ec0.h0 getMax() {
            return this.Max;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ec0.h0 getNormal() {
            return this.Normal;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ec0.h0 getOff() {
            return this.Off;
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return p013kotlin.jvm.internal.s.f(unknownFields(), gVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Off, gVar.Off) && p013kotlin.jvm.internal.s.f(this.Normal, gVar.Normal) && p013kotlin.jvm.internal.s.f(this.Max, gVar.Max);
        }

        public int hashCode() {
            int i11 = this.hashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            ec0.h0 h0Var = this.Off;
            int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
            ec0.h0 h0Var2 = this.Normal;
            int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
            ec0.h0 h0Var3 = this.Max;
            int iHashCode4 = iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.f
        public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
            return (com.squareup.wire.f.a) m430newBuilder();
        }

        @Override // com.squareup.wire.f
        public String toString() {
            ArrayList arrayList = new ArrayList();
            ec0.h0 h0Var = this.Off;
            if (h0Var != null) {
                arrayList.add("Off=" + h0Var);
            }
            ec0.h0 h0Var2 = this.Normal;
            if (h0Var2 != null) {
                arrayList.add("Normal=" + h0Var2);
            }
            ec0.h0 h0Var3 = this.Max;
            if (h0Var3 != null) {
                arrayList.add("Max=" + h0Var3);
            }
            return p013kotlin.collections.v.y0(arrayList, ", ", "DefrostMode{", "}", 0, null, null, 56, null);
        }

        public /* synthetic */ g(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? okio.k.f97943e : kVar);
        }

        @jn0.e
        /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m430newBuilder() {
            throw new AssertionError();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, okio.k unknownFields) {
            super(f68374e, unknownFields);
            p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
            this.Off = h0Var;
            this.Normal = h0Var2;
            this.Max = h0Var3;
            if (x20.d.d(h0Var, h0Var2, h0Var3) > 1) {
                throw new IllegalArgumentException("At most one of Off, Normal, Max may be non-null");
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.q$h, still in use, count: 1, list:
      (r0v0 gc0.q$h) from 0x005a: CONSTRUCTOR 
      (wrap co0.d:0x0052: INVOKE (wrap java.lang.Class:0x0050: CONST_CLASS  A[WRAPPED] (LINE:81) gc0.q$h.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:83))
      (wrap com.squareup.wire.o:0x0056: SGET  A[WRAPPED] (LINE:87) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 gc0.q$h)
     A[MD:(co0.d<gc0.q$h>, com.squareup.wire.o, gc0.q$h):void (m), WRAPPED] (LINE:91) call: gc0.q.h.a.<init>(co0.d, com.squareup.wire.o, gc0.q$h):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lgc0/q$h;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "DogModeStateUnavailableFault", "DogModeStateUnavailableTooHot", "DogModeStateAvailable", "DogModeStateRunningNominal", "DogModeStateRunningFault", "DogModeStateRunningTemperatureMonitorTrip", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h implements com.squareup.wire.p {
        DogModeStateUnavailableFault(0),
        DogModeStateUnavailableTooHot(1),
        DogModeStateAvailable(2),
        DogModeStateRunningNominal(3),
        DogModeStateRunningFault(4),
        DogModeStateRunningTemperatureMonitorTrip(5);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<h> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(h.class), com.squareup.wire.o.PROTO_3, new h(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"gc0/q$h$a", "Lcom/squareup/wire/a;", "Lgc0/q$h;", "", "value", "f", "(I)Lgc0/q$h;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<h> {
            a(co0.d<h> dVar, com.squareup.wire.o oVar, h hVar) {
                super(dVar, oVar, hVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public h d(int value) {
                return h.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: gc0.q$h$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/q$h$b;", "", "<init>", "()V", "", "value", "Lgc0/q$h;", "a", "(I)Lgc0/q$h;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final h a(int value) {
                if (value == 0) {
                    return h.DogModeStateUnavailableFault;
                }
                if (value == 1) {
                    return h.DogModeStateUnavailableTooHot;
                }
                if (value == 2) {
                    return h.DogModeStateAvailable;
                }
                if (value == 3) {
                    return h.DogModeStateRunningNominal;
                }
                if (value == 4) {
                    return h.DogModeStateRunningFault;
                }
                if (value != 5) {
                    return null;
                }
                return h.DogModeStateRunningTemperatureMonitorTrip;
            }

            private Companion() {
            }
        }

        static {
        }

        private h(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final h fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<h> getEntries() {
            return $ENTRIES;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 gc0.q$i, still in use, count: 1, list:
      (r0v0 gc0.q$i) from 0x0032: CONSTRUCTOR 
      (wrap co0.d:0x002a: INVOKE (wrap java.lang.Class:0x0028: CONST_CLASS  A[WRAPPED] (LINE:41) gc0.q$i.class) STATIC call: kotlin.jvm.internal.o0.b(java.lang.Class):co0.d A[MD:(java.lang.Class):co0.d (m), WRAPPED] (LINE:43))
      (wrap com.squareup.wire.o:0x002e: SGET  A[WRAPPED] (LINE:47) com.squareup.wire.o.PROTO_3 com.squareup.wire.o)
      (r0v0 gc0.q$i)
     A[MD:(co0.d<gc0.q$i>, com.squareup.wire.o, gc0.q$i):void (m), WRAPPED] (LINE:51) call: gc0.q.i.a.<init>(co0.d, com.squareup.wire.o, gc0.q$i):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lgc0/q$i;", "Lcom/squareup/wire/p;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "b", "HvacAutoRequestOn", "HvacAutoRequestOverride", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i implements com.squareup.wire.p {
        HvacAutoRequestOn(0),
        HvacAutoRequestOverride(1);

        private final int value;
        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final ProtoAdapter<i> ADAPTER = new a(p013kotlin.jvm.internal.o0.b(i.class), com.squareup.wire.o.PROTO_3, new i(0));

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"gc0/q$i$a", "Lcom/squareup/wire/a;", "Lgc0/q$i;", "", "value", "f", "(I)Lgc0/q$i;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends com.squareup.wire.a<i> {
            a(co0.d<i> dVar, com.squareup.wire.o oVar, i iVar) {
                super(dVar, oVar, iVar);
            }

            @Override // com.squareup.wire.a
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public i d(int value) {
                return i.INSTANCE.a(value);
            }
        }

        /* JADX INFO: renamed from: gc0.q$i$b, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lgc0/q$i$b;", "", "<init>", "()V", "", "value", "Lgc0/q$i;", "a", "(I)Lgc0/q$i;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final i a(int value) {
                if (value == 0) {
                    return i.HvacAutoRequestOn;
                }
                if (value != 1) {
                    return null;
                }
                return i.HvacAutoRequestOverride;
            }

            private Companion() {
            }
        }

        static {
        }

        private i(int i11) {
            super(str, i);
            this.value = i11;
        }

        public static final i fromValue(int i11) {
            return INSTANCE.a(i11);
        }

        public static EnumEntries<i> getEntries() {
            return $ENTRIES;
        }

        public static i valueOf(String str) {
            return (i) Enum.valueOf(i.class, str);
        }

        public static i[] values() {
            return (i[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.p
        public int getValue() {
            return this.value;
        }
    }

    public q() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, false, false, 0, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, null, false, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 67108863, null);
    }

    public static /* synthetic */ q b(q qVar, float f11, float f12, float f13, float f14, int i11, int i12, boolean z11, boolean z12, int i13, boolean z13, float f15, float f16, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, int i24, int i25, boolean z26, boolean z27, b bVar, boolean z28, float f17, i iVar, c cVar, Instant instant, g gVar, Float f18, Float f19, Float f21, Float f22, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Float f23, Float f24, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num13, Integer num14, Integer num15, Integer num16, Boolean bool15, Boolean bool16, b bVar2, Boolean bool17, f fVar, Boolean bool18, ec0.a0 a0Var, i iVar2, a aVar, h hVar, okio.k kVar, int i26, int i27, int i28, Object obj) {
        float f25 = (i26 & 1) != 0 ? qVar.inside_temp_celsius_OBSOLETE : f11;
        return qVar.a(f25, (i26 & 2) != 0 ? qVar.outside_temp_celsius_OBSOLETE : f12, (i26 & 4) != 0 ? qVar.driver_temp_setting_OBSOLETE : f13, (i26 & 8) != 0 ? qVar.passenger_temp_setting_OBSOLETE : f14, (i26 & 16) != 0 ? qVar.left_temp_direction_OBSOLETE : i11, (i26 & 32) != 0 ? qVar.right_temp_direction_OBSOLETE : i12, (i26 & 64) != 0 ? qVar.is_front_defroster_on_OBSOLETE : z11, (i26 & 128) != 0 ? qVar.is_rear_defroster_on_OBSOLETE : z12, (i26 & 256) != 0 ? qVar.fan_status_OBSOLETE : i13, (i26 & 512) != 0 ? qVar.is_climate_on_OBSOLETE : z13, (i26 & 1024) != 0 ? qVar.min_avail_temp_celsius_OBSOLETE : f15, (i26 & 2048) != 0 ? qVar.max_avail_temp_celsius_OBSOLETE : f16, (i26 & 4096) != 0 ? qVar.seat_heater_left_OBSOLETE : i14, (i26 & PKIFailureInfo.certRevoked) != 0 ? qVar.seat_heater_right_OBSOLETE : i15, (i26 & 16384) != 0 ? qVar.seat_heater_rear_left_OBSOLETE : i16, (i26 & 32768) != 0 ? qVar.seat_heater_rear_right_OBSOLETE : i17, (i26 & 65536) != 0 ? qVar.seat_heater_rear_center_OBSOLETE : i18, (i26 & 131072) != 0 ? qVar.seat_heater_rear_right_back_OBSOLETE : i19, (i26 & 262144) != 0 ? qVar.seat_heater_rear_left_back_OBSOLETE : i21, (i26 & PKIFailureInfo.signerNotTrusted) != 0 ? qVar.seat_heater_third_row_right_OBSOLETE : i22, (i26 & PKIFailureInfo.badCertTemplate) != 0 ? qVar.seat_heater_third_row_left_OBSOLETE : i23, (i26 & PKIFailureInfo.badSenderNonce) != 0 ? qVar.battery_heater_OBSOLETE : z14, (i26 & 4194304) != 0 ? qVar.battery_heater_no_power_OBSOLETE : z15, (i26 & 8388608) != 0 ? qVar.steering_wheel_heater_OBSOLETE : z16, (i26 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? qVar.wiper_blade_heater_OBSOLETE : z17, (i26 & 33554432) != 0 ? qVar.side_mirror_heaters_OBSOLETE : z18, (i26 & 67108864) != 0 ? qVar.is_preconditioning_OBSOLETE : z19, (i26 & 134217728) != 0 ? qVar.remote_heater_control_enabled_OBSOLETE : z21, (i26 & 268435456) != 0 ? qVar.bioweapon_mode_on_OBSOLETE : z22, (i26 & PKIFailureInfo.duplicateCertReq) != 0 ? qVar.is_auto_conditioning_on_OBSOLETE : z23, (i26 & 1073741824) != 0 ? qVar.auto_seat_climate_left_OBSOLETE : z24, (i26 & Integer.MIN_VALUE) != 0 ? qVar.auto_seat_climate_right_OBSOLETE : z25, (i27 & 1) != 0 ? qVar.seat_fan_front_left_OBSOLETE : i24, (i27 & 2) != 0 ? qVar.seat_fan_front_right_OBSOLETE : i25, (i27 & 4) != 0 ? qVar.allow_cabin_overheat_protection_OBSOLETE : z26, (i27 & 8) != 0 ? qVar.supports_fan_only_cabin_overheat_protection_OBSOLETE : z27, (i27 & 16) != 0 ? qVar.cabin_overheat_protection_OBSOLETE : bVar, (i27 & 32) != 0 ? qVar.cabin_overheat_protection_actively_cooling_OBSOLETE : z28, (i27 & 64) != 0 ? qVar.cop_activation_temp_OBSOLETE : f17, (i27 & 128) != 0 ? qVar.hvac_auto_request_OBSOLETE : iVar, (i27 & 256) != 0 ? qVar.climate_keeper_mode : cVar, (i27 & 512) != 0 ? qVar.timestamp : instant, (i27 & 1024) != 0 ? qVar.defrost_mode : gVar, (i27 & 2048) != 0 ? qVar.inside_temp_celsius : f18, (i27 & 4096) != 0 ? qVar.outside_temp_celsius : f19, (i27 & PKIFailureInfo.certRevoked) != 0 ? qVar.driver_temp_setting : f21, (i27 & 16384) != 0 ? qVar.passenger_temp_setting : f22, (i27 & 32768) != 0 ? qVar.left_temp_direction : num, (i27 & 65536) != 0 ? qVar.right_temp_direction : num2, (i27 & 131072) != 0 ? qVar.is_front_defroster_on : bool, (i27 & 262144) != 0 ? qVar.is_rear_defroster_on : bool2, (i27 & PKIFailureInfo.signerNotTrusted) != 0 ? qVar.fan_status : num3, (i27 & PKIFailureInfo.badCertTemplate) != 0 ? qVar.is_climate_on : bool3, (i27 & PKIFailureInfo.badSenderNonce) != 0 ? qVar.min_avail_temp_celsius : f23, (i27 & 4194304) != 0 ? qVar.max_avail_temp_celsius : f24, (i27 & 8388608) != 0 ? qVar.seat_heater_left : num4, (i27 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? qVar.seat_heater_right : num5, (i27 & 33554432) != 0 ? qVar.seat_heater_rear_left : num6, (i27 & 67108864) != 0 ? qVar.seat_heater_rear_right : num7, (i27 & 134217728) != 0 ? qVar.seat_heater_rear_center : num8, (i27 & 268435456) != 0 ? qVar.seat_heater_rear_right_back : num9, (i27 & PKIFailureInfo.duplicateCertReq) != 0 ? qVar.seat_heater_rear_left_back : num10, (i27 & 1073741824) != 0 ? qVar.seat_heater_third_row_right : num11, (i27 & Integer.MIN_VALUE) != 0 ? qVar.seat_heater_third_row_left : num12, (i28 & 1) != 0 ? qVar.battery_heater : bool4, (i28 & 2) != 0 ? qVar.battery_heater_no_power : bool5, (i28 & 4) != 0 ? qVar.steering_wheel_heater : bool6, (i28 & 8) != 0 ? qVar.wiper_blade_heater : bool7, (i28 & 16) != 0 ? qVar.side_mirror_heaters : bool8, (i28 & 32) != 0 ? qVar.is_preconditioning : bool9, (i28 & 64) != 0 ? qVar.remote_heater_control_enabled : bool10, (i28 & 128) != 0 ? qVar.bioweapon_mode_on : bool11, (i28 & 256) != 0 ? qVar.is_auto_conditioning_on : bool12, (i28 & 512) != 0 ? qVar.auto_seat_climate_left : bool13, (i28 & 1024) != 0 ? qVar.auto_seat_climate_right : bool14, (i28 & 2048) != 0 ? qVar.seat_fan_front_left : num13, (i28 & 4096) != 0 ? qVar.seat_fan_front_right : num14, (i28 & PKIFailureInfo.certRevoked) != 0 ? qVar.seat_fan_second_row_left : num15, (i28 & 16384) != 0 ? qVar.seat_fan_second_row_right : num16, (i28 & 32768) != 0 ? qVar.allow_cabin_overheat_protection : bool15, (i28 & 65536) != 0 ? qVar.supports_fan_only_cabin_overheat_protection : bool16, (i28 & 131072) != 0 ? qVar.cabin_overheat_protection : bVar2, (i28 & 262144) != 0 ? qVar.cabin_overheat_protection_actively_cooling : bool17, (i28 & PKIFailureInfo.signerNotTrusted) != 0 ? qVar.cop_activation_temperature : fVar, (i28 & PKIFailureInfo.badCertTemplate) != 0 ? qVar.auto_steering_wheel_heat : bool18, (i28 & PKIFailureInfo.badSenderNonce) != 0 ? qVar.steering_wheel_heat_level : a0Var, (i28 & 4194304) != 0 ? qVar.hvac_auto_request : iVar2, (i28 & 8388608) != 0 ? qVar.cop_not_running_reason : aVar, (i28 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? qVar.dog_mode_state : hVar, (i28 & 33554432) != 0 ? qVar.unknownFields() : kVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final float getDriver_temp_setting_OBSOLETE() {
        return this.driver_temp_setting_OBSOLETE;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Boolean getSupports_fan_only_cabin_overheat_protection() {
        return this.supports_fan_only_cabin_overheat_protection;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Integer getFan_status() {
        return this.fan_status;
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    public final boolean getSupports_fan_only_cabin_overheat_protection_OBSOLETE() {
        return this.supports_fan_only_cabin_overheat_protection_OBSOLETE;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final int getFan_status_OBSOLETE() {
        return this.fan_status_OBSOLETE;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final i getHvac_auto_request() {
        return this.hvac_auto_request;
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final Boolean getWiper_blade_heater() {
        return this.wiper_blade_heater;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final i getHvac_auto_request_OBSOLETE() {
        return this.hvac_auto_request_OBSOLETE;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final boolean getWiper_blade_heater_OBSOLETE() {
        return this.wiper_blade_heater_OBSOLETE;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Float getInside_temp_celsius() {
        return this.inside_temp_celsius;
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final Boolean getIs_auto_conditioning_on() {
        return this.is_auto_conditioning_on;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final float getInside_temp_celsius_OBSOLETE() {
        return this.inside_temp_celsius_OBSOLETE;
    }

    /* JADX INFO: renamed from: G0, reason: from getter */
    public final boolean getIs_auto_conditioning_on_OBSOLETE() {
        return this.is_auto_conditioning_on_OBSOLETE;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final Integer getLeft_temp_direction() {
        return this.left_temp_direction;
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final Boolean getIs_climate_on() {
        return this.is_climate_on;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getLeft_temp_direction_OBSOLETE() {
        return this.left_temp_direction_OBSOLETE;
    }

    /* JADX INFO: renamed from: I0, reason: from getter */
    public final boolean getIs_climate_on_OBSOLETE() {
        return this.is_climate_on_OBSOLETE;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final Float getMax_avail_temp_celsius() {
        return this.max_avail_temp_celsius;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final Boolean getIs_front_defroster_on() {
        return this.is_front_defroster_on;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final float getMax_avail_temp_celsius_OBSOLETE() {
        return this.max_avail_temp_celsius_OBSOLETE;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final Float getMin_avail_temp_celsius() {
        return this.min_avail_temp_celsius;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final boolean getIs_front_defroster_on_OBSOLETE() {
        return this.is_front_defroster_on_OBSOLETE;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final float getMin_avail_temp_celsius_OBSOLETE() {
        return this.min_avail_temp_celsius_OBSOLETE;
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final Boolean getIs_preconditioning() {
        return this.is_preconditioning;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final Float getOutside_temp_celsius() {
        return this.outside_temp_celsius;
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    public final boolean getIs_preconditioning_OBSOLETE() {
        return this.is_preconditioning_OBSOLETE;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float getOutside_temp_celsius_OBSOLETE() {
        return this.outside_temp_celsius_OBSOLETE;
    }

    /* JADX INFO: renamed from: O0, reason: from getter */
    public final Boolean getIs_rear_defroster_on() {
        return this.is_rear_defroster_on;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final Float getPassenger_temp_setting() {
        return this.passenger_temp_setting;
    }

    /* JADX INFO: renamed from: P0, reason: from getter */
    public final boolean getIs_rear_defroster_on_OBSOLETE() {
        return this.is_rear_defroster_on_OBSOLETE;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final float getPassenger_temp_setting_OBSOLETE() {
        return this.passenger_temp_setting_OBSOLETE;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final Boolean getRemote_heater_control_enabled() {
        return this.remote_heater_control_enabled;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final boolean getRemote_heater_control_enabled_OBSOLETE() {
        return this.remote_heater_control_enabled_OBSOLETE;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final Integer getRight_temp_direction() {
        return this.right_temp_direction;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final int getRight_temp_direction_OBSOLETE() {
        return this.right_temp_direction_OBSOLETE;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final Integer getSeat_fan_front_left() {
        return this.seat_fan_front_left;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final int getSeat_fan_front_left_OBSOLETE() {
        return this.seat_fan_front_left_OBSOLETE;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final Integer getSeat_fan_front_right() {
        return this.seat_fan_front_right;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final int getSeat_fan_front_right_OBSOLETE() {
        return this.seat_fan_front_right_OBSOLETE;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final Integer getSeat_fan_second_row_left() {
        return this.seat_fan_second_row_left;
    }

    public final q a(float inside_temp_celsius_OBSOLETE, float outside_temp_celsius_OBSOLETE, float driver_temp_setting_OBSOLETE, float passenger_temp_setting_OBSOLETE, int left_temp_direction_OBSOLETE, int right_temp_direction_OBSOLETE, boolean is_front_defroster_on_OBSOLETE, boolean is_rear_defroster_on_OBSOLETE, int fan_status_OBSOLETE, boolean is_climate_on_OBSOLETE, float min_avail_temp_celsius_OBSOLETE, float max_avail_temp_celsius_OBSOLETE, int seat_heater_left_OBSOLETE, int seat_heater_right_OBSOLETE, int seat_heater_rear_left_OBSOLETE, int seat_heater_rear_right_OBSOLETE, int seat_heater_rear_center_OBSOLETE, int seat_heater_rear_right_back_OBSOLETE, int seat_heater_rear_left_back_OBSOLETE, int seat_heater_third_row_right_OBSOLETE, int seat_heater_third_row_left_OBSOLETE, boolean battery_heater_OBSOLETE, boolean battery_heater_no_power_OBSOLETE, boolean steering_wheel_heater_OBSOLETE, boolean wiper_blade_heater_OBSOLETE, boolean side_mirror_heaters_OBSOLETE, boolean is_preconditioning_OBSOLETE, boolean remote_heater_control_enabled_OBSOLETE, boolean bioweapon_mode_on_OBSOLETE, boolean is_auto_conditioning_on_OBSOLETE, boolean auto_seat_climate_left_OBSOLETE, boolean auto_seat_climate_right_OBSOLETE, int seat_fan_front_left_OBSOLETE, int seat_fan_front_right_OBSOLETE, boolean allow_cabin_overheat_protection_OBSOLETE, boolean supports_fan_only_cabin_overheat_protection_OBSOLETE, b cabin_overheat_protection_OBSOLETE, boolean cabin_overheat_protection_actively_cooling_OBSOLETE, float cop_activation_temp_OBSOLETE, i hvac_auto_request_OBSOLETE, c climate_keeper_mode, Instant timestamp, g defrost_mode, Float inside_temp_celsius, Float outside_temp_celsius, Float driver_temp_setting, Float passenger_temp_setting, Integer left_temp_direction, Integer right_temp_direction, Boolean is_front_defroster_on, Boolean is_rear_defroster_on, Integer fan_status, Boolean is_climate_on, Float min_avail_temp_celsius, Float max_avail_temp_celsius, Integer seat_heater_left, Integer seat_heater_right, Integer seat_heater_rear_left, Integer seat_heater_rear_right, Integer seat_heater_rear_center, Integer seat_heater_rear_right_back, Integer seat_heater_rear_left_back, Integer seat_heater_third_row_right, Integer seat_heater_third_row_left, Boolean battery_heater, Boolean battery_heater_no_power, Boolean steering_wheel_heater, Boolean wiper_blade_heater, Boolean side_mirror_heaters, Boolean is_preconditioning, Boolean remote_heater_control_enabled, Boolean bioweapon_mode_on, Boolean is_auto_conditioning_on, Boolean auto_seat_climate_left, Boolean auto_seat_climate_right, Integer seat_fan_front_left, Integer seat_fan_front_right, Integer seat_fan_second_row_left, Integer seat_fan_second_row_right, Boolean allow_cabin_overheat_protection, Boolean supports_fan_only_cabin_overheat_protection, b cabin_overheat_protection, Boolean cabin_overheat_protection_actively_cooling, f cop_activation_temperature, Boolean auto_steering_wheel_heat, ec0.a0 steering_wheel_heat_level, i hvac_auto_request, a cop_not_running_reason, h dog_mode_state, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(cabin_overheat_protection_OBSOLETE, "cabin_overheat_protection_OBSOLETE");
        p013kotlin.jvm.internal.s.k(hvac_auto_request_OBSOLETE, "hvac_auto_request_OBSOLETE");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new q(inside_temp_celsius_OBSOLETE, outside_temp_celsius_OBSOLETE, driver_temp_setting_OBSOLETE, passenger_temp_setting_OBSOLETE, left_temp_direction_OBSOLETE, right_temp_direction_OBSOLETE, is_front_defroster_on_OBSOLETE, is_rear_defroster_on_OBSOLETE, fan_status_OBSOLETE, is_climate_on_OBSOLETE, min_avail_temp_celsius_OBSOLETE, max_avail_temp_celsius_OBSOLETE, seat_heater_left_OBSOLETE, seat_heater_right_OBSOLETE, seat_heater_rear_left_OBSOLETE, seat_heater_rear_right_OBSOLETE, seat_heater_rear_center_OBSOLETE, seat_heater_rear_right_back_OBSOLETE, seat_heater_rear_left_back_OBSOLETE, seat_heater_third_row_right_OBSOLETE, seat_heater_third_row_left_OBSOLETE, battery_heater_OBSOLETE, battery_heater_no_power_OBSOLETE, steering_wheel_heater_OBSOLETE, wiper_blade_heater_OBSOLETE, side_mirror_heaters_OBSOLETE, is_preconditioning_OBSOLETE, remote_heater_control_enabled_OBSOLETE, bioweapon_mode_on_OBSOLETE, is_auto_conditioning_on_OBSOLETE, auto_seat_climate_left_OBSOLETE, auto_seat_climate_right_OBSOLETE, seat_fan_front_left_OBSOLETE, seat_fan_front_right_OBSOLETE, allow_cabin_overheat_protection_OBSOLETE, supports_fan_only_cabin_overheat_protection_OBSOLETE, cabin_overheat_protection_OBSOLETE, cabin_overheat_protection_actively_cooling_OBSOLETE, cop_activation_temp_OBSOLETE, hvac_auto_request_OBSOLETE, climate_keeper_mode, timestamp, defrost_mode, inside_temp_celsius, outside_temp_celsius, driver_temp_setting, passenger_temp_setting, left_temp_direction, right_temp_direction, is_front_defroster_on, is_rear_defroster_on, fan_status, is_climate_on, min_avail_temp_celsius, max_avail_temp_celsius, seat_heater_left, seat_heater_right, seat_heater_rear_left, seat_heater_rear_right, seat_heater_rear_center, seat_heater_rear_right_back, seat_heater_rear_left_back, seat_heater_third_row_right, seat_heater_third_row_left, battery_heater, battery_heater_no_power, steering_wheel_heater, wiper_blade_heater, side_mirror_heaters, is_preconditioning, remote_heater_control_enabled, bioweapon_mode_on, is_auto_conditioning_on, auto_seat_climate_left, auto_seat_climate_right, seat_fan_front_left, seat_fan_front_right, seat_fan_second_row_left, seat_fan_second_row_right, allow_cabin_overheat_protection, supports_fan_only_cabin_overheat_protection, cabin_overheat_protection, cabin_overheat_protection_actively_cooling, cop_activation_temperature, auto_steering_wheel_heat, steering_wheel_heat_level, hvac_auto_request, cop_not_running_reason, dog_mode_state, unknownFields);
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Integer getSeat_fan_second_row_right() {
        return this.seat_fan_second_row_right;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final Integer getSeat_heater_left() {
        return this.seat_heater_left;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getAllow_cabin_overheat_protection() {
        return this.allow_cabin_overheat_protection;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAllow_cabin_overheat_protection_OBSOLETE() {
        return this.allow_cabin_overheat_protection_OBSOLETE;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final int getSeat_heater_left_OBSOLETE() {
        return this.seat_heater_left_OBSOLETE;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getAuto_seat_climate_left() {
        return this.auto_seat_climate_left;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Integer getSeat_heater_rear_center() {
        return this.seat_heater_rear_center;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof q)) {
            return false;
        }
        q qVar = (q) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), qVar.unknownFields()) && this.inside_temp_celsius_OBSOLETE == qVar.inside_temp_celsius_OBSOLETE && this.outside_temp_celsius_OBSOLETE == qVar.outside_temp_celsius_OBSOLETE && this.driver_temp_setting_OBSOLETE == qVar.driver_temp_setting_OBSOLETE && this.passenger_temp_setting_OBSOLETE == qVar.passenger_temp_setting_OBSOLETE && this.left_temp_direction_OBSOLETE == qVar.left_temp_direction_OBSOLETE && this.right_temp_direction_OBSOLETE == qVar.right_temp_direction_OBSOLETE && this.is_front_defroster_on_OBSOLETE == qVar.is_front_defroster_on_OBSOLETE && this.is_rear_defroster_on_OBSOLETE == qVar.is_rear_defroster_on_OBSOLETE && this.fan_status_OBSOLETE == qVar.fan_status_OBSOLETE && this.is_climate_on_OBSOLETE == qVar.is_climate_on_OBSOLETE && this.min_avail_temp_celsius_OBSOLETE == qVar.min_avail_temp_celsius_OBSOLETE && this.max_avail_temp_celsius_OBSOLETE == qVar.max_avail_temp_celsius_OBSOLETE && this.seat_heater_left_OBSOLETE == qVar.seat_heater_left_OBSOLETE && this.seat_heater_right_OBSOLETE == qVar.seat_heater_right_OBSOLETE && this.seat_heater_rear_left_OBSOLETE == qVar.seat_heater_rear_left_OBSOLETE && this.seat_heater_rear_right_OBSOLETE == qVar.seat_heater_rear_right_OBSOLETE && this.seat_heater_rear_center_OBSOLETE == qVar.seat_heater_rear_center_OBSOLETE && this.seat_heater_rear_right_back_OBSOLETE == qVar.seat_heater_rear_right_back_OBSOLETE && this.seat_heater_rear_left_back_OBSOLETE == qVar.seat_heater_rear_left_back_OBSOLETE && this.seat_heater_third_row_right_OBSOLETE == qVar.seat_heater_third_row_right_OBSOLETE && this.seat_heater_third_row_left_OBSOLETE == qVar.seat_heater_third_row_left_OBSOLETE && this.battery_heater_OBSOLETE == qVar.battery_heater_OBSOLETE && this.battery_heater_no_power_OBSOLETE == qVar.battery_heater_no_power_OBSOLETE && this.steering_wheel_heater_OBSOLETE == qVar.steering_wheel_heater_OBSOLETE && this.wiper_blade_heater_OBSOLETE == qVar.wiper_blade_heater_OBSOLETE && this.side_mirror_heaters_OBSOLETE == qVar.side_mirror_heaters_OBSOLETE && this.is_preconditioning_OBSOLETE == qVar.is_preconditioning_OBSOLETE && this.remote_heater_control_enabled_OBSOLETE == qVar.remote_heater_control_enabled_OBSOLETE && this.bioweapon_mode_on_OBSOLETE == qVar.bioweapon_mode_on_OBSOLETE && this.is_auto_conditioning_on_OBSOLETE == qVar.is_auto_conditioning_on_OBSOLETE && this.auto_seat_climate_left_OBSOLETE == qVar.auto_seat_climate_left_OBSOLETE && this.auto_seat_climate_right_OBSOLETE == qVar.auto_seat_climate_right_OBSOLETE && this.seat_fan_front_left_OBSOLETE == qVar.seat_fan_front_left_OBSOLETE && this.seat_fan_front_right_OBSOLETE == qVar.seat_fan_front_right_OBSOLETE && this.allow_cabin_overheat_protection_OBSOLETE == qVar.allow_cabin_overheat_protection_OBSOLETE && this.supports_fan_only_cabin_overheat_protection_OBSOLETE == qVar.supports_fan_only_cabin_overheat_protection_OBSOLETE && this.cabin_overheat_protection_OBSOLETE == qVar.cabin_overheat_protection_OBSOLETE && this.cabin_overheat_protection_actively_cooling_OBSOLETE == qVar.cabin_overheat_protection_actively_cooling_OBSOLETE && this.cop_activation_temp_OBSOLETE == qVar.cop_activation_temp_OBSOLETE && this.hvac_auto_request_OBSOLETE == qVar.hvac_auto_request_OBSOLETE && p013kotlin.jvm.internal.s.f(this.climate_keeper_mode, qVar.climate_keeper_mode) && p013kotlin.jvm.internal.s.f(this.timestamp, qVar.timestamp) && p013kotlin.jvm.internal.s.f(this.defrost_mode, qVar.defrost_mode) && p013kotlin.jvm.internal.s.e(this.inside_temp_celsius, qVar.inside_temp_celsius) && p013kotlin.jvm.internal.s.e(this.outside_temp_celsius, qVar.outside_temp_celsius) && p013kotlin.jvm.internal.s.e(this.driver_temp_setting, qVar.driver_temp_setting) && p013kotlin.jvm.internal.s.e(this.passenger_temp_setting, qVar.passenger_temp_setting) && p013kotlin.jvm.internal.s.f(this.left_temp_direction, qVar.left_temp_direction) && p013kotlin.jvm.internal.s.f(this.right_temp_direction, qVar.right_temp_direction) && p013kotlin.jvm.internal.s.f(this.is_front_defroster_on, qVar.is_front_defroster_on) && p013kotlin.jvm.internal.s.f(this.is_rear_defroster_on, qVar.is_rear_defroster_on) && p013kotlin.jvm.internal.s.f(this.fan_status, qVar.fan_status) && p013kotlin.jvm.internal.s.f(this.is_climate_on, qVar.is_climate_on) && p013kotlin.jvm.internal.s.e(this.min_avail_temp_celsius, qVar.min_avail_temp_celsius) && p013kotlin.jvm.internal.s.e(this.max_avail_temp_celsius, qVar.max_avail_temp_celsius) && p013kotlin.jvm.internal.s.f(this.seat_heater_left, qVar.seat_heater_left) && p013kotlin.jvm.internal.s.f(this.seat_heater_right, qVar.seat_heater_right) && p013kotlin.jvm.internal.s.f(this.seat_heater_rear_left, qVar.seat_heater_rear_left) && p013kotlin.jvm.internal.s.f(this.seat_heater_rear_right, qVar.seat_heater_rear_right) && p013kotlin.jvm.internal.s.f(this.seat_heater_rear_center, qVar.seat_heater_rear_center) && p013kotlin.jvm.internal.s.f(this.seat_heater_rear_right_back, qVar.seat_heater_rear_right_back) && p013kotlin.jvm.internal.s.f(this.seat_heater_rear_left_back, qVar.seat_heater_rear_left_back) && p013kotlin.jvm.internal.s.f(this.seat_heater_third_row_right, qVar.seat_heater_third_row_right) && p013kotlin.jvm.internal.s.f(this.seat_heater_third_row_left, qVar.seat_heater_third_row_left) && p013kotlin.jvm.internal.s.f(this.battery_heater, qVar.battery_heater) && p013kotlin.jvm.internal.s.f(this.battery_heater_no_power, qVar.battery_heater_no_power) && p013kotlin.jvm.internal.s.f(this.steering_wheel_heater, qVar.steering_wheel_heater) && p013kotlin.jvm.internal.s.f(this.wiper_blade_heater, qVar.wiper_blade_heater) && p013kotlin.jvm.internal.s.f(this.side_mirror_heaters, qVar.side_mirror_heaters) && p013kotlin.jvm.internal.s.f(this.is_preconditioning, qVar.is_preconditioning) && p013kotlin.jvm.internal.s.f(this.remote_heater_control_enabled, qVar.remote_heater_control_enabled) && p013kotlin.jvm.internal.s.f(this.bioweapon_mode_on, qVar.bioweapon_mode_on) && p013kotlin.jvm.internal.s.f(this.is_auto_conditioning_on, qVar.is_auto_conditioning_on) && p013kotlin.jvm.internal.s.f(this.auto_seat_climate_left, qVar.auto_seat_climate_left) && p013kotlin.jvm.internal.s.f(this.auto_seat_climate_right, qVar.auto_seat_climate_right) && p013kotlin.jvm.internal.s.f(this.seat_fan_front_left, qVar.seat_fan_front_left) && p013kotlin.jvm.internal.s.f(this.seat_fan_front_right, qVar.seat_fan_front_right) && p013kotlin.jvm.internal.s.f(this.seat_fan_second_row_left, qVar.seat_fan_second_row_left) && p013kotlin.jvm.internal.s.f(this.seat_fan_second_row_right, qVar.seat_fan_second_row_right) && p013kotlin.jvm.internal.s.f(this.allow_cabin_overheat_protection, qVar.allow_cabin_overheat_protection) && p013kotlin.jvm.internal.s.f(this.supports_fan_only_cabin_overheat_protection, qVar.supports_fan_only_cabin_overheat_protection) && this.cabin_overheat_protection == qVar.cabin_overheat_protection && p013kotlin.jvm.internal.s.f(this.cabin_overheat_protection_actively_cooling, qVar.cabin_overheat_protection_actively_cooling) && this.cop_activation_temperature == qVar.cop_activation_temperature && p013kotlin.jvm.internal.s.f(this.auto_steering_wheel_heat, qVar.auto_steering_wheel_heat) && this.steering_wheel_heat_level == qVar.steering_wheel_heat_level && this.hvac_auto_request == qVar.hvac_auto_request && this.cop_not_running_reason == qVar.cop_not_running_reason && this.dog_mode_state == qVar.dog_mode_state;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getAuto_seat_climate_left_OBSOLETE() {
        return this.auto_seat_climate_left_OBSOLETE;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final int getSeat_heater_rear_center_OBSOLETE() {
        return this.seat_heater_rear_center_OBSOLETE;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getAuto_seat_climate_right() {
        return this.auto_seat_climate_right;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final Integer getSeat_heater_rear_left() {
        return this.seat_heater_rear_left;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getAuto_seat_climate_right_OBSOLETE() {
        return this.auto_seat_climate_right_OBSOLETE;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final int getSeat_heater_rear_left_OBSOLETE() {
        return this.seat_heater_rear_left_OBSOLETE;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Float.hashCode(this.inside_temp_celsius_OBSOLETE)) * 37) + Float.hashCode(this.outside_temp_celsius_OBSOLETE)) * 37) + Float.hashCode(this.driver_temp_setting_OBSOLETE)) * 37) + Float.hashCode(this.passenger_temp_setting_OBSOLETE)) * 37) + Integer.hashCode(this.left_temp_direction_OBSOLETE)) * 37) + Integer.hashCode(this.right_temp_direction_OBSOLETE)) * 37) + Boolean.hashCode(this.is_front_defroster_on_OBSOLETE)) * 37) + Boolean.hashCode(this.is_rear_defroster_on_OBSOLETE)) * 37) + Integer.hashCode(this.fan_status_OBSOLETE)) * 37) + Boolean.hashCode(this.is_climate_on_OBSOLETE)) * 37) + Float.hashCode(this.min_avail_temp_celsius_OBSOLETE)) * 37) + Float.hashCode(this.max_avail_temp_celsius_OBSOLETE)) * 37) + Integer.hashCode(this.seat_heater_left_OBSOLETE)) * 37) + Integer.hashCode(this.seat_heater_right_OBSOLETE)) * 37) + Integer.hashCode(this.seat_heater_rear_left_OBSOLETE)) * 37) + Integer.hashCode(this.seat_heater_rear_right_OBSOLETE)) * 37) + Integer.hashCode(this.seat_heater_rear_center_OBSOLETE)) * 37) + Integer.hashCode(this.seat_heater_rear_right_back_OBSOLETE)) * 37) + Integer.hashCode(this.seat_heater_rear_left_back_OBSOLETE)) * 37) + Integer.hashCode(this.seat_heater_third_row_right_OBSOLETE)) * 37) + Integer.hashCode(this.seat_heater_third_row_left_OBSOLETE)) * 37) + Boolean.hashCode(this.battery_heater_OBSOLETE)) * 37) + Boolean.hashCode(this.battery_heater_no_power_OBSOLETE)) * 37) + Boolean.hashCode(this.steering_wheel_heater_OBSOLETE)) * 37) + Boolean.hashCode(this.wiper_blade_heater_OBSOLETE)) * 37) + Boolean.hashCode(this.side_mirror_heaters_OBSOLETE)) * 37) + Boolean.hashCode(this.is_preconditioning_OBSOLETE)) * 37) + Boolean.hashCode(this.remote_heater_control_enabled_OBSOLETE)) * 37) + Boolean.hashCode(this.bioweapon_mode_on_OBSOLETE)) * 37) + Boolean.hashCode(this.is_auto_conditioning_on_OBSOLETE)) * 37) + Boolean.hashCode(this.auto_seat_climate_left_OBSOLETE)) * 37) + Boolean.hashCode(this.auto_seat_climate_right_OBSOLETE)) * 37) + Integer.hashCode(this.seat_fan_front_left_OBSOLETE)) * 37) + Integer.hashCode(this.seat_fan_front_right_OBSOLETE)) * 37) + Boolean.hashCode(this.allow_cabin_overheat_protection_OBSOLETE)) * 37) + Boolean.hashCode(this.supports_fan_only_cabin_overheat_protection_OBSOLETE)) * 37) + this.cabin_overheat_protection_OBSOLETE.hashCode()) * 37) + Boolean.hashCode(this.cabin_overheat_protection_actively_cooling_OBSOLETE)) * 37) + Float.hashCode(this.cop_activation_temp_OBSOLETE)) * 37) + this.hvac_auto_request_OBSOLETE.hashCode()) * 37;
        c cVar = this.climate_keeper_mode;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode3 = (iHashCode2 + (instant != null ? instant.hashCode() : 0)) * 37;
        g gVar = this.defrost_mode;
        int iHashCode4 = (iHashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 37;
        Float f11 = this.inside_temp_celsius;
        int iHashCode5 = (iHashCode4 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.outside_temp_celsius;
        int iHashCode6 = (iHashCode5 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.driver_temp_setting;
        int iHashCode7 = (iHashCode6 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.passenger_temp_setting;
        int iHashCode8 = (iHashCode7 + (f14 != null ? f14.hashCode() : 0)) * 37;
        Integer num = this.left_temp_direction;
        int iHashCode9 = (iHashCode8 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.right_temp_direction;
        int iHashCode10 = (iHashCode9 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool = this.is_front_defroster_on;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.is_rear_defroster_on;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Integer num3 = this.fan_status;
        int iHashCode13 = (iHashCode12 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_climate_on;
        int iHashCode14 = (iHashCode13 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        Float f15 = this.min_avail_temp_celsius;
        int iHashCode15 = (iHashCode14 + (f15 != null ? f15.hashCode() : 0)) * 37;
        Float f16 = this.max_avail_temp_celsius;
        int iHashCode16 = (iHashCode15 + (f16 != null ? f16.hashCode() : 0)) * 37;
        Integer num4 = this.seat_heater_left;
        int iHashCode17 = (iHashCode16 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.seat_heater_right;
        int iHashCode18 = (iHashCode17 + (num5 != null ? num5.hashCode() : 0)) * 37;
        Integer num6 = this.seat_heater_rear_left;
        int iHashCode19 = (iHashCode18 + (num6 != null ? num6.hashCode() : 0)) * 37;
        Integer num7 = this.seat_heater_rear_right;
        int iHashCode20 = (iHashCode19 + (num7 != null ? num7.hashCode() : 0)) * 37;
        Integer num8 = this.seat_heater_rear_center;
        int iHashCode21 = (iHashCode20 + (num8 != null ? num8.hashCode() : 0)) * 37;
        Integer num9 = this.seat_heater_rear_right_back;
        int iHashCode22 = (iHashCode21 + (num9 != null ? num9.hashCode() : 0)) * 37;
        Integer num10 = this.seat_heater_rear_left_back;
        int iHashCode23 = (iHashCode22 + (num10 != null ? num10.hashCode() : 0)) * 37;
        Integer num11 = this.seat_heater_third_row_right;
        int iHashCode24 = (iHashCode23 + (num11 != null ? num11.hashCode() : 0)) * 37;
        Integer num12 = this.seat_heater_third_row_left;
        int iHashCode25 = (iHashCode24 + (num12 != null ? num12.hashCode() : 0)) * 37;
        Boolean bool4 = this.battery_heater;
        int iHashCode26 = (iHashCode25 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.battery_heater_no_power;
        int iHashCode27 = (iHashCode26 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.steering_wheel_heater;
        int iHashCode28 = (iHashCode27 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.wiper_blade_heater;
        int iHashCode29 = (iHashCode28 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        Boolean bool8 = this.side_mirror_heaters;
        int iHashCode30 = (iHashCode29 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        Boolean bool9 = this.is_preconditioning;
        int iHashCode31 = (iHashCode30 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        Boolean bool10 = this.remote_heater_control_enabled;
        int iHashCode32 = (iHashCode31 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
        Boolean bool11 = this.bioweapon_mode_on;
        int iHashCode33 = (iHashCode32 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
        Boolean bool12 = this.is_auto_conditioning_on;
        int iHashCode34 = (iHashCode33 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
        Boolean bool13 = this.auto_seat_climate_left;
        int iHashCode35 = (iHashCode34 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
        Boolean bool14 = this.auto_seat_climate_right;
        int iHashCode36 = (iHashCode35 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
        Integer num13 = this.seat_fan_front_left;
        int iHashCode37 = (iHashCode36 + (num13 != null ? num13.hashCode() : 0)) * 37;
        Integer num14 = this.seat_fan_front_right;
        int iHashCode38 = (iHashCode37 + (num14 != null ? num14.hashCode() : 0)) * 37;
        Integer num15 = this.seat_fan_second_row_left;
        int iHashCode39 = (iHashCode38 + (num15 != null ? num15.hashCode() : 0)) * 37;
        Integer num16 = this.seat_fan_second_row_right;
        int iHashCode40 = (iHashCode39 + (num16 != null ? num16.hashCode() : 0)) * 37;
        Boolean bool15 = this.allow_cabin_overheat_protection;
        int iHashCode41 = (iHashCode40 + (bool15 != null ? bool15.hashCode() : 0)) * 37;
        Boolean bool16 = this.supports_fan_only_cabin_overheat_protection;
        int iHashCode42 = (iHashCode41 + (bool16 != null ? bool16.hashCode() : 0)) * 37;
        b bVar = this.cabin_overheat_protection;
        int iHashCode43 = (iHashCode42 + (bVar != null ? bVar.hashCode() : 0)) * 37;
        Boolean bool17 = this.cabin_overheat_protection_actively_cooling;
        int iHashCode44 = (iHashCode43 + (bool17 != null ? bool17.hashCode() : 0)) * 37;
        f fVar = this.cop_activation_temperature;
        int iHashCode45 = (iHashCode44 + (fVar != null ? fVar.hashCode() : 0)) * 37;
        Boolean bool18 = this.auto_steering_wheel_heat;
        int iHashCode46 = (iHashCode45 + (bool18 != null ? bool18.hashCode() : 0)) * 37;
        ec0.a0 a0Var = this.steering_wheel_heat_level;
        int iHashCode47 = (iHashCode46 + (a0Var != null ? a0Var.hashCode() : 0)) * 37;
        i iVar = this.hvac_auto_request;
        int iHashCode48 = (iHashCode47 + (iVar != null ? iVar.hashCode() : 0)) * 37;
        a aVar = this.cop_not_running_reason;
        int iHashCode49 = (iHashCode48 + (aVar != null ? aVar.hashCode() : 0)) * 37;
        h hVar = this.dog_mode_state;
        int iHashCode50 = iHashCode49 + (hVar != null ? hVar.hashCode() : 0);
        this.hashCode = iHashCode50;
        return iHashCode50;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getAuto_steering_wheel_heat() {
        return this.auto_steering_wheel_heat;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final Integer getSeat_heater_rear_left_back() {
        return this.seat_heater_rear_left_back;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getBattery_heater() {
        return this.battery_heater;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final int getSeat_heater_rear_left_back_OBSOLETE() {
        return this.seat_heater_rear_left_back_OBSOLETE;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getBattery_heater_OBSOLETE() {
        return this.battery_heater_OBSOLETE;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Integer getSeat_heater_rear_right() {
        return this.seat_heater_rear_right;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Boolean getBattery_heater_no_power() {
        return this.battery_heater_no_power;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final int getSeat_heater_rear_right_OBSOLETE() {
        return this.seat_heater_rear_right_OBSOLETE;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getBattery_heater_no_power_OBSOLETE() {
        return this.battery_heater_no_power_OBSOLETE;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final Integer getSeat_heater_rear_right_back() {
        return this.seat_heater_rear_right_back;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getBioweapon_mode_on() {
        return this.bioweapon_mode_on;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final int getSeat_heater_rear_right_back_OBSOLETE() {
        return this.seat_heater_rear_right_back_OBSOLETE;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m428newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getBioweapon_mode_on_OBSOLETE() {
        return this.bioweapon_mode_on_OBSOLETE;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final Integer getSeat_heater_right() {
        return this.seat_heater_right;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final b getCabin_overheat_protection() {
        return this.cabin_overheat_protection;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final int getSeat_heater_right_OBSOLETE() {
        return this.seat_heater_right_OBSOLETE;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final b getCabin_overheat_protection_OBSOLETE() {
        return this.cabin_overheat_protection_OBSOLETE;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final Integer getSeat_heater_third_row_left() {
        return this.seat_heater_third_row_left;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Boolean getCabin_overheat_protection_actively_cooling() {
        return this.cabin_overheat_protection_actively_cooling;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final int getSeat_heater_third_row_left_OBSOLETE() {
        return this.seat_heater_third_row_left_OBSOLETE;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getCabin_overheat_protection_actively_cooling_OBSOLETE() {
        return this.cabin_overheat_protection_actively_cooling_OBSOLETE;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final c getClimate_keeper_mode() {
        return this.climate_keeper_mode;
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final Integer getSeat_heater_third_row_right() {
        return this.seat_heater_third_row_right;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("inside_temp_celsius_OBSOLETE=" + this.inside_temp_celsius_OBSOLETE);
        arrayList.add("outside_temp_celsius_OBSOLETE=" + this.outside_temp_celsius_OBSOLETE);
        arrayList.add("driver_temp_setting_OBSOLETE=" + this.driver_temp_setting_OBSOLETE);
        arrayList.add("passenger_temp_setting_OBSOLETE=" + this.passenger_temp_setting_OBSOLETE);
        arrayList.add("left_temp_direction_OBSOLETE=" + this.left_temp_direction_OBSOLETE);
        arrayList.add("right_temp_direction_OBSOLETE=" + this.right_temp_direction_OBSOLETE);
        arrayList.add("is_front_defroster_on_OBSOLETE=" + this.is_front_defroster_on_OBSOLETE);
        arrayList.add("is_rear_defroster_on_OBSOLETE=" + this.is_rear_defroster_on_OBSOLETE);
        arrayList.add("fan_status_OBSOLETE=" + this.fan_status_OBSOLETE);
        arrayList.add("is_climate_on_OBSOLETE=" + this.is_climate_on_OBSOLETE);
        arrayList.add("min_avail_temp_celsius_OBSOLETE=" + this.min_avail_temp_celsius_OBSOLETE);
        arrayList.add("max_avail_temp_celsius_OBSOLETE=" + this.max_avail_temp_celsius_OBSOLETE);
        arrayList.add("seat_heater_left_OBSOLETE=" + this.seat_heater_left_OBSOLETE);
        arrayList.add("seat_heater_right_OBSOLETE=" + this.seat_heater_right_OBSOLETE);
        arrayList.add("seat_heater_rear_left_OBSOLETE=" + this.seat_heater_rear_left_OBSOLETE);
        arrayList.add("seat_heater_rear_right_OBSOLETE=" + this.seat_heater_rear_right_OBSOLETE);
        arrayList.add("seat_heater_rear_center_OBSOLETE=" + this.seat_heater_rear_center_OBSOLETE);
        arrayList.add("seat_heater_rear_right_back_OBSOLETE=" + this.seat_heater_rear_right_back_OBSOLETE);
        arrayList.add("seat_heater_rear_left_back_OBSOLETE=" + this.seat_heater_rear_left_back_OBSOLETE);
        arrayList.add("seat_heater_third_row_right_OBSOLETE=" + this.seat_heater_third_row_right_OBSOLETE);
        arrayList.add("seat_heater_third_row_left_OBSOLETE=" + this.seat_heater_third_row_left_OBSOLETE);
        arrayList.add("battery_heater_OBSOLETE=" + this.battery_heater_OBSOLETE);
        arrayList.add("battery_heater_no_power_OBSOLETE=" + this.battery_heater_no_power_OBSOLETE);
        arrayList.add("steering_wheel_heater_OBSOLETE=" + this.steering_wheel_heater_OBSOLETE);
        arrayList.add("wiper_blade_heater_OBSOLETE=" + this.wiper_blade_heater_OBSOLETE);
        arrayList.add("side_mirror_heaters_OBSOLETE=" + this.side_mirror_heaters_OBSOLETE);
        arrayList.add("is_preconditioning_OBSOLETE=" + this.is_preconditioning_OBSOLETE);
        arrayList.add("remote_heater_control_enabled_OBSOLETE=" + this.remote_heater_control_enabled_OBSOLETE);
        arrayList.add("bioweapon_mode_on_OBSOLETE=" + this.bioweapon_mode_on_OBSOLETE);
        arrayList.add("is_auto_conditioning_on_OBSOLETE=" + this.is_auto_conditioning_on_OBSOLETE);
        arrayList.add("auto_seat_climate_left_OBSOLETE=" + this.auto_seat_climate_left_OBSOLETE);
        arrayList.add("auto_seat_climate_right_OBSOLETE=" + this.auto_seat_climate_right_OBSOLETE);
        arrayList.add("seat_fan_front_left_OBSOLETE=" + this.seat_fan_front_left_OBSOLETE);
        arrayList.add("seat_fan_front_right_OBSOLETE=" + this.seat_fan_front_right_OBSOLETE);
        arrayList.add("allow_cabin_overheat_protection_OBSOLETE=" + this.allow_cabin_overheat_protection_OBSOLETE);
        arrayList.add("supports_fan_only_cabin_overheat_protection_OBSOLETE=" + this.supports_fan_only_cabin_overheat_protection_OBSOLETE);
        arrayList.add("cabin_overheat_protection_OBSOLETE=" + this.cabin_overheat_protection_OBSOLETE);
        arrayList.add("cabin_overheat_protection_actively_cooling_OBSOLETE=" + this.cabin_overheat_protection_actively_cooling_OBSOLETE);
        arrayList.add("cop_activation_temp_OBSOLETE=" + this.cop_activation_temp_OBSOLETE);
        arrayList.add("hvac_auto_request_OBSOLETE=" + this.hvac_auto_request_OBSOLETE);
        c cVar = this.climate_keeper_mode;
        if (cVar != null) {
            arrayList.add("climate_keeper_mode=" + cVar);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
        }
        g gVar = this.defrost_mode;
        if (gVar != null) {
            arrayList.add("defrost_mode=" + gVar);
        }
        Float f11 = this.inside_temp_celsius;
        if (f11 != null) {
            arrayList.add("inside_temp_celsius=" + f11);
        }
        Float f12 = this.outside_temp_celsius;
        if (f12 != null) {
            arrayList.add("outside_temp_celsius=" + f12);
        }
        Float f13 = this.driver_temp_setting;
        if (f13 != null) {
            arrayList.add("driver_temp_setting=" + f13);
        }
        Float f14 = this.passenger_temp_setting;
        if (f14 != null) {
            arrayList.add("passenger_temp_setting=" + f14);
        }
        Integer num = this.left_temp_direction;
        if (num != null) {
            arrayList.add("left_temp_direction=" + num);
        }
        Integer num2 = this.right_temp_direction;
        if (num2 != null) {
            arrayList.add("right_temp_direction=" + num2);
        }
        Boolean bool = this.is_front_defroster_on;
        if (bool != null) {
            arrayList.add("is_front_defroster_on=" + bool);
        }
        Boolean bool2 = this.is_rear_defroster_on;
        if (bool2 != null) {
            arrayList.add("is_rear_defroster_on=" + bool2);
        }
        Integer num3 = this.fan_status;
        if (num3 != null) {
            arrayList.add("fan_status=" + num3);
        }
        Boolean bool3 = this.is_climate_on;
        if (bool3 != null) {
            arrayList.add("is_climate_on=" + bool3);
        }
        Float f15 = this.min_avail_temp_celsius;
        if (f15 != null) {
            arrayList.add("min_avail_temp_celsius=" + f15);
        }
        Float f16 = this.max_avail_temp_celsius;
        if (f16 != null) {
            arrayList.add("max_avail_temp_celsius=" + f16);
        }
        Integer num4 = this.seat_heater_left;
        if (num4 != null) {
            arrayList.add("seat_heater_left=" + num4);
        }
        Integer num5 = this.seat_heater_right;
        if (num5 != null) {
            arrayList.add("seat_heater_right=" + num5);
        }
        Integer num6 = this.seat_heater_rear_left;
        if (num6 != null) {
            arrayList.add("seat_heater_rear_left=" + num6);
        }
        Integer num7 = this.seat_heater_rear_right;
        if (num7 != null) {
            arrayList.add("seat_heater_rear_right=" + num7);
        }
        Integer num8 = this.seat_heater_rear_center;
        if (num8 != null) {
            arrayList.add("seat_heater_rear_center=" + num8);
        }
        Integer num9 = this.seat_heater_rear_right_back;
        if (num9 != null) {
            arrayList.add("seat_heater_rear_right_back=" + num9);
        }
        Integer num10 = this.seat_heater_rear_left_back;
        if (num10 != null) {
            arrayList.add("seat_heater_rear_left_back=" + num10);
        }
        Integer num11 = this.seat_heater_third_row_right;
        if (num11 != null) {
            arrayList.add("seat_heater_third_row_right=" + num11);
        }
        Integer num12 = this.seat_heater_third_row_left;
        if (num12 != null) {
            arrayList.add("seat_heater_third_row_left=" + num12);
        }
        Boolean bool4 = this.battery_heater;
        if (bool4 != null) {
            arrayList.add("battery_heater=" + bool4);
        }
        Boolean bool5 = this.battery_heater_no_power;
        if (bool5 != null) {
            arrayList.add("battery_heater_no_power=" + bool5);
        }
        Boolean bool6 = this.steering_wheel_heater;
        if (bool6 != null) {
            arrayList.add("steering_wheel_heater=" + bool6);
        }
        Boolean bool7 = this.wiper_blade_heater;
        if (bool7 != null) {
            arrayList.add("wiper_blade_heater=" + bool7);
        }
        Boolean bool8 = this.side_mirror_heaters;
        if (bool8 != null) {
            arrayList.add("side_mirror_heaters=" + bool8);
        }
        Boolean bool9 = this.is_preconditioning;
        if (bool9 != null) {
            arrayList.add("is_preconditioning=" + bool9);
        }
        Boolean bool10 = this.remote_heater_control_enabled;
        if (bool10 != null) {
            arrayList.add("remote_heater_control_enabled=" + bool10);
        }
        Boolean bool11 = this.bioweapon_mode_on;
        if (bool11 != null) {
            arrayList.add("bioweapon_mode_on=" + bool11);
        }
        Boolean bool12 = this.is_auto_conditioning_on;
        if (bool12 != null) {
            arrayList.add("is_auto_conditioning_on=" + bool12);
        }
        Boolean bool13 = this.auto_seat_climate_left;
        if (bool13 != null) {
            arrayList.add("auto_seat_climate_left=" + bool13);
        }
        Boolean bool14 = this.auto_seat_climate_right;
        if (bool14 != null) {
            arrayList.add("auto_seat_climate_right=" + bool14);
        }
        Integer num13 = this.seat_fan_front_left;
        if (num13 != null) {
            arrayList.add("seat_fan_front_left=" + num13);
        }
        Integer num14 = this.seat_fan_front_right;
        if (num14 != null) {
            arrayList.add("seat_fan_front_right=" + num14);
        }
        Integer num15 = this.seat_fan_second_row_left;
        if (num15 != null) {
            arrayList.add("seat_fan_second_row_left=" + num15);
        }
        Integer num16 = this.seat_fan_second_row_right;
        if (num16 != null) {
            arrayList.add("seat_fan_second_row_right=" + num16);
        }
        Boolean bool15 = this.allow_cabin_overheat_protection;
        if (bool15 != null) {
            arrayList.add("allow_cabin_overheat_protection=" + bool15);
        }
        Boolean bool16 = this.supports_fan_only_cabin_overheat_protection;
        if (bool16 != null) {
            arrayList.add("supports_fan_only_cabin_overheat_protection=" + bool16);
        }
        b bVar = this.cabin_overheat_protection;
        if (bVar != null) {
            arrayList.add("cabin_overheat_protection=" + bVar);
        }
        Boolean bool17 = this.cabin_overheat_protection_actively_cooling;
        if (bool17 != null) {
            arrayList.add("cabin_overheat_protection_actively_cooling=" + bool17);
        }
        f fVar = this.cop_activation_temperature;
        if (fVar != null) {
            arrayList.add("cop_activation_temperature=" + fVar);
        }
        Boolean bool18 = this.auto_steering_wheel_heat;
        if (bool18 != null) {
            arrayList.add("auto_steering_wheel_heat=" + bool18);
        }
        ec0.a0 a0Var = this.steering_wheel_heat_level;
        if (a0Var != null) {
            arrayList.add("steering_wheel_heat_level=" + a0Var);
        }
        i iVar = this.hvac_auto_request;
        if (iVar != null) {
            arrayList.add("hvac_auto_request=" + iVar);
        }
        a aVar = this.cop_not_running_reason;
        if (aVar != null) {
            arrayList.add("cop_not_running_reason=" + aVar);
        }
        h hVar = this.dog_mode_state;
        if (hVar != null) {
            arrayList.add("dog_mode_state=" + hVar);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "ClimateState{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getCop_activation_temp_OBSOLETE() {
        return this.cop_activation_temp_OBSOLETE;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final int getSeat_heater_third_row_right_OBSOLETE() {
        return this.seat_heater_third_row_right_OBSOLETE;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final f getCop_activation_temperature() {
        return this.cop_activation_temperature;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final Boolean getSide_mirror_heaters() {
        return this.side_mirror_heaters;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final a getCop_not_running_reason() {
        return this.cop_not_running_reason;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final boolean getSide_mirror_heaters_OBSOLETE() {
        return this.side_mirror_heaters_OBSOLETE;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final g getDefrost_mode() {
        return this.defrost_mode;
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final ec0.a0 getSteering_wheel_heat_level() {
        return this.steering_wheel_heat_level;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final h getDog_mode_state() {
        return this.dog_mode_state;
    }

    /* JADX INFO: renamed from: y0, reason: from getter */
    public final Boolean getSteering_wheel_heater() {
        return this.steering_wheel_heater;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Float getDriver_temp_setting() {
        return this.driver_temp_setting;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final boolean getSteering_wheel_heater_OBSOLETE() {
        return this.steering_wheel_heater_OBSOLETE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ q(float f11, float f12, float f13, float f14, int i11, int i12, boolean z11, boolean z12, int i13, boolean z13, float f15, float f16, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, int i24, int i25, boolean z26, boolean z27, b bVar, boolean z28, float f17, i iVar, c cVar, Instant instant, g gVar, Float f18, Float f19, Float f21, Float f22, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Float f23, Float f24, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num13, Integer num14, Integer num15, Integer num16, Boolean bool15, Boolean bool16, b bVar2, Boolean bool17, f fVar, Boolean bool18, ec0.a0 a0Var, i iVar2, a aVar, h hVar, okio.k kVar, int i26, int i27, int i28, DefaultConstructorMarker defaultConstructorMarker) {
        float f25 = (i26 & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f11;
        float f26 = (i26 & 2) != 0 ? BitmapDescriptorFactory.HUE_RED : f12;
        float f27 = (i26 & 4) != 0 ? BitmapDescriptorFactory.HUE_RED : f13;
        float f28 = (i26 & 8) != 0 ? BitmapDescriptorFactory.HUE_RED : f14;
        int i29 = (i26 & 16) != 0 ? 0 : i11;
        int i31 = (i26 & 32) != 0 ? 0 : i12;
        boolean z29 = (i26 & 64) != 0 ? false : z11;
        boolean z31 = (i26 & 128) != 0 ? false : z12;
        int i32 = (i26 & 256) != 0 ? 0 : i13;
        boolean z32 = (i26 & 512) != 0 ? false : z13;
        float f29 = (i26 & 1024) != 0 ? BitmapDescriptorFactory.HUE_RED : f15;
        float f31 = (i26 & 2048) != 0 ? BitmapDescriptorFactory.HUE_RED : f16;
        int i33 = (i26 & 4096) != 0 ? 0 : i14;
        float f32 = f25;
        int i34 = (i26 & PKIFailureInfo.certRevoked) != 0 ? 0 : i15;
        int i35 = (i26 & 16384) != 0 ? 0 : i16;
        int i36 = (i26 & 32768) != 0 ? 0 : i17;
        int i37 = (i26 & 65536) != 0 ? 0 : i18;
        int i38 = (i26 & 131072) != 0 ? 0 : i19;
        int i39 = (i26 & 262144) != 0 ? 0 : i21;
        int i41 = (i26 & PKIFailureInfo.signerNotTrusted) != 0 ? 0 : i22;
        int i42 = (i26 & PKIFailureInfo.badCertTemplate) != 0 ? 0 : i23;
        boolean z33 = (i26 & PKIFailureInfo.badSenderNonce) != 0 ? false : z14;
        boolean z34 = (i26 & 4194304) != 0 ? false : z15;
        boolean z35 = (i26 & 8388608) != 0 ? false : z16;
        boolean z36 = (i26 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z17;
        boolean z37 = (i26 & 33554432) != 0 ? false : z18;
        boolean z38 = (i26 & 67108864) != 0 ? false : z19;
        boolean z39 = (i26 & 134217728) != 0 ? false : z21;
        boolean z41 = (i26 & 268435456) != 0 ? false : z22;
        boolean z42 = (i26 & PKIFailureInfo.duplicateCertReq) != 0 ? false : z23;
        boolean z43 = (i26 & 1073741824) != 0 ? false : z24;
        boolean z44 = (i26 & Integer.MIN_VALUE) != 0 ? false : z25;
        this(f32, f26, f27, f28, i29, i31, z29, z31, i32, z32, f29, f31, i33, i34, i35, i36, i37, i38, i39, i41, i42, z33, z34, z35, z36, z37, z38, z39, z41, z42, z43, z44, (i27 & 1) != 0 ? 0 : i24, (i27 & 2) != 0 ? 0 : i25, (i27 & 4) != 0 ? false : z26, (i27 & 8) != 0 ? false : z27, (i27 & 16) != 0 ? b.CabinOverheatProtectionOff : bVar, (i27 & 32) != 0 ? false : z28, (i27 & 64) != 0 ? BitmapDescriptorFactory.HUE_RED : f17, (i27 & 128) != 0 ? i.HvacAutoRequestOn : iVar, (i27 & 256) != 0 ? null : cVar, (i27 & 512) != 0 ? null : instant, (i27 & 1024) != 0 ? null : gVar, (i27 & 2048) != 0 ? null : f18, (i27 & 4096) != 0 ? null : f19, (i27 & PKIFailureInfo.certRevoked) != 0 ? null : f21, (i27 & 16384) != 0 ? null : f22, (i27 & 32768) != 0 ? null : num, (i27 & 65536) != 0 ? null : num2, (i27 & 131072) != 0 ? null : bool, (i27 & 262144) != 0 ? null : bool2, (i27 & PKIFailureInfo.signerNotTrusted) != 0 ? null : num3, (i27 & PKIFailureInfo.badCertTemplate) != 0 ? null : bool3, (i27 & PKIFailureInfo.badSenderNonce) != 0 ? null : f23, (i27 & 4194304) != 0 ? null : f24, (i27 & 8388608) != 0 ? null : num4, (i27 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num5, (i27 & 33554432) != 0 ? null : num6, (i27 & 67108864) != 0 ? null : num7, (i27 & 134217728) != 0 ? null : num8, (i27 & 268435456) != 0 ? null : num9, (i27 & PKIFailureInfo.duplicateCertReq) != 0 ? null : num10, (i27 & 1073741824) != 0 ? null : num11, (i27 & Integer.MIN_VALUE) != 0 ? null : num12, (i28 & 1) != 0 ? null : bool4, (i28 & 2) != 0 ? null : bool5, (i28 & 4) != 0 ? null : bool6, (i28 & 8) != 0 ? null : bool7, (i28 & 16) != 0 ? null : bool8, (i28 & 32) != 0 ? null : bool9, (i28 & 64) != 0 ? null : bool10, (i28 & 128) != 0 ? null : bool11, (i28 & 256) != 0 ? null : bool12, (i28 & 512) != 0 ? null : bool13, (i28 & 1024) != 0 ? null : bool14, (i28 & 2048) != 0 ? null : num13, (i28 & 4096) != 0 ? null : num14, (i28 & PKIFailureInfo.certRevoked) != 0 ? null : num15, (i28 & 16384) != 0 ? null : num16, (i28 & 32768) != 0 ? null : bool15, (i28 & 65536) != 0 ? null : bool16, (i28 & 131072) != 0 ? null : bVar2, (i28 & 262144) != 0 ? null : bool17, (i28 & PKIFailureInfo.signerNotTrusted) != 0 ? null : fVar, (i28 & PKIFailureInfo.badCertTemplate) != 0 ? null : bool18, (i28 & PKIFailureInfo.badSenderNonce) != 0 ? null : a0Var, (i28 & 4194304) != 0 ? null : iVar2, (i28 & 8388608) != 0 ? null : aVar, (i28 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0 ? hVar : null, (i28 & 33554432) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m428newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(float f11, float f12, float f13, float f14, int i11, int i12, boolean z11, boolean z12, int i13, boolean z13, float f15, float f16, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, int i24, int i25, boolean z26, boolean z27, b cabin_overheat_protection_OBSOLETE, boolean z28, float f17, i hvac_auto_request_OBSOLETE, c cVar, Instant instant, g gVar, Float f18, Float f19, Float f21, Float f22, Integer num, Integer num2, Boolean bool, Boolean bool2, Integer num3, Boolean bool3, Float f23, Float f24, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Integer num13, Integer num14, Integer num15, Integer num16, Boolean bool15, Boolean bool16, b bVar, Boolean bool17, f fVar, Boolean bool18, ec0.a0 a0Var, i iVar, a aVar, h hVar, okio.k unknownFields) {
        super(M0, unknownFields);
        p013kotlin.jvm.internal.s.k(cabin_overheat_protection_OBSOLETE, "cabin_overheat_protection_OBSOLETE");
        p013kotlin.jvm.internal.s.k(hvac_auto_request_OBSOLETE, "hvac_auto_request_OBSOLETE");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.inside_temp_celsius_OBSOLETE = f11;
        this.outside_temp_celsius_OBSOLETE = f12;
        this.driver_temp_setting_OBSOLETE = f13;
        this.passenger_temp_setting_OBSOLETE = f14;
        this.left_temp_direction_OBSOLETE = i11;
        this.right_temp_direction_OBSOLETE = i12;
        this.is_front_defroster_on_OBSOLETE = z11;
        this.is_rear_defroster_on_OBSOLETE = z12;
        this.fan_status_OBSOLETE = i13;
        this.is_climate_on_OBSOLETE = z13;
        this.min_avail_temp_celsius_OBSOLETE = f15;
        this.max_avail_temp_celsius_OBSOLETE = f16;
        this.seat_heater_left_OBSOLETE = i14;
        this.seat_heater_right_OBSOLETE = i15;
        this.seat_heater_rear_left_OBSOLETE = i16;
        this.seat_heater_rear_right_OBSOLETE = i17;
        this.seat_heater_rear_center_OBSOLETE = i18;
        this.seat_heater_rear_right_back_OBSOLETE = i19;
        this.seat_heater_rear_left_back_OBSOLETE = i21;
        this.seat_heater_third_row_right_OBSOLETE = i22;
        this.seat_heater_third_row_left_OBSOLETE = i23;
        this.battery_heater_OBSOLETE = z14;
        this.battery_heater_no_power_OBSOLETE = z15;
        this.steering_wheel_heater_OBSOLETE = z16;
        this.wiper_blade_heater_OBSOLETE = z17;
        this.side_mirror_heaters_OBSOLETE = z18;
        this.is_preconditioning_OBSOLETE = z19;
        this.remote_heater_control_enabled_OBSOLETE = z21;
        this.bioweapon_mode_on_OBSOLETE = z22;
        this.is_auto_conditioning_on_OBSOLETE = z23;
        this.auto_seat_climate_left_OBSOLETE = z24;
        this.auto_seat_climate_right_OBSOLETE = z25;
        this.seat_fan_front_left_OBSOLETE = i24;
        this.seat_fan_front_right_OBSOLETE = i25;
        this.allow_cabin_overheat_protection_OBSOLETE = z26;
        this.supports_fan_only_cabin_overheat_protection_OBSOLETE = z27;
        this.cabin_overheat_protection_OBSOLETE = cabin_overheat_protection_OBSOLETE;
        this.cabin_overheat_protection_actively_cooling_OBSOLETE = z28;
        this.cop_activation_temp_OBSOLETE = f17;
        this.hvac_auto_request_OBSOLETE = hvac_auto_request_OBSOLETE;
        this.climate_keeper_mode = cVar;
        this.timestamp = instant;
        this.defrost_mode = gVar;
        this.inside_temp_celsius = f18;
        this.outside_temp_celsius = f19;
        this.driver_temp_setting = f21;
        this.passenger_temp_setting = f22;
        this.left_temp_direction = num;
        this.right_temp_direction = num2;
        this.is_front_defroster_on = bool;
        this.is_rear_defroster_on = bool2;
        this.fan_status = num3;
        this.is_climate_on = bool3;
        this.min_avail_temp_celsius = f23;
        this.max_avail_temp_celsius = f24;
        this.seat_heater_left = num4;
        this.seat_heater_right = num5;
        this.seat_heater_rear_left = num6;
        this.seat_heater_rear_right = num7;
        this.seat_heater_rear_center = num8;
        this.seat_heater_rear_right_back = num9;
        this.seat_heater_rear_left_back = num10;
        this.seat_heater_third_row_right = num11;
        this.seat_heater_third_row_left = num12;
        this.battery_heater = bool4;
        this.battery_heater_no_power = bool5;
        this.steering_wheel_heater = bool6;
        this.wiper_blade_heater = bool7;
        this.side_mirror_heaters = bool8;
        this.is_preconditioning = bool9;
        this.remote_heater_control_enabled = bool10;
        this.bioweapon_mode_on = bool11;
        this.is_auto_conditioning_on = bool12;
        this.auto_seat_climate_left = bool13;
        this.auto_seat_climate_right = bool14;
        this.seat_fan_front_left = num13;
        this.seat_fan_front_right = num14;
        this.seat_fan_second_row_left = num15;
        this.seat_fan_second_row_right = num16;
        this.allow_cabin_overheat_protection = bool15;
        this.supports_fan_only_cabin_overheat_protection = bool16;
        this.cabin_overheat_protection = bVar;
        this.cabin_overheat_protection_actively_cooling = bool17;
        this.cop_activation_temperature = fVar;
        this.auto_steering_wheel_heat = bool18;
        this.steering_wheel_heat_level = a0Var;
        this.hvac_auto_request = iVar;
        this.cop_not_running_reason = aVar;
        this.dog_mode_state = hVar;
    }
}
