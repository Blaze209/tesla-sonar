package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0090\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR*\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0005R\u001a\u0010#\u001a\u00020\u000b8\u0010X\u0090D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u001b¨\u0006$"}, d2 = {"Lp1/m;", "Lp1/q;", "", "initVal", "<init>", "(F)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "g", "()Lp1/m;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", Gender.FEMALE, "f", "()F", "setValue$animation_core_release", "b", "I", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public m(float f11) {
        super(null);
        this.value = f11;
        this.size = 1;
    }

    @Override // p019p1.q
    public float a(int index) {
        return index == 0 ? this.value : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // p019p1.q
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // p019p1.q
    public void d() {
        this.value = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // p019p1.q
    public void e(int index, float value) {
        if (index == 0) {
            this.value = value;
        }
    }

    public boolean equals(Object other) {
        return (other instanceof m) && ((m) other).value == this.value;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @Override // p019p1.q
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public m c() {
        return new m(BitmapDescriptorFactory.HUE_RED);
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }
}
