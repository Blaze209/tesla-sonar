package p3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010(R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010(R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b2\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b,\u00104R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u0011\u00106\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b5\u0010 ¨\u00067"}, d2 = {"Lp3/n;", "Lp3/p;", "", "", "name", "", "rotation", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lp3/h;", "clipPathData", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "", "index", DateTokenConverter.CONVERTER_KEY, "(I)Lp3/p;", "", "iterator", "()Ljava/util/Iterator;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", Gender.FEMALE, "k", "()F", "c", IntegerTokenConverter.CONVERTER_KEY, "j", "e", "l", "f", "m", "g", "o", "p", "Ljava/util/List;", "()Ljava/util/List;", "n", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n extends p implements Iterable<p>, xn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float rotation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float pivotX;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float pivotY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float scaleX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float scaleY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float translationX;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float translationY;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<h> clipPathData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<p> children;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"p3/n$a", "", "Lp3/p;", "", "hasNext", "()Z", "b", "()Lp3/p;", "a", "Ljava/util/Iterator;", "getIt", "()Ljava/util/Iterator;", "it", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Iterator<p>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Iterator<p> it;

        a(n nVar) {
            this.it = nVar.children.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p next() {
            return this.it.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n() {
        this(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 1023, null);
    }

    public final p d(int index) {
        return this.children.get(index);
    }

    public final List<h> e() {
        return this.clipPathData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof n)) {
            n nVar = (n) other;
            return s.f(this.name, nVar.name) && this.rotation == nVar.rotation && this.pivotX == nVar.pivotX && this.pivotY == nVar.pivotY && this.scaleX == nVar.scaleX && this.scaleY == nVar.scaleY && this.translationX == nVar.translationX && this.translationY == nVar.translationY && s.f(this.clipPathData, nVar.clipPathData) && s.f(this.children, nVar.children);
        }
        return false;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((((((((((((this.name.hashCode() * 31) + Float.hashCode(this.rotation)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + this.clipPathData.hashCode()) * 31) + this.children.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    @Override // java.lang.Iterable
    public Iterator<p> iterator() {
        return new a(this);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getRotation() {
        return this.rotation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    public final int n() {
        return this.children.size();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    public /* synthetic */ n(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 1.0f : f14, (i11 & 32) != 0 ? 1.0f : f15, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) != 0 ? 0.0f : f17, (i11 & 256) != 0 ? o.d() : list, (i11 & 512) != 0 ? v.m() : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List<? extends h> list, List<? extends p> list2) {
        super(null);
        this.name = str;
        this.rotation = f11;
        this.pivotX = f12;
        this.pivotY = f13;
        this.scaleX = f14;
        this.scaleY = f15;
        this.translationX = f16;
        this.translationY = f17;
        this.clipPathData = list;
        this.children = list2;
    }
}
