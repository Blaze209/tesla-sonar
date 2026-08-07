package p020r2;

import androidx.collection.a0;
import androidx.collection.k0;
import androidx.compose.runtime.snapshots.j;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.u0;
import wn0.l;
import wn0.p;
import z2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u009b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0004Ø\u0001è\u0001BI\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010\u0014J\u0019\u0010\"\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020'2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020'H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u0010\u0014J\u000f\u00105\u001a\u00020\u0012H\u0002¢\u0006\u0004\b5\u0010\u0014J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u0010\u0014J!\u0010:\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b:\u0010;J6\u0010?\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010<\u001a\u0004\u0018\u00010\u001b2\u0006\u0010>\u001a\u00020=2\b\u00109\u001a\u0004\u0018\u00010\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@J!\u0010C\u001a\u00020\u00122\u0006\u00108\u001a\u0002072\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u000207H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u0010\u0014J\u0017\u0010M\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010O\u001a\u00020\u0017H\u0002¢\u0006\u0004\bP\u0010QJ/\u0010U\u001a\u00020\u00172\u0006\u0010R\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0017H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bW\u0010NJ\u0017\u0010X\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bX\u0010NJ\u001f\u0010Z\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u0017H\u0002¢\u0006\u0004\bZ\u0010QJ\u000f\u0010[\u001a\u00020\u0012H\u0002¢\u0006\u0004\b[\u0010\u0014J'\u0010_\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020\u00172\u0006\u0010^\u001a\u00020\u0017H\u0002¢\u0006\u0004\b_\u0010`J\u001f\u0010b\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00172\u0006\u0010a\u001a\u00020\u0017H\u0002¢\u0006\u0004\bb\u0010QJ/\u0010e\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010c\u001a\u00020\u00172\u0006\u0010S\u001a\u00020\u00172\u0006\u0010d\u001a\u00020\u0017H\u0002¢\u0006\u0004\be\u0010VJ\u001b\u0010g\u001a\u00020\u0017*\u00020f2\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0012H\u0002¢\u0006\u0004\bi\u0010\u0014J\u000f\u0010j\u001a\u00020\u0012H\u0002¢\u0006\u0004\bj\u0010\u0014J9\u0010p\u001a\u00020\u00122\u000e\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0k2\u0006\u0010m\u001a\u00020'2\b\u0010n\u001a\u0004\u0018\u00010\u001b2\u0006\u0010o\u001a\u000207H\u0002¢\u0006\u0004\bp\u0010qJ+\u0010v\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0002¢\u0006\u0004\bv\u0010wJf\u0010\u007f\u001a\u00028\u0000\"\u0004\b\u0000\u0010x2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00172\u001c\b\u0002\u0010|\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020{\u0012\u0006\u0012\u0004\u0018\u00010\u001b0s0r2\f\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J8\u0010\u0083\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\u000e\u0010l\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010}H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J \u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001b*\u00020f2\u0006\u0010L\u001a\u00020\u0017H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0014J\u0011\u0010\u0088\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0088\u0001\u0010\u0014J\u001b\u0010\u008a\u0001\u001a\u00020\u00122\u0007\u0010\u0089\u0001\u001a\u00020$H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0011\u0010\u008c\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u008c\u0001\u0010\u0014J\u001a\u0010\u008e\u0001\u001a\u00020\u00122\u0007\u0010\u008d\u0001\u001a\u00020\u0017H\u0002¢\u0006\u0005\b\u008e\u0001\u0010\u001aJ\u0011\u0010\u008f\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0014J\u0011\u0010\u0090\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0014J\u0011\u0010\u0091\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u0014J\u0019\u0010\u0092\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0092\u0001\u0010\u001aJ\u0011\u0010\u0093\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0093\u0001\u0010\u0014J\u0019\u0010\u0094\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0005\b\u0094\u0001\u0010\u001aJ\u0011\u0010\u0095\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0095\u0001\u0010\u0014J\u0011\u0010\u0096\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0096\u0001\u0010\u0014J\u0011\u0010\u0097\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0097\u0001\u0010\u0014J#\u0010\u0098\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0005\b\u0098\u0001\u0010\u001eJ\u0011\u0010\u0099\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0099\u0001\u0010\u0014J\u0011\u0010\u009a\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009a\u0001\u0010\u0014J\u0011\u0010\u009b\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009b\u0001\u0010\u0014J\u0011\u0010\u009c\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009c\u0001\u0010\u0014J\u0011\u0010\u009d\u0001\u001a\u00020\u0012H\u0000¢\u0006\u0005\b\u009d\u0001\u0010\u0014J\u0011\u0010\u009e\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009e\u0001\u0010\u0014J\u0011\u0010\u009f\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u009f\u0001\u0010\u0014J(\u0010¡\u0001\u001a\u00020\u0012\"\u0005\b\u0000\u0010\u0093\u00012\r\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00028\u00000}H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b£\u0001\u0010\u0014J\u0011\u0010¤\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¤\u0001\u0010\u0014J#\u0010¥\u0001\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\b¥\u0001\u0010\u001eJ\u0011\u0010¦\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b¦\u0001\u0010\u0014J\u000f\u0010§\u0001\u001a\u00020\u0012¢\u0006\u0005\b§\u0001\u0010\u0014J\u000f\u0010¨\u0001\u001a\u00020\u0012¢\u0006\u0005\b¨\u0001\u0010\u0014JB\u0010ª\u0001\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0016\"\u0005\b\u0001\u0010\u0093\u00012\u0006\u0010!\u001a\u00028\u00002\u0019\u0010~\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120©\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0014\u0010¬\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0014\u0010®\u0001\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0006\b®\u0001\u0010\u00ad\u0001J\u001c\u0010¯\u0001\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001c\u0010±\u0001\u001a\u0002072\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0006\b±\u0001\u0010°\u0001J\u001b\u0010³\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030²\u0001H\u0017¢\u0006\u0006\b³\u0001\u0010´\u0001J\u001a\u0010µ\u0001\u001a\u0002072\u0006\u0010!\u001a\u000207H\u0017¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u001b\u0010¸\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030·\u0001H\u0017¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001b\u0010»\u0001\u001a\u0002072\u0007\u0010!\u001a\u00030º\u0001H\u0017¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001a\u0010½\u0001\u001a\u0002072\u0006\u0010!\u001a\u00020\u0017H\u0017¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001b\u0010¿\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\b¿\u0001\u0010#J\u001b\u0010À\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0001¢\u0006\u0005\bÀ\u0001\u0010#J!\u0010Â\u0001\u001a\u00020\u00122\r\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0016¢\u0006\u0006\bÂ\u0001\u0010¢\u0001J\u001f\u0010Ä\u0001\u001a\u00020\u00122\u000b\u0010!\u001a\u0007\u0012\u0002\b\u00030Ã\u0001H\u0017¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0011\u0010Æ\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÆ\u0001\u0010\u0014J)\u0010É\u0001\u001a\u00020\u00122\u0015\u0010È\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Ã\u00010Ç\u0001H\u0017¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0011\u0010Ë\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bË\u0001\u0010\u0014J(\u0010Í\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0093\u00012\r\u0010\u0018\u001a\t\u0012\u0004\u0012\u00028\u00000Ì\u0001H\u0017¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0012\u0010Ï\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J&\u0010Ó\u0001\u001a\u0002072\u0007\u0010Ñ\u0001\u001a\u00020{2\t\u0010Ò\u0001\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0011\u0010Õ\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÕ\u0001\u0010\u0014J\u0011\u0010Ö\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\bÖ\u0001\u0010\u0014J\u001a\u0010Ø\u0001\u001a\u00020\u00122\u0007\u0010×\u0001\u001a\u000207H\u0017¢\u0006\u0005\bØ\u0001\u0010JJ\u001a\u0010Ù\u0001\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J\u0015\u0010Ü\u0001\u001a\u0005\u0018\u00010Û\u0001H\u0017¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J-\u0010Þ\u0001\u001a\u00020\u00122\u001a\u0010u\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020t\u0012\u0006\u0012\u0004\u0018\u00010t0s0rH\u0017¢\u0006\u0005\bÞ\u0001\u0010wJ6\u0010ß\u0001\u001a\u00020\u00122\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u00012\f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0000¢\u0006\u0006\bß\u0001\u0010\u0084\u0001J \u0010à\u0001\u001a\u00020\u00122\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00120}H\u0000¢\u0006\u0006\bà\u0001\u0010¢\u0001J(\u0010á\u0001\u001a\u0002072\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020{\u0012\u0004\u0012\u00020\u001b0\u0081\u0001H\u0000¢\u0006\u0006\bá\u0001\u0010â\u0001J\u0014\u0010ã\u0001\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0006\bã\u0001\u0010\u00ad\u0001J\u001b\u0010ä\u0001\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0005\bä\u0001\u0010#J\u001c\u0010æ\u0001\u001a\u00020\u00122\b\u0010Ñ\u0001\u001a\u00030å\u0001H\u0016¢\u0006\u0006\bæ\u0001\u0010ç\u0001R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010î\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010ï\u0001R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010ð\u0001R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010ð\u0001R\u001e\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R \u0010ö\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010A0ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010õ\u0001R\u001b\u0010ø\u0001\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010÷\u0001R\u0019\u0010ú\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0001\u0010ã\u0001R\u0019\u0010û\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010ã\u0001R\u0018\u0010c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010ã\u0001R\u0018\u0010þ\u0001\u001a\u00030ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010ý\u0001R\u001c\u0010\u0081\u0002\u001a\u0005\u0018\u00010ÿ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0080\u0002R\u001c\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u0082\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010\u0083\u0002R\u0019\u0010\u0086\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u0085\u0002R\u0019\u0010\u0087\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010\u0085\u0002R\u0019\u0010\u0088\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010\u0085\u0002R\u001e\u0010|\u001a\n\u0012\u0005\u0012\u00030\u008a\u00020\u0089\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010\u008b\u0002R\u0018\u0010\u008d\u0002\u001a\u00030ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0002\u0010ý\u0001R\u0019\u0010\u008f\u0002\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010\u008e\u0002R\"\u0010\u0092\u0002\u001a\u000b\u0012\u0004\u0012\u00020'\u0018\u00010\u0090\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010\u0091\u0002R\u0019\u0010\u0093\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010\u0085\u0002R\u0018\u0010\u0094\u0002\u001a\u00030ü\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010ý\u0001R\u0019\u0010\u0095\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0085\u0002R\u0019\u0010\u0097\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010ã\u0001R\u0019\u0010\u0098\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010ã\u0001R\u0019\u0010\u0099\u0002\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010ã\u0001R\u0019\u0010\u009a\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0085\u0002R\u0018\u0010\u009d\u0002\u001a\u00030\u009b\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010\u009c\u0002R\u001e\u0010\u009f\u0002\u001a\t\u0012\u0004\u0012\u00020{0ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010õ\u0001R*\u0010£\u0002\u001a\u0002072\u0007\u0010 \u0002\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¦\u0001\u0010\u0085\u0002\u001a\u0006\b¡\u0002\u0010¢\u0002R*\u0010¥\u0002\u001a\u0002072\u0007\u0010 \u0002\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0085\u0002\u001a\u0006\b¤\u0002\u0010¢\u0002R)\u0010«\u0002\u001a\u00020f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bã\u0001\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002\"\u0006\b©\u0002\u0010ª\u0002R)\u0010±\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¬\u0002\u0010î\u0001\u001a\u0006\b\u00ad\u0002\u0010®\u0002\"\u0006\b¯\u0002\u0010°\u0002R\u001a\u0010´\u0002\u001a\u00030²\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010³\u0002R\u0019\u0010µ\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0085\u0002R\u001b\u0010¶\u0002\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u008e\u0002R+\u0010»\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010ð\u0001\u001a\u0006\b·\u0002\u0010¸\u0002\"\u0006\b¹\u0002\u0010º\u0002R\u0018\u0010¾\u0002\u001a\u00030¼\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010½\u0002R\u0019\u0010À\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010¿\u0002R\u001a\u0010Ã\u0002\u001a\u00030Á\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Â\u0002R/\u0010F\u001a\u0002072\u0007\u0010 \u0002\u001a\u0002078\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0005\bx\u0010\u0085\u0002\u0012\u0005\bÄ\u0002\u0010\u0014\u001a\u0006\b\u008c\u0002\u0010¢\u0002R0\u0010Ç\u0002\u001a\u00020\u00172\u0007\u0010 \u0002\u001a\u00020\u00178\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0006\b\u0099\u0001\u0010ã\u0001\u0012\u0005\bÆ\u0002\u0010\u0014\u001a\u0005\bx\u0010Å\u0002R\u001d\u0010Ê\u0002\u001a\u0004\u0018\u00010\u001b*\u00020f8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0002\u0010É\u0002R\u0017\u0010Ì\u0002\u001a\u0002078@X\u0080\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010¢\u0002R\u0018\u0010Ï\u0002\u001a\u00030Í\u00028WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0096\u0002\u0010Î\u0002R\u001e\u0010Ñ\u0002\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÐ\u0002\u0010\u0014\u001a\u0006\bù\u0001\u0010¢\u0002R\u001e\u0010Ó\u0002\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÒ\u0002\u0010\u0014\u001a\u0006\bè\u0001\u0010¢\u0002R\u0018\u0010Ö\u0002\u001a\u00030Ô\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010Õ\u0002R\u0018\u0010Ù\u0002\u001a\u00030×\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010Ø\u0002R\u0019\u0010Ü\u0002\u001a\u0004\u0018\u00010{8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÚ\u0002\u0010Û\u0002R\u001a\u0010Þ\u0002\u001a\u0005\u0018\u00010å\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010Ý\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006ß\u0002"}, d2 = {"Lr2/m;", "Lr2/l;", "Lr2/f;", "applier", "Lr2/q;", "parentContext", "Lr2/a3;", "slotTable", "", "Lr2/r2;", "abandonSet", "Ls2/a;", "changes", "lateChanges", "Lr2/e0;", "composition", "<init>", "(Lr2/f;Lr2/q;Lr2/a3;Ljava/util/Set;Ls2/a;Ls2/a;Lr2/e0;)V", "Ljn0/h0;", "p1", "()V", "w0", "V", "", Action.KEY_ATTRIBUTE, "l1", "(I)V", "", "dataKey", "m1", "(ILjava/lang/Object;)V", "u0", "i1", "value", "v1", "(Ljava/lang/Object;)V", "Lr2/d;", "c1", "()Lr2/d;", "Lr2/z1;", "n0", "()Lr2/z1;", Kind.GROUP, "o0", "(I)Lr2/z1;", "parentScope", "currentProviders", "u1", "(Lr2/z1;Lr2/z1;)Lr2/z1;", "providers", "a1", "(Lr2/z1;)V", "x0", "m0", "B0", "", "isNode", "data", "n1", "(ZLjava/lang/Object;)V", "objectKey", "Lr2/s0;", "kind", "k1", "(ILjava/lang/Object;ILjava/lang/Object;)V", "Lr2/y1;", "newPending", "y0", "(ZLr2/y1;)V", "expectedNodeCount", "inserting", "z0", "(IZ)V", "t0", "(Z)V", "X0", "index", "L0", "(I)I", "newCount", "t1", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "R0", "(IIII)I", "T0", "x1", "count", "s1", "j0", "oldGroup", "newGroup", "commonRoot", "b1", "(III)V", "nearestCommonRoot", "s0", "rGroupIndex", "recomposeKey", "l0", "Lr2/z2;", "I0", "(Lr2/z2;I)I", "j1", "g0", "Lr2/i1;", "content", "locals", "parameter", "force", "M0", "(Lr2/i1;Lr2/z1;Ljava/lang/Object;Z)V", "", "Lkotlin/Pair;", "Lr2/k1;", "references", "J0", "(Ljava/util/List;)V", "R", "from", "to", "Lr2/j2;", "invalidations", "Lkotlin/Function0;", "block", "V0", "(Lr2/e0;Lr2/e0;Ljava/lang/Integer;Ljava/util/List;Lwn0/a;)Ljava/lang/Object;", "Lt2/f;", "invalidationsRequested", "r0", "(Lt2/f;Lwn0/p;)V", "Q0", "(Lr2/z2;I)Ljava/lang/Object;", "y1", "z1", "anchor", "Z0", "(Lr2/d;)V", "Y0", "groupBeingRemoved", "e1", "d1", "A0", "i0", "H", "T", "o", "l", "L", "C", Gender.MALE, "S", "h0", "D", "q0", "p0", "y", "h", "factory", "z", "(Lwn0/a;)V", DateTokenConverter.CONVERTER_KEY, "g", IntegerTokenConverter.CONVERTER_KEY, "G", "o1", "v0", "Lkotlin/Function2;", "f", "(Ljava/lang/Object;Lwn0/p;)V", "O0", "()Ljava/lang/Object;", "P0", "n", "(Ljava/lang/Object;)Z", "K", "", "t", "(C)Z", "p", "(Z)Z", "", "q", "(F)Z", "", "s", "(J)Z", "r", "(I)Z", "w1", "r1", "effect", "E", "Lr2/h2;", Gender.OTHER, "(Lr2/h2;)V", "e", "", "values", Gender.NONE, "([Lr2/h2;)V", "Q", "Lr2/u;", Gender.UNKNOWN, "(Lr2/u;)Ljava/lang/Object;", "m", "()Lr2/q;", "scope", "instance", "q1", "(Lr2/j2;Ljava/lang/Object;)Z", "h1", "j", "changed", "a", "v", "(I)Lr2/l;", "Lr2/w2;", "x", "()Lr2/w2;", "K0", "k0", "S0", "U0", "(Lt2/f;)Z", "I", "B", "Lr2/i2;", "P", "(Lr2/i2;)V", "b", "Lr2/f;", "w", "()Lr2/f;", "c", "Lr2/q;", "Lr2/a3;", "Ljava/util/Set;", "Ls2/a;", "Lr2/e0;", "D0", "()Lr2/e0;", "Lr2/x3;", "Lr2/x3;", "pendingStack", "Lr2/y1;", "pending", "k", "nodeIndex", "groupNodeCount", "Lr2/u0;", "Lr2/u0;", "parentStateStack", "", "[I", "nodeCountOverrides", "Landroidx/collection/a0;", "Landroidx/collection/a0;", "nodeCountVirtualOverrides", "Z", "forceRecomposeScopes", "forciblyRecompose", "nodeExpected", "", "Lr2/w0;", "Ljava/util/List;", "u", "entersStack", "Lr2/z1;", "parentProvider", "Lt2/a;", "Lt2/a;", "providerUpdates", "providersInvalid", "providersInvalidStack", "reusing", "A", "reusingGroup", "childrenComposing", "compositionToken", "sourceMarkersEnabled", "r2/m$c", "Lr2/m$c;", "derivedStateObserver", Gender.FEMALE, "invalidateStack", "<set-?>", "N0", "()Z", "isComposing", "isDisposed$runtime_release", "isDisposed", "Lr2/z2;", "H0", "()Lr2/z2;", "g1", "(Lr2/z2;)V", "reader", "J", "getInsertTable$runtime_release", "()Lr2/a3;", "setInsertTable$runtime_release", "(Lr2/a3;)V", "insertTable", "Lr2/d3;", "Lr2/d3;", "writer", "writerHasAProvider", "providerCache", "F0", "()Ls2/a;", "setDeferredChanges$runtime_release", "(Ls2/a;)V", "deferredChanges", "Ls2/b;", "Ls2/b;", "changeListWriter", "Lr2/d;", "insertAnchor", "Ls2/c;", "Ls2/c;", "insertFixups", "getInserting$annotations", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "G0", "(Lr2/z2;)Ljava/lang/Object;", "node", "C0", "areChildrenComposing", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping$annotations", "skipping", "Lc3/a;", "()Lc3/a;", "compositionData", "Lr2/x;", "()Lr2/x;", "currentCompositionLocalMap", "E0", "()Lr2/j2;", "currentRecomposeScope", "()Lr2/i2;", "recomposeScope", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m implements l {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private int childrenComposing;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int compositionToken;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean sourceMarkersEnabled;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final c derivedStateObserver;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final x3<j2> invalidateStack;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isComposing;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private SlotReader reader;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private a3 insertTable;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private SlotWriter writer;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean writerHasAProvider;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private z1 providerCache;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private s2.a deferredChanges;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final s2.b changeListWriter;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private p020r2.d insertAnchor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private s2.c insertFixups;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private boolean inserting;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private int compoundKeyHash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p020r2.f<?> applier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q parentContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a3 slotTable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<r2> abandonSet;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private s2.a changes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private s2.a lateChanges;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final e0 composition;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private y1 pending;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int groupNodeCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int rGroupIndex;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int[] nodeCountOverrides;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private a0 nodeCountVirtualOverrides;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean forceRecomposeScopes;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean forciblyRecompose;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean nodeExpected;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private t2.a<z1> providerUpdates;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean providersInvalid;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean reusing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final x3<y1> pendingStack = new x3<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final u0 parentStateStack = new u0();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List<w0> invalidations = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final u0 entersStack = new u0();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private z1 parentProvider = z2.f.a();

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final u0 providersInvalidStack = new u0();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int reusingGroup = -1;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u001b\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0010¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0010¢\u0006\u0004\b(\u0010\rJ\u0017\u0010+\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b-\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0006\u00101\u001a\u00020.H\u0010¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b4\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b6\u00107R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\u0006\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b;\u0010:R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R0\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010&R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020E0\"8\u0006¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\bF\u0010BR+\u0010L\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010I\u001a\u0004\bJ\u0010\u001e\"\u0004\bK\u0010!R\u0014\u0010M\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b<\u0010:R\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lr2/m$b;", "Lr2/q;", "", "compoundHashKey", "", "collectingParameterInformation", "collectingSourceInformation", "Lr2/z;", "observerHolder", "<init>", "(Lr2/m;IZZLr2/z;)V", "Ljn0/h0;", "u", "()V", "Lr2/l;", "composer", "p", "(Lr2/l;)V", "s", "Lr2/e0;", "composition", "t", "(Lr2/e0;)V", "Lkotlin/Function0;", "content", "a", "(Lr2/e0;Lwn0/p;)V", "l", "Lr2/z1;", "g", "()Lr2/z1;", "scope", "y", "(Lr2/z1;)V", "", "Lc3/a;", "table", "o", "(Ljava/util/Set;)V", "r", "c", "Lr2/k1;", "reference", "k", "(Lr2/k1;)V", "b", "Lr2/j1;", "n", "(Lr2/k1;)Lr2/j1;", "data", "m", "(Lr2/k1;Lr2/j1;)V", "q", "I", "h", "()I", "Z", "e", "()Z", "f", DateTokenConverter.CONVERTER_KEY, "Lr2/z;", "j", "()Lr2/z;", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "inspectionTables", "Lr2/m;", "v", "composers", "<set-?>", "Lr2/p1;", "w", "x", "compositionLocalScope", "collectingCallByInformation", "Lkotlin/coroutines/CoroutineContext;", IntegerTokenConverter.CONVERTER_KEY, "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends q {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int compoundHashKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingParameterInformation;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean collectingSourceInformation;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final z observerHolder;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Set<Set<c3.a>> inspectionTables;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Set<m> composers = new LinkedHashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final p1 compositionLocalScope = n3.h(z2.f.a(), n3.n());

        public b(int i11, boolean z11, boolean z12, z zVar) {
            this.compoundHashKey = i11;
            this.collectingParameterInformation = z11;
            this.collectingSourceInformation = z12;
            this.observerHolder = zVar;
        }

        private final z1 w() {
            return (z1) this.compositionLocalScope.getValue();
        }

        private final void x(z1 z1Var) {
            this.compositionLocalScope.setValue(z1Var);
        }

        @Override // p020r2.q
        public void a(e0 composition, p<? super l, ? super Integer, h0> content) {
            m.this.parentContext.a(composition, content);
        }

        @Override // p020r2.q
        public void b(k1 reference) {
            m.this.parentContext.b(reference);
        }

        @Override // p020r2.q
        public void c() {
            m.this.childrenComposing--;
        }

        @Override // p020r2.q
        public boolean d() {
            return m.this.parentContext.d();
        }

        @Override // p020r2.q
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // p020r2.q
        /* JADX INFO: renamed from: f, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // p020r2.q
        public z1 g() {
            return w();
        }

        @Override // p020r2.q
        /* JADX INFO: renamed from: h, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // p020r2.q
        /* JADX INFO: renamed from: i */
        public CoroutineContext getEffectCoroutineContext() {
            return m.this.parentContext.getEffectCoroutineContext();
        }

        @Override // p020r2.q
        /* JADX INFO: renamed from: j, reason: from getter */
        public z getObserverHolder() {
            return this.observerHolder;
        }

        @Override // p020r2.q
        public void k(k1 reference) {
            m.this.parentContext.k(reference);
        }

        @Override // p020r2.q
        public void l(e0 composition) {
            m.this.parentContext.l(m.this.getComposition());
            m.this.parentContext.l(composition);
        }

        @Override // p020r2.q
        public void m(k1 reference, j1 data) {
            m.this.parentContext.m(reference, data);
        }

        @Override // p020r2.q
        public j1 n(k1 reference) {
            return m.this.parentContext.n(reference);
        }

        @Override // p020r2.q
        public void o(Set<c3.a> table) {
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // p020r2.q
        public void p(l composer) {
            s.i(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.p((m) composer);
            this.composers.add(composer);
        }

        @Override // p020r2.q
        public void q(e0 composition) {
            m.this.parentContext.q(composition);
        }

        @Override // p020r2.q
        public void r() {
            m.this.childrenComposing++;
        }

        @Override // p020r2.q
        public void s(l composer) {
            Set<Set<c3.a>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    s.i(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((m) composer).slotTable);
                }
            }
            u0.a(this.composers).remove(composer);
        }

        @Override // p020r2.q
        public void t(e0 composition) {
            m.this.parentContext.t(composition);
        }

        public final void u() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<c3.a>> set = this.inspectionTables;
            if (set != null) {
                for (m mVar : this.composers) {
                    Iterator<Set<c3.a>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(mVar.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        public final Set<m> v() {
            return this.composers;
        }

        public final void y(z1 scope) {
            x(scope);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"r2/m$c", "Lr2/i0;", "Lr2/h0;", "derivedState", "Ljn0/h0;", "a", "(Lr2/h0;)V", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements i0 {
        c() {
        }

        @Override // p020r2.i0
        public void a(h0<?> derivedState) {
            m.this.childrenComposing++;
        }

        @Override // p020r2.i0
        public void b(h0<?> derivedState) {
            m.this.childrenComposing--;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s2.a f106651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ SlotReader f106652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ k1 f106653f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s2.a aVar, SlotReader slotReader, k1 k1Var) {
            super(0);
            this.f106651d = aVar;
            this.f106652e = slotReader;
            this.f106653f = k1Var;
        }

        public final void b() {
            s2.b bVar = m.this.changeListWriter;
            s2.a aVar = this.f106651d;
            m mVar = m.this;
            SlotReader slotReader = this.f106652e;
            k1 k1Var = this.f106653f;
            s2.a changeList = bVar.getChangeList();
            try {
                bVar.T(aVar);
                SlotReader reader = mVar.getReader();
                int[] iArr = mVar.nodeCountOverrides;
                t2.a aVar2 = mVar.providerUpdates;
                mVar.nodeCountOverrides = null;
                mVar.providerUpdates = null;
                try {
                    mVar.g1(slotReader);
                    s2.b bVar2 = mVar.changeListWriter;
                    boolean implicitRootStart = bVar2.getImplicitRootStart();
                    try {
                        bVar2.U(false);
                        mVar.M0(k1Var.c(), k1Var.getLocals(), k1Var.getParameter(), true);
                        bVar2.U(implicitRootStart);
                        h0 h0Var = h0.f84049a;
                        mVar.g1(reader);
                        mVar.nodeCountOverrides = iArr;
                        mVar.providerUpdates = aVar2;
                        bVar.T(changeList);
                    } catch (Throwable th2) {
                        bVar2.U(implicitRootStart);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    mVar.g1(reader);
                    mVar.nodeCountOverrides = iArr;
                    mVar.providerUpdates = aVar2;
                    throw th3;
                }
            } catch (Throwable th4) {
                bVar.T(changeList);
                throw th4;
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k1 f106655d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k1 k1Var) {
            super(0);
            this.f106655d = k1Var;
        }

        public final void b() {
            m.this.M0(this.f106655d.c(), this.f106655d.getLocals(), this.f106655d.getParameter(), true);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i1<Object> f106656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f106657d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i1<Object> i1Var, Object obj) {
            super(2);
            this.f106656c = i1Var;
            this.f106657d = obj;
        }

        public final void a(l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(316014703, i11, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3293)");
            }
            this.f106656c.a().invoke(this.f106657d, lVar, 0);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public m(p020r2.f<?> fVar, q qVar, a3 a3Var, Set<r2> set, s2.a aVar, s2.a aVar2, e0 e0Var) {
        this.applier = fVar;
        this.parentContext = qVar;
        this.slotTable = a3Var;
        this.abandonSet = set;
        this.changes = aVar;
        this.lateChanges = aVar2;
        this.composition = e0Var;
        this.sourceMarkersEnabled = qVar.getCollectingSourceInformation() || qVar.d();
        this.derivedStateObserver = new c();
        this.invalidateStack = new x3<>();
        SlotReader slotReaderV = a3Var.v();
        slotReaderV.d();
        this.reader = slotReaderV;
        a3 a3Var2 = new a3();
        if (qVar.getCollectingSourceInformation()) {
            a3Var2.j();
        }
        if (qVar.d()) {
            a3Var2.i();
        }
        this.insertTable = a3Var2;
        SlotWriter slotWriterW = a3Var2.w();
        slotWriterW.L(true);
        this.writer = slotWriterW;
        this.changeListWriter = new s2.b(this, this.changes);
        SlotReader slotReaderV2 = this.insertTable.v();
        try {
            p020r2.d dVarA = slotReaderV2.a(0);
            slotReaderV2.d();
            this.insertAnchor = dVarA;
            this.insertFixups = new s2.c();
        } catch (Throwable th2) {
            slotReaderV2.d();
            throw th2;
        }
    }

    private final void A0() {
        this.changeListWriter.n();
        if (!this.pendingStack.c()) {
            o.s("Start/end imbalance");
        }
        i0();
    }

    private final void B0() {
        a3 a3Var = new a3();
        if (this.sourceMarkersEnabled) {
            a3Var.j();
        }
        if (this.parentContext.d()) {
            a3Var.i();
        }
        this.insertTable = a3Var;
        SlotWriter slotWriterW = a3Var.w();
        slotWriterW.L(true);
        this.writer = slotWriterW;
    }

    private final Object G0(SlotReader slotReader) {
        return slotReader.L(slotReader.getParent());
    }

    private final int I0(SlotReader slotReader, int i11) {
        Object objZ;
        if (!slotReader.G(i11)) {
            int iC = slotReader.C(i11);
            return (iC != 207 || (objZ = slotReader.z(i11)) == null || s.f(objZ, l.INSTANCE.a())) ? iC : objZ.hashCode();
        }
        Object objD = slotReader.D(i11);
        if (objD == null) {
            return 0;
        }
        if (objD instanceof Enum) {
            return ((Enum) objD).ordinal();
        }
        if (objD instanceof i1) {
            return 126665345;
        }
        return objD.hashCode();
    }

    private final void J0(List<Pair<k1, k1>> references) throws Throwable {
        s2.b bVar;
        s2.a aVar;
        a3 slotTable;
        p020r2.d anchor;
        SlotReader slotReader;
        s2.b bVar2;
        s2.a aVar2;
        a3 slotTable2;
        s2.b bVar3 = this.changeListWriter;
        s2.a aVar3 = this.lateChanges;
        s2.a changeList = bVar3.getChangeList();
        try {
            bVar3.T(aVar3);
            this.changeListWriter.R();
            int size = references.size();
            int i11 = 0;
            int i12 = 0;
            while (i12 < size) {
                try {
                    Pair<k1, k1> pair = references.get(i12);
                    k1 k1VarA = pair.a();
                    k1 k1VarB = pair.b();
                    p020r2.d anchor2 = k1VarA.getAnchor();
                    int iD = k1VarA.getSlotTable().d(anchor2);
                    IntRef intRef = new IntRef(i11, 1, null);
                    this.changeListWriter.e(intRef, anchor2);
                    if (k1VarB == null) {
                        if (s.f(k1VarA.getSlotTable(), this.insertTable)) {
                            m0();
                        }
                        SlotReader slotReaderV = k1VarA.getSlotTable().v();
                        try {
                            slotReaderV.Q(iD);
                            this.changeListWriter.z(iD);
                            s2.a aVar4 = new s2.a();
                            W0(this, null, null, null, null, new d(aVar4, slotReaderV, k1VarA), 15, null);
                            this.changeListWriter.s(aVar4, intRef);
                            h0 h0Var = h0.f84049a;
                            slotReaderV.d();
                        } catch (Throwable th2) {
                            slotReaderV.d();
                            throw th2;
                        }
                    } else {
                        j1 j1VarN = this.parentContext.n(k1VarB);
                        if (j1VarN == null || (slotTable = j1VarN.getSlotTable()) == null) {
                            slotTable = k1VarB.getSlotTable();
                        }
                        if (j1VarN == null || (slotTable2 = j1VarN.getSlotTable()) == null || (anchor = slotTable2.b(0)) == null) {
                            anchor = k1VarB.getAnchor();
                        }
                        List<? extends Object> listQ = o.q(slotTable, anchor);
                        if (!listQ.isEmpty()) {
                            this.changeListWriter.b(listQ, intRef);
                            if (s.f(k1VarA.getSlotTable(), this.slotTable)) {
                                int iD2 = this.slotTable.d(anchor2);
                                s1(iD2, x1(iD2) + listQ.size());
                            }
                        }
                        this.changeListWriter.c(j1VarN, this.parentContext, k1VarB, k1VarA);
                        SlotReader slotReaderV2 = slotTable.v();
                        try {
                            SlotReader reader = getReader();
                            int[] iArr = this.nodeCountOverrides;
                            t2.a aVar5 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                g1(slotReaderV2);
                                int iD3 = slotTable.d(anchor);
                                slotReaderV2.Q(iD3);
                                this.changeListWriter.z(iD3);
                                s2.a aVar6 = new s2.a();
                                s2.b bVar4 = this.changeListWriter;
                                s2.a changeList2 = bVar4.getChangeList();
                                try {
                                    bVar4.T(aVar6);
                                    slotReader = slotReaderV2;
                                    try {
                                        s2.b bVar5 = this.changeListWriter;
                                        boolean implicitRootStart = bVar5.getImplicitRootStart();
                                        try {
                                            bVar5.U(false);
                                            try {
                                                aVar5 = aVar5;
                                                aVar2 = changeList2;
                                                bVar2 = bVar4;
                                                try {
                                                    V0(k1VarB.getComposition(), k1VarA.getComposition(), Integer.valueOf(slotReader.getCurrent()), k1VarB.d(), new e(k1VarA));
                                                    try {
                                                        bVar5.U(implicitRootStart);
                                                        try {
                                                            bVar2.T(aVar2);
                                                            this.changeListWriter.s(aVar6, intRef);
                                                            h0 h0Var2 = h0.f84049a;
                                                            try {
                                                                g1(reader);
                                                                this.nodeCountOverrides = iArr;
                                                                this.providerUpdates = aVar5;
                                                                slotReader.d();
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                slotReader.d();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            g1(reader);
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = aVar5;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        bVar2.T(aVar2);
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    bVar5.U(implicitRootStart);
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                aVar5 = aVar5;
                                                aVar2 = changeList2;
                                                bVar2 = bVar4;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            aVar5 = aVar5;
                                            bVar2 = bVar4;
                                            aVar2 = changeList2;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        bVar2 = bVar4;
                                        aVar2 = changeList2;
                                        bVar2.T(aVar2);
                                        throw th;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    slotReader = slotReaderV2;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                aVar5 = aVar5;
                                slotReader = slotReaderV2;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            slotReader = slotReaderV2;
                        }
                    }
                    try {
                        this.changeListWriter.W();
                        i12++;
                        size = size;
                        bVar3 = bVar3;
                        changeList = changeList;
                        i11 = 0;
                    } catch (Throwable th13) {
                        th = th13;
                        bVar = bVar3;
                        aVar = changeList;
                        bVar.T(aVar);
                        throw th;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    bVar3 = bVar3;
                    changeList = changeList;
                }
            }
            s2.b bVar6 = bVar3;
            s2.a aVar7 = changeList;
            this.changeListWriter.h();
            this.changeListWriter.z(0);
            bVar6.T(aVar7);
        } catch (Throwable th15) {
            th = th15;
            bVar = bVar3;
            aVar = changeList;
        }
    }

    private final int L0(int index) {
        return (-2) - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0(i1<Object> content, z1 locals, Object parameter, boolean force) {
        M(126665345, content);
        v1(parameter);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = 126665345;
            boolean z11 = false;
            if (getInserting()) {
                SlotWriter.v0(this.writer, 0, 1, null);
            }
            if (!getInserting() && !s.f(this.reader.l(), locals)) {
                z11 = true;
            }
            if (z11) {
                a1(locals);
            }
            k1(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, o.A(), s0.INSTANCE.a(), locals);
            this.providerCache = null;
            if (!getInserting() || force) {
                boolean z12 = this.providersInvalid;
                this.providersInvalid = z11;
                p020r2.c.d(this, z2.c.c(316014703, true, new f(content, parameter)));
                this.providersInvalid = z12;
            } else {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.k(new k1(content, parameter, getComposition(), this.insertTable, slotWriter.E(slotWriter.H0(slotWriter.getParent())), v.m(), n0()));
            }
        } finally {
            u0();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            S();
        }
    }

    private final Object Q0(SlotReader slotReader, int i11) {
        return slotReader.L(i11);
    }

    private final int R0(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iP = this.reader.P(group);
        while (iP != recomposeGroup && !this.reader.J(iP)) {
            iP = this.reader.P(iP);
        }
        if (this.reader.J(iP)) {
            recomposeIndex = 0;
        }
        if (iP == group) {
            return recomposeIndex;
        }
        int iX1 = (x1(iP) - this.reader.N(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iX1 && iP != groupLocation) {
            iP++;
            while (iP < groupLocation) {
                int iE = this.reader.E(iP) + iP;
                if (groupLocation >= iE) {
                    recomposeIndex += this.reader.J(iP) ? 1 : x1(iP);
                    iP = iE;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int T0(int group) {
        int iP = this.reader.P(group) + 1;
        int i11 = 0;
        while (iP < group) {
            if (!this.reader.G(iP)) {
                i11++;
            }
            iP += this.reader.E(iP);
        }
        return i11;
    }

    private final void V() {
        i0();
        this.pendingStack.a();
        this.parentStateStack.a();
        this.entersStack.a();
        this.providersInvalidStack.a();
        this.providerUpdates = null;
        this.insertFixups.a();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.d();
        }
        if (this.writer.getClosed()) {
            return;
        }
        B0();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:11:0x002c, B:10:0x0028, B:14:0x0033, B:16:0x0039, B:18:0x003f), top: B:23:0x0005 }] */
    private final <R> R V0(e0 from, e0 to2, Integer index, List<? extends Pair<j2, ? extends Object>> invalidations, wn0.a<? extends R> block) {
        R rInvoke;
        boolean z11 = this.isComposing;
        int i11 = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i12 = 0; i12 < size; i12++) {
                Pair<j2, ? extends Object> pair = invalidations.get(i12);
                j2 j2VarA = pair.a();
                Object objB = pair.b();
                if (objB != null) {
                    q1(j2VarA, objB);
                } else {
                    q1(j2VarA, null);
                }
            }
            if (from == null) {
                rInvoke = block.invoke();
            } else {
                rInvoke = (R) from.e(to2, index != null ? index.intValue() : -1, block);
                if (rInvoke == null) {
                    rInvoke = block.invoke();
                }
            }
            return rInvoke;
        } finally {
            this.isComposing = z11;
            this.nodeIndex = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object W0(m mVar, e0 e0Var, e0 e0Var2, Integer num, List list, wn0.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            e0Var = null;
        }
        if ((i11 & 2) != 0) {
            e0Var2 = null;
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            list = v.m();
        }
        return mVar.V0(e0Var, e0Var2, num, list, aVar);
    }

    private final void X0() {
        boolean z11 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iE = this.reader.E(parent) + parent;
        int i11 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i12 = this.groupNodeCount;
        int i13 = this.rGroupIndex;
        w0 w0VarZ = o.z(this.invalidations, this.reader.getCurrent(), iE);
        boolean z12 = false;
        int i14 = parent;
        while (w0VarZ != null) {
            int location = w0VarZ.getLocation();
            o.O(this.invalidations, location);
            if (w0VarZ.d()) {
                this.reader.Q(location);
                int current = this.reader.getCurrent();
                b1(i14, current, parent);
                this.nodeIndex = R0(location, current, parent, i11);
                this.rGroupIndex = T0(current);
                int iP = this.reader.P(current);
                this.compoundKeyHash = l0(iP, T0(iP), parent, compoundKeyHash);
                this.providerCache = null;
                w0VarZ.getScope().g(this);
                this.providerCache = null;
                this.reader.R(parent);
                i14 = current;
                z12 = true;
            } else {
                this.invalidateStack.h(w0VarZ.getScope());
                w0VarZ.getScope().y();
                this.invalidateStack.g();
            }
            w0VarZ = o.z(this.invalidations, this.reader.getCurrent(), iE);
        }
        if (z12) {
            b1(i14, parent, parent);
            this.reader.T();
            int iX1 = x1(parent);
            this.nodeIndex = i11 + iX1;
            this.groupNodeCount = i12 + iX1;
            this.rGroupIndex = i13;
        } else {
            j1();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z11;
    }

    private final void Y0() {
        e1(this.reader.getCurrent());
        this.changeListWriter.P();
    }

    private final void Z0(p020r2.d anchor) {
        if (this.insertFixups.e()) {
            this.changeListWriter.t(anchor, this.insertTable);
        } else {
            this.changeListWriter.u(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new s2.c();
        }
    }

    private final void a1(z1 providers) {
        t2.a<z1> aVar = this.providerUpdates;
        if (aVar == null) {
            aVar = new t2.a<>(0, 1, null);
            this.providerUpdates = aVar;
        }
        aVar.b(this.reader.getCurrent(), providers);
    }

    private final void b1(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iL = o.L(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iL) {
            if (slotReader.J(oldGroup)) {
                this.changeListWriter.A();
            }
            oldGroup = slotReader.P(oldGroup);
        }
        s0(newGroup, iL);
    }

    private final p020r2.d c1() {
        int i11;
        int i12;
        if (getInserting()) {
            if (!o.I(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int iH0 = this.writer.H0(currentGroup);
            while (true) {
                int i13 = iH0;
                i12 = currentGroup;
                currentGroup = i13;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                iH0 = this.writer.H0(currentGroup);
            }
            return this.writer.E(i12);
        }
        if (!o.H(this.reader)) {
            return null;
        }
        int current = this.reader.getCurrent() - 1;
        int iP = this.reader.P(current);
        while (true) {
            int i14 = iP;
            i11 = current;
            current = i14;
            if (current == this.reader.getParent() || current < 0) {
                break;
            }
            iP = this.reader.P(current);
        }
        return this.reader.a(i11);
    }

    private final void d1() {
        if (this.slotTable.k()) {
            s2.a aVar = new s2.a();
            this.deferredChanges = aVar;
            SlotReader slotReaderV = this.slotTable.v();
            try {
                this.reader = slotReaderV;
                s2.b bVar = this.changeListWriter;
                s2.a changeList = bVar.getChangeList();
                try {
                    bVar.T(aVar);
                    e1(0);
                    this.changeListWriter.M();
                    bVar.T(changeList);
                    h0 h0Var = h0.f84049a;
                    slotReaderV.d();
                } catch (Throwable th2) {
                    bVar.T(changeList);
                    throw th2;
                }
            } catch (Throwable th3) {
                slotReaderV.d();
                throw th3;
            }
        }
    }

    private final void e1(int groupBeingRemoved) {
        f1(this, groupBeingRemoved, false, 0);
        this.changeListWriter.i();
    }

    private static final int f1(m mVar, int i11, boolean z11, int i12) {
        SlotReader slotReader = mVar.reader;
        if (!slotReader.F(i11)) {
            if (!slotReader.e(i11)) {
                if (slotReader.J(i11)) {
                    return 1;
                }
                return slotReader.N(i11);
            }
            int iE = slotReader.E(i11) + i11;
            int iF1 = 0;
            for (int iE2 = i11 + 1; iE2 < iE; iE2 += slotReader.E(iE2)) {
                boolean zJ = slotReader.J(iE2);
                if (zJ) {
                    mVar.changeListWriter.i();
                    mVar.changeListWriter.w(slotReader.L(iE2));
                }
                iF1 += f1(mVar, iE2, zJ || z11, zJ ? 0 : i12 + iF1);
                if (zJ) {
                    mVar.changeListWriter.i();
                    mVar.changeListWriter.A();
                }
            }
            if (slotReader.J(i11)) {
                return 1;
            }
            return iF1;
        }
        int iC = slotReader.C(i11);
        Object objD = slotReader.D(i11);
        if (iC != 126665345 || !(objD instanceof i1)) {
            if (iC != 206 || !s.f(objD, o.F())) {
                if (slotReader.J(i11)) {
                    return 1;
                }
                return slotReader.N(i11);
            }
            Object objB = slotReader.B(i11, 0);
            a aVar = objB instanceof a ? (a) objB : null;
            if (aVar != null) {
                for (m mVar2 : aVar.getRef().v()) {
                    mVar2.d1();
                    mVar.parentContext.q(mVar2.getComposition());
                }
            }
            return slotReader.N(i11);
        }
        i1 i1Var = (i1) objD;
        Object objB2 = slotReader.B(i11, 0);
        p020r2.d dVarA = slotReader.a(i11);
        List listW = o.w(mVar.invalidations, i11, slotReader.E(i11) + i11);
        ArrayList arrayList = new ArrayList(listW.size());
        int size = listW.size();
        for (int i13 = 0; i13 < size; i13++) {
            w0 w0Var = (w0) listW.get(i13);
            arrayList.add(x.a(w0Var.getScope(), w0Var.getInstances()));
        }
        k1 k1Var = new k1(i1Var, objB2, mVar.getComposition(), mVar.slotTable, dVarA, arrayList, mVar.o0(i11));
        mVar.parentContext.b(k1Var);
        mVar.changeListWriter.L();
        mVar.changeListWriter.N(mVar.getComposition(), mVar.parentContext, k1Var);
        if (!z11) {
            return slotReader.N(i11);
        }
        mVar.changeListWriter.j(i12, i11);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    private final void g0() {
        j2 j2Var;
        boolean z11;
        if (getInserting()) {
            e0 composition = getComposition();
            s.i(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            j2 j2Var2 = new j2((s) composition);
            this.invalidateStack.h(j2Var2);
            w1(j2Var2);
            j2Var2.I(this.compositionToken);
            return;
        }
        w0 w0VarO = o.O(this.invalidations, this.reader.getParent());
        Object objK = this.reader.K();
        if (s.f(objK, l.INSTANCE.a())) {
            e0 composition2 = getComposition();
            s.i(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            j2Var = new j2((s) composition2);
            w1(j2Var);
        } else {
            s.i(objK, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            j2Var = (j2) objK;
        }
        if (w0VarO == null) {
            boolean zM = j2Var.m();
            if (zM) {
                j2Var.D(false);
            }
            z11 = zM;
        }
        j2Var.E(z11);
        this.invalidateStack.h(j2Var);
        j2Var.I(this.compositionToken);
    }

    private final void i0() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.S();
        this.invalidateStack.a();
        j0();
    }

    private final void i1() {
        this.groupNodeCount += this.reader.S();
    }

    private final void j0() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void j1() {
        this.groupNodeCount = this.reader.v();
        this.reader.T();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:71:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x017c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:0x018e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1  */
    private final void k1(int key, Object objectKey, int kind, Object data) {
        int iRotateLeft;
        s0.Companion companion;
        boolean z11;
        y1 y1Var;
        boolean z12;
        y1 y1Var2;
        int currentGroup;
        y1 y1Var3;
        z1();
        int i11 = this.rGroupIndex;
        if (objectKey == null) {
            if (data == null || key != 207 || s.f(data, l.INSTANCE.a())) {
                iRotateLeft = i11 ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ key, 3);
            } else {
                this.compoundKeyHash = i11 ^ Integer.rotateLeft(data.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
            }
            if (objectKey == null) {
                this.rGroupIndex++;
            }
            companion = s0.INSTANCE;
            if (kind != companion.a()) {
                z11 = true;
            } else {
                z11 = false;
            }
            y1Var = null;
            if (getInserting()) {
                this.reader.c();
                currentGroup = this.writer.getCurrentGroup();
                if (z11) {
                    this.writer.m1(key, l.INSTANCE.a());
                } else if (data != null) {
                    SlotWriter slotWriter = this.writer;
                    if (objectKey == null) {
                        objectKey = l.INSTANCE.a();
                    }
                    slotWriter.i1(key, objectKey, data);
                } else {
                    SlotWriter slotWriter2 = this.writer;
                    if (objectKey == null) {
                        objectKey = l.INSTANCE.a();
                    }
                    slotWriter2.k1(key, objectKey);
                }
                y1Var3 = this.pending;
                if (y1Var3 != null) {
                    z0 z0Var = new z0(key, -1, L0(currentGroup), -1, 0);
                    y1Var3.i(z0Var, this.nodeIndex - y1Var3.getStartIndex());
                    y1Var3.h(z0Var);
                }
                y0(z11, null);
                return;
            }
            if (kind != companion.b() && this.reusing) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.pending == null) {
                int iN = this.reader.n();
                if (z12 && iN == key && s.f(objectKey, this.reader.o())) {
                    n1(z11, data);
                } else {
                    this.pending = new y1(this.reader.h(), this.nodeIndex);
                }
            }
            y1Var2 = this.pending;
            if (y1Var2 != null) {
                z0 z0VarD = y1Var2.d(key, objectKey);
                if (!z12 || z0VarD == null) {
                    this.reader.c();
                    this.inserting = true;
                    this.providerCache = null;
                    x0();
                    this.writer.I();
                    int currentGroup2 = this.writer.getCurrentGroup();
                    if (z11) {
                        this.writer.m1(key, l.INSTANCE.a());
                    } else if (data != null) {
                        SlotWriter slotWriter3 = this.writer;
                        if (objectKey == null) {
                            objectKey = l.INSTANCE.a();
                        }
                        slotWriter3.i1(key, objectKey, data);
                    } else {
                        SlotWriter slotWriter4 = this.writer;
                        if (objectKey == null) {
                            objectKey = l.INSTANCE.a();
                        }
                        slotWriter4.k1(key, objectKey);
                    }
                    this.insertAnchor = this.writer.E(currentGroup2);
                    z0 z0Var2 = new z0(key, -1, L0(currentGroup2), -1, 0);
                    y1Var2.i(z0Var2, this.nodeIndex - y1Var2.getStartIndex());
                    y1Var2.h(z0Var2);
                    y1Var = new y1(new ArrayList(), z11 ? 0 : this.nodeIndex);
                } else {
                    y1Var2.h(z0VarD);
                    int location = z0VarD.getLocation();
                    this.nodeIndex = y1Var2.g(z0VarD) + y1Var2.getStartIndex();
                    int iM = y1Var2.m(z0VarD);
                    int groupIndex = iM - y1Var2.getGroupIndex();
                    y1Var2.k(iM, y1Var2.getGroupIndex());
                    this.changeListWriter.y(location);
                    this.reader.Q(location);
                    if (groupIndex > 0) {
                        this.changeListWriter.v(groupIndex);
                    }
                    n1(z11, data);
                }
            }
            y0(z11, y1Var);
        }
        iRotateLeft = Integer.rotateLeft((objectKey instanceof Enum ? ((Enum) objectKey).ordinal() : objectKey.hashCode()) ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
        this.compoundKeyHash = iRotateLeft;
        if (objectKey == null) {
            this.rGroupIndex++;
        }
        companion = s0.INSTANCE;
        if (kind != companion.a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        y1Var = null;
        if (getInserting()) {
            this.reader.c();
            currentGroup = this.writer.getCurrentGroup();
            if (z11) {
                this.writer.m1(key, l.INSTANCE.a());
            } else if (data != null) {
                SlotWriter slotWriter5 = this.writer;
                if (objectKey == null) {
                    objectKey = l.INSTANCE.a();
                }
                slotWriter5.i1(key, objectKey, data);
            } else {
                SlotWriter slotWriter6 = this.writer;
                if (objectKey == null) {
                    objectKey = l.INSTANCE.a();
                }
                slotWriter6.k1(key, objectKey);
            }
            y1Var3 = this.pending;
            if (y1Var3 != null) {
                z0 z0Var3 = new z0(key, -1, L0(currentGroup), -1, 0);
                y1Var3.i(z0Var3, this.nodeIndex - y1Var3.getStartIndex());
                y1Var3.h(z0Var3);
            }
            y0(z11, null);
            return;
        }
        if (kind != companion.b()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (this.pending == null) {
            int iN2 = this.reader.n();
            if (z12) {
                this.pending = new y1(this.reader.h(), this.nodeIndex);
            } else {
                this.pending = new y1(this.reader.h(), this.nodeIndex);
            }
        }
        y1Var2 = this.pending;
        if (y1Var2 != null) {
            z0 z0VarD2 = y1Var2.d(key, objectKey);
            if (z12) {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                x0();
                this.writer.I();
                int currentGroup3 = this.writer.getCurrentGroup();
                if (z11) {
                    this.writer.m1(key, l.INSTANCE.a());
                } else if (data != null) {
                    SlotWriter slotWriter7 = this.writer;
                    if (objectKey == null) {
                        objectKey = l.INSTANCE.a();
                    }
                    slotWriter7.i1(key, objectKey, data);
                } else {
                    SlotWriter slotWriter8 = this.writer;
                    if (objectKey == null) {
                        objectKey = l.INSTANCE.a();
                    }
                    slotWriter8.k1(key, objectKey);
                }
                this.insertAnchor = this.writer.E(currentGroup3);
                z0 z0Var4 = new z0(key, -1, L0(currentGroup3), -1, 0);
                y1Var2.i(z0Var4, this.nodeIndex - y1Var2.getStartIndex());
                y1Var2.h(z0Var4);
                y1Var = new y1(new ArrayList(), z11 ? 0 : this.nodeIndex);
            } else {
                this.reader.c();
                this.inserting = true;
                this.providerCache = null;
                x0();
                this.writer.I();
                int currentGroup4 = this.writer.getCurrentGroup();
                if (z11) {
                    this.writer.m1(key, l.INSTANCE.a());
                } else if (data != null) {
                    SlotWriter slotWriter9 = this.writer;
                    if (objectKey == null) {
                        objectKey = l.INSTANCE.a();
                    }
                    slotWriter9.i1(key, objectKey, data);
                } else {
                    SlotWriter slotWriter10 = this.writer;
                    if (objectKey == null) {
                        objectKey = l.INSTANCE.a();
                    }
                    slotWriter10.k1(key, objectKey);
                }
                this.insertAnchor = this.writer.E(currentGroup4);
                z0 z0Var5 = new z0(key, -1, L0(currentGroup4), -1, 0);
                y1Var2.i(z0Var5, this.nodeIndex - y1Var2.getStartIndex());
                y1Var2.h(z0Var5);
                y1Var = new y1(new ArrayList(), z11 ? 0 : this.nodeIndex);
            }
        }
        y0(z11, y1Var);
    }

    private final int l0(int group, int rGroupIndex, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int iI0 = I0(this.reader, group);
        if (iI0 == 126665345) {
            return iI0;
        }
        int iP = this.reader.P(group);
        if (iP != recomposeGroup) {
            recomposeKey = l0(iP, T0(iP), recomposeGroup, recomposeKey);
        }
        if (this.reader.G(group)) {
            rGroupIndex = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(recomposeKey, 3) ^ iI0, 3) ^ rGroupIndex;
    }

    private final void l1(int key) {
        k1(key, null, s0.INSTANCE.a(), null);
    }

    private final void m0() {
        o.Q(this.writer.getClosed());
        B0();
    }

    private final void m1(int key, Object dataKey) {
        k1(key, dataKey, s0.INSTANCE.a(), null);
    }

    private final z1 n0() {
        z1 z1Var = this.providerCache;
        return z1Var != null ? z1Var : o0(this.reader.getParent());
    }

    private final void n1(boolean isNode, Object data) {
        if (isNode) {
            this.reader.V();
            return;
        }
        if (data != null && this.reader.l() != data) {
            this.changeListWriter.Z(data);
        }
        this.reader.U();
    }

    private final z1 o0(int group) {
        z1 z1VarA;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.k0(parent) == 202 && s.f(this.writer.l0(parent), o.A())) {
                    Object objI0 = this.writer.i0(parent);
                    s.i(objI0, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    z1 z1Var = (z1) objI0;
                    this.providerCache = z1Var;
                    return z1Var;
                }
                parent = this.writer.H0(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.C(group) == 202 && s.f(this.reader.D(group), o.A())) {
                    t2.a<z1> aVar = this.providerUpdates;
                    if (aVar == null || (z1VarA = aVar.a(group)) == null) {
                        Object objZ = this.reader.z(group);
                        s.i(objZ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        z1VarA = (z1) objZ;
                    }
                    this.providerCache = z1VarA;
                    return z1VarA;
                }
                group = this.reader.P(group);
            }
        }
        z1 z1Var2 = this.parentProvider;
        this.providerCache = z1Var2;
        return z1Var2;
    }

    private final void p1() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.v();
        l1(100);
        this.parentContext.r();
        this.parentProvider = this.parentContext.g();
        this.providersInvalidStack.j(o.p(this.providersInvalid));
        this.providersInvalid = n(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation();
        }
        Set<c3.a> set = (Set) y.b(this.parentProvider, c3.d.a());
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.o(set);
        }
        l1(this.parentContext.getCompoundHashKey());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    private final void r0(t2.f<j2, Object> invalidationsRequested, p<? super l, ? super Integer, h0> content) {
        long[] jArr;
        if (this.isComposing) {
            o.s("Reentrant composition is not supported");
        }
        Object objA = c4.f106500a.a("Compose:recompose");
        try {
            this.compositionToken = j.H().getId();
            this.providerUpdates = null;
            k0<Object, Object> k0VarD = invalidationsRequested.d();
            Object[] objArr = k0VarD.keys;
            Object[] objArr2 = k0VarD.values;
            long[] jArr2 = k0VarD.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j11 = jArr2[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j11 & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                Object obj = objArr[i15];
                                Object obj2 = objArr2[i15];
                                s.i(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                p020r2.d anchor = ((j2) obj).getAnchor();
                                if (anchor != null) {
                                    int location = anchor.getLocation();
                                    List<w0> list = this.invalidations;
                                    j2 j2Var = (j2) obj;
                                    if (obj2 == v2.f106849a) {
                                        obj2 = null;
                                    }
                                    list.add(new w0(j2Var, location, obj2));
                                }
                            }
                            j11 >>= i12;
                            i14++;
                            i12 = i12;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    jArr2 = jArr;
                }
            }
            v.C(this.invalidations, o.f106739g);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                p1();
                Object objO0 = O0();
                if (objO0 != content && content != null) {
                    w1(content);
                }
                c cVar = this.derivedStateObserver;
                t2.b<i0> bVarC = n3.c();
                try {
                    bVarC.b(cVar);
                    if (content != null) {
                        m1(200, o.B());
                        p020r2.c.d(this, content);
                        u0();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objO0 == null || s.f(objO0, l.INSTANCE.a())) {
                        h1();
                    } else {
                        m1(200, o.B());
                        p020r2.c.d(this, (p) u0.g(objO0, 2));
                        u0();
                    }
                    bVarC.v(bVarC.getSize() - 1);
                    w0();
                    this.isComposing = false;
                    this.invalidations.clear();
                    m0();
                    h0 h0Var = h0.f84049a;
                    c4.f106500a.b(objA);
                } catch (Throwable th2) {
                    bVarC.v(bVarC.getSize() - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.isComposing = false;
                this.invalidations.clear();
                V();
                m0();
                throw th3;
            }
        } catch (Throwable th4) {
            c4.f106500a.b(objA);
            throw th4;
        }
    }

    private final void s0(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        s0(this.reader.P(group), nearestCommonRoot);
        if (this.reader.J(group)) {
            this.changeListWriter.w(Q0(this.reader, group));
        }
    }

    private final void s1(int group, int count) {
        if (x1(group) != count) {
            if (group < 0) {
                a0 a0Var = this.nodeCountVirtualOverrides;
                if (a0Var == null) {
                    a0Var = new a0(0, 1, null);
                    this.nodeCountVirtualOverrides = a0Var;
                }
                a0Var.q(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                int[] iArr2 = new int[this.reader.getGroupsSize()];
                n.B(iArr2, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr2;
                iArr = iArr2;
            }
            iArr[group] = count;
        }
    }

    private final void t0(boolean isNode) {
        int iHashCode;
        List<z0> list;
        int iHashCode2;
        int iG = this.parentStateStack.g() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iK0 = this.writer.k0(parent);
            Object objL0 = this.writer.l0(parent);
            Object objI0 = this.writer.i0(parent);
            if (objL0 != null) {
                iHashCode2 = Integer.hashCode(objL0 instanceof Enum ? ((Enum) objL0).ordinal() : objL0.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objI0 == null || iK0 != 207 || s.f(objI0, l.INSTANCE.a())) {
                iHashCode2 = Integer.rotateRight(iG ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iK0);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iG ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objI0.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iC = this.reader.C(parent2);
            Object objD = this.reader.D(parent2);
            Object objZ = this.reader.z(parent2);
            if (objD != null) {
                iHashCode = Integer.hashCode(objD instanceof Enum ? ((Enum) objD).ordinal() : objD.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objZ == null || iC != 207 || s.f(objZ, l.INSTANCE.a())) {
                iHashCode = Integer.rotateRight(iG ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iC);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iG ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objZ.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode, 3);
        }
        int i11 = this.groupNodeCount;
        y1 y1Var = this.pending;
        if (y1Var != null && y1Var.b().size() > 0) {
            List<z0> listB = y1Var.b();
            List<z0> listF = y1Var.f();
            Set setE = b3.a.e(listF);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listF.size();
            int size2 = listB.size();
            int i12 = 0;
            int i13 = 0;
            int iO = 0;
            while (i12 < size2) {
                z0 z0Var = listB.get(i12);
                if (setE.contains(z0Var)) {
                    list = listB;
                    if (!linkedHashSet.contains(z0Var)) {
                        if (i13 < size) {
                            z0 z0Var2 = listF.get(i13);
                            if (z0Var2 != z0Var) {
                                int iG2 = y1Var.g(z0Var2);
                                linkedHashSet.add(z0Var2);
                                if (iG2 != iO) {
                                    int iO2 = y1Var.o(z0Var2);
                                    this.changeListWriter.x(y1Var.getStartIndex() + iG2, iO + y1Var.getStartIndex(), iO2);
                                    y1Var.j(iG2, iO, iO2);
                                }
                            } else {
                                i12++;
                            }
                            i13++;
                            iO += y1Var.o(z0Var2);
                            listB = list;
                            listF = listF;
                        }
                    }
                    listB = list;
                } else {
                    this.changeListWriter.Q(y1Var.g(z0Var) + y1Var.getStartIndex(), z0Var.getNodes());
                    y1Var.n(z0Var.getLocation(), 0);
                    this.changeListWriter.y(z0Var.getLocation());
                    this.reader.Q(z0Var.getLocation());
                    Y0();
                    this.reader.S();
                    list = listB;
                    o.P(this.invalidations, z0Var.getLocation(), z0Var.getLocation() + this.reader.E(z0Var.getLocation()));
                }
                i12++;
                listB = list;
            }
            this.changeListWriter.i();
            if (listB.size() > 0) {
                this.changeListWriter.y(this.reader.m());
                this.reader.T();
            }
        }
        int i14 = this.nodeIndex;
        while (!this.reader.H()) {
            int current = this.reader.getCurrent();
            Y0();
            this.changeListWriter.Q(i14, this.reader.S());
            o.P(this.invalidations, current, this.reader.getCurrent());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (isNode) {
                this.insertFixups.c();
                i11 = 1;
            }
            this.reader.f();
            int parent3 = this.writer.getParent();
            this.writer.T();
            if (!this.reader.t()) {
                int iL0 = L0(parent3);
                this.writer.U();
                this.writer.L(true);
                Z0(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    s1(iL0, 0);
                    t1(iL0, i11);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.A();
            }
            int iW = this.reader.w();
            if (iW > 0) {
                this.changeListWriter.X(iW);
            }
            this.changeListWriter.g();
            int parent4 = this.reader.getParent();
            if (i11 != x1(parent4)) {
                t1(parent4, i11);
            }
            if (isNode) {
                i11 = 1;
            }
            this.reader.g();
            this.changeListWriter.i();
        }
        z0(i11, inserting);
    }

    private final void t1(int group, int newCount) {
        int iX1 = x1(group);
        if (iX1 != newCount) {
            int i11 = newCount - iX1;
            int iB = this.pendingStack.b() - 1;
            while (group != -1) {
                int iX2 = x1(group) + i11;
                s1(group, iX2);
                for (int i12 = iB; -1 < i12; i12--) {
                    y1 y1VarF = this.pendingStack.f(i12);
                    if (y1VarF != null && y1VarF.n(group, iX2)) {
                        iB = i12 - 1;
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.J(group)) {
                    return;
                } else {
                    group = this.reader.P(group);
                }
            }
        }
    }

    private final void u0() {
        t0(false);
    }

    private final z1 u1(z1 parentScope, z1 currentProviders) {
        z1.a aVarBuilder = parentScope.builder();
        aVarBuilder.putAll(currentProviders);
        z1 z1VarBuild = aVarBuilder.build();
        m1(EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, o.E());
        v1(z1VarBuild);
        v1(currentProviders);
        u0();
        return z1VarBuild;
    }

    private final void v1(Object value) {
        O0();
        w1(value);
    }

    private final void w0() {
        u0();
        this.parentContext.c();
        u0();
        this.changeListWriter.k();
        A0();
        this.reader.d();
        this.forciblyRecompose = false;
        this.providersInvalid = o.o(this.providersInvalidStack.i());
    }

    private final void x0() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterW = this.insertTable.w();
            this.writer = slotWriterW;
            slotWriterW.Z0();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final int x1(int group) {
        int i11;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i11 = iArr[group]) < 0) ? this.reader.N(group) : i11;
        }
        a0 a0Var = this.nodeCountVirtualOverrides;
        if (a0Var == null || !a0Var.a(group)) {
            return 0;
        }
        return a0Var.c(group);
    }

    private final void y0(boolean isNode, y1 newPending) {
        this.pendingStack.h(this.pending);
        this.pending = newPending;
        this.parentStateStack.j(this.groupNodeCount);
        this.parentStateStack.j(this.rGroupIndex);
        this.parentStateStack.j(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void y1() {
        if (!this.nodeExpected) {
            o.s("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void z0(int expectedNodeCount, boolean inserting) {
        y1 y1VarG = this.pendingStack.g();
        if (y1VarG != null && !inserting) {
            y1VarG.l(y1VarG.getGroupIndex() + 1);
        }
        this.pending = y1VarG;
        this.nodeIndex = this.parentStateStack.i() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.i();
        this.groupNodeCount = this.parentStateStack.i() + expectedNodeCount;
    }

    private final void z1() {
        if (this.nodeExpected) {
            o.s("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    @Override // p020r2.l
    public CoroutineContext A() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // p020r2.l
    public void B(Object value) {
        r1(value);
    }

    @Override // p020r2.l
    public void C() {
        u0();
        j2 j2VarE0 = E0();
        if (j2VarE0 == null || !j2VarE0.q()) {
            return;
        }
        j2VarE0.B(true);
    }

    public final boolean C0() {
        return this.childrenComposing > 0;
    }

    @Override // p020r2.l
    public void D() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.j();
        this.insertTable.j();
        this.writer.y1();
    }

    /* JADX INFO: renamed from: D0, reason: from getter */
    public e0 getComposition() {
        return this.composition;
    }

    @Override // p020r2.l
    public void E(wn0.a<h0> effect) {
        this.changeListWriter.V(effect);
    }

    public final j2 E0() {
        x3<j2> x3Var = this.invalidateStack;
        if (this.childrenComposing == 0 && x3Var.d()) {
            return x3Var.e();
        }
        return null;
    }

    @Override // p020r2.l
    public i2 F() {
        return E0();
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final s2.a getDeferredChanges() {
        return this.deferredChanges;
    }

    @Override // p020r2.l
    public void G() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        t0(false);
    }

    @Override // p020r2.l
    public void H(int key) {
        k1(key, null, s0.INSTANCE.a(), null);
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // p020r2.l
    public Object I() {
        return P0();
    }

    @Override // p020r2.l
    public c3.a J() {
        return this.slotTable;
    }

    @Override // p020r2.l
    public boolean K(Object value) {
        if (O0() == value) {
            return false;
        }
        w1(value);
        return true;
    }

    public void K0(List<Pair<k1, k1>> references) {
        try {
            J0(references);
            i0();
        } catch (Throwable th2) {
            V();
            throw th2;
        }
    }

    @Override // p020r2.l
    public void L() {
        k1(RangingPosition.RSSI_MIN, null, s0.INSTANCE.a(), null);
    }

    @Override // p020r2.l
    public void M(int key, Object dataKey) {
        k1(key, dataKey, s0.INSTANCE.a(), null);
    }

    @Override // p020r2.l
    public void N(h2<?>[] values) {
        z1 z1VarU1;
        z1 z1VarN0 = n0();
        m1(EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, o.D());
        boolean z11 = true;
        boolean z12 = false;
        if (getInserting()) {
            z1VarU1 = u1(z1VarN0, y.d(values, z1VarN0, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objA = this.reader.A(0);
            s.i(objA, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            z1 z1Var = (z1) objA;
            Object objA2 = this.reader.A(1);
            s.i(objA2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            z1 z1Var2 = (z1) objA2;
            z1 z1VarC = y.c(values, z1VarN0, z1Var2);
            if (b() && !this.reusing && s.f(z1Var2, z1VarC)) {
                i1();
                z1VarU1 = z1Var;
            } else {
                z1VarU1 = u1(z1VarN0, z1VarC);
                if (!this.reusing && s.f(z1VarU1, z1Var)) {
                    z11 = false;
                }
                z12 = z11;
            }
        }
        if (z12 && !getInserting()) {
            a1(z1VarU1);
        }
        this.providersInvalidStack.j(o.p(this.providersInvalid));
        this.providersInvalid = z12;
        this.providerCache = z1VarU1;
        k1(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, o.A(), s0.INSTANCE.a(), z1VarU1);
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    @Override // p020r2.l
    public void O(h2<?> value) {
        e4<?> e4Var;
        z1 z1VarN0 = n0();
        m1(EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, o.D());
        Object objI = I();
        if (s.f(objI, l.INSTANCE.a())) {
            e4Var = null;
        } else {
            s.i(objI, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            e4Var = (e4) objI;
        }
        u<?> uVarB = value.b();
        s.i(uVarB, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        s.i(value, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        e4<?> e4VarB = uVarB.b(value, e4Var);
        boolean zF = s.f(e4VarB, e4Var);
        if (!zF) {
            B(e4VarB);
        }
        boolean z11 = true;
        boolean z12 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !y.a(z1VarN0, uVarB)) {
                z1VarN0 = z1VarN0.f(uVarB, e4VarB);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objZ = slotReader.z(slotReader.getCurrent());
            s.i(objZ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            z1 z1Var = (z1) objZ;
            z1VarN0 = (!(b() && zF) && (value.getCanOverride() || !y.a(z1VarN0, uVarB))) ? z1VarN0.f(uVarB, e4VarB) : z1Var;
            if (!this.reusing && z1Var == z1VarN0) {
                z11 = false;
            }
            z12 = z11;
        }
        if (z12 && !getInserting()) {
            a1(z1VarN0);
        }
        this.providersInvalidStack.j(o.p(this.providersInvalid));
        this.providersInvalid = z12;
        this.providerCache = z1VarN0;
        k1(EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, o.A(), s0.INSTANCE.a(), z1VarN0);
    }

    public final Object O0() {
        if (getInserting()) {
            z1();
            return l.INSTANCE.a();
        }
        Object objK = this.reader.K();
        return (!this.reusing || (objK instanceof u2)) ? objK : l.INSTANCE.a();
    }

    @Override // p020r2.l
    public void P(i2 scope) {
        j2 j2Var = scope instanceof j2 ? (j2) scope : null;
        if (j2Var == null) {
            return;
        }
        j2Var.H(true);
    }

    public final Object P0() {
        if (getInserting()) {
            z1();
            return l.INSTANCE.a();
        }
        Object objK = this.reader.K();
        if (!this.reusing || (objK instanceof u2)) {
            return objK instanceof s2 ? ((s2) objK).getWrapped() : objK;
        }
        return l.INSTANCE.a();
    }

    @Override // p020r2.l
    public void Q() {
        u0();
        u0();
        this.providersInvalid = o.o(this.providersInvalidStack.i());
        this.providerCache = null;
    }

    @Override // p020r2.l
    /* JADX INFO: renamed from: R, reason: from getter */
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // p020r2.l
    public void S() {
        u0();
    }

    public final void S0(wn0.a<h0> block) {
        if (this.isComposing) {
            o.s("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    @Override // p020r2.l
    public void T() {
        u0();
    }

    @Override // p020r2.l
    public <T> T U(u<T> key) {
        return (T) y.b(n0(), key);
    }

    public final boolean U0(t2.f<j2, Object> invalidationsRequested) {
        if (!this.changes.c()) {
            o.s("Expected applyChanges() to have been called");
        }
        if (invalidationsRequested.e() <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        r0(invalidationsRequested, null);
        return this.changes.d();
    }

    @Override // p020r2.l
    public void a(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            o.s("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            j1();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        this.changeListWriter.d();
        o.P(this.invalidations, current, end);
        this.reader.T();
    }

    @Override // p020r2.l
    public boolean b() {
        j2 j2VarE0;
        return (getInserting() || this.reusing || this.providersInvalid || (j2VarE0 = E0()) == null || j2VarE0.n() || this.forciblyRecompose) ? false : true;
    }

    @Override // p020r2.l
    public x c() {
        return n0();
    }

    @Override // p020r2.l
    public void d() {
        y1();
        if (getInserting()) {
            o.s("useNode() called while inserting");
        }
        Object objG0 = G0(this.reader);
        this.changeListWriter.w(objG0);
        if (this.reusing && (objG0 instanceof k)) {
            this.changeListWriter.c0(objG0);
        }
    }

    @Override // p020r2.l
    public void e() {
        u0();
        u0();
        this.providersInvalid = o.o(this.providersInvalidStack.i());
        this.providerCache = null;
    }

    @Override // p020r2.l
    public <V, T> void f(V value, p<? super T, ? super V, h0> block) {
        if (getInserting()) {
            this.insertFixups.f(value, block);
        } else {
            this.changeListWriter.a0(value, block);
        }
    }

    @Override // p020r2.l
    public void g() {
        t0(true);
    }

    public final void g1(SlotReader slotReader) {
        this.reader = slotReader;
    }

    @Override // p020r2.l
    public void h() {
        k1(125, null, s0.INSTANCE.c(), null);
        this.nodeExpected = true;
    }

    public final void h0() {
        this.providerUpdates = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0085  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    public void h1() {
        int iRotateLeft;
        if (this.invalidations.isEmpty()) {
            i1();
            return;
        }
        SlotReader slotReader = this.reader;
        int iN = slotReader.n();
        Object objO = slotReader.o();
        Object objL = slotReader.l();
        int i11 = this.rGroupIndex;
        if (objO == null) {
            if (objL == null || iN != 207 || s.f(objL, l.INSTANCE.a())) {
                iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ iN, 3) ^ i11;
            } else {
                this.compoundKeyHash = Integer.rotateLeft(objL.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i11;
            }
            n1(slotReader.I(), null);
            X0();
            slotReader.g();
            if (objO != null) {
                if (objO instanceof Enum) {
                    this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(((Enum) objO).ordinal()) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                } else {
                    this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(objO.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                }
            }
            if (objL != null || iN != 207 || s.f(objL, l.INSTANCE.a())) {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(getCompoundKeyHash() ^ i11, 3) ^ Integer.hashCode(iN), 3);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(objL.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash() ^ i11, 3), 3);
                return;
            }
        }
        iRotateLeft = Integer.rotateLeft((objO instanceof Enum ? ((Enum) objO).ordinal() : objO.hashCode()) ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
        this.compoundKeyHash = iRotateLeft;
        n1(slotReader.I(), null);
        X0();
        slotReader.g();
        if (objO != null) {
            if (objL != null) {
            }
            this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(getCompoundKeyHash() ^ i11, 3) ^ Integer.hashCode(iN), 3);
        } else if (objO instanceof Enum) {
            this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(((Enum) objO).ordinal()) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
        } else {
            this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(objO.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
        }
    }

    @Override // p020r2.l
    public void i(int key, Object dataKey) {
        if (!getInserting() && this.reader.n() == key && !s.f(this.reader.l(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        k1(key, null, s0.INSTANCE.a(), dataKey);
    }

    @Override // p020r2.l
    public void j() {
        if (!(this.groupNodeCount == 0)) {
            o.s("No nodes can be emitted before calling skipAndEndGroup");
        }
        j2 j2VarE0 = E0();
        if (j2VarE0 != null) {
            j2VarE0.z();
        }
        if (this.invalidations.isEmpty()) {
            j1();
        } else {
            X0();
        }
    }

    @Override // p020r2.l
    public boolean k() {
        j2 j2VarE0;
        return !b() || this.providersInvalid || ((j2VarE0 = E0()) != null && j2VarE0.l());
    }

    public final void k0(t2.f<j2, Object> invalidationsRequested, p<? super l, ? super Integer, h0> content) {
        if (!this.changes.c()) {
            o.s("Expected applyChanges() to have been called");
        }
        r0(invalidationsRequested, content);
    }

    @Override // p020r2.l
    public void l() {
        u0();
    }

    @Override // p020r2.l
    public q m() {
        m1(EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, o.F());
        if (getInserting()) {
            SlotWriter.v0(this.writer, 0, 1, null);
        }
        Object objO0 = O0();
        a aVar = objO0 instanceof a ? (a) objO0 : null;
        if (aVar == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z11 = this.forceRecomposeScopes;
            boolean z12 = this.sourceMarkersEnabled;
            e0 composition = getComposition();
            s sVar = composition instanceof s ? (s) composition : null;
            aVar = new a(new b(compoundKeyHash, z11, z12, sVar != null ? sVar.getObserverHolder() : null));
            w1(aVar);
        }
        aVar.getRef().y(n0());
        u0();
        return aVar.getRef();
    }

    @Override // p020r2.l
    public boolean n(Object value) {
        if (s.f(O0(), value)) {
            return false;
        }
        w1(value);
        return true;
    }

    @Override // p020r2.l
    public void o(int key) {
        if (this.pending != null) {
            k1(key, null, s0.INSTANCE.a(), null);
            return;
        }
        z1();
        this.compoundKeyHash = this.rGroupIndex ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ key, 3);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.c();
            this.writer.k1(key, l.INSTANCE.a());
            y0(false, null);
            return;
        }
        if (slotReader.n() == key && !slotReader.s()) {
            slotReader.U();
            y0(false, null);
            return;
        }
        if (!slotReader.H()) {
            int i11 = this.nodeIndex;
            int current = slotReader.getCurrent();
            Y0();
            this.changeListWriter.Q(i11, slotReader.S());
            o.P(this.invalidations, current, slotReader.getCurrent());
        }
        slotReader.c();
        this.inserting = true;
        this.providerCache = null;
        x0();
        SlotWriter slotWriter = this.writer;
        slotWriter.I();
        int currentGroup = slotWriter.getCurrentGroup();
        slotWriter.k1(key, l.INSTANCE.a());
        this.insertAnchor = slotWriter.E(currentGroup);
        y0(false, null);
    }

    public final void o1() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    @Override // p020r2.l
    public boolean p(boolean value) {
        Object objO0 = O0();
        if ((objO0 instanceof Boolean) && value == ((Boolean) objO0).booleanValue()) {
            return false;
        }
        w1(Boolean.valueOf(value));
        return true;
    }

    public final void p0() {
        this.invalidateStack.a();
        this.invalidations.clear();
        this.changes.a();
        this.providerUpdates = null;
    }

    @Override // p020r2.l
    public boolean q(float value) {
        Object objO0 = O0();
        if ((objO0 instanceof Float) && value == ((Number) objO0).floatValue()) {
            return false;
        }
        w1(Float.valueOf(value));
        return true;
    }

    public final void q0() {
        Object objA = c4.f106500a.a("Compose:Composer.dispose");
        try {
            this.parentContext.s(this);
            p0();
            w().clear();
            this.isDisposed = true;
            h0 h0Var = h0.f84049a;
        } finally {
            c4.f106500a.b(objA);
        }
    }

    public final boolean q1(j2 scope, Object instance) {
        p020r2.d anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int iD = anchor.d(this.reader.getTable());
        if (!this.isComposing || iD < this.reader.getCurrent()) {
            return false;
        }
        o.G(this.invalidations, iD, scope, instance);
        return true;
    }

    @Override // p020r2.l
    public boolean r(int value) {
        Object objO0 = O0();
        if ((objO0 instanceof Integer) && value == ((Number) objO0).intValue()) {
            return false;
        }
        w1(Integer.valueOf(value));
        return true;
    }

    public final void r1(Object value) {
        if (value instanceof r2) {
            if (getInserting()) {
                this.changeListWriter.O((r2) value);
            }
            this.abandonSet.add(value);
            value = new s2((r2) value, c1());
        }
        w1(value);
    }

    @Override // p020r2.l
    public boolean s(long value) {
        Object objO0 = O0();
        if ((objO0 instanceof Long) && value == ((Number) objO0).longValue()) {
            return false;
        }
        w1(Long.valueOf(value));
        return true;
    }

    @Override // p020r2.l
    public boolean t(char value) {
        Object objO0 = O0();
        if ((objO0 instanceof Character) && value == ((Character) objO0).charValue()) {
            return false;
        }
        w1(Character.valueOf(value));
        return true;
    }

    @Override // p020r2.l
    /* JADX INFO: renamed from: u, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // p020r2.l
    public l v(int key) {
        o(key);
        g0();
        return this;
    }

    public final void v0() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            a2.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // p020r2.l
    public p020r2.f<?> w() {
        return this.applier;
    }

    public final void w1(Object value) {
        if (getInserting()) {
            this.writer.p1(value);
            return;
        }
        if (!this.reader.getHadNext()) {
            s2.b bVar = this.changeListWriter;
            SlotReader slotReader = this.reader;
            bVar.a(slotReader.a(slotReader.getParent()), value);
            return;
        }
        int iQ = this.reader.q() - 1;
        if (!this.changeListWriter.q()) {
            this.changeListWriter.b0(value, iQ);
            return;
        }
        s2.b bVar2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        bVar2.Y(value, slotReader2.a(slotReader2.getParent()), iQ);
    }

    @Override // p020r2.l
    public w2 x() {
        p020r2.d dVarA;
        l<p, h0> lVarH;
        j2 j2Var = null;
        j2 j2VarG = this.invalidateStack.d() ? this.invalidateStack.g() : null;
        if (j2VarG != null) {
            j2VarG.E(false);
        }
        if (j2VarG != null && (lVarH = j2VarG.h(this.compositionToken)) != null) {
            this.changeListWriter.f(lVarH, getComposition());
        }
        if (j2VarG != null && !j2VarG.p() && (j2VarG.q() || this.forceRecomposeScopes)) {
            if (j2VarG.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    dVarA = slotWriter.E(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    dVarA = slotReader.a(slotReader.getParent());
                }
                j2VarG.A(dVarA);
            }
            j2VarG.C(false);
            j2Var = j2VarG;
        }
        t0(false);
        return j2Var;
    }

    @Override // p020r2.l
    public void y() {
        k1(125, null, s0.INSTANCE.b(), null);
        this.nodeExpected = true;
    }

    @Override // p020r2.l
    public <T> void z(wn0.a<? extends T> factory) {
        y1();
        if (!getInserting()) {
            o.s("createNode() can only be called when inserting");
        }
        int iE = this.parentStateStack.e();
        SlotWriter slotWriter = this.writer;
        p020r2.d dVarE = slotWriter.E(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.b(factory, iE, dVarE);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr2/m$a;", "Lr2/u2;", "Lr2/m$b;", "Lr2/m;", ActionConst.REF_ATTRIBUTE, "<init>", "(Lr2/m$b;)V", "Ljn0/h0;", "onRemembered", "()V", "onAbandoned", "onForgotten", "a", "Lr2/m$b;", "()Lr2/m$b;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a implements u2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b ref;

        public a(b bVar) {
            this.ref = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getRef() {
            return this.ref;
        }

        @Override // p020r2.r2
        public void onAbandoned() {
            this.ref.u();
        }

        @Override // p020r2.r2
        public void onForgotten() {
            this.ref.u();
        }

        @Override // p020r2.r2
        public void onRemembered() {
        }
    }
}
