package com.fourthline.orca.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3328h4 implements ro0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32188b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32189c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Map f32190d = p013kotlin.collections.v0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to0.f f32191a = to0.m.d("ColorElement", new to0.f[0], new wn0.l() { // from class: com.fourthline.orca.internal.r21
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return C3328h4.a((to0.a) obj);
        }
    });

    /* JADX INFO: renamed from: com.fourthline.orca.internal.h4$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Map map) {
            p013kotlin.jvm.internal.s.k(map, "<set-?>");
            C3328h4.f32190d = map;
        }

        private a() {
        }
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f32191a;
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ColorElement deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        if (!(decoder instanceof wo0.h)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of ColorElement.");
        }
        JsonElement jsonElementY = ((wo0.h) decoder).y();
        if (!(jsonElementY instanceof JsonObject)) {
            try {
                return a(wo0.j.p(jsonElementY).getContent());
            } catch (Exception unused) {
                throw new IllegalStateException("FL Developer Error. Failed to deserialize color.");
            }
        }
        JsonObject jsonObject = (JsonObject) jsonElementY;
        String content = wo0.j.p(Ki.a(jsonObject, "light")).getContent();
        String content2 = wo0.j.p(Ki.a(jsonObject, "dark")).getContent();
        return new ColorElement(a(content).getLight(), a(content2).getDark(), null);
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, ColorElement value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        throw new jn0.q(null, 1, null);
    }

    private final ColorElement a(String str) {
        if (p013kotlin.text.t.b0(str, "#", false, 2, null)) {
            long jA = To.a(str);
            return new ColorElement(jA, jA, null);
        }
        OrcaPaletteColor orcaPaletteColor = (OrcaPaletteColor) f32190d.get(str);
        if (orcaPaletteColor != null) {
            return new ColorElement(orcaPaletteColor.getLight(), orcaPaletteColor.getDark(), null);
        }
        throw new IllegalStateException(("FL Developer Error. Failed to deserialize color ('" + str + "').").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(to0.a buildClassSerialDescriptor) {
        p013kotlin.jvm.internal.s.k(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> listM = p013kotlin.collections.v.m();
        vo0.z1 z1Var = vo0.z1.f119730a;
        buildClassSerialDescriptor.a("light", z1Var.getDescriptor(), listM, false);
        buildClassSerialDescriptor.a("dark", z1Var.getDescriptor(), p013kotlin.collections.v.m(), false);
        return jn0.h0.f84049a;
    }
}
