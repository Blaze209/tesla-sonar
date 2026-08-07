package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bg\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u0019\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0014\u0010$R\u0017\u0010\u0005\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b%\u0010*R\u001a\u0010.\u001a\u00028\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b-\u0010,\u001a\u0004\b\u001d\u0010*R\u0014\u00100\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010$¨\u00061"}, d2 = {"Lr2/h2;", "T", "", "Lr2/u;", "compositionLocal", "value", "", "explicitNull", "Lr2/m3;", "mutationPolicy", "Lr2/p1;", "state", "Lkotlin/Function1;", "Lr2/v;", "compute", "isDynamic", "<init>", "(Lr2/u;Ljava/lang/Object;ZLr2/m3;Lr2/p1;Lwn0/l;Z)V", "h", "()Lr2/h2;", "a", "Lr2/u;", "b", "()Lr2/u;", "Z", "c", "Lr2/m3;", "e", "()Lr2/m3;", DateTokenConverter.CONVERTER_KEY, "Lr2/p1;", "f", "()Lr2/p1;", "Lwn0/l;", "()Lwn0/l;", IntegerTokenConverter.CONVERTER_KEY, "()Z", "g", "Ljava/lang/Object;", "providedValue", "<set-?>", "canOverride", "()Ljava/lang/Object;", "getValue$annotations", "()V", "getEffectiveValue$runtime_release$annotations", "effectiveValue", "j", "isStatic", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h2<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f106566i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u<T> compositionLocal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean explicitNull;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m3<T> mutationPolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p1<T> state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<v, T> compute;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isDynamic;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final T providedValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean canOverride = true;

    /* JADX WARN: Multi-variable type inference failed */
    public h2(u<T> uVar, T t11, boolean z11, m3<T> m3Var, p1<T> p1Var, l<? super v, ? extends T> lVar, boolean z12) {
        this.compositionLocal = uVar;
        this.explicitNull = z11;
        this.mutationPolicy = m3Var;
        this.state = p1Var;
        this.compute = lVar;
        this.isDynamic = z12;
        this.providedValue = t11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final u<T> b() {
        return this.compositionLocal;
    }

    public final l<v, T> c() {
        return this.compute;
    }

    public final T d() {
        if (this.explicitNull) {
            return null;
        }
        p1<T> p1Var = this.state;
        if (p1Var != null) {
            return p1Var.getValue();
        }
        T t11 = this.providedValue;
        if (t11 != null) {
            return t11;
        }
        o.t("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    public final m3<T> e() {
        return this.mutationPolicy;
    }

    public final p1<T> f() {
        return this.state;
    }

    public final T g() {
        return this.providedValue;
    }

    public final h2<T> h() {
        this.canOverride = false;
        return this;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsDynamic() {
        return this.isDynamic;
    }

    public final boolean j() {
        return (this.explicitNull || g() != null) && !this.isDynamic;
    }
}
