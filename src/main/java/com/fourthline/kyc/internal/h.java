package com.fourthline.kyc.internal;

import java.io.IOException;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24433a;

    public h(String text) {
        s.k(text, "text");
        this.f24433a = text;
    }

    private final boolean a() {
        return !t.y0(t.G1(this.f24433a, '\n', '\r'));
    }

    private final String b() {
        return b.a(this.f24433a);
    }

    @Override // com.fourthline.kyc.internal.a
    public void a(Appendable builder, String indent) throws IOException {
        s.k(builder, "builder");
        s.k(indent, "indent");
        if (a()) {
            builder.append(indent + b() + System.lineSeparator());
        }
    }

    public final Appendable a(Appendable builder) {
        s.k(builder, "builder");
        return builder.append(b());
    }
}
