package hu;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements gu.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f73636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fu.f f73637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f73638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f73639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fu.t f73640e;

    public e(Context context, Executor executor, g gVar, fu.f fVar, fu.t tVar) {
        this.f73636a = context;
        this.f73637b = fVar;
        this.f73638c = gVar;
        this.f73639d = executor;
        this.f73640e = tVar;
    }

    static /* bridge */ /* synthetic */ void c(e eVar, List list, gu.e eVar2) {
        Integer numE = eVar.e(list);
        if (numE == null) {
            return;
        }
        if (numE.intValue() == 0) {
            eVar2.zzc();
        } else {
            eVar2.zzb(numE.intValue());
        }
    }

    static /* bridge */ /* synthetic */ void d(e eVar, gu.e eVar2) {
        try {
            if (fu.a.e(a0.a(eVar.f73636a))) {
                Log.i("SplitCompat", "Splits installed.");
                eVar2.zza();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                eVar2.zzb(-12);
            }
        } catch (Exception e11) {
            Log.e("SplitCompat", "Error emulating splits.", e11);
            eVar2.zzb(-12);
        }
    }

    private final Integer e(List list) {
        FileLock fileLockTryLock;
        int i11;
        try {
            FileChannel channel = new RandomAccessFile(this.f73637b.d(), "rw").getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    try {
                        Log.i("SplitCompat", "Copying splits.");
                        Iterator it = list.iterator();
                        while (true) {
                            i11 = 0;
                            if (!it.hasNext()) {
                                break;
                            }
                            Intent intent = (Intent) it.next();
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f73636a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            try {
                                File fileE = this.f73637b.e(stringExtra);
                                if ((fileE.exists() && fileE.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileE.exists()) {
                                    if (!this.f73637b.g(stringExtra).exists()) {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                while (true) {
                                                    int i12 = bufferedInputStream.read(bArr);
                                                    if (i12 <= 0) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i12);
                                                    try {
                                                        bufferedInputStream.close();
                                                    } catch (Throwable th2) {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                    }
                                                    throw th;
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                            } catch (Throwable th3) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable th4) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                }
                                                throw th3;
                                            }
                                        } catch (Throwable th5) {
                                            bufferedInputStream.close();
                                            throw th5;
                                        }
                                    }
                                }
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (Throwable th6) {
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    try {
                                        assetFileDescriptorOpenAssetFileDescriptor.close();
                                    } catch (Throwable th7) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                    }
                                }
                                throw th6;
                            }
                            Log.e("SplitCompat", "Error locking files.", e);
                            return -13;
                        }
                        Log.i("SplitCompat", "Splits copied.");
                        try {
                            File[] fileArrListFiles = this.f73637b.b().listFiles();
                            try {
                                if (this.f73638c.c(fileArrListFiles) && this.f73638c.a(fileArrListFiles)) {
                                    try {
                                        File[] fileArrListFiles2 = this.f73637b.b().listFiles();
                                        Arrays.sort(fileArrListFiles2);
                                        int length = fileArrListFiles2.length;
                                        while (true) {
                                            length--;
                                            if (length < 0) {
                                                break;
                                            }
                                            fu.f.m(fileArrListFiles2[length]);
                                            File file = fileArrListFiles2[length];
                                            file.renameTo(this.f73637b.f(file));
                                        }
                                        Log.i("SplitCompat", "Splits verified.");
                                    } catch (IOException e11) {
                                        Log.e("SplitCompat", "Cannot write verified split.", e11);
                                        i11 = -13;
                                    }
                                } else {
                                    Log.e("SplitCompat", "Split verification failed.");
                                    i11 = -11;
                                }
                            } catch (Exception e12) {
                                Log.e("SplitCompat", "Error verifying splits.", e12);
                            }
                        } catch (IOException e13) {
                            Log.e("SplitCompat", "Cannot access directory for unverified splits.", e13);
                        }
                    } catch (Exception e14) {
                        Log.e("SplitCompat", "Error copying splits.", e14);
                    }
                    numValueOf = Integer.valueOf(i11);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th8) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th9) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th8, th9);
                    }
                }
                throw th8;
            }
        } catch (Exception e15) {
            Log.e("SplitCompat", "Error locking files.", e15);
            return -13;
        }
    }

    @Override // gu.g
    public final void a(List list, gu.e eVar) {
        if (!fu.a.f()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f73639d.execute(new d(this, list, eVar));
    }
}
