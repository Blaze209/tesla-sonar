package p015o1;

import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "friction", "density", "c", "(FF)F", "a", Gender.FEMALE, "DecelerationRate", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f95690a = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(float f11, float f12) {
        return f12 * 386.0878f * 160.0f * f11;
    }
}
