package da0;

import android.animation.FloatEvaluator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B?\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\fJ-\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R+\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0007\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R$\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lda0/a;", "Landroid/animation/FloatEvaluator;", "Lkotlin/Function1;", "", "", "Lcom/swmansion/rnscreens/transition/BoundaryValueProviderFn;", "startValueProvider", "endValueProvider", "<init>", "(Lwn0/l;Lwn0/l;)V", "startValue", "getStartValue", "(Ljava/lang/Number;)Ljava/lang/Number;", "endValue", "getEndValue", "fraction", "evaluate", "(FLjava/lang/Number;Ljava/lang/Number;)Ljava/lang/Float;", "Lwn0/l;", "getStartValueProvider", "()Lwn0/l;", "getEndValueProvider", "startValueCache", "Ljava/lang/Number;", "getStartValueCache", "()Ljava/lang/Number;", "setStartValueCache", "(Ljava/lang/Number;)V", "endValueCache", "getEndValueCache", "setEndValueCache", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends FloatEvaluator {
    private Number endValueCache;
    private final l<Number, Float> endValueProvider;
    private Number startValueCache;
    private final l<Number, Float> startValueProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public a(l<? super Number, Float> startValueProvider, l<? super Number, Float> endValueProvider) {
        s.k(startValueProvider, "startValueProvider");
        s.k(endValueProvider, "endValueProvider");
        this.startValueProvider = startValueProvider;
        this.endValueProvider = endValueProvider;
    }

    private final Number getEndValue(Number endValue) {
        if (this.endValueCache == null) {
            this.endValueCache = this.endValueProvider.invoke(endValue);
        }
        return this.endValueCache;
    }

    private final Number getStartValue(Number startValue) {
        if (this.startValueCache == null) {
            this.startValueCache = this.startValueProvider.invoke(startValue);
        }
        return this.startValueCache;
    }

    public final Number getEndValueCache() {
        return this.endValueCache;
    }

    public final l<Number, Float> getEndValueProvider() {
        return this.endValueProvider;
    }

    public final Number getStartValueCache() {
        return this.startValueCache;
    }

    public final l<Number, Float> getStartValueProvider() {
        return this.startValueProvider;
    }

    public final void setEndValueCache(Number number) {
        this.endValueCache = number;
    }

    public final void setStartValueCache(Number number) {
        this.startValueCache = number;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    public Float evaluate(float fraction, Number startValue, Number endValue) {
        Number startValue2 = getStartValue(startValue);
        Number endValue2 = getEndValue(endValue);
        if (startValue2 == null || endValue2 == null) {
            return null;
        }
        return super.evaluate(fraction, startValue2, endValue2);
    }
}
