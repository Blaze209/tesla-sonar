package xf;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BÕ\u0001\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00030\u0002\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00030\u0002\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u0002\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u0002\u0012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00030\u0002¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b!\u0010 R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R$\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\"R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"¨\u0006+"}, d2 = {"Lxf/n;", "", "", "Lxf/p;", "", "intProperties", "Landroid/graphics/PointF;", "pointFProperties", "", "floatProperties", "Lig/d;", "scaleProperties", "Landroid/graphics/ColorFilter;", "colorFilterProperties", "", "intArrayProperties", "Landroid/graphics/Typeface;", "typefaceProperties", "Landroid/graphics/Bitmap;", "bitmapProperties", "", "charSequenceProperties", "Landroid/graphics/Path;", "pathProperties", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "properties", "(Ljava/util/List;)V", "Lcom/airbnb/lottie/p;", "drawable", "Ljn0/h0;", "a", "(Lcom/airbnb/lottie/p;)V", "b", "Ljava/util/List;", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f123438k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<p<Integer>> intProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<p<PointF>> pointFProperties;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<p<Float>> floatProperties;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<p<ig.d>> scaleProperties;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<p<ColorFilter>> colorFilterProperties;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<p<Object[]>> intArrayProperties;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<p<Typeface>> typefaceProperties;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<p<Bitmap>> bitmapProperties;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<p<CharSequence>> charSequenceProperties;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<p<Path>> pathProperties;

    public n(List<p<Integer>> intProperties, List<p<PointF>> pointFProperties, List<p<Float>> floatProperties, List<p<ig.d>> scaleProperties, List<p<ColorFilter>> colorFilterProperties, List<p<Object[]>> intArrayProperties, List<p<Typeface>> typefaceProperties, List<p<Bitmap>> bitmapProperties, List<p<CharSequence>> charSequenceProperties, List<p<Path>> pathProperties) {
        s.k(intProperties, "intProperties");
        s.k(pointFProperties, "pointFProperties");
        s.k(floatProperties, "floatProperties");
        s.k(scaleProperties, "scaleProperties");
        s.k(colorFilterProperties, "colorFilterProperties");
        s.k(intArrayProperties, "intArrayProperties");
        s.k(typefaceProperties, "typefaceProperties");
        s.k(bitmapProperties, "bitmapProperties");
        s.k(charSequenceProperties, "charSequenceProperties");
        s.k(pathProperties, "pathProperties");
        this.intProperties = intProperties;
        this.pointFProperties = pointFProperties;
        this.floatProperties = floatProperties;
        this.scaleProperties = scaleProperties;
        this.colorFilterProperties = colorFilterProperties;
        this.intArrayProperties = intArrayProperties;
        this.typefaceProperties = typefaceProperties;
        this.bitmapProperties = bitmapProperties;
        this.charSequenceProperties = charSequenceProperties;
        this.pathProperties = pathProperties;
    }

    public final void a(com.airbnb.lottie.p drawable) {
        s.k(drawable, "drawable");
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            drawable.t(pVar.getKeyPath(), pVar.c(), o.d(pVar.a()));
        }
        Iterator<T> it2 = this.pointFProperties.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            drawable.t(pVar2.getKeyPath(), pVar2.c(), o.d(pVar2.a()));
        }
        Iterator<T> it3 = this.floatProperties.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            drawable.t(pVar3.getKeyPath(), pVar3.c(), o.d(pVar3.a()));
        }
        Iterator<T> it4 = this.scaleProperties.iterator();
        while (it4.hasNext()) {
            p pVar4 = (p) it4.next();
            drawable.t(pVar4.getKeyPath(), pVar4.c(), o.d(pVar4.a()));
        }
        Iterator<T> it5 = this.colorFilterProperties.iterator();
        while (it5.hasNext()) {
            p pVar5 = (p) it5.next();
            drawable.t(pVar5.getKeyPath(), pVar5.c(), o.d(pVar5.a()));
        }
        Iterator<T> it6 = this.intArrayProperties.iterator();
        while (it6.hasNext()) {
            p pVar6 = (p) it6.next();
            drawable.t(pVar6.getKeyPath(), pVar6.c(), o.d(pVar6.a()));
        }
        Iterator<T> it7 = this.typefaceProperties.iterator();
        while (it7.hasNext()) {
            p pVar7 = (p) it7.next();
            drawable.t(pVar7.getKeyPath(), pVar7.c(), o.d(pVar7.a()));
        }
        Iterator<T> it8 = this.bitmapProperties.iterator();
        while (it8.hasNext()) {
            p pVar8 = (p) it8.next();
            drawable.t(pVar8.getKeyPath(), pVar8.c(), o.d(pVar8.a()));
        }
        Iterator<T> it9 = this.charSequenceProperties.iterator();
        while (it9.hasNext()) {
            p pVar9 = (p) it9.next();
            drawable.t(pVar9.getKeyPath(), pVar9.c(), o.d(pVar9.a()));
        }
        Iterator<T> it10 = this.pathProperties.iterator();
        while (it10.hasNext()) {
            p pVar10 = (p) it10.next();
            drawable.t(pVar10.getKeyPath(), pVar10.c(), o.d(pVar10.a()));
        }
    }

    public final void b(com.airbnb.lottie.p drawable) {
        s.k(drawable, "drawable");
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            drawable.t(pVar.getKeyPath(), pVar.c(), null);
        }
        Iterator<T> it2 = this.pointFProperties.iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            drawable.t(pVar2.getKeyPath(), pVar2.c(), null);
        }
        Iterator<T> it3 = this.floatProperties.iterator();
        while (it3.hasNext()) {
            p pVar3 = (p) it3.next();
            drawable.t(pVar3.getKeyPath(), pVar3.c(), null);
        }
        Iterator<T> it4 = this.scaleProperties.iterator();
        while (it4.hasNext()) {
            p pVar4 = (p) it4.next();
            drawable.t(pVar4.getKeyPath(), pVar4.c(), null);
        }
        Iterator<T> it5 = this.colorFilterProperties.iterator();
        while (it5.hasNext()) {
            p pVar5 = (p) it5.next();
            drawable.t(pVar5.getKeyPath(), pVar5.c(), null);
        }
        Iterator<T> it6 = this.intArrayProperties.iterator();
        while (it6.hasNext()) {
            p pVar6 = (p) it6.next();
            drawable.t(pVar6.getKeyPath(), pVar6.c(), null);
        }
        Iterator<T> it7 = this.typefaceProperties.iterator();
        while (it7.hasNext()) {
            p pVar7 = (p) it7.next();
            drawable.t(pVar7.getKeyPath(), pVar7.c(), null);
        }
        Iterator<T> it8 = this.bitmapProperties.iterator();
        while (it8.hasNext()) {
            p pVar8 = (p) it8.next();
            drawable.t(pVar8.getKeyPath(), pVar8.c(), null);
        }
        Iterator<T> it9 = this.charSequenceProperties.iterator();
        while (it9.hasNext()) {
            p pVar9 = (p) it9.next();
            drawable.t(pVar9.getKeyPath(), pVar9.c(), null);
        }
        Iterator<T> it10 = this.pathProperties.iterator();
        while (it10.hasNext()) {
            p pVar10 = (p) it10.next();
            drawable.t(pVar10.getKeyPath(), pVar10.c(), null);
        }
    }

    public n(List<? extends p<?>> properties) {
        s.k(properties, "properties");
        List<? extends p<?>> list = properties;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((p) obj).c() instanceof Integer) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((p) obj2).c() instanceof PointF) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((p) obj3).c() instanceof Float) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (((p) obj4).c() instanceof ig.d) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list) {
            if (((p) obj5).c() instanceof ColorFilter) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list) {
            if (((p) obj6).c() instanceof Object[]) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list) {
            if (((p) obj7).c() instanceof Typeface) {
                arrayList7.add(obj7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj8 : list) {
            if (((p) obj8).c() instanceof Bitmap) {
                arrayList8.add(obj8);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj9 : list) {
            if (((p) obj9).c() instanceof CharSequence) {
                arrayList9.add(obj9);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj10 : list) {
            if (((p) obj10).c() instanceof Path) {
                arrayList10.add(obj10);
            }
        }
        this(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10);
    }
}
