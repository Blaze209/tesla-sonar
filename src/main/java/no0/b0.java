package no0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002BS\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u0012\u0010\u001fR\u0017\u0010!\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\""}, d2 = {"Lno0/b0;", "Target", "Lno0/a;", "", "Lno0/b;", "accessor", "minValue", "maxValue", "", "name", "defaultValue", "Lno0/m;", "sign", "<init>", "(Lno0/b;IILjava/lang/String;Ljava/lang/Integer;Lno0/m;)V", "a", "Lno0/b;", "()Lno0/b;", "b", "I", "f", "()I", "c", "e", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lno0/m;", "()Lno0/m;", "g", "maxDigits", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b0<Target> extends a<Target, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<Target, Integer> accessor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Integer defaultValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m<Target> sign;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int maxDigits;

    public /* synthetic */ b0(b bVar, int i11, int i12, String str, Integer num, m mVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, i11, i12, (i13 & 8) != 0 ? bVar.getName() : str, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? null : mVar);
    }

    @Override // no0.n
    public b<Target, Integer> a() {
        return this.accessor;
    }

    @Override // no0.n
    public m<Target> b() {
        return this.sign;
    }

    @Override // no0.n
    /* JADX INFO: renamed from: c, reason: from getter */
    public Integer getDefaultValue() {
        return this.defaultValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMaxDigits() {
        return this.maxDigits;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    @Override // no0.n
    public String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(b<? super Target, Integer> accessor, int i11, int i12, String name, Integer num, m<? super Target> mVar) {
        int i13;
        p013kotlin.jvm.internal.s.k(accessor, "accessor");
        p013kotlin.jvm.internal.s.k(name, "name");
        this.accessor = accessor;
        this.minValue = i11;
        this.maxValue = i12;
        this.name = name;
        this.defaultValue = num;
        this.sign = mVar;
        if (i12 < 10) {
            i13 = 1;
        } else if (i12 < 100) {
            i13 = 2;
        } else {
            if (i12 >= 1000) {
                throw new IllegalArgumentException("Max value " + i12 + " is too large");
            }
            i13 = 3;
        }
        this.maxDigits = i13;
    }
}
