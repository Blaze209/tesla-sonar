package no0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lno0/z;", "Target", "Lno0/l;", "Lno0/n;", "", "field", "minDigits", "maxDigits", "spacePadding", "outputPlusOnExceededWidth", "<init>", "(Lno0/n;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Loo0/e;", "a", "()Loo0/e;", "Lpo0/p;", "b", "()Lpo0/p;", "Lno0/n;", "c", "()Lno0/n;", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "e", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class z<Target> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n<Target, Integer> field;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer minDigits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer maxDigits;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer spacePadding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Integer outputPlusOnExceededWidth;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l<Target, Integer> {
        a(Object obj) {
            super(1, obj, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Target target) {
            return (Integer) ((b) this.receiver).b(target);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(n<? super Target, Integer> field, Integer num, Integer num2, Integer num3, Integer num4) {
        p013kotlin.jvm.internal.s.k(field, "field");
        this.field = field;
        this.minDigits = num;
        this.maxDigits = num2;
        this.spacePadding = num3;
        this.outputPlusOnExceededWidth = num4;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + num + ") is negative").toString());
        }
        if (num2 == null || num == null || num2.intValue() >= num.intValue()) {
            return;
        }
        throw new IllegalArgumentException(("The maximum number of digits (" + num2 + ") is less than the minimum number of digits (" + num + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    @Override // no0.l
    public oo0.e<Target> a() {
        a aVar = new a(this.field.a());
        Integer num = this.minDigits;
        oo0.g gVar = new oo0.g(aVar, num != null ? num.intValue() : 0, this.outputPlusOnExceededWidth);
        Integer num2 = this.spacePadding;
        return num2 != null ? new oo0.h(gVar, num2.intValue()) : gVar;
    }

    @Override // no0.l
    public po0.p<Target> b() {
        return po0.o.a(this.minDigits, this.maxDigits, this.spacePadding, this.field.a(), this.field.getName(), this.outputPlusOnExceededWidth);
    }

    @Override // no0.l
    public final n<Target, Integer> c() {
        return this.field;
    }
}
