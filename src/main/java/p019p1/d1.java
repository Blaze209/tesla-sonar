package p019p1;

import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "value", "velocity", "Lp1/t0;", "a", "(FF)J", Gender.FEMALE, "b", "()F", "UNSET", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f100352a = Float.MAX_VALUE;

    public static final long a(float f11, float f12) {
        return t0.a((((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public static final float b() {
        return f100352a;
    }
}
