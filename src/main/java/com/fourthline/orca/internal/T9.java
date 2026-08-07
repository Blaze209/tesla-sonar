package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class T9 extends Bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T9 f27850a = new T9();

    private T9() {
        super(null, null, "nationality_not_matching", 3, null);
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof T9);
    }

    public int hashCode() {
        return 372256468;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "DocumentNationalityNotValid";
    }
}
