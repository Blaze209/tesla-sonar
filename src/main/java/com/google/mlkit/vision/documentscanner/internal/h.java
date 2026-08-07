package com.google.mlkit.vision.documentscanner.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzj;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzk;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzuk;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.sdkinternal.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f45129b = com.google.mlkit.common.sdkinternal.g.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45130a;

    private h(Context context) {
        this.f45130a = context;
    }

    public static h a(Context context) {
        return new h(context);
    }

    private static void e(String str, Exception exc) {
        if (Log.isLoggable("ResultHelper", 6)) {
            Log.e("ResultHelper", str, exc);
        }
    }

    final Task b(final int i11, final Intent intent) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f45129b.execute(new Runnable() { // from class: com.google.mlkit.vision.documentscanner.internal.g
            /* JADX WARN: Code duplicated, block: B:19:0x0056 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:6:0x000f, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004c, B:19:0x0056, B:23:0x0060, B:26:0x0068, B:27:0x0073), top: B:35:0x000f }] */
            /* JADX WARN: Code duplicated, block: B:21:0x005e  */
            /* JADX WARN: Code duplicated, block: B:22:0x005f  */
            /* JADX WARN: Code duplicated, block: B:23:0x0060 A[Catch: all -> 0x0052, PHI: r5
              0x0060: PHI (r5v3 android.net.Uri) = (r5v7 android.net.Uri), (r5v5 android.net.Uri) binds: [B:18:0x0054, B:22:0x005f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:6:0x000f, B:8:0x0031, B:10:0x0037, B:12:0x003d, B:15:0x004c, B:19:0x0056, B:23:0x0060, B:26:0x0068, B:27:0x0073), top: B:35:0x000f }] */
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                Uri uriD;
                int i12 = i11;
                Intent intent2 = intent;
                h hVar = this.f45125a;
                yx.d dVarD = null;
                dVarD = null;
                dVarD = null;
                Uri uri = null;
                dVarD = null;
                if (i12 == -1 && intent2 != null) {
                    try {
                        ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("uri_array_extra_result_image_uris");
                        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("string_array_extra_result_image_hashes");
                        Uri uri2 = (Uri) intent2.getParcelableExtra("uri_extra_result_pdf_uri");
                        int i13 = 0;
                        int intExtra = intent2.getIntExtra("int_extra_result_page_count", 0);
                        ArrayList arrayList = new ArrayList();
                        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                            int size = parcelableArrayListExtra.size();
                            while (true) {
                                if (i13 < size) {
                                    Uri uriD2 = hVar.d((Uri) parcelableArrayListExtra.get(i13), ".jpg");
                                    if (uriD2 != null) {
                                        arrayList.add(uriD2);
                                        i13++;
                                    }
                                } else if (uri2 == null) {
                                    dVarD = yx.d.d(arrayList, stringArrayListExtra, uri, intExtra);
                                } else {
                                    uriD = hVar.d(uri2, ".pdf");
                                    if (uriD == null) {
                                        uri = uriD;
                                        dVarD = yx.d.d(arrayList, stringArrayListExtra, uri, intExtra);
                                    }
                                }
                            }
                        } else if (uri2 == null) {
                            dVarD = yx.d.d(arrayList, stringArrayListExtra, uri, intExtra);
                        } else {
                            uriD = hVar.d(uri2, ".pdf");
                            if (uriD == null) {
                                uri = uriD;
                                dVarD = yx.d.d(arrayList, stringArrayListExtra, uri, intExtra);
                            }
                        }
                    } finally {
                        if (intent2 != null) {
                            hVar.c(intent2.getStringExtra("string_extra_session_id"));
                        }
                    }
                }
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (dVarD == null) {
                    taskCompletionSource2.setException(new IllegalStateException("Failed to handle result"));
                } else {
                    taskCompletionSource2.setResult(dVarD);
                }
                if (intent2 != null) {
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    final void c(final String str) {
        if (str == null) {
            return;
        }
        try {
            Tasks.await(new k(this.f45130a).doRead(TaskApiCall.builder().setFeatures(m.f45073u).run(new RemoteCall() { // from class: com.google.mlkit.vision.documentscanner.internal.j
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    int i11 = k.f45135d;
                    ((zzuk) ((l) obj).getService()).zzc(str);
                    ((TaskCompletionSource) obj2).setResult(null);
                }
            }).setMethodKey(24337).build()));
        } catch (InterruptedException | ExecutionException e11) {
            e("Failed to cleanup GMS Core cache", e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final Uri d(Uri uri, String str) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return null;
        }
        Context context = this.f45130a;
        File file = new File(context.getCacheDir(), "mlkit_docscan_ui_client");
        if (!file.exists()) {
            file.mkdir();
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtimeNanos).length() + 4);
        sb2.append(jElapsedRealtimeNanos);
        sb2.append(str);
        File file2 = new File(file, sb2.toString());
        try {
            InputStream inputStreamZza = zzk.zza(context, uri, (Objects.equals(context.getPackageName(), "com.google.android.gms") || !scheme.equals("content")) ? zzj.zzb : zzj.zza);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i11 = inputStreamZza.read(bArr);
                        if (i11 == -1) {
                            fileOutputStream.flush();
                            Uri uriFromFile = Uri.fromFile(file2);
                            fileOutputStream.close();
                            inputStreamZza.close();
                            return uriFromFile;
                        }
                        fileOutputStream.write(bArr, 0, i11);
                        if (inputStreamZza != null) {
                            try {
                                inputStreamZza.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStreamZza != null) {
                    inputStreamZza.close();
                }
                throw th5;
            }
        } catch (IOException e11) {
            e("Failed to save file to local: ".concat(uri.toString()), e11);
            return null;
        }
    }
}
