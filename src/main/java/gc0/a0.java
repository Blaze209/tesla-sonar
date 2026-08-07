package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import j$.time.Instant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0003\b£\u0001\u0018\u0000 ÿ\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0096\u0001B©\n\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\b\b\u0002\u0010$\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\b\b\u0002\u0010&\u001a\u00020\n\u0012\b\b\u0002\u0010'\u001a\u00020\n\u0012\b\b\u0002\u0010(\u001a\u00020\n\u0012\b\b\u0002\u0010)\u001a\u00020\u001a\u0012\b\b\u0002\u0010*\u001a\u00020\u001a\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\u0010\b\u0002\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`4\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030:\u0012\u0010\b\u0002\u0010<\u001a\n\u0018\u000103j\u0004\u0018\u0001`4\u0012\u0010\b\u0002\u0010=\u001a\n\u0018\u000103j\u0004\u0018\u0001`4\u0012\u0010\b\u0002\u0010>\u001a\n\u0018\u000103j\u0004\u0018\u0001`4\u0012\u0010\b\u0002\u0010?\u001a\n\u0018\u000103j\u0004\u0018\u0001`4\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010~\u001a\u0004\u0018\u00010\n\u0012\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f\u0012\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010\n\u0012\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010\n\u0012\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0012\u0010\u0088\u0001\u001a\u00020\u0002H\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001f\u0010\u008c\u0001\u001a\u00020\n2\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0096\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0012\u0010\u008e\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0012\u0010\u0090\u0001\u001a\u00020\u0005H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J°\n\u0010\u0092\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020\u001a2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\u0010\b\u0002\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`42\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030:2\u0010\b\u0002\u0010<\u001a\n\u0018\u000103j\u0004\u0018\u0001`42\u0010\b\u0002\u0010=\u001a\n\u0018\u000103j\u0004\u0018\u0001`42\u0010\b\u0002\u0010>\u001a\n\u0018\u000103j\u0004\u0018\u0001`42\u0010\b\u0002\u0010?\u001a\n\u0018\u000103j\u0004\u0018\u0001`42\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010q\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010u\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010~\u001a\u0004\u0018\u00010\n2\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010\n2\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010\n2\u000b\b\u0002\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0084\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u008f\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0091\u0001R\u001e\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u0097\u0001\u001a\u0006\b\u009a\u0001\u0010\u0091\u0001R\u001e\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0097\u0001\u001a\u0006\b\u009c\u0001\u0010\u0091\u0001R\u001e\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u0097\u0001\u001a\u0006\b\u009e\u0001\u0010\u0091\u0001R\u001e\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010 \u0001\u001a\u0006\b£\u0001\u0010¢\u0001R\u001e\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010 \u0001\u001a\u0006\b¥\u0001\u0010¢\u0001R\u001e\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u0097\u0001\u001a\u0006\b\u0094\u0001\u0010\u0091\u0001R\u001e\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010\u0094\u0001\u001a\u0006\b¨\u0001\u0010\u008f\u0001R\u001e\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010 \u0001\u001a\u0006\bª\u0001\u0010¢\u0001R\u001e\u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010 \u0001\u001a\u0006\b«\u0001\u0010¢\u0001R\u001e\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¬\u0001\u0010 \u0001\u001a\u0006\b\u00ad\u0001\u0010¢\u0001R\u001e\u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b®\u0001\u0010 \u0001\u001a\u0006\b¯\u0001\u0010¢\u0001R\u001e\u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010 \u0001\u001a\u0006\b±\u0001\u0010¢\u0001R\u001e\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0094\u0001\u001a\u0006\b²\u0001\u0010\u008f\u0001R\u001e\u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b³\u0001\u0010 \u0001\u001a\u0006\b®\u0001\u0010¢\u0001R\u001e\u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b´\u0001\u0010 \u0001\u001a\u0006\b´\u0001\u0010¢\u0001R\u001e\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u001e\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b·\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R\u001e\u0010\u001c\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010¹\u0001\u001a\u0006\b½\u0001\u0010»\u0001R\u001e\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009a\u0001\u0010¹\u0001\u001a\u0006\b¾\u0001\u0010»\u0001R\u001e\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¿\u0001\u0010¹\u0001\u001a\u0006\bÀ\u0001\u0010»\u0001R\u001e\u0010\u001f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÁ\u0001\u0010 \u0001\u001a\u0006\bÂ\u0001\u0010¢\u0001R\u001e\u0010 \u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÃ\u0001\u0010 \u0001\u001a\u0006\bÄ\u0001\u0010¢\u0001R\u001e\u0010!\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÅ\u0001\u0010 \u0001\u001a\u0006\bÆ\u0001\u0010¢\u0001R\u001e\u0010\"\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÇ\u0001\u0010 \u0001\u001a\u0006\bÈ\u0001\u0010¢\u0001R\u001e\u0010#\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÉ\u0001\u0010 \u0001\u001a\u0006\bÊ\u0001\u0010¢\u0001R\u001e\u0010$\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bË\u0001\u0010 \u0001\u001a\u0006\bÌ\u0001\u0010¢\u0001R\u001e\u0010%\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÍ\u0001\u0010 \u0001\u001a\u0006\bÎ\u0001\u0010¢\u0001R\u001e\u0010&\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÏ\u0001\u0010 \u0001\u001a\u0006\bÐ\u0001\u0010¢\u0001R\u001e\u0010'\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¹\u0001\u0010 \u0001\u001a\u0006\bÑ\u0001\u0010¢\u0001R\u001e\u0010(\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¨\u0001\u0010 \u0001\u001a\u0006\bÒ\u0001\u0010¢\u0001R\u001e\u0010)\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÓ\u0001\u0010¹\u0001\u001a\u0006\bÔ\u0001\u0010»\u0001R\u001e\u0010*\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010¹\u0001\u001a\u0006\bÕ\u0001\u0010»\u0001R \u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\b¦\u0001\u0010Ø\u0001R \u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\b\u009b\u0001\u0010Û\u0001R \u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R \u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¡\u0001\u0010à\u0001\u001a\u0006\bÙ\u0001\u0010á\u0001R&\u00105\u001a\n\u0018\u000103j\u0004\u0018\u0001`48\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001R \u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\b§\u0001\u0010è\u0001R \u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\b¤\u0001\u0010ë\u0001R&\u0010<\u001a\n\u0018\u000103j\u0004\u0018\u0001`48\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bì\u0001\u0010ã\u0001\u001a\u0006\bí\u0001\u0010å\u0001R&\u0010=\u001a\n\u0018\u000103j\u0004\u0018\u0001`48\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010ã\u0001\u001a\u0006\bî\u0001\u0010å\u0001R&\u0010>\u001a\n\u0018\u000103j\u0004\u0018\u0001`48\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bï\u0001\u0010ã\u0001\u001a\u0006\bð\u0001\u0010å\u0001R&\u0010?\u001a\n\u0018\u000103j\u0004\u0018\u0001`48\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bñ\u0001\u0010ã\u0001\u001a\u0006\bò\u0001\u0010å\u0001R \u0010A\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bÖ\u0001\u0010õ\u0001R \u0010C\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bË\u0001\u0010ø\u0001R \u0010E\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¥\u0001\u0010ù\u0001\u001a\u0006\bé\u0001\u0010ú\u0001R \u0010F\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bû\u0001\u0010ü\u0001\u001a\u0006\b\u009f\u0001\u0010ý\u0001R \u0010G\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010\u0097\u0001\u001a\u0006\b°\u0001\u0010\u0091\u0001R \u0010H\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010\u0097\u0001\u001a\u0006\b¼\u0001\u0010\u0091\u0001R \u0010I\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bþ\u0001\u0010\u0097\u0001\u001a\u0006\b©\u0001\u0010\u0091\u0001R \u0010J\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÂ\u0001\u0010\u0097\u0001\u001a\u0006\bÿ\u0001\u0010\u0091\u0001R \u0010K\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0080\u0002\u0010\u0081\u0002\u001a\u0006\bÜ\u0001\u0010\u0082\u0002R \u0010L\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0083\u0002\u0010\u0081\u0002\u001a\u0006\bû\u0001\u0010\u0082\u0002R \u0010M\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010\u0081\u0002\u001a\u0006\bö\u0001\u0010\u0082\u0002R \u0010N\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÄ\u0001\u0010\u0097\u0001\u001a\u0006\bÓ\u0001\u0010\u0091\u0001R \u0010O\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010ü\u0001\u001a\u0006\b¹\u0001\u0010ý\u0001R \u0010P\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0086\u0002\u0010\u0081\u0002\u001a\u0006\b\u0086\u0002\u0010\u0082\u0002R \u0010Q\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010\u0081\u0002\u001a\u0006\b\u0087\u0002\u0010\u0082\u0002R \u0010R\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÞ\u0001\u0010\u0081\u0002\u001a\u0006\bì\u0001\u0010\u0082\u0002R \u0010S\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0087\u0002\u0010\u0081\u0002\u001a\u0006\b\u0088\u0002\u0010\u0082\u0002R \u0010T\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010\u0081\u0002\u001a\u0006\b\u0089\u0002\u0010\u0082\u0002R \u0010U\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bä\u0001\u0010ü\u0001\u001a\u0006\b\u008a\u0002\u0010ý\u0001R \u0010V\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008b\u0002\u0010\u0081\u0002\u001a\u0006\b¬\u0001\u0010\u0082\u0002R \u0010W\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010\u0081\u0002\u001a\u0006\b³\u0001\u0010\u0082\u0002R \u0010X\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008c\u0002\u0010¶\u0001\u001a\u0006\bµ\u0001\u0010¸\u0001R \u0010Y\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÈ\u0001\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R \u0010Z\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0090\u0002\u0010\u008d\u0002\u001a\u0006\b\u0091\u0002\u0010\u008f\u0002R \u0010[\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0092\u0002\u0010\u008d\u0002\u001a\u0006\b\u0093\u0002\u0010\u008f\u0002R \u0010\\\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÊ\u0001\u0010\u008d\u0002\u001a\u0006\b\u0094\u0002\u0010\u008f\u0002R \u0010]\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0095\u0002\u0010\u0081\u0002\u001a\u0006\bþ\u0001\u0010\u0082\u0002R \u0010^\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010\u0081\u0002\u001a\u0006\b\u0084\u0002\u0010\u0082\u0002R \u0010_\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bí\u0001\u0010\u0081\u0002\u001a\u0006\b\u008b\u0002\u0010\u0082\u0002R \u0010`\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bî\u0001\u0010\u0081\u0002\u001a\u0006\b\u008c\u0002\u0010\u0082\u0002R \u0010a\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bð\u0001\u0010\u0081\u0002\u001a\u0006\b\u0090\u0002\u0010\u0082\u0002R \u0010b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bò\u0001\u0010\u0081\u0002\u001a\u0006\b\u0095\u0002\u0010\u0082\u0002R \u0010c\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u008e\u0002\u0010\u0081\u0002\u001a\u0006\b\u0096\u0002\u0010\u0082\u0002R \u0010d\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010\u0081\u0002\u001a\u0006\b\u0097\u0002\u0010\u0082\u0002R \u0010e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0091\u0002\u0010\u0081\u0002\u001a\u0006\b\u0098\u0002\u0010\u0082\u0002R \u0010f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b½\u0001\u0010\u0081\u0002\u001a\u0006\b\u0099\u0002\u0010\u0082\u0002R \u0010g\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0093\u0002\u0010\u008d\u0002\u001a\u0006\b\u009a\u0002\u0010\u008f\u0002R \u0010h\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¾\u0001\u0010\u008d\u0002\u001a\u0006\b\u009b\u0002\u0010\u008f\u0002R \u0010i\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0094\u0002\u0010\u0081\u0002\u001a\u0006\b\u009d\u0001\u0010\u0082\u0002R \u0010j\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010\u0081\u0002\u001a\u0006\b¿\u0001\u0010\u0082\u0002R \u0010k\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009a\u0002\u0010\u0081\u0002\u001a\u0006\bï\u0001\u0010\u0082\u0002R \u0010l\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÔ\u0001\u0010\u0081\u0002\u001a\u0006\bñ\u0001\u0010\u0082\u0002R \u0010m\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009c\u0002\u0010\u0081\u0002\u001a\u0006\bÅ\u0001\u0010\u0082\u0002R \u0010n\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009b\u0002\u0010\u0081\u0002\u001a\u0006\bó\u0001\u0010\u0082\u0002R \u0010o\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÕ\u0001\u0010\u0081\u0002\u001a\u0006\bÍ\u0001\u0010\u0082\u0002R \u0010p\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0096\u0002\u0010\u0081\u0002\u001a\u0006\bÏ\u0001\u0010\u0082\u0002R \u0010q\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÎ\u0001\u0010\u0081\u0002\u001a\u0006\b\u009d\u0002\u0010\u0082\u0002R \u0010r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010\u0081\u0002\u001a\u0006\b\u009e\u0002\u0010\u0082\u0002R \u0010s\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÐ\u0001\u0010\u0081\u0002\u001a\u0006\b\u009f\u0002\u0010\u0082\u0002R \u0010t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0098\u0002\u0010ü\u0001\u001a\u0006\b \u0002\u0010ý\u0001R \u0010u\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÑ\u0001\u0010ü\u0001\u001a\u0006\b¡\u0002\u0010ý\u0001R \u0010v\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¢\u0002\u0010\u0081\u0002\u001a\u0006\b£\u0002\u0010\u0082\u0002R \u0010w\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0099\u0002\u0010\u0081\u0002\u001a\u0006\b¤\u0002\u0010\u0082\u0002R \u0010x\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bÒ\u0001\u0010\u0081\u0002\u001a\u0006\b\u0085\u0002\u0010\u0082\u0002R \u0010y\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009e\u0002\u0010\u0081\u0002\u001a\u0006\b\u0099\u0001\u0010\u0082\u0002R \u0010z\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009f\u0002\u0010\u0081\u0002\u001a\u0006\b¥\u0002\u0010\u0082\u0002R \u0010{\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¦\u0002\u0010\u0097\u0001\u001a\u0006\b\u0083\u0002\u0010\u0091\u0001R \u0010|\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010\u0081\u0002\u001a\u0006\b \u0001\u0010\u0082\u0002R \u0010}\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b§\u0002\u0010\u0081\u0002\u001a\u0006\bÁ\u0001\u0010\u0082\u0002R \u0010~\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¥\u0002\u0010\u0081\u0002\u001a\u0006\b§\u0002\u0010\u0082\u0002R!\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¡\u0002\u0010¨\u0002\u001a\u0006\bÉ\u0001\u0010©\u0002R!\u0010\u0081\u0001\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b£\u0002\u0010\u0081\u0002\u001a\u0006\bâ\u0001\u0010\u0082\u0002R!\u0010\u0082\u0001\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\bª\u0002\u0010\u0081\u0002\u001a\u0006\bæ\u0001\u0010\u0082\u0002R!\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b \u0002\u0010\u0097\u0001\u001a\u0006\bÇ\u0001\u0010\u0091\u0001R$\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00030:8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b¤\u0002\u0010«\u0002\u001a\u0006\bÃ\u0001\u0010¬\u0002¨\u0006\u00ad\u0002"}, d2 = {"Lgc0/a0;", "Lcom/squareup/wire/f;", "", "", "api_version_OBSOLETE", "", "car_version_OBSOLETE", "detailed_version_OBSOLETE", "autopilot_hash_OBSOLETE", "vehicle_name_OBSOLETE", "", "notifications_supported_OBSOLETE", "remote_start_supported_OBSOLETE", "remote_start_enabled_OBSOLETE", "last_autopark_error_OBSOLETE", "homelink_device_count_OBSOLETE", "smart_summon_available_OBSOLETE", "summon_standby_mode_enabled_OBSOLETE", "patsy_mode_OBSOLETE", "webcam_available_OBSOLETE", "vehicle_self_test_requested_OBSOLETE", "vehicle_self_test_progress_OBSOLETE", "calendar_supported_OBSOLETE", "dashcam_clip_save_available_OBSOLETE", "Lgc0/s;", "dashcam_state_OBSOLETE", "", "tpms_pressure_fl_OBSOLETE", "tpms_pressure_fr_OBSOLETE", "tpms_pressure_rl_OBSOLETE", "tpms_pressure_rr_OBSOLETE", "service_mode_OBSOLETE", "service_mode_plus_OBSOLETE", "tpms_hard_warning_fl_OBSOLETE", "tpms_hard_warning_fr_OBSOLETE", "tpms_hard_warning_rl_OBSOLETE", "tpms_hard_warning_rr_OBSOLETE", "tpms_soft_warning_fl_OBSOLETE", "tpms_soft_warning_fr_OBSOLETE", "tpms_soft_warning_rl_OBSOLETE", "tpms_soft_warning_rr_OBSOLETE", "tpms_rcp_front_value_OBSOLETE", "tpms_rcp_rear_value_OBSOLETE", "Lgc0/c;", "autopark_style", "Lgc0/q0;", "active_spoiler_state", "Lgc0/n0;", "software_update_state", "Lgc0/z;", "legacy_media_state", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "timestamp", "Lgc0/d;", "autopark_version", "Lgc0/b;", "autopark_state", "", "feature_bitmask", "tpms_last_seen_pressure_time_fl", "tpms_last_seen_pressure_time_fr", "tpms_last_seen_pressure_time_rl", "tpms_last_seen_pressure_time_rr", "Lgc0/y;", "legacy_media_info", "Lgc0/w;", "guestMode", "Lgc0/j0;", "parental_controls_settings", "api_version", "car_version", "detailed_version", "autopilot_hash", "vehicle_name", "notifications_supported", "remote_start_supported", "remote_start_enabled", "last_autopark_error", "homelink_device_count", "smart_summon_available", "summon_standby_mode_enabled", "patsy_mode", "webcam_available", "vehicle_self_test_requested", "vehicle_self_test_progress", "calendar_supported", "dashcam_clip_save_available", "dashcam_state", "tpms_pressure_fl", "tpms_pressure_fr", "tpms_pressure_rl", "tpms_pressure_rr", "service_mode", "service_mode_plus", "tpms_hard_warning_fl", "tpms_hard_warning_fr", "tpms_hard_warning_rl", "tpms_hard_warning_rr", "tpms_soft_warning_fl", "tpms_soft_warning_fr", "tpms_soft_warning_rl", "tpms_soft_warning_rr", "tpms_rcp_front_value", "tpms_rcp_rear_value", "allow_authorized_mobile_devices_only", "drive_rail_on", "pin_to_drive_enabled", "pin_to_drive_pin_set", "frontfoglights_on", "rearfoglights_on", "headlights_on", "highbeamlights_on", "trailer_mode_on", "trailer_light_test_available", "trailer_light_test_requested", "truck_bed_lights_brightness", "truck_bed_lights_auto_brightness", "truck_bed_lights_auto_state", "truck_bed_lights_controls_disabled", "signed_cmd_service_mode", "accessory_lightbar_middle_on", "transport_mode", "service_mode_auth", "service_gtw_diag_session_active", "factory_mode", "training_wheels_mode", "Lec0/m;", "gtw_diag_level", "parental_controls_active", "parental_controls_pin_set", "fsd_software_version", "Lokio/k;", "unknownFields", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;IZZZZZIZZLgc0/s;FFFFZZZZZZZZZZFFLgc0/c;Lgc0/q0;Lgc0/n0;Lgc0/z;Lj$/time/Instant;Lgc0/d;Lgc0/b;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lgc0/y;Lgc0/w;Lgc0/j0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lgc0/s;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lec0/m;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;IZZZZZIZZLgc0/s;FFFFZZZZZZZZZZFFLgc0/c;Lgc0/q0;Lgc0/n0;Lgc0/z;Lj$/time/Instant;Lgc0/d;Lgc0/b;Ljava/util/List;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lj$/time/Instant;Lgc0/y;Lgc0/w;Lgc0/j0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lgc0/s;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lec0/m;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lokio/k;)Lgc0/a0;", "I", "g", "b", "Ljava/lang/String;", "p", "c", "v", DateTokenConverter.CONVERTER_KEY, "l", "e", "i1", "f", "Z", Gender.MALE, "()Z", "Y", "h", "W", IntegerTokenConverter.CONVERTER_KEY, "j", "G", "k", "i0", "l0", "m", "R", "n", "p1", "o", "n1", "l1", "q", "r", "s", "Lgc0/s;", "t", "()Lgc0/s;", Gender.FEMALE, "B0", "()F", "u", "D0", "F0", "w", "H0", "x", "b0", "y", "f0", "z", "o0", "A", "q0", "B", "t0", "C", "v0", "D", "O0", "E", "Q0", "S0", "V0", "H", "J0", "M0", "J", "Lgc0/c;", "()Lgc0/c;", "K", "Lgc0/q0;", "()Lgc0/q0;", "L", "Lgc0/n0;", "j0", "()Lgc0/n0;", "Lgc0/z;", "()Lgc0/z;", Gender.NONE, "Lj$/time/Instant;", "m0", "()Lj$/time/Instant;", Gender.OTHER, "Lgc0/d;", "()Lgc0/d;", "P", "Lgc0/b;", "()Lgc0/b;", "Q", "w0", "x0", "S", "y0", "T", "z0", Gender.UNKNOWN, "Lgc0/y;", "()Lgc0/y;", "V", "Lgc0/w;", "()Lgc0/w;", "Lgc0/j0;", "()Lgc0/j0;", "X", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "a0", "h1", "c0", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "d0", "e0", "g0", "h0", "k0", "o1", "m1", "j1", "n0", "p0", "Ljava/lang/Float;", "A0", "()Ljava/lang/Float;", "r0", "C0", "s0", "E0", "G0", "u0", "N0", "P0", "R0", "U0", "I0", "L0", "K0", "Z0", "W0", "X0", "f1", "c1", "T0", "d1", "g1", "b1", "Y0", "a1", "Lec0/m;", "()Lec0/m;", "e1", "Ljava/util/List;", "()Ljava/util/List;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final ProtoAdapter<a0> f67862n1 = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(a0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFrOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 63)
    private final boolean tpms_hard_warning_fr_OBSOLETE;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFl", tag = 166)
    private final Boolean tpms_soft_warning_fl;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRlOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 64)
    private final boolean tpms_hard_warning_rl_OBSOLETE;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFr", tag = 167)
    private final Boolean tpms_soft_warning_fr;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRrOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 65)
    private final boolean tpms_hard_warning_rr_OBSOLETE;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRl", tag = 168)
    private final Boolean tpms_soft_warning_rl;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFlOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 66)
    private final boolean tpms_soft_warning_fl_OBSOLETE;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRr", tag = 169)
    private final Boolean tpms_soft_warning_rr;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningFrOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 67)
    private final boolean tpms_soft_warning_fr_OBSOLETE;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpFrontValue", tag = 170)
    private final Float tpms_rcp_front_value;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRlOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 68)
    private final boolean tpms_soft_warning_rl_OBSOLETE;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpRearValue", tag = 171)
    private final Float tpms_rcp_rear_value;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsSoftWarningRrOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 69)
    private final boolean tpms_soft_warning_rr_OBSOLETE;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "allowAuthorizedMobileDevicesOnly", tag = 73)
    private final Boolean allow_authorized_mobile_devices_only;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpFrontValueOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 70)
    private final float tpms_rcp_front_value_OBSOLETE;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "driveRailOn", tag = 75)
    private final Boolean drive_rail_on;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsRcpRearValueOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 71)
    private final float tpms_rcp_rear_value_OBSOLETE;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinToDriveEnabled", tag = 76)
    private final Boolean pin_to_drive_enabled;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.AutoparkStyle#ADAPTER", jsonName = "autoparkStyle", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 34)
    private final c autopark_style;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinToDrivePinSet", tag = 77)
    private final Boolean pin_to_drive_pin_set;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SpoilerState#ADAPTER", jsonName = "activeSpoilerState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 37)
    private final q0 active_spoiler_state;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "frontfoglightsOn", tag = 78)
    private final Boolean frontfoglights_on;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.SoftwareUpdateState#ADAPTER", jsonName = "softwareUpdateState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 38)
    private final n0 software_update_state;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "rearfoglightsOn", tag = 79)
    private final Boolean rearfoglights_on;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LegacyMediaState#ADAPTER", jsonName = "legacyMediaState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 39)
    private final z legacy_media_state;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "headlightsOn", tag = 80)
    private final Boolean headlights_on;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 43)
    private final Instant timestamp;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "highbeamlightsOn", tag = 81)
    private final Boolean highbeamlights_on;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.AutoparkVersion#ADAPTER", jsonName = "autoparkVersion", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 46)
    private final d autopark_version;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "trailerModeOn", tag = 82)
    private final Boolean trailer_mode_on;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.AutoparkState#ADAPTER", jsonName = "autoparkState", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 47)
    private final b autopark_state;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "trailerLightTestAvailable", tag = 83)
    private final Boolean trailer_light_test_available;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeFl", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 58)
    private final Instant tpms_last_seen_pressure_time_fl;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "trailerLightTestRequested", tag = 84)
    private final Boolean trailer_light_test_requested;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeFr", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 59)
    private final Instant tpms_last_seen_pressure_time_fr;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "truckBedLightsBrightness", tag = 86)
    private final Integer truck_bed_lights_brightness;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRl", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 60)
    private final Instant tpms_last_seen_pressure_time_rl;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "truckBedLightsAutoBrightness", tag = 90)
    private final Integer truck_bed_lights_auto_brightness;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "tpmsLastSeenPressureTimeRr", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 61)
    private final Instant tpms_last_seen_pressure_time_rr;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "truckBedLightsAutoState", tag = 91)
    private final Boolean truck_bed_lights_auto_state;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.LegacyMediaInfo#ADAPTER", jsonName = "legacyMediaInfo", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 72)
    private final y legacy_media_info;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "truckBedLightsControlsDisabled", tag = 92)
    private final Boolean truck_bed_lights_controls_disabled;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.GuestMode#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 74)
    private final w guestMode;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "signedCmdServiceMode", tag = 87)
    private final Boolean signed_cmd_service_mode;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.ParentalControlsSettings#ADAPTER", jsonName = "parentalControlsSettings", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 100)
    private final j0 parental_controls_settings;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "accessoryLightbarMiddleOn", tag = 88)
    private final Boolean accessory_lightbar_middle_on;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "apiVersion", tag = 101)
    private final Integer api_version;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "transportMode", tag = 89)
    private final Boolean transport_mode;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "carVersion", tag = 108)
    private final String car_version;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "serviceModeAuth", tag = 93)
    private final String service_mode_auth;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailedVersion", tag = 109)
    private final String detailed_version;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceGtwDiagSessionActive", tag = 94)
    private final Boolean service_gtw_diag_session_active;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "apiVersionOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int api_version_OBSOLETE;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "autopilotHash", tag = 110)
    private final String autopilot_hash;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "factoryMode", tag = 95)
    private final Boolean factory_mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "carVersionOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final String car_version_OBSOLETE;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "vehicleName", tag = 118)
    private final String vehicle_name;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "trainingWheelsMode", tag = 96)
    private final Boolean training_wheels_mode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "detailedVersionOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final String detailed_version_OBSOLETE;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "notificationsSupported", tag = 120)
    private final Boolean notifications_supported;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.GtwDiagLevel#ADAPTER", jsonName = "gtwDiagLevel", tag = 97)
    private final ec0.m gtw_diag_level;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "autopilotHashOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final String autopilot_hash_OBSOLETE;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartSupported", tag = 121)
    private final Boolean remote_start_supported;

    /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "parentalControlsActive", tag = 98)
    private final Boolean parental_controls_active;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "vehicleNameOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 18)
    private final String vehicle_name_OBSOLETE;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartEnabled", tag = 122)
    private final Boolean remote_start_enabled;

    /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "parentalControlsPinSet", tag = 99)
    private final Boolean parental_controls_pin_set;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "notificationsSupportedOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 20)
    private final boolean notifications_supported_OBSOLETE;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastAutoparkError", tag = 131)
    private final String last_autopark_error;

    /* JADX INFO: renamed from: f1, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fsdSoftwareVersion", tag = 172)
    private final String fsd_software_version;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartSupportedOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 21)
    private final boolean remote_start_supported_OBSOLETE;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "homelinkDeviceCount", tag = 133)
    private final Integer homelink_device_count;

    /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "featureBitmask", label = com.squareup.wire.q.a.PACKED, tag = 55)
    private final List<Integer> feature_bitmask;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "remoteStartEnabledOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 22)
    private final boolean remote_start_enabled_OBSOLETE;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "smartSummonAvailable", tag = 135)
    private final Boolean smart_summon_available;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastAutoparkErrorOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 31)
    private final String last_autopark_error_OBSOLETE;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "summonStandbyModeEnabled", tag = 136)
    private final Boolean summon_standby_mode_enabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "homelinkDeviceCountOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 33)
    private final int homelink_device_count_OBSOLETE;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "patsyMode", tag = 141)
    private final Boolean patsy_mode;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "smartSummonAvailableOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 35)
    private final boolean smart_summon_available_OBSOLETE;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "webcamAvailable", tag = 142)
    private final Boolean webcam_available;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "summonStandbyModeEnabledOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 36)
    private final boolean summon_standby_mode_enabled_OBSOLETE;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "vehicleSelfTestRequested", tag = 144)
    private final Boolean vehicle_self_test_requested;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "patsyModeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 41)
    private final boolean patsy_mode_OBSOLETE;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "vehicleSelfTestProgress", tag = 145)
    private final Integer vehicle_self_test_progress;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "webcamAvailableOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 42)
    private final boolean webcam_available_OBSOLETE;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "calendarSupported", tag = 148)
    private final Boolean calendar_supported;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "vehicleSelfTestRequestedOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 44)
    private final boolean vehicle_self_test_requested_OBSOLETE;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "dashcamClipSaveAvailable", tag = 149)
    private final Boolean dashcam_clip_save_available;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "vehicleSelfTestProgressOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 45)
    private final int vehicle_self_test_progress_OBSOLETE;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.DashCamState#ADAPTER", jsonName = "dashcamState", tag = 150)
    private final s dashcam_state;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "calendarSupportedOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 48)
    private final boolean calendar_supported_OBSOLETE;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFl", tag = 151)
    private final Float tpms_pressure_fl;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "dashcamClipSaveAvailableOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 49)
    private final boolean dashcam_clip_save_available_OBSOLETE;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFr", tag = 152)
    private final Float tpms_pressure_fr;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.vehicle.DashCamState#ADAPTER", jsonName = "dashcamStateOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 50)
    private final s dashcam_state_OBSOLETE;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRl", tag = 153)
    private final Float tpms_pressure_rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFlOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 51)
    private final float tpms_pressure_fl_OBSOLETE;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRr", tag = 154)
    private final Float tpms_pressure_rr;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureFrOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 52)
    private final float tpms_pressure_fr_OBSOLETE;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceMode", tag = 156)
    private final Boolean service_mode;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRlOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 53)
    private final float tpms_pressure_rl_OBSOLETE;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceModePlus", tag = 157)
    private final Boolean service_mode_plus;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "tpmsPressureRrOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 54)
    private final float tpms_pressure_rr_OBSOLETE;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFl", tag = 162)
    private final Boolean tpms_hard_warning_fl;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceModeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 56)
    private final boolean service_mode_OBSOLETE;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFr", tag = 163)
    private final Boolean tpms_hard_warning_fr;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "serviceModePlusOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 57)
    private final boolean service_mode_plus_OBSOLETE;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRl", tag = 164)
    private final Boolean tpms_hard_warning_rl;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningFlOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 62)
    private final boolean tpms_hard_warning_fl_OBSOLETE;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "tpmsHardWarningRr", tag = 165)
    private final Boolean tpms_hard_warning_rr;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/a0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/a0;", "value", "", "c", "(Lgc0/a0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/a0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/a0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/a0;)Lgc0/a0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<a0> {
        a(com.squareup.wire.b bVar, co0.d<a0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.LegacyVehicleState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 decode(com.squareup.wire.k reader) throws IOException {
            s sVarDecode;
            p013kotlin.jvm.internal.s.k(reader, "reader");
            s sVar = s.DashCamState_UNAVAILABLE;
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            s sVar2 = sVar;
            boolean z11 = false;
            int i11 = 0;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int i12 = 0;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            boolean z29 = false;
            String str = "";
            String str2 = str;
            String str3 = str2;
            String str4 = str3;
            String str5 = str4;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            c cVar = null;
            q0 q0Var = null;
            n0 n0Var = null;
            z zVar = null;
            Instant instant = null;
            d dVar = null;
            b bVar = null;
            Instant instant2 = null;
            Instant instant3 = null;
            Instant instant4 = null;
            Instant instant5 = null;
            y yVar = null;
            w wVar = null;
            j0 j0Var = null;
            Integer num = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str10 = null;
            Integer num2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Integer num3 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            s sVarDecode2 = null;
            Float f17 = null;
            Float f18 = null;
            Float f19 = null;
            Float f21 = null;
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
            Float f22 = null;
            Float f23 = null;
            Boolean bool21 = null;
            Boolean bool22 = null;
            Boolean bool23 = null;
            Boolean bool24 = null;
            Boolean bool25 = null;
            Boolean bool26 = null;
            Boolean bool27 = null;
            Boolean bool28 = null;
            Boolean bool29 = null;
            Boolean bool30 = null;
            Boolean bool31 = null;
            Integer num4 = null;
            Integer num5 = null;
            Boolean bool32 = null;
            Boolean bool33 = null;
            Boolean bool34 = null;
            Boolean bool35 = null;
            Boolean bool36 = null;
            String str11 = null;
            Boolean bool37 = null;
            Boolean bool38 = null;
            Boolean bool39 = null;
            ec0.m mVarDecode = null;
            Boolean bool40 = null;
            Boolean bool41 = null;
            String str12 = null;
            int i13 = 0;
            boolean z31 = false;
            boolean z32 = false;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new a0(i13, str, str2, str3, str4, z31, z32, z11, str5, i11, z12, z13, z14, z15, z16, i12, z17, z18, sVar2, f11, f12, f13, f14, z19, z21, z22, z23, z24, z25, z26, z27, z28, z29, f15, f16, cVar, q0Var, n0Var, zVar, instant, dVar, bVar, arrayList, instant2, instant3, instant4, instant5, yVar, wVar, j0Var, num, str6, str7, str8, str9, bool, bool2, bool3, str10, num2, bool4, bool5, bool6, bool7, bool8, num3, bool9, bool10, sVarDecode2, f17, f18, f19, f21, bool11, bool12, bool13, bool14, bool15, bool16, bool17, bool18, bool19, bool20, f22, f23, bool21, bool22, bool23, bool24, bool25, bool26, bool27, bool28, bool29, bool30, bool31, num4, num5, bool32, bool33, bool34, bool35, bool36, str11, bool37, bool38, bool39, mVarDecode, bool40, bool41, str12, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        int iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        jn0.h0 h0Var = jn0.h0.f84049a;
                        i13 = iIntValue;
                        continue;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 19:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 32:
                    case 40:
                    case 85:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 119:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                    case 132:
                    case 134:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 143:
                    case 146:
                    case 147:
                    case 155:
                    case 158:
                    case 159:
                    case 160:
                    case 161:
                    default:
                        reader.m(iG);
                        jn0.h0 h0Var2 = jn0.h0.f84049a;
                        i13 = i13;
                        z31 = z31;
                        z32 = z32;
                        break;
                    case 8:
                        String strDecode = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var3 = jn0.h0.f84049a;
                        str = strDecode;
                        continue;
                    case 9:
                        String strDecode2 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var4 = jn0.h0.f84049a;
                        str2 = strDecode2;
                        continue;
                    case 10:
                        String strDecode3 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var5 = jn0.h0.f84049a;
                        str3 = strDecode3;
                        continue;
                    case 18:
                        String strDecode4 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var6 = jn0.h0.f84049a;
                        str4 = strDecode4;
                        continue;
                    case 20:
                        boolean zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var7 = jn0.h0.f84049a;
                        z31 = zBooleanValue;
                        continue;
                    case 21:
                        boolean zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var8 = jn0.h0.f84049a;
                        z32 = zBooleanValue2;
                        continue;
                    case 22:
                        boolean zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var9 = jn0.h0.f84049a;
                        z11 = zBooleanValue3;
                        continue;
                    case 31:
                        String strDecode5 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var10 = jn0.h0.f84049a;
                        str5 = strDecode5;
                        continue;
                    case 33:
                        int iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                        jn0.h0 h0Var11 = jn0.h0.f84049a;
                        i11 = iIntValue2;
                        continue;
                    case 34:
                        c cVarDecode = c.f67979d.decode(reader);
                        jn0.h0 h0Var12 = jn0.h0.f84049a;
                        cVar = cVarDecode;
                        continue;
                    case 35:
                        boolean zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var13 = jn0.h0.f84049a;
                        z12 = zBooleanValue4;
                        continue;
                    case 36:
                        boolean zBooleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var14 = jn0.h0.f84049a;
                        z13 = zBooleanValue5;
                        continue;
                    case 37:
                        q0 q0VarDecode = q0.f68379f.decode(reader);
                        jn0.h0 h0Var15 = jn0.h0.f84049a;
                        q0Var = q0VarDecode;
                        continue;
                    case 38:
                        n0 n0VarDecode = n0.f68142q.decode(reader);
                        jn0.h0 h0Var16 = jn0.h0.f84049a;
                        n0Var = n0VarDecode;
                        continue;
                    case 39:
                        z zVarDecode = z.f68729d.decode(reader);
                        jn0.h0 h0Var17 = jn0.h0.f84049a;
                        zVar = zVarDecode;
                        continue;
                    case 41:
                        boolean zBooleanValue6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var18 = jn0.h0.f84049a;
                        z14 = zBooleanValue6;
                        continue;
                    case 42:
                        boolean zBooleanValue7 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var19 = jn0.h0.f84049a;
                        z15 = zBooleanValue7;
                        continue;
                    case 43:
                        Instant instantDecode = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var20 = jn0.h0.f84049a;
                        instant = instantDecode;
                        continue;
                    case 44:
                        boolean zBooleanValue8 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var21 = jn0.h0.f84049a;
                        z16 = zBooleanValue8;
                        continue;
                    case 45:
                        int iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                        jn0.h0 h0Var22 = jn0.h0.f84049a;
                        i12 = iIntValue3;
                        continue;
                    case 46:
                        d dVarDecode = d.f67990e.decode(reader);
                        jn0.h0 h0Var23 = jn0.h0.f84049a;
                        dVar = dVarDecode;
                        continue;
                    case 47:
                        b bVarDecode = b.f67961n.decode(reader);
                        jn0.h0 h0Var24 = jn0.h0.f84049a;
                        bVar = bVarDecode;
                        continue;
                    case 48:
                        boolean zBooleanValue9 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var25 = jn0.h0.f84049a;
                        z17 = zBooleanValue9;
                        continue;
                    case 49:
                        boolean zBooleanValue10 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var26 = jn0.h0.f84049a;
                        z18 = zBooleanValue10;
                        continue;
                    case 50:
                        i13 = i13;
                        z31 = z31;
                        z32 = z32;
                        try {
                            sVarDecode = s.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            sVarDecode = sVar2;
                        }
                        jn0.h0 h0Var27 = jn0.h0.f84049a;
                        sVar2 = sVarDecode;
                        break;
                    case 51:
                        float fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        jn0.h0 h0Var28 = jn0.h0.f84049a;
                        f11 = fFloatValue;
                        continue;
                    case 52:
                        float fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        jn0.h0 h0Var29 = jn0.h0.f84049a;
                        f12 = fFloatValue2;
                        continue;
                    case 53:
                        float fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        jn0.h0 h0Var30 = jn0.h0.f84049a;
                        f13 = fFloatValue3;
                        continue;
                    case 54:
                        float fFloatValue4 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        jn0.h0 h0Var31 = jn0.h0.f84049a;
                        f14 = fFloatValue4;
                        continue;
                    case 55:
                        i13 = i13;
                        z31 = z31;
                        z32 = z32;
                        arrayList.add(ProtoAdapter.UINT32.decode(reader));
                        break;
                    case 56:
                        boolean zBooleanValue11 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var32 = jn0.h0.f84049a;
                        z19 = zBooleanValue11;
                        continue;
                    case 57:
                        boolean zBooleanValue12 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var33 = jn0.h0.f84049a;
                        z21 = zBooleanValue12;
                        continue;
                    case 58:
                        Instant instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var34 = jn0.h0.f84049a;
                        instant2 = instantDecode2;
                        continue;
                    case 59:
                        Instant instantDecode3 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var35 = jn0.h0.f84049a;
                        instant3 = instantDecode3;
                        continue;
                    case 60:
                        Instant instantDecode4 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var36 = jn0.h0.f84049a;
                        instant4 = instantDecode4;
                        continue;
                    case 61:
                        Instant instantDecode5 = ProtoAdapter.INSTANT.decode(reader);
                        jn0.h0 h0Var37 = jn0.h0.f84049a;
                        instant5 = instantDecode5;
                        continue;
                    case 62:
                        boolean zBooleanValue13 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var38 = jn0.h0.f84049a;
                        z22 = zBooleanValue13;
                        continue;
                    case 63:
                        boolean zBooleanValue14 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var39 = jn0.h0.f84049a;
                        z23 = zBooleanValue14;
                        continue;
                    case 64:
                        boolean zBooleanValue15 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var40 = jn0.h0.f84049a;
                        z24 = zBooleanValue15;
                        continue;
                    case 65:
                        boolean zBooleanValue16 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var41 = jn0.h0.f84049a;
                        z25 = zBooleanValue16;
                        continue;
                    case 66:
                        boolean zBooleanValue17 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var42 = jn0.h0.f84049a;
                        z26 = zBooleanValue17;
                        continue;
                    case 67:
                        boolean zBooleanValue18 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var43 = jn0.h0.f84049a;
                        z27 = zBooleanValue18;
                        continue;
                    case 68:
                        boolean zBooleanValue19 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var44 = jn0.h0.f84049a;
                        z28 = zBooleanValue19;
                        continue;
                    case 69:
                        boolean zBooleanValue20 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        jn0.h0 h0Var45 = jn0.h0.f84049a;
                        z29 = zBooleanValue20;
                        continue;
                    case 70:
                        float fFloatValue5 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        jn0.h0 h0Var46 = jn0.h0.f84049a;
                        f15 = fFloatValue5;
                        continue;
                    case 71:
                        float fFloatValue6 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                        jn0.h0 h0Var47 = jn0.h0.f84049a;
                        f16 = fFloatValue6;
                        continue;
                    case 72:
                        y yVarDecode = y.f68710o.decode(reader);
                        jn0.h0 h0Var48 = jn0.h0.f84049a;
                        yVar = yVarDecode;
                        continue;
                    case 73:
                        Boolean boolDecode = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var49 = jn0.h0.f84049a;
                        bool21 = boolDecode;
                        continue;
                    case 74:
                        w wVarDecode = w.f68663c.decode(reader);
                        jn0.h0 h0Var50 = jn0.h0.f84049a;
                        wVar = wVarDecode;
                        continue;
                    case 75:
                        Boolean boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var51 = jn0.h0.f84049a;
                        bool22 = boolDecode2;
                        continue;
                    case 76:
                        Boolean boolDecode3 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var52 = jn0.h0.f84049a;
                        bool23 = boolDecode3;
                        continue;
                    case 77:
                        Boolean boolDecode4 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var53 = jn0.h0.f84049a;
                        bool24 = boolDecode4;
                        continue;
                    case 78:
                        Boolean boolDecode5 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var54 = jn0.h0.f84049a;
                        bool25 = boolDecode5;
                        continue;
                    case 79:
                        Boolean boolDecode6 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var55 = jn0.h0.f84049a;
                        bool26 = boolDecode6;
                        continue;
                    case 80:
                        Boolean boolDecode7 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var56 = jn0.h0.f84049a;
                        bool27 = boolDecode7;
                        continue;
                    case 81:
                        Boolean boolDecode8 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var57 = jn0.h0.f84049a;
                        bool28 = boolDecode8;
                        continue;
                    case 82:
                        Boolean boolDecode9 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var58 = jn0.h0.f84049a;
                        bool29 = boolDecode9;
                        continue;
                    case 83:
                        Boolean boolDecode10 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var59 = jn0.h0.f84049a;
                        bool30 = boolDecode10;
                        continue;
                    case 84:
                        Boolean boolDecode11 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var60 = jn0.h0.f84049a;
                        bool31 = boolDecode11;
                        continue;
                    case 86:
                        Integer numDecode = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var61 = jn0.h0.f84049a;
                        num4 = numDecode;
                        continue;
                    case 87:
                        Boolean boolDecode12 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var62 = jn0.h0.f84049a;
                        bool34 = boolDecode12;
                        continue;
                    case 88:
                        Boolean boolDecode13 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var63 = jn0.h0.f84049a;
                        bool35 = boolDecode13;
                        continue;
                    case 89:
                        Boolean boolDecode14 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var64 = jn0.h0.f84049a;
                        bool36 = boolDecode14;
                        continue;
                    case 90:
                        Integer numDecode2 = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var65 = jn0.h0.f84049a;
                        num5 = numDecode2;
                        continue;
                    case 91:
                        Boolean boolDecode15 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var66 = jn0.h0.f84049a;
                        bool32 = boolDecode15;
                        continue;
                    case 92:
                        Boolean boolDecode16 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var67 = jn0.h0.f84049a;
                        bool33 = boolDecode16;
                        continue;
                    case 93:
                        String strDecode6 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var68 = jn0.h0.f84049a;
                        str11 = strDecode6;
                        continue;
                    case 94:
                        Boolean boolDecode17 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var69 = jn0.h0.f84049a;
                        bool37 = boolDecode17;
                        continue;
                    case 95:
                        Boolean boolDecode18 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var70 = jn0.h0.f84049a;
                        bool38 = boolDecode18;
                        continue;
                    case 96:
                        Boolean boolDecode19 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var71 = jn0.h0.f84049a;
                        bool39 = boolDecode19;
                        continue;
                    case 97:
                        i13 = i13;
                        z31 = z31;
                        z32 = z32;
                        try {
                            mVarDecode = ec0.m.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                        }
                        jn0.h0 h0Var72 = jn0.h0.f84049a;
                        break;
                    case 98:
                        Boolean boolDecode20 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var73 = jn0.h0.f84049a;
                        bool40 = boolDecode20;
                        continue;
                    case 99:
                        Boolean boolDecode21 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var74 = jn0.h0.f84049a;
                        bool41 = boolDecode21;
                        continue;
                    case 100:
                        j0 j0VarDecode = j0.f68082n.decode(reader);
                        jn0.h0 h0Var75 = jn0.h0.f84049a;
                        j0Var = j0VarDecode;
                        continue;
                    case 101:
                        Integer numDecode3 = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var76 = jn0.h0.f84049a;
                        num = numDecode3;
                        continue;
                    case 108:
                        String strDecode7 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var77 = jn0.h0.f84049a;
                        str6 = strDecode7;
                        continue;
                    case 109:
                        String strDecode8 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var78 = jn0.h0.f84049a;
                        str7 = strDecode8;
                        continue;
                    case 110:
                        String strDecode9 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var79 = jn0.h0.f84049a;
                        str8 = strDecode9;
                        continue;
                    case 118:
                        String strDecode10 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var80 = jn0.h0.f84049a;
                        str9 = strDecode10;
                        continue;
                    case 120:
                        Boolean boolDecode22 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var81 = jn0.h0.f84049a;
                        bool = boolDecode22;
                        continue;
                    case 121:
                        Boolean boolDecode23 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var82 = jn0.h0.f84049a;
                        bool2 = boolDecode23;
                        continue;
                    case 122:
                        Boolean boolDecode24 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var83 = jn0.h0.f84049a;
                        bool3 = boolDecode24;
                        continue;
                    case 131:
                        String strDecode11 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var84 = jn0.h0.f84049a;
                        str10 = strDecode11;
                        continue;
                    case 133:
                        Integer numDecode4 = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var85 = jn0.h0.f84049a;
                        num2 = numDecode4;
                        continue;
                    case 135:
                        Boolean boolDecode25 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var86 = jn0.h0.f84049a;
                        bool4 = boolDecode25;
                        continue;
                    case 136:
                        Boolean boolDecode26 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var87 = jn0.h0.f84049a;
                        bool5 = boolDecode26;
                        continue;
                    case 141:
                        Boolean boolDecode27 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var88 = jn0.h0.f84049a;
                        bool6 = boolDecode27;
                        continue;
                    case 142:
                        Boolean boolDecode28 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var89 = jn0.h0.f84049a;
                        bool7 = boolDecode28;
                        continue;
                    case 144:
                        Boolean boolDecode29 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var90 = jn0.h0.f84049a;
                        bool8 = boolDecode29;
                        continue;
                    case 145:
                        Integer numDecode5 = ProtoAdapter.UINT32.decode(reader);
                        jn0.h0 h0Var91 = jn0.h0.f84049a;
                        num3 = numDecode5;
                        continue;
                    case 148:
                        Boolean boolDecode30 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var92 = jn0.h0.f84049a;
                        bool9 = boolDecode30;
                        continue;
                    case 149:
                        Boolean boolDecode31 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var93 = jn0.h0.f84049a;
                        bool10 = boolDecode31;
                        continue;
                    case 150:
                        try {
                            sVarDecode2 = s.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                        }
                        jn0.h0 h0Var94 = jn0.h0.f84049a;
                        break;
                    case 151:
                        Float fDecode = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var95 = jn0.h0.f84049a;
                        f17 = fDecode;
                        continue;
                    case 152:
                        Float fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var96 = jn0.h0.f84049a;
                        f18 = fDecode2;
                        continue;
                    case 153:
                        Float fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var97 = jn0.h0.f84049a;
                        f19 = fDecode3;
                        continue;
                    case 154:
                        Float fDecode4 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var98 = jn0.h0.f84049a;
                        f21 = fDecode4;
                        continue;
                    case 156:
                        Boolean boolDecode32 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var99 = jn0.h0.f84049a;
                        bool11 = boolDecode32;
                        continue;
                    case 157:
                        Boolean boolDecode33 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var100 = jn0.h0.f84049a;
                        bool12 = boolDecode33;
                        continue;
                    case 162:
                        Boolean boolDecode34 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var101 = jn0.h0.f84049a;
                        bool13 = boolDecode34;
                        continue;
                    case 163:
                        Boolean boolDecode35 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var102 = jn0.h0.f84049a;
                        bool14 = boolDecode35;
                        continue;
                    case 164:
                        Boolean boolDecode36 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var103 = jn0.h0.f84049a;
                        bool15 = boolDecode36;
                        continue;
                    case 165:
                        Boolean boolDecode37 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var104 = jn0.h0.f84049a;
                        bool16 = boolDecode37;
                        continue;
                    case 166:
                        Boolean boolDecode38 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var105 = jn0.h0.f84049a;
                        bool17 = boolDecode38;
                        continue;
                    case 167:
                        Boolean boolDecode39 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var106 = jn0.h0.f84049a;
                        bool18 = boolDecode39;
                        continue;
                    case 168:
                        Boolean boolDecode40 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var107 = jn0.h0.f84049a;
                        bool19 = boolDecode40;
                        continue;
                    case 169:
                        Boolean boolDecode41 = ProtoAdapter.BOOL.decode(reader);
                        jn0.h0 h0Var108 = jn0.h0.f84049a;
                        bool20 = boolDecode41;
                        continue;
                    case 170:
                        Float fDecode5 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var109 = jn0.h0.f84049a;
                        f22 = fDecode5;
                        continue;
                    case 171:
                        Float fDecode6 = ProtoAdapter.FLOAT.decode(reader);
                        jn0.h0 h0Var110 = jn0.h0.f84049a;
                        f23 = fDecode6;
                        continue;
                    case 172:
                        String strDecode12 = ProtoAdapter.STRING.decode(reader);
                        jn0.h0 h0Var111 = jn0.h0.f84049a;
                        str12 = strDecode12;
                        continue;
                }
                i13 = i13;
                z31 = z31;
                z32 = z32;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, a0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getApi_version_OBSOLETE() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getApi_version_OBSOLETE()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCar_version_OBSOLETE(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getCar_version_OBSOLETE());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getDetailed_version_OBSOLETE(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 9, value.getDetailed_version_OBSOLETE());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getAutopilot_hash_OBSOLETE(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 10, value.getAutopilot_hash_OBSOLETE());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getVehicle_name_OBSOLETE(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 18, value.getVehicle_name_OBSOLETE());
            }
            if (value.getNotifications_supported_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 20, Boolean.valueOf(value.getNotifications_supported_OBSOLETE()));
            }
            if (value.getRemote_start_supported_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 21, Boolean.valueOf(value.getRemote_start_supported_OBSOLETE()));
            }
            if (value.getRemote_start_enabled_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 22, Boolean.valueOf(value.getRemote_start_enabled_OBSOLETE()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getLast_autopark_error_OBSOLETE(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 31, value.getLast_autopark_error_OBSOLETE());
            }
            if (value.getHomelink_device_count_OBSOLETE() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 33, Integer.valueOf(value.getHomelink_device_count_OBSOLETE()));
            }
            if (value.getSmart_summon_available_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 35, Boolean.valueOf(value.getSmart_summon_available_OBSOLETE()));
            }
            if (value.getSummon_standby_mode_enabled_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 36, Boolean.valueOf(value.getSummon_standby_mode_enabled_OBSOLETE()));
            }
            if (value.getPatsy_mode_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 41, Boolean.valueOf(value.getPatsy_mode_OBSOLETE()));
            }
            if (value.getWebcam_available_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 42, Boolean.valueOf(value.getWebcam_available_OBSOLETE()));
            }
            if (value.getVehicle_self_test_requested_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 44, Boolean.valueOf(value.getVehicle_self_test_requested_OBSOLETE()));
            }
            if (value.getVehicle_self_test_progress_OBSOLETE() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 45, Integer.valueOf(value.getVehicle_self_test_progress_OBSOLETE()));
            }
            if (value.getCalendar_supported_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 48, Boolean.valueOf(value.getCalendar_supported_OBSOLETE()));
            }
            if (value.getDashcam_clip_save_available_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 49, Boolean.valueOf(value.getDashcam_clip_save_available_OBSOLETE()));
            }
            if (value.getDashcam_state_OBSOLETE() != s.DashCamState_UNAVAILABLE) {
                s.ADAPTER.encodeWithTag(writer, 50, value.getDashcam_state_OBSOLETE());
            }
            if (value.getTpms_pressure_fl_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 51, Float.valueOf(value.getTpms_pressure_fl_OBSOLETE()));
            }
            if (value.getTpms_pressure_fr_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 52, Float.valueOf(value.getTpms_pressure_fr_OBSOLETE()));
            }
            if (value.getTpms_pressure_rl_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 53, Float.valueOf(value.getTpms_pressure_rl_OBSOLETE()));
            }
            if (value.getTpms_pressure_rr_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 54, Float.valueOf(value.getTpms_pressure_rr_OBSOLETE()));
            }
            if (value.getService_mode_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 56, Boolean.valueOf(value.getService_mode_OBSOLETE()));
            }
            if (value.getService_mode_plus_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 57, Boolean.valueOf(value.getService_mode_plus_OBSOLETE()));
            }
            if (value.getTpms_hard_warning_fl_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 62, Boolean.valueOf(value.getTpms_hard_warning_fl_OBSOLETE()));
            }
            if (value.getTpms_hard_warning_fr_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 63, Boolean.valueOf(value.getTpms_hard_warning_fr_OBSOLETE()));
            }
            if (value.getTpms_hard_warning_rl_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 64, Boolean.valueOf(value.getTpms_hard_warning_rl_OBSOLETE()));
            }
            if (value.getTpms_hard_warning_rr_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 65, Boolean.valueOf(value.getTpms_hard_warning_rr_OBSOLETE()));
            }
            if (value.getTpms_soft_warning_fl_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 66, Boolean.valueOf(value.getTpms_soft_warning_fl_OBSOLETE()));
            }
            if (value.getTpms_soft_warning_fr_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 67, Boolean.valueOf(value.getTpms_soft_warning_fr_OBSOLETE()));
            }
            if (value.getTpms_soft_warning_rl_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 68, Boolean.valueOf(value.getTpms_soft_warning_rl_OBSOLETE()));
            }
            if (value.getTpms_soft_warning_rr_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 69, Boolean.valueOf(value.getTpms_soft_warning_rr_OBSOLETE()));
            }
            if (value.getTpms_rcp_front_value_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 70, Float.valueOf(value.getTpms_rcp_front_value_OBSOLETE()));
            }
            if (value.getTpms_rcp_rear_value_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 71, Float.valueOf(value.getTpms_rcp_rear_value_OBSOLETE()));
            }
            if (value.getAutopark_style() != null) {
                c.f67979d.encodeWithTag(writer, 34, value.getAutopark_style());
            }
            if (value.getActive_spoiler_state() != null) {
                q0.f68379f.encodeWithTag(writer, 37, value.getActive_spoiler_state());
            }
            if (value.getSoftware_update_state() != null) {
                n0.f68142q.encodeWithTag(writer, 38, value.getSoftware_update_state());
            }
            if (value.getLegacy_media_state() != null) {
                z.f68729d.encodeWithTag(writer, 39, value.getLegacy_media_state());
            }
            if (value.getTimestamp() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 43, value.getTimestamp());
            }
            if (value.getAutopark_version() != null) {
                d.f67990e.encodeWithTag(writer, 46, value.getAutopark_version());
            }
            if (value.getAutopark_state() != null) {
                b.f67961n.encodeWithTag(writer, 47, value.getAutopark_state());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.asPacked().encodeWithTag(writer, 55, value.y());
            if (value.getTpms_last_seen_pressure_time_fl() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 58, value.getTpms_last_seen_pressure_time_fl());
            }
            if (value.getTpms_last_seen_pressure_time_fr() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 59, value.getTpms_last_seen_pressure_time_fr());
            }
            if (value.getTpms_last_seen_pressure_time_rl() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 60, value.getTpms_last_seen_pressure_time_rl());
            }
            if (value.getTpms_last_seen_pressure_time_rr() != null) {
                ProtoAdapter.INSTANT.encodeWithTag(writer, 61, value.getTpms_last_seen_pressure_time_rr());
            }
            if (value.getLegacy_media_info() != null) {
                y.f68710o.encodeWithTag(writer, 72, value.getLegacy_media_info());
            }
            if (value.getGuestMode() != null) {
                w.f68663c.encodeWithTag(writer, 74, value.getGuestMode());
            }
            if (value.getParental_controls_settings() != null) {
                j0.f68082n.encodeWithTag(writer, 100, value.getParental_controls_settings());
            }
            protoAdapter.encodeWithTag(writer, 101, value.getApi_version());
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(writer, 108, value.getCar_version());
            protoAdapter2.encodeWithTag(writer, 109, value.getDetailed_version());
            protoAdapter2.encodeWithTag(writer, 110, value.getAutopilot_hash());
            protoAdapter2.encodeWithTag(writer, 118, value.getVehicle_name());
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(writer, 120, value.getNotifications_supported());
            protoAdapter3.encodeWithTag(writer, 121, value.getRemote_start_supported());
            protoAdapter3.encodeWithTag(writer, 122, value.getRemote_start_enabled());
            protoAdapter2.encodeWithTag(writer, 131, value.getLast_autopark_error());
            protoAdapter.encodeWithTag(writer, 133, value.getHomelink_device_count());
            protoAdapter3.encodeWithTag(writer, 135, value.getSmart_summon_available());
            protoAdapter3.encodeWithTag(writer, 136, value.getSummon_standby_mode_enabled());
            protoAdapter3.encodeWithTag(writer, 141, value.getPatsy_mode());
            protoAdapter3.encodeWithTag(writer, 142, value.getWebcam_available());
            protoAdapter3.encodeWithTag(writer, 144, value.getVehicle_self_test_requested());
            protoAdapter.encodeWithTag(writer, 145, value.getVehicle_self_test_progress());
            protoAdapter3.encodeWithTag(writer, 148, value.getCalendar_supported());
            protoAdapter3.encodeWithTag(writer, 149, value.getDashcam_clip_save_available());
            s.ADAPTER.encodeWithTag(writer, 150, value.getDashcam_state());
            ProtoAdapter<Float> protoAdapter4 = ProtoAdapter.FLOAT;
            protoAdapter4.encodeWithTag(writer, 151, value.getTpms_pressure_fl());
            protoAdapter4.encodeWithTag(writer, 152, value.getTpms_pressure_fr());
            protoAdapter4.encodeWithTag(writer, 153, value.getTpms_pressure_rl());
            protoAdapter4.encodeWithTag(writer, 154, value.getTpms_pressure_rr());
            protoAdapter3.encodeWithTag(writer, 156, value.getService_mode());
            protoAdapter3.encodeWithTag(writer, 157, value.getService_mode_plus());
            protoAdapter3.encodeWithTag(writer, 162, value.getTpms_hard_warning_fl());
            protoAdapter3.encodeWithTag(writer, 163, value.getTpms_hard_warning_fr());
            protoAdapter3.encodeWithTag(writer, 164, value.getTpms_hard_warning_rl());
            protoAdapter3.encodeWithTag(writer, 165, value.getTpms_hard_warning_rr());
            protoAdapter3.encodeWithTag(writer, 166, value.getTpms_soft_warning_fl());
            protoAdapter3.encodeWithTag(writer, 167, value.getTpms_soft_warning_fr());
            protoAdapter3.encodeWithTag(writer, 168, value.getTpms_soft_warning_rl());
            protoAdapter3.encodeWithTag(writer, 169, value.getTpms_soft_warning_rr());
            protoAdapter4.encodeWithTag(writer, 170, value.getTpms_rcp_front_value());
            protoAdapter4.encodeWithTag(writer, 171, value.getTpms_rcp_rear_value());
            protoAdapter3.encodeWithTag(writer, 73, value.getAllow_authorized_mobile_devices_only());
            protoAdapter3.encodeWithTag(writer, 75, value.getDrive_rail_on());
            protoAdapter3.encodeWithTag(writer, 76, value.getPin_to_drive_enabled());
            protoAdapter3.encodeWithTag(writer, 77, value.getPin_to_drive_pin_set());
            protoAdapter3.encodeWithTag(writer, 78, value.getFrontfoglights_on());
            protoAdapter3.encodeWithTag(writer, 79, value.getRearfoglights_on());
            protoAdapter3.encodeWithTag(writer, 80, value.getHeadlights_on());
            protoAdapter3.encodeWithTag(writer, 81, value.getHighbeamlights_on());
            protoAdapter3.encodeWithTag(writer, 82, value.getTrailer_mode_on());
            protoAdapter3.encodeWithTag(writer, 83, value.getTrailer_light_test_available());
            protoAdapter3.encodeWithTag(writer, 84, value.getTrailer_light_test_requested());
            protoAdapter.encodeWithTag(writer, 86, value.getTruck_bed_lights_brightness());
            protoAdapter.encodeWithTag(writer, 90, value.getTruck_bed_lights_auto_brightness());
            protoAdapter3.encodeWithTag(writer, 91, value.getTruck_bed_lights_auto_state());
            protoAdapter3.encodeWithTag(writer, 92, value.getTruck_bed_lights_controls_disabled());
            protoAdapter3.encodeWithTag(writer, 87, value.getSigned_cmd_service_mode());
            protoAdapter3.encodeWithTag(writer, 88, value.getAccessory_lightbar_middle_on());
            protoAdapter3.encodeWithTag(writer, 89, value.getTransport_mode());
            protoAdapter2.encodeWithTag(writer, 93, value.getService_mode_auth());
            protoAdapter3.encodeWithTag(writer, 94, value.getService_gtw_diag_session_active());
            protoAdapter3.encodeWithTag(writer, 95, value.getFactory_mode());
            protoAdapter3.encodeWithTag(writer, 96, value.getTraining_wheels_mode());
            ec0.m.ADAPTER.encodeWithTag(writer, 97, value.getGtw_diag_level());
            protoAdapter3.encodeWithTag(writer, 98, value.getParental_controls_active());
            protoAdapter3.encodeWithTag(writer, 99, value.getParental_controls_pin_set());
            protoAdapter2.encodeWithTag(writer, 172, value.getFsd_software_version());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(a0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getApi_version_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getApi_version_OBSOLETE()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getCar_version_OBSOLETE(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getCar_version_OBSOLETE());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getDetailed_version_OBSOLETE(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getDetailed_version_OBSOLETE());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getAutopilot_hash_OBSOLETE(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getAutopilot_hash_OBSOLETE());
            }
            if (!p013kotlin.jvm.internal.s.f(value.getVehicle_name_OBSOLETE(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(18, value.getVehicle_name_OBSOLETE());
            }
            if (value.getNotifications_supported_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(20, Boolean.valueOf(value.getNotifications_supported_OBSOLETE()));
            }
            if (value.getRemote_start_supported_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(21, Boolean.valueOf(value.getRemote_start_supported_OBSOLETE()));
            }
            if (value.getRemote_start_enabled_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(22, Boolean.valueOf(value.getRemote_start_enabled_OBSOLETE()));
            }
            if (!p013kotlin.jvm.internal.s.f(value.getLast_autopark_error_OBSOLETE(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(31, value.getLast_autopark_error_OBSOLETE());
            }
            if (value.getHomelink_device_count_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(33, Integer.valueOf(value.getHomelink_device_count_OBSOLETE()));
            }
            if (value.getSmart_summon_available_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(35, Boolean.valueOf(value.getSmart_summon_available_OBSOLETE()));
            }
            if (value.getSummon_standby_mode_enabled_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(36, Boolean.valueOf(value.getSummon_standby_mode_enabled_OBSOLETE()));
            }
            if (value.getPatsy_mode_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(41, Boolean.valueOf(value.getPatsy_mode_OBSOLETE()));
            }
            if (value.getWebcam_available_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(42, Boolean.valueOf(value.getWebcam_available_OBSOLETE()));
            }
            if (value.getVehicle_self_test_requested_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(44, Boolean.valueOf(value.getVehicle_self_test_requested_OBSOLETE()));
            }
            if (value.getVehicle_self_test_progress_OBSOLETE() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(45, Integer.valueOf(value.getVehicle_self_test_progress_OBSOLETE()));
            }
            if (value.getCalendar_supported_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(48, Boolean.valueOf(value.getCalendar_supported_OBSOLETE()));
            }
            if (value.getDashcam_clip_save_available_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(49, Boolean.valueOf(value.getDashcam_clip_save_available_OBSOLETE()));
            }
            if (value.getDashcam_state_OBSOLETE() != s.DashCamState_UNAVAILABLE) {
                iD += s.ADAPTER.encodedSizeWithTag(50, value.getDashcam_state_OBSOLETE());
            }
            if (value.getTpms_pressure_fl_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(51, Float.valueOf(value.getTpms_pressure_fl_OBSOLETE()));
            }
            if (value.getTpms_pressure_fr_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(52, Float.valueOf(value.getTpms_pressure_fr_OBSOLETE()));
            }
            if (value.getTpms_pressure_rl_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(53, Float.valueOf(value.getTpms_pressure_rl_OBSOLETE()));
            }
            if (value.getTpms_pressure_rr_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(54, Float.valueOf(value.getTpms_pressure_rr_OBSOLETE()));
            }
            if (value.getService_mode_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(56, Boolean.valueOf(value.getService_mode_OBSOLETE()));
            }
            if (value.getService_mode_plus_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(57, Boolean.valueOf(value.getService_mode_plus_OBSOLETE()));
            }
            if (value.getTpms_hard_warning_fl_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(62, Boolean.valueOf(value.getTpms_hard_warning_fl_OBSOLETE()));
            }
            if (value.getTpms_hard_warning_fr_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(63, Boolean.valueOf(value.getTpms_hard_warning_fr_OBSOLETE()));
            }
            if (value.getTpms_hard_warning_rl_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(64, Boolean.valueOf(value.getTpms_hard_warning_rl_OBSOLETE()));
            }
            if (value.getTpms_hard_warning_rr_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(65, Boolean.valueOf(value.getTpms_hard_warning_rr_OBSOLETE()));
            }
            if (value.getTpms_soft_warning_fl_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(66, Boolean.valueOf(value.getTpms_soft_warning_fl_OBSOLETE()));
            }
            if (value.getTpms_soft_warning_fr_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(67, Boolean.valueOf(value.getTpms_soft_warning_fr_OBSOLETE()));
            }
            if (value.getTpms_soft_warning_rl_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(68, Boolean.valueOf(value.getTpms_soft_warning_rl_OBSOLETE()));
            }
            if (value.getTpms_soft_warning_rr_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(69, Boolean.valueOf(value.getTpms_soft_warning_rr_OBSOLETE()));
            }
            if (value.getTpms_rcp_front_value_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(70, Float.valueOf(value.getTpms_rcp_front_value_OBSOLETE()));
            }
            if (value.getTpms_rcp_rear_value_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(71, Float.valueOf(value.getTpms_rcp_rear_value_OBSOLETE()));
            }
            if (value.getAutopark_style() != null) {
                iD += c.f67979d.encodedSizeWithTag(34, value.getAutopark_style());
            }
            if (value.getActive_spoiler_state() != null) {
                iD += q0.f68379f.encodedSizeWithTag(37, value.getActive_spoiler_state());
            }
            if (value.getSoftware_update_state() != null) {
                iD += n0.f68142q.encodedSizeWithTag(38, value.getSoftware_update_state());
            }
            if (value.getLegacy_media_state() != null) {
                iD += z.f68729d.encodedSizeWithTag(39, value.getLegacy_media_state());
            }
            if (value.getTimestamp() != null) {
                iD += ProtoAdapter.INSTANT.encodedSizeWithTag(43, value.getTimestamp());
            }
            if (value.getAutopark_version() != null) {
                iD += d.f67990e.encodedSizeWithTag(46, value.getAutopark_version());
            }
            if (value.getAutopark_state() != null) {
                iD += b.f67961n.encodedSizeWithTag(47, value.getAutopark_state());
            }
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int iEncodedSizeWithTag = iD + protoAdapter.asPacked().encodedSizeWithTag(55, value.y());
            if (value.getTpms_last_seen_pressure_time_fl() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(58, value.getTpms_last_seen_pressure_time_fl());
            }
            if (value.getTpms_last_seen_pressure_time_fr() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(59, value.getTpms_last_seen_pressure_time_fr());
            }
            if (value.getTpms_last_seen_pressure_time_rl() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(60, value.getTpms_last_seen_pressure_time_rl());
            }
            if (value.getTpms_last_seen_pressure_time_rr() != null) {
                iEncodedSizeWithTag += ProtoAdapter.INSTANT.encodedSizeWithTag(61, value.getTpms_last_seen_pressure_time_rr());
            }
            if (value.getLegacy_media_info() != null) {
                iEncodedSizeWithTag += y.f68710o.encodedSizeWithTag(72, value.getLegacy_media_info());
            }
            if (value.getGuestMode() != null) {
                iEncodedSizeWithTag += w.f68663c.encodedSizeWithTag(74, value.getGuestMode());
            }
            if (value.getParental_controls_settings() != null) {
                iEncodedSizeWithTag += j0.f68082n.encodedSizeWithTag(100, value.getParental_controls_settings());
            }
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(101, value.getApi_version());
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(108, value.getCar_version()) + protoAdapter2.encodedSizeWithTag(109, value.getDetailed_version()) + protoAdapter2.encodedSizeWithTag(110, value.getAutopilot_hash()) + protoAdapter2.encodedSizeWithTag(118, value.getVehicle_name());
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(120, value.getNotifications_supported()) + protoAdapter3.encodedSizeWithTag(121, value.getRemote_start_supported()) + protoAdapter3.encodedSizeWithTag(122, value.getRemote_start_enabled()) + protoAdapter2.encodedSizeWithTag(131, value.getLast_autopark_error()) + protoAdapter.encodedSizeWithTag(133, value.getHomelink_device_count()) + protoAdapter3.encodedSizeWithTag(135, value.getSmart_summon_available()) + protoAdapter3.encodedSizeWithTag(136, value.getSummon_standby_mode_enabled()) + protoAdapter3.encodedSizeWithTag(141, value.getPatsy_mode()) + protoAdapter3.encodedSizeWithTag(142, value.getWebcam_available()) + protoAdapter3.encodedSizeWithTag(144, value.getVehicle_self_test_requested()) + protoAdapter.encodedSizeWithTag(145, value.getVehicle_self_test_progress()) + protoAdapter3.encodedSizeWithTag(148, value.getCalendar_supported()) + protoAdapter3.encodedSizeWithTag(149, value.getDashcam_clip_save_available()) + s.ADAPTER.encodedSizeWithTag(150, value.getDashcam_state());
            ProtoAdapter<Float> protoAdapter4 = ProtoAdapter.FLOAT;
            return iEncodedSizeWithTag4 + protoAdapter4.encodedSizeWithTag(151, value.getTpms_pressure_fl()) + protoAdapter4.encodedSizeWithTag(152, value.getTpms_pressure_fr()) + protoAdapter4.encodedSizeWithTag(153, value.getTpms_pressure_rl()) + protoAdapter4.encodedSizeWithTag(154, value.getTpms_pressure_rr()) + protoAdapter3.encodedSizeWithTag(156, value.getService_mode()) + protoAdapter3.encodedSizeWithTag(157, value.getService_mode_plus()) + protoAdapter3.encodedSizeWithTag(162, value.getTpms_hard_warning_fl()) + protoAdapter3.encodedSizeWithTag(163, value.getTpms_hard_warning_fr()) + protoAdapter3.encodedSizeWithTag(164, value.getTpms_hard_warning_rl()) + protoAdapter3.encodedSizeWithTag(165, value.getTpms_hard_warning_rr()) + protoAdapter3.encodedSizeWithTag(166, value.getTpms_soft_warning_fl()) + protoAdapter3.encodedSizeWithTag(167, value.getTpms_soft_warning_fr()) + protoAdapter3.encodedSizeWithTag(168, value.getTpms_soft_warning_rl()) + protoAdapter3.encodedSizeWithTag(169, value.getTpms_soft_warning_rr()) + protoAdapter4.encodedSizeWithTag(170, value.getTpms_rcp_front_value()) + protoAdapter4.encodedSizeWithTag(171, value.getTpms_rcp_rear_value()) + protoAdapter3.encodedSizeWithTag(73, value.getAllow_authorized_mobile_devices_only()) + protoAdapter3.encodedSizeWithTag(75, value.getDrive_rail_on()) + protoAdapter3.encodedSizeWithTag(76, value.getPin_to_drive_enabled()) + protoAdapter3.encodedSizeWithTag(77, value.getPin_to_drive_pin_set()) + protoAdapter3.encodedSizeWithTag(78, value.getFrontfoglights_on()) + protoAdapter3.encodedSizeWithTag(79, value.getRearfoglights_on()) + protoAdapter3.encodedSizeWithTag(80, value.getHeadlights_on()) + protoAdapter3.encodedSizeWithTag(81, value.getHighbeamlights_on()) + protoAdapter3.encodedSizeWithTag(82, value.getTrailer_mode_on()) + protoAdapter3.encodedSizeWithTag(83, value.getTrailer_light_test_available()) + protoAdapter3.encodedSizeWithTag(84, value.getTrailer_light_test_requested()) + protoAdapter.encodedSizeWithTag(86, value.getTruck_bed_lights_brightness()) + protoAdapter.encodedSizeWithTag(90, value.getTruck_bed_lights_auto_brightness()) + protoAdapter3.encodedSizeWithTag(91, value.getTruck_bed_lights_auto_state()) + protoAdapter3.encodedSizeWithTag(92, value.getTruck_bed_lights_controls_disabled()) + protoAdapter3.encodedSizeWithTag(87, value.getSigned_cmd_service_mode()) + protoAdapter3.encodedSizeWithTag(88, value.getAccessory_lightbar_middle_on()) + protoAdapter3.encodedSizeWithTag(89, value.getTransport_mode()) + protoAdapter2.encodedSizeWithTag(93, value.getService_mode_auth()) + protoAdapter3.encodedSizeWithTag(94, value.getService_gtw_diag_session_active()) + protoAdapter3.encodedSizeWithTag(95, value.getFactory_mode()) + protoAdapter3.encodedSizeWithTag(96, value.getTraining_wheels_mode()) + ec0.m.ADAPTER.encodedSizeWithTag(97, value.getGtw_diag_level()) + protoAdapter3.encodedSizeWithTag(98, value.getParental_controls_active()) + protoAdapter3.encodedSizeWithTag(99, value.getParental_controls_pin_set()) + protoAdapter2.encodedSizeWithTag(172, value.getFsd_software_version());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a0 redact(a0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            c autopark_style = value.getAutopark_style();
            c cVarRedact = autopark_style != null ? c.f67979d.redact(autopark_style) : null;
            q0 active_spoiler_state = value.getActive_spoiler_state();
            q0 q0VarRedact = active_spoiler_state != null ? q0.f68379f.redact(active_spoiler_state) : null;
            n0 software_update_state = value.getSoftware_update_state();
            n0 n0VarRedact = software_update_state != null ? n0.f68142q.redact(software_update_state) : null;
            z legacy_media_state = value.getLegacy_media_state();
            z zVarRedact = legacy_media_state != null ? z.f68729d.redact(legacy_media_state) : null;
            Instant timestamp = value.getTimestamp();
            Instant instantRedact = timestamp != null ? ProtoAdapter.INSTANT.redact(timestamp) : null;
            d autopark_version = value.getAutopark_version();
            d dVarRedact = autopark_version != null ? d.f67990e.redact(autopark_version) : null;
            b autopark_state = value.getAutopark_state();
            b bVarRedact = autopark_state != null ? b.f67961n.redact(autopark_state) : null;
            Instant tpms_last_seen_pressure_time_fl = value.getTpms_last_seen_pressure_time_fl();
            Instant instantRedact2 = tpms_last_seen_pressure_time_fl != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_fl) : null;
            Instant tpms_last_seen_pressure_time_fr = value.getTpms_last_seen_pressure_time_fr();
            Instant instantRedact3 = tpms_last_seen_pressure_time_fr != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_fr) : null;
            Instant tpms_last_seen_pressure_time_rl = value.getTpms_last_seen_pressure_time_rl();
            Instant instantRedact4 = tpms_last_seen_pressure_time_rl != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_rl) : null;
            Instant tpms_last_seen_pressure_time_rr = value.getTpms_last_seen_pressure_time_rr();
            Instant instantRedact5 = tpms_last_seen_pressure_time_rr != null ? ProtoAdapter.INSTANT.redact(tpms_last_seen_pressure_time_rr) : null;
            y legacy_media_info = value.getLegacy_media_info();
            y yVarRedact = legacy_media_info != null ? y.f68710o.redact(legacy_media_info) : null;
            w guestMode = value.getGuestMode();
            w wVarRedact = guestMode != null ? w.f68663c.redact(guestMode) : null;
            j0 parental_controls_settings = value.getParental_controls_settings();
            return a0.b(value, 0, null, null, null, null, false, false, false, null, 0, false, false, false, false, false, 0, false, false, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, false, false, false, false, false, false, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, cVarRedact, q0VarRedact, n0VarRedact, zVarRedact, instantRedact, dVarRedact, bVarRedact, null, instantRedact2, instantRedact3, instantRedact4, instantRedact5, yVarRedact, wVarRedact, parental_controls_settings != null ? j0.f68082n.redact(parental_controls_settings) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, okio.k.f97943e, -1, -261113, -1, 32767, null);
        }
    }

    public a0() {
        this(0, null, null, null, null, false, false, false, null, 0, false, false, false, false, false, 0, false, false, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, false, false, false, false, false, false, false, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 65535, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ a0 b(a0 a0Var, int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, boolean z13, String str5, int i12, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i13, boolean z19, boolean z21, s sVar, float f11, float f12, float f13, float f14, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32, float f15, float f16, c cVar, q0 q0Var, n0 n0Var, z zVar, Instant instant, d dVar, b bVar, List list, Instant instant2, Instant instant3, Instant instant4, Instant instant5, y yVar, w wVar, j0 j0Var, Integer num, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, String str10, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num3, Boolean bool9, Boolean bool10, s sVar2, Float f17, Float f18, Float f19, Float f21, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Float f22, Float f23, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Integer num4, Integer num5, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, String str11, Boolean bool37, Boolean bool38, Boolean bool39, ec0.m mVar, Boolean bool40, Boolean bool41, String str12, okio.k kVar, int i14, int i15, int i16, int i17, Object obj) {
        int i18 = (i14 & 1) != 0 ? a0Var.api_version_OBSOLETE : i11;
        String str13 = (i14 & 2) != 0 ? a0Var.car_version_OBSOLETE : str;
        String str14 = (i14 & 4) != 0 ? a0Var.detailed_version_OBSOLETE : str2;
        String str15 = (i14 & 8) != 0 ? a0Var.autopilot_hash_OBSOLETE : str3;
        String str16 = (i14 & 16) != 0 ? a0Var.vehicle_name_OBSOLETE : str4;
        boolean z33 = (i14 & 32) != 0 ? a0Var.notifications_supported_OBSOLETE : z11;
        boolean z34 = (i14 & 64) != 0 ? a0Var.remote_start_supported_OBSOLETE : z12;
        boolean z35 = (i14 & 128) != 0 ? a0Var.remote_start_enabled_OBSOLETE : z13;
        String str17 = (i14 & 256) != 0 ? a0Var.last_autopark_error_OBSOLETE : str5;
        int i19 = (i14 & 512) != 0 ? a0Var.homelink_device_count_OBSOLETE : i12;
        boolean z36 = (i14 & 1024) != 0 ? a0Var.smart_summon_available_OBSOLETE : z14;
        int i21 = i18;
        boolean z37 = (i14 & 2048) != 0 ? a0Var.summon_standby_mode_enabled_OBSOLETE : z15;
        boolean z38 = (i14 & 4096) != 0 ? a0Var.patsy_mode_OBSOLETE : z16;
        boolean z39 = (i14 & PKIFailureInfo.certRevoked) != 0 ? a0Var.webcam_available_OBSOLETE : z17;
        boolean z41 = (i14 & 16384) != 0 ? a0Var.vehicle_self_test_requested_OBSOLETE : z18;
        int i22 = (i14 & 32768) != 0 ? a0Var.vehicle_self_test_progress_OBSOLETE : i13;
        boolean z42 = (i14 & 65536) != 0 ? a0Var.calendar_supported_OBSOLETE : z19;
        boolean z43 = (i14 & 131072) != 0 ? a0Var.dashcam_clip_save_available_OBSOLETE : z21;
        s sVar3 = (i14 & 262144) != 0 ? a0Var.dashcam_state_OBSOLETE : sVar;
        float f24 = (i14 & PKIFailureInfo.signerNotTrusted) != 0 ? a0Var.tpms_pressure_fl_OBSOLETE : f11;
        float f25 = (i14 & PKIFailureInfo.badCertTemplate) != 0 ? a0Var.tpms_pressure_fr_OBSOLETE : f12;
        float f26 = (i14 & PKIFailureInfo.badSenderNonce) != 0 ? a0Var.tpms_pressure_rl_OBSOLETE : f13;
        float f27 = (i14 & 4194304) != 0 ? a0Var.tpms_pressure_rr_OBSOLETE : f14;
        boolean z44 = (i14 & 8388608) != 0 ? a0Var.service_mode_OBSOLETE : z22;
        boolean z45 = (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? a0Var.service_mode_plus_OBSOLETE : z23;
        boolean z46 = (i14 & 33554432) != 0 ? a0Var.tpms_hard_warning_fl_OBSOLETE : z24;
        boolean z47 = (i14 & 67108864) != 0 ? a0Var.tpms_hard_warning_fr_OBSOLETE : z25;
        boolean z48 = (i14 & 134217728) != 0 ? a0Var.tpms_hard_warning_rl_OBSOLETE : z26;
        boolean z49 = (i14 & 268435456) != 0 ? a0Var.tpms_hard_warning_rr_OBSOLETE : z27;
        boolean z51 = (i14 & PKIFailureInfo.duplicateCertReq) != 0 ? a0Var.tpms_soft_warning_fl_OBSOLETE : z28;
        boolean z52 = (i14 & 1073741824) != 0 ? a0Var.tpms_soft_warning_fr_OBSOLETE : z29;
        boolean z53 = (i14 & Integer.MIN_VALUE) != 0 ? a0Var.tpms_soft_warning_rl_OBSOLETE : z31;
        boolean z54 = (i15 & 1) != 0 ? a0Var.tpms_soft_warning_rr_OBSOLETE : z32;
        float f28 = (i15 & 2) != 0 ? a0Var.tpms_rcp_front_value_OBSOLETE : f15;
        float f29 = (i15 & 4) != 0 ? a0Var.tpms_rcp_rear_value_OBSOLETE : f16;
        c cVar2 = (i15 & 8) != 0 ? a0Var.autopark_style : cVar;
        q0 q0Var2 = (i15 & 16) != 0 ? a0Var.active_spoiler_state : q0Var;
        n0 n0Var2 = (i15 & 32) != 0 ? a0Var.software_update_state : n0Var;
        z zVar2 = (i15 & 64) != 0 ? a0Var.legacy_media_state : zVar;
        Instant instant6 = (i15 & 128) != 0 ? a0Var.timestamp : instant;
        d dVar2 = (i15 & 256) != 0 ? a0Var.autopark_version : dVar;
        b bVar2 = (i15 & 512) != 0 ? a0Var.autopark_state : bVar;
        List list2 = (i15 & 1024) != 0 ? a0Var.feature_bitmask : list;
        Instant instant7 = (i15 & 2048) != 0 ? a0Var.tpms_last_seen_pressure_time_fl : instant2;
        Instant instant8 = (i15 & 4096) != 0 ? a0Var.tpms_last_seen_pressure_time_fr : instant3;
        Instant instant9 = (i15 & PKIFailureInfo.certRevoked) != 0 ? a0Var.tpms_last_seen_pressure_time_rl : instant4;
        Instant instant10 = (i15 & 16384) != 0 ? a0Var.tpms_last_seen_pressure_time_rr : instant5;
        y yVar2 = (i15 & 32768) != 0 ? a0Var.legacy_media_info : yVar;
        w wVar2 = (i15 & 65536) != 0 ? a0Var.guestMode : wVar;
        j0 j0Var2 = (i15 & 131072) != 0 ? a0Var.parental_controls_settings : j0Var;
        Integer num6 = (i15 & 262144) != 0 ? a0Var.api_version : num;
        String str18 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? a0Var.car_version : str6;
        String str19 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? a0Var.detailed_version : str7;
        String str20 = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? a0Var.autopilot_hash : str8;
        String str21 = (i15 & 4194304) != 0 ? a0Var.vehicle_name : str9;
        Boolean bool42 = (i15 & 8388608) != 0 ? a0Var.notifications_supported : bool;
        Boolean bool43 = (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? a0Var.remote_start_supported : bool2;
        Boolean bool44 = (i15 & 33554432) != 0 ? a0Var.remote_start_enabled : bool3;
        String str22 = (i15 & 67108864) != 0 ? a0Var.last_autopark_error : str10;
        Integer num7 = (i15 & 134217728) != 0 ? a0Var.homelink_device_count : num2;
        Boolean bool45 = (i15 & 268435456) != 0 ? a0Var.smart_summon_available : bool4;
        Boolean bool46 = (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? a0Var.summon_standby_mode_enabled : bool5;
        Boolean bool47 = (i15 & 1073741824) != 0 ? a0Var.patsy_mode : bool6;
        return a0Var.a(i21, str13, str14, str15, str16, z33, z34, z35, str17, i19, z36, z37, z38, z39, z41, i22, z42, z43, sVar3, f24, f25, f26, f27, z44, z45, z46, z47, z48, z49, z51, z52, z53, z54, f28, f29, cVar2, q0Var2, n0Var2, zVar2, instant6, dVar2, bVar2, list2, instant7, instant8, instant9, instant10, yVar2, wVar2, j0Var2, num6, str18, str19, str20, str21, bool42, bool43, bool44, str22, num7, bool45, bool46, bool47, (i15 & Integer.MIN_VALUE) != 0 ? a0Var.webcam_available : bool7, (i16 & 1) != 0 ? a0Var.vehicle_self_test_requested : bool8, (i16 & 2) != 0 ? a0Var.vehicle_self_test_progress : num3, (i16 & 4) != 0 ? a0Var.calendar_supported : bool9, (i16 & 8) != 0 ? a0Var.dashcam_clip_save_available : bool10, (i16 & 16) != 0 ? a0Var.dashcam_state : sVar2, (i16 & 32) != 0 ? a0Var.tpms_pressure_fl : f17, (i16 & 64) != 0 ? a0Var.tpms_pressure_fr : f18, (i16 & 128) != 0 ? a0Var.tpms_pressure_rl : f19, (i16 & 256) != 0 ? a0Var.tpms_pressure_rr : f21, (i16 & 512) != 0 ? a0Var.service_mode : bool11, (i16 & 1024) != 0 ? a0Var.service_mode_plus : bool12, (i16 & 2048) != 0 ? a0Var.tpms_hard_warning_fl : bool13, (i16 & 4096) != 0 ? a0Var.tpms_hard_warning_fr : bool14, (i16 & PKIFailureInfo.certRevoked) != 0 ? a0Var.tpms_hard_warning_rl : bool15, (i16 & 16384) != 0 ? a0Var.tpms_hard_warning_rr : bool16, (i16 & 32768) != 0 ? a0Var.tpms_soft_warning_fl : bool17, (i16 & 65536) != 0 ? a0Var.tpms_soft_warning_fr : bool18, (i16 & 131072) != 0 ? a0Var.tpms_soft_warning_rl : bool19, (i16 & 262144) != 0 ? a0Var.tpms_soft_warning_rr : bool20, (i16 & PKIFailureInfo.signerNotTrusted) != 0 ? a0Var.tpms_rcp_front_value : f22, (i16 & PKIFailureInfo.badCertTemplate) != 0 ? a0Var.tpms_rcp_rear_value : f23, (i16 & PKIFailureInfo.badSenderNonce) != 0 ? a0Var.allow_authorized_mobile_devices_only : bool21, (i16 & 4194304) != 0 ? a0Var.drive_rail_on : bool22, (i16 & 8388608) != 0 ? a0Var.pin_to_drive_enabled : bool23, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? a0Var.pin_to_drive_pin_set : bool24, (i16 & 33554432) != 0 ? a0Var.frontfoglights_on : bool25, (i16 & 67108864) != 0 ? a0Var.rearfoglights_on : bool26, (i16 & 134217728) != 0 ? a0Var.headlights_on : bool27, (i16 & 268435456) != 0 ? a0Var.highbeamlights_on : bool28, (i16 & PKIFailureInfo.duplicateCertReq) != 0 ? a0Var.trailer_mode_on : bool29, (i16 & 1073741824) != 0 ? a0Var.trailer_light_test_available : bool30, (i16 & Integer.MIN_VALUE) != 0 ? a0Var.trailer_light_test_requested : bool31, (i17 & 1) != 0 ? a0Var.truck_bed_lights_brightness : num4, (i17 & 2) != 0 ? a0Var.truck_bed_lights_auto_brightness : num5, (i17 & 4) != 0 ? a0Var.truck_bed_lights_auto_state : bool32, (i17 & 8) != 0 ? a0Var.truck_bed_lights_controls_disabled : bool33, (i17 & 16) != 0 ? a0Var.signed_cmd_service_mode : bool34, (i17 & 32) != 0 ? a0Var.accessory_lightbar_middle_on : bool35, (i17 & 64) != 0 ? a0Var.transport_mode : bool36, (i17 & 128) != 0 ? a0Var.service_mode_auth : str11, (i17 & 256) != 0 ? a0Var.service_gtw_diag_session_active : bool37, (i17 & 512) != 0 ? a0Var.factory_mode : bool38, (i17 & 1024) != 0 ? a0Var.training_wheels_mode : bool39, (i17 & 2048) != 0 ? a0Var.gtw_diag_level : mVar, (i17 & 4096) != 0 ? a0Var.parental_controls_active : bool40, (i17 & PKIFailureInfo.certRevoked) != 0 ? a0Var.parental_controls_pin_set : bool41, (i17 & 16384) != 0 ? a0Var.fsd_software_version : str12, (i17 & 32768) != 0 ? a0Var.unknownFields() : kVar);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getFsd_software_version() {
        return this.fsd_software_version;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Float getTpms_pressure_fl() {
        return this.tpms_pressure_fl;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final ec0.m getGtw_diag_level() {
        return this.gtw_diag_level;
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    public final float getTpms_pressure_fl_OBSOLETE() {
        return this.tpms_pressure_fl_OBSOLETE;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final w getGuestMode() {
        return this.guestMode;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final Float getTpms_pressure_fr() {
        return this.tpms_pressure_fr;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final Boolean getHeadlights_on() {
        return this.headlights_on;
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public final float getTpms_pressure_fr_OBSOLETE() {
        return this.tpms_pressure_fr_OBSOLETE;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final Boolean getHighbeamlights_on() {
        return this.highbeamlights_on;
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final Float getTpms_pressure_rl() {
        return this.tpms_pressure_rl;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final Integer getHomelink_device_count() {
        return this.homelink_device_count;
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final float getTpms_pressure_rl_OBSOLETE() {
        return this.tpms_pressure_rl_OBSOLETE;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final int getHomelink_device_count_OBSOLETE() {
        return this.homelink_device_count_OBSOLETE;
    }

    /* JADX INFO: renamed from: G0, reason: from getter */
    public final Float getTpms_pressure_rr() {
        return this.tpms_pressure_rr;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final String getLast_autopark_error() {
        return this.last_autopark_error;
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final float getTpms_pressure_rr_OBSOLETE() {
        return this.tpms_pressure_rr_OBSOLETE;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getLast_autopark_error_OBSOLETE() {
        return this.last_autopark_error_OBSOLETE;
    }

    /* JADX INFO: renamed from: I0, reason: from getter */
    public final Float getTpms_rcp_front_value() {
        return this.tpms_rcp_front_value;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final y getLegacy_media_info() {
        return this.legacy_media_info;
    }

    /* JADX INFO: renamed from: J0, reason: from getter */
    public final float getTpms_rcp_front_value_OBSOLETE() {
        return this.tpms_rcp_front_value_OBSOLETE;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final z getLegacy_media_state() {
        return this.legacy_media_state;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final Boolean getNotifications_supported() {
        return this.notifications_supported;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final Float getTpms_rcp_rear_value() {
        return this.tpms_rcp_rear_value;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final boolean getNotifications_supported_OBSOLETE() {
        return this.notifications_supported_OBSOLETE;
    }

    /* JADX INFO: renamed from: M0, reason: from getter */
    public final float getTpms_rcp_rear_value_OBSOLETE() {
        return this.tpms_rcp_rear_value_OBSOLETE;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final Boolean getParental_controls_active() {
        return this.parental_controls_active;
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    public final Boolean getTpms_soft_warning_fl() {
        return this.tpms_soft_warning_fl;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Boolean getParental_controls_pin_set() {
        return this.parental_controls_pin_set;
    }

    /* JADX INFO: renamed from: O0, reason: from getter */
    public final boolean getTpms_soft_warning_fl_OBSOLETE() {
        return this.tpms_soft_warning_fl_OBSOLETE;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final j0 getParental_controls_settings() {
        return this.parental_controls_settings;
    }

    /* JADX INFO: renamed from: P0, reason: from getter */
    public final Boolean getTpms_soft_warning_fr() {
        return this.tpms_soft_warning_fr;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Boolean getPatsy_mode() {
        return this.patsy_mode;
    }

    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final boolean getTpms_soft_warning_fr_OBSOLETE() {
        return this.tpms_soft_warning_fr_OBSOLETE;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final boolean getPatsy_mode_OBSOLETE() {
        return this.patsy_mode_OBSOLETE;
    }

    /* JADX INFO: renamed from: R0, reason: from getter */
    public final Boolean getTpms_soft_warning_rl() {
        return this.tpms_soft_warning_rl;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final Boolean getPin_to_drive_enabled() {
        return this.pin_to_drive_enabled;
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public final boolean getTpms_soft_warning_rl_OBSOLETE() {
        return this.tpms_soft_warning_rl_OBSOLETE;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final Boolean getPin_to_drive_pin_set() {
        return this.pin_to_drive_pin_set;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final Boolean getRearfoglights_on() {
        return this.rearfoglights_on;
    }

    /* JADX INFO: renamed from: U0, reason: from getter */
    public final Boolean getTpms_soft_warning_rr() {
        return this.tpms_soft_warning_rr;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final Boolean getRemote_start_enabled() {
        return this.remote_start_enabled;
    }

    /* JADX INFO: renamed from: V0, reason: from getter */
    public final boolean getTpms_soft_warning_rr_OBSOLETE() {
        return this.tpms_soft_warning_rr_OBSOLETE;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final boolean getRemote_start_enabled_OBSOLETE() {
        return this.remote_start_enabled_OBSOLETE;
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    public final Boolean getTrailer_light_test_available() {
        return this.trailer_light_test_available;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final Boolean getRemote_start_supported() {
        return this.remote_start_supported;
    }

    /* JADX INFO: renamed from: X0, reason: from getter */
    public final Boolean getTrailer_light_test_requested() {
        return this.trailer_light_test_requested;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final boolean getRemote_start_supported_OBSOLETE() {
        return this.remote_start_supported_OBSOLETE;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final Boolean getService_gtw_diag_session_active() {
        return this.service_gtw_diag_session_active;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final Boolean getTrailer_mode_on() {
        return this.trailer_mode_on;
    }

    public final a0 a(int api_version_OBSOLETE, String car_version_OBSOLETE, String detailed_version_OBSOLETE, String autopilot_hash_OBSOLETE, String vehicle_name_OBSOLETE, boolean notifications_supported_OBSOLETE, boolean remote_start_supported_OBSOLETE, boolean remote_start_enabled_OBSOLETE, String last_autopark_error_OBSOLETE, int homelink_device_count_OBSOLETE, boolean smart_summon_available_OBSOLETE, boolean summon_standby_mode_enabled_OBSOLETE, boolean patsy_mode_OBSOLETE, boolean webcam_available_OBSOLETE, boolean vehicle_self_test_requested_OBSOLETE, int vehicle_self_test_progress_OBSOLETE, boolean calendar_supported_OBSOLETE, boolean dashcam_clip_save_available_OBSOLETE, s dashcam_state_OBSOLETE, float tpms_pressure_fl_OBSOLETE, float tpms_pressure_fr_OBSOLETE, float tpms_pressure_rl_OBSOLETE, float tpms_pressure_rr_OBSOLETE, boolean service_mode_OBSOLETE, boolean service_mode_plus_OBSOLETE, boolean tpms_hard_warning_fl_OBSOLETE, boolean tpms_hard_warning_fr_OBSOLETE, boolean tpms_hard_warning_rl_OBSOLETE, boolean tpms_hard_warning_rr_OBSOLETE, boolean tpms_soft_warning_fl_OBSOLETE, boolean tpms_soft_warning_fr_OBSOLETE, boolean tpms_soft_warning_rl_OBSOLETE, boolean tpms_soft_warning_rr_OBSOLETE, float tpms_rcp_front_value_OBSOLETE, float tpms_rcp_rear_value_OBSOLETE, c autopark_style, q0 active_spoiler_state, n0 software_update_state, z legacy_media_state, Instant timestamp, d autopark_version, b autopark_state, List<Integer> feature_bitmask, Instant tpms_last_seen_pressure_time_fl, Instant tpms_last_seen_pressure_time_fr, Instant tpms_last_seen_pressure_time_rl, Instant tpms_last_seen_pressure_time_rr, y legacy_media_info, w guestMode, j0 parental_controls_settings, Integer api_version, String car_version, String detailed_version, String autopilot_hash, String vehicle_name, Boolean notifications_supported, Boolean remote_start_supported, Boolean remote_start_enabled, String last_autopark_error, Integer homelink_device_count, Boolean smart_summon_available, Boolean summon_standby_mode_enabled, Boolean patsy_mode, Boolean webcam_available, Boolean vehicle_self_test_requested, Integer vehicle_self_test_progress, Boolean calendar_supported, Boolean dashcam_clip_save_available, s dashcam_state, Float tpms_pressure_fl, Float tpms_pressure_fr, Float tpms_pressure_rl, Float tpms_pressure_rr, Boolean service_mode, Boolean service_mode_plus, Boolean tpms_hard_warning_fl, Boolean tpms_hard_warning_fr, Boolean tpms_hard_warning_rl, Boolean tpms_hard_warning_rr, Boolean tpms_soft_warning_fl, Boolean tpms_soft_warning_fr, Boolean tpms_soft_warning_rl, Boolean tpms_soft_warning_rr, Float tpms_rcp_front_value, Float tpms_rcp_rear_value, Boolean allow_authorized_mobile_devices_only, Boolean drive_rail_on, Boolean pin_to_drive_enabled, Boolean pin_to_drive_pin_set, Boolean frontfoglights_on, Boolean rearfoglights_on, Boolean headlights_on, Boolean highbeamlights_on, Boolean trailer_mode_on, Boolean trailer_light_test_available, Boolean trailer_light_test_requested, Integer truck_bed_lights_brightness, Integer truck_bed_lights_auto_brightness, Boolean truck_bed_lights_auto_state, Boolean truck_bed_lights_controls_disabled, Boolean signed_cmd_service_mode, Boolean accessory_lightbar_middle_on, Boolean transport_mode, String service_mode_auth, Boolean service_gtw_diag_session_active, Boolean factory_mode, Boolean training_wheels_mode, ec0.m gtw_diag_level, Boolean parental_controls_active, Boolean parental_controls_pin_set, String fsd_software_version, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(car_version_OBSOLETE, "car_version_OBSOLETE");
        p013kotlin.jvm.internal.s.k(detailed_version_OBSOLETE, "detailed_version_OBSOLETE");
        p013kotlin.jvm.internal.s.k(autopilot_hash_OBSOLETE, "autopilot_hash_OBSOLETE");
        p013kotlin.jvm.internal.s.k(vehicle_name_OBSOLETE, "vehicle_name_OBSOLETE");
        p013kotlin.jvm.internal.s.k(last_autopark_error_OBSOLETE, "last_autopark_error_OBSOLETE");
        p013kotlin.jvm.internal.s.k(dashcam_state_OBSOLETE, "dashcam_state_OBSOLETE");
        p013kotlin.jvm.internal.s.k(feature_bitmask, "feature_bitmask");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new a0(api_version_OBSOLETE, car_version_OBSOLETE, detailed_version_OBSOLETE, autopilot_hash_OBSOLETE, vehicle_name_OBSOLETE, notifications_supported_OBSOLETE, remote_start_supported_OBSOLETE, remote_start_enabled_OBSOLETE, last_autopark_error_OBSOLETE, homelink_device_count_OBSOLETE, smart_summon_available_OBSOLETE, summon_standby_mode_enabled_OBSOLETE, patsy_mode_OBSOLETE, webcam_available_OBSOLETE, vehicle_self_test_requested_OBSOLETE, vehicle_self_test_progress_OBSOLETE, calendar_supported_OBSOLETE, dashcam_clip_save_available_OBSOLETE, dashcam_state_OBSOLETE, tpms_pressure_fl_OBSOLETE, tpms_pressure_fr_OBSOLETE, tpms_pressure_rl_OBSOLETE, tpms_pressure_rr_OBSOLETE, service_mode_OBSOLETE, service_mode_plus_OBSOLETE, tpms_hard_warning_fl_OBSOLETE, tpms_hard_warning_fr_OBSOLETE, tpms_hard_warning_rl_OBSOLETE, tpms_hard_warning_rr_OBSOLETE, tpms_soft_warning_fl_OBSOLETE, tpms_soft_warning_fr_OBSOLETE, tpms_soft_warning_rl_OBSOLETE, tpms_soft_warning_rr_OBSOLETE, tpms_rcp_front_value_OBSOLETE, tpms_rcp_rear_value_OBSOLETE, autopark_style, active_spoiler_state, software_update_state, legacy_media_state, timestamp, autopark_version, autopark_state, feature_bitmask, tpms_last_seen_pressure_time_fl, tpms_last_seen_pressure_time_fr, tpms_last_seen_pressure_time_rl, tpms_last_seen_pressure_time_rr, legacy_media_info, guestMode, parental_controls_settings, api_version, car_version, detailed_version, autopilot_hash, vehicle_name, notifications_supported, remote_start_supported, remote_start_enabled, last_autopark_error, homelink_device_count, smart_summon_available, summon_standby_mode_enabled, patsy_mode, webcam_available, vehicle_self_test_requested, vehicle_self_test_progress, calendar_supported, dashcam_clip_save_available, dashcam_state, tpms_pressure_fl, tpms_pressure_fr, tpms_pressure_rl, tpms_pressure_rr, service_mode, service_mode_plus, tpms_hard_warning_fl, tpms_hard_warning_fr, tpms_hard_warning_rl, tpms_hard_warning_rr, tpms_soft_warning_fl, tpms_soft_warning_fr, tpms_soft_warning_rl, tpms_soft_warning_rr, tpms_rcp_front_value, tpms_rcp_rear_value, allow_authorized_mobile_devices_only, drive_rail_on, pin_to_drive_enabled, pin_to_drive_pin_set, frontfoglights_on, rearfoglights_on, headlights_on, highbeamlights_on, trailer_mode_on, trailer_light_test_available, trailer_light_test_requested, truck_bed_lights_brightness, truck_bed_lights_auto_brightness, truck_bed_lights_auto_state, truck_bed_lights_controls_disabled, signed_cmd_service_mode, accessory_lightbar_middle_on, transport_mode, service_mode_auth, service_gtw_diag_session_active, factory_mode, training_wheels_mode, gtw_diag_level, parental_controls_active, parental_controls_pin_set, fsd_software_version, unknownFields);
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Boolean getService_mode() {
        return this.service_mode;
    }

    /* JADX INFO: renamed from: a1, reason: from getter */
    public final Boolean getTraining_wheels_mode() {
        return this.training_wheels_mode;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final boolean getService_mode_OBSOLETE() {
        return this.service_mode_OBSOLETE;
    }

    /* JADX INFO: renamed from: b1, reason: from getter */
    public final Boolean getTransport_mode() {
        return this.transport_mode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getAccessory_lightbar_middle_on() {
        return this.accessory_lightbar_middle_on;
    }

    /* JADX INFO: renamed from: c1, reason: from getter */
    public final Integer getTruck_bed_lights_auto_brightness() {
        return this.truck_bed_lights_auto_brightness;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q0 getActive_spoiler_state() {
        return this.active_spoiler_state;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final String getService_mode_auth() {
        return this.service_mode_auth;
    }

    /* JADX INFO: renamed from: d1, reason: from getter */
    public final Boolean getTruck_bed_lights_auto_state() {
        return this.truck_bed_lights_auto_state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getAllow_authorized_mobile_devices_only() {
        return this.allow_authorized_mobile_devices_only;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Boolean getService_mode_plus() {
        return this.service_mode_plus;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), a0Var.unknownFields()) && this.api_version_OBSOLETE == a0Var.api_version_OBSOLETE && p013kotlin.jvm.internal.s.f(this.car_version_OBSOLETE, a0Var.car_version_OBSOLETE) && p013kotlin.jvm.internal.s.f(this.detailed_version_OBSOLETE, a0Var.detailed_version_OBSOLETE) && p013kotlin.jvm.internal.s.f(this.autopilot_hash_OBSOLETE, a0Var.autopilot_hash_OBSOLETE) && p013kotlin.jvm.internal.s.f(this.vehicle_name_OBSOLETE, a0Var.vehicle_name_OBSOLETE) && this.notifications_supported_OBSOLETE == a0Var.notifications_supported_OBSOLETE && this.remote_start_supported_OBSOLETE == a0Var.remote_start_supported_OBSOLETE && this.remote_start_enabled_OBSOLETE == a0Var.remote_start_enabled_OBSOLETE && p013kotlin.jvm.internal.s.f(this.last_autopark_error_OBSOLETE, a0Var.last_autopark_error_OBSOLETE) && this.homelink_device_count_OBSOLETE == a0Var.homelink_device_count_OBSOLETE && this.smart_summon_available_OBSOLETE == a0Var.smart_summon_available_OBSOLETE && this.summon_standby_mode_enabled_OBSOLETE == a0Var.summon_standby_mode_enabled_OBSOLETE && this.patsy_mode_OBSOLETE == a0Var.patsy_mode_OBSOLETE && this.webcam_available_OBSOLETE == a0Var.webcam_available_OBSOLETE && this.vehicle_self_test_requested_OBSOLETE == a0Var.vehicle_self_test_requested_OBSOLETE && this.vehicle_self_test_progress_OBSOLETE == a0Var.vehicle_self_test_progress_OBSOLETE && this.calendar_supported_OBSOLETE == a0Var.calendar_supported_OBSOLETE && this.dashcam_clip_save_available_OBSOLETE == a0Var.dashcam_clip_save_available_OBSOLETE && this.dashcam_state_OBSOLETE == a0Var.dashcam_state_OBSOLETE && this.tpms_pressure_fl_OBSOLETE == a0Var.tpms_pressure_fl_OBSOLETE && this.tpms_pressure_fr_OBSOLETE == a0Var.tpms_pressure_fr_OBSOLETE && this.tpms_pressure_rl_OBSOLETE == a0Var.tpms_pressure_rl_OBSOLETE && this.tpms_pressure_rr_OBSOLETE == a0Var.tpms_pressure_rr_OBSOLETE && this.service_mode_OBSOLETE == a0Var.service_mode_OBSOLETE && this.service_mode_plus_OBSOLETE == a0Var.service_mode_plus_OBSOLETE && this.tpms_hard_warning_fl_OBSOLETE == a0Var.tpms_hard_warning_fl_OBSOLETE && this.tpms_hard_warning_fr_OBSOLETE == a0Var.tpms_hard_warning_fr_OBSOLETE && this.tpms_hard_warning_rl_OBSOLETE == a0Var.tpms_hard_warning_rl_OBSOLETE && this.tpms_hard_warning_rr_OBSOLETE == a0Var.tpms_hard_warning_rr_OBSOLETE && this.tpms_soft_warning_fl_OBSOLETE == a0Var.tpms_soft_warning_fl_OBSOLETE && this.tpms_soft_warning_fr_OBSOLETE == a0Var.tpms_soft_warning_fr_OBSOLETE && this.tpms_soft_warning_rl_OBSOLETE == a0Var.tpms_soft_warning_rl_OBSOLETE && this.tpms_soft_warning_rr_OBSOLETE == a0Var.tpms_soft_warning_rr_OBSOLETE && this.tpms_rcp_front_value_OBSOLETE == a0Var.tpms_rcp_front_value_OBSOLETE && this.tpms_rcp_rear_value_OBSOLETE == a0Var.tpms_rcp_rear_value_OBSOLETE && p013kotlin.jvm.internal.s.f(this.autopark_style, a0Var.autopark_style) && p013kotlin.jvm.internal.s.f(this.active_spoiler_state, a0Var.active_spoiler_state) && p013kotlin.jvm.internal.s.f(this.software_update_state, a0Var.software_update_state) && p013kotlin.jvm.internal.s.f(this.legacy_media_state, a0Var.legacy_media_state) && p013kotlin.jvm.internal.s.f(this.timestamp, a0Var.timestamp) && p013kotlin.jvm.internal.s.f(this.autopark_version, a0Var.autopark_version) && p013kotlin.jvm.internal.s.f(this.autopark_state, a0Var.autopark_state) && p013kotlin.jvm.internal.s.f(this.feature_bitmask, a0Var.feature_bitmask) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_fl, a0Var.tpms_last_seen_pressure_time_fl) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_fr, a0Var.tpms_last_seen_pressure_time_fr) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_rl, a0Var.tpms_last_seen_pressure_time_rl) && p013kotlin.jvm.internal.s.f(this.tpms_last_seen_pressure_time_rr, a0Var.tpms_last_seen_pressure_time_rr) && p013kotlin.jvm.internal.s.f(this.legacy_media_info, a0Var.legacy_media_info) && p013kotlin.jvm.internal.s.f(this.guestMode, a0Var.guestMode) && p013kotlin.jvm.internal.s.f(this.parental_controls_settings, a0Var.parental_controls_settings) && p013kotlin.jvm.internal.s.f(this.api_version, a0Var.api_version) && p013kotlin.jvm.internal.s.f(this.car_version, a0Var.car_version) && p013kotlin.jvm.internal.s.f(this.detailed_version, a0Var.detailed_version) && p013kotlin.jvm.internal.s.f(this.autopilot_hash, a0Var.autopilot_hash) && p013kotlin.jvm.internal.s.f(this.vehicle_name, a0Var.vehicle_name) && p013kotlin.jvm.internal.s.f(this.notifications_supported, a0Var.notifications_supported) && p013kotlin.jvm.internal.s.f(this.remote_start_supported, a0Var.remote_start_supported) && p013kotlin.jvm.internal.s.f(this.remote_start_enabled, a0Var.remote_start_enabled) && p013kotlin.jvm.internal.s.f(this.last_autopark_error, a0Var.last_autopark_error) && p013kotlin.jvm.internal.s.f(this.homelink_device_count, a0Var.homelink_device_count) && p013kotlin.jvm.internal.s.f(this.smart_summon_available, a0Var.smart_summon_available) && p013kotlin.jvm.internal.s.f(this.summon_standby_mode_enabled, a0Var.summon_standby_mode_enabled) && p013kotlin.jvm.internal.s.f(this.patsy_mode, a0Var.patsy_mode) && p013kotlin.jvm.internal.s.f(this.webcam_available, a0Var.webcam_available) && p013kotlin.jvm.internal.s.f(this.vehicle_self_test_requested, a0Var.vehicle_self_test_requested) && p013kotlin.jvm.internal.s.f(this.vehicle_self_test_progress, a0Var.vehicle_self_test_progress) && p013kotlin.jvm.internal.s.f(this.calendar_supported, a0Var.calendar_supported) && p013kotlin.jvm.internal.s.f(this.dashcam_clip_save_available, a0Var.dashcam_clip_save_available) && this.dashcam_state == a0Var.dashcam_state && p013kotlin.jvm.internal.s.e(this.tpms_pressure_fl, a0Var.tpms_pressure_fl) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_fr, a0Var.tpms_pressure_fr) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_rl, a0Var.tpms_pressure_rl) && p013kotlin.jvm.internal.s.e(this.tpms_pressure_rr, a0Var.tpms_pressure_rr) && p013kotlin.jvm.internal.s.f(this.service_mode, a0Var.service_mode) && p013kotlin.jvm.internal.s.f(this.service_mode_plus, a0Var.service_mode_plus) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_fl, a0Var.tpms_hard_warning_fl) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_fr, a0Var.tpms_hard_warning_fr) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_rl, a0Var.tpms_hard_warning_rl) && p013kotlin.jvm.internal.s.f(this.tpms_hard_warning_rr, a0Var.tpms_hard_warning_rr) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_fl, a0Var.tpms_soft_warning_fl) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_fr, a0Var.tpms_soft_warning_fr) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_rl, a0Var.tpms_soft_warning_rl) && p013kotlin.jvm.internal.s.f(this.tpms_soft_warning_rr, a0Var.tpms_soft_warning_rr) && p013kotlin.jvm.internal.s.e(this.tpms_rcp_front_value, a0Var.tpms_rcp_front_value) && p013kotlin.jvm.internal.s.e(this.tpms_rcp_rear_value, a0Var.tpms_rcp_rear_value) && p013kotlin.jvm.internal.s.f(this.allow_authorized_mobile_devices_only, a0Var.allow_authorized_mobile_devices_only) && p013kotlin.jvm.internal.s.f(this.drive_rail_on, a0Var.drive_rail_on) && p013kotlin.jvm.internal.s.f(this.pin_to_drive_enabled, a0Var.pin_to_drive_enabled) && p013kotlin.jvm.internal.s.f(this.pin_to_drive_pin_set, a0Var.pin_to_drive_pin_set) && p013kotlin.jvm.internal.s.f(this.frontfoglights_on, a0Var.frontfoglights_on) && p013kotlin.jvm.internal.s.f(this.rearfoglights_on, a0Var.rearfoglights_on) && p013kotlin.jvm.internal.s.f(this.headlights_on, a0Var.headlights_on) && p013kotlin.jvm.internal.s.f(this.highbeamlights_on, a0Var.highbeamlights_on) && p013kotlin.jvm.internal.s.f(this.trailer_mode_on, a0Var.trailer_mode_on) && p013kotlin.jvm.internal.s.f(this.trailer_light_test_available, a0Var.trailer_light_test_available) && p013kotlin.jvm.internal.s.f(this.trailer_light_test_requested, a0Var.trailer_light_test_requested) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_brightness, a0Var.truck_bed_lights_brightness) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_auto_brightness, a0Var.truck_bed_lights_auto_brightness) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_auto_state, a0Var.truck_bed_lights_auto_state) && p013kotlin.jvm.internal.s.f(this.truck_bed_lights_controls_disabled, a0Var.truck_bed_lights_controls_disabled) && p013kotlin.jvm.internal.s.f(this.signed_cmd_service_mode, a0Var.signed_cmd_service_mode) && p013kotlin.jvm.internal.s.f(this.accessory_lightbar_middle_on, a0Var.accessory_lightbar_middle_on) && p013kotlin.jvm.internal.s.f(this.transport_mode, a0Var.transport_mode) && p013kotlin.jvm.internal.s.f(this.service_mode_auth, a0Var.service_mode_auth) && p013kotlin.jvm.internal.s.f(this.service_gtw_diag_session_active, a0Var.service_gtw_diag_session_active) && p013kotlin.jvm.internal.s.f(this.factory_mode, a0Var.factory_mode) && p013kotlin.jvm.internal.s.f(this.training_wheels_mode, a0Var.training_wheels_mode) && this.gtw_diag_level == a0Var.gtw_diag_level && p013kotlin.jvm.internal.s.f(this.parental_controls_active, a0Var.parental_controls_active) && p013kotlin.jvm.internal.s.f(this.parental_controls_pin_set, a0Var.parental_controls_pin_set) && p013kotlin.jvm.internal.s.f(this.fsd_software_version, a0Var.fsd_software_version);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getApi_version() {
        return this.api_version;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final boolean getService_mode_plus_OBSOLETE() {
        return this.service_mode_plus_OBSOLETE;
    }

    /* JADX INFO: renamed from: f1, reason: from getter */
    public final Integer getTruck_bed_lights_brightness() {
        return this.truck_bed_lights_brightness;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getApi_version_OBSOLETE() {
        return this.api_version_OBSOLETE;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final Boolean getSigned_cmd_service_mode() {
        return this.signed_cmd_service_mode;
    }

    /* JADX INFO: renamed from: g1, reason: from getter */
    public final Boolean getTruck_bed_lights_controls_disabled() {
        return this.truck_bed_lights_controls_disabled;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getAutopark_state() {
        return this.autopark_state;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Boolean getSmart_summon_available() {
        return this.smart_summon_available;
    }

    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getVehicle_name() {
        return this.vehicle_name;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.api_version_OBSOLETE)) * 37) + this.car_version_OBSOLETE.hashCode()) * 37) + this.detailed_version_OBSOLETE.hashCode()) * 37) + this.autopilot_hash_OBSOLETE.hashCode()) * 37) + this.vehicle_name_OBSOLETE.hashCode()) * 37) + Boolean.hashCode(this.notifications_supported_OBSOLETE)) * 37) + Boolean.hashCode(this.remote_start_supported_OBSOLETE)) * 37) + Boolean.hashCode(this.remote_start_enabled_OBSOLETE)) * 37) + this.last_autopark_error_OBSOLETE.hashCode()) * 37) + Integer.hashCode(this.homelink_device_count_OBSOLETE)) * 37) + Boolean.hashCode(this.smart_summon_available_OBSOLETE)) * 37) + Boolean.hashCode(this.summon_standby_mode_enabled_OBSOLETE)) * 37) + Boolean.hashCode(this.patsy_mode_OBSOLETE)) * 37) + Boolean.hashCode(this.webcam_available_OBSOLETE)) * 37) + Boolean.hashCode(this.vehicle_self_test_requested_OBSOLETE)) * 37) + Integer.hashCode(this.vehicle_self_test_progress_OBSOLETE)) * 37) + Boolean.hashCode(this.calendar_supported_OBSOLETE)) * 37) + Boolean.hashCode(this.dashcam_clip_save_available_OBSOLETE)) * 37) + this.dashcam_state_OBSOLETE.hashCode()) * 37) + Float.hashCode(this.tpms_pressure_fl_OBSOLETE)) * 37) + Float.hashCode(this.tpms_pressure_fr_OBSOLETE)) * 37) + Float.hashCode(this.tpms_pressure_rl_OBSOLETE)) * 37) + Float.hashCode(this.tpms_pressure_rr_OBSOLETE)) * 37) + Boolean.hashCode(this.service_mode_OBSOLETE)) * 37) + Boolean.hashCode(this.service_mode_plus_OBSOLETE)) * 37) + Boolean.hashCode(this.tpms_hard_warning_fl_OBSOLETE)) * 37) + Boolean.hashCode(this.tpms_hard_warning_fr_OBSOLETE)) * 37) + Boolean.hashCode(this.tpms_hard_warning_rl_OBSOLETE)) * 37) + Boolean.hashCode(this.tpms_hard_warning_rr_OBSOLETE)) * 37) + Boolean.hashCode(this.tpms_soft_warning_fl_OBSOLETE)) * 37) + Boolean.hashCode(this.tpms_soft_warning_fr_OBSOLETE)) * 37) + Boolean.hashCode(this.tpms_soft_warning_rl_OBSOLETE)) * 37) + Boolean.hashCode(this.tpms_soft_warning_rr_OBSOLETE)) * 37) + Float.hashCode(this.tpms_rcp_front_value_OBSOLETE)) * 37) + Float.hashCode(this.tpms_rcp_rear_value_OBSOLETE)) * 37;
        c cVar = this.autopark_style;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 37;
        q0 q0Var = this.active_spoiler_state;
        int iHashCode3 = (iHashCode2 + (q0Var != null ? q0Var.hashCode() : 0)) * 37;
        n0 n0Var = this.software_update_state;
        int iHashCode4 = (iHashCode3 + (n0Var != null ? n0Var.hashCode() : 0)) * 37;
        z zVar = this.legacy_media_state;
        int iHashCode5 = (iHashCode4 + (zVar != null ? zVar.hashCode() : 0)) * 37;
        Instant instant = this.timestamp;
        int iHashCode6 = (iHashCode5 + (instant != null ? instant.hashCode() : 0)) * 37;
        d dVar = this.autopark_version;
        int iHashCode7 = (iHashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 37;
        b bVar = this.autopark_state;
        int iHashCode8 = (((iHashCode7 + (bVar != null ? bVar.hashCode() : 0)) * 37) + this.feature_bitmask.hashCode()) * 37;
        Instant instant2 = this.tpms_last_seen_pressure_time_fl;
        int iHashCode9 = (iHashCode8 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        Instant instant3 = this.tpms_last_seen_pressure_time_fr;
        int iHashCode10 = (iHashCode9 + (instant3 != null ? instant3.hashCode() : 0)) * 37;
        Instant instant4 = this.tpms_last_seen_pressure_time_rl;
        int iHashCode11 = (iHashCode10 + (instant4 != null ? instant4.hashCode() : 0)) * 37;
        Instant instant5 = this.tpms_last_seen_pressure_time_rr;
        int iHashCode12 = (iHashCode11 + (instant5 != null ? instant5.hashCode() : 0)) * 37;
        y yVar = this.legacy_media_info;
        int iHashCode13 = (iHashCode12 + (yVar != null ? yVar.hashCode() : 0)) * 37;
        w wVar = this.guestMode;
        int iHashCode14 = (iHashCode13 + (wVar != null ? wVar.hashCode() : 0)) * 37;
        j0 j0Var = this.parental_controls_settings;
        int iHashCode15 = (iHashCode14 + (j0Var != null ? j0Var.hashCode() : 0)) * 37;
        Integer num = this.api_version;
        int iHashCode16 = (iHashCode15 + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.car_version;
        int iHashCode17 = (iHashCode16 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.detailed_version;
        int iHashCode18 = (iHashCode17 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.autopilot_hash;
        int iHashCode19 = (iHashCode18 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.vehicle_name;
        int iHashCode20 = (iHashCode19 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.notifications_supported;
        int iHashCode21 = (iHashCode20 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.remote_start_supported;
        int iHashCode22 = (iHashCode21 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Boolean bool3 = this.remote_start_enabled;
        int iHashCode23 = (iHashCode22 + (bool3 != null ? bool3.hashCode() : 0)) * 37;
        String str5 = this.last_autopark_error;
        int iHashCode24 = (iHashCode23 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num2 = this.homelink_device_count;
        int iHashCode25 = (iHashCode24 + (num2 != null ? num2.hashCode() : 0)) * 37;
        Boolean bool4 = this.smart_summon_available;
        int iHashCode26 = (iHashCode25 + (bool4 != null ? bool4.hashCode() : 0)) * 37;
        Boolean bool5 = this.summon_standby_mode_enabled;
        int iHashCode27 = (iHashCode26 + (bool5 != null ? bool5.hashCode() : 0)) * 37;
        Boolean bool6 = this.patsy_mode;
        int iHashCode28 = (iHashCode27 + (bool6 != null ? bool6.hashCode() : 0)) * 37;
        Boolean bool7 = this.webcam_available;
        int iHashCode29 = (iHashCode28 + (bool7 != null ? bool7.hashCode() : 0)) * 37;
        Boolean bool8 = this.vehicle_self_test_requested;
        int iHashCode30 = (iHashCode29 + (bool8 != null ? bool8.hashCode() : 0)) * 37;
        Integer num3 = this.vehicle_self_test_progress;
        int iHashCode31 = (iHashCode30 + (num3 != null ? num3.hashCode() : 0)) * 37;
        Boolean bool9 = this.calendar_supported;
        int iHashCode32 = (iHashCode31 + (bool9 != null ? bool9.hashCode() : 0)) * 37;
        Boolean bool10 = this.dashcam_clip_save_available;
        int iHashCode33 = (iHashCode32 + (bool10 != null ? bool10.hashCode() : 0)) * 37;
        s sVar = this.dashcam_state;
        int iHashCode34 = (iHashCode33 + (sVar != null ? sVar.hashCode() : 0)) * 37;
        Float f11 = this.tpms_pressure_fl;
        int iHashCode35 = (iHashCode34 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.tpms_pressure_fr;
        int iHashCode36 = (iHashCode35 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.tpms_pressure_rl;
        int iHashCode37 = (iHashCode36 + (f13 != null ? f13.hashCode() : 0)) * 37;
        Float f14 = this.tpms_pressure_rr;
        int iHashCode38 = (iHashCode37 + (f14 != null ? f14.hashCode() : 0)) * 37;
        Boolean bool11 = this.service_mode;
        int iHashCode39 = (iHashCode38 + (bool11 != null ? bool11.hashCode() : 0)) * 37;
        Boolean bool12 = this.service_mode_plus;
        int iHashCode40 = (iHashCode39 + (bool12 != null ? bool12.hashCode() : 0)) * 37;
        Boolean bool13 = this.tpms_hard_warning_fl;
        int iHashCode41 = (iHashCode40 + (bool13 != null ? bool13.hashCode() : 0)) * 37;
        Boolean bool14 = this.tpms_hard_warning_fr;
        int iHashCode42 = (iHashCode41 + (bool14 != null ? bool14.hashCode() : 0)) * 37;
        Boolean bool15 = this.tpms_hard_warning_rl;
        int iHashCode43 = (iHashCode42 + (bool15 != null ? bool15.hashCode() : 0)) * 37;
        Boolean bool16 = this.tpms_hard_warning_rr;
        int iHashCode44 = (iHashCode43 + (bool16 != null ? bool16.hashCode() : 0)) * 37;
        Boolean bool17 = this.tpms_soft_warning_fl;
        int iHashCode45 = (iHashCode44 + (bool17 != null ? bool17.hashCode() : 0)) * 37;
        Boolean bool18 = this.tpms_soft_warning_fr;
        int iHashCode46 = (iHashCode45 + (bool18 != null ? bool18.hashCode() : 0)) * 37;
        Boolean bool19 = this.tpms_soft_warning_rl;
        int iHashCode47 = (iHashCode46 + (bool19 != null ? bool19.hashCode() : 0)) * 37;
        Boolean bool20 = this.tpms_soft_warning_rr;
        int iHashCode48 = (iHashCode47 + (bool20 != null ? bool20.hashCode() : 0)) * 37;
        Float f15 = this.tpms_rcp_front_value;
        int iHashCode49 = (iHashCode48 + (f15 != null ? f15.hashCode() : 0)) * 37;
        Float f16 = this.tpms_rcp_rear_value;
        int iHashCode50 = (iHashCode49 + (f16 != null ? f16.hashCode() : 0)) * 37;
        Boolean bool21 = this.allow_authorized_mobile_devices_only;
        int iHashCode51 = (iHashCode50 + (bool21 != null ? bool21.hashCode() : 0)) * 37;
        Boolean bool22 = this.drive_rail_on;
        int iHashCode52 = (iHashCode51 + (bool22 != null ? bool22.hashCode() : 0)) * 37;
        Boolean bool23 = this.pin_to_drive_enabled;
        int iHashCode53 = (iHashCode52 + (bool23 != null ? bool23.hashCode() : 0)) * 37;
        Boolean bool24 = this.pin_to_drive_pin_set;
        int iHashCode54 = (iHashCode53 + (bool24 != null ? bool24.hashCode() : 0)) * 37;
        Boolean bool25 = this.frontfoglights_on;
        int iHashCode55 = (iHashCode54 + (bool25 != null ? bool25.hashCode() : 0)) * 37;
        Boolean bool26 = this.rearfoglights_on;
        int iHashCode56 = (iHashCode55 + (bool26 != null ? bool26.hashCode() : 0)) * 37;
        Boolean bool27 = this.headlights_on;
        int iHashCode57 = (iHashCode56 + (bool27 != null ? bool27.hashCode() : 0)) * 37;
        Boolean bool28 = this.highbeamlights_on;
        int iHashCode58 = (iHashCode57 + (bool28 != null ? bool28.hashCode() : 0)) * 37;
        Boolean bool29 = this.trailer_mode_on;
        int iHashCode59 = (iHashCode58 + (bool29 != null ? bool29.hashCode() : 0)) * 37;
        Boolean bool30 = this.trailer_light_test_available;
        int iHashCode60 = (iHashCode59 + (bool30 != null ? bool30.hashCode() : 0)) * 37;
        Boolean bool31 = this.trailer_light_test_requested;
        int iHashCode61 = (iHashCode60 + (bool31 != null ? bool31.hashCode() : 0)) * 37;
        Integer num4 = this.truck_bed_lights_brightness;
        int iHashCode62 = (iHashCode61 + (num4 != null ? num4.hashCode() : 0)) * 37;
        Integer num5 = this.truck_bed_lights_auto_brightness;
        int iHashCode63 = (iHashCode62 + (num5 != null ? num5.hashCode() : 0)) * 37;
        Boolean bool32 = this.truck_bed_lights_auto_state;
        int iHashCode64 = (iHashCode63 + (bool32 != null ? bool32.hashCode() : 0)) * 37;
        Boolean bool33 = this.truck_bed_lights_controls_disabled;
        int iHashCode65 = (iHashCode64 + (bool33 != null ? bool33.hashCode() : 0)) * 37;
        Boolean bool34 = this.signed_cmd_service_mode;
        int iHashCode66 = (iHashCode65 + (bool34 != null ? bool34.hashCode() : 0)) * 37;
        Boolean bool35 = this.accessory_lightbar_middle_on;
        int iHashCode67 = (iHashCode66 + (bool35 != null ? bool35.hashCode() : 0)) * 37;
        Boolean bool36 = this.transport_mode;
        int iHashCode68 = (iHashCode67 + (bool36 != null ? bool36.hashCode() : 0)) * 37;
        String str6 = this.service_mode_auth;
        int iHashCode69 = (iHashCode68 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool37 = this.service_gtw_diag_session_active;
        int iHashCode70 = (iHashCode69 + (bool37 != null ? bool37.hashCode() : 0)) * 37;
        Boolean bool38 = this.factory_mode;
        int iHashCode71 = (iHashCode70 + (bool38 != null ? bool38.hashCode() : 0)) * 37;
        Boolean bool39 = this.training_wheels_mode;
        int iHashCode72 = (iHashCode71 + (bool39 != null ? bool39.hashCode() : 0)) * 37;
        ec0.m mVar = this.gtw_diag_level;
        int iHashCode73 = (iHashCode72 + (mVar != null ? mVar.hashCode() : 0)) * 37;
        Boolean bool40 = this.parental_controls_active;
        int iHashCode74 = (iHashCode73 + (bool40 != null ? bool40.hashCode() : 0)) * 37;
        Boolean bool41 = this.parental_controls_pin_set;
        int iHashCode75 = (iHashCode74 + (bool41 != null ? bool41.hashCode() : 0)) * 37;
        String str7 = this.fsd_software_version;
        int iHashCode76 = iHashCode75 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode76;
        return iHashCode76;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final c getAutopark_style() {
        return this.autopark_style;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final boolean getSmart_summon_available_OBSOLETE() {
        return this.smart_summon_available_OBSOLETE;
    }

    /* JADX INFO: renamed from: i1, reason: from getter */
    public final String getVehicle_name_OBSOLETE() {
        return this.vehicle_name_OBSOLETE;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final d getAutopark_version() {
        return this.autopark_version;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final n0 getSoftware_update_state() {
        return this.software_update_state;
    }

    /* JADX INFO: renamed from: j1, reason: from getter */
    public final Integer getVehicle_self_test_progress() {
        return this.vehicle_self_test_progress;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getAutopilot_hash() {
        return this.autopilot_hash;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final Boolean getSummon_standby_mode_enabled() {
        return this.summon_standby_mode_enabled;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getAutopilot_hash_OBSOLETE() {
        return this.autopilot_hash_OBSOLETE;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final boolean getSummon_standby_mode_enabled_OBSOLETE() {
        return this.summon_standby_mode_enabled_OBSOLETE;
    }

    /* JADX INFO: renamed from: l1, reason: from getter */
    public final int getVehicle_self_test_progress_OBSOLETE() {
        return this.vehicle_self_test_progress_OBSOLETE;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getCalendar_supported() {
        return this.calendar_supported;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final Instant getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: m1, reason: from getter */
    public final Boolean getVehicle_self_test_requested() {
        return this.vehicle_self_test_requested;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getCalendar_supported_OBSOLETE() {
        return this.calendar_supported_OBSOLETE;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final Boolean getTpms_hard_warning_fl() {
        return this.tpms_hard_warning_fl;
    }

    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getVehicle_self_test_requested_OBSOLETE() {
        return this.vehicle_self_test_requested_OBSOLETE;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m387newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getCar_version() {
        return this.car_version;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final boolean getTpms_hard_warning_fl_OBSOLETE() {
        return this.tpms_hard_warning_fl_OBSOLETE;
    }

    /* JADX INFO: renamed from: o1, reason: from getter */
    public final Boolean getWebcam_available() {
        return this.webcam_available;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getCar_version_OBSOLETE() {
        return this.car_version_OBSOLETE;
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final Boolean getTpms_hard_warning_fr() {
        return this.tpms_hard_warning_fr;
    }

    /* JADX INFO: renamed from: p1, reason: from getter */
    public final boolean getWebcam_available_OBSOLETE() {
        return this.webcam_available_OBSOLETE;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getDashcam_clip_save_available() {
        return this.dashcam_clip_save_available;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final boolean getTpms_hard_warning_fr_OBSOLETE() {
        return this.tpms_hard_warning_fr_OBSOLETE;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getDashcam_clip_save_available_OBSOLETE() {
        return this.dashcam_clip_save_available_OBSOLETE;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final Boolean getTpms_hard_warning_rl() {
        return this.tpms_hard_warning_rl;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final s getDashcam_state() {
        return this.dashcam_state;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final s getDashcam_state_OBSOLETE() {
        return this.dashcam_state_OBSOLETE;
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final boolean getTpms_hard_warning_rl_OBSOLETE() {
        return this.tpms_hard_warning_rl_OBSOLETE;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("api_version_OBSOLETE=" + this.api_version_OBSOLETE);
        arrayList.add("car_version_OBSOLETE=" + x20.d.i(this.car_version_OBSOLETE));
        arrayList.add("detailed_version_OBSOLETE=" + x20.d.i(this.detailed_version_OBSOLETE));
        arrayList.add("autopilot_hash_OBSOLETE=" + x20.d.i(this.autopilot_hash_OBSOLETE));
        arrayList.add("vehicle_name_OBSOLETE=" + x20.d.i(this.vehicle_name_OBSOLETE));
        arrayList.add("notifications_supported_OBSOLETE=" + this.notifications_supported_OBSOLETE);
        arrayList.add("remote_start_supported_OBSOLETE=" + this.remote_start_supported_OBSOLETE);
        arrayList.add("remote_start_enabled_OBSOLETE=" + this.remote_start_enabled_OBSOLETE);
        arrayList.add("last_autopark_error_OBSOLETE=" + x20.d.i(this.last_autopark_error_OBSOLETE));
        arrayList.add("homelink_device_count_OBSOLETE=" + this.homelink_device_count_OBSOLETE);
        arrayList.add("smart_summon_available_OBSOLETE=" + this.smart_summon_available_OBSOLETE);
        arrayList.add("summon_standby_mode_enabled_OBSOLETE=" + this.summon_standby_mode_enabled_OBSOLETE);
        arrayList.add("patsy_mode_OBSOLETE=" + this.patsy_mode_OBSOLETE);
        arrayList.add("webcam_available_OBSOLETE=" + this.webcam_available_OBSOLETE);
        arrayList.add("vehicle_self_test_requested_OBSOLETE=" + this.vehicle_self_test_requested_OBSOLETE);
        arrayList.add("vehicle_self_test_progress_OBSOLETE=" + this.vehicle_self_test_progress_OBSOLETE);
        arrayList.add("calendar_supported_OBSOLETE=" + this.calendar_supported_OBSOLETE);
        arrayList.add("dashcam_clip_save_available_OBSOLETE=" + this.dashcam_clip_save_available_OBSOLETE);
        arrayList.add("dashcam_state_OBSOLETE=" + this.dashcam_state_OBSOLETE);
        arrayList.add("tpms_pressure_fl_OBSOLETE=" + this.tpms_pressure_fl_OBSOLETE);
        arrayList.add("tpms_pressure_fr_OBSOLETE=" + this.tpms_pressure_fr_OBSOLETE);
        arrayList.add("tpms_pressure_rl_OBSOLETE=" + this.tpms_pressure_rl_OBSOLETE);
        arrayList.add("tpms_pressure_rr_OBSOLETE=" + this.tpms_pressure_rr_OBSOLETE);
        arrayList.add("service_mode_OBSOLETE=" + this.service_mode_OBSOLETE);
        arrayList.add("service_mode_plus_OBSOLETE=" + this.service_mode_plus_OBSOLETE);
        arrayList.add("tpms_hard_warning_fl_OBSOLETE=" + this.tpms_hard_warning_fl_OBSOLETE);
        arrayList.add("tpms_hard_warning_fr_OBSOLETE=" + this.tpms_hard_warning_fr_OBSOLETE);
        arrayList.add("tpms_hard_warning_rl_OBSOLETE=" + this.tpms_hard_warning_rl_OBSOLETE);
        arrayList.add("tpms_hard_warning_rr_OBSOLETE=" + this.tpms_hard_warning_rr_OBSOLETE);
        arrayList.add("tpms_soft_warning_fl_OBSOLETE=" + this.tpms_soft_warning_fl_OBSOLETE);
        arrayList.add("tpms_soft_warning_fr_OBSOLETE=" + this.tpms_soft_warning_fr_OBSOLETE);
        arrayList.add("tpms_soft_warning_rl_OBSOLETE=" + this.tpms_soft_warning_rl_OBSOLETE);
        arrayList.add("tpms_soft_warning_rr_OBSOLETE=" + this.tpms_soft_warning_rr_OBSOLETE);
        arrayList.add("tpms_rcp_front_value_OBSOLETE=" + this.tpms_rcp_front_value_OBSOLETE);
        arrayList.add("tpms_rcp_rear_value_OBSOLETE=" + this.tpms_rcp_rear_value_OBSOLETE);
        c cVar = this.autopark_style;
        if (cVar != null) {
            arrayList.add("autopark_style=" + cVar);
        }
        q0 q0Var = this.active_spoiler_state;
        if (q0Var != null) {
            arrayList.add("active_spoiler_state=" + q0Var);
        }
        n0 n0Var = this.software_update_state;
        if (n0Var != null) {
            arrayList.add("software_update_state=" + n0Var);
        }
        z zVar = this.legacy_media_state;
        if (zVar != null) {
            arrayList.add("legacy_media_state=" + zVar);
        }
        Instant instant = this.timestamp;
        if (instant != null) {
            arrayList.add("timestamp=" + instant);
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
        y yVar = this.legacy_media_info;
        if (yVar != null) {
            arrayList.add("legacy_media_info=" + yVar);
        }
        w wVar = this.guestMode;
        if (wVar != null) {
            arrayList.add("guestMode=" + wVar);
        }
        j0 j0Var = this.parental_controls_settings;
        if (j0Var != null) {
            arrayList.add("parental_controls_settings=" + j0Var);
        }
        Integer num = this.api_version;
        if (num != null) {
            arrayList.add("api_version=" + num);
        }
        String str = this.car_version;
        if (str != null) {
            arrayList.add("car_version=" + x20.d.i(str));
        }
        String str2 = this.detailed_version;
        if (str2 != null) {
            arrayList.add("detailed_version=" + x20.d.i(str2));
        }
        String str3 = this.autopilot_hash;
        if (str3 != null) {
            arrayList.add("autopilot_hash=" + x20.d.i(str3));
        }
        String str4 = this.vehicle_name;
        if (str4 != null) {
            arrayList.add("vehicle_name=" + x20.d.i(str4));
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
        String str5 = this.last_autopark_error;
        if (str5 != null) {
            arrayList.add("last_autopark_error=" + x20.d.i(str5));
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
        Boolean bool11 = this.service_mode;
        if (bool11 != null) {
            arrayList.add("service_mode=" + bool11);
        }
        Boolean bool12 = this.service_mode_plus;
        if (bool12 != null) {
            arrayList.add("service_mode_plus=" + bool12);
        }
        Boolean bool13 = this.tpms_hard_warning_fl;
        if (bool13 != null) {
            arrayList.add("tpms_hard_warning_fl=" + bool13);
        }
        Boolean bool14 = this.tpms_hard_warning_fr;
        if (bool14 != null) {
            arrayList.add("tpms_hard_warning_fr=" + bool14);
        }
        Boolean bool15 = this.tpms_hard_warning_rl;
        if (bool15 != null) {
            arrayList.add("tpms_hard_warning_rl=" + bool15);
        }
        Boolean bool16 = this.tpms_hard_warning_rr;
        if (bool16 != null) {
            arrayList.add("tpms_hard_warning_rr=" + bool16);
        }
        Boolean bool17 = this.tpms_soft_warning_fl;
        if (bool17 != null) {
            arrayList.add("tpms_soft_warning_fl=" + bool17);
        }
        Boolean bool18 = this.tpms_soft_warning_fr;
        if (bool18 != null) {
            arrayList.add("tpms_soft_warning_fr=" + bool18);
        }
        Boolean bool19 = this.tpms_soft_warning_rl;
        if (bool19 != null) {
            arrayList.add("tpms_soft_warning_rl=" + bool19);
        }
        Boolean bool20 = this.tpms_soft_warning_rr;
        if (bool20 != null) {
            arrayList.add("tpms_soft_warning_rr=" + bool20);
        }
        Float f15 = this.tpms_rcp_front_value;
        if (f15 != null) {
            arrayList.add("tpms_rcp_front_value=" + f15);
        }
        Float f16 = this.tpms_rcp_rear_value;
        if (f16 != null) {
            arrayList.add("tpms_rcp_rear_value=" + f16);
        }
        Boolean bool21 = this.allow_authorized_mobile_devices_only;
        if (bool21 != null) {
            arrayList.add("allow_authorized_mobile_devices_only=" + bool21);
        }
        Boolean bool22 = this.drive_rail_on;
        if (bool22 != null) {
            arrayList.add("drive_rail_on=" + bool22);
        }
        Boolean bool23 = this.pin_to_drive_enabled;
        if (bool23 != null) {
            arrayList.add("pin_to_drive_enabled=" + bool23);
        }
        Boolean bool24 = this.pin_to_drive_pin_set;
        if (bool24 != null) {
            arrayList.add("pin_to_drive_pin_set=" + bool24);
        }
        Boolean bool25 = this.frontfoglights_on;
        if (bool25 != null) {
            arrayList.add("frontfoglights_on=" + bool25);
        }
        Boolean bool26 = this.rearfoglights_on;
        if (bool26 != null) {
            arrayList.add("rearfoglights_on=" + bool26);
        }
        Boolean bool27 = this.headlights_on;
        if (bool27 != null) {
            arrayList.add("headlights_on=" + bool27);
        }
        Boolean bool28 = this.highbeamlights_on;
        if (bool28 != null) {
            arrayList.add("highbeamlights_on=" + bool28);
        }
        Boolean bool29 = this.trailer_mode_on;
        if (bool29 != null) {
            arrayList.add("trailer_mode_on=" + bool29);
        }
        Boolean bool30 = this.trailer_light_test_available;
        if (bool30 != null) {
            arrayList.add("trailer_light_test_available=" + bool30);
        }
        Boolean bool31 = this.trailer_light_test_requested;
        if (bool31 != null) {
            arrayList.add("trailer_light_test_requested=" + bool31);
        }
        Integer num4 = this.truck_bed_lights_brightness;
        if (num4 != null) {
            arrayList.add("truck_bed_lights_brightness=" + num4);
        }
        Integer num5 = this.truck_bed_lights_auto_brightness;
        if (num5 != null) {
            arrayList.add("truck_bed_lights_auto_brightness=" + num5);
        }
        Boolean bool32 = this.truck_bed_lights_auto_state;
        if (bool32 != null) {
            arrayList.add("truck_bed_lights_auto_state=" + bool32);
        }
        Boolean bool33 = this.truck_bed_lights_controls_disabled;
        if (bool33 != null) {
            arrayList.add("truck_bed_lights_controls_disabled=" + bool33);
        }
        Boolean bool34 = this.signed_cmd_service_mode;
        if (bool34 != null) {
            arrayList.add("signed_cmd_service_mode=" + bool34);
        }
        Boolean bool35 = this.accessory_lightbar_middle_on;
        if (bool35 != null) {
            arrayList.add("accessory_lightbar_middle_on=" + bool35);
        }
        Boolean bool36 = this.transport_mode;
        if (bool36 != null) {
            arrayList.add("transport_mode=" + bool36);
        }
        String str6 = this.service_mode_auth;
        if (str6 != null) {
            arrayList.add("service_mode_auth=" + x20.d.i(str6));
        }
        Boolean bool37 = this.service_gtw_diag_session_active;
        if (bool37 != null) {
            arrayList.add("service_gtw_diag_session_active=" + bool37);
        }
        Boolean bool38 = this.factory_mode;
        if (bool38 != null) {
            arrayList.add("factory_mode=" + bool38);
        }
        Boolean bool39 = this.training_wheels_mode;
        if (bool39 != null) {
            arrayList.add("training_wheels_mode=" + bool39);
        }
        ec0.m mVar = this.gtw_diag_level;
        if (mVar != null) {
            arrayList.add("gtw_diag_level=" + mVar);
        }
        Boolean bool40 = this.parental_controls_active;
        if (bool40 != null) {
            arrayList.add("parental_controls_active=" + bool40);
        }
        Boolean bool41 = this.parental_controls_pin_set;
        if (bool41 != null) {
            arrayList.add("parental_controls_pin_set=" + bool41);
        }
        String str7 = this.fsd_software_version;
        if (str7 != null) {
            arrayList.add("fsd_software_version=" + x20.d.i(str7));
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "LegacyVehicleState{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getDetailed_version() {
        return this.detailed_version;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final Boolean getTpms_hard_warning_rr() {
        return this.tpms_hard_warning_rr;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getDetailed_version_OBSOLETE() {
        return this.detailed_version_OBSOLETE;
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final boolean getTpms_hard_warning_rr_OBSOLETE() {
        return this.tpms_hard_warning_rr_OBSOLETE;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Boolean getDrive_rail_on() {
        return this.drive_rail_on;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_fl() {
        return this.tpms_last_seen_pressure_time_fl;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final Boolean getFactory_mode() {
        return this.factory_mode;
    }

    /* JADX INFO: renamed from: x0, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_fr() {
        return this.tpms_last_seen_pressure_time_fr;
    }

    public final List<Integer> y() {
        return this.feature_bitmask;
    }

    /* JADX INFO: renamed from: y0, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_rl() {
        return this.tpms_last_seen_pressure_time_rl;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Boolean getFrontfoglights_on() {
        return this.frontfoglights_on;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final Instant getTpms_last_seen_pressure_time_rr() {
        return this.tpms_last_seen_pressure_time_rr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a0(int i11, String str, String str2, String str3, String str4, boolean z11, boolean z12, boolean z13, String str5, int i12, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i13, boolean z19, boolean z21, s sVar, float f11, float f12, float f13, float f14, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32, float f15, float f16, c cVar, q0 q0Var, n0 n0Var, z zVar, Instant instant, d dVar, b bVar, List list, Instant instant2, Instant instant3, Instant instant4, Instant instant5, y yVar, w wVar, j0 j0Var, Integer num, String str6, String str7, String str8, String str9, Boolean bool, Boolean bool2, Boolean bool3, String str10, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num3, Boolean bool9, Boolean bool10, s sVar2, Float f17, Float f18, Float f19, Float f21, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Float f22, Float f23, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Integer num4, Integer num5, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, String str11, Boolean bool37, Boolean bool38, Boolean bool39, ec0.m mVar, Boolean bool40, Boolean bool41, String str12, okio.k kVar, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        int i18 = (i14 & 1) != 0 ? 0 : i11;
        String str13 = (i14 & 2) != 0 ? "" : str;
        String str14 = (i14 & 4) != 0 ? "" : str2;
        String str15 = (i14 & 8) != 0 ? "" : str3;
        String str16 = (i14 & 16) != 0 ? "" : str4;
        boolean z33 = (i14 & 32) != 0 ? false : z11;
        boolean z34 = (i14 & 64) != 0 ? false : z12;
        boolean z35 = (i14 & 128) != 0 ? false : z13;
        String str17 = (i14 & 256) == 0 ? str5 : "";
        int i19 = (i14 & 512) != 0 ? 0 : i12;
        boolean z36 = (i14 & 1024) != 0 ? false : z14;
        boolean z37 = (i14 & 2048) != 0 ? false : z15;
        int i21 = i18;
        boolean z38 = (i14 & 4096) != 0 ? false : z16;
        boolean z39 = (i14 & PKIFailureInfo.certRevoked) != 0 ? false : z17;
        boolean z41 = (i14 & 16384) != 0 ? false : z18;
        int i22 = (i14 & 32768) != 0 ? 0 : i13;
        boolean z42 = (i14 & 65536) != 0 ? false : z19;
        boolean z43 = (i14 & 131072) != 0 ? false : z21;
        s sVar3 = (i14 & 262144) != 0 ? s.DashCamState_UNAVAILABLE : sVar;
        int i23 = i14 & PKIFailureInfo.signerNotTrusted;
        float f24 = BitmapDescriptorFactory.HUE_RED;
        float f25 = i23 != 0 ? 0.0f : f11;
        float f26 = (i14 & PKIFailureInfo.badCertTemplate) != 0 ? 0.0f : f12;
        float f27 = (i14 & PKIFailureInfo.badSenderNonce) != 0 ? 0.0f : f13;
        float f28 = (i14 & 4194304) != 0 ? 0.0f : f14;
        boolean z44 = (i14 & 8388608) != 0 ? false : z22;
        boolean z45 = (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z23;
        boolean z46 = (i14 & 33554432) != 0 ? false : z24;
        boolean z47 = (i14 & 67108864) != 0 ? false : z25;
        boolean z48 = (i14 & 134217728) != 0 ? false : z26;
        boolean z49 = (i14 & 268435456) != 0 ? false : z27;
        boolean z51 = (i14 & PKIFailureInfo.duplicateCertReq) != 0 ? false : z28;
        boolean z52 = (i14 & 1073741824) != 0 ? false : z29;
        boolean z53 = (i14 & Integer.MIN_VALUE) != 0 ? false : z31;
        boolean z54 = (i15 & 1) != 0 ? false : z32;
        float f29 = (i15 & 2) != 0 ? 0.0f : f15;
        f24 = (i15 & 4) == 0 ? f16 : f24;
        c cVar2 = (i15 & 8) != 0 ? null : cVar;
        q0 q0Var2 = (i15 & 16) != 0 ? null : q0Var;
        n0 n0Var2 = (i15 & 32) != 0 ? null : n0Var;
        z zVar2 = (i15 & 64) != 0 ? null : zVar;
        boolean z55 = z53;
        Instant instant6 = (i15 & 128) != 0 ? null : instant;
        d dVar2 = (i15 & 256) != 0 ? null : dVar;
        b bVar2 = (i15 & 512) != 0 ? null : bVar;
        List listM = (i15 & 1024) != 0 ? p013kotlin.collections.v.m() : list;
        Instant instant7 = (i15 & 2048) != 0 ? null : instant2;
        Instant instant8 = (i15 & 4096) != 0 ? null : instant3;
        Instant instant9 = (i15 & PKIFailureInfo.certRevoked) != 0 ? null : instant4;
        Instant instant10 = (i15 & 16384) != 0 ? null : instant5;
        this(i21, str13, str14, str15, str16, z33, z34, z35, str17, i19, z36, z37, z38, z39, z41, i22, z42, z43, sVar3, f25, f26, f27, f28, z44, z45, z46, z47, z48, z49, z51, z52, z55, z54, f29, f24, cVar2, q0Var2, n0Var2, zVar2, instant6, dVar2, bVar2, listM, instant7, instant8, instant9, instant10, (i15 & 32768) != 0 ? null : yVar, (i15 & 65536) != 0 ? null : wVar, (i15 & 131072) != 0 ? null : j0Var, (i15 & 262144) != 0 ? null : num, (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? null : str6, (i15 & PKIFailureInfo.badCertTemplate) != 0 ? null : str7, (i15 & PKIFailureInfo.badSenderNonce) != 0 ? null : str8, (i15 & 4194304) != 0 ? null : str9, (i15 & 8388608) != 0 ? null : bool, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool2, (i15 & 33554432) != 0 ? null : bool3, (i15 & 67108864) != 0 ? null : str10, (i15 & 134217728) != 0 ? null : num2, (i15 & 268435456) != 0 ? null : bool4, (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? null : bool5, (i15 & 1073741824) != 0 ? null : bool6, (i15 & Integer.MIN_VALUE) != 0 ? null : bool7, (i16 & 1) != 0 ? null : bool8, (i16 & 2) != 0 ? null : num3, (i16 & 4) != 0 ? null : bool9, (i16 & 8) != 0 ? null : bool10, (i16 & 16) != 0 ? null : sVar2, (i16 & 32) != 0 ? null : f17, (i16 & 64) != 0 ? null : f18, (i16 & 128) != 0 ? null : f19, (i16 & 256) != 0 ? null : f21, (i16 & 512) != 0 ? null : bool11, (i16 & 1024) != 0 ? null : bool12, (i16 & 2048) != 0 ? null : bool13, (i16 & 4096) != 0 ? null : bool14, (i16 & PKIFailureInfo.certRevoked) != 0 ? null : bool15, (i16 & 16384) != 0 ? null : bool16, (i16 & 32768) != 0 ? null : bool17, (i16 & 65536) != 0 ? null : bool18, (i16 & 131072) != 0 ? null : bool19, (i16 & 262144) != 0 ? null : bool20, (i16 & PKIFailureInfo.signerNotTrusted) != 0 ? null : f22, (i16 & PKIFailureInfo.badCertTemplate) != 0 ? null : f23, (i16 & PKIFailureInfo.badSenderNonce) != 0 ? null : bool21, (i16 & 4194304) != 0 ? null : bool22, (i16 & 8388608) != 0 ? null : bool23, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool24, (i16 & 33554432) != 0 ? null : bool25, (i16 & 67108864) != 0 ? null : bool26, (i16 & 134217728) != 0 ? null : bool27, (i16 & 268435456) != 0 ? null : bool28, (i16 & PKIFailureInfo.duplicateCertReq) != 0 ? null : bool29, (i16 & 1073741824) != 0 ? null : bool30, (i16 & Integer.MIN_VALUE) != 0 ? null : bool31, (i17 & 1) != 0 ? null : num4, (i17 & 2) != 0 ? null : num5, (i17 & 4) != 0 ? null : bool32, (i17 & 8) != 0 ? null : bool33, (i17 & 16) != 0 ? null : bool34, (i17 & 32) != 0 ? null : bool35, (i17 & 64) != 0 ? null : bool36, (i17 & 128) != 0 ? null : str11, (i17 & 256) != 0 ? null : bool37, (i17 & 512) != 0 ? null : bool38, (i17 & 1024) != 0 ? null : bool39, (i17 & 2048) != 0 ? null : mVar, (i17 & 4096) != 0 ? null : bool40, (i17 & PKIFailureInfo.certRevoked) != 0 ? null : bool41, (i17 & 16384) == 0 ? str12 : null, (i17 & 32768) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m387newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i11, String car_version_OBSOLETE, String detailed_version_OBSOLETE, String autopilot_hash_OBSOLETE, String vehicle_name_OBSOLETE, boolean z11, boolean z12, boolean z13, String last_autopark_error_OBSOLETE, int i12, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i13, boolean z19, boolean z21, s dashcam_state_OBSOLETE, float f11, float f12, float f13, float f14, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z31, boolean z32, float f15, float f16, c cVar, q0 q0Var, n0 n0Var, z zVar, Instant instant, d dVar, b bVar, List<Integer> feature_bitmask, Instant instant2, Instant instant3, Instant instant4, Instant instant5, y yVar, w wVar, j0 j0Var, Integer num, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num3, Boolean bool9, Boolean bool10, s sVar, Float f17, Float f18, Float f19, Float f21, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Float f22, Float f23, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Integer num4, Integer num5, Boolean bool32, Boolean bool33, Boolean bool34, Boolean bool35, Boolean bool36, String str6, Boolean bool37, Boolean bool38, Boolean bool39, ec0.m mVar, Boolean bool40, Boolean bool41, String str7, okio.k unknownFields) {
        super(f67862n1, unknownFields);
        p013kotlin.jvm.internal.s.k(car_version_OBSOLETE, "car_version_OBSOLETE");
        p013kotlin.jvm.internal.s.k(detailed_version_OBSOLETE, "detailed_version_OBSOLETE");
        p013kotlin.jvm.internal.s.k(autopilot_hash_OBSOLETE, "autopilot_hash_OBSOLETE");
        p013kotlin.jvm.internal.s.k(vehicle_name_OBSOLETE, "vehicle_name_OBSOLETE");
        p013kotlin.jvm.internal.s.k(last_autopark_error_OBSOLETE, "last_autopark_error_OBSOLETE");
        p013kotlin.jvm.internal.s.k(dashcam_state_OBSOLETE, "dashcam_state_OBSOLETE");
        p013kotlin.jvm.internal.s.k(feature_bitmask, "feature_bitmask");
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.api_version_OBSOLETE = i11;
        this.car_version_OBSOLETE = car_version_OBSOLETE;
        this.detailed_version_OBSOLETE = detailed_version_OBSOLETE;
        this.autopilot_hash_OBSOLETE = autopilot_hash_OBSOLETE;
        this.vehicle_name_OBSOLETE = vehicle_name_OBSOLETE;
        this.notifications_supported_OBSOLETE = z11;
        this.remote_start_supported_OBSOLETE = z12;
        this.remote_start_enabled_OBSOLETE = z13;
        this.last_autopark_error_OBSOLETE = last_autopark_error_OBSOLETE;
        this.homelink_device_count_OBSOLETE = i12;
        this.smart_summon_available_OBSOLETE = z14;
        this.summon_standby_mode_enabled_OBSOLETE = z15;
        this.patsy_mode_OBSOLETE = z16;
        this.webcam_available_OBSOLETE = z17;
        this.vehicle_self_test_requested_OBSOLETE = z18;
        this.vehicle_self_test_progress_OBSOLETE = i13;
        this.calendar_supported_OBSOLETE = z19;
        this.dashcam_clip_save_available_OBSOLETE = z21;
        this.dashcam_state_OBSOLETE = dashcam_state_OBSOLETE;
        this.tpms_pressure_fl_OBSOLETE = f11;
        this.tpms_pressure_fr_OBSOLETE = f12;
        this.tpms_pressure_rl_OBSOLETE = f13;
        this.tpms_pressure_rr_OBSOLETE = f14;
        this.service_mode_OBSOLETE = z22;
        this.service_mode_plus_OBSOLETE = z23;
        this.tpms_hard_warning_fl_OBSOLETE = z24;
        this.tpms_hard_warning_fr_OBSOLETE = z25;
        this.tpms_hard_warning_rl_OBSOLETE = z26;
        this.tpms_hard_warning_rr_OBSOLETE = z27;
        this.tpms_soft_warning_fl_OBSOLETE = z28;
        this.tpms_soft_warning_fr_OBSOLETE = z29;
        this.tpms_soft_warning_rl_OBSOLETE = z31;
        this.tpms_soft_warning_rr_OBSOLETE = z32;
        this.tpms_rcp_front_value_OBSOLETE = f15;
        this.tpms_rcp_rear_value_OBSOLETE = f16;
        this.autopark_style = cVar;
        this.active_spoiler_state = q0Var;
        this.software_update_state = n0Var;
        this.legacy_media_state = zVar;
        this.timestamp = instant;
        this.autopark_version = dVar;
        this.autopark_state = bVar;
        this.tpms_last_seen_pressure_time_fl = instant2;
        this.tpms_last_seen_pressure_time_fr = instant3;
        this.tpms_last_seen_pressure_time_rl = instant4;
        this.tpms_last_seen_pressure_time_rr = instant5;
        this.legacy_media_info = yVar;
        this.guestMode = wVar;
        this.parental_controls_settings = j0Var;
        this.api_version = num;
        this.car_version = str;
        this.detailed_version = str2;
        this.autopilot_hash = str3;
        this.vehicle_name = str4;
        this.notifications_supported = bool;
        this.remote_start_supported = bool2;
        this.remote_start_enabled = bool3;
        this.last_autopark_error = str5;
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
        this.tpms_pressure_fl = f17;
        this.tpms_pressure_fr = f18;
        this.tpms_pressure_rl = f19;
        this.tpms_pressure_rr = f21;
        this.service_mode = bool11;
        this.service_mode_plus = bool12;
        this.tpms_hard_warning_fl = bool13;
        this.tpms_hard_warning_fr = bool14;
        this.tpms_hard_warning_rl = bool15;
        this.tpms_hard_warning_rr = bool16;
        this.tpms_soft_warning_fl = bool17;
        this.tpms_soft_warning_fr = bool18;
        this.tpms_soft_warning_rl = bool19;
        this.tpms_soft_warning_rr = bool20;
        this.tpms_rcp_front_value = f22;
        this.tpms_rcp_rear_value = f23;
        this.allow_authorized_mobile_devices_only = bool21;
        this.drive_rail_on = bool22;
        this.pin_to_drive_enabled = bool23;
        this.pin_to_drive_pin_set = bool24;
        this.frontfoglights_on = bool25;
        this.rearfoglights_on = bool26;
        this.headlights_on = bool27;
        this.highbeamlights_on = bool28;
        this.trailer_mode_on = bool29;
        this.trailer_light_test_available = bool30;
        this.trailer_light_test_requested = bool31;
        this.truck_bed_lights_brightness = num4;
        this.truck_bed_lights_auto_brightness = num5;
        this.truck_bed_lights_auto_state = bool32;
        this.truck_bed_lights_controls_disabled = bool33;
        this.signed_cmd_service_mode = bool34;
        this.accessory_lightbar_middle_on = bool35;
        this.transport_mode = bool36;
        this.service_mode_auth = str6;
        this.service_gtw_diag_session_active = bool37;
        this.factory_mode = bool38;
        this.training_wheels_mode = bool39;
        this.gtw_diag_level = mVar;
        this.parental_controls_active = bool40;
        this.parental_controls_pin_set = bool41;
        this.fsd_software_version = str7;
        this.feature_bitmask = x20.d.g("feature_bitmask", feature_bitmask);
    }
}
