package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4134zw implements ro0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f37370b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f37371c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f37372d = p013kotlin.collections.v0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to0.f f37373a = to0.m.e("RadiusElement", new to0.f[0], null, 4, null);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.zw$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Map map) {
            p013kotlin.jvm.internal.s.k(map, "<set-?>");
            C4134zw.f37372d = map;
        }

        private a() {
        }
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f37373a;
    }

    @Override // ro0.q
    public /* bridge */ /* synthetic */ void serialize(uo0.f fVar, Object obj) {
        a(fVar, ((Number) obj).intValue());
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        String strR = decoder.r();
        Integer num = (Integer) f37372d.get(strR);
        if (num != null) {
            return num;
        }
        throw new IllegalStateException(("FL Developer Error. Failed to deserialize radius ('" + strR + "').").toString());
    }

    public void a(uo0.f encoder, int i11) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        throw new jn0.q(null, 1, null);
    }
}
