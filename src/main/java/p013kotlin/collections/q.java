package p013kotlin.collections;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0014\u001a\u00020\n*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015\u001aS\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a9\u0010\u001c\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\t*\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010!\u001a\u00020 *\u00020 2\u0006\u0010\u0016\u001a\u00020 2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b!\u0010\"\u001a9\u0010#\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b#\u0010$\u001a9\u0010&\u001a\u00020%*\u00020%2\u0006\u0010\u0016\u001a\u00020%2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\nH\u0007¢\u0006\u0004\b&\u0010'\u001a5\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0001¢\u0006\u0004\b(\u0010)\u001a#\u0010*\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0001¢\u0006\u0004\b*\u0010+\u001a#\u0010,\u001a\u00020\r*\u00020\r2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0001¢\u0006\u0004\b,\u0010-\u001a9\u0010/\u001a\u00020.\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00028\u00002\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b/\u00100\u001a-\u00101\u001a\u00020.*\u00020\t2\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b1\u00102\u001a-\u00104\u001a\u00020.*\u00020 2\u0006\u0010\u0011\u001a\u0002032\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b4\u00105\u001a-\u00108\u001a\u00020.*\u0002062\u0006\u0010\u0011\u001a\u0002072\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b8\u00109\u001a.\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b:\u0010;\u001a\u001c\u0010<\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010>\u001a\u00020\t*\u00020\t2\u0006\u0010\u0011\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b>\u0010?\u001a6\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010@\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\bA\u0010B\u001a\u001c\u0010C\u001a\u00020\u0005*\u00020\u00052\u0006\u0010@\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\bC\u0010D\u001a\u001c\u0010E\u001a\u00020\t*\u00020\t2\u0006\u0010@\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\bE\u0010F\u001a\u001c\u0010G\u001a\u00020 *\u00020 2\u0006\u0010@\u001a\u00020 H\u0086\u0002¢\u0006\u0004\bG\u0010H\u001a\u001c\u0010I\u001a\u00020\r*\u00020\r2\u0006\u0010@\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\bI\u0010J\u001a\u001c\u0010K\u001a\u000206*\u0002062\u0006\u0010@\u001a\u000206H\u0086\u0002¢\u0006\u0004\bK\u0010L\u001a\u001c\u0010M\u001a\u00020%*\u00020%2\u0006\u0010@\u001a\u00020%H\u0086\u0002¢\u0006\u0004\bM\u0010N\u001a\u001f\u0010O\u001a\u00020.\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bO\u0010P\u001a%\u0010Q\u001a\u00020.*\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\bQ\u0010R\u001a;\u0010V\u001a\u00020.\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010U\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Sj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`T¢\u0006\u0004\bV\u0010W\u001aO\u0010X\u001a\u00020.\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010U\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Sj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`T2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n¢\u0006\u0004\bX\u0010Y\u001a\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\t¢\u0006\u0004\bZ\u0010[\u001a\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u0002030\u0001*\u00020 ¢\u0006\u0004\b\\\u0010]\u001a\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\r¢\u0006\u0004\b^\u0010_\u001a\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002070\u0001*\u000206¢\u0006\u0004\b\u0000\u0010`¨\u0006a"}, d2 = {"T", "", "", "h", "([Ljava/lang/Object;)Ljava/util/List;", "", "", "e", "([B)Ljava/util/List;", "", "", "g", "([I)Ljava/util/List;", "", "", "f", "([F)Ljava/util/List;", "element", "fromIndex", "toIndex", IntegerTokenConverter.CONVERTER_KEY, "([FFII)I", "destination", "destinationOffset", "startIndex", "endIndex", "p", "([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;", "k", "([B[BIII)[B", "n", "([I[IIII)[I", "", "o", "([J[JIII)[J", "m", "([F[FIII)[F", "", "l", "([C[CIII)[C", "w", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "u", "([BII)[B", "v", "([FII)[F", "Ljn0/h0;", "z", "([Ljava/lang/Object;Ljava/lang/Object;II)V", "x", "([IIII)V", "", "y", "([JJII)V", "", "", "A", "([ZZII)V", Gender.MALE, "([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", Gender.FEMALE, "([BB)[B", "J", "([II)[I", "elements", Gender.NONE, "([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;", "G", "([B[B)[B", "K", "([I[I)[I", "L", "([J[J)[J", "I", "([F[F)[F", Gender.OTHER, "([Z[Z)[Z", "H", "([C[C)[C", "Q", "([Ljava/lang/Object;)V", "P", "([III)V", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "R", "([Ljava/lang/Object;Ljava/util/Comparator;)V", "S", "([Ljava/lang/Object;Ljava/util/Comparator;II)V", "V", "([I)[Ljava/lang/Integer;", "W", "([J)[Ljava/lang/Long;", Gender.UNKNOWN, "([F)[Ljava/lang/Float;", "([Z)[Ljava/lang/Boolean;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class q extends p {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"kotlin/collections/q$a", "Lkotlin/collections/d;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "h", "(B)Z", "", "index", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Byte;", "j", "(B)I", "k", DateTokenConverter.CONVERTER_KEY, "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends d<Byte> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ byte[] f86493b;

        a(byte[] bArr) {
            this.f86493b = bArr;
        }

        @Override // p013kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return h(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // p013kotlin.collections.b
        /* JADX INFO: renamed from: d */
        public int get_size() {
            return this.f86493b.length;
        }

        public boolean h(byte element) {
            return s.a0(this.f86493b, element);
        }

        @Override // p013kotlin.collections.d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Byte get(int index) {
            return Byte.valueOf(this.f86493b[index]);
        }

        @Override // p013kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return j(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // p013kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
            return this.f86493b.length == 0;
        }

        public int j(byte element) {
            return s.y0(this.f86493b, element);
        }

        public int k(byte element) {
            return s.V0(this.f86493b, element);
        }

        @Override // p013kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return k(((Number) obj).byteValue());
            }
            return -1;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"kotlin/collections/q$b", "Lkotlin/collections/d;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "c", "(I)Z", "index", "h", "(I)Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "(I)I", "j", DateTokenConverter.CONVERTER_KEY, "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends d<Integer> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f86494b;

        b(int[] iArr) {
            this.f86494b = iArr;
        }

        public boolean c(int element) {
            return s.c0(this.f86494b, element);
        }

        @Override // p013kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return c(((Number) obj).intValue());
            }
            return false;
        }

        @Override // p013kotlin.collections.b
        /* JADX INFO: renamed from: d */
        public int get_size() {
            return this.f86494b.length;
        }

        @Override // p013kotlin.collections.d, java.util.List
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer get(int index) {
            return Integer.valueOf(this.f86494b[index]);
        }

        public int i(int element) {
            return s.A0(this.f86494b, element);
        }

        @Override // p013kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return i(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // p013kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
            return this.f86494b.length == 0;
        }

        public int j(int element) {
            return s.W0(this.f86494b, element);
        }

        @Override // p013kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return j(((Number) obj).intValue());
            }
            return -1;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"kotlin/collections/q$c", "Lkotlin/collections/d;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "h", "(F)Z", "", "index", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/Float;", "j", "(F)I", "k", DateTokenConverter.CONVERTER_KEY, "()I", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends d<Float> implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float[] f86495b;

        c(float[] fArr) {
            this.f86495b = fArr;
        }

        @Override // p013kotlin.collections.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return h(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // p013kotlin.collections.b
        /* JADX INFO: renamed from: d */
        public int get_size() {
            return this.f86495b.length;
        }

        public boolean h(float element) {
            for (float f11 : this.f86495b) {
                if (Float.floatToIntBits(f11) == Float.floatToIntBits(element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p013kotlin.collections.d, java.util.List
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Float get(int index) {
            return Float.valueOf(this.f86495b[index]);
        }

        @Override // p013kotlin.collections.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return j(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // p013kotlin.collections.b, java.util.Collection
        public boolean isEmpty() {
            return this.f86495b.length == 0;
        }

        public int j(float element) {
            float[] fArr = this.f86495b;
            int length = fArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (Float.floatToIntBits(fArr[i11]) == Float.floatToIntBits(element)) {
                    return i11;
                }
            }
            return -1;
        }

        public int k(float element) {
            float[] fArr = this.f86495b;
            int length = fArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(element)) {
                        return length;
                    }
                    if (i11 >= 0) {
                        length = i11;
                    }
                }
            }
            return -1;
        }

        @Override // p013kotlin.collections.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return k(((Number) obj).floatValue());
            }
            return -1;
        }
    }

    public static final void A(boolean[] zArr, boolean z11, int i11, int i12) {
        s.k(zArr, "<this>");
        Arrays.fill(zArr, i11, i12, z11);
    }

    public static /* synthetic */ void B(int[] iArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = iArr.length;
        }
        x(iArr, i11, i12, i13);
    }

    public static /* synthetic */ void C(long[] jArr, long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = jArr.length;
        }
        y(jArr, j11, i11, i12);
    }

    public static /* synthetic */ void D(Object[] objArr, Object obj, int i11, int i12, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = objArr.length;
        }
        z(objArr, obj, i11, i12);
    }

    public static /* synthetic */ void E(boolean[] zArr, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = zArr.length;
        }
        A(zArr, z11, i11, i12);
    }

    public static byte[] F(byte[] bArr, byte b11) {
        s.k(bArr, "<this>");
        int length = bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + 1);
        bArrCopyOf[length] = b11;
        s.h(bArrCopyOf);
        return bArrCopyOf;
    }

    public static byte[] G(byte[] bArr, byte[] elements) {
        s.k(bArr, "<this>");
        s.k(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        s.h(bArrCopyOf);
        return bArrCopyOf;
    }

    public static char[] H(char[] cArr, char[] elements) {
        s.k(cArr, "<this>");
        s.k(elements, "elements");
        int length = cArr.length;
        int length2 = elements.length;
        char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
        System.arraycopy(elements, 0, cArrCopyOf, length, length2);
        s.h(cArrCopyOf);
        return cArrCopyOf;
    }

    public static float[] I(float[] fArr, float[] elements) {
        s.k(fArr, "<this>");
        s.k(elements, "elements");
        int length = fArr.length;
        int length2 = elements.length;
        float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(elements, 0, fArrCopyOf, length, length2);
        s.h(fArrCopyOf);
        return fArrCopyOf;
    }

    public static int[] J(int[] iArr, int i11) {
        s.k(iArr, "<this>");
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i11;
        s.h(iArrCopyOf);
        return iArrCopyOf;
    }

    public static int[] K(int[] iArr, int[] elements) {
        s.k(iArr, "<this>");
        s.k(elements, "elements");
        int length = iArr.length;
        int length2 = elements.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(elements, 0, iArrCopyOf, length, length2);
        s.h(iArrCopyOf);
        return iArrCopyOf;
    }

    public static long[] L(long[] jArr, long[] elements) {
        s.k(jArr, "<this>");
        s.k(elements, "elements");
        int length = jArr.length;
        int length2 = elements.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(elements, 0, jArrCopyOf, length, length2);
        s.h(jArrCopyOf);
        return jArrCopyOf;
    }

    public static <T> T[] M(T[] tArr, T t11) {
        s.k(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t11;
        s.h(tArr2);
        return tArr2;
    }

    public static <T> T[] N(T[] tArr, T[] elements) {
        s.k(tArr, "<this>");
        s.k(elements, "elements");
        int length = tArr.length;
        int length2 = elements.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(elements, 0, tArr2, length, length2);
        s.h(tArr2);
        return tArr2;
    }

    public static boolean[] O(boolean[] zArr, boolean[] elements) {
        s.k(zArr, "<this>");
        s.k(elements, "elements");
        int length = zArr.length;
        int length2 = elements.length;
        boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(elements, 0, zArrCopyOf, length, length2);
        s.h(zArrCopyOf);
        return zArrCopyOf;
    }

    public static void P(int[] iArr, int i11, int i12) {
        s.k(iArr, "<this>");
        Arrays.sort(iArr, i11, i12);
    }

    public static <T> void Q(T[] tArr) {
        s.k(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void R(T[] tArr, Comparator<? super T> comparator) {
        s.k(tArr, "<this>");
        s.k(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> void S(T[] tArr, Comparator<? super T> comparator, int i11, int i12) {
        s.k(tArr, "<this>");
        s.k(comparator, "comparator");
        Arrays.sort(tArr, i11, i12, comparator);
    }

    public static Boolean[] T(boolean[] zArr) {
        s.k(zArr, "<this>");
        Boolean[] boolArr = new Boolean[zArr.length];
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolArr[i11] = Boolean.valueOf(zArr[i11]);
        }
        return boolArr;
    }

    public static Float[] U(float[] fArr) {
        s.k(fArr, "<this>");
        Float[] fArr2 = new Float[fArr.length];
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            fArr2[i11] = Float.valueOf(fArr[i11]);
        }
        return fArr2;
    }

    public static Integer[] V(int[] iArr) {
        s.k(iArr, "<this>");
        Integer[] numArr = new Integer[iArr.length];
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        return numArr;
    }

    public static Long[] W(long[] jArr) {
        s.k(jArr, "<this>");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            lArr[i11] = Long.valueOf(jArr[i11]);
        }
        return lArr;
    }

    public static final List<Byte> e(byte[] bArr) {
        s.k(bArr, "<this>");
        return new a(bArr);
    }

    public static final List<Float> f(float[] fArr) {
        s.k(fArr, "<this>");
        return new c(fArr);
    }

    public static List<Integer> g(int[] iArr) {
        s.k(iArr, "<this>");
        return new b(iArr);
    }

    public static <T> List<T> h(T[] tArr) {
        s.k(tArr, "<this>");
        List<T> listA = t.a(tArr);
        s.j(listA, "asList(...)");
        return listA;
    }

    public static final int i(float[] fArr, float f11, int i11, int i12) {
        s.k(fArr, "<this>");
        return Arrays.binarySearch(fArr, i11, i12, f11);
    }

    public static /* synthetic */ int j(float[] fArr, float f11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = fArr.length;
        }
        return i(fArr, f11, i11, i12);
    }

    public static byte[] k(byte[] bArr, byte[] destination, int i11, int i12, int i13) {
        s.k(bArr, "<this>");
        s.k(destination, "destination");
        System.arraycopy(bArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static char[] l(char[] cArr, char[] destination, int i11, int i12, int i13) {
        s.k(cArr, "<this>");
        s.k(destination, "destination");
        System.arraycopy(cArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static float[] m(float[] fArr, float[] destination, int i11, int i12, int i13) {
        s.k(fArr, "<this>");
        s.k(destination, "destination");
        System.arraycopy(fArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static int[] n(int[] iArr, int[] destination, int i11, int i12, int i13) {
        s.k(iArr, "<this>");
        s.k(destination, "destination");
        System.arraycopy(iArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static long[] o(long[] jArr, long[] destination, int i11, int i12, int i13) {
        s.k(jArr, "<this>");
        s.k(destination, "destination");
        System.arraycopy(jArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static <T> T[] p(T[] tArr, T[] destination, int i11, int i12, int i13) {
        s.k(tArr, "<this>");
        s.k(destination, "destination");
        System.arraycopy(tArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static /* synthetic */ byte[] q(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = bArr.length;
        }
        return k(bArr, bArr2, i11, i12, i13);
    }

    public static /* synthetic */ float[] r(float[] fArr, float[] fArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = fArr.length;
        }
        return m(fArr, fArr2, i11, i12, i13);
    }

    public static /* synthetic */ int[] s(int[] iArr, int[] iArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = iArr.length;
        }
        return n(iArr, iArr2, i11, i12, i13);
    }

    public static /* synthetic */ Object[] t(Object[] objArr, Object[] objArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = objArr.length;
        }
        return p(objArr, objArr2, i11, i12, i13);
    }

    public static byte[] u(byte[] bArr, int i11, int i12) {
        s.k(bArr, "<this>");
        o.c(i12, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i11, i12);
        s.j(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static final float[] v(float[] fArr, int i11, int i12) {
        s.k(fArr, "<this>");
        o.c(i12, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i11, i12);
        s.j(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static <T> T[] w(T[] tArr, int i11, int i12) {
        s.k(tArr, "<this>");
        o.c(i12, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i11, i12);
        s.j(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static final void x(int[] iArr, int i11, int i12, int i13) {
        s.k(iArr, "<this>");
        Arrays.fill(iArr, i12, i13, i11);
    }

    public static final void y(long[] jArr, long j11, int i11, int i12) {
        s.k(jArr, "<this>");
        Arrays.fill(jArr, i11, i12, j11);
    }

    public static <T> void z(T[] tArr, T t11, int i11, int i12) {
        s.k(tArr, "<this>");
        Arrays.fill(tArr, i11, i12, t11);
    }
}
