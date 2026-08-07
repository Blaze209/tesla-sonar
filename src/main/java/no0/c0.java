package no0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lno0/c0;", "Target", "Lno0/l;", "Lno0/b0;", "field", "", "minDigits", "spacePadding", "<init>", "(Lno0/b0;ILjava/lang/Integer;)V", "Loo0/e;", "a", "()Loo0/e;", "Lpo0/p;", "b", "()Lpo0/p;", "Lno0/b0;", "getField", "()Lno0/b0;", "I", "c", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "maxDigits", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class c0<Target> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<Target> field;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minDigits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer spacePadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int maxDigits;

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
    public c0(b0<? super Target> field, int i11, Integer num) {
        p013kotlin.jvm.internal.s.k(field, "field");
        this.field = field;
        this.minDigits = i11;
        this.spacePadding = num;
        int maxDigits = field.getMaxDigits();
        this.maxDigits = maxDigits;
        if (i11 < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i11 + ") is negative").toString());
        }
        if (maxDigits < i11) {
            throw new IllegalArgumentException(("The maximum number of digits (" + maxDigits + ") is less than the minimum number of digits (" + i11 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (num == null || num.intValue() > i11) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i11 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    @Override // no0.l
    public oo0.e<Target> a() {
        oo0.j jVar = new oo0.j(new a(this.field.a()), this.minDigits);
        Integer num = this.spacePadding;
        return num != null ? new oo0.h(jVar, num.intValue()) : jVar;
    }

    @Override // no0.l
    public po0.p<Target> b() {
        return po0.o.e(Integer.valueOf(this.minDigits), Integer.valueOf(this.maxDigits), this.spacePadding, this.field.a(), this.field.getName(), false, 32, null);
    }

    @Override // no0.l
    public /* bridge */ /* synthetic */ n c() {
        return this.field;
    }
}
