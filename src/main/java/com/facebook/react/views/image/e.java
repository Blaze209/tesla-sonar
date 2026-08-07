package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/views/image/e;", "Lan/b;", "", "postprocessors", "<init>", "(Ljava/util/List;)V", "", "getName", "()Ljava/lang/String;", "Ljk/d;", "a", "()Ljk/d;", "Landroid/graphics/Bitmap;", "sourceBitmap", "Lmm/d;", "bitmapFactory", "Ltk/a;", "b", "(Landroid/graphics/Bitmap;Lmm/d;)Ltk/a;", "Ljava/util/List;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements an.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<an.b> postprocessors;

    /* JADX INFO: renamed from: com.facebook.react.views.image.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/image/e$a;", "", "<init>", "()V", "", "Lan/b;", "postprocessors", "a", "(Ljava/util/List;)Lan/b;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final an.b a(List<? extends an.b> postprocessors) {
            s.k(postprocessors, "postprocessors");
            int size = postprocessors.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size != 0) {
                return size != 1 ? new e(postprocessors, defaultConstructorMarker) : postprocessors.get(0);
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ e(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @Override // an.b
    public jk.d a() {
        List<an.b> list = this.postprocessors;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((an.b) it.next()).a());
        }
        return new jk.f(arrayList);
    }

    @Override // an.b
    public tk.a<Bitmap> b(Bitmap sourceBitmap, mm.d bitmapFactory) {
        Bitmap bitmapH;
        s.k(sourceBitmap, "sourceBitmap");
        s.k(bitmapFactory, "bitmapFactory");
        tk.a<Bitmap> aVarB = null;
        try {
            tk.a<Bitmap> aVarClone = null;
            for (an.b bVar : this.postprocessors) {
                if (aVarClone == null || (bitmapH = aVarClone.H()) == null) {
                    bitmapH = sourceBitmap;
                }
                aVarB = bVar.b(bitmapH, bitmapFactory);
                tk.a.C(aVarClone);
                aVarClone = aVarB.clone();
            }
            if (aVarB != null) {
                tk.a<Bitmap> aVarClone2 = aVarB.clone();
                s.j(aVarClone2, "clone(...)");
                tk.a.C(aVarB);
                return aVarClone2;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.postprocessors.size()).toString());
        } catch (Throwable th2) {
            tk.a.C(null);
            throw th2;
        }
    }

    @Override // an.b
    public String getName() {
        return "MultiPostProcessor (" + v.y0(this.postprocessors, ",", null, null, 0, null, null, 62, null) + ")";
    }

    private e(List<? extends an.b> list) {
        this.postprocessors = new LinkedList(list);
    }
}
