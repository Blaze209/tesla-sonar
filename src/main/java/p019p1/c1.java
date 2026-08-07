package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0016\u0010 \u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R*\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013\"\u0004\b\u001c\u0010\u0005R$\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u001f\u0010\u0005\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lp1/c1;", "", "", "finalPosition", "<init>", "(F)V", "Ljn0/h0;", "c", "()V", "lastDisplacement", "lastVelocity", "", "timeElapsed", "Lp1/t0;", "g", "(FFJ)J", "a", Gender.FEMALE, "getFinalPosition", "()F", "e", "", "b", "D", "naturalFreq", "", "Z", "initialized", DateTokenConverter.CONVERTER_KEY, "gammaPlus", "gammaMinus", "f", "dampedFreq", "value", "dampingRatio", "stiffness", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float finalPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private double gammaPlus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private double gammaMinus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private double dampedFreq;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private double naturalFreq = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float dampingRatio = 1.0f;

    public c1(float f11) {
        this.finalPosition = f11;
    }

    private final void c() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == d1.b()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f11 = this.dampingRatio;
        double d11 = ((double) f11) * ((double) f11);
        if (f11 > 1.0f) {
            double d12 = this.naturalFreq;
            double d13 = d11 - ((double) 1);
            this.gammaPlus = (((double) (-f11)) * d12) + (d12 * Math.sqrt(d13));
            double d14 = -this.dampingRatio;
            double d15 = this.naturalFreq;
            this.gammaMinus = (d14 * d15) - (d15 * Math.sqrt(d13));
        } else if (f11 >= BitmapDescriptorFactory.HUE_RED && f11 < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(((double) 1) - d11);
        }
        this.initialized = true;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float b() {
        double d11 = this.naturalFreq;
        return (float) (d11 * d11);
    }

    public final void d(float f11) {
        if (f11 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f11;
        this.initialized = false;
    }

    public final void e(float f11) {
        this.finalPosition = f11;
    }

    public final void f(float f11) {
        if (b() <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f11);
        this.initialized = false;
    }

    public final long g(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dCos;
        double dExp;
        c();
        float f11 = lastDisplacement - this.finalPosition;
        double d11 = timeElapsed / 1000.0d;
        float f12 = this.dampingRatio;
        if (f12 > 1.0f) {
            double d12 = f11;
            double d13 = this.gammaMinus;
            double d14 = lastVelocity;
            double d15 = this.gammaPlus;
            double d16 = d12 - (((d13 * d12) - d14) / (d13 - d15));
            double d17 = ((d12 * d13) - d14) / (d13 - d15);
            dExp = (Math.exp(d13 * d11) * d16) + (Math.exp(this.gammaPlus * d11) * d17);
            double d18 = this.gammaMinus;
            double dExp2 = d16 * d18 * Math.exp(d18 * d11);
            double d19 = this.gammaPlus;
            dCos = dExp2 + (d17 * d19 * Math.exp(d19 * d11));
        } else if (f12 == 1.0f) {
            double d21 = this.naturalFreq;
            double d22 = f11;
            double d23 = ((double) lastVelocity) + (d21 * d22);
            double d24 = d22 + (d23 * d11);
            double dExp3 = Math.exp((-d21) * d11) * d24;
            double dExp4 = d24 * Math.exp((-this.naturalFreq) * d11);
            double d25 = this.naturalFreq;
            dCos = (dExp4 * (-d25)) + (d23 * Math.exp((-d25) * d11));
            dExp = dExp3;
        } else {
            double d26 = ((double) 1) / this.dampedFreq;
            double d27 = this.naturalFreq;
            double d28 = f11;
            double d29 = d26 * ((((double) f12) * d27 * d28) + ((double) lastVelocity));
            double dExp5 = Math.exp(((double) (-f12)) * d27 * d11) * ((Math.cos(this.dampedFreq * d11) * d28) + (Math.sin(this.dampedFreq * d11) * d29));
            double d31 = this.naturalFreq;
            float f13 = this.dampingRatio;
            double d32 = (-d31) * dExp5 * ((double) f13);
            double dExp6 = Math.exp(((double) (-f13)) * d31 * d11);
            double d33 = this.dampedFreq;
            double dSin = (-d33) * d28 * Math.sin(d33 * d11);
            double d34 = this.dampedFreq;
            dCos = d32 + (dExp6 * (dSin + (d29 * d34 * Math.cos(d34 * d11))));
            dExp = dExp5;
        }
        return d1.a((float) (dExp + ((double) this.finalPosition)), (float) dCos);
    }
}
