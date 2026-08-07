package om;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lom/f;", "", "", Snapshot.WIDTH, Snapshot.HEIGHT, "", "maxBitmapDimension", "roundUpFraction", "<init>", "(IIFF)V", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "c", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "e", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float maxBitmapDimension;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float roundUpFraction;

    public f(int i11, int i12, float f11, float f12) {
        this.width = i11;
        this.height = i12;
        this.maxBitmapDimension = f11;
        this.roundUpFraction = f12;
        if (i11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i12 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return this.width == fVar.width && this.height == fVar.height;
    }

    public int hashCode() {
        return xk.a.a(this.width, this.height);
    }

    public String toString() {
        t0 t0Var = t0.f86535a;
        String str = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.width), Integer.valueOf(this.height)}, 2));
        s.j(str, "format(...)");
        return str;
    }

    public /* synthetic */ f(int i11, int i12, float f11, float f12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, (i13 & 4) != 0 ? 2048.0f : f11, (i13 & 8) != 0 ? 0.6666667f : f12);
    }
}
