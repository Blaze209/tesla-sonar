package com.android.volley;

/* JADX INFO: loaded from: classes3.dex */
public class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f20177d;

    public c() {
        this(2500, 1, 1.0f);
    }

    @Override // com.android.volley.m
    public int a() {
        return this.f20175b;
    }

    @Override // com.android.volley.m
    public void b(VolleyError volleyError) throws VolleyError {
        this.f20175b++;
        int i11 = this.f20174a;
        this.f20174a = i11 + ((int) (i11 * this.f20177d));
        if (!d()) {
            throw volleyError;
        }
    }

    @Override // com.android.volley.m
    public int c() {
        return this.f20174a;
    }

    protected boolean d() {
        return this.f20175b <= this.f20176c;
    }

    public c(int i11, int i12, float f11) {
        this.f20174a = i11;
        this.f20176c = i12;
        this.f20177d = f11;
    }
}
