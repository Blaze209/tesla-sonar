package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.c4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4165c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f38196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38198d;

    public C4165c4(int i11, int i12, int i13, int i14) {
        this.f38195a = i11;
        this.f38196b = i12;
        this.f38197c = i13;
        this.f38198d = i14;
    }

    public static /* synthetic */ C4165c4 copy$default(C4165c4 c4165c4, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = c4165c4.f38195a;
        }
        if ((i15 & 2) != 0) {
            i12 = c4165c4.f38196b;
        }
        if ((i15 & 4) != 0) {
            i13 = c4165c4.f38197c;
        }
        if ((i15 & 8) != 0) {
            i14 = c4165c4.f38198d;
        }
        return c4165c4.copy(i11, i12, i13, i14);
    }

    public final int area() {
        return width() * height();
    }

    public final int centerX() {
        return (this.f38195a + this.f38197c) >> 1;
    }

    public final int centerY() {
        return (this.f38196b + this.f38198d) >> 1;
    }

    public final int component1() {
        return this.f38195a;
    }

    public final int component2() {
        return this.f38196b;
    }

    public final int component3() {
        return this.f38197c;
    }

    public final int component4() {
        return this.f38198d;
    }

    public final boolean contains(C4165c4 rectangle) {
        int i11;
        int i12;
        p013kotlin.jvm.internal.s.k(rectangle, "rectangle");
        int i13 = this.f38195a;
        int i14 = this.f38197c;
        return i13 < i14 && (i11 = this.f38196b) < (i12 = this.f38198d) && i13 <= rectangle.f38195a && i11 <= rectangle.f38196b && i14 >= rectangle.f38197c && i12 >= rectangle.f38198d;
    }

    public final C4165c4 copy(int i11, int i12, int i13, int i14) {
        return new C4165c4(i11, i12, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4165c4)) {
            return false;
        }
        C4165c4 c4165c4 = (C4165c4) obj;
        return this.f38195a == c4165c4.f38195a && this.f38196b == c4165c4.f38196b && this.f38197c == c4165c4.f38197c && this.f38198d == c4165c4.f38198d;
    }

    public final int getBottom() {
        return this.f38198d;
    }

    public final int getLeft() {
        return this.f38195a;
    }

    public final int getRight() {
        return this.f38197c;
    }

    public final int getTop() {
        return this.f38196b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f38195a) * 31) + Integer.hashCode(this.f38196b)) * 31) + Integer.hashCode(this.f38197c)) * 31) + Integer.hashCode(this.f38198d);
    }

    public final int height() {
        return this.f38198d - this.f38196b;
    }

    public String toString() {
        return "Rectangle(left = " + this.f38195a + ", top = " + this.f38196b + ", right = " + this.f38197c + ", bottom = " + this.f38198d + ")";
    }

    public final C4165c4 translate(int i11, int i12) {
        return new C4165c4(this.f38195a + i11, this.f38196b + i12, this.f38197c + i11, this.f38198d + i12);
    }

    public final int width() {
        return this.f38197c - this.f38195a;
    }
}
