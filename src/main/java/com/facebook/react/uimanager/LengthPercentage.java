package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import so.CornerRadii;

/* JADX INFO: renamed from: com.facebook.react.uimanager.o, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/uimanager/o;", "", "", "value", "Lcom/facebook/react/uimanager/p;", "type", "<init>", "(FLcom/facebook/react/uimanager/p;)V", Snapshot.WIDTH, Snapshot.HEIGHT, "Lso/k;", "c", "(FF)Lso/k;", "referenceLength", "b", "(F)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, "Lcom/facebook/react/uimanager/p;", "()Lcom/facebook/react/uimanager/p;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LengthPercentage {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final p type;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/uimanager/o$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/Dynamic;", "dynamic", "Lcom/facebook/react/uimanager/o;", "a", "(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/uimanager/o;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.facebook.react.uimanager.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C0455a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23349a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f23349a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LengthPercentage a(Dynamic dynamic) {
            p013kotlin.jvm.internal.s.k(dynamic, "dynamic");
            int i11 = C0455a.f23349a[dynamic.getType().ordinal()];
            if (i11 == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d) {
                    return new LengthPercentage((float) dAsDouble, p.POINT);
                }
                return null;
            }
            if (i11 != 2) {
                qk.a.I("ReactNative", "Unsupported type for radius property: " + dynamic.getType());
                return null;
            }
            String strAsString = dynamic.asString();
            if (!p013kotlin.text.t.L(strAsString, "%", false, 2, null)) {
                qk.a.I("ReactNative", "Invalid string value: " + strAsString);
                return null;
            }
            try {
                String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
                float f11 = Float.parseFloat(strSubstring);
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    return new LengthPercentage(f11, p.PERCENT);
                }
                return null;
            } catch (NumberFormatException unused) {
                qk.a.I("ReactNative", "Invalid percentage format: " + strAsString);
                return null;
            }
        }

        private Companion() {
        }
    }

    public LengthPercentage(float f11, p type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        this.value = f11;
        this.type = type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p getType() {
        return this.type;
    }

    public final float b(float referenceLength) {
        return this.type == p.PERCENT ? (this.value / 100) * referenceLength : this.value;
    }

    public final CornerRadii c(float width, float height) {
        if (this.type != p.PERCENT) {
            float f11 = this.value;
            return new CornerRadii(f11, f11);
        }
        float f12 = this.value;
        float f13 = 100;
        return new CornerRadii((f12 / f13) * width, (f12 / f13) * height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LengthPercentage)) {
            return false;
        }
        LengthPercentage lengthPercentage = (LengthPercentage) other;
        return Float.compare(this.value, lengthPercentage.value) == 0 && this.type == lengthPercentage.type;
    }

    public int hashCode() {
        return (Float.hashCode(this.value) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "LengthPercentage(value=" + this.value + ", type=" + this.type + ")";
    }
}
