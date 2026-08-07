package no0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000fB+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lno0/r;", "Target", "Lno0/l;", "Lno0/b0;", "field", "", "", "values", "name", "<init>", "(Lno0/b0;Ljava/util/List;Ljava/lang/String;)V", "target", "h", "(Ljava/lang/Object;)Ljava/lang/String;", "Loo0/e;", "a", "()Loo0/e;", "Lpo0/p;", "b", "()Lpo0/p;", "Lno0/b0;", "g", "()Lno0/b0;", "Ljava/util/List;", "c", "Ljava/lang/String;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class r<Target> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<Target> field;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> values;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String name;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lno0/r$a;", "Lpo0/a;", "", "<init>", "(Lno0/r;)V", "container", "newValue", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class a implements po0.a<Target, String> {
        public a() {
        }

        @Override // po0.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String c(Target container, String newValue) {
            p013kotlin.jvm.internal.s.k(newValue, "newValue");
            Integer numC = r.this.g().a().c(container, Integer.valueOf(((r) r.this).values.indexOf(newValue) + r.this.g().getMinValue()));
            if (numC == null) {
                return null;
            }
            r<Target> rVar = r.this;
            return (String) ((r) rVar).values.get(numC.intValue() - rVar.g().getMinValue());
        }

        @Override // po0.a
        public String getName() {
            return ((r) r.this).name;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<Target, String> {
        b(Object obj) {
            super(1, obj, r.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Target target) {
            return ((r) this.receiver).h(target);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(b0<? super Target> field, List<String> values, String name) {
        p013kotlin.jvm.internal.s.k(field, "field");
        p013kotlin.jvm.internal.s.k(values, "values");
        p013kotlin.jvm.internal.s.k(name, "name");
        this.field = field;
        this.values = values;
        this.name = name;
        if (values.size() == (field.getMaxValue() - field.getMinValue()) + 1) {
            return;
        }
        throw new IllegalArgumentException(("The number of values (" + values.size() + ") in " + values + " does not match the range of the field (" + ((field.getMaxValue() - field.getMinValue()) + 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String h(Target target) {
        int iIntValue = this.field.a().b(target).intValue();
        String str = (String) p013kotlin.collections.v.r0(this.values, iIntValue - this.field.getMinValue());
        if (str != null) {
            return str;
        }
        return "The value " + iIntValue + " of " + this.field.getName() + " does not have a corresponding string representation";
    }

    @Override // no0.l
    public oo0.e<Target> a() {
        return new oo0.i(new b(this));
    }

    @Override // no0.l
    public po0.p<Target> b() {
        return new po0.p<>(p013kotlin.collections.v.e(new po0.s(this.values, new a(), "one of " + this.values + " for " + this.name)), p013kotlin.collections.v.m());
    }

    @Override // no0.l
    public /* bridge */ /* synthetic */ n c() {
        return this.field;
    }

    public final b0<Target> g() {
        return this.field;
    }
}
