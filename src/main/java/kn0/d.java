package kn0;

import bo0.n;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006bghideBG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0001\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u001aJ\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010 J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00028\u0001H\u0002¢\u0006\u0004\b*\u0010 J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u0013J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0013J\u001f\u00101\u001a\u00020\u00182\u000e\u00100\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030/H\u0002¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\u00182\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0002¢\u0006\u0004\b5\u00106J)\u00109\u001a\u00020\u00182\u0018\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010307H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0018H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00182\u0006\u0010)\u001a\u00028\u0001H\u0016¢\u0006\u0004\bA\u0010@J\u001a\u0010B\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bB\u0010CJ!\u0010D\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0001H\u0016¢\u0006\u0004\bD\u0010EJ%\u0010F\u001a\u00020\u00142\u0014\u00108\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/H\u0016¢\u0006\u0004\bF\u0010GJ\u0019\u0010H\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bH\u0010CJ\u000f\u0010I\u001a\u00020\u0014H\u0016¢\u0006\u0004\bI\u0010\u0011J\u001a\u0010K\u001a\u00020\u00182\b\u00100\u001a\u0004\u0018\u00010JH\u0096\u0002¢\u0006\u0004\bK\u0010@J\u000f\u0010L\u001a\u00020\fH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0014H\u0000¢\u0006\u0004\bQ\u0010\u0011J\u0017\u0010R\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00028\u0000H\u0000¢\u0006\u0004\bR\u0010 J\u0017\u0010S\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00028\u0000H\u0000¢\u0006\u0004\bS\u0010@J#\u0010T\u001a\u00020\u00182\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0000¢\u0006\u0004\bT\u00106J\u001b\u0010U\u001a\u00020\u00182\n\u0010R\u001a\u0006\u0012\u0002\b\u000307H\u0000¢\u0006\u0004\bU\u0010:J#\u0010V\u001a\u00020\u00182\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0000¢\u0006\u0004\bV\u00106J\u0017\u0010X\u001a\u00020\u00182\u0006\u0010W\u001a\u00028\u0001H\u0000¢\u0006\u0004\bX\u0010@J\u001b\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010YH\u0000¢\u0006\u0004\bZ\u0010[J\u001b\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\\H\u0000¢\u0006\u0004\b]\u0010^J\u001b\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_H\u0000¢\u0006\u0004\b`\u0010aR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010cR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u00105R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u00105R\u0016\u0010k\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u00105R\u0016\u0010m\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u00105R$\u0010o\u001a\u00020\f2\u0006\u0010)\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\bn\u0010MR\u001e\u0010s\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001e\u0010w\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR$\u0010{\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR$\u0010~\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010|\u001a\u0004\b}\u0010>R\u0015\u0010\u0080\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010MR\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0085\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R+\u0010\u008b\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0089\u00010\u0081\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0083\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010M¨\u0006\u008e\u0001"}, d2 = {"Lkn0/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "Ljn0/h0;", "n", "v", "extraCapacity", "", "R", "(I)Z", "minCapacity", "u", "()[Ljava/lang/Object;", Action.KEY_ATTRIBUTE, Gender.FEMALE, "(Ljava/lang/Object;)I", "updateHashArray", "q", "(Z)V", "newHashSize", "L", IntegerTokenConverter.CONVERTER_KEY, "J", "x", "value", "y", "index", Gender.NONE, "removedHash", Gender.OTHER, "", "other", "t", "(Ljava/util/Map;)Z", "", "entry", "I", "(Ljava/util/Map$Entry;)Z", "", "from", "H", "(Ljava/util/Collection;)Z", "o", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "p", "m", "P", "s", "r", Gender.MALE, "element", "Q", "Lkn0/d$e;", "G", "()Lkn0/d$e;", "Lkn0/d$f;", "S", "()Lkn0/d$f;", "Lkn0/d$b;", "w", "()Lkn0/d$b;", "a", "[Ljava/lang/Object;", "b", "c", "[I", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "hashShift", "h", "modCount", "D", "size", "Lkn0/f;", "j", "Lkn0/f;", "keysView", "Lkn0/g;", "k", "Lkn0/g;", "valuesView", "Lkn0/e;", "l", "Lkn0/e;", "entriesView", "Z", "isReadOnly$kotlin_stdlib", "isReadOnly", "B", "hashSize", "", "C", "()Ljava/util/Set;", "keys", "", "E", "()Ljava/util/Collection;", "values", "", "A", "entries", "z", "capacity", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<K, V> implements Map<K, V>, Serializable, xn0.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final d f86347o;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private K[] keysArray;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V[] valuesArray;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int[] presenceArray;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int[] hashArray;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int maxProbeDistance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int hashShift;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private kn0.f<K> keysView;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private g<V> valuesView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private kn0.e<K, V> entriesView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    /* JADX INFO: renamed from: kn0.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lkn0/d$a;", "", "<init>", "()V", "", "capacity", "c", "(I)I", "hashSize", DateTokenConverter.CONVERTER_KEY, "Lkn0/d;", "", "Empty", "Lkn0/d;", "e", "()Lkn0/d;", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int capacity) {
            return Integer.highestOneBit(n.f(capacity, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        public final d e() {
            return d.f86347o;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkn0/d$b;", "K", "V", "Lkn0/d$d;", "", "", "Lkn0/d;", "map", "<init>", "(Lkn0/d;)V", "Lkn0/d$c;", "l", "()Lkn0/d$c;", "", "n", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Ljn0/h0;", "m", "(Ljava/lang/StringBuilder;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<K, V> extends C1853d<K, V> implements Iterator<Map.Entry<K, V>>, xn0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<K, V> map) {
            super(map);
            s.k(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            b();
            if (getIndex() >= ((d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            c<K, V> cVar = new c<>(h(), getLastIndex());
            i();
            return cVar;
        }

        public final void m(StringBuilder sb2) {
            s.k(sb2, "sb");
            if (getIndex() >= ((d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            Object obj = ((d) h()).keysArray[getLastIndex()];
            if (obj == h()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = ((d) h()).valuesArray;
            s.h(objArr);
            Object obj2 = objArr[getLastIndex()];
            if (obj2 == h()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            i();
        }

        public final int n() {
            if (getIndex() >= ((d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            Object obj = ((d) h()).keysArray[getLastIndex()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((d) h()).valuesArray;
            s.h(objArr);
            Object obj2 = objArr[getLastIndex()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            i();
            return iHashCode2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lkn0/d$c;", "K", "V", "", "Lkn0/d;", "map", "", "index", "<init>", "(Lkn0/d;I)V", "Ljn0/h0;", "b", "()V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lkn0/d;", "I", "c", "expectedModCount", "getKey", "()Ljava/lang/Object;", Action.KEY_ATTRIBUTE, "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<K, V> implements Map.Entry<K, V>, xn0.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d<K, V> map;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int expectedModCount;

        public c(d<K, V> map, int i11) {
            s.k(map, "map");
            this.map = map;
            this.index = i11;
            this.expectedModCount = ((d) map).modCount;
        }

        private final void b() {
            if (((d) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return s.f(entry.getKey(), getKey()) && s.f(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            b();
            return (K) ((d) this.map).keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            b();
            Object[] objArr = ((d) this.map).valuesArray;
            s.h(objArr);
            return (V) objArr[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            b();
            this.map.p();
            Object[] objArrN = this.map.n();
            int i11 = this.index;
            V v11 = (V) objArrN[i11];
            objArrN[i11] = newValue;
            return v11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: kn0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006 "}, d2 = {"Lkn0/d$d;", "K", "V", "", "Lkn0/d;", "map", "<init>", "(Lkn0/d;)V", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "()V", "", "hasNext", "()Z", "remove", "b", "a", "Lkn0/d;", "h", "()Lkn0/d;", "", "I", DateTokenConverter.CONVERTER_KEY, "()I", "j", "(I)V", "index", "c", "e", "k", "lastIndex", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class C1853d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d<K, V> map;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int lastIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public C1853d(d<K, V> map) {
            s.k(map, "map");
            this.map = map;
            this.lastIndex = -1;
            this.expectedModCount = ((d) map).modCount;
            i();
        }

        public final void b() {
            if (((d) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        public final d<K, V> h() {
            return this.map;
        }

        public final boolean hasNext() {
            return this.index < ((d) this.map).length;
        }

        public final void i() {
            while (this.index < ((d) this.map).length) {
                int[] iArr = ((d) this.map).presenceArray;
                int i11 = this.index;
                if (iArr[i11] >= 0) {
                    return;
                } else {
                    this.index = i11 + 1;
                }
            }
        }

        public final void j(int i11) {
            this.index = i11;
        }

        public final void k(int i11) {
            this.lastIndex = i11;
        }

        public final void remove() {
            b();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.map.p();
            this.map.N(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = ((d) this.map).modCount;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkn0/d$e;", "K", "V", "Lkn0/d$d;", "", "Lkn0/d;", "map", "<init>", "(Lkn0/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e<K, V> extends C1853d<K, V> implements Iterator<K>, xn0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d<K, V> map) {
            super(map);
            s.k(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            b();
            if (getIndex() >= ((d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            K k11 = (K) ((d) h()).keysArray[getLastIndex()];
            i();
            return k11;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkn0/d$f;", "K", "V", "Lkn0/d$d;", "", "Lkn0/d;", "map", "<init>", "(Lkn0/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<K, V> extends C1853d<K, V> implements Iterator<V>, xn0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d<K, V> map) {
            super(map);
            s.k(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            b();
            if (getIndex() >= ((d) h()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            j(index + 1);
            k(index);
            Object[] objArr = ((d) h()).valuesArray;
            s.h(objArr);
            V v11 = (V) objArr[getLastIndex()];
            i();
            return v11;
        }
    }

    static {
        d dVar = new d(0);
        dVar.isReadOnly = true;
        f86347o = dVar;
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i11, int i12) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i11;
        this.length = i12;
        this.hashShift = INSTANCE.d(B());
    }

    private final int B() {
        return this.hashArray.length;
    }

    private final int F(K key) {
        return ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final boolean H(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z11 = false;
        if (from.isEmpty()) {
            return false;
        }
        v(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (I(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    private final boolean I(Map.Entry<? extends K, ? extends V> entry) {
        int iM = m(entry.getKey());
        V[] vArrN = n();
        if (iM >= 0) {
            vArrN[iM] = entry.getValue();
            return true;
        }
        int i11 = (-iM) - 1;
        if (s.f(entry.getValue(), vArrN[i11])) {
            return false;
        }
        vArrN[i11] = entry.getValue();
        return true;
    }

    private final boolean J(int i11) {
        int iF = F(this.keysArray[i11]);
        int i12 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iF] == 0) {
                iArr[iF] = i11 + 1;
                this.presenceArray[i11] = iF;
                return true;
            }
            i12--;
            if (i12 < 0) {
                return false;
            }
            iF = iF == 0 ? B() - 1 : iF - 1;
        }
    }

    private final void K() {
        this.modCount++;
    }

    private final void L(int newHashSize) {
        K();
        int i11 = 0;
        if (this.length > size()) {
            q(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.d(newHashSize);
        while (i11 < this.length) {
            int i12 = i11 + 1;
            if (!J(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(int index) {
        kn0.c.f(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            kn0.c.f(vArr, index);
        }
        O(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        K();
    }

    private final void O(int removedHash) {
        int iJ = n.j(this.maxProbeDistance * 2, B() / 2);
        int i11 = 0;
        int i12 = removedHash;
        do {
            removedHash = removedHash == 0 ? B() - 1 : removedHash - 1;
            i11++;
            if (i11 > this.maxProbeDistance) {
                this.hashArray[i12] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i13 = iArr[removedHash];
            if (i13 == 0) {
                iArr[i12] = 0;
                return;
            }
            if (i13 < 0) {
                iArr[i12] = -1;
            } else {
                int i14 = i13 - 1;
                if (((F(this.keysArray[i14]) - removedHash) & (B() - 1)) >= i11) {
                    this.hashArray[i12] = i13;
                    this.presenceArray[i14] = i12;
                }
                iJ--;
            }
            i12 = removedHash;
            i11 = 0;
            iJ--;
        } while (iJ >= 0);
        this.hashArray[i12] = -1;
    }

    private final boolean R(int extraCapacity) {
        int iZ = z();
        int i11 = this.length;
        int i12 = iZ - i11;
        int size = i11 - size();
        return i12 < extraCapacity && i12 + size >= extraCapacity && size >= z() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] n() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) kn0.c.d(z());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void q(boolean updateHashArray) {
        int i11;
        V[] vArr = this.valuesArray;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i11 = this.length;
            if (i12 >= i11) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i14 = iArr[i12];
            if (i14 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i13] = kArr[i12];
                if (vArr != null) {
                    vArr[i13] = vArr[i12];
                }
                if (updateHashArray) {
                    iArr[i13] = i14;
                    this.hashArray[i14] = i13 + 1;
                }
                i13++;
            }
            i12++;
        }
        kn0.c.g(this.keysArray, i13, i11);
        if (vArr != null) {
            kn0.c.g(vArr, i13, this.length);
        }
        this.length = i13;
    }

    private final boolean t(Map<?, ?> other) {
        return size() == other.size() && r(other.entrySet());
    }

    private final void u(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > z()) {
            int iE = p013kotlin.collections.d.INSTANCE.e(z(), minCapacity);
            this.keysArray = (K[]) kn0.c.e(this.keysArray, iE);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) kn0.c.e(vArr, iE) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iE);
            s.j(iArrCopyOf, "copyOf(...)");
            this.presenceArray = iArrCopyOf;
            int iC = INSTANCE.c(iE);
            if (iC > B()) {
                L(iC);
            }
        }
    }

    private final void v(int n11) {
        if (R(n11)) {
            q(true);
        } else {
            u(this.length + n11);
        }
    }

    private final int x(K key) {
        int iF = F(key);
        int i11 = this.maxProbeDistance;
        while (true) {
            int i12 = this.hashArray[iF];
            if (i12 == 0) {
                return -1;
            }
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (s.f(this.keysArray[i13], key)) {
                    return i13;
                }
            }
            i11--;
            if (i11 < 0) {
                return -1;
            }
            iF = iF == 0 ? B() - 1 : iF - 1;
        }
    }

    private final int y(V value) {
        int i11 = this.length;
        while (true) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
            if (this.presenceArray[i11] >= 0) {
                V[] vArr = this.valuesArray;
                s.h(vArr);
                if (s.f(vArr[i11], value)) {
                    return i11;
                }
            }
        }
    }

    public Set<Map.Entry<K, V>> A() {
        kn0.e<K, V> eVar = this.entriesView;
        if (eVar != null) {
            return eVar;
        }
        kn0.e<K, V> eVar2 = new kn0.e<>(this);
        this.entriesView = eVar2;
        return eVar2;
    }

    public Set<K> C() {
        kn0.f<K> fVar = this.keysView;
        if (fVar != null) {
            return fVar;
        }
        kn0.f<K> fVar2 = new kn0.f<>(this);
        this.keysView = fVar2;
        return fVar2;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public Collection<V> E() {
        g<V> gVar = this.valuesView;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.valuesView = gVar2;
        return gVar2;
    }

    public final e<K, V> G() {
        return new e<>(this);
    }

    public final boolean M(Map.Entry<? extends K, ? extends V> entry) {
        s.k(entry, "entry");
        p();
        int iX = x(entry.getKey());
        if (iX < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        s.h(vArr);
        if (!s.f(vArr[iX], entry.getValue())) {
            return false;
        }
        N(iX);
        return true;
    }

    public final boolean P(K key) {
        p();
        int iX = x(key);
        if (iX < 0) {
            return false;
        }
        N(iX);
        return true;
    }

    public final boolean Q(V element) {
        p();
        int iY = y(element);
        if (iY < 0) {
            return false;
        }
        N(iY);
        return true;
    }

    public final f<K, V> S() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        p();
        int i11 = this.length - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i13 = iArr[i12];
                if (i13 >= 0) {
                    this.hashArray[i13] = 0;
                    iArr[i12] = -1;
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        kn0.c.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            kn0.c.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        K();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return x(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return y(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return A();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Map) && t((Map) other);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int iX = x(key);
        if (iX < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        s.h(vArr);
        return vArr[iX];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarW = w();
        int iN = 0;
        while (bVarW.hasNext()) {
            iN += bVarW.n();
        }
        return iN;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return C();
    }

    public final int m(K key) {
        p();
        while (true) {
            int iF = F(key);
            int iJ = n.j(this.maxProbeDistance * 2, B() / 2);
            int i11 = 0;
            while (true) {
                int i12 = this.hashArray[iF];
                if (i12 <= 0) {
                    if (this.length >= z()) {
                        v(1);
                        break;
                    }
                    int i13 = this.length;
                    int i14 = i13 + 1;
                    this.length = i14;
                    this.keysArray[i13] = key;
                    this.presenceArray[i13] = iF;
                    this.hashArray[iF] = i14;
                    this.size = size() + 1;
                    K();
                    if (i11 > this.maxProbeDistance) {
                        this.maxProbeDistance = i11;
                    }
                    return i13;
                }
                if (s.f(this.keysArray[i12 - 1], key)) {
                    return -i12;
                }
                i11++;
                if (i11 > iJ) {
                    L(B() * 2);
                    break;
                }
                iF = iF == 0 ? B() - 1 : iF - 1;
            }
        }
    }

    public final Map<K, V> o() {
        p();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f86347o;
        s.i(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    public final void p() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        p();
        int iM = m(key);
        V[] vArrN = n();
        if (iM >= 0) {
            vArrN[iM] = value;
            return null;
        }
        int i11 = (-iM) - 1;
        V v11 = vArrN[i11];
        vArrN[i11] = value;
        return v11;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        s.k(from, "from");
        p();
        H(from.entrySet());
    }

    public final boolean r(Collection<?> m11) {
        s.k(m11, "m");
        for (Object obj : m11) {
            if (obj != null) {
                try {
                    if (!s((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        p();
        int iX = x(key);
        if (iX < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        s.h(vArr);
        V v11 = vArr[iX];
        N(iX);
        return v11;
    }

    public final boolean s(Map.Entry<? extends K, ? extends V> entry) {
        s.k(entry, "entry");
        int iX = x(entry.getKey());
        if (iX < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        s.h(vArr);
        return s.f(vArr[iX], entry.getValue());
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> bVarW = w();
        int i11 = 0;
        while (bVarW.hasNext()) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            bVarW.m(sb2);
            i11++;
        }
        sb2.append("}");
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return E();
    }

    public final b<K, V> w() {
        return new b<>(this);
    }

    public final int z() {
        return this.keysArray.length;
    }

    public d() {
        this(8);
    }

    public d(int i11) {
        this(kn0.c.d(i11), null, new int[i11], new int[INSTANCE.c(i11)], 2, 0);
    }
}
