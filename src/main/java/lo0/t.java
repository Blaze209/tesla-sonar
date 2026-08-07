package lo0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Llo0/t;", "Lno0/k;", "Llo0/k0;", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(IILjava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "e", "I", "f", "g", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t extends no0.k<k0> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<Integer> f90614h = p013kotlin.collections.v.p(0, 0, 0, 0, 0, 0, 0, 0, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<Integer> f90615i = p013kotlin.collections.v.p(2, 1, 0, 2, 1, 0, 2, 1, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int minDigits;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int maxDigits;

    public /* synthetic */ t(int i11, int i12, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, (i13 & 4) != 0 ? f90614h : list);
    }

    public boolean equals(Object other) {
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return this.minDigits == tVar.minDigits && this.maxDigits == tVar.maxDigits;
    }

    public int hashCode() {
        return (this.minDigits * 31) + this.maxDigits;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i11, int i12, List<Integer> zerosToAdd) {
        super(l0.f90564a.a(), i11, i12, zerosToAdd);
        p013kotlin.jvm.internal.s.k(zerosToAdd, "zerosToAdd");
        this.minDigits = i11;
        this.maxDigits = i12;
    }
}
