package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.ActivityResultRegistry;
import androidx.p002activity.result.contract.ActivityResultContracts$CreateDocument;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class B6 implements InterfaceC3730qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f25061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f25063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f25064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ActivityResultLauncher f25065e;

    public B6(ContentResolver contentResolver, ActivityResultRegistry registry) {
        p013kotlin.jvm.internal.s.k(contentResolver, "contentResolver");
        p013kotlin.jvm.internal.s.k(registry, "registry");
        this.f25061a = contentResolver;
        this.f25062b = "application/pdf";
        this.f25063c = InterfaceC3730qf.class.getSimpleName();
        this.f25065e = registry.l("downloadDocument", new ActivityResultContracts$CreateDocument("application/pdf"), new ActivityResultCallback() { // from class: com.fourthline.orca.internal.q00
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                B6.a(this.f34698a, (Uri) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B6 b11, Uri uri) {
        File file;
        if (uri == null || (file = b11.f25064d) == null) {
            return;
        }
        b11.a(file, uri);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3730qf
    public void a(String suggestedFileName, String originFilePath) {
        p013kotlin.jvm.internal.s.k(suggestedFileName, "suggestedFileName");
        p013kotlin.jvm.internal.s.k(originFilePath, "originFilePath");
        this.f25064d = new File(originFilePath);
        this.f25065e.b(suggestedFileName);
    }

    private final void a(File file, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f25061a.openFileDescriptor(uri, "w");
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        fileOutputStream.write(sn0.h.i(file));
                        jn0.h0 h0Var = jn0.h0.f84049a;
                        sn0.b.a(fileOutputStream, null);
                        sn0.b.a(parcelFileDescriptorOpenFileDescriptor, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            sn0.b.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        sn0.b.a(parcelFileDescriptorOpenFileDescriptor, th4);
                        throw th5;
                    }
                }
            }
        } catch (FileNotFoundException | IOException unused) {
        }
    }
}
