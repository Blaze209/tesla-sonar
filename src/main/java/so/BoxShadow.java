package so;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: so.g, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001\u0015BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0015\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"¨\u0006$"}, d2 = {"Lso/g;", "", "", "offsetX", "offsetY", "", "color", "blurRadius", "spreadDistance", "", "inset", "<init>", "(FFLjava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "b", "e", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/lang/Float;", "()Ljava/lang/Float;", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BoxShadow {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float offsetX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float offsetY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer color;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float blurRadius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float spreadDistance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean inset;

    /* JADX INFO: renamed from: so.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lso/g$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "boxShadow", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lso/g;", "a", "(Lcom/facebook/react/bridge/ReadableMap;Landroid/content/Context;)Lso/g;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: so.g$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C2381a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f111505a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Map.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f111505a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BoxShadow a(ReadableMap boxShadow, Context context) {
            Integer num;
            Integer numValueOf;
            s.k(context, "context");
            if (boxShadow == null || !boxShadow.hasKey("offsetX") || !boxShadow.hasKey("offsetY")) {
                return null;
            }
            float f11 = (float) boxShadow.getDouble("offsetX");
            float f12 = (float) boxShadow.getDouble("offsetY");
            if (boxShadow.hasKey("color")) {
                ReadableType type = boxShadow.getType("color");
                int i11 = C2381a.f111505a[type.ordinal()];
                if (i11 == 1) {
                    numValueOf = Integer.valueOf(boxShadow.getInt("color"));
                } else {
                    if (i11 != 2) {
                        throw new JSApplicationCausedNativeException("Unsupported color type " + type);
                    }
                    numValueOf = ColorPropConverter.getColor(boxShadow.getMap("color"), context);
                }
                num = numValueOf;
            } else {
                num = null;
            }
            return new BoxShadow(f11, f12, num, boxShadow.hasKey("blurRadius") ? Float.valueOf((float) boxShadow.getDouble("blurRadius")) : null, boxShadow.hasKey("spreadDistance") ? Float.valueOf((float) boxShadow.getDouble("spreadDistance")) : null, boxShadow.hasKey("inset") ? Boolean.valueOf(boxShadow.getBoolean("inset")) : null);
        }

        private Companion() {
        }
    }

    public BoxShadow(float f11, float f12, Integer num, Float f13, Float f14, Boolean bool) {
        this.offsetX = f11;
        this.offsetY = f12;
        this.color = num;
        this.blurRadius = f13;
        this.spreadDistance = f14;
        this.inset = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getInset() {
        return this.inset;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getOffsetX() {
        return this.offsetX;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getOffsetY() {
        return this.offsetY;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxShadow)) {
            return false;
        }
        BoxShadow boxShadow = (BoxShadow) other;
        return Float.compare(this.offsetX, boxShadow.offsetX) == 0 && Float.compare(this.offsetY, boxShadow.offsetY) == 0 && s.f(this.color, boxShadow.color) && s.f(this.blurRadius, boxShadow.blurRadius) && s.f(this.spreadDistance, boxShadow.spreadDistance) && s.f(this.inset, boxShadow.inset);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Float getSpreadDistance() {
        return this.spreadDistance;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.offsetX) * 31) + Float.hashCode(this.offsetY)) * 31;
        Integer num = this.color;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f11 = this.blurRadius;
        int iHashCode3 = (iHashCode2 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Float f12 = this.spreadDistance;
        int iHashCode4 = (iHashCode3 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Boolean bool = this.inset;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BoxShadow(offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", color=" + this.color + ", blurRadius=" + this.blurRadius + ", spreadDistance=" + this.spreadDistance + ", inset=" + this.inset + ")";
    }
}
