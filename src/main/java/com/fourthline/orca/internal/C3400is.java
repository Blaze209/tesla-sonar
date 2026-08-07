package com.fourthline.orca.internal;

import android.net.Uri;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3400is implements InterfaceC3858tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3497l3 f32584a;

    public C3400is(C3497l3 decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        this.f32584a = decoder;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3858tf
    public InterfaceC3815sf a(Uri uri) throws FileNotFoundException {
        boolean z11;
        p013kotlin.jvm.internal.s.k(uri, "uri");
        String strA = this.f32584a.a(uri);
        EnumC3358hs enumC3358hs = p013kotlin.jvm.internal.s.f(strA, "application/pdf") ? EnumC3358hs.PDF : EnumC3358hs.IMAGE;
        List listP = p013kotlin.collections.v.p(ClipboardModule.MIMETYPE_PNG, ClipboardModule.MIMETYPE_JPEG, "application/pdf");
        if (!(listP instanceof Collection) || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
                if (p013kotlin.jvm.internal.s.f((String) it.next(), strA)) {
                    z11 = false;
                    break;
                }
            }
        } else {
            z11 = true;
            break;
        }
        Long lB = this.f32584a.b(uri);
        if (lB == null || (lB.longValue() / 1024.0d) / 1024.0d <= 10.0d) {
            return z11 ? new InterfaceC3815sf.b(enumC3358hs) : new InterfaceC3815sf.c(enumC3358hs);
        }
        return new InterfaceC3815sf.a(enumC3358hs);
    }
}
