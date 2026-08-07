package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u00020\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lr2/l1;", "Lr2/p0;", "Lr2/p1;", "", "value", "getValue", "()Ljava/lang/Float;", IntegerTokenConverter.CONVERTER_KEY, "(F)V", DateTokenConverter.CONVERTER_KEY, "()F", "r", "floatValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface l1 extends p0, p1<Float> {
    @Override // p020r2.p0
    float d();

    default void i(float f11) {
        r(f11);
    }

    void r(float f11);

    @Override // p020r2.p1
    /* bridge */ /* synthetic */ default void setValue(Float f11) {
        i(f11.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p020r2.y3
    default Float getValue() {
        return Float.valueOf(d());
    }
}
