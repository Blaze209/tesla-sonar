package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3205eA {
    public static /* synthetic */ C3163dA a(Context context, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 1000;
        }
        return a(context, j11);
    }

    private static final List b(String str) {
        return p013kotlin.collections.v.p(new InterfaceC3788rv.b.a.C0611b("1", "Agreement #1", str), new InterfaceC3788rv.b.a.C0611b("2", "Agreement #2", str), new InterfaceC3788rv.b.a.C0611b("3", "Agreement #3", str));
    }

    public static final C3163dA a(Context context, long j11) throws IOException {
        p013kotlin.jvm.internal.s.k(context, "context");
        File file = new File(ContextExtensionsKt.getFourthlineDirectory(context).getPath(), "stub_file_used_for_all_docs.pdf");
        file.createNewFile();
        file.deleteOnExit();
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(context.getResources().getIdentifier("qes_sample_doc", "raw", context.getPackageName()));
        try {
            p013kotlin.jvm.internal.s.h(inputStreamOpenRawResource);
            sn0.h.o(file, sn0.a.c(inputStreamOpenRawResource));
            jn0.h0 h0Var = jn0.h0.f84049a;
            sn0.b.a(inputStreamOpenRawResource, null);
            String absolutePath = file.getAbsolutePath();
            jn0.s.Companion companion = jn0.s.INSTANCE;
            p013kotlin.jvm.internal.s.h(absolutePath);
            return new C3163dA(jn0.s.b(new InterfaceC3788rv.b(new InterfaceC3788rv.b.a("+31 6******94", b(absolutePath), a(absolutePath), p013kotlin.collections.v.p(new InterfaceC3746qv.a.C0603a.C0604a("A1", "By checking this box, I confirm that my personal data as provided by me and included in the Activation Application, which I have read, are true and accurate and that I am aware that any false statements shall be punishable under applicable criminal law provisions.", 1), new InterfaceC3746qv.a.C0603a.C0604a("A2", "I am aware that the Service will be performed immediately and I therefore accept that I may not withdraw from the Contract, in accordance with the Consumer Code and the Terms and Conditions of the Service.", 1)), new InterfaceC3746qv.a.C0603a.c("numerical", 6)))), j11);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(inputStreamOpenRawResource, th2);
                throw th3;
            }
        }
    }

    private static final List a(String str) {
        return p013kotlin.collections.v.p(new InterfaceC3788rv.b.a.C0610a("tac.pdf", "Terms and Conditions", str, "/v1/tac.pdf", 2), new InterfaceC3788rv.b.a.C0610a("ps.pdf", "Privacy Statement", str, "/v1/ps.pdf", 2));
    }
}
