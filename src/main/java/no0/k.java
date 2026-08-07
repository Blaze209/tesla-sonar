package no0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lno0/k;", "Target", "Lno0/l;", "Lno0/n;", "Lmo0/a;", "field", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(Lno0/n;IILjava/util/List;)V", "Loo0/e;", "a", "()Loo0/e;", "Lpo0/p;", "b", "()Lpo0/p;", "Lno0/n;", "c", "()Lno0/n;", "I", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class k<Target> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n<Target, mo0.a> field;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minDigits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxDigits;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> zerosToAdd;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l<Target, mo0.a> {
        a(Object obj) {
            super(1, obj, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final mo0.a invoke(Target target) {
            return (mo0.a) ((b) this.receiver).b(target);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(n<? super Target, mo0.a> field, int i11, int i12, List<Integer> zerosToAdd) {
        p013kotlin.jvm.internal.s.k(field, "field");
        p013kotlin.jvm.internal.s.k(zerosToAdd, "zerosToAdd");
        this.field = field;
        this.minDigits = i11;
        this.maxDigits = i12;
        this.zerosToAdd = zerosToAdd;
    }

    @Override // no0.l
    public oo0.e<Target> a() {
        return new oo0.d(new a(this.field.a()), this.minDigits, this.maxDigits, this.zerosToAdd);
    }

    @Override // no0.l
    public po0.p<Target> b() {
        return new po0.p<>(p013kotlin.collections.v.e(new po0.h(p013kotlin.collections.v.e(new po0.d(this.minDigits, this.maxDigits, this.field.a(), this.field.getName())))), p013kotlin.collections.v.m());
    }

    @Override // no0.l
    public final n<Target, mo0.a> c() {
        return this.field;
    }
}
