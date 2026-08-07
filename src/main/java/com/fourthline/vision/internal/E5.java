package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class E5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37670b;

    public E5(int i11, int i12) {
        this.f37669a = i11;
        this.f37670b = i12;
    }

    public static /* synthetic */ E5 copy$default(E5 e11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = e11.f37669a;
        }
        if ((i13 & 2) != 0) {
            i12 = e11.f37670b;
        }
        return e11.copy(i11, i12);
    }

    public final int component1() {
        return this.f37669a;
    }

    public final int component2() {
        return this.f37670b;
    }

    public final E5 copy(int i11, int i12) {
        return new E5(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E5)) {
            return false;
        }
        E5 e11 = (E5) obj;
        return this.f37669a == e11.f37669a && this.f37670b == e11.f37670b;
    }

    public final int getHeight() {
        return this.f37670b;
    }

    public final int getWidth() {
        return this.f37669a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f37669a) * 31) + Integer.hashCode(this.f37670b);
    }

    public String toString() {
        return "Size(width=" + this.f37669a + ", height=" + this.f37670b + ")";
    }
}
