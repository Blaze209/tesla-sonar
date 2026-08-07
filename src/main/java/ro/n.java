package ro;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0013\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lro/n;", "Landroid/view/animation/Interpolator;", "", "springDamping", "<init>", "(F)V", "input", "getInterpolation", "(F)F", "a", Gender.FEMALE, "_springDamping", "b", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements Interpolator {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float _springDamping;

    /* JADX INFO: renamed from: ro.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lro/n$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "params", "", "a", "(Lcom/facebook/react/bridge/ReadableMap;)F", "FACTOR", Gender.FEMALE, "", "PARAM_SPRING_DAMPING", "Ljava/lang/String;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a(ReadableMap params) {
            s.k(params, "params");
            if (params.getType("springDamping") == ReadableType.Number) {
                return (float) params.getDouble("springDamping");
            }
            return 0.5f;
        }

        private Companion() {
        }
    }

    public n(float f11) {
        this._springDamping = f11;
    }

    public static final float a(ReadableMap readableMap) {
        return INSTANCE.a(readableMap);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        double dPow = Math.pow(2.0d, (-10) * input);
        float f11 = this._springDamping;
        return (float) (((double) 1) + (dPow * Math.sin(((((double) (input - (f11 / 4))) * 3.141592653589793d) * ((double) 2)) / ((double) f11))));
    }
}
