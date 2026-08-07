package com.rncamerakit;

import android.annotation.SuppressLint;
import android.media.Image;
import android.util.Size;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B1\u0012\u001e\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR,\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/rncamerakit/j;", "Landroidx/camera/core/f$a;", "Lkotlin/Function2;", "", "Ltx/a;", "Landroid/util/Size;", "Ljn0/h0;", "onQRCodesDetected", "", "scanThrottleDelay", "<init>", "(Lwn0/p;J)V", "Landroidx/camera/core/n;", "image", "analyze", "(Landroidx/camera/core/n;)V", "a", "Lwn0/p;", "b", "J", "c", "lastBarcodeDetectedTime", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements androidx.camera.core.f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.p<List<? extends tx.a>, Size, h0> onQRCodesDetected;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long scanThrottleDelay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long lastBarcodeDetectedTime;

    /* JADX WARN: Multi-variable type inference failed */
    public j(wn0.p<? super List<? extends tx.a>, ? super Size, h0> onQRCodesDetected, long j11) {
        s.k(onQRCodesDetected, "onQRCodesDetected");
        this.onQRCodesDetected = onQRCodesDetected;
        this.scanThrottleDelay = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(j jVar, androidx.camera.core.n nVar, List list) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jVar.scanThrottleDelay;
        if (j11 > 0 && jCurrentTimeMillis - jVar.lastBarcodeDetectedTime < j11) {
            return h0.f84049a;
        }
        ArrayList arrayList = new ArrayList();
        s.h(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tx.a aVar = (tx.a) it.next();
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        if (!arrayList.isEmpty()) {
            jVar.lastBarcodeDetectedTime = jCurrentTimeMillis;
            jVar.onQRCodesDetected.invoke(arrayList, new Size(nVar.getWidth(), nVar.getHeight()));
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(wn0.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(androidx.camera.core.n nVar, Task it) {
        s.k(it, "it");
        nVar.close();
    }

    @Override // androidx.camera.core.f.a
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void analyze(final androidx.camera.core.n image) {
        s.k(image, "image");
        Image image2 = image.getImage();
        if (image2 == null) {
            return;
        }
        wx.a aVarC = wx.a.c(image2, image.z().d());
        s.j(aVarC, "fromMediaImage(...)");
        sx.a aVarA = sx.c.a();
        s.j(aVarA, "getClient(...)");
        Task<List<tx.a>> taskProcess = aVarA.process(aVarC);
        final wn0.l lVar = new wn0.l() { // from class: com.rncamerakit.g
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return j.d(this.f49013a, image, (List) obj);
            }
        };
        taskProcess.addOnSuccessListener(new OnSuccessListener() { // from class: com.rncamerakit.h
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                j.e(lVar, obj);
            }
        }).addOnCompleteListener(new OnCompleteListener() { // from class: com.rncamerakit.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                j.f(image, task);
            }
        });
    }
}
