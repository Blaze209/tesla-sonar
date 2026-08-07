package okio;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001aB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lokio/g0;", "Lkotlin/collections/d;", "Lokio/k;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lokio/k;[I)V", "", "index", IntegerTokenConverter.CONVERTER_KEY, "(I)Lokio/k;", "b", "[Lokio/k;", "j", "()[Lokio/k;", "c", "[I", "k", "()[I", DateTokenConverter.CONVERTER_KEY, "()I", "size", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 extends p013kotlin.collections.d<k> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k[] byteStrings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int[] trie;

    /* JADX INFO: renamed from: okio.g0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lokio/g0$a;", "", "<init>", "()V", "", "nodeOffset", "Lokio/h;", "node", "", "byteStringOffset", "", "Lokio/k;", "byteStrings", "fromIndex", "toIndex", "indexes", "Ljn0/h0;", "a", "(JLokio/h;ILjava/util/List;IILjava/util/List;)V", "", "Lokio/g0;", DateTokenConverter.CONVERTER_KEY, "([Lokio/k;)Lokio/g0;", "c", "(Lokio/h;)J", "intCount", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(long nodeOffset, h node, int byteStringOffset, List<? extends k> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) {
            int i11;
            int i12;
            int i13;
            long j11;
            int i14 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i15 = fromIndex; i15 < toIndex; i15++) {
                if (byteStrings.get(i15).D() < i14) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            k kVar = byteStrings.get(fromIndex);
            k kVar2 = byteStrings.get(toIndex - 1);
            if (i14 == kVar.D()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i16 = fromIndex + 1;
                k kVar3 = byteStrings.get(i16);
                i11 = i16;
                i12 = iIntValue;
                kVar = kVar3;
            } else {
                i11 = fromIndex;
                i12 = -1;
            }
            if (kVar.h(i14) == kVar2.h(i14)) {
                int iMin = Math.min(kVar.D(), kVar2.D());
                int i17 = 0;
                for (int i18 = i14; i18 < iMin && kVar.h(i18) == kVar2.h(i18); i18++) {
                    i17++;
                }
                long jC = nodeOffset + c(node) + ((long) 2) + ((long) i17) + 1;
                node.writeInt(-i17);
                node.writeInt(i12);
                int i19 = i14 + i17;
                while (i14 < i19) {
                    node.writeInt(kVar.h(i14) & 255);
                    i14++;
                }
                if (i11 + 1 == toIndex) {
                    if (i19 != byteStrings.get(i11).D()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i11).intValue());
                    return;
                } else {
                    h hVar = new h();
                    node.writeInt(((int) (c(hVar) + jC)) * (-1));
                    a(jC, hVar, i19, byteStrings, i11, toIndex, indexes);
                    node.q2(hVar);
                    return;
                }
            }
            int i21 = 1;
            for (int i22 = i11 + 1; i22 < toIndex; i22++) {
                if (byteStrings.get(i22 - 1).h(i14) != byteStrings.get(i22).h(i14)) {
                    i21++;
                }
            }
            long jC2 = nodeOffset + c(node) + ((long) 2) + ((long) (i21 * 2));
            node.writeInt(i21);
            node.writeInt(i12);
            for (int i23 = i11; i23 < toIndex; i23++) {
                byte bH = byteStrings.get(i23).h(i14);
                if (i23 == i11 || bH != byteStrings.get(i23 - 1).h(i14)) {
                    node.writeInt(bH & 255);
                }
            }
            h hVar2 = new h();
            while (i11 < toIndex) {
                byte bH2 = byteStrings.get(i11).h(i14);
                int i24 = i11 + 1;
                int i25 = i24;
                while (true) {
                    if (i25 >= toIndex) {
                        i13 = toIndex;
                        break;
                    } else {
                        if (bH2 != byteStrings.get(i25).h(i14)) {
                            i13 = i25;
                            break;
                        }
                        i25++;
                    }
                }
                if (i24 == i13 && i14 + 1 == byteStrings.get(i11).D()) {
                    node.writeInt(indexes.get(i11).intValue());
                    j11 = jC2;
                } else {
                    node.writeInt(((int) (c(hVar2) + jC2)) * (-1));
                    j11 = jC2;
                    a(j11, hVar2, i14 + 1, byteStrings, i11, i13, indexes);
                }
                jC2 = j11;
                i11 = i13;
            }
            node.q2(hVar2);
        }

        static /* synthetic */ void b(Companion companion, long j11, h hVar, int i11, List list, int i12, int i13, List list2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j11 = 0;
            }
            companion.a(j11, hVar, (i14 & 4) != 0 ? 0 : i11, list, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? list.size() : i13, list2);
        }

        private final long c(h hVar) {
            return hVar.getSize() / ((long) 4);
        }

        public final g0 d(k... byteStrings) {
            p013kotlin.jvm.internal.s.k(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new g0(new k[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List listF1 = p013kotlin.collections.n.F1(byteStrings);
            p013kotlin.collections.v.B(listF1);
            int size = listF1.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                arrayList.set(p013kotlin.collections.v.l(listF1, byteStrings[i12], 0, 0, 6, null), Integer.valueOf(i13));
                i12++;
                i13++;
            }
            if (((k) listF1.get(0)).D() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i14 = 0;
            while (i14 < listF1.size()) {
                k kVar = (k) listF1.get(i14);
                int i15 = i14 + 1;
                int i16 = i15;
                while (i16 < listF1.size()) {
                    k kVar2 = (k) listF1.get(i16);
                    if (!kVar2.E(kVar)) {
                        break;
                    }
                    if (kVar2.D() == kVar.D()) {
                        throw new IllegalArgumentException(("duplicate option: " + kVar2).toString());
                    }
                    if (((Number) arrayList.get(i16)).intValue() > ((Number) arrayList.get(i14)).intValue()) {
                        listF1.remove(i16);
                        ((Number) arrayList.remove(i16)).intValue();
                    } else {
                        i16++;
                    }
                }
                i14 = i15;
            }
            h hVar = new h();
            b(this, 0L, hVar, 0, listF1, 0, 0, arrayList, 53, null);
            int iC = (int) c(hVar);
            int[] iArr = new int[iC];
            for (int i17 = 0; i17 < iC; i17++) {
                iArr[i17] = hVar.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            p013kotlin.jvm.internal.s.j(objArrCopyOf, "copyOf(...)");
            return new g0((k[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ g0(k[] kVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVarArr, iArr);
    }

    public static final g0 n(k... kVarArr) {
        return INSTANCE.d(kVarArr);
    }

    @Override // p013kotlin.collections.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof k) {
            return h((k) obj);
        }
        return false;
    }

    @Override // p013kotlin.collections.b
    /* JADX INFO: renamed from: d */
    public int get_size() {
        return this.byteStrings.length;
    }

    public /* bridge */ boolean h(k kVar) {
        return super.contains(kVar);
    }

    @Override // p013kotlin.collections.d, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public k get(int index) {
        return this.byteStrings[index];
    }

    @Override // p013kotlin.collections.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof k) {
            return l((k) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k[] getByteStrings() {
        return this.byteStrings;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ int l(k kVar) {
        return super.indexOf(kVar);
    }

    @Override // p013kotlin.collections.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof k) {
            return m((k) obj);
        }
        return -1;
    }

    public /* bridge */ int m(k kVar) {
        return super.lastIndexOf(kVar);
    }

    private g0(k[] kVarArr, int[] iArr) {
        this.byteStrings = kVarArr;
        this.trie = iArr;
    }
}
