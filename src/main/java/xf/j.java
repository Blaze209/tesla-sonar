package xf;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\t\u0010\b\u0082\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lxf/j;", "", "<init>", "()V", "Ltf/i;", "composition", "", "b", "(Ltf/i;)F", "a", "Lxf/j$a;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f123419a = 0;

    /* JADX INFO: renamed from: xf.j$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018¨\u0006#"}, d2 = {"Lxf/j$a;", "Lxf/j;", "", "min", "max", "", "maxInclusive", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "Ltf/i;", "composition", "", "b", "(Ltf/i;)F", "a", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMin", "()Ljava/lang/Integer;", "c", "getMax", DateTokenConverter.CONVERTER_KEY, "Z", "getMaxInclusive", "()Z", "e", "actualMaxFrame", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Frame extends j {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f123420f = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer min;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer max;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean maxInclusive;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Integer actualMaxFrame;

        public /* synthetic */ Frame(Integer num, Integer num2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? true : z11);
        }

        @Override // xf.j
        public float a(tf.i composition) {
            s.k(composition, "composition");
            Integer num = this.actualMaxFrame;
            if (num == null) {
                return 1.0f;
            }
            return bo0.n.m(num.intValue() / composition.f(), BitmapDescriptorFactory.HUE_RED, 1.0f);
        }

        @Override // xf.j
        public float b(tf.i composition) {
            s.k(composition, "composition");
            Integer num = this.min;
            return num == null ? BitmapDescriptorFactory.HUE_RED : bo0.n.m(num.intValue() / composition.f(), BitmapDescriptorFactory.HUE_RED, 1.0f);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return s.f(this.min, frame.min) && s.f(this.max, frame.max) && this.maxInclusive == frame.maxInclusive;
        }

        public int hashCode() {
            Integer num = this.min;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.max;
            return ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.maxInclusive);
        }

        public String toString() {
            return "Frame(min=" + this.min + ", max=" + this.max + ", maxInclusive=" + this.maxInclusive + ")";
        }

        public Frame(Integer num, Integer num2, boolean z11) {
            super(null);
            this.min = num;
            this.max = num2;
            this.maxInclusive = z11;
            if (num2 == null) {
                num2 = null;
            } else if (!z11) {
                num2 = Integer.valueOf(num2.intValue() - 1);
            }
            this.actualMaxFrame = num2;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float a(tf.i composition);

    public abstract float b(tf.i composition);

    private j() {
    }
}
