package com.fourthline.vision.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class V5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f38025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U5 f38026b;

    public V5(Integer num, U5 codec) {
        p013kotlin.jvm.internal.s.k(codec, "codec");
        this.f38025a = num;
        this.f38026b = codec;
    }

    public static /* synthetic */ V5 copy$default(V5 v11, Integer num, U5 u11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = v11.f38025a;
        }
        if ((i11 & 2) != 0) {
            u11 = v11.f38026b;
        }
        return v11.copy(num, u11);
    }

    public final Integer component1() {
        return this.f38025a;
    }

    public final U5 component2() {
        return this.f38026b;
    }

    public final V5 copy(Integer num, U5 codec) {
        p013kotlin.jvm.internal.s.k(codec, "codec");
        return new V5(num, codec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V5)) {
            return false;
        }
        V5 v11 = (V5) obj;
        return p013kotlin.jvm.internal.s.f(this.f38025a, v11.f38025a) && this.f38026b == v11.f38026b;
    }

    public final U5 getCodec() {
        return this.f38026b;
    }

    public final Integer getTargetBitRate() {
        return this.f38025a;
    }

    public int hashCode() {
        Integer num = this.f38025a;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.f38026b.hashCode();
    }

    public String toString() {
        return "VideoConfig(targetBitRate=" + this.f38025a + ", codec=" + this.f38026b + ")";
    }

    public /* synthetic */ V5(Integer num, U5 u11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, u11);
    }
}
