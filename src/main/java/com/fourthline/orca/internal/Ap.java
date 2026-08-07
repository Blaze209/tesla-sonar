package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class Ap implements InterfaceC3772rf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25020a;

    public Ap(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f25020a = context;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3772rf
    public void a(String path) {
        p013kotlin.jvm.internal.s.k(path, "path");
        Context context = this.f25020a;
        Uri uriForFile = FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".fourthline.provider", new File(path));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.setType("application/pdf");
        this.f25020a.startActivity(Intent.createChooser(intent, null));
    }
}
