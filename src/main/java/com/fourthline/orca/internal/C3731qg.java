package com.fourthline.orca.internal;

import java.util.Map;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3731qg implements ro0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34834b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34835c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f34836d = p013kotlin.collections.v0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to0.f f34837a = to0.m.e("FontName", new to0.f[0], null, 4, null);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qg$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Map map) {
            p013kotlin.jvm.internal.s.k(map, "<set-?>");
            C3731qg.f34836d = map;
        }

        private a() {
        }
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f34837a;
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FontElement deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        String strR = decoder.r();
        OrcaTypographyDefinition c4041xp = (OrcaTypographyDefinition) f34836d.get(strR);
        if (c4041xp != null) {
            return new FontElement(c4041xp.getFamily(), w4.w.h(c4041xp.getSize()), 0L, 4, null);
        }
        throw new IllegalStateException(("FL Developer Error. Failed to deserialize font ('" + strR + "').").toString());
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, FontElement value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        throw new jn0.q(null, 1, null);
    }
}
