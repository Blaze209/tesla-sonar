package p014n4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: n4.f0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Ln4/f0;", "", "", "weight", "<init>", "(I)V", "other", "j", "(Ln4/f0;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "k", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FontWeight implements Comparable<FontWeight> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FontWeight f92923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final FontWeight f92924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final FontWeight f92925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final FontWeight f92926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final FontWeight f92927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final FontWeight f92928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final FontWeight f92929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final FontWeight f92930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final FontWeight f92931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final FontWeight f92932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final FontWeight f92933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final FontWeight f92934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final FontWeight f92935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final FontWeight f92936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final FontWeight f92937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final FontWeight f92938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final FontWeight f92939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final FontWeight f92940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final List<FontWeight> f92941u;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int weight;

    /* JADX INFO: renamed from: n4.f0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b¨\u0006\""}, d2 = {"Ln4/f0$a;", "", "<init>", "()V", "Ln4/f0;", "W400", "Ln4/f0;", "f", "()Ln4/f0;", "getW400$annotations", "W500", "g", "getW500$annotations", "W600", "h", "getW600$annotations", "W700", IntegerTokenConverter.CONVERTER_KEY, "getW700$annotations", "Light", "b", "getLight$annotations", ReactProgressBarViewManager.DEFAULT_STYLE, DateTokenConverter.CONVERTER_KEY, "getNormal$annotations", "Medium", "c", "getMedium$annotations", "SemiBold", "e", "getSemiBold$annotations", "Bold", "a", "getBold$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FontWeight a() {
            return FontWeight.f92938r;
        }

        public final FontWeight b() {
            return FontWeight.f92934n;
        }

        public final FontWeight c() {
            return FontWeight.f92936p;
        }

        public final FontWeight d() {
            return FontWeight.f92935o;
        }

        public final FontWeight e() {
            return FontWeight.f92937q;
        }

        public final FontWeight f() {
            return FontWeight.f92926f;
        }

        public final FontWeight g() {
            return FontWeight.f92927g;
        }

        public final FontWeight h() {
            return FontWeight.f92928h;
        }

        public final FontWeight i() {
            return FontWeight.f92929i;
        }

        private Companion() {
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        f92923c = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        f92924d = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        f92925e = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        f92926f = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        f92927g = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        f92928h = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f92929i = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        f92930j = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f92931k = fontWeight9;
        f92932l = fontWeight;
        f92933m = fontWeight2;
        f92934n = fontWeight3;
        f92935o = fontWeight4;
        f92936p = fontWeight5;
        f92937q = fontWeight6;
        f92938r = fontWeight7;
        f92939s = fontWeight8;
        f92940t = fontWeight9;
        f92941u = v.p(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i11) {
        this.weight = i11;
        if (1 > i11 || i11 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i11).toString());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontWeight) && this.weight == ((FontWeight) other).weight;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getWeight() {
        return this.weight;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(FontWeight other) {
        return s.m(this.weight, other.weight);
    }

    public final int k() {
        return this.weight;
    }

    public String toString() {
        return "FontWeight(weight=" + this.weight + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
