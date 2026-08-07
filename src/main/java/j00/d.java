package j00;

import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\t\u0010\u0015¨\u0006\u0018"}, d2 = {"Lj00/d;", "Landroid/animation/TimeInterpolator;", "<init>", "()V", "", "input", "getInterpolation", "(F)F", "Landroid/view/animation/LinearInterpolator;", "a", "Landroid/view/animation/LinearInterpolator;", "linearInterpolator", "Landroid/view/animation/PathInterpolator;", "b", "Landroid/view/animation/PathInterpolator;", "pathInterpolator", "Lj00/d$a$a;", "c", "Lj00/d$a$a;", "getMode", "()Lj00/d$a$a;", "(Lj00/d$a$a;)V", "mode", DateTokenConverter.CONVERTER_KEY, "react-native-avoid-softinput_reactnative77Release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LinearInterpolator linearInterpolator = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PathInterpolator pathInterpolator = new PathInterpolator(0.42f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Companion.EnumC1718a mode = Companion.EnumC1718a.LINEAR;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82391a;

        static {
            int[] iArr = new int[Companion.EnumC1718a.values().length];
            try {
                iArr[Companion.EnumC1718a.EASE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.EnumC1718a.EASE_IN_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Companion.EnumC1718a.EASE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f82391a = iArr;
        }
    }

    public final void a(Companion.EnumC1718a enumC1718a) {
        s.k(enumC1718a, "<set-?>");
        this.mode = enumC1718a;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        float f11;
        float interpolation;
        int i11 = b.f82391a[this.mode.ordinal()];
        if (i11 == 1) {
            return this.pathInterpolator.getInterpolation(input);
        }
        if (i11 != 2) {
            if (i11 != 3) {
                return this.linearInterpolator.getInterpolation(input);
            }
            f11 = 1;
            interpolation = this.pathInterpolator.getInterpolation(f11 - input);
        } else {
            if (input < 0.5d) {
                float f12 = 2;
                return this.pathInterpolator.getInterpolation(input * f12) / f12;
            }
            f11 = 1;
            float f13 = 2;
            interpolation = this.pathInterpolator.getInterpolation((f11 - input) * f13) / f13;
        }
        return f11 - interpolation;
    }
}
