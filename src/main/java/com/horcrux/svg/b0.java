package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Path> f45338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[][] f45339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f45340c;

    b0(Paint paint) {
        ArrayList<Path> arrayList = new ArrayList<>();
        this.f45338a = arrayList;
        this.f45339b = new int[256][];
        this.f45340c = paint;
        arrayList.add(new Path());
    }

    private int a(char c11) {
        int[] iArr = this.f45339b[c11 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c11 & 255];
    }

    Path b(char c11, String str) {
        Path path;
        int iA = a(c11);
        if (iA != 0) {
            path = this.f45338a.get(iA);
        } else {
            Path path2 = new Path();
            this.f45340c.getTextPath(str, 0, 1, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, path2);
            int[][] iArr = this.f45339b;
            int i11 = c11 >> '\b';
            int[] iArr2 = iArr[i11];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i11] = iArr2;
            }
            iArr2[c11 & 255] = this.f45338a.size();
            this.f45338a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
