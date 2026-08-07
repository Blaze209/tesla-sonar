package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0090\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0090\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R*\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R*\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001a\u0010.\u001a\u00020\u000e8\u0010X\u0090D¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b%\u0010\u001e¨\u0006/"}, d2 = {"Lp1/p;", "Lp1/q;", "", "v1", "v2", "v3", "v4", "<init>", "(FFFF)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "()V", "j", "()Lp1/p;", "", "index", "a", "(I)F", "value", "e", "(IF)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "<set-?>", Gender.FEMALE, "f", "()F", "setV1$animation_core_release", "(F)V", "b", "g", "setV2$animation_core_release", "c", "h", "setV3$animation_core_release", IntegerTokenConverter.CONVERTER_KEY, "setV4$animation_core_release", "I", "size", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float v1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float v2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float v3;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float v4;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int size;

    public p(float f11, float f12, float f13, float f14) {
        super(null);
        this.v1 = f11;
        this.v2 = f12;
        this.v3 = f13;
        this.v4 = f14;
        this.size = 4;
    }

    @Override // p019p1.q
    public float a(int index) {
        if (index == 0) {
            return this.v1;
        }
        if (index == 1) {
            return this.v2;
        }
        if (index != 2) {
            return index != 3 ? BitmapDescriptorFactory.HUE_RED : this.v4;
        }
        return this.v3;
    }

    @Override // p019p1.q
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // p019p1.q
    public void d() {
        this.v1 = BitmapDescriptorFactory.HUE_RED;
        this.v2 = BitmapDescriptorFactory.HUE_RED;
        this.v3 = BitmapDescriptorFactory.HUE_RED;
        this.v4 = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // p019p1.q
    public void e(int index, float value) {
        if (index == 0) {
            this.v1 = value;
            return;
        }
        if (index == 1) {
            this.v2 = value;
        } else if (index == 2) {
            this.v3 = value;
        } else {
            if (index != 3) {
                return;
            }
            this.v4 = value;
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return pVar.v1 == this.v1 && pVar.v2 == this.v2 && pVar.v3 == this.v3 && pVar.v4 == this.v4;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getV1() {
        return this.v1;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getV2() {
        return this.v2;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getV3() {
        return this.v3;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3)) * 31) + Float.hashCode(this.v4);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getV4() {
        return this.v4;
    }

    @Override // p019p1.q
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public p c() {
        return new p(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
    }
}
