package p014n4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0013\u0007\n\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0010\"\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Ln4/e0;", "", "<init>", "()V", "", "value", "Ln4/e0$a;", "b", "(F)Ln4/e0$a;", "", "c", "(I)Ln4/e0$a;", "Ln4/f0;", "weight", "Ln4/b0;", "style", "", "settings", "Ln4/e0$d;", "a", "(Ln4/f0;I[Ln4/e0$a;)Ln4/e0$d;", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f92907a = new e0();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Ln4/e0$a;", "", "Lw4/d;", "density", "", "c", "(Lw4/d;)F", "", "b", "()Z", "needsDensity", "", "a", "()Ljava/lang/String;", "axisName", "Ln4/e0$b;", "Ln4/e0$c;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        String getAxisName();

        /* JADX INFO: renamed from: b */
        boolean getNeedsDensity();

        float c(w4.d density);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u000e8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"Ln4/e0$b;", "Ln4/e0$a;", "", "axisName", "", "value", "<init>", "(Ljava/lang/String;F)V", "Lw4/d;", "density", "c", "(Lw4/d;)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", Gender.FEMALE, "getValue", "()F", "Z", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String axisName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public b(String str, float f11) {
            this.axisName = str;
            this.value = f11;
        }

        @Override // n4.e0.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        @Override // n4.e0.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @Override // n4.e0.a
        public float c(w4.d density) {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return s.f(getAxisName(), bVar.getAxisName()) && this.value == bVar.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + Float.hashCode(this.value);
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001e"}, d2 = {"Ln4/e0$c;", "Ln4/e0$a;", "", "axisName", "", "value", "<init>", "(Ljava/lang/String;I)V", "Lw4/d;", "density", "", "c", "(Lw4/d;)F", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "I", "getValue", "Z", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String axisName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public c(String str, int i11) {
            this.axisName = str;
            this.value = i11;
        }

        @Override // n4.e0.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getAxisName() {
            return this.axisName;
        }

        @Override // n4.e0.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getNeedsDensity() {
            return this.needsDensity;
        }

        @Override // n4.e0.a
        public float c(w4.d density) {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return s.f(getAxisName(), cVar.getAxisName()) && this.value == cVar.value;
        }

        public int hashCode() {
            return (getAxisName().hashCode() * 31) + this.value;
        }

        public String toString() {
            return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, d2 = {"Ln4/e0$d;", "", "", "Ln4/e0$a;", "settings", "<init>", "([Ln4/e0$a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<a> settings;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean needsDensity;

        public d(a... aVarArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z11 = false;
            for (a aVar : aVarArr) {
                String axisName = aVar.getAxisName();
                Object arrayList = linkedHashMap.get(axisName);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(axisName, arrayList);
                }
                ((List) arrayList).add(aVar);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException((CoreConstants.SINGLE_QUOTE_CHAR + str + "' must be unique. Actual [ [" + v.y0(list, null, null, null, 0, null, null, 63, null) + ']').toString());
                }
                v.E(arrayList2, list);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.settings = arrayList3;
            int size = arrayList3.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((a) arrayList3.get(i11)).getNeedsDensity()) {
                    z11 = true;
                    break;
                }
            }
            this.needsDensity = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getNeedsDensity() {
            return this.needsDensity;
        }

        public final List<a> b() {
            return this.settings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && s.f(this.settings, ((d) other).settings);
        }

        public int hashCode() {
            return this.settings.hashCode();
        }
    }

    private e0() {
    }

    public final d a(FontWeight weight, int style, a... settings) {
        s0 s0Var = new s0(3);
        s0Var.a(c(weight.k()));
        s0Var.a(b(style));
        s0Var.b(settings);
        return new d((a[]) s0Var.d(new a[s0Var.c()]));
    }

    public final a b(float value) {
        if (BitmapDescriptorFactory.HUE_RED <= value && value <= 1.0f) {
            return new b("ital", value);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + value).toString());
    }

    public final a c(int value) {
        if (1 <= value && value < 1001) {
            return new c("wght", value);
        }
        throw new IllegalArgumentException(("'wght' value must be in [1, 1000]. Actual: " + value).toString());
    }
}
