package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f23327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23328b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f23329c;

    class a implements Comparator<View> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            Integer num = 0;
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            if (viewZIndex == null) {
                viewZIndex = num;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            return viewZIndex.intValue() - (viewZIndex2 != null ? viewZIndex2 : 0).intValue();
        }
    }

    public k1(ViewGroup viewGroup) {
        this.f23327a = viewGroup;
    }

    public int a(int i11, int i12) {
        int[] iArr = this.f23329c;
        if (iArr != null && (i12 >= iArr.length || iArr[i12] >= i11)) {
            qk.a.K("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i11), Integer.valueOf(i12));
            e();
        }
        if (this.f23329c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i13 = 0; i13 < i11; i13++) {
                arrayList.add(this.f23327a.getChildAt(i13));
            }
            Collections.sort(arrayList, new a());
            this.f23329c = new int[i11];
            for (int i14 = 0; i14 < i11; i14++) {
                this.f23329c[i14] = this.f23327a.indexOfChild((View) arrayList.get(i14));
            }
        }
        return this.f23329c[i12];
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f23328b++;
        }
        this.f23329c = null;
    }

    public void c(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f23328b--;
        }
        this.f23329c = null;
    }

    public boolean d() {
        return this.f23328b > 0;
    }

    public void e() {
        this.f23328b = 0;
        for (int i11 = 0; i11 < this.f23327a.getChildCount(); i11++) {
            if (ViewGroupManager.getViewZIndex(this.f23327a.getChildAt(i11)) != null) {
                this.f23328b++;
            }
        }
        this.f23329c = null;
    }
}
