package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public abstract class u0 {

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f8680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f8681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f8682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f8683e;

        a(int i11, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f8679a = i11;
            this.f8680b = arrayList;
            this.f8681c = arrayList2;
            this.f8682d = arrayList3;
            this.f8683e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i11 = 0; i11 < this.f8679a; i11++) {
                ViewCompat.J0((View) this.f8680b.get(i11), (String) this.f8681c.get(i11));
                ViewCompat.J0((View) this.f8682d.get(i11), (String) this.f8683e.get(i11));
            }
        }
    }

    protected static void f(List<View> list, View view) {
        int size = list.size();
        if (i(list, view, size)) {
            return;
        }
        if (ViewCompat.J(view) != null) {
            list.add(view);
        }
        for (int i11 = size; i11 < list.size(); i11++) {
            View view2 = list.get(i11);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    if (!i(list, childAt, size) && ViewCompat.J(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean i(List<View> list, View view, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (list.get(i12) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(@NonNull Object obj, @NonNull View view);

    public abstract void b(@NonNull Object obj, @NonNull ArrayList<View> arrayList);

    public void c(@NonNull Object obj) {
    }

    public void d(@NonNull Object obj, @NonNull Runnable runnable) {
    }

    public abstract void e(@NonNull ViewGroup viewGroup, Object obj);

    public abstract boolean g(@NonNull Object obj);

    public abstract Object h(Object obj);

    public Object j(@NonNull ViewGroup viewGroup, @NonNull Object obj) {
        return null;
    }

    protected void k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public boolean m() {
        if (!FragmentManager.O0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean n(@NonNull Object obj) {
        return false;
    }

    public abstract Object o(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    ArrayList<String> q(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = arrayList.get(i11);
            arrayList2.add(ViewCompat.J(view));
            ViewCompat.J0(view, null);
        }
        return arrayList2;
    }

    public abstract void r(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);

    public abstract void s(@NonNull Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public void t(@NonNull Object obj, float f11) {
    }

    public abstract void u(@NonNull Object obj, @NonNull Rect rect);

    public abstract void v(@NonNull Object obj, View view);

    public void w(@NonNull Fragment fragment, @NonNull Object obj, @NonNull q5.e eVar, @NonNull Runnable runnable) {
        x(fragment, obj, eVar, null, runnable);
    }

    public void x(@NonNull Fragment fragment, @NonNull Object obj, @NonNull q5.e eVar, Runnable runnable, @NonNull Runnable runnable2) {
        runnable2.run();
    }

    void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = arrayList.get(i11);
            String strJ = ViewCompat.J(view2);
            arrayList4.add(strJ);
            if (strJ != null) {
                ViewCompat.J0(view2, null);
                String str = map.get(strJ);
                for (int i12 = 0; i12 < size; i12++) {
                    if (str.equals(arrayList3.get(i12))) {
                        ViewCompat.J0(arrayList2.get(i12), strJ);
                        break;
                    }
                }
            }
        }
        androidx.core.view.d0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList);
}
