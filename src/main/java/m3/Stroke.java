package m3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import k3.i4;
import k3.j4;
import k3.u3;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: m3.k, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0018B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u0014R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lm3/k;", "Lm3/g;", "", Snapshot.WIDTH, "miter", "Lk3/i4;", "cap", "Lk3/j4;", "join", "Lk3/u3;", "pathEffect", "<init>", "(FFIILk3/u3;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", Gender.FEMALE, "f", "()F", "b", DateTokenConverter.CONVERTER_KEY, "c", "I", "e", "Lk3/u3;", "()Lk3/u3;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Stroke extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f90968g = i4.INSTANCE.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f90969h = j4.INSTANCE.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float miter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int join;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final u3 pathEffect;

    /* JADX INFO: renamed from: m3.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lm3/k$a;", "", "<init>", "()V", "Lk3/i4;", "DefaultCap", "I", "a", "()I", "", "DefaultMiter", Gender.FEMALE, "HairlineWidth", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Stroke.f90968g;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Stroke(float f11, float f12, int i11, int i12, u3 u3Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, i11, i12, u3Var);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCap() {
        return this.cap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getJoin() {
        return this.join;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getMiter() {
        return this.miter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final u3 getPathEffect() {
        return this.pathEffect;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) other;
        return this.width == stroke.width && this.miter == stroke.miter && i4.e(this.cap, stroke.cap) && j4.e(this.join, stroke.join) && s.f(this.pathEffect, stroke.pathEffect);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + i4.f(this.cap)) * 31) + j4.f(this.join)) * 31;
        u3 u3Var = this.pathEffect;
        return iHashCode + (u3Var != null ? u3Var.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) i4.g(this.cap)) + ", join=" + ((Object) j4.g(this.join)) + ", pathEffect=" + this.pathEffect + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ Stroke(float f11, float f12, int i11, int i12, u3 u3Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i13 & 2) != 0 ? 4.0f : f12, (i13 & 4) != 0 ? f90968g : i11, (i13 & 8) != 0 ? f90969h : i12, (i13 & 16) != 0 ? null : u3Var, null);
    }

    private Stroke(float f11, float f12, int i11, int i12, u3 u3Var) {
        super(null);
        this.width = f11;
        this.miter = f12;
        this.cap = i11;
        this.join = i12;
        this.pathEffect = u3Var;
    }
}
