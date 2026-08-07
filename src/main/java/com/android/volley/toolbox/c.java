package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f20232e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<byte[]> f20233a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<byte[]> f20234b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20235c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20236d;

    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public c(int i11) {
        this.f20236d = i11;
    }

    private synchronized void c() {
        while (this.f20235c > this.f20236d) {
            byte[] bArrRemove = this.f20233a.remove(0);
            this.f20234b.remove(bArrRemove);
            this.f20235c -= bArrRemove.length;
        }
    }

    public synchronized byte[] a(int i11) {
        for (int i12 = 0; i12 < this.f20234b.size(); i12++) {
            byte[] bArr = this.f20234b.get(i12);
            if (bArr.length >= i11) {
                this.f20235c -= bArr.length;
                this.f20234b.remove(i12);
                this.f20233a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i11];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f20236d) {
                this.f20233a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f20234b, bArr, f20232e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f20234b.add(iBinarySearch, bArr);
                this.f20235c += bArr.length;
                c();
            }
        }
    }
}
