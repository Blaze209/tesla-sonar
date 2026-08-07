package com.facebook.react.uimanager;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public class j1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Comparator<j1> f23317c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23319b;

    class a implements Comparator<j1> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(j1 j1Var, j1 j1Var2) {
            return j1Var.f23319b - j1Var2.f23319b;
        }
    }

    public j1(int i11, int i12) {
        this.f23318a = i11;
        this.f23319b = i12;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f23319b == j1Var.f23319b && this.f23318a == j1Var.f23318a) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "[" + this.f23318a + ", " + this.f23319b + "]";
    }
}
