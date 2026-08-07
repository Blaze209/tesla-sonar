package com.plaid.internal;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@jn0.e
public final class H5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46335b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile H5 f46336c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46337a;

    public static final class a {
    }

    public H5(Context app) {
        p013kotlin.jvm.internal.s.k(app, "app");
        this.f46337a = app.getApplicationContext();
    }

    public final void a(String fileName, String data) throws IOException {
        p013kotlin.jvm.internal.s.k(fileName, "fileName");
        p013kotlin.jvm.internal.s.k(data, "data");
        File parentDirectory = this.f46337a.getFilesDir();
        p013kotlin.jvm.internal.s.j(parentDirectory, "getFilesDir(...)");
        p013kotlin.jvm.internal.s.k(parentDirectory, "parentDirectory");
        p013kotlin.jvm.internal.s.k(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        } else {
            file.createNewFile();
        }
        sn0.h.q(file, data, null, 2, null);
    }

    public final void a() {
        p013kotlin.jvm.internal.s.k("plaid_link_state", "fileName");
        File file = new File(this.f46337a.getFilesDir().toString(), "plaid_link_state");
        if (file.exists()) {
            file.delete();
        }
    }
}
