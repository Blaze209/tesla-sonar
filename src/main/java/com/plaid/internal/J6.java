package com.plaid.internal;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class J6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedInputStream f46373a;

    public J6(InputStream inputStream) {
        this.f46373a = new BufferedInputStream(inputStream);
    }

    public final String a() throws IOException {
        int i11;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            i11 = this.f46373a.read();
            if (i11 == -1 || i11 == 10) {
                break;
            }
            if (i11 != 13) {
                sb2.append((char) i11);
            }
        }
        if (i11 == -1 && sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }
}
