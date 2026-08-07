package p020r2;

import androidx.collection.c0;
import androidx.collection.d0;
import androidx.collection.i0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: r2.d3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\bU\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 ý\u00012\u00020\u0001:\u0002±\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0019J\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010*J\u001f\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0004\u0018\u0001032\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b4\u00105J'\u00106\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b6\u0010&J!\u00107\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010*JG\u0010A\u001a\u00020\f2\u0006\u0010<\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2&\u0010@\u001a\"\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u0001`?H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\bE\u0010&J\u0017\u0010F\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010GJ\u001b\u0010K\u001a\u00020\t*\u00020J2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010GJ\u001b\u0010O\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010LJ\u001b\u0010P\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010LJ#\u0010Q\u001a\u00020\u000f*\u00020J2\u0006\u0010N\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010RJ\u001b\u0010S\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010LJ\u001b\u0010T\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010LJ/\u0010W\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010XJ'\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b^\u0010GJ\u0015\u0010_\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b_\u0010\u0014J\u0015\u0010`\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b`\u0010GJ\u0015\u0010a\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\ba\u0010GJ\u0017\u0010b\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bb\u0010cJ\u0015\u0010d\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bd\u0010GJ\u0017\u0010e\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\be\u0010cJ\u0015\u0010f\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bf\u0010\u0014J\u0015\u0010g\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bg\u0010\u0014J\u001d\u0010h\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\bh\u00102J\u0017\u0010i\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bi\u0010cJ\u0017\u0010j\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020>¢\u0006\u0004\bj\u0010kJ\u0015\u0010l\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bl\u0010GJ\u0015\u0010n\u001a\u00020\u000f2\u0006\u0010m\u001a\u00020\f¢\u0006\u0004\bn\u0010oJ\r\u0010p\u001a\u00020\u000f¢\u0006\u0004\bp\u0010\u0017J\u0019\u0010q\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bq\u0010\bJ\u001f\u0010r\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\br\u0010sJ\u0015\u0010u\u001a\u00020\u000f2\u0006\u0010t\u001a\u00020\t¢\u0006\u0004\bu\u0010\u0019J\u0017\u0010v\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u000f¢\u0006\u0004\bx\u0010\u0017J\u0017\u0010y\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\by\u0010wJ\u001f\u0010z\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bz\u0010sJ\u0017\u0010{\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b{\u0010wJ!\u0010|\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b|\u0010}J\u001d\u0010~\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b~\u0010]J*\u0010\u007f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\"\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020>2\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J#\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0085\u0001\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001a\u0010\u0088\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0088\u0001\u0010GJ\u001a\u0010\u0089\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0089\u0001\u0010GJ\u001a\u0010\u008a\u0001\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u008a\u0001\u0010GJ\u0018\u0010\u008c\u0001\u001a\u00020\u000f2\u0007\u0010\u008b\u0001\u001a\u00020\t¢\u0006\u0005\b\u008c\u0001\u0010\u0019J\u000f\u0010\u008d\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008d\u0001\u0010\u0017J\u000f\u0010\u008e\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008e\u0001\u0010\u0017J\u000f\u0010\u008f\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008f\u0001\u0010\u0017J\u000f\u0010\u0090\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0090\u0001\u0010\u0017J\"\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0092\u0001\u00108J!\u0010\u0093\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0093\u0001\u00108J,\u0010\u0094\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u000f\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0005\b\u0096\u0001\u0010!J\u0017\u0010\u0097\u0001\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0005\b\u0097\u0001\u0010\u0019J\u0018\u0010\u0098\u0001\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020>¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u000f\u0010\u009a\u0001\u001a\u00020\t¢\u0006\u0005\b\u009a\u0001\u0010!J\u0010\u0010\u009b\u0001\u001a\u00020\f¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0018\u0010\u009e\u0001\u001a\u00020\u000f2\u0007\u0010\u009d\u0001\u001a\u00020\t¢\u0006\u0005\b\u009e\u0001\u0010\u0019J1\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0006\u0010Y\u001a\u00020>2\u0007\u0010\u009d\u0001\u001a\u00020\t2\u0007\u0010\u009f\u0001\u001a\u00020\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J2\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t2\t\b\u0002\u0010£\u0001\u001a\u00020\f¢\u0006\u0006\b¤\u0001\u0010¥\u0001J0\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020>0 \u00012\u0007\u0010\u009d\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001a\u0010¨\u0001\u001a\u00020>2\b\b\u0002\u0010'\u001a\u00020\t¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0019\u0010ª\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0005\bª\u0001\u0010\u0019J\u0018\u0010«\u0001\u001a\u00020\t2\u0006\u0010Y\u001a\u00020>¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u0013\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001c\u0010°\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0006\b°\u0001\u0010©\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0019\u0010·\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\"\u0010»\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R+\u0010À\u0001\u001a\u0014\u0012\u0004\u0012\u00020>0¼\u0001j\t\u0012\u0004\u0012\u00020>`½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R8\u0010@\u001a\"\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u00010=j\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u000203\u0018\u0001`?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R#\u0010Ç\u0001\u001a\f\u0012\u0005\u0012\u00030Ä\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010É\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010\u008e\u0001R\u0019\u0010Ë\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010\u008e\u0001R\u0019\u0010Í\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010\u008e\u0001R\u0019\u0010Ï\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010\u008e\u0001R\u0019\u0010Ñ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010\u008e\u0001R\u0019\u0010Ó\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010\u008e\u0001R\u0019\u0010Õ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010\u008e\u0001R\u0019\u0010×\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010\u008e\u0001R\u0019\u0010Ù\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010\u008e\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R\u0018\u0010ß\u0001\u001a\u00030Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010Ü\u0001R\u0018\u0010á\u0001\u001a\u00030Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010Ü\u0001R+\u0010ä\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010â\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010Æ\u0001R)\u0010è\u0001\u001a\u00020\t2\u0007\u0010å\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bæ\u0001\u0010\u008e\u0001\u001a\u0005\bç\u0001\u0010!R)\u0010ë\u0001\u001a\u00020\t2\u0007\u0010å\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bé\u0001\u0010\u008e\u0001\u001a\u0005\bê\u0001\u0010!R(\u0010\"\u001a\u00020\t2\u0007\u0010å\u0001\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bì\u0001\u0010\u008e\u0001\u001a\u0005\bí\u0001\u0010!R*\u0010ð\u0001\u001a\u00020\f2\u0007\u0010å\u0001\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bï\u0001\u0010\u009c\u0001R\u001b\u0010ó\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R\u0015\u0010V\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bô\u0001\u0010!R\u0013\u0010ö\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bõ\u0001\u0010!R\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b÷\u0001\u0010\u009c\u0001R\u0014\u0010ù\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bø\u0001\u0010\u009c\u0001R\u0014\u0010û\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bú\u0001\u0010\u009c\u0001R\u0015\u0010,\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bü\u0001\u0010!¨\u0006þ\u0001"}, d2 = {"Lr2/d3;", "", "Lr2/a3;", "table", "<init>", "(Lr2/a3;)V", "value", "L0", "(Ljava/lang/Object;)Ljava/lang/Object;", "", Action.KEY_ATTRIBUTE, "objectKey", "", "isNode", "aux", "Ljn0/h0;", "l1", "(ILjava/lang/Object;ZLjava/lang/Object;)V", Kind.GROUP, Gender.NONE, "(I)Z", Gender.MALE, "M0", "()V", "s1", "(I)V", "Lr2/d2;", "set", "t1", "(ILr2/d2;)V", "J", "T0", "S0", "()I", "parent", "endGroup", "firstChild", "X", "(III)V", "index", "z0", "B0", "(II)V", "K", "size", "q0", "r0", "start", "len", "P0", "(II)Z", "Lr2/t0;", "h1", "(I)Lr2/t0;", "Q0", "x1", "(ILjava/lang/Object;)V", "previousGapStart", "newGapStart", "q1", "gapStart", "Ljava/util/HashMap;", "Lr2/d;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "N0", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "w0", "j0", "(I)I", "dataIndex", "R", "", "I0", "([II)I", "P", PlaceTypes.ADDRESS, "Q", "c1", "u1", "([III)V", "G0", "H", "gapLen", "capacity", "S", "(IIII)I", "anchor", Gender.OTHER, "(III)I", "K0", "(II)I", "J0", "t0", "F0", "k0", "l0", "(I)Ljava/lang/Object;", "m0", "i0", "p0", "n0", "o0", "D0", "E0", "(Lr2/d;)Ljava/lang/Object;", "H0", "normalClose", "L", "(Z)V", "R0", "p1", "G", "(Lr2/d;Ljava/lang/Object;)V", "count", "n1", "r1", "(Ljava/lang/Object;)V", "y1", "v1", "w1", "W0", "V0", "(ILjava/lang/Object;)Ljava/lang/Object;", "d1", "U0", "(IILjava/lang/Object;)Ljava/lang/Object;", "X0", "()Ljava/lang/Object;", "b1", "(Lr2/d;I)Ljava/lang/Object;", "groupIndex", "a1", "(II)Ljava/lang/Object;", "g1", "f1", "e1", "amount", "D", "Z0", "I", Gender.UNKNOWN, "j1", "dataKey", "k1", "m1", "i1", "(ILjava/lang/Object;Ljava/lang/Object;)V", "T", "V", "W", "(Lr2/d;)V", "Y0", "O0", "()Z", "offset", "y0", "writer", "", "C0", "(Lr2/d;ILr2/d3;)Ljava/util/List;", "removeSourceGroup", "x0", "(Lr2/a3;IZ)Ljava/util/List;", "A0", "(ILr2/a3;I)Ljava/util/List;", "E", "(I)Lr2/d;", "u0", Gender.FEMALE, "(Lr2/d;)I", "", "toString", "()Ljava/lang/String;", "o1", "a", "Lr2/a3;", "h0", "()Lr2/a3;", "b", "[I", "groups", "", "c", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/ArrayList;", "anchors", "e", "Ljava/util/HashMap;", "Landroidx/collection/c0;", "Landroidx/collection/d0;", "f", "Landroidx/collection/c0;", "calledByMap", "g", "groupGapStart", "h", "groupGapLen", IntegerTokenConverter.CONVERTER_KEY, "currentSlot", "j", "currentSlotEnd", "k", "slotsGapStart", "l", "slotsGapLen", "m", "slotsGapOwner", "n", "insertCount", "o", "nodeCount", "Lr2/u0;", "p", "Lr2/u0;", "startStack", "q", "endStack", "r", "nodeCountStack", "Landroidx/collection/i0;", "s", "deferredSlotWrites", "<set-?>", "t", "c0", "currentGroup", "u", "d0", "currentGroupEnd", "v", "e0", "w", "Z", "closed", "x", "Lr2/d2;", "pendingRecalculateMarks", "Y", "g0", "slotsSize", "s0", "b0", "collectingSourceInformation", "a0", "collectingCalledInformation", "f0", "y", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SlotWriter {

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f106505z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a3 table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] groups;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object[] slots;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ArrayList<d> anchors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private HashMap<d, t0> sourceInformationMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private c0<d0> calledByMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int groupGapStart;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int groupGapLen;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int slotsGapStart;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int slotsGapLen;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int slotsGapOwner;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int insertCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private c0<i0<Object>> deferredSlotWrites;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int currentGroup;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int currentGroupEnd;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private d2 pendingRecalculateMarks;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final u0 startStack = new u0();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final u0 endStack = new u0();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final u0 nodeCountStack = new u0();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int parent = -1;

    /* JADX INFO: renamed from: r2.d3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lr2/d3$a;", "", "<init>", "()V", "Lr2/d3;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "Lr2/d;", "b", "(Lr2/d3;ILr2/d3;ZZZ)Ljava/util/List;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<d> b(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean zP0;
            List<d> listM;
            int iM0 = fromWriter.m0(fromIndex);
            int i11 = fromIndex + iM0;
            int iP = fromWriter.P(fromIndex);
            int iP2 = fromWriter.P(i11);
            int i12 = iP2 - iP;
            boolean zM = fromWriter.M(fromIndex);
            toWriter.q0(iM0);
            toWriter.r0(i12, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i11) {
                fromWriter.z0(i11);
            }
            if (fromWriter.slotsGapStart < iP2) {
                fromWriter.B0(iP2, i11);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            n.n(fromWriter.groups, iArr, currentGroup * 5, fromIndex * 5, i11 * 5);
            Object[] objArr = toWriter.slots;
            int i13 = toWriter.currentSlot;
            n.p(fromWriter.slots, objArr, i13, iP, iP2);
            int parent = toWriter.getParent();
            c3.b0(iArr, currentGroup, parent);
            int i14 = currentGroup - fromIndex;
            int i15 = currentGroup + iM0;
            int iQ = i13 - toWriter.Q(iArr, currentGroup);
            int i16 = toWriter.slotsGapOwner;
            int i17 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i18 = i16;
            int i19 = currentGroup;
            while (true) {
                zP0 = false;
                if (i19 >= i15) {
                    break;
                }
                if (i19 != currentGroup) {
                    c3.b0(iArr, i19, c3.T(iArr, i19) + i14);
                }
                int i21 = i15;
                c3.X(iArr, i19, toWriter.S(toWriter.Q(iArr, i19) + iQ, i18 >= i19 ? toWriter.slotsGapStart : 0, i17, length));
                if (i19 == i18) {
                    i18++;
                }
                i19++;
                i15 = i21;
                iQ = iQ;
            }
            int i22 = i15;
            toWriter.slotsGapOwner = i18;
            int iP3 = c3.P(fromWriter.anchors, fromIndex, fromWriter.f0());
            int iP4 = c3.P(fromWriter.anchors, i11, fromWriter.f0());
            if (iP3 < iP4) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iP4 - iP3);
                for (int i23 = iP3; i23 < iP4; i23++) {
                    d dVar = (d) arrayList.get(i23);
                    dVar.c(dVar.getLocation() + i14);
                    arrayList2.add(dVar);
                }
                toWriter.anchors.addAll(c3.P(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.f0()), arrayList2);
                arrayList.subList(iP3, iP4).clear();
                listM = arrayList2;
            } else {
                listM = v.m();
            }
            if (!listM.isEmpty()) {
                HashMap map = fromWriter.sourceInformationMap;
                HashMap map2 = toWriter.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = listM.size();
                    for (int i24 = 0; i24 < size; i24++) {
                        d dVar2 = listM.get(i24);
                        t0 t0Var = (t0) map.get(dVar2);
                        if (t0Var != null) {
                            map.remove(dVar2);
                            map2.put(dVar2, t0Var);
                        }
                    }
                }
            }
            int parent2 = toWriter.getParent();
            t0 t0VarH1 = toWriter.h1(parent);
            if (t0VarH1 != null) {
                int I = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i25 = -1;
                while (I < currentGroup2) {
                    i25 = I;
                    I = c3.I(toWriter.groups, I) + I;
                }
                t0VarH1.b(toWriter, i25, currentGroup2);
            }
            int iH0 = fromWriter.H0(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z11 = iH0 >= 0;
                    if (z11) {
                        fromWriter.j1();
                        fromWriter.D(iH0 - fromWriter.getCurrentGroup());
                        fromWriter.j1();
                    }
                    fromWriter.D(fromIndex - fromWriter.getCurrentGroup());
                    boolean zO0 = fromWriter.O0();
                    if (z11) {
                        fromWriter.Z0();
                        fromWriter.T();
                        fromWriter.Z0();
                        fromWriter.T();
                    }
                    zP0 = zO0;
                } else {
                    zP0 = fromWriter.P0(fromIndex, iM0);
                    fromWriter.Q0(iP, i12, fromIndex - 1);
                }
            }
            if (zP0) {
                o.s("Unexpectedly removed anchors");
            }
            toWriter.nodeCount += c3.N(iArr, currentGroup) ? 1 : c3.Q(iArr, currentGroup);
            if (updateToCursor) {
                toWriter.currentGroup = i22;
                toWriter.currentSlot = i13 + i12;
            }
            if (zM) {
                toWriter.s1(parent);
            }
            return listM;
        }

        static /* synthetic */ List c(Companion companion, SlotWriter slotWriter, int i11, SlotWriter slotWriter2, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
            if ((i12 & 32) != 0) {
                z13 = true;
            }
            return companion.b(slotWriter, i11, slotWriter2, z11, z12, z13);
        }

        private Companion() {
        }
    }

    public SlotWriter(a3 a3Var) {
        this.table = a3Var;
        this.groups = a3Var.getGroups();
        this.slots = a3Var.getSlots();
        this.anchors = a3Var.l();
        this.sourceInformationMap = a3Var.r();
        this.calledByMap = a3Var.m();
        this.groupGapStart = a3Var.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - a3Var.getGroupsSize();
        this.slotsGapStart = a3Var.getSlotsSize();
        this.slotsGapLen = this.slots.length - a3Var.getSlotsSize();
        this.slotsGapOwner = a3Var.getGroupsSize();
        this.currentGroupEnd = a3Var.getGroupsSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(int index, int group) {
        int i11 = this.slotsGapLen;
        int i12 = this.slotsGapStart;
        int i13 = this.slotsGapOwner;
        if (i12 != index) {
            Object[] objArr = this.slots;
            if (index < i12) {
                n.p(objArr, objArr, index + i11, index, i12);
            } else {
                n.p(objArr, objArr, i12, i12 + i11, index + i11);
            }
        }
        int iMin = Math.min(group + 1, f0());
        if (i13 != iMin) {
            int length = this.slots.length - i11;
            if (iMin < i13) {
                int iJ0 = j0(iMin);
                int iJ1 = j0(i13);
                int i14 = this.groupGapStart;
                while (iJ0 < iJ1) {
                    int iF = c3.F(this.groups, iJ0);
                    if (!(iF >= 0)) {
                        o.s("Unexpected anchor value, expected a positive anchor");
                    }
                    c3.X(this.groups, iJ0, -((length - iF) + 1));
                    iJ0++;
                    if (iJ0 == i14) {
                        iJ0 += this.groupGapLen;
                    }
                }
            } else {
                int iJ2 = j0(i13);
                int iJ3 = j0(iMin);
                while (iJ2 < iJ3) {
                    int iF2 = c3.F(this.groups, iJ2);
                    if (!(iF2 < 0)) {
                        o.s("Unexpected anchor value, expected a negative anchor");
                    }
                    c3.X(this.groups, iJ2, iF2 + length + 1);
                    iJ2++;
                    if (iJ2 == this.groupGapStart) {
                        iJ2 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final int G0(int[] iArr, int i11) {
        return Q(iArr, i11);
    }

    private final int H(int[] iArr, int i11) {
        return Q(iArr, i11) + c3.E(c3.H(iArr, i11) >> 29);
    }

    private final int I0(int[] iArr, int i11) {
        return J0(c3.T(iArr, j0(i11)));
    }

    private final boolean J(int group) {
        int iM0 = group + 1;
        int iM1 = group + m0(group);
        while (iM0 < iM1) {
            if (c3.C(this.groups, j0(iM0))) {
                return true;
            }
            iM0 += m0(iM0);
        }
        return false;
    }

    private final int J0(int index) {
        return index > -2 ? index : (f0() + index) - (-2);
    }

    private final void K() {
        int i11 = this.slotsGapStart;
        n.z(this.slots, null, i11, this.slotsGapLen + i11);
    }

    private final int K0(int index, int gapStart) {
        return index < gapStart ? index : -((f0() - index) + 2);
    }

    private final Object L0(Object value) {
        Object objX0 = X0();
        W0(value);
        return objX0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M(int group) {
        return group >= 0 && c3.C(this.groups, j0(group));
    }

    private final void M0() {
        d2 d2Var = this.pendingRecalculateMarks;
        if (d2Var != null) {
            while (d2Var.b()) {
                t1(d2Var.d(), d2Var);
            }
        }
    }

    private final boolean N(int group) {
        return group >= 0 && c3.D(this.groups, j0(group));
    }

    private final boolean N0(int gapStart, int size, HashMap<d, t0> sourceInformationMap) {
        int i11 = size + gapStart;
        int iP = c3.P(this.anchors, i11, Y() - this.groupGapLen);
        if (iP >= this.anchors.size()) {
            iP--;
        }
        int i12 = iP + 1;
        int i13 = 0;
        while (iP >= 0) {
            d dVar = this.anchors.get(iP);
            int iF = F(dVar);
            if (iF < gapStart) {
                break;
            }
            if (iF < i11) {
                dVar.c(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(dVar);
                }
                if (i13 == 0) {
                    i13 = iP + 1;
                }
                i12 = iP;
            }
            iP--;
        }
        boolean z11 = i12 < i13;
        if (z11) {
            this.anchors.subList(i12, i13).clear();
        }
        return z11;
    }

    private final int O(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int index) {
        return Q(this.groups, j0(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P0(int start, int len) {
        boolean zN0 = false;
        if (len > 0) {
            ArrayList<d> arrayList = this.anchors;
            z0(start);
            zN0 = arrayList.isEmpty() ? false : N0(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i11 = this.slotsGapOwner;
            if (i11 > start) {
                this.slotsGapOwner = Math.max(start, i11 - len);
            }
            int i12 = this.currentGroupEnd;
            if (i12 >= this.groupGapStart) {
                this.currentGroupEnd = i12 - len;
            }
            int i13 = this.parent;
            if (N(i13)) {
                s1(i13);
            }
        }
        return zN0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int[] iArr, int i11) {
        return i11 >= Y() ? this.slots.length - this.slotsGapLen : O(c3.F(iArr, i11), this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(int start, int len, int group) {
        if (len > 0) {
            int i11 = this.slotsGapLen;
            int i12 = start + len;
            B0(i12, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i11 + len;
            n.z(this.slots, null, start, i12);
            int i13 = this.currentSlotEnd;
            if (i13 >= start) {
                this.currentSlotEnd = i13 - len;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int dataIndex) {
        return dataIndex < this.slotsGapStart ? dataIndex : dataIndex + this.slotsGapLen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int S(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final int S0() {
        int iY = (Y() - this.groupGapLen) - this.endStack.i();
        this.currentGroupEnd = iY;
        return iY;
    }

    private final void T0() {
        this.endStack.j((Y() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final void X(int parent, int endGroup, int firstChild) {
        int iK0 = K0(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            c3.b0(this.groups, j0(firstChild), iK0);
            int I = c3.I(this.groups, j0(firstChild)) + firstChild;
            X(firstChild, I, firstChild + 1);
            firstChild = I;
        }
    }

    private final int Y() {
        return this.groups.length / 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int c1(int[] iArr, int i11) {
        return i11 >= Y() ? this.slots.length - this.slotsGapLen : O(c3.V(iArr, i11), this.slotsGapLen, this.slots.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t0 h1(int group) {
        d dVarO1;
        HashMap<d, t0> map = this.sourceInformationMap;
        if (map == null || (dVarO1 = o1(group)) == null) {
            return null;
        }
        return map.get(dVarO1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int j0(int index) {
        return index < this.groupGapStart ? index : index + this.groupGapLen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void l1(int key, Object objectKey, boolean isNode, Object aux) {
        int I;
        t0 t0VarH1;
        int i11 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.j(this.nodeCount);
        if (objArr == true) {
            int i12 = this.currentGroup;
            int iQ = Q(this.groups, j0(i12));
            q0(1);
            this.currentSlot = iQ;
            this.currentSlotEnd = iQ;
            int iJ0 = j0(i12);
            l.Companion aVar = l.INSTANCE;
            ?? r12 = objectKey != aVar.a() ? 1 : 0;
            ?? r13 = (isNode || aux == aVar.a()) ? 0 : 1;
            int iS = S(iQ, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iS >= 0 && this.slotsGapOwner < i12) {
                iS = -(((this.slots.length - this.slotsGapLen) - iS) + 1);
            }
            c3.M(this.groups, iJ0, key, isNode, r12, r13, this.parent, iS);
            int i13 = (isNode ? 1 : 0) + r12 + r13;
            if (i13 > 0) {
                r0(i13, i12);
                Object[] objArr2 = this.slots;
                int i14 = this.currentSlot;
                if (isNode) {
                    objArr2[i14] = aux;
                    i14++;
                }
                if (r12 != 0) {
                    objArr2[i14] = objectKey;
                    i14++;
                }
                if (r13 != 0) {
                    objArr2[i14] = aux;
                    i14++;
                }
                this.currentSlot = i14;
            }
            this.nodeCount = 0;
            I = i12 + 1;
            this.parent = i12;
            this.currentGroup = I;
            if (i11 >= 0 && (t0VarH1 = h1(i11)) != null) {
                t0VarH1.i(this, i12);
            }
        } else {
            this.startStack.j(i11);
            T0();
            int i15 = this.currentGroup;
            int iJ1 = j0(i15);
            if (!s.f(aux, l.INSTANCE.a())) {
                if (isNode) {
                    v1(aux);
                } else {
                    r1(aux);
                }
            }
            this.currentSlot = c1(this.groups, iJ1);
            this.currentSlotEnd = Q(this.groups, j0(this.currentGroup + 1));
            this.nodeCount = c3.Q(this.groups, iJ1);
            this.parent = i15;
            this.currentGroup = i15 + 1;
            I = i15 + c3.I(this.groups, iJ1);
        }
        this.currentGroupEnd = I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(int size) {
        if (size > 0) {
            int i11 = this.currentGroup;
            z0(i11);
            int i12 = this.groupGapStart;
            int i13 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < size) {
                int iMax = Math.max(Math.max(length * 2, i14 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                n.n(iArr, iArr2, 0, 0, i12 * 5);
                n.n(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.groups = iArr2;
                i13 = i15;
            }
            int i16 = this.currentGroupEnd;
            if (i16 >= i12) {
                this.currentGroupEnd = i16 + size;
            }
            int i17 = i12 + size;
            this.groupGapStart = i17;
            this.groupGapLen = i13 - size;
            int iS = S(i14 > 0 ? P(i11 + size) : 0, this.slotsGapOwner >= i12 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i18 = i12; i18 < i17; i18++) {
                c3.X(this.groups, i18, iS);
            }
            int i19 = this.slotsGapOwner;
            if (i19 >= i12) {
                this.slotsGapOwner = i19 + size;
            }
        }
    }

    private final void q1(int previousGapStart, int newGapStart) {
        d dVar;
        int iA;
        d dVar2;
        int iA2;
        int i11;
        int iY = Y() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iP = c3.P(this.anchors, newGapStart, iY); iP < this.anchors.size() && (iA = (dVar = this.anchors.get(iP)).getLocation()) >= 0; iP++) {
                dVar.c(-(iY - iA));
            }
            return;
        }
        for (int iP2 = c3.P(this.anchors, previousGapStart, iY); iP2 < this.anchors.size() && (iA2 = (dVar2 = this.anchors.get(iP2)).getLocation()) < 0 && (i11 = iA2 + iY) < newGapStart; iP2++) {
            dVar2.c(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0(int size, int group) {
        if (size > 0) {
            B0(this.currentSlot, group);
            int i11 = this.slotsGapStart;
            int i12 = this.slotsGapLen;
            if (i12 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i13 = length - i12;
                int iMax = Math.max(Math.max(length * 2, i13 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i14 = 0; i14 < iMax; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = iMax - i13;
                n.p(objArr, objArr2, 0, 0, i11);
                n.p(objArr, objArr2, i11 + i15, i12 + i11, length);
                this.slots = objArr2;
                i12 = i15;
            }
            int i16 = this.currentSlotEnd;
            if (i16 >= i11) {
                this.currentSlotEnd = i16 + size;
            }
            this.slotsGapStart = i11 + size;
            this.slotsGapLen = i12 - size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void s1(int group) {
        if (group >= 0) {
            d2 d2Var = this.pendingRecalculateMarks;
            if (d2Var == null) {
                d2Var = new d2(null, 1, 0 == true ? 1 : 0);
                this.pendingRecalculateMarks = d2Var;
            }
            d2Var.a(group);
        }
    }

    private final void t1(int group, d2 set) {
        int iJ0 = j0(group);
        boolean zJ = J(group);
        if (c3.D(this.groups, iJ0) != zJ) {
            c3.W(this.groups, iJ0, zJ);
            int iH0 = H0(group);
            if (iH0 >= 0) {
                set.a(iH0);
            }
        }
    }

    private final void u1(int[] iArr, int i11, int i12) {
        c3.X(iArr, i11, S(i12, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    public static /* synthetic */ void v0(SlotWriter slotWriter, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = slotWriter.parent;
        }
        slotWriter.u0(i11);
    }

    private final void w0(int originalLocation, int newLocation, int size) {
        d dVar;
        int iF;
        int i11 = size + originalLocation;
        int iF0 = f0();
        int iP = c3.P(this.anchors, originalLocation, iF0);
        ArrayList arrayList = new ArrayList();
        if (iP >= 0) {
            while (iP < this.anchors.size() && (iF = F((dVar = this.anchors.get(iP)))) >= originalLocation && iF < i11) {
                arrayList.add(dVar);
                this.anchors.remove(iP);
            }
        }
        int i12 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d dVar2 = (d) arrayList.get(i13);
            int iF2 = F(dVar2) + i12;
            if (iF2 >= this.groupGapStart) {
                dVar2.c(-(iF0 - iF2));
            } else {
                dVar2.c(iF2);
            }
            this.anchors.add(c3.P(this.anchors, iF2, iF0), dVar2);
        }
    }

    private final void x1(int index, Object value) {
        int iJ0 = j0(index);
        int[] iArr = this.groups;
        if (!(iJ0 < iArr.length && c3.N(iArr, iJ0))) {
            o.s("Updating the node of a group at " + index + " that was not created with as a node group");
        }
        this.slots[R(G0(this.groups, iJ0))] = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(int index) {
        int i11 = this.groupGapLen;
        int i12 = this.groupGapStart;
        if (i12 != index) {
            if (!this.anchors.isEmpty()) {
                q1(i12, index);
            }
            if (i11 > 0) {
                int[] iArr = this.groups;
                int i13 = index * 5;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                if (index < i12) {
                    n.n(iArr, iArr, i14 + i13, i13, i15);
                } else {
                    n.n(iArr, iArr, i15, i15 + i14, i13 + i14);
                }
            }
            if (index < i12) {
                i12 = index + i11;
            }
            int iY = Y();
            o.Q(i12 < iY);
            while (i12 < iY) {
                int iT = c3.T(this.groups, i12);
                int iK0 = K0(J0(iT), index);
                if (iK0 != iT) {
                    c3.b0(this.groups, i12, iK0);
                }
                i12++;
                if (i12 == index) {
                    i12 += i11;
                }
            }
        }
        this.groupGapStart = index;
    }

    public final List<d> A0(int offset, a3 table, int index) {
        o.Q(this.insertCount <= 0 && m0(this.currentGroup + offset) == 1);
        int i11 = this.currentGroup;
        int i12 = this.currentSlot;
        int i13 = this.currentSlotEnd;
        D(offset);
        j1();
        I();
        SlotWriter slotWriterW = table.w();
        try {
            List<d> listC = Companion.c(INSTANCE, slotWriterW, index, this, false, true, false, 32, null);
            slotWriterW.L(true);
            U();
            T();
            this.currentGroup = i11;
            this.currentSlot = i12;
            this.currentSlotEnd = i13;
            return listC;
        } catch (Throwable th2) {
            slotWriterW.L(false);
            throw th2;
        }
    }

    public final List<d> C0(d anchor, int offset, SlotWriter writer) {
        o.Q(writer.insertCount > 0);
        o.Q(this.insertCount == 0);
        o.Q(anchor.b());
        int iF = F(anchor) + offset;
        int i11 = this.currentGroup;
        o.Q(i11 <= iF && iF < this.currentGroupEnd);
        int iH0 = H0(iF);
        int iM0 = m0(iF);
        int iF0 = t0(iF) ? 1 : F0(iF);
        List<d> listC = Companion.c(INSTANCE, this, iF, writer, false, false, false, 32, null);
        s1(iH0);
        boolean z11 = iF0 > 0;
        while (iH0 >= i11) {
            int iJ0 = j0(iH0);
            int[] iArr = this.groups;
            c3.Y(iArr, iJ0, c3.I(iArr, iJ0) - iM0);
            if (z11) {
                if (c3.N(this.groups, iJ0)) {
                    z11 = false;
                } else {
                    int[] iArr2 = this.groups;
                    c3.a0(iArr2, iJ0, c3.Q(iArr2, iJ0) - iF0);
                }
            }
            iH0 = H0(iH0);
        }
        if (z11) {
            o.Q(this.nodeCount >= iF0);
            this.nodeCount -= iF0;
        }
        return listC;
    }

    public final void D(int amount) {
        boolean z11 = false;
        if (!(amount >= 0)) {
            o.s("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            a2.b("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i11 = this.currentGroup + amount;
        if (i11 >= this.parent && i11 <= this.currentGroupEnd) {
            z11 = true;
        }
        if (!z11) {
            o.s("Cannot seek outside the current group (" + this.parent + CoreConstants.DASH_CHAR + this.currentGroupEnd + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        this.currentGroup = i11;
        int iQ = Q(this.groups, j0(i11));
        this.currentSlot = iQ;
        this.currentSlotEnd = iQ;
    }

    public final Object D0(int index) {
        int iJ0 = j0(index);
        if (c3.N(this.groups, iJ0)) {
            return this.slots[R(G0(this.groups, iJ0))];
        }
        return null;
    }

    public final d E(int index) {
        ArrayList<d> arrayList = this.anchors;
        int iU = c3.U(arrayList, index, f0());
        if (iU >= 0) {
            return arrayList.get(iU);
        }
        if (index > this.groupGapStart) {
            index = -(f0() - index);
        }
        d dVar = new d(index);
        arrayList.add(-(iU + 1), dVar);
        return dVar;
    }

    public final Object E0(d anchor) {
        return D0(anchor.e(this));
    }

    public final int F(d anchor) {
        int iA = anchor.getLocation();
        return iA < 0 ? f0() + iA : iA;
    }

    public final int F0(int index) {
        return c3.Q(this.groups, j0(index));
    }

    public final void G(d anchor, Object value) {
        if (!(this.insertCount == 0)) {
            o.s("Can only append a slot if not current inserting");
        }
        int i11 = this.currentSlot;
        int i12 = this.currentSlotEnd;
        int iF = F(anchor);
        int iQ = Q(this.groups, j0(iF + 1));
        this.currentSlot = iQ;
        this.currentSlotEnd = iQ;
        r0(1, iF);
        if (i11 >= iQ) {
            i11++;
            i12++;
        }
        this.slots[iQ] = value;
        this.currentSlot = i11;
        this.currentSlotEnd = i12;
    }

    public final int H0(int index) {
        return I0(this.groups, index);
    }

    public final void I() {
        int i11 = this.insertCount;
        this.insertCount = i11 + 1;
        if (i11 == 0) {
            T0();
        }
    }

    public final void L(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.d()) {
            z0(f0());
            B0(this.slots.length - this.slotsGapLen, this.groupGapStart);
            K();
            M0();
        }
        this.table.h(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final boolean O0() {
        d dVarO1;
        if (!(this.insertCount == 0)) {
            o.s("Cannot remove group while inserting");
        }
        int i11 = this.currentGroup;
        int i12 = this.currentSlot;
        int iQ = Q(this.groups, j0(i11));
        int iY0 = Y0();
        t0 t0VarH1 = h1(this.parent);
        if (t0VarH1 != null && (dVarO1 = o1(i11)) != null) {
            t0VarH1.g(dVarO1);
        }
        d2 d2Var = this.pendingRecalculateMarks;
        if (d2Var != null) {
            while (d2Var.b() && d2Var.c() >= i11) {
                d2Var.d();
            }
        }
        boolean zP0 = P0(i11, this.currentGroup - i11);
        Q0(iQ, this.currentSlot - iQ, i11 - 1);
        this.currentGroup = i11;
        this.currentSlot = i12;
        this.nodeCount -= iY0;
        return zP0;
    }

    public final void R0() {
        if (!(this.insertCount == 0)) {
            o.s("Cannot reset when inserting");
        }
        M0();
        this.currentGroup = 0;
        this.currentGroupEnd = Y() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final int T() {
        i0<Object> i0VarC;
        boolean z11 = this.insertCount > 0;
        int i11 = this.currentGroup;
        int i12 = this.currentGroupEnd;
        int i13 = this.parent;
        int iJ0 = j0(i13);
        int i14 = this.nodeCount;
        int i15 = i11 - i13;
        boolean zN = c3.N(this.groups, iJ0);
        if (z11) {
            c0<i0<Object>> c0Var = this.deferredSlotWrites;
            if (c0Var != null && (i0VarC = c0Var.c(i13)) != null) {
                Object[] objArr = i0VarC.content;
                int i16 = i0VarC._size;
                for (int i17 = 0; i17 < i16; i17++) {
                    L0(objArr[i17]);
                }
                c0Var.q(i13);
            }
            c3.Y(this.groups, iJ0, i15);
            c3.a0(this.groups, iJ0, i14);
            this.nodeCount = this.nodeCountStack.i() + (zN ? 1 : i14);
            int iI0 = I0(this.groups, i13);
            this.parent = iI0;
            int iF0 = iI0 < 0 ? f0() : j0(iI0 + 1);
            int iQ = iF0 >= 0 ? Q(this.groups, iF0) : 0;
            this.currentSlot = iQ;
            this.currentSlotEnd = iQ;
            return i14;
        }
        if (!(i11 == i12)) {
            o.s("Expected to be at the end of a group");
        }
        int I = c3.I(this.groups, iJ0);
        int iQ2 = c3.Q(this.groups, iJ0);
        c3.Y(this.groups, iJ0, i15);
        c3.a0(this.groups, iJ0, i14);
        int i18 = this.startStack.i();
        S0();
        this.parent = i18;
        int iI1 = I0(this.groups, i13);
        int i19 = this.nodeCountStack.i();
        this.nodeCount = i19;
        if (iI1 == i18) {
            this.nodeCount = i19 + (zN ? 0 : i14 - iQ2);
            return i14;
        }
        int i21 = i15 - I;
        int i22 = zN ? 0 : i14 - iQ2;
        if (i21 != 0 || i22 != 0) {
            while (iI1 != 0 && iI1 != i18 && (i22 != 0 || i21 != 0)) {
                int iJ1 = j0(iI1);
                if (i21 != 0) {
                    c3.Y(this.groups, iJ1, c3.I(this.groups, iJ1) + i21);
                }
                if (i22 != 0) {
                    int[] iArr = this.groups;
                    c3.a0(iArr, iJ1, c3.Q(iArr, iJ1) + i22);
                }
                if (c3.N(this.groups, iJ1)) {
                    i22 = 0;
                }
                iI1 = I0(this.groups, iI1);
            }
        }
        this.nodeCount += i22;
        return i14;
    }

    public final void U() {
        if (!(this.insertCount > 0)) {
            a2.b("Unbalanced begin/end insert");
        }
        int i11 = this.insertCount - 1;
        this.insertCount = i11;
        if (i11 == 0) {
            if (!(this.nodeCountStack.getTos() == this.startStack.getTos())) {
                o.s("startGroup/endGroup mismatch while inserting");
            }
            S0();
        }
    }

    public final Object U0(int group, int index, Object value) {
        int iR = R(d1(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[iR];
        objArr[iR] = value;
        return obj;
    }

    public final void V(int index) {
        boolean z11 = false;
        if (!(this.insertCount <= 0)) {
            o.s("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.parent;
        if (i11 != index) {
            if (index >= i11 && index < this.currentGroupEnd) {
                z11 = true;
            }
            if (!z11) {
                o.s("Started group at " + index + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.currentGroup;
            int i13 = this.currentSlot;
            int i14 = this.currentSlotEnd;
            this.currentGroup = index;
            j1();
            this.currentGroup = i12;
            this.currentSlot = i13;
            this.currentSlotEnd = i14;
        }
    }

    public final Object V0(int index, Object value) {
        return U0(this.currentGroup, index, value);
    }

    public final void W(d anchor) {
        V(anchor.e(this));
    }

    public final void W0(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            o.s("Writing to an invalid slot");
        }
        this.slots[R(this.currentSlot - 1)] = value;
    }

    public final Object X0() {
        if (this.insertCount > 0) {
            r0(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i11 = this.currentSlot;
        this.currentSlot = i11 + 1;
        return objArr[R(i11)];
    }

    public final int Y0() {
        int iJ0 = j0(this.currentGroup);
        int I = this.currentGroup + c3.I(this.groups, iJ0);
        this.currentGroup = I;
        this.currentSlot = Q(this.groups, j0(I));
        if (c3.N(this.groups, iJ0)) {
            return 1;
        }
        return c3.Q(this.groups, iJ0);
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final void Z0() {
        int i11 = this.currentGroupEnd;
        this.currentGroup = i11;
        this.currentSlot = Q(this.groups, j0(i11));
    }

    public final boolean a0() {
        return this.calledByMap != null;
    }

    public final Object a1(int groupIndex, int index) {
        int iC1 = c1(this.groups, j0(groupIndex));
        int iQ = Q(this.groups, j0(groupIndex + 1));
        int i11 = index + iC1;
        if (iC1 > i11 || i11 >= iQ) {
            return l.INSTANCE.a();
        }
        return this.slots[R(i11)];
    }

    public final boolean b0() {
        return this.sourceInformationMap != null;
    }

    public final Object b1(d anchor, int index) {
        return a1(F(anchor), index);
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int d1(int group, int index) {
        int iC1 = c1(this.groups, j0(group));
        int i11 = iC1 + index;
        if (!(i11 >= iC1 && i11 < Q(this.groups, j0(group + 1)))) {
            o.s("Write to an invalid slot index " + index + " for group " + group);
        }
        return i11;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final int e1(int groupIndex) {
        return Q(this.groups, j0(groupIndex + m0(groupIndex)));
    }

    public final int f0() {
        return Y() - this.groupGapLen;
    }

    public final int f1(int groupIndex) {
        return Q(this.groups, j0(groupIndex + 1));
    }

    public final int g0() {
        return this.slots.length - this.slotsGapLen;
    }

    public final int g1(int groupIndex) {
        return c1(this.groups, j0(groupIndex));
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final a3 getTable() {
        return this.table;
    }

    public final Object i0(int index) {
        int iJ0 = j0(index);
        return c3.J(this.groups, iJ0) ? this.slots[H(this.groups, iJ0)] : l.INSTANCE.a();
    }

    public final void i1(int key, Object objectKey, Object aux) {
        l1(key, objectKey, false, aux);
    }

    public final void j1() {
        if (!(this.insertCount == 0)) {
            o.s("Key must be supplied when inserting");
        }
        l.Companion aVar = l.INSTANCE;
        l1(0, aVar.a(), false, aVar.a());
    }

    public final int k0(int index) {
        return c3.O(this.groups, j0(index));
    }

    public final void k1(int key, Object dataKey) {
        l1(key, dataKey, false, l.INSTANCE.a());
    }

    public final Object l0(int index) {
        int iJ0 = j0(index);
        if (c3.L(this.groups, iJ0)) {
            return this.slots[c3.S(this.groups, iJ0)];
        }
        return null;
    }

    public final int m0(int index) {
        return c3.I(this.groups, j0(index));
    }

    public final void m1(int key, Object objectKey) {
        l1(key, objectKey, true, l.INSTANCE.a());
    }

    public final boolean n0(int index) {
        return o0(index, this.currentGroup);
    }

    public final void n1(int count) {
        o.Q(count > 0);
        int i11 = this.parent;
        int iC1 = c1(this.groups, j0(i11));
        int iQ = Q(this.groups, j0(i11 + 1)) - count;
        o.Q(iQ >= iC1);
        Q0(iQ, count, i11);
        int i12 = this.currentSlot;
        if (i12 >= iC1) {
            this.currentSlot = i12 - count;
        }
    }

    public final boolean o0(int index, int group) {
        int iC;
        int iY;
        if (group == this.parent) {
            iY = this.currentGroupEnd;
        } else if (group <= this.startStack.h(0) && (iC = this.startStack.c(group)) >= 0) {
            iY = (Y() - this.groupGapLen) - this.endStack.f(iC);
        } else {
            int iM0 = m0(group);
            iY = iM0 + group;
        }
        return index > group && index < iY;
    }

    public final d o1(int group) {
        if (group < 0 || group >= f0()) {
            return null;
        }
        return c3.G(this.anchors, group, f0());
    }

    public final boolean p0(int index) {
        int i11 = this.parent;
        if (index <= i11 || index >= this.currentGroupEnd) {
            return i11 == 0 && index == 0;
        }
        return true;
    }

    public final Object p1(Object value) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return L0(value);
        }
        c0<i0<Object>> c0Var = this.deferredSlotWrites;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i11 = 1;
        int i12 = 0;
        if (c0Var == null) {
            c0Var = new c0<>(i12, i11, defaultConstructorMarker);
        }
        this.deferredSlotWrites = c0Var;
        int i13 = this.parent;
        i0<Object> i0VarC = c0Var.c(i13);
        if (i0VarC == null) {
            i0VarC = new i0<>(i12, i11, defaultConstructorMarker);
            c0Var.t(i13, i0VarC);
        }
        i0VarC.g(value);
        return l.INSTANCE.a();
    }

    public final void r1(Object value) {
        int iJ0 = j0(this.currentGroup);
        if (!c3.J(this.groups, iJ0)) {
            o.s("Updating the data of a group that was not created with a data slot");
        }
        this.slots[R(H(this.groups, iJ0))] = value;
    }

    public final boolean s0() {
        int i11 = this.currentGroup;
        return i11 < this.currentGroupEnd && c3.N(this.groups, j0(i11));
    }

    public final boolean t0(int index) {
        return c3.N(this.groups, j0(index));
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + f0() + " gap=" + this.groupGapStart + CoreConstants.DASH_CHAR + (this.groupGapStart + this.groupGapLen) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void u0(int group) {
        int iJ0 = j0(group);
        if (c3.K(this.groups, iJ0)) {
            return;
        }
        c3.Z(this.groups, iJ0, true);
        if (c3.D(this.groups, iJ0)) {
            return;
        }
        s1(H0(group));
    }

    public final void v1(Object value) {
        x1(this.currentGroup, value);
    }

    public final void w1(d anchor, Object value) {
        x1(anchor.e(this), value);
    }

    public final List<d> x0(a3 table, int index, boolean removeSourceGroup) {
        boolean z11 = false;
        o.Q(this.insertCount > 0 ? true : z11);
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || c3.I(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterW = table.w();
            try {
                return INSTANCE.b(slotWriterW, index, this, true, true, removeSourceGroup);
            } finally {
                slotWriterW.L(z11);
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<d> arrayList = this.anchors;
        HashMap<d, t0> map = this.sourceInformationMap;
        c0<d0> c0Var = this.calledByMap;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        HashMap<d, t0> mapR = table.r();
        c0<d0> c0VarM = table.m();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.l();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        this.sourceInformationMap = mapR;
        this.calledByMap = c0VarM;
        table.y(iArr, 0, objArr, 0, arrayList, map, c0Var);
        return this.anchors;
    }

    public final void y0(int offset) {
        boolean z11 = true;
        if (!(this.insertCount == 0)) {
            o.s("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            o.s("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i11 = this.currentGroup;
        int i12 = this.parent;
        int i13 = this.currentGroupEnd;
        int I = i11;
        for (int i14 = offset; i14 > 0; i14--) {
            I += c3.I(this.groups, j0(I));
            if (!(I <= i13)) {
                o.s("Parameter offset is out of bounds");
            }
        }
        int I2 = c3.I(this.groups, j0(I));
        int iQ = Q(this.groups, j0(this.currentGroup));
        int iQ2 = Q(this.groups, j0(I));
        int i15 = I + I2;
        int iQ3 = Q(this.groups, j0(i15));
        int i16 = iQ3 - iQ2;
        r0(i16, Math.max(this.currentGroup - 1, 0));
        q0(I2);
        int[] iArr = this.groups;
        int iJ0 = j0(i15) * 5;
        n.n(iArr, iArr, j0(i11) * 5, iJ0, (I2 * 5) + iJ0);
        if (i16 > 0) {
            Object[] objArr = this.slots;
            n.p(objArr, objArr, iQ, R(iQ2 + i16), R(iQ3 + i16));
        }
        int i17 = iQ2 + i16;
        int i18 = i17 - iQ;
        int i19 = this.slotsGapStart;
        int i21 = this.slotsGapLen;
        int length = this.slots.length;
        int i22 = this.slotsGapOwner;
        int i23 = i11 + I2;
        int i24 = i11;
        while (i24 < i23) {
            boolean z12 = z11;
            int iJ1 = j0(i24);
            int i25 = i24;
            int i26 = i18;
            u1(iArr, iJ1, S(Q(iArr, iJ1) - i18, i22 < iJ1 ? 0 : i19, i21, length));
            i24 = i25 + 1;
            z11 = z12;
            i18 = i26;
        }
        w0(i15, i11, I2);
        if (P0(i15, I2)) {
            o.s("Unexpectedly removed anchors");
        }
        X(i12, this.currentGroupEnd, i11);
        if (i16 > 0) {
            Q0(i17, i16, i15 - 1);
        }
    }

    public final void y1() {
        this.sourceInformationMap = this.table.r();
        this.calledByMap = this.table.m();
    }
}
