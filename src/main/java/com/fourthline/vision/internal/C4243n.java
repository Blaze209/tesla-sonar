package com.fourthline.vision.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4243n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f38638b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f38639a;

    /* JADX INFO: renamed from: com.fourthline.vision.internal.n$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4243n() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final int calculateBitrate(int i11, int i12, int i13) {
        Integer num = this.f38639a;
        return num != null ? num.intValue() : (int) (i13 * 0.25f * i11 * i12 * 0.2f);
    }

    public C4243n(Integer num) {
        this.f38639a = num;
    }

    public /* synthetic */ C4243n(Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num);
    }
}
