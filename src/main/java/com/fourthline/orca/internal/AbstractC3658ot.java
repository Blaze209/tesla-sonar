package com.fourthline.orca.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3658ot extends Bo {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ot$a */
    public static final class a extends AbstractC3658ot {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34379a = new a();

        private a() {
            super(null, null, "download_failed", 3, null);
        }
    }

    public /* synthetic */ AbstractC3658ot(String str, Throwable th2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2, str2);
    }

    public /* synthetic */ AbstractC3658ot(String str, Throwable th2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2, str2, null);
    }

    private AbstractC3658ot(String str, Throwable th2, String str2) {
        super(str, th2, str2);
    }
}
