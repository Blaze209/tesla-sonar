package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3434jk extends Bo {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.jk$a */
    public static final class a extends AbstractC3434jk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f32795a = new a();

        private a() {
            super(null, null, "canceled", 3, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -823407659;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    public /* synthetic */ AbstractC3434jk(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public /* synthetic */ AbstractC3434jk(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, str2, null);
    }

    private AbstractC3434jk(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }
}
