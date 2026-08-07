package com.plaid.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class K6<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46387d;

    public K6() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 50; i11++) {
            arrayList.add(null);
        }
        this.f46384a = arrayList;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int i11 = this.f46386c;
        int i12 = this.f46385b;
        if (i11 <= i12) {
            int size = this.f46384a.size();
            while (i12 < size) {
                Object obj = this.f46384a.get(i12);
                if (obj != null) {
                    arrayList.add(obj);
                }
                i12++;
            }
            int i13 = this.f46386c;
            for (int i14 = 0; i14 < i13; i14++) {
                Object obj2 = this.f46384a.get(i14);
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        } else if (i12 <= i11) {
            while (true) {
                Object obj3 = this.f46384a.get(i12);
                if (obj3 != null) {
                    arrayList.add(obj3);
                }
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p013kotlin.collections.v.y0(a(), ", ", "{", "}", 0, null, null, 56, null));
        sb2.append(" [capacity=" + this.f46387d + ", H=" + this.f46385b + ", T=" + this.f46386c + "]");
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }
}
