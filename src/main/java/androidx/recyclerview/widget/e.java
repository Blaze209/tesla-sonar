package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r f13378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f13379b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f13380c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f13381d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f13382e = null;

    public e(@NonNull r rVar) {
        this.f13378a = rVar;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public void a(int i11, int i12, Object obj) {
        int i13;
        if (this.f13379b == 3) {
            int i14 = this.f13380c;
            int i15 = this.f13381d;
            if (i11 <= i14 + i15 && (i13 = i11 + i12) >= i14 && this.f13382e == obj) {
                this.f13380c = Math.min(i11, i14);
                this.f13381d = Math.max(i15 + i14, i13) - this.f13380c;
                return;
            }
        }
        e();
        this.f13380c = i11;
        this.f13381d = i12;
        this.f13382e = obj;
        this.f13379b = 3;
    }

    @Override // androidx.recyclerview.widget.r
    public void b(int i11, int i12) {
        int i13;
        if (this.f13379b == 1 && i11 >= (i13 = this.f13380c)) {
            int i14 = this.f13381d;
            if (i11 <= i13 + i14) {
                this.f13381d = i14 + i12;
                this.f13380c = Math.min(i11, i13);
                return;
            }
        }
        e();
        this.f13380c = i11;
        this.f13381d = i12;
        this.f13379b = 1;
    }

    @Override // androidx.recyclerview.widget.r
    public void c(int i11, int i12) {
        int i13;
        if (this.f13379b == 2 && (i13 = this.f13380c) >= i11 && i13 <= i11 + i12) {
            this.f13381d += i12;
            this.f13380c = i11;
        } else {
            e();
            this.f13380c = i11;
            this.f13381d = i12;
            this.f13379b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.r
    public void d(int i11, int i12) {
        e();
        this.f13378a.d(i11, i12);
    }

    public void e() {
        int i11 = this.f13379b;
        if (i11 == 0) {
            return;
        }
        if (i11 == 1) {
            this.f13378a.b(this.f13380c, this.f13381d);
        } else if (i11 == 2) {
            this.f13378a.c(this.f13380c, this.f13381d);
        } else if (i11 == 3) {
            this.f13378a.a(this.f13380c, this.f13381d, this.f13382e);
        }
        this.f13382e = null;
        this.f13379b = 0;
    }
}
