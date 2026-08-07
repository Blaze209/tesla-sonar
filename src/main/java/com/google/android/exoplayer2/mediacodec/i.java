package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40242a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40243b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40244c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f40245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40246e;

    public i() {
        int[] iArr = new int[16];
        this.f40245d = iArr;
        this.f40246e = iArr.length - 1;
    }

    private void c() {
        int[] iArr = this.f40245d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i11 = this.f40242a;
        int i12 = length2 - i11;
        System.arraycopy(iArr, i11, iArr2, 0, i12);
        System.arraycopy(this.f40245d, 0, iArr2, i12, i11);
        this.f40242a = 0;
        this.f40243b = this.f40244c - 1;
        this.f40245d = iArr2;
        this.f40246e = iArr2.length - 1;
    }

    public void a(int i11) {
        if (this.f40244c == this.f40245d.length) {
            c();
        }
        int i12 = (this.f40243b + 1) & this.f40246e;
        this.f40243b = i12;
        this.f40245d[i12] = i11;
        this.f40244c++;
    }

    public void b() {
        this.f40242a = 0;
        this.f40243b = -1;
        this.f40244c = 0;
    }

    public boolean d() {
        return this.f40244c == 0;
    }

    public int e() {
        int i11 = this.f40244c;
        if (i11 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f40245d;
        int i12 = this.f40242a;
        int i13 = iArr[i12];
        this.f40242a = (i12 + 1) & this.f40246e;
        this.f40244c = i11 - 1;
        return i13;
    }
}
